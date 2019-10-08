package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

final class zzj extends ApiMethodImpl {
    zzj(zzh arg1, Api arg2, GoogleApiClient arg3, String arg4) {
        this.zzq = arg4;
        super(arg2, arg3);
    }

    protected final Result createFailedResult(Status arg3) {
        return new zzo(arg3, null);
    }

    protected final void doExecute(AnyClient arg3) throws RemoteException {
        ((zzr)arg3).getService().zza(new zzk(this), this.zzq);
    }
}

