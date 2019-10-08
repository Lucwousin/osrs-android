package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zaj implements StatusListener {
    zaj(PendingResult arg1, TaskCompletionSource arg2, ResultConverter arg3, zaa arg4) {
        this.zaou = arg1;
        this.zaov = arg2;
        this.zaow = arg3;
        this.zaox = arg4;
        super();
    }

    public final void onComplete(Status arg4) {
        if(arg4.isSuccess()) {
            this.zaov.setResult(this.zaow.convert(this.zaou.await(0, TimeUnit.MILLISECONDS)));
            return;
        }

        this.zaov.setException(this.zaox.zaf(arg4));
    }
}

