package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk public class PendingResultUtil {
    @KeepForSdk public interface ResultConverter {
        @KeepForSdk Object convert(Result arg1);
    }

    public interface zaa {
        ApiException zaf(Status arg1);
    }

    private static final zaa zaot;

    static {
        PendingResultUtil.zaot = new zai();
    }

    public PendingResultUtil() {
        super();
    }

    @KeepForSdk public static Task toResponseTask(PendingResult arg1, Response arg2) {
        return PendingResultUtil.toTask(arg1, new zak(arg2));
    }

    @KeepForSdk public static Task toTask(PendingResult arg3, ResultConverter arg4) {
        zaa v0 = PendingResultUtil.zaot;
        TaskCompletionSource v1 = new TaskCompletionSource();
        arg3.addStatusListener(new zaj(arg3, v1, arg4, v0));
        return v1.getTask();
    }

    @KeepForSdk public static Task toVoidTask(PendingResult arg1) {
        return PendingResultUtil.toTask(arg1, new zal());
    }
}

