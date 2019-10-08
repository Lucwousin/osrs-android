package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;

final class zai extends Drawable$ConstantState {
    int mChangingConfigurations;
    int zanv;

    zai(zai arg2) {
        super();
        if(arg2 != null) {
            this.mChangingConfigurations = arg2.mChangingConfigurations;
            this.zanv = arg2.zanv;
        }
    }

    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }

    public final Drawable newDrawable() {
        return new zae(this);
    }
}

