public class bz {
    int ae;
    static final int ak = 1;
    int al;
    static ef aw = null;
    int ax;
    public static final int bb = 54;

    bz() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static na ae(byte arg2) {
        int v2 = 0x26618595;
        try {
            na v2_2 = ar.ax(v2);
            v2_2.ax = null;
            v2_2.al = 0;
            v2_2.ae = new lo(5000);
            return v2_2;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bz.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    static void bb(byte arg3) {
        try {
            client.al.aba(0x45A9AD47).gj("cgcPRM", 931026660);
            hq.cm = 1857310067;
            ax.bf(gs.km, gs.ko, gs.ki, 0x63D3C206);
            ah v3_1 = client.al.aba(0x38528717).bh(0x51BF5EA9);
            if(v3_1 == null || !v3_1.hf(-116)) {
                hp.ea.az(new ag(false, 3), -25);
            }
            else {
                hp.ea.az(null, -58);
                v3_1.ap(-113);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bz.bb(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int ea(int arg3, int arg4, int arg5) {
        arg4 += -334;
        arg5 = 100;
        if(arg4 < 0) {
            arg4 = 0;
        }
        else if(arg4 > arg5) {
            arg4 = 100;
        }

        try {
            return (client.qx + arg4 * (client.qf - client.qx) / arg5) * arg3 / 0x100;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("bz.ea(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

