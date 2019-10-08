package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Class(creator="CredentialPickerConfigCreator") public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public class Builder {
        private boolean mShowCancelButton;
        private boolean zzv;
        private int zzy;

        public Builder() {
            super();
            this.zzv = false;
            this.mShowCancelButton = true;
            this.zzy = 1;
        }

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this, null);
        }

        @Deprecated public Builder setForNewAccount(boolean arg1) {
            int v1 = arg1 ? 3 : 1;
            this.zzy = v1;
            return this;
        }

        public Builder setPrompt(int arg1) {
            this.zzy = arg1;
            return this;
        }

        public Builder setShowAddAccountButton(boolean arg1) {
            this.zzv = arg1;
            return this;
        }

        public Builder setShowCancelButton(boolean arg1) {
            this.mShowCancelButton = arg1;
            return this;
        }

        static boolean zzc(Builder arg0) {
            return arg0.zzv;
        }

        static boolean zzd(Builder arg0) {
            return arg0.mShowCancelButton;
        }

        static int zze(Builder arg0) {
            return arg0.zzy;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;

    }

    public static final Parcelable$Creator CREATOR;
    @Field(getter="shouldShowCancelButton", id=2) private final boolean mShowCancelButton;
    @Field(id=1000) private final int zzu;
    @Field(getter="shouldShowAddAccountButton", id=1) private final boolean zzv;
    @Field(getter="isForNewAccount", id=3) @Deprecated private final boolean zzw;
    @Field(getter="getPromptInternalId", id=4) private final int zzx;

    static {
        CredentialPickerConfig.CREATOR = new zze();
    }

    @Constructor CredentialPickerConfig(@Param(id=1000) int arg2, @Param(id=1) boolean arg3, @Param(id=2) boolean arg4, @Param(id=3) boolean arg5, @Param(id=4) int arg6) {
        super();
        this.zzu = arg2;
        this.zzv = arg3;
        this.mShowCancelButton = arg4;
        int v3 = 1;
        int v4 = 3;
        if(arg2 < 2) {
            this.zzw = arg5;
            if(arg5) {
                v3 = 3;
            }

            this.zzx = v3;
            return;
        }

        if(arg6 == v4) {
        }
        else {
            arg3 = false;
        }

        this.zzw = ((boolean)v3);
        this.zzx = arg6;
    }

    private CredentialPickerConfig(Builder arg7) {
        this(2, Builder.zzc(arg7), Builder.zzd(arg7), false, Builder.zze(arg7));
    }

    CredentialPickerConfig(Builder arg1, zzd arg2) {
        this(arg1);
    }

    @Deprecated public final boolean isForNewAccount() {
        if(this.zzx == 3) {
            return 1;
        }

        return 0;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzv;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    public final void writeToParcel(Parcel arg3, int arg4) {
        arg4 = SafeParcelWriter.beginObjectHeader(arg3);
        SafeParcelWriter.writeBoolean(arg3, 1, this.shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(arg3, 2, this.shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(arg3, 3, this.isForNewAccount());
        SafeParcelWriter.writeInt(arg3, 4, this.zzx);
        SafeParcelWriter.writeInt(arg3, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(arg3, arg4);
    }
}

