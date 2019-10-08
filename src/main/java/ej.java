public class ej {
    static final int ab = 8;
    public static final ej ae;
    public static final ej al;
    public static final ej ax;

    static {
        ej.ax = new ej();
        ej.al = new ej();
        ej.ae = new ej();
    }

    ej() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ej.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

