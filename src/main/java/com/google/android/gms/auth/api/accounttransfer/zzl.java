package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Indicator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Class(creator="AccountTransferMsgCreator") public final class zzl extends zzaz {
    public static final Parcelable$Creator CREATOR;
    private static final HashMap zzaz;
    @Indicator private final Set zzba;
    @Field(getter="getAuthenticatorDatas", id=2) private ArrayList zzbb;
    @Field(getter="getRequestType", id=3) private int zzbc;
    @Field(getter="getProgress", id=4) private zzo zzbd;
    @VersionField(id=1) private final int zzv;

    static {
        zzl.CREATOR = new zzm();
        HashMap v0 = new HashMap();
        zzl.zzaz = v0;
        v0.put("authenticatorData", com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteTypeArray("authenticatorData", 2, zzr.class));
        zzl.zzaz.put("progress", com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteType("progress", 4, zzo.class));
    }

    @Constructor zzl(@Indicator Set arg1, @Param(id=1) int arg2, @Param(id=2) ArrayList arg3, @Param(id=3) int arg4, @Param(id=4) zzo arg5) {
        super();
        this.zzba = arg1;
        this.zzv = arg2;
        this.zzbb = arg3;
        this.zzbc = arg4;
        this.zzbd = arg5;
    }

    public zzl() {
        super();
        this.zzba = new HashSet(1);
        this.zzv = 1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg3, String arg4, ArrayList arg5) {
        int v3 = arg3.getSafeParcelableFieldId();
        int v4 = 2;
        if(v3 == v4) {
            this.zzbb = arg5;
            this.zzba.add(Integer.valueOf(v3));
            return;
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(v3), arg5.getClass().getCanonicalName()));
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg3, String arg4, FastJsonResponse arg5) {
        int v3 = arg3.getSafeParcelableFieldId();
        if(v3 == 4) {
            this.zzbd = ((zzo)arg5);
            this.zzba.add(Integer.valueOf(v3));
            return;
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(v3), arg5.getClass().getCanonicalName()));
    }

    public final Map getFieldMappings() {
        return zzl.zzaz;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4) {
        int v0 = arg4.getSafeParcelableFieldId();
        if(v0 == 4) {
            goto label_20;
        }

        switch(v0) {
            case 1: {
                goto label_17;
            }
            case 2: {
                goto label_15;
            }
        }

        int v4 = arg4.getSafeParcelableFieldId();
        StringBuilder v2 = new StringBuilder(37);
        v2.append("Unknown SafeParcelable id=");
        v2.append(v4);
        throw new IllegalStateException(v2.toString());
    label_17:
        return Integer.valueOf(this.zzv);
    label_15:
        return this.zzbb;
    label_20:
        return this.zzbd;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2) {
        return this.zzba.contains(Integer.valueOf(arg2.getSafeParcelableFieldId()));
    }

    public final void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        Set v1 = this.zzba;
        if(v1.contains(Integer.valueOf(1))) {
            SafeParcelWriter.writeInt(arg6, 1, this.zzv);
        }

        int v3 = 2;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeTypedList(arg6, v3, this.zzbb, true);
        }

        v3 = 3;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeInt(arg6, v3, this.zzbc);
        }

        v3 = 4;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeParcelable(arg6, v3, this.zzbd, arg7, true);
        }

        SafeParcelWriter.finishObjectHeader(arg6, v0);
    }
}

