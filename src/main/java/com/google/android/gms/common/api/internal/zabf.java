package com.google.android.gms.common.api.internal;

abstract class zabf {
    private final zabd zaht;

    protected zabf(zabd arg1) {
        super();
        this.zaht = arg1;
    }

    protected abstract void zaan();

    public final void zac(zabe arg3) {
        zabe.zaa(arg3).lock();
        try {
            if(zabe.zab(arg3) == this.zaht) {
                goto label_8;
            }
        }
        catch(Throwable v0) {
            goto label_14;
        }

        zabe.zaa(arg3).unlock();
        return;
        try {
        label_8:
            this.zaan();
        }
        catch(Throwable v0) {
        label_14:
            zabe.zaa(arg3).unlock();
            throw v0;
        }

        zabe.zaa(arg3).unlock();
    }
}

