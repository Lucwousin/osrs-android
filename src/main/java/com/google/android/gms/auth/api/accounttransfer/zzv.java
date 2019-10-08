package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzv implements Parcelable$Creator {
    public zzv() {
        super();
    }

    public final Object createFromParcel(Parcel arg11) {
        int v0 = SafeParcelReader.validateObjectHeader(arg11);
        long v7 = 0;
        int v5 = 0;
        boolean v6 = false;
        boolean v9 = false;
        while(arg11.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg11);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_18;
                }
                case 3: {
                    goto label_16;
                }
                case 4: {
                    goto label_14;
                }
            }

            SafeParcelReader.skipUnknownField(arg11, v1);
            continue;
        label_18:
            v6 = SafeParcelReader.readBoolean(arg11, v1);
            continue;
        label_20:
            v5 = SafeParcelReader.readInt(arg11, v1);
            continue;
        label_14:
            v9 = SafeParcelReader.readBoolean(arg11, v1);
            continue;
        label_16:
            v7 = SafeParcelReader.readLong(arg11, v1);
        }

        SafeParcelReader.ensureAtEnd(arg11, v0);
        return new DeviceMetaData(v5, v6, v7, v9);
    }

    public final Object[] newArray(int arg1) {
        return new DeviceMetaData[arg1];
    }
}

