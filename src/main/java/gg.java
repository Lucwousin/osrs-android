import java.util.Collection;

public class gg {
    public static int[] ae = null;
    static final int ak = 75;
    public static final boolean[] al = null;
    public static final int an = 23;
    public static final int ax = 25;
    static final int bf = 0x80;
    static es[] gr;
    static jh ml;

    static {
        gg.al = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
        int v0 = 99;
        gg.ae = new int[v0];
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            int v3 = v1 + 1;
            double v4 = ((double)v3);
            v2 += ((int)(v4 + Math.pow(2, v4 / 7) * 300));
            gg.ae[v1] = v2 / 4;
            v1 = v3;
        }
    }

    gg() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gg.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int ah(int arg2, hl arg3, boolean arg4, int arg5) {
        int[] v2_1;
        try {
            int[] v3 = il.aj;
            arg5 = 0x4A90AB9;
            int v4 = il.ad - arg5;
            il.ad = v4;
            int v0 = 1304812425;
            ar v3_1 = bl.al(v3[v4 * v0], 0x64D7CF4D);
            if(2600 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bz * 0x55D2B057;
                return 1;
            }

            if(2601 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bh * 0x4407680D;
                return 1;
            }

            if(arg2 == 2602) {
                String[] v2_2 = il.aq;
                v4 = ft.ab - 0x705DCADB;
                ft.ab = v4;
                v2_2[v4 * 0xBC5CDEAD - 1] = v3_1.dp;
                return 1;
            }

            if(arg2 == 2603) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bb * 0x83EA0C19;
                return 1;
            }

            if(2604 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bc * 1153505113;
                return 1;
            }

            if(2605 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.ct * 0x80577949;
                return 1;
            }

            if(arg2 == 2606) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.cl * 8000905;
                return 1;
            }

            if(arg2 == 0xA2F) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.cm * 0xC9EFBC3;
                return 1;
            }

            if(0xA30 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.ck * 0x21D4CFF7;
                return 1;
            }

            if(2609 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bl * 0xBB0925D;
                return 1;
            }

            if(arg2 == 2610) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.br * 0x379F3195;
                return 1;
            }

            if(0xA33 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bk * 0xC0871BB;
                return 1;
            }

            if(0xA34 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bm * 0x5A489AAF;
                return 1;
            }

            if(0xA35 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + arg5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.be.ax(1382172990);
                return 1;
            }

            if(0xA36 != arg2) {
                return 2;
            }

            v2_1 = il.aj;
            v4 = il.ad + arg5;
            il.ad = v4;
            v2_1[v4 * v0 - 1] = v3_1.cg;
            return 1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_2 = new StringBuilder();
            v3_2.append("gg.ah(");
            v3_2.append(')');
            throw lx.al(((Throwable)v2), v3_2.toString());
        }

        return 2;
    }

    public static void ai(Collection arg1, byte arg2) {
        try {
            arg1.add(de.ar);
            arg1.add(de.an);
            arg1.add(de.ap);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gg.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static ki bo(int arg7, boolean arg8, boolean arg9, boolean arg10, int arg11) {
        ki v0;
        mr v11 = null;
        try {
            if(mm.af != null) {
                v11 = new mr(arg7, mm.af, mm.av[arg7], 1000000);
            }

            v0 = new ki(v11, en.rs, arg7, arg8, arg9, arg10);
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("gg.bo(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }

        return v0;
    }
}

