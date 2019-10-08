public class am {
    static int[] aa = null;
    static int[] ad = null;
    static int[] ae = null;
    static final int al = 2;
    final boolean ax;
    static final int on = 0x200;

    public am(boolean arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("am.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static es abt(byte[] arg1, int arg2) {
        try {
            return ey.up.ag(arg1, 0x9130A212);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("am.abt(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean ae() {
        return this.ax;
    }

    static void ai(int arg1, int arg2) {
        try {
            if(client.al.aba(-378102917).gu(-77)) {
                client.al.aba(0x4BD89A26).gl(0x5CCB79DA).ay(arg1, 0x2A96C03C);
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("am.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean al() {
        return this.ax;
    }

    static final void ax(lo arg8, int arg9) {
        arg9 = 0x7F18FFB3;
        try {
            arg8.jg(arg9);
            int v0 = client.ja * -900939569;
            hw[] v9 = client.jf;
            hw v1 = new hw();
            v9[v0] = v1;
            gu.jg = v1;
            v1.ak = 0xE1684B9B * v0;
            arg9 = arg8.jo(30, 0xB648B8A1);
            v1.dc[0] = (arg9 >> 14 & 0x3FFF) - ad.fi * 474770003;
            v1.bp = ((v1.dc[0] << 7) + (v1.ad(0xCBF5CAC1) << 6)) * 0x3CF9F82B;
            v1.dj[0] = (arg9 & 0x3FFF) - nr.fo * 0x519F9BE7;
            v1.bw = ((v1.dj[0] << 7) + (v1.ad(0xCBF5CAC1) << 6)) * -410326251;
            int v2 = (((byte)(arg9 >> 28))) * 0x491DBAEF;
            v1.as = v2;
            kt.jz = v2 * 1904695735;
            if(ho.an[v0] != null) {
                v1.ax(ho.an[v0], 0x3569A4F7);
            }

            ho.ap = 0;
            int[] v9_1 = ho.aj;
            int v1_1 = ho.ap + 0x5F01EAD5;
            ho.ap = v1_1;
            v9_1[v1_1 * 0x474DFE7D - 1] = v0;
            ho.ae[v0] = 0;
            ho.ad = 0;
            for(arg9 = 1; arg9 < 0x800; ++arg9) {
                if(v0 == arg9) {
                }
                else {
                    v1_1 = arg8.jo(18, 0xB730BC31);
                    ho.ab[arg9] = (v1_1 >> 16 << 28) + ((v1_1 >> 8 & 597) << 14) + (v1_1 & 597);
                    ho.af[arg9] = 0;
                    ho.ai[arg9] = -1;
                    int[] v1_2 = ho.aq;
                    int v3 = ho.ad - 0x20DE855;
                    ho.ad = v3;
                    v1_2[v3 * 0x24902B03 - 1] = arg9;
                    ho.ae[arg9] = 0;
                }
            }

            arg8.ju(1213160008);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9_2 = new StringBuilder();
            v9_2.append("am.ax(");
            v9_2.append(')');
            throw lx.al(((Throwable)v8), v9_2.toString());
        }
    }

    public boolean ax(byte arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("am.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

