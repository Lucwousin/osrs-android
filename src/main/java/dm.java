public class dm extends cg {
    int ab;
    cn ad;
    int aj;
    final int an;
    final cc ap;
    int aq;
    static final int ni = 0x870;

    dm(af arg1, af arg2, int arg3, cc arg4) {
        try {
            super(arg1, arg2);
            this.an = arg3 * 0x6B108C3;
            this.ap = arg4;
            this.at(0);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dm.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    int aa() {
        return this.aq * 0xCB54051F;
    }

    public int ab() {
        return this.aj * 0xB63078EB;
    }

    cn ae(byte arg3) {
        try {
            return this.ad;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dm.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    cn af() {
        return this.ad;
    }

    int ai() {
        return this.aq * 0xCB54051F;
    }

    public static dc al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dc.al.ax(v0);
            if(v5 != null) {
                return ((dc)v5);
            }

            byte[] v4_1 = dc.ax.ae(11, arg4, 0x78DC0DC9);
            dc v5_1 = new dc();
            if(v4_1 != null) {
                v5_1.ar(new lq(v4_1), -607764761);
            }

            v5_1.ae(14);
            dc.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("dm.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public int al(byte arg3) {
        try {
            return this.aj * 0xB63078EB;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dm.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int am() {
        return this.ab * 0x41B50B9F;
    }

    int an(int arg3) {
        try {
            return this.ab * 0x41B50B9F;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dm.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ao() {
        this.aj = ok.al(this.an * 0xAFC7E7EB, 0x649611E6).ai(0xE370EE6C).bn * 595068609;
        this.ad = this.ap.bq(ae.al(this.aj * 0xB63078EB, 16), 43);
        es v1 = ae.al(this.al(0), 16).ap(false, 50);
        if(v1 != null) {
            this.aq = v1.al * -320522529;
            this.ab = v1.ae * 0x7771505F;
        }
        else {
            this.aq = 0;
            this.ab = 0;
        }
    }

    public int aq() {
        return this.aj * 0xB63078EB;
    }

    int ar(int arg3) {
        arg3 = 0xCB54051F;
        try {
            return this.aq * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dm.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void at(byte arg4) {
        try {
            this.aj = ok.al(this.an * 0xAFC7E7EB, -214410470).ai(0xE538990F).bn * 595068609;
            this.ad = this.ap.bq(ae.al(this.aj * 0xB63078EB, 16), 52);
            es v4_1 = ae.al(this.al(62), 16).ap(false, 120);
            if(v4_1 != null) {
                this.aq = v4_1.al * -320522529;
                this.ab = v4_1.ae * 0x7771505F;
            }
            else {
                this.aq = 0;
                this.ab = 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dm.at(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    int au() {
        return this.aq * 0xCB54051F;
    }

    int av() {
        return this.aq * 0x6494AB16;
    }

    void aw() {
        this.aj = ok.al(this.an * 0xAFC7E7EB, 0x8FEF55B).ai(0xC53738F6).bn * 595068609;
        this.ad = this.ap.bq(ae.al(this.aj * 0xB63078EB, 16), 65);
        es v0 = ae.al(this.al(-3), 16).ap(false, 0x79);
        if(v0 != null) {
            this.aq = v0.al * -320522529;
            this.ab = v0.ae * 0x7771505F;
        }
        else {
            this.aq = 0;
            this.ab = 0;
        }
    }

    public static int ax(CharSequence arg12, CharSequence arg13, ly arg14, int arg15) {
        char v8;
        char v6_1;
        char v4_1;
        int v5_1;
        char v2_1;
        char v11;
        int v3_1;
        byte v7;
        char v5;
        int v4;
        char v3;
        int v2;
        int v0;
        try {
            arg15 = arg12.length();
            v0 = arg13.length();
            v2 = 0;
            v3 = '\u0000';
            v4 = 0;
            v5 = '\u0000';
            while(true) {
            label_7:
                int v6 = v2 - v3;
                v7 = -1;
                if(v6 >= arg15 && v4 - v5 >= v0) {
                    v2 = Math.min(arg15, v0);
                    v3_1 = 0;
                    goto label_14;
                }

                if(v6 >= arg15) {
                    return v7;
                }

                if(v4 - v5 >= v0) {
                    return 1;
                }

                if(v3 != 0) {
                    v11 = v3;
                    v3_1 = v2;
                    v2_1 = v11;
                }
                else {
                    v3_1 = v2 + 1;
                    v2_1 = arg12.charAt(v2);
                }

                if(v5 != 0) {
                    v11 = v5;
                    v5_1 = v4;
                    v4_1 = v11;
                }
                else {
                    v5_1 = v4 + 1;
                    v4_1 = arg13.charAt(v4);
                }

                v6_1 = av.ae(v2_1, 0);
                v8 = av.ae(v4_1, 0);
                v2_1 = at.al(v2_1, arg14, 0xF8DD5189);
                v4_1 = at.al(v4_1, arg14, 44860508);
                if(v4_1 != v2_1 && Character.toUpperCase(v2_1) != Character.toUpperCase(v4_1)) {
                    v2_1 = Character.toLowerCase(v2_1);
                    v4_1 = Character.toLowerCase(v4_1);
                    if(v4_1 != v2_1) {
                        return ig.ar(v2_1, arg14, v7) - ig.ar(v4_1, arg14, v7);
                    }
                }

                break;
            }
        }
        catch(RuntimeException v12) {
            goto label_98;
        }

        v2 = v3_1;
        v4 = v5_1;
        v3 = v6_1;
        v5 = v8;
        goto label_7;
        try {
        label_14:
            while(v3_1 < v2) {
                if(arg14 == ly.ae) {
                    v4 = arg15 - 1 - v3_1;
                    v5_1 = v0 - 1 - v3_1;
                }
                else {
                    v4 = v3_1;
                    v5_1 = v4;
                }

                v4_1 = arg12.charAt(v4);
                v5 = arg13.charAt(v5_1);
                if(v5 != v4_1 && Character.toUpperCase(v4_1) != Character.toUpperCase(v5)) {
                    v4_1 = Character.toLowerCase(v4_1);
                    v5 = Character.toLowerCase(v5);
                    if(v5 != v4_1) {
                        return ig.ar(v4_1, arg14, v7) - ig.ar(v5, arg14, v7);
                    }
                }

                ++v3_1;
            }

            arg15 -= v0;
            if(arg15 != 0) {
                return arg15;
            }

            for(arg15 = 0; arg15 < v2; ++arg15) {
                char v0_1 = arg12.charAt(arg15);
                v3 = arg13.charAt(arg15);
                if(v3 != v0_1) {
                    return ig.ar(v0_1, arg14, v7) - ig.ar(v3, arg14, v7);
                }
            }

            return 0;
        }
        catch(RuntimeException v12) {
        label_98:
            StringBuilder v13 = new StringBuilder();
            v13.append("dm.ax(");
            v13.append(')');
            throw lx.al(((Throwable)v12), v13.toString());
        }
    }

    void ay() {
        this.aj = ok.al(this.an * 0xAFC7E7EB, 961079465).ai(0x37005A93).bn * 595068609;
        this.ad = this.ap.bq(ae.al(this.aj * 0xB63078EB, 16), 0x70);
        es v0 = ae.al(this.al(-118), 16).ap(false, 90);
        if(v0 != null) {
            this.aq = v0.al * -320522529;
            this.ab = v0.ae * 0x7771505F;
        }
        else {
            this.aq = 0;
            this.ab = 0;
        }
    }

    int az() {
        return this.ab * 0x41B50B9F;
    }

    static void bi(int arg6, int arg7, int arg8) {
        try {
            arg8 = 0x3310F9D5;
            if(client.pc * arg8 != 0 && arg6 != -1) {
                ik.ae(fz.du, arg6, 0, client.pc * arg8, false, -67);
                client.po = true;
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("dm.bi(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    static void by(ih arg3, int arg4) {
        arg4 = 306523880;
        try {
            if(arg3.ab(arg4) != client.aq) {
                client.aq = arg3.ab(0x48D3D3AE);
                be.as(arg3.ab(0xFBF9A6D8), 0x74BE8F30);
                client.al.aba(0xB5A88689).bp("fhtagn", arg3.ab(40293944), 0xE517DB66);
            }

            dd.do = arg3.aa;
            client.ae = arg3.af * 22487701;
            client.ar = arg3.ai * 0x2986F0F7;
            int v0 = -190026425;
            int v1 = 0xBBB22DD;
            arg4 = client.ap * v0 == 0 ? 0xAA4A : arg3.af * v1 + 40000;
            gu.dq = arg4 * 1248099281;
            arg4 = -1080391757;
            int v3_1 = client.ap * v0 == 0 ? 443 : arg3.af * v1 + 50000;
            bf.dt = v3_1 * arg4;
            ol.dd = gu.dq * 886379063;
            hq.df = false;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("dm.by(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static final void eb(int arg14, int arg15, int arg16) {
        int v0 = arg14;
        int v7 = arg15;
        try {
            int v8 = 1101813865;
            fi v1 = client.ka[kt.jz * v8][v0][v7];
            if(v1 == null) {
                ee.fs.aw(kt.jz * v8, arg14, arg15);
                return;
            }

            long v2 = -99999999;
            mx v4 = v1.aj();
            mx v5 = null;
            mx v9 = v5;
            while(true) {
                int v6 = 0xC8B95FFD;
                if(v4 == null) {
                    break;
                }

                dr v6_1 = client.al(((jk)v4).ax * v6, 1466620091);
                long v10 = ((long)(v6_1.bp * 0x5941C08B));
                if(v6_1.bn * 401368599 == 1) {
                    v10 *= ((long)(((jk)v4).al * 0xEC9560D3 + 1));
                }

                if(v10 > v2) {
                    v9 = v4;
                    v2 = v10;
                }

                v4 = v1.aq();
            }

            if(v9 == null) {
                ee.fs.aw(kt.jz * v8, arg14, arg15);
                return;
            }

            v1.ae(v9);
            mx v2_1 = v1.aj();
            mx v10_1 = v5;
            mx v11 = v10_1;
            while(v2_1 != null) {
                if(((jk)v9).ax * v6 != ((jk)v2_1).ax * v6) {
                    if(v10_1 == null) {
                        v10_1 = v2_1;
                    }

                    if(((jk)v2_1).ax * v6 == ((jk)v10_1).ax * v6) {
                        goto label_70;
                    }

                    if(v11 != null) {
                        goto label_70;
                    }

                    v11 = v2_1;
                }

            label_70:
                v2_1 = v1.aq();
            }

            ee.fs.ad(kt.jz * v8, arg14, arg15, fj.ez(v0 * 0x80 + 0x40, v7 * 0x80 + 0x40, kt.jz * v8, 0x7640D11A), v9, gs.aa(arg14, arg15, 3, false, 0, 1), v10_1, v11);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("dm.eb(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }
}

