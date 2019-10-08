package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;

public final class zze extends zza implements zzc {
    zze(IBinder arg2) {
        super(arg2, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void zza(com.google.android.gms.auth.account.zza arg2, Account arg3) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(v0, ((IInterface)arg2));
        com.google.android.gms.internal.auth.zzc.zza(v0, ((Parcelable)arg3));
        ((zza)this).transactAndReadExceptionReturnVoid(3, v0);
    }

    public final void zza(com.google.android.gms.auth.account.zza arg2, String arg3) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(v0, ((IInterface)arg2));
        v0.writeString(arg3);
        ((zza)this).transactAndReadExceptionReturnVoid(2, v0);
    }

    public final void zzb(boolean arg2) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.writeBoolean(v0, arg2);
        ((zza)this).transactAndReadExceptionReturnVoid(1, v0);
    }
}

