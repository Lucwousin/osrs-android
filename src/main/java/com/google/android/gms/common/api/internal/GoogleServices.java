package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk @Deprecated public final class GoogleServices {
    private static final Object sLock;
    @GuardedBy(value="sLock") private static GoogleServices zzax;
    private final String zzay;
    private final Status zzaz;
    private final boolean zzba;
    private final boolean zzbb;

    static {
        GoogleServices.sLock = new Object();
    }

    @KeepForSdk @VisibleForTesting GoogleServices(Context arg5) {
        super();
        Resources v0 = arg5.getResources();
        int v1 = v0.getIdentifier("google_app_measurement_enable", "integer", v0.getResourcePackageName(R$string.common_google_play_services_unknown_issue));
        int v3 = 1;
        if(v1 != 0) {
            if(v0.getInteger(v1) != 0) {
            }
            else {
                v3 = 0;
            }

            this.zzbb = v3 ^ 1;
        }
        else {
            this.zzbb = false;
        }

        this.zzba = ((boolean)v3);
        String v0_1 = zzp.zzc(arg5);
        if(v0_1 == null) {
            v0_1 = new StringResourceValueReader(arg5).getString("google_app_id");
        }

        if(TextUtils.isEmpty(((CharSequence)v0_1))) {
            this.zzaz = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzay = null;
            return;
        }

        this.zzay = v0_1;
        this.zzaz = Status.RESULT_SUCCESS;
    }

    @KeepForSdk @VisibleForTesting GoogleServices(String arg1, boolean arg2) {
        super();
        this.zzay = arg1;
        this.zzaz = Status.RESULT_SUCCESS;
        this.zzba = arg2;
        this.zzbb = (((int)arg2)) ^ 1;
    }

    @KeepForSdk @VisibleForTesting final Status checkGoogleAppId(String arg5) {
        if(this.zzay != null && !this.zzay.equals(arg5)) {
            String v1 = this.zzay;
            StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 97);
            v3.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: \'");
            v3.append(v1);
            v3.append("\'.");
            return new Status(10, v3.toString());
        }

        return Status.RESULT_SUCCESS;
    }

    @KeepForSdk private static GoogleServices checkInitialized(String arg4) {
        Object v0 = GoogleServices.sLock;
        __monitor_enter(v0);
        try {
            if(GoogleServices.zzax != null) {
                __monitor_exit(v0);
                return GoogleServices.zzax;
            }

            StringBuilder v3 = new StringBuilder(String.valueOf(arg4).length() + 34);
            v3.append("Initialize must be called before ");
            v3.append(arg4);
            v3.append(".");
            throw new IllegalStateException(v3.toString());
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_22;
        }

        throw v4;
    }

    @KeepForSdk @VisibleForTesting static void clearInstanceForTest() {
        Object v0 = GoogleServices.sLock;
        __monitor_enter(v0);
        GoogleServices v1 = null;
        try {
            GoogleServices.zzax = v1;
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_7;
        }

        throw v1_1;
    }

    @KeepForSdk public static String getGoogleAppId() {
        return GoogleServices.checkInitialized("getGoogleAppId").zzay;
    }

    @KeepForSdk public static Status initialize(Context arg2) {
        Preconditions.checkNotNull(arg2, "Context must not be null.");
        Object v0 = GoogleServices.sLock;
        __monitor_enter(v0);
        try {
            if(GoogleServices.zzax == null) {
                GoogleServices.zzax = new GoogleServices(arg2);
            }

            __monitor_exit(v0);
            return GoogleServices.zzax.zzaz;
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_14;
        }

        throw v2;
    }

    @KeepForSdk public static Status initialize(Context arg1, String arg2, boolean arg3) {
        Preconditions.checkNotNull(arg1, "Context must not be null.");
        Preconditions.checkNotEmpty(arg2, "App ID must be nonempty.");
        Object v1 = GoogleServices.sLock;
        __monitor_enter(v1);
        try {
            if(GoogleServices.zzax != null) {
                __monitor_exit(v1);
                return GoogleServices.zzax.checkGoogleAppId(arg2);
            }

            GoogleServices v0 = new GoogleServices(arg2, arg3);
            GoogleServices.zzax = v0;
            __monitor_exit(v1);
            return v0.zzaz;
        label_19:
            __monitor_exit(v1);
        }
        catch(Throwable v2) {
            goto label_19;
        }

        throw v2;
    }

    @KeepForSdk public static boolean isMeasurementEnabled() {
        GoogleServices v0 = GoogleServices.checkInitialized("isMeasurementEnabled");
        if((v0.zzaz.isSuccess()) && (v0.zzba)) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isMeasurementExplicitlyDisabled() {
        return GoogleServices.checkInitialized("isMeasurementExplicitlyDisabled").zzbb;
    }
}

