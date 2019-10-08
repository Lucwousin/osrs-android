package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;

public final class zac extends zaa {
    private WeakReference zanb;

    public zac(ImageView arg2, int arg3) {
        super(null, arg3);
        Asserts.checkNotNull(arg2);
        this.zanb = new WeakReference(arg2);
    }

    public zac(ImageView arg2, Uri arg3) {
        super(arg3, 0);
        Asserts.checkNotNull(arg2);
        this.zanb = new WeakReference(arg2);
    }

    public final boolean equals(Object arg4) {
        if(!(arg4 instanceof zac)) {
            return 0;
        }

        if(this == (((zac)arg4))) {
            return 1;
        }

        Object v2 = this.zanb.get();
        arg4 = ((zac)arg4).zanb.get();
        if(arg4 != null && v2 != null && (Objects.equal(arg4, v2))) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    protected final void zaa(Drawable arg6, boolean arg7, boolean arg8, boolean arg9) {
        zae v6;
        Object v0 = this.zanb.get();
        if(v0 != null) {
            int v1 = 0;
            int v2 = (arg8) || (arg9) ? 0 : 1;
            if(v2 != 0 && ((v0 instanceof zaj))) {
                int v3 = zaj.zach();
                if(this.zamw != 0) {
                    if(v3 != this.zamw) {
                        goto label_17;
                    }

                    return;
                }
            }

        label_17:
            arg7 = ((zaa)this).zaa(arg7, arg8);
            Uri v8 = null;
            if(arg7) {
                Drawable v3_1 = ((ImageView)v0).getDrawable();
                if(v3_1 == null) {
                    v3_1 = ((Drawable)v8);
                }
                else if((v3_1 instanceof zae)) {
                    v3_1 = ((zae)v3_1).zacf();
                }

                v6 = new zae(v3_1, arg6);
            }

            ((ImageView)v0).setImageDrawable(((Drawable)v6));
            if((v0 instanceof zaj)) {
                if(arg9) {
                    v8 = this.zamu.uri;
                }

                zaj.zaa(v8);
                if(v2 != 0) {
                    v1 = this.zamw;
                }

                zaj.zai(v1);
            }

            if(!arg7) {
                return;
            }

            v6.startTransition(0xFA);
        }
    }
}

