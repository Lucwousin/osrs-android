package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.PublicApi;
import java.util.Map;

@PublicApi public class GetTokenResult {
    private static final String AUTH_TIMESTAMP = "auth_time";
    private static final String EXPIRATION_TIMESTAMP = "exp";
    private static final String FIREBASE_KEY = "firebase";
    private static final String ISSUED_AT_TIMESTAMP = "iat";
    private static final String SIGN_IN_PROVIDER = "sign_in_provider";
    private Map claims;
    private String token;

    @KeepForSdk public GetTokenResult(String arg1, Map arg2) {
        super();
        this.token = arg1;
        this.claims = arg2;
    }

    @PublicApi public long getAuthTimestamp() {
        return this.getLongFromClaimsSafely("auth_time");
    }

    @PublicApi public Map getClaims() {
        return this.claims;
    }

    @PublicApi public long getExpirationTimestamp() {
        return this.getLongFromClaimsSafely("exp");
    }

    @PublicApi public long getIssuedAtTimestamp() {
        return this.getLongFromClaimsSafely("iat");
    }

    private long getLongFromClaimsSafely(String arg3) {
        Object v3 = this.claims.get(arg3);
        long v0 = v3 == null ? 0 : ((Integer)v3).longValue();
        return v0;
    }

    @Nullable @PublicApi public String getSignInProvider() {
        Object v0 = this.claims.get("firebase");
        if(v0 != null) {
            return ((Map)v0).get("sign_in_provider");
        }

        return null;
    }

    @Nullable @PublicApi public String getToken() {
        return this.token;
    }
}

