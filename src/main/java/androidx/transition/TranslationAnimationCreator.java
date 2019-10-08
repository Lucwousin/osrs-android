package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;

class TranslationAnimationCreator {
    class TransitionPositionListener extends AnimatorListenerAdapter {
        private final View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final View mViewInHierarchy;

        TransitionPositionListener(View arg1, View arg2, int arg3, int arg4, float arg5, float arg6) {
            super();
            this.mMovingView = arg1;
            this.mViewInHierarchy = arg2;
            this.mStartX = arg3 - Math.round(this.mMovingView.getTranslationX());
            this.mStartY = arg4 - Math.round(this.mMovingView.getTranslationY());
            this.mTerminalX = arg5;
            this.mTerminalY = arg6;
            this.mTransitionPosition = this.mViewInHierarchy.getTag(R$id.transition_position);
            if(this.mTransitionPosition != null) {
                this.mViewInHierarchy.setTag(R$id.transition_position, null);
            }
        }

        public void onAnimationCancel(Animator arg4) {
            if(this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }

            this.mTransitionPosition[0] = Math.round((((float)this.mStartX)) + this.mMovingView.getTranslationX());
            this.mTransitionPosition[1] = Math.round((((float)this.mStartY)) + this.mMovingView.getTranslationY());
            this.mViewInHierarchy.setTag(R$id.transition_position, this.mTransitionPosition);
        }

        public void onAnimationEnd(Animator arg2) {
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onAnimationPause(Animator arg2) {
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onAnimationResume(Animator arg2) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }
    }

    private TranslationAnimationCreator() {
        super();
    }

    static Animator createAnimation(View arg16, TransitionValues arg17, int arg18, int arg19, float arg20, float arg21, float arg22, float arg23, TimeInterpolator arg24) {
        float v8_1;
        float v11;
        View v0 = arg16;
        TransitionValues v1 = arg17;
        float v6 = arg16.getTranslationX();
        float v7 = arg16.getTranslationY();
        Object v8 = v1.view.getTag(R$id.transition_position);
        if(v8 != null) {
            v11 = (((float)(v8[0] - arg18))) + v6;
            v8_1 = (((float)(v8[1] - arg19))) + v7;
        }
        else {
            v11 = arg20;
            v8_1 = arg21;
        }

        int v2 = arg18 + Math.round(v11 - v6);
        int v3 = arg19 + Math.round(v8_1 - v7);
        v0.setTranslationX(v11);
        v0.setTranslationY(v8_1);
        if(v11 == arg22 && v8_1 == arg23) {
            return null;
        }

        ObjectAnimator v4 = ObjectAnimator.ofPropertyValuesHolder(v0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{v11, arg22}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{v8_1, arg23})});
        TransitionPositionListener v5 = new TransitionPositionListener(arg16, v1.view, v2, v3, v6, v7);
        v4.addListener(((Animator$AnimatorListener)v5));
        AnimatorUtils.addPauseListener(((Animator)v4), ((AnimatorListenerAdapter)v5));
        v4.setInterpolator(arg24);
        return ((Animator)v4);
    }
}

