package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zab {
    public final Uri uri;

    public zab(Uri arg1) {
        super();
        this.uri = arg1;
    }

    public final boolean equals(Object arg2) {
        if(!(arg2 instanceof zab)) {
            return 0;
        }

        if(this == (((zab)arg2))) {
            return 1;
        }

        return Objects.equal(((zab)arg2).uri, this.uri);
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.uri});
    }
}

