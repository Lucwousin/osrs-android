package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zad extends IInterface {
    void zaa(ConnectionResult arg1, zaa arg2) throws RemoteException;

    void zaa(Status arg1, GoogleSignInAccount arg2) throws RemoteException;

    void zab(zaj arg1) throws RemoteException;

    void zag(Status arg1) throws RemoteException;

    void zah(Status arg1) throws RemoteException;
}

