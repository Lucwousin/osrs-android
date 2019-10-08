package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;

public class CollapsingToolbarLayout extends FrameLayout {
    public class LayoutParams extends FrameLayout$LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(Context arg4, AttributeSet arg5) {
            super(arg4, arg5);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray v4 = arg4.obtainStyledAttributes(arg5, R$styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = v4.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.setParallaxMultiplier(v4.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            v4.recycle();
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int arg1, int arg2, int arg3) {
            super(arg1, arg2, arg3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(value=19) public LayoutParams(FrameLayout$LayoutParams arg1) {
            super(arg1);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int arg1) {
            this.collapseMode = arg1;
        }

        public void setParallaxMultiplier(float arg1) {
            this.parallaxMult = arg1;
        }
    }

    class OffsetUpdateListener implements OnOffsetChangedListener {
        OffsetUpdateListener(CollapsingToolbarLayout arg1) {
            CollapsingToolbarLayout.this = arg1;
            super();
        }

        public void onOffsetChanged(AppBarLayout arg8, int arg9) {
            CollapsingToolbarLayout.this.currentOffset = arg9;
            int v8 = CollapsingToolbarLayout.this.lastInsets != null ? CollapsingToolbarLayout.this.lastInsets.getSystemWindowInsetTop() : 0;
            int v1 = CollapsingToolbarLayout.this.getChildCount();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                View v3 = CollapsingToolbarLayout.this.getChildAt(v2);
                ViewGroup$LayoutParams v4 = v3.getLayoutParams();
                ViewOffsetHelper v5 = CollapsingToolbarLayout.getViewOffsetHelper(v3);
                switch(((LayoutParams)v4).collapseMode) {
                    case 1: {
                        v5.setTopAndBottomOffset(MathUtils.clamp(-arg9, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(v3)));
                        break;
                    }
                    case 2: {
                        v5.setTopAndBottomOffset(Math.round((((float)(-arg9))) * ((LayoutParams)v4).parallaxMult));
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }

            CollapsingToolbarLayout.this.updateScrimVisibility();
            if(CollapsingToolbarLayout.this.statusBarScrim != null && v8 > 0) {
                ViewCompat.postInvalidateOnAnimation(CollapsingToolbarLayout.this);
            }

            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction((((float)Math.abs(arg9))) / (((float)(CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this) - v8))));
        }
    }

    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    WindowInsetsCompat lastInsets;
    private OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    Drawable statusBarScrim;
    private final Rect tmpRect;
    private Toolbar toolbar;
    private View toolbarDirectChild;
    private int toolbarId;

    public CollapsingToolbarLayout(Context arg2) {
        this(arg2, null);
    }

    public CollapsingToolbarLayout(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public CollapsingToolbarLayout(Context arg11, AttributeSet arg12, int arg13) {
        super(arg11, arg12, arg13);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        int v1 = -1;
        this.scrimVisibleHeightTrigger = v1;
        this.collapsingTextHelper = new CollapsingTextHelper(((View)this));
        this.collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        TypedArray v11 = ThemeEnforcement.obtainStyledAttributes(arg11, arg12, R$styleable.CollapsingToolbarLayout, arg13, R$style.Widget_Design_CollapsingToolbar, new int[0]);
        this.collapsingTextHelper.setExpandedTextGravity(v11.getInt(R$styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
        this.collapsingTextHelper.setCollapsedTextGravity(v11.getInt(R$styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
        int v12 = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = v12;
        this.expandedMarginEnd = v12;
        this.expandedMarginTop = v12;
        this.expandedMarginStart = v12;
        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }

        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }

        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }

        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }

        this.collapsingTitleEnabled = v11.getBoolean(R$styleable.CollapsingToolbarLayout_titleEnabled, true);
        this.setTitle(v11.getText(R$styleable.CollapsingToolbarLayout_title));
        this.collapsingTextHelper.setExpandedTextAppearance(R$style.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.collapsingTextHelper.setCollapsedTextAppearance(androidx.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.collapsingTextHelper.setExpandedTextAppearance(v11.getResourceId(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }

        if(v11.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.collapsingTextHelper.setCollapsedTextAppearance(v11.getResourceId(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }

        this.scrimVisibleHeightTrigger = v11.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, v1);
        this.scrimAnimationDuration = ((long)v11.getInt(R$styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600));
        this.setContentScrim(v11.getDrawable(R$styleable.CollapsingToolbarLayout_contentScrim));
        this.setStatusBarScrim(v11.getDrawable(R$styleable.CollapsingToolbarLayout_statusBarScrim));
        this.toolbarId = v11.getResourceId(R$styleable.CollapsingToolbarLayout_toolbarId, v1);
        v11.recycle();
        this.setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(((View)this), new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View arg1, WindowInsetsCompat arg2) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(arg2);
            }
        });
    }

    private void animateScrim(int arg5) {
        this.ensureToolbar();
        if(this.scrimAnimator == null) {
            this.scrimAnimator = new ValueAnimator();
            this.scrimAnimator.setDuration(this.scrimAnimationDuration);
            ValueAnimator v0 = this.scrimAnimator;
            TimeInterpolator v1 = arg5 > this.scrimAlpha ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            v0.setInterpolator(v1);
            this.scrimAnimator.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator arg2) {
                    CollapsingToolbarLayout.this.setScrimAlpha(arg2.getAnimatedValue().intValue());
                }
            });
        }
        else {
            if(!this.scrimAnimator.isRunning()) {
                goto label_26;
            }

            this.scrimAnimator.cancel();
        }

    label_26:
        this.scrimAnimator.setIntValues(new int[]{this.scrimAlpha, arg5});
        this.scrimAnimator.start();
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    public void draw(Canvas arg7) {
        super.draw(arg7);
        this.ensureToolbar();
        if(this.toolbar == null && this.contentScrim != null && this.scrimAlpha > 0) {
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(arg7);
        }

        if((this.collapsingTitleEnabled) && (this.drawCollapsingTitle)) {
            this.collapsingTextHelper.draw(arg7);
        }

        if(this.statusBarScrim != null && this.scrimAlpha > 0) {
            int v0 = this.lastInsets != null ? this.lastInsets.getSystemWindowInsetTop() : 0;
            if(v0 <= 0) {
                return;
            }

            this.statusBarScrim.setBounds(0, -this.currentOffset, this.getWidth(), v0 - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(arg7);
        }
    }

    protected boolean drawChild(Canvas arg5, View arg6, long arg7) {
        int v0;
        boolean v1 = true;
        if(this.contentScrim == null || this.scrimAlpha <= 0 || !this.isToolbarChild(arg6)) {
            v0 = 0;
        }
        else {
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(arg5);
            v0 = 1;
        }

        if(!super.drawChild(arg5, arg6, arg7)) {
            if(v0 != 0) {
            }
            else {
                v1 = false;
            }
        }

        return v1;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] v0 = this.getDrawableState();
        Drawable v1 = this.statusBarScrim;
        int v2 = 0;
        if(v1 != null && (v1.isStateful())) {
            v2 = 0 | v1.setState(v0);
        }

        v1 = this.contentScrim;
        if(v1 != null && (v1.isStateful())) {
            v2 |= v1.setState(v0);
        }

        if(this.collapsingTextHelper != null) {
            v2 |= this.collapsingTextHelper.setState(v0);
        }

        if(v2 != 0) {
            this.invalidate();
        }
    }

    private void ensureToolbar() {
        View v0_1;
        if(!this.refreshToolbar) {
            return;
        }

        Toolbar v0 = null;
        this.toolbar = v0;
        this.toolbarDirectChild = ((View)v0);
        if(this.toolbarId != -1) {
            this.toolbar = this.findViewById(this.toolbarId);
            if(this.toolbar != null) {
                this.toolbarDirectChild = this.findDirectChild(this.toolbar);
            }
        }

        if(this.toolbar == null) {
            int v1 = this.getChildCount();
            int v3 = 0;
            while(v3 < v1) {
                View v4 = this.getChildAt(v3);
                if((v4 instanceof Toolbar)) {
                    v0_1 = v4;
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }

            this.toolbar = ((Toolbar)v0_1);
        }

        this.updateDummyView();
        this.refreshToolbar = false;
    }

    private View findDirectChild(View arg3) {
        ViewParent v3;
        ViewParent v0;
        for(v0 = arg3.getParent(); (((CollapsingToolbarLayout)v0)) != this; v0 = v0.getParent()) {
            if(v0 == null) {
                break;
            }

            if((v0 instanceof View)) {
                v3 = v0;
            }
        }

        return ((View)v3);
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    protected FrameLayout$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    public FrameLayout$LayoutParams generateLayoutParams(AttributeSet arg3) {
        return new LayoutParams(this.getContext(), arg3);
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg1) {
        return this.generateLayoutParams(arg1);
    }

    protected FrameLayout$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        return new LayoutParams(arg2);
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    @NonNull public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @Nullable public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    @NonNull public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    private static int getHeightWithMargins(@NonNull View arg2) {
        ViewGroup$LayoutParams v0 = arg2.getLayoutParams();
        if((v0 instanceof ViewGroup$MarginLayoutParams)) {
            return arg2.getHeight() + ((ViewGroup$MarginLayoutParams)v0).topMargin + ((ViewGroup$MarginLayoutParams)v0).bottomMargin;
        }

        return arg2.getHeight();
    }

    final int getMaxOffsetForPinChild(View arg4) {
        return this.getHeight() - CollapsingToolbarLayout.getViewOffsetHelper(arg4).getLayoutTop() - arg4.getHeight() - arg4.getLayoutParams().bottomMargin;
    }

    int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        if(this.scrimVisibleHeightTrigger >= 0) {
            return this.scrimVisibleHeightTrigger;
        }

        int v0 = this.lastInsets != null ? this.lastInsets.getSystemWindowInsetTop() : 0;
        int v1 = ViewCompat.getMinimumHeight(((View)this));
        if(v1 > 0) {
            return Math.min(v1 * 2 + v0, this.getHeight());
        }

        return this.getHeight() / 3;
    }

    @Nullable public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable public CharSequence getTitle() {
        CharSequence v0 = this.collapsingTitleEnabled ? this.collapsingTextHelper.getText() : null;
        return v0;
    }

    static ViewOffsetHelper getViewOffsetHelper(View arg2) {
        ViewOffsetHelper v0_1;
        Object v0 = arg2.getTag(R$id.view_offset_helper);
        if(v0 == null) {
            v0_1 = new ViewOffsetHelper(arg2);
            arg2.setTag(R$id.view_offset_helper, v0_1);
        }

        return v0_1;
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    private boolean isToolbarChild(View arg4) {
        boolean v1 = false;
        if(this.toolbarDirectChild == null || this.toolbarDirectChild == this) {
            if(arg4 == this.toolbar) {
            label_12:
                v1 = true;
            }
        }
        else if(arg4 == this.toolbarDirectChild) {
            goto label_12;
        }

        return v1;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent v0 = this.getParent();
        if((v0 instanceof AppBarLayout)) {
            ViewCompat.setFitsSystemWindows(((View)this), ViewCompat.getFitsSystemWindows(v0));
            if(this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener(this);
            }

            ((AppBarLayout)v0).addOnOffsetChangedListener(this.onOffsetChangedListener);
            ViewCompat.requestApplyInsets(((View)this));
        }
    }

    protected void onDetachedFromWindow() {
        ViewParent v0 = this.getParent();
        if(this.onOffsetChangedListener != null && ((v0 instanceof AppBarLayout))) {
            ((AppBarLayout)v0).removeOnOffsetChangedListener(this.onOffsetChangedListener);
        }

        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        Toolbar v8_2;
        int v1;
        int v8;
        super.onLayout(arg8, arg9, arg10, arg11, arg12);
        int v0 = 0;
        if(this.lastInsets != null) {
            v8 = this.lastInsets.getSystemWindowInsetTop();
            v1 = this.getChildCount();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                View v3 = this.getChildAt(v2);
                if(!ViewCompat.getFitsSystemWindows(v3) && v3.getTop() < v8) {
                    ViewCompat.offsetTopAndBottom(v3, v8);
                }
            }
        }

        if((this.collapsingTitleEnabled) && this.dummyView != null) {
            v1 = 1;
            arg8 = !ViewCompat.isAttachedToWindow(this.dummyView) || this.dummyView.getVisibility() != 0 ? false : true;
            this.drawCollapsingTitle = arg8;
            if(!this.drawCollapsingTitle) {
                goto label_100;
            }

            if(ViewCompat.getLayoutDirection(((View)this)) == 1) {
            }
            else {
                v1 = 0;
            }

            if(this.toolbarDirectChild != null) {
                View v8_1 = this.toolbarDirectChild;
            }
            else {
                v8_2 = this.toolbar;
            }

            v8 = this.getMaxOffsetForPinChild(((View)v8_2));
            DescendantOffsetUtils.getDescendantRect(((ViewGroup)this), this.dummyView, this.tmpRect);
            CollapsingTextHelper v2_1 = this.collapsingTextHelper;
            int v3_1 = this.tmpRect.left;
            int v4 = v1 != 0 ? this.toolbar.getTitleMarginEnd() : this.toolbar.getTitleMarginStart();
            v3_1 += v4;
            v4 = this.tmpRect.top + v8 + this.toolbar.getTitleMarginTop();
            int v5 = this.tmpRect.right;
            int v6 = v1 != 0 ? this.toolbar.getTitleMarginStart() : this.toolbar.getTitleMarginEnd();
            v2_1.setCollapsedBounds(v3_1, v4, v5 + v6, this.tmpRect.bottom + v8 - this.toolbar.getTitleMarginBottom());
            CollapsingTextHelper v8_3 = this.collapsingTextHelper;
            v2 = v1 != 0 ? this.expandedMarginEnd : this.expandedMarginStart;
            v3_1 = this.tmpRect.top + this.expandedMarginTop;
            arg11 -= arg9;
            arg9 = v1 != 0 ? this.expandedMarginStart : this.expandedMarginEnd;
            v8_3.setExpandedBounds(v2, v3_1, arg11 - arg9, arg12 - arg10 - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate();
        }

    label_100:
        v8 = this.getChildCount();
        while(v0 < v8) {
            CollapsingToolbarLayout.getViewOffsetHelper(this.getChildAt(v0)).onViewLayout();
            ++v0;
        }

        if(this.toolbar != null) {
            if((this.collapsingTitleEnabled) && (TextUtils.isEmpty(this.collapsingTextHelper.getText()))) {
                this.setTitle(this.toolbar.getTitle());
            }

            if(this.toolbarDirectChild != null) {
                if(this.toolbarDirectChild == this) {
                }
                else {
                    this.setMinimumHeight(CollapsingToolbarLayout.getHeightWithMargins(this.toolbarDirectChild));
                    goto label_130;
                }
            }

            this.setMinimumHeight(CollapsingToolbarLayout.getHeightWithMargins(this.toolbar));
        }

    label_130:
        this.updateScrimVisibility();
    }

    protected void onMeasure(int arg2, int arg3) {
        this.ensureToolbar();
        super.onMeasure(arg2, arg3);
        arg3 = View$MeasureSpec.getMode(arg3);
        int v0 = this.lastInsets != null ? this.lastInsets.getSystemWindowInsetTop() : 0;
        if(arg3 == 0 && v0 > 0) {
            super.onMeasure(arg2, View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + v0, 0x40000000));
        }
    }

    protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4) {
        super.onSizeChanged(arg1, arg2, arg3, arg4);
        if(this.contentScrim != null) {
            this.contentScrim.setBounds(0, 0, arg1, arg2);
        }
    }

    WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat arg3) {
        Object v0_1;
        if(ViewCompat.getFitsSystemWindows(((View)this))) {
            WindowInsetsCompat v0 = arg3;
        }
        else {
            v0_1 = null;
        }

        if(!ObjectsCompat.equals(this.lastInsets, v0_1)) {
            this.lastInsets = ((WindowInsetsCompat)v0_1);
            this.requestLayout();
        }

        return arg3.consumeSystemWindowInsets();
    }

    public void setCollapsedTitleGravity(int arg2) {
        this.collapsingTextHelper.setCollapsedTextGravity(arg2);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int arg2) {
        this.collapsingTextHelper.setCollapsedTextAppearance(arg2);
    }

    public void setCollapsedTitleTextColor(@ColorInt int arg1) {
        this.setCollapsedTitleTextColor(ColorStateList.valueOf(arg1));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList arg2) {
        this.collapsingTextHelper.setCollapsedTextColor(arg2);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface arg2) {
        this.collapsingTextHelper.setCollapsedTypeface(arg2);
    }

    public void setContentScrim(@Nullable Drawable arg4) {
        Drawable v1_1;
        if(this.contentScrim != arg4) {
            Drawable$Callback v1 = null;
            if(this.contentScrim != null) {
                this.contentScrim.setCallback(v1);
            }

            if(arg4 != null) {
                v1_1 = arg4.mutate();
            }

            this.contentScrim = v1_1;
            if(this.contentScrim != null) {
                this.contentScrim.setBounds(0, 0, this.getWidth(), this.getHeight());
                this.contentScrim.setCallback(((Drawable$Callback)this));
                this.contentScrim.setAlpha(this.scrimAlpha);
            }

            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    public void setContentScrimColor(@ColorInt int arg2) {
        this.setContentScrim(new ColorDrawable(arg2));
    }

    public void setContentScrimResource(@DrawableRes int arg2) {
        this.setContentScrim(ContextCompat.getDrawable(this.getContext(), arg2));
    }

    public void setExpandedTitleColor(@ColorInt int arg1) {
        this.setExpandedTitleTextColor(ColorStateList.valueOf(arg1));
    }

    public void setExpandedTitleGravity(int arg2) {
        this.collapsingTextHelper.setExpandedTextGravity(arg2);
    }

    public void setExpandedTitleMargin(int arg1, int arg2, int arg3, int arg4) {
        this.expandedMarginStart = arg1;
        this.expandedMarginTop = arg2;
        this.expandedMarginEnd = arg3;
        this.expandedMarginBottom = arg4;
        this.requestLayout();
    }

    public void setExpandedTitleMarginBottom(int arg1) {
        this.expandedMarginBottom = arg1;
        this.requestLayout();
    }

    public void setExpandedTitleMarginEnd(int arg1) {
        this.expandedMarginEnd = arg1;
        this.requestLayout();
    }

    public void setExpandedTitleMarginStart(int arg1) {
        this.expandedMarginStart = arg1;
        this.requestLayout();
    }

    public void setExpandedTitleMarginTop(int arg1) {
        this.expandedMarginTop = arg1;
        this.requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int arg2) {
        this.collapsingTextHelper.setExpandedTextAppearance(arg2);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList arg2) {
        this.collapsingTextHelper.setExpandedTextColor(arg2);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface arg2) {
        this.collapsingTextHelper.setExpandedTypeface(arg2);
    }

    void setScrimAlpha(int arg2) {
        if(arg2 != this.scrimAlpha) {
            if(this.contentScrim != null && this.toolbar != null) {
                ViewCompat.postInvalidateOnAnimation(this.toolbar);
            }

            this.scrimAlpha = arg2;
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    public void setScrimAnimationDuration(@IntRange(from=0) long arg1) {
        this.scrimAnimationDuration = arg1;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from=0) int arg2) {
        if(this.scrimVisibleHeightTrigger != arg2) {
            this.scrimVisibleHeightTrigger = arg2;
            this.updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean arg2) {
        boolean v0 = !ViewCompat.isLaidOut(((View)this)) || (this.isInEditMode()) ? false : true;
        this.setScrimsShown(arg2, v0);
    }

    public void setScrimsShown(boolean arg3, boolean arg4) {
        if(this.scrimsAreShown != arg3) {
            int v0 = 0;
            if(arg4) {
                if(arg3) {
                    v0 = 0xFF;
                }

                this.animateScrim(v0);
            }
            else {
                if(arg3) {
                    v0 = 0xFF;
                }

                this.setScrimAlpha(v0);
            }

            this.scrimsAreShown = arg3;
        }
    }

    public void setStatusBarScrim(@Nullable Drawable arg3) {
        if(this.statusBarScrim != arg3) {
            Drawable$Callback v1 = null;
            if(this.statusBarScrim != null) {
                this.statusBarScrim.setCallback(v1);
            }

            if(arg3 != null) {
                Drawable v1_1 = arg3.mutate();
            }

            this.statusBarScrim = ((Drawable)v1);
            if(this.statusBarScrim != null) {
                if(this.statusBarScrim.isStateful()) {
                    this.statusBarScrim.setState(this.getDrawableState());
                }

                DrawableCompat.setLayoutDirection(this.statusBarScrim, ViewCompat.getLayoutDirection(((View)this)));
                arg3 = this.statusBarScrim;
                boolean v0 = this.getVisibility() == 0 ? true : false;
                arg3.setVisible(v0, false);
                this.statusBarScrim.setCallback(((Drawable$Callback)this));
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }

            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    public void setStatusBarScrimColor(@ColorInt int arg2) {
        this.setStatusBarScrim(new ColorDrawable(arg2));
    }

    public void setStatusBarScrimResource(@DrawableRes int arg2) {
        this.setStatusBarScrim(ContextCompat.getDrawable(this.getContext(), arg2));
    }

    public void setTitle(@Nullable CharSequence arg2) {
        this.collapsingTextHelper.setText(arg2);
        this.updateContentDescriptionFromTitle();
    }

    public void setTitleEnabled(boolean arg2) {
        if(arg2 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = arg2;
            this.updateContentDescriptionFromTitle();
            this.updateDummyView();
            this.requestLayout();
        }
    }

    public void setVisibility(int arg3) {
        super.setVisibility(arg3);
        boolean v3 = arg3 == 0 ? true : false;
        if(this.statusBarScrim != null && this.statusBarScrim.isVisible() != v3) {
            this.statusBarScrim.setVisible(v3, false);
        }

        if(this.contentScrim != null && this.contentScrim.isVisible() != v3) {
            this.contentScrim.setVisible(v3, false);
        }
    }

    private void updateContentDescriptionFromTitle() {
        this.setContentDescription(this.getTitle());
    }

    private void updateDummyView() {
        if(!this.collapsingTitleEnabled && this.dummyView != null) {
            ViewParent v0 = this.dummyView.getParent();
            if((v0 instanceof ViewGroup)) {
                ((ViewGroup)v0).removeView(this.dummyView);
            }
        }

        if((this.collapsingTitleEnabled) && this.toolbar != null) {
            if(this.dummyView == null) {
                this.dummyView = new View(this.getContext());
            }

            if(this.dummyView.getParent() != null) {
                return;
            }

            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    final void updateScrimVisibility() {
        if(this.contentScrim != null || this.statusBarScrim != null) {
            boolean v0 = this.getHeight() + this.currentOffset < this.getScrimVisibleHeightTrigger() ? true : false;
            this.setScrimsShown(v0);
        }
    }

    protected boolean verifyDrawable(Drawable arg2) {
        boolean v2 = (super.verifyDrawable(arg2)) || arg2 == this.contentScrim || arg2 == this.statusBarScrim ? true : false;
        return v2;
    }
}

