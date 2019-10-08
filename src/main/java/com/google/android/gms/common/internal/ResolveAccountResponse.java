package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="ResolveAccountResponseCreator") public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getConnectionResult", id=3) private ConnectionResult zadh;
    @Field(getter="getSaveDefaultAccount", id=4) private boolean zagf;
    @VersionField(id=1) private final int zale;
    @Field(id=2) private IBinder zanw;
    @Field(getter="isFromCrossClientAuth", id=5) private boolean zapb;

    static {
        ResolveAccountResponse.CREATOR = new zan();
    }

    @Constructor ResolveAccountResponse(@Param(id=1) int arg1, @Param(id=2) IBinder arg2, @Param(id=3) ConnectionResult arg3, @Param(id=4) boolean arg4, @Param(id=5) boolean arg5) {
        super();
        this.zale = arg1;
        this.zanw = arg2;
        this.zadh = arg3;
        this.zagf = arg4;
        this.zapb = arg5;
    }

    public ResolveAccountResponse(int arg3) {
        this(new ConnectionResult(arg3, null));
    }

    public ResolveAccountResponse(ConnectionResult arg7) {
        this(1, null, arg7, false, false);
    }

    public boolean equals(Object arg5) {
        if(this == (((ResolveAccountResponse)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof ResolveAccountResponse)) {
            return 0;
        }

        if((this.zadh.equals(((ResolveAccountResponse)arg5).zadh)) && (this.getAccountAccessor().equals(((ResolveAccountResponse)arg5).getAccountAccessor()))) {
            return 1;
        }

        return 0;
    }

    public IAccountAccessor getAccountAccessor() {
        return Stub.asInterface(this.zanw);
    }

    public ConnectionResult getConnectionResult() {
        return this.zadh;
    }

    public boolean getSaveDefaultAccount() {
        return this.zagf;
    }

    public boolean isFromCrossClientAuth() {
        return this.zapb;
    }

    public ResolveAccountResponse setAccountAccessor(IAccountAccessor arg1) {
        IBinder v1 = arg1 == null ? null : arg1.asBinder();
        this.zanw = v1;
        return this;
    }

    public ResolveAccountResponse setIsFromCrossClientAuth(boolean arg1) {
        this.zapb = arg1;
        return this;
    }

    public ResolveAccountResponse setSaveDefaultAccount(boolean arg1) {
        this.zagf = arg1;
        return this;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeIBinder(arg5, 2, this.zanw, false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.getConnectionResult(), arg6, false);
        SafeParcelWriter.writeBoolean(arg5, 4, this.getSaveDefaultAccount());
        SafeParcelWriter.writeBoolean(arg5, 5, this.isFromCrossClientAuth());
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

