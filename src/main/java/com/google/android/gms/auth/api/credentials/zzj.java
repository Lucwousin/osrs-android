package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Parcelable$Creator {
    public zzj() {
        super();
    }

    public final Object createFromParcel(Parcel arg13) {
        Parcelable v5_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg13);
        CredentialPickerConfig v5 = null;
        String[] v8 = ((String[])v5);
        String v10 = ((String)v8);
        String v11 = v10;
        int v4 = 0;
        boolean v6 = false;
        boolean v7 = false;
        boolean v9 = false;
        while(arg13.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg13);
            int v2 = SafeParcelReader.getFieldId(v1);
            if(v2 != 1000) {
                switch(v2) {
                    case 1: {
                        goto label_32;
                    }
                    case 2: {
                        goto label_30;
                    }
                    case 3: {
                        goto label_28;
                    }
                    case 4: {
                        goto label_26;
                    }
                    case 5: {
                        goto label_24;
                    }
                    case 6: {
                        goto label_22;
                    }
                    case 7: {
                        goto label_20;
                    }
                }

                SafeParcelReader.skipUnknownField(arg13, v1);
                continue;
            label_20:
                v11 = SafeParcelReader.createString(arg13, v1);
                continue;
            label_22:
                v10 = SafeParcelReader.createString(arg13, v1);
                continue;
            label_24:
                v9 = SafeParcelReader.readBoolean(arg13, v1);
                continue;
            label_26:
                v8 = SafeParcelReader.createStringArray(arg13, v1);
                continue;
            label_28:
                v7 = SafeParcelReader.readBoolean(arg13, v1);
                continue;
            label_30:
                v6 = SafeParcelReader.readBoolean(arg13, v1);
                continue;
            label_32:
                v5_1 = SafeParcelReader.createParcelable(arg13, v1, CredentialPickerConfig.CREATOR);
                continue;
            }

            v4 = SafeParcelReader.readInt(arg13, v1);
        }

        SafeParcelReader.ensureAtEnd(arg13, v0);
        return new HintRequest(v4, ((CredentialPickerConfig)v5_1), v6, v7, v8, v9, v10, v11);
    }

    public final Object[] newArray(int arg1) {
        return new HintRequest[arg1];
    }
}

