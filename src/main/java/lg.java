import java.util.HashSet;
import java.util.Set;

public class lg implements lh {
    final int aa;
    static final lg ab = null;
    static final lg ad = null;
    static final lg ae = null;
    static final lg af = null;
    static final lg ai = null;
    static final lg aj = null;
    static final lg al = null;
    static final lg an = null;
    static final lg ap = null;
    static final lg aq = null;
    static final lg ar = null;
    static final int as = 2;
    final Set au;
    static final lg av = null;
    static final lg ax = null;
    static final int cs = 2;
    static short[] rp = null;
    static final int sv = 97;

    static {
        lg.ax = new lg("", 0, new lt[]{lt.ae});
        lg.al = new lg("", 1, new lt[]{lt.al, lt.ae});
        lg.ae = new lg("", 2, new lt[]{lt.al, lt.ax, lt.ae});
        lg.ar = new lg("", 3, new lt[]{lt.al});
        lg.an = new lg("", 4);
        lg.ap = new lg("", 5, new lt[]{lt.al, lt.ae});
        lg.aj = new lg("", 6, new lt[]{lt.ae});
        lg.ad = new lg("", 8, new lt[]{lt.al, lt.ae});
        lg.aq = new lg("", 9, new lt[]{lt.al, lt.ax});
        lg.ab = new lg("", 10, new lt[]{lt.al});
        lg.af = new lg("", 11, new lt[]{lt.al});
        lg.ai = new lg("", 12, new lt[]{lt.al, lt.ae});
        lg.av = new lg("", 13, new lt[]{lt.al});
        lg.al(0xDE89615E);
    }

    lg(String arg2, int arg3, lt[] arg4) {
        try {
            super();
            this.au = new HashSet();
            this.aa = arg3 * 0x33A0FAC5;
            int v2_1;
            for(v2_1 = 0; v2_1 < arg4.length; ++v2_1) {
                this.au.add(arg4[v2_1]);
            }
        }
        catch(RuntimeException v2) {
            goto label_18;
        }

        return;
    label_18:
        StringBuilder v3 = new StringBuilder();
        v3.append("lg.<init>(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    lg(String arg2, int arg3) {
        try {
            super();
            this.au = new HashSet();
            this.aa = arg3 * 0x33A0FAC5;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lg.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static lg[] ae() {
        return new lg[]{lg.aq, lg.ar, lg.aj, lg.al, lg.an, lg.av, lg.ax, lg.ap, lg.ae, lg.af, lg.ab, lg.ad, lg.ai};
    }

    static lg[] al(int arg2) {
        arg2 = 13;
        try {
            lg[] v2_1 = new lg[arg2];
            v2_1[0] = lg.aq;
            v2_1[1] = lg.ar;
            v2_1[2] = lg.aj;
            v2_1[3] = lg.al;
            v2_1[4] = lg.an;
            v2_1[5] = lg.av;
            v2_1[6] = lg.ax;
            v2_1[7] = lg.ap;
            v2_1[8] = lg.ae;
            v2_1[9] = lg.af;
            v2_1[10] = lg.ab;
            v2_1[11] = lg.ad;
            v2_1[12] = lg.ai;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lg.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static lg[] an() {
        return new lg[]{lg.aq, lg.ar, lg.aj, lg.al, lg.an, lg.av, lg.ax, lg.ap, lg.ae, lg.af, lg.ab, lg.ad, lg.ai};
    }

    static lg[] ap() {
        return new lg[]{lg.aq, lg.ar, lg.aj, lg.al, lg.an, lg.av, lg.ax, lg.ap, lg.ae, lg.af, lg.ab, lg.ad, lg.ai};
    }

    public int ar() {
        return this.aa * 0x69153BDE;
    }

    public int ax(int arg3) {
        try {
            return this.aa * 1300919309;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lg.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

