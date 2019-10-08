public class dz implements lh {
    public static final int aa = 14;
    static final dz ae;
    static kp ai;
    static final dz al;
    final int an;
    public final int ar;
    static final dz ax;

    static {
        dz.ax = new dz(2, 0);
        dz.al = new dz(1, 1);
        dz.ae = new dz(0, 2);
    }

    dz(int arg2, int arg3) {
        try {
            super();
            this.ar = arg2 * 0x4FF0D143;
            this.an = arg3 * 0x3221F9E9;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dz.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static dz[] ae() {
        return new dz[]{dz.ae, dz.al, dz.ax};
    }

    public static ek al(int arg1, int arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 >= ek.al.length) {
                }
                else {
                    return ek.al[arg1];
                }

            label_8:
                return ek.ae;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dz.al(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }

        goto label_8;
    }

    static dz[] an() {
        return new dz[]{dz.ae, dz.al, dz.ax};
    }

    static dz[] ap() {
        return new dz[]{dz.ae, dz.al, dz.ax};
    }

    static final void aq(String arg2, int arg3) {
        arg3 = 30;
        try {
            ib.al(arg3, "", arg2, -601111684);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dz.aq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ar() {
        return this.an * 60714585;
    }

    public int ax(int arg3) {
        arg3 = 60714585;
        try {
            return this.an * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dz.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

