package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper$Callback;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior extends Behavior {
    class com.google.android.material.behavior.SwipeDismissBehavior$1 extends Callback {
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId;
        private int originalCapturedViewLeft;

        com.google.android.material.behavior.SwipeDismissBehavior$1(SwipeDismissBehavior arg1) {
            SwipeDismissBehavior.this = arg1;
            super();
            this.activePointerId = -1;
        }

        public int clampViewPositionHorizontal(View arg3, int arg4, int arg5) {
            int v3;
            arg5 = ViewCompat.getLayoutDirection(arg3) == 1 ? 1 : 0;
            if(SwipeDismissBehavior.this.swipeDirection == 0) {
                if(arg5 != 0) {
                    arg5 = this.originalCapturedViewLeft - arg3.getWidth();
                    v3 = this.originalCapturedViewLeft;
                }
                else {
                    arg5 = this.originalCapturedViewLeft;
                    v3 = arg3.getWidth() + this.originalCapturedViewLeft;
                }
            }
            else if(SwipeDismissBehavior.this.swipeDirection != 1) {
                arg5 = this.originalCapturedViewLeft - arg3.getWidth();
                v3 = arg3.getWidth() + this.originalCapturedViewLeft;
            }
            else if(arg5 != 0) {
                arg5 = this.originalCapturedViewLeft;
                v3 = arg3.getWidth() + this.originalCapturedViewLeft;
            }
            else {
                arg5 = this.originalCapturedViewLeft - arg3.getWidth();
                v3 = this.originalCapturedViewLeft;
            }

            return SwipeDismissBehavior.clamp(arg5, arg4, v3);
        }

        public int clampViewPositionVertical(View arg1, int arg2, int arg3) {
            return arg1.getTop();
        }

        public int getViewHorizontalDragRange(View arg1) {
            return arg1.getWidth();
        }

        public void onViewCaptured(View arg1, int arg2) {
            this.activePointerId = arg2;
            this.originalCapturedViewLeft = arg1.getLeft();
            ViewParent v1 = arg1.getParent();
            if(v1 != null) {
                v1.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int arg2) {
            if(SwipeDismissBehavior.this.listener != null) {
                SwipeDismissBehavior.this.listener.onDragStateChanged(arg2);
            }
        }

        public void onViewPositionChanged(View arg3, int arg4, int arg5, int arg6, int arg7) {
            float v5 = (((float)this.originalCapturedViewLeft)) + (((float)arg3.getWidth())) * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float v6 = (((float)this.originalCapturedViewLeft)) + (((float)arg3.getWidth())) * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float v4 = ((float)arg4);
            float v7 = 1f;
            if(v4 <= v5) {
                arg3.setAlpha(v7);
            }
            else if(v4 >= v6) {
                arg3.setAlpha(0f);
            }
            else {
                arg3.setAlpha(SwipeDismissBehavior.clamp(0f, v7 - SwipeDismissBehavior.fraction(v5, v6, v4), v7));
            }
        }

        public void onViewReleased(View arg3, float arg4, float arg5) {
            boolean v5_1;
            int v4;
            this.activePointerId = -1;
            int v5 = arg3.getWidth();
            if(this.shouldDismiss(arg3, arg4)) {
                v4 = arg3.getLeft() < this.originalCapturedViewLeft ? this.originalCapturedViewLeft - v5 : this.originalCapturedViewLeft + v5;
                v5_1 = true;
            }
            else {
                v4 = this.originalCapturedViewLeft;
                v5_1 = false;
            }

            if(SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(v4, arg3.getTop())) {
                ViewCompat.postOnAnimation(arg3, new SettleRunnable(SwipeDismissBehavior.this, arg3, v5_1));
            }
            else if((v5_1) && SwipeDismissBehavior.this.listener != null) {
                SwipeDismissBehavior.this.listener.onDismiss(arg3);
            }
        }

        private boolean shouldDismiss(View arg7, float arg8) {
            boolean v1 = false;
            int v3 = Float.compare(arg8, 0f);
            if(v3 != 0) {
                int v7 = ViewCompat.getLayoutDirection(arg7) == 1 ? 1 : 0;
                if(SwipeDismissBehavior.this.swipeDirection == 2) {
                    return 1;
                }

                if(SwipeDismissBehavior.this.swipeDirection == 0) {
                    if(v7 != 0) {
                        if(arg8 >= 0f) {
                            return v1;
                        }

                        goto label_20;
                    }
                    else if(v3 > 0) {
                    label_20:
                        v1 = true;
                    }

                    return v1;
                }

                if(SwipeDismissBehavior.this.swipeDirection == 1) {
                    if(v7 != 0) {
                        if(v3 <= 0) {
                            return v1;
                        }

                        goto label_30;
                    }
                    else if(arg8 < 0f) {
                    label_30:
                        v1 = true;
                    }

                    return v1;
                }

                return 0;
            }

            if(Math.abs(arg7.getLeft() - this.originalCapturedViewLeft) >= Math.round((((float)arg7.getWidth())) * SwipeDismissBehavior.this.dragDismissThreshold)) {
                v1 = true;
            }

            return v1;
        }

        public boolean tryCaptureView(View arg2, int arg3) {
            boolean v2 = this.activePointerId != -1 || !SwipeDismissBehavior.this.canSwipeDismissView(arg2) ? false : true;
            return v2;
        }
    }

    public interface OnDismissListener {
        void onDismiss(View arg1);

        void onDragStateChanged(int arg1);
    }

    class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(SwipeDismissBehavior arg1, View arg2, boolean arg3) {
            SwipeDismissBehavior.this = arg1;
            super();
            this.view = arg2;
            this.dismiss = arg3;
        }

        public void run() {
            if(SwipeDismissBehavior.this.viewDragHelper != null && (SwipeDismissBehavior.this.viewDragHelper.continueSettling(true))) {
                ViewCompat.postOnAnimation(this.view, ((Runnable)this));
            }
            else if((this.dismiss) && SwipeDismissBehavior.this.listener != null) {
                SwipeDismissBehavior.this.listener.onDismiss(this.view);
            }
        }
    }

    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END;
    float alphaEndSwipeDistance;
    float alphaStartSwipeDistance;
    private final Callback dragCallback;
    float dragDismissThreshold;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private float sensitivity;
    private boolean sensitivitySet;
    int swipeDirection;
    ViewDragHelper viewDragHelper;

    public SwipeDismissBehavior() {
        super();
        this.sensitivity = 0f;
        this.swipeDirection = 2;
        this.dragDismissThreshold = 0.5f;
        this.alphaStartSwipeDistance = 0f;
        this.alphaEndSwipeDistance = 0.5f;
        this.dragCallback = new com.google.android.material.behavior.SwipeDismissBehavior$1(this);
    }

    public boolean canSwipeDismissView(@NonNull View arg1) {
        return 1;
    }

    static float clamp(float arg0, float arg1, float arg2) {
        return Math.min(Math.max(arg0, arg1), arg2);
    }

    static int clamp(int arg0, int arg1, int arg2) {
        return Math.min(Math.max(arg0, arg1), arg2);
    }

    private void ensureViewDragHelper(ViewGroup arg3) {
        if(this.viewDragHelper == null) {
            ViewDragHelper v3 = this.sensitivitySet ? ViewDragHelper.create(arg3, this.sensitivity, this.dragCallback) : ViewDragHelper.create(arg3, this.dragCallback);
            this.viewDragHelper = v3;
        }
    }

    static float fraction(float arg0, float arg1, float arg2) {
        return (arg2 - arg0) / (arg1 - arg0);
    }

    public int getDragState() {
        int v0 = this.viewDragHelper != null ? this.viewDragHelper.getViewDragState() : 0;
        return v0;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout arg5, View arg6, MotionEvent arg7) {
        boolean v0 = this.interceptingEvents;
        int v1 = arg7.getActionMasked();
        if(v1 != 3) {
            switch(v1) {
                case 0: {
                    goto label_7;
                }
                case 1: {
                    goto label_15;
                }
            }

            goto label_16;
        label_7:
            this.interceptingEvents = arg5.isPointInChildBounds(arg6, ((int)arg7.getX()), ((int)arg7.getY()));
            v0 = this.interceptingEvents;
        }
        else {
        label_15:
            this.interceptingEvents = false;
        }

    label_16:
        if(v0) {
            this.ensureViewDragHelper(((ViewGroup)arg5));
            return this.viewDragHelper.shouldInterceptTouchEvent(arg7);
        }

        return 0;
    }

    public boolean onTouchEvent(CoordinatorLayout arg1, View arg2, MotionEvent arg3) {
        if(this.viewDragHelper != null) {
            this.viewDragHelper.processTouchEvent(arg3);
            return 1;
        }

        return 0;
    }

    public void setDragDismissDistance(float arg3) {
        this.dragDismissThreshold = SwipeDismissBehavior.clamp(0f, arg3, 1f);
    }

    public void setEndAlphaSwipeDistance(float arg3) {
        this.alphaEndSwipeDistance = SwipeDismissBehavior.clamp(0f, arg3, 1f);
    }

    public void setListener(OnDismissListener arg1) {
        this.listener = arg1;
    }

    public void setSensitivity(float arg1) {
        this.sensitivity = arg1;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float arg3) {
        this.alphaStartSwipeDistance = SwipeDismissBehavior.clamp(0f, arg3, 1f);
    }

    public void setSwipeDirection(int arg1) {
        this.swipeDirection = arg1;
    }
}

