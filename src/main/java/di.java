import java.util.Collection;

public class di extends mv {
    public int ae;
    static gk al;
    public int an;
    public int ar;
    static ko ax;
    static ar kx;

    static {
        di.al = new gk(0x40, null);
    }

    di() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("di.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final int aa(int arg4, int arg5, int arg6) {
        arg6 = 0xB135 + arg4;
        int v0 = 91923 + arg5;
        int v1 = 4;
        byte v2 = 16;
        try {
            arg4 = (((int)((((double)(dk.au(arg6, v0, v1, v2) - 0x80 + (dk.au(arg4 + 10294, 0x93BD + arg5, 2, v2) - 0x80 >> 1) + (dk.au(arg4, arg5, 1, v2) - 0x80 >> 2)))) * 0.3))) + 35;
            arg5 = 60;
            if(arg4 >= 10) {
                goto label_31;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("di.aa(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return 10;
    label_31:
        if(arg4 > arg5) {
            arg4 = 60;
        }

        return arg4;
    }

    void aa(lq arg2, int arg3) {
        if(1 == arg3) {
            this.ae = arg2.ao(0x80ED4DD) * 0xE573EF07;
            this.ar = arg2.ay(-79) * 0x6FFC11ED;
            this.an = arg2.ay(-108) * 0xD9A1284B;
        }
    }

    void ab(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-72);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 27);
        }
    }

    public static void ad(ko arg0) {
        di.ax = arg0;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -67;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, 6);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("di.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void af(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-4);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 13);
        }
    }

    void ai(lq arg2, int arg3) {
        if(1 == arg3) {
            this.ae = arg2.ao(0xF7F1A582) * 0xE573EF07;
            this.ar = arg2.ay(-128) * 0x99C19AD;
            this.an = arg2.ay(-103) * 0xD9A1284B;
        }
    }

    public static void aj(ko arg0) {
        di.ax = arg0;
    }

    public static dg al(int arg4, byte arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dg.ae.ax(v0);
            if(v5 != null) {
                return ((dg)v5);
            }

            byte[] v5_1 = dg.ax.ae(13, arg4, 0x78DC0DC9);
            dg v2 = new dg();
            v2.an = arg4 * 2020576363;
            if(v5_1 != null) {
                v2.ae(new lq(v5_1), 0xD554CF99);
            }

            dg.ae.ae(((mv)v2), v0);
            return v2;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("di.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public static pf al(int arg4, int arg5) {
        pf v1;
        int v0;
        arg5 = 0xA313CBC1;
        try {
            pf[] v5 = ck.ax(arg5);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= v5.length) {
                    return null;
                }

                v1 = v5[v0];
                if(arg4 != v1.ar * 0x9176C95F) {
                    goto label_11;
                }

                return v1;
            }
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        return v1;
    label_11:
        ++v0;
        goto label_3;
        return null;
    label_17:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("di.al(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    public static void am(Collection arg1) {
        arg1.add(di.al);
    }

    public static void ap(ko arg0) {
        di.ax = arg0;
    }

    public static di aq(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = di.al.ax(v1);
        if(v0 != null) {
            return ((di)v0);
        }

        byte[] v5 = di.ax.ae(14, arg5, 0x78DC0DC9);
        di v0_1 = new di();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0xE135E890);
        }

        di.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ar(lq arg2, int arg3, byte arg4) {
        if(1 == arg3) {
            arg3 = 1424784501;
            try {
                this.ae = arg2.ao(arg3) * 0xE573EF07;
                this.ar = arg2.ay(-114) * 0x6FFC11ED;
                this.an = arg2.ay(-114) * 0xD9A1284B;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("di.ar(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    public static void au(Collection arg1) {
        arg1.add(di.al);
    }

    void av(lq arg2, int arg3) {
        if(1 == arg3) {
            this.ae = arg2.ao(1690146529) * 0xE573EF07;
            this.ar = arg2.ay(-79) * 0x6FFC11ED;
            this.an = arg2.ay(-112) * 0xD9A1284B;
        }
    }
}

