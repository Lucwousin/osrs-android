package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

public class AccountAccessor extends Stub {
    public boolean equals(Object arg1) {
        throw new NoSuchMethodError();
    }

    public final Account getAccount() {
        throw new NoSuchMethodError();
    }

    @KeepForSdk public static Account getAccountBinderSafe(IAccountAccessor arg3) {
        Account v3_1;
        if(arg3 != null) {
            long v0 = Binder.clearCallingIdentity();
            try {
                v3_1 = arg3.getAccount();
            }
            catch(Throwable v3) {
            label_12:
                Binder.restoreCallingIdentity(v0);
                throw v3;
            }
            catch(RemoteException ) {
                try {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
                catch(Throwable v3) {
                    goto label_12;
                }

                Binder.restoreCallingIdentity(v0);
                goto label_14;
            }

            Binder.restoreCallingIdentity(v0);
        }
        else {
        label_14:
            v3_1 = null;
        }

        return v3_1;
    }
}

