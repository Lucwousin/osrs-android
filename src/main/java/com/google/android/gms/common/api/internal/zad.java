package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad extends zac {
    protected final TaskCompletionSource zacm;

    public zad(int arg1, TaskCompletionSource arg2) {
        super(arg1);
        this.zacm = arg2;
    }

    public void zaa(@NonNull Status arg3) {
        this.zacm.trySetException(new ApiException(arg3));
    }

    public final void zaa(zaa arg2) throws DeadObjectException {
        try {
            this.zad(arg2);
            return;
        }
        catch(RuntimeException v2) {
            ((zab)this).zaa(v2);
            return;
        }
        catch(RemoteException v2_1) {
            ((zab)this).zaa(zab.zab(v2_1));
            return;
        }
        catch(DeadObjectException v2_2) {
            ((zab)this).zaa(zab.zab(((RemoteException)v2_2)));
            throw v2_2;
        }
    }

    public void zaa(@NonNull zaab arg1, boolean arg2) {
    }

    public void zaa(@NonNull RuntimeException arg2) {
        this.zacm.trySetException(((Exception)arg2));
    }

    protected abstract void zad(zaa arg1) throws RemoteException;
}

