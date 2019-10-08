package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq implements ConnectionCallbacks, OnConnectionFailedListener {
    public final Api mApi;
    private final boolean zaeb;
    private zar zaec;

    public zaq(Api arg1, boolean arg2) {
        super();
        this.mApi = arg1;
        this.zaeb = arg2;
    }

    public final void onConnected(@Nullable Bundle arg2) {
        this.zav();
        this.zaec.onConnected(arg2);
    }

    public final void onConnectionFailed(@NonNull ConnectionResult arg4) {
        this.zav();
        this.zaec.zaa(arg4, this.mApi, this.zaeb);
    }

    public final void onConnectionSuspended(int arg2) {
        this.zav();
        this.zaec.onConnectionSuspended(arg2);
    }

    public final void zaa(zar arg1) {
        this.zaec = arg1;
    }

    private final void zav() {
        Preconditions.checkNotNull(this.zaec, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}

