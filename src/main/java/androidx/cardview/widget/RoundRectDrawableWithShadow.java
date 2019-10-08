package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import androidx.annotation.Nullable;
import androidx.cardview.R$color;
import androidx.cardview.R$dimen;

class RoundRectDrawableWithShadow extends Drawable {
    interface RoundRectHelper {
        void drawRoundRect(Canvas arg1, RectF arg2, float arg3, Paint arg4);
    }

    private static final double COS_45 = 0;
    private static final float SHADOW_MULTIPLIER = 1.5f;
    private boolean mAddPaddingForCorners;
    private ColorStateList mBackground;
    private final RectF mCardBounds;
    private float mCornerRadius;
    private Paint mCornerShadowPaint;
    private Path mCornerShadowPath;
    private boolean mDirty;
    private Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private Paint mPaint;
    private boolean mPrintedShadowClipWarning;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;
    static RoundRectHelper sRoundRectHelper;

    static {
        RoundRectDrawableWithShadow.COS_45 = Math.cos(Math.toRadians(45));
    }

    RoundRectDrawableWithShadow(Resources arg3, ColorStateList arg4, float arg5, float arg6, float arg7) {
        super();
        this.mDirty = true;
        this.mAddPaddingForCorners = true;
        this.mPrintedShadowClipWarning = false;
        this.mShadowStartColor = arg3.getColor(R$color.cardview_shadow_start_color);
        this.mShadowEndColor = arg3.getColor(R$color.cardview_shadow_end_color);
        this.mInsetShadow = arg3.getDimensionPixelSize(R$dimen.cardview_compat_inset_shadow);
        this.mPaint = new Paint(5);
        this.setBackground(arg4);
        this.mCornerShadowPaint = new Paint(5);
        this.mCornerShadowPaint.setStyle(Paint$Style.FILL);
        this.mCornerRadius = ((float)(((int)(arg5 + 0.5f))));
        this.mCardBounds = new RectF();
        this.mEdgeShadowPaint = new Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint.setAntiAlias(false);
        this.setShadowSize(arg6, arg7);
    }

    private void buildComponents(Rect arg7) {
        float v0 = this.mRawMaxShadowSize * 1.5f;
        this.mCardBounds.set((((float)arg7.left)) + this.mRawMaxShadowSize, (((float)arg7.top)) + v0, (((float)arg7.right)) - this.mRawMaxShadowSize, (((float)arg7.bottom)) - v0);
        this.buildShadowCorners();
    }

    private void buildShadowCorners() {
        RoundRectDrawableWithShadow v0 = this;
        RectF v1 = new RectF(-v0.mCornerRadius, -v0.mCornerRadius, v0.mCornerRadius, v0.mCornerRadius);
        RectF v2 = new RectF(v1);
        v2.inset(-v0.mShadowSize, -v0.mShadowSize);
        if(v0.mCornerShadowPath == null) {
            v0.mCornerShadowPath = new Path();
        }
        else {
            v0.mCornerShadowPath.reset();
        }

        v0.mCornerShadowPath.setFillType(Path$FillType.EVEN_ODD);
        v0.mCornerShadowPath.moveTo(-v0.mCornerRadius, 0f);
        v0.mCornerShadowPath.rLineTo(-v0.mShadowSize, 0f);
        v0.mCornerShadowPath.arcTo(v2, 180f, 90f, false);
        v0.mCornerShadowPath.arcTo(v1, 270f, -90f, false);
        v0.mCornerShadowPath.close();
        v0.mCornerShadowPaint.setShader(new RadialGradient(0f, 0f, v0.mCornerRadius + v0.mShadowSize, new int[]{v0.mShadowStartColor, v0.mShadowStartColor, v0.mShadowEndColor}, new float[]{0f, v0.mCornerRadius / (v0.mCornerRadius + v0.mShadowSize), 1f}, Shader$TileMode.CLAMP));
        v0.mEdgeShadowPaint.setShader(new LinearGradient(0f, -v0.mCornerRadius + v0.mShadowSize, 0f, -v0.mCornerRadius - v0.mShadowSize, new int[]{v0.mShadowStartColor, v0.mShadowStartColor, v0.mShadowEndColor}, new float[]{0f, 0.5f, 1f}, Shader$TileMode.CLAMP));
        v0.mEdgeShadowPaint.setAntiAlias(false);
    }

    static float calculateHorizontalPadding(float arg6, float arg7, boolean arg8) {
        if(arg8) {
            return ((float)((((double)arg6)) + (1 - RoundRectDrawableWithShadow.COS_45) * (((double)arg7))));
        }

        return arg6;
    }

    static float calculateVerticalPadding(float arg6, float arg7, boolean arg8) {
        float v0 = 1.5f;
        if(arg8) {
            return ((float)((((double)(arg6 * v0))) + (1 - RoundRectDrawableWithShadow.COS_45) * (((double)arg7))));
        }

        return arg6 * v0;
    }

    public void draw(Canvas arg5) {
        if(this.mDirty) {
            this.buildComponents(this.getBounds());
            this.mDirty = false;
        }

        arg5.translate(0f, this.mRawShadowSize / 2f);
        this.drawShadow(arg5);
        arg5.translate(0f, -this.mRawShadowSize / 2f);
        RoundRectDrawableWithShadow.sRoundRectHelper.drawRoundRect(arg5, this.mCardBounds, this.mCornerRadius, this.mPaint);
    }

    private void drawShadow(Canvas arg13) {
        float v0 = -this.mCornerRadius - this.mShadowSize;
        float v1 = this.mCornerRadius + (((float)this.mInsetShadow)) + this.mRawShadowSize / 2f;
        float v8 = v1 * 2f;
        int v9 = this.mCardBounds.width() - v8 > 0f ? 1 : 0;
        int v10 = this.mCardBounds.height() - v8 > 0f ? 1 : 0;
        int v11 = arg13.save();
        arg13.translate(this.mCardBounds.left + v1, this.mCardBounds.top + v1);
        arg13.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if(v9 != 0) {
            arg13.drawRect(0f, v0, this.mCardBounds.width() - v8, -this.mCornerRadius, this.mEdgeShadowPaint);
        }

        arg13.restoreToCount(v11);
        v11 = arg13.save();
        arg13.translate(this.mCardBounds.right - v1, this.mCardBounds.bottom - v1);
        arg13.rotate(180f);
        arg13.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if(v9 != 0) {
            arg13.drawRect(0f, v0, this.mCardBounds.width() - v8, -this.mCornerRadius + this.mShadowSize, this.mEdgeShadowPaint);
        }

        arg13.restoreToCount(v11);
        v9 = arg13.save();
        arg13.translate(this.mCardBounds.left + v1, this.mCardBounds.bottom - v1);
        arg13.rotate(270f);
        arg13.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if(v10 != 0) {
            arg13.drawRect(0f, v0, this.mCardBounds.height() - v8, -this.mCornerRadius, this.mEdgeShadowPaint);
        }

        arg13.restoreToCount(v9);
        v9 = arg13.save();
        arg13.translate(this.mCardBounds.right - v1, this.mCardBounds.top + v1);
        arg13.rotate(90f);
        arg13.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if(v10 != 0) {
            arg13.drawRect(0f, v0, this.mCardBounds.height() - v8, -this.mCornerRadius, this.mEdgeShadowPaint);
        }

        arg13.restoreToCount(v9);
    }

    ColorStateList getColor() {
        return this.mBackground;
    }

    float getCornerRadius() {
        return this.mCornerRadius;
    }

    void getMaxShadowAndCornerPadding(Rect arg1) {
        this.getPadding(arg1);
    }

    float getMaxShadowSize() {
        return this.mRawMaxShadowSize;
    }

    float getMinHeight() {
        return Math.max(this.mRawMaxShadowSize, this.mCornerRadius + (((float)this.mInsetShadow)) + this.mRawMaxShadowSize * 1.5f / 2f) * 2f + (this.mRawMaxShadowSize * 1.5f + (((float)this.mInsetShadow))) * 2f;
    }

    float getMinWidth() {
        return Math.max(this.mRawMaxShadowSize, this.mCornerRadius + (((float)this.mInsetShadow)) + this.mRawMaxShadowSize / 2f) * 2f + (this.mRawMaxShadowSize + (((float)this.mInsetShadow))) * 2f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect arg5) {
        int v0 = ((int)Math.ceil(((double)RoundRectDrawableWithShadow.calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners))));
        int v1 = ((int)Math.ceil(((double)RoundRectDrawableWithShadow.calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners))));
        arg5.set(v1, v0, v1, v0);
        return 1;
    }

    float getShadowSize() {
        return this.mRawShadowSize;
    }

    public boolean isStateful() {
        boolean v0 = this.mBackground != null && (this.mBackground.isStateful()) || (super.isStateful()) ? true : false;
        return v0;
    }

    protected void onBoundsChange(Rect arg1) {
        super.onBoundsChange(arg1);
        this.mDirty = true;
    }

    protected boolean onStateChange(int[] arg3) {
        int v3 = this.mBackground.getColorForState(arg3, this.mBackground.getDefaultColor());
        if(this.mPaint.getColor() == v3) {
            return 0;
        }

        this.mPaint.setColor(v3);
        this.mDirty = true;
        this.invalidateSelf();
        return 1;
    }

    void setAddPaddingForCorners(boolean arg1) {
        this.mAddPaddingForCorners = arg1;
        this.invalidateSelf();
    }

    public void setAlpha(int arg2) {
        this.mPaint.setAlpha(arg2);
        this.mCornerShadowPaint.setAlpha(arg2);
        this.mEdgeShadowPaint.setAlpha(arg2);
    }

    private void setBackground(ColorStateList arg4) {
        if(arg4 == null) {
            arg4 = ColorStateList.valueOf(0);
        }

        this.mBackground = arg4;
        this.mPaint.setColor(this.mBackground.getColorForState(this.getState(), this.mBackground.getDefaultColor()));
    }

    void setColor(@Nullable ColorStateList arg1) {
        this.setBackground(arg1);
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter arg2) {
        this.mPaint.setColorFilter(arg2);
    }

    void setCornerRadius(float arg4) {
        if(arg4 >= 0f) {
            arg4 = ((float)(((int)(arg4 + 0.5f))));
            if(this.mCornerRadius == arg4) {
                return;
            }

            this.mCornerRadius = arg4;
            this.mDirty = true;
            this.invalidateSelf();
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Invalid radius ");
        v1.append(arg4);
        v1.append(". Must be >= 0");
        throw new IllegalArgumentException(v1.toString());
    }

    void setMaxShadowSize(float arg2) {
        this.setShadowSize(this.mRawShadowSize, arg2);
    }

    private void setShadowSize(float arg3, float arg4) {
        StringBuilder v0;
        if(arg3 >= 0f) {
            if(arg4 >= 0f) {
                arg3 = ((float)this.toEven(arg3));
                arg4 = ((float)this.toEven(arg4));
                if(arg3 > arg4) {
                    if(!this.mPrintedShadowClipWarning) {
                        this.mPrintedShadowClipWarning = true;
                    }

                    arg3 = arg4;
                }

                if(this.mRawShadowSize == arg3 && this.mRawMaxShadowSize == arg4) {
                    return;
                }

                this.mRawShadowSize = arg3;
                this.mRawMaxShadowSize = arg4;
                this.mShadowSize = ((float)(((int)(arg3 * 1.5f + (((float)this.mInsetShadow)) + 0.5f))));
                this.mDirty = true;
                this.invalidateSelf();
                return;
            }

            v0 = new StringBuilder();
            v0.append("Invalid max shadow size ");
            v0.append(arg4);
            v0.append(". Must be >= 0");
            throw new IllegalArgumentException(v0.toString());
        }

        v0 = new StringBuilder();
        v0.append("Invalid shadow size ");
        v0.append(arg3);
        v0.append(". Must be >= 0");
        throw new IllegalArgumentException(v0.toString());
    }

    void setShadowSize(float arg2) {
        this.setShadowSize(arg2, this.mRawMaxShadowSize);
    }

    private int toEven(float arg3) {
        int v3 = ((int)(arg3 + 0.5f));
        if(v3 % 2 == 1) {
            return v3 - 1;
        }

        return v3;
    }
}

