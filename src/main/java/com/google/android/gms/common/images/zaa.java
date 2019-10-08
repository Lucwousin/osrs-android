package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

public abstract class zaa {
    final zab zamu;
    private int zamv;
    protected int zamw;
    private boolean zamx;
    private boolean zamy;
    private boolean zamz;
    private boolean zana;

    public zaa(Uri arg3, int arg4) {
        super();
        this.zamv = 0;
        this.zamw = 0;
        this.zamx = false;
        this.zamy = true;
        this.zamz = false;
        this.zana = true;
        this.zamu = new zab(arg3);
        this.zamw = arg4;
    }

    final void zaa(Context arg1, zak arg2, boolean arg3) {
        Drawable v1 = this.zamw != 0 ? arg1.getResources().getDrawable(this.zamw) : null;
        this.zaa(v1, arg3, false, false);
    }

    final void zaa(Context arg2, Bitmap arg3, boolean arg4) {
        Asserts.checkNotNull(arg3);
        this.zaa(new BitmapDrawable(arg2.getResources(), arg3), arg4, false, true);
    }

    final void zaa(Context arg2, zak arg3) {
        if(this.zana) {
            this.zaa(null, false, true, false);
        }
    }

    protected abstract void zaa(Drawable arg1, boolean arg2, boolean arg3, boolean arg4);

    protected final boolean zaa(boolean arg2, boolean arg3) {
        if((this.zamy) && !arg3 && !arg2) {
            return 1;
        }

        return 0;
    }
}

