package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk @ShowFirstParty public class GoogleApiAvailabilityLight {
    @KeepForSdk public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    @KeepForSdk public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk static final String TRACKING_SOURCE_DIALOG = "d";
    @KeepForSdk static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final GoogleApiAvailabilityLight zzm;

    static {
        GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        GoogleApiAvailabilityLight.zzm = new GoogleApiAvailabilityLight();
    }

    @KeepForSdk GoogleApiAvailabilityLight() {
        super();
    }

    @KeepForSdk public void cancelAvailabilityErrorNotifications(Context arg1) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(arg1);
    }

    @KeepForSdk @ShowFirstParty public int getApkVersion(Context arg1) {
        return GooglePlayServicesUtilLight.getApkVersion(arg1);
    }

    @KeepForSdk @ShowFirstParty public int getClientVersion(Context arg1) {
        return GooglePlayServicesUtilLight.getClientVersion(arg1);
    }

    @Nullable @KeepForSdk @ShowFirstParty @Deprecated public Intent getErrorResolutionIntent(int arg2) {
        return this.getErrorResolutionIntent(null, arg2, null);
    }

    @Nullable @KeepForSdk @ShowFirstParty public Intent getErrorResolutionIntent(Context arg1, int arg2, @Nullable String arg3) {
        switch(arg2) {
            case 1: 
            case 2: {
                goto label_6;
            }
            case 3: {
                goto label_3;
            }
        }

        return null;
    label_3:
        return zzg.zzg("com.google.android.gms");
    label_6:
        if(arg1 != null && (DeviceProperties.isWearableWithoutPlayStore(arg1))) {
            return zzg.zzs();
        }

        return zzg.zza("com.google.android.gms", GoogleApiAvailabilityLight.zza(arg1, arg3));
    }

    @Nullable @KeepForSdk public PendingIntent getErrorResolutionPendingIntent(Context arg2, int arg3, int arg4) {
        return this.getErrorResolutionPendingIntent(arg2, arg3, arg4, null);
    }

    @Nullable @KeepForSdk @ShowFirstParty public PendingIntent getErrorResolutionPendingIntent(Context arg1, int arg2, int arg3, @Nullable String arg4) {
        Intent v2 = this.getErrorResolutionIntent(arg1, arg2, arg4);
        if(v2 == null) {
            return null;
        }

        return PendingIntent.getActivity(arg1, arg3, v2, 0x8000000);
    }

    @KeepForSdk public String getErrorString(int arg1) {
        return GooglePlayServicesUtilLight.getErrorString(arg1);
    }

    @KeepForSdk public static GoogleApiAvailabilityLight getInstance() {
        return GoogleApiAvailabilityLight.zzm;
    }

    @KeepForSdk public int isGooglePlayServicesAvailable(Context arg1, int arg2) {
        arg2 = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(arg1, arg2);
        if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(arg1, arg2)) {
            arg2 = 18;
        }

        return arg2;
    }

    @KeepForSdk @HideFirstParty public int isGooglePlayServicesAvailable(Context arg2) {
        return this.isGooglePlayServicesAvailable(arg2, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk @ShowFirstParty public boolean isPlayServicesPossiblyUpdating(Context arg1, int arg2) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(arg1, arg2);
    }

    @KeepForSdk @ShowFirstParty public boolean isPlayStorePossiblyUpdating(Context arg1, int arg2) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(arg1, arg2);
    }

    @KeepForSdk public boolean isUninstalledAppPossiblyUpdating(Context arg1, String arg2) {
        return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(arg1, arg2);
    }

    @KeepForSdk public boolean isUserResolvableError(int arg1) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(arg1);
    }

    @KeepForSdk public void verifyGooglePlayServicesIsAvailable(Context arg1, int arg2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(arg1, arg2);
    }

    @VisibleForTesting private static String zza(@Nullable Context arg2, @Nullable String arg3) {
        StringBuilder v0 = new StringBuilder();
        v0.append("gcore_");
        v0.append(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        v0.append("-");
        if(!TextUtils.isEmpty(((CharSequence)arg3))) {
            v0.append(arg3);
        }

        v0.append("-");
        if(arg2 != null) {
            v0.append(arg2.getPackageName());
        }

        v0.append("-");
        if(arg2 != null) {
            try {
                v0.append(Wrappers.packageManager(arg2).getPackageInfo(arg2.getPackageName(), 0).versionCode);
                goto label_25;
            }
            catch(PackageManager$NameNotFoundException ) {
            label_25:
                return v0.toString();
            }
        }

        goto label_25;
    }
}

