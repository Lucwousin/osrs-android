package androidx.core.widget;

import android.os.Build$VERSION;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
        super();
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow arg4) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg4.getOverlapAnchor();
        }

        if(Build$VERSION.SDK_INT >= 21) {
            if(!PopupWindowCompat.sOverlapAnchorFieldAttempted) {
                try {
                    PopupWindowCompat.sOverlapAnchorField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    PopupWindowCompat.sOverlapAnchorField.setAccessible(true);
                }
                catch(NoSuchFieldException v1) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable)v1));
                }

                PopupWindowCompat.sOverlapAnchorFieldAttempted = true;
            }

            if(PopupWindowCompat.sOverlapAnchorField == null) {
                return 0;
            }

            try {
                return PopupWindowCompat.sOverlapAnchorField.get(arg4).booleanValue();
            }
            catch(IllegalAccessException v4) {
                Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", ((Throwable)v4));
            }
        }

        return 0;
    }

    public static int getWindowLayoutType(@NonNull PopupWindow arg5) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg5.getWindowLayoutType();
        }

        if(!PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted) {
            try {
                PopupWindowCompat.sGetWindowLayoutTypeMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType");
                PopupWindowCompat.sGetWindowLayoutTypeMethod.setAccessible(true);
                goto label_16;
            }
            catch(Exception ) {
            label_16:
                PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted = true;
            }
        }

        if(PopupWindowCompat.sGetWindowLayoutTypeMethod == null) {
            return 0;
        }

        try {
            return PopupWindowCompat.sGetWindowLayoutTypeMethod.invoke(arg5).intValue();
        }
        catch(Exception ) {
            return 0;
        }
    }

    public static void setOverlapAnchor(@NonNull PopupWindow arg4, boolean arg5) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg4.setOverlapAnchor(arg5);
            return;
        }

        if(Build$VERSION.SDK_INT >= 21) {
            if(!PopupWindowCompat.sOverlapAnchorFieldAttempted) {
                try {
                    PopupWindowCompat.sOverlapAnchorField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    PopupWindowCompat.sOverlapAnchorField.setAccessible(true);
                }
                catch(NoSuchFieldException v1) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable)v1));
                }

                PopupWindowCompat.sOverlapAnchorFieldAttempted = true;
            }

            if(PopupWindowCompat.sOverlapAnchorField == null) {
                return;
            }

            try {
                PopupWindowCompat.sOverlapAnchorField.set(arg4, Boolean.valueOf(arg5));
            }
            catch(IllegalAccessException v4) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable)v4));
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow arg6, int arg7) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg6.setWindowLayoutType(arg7);
            return;
        }

        if(!PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted) {
            try {
                PopupWindowCompat.sSetWindowLayoutTypeMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                PopupWindowCompat.sSetWindowLayoutTypeMethod.setAccessible(true);
                goto label_18;
            }
            catch(Exception ) {
            label_18:
                PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted = true;
            }
        }

        if(PopupWindowCompat.sSetWindowLayoutTypeMethod != null) {
            try {
                PopupWindowCompat.sSetWindowLayoutTypeMethod.invoke(arg6, Integer.valueOf(arg7));
                return;
            }
            catch(Exception ) {
                return;
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow arg2, @NonNull View arg3, int arg4, int arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.showAsDropDown(arg3, arg4, arg5, arg6);
        }
        else {
            if((GravityCompat.getAbsoluteGravity(arg6, ViewCompat.getLayoutDirection(arg3)) & 7) == 5) {
                arg4 -= arg2.getWidth() - arg3.getWidth();
            }

            arg2.showAsDropDown(arg3, arg4, arg5);
        }
    }
}

