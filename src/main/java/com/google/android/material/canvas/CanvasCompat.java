package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build$VERSION;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class CanvasCompat {
    private CanvasCompat() {
        super();
    }

    public static int saveLayerAlpha(Canvas arg7, float arg8, float arg9, float arg10, float arg11, int arg12) {
        if(Build$VERSION.SDK_INT > 21) {
            return arg7.saveLayerAlpha(arg8, arg9, arg10, arg11, arg12);
        }

        return arg7.saveLayerAlpha(arg8, arg9, arg10, arg11, arg12, 0x1F);
    }

    public static int saveLayerAlpha(Canvas arg2, RectF arg3, int arg4) {
        if(Build$VERSION.SDK_INT > 21) {
            return arg2.saveLayerAlpha(arg3, arg4);
        }

        return arg2.saveLayerAlpha(arg3, arg4, 0x1F);
    }
}

