public class ij extends mv {
    String ad;
    int ae;
    static final String ai = "Failed to contact server. Please check your Internet connection.";
    ej aj;
    int al;
    ew an;
    ej ap;
    String aq;
    String ar;
    static final int aw = 0x200;
    int ax;
    public static final int bk = 56;
    public static final int cf = 1004;
    protected static long tq;

    ij(int arg8, String arg9, String arg10, String arg11) {
        try {
            super();
            this.ap = ej.ax;
            this.aj = ej.ax;
            this.ax(arg8, arg9, arg10, arg11, 1203658327);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ij.<init>(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void aa() {
        ej v0 = ds.rq.an.ar(this.an, 968172101) ? ej.al : ej.ae;
        this.ap = v0;
    }

    void ab(int arg3, String arg4, String arg5, String arg6) {
        this.ax = iv.ax(0xC1A9F9A4) * 0xFCF54C11;
        this.al = client.bj * -1676090551;
        this.ae = arg3 * -1250053341;
        this.ar = arg4;
        this.ad(62);
        this.ad = arg5;
        this.aq = arg6;
        this.al(69);
        this.an(0x77E370BE);
    }

    final void ad(byte arg3) {
        try {
            this.an = this.ar != null ? new ew(iz.if(this.ar, 0x73), ac.ad) : null;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final boolean ae(int arg3) {
        try {
            if(this.ap == ej.ax) {
                this.ar(28);
            }

            if(this.ap != ej.al) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    void af() {
        this.ap = ej.ax;
    }

    final void ag() {
        ew v0 = this.ar != null ? new ew(iz.if(this.ar, 35), ac.ad) : null;
        this.an = v0;
    }

    final void ah() {
        this.an = this.ar != null ? new ew(iz.if(this.ar, 43), ac.ad) : null;
    }

    final boolean ai() {
        if(this.ap == ej.ax) {
            this.ar(-2);
        }

        boolean v0 = this.ap == ej.al ? true : false;
        return v0;
    }

    void aj(int arg3) {
        try {
            ej v3_1 = ds.rq.ap.ar(this.an, 968172101) ? ej.al : ej.ae;
            this.aj = v3_1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void al(byte arg3) {
        try {
            this.ap = ej.ax;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final boolean am() {
        if(this.aj == ej.ax) {
            this.aj(0x67E0E670);
        }

        boolean v0 = this.aj == ej.al ? true : false;
        return v0;
    }

    void an(int arg3) {
        try {
            this.aj = ej.ax;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final boolean ap(int arg3) {
        try {
            if(this.aj == ej.ax) {
                this.aj(0x74AAD0A5);
            }

            if(this.aj != ej.al) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    void aq(int arg3, String arg4, String arg5, String arg6) {
        this.ax = iv.ax(0x24F85F73) * 0xFCF54C11;
        this.al = client.bj * 0x1164CAAF;
        this.ae = arg3 * -1250053341;
        this.ar = arg4;
        this.ad(-11);
        this.ad = arg5;
        this.aq = arg6;
        this.al(103);
        this.an(2104730752);
    }

    void ar(byte arg3) {
        try {
            ej v3_1 = ds.rq.an.ar(this.an, 968172101) ? ej.al : ej.ae;
            this.ap = v3_1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ij.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void at() {
        this.an = this.ar != null ? new ew(iz.if(this.ar, -23), ac.ad) : null;
    }

    void au() {
        ej v0 = ds.rq.an.ar(this.an, 968172101) ? ej.al : ej.ae;
        this.ap = v0;
    }

    void av() {
        ej v0 = ds.rq.an.ar(this.an, 968172101) ? ej.al : ej.ae;
        this.ap = v0;
    }

    void ax(int arg2, String arg3, String arg4, String arg5, int arg6) {
        arg6 = 0x19A0C355;
        try {
            this.ax = iv.ax(arg6) * 0xFCF54C11;
            this.al = client.bj * -1676090551;
            this.ae = arg2 * -1250053341;
            this.ar = arg3;
            this.ad(-65);
            this.ad = arg4;
            this.aq = arg5;
            this.al(97);
            this.an(0x6C8D18B0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ij.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void ay() {
        this.an = this.ar != null ? new ew(iz.if(this.ar, -32), ac.ad) : null;
    }

    final void az() {
        this.an = this.ar != null ? new ew(iz.if(this.ar, 11), ac.ad) : null;
    }

    static final void en(int arg21, int arg22) {
        int v0 = arg21;
        try {
            int[] v9 = mu.ow.ax;
            int v1 = v9.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v9[v2] = 0xFF000000;
            }

            int v12;
            for(v12 = 1; true; ++v12) {
                int v13 = 3;
                int v14 = 103;
                if(v12 >= v14) {
                    break;
                }

                int v16 = (103 - v12) * 0x800 + 0x6034;
                int v15;
                for(v15 = 1; v15 < v14; ++v15) {
                    if((id.al[v0][v15][v12] & 24) == 0) {
                        ee.fs.bt(v9, v16, 0x200, arg21, v15, v12);
                    }

                    if(v0 < v13) {
                        int v6 = v0 + 1;
                        if((id.al[v6][v15][v12] & 8) != 0) {
                            ee.fs.bt(v9, v16, 0x200, v6, v15, v12);
                        }
                    }

                    v16 += 4;
                }
            }

            byte v7 = 16;
            int v8 = ((((int)(Math.random() * 20))) + 0xE4 << v7) + ((((int)(Math.random() * 20))) + 0xE4 << 8) + ((((int)(Math.random() * 20))) + 0xE4);
            int v9_1 = (((int)(Math.random() * 20))) + 0xE4 << 16;
            for(v12 = 1; v12 < v14; ++v12) {
                for(v15 = 1; v15 < v14; v15 = v1 + 1) {
                    if((id.al[v0][v15][v12] & 24) == 0) {
                        ie.el(arg21, v15, v12, v8, v9_1, 0xFD21282);
                    }

                    if(v0 < v13) {
                        v2 = v0 + 1;
                        if((id.al[v2][v15][v12] & 8) != 0) {
                            v1 = v15;
                            ie.el(v2, v1, v12, v8, v9_1, 0x47E60C2);
                        }
                        else {
                            goto label_117;
                        }
                    }
                    else {
                    label_117:
                        v1 = v15;
                    }
                }
            }

            client.ou = 0;
            v0 = 0;
            while(true) {
            label_124:
                v1 = 104;
                if(v0 >= v1) {
                    return;
                }

                v2 = 0;
                while(true) {
                label_127:
                    if(v2 >= v1) {
                        goto label_164;
                    }

                    long v3 = ee.fs.bn(kt.jz * 1101813865, v0, v2);
                    if(0 != v3) {
                        int v3_1 = ok.al(be.av(v3), -1047895304).bn * 1284025131;
                        if(v3_1 >= 0) {
                            client.oh[client.ou * 0x5075FEA3] = ae.al(v3_1, v7).ap(false, 55);
                            client.ok[client.ou * 0x5075FEA3] = v0;
                            client.ov[client.ou * 0x5075FEA3] = v2;
                            client.ou += 0xD2E5A50B;
                        }
                    }

                    break;
                }
            }
        }
        catch(RuntimeException v0_1) {
            goto label_169;
        }

        ++v2;
        goto label_127;
    label_164:
        ++v0;
        goto label_124;
        return;
    label_169:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("ij.en(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
    }
}

