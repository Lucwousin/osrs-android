package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Class(creator="AccountTransferProgressCreator") public class zzo extends zzaz {
    public static final Parcelable$Creator CREATOR;
    private static final ArrayMap zzbe;
    @Field(getter="getRegisteredAccountTypes", id=2) private List zzbf;
    @Field(getter="getInProgressAccountTypes", id=3) private List zzbg;
    @Field(getter="getSuccessAccountTypes", id=4) private List zzbh;
    @Field(getter="getFailedAccountTypes", id=5) private List zzbi;
    @Field(getter="getEscrowedAccountTypes", id=6) private List zzbj;
    @VersionField(id=1) private final int zzv;

    static {
        zzo.CREATOR = new zzp();
        ArrayMap v0 = new ArrayMap();
        zzo.zzbe = v0;
        v0.put("registered", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("registered", 2));
        zzo.zzbe.put("in_progress", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("in_progress", 3));
        zzo.zzbe.put("success", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("success", 4));
        zzo.zzbe.put("failed", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("failed", 5));
        zzo.zzbe.put("escrowed", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("escrowed", 6));
    }

    @Constructor zzo(@Param(id=1) int arg1, @Nullable @Param(id=2) List arg2, @Nullable @Param(id=3) List arg3, @Nullable @Param(id=4) List arg4, @Nullable @Param(id=5) List arg5, @Nullable @Param(id=6) List arg6) {
        super();
        this.zzv = arg1;
        this.zzbf = arg2;
        this.zzbg = arg3;
        this.zzbh = arg4;
        this.zzbi = arg5;
        this.zzbj = arg6;
    }

    public zzo() {
        super();
        this.zzv = 1;
    }

    public Map getFieldMappings() {
        return zzo.zzbe;
    }

    protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4) {
        switch(arg4.getSafeParcelableFieldId()) {
            case 1: {
                goto label_23;
            }
            case 2: {
                goto label_21;
            }
            case 3: {
                goto label_19;
            }
            case 4: {
                goto label_17;
            }
            case 5: {
                goto label_15;
            }
            case 6: {
                goto label_13;
            }
        }

        int v4 = arg4.getSafeParcelableFieldId();
        StringBuilder v2 = new StringBuilder(37);
        v2.append("Unknown SafeParcelable id=");
        v2.append(v4);
        throw new IllegalStateException(v2.toString());
    label_17:
        return this.zzbh;
    label_19:
        return this.zzbg;
    label_21:
        return this.zzbf;
    label_23:
        return Integer.valueOf(this.zzv);
    label_13:
        return this.zzbj;
    label_15:
        return this.zzbi;
    }

    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1) {
        return 1;
    }

    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, ArrayList arg4) {
        int v2 = arg2.getSafeParcelableFieldId();
        switch(v2) {
            case 2: {
                goto label_20;
            }
            case 3: {
                goto label_18;
            }
            case 4: {
                goto label_16;
            }
            case 5: {
                goto label_14;
            }
            case 6: {
                goto label_12;
            }
        }

        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(v2)));
    label_18:
        this.zzbg = ((List)arg4);
        return;
    label_20:
        this.zzbf = ((List)arg4);
        return;
    label_12:
        this.zzbj = ((List)arg4);
        return;
    label_14:
        this.zzbi = ((List)arg4);
        return;
    label_16:
        this.zzbh = ((List)arg4);
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zzv);
        SafeParcelWriter.writeStringList(arg4, 2, this.zzbf, false);
        SafeParcelWriter.writeStringList(arg4, 3, this.zzbg, false);
        SafeParcelWriter.writeStringList(arg4, 4, this.zzbh, false);
        SafeParcelWriter.writeStringList(arg4, 5, this.zzbi, false);
        SafeParcelWriter.writeStringList(arg4, 6, this.zzbj, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

