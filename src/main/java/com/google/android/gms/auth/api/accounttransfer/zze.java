package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

final class zze extends zzb {
    zze(AccountTransferClient arg1, zzad arg2) {
        this.zzap = arg2;
        super(null);
    }

    protected final void zza(zzz arg3) throws RemoteException {
        arg3.zza(new zzf(this, ((zzb)this)), this.zzap);
    }
}

