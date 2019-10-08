package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Iterator;

public final class zaav implements zabd {
    private final zabe zafs;

    public zaav(zabe arg1) {
        super();
        this.zafs = arg1;
    }

    public final void begin() {
        Iterator v0 = this.zafs.zagy.values().iterator();
        while(v0.hasNext()) {
            v0.next().disconnect();
        }

        this.zafs.zaed.zagz = Collections.emptySet();
    }

    public final void connect() {
        this.zafs.zaaz();
    }

    public final boolean disconnect() {
        return 1;
    }

    public final ApiMethodImpl enqueue(ApiMethodImpl arg2) {
        this.zafs.zaed.zafb.add(arg2);
        return arg2;
    }

    public final ApiMethodImpl execute(ApiMethodImpl arg2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void onConnected(Bundle arg1) {
    }

    public final void onConnectionSuspended(int arg1) {
    }

    public final void zaa(ConnectionResult arg1, Api arg2, boolean arg3) {
    }
}

