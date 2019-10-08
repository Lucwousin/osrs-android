package com.google.android.gms.internal.measurement;

public final class zzabp {
    private int count;
    private int zzbug;
    private static final zzabp zzbwq;
    private int[] zzbwr;
    private Object[] zzbws;
    private boolean zzbwt;

    static {
        zzabp.zzbwq = new zzabp(0, new int[0], new Object[0], false);
    }

    private zzabp(int arg1, int[] arg2, Object[] arg3, boolean arg4) {
        super();
        this.zzbug = -1;
        this.count = 0;
        this.zzbwr = arg2;
        this.zzbws = arg3;
        this.zzbwt = arg4;
    }

    private zzabp() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object arg3) {
        if(this == (((zzabp)arg3))) {
            return 1;
        }

        if(arg3 == null) {
            return 0;
        }

        if(!(arg3 instanceof zzabp)) {
            return 0;
        }

        return 1;
    }

    public final int hashCode() {
        return 0x7BC6F;
    }

    public static zzabp zzvf() {
        return zzabp.zzbwq;
    }
}

