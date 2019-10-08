package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzc implements Parcelable$Creator {
    public zzc() {
        super();
    }

    public final Object createFromParcel(Parcel arg12) {
        Parcelable v5_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg12);
        String v3 = null;
        String v4 = v3;
        Uri v5 = ((Uri)v4);
        List v6 = ((List)v5);
        String v7 = ((String)v6);
        String v8 = v7;
        String v9 = v8;
        String v10 = v9;
        while(arg12.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg12);
            switch(SafeParcelReader.getFieldId(v1)) {
                case 1: {
                    goto label_34;
                }
                case 2: {
                    goto label_32;
                }
                case 3: {
                    goto label_28;
                }
                case 4: {
                    goto label_25;
                }
                case 5: {
                    goto label_23;
                }
                case 6: {
                    goto label_21;
                }
                case 9: {
                    goto label_19;
                }
                case 10: {
                    goto label_17;
                }
            }

            SafeParcelReader.skipUnknownField(arg12, v1);
            continue;
        label_17:
            v10 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_34:
            v3 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_19:
            v9 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_21:
            v8 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_23:
            v7 = SafeParcelReader.createString(arg12, v1);
            continue;
        label_25:
            ArrayList v6_1 = SafeParcelReader.createTypedList(arg12, v1, IdToken.CREATOR);
            continue;
        label_28:
            v5_1 = SafeParcelReader.createParcelable(arg12, v1, Uri.CREATOR);
            continue;
        label_32:
            v4 = SafeParcelReader.createString(arg12, v1);
        }

        SafeParcelReader.ensureAtEnd(arg12, v0);
        return new Credential(v3, v4, ((Uri)v5_1), v6, v7, v8, v9, v10);
    }

    public final Object[] newArray(int arg1) {
        return new Credential[arg1];
    }
}

