package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzt extends zzn implements zzr {
    zzt(IBinder arg2) {
        super(arg2, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle zza(Bundle arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        Parcel v2 = ((zzn)this).transactAndReadException(1, v0);
        Parcelable v0_1 = zzp.zza(v2, Bundle.CREATOR);
        v2.recycle();
        return ((Bundle)v0_1);
    }
}

