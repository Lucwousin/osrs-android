package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.CircularBorderDrawable;
import com.google.android.material.internal.CircularBorderDrawableLollipop;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shadow.ShadowViewDelegate;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(value=21) class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {
    class AlwaysStatefulGradientDrawable extends GradientDrawable {
        AlwaysStatefulGradientDrawable() {
            super();
        }

        public boolean isStateful() {
            return 1;
        }
    }

    private InsetDrawable insetDrawable;

    FloatingActionButtonImplLollipop(VisibilityAwareImageButton arg1, ShadowViewDelegate arg2) {
        super(arg1, arg2);
    }

    @NonNull private Animator createElevationAnimator(float arg7, float arg8) {
        AnimatorSet v0 = new AnimatorSet();
        v0.play(ObjectAnimator.ofFloat(this.view, "elevation", new float[]{arg7}).setDuration(0)).with(ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Z, new float[]{arg8}).setDuration(100));
        v0.setInterpolator(FloatingActionButtonImplLollipop.ELEVATION_ANIM_INTERPOLATOR);
        return ((Animator)v0);
    }

    public float getElevation() {
        return this.view.getElevation();
    }

    void getPadding(Rect arg6) {
        if(this.shadowViewDelegate.isCompatPaddingEnabled()) {
            float v0 = this.shadowViewDelegate.getRadius();
            float v2 = this.getElevation() + this.pressedTranslationZ;
            int v3 = ((int)Math.ceil(((double)ShadowDrawableWrapper.calculateHorizontalPadding(v2, v0, false))));
            int v0_1 = ((int)Math.ceil(((double)ShadowDrawableWrapper.calculateVerticalPadding(v2, v0, false))));
            arg6.set(v3, v0_1, v3, v0_1);
        }
        else {
            arg6.set(0, 0, 0, 0);
        }
    }

    void jumpDrawableToCurrentState() {
    }

    CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawableLollipop();
    }

    GradientDrawable newGradientDrawableForShape() {
        return new AlwaysStatefulGradientDrawable();
    }

    void onCompatShadowChanged() {
        this.updatePadding();
    }

    void onDrawableStateChanged(int[] arg3) {
        if(Build$VERSION.SDK_INT == 21) {
            if(this.view.isEnabled()) {
                this.view.setElevation(this.elevation);
                if(this.view.isPressed()) {
                    this.view.setTranslationZ(this.pressedTranslationZ);
                }
                else {
                    if(!this.view.isFocused()) {
                        if(this.view.isHovered()) {
                        }
                        else {
                            this.view.setTranslationZ(0f);
                            return;
                        }
                    }

                    this.view.setTranslationZ(this.hoveredFocusedTranslationZ);
                }
            }
            else {
                this.view.setElevation(0f);
                this.view.setTranslationZ(0f);
            }
        }
    }

    void onElevationsChanged(float arg9, float arg10, float arg11) {
        if(Build$VERSION.SDK_INT == 21) {
            this.view.refreshDrawableState();
        }
        else {
            StateListAnimator v0 = new StateListAnimator();
            v0.addState(FloatingActionButtonImplLollipop.PRESSED_ENABLED_STATE_SET, this.createElevationAnimator(arg9, arg11));
            v0.addState(FloatingActionButtonImplLollipop.HOVERED_FOCUSED_ENABLED_STATE_SET, this.createElevationAnimator(arg9, arg10));
            v0.addState(FloatingActionButtonImplLollipop.FOCUSED_ENABLED_STATE_SET, this.createElevationAnimator(arg9, arg10));
            v0.addState(FloatingActionButtonImplLollipop.HOVERED_ENABLED_STATE_SET, this.createElevationAnimator(arg9, arg10));
            AnimatorSet v10 = new AnimatorSet();
            ArrayList v11 = new ArrayList();
            ((List)v11).add(ObjectAnimator.ofFloat(this.view, "elevation", new float[]{arg9}).setDuration(0));
            long v6 = 100;
            if(Build$VERSION.SDK_INT >= 22 && Build$VERSION.SDK_INT <= 24) {
                ((List)v11).add(ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Z, new float[]{this.view.getTranslationZ()}).setDuration(v6));
            }

            ((List)v11).add(ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Z, new float[]{0f}).setDuration(v6));
            v10.playSequentially(((List)v11).toArray(new Animator[0]));
            v10.setInterpolator(FloatingActionButtonImplLollipop.ELEVATION_ANIM_INTERPOLATOR);
            v0.addState(FloatingActionButtonImplLollipop.ENABLED_STATE_SET, ((Animator)v10));
            v0.addState(FloatingActionButtonImplLollipop.EMPTY_STATE_SET, this.createElevationAnimator(0f, 0f));
            this.view.setStateListAnimator(v0);
        }

        if(this.shadowViewDelegate.isCompatPaddingEnabled()) {
            this.updatePadding();
        }
    }

    void onPaddingUpdated(Rect arg8) {
        if(this.shadowViewDelegate.isCompatPaddingEnabled()) {
            this.insetDrawable = new InsetDrawable(this.rippleDrawable, arg8.left, arg8.top, arg8.right, arg8.bottom);
            this.shadowViewDelegate.setBackgroundDrawable(this.insetDrawable);
        }
        else {
            this.shadowViewDelegate.setBackgroundDrawable(this.rippleDrawable);
        }
    }

    boolean requirePreDrawListener() {
        return 0;
    }

    void setBackgroundDrawable(ColorStateList arg3, PorterDuff$Mode arg4, ColorStateList arg5, int arg6) {
        LayerDrawable v3;
        this.shapeDrawable = DrawableCompat.wrap(this.createShapeDrawable());
        DrawableCompat.setTintList(this.shapeDrawable, arg3);
        if(arg4 != null) {
            DrawableCompat.setTintMode(this.shapeDrawable, arg4);
        }

        CircularBorderDrawable v4 = null;
        if(arg6 > 0) {
            this.borderDrawable = this.createBorderDrawable(arg6, arg3);
            v3 = new LayerDrawable(new Drawable[]{this.borderDrawable, this.shapeDrawable});
        }
        else {
            this.borderDrawable = v4;
            Drawable v3_1 = this.shapeDrawable;
        }

        this.rippleDrawable = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(arg5), ((Drawable)v3), ((Drawable)v4));
        this.contentBackground = this.rippleDrawable;
        this.shadowViewDelegate.setBackgroundDrawable(this.rippleDrawable);
    }

    void setRippleColor(ColorStateList arg2) {
        if((this.rippleDrawable instanceof RippleDrawable)) {
            this.rippleDrawable.setColor(RippleUtils.convertToRippleDrawableColor(arg2));
        }
        else {
            super.setRippleColor(arg2);
        }
    }
}

