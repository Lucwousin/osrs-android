package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public final class zzg extends zza implements zze {
    zzg(IBinder arg2) {
        super(arg2, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle zza(Account arg2) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        zzc.zza(v0, ((Parcelable)arg2));
        Parcel v2 = ((zza)this).transactAndReadException(7, v0);
        Parcelable v0_1 = zzc.zza(v2, Bundle.CREATOR);
        v2.recycle();
        return ((Bundle)v0_1);
    }

    public final Bundle zza(Account arg2, String arg3, Bundle arg4) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        zzc.zza(v0, ((Parcelable)arg2));
        v0.writeString(arg3);
        zzc.zza(v0, ((Parcelable)arg4));
        Parcel v2 = ((zza)this).transactAndReadException(5, v0);
        Parcelable v3 = zzc.zza(v2, Bundle.CREATOR);
        v2.recycle();
        return ((Bundle)v3);
    }

    public final Bundle zza(String arg2) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        Parcel v2 = ((zza)this).transactAndReadException(8, v0);
        Parcelable v0_1 = zzc.zza(v2, Bundle.CREATOR);
        v2.recycle();
        return ((Bundle)v0_1);
    }

    public final Bundle zza(String arg2, Bundle arg3) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        zzc.zza(v0, ((Parcelable)arg3));
        Parcel v2 = ((zza)this).transactAndReadException(2, v0);
        Parcelable v3 = zzc.zza(v2, Bundle.CREATOR);
        v2.recycle();
        return ((Bundle)v3);
    }

    public final AccountChangeEventsResponse zza(AccountChangeEventsRequest arg2) throws RemoteException {
        Parcel v0 = ((zza)this).obtainAndWriteInterfaceToken();
        zzc.zza(v0, ((Parcelable)arg2));
        Parcel v2 = ((zza)this).transactAndReadException(3, v0);
        Parcelable v0_1 = zzc.zza(v2, AccountChangeEventsResponse.CREATOR);
        v2.recycle();
        return ((AccountChangeEventsResponse)v0_1);
    }
}

