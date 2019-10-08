import java.util.Collection;

public class fh {
    final int ab;
    static final fh ad;
    static final fh ae;
    static final fh aj;
    static final fh al;
    static final fh an;
    static final fh ap;
    static final fh aq;
    static final fh ar;
    static final fh ax;
    static lx fz;
    public static fw kf;

    static {
        fh.ax = new fh(5);
        fh.al = new fh(8);
        fh.ae = new fh(0);
        fh.ar = new fh(1);
        fh.an = new fh(4);
        fh.ap = new fh(2);
        fh.aj = new fh(6);
        fh.ad = new fh(7);
        fh.aq = new fh(3);
    }

    fh(int arg3) {
        try {
            super();
            this.ab = arg3 * 0x40F07589;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fh.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static void aj(Collection arg1, int arg2) {
        try {
            arg1.add(dc.al);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fh.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static int ct(int arg2) {
        try {
            if(!client.ns) {
                return 1;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fh.ct(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        return 2;
    }
}

