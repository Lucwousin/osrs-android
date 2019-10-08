package com.google.android.gms.internal.measurement;

final class zzfj implements Runnable {
    zzfj(zzfi arg1, int arg2, String arg3, Object arg4, Object arg5, Object arg6) {
        this.zzalb = arg1;
        this.zzakw = arg2;
        this.zzakx = arg3;
        this.zzaky = arg4;
        this.zzakz = arg5;
        this.zzala = arg6;
        super();
    }

    public final void run() {
        char v2;
        zzfi v1;
        zzft v0 = this.zzalb.zzacv.zzgj();
        if(!((zzhj)v0).isInitialized()) {
            this.zzalb.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }

        if(zzfi.zza(this.zzalb) == 0) {
            if(this.zzalb.zzgk().zzds()) {
                v1 = this.zzalb;
                this.zzalb.zzgl();
                v2 = 'C';
            }
            else {
                v1 = this.zzalb;
                this.zzalb.zzgl();
                v2 = 'c';
            }

            zzfi.zza(v1, v2);
        }

        if(zzfi.zzb(this.zzalb) < 0) {
            zzfi.zza(this.zzalb, this.zzalb.zzgk().zzgw());
        }

        char v1_1 = "01VDIWEA?".charAt(this.zzakw);
        v2 = zzfi.zza(this.zzalb);
        long v3 = zzfi.zzb(this.zzalb);
        String v5 = zzfi.zza(true, this.zzakx, this.zzaky, this.zzakz, this.zzala);
        StringBuilder v7 = new StringBuilder(String.valueOf(v5).length() + 24);
        v7.append("2");
        v7.append(v1_1);
        v7.append(v2);
        v7.append(v3);
        v7.append(":");
        v7.append(v5);
        String v1_2 = v7.toString();
        int v3_1 = 0x400;
        if(v1_2.length() > v3_1) {
            v1_2 = this.zzakx.substring(0, v3_1);
        }

        v0.zzals.zzc(v1_2, 1);
    }
}

