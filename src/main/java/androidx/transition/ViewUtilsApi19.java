package androidx.transition;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=19) class ViewUtilsApi19 extends ViewUtilsBase {
    private static final String TAG = "ViewUtilsApi19";
    private static Method sGetTransitionAlphaMethod;
    private static boolean sGetTransitionAlphaMethodFetched;
    private static Method sSetTransitionAlphaMethod;
    private static boolean sSetTransitionAlphaMethodFetched;

    ViewUtilsApi19() {
        super();
    }

    public void clearNonTransitionAlpha(@NonNull View arg1) {
    }

    private void fetchGetTransitionAlphaMethod() {
        if(!ViewUtilsApi19.sGetTransitionAlphaMethodFetched) {
            try {
                ViewUtilsApi19.sGetTransitionAlphaMethod = View.class.getDeclaredMethod("getTransitionAlpha");
                ViewUtilsApi19.sGetTransitionAlphaMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", ((Throwable)v1));
            }

            ViewUtilsApi19.sGetTransitionAlphaMethodFetched = true;
        }
    }

    private void fetchSetTransitionAlphaMethod() {
        if(!ViewUtilsApi19.sSetTransitionAlphaMethodFetched) {
            try {
                ViewUtilsApi19.sSetTransitionAlphaMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                ViewUtilsApi19.sSetTransitionAlphaMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", ((Throwable)v1));
            }

            ViewUtilsApi19.sSetTransitionAlphaMethodFetched = true;
        }
    }

    public float getTransitionAlpha(@NonNull View arg3) {
        this.fetchGetTransitionAlphaMethod();
        if(ViewUtilsApi19.sGetTransitionAlphaMethod == null) {
            goto label_14;
        }

        try {
            return ViewUtilsApi19.sGetTransitionAlphaMethod.invoke(arg3).floatValue();
        }
        catch(IllegalAccessException ) {
        label_14:
            return super.getTransitionAlpha(arg3);
        }
        catch(InvocationTargetException v3) {
            throw new RuntimeException(v3.getCause());
        }
    }

    public void saveNonTransitionAlpha(@NonNull View arg1) {
    }

    public void setTransitionAlpha(@NonNull View arg4, float arg5) {
        this.fetchSetTransitionAlphaMethod();
        if(ViewUtilsApi19.sSetTransitionAlphaMethod != null) {
            try {
                ViewUtilsApi19.sSetTransitionAlphaMethod.invoke(arg4, Float.valueOf(arg5));
                return;
            }
            catch(IllegalAccessException ) {
                return;
            }
            catch(InvocationTargetException v4) {
                throw new RuntimeException(v4.getCause());
            label_16:
                arg4.setAlpha(arg5);
                return;
            }
        }
        else {
            goto label_16;
        }
    }
}

