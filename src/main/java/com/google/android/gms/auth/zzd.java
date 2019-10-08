package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.util.List;

public class zzd {
    private static final String[] ACCEPTABLE_ACCOUNT_TYPES = null;
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    @SuppressLint(value={"InlinedApi"}) public static final String KEY_ANDROID_PACKAGE_NAME = null;
    @SuppressLint(value={"InlinedApi"}) public static final String KEY_CALLER_UID = null;
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final ComponentName zzm;
    private static final Logger zzn;

    static {
        zzd.ACCEPTABLE_ACCOUNT_TYPES = new String[]{"com.google", "com.google.work", "cn.google"};
        zzd.KEY_CALLER_UID = "callerUid";
        zzd.KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
        zzd.zzm = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        zzd.zzn = new Logger("Auth", new String[]{"GoogleAuthUtil"});
    }

    zzd() {
        super();
    }

    public static void clearToken(Context arg3, String arg4) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(arg3, 8400000);
        Bundle v0 = new Bundle();
        String v1 = arg3.getApplicationInfo().packageName;
        v0.putString("clientPackageName", v1);
        if(!v0.containsKey(zzd.KEY_ANDROID_PACKAGE_NAME)) {
            v0.putString(zzd.KEY_ANDROID_PACKAGE_NAME, v1);
        }

        zzd.zza(arg3, zzd.zzm, new zzf(arg4, v0));
    }

    private static void ensurePlayServicesAvailable(Context arg2, int arg3) throws GoogleAuthException {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(arg2.getApplicationContext(), arg3);
            return;
        }
        catch(GooglePlayServicesNotAvailableException v2) {
            throw new GoogleAuthException(v2.getMessage());
        }
        catch(GooglePlayServicesRepairableException v2_1) {
            throw new GooglePlayServicesAvailabilityException(v2_1.getConnectionStatusCode(), v2_1.getMessage(), v2_1.getIntent());
        }
    }

    public static List getAccountChangeEvents(Context arg1, int arg2, String arg3) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(arg3, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(arg1, 8400000);
        return zzd.zza(arg1, zzd.zzm, new zzg(arg3, arg2));
    }

    public static String getAccountId(Context arg2, String arg3) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(arg3, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(arg2, 8400000);
        return zzd.getToken(arg2, arg3, "^^_account_id_^^", new Bundle());
    }

    @Deprecated public static String getToken(Context arg2, String arg3, String arg4, Bundle arg5) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg2, new Account(arg3, "com.google"), arg4, arg5);
    }

    public static String getToken(Context arg1, Account arg2, String arg3) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg1, arg2, arg3, new Bundle());
    }

    public static String getToken(Context arg0, Account arg1, String arg2, Bundle arg3) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        zzd.zzb(arg1);
        return zzd.zzb(arg0, arg1, arg2, arg3).zzb();
    }

    @Deprecated public static String getToken(Context arg2, String arg3, String arg4) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg2, new Account(arg3, "com.google"), arg4);
    }

    @RequiresPermission(value="android.permission.MANAGE_ACCOUNTS") @Deprecated public static void invalidateToken(Context arg1, String arg2) {
        AccountManager.get(arg1).invalidateAuthToken("com.google", arg2);
    }

    @TargetApi(value=23) public static Bundle removeAccount(Context arg1, Account arg2) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(arg1);
        zzd.zzb(arg2);
        zzd.ensurePlayServicesAvailable(arg1, 8400000);
        return zzd.zza(arg1, zzd.zzm, new zzh(arg2));
    }

    @TargetApi(value=26) public static Boolean requestGoogleAccountsAccess(Context arg2) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(arg2);
        zzd.ensurePlayServicesAvailable(arg2, 11400000);
        return zzd.zza(arg2, zzd.zzm, new zzi(arg2.getApplicationInfo().packageName));
    }

    private static Object zza(Context arg6, ComponentName arg7, zzj arg8) throws IOException, GoogleAuthException {
        Object v8_2;
        BlockingServiceConnection v0 = new BlockingServiceConnection();
        GmsClientSupervisor v6 = GmsClientSupervisor.getInstance(arg6);
        if(v6.bindService(arg7, ((ServiceConnection)v0), "GoogleAuthUtil")) {
            try {
                v8_2 = arg8.zzb(v0.getService());
            }
            catch(Throwable v8) {
            }
            catch(InterruptedException v8_1) {
                try {
                    zzd.zzn.i("GoogleAuthUtil", new Object[]{"Error on service connection.", v8_1});
                    throw new IOException("Error on service connection.", ((Throwable)v8_1));
                }
                catch(Throwable v8) {
                    v6.unbindService(arg7, ((ServiceConnection)v0), "GoogleAuthUtil");
                    throw v8;
                }
            }

            v6.unbindService(arg7, ((ServiceConnection)v0), "GoogleAuthUtil");
            return v8_2;
        }

        throw new IOException("Could not bind to service.");
    }

    static Logger zza() {
        return zzd.zzn;
    }

    private static Object zza(Object arg3) throws IOException {
        if(arg3 != null) {
            return arg3;
        }

        zzd.zzn.w("GoogleAuthUtil", new Object[]{"Binder call returned null."});
        throw new IOException("Service unavailable.");
    }

    private static void zzb(Account arg5) {
        if(arg5 != null) {
            if(!TextUtils.isEmpty(arg5.name)) {
                String[] v0 = zzd.ACCEPTABLE_ACCOUNT_TYPES;
                int v1 = v0.length;
                int v2;
                for(v2 = 0; v2 < v1; ++v2) {
                    if(v0[v2].equals(arg5.type)) {
                        return;
                    }
                }

                throw new IllegalArgumentException("Account type not supported");
            }

            throw new IllegalArgumentException("Account name cannot be empty!");
        }

        throw new IllegalArgumentException("Account cannot be null");
    }

    public static TokenData zzb(Context arg3, Account arg4, String arg5, Bundle arg6) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(arg5, "Scope cannot be empty or null.");
        zzd.zzb(arg4);
        zzd.ensurePlayServicesAvailable(arg3, 8400000);
        arg6 = arg6 == null ? new Bundle() : new Bundle(arg6);
        String v0 = arg3.getApplicationInfo().packageName;
        arg6.putString("clientPackageName", v0);
        if(TextUtils.isEmpty(arg6.getString(zzd.KEY_ANDROID_PACKAGE_NAME))) {
            arg6.putString(zzd.KEY_ANDROID_PACKAGE_NAME, v0);
        }

        arg6.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return zzd.zza(arg3, zzd.zzm, new zze(arg4, arg5, arg6));
    }

    static Object zzb(Object arg0) throws IOException {
        return zzd.zza(arg0);
    }
}

