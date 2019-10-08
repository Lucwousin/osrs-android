package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class zzfb extends zzo implements zzfa {
    public zzfb() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    protected final boolean dispatchTransaction(int arg7, Parcel arg8, Parcel arg9, int arg10) throws RemoteException {
        switch(arg7) {
            case 1: {
                goto label_88;
            }
            case 2: {
                goto label_82;
            }
            case 4: {
                goto label_78;
            }
            case 5: {
                goto label_72;
            }
            case 6: {
                goto label_68;
            }
            case 7: {
                goto label_61;
            }
            case 9: {
                goto label_54;
            }
            case 10: {
                goto label_47;
            }
            case 11: {
                goto label_41;
            }
            case 12: {
                goto label_35;
            }
            case 13: {
                goto label_31;
            }
            case 14: {
                goto label_24;
            }
            case 15: {
                goto label_18;
            }
            case 16: {
                goto label_12;
            }
            case 17: {
                goto label_7;
            }
            case 18: {
                goto label_3;
            }
        }

        return 0;
    label_35:
        this.zza(zzp.zza(arg8, zzef.CREATOR), zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_3:
        this.zzd(zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_68:
        this.zzb(zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_7:
        List v7 = this.zze(arg8.readString(), arg8.readString(), arg8.readString());
        goto label_65;
    label_72:
        this.zza(zzp.zza(arg8, zzex.CREATOR), arg8.readString(), arg8.readString());
        goto label_93;
    label_41:
        String v7_1 = this.zzc(zzp.zza(arg8, zzeb.CREATOR));
        arg9.writeNoException();
        arg9.writeString(v7_1);
        return 1;
    label_12:
        v7 = this.zza(arg8.readString(), arg8.readString(), zzp.zza(arg8, zzeb.CREATOR));
        goto label_65;
    label_78:
        this.zza(zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_47:
        this.zza(arg8.readLong(), arg8.readString(), arg8.readString(), arg8.readString());
        goto label_93;
    label_82:
        this.zza(zzp.zza(arg8, zzka.CREATOR), zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_18:
        v7 = this.zza(arg8.readString(), arg8.readString(), arg8.readString(), zzp.zza(arg8));
        goto label_65;
    label_54:
        byte[] v7_2 = this.zza(zzp.zza(arg8, zzex.CREATOR), arg8.readString());
        arg9.writeNoException();
        arg9.writeByteArray(v7_2);
        return 1;
    label_88:
        this.zza(zzp.zza(arg8, zzex.CREATOR), zzp.zza(arg8, zzeb.CREATOR));
        goto label_93;
    label_24:
        v7 = this.zza(arg8.readString(), arg8.readString(), zzp.zza(arg8), zzp.zza(arg8, zzeb.CREATOR));
        goto label_65;
    label_61:
        v7 = this.zza(zzp.zza(arg8, zzeb.CREATOR), zzp.zza(arg8));
    label_65:
        arg9.writeNoException();
        arg9.writeTypedList(v7);
        return 1;
    label_31:
        this.zzb(zzp.zza(arg8, zzef.CREATOR));
    label_93:
        arg9.writeNoException();
        return 1;
    }
}

