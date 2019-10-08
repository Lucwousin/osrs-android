public class af {
    public int ae;
    static final int ag = 10;
    public int al;
    static final int as = 0x124010E;
    public int ax;
    static final int bm = 5;
    public static final int cd = 1003;

    public af(int arg3) {
        try {
            super();
            if(arg3 == -1) {
                this.ax = -1489205097;
            }
            else {
                this.ax = (arg3 >> 28 & 3) * 1489205097;
                this.al = (arg3 >> 14 & 0x3FFF) * -1712566901;
                this.ae = (arg3 & 0x3FFF) * 0xF78FB72D;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("af.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public af(int arg2, int arg3, int arg4) {
        try {
            super();
            this.ax = arg2 * 1489205097;
            this.al = arg3 * -1712566901;
            this.ae = arg4 * 0xF78FB72D;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("af.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public af(af arg3) {
        try {
            super();
            this.ax = arg3.ax;
            this.al = arg3.al;
            this.ae = arg3.ae;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("af.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    String ab(String arg5) {
        return this.ax * 400591065 + arg5 + (this.al * 0xAEACF223 >> 6) + arg5 + (this.ae * 0xB230B0A5 >> 6) + arg5 + (this.al * 0xAEACF223 & 0x3F) + arg5 + (this.ae * 0xB230B0A5 & 0x3F);
    }

    boolean ad(af arg5) {
        if(this.ax * -2066392461 != arg5.ax * 400591065) {
            return 0;
        }

        if(arg5.al * 0xAEACF223 != this.al * 0xAEACF223) {
            return 0;
        }

        if(this.ae * 0xB230B0A5 != arg5.ae * -1031945348) {
            return 0;
        }

        return 1;
    }

    String ae(String arg4, int arg5) {
        try {
            return this.ax * 400591065 + arg4 + (this.al * 0xAEACF223 >> 6) + arg4 + (this.ae * 0xB230B0A5 >> 6) + arg4 + (this.al * 0xAEACF223 & 0x3F) + arg4 + (this.ae * 0xB230B0A5 & 0x3F);
        }
        catch(RuntimeException v4) {
            v5 = new StringBuilder();
            v5.append("af.ae(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public static int ai(int arg1, int arg2) {
        try {
            return be.av(bc.az[arg1]);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("af.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    boolean aj(af arg5) {
        if(this.ax * 400591065 != arg5.ax * 0xF1B8EC49) {
            return 0;
        }

        if(arg5.al * 0x1B6943A7 != this.al * 0xAEACF223) {
            return 0;
        }

        if(this.ae * 0xB230B0A5 != arg5.ae * 0xB230B0A5) {
            return 0;
        }

        return 1;
    }

    boolean al(af arg4, byte arg5) {
        try {
            if(this.ax * 400591065 != arg4.ax * 400591065) {
                return 0;
            }

            if(arg4.al * 0xAEACF223 != this.al * 0xAEACF223) {
                return 0;
            }

            if(this.ae * 0xB230B0A5 == arg4.ae * 0xB230B0A5) {
                return 1;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("af.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return 0;
    }

    public int an() {
        return this.ax * 400591065 << 28 | this.al * 0xAEACF223 << 14 | this.ae * 0xB230B0A5;
    }

    public static boolean ap(int arg0, byte arg1) {
        boolean v1 = true;
        if((arg0 >> 21 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public int ap() {
        return this.ax * 400591065 << 28 | this.al * 0xAEACF223 << 14 | this.ae * 0xB230B0A5;
    }

    boolean aq(af arg5) {
        if(this.ax * 400591065 != arg5.ax * 400591065) {
            return 0;
        }

        if(arg5.al * 0xAEACF223 != this.al * 0xAEACF223) {
            return 0;
        }

        if(this.ae * 0xB230B0A5 != arg5.ae * 0xB230B0A5) {
            return 0;
        }

        return 1;
    }

    public int ar() {
        return this.ax * 0x4AD00FD4 << 28 | this.al * -759712080 << 14 | this.ae * 1020619089;
    }

    public static bf ax(ko arg7, ko arg8, int arg9, boolean arg10, int arg11) {
        int v3;
        int v2;
        arg11 = 0x2A97C940;
        try {
            int[] v11 = arg7.aa(arg9, arg11);
            v2 = 0;
            v3 = 1;
            while(true) {
            label_6:
                if(v2 >= v11.length) {
                    goto label_28;
                }

                int v5 = 0x73E61855;
                byte[] v4 = arg7.af(arg9, v11[v2], v5);
                if(v4 != null) {
                    int v4_1 = v4[1] & 0xFF | (v4[0] & 0xFF) << 8;
                    v4 = arg10 ? arg8.af(0, v4_1, v5) : arg8.af(v4_1, 0, v5);
                    break;
                }
                else {
                    goto label_12;
                }
            }
        }
        catch(RuntimeException v7) {
            goto label_37;
        }

        if(v4 == null) {
        label_12:
            v3 = 0;
        }

        ++v2;
        goto label_6;
    label_28:
        bf v11_1 = null;
        if(v3 == 0) {
            return v11_1;
        }

        try {
            return new bf(arg7, arg8, arg9, arg10);
        }
        catch(RuntimeException v7) {
        label_37:
            StringBuilder v8 = new StringBuilder();
            v8.append("af.ax(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
        catch(Exception ) {
            return v11_1;
        }
    }

    static boolean ax(int arg0, int arg1, int arg2) {
        if(arg0 == 4 && arg1 >= 8) {
            return 0;
        }

        return 1;
    }

    public int ax(int arg3) {
        arg3 = 400591065;
        try {
            return this.ax * arg3 << 28 | this.al * 0xAEACF223 << 14 | this.ae * 0xB230B0A5;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("af.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean equals(Object arg3) {
        if(this == (((af)arg3))) {
            return 1;
        }

        try {
            if(!(arg3 instanceof af)) {
                return 0;
            }

            return this.al(((af)arg3), -1);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("af.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int hashCode() {
        int v0 = -2074457525;
        try {
            return this.ax(v0);
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("af.hashCode(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }

    public boolean hd(Object arg2) {
        if(this == (((af)arg2))) {
            return 1;
        }

        if(!(arg2 instanceof af)) {
            return 0;
        }

        return this.al(((af)arg2), -1);
    }

    public boolean hh(Object arg2) {
        if(this == (((af)arg2))) {
            return 1;
        }

        if(!(arg2 instanceof af)) {
            return 0;
        }

        return this.al(((af)arg2), -1);
    }

    public String hm() {
        return this.ae(",", 0xD39804EF);
    }

    public int ht() {
        return this.ax(0xCBBF14B1);
    }

    public String hx() {
        return this.ae(",", 0xD39804EF);
    }

    public int hy() {
        return this.ax(0xA746E3CB);
    }

    public String hz() {
        return this.ae(",", 0xD39804EF);
    }

    public String toString() {
        try {
            return this.ae(",", 0xD39804EF);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("af.toString(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

