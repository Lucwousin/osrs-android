package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzeg implements Parcelable$Creator {
    public zzeg() {
        super();
    }

    public final Object createFromParcel(Parcel arg22) {
        Parcelable v9_1;
        Parcel v0 = arg22;
        int v1 = SafeParcelReader.validateObjectHeader(arg22);
        long v10 = 0;
        long v15 = v10;
        long v18 = v15;
        String v7 = null;
        String v8 = v7;
        zzka v9 = ((zzka)v8);
        String v13 = ((String)v9);
        zzex v14 = ((zzex)v13);
        zzex v17 = v14;
        zzex v20 = v17;
        boolean v12 = false;
        while(arg22.dataPosition() < v1) {
            int v2 = SafeParcelReader.readHeader(arg22);
            switch(SafeParcelReader.getFieldId(v2)) {
                case 2: {
                    goto label_51;
                }
                case 3: {
                    goto label_49;
                }
                case 4: {
                    goto label_45;
                }
                case 5: {
                    goto label_43;
                }
                case 6: {
                    goto label_41;
                }
                case 7: {
                    goto label_39;
                }
                case 8: {
                    goto label_35;
                }
                case 9: {
                    goto label_33;
                }
                case 10: {
                    goto label_29;
                }
                case 11: {
                    goto label_27;
                }
                case 12: {
                    goto label_23;
                }
            }

            SafeParcelReader.skipUnknownField(v0, v2);
            continue;
        label_49:
            v8 = SafeParcelReader.createString(v0, v2);
            continue;
        label_33:
            v15 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_51:
            v7 = SafeParcelReader.createString(v0, v2);
            continue;
        label_35:
            Parcelable v14_1 = SafeParcelReader.createParcelable(v0, v2, zzex.CREATOR);
            continue;
        label_39:
            v13 = SafeParcelReader.createString(v0, v2);
            continue;
        label_23:
            Parcelable v20_1 = SafeParcelReader.createParcelable(v0, v2, zzex.CREATOR);
            continue;
        label_41:
            v12 = SafeParcelReader.readBoolean(v0, v2);
            continue;
        label_43:
            v10 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_27:
            v18 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_45:
            v9_1 = SafeParcelReader.createParcelable(v0, v2, zzka.CREATOR);
            continue;
        label_29:
            Parcelable v17_1 = SafeParcelReader.createParcelable(v0, v2, zzex.CREATOR);
        }

        SafeParcelReader.ensureAtEnd(v0, v1);
        return new zzef(v7, v8, ((zzka)v9_1), v10, v12, v13, v14, v15, v17, v18, v20);
    }

    public final Object[] newArray(int arg1) {
        return new zzef[arg1];
    }
}

