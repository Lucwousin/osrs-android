package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MotionTiming {
    private long delay;
    private long duration;
    @Nullable private TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long arg3, long arg5) {
        super();
        this.delay = 0;
        this.duration = 300;
        this.interpolator = null;
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = arg3;
        this.duration = arg5;
    }

    public MotionTiming(long arg3, long arg5, @NonNull TimeInterpolator arg7) {
        super();
        this.delay = 0;
        this.duration = 300;
        this.interpolator = null;
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = arg3;
        this.duration = arg5;
        this.interpolator = arg7;
    }

    public void apply(Animator arg3) {
        arg3.setStartDelay(this.getDelay());
        arg3.setDuration(this.getDuration());
        arg3.setInterpolator(this.getInterpolator());
        if((arg3 instanceof ValueAnimator)) {
            ((ValueAnimator)arg3).setRepeatCount(this.getRepeatCount());
            ((ValueAnimator)arg3).setRepeatMode(this.getRepeatMode());
        }
    }

    static MotionTiming createFromAnimator(ValueAnimator arg7) {
        MotionTiming v6 = new MotionTiming(arg7.getStartDelay(), arg7.getDuration(), MotionTiming.getInterpolatorCompat(arg7));
        v6.repeatCount = arg7.getRepeatCount();
        v6.repeatMode = arg7.getRepeatMode();
        return v6;
    }

    public boolean equals(Object arg6) {
        if(this == (((MotionTiming)arg6))) {
            return 1;
        }

        if(arg6 != null) {
            if(this.getClass() != arg6.getClass()) {
            }
            else if(this.getDelay() != ((MotionTiming)arg6).getDelay()) {
                return 0;
            }
            else if(this.getDuration() != ((MotionTiming)arg6).getDuration()) {
                return 0;
            }
            else if(this.getRepeatCount() != ((MotionTiming)arg6).getRepeatCount()) {
                return 0;
            }
            else if(this.getRepeatMode() != ((MotionTiming)arg6).getRepeatMode()) {
                return 0;
            }
            else {
                return this.getInterpolator().getClass().equals(((MotionTiming)arg6).getInterpolator().getClass());
            }
        }

        return 0;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator v0 = this.interpolator != null ? this.interpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        return v0;
    }

    private static TimeInterpolator getInterpolatorCompat(ValueAnimator arg1) {
        TimeInterpolator v1 = arg1.getInterpolator();
        if(!(v1 instanceof AccelerateDecelerateInterpolator)) {
            if(v1 == null) {
            }
            else if((v1 instanceof AccelerateInterpolator)) {
                return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            }
            else if((v1 instanceof DecelerateInterpolator)) {
                return AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            else {
                return v1;
            }
        }

        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return ((((((int)(this.getDelay() ^ this.getDelay() >>> 0x20))) * 0x1F + (((int)(this.getDuration() ^ this.getDuration() >>> 0x20)))) * 0x1F + this.getInterpolator().getClass().hashCode()) * 0x1F + this.getRepeatCount()) * 0x1F + this.getRepeatMode();
    }

    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.getDelay() + " duration: " + this.getDuration() + " interpolator: " + this.getInterpolator().getClass() + " repeatCount: " + this.getRepeatCount() + " repeatMode: " + this.getRepeatMode() + "}\n";
    }
}

