package com.google.android.gms.internal.auth-api-phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzm extends TaskApiCall {
    private TaskCompletionSource zzf;

    private zzm() {
        super();
    }

    zzm(zzk arg1) {
        this();
    }

    protected void doExecute(AnyClient arg1, TaskCompletionSource arg2) throws RemoteException {
        this.zzf = arg2;
        this.zza(((zzi)arg1).getService());
    }

    protected abstract void zza(zze arg1) throws RemoteException;

    protected final void zzb(Status arg2) {
        TaskUtil.setResultOrApiException(arg2, this.zzf);
    }
}

