package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzt implements Parcelable$Creator {
    public zzt() {
        super();
    }

    public final Object createFromParcel(Parcel arg6) {
        Parcelable v1_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg6);
        Credential v1 = null;
        while(arg6.dataPosition() < v0) {
            int v2 = SafeParcelReader.readHeader(arg6);
            if(SafeParcelReader.getFieldId(v2) != 1) {
                SafeParcelReader.skipUnknownField(arg6, v2);
                continue;
            }

            v1_1 = SafeParcelReader.createParcelable(arg6, v2, Credential.CREATOR);
        }

        SafeParcelReader.ensureAtEnd(arg6, v0);
        return new zzs(((Credential)v1_1));
    }

    public final Object[] newArray(int arg1) {
        return new zzs[arg1];
    }
}

