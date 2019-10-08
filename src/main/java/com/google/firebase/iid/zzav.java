package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class zzav {
    private static zzav zzdb;
    @GuardedBy(value="serviceClassNames") private final SimpleArrayMap zzdc;
    private Boolean zzdd;
    private Boolean zzde;
    final Queue zzdf;
    private final Queue zzdg;

    private zzav() {
        super();
        this.zzdc = new SimpleArrayMap();
        this.zzdd = null;
        this.zzde = null;
        this.zzdf = new ArrayDeque();
        this.zzdg = new ArrayDeque();
    }

    private static Intent zza(Context arg2, String arg3, Intent arg4) {
        Intent v0 = new Intent(arg2, FirebaseInstanceIdReceiver.class);
        v0.setAction(arg3);
        v0.putExtra("wrapped_intent", ((Parcelable)arg4));
        return v0;
    }

    public static zzav zzai() {
        zzav v1_1;
        Class v0 = zzav.class;
        __monitor_enter(v0);
        try {
            if(zzav.zzdb == null) {
                zzav.zzdb = new zzav();
            }

            v1_1 = zzav.zzdb;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }

    public final Intent zzaj() {
        return this.zzdg.poll();
    }

    public static void zzb(Context arg1, Intent arg2) {
        arg1.sendBroadcast(zzav.zza(arg1, "com.google.firebase.INSTANCE_ID_EVENT", arg2));
    }

    public final int zzb(Context arg5, String arg6, Intent arg7) {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            String v0 = "FirebaseInstanceId";
            String v1 = "Starting service: ";
            String v2 = String.valueOf(arg6);
            v1 = v2.length() != 0 ? v1.concat(v2) : new String(v1);
            Log.d(v0, v1);
        }

        int v0_1 = -1;
        int v1_1 = arg6.hashCode();
        if(v1_1 != 0xCDC9D241) {
            if(v1_1 != 0x279BD20) {
            }
            else if(arg6.equals("com.google.firebase.MESSAGING_EVENT")) {
                v0_1 = 1;
            }
        }
        else if(arg6.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            v0_1 = 0;
        }

        switch(v0_1) {
            case 0: {
                goto label_42;
            }
            case 1: {
                goto label_39;
            }
        }

        String v5 = "FirebaseInstanceId";
        String v7 = "Unknown service action: ";
        arg6 = String.valueOf(arg6);
        arg6 = arg6.length() != 0 ? v7.concat(arg6) : new String(v7);
        Log.w(v5, arg6);
        return 500;
    label_39:
        this.zzdg.offer(arg7);
        goto label_44;
    label_42:
        this.zzdf.offer(arg7);
    label_44:
        arg7 = new Intent(arg6);
        arg7.setPackage(arg5.getPackageName());
        return this.zzd(arg5, arg7);
    }

    public static void zzc(Context arg1, Intent arg2) {
        arg1.sendBroadcast(zzav.zza(arg1, "com.google.firebase.MESSAGING_EVENT", arg2));
    }

    private final int zzd(Context arg6, Intent arg7) {
        ComponentName v6_3;
        String v2_1;
        String v1_1;
        String v0_3;
        SimpleArrayMap v0 = this.zzdc;
        __monitor_enter(v0);
        try {
            Object v1 = this.zzdc.get(arg7.getAction());
            __monitor_exit(v0);
            if(v1 != null) {
                goto label_70;
            }
        }
        catch(Throwable v6) {
            try {
            label_125:
                __monitor_exit(v0);
            }
            catch(Throwable v6) {
                goto label_125;
            }

            throw v6;
        }

        ResolveInfo v0_1 = arg6.getPackageManager().resolveService(arg7, 0);
        if(v0_1 != null) {
            if(v0_1.serviceInfo == null) {
            }
            else {
                ServiceInfo v0_2 = v0_1.serviceInfo;
                if(arg6.getPackageName().equals(v0_2.packageName)) {
                    if(v0_2.name == null) {
                    }
                    else {
                        v0_3 = v0_2.name;
                        if(v0_3.startsWith(".")) {
                            v1_1 = String.valueOf(arg6.getPackageName());
                            v0_3 = String.valueOf(v0_3);
                            v0_3 = v0_3.length() != 0 ? v1_1.concat(v0_3) : new String(v1_1);
                        }

                        v1_1 = v0_3;
                        SimpleArrayMap v2 = this.zzdc;
                        __monitor_enter(v2);
                        try {
                            this.zzdc.put(arg7.getAction(), v1_1);
                            __monitor_exit(v2);
                            goto label_70;
                        label_44:
                            __monitor_exit(v2);
                        }
                        catch(Throwable v6) {
                            goto label_44;
                        }

                        throw v6;
                    }
                }

                v2_1 = v0_2.packageName;
                v0_3 = v0_2.name;
                StringBuilder v4 = new StringBuilder(String.valueOf(v2_1).length() + 94 + String.valueOf(v0_3).length());
                v4.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                v4.append(v2_1);
                v4.append("/");
                v4.append(v0_3);
                Log.e("FirebaseInstanceId", v4.toString());
                goto label_87;
            }
        }

        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        goto label_87;
    label_70:
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            v0_3 = "FirebaseInstanceId";
            v2_1 = "Restricting intent to a specific service: ";
            String v3 = String.valueOf(v1_1);
            v2_1 = v3.length() != 0 ? v2_1.concat(v3) : new String(v2_1);
            Log.d(v0_3, v2_1);
        }

        arg7.setClassName(arg6.getPackageName(), v1_1);
        try {
        label_87:
            if(this.zzd(arg6)) {
                v6_3 = WakefulBroadcastReceiver.startWakefulService(arg6, arg7);
            }
            else {
                v6_3 = arg6.startService(arg7);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }

            if(v6_3 != null) {
                return -1;
            }

            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        }
        catch(IllegalStateException v6_1) {
            String v6_4 = String.valueOf(v6_1);
            StringBuilder v1_2 = new StringBuilder(String.valueOf(v6_4).length() + 45);
            v1_2.append("Failed to start service while in background: ");
            v1_2.append(v6_4);
            Log.e("FirebaseInstanceId", v1_2.toString());
            return 402;
        }
        catch(SecurityException v6_2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", ((Throwable)v6_2));
            return 401;
        }

        return -1;
    }

    final boolean zzd(Context arg2) {
        if(this.zzdd == null) {
            boolean v2 = arg2.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? true : false;
            this.zzdd = Boolean.valueOf(v2);
        }

        if(!this.zzdd.booleanValue() && (Log.isLoggable("FirebaseInstanceId", 3))) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }

        return this.zzdd.booleanValue();
    }

    final boolean zze(Context arg2) {
        if(this.zzde == null) {
            boolean v2 = arg2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? true : false;
            this.zzde = Boolean.valueOf(v2);
        }

        if(!this.zzdd.booleanValue() && (Log.isLoggable("FirebaseInstanceId", 3))) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }

        return this.zzde.booleanValue();
    }
}

