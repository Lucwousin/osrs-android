package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

public final class zzfz {
    private final zzgn zzacv;
    @VisibleForTesting volatile zzr zzamv;
    @VisibleForTesting private ServiceConnection zzamw;

    zzfz(zzgn arg1) {
        super();
        this.zzacv = arg1;
    }

    static zzgn zza(zzfz arg0) {
        return arg0.zzacv;
    }

    @WorkerThread @VisibleForTesting final void zzc(Bundle arg11) {
        String v0;
        zzfk v11;
        this.zzacv.zzgh().zzab();
        if(arg11 == null) {
            return;
        }

        long v1 = 0;
        long v5 = 1000;
        long v3 = arg11.getLong("install_begin_timestamp_seconds", v1) * v5;
        if(v3 == v1) {
            v11 = this.zzacv.zzgi().zziv();
            v0 = "Service response is missing Install Referrer install timestamp";
        }
        else {
            v0 = arg11.getString("install_referrer");
            if(v0 != null) {
                if(v0.isEmpty()) {
                }
                else {
                    this.zzacv.zzgi().zzjc().zzg("InstallReferrer API result", v0);
                    zzkd v7 = this.zzacv.zzgg();
                    String v8 = "?";
                    v0 = String.valueOf(v0);
                    v0 = v0.length() != 0 ? v8.concat(v0) : new String(v8);
                    Bundle v0_1 = v7.zza(Uri.parse(v0));
                    if(v0_1 == null) {
                        v11 = this.zzacv.zzgi().zziv();
                        v0 = "No campaign params defined in install referrer result";
                        goto label_15;
                    }

                    String v7_1 = v0_1.getString("medium");
                    int v7_2 = v7_1 == null || ("(not set)".equalsIgnoreCase(v7_1)) || ("organic".equalsIgnoreCase(v7_1)) ? 0 : 1;
                    if(v7_2 != 0) {
                        long v7_3 = arg11.getLong("referrer_click_timestamp_seconds", v1) * v5;
                        if(v7_3 == v1) {
                            v11 = this.zzacv.zzgi().zziv();
                            v0 = "Install Referrer is missing click timestamp for ad campaign";
                            goto label_15;
                        }
                        else {
                            v0_1.putLong("click_timestamp", v7_3);
                        }
                    }

                    if(v3 == this.zzacv.zzgj().zzalz.get()) {
                        v11 = this.zzacv.zzgi().zzjc();
                        v0 = "Campaign has already been logged";
                        goto label_15;
                    }

                    v0_1.putString("_cis", "referrer API");
                    this.zzacv.zzgj().zzalz.set(v3);
                    this.zzacv.zzfy().logEvent("auto", "_cmp", v0_1);
                    if(this.zzamw != null) {
                        ConnectionTracker.getInstance().unbindService(this.zzacv.getContext(), this.zzamw);
                    }

                    return;
                }
            }

            v11 = this.zzacv.zzgi().zziv();
            v0 = "No referrer defined in install referrer response";
        }

    label_15:
        v11.log(v0);
    }

    @WorkerThread protected final void zzjr() {
        this.zzacv.zzgl();
        this.zzacv.zzgh().zzab();
        ServiceConnection v1 = null;
        if(!this.zzjs()) {
            this.zzacv.zzgi().zzja().log("Install Referrer Reporter is not available");
            this.zzamw = v1;
            return;
        }

        this.zzamw = new zzgb(this, ((zzga)v1));
        this.zzacv.zzgi().zzja().log("Install Referrer Reporter is initializing");
        this.zzacv.zzgh().zzab();
        Intent v0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        v0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager v1_1 = this.zzacv.getContext().getPackageManager();
        if(v1_1 == null) {
            this.zzacv.zzgi().zziy().log("Failed to obtain Package Manager to verify binding conditions");
            return;
        }

        List v1_2 = v1_1.queryIntentServices(v0, 0);
        if(v1_2 != null && !v1_2.isEmpty()) {
            Object v1_3 = v1_2.get(0);
            if(((ResolveInfo)v1_3).serviceInfo != null) {
                String v2 = ((ResolveInfo)v1_3).serviceInfo.packageName;
                if(((ResolveInfo)v1_3).serviceInfo.name != null && this.zzamw != null && ("com.android.vending".equals(v2)) && (this.zzjs())) {
                    Intent v1_4 = new Intent(v0);
                    try {
                        boolean v0_2 = ConnectionTracker.getInstance().bindService(this.zzacv.getContext(), v1_4, this.zzamw, 1);
                        zzfk v1_5 = this.zzacv.zzgi().zzja();
                        v2 = "Install Referrer Service is";
                        String v0_3 = v0_2 ? "available" : "not available";
                        v1_5.zzg(v2, v0_3);
                        return;
                    }
                    catch(Exception v0_1) {
                        this.zzacv.zzgi().zziv().zzg("Exception occurred while binding to Install Referrer Service", v0_1.getMessage());
                        return;
                    }
                }

                this.zzacv.zzgi().zzja().log("Play Store missing or incompatible. Version 8.3.73 or later required");
            }

            return;
        }

        this.zzacv.zzgi().zzja().log("Play Service for fetching Install Referrer is unavailable on device");
    }

    @VisibleForTesting private final boolean zzjs() {
        boolean v0 = false;
        try {
            PackageManagerWrapper v1_1 = Wrappers.packageManager(this.zzacv.getContext());
            if(v1_1 == null) {
                this.zzacv.zzgi().zzja().log("Failed to retrieve Package Manager to check Play Store compatibility");
                return 0;
            }

            if(v1_1.getPackageInfo("com.android.vending", 0x80).versionCode < 80837300) {
                return v0;
            }
        }
        catch(Exception v1) {
            this.zzacv.zzgi().zzja().zzg("Failed to retrieve Play Store version", v1);
            return 0;
        }

        return true;
    }

    @Nullable @WorkerThread @VisibleForTesting final Bundle zzjt() {
        this.zzacv.zzgh().zzab();
        Bundle v1 = null;
        if(this.zzamv == null) {
            this.zzacv.zzgi().zziy().log("Attempting to use Install Referrer Service while it is not initialized");
            return v1;
        }

        Bundle v0 = new Bundle();
        v0.putString("package_name", this.zzacv.getContext().getPackageName());
        try {
            v0 = this.zzamv.zza(v0);
            if(v0 != null) {
                return v0;
            }

            this.zzacv.zzgi().zziv().log("Install Referrer Service returned a null response");
            return v1;
        }
        catch(Exception v0_1) {
            this.zzacv.zzgi().zziv().zzg("Exception occurred while retrieving the Install Referrer", v0_1.getMessage());
            return v1;
        }

        return v0;
    }
}

