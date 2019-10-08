package androidx.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=22) class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static final String TAG = "ViewUtilsApi22";
    private static Method sSetLeftTopRightBottomMethod;
    private static boolean sSetLeftTopRightBottomMethodFetched;

    ViewUtilsApi22() {
        super();
    }

    @SuppressLint(value={"PrivateApi"}) private void fetchSetLeftTopRightBottomMethod() {
        if(!ViewUtilsApi22.sSetLeftTopRightBottomMethodFetched) {
            try {
                ViewUtilsApi22.sSetLeftTopRightBottomMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                ViewUtilsApi22.sSetLeftTopRightBottomMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", ((Throwable)v1));
            }

            ViewUtilsApi22.sSetLeftTopRightBottomMethodFetched = true;
        }
    }

    public void setLeftTopRightBottom(View arg4, int arg5, int arg6, int arg7, int arg8) {
        this.fetchSetLeftTopRightBottomMethod();
        if(ViewUtilsApi22.sSetLeftTopRightBottomMethod != null) {
            try {
                ViewUtilsApi22.sSetLeftTopRightBottomMethod.invoke(arg4, Integer.valueOf(arg5), Integer.valueOf(arg6), Integer.valueOf(arg7), Integer.valueOf(arg8));
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

