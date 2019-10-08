public class bu extends mx {
    public static final int ad = 0;
    int[] ae;
    int al;
    int[] an;
    int[] ap;
    int[][] ar;
    int ax;
    public static final int do = 4;
    static ef[] gz = null;
    static int hi = 0;
    static final int qn = 2;
    static pb rt;

    bu(int arg8, byte[] arg9) {
        try {
            super();
            this.ax = arg8 * 0x3988C111;
            lq v8_1 = new lq(arg9);
            this.al = v8_1.ay(-79) * 0x2C379AE5;
            int v0 = 1266914029;
            this.ae = new int[this.al * v0];
            this.ar = new int[this.al * v0][];
            this.an = new int[this.al * 0x8392ED00];
            this.ap = new int[this.al * v0];
            int v9 = 0;
            int v1;
            for(v1 = 0; v1 < this.al * v0; ++v1) {
                this.ae[v1] = v8_1.ay(-57);
            }

            for(v1 = 0; v1 < this.al * v0; ++v1) {
                this.ar[v1] = new int[v8_1.ay(-120)];
            }

            for(v1 = 0; v1 < this.al * v0; ++v1) {
                int v2;
                for(v2 = 0; v2 < this.ar[v1].length; ++v2) {
                    int[] v3 = this.an;
                    int[] v5 = this.ar[v1];
                    int v6 = v8_1.ay(-21);
                    v5[v2] = v6;
                    v3[v1 * 0x100 + v2] = v6;
                }
            }

            while(v9 < this.al * v0) {
                this.ap[v9] = this.ar[v9].length;
                ++v9;
            }
        }
        catch(RuntimeException v8) {
            goto label_86;
        }

        return;
    label_86:
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("bu.<init>(");
        v9_1.append(')');
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    public static boolean ag(int arg1, int arg2, byte arg3) {
        int v3 = 0xB0766F17;
        try {
            if(arg1 != bc.ar * v3) {
                return false;
            }
            else if(arg2 != bc.an * 1709601659) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bu.ag(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    public static boolean al(int arg2) {
        try {
            if(oj.ax.an() != null) {
                return 1;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bu.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        return 0;
    }

    static void bz(int arg3, int arg4) {
        if(-1 == arg3) {
            return;
        }

        arg4 = 0x637A63DF;
        try {
            if(!mr.ar(arg3, arg4)) {
                return;
            }

            ar[] v3_1 = ar.aj[arg3];
            arg4 = 0;
            while(true) {
            label_10:
                if(arg4 >= v3_1.length) {
                    return;
                }

                ar v0 = v3_1[arg4];
                if(v0.ej != null) {
                    iw v1 = new iw();
                    v1.ae = v0;
                    v1.ax = v0.ej;
                    ec.al(v1, 5000000, 0x137471D3);
                }

                break;
            }
        }
        catch(RuntimeException v3) {
            goto label_28;
        }

        ++arg4;
        goto label_10;
        return;
    label_28:
        StringBuilder v4 = new StringBuilder();
        v4.append("bu.bz(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }
}

