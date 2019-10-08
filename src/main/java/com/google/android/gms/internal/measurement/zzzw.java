package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzzw {
    private static final Charset ISO_8859_1;
    static final Charset UTF_8;
    public static final byte[] zzbux;
    private static final ByteBuffer zzbuy;
    private static final zzzj zzbuz;

    static {
        zzzw.UTF_8 = Charset.forName("UTF-8");
        zzzw.ISO_8859_1 = Charset.forName("ISO-8859-1");
        byte[] v1 = new byte[0];
        zzzw.zzbux = v1;
        zzzw.zzbuy = ByteBuffer.wrap(v1);
        zzzw.zzbuz = zzzj.zza(zzzw.zzbux, 0, zzzw.zzbux.length, false);
    }

    static Object checkNotNull(Object arg0) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException();
    }

    static Object zza(Object arg0, String arg1) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException(arg1);
    }

    static int zza(int arg2, byte[] arg3, int arg4, int arg5) {
        int v0 = arg2;
        for(arg2 = arg4; arg2 < arg4 + arg5; ++arg2) {
            v0 = v0 * 0x1F + arg3[arg2];
        }

        return v0;
    }
}

