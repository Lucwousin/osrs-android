package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable$Creator {
    public zzl() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        String v1 = null;
        IBinder v2 = ((IBinder)v1);
        boolean v3 = false;
        while(arg7.dataPosition() < v0) {
            int v4 = SafeParcelReader.readHeader(arg7);
            switch(SafeParcelReader.getFieldId(v4)) {
                case 1: {
                    goto label_16;
                }
                case 2: {
                    goto label_14;
                }
                case 3: {
                    goto label_12;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_12:
            v3 = SafeParcelReader.readBoolean(arg7, v4);
            continue;
        label_14:
            v2 = SafeParcelReader.readIBinder(arg7, v4);
            continue;
        label_16:
            v1 = SafeParcelReader.createString(arg7, v4);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new zzk(v1, v2, v3);
    }

    public final Object[] newArray(int arg1) {
        return new zzk[arg1];
    }
}

