package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private int maxInlineActionWidth;
    private int maxWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context arg2) {
        this(arg2, null);
    }

    public SnackbarContentLayout(Context arg2, AttributeSet arg3) {
        super(arg2, arg3);
        TypedArray v2 = arg2.obtainStyledAttributes(arg3, R$styleable.SnackbarLayout);
        this.maxWidth = v2.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
        this.maxInlineActionWidth = v2.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
        v2.recycle();
    }

    public void animateContentIn(int arg8, int arg9) {
        this.messageView.setAlpha(0f);
        float v2 = 1f;
        long v3 = ((long)arg9);
        long v5 = ((long)arg8);
        this.messageView.animate().alpha(v2).setDuration(v3).setStartDelay(v5).start();
        if(this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0f);
            this.actionView.animate().alpha(v2).setDuration(v3).setStartDelay(v5).start();
        }
    }

    public void animateContentOut(int arg8, int arg9) {
        float v1 = 1f;
        this.messageView.setAlpha(v1);
        long v3 = ((long)arg9);
        long v5 = ((long)arg8);
        this.messageView.animate().alpha(0f).setDuration(v3).setStartDelay(v5).start();
        if(this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(v1);
            this.actionView.animate().alpha(0f).setDuration(v3).setStartDelay(v5).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = this.findViewById(R$id.snackbar_text);
        this.actionView = this.findViewById(R$id.snackbar_action);
    }

    protected void onMeasure(int arg8, int arg9) {
        super.onMeasure(arg8, arg9);
        if(this.maxWidth > 0 && this.getMeasuredWidth() > this.maxWidth) {
            arg8 = View$MeasureSpec.makeMeasureSpec(this.maxWidth, 0x40000000);
            super.onMeasure(arg8, arg9);
        }

        int v0 = this.getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical_2lines);
        int v1 = this.getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical);
        int v4 = 1;
        int v2 = this.messageView.getLayout().getLineCount() > 1 ? 1 : 0;
        if(v2 == 0 || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if(v2 != 0) {
            }
            else {
                v0 = v1;
            }

            if(this.updateViewsWithinLayout(0, v0, v0)) {
                goto label_43;
            }

        label_42:
            v4 = 0;
        }
        else if(this.updateViewsWithinLayout(1, v0, v0 - v1)) {
        }
        else {
            goto label_42;
        }

    label_43:
        if(v4 != 0) {
            super.onMeasure(arg8, arg9);
        }
    }

    private static void updateTopBottomPadding(View arg2, int arg3, int arg4) {
        if(ViewCompat.isPaddingRelative(arg2)) {
            ViewCompat.setPaddingRelative(arg2, ViewCompat.getPaddingStart(arg2), arg3, ViewCompat.getPaddingEnd(arg2), arg4);
        }
        else {
            arg2.setPadding(arg2.getPaddingLeft(), arg3, arg2.getPaddingRight(), arg4);
        }
    }

    private boolean updateViewsWithinLayout(int arg3, int arg4, int arg5) {
        boolean v3;
        if(arg3 != this.getOrientation()) {
            this.setOrientation(arg3);
            v3 = true;
        }
        else {
            v3 = false;
        }

        if(this.messageView.getPaddingTop() != arg4 || this.messageView.getPaddingBottom() != arg5) {
            SnackbarContentLayout.updateTopBottomPadding(this.messageView, arg4, arg5);
            v3 = true;
        }

        return v3;
    }
}

