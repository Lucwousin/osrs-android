package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ChangeScroll extends Transition {
    private static final String[] PROPERTIES = null;
    private static final String PROPNAME_SCROLL_X = "android:changeScroll:x";
    private static final String PROPNAME_SCROLL_Y = "android:changeScroll:y";

    static {
        ChangeScroll.PROPERTIES = new String[]{"android:changeScroll:x", "android:changeScroll:y"};
    }

    public ChangeScroll(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public ChangeScroll() {
        super();
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg4) {
        arg4.values.put("android:changeScroll:x", Integer.valueOf(arg4.view.getScrollX()));
        arg4.values.put("android:changeScroll:y", Integer.valueOf(arg4.view.getScrollY()));
    }

    @Nullable public Animator createAnimator(@NonNull ViewGroup arg9, @Nullable TransitionValues arg10, @Nullable TransitionValues arg11) {
        Animator v1_2;
        Animator v9 = null;
        if(arg10 != null) {
            if(arg11 == null) {
            }
            else {
                View v0 = arg11.view;
                int v1 = arg10.values.get("android:changeScroll:x").intValue();
                int v2 = arg11.values.get("android:changeScroll:x").intValue();
                int v10 = arg10.values.get("android:changeScroll:y").intValue();
                int v11 = arg11.values.get("android:changeScroll:y").intValue();
                int v5 = 2;
                if(v1 != v2) {
                    v0.setScrollX(v1);
                    int[] v7 = new int[v5];
                    v7[0] = v1;
                    v7[1] = v2;
                    ObjectAnimator v1_1 = ObjectAnimator.ofInt(v0, "scrollX", v7);
                }
                else {
                    v1_2 = v9;
                }

                if(v10 != v11) {
                    v0.setScrollY(v10);
                    int[] v2_1 = new int[v5];
                    v2_1[0] = v10;
                    v2_1[1] = v11;
                    ObjectAnimator v9_1 = ObjectAnimator.ofInt(v0, "scrollY", v2_1);
                }

                return TransitionUtils.mergeAnimators(v1_2, v9);
            }
        }

        return v9;
    }

    @Nullable public String[] getTransitionProperties() {
        return ChangeScroll.PROPERTIES;
    }
}

