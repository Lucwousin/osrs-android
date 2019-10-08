package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd extends zzb implements zzc {
    public static zzc zzc(IBinder arg2) {
        if(arg2 == null) {
            return null;
        }

        IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if((v0 instanceof zzc)) {
            return ((zzc)v0);
        }

        return new zze(arg2);
    }
}

