package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public interface RemoteCall {
    @KeepForSdk void accept(Object arg1, Object arg2) throws RemoteException;
}

