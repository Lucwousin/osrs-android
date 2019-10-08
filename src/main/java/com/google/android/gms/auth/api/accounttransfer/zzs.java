package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;
import java.util.Set;

public final class zzs implements Parcelable$Creator {
    public zzs() {
        super();
    }

    public final Object createFromParcel(Parcel arg10) {
        int v0 = SafeParcelReader.validateObjectHeader(arg10);
        HashSet v2 = new HashSet();
        int v3 = 0;
        zzt v4 = null;
        String v5 = ((String)v4);
        String v6 = v5;
        String v7 = v6;
        while(arg10.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg10);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_38;
                }
                case 2: {
                    goto label_31;
                }
                case 3: {
                    goto label_26;
                }
                case 4: {
                    goto label_21;
                }
                case 5: {
                    goto label_16;
                }
            }

            SafeParcelReader.skipUnknownField(arg10, v1);
            continue;
        label_21:
            v6 = SafeParcelReader.createString(arg10, v1);
            ((Set)v2).add(Integer.valueOf(4));
            continue;
        label_38:
            v3 = SafeParcelReader.readInt(arg10, v1);
            ((Set)v2).add(Integer.valueOf(1));
            continue;
        label_26:
            v5 = SafeParcelReader.createString(arg10, v1);
            ((Set)v2).add(Integer.valueOf(3));
            continue;
        label_31:
            Parcelable v4_1 = SafeParcelReader.createParcelable(arg10, v1, zzt.CREATOR);
            ((Set)v2).add(Integer.valueOf(2));
            continue;
        label_16:
            v7 = SafeParcelReader.createString(arg10, v1);
            ((Set)v2).add(Integer.valueOf(5));
        }

        if(arg10.dataPosition() == v0) {
            return new zzr(((Set)v2), v3, v4, v5, v6, v7);
        }

        StringBuilder v3_1 = new StringBuilder(37);
        v3_1.append("Overread allowed size end=");
        v3_1.append(v0);
        throw new ParseException(v3_1.toString(), arg10);
    }

    public final Object[] newArray(int arg1) {
        return new zzr[arg1];
    }
}

