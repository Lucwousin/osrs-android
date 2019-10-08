package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzx implements Parcelable$Creator {
    public zzx() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        String v1 = null;
        GoogleSignInOptions v2 = ((GoogleSignInOptions)v1);
        while(arg7.dataPosition() < v0) {
            int v3 = SafeParcelReader.readHeader(arg7);
            int v4 = SafeParcelReader.getFieldId(v3);
            if(v4 != 2) {
                if(v4 != 5) {
                    SafeParcelReader.skipUnknownField(arg7, v3);
                    continue;
                }

                Parcelable v2_1 = SafeParcelReader.createParcelable(arg7, v3, GoogleSignInOptions.CREATOR);
                continue;
            }

            v1 = SafeParcelReader.createString(arg7, v3);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new SignInConfiguration(v1, v2);
    }

    public final Object[] newArray(int arg1) {
        return new SignInConfiguration[arg1];
    }
}

