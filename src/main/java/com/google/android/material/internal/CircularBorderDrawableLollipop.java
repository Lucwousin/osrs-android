package com.google.android.material.internal;

import android.graphics.Outline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(value=21) @RestrictTo(value={Scope.LIBRARY_GROUP}) public class CircularBorderDrawableLollipop extends CircularBorderDrawable {
    public CircularBorderDrawableLollipop() {
        super();
    }

    public void getOutline(Outline arg2) {
        this.copyBounds(this.rect);
        arg2.setOval(this.rect);
    }
}

