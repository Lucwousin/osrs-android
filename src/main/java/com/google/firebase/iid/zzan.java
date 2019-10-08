package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class zzan {
    private final Context zzac;
    @GuardedBy(value="this") private String zzcm;
    @GuardedBy(value="this") private String zzcn;
    @GuardedBy(value="this") private int zzco;
    @GuardedBy(value="this") private int zzcp;

    public zzan(Context arg2) {
        super();
        this.zzcp = 0;
        this.zzac = arg2;
    }

    public static String zza(FirebaseApp arg3) {
        String v0 = arg3.getOptions().getGcmSenderId();
        if(v0 != null) {
            return v0;
        }

        String v3 = arg3.getOptions().getApplicationId();
        if(!v3.startsWith("1:")) {
            return v3;
        }

        String[] v3_1 = v3.split(":");
        String v2 = null;
        if(v3_1.length < 2) {
            return v2;
        }

        v3 = v3_1[1];
        if(v3.isEmpty()) {
            return v2;
        }

        return v3;
    }

    public static String zza(KeyPair arg3) {
        byte[] v3 = arg3.getPublic().getEncoded();
        try {
            v3 = MessageDigest.getInstance("SHA1").digest(v3);
            v3[0] = ((byte)((v3[0] & 15) + 0x70));
            return Base64.encodeToString(v3, 0, 8, 11);
        }
        catch(NoSuchAlgorithmException ) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final int zzac() {
        int v1_2;
        Intent v1;
        PackageManager v0_2;
        int v0_1;
        __monitor_enter(this);
        try {
            if(this.zzcp == 0) {
                goto label_6;
            }

            v0_1 = this.zzcp;
        }
        catch(Throwable v0) {
            goto label_61;
        }

        __monitor_exit(this);
        return v0_1;
        try {
        label_6:
            v0_2 = this.zzac.getPackageManager();
            if(v0_2.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                goto label_19;
            }

            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
        }
        catch(Throwable v0) {
            goto label_61;
        }

        __monitor_exit(this);
        return 0;
        try {
        label_19:
            if(!PlatformVersion.isAtLeastO()) {
                v1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                v1.setPackage("com.google.android.gms");
                List v1_1 = v0_2.queryIntentServices(v1, 0);
                if(v1_1 != null && v1_1.size() > 0) {
                    this.zzcp = 1;
                    v0_1 = this.zzcp;
                    goto label_33;
                }
            }

            goto label_35;
        }
        catch(Throwable v0) {
            goto label_61;
        }

    label_33:
        __monitor_exit(this);
        return v0_1;
        try {
        label_35:
            v1 = new Intent("com.google.iid.TOKEN_REQUEST");
            v1.setPackage("com.google.android.gms");
            List v0_3 = v0_2.queryBroadcastReceivers(v1, 0);
            v1_2 = 2;
            if(v0_3 != null && v0_3.size() > 0) {
                this.zzcp = v1_2;
                v0_1 = this.zzcp;
                goto label_47;
            }

            goto label_49;
        }
        catch(Throwable v0) {
            goto label_61;
        }

    label_47:
        __monitor_exit(this);
        return v0_1;
        try {
        label_49:
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            this.zzcp = PlatformVersion.isAtLeastO() ? v1_2 : 1;
            v0_1 = this.zzcp;
        }
        catch(Throwable v0) {
        label_61:
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final String zzad() {
        String v0_1;
        __monitor_enter(this);
        try {
            if(this.zzcm == null) {
                this.zzag();
            }

            v0_1 = this.zzcm;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final String zzae() {
        String v0_1;
        __monitor_enter(this);
        try {
            if(this.zzcn == null) {
                this.zzag();
            }

            v0_1 = this.zzcn;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final int zzaf() {
        int v0_2;
        __monitor_enter(this);
        try {
            if(this.zzco == 0) {
                PackageInfo v0_1 = this.zze("com.google.android.gms");
                if(v0_1 != null) {
                    this.zzco = v0_1.versionCode;
                }
            }

            v0_2 = this.zzco;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_2;
    }

    private final void zzag() {
        __monitor_enter(this);
        try {
            PackageInfo v0_1 = this.zze(this.zzac.getPackageName());
            if(v0_1 != null) {
                this.zzcm = Integer.toString(v0_1.versionCode);
                this.zzcn = v0_1.versionName;
            }
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    private final PackageInfo zze(String arg4) {
        try {
            return this.zzac.getPackageManager().getPackageInfo(arg4, 0);
        }
        catch(PackageManager$NameNotFoundException v4) {
            arg4 = String.valueOf(v4);
            StringBuilder v2 = new StringBuilder(String.valueOf(arg4).length() + 23);
            v2.append("Failed to find package ");
            v2.append(arg4);
            Log.w("FirebaseInstanceId", v2.toString());
            return null;
        }
    }
}

