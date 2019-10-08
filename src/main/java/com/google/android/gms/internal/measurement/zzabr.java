package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzabr {
    final class zza extends zzd {
        zza(Unsafe arg1) {
            super(arg1);
        }
    }

    final class zzb extends zzd {
        zzb(Unsafe arg1) {
            super(arg1);
        }
    }

    final class zzc extends zzd {
        zzc(Unsafe arg1) {
            super(arg1);
        }
    }

    abstract class zzd {
        Unsafe zzbxp;

        zzd(Unsafe arg1) {
            super();
            this.zzbxp = arg1;
        }
    }

    private static final Logger logger;
    private static final Class zzbtc;
    private static final Unsafe zzbvq;
    private static final boolean zzbwu;
    private static final boolean zzbwv;
    private static final zzd zzbww;
    private static final boolean zzbwx;
    private static final boolean zzbwy;
    private static final long zzbwz;
    private static final long zzbxa;
    private static final long zzbxb;
    private static final long zzbxc;
    private static final long zzbxd;
    private static final long zzbxe;
    private static final long zzbxf;
    private static final long zzbxg;
    private static final long zzbxh;
    private static final long zzbxi;
    private static final long zzbxj;
    private static final long zzbxk;
    private static final long zzbxl;
    private static final long zzbxm;
    private static final long zzbxn;
    private static final boolean zzbxo;

    static {
        zza v0_1;
        zzabr.logger = Logger.getLogger(zzabr.class.getName());
        zzabr.zzbvq = zzabr.zzvg();
        zzabr.zzbtc = zzza.zztl();
        zzabr.zzbwu = zzabr.zzk(Long.TYPE);
        zzabr.zzbwv = zzabr.zzk(Integer.TYPE);
        zzd v1 = null;
        if(zzabr.zzbvq == null) {
        label_17:
            zzd v0_2 = v1;
            goto label_36;
        label_33:
            zzc v0_3 = new zzc(zzabr.zzbvq);
        }
        else if(!zzza.zztk()) {
            goto label_33;
        }
        else if(zzabr.zzbwu) {
            zzb v0 = new zzb(zzabr.zzbvq);
        }
        else if(zzabr.zzbwv) {
            v0_1 = new zza(zzabr.zzbvq);
        }
        else {
            goto label_17;
        }

    label_36:
        zzabr.zzbww = ((zzd)v0_1);
        zzabr.zzbwx = zzabr.zzvi();
        zzabr.zzbwy = zzabr.zzvh();
        zzabr.zzbwz = ((long)zzabr.zzi(byte[].class));
        zzabr.zzbxa = ((long)zzabr.zzi(boolean[].class));
        zzabr.zzbxb = ((long)zzabr.zzj(boolean[].class));
        zzabr.zzbxc = ((long)zzabr.zzi(int[].class));
        zzabr.zzbxd = ((long)zzabr.zzj(int[].class));
        zzabr.zzbxe = ((long)zzabr.zzi(long[].class));
        zzabr.zzbxf = ((long)zzabr.zzj(long[].class));
        zzabr.zzbxg = ((long)zzabr.zzi(float[].class));
        zzabr.zzbxh = ((long)zzabr.zzj(float[].class));
        zzabr.zzbxi = ((long)zzabr.zzi(double[].class));
        zzabr.zzbxj = ((long)zzabr.zzj(double[].class));
        zzabr.zzbxk = ((long)zzabr.zzi(Object[].class));
        zzabr.zzbxl = ((long)zzabr.zzj(Object[].class));
        zzabr.zzbxm = zzabr.zza(zzabr.zzvj());
        Field v0_4 = zzabr.zza(String.class, "value");
        if(v0_4 == null || v0_4.getType() != char[].class) {
            v0_4 = ((Field)v1);
        }
        else {
        }

        zzabr.zzbxn = zzabr.zza(v0_4);
        boolean v0_5 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? true : false;
        zzabr.zzbxo = v0_5;
    }

    private zzabr() {
        super();
    }

    private static long zza(Field arg2) {
        if(arg2 != null) {
            if(zzabr.zzbww == null) {
            }
            else {
                return zzabr.zzbww.zzbxp.objectFieldOffset(arg2);
            }
        }

        return -1;
    }

    private static Field zza(Class arg0, String arg1) {
        Field v0;
        try {
            v0 = arg0.getDeclaredField(arg1);
            v0.setAccessible(true);
        }
        catch(Throwable ) {
            v0 = null;
        }

        return v0;
    }

    private static int zzi(Class arg1) {
        if(zzabr.zzbwy) {
            return zzabr.zzbww.zzbxp.arrayBaseOffset(arg1);
        }

        return -1;
    }

    private static int zzj(Class arg1) {
        if(zzabr.zzbwy) {
            return zzabr.zzbww.zzbxp.arrayIndexScale(arg1);
        }

        return -1;
    }

    private static boolean zzk(Class arg9) {
        if(!zzza.zztk()) {
            return 0;
        }

        try {
            Class v0 = zzabr.zzbtc;
            v0.getMethod("peekLong", arg9, Boolean.TYPE);
            v0.getMethod("pokeLong", arg9, Long.TYPE, Boolean.TYPE);
            v0.getMethod("pokeInt", arg9, Integer.TYPE, Boolean.TYPE);
            v0.getMethod("peekInt", arg9, Boolean.TYPE);
            v0.getMethod("pokeByte", arg9, Byte.TYPE);
            v0.getMethod("peekByte", arg9);
            v0.getMethod("pokeByteArray", arg9, byte[].class, Integer.TYPE, Integer.TYPE);
            v0.getMethod("peekByteArray", arg9, byte[].class, Integer.TYPE, Integer.TYPE);
            return 1;
        }
        catch(Throwable ) {
            return 0;
        }
    }

    static Unsafe zzvg() {
        Object v0;
        try {
            v0 = AccessController.doPrivileged(new zzabs());
        }
        catch(Throwable ) {
            Unsafe v0_1 = null;
        }

        return ((Unsafe)v0);
    }

    private static boolean zzvh() {
        if(zzabr.zzbvq == null) {
            return 0;
        }

        try {
            Class v0_1 = zzabr.zzbvq.getClass();
            v0_1.getMethod("objectFieldOffset", Field.class);
            v0_1.getMethod("arrayBaseOffset", Class.class);
            v0_1.getMethod("arrayIndexScale", Class.class);
            int v4 = 2;
            v0_1.getMethod("getInt", Object.class, Long.TYPE);
            int v5_1 = 3;
            Class[] v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Integer.TYPE;
            v0_1.getMethod("putInt", v6);
            v0_1.getMethod("getLong", Object.class, Long.TYPE);
            v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Long.TYPE;
            v0_1.getMethod("putLong", v6);
            v0_1.getMethod("getObject", Object.class, Long.TYPE);
            v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Object.class;
            v0_1.getMethod("putObject", v6);
            if(zzza.zztk()) {
                return 1;
            }

            v0_1.getMethod("getByte", Object.class, Long.TYPE);
            v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Byte.TYPE;
            v0_1.getMethod("putByte", v6);
            v0_1.getMethod("getBoolean", Object.class, Long.TYPE);
            v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Boolean.TYPE;
            v0_1.getMethod("putBoolean", v6);
            v0_1.getMethod("getFloat", Object.class, Long.TYPE);
            v6 = new Class[v5_1];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Float.TYPE;
            v0_1.getMethod("putFloat", v6);
            v0_1.getMethod("getDouble", Object.class, Long.TYPE);
            v5 = new Class[v5_1];
            v5[0] = Object.class;
            v5[1] = Long.TYPE;
            v5[v4] = Double.TYPE;
            v0_1.getMethod("putDouble", v5);
            return 1;
        }
        catch(Throwable v0) {
            Logger v2 = zzabr.logger;
            Level v3 = Level.WARNING;
            String v0_2 = String.valueOf(v0);
            StringBuilder v7 = new StringBuilder(String.valueOf(v0_2).length() + 71);
            v7.append("platform method missing - proto runtime falling back to safer methods: ");
            v7.append(v0_2);
            v2.logp(v3, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", v7.toString());
            return 0;
        }
    }

    private static boolean zzvi() {
        if(zzabr.zzbvq == null) {
            return 0;
        }

        try {
            Class v0_1 = zzabr.zzbvq.getClass();
            v0_1.getMethod("objectFieldOffset", Field.class);
            int v4 = 2;
            v0_1.getMethod("getLong", Object.class, Long.TYPE);
            if(zzabr.zzvj() == null) {
                return 0;
            }

            if(zzza.zztk()) {
                return 1;
            }

            v0_1.getMethod("getByte", Long.TYPE);
            v0_1.getMethod("putByte", Long.TYPE, Byte.TYPE);
            v0_1.getMethod("getInt", Long.TYPE);
            v0_1.getMethod("putInt", Long.TYPE, Integer.TYPE);
            v0_1.getMethod("getLong", Long.TYPE);
            v0_1.getMethod("putLong", Long.TYPE, Long.TYPE);
            Class[] v6 = new Class[3];
            v6[0] = Long.TYPE;
            v6[1] = Long.TYPE;
            v6[v4] = Long.TYPE;
            v0_1.getMethod("copyMemory", v6);
            v6 = new Class[5];
            v6[0] = Object.class;
            v6[1] = Long.TYPE;
            v6[v4] = Object.class;
            v6[3] = Long.TYPE;
            v6[4] = Long.TYPE;
            v0_1.getMethod("copyMemory", v6);
            return 1;
        }
        catch(Throwable v0) {
            Logger v2 = zzabr.logger;
            Level v3 = Level.WARNING;
            String v0_2 = String.valueOf(v0);
            StringBuilder v7 = new StringBuilder(String.valueOf(v0_2).length() + 71);
            v7.append("platform method missing - proto runtime falling back to safer methods: ");
            v7.append(v0_2);
            v2.logp(v3, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", v7.toString());
            return 0;
        }
    }

    private static Field zzvj() {
        Field v0;
        if(zzza.zztk()) {
            v0 = zzabr.zza(Buffer.class, "effectiveDirectAddress");
            if(v0 != null) {
                return v0;
            }
        }

        v0 = zzabr.zza(Buffer.class, "address");
        if(v0 != null && v0.getType() == Long.TYPE) {
            return v0;
        }

        return null;
    }
}

