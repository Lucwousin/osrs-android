package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class zzc {
    private static final ClassLoader zzd;

    static {
        zzc.zzd = zzc.class.getClassLoader();
    }

    private zzc() {
        super();
    }

    public static void writeBoolean(Parcel arg0, boolean arg1) {
        arg0.writeInt(((int)arg1));
    }

    public static Parcelable zza(Parcel arg1, Parcelable$Creator arg2) {
        if(arg1.readInt() == 0) {
            return null;
        }

        return arg2.createFromParcel(arg1);
    }

    public static void zza(Parcel arg0, IInterface arg1) {
        if(arg1 == null) {
            arg0.writeStrongBinder(null);
            return;
        }

        arg0.writeStrongBinder(arg1.asBinder());
    }

    public static void zza(Parcel arg2, Parcelable arg3) {
        if(arg3 == null) {
            arg2.writeInt(0);
            return;
        }

        arg2.writeInt(1);
        arg3.writeToParcel(arg2, 0);
    }

    public static boolean zza(Parcel arg0) {
        if(arg0.readInt() != 0) {
            return 1;
        }

        return 0;
    }
}

