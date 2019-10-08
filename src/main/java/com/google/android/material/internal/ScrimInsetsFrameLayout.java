package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable insetForeground;
    Rect insets;
    private Rect tempRect;

    public ScrimInsetsFrameLayout(Context arg2) {
        this(arg2, null);
    }

    public ScrimInsetsFrameLayout(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public ScrimInsetsFrameLayout(Context arg8, AttributeSet arg9, int arg10) {
        super(arg8, arg9, arg10);
        this.tempRect = new Rect();
        TypedArray v8 = ThemeEnforcement.obtainStyledAttributes(arg8, arg9, R$styleable.ScrimInsetsFrameLayout, arg10, R$style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.insetForeground = v8.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
        v8.recycle();
        this.setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(((View)this), new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View arg5, WindowInsetsCompat arg6) {
                if(ScrimInsetsFrameLayout.this.insets == null) {
                    ScrimInsetsFrameLayout.this.insets = new Rect();
                }

                ScrimInsetsFrameLayout.this.insets.set(arg6.getSystemWindowInsetLeft(), arg6.getSystemWindowInsetTop(), arg6.getSystemWindowInsetRight(), arg6.getSystemWindowInsetBottom());
                ScrimInsetsFrameLayout.this.onInsetsChanged(arg6);
                ScrimInsetsFrameLayout v5 = ScrimInsetsFrameLayout.this;
                boolean v0 = !arg6.hasSystemWindowInsets() || ScrimInsetsFrameLayout.this.insetForeground == null ? true : false;
                v5.setWillNotDraw(v0);
                ViewCompat.postInvalidateOnAnimation(ScrimInsetsFrameLayout.this);
                return arg6.consumeSystemWindowInsets();
            }
        });
    }

    public void draw(@NonNull Canvas arg9) {
        super.draw(arg9);
        int v0 = this.getWidth();
        int v1 = this.getHeight();
        if(this.insets != null && this.insetForeground != null) {
            int v2 = arg9.save();
            arg9.translate(((float)this.getScrollX()), ((float)this.getScrollY()));
            this.tempRect.set(0, 0, v0, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(arg9);
            this.tempRect.set(0, v1 - this.insets.bottom, v0, v1);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(arg9);
            this.tempRect.set(0, this.insets.top, this.insets.left, v1 - this.insets.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(arg9);
            this.tempRect.set(v0 - this.insets.right, this.insets.top, v0, v1 - this.insets.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(arg9);
            arg9.restoreToCount(v2);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.insetForeground != null) {
            this.insetForeground.setCallback(((Drawable$Callback)this));
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.insetForeground != null) {
            this.insetForeground.setCallback(null);
        }
    }

    protected void onInsetsChanged(WindowInsetsCompat arg1) {
    }
}

