package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class CircularBorderDrawable extends Drawable {
    class com.google.android.material.internal.CircularBorderDrawable$1 {
    }

    class CircularBorderState extends Drawable$ConstantState {
        CircularBorderState(CircularBorderDrawable arg1, com.google.android.material.internal.CircularBorderDrawable$1 arg2) {
            this(arg1);
        }

        private CircularBorderState(CircularBorderDrawable arg1) {
            CircularBorderDrawable.this = arg1;
            super();
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull public Drawable newDrawable() {
            return CircularBorderDrawable.this;
        }
    }

    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private ColorStateList borderTint;
    @Dimension float borderWidth;
    @ColorInt private int bottomInnerStrokeColor;
    @ColorInt private int bottomOuterStrokeColor;
    @ColorInt private int currentBorderTintColor;
    private boolean invalidateShader;
    final Paint paint;
    final Rect rect;
    final RectF rectF;
    @FloatRange(from=0, to=360) private float rotation;
    final CircularBorderState state;
    @ColorInt private int topInnerStrokeColor;
    @ColorInt private int topOuterStrokeColor;

    public CircularBorderDrawable() {
        super();
        this.rect = new Rect();
        this.rectF = new RectF();
        this.state = new CircularBorderState(this, null);
        this.invalidateShader = true;
        this.paint = new Paint(1);
        this.paint.setStyle(Paint$Style.STROKE);
    }

    private Shader createGradientShader() {
        Rect v0 = this.rect;
        this.copyBounds(v0);
        float v1 = this.borderWidth / (((float)v0.height()));
        return new LinearGradient(0f, ((float)v0.top), 0f, ((float)v0.bottom), new int[]{ColorUtils.compositeColors(this.topOuterStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(this.topInnerStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.topInnerStrokeColor, 0), this.currentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.bottomInnerStrokeColor, 0), this.currentBorderTintColor), ColorUtils.compositeColors(this.bottomInnerStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(this.bottomOuterStrokeColor, this.currentBorderTintColor)}, new float[]{0f, v1, 0.5f, 0.5f, 1f - v1, 1f}, Shader$TileMode.CLAMP);
    }

    public void draw(Canvas arg5) {
        if(this.invalidateShader) {
            this.paint.setShader(this.createGradientShader());
            this.invalidateShader = false;
        }

        float v0 = this.paint.getStrokeWidth() / 2f;
        RectF v1 = this.rectF;
        this.copyBounds(this.rect);
        v1.set(this.rect);
        v1.left += v0;
        v1.top += v0;
        v1.right -= v0;
        v1.bottom -= v0;
        arg5.save();
        arg5.rotate(this.rotation, v1.centerX(), v1.centerY());
        arg5.drawOval(v1, this.paint);
        arg5.restore();
    }

    @Nullable public Drawable$ConstantState getConstantState() {
        return this.state;
    }

    public int getOpacity() {
        int v0 = this.borderWidth > 0f ? -3 : -2;
        return v0;
    }

    public boolean getPadding(Rect arg2) {
        int v0 = Math.round(this.borderWidth);
        arg2.set(v0, v0, v0, v0);
        return 1;
    }

    public boolean isStateful() {
        boolean v0 = this.borderTint != null && (this.borderTint.isStateful()) || (super.isStateful()) ? true : false;
        return v0;
    }

    protected void onBoundsChange(Rect arg1) {
        this.invalidateShader = true;
    }

    protected boolean onStateChange(int[] arg3) {
        if(this.borderTint != null) {
            int v3 = this.borderTint.getColorForState(arg3, this.currentBorderTintColor);
            if(v3 != this.currentBorderTintColor) {
                this.invalidateShader = true;
                this.currentBorderTintColor = v3;
            }
        }

        if(this.invalidateShader) {
            this.invalidateSelf();
        }

        return this.invalidateShader;
    }

    public void setAlpha(@IntRange(from=0, to=0xFF) int arg2) {
        this.paint.setAlpha(arg2);
        this.invalidateSelf();
    }

    public void setBorderTint(ColorStateList arg3) {
        if(arg3 != null) {
            this.currentBorderTintColor = arg3.getColorForState(this.getState(), this.currentBorderTintColor);
        }

        this.borderTint = arg3;
        this.invalidateShader = true;
        this.invalidateSelf();
    }

    public void setBorderWidth(@Dimension float arg3) {
        if(this.borderWidth != arg3) {
            this.borderWidth = arg3;
            this.paint.setStrokeWidth(arg3 * 1.3333f);
            this.invalidateShader = true;
            this.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter arg2) {
        this.paint.setColorFilter(arg2);
        this.invalidateSelf();
    }

    public void setGradientColors(@ColorInt int arg1, @ColorInt int arg2, @ColorInt int arg3, @ColorInt int arg4) {
        this.topOuterStrokeColor = arg1;
        this.topInnerStrokeColor = arg2;
        this.bottomOuterStrokeColor = arg3;
        this.bottomInnerStrokeColor = arg4;
    }

    public final void setRotation(float arg2) {
        if(arg2 != this.rotation) {
            this.rotation = arg2;
            this.invalidateSelf();
        }
    }
}

