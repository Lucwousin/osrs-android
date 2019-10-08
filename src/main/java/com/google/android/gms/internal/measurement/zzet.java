package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzet {
    final String name;
    final long zzahh;
    final long zzahi;
    final long zzahj;
    final long zzahk;
    final Long zzahl;
    final Long zzahm;
    final Boolean zzahn;
    final String zzth;

    zzet(String arg13, String arg14, long arg15, long arg17, long arg19, long arg21, Long arg23, Long arg24, Boolean arg25) {
        zzet v0 = this;
        long v1 = arg15;
        long v3 = arg17;
        long v5 = arg21;
        super();
        Preconditions.checkNotEmpty(arg13);
        Preconditions.checkNotEmpty(arg14);
        boolean v7 = false;
        long v9 = 0;
        boolean v11 = v1 >= v9 ? true : false;
        Preconditions.checkArgument(v11);
        v11 = v3 >= v9 ? true : false;
        Preconditions.checkArgument(v11);
        if(v5 >= v9) {
            v7 = true;
        }

        Preconditions.checkArgument(v7);
        v0.zzth = arg13;
        v0.name = arg14;
        v0.zzahh = v1;
        v0.zzahi = v3;
        v0.zzahj = arg19;
        v0.zzahk = v5;
        v0.zzahl = arg23;
        v0.zzahm = arg24;
        v0.zzahn = arg25;
    }

    final zzet zza(Long arg17, Long arg18, Boolean arg19) {
        zzet v0 = this;
        Boolean v15 = arg19 == null || (arg19.booleanValue()) ? arg19 : null;
        return new zzet(v0.zzth, v0.name, v0.zzahh, v0.zzahi, v0.zzahj, v0.zzahk, arg17, arg18, v15);
    }

    final zzet zzah(long arg17) {
        return new zzet(this.zzth, this.name, this.zzahh, this.zzahi, arg17, this.zzahk, this.zzahl, this.zzahm, this.zzahn);
    }

    final zzet zzai(long arg17) {
        return new zzet(this.zzth, this.name, this.zzahh, this.zzahi, this.zzahj, arg17, this.zzahl, this.zzahm, this.zzahn);
    }

    final zzet zzim() {
        return new zzet(this.zzth, this.name, this.zzahh + 1, 1 + this.zzahi, this.zzahj, this.zzahk, this.zzahl, this.zzahm, this.zzahn);
    }
}

