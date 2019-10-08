package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class zzao extends zza implements zzan {
    zzao(IBinder arg2) {
        super(arg2, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zza(zzal arg2) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        zzc.zza(v0, ((IInterface)arg2));
        ((zza)this).transactAndReadExceptionReturnVoid(3, v0);
    }

    public final void zza(zzal arg2, ProxyRequest arg3) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        zzc.zza(v0, ((IInterface)arg2));
        zzc.zza(v0, ((Parcelable)arg3));
        ((zza)this).transactAndReadExceptionReturnVoid(1, v0);
    }
}

