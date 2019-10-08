package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaf extends zad {
    private final RegisterListenerMethod zaco;
    private final UnregisterListenerMethod zacp;

    public zaf(zabw arg2, TaskCompletionSource arg3) {
        super(3, arg3);
        this.zaco = arg2.zajw;
        this.zacp = arg2.zajx;
    }

    public final void zaa(@NonNull Status arg1) {
        super.zaa(arg1);
    }

    public final void zaa(@NonNull zaab arg1, boolean arg2) {
    }

    public final void zaa(@NonNull RuntimeException arg1) {
        super.zaa(arg1);
    }

    @Nullable public final Feature[] zab(zaa arg1) {
        return this.zaco.getRequiredFeatures();
    }

    public final boolean zac(zaa arg1) {
        return this.zaco.shouldAutoResolveMissingFeatures();
    }

    public final void zad(zaa arg5) throws RemoteException {
        this.zaco.registerListener(arg5.zaab(), this.zacm);
        if(this.zaco.getListenerKey() != null) {
            arg5.zabk().put(this.zaco.getListenerKey(), new zabw(this.zaco, this.zacp));
        }
    }
}

