package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager$WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

final class zzay implements Runnable {
    private final zzba zzav;
    private final long zzdm;
    private final PowerManager$WakeLock zzdn;
    private final FirebaseInstanceId zzdo;

    @VisibleForTesting zzay(FirebaseInstanceId arg1, zzan arg2, zzba arg3, long arg4) {
        super();
        this.zzdo = arg1;
        this.zzav = arg3;
        this.zzdm = arg4;
        this.zzdn = this.getContext().getSystemService("power").newWakeLock(1, "fiid-sync");
        this.zzdn.setReferenceCounted(false);
    }

    final Context getContext() {
        return this.zzdo.zzi().getApplicationContext();
    }

    @SuppressLint(value={"Wakelock"}) public final void run() {
        try {
            if(zzav.zzai().zzd(this.getContext())) {
                this.zzdn.acquire();
            }

            this.zzdo.zza(true);
            if(this.zzdo.zzo()) {
                goto label_22;
            }

            this.zzdo.zza(false);
        }
        catch(Throwable v0) {
            goto label_62;
        }

        if(zzav.zzai().zzd(this.getContext())) {
            this.zzdn.release();
        }

        return;
        try {
        label_22:
            if((zzav.zzai().zze(this.getContext())) && !this.zzan()) {
                new zzaz(this).zzao();
                goto label_31;
            }

            goto label_38;
        }
        catch(Throwable v0) {
            goto label_62;
        }

    label_31:
        if(zzav.zzai().zzd(this.getContext())) {
            this.zzdn.release();
        }

        return;
        try {
        label_38:
            if(!this.zzam() || !this.zzav.zzc(this.zzdo)) {
                this.zzdo.zza(this.zzdm);
            }
            else {
                this.zzdo.zza(false);
            }
        }
        catch(Throwable v0) {
        label_62:
            if(zzav.zzai().zzd(this.getContext())) {
                this.zzdn.release();
            }

            throw v0;
        }

        if(zzav.zzai().zzd(this.getContext())) {
            this.zzdn.release();
            return;
        }
    }

    @VisibleForTesting private final boolean zzam() {
        String v3;
        zzax v0 = this.zzdo.zzk();
        if(!this.zzdo.zzr() && !this.zzdo.zza(v0)) {
            return 1;
        }

        try {
            v3 = this.zzdo.zzl();
            if(v3 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return 0;
            }

            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }

            if(v0 == null || v0 != null && !v3.equals(v0.zzbu)) {
                Context v0_2 = this.getContext();
                Intent v4 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                v4.putExtra("token", v3);
                zzav.zzc(v0_2, v4);
                zzav.zzb(v0_2, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
        }
        catch(SecurityException v0_1) {
            String v2 = "FirebaseInstanceId";
            v3 = "Token retrieval failed: ";
            String v0_3 = String.valueOf(((Exception)v0_1).getMessage());
            v0_3 = v0_3.length() != 0 ? v3.concat(v0_3) : new String(v3);
            Log.e(v2, v0_3);
            return 0;
        }

        return 1;
    }

    final boolean zzan() {
        Object v0 = this.getContext().getSystemService("connectivity");
        NetworkInfo v0_1 = v0 != null ? ((ConnectivityManager)v0).getActiveNetworkInfo() : null;
        if(v0_1 != null && (v0_1.isConnected())) {
            return 1;
        }

        return 0;
    }
}

