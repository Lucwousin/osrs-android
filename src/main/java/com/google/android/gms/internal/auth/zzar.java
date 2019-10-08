package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzar implements ProxyApi {
    public zzar() {
        super();
    }

    public final PendingResult getSpatulaHeader(GoogleApiClient arg2) {
        Preconditions.checkNotNull(arg2);
        return arg2.execute(new zzau(this, arg2));
    }

    public final PendingResult performProxyRequest(GoogleApiClient arg2, ProxyRequest arg3) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg3);
        return arg2.execute(new zzas(this, arg2, arg3));
    }
}

