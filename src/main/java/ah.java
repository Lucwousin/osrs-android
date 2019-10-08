import java.util.Map;

public abstract class ah {
    public au ac;
    static final String ag = "m=account-creation/g=oldscape/create_account?mod=os-mobile&ssl=1&dest=";
    static final String ah = "/mobile/play";
    public boolean ak;
    protected boolean ao;
    public am as;
    protected final String at;
    protected final String aw;
    protected final String ay;
    protected boolean ba;
    public au bd;
    static final int bg = 12;
    public static final int br = 57;
    public static final int bt = 36;
    public static final int cx = 1005;
    static final int ei = 0x31C3E7;

    protected ah(String arg3, String arg4, String arg5) {
        try {
            super();
            this.ao = false;
            this.ak = false;
            this.ac = au.ax;
            this.bd = au.ax;
            this.ba = false;
            this.at = arg3;
            this.ay = arg4;
            this.aw = arg5 + "m=account-creation/g=oldscape/create_account?mod=os-mobile&ssl=1&dest=" + "/mobile/play";
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ah.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public abstract void aa(int arg1);

    public abstract void ab(int arg1);

    public abstract void ac(byte arg1);

    public boolean ad(int arg1) {
        return 0;
    }

    public abstract void ae(String arg1, String arg2, String arg3, String arg4, int arg5);

    public abstract void af(cf arg1, boolean arg2, int arg3);

    public abstract void ag(long arg1);

    public abstract void ah(String arg1, int arg2);

    public abstract void ai(int arg1, int arg2, int arg3);

    public abstract void aj(int arg1);

    public abstract void ak(byte arg1);

    public abstract void al(int arg1);

    public abstract void am(int arg1);

    static final boolean ao(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            int v0 = 1709601659;
            arg9 = bc.an * v0 + arg8;
            if(arg9 < arg2 && arg9 < arg3 && arg9 < arg4) {
                return 0;
            }

            arg9 = bc.an * v0 - arg8;
            if(arg9 > arg2 && arg9 > arg3 && arg9 > arg4) {
                return 0;
            }

            arg3 = 0xB0766F17;
            arg2 = bc.ar * arg3 + arg8;
            if(arg2 < arg5 && arg2 < arg6 && arg2 < arg7) {
                return 0;
            }

            arg2 = bc.ar * arg3 - arg8;
            if(arg2 <= arg5) {
                return 1;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ah.ao(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        if(arg2 > arg6 && arg2 > arg7) {
            return 0;
        }

        return 1;
    }

    public abstract void ao(int arg1);

    public static es ap(ko arg0, int arg1, int arg2, int arg3) {
        arg3 = 0xDEAF77BA;
        try {
            if(!au.at(arg0, arg1, arg2, arg3)) {
                return null;
            }

            return cw.ag(0x8B0FA29A);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ah.ap(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ap(int arg2) {
        try {
            if(hq.cg != null && hq.cg.length() > 0) {
                return;
            }

            if(li.rg.ap != null) {
                hq.cg = li.rg.ap;
                client.er = true;
            }
            else {
                client.er = false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ah.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public abstract void ap(byte arg1);

    public abstract void aq(int arg1);

    public abstract boolean ar(byte arg1);

    public abstract void as(String arg1, int arg2);

    public abstract void at(String arg1, Map arg2, int arg3);

    public abstract void au(int arg1);

    public abstract void av(int arg1);

    public abstract void aw(int arg1);

    public static final es ax(byte[] arg1, byte arg2) {
        int v2 = 0xD814C211;
        try {
            return am.abt(arg1, v2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ah.ax(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    public abstract boolean ax(int arg1);

    public abstract aa ay(int arg1);

    public abstract void az(String arg1, byte arg2);

    public abstract int ba(int arg1);

    static final int bb(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 * arg0 + arg3 * arg1 >> 16;
    }

    public abstract String bb(int arg1, int arg2, int arg3);

    public abstract String bc(int arg1, int arg2, int arg3);

    public abstract boolean bd(int arg1);

    public abstract void be(int arg1, int arg2);

    public abstract int bf(int arg1, int arg2);

    public abstract String bg(int arg1, int arg2, int arg3);

    public abstract String bh(int arg1, int arg2, int arg3);

    public abstract void bi(int arg1);

    public abstract boolean bj(int arg1);

    public abstract String bk(int arg1, int arg2, byte arg3);

    public abstract void bl(int arg1, int arg2);

    public abstract boolean bm(int arg1);

    public abstract int bn(int arg1, int arg2);

    public abstract int bo(int arg1, byte arg2);

    public abstract int bp(String arg1, byte arg2);

    public abstract String bq(int arg1, int arg2, byte arg3);

    public abstract int br(int arg1, int arg2);

    public abstract int bs(String arg1, String arg2, int arg3, int arg4, String arg5, int arg6, int arg7);

    public abstract boolean bt(int arg1, int arg2, int arg3);

    public abstract int bu(String arg1, String arg2, int arg3, int arg4, int arg5);

    public abstract String bv(int arg1, int arg2, int arg3);

    public abstract String bw(int arg1, byte arg2);

    public abstract String bx(int arg1, int arg2, int arg3);

    public abstract boolean by(int arg1, int arg2, int arg3);

    public abstract String bz(int arg1, int arg2, byte arg3);

    public abstract int ca(byte arg1);

    public abstract void cb();

    public abstract void cc();

    public abstract boolean cd();

    public abstract boolean ce();

    public abstract boolean cf();

    public abstract void cg();

    public abstract boolean ch();

    public abstract boolean ci();

    public abstract void ck();

    public abstract void cl();

    public abstract void cm();

    public abstract void co();

    public abstract void cp(String arg1, String arg2, String arg3, String arg4);

    public boolean cq() {
        return 0;
    }

    public abstract boolean cr();

    public abstract void ct();

    public abstract void cu();

    public boolean cv() {
        return 0;
    }

    public abstract void cw();

    public abstract boolean cx();

    public abstract void cy();

    public abstract void da(long arg1);

    public abstract void db(int arg1, int arg2);

    public abstract void dc();

    public abstract aa dd();

    public abstract void de();

    public abstract void df();

    public abstract aa dg();

    public abstract void dh(cf arg1, boolean arg2);

    public abstract void di(long arg1);

    public abstract void dj();

    public abstract void dk();

    public abstract void dl();

    public abstract void dm(int arg1, int arg2);

    public abstract void dn(String arg1);

    public abstract void do(String arg1);

    public abstract void dp(cf arg1, boolean arg2);

    public abstract void dq(String arg1, Map arg2);

    public abstract void dr(String arg1);

    public abstract void ds();

    public abstract void dt(String arg1, Map arg2);

    public abstract void du(int arg1, int arg2);

    public abstract void dv();

    public abstract void dw(cf arg1, boolean arg2);

    public abstract void dx(String arg1);

    public abstract void dy();

    public abstract void dz(long arg1);

    public abstract aa ea();

    public abstract int eb();

    public abstract int ec(int arg1);

    public abstract boolean ed();

    public abstract boolean ee();

    public abstract int ef(String arg1);

    public abstract void eg();

    public abstract int eh(int arg1);

    public abstract int ei(int arg1);

    public abstract void ej();

    public abstract aa ek();

    public abstract void el(String arg1);

    public abstract void em();

    public abstract void en(String arg1);

    public abstract int eo(String arg1);

    public abstract int ep(int arg1);

    public abstract void eq();

    public abstract void er();

    public abstract int es();

    public abstract String et(int arg1);

    public abstract void eu();

    public abstract void ev();

    public abstract void ew();

    public abstract int ex(int arg1);

    public abstract void ey();

    public abstract aa ez();

    public abstract int fa(int arg1);

    public abstract String fb(int arg1, int arg2);

    public abstract String fc(int arg1, int arg2);

    public abstract boolean fd(int arg1, int arg2);

    public abstract boolean fe(int arg1, int arg2);

    public abstract String ff(int arg1, int arg2);

    public abstract String fg(int arg1, int arg2);

    public abstract String fh(int arg1, int arg2);

    public abstract String fi(int arg1, int arg2);

    public abstract String fj(int arg1, int arg2);

    public abstract String fk(int arg1, int arg2);

    public abstract String fl(int arg1, int arg2);

    public abstract String fm(int arg1, int arg2);

    public abstract String fn(int arg1, int arg2);

    public abstract String fo(int arg1, int arg2);

    public abstract String fp(int arg1, int arg2);

    public abstract String fq(int arg1, int arg2);

    public abstract String fr(int arg1, int arg2);

    public abstract String fs(int arg1, int arg2);

    public abstract String ft(int arg1, int arg2);

    public abstract String fu(int arg1, int arg2);

    public abstract String fv(int arg1, int arg2);

    public abstract String fw(int arg1, int arg2);

    public abstract String fx(int arg1, int arg2);

    public abstract boolean fy(int arg1, int arg2);

    public abstract boolean fz(int arg1, int arg2);

    public abstract int ga(String arg1, String arg2, int arg3, int arg4);

    public abstract int gb(String arg1, String arg2, int arg3, int arg4, String arg5, int arg6);

    public abstract String gc(int arg1, int arg2);

    public abstract int gd();

    public abstract void ge();

    public abstract void gf();

    public abstract String gg(int arg1, int arg2);

    public abstract void gi(int arg1);

    public abstract int gj(String arg1, String arg2, int arg3, int arg4);

    public abstract void gk(int arg1);

    public abstract boolean gl();

    public abstract String gm(int arg1, int arg2);

    public abstract boolean gn();

    public abstract int go();

    public abstract void gr(int arg1);

    public abstract int gs(String arg1, String arg2, int arg3, int arg4);

    public abstract void gt(int arg1);

    public abstract boolean gu();

    public abstract void gv();

    public abstract int gw(int arg1);

    public abstract int gx(String arg1, String arg2, int arg3, int arg4, String arg5, int arg6);

    public abstract int gy(String arg1, String arg2, int arg3, int arg4, String arg5, int arg6);

    public abstract int gz(int arg1);

    public int ha() {
        return this.bd.ax(0x5854FFF6);
    }

    public abstract void hb();

    public abstract void hc();

    public void he(boolean arg1) {
        this.ba = arg1;
    }

    public boolean hf(byte arg1) {
        return 0;
    }

    public void hg(boolean arg2, int arg3) {
        try {
            this.ba = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ah.hg(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public abstract void hi();

    public boolean hk() {
        return 0;
    }

    public int hl() {
        return this.ac.ax(0xE9B321BE);
    }

    public int hn(int arg3) {
        try {
            return this.bd.ax(-1033342480);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ah.hn(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ho(boolean arg1) {
        this.ba = arg1;
    }

    public int hp() {
        return this.ac.ax(0x24E73847);
    }

    public int hq() {
        return this.ac.ax(0xEAB05CD3);
    }

    public int hr(int arg3) {
        try {
            return this.ac.ax(0x17502FFC);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ah.hr(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public am hs(int arg3) {
        try {
            return this.as;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ah.hs(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public am hu() {
        return this.as;
    }

    public am hw() {
        return this.as;
    }
}

