package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk public class ClientLibraryUtils {
    private ClientLibraryUtils() {
        super();
    }

    @KeepForSdk public static int getClientVersion(Context arg1, String arg2) {
        PackageInfo v1 = ClientLibraryUtils.zzb(arg1, arg2);
        int v2 = -1;
        if(v1 != null) {
            if(v1.applicationInfo == null) {
            }
            else {
                Bundle v1_1 = v1.applicationInfo.metaData;
                if(v1_1 == null) {
                    return v2;
                }
                else {
                    return v1_1.getInt("com.google.android.gms.version", v2);
                }
            }
        }

        return v2;
    }

    @KeepForSdk public static boolean isPackageSide() {
        return 0;
    }

    @Nullable private static PackageInfo zzb(Context arg1, String arg2) {
        try {
            return Wrappers.packageManager(arg1).getPackageInfo(arg2, 0x80);
        }
        catch(PackageManager$NameNotFoundException ) {
            return null;
        }
    }

    public static boolean zzc(Context arg1, String arg2) {
        "com.google.android.gms".equals(arg2);
        try {
            if((Wrappers.packageManager(arg1).getApplicationInfo(arg2, 0).flags & 0x200000) == 0) {
                return 0;
            }
        }
        catch(PackageManager$NameNotFoundException ) {
            return 0;
        }

        return 1;
    }
}

