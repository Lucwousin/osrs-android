package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zzjo {
    private final Clock clock;
    private long startTime;

    public zzjo(Clock arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        this.clock = arg1;
    }

    public final void clear() {
        this.startTime = 0;
    }

    public final void start() {
        this.startTime = this.clock.elapsedRealtime();
    }

    public final boolean zzj(long arg4) {
        if(this.startTime == 0) {
            return 1;
        }

        if(this.clock.elapsedRealtime() - this.startTime >= 3600000) {
            return 1;
        }

        return 0;
    }
}

