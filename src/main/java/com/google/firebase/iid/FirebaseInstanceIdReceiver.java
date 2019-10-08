package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    private static boolean zzbj = false;
    @GuardedBy(value="FirebaseInstanceIdReceiver.class") private static zzh zzbk;
    @GuardedBy(value="FirebaseInstanceIdReceiver.class") private static zzh zzbl;

    static {
    }

    public FirebaseInstanceIdReceiver() {
        super();
    }

    public final void onReceive(Context arg3, Intent arg4) {
        if(arg4 == null) {
            return;
        }

        Parcelable v0 = arg4.getParcelableExtra("wrapped_intent");
        if((v0 instanceof Intent)) {
        }
        else {
            v0 = null;
        }

        if(v0 != null) {
            this.zza(arg3, ((Intent)v0), arg4.getAction());
            return;
        }

        this.zza(arg3, arg4, arg4.getAction());
    }

    @SuppressLint(value={"InlinedApi"}) @ShowFirstParty public static int zza(BroadcastReceiver arg5, Context arg6, String arg7, Intent arg8) {
        int v1 = 1;
        int v0 = !PlatformVersion.isAtLeastO() || arg6.getApplicationInfo().targetSdkVersion < 26 ? 0 : 1;
        if((arg8.getFlags() & 0x10000000) != 0) {
        }
        else {
            v1 = 0;
        }

        if(v0 != 0 && v1 == 0) {
            return FirebaseInstanceIdReceiver.zzb(arg5, arg6, arg7, arg8);
        }

        v0 = zzav.zzai().zzb(arg6, arg7, arg8);
        if((PlatformVersion.isAtLeastO()) && v0 == 402) {
            FirebaseInstanceIdReceiver.zzb(arg5, arg6, arg7, arg8);
            return 403;
        }

        return v0;
    }

    private static zzh zza(Context arg2, String arg3) {
        zzh v2_1;
        Class v0 = FirebaseInstanceIdReceiver.class;
        __monitor_enter(v0);
        try {
            if(!"com.google.firebase.MESSAGING_EVENT".equals(arg3)) {
                goto label_13;
            }

            if(FirebaseInstanceIdReceiver.zzbl == null) {
                FirebaseInstanceIdReceiver.zzbl = new zzh(arg2, arg3);
            }

            v2_1 = FirebaseInstanceIdReceiver.zzbl;
        }
        catch(Throwable v2) {
            goto label_22;
        }

        __monitor_exit(v0);
        return v2_1;
        try {
        label_13:
            if(FirebaseInstanceIdReceiver.zzbk == null) {
                FirebaseInstanceIdReceiver.zzbk = new zzh(arg2, arg3);
            }

            v2_1 = FirebaseInstanceIdReceiver.zzbk;
        }
        catch(Throwable v2) {
        label_22:
            __monitor_exit(v0);
            throw v2;
        }

        __monitor_exit(v0);
        return v2_1;
    }

    private final void zza(Context arg5, Intent arg6, String arg7) {
        String v0_1;
        ComponentName v0 = null;
        arg6.setComponent(v0);
        arg6.setPackage(arg5.getPackageName());
        if(Build$VERSION.SDK_INT <= 18) {
            arg6.removeCategory(arg5.getPackageName());
        }

        String v1 = arg6.getStringExtra("gcm.rawData64");
        if(v1 != null) {
            arg6.putExtra("rawData", Base64.decode(v1, 0));
            arg6.removeExtra("gcm.rawData64");
        }

        if(("google.com/iid".equals(arg6.getStringExtra("from"))) || ("com.google.firebase.INSTANCE_ID_EVENT".equals(arg7))) {
            v0_1 = "com.google.firebase.INSTANCE_ID_EVENT";
        }
        else {
            if(!"com.google.android.c2dm.intent.RECEIVE".equals(arg7)) {
                if("com.google.firebase.MESSAGING_EVENT".equals(arg7)) {
                }
                else {
                    Log.d("FirebaseInstanceId", "Unexpected intent");
                    goto label_41;
                }
            }

            v0_1 = "com.google.firebase.MESSAGING_EVENT";
        }

    label_41:
        int v7 = -1;
        if((((String)v0)) != null) {
            v7 = FirebaseInstanceIdReceiver.zza(((BroadcastReceiver)this), arg5, ((String)v0), arg6);
        }

        if(this.isOrderedBroadcast()) {
            this.setResultCode(v7);
        }
    }

    private static int zzb(BroadcastReceiver arg4, Context arg5, String arg6, Intent arg7) {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            String v0 = "FirebaseInstanceId";
            String v1 = "Binding to service: ";
            String v2 = String.valueOf(arg6);
            v1 = v2.length() != 0 ? v1.concat(v2) : new String(v1);
            Log.d(v0, v1);
        }

        int v1_1 = -1;
        if(arg4.isOrderedBroadcast()) {
            arg4.setResultCode(v1_1);
        }

        FirebaseInstanceIdReceiver.zza(arg5, arg6).zza(arg7, arg4.goAsync());
        return v1_1;
    }
}

