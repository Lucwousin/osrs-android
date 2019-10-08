package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

public class JagexEditText extends AppCompatEditText {
    public JagexEditText(Context arg1) {
        super(arg1);
    }

    public JagexEditText(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public JagexEditText(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
    }

    public void setTypeface(Typeface arg2) {
        super.setTypeface(Typeface.createFromAsset(this.getContext().getAssets(), "fonts/bague_sans_thin.otf"));
    }

    public void setTypeface(Typeface arg2, int arg3) {
        super.setTypeface(Typeface.createFromAsset(this.getContext().getAssets(), "fonts/bague_sans_thin.otf"), arg3);
    }
}

