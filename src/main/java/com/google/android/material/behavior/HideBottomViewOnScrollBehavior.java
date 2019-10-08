package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;

public class HideBottomViewOnScrollBehavior extends Behavior {
    protected static final int ENTER_ANIMATION_DURATION = 0xE1;
    protected static final int EXIT_ANIMATION_DURATION = 0xAF;
    private static final int STATE_SCROLLED_DOWN = 1;
    private static final int STATE_SCROLLED_UP = 2;
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int height;

    public HideBottomViewOnScrollBehavior() {
        super();
        this.height = 0;
        this.currentState = 2;
    }

    public HideBottomViewOnScrollBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.height = 0;
        this.currentState = 2;
    }

    static ViewPropertyAnimator access$002(HideBottomViewOnScrollBehavior arg0, ViewPropertyAnimator arg1) {
        arg0.currentAnimator = arg1;
        return arg1;
    }

    private void animateChildTo(View arg1, int arg2, long arg3, TimeInterpolator arg5) {
        this.currentAnimator = arg1.animate().translationY(((float)arg2)).setInterpolator(arg5).setDuration(arg3).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator arg2) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    public boolean onLayoutChild(CoordinatorLayout arg2, View arg3, int arg4) {
        this.height = arg3.getMeasuredHeight();
        return super.onLayoutChild(arg2, arg3, arg4);
    }

    public void onNestedScroll(CoordinatorLayout arg1, View arg2, View arg3, int arg4, int arg5, int arg6, int arg7) {
        if(this.currentState != 1 && arg5 > 0) {
            this.slideDown(arg2);
        }
        else if(this.currentState != 2 && arg5 < 0) {
            this.slideUp(arg2);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout arg1, View arg2, View arg3, View arg4, int arg5) {
        boolean v1 = arg5 == 2 ? true : false;
        return v1;
    }

    protected void slideDown(View arg8) {
        if(this.currentAnimator != null) {
            this.currentAnimator.cancel();
            arg8.clearAnimation();
        }

        this.currentState = 1;
        this.animateChildTo(arg8, this.height, 0xAF, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
    }

    protected void slideUp(View arg8) {
        if(this.currentAnimator != null) {
            this.currentAnimator.cancel();
            arg8.clearAnimation();
        }

        this.currentState = 2;
        this.animateChildTo(arg8, 0, 0xE1, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }
}

