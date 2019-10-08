package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public final class zad implements zac {
    public zad() {
        super();
    }

    public final PendingResult zaa(GoogleApiClient arg2) {
        return arg2.execute(new zae(this, arg2));
    }
}

