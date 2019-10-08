package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=21) class ViewUtilsApi21 extends ViewUtilsApi19 {
    private static final String TAG = "ViewUtilsApi21";
    private static Method sSetAnimationMatrixMethod;
    private static boolean sSetAnimationMatrixMethodFetched;
    private static Method sTransformMatrixToGlobalMethod;
    private static boolean sTransformMatrixToGlobalMethodFetched;
    private static Method sTransformMatrixToLocalMethod;
    private static boolean sTransformMatrixToLocalMethodFetched;

    ViewUtilsApi21() {
        super();
    }

    private void fetchSetAnimationMatrix() {
        if(!ViewUtilsApi21.sSetAnimationMatrixMethodFetched) {
            try {
                ViewUtilsApi21.sSetAnimationMatrixMethod = View.class.getDeclaredMethod("setAnimationMatrix", Matrix.class);
                ViewUtilsApi21.sSetAnimationMatrixMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi21", "Failed to retrieve setAnimationMatrix method", ((Throwable)v1));
            }

            ViewUtilsApi21.sSetAnimationMatrixMethodFetched = true;
        }
    }

    private void fetchTransformMatrixToGlobalMethod() {
        if(!ViewUtilsApi21.sTransformMatrixToGlobalMethodFetched) {
            try {
                ViewUtilsApi21.sTransformMatrixToGlobalMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                ViewUtilsApi21.sTransformMatrixToGlobalMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", ((Throwable)v1));
            }

            ViewUtilsApi21.sTransformMatrixToGlobalMethodFetched = true;
        }
    }

    private void fetchTransformMatrixToLocalMethod() {
        if(!ViewUtilsApi21.sTransformMatrixToLocalMethodFetched) {
            try {
                ViewUtilsApi21.sTransformMatrixToLocalMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                ViewUtilsApi21.sTransformMatrixToLocalMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", ((Throwable)v1));
            }

            ViewUtilsApi21.sTransformMatrixToLocalMethodFetched = true;
        }
    }

    public void setAnimationMatrix(@NonNull View arg4, Matrix arg5) {
        this.fetchSetAnimationMatrix();
        if(ViewUtilsApi21.sSetAnimationMatrixMethod != null) {
            try {
                ViewUtilsApi21.sSetAnimationMatrixMethod.invoke(arg4, arg5);
                return;
            }
            catch(InvocationTargetException ) {
                return;
            }
            catch(IllegalAccessException v4) {
                throw new RuntimeException(v4.getCause());
            }
        }
    }

    public void transformMatrixToGlobal(@NonNull View arg4, @NonNull Matrix arg5) {
        this.fetchTransformMatrixToGlobalMethod();
        if(ViewUtilsApi21.sTransformMatrixToGlobalMethod != null) {
            try {
                ViewUtilsApi21.sTransformMatrixToGlobalMethod.invoke(arg4, arg5);
                return;
            }
            catch(IllegalAccessException ) {
                return;
            }
            catch(InvocationTargetException v4) {
                throw new RuntimeException(v4.getCause());
            }
        }
    }

    public void transformMatrixToLocal(@NonNull View arg4, @NonNull Matrix arg5) {
        this.fetchTransformMatrixToLocalMethod();
        if(ViewUtilsApi21.sTransformMatrixToLocalMethod != null) {
            try {
                ViewUtilsApi21.sTransformMatrixToLocalMethod.invoke(arg4, arg5);
                return;
            }
            catch(IllegalAccessException ) {
                return;
            }
            catch(InvocationTargetException v4) {
                throw new RuntimeException(v4.getCause());
            }
        }
    }
}

