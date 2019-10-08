package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public abstract class zzn extends zzb implements zzm {
    public static zzm zzc(IBinder arg2) {
        if(arg2 == null) {
            return null;
        }

        IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if((v0 instanceof zzm)) {
            return ((zzm)v0);
        }

        return new zzo(arg2);
    }
}

