package com.jagex.mobilesdk.payments.utils;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class JagexSnapHelper extends PagerSnapHelper {
    private int snapPosition;

    public JagexSnapHelper() {
        super();
        this.snapPosition = -1;
    }

    public void attachToRecyclerView(@Nullable RecyclerView arg1) throws IllegalStateException {
        super.attachToRecyclerView(arg1);
    }

    public View findSnapView(LayoutManager arg3) {
        if(((arg3 instanceof LinearLayoutManager)) && this.snapPosition != -1) {
            return arg3.findViewByPosition(this.snapPosition);
        }

        return super.findSnapView(arg3);
    }

    public void setSnapPosition(int arg1) {
        this.snapPosition = arg1;
    }
}

