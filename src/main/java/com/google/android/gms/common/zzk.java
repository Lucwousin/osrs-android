package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

@Class(creator="GoogleCertificatesQueryCreator") public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getAllowTestKeys", id=3) private final boolean zzaa;
    @Field(getter="getCallingPackage", id=1) private final String zzy;
    @Field(getter="getCallingCertificateBinder", id=2, type="android.os.IBinder") @Nullable private final zze zzz;

    static {
        zzk.CREATOR = new zzl();
    }

    zzk(String arg1, @Nullable zze arg2, boolean arg3) {
        super();
        this.zzy = arg1;
        this.zzz = arg2;
        this.zzaa = arg3;
    }

    @Constructor zzk(@Param(id=1) String arg1, @Param(id=2) @Nullable IBinder arg2, @Param(id=3) boolean arg3) {
        super();
        this.zzy = arg1;
        this.zzz = zzk.zza(arg2);
        this.zzaa = arg3;
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        IBinder v0;
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeString(arg4, 1, this.zzy, false);
        if(this.zzz == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            v0 = null;
        }
        else {
            v0 = this.zzz.asBinder();
        }

        SafeParcelWriter.writeIBinder(arg4, 2, v0, false);
        SafeParcelWriter.writeBoolean(arg4, 3, this.zzaa);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }

    @Nullable private static zze zza(@Nullable IBinder arg3) {
        zzf v0_1;
        IObjectWrapper v3_1;
        zze v0 = null;
        if(arg3 == null) {
            return v0;
        }

        try {
            v3_1 = zzj.zzb(arg3).zzb();
            if(v3_1 != null) {
                goto label_8;
            }
        }
        catch(RemoteException v3) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", ((Throwable)v3));
            return v0;
        }

        Object v3_2 = v0;
        goto label_9;
    label_8:
        v3_2 = ObjectWrapper.unwrap(v3_1);
    label_9:
        if(v3_2 != null) {
            v0_1 = new zzf(((byte[])v3_2));
        }
        else {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
        }

        return ((zze)v0_1);
    }
}

