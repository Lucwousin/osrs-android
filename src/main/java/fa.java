public abstract class fa {
    public int ae;
    public static final int ah = 66;
    public int aj;
    public int al;
    public int an;
    public int ap;
    static final int aq = 15;
    public int ar;
    public int[] ax;
    static int rm;

    fa(int arg2, int arg3) {
        int v0 = arg2 * arg3;
        try {
            this(new int[v0], arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fa.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    fa(int[] arg2, int arg3, int arg4) {
        try {
            super();
            this.ar = 0;
            this.an = 0;
            this.ap = 0;
            this.aj = 0;
            this.ex(arg2, arg3, arg4, 0x60A78A7A);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fa.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public abstract void aa(es arg1, int arg2, int arg3, byte arg4);

    abstract void ab(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    abstract void ad(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void ae(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    public static int ae(int arg0, int arg1) {
        --arg0;
        arg0 |= arg0 >>> 1;
        arg0 |= arg0 >>> 2;
        arg0 |= arg0 >>> 4;
        arg0 |= arg0 >>> 8;
        return (arg0 | arg0 >>> 16) + 1;
    }

    public abstract void af(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void ag(ef arg1, int arg2, int arg3, byte arg4);

    public abstract void ai(int arg1, int arg2, int arg3, int arg4, byte arg5);

    public abstract void aj(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void al(byte arg1);

    public abstract void am(es arg1, int arg2, int arg3, int arg4);

    static void an(int arg3, int arg4) {
        try {
            mx v3_1 = jb.ax.ax(((long)arg3));
            if(v3_1 == null) {
                return;
            }

            int v0;
            for(v0 = 0; v0 < ((jb)v3_1).al.length; ++v0) {
                ((jb)v3_1).al[v0] = -1;
                ((jb)v3_1).ae[v0] = 0;
            }
        }
        catch(RuntimeException v3) {
            goto label_20;
        }

        return;
    label_20:
        StringBuilder v4 = new StringBuilder();
        v4.append("fa.an(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public abstract void an(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    public abstract void ap(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, boolean arg9, int arg10);

    public abstract void aq(int arg1, int arg2, int arg3, int arg4, int arg5);

    static final void aq(ar arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        try {
            if(arg1.dr == null) {
                if(arg3 != null) {
                    arg1.dr = new byte[11][];
                    arg1.dn = new byte[11][];
                    arg1.dx = new int[11];
                    arg1.di = new int[11];
                }
                else {
                    return;
                }
            }

            arg1.dr[arg2] = arg3;
            if(arg3 != null) {
                arg1.dl = true;
            }
            else {
                int v3 = 0;
                arg1.dl = false;
                while(v3 < arg1.dr.length) {
                    if(arg1.dr[v3] != null) {
                        arg1.dl = true;
                    }
                    else {
                        ++v3;
                        continue;
                    }

                    break;
                }
            }

            arg1.dn[arg2] = arg4;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fa.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public abstract void ar(int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6);

    public abstract void as(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void at(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void av(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void aw(ef arg1, int arg2, int arg3, int arg4, int arg5, byte arg6);

    abstract void ax(int arg1);

    public abstract void bb();

    public abstract void bc();

    public abstract void bd(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    public abstract void bf(es arg1, int arg2, int arg3, int arg4, int arg5);

    abstract void bg();

    public abstract void bh();

    public abstract void bi(int arg1, int arg2, int arg3, int arg4);

    public abstract void bj(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void bk(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void bl(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, boolean arg9);

    public abstract void bm(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void bo(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10);

    public abstract void bp(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    public abstract void bq(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void br(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, boolean arg9);

    public abstract void bs(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void bt(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8, int arg9, byte arg10);

    public abstract void bu(int arg1, int arg2, int arg3, int arg4, int arg5);

    abstract void bv(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8);

    public static final void bw(bh arg1, int arg2) {
        try {
            ii.au = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fa.bw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    abstract void bx();

    public abstract void by(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int[] arg11, int arg12);

    public abstract void bz();

    public abstract void ca(int arg1, int arg2, int arg3, int arg4);

    public abstract void cb(int arg1, int arg2, int arg3, int arg4);

    public abstract void cc(int arg1, int arg2, int arg3, int arg4, int arg5);

    abstract void cd(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void ce(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void cf(int arg1, int arg2, int arg3, int arg4);

    public abstract void cg(es arg1, int arg2, int arg3);

    public abstract void ch(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void ci(int arg1, int arg2, int arg3, int arg4);

    public abstract void cj(int arg1, int arg2, int arg3, int arg4);

    public abstract void ck(es arg1, int arg2, int arg3);

    public abstract void cl(es arg1, int arg2, int arg3);

    public abstract void cn(es arg1, int arg2, int arg3);

    public abstract void cp(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void cr(int arg1, int arg2, int arg3, int arg4);

    public abstract void cs(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void cv(es arg1, int arg2, int arg3);

    abstract void cw(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void cx(int arg1, int arg2, int arg3, int arg4);

    abstract void cy(int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void cz(es arg1, int arg2, int arg3);

    public abstract void de(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void dh(ef arg1, int arg2, int arg3);

    public abstract void dl(es arg1, int arg2, int arg3, int arg4);

    public abstract void dq(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void dr(es arg1, int arg2, int arg3, int arg4);

    public abstract void ds(ef arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void dt(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void dw(ef arg1, int arg2, int arg3);

    abstract void eb(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    public abstract void ec(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void ed(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int[] arg11);

    public abstract void ee(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int[] arg11);

    public final void ef(int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int v0 = -107049639;
            if(arg4 > this.al * v0) {
                arg4 = this.al * v0;
            }

            v0 = 129208929;
            if(arg5 > this.ae * v0) {
                arg5 = this.ae * v0;
            }

            this.ap = 0;
            this.ar = 0;
            this.aj = arg4 * 0x2C6AD05;
            this.an = arg5 * 0x2A8239E7;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fa.ef(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public abstract void eg(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int[] arg11);

    abstract void eh(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    public abstract void ei(es arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void ej(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void ek(es arg1, int arg2, int arg3, int arg4);

    public abstract void em(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public final void eo(int arg2, int arg3, int arg4, int arg5, int arg6) {
        arg6 = 0xE4D30573;
        try {
            if(this.ap * arg6 < arg2) {
                this.ap = arg2 * 1044359099;
            }

            if(this.ar * 2002832733 < arg3) {
                this.ar = arg3 * 0x513BEEF5;
            }

            if(this.aj * 0x56AC17CD > arg4) {
                this.aj = arg4 * 0x2C6AD05;
            }

            if(this.an * 0xD21DC9D7 > arg5) {
                this.an = arg5 * 0x2A8239E7;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fa.eo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static final int eo(int arg1, byte arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 >= client.eu.length) {
                }
                else {
                    return client.eu[arg1];
                }
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("fa.eo(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }

        return -1;
    }

    public final void ep(int arg3) {
        try {
            this.ap = 0;
            this.ar = 0;
            this.aj = this.al * 0xA73E7BD;
            this.an = this.ae * 769830535;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fa.ep(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public abstract void es(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8, int arg9);

    public final void et(int[] arg3, int arg4) {
        int v0 = 0xE4D30573;
        try {
            arg3[0] = this.ap * v0;
            arg3[1] = this.ar * 2002832733;
            arg3[2] = this.aj * 0x56AC17CD;
            arg3[3] = this.an * 0xD21DC9D7;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fa.et(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public abstract void eu(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int[] arg11);

    public abstract void ev(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9);

    public abstract void ew(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9);

    void ex(int[] arg1, int arg2, int arg3, int arg4) {
        try {
            this.ax = arg1;
            this.al = arg2 * 0x67AEEAE9;
            this.ae = arg3 * 1932038561;
            this.ep(0xD9CC4AFD);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fa.ex(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public abstract void ey(es arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void ez(es arg1, int arg2, int arg3, int arg4);

    public final void fa(int[] arg2, int arg3) {
        try {
            this.ap = arg2[0] * 1044359099;
            this.ar = arg2[1] * 0x513BEEF5;
            this.aj = arg2[2] * 0x2C6AD05;
            this.an = arg2[3] * 0x2A8239E7;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fa.fa(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void fb(int arg3, int arg4, int arg5, int arg6) {
        if(arg5 > this.al * 0x50512EEB) {
            arg5 = this.al * -107049639;
        }

        if(arg6 > this.ae * 0x322CD6EF) {
            arg6 = 129208929 * this.ae;
        }

        this.ap = 0;
        this.ar = 0;
        this.aj = arg5 * 0x2C6AD05;
        this.an = arg6 * 0x2A8239E7;
    }

    void fc(int[] arg1, int arg2, int arg3) {
        this.ax = arg1;
        this.al = arg2 * 0x67AEEAE9;
        this.ae = arg3 * 1932038561;
        this.ep(0xD9CC4AFD);
    }

    public void fd(int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int v2;
        int v4;
        int v1;
        if(arg10 > 0) {
            if(arg11 <= 0) {
            }
            else {
                arg14 = 0;
                int v0 = 0x10000;
                try {
                    v1 = v0 / arg11;
                    int v3 = 0xE4D30573;
                    if(arg8 < this.ap * v3) {
                        arg10 -= this.ap * v3 - arg8;
                        arg8 = this.ap * v3;
                    }

                    v3 = 2002832733;
                    if(arg9 < this.ar * v3) {
                        arg14 = (this.ar * v3 - arg9) * v1;
                        arg11 -= this.ar * v3 - arg9;
                        arg9 = this.ar * v3;
                    }

                    v4 = 0x56AC17CD;
                    if(arg10 + arg8 > this.aj * v4) {
                        arg10 = this.aj * v4 - arg8;
                    }

                    v4 = 0xD21DC9D7;
                    if(arg11 + arg9 > this.an * v4) {
                        arg11 = this.an * v4 - arg9;
                    }

                    v2 = this.al * -107049639 - arg10;
                    v4 = this.al * -107049639 * arg9 + arg8;
                    arg8 = -arg11;
                    while(true) {
                    label_56:
                        if(arg8 >= 0) {
                            return;
                        }

                        arg9 = v0 - arg14 >> 8;
                        arg11 = arg14 >> 8;
                        arg9 = (0xFF0000 & (arg13 & 0xFF00) * arg11 + (0xFF00 & arg12) * arg9) + (arg9 * (arg12 & 0xFF00FF) + (0xFF00FF & arg13) * arg11 & 0xFF00FF00) >>> 8;
                        arg11 = -arg10;
                        while(arg11 < 0) {
                            this.ax[v4] = arg9;
                            ++arg11;
                            ++v4;
                        }
                    }
                }
                catch(RuntimeException v8) {
                    goto label_93;
                }

                v4 += v2;
                arg14 += v1;
                ++arg8;
                goto label_56;
                return;
            label_93:
                StringBuilder v9 = new StringBuilder();
                v9.append("fa.fd(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }
    }

    void fe(int arg3, int arg4, int arg5, int arg6) {
        arg6 = 0xE4D30573;
        try {
            if(arg3 >= this.ap * arg6 && arg4 >= this.ar * 2002832733 && arg3 < this.aj * 0x56AC17CD) {
                if(arg4 >= this.an * 0xD21DC9D7) {
                }
                else {
                    this.ax[this.al * -107049639 * arg4 + arg3] = arg5;
                    return;
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fa.fe(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final void ff(int[] arg4) {
        arg4[0] = this.ap * -885831045;
        arg4[1] = this.ar * -1520655515;
        arg4[2] = this.aj * 0x56AC17CD;
        arg4[3] = this.an * 0xA96D12C5;
    }

    void fg(int arg4, int arg5, int arg6) {
        if(arg4 >= this.ap * 0xE4D30573 && arg5 >= this.ar * 2002832733 && arg4 < this.aj * 0x56AC17CD) {
            if(arg5 >= this.an * 0xD21DC9D7) {
            }
            else {
                this.ax[this.al * -107049639 * arg5 + arg4] = arg6;
                return;
            }
        }
    }

    public final void fh(int arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10) {
        try {
            int v0 = -107049639;
            arg5 += this.al * v0 * arg6;
            for(arg6 = 0; arg6 < arg8.length; ++arg6) {
                arg10 = arg8[arg6] + arg5;
                int v1 = -arg9[arg6];
                while(v1 < 0) {
                    this.ax[arg10] = arg7;
                    ++v1;
                    ++arg10;
                }

                arg5 += this.al * v0;
            }
        }
        catch(RuntimeException v5) {
            goto label_27;
        }

        return;
    label_27:
        StringBuilder v6 = new StringBuilder();
        v6.append("fa.fh(");
        v6.append(')');
        throw lx.al(((Throwable)v5), v6.toString());
    }

    public final void fi() {
        this.ap = 0;
        this.ar = 0;
        this.aj = this.al * 0xA73E7BD;
        this.an = this.ae * 769830535;
    }

    void fj(int arg4, int arg5, int arg6) {
        if(arg4 >= this.ap * 0xD3BD5EB7 && arg5 >= this.ar * 0xE3BBCB55 && arg4 < this.aj * 0xFC0E8B63) {
            if(arg5 >= this.an * 0xD21DC9D7) {
            }
            else {
                this.ax[this.al * -107049639 * arg5 + arg4] = arg6;
            }
        }
    }

    void fk(int[] arg1, int arg2, int arg3) {
        this.ax = arg1;
        this.al = arg2 * -1777803600;
        this.ae = arg3 * 0xC00BB8F9;
        this.ep(0xD9CC4AFD);
    }

    public void fl(es arg10, int arg11, int arg12, int arg13, int arg14, byte arg15) {
        try {
            this.bv(arg10, arg10.ap << 3, arg10.aj << 3, arg11 << 4, arg12 << 4, arg13, arg14, -38);
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("fa.fl(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    public final void fm(int arg3, int arg4, int arg5, int arg6) {
        if(this.ap * 0xEBEE2400 < arg3) {
            this.ap = arg3 * 0xC66B4131;
        }

        if(this.ar * 920927048 < arg4) {
            this.ar = arg4 * 0x513BEEF5;
        }

        if(this.aj * 0x56AC17CD > arg5) {
            this.aj = arg5 * 0x2C6AD05;
        }

        if(this.an * 0xD21DC9D7 > arg6) {
            this.an = arg6 * 860090103;
        }
    }

    public final void fn(int arg3, int arg4, int arg5, int arg6) {
        if(this.ap * 0xE4D30573 < arg3) {
            this.ap = arg3 * 1044359099;
        }

        if(this.ar * 2002832733 < arg4) {
            this.ar = arg4 * 0x513BEEF5;
        }

        if(this.aj * 0x56AC17CD > arg5) {
            this.aj = arg5 * 0x2C6AD05;
        }

        if(this.an * 0xD21DC9D7 > arg6) {
            this.an = arg6 * 0x2A8239E7;
        }
    }

    public final void fo() {
        this.ap = 0;
        this.ar = 0;
        this.aj = this.al * -1709270685;
        this.an = this.ae * 0x9C2D054C;
    }

    public final void fp(int[] arg3) {
        this.ap = arg3[0] * -855050540;
        this.ar = arg3[1] * 0x513BEEF5;
        this.aj = arg3[2] * 0x4D3F9636;
        this.an = arg3[3] * 0x1D57634F;
    }

    public final void fq(int[] arg4) {
        arg4[0] = this.ap * 0xE4D30573;
        arg4[1] = this.ar * 2002832733;
        arg4[2] = this.aj * 0x56AC17CD;
        arg4[3] = this.an * 0xD21DC9D7;
    }

    public final void fr(int[] arg3) {
        this.ap = arg3[0] * 1044359099;
        this.ar = arg3[1] * 0x513BEEF5;
        this.aj = arg3[2] * 0x2C6AD05;
        this.an = arg3[3] * 0x2A8239E7;
    }

    public void fs(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if(arg11 > 0) {
            if(arg12 <= 0) {
            }
            else {
                int v0 = 0;
                int v1 = 0x10000;
                int v2 = v1 / arg12;
                int v4 = 0xE4D30573;
                if(arg9 < this.ap * v4) {
                    arg11 -= this.ap * v4 - arg9;
                    arg9 = this.ap * v4;
                }

                v4 = 2002832733;
                if(arg10 < this.ar * v4) {
                    v0 = (this.ar * v4 - arg10) * v2;
                    arg12 -= this.ar * v4 - arg10;
                    arg10 = this.ar * v4;
                }

                int v5 = 0x56AC17CD;
                if(arg11 + arg9 > this.aj * v5) {
                    arg11 = this.aj * v5 - arg9;
                }

                v5 = 0xD21DC9D7;
                if(arg12 + arg10 > this.an * v5) {
                    arg12 = this.an * v5 - arg10;
                }

                int v3 = this.al * -107049639 - arg11;
                v5 = this.al * -107049639 * arg10 + arg9;
                for(arg9 = -arg12; arg9 < 0; ++arg9) {
                    arg10 = v1 - v0 >> 8;
                    arg12 = v0 >> 8;
                    arg10 = (0xFF0000 & (arg14 & 0xFF00) * arg12 + (0xFF00 & arg13) * arg10) + (arg10 * (arg13 & 0xFF00FF) + (0xFF00FF & arg14) * arg12 & 0xFF00FF00) >>> 8;
                    arg12 = -arg11;
                    while(arg12 < 0) {
                        this.ax[v5] = arg10;
                        ++arg12;
                        ++v5;
                    }

                    v5 += v3;
                    v0 += v2;
                }

                return;
            }
        }
    }

    public final void ft(int[] arg3) {
        this.ap = arg3[0] * 1044359099;
        this.ar = arg3[1] * 0x513BEEF5;
        this.aj = arg3[2] * 0x2C6AD05;
        this.an = arg3[3] * 0x2A8239E7;
    }

    public final void fu(int arg3, int arg4, int arg5, int arg6) {
        int v1 = -107049639;
        if(arg5 > this.al * v1) {
            arg5 = this.al * v1;
        }

        v1 = 129208929;
        if(arg6 > this.ae * v1) {
            arg6 = this.ae * v1;
        }

        this.ap = 0;
        this.ar = 0;
        this.aj = arg5 * 0x2C6AD05;
        this.an = arg6 * 0x2A8239E7;
    }

    void fv(int[] arg1, int arg2, int arg3) {
        this.ax = arg1;
        this.al = arg2 * 0x1F5532A0;
        this.ae = arg3 * 0x93907BF8;
        this.ep(0xD9CC4AFD);
    }

    public final void fw(int[] arg3) {
        this.ap = arg3[0] * 1044359099;
        this.ar = arg3[1] * 0x513BEEF5;
        this.aj = arg3[2] * 0x2C6AD05;
        this.an = arg3[3] * 0x2A8239E7;
    }

    public final void fx(int arg3, int arg4, int arg5, int arg6) {
        int v1 = -107049639;
        if(arg5 > this.al * v1) {
            arg5 = this.al * v1;
        }

        v1 = 129208929;
        if(arg6 > this.ae * v1) {
            arg6 = this.ae * v1;
        }

        this.ap = 0;
        this.ar = 0;
        this.aj = arg5 * 0x2C6AD05;
        this.an = arg6 * 0x2A8239E7;
    }

    public final void fy(int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int v6 = 0x2C3FA176;
        fa v0 = this;
        int v1 = arg8;
        int v2 = arg9;
        int v3 = arg10;
        int v4 = arg12;
        int v5 = arg13;
        try {
            v0.ad(v1, v2, v3, v4, v5, v6);
            this.ad(arg8, arg11 + arg9 - 1, arg10, arg12, arg13, 0x4977B2E1);
            if(arg11 >= 3) {
                ++arg9;
                arg11 += -2;
                this.ab(arg8, arg9, arg11, arg12, arg13, 0x7542FCB9);
                this.ab(arg10 + arg8 - 1, arg9, arg11, arg12, arg13, 0x7542FCB9);
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("fa.fy(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    public final void fz(int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        int v6 = 0x5ED1DD0D;
        fa v1 = this;
        int v2 = arg14;
        int v3 = arg15;
        int v4 = arg16;
        int v5 = arg18;
        try {
            v1.aj(v2, v3, v4, v5, v6);
            this.aj(arg14, arg15 + arg17 - 1, arg16, arg18, 0x2A1A6099);
            this.aq(arg14, arg15, arg17, arg18, 0x1795F574);
            this.aq(arg16 + arg14 - 1, arg15, arg17, arg18, 0x1795F574);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("fa.fz(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    public void ga(es arg11, int arg12, int arg13, int arg14, int arg15) {
        this.bv(arg11, arg11.ap << 3, arg11.aj << 3, arg12 << 4, arg13 << 4, arg14, arg15, -83);
    }

    public final void gc(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        this.ad(arg9, arg10, arg11, arg13, arg14, 2008407983);
        this.ad(arg9, arg12 + arg10 - 1, arg11, arg13, arg14, 89619100);
        if(arg12 >= 3) {
            ++arg10;
            arg12 += -2;
            this.ab(arg9, arg10, arg12, arg13, arg14, 0x7542FCB9);
            this.ab(arg11 + arg9 - 1, arg10, arg12, arg13, arg14, 0x7542FCB9);
        }
    }

    public final void gg(int arg13, int arg14, int arg15, int arg16, int arg17) {
        this.aj(arg13, arg14, arg15, arg17, 2011135302);
        this.aj(arg13, arg14 + arg16 - 1, arg15, arg17, 557068926);
        this.aq(arg13, arg14, arg16, arg17, 0x1795F574);
        this.aq(arg15 + arg13 - 1, arg14, arg16, arg17, 0x1795F574);
    }

    public void gj(es arg11, int arg12, int arg13, int arg14, int arg15) {
        this.bv(arg11, arg11.ap << 3, arg11.aj << 3, arg12 << 4, arg13 << 4, arg14, arg15, -91);
    }

    public final void gl(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        this.ad(arg9, arg10, arg11, arg13, arg14, 0x7F5473F2);
        this.ad(arg9, arg12 + arg10 - 1, arg11, arg13, arg14, 0x6008A923);
        if(arg12 >= 3) {
            ++arg10;
            arg12 += -2;
            this.ab(arg9, arg10, arg12, arg13, arg14, 0x7542FCB9);
            this.ab(arg11 + arg9 - 1, arg10, arg12, arg13, arg14, 0x7542FCB9);
        }
    }

    public final void gm(int arg13, int arg14, int arg15, int arg16, int arg17) {
        this.aj(arg13, arg14, arg15, arg17, -249818501);
        this.aj(arg13, arg14 + arg16 - 1, arg15, arg17, 1282631006);
        this.aq(arg13, arg14, arg16, arg17, 0x1795F574);
        this.aq(arg15 + arg13 - 1, arg14, arg16, arg17, 0x1795F574);
    }

    public void gn(es arg11, int arg12, int arg13, int arg14, int arg15) {
        this.bv(arg11, arg11.ap << 3, arg11.aj << 3, arg12 << 4, arg13 << 4, arg14, arg15, -33);
    }

    public void gs(es arg11, int arg12, int arg13, int arg14, int arg15) {
        this.bv(arg11, arg11.ap << 3, arg11.aj << 3, arg12 << 4, arg13 << 4, arg14, arg15, -9);
    }

    public final void gu(int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        arg5 += this.al * 0xD1EFA366 * arg6;
        for(arg6 = 0; arg6 < arg8.length; ++arg6) {
            int v0 = arg8[arg6] + arg5;
            int v1 = -arg9[arg6];
            while(v1 < 0) {
                this.ax[v0] = arg7;
                ++v1;
                ++v0;
            }

            arg5 += this.al * -107049639;
        }
    }

    public void gx(es arg11, int arg12, int arg13, int arg14, int arg15) {
        this.bv(arg11, arg11.ap << 3, arg11.aj << 3, arg12 << 4, arg13 << 4, arg14, arg15, -79);
    }
}

