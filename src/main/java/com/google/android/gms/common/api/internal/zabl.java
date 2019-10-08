package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class zabl implements Runnable {
    zabl(zaa arg1, ConnectionResult arg2) {
        this.zaix = arg1;
        this.zaiy = arg2;
        super();
    }

    public final void run() {
        this.zaix.onConnectionFailed(this.zaiy);
    }
}

