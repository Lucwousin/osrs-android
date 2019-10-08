package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zzfc extends zzn implements zzfa {
    zzfc(IBinder arg2) {
        super(arg2, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List zza(zzeb arg2, boolean arg3) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        zzp.writeBoolean(v0, arg3);
        Parcel v2 = ((zzn)this).transactAndReadException(7, v0);
        ArrayList v3 = v2.createTypedArrayList(zzka.CREATOR);
        v2.recycle();
        return ((List)v3);
    }

    public final List zza(String arg2, String arg3, zzeb arg4) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        v0.writeString(arg3);
        zzp.zza(v0, ((Parcelable)arg4));
        Parcel v2 = ((zzn)this).transactAndReadException(16, v0);
        ArrayList v3 = v2.createTypedArrayList(zzef.CREATOR);
        v2.recycle();
        return ((List)v3);
    }

    public final List zza(String arg2, String arg3, String arg4, boolean arg5) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        v0.writeString(arg3);
        v0.writeString(arg4);
        zzp.writeBoolean(v0, arg5);
        Parcel v2 = ((zzn)this).transactAndReadException(15, v0);
        ArrayList v3 = v2.createTypedArrayList(zzka.CREATOR);
        v2.recycle();
        return ((List)v3);
    }

    public final List zza(String arg2, String arg3, boolean arg4, zzeb arg5) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        v0.writeString(arg3);
        zzp.writeBoolean(v0, arg4);
        zzp.zza(v0, ((Parcelable)arg5));
        Parcel v2 = ((zzn)this).transactAndReadException(14, v0);
        ArrayList v3 = v2.createTypedArrayList(zzka.CREATOR);
        v2.recycle();
        return ((List)v3);
    }

    public final void zza(long arg2, String arg4, String arg5, String arg6) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        v0.writeLong(arg2);
        v0.writeString(arg4);
        v0.writeString(arg5);
        v0.writeString(arg6);
        ((zzn)this).transactAndReadExceptionReturnVoid(10, v0);
    }

    public final void zza(zzeb arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        ((zzn)this).transactAndReadExceptionReturnVoid(4, v0);
    }

    public final void zza(zzef arg2, zzeb arg3) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        zzp.zza(v0, ((Parcelable)arg3));
        ((zzn)this).transactAndReadExceptionReturnVoid(12, v0);
    }

    public final void zza(zzex arg2, zzeb arg3) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        zzp.zza(v0, ((Parcelable)arg3));
        ((zzn)this).transactAndReadExceptionReturnVoid(1, v0);
    }

    public final void zza(zzex arg2, String arg3, String arg4) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        v0.writeString(arg3);
        v0.writeString(arg4);
        ((zzn)this).transactAndReadExceptionReturnVoid(5, v0);
    }

    public final void zza(zzka arg2, zzeb arg3) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        zzp.zza(v0, ((Parcelable)arg3));
        ((zzn)this).transactAndReadExceptionReturnVoid(2, v0);
    }

    public final byte[] zza(zzex arg2, String arg3) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        v0.writeString(arg3);
        Parcel v2 = ((zzn)this).transactAndReadException(9, v0);
        byte[] v3 = v2.createByteArray();
        v2.recycle();
        return v3;
    }

    public final void zzb(zzeb arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        ((zzn)this).transactAndReadExceptionReturnVoid(6, v0);
    }

    public final void zzb(zzef arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        ((zzn)this).transactAndReadExceptionReturnVoid(13, v0);
    }

    public final String zzc(zzeb arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        Parcel v2 = ((zzn)this).transactAndReadException(11, v0);
        String v0_1 = v2.readString();
        v2.recycle();
        return v0_1;
    }

    public final void zzd(zzeb arg2) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        zzp.zza(v0, ((Parcelable)arg2));
        ((zzn)this).transactAndReadExceptionReturnVoid(18, v0);
    }

    public final List zze(String arg2, String arg3, String arg4) throws RemoteException {
        Parcel v0 = ((zzn)this).obtainAndWriteInterfaceToken();
        v0.writeString(arg2);
        v0.writeString(arg3);
        v0.writeString(arg4);
        Parcel v2 = ((zzn)this).transactAndReadException(17, v0);
        ArrayList v3 = v2.createTypedArrayList(zzef.CREATOR);
        v2.recycle();
        return ((List)v3);
    }
}

