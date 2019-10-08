package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ItemDecoration;
import androidx.recyclerview.widget.RecyclerView$State;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.R$dimen;

public class RecyclerViewItemDecorator extends ItemDecoration {
    private final int decorationHeight;

    public RecyclerViewItemDecorator(Context arg2) {
        super();
        this.decorationHeight = arg2.getResources().getDimensionPixelSize(R$dimen.decoration_space);
    }

    public void getItemOffsets(Rect arg1, View arg2, RecyclerView arg3, State arg4) {
        super.getItemOffsets(arg1, arg2, arg3, arg4);
        if(arg3 != null && arg2 != null) {
            arg1.left = this.decorationHeight / 2;
            arg1.right = this.decorationHeight / 2;
        }
    }
}

