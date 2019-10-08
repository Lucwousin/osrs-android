package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk public static final Api API;
    @KeepForSdk public static final ClientKey CLIENT_KEY;
    private static final AbstractClientBuilder zapg;
    public static final zac zaph;

    static {
        Common.CLIENT_KEY = new ClientKey();
        Common.zapg = new zab();
        Common.API = new Api("Common.API", Common.zapg, Common.CLIENT_KEY);
        Common.zaph = new zad();
    }

    public Common() {
        super();
    }
}

