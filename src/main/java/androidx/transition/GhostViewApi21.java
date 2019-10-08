package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=21) class GhostViewApi21 implements GhostViewImpl {
    private static final String TAG = "GhostViewApi21";
    private final View mGhostView;
    private static Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static Class sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;

    private GhostViewApi21(@NonNull View arg1) {
        super();
        this.mGhostView = arg1;
    }

    static GhostViewImpl addGhost(View arg5, ViewGroup arg6, Matrix arg7) {
        GhostViewApi21.fetchAddGhostMethod();
        Object v1 = null;
        if(GhostViewApi21.sAddGhostMethod == null) {
            goto label_22;
        }

        try {
            return new GhostViewApi21(GhostViewApi21.sAddGhostMethod.invoke(v1, arg5, arg6, arg7));
        }
        catch(IllegalAccessException ) {
        label_22:
            return ((GhostViewImpl)v1);
        }
        catch(InvocationTargetException v5) {
            throw new RuntimeException(v5.getCause());
        }
    }

    private static void fetchAddGhostMethod() {
        if(!GhostViewApi21.sAddGhostMethodFetched) {
            try {
                GhostViewApi21.fetchGhostViewClass();
                GhostViewApi21.sAddGhostMethod = GhostViewApi21.sGhostViewClass.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                GhostViewApi21.sAddGhostMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", ((Throwable)v1));
            }

            GhostViewApi21.sAddGhostMethodFetched = true;
        }
    }

    private static void fetchGhostViewClass() {
        if(!GhostViewApi21.sGhostViewClassFetched) {
            try {
                GhostViewApi21.sGhostViewClass = Class.forName("android.view.GhostView");
            }
            catch(ClassNotFoundException v0) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", ((Throwable)v0));
            }

            GhostViewApi21.sGhostViewClassFetched = true;
        }
    }

    private static void fetchRemoveGhostMethod() {
        if(!GhostViewApi21.sRemoveGhostMethodFetched) {
            try {
                GhostViewApi21.fetchGhostViewClass();
                GhostViewApi21.sRemoveGhostMethod = GhostViewApi21.sGhostViewClass.getDeclaredMethod("removeGhost", View.class);
                GhostViewApi21.sRemoveGhostMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", ((Throwable)v1));
            }

            GhostViewApi21.sRemoveGhostMethodFetched = true;
        }
    }

    static void removeGhost(View arg4) {
        GhostViewApi21.fetchRemoveGhostMethod();
        if(GhostViewApi21.sRemoveGhostMethod != null) {
            try {
                GhostViewApi21.sRemoveGhostMethod.invoke(null, arg4);
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

    public void reserveEndViewTransition(ViewGroup arg1, View arg2) {
    }

    public void setVisibility(int arg2) {
        this.mGhostView.setVisibility(arg2);
    }
}

