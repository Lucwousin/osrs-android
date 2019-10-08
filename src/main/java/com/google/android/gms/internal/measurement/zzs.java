package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzs extends zzo implements zzr {
    public static zzr zza(IBinder arg2) {
        if(arg2 == null) {
            return null;
        }

        IInterface v0 = arg2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if((v0 instanceof zzr)) {
            return ((zzr)v0);
        }

        return new zzt(arg2);
    }
}

