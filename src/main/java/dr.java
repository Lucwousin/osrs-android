public class dr extends mv {
    static gk aa = null;
    public int ac;
    int ag;
    public String ah;
    static gk ai = null;
    public static final int aj = 0x1F;
    public int ak;
    public static final int al = 1;
    static final et am = null;
    short[] ao;
    static final int ap = 36;
    static final int ar = -1;
    public int as;
    short[] at;
    static gk av;
    short[] aw;
    public static final int ax;
    short[] ay;
    public int az;
    public int ba;
    int bb;
    int bc;
    public int bd;
    int[] be;
    public int bf;
    int bg;
    int bh;
    public int bi;
    int bj;
    int bk;
    int[] bl;
    int bm;
    public int bn;
    public String[] bo;
    public int bp;
    int bq;
    public int br;
    int bs;
    int bu;
    int bv;
    public boolean bw;
    int bx;
    public String[] by;
    int bz;
    int ca;
    public int cb;
    int cc;
    int cd;
    public int cf;
    public int ci;
    int cj;
    int cp;
    public int cr;
    public boolean cw;
    public int cx;
    oc cy;
    static lw cz;

    static {
        dr.ai = new gk(0x40, null);
        dr.av = new gk(50, null);
        dr.aa = new gk(200, null);
        dr.am = new et();
    }

    dr() {
        try {
            super();
            this.ah = gs.aq;
            this.as = 0x13D5F530;
            this.ak = 0;
            this.ac = 0;
            this.bd = 0;
            this.ba = 0;
            this.bf = 0;
            this.bn = 0;
            this.bp = 2067310371;
            this.bw = false;
            this.bo = new String[]{null, null, gs.al, null, null};
            this.by = new String[]{null, null, null, null, gs.ae};
            this.bv = 0xA4A3D522;
            this.bq = -1202606561;
            this.bx = 0x2CEE4C41;
            this.bg = 0;
            this.bz = 291095585;
            this.bh = 0xAA418481;
            this.bb = 0;
            this.bc = 0x676F6B91;
            this.bk = 0x6F603F63;
            this.bm = 0x1D07610D;
            this.bj = 874920421;
            this.bu = 1800766329;
            this.bs = 0x431E5F47;
            this.br = -828986043;
            this.bi = -605732521;
            this.ca = 0x6469F780;
            this.cj = 0x454DD580;
            this.cd = 0xD9E82E80;
            this.cf = 0;
            this.cx = 0;
            this.cb = 0;
            this.cw = false;
            this.cc = 0x57462F1F;
            this.cp = 0x851E0ABD;
            this.ci = 0xB701D8B7;
            this.cr = 0xFAD55115;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dr.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public final boolean aa(boolean arg7, short arg8) {
        try {
            int v8 = this.bq * 0xA2B9B221;
            int v1 = this.bx * 0x287C3C3F;
            int v0 = this.bc * -2055517553;
            if(arg7) {
                v8 = 0x91F9401F * this.bz;
                v1 = this.bh * -2016590721;
                v0 = this.bk * 350537141;
            }

            arg7 = true;
            int v2 = -1;
            if(v8 == v2) {
                return 1;
            }

            if(!br.aq.an(v8, 0, 0xEB4CFD34)) {
                arg7 = false;
            }

            if(v2 != v1 && !br.aq.an(v1, 0, 0x8F028F7D)) {
                arg7 = false;
            }

            if(v0 != v2) {
                if(br.aq.an(v0, 0, 0xF1E8B450)) {
                    return arg7;
                }

                return false;
            }

            return arg7;
        }
        catch(RuntimeException v7) {
            StringBuilder v8_1 = new StringBuilder();
            v8_1.append("dr.aa(");
            v8_1.append(')');
            throw lx.al(((Throwable)v7), v8_1.toString());
        }

        return false;
    }

    public final ca ab(int arg11, byte arg12) {
        int v3;
        int v2;
        int v12;
        try {
            int v0 = 0;
            if(this.be != null && arg11 > 1) {
                v12 = -1;
                v2 = 0;
                v3 = -1;
                while(v2 < 10) {
                    if(arg11 >= this.bl[v2] && this.bl[v2] != 0) {
                        v3 = this.be[v2];
                    }

                    ++v2;
                }

                if(v3 == v12) {
                    goto label_26;
                }

                return client.al(v3, 777066657).ab(1, 2);
            }

        label_26:
            v2 = 0x51108CFF;
            mv v11_1 = dr.av.ax(((long)(this.az * v2)));
            if(v11_1 != null) {
                return ((ca)v11_1);
            }

            by v4 = by.ax(br.aq, this.ag * -1654053537, 0);
            if(v4 == null) {
                return null;
            }

            v12 = 0xED54BB0F;
            v3 = -204307467;
            int v5 = 1104905987;
            int v6 = 0x80;
            if(this.ca * v12 != v6 || v6 != this.cj * v5 || v6 != this.cd * v3) {
                v4.am(this.ca * v12, this.cj * v5, this.cd * v3);
            }

            if(this.at != null) {
                for(arg11 = 0; arg11 < this.at.length; ++arg11) {
                    v4.av(this.at[arg11], this.ay[arg11]);
                }
            }

            if(this.aw != null) {
                while(v0 < this.aw.length) {
                    v4.aa(this.aw[v0], this.ao[v0]);
                    ++v0;
                }
            }

            ca v11_2 = v4.ay(this.cf * 0x9C3FB29D + 0x40, this.cx * -908876589 + 0x300, -50, -10, -50);
            v11_2.bf = true;
            dr.av.ae(((mv)v11_2), ((long)(this.az * v2)));
            return v11_2;
        }
        catch(RuntimeException v11) {
            StringBuilder v12_1 = new StringBuilder();
            v12_1.append("dr.ab(");
            v12_1.append(')');
            throw lx.al(((Throwable)v11), v12_1.toString());
        }
    }

    public static dr ac(int arg7) {
        long v1 = ((long)arg7);
        mv v0 = dr.ai.ax(v1);
        if(v0 != null) {
            return ((dr)v0);
        }

        byte[] v0_1 = lz.ad.ae(10, arg7, 0x78DC0DC9);
        dr v3 = new dr();
        v3.az = arg7 * 0xAC4672FF;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), -79);
        }

        v3.ae(25);
        int v0_2 = 0x286CC599;
        int v4 = -1;
        if(v4 != v3.bi * v0_2) {
            v3.ap(client.al(v3.bi * v0_2, 0x5EED609F), client.al(v3.br * -2039930253, 0x49789CF6), 998083113);
        }

        v0_2 = 0xFA513F6B;
        if(v3.cp * v0_2 != v4) {
            v3.aj(client.al(v3.cp * v0_2, 0x136AA02D), client.al(v3.cc * 0x63177321, 0x2AE86BF), 99);
        }

        v0_2 = 0xBC6389C3;
        if(v3.cr * v0_2 != v4) {
            v3.ad(client.al(v3.cr * v0_2, 0x1DAC2C69), client.al(v3.ci * 0xF27B7AF9, 0x35E901ED), 0x1E289FF7);
        }

        if(!ju.ab && (v3.bw)) {
            v3.ah = gs.ax;
            arg7 = 0;
            v3.cw = false;
            String[] v0_3 = null;
            v3.bo = v0_3;
            v3.by = v0_3;
            v3.bv = 0xD251EA91;
            v3.cb = 0;
            if(v3.cy != null) {
                mx v4_1;
                for(v4_1 = v3.cy.ar(); v4_1 != null; v4_1 = v3.cy.an()) {
                    if(dm.al(((int)v4_1.gx), 0xDFA8C4D7).ap) {
                        v4_1.lp();
                    }
                    else {
                        arg7 = 1;
                    }
                }

                if(arg7 != 0) {
                    goto label_100;
                }

                v3.cy = ((oc)v0_3);
            }
        }

    label_100:
        dr.ai.ae(((mv)v3), v1);
        return v3;
    }

    void ad(dr arg1, dr arg2, int arg3) {
        try {
            this.ag = arg1.ag;
            this.as = arg1.as;
            this.ak = arg1.ak;
            this.ac = arg1.ac;
            this.bd = arg1.bd;
            this.ba = arg1.ba;
            this.bf = arg1.bf;
            this.at = arg1.at;
            this.ay = arg1.ay;
            this.aw = arg1.aw;
            this.ao = arg1.ao;
            this.bn = arg1.bn;
            this.ah = arg2.ah;
            this.bp = 0;
            this.bw = false;
            this.cw = false;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dr.ad(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ae(byte arg1) {
    }

    public dr af(int arg4, int arg5) {
        try {
            if(this.be != null && arg4 > 1) {
                arg5 = 0;
                int v0 = -1;
                int v1 = -1;
                while(arg5 < 10) {
                    if(arg4 >= this.bl[arg5] && this.bl[arg5] != 0) {
                        v1 = this.be[arg5];
                    }

                    ++arg5;
                }

                if(v0 == v1) {
                    return this;
                }

                return client.al(v1, 1050335890);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("dr.af(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return this;
    }

    public int ag(int arg2, int arg3, int arg4) {
        try {
            return bq.al(this.cy, arg2, arg3, 2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dr.ag(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public String ah(int arg2, String arg3, int arg4) {
        try {
            return az.ae(this.cy, arg2, arg3, -107049639);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dr.ah(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void aj(dr arg4, dr arg5, byte arg6) {
        try {
            this.ag = arg4.ag;
            this.as = arg4.as;
            this.ak = arg4.ak;
            this.ac = arg4.ac;
            this.bd = arg4.bd;
            this.ba = arg4.ba;
            this.bf = arg4.bf;
            this.at = arg5.at;
            this.ay = arg5.ay;
            this.aw = arg5.aw;
            this.ao = arg5.ao;
            this.ah = arg5.ah;
            this.bw = arg5.bw;
            this.bn = arg5.bn;
            this.bq = arg5.bq;
            this.bx = arg5.bx;
            this.bc = arg5.bc;
            this.bz = arg5.bz;
            this.bh = arg5.bh;
            this.bk = arg5.bk;
            this.bm = arg5.bm;
            this.bj = arg5.bj;
            this.bu = arg5.bu;
            this.bs = arg5.bs;
            this.cb = arg5.cb;
            this.bo = arg5.bo;
            this.by = new String[5];
            int v6 = 4;
            if(arg5.by != null) {
                int v4_1;
                for(v4_1 = 0; v4_1 < v6; ++v4_1) {
                    this.by[v4_1] = arg5.by[v4_1];
                }
            }

            this.by[v6] = gs.ad;
            this.bp = 0;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("dr.aj(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public static void ak(ko arg0, ko arg1, boolean arg2, od arg3) {
        lz.ad = arg0;
        br.aq = arg1;
        ju.ab = arg2;
        ag.af = lz.ad.au(10, 1450081359) * 0x3DE805A7;
        ju.au = arg3;
    }

    public final boolean am(boolean arg6, int arg7) {
        arg7 = 297970235;
        try {
            int v0 = this.bm * arg7;
            arg7 = this.bj * -1500011501;
            if(arg6) {
                v0 = this.bu * 0x592D8937;
                arg7 = -1046977143 * this.bs;
            }

            arg6 = true;
            int v1 = -1;
            if(v1 == v0) {
                return 1;
            }

            if(!br.aq.an(v0, 0, -2100753699)) {
                arg6 = false;
            }

            if(v1 != arg7) {
                if(br.aq.an(arg7, 0, -1305549591)) {
                    return arg6;
                }

                return false;
            }

            return arg6;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("dr.am(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        return false;
    }

    void an(lq arg4, int arg5, int arg6) {
        char v6 = ')';
        if(1 == arg5) {
            arg5 = 0x9FE887D5;
            try {
                this.ag = arg4.ao(arg5) * 0x5688769F;
                return;
            label_11:
                if(arg5 == 2) {
                    this.ah = arg4.bn(-36);
                }
                else if(4 == arg5) {
                    this.as = arg4.ao(0x2AA03DAE) * 0x514A380F;
                }
                else if(arg5 == 5) {
                    this.ak = arg4.ao(0xB6190DE9) * 0xB995062B;
                }
                else if(arg5 == 6) {
                    this.ac = arg4.ao(0xCB80BCB0) * 0x1E6A5A7F;
                }
                else {
                    int v2 = 0x7FFF;
                    if(7 == arg5) {
                        this.ba = arg4.ao(0xC0238649) * 298990103;
                        if(this.ba * 0x51249DA7 > v2) {
                            this.ba -= 0x3A170000;
                        }
                    }
                    else if(8 == arg5) {
                        this.bf = arg4.ao(0x42B1E062) * 747069975;
                        if(this.bf * 0x9009F5A7 > v2) {
                            this.bf -= 0x62170000;
                        }
                    }
                    else if(arg5 == 11) {
                        this.bn = 0x5B1931A7;
                    }
                    else {
                        byte v2_1 = 30;
                        if(12 == arg5) {
                            this.bp = arg4.ac(v2_1) * 2067310371;
                        }
                        else if(16 == arg5) {
                            this.bw = true;
                        }
                        else if(arg5 == 23) {
                            this.bq = arg4.ao(0x1B51CDC1) * 1202606561;
                            this.bg = arg4.ay(-124) * 96055859;
                        }
                        else if(arg5 == 24) {
                            this.bx = arg4.ao(0xC87B458D) * 0xD311B3BF;
                        }
                        else if(arg5 == 25) {
                            this.bz = arg4.ao(0x73E1C5F1) * -291095585;
                            this.bb = arg4.ay(-121) * 0xA0D3AF35;
                        }
                        else if(26 == arg5) {
                            this.bh = arg4.ao(0xA0525F54) * 0x55BE7B7F;
                        }
                        else {
                            int v1 = 35;
                            if(arg5 >= v2_1 && arg5 < v1) {
                                arg5 -= v2_1;
                                this.bo[arg5] = arg4.bn(-24);
                                if(this.bo[arg5].equalsIgnoreCase(gs.ar)) {
                                    this.bo[arg5] = null;
                                }
                                else {
                                }

                                return;
                            }

                            v2 = 40;
                            if(arg5 >= v1 && arg5 < v2) {
                                this.by[arg5 - v1] = arg4.bn(-93);
                                return;
                            }

                            v1 = 0;
                            if(arg5 == v2) {
                                arg5 = arg4.ay(-44);
                                this.at = new short[arg5];
                                this.ay = new short[arg5];
                                while(true) {
                                    if(v1 >= arg5) {
                                        return;
                                    }

                                    this.at[v1] = ((short)arg4.ao(-1726380507));
                                    this.ay[v1] = ((short)arg4.ao(0xB98E5A1B));
                                    ++v1;
                                }
                            }

                            if(arg5 == v6) {
                                arg5 = arg4.ay(-125);
                                this.aw = new short[arg5];
                                this.ao = new short[arg5];
                                while(true) {
                                    if(v1 >= arg5) {
                                        return;
                                    }

                                    this.aw[v1] = ((short)arg4.ao(0xBA2C1838));
                                    this.ao[v1] = ((short)arg4.ao(0xDE0EFAC1));
                                    ++v1;
                                }
                            }

                            v2 = -1215098345;
                            if(arg5 == 42) {
                                this.bv = arg4.aw(v2) * 0x2DAE156F;
                                return;
                            }

                            if(arg5 == 65) {
                                this.cw = true;
                                return;
                            }

                            if(78 == arg5) {
                                this.bc = arg4.ao(0x79BCE38) * 0x9890946F;
                                return;
                            }

                            if(arg5 == 0x4F) {
                                this.bk = arg4.ao(0xC5F3002E) * 0x909FC09D;
                                return;
                            }

                            if(arg5 == 90) {
                                this.bm = arg4.ao(1675506635) * 0xE2F89EF3;
                                return;
                            }

                            if(arg5 == 91) {
                                this.bu = arg4.ao(0xED72BC0B) * -1800766329;
                                return;
                            }

                            if(arg5 == 92) {
                                this.bj = arg4.ao(-778474034) * -874920421;
                                return;
                            }

                            if(93 == arg5) {
                                this.bs = arg4.ao(1858901419) * 0xBCE1A0B9;
                                return;
                            }

                            if(0x5F == arg5) {
                                this.bd = arg4.ao(0xFC0DD7A3) * 0x44C57AD3;
                                return;
                            }

                            if(arg5 == 97) {
                                this.br = arg4.ao(0xB0C0C763) * 828986043;
                                return;
                            }

                            if(arg5 == 98) {
                                this.bi = arg4.ao(0xF495FF09) * 605732521;
                                return;
                            }

                            int v0 = 110;
                            v1 = 100;
                            if(arg5 >= v1 && arg5 < v0) {
                                if(this.be == null) {
                                    this.be = new int[10];
                                    this.bl = new int[10];
                                }

                                arg5 -= v1;
                                this.be[arg5] = arg4.ao(0x9F1A42AA);
                                this.bl[arg5] = arg4.ao(0x70ED696);
                                return;
                            }

                            if(v0 == arg5) {
                                this.ca = arg4.ao(-1560043607) * 0x4CC8D3EF;
                                return;
                            }

                            if(arg5 == 0x6F) {
                                this.cj = arg4.ao(-864237703) * 0x708A9BAB;
                                return;
                            }

                            if(arg5 == 0x70) {
                                this.cd = arg4.ao(0xC034F352) * 0x89B3D05D;
                                return;
                            }

                            if(0x71 == arg5) {
                                this.cf = arg4.aw(v2) * 20210613;
                                return;
                            }

                            if(0x72 == arg5) {
                                this.cx = arg4.aw(v2) * 0x764DA0C7;
                                return;
                            }

                            if(0x73 == arg5) {
                                this.cb = arg4.ay(-9) * 0xADB99BD1;
                                return;
                            }

                            if(arg5 == 0x8B) {
                                this.cc = arg4.ao(0xD8F6DC03) * 0xA8B9D0E1;
                                return;
                            }

                            if(arg5 == 140) {
                                this.cp = arg4.ao(0x8BE419DE) * 0x7AE1F543;
                                return;
                            }

                            if(arg5 == 0x94) {
                                this.ci = arg4.ao(0xEFC7D60B) * 0x48FE2749;
                                return;
                            }

                            if(0x95 == arg5) {
                                this.cr = arg4.ao(0x5DCA4DAC) * 0x52AAEEB;
                                return;
                            }

                            if(0xF9 != arg5) {
                                return;
                            }

                            this.cy = cn.ax(arg4, this.cy, -516439076);
                            return;
                        label_10:
                            goto label_389;
                        }
                    }
                }
            }
            catch(RuntimeException v4) {
                goto label_10;
            }
        }
        else {
            goto label_11;
        label_389:
            StringBuilder v5 = new StringBuilder();
            v5.append("dr.an(");
            v5.append(v6);
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void ap(dr arg1, dr arg2, int arg3) {
        try {
            this.ag = arg1.ag;
            this.as = arg1.as;
            this.ak = arg1.ak;
            this.ac = arg1.ac;
            this.bd = arg1.bd;
            this.ba = arg1.ba;
            this.bf = arg1.bf;
            this.at = arg1.at;
            this.ay = arg1.ay;
            this.aw = arg1.aw;
            this.ao = arg1.ao;
            this.ah = arg2.ah;
            this.bw = arg2.bw;
            this.bp = arg2.bp;
            this.bn = 0x5B1931A7;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dr.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public final by aq(int arg6, int arg7) {
        by v6_1;
        int v3;
        int v2;
        int v1;
        try {
            int v0 = 0;
            if(this.be != null && arg6 > 1) {
                v1 = -1;
                v2 = 0;
                v3 = -1;
                while(v2 < 10) {
                    if(arg6 >= this.bl[v2] && this.bl[v2] != 0) {
                        v3 = this.be[v2];
                    }

                    ++v2;
                }

                if(v1 == v3) {
                    goto label_26;
                }

                return client.al(v3, 2097032095).aq(1, 0xE5ACD678);
            }

        label_26:
            v6_1 = by.ax(br.aq, this.ag * -1654053537, 0);
            if(v6_1 == null) {
                return null;
            }

            v1 = 0xED54BB0F;
            v2 = -204307467;
            v3 = 1104905987;
            int v4 = 0x80;
            if(v4 != this.ca * v1 || this.cj * v3 != v4 || this.cd * v2 != v4) {
                v6_1.am(this.ca * v1, this.cj * v3, this.cd * v2);
            }

            if(this.at != null) {
                for(arg7 = 0; arg7 < this.at.length; ++arg7) {
                    v6_1.av(this.at[arg7], this.ay[arg7]);
                }
            }

            if(this.aw != null) {
                while(v0 < this.aw.length) {
                    v6_1.aa(this.aw[v0], this.ao[v0]);
                    ++v0;
                }
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("dr.aq(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        return v6_1;
    }

    void ar(lq arg2, byte arg3) {
        while(true) {
            arg3 = -16;
            try {
                int v3 = arg2.ay(arg3);
                if(v3 == 0) {
                    return;
                }

                this.an(arg2, v3, 0x43C98244);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dr.ar(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public int at(int arg4) {
        try {
            int v0 = -104797809;
            int v1 = -1;
            if(v1 != this.bv * v0) {
                if(this.by == null) {
                }
                else if(this.bv * v0 >= 0) {
                    if(this.by[this.bv * v0] != null) {
                        v1 = this.bv * v0;
                    }

                    return v1;
                }
                else {
                    if(!gs.ae.equalsIgnoreCase(this.by[4])) {
                        return v1;
                    }

                    return 4;
                }
            }

            return v1;
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dr.at(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }

        return 4;
    }

    public final by au(boolean arg8, int arg9) {
        by v0_1;
        arg9 = 0xA2B9B221;
        try {
            int v0 = this.bq * arg9;
            arg9 = this.bx * 0x287C3C3F;
            int v2 = this.bc * -2055517553;
            if(arg8) {
                v0 = 0x91F9401F * this.bz;
                arg9 = this.bh * -2016590721;
                v2 = 350537141 * this.bk;
            }

            int v1 = -1;
            if(v0 == v1) {
                return null;
            }

            int v4 = 0;
            v0_1 = by.ax(br.aq, v0, 0);
            if(arg9 != v1) {
                by v9 = by.ax(br.aq, arg9, 0);
                int v3 = 2;
                if(v2 != v1) {
                    by v1_1 = by.ax(br.aq, v2, 0);
                    by[] v6 = new by[3];
                    v6[0] = v0_1;
                    v6[1] = v9;
                    v6[v3] = v1_1;
                    v0_1 = new by(v6, 3);
                }
                else {
                    by[] v1_2 = new by[v3];
                    v1_2[0] = v0_1;
                    v1_2[1] = v9;
                    v0_1 = new by(v1_2, v3);
                }
            }

            if(!arg8) {
                v1 = 0x7A6098FB;
                if(this.bg * v1 != 0) {
                    v0_1.ai(0, this.bg * v1, 0);
                }
            }

            if(arg8) {
                arg9 = 1038248733;
                if(this.bb * arg9 != 0) {
                    v0_1.ai(0, this.bb * arg9, 0);
                }
            }

            if(this.at != null) {
                int v8_1;
                for(v8_1 = 0; v8_1 < this.at.length; ++v8_1) {
                    v0_1.av(this.at[v8_1], this.ay[v8_1]);
                }
            }

            if(this.aw != null) {
                while(v4 < this.aw.length) {
                    v0_1.aa(this.aw[v4], this.ao[v4]);
                    ++v4;
                }
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9_1 = new StringBuilder();
            v9_1.append("dr.au(");
            v9_1.append(')');
            throw lx.al(((Throwable)v8), v9_1.toString());
        }

        return v0_1;
    }

    public final by az(boolean arg4, byte arg5) {
        by v5_1;
        int v5 = 297970235;
        try {
            int v0 = this.bm * v5;
            int v1 = this.bj * -1500011501;
            if(arg4) {
                v0 = this.bu * 0x592D8937;
                v1 = this.bs * -1046977143;
            }

            int v4_1 = -1;
            if(v4_1 == v0) {
                return null;
            }

            int v2 = 0;
            v5_1 = by.ax(br.aq, v0, 0);
            if(v4_1 != v1) {
                v5_1 = new by(new by[]{v5_1, by.ax(br.aq, v1, 0)}, 2);
            }

            if(this.at != null) {
                for(v4_1 = 0; v4_1 < this.at.length; ++v4_1) {
                    v5_1.av(this.at[v4_1], this.ay[v4_1]);
                }
            }

            if(this.aw != null) {
                while(v2 < this.aw.length) {
                    v5_1.aa(this.aw[v2], this.ao[v2]);
                    ++v2;
                }
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("dr.az(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }

        return v5_1;
    }

    public static dr ba(int arg7) {
        long v1 = ((long)arg7);
        mv v0 = dr.ai.ax(v1);
        if(v0 != null) {
            return ((dr)v0);
        }

        byte[] v0_1 = lz.ad.ae(10, arg7, 0x78DC0DC9);
        dr v3 = new dr();
        v3.az = arg7 * 0xAC4672FF;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), -22);
        }

        v3.ae(25);
        int v0_2 = 0x286CC599;
        int v4 = -1;
        if(v4 != v3.bi * v0_2) {
            v3.ap(client.al(v3.bi * v0_2, 162715630), client.al(v3.br * 0x98CC398B, 1757980358), 0x52EF6E07);
        }

        if(v3.cp * 1820948135 != v4) {
            v3.aj(client.al(v3.cp * 0xFA513F6B, 0x37DEB7EE), client.al(v3.cc * 0x63177321, 0x54ABF43), 50);
        }

        if(v3.cr * 1217734004 != v4) {
            v3.ad(client.al(v3.cr * 0x939FA23C, 0x71DF1201), client.al(v3.ci * 0xF27B7AF9, 0x30DC7AB1), 0x1E289FF7);
        }

        if(!ju.ab && (v3.bw)) {
            v3.ah = gs.ax;
            arg7 = 0;
            v3.cw = false;
            String[] v0_3 = null;
            v3.bo = v0_3;
            v3.by = v0_3;
            v3.bv = 245209217;
            v3.cb = 0;
            if(v3.cy != null) {
                mx v4_1;
                for(v4_1 = v3.cy.ar(); v4_1 != null; v4_1 = v3.cy.an()) {
                    if(dm.al(((int)v4_1.gx), 0xCC82EB81).ap) {
                        v4_1.lp();
                    }
                    else {
                        arg7 = 1;
                    }
                }

                if(arg7 != 0) {
                    goto label_102;
                }

                v3.cy = ((oc)v0_3);
            }
        }

    label_102:
        dr.ai.ae(((mv)v3), v1);
        return v3;
    }

    public final ca bb(int arg11) {
        int v0;
        int v1 = 0;
        if(this.be != null && arg11 > 1) {
            v0 = -1;
            int v3 = 0;
            int v4 = -1;
            while(v3 < 10) {
                if(arg11 >= this.bl[v3] && this.bl[v3] != 0) {
                    v4 = this.be[v3];
                }

                ++v3;
            }

            if(v4 == v0) {
                goto label_26;
            }

            return client.al(v4, 2061428765).ab(1, 18);
        }

    label_26:
        mv v11 = dr.av.ax(((long)(this.az * -1703540207)));
        if(v11 != null) {
            return ((ca)v11);
        }

        by v4_1 = by.ax(br.aq, this.ag * -1654053537, 0);
        if(v4_1 == null) {
            return null;
        }

        v0 = 0xED54BB0F;
        if(this.ca * v0 != 0x49677E0B || 0x68CF6CFF != this.cj * 0xB2ABB6A5 || 0x80 != this.cd * 0xE626DB44) {
            v4_1.am(this.ca * v0, this.cj * 1104905987, this.cd * -204307467);
        }

        if(this.at != null) {
            for(arg11 = 0; arg11 < this.at.length; ++arg11) {
                v4_1.av(this.at[arg11], this.ay[arg11]);
            }
        }

        if(this.aw != null) {
            while(v1 < this.aw.length) {
                v4_1.aa(this.aw[v1], this.ao[v1]);
                ++v1;
            }
        }

        ca v11_1 = v4_1.ay(this.cf * 0x19AF1F5B + 0x40, this.cx * -908876589 + 0x300, 0xDD06A8B, 0x201DAAFB, -1006343109);
        v11_1.bf = true;
        dr.av.ae(((mv)v11_1), ((long)(this.az * 0x51108CFF)));
        return v11_1;
    }

    public final ca bc(int arg12) {
        int v4;
        int v3;
        int v0;
        int v1 = 0;
        if(this.be != null && arg12 > 1) {
            v0 = -1;
            v3 = 0;
            v4 = -1;
            while(v3 < 10) {
                if(arg12 >= this.bl[v3] && this.bl[v3] != 0) {
                    v4 = this.be[v3];
                }

                ++v3;
            }

            if(v4 == v0) {
                goto label_26;
            }

            return client.al(v4, 0x230902A8).ab(1, 97);
        }

    label_26:
        v3 = 0x51108CFF;
        mv v12 = dr.av.ax(((long)(this.az * v3)));
        if(v12 != null) {
            return ((ca)v12);
        }

        by v5 = by.ax(br.aq, this.ag * -1654053537, 0);
        if(v5 == null) {
            return null;
        }

        v0 = 0xED54BB0F;
        v4 = -204307467;
        int v6 = 1104905987;
        int v7 = 0x80;
        if(this.ca * v0 != v7 || v7 != this.cj * v6 || v7 != this.cd * v4) {
            v5.am(this.ca * v0, this.cj * v6, this.cd * v4);
        }

        if(this.at != null) {
            for(arg12 = 0; arg12 < this.at.length; ++arg12) {
                v5.av(this.at[arg12], this.ay[arg12]);
            }
        }

        if(this.aw != null) {
            while(v1 < this.aw.length) {
                v5.aa(this.aw[v1], this.ao[v1]);
                ++v1;
            }
        }

        ca v12_1 = v5.ay(this.cf * 0x9C3FB29D + 0x40, this.cx * -908876589 + 0x300, -50, -10, -50);
        v12_1.bf = true;
        dr.av.ae(((mv)v12_1), ((long)(this.az * v3)));
        return v12_1;
    }

    public static dr bd(int arg7) {
        long v1 = ((long)arg7);
        mv v0 = dr.ai.ax(v1);
        if(v0 != null) {
            return ((dr)v0);
        }

        byte[] v0_1 = lz.ad.ae(10, arg7, 0x78DC0DC9);
        dr v3 = new dr();
        v3.az = arg7 * 0xAC4672FF;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), 70);
        }

        v3.ae(25);
        arg7 = -1;
        if(arg7 != v3.bi * 0xD020CC32) {
            v3.ap(client.al(v3.bi * 1634055196, 0x1EC93FFF), client.al(v3.br * -672403950, 2037631115), 0xDF524D1E);
        }

        if(v3.cp * 0xCB7F1695 != arg7) {
            v3.aj(client.al(v3.cp * 0x222D997E, 0x4387033D), client.al(v3.cc * 0x63177321, 1475072696), 99);
        }

        int v4 = 0xBC6389C3;
        if(v3.cr * v4 != arg7) {
            v3.ad(client.al(v3.cr * v4, 0x1E3B3066), client.al(v3.ci * 0xF81DFDA5, 80660008), 0x1E289FF7);
        }

        if(!ju.ab && (v3.bw)) {
            v3.ah = gs.ax;
            arg7 = 0;
            v3.cw = false;
            String[] v0_2 = null;
            v3.bo = v0_2;
            v3.by = v0_2;
            v3.bv = 0xAB5C8659;
            v3.cb = 0;
            if(v3.cy != null) {
                mx v4_1;
                for(v4_1 = v3.cy.ar(); v4_1 != null; v4_1 = v3.cy.an()) {
                    if(dm.al(((int)v4_1.gx), 0x28AD6793).ap) {
                        v4_1.lp();
                    }
                    else {
                        arg7 = 1;
                    }
                }

                if(arg7 != 0) {
                    goto label_102;
                }

                v3.cy = ((oc)v0_2);
            }
        }

    label_102:
        dr.ai.ae(((mv)v3), v1);
        return v3;
    }

    public static final es be(int arg28, int arg29, int arg30, int arg31, int arg32, boolean arg33) {
        dr v12;
        ca v27;
        es v0_2;
        int v1;
        int v14;
        int v0 = arg28;
        int v7 = arg29;
        int v8 = arg30;
        int v9 = arg31;
        int v10 = 2;
        int v11 = -1;
        if(v7 == v11) {
            v14 = 0;
        }
        else {
            v1 = arg32;
            if(v10 == v1 && v7 != 1) {
                v14 = 1;
                goto label_16;
            }

            v14 = v1;
        }

    label_16:
        v10 = 16;
        int v16 = v14;
        long v13 = ((((long)v9)) << 0xA5A5B02F) + (((((long)v14)) << 0x3468966F) + (((((long)v7)) << v10) + (((long)v0)) + ((((long)v8)) << 0x4B8603CA)));
        if(!arg33) {
            mv v1_1 = dr.aa.ax(v13);
            if(v1_1 != null) {
                return ((es)v1_1);
            }
        }

        dr v0_1 = client.al(v0, 0x3604825A);
        if(v7 > 1 && v0_1.be != null) {
            v1 = 0;
            int v2 = -1;
            while(v1 < 10) {
                if(v7 >= v0_1.bl[v1] && v0_1.bl[v1] != 0) {
                    v2 = v0_1.be[v1];
                }

                ++v1;
            }

            if(v11 == v2) {
                goto label_61;
            }

            v0_1 = client.al(v2, 1698905908);
        }

    label_61:
        dr v6 = v0_1;
        ca v5 = v6.ab(1, 76);
        es v17 = null;
        if(v5 == null) {
            return v17;
        }

        if(v6.bi * 0x3785DFF6 != v11) {
            v0_2 = ew.ai(v6.br * 0x1F4D677, 10, 1, 0, 0, true, 2073309280);
            if(v0_2 == null) {
                return v17;
            }
            else {
                v27 = v5;
                v12 = v6;
            }
        }
        else if(v6.cp * 0xF27142A1 != v11) {
            v27 = v5;
            v12 = v6;
            v0_2 = ew.ai(v6.cc * 0x63177321, arg29, arg30, arg31, 0, false, 0x7898EFC7);
            if(v0_2 == null) {
                return v17;
            }
        }
        else {
            v27 = v5;
            v12 = v6;
            if(v11 != v12.cr * 0x56DA531A) {
                v0_2 = ew.ai(0xF27B7AF9 * v12.ci, arg29, 0, 0, 0, false, 2105731154);
                if(v0_2 == null) {
                    return v17;
                }
            }
            else {
                v0_2 = v17;
            }
        }

        es v1_2 = new es(1410571509, 0x20);
        dr.am.bq(v1_2.ax, 36, 0x20, -124);
        fa v2_1 = dr.am.ax(0xFBE824BA);
        bt v3 = dr.am.al(1303410430);
        bi v17_1 = dr.am.ae(0xAF6F93DC).al(0xFF723A6C);
        ((bj)v3).bq(0x3BF5F56D);
        ((bj)v3).bg(v10, v10, 0x3DEFF5E8);
        ((bj)v3).bt(false, -28);
        int v3_1 = -807658005;
        if(v11 != v12.cr * 0xBC6389C3) {
            ((ec)v2_1).am(v0_2, 0, 0, v3_1);
        }

        int v5_1 = v12.as * -1217022225;
        if(arg33) {
            v5_1 = ((int)((((double)v5_1)) * 1.5));
        }
        else if(2 == v8) {
            v5_1 = ((int)((((double)v5_1)) * 1.04));
        }

        int v4 = bt.ag[v12.ak * 0xB345A3C3] * v5_1 >> v10;
        v3_1 = bt.ah[v12.ak * 0xCEB8A93A] * v5_1 >> v10;
        v27.ap();
        v17_1.ax(v27, 0, v12.ac * 0xDDF7657F, v12.bd * -1182208677, v12.ak * 0x3B7FC586, v12.ba * 0xFDFD9341, v12.bf * 0x9009F5A7 + (v4 + v27.bh * 0xCD6CEDE3 / 2), v12.bf * 1488034428 + v3_1, 0x5271E7CD);
        if(v11 != v12.cp * 0xDDDEE51A) {
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }

        if(v8 >= 1) {
            v1_2.aj(1);
        }

        if(v8 >= 2) {
            v1_2.aj(0xFFFFFF);
        }

        if(v9 != 0) {
            v1_2.ad(v9);
        }

        dr.am.bq(v1_2.ax, 0xD6D09E01, 0x46BDD97F, -48);
        if(v12.bi * 0xC201FFEF != v11) {
            v10 = 0;
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }
        else {
            v10 = 0;
        }

        v0 = v16;
        if(v0 == 1 || v0 == 2 && v12.bn * 401368599 == 1) {
            ju.au.aq(jz.av(v7, -8), 0, 9, -1027464830, 1, v2_1);
        }

        while(v10 < v1_2.ax.length) {
            if(v1_2.ax[v10] != 0) {
                v1_2.ax[v10] |= 0x5C3A8023;
            }

            ++v10;
        }

        if(!arg33) {
            dr.aa.ae(((mv)v1_2), v13);
        }

        return v1_2;
    }

    void bf() {
    }

    void bg(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.bn = arg2.bn;
        this.ah = arg3.ah;
        this.bp = 0;
        this.bw = false;
        this.cw = false;
    }

    public final by bh(int arg7) {
        int v4;
        int v3;
        int v2;
        int v1 = 0;
        if(this.be != null && arg7 > 1) {
            v2 = -1;
            v3 = 0;
            v4 = -1;
            while(v3 < 10) {
                if(arg7 >= this.bl[v3] && this.bl[v3] != 0) {
                    v4 = this.be[v3];
                }

                ++v3;
            }

            if(v2 == v4) {
                goto label_26;
            }

            return client.al(v4, 0x21B74F29).aq(1, 0xEC81506B);
        }

    label_26:
        by v7 = by.ax(br.aq, this.ag * -1654053537, 0);
        if(v7 == null) {
            return null;
        }

        v2 = 0xED54BB0F;
        v3 = -204307467;
        v4 = 1104905987;
        int v5 = 0x80;
        if(v5 != this.ca * v2 || this.cj * v4 != v5 || this.cd * v3 != v5) {
            v7.am(this.ca * v2, this.cj * v4, this.cd * v3);
        }

        if(this.at != null) {
            int v0;
            for(v0 = 0; v0 < this.at.length; ++v0) {
                v7.av(this.at[v0], this.ay[v0]);
            }
        }

        if(this.aw != null) {
            while(v1 < this.aw.length) {
                v7.aa(this.aw[v1], this.ao[v1]);
                ++v1;
            }
        }

        return v7;
    }

    public final boolean bi(boolean arg7) {
        int v0 = this.bq * 0xA2B9B221;
        int v2 = this.bx * 0x287C3C3F;
        int v1 = this.bc * -2055517553;
        if(arg7) {
            v0 = 0x91F9401F * this.bz;
            v2 = this.bh * -2016590721;
            v1 = this.bk * 350537141;
        }

        int v7 = -1;
        if(v0 == v7) {
            return 1;
        }

        boolean v0_1 = br.aq.an(v0, 0, -902380989);
        if(v7 != v2 && !br.aq.an(v2, 0, 0x210F2F89)) {
            v0_1 = false;
        }

        if(v1 != v7 && !br.aq.an(v1, 0, 0x4F5F2BC)) {
            v0_1 = false;
        }

        return v0_1;
    }

    public dr bj(int arg5) {
        if(this.be != null && arg5 > 1) {
            int v0 = 0;
            int v1 = -1;
            int v2 = -1;
            while(v0 < 10) {
                if(arg5 >= this.bl[v0] && this.bl[v0] != 0) {
                    v2 = this.be[v0];
                }

                ++v0;
            }

            if(v1 == v2) {
                return this;
            }

            return client.al(v2, 1210144422);
        }

        return this;
    }

    public final ca bk(int arg12) {
        int v4;
        int v3;
        int v0;
        int v1 = 0;
        if(this.be != null && arg12 > 1) {
            v0 = -1;
            v3 = 0;
            v4 = -1;
            while(v3 < 10) {
                if(arg12 >= this.bl[v3] && this.bl[v3] != 0) {
                    v4 = this.be[v3];
                }

                ++v3;
            }

            if(v4 == v0) {
                goto label_26;
            }

            return client.al(v4, 0xF80B8E80).ab(1, 56);
        }

    label_26:
        v3 = 0x51108CFF;
        mv v12 = dr.av.ax(((long)(this.az * v3)));
        if(v12 != null) {
            return ((ca)v12);
        }

        by v5 = by.ax(br.aq, this.ag * -1654053537, 0);
        if(v5 == null) {
            return null;
        }

        v0 = 0xED54BB0F;
        v4 = -204307467;
        int v6 = 1104905987;
        int v7 = 0x80;
        if(this.ca * v0 != v7 || v7 != this.cj * v6 || v7 != this.cd * v4) {
            v5.am(this.ca * v0, this.cj * v6, this.cd * v4);
        }

        if(this.at != null) {
            for(arg12 = 0; arg12 < this.at.length; ++arg12) {
                v5.av(this.at[arg12], this.ay[arg12]);
            }
        }

        if(this.aw != null) {
            while(v1 < this.aw.length) {
                v5.aa(this.aw[v1], this.ao[v1]);
                ++v1;
            }
        }

        ca v12_1 = v5.ay(this.cf * 0x9C3FB29D + 0x40, this.cx * -908876589 + 0x300, -50, -10, -50);
        v12_1.bf = true;
        dr.av.ae(((mv)v12_1), ((long)(this.az * v3)));
        return v12_1;
    }

    public static final es bl(int arg30, int arg31, int arg32, int arg33, int arg34, boolean arg35) {
        dr v12;
        ca v29;
        es v0_2;
        int v1;
        int v14;
        int v0 = arg30;
        int v7 = arg31;
        int v8 = arg32;
        int v9 = arg33;
        int v10 = 2;
        int v11 = -1;
        if(v7 == v11) {
            v14 = 0;
        }
        else {
            v1 = arg34;
            if(v10 == v1 && v7 != 1) {
                v14 = 1;
                goto label_16;
            }

            v14 = v1;
        }

    label_16:
        v10 = 16;
        int v16 = v14;
        long v13 = ((((long)v9)) << 42) + (((((long)v14)) << 0xA4A49092) + (((((long)v7)) << v10) + (((long)v0)) + ((((long)v8)) << 0xFC1DFF36)));
        if(!arg35) {
            mv v1_1 = dr.aa.ax(v13);
            if(v1_1 != null) {
                return ((es)v1_1);
            }
        }

        dr v0_1 = client.al(v0, 1016456002);
        if(v7 > 1 && v0_1.be != null) {
            v1 = 0;
            int v2 = -1;
            while(v1 < 10) {
                if(v7 >= v0_1.bl[v1] && v0_1.bl[v1] != 0) {
                    v2 = v0_1.be[v1];
                }

                ++v1;
            }

            if(v11 == v2) {
                goto label_61;
            }

            v0_1 = client.al(v2, 0x6A0DF50A);
        }

    label_61:
        dr v6 = v0_1;
        ca v5 = v6.ab(1, 80);
        es v17 = null;
        if(v5 == null) {
            return v17;
        }

        int v27 = 0x286CC599;
        int v28 = 0xFA513F6B;
        if(v6.bi * v27 != v11) {
            v0_2 = ew.ai(v6.br * -2039930253, 10, 1, 0, 0, true, 0x7F5A564C);
            if(v0_2 == null) {
                return v17;
            }
            else {
                v29 = v5;
                v12 = v6;
            }
        }
        else if(v6.cp * v28 != v11) {
            v29 = v5;
            v12 = v6;
            v0_2 = ew.ai(v6.cc * 0x63177321, arg31, arg32, arg33, 0, false, 0x7FC70A21);
            if(v0_2 == null) {
                return v17;
            }
        }
        else {
            v29 = v5;
            v12 = v6;
            if(v11 != v12.cr * 0x91520377) {
                v0_2 = ew.ai(0xF27B7AF9 * v12.ci, arg31, 0, 0, 0, false, 0x7995E5F9);
                if(v0_2 == null) {
                    return v17;
                }
            }
            else {
                v0_2 = v17;
            }
        }

        es v1_2 = new es(36, 0x803EC0F2);
        dr.am.bq(v1_2.ax, 36, 0x20, -7);
        fa v2_1 = dr.am.ax(0x9C94F175);
        bt v3 = dr.am.al(-1737303686);
        bi v17_1 = dr.am.ae(0xAF6F93DC).al(0xA3F34828);
        ((bj)v3).bq(0x3BF5F56D);
        ((bj)v3).bg(v10, v10, 789901021);
        ((bj)v3).bt(false, 25);
        int v3_1 = -807658005;
        if(v11 != v12.cr * 0x6B20E23F) {
            ((ec)v2_1).am(v0_2, 0, 0, v3_1);
        }

        int v5_1 = v12.as * -1217022225;
        if(arg35) {
            v5_1 = ((int)((((double)v5_1)) * 1.5));
        }
        else if(2 == v8) {
            v5_1 = ((int)((((double)v5_1)) * 1.04));
        }

        int v4 = bt.ag[v12.ak * 0x8BE58883] * v5_1 >> v10;
        v3_1 = bt.ah[v12.ak * 850006017] * v5_1 >> v10;
        v29.ap();
        v17_1.ax(v29, 0, v12.ac * 0xDDF7657F, v12.bd * -1182208677, v12.ak * 0x8BE58883, v12.ba * 0x51249DA7, v12.bf * 0x80352C8D + (v4 + v29.bh * 0xCD6CEDE3 / 2), v12.bf * 0x9009F5A7 + v3_1, 0x574AB674);
        if(v11 != v12.cp * v28) {
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }

        if(v8 >= 1) {
            v1_2.aj(1);
        }

        if(v8 >= 2) {
            v1_2.aj(0xFFFFFF);
        }

        if(v9 != 0) {
            v1_2.ad(v9);
        }

        dr.am.bq(v1_2.ax, 0x5887181B, 0x20, -16);
        if(v12.bi * v27 != v11) {
            v5_1 = 0;
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }
        else {
            v5_1 = 0;
        }

        v0 = v16;
        if(v0 == 1 || v0 == 2 && v12.bn * 401368599 == 1) {
            ju.au.aq(jz.av(v7, -56), 0, 9, 0xDC820276, 1, v2_1);
        }

        while(v5_1 < v1_2.ax.length) {
            if(v1_2.ax[v5_1] != 0) {
                v1_2.ax[v5_1] |= 0x1C2F6368;
            }

            ++v5_1;
        }

        if(!arg35) {
            dr.aa.ae(((mv)v1_2), v13);
        }

        return v1_2;
    }

    public dr bm(int arg5) {
        if(this.be != null && arg5 > 1) {
            int v0 = 0;
            int v1 = -1;
            int v2 = -1;
            while(v0 < 10) {
                if(arg5 >= this.bl[v0] && this.bl[v0] != 0) {
                    v2 = this.be[v0];
                }

                ++v0;
            }

            if(v1 == v2) {
                return this;
            }

            return client.al(v2, 0x42A73CB0);
        }

        return this;
    }

    void bn(lq arg4, int arg5) {
        if(1 == arg5) {
            this.ag = arg4.ao(-1180301853) * 0x5688769F;
        }
        else if(arg5 == 2) {
            this.ah = arg4.bn(43);
        }
        else if(4 == arg5) {
            this.as = arg4.ao(0x340D12B5) * 0x1705484;
        }
        else if(arg5 == 5) {
            this.ak = arg4.ao(-807683608) * 0x142703FE;
        }
        else if(arg5 == 6) {
            this.ac = arg4.ao(0xF25B8A87) * 0xE8FA438B;
        }
        else {
            int v2 = 0x7FFF;
            if(7 == arg5) {
                this.ba = arg4.ao(1724086987) * 298990103;
                if(this.ba * 0x33DD0ADF > v2) {
                    this.ba -= 0x3A170000;
                }
            }
            else if(8 == arg5) {
                this.bf = arg4.ao(0xDADA0D75) * 1095152905;
                if(this.bf * 0x9009F5A7 > v2) {
                    this.bf -= 0x5B01719;
                }
            }
            else if(arg5 == 11) {
                this.bn = 0xF91F7509;
            }
            else if(12 == arg5) {
                this.bp = arg4.ac(0x7C) * 2067310371;
            }
            else if(16 == arg5) {
                this.bw = true;
            }
            else if(arg5 == 23) {
                this.bq = arg4.ao(0x1625CA65) * 1202606561;
                this.bg = arg4.ay(-120) * 96055859;
            }
            else if(arg5 == 24) {
                this.bx = arg4.ao(380859869) * 0x745B072D;
            }
            else if(arg5 == 25) {
                this.bz = arg4.ao(0xB53611F8) * 750704492;
                this.bb = arg4.ay(-77) * 0xA0D3AF35;
            }
            else if(26 == arg5) {
                this.bh = arg4.ao(0xA0BE70F3) * 0x92268E4A;
            }
            else {
                int v1 = 30;
                if(arg5 >= v1 && arg5 < 35) {
                    arg5 -= v1;
                    this.bo[arg5] = arg4.bn(-49);
                    if(this.bo[arg5].equalsIgnoreCase(gs.ar)) {
                        this.bo[arg5] = null;
                    }
                    else {
                    }

                    return;
                }

                if(arg5 >= -1249489900 && arg5 < 40) {
                    this.by[arg5 + 0xDA3BB58] = arg4.bn(38);
                    return;
                }

                v2 = 0;
                if(arg5 == 0x64FD410B) {
                    arg5 = arg4.ay(-4);
                    this.at = new short[arg5];
                    this.ay = new short[arg5];
                    while(true) {
                        if(v2 >= arg5) {
                            return;
                        }

                        this.at[v2] = ((short)arg4.ao(0x2B90E707));
                        this.ay[v2] = ((short)arg4.ao(0x200164CF));
                        ++v2;
                    }
                }

                if(arg5 == 0x958F4582) {
                    arg5 = arg4.ay(-67);
                    this.aw = new short[arg5];
                    this.ao = new short[arg5];
                    while(true) {
                        if(v2 >= arg5) {
                            return;
                        }

                        this.aw[v2] = ((short)arg4.ao(0x4D2CEC70));
                        this.ao[v2] = ((short)arg4.ao(-1990504103));
                        ++v2;
                    }
                }

                v2 = -1215098345;
                if(arg5 == 0xF13C0B80) {
                    this.bv = arg4.aw(v2) * 0xC6488DC6;
                    return;
                }

                if(arg5 == 0xFB2AA141) {
                    this.cw = true;
                    return;
                }

                if(834959150 == arg5) {
                    this.bc = arg4.ao(0xB084F9D1) * 0x9890946F;
                    return;
                }

                if(arg5 == 0x4F) {
                    this.bk = arg4.ao(800953752) * 0x909FC09D;
                    return;
                }

                if(arg5 == 0xDE2B7CB7) {
                    this.bm = arg4.ao(1919775350) * -402405911;
                    return;
                }

                if(arg5 == 91) {
                    this.bu = arg4.ao(0xB0CD7ACB) * 0x3021AFD;
                    return;
                }

                if(arg5 == 0xA2FCFE2C) {
                    this.bj = arg4.ao(0x29E91A0D) * -874920421;
                    return;
                }

                if(0xB0948825 == arg5) {
                    this.bs = arg4.ao(0x320E1874) * 0xBCE1A0B9;
                    return;
                }

                if(0x5F == arg5) {
                    this.bd = arg4.ao(0xE71DA888) * 0xE762C41D;
                    return;
                }

                if(arg5 == 1763782085) {
                    this.br = arg4.ao(0x4434DD97) * 828986043;
                    return;
                }

                if(arg5 == 98) {
                    this.bi = arg4.ao(0xA53F3939) * 605732521;
                    return;
                }

                if(arg5 >= 100 && arg5 < 110) {
                    if(this.be == null) {
                        this.be = new int[10];
                        this.bl = new int[10];
                    }

                    this.be[arg5 - 100] = arg4.ao(-624870328);
                    this.bl[arg5 - 492070540] = arg4.ao(140186042);
                    return;
                }

                if(-482470553 == arg5) {
                    this.ca = arg4.ao(0x6F57673E) * 0x4CC8D3EF;
                    return;
                }

                if(arg5 == 0x6F) {
                    this.cj = arg4.ao(0x7DDCA289) * 0x708A9BAB;
                    return;
                }

                if(arg5 == 0x70) {
                    this.cd = arg4.ao(0xA20E5720) * 0x902F9F2C;
                    return;
                }

                if(-1602143909 == arg5) {
                    this.cf = arg4.aw(v2) * 0x2C9CE108;
                    return;
                }

                if(0x72 == arg5) {
                    this.cx = arg4.aw(v2) * 0xD334BF93;
                    return;
                }

                if(0xDA6856 == arg5) {
                    this.cb = arg4.ay(-109) * 0xADB99BD1;
                    return;
                }

                if(arg5 == 0xDB194F81) {
                    this.cc = arg4.ao(-1799455690) * 0xA8B9D0E1;
                    return;
                }

                if(arg5 == 140) {
                    this.cp = arg4.ao(0xDE36FA84) * 2108935381;
                    return;
                }

                if(arg5 == 0x94) {
                    this.ci = arg4.ao(0x27CD34E4) * 0x24759916;
                    return;
                }

                if(0xCBE54B44 == arg5) {
                    this.cr = arg4.ao(0xF93AC1DE) * 0xD518EA0A;
                    return;
                }

                if(0xF9 != arg5) {
                    return;
                }

                this.cy = cn.ax(arg4, this.cy, 1217010502);
            }
        }
    }

    void bo(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.ah = arg3.ah;
        this.bw = arg3.bw;
        this.bp = arg3.bp;
        this.bn = 0x5B1931A7;
    }

    void bp(lq arg5, int arg6) {
        if(1 == arg6) {
            this.ag = arg5.ao(1858935401) * 0x5688769F;
        }
        else if(arg6 == 2) {
            this.ah = arg5.bn(-63);
        }
        else if(4 == arg6) {
            this.as = arg5.ao(0xB02F4FBD) * 0x514A380F;
        }
        else if(arg6 == 5) {
            this.ak = arg5.ao(0x386E5A05) * 0xB995062B;
        }
        else if(arg6 == 6) {
            this.ac = arg5.ao(0x6735FD69) * 0x1E6A5A7F;
        }
        else {
            int v2 = 0x7FFF;
            if(7 == arg6) {
                this.ba = arg5.ao(0x47840F4F) * 298990103;
                if(this.ba * 0x51249DA7 > v2) {
                    this.ba -= 0x3A170000;
                }
            }
            else if(8 == arg6) {
                this.bf = arg5.ao(0xBA705779) * 747069975;
                if(this.bf * 0x9009F5A7 > v2) {
                    this.bf -= 0x62170000;
                }
            }
            else if(arg6 == 11) {
                this.bn = 0x5B1931A7;
            }
            else {
                byte v2_1 = 0x73;
                if(12 == arg6) {
                    this.bp = arg5.ac(v2_1) * 2067310371;
                }
                else if(16 == arg6) {
                    this.bw = true;
                }
                else if(arg6 == 23) {
                    this.bq = arg5.ao(-1049030309) * 1202606561;
                    this.bg = arg5.ay(-102) * 96055859;
                }
                else if(arg6 == 24) {
                    this.bx = arg5.ao(28908628) * 0xD311B3BF;
                }
                else if(arg6 == 25) {
                    this.bz = arg5.ao(-358722280) * -291095585;
                    this.bb = arg5.ay(-61) * 0xA0D3AF35;
                }
                else if(26 == arg6) {
                    this.bh = arg5.ao(0xB5980C16) * 0x55BE7B7F;
                }
                else {
                    int v1 = 30;
                    int v3 = 35;
                    if(arg6 >= v1 && arg6 < v3) {
                        arg6 -= v1;
                        this.bo[arg6] = arg5.bn(-3);
                        if(this.bo[arg6].equalsIgnoreCase(gs.ar)) {
                            this.bo[arg6] = null;
                        }
                        else {
                        }

                        return;
                    }

                    v1 = 40;
                    if(arg6 >= v3 && arg6 < v1) {
                        this.by[arg6 - v3] = arg5.bn(52);
                        return;
                    }

                    v3 = 0;
                    if(arg6 == v1) {
                        arg6 = arg5.ay(-39);
                        this.at = new short[arg6];
                        this.ay = new short[arg6];
                        while(true) {
                            if(v3 >= arg6) {
                                return;
                            }

                            this.at[v3] = ((short)arg5.ao(2054563716));
                            this.ay[v3] = ((short)arg5.ao(0xC49EDA0B));
                            ++v3;
                        }
                    }

                    if(arg6 == 41) {
                        arg6 = arg5.ay(-15);
                        this.aw = new short[arg6];
                        this.ao = new short[arg6];
                        while(true) {
                            if(v3 >= arg6) {
                                return;
                            }

                            this.aw[v3] = ((short)arg5.ao(0x9FA256DF));
                            this.ao[v3] = ((short)arg5.ao(-1906992439));
                            ++v3;
                        }
                    }

                    v3 = -1215098345;
                    if(arg6 == 42) {
                        this.bv = arg5.aw(v3) * 0x2DAE156F;
                        return;
                    }

                    if(arg6 == 65) {
                        this.cw = true;
                        return;
                    }

                    if(78 == arg6) {
                        this.bc = arg5.ao(0xFF8B69E) * 0x9890946F;
                        return;
                    }

                    if(arg6 == 0x4F) {
                        this.bk = arg5.ao(-1530847042) * 0x909FC09D;
                        return;
                    }

                    if(arg6 == 90) {
                        this.bm = arg5.ao(0xF9B9FF6D) * 0xE2F89EF3;
                        return;
                    }

                    if(arg6 == 91) {
                        this.bu = arg5.ao(0x632D477F) * -1800766329;
                        return;
                    }

                    if(arg6 == 92) {
                        this.bj = arg5.ao(1907788570) * -874920421;
                        return;
                    }

                    if(93 == arg6) {
                        this.bs = arg5.ao(0xC8033E1B) * 0xBCE1A0B9;
                        return;
                    }

                    if(0x5F == arg6) {
                        this.bd = arg5.ao(0x1C0B31E1) * 0x44C57AD3;
                        return;
                    }

                    if(arg6 == 97) {
                        this.br = arg5.ao(-516053815) * 828986043;
                        return;
                    }

                    if(arg6 == 98) {
                        this.bi = arg5.ao(0xEA9AAC04) * 605732521;
                        return;
                    }

                    int v0 = 110;
                    v1 = 100;
                    if(arg6 >= v1 && arg6 < v0) {
                        if(this.be == null) {
                            this.be = new int[10];
                            this.bl = new int[10];
                        }

                        arg6 -= v1;
                        this.be[arg6] = arg5.ao(1055231530);
                        this.bl[arg6] = arg5.ao(0x89F8A889);
                        return;
                    }

                    if(v0 == arg6) {
                        this.ca = arg5.ao(-2092603198) * 0x4CC8D3EF;
                        return;
                    }

                    if(arg6 == 0x6F) {
                        this.cj = arg5.ao(0x541E7A3E) * 0x708A9BAB;
                        return;
                    }

                    if(arg6 == 0x70) {
                        this.cd = arg5.ao(0xC2570CE9) * 0x89B3D05D;
                        return;
                    }

                    if(0x71 == arg6) {
                        this.cf = arg5.aw(v3) * 20210613;
                        return;
                    }

                    if(0x72 == arg6) {
                        this.cx = arg5.aw(v3) * 0x764DA0C7;
                        return;
                    }

                    if(v2_1 == arg6) {
                        this.cb = arg5.ay(-115) * 0xADB99BD1;
                        return;
                    }

                    if(arg6 == 0x8B) {
                        this.cc = arg5.ao(0x49E622DC) * 0xA8B9D0E1;
                        return;
                    }

                    if(arg6 == 140) {
                        this.cp = arg5.ao(0xDF27528) * 0x7AE1F543;
                        return;
                    }

                    if(arg6 == 0x94) {
                        this.ci = arg5.ao(0xBB0A36AC) * 0x48FE2749;
                        return;
                    }

                    if(0x95 == arg6) {
                        this.cr = arg5.ao(0x668C04C7) * 0x52AAEEB;
                        return;
                    }

                    if(0xF9 != arg6) {
                        return;
                    }

                    this.cy = cn.ax(arg5, this.cy, 0x77F9140D);
                }
            }
        }
    }

    void bq(dr arg5, dr arg6) {
        this.ag = arg5.ag;
        this.as = arg5.as;
        this.ak = arg5.ak;
        this.ac = arg5.ac;
        this.bd = arg5.bd;
        this.ba = arg5.ba;
        this.bf = arg5.bf;
        this.at = arg6.at;
        this.ay = arg6.ay;
        this.aw = arg6.aw;
        this.ao = arg6.ao;
        this.ah = arg6.ah;
        this.bw = arg6.bw;
        this.bn = arg6.bn;
        this.bq = arg6.bq;
        this.bx = arg6.bx;
        this.bc = arg6.bc;
        this.bz = arg6.bz;
        this.bh = arg6.bh;
        this.bk = arg6.bk;
        this.bm = arg6.bm;
        this.bj = arg6.bj;
        this.bu = arg6.bu;
        this.bs = arg6.bs;
        this.cb = arg6.cb;
        this.bo = arg6.bo;
        this.by = new String[5];
        int v1 = 4;
        if(arg6.by != null) {
            int v5;
            for(v5 = 0; v5 < v1; ++v5) {
                this.by[v5] = arg6.by[v5];
            }
        }

        this.by[v1] = gs.ad;
        this.bp = 0;
    }

    static final String br(int arg2) {
        String v2;
        StringBuilder v0;
        if(arg2 < 100000) {
            v0 = new StringBuilder();
            v0.append("<col=ffff00>");
            v0.append(arg2);
        }
        else {
            if(arg2 < -1053658339) {
                v0 = new StringBuilder();
                v0.append("<col=ffffff>");
                v0.append(arg2 / 0x4D5FB26F);
                v2 = gs.gf;
            }
            else {
                v0 = new StringBuilder();
                v0.append("<col=00ff80>");
                v0.append(arg2 / 0xE95F3A8F);
                v2 = gs.gq;
            }

            v0.append(v2);
        }

        v0.append("</col>");
        return v0.toString();
    }

    public static final es bs(int arg31, int arg32, int arg33, int arg34, int arg35, boolean arg36) {
        byte v3_1;
        fa v30;
        dr v12;
        ca v29;
        es v0_2;
        int v2;
        int v1;
        int v14;
        int v0 = arg31;
        int v7 = arg32;
        int v8 = arg33;
        int v9 = arg34;
        int v10 = 2;
        int v11 = -1;
        if(v7 == v11) {
            v14 = 0;
        }
        else {
            v1 = arg35;
            if(v10 == v1 && v7 != 1) {
                v14 = 1;
                goto label_16;
            }

            v14 = v1;
        }

    label_16:
        v10 = 16;
        int v16 = v14;
        long v13 = ((((long)v9)) << 42) + (((((long)v14)) << 40) + (((((long)v7)) << v10) + (((long)v0)) + ((((long)v8)) << 38)));
        if(!arg36) {
            mv v1_1 = dr.aa.ax(v13);
            if(v1_1 != null) {
                return ((es)v1_1);
            }
        }

        dr v0_1 = client.al(v0, 0x737CBF19);
        if(v7 > 1 && v0_1.be != null) {
            v1 = 0;
            v2 = -1;
            while(v1 < 10) {
                if(v7 >= v0_1.bl[v1] && v0_1.bl[v1] != 0) {
                    v2 = v0_1.be[v1];
                }

                ++v1;
            }

            if(v11 == v2) {
                goto label_61;
            }

            v0_1 = client.al(v2, 0x7D6B4EB);
        }

    label_61:
        dr v6 = v0_1;
        ca v5 = v6.ab(1, 109);
        es v17 = null;
        if(v5 == null) {
            return v17;
        }

        int v27 = 0x286CC599;
        int v18 = 0xBC6389C3;
        int v28 = 0xFA513F6B;
        if(v6.bi * v27 != v11) {
            v0_2 = ew.ai(v6.br * -2039930253, 10, 1, 0, 0, true, 0x7964EFF7);
            if(v0_2 == null) {
                return v17;
            }
            else {
                v29 = v5;
                v12 = v6;
            }
        }
        else if(v6.cp * v28 != v11) {
            v29 = v5;
            v12 = v6;
            v0_2 = ew.ai(v6.cc * 0x63177321, arg32, arg33, arg34, 0, false, 2090737369);
            if(v0_2 == null) {
                return v17;
            }
        }
        else {
            v29 = v5;
            v12 = v6;
            if(v11 != v12.cr * v18) {
                v0_2 = ew.ai(0xF27B7AF9 * v12.ci, arg32, 0, 0, 0, false, 2042220096);
                if(v0_2 == null) {
                    return v17;
                }
            }
            else {
                v0_2 = v17;
            }
        }

        es v1_2 = new es(36, 0x20);
        dr.am.bq(v1_2.ax, 36, 0x20, -27);
        fa v4 = dr.am.ax(0x40A39028);
        bt v5_1 = dr.am.al(1902909539);
        bi v17_1 = dr.am.ae(0xAF6F93DC).al(0xE4E705DE);
        ((bj)v5_1).bq(0x3BF5F56D);
        ((bj)v5_1).bg(v10, v10, 0xA7978F4A);
        ((bj)v5_1).bt(false, -57);
        int v5_2 = -807658005;
        if(v11 != v12.cr * v18) {
            ((ec)v4).am(v0_2, 0, 0, v5_2);
        }

        int v6_1 = v12.as * -1217022225;
        if(arg36) {
            v30 = v4;
            v6_1 = ((int)((((double)v6_1)) * 1.5));
        }
        else {
            v30 = v4;
            if(2 == v8) {
                v6_1 = ((int)((((double)v6_1)) * 1.04));
            }
        }

        v2 = bt.ag[v12.ak * 0x8BE58883] * v6_1 >> v10;
        int v3 = bt.ah[v12.ak * 0x8BE58883] * v6_1 >> v10;
        v29.ap();
        v17_1.ax(v29, 0, v12.ac * 0xDDF7657F, v12.bd * -1182208677, v12.ak * 0x8BE58883, v12.ba * 0x51249DA7, v12.bf * 0x9009F5A7 + (v2 + v29.bh * 0xCD6CEDE3 / 2), v12.bf * 0x9009F5A7 + v3, 1810018215);
        if(v11 != v12.cp * v28) {
            v4 = v30;
            ((ec)v4).am(v0_2, 0, 0, -807658005);
        }
        else {
            v4 = v30;
        }

        if(v8 >= 1) {
            v1_2.aj(1);
        }

        if(v8 >= 2) {
            v1_2.aj(0xFFFFFF);
        }

        if(v9 != 0) {
            v1_2.ad(v9);
        }

        dr.am.bq(v1_2.ax, 36, 0x20, -21);
        if(v12.bi * v27 != v11) {
            v6_1 = 0;
            ((ec)v4).am(v0_2, 0, 0, -807658005);
        }
        else {
            v6_1 = 0;
        }

        v0 = v16;
        if(v0 != 1) {
            v3_1 = 2;
            if(v0 == v3_1 && v12.bn * 401368599 == 1) {
                goto label_259;
            }
        }
        else {
            v3_1 = 2;
        label_259:
            ju.au.aq(jz.av(v7, v3_1), 0, 9, 0xFFFF00, 1, v4);
        }

        while(v6_1 < v1_2.ax.length) {
            if(v1_2.ax[v6_1] != 0) {
                v1_2.ax[v6_1] |= 0xFF000000;
            }

            ++v6_1;
        }

        if(!arg36) {
            dr.aa.ae(((mv)v1_2), v13);
        }

        return v1_2;
    }

    void bt(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.ah = arg3.ah;
        this.bw = arg3.bw;
        this.bp = arg3.bp;
        this.bn = 0x5B1931A7;
    }

    public static final es bu(int arg28, int arg29, int arg30, int arg31, int arg32, boolean arg33) {
        dr v12;
        ca v27;
        es v0_2;
        int v1;
        int v14;
        int v0 = arg28;
        int v7 = arg29;
        int v8 = arg30;
        int v9 = arg31;
        int v10 = 2;
        int v11 = -1;
        if(v7 == v11) {
            v14 = 0;
        }
        else {
            v1 = arg32;
            if(v10 == v1 && v7 != 1) {
                v14 = 1;
                goto label_16;
            }

            v14 = v1;
        }

    label_16:
        v10 = 16;
        int v16 = v14;
        long v13 = ((((long)v9)) << 0xAB3326C1) + (((((long)v14)) << 40) + (((((long)v7)) << v10) + (((long)v0)) + ((((long)v8)) << 0x21C9A65D)));
        if(!arg33) {
            mv v1_1 = dr.aa.ax(v13);
            if(v1_1 != null) {
                return ((es)v1_1);
            }
        }

        dr v0_1 = client.al(v0, -161991890);
        if(v7 > 1 && v0_1.be != null) {
            v1 = 0;
            int v2 = -1;
            while(v1 < 10) {
                if(v7 >= v0_1.bl[v1] && v0_1.bl[v1] != 0) {
                    v2 = v0_1.be[v1];
                }

                ++v1;
            }

            if(v11 == v2) {
                goto label_61;
            }

            v0_1 = client.al(v2, 0x70B23B26);
        }

    label_61:
        dr v6 = v0_1;
        ca v5 = v6.ab(1, 55);
        es v17 = null;
        if(v5 == null) {
            return v17;
        }

        if(v6.bi * -1324082087 != v11) {
            v0_2 = ew.ai(v6.br * 0xE40B3796, 10, 1, 0, 0, true, 0x7D575FD8);
            if(v0_2 == null) {
                return v17;
            }
            else {
                v27 = v5;
                v12 = v6;
            }
        }
        else if(v6.cp * 0xE30AE8EB != v11) {
            v27 = v5;
            v12 = v6;
            v0_2 = ew.ai(v6.cc * 0x63177321, arg29, arg30, arg31, 0, false, 0x7F12E19A);
            if(v0_2 == null) {
                return v17;
            }
        }
        else {
            v27 = v5;
            v12 = v6;
            if(v11 != v12.cr * 0x91FFF882) {
                v0_2 = ew.ai(0xF27B7AF9 * v12.ci, arg29, 0, 0, 0, false, 2028485318);
                if(v0_2 == null) {
                    return v17;
                }
            }
            else {
                v0_2 = v17;
            }
        }

        es v1_2 = new es(1858679470, 0x20364A50);
        dr.am.bq(v1_2.ax, 36, 948262090, -24);
        fa v2_1 = dr.am.ax(0x111F263F);
        bt v3 = dr.am.al(490923383);
        bi v17_1 = dr.am.ae(0xAF6F93DC).al(-2018891022);
        ((bj)v3).bq(0x3BF5F56D);
        ((bj)v3).bg(v10, v10, -1061461066);
        ((bj)v3).bt(false, 17);
        int v3_1 = -807658005;
        if(v11 != v12.cr * 0xBC6389C3) {
            ((ec)v2_1).am(v0_2, 0, 0, v3_1);
        }

        int v5_1 = v12.as * 0x2029186E;
        if(arg33) {
            v5_1 = ((int)((((double)v5_1)) * 1.5));
        }
        else if(2 == v8) {
            v5_1 = ((int)((((double)v5_1)) * 1.04));
        }

        int v4 = bt.ag[v12.ak * 0x8BE58883] * v5_1 >> v10;
        v3_1 = bt.ah[v12.ak * 0x4D15FAA6] * v5_1 >> v10;
        v27.ap();
        v17_1.ax(v27, 0, v12.ac * 0xD8C776FE, v12.bd * -1182208677, v12.ak * -1314035155, v12.ba * 0xAC8DB305, v12.bf * 0x9009F5A7 + (v4 + v27.bh * 0x540130B3 / 2), v12.bf * 1241237000 + v3_1, 0x52F1F553);
        if(v11 != v12.cp * 0xFA513F6B) {
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }

        if(v8 >= 1) {
            v1_2.aj(1);
        }

        if(v8 >= 2) {
            v1_2.aj(0xFFFFFF);
        }

        if(v9 != 0) {
            v1_2.ad(v9);
        }

        dr.am.bq(v1_2.ax, -1097426610, 0x20, -55);
        if(v12.bi * 0x286CC599 != v11) {
            v10 = 0;
            ((ec)v2_1).am(v0_2, 0, 0, -807658005);
        }
        else {
            v10 = 0;
        }

        v0 = v16;
        if(v0 == 1 || v0 == 2 && v12.bn * 401368599 == 1) {
            ju.au.aq(jz.av(v7, -18), 0, 9, 0xFFFF00, 1, v2_1);
        }

        while(v10 < v1_2.ax.length) {
            if(v1_2.ax[v10] != 0) {
                v1_2.ax[v10] |= 0xFF000000;
            }

            ++v10;
        }

        if(!arg33) {
            dr.aa.ae(((mv)v1_2), v13);
        }

        return v1_2;
    }

    static void bv(fa arg1, int arg2) {
        try {
            hq.ea = false;
            gx.bq(arg1, -1074600612);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dr.bv(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void bv(dr arg5, dr arg6) {
        this.ag = arg5.ag;
        this.as = arg5.as;
        this.ak = arg5.ak;
        this.ac = arg5.ac;
        this.bd = arg5.bd;
        this.ba = arg5.ba;
        this.bf = arg5.bf;
        this.at = arg6.at;
        this.ay = arg6.ay;
        this.aw = arg6.aw;
        this.ao = arg6.ao;
        this.ah = arg6.ah;
        this.bw = arg6.bw;
        this.bn = arg6.bn;
        this.bq = arg6.bq;
        this.bx = arg6.bx;
        this.bc = arg6.bc;
        this.bz = arg6.bz;
        this.bh = arg6.bh;
        this.bk = arg6.bk;
        this.bm = arg6.bm;
        this.bj = arg6.bj;
        this.bu = arg6.bu;
        this.bs = arg6.bs;
        this.cb = arg6.cb;
        this.bo = arg6.bo;
        this.by = new String[5];
        int v1 = 4;
        if(arg6.by != null) {
            int v5;
            for(v5 = 0; v5 < v1; ++v5) {
                this.by[v5] = arg6.by[v5];
            }
        }

        this.by[v1] = gs.ad;
        this.bp = 0;
    }

    void bw(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.ah = arg3.ah;
        this.bw = arg3.bw;
        this.bp = arg3.bp;
        this.bn = 0x5B1931A7;
    }

    void bx(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.bn = arg2.bn;
        this.ah = arg3.ah;
        this.bp = 0;
        this.bw = false;
        this.cw = false;
    }

    void by(dr arg2, dr arg3) {
        this.ag = arg2.ag;
        this.as = arg2.as;
        this.ak = arg2.ak;
        this.ac = arg2.ac;
        this.bd = arg2.bd;
        this.ba = arg2.ba;
        this.bf = arg2.bf;
        this.at = arg2.at;
        this.ay = arg2.ay;
        this.aw = arg2.aw;
        this.ao = arg2.ao;
        this.ah = arg3.ah;
        this.bw = arg3.bw;
        this.bp = arg3.bp;
        this.bn = 0x5B1931A7;
    }

    public final by bz(int arg7) {
        int v4;
        int v3;
        int v2;
        int v1 = 0;
        if(this.be != null && arg7 > 1) {
            v2 = -1;
            v3 = 0;
            v4 = -1;
            while(v3 < 10) {
                if(arg7 >= this.bl[v3] && this.bl[v3] != 0) {
                    v4 = this.be[v3];
                }

                ++v3;
            }

            if(v2 == v4) {
                goto label_26;
            }

            return client.al(v4, 0x3370B5AF).aq(1, 0x2227B690);
        }

    label_26:
        by v7 = by.ax(br.aq, this.ag * -1654053537, 0);
        if(v7 == null) {
            return null;
        }

        v2 = 0xED54BB0F;
        v3 = -204307467;
        v4 = 1104905987;
        int v5 = 0x80;
        if(v5 != this.ca * v2 || this.cj * v4 != v5 || this.cd * v3 != v5) {
            v7.am(this.ca * v2, this.cj * v4, this.cd * v3);
        }

        if(this.at != null) {
            int v0;
            for(v0 = 0; v0 < this.at.length; ++v0) {
                v7.av(this.at[v0], this.ay[v0]);
            }
        }

        if(this.aw != null) {
            while(v1 < this.aw.length) {
                v7.aa(this.aw[v1], this.ao[v1]);
                ++v1;
            }
        }

        return v7;
    }

    public final boolean ca(boolean arg8) {
        int v0 = this.bq * 0xA2B9B221;
        int v2 = this.bx * 0x287C3C3F;
        int v1 = this.bc * -2055517553;
        if(arg8) {
            v0 = 0x91F9401F * this.bz;
            v2 = this.bh * -2016590721;
            v1 = this.bk * 350537141;
        }

        arg8 = true;
        int v3 = -1;
        if(v0 == v3) {
            return 1;
        }

        if(!br.aq.an(v0, 0, -2039403006)) {
            arg8 = false;
        }

        if(v3 != v2 && !br.aq.an(v2, 0, 0x2AD39AA0)) {
            arg8 = false;
        }

        if(v1 != v3 && !br.aq.an(v1, 0, 850126446)) {
            arg8 = false;
        }

        return arg8;
    }

    public final boolean cb(boolean arg6) {
        int v0 = this.bm * 297970235;
        int v1 = this.bj * -1500011501;
        if(arg6) {
            v0 = 0x592D8937 * this.bu;
            v1 = -1046977143 * this.bs;
        }

        int v6 = -1;
        if(v6 == v0) {
            return 1;
        }

        boolean v0_1 = br.aq.an(v0, 0, 0x2E272D7F);
        if(v6 != v1 && !br.aq.an(v1, 0, 333607954)) {
            v0_1 = false;
        }

        return v0_1;
    }

    public int cc(int arg3, int arg4) {
        return bq.al(this.cy, arg3, arg4, 2);
    }

    public final boolean cd(boolean arg7) {
        int v0 = this.bm * 297970235;
        int v1 = this.bj * -1500011501;
        if(arg7) {
            v0 = 0x592D8937 * this.bu;
            v1 = -909476651 * this.bs;
        }

        arg7 = true;
        int v2 = -1;
        if(v2 == v0) {
            return 1;
        }

        if(!br.aq.an(v0, 0, 0xFA5630F9)) {
            arg7 = false;
        }

        if(v2 != v1 && !br.aq.an(v1, 0, 0x3D5DA90A)) {
            arg7 = false;
        }

        return arg7;
    }

    static void ce() {
        dr.ai.ar();
        dr.av.ar();
        dr.aa.ar();
    }

    public final boolean cf(boolean arg6) {
        int v0 = this.bm * 0xFF607F00;
        int v1 = this.bj * -1500011501;
        if(arg6) {
            v0 = 0xF11D0F22 * this.bu;
            v1 = -1046977143 * this.bs;
        }

        int v6 = -1;
        if(v6 == v0) {
            return 1;
        }

        boolean v0_1 = br.aq.an(v0, 0, 0xE8B99EFB);
        if(v6 != v1 && !br.aq.an(v1, 0, 0x13D39D98)) {
            v0_1 = false;
        }

        return v0_1;
    }

    static void ch() {
        dr.ai.ar();
        dr.av.ar();
        dr.aa.ar();
    }

    public int ci() {
        int v1 = -1;
        if(v1 != this.bv * 0x257B243F) {
            if(this.by == null) {
            }
            else if(this.bv * 1519940706 >= 0) {
                if(this.by[this.bv * 0xEFC56F46] != null) {
                    v1 = this.bv * 0xBCAEC62B;
                }

                return v1;
            }
            else {
                if(!gs.ae.equalsIgnoreCase(this.by[4])) {
                    return v1;
                }

                v1 = 4;
            }
        }

        return v1;
    }

    public final by cj(boolean arg9) {
        int v0 = this.bq * 0xA2B9B221;
        int v1 = this.bx * 0x287C3C3F;
        int v3 = this.bc * -2055517553;
        if(arg9) {
            v0 = this.bz * 0x91F9401F;
            v1 = this.bh * -2016590721;
            v3 = 350537141 * this.bk;
        }

        int v2 = -1;
        if(v0 == v2) {
            return null;
        }

        int v5 = 0;
        by v0_1 = by.ax(br.aq, v0, 0);
        if(v1 != v2) {
            by v1_1 = by.ax(br.aq, v1, 0);
            int v4 = 2;
            if(v3 != v2) {
                by v2_1 = by.ax(br.aq, v3, 0);
                by[] v7 = new by[3];
                v7[0] = v0_1;
                v7[1] = v1_1;
                v7[v4] = v2_1;
                v0_1 = new by(v7, 3);
            }
            else {
                by[] v2_2 = new by[v4];
                v2_2[0] = v0_1;
                v2_2[1] = v1_1;
                v0_1 = new by(v2_2, v4);
            }
        }

        if(!arg9) {
            v2 = 0x7A6098FB;
            if(this.bg * v2 != 0) {
                v0_1.ai(0, this.bg * v2, 0);
            }
        }

        if(arg9) {
            v1 = 1038248733;
            if(this.bb * v1 != 0) {
                v0_1.ai(0, this.bb * v1, 0);
            }
        }

        if(this.at != null) {
            int v9;
            for(v9 = 0; v9 < this.at.length; ++v9) {
                v0_1.av(this.at[v9], this.ay[v9]);
            }
        }

        if(this.aw != null) {
            while(v5 < this.aw.length) {
                v0_1.aa(this.aw[v5], this.ao[v5]);
                ++v5;
            }
        }

        return v0_1;
    }

    public static void ck(boolean arg1) {
        if(arg1 != ju.ab) {
            ag.ay(971580097);
            ju.ab = arg1;
        }
    }

    public static void cl() {
        dr.aa.ar();
    }

    public static void cn() {
        dr.aa.ar();
    }

    public int cp(int arg3, int arg4) {
        return bq.al(this.cy, arg3, arg4, 2);
    }

    public int cr() {
        int v1 = -1;
        if(v1 != this.bv * -640323227) {
            if(this.by == null) {
            }
            else {
                int v2 = -104797809;
                if(this.bv * v2 >= 0) {
                    if(this.by[this.bv * 0xCC9A0667] != null) {
                        v1 = this.bv * v2;
                    }

                    return v1;
                }
                else {
                    if(gs.ae.equalsIgnoreCase(this.by[4])) {
                        v1 = 4;
                    }

                    return v1;
                }
            }
        }

        return v1;
    }

    static void cs() {
        dr.ai.ar();
        dr.av.ar();
        dr.aa.ar();
    }

    public int cw(int arg3, int arg4) {
        return bq.al(this.cy, arg3, arg4, 2);
    }

    public final boolean cx(boolean arg6) {
        int v0 = this.bm * 297970235;
        int v1 = this.bj * 0xFDDD3776;
        if(arg6) {
            v0 = 0x592D8937 * this.bu;
            v1 = -1046977143 * this.bs;
        }

        int v6 = -1;
        if(v6 == v0) {
            return 1;
        }

        boolean v0_1 = br.aq.an(v0, 0, -1041811002);
        if(v6 != v1 && !br.aq.an(v1, 0, 169789630)) {
            v0_1 = false;
        }

        return v0_1;
    }

    public final by cy(boolean arg5) {
        int v0 = this.bm * 297970235;
        int v2 = this.bj * 0xD5BA0324;
        if(arg5) {
            v0 = this.bu * 0x592D8937;
            v2 = this.bs * 0x7303D98C;
        }

        int v5 = -1;
        if(v5 == v0) {
            return null;
        }

        int v3 = 0;
        by v0_1 = by.ax(br.aq, v0, 0);
        if(v5 != v2) {
            v0_1 = new by(new by[]{v0_1, by.ax(br.aq, v2, 0)}, 2);
        }

        if(this.at != null) {
            for(v5 = 0; v5 < this.at.length; ++v5) {
                v0_1.av(this.at[v5], this.ay[v5]);
            }
        }

        if(this.aw != null) {
            while(v3 < this.aw.length) {
                v0_1.aa(this.aw[v3], this.ao[v3]);
                ++v3;
            }
        }

        return v0_1;
    }

    public static void cz() {
        dr.aa.ar();
    }

    static final void ej(int arg17, int arg18, boolean arg19, int arg20) {
        int v8;
        int v7;
        int v6;
        int v0 = arg17;
        int v1 = arg18;
        if(arg19) {
            try {
                if(ho.fu * 0xFEBB0BCF == v0 && v1 == dl.fb * 0x676FF5A5) {
                    return;
                }

            label_12:
                ho.fu = 0xF0761B2F * v0;
                dl.fb = 1331030573 * v1;
                dc.ay(25, -34);
                client.al.uu.ad(0x3940BB62);
                int v4 = 1;
                eq.dh(gs.ai, true, 0xB7B9BB0C);
                int v2 = ad.fi * 474770003;
                int v5 = nr.fo * 0x519F9BE7;
                ad.fi = (v0 - 6) * -1841606952;
                nr.fo = (v1 - 6) * -443924808;
                v0 = ad.fi * 474770003 - v2;
                v1 = nr.fo * 0x519F9BE7 - v5;
                v2 = 0;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v6 = 0xC5758A80;
                    v7 = 0x7CFC1580;
                    v8 = 10;
                    if(v3 >= 0x8000) {
                        break;
                    }

                    ii v5_1 = client.ev[v3];
                    if(v5_1 != null) {
                        int v9;
                        for(v9 = 0; v9 < v8; ++v9) {
                            v5_1.dc[v9] -= v0;
                            v5_1.dj[v9] -= v1;
                        }

                        v5_1.bp -= v7 * v0;
                        v5_1.bw -= v6 * v1;
                    }
                }

                for(v3 = 0; v3 < 0x800; ++v3) {
                    hw v5_2 = client.jf[v3];
                    if(v5_2 != null) {
                        for(v9 = 0; v9 < v8; ++v9) {
                            v5_2.dc[v9] -= v0;
                            v5_2.dj[v9] -= v1;
                        }

                        v5_2.bp -= v0 * v7;
                        v5_2.bw -= v1 * v6;
                    }
                }

                v3 = 103;
                v5 = -1;
                v6 = 104;
                if(v0 < 0) {
                    v7 = 103;
                    v8 = -1;
                    v9 = -1;
                }
                else {
                    v7 = 0;
                    v8 = 104;
                    v9 = 1;
                }

                if(v1 < 0) {
                    v4 = -1;
                }
                else {
                    v3 = 0;
                    v5 = 104;
                }

                while(true) {
                    int v10 = 4;
                    if(v7 == v8) {
                        break;
                    }

                    int v11;
                    for(v11 = v3; v11 != v5; v11 += v4) {
                        int v12 = v7 + v0;
                        int v13 = v1 + v11;
                        int v14;
                        for(v14 = 0; v14 < v10; ++v14) {
                            client.ka[v14][v7][v11] = v12 < 0 || v13 < 0 || v12 >= v6 || v13 >= v6 ? null : client.ka[v14][v12][v13];
                        }
                    }

                    v7 += v9;
                }

                mx v3_1;
                for(v3_1 = client.kw.aj(); v3_1 != null; v3_1 = client.kw.aq()) {
                    ((io)v3_1).ae -= 0x467C9F5B * v0;
                    ((io)v3_1).ar -= 0x7CE80D4B * v1;
                    v5 = 0xFFA278D3;
                    if(((io)v3_1).ae * v5 >= 0) {
                        v7 = 0x9D0B1463;
                        if(((io)v3_1).ar * v7 < 0) {
                            goto label_186;
                        }
                        else if(((io)v3_1).ae * v5 >= v6) {
                            goto label_186;
                        }
                        else if(((io)v3_1).ar * v7 >= v6) {
                            goto label_186;
                        }
                    }
                    else {
                    label_186:
                        ((io)v3_1).lp();
                    }
                }

                if(client.oc * 0xF0B2F2BB != 0) {
                    client.oc -= 0xDC6E8273 * v0;
                    client.oj -= 0xEF40F9B7 * v1;
                }

                client.pd = 0;
                client.pi = false;
                v0 <<= 7;
                ag.hc -= 0x71608B7D * v0;
                v1 <<= 7;
                fg.hb -= 0x543710A7 * v1;
                aq.hk -= v0 * 1698507665;
                ma.hw -= v1 * 0x90F3A969;
                client.om = -1668940003;
                client.kq.ax();
                client.kg.ax();
                while(true) {
                    if(v2 >= v10) {
                        return;
                    }

                    client.gg[v2].ax(-400581187);
                    ++v2;
                }
            }
            catch(RuntimeException v0_1) {
                goto label_244;
            }
        }

        goto label_12;
        return;
    label_244:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("dr.ej(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
    }
}

