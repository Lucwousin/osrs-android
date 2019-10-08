package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzz implements Parcelable$Creator {
    public zzz() {
        super();
    }

    public final Object createFromParcel(Parcel arg6) {
        int v0 = SafeParcelReader.validateObjectHeader(arg6);
        Credential v1 = null;
        while(arg6.dataPosition() < v0) {
            int v2 = SafeParcelReader.readHeader(arg6);
            if(SafeParcelReader.getFieldId(v2) != 1) {
                SafeParcelReader.skipUnknownField(arg6, v2);
                continue;
            }

            Parcelable v1_1 = SafeParcelReader.createParcelable(arg6, v2, Credential.CREATOR);
        }

        SafeParcelReader.ensureAtEnd(arg6, v0);
        return new zzy(v1);
    }

    public final Object[] newArray(int arg1) {
        return new zzy[arg1];
    }
}

