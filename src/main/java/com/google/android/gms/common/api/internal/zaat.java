package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;

final class zaat implements ConnectionCallbacks, OnConnectionFailedListener {
    zaat(zaak arg1, zaal arg2) {
        this(arg1);
    }

    private zaat(zaak arg1) {
        this.zagi = arg1;
        super();
    }

    public final void onConnected(Bundle arg3) {
        zaak.zaf(this.zagi).zaa(new zaar(this.zagi));
    }

    public final void onConnectionFailed(@NonNull ConnectionResult arg2) {
        zaak.zac(this.zagi).lock();
        try {
            if(zaak.zab(this.zagi, arg2)) {
                zaak.zai(this.zagi);
                zaak.zaj(this.zagi);
            }
            else {
                zaak.zaa(this.zagi, arg2);
            }
        }
        catch(Throwable v2) {
            zaak.zac(this.zagi).unlock();
            throw v2;
        }

        zaak.zac(this.zagi).unlock();
    }

    public final void onConnectionSuspended(int arg1) {
    }
}

