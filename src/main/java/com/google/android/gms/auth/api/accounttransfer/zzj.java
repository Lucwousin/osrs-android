package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzz;

final class zzj extends zzc {
    zzj(AccountTransferClient arg1, zzab arg2) {
        this.zzau = arg2;
        super(null);
    }

    protected final void zza(zzz arg3) throws RemoteException {
        arg3.zza(this.zzax, this.zzau);
    }
}

