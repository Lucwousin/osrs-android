package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

final class zzi extends ApiMethodImpl {
    zzi(zzh arg1, Api arg2, GoogleApiClient arg3, boolean arg4) {
        this.zzae = arg4;
        super(arg2, arg3);
    }

    protected final Result createFailedResult(Status arg2) {
        return new zzp(arg2);
    }

    protected final void doExecute(AnyClient arg2) throws RemoteException {
        ((zzr)arg2).getService().zzb(this.zzae);
        this.setResult(new zzp(Status.RESULT_SUCCESS));
    }
}

