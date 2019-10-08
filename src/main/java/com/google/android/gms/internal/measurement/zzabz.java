package com.google.android.gms.internal.measurement;

public enum zzabz {
    public static final enum zzabz zzbyl;
    public static final enum zzabz zzbym;
    public static final enum zzabz zzbyn;
    public static final enum zzabz zzbyo;
    public static final enum zzabz zzbyp;
    public static final enum zzabz zzbyq;
    public static final enum zzabz zzbyr;
    public static final enum zzabz zzbys;
    public static final enum zzabz zzbyt;
    private final Object zzbyu;

    static {
        zzabz.zzbyl = new zzabz("INT", 0, Integer.valueOf(0));
        zzabz.zzbym = new zzabz("LONG", 1, Long.valueOf(0));
        zzabz.zzbyn = new zzabz("FLOAT", 2, Float.valueOf(0f));
        zzabz.zzbyo = new zzabz("DOUBLE", 3, Double.valueOf(0));
        zzabz.zzbyp = new zzabz("BOOLEAN", 4, Boolean.valueOf(false));
        zzabz.zzbyq = new zzabz("STRING", 5, "");
        zzabz.zzbyr = new zzabz("BYTE_STRING", 6, zzzb.zzbte);
        zzabz.zzbys = new zzabz("ENUM", 7, null);
        zzabz.zzbyt = new zzabz("MESSAGE", 8, null);
        zzabz.zzbyv = new zzabz[]{zzabz.zzbyl, zzabz.zzbym, zzabz.zzbyn, zzabz.zzbyo, zzabz.zzbyp, zzabz.zzbyq, zzabz.zzbyr, zzabz.zzbys, zzabz.zzbyt};
    }

    private zzabz(String arg1, int arg2, Object arg3) {
        super(arg1, arg2);
        this.zzbyu = arg3;
    }

    public static zzabz[] values() {
        return zzabz.zzbyv.clone();
    }
}

