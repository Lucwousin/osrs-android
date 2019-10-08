package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    private DrawableCompat() {
        super();
    }

    public static void applyTheme(@NonNull Drawable arg2, @NonNull Resources$Theme arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.applyTheme(arg3);
        }
    }

    public static boolean canApplyTheme(@NonNull Drawable arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.canApplyTheme();
        }

        return 0;
    }

    public static void clearColorFilter(@NonNull Drawable arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg3.clearColorFilter();
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            arg3.clearColorFilter();
            if((arg3 instanceof InsetDrawable)) {
                DrawableCompat.clearColorFilter(((InsetDrawable)arg3).getDrawable());
            }
            else if((arg3 instanceof WrappedDrawable)) {
                DrawableCompat.clearColorFilter(((WrappedDrawable)arg3).getWrappedDrawable());
            }
            else if((arg3 instanceof DrawableContainer)) {
                Drawable$ConstantState v3 = ((DrawableContainer)arg3).getConstantState();
                if(v3 != null) {
                    int v0 = 0;
                    int v1 = ((DrawableContainer$DrawableContainerState)v3).getChildCount();
                    while(v0 < v1) {
                        Drawable v2 = ((DrawableContainer$DrawableContainerState)v3).getChild(v0);
                        if(v2 != null) {
                            DrawableCompat.clearColorFilter(v2);
                        }

                        ++v0;
                    }
                }
            }
        }
        else {
            arg3.clearColorFilter();
        }
    }

    public static int getAlpha(@NonNull Drawable arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getAlpha();
        }

        return 0;
    }

    public static ColorFilter getColorFilter(@NonNull Drawable arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getColorFilter();
        }

        return null;
    }

    public static int getLayoutDirection(@NonNull Drawable arg5) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg5.getLayoutDirection();
        }

        if(Build$VERSION.SDK_INT >= 17) {
            if(!DrawableCompat.sGetLayoutDirectionMethodFetched) {
                try {
                    DrawableCompat.sGetLayoutDirectionMethod = Drawable.class.getDeclaredMethod("getLayoutDirection");
                    DrawableCompat.sGetLayoutDirectionMethod.setAccessible(true);
                }
                catch(NoSuchMethodException v1) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", ((Throwable)v1));
                }

                DrawableCompat.sGetLayoutDirectionMethodFetched = true;
            }

            if(DrawableCompat.sGetLayoutDirectionMethod != null) {
                try {
                    return DrawableCompat.sGetLayoutDirectionMethod.invoke(arg5).intValue();
                }
                catch(Exception v5) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", ((Throwable)v5));
                    DrawableCompat.sGetLayoutDirectionMethod = null;
                }
            }

            return 0;
        }

        return 0;
    }

    public static void inflate(@NonNull Drawable arg2, @NonNull Resources arg3, @NonNull XmlPullParser arg4, @NonNull AttributeSet arg5, @Nullable Resources$Theme arg6) throws XmlPullParserException, IOException {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.inflate(arg3, arg4, arg5, arg6);
        }
        else {
            arg2.inflate(arg3, arg4, arg5);
        }
    }

    public static boolean isAutoMirrored(@NonNull Drawable arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.isAutoMirrored();
        }

        return 0;
    }

    @Deprecated public static void jumpToCurrentState(@NonNull Drawable arg0) {
        arg0.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.setAutoMirrored(arg3);
        }
    }

    public static void setHotspot(@NonNull Drawable arg2, float arg3, float arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setHotspot(arg3, arg4);
        }
    }

    public static void setHotspotBounds(@NonNull Drawable arg2, int arg3, int arg4, int arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setHotspotBounds(arg3, arg4, arg5, arg6);
        }
    }

    public static boolean setLayoutDirection(@NonNull Drawable arg6, int arg7) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg6.setLayoutDirection(arg7);
        }

        if(Build$VERSION.SDK_INT >= 17) {
            if(!DrawableCompat.sSetLayoutDirectionMethodFetched) {
                try {
                    DrawableCompat.sSetLayoutDirectionMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    DrawableCompat.sSetLayoutDirectionMethod.setAccessible(true);
                }
                catch(NoSuchMethodException v0) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", ((Throwable)v0));
                }

                DrawableCompat.sSetLayoutDirectionMethodFetched = true;
            }

            if(DrawableCompat.sSetLayoutDirectionMethod != null) {
                try {
                    DrawableCompat.sSetLayoutDirectionMethod.invoke(arg6, Integer.valueOf(arg7));
                    return 1;
                }
                catch(Exception v6) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", ((Throwable)v6));
                    DrawableCompat.sSetLayoutDirectionMethod = null;
                }
            }

            return 0;
        }

        return 0;
    }

    public static void setTint(@NonNull Drawable arg2, @ColorInt int arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTint(arg3);
        }
        else if((arg2 instanceof TintAwareDrawable)) {
            ((TintAwareDrawable)arg2).setTint(arg3);
        }
    }

    public static void setTintList(@NonNull Drawable arg2, @Nullable ColorStateList arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTintList(arg3);
        }
        else if((arg2 instanceof TintAwareDrawable)) {
            ((TintAwareDrawable)arg2).setTintList(arg3);
        }
    }

    public static void setTintMode(@NonNull Drawable arg2, @NonNull PorterDuff$Mode arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTintMode(arg3);
        }
        else if((arg2 instanceof TintAwareDrawable)) {
            ((TintAwareDrawable)arg2).setTintMode(arg3);
        }
    }

    public static Drawable unwrap(@NonNull Drawable arg1) {
        if((arg1 instanceof WrappedDrawable)) {
            return ((WrappedDrawable)arg1).getWrappedDrawable();
        }

        return arg1;
    }

    public static Drawable wrap(@NonNull Drawable arg2) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2;
        }

        if(Build$VERSION.SDK_INT >= 21) {
            if(!(arg2 instanceof TintAwareDrawable)) {
                return new WrappedDrawableApi21(arg2);
            }

            return arg2;
        }

        if(!(arg2 instanceof TintAwareDrawable)) {
            return new WrappedDrawableApi14(arg2);
        }

        return arg2;
    }
}

