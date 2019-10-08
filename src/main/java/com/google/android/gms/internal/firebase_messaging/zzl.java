package com.google.android.gms.internal.firebase_messaging;

final class zzl extends zzi {
    private final zzj zzm;

    zzl() {
        super();
        this.zzm = new zzj();
    }

    public final void zza(Throwable arg3, Throwable arg4) {
        if(arg4 != arg3) {
            if(arg4 != null) {
                this.zzm.zza(arg3, true).add(arg4);
                return;
            }

            throw new NullPointerException("The suppressed exception cannot be null.");
        }

        throw new IllegalArgumentException("Self suppression is not allowed.", arg4);
    }
}

