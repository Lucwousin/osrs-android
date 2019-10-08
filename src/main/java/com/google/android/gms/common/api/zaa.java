package com.google.android.gms.common.api;

final class zaa implements StatusListener {
    zaa(Batch arg1) {
        this.zabd = arg1;
        super();
    }

    public final void onComplete(Status arg5) {
        Object v0 = Batch.zaa(this.zabd);
        __monitor_enter(v0);
        try {
            if(this.zabd.isCanceled()) {
                __monitor_exit(v0);
                return;
            }

            if(arg5.isCanceled()) {
                Batch.zaa(this.zabd, true);
            }
            else if(!arg5.isSuccess()) {
                Batch.zab(this.zabd, true);
            }

            Batch.zab(this.zabd);
            if(Batch.zac(this.zabd) == 0) {
                if(Batch.zad(this.zabd)) {
                    Batch.zae(this.zabd);
                }
                else {
                    arg5 = Batch.zaf(this.zabd) ? new Status(13) : Status.RESULT_SUCCESS;
                    this.zabd.setResult(new BatchResult(arg5, Batch.zag(this.zabd)));
                }
            }

            __monitor_exit(v0);
            return;
        label_46:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_46;
        }

        throw v5;
    }
}

