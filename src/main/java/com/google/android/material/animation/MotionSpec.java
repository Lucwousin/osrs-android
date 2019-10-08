package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.annotation.AnimatorRes;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final SimpleArrayMap timings;

    public MotionSpec() {
        super();
        this.timings = new SimpleArrayMap();
    }

    private static void addTimingFromAnimator(MotionSpec arg2, Animator arg3) {
        if((arg3 instanceof ObjectAnimator)) {
            arg2.setTiming(((ObjectAnimator)arg3).getPropertyName(), MotionTiming.createFromAnimator(((ValueAnimator)arg3)));
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Animator must be an ObjectAnimator: ");
        v0.append(arg3);
        throw new IllegalArgumentException(v0.toString());
    }

    @Nullable public static MotionSpec createFromAttribute(Context arg1, TypedArray arg2, @StyleableRes int arg3) {
        if(arg2.hasValue(arg3)) {
            int v2 = arg2.getResourceId(arg3, 0);
            if(v2 != 0) {
                return MotionSpec.createFromResource(arg1, v2);
            }
        }

        return null;
    }

    @Nullable public static MotionSpec createFromResource(Context arg4, @AnimatorRes int arg5) {
        MotionSpec v0 = null;
        try {
            Animator v4_1 = AnimatorInflater.loadAnimator(arg4, arg5);
            if((v4_1 instanceof AnimatorSet)) {
                return MotionSpec.createSpecFromAnimators(((AnimatorSet)v4_1).getChildAnimations());
            }

            if(v4_1 == null) {
                return v0;
            }

            ArrayList v1 = new ArrayList();
            ((List)v1).add(v4_1);
            return MotionSpec.createSpecFromAnimators(((List)v1));
        }
        catch(Exception v4) {
            Log.w("MotionSpec", "Can\'t load animation resource ID #0x" + Integer.toHexString(arg5), ((Throwable)v4));
            return v0;
        }

        return v0;
    }

    private static MotionSpec createSpecFromAnimators(List arg4) {
        MotionSpec v0 = new MotionSpec();
        int v1 = arg4.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            MotionSpec.addTimingFromAnimator(v0, arg4.get(v2));
        }

        return v0;
    }

    public boolean equals(Object arg3) {
        if(this == (((MotionSpec)arg3))) {
            return 1;
        }

        if(arg3 != null) {
            if(this.getClass() != arg3.getClass()) {
            }
            else {
                return this.timings.equals(((MotionSpec)arg3).timings);
            }
        }

        return 0;
    }

    public MotionTiming getTiming(String arg2) {
        if(this.hasTiming(arg2)) {
            return this.timings.get(arg2);
        }

        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int v0 = this.timings.size();
        long v1 = 0;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            Object v4 = this.timings.valueAt(v3);
            v1 = Math.max(v1, ((MotionTiming)v4).getDelay() + ((MotionTiming)v4).getDuration());
        }

        return v1;
    }

    public boolean hasTiming(String arg2) {
        boolean v2 = this.timings.get(arg2) != null ? true : false;
        return v2;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setTiming(String arg2, @Nullable MotionTiming arg3) {
        this.timings.put(arg2, arg3);
    }

    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}

