package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzp implements Parcelable$Creator {
    public zzp() {
        super();
    }

    public final Object createFromParcel(Parcel arg11) {
        ArrayList v9_1;
        ArrayList v7_1;
        ArrayList v8_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg11);
        List v5 = null;
        List v6 = v5;
        List v7 = v6;
        List v8 = v7;
        List v9 = v8;
        int v4 = 0;
        while(arg11.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg11);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_26;
                }
                case 2: {
                    goto label_24;
                }
                case 3: {
                    goto label_22;
                }
                case 4: {
                    goto label_20;
                }
                case 5: {
                    goto label_18;
                }
                case 6: {
                    goto label_16;
                }
            }

            SafeParcelReader.skipUnknownField(arg11, v1);
            continue;
        label_18:
            v8_1 = SafeParcelReader.createStringList(arg11, v1);
            continue;
        label_20:
            v7_1 = SafeParcelReader.createStringList(arg11, v1);
            continue;
        label_22:
            ArrayList v6_1 = SafeParcelReader.createStringList(arg11, v1);
            continue;
        label_24:
            ArrayList v5_1 = SafeParcelReader.createStringList(arg11, v1);
            continue;
        label_26:
            v4 = SafeParcelReader.readInt(arg11, v1);
            continue;
        label_16:
            v9_1 = SafeParcelReader.createStringList(arg11, v1);
        }

        SafeParcelReader.ensureAtEnd(arg11, v0);
        return new zzo(v4, v5, v6, ((List)v7_1), ((List)v8_1), ((List)v9_1));
    }

    public final Object[] newArray(int arg1) {
        return new zzo[arg1];
    }
}

