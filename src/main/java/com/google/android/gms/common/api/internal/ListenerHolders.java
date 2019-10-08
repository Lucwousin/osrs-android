package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk public class ListenerHolders {
    private final Set zajn;

    public ListenerHolders() {
        super();
        this.zajn = Collections.newSetFromMap(new WeakHashMap());
    }

    @KeepForSdk public static ListenerHolder createListenerHolder(@NonNull Object arg1, @NonNull Looper arg2, @NonNull String arg3) {
        Preconditions.checkNotNull(arg1, "Listener must not be null");
        Preconditions.checkNotNull(arg2, "Looper must not be null");
        Preconditions.checkNotNull(arg3, "Listener type must not be null");
        return new ListenerHolder(arg2, arg1, arg3);
    }

    @KeepForSdk public static ListenerKey createListenerKey(@NonNull Object arg1, @NonNull String arg2) {
        Preconditions.checkNotNull(arg1, "Listener must not be null");
        Preconditions.checkNotNull(arg2, "Listener type must not be null");
        Preconditions.checkNotEmpty(arg2, "Listener type must not be empty");
        return new ListenerKey(arg1, arg2);
    }

    public final void release() {
        Iterator v0 = this.zajn.iterator();
        while(v0.hasNext()) {
            v0.next().clear();
        }

        this.zajn.clear();
    }

    public final ListenerHolder zaa(@NonNull Object arg1, @NonNull Looper arg2, @NonNull String arg3) {
        ListenerHolder v1 = ListenerHolders.createListenerHolder(arg1, arg2, arg3);
        this.zajn.add(v1);
        return v1;
    }
}

