package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

@Class(creator="AuthAccountRequestCreator") public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(id=2) @Deprecated private final IBinder zanw;
    @Field(id=3) private final Scope[] zanx;
    @Field(id=4) private Integer zany;
    @Field(id=5) private Integer zanz;
    @Field(id=6, type="android.accounts.Account") private Account zax;

    static {
        AuthAccountRequest.CREATOR = new zaa();
    }

    @Constructor AuthAccountRequest(@Param(id=1) int arg1, @Param(id=2) IBinder arg2, @Param(id=3) Scope[] arg3, @Param(id=4) Integer arg4, @Param(id=5) Integer arg5, @Param(id=6) Account arg6) {
        super();
        this.zale = arg1;
        this.zanw = arg2;
        this.zanx = arg3;
        this.zany = arg4;
        this.zanz = arg5;
        this.zax = arg6;
    }

    public AuthAccountRequest(Account arg8, Set arg9) {
        this(3, null, arg9.toArray(new Scope[arg9.size()]), null, null, Preconditions.checkNotNull(arg8));
    }

    @Deprecated public AuthAccountRequest(IAccountAccessor arg8, Set arg9) {
        this(3, arg8.asBinder(), arg9.toArray(new Scope[arg9.size()]), null, null, null);
    }

    public Account getAccount() {
        Account v0;
        if(this.zax != null) {
            v0 = this.zax;
        }
        else if(this.zanw != null) {
            v0 = AccountAccessor.getAccountBinderSafe(Stub.asInterface(this.zanw));
        }
        else {
            v0 = null;
        }

        return v0;
    }

    @Nullable public Integer getOauthPolicy() {
        return this.zany;
    }

    @Nullable public Integer getPolicyAction() {
        return this.zanz;
    }

    public Set getScopes() {
        return new HashSet(Arrays.asList(this.zanx));
    }

    public AuthAccountRequest setOauthPolicy(@Nullable Integer arg1) {
        this.zany = arg1;
        return this;
    }

    public AuthAccountRequest setPolicyAction(@Nullable Integer arg1) {
        this.zanz = arg1;
        return this;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeIBinder(arg5, 2, this.zanw, false);
        SafeParcelWriter.writeTypedArray(arg5, 3, this.zanx, arg6, false);
        SafeParcelWriter.writeIntegerObject(arg5, 4, this.zany, false);
        SafeParcelWriter.writeIntegerObject(arg5, 5, this.zanz, false);
        SafeParcelWriter.writeParcelable(arg5, 6, this.zax, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

