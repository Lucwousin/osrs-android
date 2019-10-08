package androidx.transition;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=18) class ViewGroupUtilsApi18 {
    private static final String TAG = "ViewUtilsApi18";
    private static Method sSuppressLayoutMethod;
    private static boolean sSuppressLayoutMethodFetched;

    private ViewGroupUtilsApi18() {
        super();
    }

    private static void fetchSuppressLayoutMethod() {
        if(!ViewGroupUtilsApi18.sSuppressLayoutMethodFetched) {
            try {
                ViewGroupUtilsApi18.sSuppressLayoutMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                ViewGroupUtilsApi18.sSuppressLayoutMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", ((Throwable)v1));
            }

            ViewGroupUtilsApi18.sSuppressLayoutMethodFetched = true;
        }
    }

    static void suppressLayout(@NonNull ViewGroup arg3, boolean arg4) {
        ViewGroupUtilsApi18.fetchSuppressLayoutMethod();
        if(ViewGroupUtilsApi18.sSuppressLayoutMethod != null) {
            try {
                ViewGroupUtilsApi18.sSuppressLayoutMethod.invoke(arg3, Boolean.valueOf(arg4));
            }
            catch(InvocationTargetException v3) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", ((Throwable)v3));
            }
            catch(IllegalAccessException v3_1) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", ((Throwable)v3_1));
            }
        }
    }
}

