package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzo extends zza implements zzm {
    zzo(IBinder arg2) {
        super(arg2, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zza(zzk arg2, IObjectWrapper arg3) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        zzc.zza(v0, ((Parcelable)arg2));
        zzc.zza(v0, ((IInterface)arg3));
        Parcel v2 = ((zza)this).zza(5, v0);
        boolean v3 = zzc.zza(v2);
        v2.recycle();
        return v3;
    }
}

