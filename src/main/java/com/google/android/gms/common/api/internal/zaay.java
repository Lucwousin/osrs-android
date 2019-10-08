package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import java.util.concurrent.atomic.AtomicReference;

final class zaay implements ConnectionCallbacks {
    zaay(zaaw arg1, AtomicReference arg2, StatusPendingResult arg3) {
        this.zahg = arg1;
        this.zahh = arg2;
        this.zahi = arg3;
        super();
    }

    public final void onConnected(Bundle arg4) {
        zaaw.zaa(this.zahg, this.zahh.get(), this.zahi, true);
    }

    public final void onConnectionSuspended(int arg1) {
    }
}

