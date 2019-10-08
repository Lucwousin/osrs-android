package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF arg2, float arg3, @NonNull PointF arg4, float arg5) {
        super();
        this.mStart = Preconditions.checkNotNull(arg2, "start == null");
        this.mStartFraction = arg3;
        this.mEnd = Preconditions.checkNotNull(arg4, "end == null");
        this.mEndFraction = arg5;
    }

    public boolean equals(Object arg5) {
        boolean v0 = true;
        if(this == (((PathSegment)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof PathSegment)) {
            return 0;
        }

        if(Float.compare(this.mStartFraction, ((PathSegment)arg5).mStartFraction) != 0 || Float.compare(this.mEndFraction, ((PathSegment)arg5).mEndFraction) != 0 || !this.mStart.equals(((PathSegment)arg5).mStart) || !this.mEnd.equals(((PathSegment)arg5).mEnd)) {
            v0 = false;
        }
        else {
        }

        return v0;
    }

    @NonNull public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int v0 = this.mStart.hashCode() * 0x1F;
        int v2 = 0;
        int v1 = this.mStartFraction != 0f ? Float.floatToIntBits(this.mStartFraction) : 0;
        v0 = ((v0 + v1) * 0x1F + this.mEnd.hashCode()) * 0x1F;
        if(this.mEndFraction != 0f) {
            v2 = Float.floatToIntBits(this.mEndFraction);
        }

        return v0 + v2;
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}

