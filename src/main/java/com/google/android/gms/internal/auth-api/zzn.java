package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

final class zzn extends zzp {
    zzn(zzi arg1, GoogleApiClient arg2) {
        super(arg2);
    }

    protected final Result createFailedResult(Status arg1) {
        return arg1;
    }

    protected final void zzc(Context arg1, zzw arg2) throws RemoteException {
        arg2.zzc(new zzo(((ResultHolder)this)));
    }
}

