import java.util.Locale;

@lf @lj public class ly implements lh {
    final int ab;
    final String ad;
    public static final ly ae = null;
    static final ly[] af = null;
    public static final int ai = 56;
    static final ly aj = null;
    static final ly al = null;
    static final ly an = null;
    public static final ly ap = null;
    final String aq;
    static final ly ar = null;
    public static final int au = 15;
    public static final ly ax = null;
    static final int bo = 7;
    static final int jp = 4;

    static {
        ly.ax = new ly("EN", "en", "English", lg.ax, 0, "GB");
        ly.al = new ly("DE", "de", "German", lg.ax, 1, "DE");
        ly.ae = new ly("FR", "fr", "French", lg.ax, 2, "FR");
        ly.ar = new ly("PT", "pt", "Portuguese", lg.ax, 3, "BR");
        ly.an = new ly("NL", "nl", "Dutch", lg.ar, 4, "NL");
        ly.ap = new ly("ES", "es", "Spanish", lg.ar, 5, "ES");
        ly.aj = new ly("ES_MX", "es-mx", "Spanish (Latin American)", lg.ax, 6, "MX");
        ly[] v0 = ly.al(0x7F05007B);
        ly.af = new ly[v0.length];
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v0.length) {
                return;
            }

            ly v2 = v0[v1];
            int v5 = 0x70E994F9;
            if(ly.af[v2.ab * v5] != null) {
                break;
            }

            ly.af[v2.ab * v5] = v2;
        }

        throw new IllegalStateException();
    }

    ly(String arg1, String arg2, String arg3, lg arg4, int arg5, String arg6) {
        try {
            super();
            this.ad = arg1;
            this.aq = arg2;
            this.ab = arg5 * 0x92CAED49;
            int v1_1 = 2;
            if(arg6 != null) {
                new Locale(arg2.substring(0, v1_1), arg6);
            }
            else {
                new Locale(arg2.substring(0, v1_1));
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ly.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final void ab(byte arg2) {
        try {
            dz.aq(gs.hi, 0x7F05002F);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ly.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    String ab() {
        return this.aq;
    }

    static ly[] ad() {
        return new ly[]{ly.aj, ly.ar, ly.ae, ly.al, ly.ax, ly.ap, ly.an};
    }

    String ae(int arg3) {
        try {
            return this.aq;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ly.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static ly af(int arg1) {
        if(arg1 >= 0) {
            if(arg1 >= ly.af.length) {
            }
            else {
                return ly.af[arg1];
            }
        }

        return null;
    }

    static ly[] aj() {
        return new ly[]{ly.aj, ly.ar, ly.ae, ly.al, ly.ax, ly.ap, ly.an};
    }

    static ly[] al(int arg2) {
        arg2 = 7;
        try {
            ly[] v2_1 = new ly[arg2];
            v2_1[0] = ly.aj;
            v2_1[1] = ly.ar;
            v2_1[2] = ly.ae;
            v2_1[3] = ly.al;
            v2_1[4] = ly.ax;
            v2_1[5] = ly.ap;
            v2_1[6] = ly.an;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ly.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static ly an(int arg1, byte arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 >= ly.af.length) {
                }
                else {
                    return ly.af[arg1];
                }
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("ly.an(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }

        return null;
    }

    static ly[] ap() {
        return new ly[]{ly.aj, ly.ar, ly.ae, ly.al, ly.ax, ly.ap, ly.an};
    }

    static ly[] aq() {
        return new ly[]{ly.aj, ly.ar, ly.ae, ly.al, ly.ax, ly.ap, ly.an};
    }

    public int ar() {
        return this.ab * 0x70E994F9;
    }

    public int ax(int arg3) {
        try {
            return this.ab * 0x70E994F9;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ly.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String hm() {
        return this.ae(0x467065D5).toLowerCase(Locale.ENGLISH);
    }

    public String hx() {
        return this.ae(-1305249356).toLowerCase(Locale.ENGLISH);
    }

    public String hz() {
        return this.ae(1722400554).toLowerCase(Locale.ENGLISH);
    }

    public String toString() {
        int v0 = 0x14E00EBE;
        try {
            return this.ae(v0).toLowerCase(Locale.ENGLISH);
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ly.toString(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }
}

