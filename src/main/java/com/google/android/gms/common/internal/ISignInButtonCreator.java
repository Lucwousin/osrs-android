package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface ISignInButtonCreator extends IInterface {
    IObjectWrapper newSignInButton(IObjectWrapper arg1, int arg2, int arg3) throws RemoteException;

    IObjectWrapper newSignInButtonFromConfig(IObjectWrapper arg1, SignInButtonConfig arg2) throws RemoteException;
}

