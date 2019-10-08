package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zab implements Parcelable$Creator {
    public zab() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        int v1 = 0;
        Intent v3 = null;
        int v2;
        for(v2 = 0; arg7.dataPosition() < v0; v2 = SafeParcelReader.readInt(arg7, v4)) {
            int v4 = SafeParcelReader.readHeader(arg7);
            switch(SafeParcelReader.getFieldId(v4)) {
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_15;
                }
                case 3: {
                    goto label_12;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_17:
            v1 = SafeParcelReader.readInt(arg7, v4);
            continue;
        label_12:
            Parcelable v3_1 = SafeParcelReader.createParcelable(arg7, v4, Intent.CREATOR);
            continue;
        label_15:
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new zaa(v1, v2, v3);
    }

    public final Object[] newArray(int arg1) {
        return new zaa[arg1];
    }
}

