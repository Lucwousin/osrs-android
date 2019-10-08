import java.util.Collection;

public class dy extends mv {
    public String[] ab;
    public int[] ad;
    public char ae;
    public int aj;
    static gk al;
    public String an;
    public int ap;
    public int[] aq;
    public char ar;
    static ko ax;
    static ki dk;
    static ef ey;

    static {
        dy.al = new gk(0x40, null);
    }

    dy() {
        try {
            super();
            this.an = gs.aq;
            this.aj = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dy.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg5, int arg6) {
        if(arg6 == 1) {
            this.ae = ((char)arg5.ay(-32));
        }
        else if(arg6 == 2) {
            this.ar = ((char)arg5.ay(-65));
        }
        else if(arg6 == 3) {
            this.an = arg5.bn(-7);
        }
        else if(4 == arg6) {
            this.ap = arg5.ac(99) * 0xCE156611;
        }
        else {
            int v1 = 0;
            int v2 = 0xDD6F88BB;
            int v3 = 0xA0D17C73;
            if(arg6 == 5) {
                this.aj = arg5.ao(0xCC765762) * v2;
                this.ad = new int[this.aj * 0xD5CAF329];
                this.ab = new String[this.aj * v3];
                while(v1 < this.aj * v3) {
                    this.ad[v1] = arg5.ac(23);
                    this.ab[v1] = arg5.bn(-20);
                    ++v1;
                }
            }
            else if(arg6 == 6) {
                this.aj = arg5.ao(0x7A01EC08) * v2;
                this.ad = new int[this.aj * v3];
                this.aq = new int[this.aj * 0x30CC479];
                while(v1 < this.aj * v3) {
                    this.ad[v1] = arg5.ac(17);
                    this.aq[v1] = arg5.ac(97);
                    ++v1;
                }
            }
        }
    }

    public static dy ab(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dy.al.ax(v1);
        if(v0 != null) {
            return ((dy)v0);
        }

        byte[] v5 = dy.ax.ae(8, arg5, 0x78DC0DC9);
        dy v0_1 = new dy();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0x51CC259D);
        }

        dy.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static dy ad(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dy.al.ax(v1);
        if(v0 != null) {
            return ((dy)v0);
        }

        byte[] v5 = dy.ax.ae(8, arg5, 0x78DC0DC9);
        dy v0_1 = new dy();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 2038663468);
        }

        dy.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -66;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, -27);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dy.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void af(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-67);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -55);
        }
    }

    public int ag() {
        return this.aj * 0xA0D17C73;
    }

    public int ah() {
        return this.aj * 0xA0D17C73;
    }

    void ai(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-118);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -42);
        }
    }

    public static void aj(ko arg0) {
        dy.ax = arg0;
    }

    public int am() {
        return this.aj * 0xA0D17C73;
    }

    public int an(byte arg3) {
        try {
            return this.aj * 0xA0D17C73;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dy.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static void ao(Collection arg1) {
        arg1.add(dy.al);
    }

    public static dy aq(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dy.al.ax(v1);
        if(v0 != null) {
            return ((dy)v0);
        }

        byte[] v5 = dy.ax.ae(8, arg5, 0x78DC0DC9);
        dy v0_1 = new dy();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0x67C3DCCF);
        }

        dy.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ar(lq arg4, int arg5, byte arg6) {
        if(arg5 == 1) {
            byte v5 = -88;
            try {
                this.ae = ((char)arg4.ay(v5));
                return;
            label_9:
                if(arg5 == 2) {
                    this.ar = ((char)arg4.ay(-100));
                }
                else if(arg5 == 3) {
                    this.an = arg4.bn(39);
                }
                else if(4 == arg5) {
                    this.ap = arg4.ac(20) * 2078803361;
                }
                else {
                    int v0 = 0;
                    int v1 = 0xDD6F88BB;
                    int v2 = 0xA0D17C73;
                    if(arg5 == 5) {
                        this.aj = arg4.ao(381800183) * v1;
                        this.ad = new int[this.aj * v2];
                        this.ab = new String[this.aj * v2];
                        while(v0 < this.aj * v2) {
                            this.ad[v0] = arg4.ac(22);
                            this.ab[v0] = arg4.bn(-53);
                            ++v0;
                        }
                    }
                    else if(arg5 == 6) {
                        this.aj = arg4.ao(0x80C2D043) * v1;
                        this.ad = new int[this.aj * v2];
                        this.aq = new int[this.aj * v2];
                        while(true) {
                            if(v0 < this.aj * v2) {
                                this.ad[v0] = arg4.ac(58);
                                this.aq[v0] = arg4.ac(43);
                                ++v0;
                                continue;
                            }

                            return;
                        }

                    label_8:
                        goto label_87;
                    }
                }
            }
            catch(RuntimeException v4) {
                goto label_8;
            }
        }
        else {
            goto label_9;
        label_87:
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("dy.ar(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    public static void at(Collection arg1) {
        arg1.add(dy.al);
    }

    public int au() {
        return this.aj * 0x97CC6681;
    }

    void av(lq arg4, int arg5) {
        if(arg5 == 1) {
            this.ae = ((char)arg4.ay(-23));
        }
        else if(arg5 == 2) {
            this.ar = ((char)arg4.ay(-22));
        }
        else if(arg5 == 3) {
            this.an = arg4.bn(-49);
        }
        else if(4 == arg5) {
            this.ap = arg4.ac(81) * 2078803361;
        }
        else {
            int v1 = 0;
            int v2 = 0xA0D17C73;
            if(arg5 == 5) {
                this.aj = arg4.ao(0x8B8B12FE) * -710960503;
                this.ad = new int[this.aj * v2];
                this.ab = new String[this.aj * 1515732006];
                while(v1 < this.aj * v2) {
                    this.ad[v1] = arg4.ac(22);
                    this.ab[v1] = arg4.bn(52);
                    ++v1;
                }
            }
            else if(arg5 == 6) {
                this.aj = arg4.ao(0x276F9B96) * 0xDD6F88BB;
                this.ad = new int[this.aj * v2];
                this.aq = new int[this.aj * 0xB46DD6FC];
                while(v1 < this.aj * v2) {
                    this.ad[v1] = arg4.ac(0x71);
                    this.aq[v1] = arg4.ac(0x7D);
                    ++v1;
                }
            }
        }
    }

    static void aw(byte[] arg11, int arg12) {
        int v4;
        try {
            lq v12 = new lq(arg11);
            int v1 = -1880437085;
            v12.ar = (arg11.length - 2) * v1;
            oi.ax = v12.ao(-1638950069) * 0xFCB43EE5;
            int v2 = 43536109;
            fe.ar = new int[oi.ax * v2];
            lk.an = new int[oi.ax * v2];
            fe.ap = new int[oi.ax * v2];
            gu.aj = new int[oi.ax * v2];
            nq.aq = new byte[oi.ax * v2][];
            v4 = 0x14C27768;
            v12.ar = (arg11.length - 7 - oi.ax * v4) * v1;
            fe.al = v12.ao(-1802769507) * 0x958F125F;
            fe.ae = v12.ao(-1935857092) * 0x6D4E0DF9;
            int v0 = (v12.ay(-23) & 0xFF) + 1;
            int v6;
            for(v6 = 0; v6 < oi.ax * v2; ++v6) {
                fe.ar[v6] = v12.ao(0x15EB31D5);
            }

            for(v6 = 0; v6 < oi.ax * v2; ++v6) {
                lk.an[v6] = v12.ao(0xC56C14BE);
            }

            for(v6 = 0; v6 < oi.ax * v2; ++v6) {
                fe.ap[v6] = v12.ao(0x241A054F);
            }

            for(v6 = 0; v6 < oi.ax * v2; ++v6) {
                gu.aj[v6] = v12.ao(0xBE80C80E);
            }

            v12.ar = (arg11.length - 7 - oi.ax * v4 - (v0 - 1) * 3) * v1;
            jw.ad = new int[v0];
            int v11_1;
            for(v11_1 = 1; v11_1 < v0; ++v11_1) {
                jw.ad[v11_1] = v12.ak(-510767745);
                if(jw.ad[v11_1] == 0) {
                    jw.ad[v11_1] = 1;
                }
            }

            v12.ar = 0;
            v11_1 = 0;
            while(true) {
            label_124:
                if(v11_1 >= oi.ax * v2) {
                    return;
                }

                v0 = fe.ap[v11_1];
                v1 = gu.aj[v11_1];
                v4 = v0 * v1;
                byte[] v6_1 = new byte[v4];
                nq.aq[v11_1] = v6_1;
                int v7 = v12.ay(-35);
                int v8 = -1215098345;
                if(v7 == 0) {
                    v0 = 0;
                    while(true) {
                        if(v0 < v4) {
                            v6_1[v0] = v12.aw(v8);
                            ++v0;
                            continue;
                        }

                        goto label_158;
                    }
                }
                else if(1 == v7) {
                    v4 = 0;
                    while(true) {
                    label_147:
                        if(v4 < v0) {
                            v7 = 0;
                            while(true) {
                                if(v7 < v1) {
                                    v6_1[v7 * v0 + v4] = v12.aw(v8);
                                    ++v7;
                                    continue;
                                }
                                else {
                                    goto label_156;
                                }
                            }
                        }

                        goto label_158;
                    }
                }

                goto label_158;
            }
        }
        catch(RuntimeException v11) {
            goto label_163;
        }

    label_156:
        ++v4;
        goto label_147;
    label_158:
        ++v11_1;
        goto label_124;
        return;
    label_163:
        StringBuilder v12_1 = new StringBuilder();
        v12_1.append("dy.aw(");
        v12_1.append(')');
        throw lx.al(((Throwable)v11), v12_1.toString());
    }

    public static void aw(Collection arg1) {
        arg1.add(dy.al);
    }

    public static void ay(Collection arg1) {
        arg1.add(dy.al);
    }

    public int az() {
        return this.aj * 1978251029;
    }

    static final void gr(byte arg9) {
        int v4;
        int v3;
        try {
            ar v0 = null;
            if(!as.me) {
                client.my = v0;
                return;
            }

            if(dt.bu.ax == ik.al) {
                fr.mu = client.my.bz * 0xC66492B5;
                av.mk = client.my.bh * 0x707E2B6D;
                ac.mq = 0;
                ae.mm = 0;
                return;
            }

            hu.mh = false;
            if(dt.bu.ax == ik.aq) {
                ae.mm = (dt.bu.ad[0] - dt.bu.ap[0]) * 0x8DC1D083;
                ac.mq = (dt.bu.aq[0] - dt.bu.aj[0]) * -1640135847;
                jw.md = 0;
                be.ma = 0;
            }
            else {
                v3 = 0xF82697D9;
                v4 = 0xBBE661D1;
                if(dt.bu.ax == ik.ab) {
                    be.ma = dt.bu.al(0x6C9F31CF) * v4;
                    jw.md = dt.bu.ax(-120) * v3;
                }

                ae.mm += be.ma * 0xBD052E13;
                be.ma = be.ma * 0x303E4991 / 100 * v4;
                ac.mq += jw.md * 785028993;
                jw.md = jw.md * 0xA99B9FC9 / 100 * v3;
            }

            if(ae.mm * 0x1930FE2B != 0 || ac.mq * 473208041 != 0) {
                int v1 = 0x55D2B057;
                int v9_1 = client.my.bz * v1;
                v4 = 0x4407680D;
                v3 = client.my.bh * v4;
                client.my.bz = fr.mu * 0x3B5B4B9D - ae.mm * 0x476A589A;
                if(client.my.bz * v1 > client.my.bb * 0x83EA0C19 - client.my.by * 0x1804E4A5) {
                    client.my.bz = client.my.bb * 0xAACDA10F - client.my.by * 0x130F0563;
                }

                if(client.my.bz * v1 < 0) {
                    client.my.bz = 0;
                }

                client.my.bh = av.mk * 1485018725 - ac.mq * 0xBEE05A9A;
                if(client.my.bh * v4 > client.my.bc * 1153505113 - client.my.bt * 0x6F0D2CD) {
                    client.my.bh = client.my.bc * 0xD7FD2D7D - client.my.bt * 0x6EB7A5C1;
                }

                if(client.my.bh * v4 < 0) {
                    client.my.bh = 0;
                }

                if(client.my.bz * v1 == v9_1 && client.my.bh * v4 == v3) {
                    goto label_198;
                }

                kx.gw(client.my, 0x7FD06411);
                hu.mh = true;
            }

        label_198:
            if(!hu.mh) {
                jw.md = 0;
                be.ma = 0;
                if(dt.bu.ax != ik.aq) {
                    client.my = v0;
                }
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dy.gr(");
            v0_1.append(')');
            throw lx.al(((Throwable)v9), v0_1.toString());
        }
    }

    static void it(byte arg4) {
        try {
            if((client.hj) && gu.jg != null) {
                int v4_1 = gu.jg.dc[0];
                int v1 = gu.jg.dj[0];
                if(v4_1 >= 0 && v1 >= 0) {
                    int v2 = 104;
                    if(v4_1 < v2) {
                        if(v1 >= v2) {
                        }
                        else {
                            aq.hk = gu.jg.bp * 0xD011B133;
                            v4_1 = fj.ez(gu.jg.bp * 0x914F0683, gu.jg.bw * 0xD19D0C3D, kt.jz * 1101813865, 0x7640D11A) - client.hn * 0xB8D87B9F;
                            if(v4_1 < co.hu * 0x72F9E57B) {
                                co.hu = v4_1 * -2021117517;
                            }

                            ma.hw = gu.jg.bw * -1805301243;
                            client.hj = false;
                            return;
                        }
                    }
                }

                return;
            }

            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dy.it(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }
}

