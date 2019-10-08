package com.google.android.gms.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;

public final class SignInOptions implements Optional {
    public final class zaa {
        public zaa() {
            super();
        }
    }

    public static final SignInOptions DEFAULT;
    private final boolean zaaa;
    private final String zaab;
    private final String zaac;
    private final boolean zars;
    private final boolean zart;
    private final Long zaru;
    private final Long zarv;
    private final boolean zay;

    static {
        new zaa();
        SignInOptions.DEFAULT = new SignInOptions(false, false, null, false, null, false, null, null);
    }

    private SignInOptions(boolean arg1, boolean arg2, String arg3, boolean arg4, String arg5, boolean arg6, Long arg7, Long arg8) {
        super();
        this.zars = false;
        this.zay = false;
        this.zaab = null;
        this.zaaa = false;
        this.zart = false;
        this.zaac = null;
        this.zaru = null;
        this.zarv = null;
    }

    @Nullable public final Long getAuthApiSignInModuleVersion() {
        return this.zaru;
    }

    @Nullable public final String getHostedDomain() {
        return this.zaac;
    }

    @Nullable public final Long getRealClientLibraryVersion() {
        return this.zarv;
    }

    public final String getServerClientId() {
        return this.zaab;
    }

    public final boolean isForceCodeForRefreshToken() {
        return this.zaaa;
    }

    public final boolean isIdTokenRequested() {
        return this.zay;
    }

    public final boolean isOfflineAccessRequested() {
        return this.zars;
    }

    public final boolean waitForAccessTokenRefresh() {
        return this.zart;
    }
}

