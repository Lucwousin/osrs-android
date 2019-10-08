package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

public class GoogleSignInClient extends GoogleApi {
    final class zzc implements ResultConverter {
        zzc(com.google.android.gms.auth.api.signin.zzc arg1) {
            this();
        }

        private zzc() {
            super();
        }

        public final Object convert(Result arg1) {
            return ((GoogleSignInResult)arg1).getSignInAccount();
        }
    }

    @VisibleForTesting final class zzd {
        public static final enum int zzau = 1;
        public static final enum int zzav = 2;
        public static final enum int zzaw = 3;
        public static final enum int zzax = 4;

        static {
            zzd.zzay = new int[]{zzd.zzau, zzd.zzav, zzd.zzaw, zzd.zzax};
        }

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0() {
            return zzd.zzay.clone();
        }
    }

    private static final zzc zzar;
    @VisibleForTesting private static int zzas;

    static {
        GoogleSignInClient.zzar = new zzc(null);
        GoogleSignInClient.zzas = zzd.zzau;
    }

    GoogleSignInClient(@NonNull Activity arg3, GoogleSignInOptions arg4) {
        super(arg3, Auth.GOOGLE_SIGN_IN_API, ((ApiOptions)arg4), new ApiExceptionMapper());
    }

    GoogleSignInClient(@NonNull Context arg3, GoogleSignInOptions arg4) {
        super(arg3, Auth.GOOGLE_SIGN_IN_API, ((ApiOptions)arg4), new ApiExceptionMapper());
    }

    @NonNull public Intent getSignInIntent() {
        Context v0 = this.getApplicationContext();
        switch(com.google.android.gms.auth.api.signin.zzc.zzat[this.zze() - 1]) {
            case 1: {
                goto label_12;
            }
            case 2: {
                goto label_9;
            }
        }

        return zzh.zze(v0, this.getApiOptions());
    label_9:
        return zzh.zzc(v0, this.getApiOptions());
    label_12:
        return zzh.zzd(v0, this.getApiOptions());
    }

    public Task revokeAccess() {
        GoogleApiClient v0 = this.asGoogleApiClient();
        Context v1 = this.getApplicationContext();
        boolean v2 = this.zze() == zzd.zzaw ? true : false;
        return PendingResultUtil.toVoidTask(zzh.zzd(v0, v1, v2));
    }

    public Task signOut() {
        GoogleApiClient v0 = this.asGoogleApiClient();
        Context v1 = this.getApplicationContext();
        boolean v2 = this.zze() == zzd.zzaw ? true : false;
        return PendingResultUtil.toVoidTask(zzh.zzc(v0, v1, v2));
    }

    public Task silentSignIn() {
        GoogleApiClient v0 = this.asGoogleApiClient();
        Context v1 = this.getApplicationContext();
        ApiOptions v2 = this.getApiOptions();
        boolean v3 = this.zze() == zzd.zzaw ? true : false;
        return PendingResultUtil.toTask(zzh.zzc(v0, v1, ((GoogleSignInOptions)v2), v3), GoogleSignInClient.zzar);
    }

    private final int zze() {
        int v0_2;
        __monitor_enter(this);
        try {
            if(GoogleSignInClient.zzas == zzd.zzau) {
                Context v0_1 = this.getApplicationContext();
                GoogleApiAvailability v1 = GoogleApiAvailability.getInstance();
                int v2 = v1.isGooglePlayServicesAvailable(v0_1, 12451000);
                if(v2 == 0) {
                    GoogleSignInClient.zzas = zzd.zzax;
                }
                else {
                    if(v1.getErrorResolutionIntent(v0_1, v2, null) == null && DynamiteModule.getLocalVersion(v0_1, "com.google.android.gms.auth.api.fallback") != 0) {
                        GoogleSignInClient.zzas = zzd.zzaw;
                        goto label_23;
                    }

                    GoogleSignInClient.zzas = zzd.zzav;
                }
            }

        label_23:
            v0_2 = GoogleSignInClient.zzas;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_2;
    }
}

