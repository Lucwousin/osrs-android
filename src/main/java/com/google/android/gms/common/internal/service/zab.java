package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

final class zab extends AbstractClientBuilder {
    zab() {
        super();
    }

    public final Client buildClient(Context arg7, Looper arg8, ClientSettings arg9, Object arg10, ConnectionCallbacks arg11, OnConnectionFailedListener arg12) {
        return new zai(arg7, arg8, arg9, arg11, arg12);
    }
}

