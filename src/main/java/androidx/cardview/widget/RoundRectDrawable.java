package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(value=21) class RoundRectDrawable extends Drawable {
    private ColorStateList mBackground;
    private final RectF mBoundsF;
    private final Rect mBoundsI;
    private boolean mInsetForPadding;
    private boolean mInsetForRadius;
    private float mPadding;
    private final Paint mPaint;
    private float mRadius;
    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private PorterDuff$Mode mTintMode;

    RoundRectDrawable(ColorStateList arg2, float arg3) {
        super();
        this.mInsetForPadding = false;
        this.mInsetForRadius = true;
        this.mTintMode = PorterDuff$Mode.SRC_IN;
        this.mRadius = arg3;
        this.mPaint = new Paint(5);
        this.setBackground(arg2);
        this.mBoundsF = new RectF();
        this.mBoundsI = new Rect();
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList arg3, PorterDuff$Mode arg4) {
        if(arg3 != null) {
            if(arg4 == null) {
            }
            else {
                return new PorterDuffColorFilter(arg3.getColorForState(this.getState(), 0), arg4);
            }
        }

        return null;
    }

    public void draw(Canvas arg6) {
        int v1;
        Paint v0 = this.mPaint;
        if(this.mTintFilter == null || v0.getColorFilter() != null) {
            v1 = 0;
        }
        else {
            v0.setColorFilter(this.mTintFilter);
            v1 = 1;
        }

        arg6.drawRoundRect(this.mBoundsF, this.mRadius, this.mRadius, v0);
        if(v1 != 0) {
            v0.setColorFilter(null);
        }
    }

    public ColorStateList getColor() {
        return this.mBackground;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline arg3) {
        arg3.setRoundRect(this.mBoundsI, this.mRadius);
    }

    float getPadding() {
        return this.mPadding;
    }

    public float getRadius() {
        return this.mRadius;
    }

    public boolean isStateful() {
        boolean v0;
        if(this.mTint == null || !this.mTint.isStateful()) {
            if(this.mBackground != null && (this.mBackground.isStateful())) {
                goto label_12;
            }

            if(super.isStateful()) {
            label_12:
                v0 = true;
                return v0;
            }

            v0 = false;
        }
        else {
            goto label_12;
        }

        return v0;
    }

    protected void onBoundsChange(Rect arg1) {
        super.onBoundsChange(arg1);
        this.updateBounds(arg1);
    }

    protected boolean onStateChange(int[] arg4) {
        int v4 = this.mBackground.getColorForState(arg4, this.mBackground.getDefaultColor());
        boolean v0 = v4 != this.mPaint.getColor() ? true : false;
        if(v0) {
            this.mPaint.setColor(v4);
        }

        if(this.mTint != null && this.mTintMode != null) {
            this.mTintFilter = this.createTintFilter(this.mTint, this.mTintMode);
            return 1;
        }

        return v0;
    }

    public void setAlpha(int arg2) {
        this.mPaint.setAlpha(arg2);
    }

    private void setBackground(ColorStateList arg4) {
        if(arg4 == null) {
            arg4 = ColorStateList.valueOf(0);
        }

        this.mBackground = arg4;
        this.mPaint.setColor(this.mBackground.getColorForState(this.getState(), this.mBackground.getDefaultColor()));
    }

    public void setColor(@Nullable ColorStateList arg1) {
        this.setBackground(arg1);
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter arg2) {
        this.mPaint.setColorFilter(arg2);
    }

    void setPadding(float arg2, boolean arg3, boolean arg4) {
        if(arg2 == this.mPadding && this.mInsetForPadding == arg3 && this.mInsetForRadius == arg4) {
            return;
        }

        this.mPadding = arg2;
        this.mInsetForPadding = arg3;
        this.mInsetForRadius = arg4;
        this.updateBounds(null);
        this.invalidateSelf();
    }

    void setRadius(float arg2) {
        if(arg2 == this.mRadius) {
            return;
        }

        this.mRadius = arg2;
        this.updateBounds(null);
        this.invalidateSelf();
    }

    public void setTintList(ColorStateList arg2) {
        this.mTint = arg2;
        this.mTintFilter = this.createTintFilter(this.mTint, this.mTintMode);
        this.invalidateSelf();
    }

    public void setTintMode(PorterDuff$Mode arg2) {
        this.mTintMode = arg2;
        this.mTintFilter = this.createTintFilter(this.mTint, this.mTintMode);
        this.invalidateSelf();
    }

    private void updateBounds(Rect arg6) {
        if(arg6 == null) {
            arg6 = this.getBounds();
        }

        this.mBoundsF.set(((float)arg6.left), ((float)arg6.top), ((float)arg6.right), ((float)arg6.bottom));
        this.mBoundsI.set(arg6);
        if(this.mInsetForPadding) {
            this.mBoundsI.inset(((int)Math.ceil(((double)RoundRectDrawableWithShadow.calculateHorizontalPadding(this.mPadding, this.mRadius, this.mInsetForRadius)))), ((int)Math.ceil(((double)RoundRectDrawableWithShadow.calculateVerticalPadding(this.mPadding, this.mRadius, this.mInsetForRadius)))));
            this.mBoundsF.set(this.mBoundsI);
        }
    }
}

