package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.Collections;
import java.util.List;

final class zzd extends AbstractClientBuilder {
    zzd() {
        super();
    }

    public final Client buildClient(Context arg8, Looper arg9, ClientSettings arg10, @Nullable Object arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        return new zzg(arg8, arg9, arg10, arg11, arg12, arg13);
    }

    public final List getImpliedScopes(@Nullable Object arg1) {
        if(arg1 == null) {
            return Collections.emptyList();
        }

        return ((GoogleSignInOptions)arg1).getScopes();
    }
}

