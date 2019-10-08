package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzp {
    private static zzp zzbn;
    @VisibleForTesting private Storage zzbo;
    @VisibleForTesting private GoogleSignInAccount zzbp;
    @VisibleForTesting private GoogleSignInOptions zzbq;

    static {
    }

    private zzp(Context arg1) {
        super();
        this.zzbo = Storage.getInstance(arg1);
        this.zzbp = this.zzbo.getSavedDefaultGoogleSignInAccount();
        this.zzbq = this.zzbo.getSavedDefaultGoogleSignInOptions();
    }

    public final void clear() {
        __monitor_enter(this);
        try {
            this.zzbo.clear();
            this.zzbp = null;
            this.zzbq = null;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public final void zzc(GoogleSignInOptions arg2, GoogleSignInAccount arg3) {
        __monitor_enter(this);
        try {
            this.zzbo.saveDefaultGoogleSignInAccount(arg3, arg2);
            this.zzbp = arg3;
            this.zzbq = arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public static zzp zzd(@NonNull Context arg1) {
        zzp v1_1;
        Class v0 = zzp.class;
        __monitor_enter(v0);
        try {
            v1_1 = zzp.zze(arg1.getApplicationContext());
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }

    private static zzp zze(Context arg2) {
        zzp v2_1;
        Class v0 = zzp.class;
        __monitor_enter(v0);
        try {
            if(zzp.zzbn == null) {
                zzp.zzbn = new zzp(arg2);
            }

            v2_1 = zzp.zzbn;
        }
        catch(Throwable v2) {
            __monitor_exit(v0);
            throw v2;
        }

        __monitor_exit(v0);
        return v2_1;
    }

    public final GoogleSignInAccount zzh() {
        GoogleSignInAccount v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzbp;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final GoogleSignInOptions zzi() {
        GoogleSignInOptions v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzbq;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }
}

