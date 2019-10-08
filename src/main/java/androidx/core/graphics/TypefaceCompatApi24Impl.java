package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat$FontInfo;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(value=24) @RestrictTo(value={Scope.LIBRARY_GROUP}) class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String TAG = "TypefaceCompatApi24Impl";
    private static final Method sAddFontWeightStyle;
    private static final Method sCreateFromFamiliesWithDefault;
    private static final Class sFontFamily;
    private static final Constructor sFontFamilyCtor;

    static {
        Constructor v4_1;
        Constructor v2_1;
        Constructor v0;
        Class v1_1;
        try {
            v1_1 = Class.forName("android.graphics.FontFamily");
            Constructor v3 = v1_1.getConstructor();
            Method v4 = v1_1.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            Method v2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(v1_1, 1).getClass());
            v0 = v3;
        }
        catch(NoSuchMethodException v1) {
            Log.e("TypefaceCompatApi24Impl", v1.getClass().getName(), ((Throwable)v1));
            Constructor v1_2 = v0;
            v2_1 = v1_2;
            v4_1 = v2_1;
        }

        TypefaceCompatApi24Impl.sFontFamilyCtor = v0;
        TypefaceCompatApi24Impl.sFontFamily = v1_1;
        TypefaceCompatApi24Impl.sAddFontWeightStyle = ((Method)v4_1);
        TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault = ((Method)v2_1);
    }

    TypefaceCompatApi24Impl() {
        super();
    }

    private static boolean addFontWeightStyle(Object arg3, ByteBuffer arg4, int arg5, int arg6, boolean arg7) {
        try {
            return TypefaceCompatApi24Impl.sAddFontWeightStyle.invoke(arg3, arg4, Integer.valueOf(arg5), null, Integer.valueOf(arg6), Boolean.valueOf(arg7)).booleanValue();
        }
        catch(InvocationTargetException v3) {
            throw new RuntimeException(((Throwable)v3));
        }
    }

    private static Typeface createFromFamiliesWithDefault(Object arg4) {
        try {
            Object v0 = Array.newInstance(TypefaceCompatApi24Impl.sFontFamily, 1);
            Array.set(v0, 0, arg4);
            return TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault.invoke(null, v0);
        }
        catch(InvocationTargetException v4) {
            throw new RuntimeException(((Throwable)v4));
        }
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context arg8, FontFamilyFilesResourceEntry arg9, Resources arg10, int arg11) {
        Object v11 = TypefaceCompatApi24Impl.newFamily();
        FontFileResourceEntry[] v9 = arg9.getEntries();
        int v0 = v9.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            FontFileResourceEntry v2 = v9[v1];
            ByteBuffer v3 = TypefaceCompatUtil.copyToDirectBuffer(arg8, arg10, v2.getResourceId());
            Typeface v4 = null;
            if(v3 == null) {
                return v4;
            }

            if(!TypefaceCompatApi24Impl.addFontWeightStyle(v11, v3, v2.getTtcIndex(), v2.getWeight(), v2.isItalic())) {
                return v4;
            }
        }

        return TypefaceCompatApi24Impl.createFromFamiliesWithDefault(v11);
    }

    public Typeface createFromFontInfo(Context arg9, @Nullable CancellationSignal arg10, @NonNull FontInfo[] arg11, int arg12) {
        Object v0 = TypefaceCompatApi24Impl.newFamily();
        SimpleArrayMap v1 = new SimpleArrayMap();
        int v2 = arg11.length;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            FontInfo v4 = arg11[v3];
            Uri v5 = v4.getUri();
            Object v6 = v1.get(v5);
            if(v6 == null) {
                ByteBuffer v6_1 = TypefaceCompatUtil.mmap(arg9, arg10, v5);
                v1.put(v5, v6_1);
            }

            if(!TypefaceCompatApi24Impl.addFontWeightStyle(v0, v6_1, v4.getTtcIndex(), v4.getWeight(), v4.isItalic())) {
                return null;
            }
        }

        return Typeface.create(TypefaceCompatApi24Impl.createFromFamiliesWithDefault(v0), arg12);
    }

    public static boolean isUsable() {
        if(TypefaceCompatApi24Impl.sAddFontWeightStyle == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }

        boolean v0 = TypefaceCompatApi24Impl.sAddFontWeightStyle != null ? true : false;
        return v0;
    }

    private static Object newFamily() {
        try {
            return TypefaceCompatApi24Impl.sFontFamilyCtor.newInstance();
        }
        catch(InvocationTargetException v0) {
            throw new RuntimeException(((Throwable)v0));
        }
    }
}

