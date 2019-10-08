package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;
import java.util.Set;

public final class zzu implements Parcelable$Creator {
    public zzu() {
        super();
    }

    public final Object createFromParcel(Parcel arg11) {
        int v0 = SafeParcelReader.validateObjectHeader(arg11);
        HashSet v2 = new HashSet();
        String v4 = null;
        byte[] v6 = ((byte[])v4);
        PendingIntent v7 = ((PendingIntent)v6);
        DeviceMetaData v8 = ((DeviceMetaData)v7);
        int v3 = 0;
        int v5 = 0;
        while(arg11.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg11);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_47;
                }
                case 2: {
                    goto label_42;
                }
                case 3: {
                    goto label_37;
                }
                case 4: {
                    goto label_32;
                }
                case 5: {
                    goto label_25;
                }
                case 6: {
                    goto label_18;
                }
            }

            SafeParcelReader.skipUnknownField(arg11, v1);
            continue;
        label_18:
            Parcelable v8_1 = SafeParcelReader.createParcelable(arg11, v1, DeviceMetaData.CREATOR);
            ((Set)v2).add(Integer.valueOf(6));
            continue;
        label_37:
            v5 = SafeParcelReader.readInt(arg11, v1);
            ((Set)v2).add(Integer.valueOf(3));
            continue;
        label_25:
            Parcelable v7_1 = SafeParcelReader.createParcelable(arg11, v1, PendingIntent.CREATOR);
            ((Set)v2).add(Integer.valueOf(5));
            continue;
        label_42:
            v4 = SafeParcelReader.createString(arg11, v1);
            ((Set)v2).add(Integer.valueOf(2));
            continue;
        label_47:
            v3 = SafeParcelReader.readInt(arg11, v1);
            ((Set)v2).add(Integer.valueOf(1));
            continue;
        label_32:
            v6 = SafeParcelReader.createByteArray(arg11, v1);
            ((Set)v2).add(Integer.valueOf(4));
        }

        if(arg11.dataPosition() == v0) {
            return new zzt(((Set)v2), v3, v4, v5, v6, v7, v8);
        }

        StringBuilder v3_1 = new StringBuilder(37);
        v3_1.append("Overread allowed size end=");
        v3_1.append(v0);
        throw new ParseException(v3_1.toString(), arg11);
    }

    public final Object[] newArray(int arg1) {
        return new zzt[arg1];
    }
}

