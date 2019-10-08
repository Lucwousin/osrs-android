package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;

final class zaaz implements OnConnectionFailedListener {
    zaaz(zaaw arg1, StatusPendingResult arg2) {
        this.zahi = arg2;
        super();
    }

    public final void onConnectionFailed(@NonNull ConnectionResult arg3) {
        this.zahi.setResult(new Status(8));
    }
}

