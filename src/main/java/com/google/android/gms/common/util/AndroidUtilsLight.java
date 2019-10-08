package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@KeepForSdk public class AndroidUtilsLight {
    private static volatile int zzgd = -1;

    static {
    }

    public AndroidUtilsLight() {
        super();
    }

    @TargetApi(value=24) @KeepForSdk public static Context getDeviceProtectedStorageContext(Context arg1) {
        if((PlatformVersion.isAtLeastN()) && !arg1.isDeviceProtectedStorage()) {
            return arg1.createDeviceProtectedStorageContext();
        }

        return arg1;
    }

    @KeepForSdk public static byte[] getPackageCertificateHashBytes(Context arg2, String arg3) throws PackageManager$NameNotFoundException {
        String v0 = "SHA1";
        PackageInfo v2 = Wrappers.packageManager(arg2).getPackageInfo(arg3, 0x40);
        if(v2.signatures != null && v2.signatures.length == 1) {
            MessageDigest v3 = AndroidUtilsLight.zzi(v0);
            if(v3 != null) {
                return v3.digest(v2.signatures[0].toByteArray());
            }
        }

        return null;
    }

    public static MessageDigest zzi(String arg2) {
        MessageDigest v1;
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                v1 = MessageDigest.getInstance(arg2);
                if(v1 == null) {
                    goto label_6;
                }
            }
            catch(NoSuchAlgorithmException ) {
                goto label_6;
            }

            return v1;
        label_6:
        }

        return null;
    }
}

