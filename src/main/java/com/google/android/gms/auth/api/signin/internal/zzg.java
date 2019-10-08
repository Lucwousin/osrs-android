package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Iterator;

public final class zzg extends GmsClient {
    private final GoogleSignInOptions zzbi;

    public zzg(Context arg8, Looper arg9, ClientSettings arg10, GoogleSignInOptions arg11, ConnectionCallbacks arg12, OnConnectionFailedListener arg13) {
        super(arg8, arg9, 91, arg10, arg12, arg13);
        if(arg11 != null) {
        }
        else {
            arg11 = new Builder().build();
        }

        if(!arg10.getAllRequestedScopes().isEmpty()) {
            Builder v8 = new Builder(arg11);
            Iterator v9 = arg10.getAllRequestedScopes().iterator();
            while(v9.hasNext()) {
                v8.requestScopes(v9.next(), new Scope[0]);
            }

            arg11 = v8.build();
        }

        this.zzbi = arg11;
    }

    protected final IInterface createServiceInterface(IBinder arg3) {
        if(arg3 == null) {
            return null;
        }

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if((v0 instanceof zzu)) {
            return v0;
        }

        return new zzv(arg3);
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return zzh.zzc(this.getContext(), this.zzbi);
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return 1;
    }

    public final GoogleSignInOptions zzg() {
        return this.zzbi;
    }
}

