package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzacg implements Cloneable {
    private Object value;
    private zzace zzbzl;
    private List zzbzm;

    zzacg() {
        super();
        this.zzbzm = new ArrayList();
    }

    public final Object clone() throws CloneNotSupportedException {
        return this.zzvv();
    }

    public final boolean equals(Object arg4) {
        if((((zzacg)arg4)) == this) {
            return 1;
        }

        if(!(arg4 instanceof zzacg)) {
            return 0;
        }

        if(this.value != null && ((zzacg)arg4).value != null) {
            if(this.zzbzl != ((zzacg)arg4).zzbzl) {
                return 0;
            }
            else if(!this.zzbzl.zzbze.isArray()) {
                return this.value.equals(((zzacg)arg4).value);
            }
            else if((this.value instanceof byte[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else if((this.value instanceof int[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else if((this.value instanceof long[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else if((this.value instanceof float[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else if((this.value instanceof double[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else if((this.value instanceof boolean[])) {
                return Arrays.equals(this.value, ((zzacg)arg4).value);
            }
            else {
                return Arrays.deepEquals(this.value, ((zzacg)arg4).value);
            }
        }

        if(this.zzbzm != null && ((zzacg)arg4).zzbzm != null) {
            return this.zzbzm.equals(((zzacg)arg4).zzbzm);
        }

        try {
            return Arrays.equals(this.toByteArray(), ((zzacg)arg4).toByteArray());
        }
        catch(IOException v4) {
            throw new IllegalStateException(((Throwable)v4));
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(this.toByteArray()) + 0x20F;
        }
        catch(IOException v0) {
            throw new IllegalStateException(((Throwable)v0));
        }
    }

    private final byte[] toByteArray() throws IOException {
        byte[] v0 = new byte[this.zza()];
        this.zza(zzacb.zzj(v0));
        return v0;
    }

    final int zza() {
        int v4;
        Object v2;
        int v1 = 0;
        if(this.value != null) {
            zzace v0 = this.zzbzl;
            v2 = this.value;
            if(v0.zzbzf) {
                int v3 = Array.getLength(v2);
                v4 = 0;
                while(v1 < v3) {
                    if(Array.get(v2, v1) != null) {
                        v4 += v0.zzv(Array.get(v2, v1));
                    }

                    ++v1;
                }
            }
            else {
                v4 = v0.zzv(v2);
            }
        }
        else {
            Iterator v0_1 = this.zzbzm.iterator();
            for(v4 = 0; v0_1.hasNext(); v4 += zzacb.zzas(((zzacl)v2).tag) + ((zzacl)v2).zzbtj.length) {
                v2 = v0_1.next();
            }
        }

        return v4;
    }

    final void zza(zzacb arg6) throws IOException {
        Object v1;
        if(this.value != null) {
            zzace v0 = this.zzbzl;
            v1 = this.value;
            if(v0.zzbzf) {
                int v2 = Array.getLength(v1);
                int v3;
                for(v3 = 0; v3 < v2; ++v3) {
                    Object v4 = Array.get(v1, v3);
                    if(v4 != null) {
                        v0.zza(v4, arg6);
                    }
                }

                return;
            }

            v0.zza(v1, arg6);
            return;
        }

        Iterator v0_1 = this.zzbzm.iterator();
        while(v0_1.hasNext()) {
            v1 = v0_1.next();
            arg6.zzar(((zzacl)v1).tag);
            arg6.zzk(((zzacl)v1).zzbtj);
        }
    }

    final void zza(zzacl arg5) throws IOException {
        Object v5_2;
        if(this.zzbzm != null) {
            this.zzbzm.add(arg5);
            return;
        }

        if((this.value instanceof zzacj)) {
            byte[] v5 = arg5.zzbtj;
            zzaca v0 = zzaca.zza(v5, 0, v5.length);
            int v1 = v0.zzvn();
            if(v1 == v5.length - zzacb.zzao(v1)) {
                zzacj v5_1 = this.value.zzb(v0);
            }
            else {
                throw zzaci.zzvw();
            }
        }
        else if((this.value instanceof zzacj[])) {
            v5_2 = this.zzbzl.zzi(Collections.singletonList(arg5));
            Object v0_1 = this.value;
            Object[] v2 = Arrays.copyOf(((Object[])v0_1), v0_1.length + v5_2.length);
            System.arraycopy(v5_2, 0, v2, v0_1.length, v5_2.length);
            Object[] v5_3 = v2;
        }
        else {
            v5_2 = this.zzbzl.zzi(Collections.singletonList(arg5));
        }

        this.zzbzl = this.zzbzl;
        this.value = v5_2;
        this.zzbzm = null;
    }

    final Object zzb(zzace arg2) {
        if(this.value == null) {
            this.zzbzl = arg2;
            this.value = arg2.zzi(this.zzbzm);
            this.zzbzm = null;
        }
        else if(this.zzbzl.equals(arg2)) {
        }
        else {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }

        return this.value;
    }

    private final zzacg zzvv() {
        int v2;
        Object v1;
        zzacg v0 = new zzacg();
        try {
            v0.zzbzl = this.zzbzl;
            if(this.zzbzm == null) {
                v0.zzbzm = null;
            }
            else {
                v0.zzbzm.addAll(this.zzbzm);
            }

            if(this.value != null) {
                if((this.value instanceof zzacj)) {
                    v1 = this.value.clone();
                }
                else if((this.value instanceof byte[])) {
                    v1 = this.value.clone();
                }
                else {
                    v2 = 0;
                    if((this.value instanceof byte[][])) {
                        v1 = this.value;
                        byte[][] v3 = new byte[v1.length][];
                        v0.value = v3;
                        while(true) {
                            if(v2 < v1.length) {
                                v3[v2] = v1[v2].clone();
                                ++v2;
                                continue;
                            }
                            else {
                                return v0;
                            }
                        }
                    }
                    else if((this.value instanceof boolean[])) {
                        v1 = this.value.clone();
                    }
                    else if((this.value instanceof int[])) {
                        v1 = this.value.clone();
                    }
                    else if((this.value instanceof long[])) {
                        v1 = this.value.clone();
                    }
                    else if((this.value instanceof float[])) {
                        v1 = this.value.clone();
                    }
                    else if((this.value instanceof double[])) {
                        v1 = this.value.clone();
                    }
                    else {
                        goto label_72;
                    }
                }

                v0.value = v1;
                return v0;
            label_72:
                if(!(this.value instanceof zzacj[])) {
                    return v0;
                }

                v1 = this.value;
                zzacj[] v3_1 = new zzacj[v1.length];
                v0.value = v3_1;
                while(v2 < v1.length) {
                    v3_1[v2] = v1[v2].clone();
                    ++v2;
                }
            }
        }
        catch(CloneNotSupportedException v0_1) {
            throw new AssertionError(v0_1);
        }

        return v0;
    }
}

