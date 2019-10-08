package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.List;

@Class(creator="AccountChangeEventsResponseCreator") public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zze;
    @Field(id=2) private final List zzl;

    static {
        AccountChangeEventsResponse.CREATOR = new zzc();
    }

    @Constructor AccountChangeEventsResponse(@Param(id=1) int arg1, @Param(id=2) List arg2) {
        super();
        this.zze = arg1;
        this.zzl = Preconditions.checkNotNull(arg2);
    }

    public AccountChangeEventsResponse(List arg2) {
        super();
        this.zze = 1;
        this.zzl = Preconditions.checkNotNull(arg2);
    }

    public List getEvents() {
        return this.zzl;
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zze);
        SafeParcelWriter.writeTypedList(arg4, 2, this.zzl, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

