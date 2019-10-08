package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaca extends RegisterListenerMethod {
    zaca(Builder arg1, ListenerHolder arg2, Feature[] arg3, boolean arg4) {
        this.zakg = arg1;
        super(arg2, arg3, arg4);
    }

    protected final void registerListener(AnyClient arg2, TaskCompletionSource arg3) throws RemoteException {
        Builder.zaa(this.zakg).accept(arg2, arg3);
    }
}

