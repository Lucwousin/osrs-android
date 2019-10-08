package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements NestedScrollingChild2, ScrollingView {
    class androidx.recyclerview.widget.RecyclerView$1 implements Runnable {
        androidx.recyclerview.widget.RecyclerView$1(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
        }

        public void run() {
            if(RecyclerView.this.mFirstLayoutComplete) {
                if(RecyclerView.this.isLayoutRequested()) {
                }
                else if(!RecyclerView.this.mIsAttached) {
                    RecyclerView.this.requestLayout();
                    return;
                }
                else if(RecyclerView.this.mLayoutFrozen) {
                    RecyclerView.this.mLayoutWasDefered = true;
                    return;
                }
                else {
                    RecyclerView.this.consumePendingUpdateOperations();
                    return;
                }
            }
        }
    }

    class androidx.recyclerview.widget.RecyclerView$2 implements Runnable {
        androidx.recyclerview.widget.RecyclerView$2(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
        }

        public void run() {
            if(RecyclerView.this.mItemAnimator != null) {
                RecyclerView.this.mItemAnimator.runPendingAnimations();
            }

            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    final class androidx.recyclerview.widget.RecyclerView$3 implements Interpolator {
        androidx.recyclerview.widget.RecyclerView$3() {
            super();
        }

        public float getInterpolation(float arg3) {
            --arg3;
            return arg3 * arg3 * arg3 * arg3 * arg3 + 1f;
        }
    }

    class androidx.recyclerview.widget.RecyclerView$4 implements ProcessCallback {
        androidx.recyclerview.widget.RecyclerView$4(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
        }

        public void processAppeared(ViewHolder arg2, ItemHolderInfo arg3, ItemHolderInfo arg4) {
            RecyclerView.this.animateAppearance(arg2, arg3, arg4);
        }

        public void processDisappeared(ViewHolder arg2, @NonNull ItemHolderInfo arg3, @Nullable ItemHolderInfo arg4) {
            RecyclerView.this.mRecycler.unscrapView(arg2);
            RecyclerView.this.animateDisappearance(arg2, arg3, arg4);
        }

        public void processPersistent(ViewHolder arg2, @NonNull ItemHolderInfo arg3, @NonNull ItemHolderInfo arg4) {
            arg2.setIsRecyclable(false);
            if(RecyclerView.this.mDataSetHasChangedAfterLayout) {
                if(RecyclerView.this.mItemAnimator.animateChange(arg2, arg2, arg3, arg4)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }
            else if(RecyclerView.this.mItemAnimator.animatePersistence(arg2, arg3, arg4)) {
                RecyclerView.this.postAnimationRunner();
            }
        }

        public void unused(ViewHolder arg3) {
            RecyclerView.this.mLayout.removeAndRecycleView(arg3.itemView, RecyclerView.this.mRecycler);
        }
    }

    public abstract class Adapter {
        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable;

        public Adapter() {
            super();
            this.mObservable = new AdapterDataObservable();
            this.mHasStableIds = false;
        }

        public final void bindViewHolder(@NonNull ViewHolder arg3, int arg4) {
            arg3.mPosition = arg4;
            if(this.hasStableIds()) {
                arg3.mItemId = this.getItemId(arg4);
            }

            arg3.setFlags(1, 0x207);
            TraceCompat.beginSection("RV OnBindView");
            this.onBindViewHolder(arg3, arg4, arg3.getUnmodifiedPayloads());
            arg3.clearPayload();
            ViewGroup$LayoutParams v3 = arg3.itemView.getLayoutParams();
            if((v3 instanceof LayoutParams)) {
                ((LayoutParams)v3).mInsetsDirty = true;
            }

            TraceCompat.endSection();
        }

        @NonNull public final ViewHolder createViewHolder(@NonNull ViewGroup arg2, int arg3) {
            ViewHolder v2_1;
            try {
                TraceCompat.beginSection("RV CreateView");
                v2_1 = this.onCreateViewHolder(arg2, arg3);
                if(v2_1.itemView.getParent() != null) {
                    goto label_9;
                }

                v2_1.mItemViewType = arg3;
            }
            catch(Throwable v2) {
                goto label_14;
            }

            TraceCompat.endSection();
            return v2_1;
            try {
            label_9:
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            catch(Throwable v2) {
            label_14:
                TraceCompat.endSection();
                throw v2;
            }
        }

        public abstract int getItemCount();

        public long getItemId(int arg3) {
            return -1;
        }

        public int getItemViewType(int arg1) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int arg3) {
            this.mObservable.notifyItemRangeChanged(arg3, 1);
        }

        public final void notifyItemChanged(int arg3, @Nullable Object arg4) {
            this.mObservable.notifyItemRangeChanged(arg3, 1, arg4);
        }

        public final void notifyItemInserted(int arg3) {
            this.mObservable.notifyItemRangeInserted(arg3, 1);
        }

        public final void notifyItemMoved(int arg2, int arg3) {
            this.mObservable.notifyItemMoved(arg2, arg3);
        }

        public final void notifyItemRangeChanged(int arg2, int arg3, @Nullable Object arg4) {
            this.mObservable.notifyItemRangeChanged(arg2, arg3, arg4);
        }

        public final void notifyItemRangeChanged(int arg2, int arg3) {
            this.mObservable.notifyItemRangeChanged(arg2, arg3);
        }

        public final void notifyItemRangeInserted(int arg2, int arg3) {
            this.mObservable.notifyItemRangeInserted(arg2, arg3);
        }

        public final void notifyItemRangeRemoved(int arg2, int arg3) {
            this.mObservable.notifyItemRangeRemoved(arg2, arg3);
        }

        public final void notifyItemRemoved(int arg3) {
            this.mObservable.notifyItemRangeRemoved(arg3, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView arg1) {
        }

        public void onBindViewHolder(@NonNull ViewHolder arg1, int arg2, @NonNull List arg3) {
            this.onBindViewHolder(arg1, arg2);
        }

        public abstract void onBindViewHolder(@NonNull ViewHolder arg1, int arg2);

        @NonNull public abstract ViewHolder onCreateViewHolder(@NonNull ViewGroup arg1, int arg2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView arg1) {
        }

        public boolean onFailedToRecycleView(@NonNull ViewHolder arg1) {
            return 0;
        }

        public void onViewAttachedToWindow(@NonNull ViewHolder arg1) {
        }

        public void onViewDetachedFromWindow(@NonNull ViewHolder arg1) {
        }

        public void onViewRecycled(@NonNull ViewHolder arg1) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver arg2) {
            this.mObservable.registerObserver(arg2);
        }

        public void setHasStableIds(boolean arg2) {
            if(!this.hasObservers()) {
                this.mHasStableIds = arg2;
                return;
            }

            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver arg2) {
            this.mObservable.unregisterObserver(arg2);
        }
    }

    class AdapterDataObservable extends Observable {
        AdapterDataObservable() {
            super();
        }

        public boolean hasObservers() {
            return this.mObservers.isEmpty() ^ 1;
        }

        public void notifyChanged() {
            int v0;
            for(v0 = this.mObservers.size() - 1; v0 >= 0; --v0) {
                this.mObservers.get(v0).onChanged();
            }
        }

        public void notifyItemMoved(int arg4, int arg5) {
            int v0;
            for(v0 = this.mObservers.size() - 1; v0 >= 0; --v0) {
                this.mObservers.get(v0).onItemRangeMoved(arg4, arg5, 1);
            }
        }

        public void notifyItemRangeChanged(int arg2, int arg3) {
            this.notifyItemRangeChanged(arg2, arg3, null);
        }

        public void notifyItemRangeChanged(int arg3, int arg4, @Nullable Object arg5) {
            int v0;
            for(v0 = this.mObservers.size() - 1; v0 >= 0; --v0) {
                this.mObservers.get(v0).onItemRangeChanged(arg3, arg4, arg5);
            }
        }

        public void notifyItemRangeInserted(int arg3, int arg4) {
            int v0;
            for(v0 = this.mObservers.size() - 1; v0 >= 0; --v0) {
                this.mObservers.get(v0).onItemRangeInserted(arg3, arg4);
            }
        }

        public void notifyItemRangeRemoved(int arg3, int arg4) {
            int v0;
            for(v0 = this.mObservers.size() - 1; v0 >= 0; --v0) {
                this.mObservers.get(v0).onItemRangeRemoved(arg3, arg4);
            }
        }
    }

    public abstract class AdapterDataObserver {
        public AdapterDataObserver() {
            super();
        }

        public void onChanged() {
        }

        public void onItemRangeChanged(int arg1, int arg2, @Nullable Object arg3) {
            this.onItemRangeChanged(arg1, arg2);
        }

        public void onItemRangeChanged(int arg1, int arg2) {
        }

        public void onItemRangeInserted(int arg1, int arg2) {
        }

        public void onItemRangeMoved(int arg1, int arg2, int arg3) {
        }

        public void onItemRangeRemoved(int arg1, int arg2) {
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int arg1, int arg2);
    }

    public class EdgeEffectFactory {
        @Retention(value=RetentionPolicy.SOURCE) @public interface EdgeDirection {
        }

        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        public EdgeEffectFactory() {
            super();
        }

        @NonNull protected EdgeEffect createEdgeEffect(@NonNull RecyclerView arg1, int arg2) {
            return new EdgeEffect(arg1.getContext());
        }
    }

    public abstract class ItemAnimator {
        @Retention(value=RetentionPolicy.SOURCE) @public interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        interface ItemAnimatorListener {
            void onAnimationFinished(@NonNull ViewHolder arg1);
        }

        public class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public ItemHolderInfo() {
                super();
            }

            @NonNull public ItemHolderInfo setFrom(@NonNull ViewHolder arg2) {
                return this.setFrom(arg2, 0);
            }

            @NonNull public ItemHolderInfo setFrom(@NonNull ViewHolder arg1, int arg2) {
                View v1 = arg1.itemView;
                this.left = v1.getLeft();
                this.top = v1.getTop();
                this.right = v1.getRight();
                this.bottom = v1.getBottom();
                return this;
            }
        }

        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 0x1000;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 0x800;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration;
        private long mChangeDuration;
        private ArrayList mFinishedListeners;
        private ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;

        public ItemAnimator() {
            super();
            this.mListener = null;
            this.mFinishedListeners = new ArrayList();
            this.mAddDuration = 120;
            this.mRemoveDuration = 120;
            this.mMoveDuration = 0xFA;
            this.mChangeDuration = 0xFA;
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder arg1, @Nullable ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        public abstract boolean animateChange(@NonNull ViewHolder arg1, @NonNull ViewHolder arg2, @NonNull ItemHolderInfo arg3, @NonNull ItemHolderInfo arg4);

        public abstract boolean animateDisappearance(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

        public abstract boolean animatePersistence(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        static int buildAdapterChangeFlagsForAnimations(ViewHolder arg3) {
            int v0 = arg3.mFlags & 14;
            if(arg3.isInvalid()) {
                return 4;
            }

            if((v0 & 4) == 0) {
                int v1 = arg3.getOldPosition();
                int v3 = arg3.getAdapterPosition();
                int v2 = -1;
                if(v1 != v2 && v3 != v2 && v1 != v3) {
                    v0 |= 0x800;
                }
            }

            return v0;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder arg1, @NonNull List arg2) {
            return this.canReuseUpdatedViewHolder(arg1);
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder arg1) {
            return 1;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder arg2) {
            this.onAnimationFinished(arg2);
            if(this.mListener != null) {
                this.mListener.onAnimationFinished(arg2);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder arg1) {
            this.onAnimationStarted(arg1);
        }

        public final void dispatchAnimationsFinished() {
            int v0 = this.mFinishedListeners.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mFinishedListeners.get(v1).onAnimationsFinished();
            }

            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(@NonNull ViewHolder arg1);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener arg3) {
            boolean v0 = this.isRunning();
            if(arg3 != null) {
                if(!v0) {
                    arg3.onAnimationsFinished();
                }
                else {
                    this.mFinishedListeners.add(arg3);
                }
            }

            return v0;
        }

        public abstract boolean isRunning();

        @NonNull public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(@NonNull ViewHolder arg1) {
        }

        public void onAnimationStarted(@NonNull ViewHolder arg1) {
        }

        @NonNull public ItemHolderInfo recordPostLayoutInformation(@NonNull State arg1, @NonNull ViewHolder arg2) {
            return this.obtainHolderInfo().setFrom(arg2);
        }

        @NonNull public ItemHolderInfo recordPreLayoutInformation(@NonNull State arg1, @NonNull ViewHolder arg2, int arg3, @NonNull List arg4) {
            return this.obtainHolderInfo().setFrom(arg2);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long arg1) {
            this.mAddDuration = arg1;
        }

        public void setChangeDuration(long arg1) {
            this.mChangeDuration = arg1;
        }

        void setListener(ItemAnimatorListener arg1) {
            this.mListener = arg1;
        }

        public void setMoveDuration(long arg1) {
            this.mMoveDuration = arg1;
        }

        public void setRemoveDuration(long arg1) {
            this.mRemoveDuration = arg1;
        }
    }

    class ItemAnimatorRestoreListener implements ItemAnimatorListener {
        ItemAnimatorRestoreListener(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
        }

        public void onAnimationFinished(ViewHolder arg3) {
            arg3.setIsRecyclable(true);
            ViewHolder v1 = null;
            if(arg3.mShadowedHolder != null && arg3.mShadowingHolder == null) {
                arg3.mShadowedHolder = v1;
            }

            arg3.mShadowingHolder = v1;
            if(!arg3.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(arg3.itemView) && (arg3.isTmpDetached())) {
                RecyclerView.this.removeDetachedView(arg3.itemView, false);
            }
        }
    }

    public abstract class ItemDecoration {
        public ItemDecoration() {
            super();
        }

        public void getItemOffsets(@NonNull Rect arg1, @NonNull View arg2, @NonNull RecyclerView arg3, @NonNull State arg4) {
            this.getItemOffsets(arg1, arg2.getLayoutParams().getViewLayoutPosition(), arg3);
        }

        @Deprecated public void getItemOffsets(@NonNull Rect arg1, int arg2, @NonNull RecyclerView arg3) {
            arg1.set(0, 0, 0, 0);
        }

        public void onDraw(@NonNull Canvas arg1, @NonNull RecyclerView arg2, @NonNull State arg3) {
            this.onDraw(arg1, arg2);
        }

        @Deprecated public void onDraw(@NonNull Canvas arg1, @NonNull RecyclerView arg2) {
        }

        public void onDrawOver(@NonNull Canvas arg1, @NonNull RecyclerView arg2, @NonNull State arg3) {
            this.onDrawOver(arg1, arg2);
        }

        @Deprecated public void onDrawOver(@NonNull Canvas arg1, @NonNull RecyclerView arg2) {
        }
    }

    public abstract class LayoutManager {
        class androidx.recyclerview.widget.RecyclerView$LayoutManager$1 implements Callback {
            androidx.recyclerview.widget.RecyclerView$LayoutManager$1(LayoutManager arg1) {
                LayoutManager.this = arg1;
                super();
            }

            public View getChildAt(int arg2) {
                return LayoutManager.this.getChildAt(arg2);
            }

            public int getChildCount() {
                return LayoutManager.this.getChildCount();
            }

            public int getChildEnd(View arg3) {
                return LayoutManager.this.getDecoratedRight(arg3) + arg3.getLayoutParams().rightMargin;
            }

            public int getChildStart(View arg3) {
                return LayoutManager.this.getDecoratedLeft(arg3) - arg3.getLayoutParams().leftMargin;
            }

            public View getParent() {
                return LayoutManager.this.mRecyclerView;
            }

            public int getParentEnd() {
                return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
            }

            public int getParentStart() {
                return LayoutManager.this.getPaddingLeft();
            }
        }

        class androidx.recyclerview.widget.RecyclerView$LayoutManager$2 implements Callback {
            androidx.recyclerview.widget.RecyclerView$LayoutManager$2(LayoutManager arg1) {
                LayoutManager.this = arg1;
                super();
            }

            public View getChildAt(int arg2) {
                return LayoutManager.this.getChildAt(arg2);
            }

            public int getChildCount() {
                return LayoutManager.this.getChildCount();
            }

            public int getChildEnd(View arg3) {
                return LayoutManager.this.getDecoratedBottom(arg3) + arg3.getLayoutParams().bottomMargin;
            }

            public int getChildStart(View arg3) {
                return LayoutManager.this.getDecoratedTop(arg3) - arg3.getLayoutParams().topMargin;
            }

            public View getParent() {
                return LayoutManager.this.mRecyclerView;
            }

            public int getParentEnd() {
                return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
            }

            public int getParentStart() {
                return LayoutManager.this.getPaddingTop();
            }
        }

        public interface LayoutPrefetchRegistry {
            void addPosition(int arg1, int arg2);
        }

        public class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;

            public Properties() {
                super();
            }
        }

        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        @Nullable SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public LayoutManager() {
            super();
            this.mHorizontalBoundCheckCallback = new androidx.recyclerview.widget.RecyclerView$LayoutManager$1(this);
            this.mVerticalBoundCheckCallback = new androidx.recyclerview.widget.RecyclerView$LayoutManager$2(this);
            this.mHorizontalBoundCheck = new ViewBoundsCheck(this.mHorizontalBoundCheckCallback);
            this.mVerticalBoundCheck = new ViewBoundsCheck(this.mVerticalBoundCheckCallback);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public void addDisappearingView(View arg2) {
            this.addDisappearingView(arg2, -1);
        }

        public void addDisappearingView(View arg2, int arg3) {
            this.addViewInt(arg2, arg3, true);
        }

        public void addView(View arg2) {
            this.addView(arg2, -1);
        }

        public void addView(View arg2, int arg3) {
            this.addViewInt(arg2, arg3, false);
        }

        private void addViewInt(View arg5, int arg6, boolean arg7) {
            ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg5);
            if((arg7) || (v0.isRemoved())) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(v0);
            }
            else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(v0);
            }

            ViewGroup$LayoutParams v7 = arg5.getLayoutParams();
            if((v0.wasReturnedFromScrap()) || (v0.isScrap())) {
                if(v0.isScrap()) {
                    v0.unScrap();
                }
                else {
                    v0.clearReturnedFromScrapFlag();
                }

                this.mChildHelper.attachViewToParent(arg5, arg6, arg5.getLayoutParams(), false);
            }
            else if(arg5.getParent() == this.mRecyclerView) {
                int v1 = this.mChildHelper.indexOfChild(arg5);
                int v3 = -1;
                if(arg6 == v3) {
                    arg6 = this.mChildHelper.getChildCount();
                }

                if(v1 != v3) {
                    if(v1 == arg6) {
                        goto label_68;
                    }

                    this.mRecyclerView.mLayout.moveView(v1, arg6);
                    goto label_68;
                }

                StringBuilder v7_1 = new StringBuilder();
                v7_1.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                v7_1.append(this.mRecyclerView.indexOfChild(arg5));
                v7_1.append(this.mRecyclerView.exceptionLabel());
                throw new IllegalStateException(v7_1.toString());
            }
            else {
                this.mChildHelper.addView(arg5, arg6, false);
                ((LayoutParams)v7).mInsetsDirty = true;
                if(this.mSmoothScroller == null) {
                    goto label_68;
                }

                if(!this.mSmoothScroller.isRunning()) {
                    goto label_68;
                }

                this.mSmoothScroller.onChildAttachedToWindow(arg5);
            }

        label_68:
            if(((LayoutParams)v7).mPendingInvalidate) {
                v0.itemView.invalidate();
                ((LayoutParams)v7).mPendingInvalidate = false;
            }
        }

        public void assertInLayoutOrScroll(String arg2) {
            if(this.mRecyclerView != null) {
                this.mRecyclerView.assertInLayoutOrScroll(arg2);
            }
        }

        public void assertNotInLayoutOrScroll(String arg2) {
            if(this.mRecyclerView != null) {
                this.mRecyclerView.assertNotInLayoutOrScroll(arg2);
            }
        }

        public void attachView(@NonNull View arg2) {
            this.attachView(arg2, -1);
        }

        public void attachView(@NonNull View arg2, int arg3) {
            this.attachView(arg2, arg3, arg2.getLayoutParams());
        }

        public void attachView(@NonNull View arg3, int arg4, LayoutParams arg5) {
            ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
            if(v0.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(v0);
            }
            else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(v0);
            }

            this.mChildHelper.attachViewToParent(arg3, arg4, ((ViewGroup$LayoutParams)arg5), v0.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View arg2, @NonNull Rect arg3) {
            if(this.mRecyclerView == null) {
                arg3.set(0, 0, 0, 0);
                return;
            }

            arg3.set(this.mRecyclerView.getItemDecorInsetsForChild(arg2));
        }

        public boolean canScrollHorizontally() {
            return 0;
        }

        public boolean canScrollVertically() {
            return 0;
        }

        public boolean checkLayoutParams(LayoutParams arg1) {
            boolean v1 = arg1 != null ? true : false;
            return v1;
        }

        public static int chooseSize(int arg2, int arg3, int arg4) {
            int v0 = View$MeasureSpec.getMode(arg2);
            arg2 = View$MeasureSpec.getSize(arg2);
            if(v0 != 0x80000000) {
                if(v0 != 0x40000000) {
                    return Math.max(arg3, arg4);
                }

                return arg2;
            }

            return Math.min(arg2, Math.max(arg3, arg4));
        }

        public void collectAdjacentPrefetchPositions(int arg1, int arg2, State arg3, LayoutPrefetchRegistry arg4) {
        }

        public void collectInitialPrefetchPositions(int arg1, LayoutPrefetchRegistry arg2) {
        }

        public int computeHorizontalScrollExtent(@NonNull State arg1) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State arg1) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State arg1) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State arg1) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State arg1) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State arg1) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler arg3) {
            int v0;
            for(v0 = this.getChildCount() - 1; v0 >= 0; --v0) {
                this.scrapOrRecycleView(arg3, v0, this.getChildAt(v0));
            }
        }

        public void detachAndScrapView(@NonNull View arg2, @NonNull Recycler arg3) {
            this.scrapOrRecycleView(arg3, this.mChildHelper.indexOfChild(arg2), arg2);
        }

        public void detachAndScrapViewAt(int arg2, @NonNull Recycler arg3) {
            this.scrapOrRecycleView(arg3, arg2, this.getChildAt(arg2));
        }

        public void detachView(@NonNull View arg2) {
            int v0 = this.mChildHelper.indexOfChild(arg2);
            if(v0 >= 0) {
                this.detachViewInternal(v0, arg2);
            }
        }

        public void detachViewAt(int arg2) {
            this.detachViewInternal(arg2, this.getChildAt(arg2));
        }

        private void detachViewInternal(int arg1, @NonNull View arg2) {
            this.mChildHelper.detachViewFromParent(arg1);
        }

        void dispatchAttachedToWindow(RecyclerView arg2) {
            this.mIsAttachedToWindow = true;
            this.onAttachedToWindow(arg2);
        }

        void dispatchDetachedFromWindow(RecyclerView arg2, Recycler arg3) {
            this.mIsAttachedToWindow = false;
            this.onDetachedFromWindow(arg2, arg3);
        }

        public void endAnimation(View arg2) {
            if(this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(arg2));
            }
        }

        @Nullable public View findContainingItemView(@NonNull View arg3) {
            View v1 = null;
            if(this.mRecyclerView == null) {
                return v1;
            }

            arg3 = this.mRecyclerView.findContainingItemView(arg3);
            if(arg3 == null) {
                return v1;
            }

            if(this.mChildHelper.isHidden(arg3)) {
                return v1;
            }

            return arg3;
        }

        @Nullable public View findViewByPosition(int arg6) {
            int v0 = this.getChildCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                View v2 = this.getChildAt(v1);
                ViewHolder v3 = RecyclerView.getChildViewHolderInt(v2);
                if(v3 == null) {
                }
                else if(v3.getLayoutPosition() == arg6 && !v3.shouldIgnore()) {
                    if(!this.mRecyclerView.mState.isPreLayout() && (v3.isRemoved())) {
                        goto label_18;
                    }

                    return v2;
                }

            label_18:
            }

            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(Context arg2, AttributeSet arg3) {
            return new LayoutParams(arg2, arg3);
        }

        public LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
            if((arg2 instanceof LayoutParams)) {
                return new LayoutParams(((LayoutParams)arg2));
            }

            if((arg2 instanceof ViewGroup$MarginLayoutParams)) {
                return new LayoutParams(((ViewGroup$MarginLayoutParams)arg2));
            }

            return new LayoutParams(arg2);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View arg1) {
            return arg1.getLayoutParams().mDecorInsets.bottom;
        }

        @Nullable public View getChildAt(int arg2) {
            View v2 = this.mChildHelper != null ? this.mChildHelper.getChildAt(arg2) : null;
            return v2;
        }

        public int getChildCount() {
            int v0 = this.mChildHelper != null ? this.mChildHelper.getChildCount() : 0;
            return v0;
        }

        public static int getChildMeasureSpec(int arg4, int arg5, int arg6, int arg7, boolean arg8) {
            arg4 -= arg6;
            arg6 = 0;
            arg4 = Math.max(0, arg4);
            int v0 = -2;
            int v1 = -1;
            int v2 = 0x80000000;
            int v3 = 0x40000000;
            if(!arg8) {
                if(arg7 >= 0) {
                label_9:
                    arg4 = arg7;
                    arg6 = 0x40000000;
                    goto label_34;
                }

                if(arg7 == v1) {
                    arg6 = arg5;
                    goto label_34;
                }

                if(arg7 == v0) {
                    if(arg5 != v2 && arg5 != v3) {
                        goto label_34;
                    }

                    arg6 = 0x80000000;
                    goto label_34;
                }

            label_33:
                arg4 = 0;
            }
            else if(arg7 >= 0) {
                goto label_9;
            }
            else if(arg7 == v1) {
                if(arg5 != v2) {
                    if(arg5 != 0 && arg5 == v3) {
                        goto label_19;
                    }

                    arg7 = 0;
                }
                else {
                label_19:
                    arg7 = arg4;
                }

                arg6 = 0;
                arg4 = arg7;
            }
            else {
                goto label_33;
            }

        label_34:
            return View$MeasureSpec.makeMeasureSpec(arg4, arg6);
        }

        @Deprecated public static int getChildMeasureSpec(int arg1, int arg2, int arg3, boolean arg4) {
            arg1 -= arg2;
            arg2 = 0;
            arg1 = Math.max(0, arg1);
            if(arg4) {
                if(arg3 < 0) {
                    goto label_9;
                }

                goto label_6;
            }
            else if(arg3 >= 0) {
            label_6:
                arg1 = arg3;
                goto label_7;
            }
            else if(arg3 == -1) {
            label_7:
                arg2 = 0x40000000;
            }
            else if(arg3 == -2) {
                arg2 = 0x80000000;
            }
            else {
            label_9:
                arg1 = 0;
            }

            return View$MeasureSpec.makeMeasureSpec(arg1, arg2);
        }

        private int[] getChildRectangleOnScreenScrollAmount(RecyclerView arg8, View arg9, Rect arg10, boolean arg11) {
            int[] v8 = new int[2];
            int v11 = this.getPaddingLeft();
            int v0 = this.getPaddingTop();
            int v1 = this.getWidth() - this.getPaddingRight();
            int v2 = this.getHeight() - this.getPaddingBottom();
            int v3 = arg9.getLeft() + arg10.left - arg9.getScrollX();
            int v4 = arg9.getTop() + arg10.top - arg9.getScrollY();
            int v9 = arg10.width() + v3;
            int v10 = arg10.height() + v4;
            v3 -= v11;
            int v5 = Math.min(0, v3);
            v4 -= v0;
            v0 = Math.min(0, v4);
            v9 -= v1;
            v1 = Math.max(0, v9);
            v10 = Math.max(0, v10 - v2);
            if(this.getLayoutDirection() != 1) {
                if(v5 == 0) {
                    v5 = Math.min(v3, v1);
                }

                v1 = v5;
            }
            else if(v1 != 0) {
            }
            else {
                v1 = Math.max(v5, v9);
            }

            if(v0 != 0) {
            }
            else {
                v0 = Math.min(v4, v10);
            }

            v8[0] = v1;
            v8[1] = v0;
            return v8;
        }

        public boolean getClipToPadding() {
            boolean v0 = this.mRecyclerView == null || !this.mRecyclerView.mClipToPadding ? false : true;
            return v0;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler arg1, @NonNull State arg2) {
            int v2 = 1;
            if(this.mRecyclerView != null) {
                if(this.mRecyclerView.mAdapter == null) {
                }
                else {
                    if(this.canScrollHorizontally()) {
                        v2 = this.mRecyclerView.mAdapter.getItemCount();
                    }

                    return v2;
                }
            }

            return 1;
        }

        public int getDecoratedBottom(@NonNull View arg2) {
            return arg2.getBottom() + this.getBottomDecorationHeight(arg2);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View arg1, @NonNull Rect arg2) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(arg1, arg2);
        }

        public int getDecoratedLeft(@NonNull View arg2) {
            return arg2.getLeft() - this.getLeftDecorationWidth(arg2);
        }

        public int getDecoratedMeasuredHeight(@NonNull View arg3) {
            Rect v0 = arg3.getLayoutParams().mDecorInsets;
            return arg3.getMeasuredHeight() + v0.top + v0.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View arg3) {
            Rect v0 = arg3.getLayoutParams().mDecorInsets;
            return arg3.getMeasuredWidth() + v0.left + v0.right;
        }

        public int getDecoratedRight(@NonNull View arg2) {
            return arg2.getRight() + this.getRightDecorationWidth(arg2);
        }

        public int getDecoratedTop(@NonNull View arg2) {
            return arg2.getTop() - this.getTopDecorationHeight(arg2);
        }

        @Nullable public View getFocusedChild() {
            View v1 = null;
            if(this.mRecyclerView == null) {
                return v1;
            }

            View v0 = this.mRecyclerView.getFocusedChild();
            if(v0 != null) {
                if(this.mChildHelper.isHidden(v0)) {
                }
                else {
                    return v0;
                }
            }

            return v1;
        }

        @Px public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            Adapter v0 = this.mRecyclerView != null ? this.mRecyclerView.getAdapter() : null;
            int v0_1 = v0 != null ? v0.getItemCount() : 0;
            return v0_1;
        }

        public int getItemViewType(@NonNull View arg1) {
            return RecyclerView.getChildViewHolderInt(arg1).getItemViewType();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View arg1) {
            return arg1.getLayoutParams().mDecorInsets.left;
        }

        @Px public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        @Px public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        @Px public int getPaddingBottom() {
            int v0 = this.mRecyclerView != null ? this.mRecyclerView.getPaddingBottom() : 0;
            return v0;
        }

        @Px public int getPaddingEnd() {
            int v0 = this.mRecyclerView != null ? ViewCompat.getPaddingEnd(this.mRecyclerView) : 0;
            return v0;
        }

        @Px public int getPaddingLeft() {
            int v0 = this.mRecyclerView != null ? this.mRecyclerView.getPaddingLeft() : 0;
            return v0;
        }

        @Px public int getPaddingRight() {
            int v0 = this.mRecyclerView != null ? this.mRecyclerView.getPaddingRight() : 0;
            return v0;
        }

        @Px public int getPaddingStart() {
            int v0 = this.mRecyclerView != null ? ViewCompat.getPaddingStart(this.mRecyclerView) : 0;
            return v0;
        }

        @Px public int getPaddingTop() {
            int v0 = this.mRecyclerView != null ? this.mRecyclerView.getPaddingTop() : 0;
            return v0;
        }

        public int getPosition(@NonNull View arg1) {
            return arg1.getLayoutParams().getViewLayoutPosition();
        }

        public static Properties getProperties(@NonNull Context arg2, @Nullable AttributeSet arg3, int arg4, int arg5) {
            Properties v0 = new Properties();
            TypedArray v2 = arg2.obtainStyledAttributes(arg3, R$styleable.RecyclerView, arg4, arg5);
            v0.orientation = v2.getInt(R$styleable.RecyclerView_android_orientation, 1);
            v0.spanCount = v2.getInt(R$styleable.RecyclerView_spanCount, 1);
            v0.reverseLayout = v2.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            v0.stackFromEnd = v2.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            v2.recycle();
            return v0;
        }

        public int getRightDecorationWidth(@NonNull View arg1) {
            return arg1.getLayoutParams().mDecorInsets.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler arg1, @NonNull State arg2) {
            int v2 = 1;
            if(this.mRecyclerView != null) {
                if(this.mRecyclerView.mAdapter == null) {
                }
                else {
                    if(this.canScrollVertically()) {
                        v2 = this.mRecyclerView.mAdapter.getItemCount();
                    }

                    return v2;
                }
            }

            return 1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler arg1, @NonNull State arg2) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View arg1) {
            return arg1.getLayoutParams().mDecorInsets.top;
        }

        public void getTransformedBoundingBox(@NonNull View arg6, boolean arg7, @NonNull Rect arg8) {
            if(arg7) {
                Rect v7 = arg6.getLayoutParams().mDecorInsets;
                arg8.set(-v7.left, -v7.top, arg6.getWidth() + v7.right, arg6.getHeight() + v7.bottom);
            }
            else {
                arg8.set(0, 0, arg6.getWidth(), arg6.getHeight());
            }

            if(this.mRecyclerView != null) {
                Matrix v7_1 = arg6.getMatrix();
                if(v7_1 != null && !v7_1.isIdentity()) {
                    RectF v0 = this.mRecyclerView.mTempRectF;
                    v0.set(arg8);
                    v7_1.mapRect(v0);
                    arg8.set(((int)Math.floor(((double)v0.left))), ((int)Math.floor(((double)v0.top))), ((int)Math.ceil(((double)v0.right))), ((int)Math.ceil(((double)v0.bottom))));
                }
            }

            arg8.offset(arg6.getLeft(), arg6.getTop());
        }

        @Px public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int v0 = this.getChildCount();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                ViewGroup$LayoutParams v3 = this.getChildAt(v2).getLayoutParams();
                if(v3.width < 0 && v3.height < 0) {
                    return 1;
                }
            }

            return 0;
        }

        public boolean hasFocus() {
            boolean v0 = this.mRecyclerView == null || !this.mRecyclerView.hasFocus() ? false : true;
            return v0;
        }

        public void ignoreView(@NonNull View arg3) {
            if(arg3.getParent() == this.mRecyclerView && this.mRecyclerView.indexOfChild(arg3) != -1) {
                ViewHolder v3 = RecyclerView.getChildViewHolderInt(arg3);
                v3.addFlags(0x80);
                this.mRecyclerView.mViewInfoStore.removeViewHolder(v3);
                return;
            }

            StringBuilder v0 = new StringBuilder();
            v0.append("View should be fully attached to be ignored");
            v0.append(this.mRecyclerView.exceptionLabel());
            throw new IllegalArgumentException(v0.toString());
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            boolean v0 = this.mRecyclerView == null || !this.mRecyclerView.isFocused() ? false : true;
            return v0;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView arg7, int arg8, int arg9) {
            View v7 = arg7.getFocusedChild();
            if(v7 == null) {
                return 0;
            }

            int v1 = this.getPaddingLeft();
            int v2 = this.getPaddingTop();
            int v3 = this.getWidth() - this.getPaddingRight();
            int v4 = this.getHeight() - this.getPaddingBottom();
            Rect v5 = this.mRecyclerView.mTempRect;
            this.getDecoratedBoundsWithMargins(v7, v5);
            if(v5.left - arg8 < v3 && v5.right - arg8 > v1 && v5.top - arg9 < v4) {
                if(v5.bottom - arg9 <= v2) {
                }
                else {
                    return 1;
                }
            }

            return 0;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler arg1, @NonNull State arg2) {
            return 0;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        private static boolean isMeasurementUpToDate(int arg3, int arg4, int arg5) {
            int v0 = View$MeasureSpec.getMode(arg4);
            arg4 = View$MeasureSpec.getSize(arg4);
            boolean v1 = false;
            if(arg5 > 0 && arg3 != arg5) {
                return 0;
            }

            if(v0 != 0x80000000) {
                if(v0 != 0) {
                    if(v0 != 0x40000000) {
                        return 0;
                    }

                    if(arg4 == arg3) {
                        v1 = true;
                    }

                    return v1;
                }

                return 1;
            }

            if(arg4 >= arg3) {
                v1 = true;
            }

            return v1;
        }

        public boolean isSmoothScrolling() {
            boolean v0 = this.mSmoothScroller == null || !this.mSmoothScroller.isRunning() ? false : true;
            return v0;
        }

        public boolean isViewPartiallyVisible(@NonNull View arg3, boolean arg4, boolean arg5) {
            int v0 = 0x6003;
            boolean v3 = !this.mHorizontalBoundCheck.isViewWithinBoundFlags(arg3, v0) || !this.mVerticalBoundCheck.isViewWithinBoundFlags(arg3, v0) ? false : true;
            if(arg4) {
                return v3;
            }

            return (((int)v3)) ^ 1;
        }

        public void layoutDecorated(@NonNull View arg3, int arg4, int arg5, int arg6, int arg7) {
            Rect v0 = arg3.getLayoutParams().mDecorInsets;
            arg3.layout(arg4 + v0.left, arg5 + v0.top, arg6 - v0.right, arg7 - v0.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View arg4, int arg5, int arg6, int arg7, int arg8) {
            ViewGroup$LayoutParams v0 = arg4.getLayoutParams();
            arg4.layout(arg5 + ((LayoutParams)v0).mDecorInsets.left + ((LayoutParams)v0).leftMargin, arg6 + ((LayoutParams)v0).mDecorInsets.top + ((LayoutParams)v0).topMargin, arg7 - ((LayoutParams)v0).mDecorInsets.right - ((LayoutParams)v0).rightMargin, arg8 - ((LayoutParams)v0).mDecorInsets.bottom - ((LayoutParams)v0).bottomMargin);
        }

        public void measureChild(@NonNull View arg6, int arg7, int arg8) {
            ViewGroup$LayoutParams v0 = arg6.getLayoutParams();
            Rect v1 = this.mRecyclerView.getItemDecorInsetsForChild(arg6);
            arg7 += v1.left + v1.right;
            arg8 += v1.top + v1.bottom;
            arg7 = LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingLeft() + this.getPaddingRight() + arg7, ((LayoutParams)v0).width, this.canScrollHorizontally());
            arg8 = LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingTop() + this.getPaddingBottom() + arg8, ((LayoutParams)v0).height, this.canScrollVertically());
            if(this.shouldMeasureChild(arg6, arg7, arg8, ((LayoutParams)v0))) {
                arg6.measure(arg7, arg8);
            }
        }

        public void measureChildWithMargins(@NonNull View arg6, int arg7, int arg8) {
            ViewGroup$LayoutParams v0 = arg6.getLayoutParams();
            Rect v1 = this.mRecyclerView.getItemDecorInsetsForChild(arg6);
            arg7 += v1.left + v1.right;
            arg8 += v1.top + v1.bottom;
            arg7 = LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingLeft() + this.getPaddingRight() + ((LayoutParams)v0).leftMargin + ((LayoutParams)v0).rightMargin + arg7, ((LayoutParams)v0).width, this.canScrollHorizontally());
            arg8 = LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingTop() + this.getPaddingBottom() + ((LayoutParams)v0).topMargin + ((LayoutParams)v0).bottomMargin + arg8, ((LayoutParams)v0).height, this.canScrollVertically());
            if(this.shouldMeasureChild(arg6, arg7, arg8, ((LayoutParams)v0))) {
                arg6.measure(arg7, arg8);
            }
        }

        public void moveView(int arg3, int arg4) {
            View v0 = this.getChildAt(arg3);
            if(v0 != null) {
                this.detachViewAt(arg3);
                this.attachView(v0, arg4);
                return;
            }

            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("Cannot move a child from non-existing index:");
            v0_1.append(arg3);
            v0_1.append(this.mRecyclerView.toString());
            throw new IllegalArgumentException(v0_1.toString());
        }

        public void offsetChildrenHorizontal(@Px int arg2) {
            if(this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenHorizontal(arg2);
            }
        }

        public void offsetChildrenVertical(@Px int arg2) {
            if(this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenVertical(arg2);
            }
        }

        public void onAdapterChanged(@Nullable Adapter arg1, @Nullable Adapter arg2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView arg1, @NonNull ArrayList arg2, int arg3, int arg4) {
            return 0;
        }

        @CallSuper public void onAttachedToWindow(RecyclerView arg1) {
        }

        @CallSuper public void onDetachedFromWindow(RecyclerView arg1, Recycler arg2) {
            this.onDetachedFromWindow(arg1);
        }

        @Deprecated public void onDetachedFromWindow(RecyclerView arg1) {
        }

        @Nullable public View onFocusSearchFailed(@NonNull View arg1, int arg2, @NonNull Recycler arg3, @NonNull State arg4) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent arg3) {
            this.onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, arg3);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler arg2, @NonNull State arg3, @NonNull AccessibilityEvent arg4) {
            if(this.mRecyclerView != null) {
                if(arg4 == null) {
                }
                else {
                    boolean v3 = true;
                    if(!this.mRecyclerView.canScrollVertically(1)) {
                        int v0 = -1;
                        if(!this.mRecyclerView.canScrollVertically(v0) && !this.mRecyclerView.canScrollHorizontally(v0)) {
                            if(this.mRecyclerView.canScrollHorizontally(1)) {
                            }
                            else {
                                v3 = false;
                            }
                        }
                    }

                    arg4.setScrollable(v3);
                    if(this.mRecyclerView.mAdapter != null) {
                        arg4.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
                    }

                    return;
                }
            }
        }

        void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat arg3) {
            this.onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, arg3);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler arg4, @NonNull State arg5, @NonNull AccessibilityNodeInfoCompat arg6) {
            int v1 = -1;
            if((this.mRecyclerView.canScrollVertically(v1)) || (this.mRecyclerView.canScrollHorizontally(v1))) {
                arg6.addAction(0x2000);
                arg6.setScrollable(true);
            }

            if((this.mRecyclerView.canScrollVertically(1)) || (this.mRecyclerView.canScrollHorizontally(1))) {
                arg6.addAction(0x1000);
                arg6.setScrollable(true);
            }

            arg6.setCollectionInfo(CollectionInfoCompat.obtain(this.getRowCountForAccessibility(arg4, arg5), this.getColumnCountForAccessibility(arg4, arg5), this.isLayoutHierarchical(arg4, arg5), this.getSelectionModeForAccessibility(arg4, arg5)));
        }

        void onInitializeAccessibilityNodeInfoForItem(View arg3, AccessibilityNodeInfoCompat arg4) {
            ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
            if(v0 != null && !v0.isRemoved() && !this.mChildHelper.isHidden(v0.itemView)) {
                this.onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, arg3, arg4);
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler arg7, @NonNull State arg8, @NonNull View arg9, @NonNull AccessibilityNodeInfoCompat arg10) {
            int v0 = this.canScrollVertically() ? this.getPosition(arg9) : 0;
            int v2 = this.canScrollHorizontally() ? this.getPosition(arg9) : 0;
            arg10.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v0, 1, v2, 1, false, false));
        }

        @Nullable public View onInterceptFocusSearch(@NonNull View arg1, int arg2) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView arg1, int arg2, int arg3) {
        }

        public void onItemsChanged(@NonNull RecyclerView arg1) {
        }

        public void onItemsMoved(@NonNull RecyclerView arg1, int arg2, int arg3, int arg4) {
        }

        public void onItemsRemoved(@NonNull RecyclerView arg1, int arg2, int arg3) {
        }

        public void onItemsUpdated(@NonNull RecyclerView arg1, int arg2, int arg3, @Nullable Object arg4) {
            this.onItemsUpdated(arg1, arg2, arg3);
        }

        public void onItemsUpdated(@NonNull RecyclerView arg1, int arg2, int arg3) {
        }

        public void onLayoutChildren(Recycler arg1, State arg2) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(State arg1) {
        }

        public void onMeasure(@NonNull Recycler arg1, @NonNull State arg2, int arg3, int arg4) {
            this.mRecyclerView.defaultOnMeasure(arg3, arg4);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView arg1, @NonNull State arg2, @NonNull View arg3, @Nullable View arg4) {
            return this.onRequestChildFocus(arg1, arg3, arg4);
        }

        @Deprecated public boolean onRequestChildFocus(@NonNull RecyclerView arg1, @NonNull View arg2, @Nullable View arg3) {
            boolean v1 = (this.isSmoothScrolling()) || (arg1.isComputingLayout()) ? true : false;
            return v1;
        }

        public void onRestoreInstanceState(Parcelable arg1) {
        }

        @Nullable public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int arg1) {
        }

        void onSmoothScrollerStopped(SmoothScroller arg2) {
            if(this.mSmoothScroller == arg2) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int arg3, @Nullable Bundle arg4) {
            return this.performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, arg3, arg4);
        }

        public boolean performAccessibilityAction(@NonNull Recycler arg2, @NonNull State arg3, int arg4, @Nullable Bundle arg5) {
            int v2;
            if(this.mRecyclerView == null) {
                return 0;
            }

            if(arg4 == 0x1000) {
                v2 = this.mRecyclerView.canScrollVertically(1) ? this.getHeight() - this.getPaddingTop() - this.getPaddingBottom() : 0;
                if(this.mRecyclerView.canScrollHorizontally(1)) {
                    arg4 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
                    goto label_52;
                }

            label_10:
                arg4 = 0;
            }
            else if(arg4 != 0x2000) {
                v2 = 0;
                goto label_10;
            }
            else {
                arg4 = -1;
                v2 = this.mRecyclerView.canScrollVertically(arg4) ? -(this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) : 0;
                if(!this.mRecyclerView.canScrollHorizontally(arg4)) {
                    goto label_10;
                }

                arg4 = -(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
            }

        label_52:
            if(v2 == 0 && arg4 == 0) {
                return 0;
            }

            this.mRecyclerView.smoothScrollBy(arg4, v2);
            return 1;
        }

        boolean performAccessibilityActionForItem(@NonNull View arg8, int arg9, @Nullable Bundle arg10) {
            return this.performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, arg8, arg9, arg10);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler arg1, @NonNull State arg2, @NonNull View arg3, int arg4, @Nullable Bundle arg5) {
            return 0;
        }

        public void postOnAnimation(Runnable arg2) {
            if(this.mRecyclerView != null) {
                ViewCompat.postOnAnimation(this.mRecyclerView, arg2);
            }
        }

        public void removeAllViews() {
            int v0;
            for(v0 = this.getChildCount() - 1; v0 >= 0; --v0) {
                this.mChildHelper.removeViewAt(v0);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler arg3) {
            int v0;
            for(v0 = this.getChildCount() - 1; v0 >= 0; --v0) {
                if(!RecyclerView.getChildViewHolderInt(this.getChildAt(v0)).shouldIgnore()) {
                    this.removeAndRecycleViewAt(v0, arg3);
                }
            }
        }

        void removeAndRecycleScrapInt(Recycler arg7) {
            int v0 = arg7.getScrapCount();
            int v1;
            for(v1 = v0 - 1; v1 >= 0; --v1) {
                View v2 = arg7.getScrapViewAt(v1);
                ViewHolder v3 = RecyclerView.getChildViewHolderInt(v2);
                if(v3.shouldIgnore()) {
                }
                else {
                    v3.setIsRecyclable(false);
                    if(v3.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(v2, false);
                    }

                    if(this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.endAnimation(v3);
                    }

                    v3.setIsRecyclable(true);
                    arg7.quickRecycleScrapView(v2);
                }
            }

            arg7.clearScrap();
            if(v0 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View arg1, @NonNull Recycler arg2) {
            this.removeView(arg1);
            arg2.recycleView(arg1);
        }

        public void removeAndRecycleViewAt(int arg2, @NonNull Recycler arg3) {
            View v0 = this.getChildAt(arg2);
            this.removeViewAt(arg2);
            arg3.recycleView(v0);
        }

        public boolean removeCallbacks(Runnable arg2) {
            if(this.mRecyclerView != null) {
                return this.mRecyclerView.removeCallbacks(arg2);
            }

            return 0;
        }

        public void removeDetachedView(@NonNull View arg3) {
            this.mRecyclerView.removeDetachedView(arg3, false);
        }

        public void removeView(View arg2) {
            this.mChildHelper.removeView(arg2);
        }

        public void removeViewAt(int arg2) {
            if(this.getChildAt(arg2) != null) {
                this.mChildHelper.removeViewAt(arg2);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView arg3, @NonNull View arg4, @NonNull Rect arg5, boolean arg6, boolean arg7) {
            int[] v4 = this.getChildRectangleOnScreenScrollAmount(arg3, arg4, arg5, arg6);
            int v0 = v4[0];
            int v4_1 = v4[1];
            if((arg7) && !this.isFocusedChildVisibleAfterScrolling(arg3, v0, v4_1)) {
                return 0;
            }
            else if(v0 == 0) {
                if(v4_1 != 0) {
                }
                else {
                    return 0;
                }
            }

            if(arg6) {
                arg3.scrollBy(v0, v4_1);
            }
            else {
                arg3.smoothScrollBy(v0, v4_1);
            }

            return 1;
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView arg7, @NonNull View arg8, @NonNull Rect arg9, boolean arg10) {
            return this.requestChildRectangleOnScreen(arg7, arg8, arg9, arg10, false);
        }

        public void requestLayout() {
            if(this.mRecyclerView != null) {
                this.mRecyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        private void scrapOrRecycleView(Recycler arg3, int arg4, View arg5) {
            ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg5);
            if(v0.shouldIgnore()) {
                return;
            }

            if(!v0.isInvalid() || (v0.isRemoved()) || (this.mRecyclerView.mAdapter.hasStableIds())) {
                this.detachViewAt(arg4);
                arg3.scrapView(arg5);
                this.mRecyclerView.mViewInfoStore.onViewDetached(v0);
            }
            else {
                this.removeViewAt(arg4);
                arg3.recycleViewHolderInternal(v0);
            }
        }

        public int scrollHorizontallyBy(int arg1, Recycler arg2, State arg3) {
            return 0;
        }

        public void scrollToPosition(int arg1) {
        }

        public int scrollVerticallyBy(int arg1, Recycler arg2, State arg3) {
            return 0;
        }

        @Deprecated public void setAutoMeasureEnabled(boolean arg1) {
            this.mAutoMeasure = arg1;
        }

        void setExactMeasureSpecsFrom(RecyclerView arg3) {
            this.setMeasureSpecs(View$MeasureSpec.makeMeasureSpec(arg3.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(arg3.getHeight(), 0x40000000));
        }

        public final void setItemPrefetchEnabled(boolean arg2) {
            if(arg2 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = arg2;
                this.mPrefetchMaxCountObserved = 0;
                if(this.mRecyclerView != null) {
                    this.mRecyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        void setMeasureSpecs(int arg2, int arg3) {
            this.mWidth = View$MeasureSpec.getSize(arg2);
            this.mWidthMode = View$MeasureSpec.getMode(arg2);
            if(this.mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }

            this.mHeight = View$MeasureSpec.getSize(arg3);
            this.mHeightMode = View$MeasureSpec.getMode(arg3);
            if(this.mHeightMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(int arg2, int arg3) {
            this.mRecyclerView.setMeasuredDimension(arg2, arg3);
        }

        public void setMeasuredDimension(Rect arg3, int arg4, int arg5) {
            this.setMeasuredDimension(LayoutManager.chooseSize(arg4, arg3.width() + this.getPaddingLeft() + this.getPaddingRight(), this.getMinimumWidth()), LayoutManager.chooseSize(arg5, arg3.height() + this.getPaddingTop() + this.getPaddingBottom(), this.getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int arg9, int arg10) {
            int v0 = this.getChildCount();
            if(v0 == 0) {
                this.mRecyclerView.defaultOnMeasure(arg9, arg10);
                return;
            }

            int v1 = 0;
            int v3 = 0x7FFFFFFF;
            int v2 = 0x7FFFFFFF;
            int v4 = 0x80000000;
            int v5 = 0x80000000;
            while(v1 < v0) {
                View v6 = this.getChildAt(v1);
                Rect v7 = this.mRecyclerView.mTempRect;
                this.getDecoratedBoundsWithMargins(v6, v7);
                if(v7.left < v3) {
                    v3 = v7.left;
                }

                if(v7.right > v4) {
                    v4 = v7.right;
                }

                if(v7.top < v2) {
                    v2 = v7.top;
                }

                if(v7.bottom > v5) {
                    v5 = v7.bottom;
                }

                ++v1;
            }

            this.mRecyclerView.mTempRect.set(v3, v2, v4, v5);
            this.setMeasuredDimension(this.mRecyclerView.mTempRect, arg9, arg10);
        }

        public void setMeasurementCacheEnabled(boolean arg1) {
            this.mMeasurementCacheEnabled = arg1;
        }

        void setRecyclerView(RecyclerView arg2) {
            if(arg2 == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            }
            else {
                this.mRecyclerView = arg2;
                this.mChildHelper = arg2.mChildHelper;
                this.mWidth = arg2.getWidth();
                this.mHeight = arg2.getHeight();
            }

            this.mWidthMode = 0x40000000;
            this.mHeightMode = 0x40000000;
        }

        boolean shouldMeasureChild(View arg3, int arg4, int arg5, LayoutParams arg6) {
            boolean v3 = (arg3.isLayoutRequested()) || !this.mMeasurementCacheEnabled || !LayoutManager.isMeasurementUpToDate(arg3.getWidth(), arg4, arg6.width) || !LayoutManager.isMeasurementUpToDate(arg3.getHeight(), arg5, arg6.height) ? true : false;
            return v3;
        }

        boolean shouldMeasureTwice() {
            return 0;
        }

        boolean shouldReMeasureChild(View arg3, int arg4, int arg5, LayoutParams arg6) {
            boolean v3 = !this.mMeasurementCacheEnabled || !LayoutManager.isMeasurementUpToDate(arg3.getMeasuredWidth(), arg4, arg6.width) || !LayoutManager.isMeasurementUpToDate(arg3.getMeasuredHeight(), arg5, arg6.height) ? true : false;
            return v3;
        }

        public void smoothScrollToPosition(RecyclerView arg1, State arg2, int arg3) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(SmoothScroller arg2) {
            if(this.mSmoothScroller != null && arg2 != this.mSmoothScroller && (this.mSmoothScroller.isRunning())) {
                this.mSmoothScroller.stop();
            }

            this.mSmoothScroller = arg2;
            this.mSmoothScroller.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View arg2) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(arg2);
            v2.stopIgnoring();
            v2.resetInternal();
            v2.addFlags(4);
        }

        void stopSmoothScroller() {
            if(this.mSmoothScroller != null) {
                this.mSmoothScroller.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return 0;
        }
    }

    public class LayoutParams extends ViewGroup$MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        ViewHolder mViewHolder;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams arg1) {
            super(((ViewGroup$LayoutParams)arg1));
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getViewAdapterPosition() {
            return this.mViewHolder.getAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View arg1);

        void onChildViewDetachedFromWindow(@NonNull View arg1);
    }

    public abstract class OnFlingListener {
        public OnFlingListener() {
            super();
        }

        public abstract boolean onFling(int arg1, int arg2);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);

        void onRequestDisallowInterceptTouchEvent(boolean arg1);

        void onTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);
    }

    public abstract class OnScrollListener {
        public OnScrollListener() {
            super();
        }

        public void onScrollStateChanged(@NonNull RecyclerView arg1, int arg2) {
        }

        public void onScrolled(@NonNull RecyclerView arg1, int arg2, int arg3) {
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Orientation {
    }

    public class RecycledViewPool {
        class ScrapData {
            long mBindRunningAverageNs;
            long mCreateRunningAverageNs;
            int mMaxScrap;
            final ArrayList mScrapHeap;

            ScrapData() {
                super();
                this.mScrapHeap = new ArrayList();
                this.mMaxScrap = 5;
                this.mCreateRunningAverageNs = 0;
                this.mBindRunningAverageNs = 0;
            }
        }

        private static final int DEFAULT_MAX_SCRAP = 5;
        private int mAttachCount;
        SparseArray mScrap;

        public RecycledViewPool() {
            super();
            this.mScrap = new SparseArray();
            this.mAttachCount = 0;
        }

        void attach() {
            ++this.mAttachCount;
        }

        public void clear() {
            int v0;
            for(v0 = 0; v0 < this.mScrap.size(); ++v0) {
                this.mScrap.valueAt(v0).mScrapHeap.clear();
            }
        }

        void detach() {
            --this.mAttachCount;
        }

        void factorInBindTime(int arg3, long arg4) {
            ScrapData v3 = this.getScrapDataForType(arg3);
            v3.mBindRunningAverageNs = this.runningAverage(v3.mBindRunningAverageNs, arg4);
        }

        void factorInCreateTime(int arg3, long arg4) {
            ScrapData v3 = this.getScrapDataForType(arg3);
            v3.mCreateRunningAverageNs = this.runningAverage(v3.mCreateRunningAverageNs, arg4);
        }

        @Nullable public ViewHolder getRecycledView(int arg2) {
            Object v2 = this.mScrap.get(arg2);
            if(v2 != null && !((ScrapData)v2).mScrapHeap.isEmpty()) {
                return ((ScrapData)v2).mScrapHeap.remove(((ScrapData)v2).mScrapHeap.size() - 1);
            }

            return null;
        }

        public int getRecycledViewCount(int arg1) {
            return this.getScrapDataForType(arg1).mScrapHeap.size();
        }

        private ScrapData getScrapDataForType(int arg3) {
            ScrapData v0_1;
            Object v0 = this.mScrap.get(arg3);
            if(v0 == null) {
                v0_1 = new ScrapData();
                this.mScrap.put(arg3, v0_1);
            }

            return v0_1;
        }

        void onAdapterChanged(Adapter arg1, Adapter arg2, boolean arg3) {
            if(arg1 != null) {
                this.detach();
            }

            if(!arg3 && this.mAttachCount == 0) {
                this.clear();
            }

            if(arg2 != null) {
                this.attach();
            }
        }

        public void putRecycledView(ViewHolder arg4) {
            int v0 = arg4.getItemViewType();
            ArrayList v1 = this.getScrapDataForType(v0).mScrapHeap;
            if(this.mScrap.get(v0).mMaxScrap <= v1.size()) {
                return;
            }

            arg4.resetInternal();
            v1.add(arg4);
        }

        long runningAverage(long arg5, long arg7) {
            if(arg5 == 0) {
                return arg7;
            }

            return arg5 / 4 * 3 + arg7 / 4;
        }

        public void setMaxRecycledViews(int arg2, int arg3) {
            ScrapData v2 = this.getScrapDataForType(arg2);
            v2.mMaxScrap = arg3;
            ArrayList v2_1 = v2.mScrapHeap;
            while(v2_1.size() > arg3) {
                v2_1.remove(v2_1.size() - 1);
            }
        }

        int size() {
            int v0 = 0;
            int v1 = 0;
            while(v0 < this.mScrap.size()) {
                ArrayList v2 = this.mScrap.valueAt(v0).mScrapHeap;
                if(v2 != null) {
                    v1 += v2.size();
                }

                ++v0;
            }

            return v1;
        }

        boolean willBindInTime(int arg5, long arg6, long arg8) {
            long v0 = this.getScrapDataForType(arg5).mBindRunningAverageNs;
            boolean v5 = v0 == 0 || arg6 + v0 < arg8 ? true : false;
            return v5;
        }

        boolean willCreateInTime(int arg5, long arg6, long arg8) {
            long v0 = this.getScrapDataForType(arg5).mCreateRunningAverageNs;
            boolean v5 = v0 == 0 || arg6 + v0 < arg8 ? true : false;
            return v5;
        }
    }

    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final ArrayList mAttachedScrap;
        final ArrayList mCachedViews;
        ArrayList mChangedScrap;
        RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final List mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;

        public Recycler(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
            this.mAttachedScrap = new ArrayList();
            this.mChangedScrap = null;
            this.mCachedViews = new ArrayList();
            this.mUnmodifiableAttachedScrap = Collections.unmodifiableList(this.mAttachedScrap);
            this.mRequestedCacheMax = 2;
            this.mViewCacheMax = 2;
        }

        void addViewHolderToRecycledViewPool(@NonNull ViewHolder arg4, boolean arg5) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(arg4);
            int v0 = 0x4000;
            AccessibilityDelegateCompat v2 = null;
            if(arg4.hasAnyOfTheFlags(v0)) {
                arg4.setFlags(0, v0);
                ViewCompat.setAccessibilityDelegate(arg4.itemView, v2);
            }

            if(arg5) {
                this.dispatchViewRecycled(arg4);
            }

            arg4.mOwnerRecyclerView = ((RecyclerView)v2);
            this.getRecycledViewPool().putRecycledView(arg4);
        }

        private void attachAccessibilityDelegateOnBind(ViewHolder arg3) {
            if(RecyclerView.this.isAccessibilityEnabled()) {
                View v0 = arg3.itemView;
                if(ViewCompat.getImportantForAccessibility(v0) == 0) {
                    ViewCompat.setImportantForAccessibility(v0, 1);
                }

                if(ViewCompat.hasAccessibilityDelegate(v0)) {
                    return;
                }

                arg3.addFlags(0x4000);
                ViewCompat.setAccessibilityDelegate(v0, RecyclerView.this.mAccessibilityDelegate.getItemDelegate());
            }
        }

        public void bindViewToPosition(@NonNull View arg7, int arg8) {
            ViewHolder v7 = RecyclerView.getChildViewHolderInt(arg7);
            if(v7 != null) {
                int v2 = RecyclerView.this.mAdapterHelper.findPositionOffset(arg8);
                if(v2 >= 0 && v2 < RecyclerView.this.mAdapter.getItemCount()) {
                    this.tryBindViewHolderByDeadline(v7, v2, arg8, 0x7FFFFFFFFFFFFFFFL);
                    ViewGroup$LayoutParams v8 = v7.itemView.getLayoutParams();
                    if(v8 == null) {
                        v8 = RecyclerView.this.generateDefaultLayoutParams();
                        v7.itemView.setLayoutParams(v8);
                    }
                    else if(!RecyclerView.this.checkLayoutParams(v8)) {
                        v8 = RecyclerView.this.generateLayoutParams(v8);
                        v7.itemView.setLayoutParams(v8);
                    }

                    boolean v0 = true;
                    ((LayoutParams)v8).mInsetsDirty = true;
                    ((LayoutParams)v8).mViewHolder = v7;
                    if(v7.itemView.getParent() == null) {
                    }
                    else {
                        v0 = false;
                    }

                    ((LayoutParams)v8).mPendingInvalidate = v0;
                    return;
                }

                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("Inconsistency detected. Invalid item position ");
                v0_1.append(arg8);
                v0_1.append("(offset:");
                v0_1.append(v2);
                v0_1.append(").");
                v0_1.append("state:");
                v0_1.append(RecyclerView.this.mState.getItemCount());
                v0_1.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(v0_1.toString());
            }

            StringBuilder v8_1 = new StringBuilder();
            v8_1.append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            v8_1.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(v8_1.toString());
        }

        public void clear() {
            this.mAttachedScrap.clear();
            this.recycleAndClearCachedViews();
        }

        void clearOldPositions() {
            int v0 = this.mCachedViews.size();
            int v1 = 0;
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                this.mCachedViews.get(v2).clearOldPosition();
            }

            v0 = this.mAttachedScrap.size();
            for(v2 = 0; v2 < v0; ++v2) {
                this.mAttachedScrap.get(v2).clearOldPosition();
            }

            if(this.mChangedScrap != null) {
                v0 = this.mChangedScrap.size();
                while(v1 < v0) {
                    this.mChangedScrap.get(v1).clearOldPosition();
                    ++v1;
                }
            }
        }

        void clearScrap() {
            this.mAttachedScrap.clear();
            if(this.mChangedScrap != null) {
                this.mChangedScrap.clear();
            }
        }

        public int convertPreLayoutPositionToPostLayout(int arg4) {
            if(arg4 >= 0 && arg4 < RecyclerView.this.mState.getItemCount()) {
                if(!RecyclerView.this.mState.isPreLayout()) {
                    return arg4;
                }
                else {
                    return RecyclerView.this.mAdapterHelper.findPositionOffset(arg4);
                }
            }

            StringBuilder v1 = new StringBuilder();
            v1.append("invalid position ");
            v1.append(arg4);
            v1.append(". State ");
            v1.append("item count is ");
            v1.append(RecyclerView.this.mState.getItemCount());
            v1.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(v1.toString());
        }

        void dispatchViewRecycled(@NonNull ViewHolder arg2) {
            if(RecyclerView.this.mRecyclerListener != null) {
                RecyclerView.this.mRecyclerListener.onViewRecycled(arg2);
            }

            if(RecyclerView.this.mAdapter != null) {
                RecyclerView.this.mAdapter.onViewRecycled(arg2);
            }

            if(RecyclerView.this.mState != null) {
                RecyclerView.this.mViewInfoStore.removeViewHolder(arg2);
            }
        }

        ViewHolder getChangedScrapViewForPosition(int arg10) {
            int v4;
            ViewHolder v1 = null;
            if(this.mChangedScrap != null) {
                int v0 = this.mChangedScrap.size();
                if(v0 == 0) {
                }
                else {
                    int v2 = 0;
                    int v3;
                    for(v3 = 0; true; ++v3) {
                        v4 = 0x20;
                        if(v3 >= v0) {
                            break;
                        }

                        Object v5 = this.mChangedScrap.get(v3);
                        if(!((ViewHolder)v5).wasReturnedFromScrap() && ((ViewHolder)v5).getLayoutPosition() == arg10) {
                            ((ViewHolder)v5).addFlags(v4);
                            return ((ViewHolder)v5);
                        }
                    }

                    if(RecyclerView.this.mAdapter.hasStableIds()) {
                        arg10 = RecyclerView.this.mAdapterHelper.findPositionOffset(arg10);
                        if(arg10 > 0 && arg10 < RecyclerView.this.mAdapter.getItemCount()) {
                            long v5_1 = RecyclerView.this.mAdapter.getItemId(arg10);
                            while(v2 < v0) {
                                Object v10 = this.mChangedScrap.get(v2);
                                if(!((ViewHolder)v10).wasReturnedFromScrap() && ((ViewHolder)v10).getItemId() == v5_1) {
                                    ((ViewHolder)v10).addFlags(v4);
                                    return ((ViewHolder)v10);
                                }

                                ++v2;
                            }
                        }
                    }

                    return v1;
                }
            }

            return v1;
        }

        RecycledViewPool getRecycledViewPool() {
            if(this.mRecyclerPool == null) {
                this.mRecyclerPool = new RecycledViewPool();
            }

            return this.mRecyclerPool;
        }

        int getScrapCount() {
            return this.mAttachedScrap.size();
        }

        @NonNull public List getScrapList() {
            return this.mUnmodifiableAttachedScrap;
        }

        ViewHolder getScrapOrCachedViewForId(long arg6, int arg8, boolean arg9) {
            ViewHolder v1_1;
            int v0;
            for(v0 = this.mAttachedScrap.size() - 1; v0 >= 0; --v0) {
                Object v1 = this.mAttachedScrap.get(v0);
                if(((ViewHolder)v1).getItemId() == arg6 && !((ViewHolder)v1).wasReturnedFromScrap()) {
                    if(arg8 == ((ViewHolder)v1).getItemViewType()) {
                        ((ViewHolder)v1).addFlags(0x20);
                        if((((ViewHolder)v1).isRemoved()) && !RecyclerView.this.mState.isPreLayout()) {
                            ((ViewHolder)v1).setFlags(2, 14);
                        }

                        return ((ViewHolder)v1);
                    }
                    else {
                        if(arg9) {
                            goto label_33;
                        }

                        this.mAttachedScrap.remove(v0);
                        RecyclerView.this.removeDetachedView(((ViewHolder)v1).itemView, false);
                        this.quickRecycleScrapView(((ViewHolder)v1).itemView);
                    }
                }

            label_33:
            }

            for(v0 = this.mCachedViews.size() - 1; true; --v0) {
                v1_1 = null;
                if(v0 < 0) {
                    return v1_1;
                }

                Object v2 = this.mCachedViews.get(v0);
                if(((ViewHolder)v2).getItemId() == arg6) {
                    if(arg8 == ((ViewHolder)v2).getItemViewType()) {
                        if(!arg9) {
                            this.mCachedViews.remove(v0);
                        }

                        return ((ViewHolder)v2);
                    }
                    else {
                        if(arg9) {
                            goto label_53;
                        }

                        this.recycleCachedViewAt(v0);
                        return v1_1;
                    }
                }

            label_53:
            }

            return v1_1;
        }

        ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int arg6, boolean arg7) {
            int v0 = this.mAttachedScrap.size();
            int v1 = 0;
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                Object v3 = this.mAttachedScrap.get(v2);
                if(!((ViewHolder)v3).wasReturnedFromScrap() && ((ViewHolder)v3).getLayoutPosition() == arg6 && !((ViewHolder)v3).isInvalid() && ((RecyclerView.this.mState.mInPreLayout) || !((ViewHolder)v3).isRemoved())) {
                    ((ViewHolder)v3).addFlags(0x20);
                    return ((ViewHolder)v3);
                }
            }

            if(!arg7) {
                View v0_1 = RecyclerView.this.mChildHelper.findHiddenNonRemovedView(arg6);
                if(v0_1 != null) {
                    ViewHolder v6 = RecyclerView.getChildViewHolderInt(v0_1);
                    RecyclerView.this.mChildHelper.unhide(v0_1);
                    int v7 = RecyclerView.this.mChildHelper.indexOfChild(v0_1);
                    if(v7 != -1) {
                        RecyclerView.this.mChildHelper.detachViewFromParent(v7);
                        this.scrapView(v0_1);
                        v6.addFlags(0x2020);
                        return v6;
                    }
                    else {
                        StringBuilder v0_2 = new StringBuilder();
                        v0_2.append("layout index should not be -1 after unhiding a view:");
                        v0_2.append(v6);
                        v0_2.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalStateException(v0_2.toString());
                    }
                }
            }

            v0 = this.mCachedViews.size();
            while(v1 < v0) {
                Object v2_1 = this.mCachedViews.get(v1);
                if(!((ViewHolder)v2_1).isInvalid() && ((ViewHolder)v2_1).getLayoutPosition() == arg6) {
                    if(!arg7) {
                        this.mCachedViews.remove(v1);
                    }

                    return ((ViewHolder)v2_1);
                }

                ++v1;
            }

            return null;
        }

        View getScrapViewAt(int arg2) {
            return this.mAttachedScrap.get(arg2).itemView;
        }

        @NonNull public View getViewForPosition(int arg2) {
            return this.getViewForPosition(arg2, false);
        }

        View getViewForPosition(int arg3, boolean arg4) {
            return this.tryGetViewHolderForPositionByDeadline(arg3, arg4, 0x7FFFFFFFFFFFFFFFL).itemView;
        }

        private void invalidateDisplayListInt(ViewGroup arg5, boolean arg6) {
            int v0;
            for(v0 = arg5.getChildCount() - 1; v0 >= 0; --v0) {
                View v2 = arg5.getChildAt(v0);
                if((v2 instanceof ViewGroup)) {
                    this.invalidateDisplayListInt(((ViewGroup)v2), true);
                }
            }

            if(!arg6) {
                return;
            }

            v0 = 4;
            if(arg5.getVisibility() == v0) {
                arg5.setVisibility(0);
                arg5.setVisibility(v0);
            }
            else {
                int v6 = arg5.getVisibility();
                arg5.setVisibility(v0);
                arg5.setVisibility(v6);
            }
        }

        private void invalidateDisplayListInt(ViewHolder arg2) {
            if((arg2.itemView instanceof ViewGroup)) {
                this.invalidateDisplayListInt(arg2.itemView, false);
            }
        }

        void markItemDecorInsetsDirty() {
            int v0 = this.mCachedViews.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                ViewGroup$LayoutParams v2 = this.mCachedViews.get(v1).itemView.getLayoutParams();
                if(v2 != null) {
                    ((LayoutParams)v2).mInsetsDirty = true;
                }
            }
        }

        void markKnownViewsInvalid() {
            int v0 = this.mCachedViews.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                Object v2 = this.mCachedViews.get(v1);
                if(v2 != null) {
                    ((ViewHolder)v2).addFlags(6);
                    ((ViewHolder)v2).addChangePayload(null);
                }
            }

            if(RecyclerView.this.mAdapter == null || !RecyclerView.this.mAdapter.hasStableIds()) {
                this.recycleAndClearCachedViews();
            }
        }

        void offsetPositionRecordsForInsert(int arg5, int arg6) {
            int v0 = this.mCachedViews.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                Object v2 = this.mCachedViews.get(v1);
                if(v2 != null && ((ViewHolder)v2).mPosition >= arg5) {
                    ((ViewHolder)v2).offsetPosition(arg6, true);
                }
            }
        }

        void offsetPositionRecordsForMove(int arg9, int arg10) {
            int v2;
            int v1;
            int v0;
            if(arg9 < arg10) {
                v0 = arg9;
                v1 = arg10;
                v2 = -1;
            }
            else {
                v1 = arg9;
                v0 = arg10;
                v2 = 1;
            }

            int v3 = this.mCachedViews.size();
            int v5;
            for(v5 = 0; v5 < v3; ++v5) {
                Object v6 = this.mCachedViews.get(v5);
                if(v6 != null && ((ViewHolder)v6).mPosition >= v0) {
                    if(((ViewHolder)v6).mPosition > v1) {
                    }
                    else if(((ViewHolder)v6).mPosition == arg9) {
                        ((ViewHolder)v6).offsetPosition(arg10 - arg9, false);
                    }
                    else {
                        ((ViewHolder)v6).offsetPosition(v2, false);
                    }
                }
            }
        }

        void offsetPositionRecordsForRemove(int arg5, int arg6, boolean arg7) {
            int v0 = arg5 + arg6;
            int v1;
            for(v1 = this.mCachedViews.size() - 1; v1 >= 0; --v1) {
                Object v2 = this.mCachedViews.get(v1);
                if(v2 != null) {
                    if(((ViewHolder)v2).mPosition >= v0) {
                        ((ViewHolder)v2).offsetPosition(-arg6, arg7);
                    }
                    else if(((ViewHolder)v2).mPosition >= arg5) {
                        ((ViewHolder)v2).addFlags(8);
                        this.recycleCachedViewAt(v1);
                    }
                }
            }
        }

        void onAdapterChanged(Adapter arg2, Adapter arg3, boolean arg4) {
            this.clear();
            this.getRecycledViewPool().onAdapterChanged(arg2, arg3, arg4);
        }

        void quickRecycleScrapView(View arg2) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(arg2);
            v2.mScrapContainer = null;
            v2.mInChangeScrap = false;
            v2.clearReturnedFromScrapFlag();
            this.recycleViewHolderInternal(v2);
        }

        void recycleAndClearCachedViews() {
            int v0;
            for(v0 = this.mCachedViews.size() - 1; v0 >= 0; --v0) {
                this.recycleCachedViewAt(v0);
            }

            this.mCachedViews.clear();
            if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
            }
        }

        void recycleCachedViewAt(int arg3) {
            this.addViewHolderToRecycledViewPool(this.mCachedViews.get(arg3), true);
            this.mCachedViews.remove(arg3);
        }

        public void recycleView(@NonNull View arg4) {
            ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg4);
            if(v0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(arg4, false);
            }

            if(v0.isScrap()) {
                v0.unScrap();
            }
            else if(v0.wasReturnedFromScrap()) {
                v0.clearReturnedFromScrapFlag();
            }

            this.recycleViewHolderInternal(v0);
        }

        void recycleViewHolderInternal(ViewHolder arg7) {
            boolean v1 = false;
            if(!arg7.isScrap()) {
                if(arg7.itemView.getParent() != null) {
                }
                else if(arg7.isTmpDetached()) {
                    StringBuilder v1_2 = new StringBuilder();
                    v1_2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                    v1_2.append(arg7);
                    v1_2.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalArgumentException(v1_2.toString());
                }
                else if(!arg7.shouldIgnore()) {
                    boolean v0 = arg7.doesTransientStatePreventRecycling();
                    int v3 = RecyclerView.this.mAdapter == null || !v0 || !RecyclerView.this.mAdapter.onFailedToRecycleView(arg7) ? 0 : 1;
                    if(v3 != 0 || (arg7.isRecyclable())) {
                        if(this.mViewCacheMax <= 0 || (arg7.hasAnyOfTheFlags(0x20E))) {
                            v3 = 0;
                        }
                        else {
                            v3 = this.mCachedViews.size();
                            if(v3 >= this.mViewCacheMax && v3 > 0) {
                                this.recycleCachedViewAt(0);
                                --v3;
                            }

                            if((RecyclerView.ALLOW_THREAD_GAP_WORK) && v3 > 0 && !RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(arg7.mPosition)) {
                                --v3;
                                while(v3 >= 0) {
                                    if(!RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(this.mCachedViews.get(v3).mPosition)) {
                                    }
                                    else {
                                        --v3;
                                        continue;
                                    }

                                    break;
                                }

                                ++v3;
                            }

                            this.mCachedViews.add(v3, arg7);
                            v3 = 1;
                        }

                        if(v3 != 0) {
                            goto label_71;
                        }

                        this.addViewHolderToRecycledViewPool(arg7, true);
                        int v1_1 = 1;
                    }
                    else {
                        v3 = 0;
                    }

                label_71:
                    RecyclerView.this.mViewInfoStore.removeViewHolder(arg7);
                    if(v3 == 0 && !(((boolean)v1_1)) && (v0)) {
                        arg7.mOwnerRecyclerView = null;
                    }

                    return;
                }
                else {
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                    v0_1.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalArgumentException(v0_1.toString());
                }
            }

            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("Scrapped or attached views may not be recycled. isScrap:");
            v3_1.append(arg7.isScrap());
            v3_1.append(" isAttached:");
            if(arg7.itemView.getParent() != null) {
                v1 = true;
            }

            v3_1.append(v1);
            v3_1.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(v3_1.toString());
        }

        void recycleViewInternal(View arg1) {
            this.recycleViewHolderInternal(RecyclerView.getChildViewHolderInt(arg1));
        }

        void scrapView(View arg3) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(arg3);
            if((v3.hasAnyOfTheFlags(12)) || !v3.isUpdated() || (RecyclerView.this.canReuseUpdatedViewHolder(v3))) {
                if((v3.isInvalid()) && !v3.isRemoved()) {
                    if(RecyclerView.this.mAdapter.hasStableIds()) {
                    }
                    else {
                        StringBuilder v0 = new StringBuilder();
                        v0.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                        v0.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(v0.toString());
                    }
                }

                v3.setScrapContainer(this, false);
                this.mAttachedScrap.add(v3);
            }
            else {
                if(this.mChangedScrap == null) {
                    this.mChangedScrap = new ArrayList();
                }

                v3.setScrapContainer(this, true);
                this.mChangedScrap.add(v3);
            }
        }

        void setRecycledViewPool(RecycledViewPool arg2) {
            if(this.mRecyclerPool != null) {
                this.mRecyclerPool.detach();
            }

            this.mRecyclerPool = arg2;
            if(this.mRecyclerPool != null && RecyclerView.this.getAdapter() != null) {
                this.mRecyclerPool.attach();
            }
        }

        void setViewCacheExtension(ViewCacheExtension arg1) {
            this.mViewCacheExtension = arg1;
        }

        public void setViewCacheSize(int arg1) {
            this.mRequestedCacheMax = arg1;
            this.updateViewCacheSize();
        }

        private boolean tryBindViewHolderByDeadline(@NonNull ViewHolder arg10, int arg11, int arg12, long arg13) {
            arg10.mOwnerRecyclerView = RecyclerView.this;
            int v2 = arg10.getItemViewType();
            long v7 = RecyclerView.this.getNanoTime();
            if(arg13 != 0x7FFFFFFFFFFFFFFFL && !this.mRecyclerPool.willBindInTime(v2, v7, arg13)) {
                return 0;
            }

            RecyclerView.this.mAdapter.bindViewHolder(arg10, arg11);
            this.mRecyclerPool.factorInBindTime(arg10.getItemViewType(), RecyclerView.this.getNanoTime() - v7);
            this.attachAccessibilityDelegateOnBind(arg10);
            if(RecyclerView.this.mState.isPreLayout()) {
                arg10.mPreLayoutPosition = arg12;
            }

            return 1;
        }

        @Nullable ViewHolder tryGetViewHolderForPositionByDeadline(int arg17, boolean arg18, long arg19) {
            ViewHolder v10;
            StringBuilder v1_1;
            int v9;
            int v4;
            ViewHolder v1;
            Recycler v6 = this;
            int v3 = arg17;
            boolean v0 = arg18;
            if(v3 >= 0 && v3 < v6.this$0.mState.getItemCount()) {
                ViewHolder v2 = null;
                boolean v7 = true;
                if(v6.this$0.mState.isPreLayout()) {
                    v1 = this.getChangedScrapViewForPosition(arg17);
                    if(v1 != null) {
                        v4 = 1;
                    }
                    else {
                        goto label_20;
                    }
                }
                else {
                    v1 = v2;
                label_20:
                    v4 = 0;
                }

                if(v1 == null) {
                    v1 = this.getScrapOrHiddenOrCachedHolderForPosition(arg17, arg18);
                    if(v1 != null) {
                        if(!v6.validateViewHolderForOffsetPosition(v1)) {
                            if(!v0) {
                                v1.addFlags(4);
                                if(v1.isScrap()) {
                                    v6.this$0.removeDetachedView(v1.itemView, false);
                                    v1.unScrap();
                                }
                                else if(v1.wasReturnedFromScrap()) {
                                    v1.clearReturnedFromScrapFlag();
                                }

                                v6.recycleViewHolderInternal(v1);
                            }

                            v1 = v2;
                        }
                        else {
                            v4 = 1;
                        }
                    }
                }

                if(v1 == null) {
                    int v5 = v6.this$0.mAdapterHelper.findPositionOffset(v3);
                    if(v5 >= 0 && v5 < v6.this$0.mAdapter.getItemCount()) {
                        v9 = v6.this$0.mAdapter.getItemViewType(v5);
                        if(v6.this$0.mAdapter.hasStableIds()) {
                            v1 = v6.getScrapOrCachedViewForId(v6.this$0.mAdapter.getItemId(v5), v9, v0);
                            if(v1 != null) {
                                v1.mPosition = v5;
                                v4 = 1;
                            }
                        }

                        if(v1 == null && v6.mViewCacheExtension != null) {
                            View v0_1 = v6.mViewCacheExtension.getViewForPositionAndType(v6, v3, v9);
                            if(v0_1 != null) {
                                v1 = v6.this$0.getChildViewHolder(v0_1);
                                if(v1 == null) {
                                    v1_1 = new StringBuilder();
                                    v1_1.append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                    v1_1.append(v6.this$0.exceptionLabel());
                                    throw new IllegalArgumentException(v1_1.toString());
                                }
                                else if(!v1.shouldIgnore()) {
                                }
                                else {
                                    v1_1 = new StringBuilder();
                                    v1_1.append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                    v1_1.append(v6.this$0.exceptionLabel());
                                    throw new IllegalArgumentException(v1_1.toString());
                                }
                            }
                        }

                        if(v1 == null) {
                            v1 = this.getRecycledViewPool().getRecycledView(v9);
                            if(v1 != null) {
                                v1.resetInternal();
                                if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    v6.invalidateDisplayListInt(v1);
                                }
                            }
                        }

                        if(v1 != null) {
                            goto label_162;
                        }

                        long v0_2 = v6.this$0.getNanoTime();
                        if(arg19 != 0x7FFFFFFFFFFFFFFFL && !v6.mRecyclerPool.willCreateInTime(v9, v0_2, arg19)) {
                            return v2;
                        }

                        v2 = v6.this$0.mAdapter.createViewHolder(v6.this$0, v9);
                        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            RecyclerView v5_1 = RecyclerView.findNestedRecyclerView(v2.itemView);
                            if(v5_1 != null) {
                                v2.mNestedRecyclerView = new WeakReference(v5_1);
                            }
                        }

                        v6.mRecyclerPool.factorInCreateTime(v9, v6.this$0.getNanoTime() - v0_2);
                        v10 = v2;
                        goto label_163;
                    }

                    v1_1 = new StringBuilder();
                    v1_1.append("Inconsistency detected. Invalid item position ");
                    v1_1.append(v3);
                    v1_1.append("(offset:");
                    v1_1.append(v5);
                    v1_1.append(").");
                    v1_1.append("state:");
                    v1_1.append(v6.this$0.mState.getItemCount());
                    v1_1.append(v6.this$0.exceptionLabel());
                    throw new IndexOutOfBoundsException(v1_1.toString());
                }
                else {
                label_162:
                    v10 = v1;
                }

            label_163:
                v9 = v4;
                if(v9 != 0 && !v6.this$0.mState.isPreLayout()) {
                    int v0_3 = 0x2000;
                    if(v10.hasAnyOfTheFlags(v0_3)) {
                        v10.setFlags(0, v0_3);
                        if(v6.this$0.mState.mRunSimpleAnimations) {
                            v6.this$0.recordAnimationInfoIfBouncedHiddenView(v10, v6.this$0.mItemAnimator.recordPreLayoutInformation(v6.this$0.mState, v10, ItemAnimator.buildAdapterChangeFlagsForAnimations(v10) | 0x1000, v10.getUnmodifiedPayloads()));
                        }
                    }
                }

                if(!v6.this$0.mState.isPreLayout() || !v10.isBound()) {
                    if((v10.isBound()) && !v10.needsUpdate()) {
                        if(v10.isInvalid()) {
                        }
                        else {
                        label_202:
                            v0 = false;
                            goto label_212;
                        }
                    }

                    v0 = this.tryBindViewHolderByDeadline(v10, v6.this$0.mAdapterHelper.findPositionOffset(v3), arg17, arg19);
                }
                else {
                    v10.mPreLayoutPosition = v3;
                    goto label_202;
                }

            label_212:
                ViewGroup$LayoutParams v1_2 = v10.itemView.getLayoutParams();
                if(v1_2 == null) {
                    v1_2 = v6.this$0.generateDefaultLayoutParams();
                    v10.itemView.setLayoutParams(v1_2);
                }
                else if(!v6.this$0.checkLayoutParams(v1_2)) {
                    v1_2 = v6.this$0.generateLayoutParams(v1_2);
                    v10.itemView.setLayoutParams(v1_2);
                }

                ((LayoutParams)v1_2).mViewHolder = v10;
                if(v9 == 0 || !v0) {
                    v7 = false;
                }
                else {
                }

                ((LayoutParams)v1_2).mPendingInvalidate = v7;
                return v10;
            }

            v1_1 = new StringBuilder();
            v1_1.append("Invalid item position ");
            v1_1.append(v3);
            v1_1.append("(");
            v1_1.append(v3);
            v1_1.append("). Item count:");
            v1_1.append(v6.this$0.mState.getItemCount());
            v1_1.append(v6.this$0.exceptionLabel());
            throw new IndexOutOfBoundsException(v1_1.toString());
        }

        void unscrapView(ViewHolder arg2) {
            if(arg2.mInChangeScrap) {
                this.mChangedScrap.remove(arg2);
            }
            else {
                this.mAttachedScrap.remove(arg2);
            }

            arg2.mScrapContainer = null;
            arg2.mInChangeScrap = false;
            arg2.clearReturnedFromScrapFlag();
        }

        void updateViewCacheSize() {
            int v0 = RecyclerView.this.mLayout != null ? RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0;
            this.mViewCacheMax = this.mRequestedCacheMax + v0;
            for(v0 = this.mCachedViews.size() - 1; v0 >= 0; --v0) {
                if(this.mCachedViews.size() <= this.mViewCacheMax) {
                    return;
                }

                this.recycleCachedViewAt(v0);
            }
        }

        boolean validateViewHolderForOffsetPosition(ViewHolder arg8) {
            if(arg8.isRemoved()) {
                return RecyclerView.this.mState.isPreLayout();
            }

            if(arg8.mPosition >= 0 && arg8.mPosition < RecyclerView.this.mAdapter.getItemCount()) {
                boolean v1 = false;
                if(!RecyclerView.this.mState.isPreLayout() && RecyclerView.this.mAdapter.getItemViewType(arg8.mPosition) != arg8.getItemViewType()) {
                    return 0;
                }

                if(RecyclerView.this.mAdapter.hasStableIds()) {
                    if(arg8.getItemId() == RecyclerView.this.mAdapter.getItemId(arg8.mPosition)) {
                        v1 = true;
                    }

                    return v1;
                }

                return 1;
            }

            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("Inconsistency detected. Invalid view holder adapter position");
            v1_1.append(arg8);
            v1_1.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(v1_1.toString());
        }

        void viewRangeUpdate(int arg4, int arg5) {
            arg5 += arg4;
            int v0;
            for(v0 = this.mCachedViews.size() - 1; v0 >= 0; --v0) {
                Object v1 = this.mCachedViews.get(v0);
                if(v1 == null) {
                }
                else {
                    int v2 = ((ViewHolder)v1).mPosition;
                    if(v2 >= arg4 && v2 < arg5) {
                        ((ViewHolder)v1).addFlags(2);
                        this.recycleCachedViewAt(v0);
                    }
                }
            }
        }
    }

    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder arg1);
    }

    class RecyclerViewDataObserver extends AdapterDataObserver {
        RecyclerViewDataObserver(RecyclerView arg1) {
            RecyclerView.this = arg1;
            super();
        }

        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView.this.mState.mStructureChanged = true;
            RecyclerView.this.processDataSetCompletelyChanged(true);
            if(!RecyclerView.this.mAdapterHelper.hasPendingUpdates()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void onItemRangeChanged(int arg3, int arg4, Object arg5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.onItemRangeChanged(arg3, arg4, arg5)) {
                this.triggerUpdateProcessor();
            }
        }

        public void onItemRangeInserted(int arg3, int arg4) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.onItemRangeInserted(arg3, arg4)) {
                this.triggerUpdateProcessor();
            }
        }

        public void onItemRangeMoved(int arg3, int arg4, int arg5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.onItemRangeMoved(arg3, arg4, arg5)) {
                this.triggerUpdateProcessor();
            }
        }

        public void onItemRangeRemoved(int arg3, int arg4) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if(RecyclerView.this.mAdapterHelper.onItemRangeRemoved(arg3, arg4)) {
                this.triggerUpdateProcessor();
            }
        }

        void triggerUpdateProcessor() {
            if(!RecyclerView.POST_UPDATES_ON_ANIMATION || !RecyclerView.this.mHasFixedSize || !RecyclerView.this.mIsAttached) {
                RecyclerView.this.mAdapterUpdateDuringMeasure = true;
                RecyclerView.this.requestLayout();
            }
            else {
                ViewCompat.postOnAnimation(RecyclerView.this, RecyclerView.this.mUpdateChildViewsRunnable);
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class SavedState extends AbsSavedState {
        final class androidx.recyclerview.widget.RecyclerView$SavedState$1 implements Parcelable$ClassLoaderCreator {
            androidx.recyclerview.widget.RecyclerView$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg3) {
                return new SavedState(arg3, null);
            }

            public SavedState createFromParcel(Parcel arg2, ClassLoader arg3) {
                return new SavedState(arg2, arg3);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public Object createFromParcel(Parcel arg1, ClassLoader arg2) {
                return this.createFromParcel(arg1, arg2);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        Parcelable mLayoutState;

        static {
            SavedState.CREATOR = new androidx.recyclerview.widget.RecyclerView$SavedState$1();
        }

        SavedState(Parcelable arg1) {
            super(arg1);
        }

        SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            if(arg2 != null) {
            }
            else {
                arg2 = LayoutManager.class.getClassLoader();
            }

            this.mLayoutState = arg1.readParcelable(arg2);
        }

        void copyFrom(SavedState arg1) {
            this.mLayoutState = arg1.mLayoutState;
        }

        public void writeToParcel(Parcel arg2, int arg3) {
            super.writeToParcel(arg2, arg3);
            arg2.writeParcelable(this.mLayoutState, 0);
        }
    }

    public class SimpleOnItemTouchListener implements OnItemTouchListener {
        public SimpleOnItemTouchListener() {
            super();
        }

        public boolean onInterceptTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2) {
            return 0;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean arg1) {
        }

        public void onTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2) {
        }
    }

    public abstract class SmoothScroller {
        public class Action {
            public static final int UNDEFINED_DURATION = 0x80000000;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@Px int arg3, @Px int arg4) {
                this(arg3, arg4, 0x80000000, null);
            }

            public Action(@Px int arg2, @Px int arg3, int arg4, @Nullable Interpolator arg5) {
                super();
                this.mJumpToPosition = -1;
                this.mChanged = false;
                this.mConsecutiveUpdates = 0;
                this.mDx = arg2;
                this.mDy = arg3;
                this.mDuration = arg4;
                this.mInterpolator = arg5;
            }

            public Action(@Px int arg2, @Px int arg3, int arg4) {
                this(arg2, arg3, arg4, null);
            }

            public int getDuration() {
                return this.mDuration;
            }

            @Px public int getDx() {
                return this.mDx;
            }

            @Px public int getDy() {
                return this.mDy;
            }

            @Nullable public Interpolator getInterpolator() {
                return this.mInterpolator;
            }

            boolean hasJumpTarget() {
                boolean v0 = this.mJumpToPosition >= 0 ? true : false;
                return v0;
            }

            public void jumpTo(int arg1) {
                this.mJumpToPosition = arg1;
            }

            void runIfNecessary(RecyclerView arg6) {
                if(this.mJumpToPosition >= 0) {
                    int v0 = this.mJumpToPosition;
                    this.mJumpToPosition = -1;
                    arg6.jumpToPositionForSmoothScroller(v0);
                    this.mChanged = false;
                    return;
                }

                if(this.mChanged) {
                    this.validate();
                    if(this.mInterpolator != null) {
                        arg6.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, this.mDuration, this.mInterpolator);
                    }
                    else if(this.mDuration == 0x80000000) {
                        arg6.mViewFlinger.smoothScrollBy(this.mDx, this.mDy);
                    }
                    else {
                        arg6.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, this.mDuration);
                    }

                    ++this.mConsecutiveUpdates;
                    if(this.mConsecutiveUpdates > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }

                    this.mChanged = false;
                }
                else {
                    this.mConsecutiveUpdates = 0;
                }
            }

            public void setDuration(int arg2) {
                this.mChanged = true;
                this.mDuration = arg2;
            }

            public void setDx(@Px int arg2) {
                this.mChanged = true;
                this.mDx = arg2;
            }

            public void setDy(@Px int arg2) {
                this.mChanged = true;
                this.mDy = arg2;
            }

            public void setInterpolator(@Nullable Interpolator arg2) {
                this.mChanged = true;
                this.mInterpolator = arg2;
            }

            public void update(@Px int arg1, @Px int arg2, int arg3, @Nullable Interpolator arg4) {
                this.mDx = arg1;
                this.mDy = arg2;
                this.mDuration = arg3;
                this.mInterpolator = arg4;
                this.mChanged = true;
            }

            private void validate() {
                if(this.mInterpolator != null) {
                    if(this.mDuration >= 1) {
                    }
                    else {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                }

                if(this.mDuration >= 1) {
                    return;
                }

                throw new IllegalStateException("Scroll duration must be a positive number");
            }
        }

        public interface ScrollVectorProvider {
            @Nullable PointF computeScrollVectorForPosition(int arg1);
        }

        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private View mTargetView;

        public SmoothScroller() {
            super();
            this.mTargetPosition = -1;
            this.mRecyclingAction = new Action(0, 0);
        }

        @Nullable public PointF computeScrollVectorForPosition(int arg3) {
            LayoutManager v0 = this.getLayoutManager();
            if((v0 instanceof ScrollVectorProvider)) {
                return ((ScrollVectorProvider)v0).computeScrollVectorForPosition(arg3);
            }

            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int arg2) {
            return this.mRecyclerView.mLayout.findViewByPosition(arg2);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View arg2) {
            return this.mRecyclerView.getChildLayoutPosition(arg2);
        }

        @Nullable public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated public void instantScrollToPosition(int arg2) {
            this.mRecyclerView.scrollToPosition(arg2);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(@NonNull PointF arg4) {
            float v0 = ((float)Math.sqrt(((double)(arg4.x * arg4.x + arg4.y * arg4.y))));
            arg4.x /= v0;
            arg4.y /= v0;
        }

        void onAnimation(int arg6, int arg7) {
            RecyclerView v0 = this.mRecyclerView;
            if(!this.mRunning || this.mTargetPosition == -1 || v0 == null) {
                this.stop();
            }

            int[] v2 = null;
            if((this.mPendingInitialRun) && this.mTargetView == null && this.mLayoutManager != null) {
                PointF v1 = this.computeScrollVectorForPosition(this.mTargetPosition);
                if(v1 != null) {
                    if(v1.x == 0f && v1.y == 0f) {
                        goto label_30;
                    }

                    v0.scrollStep(((int)Math.signum(v1.x)), ((int)Math.signum(v1.y)), v2);
                }
            }

        label_30:
            this.mPendingInitialRun = false;
            if(this.mTargetView != null) {
                if(this.getChildPosition(this.mTargetView) == this.mTargetPosition) {
                    this.onTargetFound(this.mTargetView, v0.mState, this.mRecyclingAction);
                    this.mRecyclingAction.runIfNecessary(v0);
                    this.stop();
                }
                else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = ((View)v2);
                }
            }

            if(this.mRunning) {
                this.onSeekTargetStep(arg6, arg7, v0.mState, this.mRecyclingAction);
                boolean v6 = this.mRecyclingAction.hasJumpTarget();
                this.mRecyclingAction.runIfNecessary(v0);
                if(v6) {
                    if(this.mRunning) {
                        this.mPendingInitialRun = true;
                        v0.mViewFlinger.postOnAnimation();
                    }
                    else {
                        this.stop();
                    }
                }
            }
        }

        protected void onChildAttachedToWindow(View arg3) {
            if(this.getChildPosition(arg3) == this.getTargetPosition()) {
                this.mTargetView = arg3;
            }
        }

        protected abstract void onSeekTargetStep(@Px int arg1, @Px int arg2, @NonNull State arg3, @NonNull Action arg4);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(@NonNull View arg1, @NonNull State arg2, @NonNull Action arg3);

        public void setTargetPosition(int arg1) {
            this.mTargetPosition = arg1;
        }

        void start(RecyclerView arg4, LayoutManager arg5) {
            if(this.mStarted) {
                Log.w("RecyclerView", "An instance of " + this.getClass().getSimpleName() + " was started " + "more than once. Each instance of" + this.getClass().getSimpleName() + " " + "is intended to only be used once. You should create a new instance for " + "each use.");
            }

            this.mRecyclerView = arg4;
            this.mLayoutManager = arg5;
            if(this.mTargetPosition != -1) {
                this.mRecyclerView.mState.mTargetPosition = this.mTargetPosition;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = this.findViewByPosition(this.getTargetPosition());
                this.onStart();
                this.mRecyclerView.mViewFlinger.postOnAnimation();
                this.mStarted = true;
                return;
            }

            throw new IllegalArgumentException("Invalid target position");
        }

        protected final void stop() {
            if(!this.mRunning) {
                return;
            }

            this.mRunning = false;
            this.onStop();
            this.mRecyclerView.mState.mTargetPosition = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    public class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private SparseArray mData;
        int mDeletedInvisibleItemCountSincePreviousLayout;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        boolean mInPreLayout;
        boolean mIsMeasuring;
        int mItemCount;
        int mLayoutStep;
        int mPreviousLayoutItemCount;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        boolean mRunPredictiveAnimations;
        boolean mRunSimpleAnimations;
        boolean mStructureChanged;
        int mTargetPosition;
        boolean mTrackOldChangeHolders;

        public State() {
            super();
            this.mTargetPosition = -1;
            this.mPreviousLayoutItemCount = 0;
            this.mDeletedInvisibleItemCountSincePreviousLayout = 0;
            this.mLayoutStep = 1;
            this.mItemCount = 0;
            this.mStructureChanged = false;
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
            this.mRunSimpleAnimations = false;
            this.mRunPredictiveAnimations = false;
        }

        void assertLayoutStep(int arg4) {
            if((this.mLayoutStep & arg4) != 0) {
                return;
            }

            StringBuilder v1 = new StringBuilder();
            v1.append("Layout state should be one of ");
            v1.append(Integer.toBinaryString(arg4));
            v1.append(" but it is ");
            v1.append(Integer.toBinaryString(this.mLayoutStep));
            throw new IllegalStateException(v1.toString());
        }

        public boolean didStructureChange() {
            return this.mStructureChanged;
        }

        public Object get(int arg2) {
            if(this.mData == null) {
                return null;
            }

            return this.mData.get(arg2);
        }

        public int getItemCount() {
            int v0 = this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
            return v0;
        }

        public int getRemainingScrollHorizontal() {
            return this.mRemainingScrollHorizontal;
        }

        public int getRemainingScrollVertical() {
            return this.mRemainingScrollVertical;
        }

        public int getTargetScrollPosition() {
            return this.mTargetPosition;
        }

        public boolean hasTargetScrollPosition() {
            boolean v0 = this.mTargetPosition != -1 ? true : false;
            return v0;
        }

        public boolean isMeasuring() {
            return this.mIsMeasuring;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        void prepareForNestedPrefetch(Adapter arg2) {
            this.mLayoutStep = 1;
            this.mItemCount = arg2.getItemCount();
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
        }

        public void put(int arg2, Object arg3) {
            if(this.mData == null) {
                this.mData = new SparseArray();
            }

            this.mData.put(arg2, arg3);
        }

        public void remove(int arg2) {
            if(this.mData == null) {
                return;
            }

            this.mData.remove(arg2);
        }

        State reset() {
            this.mTargetPosition = -1;
            if(this.mData != null) {
                this.mData.clear();
            }

            this.mItemCount = 0;
            this.mStructureChanged = false;
            this.mIsMeasuring = false;
            return this;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.mTargetPosition + ", mData=" + this.mData + ", mItemCount=" + this.mItemCount + ", mIsMeasuring=" + this.mIsMeasuring + ", mPreviousLayoutItemCount=" + this.mPreviousLayoutItemCount + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.mDeletedInvisibleItemCountSincePreviousLayout + ", mStructureChanged=" + this.mStructureChanged + ", mInPreLayout=" + this.mInPreLayout + ", mRunSimpleAnimations=" + this.mRunSimpleAnimations + ", mRunPredictiveAnimations=" + this.mRunPredictiveAnimations + '}';
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations() {
            return this.mRunSimpleAnimations;
        }
    }

    public abstract class ViewCacheExtension {
        public ViewCacheExtension() {
            super();
        }

        @Nullable public abstract View getViewForPositionAndType(@NonNull Recycler arg1, int arg2, int arg3);
    }

    class ViewFlinger implements Runnable {
        private boolean mEatRunOnAnimationRequest;
        Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        private boolean mReSchedulePostAnimationCallback;
        OverScroller mScroller;

        ViewFlinger(RecyclerView arg3) {
            RecyclerView.this = arg3;
            super();
            this.mInterpolator = RecyclerView.sQuinticInterpolator;
            this.mEatRunOnAnimationRequest = false;
            this.mReSchedulePostAnimationCallback = false;
            this.mScroller = new OverScroller(arg3.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private int computeScrollDuration(int arg5, int arg6, int arg7, int arg8) {
            int v0 = Math.abs(arg5);
            int v1 = Math.abs(arg6);
            int v2 = v0 > v1 ? 1 : 0;
            arg7 = ((int)Math.sqrt(((double)(arg7 * arg7 + arg8 * arg8))));
            arg5 = ((int)Math.sqrt(((double)(arg5 * arg5 + arg6 * arg6))));
            arg6 = v2 != 0 ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            arg8 = arg6 / 2;
            float v3 = 1f;
            float v6 = ((float)arg6);
            float v8 = ((float)arg8);
            v8 += this.distanceInfluenceForSnapDuration(Math.min(v3, (((float)arg5)) * v3 / v6)) * v8;
            if(arg7 > 0) {
                arg5 = Math.round(Math.abs(v8 / (((float)arg7))) * 1000f) * 4;
            }
            else {
                if(v2 != 0) {
                }
                else {
                    v0 = v1;
                }

                arg5 = ((int)(((((float)v0)) / v6 + v3) * 300f));
            }

            return Math.min(arg5, 2000);
        }

        private void disableRunOnAnimationRequests() {
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
        }

        private float distanceInfluenceForSnapDuration(float arg3) {
            return ((float)Math.sin(((double)((arg3 - 0.5f) * 0.471239f))));
        }

        private void enableRunOnAnimationRequests() {
            this.mEatRunOnAnimationRequest = false;
            if(this.mReSchedulePostAnimationCallback) {
                this.postOnAnimation();
            }
        }

        public void fling(int arg11, int arg12) {
            RecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            this.mScroller.fling(0, 0, arg11, arg12, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
            this.postOnAnimation();
        }

        void postOnAnimation() {
            if(this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            }
            else {
                RecyclerView.this.removeCallbacks(((Runnable)this));
                ViewCompat.postOnAnimation(RecyclerView.this, ((Runnable)this));
            }
        }

        public void run() {
            int v15;
            int v9;
            int v8;
            int v7;
            int v5;
            int v3_1;
            ViewFlinger v0 = this;
            if(v0.this$0.mLayout == null) {
                this.stop();
                return;
            }

            this.disableRunOnAnimationRequests();
            v0.this$0.consumePendingUpdateOperations();
            OverScroller v1 = v0.mScroller;
            SmoothScroller v2 = v0.this$0.mLayout.mSmoothScroller;
            if(v1.computeScrollOffset()) {
                int[] v3 = v0.this$0.mScrollConsumed;
                int v11 = v1.getCurrX();
                int v12 = v1.getCurrY();
                int v13 = v11 - v0.mLastFlingX;
                int v14 = v12 - v0.mLastFlingY;
                v0.mLastFlingX = v11;
                v0.mLastFlingY = v12;
                if(v0.this$0.dispatchNestedPreScroll(v13, v14, v3, null, 1)) {
                    v13 -= v3[0];
                    v14 -= v3[1];
                }

                if(v0.this$0.mAdapter != null) {
                    v0.this$0.scrollStep(v13, v14, v0.this$0.mScrollStepConsumed);
                    v3_1 = v0.this$0.mScrollStepConsumed[0];
                    v5 = v0.this$0.mScrollStepConsumed[1];
                    v7 = v13 - v3_1;
                    v8 = v14 - v5;
                    if(v2 != null && !v2.isPendingInitialRun() && (v2.isRunning())) {
                        v9 = v0.this$0.mState.getItemCount();
                        if(v9 == 0) {
                            v2.stop();
                        }
                        else if(v2.getTargetPosition() >= v9) {
                            v2.setTargetPosition(v9 - 1);
                            v2.onAnimation(v13 - v7, v14 - v8);
                        }
                        else {
                            v2.onAnimation(v13 - v7, v14 - v8);
                        }
                    }
                }
                else {
                    v3_1 = 0;
                    v5 = 0;
                    v7 = 0;
                    v8 = 0;
                }

                if(!v0.this$0.mItemDecorations.isEmpty()) {
                    v0.this$0.invalidate();
                }

                int v10 = 2;
                if(v0.this$0.getOverScrollMode() != v10) {
                    v0.this$0.considerReleasingGlowsOnScroll(v13, v14);
                }

                if(!v0.this$0.dispatchNestedScroll(v3_1, v5, v7, v8, null, 1) && (v7 != 0 || v8 != 0)) {
                    v9 = ((int)v1.getCurrVelocity());
                    if(v7 == v11) {
                    label_113:
                        v15 = 0;
                    }
                    else if(v7 < 0) {
                        v15 = -v9;
                    }
                    else if(v7 > 0) {
                        v15 = v9;
                    }
                    else {
                        goto label_113;
                    }

                    if(v8 == v12) {
                    label_120:
                        v9 = 0;
                    }
                    else if(v8 < 0) {
                        v9 = -v9;
                    }
                    else if(v8 > 0) {
                    }
                    else {
                        goto label_120;
                    }

                    if(v0.this$0.getOverScrollMode() != v10) {
                        v0.this$0.absorbGlows(v15, v9);
                    }

                    if(v15 == 0 && v7 != v11 && v1.getFinalX() != 0) {
                        goto label_135;
                    }

                    if(v9 == 0 && v8 != v12 && v1.getFinalY() != 0) {
                        goto label_135;
                    }

                    v1.abortAnimation();
                }

            label_135:
                if(v3_1 != 0 || v5 != 0) {
                    v0.this$0.dispatchOnScrolled(v3_1, v5);
                }

                if(!v0.this$0.awakenScrollBars()) {
                    v0.this$0.invalidate();
                }

                int v4 = v14 == 0 || !v0.this$0.mLayout.canScrollVertically() || v5 != v14 ? 0 : 1;
                v3_1 = v13 == 0 || !v0.this$0.mLayout.canScrollHorizontally() || v3_1 != v13 ? 0 : 1;
                v3_1 = v13 == 0 && v14 == 0 || (v3_1 != 0 || v4 != 0) ? 1 : 0;
                if(!v1.isFinished() && (v3_1 != 0 || (v0.this$0.hasNestedScrollingParent(1)))) {
                    this.postOnAnimation();
                    if(v0.this$0.mGapWorker == null) {
                        goto label_196;
                    }

                    v0.this$0.mGapWorker.postFromTraversal(v0.this$0, v13, v14);
                    goto label_196;
                }

                v0.this$0.setScrollState(0);
                if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    v0.this$0.mPrefetchRegistry.clearPrefetchPositions();
                }

                v0.this$0.stopNestedScroll(1);
            }

        label_196:
            if(v2 != null) {
                if(v2.isPendingInitialRun()) {
                    v2.onAnimation(0, 0);
                }

                if(v0.mReSchedulePostAnimationCallback) {
                    goto label_204;
                }

                v2.stop();
            }

        label_204:
            this.enableRunOnAnimationRequests();
        }

        public void smoothScrollBy(int arg2, int arg3, Interpolator arg4) {
            int v0 = this.computeScrollDuration(arg2, arg3, 0, 0);
            if(arg4 == null) {
                arg4 = RecyclerView.sQuinticInterpolator;
            }

            this.smoothScrollBy(arg2, arg3, v0, arg4);
        }

        public void smoothScrollBy(int arg2, int arg3) {
            this.smoothScrollBy(arg2, arg3, 0, 0);
        }

        public void smoothScrollBy(int arg2, int arg3, int arg4) {
            this.smoothScrollBy(arg2, arg3, arg4, RecyclerView.sQuinticInterpolator);
        }

        public void smoothScrollBy(int arg7, int arg8, int arg9, Interpolator arg10) {
            if(this.mInterpolator != arg10) {
                this.mInterpolator = arg10;
                this.mScroller = new OverScroller(RecyclerView.this.getContext(), arg10);
            }

            RecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            this.mScroller.startScroll(0, 0, arg7, arg8, arg9);
            if(Build$VERSION.SDK_INT < 23) {
                this.mScroller.computeScrollOffset();
            }

            this.postOnAnimation();
        }

        public void smoothScrollBy(int arg1, int arg2, int arg3, int arg4) {
            this.smoothScrollBy(arg1, arg2, this.computeScrollDuration(arg1, arg2, arg3, arg4));
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(((Runnable)this));
            this.mScroller.abortAnimation();
        }
    }

    public abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 0x400;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 0x200;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 0x1000;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 0x2000;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 0x80;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 0x800;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 0x20;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 0x4000;
        static final int FLAG_TMP_DETACHED = 0x100;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull public final View itemView;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        WeakReference mNestedRecyclerView;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        @VisibleForTesting int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
            ViewHolder.FULLUPDATE_PAYLOADS = Collections.emptyList();
        }

        public ViewHolder(@NonNull View arg4) {
            super();
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.mPayloads = null;
            this.mUnmodifiedPayloads = null;
            this.mIsRecyclableCount = 0;
            this.mScrapContainer = null;
            this.mInChangeScrap = false;
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            if(arg4 != null) {
                this.itemView = arg4;
                return;
            }

            throw new IllegalArgumentException("itemView may not be null");
        }

        void addChangePayload(Object arg3) {
            int v0 = 0x400;
            if(arg3 == null) {
                this.addFlags(v0);
            }
            else if((v0 & this.mFlags) == 0) {
                this.createPayloadsIfNeeded();
                this.mPayloads.add(arg3);
            }
        }

        void addFlags(int arg2) {
            this.mFlags |= arg2;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            if(this.mPayloads != null) {
                this.mPayloads.clear();
            }

            this.mFlags &= 0xFFFFFBFF;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= 0xFFFFFEFF;
        }

        private void createPayloadsIfNeeded() {
            if(this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        boolean doesTransientStatePreventRecycling() {
            boolean v0 = (this.mFlags & 16) != 0 || !ViewCompat.hasTransientState(this.itemView) ? false : true;
            return v0;
        }

        void flagRemovedAndOffsetPosition(int arg2, int arg3, boolean arg4) {
            this.addFlags(8);
            this.offsetPosition(arg3, arg4);
            this.mPosition = arg2;
        }

        public final int getAdapterPosition() {
            if(this.mOwnerRecyclerView == null) {
                return -1;
            }

            return this.mOwnerRecyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int v0 = this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
            return v0;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated public final int getPosition() {
            int v0 = this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
            return v0;
        }

        List getUnmodifiedPayloads() {
            if((this.mFlags & 0x400) == 0) {
                if(this.mPayloads != null) {
                    if(this.mPayloads.size() == 0) {
                    }
                    else {
                        return this.mUnmodifiedPayloads;
                    }
                }

                return ViewHolder.FULLUPDATE_PAYLOADS;
            }

            return ViewHolder.FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int arg2) {
            boolean v2 = (arg2 & this.mFlags) != 0 ? true : false;
            return v2;
        }

        boolean isAdapterPositionUnknown() {
            boolean v0 = (this.mFlags & 0x200) != 0 || (this.isInvalid()) ? true : false;
            return v0;
        }

        boolean isBound() {
            boolean v1 = true;
            if((this.mFlags & 1) != 0) {
            }
            else {
                v1 = false;
            }

            return v1;
        }

        boolean isInvalid() {
            boolean v0 = (this.mFlags & 4) != 0 ? true : false;
            return v0;
        }

        public final boolean isRecyclable() {
            boolean v0 = (this.mFlags & 16) != 0 || (ViewCompat.hasTransientState(this.itemView)) ? false : true;
            return v0;
        }

        boolean isRemoved() {
            boolean v0 = (this.mFlags & 8) != 0 ? true : false;
            return v0;
        }

        boolean isScrap() {
            boolean v0 = this.mScrapContainer != null ? true : false;
            return v0;
        }

        boolean isTmpDetached() {
            boolean v0 = (this.mFlags & 0x100) != 0 ? true : false;
            return v0;
        }

        boolean isUpdated() {
            boolean v0 = (this.mFlags & 2) != 0 ? true : false;
            return v0;
        }

        boolean needsUpdate() {
            boolean v0 = (this.mFlags & 2) != 0 ? true : false;
            return v0;
        }

        void offsetPosition(int arg3, boolean arg4) {
            int v1 = -1;
            if(this.mOldPosition == v1) {
                this.mOldPosition = this.mPosition;
            }

            if(this.mPreLayoutPosition == v1) {
                this.mPreLayoutPosition = this.mPosition;
            }

            if(arg4) {
                this.mPreLayoutPosition += arg3;
            }

            this.mPosition += arg3;
            if(this.itemView.getLayoutParams() != null) {
                this.itemView.getLayoutParams().mInsetsDirty = true;
            }
        }

        void onEnteredHiddenState(RecyclerView arg3) {
            this.mWasImportantForAccessibilityBeforeHidden = this.mPendingAccessibilityState != -1 ? this.mPendingAccessibilityState : ViewCompat.getImportantForAccessibility(this.itemView);
            arg3.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView arg2) {
            arg2.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if(this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int arg3, int arg4) {
            this.mFlags = arg3 & arg4 | this.mFlags & ~arg4;
        }

        public final void setIsRecyclable(boolean arg3) {
            int v1 = arg3 ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            this.mIsRecyclableCount = v1;
            if(this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            else {
                if(!arg3 && this.mIsRecyclableCount == 1) {
                    this.mFlags |= 16;
                    return;
                }

                if(!arg3) {
                    return;
                }

                if(this.mIsRecyclableCount != 0) {
                    return;
                }

                this.mFlags &= -17;
            }
        }

        void setScrapContainer(Recycler arg1, boolean arg2) {
            this.mScrapContainer = arg1;
            this.mInChangeScrap = arg2;
        }

        boolean shouldBeKeptAsChild() {
            boolean v0 = (this.mFlags & 16) != 0 ? true : false;
            return v0;
        }

        boolean shouldIgnore() {
            boolean v0 = (this.mFlags & 0x80) != 0 ? true : false;
            return v0;
        }

        void stopIgnoring() {
            this.mFlags &= 0xFFFFFF7F;
        }

        public String toString() {
            StringBuilder v1 = new StringBuilder();
            v1.append("ViewHolder{");
            v1.append(Integer.toHexString(this.hashCode()));
            v1.append(" position=");
            v1.append(this.mPosition);
            v1.append(" id=");
            v1.append(this.mItemId);
            v1.append(", oldPos=");
            v1.append(this.mOldPosition);
            v1.append(", pLpos:");
            v1.append(this.mPreLayoutPosition);
            StringBuilder v0 = new StringBuilder(v1.toString());
            if(this.isScrap()) {
                v0.append(" scrap ");
                String v1_1 = this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]";
                v0.append(v1_1);
            }

            if(this.isInvalid()) {
                v0.append(" invalid");
            }

            if(!this.isBound()) {
                v0.append(" unbound");
            }

            if(this.needsUpdate()) {
                v0.append(" update");
            }

            if(this.isRemoved()) {
                v0.append(" removed");
            }

            if(this.shouldIgnore()) {
                v0.append(" ignored");
            }

            if(this.isTmpDetached()) {
                v0.append(" tmpDetached");
            }

            if(!this.isRecyclable()) {
                v0.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }

            if(this.isAdapterPositionUnknown()) {
                v0.append(" undefined adapter position");
            }

            if(this.itemView.getParent() == null) {
                v0.append(" no parent");
            }

            v0.append("}");
            return v0.toString();
        }

        void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        boolean wasReturnedFromScrap() {
            boolean v0 = (this.mFlags & 0x20) != 0 ? true : false;
            return v0;
        }
    }

    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final int[] CLIP_TO_PADDING_ATTR = null;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = 0x7FFFFFFFFFFFFFFFL;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private OnItemTouchListener mActiveOnItemTouchListener;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @NonNull private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @VisibleForTesting boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting LayoutManager mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    @VisibleForTesting final List mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    final int[] mScrollConsumed;
    private OnScrollListener mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    final int[] mScrollStepConsumed;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    static final Interpolator sQuinticInterpolator;

    static {
        RecyclerView.NESTED_SCROLLING_ATTRS = new int[]{0x1010436};
        RecyclerView.CLIP_TO_PADDING_ATTR = new int[]{0x10100EB};
        boolean v1 = Build$VERSION.SDK_INT == 18 || Build$VERSION.SDK_INT == 19 || Build$VERSION.SDK_INT == 20 ? true : false;
        RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = v1;
        v1 = Build$VERSION.SDK_INT >= 23 ? true : false;
        RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = v1;
        v1 = Build$VERSION.SDK_INT >= 16 ? true : false;
        RecyclerView.POST_UPDATES_ON_ANIMATION = v1;
        v1 = Build$VERSION.SDK_INT >= 21 ? true : false;
        RecyclerView.ALLOW_THREAD_GAP_WORK = v1;
        int v3 = 15;
        v1 = Build$VERSION.SDK_INT <= v3 ? true : false;
        RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = v1;
        v1 = Build$VERSION.SDK_INT <= v3 ? true : false;
        RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = v1;
        RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        RecyclerView.sQuinticInterpolator = new androidx.recyclerview.widget.RecyclerView$3();
    }

    public RecyclerView(@NonNull Context arg2) {
        this(arg2, null);
    }

    public RecyclerView(@NonNull Context arg2, @Nullable AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public RecyclerView(@NonNull Context arg13, @Nullable AttributeSet arg14, int arg15) {
        TypedArray v4;
        super(arg13, arg14, arg15);
        this.mObserver = new RecyclerViewDataObserver(this);
        this.mRecycler = new Recycler(this);
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new androidx.recyclerview.widget.RecyclerView$1(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new EdgeEffectFactory();
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        int v1 = -1;
        this.mScrollPointerId = v1;
        this.mScaledHorizontalScrollFactor = 1.401298E-45f;
        this.mScaledVerticalScrollFactor = 1.401298E-45f;
        boolean v2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger(this);
        LayoutPrefetchRegistryImpl v3 = RecyclerView.ALLOW_THREAD_GAP_WORK ? new LayoutPrefetchRegistryImpl() : null;
        this.mPrefetchRegistry = v3;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener(this);
        this.mPostedAnimatorRunner = false;
        int v3_1 = 2;
        this.mMinMaxLayoutPositions = new int[v3_1];
        this.mScrollOffset = new int[v3_1];
        this.mScrollConsumed = new int[v3_1];
        this.mNestedOffsets = new int[v3_1];
        this.mScrollStepConsumed = new int[v3_1];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new androidx.recyclerview.widget.RecyclerView$2(this);
        this.mViewInfoProcessCallback = new androidx.recyclerview.widget.RecyclerView$4(this);
        if(arg14 != null) {
            v4 = arg13.obtainStyledAttributes(arg14, RecyclerView.CLIP_TO_PADDING_ATTR, arg15, 0);
            this.mClipToPadding = v4.getBoolean(0, true);
            v4.recycle();
        }
        else {
            this.mClipToPadding = true;
        }

        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        ViewConfiguration v4_1 = ViewConfiguration.get(arg13);
        this.mTouchSlop = v4_1.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(v4_1, arg13);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(v4_1, arg13);
        this.mMinFlingVelocity = v4_1.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = v4_1.getScaledMaximumFlingVelocity();
        boolean v3_2 = this.getOverScrollMode() == v3_1 ? true : false;
        this.setWillNotDraw(v3_2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        this.initAdapterManager();
        this.initChildrenHelper();
        this.initAutofill();
        if(ViewCompat.getImportantForAccessibility(((View)this)) == 0) {
            ViewCompat.setImportantForAccessibility(((View)this), 1);
        }

        this.mAccessibilityManager = this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        v3_1 = 0x40000;
        if(arg14 != null) {
            v4 = arg13.obtainStyledAttributes(arg14, R$styleable.RecyclerView, arg15, 0);
            String v8 = v4.getString(R$styleable.RecyclerView_layoutManager);
            if(v4.getInt(R$styleable.RecyclerView_android_descendantFocusability, v1) == v1) {
                this.setDescendantFocusability(v3_1);
            }

            this.mEnableFastScroller = v4.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false);
            if(this.mEnableFastScroller) {
                this.initFastScroller(v4.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable), v4.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable), v4.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable), v4.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
            }

            v4.recycle();
            this.createLayoutManager(arg13, v8, arg14, arg15, 0);
            if(Build$VERSION.SDK_INT < 21) {
                goto label_171;
            }

            TypedArray v13 = arg13.obtainStyledAttributes(arg14, RecyclerView.NESTED_SCROLLING_ATTRS, arg15, 0);
            boolean v14 = v13.getBoolean(0, true);
            v13.recycle();
            v2 = v14;
        }
        else {
            this.setDescendantFocusability(v3_1);
        }

    label_171:
        this.setNestedScrollingEnabled(v2);
    }

    void absorbGlows(int arg3, int arg4) {
        if(arg3 < 0) {
            this.ensureLeftGlow();
            this.mLeftGlow.onAbsorb(-arg3);
        }
        else if(arg3 > 0) {
            this.ensureRightGlow();
            this.mRightGlow.onAbsorb(arg3);
        }

        if(arg4 < 0) {
            this.ensureTopGlow();
            this.mTopGlow.onAbsorb(-arg4);
        }
        else if(arg4 > 0) {
            this.ensureBottomGlow();
            this.mBottomGlow.onAbsorb(arg4);
        }

        if(arg3 != 0 || arg4 != 0) {
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    static void access$000(RecyclerView arg0, View arg1, int arg2, ViewGroup$LayoutParams arg3) {
        arg0.attachViewToParent(arg1, arg2, arg3);
    }

    static void access$100(RecyclerView arg0, int arg1) {
        arg0.detachViewFromParent(arg1);
    }

    static boolean access$200(RecyclerView arg0) {
        return arg0.awakenScrollBars();
    }

    static void access$300(RecyclerView arg0, int arg1, int arg2) {
        arg0.setMeasuredDimension(arg1, arg2);
    }

    private void addAnimatingView(ViewHolder arg6) {
        View v0 = arg6.itemView;
        int v1 = v0.getParent() == this ? 1 : 0;
        this.mRecycler.unscrapView(this.getChildViewHolder(v0));
        if(arg6.isTmpDetached()) {
            this.mChildHelper.attachViewToParent(v0, -1, v0.getLayoutParams(), true);
        }
        else if(v1 == 0) {
            this.mChildHelper.addView(v0, true);
        }
        else {
            this.mChildHelper.hide(v0);
        }
    }

    public void addFocusables(ArrayList arg2, int arg3, int arg4) {
        if(this.mLayout == null || !this.mLayout.onAddFocusables(this, arg2, arg3, arg4)) {
            super.addFocusables(arg2, arg3, arg4);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration arg2) {
        this.addItemDecoration(arg2, -1);
    }

    public void addItemDecoration(@NonNull ItemDecoration arg3, int arg4) {
        if(this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }

        if(this.mItemDecorations.isEmpty()) {
            this.setWillNotDraw(false);
        }

        if(arg4 < 0) {
            this.mItemDecorations.add(arg3);
        }
        else {
            this.mItemDecorations.add(arg4, arg3);
        }

        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener arg2) {
        if(this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }

        this.mOnChildAttachStateListeners.add(arg2);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener arg2) {
        this.mOnItemTouchListeners.add(arg2);
    }

    public void addOnScrollListener(@NonNull OnScrollListener arg2) {
        if(this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }

        this.mScrollListeners.add(arg2);
    }

    void animateAppearance(@NonNull ViewHolder arg2, @Nullable ItemHolderInfo arg3, @NonNull ItemHolderInfo arg4) {
        arg2.setIsRecyclable(false);
        if(this.mItemAnimator.animateAppearance(arg2, arg3, arg4)) {
            this.postAnimationRunner();
        }
    }

    private void animateChange(@NonNull ViewHolder arg2, @NonNull ViewHolder arg3, @NonNull ItemHolderInfo arg4, @NonNull ItemHolderInfo arg5, boolean arg6, boolean arg7) {
        arg2.setIsRecyclable(false);
        if(arg6) {
            this.addAnimatingView(arg2);
        }

        if(arg2 != arg3) {
            if(arg7) {
                this.addAnimatingView(arg3);
            }

            arg2.mShadowedHolder = arg3;
            this.addAnimatingView(arg2);
            this.mRecycler.unscrapView(arg2);
            arg3.setIsRecyclable(false);
            arg3.mShadowingHolder = arg2;
        }

        if(this.mItemAnimator.animateChange(arg2, arg3, arg4, arg5)) {
            this.postAnimationRunner();
        }
    }

    void animateDisappearance(@NonNull ViewHolder arg2, @NonNull ItemHolderInfo arg3, @Nullable ItemHolderInfo arg4) {
        this.addAnimatingView(arg2);
        arg2.setIsRecyclable(false);
        if(this.mItemAnimator.animateDisappearance(arg2, arg3, arg4)) {
            this.postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String arg3) {
        if(!this.isComputingLayout()) {
            if(arg3 == null) {
                StringBuilder v0 = new StringBuilder();
                v0.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
                v0.append(this.exceptionLabel());
                throw new IllegalStateException(v0.toString());
            }

            StringBuilder v1 = new StringBuilder();
            v1.append(arg3);
            v1.append(this.exceptionLabel());
            throw new IllegalStateException(v1.toString());
        }
    }

    void assertNotInLayoutOrScroll(String arg5) {
        if(this.isComputingLayout()) {
            if(arg5 == null) {
                StringBuilder v0 = new StringBuilder();
                v0.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                v0.append(this.exceptionLabel());
                throw new IllegalStateException(v0.toString());
            }

            throw new IllegalStateException(arg5);
        }

        if(this.mDispatchScrollCounter > 0) {
            StringBuilder v2 = new StringBuilder();
            v2.append("");
            v2.append(this.exceptionLabel());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(v2.toString()));
        }
    }

    boolean canReuseUpdatedViewHolder(ViewHolder arg3) {
        boolean v3 = this.mItemAnimator == null || (this.mItemAnimator.canReuseUpdatedViewHolder(arg3, arg3.getUnmodifiedPayloads())) ? true : false;
        return v3;
    }

    private void cancelTouch() {
        this.resetTouch();
        this.setScrollState(0);
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg2) {
        boolean v2 = !(arg2 instanceof LayoutParams) || !this.mLayout.checkLayoutParams(((LayoutParams)arg2)) ? false : true;
        return v2;
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder arg3) {
        Object v1;
        if(arg3.mNestedRecyclerView != null) {
            Object v0 = arg3.mNestedRecyclerView.get();
            while(true) {
                v1 = null;
                if(v0 == null) {
                    break;
                }
                else if(v0 == arg3.itemView) {
                    return;
                }
                else {
                    ViewParent v0_1 = ((View)v0_1).getParent();
                    if((v0_1 instanceof View)) {
                    }
                    else {
                        v0 = v1;
                    }

                    continue;
                }

                return;
            }

            arg3.mNestedRecyclerView = ((WeakReference)v1);
        }
    }

    void clearOldPositions() {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v1));
            if(!v2.shouldIgnore()) {
                v2.clearOldPosition();
            }
        }

        this.mRecycler.clearOldPositions();
    }

    public void clearOnChildAttachStateChangeListeners() {
        if(this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.clear();
        }
    }

    public void clearOnScrollListeners() {
        if(this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollHorizontally()) {
            v1 = this.mLayout.computeHorizontalScrollExtent(this.mState);
        }

        return v1;
    }

    public int computeHorizontalScrollOffset() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollHorizontally()) {
            v1 = this.mLayout.computeHorizontalScrollOffset(this.mState);
        }

        return v1;
    }

    public int computeHorizontalScrollRange() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollHorizontally()) {
            v1 = this.mLayout.computeHorizontalScrollRange(this.mState);
        }

        return v1;
    }

    public int computeVerticalScrollExtent() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollVertically()) {
            v1 = this.mLayout.computeVerticalScrollExtent(this.mState);
        }

        return v1;
    }

    public int computeVerticalScrollOffset() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollVertically()) {
            v1 = this.mLayout.computeVerticalScrollOffset(this.mState);
        }

        return v1;
    }

    public int computeVerticalScrollRange() {
        int v1 = 0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayout.canScrollVertically()) {
            v1 = this.mLayout.computeVerticalScrollRange(this.mState);
        }

        return v1;
    }

    void considerReleasingGlowsOnScroll(int arg3, int arg4) {
        boolean v0;
        int v0_1;
        if(this.mLeftGlow == null || (this.mLeftGlow.isFinished()) || arg3 <= 0) {
            v0_1 = 0;
        }
        else {
            this.mLeftGlow.onRelease();
            v0 = this.mLeftGlow.isFinished();
        }

        if(this.mRightGlow != null && !this.mRightGlow.isFinished() && arg3 < 0) {
            this.mRightGlow.onRelease();
            v0_1 = (((int)v0)) | this.mRightGlow.isFinished();
        }

        if(this.mTopGlow != null && !this.mTopGlow.isFinished() && arg4 > 0) {
            this.mTopGlow.onRelease();
            v0_1 = (((int)v0)) | this.mTopGlow.isFinished();
        }

        if(this.mBottomGlow != null && !this.mBottomGlow.isFinished() && arg4 < 0) {
            this.mBottomGlow.onRelease();
            v0_1 = (((int)v0)) | this.mBottomGlow.isFinished();
        }

        if(v0) {
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    void consumePendingUpdateOperations() {
        if(this.mFirstLayoutComplete) {
            if(this.mDataSetHasChangedAfterLayout) {
            }
            else if(!this.mAdapterHelper.hasPendingUpdates()) {
                return;
            }
            else {
                if(!this.mAdapterHelper.hasAnyUpdateTypes(4) || (this.mAdapterHelper.hasAnyUpdateTypes(11))) {
                    if(!this.mAdapterHelper.hasPendingUpdates()) {
                        return;
                    }

                    TraceCompat.beginSection("RV FullInvalidate");
                    this.dispatchLayout();
                    TraceCompat.endSection();
                }
                else {
                    TraceCompat.beginSection("RV PartialInvalidate");
                    this.startInterceptRequestLayout();
                    this.onEnterLayoutOrScroll();
                    this.mAdapterHelper.preProcess();
                    if(!this.mLayoutWasDefered) {
                        if(this.hasUpdatedView()) {
                            this.dispatchLayout();
                        }
                        else {
                            this.mAdapterHelper.consumePostponedUpdates();
                        }
                    }

                    this.stopInterceptRequestLayout(true);
                    this.onExitLayoutOrScroll();
                    TraceCompat.endSection();
                }

                return;
            }
        }

        TraceCompat.beginSection("RV FullInvalidate");
        this.dispatchLayout();
        TraceCompat.endSection();
    }

    private void createLayoutManager(Context arg7, String arg8, AttributeSet arg9, int arg10, int arg11) {
        StringBuilder v11;
        Object[] v1;
        Constructor v4;
        Class v0_1;
        if(arg8 != null) {
            arg8 = arg8.trim();
            if(arg8.isEmpty()) {
                return;
            }

            arg8 = this.getFullClassName(arg7, arg8);
            try {
                ClassLoader v0 = this.isInEditMode() ? this.getClass().getClassLoader() : arg7.getClassLoader();
                v0_1 = v0.loadClass(arg8).asSubclass(LayoutManager.class);
            }
            catch(ClassNotFoundException v7) {
                goto label_102;
            }
            catch(InvocationTargetException v7_1) {
                goto label_90;
            }
            catch(InstantiationException v7_2) {
                goto label_78;
            }
            catch(IllegalAccessException v7_3) {
                goto label_66;
            }
            catch(ClassCastException v7_4) {
                goto label_54;
            }

            try {
                v4 = v0_1.getConstructor(RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                v1 = new Object[]{arg7, arg9, Integer.valueOf(arg10), Integer.valueOf(arg11)};
                goto label_34;
            }
            catch(ClassCastException v7_4) {
            }
            catch(IllegalAccessException v7_3) {
            }
            catch(InstantiationException v7_2) {
            }
            catch(InvocationTargetException v7_1) {
            }
            catch(ClassNotFoundException v7) {
            }
            catch(NoSuchMethodException v7_5) {
                try {
                    v4 = v0_1.getConstructor();
                    goto label_34;
                }
                catch(ClassCastException v7_4) {
                }
                catch(IllegalAccessException v7_3) {
                }
                catch(InstantiationException v7_2) {
                }
                catch(InvocationTargetException v7_1) {
                }
                catch(ClassNotFoundException v7) {
                }
                catch(NoSuchMethodException v10) {
                    try {
                        v10.initCause(((Throwable)v7_5));
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Error creating LayoutManager ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v10));
                    label_34:
                        v4.setAccessible(true);
                        this.setLayoutManager(v4.newInstance(v1));
                    }
                    catch(ClassCastException v7_4) {
                    label_54:
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Class is not a LayoutManager ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v7_4));
                    }
                    catch(IllegalAccessException v7_3) {
                    label_66:
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Cannot access non-public constructor ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v7_3));
                    }
                    catch(InstantiationException v7_2) {
                    label_78:
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Could not instantiate the LayoutManager: ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v7_2));
                    }
                    catch(InvocationTargetException v7_1) {
                    label_90:
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Could not instantiate the LayoutManager: ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v7_1));
                    }
                    catch(ClassNotFoundException v7) {
                    label_102:
                        v11 = new StringBuilder();
                        v11.append(arg9.getPositionDescription());
                        v11.append(": Unable to find LayoutManager ");
                        v11.append(arg8);
                        throw new IllegalStateException(v11.toString(), ((Throwable)v7));
                    }
                }
            }
        }
    }

    void defaultOnMeasure(int arg3, int arg4) {
        this.setMeasuredDimension(LayoutManager.chooseSize(arg3, this.getPaddingLeft() + this.getPaddingRight(), ViewCompat.getMinimumWidth(((View)this))), LayoutManager.chooseSize(arg4, this.getPaddingTop() + this.getPaddingBottom(), ViewCompat.getMinimumHeight(((View)this))));
    }

    private boolean didChildRangeChange(int arg4, int arg5) {
        this.findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        boolean v1 = false;
        if(this.mMinMaxLayoutPositions[0] != arg4 || this.mMinMaxLayoutPositions[1] != arg5) {
            v1 = true;
        }

        return v1;
    }

    void dispatchChildAttached(View arg3) {
        ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
        this.onChildAttachedToWindow(arg3);
        if(this.mAdapter != null && v0 != null) {
            this.mAdapter.onViewAttachedToWindow(v0);
        }

        if(this.mOnChildAttachStateListeners != null) {
            int v0_1;
            for(v0_1 = this.mOnChildAttachStateListeners.size() - 1; v0_1 >= 0; --v0_1) {
                this.mOnChildAttachStateListeners.get(v0_1).onChildViewAttachedToWindow(arg3);
            }
        }
    }

    void dispatchChildDetached(View arg3) {
        ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
        this.onChildDetachedFromWindow(arg3);
        if(this.mAdapter != null && v0 != null) {
            this.mAdapter.onViewDetachedFromWindow(v0);
        }

        if(this.mOnChildAttachStateListeners != null) {
            int v0_1;
            for(v0_1 = this.mOnChildAttachStateListeners.size() - 1; v0_1 >= 0; --v0_1) {
                this.mOnChildAttachStateListeners.get(v0_1).onChildViewDetachedFromWindow(arg3);
            }
        }
    }

    private void dispatchContentChangedIfNecessary() {
        int v0 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if(v0 != 0 && (this.isAccessibilityEnabled())) {
            AccessibilityEvent v1 = AccessibilityEvent.obtain();
            v1.setEventType(0x800);
            AccessibilityEventCompat.setContentChangeTypes(v1, v0);
            this.sendAccessibilityEventUnchecked(v1);
        }
    }

    void dispatchLayout() {
        if(this.mAdapter == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }

        if(this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }

        this.mState.mIsMeasuring = false;
        if(this.mState.mLayoutStep == 1) {
            this.dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            this.dispatchLayoutStep2();
        }
        else {
            if(!this.mAdapterHelper.hasUpdates() && this.mLayout.getWidth() == this.getWidth()) {
                if(this.mLayout.getHeight() != this.getHeight()) {
                }
                else {
                    this.mLayout.setExactMeasureSpecsFrom(this);
                    goto label_42;
                }
            }

            this.mLayout.setExactMeasureSpecsFrom(this);
            this.dispatchLayoutStep2();
        }

    label_42:
        this.dispatchLayoutStep3();
    }

    private void dispatchLayoutStep1() {
        int v0_1;
        boolean v1 = true;
        this.mState.assertLayoutStep(1);
        this.fillRemainingScrollValues(this.mState);
        this.mState.mIsMeasuring = false;
        this.startInterceptRequestLayout();
        this.mViewInfoStore.clear();
        this.onEnterLayoutOrScroll();
        this.processAdapterUpdatesAndSetAnimationFlags();
        this.saveFocusInfo();
        State v0 = this.mState;
        if(!this.mState.mRunSimpleAnimations || !this.mItemsChanged) {
            v1 = false;
        }
        else {
        }

        v0.mTrackOldChangeHolders = v1;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        this.mState.mInPreLayout = this.mState.mRunPredictiveAnimations;
        this.mState.mItemCount = this.mAdapter.getItemCount();
        this.findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if(this.mState.mRunSimpleAnimations) {
            v0_1 = this.mChildHelper.getChildCount();
            int v1_1;
            for(v1_1 = 0; v1_1 < v0_1; ++v1_1) {
                ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v1_1));
                if(!v3.shouldIgnore() && (!v3.isInvalid() || (this.mAdapter.hasStableIds()))) {
                    this.mViewInfoStore.addToPreLayout(v3, this.mItemAnimator.recordPreLayoutInformation(this.mState, v3, ItemAnimator.buildAdapterChangeFlagsForAnimations(v3), v3.getUnmodifiedPayloads()));
                    if(!this.mState.mTrackOldChangeHolders) {
                        goto label_74;
                    }

                    if(!v3.isUpdated()) {
                        goto label_74;
                    }

                    if(v3.isRemoved()) {
                        goto label_74;
                    }

                    if(v3.shouldIgnore()) {
                        goto label_74;
                    }

                    if(v3.isInvalid()) {
                        goto label_74;
                    }

                    this.mViewInfoStore.addToOldChangeHolders(this.getChangedHolderKey(v3), v3);
                }

            label_74:
            }
        }

        if(this.mState.mRunPredictiveAnimations) {
            this.saveOldPositions();
            boolean v0_2 = this.mState.mStructureChanged;
            this.mState.mStructureChanged = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.mStructureChanged = v0_2;
            for(v0_1 = 0; v0_1 < this.mChildHelper.getChildCount(); ++v0_1) {
                ViewHolder v1_2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v0_1));
                if(v1_2.shouldIgnore()) {
                }
                else if(!this.mViewInfoStore.isInPreLayout(v1_2)) {
                    int v3_1 = ItemAnimator.buildAdapterChangeFlagsForAnimations(v1_2);
                    boolean v4 = v1_2.hasAnyOfTheFlags(0x2000);
                    if(!v4) {
                        v3_1 |= 0x1000;
                    }

                    ItemHolderInfo v3_2 = this.mItemAnimator.recordPreLayoutInformation(this.mState, v1_2, v3_1, v1_2.getUnmodifiedPayloads());
                    if(v4) {
                        this.recordAnimationInfoIfBouncedHiddenView(v1_2, v3_2);
                        goto label_117;
                    }

                    this.mViewInfoStore.addToAppearedInPreLayoutHolders(v1_2, v3_2);
                }

            label_117:
            }

            this.clearOldPositions();
        }
        else {
            this.clearOldPositions();
        }

        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mState.mLayoutStep = 2;
    }

    private void dispatchLayoutStep2() {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.assertLayoutStep(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        this.mState.mItemCount = this.mAdapter.getItemCount();
        this.mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        this.mState.mInPreLayout = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.mStructureChanged = false;
        this.mPendingSavedState = null;
        State v0 = this.mState;
        boolean v2 = !this.mState.mRunSimpleAnimations || this.mItemAnimator == null ? false : true;
        v0.mRunSimpleAnimations = v2;
        this.mState.mLayoutStep = 4;
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.assertLayoutStep(4);
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.mLayoutStep = 1;
        if(this.mState.mRunSimpleAnimations) {
            int v0;
            for(v0 = this.mChildHelper.getChildCount() - 1; v0 >= 0; --v0) {
                ViewHolder v5 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v0));
                if(v5.shouldIgnore()) {
                }
                else {
                    long v2 = this.getChangedHolderKey(v5);
                    ItemHolderInfo v4 = this.mItemAnimator.recordPostLayoutInformation(this.mState, v5);
                    ViewHolder v6 = this.mViewInfoStore.getFromOldChangeHolders(v2);
                    if(v6 != null && !v6.shouldIgnore()) {
                        boolean v8 = this.mViewInfoStore.isDisappearing(v6);
                        boolean v9 = this.mViewInfoStore.isDisappearing(v5);
                        if((v8) && v6 == v5) {
                            this.mViewInfoStore.addToPostLayout(v5, v4);
                            goto label_56;
                        }

                        ItemHolderInfo v7 = this.mViewInfoStore.popFromPreLayout(v6);
                        this.mViewInfoStore.addToPostLayout(v5, v4);
                        ItemHolderInfo v10 = this.mViewInfoStore.popFromPostLayout(v5);
                        if(v7 == null) {
                            this.handleMissingPreInfoForChangeError(v2, v5, v6);
                            goto label_56;
                        }

                        this.animateChange(v6, v5, v7, v10, v8, v9);
                        goto label_56;
                    }

                    this.mViewInfoStore.addToPostLayout(v5, v4);
                }

            label_56:
            }

            this.mViewInfoStore.process(this.mViewInfoProcessCallback);
        }

        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        this.mState.mPreviousLayoutItemCount = this.mState.mItemCount;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.mRunSimpleAnimations = false;
        this.mState.mRunPredictiveAnimations = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if(this.mRecycler.mChangedScrap != null) {
            this.mRecycler.mChangedScrap.clear();
        }

        if(this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.updateViewCacheSize();
        }

        this.mLayout.onLayoutCompleted(this.mState);
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mViewInfoStore.clear();
        if(this.didChildRangeChange(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            this.dispatchOnScrolled(0, 0);
        }

        this.recoverFocusFromState();
        this.resetFocusInfo();
    }

    public boolean dispatchNestedFling(float arg2, float arg3, boolean arg4) {
        return this.getScrollingChildHelper().dispatchNestedFling(arg2, arg3, arg4);
    }

    public boolean dispatchNestedPreFling(float arg2, float arg3) {
        return this.getScrollingChildHelper().dispatchNestedPreFling(arg2, arg3);
    }

    public boolean dispatchNestedPreScroll(int arg2, int arg3, int[] arg4, int[] arg5) {
        return this.getScrollingChildHelper().dispatchNestedPreScroll(arg2, arg3, arg4, arg5);
    }

    public boolean dispatchNestedPreScroll(int arg7, int arg8, int[] arg9, int[] arg10, int arg11) {
        return this.getScrollingChildHelper().dispatchNestedPreScroll(arg7, arg8, arg9, arg10, arg11);
    }

    public boolean dispatchNestedScroll(int arg7, int arg8, int arg9, int arg10, int[] arg11) {
        return this.getScrollingChildHelper().dispatchNestedScroll(arg7, arg8, arg9, arg10, arg11);
    }

    public boolean dispatchNestedScroll(int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13) {
        return this.getScrollingChildHelper().dispatchNestedScroll(arg8, arg9, arg10, arg11, arg12, arg13);
    }

    private boolean dispatchOnItemTouch(MotionEvent arg7) {
        int v0 = arg7.getAction();
        if(this.mActiveOnItemTouchListener != null) {
            OnItemTouchListener v1 = null;
            if(v0 == 0) {
                this.mActiveOnItemTouchListener = v1;
            }
            else {
                this.mActiveOnItemTouchListener.onTouchEvent(this, arg7);
                if(v0 == 3 || v0 == 1) {
                    this.mActiveOnItemTouchListener = v1;
                }

                return 1;
            }
        }

        if(v0 != 0) {
            v0 = this.mOnItemTouchListeners.size();
            int v3 = 0;
            while(v3 < v0) {
                Object v4 = this.mOnItemTouchListeners.get(v3);
                if(((OnItemTouchListener)v4).onInterceptTouchEvent(this, arg7)) {
                    this.mActiveOnItemTouchListener = ((OnItemTouchListener)v4);
                    return 1;
                }
                else {
                    ++v3;
                    continue;
                }

                return 0;
            }
        }

        return 0;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent arg8) {
        int v0 = arg8.getAction();
        int v1 = 3;
        if(v0 == v1 || v0 == 0) {
            this.mActiveOnItemTouchListener = null;
        }

        int v2 = this.mOnItemTouchListeners.size();
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            Object v5 = this.mOnItemTouchListeners.get(v4);
            if((((OnItemTouchListener)v5).onInterceptTouchEvent(this, arg8)) && v0 != v1) {
                this.mActiveOnItemTouchListener = ((OnItemTouchListener)v5);
                return 1;
            }
        }

        return 0;
    }

    void dispatchOnScrollStateChanged(int arg3) {
        if(this.mLayout != null) {
            this.mLayout.onScrollStateChanged(arg3);
        }

        this.onScrollStateChanged(arg3);
        if(this.mScrollListener != null) {
            this.mScrollListener.onScrollStateChanged(this, arg3);
        }

        if(this.mScrollListeners != null) {
            int v0;
            for(v0 = this.mScrollListeners.size() - 1; v0 >= 0; --v0) {
                this.mScrollListeners.get(v0).onScrollStateChanged(this, arg3);
            }
        }
    }

    void dispatchOnScrolled(int arg3, int arg4) {
        ++this.mDispatchScrollCounter;
        int v0 = this.getScrollX();
        int v1 = this.getScrollY();
        this.onScrollChanged(v0, v1, v0, v1);
        this.onScrolled(arg3, arg4);
        if(this.mScrollListener != null) {
            this.mScrollListener.onScrolled(this, arg3, arg4);
        }

        if(this.mScrollListeners != null) {
            for(v0 = this.mScrollListeners.size() - 1; v0 >= 0; --v0) {
                this.mScrollListeners.get(v0).onScrolled(this, arg3, arg4);
            }
        }

        --this.mDispatchScrollCounter;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int v0;
        for(v0 = this.mPendingAccessibilityImportanceChange.size() - 1; v0 >= 0; --v0) {
            Object v1 = this.mPendingAccessibilityImportanceChange.get(v0);
            if(((ViewHolder)v1).itemView.getParent() == this) {
                if(((ViewHolder)v1).shouldIgnore()) {
                }
                else {
                    int v2 = ((ViewHolder)v1).mPendingAccessibilityState;
                    int v3 = -1;
                    if(v2 != v3) {
                        ViewCompat.setImportantForAccessibility(((ViewHolder)v1).itemView, v2);
                        ((ViewHolder)v1).mPendingAccessibilityState = v3;
                    }
                }
            }
        }

        this.mPendingAccessibilityImportanceChange.clear();
    }

    protected void dispatchRestoreInstanceState(SparseArray arg1) {
        this.dispatchThawSelfOnly(arg1);
    }

    protected void dispatchSaveInstanceState(SparseArray arg1) {
        this.dispatchFreezeSelfOnly(arg1);
    }

    public void draw(Canvas arg8) {
        int v4;
        int v3;
        super.draw(arg8);
        int v0 = this.mItemDecorations.size();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            this.mItemDecorations.get(v2).onDrawOver(arg8, this, this.mState);
        }

        if(this.mLeftGlow == null || (this.mLeftGlow.isFinished())) {
            v3 = 0;
        }
        else {
            v0 = arg8.save();
            v3 = this.mClipToPadding ? this.getPaddingBottom() : 0;
            arg8.rotate(270f);
            arg8.translate(((float)(-this.getHeight() + v3)), 0f);
            v3 = this.mLeftGlow == null || !this.mLeftGlow.draw(arg8) ? 0 : 1;
            arg8.restoreToCount(v0);
        }

        if(this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            v0 = arg8.save();
            if(this.mClipToPadding) {
                arg8.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }

            v4 = this.mTopGlow == null || !this.mTopGlow.draw(arg8) ? 0 : 1;
            v3 |= v4;
            arg8.restoreToCount(v0);
        }

        if(this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            v0 = arg8.save();
            v4 = this.getWidth();
            int v5 = this.mClipToPadding ? this.getPaddingTop() : 0;
            arg8.rotate(90f);
            arg8.translate(((float)(-v5)), ((float)(-v4)));
            v4 = this.mRightGlow == null || !this.mRightGlow.draw(arg8) ? 0 : 1;
            v3 |= v4;
            arg8.restoreToCount(v0);
        }

        if(this.mBottomGlow == null || (this.mBottomGlow.isFinished())) {
            v1 = v3;
        }
        else {
            v0 = arg8.save();
            arg8.rotate(180f);
            if(this.mClipToPadding) {
                arg8.translate(((float)(-this.getWidth() + this.getPaddingRight())), ((float)(-this.getHeight() + this.getPaddingBottom())));
            }
            else {
                arg8.translate(((float)(-this.getWidth())), ((float)(-this.getHeight())));
            }

            if(this.mBottomGlow != null && (this.mBottomGlow.draw(arg8))) {
                v1 = 1;
            }

            v1 |= v3;
            arg8.restoreToCount(v0);
        }

        if(v1 == 0 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && (this.mItemAnimator.isRunning())) {
            v1 = 1;
        }

        if(v1 != 0) {
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    public boolean drawChild(Canvas arg1, View arg2, long arg3) {
        return super.drawChild(arg1, arg2, arg3);
    }

    void ensureBottomGlow() {
        if(this.mBottomGlow != null) {
            return;
        }

        this.mBottomGlow = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        if(this.mClipToPadding) {
            this.mBottomGlow.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
        }
        else {
            this.mBottomGlow.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if(this.mLeftGlow != null) {
            return;
        }

        this.mLeftGlow = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        if(this.mClipToPadding) {
            this.mLeftGlow.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
        }
        else {
            this.mLeftGlow.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if(this.mRightGlow != null) {
            return;
        }

        this.mRightGlow = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        if(this.mClipToPadding) {
            this.mRightGlow.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
        }
        else {
            this.mRightGlow.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if(this.mTopGlow != null) {
            return;
        }

        this.mTopGlow = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        if(this.mClipToPadding) {
            this.mTopGlow.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
        }
        else {
            this.mTopGlow.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + this.getContext();
    }

    final void fillRemainingScrollValues(State arg4) {
        if(this.getScrollState() == 2) {
            OverScroller v0 = this.mViewFlinger.mScroller;
            arg4.mRemainingScrollHorizontal = v0.getFinalX() - v0.getCurrX();
            arg4.mRemainingScrollVertical = v0.getFinalY() - v0.getCurrY();
        }
        else {
            arg4.mRemainingScrollHorizontal = 0;
            arg4.mRemainingScrollVertical = 0;
        }
    }

    @Nullable public View findChildViewUnder(float arg6, float arg7) {
        int v0;
        for(v0 = this.mChildHelper.getChildCount() - 1; v0 >= 0; --v0) {
            View v1 = this.mChildHelper.getChildAt(v0);
            float v2 = v1.getTranslationX();
            float v3 = v1.getTranslationY();
            if(arg6 >= (((float)v1.getLeft())) + v2 && arg6 <= (((float)v1.getRight())) + v2 && arg7 >= (((float)v1.getTop())) + v3 && arg7 <= (((float)v1.getBottom())) + v3) {
                return v1;
            }
        }

        return null;
    }

    @Nullable public View findContainingItemView(@NonNull View arg3) {
        ViewParent v0;
        for(v0 = arg3.getParent(); v0 != null; v0 = ((View)v3).getParent()) {
            if((((RecyclerView)v0)) == this) {
                break;
            }

            if(!(v0 instanceof View)) {
                break;
            }

            ViewParent v3 = v0;
        }

        if((((RecyclerView)v0)) == this) {
        }
        else {
            arg3 = null;
        }

        return arg3;
    }

    @Nullable public ViewHolder findContainingViewHolder(@NonNull View arg1) {
        arg1 = this.findContainingItemView(arg1);
        ViewHolder v1 = arg1 == null ? null : this.getChildViewHolder(arg1);
        return v1;
    }

    private void findMinMaxChildLayoutPositions(int[] arg9) {
        int v0 = this.mChildHelper.getChildCount();
        if(v0 == 0) {
            arg9[0] = -1;
            arg9[1] = -1;
            return;
        }

        int v3 = 0;
        int v4 = 0x7FFFFFFF;
        int v5 = 0x80000000;
        while(v3 < v0) {
            ViewHolder v6 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v3));
            if(v6.shouldIgnore()) {
            }
            else {
                int v6_1 = v6.getLayoutPosition();
                if(v6_1 < v4) {
                    v4 = v6_1;
                }

                if(v6_1 <= v5) {
                    goto label_26;
                }

                v5 = v6_1;
            }

        label_26:
            ++v3;
        }

        arg9[0] = v4;
        arg9[1] = v5;
    }

    @Nullable static RecyclerView findNestedRecyclerView(@NonNull View arg4) {
        RecyclerView v1 = null;
        if(!(arg4 instanceof ViewGroup)) {
            return v1;
        }

        if((arg4 instanceof RecyclerView)) {
            return arg4;
        }

        int v0 = ((ViewGroup)arg4).getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            RecyclerView v3 = RecyclerView.findNestedRecyclerView(((ViewGroup)arg4).getChildAt(v2));
            if(v3 != null) {
                return v3;
            }
        }

        return v1;
    }

    @Nullable private View findNextViewToFocus() {
        View v1_1;
        int v0 = this.mState.mFocusedItemPosition != -1 ? this.mState.mFocusedItemPosition : 0;
        int v1 = this.mState.getItemCount();
        int v2 = v0;
        while(v2 < v1) {
            ViewHolder v3 = this.findViewHolderForAdapterPosition(v2);
            if(v3 == null) {
            }
            else if(v3.itemView.hasFocusable()) {
                return v3.itemView;
            }
            else {
                ++v2;
                continue;
            }

            break;
        }

        for(v0 = Math.min(v1, v0) - 1; true; --v0) {
            v1_1 = null;
            if(v0 < 0) {
                return v1_1;
            }

            ViewHolder v2_1 = this.findViewHolderForAdapterPosition(v0);
            if(v2_1 == null) {
                return v1_1;
            }

            if(v2_1.itemView.hasFocusable()) {
                return v2_1.itemView;
            }
        }

        return v1_1;
    }

    @Nullable public ViewHolder findViewHolderForAdapterPosition(int arg6) {
        ViewHolder v1 = null;
        if(this.mDataSetHasChangedAfterLayout) {
            return v1;
        }

        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v2));
            if(v3 != null && !v3.isRemoved() && this.getAdapterPositionFor(v3) == arg6) {
                if(this.mChildHelper.isHidden(v3.itemView)) {
                    v1 = v3;
                }
                else {
                    return v3;
                }
            }
        }

        return v1;
    }

    public ViewHolder findViewHolderForItemId(long arg7) {
        ViewHolder v1 = null;
        if(this.mAdapter != null) {
            if(!this.mAdapter.hasStableIds()) {
            }
            else {
                int v0 = this.mChildHelper.getUnfilteredChildCount();
                int v2;
                for(v2 = 0; v2 < v0; ++v2) {
                    ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v2));
                    if(v3 != null && !v3.isRemoved() && v3.getItemId() == arg7) {
                        if(this.mChildHelper.isHidden(v3.itemView)) {
                            v1 = v3;
                        }
                        else {
                            return v3;
                        }
                    }
                }

                return v1;
            }
        }

        return v1;
    }

    @Nullable public ViewHolder findViewHolderForLayoutPosition(int arg2) {
        return this.findViewHolderForPosition(arg2, false);
    }

    @Nullable ViewHolder findViewHolderForPosition(int arg6, boolean arg7) {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        ViewHolder v1 = null;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v2));
            if(v3 != null && !v3.isRemoved()) {
                if(arg7) {
                    if(v3.mPosition != arg6) {
                        goto label_25;
                    }
                }
                else if(v3.getLayoutPosition() != arg6) {
                    goto label_25;
                }

                if(this.mChildHelper.isHidden(v3.itemView)) {
                    v1 = v3;
                    goto label_25;
                }

                return v3;
            }

        label_25:
        }

        return v1;
    }

    @Nullable @Deprecated public ViewHolder findViewHolderForPosition(int arg2) {
        return this.findViewHolderForPosition(arg2, false);
    }

    public boolean fling(int arg8, int arg9) {
        int v1 = 0;
        if(this.mLayout == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return 0;
        }

        if(this.mLayoutFrozen) {
            return 0;
        }

        boolean v0 = this.mLayout.canScrollHorizontally();
        boolean v2 = this.mLayout.canScrollVertically();
        if(0 == 0 && 0 == 0) {
            return 0;
        }

        float v3 = ((float)0);
        float v4 = ((float)0);
        if(!this.dispatchNestedPreFling(v3, v4)) {
            boolean v6 = (v0) || (v2) ? true : false;
            this.dispatchNestedFling(v3, v4, v6);
            if(this.mOnFlingListener != null && (this.mOnFlingListener.onFling(0, 0))) {
                return 1;
            }

            if(!v6) {
                return 0;
            }

            if(v0) {
                v1 = 1;
            }

            if(v2) {
                v1 |= 2;
            }

            this.startNestedScroll(v1, 1);
            this.mViewFlinger.fling(Math.max(-this.mMaxFlingVelocity, Math.min(0, this.mMaxFlingVelocity)), Math.max(-this.mMaxFlingVelocity, Math.min(0, this.mMaxFlingVelocity)));
            return 1;
        }

        return 0;
    }

    public View focusSearch(View arg9, int arg10) {
        int v6;
        View v0 = this.mLayout.onInterceptFocusSearch(arg9, arg10);
        if(v0 != null) {
            return v0;
        }

        int v0_1 = this.mAdapter == null || this.mLayout == null || (this.isComputingLayout()) || (this.mLayoutFrozen) ? 0 : 1;
        FocusFinder v3 = FocusFinder.getInstance();
        View v4 = null;
        if(v0_1 != 0) {
            int v5 = 2;
            if(arg10 != v5 && arg10 != 1) {
                goto label_80;
            }

            if(this.mLayout.canScrollVertically()) {
                v0_1 = arg10 == v5 ? 130 : 33;
                v6 = v3.findNextFocus(((ViewGroup)this), arg9, v0_1) == null ? 1 : 0;
                if(!RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    goto label_40;
                }

                arg10 = v0_1;
            }
            else {
                v6 = 0;
            }

        label_40:
            if(v6 == 0 && (this.mLayout.canScrollHorizontally())) {
                v0_1 = this.mLayout.getLayoutDirection() == 1 ? 1 : 0;
                v5 = arg10 == v5 ? 1 : 0;
                v0_1 = (v0_1 ^ v5) != 0 ? 66 : 17;
                v6 = v3.findNextFocus(((ViewGroup)this), arg9, v0_1) == null ? 1 : 0;
                if(!RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    goto label_67;
                }

                arg10 = v0_1;
            }

        label_67:
            if(v6 != 0) {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(arg9) == null) {
                    return v4;
                }
                else {
                    this.startInterceptRequestLayout();
                    this.mLayout.onFocusSearchFailed(arg9, arg10, this.mRecycler, this.mState);
                    this.stopInterceptRequestLayout(false);
                }
            }

            v0 = v3.findNextFocus(((ViewGroup)this), arg9, arg10);
        }
        else {
        label_80:
            View v1 = v3.findNextFocus(((ViewGroup)this), arg9, arg10);
            if(v1 == null && v0_1 != 0) {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(arg9) == null) {
                    return v4;
                }
                else {
                    this.startInterceptRequestLayout();
                    v0 = this.mLayout.onFocusSearchFailed(arg9, arg10, this.mRecycler, this.mState);
                    this.stopInterceptRequestLayout(false);
                    goto label_95;
                }
            }

            v0 = v1;
        }

    label_95:
        if(v0 != null && !v0.hasFocusable()) {
            if(this.getFocusedChild() == null) {
                return super.focusSearch(arg9, arg10);
            }
            else {
                this.requestChildOnScreen(v0, v4);
                return arg9;
            }
        }

        if(this.isPreferredNextFocus(arg9, v0, arg10)) {
        }
        else {
            v0 = super.focusSearch(arg9, arg10);
        }

        return v0;
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        if(this.mLayout != null) {
            return this.mLayout.generateDefaultLayoutParams();
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("RecyclerView has no LayoutManager");
        v1.append(this.exceptionLabel());
        throw new IllegalStateException(v1.toString());
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg3) {
        if(this.mLayout != null) {
            return this.mLayout.generateLayoutParams(this.getContext(), arg3);
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("RecyclerView has no LayoutManager");
        v0.append(this.exceptionLabel());
        throw new IllegalStateException(v0.toString());
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg3) {
        if(this.mLayout != null) {
            return this.mLayout.generateLayoutParams(arg3);
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("RecyclerView has no LayoutManager");
        v0.append(this.exceptionLabel());
        throw new IllegalStateException(v0.toString());
    }

    @Nullable public Adapter getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(ViewHolder arg2) {
        if(!arg2.hasAnyOfTheFlags(0x20C)) {
            if(!arg2.isBound()) {
            }
            else {
                return this.mAdapterHelper.applyPendingUpdatesToPosition(arg2.mPosition);
            }
        }

        return -1;
    }

    public int getBaseline() {
        if(this.mLayout != null) {
            return this.mLayout.getBaseline();
        }

        return super.getBaseline();
    }

    long getChangedHolderKey(ViewHolder arg3) {
        long v0 = this.mAdapter.hasStableIds() ? arg3.getItemId() : ((long)arg3.mPosition);
        return v0;
    }

    public int getChildAdapterPosition(@NonNull View arg1) {
        ViewHolder v1 = RecyclerView.getChildViewHolderInt(arg1);
        int v1_1 = v1 != null ? v1.getAdapterPosition() : -1;
        return v1_1;
    }

    protected int getChildDrawingOrder(int arg2, int arg3) {
        if(this.mChildDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(arg2, arg3);
        }

        return this.mChildDrawingOrderCallback.onGetChildDrawingOrder(arg2, arg3);
    }

    public long getChildItemId(@NonNull View arg4) {
        long v1 = -1;
        if(this.mAdapter != null) {
            if(!this.mAdapter.hasStableIds()) {
            }
            else {
                ViewHolder v4 = RecyclerView.getChildViewHolderInt(arg4);
                if(v4 != null) {
                    v1 = v4.getItemId();
                }

                return v1;
            }
        }

        return v1;
    }

    public int getChildLayoutPosition(@NonNull View arg1) {
        ViewHolder v1 = RecyclerView.getChildViewHolderInt(arg1);
        int v1_1 = v1 != null ? v1.getLayoutPosition() : -1;
        return v1_1;
    }

    @Deprecated public int getChildPosition(@NonNull View arg1) {
        return this.getChildAdapterPosition(arg1);
    }

    public ViewHolder getChildViewHolder(@NonNull View arg4) {
        ViewParent v0 = arg4.getParent();
        if(v0 != null) {
            if((((RecyclerView)v0)) == this) {
            }
            else {
                StringBuilder v1 = new StringBuilder();
                v1.append("View ");
                v1.append(arg4);
                v1.append(" is not a direct child of ");
                v1.append(this);
                throw new IllegalArgumentException(v1.toString());
            }
        }

        return RecyclerView.getChildViewHolderInt(arg4);
    }

    static ViewHolder getChildViewHolderInt(View arg0) {
        if(arg0 == null) {
            return null;
        }

        return arg0.getLayoutParams().mViewHolder;
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View arg1, @NonNull Rect arg2) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(arg1, arg2);
    }

    static void getDecoratedBoundsWithMarginsInt(View arg6, Rect arg7) {
        ViewGroup$LayoutParams v0 = arg6.getLayoutParams();
        arg7.set(arg6.getLeft() - ((LayoutParams)v0).mDecorInsets.left - ((LayoutParams)v0).leftMargin, arg6.getTop() - ((LayoutParams)v0).mDecorInsets.top - ((LayoutParams)v0).topMargin, arg6.getRight() + ((LayoutParams)v0).mDecorInsets.right + ((LayoutParams)v0).rightMargin, arg6.getBottom() + ((LayoutParams)v0).mDecorInsets.bottom + ((LayoutParams)v0).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View arg4) {
        int v0;
        for(v0 = arg4.getId(); !arg4.isFocused(); v0 = arg4.getId()) {
            if(!(arg4 instanceof ViewGroup)) {
                return v0;
            }

            if(!arg4.hasFocus()) {
                return v0;
            }

            arg4 = ((ViewGroup)arg4).getFocusedChild();
            if(arg4.getId() == -1) {
                continue;
            }
        }

        return v0;
    }

    @NonNull public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    private String getFullClassName(Context arg3, String arg4) {
        char v1 = '.';
        if(arg4.charAt(0) == v1) {
            return arg3.getPackageName() + arg4;
        }

        if(arg4.contains(".")) {
            return arg4;
        }

        return RecyclerView.class.getPackage().getName() + v1 + arg4;
    }

    @Nullable public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View arg9) {
        ViewGroup$LayoutParams v0 = arg9.getLayoutParams();
        if(!((LayoutParams)v0).mInsetsDirty) {
            return ((LayoutParams)v0).mDecorInsets;
        }

        if((this.mState.isPreLayout()) && ((((LayoutParams)v0).isItemChanged()) || (((LayoutParams)v0).isViewInvalid()))) {
            return ((LayoutParams)v0).mDecorInsets;
        }

        Rect v1 = ((LayoutParams)v0).mDecorInsets;
        v1.set(0, 0, 0, 0);
        int v3 = this.mItemDecorations.size();
        int v4;
        for(v4 = 0; v4 < v3; ++v4) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(v4).getItemOffsets(this.mTempRect, arg9, this, this.mState);
            v1.left += this.mTempRect.left;
            v1.top += this.mTempRect.top;
            v1.right += this.mTempRect.right;
            v1.bottom += this.mTempRect.bottom;
        }

        ((LayoutParams)v0).mInsetsDirty = false;
        return v1;
    }

    @NonNull public ItemDecoration getItemDecorationAt(int arg4) {
        int v0 = this.getItemDecorationCount();
        if(arg4 >= 0 && arg4 < v0) {
            return this.mItemDecorations.get(arg4);
        }

        StringBuilder v2 = new StringBuilder();
        v2.append(arg4);
        v2.append(" is an invalid index for size ");
        v2.append(v0);
        throw new IndexOutOfBoundsException(v2.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }

        return 0;
    }

    @Nullable public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.getRecycledViewPool();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if(this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(((View)this));
        }

        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long arg6, ViewHolder arg8, ViewHolder arg9) {
        StringBuilder v7;
        int v0 = this.mChildHelper.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v1));
            if(v2 == arg8) {
            }
            else if(this.getChangedHolderKey(v2) == arg6) {
                if(this.mAdapter != null && (this.mAdapter.hasStableIds())) {
                    v7 = new StringBuilder();
                    v7.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    v7.append(v2);
                    v7.append(" \n View Holder 2:");
                    v7.append(arg8);
                    v7.append(this.exceptionLabel());
                    throw new IllegalStateException(v7.toString());
                }

                v7 = new StringBuilder();
                v7.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                v7.append(v2);
                v7.append(" \n View Holder 2:");
                v7.append(arg8);
                v7.append(this.exceptionLabel());
                throw new IllegalStateException(v7.toString());
            }
        }

        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + arg9 + " cannot be found but it is necessary for " + arg8 + this.exceptionLabel());
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasNestedScrollingParent(int arg2) {
        return this.getScrollingChildHelper().hasNestedScrollingParent(arg2);
    }

    public boolean hasPendingAdapterUpdates() {
        boolean v0 = !this.mFirstLayoutComplete || (this.mDataSetHasChangedAfterLayout) || (this.mAdapterHelper.hasPendingUpdates()) ? true : false;
        return v0;
    }

    private boolean hasUpdatedView() {
        int v0 = this.mChildHelper.getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(v2));
            if(v3 != null) {
                if(v3.shouldIgnore()) {
                }
                else if(v3.isUpdated()) {
                    return 1;
                }
            }
        }

        return 0;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new androidx.recyclerview.widget.AdapterHelper$Callback() {
            void dispatchUpdate(UpdateOp arg5) {
                int v0 = arg5.cmd;
                if(v0 == 4) {
                    RecyclerView.this.mLayout.onItemsUpdated(RecyclerView.this, arg5.positionStart, arg5.itemCount, arg5.payload);
                }
                else if(v0 != 8) {
                    switch(v0) {
                        case 1: {
                            goto label_14;
                        }
                        case 2: {
                            goto label_7;
                        }
                    }

                    return;
                label_7:
                    RecyclerView.this.mLayout.onItemsRemoved(RecyclerView.this, arg5.positionStart, arg5.itemCount);
                    return;
                label_14:
                    RecyclerView.this.mLayout.onItemsAdded(RecyclerView.this, arg5.positionStart, arg5.itemCount);
                }
                else {
                    RecyclerView.this.mLayout.onItemsMoved(RecyclerView.this, arg5.positionStart, arg5.itemCount, 1);
                }
            }

            public ViewHolder findViewHolder(int arg4) {
                ViewHolder v4 = RecyclerView.this.findViewHolderForPosition(arg4, true);
                ViewHolder v0 = null;
                if(v4 == null) {
                    return v0;
                }

                if(RecyclerView.this.mChildHelper.isHidden(v4.itemView)) {
                    return v0;
                }

                return v4;
            }

            public void markViewHoldersUpdated(int arg2, int arg3, Object arg4) {
                RecyclerView.this.viewRangeUpdate(arg2, arg3, arg4);
                RecyclerView.this.mItemsChanged = true;
            }

            public void offsetPositionsForAdd(int arg2, int arg3) {
                RecyclerView.this.offsetPositionRecordsForInsert(arg2, arg3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            public void offsetPositionsForMove(int arg2, int arg3) {
                RecyclerView.this.offsetPositionRecordsForMove(arg2, arg3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            public void offsetPositionsForRemovingInvisible(int arg3, int arg4) {
                RecyclerView.this.offsetPositionRecordsForRemove(arg3, arg4, true);
                RecyclerView.this.mItemsAddedOrRemoved = true;
                RecyclerView.this.mState.mDeletedInvisibleItemCountSincePreviousLayout += arg4;
            }

            public void offsetPositionsForRemovingLaidOutOrNewView(int arg3, int arg4) {
                RecyclerView.this.offsetPositionRecordsForRemove(arg3, arg4, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            public void onDispatchFirstPass(UpdateOp arg1) {
                this.dispatchUpdate(arg1);
            }

            public void onDispatchSecondPass(UpdateOp arg1) {
                this.dispatchUpdate(arg1);
            }
        });
    }

    @SuppressLint(value={"InlinedApi"}) private void initAutofill() {
        if(ViewCompat.getImportantForAutofill(((View)this)) == 0) {
            ViewCompat.setImportantForAutofill(((View)this), 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new androidx.recyclerview.widget.ChildHelper$Callback() {
            public void addView(View arg2, int arg3) {
                RecyclerView.this.addView(arg2, arg3);
                RecyclerView.this.dispatchChildAttached(arg2);
            }

            public void attachViewToParent(View arg3, int arg4, ViewGroup$LayoutParams arg5) {
                ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
                if(v0 != null) {
                    if(!v0.isTmpDetached()) {
                        if(v0.shouldIgnore()) {
                        }
                        else {
                            StringBuilder v4 = new StringBuilder();
                            v4.append("Called attach on a child which is not detached: ");
                            v4.append(v0);
                            v4.append(RecyclerView.this.exceptionLabel());
                            throw new IllegalArgumentException(v4.toString());
                        }
                    }

                    v0.clearTmpDetachFlag();
                }

                RecyclerView.this.attachViewToParent(arg3, arg4, arg5);
            }

            public void detachViewFromParent(int arg4) {
                View v0 = this.getChildAt(arg4);
                if(v0 != null) {
                    ViewHolder v0_1 = RecyclerView.getChildViewHolderInt(v0);
                    if(v0_1 != null) {
                        if(v0_1.isTmpDetached()) {
                            if(v0_1.shouldIgnore()) {
                            }
                            else {
                                StringBuilder v1 = new StringBuilder();
                                v1.append("called detach on an already detached child ");
                                v1.append(v0_1);
                                v1.append(RecyclerView.this.exceptionLabel());
                                throw new IllegalArgumentException(v1.toString());
                            }
                        }

                        v0_1.addFlags(0x100);
                    }
                }

                RecyclerView.this.detachViewFromParent(arg4);
            }

            public View getChildAt(int arg2) {
                return RecyclerView.this.getChildAt(arg2);
            }

            public int getChildCount() {
                return RecyclerView.this.getChildCount();
            }

            public ViewHolder getChildViewHolder(View arg1) {
                return RecyclerView.getChildViewHolderInt(arg1);
            }

            public int indexOfChild(View arg2) {
                return RecyclerView.this.indexOfChild(arg2);
            }

            public void onEnteredHiddenState(View arg2) {
                ViewHolder v2 = RecyclerView.getChildViewHolderInt(arg2);
                if(v2 != null) {
                    v2.onEnteredHiddenState(RecyclerView.this);
                }
            }

            public void onLeftHiddenState(View arg2) {
                ViewHolder v2 = RecyclerView.getChildViewHolderInt(arg2);
                if(v2 != null) {
                    v2.onLeftHiddenState(RecyclerView.this);
                }
            }

            public void removeAllViews() {
                int v0 = this.getChildCount();
                int v1;
                for(v1 = 0; v1 < v0; ++v1) {
                    View v2 = this.getChildAt(v1);
                    RecyclerView.this.dispatchChildDetached(v2);
                    v2.clearAnimation();
                }

                RecyclerView.this.removeAllViews();
            }

            public void removeViewAt(int arg3) {
                View v0 = RecyclerView.this.getChildAt(arg3);
                if(v0 != null) {
                    RecyclerView.this.dispatchChildDetached(v0);
                    v0.clearAnimation();
                }

                RecyclerView.this.removeViewAt(arg3);
            }
        });
    }

    @VisibleForTesting void initFastScroller(StateListDrawable arg11, Drawable arg12, StateListDrawable arg13, Drawable arg14) {
        if(arg11 != null && arg12 != null && arg13 != null && arg14 != null) {
            Resources v0 = this.getContext().getResources();
            new FastScroller(this, arg11, arg12, arg13, arg14, v0.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), v0.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), v0.getDimensionPixelOffset(R$dimen.fastscroll_margin));
            return;
        }

        StringBuilder v12 = new StringBuilder();
        v12.append("Trying to set fast scroller without both required drawables.");
        v12.append(this.exceptionLabel());
        throw new IllegalArgumentException(v12.toString());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if(this.mItemDecorations.size() == 0) {
            return;
        }

        if(this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }

        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    boolean isAccessibilityEnabled() {
        boolean v0 = this.mAccessibilityManager == null || !this.mAccessibilityManager.isEnabled() ? false : true;
        return v0;
    }

    public boolean isAnimating() {
        boolean v0 = this.mItemAnimator == null || !this.mItemAnimator.isRunning() ? false : true;
        return v0;
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        boolean v0 = this.mLayoutOrScrollCounter > 0 ? true : false;
        return v0;
    }

    public boolean isLayoutFrozen() {
        return this.mLayoutFrozen;
    }

    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().isNestedScrollingEnabled();
    }

    private boolean isPreferredNextFocus(View arg6, View arg7, int arg8) {
        int v2;
        boolean v0 = false;
        if(arg7 != null) {
            if((((RecyclerView)arg7)) == this) {
            }
            else if(this.findContainingItemView(arg7) == null) {
                return 0;
            }
            else if(arg6 == null) {
                return 1;
            }
            else if(this.findContainingItemView(arg6) == null) {
                return 1;
            }
            else {
                this.mTempRect.set(0, 0, arg6.getWidth(), arg6.getHeight());
                this.mTempRect2.set(0, 0, arg7.getWidth(), arg7.getHeight());
                this.offsetDescendantRectToMyCoords(arg6, this.mTempRect);
                this.offsetDescendantRectToMyCoords(arg7, this.mTempRect2);
                int v7 = -1;
                int v6 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
                if(this.mTempRect.left >= this.mTempRect2.left && this.mTempRect.right > this.mTempRect2.left) {
                    goto label_49;
                }
                else if(this.mTempRect.right < this.mTempRect2.right) {
                    v2 = 1;
                }
                else {
                label_49:
                    if((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) {
                        v2 = -1;
                        goto label_67;
                    }

                    v2 = 0;
                }

            label_67:
                if(this.mTempRect.top >= this.mTempRect2.top && this.mTempRect.bottom > this.mTempRect2.top) {
                    goto label_84;
                }
                else if(this.mTempRect.bottom < this.mTempRect2.bottom) {
                    v7 = 1;
                }
                else {
                label_84:
                    if((this.mTempRect.bottom > this.mTempRect2.bottom || this.mTempRect.top >= this.mTempRect2.bottom) && this.mTempRect.top > this.mTempRect2.top) {
                        goto label_101;
                    }

                    v7 = 0;
                }

            label_101:
                if(arg8 == 17) {
                    goto label_142;
                }

                if(arg8 == 33) {
                    goto label_139;
                }

                if(arg8 == 66) {
                    goto label_136;
                }

                if(arg8 == 130) {
                    goto label_133;
                }

                switch(arg8) {
                    case 1: {
                        goto label_127;
                    }
                    case 2: {
                        goto label_121;
                    }
                }

                StringBuilder v7_1 = new StringBuilder();
                v7_1.append("Invalid direction: ");
                v7_1.append(arg8);
                v7_1.append(this.exceptionLabel());
                throw new IllegalArgumentException(v7_1.toString());
            label_121:
                if(v7 > 0 || v7 == 0 && v2 * v6 >= 0) {
                    v0 = true;
                }

                return v0;
            label_127:
                if(v7 < 0 || v7 == 0 && v2 * v6 <= 0) {
                    v0 = true;
                }

                return v0;
            label_133:
                if(v7 > 0) {
                    v0 = true;
                }

                return v0;
            label_136:
                if(v2 > 0) {
                    v0 = true;
                }

                return v0;
            label_139:
                if(v7 < 0) {
                    v0 = true;
                }

                return v0;
            label_142:
                if(v2 < 0) {
                    v0 = true;
                }

                return v0;
            }
        }

        return 0;
    }

    void jumpToPositionForSmoothScroller(int arg2) {
        if(this.mLayout == null) {
            return;
        }

        this.mLayout.scrollToPosition(arg2);
        this.awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildHelper.getUnfilteredChildAt(v1).getLayoutParams().mInsetsDirty = true;
        }

        this.mRecycler.markItemDecorInsetsDirty();
    }

    void markKnownViewsInvalid() {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v1));
            if(v2 != null && !v2.shouldIgnore()) {
                v2.addFlags(6);
            }
        }

        this.markItemDecorInsetsDirty();
        this.mRecycler.markKnownViewsInvalid();
    }

    public void offsetChildrenHorizontal(@Px int arg4) {
        int v0 = this.mChildHelper.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildHelper.getChildAt(v1).offsetLeftAndRight(arg4);
        }
    }

    public void offsetChildrenVertical(@Px int arg4) {
        int v0 = this.mChildHelper.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildHelper.getChildAt(v1).offsetTopAndBottom(arg4);
        }
    }

    void offsetPositionRecordsForInsert(int arg6, int arg7) {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v2));
            if(v3 != null && !v3.shouldIgnore() && v3.mPosition >= arg6) {
                v3.offsetPosition(arg7, false);
                this.mState.mStructureChanged = true;
            }
        }

        this.mRecycler.offsetPositionRecordsForInsert(arg6, arg7);
        this.requestLayout();
    }

    void offsetPositionRecordsForMove(int arg10, int arg11) {
        int v4;
        int v3;
        int v2;
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        if(arg10 < arg11) {
            v2 = arg10;
            v3 = arg11;
            v4 = -1;
        }
        else {
            v3 = arg10;
            v2 = arg11;
            v4 = 1;
        }

        int v6;
        for(v6 = 0; v6 < v0; ++v6) {
            ViewHolder v7 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v6));
            if(v7 != null && v7.mPosition >= v2) {
                if(v7.mPosition > v3) {
                }
                else {
                    if(v7.mPosition == arg10) {
                        v7.offsetPosition(arg11 - arg10, false);
                    }
                    else {
                        v7.offsetPosition(v4, false);
                    }

                    this.mState.mStructureChanged = true;
                }
            }
        }

        this.mRecycler.offsetPositionRecordsForMove(arg10, arg11);
        this.requestLayout();
    }

    void offsetPositionRecordsForRemove(int arg8, int arg9, boolean arg10) {
        int v0 = arg8 + arg9;
        int v1 = this.mChildHelper.getUnfilteredChildCount();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v2));
            if(v3 != null && !v3.shouldIgnore()) {
                if(v3.mPosition >= v0) {
                    v3.offsetPosition(-arg9, arg10);
                    this.mState.mStructureChanged = true;
                }
                else if(v3.mPosition >= arg8) {
                    v3.flagRemovedAndOffsetPosition(arg8 - 1, -arg9, arg10);
                    this.mState.mStructureChanged = true;
                }
            }
        }

        this.mRecycler.offsetPositionRecordsForRemove(arg8, arg9, arg10);
        this.requestLayout();
    }

    protected void onAttachedToWindow() {
        float v0_1;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean v1 = true;
        this.mIsAttached = true;
        if(!this.mFirstLayoutComplete || (this.isLayoutRequested())) {
            v1 = false;
        }
        else {
        }

        this.mFirstLayoutComplete = v1;
        if(this.mLayout != null) {
            this.mLayout.dispatchAttachedToWindow(this);
        }

        this.mPostedAnimatorRunner = false;
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            this.mGapWorker = GapWorker.sGapWorker.get();
            if(this.mGapWorker == null) {
                this.mGapWorker = new GapWorker();
                Display v0 = ViewCompat.getDisplay(((View)this));
                if((this.isInEditMode()) || v0 == null) {
                label_36:
                    v0_1 = 60f;
                }
                else {
                    v0_1 = v0.getRefreshRate();
                    if(v0_1 >= 30f) {
                    }
                    else {
                        goto label_36;
                    }
                }

                this.mGapWorker.mFrameIntervalNs = ((long)(1000000000f / v0_1));
                GapWorker.sGapWorker.set(this.mGapWorker);
            }

            this.mGapWorker.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View arg1) {
    }

    public void onChildDetachedFromWindow(@NonNull View arg1) {
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
        }

        this.stopScroll();
        this.mIsAttached = false;
        if(this.mLayout != null) {
            this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
        }

        this.mPendingAccessibilityImportanceChange.clear();
        this.removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.onDetach();
        if((RecyclerView.ALLOW_THREAD_GAP_WORK) && this.mGapWorker != null) {
            this.mGapWorker.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas arg5) {
        super.onDraw(arg5);
        int v0 = this.mItemDecorations.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mItemDecorations.get(v1).onDraw(arg5, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        ++this.mLayoutOrScrollCounter;
    }

    void onExitLayoutOrScroll(boolean arg3) {
        --this.mLayoutOrScrollCounter;
        if(this.mLayoutOrScrollCounter < 1) {
            this.mLayoutOrScrollCounter = 0;
            if(arg3) {
                this.dispatchContentChangedIfNecessary();
                this.dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    void onExitLayoutOrScroll() {
        this.onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent arg6) {
        float v3;
        float v0;
        if(this.mLayout == null) {
            return 0;
        }

        if(this.mLayoutFrozen) {
            return 0;
        }

        if(arg6.getAction() == 8) {
            if((arg6.getSource() & 2) != 0) {
                v0 = this.mLayout.canScrollVertically() ? -arg6.getAxisValue(9) : 0f;
                if(!this.mLayout.canScrollHorizontally()) {
                    goto label_46;
                }

                v3 = arg6.getAxisValue(10);
            }
            else {
                if((arg6.getSource() & 0x400000) != 0) {
                    v0 = arg6.getAxisValue(26);
                    if(this.mLayout.canScrollVertically()) {
                        v0 = -v0;
                        goto label_46;
                    }
                    else if(this.mLayout.canScrollHorizontally()) {
                        v3 = v0;
                        v0 = 0f;
                        goto label_47;
                    }
                }

                v0 = 0f;
            label_46:
                v3 = 0f;
            }

        label_47:
            if(v0 == 0f && v3 == 0f) {
                return 0;
            }

            this.scrollByInternal(((int)(v3 * this.mScaledHorizontalScrollFactor)), ((int)(v0 * this.mScaledVerticalScrollFactor)), arg6);
        }

        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent arg8) {
        int v8;
        int v0_2;
        boolean v1 = false;
        if(this.mLayoutFrozen) {
            return 0;
        }

        if(this.dispatchOnItemTouchIntercept(arg8)) {
            this.cancelTouch();
            return 1;
        }

        if(this.mLayout == null) {
            return 0;
        }

        boolean v0 = this.mLayout.canScrollHorizontally();
        boolean v3 = this.mLayout.canScrollVertically();
        if(this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }

        this.mVelocityTracker.addMovement(arg8);
        int v4 = arg8.getActionMasked();
        int v5 = arg8.getActionIndex();
        float v6 = 0.5f;
        switch(v4) {
            case 0: {
                if(this.mIgnoreMotionEventTillDown) {
                    this.mIgnoreMotionEventTillDown = false;
                }

                this.mScrollPointerId = arg8.getPointerId(0);
                v4 = ((int)(arg8.getX() + v6));
                this.mLastTouchX = v4;
                this.mInitialTouchX = v4;
                v8 = ((int)(arg8.getY() + v6));
                this.mLastTouchY = v8;
                this.mInitialTouchY = v8;
                if(this.mScrollState == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.setScrollState(1);
                }

                int[] v8_1 = this.mNestedOffsets;
                this.mNestedOffsets[1] = 0;
                v8_1[0] = 0;
                v8 = v0 ? 1 : 0;
                if(v3) {
                    v8 |= 2;
                }

                this.startNestedScroll(v8, 0);
                break;
            }
            case 1: {
                this.mVelocityTracker.clear();
                this.stopNestedScroll(0);
                break;
            }
            case 2: {
                v4 = arg8.findPointerIndex(this.mScrollPointerId);
                if(v4 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return 0;
                }

                v5 = ((int)(arg8.getX(v4) + v6));
                v8 = ((int)(arg8.getY(v4) + v6));
                if(this.mScrollState == 1) {
                    goto label_124;
                }

                v4 = v5 - this.mInitialTouchX;
                int v6_1 = v8 - this.mInitialTouchY;
                if(!v0 || Math.abs(v4) <= this.mTouchSlop) {
                    v0_2 = 0;
                }
                else {
                    this.mLastTouchX = v5;
                    v0_2 = 1;
                }

                if((v3) && Math.abs(v6_1) > this.mTouchSlop) {
                    this.mLastTouchY = v8;
                    v0_2 = 1;
                }

                if(v0_2 == 0) {
                    goto label_124;
                }

                this.setScrollState(1);
                break;
            }
            case 3: {
                this.cancelTouch();
                break;
            }
            case 5: {
                this.mScrollPointerId = arg8.getPointerId(v5);
                v0_2 = ((int)(arg8.getX(v5) + v6));
                this.mLastTouchX = v0_2;
                this.mInitialTouchX = v0_2;
                v8 = ((int)(arg8.getY(v5) + v6));
                this.mLastTouchY = v8;
                this.mInitialTouchY = v8;
                break;
            }
            case 6: {
                this.onPointerUp(arg8);
                break;
            }
            default: {
                break;
            }
        }

    label_124:
        if(this.mScrollState == 1) {
            v1 = true;
        }

        return v1;
    }

    protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        TraceCompat.beginSection("RV OnLayout");
        this.dispatchLayout();
        TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    protected void onMeasure(int arg8, int arg9) {
        if(this.mLayout == null) {
            this.defaultOnMeasure(arg8, arg9);
            return;
        }

        int v2 = 0;
        if(this.mLayout.isAutoMeasureEnabled()) {
            int v0 = View$MeasureSpec.getMode(arg8);
            int v3 = View$MeasureSpec.getMode(arg9);
            this.mLayout.onMeasure(this.mRecycler, this.mState, arg8, arg9);
            int v4 = 0x40000000;
            if(v0 == v4 && v3 == v4) {
                v2 = 1;
            }

            if(v2 == 0) {
                if(this.mAdapter == null) {
                }
                else {
                    if(this.mState.mLayoutStep == 1) {
                        this.dispatchLayoutStep1();
                    }

                    this.mLayout.setMeasureSpecs(arg8, arg9);
                    this.mState.mIsMeasuring = true;
                    this.dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(arg8, arg9);
                    if(!this.mLayout.shouldMeasureTwice()) {
                        return;
                    }

                    this.mLayout.setMeasureSpecs(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), v4), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), v4));
                    this.mState.mIsMeasuring = true;
                    this.dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(arg8, arg9);
                    return;
                }
            }

            return;
        }
        else {
            if(this.mHasFixedSize) {
                this.mLayout.onMeasure(this.mRecycler, this.mState, arg8, arg9);
                return;
            }

            if(this.mAdapterUpdateDuringMeasure) {
                this.startInterceptRequestLayout();
                this.onEnterLayoutOrScroll();
                this.processAdapterUpdatesAndSetAnimationFlags();
                this.onExitLayoutOrScroll();
                if(this.mState.mRunPredictiveAnimations) {
                    this.mState.mInPreLayout = true;
                }
                else {
                    this.mAdapterHelper.consumeUpdatesInOnePass();
                    this.mState.mInPreLayout = false;
                }

                this.mAdapterUpdateDuringMeasure = false;
                this.stopInterceptRequestLayout(false);
            }
            else {
                if(!this.mState.mRunPredictiveAnimations) {
                    goto label_83;
                }

                this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            }

        label_83:
            this.mState.mItemCount = this.mAdapter != null ? this.mAdapter.getItemCount() : 0;
            this.startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, arg8, arg9);
            this.stopInterceptRequestLayout(false);
            this.mState.mInPreLayout = false;
        }
    }

    private void onPointerUp(MotionEvent arg4) {
        int v0 = arg4.getActionIndex();
        if(arg4.getPointerId(v0) == this.mScrollPointerId) {
            v0 = v0 == 0 ? 1 : 0;
            this.mScrollPointerId = arg4.getPointerId(v0);
            int v1 = ((int)(arg4.getX(v0) + 0.5f));
            this.mLastTouchX = v1;
            this.mInitialTouchX = v1;
            int v4 = ((int)(arg4.getY(v0) + 0.5f));
            this.mLastTouchY = v4;
            this.mInitialTouchY = v4;
        }
    }

    protected boolean onRequestFocusInDescendants(int arg2, Rect arg3) {
        if(this.isComputingLayout()) {
            return 0;
        }

        return super.onRequestFocusInDescendants(arg2, arg3);
    }

    protected void onRestoreInstanceState(Parcelable arg2) {
        if(!(arg2 instanceof SavedState)) {
            super.onRestoreInstanceState(arg2);
            return;
        }

        this.mPendingSavedState = ((SavedState)arg2);
        super.onRestoreInstanceState(this.mPendingSavedState.getSuperState());
        if(this.mLayout != null && this.mPendingSavedState.mLayoutState != null) {
            this.mLayout.onRestoreInstanceState(this.mPendingSavedState.mLayoutState);
        }
    }

    protected Parcelable onSaveInstanceState() {
        SavedState v0 = new SavedState(super.onSaveInstanceState());
        if(this.mPendingSavedState != null) {
            v0.copyFrom(this.mPendingSavedState);
        }
        else if(this.mLayout != null) {
            v0.mLayoutState = this.mLayout.onSaveInstanceState();
        }
        else {
            v0.mLayoutState = null;
        }

        return ((Parcelable)v0);
    }

    public void onScrollStateChanged(int arg1) {
    }

    public void onScrolled(@Px int arg1, @Px int arg2) {
    }

    protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4) {
        super.onSizeChanged(arg1, arg2, arg3, arg4);
        if(arg1 != arg3 || arg2 != arg4) {
            this.invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent arg15) {
        int v0_2;
        int v7_2;
        int v15;
        int v1 = 0;
        if(!this.mLayoutFrozen) {
            if(this.mIgnoreMotionEventTillDown) {
            }
            else if(this.dispatchOnItemTouch(arg15)) {
                this.cancelTouch();
                return 1;
            }
            else if(this.mLayout == null) {
                return 0;
            }
            else {
                boolean v0 = this.mLayout.canScrollHorizontally();
                boolean v3 = this.mLayout.canScrollVertically();
                if(this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }

                MotionEvent v4 = MotionEvent.obtain(arg15);
                int v5 = arg15.getActionMasked();
                int v6 = arg15.getActionIndex();
                if(v5 == 0) {
                    int[] v7 = this.mNestedOffsets;
                    this.mNestedOffsets[1] = 0;
                    v7[0] = 0;
                }

                v4.offsetLocation(((float)this.mNestedOffsets[0]), ((float)this.mNestedOffsets[1]));
                float v7_1 = 0.5f;
                switch(v5) {
                    case 0: {
                        this.mScrollPointerId = arg15.getPointerId(0);
                        v5 = ((int)(arg15.getX() + v7_1));
                        this.mLastTouchX = v5;
                        this.mInitialTouchX = v5;
                        v15 = ((int)(arg15.getY() + v7_1));
                        this.mLastTouchY = v15;
                        this.mInitialTouchY = v15;
                        v15 = v0 ? 1 : 0;
                        if(v3) {
                            v15 |= 2;
                        }

                        this.startNestedScroll(v15, 0);
                        break;
                    }
                    case 1: {
                        this.mVelocityTracker.addMovement(v4);
                        this.mVelocityTracker.computeCurrentVelocity(1000, ((float)this.mMaxFlingVelocity));
                        float v0_3 = v0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0f;
                        float v3_1 = v3 ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0f;
                        if(v0_3 == 0f && v3_1 == 0f || !this.fling(((int)v0_3), ((int)v3_1))) {
                            this.setScrollState(0);
                        }

                        this.resetTouch();
                        v1 = 1;
                        break;
                    }
                    case 2: {
                        v5 = arg15.findPointerIndex(this.mScrollPointerId);
                        if(v5 < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return 0;
                        }

                        v6 = ((int)(arg15.getX(v5) + v7_1));
                        v15 = ((int)(arg15.getY(v5) + v7_1));
                        v5 = this.mLastTouchX - v6;
                        int v13 = this.mLastTouchY - v15;
                        if(this.dispatchNestedPreScroll(v5, v13, this.mScrollConsumed, this.mScrollOffset, 0)) {
                            v5 -= this.mScrollConsumed[0];
                            v13 -= this.mScrollConsumed[1];
                            v4.offsetLocation(((float)this.mScrollOffset[0]), ((float)this.mScrollOffset[1]));
                            this.mNestedOffsets[0] += this.mScrollOffset[0];
                            this.mNestedOffsets[1] += this.mScrollOffset[1];
                        }

                        if(this.mScrollState != 1) {
                            if(!v0 || Math.abs(v5) <= this.mTouchSlop) {
                                v7_2 = 0;
                            }
                            else {
                                if(v5 > 0) {
                                    v5 -= this.mTouchSlop;
                                }
                                else {
                                    v5 += this.mTouchSlop;
                                }

                                v7_2 = 1;
                            }

                            if((v3) && Math.abs(v13) > this.mTouchSlop) {
                                if(v13 > 0) {
                                    v13 -= this.mTouchSlop;
                                }
                                else {
                                    v13 += this.mTouchSlop;
                                }

                                v7_2 = 1;
                            }

                            if(v7_2 == 0) {
                                goto label_143;
                            }

                            this.setScrollState(1);
                        }

                    label_143:
                        if(this.mScrollState != 1) {
                            goto label_223;
                        }

                        this.mLastTouchX = v6 - this.mScrollOffset[0];
                        this.mLastTouchY = v15 - this.mScrollOffset[1];
                        v15 = v0 ? v5 : 0;
                        v0_2 = v3 ? v13 : 0;
                        if(this.scrollByInternal(v15, v0_2, v4)) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }

                        if(this.mGapWorker == null) {
                            goto label_223;
                        }

                        if(v5 == 0 && v13 == 0) {
                            goto label_223;
                        }

                        this.mGapWorker.postFromTraversal(this, v5, v13);
                        break;
                    }
                    case 3: {
                        this.cancelTouch();
                        break;
                    }
                    case 5: {
                        this.mScrollPointerId = arg15.getPointerId(v6);
                        v0_2 = ((int)(arg15.getX(v6) + v7_1));
                        this.mLastTouchX = v0_2;
                        this.mInitialTouchX = v0_2;
                        v15 = ((int)(arg15.getY(v6) + v7_1));
                        this.mLastTouchY = v15;
                        this.mInitialTouchY = v15;
                        break;
                    }
                    case 6: {
                        this.onPointerUp(arg15);
                        break;
                    }
                    default: {
                        break;
                    }
                }

            label_223:
                if(v1 == 0) {
                    this.mVelocityTracker.addMovement(v4);
                }

                v4.recycle();
                return 1;
            }
        }

        return 0;
    }

    void postAnimationRunner() {
        if(!this.mPostedAnimatorRunner && (this.mIsAttached)) {
            ViewCompat.postOnAnimation(((View)this), this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        boolean v0 = this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations() ? false : true;
        return v0;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean v4;
        if(this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.reset();
            if(this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }

        if(this.predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.preProcess();
        }
        else {
            this.mAdapterHelper.consumeUpdatesInOnePass();
        }

        boolean v1 = false;
        int v0 = (this.mItemsAddedOrRemoved) || (this.mItemsChanged) ? 1 : 0;
        State v3 = this.mState;
        if(!this.mFirstLayoutComplete || this.mItemAnimator == null) {
        label_43:
            v4 = false;
        }
        else {
            if(!this.mDataSetHasChangedAfterLayout && v0 == 0 && !this.mLayout.mRequestedSimpleAnimations) {
                goto label_43;
            }

            if((this.mDataSetHasChangedAfterLayout) && !this.mAdapter.hasStableIds()) {
                goto label_43;
            }

            v4 = true;
        }

        v3.mRunSimpleAnimations = v4;
        v3 = this.mState;
        if((this.mState.mRunSimpleAnimations) && v0 != 0 && !this.mDataSetHasChangedAfterLayout && (this.predictiveItemAnimationsEnabled())) {
            v1 = true;
        }

        v3.mRunPredictiveAnimations = v1;
    }

    void processDataSetCompletelyChanged(boolean arg2) {
        this.mDispatchItemsChangedEvent |= ((int)arg2);
        this.mDataSetHasChangedAfterLayout = true;
        this.markKnownViewsInvalid();
    }

    private void pullGlows(float arg7, float arg8, float arg9, float arg10) {
        int v9;
        float v0 = 1f;
        int v1 = 1;
        if(arg8 < 0f) {
            this.ensureLeftGlow();
            EdgeEffectCompat.onPull(this.mLeftGlow, -arg8 / (((float)this.getWidth())), v0 - arg9 / (((float)this.getHeight())));
            goto label_15;
        }
        else if(arg8 > 0f) {
            this.ensureRightGlow();
            EdgeEffectCompat.onPull(this.mRightGlow, arg8 / (((float)this.getWidth())), arg9 / (((float)this.getHeight())));
        label_15:
            v9 = 1;
        }
        else {
            v9 = 0;
        }

        if(arg10 < 0f) {
            this.ensureTopGlow();
            EdgeEffectCompat.onPull(this.mTopGlow, -arg10 / (((float)this.getHeight())), arg7 / (((float)this.getWidth())));
        }
        else if(arg10 > 0f) {
            this.ensureBottomGlow();
            EdgeEffectCompat.onPull(this.mBottomGlow, arg10 / (((float)this.getHeight())), v0 - arg7 / (((float)this.getWidth())));
        }
        else {
            v1 = v9;
        }

        if(v1 != 0 || arg8 != 0f || arg10 != 0f) {
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    void recordAnimationInfoIfBouncedHiddenView(ViewHolder arg4, ItemHolderInfo arg5) {
        arg4.setFlags(0, 0x2000);
        if((this.mState.mTrackOldChangeHolders) && (arg4.isUpdated()) && !arg4.isRemoved() && !arg4.shouldIgnore()) {
            this.mViewInfoStore.addToOldChangeHolders(this.getChangedHolderKey(arg4), arg4);
        }

        this.mViewInfoStore.addToPreLayout(arg4, arg5);
    }

    private void recoverFocusFromState() {
        View v0;
        if((this.mPreserveFocusAfterLayout) && this.mAdapter != null && (this.hasFocus()) && this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused())) {
            if(!this.isFocused()) {
                v0 = this.getFocusedChild();
                if((RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD) && (v0.getParent() == null || !v0.hasFocus())) {
                    if(this.mChildHelper.getChildCount() != 0) {
                        goto label_33;
                    }

                    this.requestFocus();
                    return;
                }

                if(this.mChildHelper.isHidden(v0)) {
                    goto label_33;
                }

                return;
            }

        label_33:
            long v2 = -1;
            View v4 = null;
            ViewHolder v0_1 = this.mState.mFocusedItemId == v2 || !this.mAdapter.hasStableIds() ? ((ViewHolder)v4) : this.findViewHolderForItemId(this.mState.mFocusedItemId);
            if(v0_1 != null && !this.mChildHelper.isHidden(v0_1.itemView) && (v0_1.itemView.hasFocusable())) {
                v4 = v0_1.itemView;
            }
            else if(this.mChildHelper.getChildCount() > 0) {
                v4 = this.findNextViewToFocus();
            }

            if(v4 != null) {
                if((((long)this.mState.mFocusedSubChildId)) != v2) {
                    v0 = v4.findViewById(this.mState.mFocusedSubChildId);
                    if(v0 == null) {
                        goto label_73;
                    }
                    else if(v0.isFocusable()) {
                    }
                    else {
                        goto label_73;
                    }
                }
                else {
                label_73:
                    v0 = v4;
                }

                v0.requestFocus();
            }

            return;
        }
    }

    private void releaseGlows() {
        int v0_1;
        boolean v0;
        if(this.mLeftGlow != null) {
            this.mLeftGlow.onRelease();
            v0 = this.mLeftGlow.isFinished();
        }
        else {
            v0_1 = 0;
        }

        if(this.mTopGlow != null) {
            this.mTopGlow.onRelease();
            v0_1 = (((int)v0)) | this.mTopGlow.isFinished();
        }

        if(this.mRightGlow != null) {
            this.mRightGlow.onRelease();
            v0_1 = (((int)v0)) | this.mRightGlow.isFinished();
        }

        if(this.mBottomGlow != null) {
            this.mBottomGlow.onRelease();
            v0_1 = (((int)v0)) | this.mBottomGlow.isFinished();
        }

        if(v0) {
            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    void removeAndRecycleViews() {
        if(this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
        }

        if(this.mLayout != null) {
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }

        this.mRecycler.clear();
    }

    boolean removeAnimatingView(View arg3) {
        this.startInterceptRequestLayout();
        boolean v0 = this.mChildHelper.removeViewIfHidden(arg3);
        if(v0) {
            ViewHolder v3 = RecyclerView.getChildViewHolderInt(arg3);
            this.mRecycler.unscrapView(v3);
            this.mRecycler.recycleViewHolderInternal(v3);
        }

        this.stopInterceptRequestLayout((((int)v0)) ^ 1);
        return v0;
    }

    protected void removeDetachedView(View arg3, boolean arg4) {
        ViewHolder v0 = RecyclerView.getChildViewHolderInt(arg3);
        if(v0 != null) {
            if(v0.isTmpDetached()) {
                v0.clearTmpDetachFlag();
            }
            else if(v0.shouldIgnore()) {
            }
            else {
                StringBuilder v4 = new StringBuilder();
                v4.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                v4.append(v0);
                v4.append(this.exceptionLabel());
                throw new IllegalArgumentException(v4.toString());
            }
        }

        arg3.clearAnimation();
        this.dispatchChildDetached(arg3);
        super.removeDetachedView(arg3, arg4);
    }

    public void removeItemDecoration(@NonNull ItemDecoration arg3) {
        if(this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }

        this.mItemDecorations.remove(arg3);
        if(this.mItemDecorations.isEmpty()) {
            boolean v3 = this.getOverScrollMode() == 2 ? true : false;
            this.setWillNotDraw(v3);
        }

        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void removeItemDecorationAt(int arg4) {
        int v0 = this.getItemDecorationCount();
        if(arg4 >= 0 && arg4 < v0) {
            this.removeItemDecoration(this.getItemDecorationAt(arg4));
            return;
        }

        StringBuilder v2 = new StringBuilder();
        v2.append(arg4);
        v2.append(" is an invalid index for size ");
        v2.append(v0);
        throw new IndexOutOfBoundsException(v2.toString());
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener arg2) {
        if(this.mOnChildAttachStateListeners == null) {
            return;
        }

        this.mOnChildAttachStateListeners.remove(arg2);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener arg2) {
        this.mOnItemTouchListeners.remove(arg2);
        if(this.mActiveOnItemTouchListener == arg2) {
            this.mActiveOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener arg2) {
        if(this.mScrollListeners != null) {
            this.mScrollListeners.remove(arg2);
        }
    }

    void repositionShadowingViews() {
        int v0 = this.mChildHelper.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            View v2 = this.mChildHelper.getChildAt(v1);
            ViewHolder v3 = this.getChildViewHolder(v2);
            if(v3 != null && v3.mShadowingHolder != null) {
                View v3_1 = v3.mShadowingHolder.itemView;
                int v4 = v2.getLeft();
                int v2_1 = v2.getTop();
                if(v4 == v3_1.getLeft() && v2_1 == v3_1.getTop()) {
                    goto label_23;
                }

                v3_1.layout(v4, v2_1, v3_1.getWidth() + v4, v3_1.getHeight() + v2_1);
            }

        label_23:
        }
    }

    public void requestChildFocus(View arg3, View arg4) {
        if(!this.mLayout.onRequestChildFocus(this, this.mState, arg3, arg4) && arg4 != null) {
            this.requestChildOnScreen(arg3, arg4);
        }

        super.requestChildFocus(arg3, arg4);
    }

    private void requestChildOnScreen(@NonNull View arg12, @Nullable View arg13) {
        View v0 = arg13 != null ? arg13 : arg12;
        this.mTempRect.set(0, 0, v0.getWidth(), v0.getHeight());
        ViewGroup$LayoutParams v0_1 = v0.getLayoutParams();
        if(((v0_1 instanceof LayoutParams)) && !((LayoutParams)v0_1).mInsetsDirty) {
            Rect v0_2 = ((LayoutParams)v0_1).mDecorInsets;
            this.mTempRect.left -= v0_2.left;
            this.mTempRect.right += v0_2.right;
            this.mTempRect.top -= v0_2.top;
            this.mTempRect.bottom += v0_2.bottom;
        }

        if(arg13 != null) {
            this.offsetDescendantRectToMyCoords(arg13, this.mTempRect);
            this.offsetRectIntoDescendantCoords(arg12, this.mTempRect);
        }

        LayoutManager v5 = this.mLayout;
        Rect v8 = this.mTempRect;
        int v9 = this.mFirstLayoutComplete ^ 1;
        boolean v10 = arg13 == null ? true : false;
        v5.requestChildRectangleOnScreen(this, arg12, v8, ((boolean)v9), v10);
    }

    public boolean requestChildRectangleOnScreen(View arg2, Rect arg3, boolean arg4) {
        return this.mLayout.requestChildRectangleOnScreen(this, arg2, arg3, arg4);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg4) {
        int v0 = this.mOnItemTouchListeners.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mOnItemTouchListeners.get(v1).onRequestDisallowInterceptTouchEvent(arg4);
        }

        super.requestDisallowInterceptTouchEvent(arg4);
    }

    public void requestLayout() {
        if(this.mInterceptRequestLayoutDepth != 0 || (this.mLayoutFrozen)) {
            this.mLayoutWasDefered = true;
        }
        else {
            super.requestLayout();
        }
    }

    private void resetFocusInfo() {
        this.mState.mFocusedItemId = -1;
        this.mState.mFocusedItemPosition = -1;
        this.mState.mFocusedSubChildId = -1;
    }

    private void resetTouch() {
        if(this.mVelocityTracker != null) {
            this.mVelocityTracker.clear();
        }

        this.stopNestedScroll(0);
        this.releaseGlows();
    }

    private void saveFocusInfo() {
        int v2_1;
        ViewHolder v1 = null;
        View v0 = !this.mPreserveFocusAfterLayout || !this.hasFocus() || this.mAdapter == null ? ((View)v1) : this.getFocusedChild();
        if(v0 == null) {
        }
        else {
            v1 = this.findContainingViewHolder(v0);
        }

        if(v1 == null) {
            this.resetFocusInfo();
        }
        else {
            State v0_1 = this.mState;
            long v2 = this.mAdapter.hasStableIds() ? v1.getItemId() : -1;
            v0_1.mFocusedItemId = v2;
            v0_1 = this.mState;
            if(this.mDataSetHasChangedAfterLayout) {
                v2_1 = -1;
            }
            else if(v1.isRemoved()) {
                v2_1 = v1.mOldPosition;
            }
            else {
                v2_1 = v1.getAdapterPosition();
            }

            v0_1.mFocusedItemPosition = v2_1;
            this.mState.mFocusedSubChildId = this.getDeepestFocusedViewWithId(v1.itemView);
        }
    }

    void saveOldPositions() {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            ViewHolder v2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(v1));
            if(!v2.shouldIgnore()) {
                v2.saveOldPosition();
            }
        }
    }

    public void scrollBy(int arg4, int arg5) {
        if(this.mLayout == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }

        if(this.mLayoutFrozen) {
            return;
        }

        boolean v0 = this.mLayout.canScrollHorizontally();
        boolean v1 = this.mLayout.canScrollVertically();
        if((v0) || (v1)) {
            this.scrollByInternal(0, 0, null);
        }
    }

    boolean scrollByInternal(int arg19, int arg20, MotionEvent arg21) {
        int v6;
        int v15;
        int v14;
        int v13;
        RecyclerView v7 = this;
        int v8 = arg19;
        int v9 = arg20;
        MotionEvent v10 = arg21;
        this.consumePendingUpdateOperations();
        boolean v12 = false;
        if(v7.mAdapter != null) {
            v7.scrollStep(v8, v9, v7.mScrollStepConsumed);
            int v0 = v7.mScrollStepConsumed[0];
            int v3 = v9 - v7.mScrollStepConsumed[1];
            v13 = v0;
            v14 = v7.mScrollStepConsumed[1];
            v15 = v8 - v0;
            v6 = v3;
        }
        else {
            v6 = 0;
            v13 = 0;
            v14 = 0;
            v15 = 0;
        }

        if(!v7.mItemDecorations.isEmpty()) {
            this.invalidate();
        }

        int v17 = v6;
        if(this.dispatchNestedScroll(v13, v14, v15, v6, v7.mScrollOffset, 0)) {
            v7.mLastTouchX -= v7.mScrollOffset[0];
            v7.mLastTouchY -= v7.mScrollOffset[1];
            if(v10 != null) {
                v10.offsetLocation(((float)v7.mScrollOffset[0]), ((float)v7.mScrollOffset[1]));
            }

            v7.mNestedOffsets[0] += v7.mScrollOffset[0];
            v7.mNestedOffsets[1] += v7.mScrollOffset[1];
        }
        else {
            if(this.getOverScrollMode() == 2) {
                goto label_86;
            }

            if(v10 != null && !MotionEventCompat.isFromSource(v10, 0x2002)) {
                v7.pullGlows(arg21.getX(), ((float)v15), arg21.getY(), ((float)v17));
            }

            this.considerReleasingGlowsOnScroll(arg19, arg20);
        }

    label_86:
        if(v13 != 0 || v14 != 0) {
            v7.dispatchOnScrolled(v13, v14);
        }

        if(!this.awakenScrollBars()) {
            this.invalidate();
        }

        if(v13 != 0 || v14 != 0) {
            v12 = true;
        }

        return v12;
    }

    void scrollStep(int arg5, int arg6, @Nullable int[] arg7) {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        TraceCompat.beginSection("RV Scroll");
        this.fillRemainingScrollValues(this.mState);
        arg5 = arg5 != 0 ? this.mLayout.scrollHorizontallyBy(arg5, this.mRecycler, this.mState) : 0;
        arg6 = arg6 != 0 ? this.mLayout.scrollVerticallyBy(arg6, this.mRecycler, this.mState) : 0;
        TraceCompat.endSection();
        this.repositionShadowingViews();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        if(arg7 != null) {
            arg7[0] = arg5;
            arg7[1] = arg6;
        }
    }

    public void scrollTo(int arg1, int arg2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int arg2) {
        if(this.mLayoutFrozen) {
            return;
        }

        this.stopScroll();
        if(this.mLayout == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }

        this.mLayout.scrollToPosition(arg2);
        this.awakenScrollBars();
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent arg2) {
        if(this.shouldDeferAccessibilityEvent(arg2)) {
            return;
        }

        super.sendAccessibilityEventUnchecked(arg2);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate arg1) {
        this.mAccessibilityDelegate = arg1;
        ViewCompat.setAccessibilityDelegate(((View)this), this.mAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter arg3) {
        this.setLayoutFrozen(false);
        this.setAdapterInternal(arg3, false, true);
        this.processDataSetCompletelyChanged(false);
        this.requestLayout();
    }

    private void setAdapterInternal(@Nullable Adapter arg3, boolean arg4, boolean arg5) {
        if(this.mAdapter != null) {
            this.mAdapter.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }

        if(!arg4 || (arg5)) {
            this.removeAndRecycleViews();
        }

        this.mAdapterHelper.reset();
        Adapter v5 = this.mAdapter;
        this.mAdapter = arg3;
        if(arg3 != null) {
            arg3.registerAdapterDataObserver(this.mObserver);
            arg3.onAttachedToRecyclerView(this);
        }

        if(this.mLayout != null) {
            this.mLayout.onAdapterChanged(v5, this.mAdapter);
        }

        this.mRecycler.onAdapterChanged(v5, this.mAdapter, arg4);
        this.mState.mStructureChanged = true;
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback arg2) {
        if(arg2 == this.mChildDrawingOrderCallback) {
            return;
        }

        this.mChildDrawingOrderCallback = arg2;
        boolean v2 = this.mChildDrawingOrderCallback != null ? true : false;
        this.setChildrenDrawingOrderEnabled(v2);
    }

    @VisibleForTesting boolean setChildImportantForAccessibilityInternal(ViewHolder arg2, int arg3) {
        if(this.isComputingLayout()) {
            arg2.mPendingAccessibilityState = arg3;
            this.mPendingAccessibilityImportanceChange.add(arg2);
            return 0;
        }

        ViewCompat.setImportantForAccessibility(arg2.itemView, arg3);
        return 1;
    }

    public void setClipToPadding(boolean arg2) {
        if(arg2 != this.mClipToPadding) {
            this.invalidateGlows();
        }

        this.mClipToPadding = arg2;
        super.setClipToPadding(arg2);
        if(this.mFirstLayoutComplete) {
            this.requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory arg1) {
        Preconditions.checkNotNull(arg1);
        this.mEdgeEffectFactory = arg1;
        this.invalidateGlows();
    }

    public void setHasFixedSize(boolean arg1) {
        this.mHasFixedSize = arg1;
    }

    public void setItemAnimator(@Nullable ItemAnimator arg3) {
        if(this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
            this.mItemAnimator.setListener(null);
        }

        this.mItemAnimator = arg3;
        if(this.mItemAnimator != null) {
            this.mItemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int arg2) {
        this.mRecycler.setViewCacheSize(arg2);
    }

    public void setLayoutFrozen(boolean arg10) {
        if(arg10 != this.mLayoutFrozen) {
            this.assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
            if(!arg10) {
                this.mLayoutFrozen = false;
                if((this.mLayoutWasDefered) && this.mLayout != null && this.mAdapter != null) {
                    this.requestLayout();
                }

                this.mLayoutWasDefered = false;
            }
            else {
                long v3 = SystemClock.uptimeMillis();
                this.onTouchEvent(MotionEvent.obtain(v3, v3, 3, 0f, 0f, 0));
                this.mLayoutFrozen = true;
                this.mIgnoreMotionEventTillDown = true;
                this.stopScroll();
            }
        }
    }

    public void setLayoutManager(@Nullable LayoutManager arg4) {
        if(arg4 == this.mLayout) {
            return;
        }

        this.stopScroll();
        if(this.mLayout != null) {
            if(this.mItemAnimator != null) {
                this.mItemAnimator.endAnimations();
            }

            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if(this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }

            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        }
        else {
            this.mRecycler.clear();
        }

        this.mChildHelper.removeAllViewsUnfiltered();
        this.mLayout = arg4;
        if(arg4 != null) {
            if(arg4.mRecyclerView == null) {
                this.mLayout.setRecyclerView(this);
                if(this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            }
            else {
                StringBuilder v1 = new StringBuilder();
                v1.append("LayoutManager ");
                v1.append(arg4);
                v1.append(" is already attached to a RecyclerView:");
                v1.append(arg4.mRecyclerView.exceptionLabel());
                throw new IllegalArgumentException(v1.toString());
            }
        }

        this.mRecycler.updateViewCacheSize();
        this.requestLayout();
    }

    public void setNestedScrollingEnabled(boolean arg2) {
        this.getScrollingChildHelper().setNestedScrollingEnabled(arg2);
    }

    public void setOnFlingListener(@Nullable OnFlingListener arg1) {
        this.mOnFlingListener = arg1;
    }

    @Deprecated public void setOnScrollListener(@Nullable OnScrollListener arg1) {
        this.mScrollListener = arg1;
    }

    public void setPreserveFocusAfterLayout(boolean arg1) {
        this.mPreserveFocusAfterLayout = arg1;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool arg2) {
        this.mRecycler.setRecycledViewPool(arg2);
    }

    public void setRecyclerListener(@Nullable RecyclerListener arg1) {
        this.mRecyclerListener = arg1;
    }

    void setScrollState(int arg2) {
        if(arg2 == this.mScrollState) {
            return;
        }

        this.mScrollState = arg2;
        if(arg2 != 2) {
            this.stopScrollersInternal();
        }

        this.dispatchOnScrollStateChanged(arg2);
    }

    public void setScrollingTouchSlop(int arg5) {
        ViewConfiguration v0 = ViewConfiguration.get(this.getContext());
        switch(arg5) {
            case 0: {
                goto label_17;
            }
            case 1: {
                goto label_14;
            }
        }

        Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + arg5 + "; using default value");
    label_17:
        this.mTouchSlop = v0.getScaledTouchSlop();
        return;
    label_14:
        this.mTouchSlop = v0.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension arg2) {
        this.mRecycler.setViewCacheExtension(arg2);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent arg3) {
        if(this.isComputingLayout()) {
            int v3 = arg3 != null ? AccessibilityEventCompat.getContentChangeTypes(arg3) : 0;
            if(v3 == 0) {
                v3 = 0;
            }

            this.mEatenAccessibilityChangeFlags |= v3;
            return 1;
        }

        return 0;
    }

    public void smoothScrollBy(@Px int arg2, @Px int arg3) {
        this.smoothScrollBy(arg2, arg3, null);
    }

    public void smoothScrollBy(@Px int arg3, @Px int arg4, @Nullable Interpolator arg5) {
        if(this.mLayout == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }

        if(this.mLayoutFrozen) {
            return;
        }

        if(0 != 0 || 0 != 0) {
            this.mViewFlinger.smoothScrollBy(0, 0, arg5);
        }
    }

    public void smoothScrollToPosition(int arg3) {
        if(this.mLayoutFrozen) {
            return;
        }

        if(this.mLayout == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }

        this.mLayout.smoothScrollToPosition(this, this.mState, arg3);
    }

    void startInterceptRequestLayout() {
        ++this.mInterceptRequestLayoutDepth;
        if(this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutFrozen) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int arg2, int arg3) {
        return this.getScrollingChildHelper().startNestedScroll(arg2, arg3);
    }

    public boolean startNestedScroll(int arg2) {
        return this.getScrollingChildHelper().startNestedScroll(arg2);
    }

    void stopInterceptRequestLayout(boolean arg4) {
        if(this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }

        if(!arg4 && !this.mLayoutFrozen) {
            this.mLayoutWasDefered = false;
        }

        if(this.mInterceptRequestLayoutDepth == 1) {
            if((arg4) && (this.mLayoutWasDefered) && !this.mLayoutFrozen && this.mLayout != null && this.mAdapter != null) {
                this.dispatchLayout();
            }

            if(this.mLayoutFrozen) {
                goto label_24;
            }

            this.mLayoutWasDefered = false;
        }

    label_24:
        --this.mInterceptRequestLayoutDepth;
    }

    public void stopNestedScroll(int arg2) {
        this.getScrollingChildHelper().stopNestedScroll(arg2);
    }

    public void stopNestedScroll() {
        this.getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        this.setScrollState(0);
        this.stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        if(this.mLayout != null) {
            this.mLayout.stopSmoothScroller();
        }
    }

    public void swapAdapter(@Nullable Adapter arg2, boolean arg3) {
        this.setLayoutFrozen(false);
        this.setAdapterInternal(arg2, true, arg3);
        this.processDataSetCompletelyChanged(true);
        this.requestLayout();
    }

    void viewRangeUpdate(int arg7, int arg8, Object arg9) {
        int v0 = this.mChildHelper.getUnfilteredChildCount();
        int v1 = arg7 + arg8;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            View v3 = this.mChildHelper.getUnfilteredChildAt(v2);
            ViewHolder v4 = RecyclerView.getChildViewHolderInt(v3);
            if(v4 != null) {
                if(v4.shouldIgnore()) {
                }
                else if(v4.mPosition >= arg7 && v4.mPosition < v1) {
                    v4.addFlags(2);
                    v4.addChangePayload(arg9);
                    v3.getLayoutParams().mInsetsDirty = true;
                }
            }
        }

        this.mRecycler.viewRangeUpdate(arg7, arg8);
    }
}

