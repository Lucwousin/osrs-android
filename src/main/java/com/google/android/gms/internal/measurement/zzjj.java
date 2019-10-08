package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzjj extends zzdz {
    private Handler handler;
    @VisibleForTesting private long zzarl;
    private final zzep zzarm;
    private final zzep zzarn;

    zzjj(zzgn arg3) {
        super(arg3);
        this.zzarm = new zzjk(this, this.zzacv);
        this.zzarn = new zzjl(this, this.zzacv);
        this.zzarl = ((zzhi)this).zzbt().elapsedRealtime();
    }

    public final Context getContext() {
        return super.getContext();
    }

    static void zza(zzjj arg0, long arg1) {
        arg0.zzak(arg1);
    }

    static void zza(zzjj arg0) {
        arg0.zzkw();
    }

    public final void zzab() {
        super.zzab();
    }

    @WorkerThread private final void zzak(long arg7) {
        long v0;
        zzep v7;
        ((zzhi)this).zzab();
        this.zzku();
        this.zzarm.cancel();
        this.zzarn.cancel();
        ((zzhi)this).zzgi().zzjc().zzg("Activity resumed, time", Long.valueOf(arg7));
        this.zzarl = arg7;
        long v2 = 0;
        if(((zzhi)this).zzbt().currentTimeMillis() - ((zzhi)this).zzgj().zzami.get() > ((zzhi)this).zzgj().zzamk.get()) {
            ((zzhi)this).zzgj().zzamj.set(true);
            ((zzhi)this).zzgj().zzaml.set(v2);
        }

        if(((zzhi)this).zzgj().zzamj.get()) {
            v7 = this.zzarm;
            v0 = ((zzhi)this).zzgj().zzamh.get();
        }
        else {
            v7 = this.zzarn;
            v0 = 3600000;
        }

        v7.zzh(Math.max(v2, v0 - ((zzhi)this).zzgj().zzaml.get()));
    }

    @WorkerThread private final void zzal(long arg6) {
        ((zzhi)this).zzab();
        this.zzku();
        this.zzarm.cancel();
        this.zzarn.cancel();
        ((zzhi)this).zzgi().zzjc().zzg("Activity paused, time", Long.valueOf(arg6));
        if(this.zzarl != 0) {
            ((zzhi)this).zzgj().zzaml.set(((zzhi)this).zzgj().zzaml.get() + (arg6 - this.zzarl));
        }
    }

    static void zzb(zzjj arg0, long arg1) {
        arg0.zzal(arg1);
    }

    public final Clock zzbt() {
        return super.zzbt();
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

    public final zzdu zzfx() {
        return super.zzfx();
    }

    public final zzhm zzfy() {
        return super.zzfy();
    }

    public final zzfd zzfz() {
        return super.zzfz();
    }

    public final zzik zzga() {
        return super.zzga();
    }

    public final zzih zzgb() {
        return super.zzgb();
    }

    public final zzfe zzgc() {
        return super.zzgc();
    }

    public final zzjj zzgd() {
        return super.zzgd();
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
        return 0;
    }

    private final void zzku() {
        __monitor_enter(this);
        try {
            if(this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }

            __monitor_exit(this);
            return;
        label_10:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_10;
        }

        throw v0;
    }

    final void zzkv() {
        this.zzarm.cancel();
        this.zzarn.cancel();
        this.zzarl = 0;
    }

    @WorkerThread private final void zzkw() {
        ((zzhi)this).zzab();
        this.zzl(false);
        ((zzdy)this).zzfx().zzp(((zzhi)this).zzbt().elapsedRealtime());
    }

    @WorkerThread public final boolean zzl(boolean arg9) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        long v0 = ((zzhi)this).zzbt().elapsedRealtime();
        ((zzhi)this).zzgj().zzamk.set(((zzhi)this).zzbt().currentTimeMillis());
        long v2 = v0 - this.zzarl;
        if(!arg9 && v2 < 1000) {
            ((zzhi)this).zzgi().zzjc().zzg("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(v2));
            return 0;
        }

        ((zzhi)this).zzgj().zzaml.set(v2);
        ((zzhi)this).zzgi().zzjc().zzg("Recording user engagement, ms", Long.valueOf(v2));
        Bundle v9 = new Bundle();
        v9.putLong("_et", v2);
        zzih.zza(((zzdy)this).zzgb().zzkn(), v9, true);
        ((zzdy)this).zzfy().logEvent("auto", "_e", v9);
        this.zzarl = v0;
        this.zzarn.cancel();
        this.zzarn.zzh(Math.max(0, 3600000 - ((zzhi)this).zzgj().zzaml.get()));
        return 1;
    }
}

