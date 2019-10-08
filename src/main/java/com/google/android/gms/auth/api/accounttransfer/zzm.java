package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class zzm implements Parcelable$Creator {
    public zzm() {
        super();
    }

    public final Object createFromParcel(Parcel arg9) {
        Parcelable v6_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg9);
        HashSet v2 = new HashSet();
        int v3 = 0;
        ArrayList v4 = null;
        zzo v6 = ((zzo)v4);
        int v5 = 0;
        while(arg9.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg9);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_33;
                }
                case 2: {
                    goto label_27;
                }
                case 3: {
                    goto label_22;
                }
                case 4: {
                    goto label_15;
                }
            }

            SafeParcelReader.skipUnknownField(arg9, v1);
            continue;
        label_33:
            v3 = SafeParcelReader.readInt(arg9, v1);
            ((Set)v2).add(Integer.valueOf(1));
            continue;
        label_22:
            v5 = SafeParcelReader.readInt(arg9, v1);
            ((Set)v2).add(Integer.valueOf(3));
            continue;
        label_27:
            v4 = SafeParcelReader.createTypedList(arg9, v1, zzr.CREATOR);
            ((Set)v2).add(Integer.valueOf(2));
            continue;
        label_15:
            v6_1 = SafeParcelReader.createParcelable(arg9, v1, zzo.CREATOR);
            ((Set)v2).add(Integer.valueOf(4));
        }

        if(arg9.dataPosition() == v0) {
            return new zzl(((Set)v2), v3, v4, v5, ((zzo)v6_1));
        }

        StringBuilder v3_1 = new StringBuilder(37);
        v3_1.append("Overread allowed size end=");
        v3_1.append(v0);
        throw new ParseException(v3_1.toString(), arg9);
    }

    public final Object[] newArray(int arg1) {
        return new zzl[arg1];
    }
}

