package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

public final class CompoundButtonCompat {
    private static final String TAG = "CompoundButtonCompat";
    private static Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    private CompoundButtonCompat() {
        super();
    }

    @Nullable public static Drawable getButtonDrawable(@NonNull CompoundButton arg4) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg4.getButtonDrawable();
        }

        if(!CompoundButtonCompat.sButtonDrawableFieldFetched) {
            try {
                CompoundButtonCompat.sButtonDrawableField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                CompoundButtonCompat.sButtonDrawableField.setAccessible(true);
            }
            catch(NoSuchFieldException v1) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", ((Throwable)v1));
            }

            CompoundButtonCompat.sButtonDrawableFieldFetched = true;
        }

        Field v1_1 = null;
        if(CompoundButtonCompat.sButtonDrawableField != null) {
            try {
                return CompoundButtonCompat.sButtonDrawableField.get(arg4);
            }
            catch(IllegalAccessException v4) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", ((Throwable)v4));
                CompoundButtonCompat.sButtonDrawableField = v1_1;
            }
        }

        return ((Drawable)v1_1);
    }

    @Nullable public static ColorStateList getButtonTintList(@NonNull CompoundButton arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getButtonTintList();
        }

        if((arg2 instanceof TintableCompoundButton)) {
            return ((TintableCompoundButton)arg2).getSupportButtonTintList();
        }

        return null;
    }

    @Nullable public static PorterDuff$Mode getButtonTintMode(@NonNull CompoundButton arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getButtonTintMode();
        }

        if((arg2 instanceof TintableCompoundButton)) {
            return ((TintableCompoundButton)arg2).getSupportButtonTintMode();
        }

        return null;
    }

    public static void setButtonTintList(@NonNull CompoundButton arg2, @Nullable ColorStateList arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setButtonTintList(arg3);
        }
        else if((arg2 instanceof TintableCompoundButton)) {
            ((TintableCompoundButton)arg2).setSupportButtonTintList(arg3);
        }
    }

    public static void setButtonTintMode(@NonNull CompoundButton arg2, @Nullable PorterDuff$Mode arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setButtonTintMode(arg3);
        }
        else if((arg2 instanceof TintableCompoundButton)) {
            ((TintableCompoundButton)arg2).setSupportButtonTintMode(arg3);
        }
    }
}

