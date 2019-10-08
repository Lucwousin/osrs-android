package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzk extends zzo {
    zzk(GoogleApiClient arg1) {
        super(arg1);
    }

    protected final Result createFailedResult(Status arg1) {
        return arg1;
    }

    protected final void doExecute(AnyClient arg3) throws RemoteException {
        ((zzg)arg3).getService().zzd(new zzl(this), ((zzg)arg3).zzg());
    }
}

