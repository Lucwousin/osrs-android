package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller extends SmoothScroller {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25f;
    private final float MILLISECONDS_PER_PX;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final String TAG = "LinearSmoothScroller";
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    protected PointF mTargetVector;

    public LinearSmoothScroller(Context arg2) {
        super();
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator();
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.MILLISECONDS_PER_PX = this.calculateSpeedPerPixel(arg2.getResources().getDisplayMetrics());
    }

    public int calculateDtToFit(int arg1, int arg2, int arg3, int arg4, int arg5) {
        switch(arg5) {
            case -1: {
                goto label_15;
            }
            case 0: {
                goto label_7;
            }
            case 1: {
                goto label_5;
            }
        }

        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    label_5:
        return arg4 - arg2;
    label_7:
        arg3 -= arg1;
        if(arg3 > 0) {
            return arg3;
        }

        arg4 -= arg2;
        if(arg4 < 0) {
            return arg4;
        }

        return 0;
    label_15:
        return arg3 - arg1;
    }

    public int calculateDxToMakeVisible(View arg11, int arg12) {
        LayoutManager v0 = this.getLayoutManager();
        if(v0 != null) {
            if(!v0.canScrollHorizontally()) {
            }
            else {
                ViewGroup$LayoutParams v1 = arg11.getLayoutParams();
                return this.calculateDtToFit(v0.getDecoratedLeft(arg11) - ((LayoutParams)v1).leftMargin, v0.getDecoratedRight(arg11) + ((LayoutParams)v1).rightMargin, v0.getPaddingLeft(), v0.getWidth() - v0.getPaddingRight(), arg12);
            }
        }

        return 0;
    }

    public int calculateDyToMakeVisible(View arg11, int arg12) {
        LayoutManager v0 = this.getLayoutManager();
        if(v0 != null) {
            if(!v0.canScrollVertically()) {
            }
            else {
                ViewGroup$LayoutParams v1 = arg11.getLayoutParams();
                return this.calculateDtToFit(v0.getDecoratedTop(arg11) - ((LayoutParams)v1).topMargin, v0.getDecoratedBottom(arg11) + ((LayoutParams)v1).bottomMargin, v0.getPaddingTop(), v0.getHeight() - v0.getPaddingBottom(), arg12);
            }
        }

        return 0;
    }

    protected float calculateSpeedPerPixel(DisplayMetrics arg2) {
        return 25f / (((float)arg2.densityDpi));
    }

    protected int calculateTimeForDeceleration(int arg5) {
        return ((int)Math.ceil((((double)this.calculateTimeForScrolling(arg5))) / 0.3356));
    }

    protected int calculateTimeForScrolling(int arg3) {
        return ((int)Math.ceil(((double)((((float)Math.abs(arg3))) * this.MILLISECONDS_PER_PX))));
    }

    private int clampApplyScroll(int arg1, int arg2) {
        arg2 = arg1 - arg2;
        if(arg1 * arg2 <= 0) {
            return 0;
        }

        return arg2;
    }

    protected int getHorizontalSnapPreference() {
        int v0;
        if(this.mTargetVector == null || this.mTargetVector.x == 0f) {
            v0 = 0;
        }
        else if(this.mTargetVector.x > 0f) {
            v0 = 1;
        }
        else {
            v0 = -1;
        }

        return v0;
    }

    protected int getVerticalSnapPreference() {
        int v0;
        if(this.mTargetVector == null || this.mTargetVector.y == 0f) {
            v0 = 0;
        }
        else if(this.mTargetVector.y > 0f) {
            v0 = 1;
        }
        else {
            v0 = -1;
        }

        return v0;
    }

    protected void onSeekTargetStep(int arg1, int arg2, State arg3, Action arg4) {
        if(this.getChildCount() == 0) {
            this.stop();
            return;
        }

        this.mInterimTargetDx = this.clampApplyScroll(this.mInterimTargetDx, arg1);
        this.mInterimTargetDy = this.clampApplyScroll(this.mInterimTargetDy, arg2);
        if(this.mInterimTargetDx == 0 && this.mInterimTargetDy == 0) {
            this.updateActionForInterimTarget(arg4);
        }
    }

    protected void onStart() {
    }

    protected void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    protected void onTargetFound(View arg3, State arg4, Action arg5) {
        int v4 = this.calculateDxToMakeVisible(arg3, this.getHorizontalSnapPreference());
        int v3 = this.calculateDyToMakeVisible(arg3, this.getVerticalSnapPreference());
        int v0 = this.calculateTimeForDeceleration(((int)Math.sqrt(((double)(v4 * v4 + v3 * v3)))));
        if(v0 > 0) {
            arg5.update(-v4, -v3, v0, this.mDecelerateInterpolator);
        }
    }

    protected void updateActionForInterimTarget(Action arg5) {
        PointF v0 = this.computeScrollVectorForPosition(this.getTargetPosition());
        if(v0 != null && (v0.x != 0f || v0.y != 0f)) {
            this.normalize(v0);
            this.mTargetVector = v0;
            this.mInterimTargetDx = ((int)(v0.x * 10000f));
            this.mInterimTargetDy = ((int)(v0.y * 10000f));
            arg5.update(((int)((((float)this.mInterimTargetDx)) * 1.2f)), ((int)((((float)this.mInterimTargetDy)) * 1.2f)), ((int)((((float)this.calculateTimeForScrolling(10000))) * 1.2f)), this.mLinearInterpolator);
            return;
        }

        arg5.jumpTo(this.getTargetPosition());
        this.stop();
    }
}

