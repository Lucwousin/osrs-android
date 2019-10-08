package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzacm {
    public static final int[] zzbvp = null;
    private static final int zzbzp = 11;
    private static final int zzbzq = 12;
    private static final int zzbzr = 16;
    private static final int zzbzs = 26;
    public static final long[] zzbzt;
    private static final float[] zzbzu;
    private static final double[] zzbzv;
    private static final boolean[] zzbzw;
    public static final String[] zzbzx;
    private static final byte[][] zzbzy;
    public static final byte[] zzbzz;

    static {
        zzacm.zzbvp = new int[0];
        zzacm.zzbzt = new long[0];
        zzacm.zzbzu = new float[0];
        zzacm.zzbzv = new double[0];
        zzacm.zzbzw = new boolean[0];
        zzacm.zzbzx = new String[0];
        zzacm.zzbzy = new byte[0][];
        zzacm.zzbzz = new byte[0];
    }

    public static final int zzb(zzaca arg3, int arg4) throws IOException {
        int v0 = arg3.getPosition();
        arg3.zzak(arg4);
        int v1;
        for(v1 = 1; arg3.zzvl() == arg4; ++v1) {
            arg3.zzak(arg4);
        }

        arg3.zzd(v0, arg4);
        return v1;
    }
}

