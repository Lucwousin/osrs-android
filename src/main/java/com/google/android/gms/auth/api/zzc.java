package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth-api.zzr;

final class zzc extends AbstractClientBuilder {
    zzc() {
        super();
    }

    public final Client buildClient(Context arg8, Looper arg9, ClientSettings arg10, Object arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        return new zzr(arg8, arg9, arg10, arg11, arg12, arg13);
    }
}

