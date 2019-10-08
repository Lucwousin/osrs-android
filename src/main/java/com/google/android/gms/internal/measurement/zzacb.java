package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzacb {
    private final ByteBuffer zzbzc;

    private zzacb(ByteBuffer arg2) {
        super();
        this.zzbzc = arg2;
        this.zzbzc.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzacb(byte[] arg1, int arg2, int arg3) {
        this(ByteBuffer.wrap(arg1, arg2, arg3));
    }

    private static int zza(CharSequence arg8) {
        int v4;
        int v0 = arg8.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(arg8.charAt(v2) >= 0x80) {
                break;
            }
        }

        int v3 = v0;
        while(true) {
            if(v2 < v0) {
                v4 = arg8.charAt(v2);
                int v5 = 0x800;
                if(v4 < v5) {
                    v3 += 0x7F - v4 >>> 0x1F;
                    ++v2;
                    continue;
                }
                else {
                    break;
                }
            }

            goto label_50;
        }

        v4 = arg8.length();
        while(v2 < v4) {
            int v6 = arg8.charAt(v2);
            if(v6 < v5) {
                v1 += 0x7F - v6 >>> 0x1F;
            }
            else {
                v1 += 2;
                if(0xD800 <= v6 && v6 <= 0xDFFF) {
                    if(Character.codePointAt(arg8, v2) >= 0x10000) {
                        ++v2;
                    }
                    else {
                        StringBuilder v1_1 = new StringBuilder(39);
                        v1_1.append("Unpaired surrogate at index ");
                        v1_1.append(v2);
                        throw new IllegalArgumentException(v1_1.toString());
                    }
                }
            }

            ++v2;
        }

        v3 += v1;
    label_50:
        if(v3 >= v0) {
            return v3;
        }

        long v0_1 = ((long)v3);
        StringBuilder v3_1 = new StringBuilder(54);
        v3_1.append("UTF-8 length does not fit in int: ");
        v3_1.append(v0_1 + 0x100000000L);
        throw new IllegalArgumentException(v3_1.toString());
    }

    private static void zza(CharSequence arg13, ByteBuffer arg14) {
        StringBuilder v14;
        char v5_1;
        char v10_1;
        int v11;
        int v10;
        int v8;
        int v7;
        if(!arg14.isReadOnly()) {
            int v1 = 39;
            int v2 = 0xDFFF;
            int v3 = 0xD800;
            int v4 = 0x800;
            int v5 = 0;
            int v6 = 0x80;
            if(arg14.hasArray()) {
                try {
                    byte[] v0 = arg14.array();
                    v7 = arg14.arrayOffset() + arg14.position();
                    v8 = arg14.remaining();
                    int v9 = arg13.length();
                    v8 += v7;
                    while(v5 < v9) {
                        v10 = v5 + v7;
                        if(v10 >= v8) {
                            break;
                        }

                        v11 = arg13.charAt(v5);
                        if(v11 >= v6) {
                            break;
                        }

                        v0[v10] = ((byte)v11);
                        ++v5;
                    }

                    if(v5 == v9) {
                        v7 += v9;
                    }
                    else {
                        v7 += v5;
                        while(true) {
                            if(v5 < v9) {
                                v10_1 = arg13.charAt(v5);
                                if(v10_1 >= v6 || v7 >= v8) {
                                    if(v10_1 < v4 && v7 <= v8 - 2) {
                                        v11 = v7 + 1;
                                        v0[v7] = ((byte)(v10_1 >>> 6 | 960));
                                        v7 = v11 + 1;
                                        v0[v11] = ((byte)(v10_1 & 0x3F | v6));
                                        goto label_106;
                                    }

                                    if((v10_1 < v3 || v2 < v10_1) && v7 <= v8 - 3) {
                                        v11 = v7 + 1;
                                        v0[v7] = ((byte)(v10_1 >>> 12 | 480));
                                        v7 = v11 + 1;
                                        v0[v11] = ((byte)(v10_1 >>> 6 & 0x3F | v6));
                                        v11 = v7 + 1;
                                        v0[v7] = ((byte)(v10_1 & 0x3F | v6));
                                    label_37:
                                        v7 = v11;
                                        goto label_106;
                                    }

                                    if(v7 > v8 - 4) {
                                        goto label_119;
                                    }

                                    v11 = v5 + 1;
                                    if(v11 != arg13.length()) {
                                        v5_1 = arg13.charAt(v11);
                                        if(Character.isSurrogatePair(v10_1, v5_1)) {
                                            v5 = Character.toCodePoint(v10_1, v5_1);
                                            v10 = v7 + 1;
                                            v0[v7] = ((byte)(v5 >>> 18 | 0xF0));
                                            v7 = v10 + 1;
                                            v0[v10] = ((byte)(v5 >>> 12 & 0x3F | v6));
                                            v10 = v7 + 1;
                                            v0[v7] = ((byte)(v5 >>> 6 & 0x3F | v6));
                                            v7 = v10 + 1;
                                            v0[v10] = ((byte)(v5 & 0x3F | v6));
                                            v5 = v11;
                                            goto label_106;
                                        }
                                        else {
                                            break;
                                        }
                                    }

                                    goto label_109;
                                }
                                else {
                                    v11 = v7 + 1;
                                    v0[v7] = ((byte)v10_1);
                                    goto label_37;
                                }

                            label_106:
                                ++v5;
                                continue;
                            }

                            goto label_132;
                        }

                        v5 = v11;
                    label_109:
                        v14 = new StringBuilder(v1);
                        v14.append("Unpaired surrogate at index ");
                        v14.append(v5 - 1);
                        throw new IllegalArgumentException(v14.toString());
                    label_119:
                        StringBuilder v0_1 = new StringBuilder(37);
                        v0_1.append("Failed writing ");
                        v0_1.append(v10_1);
                        v0_1.append(" at index ");
                        v0_1.append(v7);
                        throw new ArrayIndexOutOfBoundsException(v0_1.toString());
                    }

                label_132:
                    arg14.position(v7 - arg14.arrayOffset());
                    return;
                }
                catch(ArrayIndexOutOfBoundsException v13) {
                    BufferOverflowException v14_1 = new BufferOverflowException();
                    v14_1.initCause(((Throwable)v13));
                    throw v14_1;
                }
            }

            int v0_2 = arg13.length();
            while(v5 < v0_2) {
                char v7_1 = arg13.charAt(v5);
                if(v7_1 >= v6) {
                    if(v7_1 < v4) {
                        v8 = v7_1 >>> 6 | 960;
                    }
                    else {
                        if(v7_1 >= v3) {
                            if(v2 < v7_1) {
                            }
                            else {
                                v8 = v5 + 1;
                                if(v8 != arg13.length()) {
                                    v5_1 = arg13.charAt(v8);
                                    if(Character.isSurrogatePair(v7_1, v5_1)) {
                                        v5 = Character.toCodePoint(v7_1, v5_1);
                                        arg14.put(((byte)(v5 >>> 18 | 0xF0)));
                                        arg14.put(((byte)(v5 >>> 12 & 0x3F | v6)));
                                        arg14.put(((byte)(v5 >>> 6 & 0x3F | v6)));
                                        arg14.put(((byte)(v5 & 0x3F | v6)));
                                        v5 = v8;
                                        goto label_205;
                                    }
                                    else {
                                        v5 = v8;
                                    }
                                }

                                v14 = new StringBuilder(v1);
                                v14.append("Unpaired surrogate at index ");
                                v14.append(v5 - 1);
                                throw new IllegalArgumentException(v14.toString());
                            }
                        }

                        arg14.put(((byte)(v7_1 >>> 12 | 480)));
                        v8 = v7_1 >>> 6 & 0x3F | v6;
                    }

                    arg14.put(((byte)v8));
                    v7 = v7_1 & 0x3F | v6;
                    goto label_145;
                }
                else {
                label_145:
                    arg14.put(((byte)v7_1));
                }

            label_205:
                ++v5;
            }

            return;
        }

        throw new ReadOnlyBufferException();
    }

    public final void zza(int arg2, double arg3) throws IOException {
        this.zzg(arg2, 1);
        long v2 = Double.doubleToLongBits(arg3);
        if(this.zzbzc.remaining() >= 8) {
            this.zzbzc.putLong(v2);
            return;
        }

        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zza(int arg2, float arg3) throws IOException {
        this.zzg(arg2, 5);
        arg2 = Float.floatToIntBits(arg3);
        if(this.zzbzc.remaining() >= 4) {
            this.zzbzc.putInt(arg2);
            return;
        }

        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zza(int arg2, long arg3) throws IOException {
        this.zzg(arg2, 0);
        this.zzas(arg3);
    }

    public final void zza(int arg2, zzacj arg3) throws IOException {
        this.zzg(arg2, 2);
        this.zzb(arg3);
    }

    public final void zza(int arg2, boolean arg3) throws IOException {
        this.zzg(arg2, 0);
        byte v2 = ((byte)(((int)arg3)));
        if(this.zzbzc.hasRemaining()) {
            this.zzbzc.put(v2);
            return;
        }

        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public static int zzao(int arg0) {
        if(arg0 >= 0) {
            return zzacb.zzas(arg0);
        }

        return 10;
    }

    private final void zzap(int arg3) throws IOException {
        byte v3 = ((byte)arg3);
        if(this.zzbzc.hasRemaining()) {
            this.zzbzc.put(v3);
            return;
        }

        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public static int zzaq(int arg0) {
        return zzacb.zzas(arg0 << 3);
    }

    public final void zzar(int arg2) throws IOException {
        while((arg2 & 0xFFFFFF80) != 0) {
            this.zzap(arg2 & 0x7F | 0x80);
            arg2 >>>= 7;
        }

        this.zzap(arg2);
    }

    public static int zzas(int arg1) {
        if((arg1 & 0xFFFFFF80) == 0) {
            return 1;
        }

        if((arg1 & 0xFFFFC000) == 0) {
            return 2;
        }

        if((0xFFE00000 & arg1) == 0) {
            return 3;
        }

        if((arg1 & 0xF0000000) == 0) {
            return 4;
        }

        return 5;
    }

    private final void zzas(long arg5) throws IOException {
        while((-128 & arg5) != 0) {
            this.zzap((((int)arg5)) & 0x7F | 0x80);
            arg5 >>>= 7;
        }

        this.zzap(((int)arg5));
    }

    public static int zzat(long arg4) {
        long v2 = 0;
        if((-128 & arg4) == v2) {
            return 1;
        }

        if((-16384 & arg4) == v2) {
            return 2;
        }

        if((-2097152 & arg4) == v2) {
            return 3;
        }

        if((-268435456 & arg4) == v2) {
            return 4;
        }

        if((-34359738368L & arg4) == v2) {
            return 5;
        }

        if((-4398046511104L & arg4) == v2) {
            return 6;
        }

        if((-562949953421312L & arg4) == v2) {
            return 7;
        }

        if((-72057594037927936L & arg4) == v2) {
            return 8;
        }

        if((arg4 & -9223372036854775808L) == v2) {
            return 9;
        }

        return 10;
    }

    public static int zzb(int arg1, zzacj arg2) {
        arg1 = zzacb.zzaq(arg1);
        int v2 = arg2.zzwb();
        return arg1 + (zzacb.zzas(v2) + v2);
    }

    public static zzacb zzb(byte[] arg1, int arg2, int arg3) {
        return new zzacb(arg1, 0, arg3);
    }

    public final void zzb(zzacj arg2) throws IOException {
        this.zzar(arg2.zzwa());
        arg2.zza(this);
    }

    public final void zzb(int arg2, long arg3) throws IOException {
        this.zzg(arg2, 0);
        this.zzas(arg3);
    }

    public final void zzb(int arg4, String arg5) throws IOException {
        this.zzg(arg4, 2);
        try {
            arg4 = zzacb.zzas(arg5.length());
            if(arg4 == zzacb.zzas(arg5.length() * 3)) {
                int v0 = this.zzbzc.position();
                if(this.zzbzc.remaining() >= arg4) {
                    this.zzbzc.position(v0 + arg4);
                    zzacb.zza(((CharSequence)arg5), this.zzbzc);
                    int v5 = this.zzbzc.position();
                    this.zzbzc.position(v0);
                    this.zzar(v5 - v0 - arg4);
                    this.zzbzc.position(v5);
                    return;
                }

                throw new zzacc(v0 + arg4, this.zzbzc.limit());
            }

            this.zzar(zzacb.zza(((CharSequence)arg5)));
            zzacb.zza(((CharSequence)arg5), this.zzbzc);
            return;
        }
        catch(BufferOverflowException v4) {
            zzacc v5_1 = new zzacc(this.zzbzc.position(), this.zzbzc.limit());
            v5_1.initCause(((Throwable)v4));
            throw v5_1;
        }
    }

    public static int zzc(int arg0, long arg1) {
        return zzacb.zzaq(arg0) + zzacb.zzat(arg1);
    }

    public static int zzc(int arg0, String arg1) {
        return zzacb.zzaq(arg0) + zzacb.zzfr(arg1);
    }

    public final void zze(int arg2, int arg3) throws IOException {
        this.zzg(arg2, 0);
        if(arg3 >= 0) {
            this.zzar(arg3);
            return;
        }

        this.zzas(((long)arg3));
    }

    public static int zzf(int arg0, int arg1) {
        return zzacb.zzaq(arg0) + zzacb.zzao(arg1);
    }

    public static int zzfr(String arg1) {
        int v1 = zzacb.zza(((CharSequence)arg1));
        return zzacb.zzas(v1) + v1;
    }

    public final void zzg(int arg1, int arg2) throws IOException {
        this.zzar(arg1 << 3 | arg2);
    }

    public static zzacb zzj(byte[] arg2) {
        return zzacb.zzb(arg2, 0, arg2.length);
    }

    public final void zzk(byte[] arg4) throws IOException {
        int v0 = arg4.length;
        if(this.zzbzc.remaining() >= v0) {
            this.zzbzc.put(arg4, 0, v0);
            return;
        }

        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zzvt() {
        if(this.zzbzc.remaining() == 0) {
            return;
        }

        throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzbzc.remaining())));
    }
}

