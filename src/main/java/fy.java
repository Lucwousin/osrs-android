public abstract class fy {
    public static final String af = "gscD0G";
    public static final int aj = 0x500;
    static final int ak = 1000;
    public static final int am = 17;
    protected fk ax;
    static final int bp = 4;
    static ef[] ej;
    static int hd;
    static int pl;
    static lv rk;

    protected fy() {
        try {
            super();
            this.ax = new fv();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fy.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void ae(fk arg1) {
        if(arg1 != null) {
            this.ax = arg1;
            return;
        }

        throw new NullPointerException();
    }

    protected final long al(int arg3) {
        arg3 = 0x2076E2C1;
        try {
            return ji.ax(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fy.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected final long an() {
        return ji.ax(0x2076E2C1);
    }

    protected final long ap() {
        return ji.ax(0x2076E2C1);
    }

    protected final long ar() {
        return ji.ax(0x2076E2C1);
    }

    public void ax(fk arg2, byte arg3) {
        if(arg2 == null) {
            goto label_3;
        }

        try {
            this.ax = arg2;
            return;
        label_3:
            throw new NullPointerException();
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fy.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void gj(ar[] arg5, int arg6, int arg7) {
        iw v1_1;
        arg7 = 0;
        try {
            while(true) {
            label_1:
                if(arg7 >= arg5.length) {
                    return;
                }

                ar v0 = arg5[arg7];
                if(v0 == null) {
                }
                else {
                    int v2 = 971580097;
                    if(v0.ay * 0x4A7987DB == 0) {
                        if(v0.fr != null) {
                            fy.gj(v0.fr, arg6, -709372776);
                        }

                        mx v1 = client.ky.ax(((long)(v0.ah * v2)));
                        if(v1 == null) {
                            goto label_27;
                        }

                        ek.ga(((if)v1).ax * 0x199DF2C5, arg6, 0x7F8E4935);
                    }

                label_27:
                    if(arg6 == 0 && v0.fh != null) {
                        v1_1 = new iw();
                        v1_1.ae = v0;
                        v1_1.ax = v0.fh;
                        bv.ax(v1_1, 0xCB72750B);
                    }

                    if(1 != arg6) {
                        break;
                    }

                    if(v0.fl == null) {
                        break;
                    }

                    int v3 = 990760021;
                    if(v0.at * v3 >= 0) {
                        ar v1_2 = bl.al(v0.ah * v2, 0x64D7CF4D);
                        if(v1_2 == null) {
                            break;
                        }
                        else if(v1_2.fr == null) {
                            break;
                        }
                        else if(v0.at * v3 >= v1_2.fr.length) {
                            break;
                        }
                        else if(v1_2.fr[v0.at * v3] != v0) {
                            break;
                        }
                    }

                    v1_1 = new iw();
                    v1_1.ae = v0;
                    v1_1.ax = v0.fl;
                    bv.ax(v1_1, -1180127701);
                }

                break;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("fy.gj(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        ++arg7;
        goto label_1;
    }
}

