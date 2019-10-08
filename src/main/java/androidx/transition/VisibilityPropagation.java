package androidx.transition;

import android.view.View;

public abstract class VisibilityPropagation extends TransitionPropagation {
    private static final String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
    private static final String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
    private static final String[] VISIBILITY_PROPAGATION_VALUES;

    static {
        VisibilityPropagation.VISIBILITY_PROPAGATION_VALUES = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    public VisibilityPropagation() {
        super();
    }

    public void captureValues(TransitionValues arg7) {
        Integer v1_1;
        View v0 = arg7.view;
        Object v1 = arg7.values.get("android:visibility:visibility");
        if(v1 == null) {
            v1_1 = Integer.valueOf(v0.getVisibility());
        }

        arg7.values.put("android:visibilityPropagation:visibility", v1_1);
        int[] v2 = new int[2];
        v0.getLocationOnScreen(v2);
        v2[0] += Math.round(v0.getTranslationX());
        v2[0] += v0.getWidth() / 2;
        v2[1] += Math.round(v0.getTranslationY());
        v2[1] += v0.getHeight() / 2;
        arg7.values.put("android:visibilityPropagation:center", v2);
    }

    public String[] getPropagationProperties() {
        return VisibilityPropagation.VISIBILITY_PROPAGATION_VALUES;
    }

    private static int getViewCoordinate(TransitionValues arg2, int arg3) {
        int v0 = -1;
        if(arg2 == null) {
            return v0;
        }

        Object v2 = arg2.values.get("android:visibilityPropagation:center");
        if(v2 == null) {
            return v0;
        }

        return v2[arg3];
    }

    public int getViewVisibility(TransitionValues arg3) {
        int v0 = 8;
        if(arg3 == null) {
            return v0;
        }

        Object v3 = arg3.values.get("android:visibilityPropagation:visibility");
        if(v3 == null) {
            return v0;
        }

        return ((Integer)v3).intValue();
    }

    public int getViewX(TransitionValues arg2) {
        return VisibilityPropagation.getViewCoordinate(arg2, 0);
    }

    public int getViewY(TransitionValues arg2) {
        return VisibilityPropagation.getViewCoordinate(arg2, 1);
    }
}

