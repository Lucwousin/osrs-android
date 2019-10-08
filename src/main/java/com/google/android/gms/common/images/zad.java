package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zad extends zaa {
    private WeakReference zanc;

    public zad(OnImageLoadedListener arg2, Uri arg3) {
        super(arg3, 0);
        Asserts.checkNotNull(arg2);
        this.zanc = new WeakReference(arg2);
    }

    public final boolean equals(Object arg5) {
        if(!(arg5 instanceof zad)) {
            return 0;
        }

        if(this == (((zad)arg5))) {
            return 1;
        }

        Object v2 = this.zanc.get();
        Object v3 = ((zad)arg5).zanc.get();
        if(v3 != null && v2 != null && (Objects.equal(v3, v2)) && (Objects.equal(((zad)arg5).zamu, this.zamu))) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zamu});
    }

    protected final void zaa(Drawable arg1, boolean arg2, boolean arg3, boolean arg4) {
        if(!arg3) {
            Object v2 = this.zanc.get();
            if(v2 != null) {
                ((OnImageLoadedListener)v2).onImageLoaded(this.zamu.uri, arg1, arg4);
            }
        }
    }
}

