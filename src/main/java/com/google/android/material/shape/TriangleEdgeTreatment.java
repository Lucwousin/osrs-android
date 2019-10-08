package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float arg1, boolean arg2) {
        super();
        this.size = arg1;
        this.inside = arg2;
    }

    public void getEdgePath(float arg4, float arg5, ShapePath arg6) {
        float v0 = arg4 / 2f;
        arg6.lineTo(v0 - this.size * arg5, 0f);
        float v1 = this.inside ? this.size : -this.size;
        v1 *= arg5;
        arg6.lineTo(v0, v1);
        arg6.lineTo(v0 + this.size * arg5, 0f);
        arg6.lineTo(arg4, 0f);
    }
}

