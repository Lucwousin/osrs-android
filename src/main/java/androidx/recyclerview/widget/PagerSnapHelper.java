package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PagerSnapHelper extends SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    @Nullable private OrientationHelper mHorizontalHelper;
    @Nullable private OrientationHelper mVerticalHelper;

    public PagerSnapHelper() {
        super();
    }

    @Nullable public int[] calculateDistanceToFinalSnap(@NonNull LayoutManager arg5, @NonNull View arg6) {
        int[] v0 = new int[2];
        v0[0] = arg5.canScrollHorizontally() ? this.distanceToCenter(arg5, arg6, this.getHorizontalHelper(arg5)) : 0;
        v0[1] = arg5.canScrollVertically() ? this.distanceToCenter(arg5, arg6, this.getVerticalHelper(arg5)) : 0;
        return v0;
    }

    protected LinearSmoothScroller createSnapScroller(LayoutManager arg2) {
        if(!(arg2 instanceof ScrollVectorProvider)) {
            return null;
        }

        return new LinearSmoothScroller(this.mRecyclerView.getContext()) {
            protected float calculateSpeedPerPixel(DisplayMetrics arg2) {
                return 100f / (((float)arg2.densityDpi));
            }

            protected int calculateTimeForScrolling(int arg2) {
                return Math.min(100, super.calculateTimeForScrolling(arg2));
            }

            protected void onTargetFound(View arg3, State arg4, Action arg5) {
                int[] v3 = PagerSnapHelper.this.calculateDistanceToFinalSnap(PagerSnapHelper.this.mRecyclerView.getLayoutManager(), arg3);
                int v4 = v3[0];
                int v3_1 = v3[1];
                int v0 = this.calculateTimeForDeceleration(Math.max(Math.abs(v4), Math.abs(v3_1)));
                if(v0 > 0) {
                    arg5.update(v4, v3_1, v0, this.mDecelerateInterpolator);
                }
            }
        };
    }

    private int distanceToCenter(@NonNull LayoutManager arg2, @NonNull View arg3, OrientationHelper arg4) {
        int v0 = arg4.getDecoratedStart(arg3) + arg4.getDecoratedMeasurement(arg3) / 2;
        int v2 = arg2.getClipToPadding() ? arg4.getStartAfterPadding() + arg4.getTotalSpace() / 2 : arg4.getEnd() / 2;
        return v0 - v2;
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

    @Nullable public View findSnapView(LayoutManager arg2) {
        if(arg2.canScrollVertically()) {
            return this.findCenterView(arg2, this.getVerticalHelper(arg2));
        }

        if(arg2.canScrollHorizontally()) {
            return this.findCenterView(arg2, this.getHorizontalHelper(arg2));
        }

        return null;
    }

    @Nullable private View findStartView(LayoutManager arg7, OrientationHelper arg8) {
        int v0 = arg7.getChildCount();
        View v1 = null;
        if(v0 == 0) {
            return v1;
        }

        int v2 = 0x7FFFFFFF;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            View v4 = arg7.getChildAt(v3);
            int v5 = arg8.getDecoratedStart(v4);
            if(v5 < v2) {
                v1 = v4;
                v2 = v5;
            }
        }

        return v1;
    }

    public int findTargetSnapPosition(LayoutManager arg6, int arg7, int arg8) {
        int v0 = arg6.getItemCount();
        int v1 = -1;
        if(v0 == 0) {
            return v1;
        }

        View v2 = null;
        if(arg6.canScrollVertically()) {
            v2 = this.findStartView(arg6, this.getVerticalHelper(arg6));
        }
        else if(arg6.canScrollHorizontally()) {
            v2 = this.findStartView(arg6, this.getHorizontalHelper(arg6));
        }

        if(v2 == null) {
            return v1;
        }

        int v2_1 = arg6.getPosition(v2);
        if(v2_1 == v1) {
            return v1;
        }

        int v3 = 0;
        if(arg6.canScrollHorizontally()) {
            if(arg7 <= 0) {
                goto label_26;
            }

            goto label_24;
        }
        else if(arg8 > 0) {
        label_24:
            arg7 = 1;
        }
        else {
        label_26:
            arg7 = 0;
        }

        if((arg6 instanceof ScrollVectorProvider)) {
            PointF v6 = ((ScrollVectorProvider)arg6).computeScrollVectorForPosition(v0 - 1);
            if(v6 != null) {
                if(v6.x >= 0f && v6.y >= 0f) {
                    goto label_41;
                }

                v3 = 1;
            }
        }

    label_41:
        if(v3 != 0) {
            if(arg7 != 0) {
                --v2_1;
            }
        }
        else if(arg7 != 0) {
            ++v2_1;
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

