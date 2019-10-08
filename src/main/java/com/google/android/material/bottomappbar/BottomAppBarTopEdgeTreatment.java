package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private float cradleVerticalOffset;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float arg1, float arg2, float arg3) {
        super();
        this.fabMargin = arg1;
        this.roundedCornerRadius = arg2;
        this.cradleVerticalOffset = arg3;
        if(arg3 >= 0f) {
            this.horizontalOffset = 0f;
            return;
        }

        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    public void getEdgePath(float arg21, float arg22, ShapePath arg23) {
        BottomAppBarTopEdgeTreatment v0 = this;
        float v1 = arg21;
        ShapePath v9 = arg23;
        if(v0.fabDiameter == 0f) {
            v9.lineTo(v1, 0f);
            return;
        }

        float v11 = 2f;
        float v12 = (v0.fabMargin * v11 + v0.fabDiameter) / v11;
        float v13 = arg22 * v0.roundedCornerRadius;
        float v14 = v1 / v11 + v0.horizontalOffset;
        float v15 = v0.cradleVerticalOffset * arg22 + (1f - arg22) * v12;
        if(v15 / v12 >= 1f) {
            v9.lineTo(v1, 0f);
            return;
        }

        float v2 = v12 + v13;
        float v3 = v15 + v13;
        v2 = ((float)Math.sqrt(((double)(v2 * v2 - v3 * v3))));
        float v4 = v14 - v2;
        float v16 = v14 + v2;
        float v8 = ((float)Math.toDegrees(Math.atan(((double)(v2 / v3)))));
        float v17 = 90f - v8;
        v3 = v4 - v13;
        v9.lineTo(v3, 0f);
        float v18 = v13 * v11;
        arg23.addArc(v3, 0f, v4 + v13, v18, 270f, v8);
        arg23.addArc(v14 - v12, -v12 - v15, v14 + v12, v12 - v15, 180f - v17, v17 * v11 - 180f);
        arg23.addArc(v16 - v13, 0f, v16 + v13, v18, 270f - v8, v8);
        v9.lineTo(v1, 0f);
    }

    float getFabCradleMargin() {
        return this.fabMargin;
    }

    float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    float getFabDiameter() {
        return this.fabDiameter;
    }

    float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    void setCradleVerticalOffset(float arg1) {
        this.cradleVerticalOffset = arg1;
    }

    void setFabCradleMargin(float arg1) {
        this.fabMargin = arg1;
    }

    void setFabCradleRoundedCornerRadius(float arg1) {
        this.roundedCornerRadius = arg1;
    }

    void setFabDiameter(float arg1) {
        this.fabDiameter = arg1;
    }

    void setHorizontalOffset(float arg1) {
        this.horizontalOffset = arg1;
    }
}

