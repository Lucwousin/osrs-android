package com.google.android.gms.internal.measurement;

final class zzeq implements Runnable {
    zzeq(zzep arg1, zzhk arg2) {
        this.zzahb = arg1;
        this.zzaha = arg2;
        super();
    }

    public final void run() {
        this.zzaha.zzgl();
        if(zzee.isMainThread()) {
            this.zzaha.zzgh().zzc(((Runnable)this));
            return;
        }

        boolean v0 = this.zzahb.zzef();
        zzep.zza(this.zzahb, 0);
        if(v0) {
            this.zzahb.run();
        }
    }
}

