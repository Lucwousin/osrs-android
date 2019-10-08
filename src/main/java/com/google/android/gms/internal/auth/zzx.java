package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public interface zzx extends IInterface {
    void onFailure(Status arg1) throws RemoteException;

    void zza(DeviceMetaData arg1) throws RemoteException;

    void zza(Status arg1, zzl arg2) throws RemoteException;

    void zza(Status arg1, zzt arg2) throws RemoteException;

    void zza(byte[] arg1) throws RemoteException;

    void zzb(Status arg1) throws RemoteException;

    void zzd() throws RemoteException;
}

