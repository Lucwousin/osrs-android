package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk public abstract class RegisterListenerMethod {
    private final ListenerHolder zajt;
    private final Feature[] zaju;
    private final boolean zajv;

    @KeepForSdk protected RegisterListenerMethod(ListenerHolder arg1) {
        super();
        this.zajt = arg1;
        this.zaju = null;
        this.zajv = false;
    }

    @KeepForSdk protected RegisterListenerMethod(ListenerHolder arg1, Feature[] arg2, boolean arg3) {
        super();
        this.zajt = arg1;
        this.zaju = arg2;
        this.zajv = arg3;
    }

    @KeepForSdk public void clearListener() {
        this.zajt.clear();
    }

    @KeepForSdk public ListenerKey getListenerKey() {
        return this.zajt.getListenerKey();
    }

    @Nullable @KeepForSdk public Feature[] getRequiredFeatures() {
        return this.zaju;
    }

    @KeepForSdk protected abstract void registerListener(AnyClient arg1, TaskCompletionSource arg2) throws RemoteException;

    public final boolean shouldAutoResolveMissingFeatures() {
        return this.zajv;
    }
}

