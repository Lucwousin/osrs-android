package com.google.android.gms.internal.measurement;

abstract class zzhj extends zzhi {
    private boolean zzvn;

    zzhj(zzgn arg1) {
        super(arg1);
        this.zzacv.zzb(this);
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

    public final void zzgm() {
        if(!this.zzvn) {
            this.zzgo();
            this.zzacv.zzkf();
            this.zzvn = true;
            return;
        }

        throw new IllegalStateException("Can\'t initialize twice");
    }

    protected abstract boolean zzgn();

    protected void zzgo() {
    }

    public final void zzm() {
        if(!this.zzvn) {
            if(!this.zzgn()) {
                this.zzacv.zzkf();
                this.zzvn = true;
            }

            return;
        }

        throw new IllegalStateException("Can\'t initialize twice");
    }
}

