package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface$Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat$FontInfo;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@RequiresApi(value=26) @RestrictTo(value={Scope.LIBRARY_GROUP}) public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    private static final String ABORT_CREATION_METHOD = "abortCreation";
    private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String DEFAULT_FAMILY = "sans-serif";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final String TAG = "TypefaceCompatApi26Impl";
    protected final Method mAbortCreation;
    protected final Method mAddFontFromAssetManager;
    protected final Method mAddFontFromBuffer;
    protected final Method mCreateFromFamiliesWithDefault;
    protected final Class mFontFamily;
    protected final Constructor mFontFamilyCtor;
    protected final Method mFreeze;

    public TypefaceCompatApi26Impl() {
        Class v7_1;
        Class v6_1;
        Class v5_1;
        Class v3_2;
        Class v0;
        Method v4;
        Constructor v2;
        super();
        try {
            Class v1_1 = this.obtainFontFamily();
            v2 = this.obtainFontFamilyCtor(v1_1);
            Method v3 = this.obtainAddFontFromAssetManagerMethod(v1_1);
            v4 = this.obtainAddFontFromBufferMethod(v1_1);
            Method v5 = this.obtainFreezeMethod(v1_1);
            Method v6 = this.obtainAbortCreationMethod(v1_1);
            Method v7 = this.obtainCreateFromFamiliesWithDefaultMethod(v1_1);
            v0 = v1_1;
        }
        catch(NoSuchMethodException v1) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + v1.getClass().getName(), ((Throwable)v1));
            Class v2_1 = v0;
            v3_2 = v2_1;
            Class v4_1 = v3_2;
            v5_1 = v4_1;
            v6_1 = v5_1;
            v7_1 = v6_1;
        }

        this.mFontFamily = v0;
        this.mFontFamilyCtor = v2;
        this.mAddFontFromAssetManager = ((Method)v3_2);
        this.mAddFontFromBuffer = v4;
        this.mFreeze = ((Method)v5_1);
        this.mAbortCreation = ((Method)v6_1);
        this.mCreateFromFamiliesWithDefault = ((Method)v7_1);
    }

    private void abortCreation(Object arg3) {
        try {
            this.mAbortCreation.invoke(arg3);
            return;
        }
        catch(InvocationTargetException v3) {
            throw new RuntimeException(((Throwable)v3));
        }
    }

    private boolean addFontFromAssetManager(Context arg4, Object arg5, String arg6, int arg7, int arg8, int arg9, @Nullable FontVariationAxis[] arg10) {
        try {
            return this.mAddFontFromAssetManager.invoke(arg5, arg4.getAssets(), arg6, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(arg7), Integer.valueOf(arg8), Integer.valueOf(arg9), arg10).booleanValue();
        }
        catch(InvocationTargetException v4) {
            throw new RuntimeException(((Throwable)v4));
        }
    }

    private boolean addFontFromBuffer(Object arg4, ByteBuffer arg5, int arg6, int arg7, int arg8) {
        try {
            return this.mAddFontFromBuffer.invoke(arg4, arg5, Integer.valueOf(arg6), null, Integer.valueOf(arg7), Integer.valueOf(arg8)).booleanValue();
        }
        catch(InvocationTargetException v4) {
            throw new RuntimeException(((Throwable)v4));
        }
    }

    protected Typeface createFromFamiliesWithDefault(Object arg6) {
        try {
            Object v0 = Array.newInstance(this.mFontFamily, 1);
            Array.set(v0, 0, arg6);
            return this.mCreateFromFamiliesWithDefault.invoke(null, v0, Integer.valueOf(-1), Integer.valueOf(-1));
        }
        catch(InvocationTargetException v6) {
            throw new RuntimeException(((Throwable)v6));
        }
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context arg11, FontFamilyFilesResourceEntry arg12, Resources arg13, int arg14) {
        Typeface v9;
        if(!this.isFontFamilyPrivateAPIAvailable()) {
            return super.createFromFontFamilyFilesResourceEntry(arg11, arg12, arg13, arg14);
        }

        Object v13 = this.newFamily();
        FontFileResourceEntry[] v12 = arg12.getEntries();
        arg14 = v12.length;
        int v8;
        for(v8 = 0; true; ++v8) {
            v9 = null;
            if(v8 >= arg14) {
                break;
            }

            if(!this.addFontFromAssetManager(arg11, v13, v12[v8].getFileName(), v12[v8].getTtcIndex(), v12[v8].getWeight(), v12[v8].isItalic(), FontVariationAxis.fromFontVariationSettings(v12[v8].getVariationSettings()))) {
                this.abortCreation(v13);
                return v9;
            }
        }

        if(!this.freeze(v13)) {
            return v9;
        }

        return this.createFromFamiliesWithDefault(v13);
    }

    public Typeface createFromFontInfo(Context arg12, @Nullable CancellationSignal arg13, @NonNull FontInfo[] arg14, int arg15) {
        Typeface v13_1;
        ParcelFileDescriptor v12_1;
        Typeface v2 = null;
        if(arg14.length < 1) {
            return v2;
        }

        if(this.isFontFamilyPrivateAPIAvailable()) {
            goto label_46;
        }

        FontInfo v14 = this.findBestInfo(arg14, arg15);
        ContentResolver v12 = arg12.getContentResolver();
        try {
            v12_1 = v12.openFileDescriptor(v14.getUri(), "r", arg13);
            if(v12_1 != null) {
                goto label_16;
            }

            if(v12_1 != null) {
                v12_1.close();
            }
        }
        catch(IOException ) {
            return v2;
        }

        return v2;
        try {
        label_16:
            v13_1 = new Typeface$Builder(v12_1.getFileDescriptor()).setWeight(v14.getWeight()).setItalic(v14.isItalic()).build();
            if(v12_1 == null) {
                return v13_1;
            }

            goto label_25;
        }
        catch(Throwable v13) {
            v14_1 = ((Throwable)v2);
        }
        catch(Throwable v13) {
            try {
                throw v13;
            }
            catch(Throwable v14_1) {
                Throwable v10 = v14_1;
                v14_1 = v13;
                v13 = v10;
            }
        }

        if(v12_1 == null) {
            goto label_44;
        }
        else if(v14_1 != null) {
            try {
                v12_1.close();
                goto label_44;
            }
            catch(IOException ) {
            }
            catch(Throwable v12_2) {
                try {
                    v14_1.addSuppressed(v12_2);
                    goto label_44;
                label_43:
                    v12_1.close();
                label_44:
                    throw v13;
                label_25:
                    v12_1.close();
                }
                catch(IOException ) {
                    return v2;
                }
            }
        }
        else {
            goto label_43;
        }

        return v13_1;
    label_46:
        Map v12_3 = FontsContractCompat.prepareFontData(arg12, arg14, arg13);
        Object v13_2 = this.newFamily();
        int v0 = arg14.length;
        int v3 = 0;
        int v9;
        for(v9 = 0; v9 < v0; ++v9) {
            FontInfo v4 = arg14[v9];
            Object v5 = v12_3.get(v4.getUri());
            if(v5 == null) {
            }
            else if(!this.addFontFromBuffer(v13_2, ((ByteBuffer)v5), v4.getTtcIndex(), v4.getWeight(), v4.isItalic())) {
                this.abortCreation(v13_2);
                return v2;
            }
            else {
                v3 = 1;
            }
        }

        if(v3 == 0) {
            this.abortCreation(v13_2);
            return v2;
        }

        if(!this.freeze(v13_2)) {
            return v2;
        }

        return Typeface.create(this.createFromFamiliesWithDefault(v13_2), arg15);
    }

    @Nullable public Typeface createFromResourcesFontFile(Context arg9, Resources arg10, int arg11, String arg12, int arg13) {
        if(!this.isFontFamilyPrivateAPIAvailable()) {
            return super.createFromResourcesFontFile(arg9, arg10, arg11, arg12, arg13);
        }

        Object v10 = this.newFamily();
        Typeface v11 = null;
        if(!this.addFontFromAssetManager(arg9, v10, arg12, 0, -1, -1, null)) {
            this.abortCreation(v10);
            return v11;
        }

        if(!this.freeze(v10)) {
            return v11;
        }

        return this.createFromFamiliesWithDefault(v10);
    }

    private boolean freeze(Object arg3) {
        try {
            return this.mFreeze.invoke(arg3).booleanValue();
        }
        catch(InvocationTargetException v3) {
            throw new RuntimeException(((Throwable)v3));
        }
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if(this.mAddFontFromAssetManager == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }

        boolean v0 = this.mAddFontFromAssetManager != null ? true : false;
        return v0;
    }

    private Object newFamily() {
        try {
            return this.mFontFamilyCtor.newInstance();
        }
        catch(InvocationTargetException v0) {
            throw new RuntimeException(((Throwable)v0));
        }
    }

    protected Method obtainAbortCreationMethod(Class arg3) throws NoSuchMethodException {
        return arg3.getMethod("abortCreation");
    }

    protected Method obtainAddFontFromAssetManagerMethod(Class arg5) throws NoSuchMethodException {
        return arg5.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    protected Method obtainAddFontFromBufferMethod(Class arg5) throws NoSuchMethodException {
        return arg5.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    protected Method obtainCreateFromFamiliesWithDefaultMethod(Class arg6) throws NoSuchMethodException {
        Method v6 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(arg6, 1).getClass(), Integer.TYPE, Integer.TYPE);
        v6.setAccessible(true);
        return v6;
    }

    protected Class obtainFontFamily() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor obtainFontFamilyCtor(Class arg2) throws NoSuchMethodException {
        return arg2.getConstructor();
    }

    protected Method obtainFreezeMethod(Class arg3) throws NoSuchMethodException {
        return arg3.getMethod("freeze");
    }
}

