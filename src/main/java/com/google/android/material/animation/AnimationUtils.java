package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class AnimationUtils {
    public static final TimeInterpolator DECELERATE_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR;

    static {
        AnimationUtils.LINEAR_INTERPOLATOR = new LinearInterpolator();
        AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
        AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
        AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
        AnimationUtils.DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    }

    public AnimationUtils() {
        super();
    }

    public static float lerp(float arg0, float arg1, float arg2) {
        return arg0 + arg2 * (arg1 - arg0);
    }

    public static int lerp(int arg0, int arg1, float arg2) {
        return arg0 + Math.round(arg2 * (((float)(arg1 - arg0))));
    }
}

