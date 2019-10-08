public class of {
    of() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("of.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static final void ae(long arg4) {
        long v0 = 0;
        if(arg4 <= v0) {
            return;
        }

        if(v0 == arg4 % 10) {
            ju.al(arg4 - 1);
            ju.al(1);
        }
        else {
            ju.al(arg4);
        }
    }

    static final void an(long arg0) {
        try {
            Thread.sleep(arg0);
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    static final void ar(long arg0) {
        try {
            Thread.sleep(arg0);
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    public static int ax(int arg2, int arg3) {
        arg3 = 0x9265FB3;
        try {
            di v2_1 = bx.al(arg2, arg3);
            int v0 = v2_1.ae * 0xBF544EB7;
            arg3 = v2_1.ar * 0xF880F3E5;
            return an.ax[v2_1.an * -2086968989 - arg3] & an.ae[v0] >> arg3;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("of.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

