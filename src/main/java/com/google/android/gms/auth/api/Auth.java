package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth-api.zzi;

public final class Auth {
    @Deprecated public class AuthCredentialsOptions implements Optional {
        @Deprecated public class Builder {
            protected Boolean zzn;

            public Builder() {
                super();
                this.zzn = Boolean.valueOf(false);
            }

            public Builder forceEnableSaveDialog() {
                this.zzn = Boolean.valueOf(true);
                return this;
            }

            public AuthCredentialsOptions zzc() {
                return new AuthCredentialsOptions(this);
            }
        }

        private static final AuthCredentialsOptions zzk;
        private final String zzl;
        private final boolean zzm;

        static {
            AuthCredentialsOptions.zzk = new Builder().zzc();
        }

        public AuthCredentialsOptions(Builder arg2) {
            super();
            this.zzl = null;
            this.zzm = arg2.zzn.booleanValue();
        }

        public final Bundle toBundle() {
            Bundle v0 = new Bundle();
            v0.putString("consumer_package", null);
            v0.putBoolean("force_save_dialog", this.zzm);
            return v0;
        }
    }

    public static final Api CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final Api GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi;
    @KeepForSdk @Deprecated public static final Api PROXY_API;
    @KeepForSdk @Deprecated public static final ProxyApi ProxyApi;
    public static final ClientKey zzg;
    public static final ClientKey zzh;
    private static final AbstractClientBuilder zzi;
    private static final AbstractClientBuilder zzj;

    static {
        Auth.zzg = new ClientKey();
        Auth.zzh = new ClientKey();
        Auth.zzi = new zzc();
        Auth.zzj = new zzd();
        Auth.PROXY_API = AuthProxy.API;
        Auth.CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", Auth.zzi, Auth.zzg);
        Auth.GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", Auth.zzj, Auth.zzh);
        Auth.ProxyApi = AuthProxy.ProxyApi;
        Auth.CredentialsApi = new zzi();
        Auth.GoogleSignInApi = new zzf();
    }

    private Auth() {
        super();
    }
}

