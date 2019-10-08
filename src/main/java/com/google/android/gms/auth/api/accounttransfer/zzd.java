package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

final class zzd extends zzc {
    zzd(AccountTransferClient arg1, zzaf arg2) {
        this.zzao = arg2;
        super(null);
    }

    protected final void zza(zzz arg3) throws RemoteException {
        arg3.zza(this.zzax, this.zzao);
    }
}

