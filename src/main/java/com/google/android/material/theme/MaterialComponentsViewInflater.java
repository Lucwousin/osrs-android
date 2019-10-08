package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;

@Keep public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    public MaterialComponentsViewInflater() {
        super();
    }

    @NonNull protected AppCompatButton createButton(Context arg2, AttributeSet arg3) {
        return new MaterialButton(arg2, arg3);
    }
}

