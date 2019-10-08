package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class zaba implements ResultCallback {
    zaba(zaaw arg1, StatusPendingResult arg2, boolean arg3, GoogleApiClient arg4) {
        this.zahg = arg1;
        this.zahi = arg2;
        this.zahj = arg3;
        this.zahk = arg4;
        super();
    }

    public final void onResult(@NonNull Result arg2) {
        Storage.getInstance(zaaw.zac(this.zahg)).zaf();
        if((((Status)arg2).isSuccess()) && (this.zahg.isConnected())) {
            this.zahg.reconnect();
        }

        this.zahi.setResult(arg2);
        if(this.zahj) {
            this.zahk.disconnect();
        }
    }
}

