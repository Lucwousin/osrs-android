package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable$Creator {
    public zza() {
        super();
    }

    public final Object createFromParcel(Parcel arg8) {
        int v0 = SafeParcelReader.validateObjectHeader(arg8);
        int v2 = 0;
        PendingIntent v3 = null;
        String v4 = ((String)v3);
        int v1 = 0;
        while(arg8.dataPosition() < v0) {
            int v5 = SafeParcelReader.readHeader(arg8);
            switch(SafeParcelReader.getFieldId(v5)) {
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_18;
                }
                case 3: {
                    goto label_15;
                }
                case 4: {
                    goto label_13;
                }
            }

            SafeParcelReader.skipUnknownField(arg8, v5);
            continue;
        label_18:
            v1 = SafeParcelReader.readInt(arg8, v5);
            continue;
        label_20:
            v2 = SafeParcelReader.readInt(arg8, v5);
            continue;
        label_13:
            v4 = SafeParcelReader.createString(arg8, v5);
            continue;
        label_15:
            Parcelable v3_1 = SafeParcelReader.createParcelable(arg8, v5, PendingIntent.CREATOR);
        }

        SafeParcelReader.ensureAtEnd(arg8, v0);
        return new ConnectionResult(v2, v1, v3, v4);
    }

    public final Object[] newArray(int arg1) {
        return new ConnectionResult[arg1];
    }
}

