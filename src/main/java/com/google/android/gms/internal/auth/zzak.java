package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzak extends GmsClient {
    private final Bundle zzbv;

    public zzak(Context arg8, Looper arg9, ClientSettings arg10, AuthProxyOptions arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        super(arg8, arg9, 16, arg10, arg12, arg13);
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

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if((v0 instanceof zzan)) {
            return v0;
        }

        return new zzao(arg3);
    }

    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zzbv;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        ClientSettings v0 = this.getClientSettings();
        if(!TextUtils.isEmpty(v0.getAccountName()) && !v0.getApplicableScopes(AuthProxy.API).isEmpty()) {
            return 1;
        }

        return 0;
    }
}

