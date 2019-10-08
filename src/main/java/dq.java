import java.util.Collection;

public class dq extends mv {
    static gk ae = null;
    static kd ag = null;
    public static int al = 0;
    public int ar;
    static ko ax = null;
    static or ck = null;
    public static final int cm = 97;
    static lw eb;
    static od fl;
    static int gn;
    static me mc;
    public static int tv;

    static {
        dq.ae = new gk(0x40, null);
    }

    dq() {
        try {
            super();
            this.ar = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg2, int arg3) {
        if(5 == arg3) {
            this.ar = arg2.ao(0x3E2FEE6E) * 0x2C700A45;
        }
    }

    void ab(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-65);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -15);
        }
    }

    public static void ad(ko arg2) {
        dq.ax = arg2;
        dq.al = dq.ax.au(16, 0x9F4218CF) * 0x91A3005F;
    }

    void ae(lq arg2, byte arg3) {
        while(true) {
            arg3 = -98;
            try {
                int v3 = arg2.ay(arg3);
                if(v3 == 0) {
                    return;
                }

                this.ar(arg2, v3, -76);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dq.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void af(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-95);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -55);
        }
    }

    void ai(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-128);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -105);
        }
    }

    public static void aj(ko arg2) {
        dq.ax = arg2;
        dq.al = dq.ax.au(16, 1880906648) * 0xE002BB93;
    }

    public static void am(Collection arg1) {
        arg1.add(dq.ae);
    }

    public static void ap(ko arg2) {
        dq.ax = arg2;
        dq.al = dq.ax.au(16, -1536906929) * 0xE002BB93;
    }

    public static dq aq(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dq.ae.ax(v1);
        if(v0 != null) {
            return ((dq)v0);
        }

        byte[] v5 = dq.ax.ae(16, arg5, 0x78DC0DC9);
        dq v0_1 = new dq();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -25);
        }

        dq.ae.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ar(lq arg1, int arg2, byte arg3) {
        if(5 == arg2) {
            arg2 = 1427802412;
            try {
                this.ar = arg1.ao(arg2) * 0x2C700A45;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dq.ar(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    void au(lq arg2, int arg3) {
        if(5 == arg3) {
            this.ar = arg2.ao(964044442) * 0x2C700A45;
        }
    }

    void av(lq arg2, int arg3) {
        if(5 == arg3) {
            this.ar = arg2.ao(1369820558) * 0x2C700A45;
        }
    }

    static es[] az(int arg10) {
        try {
            int v0 = 43536109;
            es[] v10_1 = new es[oi.ax * v0];
            dt.as(614279069);
            int v2;
            for(v2 = 0; v2 < oi.ax * v0; ++v2) {
                es v3 = new es();
                v10_1[v2] = v3;
                v3.ap = fe.al * 0x1AA9C99F;
                v3.aj = fe.ae * 0x5EBF2449;
                v3.ar = fe.ar[v2];
                v3.an = lk.an[v2];
                v3.al = fe.ap[v2];
                v3.ae = gu.aj[v2];
                int v4 = v3.ae * v3.al;
                byte[] v5 = nq.aq[v2];
                v3.ax = new int[v4];
                int v6;
                for(v6 = 0; v6 < v4; ++v6) {
                    v3.ax[v6] = jw.ad[v5[v6] & 0xFF];
                }
            }

            ey.ao(-1490897937);
            return v10_1;
        }
        catch(RuntimeException v10) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dq.az(");
            v0_1.append(')');
            throw lx.al(((Throwable)v10), v0_1.toString());
        }
    }

    public static void az(Collection arg1) {
        arg1.add(dq.ae);
    }
}

