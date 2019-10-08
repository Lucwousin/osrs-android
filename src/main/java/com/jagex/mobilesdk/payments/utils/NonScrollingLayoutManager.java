package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class NonScrollingLayoutManager extends GridLayoutManager {
    public NonScrollingLayoutManager(Context arg1, int arg2) {
        super(arg1, arg2);
    }

    public boolean canScrollVertically() {
        return 0;
    }
}

