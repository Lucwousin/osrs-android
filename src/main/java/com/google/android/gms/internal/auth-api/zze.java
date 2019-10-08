package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class zze {
    private static final ClassLoader zzf;

    static {
        zze.zzf = zze.class.getClassLoader();
    }

    private zze() {
        super();
    }

    public static Parcelable zzc(Parcel arg1, Parcelable$Creator arg2) {
        if(arg1.readInt() == 0) {
            return null;
        }

        return arg2.createFromParcel(arg1);
    }

    public static void zzc(Parcel arg0, IInterface arg1) {
        if(arg1 == null) {
            arg0.writeStrongBinder(null);
            return;
        }

        arg0.writeStrongBinder(arg1.asBinder());
    }

    public static void zzc(Parcel arg2, Parcelable arg3) {
        if(arg3 == null) {
            arg2.writeInt(0);
            return;
        }

        arg2.writeInt(1);
        arg3.writeToParcel(arg2, 0);
    }
}

