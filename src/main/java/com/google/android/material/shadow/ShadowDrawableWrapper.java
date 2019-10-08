package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Path$FillType;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.R$color;

public class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45 = 0;
    static final float SHADOW_BOTTOM_SCALE = 1f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    static {
        ShadowDrawableWrapper.COS_45 = Math.cos(Math.toRadians(45));
    }

    public ShadowDrawableWrapper(Context arg2, Drawable arg3, float arg4, float arg5, float arg6) {
        super(arg3);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = ContextCompat.getColor(arg2, R$color.design_fab_shadow_start_color);
        this.shadowMiddleColor = ContextCompat.getColor(arg2, R$color.design_fab_shadow_mid_color);
        this.shadowEndColor = ContextCompat.getColor(arg2, R$color.design_fab_shadow_end_color);
        this.cornerShadowPaint = new Paint(5);
        this.cornerShadowPaint.setStyle(Paint$Style.FILL);
        this.cornerRadius = ((float)Math.round(arg4));
        this.contentBounds = new RectF();
        this.edgeShadowPaint = new Paint(this.cornerShadowPaint);
        this.edgeShadowPaint.setAntiAlias(false);
        this.setShadowSize(arg5, arg6);
    }

    private void buildComponents(Rect arg7) {
        float v0 = this.rawMaxShadowSize * 1.5f;
        this.contentBounds.set((((float)arg7.left)) + this.rawMaxShadowSize, (((float)arg7.top)) + v0, (((float)arg7.right)) - this.rawMaxShadowSize, (((float)arg7.bottom)) - v0);
        this.getWrappedDrawable().setBounds(((int)this.contentBounds.left), ((int)this.contentBounds.top), ((int)this.contentBounds.right), ((int)this.contentBounds.bottom));
        this.buildShadowCorners();
    }

    private void buildShadowCorners() {
        ShadowDrawableWrapper v0 = this;
        RectF v1 = new RectF(-v0.cornerRadius, -v0.cornerRadius, v0.cornerRadius, v0.cornerRadius);
        RectF v2 = new RectF(v1);
        v2.inset(-v0.shadowSize, -v0.shadowSize);
        if(v0.cornerShadowPath == null) {
            v0.cornerShadowPath = new Path();
        }
        else {
            v0.cornerShadowPath.reset();
        }

        v0.cornerShadowPath.setFillType(Path$FillType.EVEN_ODD);
        v0.cornerShadowPath.moveTo(-v0.cornerRadius, 0f);
        v0.cornerShadowPath.rLineTo(-v0.shadowSize, 0f);
        v0.cornerShadowPath.arcTo(v2, 180f, 90f, false);
        v0.cornerShadowPath.arcTo(v1, 270f, -90f, false);
        v0.cornerShadowPath.close();
        float v11 = -v2.top;
        int v3 = 2;
        int v6 = 3;
        if(v11 > 0f) {
            float v8 = v0.cornerRadius / v11;
            Paint v15 = v0.cornerShadowPaint;
            int[] v12 = new int[4];
            v12[0] = 0;
            v12[1] = v0.shadowStartColor;
            v12[v3] = v0.shadowMiddleColor;
            v12[v6] = v0.shadowEndColor;
            float[] v13 = new float[4];
            v13[0] = 0f;
            v13[1] = v8;
            v13[v3] = (1f - v8) / 2f + v8;
            v13[v6] = 1f;
            v15.setShader(new RadialGradient(0f, 0f, v11, v12, v13, Shader$TileMode.CLAMP));
        }

        Paint v3_1 = v0.edgeShadowPaint;
        float v10 = v1.top;
        float v12_1 = v2.top;
        int[] v13_1 = new int[v6];
        v13_1[0] = v0.shadowStartColor;
        v13_1[1] = v0.shadowMiddleColor;
        v13_1[2] = v0.shadowEndColor;
        v3_1.setShader(new LinearGradient(0f, v10, 0f, v12_1, v13_1, new float[]{0f, 0.5f, 1f}, Shader$TileMode.CLAMP));
        v0.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float arg6, float arg7, boolean arg8) {
        if(arg8) {
            return ((float)((((double)arg6)) + (1 - ShadowDrawableWrapper.COS_45) * (((double)arg7))));
        }

        return arg6;
    }

    public static float calculateVerticalPadding(float arg6, float arg7, boolean arg8) {
        float v0 = 1.5f;
        if(arg8) {
            return ((float)((((double)(arg6 * v0))) + (1 - ShadowDrawableWrapper.COS_45) * (((double)arg7))));
        }

        return arg6 * v0;
    }

    public void draw(Canvas arg2) {
        if(this.dirty) {
            this.buildComponents(this.getBounds());
            this.dirty = false;
        }

        this.drawShadow(arg2);
        super.draw(arg2);
    }

    private void drawShadow(Canvas arg23) {
        float v21;
        float v8_1;
        int v20;
        float v19;
        int v14_1;
        ShadowDrawableWrapper v0 = this;
        Canvas v7 = arg23;
        int v8 = arg23.save();
        v7.rotate(v0.rotation, v0.contentBounds.centerX(), v0.contentBounds.centerY());
        float v9 = -v0.cornerRadius - v0.shadowSize;
        float v10 = v0.cornerRadius;
        float v11 = v10 * 2f;
        int v12 = v0.contentBounds.width() - v11 > 0f ? 1 : 0;
        int v13 = v0.contentBounds.height() - v11 > 0f ? 1 : 0;
        float v1 = v0.rawShadowSize - v0.rawShadowSize * 0.25f;
        float v14 = 1f;
        float v15 = v10 / (v0.rawShadowSize - v0.rawShadowSize * 0.5f + v10);
        float v6 = v10 / (v1 + v10);
        float v5 = v10 / (v0.rawShadowSize - v0.rawShadowSize * v14 + v10);
        int v4 = arg23.save();
        v7.translate(v0.contentBounds.left + v10, v0.contentBounds.top + v10);
        v7.scale(v15, v6);
        v7.drawPath(v0.cornerShadowPath, v0.cornerShadowPaint);
        if(v12 != 0) {
            v7.scale(v14 / v15, v14);
            v14_1 = v4;
            v19 = v5;
            v20 = v8;
            v8_1 = v6;
            arg23.drawRect(0f, v9, v0.contentBounds.width() - v11, -v0.cornerRadius, v0.edgeShadowPaint);
        }
        else {
            v14_1 = v4;
            v19 = v5;
            v20 = v8;
            v8_1 = v6;
        }

        v7.restoreToCount(v14_1);
        v14_1 = arg23.save();
        v7.translate(v0.contentBounds.right - v10, v0.contentBounds.bottom - v10);
        v6 = v19;
        v7.scale(v15, v6);
        v7.rotate(180f);
        v7.drawPath(v0.cornerShadowPath, v0.cornerShadowPaint);
        if(v12 != 0) {
            v7.scale(1f / v15, 1f);
            v21 = v8_1;
            v8_1 = v6;
            arg23.drawRect(0f, v9, v0.contentBounds.width() - v11, -v0.cornerRadius + v0.shadowSize, v0.edgeShadowPaint);
        }
        else {
            v21 = v8_1;
            v8_1 = v6;
        }

        v7.restoreToCount(v14_1);
        v12 = arg23.save();
        v7.translate(v0.contentBounds.left + v10, v0.contentBounds.bottom - v10);
        v7.scale(v15, v8_1);
        v7.rotate(270f);
        v7.drawPath(v0.cornerShadowPath, v0.cornerShadowPaint);
        if(v13 != 0) {
            v7.scale(1f / v8_1, 1f);
            arg23.drawRect(0f, v9, v0.contentBounds.height() - v11, -v0.cornerRadius, v0.edgeShadowPaint);
        }

        v7.restoreToCount(v12);
        v8 = arg23.save();
        v7.translate(v0.contentBounds.right - v10, v0.contentBounds.top + v10);
        v10 = v21;
        v7.scale(v15, v10);
        v7.rotate(90f);
        v7.drawPath(v0.cornerShadowPath, v0.cornerShadowPaint);
        if(v13 != 0) {
            v7.scale(1f / v10, 1f);
            arg23.drawRect(0f, v9, v0.contentBounds.height() - v11, -v0.cornerRadius, v0.edgeShadowPaint);
        }

        v7.restoreToCount(v8);
        v7.restoreToCount(v20);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        return Math.max(this.rawMaxShadowSize, this.cornerRadius + this.rawMaxShadowSize * 1.5f / 2f) * 2f + this.rawMaxShadowSize * 1.5f * 2f;
    }

    public float getMinWidth() {
        return Math.max(this.rawMaxShadowSize, this.cornerRadius + this.rawMaxShadowSize / 2f) * 2f + this.rawMaxShadowSize * 2f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect arg5) {
        int v0 = ((int)Math.ceil(((double)ShadowDrawableWrapper.calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners))));
        int v1 = ((int)Math.ceil(((double)ShadowDrawableWrapper.calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners))));
        arg5.set(v1, v0, v1, v0);
        return 1;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    protected void onBoundsChange(Rect arg1) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean arg1) {
        this.addPaddingForCorners = arg1;
        this.invalidateSelf();
    }

    public void setAlpha(int arg2) {
        super.setAlpha(arg2);
        this.cornerShadowPaint.setAlpha(arg2);
        this.edgeShadowPaint.setAlpha(arg2);
    }

    public void setCornerRadius(float arg2) {
        arg2 = ((float)Math.round(arg2));
        if(this.cornerRadius == arg2) {
            return;
        }

        this.cornerRadius = arg2;
        this.dirty = true;
        this.invalidateSelf();
    }

    public void setMaxShadowSize(float arg2) {
        this.setShadowSize(this.rawShadowSize, arg2);
    }

    public final void setRotation(float arg2) {
        if(this.rotation != arg2) {
            this.rotation = arg2;
            this.invalidateSelf();
        }
    }

    public void setShadowSize(float arg3, float arg4) {
        if(arg3 >= 0f && arg4 >= 0f) {
            arg3 = ((float)ShadowDrawableWrapper.toEven(arg3));
            arg4 = ((float)ShadowDrawableWrapper.toEven(arg4));
            if(arg3 > arg4) {
                if(!this.printedShadowClipWarning) {
                    this.printedShadowClipWarning = true;
                }

                arg3 = arg4;
            }

            if(this.rawShadowSize == arg3 && this.rawMaxShadowSize == arg4) {
                return;
            }

            this.rawShadowSize = arg3;
            this.rawMaxShadowSize = arg4;
            this.shadowSize = ((float)Math.round(arg3 * 1.5f));
            this.maxShadowSize = arg4;
            this.dirty = true;
            this.invalidateSelf();
            return;
        }

        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float arg2) {
        this.setShadowSize(arg2, this.rawMaxShadowSize);
    }

    private static int toEven(float arg2) {
        int v2 = Math.round(arg2);
        if(v2 % 2 == 1) {
            --v2;
        }

        return v2;
    }
}

