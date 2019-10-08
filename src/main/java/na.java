public class na extends mx {
    public lo ae;
    int al;
    static na[] an = null;
    static int ap = 0;
    public static final int aq = 20;
    public int ar;
    nf ax;
    public static final int bc = 55;

    static {
        na.an = new na[300];
        na.ap = 0;
    }

    na() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("na.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static na aa() {
        na v0 = ar.ax(0x90447785);
        v0.ax = null;
        v0.al = 0;
        v0.ae = new lo(5000);
        return v0;
    }

    public static na ab(nf arg4, ma arg5) {
        lo v4;
        na v0 = ar.ax(0x34411323);
        v0.ax = arg4;
        v0.al = arg4.dd * 293786055;
        int v2 = 0xC8D5BBB3;
        int v3 = 260;
        if(-1 == v0.al * v2) {
            v4 = new lo(v3);
            goto label_15;
        }
        else if(v0.al * v2 == -2) {
            v0.ae = new lo(10000);
        }
        else if(v0.al * v2 <= 18) {
            v0.ae = new lo(20);
        }
        else if(v0.al * v2 <= 98) {
            v4 = new lo(100);
        label_15:
            v0.ae = v4;
        }
        else {
            v0.ae = new lo(v3);
        }

        v0.ae.jj(arg5, 1);
        v0.ae.jw(v0.ax.dt * 0x48F52AE5, 582010480);
        v0.ar = 0;
        return v0;
    }

    static na ad() {
        int v1 = 1820781885;
        if(na.ap * v1 == 0) {
            return new na();
        }

        na[] v0 = na.an;
        int v2 = na.ap + 1513795051;
        na.ap = v2;
        return v0[v2 * v1];
    }

    public static na af(nf arg3, ma arg4) {
        lo v3;
        na v0 = ar.ax(0x400C1048);
        v0.ax = arg3;
        v0.al = arg3.dd * 293786055;
        int v2 = 0xC8D5BBB3;
        if(-1 == v0.al * v2) {
            v3 = new lo(0x72B70432);
            goto label_15;
        }
        else {
            if(v0.al * v2 == -2) {
                v3 = new lo(10000);
            }
            else if(v0.al * v2 <= 18) {
                v0.ae = new lo(20);
                goto label_47;
            }
            else if(v0.al * v2 <= 98) {
                v3 = new lo(100);
            }
            else {
                goto label_43;
            }

            v0.ae = v3;
            goto label_47;
        label_43:
            v3 = new lo(260);
        label_15:
            v0.ae = v3;
        }

    label_47:
        v0.ae.jj(arg4, 1);
        v0.ae.jw(v0.ax.dt * 0x48F52AE5, 582010480);
        v0.ar = 0;
        return v0;
    }

    public static na ai() {
        na v0 = ar.ax(0x1D7D4E22);
        v0.ax = null;
        v0.al = 0;
        v0.ae = new lo(5000);
        return v0;
    }

    static na aj() {
        int v1 = 1820781885;
        if(na.ap * v1 == 0) {
            return new na();
        }

        na[] v0 = na.an;
        int v2 = na.ap + 1513795051;
        na.ap = v2;
        return v0[v2 * v1];
    }

    public void am() {
        int v1 = 1820781885;
        if(na.ap * v1 >= na.an.length) {
            return;
        }

        na[] v0 = na.an;
        int v2 = na.ap - 1513795051;
        na.ap = v2;
        v0[v2 * v1 - 1] = this;
    }

    static na an() {
        if(na.ap * 1820781885 == 0) {
            return new na();
        }

        na[] v0 = na.an;
        int v1 = na.ap + 1513795051;
        na.ap = v1;
        return v0[v1 * 1942800420];
    }

    static na ap() {
        if(na.ap * -1032062691 == 0) {
            return new na();
        }

        na[] v0 = na.an;
        int v1 = na.ap + 1513795051;
        na.ap = v1;
        return v0[v1 * 0xE560D99B];
    }

    public static na aq(nf arg3, ma arg4) {
        na v0 = ar.ax(1590847275);
        v0.ax = arg3;
        v0.al = arg3.dd * 293786055;
        if(-1 == v0.al * 0xE68E3E5D) {
            v0.ae = new lo(1207003837);
        }
        else if(v0.al * 0xC8D5BBB3 == -2) {
            v0.ae = new lo(10000);
        }
        else if(v0.al * 675650372 <= 18) {
            v0.ae = new lo(20);
        }
        else if(v0.al * 0x9CA2FE30 <= 98) {
            v0.ae = new lo(0xB5DF9FD);
        }
        else {
            v0.ae = new lo(260);
        }

        v0.ae.jj(arg4, 1);
        v0.ae.jw(v0.ax.dt * -690403904, 582010480);
        v0.ar = 0;
        return v0;
    }

    public void ar(byte arg4) {
        try {
            int v0 = 1820781885;
            if(na.ap * v0 >= na.an.length) {
                return;
            }

            na[] v4_1 = na.an;
            int v1 = na.ap - 1513795051;
            na.ap = v1;
            v4_1[v1 * v0 - 1] = this;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("na.ar(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    public static na au() {
        na v0 = ar.ax(1937033702);
        v0.ax = null;
        v0.al = 0;
        v0.ae = new lo(5000);
        return v0;
    }

    public static na av() {
        na v0 = ar.ax(-716036449);
        v0.ax = null;
        v0.al = 0;
        v0.ae = new lo(-658027724);
        return v0;
    }

    public void az() {
        int v1 = 1820781885;
        if(na.ap * v1 >= na.an.length) {
            return;
        }

        na[] v0 = na.an;
        int v2 = na.ap - 1825105482;
        na.ap = v2;
        v0[v2 * v1 - 1] = this;
    }
}

