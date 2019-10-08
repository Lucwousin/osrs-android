package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;

final class zag implements BaseOnConnectionFailedListener {
    zag(OnConnectionFailedListener arg1) {
        this.zaoj = arg1;
        super();
    }

    public final void onConnectionFailed(@NonNull ConnectionResult arg2) {
        this.zaoj.onConnectionFailed(arg2);
    }
}

