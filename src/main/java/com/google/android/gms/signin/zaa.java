package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

public final class zaa {
    public static final Api API;
    private static final ClientKey CLIENT_KEY;
    public static final AbstractClientBuilder zapg;
    private static final Scope zar;
    @ShowFirstParty private static final ClientKey zarp;
    private static final AbstractClientBuilder zarq;
    private static final Api zarr;
    private static final Scope zas;

    static {
        zaa.CLIENT_KEY = new ClientKey();
        zaa.zarp = new ClientKey();
        zaa.zapg = new zab();
        zaa.zarq = new zac();
        zaa.zar = new Scope("profile");
        zaa.zas = new Scope("email");
        zaa.API = new Api("SignIn.API", zaa.zapg, zaa.CLIENT_KEY);
        zaa.zarr = new Api("SignIn.INTERNAL_API", zaa.zarq, zaa.zarp);
    }
}

