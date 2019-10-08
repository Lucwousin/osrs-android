package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

final class zae extends zah {
    zae(zad arg1, GoogleApiClient arg2) {
        super(arg2);
    }

    protected final void doExecute(AnyClient arg2) throws RemoteException {
        ((zai)arg2).getService().zaa(new zaf(((ResultHolder)this)));
    }
}

