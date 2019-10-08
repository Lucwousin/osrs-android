package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api$ApiOptions$HasOptions;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zzw extends zzr {
    private final Context mContext;

    public zzw(Context arg1) {
        super();
        this.mContext = arg1;
    }

    public final void zzj() {
        this.zzl();
        Storage v0 = Storage.getInstance(this.mContext);
        GoogleSignInAccount v1 = v0.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions v2 = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if(v1 != null) {
            v2 = v0.getSavedDefaultGoogleSignInOptions();
        }

        GoogleApiClient v0_1 = new Builder(this.mContext).addApi(Auth.GOOGLE_SIGN_IN_API, ((HasOptions)v2)).build();
        try {
            if(v0_1.blockingConnect().isSuccess()) {
                if(v1 != null) {
                    Auth.GoogleSignInApi.revokeAccess(v0_1);
                }
                else {
                    v0_1.clearDefaultAccountAndReconnect();
                }
            }
        }
        catch(Throwable v1_1) {
            v0_1.disconnect();
            throw v1_1;
        }

        v0_1.disconnect();
    }

    public final void zzk() {
        this.zzl();
        zzp.zzd(this.mContext).clear();
    }

    private final void zzl() {
        if(GooglePlayServicesUtil.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            return;
        }

        int v1 = Binder.getCallingUid();
        StringBuilder v3 = new StringBuilder(52);
        v3.append("Calling UID ");
        v3.append(v1);
        v3.append(" is not Google Play services.");
        throw new SecurityException(v3.toString());
    }
}

