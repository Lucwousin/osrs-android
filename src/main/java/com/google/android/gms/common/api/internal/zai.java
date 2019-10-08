package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public final class zai {
    private final Api mApi;
    private final ApiOptions zabh;
    private final boolean zact;
    private final int zacu;

    private zai(Api arg2) {
        super();
        this.zact = true;
        this.mApi = arg2;
        this.zabh = null;
        this.zacu = System.identityHashCode(this);
    }

    private zai(Api arg2, ApiOptions arg3) {
        super();
        this.zact = false;
        this.mApi = arg2;
        this.zabh = arg3;
        this.zacu = Objects.hashCode(new Object[]{this.mApi, this.zabh});
    }

    public final boolean equals(Object arg5) {
        if((((zai)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zai)) {
            return 0;
        }

        if(!this.zact && !((zai)arg5).zact && (Objects.equal(this.mApi, ((zai)arg5).mApi)) && (Objects.equal(this.zabh, ((zai)arg5).zabh))) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return this.zacu;
    }

    public static zai zaa(Api arg1, ApiOptions arg2) {
        return new zai(arg1, arg2);
    }

    public static zai zaa(Api arg1) {
        return new zai(arg1);
    }

    public final String zan() {
        return this.mApi.getName();
    }
}

