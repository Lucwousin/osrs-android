package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zap implements Parcelable$Creator {
    public zap() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        Parcel v1 = null;
        int v2 = 0;
        zak v3 = ((zak)v1);
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
                    goto label_11;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_11:
            Parcelable v3_1 = SafeParcelReader.createParcelable(arg7, v4, zak.CREATOR);
            continue;
        label_14:
            v1 = SafeParcelReader.createParcel(arg7, v4);
            continue;
        label_16:
            v2 = SafeParcelReader.readInt(arg7, v4);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new SafeParcelResponse(v2, v1, v3);
    }

    public final Object[] newArray(int arg1) {
        return new SafeParcelResponse[arg1];
    }
}

