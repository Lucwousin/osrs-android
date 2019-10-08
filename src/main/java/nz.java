import java.util.Comparator;

final class nz implements Comparator {
    public static final int az = 17;

    nz() {
        super();
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0x78FBEE6C);
    }

    int ae(nu arg4, nu arg5) {
        int v4;
        int v1 = 0x8D921141;
        if(arg4.ae.ar * v1 < arg5.ae.ar * v1) {
            v4 = -1;
        }
        else if(arg4.ae.ar * v1 == arg5.ae.ar * v1) {
            v4 = 0;
        }
        else {
            v4 = 1;
        }

        return v4;
    }

    int al(nu arg5, nu arg6) {
        int v5;
        int v1 = 0x8D921141;
        if(arg5.ae.ar * v1 < arg6.ae.ar * 0xDF59A54B) {
            v5 = -1;
        }
        else if(arg5.ae.ar * v1 == arg6.ae.ar * 0x2FE706B7) {
            v5 = 0;
        }
        else {
            v5 = 1;
        }

        return v5;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0xDB62C40E);
    }

    int ax(nu arg3, nu arg4, int arg5) {
        int v3_1;
        try {
            int v0 = 0x8D921141;
            if(arg3.ae.ar * v0 < arg4.ae.ar * v0) {
                v3_1 = -1;
            }
            else {
                if(arg3.ae.ar * v0 != arg4.ae.ar * v0) {
                    return 1;
                }

                return 0;
            }

            return v3_1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("nz.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return 0;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((nu)arg2), ((nu)arg3), 0xBF6041B4);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nz.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("nz.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }
}

