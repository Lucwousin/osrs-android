package com.google.firebase.messaging;

import android.app.ActivityManager$RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.firebase_messaging.zzaa;
import com.google.android.gms.internal.firebase_messaging.zzab;
import com.google.android.gms.internal.firebase_messaging.zzn;
import com.google.android.gms.internal.firebase_messaging.zzo;
import com.google.android.gms.internal.firebase_messaging.zzp;
import com.google.android.gms.internal.firebase_messaging.zzq;
import com.google.android.gms.internal.firebase_messaging.zzr;
import com.google.android.gms.internal.firebase_messaging.zzu;
import java.util.Iterator;
import java.util.List;

final class zza {
    private final Context zzac;
    private final Bundle zzcl;

    public zza(Context arg1, Bundle arg2) {
        super();
        this.zzac = arg1.getApplicationContext();
        this.zzcl = arg2;
    }

    final boolean zzar() {
        int v1;
        zzq v0 = new zzq("FirebaseMessaging", this.zzcl);
        if("1".equals(v0.getString("gcm.n.noui"))) {
            return 1;
        }

        if(!this.zzac.getSystemService("keyguard").inKeyguardRestrictedInputMode()) {
            if(!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10);
            }

            v1 = Process.myPid();
            List v4 = this.zzac.getSystemService("activity").getRunningAppProcesses();
            if(v4 == null) {
                goto label_38;
            }

            Iterator v4_1 = v4.iterator();
            do {
                if(!v4_1.hasNext()) {
                    goto label_38;
                }

                Object v5 = v4_1.next();
            }
            while(((ActivityManager$RunningAppProcessInfo)v5).pid != v1);

            if(((ActivityManager$RunningAppProcessInfo)v5).importance != 100) {
                goto label_38;
            }

            v1 = 1;
        }
        else {
        label_38:
            v1 = 0;
        }

        if(v1 != 0) {
            return 0;
        }

        PackageManager v1_1 = this.zzac.getPackageManager();
        String v4_2 = this.zzac.getPackageName();
        ApplicationInfo v5_1 = this.zzac.getApplicationInfo();
        zzab v0_1 = new zzr(this.zzac, new zzaa(new zzu(this.zzcl, v4_2).zzc(v5_1.icon).zza(v5_1.loadLabel(v1_1)).zzf(v1_1.getLaunchIntentForPackage(v4_2)).zza(new zzn(this.zzac)).zza(new zzo(this.zzac)).zza(new zzb(this, this.zzac.getSystemService("notification"))).zzq("FCM-Notification").zzi(this.zzas()).zza(this.zzac.getResources()).zza(new zzp(this.zzac, this.zzcl)).zzd(v5_1.targetSdkVersion).zzbe(), v0)).zzax();
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }

        this.zzac.getSystemService("notification").notify(v0_1.tag, 0, v0_1.zzfd.build());
        return 1;
    }

    private final Bundle zzas() {
        try {
            Bundle v0 = this.zzac.getPackageManager().getApplicationInfo(this.zzac.getPackageName(), 0x80).metaData;
            if(v0 != null) {
                return v0;
            }

            return Bundle.EMPTY;
        }
        catch(PackageManager$NameNotFoundException ) {
            return Bundle.EMPTY;
        }
    }
}

