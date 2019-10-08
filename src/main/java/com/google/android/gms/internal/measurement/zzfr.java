package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

class zzfr extends BroadcastReceiver {
    @VisibleForTesting private static final String zzaav = "com.google.android.gms.internal.measurement.zzfr";
    private boolean zzaaw;
    private boolean zzaax;
    private final zzjt zzalo;

    static {
    }

    zzfr(zzjt arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        this.zzalo = arg1;
    }

    @MainThread public void onReceive(Context arg2, Intent arg3) {
        this.zzalo.zzlc();
        String v2 = arg3.getAction();
        this.zzalo.zzgi().zzjc().zzg("NetworkBroadcastReceiver received action", v2);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(v2)) {
            boolean v2_1 = this.zzalo.zzkz().zzex();
            if(this.zzaax != v2_1) {
                this.zzaax = v2_1;
                this.zzalo.zzgh().zzc(new zzfs(this, v2_1));
            }

            return;
        }

        this.zzalo.zzgi().zziy().zzg("NetworkBroadcastReceiver received unknown action", v2);
    }

    @WorkerThread public final void unregister() {
        this.zzalo.zzlc();
        this.zzalo.zzgh().zzab();
        this.zzalo.zzgh().zzab();
        if(!this.zzaaw) {
            return;
        }

        this.zzalo.zzgi().zzjc().log("Unregistering connectivity change receiver");
        this.zzaaw = false;
        this.zzaax = false;
        Context v0 = this.zzalo.getContext();
        try {
            v0.unregisterReceiver(((BroadcastReceiver)this));
            return;
        }
        catch(IllegalArgumentException v0_1) {
            this.zzalo.zzgi().zziv().zzg("Failed to unregister the network broadcast receiver", v0_1);
            return;
        }
    }

    static zzjt zza(zzfr arg0) {
        return arg0.zzalo;
    }

    @WorkerThread public final void zzeu() {
        this.zzalo.zzlc();
        this.zzalo.zzgh().zzab();
        if(this.zzaaw) {
            return;
        }

        this.zzalo.getContext().registerReceiver(((BroadcastReceiver)this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzaax = this.zzalo.zzkz().zzex();
        this.zzalo.zzgi().zzjc().zzg("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzaax));
        this.zzaaw = true;
    }
}

