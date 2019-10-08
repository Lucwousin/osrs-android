public class av {
    final boolean ae;
    public static final int al = 2;
    public static final int ap = 5;
    final int ar;
    public static final int ax = 1;
    static final int bm = 7;
    static int mk = 0;
    static final int ms = 0x1F;

    public av(boolean arg2, int arg3) {
        try {
            super();
            this.ae = arg2;
            this.ar = arg3 * 0x9F3564B5;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("av.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    protected static final void ada(int arg2) {
        ef[] v2 = null;
        try {
            bw.te = v2;
            li.tf = ((ef)v2);
            ii.ug = ((ef)v2);
            jz.us.av(-44);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("av.ada(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    static char ae(char arg2, byte arg3) {
        char v3 = 'E';
        if(0xC6 == arg2) {
            return v3;
        }

        char v1 = 'e';
        if(arg2 == 230) {
            return v1;
        }

        if(arg2 == 0xDF) {
            return 's';
        }

        if(338 == arg2) {
            return v3;
        }

        if(arg2 == 339) {
            return v1;
        }

        return 0;
    }

    public boolean ae() {
        return this.ae;
    }

    public int al(int arg3) {
        arg3 = 17263005;
        try {
            return this.ar * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("av.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean an() {
        return this.ae;
    }

    public int ap() {
        return this.ar * 17263005;
    }

    public boolean ar() {
        return this.ae;
    }

    public boolean ax(int arg3) {
        try {
            return this.ae;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("av.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void ih(int arg5) {
        try {
            if(dx.rj != null) {
                client.rr = client.bj * 0x301574D1;
                dx.rj.an(1545350621);
                arg5 = 0;
                while(true) {
                label_10:
                    if(arg5 < client.jf.length) {
                        if(client.jf[arg5] != null) {
                            dx.rj.ar((client.jf[arg5].bp * 0x914F0683 >> 7) + ad.fi * 474770003, nr.fo * 0x519F9BE7 + (client.jf[arg5].bw * 0xD19D0C3D >> 7), 0xD6B240BA);
                        }

                        goto label_39;
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v5) {
            goto label_44;
        }

    label_39:
        ++arg5;
        goto label_10;
    label_44:
        StringBuilder v0 = new StringBuilder();
        v0.append("av.ih(");
        v0.append(')');
        throw lx.al(((Throwable)v5), v0.toString());
    }
}

