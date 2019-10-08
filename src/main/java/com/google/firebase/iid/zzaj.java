package com.google.firebase.iid;

import android.os.Bundle;

final class zzaj extends zzak {
    zzaj(int arg1, int arg2, Bundle arg3) {
        super(arg1, 2, arg3);
    }

    final boolean zzab() {
        return 1;
    }

    final void zzb(Bundle arg3) {
        if(arg3.getBoolean("ack", false)) {
            ((zzak)this).finish(null);
            return;
        }

        ((zzak)this).zza(new zzal(4, "Invalid response to one way request"));
    }
}

