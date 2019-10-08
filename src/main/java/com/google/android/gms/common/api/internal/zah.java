package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends zad {
    private final ListenerKey zacs;

    public zah(ListenerKey arg2, TaskCompletionSource arg3) {
        super(4, arg3);
        this.zacs = arg2;
    }

    public final void zaa(@NonNull Status arg1) {
        super.zaa(arg1);
    }

    public final void zaa(@NonNull zaab arg1, boolean arg2) {
    }

    public final void zaa(@NonNull RuntimeException arg1) {
        super.zaa(arg1);
    }

    @Nullable public final Feature[] zab(zaa arg2) {
        Object v2 = arg2.zabk().get(this.zacs);
        if(v2 == null) {
            return null;
        }

        return ((zabw)v2).zajw.getRequiredFeatures();
    }

    public final boolean zac(zaa arg2) {
        Object v2 = arg2.zabk().get(this.zacs);
        if(v2 != null && (((zabw)v2).zajw.shouldAutoResolveMissingFeatures())) {
            return 1;
        }

        return 0;
    }

    public final void zad(zaa arg4) throws RemoteException {
        Object v0 = arg4.zabk().remove(this.zacs);
        if(v0 != null) {
            ((zabw)v0).zajx.unregisterListener(arg4.zaab(), this.zacm);
            ((zabw)v0).zajw.clearListener();
            return;
        }

        this.zacm.trySetResult(Boolean.valueOf(false));
    }
}

