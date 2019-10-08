package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.Property;
import java.util.WeakHashMap;

public class DrawableAlphaProperty extends Property {
    public static final Property DRAWABLE_ALPHA_COMPAT;
    private final WeakHashMap alphaCache;

    static {
        DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT = new DrawableAlphaProperty();
    }

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
        this.alphaCache = new WeakHashMap();
    }

    public Integer get(Drawable arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            return Integer.valueOf(arg3.getAlpha());
        }

        if(this.alphaCache.containsKey(arg3)) {
            return this.alphaCache.get(arg3);
        }

        return Integer.valueOf(0xFF);
    }

    public Object get(Object arg1) {
        return this.get(((Drawable)arg1));
    }

    public void set(Drawable arg3, Integer arg4) {
        if(Build$VERSION.SDK_INT < 19) {
            this.alphaCache.put(arg3, arg4);
        }

        arg3.setAlpha(arg4.intValue());
    }

    public void set(Object arg1, Object arg2) {
        this.set(((Drawable)arg1), ((Integer)arg2));
    }
}

