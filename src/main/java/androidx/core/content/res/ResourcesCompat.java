package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat {
    public abstract class FontCallback {
        public FontCallback() {
            super();
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public final void callbackFailAsync(int arg2, @Nullable Handler arg3) {
            if(arg3 == null) {
                arg3 = new Handler(Looper.getMainLooper());
            }

            arg3.post(new Runnable(arg2) {
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(this.val$reason);
                }
            });
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public final void callbackSuccessAsync(Typeface arg2, @Nullable Handler arg3) {
            if(arg3 == null) {
                arg3 = new Handler(Looper.getMainLooper());
            }

            arg3.post(new Runnable(arg2) {
                public void run() {
                    FontCallback.this.onFontRetrieved(this.val$typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int arg1);

        public abstract void onFontRetrieved(@NonNull Typeface arg1);
    }

    private static final String TAG = "ResourcesCompat";

    private ResourcesCompat() {
        super();
    }

    @ColorInt public static int getColor(@NonNull Resources arg2, @ColorRes int arg3, @Nullable Resources$Theme arg4) throws Resources$NotFoundException {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getColor(arg3, arg4);
        }

        return arg2.getColor(arg3);
    }

    @Nullable public static ColorStateList getColorStateList(@NonNull Resources arg2, @ColorRes int arg3, @Nullable Resources$Theme arg4) throws Resources$NotFoundException {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getColorStateList(arg3, arg4);
        }

        return arg2.getColorStateList(arg3);
    }

    @Nullable public static Drawable getDrawable(@NonNull Resources arg2, @DrawableRes int arg3, @Nullable Resources$Theme arg4) throws Resources$NotFoundException {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getDrawable(arg3, arg4);
        }

        return arg2.getDrawable(arg3);
    }

    @Nullable public static Drawable getDrawableForDensity(@NonNull Resources arg2, @DrawableRes int arg3, int arg4, @Nullable Resources$Theme arg5) throws Resources$NotFoundException {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getDrawableForDensity(arg3, arg4, arg5);
        }

        if(Build$VERSION.SDK_INT >= 15) {
            return arg2.getDrawableForDensity(arg3, arg4);
        }

        return arg2.getDrawable(arg3);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static Typeface getFont(@NonNull Context arg7, @FontRes int arg8, TypedValue arg9, int arg10, @Nullable FontCallback arg11) throws Resources$NotFoundException {
        if(arg7.isRestricted()) {
            return null;
        }

        return ResourcesCompat.loadFont(arg7, arg8, arg9, arg10, arg11, null, true);
    }

    @Nullable public static Typeface getFont(@NonNull Context arg7, @FontRes int arg8) throws Resources$NotFoundException {
        if(arg7.isRestricted()) {
            return null;
        }

        return ResourcesCompat.loadFont(arg7, arg8, new TypedValue(), 0, null, null, false);
    }

    public static void getFont(@NonNull Context arg7, @FontRes int arg8, @NonNull FontCallback arg9, @Nullable Handler arg10) throws Resources$NotFoundException {
        Preconditions.checkNotNull(arg9);
        if(arg7.isRestricted()) {
            arg9.callbackFailAsync(-4, arg10);
            return;
        }

        ResourcesCompat.loadFont(arg7, arg8, new TypedValue(), 0, arg9, arg10, false);
    }

    private static Typeface loadFont(@NonNull Context arg8, int arg9, TypedValue arg10, int arg11, @Nullable FontCallback arg12, @Nullable Handler arg13, boolean arg14) {
        Resources v1 = arg8.getResources();
        v1.getValue(arg9, arg10, true);
        Typeface v8 = ResourcesCompat.loadFont(arg8, v1, arg10, arg9, arg11, arg12, arg13, arg14);
        if(v8 == null) {
            if(arg12 != null) {
            }
            else {
                StringBuilder v10 = new StringBuilder();
                v10.append("Font resource ID #0x");
                v10.append(Integer.toHexString(arg9));
                v10.append(" could not be retrieved.");
                throw new Resources$NotFoundException(v10.toString());
            }
        }

        return v8;
    }

    private static Typeface loadFont(@NonNull Context arg14, Resources arg15, TypedValue arg16, int arg17, int arg18, @Nullable FontCallback arg19, @Nullable Handler arg20, boolean arg21) {
        TypedValue v1 = arg16;
        int v4 = arg17;
        int v5 = arg18;
        FontCallback v9 = arg19;
        Handler v10 = arg20;
        if(v1.string != null) {
            String v11 = v1.string.toString();
            Typeface v12 = null;
            int v13 = -3;
            if(!v11.startsWith("res/")) {
                if(v9 != null) {
                    v9.callbackFailAsync(v13, v10);
                }

                return v12;
            }

            Typeface v1_1 = TypefaceCompat.findFromCache(arg15, v4, v5);
            if(v1_1 != null) {
                if(v9 != null) {
                    v9.callbackSuccessAsync(v1_1, v10);
                }

                return v1_1;
            }

            try {
                if(v11.toLowerCase().endsWith(".xml")) {
                    FamilyResourceEntry v2 = FontResourcesParserCompat.parse(arg15.getXml(v4), arg15);
                    if(v2 == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if(v9 != null) {
                            v9.callbackFailAsync(v13, v10);
                        }

                        return v12;
                    }

                    return TypefaceCompat.createFromResourcesFamilyXml(arg14, v2, arg15, arg17, arg18, arg19, arg20, arg21);
                }

                Typeface v0_2 = TypefaceCompat.createFromResourcesFontFile(arg14, arg15, v4, v11, v5);
                if(v9 != null) {
                    if(v0_2 != null) {
                        v9.callbackSuccessAsync(v0_2, v10);
                    }
                    else {
                        v9.callbackFailAsync(v13, v10);
                    }
                }

                return v0_2;
            }
            catch(IOException v0) {
                Log.e("ResourcesCompat", "Failed to read xml resource " + v11, ((Throwable)v0));
            }
            catch(XmlPullParserException v0_1) {
                Log.e("ResourcesCompat", "Failed to parse xml resource " + v11, ((Throwable)v0_1));
            }

            if(v9 != null) {
                v9.callbackFailAsync(v13, v10);
            }

            return v12;
        }

        StringBuilder v3 = new StringBuilder();
        v3.append("Resource \"");
        v3.append(arg15.getResourceName(v4));
        v3.append("\" (");
        v3.append(Integer.toHexString(arg17));
        v3.append(") is not a Font: ");
        v3.append(v1);
        throw new Resources$NotFoundException(v3.toString());
    }
}

