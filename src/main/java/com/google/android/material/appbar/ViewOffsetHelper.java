package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;

    public ViewOffsetHelper(View arg1) {
        super();
        this.view = arg1;
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
        this.updateOffsets();
    }

    public boolean setLeftAndRightOffset(int arg2) {
        if(this.offsetLeft != arg2) {
            this.offsetLeft = arg2;
            this.updateOffsets();
            return 1;
        }

        return 0;
    }

    public boolean setTopAndBottomOffset(int arg2) {
        if(this.offsetTop != arg2) {
            this.offsetTop = arg2;
            this.updateOffsets();
            return 1;
        }

        return 0;
    }

    private void updateOffsets() {
        ViewCompat.offsetTopAndBottom(this.view, this.offsetTop - (this.view.getTop() - this.layoutTop));
        ViewCompat.offsetLeftAndRight(this.view, this.offsetLeft - (this.view.getLeft() - this.layoutLeft));
    }
}

