package com.google.android.material.internal;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class StateListAnimator {
    class com.google.android.material.internal.StateListAnimator$1 extends AnimatorListenerAdapter {
        com.google.android.material.internal.StateListAnimator$1(StateListAnimator arg1) {
            StateListAnimator.this = arg1;
            super();
        }

        public void onAnimationEnd(Animator arg2) {
            if(StateListAnimator.this.runningAnimator == arg2) {
                StateListAnimator.this.runningAnimator = null;
            }
        }
    }

    class Tuple {
        final ValueAnimator animator;
        final int[] specs;

        Tuple(int[] arg1, ValueAnimator arg2) {
            super();
            this.specs = arg1;
            this.animator = arg2;
        }
    }

    private final Animator$AnimatorListener animationListener;
    private Tuple lastMatch;
    ValueAnimator runningAnimator;
    private final ArrayList tuples;

    public StateListAnimator() {
        super();
        this.tuples = new ArrayList();
        this.lastMatch = null;
        this.runningAnimator = null;
        this.animationListener = new com.google.android.material.internal.StateListAnimator$1(this);
    }

    public void addState(int[] arg2, ValueAnimator arg3) {
        Tuple v0 = new Tuple(arg2, arg3);
        arg3.addListener(this.animationListener);
        this.tuples.add(v0);
    }

    private void cancel() {
        if(this.runningAnimator != null) {
            this.runningAnimator.cancel();
            this.runningAnimator = null;
        }
    }

    public void jumpToCurrentState() {
        if(this.runningAnimator != null) {
            this.runningAnimator.end();
            this.runningAnimator = null;
        }
    }

    public void setState(int[] arg5) {
        Object v2;
        int v0 = this.tuples.size();
        int v1 = 0;
        while(true) {
            if(v1 < v0) {
                v2 = this.tuples.get(v1);
                if(StateSet.stateSetMatches(((Tuple)v2).specs, arg5)) {
                }
                else {
                    ++v1;
                    continue;
                }
            }
            else {
                break;
            }

            goto label_13;
        }

        v2 = null;
    label_13:
        if(v2 == this.lastMatch) {
            return;
        }

        if(this.lastMatch != null) {
            this.cancel();
        }

        this.lastMatch = ((Tuple)v2);
        if(v2 != null) {
            this.start(((Tuple)v2));
        }
    }

    private void start(Tuple arg1) {
        this.runningAnimator = arg1.animator;
        this.runningAnimator.start();
    }
}

