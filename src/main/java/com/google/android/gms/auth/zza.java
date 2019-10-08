package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable$Creator {
    public zza() {
        super();
    }

    public final Object createFromParcel(Parcel arg14) {
        int v0 = SafeParcelReader.validateObjectHeader(arg14);
        String v9 = null;
        String v12 = v9;
        long v7 = 0;
        int v6 = 0;
        int v10 = 0;
        int v11 = 0;
        while(arg14.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg14);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_27;
                }
                case 2: {
                    goto label_25;
                }
                case 3: {
                    goto label_23;
                }
                case 4: {
                    goto label_21;
                }
                case 5: {
                    goto label_19;
                }
                case 6: {
                    goto label_17;
                }
            }

            SafeParcelReader.skipUnknownField(arg14, v1);
            continue;
        label_17:
            v12 = SafeParcelReader.createString(arg14, v1);
            continue;
        label_19:
            v11 = SafeParcelReader.readInt(arg14, v1);
            continue;
        label_21:
            v10 = SafeParcelReader.readInt(arg14, v1);
            continue;
        label_23:
            v9 = SafeParcelReader.createString(arg14, v1);
            continue;
        label_25:
            v7 = SafeParcelReader.readLong(arg14, v1);
            continue;
        label_27:
            v6 = SafeParcelReader.readInt(arg14, v1);
        }

        SafeParcelReader.ensureAtEnd(arg14, v0);
        return new AccountChangeEvent(v6, v7, v9, v10, v11, v12);
    }

    public final Object[] newArray(int arg1) {
        return new AccountChangeEvent[arg1];
    }
}

