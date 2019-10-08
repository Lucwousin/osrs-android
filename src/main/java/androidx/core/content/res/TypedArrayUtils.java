package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
        super();
    }

    public static int getAttr(@NonNull Context arg2, int arg3, int arg4) {
        TypedValue v0 = new TypedValue();
        arg2.getTheme().resolveAttribute(arg3, v0, true);
        if(v0.resourceId != 0) {
            return arg3;
        }

        return arg4;
    }

    public static boolean getBoolean(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2, boolean arg3) {
        return arg0.getBoolean(arg1, arg0.getBoolean(arg2, arg3));
    }

    @Nullable public static Drawable getDrawable(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2) {
        Drawable v1 = arg0.getDrawable(arg1);
        if(v1 == null) {
            v1 = arg0.getDrawable(arg2);
        }

        return v1;
    }

    public static int getInt(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2, int arg3) {
        return arg0.getInt(arg1, arg0.getInt(arg2, arg3));
    }

    public static boolean getNamedBoolean(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3, boolean arg4) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return arg4;
        }

        return arg0.getBoolean(arg3, arg4);
    }

    @ColorInt public static int getNamedColor(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3, @ColorInt int arg4) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return arg4;
        }

        return arg0.getColor(arg3, arg4);
    }

    public static ComplexColorCompat getNamedComplexColor(@NonNull TypedArray arg1, @NonNull XmlPullParser arg2, @Nullable Resources$Theme arg3, @NonNull String arg4, @StyleableRes int arg5, @ColorInt int arg6) {
        if(TypedArrayUtils.hasAttribute(arg2, arg4)) {
            TypedValue v2 = new TypedValue();
            arg1.getValue(arg5, v2);
            if(v2.type >= 28 && v2.type <= 0x1F) {
                return ComplexColorCompat.from(v2.data);
            }

            ComplexColorCompat v1 = ComplexColorCompat.inflate(arg1.getResources(), arg1.getResourceId(arg5, 0), arg3);
            if(v1 == null) {
                goto label_20;
            }

            return v1;
        }

    label_20:
        return ComplexColorCompat.from(arg6);
    }

    public static float getNamedFloat(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3, float arg4) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return arg4;
        }

        return arg0.getFloat(arg3, arg4);
    }

    public static int getNamedInt(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3, int arg4) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return arg4;
        }

        return arg0.getInt(arg3, arg4);
    }

    @AnyRes public static int getNamedResourceId(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3, @AnyRes int arg4) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return arg4;
        }

        return arg0.getResourceId(arg3, arg4);
    }

    @Nullable public static String getNamedString(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, @StyleableRes int arg3) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return null;
        }

        return arg0.getString(arg3);
    }

    @AnyRes public static int getResourceId(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2, @AnyRes int arg3) {
        return arg0.getResourceId(arg1, arg0.getResourceId(arg2, arg3));
    }

    @Nullable public static String getString(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2) {
        String v1 = arg0.getString(arg1);
        if(v1 == null) {
            v1 = arg0.getString(arg2);
        }

        return v1;
    }

    @Nullable public static CharSequence getText(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2) {
        CharSequence v1 = arg0.getText(arg1);
        if(v1 == null) {
            v1 = arg0.getText(arg2);
        }

        return v1;
    }

    @Nullable public static CharSequence[] getTextArray(@NonNull TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2) {
        CharSequence[] v1 = arg0.getTextArray(arg1);
        if(v1 == null) {
            v1 = arg0.getTextArray(arg2);
        }

        return v1;
    }

    public static boolean hasAttribute(@NonNull XmlPullParser arg1, @NonNull String arg2) {
        boolean v1 = arg1.getAttributeValue("http://schemas.android.com/apk/res/android", arg2) != null ? true : false;
        return v1;
    }

    @NonNull public static TypedArray obtainAttributes(@NonNull Resources arg0, @Nullable Resources$Theme arg1, @NonNull AttributeSet arg2, @NonNull int[] arg3) {
        if(arg1 == null) {
            return arg0.obtainAttributes(arg2, arg3);
        }

        return arg1.obtainStyledAttributes(arg2, arg3, 0, 0);
    }

    @Nullable public static TypedValue peekNamedValue(@NonNull TypedArray arg0, @NonNull XmlPullParser arg1, @NonNull String arg2, int arg3) {
        if(!TypedArrayUtils.hasAttribute(arg1, arg2)) {
            return null;
        }

        return arg0.peekValue(arg3);
    }
}

