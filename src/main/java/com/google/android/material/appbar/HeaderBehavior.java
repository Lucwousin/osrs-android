package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

abstract class HeaderBehavior extends ViewOffsetBehavior {
    class FlingRunnable implements Runnable {
        private final View layout;
        private final CoordinatorLayout parent;

        FlingRunnable(HeaderBehavior arg1, CoordinatorLayout arg2, View arg3) {
            HeaderBehavior.this = arg1;
            super();
            this.parent = arg2;
            this.layout = arg3;
        }

        public void run() {
            if(this.layout != null && HeaderBehavior.this.scroller != null) {
                if(HeaderBehavior.this.scroller.computeScrollOffset()) {
                    HeaderBehavior.this.setHeaderTopBottomOffset(this.parent, this.layout, HeaderBehavior.this.scroller.getCurrY());
                    ViewCompat.postOnAnimation(this.layout, ((Runnable)this));
                }
                else {
                    HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
                }
            }
        }
    }

    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    public HeaderBehavior() {
        super();
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    boolean canDragView(View arg1) {
        return 0;
    }

    private void ensureVelocityTracker() {
        if(this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    final boolean fling(CoordinatorLayout arg14, View arg15, int arg16, int arg17, float arg18) {
        HeaderBehavior v0 = this;
        if(v0.flingRunnable != null) {
            arg15.removeCallbacks(v0.flingRunnable);
            v0.flingRunnable = null;
        }

        if(v0.scroller == null) {
            v0.scroller = new OverScroller(arg15.getContext());
        }

        v0.scroller.fling(0, this.getTopAndBottomOffset(), 0, Math.round(arg18), 0, 0, arg16, arg17);
        if(v0.scroller.computeScrollOffset()) {
            v0.flingRunnable = new FlingRunnable(this, arg14, arg15);
            ViewCompat.postOnAnimation(arg15, v0.flingRunnable);
            return 1;
        }

        this.onFlingFinished(arg14, arg15);
        return 0;
    }

    int getMaxDragOffset(View arg1) {
        return -arg1.getHeight();
    }

    int getScrollRangeForDragFling(View arg1) {
        return arg1.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return this.getTopAndBottomOffset();
    }

    void onFlingFinished(CoordinatorLayout arg1, View arg2) {
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout arg5, View arg6, MotionEvent arg7) {
        if(this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(arg5.getContext()).getScaledTouchSlop();
        }

        if(arg7.getAction() == 2 && (this.isBeingDragged)) {
            return 1;
        }

        int v1 = -1;
        switch(arg7.getActionMasked()) {
            case 0: {
                this.isBeingDragged = false;
                int v0 = ((int)arg7.getX());
                v1 = ((int)arg7.getY());
                if(!this.canDragView(arg6)) {
                    goto label_56;
                }

                if(!arg5.isPointInChildBounds(arg6, v0, v1)) {
                    goto label_56;
                }

                this.lastMotionY = v1;
                this.activePointerId = arg7.getPointerId(0);
                this.ensureVelocityTracker();
                break;
            }
            case 2: {
                int v5 = this.activePointerId;
                if(v5 == v1) {
                    goto label_56;
                }

                v5 = arg7.findPointerIndex(v5);
                if(v5 == v1) {
                    goto label_56;
                }

                v5 = ((int)arg7.getY(v5));
                if(Math.abs(v5 - this.lastMotionY) <= this.touchSlop) {
                    goto label_56;
                }

                this.isBeingDragged = true;
                this.lastMotionY = v5;
                break;
            }
            case 1: 
            case 3: {
                this.isBeingDragged = false;
                this.activePointerId = v1;
                if(this.velocityTracker == null) {
                    goto label_56;
                }

                this.velocityTracker.recycle();
                this.velocityTracker = null;
                break;
            }
            default: {
                break;
            }
        }

    label_56:
        if(this.velocityTracker != null) {
            this.velocityTracker.addMovement(arg7);
        }

        return this.isBeingDragged;
    }

    public boolean onTouchEvent(CoordinatorLayout arg12, View arg13, MotionEvent arg14) {
        int v0;
        if(this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(arg12.getContext()).getScaledTouchSlop();
        }

        int v2 = -1;
        switch(arg14.getActionMasked()) {
            case 0: {
                v0 = ((int)arg14.getX());
                v2 = ((int)arg14.getY());
                if((arg12.isPointInChildBounds(arg13, v0, v2)) && (this.canDragView(arg13))) {
                    this.lastMotionY = v2;
                    this.activePointerId = arg14.getPointerId(0);
                    this.ensureVelocityTracker();
                    goto label_83;
                }

                return 0;
            }
            case 1: {
                if(this.velocityTracker == null) {
                    goto label_60;
                }

                this.velocityTracker.addMovement(arg14);
                this.velocityTracker.computeCurrentVelocity(1000);
                this.fling(arg12, arg13, -this.getScrollRangeForDragFling(arg13), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                goto label_60;
            }
            case 2: {
                v0 = arg14.findPointerIndex(this.activePointerId);
                if(v0 == v2) {
                    return 0;
                }

                v0 = ((int)arg14.getY(v0));
                v2 = this.lastMotionY - v0;
                if(!this.isBeingDragged && Math.abs(v2) > this.touchSlop) {
                    this.isBeingDragged = true;
                    if(v2 > 0) {
                        v2 -= this.touchSlop;
                    }
                    else {
                        v2 += this.touchSlop;
                    }
                }

                int v6 = v2;
                if(!this.isBeingDragged) {
                    goto label_83;
                }

                this.lastMotionY = v0;
                this.scroll(arg12, arg13, v6, this.getMaxDragOffset(arg13), 0);
                break;
            }
            case 3: {
            label_60:
                this.isBeingDragged = false;
                this.activePointerId = v2;
                if(this.velocityTracker == null) {
                    goto label_83;
                }

                this.velocityTracker.recycle();
                this.velocityTracker = null;
                break;
            }
            default: {
                break;
            }
        }

    label_83:
        if(this.velocityTracker != null) {
            this.velocityTracker.addMovement(arg14);
        }

        return 1;
    }

    final int scroll(CoordinatorLayout arg8, View arg9, int arg10, int arg11, int arg12) {
        return this.setHeaderTopBottomOffset(arg8, arg9, this.getTopBottomOffsetForScrollingSibling() - arg10, arg11, arg12);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5) {
        int v1 = this.getTopAndBottomOffset();
        if(arg4 == 0 || v1 < arg4 || v1 > arg5) {
        label_9:
            v1 = 0;
        }
        else {
            int v2 = MathUtils.clamp(arg3, arg4, arg5);
            if(v1 != v2) {
                this.setTopAndBottomOffset(v2);
                v1 -= v2;
            }
            else {
                goto label_9;
            }
        }

        return v1;
    }

    int setHeaderTopBottomOffset(CoordinatorLayout arg7, View arg8, int arg9) {
        return this.setHeaderTopBottomOffset(arg7, arg8, arg9, 0x80000000, 0x7FFFFFFF);
    }
}

