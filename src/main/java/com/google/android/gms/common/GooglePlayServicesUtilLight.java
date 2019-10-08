package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk @ShowFirstParty public class GooglePlayServicesUtilLight {
    @KeepForSdk static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    @KeepForSdk static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 0x9B6D;
    @KeepForSdk public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @KeepForSdk @Deprecated public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk @Deprecated public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    @KeepForSdk public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk @VisibleForTesting static final AtomicBoolean sCanceledAvailabilityNotification = null;
    @VisibleForTesting private static boolean zzag = false;
    @VisibleForTesting private static boolean zzah = false;
    private static boolean zzai = false;
    @VisibleForTesting private static boolean zzaj = false;
    private static final AtomicBoolean zzak;

    static {
        GooglePlayServicesUtilLight.sCanceledAvailabilityNotification = new AtomicBoolean();
        GooglePlayServicesUtilLight.zzak = new AtomicBoolean();
    }

    @KeepForSdk GooglePlayServicesUtilLight() {
        super();
    }

    @KeepForSdk @Deprecated public static void cancelAvailabilityErrorNotifications(Context arg2) {
        if(GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }

        try {
            Object v2 = arg2.getSystemService("notification");
            if(v2 != null) {
                ((NotificationManager)v2).cancel(10436);
            }
        }
        catch(SecurityException ) {
            return;
        }
    }

    @KeepForSdk @ShowFirstParty public static void enableUsingApkIndependentContext() {
        GooglePlayServicesUtilLight.zzak.set(true);
    }

    @KeepForSdk @Deprecated public static void ensurePlayServicesAvailable(Context arg3, int arg4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        arg4 = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(arg3, arg4);
        if(arg4 != 0) {
            Intent v3 = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(arg3, arg4, "e");
            StringBuilder v2 = new StringBuilder(57);
            v2.append("GooglePlayServices not available due to error ");
            v2.append(arg4);
            Log.e("GooglePlayServicesUtil", v2.toString());
            if(v3 == null) {
                throw new GooglePlayServicesNotAvailableException(arg4);
            }

            throw new GooglePlayServicesRepairableException(arg4, "Google Play Services not available", v3);
        }
    }

    @KeepForSdk @ShowFirstParty @Deprecated public static int getApkVersion(Context arg2) {
        PackageInfo v2;
        try {
            v2 = arg2.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        }
        catch(PackageManager$NameNotFoundException ) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }

        return v2.versionCode;
    }

    @KeepForSdk @ShowFirstParty @Deprecated public static int getClientVersion(Context arg1) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(arg1, arg1.getPackageName());
    }

    @KeepForSdk @Deprecated public static PendingIntent getErrorPendingIntent(int arg1, Context arg2, int arg3) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(arg2, arg1, arg3);
    }

    @KeepForSdk @VisibleForTesting @Deprecated public static String getErrorString(int arg0) {
        return ConnectionResult.zza(arg0);
    }

    @KeepForSdk @ShowFirstParty @Deprecated public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int arg2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, arg2, null);
    }

    @KeepForSdk public static Context getRemoteContext(Context arg2) {
        try {
            return arg2.createPackageContext("com.google.android.gms", 3);
        }
        catch(PackageManager$NameNotFoundException ) {
            return null;
        }
    }

    @KeepForSdk public static Resources getRemoteResource(Context arg1) {
        try {
            return arg1.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch(PackageManager$NameNotFoundException ) {
            return null;
        }
    }

    @KeepForSdk @ShowFirstParty public static boolean honorsDebugCertificates(Context arg5) {
        if(!GooglePlayServicesUtilLight.zzaj) {
            try {
                PackageInfo v0 = Wrappers.packageManager(arg5).getPackageInfo("com.google.android.gms", 0x40);
                GoogleSignatureVerifier.getInstance(arg5);
                GooglePlayServicesUtilLight.zzai = v0 == null || (GoogleSignatureVerifier.zza(v0, false)) || !GoogleSignatureVerifier.zza(v0, true) ? false : true;
            }
            catch(Throwable v5) {
            label_27:
                GooglePlayServicesUtilLight.zzaj = true;
                throw v5;
            }
            catch(PackageManager$NameNotFoundException v5_1) {
                try {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", ((Throwable)v5_1));
                }
                catch(Throwable v5) {
                    goto label_27;
                }

                GooglePlayServicesUtilLight.zzaj = true;
                goto label_29;
            }

            GooglePlayServicesUtilLight.zzaj = true;
        }

    label_29:
        if(!GooglePlayServicesUtilLight.zzai) {
            if(!DeviceProperties.isUserBuild()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    @KeepForSdk @Deprecated public static int isGooglePlayServicesAvailable(Context arg3, int arg4) {
        try {
            arg3.getResources().getString(R$string.common_google_play_services_unknown_issue);
        }
        catch(Throwable ) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }

        if(!"com.google.android.gms".equals(arg3.getPackageName()) && !GooglePlayServicesUtilLight.zzak.get()) {
            int v0 = zzp.zzd(arg3);
            if(v0 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app\'s AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            else if(v0 == GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
            }
            else {
                arg4 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                StringBuilder v2 = new StringBuilder(320);
                v2.append("The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected ");
                v2.append(arg4);
                v2.append(" but found ");
                v2.append(v0);
                v2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(v2.toString());
            }
        }

        boolean v0_1 = (DeviceProperties.isWearableWithoutPlayStore(arg3)) || (DeviceProperties.zzf(arg3)) ? false : true;
        return GooglePlayServicesUtilLight.zza(arg3, v0_1, arg4);
    }

    @KeepForSdk @HideFirstParty @Deprecated public static int isGooglePlayServicesAvailable(Context arg1) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(arg1, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk @Deprecated public static boolean isGooglePlayServicesUid(Context arg0, int arg1) {
        return UidVerifier.isGooglePlayServicesUid(arg0, arg1);
    }

    @KeepForSdk @ShowFirstParty @Deprecated public static boolean isPlayServicesPossiblyUpdating(Context arg2, int arg3) {
        if(arg3 == 18) {
            return 1;
        }

        if(arg3 == 1) {
            return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(arg2, "com.google.android.gms");
        }

        return 0;
    }

    @KeepForSdk @ShowFirstParty @Deprecated public static boolean isPlayStorePossiblyUpdating(Context arg1, int arg2) {
        if(arg2 == 9) {
            return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(arg1, "com.android.vending");
        }

        return 0;
    }

    @TargetApi(value=18) @KeepForSdk public static boolean isRestrictedUserProfile(Context arg2) {
        if(PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle v2 = arg2.getSystemService("user").getApplicationRestrictions(arg2.getPackageName());
            if(v2 != null && ("true".equals(v2.getString("restricted_profile")))) {
                return 1;
            }
        }

        return 0;
    }

    @KeepForSdk @ShowFirstParty @VisibleForTesting @Deprecated public static boolean isSidewinderDevice(Context arg0) {
        return DeviceProperties.isSidewinder(arg0);
    }

    @TargetApi(value=21) static boolean isUninstalledAppPossiblyUpdating(Context arg5, String arg6) {
        List v1;
        boolean v0 = arg6.equals("com.google.android.gms");
        if(PlatformVersion.isAtLeastLollipop()) {
            try {
                v1 = arg5.getPackageManager().getPackageInstaller().getAllSessions();
            }
            catch(Exception ) {
                return 0;
            }

            Iterator v1_1 = v1.iterator();
            do {
                if(v1_1.hasNext()) {
                    if(!arg6.equals(v1_1.next().getAppPackageName())) {
                        continue;
                    }

                    return 1;
                }

                goto label_18;
            }
            while(true);

            return 1;
        }

    label_18:
        PackageManager v1_2 = arg5.getPackageManager();
        int v4 = 0x2000;
        try {
            ApplicationInfo v6 = v1_2.getApplicationInfo(arg6, v4);
            if(v0) {
                return v6.enabled;
            }

            if(v6.enabled) {
                if(GooglePlayServicesUtilLight.isRestrictedUserProfile(arg5)) {
                    return 0;
                }

                return 1;
            }

            return 0;
        }
        catch(PackageManager$NameNotFoundException ) {
            return 0;
        }

        return 1;
    }

    @KeepForSdk @Deprecated public static boolean isUserRecoverableError(int arg1) {
        if(arg1 != 9) {
            switch(arg1) {
                case 1: 
                case 2: 
                case 3: {
                    return 1;
                }
                default: {
                    return 0;
                }
            }
        }

        return 1;
    }

    @TargetApi(value=19) @KeepForSdk @Deprecated public static boolean uidHasPackageName(Context arg0, int arg1, String arg2) {
        return UidVerifier.uidHasPackageName(arg0, arg1, arg2);
    }

    @VisibleForTesting private static int zza(Context arg7, boolean arg8, int arg9) {
        PackageInfo v5;
        boolean v2 = arg9 >= 0 ? true : false;
        Preconditions.checkArgument(v2);
        PackageManager v2_1 = arg7.getPackageManager();
        PackageInfo v3 = null;
        int v4 = 9;
        if(arg8) {
            try {
                v3 = v2_1.getPackageInfo("com.android.vending", 0x2040);
            }
            catch(PackageManager$NameNotFoundException ) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return v4;
            }
        }

        try {
            v5 = v2_1.getPackageInfo("com.google.android.gms", 0x40);
        }
        catch(PackageManager$NameNotFoundException ) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }

        GoogleSignatureVerifier.getInstance(arg7);
        if(!GoogleSignatureVerifier.zza(v5, true)) {
            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
            return v4;
        }

        if((arg8) && (!GoogleSignatureVerifier.zza(v3, true) || !v3.signatures[0].equals(v5.signatures[0]))) {
            Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
            return v4;
        }

        if(zzb.zzc(v5.versionCode) < zzb.zzc(arg9)) {
            int v8 = v5.versionCode;
            StringBuilder v1 = new StringBuilder(77);
            v1.append("Google Play services out of date.  Requires ");
            v1.append(arg9);
            v1.append(" but found ");
            v1.append(v8);
            Log.w("GooglePlayServicesUtil", v1.toString());
            return 2;
        }

        ApplicationInfo v7 = v5.applicationInfo;
        if(v7 == null) {
            try {
                v7 = v2_1.getApplicationInfo("com.google.android.gms", 0);
            }
            catch(PackageManager$NameNotFoundException v7_1) {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", ((Throwable)v7_1));
                return 1;
            }
        }

        if(!v7.enabled) {
            return 3;
        }

        return 0;
    }
}

