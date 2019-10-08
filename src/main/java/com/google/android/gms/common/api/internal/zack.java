package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zack extends TaskApiCall {
    zack(Builder arg1, Feature[] arg2, boolean arg3) {
        this.zakm = arg1;
        super(arg2, arg3, null);
    }

    protected final void doExecute(AnyClient arg2, TaskCompletionSource arg3) throws RemoteException {
        Builder.zaa(this.zakm).accept(arg2, arg3);
    }
}

