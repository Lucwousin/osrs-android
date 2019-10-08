package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting final class zzaz extends BroadcastReceiver {
    @Nullable private zzay zzdp;

    public zzaz(zzay arg1) {
        super();
        this.zzdp = arg1;
    }

    public final void onReceive(Context arg3, Intent arg4) {
        if(this.zzdp == null) {
            return;
        }

        if(!this.zzdp.zzan()) {
            return;
        }

        if(FirebaseInstanceId.zzm()) {
            Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
        }

        FirebaseInstanceId.zza(this.zzdp, 0);
        this.zzdp.getContext().unregisterReceiver(((BroadcastReceiver)this));
        this.zzdp = null;
    }

    public final void zzao() {
        if(FirebaseInstanceId.zzm()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }

        this.zzdp.getContext().registerReceiver(((BroadcastReceiver)this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}

