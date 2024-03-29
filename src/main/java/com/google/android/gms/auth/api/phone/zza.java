package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth-api-phone.zzi;

final class zza extends AbstractClientBuilder {
    zza() {
        super();
    }

    public final Client buildClient(Context arg7, Looper arg8, ClientSettings arg9, Object arg10, ConnectionCallbacks arg11, OnConnectionFailedListener arg12) {
        return new zzi(arg7, arg8, arg9, arg11, arg12);
    }
}

