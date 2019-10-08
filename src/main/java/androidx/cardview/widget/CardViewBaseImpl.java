package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

class CardViewBaseImpl implements CardViewImpl {
    final RectF mCornerRect;

    CardViewBaseImpl() {
        super();
        this.mCornerRect = new RectF();
    }

    private RoundRectDrawableWithShadow createBackground(Context arg8, ColorStateList arg9, float arg10, float arg11, float arg12) {
        return new RoundRectDrawableWithShadow(arg8.getResources(), arg9, arg10, arg11, arg12);
    }

    public ColorStateList getBackgroundColor(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getColor();
    }

    public float getElevation(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getShadowSize();
    }

    public float getMaxElevation(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getMaxShadowSize();
    }

    public float getMinHeight(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getMinHeight();
    }

    public float getMinWidth(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getMinWidth();
    }

    public float getRadius(CardViewDelegate arg1) {
        return this.getShadowBackground(arg1).getCornerRadius();
    }

    private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate arg1) {
        return arg1.getCardBackground();
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectHelper() {
            public void drawRoundRect(Canvas arg16, RectF arg17, float arg18, Paint arg19) {
                androidx.cardview.widget.CardViewBaseImpl$1 v0 = this;
                Canvas v7 = arg16;
                RectF v8 = arg17;
                float v1 = 2f * arg18;
                float v10 = arg17.width() - v1 - 1f;
                float v11 = arg17.height() - v1 - 1f;
                if(arg18 >= 1f) {
                    float v12 = arg18 + 0.5f;
                    float v2 = -v12;
                    v0.this$0.mCornerRect.set(v2, v2, v12, v12);
                    int v13 = arg16.save();
                    v7.translate(v8.left + v12, v8.top + v12);
                    arg16.drawArc(v0.this$0.mCornerRect, 180f, 90f, true, arg19);
                    v7.translate(v10, 0f);
                    v7.rotate(90f);
                    arg16.drawArc(v0.this$0.mCornerRect, 180f, 90f, true, arg19);
                    v7.translate(v11, 0f);
                    v7.rotate(90f);
                    arg16.drawArc(v0.this$0.mCornerRect, 180f, 90f, true, arg19);
                    v7.translate(v10, 0f);
                    v7.rotate(90f);
                    arg16.drawArc(v0.this$0.mCornerRect, 180f, 90f, true, arg19);
                    v7.restoreToCount(v13);
                    arg16.drawRect(v8.left + v12 - 1f, v8.top, v8.right - v12 + 1f, v8.top + v12, arg19);
                    arg16.drawRect(v8.left + v12 - 1f, v8.bottom - v12, v8.right - v12 + 1f, v8.bottom, arg19);
                }

                arg16.drawRect(v8.left, v8.top + arg18, v8.right, v8.bottom - arg18, arg19);
            }
        };
    }

    public void initialize(CardViewDelegate arg7, Context arg8, ColorStateList arg9, float arg10, float arg11, float arg12) {
        RoundRectDrawableWithShadow v8 = this.createBackground(arg8, arg9, arg10, arg11, arg12);
        v8.setAddPaddingForCorners(arg7.getPreventCornerOverlap());
        arg7.setCardBackground(((Drawable)v8));
        this.updatePadding(arg7);
    }

    public void onCompatPaddingChanged(CardViewDelegate arg1) {
    }

    public void onPreventCornerOverlapChanged(CardViewDelegate arg3) {
        this.getShadowBackground(arg3).setAddPaddingForCorners(arg3.getPreventCornerOverlap());
        this.updatePadding(arg3);
    }

    public void setBackgroundColor(CardViewDelegate arg1, @Nullable ColorStateList arg2) {
        this.getShadowBackground(arg1).setColor(arg2);
    }

    public void setElevation(CardViewDelegate arg1, float arg2) {
        this.getShadowBackground(arg1).setShadowSize(arg2);
    }

    public void setMaxElevation(CardViewDelegate arg2, float arg3) {
        this.getShadowBackground(arg2).setMaxShadowSize(arg3);
        this.updatePadding(arg2);
    }

    public void setRadius(CardViewDelegate arg2, float arg3) {
        this.getShadowBackground(arg2).setCornerRadius(arg3);
        this.updatePadding(arg2);
    }

    public void updatePadding(CardViewDelegate arg5) {
        Rect v0 = new Rect();
        this.getShadowBackground(arg5).getMaxShadowAndCornerPadding(v0);
        arg5.setMinWidthHeightInternal(((int)Math.ceil(((double)this.getMinWidth(arg5)))), ((int)Math.ceil(((double)this.getMinHeight(arg5)))));
        arg5.setShadowPadding(v0.left, v0.top, v0.right, v0.bottom);
    }
}

