package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzaca {
    private final byte[] buffer;
    private int zzbtk;
    private int zzbtl;
    private int zzbtp;
    private int zzbtr;
    private final int zzbyw;
    private final int zzbyx;
    private int zzbyy;
    private int zzbyz;
    private int zzbza;
    private int zzbzb;

    private zzaca(byte[] arg2, int arg3, int arg4) {
        super();
        this.zzbtr = 0x7FFFFFFF;
        this.zzbtk = 0x40;
        this.zzbtl = 0x4000000;
        this.buffer = arg2;
        this.zzbyw = arg3;
        arg4 += arg3;
        this.zzbyy = arg4;
        this.zzbyx = arg4;
        this.zzbyz = arg3;
    }

    public final int getPosition() {
        return this.zzbyz - this.zzbyw;
    }

    public final String readString() throws IOException {
        int v0 = this.zzvn();
        if(v0 >= 0) {
            if(v0 <= this.zzbyy - this.zzbyz) {
                String v1 = new String(this.buffer, this.zzbyz, v0, zzach.UTF_8);
                this.zzbyz += v0;
                return v1;
            }

            throw zzaci.zzvw();
        }

        throw zzaci.zzvx();
    }

    public static zzaca zza(byte[] arg1, int arg2, int arg3) {
        return new zzaca(arg1, 0, arg3);
    }

    public final void zza(zzacj arg4) throws IOException {
        int v0 = this.zzvn();
        if(this.zzbzb < this.zzbtk) {
            v0 = this.zzaf(v0);
            ++this.zzbzb;
            arg4.zzb(this);
            this.zzaj(0);
            --this.zzbzb;
            this.zzal(v0);
            return;
        }

        throw zzaci.zzvz();
    }

    public final void zza(zzacj arg3, int arg4) throws IOException {
        if(this.zzbzb < this.zzbtk) {
            ++this.zzbzb;
            arg3.zzb(this);
            this.zzaj(arg4 << 3 | 4);
            --this.zzbzb;
            return;
        }

        throw zzaci.zzvz();
    }

    public final int zzaf(int arg2) throws zzaci {
        if(arg2 >= 0) {
            arg2 += this.zzbyz;
            int v0 = this.zzbtr;
            if(arg2 <= v0) {
                this.zzbtr = arg2;
                this.zztp();
                return v0;
            }

            throw zzaci.zzvw();
        }

        throw zzaci.zzvx();
    }

    public final void zzaj(int arg2) throws zzaci {
        if(this.zzbza == arg2) {
            return;
        }

        throw new zzaci("Protocol message end-group tag did not match expected tag.");
    }

    public final boolean zzak(int arg3) throws IOException {
        switch(arg3 & 7) {
            case 0: {
                goto label_25;
            }
            case 1: {
                goto label_23;
            }
            case 2: {
                goto label_20;
            }
            case 3: {
                goto label_11;
            }
            case 4: {
                return 0;
            }
            case 5: {
                goto label_7;
            }
        }

        throw new zzaci("Protocol message tag had invalid wire type.");
    label_20:
        this.zzan(this.zzvn());
        return 1;
    label_23:
        this.zzvq();
        return 1;
    label_7:
        this.zzvp();
        return 1;
    label_25:
        this.zzvn();
        return 1;
        do {
        label_11:
            int v0 = this.zzvl();
            if(v0 == 0) {
                break;
            }
        }
        while(this.zzak(v0));

        this.zzaj(arg3 >>> 3 << 3 | 4);
        return 1;
    }

    public final void zzal(int arg1) {
        this.zzbtr = arg1;
        this.zztp();
    }

    public final void zzam(int arg2) {
        this.zzd(arg2, this.zzbza);
    }

    private final void zzan(int arg3) throws IOException {
        if(arg3 >= 0) {
            if(this.zzbyz + arg3 <= this.zzbtr) {
                if(arg3 <= this.zzbyy - this.zzbyz) {
                    this.zzbyz += arg3;
                    return;
                }

                throw zzaci.zzvw();
            }

            this.zzan(this.zzbtr - this.zzbyz);
            throw zzaci.zzvw();
        }

        throw zzaci.zzvx();
    }

    public final byte[] zzc(int arg4, int arg5) {
        if(arg5 == 0) {
            return zzacm.zzbzz;
        }

        byte[] v0 = new byte[arg5];
        System.arraycopy(this.buffer, this.zzbyw + arg4, v0, 0, arg5);
        return v0;
    }

    final void zzd(int arg4, int arg5) {
        if(arg4 <= this.zzbyz - this.zzbyw) {
            if(arg4 >= 0) {
                this.zzbyz = this.zzbyw + arg4;
                this.zzbza = arg5;
                return;
            }

            StringBuilder v1 = new StringBuilder(24);
            v1.append("Bad position ");
            v1.append(arg4);
            throw new IllegalArgumentException(v1.toString());
        }

        int v0 = this.zzbyz - this.zzbyw;
        StringBuilder v2 = new StringBuilder(50);
        v2.append("Position ");
        v2.append(arg4);
        v2.append(" is beyond current ");
        v2.append(v0);
        throw new IllegalArgumentException(v2.toString());
    }

    public static zzaca zzi(byte[] arg2) {
        return zzaca.zza(arg2, 0, arg2.length);
    }

    private final void zztp() {
        this.zzbyy += this.zzbtp;
        int v0 = this.zzbyy;
        if(v0 > this.zzbtr) {
            this.zzbtp = v0 - this.zzbtr;
            this.zzbyy -= this.zzbtp;
            return;
        }

        this.zzbtp = 0;
    }

    public final int zzvl() throws IOException {
        if(this.zzbyz == this.zzbyy) {
            this.zzbza = 0;
            return 0;
        }

        this.zzbza = this.zzvn();
        if(this.zzbza != 0) {
            return this.zzbza;
        }

        throw new zzaci("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzvm() throws IOException {
        if(this.zzvn() != 0) {
            return 1;
        }

        return 0;
    }

    public final int zzvn() throws IOException {
        int v0 = this.zzvs();
        if(v0 >= 0) {
            return v0;
        }

        v0 &= 0x7F;
        int v1 = this.zzvs();
        if(v1 >= 0) {
            v1 <<= 7;
            goto label_7;
        }
        else {
            v0 |= (v1 & 0x7F) << 7;
            v1 = this.zzvs();
            if(v1 >= 0) {
                v1 <<= 14;
                goto label_7;
            }
            else {
                v0 |= (v1 & 0x7F) << 14;
                v1 = this.zzvs();
                if(v1 >= 0) {
                    v1 <<= 21;
                label_7:
                    v0 |= v1;
                }
                else {
                    v0 |= (v1 & 0x7F) << 21;
                    v1 = this.zzvs();
                    v0 |= v1 << 28;
                    if(v1 < 0) {
                        v1 = 0;
                        while(true) {
                            if(v1 >= 5) {
                                break;
                            }
                            else if(this.zzvs() >= 0) {
                                return v0;
                            }
                            else {
                                ++v1;
                                continue;
                            }

                            return v0;
                        }

                        throw zzaci.zzvy();
                    }
                }
            }
        }

        return v0;
    }

    public final long zzvo() throws IOException {
        int v0 = 0;
        long v1 = 0;
        while(v0 < 0x40) {
            int v3 = this.zzvs();
            v1 |= (((long)(v3 & 0x7F))) << v0;
            if((v3 & 0x80) == 0) {
                return v1;
            }

            v0 += 7;
        }

        throw zzaci.zzvy();
    }

    public final int zzvp() throws IOException {
        return this.zzvs() & 0xFF | (this.zzvs() & 0xFF) << 8 | (this.zzvs() & 0xFF) << 16 | (this.zzvs() & 0xFF) << 24;
    }

    public final long zzvq() throws IOException {
        return ((((long)this.zzvs())) & 0xFF) << 8 | (((long)this.zzvs())) & 0xFF | ((((long)this.zzvs())) & 0xFF) << 16 | ((((long)this.zzvs())) & 0xFF) << 24 | ((((long)this.zzvs())) & 0xFF) << 0x20 | ((((long)this.zzvs())) & 0xFF) << 40 | ((((long)this.zzvs())) & 0xFF) << 0x30 | ((((long)this.zzvs())) & 0xFF) << 56;
    }

    public final int zzvr() {
        if(this.zzbtr == 0x7FFFFFFF) {
            return -1;
        }

        return this.zzbtr - this.zzbyz;
    }

    private final byte zzvs() throws IOException {
        if(this.zzbyz != this.zzbyy) {
            byte[] v0 = this.buffer;
            int v1 = this.zzbyz;
            this.zzbyz = v1 + 1;
            return v0[v1];
        }

        throw zzaci.zzvw();
    }
}

