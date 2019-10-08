package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzew implements Parcelable$Creator {
    public zzew() {
        super();
    }

    public final Object createFromParcel(Parcel arg6) {
        int v0 = SafeParcelReader.validateObjectHeader(arg6);
        Bundle v1;
        for(v1 = null; arg6.dataPosition() < v0; v1 = SafeParcelReader.createBundle(arg6, v2)) {
            int v2 = SafeParcelReader.readHeader(arg6);
            if(SafeParcelReader.getFieldId(v2) != 2) {
                SafeParcelReader.skipUnknownField(arg6, v2);
                continue;
            }
        }

        SafeParcelReader.ensureAtEnd(arg6, v0);
        return new zzeu(v1);
    }

    public final Object[] newArray(int arg1) {
        return new zzeu[arg1];
    }
}

