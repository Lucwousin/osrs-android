package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import javax.annotation.concurrent.GuardedBy;

final class zaap extends zabf {
    zaap(zaan arg1, zabd arg2, ConnectionProgressReportCallbacks arg3) {
        this.zagn = arg3;
        super(arg2);
    }

    @GuardedBy(value="mLock") public final void zaan() {
        this.zagn.onReportServiceBinding(new ConnectionResult(16, null));
    }
}

