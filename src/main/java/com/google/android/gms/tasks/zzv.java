package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class zzv implements Runnable {
    zzv(zzu arg1, Callable arg2) {
        this.zzad = arg1;
        this.val$callable = arg2;
        super();
    }

    public final void run() {
        try {
            this.zzad.setResult(this.val$callable.call());
            return;
        }
        catch(Exception v0) {
            this.zzad.setException(v0);
            return;
        }
    }
}

