package com.google.android.gms.common.api.internal;

import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

final class zan implements Runnable {
    private final zam zadi;

    zan(zal arg1, zam arg2) {
        this.zadj = arg1;
        super();
        this.zadi = arg2;
    }

    @MainThread public final void run() {
        if(!this.zadj.mStarted) {
            return;
        }

        ConnectionResult v0 = this.zadi.getConnectionResult();
        if(v0.hasResolution()) {
            this.zadj.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zadj.getActivity(), v0.getResolution(), this.zadi.zar(), false), 1);
            return;
        }

        if(this.zadj.zacc.isUserResolvableError(v0.getErrorCode())) {
            this.zadj.zacc.zaa(this.zadj.getActivity(), this.zadj.mLifecycleFragment, v0.getErrorCode(), 2, this.zadj);
            return;
        }

        if(v0.getErrorCode() == 18) {
            this.zadj.zacc.zaa(this.zadj.getActivity().getApplicationContext(), new zao(this, GoogleApiAvailability.zaa(this.zadj.getActivity(), this.zadj)));
            return;
        }

        this.zadj.zaa(v0, this.zadi.zar());
    }
}

