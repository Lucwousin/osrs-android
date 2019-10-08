package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Indicator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Class(creator="AuthenticatorTransferInfoCreator") public class zzt extends zzaz {
    public static final Parcelable$Creator CREATOR;
    private static final HashMap zzaz;
    @Indicator private final Set zzba;
    @Field(getter="getAccountType", id=2) private String zzbn;
    @Field(getter="getStatus", id=3) private int zzbo;
    @Field(getter="getTransferBytes", id=4) private byte[] zzbp;
    @Field(getter="getPendingIntent", id=5) private PendingIntent zzbq;
    @Field(getter="getDeviceMetaData", id=6) private DeviceMetaData zzbr;
    @VersionField(id=1) private final int zzv;

    static {
        zzt.CREATOR = new zzu();
        HashMap v0 = new HashMap();
        zzt.zzaz = v0;
        v0.put("accountType", com.google.android.gms.common.server.response.FastJsonResponse$Field.forString("accountType", 2));
        zzt.zzaz.put("status", com.google.android.gms.common.server.response.FastJsonResponse$Field.forInteger("status", 3));
        zzt.zzaz.put("transferBytes", com.google.android.gms.common.server.response.FastJsonResponse$Field.forBase64("transferBytes", 4));
    }

    @Constructor zzt(@Indicator Set arg1, @Param(id=1) int arg2, @Param(id=2) String arg3, @Param(id=3) int arg4, @Param(id=4) byte[] arg5, @Param(id=5) PendingIntent arg6, @Param(id=6) DeviceMetaData arg7) {
        super();
        this.zzba = arg1;
        this.zzv = arg2;
        this.zzbn = arg3;
        this.zzbo = arg4;
        this.zzbp = arg5;
        this.zzbq = arg6;
        this.zzbr = arg7;
    }

    public zzt() {
        super();
        this.zzba = new ArraySet(3);
        this.zzv = 1;
    }

    public Map getFieldMappings() {
        return zzt.zzaz;
    }

    protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4) {
        switch(arg4.getSafeParcelableFieldId()) {
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_18;
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
    label_18:
        return this.zzbn;
    label_20:
        return Integer.valueOf(this.zzv);
    label_13:
        return this.zzbp;
    label_15:
        return Integer.valueOf(this.zzbo);
    }

    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2) {
        return this.zzba.contains(Integer.valueOf(arg2.getSafeParcelableFieldId()));
    }

    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, byte[] arg4) {
        int v2 = arg2.getSafeParcelableFieldId();
        if(v2 == 4) {
            this.zzbp = arg4;
            this.zzba.add(Integer.valueOf(v2));
            return;
        }

        StringBuilder v0 = new StringBuilder(59);
        v0.append("Field with id=");
        v0.append(v2);
        v0.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(v0.toString());
    }

    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, int arg4) {
        int v2 = arg2.getSafeParcelableFieldId();
        if(v2 == 3) {
            this.zzbo = arg4;
            this.zzba.add(Integer.valueOf(v2));
            return;
        }

        StringBuilder v0 = new StringBuilder(52);
        v0.append("Field with id=");
        v0.append(v2);
        v0.append(" is not known to be an int.");
        throw new IllegalArgumentException(v0.toString());
    }

    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, String arg4) {
        int v2 = arg2.getSafeParcelableFieldId();
        if(v2 == 2) {
            this.zzbn = arg4;
            this.zzba.add(Integer.valueOf(v2));
            return;
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(v2)));
    }

    public void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        Set v1 = this.zzba;
        if(v1.contains(Integer.valueOf(1))) {
            SafeParcelWriter.writeInt(arg6, 1, this.zzv);
        }

        int v3 = 2;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeString(arg6, v3, this.zzbn, true);
        }

        v3 = 3;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeInt(arg6, v3, this.zzbo);
        }

        v3 = 4;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeByteArray(arg6, v3, this.zzbp, true);
        }

        v3 = 5;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeParcelable(arg6, v3, this.zzbq, arg7, true);
        }

        v3 = 6;
        if(v1.contains(Integer.valueOf(v3))) {
            SafeParcelWriter.writeParcelable(arg6, v3, this.zzbr, arg7, true);
        }

        SafeParcelWriter.finishObjectHeader(arg6, v0);
    }
}

