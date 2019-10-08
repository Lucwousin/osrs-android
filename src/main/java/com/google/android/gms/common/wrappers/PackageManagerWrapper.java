package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk public class PackageManagerWrapper {
    private final Context zzhv;

    public PackageManagerWrapper(Context arg1) {
        super();
        this.zzhv = arg1;
    }

    @KeepForSdk public int checkCallingOrSelfPermission(String arg2) {
        return this.zzhv.checkCallingOrSelfPermission(arg2);
    }

    @KeepForSdk public int checkPermission(String arg2, String arg3) {
        return this.zzhv.getPackageManager().checkPermission(arg2, arg3);
    }

    @KeepForSdk public ApplicationInfo getApplicationInfo(String arg2, int arg3) throws PackageManager$NameNotFoundException {
        return this.zzhv.getPackageManager().getApplicationInfo(arg2, arg3);
    }

    @KeepForSdk public CharSequence getApplicationLabel(String arg4) throws PackageManager$NameNotFoundException {
        return this.zzhv.getPackageManager().getApplicationLabel(this.zzhv.getPackageManager().getApplicationInfo(arg4, 0));
    }

    @KeepForSdk public PackageInfo getPackageInfo(String arg2, int arg3) throws PackageManager$NameNotFoundException {
        return this.zzhv.getPackageManager().getPackageInfo(arg2, arg3);
    }

    public final String[] getPackagesForUid(int arg2) {
        return this.zzhv.getPackageManager().getPackagesForUid(arg2);
    }

    @KeepForSdk public boolean isCallerInstantApp() {
        if(Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zzhv);
        }

        if(PlatformVersion.isAtLeastO()) {
            String v0 = this.zzhv.getPackageManager().getNameForUid(Binder.getCallingUid());
            if(v0 != null) {
                return this.zzhv.getPackageManager().isInstantApp(v0);
            }
        }

        return 0;
    }

    public final PackageInfo zza(String arg1, int arg2, int arg3) throws PackageManager$NameNotFoundException {
        return this.zzhv.getPackageManager().getPackageInfo(arg1, 0x40);
    }

    @TargetApi(value=19) public final boolean zzb(int arg5, String arg6) {
        if(PlatformVersion.isAtLeastKitKat()) {
            try {
                this.zzhv.getSystemService("appops").checkPackage(arg5, arg6);
                return 1;
            }
            catch(SecurityException ) {
                return 0;
            }
        }

        String[] v5 = this.zzhv.getPackageManager().getPackagesForUid(arg5);
        if(arg6 != null && v5 != null) {
            int v0 = 0;
            while(v0 < v5.length) {
                if(arg6.equals(v5[v0])) {
                    return 1;
                }
                else {
                    ++v0;
                    continue;
                }

                return 0;
            }
        }

        return 0;
    }
}

