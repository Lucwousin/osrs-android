import java.util.Collection;

public class dk extends mv {
    public int ae;
    public static final int aj = 16;
    static gk al = null;
    static final int ao = 2;
    static ko ax = null;
    public static final int ci = 0x3F3;

    static {
        dk.al = new gk(0x40, null);
    }

    dk() {
        try {
            super();
            this.ae = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dk.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-23);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -96);
        }
    }

    public static void ab(ko arg0) {
        dk.ax = arg0;
    }

    public static void ad(ko arg0) {
        dk.ax = arg0;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -86;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, -62);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dk.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public static dk af(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dk.al.ax(v1);
        if(v0 != null) {
            return ((dk)v0);
        }

        byte[] v5 = dk.ax.ae(5, arg5, 0x78DC0DC9);
        dk v0_1 = new dk();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0x3B0F3423);
        }

        dk.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static void ag(Collection arg1) {
        arg1.add(dk.al);
    }

    public static void ah(Collection arg1) {
        arg1.add(dk.al);
    }

    public static dk ai(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dk.al.ax(v1);
        if(v0 != null) {
            return ((dk)v0);
        }

        byte[] v5 = dk.ax.ae(5, arg5, 0x78DC0DC9);
        dk v0_1 = new dk();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -2028344595);
        }

        dk.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static void aj(ko arg0) {
        dk.ax = arg0;
    }

    static void al(int arg6, int arg7, int arg8) {
        arg8 = 4;
        try {
            int[] v0 = new int[arg8];
            int[] v1 = new int[arg8];
            int v2 = 0;
            v0[0] = arg6;
            v1[0] = arg7;
            int v3 = 1;
            while(v2 < arg8) {
                if(arg6 != ih.aq[v2]) {
                    v0[v3] = ih.aq[v2];
                    v1[v3] = ih.ad[v2];
                    ++v3;
                }

                ++v2;
            }

            ih.aq = v0;
            ih.ad = v1;
            df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, 0x9BA1FDD4);
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("dk.al(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    void am(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-40);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -49);
        }
    }

    public static void ap(ko arg0) {
        dk.ax = arg0;
    }

    public static void aq(ko arg0) {
        dk.ax = arg0;
    }

    static ef ar(ko arg0, int arg1, int arg2, byte arg3) {
        int v3 = 0xA0A4F3A6;
        try {
            if(!au.at(arg0, arg1, arg2, v3)) {
                return null;
            }

            return bp.am(-1);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dk.ar(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void ar(lq arg1, int arg2, byte arg3) {
        if(arg2 == 2) {
            arg2 = 0xAB6E4873;
            try {
                this.ae = arg1.ao(arg2) * 1801605041;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dk.ar(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    public static void at(Collection arg1) {
        arg1.add(dk.al);
    }

    static final int au(int arg5, int arg6, int arg7, byte arg8) {
        try {
            int v8 = arg5 / arg7;
            int v0 = arg7 - 1;
            arg5 &= v0;
            int v1 = arg6 / arg7;
            arg6 &= v0;
            v0 = it.az(v8, v1, 1658038540);
            int v2 = v8 + 1;
            int v3 = it.az(v2, v1, 0x19C06EAA);
            ++v1;
            return ag.am(ag.am(v0, v3, arg5, arg7, 0xA25F4A63), ag.am(it.az(v8, v1, 1501645932), it.az(v2, v1, -44911081), arg5, arg7, 0xA25F4A63), arg6, arg7, 0xA25F4A63);
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("dk.au(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void au(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-29);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -58);
        }
    }

    public static dk av(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dk.al.ax(v1);
        if(v0 != null) {
            return ((dk)v0);
        }

        byte[] v5 = dk.ax.ae(5, arg5, 0x78DC0DC9);
        dk v0_1 = new dk();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 2021310353);
        }

        dk.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static void aw(Collection arg1) {
        arg1.add(dk.al);
    }

    public static void ay(Collection arg1) {
        arg1.add(dk.al);
    }

    void az(lq arg2, int arg3) {
        if(arg3 == 2) {
            this.ae = arg2.ao(-1939467002) * 1801605041;
        }
    }

    static void ii(lq arg3, int arg4) {
        try {
            if(client.ey != null) {
                arg3.au(client.ey, 0, client.ey.length, -290165925);
                return;
            }

            byte[] v4 = em.ar(0xA516CA26);
            arg3.au(v4, 0, v4.length, -1053800987);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("dk.ii(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }
}

