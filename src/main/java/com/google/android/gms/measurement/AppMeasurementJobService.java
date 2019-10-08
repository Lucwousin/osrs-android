package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzji;

@TargetApi(value=24) public final class AppMeasurementJobService extends JobService implements zzji {
    private zzje zzadd;

    public AppMeasurementJobService() {
        super();
    }

    public final boolean callServiceStopSelfResult(int arg1) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters arg2) {
        return this.zzfq().onStartJob(arg2);
    }

    public final boolean onStopJob(JobParameters arg1) {
        return 0;
    }

    @MainThread public final boolean onUnbind(Intent arg2) {
        return this.zzfq().onUnbind(arg2);
    }

    @TargetApi(value=24) public final void zza(JobParameters arg1, boolean arg2) {
        this.jobFinished(arg1, false);
    }

    public final void zzb(Intent arg1) {
    }

    private final zzje zzfq() {
        if(this.zzadd == null) {
            this.zzadd = new zzje(((Context)this));
        }

        return this.zzadd;
    }
}

