package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class SnapHelper extends OnFlingListener {
    class androidx.recyclerview.widget.SnapHelper$1 extends OnScrollListener {
        boolean mScrolled;

        androidx.recyclerview.widget.SnapHelper$1(SnapHelper arg1) {
            SnapHelper.this = arg1;
            super();
            this.mScrolled = false;
        }

        public void onScrollStateChanged(RecyclerView arg1, int arg2) {
            super.onScrollStateChanged(arg1, arg2);
            if(arg2 == 0 && (this.mScrolled)) {
                this.mScrolled = false;
                SnapHelper.this.snapToTargetExistingView();
            }
        }

        public void onScrolled(RecyclerView arg1, int arg2, int arg3) {
            if(arg2 != 0 || arg3 != 0) {
                this.mScrolled = true;
            }
        }
    }

    static final float MILLISECONDS_PER_INCH = 100f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final OnScrollListener mScrollListener;

    public SnapHelper() {
        super();
        this.mScrollListener = new androidx.recyclerview.widget.SnapHelper$1(this);
    }

    public void attachToRecyclerView(@Nullable RecyclerView arg3) throws IllegalStateException {
        if(this.mRecyclerView == arg3) {
            return;
        }

        if(this.mRecyclerView != null) {
            this.destroyCallbacks();
        }

        this.mRecyclerView = arg3;
        if(this.mRecyclerView != null) {
            this.setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            this.snapToTargetExistingView();
        }
    }

    @Nullable public abstract int[] calculateDistanceToFinalSnap(@NonNull LayoutManager arg1, @NonNull View arg2);

    public int[] calculateScrollDistance(int arg11, int arg12) {
        int[] v0 = new int[2];
        this.mGravityScroller.fling(0, 0, arg11, arg12, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
        v0[0] = this.mGravityScroller.getFinalX();
        v0[1] = this.mGravityScroller.getFinalY();
        return v0;
    }

    @Nullable protected SmoothScroller createScroller(LayoutManager arg1) {
        return this.createSnapScroller(arg1);
    }

    @Nullable @Deprecated protected LinearSmoothScroller createSnapScroller(LayoutManager arg2) {
        if(!(arg2 instanceof ScrollVectorProvider)) {
            return null;
        }

        return new LinearSmoothScroller(this.mRecyclerView.getContext()) {
            protected float calculateSpeedPerPixel(DisplayMetrics arg2) {
                return 100f / (((float)arg2.densityDpi));
            }

            protected void onTargetFound(View arg3, State arg4, Action arg5) {
                if(SnapHelper.this.mRecyclerView == null) {
                    return;
                }

                int[] v3 = SnapHelper.this.calculateDistanceToFinalSnap(SnapHelper.this.mRecyclerView.getLayoutManager(), arg3);
                int v4 = v3[0];
                int v3_1 = v3[1];
                int v0 = this.calculateTimeForDeceleration(Math.max(Math.abs(v4), Math.abs(v3_1)));
                if(v0 > 0) {
                    arg5.update(v4, v3_1, v0, this.mDecelerateInterpolator);
                }
            }
        };
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    @Nullable public abstract View findSnapView(LayoutManager arg1);

    public abstract int findTargetSnapPosition(LayoutManager arg1, int arg2, int arg3);

    public boolean onFling(int arg5, int arg6) {
        LayoutManager v0 = this.mRecyclerView.getLayoutManager();
        boolean v1 = false;
        if(v0 == null) {
            return 0;
        }

        if(this.mRecyclerView.getAdapter() == null) {
            return 0;
        }

        int v2 = this.mRecyclerView.getMinFlingVelocity();
        if((Math.abs(arg6) > v2 || Math.abs(arg5) > v2) && (this.snapFromFling(v0, arg5, arg6))) {
            v1 = true;
        }

        return v1;
    }

    private void setupCallbacks() throws IllegalStateException {
        if(this.mRecyclerView.getOnFlingListener() == null) {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(((OnFlingListener)this));
            return;
        }

        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean snapFromFling(@NonNull LayoutManager arg3, int arg4, int arg5) {
        if(!(arg3 instanceof ScrollVectorProvider)) {
            return 0;
        }

        SmoothScroller v0 = this.createScroller(arg3);
        if(v0 == null) {
            return 0;
        }

        arg4 = this.findTargetSnapPosition(arg3, arg4, arg5);
        if(arg4 == -1) {
            return 0;
        }

        v0.setTargetPosition(arg4);
        arg3.startSmoothScroll(v0);
        return 1;
    }

    void snapToTargetExistingView() {
        if(this.mRecyclerView == null) {
            return;
        }

        LayoutManager v0 = this.mRecyclerView.getLayoutManager();
        if(v0 == null) {
            return;
        }

        View v1 = this.findSnapView(v0);
        if(v1 == null) {
            return;
        }

        int[] v0_1 = this.calculateDistanceToFinalSnap(v0, v1);
        if(v0_1[0] != 0 || v0_1[1] != 0) {
            this.mRecyclerView.smoothScrollBy(v0_1[0], v0_1[1]);
        }
    }
}

