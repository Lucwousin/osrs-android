import java.math.BigInteger;

public class lq extends mx {
    public static final int aa = 6;
    public byte[] ae;
    static long[] aj = null;
    public static final int al = 5000;
    static int[] an = null;
    public int ar;
    public static final int ax = 100;

    static {
        int v0 = 0x100;
        lq.an = new int[v0];
        int v2;
        for(v2 = 0; true; ++v2) {
            int v3 = 8;
            if(v2 >= v0) {
                break;
            }

            int v6 = v2;
            int v5;
            for(v5 = 0; v5 < v3; ++v5) {
                if((v6 & 1) == 1) {
                    v6 = v6 >>> 1 ^ 0xEDB88320;
                }
                else {
                    v6 >>>= 1;
                }
            }

            lq.an[v2] = v6;
        }

        lq.aj = new long[v0];
        for(v2 = 0; v2 < v0; ++v2) {
            long v6_1 = ((long)v2);
            for(v5 = 0; v5 < v3; ++v5) {
                if(1 == (v6_1 & 1)) {
                    v6_1 = v6_1 >>> 1 ^ -3932672073523589310L;
                }
                else {
                    v6_1 >>>= 1;
                }
            }

            lq.aj[v2] = v6_1;
        }
    }

    public lq(byte[] arg3) {
        try {
            super();
            this.ae = arg3;
            this.ar = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public lq(int arg3) {
        try {
            super();
            this.ae = gl.ae(arg3, 0x4FF95E63);
            this.ar = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void aa(String arg11, int arg12) {
        try {
            if(arg11.indexOf(0) < 0) {
                byte[] v0 = this.ae;
                int v1 = this.ar - 1880437085;
                this.ar = v1;
                v0[v1 * 0xF24F550B - 1] = 0;
                this.ar += db.an(arg11, 0, arg11.length(), this.ae, this.ar * 0xF24F550B, 0xBD3E3BDC) * -1880437085;
                byte[] v11_1 = this.ae;
                int v0_1 = this.ar - 1880437085;
                this.ar = v0_1;
                v11_1[v0_1 * 0xF24F550B - 1] = 0;
                return;
            }

            throw new IllegalArgumentException("");
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("lq.aa(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public void ab(boolean arg2, int arg3) {
        int v2 = arg2 ? 1 : 0;
        byte v3 = 0x6F;
        try {
            this.ar(v2, v3);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("lq.ab(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2_1), v3_1.toString());
        }
    }

    public int ac(byte arg4) {
        try {
            this.ar += 0x3FAB3A8C;
            return ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 24) + ((this.ae[this.ar * 0xF24F550B - 3] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.ac(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void ad(long arg7) {
        try {
            byte[] v0 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 40))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x20))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 24))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 16))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 8))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)arg7)));
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("lq.ad(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public void ae(int arg3) {
        try {
            if(this.ae != null) {
                kq.ar(this.ae, 0x66099F92);
            }

            this.ae = null;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ag(int arg3, int arg4) {
        if(arg3 >= 0 && arg3 <= 0xFF) {
            try {
                this.ae[this.ar * 0xF24F550B - arg3 - 1] = ((byte)arg3);
                return;
            label_12:
                throw new IllegalArgumentException();
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("lq.ag(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }
        }

        goto label_12;
    }

    public void ah(int arg2, int arg3) {
        if(arg2 >= 0 && arg2 < 0x80) {
            byte v3 = 7;
            try {
                this.ar(arg2, v3);
                return;
            label_6:
                if(arg2 >= 0) {
                    arg3 = 0x8000;
                    if(arg2 < arg3) {
                        this.an(arg2 + arg3, -1079930610);
                        return;
                    }
                }

                throw new IllegalArgumentException();
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("lq.ah(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }

        goto label_6;
    }

    public void ai(String arg9, byte arg10) {
        try {
            if(arg9.indexOf(0) < 0) {
                this.ar += db.an(arg9, 0, arg9.length(), this.ae, this.ar * 0xF24F550B, 0xCC3588F5) * -1880437085;
                byte[] v9_1 = this.ae;
                int v0 = this.ar - 1880437085;
                this.ar = v0;
                v9_1[v0 * 0xF24F550B - 1] = 0;
                return;
            }

            throw new IllegalArgumentException("");
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("lq.ai(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public void aj(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 24));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.aj(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public int ak(int arg4) {
        try {
            this.ar += 0xAFC06BE9;
            return ((this.ae[this.ar * 0xF24F550B - 3] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.ak(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void am(int arg4, int arg5) {
        if(arg4 < 0) {
            goto label_36;
        }

        try {
            this.ae[this.ar * 0xF24F550B - arg4 - 4] = ((byte)(arg4 >> 24));
            this.ae[this.ar * 0xF24F550B - arg4 - 3] = ((byte)(arg4 >> 16));
            this.ae[this.ar * 0xF24F550B - arg4 - 2] = ((byte)(arg4 >> 8));
            this.ae[this.ar * 0xF24F550B - arg4 - 1] = ((byte)arg4);
            return;
        label_36:
            throw new IllegalArgumentException();
        label_35:
        }
        catch(RuntimeException v4) {
            goto label_35;
        }

        StringBuilder v5 = new StringBuilder();
        v5.append("lq.am(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public void an(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.an(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public int ao(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            return ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void ap(int arg5, byte arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.ap(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void aq(long arg7) {
        try {
            byte[] v0 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 56))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x30))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 40))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x20))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 24))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 16))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 8))));
            v0 = this.ae;
            v1 = this.ar - 1880437085;
            this.ar = v1;
            v0[v1 * 0xF24F550B - 1] = ((byte)(((int)arg7)));
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("lq.aq(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public void ar(int arg3, byte arg4) {
        try {
            byte[] v4 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v4[v0 * 0xF24F550B - 1] = ((byte)arg3);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("lq.ar(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public int as(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            arg4 = ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
            if(arg4 <= 0x7FFF) {
                return arg4;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.as(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 0x10000;
    }

    public void at(int arg2, byte arg3) {
        if((arg2 & 0xFFFFFF80) != 0) {
            if((arg2 & 0xFFFFC000) != 0) {
                if((0xFFE00000 & arg2) != 0) {
                    if((0xF0000000 & arg2) != 0) {
                        int v3 = arg2 >>> 28 | 0x80;
                        byte v0 = 0x7C;
                        try {
                            this.ar(v3, v0);
                        label_14:
                            this.ar(arg2 >>> 21 | 0x80, 0x3F);
                        label_18:
                            this.ar(arg2 >>> 14 | 0x80, 39);
                        label_22:
                            this.ar(arg2 >>> 7 | 0x80, 80);
                        label_26:
                            this.ar(arg2 & 0x7F, 16);
                            return;
                        }
                        catch(RuntimeException v2) {
                            StringBuilder v3_1 = new StringBuilder();
                            v3_1.append("lq.at(");
                            v3_1.append(')');
                            throw lx.al(((Throwable)v2), v3_1.toString());
                        }
                    }

                    goto label_14;
                }

                goto label_18;
            }

            goto label_22;
        }

        goto label_26;
    }

    public void au(byte[] arg4, int arg5, int arg6, int arg7) {
        arg7 = arg5;
        while(arg7 < arg5 + arg6) {
            try {
                byte[] v0 = this.ae;
                int v1 = this.ar - 1880437085;
                this.ar = v1;
                v0[v1 * 0xF24F550B - 1] = arg4[arg7];
                ++arg7;
                continue;
            }
            catch(RuntimeException v4) {
                StringBuilder v5 = new StringBuilder();
                v5.append("lq.au(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
            }
        }
    }

    public byte aw(int arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return v3_1[v0 * 0xF24F550B - 1];
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.aw(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public int ay(byte arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return v3_1[v0 * 0xF24F550B - 1] & 0xFF;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.ay(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void az(int arg4, int arg5) {
        if(arg4 >= 0 && arg4 <= 0xFFFF) {
            try {
                this.ae[this.ar * 0xF24F550B - arg4 - 2] = ((byte)(arg4 >> 8));
                this.ae[this.ar * 0xF24F550B - arg4 - 1] = ((byte)arg4);
                return;
            label_20:
                throw new IllegalArgumentException();
            }
            catch(RuntimeException v4) {
                StringBuilder v5 = new StringBuilder();
                v5.append("lq.az(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
            }
        }

        goto label_20;
    }

    public boolean ba(int arg3) {
        boolean v0;
        byte v3 = -99;
        try {
            v0 = true;
            if((this.ay(v3) & 1) != 1) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.ba(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3_1), v0_1.toString());
        }

        return v0;
    }

    public void bb(int[] arg9, int arg10, int arg11, int arg12) {
        arg12 = 0xF24F550B;
        try {
            int v0 = this.ar * arg12;
            arg12 = -1880437085;
            this.ar = arg10 * arg12;
            arg11 = (arg11 - arg10) / 8;
            for(arg10 = 0; arg10 < arg11; ++arg10) {
                int v1 = this.ac(0x7B);
                int v2 = this.ac(46);
                int v3 = 0xC6EF3720;
                int v4 = -1640531527;
                int v5;
                for(v5 = 0x20; true; v5 = v6) {
                    int v6 = v5 - 1;
                    if(v5 <= 0) {
                        break;
                    }

                    v2 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ arg9[v3 >>> 11 & 3] + v3;
                    v3 -= v4;
                    v1 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg9[v3 & 3] + v3;
                }

                this.ar -= 0x7F567518;
                this.aj(v1, 0x79EF67B1);
                this.aj(v2, 0x79EF67B1);
            }

            this.ar = v0 * arg12;
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("lq.bb(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public void bc(BigInteger arg4, BigInteger arg5, int arg6) {
        arg6 = 0xF24F550B;
        try {
            int v0 = this.ar * arg6;
            this.ar = 0;
            byte[] v1 = new byte[v0];
            this.bw(v1, 0, v0, -482802005);
            byte[] v4_1 = new BigInteger(v1).modPow(arg4, arg5).toByteArray();
            this.ar = 0;
            this.an(v4_1.length, 0x9619F8D1);
            this.au(v4_1, 0, v4_1.length, 0xDE44F6FC);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("lq.bc(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public long bd(int arg7) {
        byte v7 = 72;
        try {
            return (((((long)this.ac(v7))) & 0xFFFFFFFFL) << 0x20) + (0xFFFFFFFFL & (((long)this.ac(104))));
        }
        catch(RuntimeException v7_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bd(");
            v0.append(')');
            throw lx.al(((Throwable)v7_1), v0.toString());
        }
    }

    public int be(byte arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return v3_1[v0 * 0xF24F550B - 1] - 0x80 & 0xFF;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.be(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public String bf(int arg3) {
        try {
            if(this.ae[this.ar * 0xF24F550B] == 0) {
                this.ar += -1880437085;
                return null;
            }

            return this.bn(9);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bf(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bg(int[] arg10, int arg11) {
        try {
            arg11 = this.ar * 0xF24F550B / 8;
            this.ar = 0;
            int v1;
            for(v1 = 0; v1 < arg11; ++v1) {
                int v2 = this.ac(20);
                int v3 = this.ac(56);
                int v4 = -1640531527;
                int v5 = 0x20;
                int v6 = 0;
                while(true) {
                    int v7 = v5 - 1;
                    if(v5 <= 0) {
                        break;
                    }

                    v2 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v6 & 3] + v6;
                    v6 += v4;
                    v3 += (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v6 >>> 11 & 3] + v6;
                    v5 = v7;
                }

                this.ar -= 0x7F567518;
                this.aj(v2, 0x79EF67B1);
                this.aj(v3, 0x79EF67B1);
            }
        }
        catch(RuntimeException v10) {
            goto label_51;
        }

        return;
    label_51:
        StringBuilder v11 = new StringBuilder();
        v11.append("lq.bg(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }

    public void bh(int[] arg10, int arg11, int arg12, int arg13) {
        try {
            arg13 = this.ar * 0xF24F550B;
            int v0 = -1880437085;
            this.ar = arg11 * v0;
            arg12 = (arg12 - arg11) / 8;
            int v1;
            for(v1 = 0; v1 < arg12; ++v1) {
                int v2 = this.ac(36);
                int v3 = this.ac(61);
                int v4 = -1640531527;
                int v5 = 0x20;
                int v6 = 0;
                while(true) {
                    int v7 = v5 - 1;
                    if(v5 <= 0) {
                        break;
                    }

                    v2 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v6 & 3] + v6;
                    v6 += v4;
                    v3 += (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v6 >>> 11 & 3] + v6;
                    v5 = v7;
                }

                this.ar -= 0x7F567518;
                this.aj(v2, 0x79EF67B1);
                this.aj(v3, 0x79EF67B1);
            }

            this.ar = arg13 * v0;
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("lq.bh(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    public byte bi(int arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return ((byte)(v3_1[v0 * 0xF24F550B - 1] - 0x80));
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.bi(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void bj(int arg3, int arg4) {
        try {
            byte[] v4 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v4[v0 * 0xF24F550B - 1] = ((byte)(arg3 + 0x80));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("lq.bj(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public int bk(int arg3, int arg4) {
        try {
            arg3 = at.ax(this.ae, arg3, this.ar * 0xF24F550B, 109);
            this.aj(arg3, 0x79EF67B1);
            return arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("lq.bk(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public int bl(byte arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return -v3_1[v0 * 0xF24F550B - 1] & 0xFF;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.bl(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public boolean bm(int arg4) {
        try {
            this.ar -= 0x3FAB3A8C;
            if(at.ax(this.ae, 0, this.ar * 0xF24F550B, 77) != this.ac(90)) {
                return 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bm(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 1;
    }

    public String bn(byte arg5) {
        try {
            int v0 = 0xF24F550B;
            int v5_1 = this.ar * v0;
            while(true) {
                byte[] v1 = this.ae;
                int v2 = this.ar - 1880437085;
                this.ar = v2;
                if(v1[v2 * v0 - 1] == 0) {
                    break;
                }
            }

            int v1_1 = this.ar * v0 - v5_1 - 1;
            if(v1_1 == 0) {
                return "";
            }

            return df.ap(this.ae, v5_1, v1_1, 0x7C503F57);
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.bn(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    public int bo(int arg3) {
        try {
            if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
                return this.ay(-74) - 0x40;
            }

            return this.ao(0xF46AB9DA) - 0xC000;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bo(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String bp(int arg5) {
        try {
            byte[] v5_1 = this.ae;
            int v1 = -1880437085;
            int v0 = this.ar + v1;
            this.ar = v0;
            int v2 = 0xF24F550B;
            if(v5_1[v0 * v2 - 1] == 0) {
                arg5 = this.ar * v2;
                while(true) {
                    byte[] v0_1 = this.ae;
                    int v3 = this.ar + v1;
                    this.ar = v3;
                    if(v0_1[v3 * v2 - 1] == 0) {
                        break;
                    }
                }

                v0 = this.ar * v2 - arg5 - 1;
                if(v0 == 0) {
                    return "";
                }

                return df.ap(this.ae, arg5, v0, 0x7F4FDD16);
            }

            throw new IllegalStateException("");
        }
        catch(RuntimeException v5) {
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("lq.bp(");
            v0_2.append(')');
            throw lx.al(((Throwable)v5), v0_2.toString());
        }
    }

    public int bq(int arg3) {
        try {
            if(this.ae[this.ar * 0xF24F550B] < 0) {
                return this.ac(110) & 0x7FFFFFFF;
            }

            arg3 = this.ao(0x14423E94);
            if(arg3 != 0x7FFF) {
                return arg3;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return -1;
    }

    public int br(int arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return 0x80 - v3_1[v0 * 0xF24F550B - 1] & 0xFF;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.br(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void bs(int arg3, int arg4) {
        try {
            byte[] v4 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v4[v0 * 0xF24F550B - 1] = ((byte)(0x80 - arg3));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("lq.bs(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public int bt(int arg3) {
        arg3 = 0;
        short v0 = 15064;
        try {
            int v0_1;
            for(v0_1 = this.by(v0); v0_1 == 0x7FFF; v0_1 = this.by(0x35E5)) {
                arg3 += 0x7FFF;
            }
        }
        catch(RuntimeException v3) {
            goto label_13;
        }

        return arg3 + v0_1;
    label_13:
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("lq.bt(");
        v0_2.append(')');
        throw lx.al(((Throwable)v3), v0_2.toString());
    }

    public void bu(int arg3, byte arg4) {
        try {
            byte[] v4 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v4[v0 * 0xF24F550B - 1] = ((byte)(-arg3));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("lq.bu(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public int bv(int arg3) {
        try {
            if(this.ae[this.ar * 0xF24F550B] < 0) {
                return this.ac(90) & 0x7FFFFFFF;
            }

            return this.ao(0x76C04679);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.bv(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bw(byte[] arg4, int arg5, int arg6, int arg7) {
        arg7 = arg5;
        while(arg7 < arg6 + arg5) {
            try {
                byte[] v0 = this.ae;
                int v1 = this.ar - 1880437085;
                this.ar = v1;
                arg4[arg7] = v0[v1 * 0xF24F550B - 1];
                ++arg7;
                continue;
            }
            catch(RuntimeException v4) {
                StringBuilder v5 = new StringBuilder();
                v5.append("lq.bw(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
            }
        }
    }

    public int bx(byte arg5) {
        int v5_2;
        int v0;
        try {
            byte[] v5_1 = this.ae;
            int v1 = -1880437085;
            v0 = this.ar + v1;
            this.ar = v0;
            int v2 = 0xF24F550B;
            v5_2 = v5_1[v0 * v2 - 1];
            v0 = 0;
            while(v5_2 < 0) {
                v0 = (v5_2 & 0x7F | v0) << 7;
                v5_1 = this.ae;
                int v3 = this.ar + v1;
                this.ar = v3;
                v5_2 = v5_1[v3 * v2 - 1];
            }
        }
        catch(RuntimeException v5) {
            goto label_26;
        }

        return v5_2 | v0;
    label_26:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("lq.bx(");
        v0_1.append(')');
        throw lx.al(((Throwable)v5), v0_1.toString());
    }

    public int by(short arg3) {
        try {
            if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
                return this.ay(-72);
            }

            return this.ao(-1100727756) - 0x8000;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.by(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bz(int[] arg9, int arg10) {
        try {
            arg10 = this.ar * 0xF24F550B / 8;
            int v0 = 0;
            this.ar = 0;
            while(v0 < arg10) {
                int v1 = this.ac(99);
                int v2 = this.ac(67);
                int v3 = 0xC6EF3720;
                int v4 = -1640531527;
                int v5;
                for(v5 = 0x20; true; v5 = v6) {
                    int v6 = v5 - 1;
                    if(v5 <= 0) {
                        break;
                    }

                    v2 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ arg9[v3 >>> 11 & 3] + v3;
                    v3 -= v4;
                    v1 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg9[v3 & 3] + v3;
                }

                this.ar -= 0x7F567518;
                this.aj(v1, 0x79EF67B1);
                this.aj(v2, 0x79EF67B1);
                ++v0;
            }
        }
        catch(RuntimeException v9) {
            goto label_50;
        }

        return;
    label_50:
        StringBuilder v10 = new StringBuilder();
        v10.append("lq.bz(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }

    public byte ca(int arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return ((byte)(-v3_1[v0 * 0xF24F550B - 1]));
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.ca(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public int cb(byte arg4) {
        try {
            this.ar += 0x1FD59D46;
            return (this.ae[this.ar * 0xF24F550B - 2] & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cb(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public int cc(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            arg4 = ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 2] & 0xFF);
            if(arg4 <= 0x7FFF) {
                return arg4;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cc(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 0x10000;
    }

    public void cd(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.cd(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void ce(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 24));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.ce(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void cf(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 + 0x80));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.cf(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void cg() {
        if(this.ae != null) {
            kq.ar(this.ae, 0x66099F92);
        }

        this.ae = null;
    }

    public void ch(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 24));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.ch(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void ci(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.ci(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public byte cj(int arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return ((byte)(0x80 - v3_1[v0 * 0xF24F550B - 1]));
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lq.cj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    static int ck(byte[] arg4, int arg5, int arg6) {
        int v0 = -1;
        while(arg5 < arg6) {
            v0 = lq.an[(v0 ^ arg4[arg5]) & 0xFF] ^ v0 >>> 8;
            ++arg5;
        }

        return ~v0;
    }

    public void cl(byte[] arg3, int arg4, int arg5, byte arg6) {
        arg5 = arg5 + arg4 - 1;
        while(arg5 >= arg4) {
            try {
                byte[] v6 = this.ae;
                int v0 = this.ar - 1880437085;
                this.ar = v0;
                arg3[arg5] = v6[v0 * 0xF24F550B - 1];
                --arg5;
                continue;
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("lq.cl(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }
        }
    }

    static int cm(byte[] arg4, int arg5, int arg6) {
        int v0 = -1;
        while(arg5 < arg6) {
            v0 = lq.an[(v0 ^ arg4[arg5]) & 0xFF] ^ v0 >>> 8;
            ++arg5;
        }

        return ~v0;
    }

    public int cn(byte arg6) {
        try {
            this.ar += 0x3FAB3A8C;
            return (this.ae[this.ar * 0xF24F550B - 2] & 0xFF) + (((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (((this.ae[this.ar * 0xF24F550B - 3] & 0xFF) << 24) + ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 16)));
        }
        catch(RuntimeException v6) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cn(");
            v0.append(')');
            throw lx.al(((Throwable)v6), v0.toString());
        }
    }

    public void co() {
        if(this.ae != null) {
            kq.ar(this.ae, 0x66099F92);
        }

        this.ae = null;
    }

    public int cp(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            arg4 = (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
            if(arg4 <= 0x7FFF) {
                return arg4;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cp(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 0x10000;
    }

    public static int cq(byte[] arg2, int arg3) {
        return at.ax(arg2, 0, arg3, 70);
    }

    public void cr(int arg5, int arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)arg5);
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 16));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 24));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.cr(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public int cs(byte arg6) {
        try {
            this.ar += 0x3FAB3A8C;
            return (this.ae[this.ar * 0xF24F550B - 4] & 0xFF) + (((this.ae[this.ar * 0xF24F550B - 3] & 0xFF) << 8) + (((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 24)));
        }
        catch(RuntimeException v6) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cs(");
            v0.append(')');
            throw lx.al(((Throwable)v6), v0.toString());
        }
    }

    static int ct(byte[] arg4, int arg5, int arg6) {
        int v0 = -1;
        while(arg5 < arg6) {
            v0 = lq.an[(v0 ^ arg4[arg5]) & 0xFF] ^ v0 >>> 8;
            ++arg5;
        }

        return ~v0;
    }

    static int cu(byte[] arg4, int arg5, int arg6) {
        int v0 = -1;
        while(arg5 < arg6) {
            v0 = lq.an[(v0 ^ arg4[arg5]) & 0xFF] ^ v0 >>> 8;
            ++arg5;
        }

        return ~v0;
    }

    public static int cv(byte[] arg2, int arg3) {
        return at.ax(arg2, 0, arg3, 22);
    }

    public int cw(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            return ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 2] - 0x80 & 0xFF);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cw(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void cx(int arg5, byte arg6) {
        try {
            byte[] v6 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 + 0x80));
            v6 = this.ae;
            v0 = this.ar - 1880437085;
            this.ar = v0;
            v6[v0 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("lq.cx(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public int cy(int arg4) {
        try {
            this.ar += 0x1FD59D46;
            return (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cy(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public int cz(int arg5) {
        try {
            this.ar += 0x3FAB3A8C;
            return (this.ae[this.ar * 0xF24F550B - 3] & 0xFF) + (((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 24) + ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 8));
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lq.cz(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public void da(String arg10) {
        if(arg10.indexOf(0) < 0) {
            this.ar += db.an(arg10, 0, arg10.length(), this.ae, this.ar * 0xF24F550B, 0x60D9394D) * 1809536825;
            byte[] v10 = this.ae;
            int v1 = this.ar - 0x317781C9;
            this.ar = v1;
            v10[v1 * 0xF24F550B - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public void db(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar + 0x653EF625;
        this.ar = v1;
        v0[v1 * 0x9FA82E5D - 1] = ((byte)(arg4 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * -1080185437 - 1] = ((byte)arg4);
    }

    public void dc(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xD9A0E53F - 1] = ((byte)(arg5 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x6434BD14 - 1] = ((byte)(arg5 >> 16));
        v0 = this.ae;
        v1 = this.ar + 2103066277;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x8EFB33C9 - 1] = ((byte)arg5);
    }

    public static int dd(String arg0) {
        return arg0.length() + 2;
    }

    public void de(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
    }

    public void df(long arg7) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 56))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x30))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 40))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x20))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 24))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 16))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 8))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)arg7)));
    }

    public static int dg(String arg0) {
        return arg0.length() + 2;
    }

    public void dh(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg4);
    }

    public static int di(String arg0) {
        return arg0.length() + 1;
    }

    public void dj(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
    }

    public void dk(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
    }

    public void dl(boolean arg2) {
        this.ar(((int)arg2), 0x5F);
    }

    public void dm(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar + 0x4E43FE1D;
        this.ar = v1;
        v0[v1 * 0x7EC6E316 - 1] = ((byte)(arg4 >> 8));
        v0 = this.ae;
        v1 = this.ar - 0x3CBF06A4;
        this.ar = v1;
        v0[v1 * 0x2F49ACAC - 1] = ((byte)arg4);
    }

    public static int dn(String arg0) {
        return arg0.length() + 1;
    }

    public void do(String arg10) {
        if(arg10.indexOf(0) < 0) {
            this.ar += db.an(arg10, 0, arg10.length(), this.ae, this.ar * 0xF24F550B, 0x17623BE5) * 0xB953E33E;
            byte[] v10 = this.ae;
            int v1 = this.ar + 1420764500;
            this.ar = v1;
            v10[v1 * 0xF24F550B - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public void dp(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg4);
    }

    public void dq(String arg9) {
        if(arg9.indexOf(0) < 0) {
            this.ar += db.an(arg9, 0, arg9.length(), this.ae, this.ar * 0xF24F550B, -510050573) * -1880437085;
            byte[] v9 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            v9[v1 * -1769166010 - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public void dr(boolean arg2) {
        this.ar(((int)arg2), 100);
    }

    public void ds(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
    }

    public static int dt(String arg0) {
        return arg0.length() + 2;
    }

    public void du(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
    }

    public void dv() {
        if(this.ae != null) {
            kq.ar(this.ae, 0x66099F92);
        }

        this.ae = null;
    }

    public void dw(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg4);
    }

    public static int dx(String arg0) {
        return arg0.length() + 1;
    }

    public void dy(long arg7) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 0x6C960710;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 0x807D48B1))));
        v0 = this.ae;
        v1 = this.ar - 0x5989EF19;
        this.ar = v1;
        v0[v1 * 0xA153242 - 1] = ((byte)(((int)(arg7 >> 0x20))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * -948058505 - 1] = ((byte)(((int)(arg7 >> 24))));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x227540F8 - 1] = ((byte)(((int)(arg7 >> 16))));
        v0 = this.ae;
        v1 = this.ar - 0x24672E5F;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)(arg7 >> 8))));
        v0 = this.ae;
        v1 = this.ar - 1303003122;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(((int)arg7)));
    }

    public void dz(String arg10) {
        if(arg10.indexOf(0) < 0) {
            this.ar += db.an(arg10, 0, arg10.length(), this.ae, this.ar * 0xF24F550B, 1457050159) * -1880437085;
            byte[] v10 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            v10[v1 * 0xF24F550B - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public void ea(byte[] arg5, int arg6, int arg7) {
        int v0;
        for(v0 = arg6; v0 < arg6 + arg7; ++v0) {
            byte[] v1 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            v1[v2 * 0xB16BBB01 - 1] = arg5[v0];
        }
    }

    public byte eb() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1];
    }

    public int ec() {
        this.ar += 0x1FD59D46;
        return ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
    }

    public byte ed() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1808305863;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1];
    }

    public int ee() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 817300120;
        this.ar = v1;
        return v0[v1 * 0xEB0BAA81 - 1] & 0x1CD78D50;
    }

    public int ef() {
        this.ar += 0xAFC06BE9;
        return ((this.ae[this.ar * 0xF24F550B - 3] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xFF);
    }

    public void eg(int arg3) {
        if((arg3 & 0xFFFFFF80) != 0) {
            if((-596030054 & arg3) != 0) {
                if((-104029587 & arg3) != 0) {
                    if((0x51687057 & arg3) != 0) {
                        this.ar(arg3 >>> 28 | 0x57991D10, 0x1F);
                    }

                    this.ar(arg3 >>> 21 | 0x45F3E231, 0x6F);
                }

                this.ar(arg3 >>> 14 | 0xDA8A3EF1, 57);
            }

            this.ar(arg3 >>> 7 | 0x80, 65);
        }

        this.ar(arg3 & 0x7F, 22);
    }

    public int eh() {
        this.ar += 0x1FD59D46;
        return ((this.ae[this.ar * 0xAD5DEB35 - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 2107843195);
    }

    public int ei() {
        this.ar += 0xBA36B80;
        int v0 = ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * 0x6EC647A1 - 1] & 0xFF);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public void ej(int arg4) {
        if(arg4 >= 0) {
            this.ae[this.ar * 0x371028FD - arg4 - 4] = ((byte)(arg4 >> 24));
            this.ae[this.ar * 0xD67703C4 - arg4 - 3] = ((byte)(arg4 >> 16));
            this.ae[this.ar * -595733008 - arg4 - 2] = ((byte)(arg4 >> 8));
            this.ae[this.ar * 0xF7E5CC6C - arg4 - 1] = ((byte)arg4);
            return;
        }

        throw new IllegalArgumentException();
    }

    public void ek(String arg10) {
        if(arg10.indexOf(0) < 0) {
            byte[] v1 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            v1[v2 * 1012052925 - 1] = 0;
            this.ar += db.an(arg10, 0, arg10.length(), this.ae, this.ar * 0xF24F550B, 1370017742) * 0x1D12F9E0;
            byte[] v10 = this.ae;
            int v1_1 = this.ar - 2027056250;
            this.ar = v1_1;
            v10[v1_1 * 0xF24F550B - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public void el(int arg2) {
        if(arg2 >= 0 && arg2 < 0x80) {
            this.ar(arg2, 21);
            return;
        }

        if(arg2 >= 0 && arg2 < 0x8000) {
            this.an(arg2 + 0x65EF576A, 0xABCDDDBB);
            return;
        }

        throw new IllegalArgumentException();
    }

    public void em(int arg4) {
        if(arg4 >= 0 && arg4 <= 0xFFFF) {
            this.ae[this.ar * 0xB635D237 - arg4 - 2] = ((byte)(arg4 >> 8));
            this.ae[this.ar * 0xD902E9B9 - arg4 - 1] = ((byte)arg4);
            return;
        }

        throw new IllegalArgumentException();
    }

    public void en(int arg4) {
        if(arg4 >= 0 && arg4 <= 0xFF) {
            this.ae[this.ar * 0xF24F550B - arg4 - 1] = ((byte)arg4);
            return;
        }

        throw new IllegalArgumentException();
    }

    public int eo() {
        this.ar += 0x3FAB3A8C;
        return ((this.ae[this.ar * 0xF24F550B - 4] & 379050181) << 24) + ((this.ae[this.ar * 0xF24F550B - 3] & 0xCC42FBF4) << 16) + ((this.ae[this.ar * 0x341FB4CB - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 0xD1B7C130);
    }

    public int ep() {
        this.ar += 0x1FD59D46;
        int v0 = ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8) + (this.ae[this.ar * -1906509626 - 1] & -228090141);
        if(v0 > 0x7FFF) {
            v0 -= 561470470;
        }

        return v0;
    }

    public void eq(int arg5) {
        if(arg5 >= 0) {
            this.ae[this.ar * 0xF24F550B - arg5 - 4] = ((byte)(arg5 >> 24));
            this.ae[this.ar * 0xF24F550B - arg5 - 3] = ((byte)(arg5 >> 16));
            this.ae[this.ar * 0xF24F550B - arg5 - 2] = ((byte)(arg5 >> 8));
            this.ae[this.ar * 0xF24F550B - arg5 - 1] = ((byte)arg5);
            return;
        }

        throw new IllegalArgumentException();
    }

    public void er(byte[] arg5, int arg6, int arg7) {
        int v0;
        for(v0 = arg6; v0 < arg6 + arg7; ++v0) {
            byte[] v1 = this.ae;
            int v2 = this.ar + 510825534;
            this.ar = v2;
            v1[v2 * 0xF24F550B - 1] = arg5[v0];
        }
    }

    public byte es() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1];
    }

    public int et() {
        this.ar += 0x3FAB3A8C;
        return ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 24) + ((this.ae[this.ar * 0xF24F550B - 3] & 0x67E5F70F) << 16) + ((this.ae[this.ar * 0xB17A16D3 - 2] & 146209010) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & -1409082429);
    }

    public int eu() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] & 0xFF;
    }

    public void ev(int arg4) {
        byte v1 = 90;
        if((arg4 & 0xFFFFFF80) != 0) {
            if((arg4 & 0xFFFFC000) != 0) {
                if((0xFFE00000 & arg4) != 0) {
                    if((0xF0000000 & arg4) != 0) {
                        this.ar(arg4 >>> 28 | 0x80, 88);
                    }

                    this.ar(arg4 >>> 21 | 0x80, 10);
                }

                this.ar(arg4 >>> 14 | 0x80, 12);
            }

            this.ar(arg4 >>> 7 | 0x80, v1);
        }

        this.ar(arg4 & 0x7F, v1);
    }

    public void ew(int arg3) {
        if((arg3 & 0xFFFFFF80) != 0) {
            if((arg3 & 0xFFFFC000) != 0) {
                if((0xFFE00000 & arg3) != 0) {
                    if((0xF0000000 & arg3) != 0) {
                        this.ar(arg3 >>> 28 | 0x80, 42);
                    }

                    this.ar(arg3 >>> 21 | 0x80, 0x20);
                }

                this.ar(arg3 >>> 14 | 0x80, 0x7C);
            }

            this.ar(arg3 >>> 7 | 0x80, 15);
        }

        this.ar(arg3 & 0x7F, 16);
    }

    public int ex() {
        this.ar += 0xEC6497EF;
        int v0 = ((this.ae[this.ar * 708941406 - 2] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 1] & 1215015458);
        if(v0 > 0x7FFF) {
            v0 -= 2115405180;
        }

        return v0;
    }

    public void ey(int arg4) {
        if(arg4 >= 0 && arg4 <= 0xFF) {
            this.ae[this.ar * 0x5A089E6F - arg4 - 1] = ((byte)arg4);
            return;
        }

        throw new IllegalArgumentException();
    }

    public void ez(String arg12) {
        if(arg12.indexOf(0) < 0) {
            byte[] v1 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            v1[v2 * 0xF24F550B - 1] = 0;
            this.ar += db.an(arg12, 0, arg12.length(), this.ae, this.ar * 0xF24F550B, -1700595902) * -1880437085;
            byte[] v12 = this.ae;
            int v1_1 = this.ar - 1880437085;
            this.ar = v1_1;
            v12[v1_1 * 0xF24F550B - 1] = 0;
            return;
        }

        throw new IllegalArgumentException("");
    }

    public int fa() {
        this.ar += 0x3FAB3A8C;
        return ((this.ae[this.ar * 0xF24F550B - 4] & 880052325) << 24) + ((this.ae[this.ar * 0xBE3F7043 - 3] & 0xBE58F0F9) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & -802831403) << 8) + (this.ae[this.ar * -2067563009 - 1] & 0x3F0EEEBD);
    }

    public String fb() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        if(v0[v1 * v3 - 1] == 0) {
            int v0_1 = this.ar * v3;
            while(true) {
                byte[] v1_1 = this.ae;
                int v4 = this.ar + v2;
                this.ar = v4;
                if(v1_1[v4 * v3 - 1] == 0) {
                    break;
                }
            }

            v1 = this.ar * v3 - v0_1 - 1;
            if(v1 == 0) {
                return "";
            }

            return df.ap(this.ae, v0_1, v1, 0x7AB4195F);
        }

        throw new IllegalStateException("");
    }

    public String fc() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        if(v0[v1 * 0xA770509 - 1] == 0) {
            v1 = 0xF24F550B;
            int v0_1 = this.ar * v1;
            while(true) {
                byte[] v3 = this.ae;
                int v4 = this.ar + v2;
                this.ar = v4;
                if(v3[v4 * v1 - 1] == 0) {
                    break;
                }
            }

            v1 = this.ar * 0x80FE5EAF - v0_1 - 1;
            if(v1 == 0) {
                return "";
            }

            return df.ap(this.ae, v0_1, v1, 2101072294);
        }

        throw new IllegalStateException("");
    }

    public long fd() {
        return (((((long)this.ac(0x79))) & 0xFFFFFFFFL) << 0x9E850425) + (0xFFFFFFFFL & (((long)this.ac(110))));
    }

    public long fe() {
        return (((((long)this.ac(98))) & 0xFFFFFFFFL) << 0x13C3CD9E) + (0xFFFFFFFFL & (((long)this.ac(52))));
    }

    public int ff() {
        if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
            return this.ay(-15) + 0x385613C9;
        }

        return this.ao(0xDF7DDEED) - 0xC000;
    }

    public int fg() {
        if(this.ae[this.ar * 0xF24F550B] < 0) {
            return this.ac(0x7B) & 0xBD1F0A94;
        }

        return this.ao(0xE95E7C71);
    }

    public boolean fh() {
        boolean v1 = true;
        if((this.ay(-18) & 1) == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public String fi() {
        int v4;
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        if(v0[v1 * 0x1639A01E - 1] == 0) {
            int v0_1 = this.ar * 0xD097E830;
            while(true) {
                byte[] v1_1 = this.ae;
                int v3 = this.ar + v2;
                this.ar = v3;
                v4 = 0xF24F550B;
                if(v1_1[v3 * v4 - 1] == 0) {
                    break;
                }
            }

            v1 = this.ar * v4 - v0_1 - 1;
            if(v1 == 0) {
                return "";
            }

            return df.ap(this.ae, v0_1, v1, 2043900740);
        }

        throw new IllegalStateException("");
    }

    public int fj() {
        if(this.ae[this.ar * 0xF24F550B] < 0) {
            return this.ac(24) & 0x7FFFFFFF;
        }

        return this.ao(0x9E0846BC);
    }

    public String fk() {
        if(this.ae[this.ar * 0xF24F550B] == 0) {
            this.ar += -1880437085;
            return null;
        }

        return this.bn(-22);
    }

    public boolean fl() {
        boolean v1 = true;
        if((this.ay(-59) & 1) == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public int fm() {
        if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
            return this.ay(-81) - 0x40;
        }

        return this.ao(0x9241BCD7) - 0xC000;
    }

    public void fn(byte[] arg5, int arg6, int arg7) {
        int v0;
        for(v0 = arg6; v0 < arg7 + arg6; ++v0) {
            byte[] v1 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            arg5[v0] = v1[v2 * 0xF24F550B - 1];
        }
    }

    public String fo() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 0x3B56DA6;
        this.ar = v1;
        if(v0[v1 * 0x2D6F6F30 - 1] == 0) {
            int v0_1 = this.ar * 0xF24F550B;
            while(true) {
                byte[] v1_1 = this.ae;
                int v2 = this.ar + 1190037157;
                this.ar = v2;
                if(v1_1[v2 * -1530130297 - 1] == 0) {
                    break;
                }
            }

            v1 = this.ar * 0x603CE4B0 - v0_1 - 1;
            if(v1 == 0) {
                return "";
            }

            return df.ap(this.ae, v0_1, v1, 2042833286);
        }

        throw new IllegalStateException("");
    }

    public int fp() {
        if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
            return this.ay(-98);
        }

        return this.ao(0x59F28400) - 0x8000;
    }

    public int fq() {
        if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0xCA5D9FE7) {
            return this.ay(-19) - 0x40;
        }

        return this.ao(0x9D49177F) - 0xC000;
    }

    public int fr() {
        int v0 = this.by(0x60DF);
        int v1 = 0;
        while(v0 == 0x7FFF) {
            v1 += 0x7FFF;
            v0 = this.by(7845);
        }

        return v1 + v0;
    }

    public int fs() {
        if(this.ae[this.ar * 0xC01590D3] < 0) {
            return this.ac(0x1F) & -1836000696;
        }

        int v0 = this.ao(0x51E1F33C);
        if(v0 == 0x7FFF) {
            return -1;
        }

        return v0;
    }

    public int ft() {
        int v0 = this.by(5571);
        int v1 = 0;
        while(v0 == 0x7FFF) {
            v1 += 0x7FFF;
            v0 = this.by(9959);
        }

        return v1 + v0;
    }

    public String fu() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        if(v0[v1 * v3 - 1] == 0) {
            int v0_1 = this.ar * 0xD47E627B;
            while(true) {
                byte[] v1_1 = this.ae;
                int v4 = this.ar + v2;
                this.ar = v4;
                if(v1_1[v4 * -1510982009 - 1] == 0) {
                    break;
                }
            }

            v1 = this.ar * v3 - v0_1 - 1;
            if(v1 == 0) {
                return "";
            }

            return df.ap(this.ae, v0_1, v1, 2008142170);
        }

        throw new IllegalStateException("");
    }

    public String fv() {
        if(this.ae[this.ar * 0xF24F550B] == 0) {
            this.ar += -1880437085;
            return null;
        }

        return this.bn(-79);
    }

    public int fw() {
        if((this.ae[this.ar * 0xF24F550B] & 0xFF) < 0x80) {
            return this.ay(-17);
        }

        return this.ao(2125998905) - 0x8000;
    }

    public void fx(byte[] arg5, int arg6, int arg7) {
        int v0;
        for(v0 = arg6; v0 < arg7 + arg6; ++v0) {
            byte[] v1 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            arg5[v0] = v1[v2 * 0xF24F550B - 1];
        }
    }

    public long fy() {
        return (((((long)this.ac(70))) & 0xFFFFFFFFL) << 0x20) + (0xFFFFFFFFL & (((long)this.ac(86))));
    }

    public long fz() {
        return (((((long)this.ac(46))) & 0xFFFFFFFFL) << 0x20) + (0xFFFFFFFFL & (((long)this.ac(62))));
    }

    public int ga() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        int v0_1 = v0[v1 * v3 - 1];
        v1 = 0;
        while(v0_1 < 0) {
            v1 = (v0_1 & 0x7F | v1) << 7;
            v0 = this.ae;
            int v4 = this.ar + v2;
            this.ar = v4;
            v0_1 = v0[v4 * v3 - 1];
        }

        return v0_1 | v1;
    }

    public void gb(int[] arg11) {
        int v0 = this.ar * 0xF24F550B / 8;
        this.ar = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = this.ac(76);
            int v4 = this.ac(0x7A);
            int v5 = -1640531527;
            int v6 = 0x20;
            int v7 = 0;
            while(true) {
                int v8 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 += (v4 << 4 ^ v4 >>> 5) + v4 ^ arg11[v7 & 3] + v7;
                v7 += v5;
                v4 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg11[v7 >>> 11 & 3] + v7;
                v6 = v8;
            }

            this.ar -= 0x7F567518;
            this.aj(v3, 0x79EF67B1);
            this.aj(v4, 0x79EF67B1);
        }
    }

    public int gc() {
        if(this.ae[this.ar * 0x9B7FF396] < 0) {
            return this.ac(0x40) & 0x5E258021;
        }

        int v0 = this.ao(1900261843);
        if(v0 == 0xEF838CA8) {
            v0 = -1;
        }

        return v0;
    }

    public void gd(int[] arg10, int arg11, int arg12) {
        int v0 = this.ar * 0xF24F550B;
        int v1 = -1880437085;
        this.ar = arg11 * v1;
        arg12 = (arg12 - arg11) / 8;
        for(arg11 = 0; arg11 < arg12; ++arg11) {
            int v2 = this.ac(41);
            int v3 = this.ac(0x73);
            int v4 = 0xC6EF3720;
            int v5 = -1640531527;
            int v6;
            for(v6 = 0x20; true; v6 = v7) {
                int v7 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v4 >>> 11 & 3] + v4;
                v4 -= v5;
                v2 -= (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v4 & 3] + v4;
            }

            this.ar -= 0x7F567518;
            this.aj(v2, 0x79EF67B1);
            this.aj(v3, 0x79EF67B1);
        }

        this.ar = v0 * v1;
    }

    public void ge(int[] arg5, int arg6, int arg7) {
        int v5 = this.ar * 0x7F1BA530;
        this.ar = 0x2600EF07 * arg6;
        arg7 = (arg7 - arg6) / 8;
        for(arg6 = 0; arg6 < arg7; ++arg6) {
            int v0 = this.ac(0x1F);
            int v1 = this.ac(101);
            this.ar -= 0xD4327DFA;
            this.aj(v0, 0x79EF67B1);
            this.aj(v1, 0x79EF67B1);
        }

        this.ar = v5 * 0x329BB90D;
    }

    public void gf(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 0x684B9445;
        this.ar = v1;
        v0[v1 * 0x8D07DC93 - 1] = ((byte)(arg4 + 0x20467889));
    }

    public int gg() {
        if(this.ae[this.ar * 0xF24F550B] < 0) {
            return this.ac(97) & 0x7FFFFFFF;
        }

        int v0 = this.ao(0xED3D8325);
        if(v0 == 0x7FFF) {
            return -1;
        }

        return v0;
    }

    public void gh(BigInteger arg5, BigInteger arg6) {
        int v0 = this.ar * 0xF24F550B;
        this.ar = 0;
        byte[] v2 = new byte[v0];
        this.bw(v2, 0, v0, -1943112220);
        byte[] v5 = new BigInteger(v2).modPow(arg5, arg6).toByteArray();
        this.ar = 0;
        this.an(v5.length, 0xE0A67FEA);
        this.au(v5, 0, v5.length, 0xFDF08C59);
    }

    public void gi(int[] arg11, int arg12, int arg13) {
        int v0 = this.ar * 0xF24F550B;
        int v1 = -1880437085;
        this.ar = arg12 * v1;
        arg13 = (arg13 - arg12) / 8;
        int v2;
        for(v2 = 0; v2 < arg13; ++v2) {
            int v3 = this.ac(11);
            int v4 = this.ac(21);
            int v5 = -1640531527;
            int v6 = 0x20;
            int v7 = 0;
            while(true) {
                int v8 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 += (v4 << 4 ^ v4 >>> 5) + v4 ^ arg11[v7 & 3] + v7;
                v7 += v5;
                v4 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg11[v7 >>> 11 & 3] + v7;
                v6 = v8;
            }

            this.ar -= 0x7F567518;
            this.aj(v3, 0x79EF67B1);
            this.aj(v4, 0x79EF67B1);
        }

        this.ar = v0 * v1;
    }

    public int gj() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v0_1 = v0[v1 * -975387700 - 1];
        v1 = 0;
        while(v0_1 < 0) {
            v1 = (v0_1 & 0xE27B7F39 | v1) << 7;
            v0 = this.ae;
            int v3 = this.ar + v2;
            this.ar = v3;
            v0_1 = v0[v3 * 0xF24F550B - 1];
        }

        return v0_1 | v1;
    }

    public void gk(int[] arg10, int arg11, int arg12) {
        int v0 = this.ar * 0xF24F550B;
        this.ar = -1880437085 * arg11;
        arg12 = (arg12 - arg11) / 8;
        int v1;
        for(v1 = 0; v1 < arg12; ++v1) {
            int v2 = this.ac(59);
            int v3 = this.ac(53);
            int v4 = 0xB71D49AB;
            int v5 = 0x20;
            int v6 = 0;
            while(true) {
                int v7 = v5 - 1;
                if(v5 <= 0) {
                    break;
                }

                v2 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v6 & 3] + v6;
                v6 += v4;
                v3 += (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v6 >>> 11 & 3] + v6;
                v5 = v7;
            }

            this.ar -= 490951826;
            this.aj(v2, 0x79EF67B1);
            this.aj(v3, 0x79EF67B1);
        }

        this.ar = v0 * -1851190254;
    }

    public int gl() {
        if(this.ae[this.ar * 0xF24F550B] < 0) {
            return this.ac(0x20) & 0xEAC056E5;
        }

        int v0 = this.ao(0x7EC4935E);
        if(v0 == 0xEA4E7AB4) {
            return -1;
        }

        return v0;
    }

    public int gm() {
        if(this.ae[this.ar * 0xF24F550B] < 0) {
            return this.ac(27) & 0x7FFFFFFF;
        }

        int v0 = this.ao(0xBF11D960);
        if(v0 == 0x7FFF) {
            v0 = -1;
        }

        return v0;
    }

    public int gn() {
        byte[] v0 = this.ae;
        int v1 = this.ar + 0x5FCD3A77;
        this.ar = v1;
        int v0_1 = v0[v1 * 0x6E05D7F1 - 1];
        v1 = 0;
        while(v0_1 < 0) {
            v1 = (v0_1 & 0xA5816038 | v1) << 7;
            v0 = this.ae;
            int v2 = this.ar - 1880437085;
            this.ar = v2;
            v0_1 = v0[v2 * 0xE25839AE - 1];
        }

        return v0_1 | v1;
    }

    public void go(BigInteger arg5, BigInteger arg6) {
        int v0 = this.ar * 0xF24F550B;
        this.ar = 0;
        byte[] v2 = new byte[v0];
        this.bw(v2, 0, v0, 0xA5AC92E6);
        byte[] v5 = new BigInteger(v2).modPow(arg5, arg6).toByteArray();
        this.ar = 0;
        this.an(v5.length, 0x7473EF0F);
        this.au(v5, 0, v5.length, 760504746);
    }

    public int gp(int arg4) {
        arg4 = at.ax(this.ae, arg4, this.ar * -313606874, 0x73);
        this.aj(arg4, 0x79EF67B1);
        return arg4;
    }

    public boolean gq() {
        this.ar -= 0x71FD60F;
        if(at.ax(this.ae, 0, this.ar * 0xF24F550B, 107) == this.ac(73)) {
            return 1;
        }

        return 0;
    }

    public void gr(int[] arg10) {
        int v0 = this.ar * 0xF24F550B / 8;
        int v1 = 0;
        this.ar = 0;
        while(v1 < v0) {
            int v2 = this.ac(87);
            int v3 = this.ac(54);
            int v4 = 0xC6EF3720;
            int v5 = -1640531527;
            int v6;
            for(v6 = 0x20; true; v6 = v7) {
                int v7 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v4 >>> 11 & 3] + v4;
                v4 -= v5;
                v2 -= (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v4 & 3] + v4;
            }

            this.ar -= 0x7F567518;
            this.aj(v2, 0x79EF67B1);
            this.aj(v3, 0x79EF67B1);
            ++v1;
        }
    }

    public int gs() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        int v0_1 = v0[v1 * v3 - 1];
        v1 = 0;
        while(v0_1 < 0) {
            v1 = (v0_1 & 0x7F | v1) << 7;
            v0 = this.ae;
            int v4 = this.ar + v2;
            this.ar = v4;
            v0_1 = v0[v4 * v3 - 1];
        }

        return v0_1 | v1;
    }

    public void gt(int[] arg11, int arg12, int arg13) {
        int v0 = this.ar * 0xF24F550B;
        int v1 = -1880437085;
        this.ar = arg12 * v1;
        arg13 = (arg13 - arg12) / 8;
        int v2;
        for(v2 = 0; v2 < arg13; ++v2) {
            int v3 = this.ac(0x7D);
            int v4 = this.ac(0x40);
            int v5 = -1640531527;
            int v6 = 0x20;
            int v7 = 0;
            while(true) {
                int v8 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 += (v4 << 4 ^ v4 >>> 5) + v4 ^ arg11[v7 & 3] + v7;
                v7 += v5;
                v4 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg11[v7 >>> 11 & 3] + v7;
                v6 = v8;
            }

            this.ar -= 0x7F567518;
            this.aj(v3, 0x79EF67B1);
            this.aj(v4, 0x79EF67B1);
        }

        this.ar = v0 * v1;
    }

    public int gu() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        int v0_1 = v0[v1 * v3 - 1];
        v1 = 0;
        while(v0_1 < 0) {
            v1 = (v0_1 & 0x7F | v1) << 7;
            v0 = this.ae;
            int v4 = this.ar + v2;
            this.ar = v4;
            v0_1 = v0[v4 * v3 - 1];
        }

        return v0_1 | v1;
    }

    public boolean gv() {
        this.ar -= 0x3FAB3A8C;
        if(at.ax(this.ae, 0, this.ar * 0xF24F550B, 6) == this.ac(85)) {
            return 1;
        }

        return 0;
    }

    public void gw(int[] arg10, int arg11, int arg12) {
        int v0 = this.ar * 0xF24F550B;
        int v1 = -1880437085;
        this.ar = arg11 * v1;
        arg12 = (arg12 - arg11) / 8;
        for(arg11 = 0; arg11 < arg12; ++arg11) {
            int v2 = this.ac(110);
            int v3 = this.ac(77);
            int v4 = 0xC6EF3720;
            int v5 = -1640531527;
            int v6;
            for(v6 = 0x20; true; v6 = v7) {
                int v7 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v4 >>> 11 & 3] + v4;
                v4 -= v5;
                v2 -= (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v4 & 3] + v4;
            }

            this.ar -= 0x7F567518;
            this.aj(v2, 0x79EF67B1);
            this.aj(v3, 0x79EF67B1);
        }

        this.ar = v0 * v1;
    }

    public void gx(int[] arg11) {
        int v0 = this.ar * -491900032 / 8;
        this.ar = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = this.ac(50);
            int v4 = this.ac(60);
            int v5 = 900387774;
            int v6 = 0x20;
            int v7 = 0;
            while(true) {
                int v8 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 += (v4 << 4 ^ v4 >>> 5) + v4 ^ arg11[v7 & 3] + v7;
                v7 += v5;
                v4 += (v3 << 4 ^ v3 >>> 5) + v3 ^ arg11[v7 >>> 11 & 3] + v7;
                v6 = v8;
            }

            this.ar -= 0x7F567518;
            this.aj(v3, 0x79EF67B1);
            this.aj(v4, 0x79EF67B1);
        }
    }

    public void gy(int[] arg10) {
        int v0 = this.ar * 0xF24F550B / 8;
        int v1 = 0;
        this.ar = 0;
        while(v1 < v0) {
            int v2 = this.ac(74);
            int v3 = this.ac(52);
            int v4 = -627823209;
            int v5 = 0xB7FCF427;
            int v6;
            for(v6 = 0x20; true; v6 = v7) {
                int v7 = v6 - 1;
                if(v6 <= 0) {
                    break;
                }

                v3 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg10[v4 >>> 11 & 3] + v4;
                v4 -= v5;
                v2 -= (v3 << 4 ^ v3 >>> 5) + v3 ^ arg10[v4 & 3] + v4;
            }

            this.ar -= 0x17C04AD3;
            this.aj(v2, 0x79EF67B1);
            this.aj(v3, 0x79EF67B1);
            ++v1;
        }
    }

    public void gz(int[] arg9, int arg10, int arg11) {
        int v0 = this.ar * 1186033250;
        this.ar = 0xFA7D9771 * arg10;
        arg11 = (arg11 - arg10) / 8;
        for(arg10 = 0; arg10 < arg11; ++arg10) {
            int v1 = this.ac(54);
            int v2 = this.ac(13);
            int v3 = 0xC6EF3720;
            int v4 = 0x8AC75FA6;
            int v5;
            for(v5 = 0x20; true; v5 = v6) {
                int v6 = v5 - 1;
                if(v5 <= 0) {
                    break;
                }

                v2 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ arg9[v3 >>> 11 & 3] + v3;
                v3 -= v4;
                v1 -= (v2 << 4 ^ v2 >>> 5) + v2 ^ arg9[v3 & 3] + v3;
            }

            this.ar -= 0x40263D51;
            this.aj(v1, 0x79EF67B1);
            this.aj(v2, 0x79EF67B1);
        }

        this.ar = v0 * 0x7C0CE740;
    }

    public byte ha() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return ((byte)(0x80 - v0[v1 * 0xF24F550B - 1]));
    }

    public void hb(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(-arg4));
    }

    public void hc(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg4 + 0x80));
    }

    public byte he() {
        byte[] v0 = this.ae;
        int v1 = this.ar + 0x2E629841;
        this.ar = v1;
        return ((byte)(v0[v1 * 0xF24F550B - 1] - 0x80));
    }

    public void hf(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(0x80 - arg4));
    }

    public int hg() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] - 0x80 & 0xFF;
    }

    public void hi(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(-arg4));
    }

    public void hj(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public int hk() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return 0x80 - v0[v1 * 0xF24F550B - 1] & 0xFF;
    }

    public byte hl() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 0x4D45966F;
        this.ar = v1;
        return ((byte)(v0[v1 * 210595008 - 1] - 0x80));
    }

    public int hn() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return -v0[v1 * 0xF24F550B - 1] & 0xFF;
    }

    public int ho() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1969861307;
        this.ar = v1;
        return 0x5D348440 & 0xBF0AA7EC - v0[v1 * -1612940201 - 1];
    }

    public byte hp() {
        byte[] v0 = this.ae;
        int v1 = this.ar + 1072458008;
        this.ar = v1;
        return ((byte)(0x3A0399B1 - v0[v1 * 0xF24F550B - 1]));
    }

    public byte hq() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return ((byte)(-v0[v1 * 0xF24F550B - 1]));
    }

    public int hr() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] - 0x80 & 0xFF;
    }

    public int hs() {
        byte[] v0 = this.ae;
        int v1 = this.ar + 55807401;
        this.ar = v1;
        return v0[v1 * 0xA9DC8A38 - 1] - 0x80 & -1963739030;
    }

    public int hu() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return 0x80 - v0[v1 * 0xF24F550B - 1] & 0xFF;
    }

    public void hv(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public int hw() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 590870321;
        this.ar = v1;
        return 0x80 - v0[v1 * 0xF24F550B - 1] & 0xFF;
    }

    public void ia(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar + 884097738;
        this.ar = v1;
        v0[v1 * 0xCAB83245 - 1] = ((byte)(0x9A35CF94 + arg4));
        v0 = this.ae;
        v1 = this.ar + 0x60CC76E7;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg4 >> 8));
    }

    public void ib(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 + 0x80));
    }

    public void ic(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
    }

    public int id() {
        this.ar += 0x1FD59D46;
        int v0 = ((this.ae[this.ar * 0xF24F550B - 1] & 0x7E226270) << 8) + (this.ae[this.ar * 0xF24F550B - 2] & 0x9D8883C8);
        if(v0 > 0x7FFF) {
            v0 -= 0x46886E08;
        }

        return v0;
    }

    public int ie() {
        this.ar += 0x1FD59D46;
        int v0 = ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 2] & 0xFF);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public int if() {
        this.ar += 0x1FD59D46;
        int v0 = (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public int ig() {
        this.ar += 0x6A74257D;
        return (this.ae[this.ar * 0xA230C4DF - 2] & 0xFF) + ((this.ae[this.ar * 0x6A0456BF - 1] & 0xFF) << 8);
    }

    public void ih(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public int ii() {
        this.ar += 0xB50B4BCF;
        return (this.ae[this.ar * 0xF24F550B - 1] + 0x2085C7AA & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & -1803838775) << 8);
    }

    public void ij(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 640720604;
        this.ar = v1;
        v0[v1 * -999807049 - 1] = ((byte)arg5);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x9F5C2D6C - 1] = ((byte)(arg5 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x9D8FEFC4 - 1] = ((byte)(arg5 >> 16));
        v0 = this.ae;
        v1 = this.ar - 0x25A5E1EF;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 >> 24));
    }

    public int ik() {
        this.ar += 0x1FD59D46;
        return (this.ae[this.ar * 0xF24F550B - 2] & 0xFE5AF95B) + ((this.ae[this.ar * 0x9AE6E58 - 1] & 0xFF) << 8);
    }

    public void il(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 308118104 - 1] = ((byte)(arg5 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xB6EE2A31 - 1] = ((byte)(arg5 + 0x80));
    }

    public void im(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
    }

    public int in() {
        this.ar += 0x1FD59D46;
        int v0 = ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (this.ae[this.ar * 0xF24F550B - 2] & 0xFF);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public int io() {
        this.ar += 0x1FD59D46;
        return (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
    }

    public void ip(int arg4) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 970229895 - 1] = ((byte)(arg4 + 0x80));
        v0 = this.ae;
        v1 = this.ar - 960718161;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg4 >> 8));
    }

    public int iq() {
        this.ar += 0x1FD59D46;
        int v0 = (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public void ir(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public void is(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 + 0x80));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public int it() {
        this.ar += 0x1FD59D46;
        int v0 = (this.ae[this.ar * 0xF24F550B - 1] - 0x80 & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 8);
        if(v0 > 0x7FFF) {
            v0 -= 0x10000;
        }

        return v0;
    }

    public void iu(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
    }

    public void iv(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar + 0x2E1DF09F;
        this.ar = v1;
        v0[v1 * -183049966 - 1] = ((byte)arg5);
        v0 = this.ae;
        v1 = this.ar + 0x759FAF47;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0x915A2B4D - 1] = ((byte)(arg5 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 1516865800 - 1] = ((byte)(arg5 >> 24));
    }

    public void iw(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
    }

    public int ix() {
        this.ar += 0x1FD59D46;
        return (this.ae[this.ar * 0xF24F550B - 2] & 0xFF) + ((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8);
    }

    public int iy() {
        this.ar += 0x1FD59D46;
        return ((this.ae[this.ar * -180722850 - 1] & 0xBB5C4C95) << 8) + (this.ae[this.ar * 0x7B0834A6 - 2] - 0x80 & 0xD0027B3C);
    }

    public void iz(int arg6) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)arg6);
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 8));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 16));
        v0 = this.ae;
        v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg6 >> 24));
    }

    public int jb() {
        this.ar += 0x3FAB3A8C;
        return (this.ae[this.ar * 0xF24F550B - 2] & 0xFF) + (((this.ae[this.ar * 0x289E60AC - 1] & 0xFF) << 8) + (((this.ae[this.ar * 0xF24F550B - 3] & 0xF3FADC06) << 24) + ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 16)));
    }

    public int jc() {
        this.ar += 0xEC574E86;
        return (this.ae[this.ar * 0xE8A70B6F - 4] & 0xFF) + (((this.ae[this.ar * 0x4960B813 - 3] & 0xFF) << 8) + (((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 16) + ((this.ae[this.ar * 0x9F9AAF5D - 1] & 0xFF) << 24)));
    }

    public void jd(byte[] arg4, int arg5, int arg6) {
        for(arg6 = arg6 + arg5 - 1; arg6 >= arg5; --arg6) {
            byte[] v0 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            arg4[arg6] = v0[v1 * 0xF24F550B - 1];
        }
    }

    public void je(byte[] arg4, int arg5, int arg6) {
        for(arg6 = arg6 + arg5 - 1; arg6 >= arg5; --arg6) {
            byte[] v0 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            arg4[arg6] = v0[v1 * 0xF24F550B - 1];
        }
    }

    public int jh() {
        this.ar += 0x3FAB3A8C;
        return (this.ae[this.ar * 0xF24F550B - 3] & 0xA3B9B0A6) + (((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0x1515A389) << 24) + ((this.ae[this.ar * 0x6352BB15 - 4] & -1054652762) << 8));
    }

    public int ji() {
        this.ar += 1098519628;
        return (this.ae[this.ar * 0xF24F550B - 2] & -328456099) + (((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 8) + (((this.ae[this.ar * 1817075700 - 3] & 0xFF) << 24) + ((this.ae[this.ar * 0xC7947676 - 4] & 0x21B5BF1D) << 16)));
    }

    public int jk() {
        this.ar += 0x81503188;
        return (this.ae[this.ar * -448170142 - 2] & 0xFF) + (((this.ae[this.ar * 0x6CA35444 - 1] & 0x490918F6) << 8) + (((this.ae[this.ar * 0xF24F550B - 3] & 0x6E2E00B4) << 24) + ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 16)));
    }

    public void jn(byte[] arg4, int arg5, int arg6) {
        for(arg6 = arg6 + arg5 - 1; arg6 >= arg5; --arg6) {
            byte[] v0 = this.ae;
            int v1 = this.ar - 1880437085;
            this.ar = v1;
            arg4[arg6] = v0[v1 * 0xF24F550B - 1];
        }
    }

    public int jx() {
        this.ar += 0x3FAB3A8C;
        return (this.ae[this.ar * 0xF24F550B - 3] & 0xFF) + (((this.ae[this.ar * 0xF24F550B - 1] & 0xFF) << 16) + ((this.ae[this.ar * 0xF24F550B - 2] & 0xFF) << 24) + ((this.ae[this.ar * 0xF24F550B - 4] & 0xFF) << 8));
    }
}

