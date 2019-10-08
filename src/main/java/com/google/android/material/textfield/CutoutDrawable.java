package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.NonNull;

class CutoutDrawable extends GradientDrawable {
    private final RectF cutoutBounds;
    private final Paint cutoutPaint;
    private int savedLayer;

    CutoutDrawable() {
        super();
        this.cutoutPaint = new Paint(1);
        this.setPaintStyles();
        this.cutoutBounds = new RectF();
    }

    public void draw(@NonNull Canvas arg3) {
        this.preDraw(arg3);
        super.draw(arg3);
        arg3.drawRect(this.cutoutBounds, this.cutoutPaint);
        this.postDraw(arg3);
    }

    boolean hasCutout() {
        return this.cutoutBounds.isEmpty() ^ 1;
    }

    private void postDraw(@NonNull Canvas arg2) {
        if(!this.useHardwareLayer(this.getCallback())) {
            arg2.restoreToCount(this.savedLayer);
        }
    }

    private void preDraw(@NonNull Canvas arg3) {
        Drawable$Callback v0 = this.getCallback();
        if(this.useHardwareLayer(v0)) {
            ((View)v0).setLayerType(2, null);
        }
        else {
            this.saveCanvasLayer(arg3);
        }
    }

    void removeCutout() {
        this.setCutout(0f, 0f, 0f, 0f);
    }

    private void saveCanvasLayer(@NonNull Canvas arg9) {
        this.savedLayer = Build$VERSION.SDK_INT >= 21 ? arg9.saveLayer(0f, 0f, ((float)arg9.getWidth()), ((float)arg9.getHeight()), null) : arg9.saveLayer(0f, 0f, ((float)arg9.getWidth()), ((float)arg9.getHeight()), null, 0x1F);
    }

    void setCutout(float arg2, float arg3, float arg4, float arg5) {
        if(arg2 != this.cutoutBounds.left || arg3 != this.cutoutBounds.top || arg4 != this.cutoutBounds.right || arg5 != this.cutoutBounds.bottom) {
            this.cutoutBounds.set(arg2, arg3, arg4, arg5);
            this.invalidateSelf();
        }
    }

    void setCutout(RectF arg4) {
        this.setCutout(arg4.left, arg4.top, arg4.right, arg4.bottom);
    }

    private void setPaintStyles() {
        this.cutoutPaint.setStyle(Paint$Style.FILL_AND_STROKE);
        this.cutoutPaint.setColor(-1);
        this.cutoutPaint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }

    private boolean useHardwareLayer(Drawable$Callback arg1) {
        return arg1 instanceof View;
    }
}

