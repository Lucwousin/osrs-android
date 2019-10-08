package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzg implements zzj {
    zzg(String arg1, int arg2) {
        this.zzr = arg1;
        this.zzs = arg2;
        super();
    }

    public final Object zzb(IBinder arg3) throws RemoteException, IOException, GoogleAuthException {
        return zzd.zzb(zzf.zza(arg3).zza(new AccountChangeEventsRequest().setAccountName(this.zzr).setEventIndex(this.zzs))).getEvents();
    }
}

