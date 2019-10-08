package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;

final class zaf implements BaseConnectionCallbacks {
    zaf(ConnectionCallbacks arg1) {
        this.zaoi = arg1;
        super();
    }

    public final void onConnected(@Nullable Bundle arg2) {
        this.zaoi.onConnected(arg2);
    }

    public final void onConnectionSuspended(int arg2) {
        this.zaoi.onConnectionSuspended(arg2);
    }
}

