package com.google.android.material.circularreveal;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build$VERSION;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class CircularRevealCompat {
    private CircularRevealCompat() {
        super();
    }

    public static Animator createCircularReveal(CircularRevealWidget arg6, float arg7, float arg8, float arg9) {
        ObjectAnimator v0 = ObjectAnimator.ofObject(arg6, CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealEvaluator.CIRCULAR_REVEAL, new RevealInfo[]{new RevealInfo(arg7, arg8, arg9)});
        if(Build$VERSION.SDK_INT >= 21) {
            RevealInfo v1 = arg6.getRevealInfo();
            if(v1 != null) {
                Animator v6 = ViewAnimationUtils.createCircularReveal(((View)arg6), ((int)arg7), ((int)arg8), v1.radius, arg9);
                AnimatorSet v7 = new AnimatorSet();
                v7.playTogether(new Animator[]{v0, v6});
                return ((Animator)v7);
            }

            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }

        return ((Animator)v0);
    }

    public static Animator createCircularReveal(CircularRevealWidget arg7, float arg8, float arg9, float arg10, float arg11) {
        Property v0 = CircularRevealProperty.CIRCULAR_REVEAL;
        TypeEvaluator v1 = CircularRevealEvaluator.CIRCULAR_REVEAL;
        int v2 = 2;
        RevealInfo[] v3 = new RevealInfo[v2];
        v3[0] = new RevealInfo(arg8, arg9, arg10);
        v3[1] = new RevealInfo(arg8, arg9, arg11);
        ObjectAnimator v0_1 = ObjectAnimator.ofObject(arg7, v0, v1, ((Object[])v3));
        if(Build$VERSION.SDK_INT >= 21) {
            Animator v7 = ViewAnimationUtils.createCircularReveal(((View)arg7), ((int)arg8), ((int)arg9), arg10, arg11);
            AnimatorSet v8 = new AnimatorSet();
            Animator[] v9 = new Animator[v2];
            v9[0] = v0_1;
            v9[1] = v7;
            v8.playTogether(v9);
            return ((Animator)v8);
        }

        return ((Animator)v0_1);
    }

    public static Animator$AnimatorListener createCircularRevealListener(CircularRevealWidget arg1) {
        return new AnimatorListenerAdapter(arg1) {
            public void onAnimationEnd(Animator arg1) {
                this.val$view.destroyCircularRevealCache();
            }

            public void onAnimationStart(Animator arg1) {
                this.val$view.buildCircularRevealCache();
            }
        };
    }
}

