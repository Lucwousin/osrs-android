package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

public class Fade extends Visibility {
    class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean mLayerTypeChanged;
        private final View mView;

        FadeAnimatorListener(View arg2) {
            super();
            this.mLayerTypeChanged = false;
            this.mView = arg2;
        }

        public void onAnimationEnd(Animator arg3) {
            ViewUtils.setTransitionAlpha(this.mView, 1f);
            if(this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator arg3) {
            if((ViewCompat.hasOverlappingRendering(this.mView)) && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }
    }

    public static final int IN = 1;
    private static final String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";

    public Fade(Context arg4, AttributeSet arg5) {
        super(arg4, arg5);
        TypedArray v4 = arg4.obtainStyledAttributes(arg5, Styleable.FADE);
        this.setMode(TypedArrayUtils.getNamedInt(v4, ((XmlPullParser)arg5), "fadingMode", 0, this.getMode()));
        v4.recycle();
    }

    public Fade(int arg1) {
        super();
        this.setMode(arg1);
    }

    public Fade() {
        super();
    }

    public void captureStartValues(@NonNull TransitionValues arg3) {
        super.captureStartValues(arg3);
        arg3.values.put("android:fade:transitionAlpha", Float.valueOf(ViewUtils.getTransitionAlpha(arg3.view)));
    }

    private Animator createAnimation(View arg3, float arg4, float arg5) {
        if(arg4 == arg5) {
            return null;
        }

        ViewUtils.setTransitionAlpha(arg3, arg4);
        ObjectAnimator v4 = ObjectAnimator.ofFloat(arg3, ViewUtils.TRANSITION_ALPHA, new float[]{arg5});
        v4.addListener(new FadeAnimatorListener(arg3));
        this.addListener(new TransitionListenerAdapter(arg3) {
            public void onTransitionEnd(@NonNull Transition arg3) {
                ViewUtils.setTransitionAlpha(this.val$view, 1f);
                ViewUtils.clearNonTransitionAlpha(this.val$view);
                arg3.removeListener(((TransitionListener)this));
            }
        });
        return ((Animator)v4);
    }

    private static float getStartAlpha(TransitionValues arg1, float arg2) {
        if(arg1 != null) {
            Object v1 = arg1.values.get("android:fade:transitionAlpha");
            if(v1 != null) {
                arg2 = ((Float)v1).floatValue();
            }
        }

        return arg2;
    }

    public Animator onAppear(ViewGroup arg2, View arg3, TransitionValues arg4, TransitionValues arg5) {
        float v2 = 0f;
        float v4 = Fade.getStartAlpha(arg4, 0f);
        float v5 = 1f;
        if(v4 == v5) {
        }
        else {
            v2 = v4;
        }

        return this.createAnimation(arg3, v2, v5);
    }

    public Animator onDisappear(ViewGroup arg1, View arg2, TransitionValues arg3, TransitionValues arg4) {
        ViewUtils.saveNonTransitionAlpha(arg2);
        return this.createAnimation(arg2, Fade.getStartAlpha(arg3, 1f), 0f);
    }
}

