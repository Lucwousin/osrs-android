package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable$Creator {
    public zzd() {
        super();
    }

    public final Object createFromParcel(Parcel arg8) {
        Parcelable v3_1;
        int v0 = SafeParcelReader.validateObjectHeader(arg8);
        String v1 = "";
        String v2 = "";
        GoogleSignInAccount v3 = null;
        while(arg8.dataPosition() < v0) {
            int v4 = SafeParcelReader.readHeader(arg8);
            int v5 = SafeParcelReader.getFieldId(v4);
            if(v5 != 4) {
                switch(v5) {
                    case 7: {
                        goto label_15;
                    }
                    case 8: {
                        goto label_13;
                    }
                }

                SafeParcelReader.skipUnknownField(arg8, v4);
                continue;
            label_13:
                v2 = SafeParcelReader.createString(arg8, v4);
                continue;
            label_15:
                v3_1 = SafeParcelReader.createParcelable(arg8, v4, GoogleSignInAccount.CREATOR);
                continue;
            }

            v1 = SafeParcelReader.createString(arg8, v4);
        }

        SafeParcelReader.ensureAtEnd(arg8, v0);
        return new SignInAccount(v1, ((GoogleSignInAccount)v3_1), v2);
    }

    public final Object[] newArray(int arg1) {
        return new SignInAccount[arg1];
    }
}

