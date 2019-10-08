package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zaa implements Parcelable$Creator {
    public zaa() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        Parcelable v2_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        int v1 = 0;
        ParcelFileDescriptor v2 = null;
        int v3 = 0;
        while(arg7.dataPosition() < v0) {
            int v4 = SafeParcelReader.readHeader(arg7);
            switch(SafeParcelReader.getFieldId(v4)) {
                case 1: {
                    goto label_16;
                }
                case 2: {
                    goto label_13;
                }
                case 3: {
                    goto label_11;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_11:
            v3 = SafeParcelReader.readInt(arg7, v4);
            continue;
        label_13:
            v2_1 = SafeParcelReader.createParcelable(arg7, v4, ParcelFileDescriptor.CREATOR);
            continue;
        label_16:
            v1 = SafeParcelReader.readInt(arg7, v4);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new BitmapTeleporter(v1, ((ParcelFileDescriptor)v2_1), v3);
    }

    public final Object[] newArray(int arg1) {
        return new BitmapTeleporter[arg1];
    }
}

