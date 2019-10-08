package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzn extends zzc {
    zzn(zzm arg1) {
        this.zzbm = arg1;
        super();
    }

    public final void zzf(Status arg2) throws RemoteException {
        this.zzbm.setResult(((Result)arg2));
    }
}

