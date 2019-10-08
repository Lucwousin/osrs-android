package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzh implements zzj {
    zzh(Account arg1) {
        this.zzo = arg1;
        super();
    }

    public final Object zzb(IBinder arg2) throws RemoteException, IOException, GoogleAuthException {
        return zzd.zzb(zzf.zza(arg2).zza(this.zzo));
    }
}

