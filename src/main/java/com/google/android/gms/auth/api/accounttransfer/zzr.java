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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Class(creator="AuthenticatorAnnotatedDataCreator") public class zzr extends zzaz {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getPackageName", id=4) private String mPackageName;
    private static final HashMap zzaz;
    @Indicator private final Set zzba;
    @Field(getter="getInfo", id=2) private zzt zzbk;
    @Field(getter="getSignature", id=3) private String zzbl;
    @Field(getter="getId", id=5) private String zzbm;
    @VersionField(id=1) private final int zzv;

    static {
        zzr.CREATOR = new zzs();
        HashMap v0 = new HashMap();
        zzr.zzaz = v0;
        v0.put("authenticatorInfo", com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteType("authenticatorInfo", 2, zzt.class));
        zzr.zzaz.put("signature", com.google.android.gms.common.server.response.FastJsonResponse$Field.forString("signature", 3));
        zzr.zzaz.put("package", com.google.android.gms.common.server.response.FastJsonResponse$Field.forString("package", 4));
    }

    @Constructor zzr(@Indicator Set arg1, @Param(id=1) int arg2, @Param(id=2) zzt arg3, @Param(id=3) String arg4, @Param(id=4) String arg5, @Param(id=5) String arg6) {
        super();
        this.zzba = arg1;
        this.zzv = arg2;
        this.zzbk = arg3;
        this.zzbl = arg4;
        this.mPackageName = arg5;
        this.zzbm = arg6;
    }

    public zzr() {
        super();
        this.zzba = new HashSet(3);
        this.zzv = 1;
    }

    public void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg3, String arg4, FastJsonResponse arg5) {
        int v3 = arg3.getSafeParcelableFieldId();
        int v4 = 2;
        if(v3 == v4) {
            this.zzbk = ((zzt)arg5);
            this.zzba.add(Integer.valueOf(v3));
            return;
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(v3), arg5.getClass().getCanonicalName()));
    }

    public Map getFieldMappings() {
        return zzr.zzaz;
    }

    protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4) {
        switch(arg4.getSafeParcelableFieldId()) {
            case 1: {
                goto label_19;
            }
            case 2: {
                goto label_17;
            }
            case 3: {
                goto label_15;
            }
            case 4: {
                goto label_13;
            }
        }

        int v4 = arg4.getSafeParcelableFieldId();
        StringBuilder v2 = new StringBuilder(37);
        v2.append("Unknown SafeParcelable id=");
        v2.append(v4);
        throw new IllegalStateException(v2.toString());
    label_17:
        return this.zzbk;
    label_19:
        return Integer.valueOf(this.zzv);
    label_13:
        return this.mPackageName;
    label_15:
        return this.zzbl;
    }

    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2) {
        return this.zzba.contains(Integer.valueOf(arg2.getSafeParcelableFieldId()));
    }

    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, String arg4) {
        int v2 = arg2.getSafeParcelableFieldId();
        switch(v2) {
            case 3: {
                goto label_14;
            }
            case 4: {
                goto label_12;
            }
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(v2)));
    label_12:
        this.mPackageName = arg4;
        goto label_15;
    label_14:
        this.zzbl = arg4;
    label_15:
        this.zzba.add(Integer.valueOf(v2));
    }

    public void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        Set v1 = this.zzba;
        if(v1.contains(Integer.valueOf(1))) {
            SafeParcelWriter.writeInt(arg6, 1, this.zzv);
        }

        int v3 = 2;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeParcelable(arg6, v3, this.zzbk, arg7, true);
        }

        arg7 = 3;
        if(v1.contains(Integer.valueOf(arg7))) {
            SafeParcelWriter.writeString(arg6, arg7, this.zzbl, true);
        }

        arg7 = 4;
        if(v1.contains(Integer.valueOf(arg7))) {
            SafeParcelWriter.writeString(arg6, arg7, this.mPackageName, true);
        }

        arg7 = 5;
        if(v1.contains(Integer.valueOf(arg7))) {
            SafeParcelWriter.writeString(arg6, arg7, this.zzbm, true);
        }

        SafeParcelWriter.finishObjectHeader(arg6, v0);
    }
}

