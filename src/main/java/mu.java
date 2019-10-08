public class mu {
    public final int ab;
    static final mu ad;
    public static final mu ae;
    public static final mu aj;
    public static final mu al;
    public static final mu an;
    public static final mu ap;
    static final mu aq;
    public static final mu ar;
    static final mu ax;
    static es ow;

    static {
        mu.ax = new mu(8, "crash");
        mu.al = new mu(0, "js5crc");
        mu.ae = new mu(2, "js5io");
        mu.ar = new mu(3, "js5connect");
        mu.an = new mu(6, "js5connect_full");
        mu.ap = new mu(7, "js5connect_outofdate");
        mu.aj = new mu(1, "invalidhost");
        mu.ad = new mu(4, "wrongjava");
        mu.aq = new mu(5, "alreadyloaded");
    }

    mu(int arg2, String arg3) {
        try {
            super();
            this.ab = arg2 * 0x40EAFA6F;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("mu.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

