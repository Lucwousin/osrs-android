package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable$Creator {
    public zza() {
        super();
    }

    public final Object createFromParcel(Parcel arg14) {
        int v0 = SafeParcelReader.validateObjectHeader(arg14);
        String v7 = null;
        byte[] v11 = ((byte[])v7);
        Bundle v12 = ((Bundle)v11);
        long v9 = 0;
        int v6 = 0;
        int v8 = 0;
        while(arg14.dataPosition() < v0) {
            int v1 = SafeParcelReader.readHeader(arg14);
            int v2 = SafeParcelReader.getFieldId(v1);
            if(v2 != 1000) {
                switch(v2) {
                    case 1: {
                        goto label_27;
                    }
                    case 2: {
                        goto label_25;
                    }
                    case 3: {
                        goto label_23;
                    }
                    case 4: {
                        goto label_21;
                    }
                    case 5: {
                        goto label_19;
                    }
                }

                SafeParcelReader.skipUnknownField(arg14, v1);
                continue;
            label_19:
                v12 = SafeParcelReader.createBundle(arg14, v1);
                continue;
            label_21:
                v11 = SafeParcelReader.createByteArray(arg14, v1);
                continue;
            label_23:
                v9 = SafeParcelReader.readLong(arg14, v1);
                continue;
            label_25:
                v8 = SafeParcelReader.readInt(arg14, v1);
                continue;
            label_27:
                v7 = SafeParcelReader.createString(arg14, v1);
                continue;
            }

            v6 = SafeParcelReader.readInt(arg14, v1);
        }

        SafeParcelReader.ensureAtEnd(arg14, v0);
        return new ProxyRequest(v6, v7, v8, v9, v11, v12);
    }

    public final Object[] newArray(int arg1) {
        return new ProxyRequest[arg1];
    }
}

