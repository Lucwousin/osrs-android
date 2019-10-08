package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk public abstract class UnregisterListenerMethod {
    private final ListenerKey zajk;

    @KeepForSdk protected UnregisterListenerMethod(ListenerKey arg1) {
        super();
        this.zajk = arg1;
    }

    @KeepForSdk public ListenerKey getListenerKey() {
        return this.zajk;
    }

    @KeepForSdk protected abstract void unregisterListener(AnyClient arg1, TaskCompletionSource arg2) throws RemoteException;
}

