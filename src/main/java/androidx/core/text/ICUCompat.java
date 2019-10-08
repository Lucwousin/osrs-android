package androidx.core.text;

import android.os.Build$VERSION;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    static {
        if(Build$VERSION.SDK_INT < 21) {
            goto label_18;
        }

        try {
            ICUCompat.sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            return;
        }
        catch(Exception v0) {
            throw new IllegalStateException(((Throwable)v0));
        }

        try {
        label_18:
            Class v0_1 = Class.forName("libcore.icu.ICU");
            if(v0_1 == null) {
                return;
            }

            ICUCompat.sGetScriptMethod = v0_1.getMethod("getScript", String.class);
            ICUCompat.sAddLikelySubtagsMethod = v0_1.getMethod("addLikelySubtags", String.class);
        }
        catch(Exception v0) {
            ICUCompat.sGetScriptMethod = null;
            ICUCompat.sAddLikelySubtagsMethod = null;
            Log.w("ICUCompat", ((Throwable)v0));
        }
    }

    private ICUCompat() {
        super();
    }

    private static String addLikelySubtags(Locale arg3) {
        String v3 = arg3.toString();
        try {
            if(ICUCompat.sAddLikelySubtagsMethod == null) {
                return v3;
            }

            return ICUCompat.sAddLikelySubtagsMethod.invoke(null, v3);
        }
        catch(InvocationTargetException v0) {
            Log.w("ICUCompat", ((Throwable)v0));
        }
        catch(IllegalAccessException v0_1) {
            Log.w("ICUCompat", ((Throwable)v0_1));
        }

        return v3;
    }

    private static String getScript(String arg3) {
        Object v0 = null;
        try {
            if(ICUCompat.sGetScriptMethod == null) {
                goto label_17;
            }

            return ICUCompat.sGetScriptMethod.invoke(v0, arg3);
        }
        catch(InvocationTargetException v3) {
            Log.w("ICUCompat", ((Throwable)v3));
        }
        catch(IllegalAccessException v3_1) {
            Log.w("ICUCompat", ((Throwable)v3_1));
        }

    label_17:
        return ((String)v0);
    }

    @Nullable public static String maximizeAndGetScript(Locale arg3) {
        Object v1 = null;
        if(Build$VERSION.SDK_INT >= 21) {
            try {
                return ICUCompat.sAddLikelySubtagsMethod.invoke(v1, arg3).getScript();
            }
            catch(IllegalAccessException v0) {
                Log.w("ICUCompat", ((Throwable)v0));
            }
            catch(InvocationTargetException v0_1) {
                Log.w("ICUCompat", ((Throwable)v0_1));
            }

            return arg3.getScript();
        }

        String v3 = ICUCompat.addLikelySubtags(arg3);
        if(v3 != null) {
            return ICUCompat.getScript(v3);
        }

        return ((String)v1);
    }
}

