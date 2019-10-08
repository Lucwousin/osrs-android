package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver$PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

final class zzgf implements Runnable {
    zzgf(zzgd arg1, zzgn arg2, long arg3, Bundle arg5, Context arg6, zzfi arg7, BroadcastReceiver$PendingResult arg8) {
        this.zzana = arg2;
        this.zzanc = arg3;
        this.zzand = arg5;
        this.val$context = arg6;
        this.zzanb = arg7;
        this.zzqu = arg8;
        super();
    }

    public final void run() {
        long v0 = this.zzana.zzgj().zzaly.get();
        long v2 = this.zzanc;
        long v4 = 0;
        if(v0 > v4 && (v2 >= v0 || v2 <= v4)) {
            v2 = v0 - 1;
        }

        if(v2 > v4) {
            this.zzand.putLong("click_timestamp", v2);
        }

        this.zzand.putString("_cis", "referrer broadcast");
        AppMeasurement.getInstance(this.val$context).logEventInternal("auto", "_cmp", this.zzand);
        this.zzanb.zzjc().log("Install campaign recorded");
        if(this.zzqu != null) {
            this.zzqu.finish();
        }
    }
}

