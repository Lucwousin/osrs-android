package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;

public final class CredentialsOptions extends AuthCredentialsOptions {
    public final class Builder extends com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder {
        public Builder() {
            super();
        }

        public final CredentialsOptions build() {
            return new CredentialsOptions(this, null);
        }

        public final com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog() {
            return this.forceEnableSaveDialog();
        }

        public final Builder forceEnableSaveDialog() {
            this.zzn = Boolean.valueOf(true);
            return this;
        }

        public final AuthCredentialsOptions zzc() {
            return this.build();
        }
    }

    public static final CredentialsOptions DEFAULT;

    static {
        CredentialsOptions.DEFAULT = new Builder().zzc();
    }

    private CredentialsOptions(Builder arg1) {
        super(((com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder)arg1));
    }

    CredentialsOptions(Builder arg1, zzh arg2) {
        this(arg1);
    }
}

