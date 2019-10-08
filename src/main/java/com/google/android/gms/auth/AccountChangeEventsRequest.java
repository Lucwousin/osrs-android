package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="AccountChangeEventsRequestCreator") public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zze;
    @Field(id=3) @Deprecated private String zzg;
    @Field(id=2) private int zzi;
    @Field(id=4) private Account zzk;

    static {
        AccountChangeEventsRequest.CREATOR = new zzb();
    }

    @Constructor AccountChangeEventsRequest(@Param(id=1) int arg1, @Param(id=2) int arg2, @Param(id=3) String arg3, @Param(id=4) Account arg4) {
        super();
        this.zze = arg1;
        this.zzi = arg2;
        this.zzg = arg3;
        if(arg4 == null && !TextUtils.isEmpty(((CharSequence)arg3))) {
            this.zzk = new Account(arg3, "com.google");
            return;
        }

        this.zzk = arg4;
    }

    public AccountChangeEventsRequest() {
        super();
        this.zze = 1;
    }

    public Account getAccount() {
        return this.zzk;
    }

    @Deprecated public String getAccountName() {
        return this.zzg;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    public AccountChangeEventsRequest setAccount(Account arg1) {
        this.zzk = arg1;
        return this;
    }

    @Deprecated public AccountChangeEventsRequest setAccountName(String arg1) {
        this.zzg = arg1;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int arg1) {
        this.zzi = arg1;
        return this;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zze);
        SafeParcelWriter.writeInt(arg5, 2, this.zzi);
        SafeParcelWriter.writeString(arg5, 3, this.zzg, false);
        SafeParcelWriter.writeParcelable(arg5, 4, this.zzk, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

