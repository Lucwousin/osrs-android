package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.PlatformVersion;

public abstract class zab {
    private final int type;

    public zab(int arg1) {
        super();
        this.type = arg1;
    }

    public abstract void zaa(@NonNull Status arg1);

    public abstract void zaa(@NonNull RuntimeException arg1);

    public abstract void zaa(@NonNull zaab arg1, boolean arg2);

    public abstract void zaa(zaa arg1) throws DeadObjectException;

    private static Status zaa(RemoteException arg2) {
        StringBuilder v0 = new StringBuilder();
        if((PlatformVersion.isAtLeastIceCreamSandwichMR1()) && ((arg2 instanceof TransactionTooLargeException))) {
            v0.append("TransactionTooLargeException: ");
        }

        v0.append(arg2.getLocalizedMessage());
        return new Status(8, v0.toString());
    }

    static Status zab(RemoteException arg0) {
        return zab.zaa(arg0);
    }
}

