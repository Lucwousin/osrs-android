package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;

public final class zzjp extends zzjs {
    private final zzep zzarp;
    private final AlarmManager zzyh;
    private Integer zzyi;

    protected zzjp(zzjt arg3) {
        super(arg3);
        this.zzyh = ((zzhi)this).getContext().getSystemService("alarm");
        this.zzarp = new zzjq(this, arg3.zzlm(), arg3);
    }

    public final void cancel() {
        ((zzjs)this).zzch();
        this.zzyh.cancel(this.zzek());
        this.zzarp.cancel();
        if(Build$VERSION.SDK_INT >= 24) {
            this.zzkx();
        }
    }

    public final Context getContext() {
        return super.getContext();
    }

    private final int getJobId() {
        if(this.zzyi == null) {
            String v0 = "measurement";
            String v1 = String.valueOf(((zzhi)this).getContext().getPackageName());
            v0 = v1.length() != 0 ? v0.concat(v1) : new String(v0);
            this.zzyi = Integer.valueOf(v0.hashCode());
        }

        return this.zzyi.intValue();
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    private final PendingIntent zzek() {
        Intent v0 = new Intent().setClassName(((zzhi)this).getContext(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        v0.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(((zzhi)this).getContext(), 0, v0, 0);
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        this.zzyh.cancel(this.zzek());
        if(Build$VERSION.SDK_INT >= 24) {
            this.zzkx();
        }

        return 0;
    }

    public final void zzh(long arg10) {
        ((zzjs)this).zzch();
        ((zzhi)this).zzgl();
        if(!zzgd.zza(((zzhi)this).getContext())) {
            ((zzhi)this).zzgi().zzjb().log("Receiver not registered/enabled");
        }

        ((zzhi)this).zzgl();
        if(!zzkd.zza(((zzhi)this).getContext(), false)) {
            ((zzhi)this).zzgi().zzjb().log("Service not registered/enabled");
        }

        this.cancel();
        long v4 = ((zzhi)this).zzbt().elapsedRealtime() + arg10;
        if(arg10 < Math.max(0, zzez.zzajb.get().longValue()) && !this.zzarp.zzef()) {
            ((zzhi)this).zzgi().zzjc().log("Scheduling upload with DelayedRunnable");
            this.zzarp.zzh(arg10);
        }

        ((zzhi)this).zzgl();
        if(Build$VERSION.SDK_INT >= 24) {
            ((zzhi)this).zzgi().zzjc().log("Scheduling upload with JobScheduler");
            ComponentName v0 = new ComponentName(((zzhi)this).getContext(), "com.google.android.gms.measurement.AppMeasurementJobService");
            Object v1 = ((zzhi)this).getContext().getSystemService("jobscheduler");
            JobInfo$Builder v2 = new JobInfo$Builder(this.getJobId(), v0);
            v2.setMinimumLatency(arg10);
            v2.setOverrideDeadline(arg10 << 1);
            PersistableBundle v10 = new PersistableBundle();
            v10.putString("action", "com.google.android.gms.measurement.UPLOAD");
            v2.setExtras(v10);
            JobInfo v10_1 = v2.build();
            ((zzhi)this).zzgi().zzjc().zzg("Scheduling job. JobID", Integer.valueOf(this.getJobId()));
            ((JobScheduler)v1).schedule(v10_1);
            return;
        }

        ((zzhi)this).zzgi().zzjc().log("Scheduling upload with AlarmManager");
        this.zzyh.setInexactRepeating(2, v4, Math.max(zzez.zzaiw.get().longValue(), arg10), this.zzek());
    }

    public final zzjz zzjf() {
        return super.zzjf();
    }

    public final zzed zzjg() {
        return super.zzjg();
    }

    public final zzek zzjh() {
        return super.zzjh();
    }

    @TargetApi(value=24) private final void zzkx() {
        Object v0 = ((zzhi)this).getContext().getSystemService("jobscheduler");
        ((zzhi)this).zzgi().zzjc().zzg("Cancelling job. JobID", Integer.valueOf(this.getJobId()));
        ((JobScheduler)v0).cancel(this.getJobId());
    }
}

