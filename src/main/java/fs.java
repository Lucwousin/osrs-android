public class fs implements lh {
    final int ad;
    static final fs ae = null;
    public final String aj;
    static final fs al = null;
    static final fs an = null;
    public static final fs ap = null;
    static final fs ar = null;
    static final fs ax = null;
    public static final int bf = 29;
    static ht pt;

    static {
        fs.ax = new fs("runescape", "RuneScape", 0);
        fs.al = new fs("stellardawn", "Stellar Dawn", 1);
        fs.ae = new fs("game3", "Game 3", 2);
        fs.ar = new fs("game4", "Game 4", 3);
        fs.an = new fs("game5", "Game 5", 4);
        fs.ap = new fs("oldscape", "RuneScape 2007", 5);
    }

    fs(String arg1, String arg2, int arg3) {
        try {
            super();
            this.aj = arg1;
            this.ad = arg3 * 0x19F75F17;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fs.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static fs[] ae() {
        return new fs[]{fs.ae, fs.al, fs.ap, fs.an, fs.ar, fs.ax};
    }

    public static df al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = df.ar.ax(v0);
            if(v5 != null) {
                return ((df)v5);
            }

            byte[] v4_1 = df.ax.ae(12, arg4, 0x78DC0DC9);
            df v5_1 = new df();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 0x7D);
            }

            v5_1.an(0xD09DDF6D);
            df.ar.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("fs.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public static fs[] an() {
        return new fs[]{fs.ae, fs.al, fs.ap, fs.an, fs.ar, fs.ax};
    }

    public static fs[] ap() {
        return new fs[]{fs.ae, fs.al, fs.ap, fs.an, fs.ar, fs.ax};
    }

    public int ar() {
        return this.ad * 0xEBC1C8A7;
    }

    public int ax(int arg3) {
        arg3 = 0xEBC1C8A7;
        try {
            return this.ad * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fs.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void bc(int arg4) {
        try {
            client.al.aba(0x74640CCC).gj("cgs2K0", 0xED09EF8B);
            hq.cm = 0x98AE105B;
            ax.bf(gs.kc, gs.ks, gs.kt, 0x63D3C206);
            ah v4_1 = client.al.aba(0x8D2F4DF3).bh(1953843077);
            int v0 = 0x7FCD6E81;
            if(v4_1 != null) {
                hp.ea.ah(null, v0);
                v4_1.aj(0x8FE10F52);
            }
            else {
                hp.ea.ah(new av(false, 2), v0);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("fs.bc(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    public static final int ef(int arg2) {
        try {
            return client.eg * 359080599;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fs.ef(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

