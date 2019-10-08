package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @Nullable private AnimatorSet currentAnimation;

    public ExpandableTransformationBehavior() {
        super();
    }

    public ExpandableTransformationBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    static AnimatorSet access$002(ExpandableTransformationBehavior arg0, AnimatorSet arg1) {
        arg0.currentAnimation = arg1;
        return arg1;
    }

    @NonNull protected abstract AnimatorSet onCreateExpandedStateChangeAnimation(View arg1, View arg2, boolean arg3, boolean arg4);

    @CallSuper protected boolean onExpandedStateChange(View arg4, View arg5, boolean arg6, boolean arg7) {
        boolean v0 = this.currentAnimation != null ? true : false;
        if(v0) {
            this.currentAnimation.cancel();
        }

        this.currentAnimation = this.onCreateExpandedStateChangeAnimation(arg4, arg5, arg6, v0);
        this.currentAnimation.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator arg2) {
                ExpandableTransformationBehavior.this.currentAnimation = null;
            }
        });
        this.currentAnimation.start();
        if(!arg7) {
            this.currentAnimation.end();
        }

        return 1;
    }
}

