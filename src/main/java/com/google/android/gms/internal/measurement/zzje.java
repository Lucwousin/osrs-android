package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzje {
    private final Context zzabl;

    public zzje(Context arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        this.zzabl = arg1;
    }

    @MainThread public final IBinder onBind(Intent arg4) {
        IBinder v0 = null;
        if(arg4 == null) {
            this.zzgi().zziv().log("onBind called with null intent");
            return v0;
        }

        String v4 = arg4.getAction();
        if("com.google.android.gms.measurement.START".equals(v4)) {
            return new zzgp(zzjt.zzg(this.zzabl));
        }

        this.zzgi().zziy().zzg("onBind received unknown action", v4);
        return v0;
    }

    @MainThread public final void onCreate() {
        zzgn v0 = zzgn.zza(this.zzabl, null, null);
        zzfi v1 = v0.zzgi();
        v0.zzgl();
        v1.zzjc().log("Local AppMeasurementService is starting up");
    }

    @MainThread public final void onDestroy() {
        zzgn v0 = zzgn.zza(this.zzabl, null, null);
        zzfi v1 = v0.zzgi();
        v0.zzgl();
        v1.zzjc().log("Local AppMeasurementService is shutting down");
    }

    @MainThread public final void onRebind(Intent arg3) {
        if(arg3 == null) {
            this.zzgi().zziv().log("onRebind called with null intent");
            return;
        }

        this.zzgi().zzjc().zzg("onRebind called. action", arg3.getAction());
    }

    @MainThread public final int onStartCommand(Intent arg6, int arg7, int arg8) {
        zzgn v7 = zzgn.zza(this.zzabl, null, null);
        zzfi v0 = v7.zzgi();
        int v1 = 2;
        if(arg6 == null) {
            v0.zziy().log("AppMeasurementService started with null intent");
            return v1;
        }

        String v2 = arg6.getAction();
        v7.zzgl();
        v0.zzjc().zze("Local AppMeasurementService called. startId, action", Integer.valueOf(arg8), v2);
        if("com.google.android.gms.measurement.UPLOAD".equals(v2)) {
            this.zzb(new zzjf(this, arg8, v0, arg6));
        }

        return v1;
    }

    @TargetApi(value=24) @MainThread public final boolean onStartJob(JobParameters arg5) {
        zzgn v0 = zzgn.zza(this.zzabl, null, null);
        zzfi v1 = v0.zzgi();
        String v2 = arg5.getExtras().getString("action");
        v0.zzgl();
        v1.zzjc().zzg("Local AppMeasurementJobService called. action", v2);
        if("com.google.android.gms.measurement.UPLOAD".equals(v2)) {
            this.zzb(new zzjg(this, v1, arg5));
        }

        return 1;
    }

    @MainThread public final boolean onUnbind(Intent arg4) {
        if(arg4 == null) {
            this.zzgi().zziv().log("onUnbind called with null intent");
            return 1;
        }

        this.zzgi().zzjc().zzg("onUnbind called for intent. action", arg4.getAction());
        return 1;
    }

    final void zza(int arg2, zzfi arg3, Intent arg4) {
        if(this.zzabl.callServiceStopSelfResult(arg2)) {
            arg3.zzjc().zzg("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(arg2));
            this.zzgi().zzjc().log("Completed wakeful intent.");
            this.zzabl.zzb(arg4);
        }
    }

    final void zza(zzfi arg2, JobParameters arg3) {
        arg2.zzjc().log("AppMeasurementJobService processed last upload request.");
        this.zzabl.zza(arg3, false);
    }

    private final void zzb(Runnable arg4) {
        zzjt v0 = zzjt.zzg(this.zzabl);
        v0.zzgh().zzc(new zzjh(this, v0, arg4));
    }

    private final zzfi zzgi() {
        return zzgn.zza(this.zzabl, null, null).zzgi();
    }
}

