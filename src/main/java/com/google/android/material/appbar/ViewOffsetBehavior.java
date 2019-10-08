package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior extends Behavior {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
        super();
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public ViewOffsetBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public int getLeftAndRightOffset() {
        int v0 = this.viewOffsetHelper != null ? this.viewOffsetHelper.getLeftAndRightOffset() : 0;
        return v0;
    }

    public int getTopAndBottomOffset() {
        int v0 = this.viewOffsetHelper != null ? this.viewOffsetHelper.getTopAndBottomOffset() : 0;
        return v0;
    }

    protected void layoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
        arg1.onLayoutChild(arg2, arg3);
    }

    public boolean onLayoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
        this.layoutChild(arg1, arg2, arg3);
        if(this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new ViewOffsetHelper(arg2);
        }

        this.viewOffsetHelper.onViewLayout();
        if(this.tempTopBottomOffset != 0) {
            this.viewOffsetHelper.setTopAndBottomOffset(this.tempTopBottomOffset);
            this.tempTopBottomOffset = 0;
        }

        if(this.tempLeftRightOffset != 0) {
            this.viewOffsetHelper.setLeftAndRightOffset(this.tempLeftRightOffset);
            this.tempLeftRightOffset = 0;
        }

        return 1;
    }

    public boolean setLeftAndRightOffset(int arg2) {
        if(this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.setLeftAndRightOffset(arg2);
        }

        this.tempLeftRightOffset = arg2;
        return 0;
    }

    public boolean setTopAndBottomOffset(int arg2) {
        if(this.viewOffsetHelper != null) {
            return this.viewOffsetHelper.setTopAndBottomOffset(arg2);
        }

        this.tempTopBottomOffset = arg2;
        return 0;
    }
}

