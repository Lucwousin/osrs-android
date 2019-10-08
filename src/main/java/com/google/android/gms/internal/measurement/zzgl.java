package com.google.android.gms.internal.measurement;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzgl extends FutureTask implements Comparable {
    private final String zzanw;
    private final long zzany;
    final boolean zzanz;

    zzgl(zzgi arg3, Runnable arg4, boolean arg5, String arg6) {
        this.zzanx = arg3;
        super(arg4, null);
        Preconditions.checkNotNull(arg6);
        this.zzany = zzgi.zzjw().getAndIncrement();
        this.zzanw = arg6;
        this.zzanz = false;
        if(this.zzany == 0x7FFFFFFFFFFFFFFFL) {
            ((zzhi)arg3).zzgi().zziv().log("Tasks index overflow");
        }
    }

    zzgl(zzgi arg3, Callable arg4, boolean arg5, String arg6) {
        this.zzanx = arg3;
        super(arg4);
        Preconditions.checkNotNull(arg6);
        this.zzany = zzgi.zzjw().getAndIncrement();
        this.zzanw = arg6;
        this.zzanz = arg5;
        if(this.zzany == 0x7FFFFFFFFFFFFFFFL) {
            ((zzhi)arg3).zzgi().zziv().log("Tasks index overflow");
        }
    }

    public final int compareTo(@NonNull Object arg7) {
        int v3 = -1;
        if(this.zzanz != ((zzgl)arg7).zzanz) {
            if(this.zzanz) {
                return v3;
            }

            return 1;
        }

        if(this.zzany < ((zzgl)arg7).zzany) {
            return v3;
        }

        if(this.zzany > ((zzgl)arg7).zzany) {
            return 1;
        }

        this.zzanx.zzgi().zziw().zzg("Two tasks share the same index. index", Long.valueOf(this.zzany));
        return 0;
    }

    protected final void setException(Throwable arg3) {
        this.zzanx.zzgi().zziv().zzg(this.zzanw, arg3);
        if((arg3 instanceof zzgj)) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), arg3);
        }

        super.setException(arg3);
    }
}

