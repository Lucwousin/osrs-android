package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

public class JagexNonPaddedTextView extends JagexTextView {
    private final Rect bounds;
    private final Paint paint;

    public JagexNonPaddedTextView(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.paint = new Paint();
        this.bounds = new Rect();
    }

    public JagexNonPaddedTextView(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.paint = new Paint();
        this.bounds = new Rect();
    }

    private String calculateTextParams() {
        String v0 = this.getText().toString();
        int v1 = v0.length();
        this.paint.setTextSize(this.getTextSize());
        this.paint.getTextBounds(v0, 0, v1, this.bounds);
        if(v1 == 0) {
            this.bounds.right = this.bounds.left;
        }

        return v0;
    }

    protected void onDraw(@NonNull Canvas arg7) {
        String v0 = this.calculateTextParams();
        int v1 = this.bounds.left;
        int v2 = this.bounds.bottom;
        this.bounds.offset(-this.bounds.left, -this.bounds.top);
        this.paint.setAntiAlias(true);
        this.paint.setColor(this.getCurrentTextColor());
        arg7.drawText(v0, ((float)(-v1)), ((float)(this.bounds.bottom - v2)), this.paint);
    }

    protected void onMeasure(int arg2, int arg3) {
        super.onMeasure(arg2, arg3);
        this.calculateTextParams();
        this.setMeasuredDimension(this.bounds.width() + 1, -this.bounds.top + this.bounds.bottom);
    }
}

