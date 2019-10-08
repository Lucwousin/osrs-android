public class at implements lh {
    public final int ab;
    public static final at ad = null;
    public static final at ae = null;
    final int af;
    public static final at aj = null;
    @Deprecated static final at al = null;
    @Deprecated static final at an = null;
    public static final at ap = null;
    static final at aq = null;
    @Deprecated static final at ar = null;
    public static final at ax = null;
    public static final int bb = 43;
    public static final int bp = 37;
    public static final int bv = 5;

    static {
        at.ax = new at(7, 0);
        at.al = new at(2, 1);
        at.ae = new at(4, 2);
        at.ar = new at(5, 3);
        at.an = new at(3, 4);
        at.ap = new at(0, 5);
        at.aj = new at(6, 6);
        at.ad = new at(8, 7);
        at.aq = new at(1, 8);
    }

    at(int arg2, int arg3) {
        try {
            super();
            this.ab = arg2 * 0x3F08BBD3;
            this.af = arg3 * 0x490551E5;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("at.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean ab() {
        boolean v0 = this == at.ap || at.aj == this || this == at.ad || this == at.aq ? true : false;
        return v0;
    }

    static int ac(int arg7, hl arg8, boolean arg9, byte arg10) {
        boolean v5_2;
        String v7_4;
        int[] v8_2;
        String[] v8_1;
        eg v7_2;
        String[] v7_3;
        int[] v7_1;
        int v9 = -1;
        int v10 = 1304812425;
        int v0 = 0x4A90AB9;
        if(3600 != arg7) {
            goto label_46;
        }

        try {
            int v8 = 0x6BF9605B;
            if(ds.rq.aj * v8 == 0) {
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v7_1[v8 * v10 - 1] = -2;
            }
            else if(ds.rq.aj * v8 == 1) {
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v7_1[v8 * v10 - 1] = v9;
            }
            else {
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v7_1[v8 * v10 - 1] = ds.rq.an.al(966370182);
            }

            return 1;
        label_46:
            int v2 = 0x5B772B0B;
            int v3 = 0xBC5CDEAD;
            int v4 = 0x8FA23525;
            if(3601 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(!ds.rq.ax(0x952CEFD7) || arg7 < 0 || arg7 >= ds.rq.an.al(-1922820839)) {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                }
                else {
                    v7_2 = ds.rq.an.ai(arg7, -2005375633);
                    v8_1 = il.aq;
                    v9 = ft.ab + v4;
                    ft.ab = v9;
                    v8_1[v9 * v3 - 1] = ((ed)v7_2).aq(v2);
                    v8_1 = il.aq;
                    v9 = ft.ab + v4;
                    ft.ab = v9;
                    v8_1[v9 * v3 - 1] = ((ed)v7_2).ab(-1004895702);
                }

                return 1;
            }

            int v5 = 0;
            if(arg7 == 3602) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(!ds.rq.ax(0xAFF36AD8) || arg7 < 0 || arg7 >= ds.rq.an.al(0xADA0FD66)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v10 - 1] = ds.rq.an.ai(arg7, -2050229058).an * 0x297B4181;
                }

                return 1;
            }

            int v6 = 1257071827;
            if(3603 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(!ds.rq.ax(0x9558E84E) || arg7 < 0 || arg7 >= ds.rq.an.al(1739861710)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v10 - 1] = ds.rq.an.ai(arg7, 0x890F271F).aj * v6;
                }

                return 1;
            }

            if(3604 == arg7) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                v7_4 = v7_3[v8 * v3];
                v8_2 = il.aj;
                v9 = il.ad - v0;
                il.ad = v9;
                hu.ak(v7_4, v8_2[v9 * v10], -144605003);
                return 1;
            }

            if(arg7 == 3605) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                ds.rq.ad(v7_3[v8 * v3], 77);
                return 1;
            }

            if(arg7 == 3606) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                ds.rq.ao(v7_3[v8 * v3], -1570117941);
                return 1;
            }

            if(3607 == arg7) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                ds.rq.am(v7_3[v8 * v3], 0);
                return 1;
            }

            if(arg7 == 3608) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                ds.rq.as(v7_3[v8 * v3], -1880437085);
                return 1;
            }

            if(3609 == arg7) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                v7_4 = iz.if(v7_3[v8 * v3], -65);
                v8_2 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8_2[v9 * v10 - 1] = ds.rq.ap(new ew(v7_4, ac.ad), false, -116);
                return 1;
            }

            if(0xE1B == arg7) {
                if(ai.oq != null) {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = ai.oq.ab;
                }
                else {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                }

                return 1;
            }

            if(0xE1C == arg7) {
                if(ai.oq != null) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = ai.oq.al(0xEC0D4C5F);
                }
                else {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }

                return 1;
            }

            if(0xE1D == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(1096394923)) {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                }
                else {
                    v8_1 = il.aq;
                    v9 = ft.ab + v4;
                    ft.ab = v9;
                    v8_1[v9 * v3 - 1] = ai.oq.ai(arg7, -2090089055).ap(0).ax(0x29A65966);
                }

                return 1;
            }

            if(0xE1E == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(0xFBDC7AFA)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v10 - 1] = ai.oq.ai(arg7, 0x82132934).bc(0x8C850164);
                }

                return 1;
            }

            if(0xE1F == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(1667306018)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v10 - 1] = ai.oq.ai(arg7, -2092603633).aj * v6;
                }

                return 1;
            }

            if(0xE20 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v8 = v8 * v10 - 1;
                if(ai.oq != null) {
                    byte v5_1 = ai.oq.ai;
                }

                v7_1[v8] = v5;
                return 1;
            }

            if(arg7 == 0xE21) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                if.hp(v7_3[v8 * v3], 0x56820517);
                return 1;
            }

            if(arg7 == 0xE22) {
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v8 = v8 * v10 - 1;
                if(ai.oq != null) {
                    v5 = ai.oq.av * 0x4C6ABBEF;
                }

                v7_1[v8] = v5;
                return 1;
            }

            if(0xE23 == arg7) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                gs.ha(v7_3[v8 * v3], 0x37E0D836);
                return 1;
            }

            if(arg7 == 3620) {
                cy.hv(0x7AC6DB20);
                return 1;
            }

            if(0xE25 == arg7) {
                if(!ds.rq.ax(0xB29621CB)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = v9;
                }
                else {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = ds.rq.ap.al(0x21BDD106);
                }

                return 1;
            }

            if(arg7 == 0xE26) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(!ds.rq.ax(0xBB813C89) || arg7 < 0 || arg7 >= ds.rq.ap.al(0xD01AEDF2)) {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                }
                else {
                    v7_2 = ds.rq.ap.ai(arg7, -2130140483);
                    v8_1 = il.aq;
                    v9 = ft.ab + v4;
                    ft.ab = v9;
                    v8_1[v9 * v3 - 1] = ((ev)v7_2).aq(v2);
                    v8_1 = il.aq;
                    v9 = ft.ab + v4;
                    ft.ab = v9;
                    v8_1[v9 * v3 - 1] = ((ev)v7_2).ab(0x7B553F13);
                }

                return 1;
            }

            if(arg7 == 0xE27) {
                v7_3 = il.aq;
                v8 = ft.ab - v4;
                ft.ab = v8;
                v7_4 = iz.if(v7_3[v8 * v3], 43);
                v8_2 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8_2[v9 * v10 - 1] = ds.rq.aj(new ew(v7_4, ac.ad), 0x3562);
                return 1;
            }

            if(arg7 == 0xE28) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(0xA7A062E5) || !ai.oq.ai(arg7, 0x80B8EEEE).ap(0).equals(gu.jg.ax)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 1;
                }

                return 1;
            }

            if(0xE29 == arg7) {
                if(ai.oq == null || ai.oq.af == null) {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = "";
                }
                else {
                    v7_3 = il.aq;
                    v8 = ft.ab + v4;
                    ft.ab = v8;
                    v7_3[v8 * v3 - 1] = ai.oq.af;
                }

                return 1;
            }

            if(0xE2A == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(0xAAE079F5) || !ai.oq.ai(arg7, -2021298013).ae(0xD5664D71)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 1;
                }

                return 1;
            }

            if(arg7 == 0xE2B) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v10];
                if(ai.oq == null || arg7 >= ai.oq.al(0x4A3725E0) || !ai.oq.ai(arg7, 0x825ADFF5).bn(0x680C9E6F)) {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 0;
                }
                else {
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v10 - 1] = 1;
                }

                return 1;
            }

            v9 = 0x5AB34763;
            if(0xE2C == arg7) {
                ds.rq.an.aw(v9);
                return 1;
            }

            if(0xE2D == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new jj(((boolean)v5)), -1908078709);
                return 1;
            }

            if(arg7 == 3630) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new jm(((boolean)v5)), -2098300286);
                return 1;
            }

            if(0xE2F == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new jv(((boolean)v5)), 0x8947FCF5);
                return 1;
            }

            if(0xE30 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new jl(((boolean)v5)), 0x8D7C15E4);
                return 1;
            }

            if(0xE31 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new kq(((boolean)v5)), -1976265110);
                return 1;
            }

            if(0xE32 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new jy(((boolean)v5)), 0x86078616);
                return 1;
            }

            if(arg7 == 0xE33) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new js(((boolean)v5)), -2024133042);
                return 1;
            }

            if(arg7 == 0xE34) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new kg(((boolean)v5)), -2002435537);
                return 1;
            }

            if(0xE35 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new kw(((boolean)v5)), 0x80516184);
                return 1;
            }

            if(0xE36 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new ka(((boolean)v5)), 0x8614A04D);
                return 1;
            }

            if(arg7 == 0xE37) {
                ds.rq.an.av(0x80F56D1F);
                return 1;
            }

            if(3640 == arg7) {
                ds.rq.ap.aw(v9);
                return 1;
            }

            if(arg7 == 0xE39) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.ap.ao(new jj(((boolean)v5)), -2070774429);
                return 1;
            }

            if(arg7 == 0xE3A) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.ap.ao(new jm(((boolean)v5)), 0x8BCFC245);
                return 1;
            }

            if(arg7 == 0xE3B) {
                ds.rq.ap.av(-2057042364);
                return 1;
            }

            if(arg7 == 0xE3C) {
                if(ai.oq != null) {
                    ai.oq.aw(v9);
                }

                return 1;
            }

            if(0xE3D == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new jj(((boolean)v5)), 0x8C6AF149);
                }

                return 1;
            }

            if(0xE3E == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new jm(((boolean)v5)), 0x8D33EDF4);
                }

                return 1;
            }

            if(0xE3F == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new jv(((boolean)v5)), 0x80AF78CD);
                }

                return 1;
            }

            if(arg7 == 0xE40) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new jl(((boolean)v5)), 0x8125A3E1);
                }

                return 1;
            }

            if(0xE41 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new kq(((boolean)v5)), 0x8AA43F20);
                }

                return 1;
            }

            if(arg7 == 3650) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new jy(((boolean)v5)), 0x8C338D80);
                }

                return 1;
            }

            if(arg7 == 0xE43) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new js(((boolean)v5)), -1942097108);
                }

                return 1;
            }

            if(arg7 == 0xE44) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new kg(((boolean)v5)), 0x80A0D049);
                }

                return 1;
            }

            if(0xE45 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new kw(((boolean)v5)), 0x90D86B0B);
                }

                return 1;
            }

            if(arg7 == 0xE46) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                if(ai.oq != null) {
                    ai.oq.ao(new ka(((boolean)v5)), 0x8C8F0126);
                }

                return 1;
            }

            if(0xE47 == arg7) {
                if(ai.oq != null) {
                    ai.oq.av(-2000029506);
                }

                return 1;
            }

            if(arg7 == 0xE48) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                if(v7_1[v8 * v10] == 1) {
                    v5_2 = true;
                }

                ds.rq.an.ao(new ke(((boolean)v5)), -2005572699);
                return 1;
            }

            if(arg7 != 0xE49) {
                return 2;
            }

            v7_1 = il.aj;
            v8 = il.ad - v0;
            il.ad = v8;
            if(v7_1[v8 * v10] == 1) {
                v5_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new ke(((boolean)v5)), -2083188065);
                return 1;
            label_45:
                goto label_1191;
            }

            return 1;
        }
        catch(RuntimeException v7) {
            goto label_45;
        }

    label_1191:
        StringBuilder v8_3 = new StringBuilder();
        v8_3.append("at.ac(");
        v8_3.append(')');
        throw lx.al(((Throwable)v7), v8_3.toString());
        return 1;
    }

    public boolean ad() {
        boolean v0 = this == at.ap || at.aj == this || this == at.ad || this == at.aq ? true : false;
        return v0;
    }

    public boolean ae(int arg3) {
        try {
            if(this == at.ap) {
                return true;
            }
            else if(at.aj == this) {
                return true;
            }
            else if(this == at.ad) {
                return true;
            }
            else if(this != at.aq) {
                goto label_9;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("at.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return true;
    label_9:
        boolean v3_1 = false;
        return v3_1;
    }

    public boolean af() {
        boolean v0 = this == at.ap || at.aj == this || this == at.ad || this == at.aq ? true : false;
        return v0;
    }

    public static boolean ai(char arg0, int arg1) {
        boolean v0 = arg0 < 0x30 || arg0 > 57 ? false : true;
        return v0;
    }

    public boolean aj() {
        boolean v0 = at.ae == this || this == at.ar ? true : false;
        return v0;
    }

    public boolean al(int arg3) {
        try {
            if(at.ae == this) {
                return true;
            }
            else if(this != at.ar) {
                goto label_5;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("at.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return true;
    label_5:
        boolean v3_1 = false;
        return v3_1;
    }

    static char al(char arg4, ly arg5, int arg6) {
        char v6 = 'Y';
        char v0 = 'o';
        char v1 = 'O';
        int v2 = 0xC0;
        if(arg4 >= v2) {
            int v3 = 0xFF;
            if(arg4 <= v3) {
                if(arg4 >= v2 && arg4 <= 0xC6) {
                    return 'A';
                }

                if(arg4 == 0xC7) {
                    return 'C';
                }

                if(arg4 >= 200 && arg4 <= 203) {
                    return 'E';
                }

                if(arg4 >= 204 && arg4 <= 0xCF) {
                    return 'I';
                }

                if(arg4 == 209) {
                    try {
                        if(ly.ap != arg5) {
                            return 'N';
                        }

                    label_36:
                        if(arg4 >= 210 && arg4 <= 0xD6) {
                            return v1;
                        }

                        if(arg4 >= 0xD9 && arg4 <= 220) {
                            return 'U';
                        }

                        if(0xDD == arg4) {
                            return v6;
                        }

                        if(arg4 == 0xDF) {
                            return 's';
                        }

                        if(arg4 >= 0xE0 && arg4 <= 230) {
                            return 'a';
                        }

                        if(arg4 == 0xE7) {
                            return 'c';
                        }

                        if(arg4 >= 0xE8 && arg4 <= 0xEB) {
                            return 'e';
                        }

                        if(arg4 >= 0xEC && arg4 <= 0xEF) {
                            return 'i';
                        }

                        if(0xF1 == arg4) {
                            if(ly.ap == arg5) {
                                goto label_91;
                            }

                            return 'n';
                        label_35:
                            goto label_82;
                        }

                        goto label_91;
                    }
                    catch(RuntimeException v4) {
                        goto label_35;
                    }
                }

                goto label_36;
            label_82:
                StringBuilder v5 = new StringBuilder();
                v5.append("at.al(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
                return 'n';
            label_91:
                if(arg4 >= 0xF2 && arg4 <= 0xF6) {
                    return v0;
                }

                if(arg4 >= 0xF9 && arg4 <= 0xFC) {
                    return 'u';
                }

                if(arg4 != 0xFD && arg4 != v3) {
                    goto label_107;
                }

                return 'y';
            }
        }

    label_107:
        if(338 == arg4) {
            return v1;
        }

        if(339 == arg4) {
            return v0;
        }

        if(arg4 == 376) {
            return v6;
        }

        return arg4;
    }

    public boolean an() {
        boolean v0 = at.ae == this || this == at.ar ? true : false;
        return v0;
    }

    public boolean ap() {
        boolean v0 = at.ae == this || this == at.ar ? true : false;
        return v0;
    }

    public boolean aq() {
        boolean v0 = this == at.ap || at.aj == this || this == at.ad || this == at.aq ? true : false;
        return v0;
    }

    public int ar() {
        return this.af * 0x51CF83ED;
    }

    static int ax(byte[] arg3, int arg4, int arg5, byte arg6) {
        int v6 = -1;
        while(arg4 < arg5) {
            int v0 = v6 >>> 8;
            try {
                v6 = lq.an[(v6 ^ arg3[arg4]) & 0xFF] ^ v0;
                ++arg4;
                continue;
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("at.ax(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }
        }

        return ~v6;
    }

    public int ax(int arg3) {
        arg3 = 0x51CF83ED;
        try {
            return this.af * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("at.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

