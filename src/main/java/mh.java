public class mh {
    static final mh ae;
    public static final mh al;
    public static final mh an;
    public final int ap;
    public static final mh ar;
    public static final mh ax;

    static {
        mh.ax = new mh(4);
        mh.al = new mh(1);
        mh.ae = new mh(2);
        mh.ar = new mh(0);
        mh.an = new mh(3);
    }

    mh(int arg3) {
        try {
            super();
            this.ap = arg3 * -677023809;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("mh.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

