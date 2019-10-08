package com.google.android.gms.internal.measurement;

final class zzhs implements Runnable {
    zzhs(zzhm arg1, long arg2) {
        this.zzaps = arg1;
        this.zzapv = arg2;
        super();
    }

    public final void run() {
        zzhm v0 = this.zzaps;
        long v1 = this.zzapv;
        ((zzhi)v0).zzab();
        ((zzhi)v0).zzfv();
        ((zzdz)v0).zzch();
        ((zzhi)v0).zzgi().zzjb().log("Resetting analytics data (FE)");
        ((zzdy)v0).zzgd().zzkv();
        if(((zzhi)v0).zzgk().zzbd(((zzdy)v0).zzfz().zzah())) {
            ((zzhi)v0).zzgj().zzaly.set(v1);
        }

        boolean v1_1 = v0.zzacv.isEnabled();
        if(!((zzhi)v0).zzgk().zzho()) {
            ((zzhi)v0).zzgj().zzh((((int)v1_1)) ^ 1);
        }

        ((zzdy)v0).zzga().resetAnalyticsData();
        v0.zzapq = (((int)v1_1)) ^ 1;
    }
}

