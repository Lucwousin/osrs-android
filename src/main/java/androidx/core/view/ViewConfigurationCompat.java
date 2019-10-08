package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

public final class ViewConfigurationCompat {
    private static final String TAG = "ViewConfigCompat";
    private static Method sGetScaledScrollFactorMethod;

    static {
        if(Build$VERSION.SDK_INT == 25) {
            try {
                ViewConfigurationCompat.sGetScaledScrollFactorMethod = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor");
            }
            catch(Exception ) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private ViewConfigurationCompat() {
        super();
    }

    private static float getLegacyScrollFactor(ViewConfiguration arg3, Context arg4) {
        if(Build$VERSION.SDK_INT >= 25 && ViewConfigurationCompat.sGetScaledScrollFactorMethod != null) {
            try {
                return ((float)ViewConfigurationCompat.sGetScaledScrollFactorMethod.invoke(arg3).intValue());
            }
            catch(Exception ) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }

        TypedValue v3 = new TypedValue();
        if(arg4.getTheme().resolveAttribute(0x101004D, v3, true)) {
            return v3.getDimension(arg4.getResources().getDisplayMetrics());
        }

        return 0;
    }

    public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration arg2, @NonNull Context arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getScaledHorizontalScrollFactor();
        }

        return ViewConfigurationCompat.getLegacyScrollFactor(arg2, arg3);
    }

    public static int getScaledHoverSlop(ViewConfiguration arg2) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.getScaledHoverSlop();
        }

        return arg2.getScaledTouchSlop() / 2;
    }

    @Deprecated public static int getScaledPagingTouchSlop(ViewConfiguration arg0) {
        return arg0.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration arg2, @NonNull Context arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getScaledVerticalScrollFactor();
        }

        return ViewConfigurationCompat.getLegacyScrollFactor(arg2, arg3);
    }

    @Deprecated public static boolean hasPermanentMenuKey(ViewConfiguration arg0) {
        return arg0.hasPermanentMenuKey();
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration arg2, @NonNull Context arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.shouldShowMenuShortcutsWhenKeyboardPresent();
        }

        Resources v2 = arg3.getResources();
        int v3 = v2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        boolean v2_1 = v3 == 0 || !v2.getBoolean(v3) ? false : true;
        return v2_1;
    }
}

