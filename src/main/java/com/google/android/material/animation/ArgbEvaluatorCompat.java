package com.google.android.material.animation;

import android.animation.TypeEvaluator;

public class ArgbEvaluatorCompat implements TypeEvaluator {
    private static final ArgbEvaluatorCompat instance;

    static {
        ArgbEvaluatorCompat.instance = new ArgbEvaluatorCompat();
    }

    public ArgbEvaluatorCompat() {
        super();
    }

    public Integer evaluate(float arg12, Integer arg13, Integer arg14) {
        int v13 = arg13.intValue();
        float v0 = (((float)(v13 >> 24 & 0xFF))) / 255f;
        int v14 = arg14.intValue();
        float v2 = ((float)Math.pow(((double)((((float)(v13 >> 16 & 0xFF))) / 255f)), 2.2));
        float v3 = ((float)Math.pow(((double)((((float)(v13 >> 8 & 0xFF))) / 255f)), 2.2));
        float v13_1 = ((float)Math.pow(((double)((((float)(v13 & 0xFF))) / 255f)), 2.2));
        return Integer.valueOf(Math.round((((float)Math.pow(((double)(v2 + ((((float)Math.pow(((double)((((float)(v14 >> 16 & 0xFF))) / 255f)), 2.2))) - v2) * arg12)), 0.454545))) * 255f) << 16 | Math.round((v0 + ((((float)(v14 >> 24 & 0xFF))) / 255f - v0) * arg12) * 255f) << 24 | Math.round((((float)Math.pow(((double)(v3 + ((((float)Math.pow(((double)((((float)(v14 >> 8 & 0xFF))) / 255f)), 2.2))) - v3) * arg12)), 0.454545))) * 255f) << 8 | Math.round((((float)Math.pow(((double)(v13_1 + arg12 * ((((float)Math.pow(((double)((((float)(v14 & 0xFF))) / 255f)), 2.2))) - v13_1))), 0.454545))) * 255f));
    }

    public Object evaluate(float arg1, Object arg2, Object arg3) {
        return this.evaluate(arg1, ((Integer)arg2), ((Integer)arg3));
    }

    public static ArgbEvaluatorCompat getInstance() {
        return ArgbEvaluatorCompat.instance;
    }
}

