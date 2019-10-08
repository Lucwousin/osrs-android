package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    protected boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 3: {
                goto label_21;
            }
            case 4: {
                goto label_17;
            }
            case 6: {
                goto label_13;
            }
            case 7: {
                goto label_7;
            }
            case 8: {
                goto label_3;
            }
        }

        return 0;
    label_17:
        this.zag(zac.zaa(arg2, Status.CREATOR));
        goto label_26;
    label_3:
        this.zab(zac.zaa(arg2, zaj.CREATOR));
        goto label_26;
    label_21:
        this.zaa(zac.zaa(arg2, ConnectionResult.CREATOR), zac.zaa(arg2, zaa.CREATOR));
        goto label_26;
    label_7:
        this.zaa(zac.zaa(arg2, Status.CREATOR), zac.zaa(arg2, GoogleSignInAccount.CREATOR));
        goto label_26;
    label_13:
        this.zah(zac.zaa(arg2, Status.CREATOR));
    label_26:
        arg3.writeNoException();
        return 1;
    }
}

