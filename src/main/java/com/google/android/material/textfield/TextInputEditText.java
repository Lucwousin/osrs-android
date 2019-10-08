package com.google.android.material.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R$attr;

public class TextInputEditText extends AppCompatEditText {
    public TextInputEditText(Context arg2) {
        this(arg2, null);
    }

    public TextInputEditText(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.editTextStyle);
    }

    public TextInputEditText(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
    }

    public CharSequence getHint() {
        TextInputLayout v0 = this.getTextInputLayout();
        if(v0 != null && (v0.isProvidingHint())) {
            return v0.getHint();
        }

        return super.getHint();
    }

    @Nullable private CharSequence getHintFromLayout() {
        TextInputLayout v0 = this.getTextInputLayout();
        CharSequence v0_1 = v0 != null ? v0.getHint() : null;
        return v0_1;
    }

    @Nullable private TextInputLayout getTextInputLayout() {
        ViewParent v0;
        for(v0 = this.getParent(); (v0 instanceof View); v0 = v0.getParent()) {
            if((v0 instanceof TextInputLayout)) {
                return ((TextInputLayout)v0);
            }
        }

        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo arg3) {
        InputConnection v0 = super.onCreateInputConnection(arg3);
        if(v0 != null && arg3.hintText == null) {
            arg3.hintText = this.getHintFromLayout();
        }

        return v0;
    }
}

