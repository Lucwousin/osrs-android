package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzz;

final class zzi extends zzc {
    zzi(AccountTransferClient arg1, zzah arg2) {
        this.zzat = arg2;
        super(null);
    }

    protected final void zza(zzz arg3) throws RemoteException {
        arg3.zza(this.zzax, this.zzat);
    }
}

