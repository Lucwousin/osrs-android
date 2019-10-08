package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public class ItemDelegate extends AccessibilityDelegateCompat {
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate arg1) {
            super();
            this.mRecyclerViewDelegate = arg1;
        }

        public void onInitializeAccessibilityNodeInfo(View arg2, AccessibilityNodeInfoCompat arg3) {
            super.onInitializeAccessibilityNodeInfo(arg2, arg3);
            if(!this.mRecyclerViewDelegate.shouldIgnore() && this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null) {
                this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(arg2, arg3);
            }
        }

        public boolean performAccessibilityAction(View arg2, int arg3, Bundle arg4) {
            if(super.performAccessibilityAction(arg2, arg3, arg4)) {
                return 1;
            }

            if(!this.mRecyclerViewDelegate.shouldIgnore() && this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null) {
                return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(arg2, arg3, arg4);
            }

            return 0;
        }
    }

    final AccessibilityDelegateCompat mItemDelegate;
    final RecyclerView mRecyclerView;

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView arg1) {
        super();
        this.mRecyclerView = arg1;
        this.mItemDelegate = new ItemDelegate(this);
    }

    @NonNull public AccessibilityDelegateCompat getItemDelegate() {
        return this.mItemDelegate;
    }

    public void onInitializeAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
        super.onInitializeAccessibilityEvent(arg2, arg3);
        arg3.setClassName(RecyclerView.class.getName());
        if(((arg2 instanceof RecyclerView)) && !this.shouldIgnore() && ((RecyclerView)arg2).getLayoutManager() != null) {
            ((RecyclerView)arg2).getLayoutManager().onInitializeAccessibilityEvent(arg3);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View arg1, AccessibilityNodeInfoCompat arg2) {
        super.onInitializeAccessibilityNodeInfo(arg1, arg2);
        arg2.setClassName(RecyclerView.class.getName());
        if(!this.shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(arg2);
        }
    }

    public boolean performAccessibilityAction(View arg1, int arg2, Bundle arg3) {
        if(super.performAccessibilityAction(arg1, arg2, arg3)) {
            return 1;
        }

        if(!this.shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            return this.mRecyclerView.getLayoutManager().performAccessibilityAction(arg2, arg3);
        }

        return 0;
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}

