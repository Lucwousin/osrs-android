package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract class ListAdapter extends Adapter {
    private final AsyncListDiffer mHelper;

    protected ListAdapter(@NonNull AsyncDifferConfig arg3) {
        super();
        this.mHelper = new AsyncListDiffer(new AdapterListUpdateCallback(((Adapter)this)), arg3);
    }

    protected ListAdapter(@NonNull ItemCallback arg4) {
        super();
        this.mHelper = new AsyncListDiffer(new AdapterListUpdateCallback(((Adapter)this)), new Builder(arg4).build());
    }

    protected Object getItem(int arg2) {
        return this.mHelper.getCurrentList().get(arg2);
    }

    public int getItemCount() {
        return this.mHelper.getCurrentList().size();
    }

    public void submitList(@Nullable List arg2) {
        this.mHelper.submitList(arg2);
    }
}

