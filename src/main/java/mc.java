public class mc {
    static final int aj = 0xFFFF00;
    public static final int au = 19;
    static final int ax = 0;
    public static final int bo = 2;

    static {
    }

    mc() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

