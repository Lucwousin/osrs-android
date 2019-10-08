package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="ResolveAccountRequestCreator") public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(getter="getSessionId", id=3) private final int zaoz;
    @Field(getter="getSignInAccountHint", id=4) private final GoogleSignInAccount zapa;
    @Field(getter="getAccount", id=2) private final Account zax;

    static {
        ResolveAccountRequest.CREATOR = new zam();
    }

    @Constructor ResolveAccountRequest(@Param(id=1) int arg1, @Param(id=2) Account arg2, @Param(id=3) int arg3, @Param(id=4) GoogleSignInAccount arg4) {
        super();
        this.zale = arg1;
        this.zax = arg2;
        this.zaoz = arg3;
        this.zapa = arg4;
    }

    public ResolveAccountRequest(Account arg2, int arg3, GoogleSignInAccount arg4) {
        this(2, arg2, arg3, arg4);
    }

    public Account getAccount() {
        return this.zax;
    }

    public int getSessionId() {
        return this.zaoz;
    }

    @Nullable public GoogleSignInAccount getSignInAccountHint() {
        return this.zapa;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcelable(arg5, 2, this.getAccount(), arg6, false);
        SafeParcelWriter.writeInt(arg5, 3, this.getSessionId());
        SafeParcelWriter.writeParcelable(arg5, 4, this.getSignInAccountHint(), arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

