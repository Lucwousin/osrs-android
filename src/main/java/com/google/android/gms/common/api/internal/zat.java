package com.google.android.gms.common.api.internal;

final class zat implements Runnable {
    zat(zas arg1) {
        this.zaep = arg1;
        super();
    }

    public final void run() {
        zas.zaa(this.zaep).lock();
        try {
            zas.zab(this.zaep);
        }
        catch(Throwable v0) {
            zas.zaa(this.zaep).unlock();
            throw v0;
        }

        zas.zaa(this.zaep).unlock();
    }
}

