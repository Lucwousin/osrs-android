public class oo {
    final int al;
    static final oo ax = null;
    public static final int cx = 80;

    static {
        oo.ax = new oo(3);
    }

    oo(int arg3) {
        try {
            super();
            this.al = arg3 * 0x8A400951;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("oo.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

