package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Class(creator="CredentialRequestCreator") public final class CredentialRequest extends AbstractSafeParcelable {
    public final class Builder {
        private String[] zzaa;
        private CredentialPickerConfig zzab;
        private CredentialPickerConfig zzac;
        private boolean zzad;
        @Nullable private String zzae;
        @Nullable private String zzaf;
        private boolean zzag;
        private boolean zzz;

        public Builder() {
            super();
            this.zzad = false;
            this.zzag = false;
            this.zzae = null;
        }

        public final CredentialRequest build() {
            if(this.zzaa == null) {
                this.zzaa = new String[0];
            }

            if(!this.zzz) {
                if(this.zzaa.length != 0) {
                }
                else {
                    throw new IllegalStateException("At least one authentication method must be specified");
                }
            }

            return new CredentialRequest(this, null);
        }

        public final Builder setAccountTypes(String[] arg1) {
            if(arg1 == null) {
                arg1 = new String[0];
            }

            this.zzaa = arg1;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig arg1) {
            this.zzac = arg1;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig arg1) {
            this.zzab = arg1;
            return this;
        }

        public final Builder setIdTokenNonce(@Nullable String arg1) {
            this.zzaf = arg1;
            return this;
        }

        public final Builder setIdTokenRequested(boolean arg1) {
            this.zzad = arg1;
            return this;
        }

        public final Builder setPasswordLoginSupported(boolean arg1) {
            this.zzz = arg1;
            return this;
        }

        public final Builder setServerClientId(@Nullable String arg1) {
            this.zzae = arg1;
            return this;
        }

        @Deprecated public final Builder setSupportsPasswordLogin(boolean arg1) {
            return this.setPasswordLoginSupported(arg1);
        }

        static boolean zzc(Builder arg0) {
            return arg0.zzz;
        }

        static String[] zzd(Builder arg0) {
            return arg0.zzaa;
        }

        static CredentialPickerConfig zze(Builder arg0) {
            return arg0.zzab;
        }

        static CredentialPickerConfig zzf(Builder arg0) {
            return arg0.zzac;
        }

        static boolean zzg(Builder arg0) {
            return arg0.zzad;
        }

        static String zzh(Builder arg0) {
            return arg0.zzae;
        }

        static String zzi(Builder arg0) {
            return arg0.zzaf;
        }
    }

    public static final Parcelable$Creator CREATOR;
    @Field(getter="getAccountTypes", id=2) private final String[] zzaa;
    @Field(getter="getCredentialPickerConfig", id=3) private final CredentialPickerConfig zzab;
    @Field(getter="getCredentialHintPickerConfig", id=4) private final CredentialPickerConfig zzac;
    @Field(getter="isIdTokenRequested", id=5) private final boolean zzad;
    @Field(getter="getServerClientId", id=6) private final String zzae;
    @Field(getter="getIdTokenNonce", id=7) private final String zzaf;
    @Field(getter="getRequireUserMediation", id=8) private final boolean zzag;
    @Field(id=1000) private final int zzu;
    @Field(getter="isPasswordLoginSupported", id=1) private final boolean zzz;

    static {
        CredentialRequest.CREATOR = new zzg();
    }

    @Constructor CredentialRequest(@Param(id=1000) int arg1, @Param(id=1) boolean arg2, @Param(id=2) String[] arg3, @Param(id=3) CredentialPickerConfig arg4, @Param(id=4) CredentialPickerConfig arg5, @Param(id=5) boolean arg6, @Param(id=6) String arg7, @Param(id=7) String arg8, @Param(id=8) boolean arg9) {
        super();
        this.zzu = arg1;
        this.zzz = arg2;
        this.zzaa = Preconditions.checkNotNull(arg3);
        if(arg4 == null) {
            arg4 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
        }

        this.zzab = arg4;
        if(arg5 == null) {
            arg5 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
        }

        this.zzac = arg5;
        if(arg1 < 3) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
        }
        else {
            this.zzad = arg6;
            this.zzae = arg7;
            this.zzaf = arg8;
        }

        this.zzag = arg9;
    }

    private CredentialRequest(Builder arg11) {
        this(4, Builder.zzc(arg11), Builder.zzd(arg11), Builder.zze(arg11), Builder.zzf(arg11), Builder.zzg(arg11), Builder.zzh(arg11), Builder.zzi(arg11), false);
    }

    CredentialRequest(Builder arg1, zzf arg2) {
        this(arg1);
    }

    @NonNull public final String[] getAccountTypes() {
        return this.zzaa;
    }

    @NonNull public final Set getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzaa));
    }

    @NonNull public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzac;
    }

    @NonNull public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzab;
    }

    @Nullable public final String getIdTokenNonce() {
        return this.zzaf;
    }

    @Nullable public final String getServerClientId() {
        return this.zzae;
    }

    @Deprecated public final boolean getSupportsPasswordLogin() {
        return this.isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzz;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeBoolean(arg5, 1, this.isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(arg5, 2, this.getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.getCredentialPickerConfig(), arg6, false);
        SafeParcelWriter.writeParcelable(arg5, 4, this.getCredentialHintPickerConfig(), arg6, false);
        SafeParcelWriter.writeBoolean(arg5, 5, this.isIdTokenRequested());
        SafeParcelWriter.writeString(arg5, 6, this.getServerClientId(), false);
        SafeParcelWriter.writeString(arg5, 7, this.getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(arg5, 1000, this.zzu);
        SafeParcelWriter.writeBoolean(arg5, 8, this.zzag);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

