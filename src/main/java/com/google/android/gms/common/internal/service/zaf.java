package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

final class zaf extends zaa {
    private final ResultHolder mResultHolder;

    public zaf(ResultHolder arg1) {
        super();
        this.mResultHolder = arg1;
    }

    public final void zaj(int arg3) throws RemoteException {
        this.mResultHolder.setResult(new Status(arg3));
    }
}

