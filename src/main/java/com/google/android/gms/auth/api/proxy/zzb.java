package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable$Creator {
    public zzb() {
        super();
    }

    public final Object createFromParcel(Parcel arg11) {
        int v0 = SafeParcelReader.validateObjectHeader(arg11);
        PendingIntent v6 = null;
        Bundle v8 = ((Bundle)v6);
        byte[] v9 = ((byte[])v8);
        int v4 = 0;
        int v5 = 0;
        int v7 = 0;
        while(arg11.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg11);
            int v2 = SafeParcelReader.getFieldId(v1);
            if(v2 != 1000) {
                switch(v2) {
                    case 1: {
                        goto label_28;
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
                }

                SafeParcelReader.skipUnknownField(arg11, v1);
                continue;
            label_18:
                v9 = SafeParcelReader.createByteArray(arg11, v1);
                continue;
            label_20:
                v8 = SafeParcelReader.createBundle(arg11, v1);
                continue;
            label_22:
                v7 = SafeParcelReader.readInt(arg11, v1);
                continue;
            label_24:
                Parcelable v6_1 = SafeParcelReader.createParcelable(arg11, v1, PendingIntent.CREATOR);
                continue;
            label_28:
                v5 = SafeParcelReader.readInt(arg11, v1);
                continue;
            }

            v4 = SafeParcelReader.readInt(arg11, v1);
        }

        SafeParcelReader.ensureAtEnd(arg11, v0);
        return new ProxyResponse(v4, v5, v6, v7, v8, v9);
    }

    public final Object[] newArray(int arg1) {
        return new ProxyResponse[arg1];
    }
}

