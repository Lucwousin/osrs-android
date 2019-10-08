package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;

public final class zzdu extends zzdy {
    private final Map zzaeu;
    private final Map zzaev;
    private long zzaew;

    public zzdu(zzgn arg1) {
        super(arg1);
        this.zzaev = new ArrayMap();
        this.zzaeu = new ArrayMap();
    }

    public final void beginAdUnitExposure(String arg5) {
        if(arg5 != null) {
            if(arg5.length() == 0) {
            }
            else {
                ((zzhi)this).zzgh().zzc(new zzdv(this, arg5, ((zzhi)this).zzbt().elapsedRealtime()));
                return;
            }
        }

        ((zzhi)this).zzgi().zziv().log("Ad unit id must be a non-empty string");
    }

    public final void endAdUnitExposure(String arg5) {
        if(arg5 != null) {
            if(arg5.length() == 0) {
            }
            else {
                ((zzhi)this).zzgh().zzc(new zzdw(this, arg5, ((zzhi)this).zzbt().elapsedRealtime()));
                return;
            }
        }

        ((zzhi)this).zzgi().zziv().log("Ad unit id must be a non-empty string");
    }

    public final Context getContext() {
        return super.getContext();
    }

    static void zza(zzdu arg0, String arg1, long arg2) {
        arg0.zza(arg1, arg2);
    }

    static void zza(zzdu arg0, long arg1) {
        arg0.zzq(arg1);
    }

    @WorkerThread private final void zza(long arg3, zzig arg5) {
        if(arg5 == null) {
            ((zzhi)this).zzgi().zzjc().log("Not logging ad exposure. No active activity");
            return;
        }

        if(arg3 < 1000) {
            ((zzhi)this).zzgi().zzjc().zzg("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(arg3));
            return;
        }

        Bundle v0 = new Bundle();
        v0.putLong("_xt", arg3);
        zzih.zza(arg5, v0, true);
        ((zzdy)this).zzfy().logEvent("am", "_xa", v0);
    }

    @WorkerThread private final void zza(String arg4, long arg5) {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg4);
        if(this.zzaev.isEmpty()) {
            this.zzaew = arg5;
        }

        Object v0 = this.zzaev.get(arg4);
        if(v0 != null) {
            this.zzaev.put(arg4, Integer.valueOf(((Integer)v0).intValue() + 1));
            return;
        }

        if(this.zzaev.size() >= 100) {
            ((zzhi)this).zzgi().zziy().log("Too many ads visible");
            return;
        }

        this.zzaev.put(arg4, Integer.valueOf(1));
        this.zzaeu.put(arg4, Long.valueOf(arg5));
    }

    @WorkerThread private final void zza(String arg3, long arg4, zzig arg6) {
        if(arg6 == null) {
            ((zzhi)this).zzgi().zzjc().log("Not logging ad unit exposure. No active activity");
            return;
        }

        if(arg4 < 1000) {
            ((zzhi)this).zzgi().zzjc().zzg("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(arg4));
            return;
        }

        Bundle v0 = new Bundle();
        v0.putString("_ai", arg3);
        v0.putLong("_xt", arg4);
        zzih.zza(arg6, v0, true);
        ((zzdy)this).zzfy().logEvent("am", "_xu", v0);
    }

    public final void zzab() {
        super.zzab();
    }

    static void zzb(zzdu arg0, String arg1, long arg2) {
        arg0.zzb(arg1, arg2);
    }

    @WorkerThread private final void zzb(String arg7, long arg8) {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg7);
        Object v0 = this.zzaev.get(arg7);
        if(v0 != null) {
            zzig v1 = ((zzdy)this).zzgb().zzkn();
            int v0_1 = ((Integer)v0).intValue() - 1;
            if(v0_1 == 0) {
                this.zzaev.remove(arg7);
                v0 = this.zzaeu.get(arg7);
                if(v0 == null) {
                    ((zzhi)this).zzgi().zziv().log("First ad unit exposure time was never set");
                }
                else {
                    long v2 = arg8 - ((Long)v0).longValue();
                    this.zzaeu.remove(arg7);
                    this.zza(arg7, v2, v1);
                }

                if(this.zzaev.isEmpty()) {
                    long v4 = 0;
                    if(this.zzaew == v4) {
                        ((zzhi)this).zzgi().zziv().log("First ad exposure time was never set");
                        return;
                    }
                    else {
                        this.zza(arg8 - this.zzaew, v1);
                        this.zzaew = v4;
                    }
                }

                return;
            }

            this.zzaev.put(arg7, Integer.valueOf(v0_1));
            return;
        }

        ((zzhi)this).zzgi().zziv().zzg("Call to endAdUnitExposure for unknown ad unit id", arg7);
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

    @WorkerThread public final void zzp(long arg6) {
        zzig v0 = ((zzdy)this).zzgb().zzkn();
        Iterator v1 = this.zzaeu.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            this.zza(((String)v2), arg6 - this.zzaeu.get(v2).longValue(), v0);
        }

        if(!this.zzaeu.isEmpty()) {
            this.zza(arg6 - this.zzaew, v0);
        }

        this.zzq(arg6);
    }

    @WorkerThread private final void zzq(long arg5) {
        Iterator v0 = this.zzaeu.keySet().iterator();
        while(v0.hasNext()) {
            this.zzaeu.put(v0.next(), Long.valueOf(arg5));
        }

        if(!this.zzaeu.isEmpty()) {
            this.zzaew = arg5;
        }
    }
}

