package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;

@VisibleForTesting class FastScroller extends ItemDecoration implements OnItemTouchListener {
    class androidx.recyclerview.widget.FastScroller$1 implements Runnable {
        androidx.recyclerview.widget.FastScroller$1(FastScroller arg1) {
            FastScroller.this = arg1;
            super();
        }

        public void run() {
            FastScroller.this.hide(500);
        }
    }

    class androidx.recyclerview.widget.FastScroller$2 extends OnScrollListener {
        androidx.recyclerview.widget.FastScroller$2(FastScroller arg1) {
            FastScroller.this = arg1;
            super();
        }

        public void onScrolled(RecyclerView arg1, int arg2, int arg3) {
            FastScroller.this.updateScrollPosition(arg1.computeHorizontalScrollOffset(), arg1.computeVerticalScrollOffset());
        }
    }

    class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled;

        AnimatorListener(FastScroller arg1) {
            FastScroller.this = arg1;
            super();
            this.mCanceled = false;
        }

        public void onAnimationCancel(Animator arg1) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator arg3) {
            if(this.mCanceled) {
                this.mCanceled = false;
                return;
            }

            if(FastScroller.this.mShowHideAnimator.getAnimatedValue().floatValue() == 0f) {
                FastScroller.this.mAnimationState = 0;
                FastScroller.this.setState(0);
            }
            else {
                FastScroller.this.mAnimationState = 2;
                FastScroller.this.requestRedraw();
            }
        }
    }

    class AnimatorUpdater implements ValueAnimator$AnimatorUpdateListener {
        AnimatorUpdater(FastScroller arg1) {
            FastScroller.this = arg1;
            super();
        }

        public void onAnimationUpdate(ValueAnimator arg2) {
            int v2 = ((int)(arg2.getAnimatedValue().floatValue() * 255f));
            FastScroller.this.mVerticalThumbDrawable.setAlpha(v2);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(v2);
            FastScroller.this.requestRedraw();
        }
    }

    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int[] EMPTY_STATE_SET = null;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int SCROLLBAR_FULL_OPAQUE = 0xFF;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    int mAnimationState;
    private int mDragState;
    private final Runnable mHideRunnable;
    @VisibleForTesting float mHorizontalDragX;
    private final int[] mHorizontalRange;
    @VisibleForTesting int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;
    @VisibleForTesting int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private boolean mNeedHorizontalScrollbar;
    private boolean mNeedVerticalScrollbar;
    private final OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private int mRecyclerViewHeight;
    private int mRecyclerViewWidth;
    private final int mScrollbarMinimumRange;
    final ValueAnimator mShowHideAnimator;
    private int mState;
    @VisibleForTesting float mVerticalDragY;
    private final int[] mVerticalRange;
    @VisibleForTesting int mVerticalThumbCenterY;
    final StateListDrawable mVerticalThumbDrawable;
    @VisibleForTesting int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;

    static {
        FastScroller.PRESSED_STATE_SET = new int[]{0x10100A7};
        FastScroller.EMPTY_STATE_SET = new int[0];
    }

    FastScroller(RecyclerView arg4, StateListDrawable arg5, Drawable arg6, StateListDrawable arg7, Drawable arg8, int arg9, int arg10, int arg11) {
        super();
        this.mRecyclerViewWidth = 0;
        this.mRecyclerViewHeight = 0;
        this.mNeedVerticalScrollbar = false;
        this.mNeedHorizontalScrollbar = false;
        this.mState = 0;
        this.mDragState = 0;
        this.mVerticalRange = new int[2];
        this.mHorizontalRange = new int[2];
        this.mShowHideAnimator = ValueAnimator.ofFloat(new float[]{0f, 1f});
        this.mAnimationState = 0;
        this.mHideRunnable = new androidx.recyclerview.widget.FastScroller$1(this);
        this.mOnScrollListener = new androidx.recyclerview.widget.FastScroller$2(this);
        this.mVerticalThumbDrawable = arg5;
        this.mVerticalTrackDrawable = arg6;
        this.mHorizontalThumbDrawable = arg7;
        this.mHorizontalTrackDrawable = arg8;
        this.mVerticalThumbWidth = Math.max(arg9, arg5.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(arg9, arg6.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(arg9, arg7.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(arg9, arg8.getIntrinsicWidth());
        this.mScrollbarMinimumRange = arg10;
        this.mMargin = arg11;
        this.mVerticalThumbDrawable.setAlpha(0xFF);
        this.mVerticalTrackDrawable.setAlpha(0xFF);
        this.mShowHideAnimator.addListener(new AnimatorListener(this));
        this.mShowHideAnimator.addUpdateListener(new AnimatorUpdater(this));
        this.attachToRecyclerView(arg4);
    }

    public void attachToRecyclerView(@Nullable RecyclerView arg2) {
        if(this.mRecyclerView == arg2) {
            return;
        }

        if(this.mRecyclerView != null) {
            this.destroyCallbacks();
        }

        this.mRecyclerView = arg2;
        if(this.mRecyclerView != null) {
            this.setupCallbacks();
        }
    }

    private void cancelHide() {
        this.mRecyclerView.removeCallbacks(this.mHideRunnable);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(((ItemDecoration)this));
        this.mRecyclerView.removeOnItemTouchListener(((OnItemTouchListener)this));
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        this.cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas arg7) {
        int v0 = this.mRecyclerViewHeight - this.mHorizontalThumbHeight;
        int v1 = this.mHorizontalThumbCenterX - this.mHorizontalThumbWidth / 2;
        this.mHorizontalThumbDrawable.setBounds(0, 0, this.mHorizontalThumbWidth, this.mHorizontalThumbHeight);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        arg7.translate(0f, ((float)v0));
        this.mHorizontalTrackDrawable.draw(arg7);
        arg7.translate(((float)v1), 0f);
        this.mHorizontalThumbDrawable.draw(arg7);
        arg7.translate(((float)(-v1)), ((float)(-v0)));
    }

    private void drawVerticalScrollbar(Canvas arg7) {
        int v0 = this.mRecyclerViewWidth - this.mVerticalThumbWidth;
        int v1 = this.mVerticalThumbCenterY - this.mVerticalThumbHeight / 2;
        this.mVerticalThumbDrawable.setBounds(0, 0, this.mVerticalThumbWidth, this.mVerticalThumbHeight);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if(this.isLayoutRTL()) {
            this.mVerticalTrackDrawable.draw(arg7);
            arg7.translate(((float)this.mVerticalThumbWidth), ((float)v1));
            arg7.scale(-1f, 1f);
            this.mVerticalThumbDrawable.draw(arg7);
            arg7.scale(1f, 1f);
            arg7.translate(((float)(-this.mVerticalThumbWidth)), ((float)(-v1)));
        }
        else {
            arg7.translate(((float)v0), 0f);
            this.mVerticalTrackDrawable.draw(arg7);
            arg7.translate(0f, ((float)v1));
            this.mVerticalThumbDrawable.draw(arg7);
            arg7.translate(((float)(-v0)), ((float)(-v1)));
        }
    }

    private int[] getHorizontalRange() {
        this.mHorizontalRange[0] = this.mMargin;
        this.mHorizontalRange[1] = this.mRecyclerViewWidth - this.mMargin;
        return this.mHorizontalRange;
    }

    @VisibleForTesting Drawable getHorizontalThumbDrawable() {
        return this.mHorizontalThumbDrawable;
    }

    @VisibleForTesting Drawable getHorizontalTrackDrawable() {
        return this.mHorizontalTrackDrawable;
    }

    private int[] getVerticalRange() {
        this.mVerticalRange[0] = this.mMargin;
        this.mVerticalRange[1] = this.mRecyclerViewHeight - this.mMargin;
        return this.mVerticalRange;
    }

    @VisibleForTesting Drawable getVerticalThumbDrawable() {
        return this.mVerticalThumbDrawable;
    }

    @VisibleForTesting Drawable getVerticalTrackDrawable() {
        return this.mVerticalTrackDrawable;
    }

    public void hide() {
        this.hide(0);
    }

    @VisibleForTesting void hide(int arg5) {
        switch(this.mAnimationState) {
            case 1: {
                goto label_3;
            }
            case 2: {
                goto label_5;
            }
        }

        return;
    label_3:
        this.mShowHideAnimator.cancel();
    label_5:
        this.mAnimationState = 3;
        this.mShowHideAnimator.setFloatValues(new float[]{this.mShowHideAnimator.getAnimatedValue().floatValue(), 0f});
        this.mShowHideAnimator.setDuration(((long)arg5));
        this.mShowHideAnimator.start();
    }

    private void horizontalScrollTo(float arg9) {
        int[] v3 = this.getHorizontalRange();
        arg9 = Math.max(((float)v3[0]), Math.min(((float)v3[1]), arg9));
        if(Math.abs((((float)this.mHorizontalThumbCenterX)) - arg9) < 2f) {
            return;
        }

        int v0 = this.scrollTo(this.mHorizontalDragX, arg9, v3, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
        if(v0 != 0) {
            this.mRecyclerView.scrollBy(v0, 0);
        }

        this.mHorizontalDragX = arg9;
    }

    public boolean isDragging() {
        boolean v0 = this.mState == 2 ? true : false;
        return v0;
    }

    @VisibleForTesting boolean isHidden() {
        boolean v0 = this.mState == 0 ? true : false;
        return v0;
    }

    private boolean isLayoutRTL() {
        boolean v1 = true;
        if(ViewCompat.getLayoutDirection(this.mRecyclerView) == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    @VisibleForTesting boolean isPointInsideHorizontalThumb(float arg3, float arg4) {
        boolean v3 = arg4 < (((float)(this.mRecyclerViewHeight - this.mHorizontalThumbHeight))) || arg3 < (((float)(this.mHorizontalThumbCenterX - this.mHorizontalThumbWidth / 2))) || arg3 > (((float)(this.mHorizontalThumbCenterX + this.mHorizontalThumbWidth / 2))) ? false : true;
        return v3;
    }

    @VisibleForTesting boolean isPointInsideVerticalThumb(float arg3, float arg4) {
        boolean v3;
        if(this.isLayoutRTL()) {
            if(arg3 <= (((float)(this.mVerticalThumbWidth / 2)))) {
                goto label_12;
            }
            else {
                goto label_26;
            }
        }
        else if(arg3 >= (((float)(this.mRecyclerViewWidth - this.mVerticalThumbWidth)))) {
        label_12:
            if(arg4 < (((float)(this.mVerticalThumbCenterY - this.mVerticalThumbHeight / 2)))) {
                goto label_26;
            }
            else if(arg4 <= (((float)(this.mVerticalThumbCenterY + this.mVerticalThumbHeight / 2)))) {
                v3 = true;
            }
            else {
                goto label_26;
            }
        }
        else {
        label_26:
            v3 = false;
        }

        return v3;
    }

    @VisibleForTesting boolean isVisible() {
        boolean v1 = true;
        if(this.mState == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public void onDrawOver(Canvas arg1, RecyclerView arg2, State arg3) {
        if(this.mRecyclerViewWidth == this.mRecyclerView.getWidth()) {
            if(this.mRecyclerViewHeight != this.mRecyclerView.getHeight()) {
            }
            else {
                if(this.mAnimationState != 0) {
                    if(this.mNeedVerticalScrollbar) {
                        this.drawVerticalScrollbar(arg1);
                    }

                    if(!this.mNeedHorizontalScrollbar) {
                        return;
                    }

                    this.drawHorizontalScrollbar(arg1);
                }

                return;
            }
        }

        this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
        this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
        this.setState(0);
    }

    public boolean onInterceptTouchEvent(@NonNull RecyclerView arg6, @NonNull MotionEvent arg7) {
        boolean v0 = false;
        int v1 = 2;
        if(this.mState == 1) {
            boolean v6 = this.isPointInsideVerticalThumb(arg7.getX(), arg7.getY());
            boolean v3 = this.isPointInsideHorizontalThumb(arg7.getX(), arg7.getY());
            if(arg7.getAction() == 0) {
                if(!v6 && !v3) {
                    return v0;
                }

                if(v3) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = ((float)(((int)arg7.getX())));
                }
                else if(v6) {
                    this.mDragState = v1;
                    this.mVerticalDragY = ((float)(((int)arg7.getY())));
                }

                this.setState(v1);
                goto label_32;
            }
        }
        else {
            if(this.mState != v1) {
                return v0;
            }

        label_32:
            v0 = true;
        }

        return v0;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean arg1) {
    }

    public void onTouchEvent(@NonNull RecyclerView arg5, @NonNull MotionEvent arg6) {
        if(this.mState == 0) {
            return;
        }

        int v1 = 2;
        if(arg6.getAction() == 0) {
            boolean v5 = this.isPointInsideVerticalThumb(arg6.getX(), arg6.getY());
            boolean v2 = this.isPointInsideHorizontalThumb(arg6.getX(), arg6.getY());
            if(!v5 && !v2) {
                return;
            }

            if(v2) {
                this.mDragState = 1;
                this.mHorizontalDragX = ((float)(((int)arg6.getX())));
            }
            else if(v5) {
                this.mDragState = v1;
                this.mVerticalDragY = ((float)(((int)arg6.getY())));
            }

            this.setState(v1);
        }
        else {
            if(arg6.getAction() == 1 && this.mState == v1) {
                this.mVerticalDragY = 0f;
                this.mHorizontalDragX = 0f;
                this.setState(1);
                this.mDragState = 0;
                return;
            }

            if(arg6.getAction() != v1) {
                return;
            }

            if(this.mState != v1) {
                return;
            }

            this.show();
            if(this.mDragState == 1) {
                this.horizontalScrollTo(arg6.getX());
            }

            if(this.mDragState != v1) {
                return;
            }

            this.verticalScrollTo(arg6.getY());
        }
    }

    void requestRedraw() {
        this.mRecyclerView.invalidate();
    }

    private void resetHideDelay(int arg5) {
        this.cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, ((long)arg5));
    }

    private int scrollTo(float arg3, float arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int v0 = arg5[1] - arg5[0];
        if(v0 == 0) {
            return 0;
        }

        arg6 -= arg8;
        int v3 = ((int)((arg4 - arg3) / (((float)v0)) * (((float)arg6))));
        arg7 += v3;
        if(arg7 < arg6 && arg7 >= 0) {
            return v3;
        }

        return 0;
    }

    void setState(int arg4) {
        int v0 = 2;
        if(arg4 == v0 && this.mState != v0) {
            this.mVerticalThumbDrawable.setState(FastScroller.PRESSED_STATE_SET);
            this.cancelHide();
        }

        if(arg4 == 0) {
            this.requestRedraw();
        }
        else {
            this.show();
        }

        if(this.mState == v0 && arg4 != v0) {
            this.mVerticalThumbDrawable.setState(FastScroller.EMPTY_STATE_SET);
            this.resetHideDelay(1200);
        }
        else if(arg4 == 1) {
            this.resetHideDelay(1500);
        }

        this.mState = arg4;
    }

    private void setupCallbacks() {
        this.mRecyclerView.addItemDecoration(((ItemDecoration)this));
        this.mRecyclerView.addOnItemTouchListener(((OnItemTouchListener)this));
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    public void show() {
        int v0 = this.mAnimationState;
        if(v0 == 0) {
        label_7:
            this.mAnimationState = 1;
            this.mShowHideAnimator.setFloatValues(new float[]{this.mShowHideAnimator.getAnimatedValue().floatValue(), 1f});
            this.mShowHideAnimator.setDuration(500);
            this.mShowHideAnimator.setStartDelay(0);
            this.mShowHideAnimator.start();
        }
        else if(v0 != 3) {
        }
        else {
            this.mShowHideAnimator.cancel();
            goto label_7;
        }
    }

    void updateScrollPosition(int arg9, int arg10) {
        int v0 = this.mRecyclerView.computeVerticalScrollRange();
        int v1 = this.mRecyclerViewHeight;
        boolean v2 = v0 - v1 <= 0 || this.mRecyclerViewHeight < this.mScrollbarMinimumRange ? false : true;
        this.mNeedVerticalScrollbar = v2;
        int v2_1 = this.mRecyclerView.computeHorizontalScrollRange();
        int v5 = this.mRecyclerViewWidth;
        boolean v6 = v2_1 - v5 <= 0 || this.mRecyclerViewWidth < this.mScrollbarMinimumRange ? false : true;
        this.mNeedHorizontalScrollbar = v6;
        if(!this.mNeedVerticalScrollbar && !this.mNeedHorizontalScrollbar) {
            if(this.mState != 0) {
                this.setState(0);
            }

            return;
        }

        float v6_1 = 2f;
        if(this.mNeedVerticalScrollbar) {
            float v3 = ((float)v1);
            this.mVerticalThumbCenterY = ((int)(v3 * ((((float)arg10)) + v3 / v6_1) / (((float)v0))));
            this.mVerticalThumbHeight = Math.min(v1, v1 * v1 / v0);
        }

        if(this.mNeedHorizontalScrollbar) {
            float v10 = ((float)v5);
            this.mHorizontalThumbCenterX = ((int)(v10 * ((((float)arg9)) + v10 / v6_1) / (((float)v2_1))));
            this.mHorizontalThumbWidth = Math.min(v5, v5 * v5 / v2_1);
        }

        if(this.mState == 0 || this.mState == 1) {
            this.setState(1);
        }
    }

    private void verticalScrollTo(float arg9) {
        int[] v3 = this.getVerticalRange();
        arg9 = Math.max(((float)v3[0]), Math.min(((float)v3[1]), arg9));
        if(Math.abs((((float)this.mVerticalThumbCenterY)) - arg9) < 2f) {
            return;
        }

        int v0 = this.scrollTo(this.mVerticalDragY, arg9, v3, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
        if(v0 != 0) {
            this.mRecyclerView.scrollBy(0, v0);
        }

        this.mVerticalDragY = arg9;
    }
}

