package androidx.recyclerview.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R$dimen;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
    class androidx.recyclerview.widget.ItemTouchHelper$1 implements Runnable {
        androidx.recyclerview.widget.ItemTouchHelper$1(ItemTouchHelper arg1) {
            ItemTouchHelper.this = arg1;
            super();
        }

        public void run() {
            if(ItemTouchHelper.this.mSelected != null && (ItemTouchHelper.this.scrollIfNecessary())) {
                if(ItemTouchHelper.this.mSelected != null) {
                    ItemTouchHelper.this.moveIfNecessary(ItemTouchHelper.this.mSelected);
                }

                ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                ViewCompat.postOnAnimation(ItemTouchHelper.this.mRecyclerView, ((Runnable)this));
            }
        }
    }

    class androidx.recyclerview.widget.ItemTouchHelper$2 implements OnItemTouchListener {
        androidx.recyclerview.widget.ItemTouchHelper$2(ItemTouchHelper arg1) {
            ItemTouchHelper.this = arg1;
            super();
        }

        public boolean onInterceptTouchEvent(@NonNull RecyclerView arg6, @NonNull MotionEvent arg7) {
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(arg7);
            int v6 = arg7.getActionMasked();
            boolean v0 = true;
            if(v6 == 0) {
                ItemTouchHelper.this.mActivePointerId = arg7.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = arg7.getX();
                ItemTouchHelper.this.mInitialTouchY = arg7.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                if(ItemTouchHelper.this.mSelected == null) {
                    RecoverAnimation v6_1 = ItemTouchHelper.this.findAnimation(arg7);
                    if(v6_1 != null) {
                        ItemTouchHelper.this.mInitialTouchX -= v6_1.mX;
                        ItemTouchHelper.this.mInitialTouchY -= v6_1.mY;
                        ItemTouchHelper.this.endRecoverAnimation(v6_1.mViewHolder, true);
                        if(ItemTouchHelper.this.mPendingCleanup.remove(v6_1.mViewHolder.itemView)) {
                            ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, v6_1.mViewHolder);
                        }

                        ItemTouchHelper.this.select(v6_1.mViewHolder, v6_1.mActionState);
                        ItemTouchHelper.this.updateDxDy(arg7, ItemTouchHelper.this.mSelectedFlags, 0);
                    }
                }
            }
            else {
                int v3 = -1;
                if(v6 != 3) {
                    if(v6 == 1) {
                    }
                    else {
                        if(ItemTouchHelper.this.mActivePointerId != v3) {
                            int v2 = arg7.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                            if(v2 >= 0) {
                                ItemTouchHelper.this.checkSelectForSwipe(v6, arg7, v2);
                            }
                            else {
                            }
                        }
                        else {
                        }

                        goto label_78;
                    }
                }

                ItemTouchHelper.this.mActivePointerId = v3;
                ItemTouchHelper.this.select(null, 0);
            }

        label_78:
            if(ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(arg7);
            }

            if(ItemTouchHelper.this.mSelected != null) {
            }
            else {
                v0 = false;
            }

            return v0;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean arg3) {
            if(!arg3) {
                return;
            }

            ItemTouchHelper.this.select(null, 0);
        }

        public void onTouchEvent(@NonNull RecyclerView arg6, @NonNull MotionEvent arg7) {
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(arg7);
            if(ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(arg7);
            }

            int v0 = -1;
            if(ItemTouchHelper.this.mActivePointerId == v0) {
                return;
            }

            int v6 = arg7.getActionMasked();
            int v1 = arg7.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
            if(v1 >= 0) {
                ItemTouchHelper.this.checkSelectForSwipe(v6, arg7, v1);
            }

            ViewHolder v2 = ItemTouchHelper.this.mSelected;
            if(v2 == null) {
                return;
            }

            int v4 = 0;
            if(v6 != 6) {
                switch(v6) {
                    case 1: {
                        goto label_56;
                    }
                    case 2: {
                        goto label_37;
                    }
                    case 3: {
                        goto label_30;
                    }
                }

                return;
            label_37:
                if(v1 >= 0) {
                    ItemTouchHelper.this.updateDxDy(arg7, ItemTouchHelper.this.mSelectedFlags, v1);
                    ItemTouchHelper.this.moveIfNecessary(v2);
                    ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                    ItemTouchHelper.this.mScrollRunnable.run();
                    ItemTouchHelper.this.mRecyclerView.invalidate();
                    return;
                label_30:
                    if(ItemTouchHelper.this.mVelocityTracker != null) {
                        ItemTouchHelper.this.mVelocityTracker.clear();
                        goto label_56;
                    }
                    else {
                    label_56:
                        ItemTouchHelper.this.select(null, 0);
                        ItemTouchHelper.this.mActivePointerId = v0;
                    }
                }
            }
            else {
                v6 = arg7.getActionIndex();
                if(arg7.getPointerId(v6) == ItemTouchHelper.this.mActivePointerId) {
                    if(v6 == 0) {
                        v4 = 1;
                    }

                    ItemTouchHelper.this.mActivePointerId = arg7.getPointerId(v4);
                    ItemTouchHelper.this.updateDxDy(arg7, ItemTouchHelper.this.mSelectedFlags, v6);
                }
            }
        }
    }

    public abstract class Callback {
        final class androidx.recyclerview.widget.ItemTouchHelper$Callback$1 implements Interpolator {
            androidx.recyclerview.widget.ItemTouchHelper$Callback$1() {
                super();
            }

            public float getInterpolation(float arg2) {
                return arg2 * arg2 * arg2 * arg2 * arg2;
            }
        }

        final class androidx.recyclerview.widget.ItemTouchHelper$Callback$2 implements Interpolator {
            androidx.recyclerview.widget.ItemTouchHelper$Callback$2() {
                super();
            }

            public float getInterpolation(float arg3) {
                --arg3;
                return arg3 * arg3 * arg3 * arg3 * arg3 + 1f;
            }
        }

        private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xC0C0C;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 0xFA;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 0x303030;
        private int mCachedMaxScrollSpeed;
        private static final Interpolator sDragScrollInterpolator;
        private static final Interpolator sDragViewScrollCapInterpolator;

        static {
            Callback.sDragScrollInterpolator = new androidx.recyclerview.widget.ItemTouchHelper$Callback$1();
            Callback.sDragViewScrollCapInterpolator = new androidx.recyclerview.widget.ItemTouchHelper$Callback$2();
        }

        public Callback() {
            super();
            this.mCachedMaxScrollSpeed = -1;
        }

        public boolean canDropOver(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2, @NonNull ViewHolder arg3) {
            return 1;
        }

        public ViewHolder chooseDropTarget(@NonNull ViewHolder arg15, @NonNull List arg16, int arg17, int arg18) {
            Object v6_1;
            int v11;
            ViewHolder v0 = arg15;
            int v1 = arg17 + v0.itemView.getWidth();
            int v2 = arg18 + v0.itemView.getHeight();
            int v3 = arg17 - v0.itemView.getLeft();
            int v4 = arg18 - v0.itemView.getTop();
            int v5 = arg16.size();
            ViewHolder v6 = null;
            int v7 = -1;
            int v8;
            for(v8 = 0; v8 < v5; ++v8) {
                Object v10 = arg16.get(v8);
                if(v3 > 0) {
                    v11 = ((ViewHolder)v10).itemView.getRight() - v1;
                    if(v11 >= 0) {
                        goto label_34;
                    }
                    else if(((ViewHolder)v10).itemView.getRight() > v0.itemView.getRight()) {
                        v11 = Math.abs(v11);
                        if(v11 > v7) {
                            v6_1 = v10;
                        }
                        else {
                            goto label_34;
                        }
                    }
                    else {
                        goto label_34;
                    }
                }
                else {
                label_34:
                    v11 = v7;
                }

                if(v3 < 0) {
                    v7 = ((ViewHolder)v10).itemView.getLeft() - arg17;
                    if(v7 > 0 && ((ViewHolder)v10).itemView.getLeft() < v0.itemView.getLeft()) {
                        v7 = Math.abs(v7);
                        if(v7 > v11) {
                            v11 = v7;
                            v6_1 = v10;
                        }
                    }
                }

                if(v4 < 0) {
                    v7 = ((ViewHolder)v10).itemView.getTop() - arg18;
                    if(v7 > 0 && ((ViewHolder)v10).itemView.getTop() < v0.itemView.getTop()) {
                        v7 = Math.abs(v7);
                        if(v7 > v11) {
                            v11 = v7;
                            v6_1 = v10;
                        }
                    }
                }

                if(v4 > 0) {
                    v7 = ((ViewHolder)v10).itemView.getBottom() - v2;
                    if(v7 >= 0) {
                        goto label_77;
                    }
                    else if(((ViewHolder)v10).itemView.getBottom() > v0.itemView.getBottom()) {
                        v7 = Math.abs(v7);
                        if(v7 > v11) {
                            v6_1 = v10;
                        }
                        else {
                            goto label_77;
                        }
                    }
                    else {
                        goto label_77;
                    }
                }
                else {
                label_77:
                    v7 = v11;
                }
            }

            return ((ViewHolder)v6_1);
        }

        public void clearView(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2) {
            ItemTouchUIUtilImpl.INSTANCE.clearView(arg2.itemView);
        }

        public int convertToAbsoluteDirection(int arg4, int arg5) {
            int v0 = 0x303030;
            int v1 = arg4 & v0;
            if(v1 == 0) {
                return arg4;
            }

            arg4 &= ~v1;
            if(arg5 == 0) {
                return arg4 | v1 >> 2;
            }

            arg5 = v1 >> 1;
            return arg4 | 0xFFCFCFCF & arg5 | (arg5 & v0) >> 2;
        }

        public static int convertToRelativeDirection(int arg3, int arg4) {
            int v0 = 0xC0C0C;
            int v1 = arg3 & v0;
            if(v1 == 0) {
                return arg3;
            }

            arg3 &= ~v1;
            if(arg4 == 0) {
                return arg3 | v1 << 2;
            }

            arg4 = v1 << 1;
            return arg3 | 0xFFF3F3F3 & arg4 | (arg4 & v0) << 2;
        }

        final int getAbsoluteMovementFlags(RecyclerView arg1, ViewHolder arg2) {
            return this.convertToAbsoluteDirection(this.getMovementFlags(arg1, arg2), ViewCompat.getLayoutDirection(((View)arg1)));
        }

        public long getAnimationDuration(@NonNull RecyclerView arg1, int arg2, float arg3, float arg4) {
            ItemAnimator v1 = arg1.getItemAnimator();
            int v3 = 8;
            if(v1 == null) {
                long v1_1 = arg2 == v3 ? 200 : 0xFA;
                return v1_1;
            }

            return arg2 == v3 ? v1.getMoveDuration() : v1.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        @NonNull public static ItemTouchUIUtil getDefaultUIUtil() {
            return ItemTouchUIUtilImpl.INSTANCE;
        }

        private int getMaxDragScroll(RecyclerView arg3) {
            if(this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = arg3.getResources().getDimensionPixelSize(R$dimen.item_touch_helper_max_drag_scroll_per_frame);
            }

            return this.mCachedMaxScrollSpeed;
        }

        public float getMoveThreshold(@NonNull ViewHolder arg1) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2);

        public float getSwipeEscapeVelocity(float arg1) {
            return arg1;
        }

        public float getSwipeThreshold(@NonNull ViewHolder arg1) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float arg1) {
            return arg1;
        }

        boolean hasDragFlag(RecyclerView arg1, ViewHolder arg2) {
            boolean v1 = (this.getAbsoluteMovementFlags(arg1, arg2) & 0xFF0000) != 0 ? true : false;
            return v1;
        }

        boolean hasSwipeFlag(RecyclerView arg1, ViewHolder arg2) {
            boolean v1 = (this.getAbsoluteMovementFlags(arg1, arg2) & 0xFF00) != 0 ? true : false;
            return v1;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView arg5, int arg6, int arg7, int arg8, long arg9) {
            float v1 = 1f;
            int v5 = ((int)((((float)((((int)Math.signum(((float)arg7)))) * this.getMaxDragScroll(arg5)))) * Callback.sDragViewScrollCapInterpolator.getInterpolation(Math.min(v1, (((float)Math.abs(arg7))) * v1 / (((float)arg6))))));
            if(arg9 > 2000) {
            }
            else {
                v1 = (((float)arg9)) / 2000f;
            }

            v5 = ((int)((((float)v5)) * Callback.sDragScrollInterpolator.getInterpolation(v1)));
            if(v5 == 0) {
                return arg7 > 0 ? 1 : -1;
            }

            return v5;
        }

        public boolean isItemViewSwipeEnabled() {
            return 1;
        }

        public boolean isLongPressDragEnabled() {
            return 1;
        }

        public static int makeFlag(int arg0, int arg1) {
            return arg1 << arg0 * 8;
        }

        public static int makeMovementFlags(int arg2, int arg3) {
            return Callback.makeFlag(2, arg2) | (Callback.makeFlag(1, arg3) | Callback.makeFlag(0, arg3 | arg2));
        }

        public void onChildDraw(@NonNull Canvas arg9, @NonNull RecyclerView arg10, @NonNull ViewHolder arg11, float arg12, float arg13, int arg14, boolean arg15) {
            ItemTouchUIUtilImpl.INSTANCE.onDraw(arg9, arg10, arg11.itemView, arg12, arg13, arg14, arg15);
        }

        public void onChildDrawOver(@NonNull Canvas arg9, @NonNull RecyclerView arg10, ViewHolder arg11, float arg12, float arg13, int arg14, boolean arg15) {
            ItemTouchUIUtilImpl.INSTANCE.onDrawOver(arg9, arg10, arg11.itemView, arg12, arg13, arg14, arg15);
        }

        void onDraw(Canvas arg14, RecyclerView arg15, ViewHolder arg16, List arg17, int arg18, float arg19, float arg20) {
            int v9 = arg17.size();
            int v10;
            for(v10 = 0; v10 < v9; ++v10) {
                Object v0 = arg17.get(v10);
                ((RecoverAnimation)v0).update();
                int v12 = arg14.save();
                this.onChildDraw(arg14, arg15, ((RecoverAnimation)v0).mViewHolder, ((RecoverAnimation)v0).mX, ((RecoverAnimation)v0).mY, ((RecoverAnimation)v0).mActionState, false);
                arg14.restoreToCount(v12);
            }

            if(arg16 != null) {
                v9 = arg14.save();
                this.onChildDraw(arg14, arg15, arg16, arg19, arg20, arg18, true);
                arg14.restoreToCount(v9);
            }
        }

        void onDrawOver(Canvas arg15, RecyclerView arg16, ViewHolder arg17, List arg18, int arg19, float arg20, float arg21) {
            List v9 = arg18;
            int v10 = arg18.size();
            int v11 = 0;
            int v12;
            for(v12 = 0; v12 < v10; ++v12) {
                Object v0 = v9.get(v12);
                int v13 = arg15.save();
                this.onChildDrawOver(arg15, arg16, ((RecoverAnimation)v0).mViewHolder, ((RecoverAnimation)v0).mX, ((RecoverAnimation)v0).mY, ((RecoverAnimation)v0).mActionState, false);
                arg15.restoreToCount(v13);
            }

            if(arg17 != null) {
                v12 = arg15.save();
                this.onChildDrawOver(arg15, arg16, arg17, arg20, arg21, arg19, true);
                arg15.restoreToCount(v12);
            }

            --v10;
            while(v10 >= 0) {
                Object v1 = v9.get(v10);
                if((((RecoverAnimation)v1).mEnded) && !((RecoverAnimation)v1).mIsPendingCleanup) {
                    v9.remove(v10);
                }
                else if(!((RecoverAnimation)v1).mEnded) {
                    v11 = 1;
                }

                --v10;
            }

            if(v11 != 0) {
                arg16.invalidate();
            }
        }

        public abstract boolean onMove(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2, @NonNull ViewHolder arg3);

        public void onMoved(@NonNull RecyclerView arg2, @NonNull ViewHolder arg3, int arg4, @NonNull ViewHolder arg5, int arg6, int arg7, int arg8) {
            LayoutManager v4 = arg2.getLayoutManager();
            if((v4 instanceof ViewDropHandler)) {
                ((ViewDropHandler)v4).prepareForDrop(arg3.itemView, arg5.itemView, arg7, arg8);
                return;
            }

            if(v4.canScrollHorizontally()) {
                if(v4.getDecoratedLeft(arg5.itemView) <= arg2.getPaddingLeft()) {
                    arg2.scrollToPosition(arg6);
                }

                if(v4.getDecoratedRight(arg5.itemView) < arg2.getWidth() - arg2.getPaddingRight()) {
                    goto label_21;
                }

                arg2.scrollToPosition(arg6);
            }

        label_21:
            if(v4.canScrollVertically()) {
                if(v4.getDecoratedTop(arg5.itemView) <= arg2.getPaddingTop()) {
                    arg2.scrollToPosition(arg6);
                }

                if(v4.getDecoratedBottom(arg5.itemView) < arg2.getHeight() - arg2.getPaddingBottom()) {
                    return;
                }

                arg2.scrollToPosition(arg6);
            }
        }

        public void onSelectedChanged(@Nullable ViewHolder arg1, int arg2) {
            if(arg1 != null) {
                ItemTouchUIUtilImpl.INSTANCE.onSelected(arg1.itemView);
            }
        }

        public abstract void onSwiped(@NonNull ViewHolder arg1, int arg2);
    }

    class ItemTouchHelperGestureListener extends GestureDetector$SimpleOnGestureListener {
        private boolean mShouldReactToLongPress;

        ItemTouchHelperGestureListener(ItemTouchHelper arg1) {
            ItemTouchHelper.this = arg1;
            super();
            this.mShouldReactToLongPress = true;
        }

        void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        public boolean onDown(MotionEvent arg1) {
            return 1;
        }

        public void onLongPress(MotionEvent arg4) {
            if(!this.mShouldReactToLongPress) {
                return;
            }

            View v0 = ItemTouchHelper.this.findChildView(arg4);
            if(v0 != null) {
                ViewHolder v0_1 = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(v0);
                if(v0_1 != null) {
                    if(!ItemTouchHelper.this.mCallback.hasDragFlag(ItemTouchHelper.this.mRecyclerView, v0_1)) {
                        return;
                    }
                    else if(arg4.getPointerId(0) == ItemTouchHelper.this.mActivePointerId) {
                        int v1 = arg4.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                        float v2 = arg4.getX(v1);
                        float v4 = arg4.getY(v1);
                        ItemTouchHelper.this.mInitialTouchX = v2;
                        ItemTouchHelper.this.mInitialTouchY = v4;
                        ItemTouchHelper v4_1 = ItemTouchHelper.this;
                        ItemTouchHelper.this.mDy = 0f;
                        v4_1.mDx = 0f;
                        if(ItemTouchHelper.this.mCallback.isLongPressDragEnabled()) {
                            ItemTouchHelper.this.select(v0_1, 2);
                        }
                    }
                }
            }
        }
    }

    class RecoverAnimation implements Animator$AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        boolean mEnded;
        private float mFraction;
        boolean mIsPendingCleanup;
        boolean mOverridden;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        private final ValueAnimator mValueAnimator;
        final ViewHolder mViewHolder;
        float mX;
        float mY;

        RecoverAnimation(ViewHolder arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8) {
            super();
            this.mOverridden = false;
            this.mEnded = false;
            this.mActionState = arg4;
            this.mAnimationType = arg3;
            this.mViewHolder = arg2;
            this.mStartDx = arg5;
            this.mStartDy = arg6;
            this.mTargetX = arg7;
            this.mTargetY = arg8;
            this.mValueAnimator = ValueAnimator.ofFloat(new float[]{0f, 1f});
            this.mValueAnimator.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator arg2) {
                    RecoverAnimation.this.setFraction(arg2.getAnimatedFraction());
                }
            });
            this.mValueAnimator.setTarget(arg2.itemView);
            this.mValueAnimator.addListener(((Animator$AnimatorListener)this));
            this.setFraction(0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        public void onAnimationCancel(Animator arg1) {
            this.setFraction(1f);
        }

        public void onAnimationEnd(Animator arg2) {
            if(!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }

            this.mEnded = true;
        }

        public void onAnimationRepeat(Animator arg1) {
        }

        public void onAnimationStart(Animator arg1) {
        }

        public void setDuration(long arg2) {
            this.mValueAnimator.setDuration(arg2);
        }

        public void setFraction(float arg1) {
            this.mFraction = arg1;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            this.mX = this.mStartDx == this.mTargetX ? this.mViewHolder.itemView.getTranslationX() : this.mStartDx + this.mFraction * (this.mTargetX - this.mStartDx);
            this.mY = this.mStartDy == this.mTargetY ? this.mViewHolder.itemView.getTranslationY() : this.mStartDy + this.mFraction * (this.mTargetY - this.mStartDy);
        }
    }

    public abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int arg1, int arg2) {
            super();
            this.mDefaultSwipeDirs = arg2;
            this.mDefaultDragDirs = arg1;
        }

        public int getDragDirs(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2) {
            return this.mDefaultDragDirs;
        }

        public int getMovementFlags(@NonNull RecyclerView arg2, @NonNull ViewHolder arg3) {
            return SimpleCallback.makeMovementFlags(this.getDragDirs(arg2, arg3), this.getSwipeDirs(arg2, arg3));
        }

        public int getSwipeDirs(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int arg1) {
            this.mDefaultDragDirs = arg1;
        }

        public void setDefaultSwipeDirs(int arg1) {
            this.mDefaultSwipeDirs = arg1;
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View arg1, @NonNull View arg2, int arg3, int arg4);
    }

    static final int ACTION_MODE_DRAG_MASK = 0xFF0000;
    private static final int ACTION_MODE_IDLE_MASK = 0xFF;
    static final int ACTION_MODE_SWIPE_MASK = 0xFF00;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 0x20;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    private int mActionState;
    int mActivePointerId;
    @NonNull Callback mCallback;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private List mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final OnItemTouchListener mOnItemTouchListener;
    View mOverdrawChild;
    int mOverdrawChildPosition;
    final List mPendingCleanup;
    List mRecoverAnimations;
    RecyclerView mRecyclerView;
    final Runnable mScrollRunnable;
    ViewHolder mSelected;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;

    public ItemTouchHelper(@NonNull Callback arg4) {
        super();
        this.mPendingCleanup = new ArrayList();
        this.mTmpPosition = new float[2];
        this.mSelected = null;
        this.mActivePointerId = -1;
        this.mActionState = 0;
        this.mRecoverAnimations = new ArrayList();
        this.mScrollRunnable = new androidx.recyclerview.widget.ItemTouchHelper$1(this);
        this.mChildDrawingOrderCallback = null;
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        this.mOnItemTouchListener = new androidx.recyclerview.widget.ItemTouchHelper$2(this);
        this.mCallback = arg4;
    }

    private void addChildDrawingOrderCallback() {
        if(Build$VERSION.SDK_INT >= 21) {
            return;
        }

        if(this.mChildDrawingOrderCallback == null) {
            this.mChildDrawingOrderCallback = new ChildDrawingOrderCallback() {
                public int onGetChildDrawingOrder(int arg3, int arg4) {
                    if(ItemTouchHelper.this.mOverdrawChild == null) {
                        return arg4;
                    }

                    int v0 = ItemTouchHelper.this.mOverdrawChildPosition;
                    if(v0 == -1) {
                        v0 = ItemTouchHelper.this.mRecyclerView.indexOfChild(ItemTouchHelper.this.mOverdrawChild);
                        ItemTouchHelper.this.mOverdrawChildPosition = v0;
                    }

                    if(arg4 == arg3 - 1) {
                        return v0;
                    }

                    if(arg4 < v0) {
                    }
                    else {
                        ++arg4;
                    }

                    return arg4;
                }
            };
        }

        this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
    }

    public void attachToRecyclerView(@Nullable RecyclerView arg2) {
        if(this.mRecyclerView == arg2) {
            return;
        }

        if(this.mRecyclerView != null) {
            this.destroyCallbacks();
        }

        this.mRecyclerView = arg2;
        if(arg2 != null) {
            Resources v2 = arg2.getResources();
            this.mSwipeEscapeVelocity = v2.getDimension(R$dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = v2.getDimension(R$dimen.item_touch_helper_swipe_escape_max_velocity);
            this.setupCallbacks();
        }
    }

    private int checkHorizontalSwipe(ViewHolder arg9, int arg10) {
        if((arg10 & 12) != 0) {
            int v1 = 4;
            int v0 = this.mDx > 0f ? 8 : 4;
            if(this.mVelocityTracker != null && this.mActivePointerId > -1) {
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float v4 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float v5 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if(v4 > 0f) {
                    v1 = 8;
                }

                float v2 = Math.abs(v4);
                if((v1 & arg10) == 0) {
                    goto label_40;
                }

                if(v0 != v1) {
                    goto label_40;
                }

                if(v2 < this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity)) {
                    goto label_40;
                }

                if(v2 <= Math.abs(v5)) {
                    goto label_40;
                }

                return v1;
            }

        label_40:
            float v1_1 = (((float)this.mRecyclerView.getWidth())) * this.mCallback.getSwipeThreshold(arg9);
            if((arg10 & v0) == 0) {
                return 0;
            }

            if(Math.abs(this.mDx) <= v1_1) {
                return 0;
            }

            return v0;
        }

        return 0;
    }

    void checkSelectForSwipe(int arg8, MotionEvent arg9, int arg10) {
        if(this.mSelected == null) {
            int v0 = 2;
            if(arg8 == v0 && this.mActionState != v0) {
                if(!this.mCallback.isItemViewSwipeEnabled()) {
                }
                else if(this.mRecyclerView.getScrollState() == 1) {
                    return;
                }
                else {
                    ViewHolder v8 = this.findSwipedView(arg9);
                    if(v8 == null) {
                        return;
                    }
                    else {
                        int v2 = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, v8) & 0xFF00) >> 8;
                        if(v2 == 0) {
                            return;
                        }
                        else {
                            float v3 = arg9.getX(arg10);
                            float v10 = arg9.getY(arg10);
                            v3 -= this.mInitialTouchX;
                            v10 -= this.mInitialTouchY;
                            float v4 = Math.abs(v3);
                            float v5 = Math.abs(v10);
                            if(v4 < (((float)this.mSlop)) && v5 < (((float)this.mSlop))) {
                                return;
                            }

                            if(v4 > v5) {
                                if(v3 < 0f && (v2 & 4) == 0) {
                                    return;
                                }

                                if(v3 <= 0f) {
                                    goto label_59;
                                }

                                if((v2 & 8) != 0) {
                                    goto label_59;
                                }

                                return;
                            }
                            else {
                                if(v10 < 0f && (v2 & 1) == 0) {
                                    return;
                                }

                                if(v10 <= 0f) {
                                    goto label_59;
                                }

                                if((v2 & 2) != 0) {
                                    goto label_59;
                                }

                                return;
                            }

                        label_59:
                            this.mDy = 0f;
                            this.mDx = 0f;
                            this.mActivePointerId = arg9.getPointerId(0);
                            this.select(v8, 1);
                            return;
                        }
                    }
                }
            }
        }
    }

    private int checkVerticalSwipe(ViewHolder arg9, int arg10) {
        if((arg10 & 3) != 0) {
            int v1 = 1;
            int v0 = this.mDy > 0f ? 2 : 1;
            if(this.mVelocityTracker != null && this.mActivePointerId > -1) {
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float v4 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float v5 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if(v5 > 0f) {
                    v1 = 2;
                }

                float v2 = Math.abs(v5);
                if((v1 & arg10) == 0) {
                    goto label_40;
                }

                if(v1 != v0) {
                    goto label_40;
                }

                if(v2 < this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity)) {
                    goto label_40;
                }

                if(v2 <= Math.abs(v4)) {
                    goto label_40;
                }

                return v1;
            }

        label_40:
            float v1_1 = (((float)this.mRecyclerView.getHeight())) * this.mCallback.getSwipeThreshold(arg9);
            if((arg10 & v0) == 0) {
                return 0;
            }

            if(Math.abs(this.mDy) <= v1_1) {
                return 0;
            }

            return v0;
        }

        return 0;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(((ItemDecoration)this));
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(((OnChildAttachStateChangeListener)this));
        int v0;
        for(v0 = this.mRecoverAnimations.size() - 1; v0 >= 0; --v0) {
            this.mCallback.clearView(this.mRecyclerView, this.mRecoverAnimations.get(0).mViewHolder);
        }

        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        this.releaseVelocityTracker();
        this.stopGestureDetection();
    }

    void endRecoverAnimation(ViewHolder arg4, boolean arg5) {
        int v0;
        for(v0 = this.mRecoverAnimations.size() - 1; v0 >= 0; --v0) {
            Object v1 = this.mRecoverAnimations.get(v0);
            if(((RecoverAnimation)v1).mViewHolder == arg4) {
                ((RecoverAnimation)v1).mOverridden |= ((int)arg5);
                if(!((RecoverAnimation)v1).mEnded) {
                    ((RecoverAnimation)v1).cancel();
                }

                this.mRecoverAnimations.remove(v0);
                return;
            }
        }
    }

    RecoverAnimation findAnimation(MotionEvent arg5) {
        RecoverAnimation v1 = null;
        if(this.mRecoverAnimations.isEmpty()) {
            return v1;
        }

        View v5 = this.findChildView(arg5);
        int v0;
        for(v0 = this.mRecoverAnimations.size() - 1; v0 >= 0; --v0) {
            Object v2 = this.mRecoverAnimations.get(v0);
            if(((RecoverAnimation)v2).mViewHolder.itemView == v5) {
                return ((RecoverAnimation)v2);
            }
        }

        return v1;
    }

    View findChildView(MotionEvent arg6) {
        float v0 = arg6.getX();
        float v6 = arg6.getY();
        if(this.mSelected != null) {
            View v1 = this.mSelected.itemView;
            if(ItemTouchHelper.hitTest(v1, v0, v6, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return v1;
            }
        }

        int v1_1;
        for(v1_1 = this.mRecoverAnimations.size() - 1; v1_1 >= 0; --v1_1) {
            Object v2 = this.mRecoverAnimations.get(v1_1);
            View v3 = ((RecoverAnimation)v2).mViewHolder.itemView;
            if(ItemTouchHelper.hitTest(v3, v0, v6, ((RecoverAnimation)v2).mX, ((RecoverAnimation)v2).mY)) {
                return v3;
            }
        }

        return this.mRecyclerView.findChildViewUnder(v0, v6);
    }

    private List findSwapTargets(ViewHolder arg17) {
        ItemTouchHelper v0 = this;
        ViewHolder v1 = arg17;
        if(v0.mSwapTargets == null) {
            v0.mSwapTargets = new ArrayList();
            v0.mDistances = new ArrayList();
        }
        else {
            v0.mSwapTargets.clear();
            v0.mDistances.clear();
        }

        int v2 = v0.mCallback.getBoundingBoxMargin();
        int v3 = Math.round(v0.mSelectedStartX + v0.mDx) - v2;
        int v4 = Math.round(v0.mSelectedStartY + v0.mDy) - v2;
        v2 *= 2;
        int v5 = v1.itemView.getWidth() + v3 + v2;
        int v6 = v1.itemView.getHeight() + v4 + v2;
        v2 = (v3 + v5) / 2;
        int v7 = (v4 + v6) / 2;
        LayoutManager v8 = v0.mRecyclerView.getLayoutManager();
        int v9 = v8.getChildCount();
        int v11 = 0;
        while(v11 < v9) {
            View v12 = v8.getChildAt(v11);
            if(v12 == v1.itemView) {
            }
            else if(v12.getBottom() >= v4 && v12.getTop() <= v6 && v12.getRight() >= v3) {
                if(v12.getLeft() > v5) {
                }
                else {
                    ViewHolder v13 = v0.mRecyclerView.getChildViewHolder(v12);
                    if(v0.mCallback.canDropOver(v0.mRecyclerView, v0.mSelected, v13)) {
                        int v10 = Math.abs(v2 - (v12.getLeft() + v12.getRight()) / 2);
                        int v12_1 = Math.abs(v7 - (v12.getTop() + v12.getBottom()) / 2);
                        v10 = v10 * v10 + v12_1 * v12_1;
                        v12_1 = v0.mSwapTargets.size();
                        int v14 = 0;
                        int v15 = 0;
                        while(v14 < v12_1) {
                            if(v10 <= v0.mDistances.get(v14).intValue()) {
                                break;
                            }

                            ++v15;
                            ++v14;
                        }

                        v0.mSwapTargets.add(v15, v13);
                        v0.mDistances.add(v15, Integer.valueOf(v10));
                    }
                }
            }

            ++v11;
            v1 = arg17;
        }

        return v0.mSwapTargets;
    }

    private ViewHolder findSwipedView(MotionEvent arg6) {
        LayoutManager v0 = this.mRecyclerView.getLayoutManager();
        ViewHolder v2 = null;
        if(this.mActivePointerId == -1) {
            return v2;
        }

        int v1 = arg6.findPointerIndex(this.mActivePointerId);
        float v3 = arg6.getX(v1) - this.mInitialTouchX;
        float v1_1 = arg6.getY(v1) - this.mInitialTouchY;
        v3 = Math.abs(v3);
        v1_1 = Math.abs(v1_1);
        if(v3 < (((float)this.mSlop)) && v1_1 < (((float)this.mSlop))) {
            return v2;
        }

        if(v3 > v1_1 && (v0.canScrollHorizontally())) {
            return v2;
        }

        if(v1_1 > v3 && (v0.canScrollVertically())) {
            return v2;
        }

        View v6 = this.findChildView(arg6);
        if(v6 == null) {
            return v2;
        }

        return this.mRecyclerView.getChildViewHolder(v6);
    }

    public void getItemOffsets(Rect arg1, View arg2, RecyclerView arg3, State arg4) {
        arg1.setEmpty();
    }

    private void getSelectedDxDy(float[] arg4) {
        arg4[0] = (this.mSelectedFlags & 12) != 0 ? this.mSelectedStartX + this.mDx - (((float)this.mSelected.itemView.getLeft())) : this.mSelected.itemView.getTranslationX();
        arg4[1] = (this.mSelectedFlags & 3) != 0 ? this.mSelectedStartY + this.mDy - (((float)this.mSelected.itemView.getTop())) : this.mSelected.itemView.getTranslationY();
    }

    boolean hasRunningRecoverAnim() {
        int v0 = this.mRecoverAnimations.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(!this.mRecoverAnimations.get(v2).mEnded) {
                return 1;
            }
        }

        return 0;
    }

    private static boolean hitTest(View arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean v1 = arg2 < arg4 || arg2 > arg4 + (((float)arg1.getWidth())) || arg3 < arg5 || arg3 > arg5 + (((float)arg1.getHeight())) ? false : true;
        return v1;
    }

    void moveIfNecessary(ViewHolder arg11) {
        if(this.mRecyclerView.isLayoutRequested()) {
            return;
        }

        if(this.mActionState != 2) {
            return;
        }

        float v0 = this.mCallback.getMoveThreshold(arg11);
        int v8 = ((int)(this.mSelectedStartX + this.mDx));
        int v9 = ((int)(this.mSelectedStartY + this.mDy));
        if((((float)Math.abs(v9 - arg11.itemView.getTop()))) < (((float)arg11.itemView.getHeight())) * v0 && (((float)Math.abs(v8 - arg11.itemView.getLeft()))) < (((float)arg11.itemView.getWidth())) * v0) {
            return;
        }

        List v0_1 = this.findSwapTargets(arg11);
        if(v0_1.size() == 0) {
            return;
        }

        ViewHolder v6 = this.mCallback.chooseDropTarget(arg11, v0_1, v8, v9);
        if(v6 == null) {
            this.mSwapTargets.clear();
            this.mDistances.clear();
            return;
        }

        int v7 = v6.getAdapterPosition();
        int v5 = arg11.getAdapterPosition();
        if(this.mCallback.onMove(this.mRecyclerView, arg11, v6)) {
            this.mCallback.onMoved(this.mRecyclerView, arg11, v5, v6, v7, v8, v9);
        }
    }

    void obtainVelocityTracker() {
        if(this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
        }

        this.mVelocityTracker = VelocityTracker.obtain();
    }

    public void onChildViewAttachedToWindow(@NonNull View arg1) {
    }

    public void onChildViewDetachedFromWindow(@NonNull View arg3) {
        this.removeChildDrawingOrderCallbackIfNecessary(arg3);
        ViewHolder v3 = this.mRecyclerView.getChildViewHolder(arg3);
        if(v3 == null) {
            return;
        }

        if(this.mSelected == null || v3 != this.mSelected) {
            this.endRecoverAnimation(v3, false);
            if(this.mPendingCleanup.remove(v3.itemView)) {
                this.mCallback.clearView(this.mRecyclerView, v3);
            }
        }
        else {
            this.select(null, 0);
        }
    }

    public void onDraw(Canvas arg10, RecyclerView arg11, State arg12) {
        float v7;
        float v8;
        this.mOverdrawChildPosition = -1;
        if(this.mSelected != null) {
            this.getSelectedDxDy(this.mTmpPosition);
            float v0 = this.mTmpPosition[0];
            v8 = this.mTmpPosition[1];
            v7 = v0;
        }
        else {
            v7 = 0f;
            v8 = 0f;
        }

        this.mCallback.onDraw(arg10, arg11, this.mSelected, this.mRecoverAnimations, this.mActionState, v7, v8);
    }

    public void onDrawOver(Canvas arg10, RecyclerView arg11, State arg12) {
        float v7;
        float v8;
        if(this.mSelected != null) {
            this.getSelectedDxDy(this.mTmpPosition);
            float v0 = this.mTmpPosition[0];
            v8 = this.mTmpPosition[1];
            v7 = v0;
        }
        else {
            v7 = 0f;
            v8 = 0f;
        }

        this.mCallback.onDrawOver(arg10, arg11, this.mSelected, this.mRecoverAnimations, this.mActionState, v7, v8);
    }

    void postDispatchSwipe(RecoverAnimation arg3, int arg4) {
        this.mRecyclerView.post(new Runnable(arg3, arg4) {
            public void run() {
                if(ItemTouchHelper.this.mRecyclerView != null && (ItemTouchHelper.this.mRecyclerView.isAttachedToWindow()) && !this.val$anim.mOverridden && this.val$anim.mViewHolder.getAdapterPosition() != -1) {
                    ItemAnimator v0 = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                    if((v0 == null || !v0.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.mCallback.onSwiped(this.val$anim.mViewHolder, this.val$swipeDir);
                        return;
                    }

                    ItemTouchHelper.this.mRecyclerView.post(((Runnable)this));
                }
            }
        });
    }

    private void releaseVelocityTracker() {
        if(this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    void removeChildDrawingOrderCallbackIfNecessary(View arg2) {
        if(arg2 == this.mOverdrawChild) {
            arg2 = null;
            this.mOverdrawChild = arg2;
            if(this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(((ChildDrawingOrderCallback)arg2));
            }
        }
    }

    boolean scrollIfNecessary() {
        int v1_1;
        int v12;
        int v9;
        ItemTouchHelper v0 = this;
        long v3 = -9223372036854775808L;
        if(v0.mSelected == null) {
            v0.mDragScrollStartTimeInMs = v3;
            return 0;
        }

        long v5 = System.currentTimeMillis();
        long v7 = v0.mDragScrollStartTimeInMs == v3 ? 0 : v5 - v0.mDragScrollStartTimeInMs;
        LayoutManager v1 = v0.mRecyclerView.getLayoutManager();
        if(v0.mTmpRect == null) {
            v0.mTmpRect = new Rect();
        }

        v1.calculateItemDecorationsForChild(v0.mSelected.itemView, v0.mTmpRect);
        if(v1.canScrollHorizontally()) {
            v9 = ((int)(v0.mSelectedStartX + v0.mDx));
            int v11 = v9 - v0.mTmpRect.left - v0.mRecyclerView.getPaddingLeft();
            if(v0.mDx < 0f && v11 < 0) {
                v12 = v11;
                goto label_62;
            }

            if(v0.mDx <= 0f) {
                goto label_61;
            }

            v9 = v9 + v0.mSelected.itemView.getWidth() + v0.mTmpRect.right - (v0.mRecyclerView.getWidth() - v0.mRecyclerView.getPaddingRight());
            if(v9 <= 0) {
                goto label_61;
            }

            v12 = v9;
        }
        else {
        label_61:
            v12 = 0;
        }

    label_62:
        if(v1.canScrollVertically()) {
            v1_1 = ((int)(v0.mSelectedStartY + v0.mDy));
            v9 = v1_1 - v0.mTmpRect.top - v0.mRecyclerView.getPaddingTop();
            if(v0.mDy < 0f && v9 < 0) {
                v1_1 = v9;
                goto label_97;
            }

            if(v0.mDy <= 0f) {
                goto label_96;
            }

            v1_1 = v1_1 + v0.mSelected.itemView.getHeight() + v0.mTmpRect.bottom - (v0.mRecyclerView.getHeight() - v0.mRecyclerView.getPaddingBottom());
            if(v1_1 <= 0) {
                goto label_96;
            }
        }
        else {
        label_96:
            v1_1 = 0;
        }

    label_97:
        if(v12 != 0) {
            v12 = v0.mCallback.interpolateOutOfBoundsScroll(v0.mRecyclerView, v0.mSelected.itemView.getWidth(), v12, v0.mRecyclerView.getWidth(), v7);
        }

        int v14 = v12;
        if(v1_1 != 0) {
            v12 = v14;
            v1_1 = v0.mCallback.interpolateOutOfBoundsScroll(v0.mRecyclerView, v0.mSelected.itemView.getHeight(), v1_1, v0.mRecyclerView.getHeight(), v7);
        }
        else {
            v12 = v14;
        }

        if(v12 == 0) {
            if(v1_1 != 0) {
            }
            else {
                v0.mDragScrollStartTimeInMs = v3;
                return 0;
            }
        }

        if(v0.mDragScrollStartTimeInMs == v3) {
            v0.mDragScrollStartTimeInMs = v5;
        }

        v0.mRecyclerView.scrollBy(v12, v1_1);
        return 1;
    }

    void select(@Nullable ViewHolder arg24, int arg25) {
        boolean v1;
        int v9;
        int v6;
        float v17;
        float v18;
        ItemTouchHelper v11 = this;
        ViewHolder v12 = arg24;
        int v13 = arg25;
        if(v12 == v11.mSelected && v13 == v11.mActionState) {
            return;
        }

        v11.mDragScrollStartTimeInMs = -9223372036854775808L;
        int v4 = v11.mActionState;
        v11.endRecoverAnimation(v12, true);
        v11.mActionState = v13;
        int v15 = 2;
        if(v13 == v15) {
            if(v12 != null) {
                v11.mOverdrawChild = v12.itemView;
                this.addChildDrawingOrderCallback();
            }
            else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }

        int v10 = 8;
        int v16 = (1 << v13 * 8 + v10) - 1;
        if(v11.mSelected != null) {
            ViewHolder v8 = v11.mSelected;
            if(v8.itemView.getParent() != null) {
                int v7 = v4 == v15 ? 0 : v11.swipeIfNecessary(v8);
                this.releaseVelocityTracker();
                if(v7 == 4) {
                    goto label_64;
                }
                else if(v7 == v10) {
                    goto label_64;
                }
                else if(v7 == 16) {
                    goto label_64;
                }
                else if(v7 != 0x20) {
                    switch(v7) {
                        case 1: 
                        case 2: {
                            v18 = Math.signum(v11.mDy) * (((float)v11.mRecyclerView.getHeight()));
                            v17 = 0f;
                            goto label_72;
                        label_64:
                            v17 = Math.signum(v11.mDx) * (((float)v11.mRecyclerView.getWidth()));
                        label_53:
                            v18 = 0f;
                            goto label_72;
                        }
                        default: {
                            v17 = 0f;
                            goto label_53;
                        }
                    }
                }
                else {
                    goto label_64;
                }

            label_72:
                if(v4 == v15) {
                    v6 = 8;
                }
                else if(v7 > 0) {
                    v6 = 2;
                }
                else {
                    v6 = 4;
                }

                v11.getSelectedDxDy(v11.mTmpPosition);
                float v19 = v11.mTmpPosition[0];
                float v20 = v11.mTmpPosition[1];
                androidx.recyclerview.widget.ItemTouchHelper$3 v14 = new RecoverAnimation(v8, v6, v4, v19, v20, v17, v18, v7, v8) {
                    public void onAnimationEnd(Animator arg3) {
                        super.onAnimationEnd(arg3);
                        if(this.mOverridden) {
                            return;
                        }

                        if(this.val$swipeDir <= 0) {
                            ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, this.val$prevSelected);
                        }
                        else {
                            ItemTouchHelper.this.mPendingCleanup.add(this.val$prevSelected.itemView);
                            this.mIsPendingCleanup = true;
                            if(this.val$swipeDir > 0) {
                                ItemTouchHelper.this.postDispatchSwipe(((RecoverAnimation)this), this.val$swipeDir);
                            }
                        }

                        if(ItemTouchHelper.this.mOverdrawChild == this.val$prevSelected.itemView) {
                            ItemTouchHelper.this.removeChildDrawingOrderCallbackIfNecessary(this.val$prevSelected.itemView);
                        }
                    }
                };
                ((RecoverAnimation)v14).setDuration(v11.mCallback.getAnimationDuration(v11.mRecyclerView, v6, v17 - v19, v18 - v20));
                v11.mRecoverAnimations.add(v14);
                ((RecoverAnimation)v14).start();
                v9 = 1;
            }
            else {
                v11.removeChildDrawingOrderCallbackIfNecessary(v8.itemView);
                v11.mCallback.clearView(v11.mRecyclerView, v8);
                v9 = 0;
            }

            v11.mSelected = null;
        }
        else {
            v9 = 0;
        }

        if(v12 != null) {
            v11.mSelectedFlags = (v11.mCallback.getAbsoluteMovementFlags(v11.mRecyclerView, v12) & v16) >> v11.mActionState * 8;
            v11.mSelectedStartX = ((float)v12.itemView.getLeft());
            v11.mSelectedStartY = ((float)v12.itemView.getTop());
            v11.mSelected = v12;
            if(v13 == 2) {
                v1 = false;
                v11.mSelected.itemView.performHapticFeedback(0);
            }
            else {
                goto label_153;
            }
        }
        else {
        label_153:
            v1 = false;
        }

        ViewParent v0 = v11.mRecyclerView.getParent();
        if(v0 != null) {
            if(v11.mSelected != null) {
                v1 = true;
            }

            v0.requestDisallowInterceptTouchEvent(v1);
        }

        if(v9 == 0) {
            v11.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }

        v11.mCallback.onSelectedChanged(v11.mSelected, v11.mActionState);
        v11.mRecyclerView.invalidate();
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(((ItemDecoration)this));
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(((OnChildAttachStateChangeListener)this));
        this.startGestureDetection();
    }

    public void startDrag(@NonNull ViewHolder arg3) {
        if(!this.mCallback.hasDragFlag(this.mRecyclerView, arg3)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }

        if(arg3.itemView.getParent() != this.mRecyclerView) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }

        this.obtainVelocityTracker();
        this.mDy = 0f;
        this.mDx = 0f;
        this.select(arg3, 2);
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener(this);
        this.mGestureDetector = new GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    public void startSwipe(@NonNull ViewHolder arg3) {
        if(!this.mCallback.hasSwipeFlag(this.mRecyclerView, arg3)) {
            Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
            return;
        }

        if(arg3.itemView.getParent() != this.mRecyclerView) {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }

        this.obtainVelocityTracker();
        this.mDy = 0f;
        this.mDx = 0f;
        this.select(arg3, 1);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener v1 = null;
        if(this.mItemTouchHelperGestureListener != null) {
            this.mItemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = v1;
        }

        if(this.mGestureDetector != null) {
            this.mGestureDetector = ((GestureDetectorCompat)v1);
        }
    }

    private int swipeIfNecessary(ViewHolder arg6) {
        int v6;
        if(this.mActionState == 2) {
            return 0;
        }

        int v0 = this.mCallback.getMovementFlags(this.mRecyclerView, arg6);
        int v3 = 0xFF00;
        int v2 = (this.mCallback.convertToAbsoluteDirection(v0, ViewCompat.getLayoutDirection(this.mRecyclerView)) & v3) >> 8;
        if(v2 == 0) {
            return 0;
        }

        v0 = (v0 & v3) >> 8;
        if(Math.abs(this.mDx) > Math.abs(this.mDy)) {
            v3 = this.checkHorizontalSwipe(arg6, v2);
            if(v3 <= 0) {
                v6 = this.checkVerticalSwipe(arg6, v2);
                if(v6 > 0) {
                    return v6;
                }
            }
            else if((v0 & v3) == 0) {
                return Callback.convertToRelativeDirection(v3, ViewCompat.getLayoutDirection(this.mRecyclerView));
            }
            else {
                return v3;
            }
        }
        else {
            v3 = this.checkVerticalSwipe(arg6, v2);
            if(v3 > 0) {
                return v3;
            }
            else {
                v6 = this.checkHorizontalSwipe(arg6, v2);
                if(v6 > 0) {
                    if((v0 & v6) == 0) {
                        return Callback.convertToRelativeDirection(v6, ViewCompat.getLayoutDirection(this.mRecyclerView));
                    }
                    else {
                        return v6;
                    }
                }
            }
        }

        return 0;
    }

    void updateDxDy(MotionEvent arg2, int arg3, int arg4) {
        float v0 = arg2.getX(arg4);
        float v2 = arg2.getY(arg4);
        this.mDx = v0 - this.mInitialTouchX;
        this.mDy = v2 - this.mInitialTouchY;
        if((arg3 & 4) == 0) {
            this.mDx = Math.max(0f, this.mDx);
        }

        if((arg3 & 8) == 0) {
            this.mDx = Math.min(0f, this.mDx);
        }

        if((arg3 & 1) == 0) {
            this.mDy = Math.max(0f, this.mDy);
        }

        if((arg3 & 2) == 0) {
            this.mDy = Math.min(0f, this.mDy);
        }
    }
}

