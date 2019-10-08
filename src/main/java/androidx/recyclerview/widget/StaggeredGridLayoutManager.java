package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    class androidx.recyclerview.widget.StaggeredGridLayoutManager$1 implements Runnable {
        androidx.recyclerview.widget.StaggeredGridLayoutManager$1(StaggeredGridLayoutManager arg1) {
            StaggeredGridLayoutManager.this = arg1;
            super();
        }

        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    }

    class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        AnchorInfo(StaggeredGridLayoutManager arg1) {
            StaggeredGridLayoutManager.this = arg1;
            super();
            this.reset();
        }

        void assignCoordinateFromPadding() {
            int v0 = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            this.mOffset = v0;
        }

        void assignCoordinateFromPadding(int arg2) {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - arg2 : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + arg2;
        }

        void reset() {
            int v0 = -1;
            this.mPosition = v0;
            this.mOffset = 0x80000000;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            if(this.mSpanReferenceLines != null) {
                Arrays.fill(this.mSpanReferenceLines, v0);
            }
        }

        void saveSpanReferenceLines(Span[] arg6) {
            int v0 = arg6.length;
            if(this.mSpanReferenceLines == null || this.mSpanReferenceLines.length < v0) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }

            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mSpanReferenceLines[v1] = arg6[v1].getStartLine(0x80000000);
            }
        }
    }

    public class LayoutParams extends androidx.recyclerview.widget.RecyclerView$LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
        }

        public LayoutParams(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView$LayoutParams arg1) {
            super(arg1);
        }

        public final int getSpanIndex() {
            if(this.mSpan == null) {
                return -1;
            }

            return this.mSpan.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean arg1) {
            this.mFullSpan = arg1;
        }
    }

    class LazySpanLookup {
        class FullSpanItem implements Parcelable {
            final class androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 implements Parcelable$Creator {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1() {
                    super();
                }

                public FullSpanItem createFromParcel(Parcel arg2) {
                    return new FullSpanItem(arg2);
                }

                public Object createFromParcel(Parcel arg1) {
                    return this.createFromParcel(arg1);
                }

                public FullSpanItem[] newArray(int arg1) {
                    return new FullSpanItem[arg1];
                }

                public Object[] newArray(int arg1) {
                    return this.newArray(arg1);
                }
            }

            public static final Parcelable$Creator CREATOR;
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            static {
                FullSpanItem.CREATOR = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1();
            }

            FullSpanItem() {
                super();
            }

            FullSpanItem(Parcel arg3) {
                super();
                this.mPosition = arg3.readInt();
                this.mGapDir = arg3.readInt();
                boolean v1 = true;
                if(arg3.readInt() == 1) {
                }
                else {
                    v1 = false;
                }

                this.mHasUnwantedGapAfter = v1;
                int v0 = arg3.readInt();
                if(v0 > 0) {
                    this.mGapPerSpan = new int[v0];
                    arg3.readIntArray(this.mGapPerSpan);
                }
            }

            public int describeContents() {
                return 0;
            }

            int getGapForSpan(int arg2) {
                return this.mGapPerSpan == null ? 0 : this.mGapPerSpan[arg2];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            public void writeToParcel(Parcel arg1, int arg2) {
                arg1.writeInt(this.mPosition);
                arg1.writeInt(this.mGapDir);
                arg1.writeInt(this.mHasUnwantedGapAfter);
                if(this.mGapPerSpan == null || this.mGapPerSpan.length <= 0) {
                    arg1.writeInt(0);
                }
                else {
                    arg1.writeInt(this.mGapPerSpan.length);
                    arg1.writeIntArray(this.mGapPerSpan);
                }
            }
        }

        private static final int MIN_SIZE = 10;
        int[] mData;
        List mFullSpanItems;

        LazySpanLookup() {
            super();
        }

        public void addFullSpanItem(FullSpanItem arg6) {
            if(this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }

            int v0 = this.mFullSpanItems.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                Object v2 = this.mFullSpanItems.get(v1);
                if(((FullSpanItem)v2).mPosition == arg6.mPosition) {
                    this.mFullSpanItems.remove(v1);
                }

                if(((FullSpanItem)v2).mPosition >= arg6.mPosition) {
                    this.mFullSpanItems.add(v1, arg6);
                    return;
                }
            }

            this.mFullSpanItems.add(arg6);
        }

        void clear() {
            if(this.mData != null) {
                Arrays.fill(this.mData, -1);
            }

            this.mFullSpanItems = null;
        }

        void ensureSize(int arg5) {
            int v1 = -1;
            if(this.mData == null) {
                this.mData = new int[Math.max(arg5, 10) + 1];
                Arrays.fill(this.mData, v1);
            }
            else if(arg5 >= this.mData.length) {
                int[] v0 = this.mData;
                this.mData = new int[this.sizeForPosition(arg5)];
                System.arraycopy(v0, 0, this.mData, 0, v0.length);
                Arrays.fill(this.mData, v0.length, this.mData.length, v1);
            }
        }

        int forceInvalidateAfter(int arg3) {
            if(this.mFullSpanItems != null) {
                int v0;
                for(v0 = this.mFullSpanItems.size() - 1; v0 >= 0; --v0) {
                    if(this.mFullSpanItems.get(v0).mPosition >= arg3) {
                        this.mFullSpanItems.remove(v0);
                    }
                }
            }

            return this.invalidateAfter(arg3);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int arg6, int arg7, int arg8, boolean arg9) {
            FullSpanItem v1 = null;
            if(this.mFullSpanItems == null) {
                return v1;
            }

            int v0 = this.mFullSpanItems.size();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                Object v3 = this.mFullSpanItems.get(v2);
                if(((FullSpanItem)v3).mPosition >= arg7) {
                    return v1;
                }

                if(((FullSpanItem)v3).mPosition >= arg6) {
                    if(arg8 != 0 && ((FullSpanItem)v3).mGapDir != arg8) {
                        if(!arg9) {
                        }
                        else if(((FullSpanItem)v3).mHasUnwantedGapAfter) {
                            goto label_21;
                        }

                        goto label_22;
                    }

                label_21:
                    return ((FullSpanItem)v3);
                }

            label_22:
            }

            return v1;
        }

        public FullSpanItem getFullSpanItem(int arg5) {
            FullSpanItem v1 = null;
            if(this.mFullSpanItems == null) {
                return v1;
            }

            int v0;
            for(v0 = this.mFullSpanItems.size() - 1; v0 >= 0; --v0) {
                Object v2 = this.mFullSpanItems.get(v0);
                if(((FullSpanItem)v2).mPosition == arg5) {
                    return ((FullSpanItem)v2);
                }
            }

            return v1;
        }

        int getSpan(int arg2) {
            if(this.mData != null) {
                if(arg2 >= this.mData.length) {
                }
                else {
                    return this.mData[arg2];
                }
            }

            return -1;
        }

        int invalidateAfter(int arg4) {
            int v1 = -1;
            if(this.mData == null) {
                return v1;
            }

            if(arg4 >= this.mData.length) {
                return v1;
            }

            int v0 = this.invalidateFullSpansAfter(arg4);
            if(v0 == v1) {
                Arrays.fill(this.mData, arg4, this.mData.length, v1);
                return this.mData.length;
            }

            ++v0;
            Arrays.fill(this.mData, arg4, v0, v1);
            return v0;
        }

        private int invalidateFullSpansAfter(int arg5) {
            int v1 = -1;
            if(this.mFullSpanItems == null) {
                return v1;
            }

            FullSpanItem v0 = this.getFullSpanItem(arg5);
            if(v0 != null) {
                this.mFullSpanItems.remove(v0);
            }

            int v0_1 = this.mFullSpanItems.size();
            int v2 = 0;
            while(true) {
                if(v2 >= v0_1) {
                    break;
                }
                else if(this.mFullSpanItems.get(v2).mPosition >= arg5) {
                }
                else {
                    ++v2;
                    continue;
                }

                goto label_20;
            }

            v2 = -1;
        label_20:
            if(v2 != v1) {
                Object v5 = this.mFullSpanItems.get(v2);
                this.mFullSpanItems.remove(v2);
                return ((FullSpanItem)v5).mPosition;
            }

            return v1;
        }

        void offsetForAddition(int arg5, int arg6) {
            if(this.mData != null) {
                if(arg5 >= this.mData.length) {
                }
                else {
                    int v0 = arg5 + arg6;
                    this.ensureSize(v0);
                    System.arraycopy(this.mData, arg5, this.mData, v0, this.mData.length - arg5 - arg6);
                    Arrays.fill(this.mData, arg5, v0, -1);
                    this.offsetFullSpansForAddition(arg5, arg6);
                    return;
                }
            }
        }

        void offsetForRemoval(int arg5, int arg6) {
            if(this.mData != null) {
                if(arg5 >= this.mData.length) {
                }
                else {
                    int v0 = arg5 + arg6;
                    this.ensureSize(v0);
                    System.arraycopy(this.mData, v0, this.mData, arg5, this.mData.length - arg5 - arg6);
                    Arrays.fill(this.mData, this.mData.length - arg6, this.mData.length, -1);
                    this.offsetFullSpansForRemoval(arg5, arg6);
                    return;
                }
            }
        }

        private void offsetFullSpansForAddition(int arg4, int arg5) {
            if(this.mFullSpanItems == null) {
                return;
            }

            int v0;
            for(v0 = this.mFullSpanItems.size() - 1; v0 >= 0; --v0) {
                Object v1 = this.mFullSpanItems.get(v0);
                if(((FullSpanItem)v1).mPosition < arg4) {
                }
                else {
                    ((FullSpanItem)v1).mPosition += arg5;
                }
            }
        }

        private void offsetFullSpansForRemoval(int arg5, int arg6) {
            if(this.mFullSpanItems == null) {
                return;
            }

            int v0 = arg5 + arg6;
            int v1;
            for(v1 = this.mFullSpanItems.size() - 1; v1 >= 0; --v1) {
                Object v2 = this.mFullSpanItems.get(v1);
                if(((FullSpanItem)v2).mPosition < arg5) {
                }
                else if(((FullSpanItem)v2).mPosition < v0) {
                    this.mFullSpanItems.remove(v1);
                }
                else {
                    ((FullSpanItem)v2).mPosition -= arg6;
                }
            }
        }

        void setSpan(int arg2, Span arg3) {
            this.ensureSize(arg2);
            this.mData[arg2] = arg3.mIndex;
        }

        int sizeForPosition(int arg2) {
            int v0;
            for(v0 = this.mData.length; v0 <= arg2; v0 *= 2) {
            }

            return v0;
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class SavedState implements Parcelable {
        final class androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1 implements Parcelable$Creator {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1() {
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
        int mAnchorPosition;
        List mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        static {
            SavedState.CREATOR = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1();
        }

        public SavedState(SavedState arg2) {
            super();
            this.mSpanOffsetsSize = arg2.mSpanOffsetsSize;
            this.mAnchorPosition = arg2.mAnchorPosition;
            this.mVisibleAnchorPosition = arg2.mVisibleAnchorPosition;
            this.mSpanOffsets = arg2.mSpanOffsets;
            this.mSpanLookupSize = arg2.mSpanLookupSize;
            this.mSpanLookup = arg2.mSpanLookup;
            this.mReverseLayout = arg2.mReverseLayout;
            this.mAnchorLayoutFromEnd = arg2.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = arg2.mLastLayoutRTL;
            this.mFullSpanItems = arg2.mFullSpanItems;
        }

        public SavedState() {
            super();
        }

        SavedState(Parcel arg4) {
            super();
            this.mAnchorPosition = arg4.readInt();
            this.mVisibleAnchorPosition = arg4.readInt();
            this.mSpanOffsetsSize = arg4.readInt();
            if(this.mSpanOffsetsSize > 0) {
                this.mSpanOffsets = new int[this.mSpanOffsetsSize];
                arg4.readIntArray(this.mSpanOffsets);
            }

            this.mSpanLookupSize = arg4.readInt();
            if(this.mSpanLookupSize > 0) {
                this.mSpanLookup = new int[this.mSpanLookupSize];
                arg4.readIntArray(this.mSpanLookup);
            }

            boolean v1 = false;
            boolean v0 = arg4.readInt() == 1 ? true : false;
            this.mReverseLayout = v0;
            v0 = arg4.readInt() == 1 ? true : false;
            this.mAnchorLayoutFromEnd = v0;
            if(arg4.readInt() == 1) {
                v1 = true;
            }

            this.mLastLayoutRTL = v1;
            this.mFullSpanItems = arg4.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel arg1, int arg2) {
            arg1.writeInt(this.mAnchorPosition);
            arg1.writeInt(this.mVisibleAnchorPosition);
            arg1.writeInt(this.mSpanOffsetsSize);
            if(this.mSpanOffsetsSize > 0) {
                arg1.writeIntArray(this.mSpanOffsets);
            }

            arg1.writeInt(this.mSpanLookupSize);
            if(this.mSpanLookupSize > 0) {
                arg1.writeIntArray(this.mSpanLookup);
            }

            arg1.writeInt(this.mReverseLayout);
            arg1.writeInt(this.mAnchorLayoutFromEnd);
            arg1.writeInt(this.mLastLayoutRTL);
            arg1.writeList(this.mFullSpanItems);
        }
    }

    class Span {
        static final int INVALID_LINE = 0x80000000;
        int mCachedEnd;
        int mCachedStart;
        int mDeletedSize;
        final int mIndex;
        ArrayList mViews;

        Span(StaggeredGridLayoutManager arg1, int arg2) {
            StaggeredGridLayoutManager.this = arg1;
            super();
            this.mViews = new ArrayList();
            this.mCachedStart = 0x80000000;
            this.mCachedEnd = 0x80000000;
            this.mDeletedSize = 0;
            this.mIndex = arg2;
        }

        void appendToSpan(View arg5) {
            LayoutParams v0 = this.getLayoutParams(arg5);
            v0.mSpan = this;
            this.mViews.add(arg5);
            int v1 = 0x80000000;
            this.mCachedEnd = v1;
            if(this.mViews.size() == 1) {
                this.mCachedStart = v1;
            }

            if((v0.isItemRemoved()) || (v0.isItemChanged())) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(arg5);
            }
        }

        void cacheReferenceLineAndClear(boolean arg4, int arg5) {
            int v0 = 0x80000000;
            int v1 = arg4 ? this.getEndLine(v0) : this.getStartLine(v0);
            this.clear();
            if(v1 == v0) {
                return;
            }

            if((arg4) && v1 < StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() || !arg4 && v1 > StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding()) {
                return;
            }

            if(arg5 != v0) {
                v1 += arg5;
            }

            this.mCachedEnd = v1;
            this.mCachedStart = v1;
        }

        void calculateCachedEnd() {
            Object v0 = this.mViews.get(this.mViews.size() - 1);
            LayoutParams v1 = this.getLayoutParams(((View)v0));
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(((View)v0));
            if(v1.mFullSpan) {
                FullSpanItem v0_1 = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(v1.getViewLayoutPosition());
                if(v0_1 != null && v0_1.mGapDir == 1) {
                    this.mCachedEnd += v0_1.getGapForSpan(this.mIndex);
                }
            }
        }

        void calculateCachedStart() {
            Object v0 = this.mViews.get(0);
            LayoutParams v1 = this.getLayoutParams(((View)v0));
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(((View)v0));
            if(v1.mFullSpan) {
                FullSpanItem v0_1 = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(v1.getViewLayoutPosition());
                if(v0_1 != null && v0_1.mGapDir == -1) {
                    this.mCachedStart -= v0_1.getGapForSpan(this.mIndex);
                }
            }
        }

        void clear() {
            this.mViews.clear();
            this.invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOneVisibleChild(this.mViews.size() - 1, -1, true) : this.findOneVisibleChild(0, this.mViews.size(), true);
            return v0;
        }

        public int findFirstPartiallyVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true) : this.findOnePartiallyVisibleChild(0, this.mViews.size(), true);
            return v0;
        }

        public int findFirstVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOneVisibleChild(this.mViews.size() - 1, -1, false) : this.findOneVisibleChild(0, this.mViews.size(), false);
            return v0;
        }

        public int findLastCompletelyVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOneVisibleChild(0, this.mViews.size(), true) : this.findOneVisibleChild(this.mViews.size() - 1, -1, true);
            return v0;
        }

        public int findLastPartiallyVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOnePartiallyVisibleChild(0, this.mViews.size(), true) : this.findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
            return v0;
        }

        public int findLastVisibleItemPosition() {
            int v0 = StaggeredGridLayoutManager.this.mReverseLayout ? this.findOneVisibleChild(0, this.mViews.size(), false) : this.findOneVisibleChild(this.mViews.size() - 1, -1, false);
            return v0;
        }

        int findOnePartiallyOrCompletelyVisibleChild(int arg11, int arg12, boolean arg13, boolean arg14, boolean arg15) {
            int v9;
            int v0 = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int v1 = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int v2 = -1;
            int v4 = arg12 > arg11 ? 1 : -1;
            while(arg11 != arg12) {
                Object v5 = this.mViews.get(arg11);
                int v6 = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(((View)v5));
                int v7 = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(((View)v5));
                int v8 = 0;
                if(arg15) {
                    if(v6 > v1) {
                        goto label_26;
                    }

                    goto label_24;
                }
                else if(v6 < v1) {
                label_24:
                    v9 = 1;
                }
                else {
                label_26:
                    v9 = 0;
                }

                if(arg15) {
                    if(v7 < v0) {
                        goto label_36;
                    }

                    goto label_32;
                }
                else if(v7 > v0) {
                label_32:
                    v8 = 1;
                }

            label_36:
                if(v9 != 0 && v8 != 0) {
                    if((arg13) && (arg14)) {
                        if(v6 < v0) {
                            goto label_54;
                        }
                        else if(v7 <= v1) {
                            return StaggeredGridLayoutManager.this.getPosition(((View)v5));
                        }
                        else {
                            goto label_54;
                        }
                    }

                    if(arg14) {
                        return StaggeredGridLayoutManager.this.getPosition(((View)v5));
                    }

                    if(v6 >= v0 && v7 <= v1) {
                        goto label_54;
                    }

                    return StaggeredGridLayoutManager.this.getPosition(((View)v5));
                }

            label_54:
                arg11 += v4;
            }

            return v2;
        }

        int findOnePartiallyVisibleChild(int arg7, int arg8, boolean arg9) {
            return this.findOnePartiallyOrCompletelyVisibleChild(arg7, arg8, false, false, arg9);
        }

        int findOneVisibleChild(int arg7, int arg8, boolean arg9) {
            return this.findOnePartiallyOrCompletelyVisibleChild(arg7, arg8, arg9, true, false);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        int getEndLine() {
            if(this.mCachedEnd != 0x80000000) {
                return this.mCachedEnd;
            }

            this.calculateCachedEnd();
            return this.mCachedEnd;
        }

        int getEndLine(int arg3) {
            if(this.mCachedEnd != 0x80000000) {
                return this.mCachedEnd;
            }

            if(this.mViews.size() == 0) {
                return arg3;
            }

            this.calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int arg5, int arg6) {
            Object v1_1;
            View v1 = null;
            if(arg6 == -1) {
                arg6 = this.mViews.size();
                int v0 = 0;
                while(v0 < arg6) {
                    Object v2 = this.mViews.get(v0);
                    if((StaggeredGridLayoutManager.this.mReverseLayout) && StaggeredGridLayoutManager.this.getPosition(((View)v2)) <= arg5) {
                        return v1;
                    }

                    if(!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(((View)v2)) >= arg5) {
                        return v1;
                    }

                    if(!((View)v2).hasFocusable()) {
                        return v1;
                    }

                    ++v0;
                    v1_1 = v2;
                }
            }
            else {
                arg6 = this.mViews.size() - 1;
                while(arg6 >= 0) {
                    Object v0_1 = this.mViews.get(arg6);
                    if((StaggeredGridLayoutManager.this.mReverseLayout) && StaggeredGridLayoutManager.this.getPosition(((View)v0_1)) >= arg5) {
                        return v1;
                    }

                    if(!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(((View)v0_1)) <= arg5) {
                        return v1;
                    }

                    if(!((View)v0_1).hasFocusable()) {
                        return v1;
                    }

                    --arg6;
                    v1_1 = v0_1;
                }
            }

            return v1;
        }

        LayoutParams getLayoutParams(View arg1) {
            return arg1.getLayoutParams();
        }

        int getStartLine() {
            if(this.mCachedStart != 0x80000000) {
                return this.mCachedStart;
            }

            this.calculateCachedStart();
            return this.mCachedStart;
        }

        int getStartLine(int arg3) {
            if(this.mCachedStart != 0x80000000) {
                return this.mCachedStart;
            }

            if(this.mViews.size() == 0) {
                return arg3;
            }

            this.calculateCachedStart();
            return this.mCachedStart;
        }

        void invalidateCache() {
            this.mCachedStart = 0x80000000;
            this.mCachedEnd = 0x80000000;
        }

        void onOffset(int arg3) {
            int v1 = 0x80000000;
            if(this.mCachedStart != v1) {
                this.mCachedStart += arg3;
            }

            if(this.mCachedEnd != v1) {
                this.mCachedEnd += arg3;
            }
        }

        void popEnd() {
            int v0 = this.mViews.size();
            Object v1 = this.mViews.remove(v0 - 1);
            LayoutParams v2 = this.getLayoutParams(((View)v1));
            v2.mSpan = null;
            if((v2.isItemRemoved()) || (v2.isItemChanged())) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(((View)v1));
            }

            int v1_1 = 0x80000000;
            if(v0 == 1) {
                this.mCachedStart = v1_1;
            }

            this.mCachedEnd = v1_1;
        }

        void popStart() {
            Object v0 = this.mViews.remove(0);
            LayoutParams v1 = this.getLayoutParams(((View)v0));
            v1.mSpan = null;
            int v3 = 0x80000000;
            if(this.mViews.size() == 0) {
                this.mCachedEnd = v3;
            }

            if((v1.isItemRemoved()) || (v1.isItemChanged())) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(((View)v0));
            }

            this.mCachedStart = v3;
        }

        void prependToSpan(View arg5) {
            LayoutParams v0 = this.getLayoutParams(arg5);
            v0.mSpan = this;
            this.mViews.add(0, arg5);
            int v1 = 0x80000000;
            this.mCachedStart = v1;
            if(this.mViews.size() == 1) {
                this.mCachedEnd = v1;
            }

            if((v0.isItemRemoved()) || (v0.isItemChanged())) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(arg5);
            }
        }

        void setLine(int arg1) {
            this.mCachedStart = arg1;
            this.mCachedEnd = arg1;
        }
    }

    static final boolean DEBUG = false;
    @Deprecated public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = 0x80000000;
    private static final float MAX_SCROLL_FACTOR = 0.333333f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo;
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    @NonNull private final LayoutState mLayoutState;
    LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private int[] mPrefetchDistances;
    @NonNull OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    boolean mReverseLayout;
    @NonNull OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    Span[] mSpans;
    private final Rect mTmpRect;

    public StaggeredGridLayoutManager(int arg3, int arg4) {
        super();
        this.mSpanCount = -1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mLazySpanLookup = new LazySpanLookup();
        this.mGapStrategy = 2;
        this.mTmpRect = new Rect();
        this.mAnchorInfo = new AnchorInfo(this);
        this.mLaidOutInvalidFullSpan = false;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1(this);
        this.mOrientation = arg4;
        this.setSpanCount(arg3);
        this.mLayoutState = new LayoutState();
        this.createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(Context arg3, AttributeSet arg4, int arg5, int arg6) {
        super();
        this.mSpanCount = -1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mLazySpanLookup = new LazySpanLookup();
        this.mGapStrategy = 2;
        this.mTmpRect = new Rect();
        this.mAnchorInfo = new AnchorInfo(this);
        this.mLaidOutInvalidFullSpan = false;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1(this);
        Properties v3 = StaggeredGridLayoutManager.getProperties(arg3, arg4, arg5, arg6);
        this.setOrientation(v3.orientation);
        this.setSpanCount(v3.spanCount);
        this.setReverseLayout(v3.reverseLayout);
        this.mLayoutState = new LayoutState();
        this.createOrientationHelpers();
    }

    private void appendViewToAllSpans(View arg3) {
        int v0;
        for(v0 = this.mSpanCount - 1; v0 >= 0; --v0) {
            this.mSpans[v0].appendToSpan(arg3);
        }
    }

    private void applyPendingSavedState(AnchorInfo arg4) {
        if(this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if(this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                int v0;
                for(v0 = 0; v0 < this.mSpanCount; ++v0) {
                    this.mSpans[v0].clear();
                    int v1 = this.mPendingSavedState.mSpanOffsets[v0];
                    if(v1 != 0x80000000) {
                        v1 += this.mPendingSavedState.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }

                    this.mSpans[v0].setLine(v1);
                }
            }
            else {
                this.mPendingSavedState.invalidateSpanInfo();
                this.mPendingSavedState.mAnchorPosition = this.mPendingSavedState.mVisibleAnchorPosition;
            }
        }

        this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
        this.setReverseLayout(this.mPendingSavedState.mReverseLayout);
        this.resolveShouldLayoutReverse();
        if(this.mPendingSavedState.mAnchorPosition != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            arg4.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
        }
        else {
            arg4.mLayoutFromEnd = this.mShouldReverseLayout;
        }

        if(this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.mData = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.mFullSpanItems = this.mPendingSavedState.mFullSpanItems;
        }
    }

    boolean areAllEndsEqual() {
        int v2 = 0x80000000;
        int v0 = this.mSpans[0].getEndLine(v2);
        int v4;
        for(v4 = 1; v4 < this.mSpanCount; ++v4) {
            if(this.mSpans[v4].getEndLine(v2) != v0) {
                return 0;
            }
        }

        return 1;
    }

    boolean areAllStartsEqual() {
        int v2 = 0x80000000;
        int v0 = this.mSpans[0].getStartLine(v2);
        int v4;
        for(v4 = 1; v4 < this.mSpanCount; ++v4) {
            if(this.mSpans[v4].getStartLine(v2) != v0) {
                return 0;
            }
        }

        return 1;
    }

    public void assertNotInLayoutOrScroll(String arg2) {
        if(this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(arg2);
        }
    }

    private void attachViewToSpans(View arg2, LayoutParams arg3, LayoutState arg4) {
        if(arg4.mLayoutDirection == 1) {
            if(arg3.mFullSpan) {
                this.appendViewToAllSpans(arg2);
            }
            else {
                arg3.mSpan.appendToSpan(arg2);
            }
        }
        else if(arg3.mFullSpan) {
            this.prependViewToAllSpans(arg2);
        }
        else {
            arg3.mSpan.prependToSpan(arg2);
        }
    }

    private int calculateScrollDirectionForPosition(int arg4) {
        int v1 = -1;
        if(this.getChildCount() == 0) {
            if(this.mShouldReverseLayout) {
                v1 = 1;
            }

            return v1;
        }

        boolean v4 = arg4 < this.getFirstChildPosition() ? true : false;
        if(v4 != this.mShouldReverseLayout) {
        }
        else {
            v1 = 1;
        }

        return v1;
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

    boolean checkForGaps() {
        int v2;
        int v0;
        if(this.getChildCount() != 0 && this.mGapStrategy != 0) {
            if(!this.isAttachedToWindow()) {
            }
            else {
                if(this.mShouldReverseLayout) {
                    v0 = this.getLastChildPosition();
                    v2 = this.getFirstChildPosition();
                }
                else {
                    v0 = this.getFirstChildPosition();
                    v2 = this.getLastChildPosition();
                }

                if(v0 == 0 && this.hasGapsToFix() != null) {
                    this.mLazySpanLookup.clear();
                    this.requestSimpleAnimationsInNextLayout();
                    this.requestLayout();
                    return 1;
                }

                if(!this.mLaidOutInvalidFullSpan) {
                    return 0;
                }

                int v4 = this.mShouldReverseLayout ? -1 : 1;
                ++v2;
                FullSpanItem v6 = this.mLazySpanLookup.getFirstFullSpanItemInRange(v0, v2, v4, true);
                if(v6 == null) {
                    this.mLaidOutInvalidFullSpan = false;
                    this.mLazySpanLookup.forceInvalidateAfter(v2);
                    return 0;
                }

                FullSpanItem v0_1 = this.mLazySpanLookup.getFirstFullSpanItemInRange(v0, v6.mPosition, v4 * -1, true);
                if(v0_1 == null) {
                    this.mLazySpanLookup.forceInvalidateAfter(v6.mPosition);
                }
                else {
                    this.mLazySpanLookup.forceInvalidateAfter(v0_1.mPosition + 1);
                }

                this.requestSimpleAnimationsInNextLayout();
                this.requestLayout();
                return 1;
            }
        }

        return 0;
    }

    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    private boolean checkSpanForGap(Span arg4) {
        if(this.mShouldReverseLayout) {
            if(arg4.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding()) {
                return arg4.getLayoutParams(arg4.mViews.get(arg4.mViews.size() - 1)).mFullSpan ^ 1;
            }
        }
        else if(arg4.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding()) {
            return arg4.getLayoutParams(arg4.mViews.get(0)).mFullSpan ^ 1;
        }

        return 0;
    }

    @RestrictTo(value={Scope.LIBRARY}) public void collectAdjacentPrefetchPositions(int arg5, int arg6, State arg7, LayoutPrefetchRegistry arg8) {
        if(this.mOrientation == 0) {
        }
        else {
            arg5 = arg6;
        }

        if(this.getChildCount() != 0) {
            if(arg5 == 0) {
            }
            else {
                this.prepareLayoutStateForDelta(arg5, arg7);
                if(this.mPrefetchDistances == null || this.mPrefetchDistances.length < this.mSpanCount) {
                    this.mPrefetchDistances = new int[this.mSpanCount];
                }

                arg5 = 0;
                arg6 = 0;
                int v0 = 0;
                while(arg6 < this.mSpanCount) {
                    int v1 = this.mLayoutState.mItemDirection == -1 ? this.mLayoutState.mStartLine - this.mSpans[arg6].getStartLine(this.mLayoutState.mStartLine) : this.mSpans[arg6].getEndLine(this.mLayoutState.mEndLine) - this.mLayoutState.mEndLine;
                    if(v1 >= 0) {
                        this.mPrefetchDistances[v0] = v1;
                        ++v0;
                    }

                    ++arg6;
                }

                Arrays.sort(this.mPrefetchDistances, 0, v0);
                while(arg5 < v0) {
                    if(!this.mLayoutState.hasMore(arg7)) {
                        return;
                    }

                    arg8.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[arg5]);
                    this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
                    ++arg5;
                }

                return;
            }
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

        return ScrollbarHelper.computeScrollExtent(arg7, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), this.findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State arg8) {
        if(this.getChildCount() == 0) {
            return 0;
        }

        return ScrollbarHelper.computeScrollOffset(arg8, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), this.findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State arg7) {
        if(this.getChildCount() == 0) {
            return 0;
        }

        return ScrollbarHelper.computeScrollRange(arg7, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), this.findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    public PointF computeScrollVectorForPosition(int arg4) {
        arg4 = this.calculateScrollDirectionForPosition(arg4);
        PointF v0 = new PointF();
        if(arg4 == 0) {
            return null;
        }

        if(this.mOrientation == 0) {
            v0.x = ((float)arg4);
            v0.y = 0f;
        }
        else {
            v0.x = 0f;
            v0.y = ((float)arg4);
        }

        return v0;
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

    private int convertFocusDirectionToLayoutDirection(int arg5) {
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

    private FullSpanItem createFullSpanItemFromEnd(int arg5) {
        FullSpanItem v0 = new FullSpanItem();
        v0.mGapPerSpan = new int[this.mSpanCount];
        int v1;
        for(v1 = 0; v1 < this.mSpanCount; ++v1) {
            v0.mGapPerSpan[v1] = arg5 - this.mSpans[v1].getEndLine(arg5);
        }

        return v0;
    }

    private FullSpanItem createFullSpanItemFromStart(int arg5) {
        FullSpanItem v0 = new FullSpanItem();
        v0.mGapPerSpan = new int[this.mSpanCount];
        int v1;
        for(v1 = 0; v1 < this.mSpanCount; ++v1) {
            v0.mGapPerSpan[v1] = this.mSpans[v1].getStartLine(arg5) - arg5;
        }

        return v0;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(((LayoutManager)this), this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(((LayoutManager)this), 1 - this.mOrientation);
    }

    private int fill(Recycler arg17, LayoutState arg18, State arg19) {
        int v5_1;
        FullSpanItem v5;
        int v4;
        Span v1_1;
        int v3;
        int v1;
        int v2;
        int v11;
        int v0;
        StaggeredGridLayoutManager v6 = this;
        Recycler v7 = arg17;
        LayoutState v8 = arg18;
        int v9 = 0;
        v6.mRemainingSpans.set(0, v6.mSpanCount, true);
        if(!v6.mLayoutState.mInfinite) {
            v0 = v8.mLayoutDirection == 1 ? v8.mEndLine + v8.mAvailable : v8.mStartLine - v8.mAvailable;
            v11 = v0;
        }
        else if(v8.mLayoutDirection == 1) {
            v11 = 0x7FFFFFFF;
        }
        else {
            v11 = 0x80000000;
        }

        v6.updateAllRemainingSpans(v8.mLayoutDirection, v11);
        v0 = v6.mShouldReverseLayout ? v6.mPrimaryOrientation.getEndAfterPadding() : v6.mPrimaryOrientation.getStartAfterPadding();
        int v12 = v0;
        v0 = 0;
        while(true) {
            v2 = -1;
            if(arg18.hasMore(arg19)) {
                if(!v6.mLayoutState.mInfinite && (v6.mRemainingSpans.isEmpty())) {
                    break;
                }

                View v13 = v8.next(v7);
                ViewGroup$LayoutParams v14 = v13.getLayoutParams();
                v0 = ((LayoutParams)v14).getViewLayoutPosition();
                v1 = v6.mLazySpanLookup.getSpan(v0);
                v3 = v1 == v2 ? 1 : 0;
                if(v3 != 0) {
                    v1_1 = ((LayoutParams)v14).mFullSpan ? v6.mSpans[v9] : v6.getNextSpan(v8);
                    v6.mLazySpanLookup.setSpan(v0, v1_1);
                }
                else {
                    v1_1 = v6.mSpans[v1];
                }

                Span v15 = v1_1;
                ((LayoutParams)v14).mSpan = v15;
                if(v8.mLayoutDirection == 1) {
                    v6.addView(v13);
                }
                else {
                    v6.addView(v13, v9);
                }

                v6.measureChildWithDecorationsAndMargin(v13, ((LayoutParams)v14), ((boolean)v9));
                if(v8.mLayoutDirection == 1) {
                    v1 = ((LayoutParams)v14).mFullSpan ? v6.getMaxEnd(v12) : v15.getEndLine(v12);
                    v4 = v6.mPrimaryOrientation.getDecoratedMeasurement(v13) + v1;
                    if(v3 != 0 && (((LayoutParams)v14).mFullSpan)) {
                        v5 = v6.createFullSpanItemFromEnd(v1);
                        v5.mGapDir = v2;
                        v5.mPosition = v0;
                        v6.mLazySpanLookup.addFullSpanItem(v5);
                    }

                    v5_1 = v4;
                    v4 = v1;
                }
                else {
                    v1 = ((LayoutParams)v14).mFullSpan ? v6.getMinStart(v12) : v15.getStartLine(v12);
                    v4 = v1 - v6.mPrimaryOrientation.getDecoratedMeasurement(v13);
                    if(v3 != 0 && (((LayoutParams)v14).mFullSpan)) {
                        v5 = v6.createFullSpanItemFromStart(v1);
                        v5.mGapDir = 1;
                        v5.mPosition = v0;
                        v6.mLazySpanLookup.addFullSpanItem(v5);
                    }

                    v5_1 = v1;
                }

                if((((LayoutParams)v14).mFullSpan) && v8.mItemDirection == v2) {
                    if(v3 != 0) {
                        v6.mLaidOutInvalidFullSpan = true;
                    }
                    else {
                        boolean v1_2 = v8.mLayoutDirection == 1 ? this.areAllEndsEqual() : this.areAllStartsEqual();
                        v1 = (((int)v1_2)) ^ 1;
                        if(v1 == 0) {
                            goto label_139;
                        }

                        FullSpanItem v0_1 = v6.mLazySpanLookup.getFullSpanItem(v0);
                        if(v0_1 != null) {
                            v0_1.mHasUnwantedGapAfter = true;
                        }

                        v6.mLaidOutInvalidFullSpan = true;
                    }
                }

            label_139:
                v6.attachViewToSpans(v13, ((LayoutParams)v14), v8);
                if(!this.isLayoutRTL() || v6.mOrientation != 1) {
                    v0 = ((LayoutParams)v14).mFullSpan ? v6.mSecondaryOrientation.getStartAfterPadding() : v15.mIndex * v6.mSizePerSpan + v6.mSecondaryOrientation.getStartAfterPadding();
                    v3 = v0;
                    v9 = v6.mSecondaryOrientation.getDecoratedMeasurement(v13) + v0;
                }
                else {
                    v0 = ((LayoutParams)v14).mFullSpan ? v6.mSecondaryOrientation.getEndAfterPadding() : v6.mSecondaryOrientation.getEndAfterPadding() - (v6.mSpanCount - 1 - v15.mIndex) * v6.mSizePerSpan;
                    v9 = v0;
                    v3 = v0 - v6.mSecondaryOrientation.getDecoratedMeasurement(v13);
                }

                if(v6.mOrientation == 1) {
                    this.layoutDecoratedWithMargins(v13, v3, v4, v9, v5_1);
                }
                else {
                    this.layoutDecoratedWithMargins(v13, v4, v3, v5_1, v9);
                }

                if(((LayoutParams)v14).mFullSpan) {
                    v6.updateAllRemainingSpans(v6.mLayoutState.mLayoutDirection, v11);
                }
                else {
                    v6.updateRemainingSpans(v15, v6.mLayoutState.mLayoutDirection, v11);
                }

                v6.recycle(v7, v6.mLayoutState);
                if((v6.mLayoutState.mStopInFocusable) && (v13.hasFocusable())) {
                    if(((LayoutParams)v14).mFullSpan) {
                        v6.mRemainingSpans.clear();
                    }
                    else {
                        v6.mRemainingSpans.set(v15.mIndex, false);
                    }
                }

                v0 = 1;
                v9 = 0;
                continue;
            }

            break;
        }

        v3 = 0;
        if(v0 == 0) {
            v6.recycle(v7, v6.mLayoutState);
        }

        v1 = v6.mLayoutState.mLayoutDirection == v2 ? v6.mPrimaryOrientation.getStartAfterPadding() - v6.getMinStart(v6.mPrimaryOrientation.getStartAfterPadding()) : v6.getMaxEnd(v6.mPrimaryOrientation.getEndAfterPadding()) - v6.mPrimaryOrientation.getEndAfterPadding();
        if(v1 > 0) {
            v3 = Math.min(v8.mAvailable, v1);
        }

        return v3;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] arg4) {
        if(arg4 == null) {
            arg4 = new int[this.mSpanCount];
        }
        else {
            if(arg4.length >= this.mSpanCount) {
                goto label_7;
            }

            goto label_17;
        }

    label_7:
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            arg4[v0] = this.mSpans[v0].findFirstCompletelyVisibleItemPosition();
        }

        return arg4;
    label_17:
        StringBuilder v1 = new StringBuilder();
        v1.append("Provided int[]\'s size must be more than or equal to span count. Expected:");
        v1.append(this.mSpanCount);
        v1.append(", array size:");
        v1.append(arg4.length);
        throw new IllegalArgumentException(v1.toString());
    }

    private int findFirstReferenceChildPosition(int arg5) {
        int v0 = this.getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = this.getPosition(this.getChildAt(v2));
            if(v3 >= 0 && v3 < arg5) {
                return v3;
            }
        }

        return 0;
    }

    View findFirstVisibleItemClosestToEnd(boolean arg8) {
        int v0 = this.mPrimaryOrientation.getStartAfterPadding();
        int v1 = this.mPrimaryOrientation.getEndAfterPadding();
        int v2 = this.getChildCount() - 1;
        View v3 = null;
        while(v2 >= 0) {
            View v4 = this.getChildAt(v2);
            int v5 = this.mPrimaryOrientation.getDecoratedStart(v4);
            int v6 = this.mPrimaryOrientation.getDecoratedEnd(v4);
            if(v6 > v0) {
                if(v5 >= v1) {
                }
                else {
                    if(v6 > v1) {
                        if(!arg8) {
                        }
                        else {
                            if(v3 == null) {
                                v3 = v4;
                            }
                            else {
                            }

                            goto label_23;
                        }
                    }

                    return v4;
                }
            }

        label_23:
            --v2;
        }

        return v3;
    }

    View findFirstVisibleItemClosestToStart(boolean arg9) {
        int v0 = this.mPrimaryOrientation.getStartAfterPadding();
        int v1 = this.mPrimaryOrientation.getEndAfterPadding();
        int v2 = this.getChildCount();
        View v3 = null;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            View v5 = this.getChildAt(v4);
            int v6 = this.mPrimaryOrientation.getDecoratedStart(v5);
            if(this.mPrimaryOrientation.getDecoratedEnd(v5) > v0) {
                if(v6 >= v1) {
                }
                else {
                    if(v6 < v0) {
                        if(!arg9) {
                        }
                        else {
                            if(v3 == null) {
                                v3 = v5;
                            }
                            else {
                            }

                            goto label_23;
                        }
                    }

                    return v5;
                }
            }

        label_23:
        }

        return v3;
    }

    int findFirstVisibleItemPositionInt() {
        View v0 = this.mShouldReverseLayout ? this.findFirstVisibleItemClosestToEnd(true) : this.findFirstVisibleItemClosestToStart(true);
        int v0_1 = v0 == null ? -1 : this.getPosition(v0);
        return v0_1;
    }

    public int[] findFirstVisibleItemPositions(int[] arg4) {
        if(arg4 == null) {
            arg4 = new int[this.mSpanCount];
        }
        else {
            if(arg4.length >= this.mSpanCount) {
                goto label_7;
            }

            goto label_17;
        }

    label_7:
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            arg4[v0] = this.mSpans[v0].findFirstVisibleItemPosition();
        }

        return arg4;
    label_17:
        StringBuilder v1 = new StringBuilder();
        v1.append("Provided int[]\'s size must be more than or equal to span count. Expected:");
        v1.append(this.mSpanCount);
        v1.append(", array size:");
        v1.append(arg4.length);
        throw new IllegalArgumentException(v1.toString());
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] arg4) {
        if(arg4 == null) {
            arg4 = new int[this.mSpanCount];
        }
        else {
            if(arg4.length >= this.mSpanCount) {
                goto label_7;
            }

            goto label_17;
        }

    label_7:
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            arg4[v0] = this.mSpans[v0].findLastCompletelyVisibleItemPosition();
        }

        return arg4;
    label_17:
        StringBuilder v1 = new StringBuilder();
        v1.append("Provided int[]\'s size must be more than or equal to span count. Expected:");
        v1.append(this.mSpanCount);
        v1.append(", array size:");
        v1.append(arg4.length);
        throw new IllegalArgumentException(v1.toString());
    }

    private int findLastReferenceChildPosition(int arg3) {
        int v0;
        for(v0 = this.getChildCount() - 1; v0 >= 0; --v0) {
            int v1 = this.getPosition(this.getChildAt(v0));
            if(v1 >= 0 && v1 < arg3) {
                return v1;
            }
        }

        return 0;
    }

    public int[] findLastVisibleItemPositions(int[] arg4) {
        if(arg4 == null) {
            arg4 = new int[this.mSpanCount];
        }
        else {
            if(arg4.length >= this.mSpanCount) {
                goto label_7;
            }

            goto label_17;
        }

    label_7:
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            arg4[v0] = this.mSpans[v0].findLastVisibleItemPosition();
        }

        return arg4;
    label_17:
        StringBuilder v1 = new StringBuilder();
        v1.append("Provided int[]\'s size must be more than or equal to span count. Expected:");
        v1.append(this.mSpanCount);
        v1.append(", array size:");
        v1.append(arg4.length);
        throw new IllegalArgumentException(v1.toString());
    }

    private void fixEndGap(Recycler arg3, State arg4, boolean arg5) {
        int v1 = this.getMaxEnd(0x80000000);
        if(v1 == 0x80000000) {
            return;
        }

        int v0 = this.mPrimaryOrientation.getEndAfterPadding() - v1;
        if(v0 > 0) {
            v0 -= -this.scrollBy(-v0, arg3, arg4);
            if((arg5) && v0 > 0) {
                this.mPrimaryOrientation.offsetChildren(v0);
            }

            return;
        }
    }

    private void fixStartGap(Recycler arg3, State arg4, boolean arg5) {
        int v1 = this.getMinStart(0x7FFFFFFF);
        if(v1 == 0x7FFFFFFF) {
            return;
        }

        v1 -= this.mPrimaryOrientation.getStartAfterPadding();
        if(v1 > 0) {
            v1 -= this.scrollBy(v1, arg3, arg4);
            if((arg5) && v1 > 0) {
                this.mPrimaryOrientation.offsetChildren(-v1);
            }

            return;
        }
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

        return super.getColumnCountForAccessibility(arg3, arg4);
    }

    int getFirstChildPosition() {
        int v1 = 0;
        if(this.getChildCount() == 0) {
        }
        else {
            v1 = this.getPosition(this.getChildAt(0));
        }

        return v1;
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    int getLastChildPosition() {
        int v0 = this.getChildCount();
        return v0 == 0 ? 0 : this.getPosition(this.getChildAt(v0 - 1));
    }

    private int getMaxEnd(int arg4) {
        int v0 = this.mSpans[0].getEndLine(arg4);
        int v1;
        for(v1 = 1; v1 < this.mSpanCount; ++v1) {
            int v2 = this.mSpans[v1].getEndLine(arg4);
            if(v2 > v0) {
                v0 = v2;
            }
        }

        return v0;
    }

    private int getMaxStart(int arg4) {
        int v0 = this.mSpans[0].getStartLine(arg4);
        int v1;
        for(v1 = 1; v1 < this.mSpanCount; ++v1) {
            int v2 = this.mSpans[v1].getStartLine(arg4);
            if(v2 > v0) {
                v0 = v2;
            }
        }

        return v0;
    }

    private int getMinEnd(int arg4) {
        int v0 = this.mSpans[0].getEndLine(arg4);
        int v1;
        for(v1 = 1; v1 < this.mSpanCount; ++v1) {
            int v2 = this.mSpans[v1].getEndLine(arg4);
            if(v2 < v0) {
                v0 = v2;
            }
        }

        return v0;
    }

    private int getMinStart(int arg4) {
        int v0 = this.mSpans[0].getStartLine(arg4);
        int v1;
        for(v1 = 1; v1 < this.mSpanCount; ++v1) {
            int v2 = this.mSpans[v1].getStartLine(arg4);
            if(v2 < v0) {
                v0 = v2;
            }
        }

        return v0;
    }

    private Span getNextSpan(LayoutState arg8) {
        int v6;
        Span v5;
        int v2;
        int v8;
        int v3;
        int v0;
        int v1 = -1;
        if(this.preferLastSpan(arg8.mLayoutDirection)) {
            v0 = this.mSpanCount - 1;
            v3 = -1;
        }
        else {
            v0 = 0;
            v1 = this.mSpanCount;
            v3 = 1;
        }

        Span v4 = null;
        if(arg8.mLayoutDirection == 1) {
            v8 = 0x7FFFFFFF;
            v2 = this.mPrimaryOrientation.getStartAfterPadding();
            while(v0 != v1) {
                v5 = this.mSpans[v0];
                v6 = v5.getEndLine(v2);
                if(v6 < v8) {
                    v4 = v5;
                    v8 = v6;
                }

                v0 += v3;
            }

            return v4;
        }

        v8 = 0x80000000;
        v2 = this.mPrimaryOrientation.getEndAfterPadding();
        while(v0 != v1) {
            v5 = this.mSpans[v0];
            v6 = v5.getStartLine(v2);
            if(v6 > v8) {
                v4 = v5;
                v8 = v6;
            }

            v0 += v3;
        }

        return v4;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getRowCountForAccessibility(Recycler arg2, State arg3) {
        if(this.mOrientation == 0) {
            return this.mSpanCount;
        }

        return super.getRowCountForAccessibility(arg2, arg3);
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    private void handleUpdate(int arg6, int arg7, int arg8) {
        int v3;
        int v2;
        int v0 = this.mShouldReverseLayout ? this.getLastChildPosition() : this.getFirstChildPosition();
        int v1 = 8;
        if(arg8 != v1) {
            v2 = arg6 + arg7;
        label_15:
            v3 = v2;
            v2 = arg6;
        }
        else if(arg6 < arg7) {
            v2 = arg7 + 1;
            goto label_15;
        }
        else {
            v3 = arg6 + 1;
            v2 = arg7;
        }

        this.mLazySpanLookup.invalidateAfter(v2);
        if(arg8 != v1) {
            switch(arg8) {
                case 1: {
                    goto label_25;
                }
                case 2: {
                    goto label_22;
                }
            }

            goto label_33;
        label_22:
            this.mLazySpanLookup.offsetForRemoval(arg6, arg7);
            goto label_33;
        label_25:
            this.mLazySpanLookup.offsetForAddition(arg6, arg7);
        }
        else {
            this.mLazySpanLookup.offsetForRemoval(arg6, 1);
            this.mLazySpanLookup.offsetForAddition(arg7, 1);
        }

    label_33:
        if(v3 <= v0) {
            return;
        }

        arg6 = this.mShouldReverseLayout ? this.getFirstChildPosition() : this.getLastChildPosition();
        if(v2 <= arg6) {
            this.requestLayout();
        }
    }

    View hasGapsToFix() {
        int v11;
        int v10;
        int v6;
        int v0 = this.getChildCount() - 1;
        BitSet v2 = new BitSet(this.mSpanCount);
        v2.set(0, this.mSpanCount, true);
        int v5 = -1;
        int v3 = this.mOrientation != 1 || !this.isLayoutRTL() ? -1 : 1;
        if(this.mShouldReverseLayout) {
            v6 = -1;
        }
        else {
            v6 = v0 + 1;
            v0 = 0;
        }

        if(v0 < v6) {
            v5 = 1;
        }

        while(v0 != v6) {
            View v7 = this.getChildAt(v0);
            ViewGroup$LayoutParams v8 = v7.getLayoutParams();
            if(v2.get(((LayoutParams)v8).mSpan.mIndex)) {
                if(this.checkSpanForGap(((LayoutParams)v8).mSpan)) {
                    return v7;
                }
                else {
                    v2.clear(((LayoutParams)v8).mSpan.mIndex);
                }
            }

            if(((LayoutParams)v8).mFullSpan) {
            }
            else {
                int v9 = v0 + v5;
                if(v9 != v6) {
                    View v9_1 = this.getChildAt(v9);
                    if(this.mShouldReverseLayout) {
                        v10 = this.mPrimaryOrientation.getDecoratedEnd(v7);
                        v11 = this.mPrimaryOrientation.getDecoratedEnd(v9_1);
                        if(v10 < v11) {
                            return v7;
                        }
                        else if(v10 == v11) {
                            goto label_63;
                        }
                        else {
                            goto label_65;
                        }
                    }
                    else {
                        v10 = this.mPrimaryOrientation.getDecoratedStart(v7);
                        v11 = this.mPrimaryOrientation.getDecoratedStart(v9_1);
                        if(v10 > v11) {
                            return v7;
                        }
                        else if(v10 == v11) {
                        label_63:
                            v10 = 1;
                        }
                        else {
                        label_65:
                            v10 = 0;
                        }
                    }

                    if(v10 == 0) {
                        goto label_83;
                    }

                    int v8_1 = ((LayoutParams)v8).mSpan.mIndex - v9_1.getLayoutParams().mSpan.mIndex < 0 ? 1 : 0;
                    v9 = v3 < 0 ? 1 : 0;
                    if(v8_1 == v9) {
                        goto label_83;
                    }

                    return v7;
                }
            }

        label_83:
            v0 += v5;
        }

        return null;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        this.requestLayout();
    }

    public boolean isAutoMeasureEnabled() {
        boolean v0 = this.mGapStrategy != 0 ? true : false;
        return v0;
    }

    boolean isLayoutRTL() {
        boolean v1 = true;
        if(this.getLayoutDirection() == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    private void measureChildWithDecorationsAndMargin(View arg7, LayoutParams arg8, boolean arg9) {
        if(arg8.mFullSpan) {
            if(this.mOrientation == 1) {
                this.measureChildWithDecorationsAndMargin(arg7, this.mFullSizeSpec, StaggeredGridLayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingTop() + this.getPaddingBottom(), arg8.height, true), arg9);
            }
            else {
                this.measureChildWithDecorationsAndMargin(arg7, StaggeredGridLayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingLeft() + this.getPaddingRight(), arg8.width, true), this.mFullSizeSpec, arg9);
            }
        }
        else if(this.mOrientation == 1) {
            this.measureChildWithDecorationsAndMargin(arg7, StaggeredGridLayoutManager.getChildMeasureSpec(this.mSizePerSpan, this.getWidthMode(), 0, arg8.width, false), StaggeredGridLayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingTop() + this.getPaddingBottom(), arg8.height, true), arg9);
        }
        else {
            this.measureChildWithDecorationsAndMargin(arg7, StaggeredGridLayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingLeft() + this.getPaddingRight(), arg8.width, true), StaggeredGridLayoutManager.getChildMeasureSpec(this.mSizePerSpan, this.getHeightMode(), 0, arg8.height, false), arg9);
        }
    }

    private void measureChildWithDecorationsAndMargin(View arg5, int arg6, int arg7, boolean arg8) {
        this.calculateItemDecorationsForChild(arg5, this.mTmpRect);
        ViewGroup$LayoutParams v0 = arg5.getLayoutParams();
        arg6 = this.updateSpecWithExtra(arg6, ((LayoutParams)v0).leftMargin + this.mTmpRect.left, ((LayoutParams)v0).rightMargin + this.mTmpRect.right);
        arg7 = this.updateSpecWithExtra(arg7, ((LayoutParams)v0).topMargin + this.mTmpRect.top, ((LayoutParams)v0).bottomMargin + this.mTmpRect.bottom);
        arg8 = arg8 ? this.shouldReMeasureChild(arg5, arg6, arg7, ((androidx.recyclerview.widget.RecyclerView$LayoutParams)v0)) : this.shouldMeasureChild(arg5, arg6, arg7, ((androidx.recyclerview.widget.RecyclerView$LayoutParams)v0));
        if(arg8) {
            arg5.measure(arg6, arg7);
        }
    }

    public void offsetChildrenHorizontal(int arg3) {
        super.offsetChildrenHorizontal(arg3);
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            this.mSpans[v0].onOffset(arg3);
        }
    }

    public void offsetChildrenVertical(int arg3) {
        super.offsetChildrenVertical(arg3);
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            this.mSpans[v0].onOffset(arg3);
        }
    }

    public void onDetachedFromWindow(RecyclerView arg2, Recycler arg3) {
        super.onDetachedFromWindow(arg2, arg3);
        this.removeCallbacks(this.mCheckForGapsRunnable);
        int v3;
        for(v3 = 0; v3 < this.mSpanCount; ++v3) {
            this.mSpans[v3].clear();
        }

        arg2.requestLayout();
    }

    @Nullable public View onFocusSearchFailed(View arg9, int arg10, Recycler arg11, State arg12) {
        View v12;
        View v1 = null;
        if(this.getChildCount() == 0) {
            return v1;
        }

        arg9 = this.findContainingItemView(arg9);
        if(arg9 == null) {
            return v1;
        }

        this.resolveShouldLayoutReverse();
        arg10 = this.convertFocusDirectionToLayoutDirection(arg10);
        if(arg10 == 0x80000000) {
            return v1;
        }

        ViewGroup$LayoutParams v0 = arg9.getLayoutParams();
        boolean v2 = ((LayoutParams)v0).mFullSpan;
        Span v0_1 = ((LayoutParams)v0).mSpan;
        int v4 = arg10 == 1 ? this.getLastChildPosition() : this.getFirstChildPosition();
        this.updateLayoutState(v4, arg12);
        this.setLayoutStateDirection(arg10);
        this.mLayoutState.mCurrentPosition = this.mLayoutState.mItemDirection + v4;
        this.mLayoutState.mAvailable = ((int)((((float)this.mPrimaryOrientation.getTotalSpace())) * 0.333333f));
        this.mLayoutState.mStopInFocusable = true;
        int v6 = 0;
        this.mLayoutState.mRecycle = false;
        this.fill(arg11, this.mLayoutState, arg12);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if(!v2) {
            View v11 = v0_1.getFocusableViewAfter(v4, arg10);
            if(v11 != null && v11 != arg9) {
                return v11;
            }
        }

        if(this.preferLastSpan(arg10)) {
            int v11_1;
            for(v11_1 = this.mSpanCount - 1; v11_1 >= 0; --v11_1) {
                v12 = this.mSpans[v11_1].getFocusableViewAfter(v4, arg10);
                if(v12 != null && v12 != arg9) {
                    return v12;
                }
            }
        }
        else {
            for(v11_1 = 0; v11_1 < this.mSpanCount; ++v11_1) {
                v12 = this.mSpans[v11_1].getFocusableViewAfter(v4, arg10);
                if(v12 != null && v12 != arg9) {
                    return v12;
                }
            }
        }

        v11_1 = this.mReverseLayout ^ 1;
        int v12_1 = arg10 == -1 ? 1 : 0;
        v11_1 = v11_1 == v12_1 ? 1 : 0;
        if(!v2) {
            v12_1 = v11_1 != 0 ? v0_1.findFirstPartiallyVisibleItemPosition() : v0_1.findLastPartiallyVisibleItemPosition();
            v12 = this.findViewByPosition(v12_1);
            if(v12 == null) {
                goto label_93;
            }

            if(v12 == arg9) {
                goto label_93;
            }

            return v12;
        }

    label_93:
        if(this.preferLastSpan(arg10)) {
            for(arg10 = this.mSpanCount - 1; arg10 >= 0; --arg10) {
                if(arg10 == v0_1.mIndex) {
                }
                else {
                    v12_1 = v11_1 != 0 ? this.mSpans[arg10].findFirstPartiallyVisibleItemPosition() : this.mSpans[arg10].findLastPartiallyVisibleItemPosition();
                    v12 = this.findViewByPosition(v12_1);
                    if(v12 == null) {
                        goto label_113;
                    }

                    if(v12 == arg9) {
                        goto label_113;
                    }

                    return v12;
                }

            label_113:
            }
        }
        else {
            while(v6 < this.mSpanCount) {
                arg10 = v11_1 != 0 ? this.mSpans[v6].findFirstPartiallyVisibleItemPosition() : this.mSpans[v6].findLastPartiallyVisibleItemPosition();
                View v10 = this.findViewByPosition(arg10);
                if(v10 != null && v10 != arg9) {
                    return v10;
                }

                ++v6;
            }
        }

        return v1;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent arg3) {
        super.onInitializeAccessibilityEvent(arg3);
        if(this.getChildCount() > 0) {
            View v1 = this.findFirstVisibleItemClosestToStart(false);
            View v0 = this.findFirstVisibleItemClosestToEnd(false);
            if(v1 != null) {
                if(v0 == null) {
                }
                else {
                    int v1_1 = this.getPosition(v1);
                    int v0_1 = this.getPosition(v0);
                    if(v1_1 < v0_1) {
                        arg3.setFromIndex(v1_1);
                        arg3.setToIndex(v0_1);
                    }
                    else {
                        arg3.setFromIndex(v0_1);
                        arg3.setToIndex(v1_1);
                    }

                    return;
                }
            }

            return;
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler arg7, State arg8, View arg9, AccessibilityNodeInfoCompat arg10) {
        int v1;
        int v0;
        ViewGroup$LayoutParams v7 = arg9.getLayoutParams();
        if(!(v7 instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(arg9, arg10);
            return;
        }

        if(this.mOrientation == 0) {
            v0 = ((LayoutParams)v7).getSpanIndex();
            v1 = ((LayoutParams)v7).mFullSpan ? this.mSpanCount : 1;
            arg10.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v0, v1, -1, -1, ((LayoutParams)v7).mFullSpan, false));
        }
        else {
            v0 = -1;
            v1 = -1;
            int v2 = ((LayoutParams)v7).getSpanIndex();
            int v3 = ((LayoutParams)v7).mFullSpan ? this.mSpanCount : 1;
            arg10.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v0, v1, v2, v3, ((LayoutParams)v7).mFullSpan, false));
        }
    }

    public void onItemsAdded(RecyclerView arg1, int arg2, int arg3) {
        this.handleUpdate(arg2, arg3, 1);
    }

    public void onItemsChanged(RecyclerView arg1) {
        this.mLazySpanLookup.clear();
        this.requestLayout();
    }

    public void onItemsMoved(RecyclerView arg1, int arg2, int arg3, int arg4) {
        this.handleUpdate(arg2, arg3, 8);
    }

    public void onItemsRemoved(RecyclerView arg1, int arg2, int arg3) {
        this.handleUpdate(arg2, arg3, 2);
    }

    public void onItemsUpdated(RecyclerView arg1, int arg2, int arg3, Object arg4) {
        this.handleUpdate(arg2, arg3, 4);
    }

    private void onLayoutChildren(Recycler arg9, State arg10, boolean arg11) {
        int v11;
        AnchorInfo v0 = this.mAnchorInfo;
        int v2 = -1;
        if((this.mPendingSavedState != null || this.mPendingScrollPosition != v2) && arg10.getItemCount() == 0) {
            this.removeAndRecycleAllViews(arg9);
            v0.reset();
            return;
        }

        int v4 = 1;
        int v1 = !v0.mValid || this.mPendingScrollPosition != v2 || this.mPendingSavedState != null ? 1 : 0;
        if(v1 != 0) {
            v0.reset();
            if(this.mPendingSavedState != null) {
                this.applyPendingSavedState(v0);
            }
            else {
                this.resolveShouldLayoutReverse();
                v0.mLayoutFromEnd = this.mShouldReverseLayout;
            }

            this.updateAnchorInfoForLayout(arg10, v0);
            v0.mValid = true;
        }

        if(this.mPendingSavedState == null && this.mPendingScrollPosition == v2 && (v0.mLayoutFromEnd != this.mLastLayoutFromEnd || this.isLayoutRTL() != this.mLastLayoutRTL)) {
            this.mLazySpanLookup.clear();
            v0.mInvalidateOffsets = true;
        }

        if(this.getChildCount() > 0 && (this.mPendingSavedState == null || this.mPendingSavedState.mSpanOffsetsSize < 1)) {
            if(v0.mInvalidateOffsets) {
                for(v1 = 0; true; ++v1) {
                    if(v1 >= this.mSpanCount) {
                        goto label_101;
                    }

                    this.mSpans[v1].clear();
                    if(v0.mOffset != 0x80000000) {
                        this.mSpans[v1].setLine(v0.mOffset);
                    }
                }
            }

            if(v1 == 0) {
                if(this.mAnchorInfo.mSpanReferenceLines == null) {
                }
                else {
                    v1 = 0;
                    while(true) {
                        if(v1 < this.mSpanCount) {
                            Span v5 = this.mSpans[v1];
                            v5.clear();
                            v5.setLine(this.mAnchorInfo.mSpanReferenceLines[v1]);
                            ++v1;
                            continue;
                        }
                        else {
                            goto label_101;
                        }
                    }
                }
            }

            for(v1 = 0; v1 < this.mSpanCount; ++v1) {
                this.mSpans[v1].cacheReferenceLineAndClear(this.mShouldReverseLayout, v0.mOffset);
            }

            this.mAnchorInfo.saveSpanReferenceLines(this.mSpans);
        }

    label_101:
        this.detachAndScrapAttachedViews(arg9);
        this.mLayoutState.mRecycle = false;
        this.mLaidOutInvalidFullSpan = false;
        this.updateMeasureSpecs(this.mSecondaryOrientation.getTotalSpace());
        this.updateLayoutState(v0.mPosition, arg10);
        if(v0.mLayoutFromEnd) {
            this.setLayoutStateDirection(v2);
            this.fill(arg9, this.mLayoutState, arg10);
            this.setLayoutStateDirection(1);
            this.mLayoutState.mCurrentPosition = v0.mPosition + this.mLayoutState.mItemDirection;
            this.fill(arg9, this.mLayoutState, arg10);
        }
        else {
            this.setLayoutStateDirection(1);
            this.fill(arg9, this.mLayoutState, arg10);
            this.setLayoutStateDirection(v2);
            this.mLayoutState.mCurrentPosition = v0.mPosition + this.mLayoutState.mItemDirection;
            this.fill(arg9, this.mLayoutState, arg10);
        }

        this.repositionToWrapContentIfNecessary();
        if(this.getChildCount() > 0) {
            if(this.mShouldReverseLayout) {
                this.fixEndGap(arg9, arg10, true);
                this.fixStartGap(arg9, arg10, false);
            }
            else {
                this.fixStartGap(arg9, arg10, true);
                this.fixEndGap(arg9, arg10, false);
            }
        }

        if(!arg11 || (arg10.isPreLayout())) {
        label_167:
            v4 = 0;
        }
        else {
            if(this.mGapStrategy == 0 || this.getChildCount() <= 0) {
            label_160:
                v11 = 0;
            }
            else {
                if(!this.mLaidOutInvalidFullSpan && this.hasGapsToFix() == null) {
                    goto label_160;
                }

                v11 = 1;
            }

            if(v11 == 0) {
                goto label_167;
            }

            this.removeCallbacks(this.mCheckForGapsRunnable);
            if(!this.checkForGaps()) {
                goto label_167;
            }
        }

        if(arg10.isPreLayout()) {
            this.mAnchorInfo.reset();
        }

        this.mLastLayoutFromEnd = v0.mLayoutFromEnd;
        this.mLastLayoutRTL = this.isLayoutRTL();
        if(v4 != 0) {
            this.mAnchorInfo.reset();
            this.onLayoutChildren(arg9, arg10, false);
        }
    }

    public void onLayoutChildren(Recycler arg2, State arg3) {
        this.onLayoutChildren(arg2, arg3, true);
    }

    public void onLayoutCompleted(State arg1) {
        super.onLayoutCompleted(arg1);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    public void onRestoreInstanceState(Parcelable arg2) {
        if((arg2 instanceof SavedState)) {
            this.mPendingSavedState = ((SavedState)arg2);
            this.requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        if(this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }

        SavedState v0 = new SavedState();
        v0.mReverseLayout = this.mReverseLayout;
        v0.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        v0.mLastLayoutRTL = this.mLastLayoutRTL;
        int v2 = 0;
        if(this.mLazySpanLookup == null || this.mLazySpanLookup.mData == null) {
            v0.mSpanLookupSize = 0;
        }
        else {
            v0.mSpanLookup = this.mLazySpanLookup.mData;
            v0.mSpanLookupSize = v0.mSpanLookup.length;
            v0.mFullSpanItems = this.mLazySpanLookup.mFullSpanItems;
        }

        if(this.getChildCount() > 0) {
            int v1 = this.mLastLayoutFromEnd ? this.getLastChildPosition() : this.getFirstChildPosition();
            v0.mAnchorPosition = v1;
            v0.mVisibleAnchorPosition = this.findFirstVisibleItemPositionInt();
            v0.mSpanOffsetsSize = this.mSpanCount;
            v0.mSpanOffsets = new int[this.mSpanCount];
            while(v2 < this.mSpanCount) {
                int v3 = 0x80000000;
                if(this.mLastLayoutFromEnd) {
                    v1 = this.mSpans[v2].getEndLine(v3);
                    if(v1 != v3) {
                        v1 -= this.mPrimaryOrientation.getEndAfterPadding();
                    }
                }
                else {
                    v1 = this.mSpans[v2].getStartLine(v3);
                    if(v1 != v3) {
                        v1 -= this.mPrimaryOrientation.getStartAfterPadding();
                    }
                }

                v0.mSpanOffsets[v2] = v1;
                ++v2;
            }
        }
        else {
            v0.mAnchorPosition = -1;
            v0.mVisibleAnchorPosition = -1;
            v0.mSpanOffsetsSize = 0;
        }

        return ((Parcelable)v0);
    }

    public void onScrollStateChanged(int arg1) {
        if(arg1 == 0) {
            this.checkForGaps();
        }
    }

    private boolean preferLastSpan(int arg5) {
        boolean v5;
        int v1 = -1;
        boolean v2 = false;
        if(this.mOrientation == 0) {
            v5 = arg5 == v1 ? true : false;
            if(v5 != this.mShouldReverseLayout) {
                v2 = true;
            }

            return v2;
        }

        v5 = arg5 == v1 ? true : false;
        v5 = v5 == this.mShouldReverseLayout ? true : false;
        if(v5 == this.isLayoutRTL()) {
            v2 = true;
        }

        return v2;
    }

    void prepareLayoutStateForDelta(int arg5, State arg6) {
        int v2;
        int v1;
        if(arg5 > 0) {
            v1 = this.getLastChildPosition();
            v2 = 1;
        }
        else {
            v1 = this.getFirstChildPosition();
            v2 = -1;
        }

        this.mLayoutState.mRecycle = true;
        this.updateLayoutState(v1, arg6);
        this.setLayoutStateDirection(v2);
        this.mLayoutState.mCurrentPosition = v1 + this.mLayoutState.mItemDirection;
        this.mLayoutState.mAvailable = Math.abs(arg5);
    }

    private void prependViewToAllSpans(View arg3) {
        int v0;
        for(v0 = this.mSpanCount - 1; v0 >= 0; --v0) {
            this.mSpans[v0].prependToSpan(arg3);
        }
    }

    private void recycle(Recycler arg3, LayoutState arg4) {
        int v4;
        int v0;
        if(arg4.mRecycle) {
            if(arg4.mInfinite) {
            }
            else {
                int v1 = -1;
                if(arg4.mAvailable == 0) {
                    if(arg4.mLayoutDirection == v1) {
                        this.recycleFromEnd(arg3, arg4.mEndLine);
                    }
                    else {
                        this.recycleFromStart(arg3, arg4.mStartLine);
                    }
                }
                else if(arg4.mLayoutDirection == v1) {
                    v0 = arg4.mStartLine - this.getMaxStart(arg4.mStartLine);
                    v4 = v0 < 0 ? arg4.mEndLine : arg4.mEndLine - Math.min(v0, arg4.mAvailable);
                    this.recycleFromEnd(arg3, v4);
                }
                else {
                    v0 = this.getMinEnd(arg4.mEndLine) - arg4.mEndLine;
                    v4 = v0 < 0 ? arg4.mStartLine : Math.min(v0, arg4.mAvailable) + arg4.mStartLine;
                    this.recycleFromStart(arg3, v4);
                }

                return;
            }
        }
    }

    private void recycleFromEnd(Recycler arg7, int arg8) {
        int v0 = this.getChildCount() - 1;
        while(true) {
            if(v0 < 0) {
                return;
            }

            View v2 = this.getChildAt(v0);
            if(this.mPrimaryOrientation.getDecoratedStart(v2) >= arg8 && this.mPrimaryOrientation.getTransformedStartWithDecoration(v2) >= arg8) {
                ViewGroup$LayoutParams v3 = v2.getLayoutParams();
                if(((LayoutParams)v3).mFullSpan) {
                    int v3_1 = 0;
                    int v4 = 0;
                    while(v4 < this.mSpanCount) {
                        if(this.mSpans[v4].mViews.size() == 1) {
                            return;
                        }
                        else {
                            ++v4;
                            continue;
                        }

                        break;
                    }

                    while(v3_1 < this.mSpanCount) {
                        this.mSpans[v3_1].popEnd();
                        ++v3_1;
                    }
                }
                else {
                    if(((LayoutParams)v3).mSpan.mViews.size() == 1) {
                        return;
                    }

                    ((LayoutParams)v3).mSpan.popEnd();
                }

                this.removeAndRecycleView(v2, arg7);
                --v0;
                continue;
            }

            return;
        }
    }

    private void recycleFromStart(Recycler arg6, int arg7) {
        while(true) {
            if(this.getChildCount() <= 0) {
                return;
            }

            int v0 = 0;
            View v1 = this.getChildAt(0);
            if(this.mPrimaryOrientation.getDecoratedEnd(v1) <= arg7 && this.mPrimaryOrientation.getTransformedEndWithDecoration(v1) <= arg7) {
                ViewGroup$LayoutParams v2 = v1.getLayoutParams();
                if(((LayoutParams)v2).mFullSpan) {
                    int v2_1 = 0;
                    while(v2_1 < this.mSpanCount) {
                        if(this.mSpans[v2_1].mViews.size() == 1) {
                            return;
                        }
                        else {
                            ++v2_1;
                            continue;
                        }

                        break;
                    }

                    while(v0 < this.mSpanCount) {
                        this.mSpans[v0].popStart();
                        ++v0;
                    }
                }
                else {
                    if(((LayoutParams)v2).mSpan.mViews.size() == 1) {
                        return;
                    }

                    ((LayoutParams)v2).mSpan.popStart();
                }

                this.removeAndRecycleView(v1, arg6);
                continue;
            }

            return;
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if(this.mSecondaryOrientation.getMode() == 0x40000000) {
            return;
        }

        int v1 = this.getChildCount();
        int v2 = 0;
        int v0 = 0;
        float v3 = 0f;
        while(v0 < v1) {
            View v4 = this.getChildAt(v0);
            float v5 = ((float)this.mSecondaryOrientation.getDecoratedMeasurement(v4));
            if(v5 < v3) {
            }
            else {
                if(v4.getLayoutParams().isFullSpan()) {
                    v5 = v5 * 1f / (((float)this.mSpanCount));
                }

                v3 = Math.max(v3, v5);
            }

            ++v0;
        }

        v0 = this.mSizePerSpan;
        int v3_1 = Math.round(v3 * (((float)this.mSpanCount)));
        if(this.mSecondaryOrientation.getMode() == 0x80000000) {
            v3_1 = Math.min(v3_1, this.mSecondaryOrientation.getTotalSpace());
        }

        this.updateMeasureSpecs(v3_1);
        if(this.mSizePerSpan == v0) {
            return;
        }

        while(v2 < v1) {
            View v3_2 = this.getChildAt(v2);
            ViewGroup$LayoutParams v4_1 = v3_2.getLayoutParams();
            if(((LayoutParams)v4_1).mFullSpan) {
            }
            else {
                if((this.isLayoutRTL()) && this.mOrientation == 1) {
                    v3_2.offsetLeftAndRight(-(this.mSpanCount - 1 - ((LayoutParams)v4_1).mSpan.mIndex) * this.mSizePerSpan - -(this.mSpanCount - 1 - ((LayoutParams)v4_1).mSpan.mIndex) * v0);
                    goto label_87;
                }

                int v5_1 = ((LayoutParams)v4_1).mSpan.mIndex * this.mSizePerSpan;
                int v4_2 = ((LayoutParams)v4_1).mSpan.mIndex * v0;
                if(this.mOrientation == 1) {
                    v3_2.offsetLeftAndRight(v5_1 - v4_2);
                    goto label_87;
                }

                v3_2.offsetTopAndBottom(v5_1 - v4_2);
            }

        label_87:
            ++v2;
        }
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = this.mOrientation == 1 || !this.isLayoutRTL() ? this.mReverseLayout : this.mReverseLayout ^ 1;
    }

    int scrollBy(int arg3, Recycler arg4, State arg5) {
        if(this.getChildCount() != 0) {
            if(arg3 == 0) {
            }
            else {
                this.prepareLayoutStateForDelta(arg3, arg5);
                int v5 = this.fill(arg4, this.mLayoutState, arg5);
                if(this.mLayoutState.mAvailable < v5) {
                }
                else if(arg3 < 0) {
                    arg3 = -v5;
                }
                else {
                    arg3 = v5;
                }

                this.mPrimaryOrientation.offsetChildren(-arg3);
                this.mLastLayoutFromEnd = this.mShouldReverseLayout;
                this.mLayoutState.mAvailable = 0;
                this.recycle(arg4, this.mLayoutState);
                return arg3;
            }
        }

        return 0;
    }

    public int scrollHorizontallyBy(int arg1, Recycler arg2, State arg3) {
        return this.scrollBy(arg1, arg2, arg3);
    }

    public void scrollToPosition(int arg2) {
        if(this.mPendingSavedState != null && this.mPendingSavedState.mAnchorPosition != arg2) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }

        this.mPendingScrollPosition = arg2;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.requestLayout();
    }

    public void scrollToPositionWithOffset(int arg2, int arg3) {
        if(this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }

        this.mPendingScrollPosition = arg2;
        this.mPendingScrollPositionOffset = arg3;
        this.requestLayout();
    }

    public int scrollVerticallyBy(int arg1, Recycler arg2, State arg3) {
        return this.scrollBy(arg1, arg2, arg3);
    }

    public void setGapStrategy(int arg2) {
        this.assertNotInLayoutOrScroll(null);
        if(arg2 == this.mGapStrategy) {
            return;
        }

        if(arg2 != 0) {
            if(arg2 == 2) {
            }
            else {
                throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
            }
        }

        this.mGapStrategy = arg2;
        this.requestLayout();
    }

    private void setLayoutStateDirection(int arg5) {
        this.mLayoutState.mLayoutDirection = arg5;
        LayoutState v0 = this.mLayoutState;
        boolean v1 = this.mShouldReverseLayout;
        int v2 = 1;
        boolean v5 = arg5 == -1 ? true : false;
        if(v1 == v5) {
        }
        else {
            v2 = -1;
        }

        v0.mItemDirection = v2;
    }

    public void setMeasuredDimension(Rect arg5, int arg6, int arg7) {
        int v5;
        int v0 = this.getPaddingLeft() + this.getPaddingRight();
        int v1 = this.getPaddingTop() + this.getPaddingBottom();
        if(this.mOrientation == 1) {
            v5 = StaggeredGridLayoutManager.chooseSize(arg7, arg5.height() + v1, this.getMinimumHeight());
            arg6 = StaggeredGridLayoutManager.chooseSize(arg6, this.mSizePerSpan * this.mSpanCount + v0, this.getMinimumWidth());
        }
        else {
            arg6 = StaggeredGridLayoutManager.chooseSize(arg6, arg5.width() + v0, this.getMinimumWidth());
            v5 = StaggeredGridLayoutManager.chooseSize(arg7, this.mSizePerSpan * this.mSpanCount + v1, this.getMinimumHeight());
        }

        this.setMeasuredDimension(arg6, v5);
    }

    public void setOrientation(int arg2) {
        if(arg2 != 0) {
            if(arg2 == 1) {
            }
            else {
                throw new IllegalArgumentException("invalid orientation.");
            }
        }

        this.assertNotInLayoutOrScroll(null);
        if(arg2 == this.mOrientation) {
            return;
        }

        this.mOrientation = arg2;
        OrientationHelper v2 = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = v2;
        this.requestLayout();
    }

    public void setReverseLayout(boolean arg2) {
        this.assertNotInLayoutOrScroll(null);
        if(this.mPendingSavedState != null && this.mPendingSavedState.mReverseLayout != arg2) {
            this.mPendingSavedState.mReverseLayout = arg2;
        }

        this.mReverseLayout = arg2;
        this.requestLayout();
    }

    public void setSpanCount(int arg3) {
        this.assertNotInLayoutOrScroll(null);
        if(arg3 != this.mSpanCount) {
            this.invalidateSpanAssignments();
            this.mSpanCount = arg3;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for(arg3 = 0; arg3 < this.mSpanCount; ++arg3) {
                this.mSpans[arg3] = new Span(this, arg3);
            }

            this.requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView arg1, State arg2, int arg3) {
        LinearSmoothScroller v2 = new LinearSmoothScroller(arg1.getContext());
        v2.setTargetPosition(arg3);
        this.startSmoothScroll(((SmoothScroller)v2));
    }

    public boolean supportsPredictiveItemAnimations() {
        boolean v0 = this.mPendingSavedState == null ? true : false;
        return v0;
    }

    private void updateAllRemainingSpans(int arg3, int arg4) {
        int v0;
        for(v0 = 0; v0 < this.mSpanCount; ++v0) {
            if(this.mSpans[v0].mViews.isEmpty()) {
            }
            else {
                this.updateRemainingSpans(this.mSpans[v0], arg3, arg4);
            }
        }
    }

    private boolean updateAnchorFromChildren(State arg2, AnchorInfo arg3) {
        int v2 = this.mLastLayoutFromEnd ? this.findLastReferenceChildPosition(arg2.getItemCount()) : this.findFirstReferenceChildPosition(arg2.getItemCount());
        arg3.mPosition = v2;
        arg3.mOffset = 0x80000000;
        return 1;
    }

    boolean updateAnchorFromPendingData(State arg5, AnchorInfo arg6) {
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
                        if(this.mPendingSavedState == null || this.mPendingSavedState.mAnchorPosition == v2 || this.mPendingSavedState.mSpanOffsetsSize < 1) {
                            View v5 = this.findViewByPosition(this.mPendingScrollPosition);
                            if(v5 != null) {
                                int v1_1 = this.mShouldReverseLayout ? this.getLastChildPosition() : this.getFirstChildPosition();
                                arg6.mPosition = v1_1;
                                if(this.mPendingScrollPositionOffset != v3) {
                                    arg6.mOffset = arg6.mLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedEnd(v5) : this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedStart(v5);
                                    return 1;
                                }

                                if(this.mPrimaryOrientation.getDecoratedMeasurement(v5) > this.mPrimaryOrientation.getTotalSpace()) {
                                    int v5_1 = arg6.mLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                                    arg6.mOffset = v5_1;
                                    return 1;
                                }

                                v1_1 = this.mPrimaryOrientation.getDecoratedStart(v5) - this.mPrimaryOrientation.getStartAfterPadding();
                                if(v1_1 < 0) {
                                    arg6.mOffset = -v1_1;
                                    return 1;
                                }

                                v1_1 = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(v5);
                                if(v1_1 < 0) {
                                    arg6.mOffset = v1_1;
                                    return 1;
                                }

                                arg6.mOffset = v3;
                            }
                            else {
                                arg6.mPosition = this.mPendingScrollPosition;
                                if(this.mPendingScrollPositionOffset == v3) {
                                    if(this.calculateScrollDirectionForPosition(arg6.mPosition) == 1) {
                                        v1 = true;
                                    }

                                    arg6.mLayoutFromEnd = v1;
                                    arg6.assignCoordinateFromPadding();
                                }
                                else {
                                    arg6.assignCoordinateFromPadding(this.mPendingScrollPositionOffset);
                                }

                                arg6.mInvalidateOffsets = true;
                            }
                        }
                        else {
                            arg6.mOffset = v3;
                            arg6.mPosition = this.mPendingScrollPosition;
                        }

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

    void updateAnchorInfoForLayout(State arg2, AnchorInfo arg3) {
        if(this.updateAnchorFromPendingData(arg2, arg3)) {
            return;
        }

        if(this.updateAnchorFromChildren(arg2, arg3)) {
            return;
        }

        arg3.assignCoordinateFromPadding();
        arg3.mPosition = 0;
    }

    private void updateLayoutState(int arg5, State arg6) {
        int v6;
        boolean v1 = false;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.mCurrentPosition = arg5;
        if(this.isSmoothScrolling()) {
            v6 = arg6.getTargetScrollPosition();
            if(v6 != -1) {
                boolean v0 = this.mShouldReverseLayout;
                boolean v5 = v6 < arg5 ? true : false;
                if(v0 == v5) {
                    v6 = this.mPrimaryOrientation.getTotalSpace();
                    arg5 = 0;
                    goto label_27;
                }

                arg5 = this.mPrimaryOrientation.getTotalSpace();
                goto label_26;
            }
            else {
                goto label_25;
            }
        }
        else {
        label_25:
            arg5 = 0;
        label_26:
            v6 = 0;
        }

    label_27:
        if(this.getClipToPadding()) {
            this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - arg5;
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + v6;
        }
        else {
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + v6;
            this.mLayoutState.mStartLine = -arg5;
        }

        this.mLayoutState.mStopInFocusable = false;
        this.mLayoutState.mRecycle = true;
        LayoutState v5_1 = this.mLayoutState;
        if(this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            v1 = true;
        }

        v5_1.mInfinite = v1;
    }

    void updateMeasureSpecs(int arg2) {
        this.mSizePerSpan = arg2 / this.mSpanCount;
        this.mFullSizeSpec = View$MeasureSpec.makeMeasureSpec(arg2, this.mSecondaryOrientation.getMode());
    }

    private void updateRemainingSpans(Span arg4, int arg5, int arg6) {
        int v0 = arg4.getDeletedSize();
        if(arg5 == -1) {
            if(arg4.getStartLine() + v0 <= arg6) {
                this.mRemainingSpans.set(arg4.mIndex, false);
            }
        }
        else if(arg4.getEndLine() - v0 >= arg6) {
            this.mRemainingSpans.set(arg4.mIndex, false);
        }
    }

    private int updateSpecWithExtra(int arg3, int arg4, int arg5) {
        if(arg4 == 0 && arg5 == 0) {
            return arg3;
        }

        int v0 = View$MeasureSpec.getMode(arg3);
        if(v0 != 0x80000000) {
            if(v0 == 0x40000000) {
            }
            else {
                return arg3;
            }
        }

        return View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(arg3) - arg4 - arg5), v0);
    }
}

