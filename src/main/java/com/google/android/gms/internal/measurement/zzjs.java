package com.google.android.gms.internal.measurement;

abstract class zzjs extends zzjr {
    private boolean zzvn;

    zzjs(zzjt arg1) {
        super(arg1);
        this.zzalo.zzb(this);
    }

    final boolean isInitialized() {
        if(this.zzvn) {
            return 1;
        }

        return 0;
    }

    protected final void zzch() {
        if(this.isInitialized()) {
            return;
        }

        throw new IllegalStateException("Not initialized");
    }

    protected abstract boolean zzgn();

    public final void zzm() {
        if(!this.zzvn) {
            this.zzgn();
            this.zzalo.zzll();
            this.zzvn = true;
            return;
        }

        throw new IllegalStateException("Can\'t initialize twice");
    }
}

