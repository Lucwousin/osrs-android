package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.CircularRevealHelper$Delegate;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements CircularRevealWidget {
    private final CircularRevealHelper helper;

    public CircularRevealCoordinatorLayout(Context arg2) {
        this(arg2, null);
    }

    public CircularRevealCoordinatorLayout(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.helper = new CircularRevealHelper(((Delegate)this));
    }

    public void actualDraw(Canvas arg1) {
        super.draw(arg1);
    }

    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    public void buildCircularRevealCache() {
        this.helper.buildCircularRevealCache();
    }

    public void destroyCircularRevealCache() {
        this.helper.destroyCircularRevealCache();
    }

    public void draw(Canvas arg2) {
        if(this.helper != null) {
            this.helper.draw(arg2);
        }
        else {
            super.draw(arg2);
        }
    }

    @Nullable public Drawable getCircularRevealOverlayDrawable() {
        return this.helper.getCircularRevealOverlayDrawable();
    }

    public int getCircularRevealScrimColor() {
        return this.helper.getCircularRevealScrimColor();
    }

    @Nullable public RevealInfo getRevealInfo() {
        return this.helper.getRevealInfo();
    }

    public boolean isOpaque() {
        if(this.helper != null) {
            return this.helper.isOpaque();
        }

        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable arg2) {
        this.helper.setCircularRevealOverlayDrawable(arg2);
    }

    public void setCircularRevealScrimColor(@ColorInt int arg2) {
        this.helper.setCircularRevealScrimColor(arg2);
    }

    public void setRevealInfo(@Nullable RevealInfo arg2) {
        this.helper.setRevealInfo(arg2);
    }
}

