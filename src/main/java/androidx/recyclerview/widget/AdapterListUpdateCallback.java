package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public final class AdapterListUpdateCallback implements ListUpdateCallback {
    @NonNull private final Adapter mAdapter;

    public AdapterListUpdateCallback(@NonNull Adapter arg1) {
        super();
        this.mAdapter = arg1;
    }

    public void onChanged(int arg2, int arg3, Object arg4) {
        this.mAdapter.notifyItemRangeChanged(arg2, arg3, arg4);
    }

    public void onInserted(int arg2, int arg3) {
        this.mAdapter.notifyItemRangeInserted(arg2, arg3);
    }

    public void onMoved(int arg2, int arg3) {
        this.mAdapter.notifyItemMoved(arg2, arg3);
    }

    public void onRemoved(int arg2, int arg3) {
        this.mAdapter.notifyItemRangeRemoved(arg2, arg3);
    }
}

