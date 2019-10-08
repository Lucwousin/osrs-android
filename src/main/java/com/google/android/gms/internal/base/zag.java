package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;

final class zag extends Drawable {
    private static final zag zant;
    private static final zah zanu;

    static {
        zag.zant = new zag();
        zag.zanu = new zah(null);
    }

    private zag() {
        super();
    }

    public final void draw(Canvas arg1) {
    }

    public final Drawable$ConstantState getConstantState() {
        return zag.zanu;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int arg1) {
    }

    public final void setColorFilter(ColorFilter arg1) {
    }

    static zag zacg() {
        return zag.zant;
    }
}

