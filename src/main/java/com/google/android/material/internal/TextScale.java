package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import java.util.Map;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class TextScale extends Transition {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    public TextScale() {
        super();
    }

    public void captureEndValues(TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg3) {
        if((arg3.view instanceof TextView)) {
            arg3.values.put("android:textscale:scale", Float.valueOf(arg3.view.getScaleX()));
        }
    }

    public Animator createAnimator(ViewGroup arg4, TransitionValues arg5, TransitionValues arg6) {
        Animator v4 = null;
        if(arg5 != null && arg6 != null && ((arg5.view instanceof TextView))) {
            if(!(arg6.view instanceof TextView)) {
            }
            else {
                View v0 = arg6.view;
                Map v5 = arg5.values;
                Map v6 = arg6.values;
                float v2 = 1f;
                float v5_1 = v5.get("android:textscale:scale") != null ? v5.get("android:textscale:scale").floatValue() : 1f;
                if(v6.get("android:textscale:scale") != null) {
                    v2 = v6.get("android:textscale:scale").floatValue();
                }

                if(v5_1 == v2) {
                    return v4;
                }

                ValueAnimator v4_1 = ValueAnimator.ofFloat(new float[]{v5_1, v2});
                v4_1.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(((TextView)v0)) {
                    public void onAnimationUpdate(ValueAnimator arg2) {
                        float v2 = arg2.getAnimatedValue().floatValue();
                        this.val$view.setScaleX(v2);
                        this.val$view.setScaleY(v2);
                    }
                });
                return ((Animator)v4_1);
            }
        }

        return v4;
    }
}

