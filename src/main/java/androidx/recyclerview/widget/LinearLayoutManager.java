package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

public class LinearLayoutManager extends LayoutManager implements ViewDropHandler, ScrollVectorProvider {
    class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        OrientationHelper mOrientationHelper;
        int mPosition;
        boolean mValid;

        AnchorInfo() {
            super();
            this.reset();
        }

        void assignCoordinateFromPadding() {
            int v0 = this.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = v0;
        }

        public void assignFromView(View arg2, int arg3) {
            this.mCoordinate = this.mLayoutFromEnd ? this.mOrientationHelper.getDecoratedEnd(arg2) + this.mOrientationHelper.getTotalSpaceChange() : this.mOrientationHelper.getDecoratedStart(arg2);
            this.mPosition = arg3;
        }

        public void assignFromViewAndKeepVisibleRect(View arg5, int arg6) {
            int v2;
            int v0 = this.mOrientationHelper.getTotalSpaceChange();
            if(v0 >= 0) {
                this.assignFromView(arg5, arg6);
                return;
            }

            this.mPosition = arg6;
            if(this.mLayoutFromEnd) {
                arg6 = this.mOrientationHelper.getEndAfterPadding() - v0 - this.mOrientationHelper.getDecoratedEnd(arg5);
                this.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - arg6;
                if(arg6 > 0) {
                    v2 = this.mCoordinate - this.mOrientationHelper.getDecoratedMeasurement(arg5);
                    v0 = this.mOrientationHelper.getStartAfterPadding();
                    v2 -= v0 + Math.min(this.mOrientationHelper.getDecoratedStart(arg5) - v0, 0);
                    if(v2 < 0) {
                        this.mCoordinate += Math.min(arg6, -v2);
                    }
                }
            }
            else {
                arg6 = this.mOrientationHelper.getDecoratedStart(arg5);
                v2 = arg6 - this.mOrientationHelper.getStartAfterPadding();
                this.mCoordinate = arg6;
                if(v2 > 0) {
                    int v5 = this.mOrientationHelper.getEndAfterPadding() - Math.min(0, this.mOrientationHelper.getEndAfterPadding() - v0 - this.mOrientationHelper.getDecoratedEnd(arg5)) - (arg6 + this.mOrientationHelper.getDecoratedMeasurement(arg5));
                    if(v5 < 0) {
                        this.mCoordinate -= Math.min(v2, -v5);
                    }
                }
            }
        }

        boolean isViewValidAsAnchor(View arg2, State arg3) {
            ViewGroup$LayoutParams v2 = arg2.getLayoutParams();
            boolean v2_1 = (((LayoutParams)v2).isItemRemoved()) || ((LayoutParams)v2).getViewLayoutPosition() < 0 || ((LayoutParams)v2).getViewLayoutPosition() >= arg3.getItemCount() ? false : true;
            return v2_1;
        }

        void reset() {
            this.mPosition = -1;
            this.mCoordinate = 0x80000000;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }
    }

    public class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult() {
            super();
        }

        void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    class LayoutState {
        static final int INVALID_LAYOUT = 0x80000000;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = 0x80000000;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        int mExtra;
        boolean mInfinite;
        boolean mIsPreLayout;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle;
        List mScrapList;
        int mScrollingOffset;

        LayoutState() {
            super();
            this.mRecycle = true;
            this.mExtra = 0;
            this.mIsPreLayout = false;
            this.mScrapList = null;
        }

        public void assignPositionFromScrapList() {
            this.assignPositionFromScrapList(null);
        }

        public void assignPositionFromScrapList(View arg1) {
            arg1 = this.nextViewInLimitedList(arg1);
            this.mCurrentPosition = arg1 == null ? -1 : arg1.getLayoutParams().getViewLayoutPosition();
        }

        boolean hasMore(State arg2) {
            boolean v2 = this.mCurrentPosition < 0 || this.mCurrentPosition >= arg2.getItemCount() ? false : true;
            return v2;
        }

        void log() {
            Log.d("LLM#LayoutState", "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
        }

        View next(Recycler arg3) {
            if(this.mScrapList != null) {
                return this.nextViewFromScrapList();
            }

            View v3 = arg3.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return v3;
        }

        private View nextViewFromScrapList() {
            int v0 = this.mScrapList.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                View v2 = this.mScrapList.get(v1).itemView;
                ViewGroup$LayoutParams v3 = v2.getLayoutParams();
                if(((LayoutParams)v3).isItemRemoved()) {
                }
                else if(this.mCurrentPosition == ((LayoutParams)v3).getViewLayoutPosition()) {
                    this.assignPositionFromScrapList(v2);
                    return v2;
                }
            }

            return null;
        }

        public View nextViewInLimitedList(View arg8) {
            int v0 = this.mScrapList.size();
            View v1 = null;
            int v2 = 0x7FFFFFFF;
            int v3;
            for(v3 = 0; v3 < v0; ++v3) {
                View v4 = this.mScrapList.get(v3).itemView;
                ViewGroup$LayoutParams v5 = v4.getLayoutParams();
                if(v4 != arg8) {
                    if(((LayoutParams)v5).isItemRemoved()) {
                    }
                    else {
                        int v5_1 = (((LayoutParams)v5).getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection;
                        if(v5_1 < 0) {
                        }
                        else if(v5_1 < v2) {
                            if(v5_1 == 0) {
                                return v4;
                            }
                            else {
                                v1 = v4;
                                v2 = v5_1;
                            }
                        }
                    }
                }
            }

            return v1;
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class SavedState implements Parcelable {
        final class androidx.recyclerview.widget.LinearLayoutManager$SavedState$1 implements Parcelable$Creator {
            androidx.recyclerview.widget.LinearLayoutManager$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg2) {
                return new SavedState(arg2);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        static {
            SavedState.CREATOR = new androidx.recyclerview.widget.LinearLayoutManager$SavedState$1();
        }

        public SavedState(SavedState arg2) {
            super();
            this.mAnchorPosition = arg2.mAnchorPosition;
            this.mAnchorOffset = arg2.mAnchorOffset;
            this.mAnchorLayoutFromEnd = arg2.mAnchorLayoutFromEnd;
        }

        public SavedState() {
            super();
        }

        SavedState(Parcel arg2) {
            super();
            this.mAnchorPosition = arg2.readInt();
            this.mAnchorOffset = arg2.readInt();
            boolean v0 = true;
            if(arg2.readInt() == 1) {
            }
            else {
                v0 = false;
            }

            this.mAnchorLayoutFromEnd = v0;
        }

        public int describeContents() {
            return 0;
        }

        boolean hasValidAnchor() {
            boolean v0 = this.mAnchorPosition >= 0 ? true : false;
            return v0;
        }

        void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public void writeToParcel(Parcel arg1, int arg2) {
            arg1.writeInt(this.mAnchorPosition);
            arg1.writeInt(this.mAnchorOffset);
            arg1.writeInt(this.mAnchorLayoutFromEnd);
        }
    }

    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = 0x80000000;
    private static final float MAX_SCROLL_FACTOR = 0.333333f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(Context arg3) {
        this(arg3, 1, false);
    }

    public LinearLayoutManager(Context arg2, int arg3, boolean arg4) {
        super();
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.setOrientation(arg3);
        this.setReverseLayout(arg4);
    }

    public LinearLayoutManager(Context arg3, AttributeSet arg4, int arg5, int arg6) {
        super();
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        Properties v3 = LinearLayoutManager.getProperties(arg3, arg4, arg5, arg6);
        this.setOrientation(v3.orientation);
        this.setReverseLayout(v3.reverseLayout);
        this.setStackFromEnd(v3.stackFromEnd);
    }

    public void assertNotInLayoutOrScroll(String arg2) {
        if(this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(arg2);
        }
    }

    public boolean canScrollHorizontally() {
        boolean v0 = this.mOrientation == 0 ? true : false;
        return v0;
    }

    public boolean canScrollVertically() {
        boolean v1 = true;
        if(this.mOrientation == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public void collectAdjacentPrefetchPositions(int arg2, int arg3, State arg4, LayoutPrefetchRegistry arg5) {
        if(this.mOrientation == 0) {
        }
        else {
            arg2 = arg3;
        }

        if(this.getChildCount() != 0) {
            if(arg2 == 0) {
            }
            else {
                this.ensureLayoutState();
                int v0 = arg2 > 0 ? 1 : -1;
                this.updateLayoutState(v0, Math.abs(arg2), true, arg4);
                this.collectPrefetchPositionsForLayoutState(arg4, this.mLayoutState, arg5);
                return;
            }
        }
    }

    public void collectInitialPrefetchPositions(int arg6, LayoutPrefetchRegistry arg7) {
        int v3;
        boolean v0;
        int v1 = -1;
        if(this.mPendingSavedState == null || !this.mPendingSavedState.hasValidAnchor()) {
            this.resolveShouldLayoutReverse();
            v0 = this.mShouldReverseLayout;
            if(this.mPendingScrollPosition != v1) {
                v3 = this.mPendingScrollPosition;
            }
            else if(v0) {
                v3 = arg6 - 1;
            }
            else {
                v3 = 0;
            }
        }
        else {
            v0 = this.mPendingSavedState.mAnchorLayoutFromEnd;
            v3 = this.mPendingSavedState.mAnchorPosition;
        }

        if(v0) {
        }
        else {
            v1 = 1;
        }

        int v0_1;
        for(v0_1 = 0; v0_1 < this.mInitialPrefetchItemCount; ++v0_1) {
            if(v3 < 0) {
                return;
            }

            if(v3 >= arg6) {
                return;
            }

            arg7.addPosition(v3, 0);
            v3 += v1;
        }
    }

    void collectPrefetchPositionsForLayoutState(State arg2, LayoutState arg3, LayoutPrefetchRegistry arg4) {
        int v0 = arg3.mCurrentPosition;
        if(v0 >= 0 && v0 < arg2.getItemCount()) {
            arg4.addPosition(v0, Math.max(0, arg3.mScrollingOffset));
        }
    }

    public int computeHorizontalScrollExtent(State arg1) {
        return this.computeScrollExtent(arg1);
    }

    public int computeHorizontalScrollOffset(State arg1) {
        return this.computeScrollOffset(arg1);
    }

    public int computeHorizontalScrollRange(State arg1) {
        return this.computeScrollRange(arg1);
    }

    private int computeScrollExtent(State arg7) {
        if(this.getChildCount() == 0) {
            return 0;
        }

        this.ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(arg7, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true), this.findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State arg8) {
        if(this.getChildCount() == 0) {
            return 0;
        }

        this.ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(arg8, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true), this.findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State arg7) {
        if(this.getChildCount() == 0) {
            return 0;
        }

        this.ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(arg7, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true), this.findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled);
    }

    public PointF computeScrollVectorForPosition(int arg4) {
        if(this.getChildCount() == 0) {
            return null;
        }

        boolean v0 = false;
        int v2 = 1;
        if(arg4 < this.getPosition(this.getChildAt(0))) {
            v0 = true;
        }

        if(v0 != this.mShouldReverseLayout) {
            v2 = -1;
        }

        if(this.mOrientation == 0) {
            return new PointF(((float)v2), 0f);
        }

        return new PointF(0f, ((float)v2));
    }

    public int computeVerticalScrollExtent(State arg1) {
        return this.computeScrollExtent(arg1);
    }

    public int computeVerticalScrollOffset(State arg1) {
        return this.computeScrollOffset(arg1);
    }

    public int computeVerticalScrollRange(State arg1) {
        return this.computeScrollRange(arg1);
    }

    int convertFocusDirectionToLayoutDirection(int arg5) {
        int v1 = -1;
        int v2 = 0x80000000;
        if(arg5 == 17) {
            goto label_40;
        }

        if(arg5 == 33) {
            goto label_35;
        }

        if(arg5 == 66) {
            goto label_31;
        }

        if(arg5 == 130) {
            goto label_27;
        }

        switch(arg5) {
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_13;
            }
        }

        return v2;
    label_20:
        if(this.mOrientation == 1) {
            return v1;
        }

        if(this.isLayoutRTL()) {
            return 1;
        }

        return v1;
    label_13:
        if(this.mOrientation == 1) {
            return 1;
        }

        if(this.isLayoutRTL()) {
            return v1;
        }

        return 1;
    label_27:
        if(this.mOrientation == 1) {
            v2 = 1;
        }

        return v2;
    label_31:
        if(this.mOrientation == 0) {
            v2 = 1;
        }

        return v2;
    label_35:
        if(this.mOrientation == 1) {
        }
        else {
            v1 = 0x80000000;
        }

        return v1;
    label_40:
        if(this.mOrientation == 0) {
        }
        else {
            v1 = 0x80000000;
        }

        return v1;
    }

    LayoutState createLayoutState() {
        return new LayoutState();
    }

    void ensureLayoutState() {
        if(this.mLayoutState == null) {
            this.mLayoutState = this.createLayoutState();
        }
    }

    int fill(Recycler arg8, LayoutState arg9, State arg10, boolean arg11) {
        int v0 = arg9.mAvailable;
        int v2 = 0x80000000;
        if(arg9.mScrollingOffset != v2) {
            if(arg9.mAvailable < 0) {
                arg9.mScrollingOffset += arg9.mAvailable;
            }

            this.recycleByLayoutState(arg8, arg9);
        }

        int v1 = arg9.mAvailable + arg9.mExtra;
        LayoutChunkResult v3 = this.mLayoutChunkResult;
        do {
            if(!arg9.mInfinite && v1 <= 0) {
                break;
            }

            if(!arg9.hasMore(arg10)) {
                break;
            }

            v3.resetInternal();
            this.layoutChunk(arg8, arg10, arg9, v3);
            if(v3.mFinished) {
            }
            else {
                arg9.mOffset += v3.mConsumed * arg9.mLayoutDirection;
                if(!v3.mIgnoreConsumed || this.mLayoutState.mScrapList != null || !arg10.isPreLayout()) {
                    arg9.mAvailable -= v3.mConsumed;
                    v1 -= v3.mConsumed;
                }

                if(arg9.mScrollingOffset != v2) {
                    arg9.mScrollingOffset += v3.mConsumed;
                    if(arg9.mAvailable < 0) {
                        arg9.mScrollingOffset += arg9.mAvailable;
                    }

                    this.recycleByLayoutState(arg8, arg9);
                }

                if(!arg11) {
                    continue;
                }

                if(!v3.mFocusable) {
                    continue;
                }
            }

            break;
        }
        while(true);

        return v0 - arg9.mAvailable;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View v0 = this.findOneVisibleChild(0, this.getChildCount(), true, false);
        int v0_1 = v0 == null ? -1 : this.getPosition(v0);
        return v0_1;
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild(Recycler arg1, State arg2) {
        return this.findOnePartiallyOrCompletelyInvisibleChild(0, this.getChildCount());
    }

    private View findFirstReferenceChild(Recycler arg7, State arg8) {
        return this.findReferenceChild(arg7, arg8, 0, this.getChildCount(), arg8.getItemCount());
    }

    private View findFirstVisibleChildClosestToEnd(boolean arg3, boolean arg4) {
        if(this.mShouldReverseLayout) {
            return this.findOneVisibleChild(0, this.getChildCount(), arg3, arg4);
        }

        return this.findOneVisibleChild(this.getChildCount() - 1, -1, arg3, arg4);
    }

    private View findFirstVisibleChildClosestToStart(boolean arg3, boolean arg4) {
        if(this.mShouldReverseLayout) {
            return this.findOneVisibleChild(this.getChildCount() - 1, -1, arg3, arg4);
        }

        return this.findOneVisibleChild(0, this.getChildCount(), arg3, arg4);
    }

    public int findFirstVisibleItemPosition() {
        View v0 = this.findOneVisibleChild(0, this.getChildCount(), false, true);
        int v0_1 = v0 == null ? -1 : this.getPosition(v0);
        return v0_1;
    }

    public int findLastCompletelyVisibleItemPosition() {
        int v2 = -1;
        View v0 = this.findOneVisibleChild(this.getChildCount() - 1, v2, true, false);
        if(v0 == null) {
        }
        else {
            v2 = this.getPosition(v0);
        }

        return v2;
    }

    private View findLastPartiallyOrCompletelyInvisibleChild(Recycler arg1, State arg2) {
        return this.findOnePartiallyOrCompletelyInvisibleChild(this.getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(Recycler arg8, State arg9) {
        return this.findReferenceChild(arg8, arg9, this.getChildCount() - 1, -1, arg9.getItemCount());
    }

    public int findLastVisibleItemPosition() {
        int v2 = -1;
        View v0 = this.findOneVisibleChild(this.getChildCount() - 1, v2, false, true);
        if(v0 == null) {
        }
        else {
            v2 = this.getPosition(v0);
        }

        return v2;
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int arg4, int arg5) {
        int v1;
        int v0;
        this.ensureLayoutState();
        if(arg5 > arg4) {
            v0 = 1;
        }
        else if(arg5 < arg4) {
            v0 = -1;
        }
        else {
            v0 = 0;
        }

        if(v0 == 0) {
            return this.getChildAt(arg4);
        }

        if(this.mOrientationHelper.getDecoratedStart(this.getChildAt(arg4)) < this.mOrientationHelper.getStartAfterPadding()) {
            v0 = 0x4104;
            v1 = 0x4004;
        }
        else {
            v0 = 0x1041;
            v1 = 0x1001;
        }

        View v4 = this.mOrientation == 0 ? this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(arg4, arg5, v0, v1) : this.mVerticalBoundCheck.findOneViewWithinBoundFlags(arg4, arg5, v0, v1);
        return v4;
    }

    View findOneVisibleChild(int arg2, int arg3, boolean arg4, boolean arg5) {
        this.ensureLayoutState();
        int v0 = 320;
        int v4 = arg4 ? 0x6003 : 320;
        if(arg5) {
        }
        else {
            v0 = 0;
        }

        View v2 = this.mOrientation == 0 ? this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(arg2, arg3, v4, v0) : this.mVerticalBoundCheck.findOneViewWithinBoundFlags(arg2, arg3, v4, v0);
        return v2;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(Recycler arg2, State arg3) {
        View v2 = this.mShouldReverseLayout ? this.findFirstPartiallyOrCompletelyInvisibleChild(arg2, arg3) : this.findLastPartiallyOrCompletelyInvisibleChild(arg2, arg3);
        return v2;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart(Recycler arg2, State arg3) {
        View v2 = this.mShouldReverseLayout ? this.findLastPartiallyOrCompletelyInvisibleChild(arg2, arg3) : this.findFirstPartiallyOrCompletelyInvisibleChild(arg2, arg3);
        return v2;
    }

    View findReferenceChild(Recycler arg6, State arg7, int arg8, int arg9, int arg10) {
        this.ensureLayoutState();
        int v6 = this.mOrientationHelper.getStartAfterPadding();
        int v7 = this.mOrientationHelper.getEndAfterPadding();
        int v0 = arg9 > arg8 ? 1 : -1;
        View v1 = null;
        View v2 = v1;
        while(arg8 != arg9) {
            View v3 = this.getChildAt(arg8);
            int v4 = this.getPosition(v3);
            if(v4 >= 0 && v4 < arg10) {
                if(!v3.getLayoutParams().isItemRemoved()) {
                    if(this.mOrientationHelper.getDecoratedStart(v3) < v7) {
                        if(this.mOrientationHelper.getDecoratedEnd(v3) < v6) {
                        }
                        else {
                            return v3;
                        }
                    }

                    if(v1 != null) {
                        goto label_32;
                    }

                    v1 = v3;
                }
                else if(v2 == null) {
                    v2 = v3;
                }
            }

        label_32:
            arg8 += v0;
        }

        if(v1 != null) {
        }
        else {
            v1 = v2;
        }

        return v1;
    }

    private View findReferenceChildClosestToEnd(Recycler arg2, State arg3) {
        View v2 = this.mShouldReverseLayout ? this.findFirstReferenceChild(arg2, arg3) : this.findLastReferenceChild(arg2, arg3);
        return v2;
    }

    private View findReferenceChildClosestToStart(Recycler arg2, State arg3) {
        View v2 = this.mShouldReverseLayout ? this.findLastReferenceChild(arg2, arg3) : this.findFirstReferenceChild(arg2, arg3);
        return v2;
    }

    public View findViewByPosition(int arg3) {
        int v0 = this.getChildCount();
        if(v0 == 0) {
            return null;
        }

        int v1 = arg3 - this.getPosition(this.getChildAt(0));
        if(v1 >= 0 && v1 < v0) {
            View v0_1 = this.getChildAt(v1);
            if(this.getPosition(v0_1) == arg3) {
                return v0_1;
            }
        }

        return super.findViewByPosition(arg3);
    }

    private int fixLayoutEndGap(int arg2, Recycler arg3, State arg4, boolean arg5) {
        int v0 = this.mOrientationHelper.getEndAfterPadding() - arg2;
        if(v0 > 0) {
            int v3 = -this.scrollBy(-v0, arg3, arg4);
            arg2 += v3;
            if(arg5) {
                int v4 = this.mOrientationHelper.getEndAfterPadding() - arg2;
                if(v4 > 0) {
                    this.mOrientationHelper.offsetChildren(v4);
                    return v4 + v3;
                }
            }

            return v3;
        }

        return 0;
    }

    private int fixLayoutStartGap(int arg2, Recycler arg3, State arg4, boolean arg5) {
        int v0 = arg2 - this.mOrientationHelper.getStartAfterPadding();
        if(v0 > 0) {
            int v3 = -this.scrollBy(v0, arg3, arg4);
            arg2 += v3;
            if(arg5) {
                arg2 -= this.mOrientationHelper.getStartAfterPadding();
                if(arg2 > 0) {
                    this.mOrientationHelper.offsetChildren(-arg2);
                    return v3 - arg2;
                }
            }

            return v3;
        }

        return 0;
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private View getChildClosestToEnd() {
        int v0 = this.mShouldReverseLayout ? 0 : this.getChildCount() - 1;
        return this.getChildAt(v0);
    }

    private View getChildClosestToStart() {
        int v0 = this.mShouldReverseLayout ? this.getChildCount() - 1 : 0;
        return this.getChildAt(v0);
    }

    protected int getExtraLayoutSpace(State arg1) {
        if(arg1.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }

        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return 1;
    }

    protected boolean isLayoutRTL() {
        boolean v1 = true;
        if(this.getLayoutDirection() == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(Recycler arg8, State arg9, LayoutState arg10, LayoutChunkResult arg11) {
        int v5;
        int v4;
        int v3_1;
        int v2;
        int v0_1;
        boolean v3;
        boolean v0;
        View v8 = arg10.next(arg8);
        if(v8 == null) {
            arg11.mFinished = true;
            return;
        }

        ViewGroup$LayoutParams v6 = v8.getLayoutParams();
        int v1 = -1;
        if(arg10.mScrapList == null) {
            v0 = this.mShouldReverseLayout;
            v3 = arg10.mLayoutDirection == v1 ? true : false;
            if(v0 == v3) {
                this.addView(v8);
                goto label_32;
            }

            this.addView(v8, 0);
        }
        else {
            v0 = this.mShouldReverseLayout;
            v3 = arg10.mLayoutDirection == v1 ? true : false;
            if(v0 == v3) {
                this.addDisappearingView(v8);
                goto label_32;
            }

            this.addDisappearingView(v8, 0);
        }

    label_32:
        this.measureChildWithMargins(v8, 0, 0);
        arg11.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(v8);
        if(this.mOrientation == 1) {
            if(this.isLayoutRTL()) {
                v0_1 = this.getWidth() - this.getPaddingRight();
                v2 = v0_1 - this.mOrientationHelper.getDecoratedMeasurementInOther(v8);
            }
            else {
                v2 = this.getPaddingLeft();
                v0_1 = this.mOrientationHelper.getDecoratedMeasurementInOther(v8) + v2;
            }

            if(arg10.mLayoutDirection == v1) {
                v1 = arg10.mOffset;
                v3_1 = arg10.mOffset - arg11.mConsumed;
                v4 = v0_1;
                v5 = v1;
                goto label_92;
            }

            v1 = arg10.mOffset;
            v5 = arg10.mOffset + arg11.mConsumed;
            v4 = v0_1;
            v3_1 = v1;
        }
        else {
            v0_1 = this.getPaddingTop();
            v2 = this.mOrientationHelper.getDecoratedMeasurementInOther(v8) + v0_1;
            if(arg10.mLayoutDirection == v1) {
                v3_1 = v0_1;
                v4 = arg10.mOffset;
                v5 = v2;
                v2 = arg10.mOffset - arg11.mConsumed;
                goto label_92;
            }

            v1 = arg10.mOffset;
            v4 = arg10.mOffset + arg11.mConsumed;
            v3_1 = v0_1;
            v5 = v2;
            v2 = v1;
        }

    label_92:
        this.layoutDecoratedWithMargins(v8, v2, v3_1, v4, v5);
        if((((LayoutParams)v6).isItemRemoved()) || (((LayoutParams)v6).isItemChanged())) {
            arg11.mIgnoreConsumed = true;
        }

        arg11.mFocusable = v8.hasFocusable();
    }

    private void layoutForPredictiveAnimations(Recycler arg16, State arg17, int arg18, int arg19) {
        LinearLayoutManager v0 = this;
        Recycler v1 = arg16;
        State v2 = arg17;
        if((arg17.willRunPredictiveAnimations()) && this.getChildCount() != 0 && !arg17.isPreLayout()) {
            if(!this.supportsPredictiveItemAnimations()) {
            }
            else {
                List v3 = arg16.getScrapList();
                int v4 = v3.size();
                int v6 = this.getPosition(this.getChildAt(0));
                int v7 = 0;
                int v8 = 0;
                int v9 = 0;
                while(v7 < v4) {
                    Object v10 = v3.get(v7);
                    if(((ViewHolder)v10).isRemoved()) {
                    }
                    else {
                        int v12 = 1;
                        boolean v11 = ((ViewHolder)v10).getLayoutPosition() < v6 ? true : false;
                        int v14 = -1;
                        if(v11 != v0.mShouldReverseLayout) {
                            v12 = -1;
                        }

                        if(v12 == v14) {
                            v8 += v0.mOrientationHelper.getDecoratedMeasurement(((ViewHolder)v10).itemView);
                            goto label_45;
                        }

                        v9 += v0.mOrientationHelper.getDecoratedMeasurement(((ViewHolder)v10).itemView);
                    }

                label_45:
                    ++v7;
                }

                v0.mLayoutState.mScrapList = v3;
                if(v8 > 0) {
                    this.updateLayoutStateToFillStart(this.getPosition(this.getChildClosestToStart()), arg18);
                    v0.mLayoutState.mExtra = v8;
                    v0.mLayoutState.mAvailable = 0;
                    v0.mLayoutState.assignPositionFromScrapList();
                    this.fill(v1, v0.mLayoutState, v2, false);
                }

                if(v9 > 0) {
                    this.updateLayoutStateToFillEnd(this.getPosition(this.getChildClosestToEnd()), arg19);
                    v0.mLayoutState.mExtra = v9;
                    v0.mLayoutState.mAvailable = 0;
                    v0.mLayoutState.assignPositionFromScrapList();
                    this.fill(v1, v0.mLayoutState, v2, false);
                }

                v0.mLayoutState.mScrapList = null;
                return;
            }
        }
    }

    private void logChildren() {
        Log.d("LinearLayoutManager", "internal representation of views on the screen");
        int v0;
        for(v0 = 0; v0 < this.getChildCount(); ++v0) {
            View v1 = this.getChildAt(v0);
            Log.d("LinearLayoutManager", "item " + this.getPosition(v1) + ", coord:" + this.mOrientationHelper.getDecoratedStart(v1));
        }

        Log.d("LinearLayoutManager", "==============");
    }

    void onAnchorReady(Recycler arg1, State arg2, AnchorInfo arg3, int arg4) {
    }

    public void onDetachedFromWindow(RecyclerView arg1, Recycler arg2) {
        super.onDetachedFromWindow(arg1, arg2);
        if(this.mRecycleChildrenOnDetach) {
            this.removeAndRecycleAllViews(arg2);
            arg2.clear();
        }
    }

    public View onFocusSearchFailed(View arg4, int arg5, Recycler arg6, State arg7) {
        this.resolveShouldLayoutReverse();
        View v0 = null;
        if(this.getChildCount() == 0) {
            return v0;
        }

        int v4 = this.convertFocusDirectionToLayoutDirection(arg5);
        arg5 = 0x80000000;
        if(v4 == arg5) {
            return v0;
        }

        this.ensureLayoutState();
        this.ensureLayoutState();
        this.updateLayoutState(v4, ((int)((((float)this.mOrientationHelper.getTotalSpace())) * 0.333333f)), false, arg7);
        this.mLayoutState.mScrollingOffset = arg5;
        this.mLayoutState.mRecycle = false;
        this.fill(arg6, this.mLayoutState, arg7, true);
        arg5 = -1;
        View v6 = v4 == arg5 ? this.findPartiallyOrCompletelyInvisibleChildClosestToStart(arg6, arg7) : this.findPartiallyOrCompletelyInvisibleChildClosestToEnd(arg6, arg7);
        arg4 = v4 == arg5 ? this.getChildClosestToStart() : this.getChildClosestToEnd();
        if(arg4.hasFocusable()) {
            if(v6 == null) {
                return v0;
            }

            return arg4;
        }

        return v6;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent arg2) {
        super.onInitializeAccessibilityEvent(arg2);
        if(this.getChildCount() > 0) {
            arg2.setFromIndex(this.findFirstVisibleItemPosition());
            arg2.setToIndex(this.findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(Recycler arg9, State arg10) {
        int v5_1;
        int v3;
        int v1 = -1;
        if((this.mPendingSavedState != null || this.mPendingScrollPosition != v1) && arg10.getItemCount() == 0) {
            this.removeAndRecycleAllViews(arg9);
            return;
        }

        if(this.mPendingSavedState != null && (this.mPendingSavedState.hasValidAnchor())) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }

        this.ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        this.resolveShouldLayoutReverse();
        View v0 = this.getFocusedChild();
        if(!this.mAnchorInfo.mValid || this.mPendingScrollPosition != v1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            this.mAnchorInfo.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            this.updateAnchorInfoForLayout(arg9, arg10, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        else if(v0 != null) {
            if(this.mOrientationHelper.getDecoratedStart(v0) < this.mOrientationHelper.getEndAfterPadding() && this.mOrientationHelper.getDecoratedEnd(v0) > this.mOrientationHelper.getStartAfterPadding()) {
                goto label_58;
            }

            this.mAnchorInfo.assignFromViewAndKeepVisibleRect(v0, this.getPosition(v0));
        }

    label_58:
        int v0_1 = this.getExtraLayoutSpace(arg10);
        if(this.mLayoutState.mLastScrollDelta >= 0) {
            v3 = v0_1;
            v0_1 = 0;
        }
        else {
            v3 = 0;
        }

        v0_1 += this.mOrientationHelper.getStartAfterPadding();
        v3 += this.mOrientationHelper.getEndPadding();
        if((arg10.isPreLayout()) && this.mPendingScrollPosition != v1 && this.mPendingScrollPositionOffset != 0x80000000) {
            View v5 = this.findViewByPosition(this.mPendingScrollPosition);
            if(v5 != null) {
                int v6 = this.mShouldReverseLayout ? this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(v5) - this.mPendingScrollPositionOffset : this.mPendingScrollPositionOffset - (this.mOrientationHelper.getDecoratedStart(v5) - this.mOrientationHelper.getStartAfterPadding());
                if(v6 > 0) {
                    v0_1 += v6;
                    goto label_103;
                }

                v3 -= v6;
            }
        }

    label_103:
        if(this.mAnchorInfo.mLayoutFromEnd) {
            if(!this.mShouldReverseLayout) {
                goto label_112;
            }

            goto label_108;
        }
        else if(!this.mShouldReverseLayout) {
        label_108:
            v1 = 1;
        }

    label_112:
        this.onAnchorReady(arg9, arg10, this.mAnchorInfo, v1);
        this.detachAndScrapAttachedViews(arg9);
        this.mLayoutState.mInfinite = this.resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = arg10.isPreLayout();
        if(this.mAnchorInfo.mLayoutFromEnd) {
            this.updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtra = v0_1;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v0_1 = this.mLayoutState.mOffset;
            v1 = this.mLayoutState.mCurrentPosition;
            if(this.mLayoutState.mAvailable > 0) {
                v3 += this.mLayoutState.mAvailable;
            }

            this.updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtra = v3;
            this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v3 = this.mLayoutState.mOffset;
            if(this.mLayoutState.mAvailable <= 0) {
                goto label_209;
            }

            v5_1 = this.mLayoutState.mAvailable;
            this.updateLayoutStateToFillStart(v1, v0_1);
            this.mLayoutState.mExtra = v5_1;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v0_1 = this.mLayoutState.mOffset;
        }
        else {
            this.updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtra = v3;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v3 = this.mLayoutState.mOffset;
            v1 = this.mLayoutState.mCurrentPosition;
            if(this.mLayoutState.mAvailable > 0) {
                v0_1 += this.mLayoutState.mAvailable;
            }

            this.updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtra = v0_1;
            this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v0_1 = this.mLayoutState.mOffset;
            if(this.mLayoutState.mAvailable <= 0) {
                goto label_209;
            }

            v5_1 = this.mLayoutState.mAvailable;
            this.updateLayoutStateToFillEnd(v1, v3);
            this.mLayoutState.mExtra = v5_1;
            this.fill(arg9, this.mLayoutState, arg10, false);
            v3 = this.mLayoutState.mOffset;
        }

    label_209:
        if(this.getChildCount() > 0) {
            if((this.mShouldReverseLayout ^ this.mStackFromEnd) != 0) {
                v1 = this.fixLayoutEndGap(v3, arg9, arg10, true);
                v0_1 += v1;
                v3 += v1;
                v1 = this.fixLayoutStartGap(v0_1, arg9, arg10, false);
                v0_1 += v1;
                v3 += v1;
            }
            else {
                v1 = this.fixLayoutStartGap(v0_1, arg9, arg10, true);
                v0_1 += v1;
                v3 += v1;
                v1 = this.fixLayoutEndGap(v3, arg9, arg10, false);
                v0_1 += v1;
                v3 += v1;
            }
        }

        this.layoutForPredictiveAnimations(arg9, arg10, v0_1, v3);
        if(!arg10.isPreLayout()) {
            this.mOrientationHelper.onLayoutComplete();
        }
        else {
            this.mAnchorInfo.reset();
        }

        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(State arg1) {
        super.onLayoutCompleted(arg1);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mAnchorInfo.reset();
    }

    public void onRestoreInstanceState(Parcelable arg2) {
        if((arg2 instanceof SavedState)) {
            this.mPendingSavedState = ((SavedState)arg2);
            this.requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        View v1_1;
        if(this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }

        SavedState v0 = new SavedState();
        if(this.getChildCount() > 0) {
            this.ensureLayoutState();
            int v1 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            v0.mAnchorLayoutFromEnd = ((boolean)v1);
            if(v1 != 0) {
                v1_1 = this.getChildClosestToEnd();
                v0.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(v1_1);
                v0.mAnchorPosition = this.getPosition(v1_1);
            }
            else {
                v1_1 = this.getChildClosestToStart();
                v0.mAnchorPosition = this.getPosition(v1_1);
                v0.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(v1_1) - this.mOrientationHelper.getStartAfterPadding();
            }
        }
        else {
            v0.invalidateAnchor();
        }

        return ((Parcelable)v0);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void prepareForDrop(@NonNull View arg4, @NonNull View arg5, int arg6, int arg7) {
        this.assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        this.ensureLayoutState();
        this.resolveShouldLayoutReverse();
        arg6 = this.getPosition(arg4);
        arg7 = this.getPosition(arg5);
        int v0 = -1;
        arg6 = arg6 < arg7 ? 1 : -1;
        if(this.mShouldReverseLayout) {
            if(arg6 == 1) {
                this.scrollToPositionWithOffset(arg7, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(arg5) + this.mOrientationHelper.getDecoratedMeasurement(arg4)));
            }
            else {
                this.scrollToPositionWithOffset(arg7, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(arg5));
            }
        }
        else if(arg6 == v0) {
            this.scrollToPositionWithOffset(arg7, this.mOrientationHelper.getDecoratedStart(arg5));
        }
        else {
            this.scrollToPositionWithOffset(arg7, this.mOrientationHelper.getDecoratedEnd(arg5) - this.mOrientationHelper.getDecoratedMeasurement(arg4));
        }
    }

    private void recycleByLayoutState(Recycler arg3, LayoutState arg4) {
        if(arg4.mRecycle) {
            if(arg4.mInfinite) {
            }
            else {
                if(arg4.mLayoutDirection == -1) {
                    this.recycleViewsFromEnd(arg3, arg4.mScrollingOffset);
                }
                else {
                    this.recycleViewsFromStart(arg3, arg4.mScrollingOffset);
                }

                return;
            }
        }
    }

    private void recycleChildren(Recycler arg1, int arg2, int arg3) {
        if(arg2 == arg3) {
            return;
        }

        if(arg3 > arg2) {
            --arg3;
            while(arg3 >= arg2) {
                this.removeAndRecycleViewAt(arg3, arg1);
                --arg3;
            }
        }
        else {
            while(arg2 > arg3) {
                this.removeAndRecycleViewAt(arg2, arg1);
                --arg2;
            }
        }
    }

    private void recycleViewsFromEnd(Recycler arg6, int arg7) {
        int v0 = this.getChildCount();
        if(arg7 < 0) {
            return;
        }

        int v1 = this.mOrientationHelper.getEnd() - arg7;
        if(this.mShouldReverseLayout) {
            int v2 = 0;
            while(true) {
                if(v2 < v0) {
                    View v3 = this.getChildAt(v2);
                    if(this.mOrientationHelper.getDecoratedStart(v3) >= v1) {
                        if(this.mOrientationHelper.getTransformedStartWithDecoration(v3) < v1) {
                        }
                        else {
                            ++v2;
                            continue;
                        }
                    }

                    break;
                }

                return;
            }

            this.recycleChildren(arg6, 0, v2);
            return;
        }
        else {
            --v0;
            arg7 = v0;
            while(true) {
                if(arg7 < 0) {
                    return;
                }

                View v2_1 = this.getChildAt(arg7);
                if(this.mOrientationHelper.getDecoratedStart(v2_1) >= v1) {
                    if(this.mOrientationHelper.getTransformedStartWithDecoration(v2_1) < v1) {
                    }
                    else {
                        --arg7;
                        continue;
                    }
                }

                break;
            }

            this.recycleChildren(arg6, v0, arg7);
            return;
        }
    }

    private void recycleViewsFromStart(Recycler arg6, int arg7) {
        if(arg7 < 0) {
            return;
        }

        int v0 = this.getChildCount();
        if(this.mShouldReverseLayout) {
            --v0;
            int v1 = v0;
            while(true) {
                if(v1 >= 0) {
                    View v2 = this.getChildAt(v1);
                    if(this.mOrientationHelper.getDecoratedEnd(v2) <= arg7) {
                        if(this.mOrientationHelper.getTransformedEndWithDecoration(v2) > arg7) {
                        }
                        else {
                            --v1;
                            continue;
                        }
                    }

                    break;
                }

                return;
            }

            this.recycleChildren(arg6, v0, v1);
            return;
        }
        else {
            int v2_1 = 0;
            while(true) {
                if(v2_1 >= v0) {
                    return;
                }

                View v3 = this.getChildAt(v2_1);
                if(this.mOrientationHelper.getDecoratedEnd(v3) <= arg7) {
                    if(this.mOrientationHelper.getTransformedEndWithDecoration(v3) > arg7) {
                    }
                    else {
                        ++v2_1;
                        continue;
                    }
                }

                break;
            }

            this.recycleChildren(arg6, 0, v2_1);
            return;
        }
    }

    boolean resolveIsInfinite() {
        boolean v0 = this.mOrientationHelper.getMode() != 0 || this.mOrientationHelper.getEnd() != 0 ? false : true;
        return v0;
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = this.mOrientation == 1 || !this.isLayoutRTL() ? this.mReverseLayout : this.mReverseLayout ^ 1;
    }

    int scrollBy(int arg6, Recycler arg7, State arg8) {
        if(this.getChildCount() != 0) {
            if(arg6 == 0) {
            }
            else {
                this.mLayoutState.mRecycle = true;
                this.ensureLayoutState();
                int v0 = arg6 > 0 ? 1 : -1;
                int v3 = Math.abs(arg6);
                this.updateLayoutState(v0, v3, true, arg8);
                int v2 = this.mLayoutState.mScrollingOffset + this.fill(arg7, this.mLayoutState, arg8, false);
                if(v2 < 0) {
                    return 0;
                }

                if(v3 > v2) {
                    arg6 = v0 * v2;
                }

                this.mOrientationHelper.offsetChildren(-arg6);
                this.mLayoutState.mLastScrollDelta = arg6;
                return arg6;
            }
        }

        return 0;
    }

    public int scrollHorizontallyBy(int arg3, Recycler arg4, State arg5) {
        if(this.mOrientation == 1) {
            return 0;
        }

        return this.scrollBy(arg3, arg4, arg5);
    }

    public void scrollToPosition(int arg1) {
        this.mPendingScrollPosition = arg1;
        this.mPendingScrollPositionOffset = 0x80000000;
        if(this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchor();
        }

        this.requestLayout();
    }

    public void scrollToPositionWithOffset(int arg1, int arg2) {
        this.mPendingScrollPosition = arg1;
        this.mPendingScrollPositionOffset = arg2;
        if(this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchor();
        }

        this.requestLayout();
    }

    public int scrollVerticallyBy(int arg2, Recycler arg3, State arg4) {
        if(this.mOrientation == 0) {
            return 0;
        }

        return this.scrollBy(arg2, arg3, arg4);
    }

    public void setInitialPrefetchItemCount(int arg1) {
        this.mInitialPrefetchItemCount = arg1;
    }

    public void setOrientation(int arg4) {
        if(arg4 != 0) {
            if(arg4 == 1) {
            }
            else {
                StringBuilder v1 = new StringBuilder();
                v1.append("invalid orientation:");
                v1.append(arg4);
                throw new IllegalArgumentException(v1.toString());
            }
        }

        this.assertNotInLayoutOrScroll(null);
        if(arg4 != this.mOrientation || this.mOrientationHelper == null) {
            this.mOrientationHelper = OrientationHelper.createOrientationHelper(((LayoutManager)this), arg4);
            this.mAnchorInfo.mOrientationHelper = this.mOrientationHelper;
            this.mOrientation = arg4;
            this.requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean arg1) {
        this.mRecycleChildrenOnDetach = arg1;
    }

    public void setReverseLayout(boolean arg2) {
        this.assertNotInLayoutOrScroll(null);
        if(arg2 == this.mReverseLayout) {
            return;
        }

        this.mReverseLayout = arg2;
        this.requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean arg1) {
        this.mSmoothScrollbarEnabled = arg1;
    }

    public void setStackFromEnd(boolean arg2) {
        this.assertNotInLayoutOrScroll(null);
        if(this.mStackFromEnd == arg2) {
            return;
        }

        this.mStackFromEnd = arg2;
        this.requestLayout();
    }

    boolean shouldMeasureTwice() {
        int v1 = 0x40000000;
        boolean v0 = this.getHeightMode() == v1 || this.getWidthMode() == v1 || !this.hasFlexibleChildInBothOrientations() ? false : true;
        return v0;
    }

    public void smoothScrollToPosition(RecyclerView arg1, State arg2, int arg3) {
        LinearSmoothScroller v2 = new LinearSmoothScroller(arg1.getContext());
        v2.setTargetPosition(arg3);
        this.startSmoothScroll(((SmoothScroller)v2));
    }

    public boolean supportsPredictiveItemAnimations() {
        boolean v0 = this.mPendingSavedState != null || this.mLastStackFromEnd != this.mStackFromEnd ? false : true;
        return v0;
    }

    private boolean updateAnchorFromChildren(Recycler arg5, State arg6, AnchorInfo arg7) {
        int v1 = 0;
        if(this.getChildCount() == 0) {
            return 0;
        }

        View v0 = this.getFocusedChild();
        if(v0 != null && (arg7.isViewValidAsAnchor(v0, arg6))) {
            arg7.assignFromViewAndKeepVisibleRect(v0, this.getPosition(v0));
            return 1;
        }

        if(this.mLastStackFromEnd != this.mStackFromEnd) {
            return 0;
        }

        View v5 = arg7.mLayoutFromEnd ? this.findReferenceChildClosestToEnd(arg5, arg6) : this.findReferenceChildClosestToStart(arg5, arg6);
        if(v5 != null) {
            arg7.assignFromView(v5, this.getPosition(v5));
            if(!arg6.isPreLayout() && (this.supportsPredictiveItemAnimations())) {
                if(this.mOrientationHelper.getDecoratedStart(v5) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(v5) < this.mOrientationHelper.getStartAfterPadding()) {
                    v1 = 1;
                }

                if(v1 == 0) {
                    return 1;
                }

                int v5_1 = arg7.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
                arg7.mCoordinate = v5_1;
            }

            return 1;
        }

        return 0;
    }

    private boolean updateAnchorFromPendingData(State arg5, AnchorInfo arg6) {
        boolean v1 = false;
        if(!arg5.isPreLayout()) {
            int v2 = -1;
            if(this.mPendingScrollPosition == v2) {
            }
            else {
                int v3 = 0x80000000;
                if(this.mPendingScrollPosition >= 0) {
                    if(this.mPendingScrollPosition >= arg5.getItemCount()) {
                    }
                    else {
                        arg6.mPosition = this.mPendingScrollPosition;
                        if(this.mPendingSavedState != null && (this.mPendingSavedState.hasValidAnchor())) {
                            arg6.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
                            arg6.mCoordinate = arg6.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset : this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                            return 1;
                        }

                        if(this.mPendingScrollPositionOffset == v3) {
                            View v5 = this.findViewByPosition(this.mPendingScrollPosition);
                            if(v5 == null) {
                                if(this.getChildCount() > 0) {
                                    boolean v5_2 = this.mPendingScrollPosition < this.getPosition(this.getChildAt(0)) ? true : false;
                                    if(v5_2 == this.mShouldReverseLayout) {
                                        v1 = true;
                                    }

                                    arg6.mLayoutFromEnd = v1;
                                }

                                arg6.assignCoordinateFromPadding();
                            }
                            else if(this.mOrientationHelper.getDecoratedMeasurement(v5) > this.mOrientationHelper.getTotalSpace()) {
                                arg6.assignCoordinateFromPadding();
                                return 1;
                            }
                            else if(this.mOrientationHelper.getDecoratedStart(v5) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                                arg6.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                                arg6.mLayoutFromEnd = false;
                                return 1;
                            }
                            else if(this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(v5) < 0) {
                                arg6.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                                arg6.mLayoutFromEnd = true;
                                return 1;
                            }
                            else {
                                int v5_1 = arg6.mLayoutFromEnd ? this.mOrientationHelper.getDecoratedEnd(v5) + this.mOrientationHelper.getTotalSpaceChange() : this.mOrientationHelper.getDecoratedStart(v5);
                                arg6.mCoordinate = v5_1;
                            }

                            return 1;
                        }

                        arg6.mLayoutFromEnd = this.mShouldReverseLayout;
                        arg6.mCoordinate = this.mShouldReverseLayout ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset : this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                        return 1;
                    }
                }

                this.mPendingScrollPosition = v2;
                this.mPendingScrollPositionOffset = v3;
                return 0;
            }
        }

        return 0;
    }

    private void updateAnchorInfoForLayout(Recycler arg2, State arg3, AnchorInfo arg4) {
        if(this.updateAnchorFromPendingData(arg3, arg4)) {
            return;
        }

        if(this.updateAnchorFromChildren(arg2, arg3, arg4)) {
            return;
        }

        arg4.assignCoordinateFromPadding();
        int v2 = this.mStackFromEnd ? arg3.getItemCount() - 1 : 0;
        arg4.mPosition = v2;
    }

    private void updateLayoutState(int arg5, int arg6, boolean arg7, State arg8) {
        LayoutState v1;
        View v5;
        this.mLayoutState.mInfinite = this.resolveIsInfinite();
        this.mLayoutState.mExtra = this.getExtraLayoutSpace(arg8);
        this.mLayoutState.mLayoutDirection = arg5;
        int v8 = -1;
        if(arg5 == 1) {
            this.mLayoutState.mExtra += this.mOrientationHelper.getEndPadding();
            v5 = this.getChildClosestToEnd();
            v1 = this.mLayoutState;
            if(this.mShouldReverseLayout) {
            }
            else {
                v8 = 1;
            }

            v1.mItemDirection = v8;
            this.mLayoutState.mCurrentPosition = this.getPosition(v5) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(v5);
            arg5 = this.mOrientationHelper.getDecoratedEnd(v5) - this.mOrientationHelper.getEndAfterPadding();
        }
        else {
            v5 = this.getChildClosestToStart();
            this.mLayoutState.mExtra += this.mOrientationHelper.getStartAfterPadding();
            v1 = this.mLayoutState;
            if(this.mShouldReverseLayout) {
                v8 = 1;
            }

            v1.mItemDirection = v8;
            this.mLayoutState.mCurrentPosition = this.getPosition(v5) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(v5);
            arg5 = -this.mOrientationHelper.getDecoratedStart(v5) + this.mOrientationHelper.getStartAfterPadding();
        }

        this.mLayoutState.mAvailable = arg6;
        if(arg7) {
            this.mLayoutState.mAvailable -= arg5;
        }

        this.mLayoutState.mScrollingOffset = arg5;
    }

    private void updateLayoutStateToFillEnd(int arg4, int arg5) {
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - arg5;
        LayoutState v0 = this.mLayoutState;
        int v1 = this.mShouldReverseLayout ? -1 : 1;
        v0.mItemDirection = v1;
        this.mLayoutState.mCurrentPosition = arg4;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = arg5;
        this.mLayoutState.mScrollingOffset = 0x80000000;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo arg2) {
        this.updateLayoutStateToFillEnd(arg2.mPosition, arg2.mCoordinate);
    }

    private void updateLayoutStateToFillStart(int arg3, int arg4) {
        this.mLayoutState.mAvailable = arg4 - this.mOrientationHelper.getStartAfterPadding();
        this.mLayoutState.mCurrentPosition = arg3;
        LayoutState v3 = this.mLayoutState;
        int v1 = -1;
        int v0 = this.mShouldReverseLayout ? 1 : -1;
        v3.mItemDirection = v0;
        this.mLayoutState.mLayoutDirection = v1;
        this.mLayoutState.mOffset = arg4;
        this.mLayoutState.mScrollingOffset = 0x80000000;
    }

    private void updateLayoutStateToFillStart(AnchorInfo arg2) {
        this.updateLayoutStateToFillStart(arg2.mPosition, arg2.mCoordinate);
    }

    void validateChildOrder() {
        StringBuilder v4_1;
        int v5_1;
        int v6;
        View v5;
        int v4;
        Log.d("LinearLayoutManager", "validating child count " + this.getChildCount());
        if(this.getChildCount() < 1) {
            return;
        }

        boolean v0 = false;
        int v2 = this.getPosition(this.getChildAt(0));
        int v3 = this.mOrientationHelper.getDecoratedStart(this.getChildAt(0));
        if(this.mShouldReverseLayout) {
            v4 = 1;
            while(true) {
                if(v4 < this.getChildCount()) {
                    v5 = this.getChildAt(v4);
                    v6 = this.getPosition(v5);
                    v5_1 = this.mOrientationHelper.getDecoratedStart(v5);
                    if(v6 < v2) {
                        this.logChildren();
                        v4_1 = new StringBuilder();
                        v4_1.append("detected invalid position. loc invalid? ");
                        if(v5_1 < v3) {
                            v0 = true;
                        }

                        v4_1.append(v0);
                        throw new RuntimeException(v4_1.toString());
                    }
                    else {
                        if(v5_1 > v3) {
                            break;
                        }

                        ++v4;
                        continue;
                    }
                }

                return;
            }

            this.logChildren();
            throw new RuntimeException("detected invalid location");
        }
        else {
            for(v4 = 1; true; ++v4) {
                if(v4 >= this.getChildCount()) {
                    return;
                }

                v5 = this.getChildAt(v4);
                v6 = this.getPosition(v5);
                v5_1 = this.mOrientationHelper.getDecoratedStart(v5);
                if(v6 < v2) {
                    this.logChildren();
                    v4_1 = new StringBuilder();
                    v4_1.append("detected invalid position. loc invalid? ");
                    if(v5_1 < v3) {
                        v0 = true;
                    }

                    v4_1.append(v0);
                    throw new RuntimeException(v4_1.toString());
                }

                if(v5_1 < v3) {
                    break;
                }
            }

            this.logChildren();
            throw new RuntimeException("detected invalid location");
        }
    }
}

