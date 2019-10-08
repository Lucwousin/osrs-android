public class nl implements ne {
    public static final int ad = 17;
    public static final nl ae = null;
    static final int ag = 2340;
    static final nl[] aj;
    static final nl al;
    static final nl an;
    public final int ap;
    public static final nl ar;
    public static final nl ax;

    static {
        int v1 = 0;
        nl.ax = new nl(14, 0);
        nl.al = new nl(15, 4);
        nl.ae = new nl(16, -2);
        nl.ar = new nl(18, -2);
        nl.an = new nl(27, 0);
        nl.aj = new nl[0x20];
        nl[] v0 = kq.ax(0x466F4D2A);
        while(v1 < v0.length) {
            nl.aj[v0[v1].ap * 0x319B167F] = v0[v1];
            ++v1;
        }
    }

    nl(int arg2, int arg3) {
        try {
            super();
            this.ap = arg2 * -1094014593;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nl.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static nl[] ae() {
        return new nl[]{nl.an, nl.al, nl.ar, nl.ae, nl.ax};
    }

    static nl[] al() {
        return new nl[]{nl.an, nl.al, nl.ar, nl.ae, nl.ax};
    }

    static nl[] ar() {
        return new nl[]{nl.an, nl.al, nl.ar, nl.ae, nl.ax};
    }
}

