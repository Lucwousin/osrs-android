package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public final class GoogleAuthUtil extends zzd {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    private static final String KEY_ANDROID_PACKAGE_NAME = null;
    private static final String KEY_CALLER_UID = null;
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";

    static {
        GoogleAuthUtil.KEY_CALLER_UID = zzd.KEY_CALLER_UID;
        GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME = zzd.KEY_ANDROID_PACKAGE_NAME;
    }

    private GoogleAuthUtil() {
        super();
    }

    public static void clearToken(Context arg0, String arg1) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        zzd.clearToken(arg0, arg1);
    }

    public static List getAccountChangeEvents(Context arg0, int arg1, String arg2) throws GoogleAuthException, IOException {
        return zzd.getAccountChangeEvents(arg0, arg1, arg2);
    }

    public static String getAccountId(Context arg0, String arg1) throws GoogleAuthException, IOException {
        return zzd.getAccountId(arg0, arg1);
    }

    public static String getToken(Context arg0, Account arg1, String arg2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg0, arg1, arg2);
    }

    public static String getToken(Context arg0, Account arg1, String arg2, Bundle arg3) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg0, arg1, arg2, arg3);
    }

    @Deprecated public static String getToken(Context arg0, String arg1, String arg2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg0, arg1, arg2);
    }

    @Deprecated public static String getToken(Context arg0, String arg1, String arg2, Bundle arg3) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(arg0, arg1, arg2, arg3);
    }

    public static String getTokenWithNotification(Context arg2, Account arg3, String arg4, Bundle arg5) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(arg5 == null) {
            arg5 = new Bundle();
        }

        arg5.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zza(arg2, arg3, arg4, arg5).zzb();
    }

    public static String getTokenWithNotification(Context arg2, Account arg3, String arg4, Bundle arg5, Intent arg6) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(arg6 != null) {
            String v1 = arg6.toUri(1);
            try {
                Intent.parseUri(v1, 1);
                if(arg5 != null) {
                    goto label_7;
                }
            }
            catch(URISyntaxException ) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }

            arg5 = new Bundle();
        label_7:
            arg5.putParcelable("callback_intent", ((Parcelable)arg6));
            arg5.putBoolean("handle_notification", true);
            return GoogleAuthUtil.zza(arg2, arg3, arg4, arg5).zzb();
        }

        throw new IllegalArgumentException("Callback cannot be null.");
    }

    public static String getTokenWithNotification(Context arg1, Account arg2, String arg3, Bundle arg4, String arg5, Bundle arg6) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        Preconditions.checkNotEmpty(arg5, "Authority cannot be empty or null.");
        if(arg4 == null) {
            arg4 = new Bundle();
        }

        if(arg6 == null) {
            arg6 = new Bundle();
        }

        ContentResolver.validateSyncExtrasBundle(arg6);
        arg4.putString("authority", arg5);
        arg4.putBundle("sync_extras", arg6);
        arg4.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zza(arg1, arg2, arg3, arg4).zzb();
    }

    @Deprecated public static String getTokenWithNotification(Context arg2, String arg3, String arg4, Bundle arg5) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(arg2, new Account(arg3, "com.google"), arg4, arg5);
    }

    @Deprecated public static String getTokenWithNotification(Context arg2, String arg3, String arg4, Bundle arg5, Intent arg6) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(arg2, new Account(arg3, "com.google"), arg4, arg5, arg6);
    }

    @Deprecated public static String getTokenWithNotification(Context arg6, String arg7, String arg8, Bundle arg9, String arg10, Bundle arg11) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(arg6, new Account(arg7, "com.google"), arg8, arg9, arg10, arg11);
    }

    @RequiresPermission(value="android.permission.MANAGE_ACCOUNTS") @Deprecated public static void invalidateToken(Context arg0, String arg1) {
        zzd.invalidateToken(arg0, arg1);
    }

    @TargetApi(value=23) public static Bundle removeAccount(Context arg0, Account arg1) throws GoogleAuthException, IOException {
        return zzd.removeAccount(arg0, arg1);
    }

    @TargetApi(value=26) public static Boolean requestGoogleAccountsAccess(Context arg0) throws GoogleAuthException, IOException {
        return zzd.requestGoogleAccountsAccess(arg0);
    }

    private static TokenData zza(Context arg0, Account arg1, String arg2, Bundle arg3) throws IOException, GoogleAuthException {
        if(arg3 == null) {
            arg3 = new Bundle();
        }

        try {
            TokenData v1_2 = zzd.zzb(arg0, arg1, arg2, arg3);
            GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(arg0);
            return v1_2;
        }
        catch(UserRecoverableAuthException v1) {
            GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(arg0);
            Log.w("GoogleAuthUtil", "Error when getting token", ((Throwable)v1));
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        catch(GooglePlayServicesAvailabilityException v1_1) {
            GooglePlayServicesUtil.showErrorNotification(v1_1.getConnectionStatusCode(), arg0);
            Log.w("GoogleAuthUtil", "Error when getting token", ((Throwable)v1_1));
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }
}

