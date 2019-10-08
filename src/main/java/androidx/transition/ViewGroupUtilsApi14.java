package androidx.transition;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final String TAG = "ViewGroupUtilsApi14";
    private static Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static LayoutTransition sEmptyLayoutTransition;
    private static Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;

    private ViewGroupUtilsApi14() {
        super();
    }

    private static void cancelLayoutTransition(LayoutTransition arg5) {
        if(!ViewGroupUtilsApi14.sCancelMethodFetched) {
            try {
                ViewGroupUtilsApi14.sCancelMethod = LayoutTransition.class.getDeclaredMethod("cancel");
                ViewGroupUtilsApi14.sCancelMethod.setAccessible(true);
            }
            catch(NoSuchMethodException ) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }

            ViewGroupUtilsApi14.sCancelMethodFetched = true;
        }

        if(ViewGroupUtilsApi14.sCancelMethod != null) {
            try {
                ViewGroupUtilsApi14.sCancelMethod.invoke(arg5);
            }
            catch(InvocationTargetException ) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
            catch(IllegalAccessException ) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
        }
    }

    static void suppressLayout(@NonNull ViewGroup arg5, boolean arg6) {
        boolean v2 = false;
        Animator v3 = null;
        if(ViewGroupUtilsApi14.sEmptyLayoutTransition == null) {
            ViewGroupUtilsApi14.sEmptyLayoutTransition = new LayoutTransition() {
                public boolean isChangingLayout() {
                    return 1;
                }
            };
            ViewGroupUtilsApi14.sEmptyLayoutTransition.setAnimator(2, v3);
            ViewGroupUtilsApi14.sEmptyLayoutTransition.setAnimator(0, v3);
            ViewGroupUtilsApi14.sEmptyLayoutTransition.setAnimator(1, v3);
            ViewGroupUtilsApi14.sEmptyLayoutTransition.setAnimator(3, v3);
            ViewGroupUtilsApi14.sEmptyLayoutTransition.setAnimator(4, v3);
        }

        if(arg6) {
            LayoutTransition v6 = arg5.getLayoutTransition();
            if(v6 != null) {
                if(v6.isRunning()) {
                    ViewGroupUtilsApi14.cancelLayoutTransition(v6);
                }

                if(v6 == ViewGroupUtilsApi14.sEmptyLayoutTransition) {
                    goto label_31;
                }

                arg5.setTag(R$id.transition_layout_save, v6);
            }

        label_31:
            arg5.setLayoutTransition(ViewGroupUtilsApi14.sEmptyLayoutTransition);
            return;
        }

        arg5.setLayoutTransition(((LayoutTransition)v3));
        if(!ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched) {
            try {
                ViewGroupUtilsApi14.sLayoutSuppressedField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                ViewGroupUtilsApi14.sLayoutSuppressedField.setAccessible(true);
            }
            catch(NoSuchFieldException ) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }

            ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched = true;
        }

        if(ViewGroupUtilsApi14.sLayoutSuppressedField == null) {
            goto label_63;
        }

        try {
            arg6 = ViewGroupUtilsApi14.sLayoutSuppressedField.getBoolean(arg5);
            if(arg6) {
                goto label_53;
            }

            goto label_58;
        }
        catch(IllegalAccessException ) {
            goto label_60;
        }

        try {
        label_53:
            ViewGroupUtilsApi14.sLayoutSuppressedField.setBoolean(arg5, false);
            goto label_58;
        }
        catch(IllegalAccessException ) {
            v2 = arg6;
        }

    label_60:
        Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
        goto label_63;
    label_58:
        v2 = arg6;
    label_63:
        if(v2) {
            arg5.requestLayout();
        }

        Object v6_1 = arg5.getTag(R$id.transition_layout_save);
        if(v6_1 != null) {
            arg5.setTag(R$id.transition_layout_save, v3);
            arg5.setLayoutTransition(((LayoutTransition)v6_1));
        }
    }
}

