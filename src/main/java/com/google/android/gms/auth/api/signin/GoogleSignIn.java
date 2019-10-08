package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.auth.api.signin.internal.zzp;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class GoogleSignIn {
    private GoogleSignIn() {
        super();
    }

    @NonNull public static GoogleSignInAccount getAccountForExtension(@NonNull Context arg1, @NonNull GoogleSignInOptionsExtension arg2) {
        Preconditions.checkNotNull(arg1, "please provide a valid Context object");
        Preconditions.checkNotNull(arg2, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount v1 = GoogleSignIn.getLastSignedInAccount(arg1);
        if(v1 == null) {
            v1 = GoogleSignInAccount.createDefault();
        }

        return v1.requestExtraScopes(GoogleSignIn.zzc(arg2.getImpliedScopes()));
    }

    @NonNull public static GoogleSignInAccount getAccountForScopes(@NonNull Context arg2, @NonNull Scope arg3, Scope[] arg4) {
        Preconditions.checkNotNull(arg2, "please provide a valid Context object");
        Preconditions.checkNotNull(arg3, "please provide at least one valid scope");
        GoogleSignInAccount v2 = GoogleSignIn.getLastSignedInAccount(arg2);
        if(v2 == null) {
            v2 = GoogleSignInAccount.createDefault();
        }

        v2.requestExtraScopes(new Scope[]{arg3});
        v2.requestExtraScopes(arg4);
        return v2;
    }

    public static GoogleSignInClient getClient(@NonNull Activity arg1, @NonNull GoogleSignInOptions arg2) {
        return new GoogleSignInClient(arg1, Preconditions.checkNotNull(arg2));
    }

    public static GoogleSignInClient getClient(@NonNull Context arg1, @NonNull GoogleSignInOptions arg2) {
        return new GoogleSignInClient(arg1, Preconditions.checkNotNull(arg2));
    }

    @Nullable public static GoogleSignInAccount getLastSignedInAccount(Context arg0) {
        return zzp.zzd(arg0).zzh();
    }

    public static Task getSignedInAccountFromIntent(@Nullable Intent arg1) {
        GoogleSignInResult v1 = zzh.getSignInResultFromIntent(arg1);
        if(v1 == null) {
            return Tasks.forException(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }

        if(v1.getStatus().isSuccess()) {
            if(v1.getSignInAccount() == null) {
            }
            else {
                return Tasks.forResult(v1.getSignInAccount());
            }
        }

        return Tasks.forException(ApiExceptionUtil.fromStatus(v1.getStatus()));
    }

    public static boolean hasPermissions(@Nullable GoogleSignInAccount arg1, @NonNull GoogleSignInOptionsExtension arg2) {
        Preconditions.checkNotNull(arg2, "Please provide a non-null GoogleSignInOptionsExtension");
        return GoogleSignIn.hasPermissions(arg1, GoogleSignIn.zzc(arg2.getImpliedScopes()));
    }

    public static boolean hasPermissions(@Nullable GoogleSignInAccount arg1, @NonNull Scope[] arg2) {
        if(arg1 == null) {
            return 0;
        }

        HashSet v0 = new HashSet();
        Collections.addAll(((Collection)v0), ((Object[])arg2));
        return arg1.getGrantedScopes().containsAll(((Collection)v0));
    }

    public static void requestPermissions(@NonNull Activity arg1, int arg2, @Nullable GoogleSignInAccount arg3, @NonNull GoogleSignInOptionsExtension arg4) {
        Preconditions.checkNotNull(arg1, "Please provide a non-null Activity");
        Preconditions.checkNotNull(arg4, "Please provide a non-null GoogleSignInOptionsExtension");
        GoogleSignIn.requestPermissions(arg1, arg2, arg3, GoogleSignIn.zzc(arg4.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Activity arg1, int arg2, @Nullable GoogleSignInAccount arg3, @NonNull Scope[] arg4) {
        Preconditions.checkNotNull(arg1, "Please provide a non-null Activity");
        Preconditions.checkNotNull(arg4, "Please provide at least one scope");
        arg1.startActivityForResult(GoogleSignIn.zzc(arg1, arg3, arg4), arg2);
    }

    public static void requestPermissions(@NonNull Fragment arg1, int arg2, @Nullable GoogleSignInAccount arg3, @NonNull GoogleSignInOptionsExtension arg4) {
        Preconditions.checkNotNull(arg1, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(arg4, "Please provide a non-null GoogleSignInOptionsExtension");
        GoogleSignIn.requestPermissions(arg1, arg2, arg3, GoogleSignIn.zzc(arg4.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Fragment arg1, int arg2, @Nullable GoogleSignInAccount arg3, @NonNull Scope[] arg4) {
        Preconditions.checkNotNull(arg1, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(arg4, "Please provide at least one scope");
        arg1.startActivityForResult(GoogleSignIn.zzc(arg1.getActivity(), arg3, arg4), arg2);
    }

    @NonNull private static Scope[] zzc(@Nullable List arg1) {
        if(arg1 == null) {
            return new Scope[0];
        }

        return arg1.toArray(new Scope[arg1.size()]);
    }

    @NonNull private static Intent zzc(@NonNull Activity arg2, @Nullable GoogleSignInAccount arg3, @NonNull Scope[] arg4) {
        Builder v0 = new Builder();
        if(arg4.length > 0) {
            v0.requestScopes(arg4[0], arg4);
        }

        if(arg3 != null && !TextUtils.isEmpty(arg3.getEmail())) {
            v0.setAccountName(arg3.getEmail());
        }

        return new GoogleSignInClient(arg2, v0.build()).getSignInIntent();
    }
}

