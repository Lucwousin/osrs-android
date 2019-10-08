import java.util.Comparator;

public abstract class eq implements Comparator {
    Comparator ax;
    static final int jw = 0x800;

    protected eq() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("eq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    final void ae(Comparator arg3) {
        if(this.ax == null) {
            this.ax = arg3;
        }
        else if((this.ax instanceof eq)) {
            this.ax.ax(arg3, 0xFAF01545);
        }
    }

    protected final int aj(eg arg2, eg arg3) {
        if(this.ax == null) {
            return 0;
        }

        return this.ax.compare(arg2, arg3);
    }

    protected final int al(eg arg1, eg arg2, byte arg3) {
        try {
            if(this.ax == null) {
                return 0;
            }

            return this.ax.compare(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("eq.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    protected final int an(eg arg2, eg arg3) {
        if(this.ax == null) {
            return 0;
        }

        return this.ax.compare(arg2, arg3);
    }

    protected final int ap(eg arg2, eg arg3) {
        if(this.ax == null) {
            return 0;
        }

        return this.ax.compare(arg2, arg3);
    }

    final void ar(Comparator arg3) {
        if(this.ax == null) {
            this.ax = arg3;
        }
        else if((this.ax instanceof eq)) {
            this.ax.ax(arg3, 1445088693);
        }
    }

    public static void ax(int[] arg1, int[] arg2, int arg3) {
        if(arg1 != null) {
            if(arg2 == null) {
            }
            else {
                try {
                    hv.aj = arg1;
                    am.ad = new int[arg1.length];
                    md.aq = new byte[arg1.length][][];
                    int v1_1;
                    for(v1_1 = 0; v1_1 < hv.aj.length; ++v1_1) {
                        md.aq[v1_1] = new byte[arg2[v1_1]][];
                    }

                    return;
                label_21:
                    hv.aj = null;
                    am.ad = null;
                    md.aq = null;
                    return;
                }
                catch(RuntimeException v1) {
                    StringBuilder v2 = new StringBuilder();
                    v2.append("eq.ax(");
                    v2.append(')');
                    throw lx.al(((Throwable)v1), v2.toString());
                }
            }
        }

        goto label_21;
    }

    final void ax(Comparator arg2, int arg3) {
        try {
            if(this.ax == null) {
                this.ax = arg2;
            }
            else if((this.ax instanceof eq)) {
                this.ax.ax(arg2, 1016843342);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("eq.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void dh(String arg23, boolean arg24, int arg25) {
        String v0 = arg23;
        try {
            if(!client.jj) {
                return;
            }

            or v1 = client.al.adm(0x4F1A70A1);
            int v13 = v1.aq(0x6CFB901) + 4;
            int v14 = v1.ab(0x484C9098) + 4;
            int v15 = cn.fh.ap(v0, 0xFA);
            int v12 = cn.fh.aj(v0, 0xFA) * 13;
            fa v16 = client.al.uu.ax(0x16022802);
            int v11 = v13 - 4;
            int v10 = v14 - 4;
            int v2 = v15 + 8;
            int v1_1 = v12 + 8;
            v16.ar(v11, v10, v2, v1_1, 0, 2);
            v16.fz(v11, v10, v2, v1_1, 0xFFFFFF, -2100968746);
            int v3 = v13;
            int v22 = v13;
            v13 = v12;
            cn.fh.av(arg23, v3, v14, v15, v12, 0xFFFFFF, -1, 1, 1, 0, v16);
            ff.fh(v11, v10, v2, v1_1, 0x96C27F01);
            if(arg24) {
                client.al.uu.aj(0, 0, 1793205901);
            }
            else {
                ek.fl(v22, v14, v15, v13, -1940876305);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("eq.dh(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0_1), v1_2.toString());
        }
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("eq.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void fu(String arg1, int arg2, int arg3, int arg4) {
        arg4 = 0xFFFF00;
        int v0 = 0x18327E0E;
        try {
            gy.fb(arg1, arg2, arg3, arg4, v0);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("eq.fu(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }
}

