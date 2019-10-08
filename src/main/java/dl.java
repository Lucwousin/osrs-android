public class dl implements lh {
    static final dl ae = null;
    static final dl al = null;
    final int an;
    public static final int ap = 0x400;
    public final int ar;
    static final dl ax = null;
    static String cn = null;
    static final int dr = 1;
    static int fb;
    static int ld;

    static {
        dl.ax = new dl(0, 0);
        dl.al = new dl(2, 1);
        dl.ae = new dl(1, 2);
    }

    dl(int arg2, int arg3) {
        try {
            super();
            this.ar = arg2 * -1887583005;
            this.an = arg3 * 0xE2E72571;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dl.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static pb ab(int arg2) {
        try {
            return bu.rt;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dl.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static ef[] ad(ko arg0, String arg1, String arg2, int arg3) {
        arg3 = 0xD4A3E869;
        try {
            int v1 = arg0.ay(arg1, arg3);
            return hl.al(arg0, v1, arg0.aw(v1, arg2, 0xB795E4FB), 628538810);
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("dl.ad(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static dl[] ae() {
        return new dl[]{dl.ax, dl.ae, dl.al};
    }

    static dl[] an() {
        return new dl[]{dl.ax, dl.ae, dl.al};
    }

    static dl[] ap() {
        return new dl[]{dl.ax, dl.ae, dl.al};
    }

    public int ar() {
        return this.an * 0x483EFB91;
    }

    public int ax(int arg3) {
        arg3 = 0x483EFB91;
        try {
            return this.an * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dl.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

