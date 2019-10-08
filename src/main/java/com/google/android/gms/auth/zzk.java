package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzk implements Parcelable$Creator {
    public zzk() {
        super();
    }

    public final Object createFromParcel(Parcel arg12) {
        ArrayList v9_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg12);
        String v5 = null;
        Long v6 = ((Long)v5);
        List v9 = ((List)v6);
        String v10 = ((String)v9);
        int v4 = 0;
        boolean v7 = false;
        boolean v8 = false;
        while(arg12.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg12);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_29;
                }
                case 2: {
                    goto label_27;
                }
                case 3: {
                    goto label_25;
                }
                case 4: {
                    goto label_23;
                }
                case 5: {
                    goto label_21;
                }
                case 6: {
                    goto label_19;
                }
                case 7: {
                    goto label_17;
                }
            }

            SafeParcelReader.skipUnknownField(arg12, v1);
            continue;
        label_17:
            v10 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_19:
            v9_1 = SafeParcelReader.createStringList(arg12, v1);
            continue;
        label_21:
            v8 = SafeParcelReader.readBoolean(arg12, v1);
            continue;
        label_23:
            v7 = SafeParcelReader.readBoolean(arg12, v1);
            continue;
        label_25:
            v6 = SafeParcelReader.readLongObject(arg12, v1);
            continue;
        label_27:
            v5 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_29:
            v4 = SafeParcelReader.readInt(arg12, v1);
        }

        SafeParcelReader.ensureAtEnd(arg12, v0);
        return new TokenData(v4, v5, v6, v7, v8, ((List)v9_1), v10);
    }

    public final Object[] newArray(int arg1) {
        return new TokenData[arg1];
    }
}

