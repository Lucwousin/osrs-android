package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk public final class AuthProxy {
    @KeepForSdk public static final Api API;
    @KeepForSdk public static final ProxyApi ProxyApi;
    private static final ClientKey zzah;
    private static final AbstractClientBuilder zzai;

    static {
        AuthProxy.zzah = new ClientKey();
        AuthProxy.zzai = new zza();
        AuthProxy.API = new Api("Auth.PROXY_API", AuthProxy.zzai, AuthProxy.zzah);
        AuthProxy.ProxyApi = new zzar();
    }

    public AuthProxy() {
        super();
    }
}

