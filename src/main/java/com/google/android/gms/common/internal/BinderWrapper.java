package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepForSdk @KeepName public final class BinderWrapper implements Parcelable {
    public static final Parcelable$Creator CREATOR;
    private IBinder zzcy;

    static {
        BinderWrapper.CREATOR = new zza();
    }

    public BinderWrapper() {
        super();
        this.zzcy = null;
    }

    @KeepForSdk public BinderWrapper(IBinder arg2) {
        super();
        this.zzcy = null;
        this.zzcy = arg2;
    }

    private BinderWrapper(Parcel arg2) {
        super();
        this.zzcy = null;
        this.zzcy = arg2.readStrongBinder();
    }

    BinderWrapper(Parcel arg1, zza arg2) {
        this(arg1);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel arg1, int arg2) {
        arg1.writeStrongBinder(this.zzcy);
    }
}

