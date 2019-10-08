package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

public class ChangeClipBounds extends Transition {
    private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final String[] sTransitionProperties;

    static {
        ChangeClipBounds.sTransitionProperties = new String[]{"android:clipBounds:clip"};
    }

    public ChangeClipBounds(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public ChangeClipBounds() {
        super();
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg5) {
        View v0 = arg5.view;
        if(v0.getVisibility() == 8) {
            return;
        }

        Rect v1 = ViewCompat.getClipBounds(v0);
        arg5.values.put("android:clipBounds:clip", v1);
        if(v1 == null) {
            arg5.values.put("android:clipBounds:bounds", new Rect(0, 0, v0.getWidth(), v0.getHeight()));
        }
    }

    public Animator createAnimator(@NonNull ViewGroup arg8, TransitionValues arg9, TransitionValues arg10) {
        Animator v8 = null;
        if(arg9 != null && arg10 != null && (arg9.values.containsKey("android:clipBounds:clip"))) {
            if(!arg10.values.containsKey("android:clipBounds:clip")) {
            }
            else {
                Object v0 = arg9.values.get("android:clipBounds:clip");
                Object v1 = arg10.values.get("android:clipBounds:clip");
                int v4 = v1 == null ? 1 : 0;
                if(v0 == null && v1 == null) {
                    return v8;
                }

                if(v0 == null) {
                    v0 = arg9.values.get("android:clipBounds:bounds");
                }
                else if(v1 == null) {
                    v1 = arg10.values.get("android:clipBounds:bounds");
                }

                if(((Rect)v0).equals(v1)) {
                    return v8;
                }

                ViewCompat.setClipBounds(arg10.view, ((Rect)v0));
                ObjectAnimator v8_1 = ObjectAnimator.ofObject(arg10.view, ViewUtils.CLIP_BOUNDS, new RectEvaluator(new Rect()), new Rect[]{v0, v1});
                if(v4 != 0) {
                    v8_1.addListener(new AnimatorListenerAdapter(arg10.view) {
                        public void onAnimationEnd(Animator arg2) {
                            ViewCompat.setClipBounds(this.val$endView, null);
                        }
                    });
                }

                return ((Animator)v8_1);
            }
        }

        return v8;
    }

    public String[] getTransitionProperties() {
        return ChangeClipBounds.sTransitionProperties;
    }
}

