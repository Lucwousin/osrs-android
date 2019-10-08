package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

public final class zae extends zab {
    private final ApiMethodImpl zacn;

    public zae(int arg1, ApiMethodImpl arg2) {
        super(arg1);
        this.zacn = arg2;
    }

    public final void zaa(@NonNull Status arg2) {
        this.zacn.setFailedResult(arg2);
    }

    public final void zaa(zaa arg2) throws DeadObjectException {
        try {
            this.zacn.run(arg2.zaab());
            return;
        }
        catch(RuntimeException v2) {
            ((zab)this).zaa(v2);
            return;
        }
    }

    public final void zaa(@NonNull zaab arg2, boolean arg3) {
        arg2.zaa(this.zacn, arg3);
    }

    public final void zaa(@NonNull RuntimeException arg5) {
        String v1 = arg5.getClass().getSimpleName();
        String v5 = arg5.getLocalizedMessage();
        StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 2 + String.valueOf(v5).length());
        v3.append(v1);
        v3.append(": ");
        v3.append(v5);
        this.zacn.setFailedResult(new Status(10, v3.toString()));
    }
}

