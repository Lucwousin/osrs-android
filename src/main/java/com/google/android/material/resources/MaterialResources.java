package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class MaterialResources {
    private MaterialResources() {
        super();
    }

    @Nullable public static ColorStateList getColorStateList(Context arg1, TypedArray arg2, @StyleableRes int arg3) {
        if(arg2.hasValue(arg3)) {
            int v0 = arg2.getResourceId(arg3, 0);
            if(v0 != 0) {
                ColorStateList v1 = AppCompatResources.getColorStateList(arg1, v0);
                if(v1 != null) {
                    return v1;
                }
            }
        }

        return arg2.getColorStateList(arg3);
    }

    @Nullable public static Drawable getDrawable(Context arg1, TypedArray arg2, @StyleableRes int arg3) {
        if(arg2.hasValue(arg3)) {
            int v0 = arg2.getResourceId(arg3, 0);
            if(v0 != 0) {
                Drawable v1 = AppCompatResources.getDrawable(arg1, v0);
                if(v1 != null) {
                    return v1;
                }
            }
        }

        return arg2.getDrawable(arg3);
    }

    @StyleableRes static int getIndexWithValue(TypedArray arg0, @StyleableRes int arg1, @StyleableRes int arg2) {
        if(arg0.hasValue(arg1)) {
            return arg1;
        }

        return arg2;
    }

    @Nullable public static TextAppearance getTextAppearance(Context arg1, TypedArray arg2, @StyleableRes int arg3) {
        if(arg2.hasValue(arg3)) {
            int v2 = arg2.getResourceId(arg3, 0);
            if(v2 != 0) {
                return new TextAppearance(arg1, v2);
            }
        }

        return null;
    }
}

