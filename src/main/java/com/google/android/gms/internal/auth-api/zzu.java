package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public interface zzu extends IInterface {
    void zzc(Status arg1) throws RemoteException;

    void zzc(Status arg1, Credential arg2) throws RemoteException;

    void zzc(Status arg1, String arg2) throws RemoteException;
}

