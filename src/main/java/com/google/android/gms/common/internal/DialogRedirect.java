package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class DialogRedirect implements DialogInterface$OnClickListener {
    public DialogRedirect() {
        super();
    }

    public static DialogRedirect getInstance(Activity arg1, Intent arg2, int arg3) {
        return new zac(arg2, arg1, arg3);
    }

    public static DialogRedirect getInstance(@NonNull Fragment arg1, Intent arg2, int arg3) {
        return new zad(arg2, arg1, arg3);
    }

    public static DialogRedirect getInstance(@NonNull LifecycleFragment arg1, Intent arg2, int arg3) {
        return new zae(arg2, arg1, arg3);
    }

    public void onClick(DialogInterface arg3, int arg4) {
        try {
            this.redirect();
        }
        catch(Throwable v4) {
        label_11:
            arg3.dismiss();
            throw v4;
        }
        catch(ActivityNotFoundException v4_1) {
            try {
                Log.e("DialogRedirect", "Failed to start resolution intent", ((Throwable)v4_1));
            }
            catch(Throwable v4) {
                goto label_11;
            }

            arg3.dismiss();
            return;
        }

        arg3.dismiss();
    }

    protected abstract void redirect();
}

