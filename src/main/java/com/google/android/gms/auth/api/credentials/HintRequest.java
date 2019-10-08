package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;

@Class(creator="HintRequestCreator") public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public final class Builder {
        private String[] zzaa;
        private boolean zzad;
        private String zzae;
        private String zzaf;
        private CredentialPickerConfig zzah;
        private boolean zzai;
        private boolean zzaj;

        public Builder() {
            super();
            this.zzah = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
            this.zzad = false;
        }

        public final HintRequest build() {
            if(this.zzaa == null) {
                this.zzaa = new String[0];
            }

            if(!this.zzai && !this.zzaj) {
                if(this.zzaa.length != 0) {
                }
                else {
                    throw new IllegalStateException("At least one authentication method must be specified");
                }
            }

            return new HintRequest(this, null);
        }

        public final Builder setAccountTypes(String[] arg1) {
            if(arg1 == null) {
                arg1 = new String[0];
            }

            this.zzaa = arg1;
            return this;
        }

        public final Builder setEmailAddressIdentifierSupported(boolean arg1) {
            this.zzai = arg1;
            return this;
        }

        public final Builder setHintPickerConfig(@NonNull CredentialPickerConfig arg1) {
            this.zzah = Preconditions.checkNotNull(arg1);
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

        public final Builder setPhoneNumberIdentifierSupported(boolean arg1) {
            this.zzaj = arg1;
            return this;
        }

        public final Builder setServerClientId(@Nullable String arg1) {
            this.zzae = arg1;
            return this;
        }

        static CredentialPickerConfig zzc(Builder arg0) {
            return arg0.zzah;
        }

        static boolean zzd(Builder arg0) {
            return arg0.zzai;
        }

        static boolean zze(Builder arg0) {
            return arg0.zzaj;
        }

        static String[] zzf(Builder arg0) {
            return arg0.zzaa;
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
    @Field(getter="getAccountTypes", id=4) private final String[] zzaa;
    @Field(getter="isIdTokenRequested", id=5) private final boolean zzad;
    @Field(getter="getServerClientId", id=6) private final String zzae;
    @Field(getter="getIdTokenNonce", id=7) private final String zzaf;
    @Field(getter="getHintPickerConfig", id=1) private final CredentialPickerConfig zzah;
    @Field(getter="isEmailAddressIdentifierSupported", id=2) private final boolean zzai;
    @Field(getter="isPhoneNumberIdentifierSupported", id=3) private final boolean zzaj;
    @Field(id=1000) private final int zzu;

    static {
        HintRequest.CREATOR = new zzj();
    }

    @Constructor HintRequest(@Param(id=1000) int arg1, @Param(id=1) CredentialPickerConfig arg2, @Param(id=2) boolean arg3, @Param(id=3) boolean arg4, @Param(id=4) String[] arg5, @Param(id=5) boolean arg6, @Param(id=6) String arg7, @Param(id=7) String arg8) {
        super();
        this.zzu = arg1;
        this.zzah = Preconditions.checkNotNull(arg2);
        this.zzai = arg3;
        this.zzaj = arg4;
        this.zzaa = Preconditions.checkNotNull(arg5);
        if(this.zzu < 2) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
            return;
        }

        this.zzad = arg6;
        this.zzae = arg7;
        this.zzaf = arg8;
    }

    private HintRequest(Builder arg10) {
        this(2, Builder.zzc(arg10), Builder.zzd(arg10), Builder.zze(arg10), Builder.zzf(arg10), Builder.zzg(arg10), Builder.zzh(arg10), Builder.zzi(arg10));
    }

    HintRequest(Builder arg1, zzi arg2) {
        this(arg1);
    }

    @NonNull public final String[] getAccountTypes() {
        return this.zzaa;
    }

    @NonNull public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzah;
    }

    @Nullable public final String getIdTokenNonce() {
        return this.zzaf;
    }

    @Nullable public final String getServerClientId() {
        return this.zzae;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzai;
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeParcelable(arg5, 1, this.getHintPickerConfig(), arg6, false);
        SafeParcelWriter.writeBoolean(arg5, 2, this.isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(arg5, 3, this.zzaj);
        SafeParcelWriter.writeStringArray(arg5, 4, this.getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(arg5, 5, this.isIdTokenRequested());
        SafeParcelWriter.writeString(arg5, 6, this.getServerClientId(), false);
        SafeParcelWriter.writeString(arg5, 7, this.getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(arg5, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

