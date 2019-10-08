package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        super();
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    abstract View findFirstDependency(List arg1);

    final int getOverlapPixelsForOffset(View arg3) {
        int v1 = 0;
        if(this.overlayTop == 0) {
        }
        else {
            v1 = MathUtils.clamp(((int)(this.getOverlapRatioForOffset(arg3) * (((float)this.overlayTop)))), 0, this.overlayTop);
        }

        return v1;
    }

    float getOverlapRatioForOffset(View arg1) {
        return 1f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    int getScrollRange(View arg1) {
        return arg1.getMeasuredHeight();
    }

    final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    protected void layoutChild(CoordinatorLayout arg9, View arg10, int arg11) {
        View v0 = this.findFirstDependency(arg9.getDependencies(arg10));
        if(v0 != null) {
            ViewGroup$LayoutParams v1 = arg10.getLayoutParams();
            Rect v5 = this.tempRect1;
            v5.set(arg9.getPaddingLeft() + ((LayoutParams)v1).leftMargin, v0.getBottom() + ((LayoutParams)v1).topMargin, arg9.getWidth() - arg9.getPaddingRight() - ((LayoutParams)v1).rightMargin, arg9.getHeight() + v0.getBottom() - arg9.getPaddingBottom() - ((LayoutParams)v1).bottomMargin);
            WindowInsetsCompat v2 = arg9.getLastWindowInsets();
            if(v2 != null && (ViewCompat.getFitsSystemWindows(((View)arg9))) && !ViewCompat.getFitsSystemWindows(arg10)) {
                v5.left += v2.getSystemWindowInsetLeft();
                v5.right -= v2.getSystemWindowInsetRight();
            }

            Rect v9 = this.tempRect2;
            GravityCompat.apply(HeaderScrollingViewBehavior.resolveGravity(((LayoutParams)v1).gravity), arg10.getMeasuredWidth(), arg10.getMeasuredHeight(), v5, v9, arg11);
            arg11 = this.getOverlapPixelsForOffset(v0);
            arg10.layout(v9.left, v9.top - arg11, v9.right, v9.bottom - arg11);
            this.verticalLayoutGap = v9.top - v0.getBottom();
        }
        else {
            super.layoutChild(arg9, arg10, arg11);
            this.verticalLayoutGap = 0;
        }
    }

    public boolean onMeasureChild(CoordinatorLayout arg13, View arg14, int arg15, int arg16, int arg17, int arg18) {
        int v1 = arg14.getLayoutParams().height;
        int v2 = -1;
        if(v1 == v2 || v1 == -2) {
            View v3 = this.findFirstDependency(arg13.getDependencies(arg14));
            if(v3 != null) {
                if((ViewCompat.getFitsSystemWindows(v3)) && !ViewCompat.getFitsSystemWindows(arg14)) {
                    ViewCompat.setFitsSystemWindows(arg14, true);
                    if(ViewCompat.getFitsSystemWindows(arg14)) {
                        arg14.requestLayout();
                        return 1;
                    }
                }

                int v6 = View$MeasureSpec.getSize(arg17);
                if(v6 == 0) {
                    v6 = arg13.getHeight();
                }

                v6 = v6 - v3.getMeasuredHeight() + this.getScrollRange(v3);
                v1 = v1 == v2 ? 0x40000000 : 0x80000000;
                arg13.onMeasureChild(arg14, arg15, arg16, View$MeasureSpec.makeMeasureSpec(v6, v1), arg18);
                return 1;
            }
        }

        return 0;
    }

    private static int resolveGravity(int arg0) {
        if(arg0 == 0) {
            arg0 = 0x800033;
        }

        return arg0;
    }

    public final void setOverlayTop(int arg1) {
        this.overlayTop = arg1;
    }
}

