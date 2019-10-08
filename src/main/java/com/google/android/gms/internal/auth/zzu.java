package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzu extends GmsClient {
    private final Bundle zzbv;

    public zzu(Context arg8, Looper arg9, ClientSettings arg10, zzn arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        super(arg8, arg9, 0x80, arg10, arg12, arg13);
        if(arg11 == null) {
            this.zzbv = new Bundle();
            return;
        }

        throw new NoSuchMethodError();
    }

    protected final IInterface createServiceInterface(IBinder arg3) {
        if(arg3 == null) {
            return null;
        }

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if((v0 instanceof zzz)) {
            return v0;
        }

        return new zzaa(arg3);
    }

    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zzbv;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }
}

