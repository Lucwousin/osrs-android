package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzg implements Parcelable$Creator {
    public zzg() {
        super();
    }

    public final Object createFromParcel(Parcel arg14) {
        Parcelable v8_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg14);
        String[] v6 = null;
        CredentialPickerConfig v7 = ((CredentialPickerConfig)v6);
        CredentialPickerConfig v8 = v7;
        String v10 = ((String)v8);
        String v11 = v10;
        int v4 = 0;
        boolean v5 = false;
        boolean v9 = false;
        boolean v12 = false;
        while(arg14.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg14);
            int v2 = SafeParcelReader.getFieldId(v1);
            if(v2 != 1000) {
                switch(v2) {
                    case 1: {
                        goto label_39;
                    }
                    case 2: {
                        goto label_37;
                    }
                    case 3: {
                        goto label_33;
                    }
                    case 4: {
                        goto label_29;
                    }
                    case 5: {
                        goto label_27;
                    }
                    case 6: {
                        goto label_25;
                    }
                    case 7: {
                        goto label_23;
                    }
                    case 8: {
                        goto label_21;
                    }
                }

                SafeParcelReader.skipUnknownField(arg14, v1);
                continue;
            label_33:
                Parcelable v7_1 = SafeParcelReader.createParcelable(arg14, v1, CredentialPickerConfig.CREATOR);
                continue;
            label_37:
                v6 = SafeParcelReader.createStringArray(arg14, v1);
                continue;
            label_21:
                v12 = SafeParcelReader.readBoolean(arg14, v1);
                continue;
            label_39:
                v5 = SafeParcelReader.readBoolean(arg14, v1);
                continue;
            label_23:
                v11 = SafeParcelReader.createString(arg14, v1);
                continue;
            label_25:
                v10 = SafeParcelReader.createString(arg14, v1);
                continue;
            label_27:
                v9 = SafeParcelReader.readBoolean(arg14, v1);
                continue;
            label_29:
                v8_1 = SafeParcelReader.createParcelable(arg14, v1, CredentialPickerConfig.CREATOR);
                continue;
            }

            v4 = SafeParcelReader.readInt(arg14, v1);
        }

        SafeParcelReader.ensureAtEnd(arg14, v0);
        return new CredentialRequest(v4, v5, v6, v7, ((CredentialPickerConfig)v8_1), v9, v10, v11, v12);
    }

    public final Object[] newArray(int arg1) {
        return new CredentialRequest[arg1];
    }
}

