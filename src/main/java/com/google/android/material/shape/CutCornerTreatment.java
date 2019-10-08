package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class CutCornerTreatment extends CornerTreatment {
    private final float size;

    public CutCornerTreatment(float arg1) {
        super();
        this.size = arg1;
    }

    public void getCornerPath(float arg7, float arg8, ShapePath arg9) {
        arg9.reset(0f, this.size * arg8);
        double v0 = ((double)arg7);
        double v7 = ((double)arg8);
        arg9.lineTo(((float)(Math.sin(v0) * (((double)this.size)) * v7)), ((float)(Math.cos(v0) * (((double)this.size)) * v7)));
    }
}

