package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk @VisibleForTesting public final class ClientSettings {
    @KeepForSdk public final class Builder {
        private int zabt;
        private View zabu;
        private String zabv;
        private String zabw;
        private Map zaob;
        private SignInOptions zaoc;
        private ArraySet zaoe;
        private Account zax;

        public Builder() {
            super();
            this.zabt = 0;
            this.zaoc = SignInOptions.DEFAULT;
        }

        public final Builder addAllRequiredScopes(Collection arg2) {
            if(this.zaoe == null) {
                this.zaoe = new ArraySet();
            }

            this.zaoe.addAll(arg2);
            return this;
        }

        public final Builder addRequiredScope(Scope arg2) {
            if(this.zaoe == null) {
                this.zaoe = new ArraySet();
            }

            this.zaoe.add(arg2);
            return this;
        }

        @KeepForSdk public final ClientSettings build() {
            return new ClientSettings(this.zax, this.zaoe, this.zaob, this.zabt, this.zabu, this.zabv, this.zabw, this.zaoc);
        }

        public final Builder setAccount(Account arg1) {
            this.zax = arg1;
            return this;
        }

        public final Builder setGravityForPopups(int arg1) {
            this.zabt = arg1;
            return this;
        }

        public final Builder setOptionalApiSettingsMap(Map arg1) {
            this.zaob = arg1;
            return this;
        }

        public final Builder setRealClientClassName(String arg1) {
            this.zabw = arg1;
            return this;
        }

        @KeepForSdk public final Builder setRealClientPackageName(String arg1) {
            this.zabv = arg1;
            return this;
        }

        public final Builder setSignInOptions(SignInOptions arg1) {
            this.zaoc = arg1;
            return this;
        }

        public final Builder setViewForPopups(View arg1) {
            this.zabu = arg1;
            return this;
        }
    }

    public final class OptionalApiSettings {
        public final Set mScopes;

        public OptionalApiSettings(Set arg1) {
            super();
            Preconditions.checkNotNull(arg1);
            this.mScopes = Collections.unmodifiableSet(arg1);
        }
    }

    public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
    private final Set zabr;
    private final int zabt;
    private final View zabu;
    private final String zabv;
    private final String zabw;
    private final Set zaoa;
    private final Map zaob;
    private final SignInOptions zaoc;
    private Integer zaod;
    private final Account zax;

    public ClientSettings(Account arg1, Set arg2, Map arg3, int arg4, View arg5, String arg6, String arg7, SignInOptions arg8) {
        super();
        this.zax = arg1;
        Set v1 = arg2 == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(arg2);
        this.zabr = v1;
        if(arg3 == null) {
            arg3 = Collections.EMPTY_MAP;
        }

        this.zaob = arg3;
        this.zabu = arg5;
        this.zabt = arg4;
        this.zabv = arg6;
        this.zabw = arg7;
        this.zaoc = arg8;
        HashSet v1_1 = new HashSet(this.zabr);
        Iterator v2 = this.zaob.values().iterator();
        while(v2.hasNext()) {
            ((Set)v1_1).addAll(v2.next().mScopes);
        }

        this.zaoa = Collections.unmodifiableSet(((Set)v1_1));
    }

    @KeepForSdk public static ClientSettings createDefault(Context arg1) {
        return new com.google.android.gms.common.api.GoogleApiClient$Builder(arg1).buildClientSettings();
    }

    @KeepForSdk @Nullable public final Account getAccount() {
        return this.zax;
    }

    @KeepForSdk @Deprecated @Nullable public final String getAccountName() {
        if(this.zax != null) {
            return this.zax.name;
        }

        return null;
    }

    @KeepForSdk public final Account getAccountOrDefault() {
        if(this.zax != null) {
            return this.zax;
        }

        return new Account("<<default account>>", "com.google");
    }

    @KeepForSdk public final Set getAllRequestedScopes() {
        return this.zaoa;
    }

    @KeepForSdk public final Set getApplicableScopes(Api arg3) {
        Object v3 = this.zaob.get(arg3);
        if(v3 != null) {
            if(((OptionalApiSettings)v3).mScopes.isEmpty()) {
            }
            else {
                HashSet v0 = new HashSet(this.zabr);
                ((Set)v0).addAll(((OptionalApiSettings)v3).mScopes);
                return ((Set)v0);
            }
        }

        return this.zabr;
    }

    @Nullable public final Integer getClientSessionId() {
        return this.zaod;
    }

    @KeepForSdk public final int getGravityForPopups() {
        return this.zabt;
    }

    public final Map getOptionalApiSettings() {
        return this.zaob;
    }

    @Nullable public final String getRealClientClassName() {
        return this.zabw;
    }

    @KeepForSdk @Nullable public final String getRealClientPackageName() {
        return this.zabv;
    }

    @KeepForSdk public final Set getRequiredScopes() {
        return this.zabr;
    }

    @Nullable public final SignInOptions getSignInOptions() {
        return this.zaoc;
    }

    @KeepForSdk @Nullable public final View getViewForPopups() {
        return this.zabu;
    }

    public final void setClientSessionId(Integer arg1) {
        this.zaod = arg1;
    }
}

