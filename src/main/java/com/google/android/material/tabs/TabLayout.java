package com.google.android.material.tabs;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout$LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SimplePool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager$DecorView;
import androidx.viewpager.widget.ViewPager$OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager$OnPageChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@DecorView public class TabLayout extends HorizontalScrollView {
    class AdapterChangeListener implements OnAdapterChangeListener {
        private boolean autoRefresh;

        AdapterChangeListener(TabLayout arg1) {
            TabLayout.this = arg1;
            super();
        }

        public void onAdapterChanged(@NonNull ViewPager arg1, @Nullable PagerAdapter arg2, @Nullable PagerAdapter arg3) {
            if(TabLayout.this.viewPager == arg1) {
                TabLayout.this.setPagerAdapter(arg3, this.autoRefresh);
            }
        }

        void setAutoRefresh(boolean arg1) {
            this.autoRefresh = arg1;
        }
    }

    public interface BaseOnTabSelectedListener {
        void onTabReselected(Tab arg1);

        void onTabSelected(Tab arg1);

        void onTabUnselected(Tab arg1);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener {
    }

    class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver(TabLayout arg1) {
            TabLayout.this = arg1;
            super();
        }

        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    class SlidingTabIndicator extends LinearLayout {
        private final GradientDrawable defaultSelectionIndicator;
        private ValueAnimator indicatorAnimator;
        private int indicatorLeft;
        private int indicatorRight;
        private int layoutDirection;
        private int selectedIndicatorHeight;
        private final Paint selectedIndicatorPaint;
        int selectedPosition;
        float selectionOffset;

        SlidingTabIndicator(TabLayout arg1, Context arg2) {
            TabLayout.this = arg1;
            super(arg2);
            this.selectedPosition = -1;
            this.layoutDirection = -1;
            this.indicatorLeft = -1;
            this.indicatorRight = -1;
            this.setWillNotDraw(false);
            this.selectedIndicatorPaint = new Paint();
            this.defaultSelectionIndicator = new GradientDrawable();
        }

        void animateIndicatorToPosition(int arg10, int arg11) {
            if(this.indicatorAnimator != null && (this.indicatorAnimator.isRunning())) {
                this.indicatorAnimator.cancel();
            }

            View v0 = this.getChildAt(arg10);
            if(v0 == null) {
                this.updateIndicatorPosition();
                return;
            }

            int v1 = v0.getLeft();
            int v2 = v0.getRight();
            if(!TabLayout.this.tabIndicatorFullWidth && ((v0 instanceof TabView))) {
                this.calculateTabViewContentBounds(((TabView)v0), TabLayout.this.tabViewContentBounds);
                v1 = ((int)TabLayout.this.tabViewContentBounds.left);
                v2 = ((int)TabLayout.this.tabViewContentBounds.right);
            }

            int v6 = v1;
            int v8 = v2;
            int v5 = this.indicatorLeft;
            int v7 = this.indicatorRight;
            if(v5 != v6 || v7 != v8) {
                ValueAnimator v0_1 = new ValueAnimator();
                this.indicatorAnimator = v0_1;
                v0_1.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                v0_1.setDuration(((long)arg11));
                v0_1.setFloatValues(new float[]{0f, 1f});
                v0_1.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(v5, v6, v7, v8) {
                    public void onAnimationUpdate(ValueAnimator arg5) {
                        float v5 = arg5.getAnimatedFraction();
                        this.this$1.setIndicatorPosition(AnimationUtils.lerp(this.val$startLeft, this.val$finalTargetLeft, v5), AnimationUtils.lerp(this.val$startRight, this.val$finalTargetRight, v5));
                    }
                });
                v0_1.addListener(new AnimatorListenerAdapter(arg10) {
                    public void onAnimationEnd(Animator arg2) {
                        this.this$1.selectedPosition = this.val$position;
                        this.this$1.selectionOffset = 0f;
                    }
                });
                v0_1.start();
            }
        }

        private void calculateTabViewContentBounds(TabView arg4, RectF arg5) {
            int v0 = TabView.access$500(arg4);
            int v2 = 24;
            if(v0 < TabLayout.this.dpToPx(v2)) {
                v0 = TabLayout.this.dpToPx(v2);
            }

            int v1 = (arg4.getLeft() + arg4.getRight()) / 2;
            v0 /= 2;
            arg5.set(((float)(v1 - v0)), 0f, ((float)(v1 + v0)), 0f);
        }

        boolean childrenNeedLayout() {
            int v0 = this.getChildCount();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                if(this.getChildAt(v2).getWidth() <= 0) {
                    return 1;
                }
            }

            return 0;
        }

        public void draw(Canvas arg6) {
            GradientDrawable v2_1;
            Drawable v2;
            int v1 = 0;
            int v0 = TabLayout.this.tabSelectedIndicator != null ? TabLayout.this.tabSelectedIndicator.getIntrinsicHeight() : 0;
            if(this.selectedIndicatorHeight >= 0) {
                v0 = this.selectedIndicatorHeight;
            }

            switch(TabLayout.this.tabIndicatorGravity) {
                case 0: {
                    v1 = this.getHeight() - v0;
                    v0 = this.getHeight();
                    break;
                }
                case 1: {
                    v1 = (this.getHeight() - v0) / 2;
                    v0 = (this.getHeight() + v0) / 2;
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    v0 = this.getHeight();
                    break;
                }
                default: {
                    v0 = 0;
                    break;
                }
            }

            if(this.indicatorLeft >= 0 && this.indicatorRight > this.indicatorLeft) {
                if(TabLayout.this.tabSelectedIndicator != null) {
                    v2 = TabLayout.this.tabSelectedIndicator;
                }
                else {
                    v2_1 = this.defaultSelectionIndicator;
                }

                v2 = DrawableCompat.wrap(((Drawable)v2_1));
                v2.setBounds(this.indicatorLeft, v1, this.indicatorRight, v0);
                if(this.selectedIndicatorPaint != null) {
                    if(Build$VERSION.SDK_INT == 21) {
                        v2.setColorFilter(this.selectedIndicatorPaint.getColor(), PorterDuff$Mode.SRC_IN);
                    }
                    else {
                        DrawableCompat.setTint(v2, this.selectedIndicatorPaint.getColor());
                    }
                }

                v2.draw(arg6);
            }

            super.draw(arg6);
        }

        float getIndicatorPosition() {
            return (((float)this.selectedPosition)) + this.selectionOffset;
        }

        protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
            super.onLayout(arg1, arg2, arg3, arg4, arg5);
            if(this.indicatorAnimator == null || !this.indicatorAnimator.isRunning()) {
                this.updateIndicatorPosition();
            }
            else {
                this.indicatorAnimator.cancel();
                this.animateIndicatorToPosition(this.selectedPosition, Math.round((1f - this.indicatorAnimator.getAnimatedFraction()) * (((float)this.indicatorAnimator.getDuration()))));
            }
        }

        protected void onMeasure(int arg9, int arg10) {
            super.onMeasure(arg9, arg10);
            if(View$MeasureSpec.getMode(arg9) != 0x40000000) {
                return;
            }

            int v1 = 1;
            if(TabLayout.this.mode == 1 && TabLayout.this.tabGravity == 1) {
                int v0 = this.getChildCount();
                int v2 = 0;
                int v3 = 0;
                int v4 = 0;
                while(v3 < v0) {
                    View v5 = this.getChildAt(v3);
                    if(v5.getVisibility() == 0) {
                        v4 = Math.max(v4, v5.getMeasuredWidth());
                    }

                    ++v3;
                }

                if(v4 <= 0) {
                    return;
                }

                if(v4 * v0 <= this.getMeasuredWidth() - TabLayout.this.dpToPx(16) * 2) {
                    v3 = 0;
                    goto label_35;
                }
                else {
                    TabLayout.this.tabGravity = 0;
                    TabLayout.this.updateTabViews(false);
                    goto label_54;
                label_35:
                    while(v2 < v0) {
                        ViewGroup$LayoutParams v5_1 = this.getChildAt(v2).getLayoutParams();
                        if(((LinearLayout$LayoutParams)v5_1).width != v4 || ((LinearLayout$LayoutParams)v5_1).weight != 0f) {
                            ((LinearLayout$LayoutParams)v5_1).width = v4;
                            ((LinearLayout$LayoutParams)v5_1).weight = 0f;
                            v3 = 1;
                        }

                        ++v2;
                    }

                    v1 = v3;
                }

            label_54:
                if(v1 == 0) {
                    return;
                }

                super.onMeasure(arg9, arg10);
            }
        }

        public void onRtlPropertiesChanged(int arg3) {
            super.onRtlPropertiesChanged(arg3);
            if(Build$VERSION.SDK_INT < 23 && this.layoutDirection != arg3) {
                this.requestLayout();
                this.layoutDirection = arg3;
            }
        }

        void setIndicatorPosition(int arg2, int arg3) {
            if(arg2 != this.indicatorLeft || arg3 != this.indicatorRight) {
                this.indicatorLeft = arg2;
                this.indicatorRight = arg3;
                ViewCompat.postInvalidateOnAnimation(((View)this));
            }
        }

        void setIndicatorPositionFromTabPosition(int arg2, float arg3) {
            if(this.indicatorAnimator != null && (this.indicatorAnimator.isRunning())) {
                this.indicatorAnimator.cancel();
            }

            this.selectedPosition = arg2;
            this.selectionOffset = arg3;
            this.updateIndicatorPosition();
        }

        void setSelectedIndicatorColor(int arg2) {
            if(this.selectedIndicatorPaint.getColor() != arg2) {
                this.selectedIndicatorPaint.setColor(arg2);
                ViewCompat.postInvalidateOnAnimation(((View)this));
            }
        }

        void setSelectedIndicatorHeight(int arg2) {
            if(this.selectedIndicatorHeight != arg2) {
                this.selectedIndicatorHeight = arg2;
                ViewCompat.postInvalidateOnAnimation(((View)this));
            }
        }

        private void updateIndicatorPosition() {
            int v2;
            int v1;
            View v0 = this.getChildAt(this.selectedPosition);
            if(v0 == null || v0.getWidth() <= 0) {
                v1 = -1;
                v2 = -1;
            }
            else {
                v1 = v0.getLeft();
                v2 = v0.getRight();
                if(!TabLayout.this.tabIndicatorFullWidth && ((v0 instanceof TabView))) {
                    this.calculateTabViewContentBounds(((TabView)v0), TabLayout.this.tabViewContentBounds);
                    v1 = ((int)TabLayout.this.tabViewContentBounds.left);
                    v2 = ((int)TabLayout.this.tabViewContentBounds.right);
                }

                if(this.selectionOffset <= 0f) {
                    goto label_73;
                }

                if(this.selectedPosition >= this.getChildCount() - 1) {
                    goto label_73;
                }

                v0 = this.getChildAt(this.selectedPosition + 1);
                int v3 = v0.getLeft();
                int v4 = v0.getRight();
                if(!TabLayout.this.tabIndicatorFullWidth && ((v0 instanceof TabView))) {
                    this.calculateTabViewContentBounds(((TabView)v0), TabLayout.this.tabViewContentBounds);
                    v3 = ((int)TabLayout.this.tabViewContentBounds.left);
                    v4 = ((int)TabLayout.this.tabViewContentBounds.right);
                }

                v1 = ((int)(this.selectionOffset * (((float)v3)) + (1f - this.selectionOffset) * (((float)v1))));
                v2 = ((int)(this.selectionOffset * (((float)v4)) + (1f - this.selectionOffset) * (((float)v2))));
            }

        label_73:
            this.setIndicatorPosition(v1, v2);
        }
    }

    public class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence contentDesc;
        private View customView;
        private Drawable icon;
        public TabLayout parent;
        private int position;
        private Object tag;
        private CharSequence text;
        public TabView view;

        public Tab() {
            super();
            this.position = -1;
        }

        static CharSequence access$100(Tab arg0) {
            return arg0.contentDesc;
        }

        static CharSequence access$200(Tab arg0) {
            return arg0.text;
        }

        @Nullable public CharSequence getContentDescription() {
            CharSequence v0 = this.view == null ? null : this.view.getContentDescription();
            return v0;
        }

        @Nullable public View getCustomView() {
            return this.customView;
        }

        @Nullable public Drawable getIcon() {
            return this.icon;
        }

        public int getPosition() {
            return this.position;
        }

        @Nullable public Object getTag() {
            return this.tag;
        }

        @Nullable public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            if(this.parent != null) {
                boolean v0 = this.parent.getSelectedTabPosition() == this.position ? true : false;
                return v0;
            }

            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            if(this.parent != null) {
                this.parent.selectTab(this);
                return;
            }

            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull public Tab setContentDescription(@Nullable CharSequence arg1) {
            this.contentDesc = arg1;
            this.updateView();
            return this;
        }

        @NonNull public Tab setContentDescription(@StringRes int arg2) {
            if(this.parent != null) {
                return this.setContentDescription(this.parent.getResources().getText(arg2));
            }

            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull public Tab setCustomView(@LayoutRes int arg4) {
            return this.setCustomView(LayoutInflater.from(this.view.getContext()).inflate(arg4, this.view, false));
        }

        @NonNull public Tab setCustomView(@Nullable View arg1) {
            this.customView = arg1;
            this.updateView();
            return this;
        }

        @NonNull public Tab setIcon(@Nullable Drawable arg1) {
            this.icon = arg1;
            this.updateView();
            return this;
        }

        @NonNull public Tab setIcon(@DrawableRes int arg2) {
            if(this.parent != null) {
                return this.setIcon(AppCompatResources.getDrawable(this.parent.getContext(), arg2));
            }

            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void setPosition(int arg1) {
            this.position = arg1;
        }

        @NonNull public Tab setTag(@Nullable Object arg1) {
            this.tag = arg1;
            return this;
        }

        @NonNull public Tab setText(@Nullable CharSequence arg2) {
            if((TextUtils.isEmpty(this.contentDesc)) && !TextUtils.isEmpty(arg2)) {
                this.view.setContentDescription(arg2);
            }

            this.text = arg2;
            this.updateView();
            return this;
        }

        @NonNull public Tab setText(@StringRes int arg2) {
            if(this.parent != null) {
                return this.setText(this.parent.getResources().getText(arg2));
            }

            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void updateView() {
            if(this.view != null) {
                this.view.update();
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface TabGravity {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface TabIndicatorGravity {
    }

    public class TabLayoutOnPageChangeListener implements OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout arg2) {
            super();
            this.tabLayoutRef = new WeakReference(arg2);
        }

        public void onPageScrollStateChanged(int arg2) {
            this.previousScrollState = this.scrollState;
            this.scrollState = arg2;
        }

        public void onPageScrolled(int arg6, float arg7, int arg8) {
            Object v8 = this.tabLayoutRef.get();
            if(v8 != null) {
                boolean v1 = false;
                int v2 = 2;
                boolean v0 = this.scrollState != v2 || this.previousScrollState == 1 ? true : false;
                if(this.scrollState != v2 || this.previousScrollState != 0) {
                    v1 = true;
                }

                ((TabLayout)v8).setScrollPosition(arg6, arg7, v0, v1);
            }
        }

        public void onPageSelected(int arg4) {
            boolean v1;
            Object v0 = this.tabLayoutRef.get();
            if(v0 != null && ((TabLayout)v0).getSelectedTabPosition() != arg4 && arg4 < ((TabLayout)v0).getTabCount()) {
                if(this.scrollState != 0) {
                    if(this.scrollState == 2 && this.previousScrollState == 0) {
                        goto label_17;
                    }

                    v1 = false;
                }
                else {
                label_17:
                    v1 = true;
                }

                ((TabLayout)v0).selectTab(((TabLayout)v0).getTabAt(arg4), v1);
            }
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    class TabView extends LinearLayout {
        @Nullable private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(TabLayout arg4, Context arg5) {
            TabLayout.this = arg4;
            super(arg5);
            this.defaultMaxLines = 2;
            this.updateBackgroundDrawable(arg5);
            ViewCompat.setPaddingRelative(((View)this), arg4.tabPaddingStart, arg4.tabPaddingTop, arg4.tabPaddingEnd, arg4.tabPaddingBottom);
            this.setGravity(17);
            this.setOrientation(arg4.inlineLabel ^ 1);
            this.setClickable(true);
            ViewCompat.setPointerIcon(((View)this), PointerIconCompat.getSystemIcon(this.getContext(), 1002));
        }

        static void access$000(TabView arg0, Context arg1) {
            arg0.updateBackgroundDrawable(arg1);
        }

        static void access$300(TabView arg0, Canvas arg1) {
            arg0.drawBackground(arg1);
        }

        static int access$500(TabView arg0) {
            return arg0.getContentWidth();
        }

        private float approximateLineWidth(Layout arg1, int arg2, float arg3) {
            return arg1.getLineWidth(arg2) * (arg3 / arg1.getPaint().getTextSize());
        }

        private void drawBackground(Canvas arg6) {
            if(this.baseBackgroundDrawable != null) {
                this.baseBackgroundDrawable.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
                this.baseBackgroundDrawable.draw(arg6);
            }
        }

        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] v0 = this.getDrawableState();
            int v2 = 0;
            if(this.baseBackgroundDrawable != null && (this.baseBackgroundDrawable.isStateful())) {
                v2 = 0 | this.baseBackgroundDrawable.setState(v0);
            }

            if(v2 != 0) {
                this.invalidate();
                TabLayout.this.invalidate();
            }
        }

        private int getContentWidth() {
            View[] v0 = new View[3];
            int v2 = 0;
            v0[0] = this.textView;
            v0[1] = this.iconView;
            v0[2] = this.customView;
            int v1 = v0.length;
            int v4 = 0;
            int v5 = 0;
            int v6 = 0;
            while(v2 < v1) {
                View v7 = v0[v2];
                if(v7 != null && v7.getVisibility() == 0) {
                    v5 = v6 != 0 ? Math.min(v5, v7.getLeft()) : v7.getLeft();
                    v4 = v6 != 0 ? Math.max(v4, v7.getRight()) : v7.getRight();
                    v6 = 1;
                }

                ++v2;
            }

            return v4 - v5;
        }

        public Tab getTab() {
            return this.tab;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent arg2) {
            super.onInitializeAccessibilityEvent(arg2);
            arg2.setClassName(androidx.appcompat.app.ActionBar$Tab.class.getName());
        }

        @TargetApi(value=14) public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo arg2) {
            super.onInitializeAccessibilityNodeInfo(arg2);
            arg2.setClassName(androidx.appcompat.app.ActionBar$Tab.class.getName());
        }

        public void onMeasure(int arg8, int arg9) {
            int v0 = View$MeasureSpec.getSize(arg8);
            int v1 = View$MeasureSpec.getMode(arg8);
            int v2 = TabLayout.this.getTabMaxWidth();
            if(v2 > 0 && (v1 == 0 || v0 > v2)) {
                arg8 = View$MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, 0x80000000);
            }

            super.onMeasure(arg8, arg9);
            if(this.textView != null) {
                float v0_1 = TabLayout.this.tabTextSize;
                v1 = this.defaultMaxLines;
                int v3 = 1;
                if(this.iconView != null && this.iconView.getVisibility() == 0) {
                    v1 = 1;
                }
                else if(this.textView != null && this.textView.getLineCount() > 1) {
                    v0_1 = TabLayout.this.tabTextMultiLineSize;
                }

                float v2_1 = this.textView.getTextSize();
                int v4 = this.textView.getLineCount();
                int v5 = TextViewCompat.getMaxLines(this.textView);
                v2 = Float.compare(v0_1, v2_1);
                if(v2 == 0) {
                    if(v5 < 0) {
                    }
                    else if(v1 != v5) {
                        goto label_42;
                    }

                    return;
                }

            label_42:
                if(TabLayout.this.mode == 1 && v2 > 0 && v4 == 1) {
                    Layout v2_2 = this.textView.getLayout();
                    if(v2_2 != null && this.approximateLineWidth(v2_2, 0, v0_1) <= (((float)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight())))) {
                        goto label_60;
                    }

                    v3 = 0;
                }

            label_60:
                if(v3 == 0) {
                    return;
                }

                this.textView.setTextSize(0, v0_1);
                this.textView.setMaxLines(v1);
                super.onMeasure(arg8, arg9);
            }
        }

        public boolean performClick() {
            boolean v0 = super.performClick();
            if(this.tab != null) {
                if(!v0) {
                    this.playSoundEffect(0);
                }

                this.tab.select();
                return 1;
            }

            return v0;
        }

        void reset() {
            this.setTab(null);
            this.setSelected(false);
        }

        public void setSelected(boolean arg3) {
            int v0 = this.isSelected() != arg3 ? 1 : 0;
            super.setSelected(arg3);
            if(v0 != 0 && (arg3) && Build$VERSION.SDK_INT < 16) {
                this.sendAccessibilityEvent(4);
            }

            if(this.textView != null) {
                this.textView.setSelected(arg3);
            }

            if(this.iconView != null) {
                this.iconView.setSelected(arg3);
            }

            if(this.customView != null) {
                this.customView.setSelected(arg3);
            }
        }

        void setTab(@Nullable Tab arg2) {
            if(arg2 != this.tab) {
                this.tab = arg2;
                this.update();
            }
        }

        final void update() {
            Tab v0 = this.tab;
            Drawable v1 = null;
            View v2 = v0 != null ? v0.getCustomView() : ((View)v1);
            if(v2 != null) {
                ViewParent v3 = v2.getParent();
                if((((TabView)v3)) != this) {
                    if(v3 != null) {
                        ((ViewGroup)v3).removeView(v2);
                    }

                    this.addView(v2);
                }

                this.customView = v2;
                int v4 = 8;
                if(this.textView != null) {
                    this.textView.setVisibility(v4);
                }

                if(this.iconView != null) {
                    this.iconView.setVisibility(v4);
                    this.iconView.setImageDrawable(v1);
                }

                this.customTextView = v2.findViewById(0x1020014);
                if(this.customTextView != null) {
                    this.defaultMaxLines = TextViewCompat.getMaxLines(this.customTextView);
                }

                this.customIconView = v2.findViewById(0x1020006);
            }
            else {
                if(this.customView != null) {
                    this.removeView(this.customView);
                    this.customView = ((View)v1);
                }

                this.customTextView = ((TextView)v1);
                this.customIconView = ((ImageView)v1);
            }

            boolean v3_1 = false;
            if(this.customView == null) {
                if(this.iconView == null) {
                    v2 = LayoutInflater.from(this.getContext()).inflate(R$layout.design_layout_tab_icon, ((ViewGroup)this), false);
                    this.addView(v2, 0);
                    this.iconView = ((ImageView)v2);
                }

                if(v0 != null && v0.getIcon() != null) {
                    v1 = DrawableCompat.wrap(v0.getIcon()).mutate();
                }

                if(v1 != null) {
                    DrawableCompat.setTintList(v1, TabLayout.this.tabIconTint);
                    if(TabLayout.this.tabIconTintMode != null) {
                        DrawableCompat.setTintMode(v1, TabLayout.this.tabIconTintMode);
                    }
                }

                if(this.textView == null) {
                    View v1_1 = LayoutInflater.from(this.getContext()).inflate(R$layout.design_layout_tab_text, ((ViewGroup)this), false);
                    this.addView(v1_1);
                    this.textView = ((TextView)v1_1);
                    this.defaultMaxLines = TextViewCompat.getMaxLines(this.textView);
                }

                TextViewCompat.setTextAppearance(this.textView, TabLayout.this.tabTextAppearance);
                if(TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(TabLayout.this.tabTextColors);
                }

                this.updateTextAndIcon(this.textView, this.iconView);
            }
            else {
                if(this.customTextView == null && this.customIconView == null) {
                    goto label_103;
                }

                this.updateTextAndIcon(this.customTextView, this.customIconView);
            }

        label_103:
            if(v0 != null && !TextUtils.isEmpty(v0.contentDesc)) {
                this.setContentDescription(v0.contentDesc);
            }

            if(v0 != null && (v0.isSelected())) {
                v3_1 = true;
            }

            this.setSelected(v3_1);
        }

        private void updateBackgroundDrawable(Context arg7) {
            Drawable v0_1;
            Drawable v7_1;
            Drawable v1 = null;
            if(TabLayout.this.tabBackgroundResId != 0) {
                this.baseBackgroundDrawable = AppCompatResources.getDrawable(arg7, TabLayout.this.tabBackgroundResId);
                if(this.baseBackgroundDrawable != null && (this.baseBackgroundDrawable.isStateful())) {
                    this.baseBackgroundDrawable.setState(this.getDrawableState());
                }
            }
            else {
                this.baseBackgroundDrawable = v1;
            }

            GradientDrawable v7 = new GradientDrawable();
            v7.setColor(0);
            if(TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable v0 = new GradientDrawable();
                v0.setCornerRadius(0.00001f);
                v0.setColor(-1);
                ColorStateList v3 = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                if(Build$VERSION.SDK_INT >= 21) {
                    if(TabLayout.this.unboundedRipple) {
                        v7_1 = v1;
                    }

                    if(TabLayout.this.unboundedRipple) {
                        v0_1 = v1;
                    }

                    RippleDrawable v7_2 = new RippleDrawable(v3, v7_1, v0_1);
                }
                else {
                    v0_1 = DrawableCompat.wrap(((Drawable)v0));
                    DrawableCompat.setTintList(v0_1, v3);
                    LayerDrawable v7_3 = new LayerDrawable(new Drawable[]{v7, v0_1});
                }
            }

            ViewCompat.setBackground(((View)this), ((Drawable)v7));
            TabLayout.this.invalidate();
        }

        final void updateOrientation() {
            this.setOrientation(TabLayout.this.inlineLabel ^ 1);
            if(this.customTextView != null || this.customIconView != null) {
                this.updateTextAndIcon(this.customTextView, this.customIconView);
            }
            else {
                this.updateTextAndIcon(this.textView, this.iconView);
            }
        }

        private void updateTextAndIcon(@Nullable TextView arg6, @Nullable ImageView arg7) {
            Drawable v1 = null;
            Drawable v0 = this.tab == null || this.tab.getIcon() == null ? v1 : DrawableCompat.wrap(this.tab.getIcon()).mutate();
            CharSequence v2 = this.tab != null ? this.tab.getText() : ((CharSequence)v1);
            int v3 = 8;
            if(arg7 != null) {
                if(v0 != null) {
                    arg7.setImageDrawable(v0);
                    arg7.setVisibility(0);
                    this.setVisibility(0);
                }
                else {
                    arg7.setVisibility(v3);
                    arg7.setImageDrawable(v1);
                }
            }

            int v0_1 = TextUtils.isEmpty(v2) ^ 1;
            if(arg6 != null) {
                if(v0_1 != 0) {
                    arg6.setText(v2);
                    arg6.setVisibility(0);
                    this.setVisibility(0);
                }
                else {
                    arg6.setVisibility(v3);
                    arg6.setText(((CharSequence)v1));
                }
            }

            if(arg7 != null) {
                ViewGroup$LayoutParams v6 = arg7.getLayoutParams();
                int v2_1 = v0_1 == 0 || arg7.getVisibility() != 0 ? 0 : TabLayout.this.dpToPx(v3);
                if(TabLayout.this.inlineLabel) {
                    if(v2_1 == MarginLayoutParamsCompat.getMarginEnd(((ViewGroup$MarginLayoutParams)v6))) {
                        goto label_63;
                    }

                    MarginLayoutParamsCompat.setMarginEnd(((ViewGroup$MarginLayoutParams)v6), v2_1);
                    ((ViewGroup$MarginLayoutParams)v6).bottomMargin = 0;
                    arg7.setLayoutParams(v6);
                    arg7.requestLayout();
                    goto label_63;
                }

                if(v2_1 == ((ViewGroup$MarginLayoutParams)v6).bottomMargin) {
                    goto label_63;
                }

                ((ViewGroup$MarginLayoutParams)v6).bottomMargin = v2_1;
                MarginLayoutParamsCompat.setMarginEnd(((ViewGroup$MarginLayoutParams)v6), 0);
                arg7.setLayoutParams(v6);
                arg7.requestLayout();
            }

        label_63:
            CharSequence v6_1 = this.tab != null ? this.tab.contentDesc : ((CharSequence)v1);
            if(v0_1 != 0) {
                v6_1 = ((CharSequence)v1);
            }

            TooltipCompat.setTooltipText(((View)this), v6_1);
        }
    }

    public class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager arg1) {
            super();
            this.viewPager = arg1;
        }

        public void onTabReselected(Tab arg1) {
        }

        public void onTabSelected(Tab arg2) {
            this.viewPager.setCurrentItem(arg2.getPosition());
        }

        public void onTabUnselected(Tab arg1) {
        }
    }

    private static final int ANIMATION_DURATION = 300;
    @Dimension(unit=0) static final int DEFAULT_GAP_TEXT_ICON = 8;
    @Dimension(unit=0) private static final int DEFAULT_HEIGHT = 0x30;
    @Dimension(unit=0) private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    @Dimension(unit=0) static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    @Dimension(unit=0) private static final int MIN_INDICATOR_WIDTH = 24;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    @Dimension(unit=0) private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private BaseOnTabSelectedListener currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList selectedListeners;
    private Tab selectedTab;
    private boolean setupViewPagerImplicitly;
    private final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff$Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    private static final Pool tabPool;
    ColorStateList tabRippleColorStateList;
    @Nullable Drawable tabSelectedIndicator;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final RectF tabViewContentBounds;
    private final Pool tabViewPool;
    private final ArrayList tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    static {
        TabLayout.tabPool = new SynchronizedPool(16);
    }

    public TabLayout(Context arg2) {
        this(arg2, null);
    }

    public TabLayout(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.tabStyle);
    }

    public TabLayout(Context arg12, AttributeSet arg13, int arg14) {
        super(arg12, arg13, arg14);
        this.tabs = new ArrayList();
        this.tabViewContentBounds = new RectF();
        this.tabMaxWidth = 0x7FFFFFFF;
        this.selectedListeners = new ArrayList();
        this.tabViewPool = new SimplePool(12);
        this.setHorizontalScrollBarEnabled(false);
        this.slidingTabIndicator = new SlidingTabIndicator(this, arg12);
        int v3 = -1;
        super.addView(this.slidingTabIndicator, 0, new FrameLayout$LayoutParams(-2, v3));
        TypedArray v13 = ThemeEnforcement.obtainStyledAttributes(arg12, arg13, R$styleable.TabLayout, arg14, R$style.Widget_Design_TabLayout, new int[]{R$styleable.TabLayout_tabTextAppearance});
        this.slidingTabIndicator.setSelectedIndicatorHeight(v13.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, v3));
        this.slidingTabIndicator.setSelectedIndicatorColor(v13.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        this.setSelectedTabIndicator(MaterialResources.getDrawable(arg12, v13, R$styleable.TabLayout_tabIndicator));
        this.setSelectedTabIndicatorGravity(v13.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
        this.setTabIndicatorFullWidth(v13.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
        arg14 = v13.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = arg14;
        this.tabPaddingEnd = arg14;
        this.tabPaddingTop = arg14;
        this.tabPaddingStart = arg14;
        this.tabPaddingStart = v13.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, this.tabPaddingStart);
        this.tabPaddingTop = v13.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = v13.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = v13.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        this.tabTextAppearance = v13.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.TextAppearance_Design_Tab);
        TypedArray v14 = arg12.obtainStyledAttributes(this.tabTextAppearance, androidx.appcompat.R$styleable.TextAppearance);
        try {
            this.tabTextSize = ((float)v14.getDimensionPixelSize(androidx.appcompat.R$styleable.TextAppearance_android_textSize, 0));
            this.tabTextColors = MaterialResources.getColorStateList(arg12, v14, androidx.appcompat.R$styleable.TextAppearance_android_textColor);
        }
        catch(Throwable v12) {
            v14.recycle();
            throw v12;
        }

        v14.recycle();
        if(v13.hasValue(R$styleable.TabLayout_tabTextColor)) {
            this.tabTextColors = MaterialResources.getColorStateList(arg12, v13, R$styleable.TabLayout_tabTextColor);
        }

        if(v13.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
            this.tabTextColors = TabLayout.createColorStateList(this.tabTextColors.getDefaultColor(), v13.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
        }

        this.tabIconTint = MaterialResources.getColorStateList(arg12, v13, R$styleable.TabLayout_tabIconTint);
        this.tabIconTintMode = ViewUtils.parseTintMode(v13.getInt(R$styleable.TabLayout_tabIconTintMode, v3), null);
        this.tabRippleColorStateList = MaterialResources.getColorStateList(arg12, v13, R$styleable.TabLayout_tabRippleColor);
        this.tabIndicatorAnimationDuration = v13.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, 300);
        this.requestedTabMinWidth = v13.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, v3);
        this.requestedTabMaxWidth = v13.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, v3);
        this.tabBackgroundResId = v13.getResourceId(R$styleable.TabLayout_tabBackground, 0);
        this.contentInsetStart = v13.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
        this.mode = v13.getInt(R$styleable.TabLayout_tabMode, 1);
        this.tabGravity = v13.getInt(R$styleable.TabLayout_tabGravity, 0);
        this.inlineLabel = v13.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
        this.unboundedRipple = v13.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
        v13.recycle();
        Resources v12_1 = this.getResources();
        this.tabTextMultiLineSize = ((float)v12_1.getDimensionPixelSize(R$dimen.design_tab_text_size_2line));
        this.scrollableTabMinWidth = v12_1.getDimensionPixelSize(R$dimen.design_tab_scrollable_min_width);
        this.applyModeAndGravity();
    }

    static RectF access$400(TabLayout arg0) {
        return arg0.tabViewContentBounds;
    }

    public void addOnTabSelectedListener(@NonNull BaseOnTabSelectedListener arg2) {
        if(!this.selectedListeners.contains(arg2)) {
            this.selectedListeners.add(arg2);
        }
    }

    public void addTab(@NonNull Tab arg2) {
        this.addTab(arg2, this.tabs.isEmpty());
    }

    public void addTab(@NonNull Tab arg2, boolean arg3) {
        this.addTab(arg2, this.tabs.size(), arg3);
    }

    public void addTab(@NonNull Tab arg2, int arg3) {
        this.addTab(arg2, arg3, this.tabs.isEmpty());
    }

    public void addTab(@NonNull Tab arg2, int arg3, boolean arg4) {
        if(arg2.parent == this) {
            this.configureTab(arg2, arg3);
            this.addTabView(arg2);
            if(arg4) {
                arg2.select();
            }

            return;
        }

        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void addTabFromItemView(@NonNull TabItem arg3) {
        Tab v0 = this.newTab();
        if(arg3.text != null) {
            v0.setText(arg3.text);
        }

        if(arg3.icon != null) {
            v0.setIcon(arg3.icon);
        }

        if(arg3.customLayout != 0) {
            v0.setCustomView(arg3.customLayout);
        }

        if(!TextUtils.isEmpty(arg3.getContentDescription())) {
            v0.setContentDescription(arg3.getContentDescription());
        }

        this.addTab(v0);
    }

    private void addTabView(Tab arg4) {
        this.slidingTabIndicator.addView(arg4.view, arg4.getPosition(), this.createLayoutParamsForTabs());
    }

    public void addView(View arg1) {
        this.addViewInternal(arg1);
    }

    public void addView(View arg1, int arg2) {
        this.addViewInternal(arg1);
    }

    public void addView(View arg1, int arg2, ViewGroup$LayoutParams arg3) {
        this.addViewInternal(arg1);
    }

    public void addView(View arg1, ViewGroup$LayoutParams arg2) {
        this.addViewInternal(arg1);
    }

    private void addViewInternal(View arg2) {
        if((arg2 instanceof TabItem)) {
            this.addTabFromItemView(((TabItem)arg2));
            return;
        }

        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int arg7) {
        if(arg7 == -1) {
            return;
        }

        if(this.getWindowToken() != null && (ViewCompat.isLaidOut(((View)this)))) {
            if(this.slidingTabIndicator.childrenNeedLayout()) {
            }
            else {
                int v0 = this.getScrollX();
                int v2 = this.calculateScrollXForTab(arg7, 0f);
                if(v0 != v2) {
                    this.ensureScrollAnimator();
                    this.scrollAnimator.setIntValues(new int[]{v0, v2});
                    this.scrollAnimator.start();
                }

                this.slidingTabIndicator.animateIndicatorToPosition(arg7, this.tabIndicatorAnimationDuration);
                return;
            }
        }

        this.setScrollPosition(arg7, 0f, true);
    }

    private void applyModeAndGravity() {
        int v0 = this.mode == 0 ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0;
        ViewCompat.setPaddingRelative(this.slidingTabIndicator, v0, 0, 0, 0);
        switch(this.mode) {
            case 0: {
                this.slidingTabIndicator.setGravity(0x800003);
                break;
            }
            case 1: {
                this.slidingTabIndicator.setGravity(1);
                break;
            }
            default: {
                break;
            }
        }

        this.updateTabViews(true);
    }

    private int calculateScrollXForTab(int arg4, float arg5) {
        int v1 = 0;
        if(this.mode == 0) {
            View v0 = this.slidingTabIndicator.getChildAt(arg4);
            ++arg4;
            View v4 = arg4 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(arg4) : null;
            int v2 = v0 != null ? v0.getWidth() : 0;
            if(v4 != null) {
                v1 = v4.getWidth();
            }

            arg4 = v0.getLeft() + v2 / 2 - this.getWidth() / 2;
            int v5 = ((int)((((float)(v2 + v1))) * 0.5f * arg5));
            if(ViewCompat.getLayoutDirection(((View)this)) == 0) {
                arg4 += v5;
            }
            else {
                arg4 -= v5;
            }

            return arg4;
        }

        return 0;
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    private void configureTab(Tab arg2, int arg3) {
        arg2.setPosition(arg3);
        this.tabs.add(arg3, arg2);
        int v2 = this.tabs.size();
        while(true) {
            ++arg3;
            if(arg3 >= v2) {
                return;
            }

            this.tabs.get(arg3).setPosition(arg3);
        }
    }

    private static ColorStateList createColorStateList(int arg4, int arg5) {
        int[][] v1 = new int[2][];
        int[] v0 = new int[2];
        v1[0] = TabLayout.SELECTED_STATE_SET;
        v0[0] = arg5;
        v1[1] = TabLayout.EMPTY_STATE_SET;
        v0[1] = arg4;
        return new ColorStateList(v1, v0);
    }

    private LinearLayout$LayoutParams createLayoutParamsForTabs() {
        LinearLayout$LayoutParams v0 = new LinearLayout$LayoutParams(-2, -1);
        this.updateTabViewLayoutParams(v0);
        return v0;
    }

    protected Tab createTabFromPool() {
        Tab v0_1;
        Object v0 = TabLayout.tabPool.acquire();
        if(v0 == null) {
            v0_1 = new Tab();
        }

        return v0_1;
    }

    private TabView createTabView(@NonNull Tab arg3) {
        TabView v0_1;
        Object v0 = this.tabViewPool != null ? this.tabViewPool.acquire() : null;
        if(v0 == null) {
            v0_1 = new TabView(this, this.getContext());
        }

        v0_1.setTab(arg3);
        v0_1.setFocusable(true);
        v0_1.setMinimumWidth(this.getTabMinWidth());
        if(TextUtils.isEmpty(Tab.access$100(arg3))) {
            v0_1.setContentDescription(Tab.access$200(arg3));
        }
        else {
            v0_1.setContentDescription(Tab.access$100(arg3));
        }

        return v0_1;
    }

    private void dispatchTabReselected(@NonNull Tab arg3) {
        int v0;
        for(v0 = this.selectedListeners.size() - 1; v0 >= 0; --v0) {
            this.selectedListeners.get(v0).onTabReselected(arg3);
        }
    }

    private void dispatchTabSelected(@NonNull Tab arg3) {
        int v0;
        for(v0 = this.selectedListeners.size() - 1; v0 >= 0; --v0) {
            this.selectedListeners.get(v0).onTabSelected(arg3);
        }
    }

    private void dispatchTabUnselected(@NonNull Tab arg3) {
        int v0;
        for(v0 = this.selectedListeners.size() - 1; v0 >= 0; --v0) {
            this.selectedListeners.get(v0).onTabUnselected(arg3);
        }
    }

    @Dimension(unit=1) int dpToPx(@Dimension(unit=0) int arg2) {
        return Math.round(this.getResources().getDisplayMetrics().density * (((float)arg2)));
    }

    private void ensureScrollAnimator() {
        if(this.scrollAnimator == null) {
            this.scrollAnimator = new ValueAnimator();
            this.scrollAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.scrollAnimator.setDuration(((long)this.tabIndicatorAnimationDuration));
            this.scrollAnimator.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator arg3) {
                    TabLayout.this.scrollTo(arg3.getAnimatedValue().intValue(), 0);
                }
            });
        }
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    public FrameLayout$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateDefaultLayoutParams();
    }

    @Dimension(unit=0) private int getDefaultHeight() {
        int v0 = this.tabs.size();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = this.tabs.get(v2);
            if(v3 != null && ((Tab)v3).getIcon() != null && !TextUtils.isEmpty(((Tab)v3).getText())) {
                v1 = 1;
                break;
            }
        }

        return v1 == 0 || (this.inlineLabel) ? 0x30 : 72;
    }

    public int getSelectedTabPosition() {
        int v0 = this.selectedTab != null ? this.selectedTab.getPosition() : -1;
        return v0;
    }

    @Nullable public Tab getTabAt(int arg2) {
        Tab v2_1;
        if(arg2 < 0 || arg2 >= this.getTabCount()) {
            v2_1 = null;
        }
        else {
            Object v2 = this.tabs.get(arg2);
        }

        return v2_1;
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    @Nullable public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    private int getTabMinWidth() {
        if(this.requestedTabMinWidth != -1) {
            return this.requestedTabMinWidth;
        }

        int v0 = this.mode == 0 ? this.scrollableTabMinWidth : 0;
        return v0;
    }

    public int getTabMode() {
        return this.mode;
    }

    @Nullable public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    private int getTabScrollRange() {
        return Math.max(0, this.slidingTabIndicator.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }

    @Nullable public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    @Nullable public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    @NonNull public Tab newTab() {
        Tab v0 = this.createTabFromPool();
        v0.parent = this;
        v0.view = this.createTabView(v0);
        return v0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.viewPager == null) {
            ViewParent v0 = this.getParent();
            if((v0 instanceof ViewPager)) {
                this.setupWithViewPager(((ViewPager)v0), true, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.setupViewPagerImplicitly) {
            this.setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    protected void onDraw(Canvas arg4) {
        int v0;
        for(v0 = 0; v0 < this.slidingTabIndicator.getChildCount(); ++v0) {
            View v1 = this.slidingTabIndicator.getChildAt(v0);
            if((v1 instanceof TabView)) {
                TabView.access$300(((TabView)v1), arg4);
            }
        }

        super.onDraw(arg4);
    }

    protected void onMeasure(int arg6, int arg7) {
        int v0 = this.dpToPx(this.getDefaultHeight()) + this.getPaddingTop() + this.getPaddingBottom();
        int v1 = View$MeasureSpec.getMode(arg7);
        int v3 = 0x40000000;
        if(v1 == 0x80000000) {
            arg7 = View$MeasureSpec.makeMeasureSpec(Math.min(v0, View$MeasureSpec.getSize(arg7)), v3);
        }
        else if(v1 != 0) {
        }
        else {
            arg7 = View$MeasureSpec.makeMeasureSpec(v0, v3);
        }

        v0 = View$MeasureSpec.getSize(arg6);
        if(View$MeasureSpec.getMode(arg6) != 0) {
            if(this.requestedTabMaxWidth > 0) {
                v0 = this.requestedTabMaxWidth;
            }
            else {
                v0 -= this.dpToPx(56);
            }

            this.tabMaxWidth = v0;
        }

        super.onMeasure(arg6, arg7);
        if(this.getChildCount() == 1) {
            arg6 = 0;
            View v1_1 = this.getChildAt(0);
            switch(this.mode) {
                case 0: {
                    if(v1_1.getMeasuredWidth() < this.getMeasuredWidth()) {
                    label_40:
                        arg6 = 1;
                    }
                    else {
                    }

                    break;
                }
                case 1: {
                    if(v1_1.getMeasuredWidth() == this.getMeasuredWidth()) {
                        goto label_46;
                    }

                    goto label_40;
                }
                default: {
                    break;
                }
            }

        label_46:
            if(arg6 != 0) {
                v1_1.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), v3), TabLayout.getChildMeasureSpec(arg7, this.getPaddingTop() + this.getPaddingBottom(), v1_1.getLayoutParams().height));
            }
        }
    }

    void populateFromPagerAdapter() {
        this.removeAllTabs();
        if(this.pagerAdapter != null) {
            int v0 = this.pagerAdapter.getCount();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                this.addTab(this.newTab().setText(this.pagerAdapter.getPageTitle(v2)), false);
            }

            if(this.viewPager != null && v0 > 0) {
                v0 = this.viewPager.getCurrentItem();
                if(v0 != this.getSelectedTabPosition() && v0 < this.getTabCount()) {
                    this.selectTab(this.getTabAt(v0));
                }
            }
        }
    }

    protected boolean releaseFromTabPool(Tab arg2) {
        return TabLayout.tabPool.release(arg2);
    }

    public void removeAllTabs() {
        int v0;
        for(v0 = this.slidingTabIndicator.getChildCount() - 1; v0 >= 0; --v0) {
            this.removeTabViewAt(v0);
        }

        Iterator v0_1 = this.tabs.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            v0_1.remove();
            ((Tab)v1).reset();
            this.releaseFromTabPool(((Tab)v1));
        }

        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(@NonNull BaseOnTabSelectedListener arg2) {
        this.selectedListeners.remove(arg2);
    }

    public void removeTab(Tab arg2) {
        if(arg2.parent == this) {
            this.removeTabAt(arg2.getPosition());
            return;
        }

        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int arg6) {
        Tab v6;
        int v0 = this.selectedTab != null ? this.selectedTab.getPosition() : 0;
        this.removeTabViewAt(arg6);
        Object v2 = this.tabs.remove(arg6);
        if(v2 != null) {
            ((Tab)v2).reset();
            this.releaseFromTabPool(((Tab)v2));
        }

        int v2_1 = this.tabs.size();
        int v3;
        for(v3 = arg6; v3 < v2_1; ++v3) {
            this.tabs.get(v3).setPosition(v3);
        }

        if(v0 == arg6) {
            if(this.tabs.isEmpty()) {
                v6 = null;
            }
            else {
                Object v6_1 = this.tabs.get(Math.max(0, arg6 - 1));
            }

            this.selectTab(v6);
        }
    }

    private void removeTabViewAt(int arg3) {
        View v0 = this.slidingTabIndicator.getChildAt(arg3);
        this.slidingTabIndicator.removeViewAt(arg3);
        if(v0 != null) {
            ((TabView)v0).reset();
            this.tabViewPool.release(v0);
        }

        this.requestLayout();
    }

    void selectTab(Tab arg2) {
        this.selectTab(arg2, true);
    }

    void selectTab(Tab arg5, boolean arg6) {
        Tab v0 = this.selectedTab;
        if(v0 != arg5) {
            int v1 = -1;
            int v2 = arg5 != null ? arg5.getPosition() : -1;
            if(arg6) {
                if(v0 != null && v0.getPosition() != v1) {
                    goto label_21;
                }
                else if(v2 != v1) {
                    this.setScrollPosition(v2, 0f, true);
                }
                else {
                label_21:
                    this.animateToTab(v2);
                }

                if(v2 == v1) {
                    goto label_24;
                }

                this.setSelectedTabView(v2);
            }

        label_24:
            this.selectedTab = arg5;
            if(v0 != null) {
                this.dispatchTabUnselected(v0);
            }

            if(arg5 == null) {
                return;
            }

            this.dispatchTabSelected(arg5);
        }
        else if(v0 != null) {
            this.dispatchTabReselected(arg5);
            this.animateToTab(arg5.getPosition());
        }
    }

    public void setInlineLabel(boolean arg3) {
        if(this.inlineLabel != arg3) {
            this.inlineLabel = arg3;
            int v3;
            for(v3 = 0; v3 < this.slidingTabIndicator.getChildCount(); ++v3) {
                View v0 = this.slidingTabIndicator.getChildAt(v3);
                if((v0 instanceof TabView)) {
                    ((TabView)v0).updateOrientation();
                }
            }

            this.applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(@BoolRes int arg2) {
        this.setInlineLabel(this.getResources().getBoolean(arg2));
    }

    @Deprecated public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener arg2) {
        if(this.selectedListener != null) {
            this.removeOnTabSelectedListener(this.selectedListener);
        }

        this.selectedListener = arg2;
        if(arg2 != null) {
            this.addOnTabSelectedListener(arg2);
        }
    }

    void setPagerAdapter(@Nullable PagerAdapter arg3, boolean arg4) {
        if(this.pagerAdapter != null && this.pagerAdapterObserver != null) {
            this.pagerAdapter.unregisterDataSetObserver(this.pagerAdapterObserver);
        }

        this.pagerAdapter = arg3;
        if((arg4) && arg3 != null) {
            if(this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver(this);
            }

            arg3.registerDataSetObserver(this.pagerAdapterObserver);
        }

        this.populateFromPagerAdapter();
    }

    void setScrollAnimatorListener(Animator$AnimatorListener arg2) {
        this.ensureScrollAnimator();
        this.scrollAnimator.addListener(arg2);
    }

    public void setScrollPosition(int arg2, float arg3, boolean arg4) {
        this.setScrollPosition(arg2, arg3, arg4, true);
    }

    void setScrollPosition(int arg3, float arg4, boolean arg5, boolean arg6) {
        int v0 = Math.round((((float)arg3)) + arg4);
        if(v0 >= 0) {
            if(v0 >= this.slidingTabIndicator.getChildCount()) {
            }
            else {
                if(arg6) {
                    this.slidingTabIndicator.setIndicatorPositionFromTabPosition(arg3, arg4);
                }

                if(this.scrollAnimator != null && (this.scrollAnimator.isRunning())) {
                    this.scrollAnimator.cancel();
                }

                this.scrollTo(this.calculateScrollXForTab(arg3, arg4), 0);
                if(arg5) {
                    this.setSelectedTabView(v0);
                }

                return;
            }
        }
    }

    public void setSelectedTabIndicator(@Nullable Drawable arg2) {
        if(this.tabSelectedIndicator != arg2) {
            this.tabSelectedIndicator = arg2;
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicator(@DrawableRes int arg2) {
        if(arg2 != 0) {
            this.setSelectedTabIndicator(AppCompatResources.getDrawable(this.getContext(), arg2));
        }
        else {
            this.setSelectedTabIndicator(null);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int arg2) {
        this.slidingTabIndicator.setSelectedIndicatorColor(arg2);
    }

    public void setSelectedTabIndicatorGravity(int arg2) {
        if(this.tabIndicatorGravity != arg2) {
            this.tabIndicatorGravity = arg2;
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    @Deprecated public void setSelectedTabIndicatorHeight(int arg2) {
        this.slidingTabIndicator.setSelectedIndicatorHeight(arg2);
    }

    private void setSelectedTabView(int arg7) {
        int v0 = this.slidingTabIndicator.getChildCount();
        if(arg7 < v0) {
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                View v3 = this.slidingTabIndicator.getChildAt(v2);
                boolean v4 = true;
                boolean v5 = v2 == arg7 ? true : false;
                v3.setSelected(v5);
                if(v2 == arg7) {
                }
                else {
                    v4 = false;
                }

                v3.setActivated(v4);
            }
        }
    }

    public void setTabGravity(int arg2) {
        if(this.tabGravity != arg2) {
            this.tabGravity = arg2;
            this.applyModeAndGravity();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList arg2) {
        if(this.tabIconTint != arg2) {
            this.tabIconTint = arg2;
            this.updateAllTabs();
        }
    }

    public void setTabIconTintResource(@ColorRes int arg2) {
        this.setTabIconTint(AppCompatResources.getColorStateList(this.getContext(), arg2));
    }

    public void setTabIndicatorFullWidth(boolean arg1) {
        this.tabIndicatorFullWidth = arg1;
        ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
    }

    public void setTabMode(int arg2) {
        if(arg2 != this.mode) {
            this.mode = arg2;
            this.applyModeAndGravity();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList arg3) {
        if(this.tabRippleColorStateList != arg3) {
            this.tabRippleColorStateList = arg3;
            int v3;
            for(v3 = 0; v3 < this.slidingTabIndicator.getChildCount(); ++v3) {
                View v0 = this.slidingTabIndicator.getChildAt(v3);
                if((v0 instanceof TabView)) {
                    TabView.access$000(((TabView)v0), this.getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int arg2) {
        this.setTabRippleColor(AppCompatResources.getColorStateList(this.getContext(), arg2));
    }

    public void setTabTextColors(int arg1, int arg2) {
        this.setTabTextColors(TabLayout.createColorStateList(arg1, arg2));
    }

    public void setTabTextColors(@Nullable ColorStateList arg2) {
        if(this.tabTextColors != arg2) {
            this.tabTextColors = arg2;
            this.updateAllTabs();
        }
    }

    @Deprecated public void setTabsFromPagerAdapter(@Nullable PagerAdapter arg2) {
        this.setPagerAdapter(arg2, false);
    }

    public void setUnboundedRipple(boolean arg3) {
        if(this.unboundedRipple != arg3) {
            this.unboundedRipple = arg3;
            int v3;
            for(v3 = 0; v3 < this.slidingTabIndicator.getChildCount(); ++v3) {
                View v0 = this.slidingTabIndicator.getChildAt(v3);
                if((v0 instanceof TabView)) {
                    TabView.access$000(((TabView)v0), this.getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int arg2) {
        this.setUnboundedRipple(this.getResources().getBoolean(arg2));
    }

    private void setupWithViewPager(@Nullable ViewPager arg3, boolean arg4, boolean arg5) {
        if(this.viewPager != null) {
            if(this.pageChangeListener != null) {
                this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
            }

            if(this.adapterChangeListener == null) {
                goto label_12;
            }

            this.viewPager.removeOnAdapterChangeListener(this.adapterChangeListener);
        }

    label_12:
        BaseOnTabSelectedListener v1 = null;
        if(this.currentVpSelectedListener != null) {
            this.removeOnTabSelectedListener(this.currentVpSelectedListener);
            this.currentVpSelectedListener = v1;
        }

        if(arg3 != null) {
            this.viewPager = arg3;
            if(this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }

            this.pageChangeListener.reset();
            arg3.addOnPageChangeListener(this.pageChangeListener);
            this.currentVpSelectedListener = new ViewPagerOnTabSelectedListener(arg3);
            this.addOnTabSelectedListener(this.currentVpSelectedListener);
            PagerAdapter v0 = arg3.getAdapter();
            if(v0 != null) {
                this.setPagerAdapter(v0, arg4);
            }

            if(this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener(this);
            }

            this.adapterChangeListener.setAutoRefresh(arg4);
            arg3.addOnAdapterChangeListener(this.adapterChangeListener);
            this.setScrollPosition(arg3.getCurrentItem(), 0f, true);
        }
        else {
            this.viewPager = ((ViewPager)v1);
            this.setPagerAdapter(((PagerAdapter)v1), false);
        }

        this.setupViewPagerImplicitly = arg5;
    }

    public void setupWithViewPager(@Nullable ViewPager arg2) {
        this.setupWithViewPager(arg2, true);
    }

    public void setupWithViewPager(@Nullable ViewPager arg2, boolean arg3) {
        this.setupWithViewPager(arg2, arg3, false);
    }

    public boolean shouldDelayChildPressedState() {
        boolean v0 = this.getTabScrollRange() > 0 ? true : false;
        return v0;
    }

    private void updateAllTabs() {
        int v0 = this.tabs.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.tabs.get(v1).updateView();
        }
    }

    private void updateTabViewLayoutParams(LinearLayout$LayoutParams arg3) {
        if(this.mode != 1 || this.tabGravity != 0) {
            arg3.width = -2;
            arg3.weight = 0f;
        }
        else {
            arg3.width = 0;
            arg3.weight = 1f;
        }
    }

    void updateTabViews(boolean arg4) {
        int v0;
        for(v0 = 0; v0 < this.slidingTabIndicator.getChildCount(); ++v0) {
            View v1 = this.slidingTabIndicator.getChildAt(v0);
            v1.setMinimumWidth(this.getTabMinWidth());
            this.updateTabViewLayoutParams(v1.getLayoutParams());
            if(arg4) {
                v1.requestLayout();
            }
        }
    }
}

