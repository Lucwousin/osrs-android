package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class zze implements Runnable {
    private final zzd zzx;
    private final Intent zzy;

    zze(zzd arg1, Intent arg2) {
        super();
        this.zzx = arg1;
        this.zzy = arg2;
    }

    public final void run() {
        zzd v0 = this.zzx;
        String v1 = this.zzy.getAction();
        StringBuilder v4 = new StringBuilder(String.valueOf(v1).length() + 61);
        v4.append("Service took too long to process intent: ");
        v4.append(v1);
        v4.append(" App may get closed.");
        Log.w("EnhancedIntentService", v4.toString());
        v0.finish();
    }
}

