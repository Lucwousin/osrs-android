package butterknife.internal;

import android.content.Context;
import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Array;
import java.util.List;

public final class Utils {
    private static final TypedValue VALUE;

    static {
        Utils.VALUE = new TypedValue();
    }

    private Utils() {
        super();
        throw new AssertionError("No instances.");
    }

    @SafeVarargs public static Object[] arrayOf(Object[] arg0) {
        return Utils.filterNull(arg0);
    }

    public static Object castParam(Object arg2, String arg3, int arg4, String arg5, int arg6, Class arg7) {
        try {
            return arg7.cast(arg2);
        }
        catch(ClassCastException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("Parameter #");
            v0.append(arg4 + 1);
            v0.append(" of method \'");
            v0.append(arg3);
            v0.append("\' was of the wrong type for parameter #");
            v0.append(arg6 + 1);
            v0.append(" of method \'");
            v0.append(arg5);
            v0.append("\'. See cause for more info.");
            throw new IllegalStateException(v0.toString(), ((Throwable)v2));
        }
    }

    public static Object castView(View arg3, @IdRes int arg4, String arg5, Class arg6) {
        try {
            return arg6.cast(arg3);
        }
        catch(ClassCastException v6) {
            String v3 = Utils.getResourceEntryName(arg3, arg4);
            StringBuilder v1 = new StringBuilder();
            v1.append("View \'");
            v1.append(v3);
            v1.append("\' with ID ");
            v1.append(arg4);
            v1.append(" for ");
            v1.append(arg5);
            v1.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(v1.toString(), ((Throwable)v6));
        }
    }

    private static Object[] filterNull(Object[] arg6) {
        int v0 = arg6.length;
        int v2 = 0;
        int v3 = 0;
        while(v2 < v0) {
            Object v4 = arg6[v2];
            if(v4 != null) {
                arg6[v3] = v4;
                ++v3;
            }

            ++v2;
        }

        if(v3 == v0) {
            return arg6;
        }

        Object v0_1 = Array.newInstance(arg6.getClass().getComponentType(), v3);
        System.arraycopy(arg6, 0, v0_1, 0, v3);
        return ((Object[])v0_1);
    }

    public static Object findOptionalViewAsType(View arg0, @IdRes int arg1, String arg2, Class arg3) {
        return Utils.castView(arg0.findViewById(arg1), arg1, arg2, arg3);
    }

    public static View findRequiredView(View arg3, @IdRes int arg4, String arg5) {
        View v0 = arg3.findViewById(arg4);
        if(v0 != null) {
            return v0;
        }

        String v3 = Utils.getResourceEntryName(arg3, arg4);
        StringBuilder v1 = new StringBuilder();
        v1.append("Required view \'");
        v1.append(v3);
        v1.append("\' with ID ");
        v1.append(arg4);
        v1.append(" for ");
        v1.append(arg5);
        v1.append(" was not found. If this view is optional add \'@Nullable\' (fields) or \'@Optional\' (methods) annotation.");
        throw new IllegalStateException(v1.toString());
    }

    public static Object findRequiredViewAsType(View arg0, @IdRes int arg1, String arg2, Class arg3) {
        return Utils.castView(Utils.findRequiredView(arg0, arg1, arg2), arg1, arg2, arg3);
    }

    @UiThread public static float getFloat(Context arg3, @DimenRes int arg4) {
        TypedValue v0 = Utils.VALUE;
        arg3.getResources().getValue(arg4, v0, true);
        if(v0.type == 4) {
            return v0.getFloat();
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Resource ID #0x");
        v1.append(Integer.toHexString(arg4));
        v1.append(" type #0x");
        v1.append(Integer.toHexString(v0.type));
        v1.append(" is not valid");
        throw new Resources$NotFoundException(v1.toString());
    }

    private static String getResourceEntryName(View arg1, @IdRes int arg2) {
        if(arg1.isInEditMode()) {
            return "<unavailable while editing>";
        }

        return arg1.getContext().getResources().getResourceEntryName(arg2);
    }

    @UiThread public static Drawable getTintedDrawable(Context arg3, @DrawableRes int arg4, @AttrRes int arg5) {
        if(arg3.getTheme().resolveAttribute(arg5, Utils.VALUE, true)) {
            Drawable v4 = DrawableCompat.wrap(ContextCompat.getDrawable(arg3, arg4).mutate());
            DrawableCompat.setTint(v4, ContextCompat.getColor(arg3, Utils.VALUE.resourceId));
            return v4;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Required tint color attribute with name ");
        v0.append(arg3.getResources().getResourceEntryName(arg5));
        v0.append(" and attribute ID ");
        v0.append(arg5);
        v0.append(" was not found.");
        throw new Resources$NotFoundException(v0.toString());
    }

    @SafeVarargs public static List listOf(Object[] arg1) {
        return new ImmutableList(Utils.filterNull(arg1));
    }
}

