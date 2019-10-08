package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@TargetApi(value=21) class MaterialButtonBackgroundDrawable extends RippleDrawable {
    MaterialButtonBackgroundDrawable(@NonNull ColorStateList arg1, @Nullable InsetDrawable arg2, @Nullable Drawable arg3) {
        super(arg1, ((Drawable)arg2), arg3);
    }

    public void setColorFilter(ColorFilter arg3) {
        if(this.getDrawable(0) != null) {
            this.getDrawable(0).getDrawable().getDrawable(0).setColorFilter(arg3);
        }
    }
}

