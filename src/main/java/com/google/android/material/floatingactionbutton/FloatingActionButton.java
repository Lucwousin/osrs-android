package com.google.android.material.floatingactionbutton;

import android.animation.Animator$AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@DefaultBehavior(value=Behavior.class) public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget {
    public class BaseBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private OnVisibilityChangedListener internalAutoHideListener;
        private Rect tmpRect;

        public BaseBehavior() {
            super();
            this.autoHideEnabled = true;
        }

        public BaseBehavior(Context arg2, AttributeSet arg3) {
            super(arg2, arg3);
            TypedArray v2 = arg2.obtainStyledAttributes(arg3, R$styleable.FloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = v2.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            v2.recycle();
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull Rect arg3) {
            return this.getInsetDodgeRect(arg1, ((FloatingActionButton)arg2), arg3);
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout arg5, @NonNull FloatingActionButton arg6, @NonNull Rect arg7) {
            arg7.set(arg6.getLeft() + arg6.shadowPadding.left, arg6.getTop() + arg6.shadowPadding.top, arg6.getRight() - arg6.shadowPadding.right, arg6.getBottom() - arg6.shadowPadding.bottom);
            return 1;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        private static boolean isBottomSheet(@NonNull View arg1) {
            ViewGroup$LayoutParams v1 = arg1.getLayoutParams();
            if((v1 instanceof LayoutParams)) {
                return ((LayoutParams)v1).getBehavior() instanceof BottomSheetBehavior;
            }

            return 0;
        }

        private void offsetIfNeeded(CoordinatorLayout arg7, FloatingActionButton arg8) {
            int v2;
            Rect v0 = arg8.shadowPadding;
            if(v0 != null && v0.centerX() > 0 && v0.centerY() > 0) {
                ViewGroup$LayoutParams v1 = arg8.getLayoutParams();
                int v4 = 0;
                if(arg8.getRight() >= arg7.getWidth() - ((LayoutParams)v1).rightMargin) {
                    v2 = v0.right;
                }
                else if(arg8.getLeft() <= ((LayoutParams)v1).leftMargin) {
                    v2 = -v0.left;
                }
                else {
                    v2 = 0;
                }

                if(arg8.getBottom() >= arg7.getHeight() - ((LayoutParams)v1).bottomMargin) {
                    v4 = v0.bottom;
                }
                else if(arg8.getTop() <= ((LayoutParams)v1).topMargin) {
                    v4 = -v0.top;
                }

                if(v4 != 0) {
                    ViewCompat.offsetTopAndBottom(((View)arg8), v4);
                }

                if(v2 == 0) {
                    return;
                }

                ViewCompat.offsetLeftAndRight(((View)arg8), v2);
            }
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams arg2) {
            if(arg2.dodgeInsetEdges == 0) {
                arg2.dodgeInsetEdges = 80;
            }
        }

        public boolean onDependentViewChanged(CoordinatorLayout arg1, View arg2, View arg3) {
            return this.onDependentViewChanged(arg1, ((FloatingActionButton)arg2), arg3);
        }

        public boolean onDependentViewChanged(CoordinatorLayout arg2, FloatingActionButton arg3, View arg4) {
            if((arg4 instanceof AppBarLayout)) {
                this.updateFabVisibilityForAppBarLayout(arg2, ((AppBarLayout)arg4), arg3);
            }
            else if(BaseBehavior.isBottomSheet(arg4)) {
                this.updateFabVisibilityForBottomSheet(arg4, arg3);
            }

            return 0;
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
            return this.onLayoutChild(arg1, ((FloatingActionButton)arg2), arg3);
        }

        public boolean onLayoutChild(CoordinatorLayout arg6, FloatingActionButton arg7, int arg8) {
            List v0 = arg6.getDependencies(((View)arg7));
            int v1 = v0.size();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                Object v3 = v0.get(v2);
                if((v3 instanceof AppBarLayout)) {
                    if(this.updateFabVisibilityForAppBarLayout(arg6, ((AppBarLayout)v3), arg7)) {
                        break;
                    }
                }
                else if((BaseBehavior.isBottomSheet(((View)v3))) && (this.updateFabVisibilityForBottomSheet(((View)v3), arg7))) {
                    break;
                }
            }

            arg6.onLayoutChild(((View)arg7), arg8);
            this.offsetIfNeeded(arg6, arg7);
            return 1;
        }

        public void setAutoHideEnabled(boolean arg1) {
            this.autoHideEnabled = arg1;
        }

        @VisibleForTesting public void setInternalAutoHideListener(OnVisibilityChangedListener arg1) {
            this.internalAutoHideListener = arg1;
        }

        private boolean shouldUpdateVisibility(View arg4, FloatingActionButton arg5) {
            ViewGroup$LayoutParams v0 = arg5.getLayoutParams();
            if(!this.autoHideEnabled) {
                return 0;
            }

            if(((LayoutParams)v0).getAnchorId() != arg4.getId()) {
                return 0;
            }

            if(arg5.getUserSetVisibility() != 0) {
                return 0;
            }

            return 1;
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout arg3, AppBarLayout arg4, FloatingActionButton arg5) {
            if(!this.shouldUpdateVisibility(((View)arg4), arg5)) {
                return 0;
            }

            if(this.tmpRect == null) {
                this.tmpRect = new Rect();
            }

            Rect v0 = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(((ViewGroup)arg3), ((View)arg4), v0);
            if(v0.bottom <= arg4.getMinimumHeightForVisibleOverlappingContent()) {
                arg5.hide(this.internalAutoHideListener, false);
            }
            else {
                arg5.show(this.internalAutoHideListener, false);
            }

            return 1;
        }

        private boolean updateFabVisibilityForBottomSheet(View arg4, FloatingActionButton arg5) {
            if(!this.shouldUpdateVisibility(arg4, arg5)) {
                return 0;
            }

            if(arg4.getTop() < arg5.getHeight() / 2 + arg5.getLayoutParams().topMargin) {
                arg5.hide(this.internalAutoHideListener, false);
            }
            else {
                arg5.show(this.internalAutoHideListener, false);
            }

            return 1;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
            super();
        }

        public Behavior(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout arg1, @NonNull FloatingActionButton arg2, @NonNull Rect arg3) {
            return super.getInsetDodgeRect(arg1, arg2, arg3);
        }

        public boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams arg1) {
            super.onAttachedToLayoutParams(arg1);
        }

        public boolean onDependentViewChanged(CoordinatorLayout arg1, FloatingActionButton arg2, View arg3) {
            return super.onDependentViewChanged(arg1, arg2, arg3);
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, FloatingActionButton arg2, int arg3) {
            return super.onLayoutChild(arg1, arg2, arg3);
        }

        public void setAutoHideEnabled(boolean arg1) {
            super.setAutoHideEnabled(arg1);
        }

        @VisibleForTesting public void setInternalAutoHideListener(OnVisibilityChangedListener arg1) {
            super.setInternalAutoHideListener(arg1);
        }
    }

    public abstract class OnVisibilityChangedListener {
        public OnVisibilityChangedListener() {
            super();
        }

        public void onHidden(FloatingActionButton arg1) {
        }

        public void onShown(FloatingActionButton arg1) {
        }
    }

    class ShadowDelegateImpl implements ShadowViewDelegate {
        ShadowDelegateImpl(FloatingActionButton arg1) {
            FloatingActionButton.this = arg1;
            super();
        }

        public float getRadius() {
            return (((float)FloatingActionButton.this.getSizeDimension())) / 2f;
        }

        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.compatPadding;
        }

        public void setBackgroundDrawable(Drawable arg2) {
            FloatingActionButton.access$101(FloatingActionButton.this, arg2);
        }

        public void setShadowPadding(int arg3, int arg4, int arg5, int arg6) {
            FloatingActionButton.this.shadowPadding.set(arg3, arg4, arg5, arg6);
            FloatingActionButton.this.setPadding(arg3 + FloatingActionButton.this.imagePadding, arg4 + FloatingActionButton.this.imagePadding, arg5 + FloatingActionButton.this.imagePadding, arg6 + FloatingActionButton.this.imagePadding);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Size {
    }

    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL;
    private ColorStateList backgroundTint;
    private PorterDuff$Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final ExpandableWidgetHelper expandableWidgetHelper;
    private final AppCompatImageHelper imageHelper;
    @Nullable private PorterDuff$Mode imageMode;
    private int imagePadding;
    @Nullable private ColorStateList imageTint;
    private FloatingActionButtonImpl impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    public FloatingActionButton(Context arg2) {
        this(arg2, null);
    }

    public FloatingActionButton(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context arg8, AttributeSet arg9, int arg10) {
        super(arg8, arg9, arg10);
        this.shadowPadding = new Rect();
        this.touchArea = new Rect();
        TypedArray v1 = ThemeEnforcement.obtainStyledAttributes(arg8, arg9, R$styleable.FloatingActionButton, arg10, R$style.Widget_Design_FloatingActionButton, new int[0]);
        this.backgroundTint = MaterialResources.getColorStateList(arg8, v1, R$styleable.FloatingActionButton_backgroundTint);
        this.backgroundTintMode = ViewUtils.parseTintMode(v1.getInt(R$styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.rippleColor = MaterialResources.getColorStateList(arg8, v1, R$styleable.FloatingActionButton_rippleColor);
        this.size = v1.getInt(R$styleable.FloatingActionButton_fabSize, -1);
        this.customSize = v1.getDimensionPixelSize(R$styleable.FloatingActionButton_fabCustomSize, 0);
        this.borderWidth = v1.getDimensionPixelSize(R$styleable.FloatingActionButton_borderWidth, 0);
        float v2 = v1.getDimension(R$styleable.FloatingActionButton_elevation, 0f);
        float v4 = v1.getDimension(R$styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0f);
        float v3 = v1.getDimension(R$styleable.FloatingActionButton_pressedTranslationZ, 0f);
        this.compatPadding = v1.getBoolean(R$styleable.FloatingActionButton_useCompatPadding, false);
        this.maxImageSize = v1.getDimensionPixelSize(R$styleable.FloatingActionButton_maxImageSize, 0);
        MotionSpec v0 = MotionSpec.createFromAttribute(arg8, v1, R$styleable.FloatingActionButton_showMotionSpec);
        MotionSpec v8 = MotionSpec.createFromAttribute(arg8, v1, R$styleable.FloatingActionButton_hideMotionSpec);
        v1.recycle();
        this.imageHelper = new AppCompatImageHelper(((ImageView)this));
        this.imageHelper.loadFromAttributes(arg9, arg10);
        this.expandableWidgetHelper = new ExpandableWidgetHelper(((ExpandableWidget)this));
        this.getImpl().setBackgroundDrawable(this.backgroundTint, this.backgroundTintMode, this.rippleColor, this.borderWidth);
        this.getImpl().setElevation(v2);
        this.getImpl().setHoveredFocusedTranslationZ(v4);
        this.getImpl().setPressedTranslationZ(v3);
        this.getImpl().setMaxImageSize(this.maxImageSize);
        this.getImpl().setShowMotionSpec(v0);
        this.getImpl().setHideMotionSpec(v8);
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }

    static int access$000(FloatingActionButton arg0) {
        return arg0.imagePadding;
    }

    static void access$101(FloatingActionButton arg0, Drawable arg1) {
        super.setBackgroundDrawable(arg1);
    }

    public void addOnHideAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        this.getImpl().addOnHideAnimationListener(arg2);
    }

    public void addOnShowAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        this.getImpl().addOnShowAnimationListener(arg2);
    }

    public void clearCustomSize() {
        this.setCustomSize(0);
    }

    private FloatingActionButtonImpl createImpl() {
        if(Build$VERSION.SDK_INT >= 21) {
            return new FloatingActionButtonImplLollipop(((VisibilityAwareImageButton)this), new ShadowDelegateImpl(this));
        }

        return new FloatingActionButtonImpl(((VisibilityAwareImageButton)this), new ShadowDelegateImpl(this));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().onDrawableStateChanged(this.getDrawableState());
    }

    @Nullable public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Nullable public PorterDuff$Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public float getCompatElevation() {
        return this.getImpl().getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().getHoveredFocusedTranslationZ();
    }

    public float getCompatPressedTranslationZ() {
        return this.getImpl().getPressedTranslationZ();
    }

    @NonNull public Drawable getContentBackground() {
        return this.getImpl().getContentBackground();
    }

    @Deprecated public boolean getContentRect(@NonNull Rect arg4) {
        if(ViewCompat.isLaidOut(((View)this))) {
            arg4.set(0, 0, this.getWidth(), this.getHeight());
            this.offsetRectWithShadow(arg4);
            return 1;
        }

        return 0;
    }

    @Px public int getCustomSize() {
        return this.customSize;
    }

    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.getExpandedComponentIdHint();
    }

    public MotionSpec getHideMotionSpec() {
        return this.getImpl().getHideMotionSpec();
    }

    private FloatingActionButtonImpl getImpl() {
        if(this.impl == null) {
            this.impl = this.createImpl();
        }

        return this.impl;
    }

    public void getMeasuredContentRect(@NonNull Rect arg4) {
        arg4.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        this.offsetRectWithShadow(arg4);
    }

    @ColorInt @Deprecated public int getRippleColor() {
        int v0 = this.rippleColor != null ? this.rippleColor.getDefaultColor() : 0;
        return v0;
    }

    @Nullable public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    public MotionSpec getShowMotionSpec() {
        return this.getImpl().getShowMotionSpec();
    }

    public int getSize() {
        return this.size;
    }

    private int getSizeDimension(int arg4) {
        if(this.customSize != 0) {
            return this.customSize;
        }

        Resources v0 = this.getResources();
        if(arg4 != -1) {
            if(arg4 != 1) {
                return v0.getDimensionPixelSize(R$dimen.design_fab_size_normal);
            }

            return v0.getDimensionPixelSize(R$dimen.design_fab_size_mini);
        }

        return Math.max(v0.getConfiguration().screenWidthDp, v0.getConfiguration().screenHeightDp) < 470 ? this.getSizeDimension(1) : this.getSizeDimension(0);
    }

    int getSizeDimension() {
        return this.getSizeDimension(this.size);
    }

    @Nullable public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }

    @Nullable public PorterDuff$Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }

    @Nullable public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    @Nullable public PorterDuff$Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    public void hide() {
        this.hide(null);
    }

    public void hide(@Nullable OnVisibilityChangedListener arg2) {
        this.hide(arg2, true);
    }

    void hide(@Nullable OnVisibilityChangedListener arg2, boolean arg3) {
        this.getImpl().hide(this.wrapOnVisibilityChangedListener(arg2), arg3);
    }

    public boolean isExpanded() {
        return this.expandableWidgetHelper.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        return this.getImpl().isOrWillBeHidden();
    }

    public boolean isOrWillBeShown() {
        return this.getImpl().isOrWillBeShown();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().jumpDrawableToCurrentState();
    }

    private void offsetRectWithShadow(@NonNull Rect arg3) {
        arg3.left += this.shadowPadding.left;
        arg3.top += this.shadowPadding.top;
        arg3.right -= this.shadowPadding.right;
        arg3.bottom -= this.shadowPadding.bottom;
    }

    private void onApplySupportImageTint() {
        Drawable v0 = this.getDrawable();
        if(v0 == null) {
            return;
        }

        if(this.imageTint == null) {
            DrawableCompat.clearColorFilter(v0);
            return;
        }

        int v1 = this.imageTint.getColorForState(this.getDrawableState(), 0);
        PorterDuff$Mode v2 = this.imageMode;
        if(v2 == null) {
            v2 = PorterDuff$Mode.SRC_IN;
        }

        v0.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(v1, v2));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getImpl().onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getImpl().onDetachedFromWindow();
    }

    protected void onMeasure(int arg3, int arg4) {
        int v0 = this.getSizeDimension();
        this.imagePadding = (v0 - this.maxImageSize) / 2;
        this.getImpl().updatePadding();
        arg3 = Math.min(FloatingActionButton.resolveAdjustedSize(v0, arg3), FloatingActionButton.resolveAdjustedSize(v0, arg4));
        this.setMeasuredDimension(this.shadowPadding.left + arg3 + this.shadowPadding.right, arg3 + this.shadowPadding.top + this.shadowPadding.bottom);
    }

    protected void onRestoreInstanceState(Parcelable arg3) {
        if(!(arg3 instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(arg3);
            return;
        }

        super.onRestoreInstanceState(((ExtendableSavedState)arg3).getSuperState());
        this.expandableWidgetHelper.onRestoreInstanceState(((ExtendableSavedState)arg3).extendableStates.get("expandableWidgetHelper"));
    }

    protected Parcelable onSaveInstanceState() {
        ExtendableSavedState v1 = new ExtendableSavedState(super.onSaveInstanceState());
        v1.extendableStates.put("expandableWidgetHelper", this.expandableWidgetHelper.onSaveInstanceState());
        return ((Parcelable)v1);
    }

    public boolean onTouchEvent(MotionEvent arg4) {
        if(arg4.getAction() == 0 && (this.getContentRect(this.touchArea)) && !this.touchArea.contains(((int)arg4.getX()), ((int)arg4.getY()))) {
            return 0;
        }

        return super.onTouchEvent(arg4);
    }

    public void removeOnHideAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        this.getImpl().removeOnHideAnimationListener(arg2);
    }

    public void removeOnShowAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        this.getImpl().removeOnShowAnimationListener(arg2);
    }

    private static int resolveAdjustedSize(int arg2, int arg3) {
        int v0 = View$MeasureSpec.getMode(arg3);
        arg3 = View$MeasureSpec.getSize(arg3);
        if(v0 == 0x80000000) {
            arg2 = Math.min(arg2, arg3);
        }
        else if(v0 != 0) {
            if(v0 == 0x40000000) {
                arg2 = arg3;
            }
            else {
                throw new IllegalArgumentException();
            }
        }

        return arg2;
    }

    public void setBackgroundColor(int arg2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable arg2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int arg2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList arg2) {
        if(this.backgroundTint != arg2) {
            this.backgroundTint = arg2;
            this.getImpl().setBackgroundTintList(arg2);
        }
    }

    public void setBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.backgroundTintMode != arg2) {
            this.backgroundTintMode = arg2;
            this.getImpl().setBackgroundTintMode(arg2);
        }
    }

    public void setCompatElevation(float arg2) {
        this.getImpl().setElevation(arg2);
    }

    public void setCompatElevationResource(@DimenRes int arg2) {
        this.setCompatElevation(this.getResources().getDimension(arg2));
    }

    public void setCompatHoveredFocusedTranslationZ(float arg2) {
        this.getImpl().setHoveredFocusedTranslationZ(arg2);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int arg2) {
        this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(arg2));
    }

    public void setCompatPressedTranslationZ(float arg2) {
        this.getImpl().setPressedTranslationZ(arg2);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int arg2) {
        this.setCompatPressedTranslationZ(this.getResources().getDimension(arg2));
    }

    public void setCustomSize(@Px int arg2) {
        if(arg2 >= 0) {
            this.customSize = arg2;
            return;
        }

        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public boolean setExpanded(boolean arg2) {
        return this.expandableWidgetHelper.setExpanded(arg2);
    }

    public void setExpandedComponentIdHint(@IdRes int arg2) {
        this.expandableWidgetHelper.setExpandedComponentIdHint(arg2);
    }

    public void setHideMotionSpec(MotionSpec arg2) {
        this.getImpl().setHideMotionSpec(arg2);
    }

    public void setHideMotionSpecResource(@AnimatorRes int arg2) {
        this.setHideMotionSpec(MotionSpec.createFromResource(this.getContext(), arg2));
    }

    public void setImageDrawable(@Nullable Drawable arg1) {
        super.setImageDrawable(arg1);
        this.getImpl().updateImageMatrixScale();
    }

    public void setImageResource(@DrawableRes int arg2) {
        this.imageHelper.setImageResource(arg2);
    }

    public void setRippleColor(@ColorInt int arg1) {
        this.setRippleColor(ColorStateList.valueOf(arg1));
    }

    public void setRippleColor(@Nullable ColorStateList arg2) {
        if(this.rippleColor != arg2) {
            this.rippleColor = arg2;
            this.getImpl().setRippleColor(this.rippleColor);
        }
    }

    public void setShowMotionSpec(MotionSpec arg2) {
        this.getImpl().setShowMotionSpec(arg2);
    }

    public void setShowMotionSpecResource(@AnimatorRes int arg2) {
        this.setShowMotionSpec(MotionSpec.createFromResource(this.getContext(), arg2));
    }

    public void setSize(int arg2) {
        this.customSize = 0;
        if(arg2 != this.size) {
            this.size = arg2;
            this.requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList arg1) {
        this.setBackgroundTintList(arg1);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff$Mode arg1) {
        this.setBackgroundTintMode(arg1);
    }

    public void setSupportImageTintList(@Nullable ColorStateList arg2) {
        if(this.imageTint != arg2) {
            this.imageTint = arg2;
            this.onApplySupportImageTint();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.imageMode != arg2) {
            this.imageMode = arg2;
            this.onApplySupportImageTint();
        }
    }

    public void setUseCompatPadding(boolean arg2) {
        if(this.compatPadding != arg2) {
            this.compatPadding = arg2;
            this.getImpl().onCompatShadowChanged();
        }
    }

    public void show() {
        this.show(null);
    }

    public void show(@Nullable OnVisibilityChangedListener arg2) {
        this.show(arg2, true);
    }

    void show(OnVisibilityChangedListener arg2, boolean arg3) {
        this.getImpl().show(this.wrapOnVisibilityChangedListener(arg2), arg3);
    }

    @Nullable private InternalVisibilityChangedListener wrapOnVisibilityChangedListener(@Nullable OnVisibilityChangedListener arg2) {
        if(arg2 == null) {
            return null;
        }

        return new InternalVisibilityChangedListener(arg2) {
            public void onHidden() {
                this.val$listener.onHidden(FloatingActionButton.this);
            }

            public void onShown() {
                this.val$listener.onShown(FloatingActionButton.this);
            }
        };
    }
}

