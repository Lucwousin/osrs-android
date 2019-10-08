package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

abstract class zaau implements Runnable {
    private zaau(zaak arg1) {
        this.zagi = arg1;
        super();
    }

    zaau(zaak arg1, zaal arg2) {
        this(arg1);
    }

    @WorkerThread public void run() {
        zaak.zac(this.zagi).lock();
        try {
            if(!Thread.interrupted()) {
                goto label_9;
            }
        }
        catch(RuntimeException v0) {
            goto label_17;
        }
        catch(Throwable v0_1) {
            goto label_24;
        }

        zaak.zac(this.zagi).unlock();
        return;
        try {
        label_9:
            this.zaan();
        }
        catch(Throwable v0_1) {
        label_24:
            zaak.zac(this.zagi).unlock();
            throw v0_1;
        }
        catch(RuntimeException v0) {
            try {
            label_17:
                zaak.zad(this.zagi).zab(v0);
            }
            catch(Throwable v0_1) {
                goto label_24;
            }

            zaak.zac(this.zagi).unlock();
            return;
        }

        zaak.zac(this.zagi).unlock();
    }

    @WorkerThread protected abstract void zaan();
}

