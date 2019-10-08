package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzace {
    public final int tag;
    private final int type;
    protected final Class zzbze;
    protected final boolean zzbzf;
    private final zzzv zzbzg;

    private zzace(int arg7, Class arg8, int arg9, boolean arg10) {
        this(11, arg8, null, 810, false);
    }

    private zzace(int arg1, Class arg2, zzzv arg3, int arg4, boolean arg5) {
        super();
        this.type = arg1;
        this.zzbze = arg2;
        this.tag = arg4;
        this.zzbzf = false;
        this.zzbzg = null;
    }

    public final boolean equals(Object arg5) {
        if(this == (((zzace)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof zzace)) {
            return 0;
        }

        if(this.type == ((zzace)arg5).type && this.zzbze == ((zzace)arg5).zzbze && this.tag == ((zzace)arg5).tag && this.zzbzf == ((zzace)arg5).zzbzf) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return (((this.type + 0x47B) * 0x1F + this.zzbze.hashCode()) * 0x1F + this.tag) * 0x1F + this.zzbzf;
    }

    public static zzace zza(int arg1, Class arg2, long arg3) {
        return new zzace(11, arg2, 810, false);
    }

    protected final void zza(Object arg3, zzacb arg4) {
        try {
            arg4.zzar(this.tag);
            switch(this.type) {
                case 10: {
                    goto label_8;
                }
                case 11: {
                    goto label_6;
                }
            }

            int v4 = this.type;
            StringBuilder v1 = new StringBuilder(24);
            v1.append("Unknown type ");
            v1.append(v4);
            throw new IllegalArgumentException(v1.toString());
        label_6:
            arg4.zzb(((zzacj)arg3));
            return;
        label_8:
            int v0 = this.tag >>> 3;
            ((zzacj)arg3).zza(arg4);
            arg4.zzg(v0, 4);
            return;
        }
        catch(IOException v3) {
            throw new IllegalStateException(((Throwable)v3));
        }
    }

    private final Object zzf(zzaca arg5) {
        String v0_1;
        StringBuilder v3;
        Class v0 = this.zzbzf ? this.zzbze.getComponentType() : this.zzbze;
        try {
            switch(this.type) {
                case 10: {
                    goto label_13;
                }
                case 11: {
                    goto label_10;
                }
            }

            int v1 = this.type;
            v3 = new StringBuilder(24);
            v3.append("Unknown type ");
            v3.append(v1);
            throw new IllegalArgumentException(v3.toString());
        label_10:
            Object v1_1 = v0.newInstance();
            arg5.zza(((zzacj)v1_1));
            return v1_1;
        label_13:
            v1_1 = v0.newInstance();
            arg5.zza(((zzacj)v1_1), this.tag >>> 3);
            return v1_1;
        }
        catch(IOException v5) {
            throw new IllegalArgumentException("Error reading extension field", ((Throwable)v5));
        }
        catch(IllegalAccessException v5_1) {
            v0_1 = String.valueOf(v0);
            v3 = new StringBuilder(String.valueOf(v0_1).length() + 33);
            v3.append("Error creating instance of class ");
            v3.append(v0_1);
            throw new IllegalArgumentException(v3.toString(), ((Throwable)v5_1));
        }
        catch(InstantiationException v5_2) {
            v0_1 = String.valueOf(v0);
            v3 = new StringBuilder(String.valueOf(v0_1).length() + 33);
            v3.append("Error creating instance of class ");
            v3.append(v0_1);
            throw new IllegalArgumentException(v3.toString(), ((Throwable)v5_2));
        }
    }

    final Object zzi(List arg7) {
        Object v0 = null;
        if(arg7 == null) {
            return v0;
        }

        if(this.zzbzf) {
            ArrayList v1 = new ArrayList();
            int v2 = 0;
            int v3;
            for(v3 = 0; v3 < arg7.size(); ++v3) {
                Object v4 = arg7.get(v3);
                if(((zzacl)v4).zzbtj.length != 0) {
                    ((List)v1).add(this.zzf(zzaca.zzi(((zzacl)v4).zzbtj)));
                }
            }

            int v7 = ((List)v1).size();
            if(v7 == 0) {
                return v0;
            }

            v0 = this.zzbze.cast(Array.newInstance(this.zzbze.getComponentType(), v7));
            while(v2 < v7) {
                Array.set(v0, v2, ((List)v1).get(v2));
                ++v2;
            }

            return v0;
        }

        if(arg7.isEmpty()) {
            return v0;
        }

        return this.zzbze.cast(this.zzf(zzaca.zzi(arg7.get(arg7.size() - 1).zzbtj)));
    }

    protected final int zzv(Object arg4) {
        int v0 = this.tag >>> 3;
        switch(this.type) {
            case 10: {
                goto label_17;
            }
            case 11: {
                goto label_15;
            }
        }

        v0 = this.type;
        StringBuilder v2 = new StringBuilder(24);
        v2.append("Unknown type ");
        v2.append(v0);
        throw new IllegalArgumentException(v2.toString());
    label_17:
        return (zzacb.zzaq(v0) << 1) + ((zzacj)arg4).zzwb();
    label_15:
        return zzacb.zzb(v0, ((zzacj)arg4));
    }
}

