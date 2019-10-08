public abstract class ld {
    public static final int aj = 260;
    public static final int aq = 37;

    ld() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ld.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static ld ae() {
        return new mk();
    }

    public abstract void al(int arg1);

    public abstract void an();

    public abstract void ap();

    public static ld ar() {
        return new mk();
    }
}

