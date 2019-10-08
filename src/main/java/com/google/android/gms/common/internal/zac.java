package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class zac extends DialogRedirect {
    zac(Intent arg1, Activity arg2, int arg3) {
        this.zaog = arg1;
        this.val$activity = arg2;
        this.val$requestCode = arg3;
        super();
    }

    public final void redirect() {
        if(this.zaog != null) {
            this.val$activity.startActivityForResult(this.zaog, this.val$requestCode);
        }
    }
}

