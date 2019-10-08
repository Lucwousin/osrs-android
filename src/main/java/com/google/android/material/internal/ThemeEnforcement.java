package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class ThemeEnforcement {
    private static final int[] APPCOMPAT_CHECK_ATTRS = null;
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final int[] MATERIAL_CHECK_ATTRS = null;
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";

    static {
        ThemeEnforcement.APPCOMPAT_CHECK_ATTRS = new int[]{R$attr.colorPrimary};
        ThemeEnforcement.MATERIAL_CHECK_ATTRS = new int[]{R$attr.colorSecondary};
    }

    private ThemeEnforcement() {
        super();
    }

    public static void checkAppCompatTheme(Context arg2) {
        ThemeEnforcement.checkTheme(arg2, ThemeEnforcement.APPCOMPAT_CHECK_ATTRS, "Theme.AppCompat");
    }

    private static void checkCompatibleTheme(Context arg1, AttributeSet arg2, @AttrRes int arg3, @StyleRes int arg4) {
        TypedArray v2 = arg1.obtainStyledAttributes(arg2, R$styleable.ThemeEnforcement, arg3, arg4);
        boolean v3 = v2.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
        v2.recycle();
        if(v3) {
            ThemeEnforcement.checkMaterialTheme(arg1);
        }

        ThemeEnforcement.checkAppCompatTheme(arg1);
    }

    public static void checkMaterialTheme(Context arg2) {
        ThemeEnforcement.checkTheme(arg2, ThemeEnforcement.MATERIAL_CHECK_ATTRS, "Theme.MaterialComponents");
    }

    private static void checkTextAppearance(Context arg3, AttributeSet arg4, @StyleableRes int[] arg5, @AttrRes int arg6, @StyleRes int arg7, @StyleableRes int[] arg8) {
        boolean v3;
        TypedArray v0 = arg3.obtainStyledAttributes(arg4, R$styleable.ThemeEnforcement, arg6, arg7);
        if(!v0.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            v0.recycle();
            return;
        }

        if(arg8 != null && arg8.length != 0) {
            v3 = ThemeEnforcement.isCustomTextAppearanceValid(arg3, arg4, arg5, arg6, arg7, arg8);
        }
        else if(v0.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
            v3 = true;
        }
        else {
            v3 = false;
        }

        v0.recycle();
        if(v3) {
            return;
        }

        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    private static void checkTheme(Context arg1, int[] arg2, String arg3) {
        if(ThemeEnforcement.isTheme(arg1, arg2)) {
            return;
        }

        StringBuilder v2 = new StringBuilder();
        v2.append("The style on this component requires your app theme to be ");
        v2.append(arg3);
        v2.append(" (or a descendant).");
        throw new IllegalArgumentException(v2.toString());
    }

    public static boolean isAppCompatTheme(Context arg1) {
        return ThemeEnforcement.isTheme(arg1, ThemeEnforcement.APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(Context arg1, AttributeSet arg2, @StyleableRes int[] arg3, @AttrRes int arg4, @StyleRes int arg5, @StyleableRes int[] arg6) {
        TypedArray v1 = arg1.obtainStyledAttributes(arg2, arg3, arg4, arg5);
        int v2 = arg6.length;
        for(arg4 = 0; arg4 < v2; ++arg4) {
            if(v1.getResourceId(arg6[arg4], -1) == -1) {
                v1.recycle();
                return 0;
            }
        }

        v1.recycle();
        return 1;
    }

    public static boolean isMaterialTheme(Context arg1) {
        return ThemeEnforcement.isTheme(arg1, ThemeEnforcement.MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(Context arg0, int[] arg1) {
        TypedArray v0 = arg0.obtainStyledAttributes(arg1);
        boolean v1 = v0.hasValue(0);
        v0.recycle();
        return v1;
    }

    public static TypedArray obtainStyledAttributes(Context arg0, AttributeSet arg1, @StyleableRes int[] arg2, @AttrRes int arg3, @StyleRes int arg4, @StyleableRes int[] arg5) {
        ThemeEnforcement.checkCompatibleTheme(arg0, arg1, arg3, arg4);
        ThemeEnforcement.checkTextAppearance(arg0, arg1, arg2, arg3, arg4, arg5);
        return arg0.obtainStyledAttributes(arg1, arg2, arg3, arg4);
    }

    public static TintTypedArray obtainTintedStyledAttributes(Context arg0, AttributeSet arg1, @StyleableRes int[] arg2, @AttrRes int arg3, @StyleRes int arg4, @StyleableRes int[] arg5) {
        ThemeEnforcement.checkCompatibleTheme(arg0, arg1, arg3, arg4);
        ThemeEnforcement.checkTextAppearance(arg0, arg1, arg2, arg3, arg4, arg5);
        return TintTypedArray.obtainStyledAttributes(arg0, arg1, arg2, arg3, arg4);
    }
}

