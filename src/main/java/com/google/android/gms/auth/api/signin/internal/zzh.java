package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;

public final class zzh {
    private static Logger zzbd;

    static {
        zzh.zzbd = new Logger("GoogleSignInCommon", new String[0]);
    }

    @Nullable public static GoogleSignInResult getSignInResultFromIntent(Intent arg2) {
        if(arg2 != null && ((arg2.hasExtra("googleSignInStatus")) || (arg2.hasExtra("googleSignInAccount")))) {
            Parcelable v0 = arg2.getParcelableExtra("googleSignInAccount");
            Parcelable v2 = arg2.getParcelableExtra("googleSignInStatus");
            if(v0 != null) {
                Status v2_1 = Status.RESULT_SUCCESS;
            }

            return new GoogleSignInResult(((GoogleSignInAccount)v0), ((Status)v2));
        }

        return null;
    }

    public static Intent zzc(Context arg3, GoogleSignInOptions arg4) {
        zzh.zzbd.d("getSignInIntent()", new Object[0]);
        SignInConfiguration v0 = new SignInConfiguration(arg3.getPackageName(), arg4);
        Intent v4 = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        v4.setPackage(arg3.getPackageName());
        v4.setClass(arg3, SignInHubActivity.class);
        Bundle v3 = new Bundle();
        v3.putParcelable("config", ((Parcelable)v0));
        v4.putExtra("config", v3);
        return v4;
    }

    public static OptionalPendingResult zzc(GoogleApiClient arg5, Context arg6, GoogleSignInOptions arg7, boolean arg8) {
        GoogleSignInResult v3_2;
        boolean v3_1;
        zzh.zzbd.d("silentSignIn()", new Object[0]);
        zzh.zzbd.d("getEligibleSavedSignInResult()", new Object[0]);
        Preconditions.checkNotNull(arg7);
        GoogleSignInOptions v0 = zzp.zzd(arg6).zzi();
        GoogleSignInAccount v1 = null;
        if(v0 != null) {
            Account v3 = v0.getAccount();
            Account v4 = arg7.getAccount();
            if(v3 != null) {
                v3_1 = v3.equals(v4);
            }
            else if(v4 == null) {
                v3_1 = true;
            }
            else {
                v3_1 = false;
            }

            if(!v3_1) {
                goto label_51;
            }

            if(arg7.isServerAuthCodeRequested()) {
                goto label_51;
            }

            if(arg7.isIdTokenRequested()) {
                if(!v0.isIdTokenRequested()) {
                }
                else if(arg7.getServerClientId().equals(v0.getServerClientId())) {
                    goto label_34;
                }

                goto label_51;
            }

        label_34:
            if(!new HashSet(v0.getScopes()).containsAll(new HashSet(arg7.getScopes()))) {
                goto label_51;
            }

            GoogleSignInAccount v0_1 = zzp.zzd(arg6).zzh();
            if(v0_1 == null) {
                goto label_51;
            }

            if(v0_1.isExpired()) {
                goto label_51;
            }

            v3_2 = new GoogleSignInResult(v0_1, Status.RESULT_SUCCESS);
        }
        else {
        label_51:
            v3_2 = ((GoogleSignInResult)v1);
        }

        if(v3_2 != null) {
            zzh.zzbd.d("Eligible saved sign in result found", new Object[0]);
            return PendingResults.immediatePendingResult(((Result)v3_2), arg5);
        }

        if(arg8) {
            return PendingResults.immediatePendingResult(new GoogleSignInResult(v1, new Status(4)), arg5);
        }

        zzh.zzbd.d("trySilentSignIn()", new Object[0]);
        return new OptionalPendingResultImpl(arg5.enqueue(new zzi(arg5, arg6, arg7)));
    }

    public static PendingResult zzc(GoogleApiClient arg3, Context arg4, boolean arg5) {
        zzh.zzbd.d("Signing out", new Object[0]);
        zzh.zzc(arg4);
        if(arg5) {
            return PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, arg3);
        }

        return arg3.execute(new zzk(arg3));
    }

    private static void zzc(Context arg1) {
        zzp.zzd(arg1).clear();
        Iterator v1 = GoogleApiClient.getAllClients().iterator();
        while(v1.hasNext()) {
            v1.next().maybeSignOut();
        }

        GoogleApiManager.reportSignOut();
    }

    public static Intent zzd(Context arg3, GoogleSignInOptions arg4) {
        zzh.zzbd.d("getFallbackSignInIntent()", new Object[0]);
        Intent v3 = zzh.zzc(arg3, arg4);
        v3.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return v3;
    }

    public static PendingResult zzd(GoogleApiClient arg3, Context arg4, boolean arg5) {
        zzh.zzbd.d("Revoking access", new Object[0]);
        String v0 = Storage.getInstance(arg4).getSavedRefreshToken();
        zzh.zzc(arg4);
        if(arg5) {
            return zzd.zzc(v0);
        }

        return arg3.execute(new zzm(arg3));
    }

    public static Intent zze(Context arg3, GoogleSignInOptions arg4) {
        zzh.zzbd.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent v3 = zzh.zzc(arg3, arg4);
        v3.setAction("com.google.android.gms.auth.NO_IMPL");
        return v3;
    }
}

