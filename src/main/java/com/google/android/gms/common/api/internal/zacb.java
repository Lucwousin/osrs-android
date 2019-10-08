package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacb extends UnregisterListenerMethod {
    zacb(Builder arg1, ListenerKey arg2) {
        this.zakg = arg1;
        super(arg2);
    }

    protected final void unregisterListener(AnyClient arg2, TaskCompletionSource arg3) throws RemoteException {
        Builder.zab(this.zakg).accept(arg2, arg3);
    }
}

