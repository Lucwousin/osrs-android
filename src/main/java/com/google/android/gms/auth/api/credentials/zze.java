package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zze implements Parcelable$Creator {
    public zze() {
        super();
    }

    public final Object createFromParcel(Parcel arg10) {
        int v0 = SafeParcelReader.validateObjectHeader(arg10);
        int v3 = 0;
        boolean v4 = false;
        boolean v5 = false;
        boolean v6 = false;
        int v7 = 0;
        while(arg10.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg10);
            int v2 = SafeParcelReader.getFieldId(v1);
            if(v2 != 1000) {
                switch(v2) {
                    case 1: {
                        goto label_22;
                    }
                    case 2: {
                        goto label_20;
                    }
                    case 3: {
                        goto label_18;
                    }
                    case 4: {
                        goto label_16;
                    }
                }

                SafeParcelReader.skipUnknownField(arg10, v1);
                continue;
            label_18:
                v6 = SafeParcelReader.readBoolean(arg10, v1);
                continue;
            label_20:
                v5 = SafeParcelReader.readBoolean(arg10, v1);
                continue;
            label_22:
                v4 = SafeParcelReader.readBoolean(arg10, v1);
                continue;
            label_16:
                v7 = SafeParcelReader.readInt(arg10, v1);
                continue;
            }

            v3 = SafeParcelReader.readInt(arg10, v1);
        }

        SafeParcelReader.ensureAtEnd(arg10, v0);
        return new CredentialPickerConfig(v3, v4, v5, v6, v7);
    }

    public final Object[] newArray(int arg1) {
        return new CredentialPickerConfig[arg1];
    }
}

