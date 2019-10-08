package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

final class zad extends DialogRedirect {
    zad(Intent arg1, Fragment arg2, int arg3) {
        this.zaog = arg1;
        this.val$fragment = arg2;
        this.val$requestCode = arg3;
        super();
    }

    public final void redirect() {
        if(this.zaog != null) {
            this.val$fragment.startActivityForResult(this.zaog, this.val$requestCode);
        }
    }
}

