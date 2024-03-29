package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zak implements Parcelable$Creator {
    public zak() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        ConnectionResult v1 = null;
        int v2 = 0;
        ResolveAccountResponse v3 = ((ResolveAccountResponse)v1);
        while(arg7.dataPosition() < v0) {
            int v4 = SafeParcelReader.readHeader(arg7);
            switch(SafeParcelReader.getFieldId(v4)) {
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_14;
                }
                case 3: {
                    goto label_11;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_17:
            v2 = SafeParcelReader.readInt(arg7, v4);
            continue;
        label_11:
            Parcelable v3_1 = SafeParcelReader.createParcelable(arg7, v4, ResolveAccountResponse.CREATOR);
            continue;
        label_14:
            Parcelable v1_1 = SafeParcelReader.createParcelable(arg7, v4, ConnectionResult.CREATOR);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new zaj(v2, v1, v3);
    }

    public final Object[] newArray(int arg1) {
        return new zaj[arg1];
    }
}

