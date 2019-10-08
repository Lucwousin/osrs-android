package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class EdgeTreatment {
    public EdgeTreatment() {
        super();
    }

    public void getEdgePath(float arg1, float arg2, ShapePath arg3) {
        arg3.lineTo(arg1, 0f);
    }
}

