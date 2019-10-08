package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface zzs extends IInterface {
    void zzc(GoogleSignInAccount arg1, Status arg2) throws RemoteException;

    void zze(Status arg1) throws RemoteException;

    void zzf(Status arg1) throws RemoteException;
}

