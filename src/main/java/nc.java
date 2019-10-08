public abstract class nc {
    static final int aj = 0x100;
    static final int ap = 0xFFFFFF;
    public static final int av = 0x800;
    static final int bm = 25;
    static ef[] eq;

    nc() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static Object aa(byte[] arg2, boolean arg3) {
        if(arg2 == null) {
            return null;
        }

        if(arg2.length > 0x88) {
            nq v3 = new nq();
            ((nc)v3).al(arg2, 0xFD23BD25);
            return v3;
        }

        if(arg3) {
            return co.ai(arg2, 0xF34207BB);
        }

        return arg2;
    }

    abstract void ad(byte[] arg1);

    abstract byte[] ae();

    static byte[] ag(byte[] arg3) {
        int v0 = arg3.length;
        byte[] v1 = new byte[v0];
        System.arraycopy(arg3, 0, v1, 0, v0);
        return v1;
    }

    static byte[] ah(byte[] arg3) {
        int v0 = arg3.length;
        byte[] v1 = new byte[v0];
        System.arraycopy(arg3, 0, v1, 0, v0);
        return v1;
    }

    abstract void aj(byte[] arg1);

    abstract void al(byte[] arg1, int arg2);

    public static byte[] am(Object arg1, boolean arg2) {
        if(arg1 == null) {
            return null;
        }

        if((arg1 instanceof byte[])) {
            if(arg2) {
                return co.ai(((byte[])arg1), 0x35A3318B);
            }

            return arg1;
        }

        if((arg1 instanceof nc)) {
            return ((nc)arg1).ax(0xF8D672F1);
        }

        throw new IllegalArgumentException();
    }

    abstract byte[] an();

    abstract byte[] ap();

    abstract void aq(byte[] arg1);

    abstract byte[] ar();

    public static byte[] au(Object arg1, boolean arg2) {
        if(arg1 == null) {
            return null;
        }

        if((arg1 instanceof byte[])) {
            if(arg2) {
                return co.ai(((byte[])arg1), 0x33F88E64);
            }

            return arg1;
        }

        if((arg1 instanceof nc)) {
            return ((nc)arg1).ax(0xF8D672F1);
        }

        throw new IllegalArgumentException();
    }

    public static Object av(byte[] arg2, boolean arg3) {
        if(arg2 == null) {
            return null;
        }

        if(arg2.length > 2027387047) {
            nq v3 = new nq();
            ((nc)v3).al(arg2, 0xFD23BD25);
            return v3;
        }

        if(arg3) {
            return co.ai(arg2, 0x2A01E379);
        }

        return arg2;
    }

    abstract byte[] ax(int arg1);

    public static byte[] az(Object arg1, boolean arg2) {
        if(arg1 == null) {
            return null;
        }

        if((arg1 instanceof byte[])) {
            if(arg2) {
                return co.ai(((byte[])arg1), 0x30DAEA0E);
            }

            return arg1;
        }

        if((arg1 instanceof nc)) {
            return ((nc)arg1).ax(0xF8D672F1);
        }

        throw new IllegalArgumentException();
    }
}

