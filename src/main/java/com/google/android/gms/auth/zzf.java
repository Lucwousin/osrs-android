package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

final class zzf implements zzj {
    zzf(String arg1, Bundle arg2) {
        this.zzq = arg1;
        this.val$extras = arg2;
        super();
    }

    public final Object zzb(IBinder arg3) throws RemoteException, IOException, GoogleAuthException {
        Object v3 = zzd.zzb(com.google.android.gms.internal.auth.zzf.zza(arg3).zza(this.zzq, this.val$extras));
        String v0 = ((Bundle)v3).getString("Error");
        if(((Bundle)v3).getBoolean("booleanResult")) {
            return null;
        }

        throw new GoogleAuthException(v0);
    }
}

