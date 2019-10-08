package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private boolean singleLine;

    public FlowLayout(Context arg2) {
        this(arg2, null);
    }

    public FlowLayout(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public FlowLayout(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.singleLine = false;
        this.loadFromAttributes(arg1, arg2);
    }

    @TargetApi(value=21) public FlowLayout(Context arg1, AttributeSet arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.singleLine = false;
        this.loadFromAttributes(arg1, arg2);
    }

    protected int getItemSpacing() {
        return this.itemSpacing;
    }

    protected int getLineSpacing() {
        return this.lineSpacing;
    }

    private static int getMeasuredDimension(int arg1, int arg2, int arg3) {
        if(arg2 != 0x80000000) {
            if(arg2 != 0x40000000) {
                return arg3;
            }

            return arg1;
        }

        return Math.min(arg3, arg1);
    }

    protected boolean isSingleLine() {
        return this.singleLine;
    }

    private void loadFromAttributes(Context arg3, AttributeSet arg4) {
        TypedArray v3 = arg3.getTheme().obtainStyledAttributes(arg4, R$styleable.FlowLayout, 0, 0);
        this.lineSpacing = v3.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = v3.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
        v3.recycle();
    }

    protected void onLayout(boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        int v4_1;
        int v5;
        if(this.getChildCount() == 0) {
            return;
        }

        arg11 = 1;
        if(ViewCompat.getLayoutDirection(((View)this)) == 1) {
        }
        else {
            arg11 = 0;
        }

        int v9 = arg11 != 0 ? this.getPaddingRight() : this.getPaddingLeft();
        int v0 = arg11 != 0 ? this.getPaddingLeft() : this.getPaddingRight();
        int v1 = this.getPaddingTop();
        arg12 = arg12 - arg10 - v0;
        v0 = v9;
        int v2 = v1;
        for(arg10 = 0; arg10 < this.getChildCount(); ++arg10) {
            View v3 = this.getChildAt(arg10);
            if(v3.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v4 = v3.getLayoutParams();
                if((v4 instanceof ViewGroup$MarginLayoutParams)) {
                    v5 = MarginLayoutParamsCompat.getMarginStart(((ViewGroup$MarginLayoutParams)v4));
                    v4_1 = MarginLayoutParamsCompat.getMarginEnd(((ViewGroup$MarginLayoutParams)v4));
                }
                else {
                    v4_1 = 0;
                    v5 = 0;
                }

                int v6 = v0 + v5 + v3.getMeasuredWidth();
                if(!this.singleLine && v6 > arg12) {
                    v2 = v1 + this.lineSpacing;
                    v0 = v9;
                }

                v1 = v0 + v5;
                v6 = v3.getMeasuredWidth() + v1;
                int v7 = v3.getMeasuredHeight() + v2;
                if(arg11 != 0) {
                    v3.layout(arg12 - v6, v2, arg12 - v0 - v5, v7);
                }
                else {
                    v3.layout(v1, v2, v6, v7);
                }

                v0 += v5 + v4_1 + v3.getMeasuredWidth() + this.itemSpacing;
                v1 = v7;
            }
        }
    }

    protected void onMeasure(int arg21, int arg22) {
        int v15_1;
        int v8;
        FlowLayout v0 = this;
        int v1 = View$MeasureSpec.getSize(arg21);
        int v2 = View$MeasureSpec.getMode(arg21);
        int v3 = View$MeasureSpec.getSize(arg22);
        int v4 = View$MeasureSpec.getMode(arg22);
        int v5 = v2 == 0x80000000 || v2 == 0x40000000 ? v1 : 0x7FFFFFFF;
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        v5 -= this.getPaddingRight();
        int v10 = v6;
        int v9 = v7;
        int v11 = v9;
        v6 = 0;
        v7 = 0;
        while(v6 < this.getChildCount()) {
            View v12 = v0.getChildAt(v6);
            if(v12.getVisibility() == 8) {
            }
            else {
                v0.measureChild(v12, arg21, arg22);
                ViewGroup$LayoutParams v15 = v12.getLayoutParams();
                if((v15 instanceof ViewGroup$MarginLayoutParams)) {
                    v8 = ((ViewGroup$MarginLayoutParams)v15).leftMargin;
                    v15_1 = ((ViewGroup$MarginLayoutParams)v15).rightMargin;
                }
                else {
                    v8 = 0;
                    v15_1 = 0;
                }

                int v19 = v10;
                if(v10 + v8 + v12.getMeasuredWidth() > v5 && !this.isSingleLine()) {
                    v10 = this.getPaddingLeft();
                    v11 = v0.lineSpacing + v9;
                    v19 = v10;
                }

                v9 = v19 + v8 + v12.getMeasuredWidth();
                v10 = v12.getMeasuredHeight() + v11;
                if(v9 > v7) {
                    v7 = v9;
                }

                v9 = v10;
                v10 = v19 + (v8 + v15_1 + v12.getMeasuredWidth() + v0.itemSpacing);
            }

            ++v6;
        }

        v0.setMeasuredDimension(FlowLayout.getMeasuredDimension(v1, v2, v7), FlowLayout.getMeasuredDimension(v3, v4, v9));
    }

    protected void setItemSpacing(int arg1) {
        this.itemSpacing = arg1;
    }

    protected void setLineSpacing(int arg1) {
        this.lineSpacing = arg1;
    }

    public void setSingleLine(boolean arg1) {
        this.singleLine = arg1;
    }
}

