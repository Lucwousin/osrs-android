package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LinearSnapHelper extends SnapHelper {
    private static final float INVALID_DISTANCE = 1f;
    @Nullable private OrientationHelper mHorizontalHelper;
    @Nullable private OrientationHelper mVerticalHelper;

    public LinearSnapHelper() {
        super();
    }

    public int[] calculateDistanceToFinalSnap(@NonNull LayoutManager arg5, @NonNull View arg6) {
        int[] v0 = new int[2];
        v0[0] = arg5.canScrollHorizontally() ? this.distanceToCenter(arg5, arg6, this.getHorizontalHelper(arg5)) : 0;
        v0[1] = arg5.canScrollVertically() ? this.distanceToCenter(arg5, arg6, this.getVerticalHelper(arg5)) : 0;
        return v0;
    }

    private float computeDistancePerChild(LayoutManager arg11, OrientationHelper arg12) {
        int v0 = arg11.getChildCount();
        float v1 = 1f;
        if(v0 == 0) {
            return v1;
        }

        int v2 = 0;
        View v3 = null;
        int v4 = 0x7FFFFFFF;
        View v5 = v3;
        int v6 = 0x80000000;
        while(v2 < v0) {
            View v7 = arg11.getChildAt(v2);
            int v8 = arg11.getPosition(v7);
            if(v8 == -1) {
            }
            else {
                if(v8 < v4) {
                    v3 = v7;
                    v4 = v8;
                }

                if(v8 <= v6) {
                    goto label_22;
                }

                v5 = v7;
                v6 = v8;
            }

        label_22:
            ++v2;
        }

        if(v3 != null) {
            if(v5 == null) {
            }
            else {
                int v12 = Math.max(arg12.getDecoratedEnd(v3), arg12.getDecoratedEnd(v5)) - Math.min(arg12.getDecoratedStart(v3), arg12.getDecoratedStart(v5));
                if(v12 == 0) {
                    return v1;
                }
                else {
                    return (((float)v12)) * v1 / (((float)(v6 - v4 + 1)));
                }
            }
        }

        return v1;
    }

    private int distanceToCenter(@NonNull LayoutManager arg2, @NonNull View arg3, OrientationHelper arg4) {
        int v0 = arg4.getDecoratedStart(arg3) + arg4.getDecoratedMeasurement(arg3) / 2;
        int v2 = arg2.getClipToPadding() ? arg4.getStartAfterPadding() + arg4.getTotalSpace() / 2 : arg4.getEnd() / 2;
        return v0 - v2;
    }

    private int estimateNextPositionDiffForFling(LayoutManager arg3, OrientationHelper arg4, int arg5, int arg6) {
        int[] v5 = this.calculateScrollDistance(arg5, arg6);
        float v3 = this.computeDistancePerChild(arg3, arg4);
        if(v3 <= 0f) {
            return 0;
        }

        int v4 = Math.abs(v5[0]) > Math.abs(v5[1]) ? v5[0] : v5[1];
        return Math.round((((float)v4)) / v3);
    }

    @Nullable private View findCenterView(LayoutManager arg9, OrientationHelper arg10) {
        int v0 = arg9.getChildCount();
        View v1 = null;
        if(v0 == 0) {
            return v1;
        }

        int v2 = arg9.getClipToPadding() ? arg10.getStartAfterPadding() + arg10.getTotalSpace() / 2 : arg10.getEnd() / 2;
        int v3 = 0x7FFFFFFF;
        int v4;
        for(v4 = 0; v4 < v0; ++v4) {
            View v5 = arg9.getChildAt(v4);
            int v6 = Math.abs(arg10.getDecoratedStart(v5) + arg10.getDecoratedMeasurement(v5) / 2 - v2);
            if(v6 < v3) {
                v1 = v5;
                v3 = v6;
            }
        }

        return v1;
    }

    public View findSnapView(LayoutManager arg2) {
        if(arg2.canScrollVertically()) {
            return this.findCenterView(arg2, this.getVerticalHelper(arg2));
        }

        if(arg2.canScrollHorizontally()) {
            return this.findCenterView(arg2, this.getHorizontalHelper(arg2));
        }

        return null;
    }

    public int findTargetSnapPosition(LayoutManager arg9, int arg10, int arg11) {
        int v1 = -1;
        if(!(arg9 instanceof ScrollVectorProvider)) {
            return v1;
        }

        int v0 = arg9.getItemCount();
        if(v0 == 0) {
            return v1;
        }

        View v2 = this.findSnapView(arg9);
        if(v2 == null) {
            return v1;
        }

        int v2_1 = arg9.getPosition(v2);
        if(v2_1 == v1) {
            return v1;
        }

        int v4 = v0 - 1;
        PointF v3 = arg9.computeScrollVectorForPosition(v4);
        if(v3 == null) {
            return v1;
        }

        if(arg9.canScrollHorizontally()) {
            arg10 = this.estimateNextPositionDiffForFling(arg9, this.getHorizontalHelper(arg9), arg10, 0);
            if(v3.x < 0f) {
                arg10 = -arg10;
            }
        }
        else {
            arg10 = 0;
        }

        if(arg9.canScrollVertically()) {
            arg11 = this.estimateNextPositionDiffForFling(arg9, this.getVerticalHelper(arg9), 0, arg11);
            if(v3.y < 0f) {
                arg11 = -arg11;
            }
        }
        else {
            arg11 = 0;
        }

        if(arg9.canScrollVertically()) {
            arg10 = arg11;
        }

        if(arg10 == 0) {
            return v1;
        }

        v2_1 += arg10;
        if(v2_1 < 0) {
            v2_1 = 0;
        }

        if(v2_1 >= v0) {
            v2_1 = v4;
        }

        return v2_1;
    }

    @NonNull private OrientationHelper getHorizontalHelper(@NonNull LayoutManager arg2) {
        if(this.mHorizontalHelper == null || this.mHorizontalHelper.mLayoutManager != arg2) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(arg2);
        }

        return this.mHorizontalHelper;
    }

    @NonNull private OrientationHelper getVerticalHelper(@NonNull LayoutManager arg2) {
        if(this.mVerticalHelper == null || this.mVerticalHelper.mLayoutManager != arg2) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(arg2);
        }

        return this.mVerticalHelper;
    }
}

