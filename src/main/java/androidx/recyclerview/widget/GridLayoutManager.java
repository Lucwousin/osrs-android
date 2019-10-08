package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public final class DefaultSpanSizeLookup extends SpanSizeLookup {
        public DefaultSpanSizeLookup() {
            super();
        }

        public int getSpanIndex(int arg1, int arg2) {
            return arg1 % arg2;
        }

        public int getSpanSize(int arg1) {
            return 1;
        }
    }

    public class LayoutParams extends androidx.recyclerview.widget.RecyclerView$LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView$LayoutParams arg1) {
            super(arg1);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }

    public abstract class SpanSizeLookup {
        private boolean mCacheSpanIndices;
        final SparseIntArray mSpanIndexCache;

        public SpanSizeLookup() {
            super();
            this.mSpanIndexCache = new SparseIntArray();
            this.mCacheSpanIndices = false;
        }

        int findReferenceIndexFromCache(int arg5) {
            int v0 = this.mSpanIndexCache.size() - 1;
            int v1 = 0;
            while(v1 <= v0) {
                int v2 = v1 + v0 >>> 1;
                if(this.mSpanIndexCache.keyAt(v2) < arg5) {
                    v1 = v2 + 1;
                    continue;
                }

                v0 = v2 - 1;
            }

            --v1;
            if(v1 >= 0 && v1 < this.mSpanIndexCache.size()) {
                return this.mSpanIndexCache.keyAt(v1);
            }

            return -1;
        }

        int getCachedSpanIndex(int arg3, int arg4) {
            if(!this.mCacheSpanIndices) {
                return this.getSpanIndex(arg3, arg4);
            }

            int v0 = this.mSpanIndexCache.get(arg3, -1);
            if(v0 != -1) {
                return v0;
            }

            arg4 = this.getSpanIndex(arg3, arg4);
            this.mSpanIndexCache.put(arg3, arg4);
            return arg4;
        }

        public int getSpanGroupIndex(int arg7, int arg8) {
            int v0 = this.getSpanSize(arg7);
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            while(v2 < arg7) {
                int v5 = this.getSpanSize(v2);
                v3 += v5;
                if(v3 == arg8) {
                    ++v4;
                    v3 = 0;
                }
                else if(v3 > arg8) {
                    ++v4;
                    v3 = v5;
                }

                ++v2;
            }

            if(v3 + v0 > arg8) {
                ++v4;
            }

            return v4;
        }

        public int getSpanIndex(int arg6, int arg7) {
            int v3;
            int v2;
            int v0 = this.getSpanSize(arg6);
            if(v0 == arg7) {
                return 0;
            }

            if(!this.mCacheSpanIndices || this.mSpanIndexCache.size() <= 0) {
            label_17:
                v2 = 0;
                v3 = 0;
            }
            else {
                v2 = this.findReferenceIndexFromCache(arg6);
                if(v2 >= 0) {
                    v3 = this.mSpanIndexCache.get(v2) + this.getSpanSize(v2);
                    ++v2;
                }
                else {
                    goto label_17;
                }
            }

            while(v2 < arg6) {
                int v4 = this.getSpanSize(v2);
                v3 += v4;
                if(v3 == arg7) {
                    v3 = 0;
                }
                else if(v3 > arg7) {
                    v3 = v4;
                }

                ++v2;
            }

            if(v0 + v3 <= arg7) {
                return v3;
            }

            return 0;
        }

        public abstract int getSpanSize(int arg1);

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean arg1) {
            this.mCacheSpanIndices = arg1;
        }
    }

    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;

    public GridLayoutManager(Context arg1, int arg2) {
        super(arg1);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.setSpanCount(arg2);
    }

    public GridLayoutManager(Context arg1, int arg2, int arg3, boolean arg4) {
        super(arg1, arg3, arg4);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.setSpanCount(arg2);
    }

    public GridLayoutManager(Context arg2, AttributeSet arg3, int arg4, int arg5) {
        super(arg2, arg3, arg4, arg5);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.setSpanCount(GridLayoutManager.getProperties(arg2, arg3, arg4, arg5).spanCount);
    }

    private void assignSpans(Recycler arg4, State arg5, int arg6, int arg7, boolean arg8) {
        int v8;
        arg7 = -1;
        int v0 = 0;
        if(arg8) {
            arg7 = arg6;
            arg6 = 0;
            v8 = 1;
        }
        else {
            --arg6;
            v8 = -1;
        }

        while(arg6 != arg7) {
            View v1 = this.mSet[arg6];
            ViewGroup$LayoutParams v2 = v1.getLayoutParams();
            ((LayoutParams)v2).mSpanSize = this.getSpanSize(arg4, arg5, this.getPosition(v1));
            ((LayoutParams)v2).mSpanIndex = v0;
            v0 += ((LayoutParams)v2).mSpanSize;
            arg6 += v8;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int v0 = this.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            ViewGroup$LayoutParams v2 = this.getChildAt(v1).getLayoutParams();
            int v3 = ((LayoutParams)v2).getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(v3, ((LayoutParams)v2).getSpanSize());
            this.mPreLayoutSpanIndexCache.put(v3, ((LayoutParams)v2).getSpanIndex());
        }
    }

    private void calculateItemBorders(int arg3) {
        this.mCachedBorders = GridLayoutManager.calculateItemBorders(this.mCachedBorders, this.mSpanCount, arg3);
    }

    static int[] calculateItemBorders(int[] arg5, int arg6, int arg7) {
        int v4;
        int v0 = 1;
        if(arg5 == null || arg5.length != arg6 + 1 || arg5[arg5.length - 1] != arg7) {
            arg5 = new int[arg6 + 1];
        }

        int v1 = 0;
        arg5[v1] = v1;
        int v2 = arg7 / arg6;
        arg7 %= arg6;
        int v3 = 0;
        while(v0 <= arg6) {
            v1 += arg7;
            if(v1 <= 0 || arg6 - v1 >= arg7) {
                v4 = v2;
            }
            else {
                v4 = v2 + 1;
                v1 -= arg6;
            }

            v3 += v4;
            arg5[v0] = v3;
            ++v0;
        }

        return arg5;
    }

    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    void collectPrefetchPositionsForLayoutState(State arg6, LayoutState arg7, LayoutPrefetchRegistry arg8) {
        int v2 = this.mSpanCount;
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            if(!arg7.hasMore(arg6)) {
                return;
            }

            if(v2 <= 0) {
                return;
            }

            int v3 = arg7.mCurrentPosition;
            arg8.addPosition(v3, Math.max(0, arg7.mScrollingOffset));
            v2 -= this.mSpanSizeLookup.getSpanSize(v3);
            arg7.mCurrentPosition += arg7.mItemDirection;
        }
    }

    private void ensureAnchorIsInCorrectSpan(Recycler arg5, State arg6, AnchorInfo arg7, int arg8) {
        arg8 = arg8 == 1 ? 1 : 0;
        int v1 = this.getSpanIndex(arg5, arg6, arg7.mPosition);
        if(arg8 != 0) {
            while(v1 > 0) {
                if(arg7.mPosition <= 0) {
                    return;
                }

                --arg7.mPosition;
                v1 = this.getSpanIndex(arg5, arg6, arg7.mPosition);
            }
        }
        else {
            arg8 = arg6.getItemCount() - 1;
            int v0 = arg7.mPosition;
            while(v0 < arg8) {
                int v2 = v0 + 1;
                int v3 = this.getSpanIndex(arg5, arg6, v2);
                if(v3 <= v1) {
                    break;
                }

                v0 = v2;
                v1 = v3;
            }

            arg7.mPosition = v0;
        }
    }

    private void ensureViewSet() {
        if(this.mSet == null || this.mSet.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    View findReferenceChild(Recycler arg8, State arg9, int arg10, int arg11, int arg12) {
        this.ensureLayoutState();
        int v0 = this.mOrientationHelper.getStartAfterPadding();
        int v1 = this.mOrientationHelper.getEndAfterPadding();
        int v2 = arg11 > arg10 ? 1 : -1;
        View v3 = null;
        View v4 = v3;
        while(arg10 != arg11) {
            View v5 = this.getChildAt(arg10);
            int v6 = this.getPosition(v5);
            if(v6 >= 0 && v6 < arg12) {
                if(this.getSpanIndex(arg8, arg9, v6) != 0) {
                }
                else if(!v5.getLayoutParams().isItemRemoved()) {
                    if(this.mOrientationHelper.getDecoratedStart(v5) < v1) {
                        if(this.mOrientationHelper.getDecoratedEnd(v5) < v0) {
                        }
                        else {
                            return v5;
                        }
                    }

                    if(v3 != null) {
                        goto label_35;
                    }

                    v3 = v5;
                }
                else if(v4 == null) {
                    v4 = v5;
                }
            }

        label_35:
            arg10 += v2;
        }

        if(v3 != null) {
        }
        else {
            v3 = v4;
        }

        return v3;
    }

    public androidx.recyclerview.widget.RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int v1 = -1;
        int v2 = -2;
        if(this.mOrientation == 0) {
            return new LayoutParams(v2, v1);
        }

        return new LayoutParams(v1, v2);
    }

    public androidx.recyclerview.widget.RecyclerView$LayoutParams generateLayoutParams(Context arg2, AttributeSet arg3) {
        return new LayoutParams(arg2, arg3);
    }

    public androidx.recyclerview.widget.RecyclerView$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        if((arg2 instanceof ViewGroup$MarginLayoutParams)) {
            return new LayoutParams(((ViewGroup$MarginLayoutParams)arg2));
        }

        return new LayoutParams(arg2);
    }

    public int getColumnCountForAccessibility(Recycler arg3, State arg4) {
        if(this.mOrientation == 1) {
            return this.mSpanCount;
        }

        if(arg4.getItemCount() < 1) {
            return 0;
        }

        return this.getSpanGroupIndex(arg3, arg4, arg4.getItemCount() - 1) + 1;
    }

    public int getRowCountForAccessibility(Recycler arg3, State arg4) {
        if(this.mOrientation == 0) {
            return this.mSpanCount;
        }

        if(arg4.getItemCount() < 1) {
            return 0;
        }

        return this.getSpanGroupIndex(arg3, arg4, arg4.getItemCount() - 1) + 1;
    }

    int getSpaceForSpanRange(int arg4, int arg5) {
        if(this.mOrientation == 1 && (this.isLayoutRTL())) {
            return this.mCachedBorders[this.mSpanCount - arg4] - this.mCachedBorders[this.mSpanCount - arg4 - arg5];
        }

        return this.mCachedBorders[arg5 + arg4] - this.mCachedBorders[arg4];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    private int getSpanGroupIndex(Recycler arg2, State arg3, int arg4) {
        if(!arg3.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanGroupIndex(arg4, this.mSpanCount);
        }

        int v2 = arg2.convertPreLayoutPositionToPostLayout(arg4);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + arg4);
            return 0;
        }

        return this.mSpanSizeLookup.getSpanGroupIndex(v2, this.mSpanCount);
    }

    private int getSpanIndex(Recycler arg2, State arg3, int arg4) {
        if(!arg3.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(arg4, this.mSpanCount);
        }

        int v0 = -1;
        int v3 = this.mPreLayoutSpanIndexCache.get(arg4, v0);
        if(v3 != v0) {
            return v3;
        }

        int v2 = arg2.convertPreLayoutPositionToPostLayout(arg4);
        if(v2 == v0) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + arg4);
            return 0;
        }

        return this.mSpanSizeLookup.getCachedSpanIndex(v2, this.mSpanCount);
    }

    private int getSpanSize(Recycler arg2, State arg3, int arg4) {
        if(!arg3.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(arg4);
        }

        int v0 = -1;
        int v3 = this.mPreLayoutSpanSizeCache.get(arg4, v0);
        if(v3 != v0) {
            return v3;
        }

        int v2 = arg2.convertPreLayoutPositionToPostLayout(arg4);
        if(v2 == v0) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + arg4);
            return 1;
        }

        return this.mSpanSizeLookup.getSpanSize(v2);
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    private void guessMeasurement(float arg2, int arg3) {
        this.calculateItemBorders(Math.max(Math.round(arg2 * (((float)this.mSpanCount))), arg3));
    }

    void layoutChunk(Recycler arg19, State arg20, LayoutState arg21, LayoutChunkResult arg22) {
        int v15_1;
        int v2_3;
        boolean v3_2;
        View v2_1;
        int v10;
        int v3;
        GridLayoutManager v6 = this;
        Recycler v1 = arg19;
        State v2 = arg20;
        LayoutState v7 = arg21;
        LayoutChunkResult v8 = arg22;
        int v9 = v6.mOrientationHelper.getModeInOther();
        int v13 = v9 != 0x40000000 ? 1 : 0;
        int v14 = this.getChildCount() > 0 ? v6.mCachedBorders[v6.mSpanCount] : 0;
        if(v13 != 0) {
            this.updateMeasurements();
        }

        boolean v15 = v7.mItemDirection == 1 ? true : false;
        int v0 = v6.mSpanCount;
        if(!v15) {
            v0 = v6.getSpanIndex(v1, v2, v7.mCurrentPosition) + v6.getSpanSize(v1, v2, v7.mCurrentPosition);
        }

        int v4 = 0;
        int v5 = 0;
        while(true) {
            if(v5 < v6.mSpanCount && (v7.hasMore(v2)) && v0 > 0) {
                v3 = v7.mCurrentPosition;
                v10 = v6.getSpanSize(v1, v2, v3);
                if(v10 <= v6.mSpanCount) {
                    v0 -= v10;
                    if(v0 < 0) {
                    }
                    else {
                        View v3_1 = v7.next(v1);
                        if(v3_1 == null) {
                        }
                        else {
                            v4 += v10;
                            v6.mSet[v5] = v3_1;
                            ++v5;
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
            }

            goto label_76;
        }

        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("Item at position ");
        v1_1.append(v3);
        v1_1.append(" requires ");
        v1_1.append(v10);
        v1_1.append(" spans but GridLayoutManager has only ");
        v1_1.append(v6.mSpanCount);
        v1_1.append(" spans.");
        throw new IllegalArgumentException(v1_1.toString());
    label_76:
        if(v5 == 0) {
            v8.mFinished = true;
            return;
        }

        float v10_1 = 0f;
        int v12 = v5;
        this.assignSpans(arg19, arg20, v5, v4, v15);
        v0 = 0;
        int v1_2 = 0;
        while(v0 < v12) {
            v2_1 = v6.mSet[v0];
            if(v7.mScrapList != null) {
                v3_2 = false;
                if(v15) {
                    v6.addDisappearingView(v2_1);
                }
                else {
                    v6.addDisappearingView(v2_1, 0);
                }
            }
            else if(v15) {
                v6.addView(v2_1);
                v3_2 = false;
            }
            else {
                v3_2 = false;
                v6.addView(v2_1, 0);
            }

            v6.calculateItemDecorationsForChild(v2_1, v6.mDecorInsets);
            v6.measureChild(v2_1, v9, v3_2);
            v3 = v6.mOrientationHelper.getDecoratedMeasurement(v2_1);
            if(v3 > v1_2) {
                v1_2 = v3;
            }

            float v2_2 = (((float)v6.mOrientationHelper.getDecoratedMeasurementInOther(v2_1))) * 1f / (((float)v2_1.getLayoutParams().mSpanSize));
            if(v2_2 > v10_1) {
                v10_1 = v2_2;
            }

            ++v0;
        }

        if(v13 != 0) {
            v6.guessMeasurement(v10_1, v14);
            v0 = 0;
            v1_2 = 0;
            while(v0 < v12) {
                v2_1 = v6.mSet[v0];
                v6.measureChild(v2_1, 0x40000000, true);
                v2_3 = v6.mOrientationHelper.getDecoratedMeasurement(v2_1);
                if(v2_3 > v1_2) {
                    v1_2 = v2_3;
                }

                ++v0;
            }
        }

        for(v0 = 0; v0 < v12; ++v0) {
            v2_1 = v6.mSet[v0];
            if(v6.mOrientationHelper.getDecoratedMeasurement(v2_1) != v1_2) {
                ViewGroup$LayoutParams v3_3 = v2_1.getLayoutParams();
                Rect v4_1 = ((LayoutParams)v3_3).mDecorInsets;
                v5 = v4_1.top + v4_1.bottom + ((LayoutParams)v3_3).topMargin + ((LayoutParams)v3_3).bottomMargin;
                v9 = v4_1.left + v4_1.right + ((LayoutParams)v3_3).leftMargin + ((LayoutParams)v3_3).rightMargin;
                v4 = v6.getSpaceForSpanRange(((LayoutParams)v3_3).mSpanIndex, ((LayoutParams)v3_3).mSpanSize);
                if(v6.mOrientation == 1) {
                    v3 = GridLayoutManager.getChildMeasureSpec(v4, 0x40000000, v9, ((LayoutParams)v3_3).width, false);
                    v4 = View$MeasureSpec.makeMeasureSpec(v1_2 - v5, 0x40000000);
                }
                else {
                    v9 = View$MeasureSpec.makeMeasureSpec(v1_2 - v9, 0x40000000);
                    v4 = GridLayoutManager.getChildMeasureSpec(v4, 0x40000000, v5, ((LayoutParams)v3_3).height, false);
                    v3 = v9;
                }

                v6.measureChildWithDecorationsAndMargin(v2_1, v3, v4, true);
            }
        }

        v10 = 0;
        v8.mConsumed = v1_2;
        v2_3 = -1;
        if(v6.mOrientation == 1) {
            if(v7.mLayoutDirection == v2_3) {
                v1_2 = v7.mOffset - v1_2;
                v3 = v7.mOffset;
                v2_3 = v1_2;
            }
            else {
                v1_2 += v7.mOffset;
                v2_3 = v7.mOffset;
                v3 = v1_2;
            }

            v0 = 0;
            v1_2 = 0;
        }
        else {
            if(v7.mLayoutDirection == v2_3) {
                v2_3 = 0;
                v3 = 0;
                int v17 = v7.mOffset - v1_2;
                v1_2 = v7.mOffset;
                v0 = v17;
                goto label_222;
            }

            v0 = v7.mOffset;
            v1_2 += v0;
            v2_3 = 0;
            v3 = 0;
        }

    label_222:
        while(v10 < v12) {
            View v7_1 = v6.mSet[v10];
            ViewGroup$LayoutParams v9_1 = v7_1.getLayoutParams();
            if(v6.mOrientation != 1) {
                v2_3 = this.getPaddingTop() + v6.mCachedBorders[((LayoutParams)v9_1).mSpanIndex];
                v3 = v6.mOrientationHelper.getDecoratedMeasurementInOther(v7_1) + v2_3;
            label_261:
                v13 = v0;
                v15_1 = v1_2;
            }
            else if(this.isLayoutRTL()) {
                v0 = this.getPaddingLeft() + v6.mCachedBorders[v6.mSpanCount - ((LayoutParams)v9_1).mSpanIndex];
                v15_1 = v0;
                v13 = v0 - v6.mOrientationHelper.getDecoratedMeasurementInOther(v7_1);
            }
            else {
                v0 = this.getPaddingLeft() + v6.mCachedBorders[((LayoutParams)v9_1).mSpanIndex];
                v1_2 = v6.mOrientationHelper.getDecoratedMeasurementInOther(v7_1) + v0;
                goto label_261;
            }

            v14 = v2_3;
            int v16 = v3;
            this.layoutDecoratedWithMargins(v7_1, v13, v14, v15_1, v16);
            if((((LayoutParams)v9_1).isItemRemoved()) || (((LayoutParams)v9_1).isItemChanged())) {
                v8.mIgnoreConsumed = true;
            }

            v8.mFocusable |= v7_1.hasFocusable();
            ++v10;
            v0 = v13;
            v2_3 = v14;
            v1_2 = v15_1;
            v3 = v16;
        }

        Arrays.fill(v6.mSet, null);
    }

    private void measureChild(View arg9, int arg10, boolean arg11) {
        int v0_1;
        ViewGroup$LayoutParams v0 = arg9.getLayoutParams();
        Rect v1 = ((LayoutParams)v0).mDecorInsets;
        int v2 = v1.top + v1.bottom + ((LayoutParams)v0).topMargin + ((LayoutParams)v0).bottomMargin;
        int v3 = v1.left + v1.right + ((LayoutParams)v0).leftMargin + ((LayoutParams)v0).rightMargin;
        int v1_1 = this.getSpaceForSpanRange(((LayoutParams)v0).mSpanIndex, ((LayoutParams)v0).mSpanSize);
        if(this.mOrientation == 1) {
            arg10 = GridLayoutManager.getChildMeasureSpec(v1_1, arg10, v3, ((LayoutParams)v0).width, false);
            v0_1 = GridLayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), this.getHeightMode(), v2, ((LayoutParams)v0).height, true);
        }
        else {
            arg10 = GridLayoutManager.getChildMeasureSpec(v1_1, arg10, v2, ((LayoutParams)v0).height, false);
            int v7 = GridLayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), this.getWidthMode(), v3, ((LayoutParams)v0).width, true);
            v0_1 = arg10;
            arg10 = v7;
        }

        this.measureChildWithDecorationsAndMargin(arg9, arg10, v0_1, arg11);
    }

    private void measureChildWithDecorationsAndMargin(View arg2, int arg3, int arg4, boolean arg5) {
        ViewGroup$LayoutParams v0 = arg2.getLayoutParams();
        arg5 = arg5 ? this.shouldReMeasureChild(arg2, arg3, arg4, ((androidx.recyclerview.widget.RecyclerView$LayoutParams)v0)) : this.shouldMeasureChild(arg2, arg3, arg4, ((androidx.recyclerview.widget.RecyclerView$LayoutParams)v0));
        if(arg5) {
            arg2.measure(arg3, arg4);
        }
    }

    void onAnchorReady(Recycler arg2, State arg3, AnchorInfo arg4, int arg5) {
        super.onAnchorReady(arg2, arg3, arg4, arg5);
        this.updateMeasurements();
        if(arg3.getItemCount() > 0 && !arg3.isPreLayout()) {
            this.ensureAnchorIsInCorrectSpan(arg2, arg3, arg4, arg5);
        }

        this.ensureViewSet();
    }

    public View onFocusSearchFailed(View arg26, int arg27, Recycler arg28, State arg29) {
        int v22;
        View v24;
        int v23;
        View v21;
        int v19;
        int v12;
        int v11;
        GridLayoutManager v0 = this;
        Recycler v1 = arg28;
        State v2 = arg29;
        View v3 = this.findContainingItemView(arg26);
        View v4 = null;
        if(v3 == null) {
            return v4;
        }

        ViewGroup$LayoutParams v5 = v3.getLayoutParams();
        int v6 = ((LayoutParams)v5).mSpanIndex;
        int v7 = ((LayoutParams)v5).mSpanIndex + ((LayoutParams)v5).mSpanSize;
        if(super.onFocusSearchFailed(arg26, arg27, arg28, arg29) == null) {
            return v4;
        }

        boolean v5_1 = v0.convertFocusDirectionToLayoutDirection(arg27) == 1 ? true : false;
        int v5_2 = v5_1 != v0.mShouldReverseLayout ? 1 : 0;
        if(v5_2 != 0) {
            v5_2 = this.getChildCount() - 1;
            v11 = -1;
            v12 = -1;
        }
        else {
            v11 = this.getChildCount();
            v5_2 = 0;
            v12 = 1;
        }

        int v13 = v0.mOrientation != 1 || !this.isLayoutRTL() ? 0 : 1;
        int v14 = v0.getSpanGroupIndex(v1, v2, v5_2);
        View v10 = v4;
        int v8 = -1;
        int v15 = 0;
        int v17 = 0;
        int v18 = -1;
        while(v5_2 != v11) {
            int v9 = v0.getSpanGroupIndex(v1, v2, v5_2);
            View v1_1 = v0.getChildAt(v5_2);
            if(v1_1 == v3) {
            }
            else {
                if(!v1_1.hasFocusable() || v9 == v14) {
                    ViewGroup$LayoutParams v9_1 = v1_1.getLayoutParams();
                    int v2_1 = ((LayoutParams)v9_1).mSpanIndex;
                    v21 = v3;
                    v22 = v11;
                    int v3_1 = ((LayoutParams)v9_1).mSpanIndex + ((LayoutParams)v9_1).mSpanSize;
                    if((v1_1.hasFocusable()) && v2_1 == v6 && v3_1 == v7) {
                        return v1_1;
                    }

                    if(!v1_1.hasFocusable() || v4 != null) {
                        if(!v1_1.hasFocusable() && v10 == null) {
                            goto label_86;
                        }

                        v11 = Math.min(v3_1, v7) - Math.max(v2_1, v6);
                        if(!v1_1.hasFocusable()) {
                            if(v4 == null) {
                                v23 = v8;
                                v24 = v10;
                                int v10_1 = 0;
                                if(!v0.isViewPartiallyVisible(v1_1, false, true)) {
                                    goto label_124;
                                }

                                v8 = v17;
                                if(v11 > v8) {
                                label_89:
                                    v11 = v18;
                                    goto label_90;
                                }

                                if(v11 != v8) {
                                    goto label_125;
                                }

                                v11 = v18;
                                if(v2_1 > v11) {
                                    v10_1 = 1;
                                }

                                if(v13 != v10_1) {
                                    goto label_126;
                                }

                            label_90:
                                v19 = 1;
                                goto label_127;
                            }

                        label_122:
                            v23 = v8;
                            v24 = v10;
                        label_124:
                            v8 = v17;
                        label_125:
                            v11 = v18;
                        }
                        else if(v11 > v15) {
                            goto label_86;
                        }
                        else if(v11 == v15) {
                            v11 = v2_1 > v8 ? 1 : 0;
                            if(v13 != v11) {
                                goto label_122;
                            }

                        label_86:
                            v23 = v8;
                            v24 = v10;
                            v8 = v17;
                            goto label_89;
                        }
                        else {
                            goto label_122;
                        }

                    label_126:
                        v19 = 0;
                    }
                    else {
                        goto label_86;
                    }

                label_127:
                    if(v19 != 0) {
                        if(v1_1.hasFocusable()) {
                            int v4_1 = ((LayoutParams)v9_1).mSpanIndex;
                            v15 = Math.min(v3_1, v7) - Math.max(v2_1, v6);
                            v17 = v8;
                            v18 = v11;
                            v10 = v24;
                            v8 = v4_1;
                            v4 = v1_1;
                            goto label_154;
                        }

                        v8 = ((LayoutParams)v9_1).mSpanIndex;
                        v10 = v1_1;
                        v17 = Math.min(v3_1, v7) - Math.max(v2_1, v6);
                        v18 = v8;
                        v8 = v23;
                        goto label_154;
                    }

                label_150:
                    v17 = v8;
                    v18 = v11;
                    v8 = v23;
                    v10 = v24;
                }
                else if(v4 != null) {
                    break;
                }
                else {
                    v21 = v3;
                    v23 = v8;
                    v24 = v10;
                    v22 = v11;
                    v8 = v17;
                    v11 = v18;
                    goto label_150;
                }

            label_154:
                v5_2 += v12;
                v3 = v21;
                v11 = v22;
                v1 = arg28;
                v2 = arg29;
                continue;
            }

            break;
        }

        v24 = v10;
        if(v4 != null) {
        }
        else {
            v4 = v24;
        }

        return v4;
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler arg8, State arg9, View arg10, AccessibilityNodeInfoCompat arg11) {
        boolean v5;
        ViewGroup$LayoutParams v0 = arg10.getLayoutParams();
        if(!(v0 instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(arg10, arg11);
            return;
        }

        int v8 = this.getSpanGroupIndex(arg8, arg9, ((LayoutParams)v0).getViewLayoutPosition());
        if(this.mOrientation == 0) {
            int v9 = ((LayoutParams)v0).getSpanIndex();
            int v2 = ((LayoutParams)v0).getSpanSize();
            v5 = this.mSpanCount <= 1 || ((LayoutParams)v0).getSpanSize() != this.mSpanCount ? false : true;
            arg11.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v9, v2, v8, 1, v5, false));
        }
        else {
            int v3 = ((LayoutParams)v0).getSpanIndex();
            int v4 = ((LayoutParams)v0).getSpanSize();
            v5 = this.mSpanCount <= 1 || ((LayoutParams)v0).getSpanSize() != this.mSpanCount ? false : true;
            arg11.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v8, 1, v3, v4, v5, false));
        }
    }

    public void onItemsAdded(RecyclerView arg1, int arg2, int arg3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView arg1) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView arg1, int arg2, int arg3, int arg4) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView arg1, int arg2, int arg3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView arg1, int arg2, int arg3, Object arg4) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(Recycler arg2, State arg3) {
        if(arg3.isPreLayout()) {
            this.cachePreLayoutSpanMapping();
        }

        super.onLayoutChildren(arg2, arg3);
        this.clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(State arg1) {
        super.onLayoutCompleted(arg1);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int arg1, Recycler arg2, State arg3) {
        this.updateMeasurements();
        this.ensureViewSet();
        return super.scrollHorizontallyBy(arg1, arg2, arg3);
    }

    public int scrollVerticallyBy(int arg1, Recycler arg2, State arg3) {
        this.updateMeasurements();
        this.ensureViewSet();
        return super.scrollVerticallyBy(arg1, arg2, arg3);
    }

    public void setMeasuredDimension(Rect arg5, int arg6, int arg7) {
        int v5;
        if(this.mCachedBorders == null) {
            super.setMeasuredDimension(arg5, arg6, arg7);
        }

        int v0 = this.getPaddingLeft() + this.getPaddingRight();
        int v1 = this.getPaddingTop() + this.getPaddingBottom();
        if(this.mOrientation == 1) {
            v5 = GridLayoutManager.chooseSize(arg7, arg5.height() + v1, this.getMinimumHeight());
            arg6 = GridLayoutManager.chooseSize(arg6, this.mCachedBorders[this.mCachedBorders.length - 1] + v0, this.getMinimumWidth());
        }
        else {
            arg6 = GridLayoutManager.chooseSize(arg6, arg5.width() + v0, this.getMinimumWidth());
            v5 = GridLayoutManager.chooseSize(arg7, this.mCachedBorders[this.mCachedBorders.length - 1] + v1, this.getMinimumHeight());
        }

        this.setMeasuredDimension(arg6, v5);
    }

    public void setSpanCount(int arg4) {
        if(arg4 == this.mSpanCount) {
            return;
        }

        this.mPendingSpanCountChange = true;
        if(arg4 >= 1) {
            this.mSpanCount = arg4;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            this.requestLayout();
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Span count should be at least 1. Provided ");
        v1.append(arg4);
        throw new IllegalArgumentException(v1.toString());
    }

    public void setSpanSizeLookup(SpanSizeLookup arg1) {
        this.mSpanSizeLookup = arg1;
    }

    public void setStackFromEnd(boolean arg2) {
        if(!arg2) {
            super.setStackFromEnd(false);
            return;
        }

        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public boolean supportsPredictiveItemAnimations() {
        boolean v0 = this.mPendingSavedState != null || (this.mPendingSpanCountChange) ? false : true;
        return v0;
    }

    private void updateMeasurements() {
        int v0 = this.getOrientation() == 1 ? this.getWidth() - this.getPaddingRight() - this.getPaddingLeft() : this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        this.calculateItemBorders(v0);
    }
}

