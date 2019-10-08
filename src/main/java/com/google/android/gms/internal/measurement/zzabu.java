package com.google.android.gms.internal.measurement;

public enum zzabu {
    public static final enum zzabu zzbxq;
    public static final enum zzabu zzbxr;
    public static final enum zzabu zzbxs;
    public static final enum zzabu zzbxt;
    public static final enum zzabu zzbxu;
    public static final enum zzabu zzbxv;
    public static final enum zzabu zzbxw;
    public static final enum zzabu zzbxx;
    public static final enum zzabu zzbxy;
    public static final enum zzabu zzbxz;
    public static final enum zzabu zzbya;
    public static final enum zzabu zzbyb;
    public static final enum zzabu zzbyc;
    public static final enum zzabu zzbyd;
    public static final enum zzabu zzbye;
    public static final enum zzabu zzbyf;
    public static final enum zzabu zzbyg;
    public static final enum zzabu zzbyh;
    private final zzabz zzbyi;
    private final int zzbyj;

    static {
        zzabu.zzbxq = new zzabu("DOUBLE", 0, zzabz.zzbyo, 1);
        zzabu.zzbxr = new zzabu("FLOAT", 1, zzabz.zzbyn, 5);
        zzabu.zzbxs = new zzabu("INT64", 2, zzabz.zzbym, 0);
        zzabu.zzbxt = new zzabu("UINT64", 3, zzabz.zzbym, 0);
        zzabu.zzbxu = new zzabu("INT32", 4, zzabz.zzbyl, 0);
        zzabu.zzbxv = new zzabu("FIXED64", 5, zzabz.zzbym, 1);
        zzabu.zzbxw = new zzabu("FIXED32", 6, zzabz.zzbyl, 5);
        zzabu.zzbxx = new zzabu("BOOL", 7, zzabz.zzbyp, 0);
        zzabu.zzbxy = new zzabv("STRING", 8, zzabz.zzbyq, 2);
        zzabu.zzbxz = new zzabw("GROUP", 9, zzabz.zzbyt, 3);
        zzabu.zzbya = new zzabx("MESSAGE", 10, zzabz.zzbyt, 2);
        zzabu.zzbyb = new zzaby("BYTES", 11, zzabz.zzbyr, 2);
        zzabu.zzbyc = new zzabu("UINT32", 12, zzabz.zzbyl, 0);
        zzabu.zzbyd = new zzabu("ENUM", 13, zzabz.zzbys, 0);
        zzabu.zzbye = new zzabu("SFIXED32", 14, zzabz.zzbyl, 5);
        zzabu.zzbyf = new zzabu("SFIXED64", 15, zzabz.zzbym, 1);
        zzabu.zzbyg = new zzabu("SINT32", 16, zzabz.zzbyl, 0);
        zzabu.zzbyh = new zzabu("SINT64", 17, zzabz.zzbym, 0);
        zzabu.zzbyk = new zzabu[]{zzabu.zzbxq, zzabu.zzbxr, zzabu.zzbxs, zzabu.zzbxt, zzabu.zzbxu, zzabu.zzbxv, zzabu.zzbxw, zzabu.zzbxx, zzabu.zzbxy, zzabu.zzbxz, zzabu.zzbya, zzabu.zzbyb, zzabu.zzbyc, zzabu.zzbyd, zzabu.zzbye, zzabu.zzbyf, zzabu.zzbyg, zzabu.zzbyh};
    }

    private zzabu(String arg1, int arg2, zzabz arg3, int arg4) {
        super(arg1, arg2);
        this.zzbyi = arg3;
        this.zzbyj = arg4;
    }

    zzabu(String arg1, int arg2, zzabz arg3, int arg4, zzabt arg5) {
        this(arg1, arg2, arg3, arg4);
    }

    public static zzabu[] values() {
        return zzabu.zzbyk.clone();
    }

    public final zzabz zzvk() {
        return this.zzbyi;
    }
}

