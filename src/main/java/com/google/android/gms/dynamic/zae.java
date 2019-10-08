package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View$OnClickListener;
import android.view.View;

final class zae implements View$OnClickListener {
    zae(Context arg1, Intent arg2) {
        this.val$context = arg1;
        this.zarn = arg2;
        super();
    }

    public final void onClick(View arg3) {
        try {
            this.val$context.startActivity(this.zarn);
            return;
        }
        catch(ActivityNotFoundException v3) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", ((Throwable)v3));
            return;
        }
    }
}

