package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class MaterialCardView extends CardView {
    private final MaterialCardViewHelper cardViewHelper;

    public MaterialCardView(Context arg2) {
        this(arg2, null);
    }

    public MaterialCardView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.materialCardViewStyle);
    }

    public MaterialCardView(Context arg7, AttributeSet arg8, int arg9) {
        super(arg7, arg8, arg9);
        TypedArray v7 = ThemeEnforcement.obtainStyledAttributes(arg7, arg8, R$styleable.MaterialCardView, arg9, R$style.Widget_MaterialComponents_CardView, new int[0]);
        this.cardViewHelper = new MaterialCardViewHelper(this);
        this.cardViewHelper.loadFromAttributes(v7);
        v7.recycle();
    }

    @ColorInt public int getStrokeColor() {
        return this.cardViewHelper.getStrokeColor();
    }

    @Dimension public int getStrokeWidth() {
        return this.cardViewHelper.getStrokeWidth();
    }

    public void setRadius(float arg1) {
        super.setRadius(arg1);
        this.cardViewHelper.updateForeground();
    }

    public void setStrokeColor(@ColorInt int arg2) {
        this.cardViewHelper.setStrokeColor(arg2);
    }

    public void setStrokeWidth(@Dimension int arg2) {
        this.cardViewHelper.setStrokeWidth(arg2);
    }
}

