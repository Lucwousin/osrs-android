package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

public class Explode extends Visibility {
    private static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    private int[] mTempLoc;
    private static final TimeInterpolator sAccelerate;
    private static final TimeInterpolator sDecelerate;

    static {
        Explode.sDecelerate = new DecelerateInterpolator();
        Explode.sAccelerate = new AccelerateInterpolator();
    }

    public Explode(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.mTempLoc = new int[2];
        this.setPropagation(new CircularPropagation());
    }

    public Explode() {
        super();
        this.mTempLoc = new int[2];
        this.setPropagation(new CircularPropagation());
    }

    private static float calculateDistance(float arg0, float arg1) {
        return ((float)Math.sqrt(((double)(arg0 * arg0 + arg1 * arg1))));
    }

    private static float calculateMaxDistance(View arg1, int arg2, int arg3) {
        return Explode.calculateDistance(((float)Math.max(arg2, arg1.getWidth() - arg2)), ((float)Math.max(arg3, arg1.getHeight() - arg3)));
    }

    private void calculateOut(View arg16, Rect arg17, int[] arg18) {
        int v7;
        int v6_1;
        View v1 = arg16;
        v1.getLocationOnScreen(this.mTempLoc);
        int v2 = this.mTempLoc[0];
        int v4 = this.mTempLoc[1];
        Rect v6 = this.getEpicenter();
        if(v6 == null) {
            v6_1 = arg16.getWidth() / 2 + v2 + Math.round(arg16.getTranslationX());
            v7 = arg16.getHeight() / 2 + v4 + Math.round(arg16.getTranslationY());
        }
        else {
            int v14 = v6.centerX();
            v7 = v6.centerY();
            v6_1 = v14;
        }

        float v8 = ((float)(arg17.centerX() - v6_1));
        float v9 = ((float)(arg17.centerY() - v7));
        if(v8 == 0f && v9 == 0f) {
            v8 = (((float)(Math.random() * 2))) - 1f;
            v9 = (((float)(Math.random() * 2))) - 1f;
        }

        float v10 = Explode.calculateDistance(v8, v9);
        float v1_1 = Explode.calculateMaxDistance(v1, v6_1 - v2, v7 - v4);
        arg18[0] = Math.round(v8 / v10 * v1_1);
        arg18[1] = Math.round(v1_1 * (v9 / v10));
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        super.captureEndValues(arg1);
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        super.captureStartValues(arg1);
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg7) {
        View v0 = arg7.view;
        v0.getLocationOnScreen(this.mTempLoc);
        arg7.values.put("android:explode:screenBounds", new Rect(this.mTempLoc[0], this.mTempLoc[1], v0.getWidth() + this.mTempLoc[0], v0.getHeight() + this.mTempLoc[1]));
    }

    public Animator onAppear(ViewGroup arg10, View arg11, TransitionValues arg12, TransitionValues arg13) {
        if(arg13 == null) {
            return null;
        }

        Object v12 = arg13.values.get("android:explode:screenBounds");
        float v6 = arg11.getTranslationX();
        float v7 = arg11.getTranslationY();
        this.calculateOut(((View)arg10), ((Rect)v12), this.mTempLoc);
        return TranslationAnimationCreator.createAnimation(arg11, arg13, ((Rect)v12).left, ((Rect)v12).top, v6 + (((float)this.mTempLoc[0])), v7 + (((float)this.mTempLoc[1])), v6, v7, Explode.sDecelerate);
    }

    public Animator onDisappear(ViewGroup arg11, View arg12, TransitionValues arg13, TransitionValues arg14) {
        float v8;
        float v7;
        if(arg13 == null) {
            return null;
        }

        Object v14 = arg13.values.get("android:explode:screenBounds");
        int v2 = ((Rect)v14).left;
        int v3 = ((Rect)v14).top;
        float v4 = arg12.getTranslationX();
        float v5 = arg12.getTranslationY();
        Object v0 = arg13.view.getTag(R$id.transition_position);
        if(v0 != null) {
            v7 = (((float)(v0[0] - ((Rect)v14).left))) + v4;
            v8 = (((float)(v0[1] - ((Rect)v14).top))) + v5;
            ((Rect)v14).offsetTo(v0[0], v0[1]);
        }
        else {
            v7 = v4;
            v8 = v5;
        }

        this.calculateOut(((View)arg11), ((Rect)v14), this.mTempLoc);
        return TranslationAnimationCreator.createAnimation(arg12, arg13, v2, v3, v4, v5, v7 + (((float)this.mTempLoc[0])), v8 + (((float)this.mTempLoc[1])), Explode.sAccelerate);
    }
}

