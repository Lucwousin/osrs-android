package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzji;

public final class AppMeasurementService extends Service implements zzji {
    private zzje zzadd;

    public AppMeasurementService() {
        super();
    }

    public final boolean callServiceStopSelfResult(int arg1) {
        return this.stopSelfResult(arg1);
    }

    @MainThread public final IBinder onBind(Intent arg2) {
        return this.zzfq().onBind(arg2);
    }

    @MainThread public final void onCreate() {
        super.onCreate();
        this.zzfq().onCreate();
    }

    @MainThread public final void onDestroy() {
        this.zzfq().onDestroy();
        super.onDestroy();
    }

    @MainThread public final void onRebind(Intent arg2) {
        this.zzfq().onRebind(arg2);
    }

    @MainThread public final int onStartCommand(Intent arg2, int arg3, int arg4) {
        return this.zzfq().onStartCommand(arg2, arg3, arg4);
    }

    @MainThread public final boolean onUnbind(Intent arg2) {
        return this.zzfq().onUnbind(arg2);
    }

    public final void zza(JobParameters arg1, boolean arg2) {
        throw new UnsupportedOperationException();
    }

    public final void zzb(Intent arg1) {
        AppMeasurementReceiver.completeWakefulIntent(arg1);
    }

    private final zzje zzfq() {
        if(this.zzadd == null) {
            this.zzadd = new zzje(((Context)this));
        }

        return this.zzadd;
    }
}

