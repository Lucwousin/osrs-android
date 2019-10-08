public class kw extends eq {
    final boolean al;
    public static final int az = 9;

    public kw(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kw.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg4, ee arg5, byte arg6) {
        try {
            int v0 = 0x8076F529;
            int v2 = 0x297B4181;
            if(client.ae * v0 == arg4.an * v2 && arg5.an * v2 == client.ae * v0) {
                int v4_1 = this.al ? arg4.ap(0).ae(arg5.ap(0), -43) : arg5.ap(0).ae(arg4.ap(0), -77);
                return v4_1;
            }

            return this.al(((eg)arg4), ((eg)arg5), 53);
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("kw.ab(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 104);
    }

    int af(ee arg5, ee arg6) {
        int v1 = 0x8076F529;
        int v3 = 0x297B4181;
        if(client.ae * v1 == arg5.an * v3 && arg6.an * v3 == client.ae * v1) {
            int v5 = this.al ? arg5.ap(0).ae(arg6.ap(0), -38) : arg6.ap(0).ae(arg5.ap(0), -74);
            return v5;
        }

        return this.al(((eg)arg5), ((eg)arg6), 38);
    }

    int ai(ee arg4, ee arg5) {
        if(client.ae * 0x8076F529 == arg4.an * 606921624 && arg5.an * 1160255005 == client.ae * 0xEA729D23) {
            int v4 = this.al ? arg4.ap(0).ae(arg5.ap(0), -13) : arg5.ap(0).ae(arg4.ap(0), -27);
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), -102);
    }

    static void aj(byte arg2) {
        try {
            if(!eo.aq) {
                return;
            }

            hq.af = null;
            in.ai = null;
            hq.av = null;
            li.aa = null;
            ox.ag = null;
            hq.ah = null;
            gn.at = null;
            ax.ay = null;
            bz.aw = null;
            oa.as = null;
            aw.er = null;
            nc.eq = null;
            fy.ej = null;
            gy.em = null;
            dy.ey = null;
            cl.ac.al(0x4BB2A06);
            jj.ad(2, 1081428072);
            md.al(true, 0xFF00FF00);
            hq.dv = "";
            hq.da = 633703253;
            hq.df = false;
            eo.aq = false;
            hq.fz.ar(-2031605090);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kw.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 30);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 33);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("kw.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

