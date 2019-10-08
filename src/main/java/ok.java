public class ok implements lh {
    public static final ok ae;
    public static final ok al;
    public final int an;
    final int ap;
    public static final ok ar;
    public static final ok ax;

    static {
        ok.ax = new ok(2, 0);
        ok.al = new ok(3, 1);
        ok.ae = new ok(1, 2);
        ok.ar = new ok(0, 3);
    }

    ok(int arg2, int arg3) {
        try {
            super();
            this.an = arg2 * 0x33582A03;
            this.ap = arg3 * 0xC6743C05;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ok.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static do al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = do.ar.ax(v0);
            if(v5 != null) {
                return ((do)v5);
            }

            byte[] v5_1 = do.al.ae(6, arg4, 0x78DC0DC9);
            do v2 = new do();
            v2.aq = arg4 * 0xD271CCBD;
            if(v5_1 != null) {
                v2.ar(new lq(v5_1), 0xDFA20B29);
            }

            v2.ae(0x6164890F);
            if(v2.bh) {
                v2.ah = 0;
                v2.at = false;
            }

            do.ar.ae(((mv)v2), v0);
            return v2;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("ok.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public static int aq(CharSequence arg4, int arg5) {
        int v1;
        try {
            arg5 = arg4.length();
            int v0 = 0;
            v1 = 0;
            while(v0 < arg5) {
                v1 = je.ax(arg4.charAt(v0), 1511582370) + ((v1 << 5) - v1);
                ++v0;
            }
        }
        catch(RuntimeException v4) {
            goto label_15;
        }

        return v1;
    label_15:
        StringBuilder v5 = new StringBuilder();
        v5.append("ok.aq(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public int ar() {
        return this.ap * 0xDEF30CD;
    }

    public int ax(int arg3) {
        arg3 = 0xDEF30CD;
        try {
            return this.ap * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ok.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

