package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;

public final class zzf implements GoogleSignInApi {
    public zzf() {
        super();
    }

    public final Intent getSignInIntent(GoogleApiClient arg2) {
        return zzh.zzc(arg2.getContext(), zzf.zzc(arg2));
    }

    public final GoogleSignInResult getSignInResultFromIntent(Intent arg1) {
        return zzh.getSignInResultFromIntent(arg1);
    }

    public final PendingResult revokeAccess(GoogleApiClient arg3) {
        return zzh.zzd(arg3, arg3.getContext(), false);
    }

    public final PendingResult signOut(GoogleApiClient arg3) {
        return zzh.zzc(arg3, arg3.getContext(), false);
    }

    public final OptionalPendingResult silentSignIn(GoogleApiClient arg4) {
        return zzh.zzc(arg4, arg4.getContext(), zzf.zzc(arg4), false);
    }

    private static GoogleSignInOptions zzc(GoogleApiClient arg1) {
        return arg1.getClient(Auth.zzh).zzg();
    }
}

