package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzr extends GmsClient {
    @Nullable private final AuthCredentialsOptions zzaq;

    public zzr(Context arg8, Looper arg9, ClientSettings arg10, AuthCredentialsOptions arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        super(arg8, arg9, 68, arg10, arg12, arg13);
        this.zzaq = arg11;
    }

    protected final IInterface createServiceInterface(IBinder arg3) {
        if(arg3 == null) {
            return null;
        }

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if((v0 instanceof zzw)) {
            return v0;
        }

        return new zzx(arg3);
    }

    protected final Bundle getGetServiceRequestExtraArgs() {
        if(this.zzaq == null) {
            return new Bundle();
        }

        return this.zzaq.toBundle();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    final AuthCredentialsOptions zzd() {
        return this.zzaq;
    }
}

