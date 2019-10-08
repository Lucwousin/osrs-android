package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;
import javax.annotation.Nullable;

@Class(creator="SignInAccountCreator") @Reserved(value={1}) public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(defaultValue="", id=4) @Deprecated private String zzba;
    @Field(getter="getGoogleSignInAccount", id=7) private GoogleSignInAccount zzbb;
    @Field(defaultValue="", id=8) @Deprecated private String zzbc;

    static {
        SignInAccount.CREATOR = new zzd();
    }

    @Constructor SignInAccount(@Param(id=4) String arg1, @Param(id=7) GoogleSignInAccount arg2, @Param(id=8) String arg3) {
        super();
        this.zzbb = arg2;
        this.zzba = Preconditions.checkNotEmpty(arg1, "8.3 and 8.4 SDKs require non-null email");
        this.zzbc = Preconditions.checkNotEmpty(arg3, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzbb;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeString(arg5, 4, this.zzba, false);
        SafeParcelWriter.writeParcelable(arg5, 7, this.zzbb, arg6, false);
        SafeParcelWriter.writeString(arg5, 8, this.zzbc, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

