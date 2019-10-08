package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzec implements Parcelable$Creator {
    public zzec() {
        super();
    }

    public final Object createFromParcel(Parcel arg33) {
        Parcel v0 = arg33;
        int v1 = SafeParcelReader.validateObjectHeader(arg33);
        long v14 = 0;
        long v16 = v14;
        long v24 = v16;
        long v26 = v24;
        String v10 = null;
        String v11 = v10;
        String v12 = v11;
        String v13 = v12;
        String v18 = v13;
        String v23 = v18;
        long v21 = -2147483648;
        boolean v19 = true;
        boolean v20 = false;
        int v28 = 0;
        boolean v29 = true;
        boolean v30 = true;
        boolean v31;
        for(v31 = false; arg33.dataPosition() < v1; v31 = SafeParcelReader.readBoolean(v0, v2)) {
            int v2 = SafeParcelReader.readHeader(arg33);
            switch(SafeParcelReader.getFieldId(v2)) {
                case 2: {
                    goto label_63;
                }
                case 3: {
                    goto label_61;
                }
                case 4: {
                    goto label_59;
                }
                case 5: {
                    goto label_57;
                }
                case 6: {
                    goto label_55;
                }
                case 7: {
                    goto label_53;
                }
                case 8: {
                    goto label_51;
                }
                case 9: {
                    goto label_49;
                }
                case 10: {
                    goto label_47;
                }
                case 11: {
                    goto label_45;
                }
                case 12: {
                    goto label_43;
                }
                case 13: {
                    goto label_41;
                }
                case 14: {
                    goto label_39;
                }
                case 15: {
                    goto label_37;
                }
                case 16: {
                    goto label_35;
                }
                case 17: {
                    goto label_33;
                }
                case 18: {
                    goto label_31;
                }
            }

            SafeParcelReader.skipUnknownField(v0, v2);
            continue;
        label_33:
            v30 = SafeParcelReader.readBoolean(v0, v2);
            continue;
        label_35:
            v29 = SafeParcelReader.readBoolean(v0, v2);
            continue;
        label_37:
            v28 = SafeParcelReader.readInt(v0, v2);
            continue;
        label_39:
            v26 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_41:
            v24 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_43:
            v23 = SafeParcelReader.createString(v0, v2);
            continue;
        label_45:
            v21 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_47:
            v20 = SafeParcelReader.readBoolean(v0, v2);
            continue;
        label_49:
            v19 = SafeParcelReader.readBoolean(v0, v2);
            continue;
        label_51:
            v18 = SafeParcelReader.createString(v0, v2);
            continue;
        label_53:
            v16 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_55:
            v14 = SafeParcelReader.readLong(v0, v2);
            continue;
        label_57:
            v13 = SafeParcelReader.createString(v0, v2);
            continue;
        label_59:
            v12 = SafeParcelReader.createString(v0, v2);
            continue;
        label_61:
            v11 = SafeParcelReader.createString(v0, v2);
            continue;
        label_63:
            v10 = SafeParcelReader.createString(v0, v2);
            continue;
        label_31:
        }

        SafeParcelReader.ensureAtEnd(v0, v1);
        return new zzeb(v10, v11, v12, v13, v14, v16, v18, v19, v20, v21, v23, v24, v26, v28, v29, v30, v31);
    }

    public final Object[] newArray(int arg1) {
        return new zzeb[arg1];
    }
}

