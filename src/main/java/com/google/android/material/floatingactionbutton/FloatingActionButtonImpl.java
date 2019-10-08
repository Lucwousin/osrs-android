package com.google.android.material.floatingactionbutton;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$animator;
import com.google.android.material.R$color;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.CircularBorderDrawable;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shadow.ShadowViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FloatingActionButtonImpl {
    class DisabledElevationAnimation extends ShadowAnimatorImpl {
        DisabledElevationAnimation(FloatingActionButtonImpl arg2) {
            FloatingActionButtonImpl.this = arg2;
            super(arg2, null);
        }

        protected float getTargetShadowSize() {
            return 0;
        }
    }

    class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl arg2) {
            FloatingActionButtonImpl.this = arg2;
            super(arg2, null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation + FloatingActionButtonImpl.this.hoveredFocusedTranslationZ;
        }
    }

    class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToPressedTranslationZAnimation(FloatingActionButtonImpl arg2) {
            FloatingActionButtonImpl.this = arg2;
            super(arg2, null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation + FloatingActionButtonImpl.this.pressedTranslationZ;
        }
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    class ResetElevationAnimation extends ShadowAnimatorImpl {
        ResetElevationAnimation(FloatingActionButtonImpl arg2) {
            FloatingActionButtonImpl.this = arg2;
            super(arg2, null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation;
        }
    }

    abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        private boolean validValues;

        private ShadowAnimatorImpl(FloatingActionButtonImpl arg1) {
            FloatingActionButtonImpl.this = arg1;
            super();
        }

        ShadowAnimatorImpl(FloatingActionButtonImpl arg1, com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1 arg2) {
            this(arg1);
        }

        protected abstract float getTargetShadowSize();

        public void onAnimationEnd(Animator arg2) {
            FloatingActionButtonImpl.this.shadowDrawable.setShadowSize(this.shadowSizeEnd);
            this.validValues = false;
        }

        public void onAnimationUpdate(ValueAnimator arg5) {
            if(!this.validValues) {
                this.shadowSizeStart = FloatingActionButtonImpl.this.shadowDrawable.getShadowSize();
                this.shadowSizeEnd = this.getTargetShadowSize();
                this.validValues = true;
            }

            FloatingActionButtonImpl.this.shadowDrawable.setShadowSize(this.shadowSizeStart + (this.shadowSizeEnd - this.shadowSizeStart) * arg5.getAnimatedFraction());
        }
    }

    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = null;
    static final int[] EMPTY_STATE_SET = null;
    static final int[] ENABLED_STATE_SET = null;
    static final int[] FOCUSED_ENABLED_STATE_SET = null;
    private static final float HIDE_ICON_SCALE = 0f;
    private static final float HIDE_OPACITY = 0f;
    private static final float HIDE_SCALE = 0f;
    static final int[] HOVERED_ENABLED_STATE_SET = null;
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = null;
    static final int[] PRESSED_ENABLED_STATE_SET = null;
    private static final float SHOW_ICON_SCALE = 1f;
    private static final float SHOW_OPACITY = 1f;
    private static final float SHOW_SCALE = 1f;
    int animState;
    CircularBorderDrawable borderDrawable;
    Drawable contentBackground;
    @Nullable Animator currentAnimator;
    @Nullable private MotionSpec defaultHideMotionSpec;
    @Nullable private MotionSpec defaultShowMotionSpec;
    float elevation;
    private ArrayList hideListeners;
    @Nullable MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    float imageMatrixScale;
    int maxImageSize;
    private ViewTreeObserver$OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    Drawable rippleDrawable;
    private float rotation;
    ShadowDrawableWrapper shadowDrawable;
    final ShadowViewDelegate shadowViewDelegate;
    Drawable shapeDrawable;
    private ArrayList showListeners;
    @Nullable MotionSpec showMotionSpec;
    private final StateListAnimator stateListAnimator;
    private final Matrix tmpMatrix;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;
    final VisibilityAwareImageButton view;

    static {
        FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET = new int[]{0x10100A7, 0x101009E};
        FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET = new int[]{0x1010367, 0x101009C, 0x101009E};
        FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET = new int[]{0x101009C, 0x101009E};
        FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET = new int[]{0x1010367, 0x101009E};
        FloatingActionButtonImpl.ENABLED_STATE_SET = new int[]{0x101009E};
        FloatingActionButtonImpl.EMPTY_STATE_SET = new int[0];
    }

    FloatingActionButtonImpl(VisibilityAwareImageButton arg2, ShadowViewDelegate arg3) {
        super();
        this.animState = 0;
        this.imageMatrixScale = 1f;
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpMatrix = new Matrix();
        this.view = arg2;
        this.shadowViewDelegate = arg3;
        this.stateListAnimator = new StateListAnimator();
        this.stateListAnimator.addState(FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET, this.createElevationAnimator(new ElevateToPressedTranslationZAnimation(this)));
        this.stateListAnimator.addState(FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET, this.createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation(this)));
        this.stateListAnimator.addState(FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET, this.createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation(this)));
        this.stateListAnimator.addState(FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET, this.createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation(this)));
        this.stateListAnimator.addState(FloatingActionButtonImpl.ENABLED_STATE_SET, this.createElevationAnimator(new ResetElevationAnimation(this)));
        this.stateListAnimator.addState(FloatingActionButtonImpl.EMPTY_STATE_SET, this.createElevationAnimator(new DisabledElevationAnimation(this)));
        this.rotation = this.view.getRotation();
    }

    public void addOnHideAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        if(this.hideListeners == null) {
            this.hideListeners = new ArrayList();
        }

        this.hideListeners.add(arg2);
    }

    void addOnShowAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        if(this.showListeners == null) {
            this.showListeners = new ArrayList();
        }

        this.showListeners.add(arg2);
    }

    private void calculateImageMatrixFromScale(float arg6, Matrix arg7) {
        arg7.reset();
        Drawable v0 = this.view.getDrawable();
        if(v0 != null && this.maxImageSize != 0) {
            RectF v1 = this.tmpRectF1;
            RectF v2 = this.tmpRectF2;
            v1.set(0f, 0f, ((float)v0.getIntrinsicWidth()), ((float)v0.getIntrinsicHeight()));
            v2.set(0f, 0f, ((float)this.maxImageSize), ((float)this.maxImageSize));
            arg7.setRectToRect(v1, v2, Matrix$ScaleToFit.CENTER);
            arg7.postScale(arg6, arg6, (((float)this.maxImageSize)) / 2f, (((float)this.maxImageSize)) / 2f);
        }
    }

    @NonNull private AnimatorSet createAnimator(@NonNull MotionSpec arg7, float arg8, float arg9, float arg10) {
        ArrayList v0 = new ArrayList();
        ObjectAnimator v8 = ObjectAnimator.ofFloat(this.view, View.ALPHA, new float[]{arg8});
        arg7.getTiming("opacity").apply(((Animator)v8));
        ((List)v0).add(v8);
        v8 = ObjectAnimator.ofFloat(this.view, View.SCALE_X, new float[]{arg9});
        arg7.getTiming("scale").apply(((Animator)v8));
        ((List)v0).add(v8);
        v8 = ObjectAnimator.ofFloat(this.view, View.SCALE_Y, new float[]{arg9});
        arg7.getTiming("scale").apply(((Animator)v8));
        ((List)v0).add(v8);
        this.calculateImageMatrixFromScale(arg10, this.tmpMatrix);
        v8 = ObjectAnimator.ofObject(this.view, new ImageMatrixProperty(), new MatrixEvaluator(), new Matrix[]{new Matrix(this.tmpMatrix)});
        arg7.getTiming("iconScale").apply(((Animator)v8));
        ((List)v0).add(v8);
        AnimatorSet v7 = new AnimatorSet();
        AnimatorSetCompat.playTogether(v7, ((List)v0));
        return v7;
    }

    CircularBorderDrawable createBorderDrawable(int arg7, ColorStateList arg8) {
        Context v0 = this.view.getContext();
        CircularBorderDrawable v1 = this.newCircularDrawable();
        v1.setGradientColors(ContextCompat.getColor(v0, R$color.design_fab_stroke_top_outer_color), ContextCompat.getColor(v0, R$color.design_fab_stroke_top_inner_color), ContextCompat.getColor(v0, R$color.design_fab_stroke_end_inner_color), ContextCompat.getColor(v0, R$color.design_fab_stroke_end_outer_color));
        v1.setBorderWidth(((float)arg7));
        v1.setBorderTint(arg8);
        return v1;
    }

    private ValueAnimator createElevationAnimator(@NonNull ShadowAnimatorImpl arg4) {
        ValueAnimator v0 = new ValueAnimator();
        v0.setInterpolator(FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR);
        v0.setDuration(100);
        v0.addListener(((Animator$AnimatorListener)arg4));
        v0.addUpdateListener(((ValueAnimator$AnimatorUpdateListener)arg4));
        v0.setFloatValues(new float[]{0f, 1f});
        return v0;
    }

    GradientDrawable createShapeDrawable() {
        GradientDrawable v0 = this.newGradientDrawableForShape();
        v0.setShape(1);
        v0.setColor(-1);
        return v0;
    }

    private void ensurePreDrawListener() {
        if(this.preDrawListener == null) {
            this.preDrawListener = new ViewTreeObserver$OnPreDrawListener() {
                public boolean onPreDraw() {
                    FloatingActionButtonImpl.this.onPreDraw();
                    return 1;
                }
            };
        }
    }

    final Drawable getContentBackground() {
        return this.contentBackground;
    }

    private MotionSpec getDefaultHideMotionSpec() {
        if(this.defaultHideMotionSpec == null) {
            this.defaultHideMotionSpec = MotionSpec.createFromResource(this.view.getContext(), R$animator.design_fab_hide_motion_spec);
        }

        return this.defaultHideMotionSpec;
    }

    private MotionSpec getDefaultShowMotionSpec() {
        if(this.defaultShowMotionSpec == null) {
            this.defaultShowMotionSpec = MotionSpec.createFromResource(this.view.getContext(), R$animator.design_fab_show_motion_spec);
        }

        return this.defaultShowMotionSpec;
    }

    float getElevation() {
        return this.elevation;
    }

    @Nullable final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    void getPadding(Rect arg2) {
        this.shadowDrawable.getPadding(arg2);
    }

    float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    @Nullable final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    void hide(@Nullable InternalVisibilityChangedListener arg3, boolean arg4) {
        if(this.isOrWillBeHidden()) {
            return;
        }

        if(this.currentAnimator != null) {
            this.currentAnimator.cancel();
        }

        if(this.shouldAnimateVisibilityChange()) {
            MotionSpec v0 = this.hideMotionSpec != null ? this.hideMotionSpec : this.getDefaultHideMotionSpec();
            AnimatorSet v0_1 = this.createAnimator(v0, 0f, 0f, 0f);
            v0_1.addListener(new AnimatorListenerAdapter(arg4, arg3) {
                private boolean cancelled;

                public void onAnimationCancel(Animator arg1) {
                    this.cancelled = true;
                }

                public void onAnimationEnd(Animator arg3) {
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    if(!this.cancelled) {
                        VisibilityAwareImageButton v3 = FloatingActionButtonImpl.this.view;
                        int v0 = this.val$fromUser ? 8 : 4;
                        v3.internalSetVisibility(v0, this.val$fromUser);
                        if(this.val$listener == null) {
                            return;
                        }

                        this.val$listener.onHidden();
                    }
                }

                public void onAnimationStart(Animator arg4) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, this.val$fromUser);
                    FloatingActionButtonImpl.this.animState = 1;
                    FloatingActionButtonImpl.this.currentAnimator = arg4;
                    this.cancelled = false;
                }
            });
            if(this.hideListeners != null) {
                Iterator v3 = this.hideListeners.iterator();
                while(v3.hasNext()) {
                    v0_1.addListener(v3.next());
                }
            }

            v0_1.start();
        }
        else {
            VisibilityAwareImageButton v0_2 = this.view;
            int v1 = arg4 ? 8 : 4;
            v0_2.internalSetVisibility(v1, arg4);
            if(arg3 == null) {
                return;
            }

            arg3.onHidden();
        }
    }

    boolean isOrWillBeHidden() {
        boolean v1 = false;
        if(this.view.getVisibility() == 0) {
            if(this.animState == 1) {
                v1 = true;
            }

            return v1;
        }

        if(this.animState != 2) {
            v1 = true;
        }

        return v1;
    }

    boolean isOrWillBeShown() {
        boolean v1 = false;
        if(this.view.getVisibility() != 0) {
            if(this.animState == 2) {
                v1 = true;
            }

            return v1;
        }

        if(this.animState != 1) {
            v1 = true;
        }

        return v1;
    }

    void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawable();
    }

    GradientDrawable newGradientDrawableForShape() {
        return new GradientDrawable();
    }

    void onAttachedToWindow() {
        if(this.requirePreDrawListener()) {
            this.ensurePreDrawListener();
            this.view.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        }
    }

    void onCompatShadowChanged() {
    }

    void onDetachedFromWindow() {
        if(this.preDrawListener != null) {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            this.preDrawListener = null;
        }
    }

    void onDrawableStateChanged(int[] arg2) {
        this.stateListAnimator.setState(arg2);
    }

    void onElevationsChanged(float arg1, float arg2, float arg3) {
        if(this.shadowDrawable != null) {
            this.shadowDrawable.setShadowSize(arg1, this.pressedTranslationZ + arg1);
            this.updatePadding();
        }
    }

    void onPaddingUpdated(Rect arg1) {
    }

    void onPreDraw() {
        float v0 = this.view.getRotation();
        if(this.rotation != v0) {
            this.rotation = v0;
            this.updateFromViewRotation();
        }
    }

    public void removeOnHideAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        if(this.hideListeners == null) {
            return;
        }

        this.hideListeners.remove(arg2);
    }

    void removeOnShowAnimationListener(@NonNull Animator$AnimatorListener arg2) {
        if(this.showListeners == null) {
            return;
        }

        this.showListeners.remove(arg2);
    }

    boolean requirePreDrawListener() {
        return 1;
    }

    void setBackgroundDrawable(ColorStateList arg8, PorterDuff$Mode arg9, ColorStateList arg10, int arg11) {
        Drawable[] v8;
        this.shapeDrawable = DrawableCompat.wrap(this.createShapeDrawable());
        DrawableCompat.setTintList(this.shapeDrawable, arg8);
        if(arg9 != null) {
            DrawableCompat.setTintMode(this.shapeDrawable, arg9);
        }

        this.rippleDrawable = DrawableCompat.wrap(this.createShapeDrawable());
        DrawableCompat.setTintList(this.rippleDrawable, RippleUtils.convertToRippleDrawableColor(arg10));
        int v9 = 2;
        if(arg11 > 0) {
            this.borderDrawable = this.createBorderDrawable(arg11, arg8);
            v8 = new Drawable[3];
            v8[0] = this.borderDrawable;
            v8[1] = this.shapeDrawable;
            v8[v9] = this.rippleDrawable;
        }
        else {
            this.borderDrawable = null;
            v8 = new Drawable[v9];
            v8[0] = this.shapeDrawable;
            v8[1] = this.rippleDrawable;
        }

        this.contentBackground = new LayerDrawable(v8);
        this.shadowDrawable = new ShadowDrawableWrapper(this.view.getContext(), this.contentBackground, this.shadowViewDelegate.getRadius(), this.elevation, this.elevation + this.pressedTranslationZ);
        this.shadowDrawable.setAddPaddingForCorners(false);
        this.shadowViewDelegate.setBackgroundDrawable(this.shadowDrawable);
    }

    void setBackgroundTintList(ColorStateList arg2) {
        if(this.shapeDrawable != null) {
            DrawableCompat.setTintList(this.shapeDrawable, arg2);
        }

        if(this.borderDrawable != null) {
            this.borderDrawable.setBorderTint(arg2);
        }
    }

    void setBackgroundTintMode(PorterDuff$Mode arg2) {
        if(this.shapeDrawable != null) {
            DrawableCompat.setTintMode(this.shapeDrawable, arg2);
        }
    }

    final void setElevation(float arg3) {
        if(this.elevation != arg3) {
            this.elevation = arg3;
            this.onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    final void setHideMotionSpec(@Nullable MotionSpec arg1) {
        this.hideMotionSpec = arg1;
    }

    final void setHoveredFocusedTranslationZ(float arg3) {
        if(this.hoveredFocusedTranslationZ != arg3) {
            this.hoveredFocusedTranslationZ = arg3;
            this.onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    final void setImageMatrixScale(float arg2) {
        this.imageMatrixScale = arg2;
        Matrix v0 = this.tmpMatrix;
        this.calculateImageMatrixFromScale(arg2, v0);
        this.view.setImageMatrix(v0);
    }

    final void setMaxImageSize(int arg2) {
        if(this.maxImageSize != arg2) {
            this.maxImageSize = arg2;
            this.updateImageMatrixScale();
        }
    }

    final void setPressedTranslationZ(float arg3) {
        if(this.pressedTranslationZ != arg3) {
            this.pressedTranslationZ = arg3;
            this.onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    void setRippleColor(ColorStateList arg2) {
        if(this.rippleDrawable != null) {
            DrawableCompat.setTintList(this.rippleDrawable, RippleUtils.convertToRippleDrawableColor(arg2));
        }
    }

    final void setShowMotionSpec(@Nullable MotionSpec arg1) {
        this.showMotionSpec = arg1;
    }

    private boolean shouldAnimateVisibilityChange() {
        boolean v0 = !ViewCompat.isLaidOut(this.view) || (this.view.isInEditMode()) ? false : true;
        return v0;
    }

    void show(@Nullable InternalVisibilityChangedListener arg4, boolean arg5) {
        if(this.isOrWillBeShown()) {
            return;
        }

        if(this.currentAnimator != null) {
            this.currentAnimator.cancel();
        }

        float v1 = 1f;
        if(this.shouldAnimateVisibilityChange()) {
            if(this.view.getVisibility() != 0) {
                this.view.setAlpha(0f);
                this.view.setScaleY(0f);
                this.view.setScaleX(0f);
                this.setImageMatrixScale(0f);
            }

            MotionSpec v0 = this.showMotionSpec != null ? this.showMotionSpec : this.getDefaultShowMotionSpec();
            AnimatorSet v0_1 = this.createAnimator(v0, v1, v1, v1);
            v0_1.addListener(new AnimatorListenerAdapter(arg5, arg4) {
                public void onAnimationEnd(Animator arg2) {
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    if(this.val$listener != null) {
                        this.val$listener.onShown();
                    }
                }

                public void onAnimationStart(Animator arg4) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, this.val$fromUser);
                    FloatingActionButtonImpl.this.animState = 2;
                    FloatingActionButtonImpl.this.currentAnimator = arg4;
                }
            });
            if(this.showListeners != null) {
                Iterator v4 = this.showListeners.iterator();
                while(v4.hasNext()) {
                    v0_1.addListener(v4.next());
                }
            }

            v0_1.start();
        }
        else {
            this.view.internalSetVisibility(0, arg5);
            this.view.setAlpha(v1);
            this.view.setScaleY(v1);
            this.view.setScaleX(v1);
            this.setImageMatrixScale(v1);
            if(arg4 == null) {
                return;
            }

            arg4.onShown();
        }
    }

    private void updateFromViewRotation() {
        if(Build$VERSION.SDK_INT == 19) {
            Paint v2 = null;
            if(this.rotation % 90f != 0f) {
                if(this.view.getLayerType() != 1) {
                    this.view.setLayerType(1, v2);
                }
            }
            else if(this.view.getLayerType() != 0) {
                this.view.setLayerType(0, v2);
            }
        }

        if(this.shadowDrawable != null) {
            this.shadowDrawable.setRotation(-this.rotation);
        }

        if(this.borderDrawable != null) {
            this.borderDrawable.setRotation(-this.rotation);
        }
    }

    final void updateImageMatrixScale() {
        this.setImageMatrixScale(this.imageMatrixScale);
    }

    final void updatePadding() {
        Rect v0 = this.tmpRect;
        this.getPadding(v0);
        this.onPaddingUpdated(v0);
        this.shadowViewDelegate.setShadowPadding(v0.left, v0.top, v0.right, v0.bottom);
    }
}

