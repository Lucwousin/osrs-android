package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class DrawableUtils {
    private DrawableUtils() {
        super();
    }

    @Nullable public static PorterDuffColorFilter updateTintFilter(Drawable arg1, @Nullable ColorStateList arg2, @Nullable PorterDuff$Mode arg3) {
        if(arg2 != null) {
            if(arg3 == null) {
            }
            else {
                return new PorterDuffColorFilter(arg2.getColorForState(arg1.getState(), 0), arg3);
            }
        }

        return null;
    }
}

