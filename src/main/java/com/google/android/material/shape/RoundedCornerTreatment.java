package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class RoundedCornerTreatment extends CornerTreatment {
    private final float radius;

    public RoundedCornerTreatment(float arg1) {
        super();
        this.radius = arg1;
    }

    public void getCornerPath(float arg10, float arg11, ShapePath arg12) {
        arg12.reset(0f, this.radius * arg11);
        arg12.addArc(0f, 0f, this.radius * 2f * arg11, this.radius * 2f * arg11, arg10 + 180f, 90f);
    }
}

