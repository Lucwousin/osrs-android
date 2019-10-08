package com.google.android.gms.measurement;

import android.content.BroadcastReceiver$PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgg;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzgg {
    private zzgd zzadc;

    public AppMeasurementReceiver() {
        super();
    }

    public final BroadcastReceiver$PendingResult doGoAsync() {
        return this.goAsync();
    }

    @MainThread public final void doStartService(Context arg1, Intent arg2) {
        AppMeasurementReceiver.startWakefulService(arg1, arg2);
    }

    @MainThread public final void onReceive(Context arg2, Intent arg3) {
        if(this.zzadc == null) {
            this.zzadc = new zzgd(((zzgg)this));
        }

        this.zzadc.onReceive(arg2, arg3);
    }
}

