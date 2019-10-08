package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzz;

final class zzg extends zzb {
    zzg(AccountTransferClient arg1, zzv arg2) {
        this.zzar = arg2;
        super(null);
    }

    protected final void zza(zzz arg3) throws RemoteException {
        arg3.zza(new zzh(this, ((zzb)this)), this.zzar);
    }
}

