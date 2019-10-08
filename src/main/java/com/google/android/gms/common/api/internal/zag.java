package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag extends zac {
    private final TaskCompletionSource zacm;
    private final TaskApiCall zacq;
    private final StatusExceptionMapper zacr;

    public zag(int arg1, TaskApiCall arg2, TaskCompletionSource arg3, StatusExceptionMapper arg4) {
        super(arg1);
        this.zacm = arg3;
        this.zacq = arg2;
        this.zacr = arg4;
    }

    public final void zaa(@NonNull Status arg3) {
        this.zacm.trySetException(this.zacr.getException(arg3));
    }

    public final void zaa(zaa arg3) throws DeadObjectException {
        try {
            this.zacq.doExecute(arg3.zaab(), this.zacm);
            return;
        }
        catch(RuntimeException v3) {
            ((zab)this).zaa(v3);
            return;
        }
        catch(RemoteException v3_1) {
            ((zab)this).zaa(zab.zab(v3_1));
            return;
        }
        catch(DeadObjectException v3_2) {
            throw v3_2;
        }
    }

    public final void zaa(@NonNull zaab arg2, boolean arg3) {
        arg2.zaa(this.zacm, arg3);
    }

    public final void zaa(@NonNull RuntimeException arg2) {
        this.zacm.trySetException(((Exception)arg2));
    }

    @Nullable public final Feature[] zab(zaa arg1) {
        return this.zacq.zabt();
    }

    public final boolean zac(zaa arg1) {
        return this.zacq.shouldAutoResolveMissingFeatures();
    }
}

