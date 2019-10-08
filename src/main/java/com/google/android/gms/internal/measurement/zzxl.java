package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzxl extends WeakReference {
    private final int zzbqf;

    public zzxl(Throwable arg1, ReferenceQueue arg2) {
        super(arg1, null);
        if(arg1 != null) {
            this.zzbqf = System.identityHashCode(arg1);
            return;
        }

        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object arg5) {
        if(arg5 != null) {
            if(arg5.getClass() != this.getClass()) {
            }
            else if(this == (((zzxl)arg5))) {
                return 1;
            }
            else if(this.zzbqf == ((zzxl)arg5).zzbqf && this.get() == ((zzxl)arg5).get()) {
                return 1;
            }
        }

        return 0;
    }

    public final int hashCode() {
        return this.zzbqf;
    }
}

