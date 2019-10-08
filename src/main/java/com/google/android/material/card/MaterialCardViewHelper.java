package com.google.android.material.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class MaterialCardViewHelper {
    private static final int DEFAULT_STROKE_VALUE = -1;
    private final MaterialCardView materialCardView;
    private int strokeColor;
    private int strokeWidth;

    public MaterialCardViewHelper(MaterialCardView arg1) {
        super();
        this.materialCardView = arg1;
    }

    private void adjustContentPadding() {
        this.materialCardView.setContentPadding(this.materialCardView.getContentPaddingLeft() + this.strokeWidth, this.materialCardView.getContentPaddingTop() + this.strokeWidth, this.materialCardView.getContentPaddingRight() + this.strokeWidth, this.materialCardView.getContentPaddingBottom() + this.strokeWidth);
    }

    private Drawable createForegroundDrawable() {
        GradientDrawable v0 = new GradientDrawable();
        v0.setCornerRadius(this.materialCardView.getRadius());
        if(this.strokeColor != -1) {
            v0.setStroke(this.strokeWidth, this.strokeColor);
        }

        return ((Drawable)v0);
    }

    @ColorInt int getStrokeColor() {
        return this.strokeColor;
    }

    @Dimension int getStrokeWidth() {
        return this.strokeWidth;
    }

    public void loadFromAttributes(TypedArray arg3) {
        this.strokeColor = arg3.getColor(R$styleable.MaterialCardView_strokeColor, -1);
        this.strokeWidth = arg3.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
        this.updateForeground();
        this.adjustContentPadding();
    }

    void setStrokeColor(@ColorInt int arg1) {
        this.strokeColor = arg1;
        this.updateForeground();
    }

    void setStrokeWidth(@Dimension int arg1) {
        this.strokeWidth = arg1;
        this.updateForeground();
        this.adjustContentPadding();
    }

    void updateForeground() {
        this.materialCardView.setForeground(this.createForegroundDrawable());
    }
}

