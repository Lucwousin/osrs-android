package androidx.transition;

import android.animation.TypeEvaluator;

class FloatArrayEvaluator implements TypeEvaluator {
    private float[] mArray;

    FloatArrayEvaluator(float[] arg1) {
        super();
        this.mArray = arg1;
    }

    public Object evaluate(float arg1, Object arg2, Object arg3) {
        return this.evaluate(arg1, ((float[])arg2), ((float[])arg3));
    }

    public float[] evaluate(float arg5, float[] arg6, float[] arg7) {
        float[] v0 = this.mArray;
        if(v0 == null) {
            v0 = new float[arg6.length];
        }

        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            v0[v1] = arg6[v1] + (arg7[v1] - arg6[v1]) * arg5;
        }

        return v0;
    }
}

