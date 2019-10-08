package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;

final class zzzr {
    private boolean zzbnw;
    private final zzabd zzbtz;
    private boolean zzbua;
    private static final zzzr zzbub;

    static {
        zzzr.zzbub = new zzzr(true);
    }

    private zzzr(boolean arg1) {
        super();
        this.zzbua = false;
        this.zzbtz = zzabd.zzag(0);
        if(!this.zzbnw) {
            this.zzbtz.zzru();
            this.zzbnw = true;
        }
    }

    private zzzr() {
        super();
        this.zzbua = false;
        this.zzbtz = zzabd.zzag(16);
    }

    public final Object clone() throws CloneNotSupportedException {
        zzzr v0 = new zzzr();
        int v1;
        for(v1 = 0; v1 < this.zzbtz.zzuy(); ++v1) {
            Map$Entry v2 = this.zzbtz.zzah(v1);
            v0.zza(v2.getKey(), v2.getValue());
        }

        Iterator v1_1 = this.zzbtz.zzuz().iterator();
        while(v1_1.hasNext()) {
            Object v2_1 = v1_1.next();
            v0.zza(((Map$Entry)v2_1).getKey(), ((Map$Entry)v2_1).getValue());
        }

        v0.zzbua = this.zzbua;
        return v0;
    }

    public final boolean equals(Object arg2) {
        if(this == (((zzzr)arg2))) {
            return 1;
        }

        if(!(arg2 instanceof zzzr)) {
            return 0;
        }

        return this.zzbtz.equals(((zzzr)arg2).zzbtz);
    }

    public final int hashCode() {
        return this.zzbtz.hashCode();
    }

    public final Iterator iterator() {
        if(this.zzbua) {
            return new zzaac(this.zzbtz.entrySet().iterator());
        }

        return this.zzbtz.entrySet().iterator();
    }

    private static void zza(zzabu arg2, Object arg3) {
        zzzw.checkNotNull(arg3);
        boolean v1 = false;
        switch(zzzs.zzbuc[arg2.zzvk().ordinal()]) {
            case 1: {
                goto label_35;
            }
            case 2: {
                goto label_33;
            }
            case 3: {
                goto label_31;
            }
            case 4: {
                goto label_29;
            }
            case 5: {
                goto label_27;
            }
            case 6: {
                goto label_25;
            }
            case 7: {
                goto label_20;
            }
            case 8: {
                goto label_14;
            }
            case 9: {
                goto label_9;
            }
        }

        goto label_37;
    label_33:
        boolean v0 = arg3 instanceof Long;
        goto label_36;
    label_35:
        v0 = arg3 instanceof Integer;
        goto label_36;
    label_20:
        if((arg3 instanceof zzzb)) {
            goto label_18;
        }

        if(!(arg3 instanceof byte[])) {
            goto label_37;
        }

        goto label_18;
    label_25:
        v0 = arg3 instanceof String;
        goto label_36;
    label_9:
        if((arg3 instanceof zzaaq)) {
            goto label_18;
        }

        if(!(arg3 instanceof zzzz)) {
            goto label_37;
        }

        goto label_18;
    label_27:
        v0 = arg3 instanceof Boolean;
        goto label_36;
    label_29:
        v0 = arg3 instanceof Double;
        goto label_36;
    label_14:
        if(!(arg3 instanceof Integer) && !(arg3 instanceof zzzx)) {
        }
        else {
        label_18:
            v1 = true;
            goto label_37;
        label_31:
            v0 = arg3 instanceof Float;
        label_36:
            v1 = v0;
        }

    label_37:
        if(v1) {
            return;
        }

        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private final void zza(zzzt arg6, Object arg7) {
        ArrayList v7;
        if(!arg6.zztz()) {
            zzzr.zza(arg6.zzty(), arg7);
        }
        else if((arg7 instanceof List)) {
            ArrayList v0 = new ArrayList();
            ((List)v0).addAll(((Collection)arg7));
            v7 = v0;
            int v1 = v7.size();
            int v2 = 0;
            while(v2 < v1) {
                Object v3 = v7.get(v2);
                ++v2;
                zzzr.zza(arg6.zzty(), v3);
            }

            v7 = v0;
        }
        else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }

        if((v7 instanceof zzzz)) {
            this.zzbua = true;
        }

        this.zzbtz.zza(((Comparable)arg6), v7);
    }

    public static zzzr zztx() {
        return zzzr.zzbub;
    }
}

