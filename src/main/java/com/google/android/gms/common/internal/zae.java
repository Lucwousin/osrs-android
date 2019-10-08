package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

final class zae extends DialogRedirect {
    zae(Intent arg1, LifecycleFragment arg2, int arg3) {
        this.zaog = arg1;
        this.zaoh = arg2;
        this.val$requestCode = arg3;
        super();
    }

    public final void redirect() {
        if(this.zaog != null) {
            this.zaoh.startActivityForResult(this.zaog, this.val$requestCode);
        }
    }
}

