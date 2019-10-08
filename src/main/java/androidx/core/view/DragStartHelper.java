package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View$OnLongClickListener;
import android.view.View$OnTouchListener;
import android.view.View;

public class DragStartHelper {
    class androidx.core.view.DragStartHelper$1 implements View$OnLongClickListener {
        androidx.core.view.DragStartHelper$1(DragStartHelper arg1) {
            DragStartHelper.this = arg1;
            super();
        }

        public boolean onLongClick(View arg2) {
            return DragStartHelper.this.onLongClick(arg2);
        }
    }

    class androidx.core.view.DragStartHelper$2 implements View$OnTouchListener {
        androidx.core.view.DragStartHelper$2(DragStartHelper arg1) {
            DragStartHelper.this = arg1;
            super();
        }

        public boolean onTouch(View arg2, MotionEvent arg3) {
            return DragStartHelper.this.onTouch(arg2, arg3);
        }
    }

    public interface OnDragStartListener {
        boolean onDragStart(View arg1, DragStartHelper arg2);
    }

    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View$OnLongClickListener mLongClickListener;
    private final View$OnTouchListener mTouchListener;
    private final View mView;

    public DragStartHelper(View arg2, OnDragStartListener arg3) {
        super();
        this.mLongClickListener = new androidx.core.view.DragStartHelper$1(this);
        this.mTouchListener = new androidx.core.view.DragStartHelper$2(this);
        this.mView = arg2;
        this.mListener = arg3;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    public void getTouchPosition(Point arg3) {
        arg3.set(this.mLastTouchX, this.mLastTouchY);
    }

    public boolean onLongClick(View arg2) {
        return this.mListener.onDragStart(arg2, this);
    }

    public boolean onTouch(View arg5, MotionEvent arg6) {
        int v0 = ((int)arg6.getX());
        int v1 = ((int)arg6.getY());
        switch(arg6.getAction()) {
            case 0: {
                this.mLastTouchX = v0;
                this.mLastTouchY = v1;
                break;
            }
            case 2: {
                if(!MotionEventCompat.isFromSource(arg6, 0x2002)) {
                    return 0;
                }

                if((arg6.getButtonState() & 1) == 0) {
                    return 0;
                }

                if(this.mDragging) {
                    return 0;
                }

                if(this.mLastTouchX == v0 && this.mLastTouchY == v1) {
                    return 0;
                }

                this.mLastTouchX = v0;
                this.mLastTouchY = v1;
                this.mDragging = this.mListener.onDragStart(arg5, this);
                return this.mDragging;
            }
            case 1: 
            case 3: {
                this.mDragging = false;
                break;
            }
            default: {
                break;
            }
        }

        return 0;
    }
}

