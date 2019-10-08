package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;

final class zzm implements Parcelable$Creator {
    zzm() {
        super();
    }

    public final Object createFromParcel(Parcel arg2) {
        IBinder v2 = arg2.readStrongBinder();
        if(v2 != null) {
            return new zzl(v2);
        }

        return null;
    }

    public final Object[] newArray(int arg1) {
        return new zzl[arg1];
    }
}

