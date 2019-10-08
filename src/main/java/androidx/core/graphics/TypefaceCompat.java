package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.provider.FontsContractCompat$FontInfo;
import androidx.core.provider.FontsContractCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class TypefaceCompat {
    private static final String TAG = "TypefaceCompat";
    private static final LruCache sTypefaceCache;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

    static {
        if(Build$VERSION.SDK_INT >= 28) {
            TypefaceCompat.sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            TypefaceCompat.sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
        }
        else {
            if(Build$VERSION.SDK_INT >= 24 && (TypefaceCompatApi24Impl.isUsable())) {
                TypefaceCompat.sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
                goto label_33;
            }

            if(Build$VERSION.SDK_INT >= 21) {
                TypefaceCompat.sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
                goto label_33;
            }

            TypefaceCompat.sTypefaceCompatImpl = new TypefaceCompatBaseImpl();
        }

    label_33:
        TypefaceCompat.sTypefaceCache = new LruCache(16);
    }

    private TypefaceCompat() {
        super();
    }

    @Nullable public static Typeface createFromFontInfo(@NonNull Context arg1, @Nullable CancellationSignal arg2, @NonNull FontInfo[] arg3, int arg4) {
        return TypefaceCompat.sTypefaceCompatImpl.createFromFontInfo(arg1, arg2, arg3, arg4);
    }

    @Nullable public static Typeface createFromResourcesFamilyXml(@NonNull Context arg7, @NonNull FamilyResourceEntry arg8, @NonNull Resources arg9, int arg10, int arg11, @Nullable FontCallback arg12, @Nullable Handler arg13, boolean arg14) {
        Typeface v0_1;
        if((arg8 instanceof ProviderResourceEntry)) {
            FamilyResourceEntry v0 = arg8;
            boolean v4 = false;
            if(arg14) {
                if(((ProviderResourceEntry)v0).getFetchStrategy() != 0) {
                    goto label_12;
                }

                goto label_8;
            }
            else if(arg12 == null) {
            label_8:
                v4 = true;
            }

        label_12:
            int v5 = arg14 ? ((ProviderResourceEntry)v0).getTimeout() : -1;
            v0_1 = FontsContractCompat.getFontSync(arg7, ((ProviderResourceEntry)v0).getRequest(), arg12, arg13, v4, v5, arg11);
        }
        else {
            v0_1 = TypefaceCompat.sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(arg7, arg8, arg9, arg11);
            if(arg12 == null) {
                goto label_34;
            }

            if(v0_1 != null) {
                arg12.callbackSuccessAsync(v0_1, arg13);
                goto label_34;
            }

            arg12.callbackFailAsync(-3, arg13);
        }

    label_34:
        if(v0_1 != null) {
            TypefaceCompat.sTypefaceCache.put(TypefaceCompat.createResourceUid(arg9, arg10, arg11), v0_1);
        }

        return v0_1;
    }

    @Nullable public static Typeface createFromResourcesFontFile(@NonNull Context arg6, @NonNull Resources arg7, int arg8, String arg9, int arg10) {
        Typeface v6 = TypefaceCompat.sTypefaceCompatImpl.createFromResourcesFontFile(arg6, arg7, arg8, arg9, arg10);
        if(v6 != null) {
            TypefaceCompat.sTypefaceCache.put(TypefaceCompat.createResourceUid(arg7, arg8, arg10), v6);
        }

        return v6;
    }

    private static String createResourceUid(Resources arg1, int arg2, int arg3) {
        return arg1.getResourcePackageName(arg2) + "-" + arg2 + "-" + arg3;
    }

    @Nullable public static Typeface findFromCache(@NonNull Resources arg1, int arg2, int arg3) {
        return TypefaceCompat.sTypefaceCache.get(TypefaceCompat.createResourceUid(arg1, arg2, arg3));
    }
}

