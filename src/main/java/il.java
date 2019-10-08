import java.util.Calendar;
import java.util.Date;

public class il {
    static ar aa = null;
    static int ad = 0;
    static int af = 0;
    static boolean ag = false;
    static boolean ah = false;
    static ji[] ai = null;
    static int[] aj = null;
    static final int al = 5000000;
    static final String[] am = null;
    static int[] an = null;
    static int[][] ap = null;
    static String[] aq = null;
    static final double as = 0;
    static int at = 0;
    static Calendar au = null;
    static final int ax = 500000;
    static final int ay;

    static {
        il.an = new int[5];
        il.ap = new int[5][5000];
        il.aj = new int[1000];
        il.aq = new String[1000];
        il.af = 0;
        il.ai = new ji[50];
        il.au = Calendar.getInstance();
        il.am = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        il.ag = false;
        il.ah = false;
        il.at = 0;
        il.as = Math.log(2);
    }

    il() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("il.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void bb(iw arg2) {
        ec.al(arg2, -934500135, 2034432074);
    }

    public static void bc(iw arg2) {
        ec.al(arg2, 500000, 665088365);
    }

    static int be(int arg7, hl arg8, boolean arg9) {
        int[] v8_3;
        int[] v7_1;
        ar v7;
        int v8 = 2;
        int v0 = 0;
        int v1 = 0x64D7CF4D;
        int v2 = 1304812425;
        if(100 == arg7) {
            il.ad -= 0xDFB202B;
            arg7 = il.aj[il.ad * v2];
            int v4 = il.aj[il.ad * -1482508631 + 1];
            v8 = il.aj[il.ad * v2 + v8];
            if(v4 != 0) {
                v7 = bl.al(arg7, v1);
                if(v7.fr == null) {
                    v7.fr = new ar[v8 + 1];
                }

                if(v7.fr.length <= v8) {
                    ar[] v1_1 = new ar[v8 + 1];
                    while(v0 < v7.fr.length) {
                        v1_1[v0] = v7.fr[v0];
                        ++v0;
                    }

                    v7.fr = v1_1;
                }

                if(v8 > 0) {
                    v1 = v8 - 1;
                    if(v7.fr[v1] != null) {
                    }
                    else {
                        StringBuilder v8_1 = new StringBuilder();
                        v8_1.append("");
                        v8_1.append(v1);
                        throw new RuntimeException(v8_1.toString());
                    }
                }

                ar v0_1 = new ar();
                v0_1.ay = v4 * 0x8519F555;
                v1 = v7.ah;
                v0_1.ah = v1;
                v0_1.bx = v1 * 0x5C16B2E5;
                v0_1.at = 0x8FF8D0FD * v8;
                v0_1.ag = true;
                v7.fr[v8] = v0_1;
                if(arg9) {
                    il.aa = v0_1;
                }
                else {
                    dw.av = v0_1;
                }

                kx.gw(v7, 0x7FC5F7CB);
                return 1;
            }

            throw new RuntimeException();
        }

        ar v5 = null;
        if(arg7 == 101) {
            v7 = arg9 ? il.aa : dw.av;
            ar v8_2 = bl.al(v7.ah * 0x1B0C4446, v1);
            v8_2.fr[v7.at * 990760021] = v5;
            kx.gw(v8_2, 0x7FC0EDFE);
            return 1;
        }

        if(102 == arg7) {
            v7_1 = il.aj;
            v8 = il.ad + 0x26F8A99B;
            il.ad = v8;
            v7 = bl.al(v7_1[v8 * v2], v1);
            v7.fr = ((ar[])v5);
            kx.gw(v7, 0x7F475427);
            return 1;
        }

        if(0x6EBE8F6D == arg7) {
            il.ad -= 0x9521572;
            arg7 = il.aj[il.ad * 0x2F46570D];
            v8 = il.aj[il.ad * -506161225 + 1];
            v7 = eh.ae(arg7, v8, 0x30CFAF86);
            if(v7 == null || v8 == -1) {
                v7_1 = il.aj;
                v8 = il.ad + 0x3D880BE5;
                il.ad = v8;
                v7_1[v8 * v2 - 1] = 0;
            }
            else {
                v8_3 = il.aj;
                v0 = il.ad - 0x3F7C8EC9;
                il.ad = v0;
                v8_3[v0 * 0xAA4560C9 - 1] = 1;
                if(arg9) {
                    il.aa = v7;
                }
                else {
                    dw.av = v7;
                }
            }

            return 1;
        }

        if(201 == arg7) {
            v7_1 = il.aj;
            v8 = il.ad - 0x3F7926C0;
            il.ad = v8;
            v7 = bl.al(v7_1[v8 * 0xA9C521CF], v1);
            if(v7 != null) {
                v8_3 = il.aj;
                v0 = il.ad + 0x4A90AB9;
                il.ad = v0;
                v8_3[v0 * v2 - 1] = 1;
                if(arg9) {
                    il.aa = v7;
                }
                else {
                    dw.av = v7;
                }
            }
            else {
                v7_1 = il.aj;
                v8 = il.ad - 1771913005;
                il.ad = v8;
                v7_1[v8 * v2 - 1] = 0;
            }

            return 1;
        }

        return v8;
    }

    static int bi(int arg7, hl arg8, boolean arg9) {
        int[] v7;
        ar v9_1;
        int v8_1;
        int v0 = -1;
        int v1 = 1304812425;
        if(arg7 >= 0x1EEA1EBC) {
            arg7 += -1000;
            int[] v8 = il.aj;
            int v9 = il.ad + 290636443;
            il.ad = v9;
            v8_1 = v8[v9 * v1];
            v9_1 = bl.al(v8_1, 0x64D7CF4D);
        }
        else {
            ar v8_2 = arg9 ? il.aa : dw.av;
            v9_1 = v8_2;
            v8_1 = -1;
        }

        int v3 = 2;
        boolean v4 = false;
        if(1000 == arg7) {
            il.ad -= 0xEB49A86F;
            v9_1.ba = il.aj[il.ad * v1] * 0x1DF76BD7;
            v9_1.bf = il.aj[il.ad * 0xFC338BD1 + 1] * 0x8C72CE64;
            v9_1.as = il.aj[il.ad * 0xD405F19D + v3] * 0xB7B83A03;
            v9_1.ak = il.aj[il.ad * -150440129 + 3] * 0xB55C4B8D;
            kx.gw(v9_1, 0x7F4C53A9);
            client.al.fp(v9_1, 0xF06B4BC0);
            if(v0 != v8_1 && v9_1.ay * 0x9D6B2825 == 0) {
                ad.fw(ar.aj[v8_1 >> 16], v9_1, false, 0x9FD2F9D2);
            }

            return 1;
        }

        if(0xF55803BF == arg7) {
            il.ad -= 0x3FC50EB8;
            v9_1.bn = il.aj[il.ad * 1807584219] * 0xA8AD630F;
            v9_1.bp = il.aj[il.ad * v1 + 1] * 0x9F397907;
            v9_1.ac = il.aj[il.ad * v1 + v3] * 0xE6658F96;
            v9_1.bd = il.aj[il.ad * 0x20D4441A + 3] * 0x70561CEE;
            kx.gw(v9_1, 0x7F8E3E6B);
            client.al.fp(v9_1, 0x554C42BF);
            if(v0 != v8_1 && v9_1.ay * 0x4A7987DB == 0) {
                ad.fw(ar.aj[v8_1 >> 16], v9_1, false, 0xBEA854FC);
            }

            return 1;
        }

        if(1003 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - 0x75C1A3E1;
            il.ad = v8_1;
            if(v7[v8_1 * 0xACA939E8] == 1) {
                v4 = true;
            }

            if(v9_1.bg != v4) {
                v9_1.bg = v4;
                kx.gw(v9_1, 0x7F8B2C1F);
            }

            return 1;
        }

        v0 = 0x4A90AB9;
        if(0x5FA9948F == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v0;
            il.ad = v8_1;
            if(v7[v8_1 * 0x570C85F5] == 1) {
                v4 = true;
            }

            v9_1.gs = v4;
            return 1;
        }

        if(arg7 == 0x69745A39) {
            v7 = il.aj;
            v8_1 = il.ad - v0;
            il.ad = v8_1;
            if(v7[v8_1 * v1] == 1) {
                v4 = true;
            }

            v9_1.ga = v4;
            return 1;
        }

        return v3;
    }

    static void bj(iw arg20, int arg21) {
        String[] v6_3;
        String v4_3;
        int[] v6_2;
        int v9_3;
        int[] v9_2;
        jh v4_2;
        int v6_1;
        String[] v9_1;
        int[] v3_2;
        hl v7_2;
        ji v2_3;
        ji[] v2_2;
        int v17_1;
        String[] v11_1;
        int v18;
        int[] v17;
        int[] v16_1;
        int v15_1;
        int[] v15;
        int v2_1;
        int v1_1;
        String v14_2;
        int v16;
        int v14;
        int v13;
        int v11;
        hl v3_1;
        iw v1 = arg20;
        Object[] v2 = v1.ax;
        int v4 = 0x309206DD;
        byte v5 = 16;
        byte v6 = 0;
        if(le.ax(v1.ai * -209510858, 0xD3D3320A)) {
            jc.az = v2[0];
            da v3 = ae.al(jc.az.ax * 1401097027, v5);
            v3_1 = dx.al(v1.ai * 0x797F8B03, v3.an * 0xA05BDEA5, v3.ao * 0x64537821, 0x48A);
        }
        else {
            v3_1 = hw.ax(v2[0].intValue(), v4);
        }

        if(v3_1 == null) {
            return;
        }

        il.ad = 0;
        ft.ab = 0;
        int[] v7 = v3_1.al;
        int[] v8 = v3_1.ae;
        il.af = 0;
        il.ag = false;
        try {
            am.ae = new int[v3_1.an * -1706094139];
            om.ar = new String[v3_1.ap * 1056238039];
            v11 = 1;
            int v12 = 0;
            v13 = 0;
            while(v11 < v2.length) {
                if((v2[v11] instanceof Integer)) {
                    v14 = v2[v11].intValue();
                    if(v14 == 0x80000001) {
                        v14 = v1.ar * -1324042270;
                    }

                    if(0x5A9582AF == v14) {
                        v14 = v1.an * 0x81CBAD69;
                    }

                    v16 = 971580097;
                    if(0xB06B06DD == v14) {
                        v14 = v1.ae != null ? v1.ae.ah * v16 : -1;
                    }

                    if(v14 == 0x80000004) {
                        v14 = v1.ap * 2043861060;
                    }

                    if(v14 == -927033148) {
                        v14 = v1.ae != null ? v1.ae.at * 0x7436FCEF : -1;
                    }

                    if(v14 == 0x926358B9) {
                        v14 = v1.aj != null ? v1.aj.ah * v16 : -1;
                    }

                    if(v14 == 0x80000007) {
                        v14 = v1.aj != null ? 990760021 * v1.aj.at : -1;
                    }

                    if(v14 == 0xE2FCB5B5) {
                        v14 = v1.ad * -1080048279;
                    }

                    if(0x93D3637A == v14) {
                        v14 = v1.aq * -961682707;
                    }

                    am.ae[v13] = v14;
                    ++v13;
                }
                else {
                    if(!(v2[v11] instanceof String)) {
                        goto label_143;
                    }

                    Object v14_1 = v2[v11];
                    if(((String)v14_1).equals("event_opbase")) {
                        v14_2 = v1.ab;
                    }

                    om.ar[v12] = v14_2;
                    ++v12;
                }

            label_143:
                ++v11;
            }

            il.at = v1.af * 0xBA94249F;
            v1_1 = 0;
            v2_1 = -1;
            v11 = -1;
        }
        catch(Exception v0) {
            goto label_830;
        }
        catch(Throwable v0_1) {
            goto label_827;
        }

        while(true) {
        label_152:
            ++v1_1;
            if(v1_1 > arg21) {
                goto label_819;
            }

            ++v2_1;
            try {
                v13 = v7[v2_1];
                v11 = 2078987147;
                if(v13 < v11) {
                }
                else {
                    goto label_790;
                }
            }
            catch(Exception v0) {
                goto label_823;
            }
            catch(Throwable v0_1) {
                goto label_827;
            }

            v11 = 0x4A90AB9;
            v14 = 1304812425;
            if(v13 == 0) {
                try {
                    v15 = il.aj;
                    v16 = il.ad + v11;
                    il.ad = v16;
                    v15[v16 * v14 - 1] = v8[v2_1];
                    goto label_812;
                label_171:
                    if(1 == v13) {
                        v11 = v8[v2_1];
                        int[] v14_3 = il.aj;
                        v15_1 = il.ad - 0x21929991;
                        il.ad = v15_1;
                        v14_3[v15_1 * 0xB4F6E3D2 - 1] = an.ae[v11];
                    }
                    else if(v13 == 2) {
                        v15_1 = v8[v2_1];
                        v16_1 = an.ae;
                        v17 = il.aj;
                        v18 = il.ad - v11;
                        il.ad = v18;
                        v16_1[v15_1] = v17[v18 * v14];
                        ci.gf(v15_1, v6);
                    }
                    else {
                        v16 = 0x8FA23525;
                        if(3 == v13) {
                            v11_1 = il.aq;
                            v14 = ft.ab + v16;
                            ft.ab = v14;
                            v11_1[v14 * -27502437 - 1] = v3_1.ar[v2_1];
                        }
                        else {
                            if(v13 == 6) {
                                v2_1 += v8[v2_1];
                            }
                            else {
                                v17_1 = 0x9521572;
                                if(7 == v13) {
                                    il.ad -= v17_1;
                                    if(il.aj[il.ad * v14 + 1] != il.aj[il.ad * v14]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_812;
                                    }
                                }
                                else if(8 == v13) {
                                    il.ad -= v17_1;
                                    if(il.aj[il.ad * -1105093834] == il.aj[il.ad * v14 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_812;
                                    }
                                }
                                else if(9 == v13) {
                                    il.ad -= 0xD64F6B49;
                                    if(il.aj[il.ad * -1114082693] < il.aj[il.ad * -93157040 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_812;
                                    }
                                }
                                else if(10 == v13) {
                                    il.ad -= v17_1;
                                    if(il.aj[il.ad * 0x57F07B1] > il.aj[il.ad * 0xCF320F1A + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_812;
                                    }
                                }
                                else if(21 != v13) {
                                    goto label_339;
                                }
                                else if(il.af * 0xF990DC22 == 0) {
                                    goto label_303;
                                }
                                else {
                                    goto label_311;
                                }
                            }

                            goto label_216;
                        }
                    }

                    goto label_812;
                }
                catch(Exception v0) {
                    goto label_817;
                }
                catch(Throwable v0_1) {
                    goto label_827;
                }
            }
            else {
                goto label_171;
            label_303:
                if(il.ag) {
                    il.ah = true;
                    ew.hi(1987397065);
                    il.ah = ((boolean)v6);
                    il.ag = ((boolean)v6);
                }

                return;
                try {
                label_311:
                    v2_2 = il.ai;
                    int v7_1 = il.af + 0x8D4AB0F;
                    il.af = v7_1;
                    v2_3 = v2_2[v7_1 * 2076098742];
                    v7_2 = v2_3.ax;
                }
                catch(Exception v0) {
                    goto label_817;
                }
                catch(Throwable v0_1) {
                    goto label_827;
                }

                try {
                    v3_2 = v7_2.al;
                    v8 = v7_2.ae;
                    v11 = 0xB2D190CD * v2_3.al;
                    am.ae = v2_3.ae;
                    om.ar = v2_3.ar;
                    v2_1 = v11;
                    v11 = v13;
                    hl v19 = v7_2;
                    v7 = v3_2;
                    v3_1 = v19;
                    continue;
                }
                catch(Exception v0) {
                    goto label_336;
                }
                catch(Throwable v0_1) {
                    goto label_827;
                }

            label_339:
                if(25 != v13) {
                    goto label_352;
                }

                try {
                    v15_1 = v8[v2_1];
                    v16_1 = il.aj;
                    v17_1 = il.ad + v11;
                    il.ad = v17_1;
                    v16_1[v17_1 * v14 - 1] = of.ax(v15_1, 0x3B58092F);
                    goto label_812;
                label_352:
                    if(v13 == 27) {
                        v11 = v8[v2_1];
                        v15 = il.aj;
                        v16 = il.ad - 1040120658;
                        il.ad = v16;
                        dj.al(v11, v15[v16 * v14], 0x66A3523C);
                        goto label_812;
                    }

                    if(604943082 == v13) {
                        il.ad -= -714750101;
                        if(il.aj[il.ad * 0x394E8E33] > il.aj[il.ad * 0xC8D2578A + 1]) {
                            goto label_812;
                        }

                        v2_1 += v8[v2_1];
                        goto label_216;
                    }

                    if(0x20 == v13) {
                        il.ad -= v17_1;
                        if(il.aj[il.ad * 0xD98FDF0D] < il.aj[il.ad * 0xB549CC47 + 1]) {
                            goto label_812;
                        }

                        v2_1 += v8[v2_1];
                    label_216:
                        v11 = v13;
                        continue;
                    }

                    if(v13 == 0x4BAA3F4A) {
                        int[] v11_2 = il.aj;
                        v14 = il.ad + 2032815595;
                        il.ad = v14;
                        v11_2[v14 * 0xA04458D4 - 1] = am.ae[v8[v2_1]];
                        goto label_812;
                    }

                    if(34 == v13) {
                        v15 = am.ae;
                        v16 = v8[v2_1];
                        v17 = il.aj;
                        v18 = il.ad - v11;
                        il.ad = v18;
                        v15[v16] = v17[v18 * v14];
                        goto label_812;
                    }

                    if(v13 == 1034940708) {
                        v11_1 = il.aq;
                        v14 = ft.ab - 0x50BB243A;
                        ft.ab = v14;
                        v11_1[v14 * 0xBDC1288F - 1] = om.ar[v8[v2_1]];
                        goto label_812;
                    }

                    if(36 == v13) {
                        v11_1 = om.ar;
                        v14 = v8[v2_1];
                        String[] v15_2 = il.aq;
                        v16 = ft.ab + 0x1F9D2573;
                        ft.ab = v16;
                        v11_1[v14] = v15_2[v16 * 0x49453AAC];
                        goto label_812;
                    }

                    if(37 == v13) {
                        v11 = v8[v2_1];
                        ft.ab -= v16 * v11;
                        String v9 = kx.ax(il.aq, ft.ab * 0x8941C7C7, v11, 0x7F030027);
                        v11_1 = il.aq;
                        v14 = ft.ab - 0x2ADA68F8;
                        ft.ab = v14;
                        v11_1[v14 * -2121801314 - 1] = v9;
                        goto label_812;
                    }

                    if(38 == v13) {
                        il.ad -= v11;
                        goto label_812;
                    }

                    if(v13 == -1675909557) {
                        ft.ab -= v16;
                        goto label_812;
                    }

                    if(v13 != 0xF8528AFC) {
                        break;
                    }

                    v7_2 = hw.ax(v8[v2_1], v4);
                    v8 = new int[v7_2.an * -2004341001];
                    v9_1 = new String[v7_2.ap * 0x7329C580];
                    v11 = 0;
                    goto label_510;
                }
                catch(Exception v0) {
                    goto label_817;
                }
                catch(Throwable v0_1) {
                    goto label_827;
                }
            }

            goto label_812;
        }

        if(42 != v13) {
            goto label_603;
        }

        try {
            int[] v4_1 = il.aj;
            v6_1 = il.ad + v11;
            il.ad = v6_1;
            v4_1[v6_1 * 0x92C34F1A - 1] = gg.ml.al(v8[v2_1], 0x11AFF64B);
            goto label_812;
        label_603:
            if(v13 == 43) {
                v4_2 = gg.ml;
                v6_1 = v8[v2_1];
                v9_2 = il.aj;
                v11 = il.ad - 0x6416151F;
                il.ad = v11;
                v4_2.ax(v6_1, v9_2[v11 * 0x6F3806DD], 0x8B8F9E9F);
                goto label_812;
            }

            if(v13 == 44) {
                v4 = v8[v2_1] >> v5;
                v6_1 = v8[v2_1] & 0xB0523D9F;
                v9_2 = il.aj;
                v11 = il.ad - 1808201597;
                il.ad = v11;
                v9_3 = v9_2[v11 * v14];
                if(v9_3 >= 0 && v9_3 <= 5000) {
                    il.an[v4] = v9_3;
                    v6_1 = 105 == v6_1 ? 0 : -1;
                    v11 = 0;
                    goto label_643;
                }

                throw new RuntimeException();
            }

            if(0x51EE816C == v13) {
                v4 = v8[v2_1];
                v6_2 = il.aj;
                v9_3 = il.ad - 0x21BF212;
                il.ad = v9_3;
                v6_1 = v6_2[v9_3 * v14];
                if(v6_1 >= 0 && v6_1 < il.an[v4]) {
                    v9_2 = il.aj;
                    v14 = il.ad + v11;
                    il.ad = v14;
                    v9_2[v14 * 0x103DEBF3 - 1] = il.ap[v4][v6_1];
                    goto label_812;
                }

                throw new RuntimeException();
            }

            if(0x1B8970DC == v13) {
                v4 = v8[v2_1];
                il.ad -= 0x813957ED;
                v6_1 = il.aj[il.ad * v14];
                if(v6_1 >= 0 && v6_1 < il.an[v4]) {
                    il.ap[v4][v6_1] = il.aj[il.ad * v14 + 1];
                    goto label_812;
                }

                throw new RuntimeException();
            }

            if(0x2F == v13) {
                v4_3 = gg.ml.ap(v8[v2_1], 1);
                if(v4_3 == null) {
                    v4_3 = gs.aq;
                }

                v6_3 = il.aq;
                v9_3 = ft.ab - 425490570;
                ft.ab = v9_3;
                v6_3[v9_3 * 0xB994B5F - 1] = v4_3;
                goto label_812;
            }

            v6_1 = 0xBC5CDEAD;
            if(0x30 == v13) {
                v4_2 = gg.ml;
                v9_3 = v8[v2_1];
                v11_1 = il.aq;
                v14 = ft.ab - v16;
                ft.ab = v14;
                v4_2.an(v9_3, v11_1[v14 * v6_1], 102);
                goto label_812;
            }

            if(v13 == 0x8A05114A) {
                v4_3 = gg.ml.ar(v8[v2_1], 0x8D019FC9);
                v6_3 = il.aq;
                v9_3 = ft.ab + 0x5FFA5B0E;
                ft.ab = v9_3;
                v6_3[v9_3 * 162045578 - 1] = v4_3;
                goto label_812;
            }

            if(v13 == 50) {
                v4_2 = gg.ml;
                v9_3 = v8[v2_1];
                v11_1 = il.aq;
                v14 = ft.ab - v16;
                ft.ab = v14;
                v4_2.ae(v9_3, v11_1[v14 * v6_1], 0xCBF20081);
                goto label_812;
            }

            if(v13 == 2054976507) {
                oc v4_4 = v3_1.aq[v8[v2_1]];
                v6_2 = il.aj;
                v9_3 = il.ad - 716328001;
                il.ad = v9_3;
                mx v4_5 = v4_4.ax(((long)v6_2[v9_3 * 0xE1517BE2]));
                if(v4_5 == null) {
                    goto label_812;
                }

                v2_1 += ((mo)v4_5).ax;
                goto label_812;
            }

            throw new IllegalStateException();
        label_790:
            boolean v4_6 = v3_1.ae[v2_1] == 1 ? true : false;
            switch(hu.ae(v13, v3_1, v4_6, 0x8A24E57E)) {
                case 0: {
                    goto label_803;
                }
                case 1: {
                    goto label_812;
                }
                case 2: {
                    goto label_800;
                }
            }

            goto label_812;
        }
        catch(Exception v0) {
            goto label_817;
        }
        catch(Throwable v0_1) {
            goto label_827;
        }

    label_803:
        if(il.ag) {
            il.ah = true;
            ew.hi(0x71B89FFC);
            il.ah = false;
            il.ag = false;
        }

        return;
        try {
        label_800:
            throw new IllegalStateException();
        }
        catch(Exception v0) {
            goto label_817;
        }
        catch(Throwable v0_1) {
            goto label_827;
        }

        try {
        label_819:
            throw new RuntimeException();
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v0) {
        label_823:
            Exception v1_2 = v0;
            v13 = v11;
            goto label_832;
            try {
                while(true) {
                label_643:
                    if(v11 >= v9_3) {
                        goto label_812;
                    }

                    il.ap[v4][v11] = v6_1;
                    ++v11;
                }

            label_510:
                while(v11 < v7_2.aj * 0xF15F0C13) {
                    v8[v11] = il.aj[il.ad * v14 - v7_2.aj * -1587620589 + v11];
                    ++v11;
                }

                for(v4 = 0; true; ++v4) {
                    v11 = 0x450E27DF;
                    if(v4 >= v7_2.ad * v11) {
                        break;
                    }

                    v9_1[v4] = il.aq[ft.ab * 1699070388 - v7_2.ad * v11 + v4];
                }

                il.ad -= v7_2.aj * 0x4765B8BB;
                ft.ab -= v7_2.ad * 0x391F5152;
                ji v4_7 = new ji();
                v4_7.ax = v3_1;
                v4_7.al = v2_1 * 0x2F58DC05;
                v4_7.ae = am.ae;
                v4_7.ar = om.ar;
                v2_2 = il.ai;
                v6_1 = il.af + 1008357271;
                il.af = v6_1;
                v2_2[v6_1 * 0x64173D4B - 1] = v4_7;
            }
            catch(Exception v0) {
                goto label_817;
            }
            catch(Throwable v0_1) {
                goto label_827;
            }

            try {
                int[] v2_4 = v7_2.al;
                v3_2 = v7_2.ae;
                am.ae = v8;
                om.ar = v9_1;
                v8 = v3_2;
                v3_1 = v7_2;
                v11 = v13;
                v4 = 0x309206DD;
                v6 = 0;
                v7 = v2_4;
                v2_1 = -1;
                goto label_152;
            }
            catch(Throwable v0_1) {
            label_827:
                Throwable v1_3 = v0_1;
                if(il.ag) {
                    il.ah = true;
                    ew.hi(0xAF7EFF06);
                    il.ah = false;
                    il.ag = false;
                }

                throw v1_3;
            }
            catch(Exception v0) {
            label_336:
                v1_2 = v0;
                v3_2 = v7;
                goto label_832;
            label_817:
                v1_2 = v0;
                goto label_832;
            label_812:
                v11 = v13;
                v4 = 0x309206DD;
                v6 = 0;
                goto label_152;
            label_830:
                v1_2 = v0;
                v13 = -1;
                try {
                label_832:
                    StringBuilder v2_5 = new StringBuilder(30);
                    v2_5.append("");
                    v2_5.append(((hl)v3_2).gx);
                    v2_5.append(" ");
                    for(v4 = il.af * 0xF54EF8EB - 1; v4 >= 0; --v4) {
                        v2_5.append("");
                        v2_5.append(il.ai[v4].ax.gx);
                        v2_5.append(" ");
                    }

                    v2_5.append("");
                    v2_5.append(v13);
                    po.ax(v2_5.toString(), ((Throwable)v1_2), 0x2D18285);
                }
                catch(Throwable v0_1) {
                    goto label_827;
                }

                if(il.ag) {
                    il.ah = true;
                    ew.hi(0xF627E55F);
                    il.ah = false;
                    il.ag = false;
                }

                return;
            }
        }
    }

    public static void bk(iw arg2) {
        ec.al(arg2, 500000, 0x6DF329C2);
    }

    static int bl(int arg7, hl arg8, boolean arg9) {
        int[] v8_3;
        int[] v7_1;
        ar v7;
        int v8 = 2;
        int v0 = 0;
        int v1 = 0x64D7CF4D;
        int v2 = 1304812425;
        if(-1665409681 == arg7) {
            il.ad -= 0xDFB202B;
            arg7 = il.aj[il.ad * v2];
            int v4 = il.aj[il.ad * v2 + 1];
            v8 = il.aj[il.ad * v2 + v8];
            if(v4 != 0) {
                v7 = bl.al(arg7, v1);
                if(v7.fr == null) {
                    v7.fr = new ar[v8 + 1];
                }

                if(v7.fr.length <= v8) {
                    ar[] v1_1 = new ar[v8 + 1];
                    while(v0 < v7.fr.length) {
                        v1_1[v0] = v7.fr[v0];
                        ++v0;
                    }

                    v7.fr = v1_1;
                }

                if(v8 > 0) {
                    v1 = v8 - 1;
                    if(v7.fr[v1] != null) {
                    }
                    else {
                        StringBuilder v8_1 = new StringBuilder();
                        v8_1.append("");
                        v8_1.append(v1);
                        throw new RuntimeException(v8_1.toString());
                    }
                }

                ar v0_1 = new ar();
                v0_1.ay = v4 * 1179065427;
                v1 = v7.ah;
                v0_1.ah = v1;
                v0_1.bx = v1 * 0x5C16B2E5;
                v0_1.at = 0xCC6BFB47 * v8;
                v0_1.ag = true;
                v7.fr[v8] = v0_1;
                if(arg9) {
                    il.aa = v0_1;
                }
                else {
                    dw.av = v0_1;
                }

                kx.gw(v7, 0x7F57B9E3);
                return 1;
            }

            throw new RuntimeException();
        }

        ar v5 = null;
        if(arg7 == 101) {
            v7 = arg9 ? il.aa : dw.av;
            ar v8_2 = bl.al(v7.ah * 121087706, v1);
            v8_2.fr[v7.at * 606164825] = v5;
            kx.gw(v8_2, 0x7F7FB591);
            return 1;
        }

        int v6 = 0x4A90AB9;
        if(102 == arg7) {
            v7_1 = il.aj;
            v8 = il.ad - v6;
            il.ad = v8;
            v7 = bl.al(v7_1[v8 * 1120479200], v1);
            v7.fr = ((ar[])v5);
            kx.gw(v7, 0x7F9DC211);
            return 1;
        }

        if(200 == arg7) {
            il.ad -= 0x9521572;
            arg7 = il.aj[il.ad * v2];
            v8 = il.aj[il.ad * 0x20ECF47E + 1];
            v7 = eh.ae(arg7, v8, 1016786904);
            if(v7 == null || v8 == -1) {
                v7_1 = il.aj;
                v8 = il.ad - 0x1A661BAF;
                il.ad = v8;
                v7_1[v8 * v2 - 1] = 0;
            }
            else {
                v8_3 = il.aj;
                v0 = il.ad + v6;
                il.ad = v0;
                v8_3[v0 * 0x31D59DF2 - 1] = 1;
                if(arg9) {
                    il.aa = v7;
                }
                else {
                    dw.av = v7;
                }
            }

            return 1;
        }

        if(0x3F043B0 == arg7) {
            v7_1 = il.aj;
            v8 = il.ad - v6;
            il.ad = v8;
            v7 = bl.al(v7_1[v8 * v2], v1);
            if(v7 != null) {
                v8_3 = il.aj;
                v0 = il.ad + v6;
                il.ad = v0;
                v8_3[v0 * v2 - 1] = 1;
                if(arg9) {
                    il.aa = v7;
                }
                else {
                    dw.av = v7;
                }
            }
            else {
                v7_1 = il.aj;
                v8 = il.ad + v6;
                il.ad = v8;
                v7_1[v8 * v2 - 1] = 0;
            }

            return 1;
        }

        return v8;
    }

    static void bm(iw arg20, int arg21) {
        String[] v13_2;
        String v5_3;
        int[] v13_1;
        jh v5_2;
        String[] v8_1;
        int[] v7_2;
        int[] v14_1;
        int[] v3_2;
        hl v4_2;
        ji v2_3;
        ji[] v2_2;
        String[] v10_1;
        int v14;
        int v18;
        int[] v17_1;
        int[] v16_1;
        int v2_1;
        int v1_1;
        int v17;
        int v10;
        int v16;
        int v15;
        int v12;
        int v13;
        hl v3_1;
        iw v1 = arg20;
        Object[] v2 = v1.ax;
        int v4 = 0x797F8B03;
        int v5 = 0x309206DD;
        byte v6 = 16;
        byte v7 = 0;
        if(le.ax(v1.ai * v4, 0xF00B9141)) {
            jc.az = v2[0];
            da v3 = ae.al(jc.az.ax * 1401097027, v6);
            v3_1 = dx.al(v1.ai * v4, v3.an * 0x11F2C855, v3.ao * 0x64537821, -13326);
        }
        else {
            v3_1 = hw.ax(v2[0].intValue(), v5);
        }

        if(v3_1 == null) {
            return;
        }

        il.ad = 0;
        ft.ab = 0;
        int[] v4_1 = v3_1.al;
        int[] v8 = v3_1.ae;
        il.af = 0;
        il.ag = false;
        int v9 = 0x64173D4B;
        try {
            v13 = -2004341001;
            am.ae = new int[v3_1.an * v13];
            om.ar = new String[v3_1.ap * -669468027];
            v12 = 1;
            v15 = 0;
            v16 = 0;
            while(v12 < v2.length) {
                if((v2[v12] instanceof Integer)) {
                    v10 = v2[v12].intValue();
                    if(v10 == 0x80000001) {
                        v10 = 0x102B070B * v1.ar;
                    }

                    if(0x80000002 == v10) {
                        v10 = 0x81CBAD69 * v1.an;
                    }

                    v17 = 971580097;
                    if(0x80000003 == v10) {
                        v10 = v1.ae != null ? v1.ae.ah * v17 : -1;
                    }

                    if(v10 == 0x80000004) {
                        v10 = 0x70B27DF1 * v1.ap;
                    }

                    if(v10 == 0x80000005) {
                        v10 = v1.ae != null ? 990760021 * v1.ae.at : -1;
                    }

                    if(v10 == 0x80000006) {
                        v10 = v1.aj != null ? v1.aj.ah * v17 : -1;
                    }

                    if(v10 == 0x80000007) {
                        v10 = v1.aj != null ? v1.aj.at * 990760021 : -1;
                    }

                    if(v10 == 0x80000008) {
                        v10 = -1080048279 * v1.ad;
                    }

                    if(0x80000009 == v10) {
                        v10 = -2082285639 * v1.aq;
                    }

                    am.ae[v16] = v10;
                    ++v16;
                }
                else {
                    if(!(v2[v12] instanceof String)) {
                        goto label_143;
                    }

                    Object v6_1 = v2[v12];
                    if(((String)v6_1).equals("event_opbase")) {
                        String v6_2 = v1.ab;
                    }

                    om.ar[v15] = v6_1;
                    ++v15;
                }

            label_143:
                ++v12;
            }

            il.at = v1.af * 0xBA94249F;
            v1_1 = 0;
            v2_1 = -1;
            v10 = -1;
        }
        catch(Exception v0) {
            goto label_800;
        }
        catch(Throwable v0_1) {
            goto label_797;
        }

        while(true) {
        label_153:
            ++v1_1;
            if(v1_1 > arg21) {
                goto label_789;
            }

            ++v2_1;
            try {
                v12 = v4_1[v2_1];
                v10 = 100;
                if(v12 < v10) {
                }
                else {
                    goto label_757;
                }
            }
            catch(Exception v0) {
                goto label_793;
            }
            catch(Throwable v0_1) {
                goto label_797;
            }

            v10 = 0x4A90AB9;
            v15 = 1304812425;
            if(v12 == 0) {
                try {
                    v16_1 = il.aj;
                    v17 = il.ad + v10;
                    il.ad = v17;
                    v16_1[v17 * v15 - 1] = v8[v2_1];
                    goto label_171;
                label_173:
                    if(1 == v12) {
                        v16 = v8[v2_1];
                        v17_1 = il.aj;
                        v18 = il.ad + v10;
                        il.ad = v18;
                        v17_1[v18 * v15 - 1] = an.ae[v16];
                    }
                    else if(v12 == 2) {
                        v14 = v8[v2_1];
                        v16_1 = an.ae;
                        v17_1 = il.aj;
                        v18 = il.ad - v10;
                        il.ad = v18;
                        v16_1[v14] = v17_1[v18 * v15];
                        ci.gf(v14, v7);
                    }
                    else {
                        v16 = 0xBC5CDEAD;
                        v17 = 0x8FA23525;
                        if(3 == v12) {
                            v10_1 = il.aq;
                            v14 = ft.ab + v17;
                            ft.ab = v14;
                            v10_1[v14 * v16 - 1] = v3_1.ar[v2_1];
                        }
                        else {
                            if(v12 == 6) {
                                v2_1 += v8[v2_1];
                            }
                            else {
                                v18 = 0x9521572;
                                if(7 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15 + 1] != il.aj[il.ad * v15]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(8 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] == il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(9 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] < il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(10 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] > il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(21 != v12) {
                                    goto label_332;
                                }
                                else if(il.af * v9 == 0) {
                                    goto label_296;
                                }
                                else {
                                    goto label_304;
                                }
                            }

                            goto label_216;
                        }
                    }

                    goto label_171;
                }
                catch(Exception v0) {
                    goto label_787;
                }
                catch(Throwable v0_1) {
                    goto label_797;
                }
            }
            else {
                goto label_173;
            label_296:
                if(il.ag) {
                    il.ah = true;
                    ew.hi(468241705);
                    il.ah = ((boolean)v7);
                    il.ag = ((boolean)v7);
                }

                return;
                try {
                label_304:
                    v2_2 = il.ai;
                    v4 = il.af - 0x53F66463;
                    il.af = v4;
                    v2_3 = v2_2[v4 * v9];
                    v4_2 = v2_3.ax;
                }
                catch(Exception v0) {
                    goto label_787;
                }
                catch(Throwable v0_1) {
                    goto label_797;
                }

                try {
                    v3_2 = v4_2.al;
                    v8 = v4_2.ae;
                    v10 = 0xB2D190CD * v2_3.al;
                    am.ae = v2_3.ae;
                    om.ar = v2_3.ar;
                    v2_1 = v10;
                    v10 = v12;
                    hl v19 = v4_2;
                    v4_1 = v3_2;
                    v3_1 = v19;
                    continue;
                }
                catch(Exception v0) {
                    goto label_329;
                }
                catch(Throwable v0_1) {
                    goto label_797;
                }

            label_332:
                if(25 != v12) {
                    goto label_345;
                }

                try {
                    v14 = v8[v2_1];
                    v16_1 = il.aj;
                    v17 = il.ad + v10;
                    il.ad = v17;
                    v16_1[v17 * v15 - 1] = of.ax(v14, 0x2F916B5A);
                    goto label_171;
                label_345:
                    if(v12 == 27) {
                        v14 = v8[v2_1];
                        v16_1 = il.aj;
                        v17 = il.ad - v10;
                        il.ad = v17;
                        dj.al(v14, v16_1[v17 * v15], 0x3C0B0EC1);
                        goto label_171;
                    }

                    if(0x1F == v12) {
                        il.ad -= v18;
                        if(il.aj[il.ad * v15] > il.aj[il.ad * v15 + 1]) {
                            goto label_171;
                        }

                        v2_1 += v8[v2_1];
                        goto label_216;
                    }

                    if(0x20 == v12) {
                        il.ad -= v18;
                        if(il.aj[il.ad * v15] < il.aj[il.ad * v15 + 1]) {
                            goto label_171;
                        }

                        v2_1 += v8[v2_1];
                    label_216:
                        v10 = v12;
                        continue;
                    }

                    if(v12 == 33) {
                        v14_1 = il.aj;
                        v16 = il.ad + v10;
                        il.ad = v16;
                        v14_1[v16 * v15 - 1] = am.ae[v8[v2_1]];
                        goto label_171;
                    }

                    if(34 == v12) {
                        v14_1 = am.ae;
                        v16 = v8[v2_1];
                        v17_1 = il.aj;
                        v18 = il.ad - v10;
                        il.ad = v18;
                        v14_1[v16] = v17_1[v18 * v15];
                        goto label_171;
                    }

                    if(v12 == 35) {
                        v10_1 = il.aq;
                        v14 = ft.ab + v17;
                        ft.ab = v14;
                        v10_1[v14 * v16 - 1] = om.ar[v8[v2_1]];
                        goto label_171;
                    }

                    if(36 == v12) {
                        v10_1 = om.ar;
                        v14 = v8[v2_1];
                        String[] v15_1 = il.aq;
                        v18 = ft.ab - v17;
                        ft.ab = v18;
                        v10_1[v14] = v15_1[v18 * v16];
                        goto label_171;
                    }

                    if(37 == v12) {
                        v10 = v8[v2_1];
                        ft.ab -= v10 * v17;
                        String v7_1 = kx.ax(il.aq, ft.ab * v16, v10, 0x7F030027);
                        v10_1 = il.aq;
                        v14 = ft.ab + v17;
                        ft.ab = v14;
                        v10_1[v14 * v16 - 1] = v7_1;
                        goto label_171;
                    }

                    if(38 == v12) {
                        il.ad -= v10;
                        goto label_171;
                    }

                    if(v12 == 39) {
                        ft.ab -= v17;
                        goto label_171;
                    }

                    if(v12 != 40) {
                        break;
                    }

                    v4_2 = hw.ax(v8[v2_1], v5);
                    v7_2 = new int[v4_2.an * v13];
                    v8_1 = new String[v4_2.ap * -669468027];
                    v10 = 0;
                    goto label_487;
                }
                catch(Exception v0) {
                    goto label_787;
                }
                catch(Throwable v0_1) {
                    goto label_797;
                }
            }

            goto label_171;
        }

        if(42 != v12) {
            goto label_581;
        }

        try {
            int[] v5_1 = il.aj;
            int v7_3 = il.ad + v10;
            il.ad = v7_3;
            v5_1[v7_3 * v15 - 1] = gg.ml.al(v8[v2_1], -1317091369);
            goto label_171;
        label_581:
            if(v12 == 43) {
                v5_2 = gg.ml;
                v7_3 = v8[v2_1];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                v5_2.ax(v7_3, v13_1[v14 * v15], 0x8B8F9E9F);
            label_171:
                goto label_780;
            }

            if(v12 == 44) {
                v5 = v8[v2_1] >> 16;
                v13 = v8[v2_1] & 0xFFFF;
                v14_1 = il.aj;
                v16 = il.ad - v10;
                il.ad = v16;
                v10 = v14_1[v16 * v15];
                if(v10 >= 0 && v10 <= 5000) {
                    il.an[v5] = v10;
                    v13 = 105 == v13 ? 0 : -1;
                    v14 = 0;
                    goto label_619;
                }

                throw new RuntimeException();
            }

            if(45 == v12) {
                v5 = v8[v2_1];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                v13 = v13_1[v14 * v15];
                if(v13 >= 0 && v13 < il.an[v5]) {
                    v14_1 = il.aj;
                    v16 = il.ad + v10;
                    il.ad = v16;
                    v14_1[v16 * v15 - 1] = il.ap[v5][v13];
                    goto label_780;
                }

                throw new RuntimeException();
            }

            if(46 == v12) {
                v5 = v8[v2_1];
                il.ad -= v18;
                v10 = il.aj[il.ad * v15];
                if(v10 >= 0 && v10 < il.an[v5]) {
                    il.ap[v5][v10] = il.aj[il.ad * v15 + 1];
                    goto label_780;
                }

                throw new RuntimeException();
            }

            if(0x2F == v12) {
                v5_3 = gg.ml.ap(v8[v2_1], 1);
                if(v5_3 == null) {
                    v5_3 = gs.aq;
                }

                v10_1 = il.aq;
                v13 = ft.ab + v17;
                ft.ab = v13;
                v10_1[v13 * v16 - 1] = v5_3;
                goto label_780;
            }

            if(0x30 == v12) {
                v5_2 = gg.ml;
                v10 = v8[v2_1];
                v13_2 = il.aq;
                v14 = ft.ab - v17;
                ft.ab = v14;
                v5_2.an(v10, v13_2[v14 * v16], -52);
                goto label_780;
            }

            if(v12 == 49) {
                v5_3 = gg.ml.ar(v8[v2_1], 0xD3D3DF19);
                v10_1 = il.aq;
                v13 = ft.ab + v17;
                ft.ab = v13;
                v10_1[v13 * v16 - 1] = v5_3;
                goto label_780;
            }

            if(v12 == 50) {
                v5_2 = gg.ml;
                v10 = v8[v2_1];
                v13_2 = il.aq;
                v14 = ft.ab - v17;
                ft.ab = v14;
                v5_2.ae(v10, v13_2[v14 * v16], 0xCBF20081);
                goto label_780;
            }

            if(v12 == 60) {
                oc v5_4 = v3_1.aq[v8[v2_1]];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                mx v5_5 = v5_4.ax(((long)v13_1[v14 * v15]));
                if(v5_5 == null) {
                    goto label_780;
                }

                v2_1 += ((mo)v5_5).ax;
                goto label_780;
            }

            throw new IllegalStateException();
        label_757:
            boolean v5_6 = v3_1.ae[v2_1] == 1 ? true : false;
            switch(hu.ae(v12, v3_1, v5_6, 0x8A24E57E)) {
                case 0: {
                    goto label_771;
                }
                case 1: {
                    goto label_780;
                }
                case 2: {
                    goto label_768;
                }
            }

            goto label_780;
        }
        catch(Exception v0) {
            goto label_787;
        }
        catch(Throwable v0_1) {
            goto label_797;
        }

    label_771:
        if(il.ag) {
            il.ah = true;
            ew.hi(0x9BE76659);
            il.ah = false;
            il.ag = false;
        }

        return;
        try {
        label_768:
            throw new IllegalStateException();
        }
        catch(Exception v0) {
            goto label_787;
        }
        catch(Throwable v0_1) {
            goto label_797;
        }

        try {
        label_789:
            throw new RuntimeException();
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v0) {
        label_793:
            Exception v1_2 = v0;
            v12 = v10;
            goto label_802;
            try {
            label_619:
                while(v14 < v10) {
                    il.ap[v5][v14] = v13;
                    ++v14;
                }
            }
            catch(Exception v0) {
                goto label_787;
            }
            catch(Throwable v0_1) {
                goto label_797;
            }

        label_780:
            v10 = v12;
            v5 = 0x309206DD;
            v7 = 0;
            v13 = -2004341001;
            goto label_153;
            try {
            label_487:
                while(v10 < v4_2.aj * -1587620589) {
                    v7_2[v10] = il.aj[v10 + (il.ad * v15 - v4_2.aj * -1587620589)];
                    ++v10;
                }

                for(v5 = 0; v5 < v4_2.ad * 0x450E27DF; ++v5) {
                    v8_1[v5] = il.aq[ft.ab * v16 - v4_2.ad * 0x450E27DF + v5];
                }

                il.ad -= v4_2.aj * 0x4765B8BB;
                ft.ab -= v4_2.ad * 0xB56AEE3B;
                ji v5_7 = new ji();
                v5_7.ax = v3_1;
                v5_7.al = v2_1 * 0x2F58DC05;
                v5_7.ae = am.ae;
                v5_7.ar = om.ar;
                v2_2 = il.ai;
                v10 = il.af + 0x53F66463;
                il.af = v10;
                v2_2[v10 * v9 - 1] = v5_7;
            }
            catch(Exception v0) {
                goto label_787;
            }
            catch(Throwable v0_1) {
                goto label_797;
            }

            try {
                int[] v2_4 = v4_2.al;
                v3_2 = v4_2.ae;
                am.ae = v7_2;
                om.ar = v8_1;
                v8 = v3_2;
                v3_1 = v4_2;
                v10 = v12;
                v5 = 0x309206DD;
                v7 = 0;
                v13 = -2004341001;
                v4_1 = v2_4;
                v2_1 = -1;
                goto label_153;
            }
            catch(Throwable v0_1) {
            label_797:
                Throwable v1_3 = v0_1;
                if(il.ag) {
                    il.ah = true;
                    ew.hi(0x2AE08B11);
                    il.ah = false;
                    il.ag = false;
                }

                throw v1_3;
            }
            catch(Exception v0) {
            label_329:
                v1_2 = v0;
                v3_2 = v4_1;
                goto label_802;
            label_787:
                v1_2 = v0;
                goto label_802;
            label_800:
                v1_2 = v0;
                v12 = -1;
                try {
                label_802:
                    StringBuilder v2_5 = new StringBuilder(30);
                    v2_5.append("");
                    v2_5.append(((hl)v3_2).gx);
                    v2_5.append(" ");
                    int v3_3;
                    for(v3_3 = il.af * v9 - 1; v3_3 >= 0; --v3_3) {
                        v2_5.append("");
                        v2_5.append(il.ai[v3_3].ax.gx);
                        v2_5.append(" ");
                    }

                    v2_5.append("");
                    v2_5.append(v12);
                    po.ax(v2_5.toString(), ((Throwable)v1_2), -872008869);
                }
                catch(Throwable v0_1) {
                    goto label_797;
                }

                if(il.ag) {
                    il.ah = true;
                    ew.hi(0xBFC70A9F);
                    il.ah = false;
                    il.ag = false;
                }

                return;
            }
        }
    }

    static int br(int arg9, hl arg10, boolean arg11) {
        int[] v9;
        ar v11_1;
        int v10_1;
        int v0 = -1;
        int v1 = 0x4A90AB9;
        int v2 = 1304812425;
        if(arg9 >= 2000) {
            arg9 += -1000;
            int[] v10 = il.aj;
            int v11 = il.ad - v1;
            il.ad = v11;
            v10_1 = v10[v11 * v2];
            v11_1 = bl.al(v10_1, 0x64D7CF4D);
        }
        else {
            ar v10_2 = arg11 ? il.aa : dw.av;
            v11_1 = v10_2;
            v10_1 = -1;
        }

        int v4 = 0x4A7987DB;
        int v5 = 0x12A42AE4;
        int v6 = 2;
        boolean v7 = false;
        if(1000 == arg9) {
            il.ad -= v5;
            v11_1.ba = il.aj[il.ad * v2] * 0x1DF76BD7;
            v11_1.bf = il.aj[il.ad * v2 + 1] * 0x4C710A11;
            v11_1.as = il.aj[il.ad * v2 + v6] * -1859830651;
            v11_1.ak = il.aj[il.ad * v2 + 3] * 0xB55C4B8D;
            kx.gw(v11_1, 0x7F199518);
            client.al.fp(v11_1, 440585120);
            if(v0 != v10_1 && v11_1.ay * v4 == 0) {
                ad.fw(ar.aj[v10_1 >> 16], v11_1, false, 0xEA869190);
            }

            return 1;
        }

        if(1001 == arg9) {
            il.ad -= v5;
            v11_1.bn = il.aj[il.ad * v2] * 0xA8AD630F;
            v11_1.bp = il.aj[il.ad * v2 + 1] * 0x38D01227;
            v11_1.ac = il.aj[il.ad * v2 + v6] * 1261109601;
            v11_1.bd = il.aj[il.ad * v2 + 3] * 0x4F1860C9;
            kx.gw(v11_1, 0x7FEFE76F);
            client.al.fp(v11_1, 0x1D962821);
            if(v0 != v10_1 && v11_1.ay * v4 == 0) {
                ad.fw(ar.aj[v10_1 >> 16], v11_1, false, -1246040850);
            }

            return 1;
        }

        if(1003 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            if(v11_1.bg != v7) {
                v11_1.bg = v7;
                kx.gw(v11_1, 0x7F3029DF);
            }

            return 1;
        }

        if(1005 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            v11_1.gs = v7;
            return 1;
        }

        if(arg9 == 1006) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            v11_1.ga = v7;
            return 1;
        }

        return v6;
    }

    static int bs(int arg2, hl arg3, boolean arg4) {
        if(arg2 < 1000) {
            return bm.ar(arg2, arg3, arg4, 18);
        }

        if(arg2 < 1100) {
            return az.an(arg2, arg3, arg4, 0xA2131803);
        }

        if(arg2 < 1200) {
            return fg.ap(arg2, arg3, arg4, 0x64F44D79);
        }

        if(arg2 < 1300) {
            return kg.aj(arg2, arg3, arg4, 0x2FE7AD03);
        }

        if(arg2 < 1400) {
            return fd.ad(arg2, arg3, arg4, 600748988);
        }

        int v1 = 0x662278C1;
        if(arg2 < 1500) {
            return as.ai(arg2, arg3, arg4, v1);
        }

        if(arg2 < 1600) {
            return bx.av(arg2, arg3, arg4, 870444079);
        }

        if(arg2 < 1700) {
            return fe.aa(arg2, arg3, arg4, 73);
        }

        if(arg2 < 1800) {
            return fq.au(arg2, arg3, arg4, -1049744321);
        }

        if(arg2 < 1900) {
            return du.am(arg2, arg3, arg4, 503410389);
        }

        if(arg2 < 2000) {
            return ap.az(arg2, arg3, arg4, 0x6AA8F5AB);
        }

        if(arg2 < 2100) {
            return az.an(arg2, arg3, arg4, 0xB7268900);
        }

        if(arg2 < 2200) {
            return fg.ap(arg2, arg3, arg4, 0x7F0C6AE9);
        }

        if(arg2 < 2300) {
            return kg.aj(arg2, arg3, arg4, 1556900371);
        }

        if(arg2 < 2400) {
            return fd.ad(arg2, arg3, arg4, 0xB58901D8);
        }

        if(arg2 < 2500) {
            return as.ai(arg2, arg3, arg4, v1);
        }

        if(arg2 < 2600) {
            return dc.ag(arg2, arg3, arg4, 0);
        }

        if(arg2 < 2700) {
            return gg.ah(arg2, arg3, arg4, 0xAF41CB1F);
        }

        if(arg2 < 0xAF0) {
            return hy.at(arg2, arg3, arg4, -860275113);
        }

        if(arg2 < 2900) {
            return bf.ay(arg2, arg3, arg4, 0xCB8FC6E2);
        }

        if(arg2 < 3000) {
            return ap.az(arg2, arg3, arg4, 0xE043B6D1);
        }

        if(arg2 < 3200) {
            return cd.aw(arg2, arg3, arg4, 0x46A74B41);
        }

        if(arg2 < 3300) {
            return ct.ao(arg2, arg3, arg4, 0x4D697A64);
        }

        if(arg2 < 3400) {
            return id.as(arg2, arg3, arg4, 1701022063);
        }

        if(arg2 < 3500) {
            return ml.ak(arg2, arg3, arg4, 0x6A0CFB55);
        }

        if(arg2 < 3700) {
            return at.ac(arg2, arg3, arg4, -84);
        }

        if(arg2 < 4000) {
            return co.bd(arg2, arg3, arg4, 0x7B3051F6);
        }

        if(arg2 < 4100) {
            return ct.ba(arg2, arg3, arg4, 0xF9F4DA2D);
        }

        if(arg2 < 4200) {
            return gc.bf(arg2, arg3, arg4, 0);
        }

        if(arg2 < 4300) {
            return ga.bn(arg2, arg3, arg4, 0x5F5BEE0D);
        }

        if(arg2 < 5100) {
            return ff.bp(arg2, arg3, arg4, 0xF5A4C1A6);
        }

        if(arg2 < 5400) {
            return fd.bw(arg2, arg3, arg4, 1664461081);
        }

        if(arg2 < 5600) {
            return ee.bo(arg2, arg3, arg4, 0x3CF365C5);
        }

        if(arg2 < 5700) {
            return dv.by(arg2, arg3, arg4, 0xD0C61B9A);
        }

        if(arg2 < 6300) {
            return cj.bq(arg2, arg3, arg4, 12);
        }

        if(arg2 < 6600) {
            return dc.bx(arg2, arg3, arg4, -1141006619);
        }

        if(arg2 < 6700) {
            return gq.bg(arg2, arg3, arg4, 110);
        }

        return 2;
    }

    static int bu(int arg2, hl arg3, boolean arg4) {
        if(arg2 < 1000) {
            return bm.ar(arg2, arg3, arg4, 34);
        }

        if(arg2 < 1100) {
            return az.an(arg2, arg3, arg4, 0xF751F7F3);
        }

        if(arg2 < 1200) {
            return fg.ap(arg2, arg3, arg4, -70064523);
        }

        if(arg2 < 0x17B601C) {
            return kg.aj(arg2, arg3, arg4, 781602467);
        }

        if(arg2 < 0x498FA9BF) {
            return fd.ad(arg2, arg3, arg4, 0x1F675B3D);
        }

        int v1 = 0x662278C1;
        if(arg2 < 0x95F420BF) {
            return as.ai(arg2, arg3, arg4, v1);
        }

        if(arg2 < 1600) {
            return bx.av(arg2, arg3, arg4, 1212670285);
        }

        if(arg2 < 1700) {
            return fe.aa(arg2, arg3, arg4, -2);
        }

        if(arg2 < 1800) {
            return fq.au(arg2, arg3, arg4, -1049744321);
        }

        if(arg2 < 1900) {
            return du.am(arg2, arg3, arg4, 0x7BEFE244);
        }

        if(arg2 < 0x96634675) {
            return ap.az(arg2, arg3, arg4, 0x69C57B71);
        }

        if(arg2 < 2100) {
            return az.an(arg2, arg3, arg4, 0x5A2F6C6);
        }

        if(arg2 < 0x6950A9FD) {
            return fg.ap(arg2, arg3, arg4, 0x6F6812EF);
        }

        if(arg2 < 1658620325) {
            return kg.aj(arg2, arg3, arg4, 0x3F499A26);
        }

        if(arg2 < 2400) {
            return fd.ad(arg2, arg3, arg4, 0xE8667D1E);
        }

        if(arg2 < -1303072222) {
            return as.ai(arg2, arg3, arg4, v1);
        }

        if(arg2 < -783858540) {
            return dc.ag(arg2, arg3, arg4, 0);
        }

        if(arg2 < 0xA79F6FC4) {
            return gg.ah(arg2, arg3, arg4, 0x80BA9F7C);
        }

        if(arg2 < 390363117) {
            return hy.at(arg2, arg3, arg4, 0xFB017F9E);
        }

        if(arg2 < 930092935) {
            return bf.ay(arg2, arg3, arg4, 0xCB8FC6E2);
        }

        if(arg2 < -59089946) {
            return ap.az(arg2, arg3, arg4, 1220802850);
        }

        if(arg2 < 3200) {
            return cd.aw(arg2, arg3, arg4, 0x46A74B41);
        }

        if(arg2 < 3300) {
            return ct.ao(arg2, arg3, arg4, 1607009413);
        }

        if(arg2 < 3400) {
            return id.as(arg2, arg3, arg4, 0x6E1A5084);
        }

        if(arg2 < 3500) {
            return ml.ak(arg2, arg3, arg4, 0x7900FF62);
        }

        if(arg2 < 0x1178EF3B) {
            return at.ac(arg2, arg3, arg4, -63);
        }

        if(arg2 < 4000) {
            return co.bd(arg2, arg3, arg4, 0x74FA6180);
        }

        if(arg2 < 4100) {
            return ct.ba(arg2, arg3, arg4, 0x663EDA6D);
        }

        if(arg2 < 4200) {
            return gc.bf(arg2, arg3, arg4, 0);
        }

        if(arg2 < 4300) {
            return ga.bn(arg2, arg3, arg4, 0x6B3FB225);
        }

        if(arg2 < 5100) {
            return ff.bp(arg2, arg3, arg4, 0x5CDC0375);
        }

        if(arg2 < 5400) {
            return fd.bw(arg2, arg3, arg4, -1693109046);
        }

        if(arg2 < 5600) {
            return ee.bo(arg2, arg3, arg4, 0xF922E808);
        }

        if(arg2 < 5700) {
            return dv.by(arg2, arg3, arg4, 0xD0C61B9A);
        }

        if(arg2 < 6300) {
            return cj.bq(arg2, arg3, arg4, 25);
        }

        if(arg2 < 510650858) {
            return dc.bx(arg2, arg3, arg4, 0xCC4610DA);
        }

        if(arg2 < 6700) {
            return gq.bg(arg2, arg3, arg4, 0x5F);
        }

        return 2;
    }

    static int ca(int arg9, hl arg10, boolean arg11) {
        int[] v9;
        ar v11_1;
        int v10_1;
        int v0 = -1;
        int v1 = 0x4A90AB9;
        int v2 = 1304812425;
        if(arg9 >= 2000) {
            arg9 += -1000;
            int[] v10 = il.aj;
            int v11 = il.ad - v1;
            il.ad = v11;
            v10_1 = v10[v11 * v2];
            v11_1 = bl.al(v10_1, 0x64D7CF4D);
        }
        else {
            ar v10_2 = arg11 ? il.aa : dw.av;
            v11_1 = v10_2;
            v10_1 = -1;
        }

        int v4 = 0x4A7987DB;
        int v5 = 0x12A42AE4;
        int v6 = 2;
        boolean v7 = false;
        if(1000 == arg9) {
            il.ad -= v5;
            v11_1.ba = il.aj[il.ad * v2] * 0x1DF76BD7;
            v11_1.bf = il.aj[il.ad * v2 + 1] * 0x4C710A11;
            v11_1.as = il.aj[il.ad * v2 + v6] * -1859830651;
            v11_1.ak = il.aj[il.ad * v2 + 3] * 0xB55C4B8D;
            kx.gw(v11_1, 0x7F38404B);
            client.al.fp(v11_1, -102491805);
            if(v0 != v10_1 && v11_1.ay * v4 == 0) {
                ad.fw(ar.aj[v10_1 >> 16], v11_1, false, 0xC6643201);
            }

            return 1;
        }

        if(1001 == arg9) {
            il.ad -= v5;
            v11_1.bn = il.aj[il.ad * v2] * 0xA8AD630F;
            v11_1.bp = il.aj[il.ad * v2 + 1] * 0x38D01227;
            v11_1.ac = il.aj[il.ad * v2 + v6] * 1261109601;
            v11_1.bd = il.aj[il.ad * v2 + 3] * 0x4F1860C9;
            kx.gw(v11_1, 0x7F5E9239);
            client.al.fp(v11_1, 0xFDA67005);
            if(v0 != v10_1 && v11_1.ay * v4 == 0) {
                ad.fw(ar.aj[v10_1 >> 16], v11_1, false, 0xC60D22EE);
            }

            return 1;
        }

        if(1003 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            if(v11_1.bg != v7) {
                v11_1.bg = v7;
                kx.gw(v11_1, 0x7FC87875);
            }

            return 1;
        }

        if(1005 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            v11_1.gs = v7;
            return 1;
        }

        if(arg9 == 1006) {
            v9 = il.aj;
            v10_1 = il.ad - v1;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v7 = true;
            }

            v11_1.ga = v7;
            return 1;
        }

        return v6;
    }

    static int cb(int arg6, hl arg7, boolean arg8) {
        ar v8_1;
        int v1;
        int v7 = 0x4A90AB9;
        int v0 = 1304812425;
        if(arg6 >= 2000) {
            arg6 += -1000;
            int[] v8 = il.aj;
            v1 = il.ad - v7;
            il.ad = v1;
            v8_1 = bl.al(v8[v1 * v0], 0x64D7CF4D);
        }
        else if(arg8) {
            v8_1 = il.aa;
        }
        else {
            v8_1 = dw.av;
        }

        kx.gw(v8_1, 0x7FB8217D);
        int v2 = 0x4BC;
        int v3 = 1205;
        if(arg6 != 1200 && v3 != arg6) {
            if(arg6 == v2) {
            }
            else {
                v2 = 0x6015A63B;
                if(arg6 == 1201) {
                    v8_1.cp = -1296555170;
                    int[] v6 = il.aj;
                    v1 = il.ad - v7;
                    il.ad = v1;
                    v8_1.ci = v6[v1 * v0] * v2;
                    return 1;
                }
                else if(arg6 == 1202) {
                    v8_1.cp = 202650893;
                    v8_1.ci = gu.jg.al.aq(-116) * v2;
                    return 1;
                }
                else {
                    return 2;
                }
            }
        }

        il.ad -= 0x9521572;
        v7 = il.aj[il.ad * v0];
        v0 = il.aj[il.ad * v0 + 1];
        v8_1.fq = 162011503 * v7;
        v8_1.fp = v0 * 311012663;
        dr v7_1 = client.al(v7, 1801850583);
        v8_1.cl = v7_1.ak * 0xE20C76AB;
        v8_1.ck = v7_1.ac * 0xCEACC4B9;
        v8_1.cm = v7_1.bd * 1468130953;
        v8_1.cz = v7_1.ba * 0xE5BE408F;
        v8_1.cn = v7_1.bf * 0xDAB63F35;
        v8_1.ct = v7_1.as * 0x43EFA677;
        v0 = 0;
        if(arg6 == v3) {
            v8_1.co = 0;
        }
        else {
            arg6 = arg6 == v2 ? 1 : 0;
            if(1 == v7_1.bn * 401368599) {
                v0 = 1;
            }

            if((arg6 | v0) != 0) {
                v8_1.co = 0x64AA6033;
                goto label_120;
            }

            v8_1.co = 0xC954C066;
        }

    label_120:
        v7 = -1377940245;
        v0 = 0x2CDAC8F9;
        v1 = 0xAEF2920;
        if(v8_1.cu * v7 > 0) {
            v8_1.ct = v8_1.ct * v1 / (v8_1.cu * v7) * v0;
        }
        else {
            v7 = -1380766737;
            if(v8_1.bn * v7 > 0) {
                v8_1.ct = v8_1.ct * v1 / (v8_1.bn * v7) * v0;
            }
        }

        return 1;
    }

    static int cc(int arg9, hl arg10, boolean arg11) {
        int[] v11_2;
        byte[] v9_2;
        byte[] v5_2;
        String[] v9_1;
        int v0_1;
        int[] v9;
        ar v10_1;
        int v11;
        boolean v0 = false;
        int v1 = 0x4A90AB9;
        int v2 = 1304812425;
        if(arg9 >= 2000) {
            arg9 += -1000;
            int[] v10 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1 = bl.al(v10[v11 * v2], 0x64D7CF4D);
            v11 = 0;
        }
        else {
            v10_1 = arg11 ? il.aa : dw.av;
            v11 = 1;
        }

        int v5 = 0xBC5CDEAD;
        int v6 = 9;
        int v7 = 0x8FA23525;
        if(arg9 == 1300) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            arg9 = v9[v11 * v2] - 1;
            if(arg9 >= 0) {
                if(arg9 > v6) {
                }
                else {
                    String[] v11_1 = il.aq;
                    v0_1 = ft.ab - v7;
                    ft.ab = v0_1;
                    v10_1.az(arg9, v11_1[v0_1 * v5], -2108860552);
                    return 1;
                }
            }

            ft.ab -= v7;
            return 1;
        }

        int v8 = 0x9521572;
        if(1301 == arg9) {
            il.ad -= v8;
            v10_1.dg = eh.ae(il.aj[il.ad * v2], il.aj[il.ad * v2 + 1], 690802749);
            return 1;
        }

        if(arg9 == 1302) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            if(v9[v11 * v2] == 1) {
                v0 = true;
            }

            v10_1.ea = v0;
            return 1;
        }

        if(1303 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1.ek = v9[v11 * v2] * -2086256801;
            return 1;
        }

        if(1304 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1.ez = v9[v11 * v2] * 0x20A164D9;
            return 1;
        }

        if(1305 == arg9) {
            v9_1 = il.aq;
            v11 = ft.ab - v7;
            ft.ab = v11;
            v10_1.dt = v9_1[v11 * v5];
            return 1;
        }

        if(arg9 == 1306) {
            v9_1 = il.aq;
            v11 = ft.ab - v7;
            ft.ab = v11;
            v10_1.er = v9_1[v11 * v5];
            return 1;
        }

        String[] v5_1 = null;
        if(1307 == arg9) {
            v10_1.dd = v5_1;
            return 1;
        }

        if(1308 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            if(v9[v11 * v2] == 1) {
                v0 = true;
            }

            v10_1.gj = v0;
            return 1;
        }

        v7 = 10;
        if(1350 == arg9) {
            if(v11 != 0) {
                il.ad -= 781871930;
                while((((int)v0)) < v7) {
                    if(il.aj[il.ad * v2 + (((int)v0))] < 0) {
                    }
                    else {
                        v0_1 = (((int)v0)) + 2;
                        continue;
                    }

                    break;
                }

                if((((int)v0)) > 0) {
                    arg9 = (((int)v0)) / 2;
                    v5_2 = new byte[arg9];
                    v9_2 = new byte[arg9];
                    goto label_164;
                }

                v9_2 = ((byte[])v5_1);
                goto label_203;
                while(true) {
                label_164:
                    v0_1 = (((int)v0)) - 2;
                    if(v0_1 < 0) {
                        break;
                    }

                    v11 = v0_1 / 2;
                    v5_2[v11] = ((byte)il.aj[il.ad * v2 + v0_1]);
                    v9_2[v11] = ((byte)il.aj[il.ad * v2 + v0_1 + 1]);
                }
            }
            else {
                il.ad -= v8;
                v5_2 = new byte[]{((byte)il.aj[il.ad * v2])};
                v9_2 = new byte[]{((byte)il.aj[il.ad * v2 + 1])};
            }

        label_203:
            v11_2 = il.aj;
            v0_1 = il.ad - v1;
            il.ad = v0_1;
            v11 = v11_2[v0_1 * v2] - 1;
            if(v11 >= 0 && v11 <= v6) {
                fa.aq(v10_1, v11, v5_2, v9_2, 592509060);
                return 1;
            }

            throw new RuntimeException();
        }

        if(arg9 == 0x547) {
            il.ad -= v8;
            fa.aq(v10_1, v7, new byte[]{((byte)il.aj[il.ad * v2])}, new byte[]{((byte)il.aj[il.ad * v2 + 1])}, 0x2A68C3EF);
            return 1;
        }

        v0_1 = 2;
        if(arg9 == 0x548) {
            il.ad -= 0xDFB202B;
            arg9 = il.aj[il.ad * v2] - 1;
            v11 = il.aj[il.ad * v2 + 1];
            v0_1 = il.aj[il.ad * v2 + v0_1];
            if(arg9 >= 0 && arg9 <= v6) {
                jh.ab(v10_1, arg9, v11, v0_1, 1);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0x549 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            arg9 = v9[v11 * v2];
            v11_2 = il.aj;
            v0_1 = il.ad - v1;
            il.ad = v0_1;
            jh.ab(v10_1, v7, arg9, v11_2[v0_1 * v2], 1);
            return 1;
        }

        if(arg9 == 0x54A) {
            il.ad -= v1;
            arg9 = il.aj[il.ad * v2] - 1;
            if(arg9 >= 0 && arg9 <= v6) {
                ir.af(v10_1, arg9, 0x69794B78);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0x54B == arg9) {
            ir.af(v10_1, v7, 1458301614);
            return 1;
        }

        return v0_1;
    }

    static int cd(int arg7, hl arg8, boolean arg9) {
        int[] v7;
        ar v9_1;
        int v8_1;
        int v0 = -1;
        int v1 = 1304812425;
        if(arg7 >= 0x6D7F2844) {
            arg7 += -1000;
            int[] v8 = il.aj;
            int v9 = il.ad + 0x3A1C226C;
            il.ad = v9;
            v8_1 = v8[v9 * v1];
            v9_1 = bl.al(v8_1, 0x64D7CF4D);
        }
        else {
            ar v8_2 = arg9 ? il.aa : dw.av;
            v9_1 = v8_2;
            v8_1 = -1;
        }

        if(1100 == arg7) {
            il.ad -= 0xCCE1FCFF;
            dp.gy(v9_1, il.aj[il.ad * 0x9722453A], il.aj[il.ad * v1 + 1], 0x7EEB1A3E);
            return 1;
        }

        if(0x53257554 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad + 0x117086D9;
            il.ad = v8_1;
            v9_1.bk = v7[v8_1 * v1] * 1986505587;
            kx.gw(v9_1, 0x7F1A4100);
            return 1;
        }

        boolean v4 = false;
        if(arg7 == 1074092057) {
            v7 = il.aj;
            v8_1 = il.ad - 0x14A79B6A;
            il.ad = v8_1;
            if(v7[v8_1 * -1201788393] == 1) {
                v4 = true;
            }

            v9_1.bs = v4;
            kx.gw(v9_1, 0x7FF30045);
            return 1;
        }

        int v5 = 0x4A90AB9;
        if(arg7 == 0x44F) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.bl = v7[v8_1 * v1] * 0xAE3ED1F5;
            kx.gw(v9_1, 0x7FDA601F);
            return 1;
        }

        if(arg7 == 0xF2ACEF4C) {
            v7 = il.aj;
            v8_1 = il.ad + 1769638950;
            il.ad = v8_1;
            v9_1.bi = v7[v8_1 * v1] * 0x3344AF69;
            kx.gw(v9_1, 0x7F1D977D);
            return 1;
        }

        if(0x11BA5095 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.cj = v7[v8_1 * 0x9D4F3176] * -1904294097;
            kx.gw(v9_1, 0x7FC0D65B);
            return 1;
        }

        if(1106 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.cf = v7[v8_1 * -2001581756] * 0x2B2DD8D;
            kx.gw(v9_1, 0x7F74C313);
            return 1;
        }

        if(1107 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad + 0xB7350F8;
            il.ad = v8_1;
            if(v7[v8_1 * v1] == 1) {
                v4 = true;
            }

            v9_1.cx = v4;
            kx.gw(v9_1, 0x7F995BEE);
            return 1;
        }

        if(arg7 == 1108) {
            v9_1.cp = 1499206063;
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.ci = v7[v8_1 * 0x14BC28E0] * 0x6015A63B;
            kx.gw(v9_1, 0x7F653E74);
            return 1;
        }

        int v6 = 2;
        if(arg7 == 1503454853) {
            il.ad -= 0x4E29FABF;
            v9_1.cz = il.aj[il.ad * 0xF73903DC] * 0x330632D9;
            v9_1.cn = il.aj[il.ad * v1 + 1] * 0xDB84F7C3;
            v9_1.cl = il.aj[il.ad * -1809271237 + v6] * 0xF4DE7A1B;
            v9_1.ck = il.aj[il.ad * v1 + 3] * 0x6778A1C7;
            v9_1.cm = il.aj[il.ad * -649161083 + 4] * 0x993FCE2A;
            v9_1.ct = il.aj[il.ad * 0x7288CEAF + 5] * 0x2CDAC8F9;
            kx.gw(v9_1, 0x7F9B9BFE);
            return 1;
        }

        if(0xB1F1DB0A == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            arg7 = v7[v8_1 * v1];
            if(v9_1.ce * 0xC2A43CD1 != arg7) {
                v9_1.ce = arg7 * 0xDB19C31;
                v9_1.fw = 0;
                v9_1.ft = 0;
                kx.gw(v9_1, 0x7FBC76CD);
            }

            return 1;
        }

        if(arg7 == 1082518083) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            if(v7[v8_1 * 0xA87168F1] == 1) {
                v4 = true;
            }

            v9_1.cv = v4;
            kx.gw(v9_1, 0x7FC03CD3);
            return 1;
        }

        if(304095862 == arg7) {
            String[] v7_1 = il.aq;
            v8_1 = ft.ab + 0x705DCADB;
            ft.ab = v8_1;
            String v7_2 = v7_1[v8_1 * 0x10EF2DF7];
            if(!v7_2.equals(v9_1.dp)) {
                v9_1.dp = v7_2;
                kx.gw(v9_1, 0x7F983572);
            }

            return 1;
        }

        if(0x459 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.dv = v7[v8_1 * 0xEB9EA217] * 0xA30F5C01;
            kx.gw(v9_1, 0x7F994EC0);
            return 1;
        }

        if(0x45A == arg7) {
            il.ad -= -1419032700;
            v9_1.db = il.aj[il.ad * 0xFB0570FA] * 1592415081;
            v9_1.du = il.aj[il.ad * 0x62FA418C + 1] * 0x1E7BCDB;
            v9_1.dw = il.aj[il.ad * 0xBEABE04 + v6] * 59401630;
            kx.gw(v9_1, 0x7F82DDAE);
            return 1;
        }

        if(arg7 == 0x15DBD88F) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            if(v7[v8_1 * v1] == 1) {
                v4 = true;
            }

            v9_1.dm = v4;
            kx.gw(v9_1, 0x7FB2492B);
            return 1;
        }

        if(arg7 == 0x45C) {
            v7 = il.aj;
            v8_1 = il.ad - 1989470948;
            il.ad = v8_1;
            v9_1.cb = v7[v8_1 * 0x196F5E2] * -2042308401;
            kx.gw(v9_1, 0x7FD1818D);
            return 1;
        }

        if(-139570851 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad + 826652090;
            il.ad = v8_1;
            v9_1.cy = v7[v8_1 * 139090303] * 197540549;
            kx.gw(v9_1, 0x7FB2C131);
            return 1;
        }

        if(arg7 == 0x45E) {
            v7 = il.aj;
            v8_1 = il.ad + 1733077937;
            il.ad = v8_1;
            if(v7[v8_1 * v1] == 1) {
                v4 = true;
            }

            v9_1.cw = v4;
            kx.gw(v9_1, 0x7F5F2C75);
            return 1;
        }

        if(arg7 == 1061783770) {
            v7 = il.aj;
            v8_1 = il.ad + 0x5A2B2F51;
            il.ad = v8_1;
            if(v7[v8_1 * v1] == 1) {
                v4 = true;
            }

            v9_1.cc = v4;
            kx.gw(v9_1, 0x7F69B697);
            return 1;
        }

        if(0x460 == arg7) {
            il.ad -= 1020936023;
            v9_1.bb = il.aj[il.ad * 0x31E0D55F] * 0x8D317F86;
            v9_1.bc = il.aj[il.ad * v1 + 1] * 0x675B540F;
            kx.gw(v9_1, 0x7FAE1F04);
            if(v0 != v8_1 && v9_1.ay * 0x4A7987DB == 0) {
                ad.fw(ar.aj[v8_1 >> 16], v9_1, false, 0xEC6AAE8E);
            }

            return 1;
        }

        if(arg7 == 0x461) {
            ck.fc(v9_1.ah * 0x8BF819EC, v9_1.at * 990760021, 43);
            client.lp = v9_1;
            kx.gw(v9_1, 0x7F74031F);
            return 1;
        }

        if(-2037957982 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.cd = v7[v8_1 * v1] * -1914508841;
            kx.gw(v9_1, 0x7F9B23D6);
            return 1;
        }

        if(arg7 == 0x463) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            v9_1.bm = v7[v8_1 * 0x10FE998B] * 0x8EECFC4F;
            kx.gw(v9_1, 0x7FA71118);
            return 1;
        }

        if(0x464 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - 0x6FD60383;
            il.ad = v8_1;
            v9_1.br = v7[v8_1 * 0xCC10003F] * 0x5C9BD055;
            kx.gw(v9_1, 0x7F4942EB);
            return 1;
        }

        if(0xBC658858 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad + 0x71FCE43F;
            il.ad = v8_1;
            lh v7_3 = eh.ax(iu.al(0x600B0057), v7[v8_1 * v1], 0x59F39AE3);
            if(v7_3 != null) {
                v9_1.be = ((ex)v7_3);
                kx.gw(v9_1, 0x7F3DFF02);
            }

            return 1;
        }

        if(arg7 == 0x466) {
            v7 = il.aj;
            v8_1 = il.ad - v5;
            il.ad = v8_1;
            if(v7[v8_1 * -314985054] == 1) {
                v4 = true;
            }

            v9_1.ca = v4;
            return 1;
        }

        if(0x467 == arg7) {
            v7 = il.aj;
            v8_1 = il.ad - 0x510109F1;
            il.ad = v8_1;
            if(v7[v8_1 * 1504139751] == 1) {
                v4 = true;
            }

            v9_1.cg = v4;
            return 1;
        }

        return v6;
    }

    static final void ce(ar arg1, int arg2, int arg3, int arg4) {
        if(arg1.dx != null) {
            arg1.dx[arg2] = arg3;
            arg1.di[arg2] = arg4;
            return;
        }

        throw new RuntimeException();
    }

    static int cf(int arg8, hl arg9, boolean arg10) {
        int[] v8;
        ar v10_1;
        int v9_1;
        int v0 = -1;
        int v1 = 0x4A90AB9;
        if(arg8 >= 2000) {
            arg8 += -1000;
            int[] v9 = il.aj;
            int v10 = il.ad - v1;
            il.ad = v10;
            v9_1 = v9[v10 * 724726590];
            v10_1 = bl.al(v9_1, 0x64D7CF4D);
        }
        else {
            ar v9_2 = arg10 ? il.aa : dw.av;
            v10_1 = v9_2;
            v9_1 = -1;
        }

        int v3 = 0x9521572;
        int v4 = 1304812425;
        if(1004180186 == arg8) {
            il.ad -= v3;
            dp.gy(v10_1, il.aj[il.ad * 0x15BE95EF], il.aj[il.ad * v4 + 1], 0x7DD7DF14);
            return 1;
        }

        if(1101 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - 568061512;
            il.ad = v9_1;
            v10_1.bk = v8[v9_1 * v4] * 1986505587;
            kx.gw(v10_1, 0x7F61060B);
            return 1;
        }

        boolean v6 = false;
        if(arg8 == 1102) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v4] == 1) {
                v6 = true;
            }

            v10_1.bs = v6;
            kx.gw(v10_1, 0x7F202BF9);
            return 1;
        }

        if(arg8 == 0x44F) {
            v8 = il.aj;
            v9_1 = il.ad - 1270409871;
            il.ad = v9_1;
            v10_1.bl = v8[v9_1 * 0x2AD16A9C] * 0xAE3ED1F5;
            kx.gw(v10_1, 0x7F4E7FCD);
            return 1;
        }

        if(arg8 == 0x8203A2B5) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bi = v8[v9_1 * 0xB51733F5] * -1171804701;
            kx.gw(v10_1, 0x7FE19340);
            return 1;
        }

        if(1105 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cj = v8[v9_1 * 0x65816308] * -1904294097;
            kx.gw(v10_1, 0x7FB90B43);
            return 1;
        }

        if(1106 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cf = v8[v9_1 * 0x3E449BCF] * -624610089;
            kx.gw(v10_1, 0x7F73F57A);
            return 1;
        }

        if(1107 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - 0x48FD04F5;
            il.ad = v9_1;
            if(v8[v9_1 * v4] == 1) {
                v6 = true;
            }

            v10_1.cx = v6;
            kx.gw(v10_1, 0x7FF1D633);
            return 1;
        }

        if(arg8 == 1108) {
            v10_1.cp = 0x8289506;
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.ci = v8[v9_1 * v4] * -407052981;
            kx.gw(v10_1, 0x7F4AC282);
            return 1;
        }

        int v7 = 2;
        if(arg8 == 1109) {
            il.ad -= 0x1BF64056;
            v10_1.cz = il.aj[il.ad * v4] * 0xBB2BF852;
            v10_1.cn = il.aj[il.ad * v4 + 1] * 0xDB84F7C3;
            v10_1.cl = il.aj[il.ad * -1705885390 + v7] * 0xD0A4CD42;
            v10_1.ck = il.aj[il.ad * -1401637036 + 3] * 0x6778A1C7;
            v10_1.cm = il.aj[il.ad * v4 + 4] * 0x16D65EB1;
            v10_1.ct = il.aj[il.ad * v4 + 5] * 0x2CDAC8F9;
            kx.gw(v10_1, 0x7F35C101);
            return 1;
        }

        if(0xA1B3F103 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            arg8 = v8[v9_1 * v4];
            if(v10_1.ce * 0xC2A43CD1 != arg8) {
                v10_1.ce = arg8 * 0xDB19C31;
                v10_1.fw = 0;
                v10_1.ft = 0;
                kx.gw(v10_1, 0x7FF923A8);
            }

            return 1;
        }

        if(arg8 == 0x5A43E287) {
            v8 = il.aj;
            v9_1 = il.ad + 0x4E3F50B8;
            il.ad = v9_1;
            if(v8[v9_1 * 0x6212FB63] == 1) {
                v6 = true;
            }

            v10_1.cv = v6;
            kx.gw(v10_1, 0x7FD09B21);
            return 1;
        }

        if(-1041533814 == arg8) {
            String[] v8_1 = il.aq;
            v9_1 = ft.ab + 0x705DCADB;
            ft.ab = v9_1;
            String v8_2 = v8_1[v9_1 * 0xBC5CDEAD];
            if(!v8_2.equals(v10_1.dp)) {
                v10_1.dp = v8_2;
                kx.gw(v10_1, 0x7FFA6C82);
            }

            return 1;
        }

        if(0x3801FC9F == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.dv = v8[v9_1 * v4] * 0xA30F5C01;
            kx.gw(v10_1, 0x7F212C8F);
            return 1;
        }

        if(-1159602985 == arg8) {
            il.ad -= 0xDFB202B;
            v10_1.db = il.aj[il.ad * v4] * 233038230;
            v10_1.du = il.aj[il.ad * -736408293 + 1] * 1060448983;
            v10_1.dw = il.aj[il.ad * 0x811D4E89 + v7] * 0x4C0B2F71;
            kx.gw(v10_1, 0x7F1159FF);
            return 1;
        }

        if(arg8 == 0x45B) {
            v8 = il.aj;
            v9_1 = il.ad - 0x5D3E1EB7;
            il.ad = v9_1;
            if(v8[v9_1 * v4] == 1) {
                v6 = true;
            }

            v10_1.dm = v6;
            kx.gw(v10_1, 0x7FE6CCAB);
            return 1;
        }

        if(arg8 == 0x8CC342F4) {
            v8 = il.aj;
            v9_1 = il.ad + 0x1C440D6;
            il.ad = v9_1;
            v10_1.cb = v8[v9_1 * 0xE134F2FE] * 1901270207;
            kx.gw(v10_1, 0x7FB76416);
            return 1;
        }

        if(0x45D == arg8) {
            v8 = il.aj;
            v9_1 = il.ad + 931703690;
            il.ad = v9_1;
            v10_1.cy = v8[v9_1 * v4] * 0xE5900FB4;
            kx.gw(v10_1, 0x7FFA0948);
            return 1;
        }

        if(arg8 == 0x45E) {
            v8 = il.aj;
            v9_1 = il.ad - 0x4A0398D5;
            il.ad = v9_1;
            if(v8[v9_1 * v4] == 1) {
                v6 = true;
            }

            v10_1.cw = v6;
            kx.gw(v10_1, 0x7F519ABE);
            return 1;
        }

        if(arg8 == 404407293) {
            v8 = il.aj;
            v9_1 = il.ad - 131980802;
            il.ad = v9_1;
            if(v8[v9_1 * v4] == 1) {
                v6 = true;
            }

            v10_1.cc = v6;
            kx.gw(v10_1, 0x7F7F030B);
            return 1;
        }

        if(0x460 == arg8) {
            il.ad -= v3;
            v10_1.bb = il.aj[il.ad * v4] * 0x62095D83;
            v10_1.bc = il.aj[il.ad * v4 + 1] * 400015593;
            kx.gw(v10_1, 0x7F59FB08);
            if(v0 != v9_1 && v10_1.ay * 1445402704 == 0) {
                ad.fw(ar.aj[v9_1 >> 16], v10_1, false, 0xC6FF0A17);
            }

            return 1;
        }

        if(arg8 == 0xC46FAA4D) {
            ck.fc(v10_1.ah * 971580097, v10_1.at * 990760021, 50);
            client.lp = v10_1;
            kx.gw(v10_1, 0x7F128773);
            return 1;
        }

        if(1051120857 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cd = v8[v9_1 * 0xE4651861] * -1914508841;
            kx.gw(v10_1, 0x7F23555B);
            return 1;
        }

        if(arg8 == 0xFBE3B88B) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bm = v8[v9_1 * v4] * 0x8EECFC4F;
            kx.gw(v10_1, 0x7FA56004);
            return 1;
        }

        if(0x25B56891 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - 0x7D676C7F;
            il.ad = v9_1;
            v10_1.br = v8[v9_1 * v4] * 269980093;
            kx.gw(v10_1, 0x7F50365F);
            return 1;
        }

        if(0xAAF39DC == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - 0x2B7E2EE7;
            il.ad = v9_1;
            lh v8_3 = eh.ax(iu.al(0x559FACCE), v8[v9_1 * 861400700], 0xCE311B0);
            if(v8_3 != null) {
                v10_1.be = ((ex)v8_3);
                kx.gw(v10_1, 0x7F56EAD4);
            }

            return 1;
        }

        if(arg8 == 1660271002) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * 0x276B75A5] == 1) {
                v6 = true;
            }

            v10_1.ca = v6;
            return 1;
        }

        if(0x200948D8 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * 0x89D6FE78] == 1) {
                v6 = true;
            }

            v10_1.cg = v6;
            return 1;
        }

        return v7;
    }

    static int cg(int arg3, hl arg4, boolean arg5) {
        int v5;
        int[] v3;
        ar v4 = arg5 ? il.aa : dw.av;
        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(1600 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bz * 0x55D2B057;
            return 1;
        }

        if(1601 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bh * 0x4407680D;
            return 1;
        }

        if(1602 == arg3) {
            String[] v3_1 = il.aq;
            v5 = ft.ab - 0x705DCADB;
            ft.ab = v5;
            v3_1[v5 * 0xBC5CDEAD - 1] = v4.dp;
            return 1;
        }

        if(1603 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bb * 0x83EA0C19;
            return 1;
        }

        if(arg3 == 1604) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bc * 1153505113;
            return 1;
        }

        if(arg3 == 1605) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.ct * 0x80577949;
            return 1;
        }

        if(1606 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.cl * 8000905;
            return 1;
        }

        if(arg3 == 1607) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.cm * 0xC9EFBC3;
            return 1;
        }

        if(arg3 == 1608) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.ck * 0x21D4CFF7;
            return 1;
        }

        if(arg3 == 1609) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bl * 0xBB0925D;
            return 1;
        }

        if(1610 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.br * 0x379F3195;
            return 1;
        }

        if(arg3 == 0x64B) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bk * 0xC0871BB;
            return 1;
        }

        if(0x64C == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bm * 0x5A489AAF;
            return 1;
        }

        if(0x64D == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.be.ax(80811181);
            return 1;
        }

        if(0x64E == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v5 = v5 * v0 - 1;
            int v4_1 = v4.cg ? 1 : 0;
            v3[v5] = v4_1;
            return 1;
        }

        return 2;
    }

    static final void ch(ar arg1, int arg2, int arg3, int arg4) {
        if(arg1.dx != null) {
            arg1.dx[arg2] = arg3;
            arg1.di[arg2] = arg4;
            return;
        }

        throw new RuntimeException();
    }

    static final void ci(ar arg2, int arg3, byte[] arg4, byte[] arg5) {
        if(arg2.dr == null) {
            if(arg4 != null) {
                arg2.dr = new byte[11][];
                arg2.dn = new byte[11][];
                arg2.dx = new int[11];
                arg2.di = new int[11];
            }
            else {
                return;
            }
        }

        arg2.dr[arg3] = arg4;
        if(arg4 != null) {
            arg2.dl = true;
        }
        else {
            int v4 = 0;
            arg2.dl = false;
            while(v4 < arg2.dr.length) {
                if(arg2.dr[v4] != null) {
                    arg2.dl = true;
                }
                else {
                    ++v4;
                    continue;
                }

                break;
            }
        }

        arg2.dn[arg3] = arg5;
    }

    static int cj(int arg8, hl arg9, boolean arg10) {
        int[] v8;
        ar v10_1;
        int v9_1;
        int v0 = -1;
        int v1 = 0x4A90AB9;
        int v2 = 1304812425;
        if(arg8 >= 2000) {
            arg8 += -1000;
            int[] v9 = il.aj;
            int v10 = il.ad - v1;
            il.ad = v10;
            v9_1 = v9[v10 * v2];
            v10_1 = bl.al(v9_1, 0x64D7CF4D);
        }
        else {
            ar v9_2 = arg10 ? il.aa : dw.av;
            v10_1 = v9_2;
            v9_1 = -1;
        }

        int v4 = 0x9521572;
        if(1100 == arg8) {
            il.ad -= v4;
            dp.gy(v10_1, il.aj[il.ad * v2], il.aj[il.ad * v2 + 1], 0x7DC68E08);
            return 1;
        }

        if(1101 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bk = v8[v9_1 * v2] * 1986505587;
            kx.gw(v10_1, 0x7F7D9E59);
            return 1;
        }

        boolean v6 = false;
        if(arg8 == 1102) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.bs = v6;
            kx.gw(v10_1, 0x7F17C608);
            return 1;
        }

        if(arg8 == 0x44F) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bl = v8[v9_1 * v2] * 0xAE3ED1F5;
            kx.gw(v10_1, 0x7F29A9E8);
            return 1;
        }

        if(arg8 == 0x450) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bi = v8[v9_1 * v2] * -1171804701;
            kx.gw(v10_1, 0x7F8D7B5A);
            return 1;
        }

        if(1105 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cj = v8[v9_1 * v2] * -1904294097;
            kx.gw(v10_1, 0x7F62BF47);
            return 1;
        }

        if(1106 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cf = v8[v9_1 * v2] * 0x31345FFB;
            kx.gw(v10_1, 0x7FD1BD4A);
            return 1;
        }

        if(1107 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.cx = v6;
            kx.gw(v10_1, 0x7FE2A590);
            return 1;
        }

        if(arg8 == 1108) {
            v10_1.cp = 1499206063;
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.ci = v8[v9_1 * v2] * 0x6015A63B;
            kx.gw(v10_1, 0x7FB10A01);
            return 1;
        }

        int v7 = 2;
        if(arg8 == 1109) {
            il.ad -= 0x1BF64056;
            v10_1.cz = il.aj[il.ad * v2] * 0x330632D9;
            v10_1.cn = il.aj[il.ad * v2 + 1] * 0xDB84F7C3;
            v10_1.cl = il.aj[il.ad * v2 + v7] * 0xE766F0B9;
            v10_1.ck = il.aj[il.ad * v2 + 3] * 0x6778A1C7;
            v10_1.cm = il.aj[il.ad * v2 + 4] * 0xD35B4CEB;
            v10_1.ct = il.aj[il.ad * v2 + 5] * 0x2CDAC8F9;
            kx.gw(v10_1, 0x7F2C103E);
            return 1;
        }

        if(1110 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            arg8 = v8[v9_1 * v2];
            if(v10_1.ce * 0xC2A43CD1 != arg8) {
                v10_1.ce = arg8 * 0xDB19C31;
                v10_1.fw = 0;
                v10_1.ft = 0;
                kx.gw(v10_1, 0x7FAFA2BF);
            }

            return 1;
        }

        if(arg8 == 0x457) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.cv = v6;
            kx.gw(v10_1, 0x7F0AD2B6);
            return 1;
        }

        if(0x458 == arg8) {
            String[] v8_1 = il.aq;
            v9_1 = ft.ab + 0x705DCADB;
            ft.ab = v9_1;
            String v8_2 = v8_1[v9_1 * 0xBC5CDEAD];
            if(!v8_2.equals(v10_1.dp)) {
                v10_1.dp = v8_2;
                kx.gw(v10_1, 0x7FC1F648);
            }

            return 1;
        }

        if(0x459 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.dv = v8[v9_1 * v2] * 0xA30F5C01;
            kx.gw(v10_1, 0x7FD71E0C);
            return 1;
        }

        if(0x45A == arg8) {
            il.ad -= 0xDFB202B;
            v10_1.db = il.aj[il.ad * v2] * 630601259;
            v10_1.du = il.aj[il.ad * v2 + 1] * 1060448983;
            v10_1.dw = il.aj[il.ad * v2 + v7] * 0x4C0B2F71;
            kx.gw(v10_1, 0x7FEDE58B);
            return 1;
        }

        if(arg8 == 0x45B) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.dm = v6;
            kx.gw(v10_1, 0x7F7ADA9E);
            return 1;
        }

        if(arg8 == 0x45C) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cb = v8[v9_1 * v2] * 1901270207;
            kx.gw(v10_1, 0x7F8B4AF9);
            return 1;
        }

        if(0x45D == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cy = v8[v9_1 * v2] * 0x6E2FE0A5;
            kx.gw(v10_1, 0x7F21E5D3);
            return 1;
        }

        if(arg8 == 0x45E) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.cw = v6;
            kx.gw(v10_1, 0x7F1071B4);
            return 1;
        }

        if(arg8 == 0x45F) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.cc = v6;
            kx.gw(v10_1, 0x7F7F5BE1);
            return 1;
        }

        if(0x460 == arg8) {
            il.ad -= v4;
            v10_1.bb = il.aj[il.ad * v2] * 0x75269029;
            v10_1.bc = il.aj[il.ad * v2 + 1] * 400015593;
            kx.gw(v10_1, 0x7F182343);
            if(v0 != v9_1 && v10_1.ay * 0x4A7987DB == 0) {
                ad.fw(ar.aj[v9_1 >> 16], v10_1, false, -500784131);
            }

            return 1;
        }

        if(arg8 == 0x461) {
            ck.fc(v10_1.ah * 971580097, v10_1.at * 990760021, 11);
            client.lp = v10_1;
            kx.gw(v10_1, 0x7FFB2278);
            return 1;
        }

        if(0x462 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.cd = v8[v9_1 * v2] * -1914508841;
            kx.gw(v10_1, 0x7F20C2FE);
            return 1;
        }

        if(arg8 == 0x463) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.bm = v8[v9_1 * v2] * 0x8EECFC4F;
            kx.gw(v10_1, 0x7F21EFD0);
            return 1;
        }

        if(0x464 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            v10_1.br = v8[v9_1 * v2] * 269980093;
            kx.gw(v10_1, 0x7F52DE17);
            return 1;
        }

        if(0x465 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            lh v8_3 = eh.ax(iu.al(0x935F1871), v8[v9_1 * v2], 0x3E44800B);
            if(v8_3 != null) {
                v10_1.be = ((ex)v8_3);
                kx.gw(v10_1, 0x7F90DA23);
            }

            return 1;
        }

        if(arg8 == 0x466) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.ca = v6;
            return 1;
        }

        if(0x467 == arg8) {
            v8 = il.aj;
            v9_1 = il.ad - v1;
            il.ad = v9_1;
            if(v8[v9_1 * v2] == 1) {
                v6 = true;
            }

            v10_1.cg = v6;
            return 1;
        }

        return v7;
    }

    static int ck(int arg12, hl arg13, boolean arg14) {
        int v7;
        int[] v6_1;
        ar v14_1;
        int v0;
        int v13 = 0x4A90AB9;
        if(arg12 >= 0x762CE533) {
            arg12 += -1000;
            int[] v14 = il.aj;
            v0 = il.ad - v13;
            il.ad = v0;
            v14_1 = bl.al(v14[v0 * -1005900380], 0x64D7CF4D);
        }
        else if(arg14) {
            v14_1 = il.aa;
        }
        else {
            v14_1 = dw.av;
        }

        String[] v0_1 = il.aq;
        int v2 = 0x8FA23525;
        int v1 = ft.ab - v2;
        ft.ab = v1;
        String v0_2 = v0_1[v1 * 0xBC5CDEAD];
        int[] v4 = null;
        if(v0_2.length() <= 0 || v0_2.charAt(v0_2.length() - 1) != 89) {
            v6_1 = v4;
        }
        else {
            int[] v1_1 = il.aj;
            int v6 = il.ad - v13;
            il.ad = v6;
            v1 = v1_1[v6 * 0x2738583];
            if(v1 > 0) {
                v6_1 = new int[v1];
                while(true) {
                    v7 = v1 - 1;
                    if(v1 > 0) {
                        v1_1 = il.aj;
                        int v8 = il.ad - v13;
                        il.ad = v8;
                        v6_1[v7] = v1_1[v8 * 0x6076E4CB];
                        v1 = v7;
                        continue;
                    }

                    break;
                }
            }
            else {
                v6_1 = v4;
            }

            v0_2 = v0_2.substring(0, v0_2.length() - 1);
        }

        Object[] v1_2 = new Object[v0_2.length() + 1];
        for(v7 = v1_2.length - 1; v7 >= 1; --v7) {
            if(v0_2.charAt(v7 - 1) == 0x73) {
                String[] v8_1 = il.aq;
                int v9 = ft.ab - v2;
                ft.ab = v9;
                v1_2[v7] = v8_1[v9 * 0xA9A4FAE5];
            }
            else {
                int[] v9_1 = il.aj;
                int v10 = il.ad - v13;
                il.ad = v10;
                v1_2[v7] = new Integer(v9_1[v10 * 0xF131EC74]);
            }
        }

        int[] v13_1 = il.aj;
        v0 = il.ad - 0x57DDC9E8;
        il.ad = v0;
        v13 = v13_1[v0 * 1304812425];
        if(-1 != v13) {
            v1_2[0] = new Integer(v13);
        }
        else {
            v1_2 = ((Object[])v4);
        }

        if(1400 == arg12) {
            v14_1.em = v1_2;
        }
        else if(1401 == arg12) {
            v14_1.el = v1_2;
        }
        else if(1402 == arg12) {
            v14_1.en = v1_2;
        }
        else if(arg12 == 1403) {
            v14_1.ew = v1_2;
        }
        else if(1404 == arg12) {
            v14_1.eg = v1_2;
        }
        else if(1405 == arg12) {
            v14_1.eu = v1_2;
        }
        else if(1406 == arg12) {
            v14_1.es = v1_2;
        }
        else if(arg12 == 0x57F) {
            v14_1.eb = v1_2;
            v14_1.eh = v6_1;
        }
        else if(arg12 == 0x580) {
            v14_1.ef = v1_2;
        }
        else if(1409 == arg12) {
            v14_1.eo = v1_2;
        }
        else if(arg12 == -298005456) {
            v14_1.ee = v1_2;
        }
        else if(arg12 == 2051832262) {
            v14_1.ey = v1_2;
        }
        else if(arg12 == 0x2F7FCF3) {
            v14_1.ev = v1_2;
        }
        else if(0x586 == arg12) {
            v14_1.ec = v1_2;
            v14_1.ei = v6_1;
        }
        else if(arg12 == 0x6C13B61F) {
            v14_1.ex = v1_2;
            v14_1.ep = v6_1;
        }
        else if(0x588 == arg12) {
            v14_1.ed = v1_2;
        }
        else if(arg12 == 0x589) {
            v14_1.et = v1_2;
        }
        else if(arg12 == 1222975099) {
            v14_1.fa = v1_2;
        }
        else if(0x58B == arg12) {
            v14_1.fe = v1_2;
        }
        else if(arg12 == 1420) {
            v14_1.fd = v1_2;
        }
        else if(0x58D == arg12) {
            v14_1.fz = v1_2;
        }
        else if(0x58E == arg12) {
            v14_1.fy = v1_2;
        }
        else if(0x58F == arg12) {
            v14_1.fh = v1_2;
        }
        else if(arg12 == 0x590) {
            v14_1.fl = v1_2;
        }
        else if(0x759453D0 == arg12) {
            v14_1.fv = v1_2;
        }
        else if(arg12 == 0x592) {
            v14_1.fc = v1_2;
        }
        else if(arg12 == 0x593) {
            v14_1.fk = v1_2;
        }
        else {
            return 2;
        }

        v14_1.eq = true;
        return 1;
    }

    static final void cl(ar arg1, int arg2) {
        if(arg1.dr != null) {
            if(arg1.gn == null) {
                arg1.gn = new int[arg1.dr.length];
            }

            arg1.gn[arg2] = 0x732ED86B;
            return;
        }

        throw new RuntimeException();
    }

    static int cm(int arg13, hl arg14, boolean arg15) {
        int v9;
        int[] v8_1;
        ar v15_1;
        int v14 = 1304812425;
        int v0 = 0x4A90AB9;
        if(arg13 >= 2000) {
            arg13 += -1000;
            int[] v15 = il.aj;
            int v1 = il.ad - v0;
            il.ad = v1;
            v15_1 = bl.al(v15[v1 * v14], 0x64D7CF4D);
        }
        else if(arg15) {
            v15_1 = il.aa;
        }
        else {
            v15_1 = dw.av;
        }

        String[] v1_1 = il.aq;
        int v3 = 0x8FA23525;
        int v2 = ft.ab - v3;
        ft.ab = v2;
        int v4 = 0xBC5CDEAD;
        String v1_2 = v1_1[v2 * v4];
        int[] v6 = null;
        if(v1_2.length() <= 0 || v1_2.charAt(v1_2.length() - 1) != 89) {
            v8_1 = v6;
        }
        else {
            int[] v2_1 = il.aj;
            int v8 = il.ad - v0;
            il.ad = v8;
            v2 = v2_1[v8 * v14];
            if(v2 > 0) {
                v8_1 = new int[v2];
                while(true) {
                    v9 = v2 - 1;
                    if(v2 > 0) {
                        v2_1 = il.aj;
                        int v10 = il.ad - v0;
                        il.ad = v10;
                        v8_1[v9] = v2_1[v10 * v14];
                        v2 = v9;
                        continue;
                    }

                    break;
                }
            }
            else {
                v8_1 = v6;
            }

            v1_2 = v1_2.substring(0, v1_2.length() - 1);
        }

        Object[] v2_2 = new Object[v1_2.length() + 1];
        for(v9 = v2_2.length - 1; v9 >= 1; --v9) {
            if(v1_2.charAt(v9 - 1) == 0x73) {
                String[] v10_1 = il.aq;
                int v11 = ft.ab - v3;
                ft.ab = v11;
                v2_2[v9] = v10_1[v11 * v4];
            }
            else {
                int[] v11_1 = il.aj;
                int v12 = il.ad - v0;
                il.ad = v12;
                v2_2[v9] = new Integer(v11_1[v12 * v14]);
            }
        }

        int[] v1_3 = il.aj;
        v3 = il.ad - v0;
        il.ad = v3;
        v14 = v1_3[v3 * v14];
        if(-1 != v14) {
            v2_2[0] = new Integer(v14);
        }
        else {
            v2_2 = ((Object[])v6);
        }

        if(1400 == arg13) {
            v15_1.em = v2_2;
        }
        else if(1401 == arg13) {
            v15_1.el = v2_2;
        }
        else if(1402 == arg13) {
            v15_1.en = v2_2;
        }
        else if(arg13 == 1403) {
            v15_1.ew = v2_2;
        }
        else if(1404 == arg13) {
            v15_1.eg = v2_2;
        }
        else if(1405 == arg13) {
            v15_1.eu = v2_2;
        }
        else if(1406 == arg13) {
            v15_1.es = v2_2;
        }
        else if(arg13 == 0x57F) {
            v15_1.eb = v2_2;
            v15_1.eh = v8_1;
        }
        else if(arg13 == 0x580) {
            v15_1.ef = v2_2;
        }
        else if(1409 == arg13) {
            v15_1.eo = v2_2;
        }
        else if(arg13 == 1410) {
            v15_1.ee = v2_2;
        }
        else if(arg13 == 0x583) {
            v15_1.ey = v2_2;
        }
        else if(arg13 == 0x584) {
            v15_1.ev = v2_2;
        }
        else if(0x586 == arg13) {
            v15_1.ec = v2_2;
            v15_1.ei = v8_1;
        }
        else if(arg13 == 0x587) {
            v15_1.ex = v2_2;
            v15_1.ep = v8_1;
        }
        else if(0x588 == arg13) {
            v15_1.ed = v2_2;
        }
        else if(arg13 == 0x589) {
            v15_1.et = v2_2;
        }
        else if(arg13 == 0x58A) {
            v15_1.fa = v2_2;
        }
        else if(0x58B == arg13) {
            v15_1.fe = v2_2;
        }
        else if(arg13 == 1420) {
            v15_1.fd = v2_2;
        }
        else if(0x58D == arg13) {
            v15_1.fz = v2_2;
        }
        else if(0x58E == arg13) {
            v15_1.fy = v2_2;
        }
        else if(0x58F == arg13) {
            v15_1.fh = v2_2;
        }
        else if(arg13 == 0x590) {
            v15_1.fl = v2_2;
        }
        else if(0x591 == arg13) {
            v15_1.fv = v2_2;
        }
        else if(arg13 == 0x592) {
            v15_1.fc = v2_2;
        }
        else if(arg13 == 0x593) {
            v15_1.fk = v2_2;
        }
        else {
            return 2;
        }

        v15_1.eq = true;
        return 1;
    }

    static final void cn(ar arg1, int arg2) {
        if(arg1.dr != null) {
            if(arg1.gn == null) {
                arg1.gn = new int[arg1.dr.length];
            }

            arg1.gn[arg2] = 0x7FFFFFFF;
            return;
        }

        throw new RuntimeException();
    }

    static int co(int arg3, hl arg4, boolean arg5) {
        int v4_1;
        String[] v3_1;
        int v5;
        int[] v3;
        ar v4 = arg5 ? il.aa : dw.av;
        int v0 = 1304812425;
        if(arg3 == 1800) {
            v3 = il.aj;
            v5 = il.ad + 0x4A90AB9;
            il.ad = v5;
            v3[v5 * v0 - 1] = ct.ae(ib.il(v4, 0xA6BE9C5C), 0x7F0F00B5);
            return 1;
        }

        if(0xCA9F1B56 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x386C55A8;
            il.ad = v5;
            arg3 = v3[v5 * v0] - 1;
            if(v4.dd == null || arg3 >= v4.dd.length || v4.dd[arg3] == null) {
                v3_1 = il.aq;
                v4_1 = ft.ab + 0x4E3AA1D4;
                ft.ab = v4_1;
                v3_1[v4_1 * 2051181503 - 1] = "";
            }
            else {
                String[] v5_1 = il.aq;
                v0 = ft.ab + 1681220118;
                ft.ab = v0;
                v5_1[v0 * -221430660 - 1] = v4.dd[arg3];
            }

            return 1;
        }

        if(0x70A == arg3) {
            if(v4.dt == null) {
                v3_1 = il.aq;
                v4_1 = ft.ab - 0x705DCADB;
                ft.ab = v4_1;
                v3_1[v4_1 * -777762104 - 1] = "";
            }
            else {
                v3_1 = il.aq;
                v5 = ft.ab + 0x504BB050;
                ft.ab = v5;
                v3_1[v5 * 0xBC5CDEAD - 1] = v4.dt;
            }

            return 1;
        }

        return 2;
    }

    static final void cp(ar arg2, int arg3, byte[] arg4, byte[] arg5) {
        if(arg2.dr == null) {
            if(arg4 != null) {
                arg2.dr = new byte[11][];
                arg2.dn = new byte[11][];
                arg2.dx = new int[11];
                arg2.di = new int[11];
            }
            else {
                return;
            }
        }

        arg2.dr[arg3] = arg4;
        if(arg4 != null) {
            arg2.dl = true;
        }
        else {
            int v4 = 0;
            arg2.dl = false;
            while(v4 < arg2.dr.length) {
                if(arg2.dr[v4] != null) {
                    arg2.dl = true;
                }
                else {
                    ++v4;
                    continue;
                }

                break;
            }
        }

        arg2.dn[arg3] = arg5;
    }

    static int cq(int arg3, hl arg4, boolean arg5) {
        int v5;
        int[] v3;
        ar v4 = arg5 ? il.aa : dw.av;
        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(1500 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bw * 0xAFCF1FA3;
            return 1;
        }

        if(1501 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bo * 0xA8B630B5;
            return 1;
        }

        if(arg3 == 1502) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.by * 0x1804E4A5;
            return 1;
        }

        if(arg3 == 0x5DF) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bt * 0x6F0D2CD;
            return 1;
        }

        if(arg3 == 0x5E0) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bg;
            return 1;
        }

        if(arg3 == 1505) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4.bx * 0xBA6F66AD;
            return 1;
        }

        return 2;
    }

    static final void cr(ar arg1, int arg2, int arg3, int arg4) {
        if(arg1.dx != null) {
            arg1.dx[arg2] = arg3;
            arg1.di[arg2] = arg4;
            return;
        }

        throw new RuntimeException();
    }

    static final void cs(ar arg1, int arg2) {
        if(arg1.dr != null) {
            if(arg1.gn == null) {
                arg1.gn = new int[arg1.dr.length];
            }

            arg1.gn[arg2] = 0x7FFFFFFF;
            return;
        }

        throw new RuntimeException();
    }

    static int ct(int arg13, hl arg14, boolean arg15) {
        int v9;
        int[] v8_1;
        ar v15_1;
        int v14 = 1304812425;
        int v0 = 0x4A90AB9;
        if(arg13 >= 2000) {
            arg13 += -1000;
            int[] v15 = il.aj;
            int v1 = il.ad - v0;
            il.ad = v1;
            v15_1 = bl.al(v15[v1 * v14], 0x64D7CF4D);
        }
        else if(arg15) {
            v15_1 = il.aa;
        }
        else {
            v15_1 = dw.av;
        }

        String[] v1_1 = il.aq;
        int v3 = 0x8FA23525;
        int v2 = ft.ab - v3;
        ft.ab = v2;
        int v4 = 0xBC5CDEAD;
        String v1_2 = v1_1[v2 * v4];
        int[] v6 = null;
        if(v1_2.length() <= 0 || v1_2.charAt(v1_2.length() - 1) != 89) {
            v8_1 = v6;
        }
        else {
            int[] v2_1 = il.aj;
            int v8 = il.ad - v0;
            il.ad = v8;
            v2 = v2_1[v8 * v14];
            if(v2 > 0) {
                v8_1 = new int[v2];
                while(true) {
                    v9 = v2 - 1;
                    if(v2 > 0) {
                        v2_1 = il.aj;
                        int v10 = il.ad - v0;
                        il.ad = v10;
                        v8_1[v9] = v2_1[v10 * v14];
                        v2 = v9;
                        continue;
                    }

                    break;
                }
            }
            else {
                v8_1 = v6;
            }

            v1_2 = v1_2.substring(0, v1_2.length() - 1);
        }

        Object[] v2_2 = new Object[v1_2.length() + 1];
        for(v9 = v2_2.length - 1; v9 >= 1; --v9) {
            if(v1_2.charAt(v9 - 1) == 0x73) {
                String[] v10_1 = il.aq;
                int v11 = ft.ab - v3;
                ft.ab = v11;
                v2_2[v9] = v10_1[v11 * v4];
            }
            else {
                int[] v11_1 = il.aj;
                int v12 = il.ad - v0;
                il.ad = v12;
                v2_2[v9] = new Integer(v11_1[v12 * v14]);
            }
        }

        int[] v1_3 = il.aj;
        v3 = il.ad - v0;
        il.ad = v3;
        v14 = v1_3[v3 * v14];
        if(-1 != v14) {
            v2_2[0] = new Integer(v14);
        }
        else {
            v2_2 = ((Object[])v6);
        }

        if(1400 == arg13) {
            v15_1.em = v2_2;
        }
        else if(1401 == arg13) {
            v15_1.el = v2_2;
        }
        else if(1402 == arg13) {
            v15_1.en = v2_2;
        }
        else if(arg13 == 1403) {
            v15_1.ew = v2_2;
        }
        else if(1404 == arg13) {
            v15_1.eg = v2_2;
        }
        else if(1405 == arg13) {
            v15_1.eu = v2_2;
        }
        else if(1406 == arg13) {
            v15_1.es = v2_2;
        }
        else if(arg13 == 0x57F) {
            v15_1.eb = v2_2;
            v15_1.eh = v8_1;
        }
        else if(arg13 == 0x580) {
            v15_1.ef = v2_2;
        }
        else if(1409 == arg13) {
            v15_1.eo = v2_2;
        }
        else if(arg13 == 1410) {
            v15_1.ee = v2_2;
        }
        else if(arg13 == 0x583) {
            v15_1.ey = v2_2;
        }
        else if(arg13 == 0x584) {
            v15_1.ev = v2_2;
        }
        else if(0x586 == arg13) {
            v15_1.ec = v2_2;
            v15_1.ei = v8_1;
        }
        else if(arg13 == 0x587) {
            v15_1.ex = v2_2;
            v15_1.ep = v8_1;
        }
        else if(0x588 == arg13) {
            v15_1.ed = v2_2;
        }
        else if(arg13 == 0x589) {
            v15_1.et = v2_2;
        }
        else if(arg13 == 0x58A) {
            v15_1.fa = v2_2;
        }
        else if(0x58B == arg13) {
            v15_1.fe = v2_2;
        }
        else if(arg13 == 1420) {
            v15_1.fd = v2_2;
        }
        else if(0x58D == arg13) {
            v15_1.fz = v2_2;
        }
        else if(0x58E == arg13) {
            v15_1.fy = v2_2;
        }
        else if(0x58F == arg13) {
            v15_1.fh = v2_2;
        }
        else if(arg13 == 0x590) {
            v15_1.fl = v2_2;
        }
        else if(0x591 == arg13) {
            v15_1.fv = v2_2;
        }
        else if(arg13 == 0x592) {
            v15_1.fc = v2_2;
        }
        else if(arg13 == 0x593) {
            v15_1.fk = v2_2;
        }
        else {
            return 2;
        }

        v15_1.eq = true;
        return 1;
    }

    static int cu(int arg13, hl arg14, boolean arg15) {
        int v8;
        int[] v7_1;
        ar v15_1;
        int v0;
        int v14 = 1304812425;
        if(arg13 >= 2000) {
            arg13 += -1000;
            int[] v15 = il.aj;
            v0 = il.ad - 0x10F79755;
            il.ad = v0;
            v15_1 = bl.al(v15[v0 * v14], 0x64D7CF4D);
        }
        else if(arg15) {
            v15_1 = il.aa;
        }
        else {
            v15_1 = dw.av;
        }

        String[] v0_1 = il.aq;
        int v2 = 0x8FA23525;
        int v1 = ft.ab - v2;
        ft.ab = v1;
        int v3 = 0xBC5CDEAD;
        String v0_2 = v0_1[v1 * v3];
        int[] v5 = null;
        if(v0_2.length() <= 0 || v0_2.charAt(v0_2.length() - 1) != 89) {
            v7_1 = v5;
        }
        else {
            int[] v1_1 = il.aj;
            int v7 = il.ad + 0x5805FF6A;
            il.ad = v7;
            v1 = v1_1[v7 * -1460501877];
            if(v1 > 0) {
                v7_1 = new int[v1];
                while(true) {
                    v8 = v1 - 1;
                    if(v1 > 0) {
                        v1_1 = il.aj;
                        int v9 = il.ad + 0x3D9B701;
                        il.ad = v9;
                        v7_1[v8] = v1_1[v9 * v14];
                        v1 = v8;
                        continue;
                    }

                    break;
                }
            }
            else {
                v7_1 = v5;
            }

            v0_2 = v0_2.substring(0, v0_2.length() - 1);
        }

        Object[] v1_2 = new Object[v0_2.length() + 1];
        for(v8 = v1_2.length - 1; v8 >= 1; --v8) {
            if(v0_2.charAt(v8 - 1) == 0x48DD6760) {
                String[] v9_1 = il.aq;
                int v10 = ft.ab - v2;
                ft.ab = v10;
                v1_2[v8] = v9_1[v10 * v3];
            }
            else {
                int[] v10_1 = il.aj;
                int v11 = il.ad + 0x564CFFA4;
                il.ad = v11;
                v1_2[v8] = new Integer(v10_1[v11 * v14]);
            }
        }

        int[] v14_1 = il.aj;
        v0 = il.ad - 0x4A90AB9;
        il.ad = v0;
        v14 = v14_1[v0 * -367807669];
        if(-1 != v14) {
            v1_2[0] = new Integer(v14);
        }
        else {
            v1_2 = ((Object[])v5);
        }

        if(1400 == arg13) {
            v15_1.em = v1_2;
        }
        else if(1401 == arg13) {
            v15_1.el = v1_2;
        }
        else if(1402 == arg13) {
            v15_1.en = v1_2;
        }
        else if(arg13 == 0xAD2B5066) {
            v15_1.ew = v1_2;
        }
        else if(1404 == arg13) {
            v15_1.eg = v1_2;
        }
        else if(1405 == arg13) {
            v15_1.eu = v1_2;
        }
        else if(1406 == arg13) {
            v15_1.es = v1_2;
        }
        else if(arg13 == -1587725900) {
            v15_1.eb = v1_2;
            v15_1.eh = v7_1;
        }
        else if(arg13 == 0x580) {
            v15_1.ef = v1_2;
        }
        else if(1409 == arg13) {
            v15_1.eo = v1_2;
        }
        else if(arg13 == 0x9135F617) {
            v15_1.ee = v1_2;
        }
        else if(arg13 == 0x583) {
            v15_1.ey = v1_2;
        }
        else if(arg13 == 0xD0D7F68) {
            v15_1.ev = v1_2;
        }
        else if(0x586 == arg13) {
            v15_1.ec = v1_2;
            v15_1.ei = v7_1;
        }
        else if(arg13 == 0x7BD003F0) {
            v15_1.ex = v1_2;
            v15_1.ep = v7_1;
        }
        else if(0x759C864 == arg13) {
            v15_1.ed = v1_2;
        }
        else if(arg13 == 0xCEF9D988) {
            v15_1.et = v1_2;
        }
        else if(arg13 == 0x14C2C46F) {
            v15_1.fa = v1_2;
        }
        else if(0x58B == arg13) {
            v15_1.fe = v1_2;
        }
        else if(arg13 == 0x36FF1B39) {
            v15_1.fd = v1_2;
        }
        else if(0xD4C7E55 == arg13) {
            v15_1.fz = v1_2;
        }
        else if(0x58E == arg13) {
            v15_1.fy = v1_2;
        }
        else if(0x58F == arg13) {
            v15_1.fh = v1_2;
        }
        else if(arg13 == 0x590) {
            v15_1.fl = v1_2;
        }
        else if(0x967CE608 == arg13) {
            v15_1.fv = v1_2;
        }
        else if(arg13 == 0x5D81DDB4) {
            v15_1.fc = v1_2;
        }
        else if(arg13 == 0x593) {
            v15_1.fk = v1_2;
        }
        else {
            return 2;
        }

        v15_1.eq = true;
        return 1;
    }

    static int cv(int arg3, hl arg4, boolean arg5) {
        int v5;
        int[] v3;
        ar v4 = arg5 ? il.aa : dw.av;
        if(1500 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 1802067370;
            il.ad = v5;
            v3[v5 * 0xDB1874FD - 1] = v4.bw * 0xAFCF1FA3;
            return 1;
        }

        int v1 = 1304812425;
        if(0x7EDA3F53 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x4D15B5AC;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4.bo * 0x92030A70;
            return 1;
        }

        int v2 = 0x4A90AB9;
        if(arg3 == 0xEB024AAF) {
            v3 = il.aj;
            v5 = il.ad + v2;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4.by * 0x1804E4A5;
            return 1;
        }

        if(arg3 == 0x5DF) {
            v3 = il.aj;
            v5 = il.ad - 0x67EAA7E0;
            il.ad = v5;
            v3[v5 * 0xE7B27FC0 - 1] = v4.bt * 0x6F0D2CD;
            return 1;
        }

        if(arg3 == 0x1E15F31E) {
            v3 = il.aj;
            v5 = il.ad + v2;
            il.ad = v5;
            v5 = v5 * v1 - 1;
            int v4_1 = v4.bg ? 1 : 0;
            v3[v5] = v4_1;
            return 1;
        }

        if(arg3 == 0xB356F97) {
            v3 = il.aj;
            v5 = il.ad - 0x5216B253;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4.bx * 0x461DC573;
            return 1;
        }

        return 2;
    }

    static int cw(int arg9, hl arg10, boolean arg11) {
        int[] v11_2;
        byte[] v9_2;
        byte[] v5_2;
        String[] v9_1;
        int v0_1;
        int[] v9;
        ar v10_1;
        int v11;
        boolean v0 = false;
        int v1 = 0x4A90AB9;
        int v2 = 1304812425;
        if(arg9 >= 2000) {
            arg9 += -1000;
            int[] v10 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1 = bl.al(v10[v11 * v2], 0x64D7CF4D);
            v11 = 0;
        }
        else {
            v10_1 = arg11 ? il.aa : dw.av;
            v11 = 1;
        }

        int v5 = 0xBC5CDEAD;
        int v6 = 9;
        int v7 = 0x8FA23525;
        if(arg9 == 1300) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            arg9 = v9[v11 * v2] - 1;
            if(arg9 >= 0) {
                if(arg9 > v6) {
                }
                else {
                    String[] v11_1 = il.aq;
                    v0_1 = ft.ab - v7;
                    ft.ab = v0_1;
                    v10_1.az(arg9, v11_1[v0_1 * v5], 0x9925D51E);
                    return 1;
                }
            }

            ft.ab -= v7;
            return 1;
        }

        int v8 = 0x9521572;
        if(1301 == arg9) {
            il.ad -= v8;
            v10_1.dg = eh.ae(il.aj[il.ad * v2], il.aj[il.ad * v2 + 1], 0x34CE9027);
            return 1;
        }

        if(arg9 == 1302) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            if(v9[v11 * v2] == 1) {
                v0 = true;
            }

            v10_1.ea = v0;
            return 1;
        }

        if(1303 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1.ek = v9[v11 * v2] * -2086256801;
            return 1;
        }

        if(1304 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            v10_1.ez = v9[v11 * v2] * 0x20A164D9;
            return 1;
        }

        if(1305 == arg9) {
            v9_1 = il.aq;
            v11 = ft.ab - v7;
            ft.ab = v11;
            v10_1.dt = v9_1[v11 * v5];
            return 1;
        }

        if(arg9 == 1306) {
            v9_1 = il.aq;
            v11 = ft.ab - v7;
            ft.ab = v11;
            v10_1.er = v9_1[v11 * v5];
            return 1;
        }

        String[] v5_1 = null;
        if(1307 == arg9) {
            v10_1.dd = v5_1;
            return 1;
        }

        if(1308 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            if(v9[v11 * v2] == 1) {
                v0 = true;
            }

            v10_1.gj = v0;
            return 1;
        }

        v7 = 10;
        if(1350 == arg9) {
            if(v11 != 0) {
                il.ad -= 781871930;
                while((((int)v0)) < v7) {
                    if(il.aj[il.ad * v2 + (((int)v0))] < 0) {
                    }
                    else {
                        v0_1 = (((int)v0)) + 2;
                        continue;
                    }

                    break;
                }

                if((((int)v0)) > 0) {
                    arg9 = (((int)v0)) / 2;
                    v5_2 = new byte[arg9];
                    v9_2 = new byte[arg9];
                    goto label_164;
                }

                v9_2 = ((byte[])v5_1);
                goto label_203;
                while(true) {
                label_164:
                    v0_1 = (((int)v0)) - 2;
                    if(v0_1 < 0) {
                        break;
                    }

                    v11 = v0_1 / 2;
                    v5_2[v11] = ((byte)il.aj[il.ad * v2 + v0_1]);
                    v9_2[v11] = ((byte)il.aj[il.ad * v2 + v0_1 + 1]);
                }
            }
            else {
                il.ad -= v8;
                v5_2 = new byte[]{((byte)il.aj[il.ad * v2])};
                v9_2 = new byte[]{((byte)il.aj[il.ad * v2 + 1])};
            }

        label_203:
            v11_2 = il.aj;
            v0_1 = il.ad - v1;
            il.ad = v0_1;
            v11 = v11_2[v0_1 * v2] - 1;
            if(v11 >= 0 && v11 <= v6) {
                fa.aq(v10_1, v11, ((byte[])v5_1), v9_2, 1533822360);
                return 1;
            }

            throw new RuntimeException();
        }

        if(arg9 == 0x547) {
            il.ad -= v8;
            fa.aq(v10_1, v7, new byte[]{((byte)il.aj[il.ad * v2])}, new byte[]{((byte)il.aj[il.ad * v2 + 1])}, 0x328F1763);
            return 1;
        }

        v0_1 = 2;
        if(arg9 == 0x548) {
            il.ad -= 0xDFB202B;
            arg9 = il.aj[il.ad * v2] - 1;
            v11 = il.aj[il.ad * v2 + 1];
            v0_1 = il.aj[il.ad * v2 + v0_1];
            if(arg9 >= 0 && arg9 <= v6) {
                jh.ab(v10_1, arg9, v11, v0_1, 1);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0x549 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v1;
            il.ad = v11;
            arg9 = v9[v11 * v2];
            v11_2 = il.aj;
            v0_1 = il.ad - v1;
            il.ad = v0_1;
            jh.ab(v10_1, v7, arg9, v11_2[v0_1 * v2], 1);
            return 1;
        }

        if(arg9 == 0x54A) {
            il.ad -= v1;
            arg9 = il.aj[il.ad * v2] - 1;
            if(arg9 >= 0 && arg9 <= v6) {
                ir.af(v10_1, arg9, 1806458183);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0x54B == arg9) {
            ir.af(v10_1, v7, 1423043114);
            return 1;
        }

        return v0_1;
    }

    static int cx(int arg6, hl arg7, boolean arg8) {
        ar v8_1;
        int v1;
        int v7 = 0x4A90AB9;
        int v0 = 1304812425;
        if(arg6 >= 2000) {
            arg6 += -1000;
            int[] v8 = il.aj;
            v1 = il.ad - v7;
            il.ad = v1;
            v8_1 = bl.al(v8[v1 * v0], 0x64D7CF4D);
        }
        else if(arg8) {
            v8_1 = il.aa;
        }
        else {
            v8_1 = dw.av;
        }

        kx.gw(v8_1, 0x7F28F086);
        int v2 = 0x4BC;
        int v3 = 1205;
        if(arg6 != 1200 && v3 != arg6) {
            if(arg6 == v2) {
            }
            else {
                v2 = 0x6015A63B;
                if(arg6 == 1201) {
                    v8_1.cp = -1296555170;
                    int[] v6 = il.aj;
                    v1 = il.ad - v7;
                    il.ad = v1;
                    v8_1.ci = v6[v1 * v0] * v2;
                    return 1;
                }
                else if(arg6 == 1202) {
                    v8_1.cp = 202650893;
                    v8_1.ci = gu.jg.al.aq(-94) * v2;
                    return 1;
                }
                else {
                    return 2;
                }
            }
        }

        il.ad -= 0x9521572;
        v7 = il.aj[il.ad * v0];
        v0 = il.aj[il.ad * v0 + 1];
        v8_1.fq = 162011503 * v7;
        v8_1.fp = v0 * 311012663;
        dr v7_1 = client.al(v7, 0x49FD13FB);
        v8_1.cl = v7_1.ak * 0xE20C76AB;
        v8_1.ck = v7_1.ac * 0xCEACC4B9;
        v8_1.cm = v7_1.bd * 1468130953;
        v8_1.cz = v7_1.ba * 0xE5BE408F;
        v8_1.cn = v7_1.bf * 0xDAB63F35;
        v8_1.ct = v7_1.as * 0x43EFA677;
        v0 = 0;
        if(arg6 == v3) {
            v8_1.co = 0;
        }
        else {
            arg6 = arg6 == v2 ? 1 : 0;
            if(1 == v7_1.bn * 401368599) {
                v0 = 1;
            }

            if((arg6 | v0) != 0) {
                v8_1.co = 0x64AA6033;
                goto label_120;
            }

            v8_1.co = 0xC954C066;
        }

    label_120:
        v7 = -1377940245;
        v0 = 0x2CDAC8F9;
        v1 = 0xAEF2920;
        if(v8_1.cu * v7 > 0) {
            v8_1.ct = v8_1.ct * v1 / (v8_1.cu * v7) * v0;
        }
        else {
            v7 = -1380766737;
            if(v8_1.bn * v7 > 0) {
                v8_1.ct = v8_1.ct * v1 / (v8_1.bn * v7) * v0;
            }
        }

        return 1;
    }

    static int cy(int arg9, hl arg10, boolean arg11) {
        int[] v11_2;
        byte[] v9_2;
        byte[] v4_2;
        String[] v9_1;
        int v0_1;
        int[] v9;
        ar v10_1;
        int v11;
        boolean v0 = false;
        int v1 = 1304812425;
        if(arg9 >= 0xF2BB1F29) {
            arg9 += -1000;
            int[] v10 = il.aj;
            v11 = il.ad - 0x15C0A341;
            il.ad = v11;
            v10_1 = bl.al(v10[v11 * v1], 0x64D7CF4D);
            v11 = 0;
        }
        else {
            v10_1 = arg11 ? il.aa : dw.av;
            v11 = 1;
        }

        int v4 = 0x8FA23525;
        int v5 = 9;
        if(arg9 == 375487530) {
            v9 = il.aj;
            v11 = il.ad - 953272604;
            il.ad = v11;
            arg9 = v9[v11 * 0x5D70A549] - 1;
            if(arg9 >= 0) {
                if(arg9 > v5) {
                }
                else {
                    String[] v11_1 = il.aq;
                    v0_1 = ft.ab + 147955001;
                    ft.ab = v0_1;
                    v10_1.az(arg9, v11_1[v0_1 * 0xBC5CDEAD], -2002930936);
                    return 1;
                }
            }

            ft.ab -= v4;
            return 1;
        }

        int v6 = 0x9521572;
        if(0xDE3909D6 == arg9) {
            il.ad -= v6;
            v10_1.dg = eh.ae(il.aj[il.ad * 0xD1EA99A2], il.aj[il.ad * v1 + 1], 2033278183);
            return 1;
        }

        int v7 = 0x4A90AB9;
        if(arg9 == 0x2EF3A516) {
            v9 = il.aj;
            v11 = il.ad - v7;
            il.ad = v11;
            if(v9[v11 * 0x49710575] == 1) {
                v0 = true;
            }

            v10_1.ea = v0;
            return 1;
        }

        if(1050602216 == arg9) {
            v9 = il.aj;
            v11 = il.ad - 1028173960;
            il.ad = v11;
            v10_1.ek = v9[v11 * -1505466821] * 0xD2604D01;
            return 1;
        }

        if(1304 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v7;
            il.ad = v11;
            v10_1.ez = v9[v11 * v1] * 0x40732BBB;
            return 1;
        }

        if(1305 == arg9) {
            v9_1 = il.aq;
            v11 = ft.ab + 0xEF2F5B5;
            ft.ab = v11;
            v10_1.dt = v9_1[v11 * 200267374];
            return 1;
        }

        if(arg9 == 1306) {
            v9_1 = il.aq;
            v11 = ft.ab - v4;
            ft.ab = v11;
            v10_1.er = v9_1[v11 * 606917507];
            return 1;
        }

        String[] v4_1 = null;
        if(1307 == arg9) {
            v10_1.dd = v4_1;
            return 1;
        }

        if(0x10514A72 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v7;
            il.ad = v11;
            if(v9[v11 * v1] == 1) {
                v0 = true;
            }

            v10_1.gj = v0;
            return 1;
        }

        int v8 = 10;
        if(1350 == arg9) {
            if(v11 != 0) {
                il.ad -= 0xF8FA8822;
                while((((int)v0)) < v8) {
                    if(il.aj[il.ad * v1 + (((int)v0))] < 0) {
                    }
                    else {
                        v0_1 += 2;
                        continue;
                    }

                    break;
                }

                if(v0_1 > 0) {
                    arg9 = v0_1 / 2;
                    v4_2 = new byte[arg9];
                    v9_2 = new byte[arg9];
                    goto label_175;
                }

                v9_2 = ((byte[])v4_1);
                goto label_217;
                while(true) {
                label_175:
                    v0_1 += -2;
                    if(v0_1 < 0) {
                        break;
                    }

                    v11 = v0_1 / 2;
                    v4_2[v11] = ((byte)il.aj[il.ad * 0x94D56C07 + v0_1]);
                    v9_2[v11] = ((byte)il.aj[il.ad * v1 + v0_1 + 1]);
                }
            }
            else {
                il.ad -= -1545774302;
                v4_2 = new byte[]{((byte)il.aj[il.ad * v1])};
                v9_2 = new byte[]{((byte)il.aj[il.ad * 0x6F04BB33 + 1])};
            }

        label_217:
            v11_2 = il.aj;
            v0_1 = il.ad - v7;
            il.ad = v0_1;
            v11 = v11_2[v0_1 * 36550250] - 1;
            if(v11 >= 0 && v11 <= v5) {
                fa.aq(v10_1, v11, v4_2, v9_2, 0xF72869E4);
                return 1;
            }

            throw new RuntimeException();
        }

        if(arg9 == 1491003581) {
            il.ad -= v6;
            fa.aq(v10_1, v8, new byte[]{((byte)il.aj[il.ad * 0xD620D4D6])}, new byte[]{((byte)il.aj[il.ad * v1 + 1])}, 0xEC2F45D6);
            return 1;
        }

        v0_1 = 2;
        if(arg9 == 0x306E3EB3) {
            il.ad -= 0xDFB202B;
            arg9 = il.aj[il.ad * v1] - 1;
            v11 = il.aj[il.ad * 0x4AF23161 + 1];
            v0_1 = il.aj[il.ad * -1805418891 + v0_1];
            if(arg9 >= 0 && arg9 <= v5) {
                jh.ab(v10_1, arg9, v11, v0_1, 1);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0x549 == arg9) {
            v9 = il.aj;
            v11 = il.ad - v7;
            il.ad = v11;
            arg9 = v9[v11 * 0xD2085C40];
            v11_2 = il.aj;
            v0_1 = il.ad + 0x14149603;
            il.ad = v0_1;
            jh.ab(v10_1, v8, arg9, v11_2[v0_1 * v1], 1);
            return 1;
        }

        if(arg9 == -1480075174) {
            il.ad -= 0xB2ECF7AF;
            arg9 = il.aj[il.ad * v1] - 1;
            if(arg9 >= 0 && arg9 <= v5) {
                ir.af(v10_1, arg9, 0xF7AD02B5);
                return 1;
            }

            throw new RuntimeException();
        }

        if(0xBB7FD25A == arg9) {
            ir.af(v10_1, v8, 1293656504);
            return 1;
        }

        return v0_1;
    }

    static final void cz(ar arg1, int arg2) {
        if(arg1.dr != null) {
            if(arg1.gn == null) {
                arg1.gn = new int[arg1.dr.length];
            }

            arg1.gn[arg2] = 0x7FFFFFFF;
            return;
        }

        throw new RuntimeException();
    }

    static int da(int arg8, hl arg9, boolean arg10) {
        boolean v6_2;
        byte v6_1;
        String v8_3;
        int v1;
        int[] v9_2;
        String[] v9_1;
        eg v8_1;
        String[] v8_2;
        int[] v8;
        int v9 = -1;
        int v10 = 0x4A90AB9;
        if(3600 == arg8) {
            if(ds.rq.aj * 0xD87F3529 == 0) {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * -104546893 - 1] = 0x26505CBF;
            }
            else if(ds.rq.aj * 0x6BF9605B == 1) {
                v8 = il.aj;
                v10 = il.ad - 1810003548;
                il.ad = v10;
                v8[v10 * 0xAA563410 - 1] = v9;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 92053909 - 1] = ds.rq.an.al(0x2A0B23F7);
            }

            return 1;
        }

        int v2 = 0x5B772B0B;
        int v3 = 0x8FA23525;
        int v4 = 0xBC5CDEAD;
        int v5 = 1304812425;
        if(3601 == arg8) {
            v8 = il.aj;
            v9 = il.ad + 0x704A85D3;
            il.ad = v9;
            arg8 = v8[v9 * v5];
            if(!ds.rq.ax(0xB799A482) || arg8 < 0 || arg8 >= ds.rq.an.al(0x3007F975)) {
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
                v8_2 = il.aq;
                v9 = ft.ab - 0x6D907B37;
                ft.ab = v9;
                v8_2[v9 * 0x33EBE77F - 1] = "";
            }
            else {
                v8_1 = ds.rq.an.ai(arg8, 0x8B5D2F41);
                v9_1 = il.aq;
                v10 = ft.ab - 0x78CB707B;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ed)v8_1).aq(v2);
                v9_1 = il.aq;
                v10 = ft.ab + v3;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ed)v8_1).ab(0x92A5FFBE);
            }

            return 1;
        }

        int v6 = 0;
        if(arg8 == 0xE8F58BCE) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            arg8 = v8[v9 * v5];
            if(!ds.rq.ax(0xBE04F145) || arg8 < 0 || arg8 >= ds.rq.an.al(0x407C7B7B)) {
                v8 = il.aj;
                v9 = il.ad - 0x4A42F7C2;
                il.ad = v9;
                v8[v9 * 0x1BF27502 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v9_2[v1 * v5 - 1] = ds.rq.an.ai(arg8, -2135007077).an * 0x60A92404;
            }

            return 1;
        }

        int v7 = 1257071827;
        if(2066953820 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            arg8 = v8[v9 * 0x398DD413];
            if(!ds.rq.ax(-1048934297) || arg8 < 0 || arg8 >= ds.rq.an.al(0xAF9FF5A6)) {
                v8 = il.aj;
                v9 = il.ad - 0x7B1A62F3;
                il.ad = v9;
                v8[v9 * v5 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v9_2[v1 * 596255304 - 1] = ds.rq.an.ai(arg8, -2009251445).aj * v7;
            }

            return 1;
        }

        if(3604 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v3;
            ft.ab = v9;
            v8_3 = v8_2[v9 * v4];
            v9_2 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            hu.ak(v8_3, v9_2[v1 * v5], 0x5459CF0);
            return 1;
        }

        if(arg8 == 0x543B194C) {
            v8_2 = il.aq;
            v9 = ft.ab - 0x7F161A42;
            ft.ab = v9;
            ds.rq.ad(v8_2[v9 * v4], 27);
            return 1;
        }

        if(arg8 == 3606) {
            v8_2 = il.aq;
            v9 = ft.ab + 449184090;
            ft.ab = v9;
            ds.rq.ao(v8_2[v9 * v4], -1570117941);
            return 1;
        }

        if(3607 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v3;
            ft.ab = v9;
            ds.rq.am(v8_2[v9 * v4], 0);
            return 1;
        }

        if(arg8 == 0xA99A009E) {
            v8_2 = il.aq;
            v9 = ft.ab + 707806059;
            ft.ab = v9;
            ds.rq.as(v8_2[v9 * v4], -1880437085);
            return 1;
        }

        if(3609 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v3;
            ft.ab = v9;
            v8_3 = iz.if(v8_2[v9 * 0x57C77696], -21);
            v9_2 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v1 = v1 * 0x5CCF0C51 - 1;
            if(ds.rq.ap(new ew(v8_3, ac.ad), false, -128)) {
                v6 = 1;
            }

            v9_2[v1] = v6;
            return 1;
        }

        if(0xF9F93085 == arg8) {
            if(ai.oq != null) {
                v8_2 = il.aq;
                v9 = ft.ab + 1815889203;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = ai.oq.ab;
            }
            else {
                v8_2 = il.aq;
                v9 = ft.ab + 349554004;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }

            return 1;
        }

        if(0xE403F519 == arg8) {
            if(ai.oq != null) {
                v8 = il.aj;
                v9 = il.ad + 1590113010;
                il.ad = v9;
                v8[v9 * 1010813297 - 1] = ai.oq.al(0x92217094);
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 0xB7A7EC80 - 1] = 0;
            }

            return 1;
        }

        if(0x69F8C39D == arg8) {
            v8 = il.aj;
            v9 = il.ad - 1013197246;
            il.ad = v9;
            arg8 = v8[v9 * 0x594C1313];
            if(ai.oq == null || arg8 >= ai.oq.al(-2015605174)) {
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * 882210810 - 1] = "";
            }
            else {
                v9_1 = il.aq;
                v10 = ft.ab + v3;
                ft.ab = v10;
                v9_1[v10 * 0x56776709 - 1] = ai.oq.ai(arg8, 0x8C011E1C).ap(0).ax(0x6D99A338);
            }

            return 1;
        }

        if(0xDD17F500 == arg8) {
            v8 = il.aj;
            v9 = il.ad - 1043473644;
            il.ad = v9;
            arg8 = v8[v9 * 0xA20AE674];
            if(ai.oq == null || arg8 >= ai.oq.al(0xE0B8AFB4)) {
                v8 = il.aj;
                v9 = il.ad - 0x502C1B4D;
                il.ad = v9;
                v8[v9 * v5 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v9_2[v1 * v5 - 1] = ai.oq.ai(arg8, -1949517037).bc(0x80992D3A);
            }

            return 1;
        }

        if(0xDDB2F47C == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            arg8 = v8[v9 * v5];
            if(ai.oq == null || arg8 >= ai.oq.al(0xEADC1B5E)) {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 0x953530E6 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v10 = il.ad - 0xF28BFD5;
                il.ad = v10;
                v9_2[v10 * 0xD706D818 - 1] = ai.oq.ai(arg8, 0x89198F16).aj * v7;
            }

            return 1;
        }

        if(924487075 == arg8) {
            v8 = il.aj;
            v9 = il.ad + v10;
            il.ad = v9;
            v9 = v9 * v5 - 1;
            if(ai.oq != null) {
                v6_1 = ai.oq.ai;
            }

            v8[v9] = v6_1;
            return 1;
        }

        if(arg8 == 0x6EBE173D) {
            v8_2 = il.aq;
            v9 = ft.ab - 0x17BFB6DC;
            ft.ab = v9;
            if.hp(v8_2[v9 * 0x7331FBB8], 0x3AE3F028);
            return 1;
        }

        if(arg8 == 0xE22) {
            v8 = il.aj;
            v9 = il.ad + 0x532A787E;
            il.ad = v9;
            v9 = v9 * 0xE49D1C2D - 1;
            if(ai.oq != null) {
                v6 = ai.oq.av * 0x4C6ABBEF;
            }

            v8[v9] = v6;
            return 1;
        }

        if(0x2913852B == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v3;
            ft.ab = v9;
            gs.ha(v8_2[v9 * v4], 0x37E0D836);
            return 1;
        }

        if(arg8 == 3620) {
            cy.hv(1038169107);
            return 1;
        }

        if(0xF09AA253 == arg8) {
            if(!ds.rq.ax(0xAC12BF0B)) {
                v8 = il.aj;
                v10 = il.ad + 0x3413D7F2;
                il.ad = v10;
                v8[v10 * v5 - 1] = v9;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + 1290223293;
                il.ad = v9;
                v8[v9 * 0xD2FFEE1A - 1] = ds.rq.ap.al(1490086518);
            }

            return 1;
        }

        if(arg8 == 0xE26) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            arg8 = v8[v9 * 0x2FF01EB5];
            if(!ds.rq.ax(0x8D26230D) || arg8 < 0 || arg8 >= ds.rq.ap.al(0x8F245651)) {
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }
            else {
                v8_1 = ds.rq.ap.ai(arg8, -2094912380);
                v9_1 = il.aq;
                v10 = ft.ab - 0x37C6A46;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ev)v8_1).aq(v2);
                v9_1 = il.aq;
                v10 = ft.ab + 0x5ADD2D31;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ev)v8_1).ab(0xF8CCFD80);
            }

            return 1;
        }

        if(arg8 == 0xBD5BFC31) {
            v8_2 = il.aq;
            v9 = ft.ab - v3;
            ft.ab = v9;
            v8_3 = iz.if(v8_2[v9 * 0x7044895F], 12);
            v9_2 = il.aj;
            v10 = il.ad - 0x72DF9B9C;
            il.ad = v10;
            v10 = v10 * v5 - 1;
            if(ds.rq.aj(new ew(v8_3, ac.ad), -3653)) {
                v6 = 1;
            }

            v9_2[v10] = v6;
            return 1;
        }

        if(arg8 == 0xA973F4BE) {
            v8 = il.aj;
            v9 = il.ad + 0x6F56D37E;
            il.ad = v9;
            arg8 = v8[v9 * 0x1A74F0D4];
            if(ai.oq == null || arg8 >= ai.oq.al(0x3F70DD74) || !ai.oq.ai(arg8, 0x89D6A2FE).ap(0).equals(gu.jg.ax)) {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 0x491D4486 - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * v5 - 1] = 1;
            }

            return 1;
        }

        if(0xCA3AB20E == arg8) {
            if(ai.oq == null || ai.oq.af == null) {
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * -1404010990 - 1] = "";
            }
            else {
                v8_2 = il.aq;
                v9 = ft.ab + v3;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = ai.oq.af;
            }

            return 1;
        }

        if(0xE2A == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            arg8 = v8[v9 * v5];
            if(ai.oq == null || arg8 >= ai.oq.al(-406561700) || !ai.oq.ai(arg8, -2012809710).ae(0x66AD25F9)) {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 0x8B7D80BF - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8[v9 * 0x9DD9E30C - 1] = 1;
            }

            return 1;
        }

        if(arg8 == 0xE2B) {
            v8 = il.aj;
            v9 = il.ad - 1061378430;
            il.ad = v9;
            arg8 = v8[v9 * 93904806];
            if(ai.oq == null || arg8 >= ai.oq.al(-2077760747) || !ai.oq.ai(arg8, 0x8C1C9013).bn(0xC9DC7F32)) {
                v8 = il.aj;
                v9 = il.ad + 0x29B5DBC3;
                il.ad = v9;
                v8[v9 * 0xB17082DA - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad - 774825090;
                il.ad = v9;
                v8[v9 * 0xEAA0E51E - 1] = 1;
            }

            return 1;
        }

        v1 = 0x5AB34763;
        if(0xAAFA9C5D == arg8) {
            ds.rq.an.aw(v1);
            return 1;
        }

        if(0x74B69D09 == arg8) {
            v8 = il.aj;
            v9 = il.ad + 0x67DA2903;
            il.ad = v9;
            if(v8[v9 * -1098744480] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jj(((boolean)v6)), 0x9060E7A2);
            return 1;
        }

        if(arg8 == 3630) {
            v8 = il.aj;
            v9 = il.ad - 0x32AF4EDA;
            il.ad = v9;
            if(v8[v9 * 0x8D0B5118] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jm(((boolean)v6)), 0x891FAE14);
            return 1;
        }

        if(333058910 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jv(((boolean)v6)), -2125039930);
            return 1;
        }

        if(0xE30 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x20439F58] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jl(((boolean)v6)), 0x818F5AC0);
            return 1;
        }

        if(0x808EA6B3 == arg8) {
            v8 = il.aj;
            v9 = il.ad + 0x3733E176;
            il.ad = v9;
            if(v8[v9 * 0x21D2E79A] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kq(((boolean)v6)), 0x802E623B);
            return 1;
        }

        if(0xE32 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x34968E8E] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jy(((boolean)v6)), -2118236039);
            return 1;
        }

        if(arg8 == 0xE33) {
            v8 = il.aj;
            v9 = il.ad + 0x5AC32321;
            il.ad = v9;
            if(v8[v9 * 0x5E30C6FB] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new js(((boolean)v6)), 0x80A0A89C);
            return 1;
        }

        if(arg8 == 0xE34) {
            v8 = il.aj;
            v9 = il.ad - 0x6E2034D0;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kg(((boolean)v6)), 0x8D146321);
            return 1;
        }

        if(2002094966 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 1439833805] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kw(((boolean)v6)), 0x895118F5);
            return 1;
        }

        if(-2026099800 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new ka(((boolean)v6)), -2005451611);
            return 1;
        }

        if(arg8 == 0xE37) {
            ds.rq.an.av(0x8020A1CF);
            return 1;
        }

        if(0x5A41B7D2 == arg8) {
            ds.rq.ap.aw(v1);
            return 1;
        }

        if(arg8 == 0x59AFD508) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            ds.rq.ap.ao(new jj(((boolean)v6)), 0x849F7BC9);
            return 1;
        }

        if(arg8 == 0xE3A) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x5A6021A0] == 1) {
                v6_2 = true;
            }

            ds.rq.ap.ao(new jm(((boolean)v6)), 0x8D16DCE0);
            return 1;
        }

        if(arg8 == 0xE3B) {
            ds.rq.ap.av(-2115454504);
            return 1;
        }

        if(arg8 == 0x71EB604D) {
            if(ai.oq != null) {
                ai.oq.aw(v1);
            }

            return 1;
        }

        if(0xE3D == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x7A7750ED] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jj(((boolean)v6)), -2016697609);
            }

            return 1;
        }

        if(0xE3E == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0xC5C035AA] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jm(((boolean)v6)), -2031649083);
            }

            return 1;
        }

        if(-1281806823 == arg8) {
            v8 = il.aj;
            v9 = il.ad - 337245070;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jv(((boolean)v6)), 0x8F724872);
            }

            return 1;
        }

        if(arg8 == 0x439635C0) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x9B3FE4A0] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jl(((boolean)v6)), 0x8CA774F3);
            }

            return 1;
        }

        if(0xE41 == arg8) {
            v8 = il.aj;
            v9 = il.ad + 0x6F4893E1;
            il.ad = v9;
            if(v8[v9 * 0x4A3566F2] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kq(((boolean)v6)), 0x80790B70);
            }

            return 1;
        }

        if(arg8 == -2120972746) {
            v8 = il.aj;
            v9 = il.ad - 0x487CEC8B;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jy(((boolean)v6)), -2106018507);
            }

            return 1;
        }

        if(arg8 == 0xE43) {
            v8 = il.aj;
            v9 = il.ad + 0x2D72F9DA;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new js(((boolean)v6)), -2120423003);
            }

            return 1;
        }

        if(arg8 == 0xE44) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kg(((boolean)v6)), 0x89FEB93A);
            }

            return 1;
        }

        if(1966505110 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kw(((boolean)v6)), -1978577640);
            }

            return 1;
        }

        if(arg8 == 0xE46) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * -2110193320] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new ka(((boolean)v6)), -2053858240);
            }

            return 1;
        }

        if(0x78F8EA6 == arg8) {
            if(ai.oq != null) {
                ai.oq.av(-2028891475);
            }

            return 1;
        }

        if(arg8 == -2091602182) {
            v8 = il.aj;
            v9 = il.ad + 0xE343806;
            il.ad = v9;
            if(v8[v9 * v5] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new ke(((boolean)v6)), 0x80BFBE51);
            return 1;
        }

        if(arg8 == -1150884461) {
            v8 = il.aj;
            v9 = il.ad - v10;
            il.ad = v9;
            if(v8[v9 * 0x124069F] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new ke(((boolean)v6)), 0x908ED667);
            }

            return 1;
        }

        return 2;
    }

    static int db(int arg3, hl arg4, boolean arg5) {
        int[] v3;
        int[] v4 = il.aj;
        int v0 = 0x4A90AB9;
        int v5 = il.ad - v0;
        il.ad = v5;
        int v1 = 1304812425;
        ar v4_1 = bl.al(v4[v5 * v1], 0x64D7CF4D);
        if(2500 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.bw * 0xAFCF1FA3;
            return 1;
        }

        if(2501 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.bo * 0xA8B630B5;
            return 1;
        }

        if(2502 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.by * 0x1804E4A5;
            return 1;
        }

        if(2503 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.bt * 0x6F0D2CD;
            return 1;
        }

        if(arg3 == 2504) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.bg;
            return 1;
        }

        if(arg3 == 2505) {
            v3 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v3[v5 * v1 - 1] = v4_1.bx * 0xBA6F66AD;
            return 1;
        }

        return 2;
    }

    static int dc(int arg3, hl arg4, boolean arg5) {
        int v4_2;
        String[] v3_1;
        int[] v3;
        int[] v4 = il.aj;
        int v5 = il.ad - 0x13970A5D;
        il.ad = v5;
        ar v4_1 = bl.al(v4[v5 * 2042842603], 0x64D7CF4D);
        if(arg3 == 0xAF0) {
            v3 = il.aj;
            v5 = il.ad + 0x4A90AB9;
            il.ad = v5;
            v3[v5 * 2087487426 - 1] = ct.ae(ib.il(v4_1, 0xCF7530AA), 0x7F0F00B5);
            return 1;
        }

        int v1 = 0x8FA23525;
        if(arg3 == 0xAF1) {
            v3 = il.aj;
            v5 = il.ad + 0x77F181F8;
            il.ad = v5;
            arg3 = v3[v5 * 1304812425] - 1;
            if(v4_1.dd == null || arg3 >= v4_1.dd.length || v4_1.dd[arg3] == null) {
                v3_1 = il.aq;
                v4_2 = ft.ab + 0x27198046;
                ft.ab = v4_2;
                v3_1[v4_2 * 0x7EEF9B23 - 1] = "";
            }
            else {
                String[] v5_1 = il.aq;
                int v2 = ft.ab + v1;
                ft.ab = v2;
                v5_1[v2 * 0x7F14163C - 1] = v4_1.dd[arg3];
            }

            return 1;
        }

        if(arg3 == 0xE1796FB8) {
            if(v4_1.dt == null) {
                v3_1 = il.aq;
                v4_2 = ft.ab - 1774281109;
                ft.ab = v4_2;
                v3_1[v4_2 * 0xBC5CDEAD - 1] = "";
            }
            else {
                v3_1 = il.aq;
                v5 = ft.ab + v1;
                ft.ab = v5;
                v3_1[v5 * 0xE43EF42F - 1] = v4_1.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dd(int arg8, hl arg9, boolean arg10) {
        int v4;
        int[] v9_1;
        int[] v8;
        int v3;
        int v1_1;
        int[] v10_1;
        int v2;
        int[] v1;
        int v9 = 0x4A90AB9;
        int v10 = 1304812425;
        if(arg8 == 0x30E5A71C) {
            il.ad -= 0x439B3674;
            arg8 = il.aj[il.ad * v10];
            v10 = il.aj[il.ad * v10 + 1];
            v1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1[v2 * 0x5640E260 - 1] = arg8 + v10;
            return 1;
        }

        if(1530172011 == arg8) {
            il.ad -= 0x645C746F;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad + 440800370;
            il.ad = v1_1;
            v10_1[v1_1 * 0x3A4A4FEF - 1] = arg8 - v9;
            return 1;
        }

        v2 = 0x9521572;
        if(4002 == arg8) {
            il.ad -= v2;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad + 0x18ACF933;
            il.ad = v1_1;
            v10_1[v1_1 * 0x8E48BA61 - 1] = v9 * arg8;
            return 1;
        }

        if(4003 == arg8) {
            il.ad -= 0xEE0B1E13;
            arg8 = il.aj[il.ad * 0x508B7895];
            v1_1 = il.aj[il.ad * v10 + 1];
            int[] v2_1 = il.aj;
            v3 = il.ad + v9;
            il.ad = v3;
            v2_1[v3 * v10 - 1] = arg8 / v1_1;
            return 1;
        }

        if(0x360F1E3D == arg8) {
            v8 = il.aj;
            v10 = il.ad - 0xFC6E632;
            il.ad = v10;
            arg8 = v8[v10 * 0xFBD3AF8];
            v10_1 = il.aj;
            v1_1 = il.ad + v9;
            il.ad = v1_1;
            v10_1[v1_1 * -2092244703 - 1] = ((int)(Math.random() * (((double)arg8))));
            return 1;
        }

        if(arg8 == 4005) {
            v8 = il.aj;
            v9 = il.ad + 0x2B5B0ABA;
            il.ad = v9;
            arg8 = v8[v9 * 0x9DDC2EE3];
            v9_1 = il.aj;
            v1_1 = il.ad + 0xA830EAE;
            il.ad = v1_1;
            v9_1[v1_1 * v10 - 1] = ((int)(Math.random() * (((double)(arg8 + 1)))));
            return 1;
        }

        v3 = 2;
        if(0x3DE2FFBC == arg8) {
            il.ad -= 0x6126BF88;
            arg8 = il.aj[il.ad * v10];
            v1_1 = il.aj[il.ad * 196050291 + 1];
            v2 = il.aj[il.ad * v10 + v3];
            v3 = il.aj[il.ad * v10 + 3];
            v4 = il.aj[il.ad * v10 + 4];
            int[] v5 = il.aj;
            int v6 = il.ad + v9;
            il.ad = v6;
            v5[v6 * v10 - 1] = arg8 + (v4 - v2) * (v1_1 - arg8) / (v3 - v2);
            return 1;
        }

        if(arg8 == 4007) {
            il.ad -= -1091890262;
            arg8 = il.aj[il.ad * 699811051];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad - 0x39886CF2;
            il.ad = v1_1;
            v10_1[v1_1 * 0x29215FF9 - 1] = v9 * arg8 / 100 + arg8;
            return 1;
        }

        if(arg8 == 0xFDF5C18) {
            il.ad -= 0x464870CF;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * 1053011385 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad + 1404931414;
            il.ad = v1_1;
            v10_1[v1_1 * 0x7D14FEDE - 1] = arg8 | 1 << v9;
            return 1;
        }

        if(arg8 == 4009) {
            il.ad -= 1091687211;
            arg8 = il.aj[il.ad * v10];
            v10 = il.aj[il.ad * v10 + 1];
            v1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1[v2 * -2094290682 - 1] = arg8 & -1 - (1 << v10);
            return 1;
        }

        v4 = 0;
        if(0x10A1F2DB == arg8) {
            il.ad -= v2;
            arg8 = il.aj[il.ad * 0x9053B72A];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad + 0x6FE875D6;
            il.ad = v1_1;
            v1_1 = v1_1 * 0x86EEAB10 - 1;
            if((arg8 & 1 << v9) != 0) {
                v4 = 1;
            }

            v10_1[v1_1] = v4;
            return 1;
        }

        if(0xFAB == arg8) {
            il.ad -= 0x8FB97C71;
            arg8 = il.aj[il.ad * 0x3F541493];
            v9 = il.aj[il.ad * 0xE9DA5F79 + 1];
            v10_1 = il.aj;
            v1_1 = il.ad + 1218832028;
            il.ad = v1_1;
            v10_1[v1_1 * 0xACFAEAC6 - 1] = arg8 % v9;
            return 1;
        }

        if(0xFAC == arg8) {
            il.ad -= 0x3A44DE03;
            arg8 = il.aj[il.ad * 0xB5AA39A4];
            v9 = il.aj[il.ad * 0xF93CECE1 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v9 = il.ad + 0x75E5386F;
                il.ad = v9;
                v8[v9 * 0xD137CB9F - 1] = 0;
            }
            else {
                v1 = il.aj;
                v2 = il.ad + 0x21CE1FC3;
                il.ad = v2;
                v1[v2 * v10 - 1] = ((int)Math.pow(((double)arg8), ((double)v9)));
            }

            return 1;
        }

        if(0xFAD == arg8) {
            il.ad -= 0x2BDF0CDA;
            arg8 = il.aj[il.ad * v10];
            v1_1 = il.aj[il.ad * 0xA96B7405 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v10 = il.ad + v9;
                il.ad = v10;
                v8[v10 * 0x990874E - 1] = 0;
                return 1;
            }

            switch(v1_1) {
                case 0: {
                    v8 = il.aj;
                    v9 = il.ad - 0x432E8507;
                    il.ad = v9;
                    v8[v9 * 0x51302F43 - 1] = 1983584190;
                    break;
                }
                case 1: {
                    v1 = il.aj;
                    v2 = il.ad + v9;
                    il.ad = v2;
                    v1[v2 * v10 - 1] = arg8;
                    break;
                }
                case 2: {
                    v1 = il.aj;
                    v2 = il.ad + v9;
                    il.ad = v2;
                    v1[v2 * v10 - 1] = ((int)Math.sqrt(((double)arg8)));
                    break;
                }
                case 3: {
                    v9_1 = il.aj;
                    v10 = il.ad - 360323047;
                    il.ad = v10;
                    v9_1[v10 * 0x95A4CEE2 - 1] = ((int)Math.cbrt(((double)arg8)));
                    break;
                }
                case 4: {
                    v1 = il.aj;
                    v2 = il.ad + v9;
                    il.ad = v2;
                    v1[v2 * v10 - 1] = ((int)Math.sqrt(Math.sqrt(((double)arg8))));
                    break;
                }
                default: {
                    v9_1 = il.aj;
                    v10 = il.ad - 566950103;
                    il.ad = v10;
                    v9_1[v10 * 2053456435 - 1] = ((int)Math.pow(((double)arg8), 1 / (((double)v1_1))));
                    break;
                }
            }

            return 1;
        }

        if(arg8 == 0xFAE) {
            il.ad -= 0xE654AEB1;
            arg8 = il.aj[il.ad * 94705246];
            v9 = il.aj[il.ad * v10 + 1];
            v1 = il.aj;
            v2 = il.ad + 0x3A986047;
            il.ad = v2;
            v1[v2 * v10 - 1] = arg8 & v9;
            return 1;
        }

        if(0xFAF == arg8) {
            il.ad -= v2;
            arg8 = il.aj[il.ad * 0x480EB0B];
            v10 = il.aj[il.ad * 0x9036AAB9 + 1];
            v1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1[v2 * 0xD029ECF - 1] = arg8 | v10;
            return 1;
        }

        if(-2100351505 == arg8) {
            il.ad -= -1589019491;
            long v8_1 = ((long)il.aj[il.ad * 0x95DABBD1]);
            long v1_2 = ((long)il.aj[il.ad * -766306421 + 1]);
            long v3_1 = ((long)il.aj[il.ad * v10 + v3]);
            v10_1 = il.aj;
            int v5_1 = il.ad - 0x1F50C2E5;
            il.ad = v5_1;
            v10_1[v5_1 * 0x58AAAA69 - 1] = ((int)(v8_1 * v3_1 / v1_2));
            return 1;
        }

        return v3;
    }

    static int de(int arg7, hl arg8, boolean arg9) {
        ar v7_1;
        int v3;
        int[] v7;
        int v8 = 0x857F658F;
        int v9 = 0x64D7CF4D;
        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(2700 == arg7) {
            v7 = il.aj;
            v3 = il.ad - v1;
            il.ad = v3;
            v7_1 = bl.al(v7[v3 * v0], v9);
            int[] v9_1 = il.aj;
            v3 = il.ad + v1;
            il.ad = v3;
            v9_1[v3 * v0 - 1] = v7_1.fq * v8;
            return 1;
        }

        if(2701 == arg7) {
            v7 = il.aj;
            v3 = il.ad - v1;
            il.ad = v3;
            v7_1 = bl.al(v7[v3 * v0], v9);
            if(v7_1.fq * v8 != -1) {
                int[] v8_1 = il.aj;
                v9 = il.ad + v1;
                il.ad = v9;
                v8_1[v9 * v0 - 1] = v7_1.fp * 0x585B9887;
            }
            else {
                v7 = il.aj;
                v8 = il.ad + v1;
                il.ad = v8;
                v7[v8 * v0 - 1] = 0;
            }

            return 1;
        }

        if(2702 == arg7) {
            v7 = il.aj;
            v8 = il.ad - v1;
            il.ad = v8;
            if(client.ky.ax(((long)v7[v8 * v0])) != null) {
                v7 = il.aj;
                v8 = il.ad + v1;
                il.ad = v8;
                v7[v8 * v0 - 1] = 1;
            }
            else {
                v7 = il.aj;
                v8 = il.ad + v1;
                il.ad = v8;
                v7[v8 * v0 - 1] = 0;
            }

            return 1;
        }

        if(arg7 == 2706) {
            v7 = il.aj;
            v8 = il.ad + v1;
            il.ad = v8;
            v7[v8 * v0 - 1] = client.kt * 0xD233AC37;
            return 1;
        }

        return 2;
    }

    static int df(int arg21, hl arg22, boolean arg23) {
        ah v13_1;
        int v17;
        int v16;
        String v15_1;
        String v14_1;
        int[] v3_2;
        int v6;
        String[] v2_4;
        int[] v2_3;
        ah v2_2;
        ah v1_6;
        ah v0_7;
        fw v0_6;
        int[] v1_4;
        boolean v4_1;
        int[] v0_4;
        na v1_1;
        String v0_2;
        int v1;
        String[] v0_1;
        int v0 = arg21;
        int v2 = 0x8FA23525;
        int v3 = 0xBC5CDEAD;
        int v4 = 0;
        if(v0 == 0x801D1CC2) {
            v0_1 = il.aq;
            v1 = ft.ab - v2;
            ft.ab = v1;
            ib.al(0, "", v0_1[v1 * v3], 0xCA903411);
            return 1;
        }

        int v7 = 0x9521572;
        int v8 = 1304812425;
        if(0x74B0701C == v0) {
            il.ad -= v7;
            jb.cm(gu.jg, il.aj[il.ad * v8], il.aj[il.ad * v8 + 1], 0x5CFA5C5);
            return 1;
        }

        if(v0 == 0xD2833245) {
            if(!il.ah) {
                il.ag = true;
            }

            return 1;
        }

        if(0xC20 == v0) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x3F152DFC;
            ft.ab = v1;
            v0_2 = v0_1[v1 * 108775079];
            if(hu.al(((CharSequence)v0_2), -332280163)) {
                v4 = bw.ar(((CharSequence)v0_2), 0x5E54CAEE);
            }

            na v0_3 = cd.al(nf.bb, client.eh.an, 0x95A5DAA5);
            v0_3.ae.aj(v4, 0x79EF67B1);
            client.eh.ae(v0_3, 41674085);
            return 1;
        }

        if(v0 == 980182887) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x7225AB0A;
            ft.ab = v1;
            v0_2 = v0_1[v1 * 0xDCD71D71];
            v1_1 = cd.al(nf.au, client.eh.an, 0x8A3B3D6D);
            v1_1.ae.ar(v0_2.length() + 1, 77);
            v1_1.ae.ai(v0_2, -123);
            client.eh.ae(v1_1, 0x9E85DD32);
            return 1;
        }

        if(-1090639273 == v0) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x74FC6C6;
            ft.ab = v1;
            v0_2 = v0_1[v1 * 0x3450F9BD];
            v1_1 = cd.al(nf.bs, client.eh.an, -2056830638);
            v1_1.ae.ar(v0_2.length() + 1, 110);
            v1_1.ae.ai(v0_2, -107);
            client.eh.ae(v1_1, 0xA7E35894);
            return 1;
        }

        if(3107 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0x6C06B912;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            String[] v1_2 = il.aq;
            v2 = ft.ab - 0x5DEA687B;
            ft.ab = v2;
            dh.fv(v0, v1_2[v2 * 0xC8B8B1AB], 0x96034FCF);
            return 1;
        }

        int v9 = 0xDFB202B;
        int v10 = 2;
        if(1790586820 == v0) {
            il.ad -= v9;
            ky.gt(bl.al(il.aj[il.ad * 0x2277F45B + v10], 0x64D7CF4D), il.aj[il.ad * -685390948], il.aj[il.ad * v8 + 1], 0x60);
            return 1;
        }

        byte v11 = 78;
        if(3109 == v0) {
            il.ad -= v7;
            v0 = il.aj[il.ad * 0x21BEB90D];
            v2 = il.aj[il.ad * 0x274254F2 + 1];
            ar v1_3 = arg23 ? il.aa : dw.av;
            ky.gt(v1_3, v0, v2, v11);
            return 1;
        }

        int v12 = 0x4A90AB9;
        if(v0 == 41517603) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            if(v0_4[v1 * v8] == 1) {
                v4_1 = true;
            }

            ci.ch = ((boolean)v4);
            return 1;
        }

        if(v0 == 0xC27) {
            v0_4 = il.aj;
            v1 = il.ad - 0x6B124D34;
            il.ad = v1;
            v1 = v1 * v8 - 1;
            if(li.rg.ae) {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(0xC28 == v0) {
            hu v0_5 = li.rg;
            v1_4 = il.aj;
            v2 = il.ad - 208478109;
            il.ad = v2;
            if(v1_4[v2 * 0xA924F8B] == 1) {
                v4_1 = true;
            }

            v0_5.ae = ((boolean)v4);
            fr.an(0xD6E01197);
            return 1;
        }

        if(v0 == 0xEFAD8C39) {
            v0_1 = il.aq;
            v1 = ft.ab + 647534090;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v3];
            v1_4 = il.aj;
            v2 = il.ad - 1416926790;
            il.ad = v2;
            if(v1_4[v2 * v8] == 1) {
                v4_1 = true;
            }

            client.al.aba(0x602F9D40).ga(-33).ax(v0_2, ((boolean)v4), -1013256620);
            return 1;
        }

        if(0x4308E332 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0xFABC79D;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_1 = cd.al(nf.ae, client.eh.an, 0x85FF1581);
            v1_1.ae.an(v0, 1189520773);
            client.eh.ae(v1_1, 0x29A5FDB8);
            return 1;
        }

        if(0xC2C == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            ft.ab -= 0x1F446A4A;
            String v1_5 = il.aq[ft.ab * 0x503A2A9F];
            String v2_1 = il.aq[ft.ab * 0xE173C660 + 1];
            if(v1_5.length() > 1205422747) {
                return 1;
            }

            if(v2_1.length() > 0x6CFE5911) {
                return 1;
            }

            na v3_1 = cd.al(nf.di, client.eh.an, 0x9740543D);
            v3_1.ae.an(ki.af(v1_5, 49) + 1 + ki.af(v2_1, 0x30), 0x22550D62);
            v3_1.ae.bs(v0, 0xA6631571);
            v3_1.ae.ai(v2_1, -95);
            v3_1.ae.ai(v1_5, -20);
            client.eh.ae(v3_1, 0x9369A369);
            return 1;
        }

        if(0xC2D == v0) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v2 = il.ad - v12;
            il.ad = v2;
            if(v1_4[v2 * v8] == 1) {
                v4_1 = true;
            }

            v0_6.cy(((boolean)v4), -1590490029);
            return 1;
        }

        if(v0 == 0xC2E) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v2 = il.ad - v12;
            il.ad = v2;
            if(v1_4[v2 * v8] == 1) {
                v4_1 = true;
            }

            v0_6.cf = ((boolean)v4);
            return 1;
        }

        if(0xEC6F995B == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            if(v0_4[v1 * v8] == 1) {
                v4_1 = true;
            }

            client.jo = ((boolean)v4);
            return 1;
        }

        int v13 = 0xA4D0C68B;
        if(v0 == 0xC71A0D95) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            client.jy = v0_4[v1 * v8] == 1 ? (client.jy * 0xF7CBD7B6 | 1) * v13 : (client.jy * 0x7FDEB2DF & -2) * 1017737410;
            return 1;
        }

        int v14 = 0x2324F123;
        if(v0 == 0xC31) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            client.jy = v0_4[v1 * v8] == 1 ? (client.jy * v14 | v10) * v13 : (client.jy * 0xD6901289 & -3) * v13;
            return 1;
        }

        byte v15 = 4;
        if(v0 == 0xC32) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            client.jy = v0_4[v1 * v8] == 1 ? (client.jy * 0xC99F527E | 4) * v13 : (client.jy * v14 & -5) * v13;
            return 1;
        }

        if(0xC33 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0xEC685F7;
            il.ad = v1;
            client.jy = v0_4[v1 * v8] == 1 ? (client.jy * 0xE9099DB6 | 8) * v13 : (client.jy * -758410588 & -9) * 0x8E0C73;
            return 1;
        }

        if(0xC34 == v0) {
            client.jy = 0;
            return 1;
        }

        if(0x690D906A == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            if(v0_4[v1 * 0x678452CF] == 1) {
                v4_1 = true;
            }

            client.iv = ((boolean)v4);
            return 1;
        }

        if(-1848012372 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 745234019;
            il.ad = v1;
            if(v0_4[v1 * v8] == 1) {
                v4_1 = true;
            }

            client.jj = ((boolean)v4);
            return 1;
        }

        if(-1377088017 == v0) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v2 = il.ad - v12;
            il.ad = v2;
            if(v1_4[v2 * 0x1175FEFC] == 1) {
                v4_1 = true;
            }

            v0_6.cc(((boolean)v4), 1);
            return 1;
        }

        if(0xDF863726 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v1 = v1 * v8 - 1;
            if(fh.kf.cp(18)) {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(845308612 == v0) {
            il.ad -= 0xD08C346C;
            client.hp = il.aj[il.ad * v8] * 0x5832D1DF;
            client.ha = il.aj[il.ad * v8 + 1] * -1201192501;
            return 1;
        }

        if(v0 == 3130) {
            il.ad -= v7;
            v0 = il.aj[il.ad * 0x97899E8E];
            if(il.aj[il.ad * v8 + 1] == 1) {
                v4_1 = true;
            }

            fh.kf.ci(v0, ((boolean)v4), -2071702660);
            return 1;
        }

        if(0xB7A085E8 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0x4EA0F425;
            il.ad = v1;
            if(v0_4[v1 * v8] == 1) {
                v4_1 = true;
            }

            fh.kf.cr(((boolean)v4), 0x2EDAF652);
            return 1;
        }

        if(v0 == 0xC3C) {
            v0_4 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v0_4[v1 * 0xAEFC9155 - 1] = dq.tv * 0x451FE0F5;
            v0_4 = il.aj;
            v1 = il.ad + 0x45495FB4;
            il.ad = v1;
            v0_4[v1 * 0x52BDDECF - 1] = bv.tt * 0x59FF07B8;
            return 1;
        }

        if(v0 == 0xC3D) {
            v0_4 = il.aj;
            v1 = il.ad - 0x503C32FF;
            il.ad = v1;
            v0 = v0_4[v1 * -73928100];
            if(v0 < 0) {
                v0 = 0;
            }

            client.al.abi(v0, 0x74992E56);
            return 1;
        }

        if(0x2FD8DD71 == v0) {
            v0_7 = client.al.aba(300716896).bh(0x7DF59A17);
            if(v0_7 != null) {
                v0_7.ab(0xF9363ED);
            }

            return 1;
        }

        if(v0 == 0xE72D649F) {
            il.ad -= 0xA8D3037A;
            v0 = il.aj[il.ad * -160654898];
            if(1 == il.aj[il.ad * v8 + 1]) {
                v4_1 = true;
            }

            lh v0_8 = eh.ax(au.al(0xE5B40F9A), v0, 0x50D2DD7E);
            v1_6 = client.al.aba(0x318F106).bh(0x62D27290);
            if(v1_6 != null && v0_8 != null) {
                v1_6.af(((cf)v0_8), ((boolean)v4), 0xED647047);
            }

            return 1;
        }

        v13 = 0xDA411C09;
        if(v0 == -472293500) {
            client.kn = 0x338804D1;
            v0_4 = il.aj;
            v1 = il.ad + 0x63FE1064;
            il.ad = v1;
            client.lm = v0_4[v1 * 0x366EA6CD] * v13;
            return 1;
        }

        if(v0 == 0xC41) {
            client.kn = 2008023862;
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            client.lm = v0_4[v1 * 0xE9F432C9] * 24342001;
            return 1;
        }

        if(v0 == 0xC42) {
            client.kn = 0;
            return 1;
        }

        if(0xAE2B5295 == v0) {
            client.kn = 0xBBD8019B;
            return 1;
        }

        if(v0 == 3140) {
            client.kn = 0xF03396BD;
            v0 = arg23 ? il.aa.ah * 971580097 : dw.av.ah * 0xD95B4461;
            client.lm = v0 * v13;
            return 1;
        }

        if(v0 == 0xC45) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            if(v0_4[v1 * 906850778] == 1) {
                v4_1 = true;
            }

            li.rg.aj = ((boolean)v4);
            fr.an(0xA2B21BE2);
            return 1;
        }

        if(0xC46 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v1 = v1 * 1783206502 - 1;
            if(li.rg.aj) {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(v0 == -1976510508) {
            v0_4 = il.aj;
            v1 = il.ad - 0x7F47F0B4;
            il.ad = v1;
            if(v0_4[v1 * v8] == 1) {
                v4_1 = true;
            }

            client.er = ((boolean)v4);
            if(v4 == 0) {
                li.rg.ap = "";
                fr.an(0xDD7A0320);
            }

            return 1;
        }

        if(0xC95EE747 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v1 = v1 * v8 - 1;
            if(client.er) {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(v0 == 0xC49) {
            client.al.aba(0x108EFE30).gb(106);
            return 1;
        }

        if(v0 == 0xC4A) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            boolean v0_9 = v0_4[v1 * 0xF77EB03F] == 1 ? true : false;
            if(v0_9 == li.rg.ar) {
                hu v1_7 = li.rg;
                if(!v0_9) {
                    v4_1 = true;
                }

                v1_7.ar = ((boolean)v4);
                fr.an(0xE2677E40);
            }

            return 1;
        }

        if(v0 == 0x1076C3D9) {
            v0_4 = il.aj;
            v1 = il.ad + 1210604640;
            il.ad = v1;
            v1 = v1 * 156054811 - 1;
            if(li.rg.ar) {
            }
            else {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(-1905178781 == v0) {
            if(!client.al.aba(0xCAFE97E1).fg(0x1F)) {
                client.al.aba(0x20CC0881).fs(0x460C1D8A);
            }

            return 1;
        }

        if(0xC4D == v0) {
            v0_4 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v1 = v1 * v8 - 1;
            if(client.al.aba(0x20AFEB71).fg(-12778)) {
                v4 = 1;
            }

            v0_4[v1] = v4;
            return 1;
        }

        if(-1840389178 == v0) {
            v0_7 = client.al.aba(-2030802562).bh(1524205096);
            if(v0_7 != null && (v0_7.bd(-1650227807))) {
                v1_4 = il.aj;
                v2 = il.ad + 0x5B7F839E;
                il.ad = v2;
                v2 = v2 * 0xDB10228F - 1;
                if(v0_7.bm(0xE9CFF341)) {
                    v4 = 1;
                }

                v1_4[v2] = v4;
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC4F) {
            v0_7 = client.al.aba(2001392211).bh(0x69630D77);
            if(v0_7 != null && (v0_7.bd(0xA9725673))) {
                v1_4 = il.aj;
                v2 = il.ad + v12;
                il.ad = v2;
                v1_4[v2 * 0xB312060D - 1] = v0_7.bj(v8);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xD854FAB5) {
            v0_7 = client.al.aba(0xAEACB561).bh(0x6EEC0C14);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + v12;
                il.ad = v2;
                v2 = v2 * v8 - 1;
                if(v0_7.bd(0x4B90C47D)) {
                    v4 = 1;
                }

                v1_4[v2] = v4;
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC51) {
            v0_4 = il.aj;
            v1 = il.ad - 1860811909;
            il.ad = v1;
            v0_4[v1 * 0xBC8928F7 - 1] = hq.bv * 0x5D605980;
            return 1;
        }

        if(0xAD76D26D == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 1643480170;
            il.ad = v1;
            v0_4[v1 * v8 - 1] = cx.ba(14);
            return 1;
        }

        if(0xC53 == v0) {
            v0_1 = il.aq;
            v1 = ft.ab - 0x7137BF5B;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v3];
            v1_6 = client.al.aba(-1019620692).bh(0x562501F1);
            if(v1_6 != null) {
                v1_6.as(v0_2, 1540741018);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == -370714860) {
            v0_7 = client.al.aba(-210446358).bh(0x5D600317);
            if(v0_7 != null) {
                v0_7.ac(120);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0x1F0FBDF0 == v0) {
            il.ad -= v7;
            v0 = il.aj[il.ad * 0xC64FAE83];
            v1 = il.aj[il.ad * v8 + 1];
            v2_2 = client.al.aba(-1458075297).bh(0x66DD3EF1);
            if(v2_2 != null) {
                v2_2.ai(v0, v1, 0x31BDD09);
            }

            return 1;
        }

        if(v0 == 0x1BE18DBD) {
            v0_7 = client.al.aba(0x1F89566D).bh(0x58331D6A);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + 0x774C3EF0;
                il.ad = v2;
                v1_4[v2 * 0x2FC2EFE3 - 1] = v0_7.hr(0xD144F7B0);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC57) {
            v0_7 = client.al.aba(0x502FE8A0).bh(0x780ED034);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad - 300706989;
                il.ad = v2;
                v1_4[v2 * v8 - 1] = v0_7.hn(0x44D51245);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0x9EBC136F == v0) {
            v0_7 = client.al.aba(0x7F8F5C0).bh(0x62076374);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad - 410180705;
                il.ad = v2;
                v1_4[v2 * v8 - 1] = v0_7.ba(0x5B741222);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xBC695585 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x404D2363;
            il.ad = v1;
            v0 = v0_4[v1 * 820170010];
            v1_6 = client.al.aba(709287088).bh(1668453306);
            if(v1_6 != null) {
                v2_3 = il.aj;
                v3 = il.ad + 0x50F0663;
                il.ad = v3;
                v2_3[v3 * v8 - 1] = v1_6.bf(v0, 0x5BF52B5A);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0x90F967C1 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0x31F265F0;
            il.ad = v1;
            v0 = v0_4[v1 * 781520520];
            v1_6 = client.al.aba(0xFE99AB67).bh(0x4C2EA9C4);
            if(v1_6 != null) {
                v2_3 = il.aj;
                v3 = il.ad - 0x56E6C64D;
                il.ad = v3;
                v2_3[v3 * v8 - 1] = v1_6.bn(v0, 0xBBD79F3);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0x342E56DE) {
            v0_1 = il.aq;
            v1 = ft.ab + 596135074;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v3];
            v1_6 = client.al.aba(0x203D6C15).bh(1464757038);
            if(v1_6 != null) {
                v2_3 = il.aj;
                v3 = il.ad + v12;
                il.ad = v3;
                v2_3[v3 * v8 - 1] = v1_6.bp(v0_2, 37);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(527733700 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_6 = client.al.aba(0xCF3EE4FD).bh(0x68EE008D);
            if(v1_6 != null) {
                v2_4 = il.aq;
                v6 = ft.ab + 0x6C06D107;
                ft.ab = v6;
                v2_4[v6 * v3 - 1] = v1_6.bw(v0, 0);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC5D) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_6 = client.al.aba(0xD4816BF0).bh(0x6D061F5E);
            if(v1_6 != null) {
                v2_3 = il.aj;
                v3 = il.ad - 0x5B0BB1C7;
                il.ad = v3;
                v2_3[v3 * 0x77A01E0E - 1] = v1_6.bo(v0, -36);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xF7F0F2) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v0 = v0_4[v1 * 0xC027D0E9];
            v1_4 = il.aj;
            v2 = il.ad + 1445184403;
            il.ad = v2;
            v1 = v1_4[v2 * 0x4EFF82BD];
            v2_2 = client.al.aba(0x704FD043).bh(2001809970);
            if(v2_2 != null) {
                v3_2 = il.aj;
                v4 = il.ad - 0xC7D6EAF;
                il.ad = v4;
                v3_2[v4 * 0x3B5852DB - 1] = v2_2.by(v1, v0, 0xFA00418C);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xC5F == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x10AEA704;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_4 = il.aj;
            v2 = il.ad - 0x4F71F5B7;
            il.ad = v2;
            v1 = v1_4[v2 * v8];
            v2_2 = client.al.aba(0xFF0B9017).bh(0x704EF8DC);
            if(v2_2 != null) {
                v3_2 = il.aj;
                v4 = il.ad + 0x522EB93F;
                il.ad = v4;
                v3_2[v4 * -1093230109 - 1] = v2_2.bt(v1, v0, 1319542001);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xC60 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_4 = il.aj;
            v6 = il.ad + 0x11A8C090;
            il.ad = v6;
            v1 = v1_4[v6 * v8];
            ah v6_1 = client.al.aba(0x5DDCF16B).bh(0x7E94B175);
            if(v6_1 != null) {
                String[] v7_1 = il.aq;
                v8 = ft.ab + 0x18C0A470;
                ft.ab = v8;
                v7_1[v8 * v3 - 1] = v6_1.bq(v1, v0, 0);
                String[] v4_2 = il.aq;
                v7 = ft.ab + v2;
                ft.ab = v7;
                v4_2[v7 * v3 - 1] = v6_1.bv(v1, v0, 0x1824E4B);
                v4_2 = il.aq;
                v7 = ft.ab + 0x36D062BC;
                ft.ab = v7;
                v4_2[v7 * -1041898593 - 1] = v6_1.bx(v1, v0, 0xD191BB0E);
                v4_2 = il.aq;
                v7 = ft.ab - 0x6E3FADD7;
                ft.ab = v7;
                v4_2[v7 * v3 - 1] = v6_1.bg(v1, v0, -1956060524);
                v4_2 = il.aq;
                v7 = ft.ab + v2;
                ft.ab = v7;
                v4_2[v7 * v3 - 1] = v6_1.bh(v1, v0, 0x6CEC1629);
                v4_2 = il.aq;
                v7 = ft.ab + v2;
                ft.ab = v7;
                v4_2[v7 * v3 - 1] = v6_1.bz(v1, v0, v15);
                v2_4 = il.aq;
                v4 = ft.ab - 0x6C1E133;
                ft.ab = v4;
                v2_4[v4 * v3 - 1] = v6_1.bb(v1, v0, 0xA44E447C);
                v2_4 = il.aq;
                v4 = ft.ab + 0x38E9805;
                ft.ab = v4;
                v2_4[v4 * v3 - 1] = v6_1.bc(v1, v0, 1082043980);
                v2_4 = il.aq;
                v3 = ft.ab + 239298660;
                ft.ab = v3;
                v2_4[v3 * 0xCC660AB6 - 1] = v6_1.bk(v1, v0, 39);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xFD02E252) {
            v0_7 = client.al.aba(-460954854).bh(0x7ED30866);
            if(v0_7 != null) {
                v0_7.am(-1970817261);
            }

            return 1;
        }

        if(v0 == -1950209066) {
            ft.ab -= 0xB955376E;
            v14_1 = il.aq[ft.ab * v3];
            v15_1 = il.aq[ft.ab * 0x564F0E78 + 1];
            il.ad -= 0x4578CE9;
            v16 = il.aj[il.ad * v8];
            v17 = il.aj[il.ad * 0x675A6E29 + 1];
            v13_1 = client.al.aba(0x13102B3E).bh(1802274646);
            if(v13_1 != null) {
                v0_4 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v0_4[v1 * v8 - 1] = v13_1.bu(v14_1, v15_1, v16, v17, 0xA1ABB80F);
            }

            return 1;
        }

        if(v0 == 0xD503AAA) {
            ft.ab -= -1273607543;
            v14_1 = il.aq[ft.ab * 0xF1DDC6A1];
            v15_1 = il.aq[ft.ab * v3 + 1];
            String v18 = il.aq[ft.ab * v3 + v10];
            il.ad -= v9;
            v16 = il.aj[il.ad * 0xF0243D5];
            v17 = il.aj[il.ad * 0x410B96E2 + 1];
            int v19 = il.aj[il.ad * -484197000 + v10];
            v13_1 = client.al.aba(209377146).bh(0x500D5DCA);
            if(v13_1 != null) {
                v0_4 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v0_4[v1 * v8 - 1] = v13_1.bs(v14_1, v15_1, v16, v17, v18, v19, -997409513);
            }

            return 1;
        }

        if(v0 == 0xC64) {
            v0_4 = il.aj;
            v1 = il.ad - 0xE924F02;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_6 = client.al.aba(0xA4A06F37).bh(2102318860);
            if(v1_6 != null) {
                v1_6.be(v0, 0xD0DC214B);
            }

            return 1;
        }

        if(v0 == 0xC65) {
            v0_4 = il.aj;
            v1 = il.ad - 1731603354;
            il.ad = v1;
            v0 = v0_4[v1 * v8];
            v1_6 = client.al.aba(-1633981406).bh(0x532269CA);
            if(v1_6 != null) {
                v2_3 = il.aj;
                v3 = il.ad + v12;
                il.ad = v3;
                v2_3[v3 * v8 - 1] = v1_6.br(v0, -1843607880);
            }

            return 1;
        }

        if(0xA01B5550 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x281EE80C;
            il.ad = v1;
            v0 = v0_4[v1 * 1651670717];
            v1_6 = client.al.aba(0xC520844D).bh(0x6DB23110);
            if(v1_6 != null) {
                v1_6.bl(v0, 0xCBCD06FB);
            }

            return 1;
        }

        if(v0 == 0xC67) {
            v0_7 = client.al.aba(0xAC3EE370).bh(0x7597E40F);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + v12;
                il.ad = v2;
                v1_4[v2 * -354082516 - 1] = v0_7.ca(v11);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC68) {
            v0_7 = client.al.aba(0x1931B9DF).bh(0x7213BD07);
            if(v0_7 != null) {
                v0_7.bi(0xFFFF);
                return 1;
            }

            throw new IllegalStateException();
        }

        return v10;
    }

    static int dg(int arg9, hl arg10, boolean arg11) {
        int[] v10_4;
        int[] v2_3;
        String[] v10_3;
        String v10_2;
        String[] v2_1;
        int[] v9_2;
        String[] v11_2;
        String v11_1;
        String[] v0_2;
        int[] v0_1;
        String v9_1;
        int v2;
        String[] v9;
        int v10 = 0x8FA23525;
        int v11 = 0x4A90AB9;
        int v0 = 0xBC5CDEAD;
        if(arg9 == 0xDD0F80BA) {
            v9 = il.aq;
            v2 = ft.ab - 0x40003101;
            ft.ab = v2;
            v9_1 = v9[v2 * v0];
            v0_1 = il.aj;
            v2 = il.ad - v11;
            il.ad = v2;
            v11 = v0_1[v2 * 0xB93DD7F9];
            v0_2 = il.aq;
            v2 = ft.ab + v10;
            ft.ab = v2;
            v0_2[v2 * -143288014 - 1] = v9_1 + v11;
            return 1;
        }

        if(arg9 == -1190507801) {
            ft.ab -= 1200456847;
            v9_1 = il.aq[ft.ab * v0];
            v11_1 = il.aq[ft.ab * 0x8CAE89FA + 1];
            v0_2 = il.aq;
            v2 = ft.ab + v10;
            ft.ab = v2;
            v0_2[v2 * 1144736190 - 1] = v9_1 + v11_1;
            return 1;
        }

        if(0x1006 == arg9) {
            v9 = il.aq;
            v2 = ft.ab + 0x462F57EE;
            ft.ab = v2;
            v9_1 = v9[v2 * v0];
            v0_1 = il.aj;
            v2 = il.ad - v11;
            il.ad = v2;
            v11 = v0_1[v2 * 0xA83D0DEA];
            v0_2 = il.aq;
            v2 = ft.ab + v10;
            ft.ab = v2;
            v0_2[v2 * -507432674 - 1] = v9_1 + js.aj(v11, true, 0x7FA1881B);
            return 1;
        }

        if(0x1007 == arg9) {
            v9 = il.aq;
            v11 = ft.ab - 0x26F47090;
            ft.ab = v11;
            v9_1 = v9[v11 * v0];
            v11_2 = il.aq;
            v2 = ft.ab + v10;
            ft.ab = v2;
            v11_2[v2 * v0 - 1] = v9_1.toLowerCase();
            return 1;
        }

        int v3 = 2;
        int v4 = 1304812425;
        if(arg9 == 0x1008) {
            v9_2 = il.aj;
            v11 = il.ad - 209005265;
            il.ad = v11;
            il.au.setTime(new Date(((((long)v9_2[v11 * v4])) + 0x2DE1) * 86400000));
            arg9 = il.au.get(5);
            v11 = il.au.get(v3);
            v0 = il.au.get(1);
            v2_1 = il.aq;
            v3 = ft.ab + v10;
            ft.ab = v3;
            v2_1[v3 * 834059560 - 1] = arg9 + "-" + il.am[v11] + "-" + v0;
            return 1;
        }

        int v5 = 0x1F446A4A;
        if(arg9 == 0x1009) {
            ft.ab -= v5;
            v9_1 = il.aq[ft.ab * v0];
            v10_2 = il.aq[ft.ab * v0 + 1];
            if(gu.jg.al == null || !gu.jg.al.ae) {
                v10_3 = il.aq;
                v11 = ft.ab + 0x36CDB754;
                ft.ab = v11;
                v10_3[v11 * v0 - 1] = v9_1;
            }
            else {
                v9 = il.aq;
                v11 = ft.ab + 0x5B057883;
                ft.ab = v11;
                v9[v11 * 0xC59CEFA2 - 1] = v10_2;
            }

            return 1;
        }

        if(arg9 == 0x100A) {
            v9_2 = il.aj;
            v0 = il.ad - v11;
            il.ad = v0;
            arg9 = v9_2[v0 * 0x99640E91];
            v11_2 = il.aq;
            v0 = ft.ab + v10;
            ft.ab = v0;
            v11_2[v0 * -1443059110 - 1] = Integer.toString(arg9);
            return 1;
        }

        if(arg9 == 0x5F25D237) {
            ft.ab -= v5;
            v9_2 = il.aj;
            v10 = il.ad + 360420730;
            il.ad = v10;
            v9_2[v10 * 201725076 - 1] = cb.ah(dm.ax(il.aq[ft.ab * 0x1938BF73], il.aq[ft.ab * -920239179 + 1], en.af, 0x1A811CF6), 16);
            return 1;
        }

        int v6 = 0x78DC0DC9;
        int v7 = 0x9521572;
        int v8 = 0;
        if(0x4E0D2C30 == arg9) {
            v9 = il.aq;
            v10 = ft.ab + 810863430;
            ft.ab = v10;
            v9_1 = v9[v10 * v0];
            il.ad -= v7;
            v10 = il.aj[il.ad * 0x4CBD78C6];
            od v2_2 = new od(cj.de.ae(il.aj[il.ad * v4 + 1], 0, v6));
            v0_1 = il.aj;
            v3 = il.ad + v11;
            il.ad = v3;
            v0_1[v3 * 490514925 - 1] = v2_2.aj(v9_1, v10);
            return 1;
        }

        if(0x100D == arg9) {
            v9 = il.aq;
            v10 = ft.ab - 950916429;
            ft.ab = v10;
            v9_1 = v9[v10 * v0];
            il.ad -= v7;
            v10 = il.aj[il.ad * 0xC7F35C58];
            od v0_3 = new od(cj.de.ae(il.aj[il.ad * v4 + 1], 0, v6));
            int[] v11_3 = il.aj;
            v2 = il.ad - 1688705200;
            il.ad = v2;
            v11_3[v2 * v4 - 1] = v0_3.ap(v9_1, v10);
            return 1;
        }

        if(0xEADC3C07 == arg9) {
            ft.ab -= -1404041420;
            v9_1 = il.aq[ft.ab * -1836902220];
            v11_1 = il.aq[ft.ab * v0 + 1];
            v2_3 = il.aj;
            v3 = il.ad + 0x247EF316;
            il.ad = v3;
            if(v2_3[v3 * 0x73D7936] == 1) {
                v11_2 = il.aq;
                v2 = ft.ab + v10;
                ft.ab = v2;
                v11_2[v2 * v0 - 1] = v9_1;
            }
            else {
                v9 = il.aq;
                v2 = ft.ab + v10;
                ft.ab = v2;
                v9[v2 * v0 - 1] = v11_1;
            }

            return 1;
        }

        if(0x100F == arg9) {
            v9 = il.aq;
            v11 = ft.ab - v10;
            ft.ab = v11;
            v9_1 = v9[v11 * 0x2321020E];
            v11_2 = il.aq;
            v0 = ft.ab + v10;
            ft.ab = v0;
            v11_2[v0 * 0x82A0FE6 - 1] = od.ad(v9_1);
            return 1;
        }

        if(-959350812 == arg9) {
            v9 = il.aq;
            v2 = ft.ab + 0x231EF362;
            ft.ab = v2;
            v9_1 = v9[v2 * 2085405588];
            v2_3 = il.aj;
            v3 = il.ad - v11;
            il.ad = v3;
            v11 = v2_3[v3 * 0x51A708F8];
            v2_1 = il.aq;
            v3 = ft.ab + v10;
            ft.ab = v3;
            v2_1[v3 * v0 - 1] = v9_1 + (((char)v11));
            return 1;
        }

        if(arg9 == 0x1011) {
            v9_2 = il.aj;
            v10 = il.ad - v11;
            il.ad = v10;
            arg9 = v9_2[v10 * v4];
            v10_4 = il.aj;
            v11 = il.ad - 1000913427;
            il.ad = v11;
            v11 = v11 * 0xEE360EE7 - 1;
            if(lm.ag(((char)arg9), 0xB4CD570C)) {
                v8 = 1;
            }

            v10_4[v11] = v8;
            return 1;
        }

        if(-1841190339 == arg9) {
            v9_2 = il.aj;
            v10 = il.ad - v11;
            il.ad = v10;
            arg9 = v9_2[v10 * v4];
            v10_4 = il.aj;
            v11 = il.ad - 0x4C6E3F35;
            il.ad = v11;
            v11 = v11 * 0xA244FE51 - 1;
            if(ev.aa(((char)arg9), -697071297)) {
                v8 = 1;
            }

            v10_4[v11] = v8;
            return 1;
        }

        if(arg9 == 0x1013) {
            v9_2 = il.aj;
            v10 = il.ad - v11;
            il.ad = v10;
            arg9 = v9_2[v10 * v4];
            v10_4 = il.aj;
            v0 = il.ad + v11;
            il.ad = v0;
            v0 = v0 * 0xB20ECE5D - 1;
            if(de.af(((char)arg9), 0x2EC3704F)) {
                v8 = 1;
            }

            v10_4[v0] = v8;
            return 1;
        }

        if(arg9 == -1088350480) {
            v9_2 = il.aj;
            v10 = il.ad - v11;
            il.ad = v10;
            arg9 = v9_2[v10 * 0xCDFC01B0];
            v10_4 = il.aj;
            v0 = il.ad + v11;
            il.ad = v0;
            v0 = v0 * 0xBC2D90AB - 1;
            if(at.ai(((char)arg9), 2008493810)) {
                v8 = 1;
            }

            v10_4[v0] = v8;
            return 1;
        }

        if(arg9 == 0x38D5F13D) {
            v9 = il.aq;
            v10 = ft.ab + 192094849;
            ft.ab = v10;
            v9_1 = v9[v10 * 0x10D0D025];
            if(v9_1 != null) {
                v10_4 = il.aj;
                v0 = il.ad + v11;
                il.ad = v0;
                v10_4[v0 * 0x403A38D7 - 1] = v9_1.length();
            }
            else {
                v9_2 = il.aj;
                v10 = il.ad - 0x62106719;
                il.ad = v10;
                v9_2[v10 * v4 - 1] = 0;
            }

            return 1;
        }

        if(arg9 == 0x1016) {
            v9 = il.aq;
            v11 = ft.ab + 0x30F2A2E0;
            ft.ab = v11;
            v9_1 = v9[v11 * 1001095332];
            il.ad -= 2031670321;
            v11 = il.aj[il.ad * 0xAB9D3BE1];
            v0 = il.aj[il.ad * 986099249 + 1];
            v2_1 = il.aq;
            v3 = ft.ab + v10;
            ft.ab = v3;
            v2_1[v3 * 440808654 - 1] = v9_1.substring(v11, v0);
            return 1;
        }

        if(arg9 == 0xB82DF355) {
            v9 = il.aq;
            v10 = ft.ab - 0x5E85480C;
            ft.ab = v10;
            v9_1 = v9[v10 * v0];
            v10_1 = new StringBuilder(v9_1.length());
            v11 = 0;
            v0 = 0;
            while(v11 < v9_1.length()) {
                char v2_4 = v9_1.charAt(v11);
                if(v2_4 == 60) {
                    v0 = 1;
                }
                else if(0x115CE706 == v2_4) {
                    v0 = 0;
                }
                else if(v0 == 0) {
                    v10_1.append(v2_4);
                }

                ++v11;
            }

            v9 = il.aq;
            v11 = ft.ab + 0x4B0AE7BF;
            ft.ab = v11;
            v9[v11 * 0xBFD6F495 - 1] = v10_1.toString();
            return 1;
        }

        if(arg9 == 4120) {
            v9 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v9_1 = v9[v2 * v0];
            v10_4 = il.aj;
            v0 = il.ad - v11;
            il.ad = v0;
            v10 = v10_4[v0 * 0xDEB3B183];
            v0_1 = il.aj;
            v2 = il.ad + v11;
            il.ad = v2;
            v0_1[v2 * v4 - 1] = v9_1.indexOf(v10);
            return 1;
        }

        if(arg9 == 0xBB33DA15) {
            ft.ab -= v5;
            v9_1 = il.aq[ft.ab * v0];
            v10_2 = il.aq[ft.ab * v0 + 1];
            v0_1 = il.aj;
            v2 = il.ad - 0x5E8CCB89;
            il.ad = v2;
            v0 = v0_1[v2 * v4];
            v2_3 = il.aj;
            v3 = il.ad + v11;
            il.ad = v3;
            v2_3[v3 * v4 - 1] = v9_1.indexOf(v10_2, v0);
            return 1;
        }

        if(0x41BD4F55 == arg9) {
            v9 = il.aq;
            v11 = ft.ab - v10;
            ft.ab = v11;
            v9_1 = v9[v11 * v0];
            v10_3 = il.aq;
            v11 = ft.ab - 0x45B7B6C2;
            ft.ab = v11;
            v10_3[v11 * 0x977208F4 - 1] = v9_1.toUpperCase();
            return 1;
        }

        return v3;
    }

    static int dh(int arg1, hl arg2, boolean arg3) {
        ar v2_1;
        if(arg1 >= 2000) {
            arg1 += -1000;
            int[] v2 = il.aj;
            int v3 = il.ad - 0x4A90AB9;
            il.ad = v3;
            v2_1 = bl.al(v2[v3 * 0x6EF2E1BE], 0x64D7CF4D);
        }
        else if(arg3) {
            v2_1 = il.aa;
        }
        else {
            v2_1 = dw.av;
        }

        if(arg1 == 0x787) {
            if(il.at * 0x75800AE8 < 10) {
                if(v2_1.fk == null) {
                    return 0;
                }

                iw v1 = new iw();
                v1.ae = v2_1;
                v1.ax = v2_1.fk;
                v1.af = il.at * 0x9CCAC105 + 0x5314F6D;
                client.nc.al(((mx)v1));
                return 1;
            }

            throw new RuntimeException();
        }

        return 2;
    }

    static int di(int arg11, hl arg12, boolean arg13) {
        int v12_2;
        int[] v11_2;
        String[] v11_1;
        dy v11;
        dy v12 = null;
        int v13 = 0xA0D17C73;
        int v0 = 0;
        int v1 = 0x73;
        int v2 = 0xBC5CDEAD;
        int v3 = 0x8FA23525;
        int v4 = 1304812425;
        if(3400 == arg11) {
            il.ad -= 0x9521572;
            arg11 = il.aj[il.ad * v4];
            v4 = il.aj[il.ad * v4 + 1];
            v11 = cy.al(arg11, 0x37CFC885);
            while(v0 < v11.aj * v13) {
                if(v4 == v11.ad[v0]) {
                    String[] v13_1 = il.aq;
                    v1 = ft.ab + v3;
                    ft.ab = v1;
                    v13_1[v1 * v2 - 1] = v11.ab[v0];
                    v11 = v12;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }

            if(v11 != null) {
                String[] v12_1 = il.aq;
                v13 = ft.ab + v3;
                ft.ab = v13;
                v12_1[v13 * v2 - 1] = v11.an;
            }

            return 1;
        }

        int v7 = 2;
        int v8 = 0x4A90AB9;
        if(0xD50 == arg11) {
            il.ad -= 0x12A42AE4;
            arg11 = il.aj[il.ad * v4];
            int v6 = il.aj[il.ad * v4 + 1];
            v7 = il.aj[il.ad * v4 + v7];
            int v9 = il.aj[il.ad * v4 + 3];
            dy v7_1 = cy.al(v7, 287152790);
            if(v7_1.ae == arg11 && v6 == v7_1.ar) {
                while(true) {
                    if(v0 >= v7_1.aj * v13) {
                        break;
                    }
                    else if(v7_1.ad[v0] != v9) {
                        ++v0;
                        continue;
                    }
                    else if(v6 == v1) {
                        v11_1 = il.aq;
                        v13 = ft.ab + v3;
                        ft.ab = v13;
                        v11_1[v13 * v2 - 1] = v7_1.ab[v0];
                    }
                    else {
                        v11_2 = il.aj;
                        v13 = il.ad + v8;
                        il.ad = v13;
                        v11_2[v13 * v4 - 1] = v7_1.aq[v0];
                    }

                    goto label_119;
                }

                v12 = v7_1;
            label_119:
                if(v12 != null) {
                    if(v6 == v1) {
                        v11_1 = il.aq;
                        v13 = ft.ab + v3;
                        ft.ab = v13;
                        v11_1[v13 * v2 - 1] = v12.an;
                    }
                    else {
                        v11_2 = il.aj;
                        v13 = il.ad + v8;
                        il.ad = v13;
                        v11_2[v13 * v4 - 1] = v12.ap * 0x4B4D1E61;
                    }
                }

                return 1;
            }

            if(v1 == v6) {
                v11_1 = il.aq;
                v12_2 = ft.ab + v3;
                ft.ab = v12_2;
                v11_1[v12_2 * v2 - 1] = gs.aq;
            }
            else {
                v11_2 = il.aj;
                v12_2 = il.ad + v8;
                il.ad = v12_2;
                v11_2[v12_2 * v4 - 1] = 0;
            }

            return 1;
        }

        if(arg11 == 0xD53) {
            v11_2 = il.aj;
            v12_2 = il.ad - v8;
            il.ad = v12_2;
            v11 = cy.al(v11_2[v12_2 * v4], 0x95530CCF);
            int[] v12_3 = il.aj;
            v13 = il.ad + v8;
            il.ad = v13;
            v12_3[v13 * v4 - 1] = v11.an(8);
            return 1;
        }

        return v7;
    }

    static int dj(int arg5, hl arg6, boolean arg7) {
        int v6_2;
        String[] v5_1;
        int[] v5;
        int[] v6 = il.aj;
        int v0 = 0x4A90AB9;
        int v7 = il.ad - v0;
        il.ad = v7;
        int v1 = 1304812425;
        ar v6_1 = bl.al(v6[v7 * v1], 0x64D7CF4D);
        if(arg5 == 0xAF0) {
            v5 = il.aj;
            v7 = il.ad + v0;
            il.ad = v7;
            v5[v7 * v1 - 1] = ct.ae(ib.il(v6_1, 0x935C8389), 0x7F0F00B5);
            return 1;
        }

        int v3 = 0xBC5CDEAD;
        int v4 = 0x8FA23525;
        if(arg5 == 0xAF1) {
            v5 = il.aj;
            v7 = il.ad - v0;
            il.ad = v7;
            arg5 = v5[v7 * v1] - 1;
            if(v6_1.dd == null || arg5 >= v6_1.dd.length || v6_1.dd[arg5] == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                String[] v7_1 = il.aq;
                v0 = ft.ab + v4;
                ft.ab = v0;
                v7_1[v0 * v3 - 1] = v6_1.dd[arg5];
            }

            return 1;
        }

        if(arg5 == 0xAF2) {
            if(v6_1.dt == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                v5_1 = il.aq;
                v7 = ft.ab + v4;
                ft.ab = v7;
                v5_1[v7 * v3 - 1] = v6_1.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dk(int arg4, hl arg5, boolean arg6) {
        int v5_2;
        String[] v4_1;
        int v0;
        int[] v4;
        int[] v5 = il.aj;
        int v6 = il.ad + 182809673;
        il.ad = v6;
        ar v5_1 = bl.al(v5[v6 * 0x6828696D], 0x64D7CF4D);
        if(arg4 == 0xFAF1FD91) {
            v4 = il.aj;
            v0 = il.ad + 0x4A90AB9;
            il.ad = v0;
            v4[v0 * -662071907 - 1] = ct.ae(ib.il(v5_1, -1411660508), 0x7F0F00B5);
            return 1;
        }

        int v1 = 0xBC5CDEAD;
        int v2 = 0x8FA23525;
        if(arg4 == 0xAF1) {
            v4 = il.aj;
            v0 = il.ad - 204188012;
            il.ad = v0;
            arg4 = v4[v0 * 42642058] - 1;
            if(v5_1.dd == null || arg4 >= v5_1.dd.length || v5_1.dd[arg4] == null) {
                v4_1 = il.aq;
                v5_2 = ft.ab - 1586368070;
                ft.ab = v5_2;
                v4_1[v5_2 * 0xF18F6F66 - 1] = "";
            }
            else {
                String[] v0_1 = il.aq;
                int v3 = ft.ab + v2;
                ft.ab = v3;
                v0_1[v3 * v1 - 1] = v5_1.dd[arg4];
            }

            return 1;
        }

        if(arg4 == 1768290407) {
            if(v5_1.dt == null) {
                v4_1 = il.aq;
                v5_2 = ft.ab - 0x42DDA384;
                ft.ab = v5_2;
                v4_1[v5_2 * v1 - 1] = "";
            }
            else {
                v4_1 = il.aq;
                v0 = ft.ab + v2;
                ft.ab = v0;
                v4_1[v0 * 0x98C4A720 - 1] = v5_1.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dl(int arg19, hl arg20, boolean arg21) {
        int v14;
        String v12_1;
        int[] v4_3;
        int[] v2_4;
        ah v2_3;
        ah v1_6;
        ah v0_7;
        fw v0_6;
        int v5_1;
        int v4;
        int[] v1_4;
        boolean v2_1;
        int[] v0_4;
        na v1_1;
        String v0_2;
        int v1;
        String[] v0_1;
        int v0 = arg19;
        int v2 = 0;
        if(v0 == 3100) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x6D253010;
            ft.ab = v1;
            ib.al(0, "", v0_1[v1 * 0xE373101], 0x9910633F);
            return 1;
        }

        if(3101 == v0) {
            il.ad -= -2009564135;
            jb.cm(gu.jg, il.aj[il.ad * 0xF1FDFBBB], il.aj[il.ad * 0x8B00C8D0 + 1], 2060993344);
            return 1;
        }

        if(v0 == 0xC1F) {
            if(!il.ah) {
                il.ag = true;
            }

            return 1;
        }

        if(0xEBBDF31D == v0) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x536D86F5;
            ft.ab = v1;
            v0_2 = v0_1[v1 * 0x50565B4D];
            if(hu.al(((CharSequence)v0_2), -332280163)) {
                v2 = bw.ar(((CharSequence)v0_2), 0x1632067B);
            }

            na v0_3 = cd.al(nf.bb, client.eh.an, 0x8C2414B8);
            v0_3.ae.aj(v2, 0x79EF67B1);
            client.eh.ae(v0_3, 0x3A2BF269);
            return 1;
        }

        byte v5 = -9;
        int v6 = 0xBC5CDEAD;
        if(v0 == 3105) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x6E3CE1A9;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v6];
            v1_1 = cd.al(nf.au, client.eh.an, 0x84E8B0C1);
            v1_1.ae.ar(v0_2.length() + 1, 22);
            v1_1.ae.ai(v0_2, v5);
            client.eh.ae(v1_1, -860126033);
            return 1;
        }

        int v7 = 0x8FA23525;
        if(0x62DEA80E == v0) {
            v0_1 = il.aq;
            v1 = ft.ab - v7;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v6];
            v1_1 = cd.al(nf.bs, client.eh.an, -2103901741);
            v1_1.ae.ar(v0_2.length() + 1, 78);
            v1_1.ae.ai(v0_2, -90);
            client.eh.ae(v1_1, -608966508);
            return 1;
        }

        if(3107 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0x4EC902D1;
            il.ad = v1;
            v0 = v0_4[v1 * 864594505];
            String[] v1_2 = il.aq;
            v2 = ft.ab + 0x5140C392;
            ft.ab = v2;
            dh.fv(v0, v1_2[v2 * 0xE9AEDFF6], 0x2B0564F8);
            return 1;
        }

        int v8 = 2;
        int v9 = 1304812425;
        if(3108 == v0) {
            il.ad -= 0xDFB202B;
            ky.gt(bl.al(il.aj[il.ad * v9 + v8], 0x64D7CF4D), il.aj[il.ad * v9], il.aj[il.ad * 0xBB7F94C2 + 1], 29);
            return 1;
        }

        if(0x399149B2 == v0) {
            il.ad -= -87601109;
            v0 = il.aj[il.ad * v9];
            v2 = il.aj[il.ad * 0x8808497D + 1];
            ar v1_3 = arg21 ? il.aa : dw.av;
            ky.gt(v1_3, v0, v2, 0x60);
            return 1;
        }

        int v10 = 0x4A90AB9;
        if(v0 == -1271064851) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            if(v0_4[v1 * v9] == 1) {
                v2_1 = true;
            }

            ci.ch = v2_1;
            return 1;
        }

        if(v0 == -1009931236) {
            v0_4 = il.aj;
            v1 = il.ad + 781728009;
            il.ad = v1;
            v1 = v1 * 0x1D8C7C86 - 1;
            if(li.rg.ae) {
                v2 = 1;
            }

            v0_4[v1] = v2;
            return 1;
        }

        if(0xC28 == v0) {
            hu v0_5 = li.rg;
            v1_4 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            if(v1_4[v4 * 0xC7BFB508] == 1) {
                v2_1 = true;
            }

            v0_5.ae = v2_1;
            fr.an(0x95523A4);
            return 1;
        }

        if(v0 == 0x7A1D0369) {
            v0_1 = il.aq;
            v1 = ft.ab + 0x15DD0B28;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v6];
            v1_4 = il.aj;
            v4 = il.ad - 0x58324DDB;
            il.ad = v4;
            if(v1_4[v4 * v9] == 1) {
                v2_1 = true;
            }

            client.al.aba(-2024430529).ga(41).ax(v0_2, v2_1, 0x9679BF3);
            return 1;
        }

        if(402056510 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v0 = v0_4[v1 * 2094907177];
            v1_1 = cd.al(nf.ae, client.eh.an, -1903988404);
            v1_1.ae.an(v0, 1908992409);
            client.eh.ae(v1_1, 0xF2AAAB0F);
            return 1;
        }

        if(0xC2C == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x2D943434;
            il.ad = v1;
            v0 = v0_4[v1 * v9];
            ft.ab -= 0x1F446A4A;
            String v1_5 = il.aq[ft.ab * 0x8BE3103F];
            String v2_2 = il.aq[ft.ab * v6 + 1];
            v5_1 = 500;
            if(v1_5.length() > v5_1) {
                return 1;
            }

            if(v2_2.length() > v5_1) {
                return 1;
            }

            na v4_1 = cd.al(nf.di, client.eh.an, 0x80E6FBCB);
            v4_1.ae.an(ki.af(v1_5, 108) + 1 + ki.af(v2_2, 28), 0xEFDB9D80);
            v4_1.ae.bs(v0, 90307869);
            v4_1.ae.ai(v2_2, -101);
            v4_1.ae.ai(v1_5, -13);
            client.eh.ae(v4_1, 0xE03F112E);
            return 1;
        }

        if(0xC2D == v0) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v4 = il.ad - 1038002020;
            il.ad = v4;
            if(v1_4[v4 * v9] == 1) {
                v2_1 = true;
            }

            v0_6.cy(v2_1, 0x9D728A63);
            return 1;
        }

        if(v0 == 0xC2E) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v4 = il.ad - 0x20752F22;
            il.ad = v4;
            if(v1_4[v4 * 294100474] == 1) {
                v2_1 = true;
            }

            v0_6.cf = v2_1;
            return 1;
        }

        if(0xC2F == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            if(v0_4[v1 * v9] == 1) {
                v2_1 = true;
            }

            client.jo = v2_1;
            return 1;
        }

        int v11 = 0x2324F123;
        if(v0 == -170697906) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            client.jy = v0_4[v1 * v9] == 1 ? (client.jy * v11 | 1) * 1377706793 : (client.jy * 1554599302 & -2) * -1810310111;
            return 1;
        }

        int v12 = 0xA4D0C68B;
        if(v0 == 0xC31) {
            v0_4 = il.aj;
            v1 = il.ad - 0x56DBA2FB;
            il.ad = v1;
            client.jy = v0_4[v1 * v9] == 1 ? (client.jy * v11 | v8) * 1308285012 : (client.jy * 190494225 & -3) * v12;
            return 1;
        }

        byte v13 = 4;
        if(v0 == 0xC32) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            client.jy = v0_4[v1 * 0x5AC6342E] == 1 ? (client.jy * v11 | v13) * 0x168DFAAF : (0xCF55FEA3 & client.jy * -1968690823) * v12;
            return 1;
        }

        if(0xC33 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 2038086503;
            il.ad = v1;
            client.jy = v0_4[v1 * v9] == 1 ? (client.jy * v11 | 8) * v12 : (client.jy * 0xF90440C & -9) * v12;
            return 1;
        }

        if(0xC34 == v0) {
            client.jy = 0;
            return 1;
        }

        if(0xC35 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x7C770423;
            il.ad = v1;
            if(v0_4[v1 * 583309049] == 1) {
                v2_1 = true;
            }

            client.iv = v2_1;
            return 1;
        }

        if(-306485788 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 1103606270;
            il.ad = v1;
            if(v0_4[v1 * v9] == 1) {
                v2_1 = true;
            }

            client.jj = v2_1;
            return 1;
        }

        if(0xC37 == v0) {
            v0_6 = fh.kf;
            v1_4 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            if(v1_4[v4 * v9] == 1) {
                v2_1 = true;
            }

            v0_6.cc(v2_1, 1);
            return 1;
        }

        if(0xC38 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x5688EFBC;
            il.ad = v1;
            v1 = v1 * 1049903238 - 1;
            if(fh.kf.cp(-16)) {
                v2 = 1;
            }

            v0_4[v1] = v2;
            return 1;
        }

        if(1200304160 == v0) {
            il.ad -= 0x2EEB2EDE;
            client.hp = il.aj[il.ad * v9] * -1519005194;
            client.ha = il.aj[il.ad * v9 + 1] * 0x76489FE9;
            return 1;
        }

        v5_1 = 0x9521572;
        if(v0 == 3130) {
            il.ad -= v5_1;
            v0 = il.aj[il.ad * v9];
            if(il.aj[il.ad * v9 + 1] == 1) {
                v2_1 = true;
            }

            fh.kf.ci(v0, v2_1, -2034488132);
            return 1;
        }

        if(0xC3B == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x256C4A49;
            il.ad = v1;
            if(v0_4[v1 * 0xDA099D51] == 1) {
                v2_1 = true;
            }

            fh.kf.cr(v2_1, 0x2EDAF652);
            return 1;
        }

        if(v0 == 0x700E4DE8) {
            v0_4 = il.aj;
            v1 = il.ad + 620901718;
            il.ad = v1;
            v0_4[v1 * v9 - 1] = dq.tv * 2034776884;
            v0_4 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v0_4[v1 * 0x6CE2A0F - 1] = bv.tt * 742742805;
            return 1;
        }

        if(v0 == 0xC3D) {
            v0_4 = il.aj;
            v1 = il.ad - 0x160AFEB3;
            il.ad = v1;
            v0 = v0_4[v1 * v9];
            if(v0 < 0) {
                v0 = 0;
            }

            client.al.abi(v0, 0x642B0F47);
            return 1;
        }

        if(0xC3E == v0) {
            v0_7 = client.al.aba(0x3B1A165F).bh(1974280877);
            if(v0_7 != null) {
                v0_7.ab(0xF9363ED);
            }

            return 1;
        }

        if(v0 == 0xC3F) {
            il.ad -= v5_1;
            v0 = il.aj[il.ad * v9];
            if(1 == il.aj[il.ad * -1020212200 + 1]) {
                v2_1 = true;
            }

            lh v0_8 = eh.ax(au.al(0x6958F0ED), v0, 1767006440);
            v1_6 = client.al.aba(0x6D5B9E0E).bh(0x4D94104B);
            if(v1_6 != null && v0_8 != null) {
                v1_6.af(((cf)v0_8), v2_1, 0x780B153);
            }

            return 1;
        }

        v5_1 = 0x338804D1;
        v11 = 0xDA411C09;
        if(v0 == 0x2A369BAF) {
            client.kn = v5_1;
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            client.lm = v0_4[v1 * v9] * v11;
            return 1;
        }

        if(v0 == 0xC41) {
            client.kn = 913885047;
            v0_4 = il.aj;
            v1 = il.ad - 0x3F242B01;
            il.ad = v1;
            client.lm = v0_4[v1 * v9] * v11;
            return 1;
        }

        if(v0 == 0xC42) {
            client.kn = 0;
            return 1;
        }

        if(-1884010027 == v0) {
            client.kn = 0x80947375;
            return 1;
        }

        if(v0 == 3140) {
            client.kn = v5_1;
            v0 = arg21 ? il.aa.ah * 0x32A83929 : dw.av.ah * 971580097;
            client.lm = v0 * v11;
            return 1;
        }

        if(v0 == 0x160735F6) {
            v0_4 = il.aj;
            v1 = il.ad + 0x2066DCAF;
            il.ad = v1;
            if(v0_4[v1 * -2023146730] == 1) {
                v2_1 = true;
            }

            li.rg.aj = v2_1;
            fr.an(0xAFB5C270);
            return 1;
        }

        if(-1004243518 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 0x1A75A48F;
            il.ad = v1;
            v1 = v1 * 0x3E5E90F4 - 1;
            if(li.rg.aj) {
                v2 = 1;
            }

            v0_4[v1] = v2;
            return 1;
        }

        if(v0 == 0xC47) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            if(v0_4[v1 * v9] == 1) {
                v2_1 = true;
            }

            client.er = v2_1;
            if((((int)v2_1)) == 0) {
                li.rg.ap = "";
                fr.an(0xF2EABEA7);
            }

            return 1;
        }

        if(0xC48 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 1662907069;
            il.ad = v1;
            v1 = v1 * v9 - 1;
            if(client.er) {
                v2 = 1;
            }

            v0_4[v1] = v2;
            return 1;
        }

        if(v0 == 0xF2404507) {
            client.al.aba(-1647804714).gb(-52);
            return 1;
        }

        if(v0 == 0xF8E9F162) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            boolean v0_9 = v0_4[v1 * 0xD7DCAF07] == 1 ? true : false;
            if(v0_9 == li.rg.ar) {
                hu v1_7 = li.rg;
                if(!v0_9) {
                    v2_1 = true;
                }

                v1_7.ar = v2_1;
                fr.an(0x9E83DB0F);
            }

            return 1;
        }

        if(v0 == 0xB3E1755) {
            v0_4 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v0_4[v1 * 1082805070 - 1] = li.rg.ar ^ 1;
            return 1;
        }

        if(0xC4C == v0) {
            if(!client.al.aba(0x2B0FB8FF).fg(-12706)) {
                client.al.aba(0x8E4A400).fs(-1964136061);
            }

            return 1;
        }

        if(0x824DAFDE == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0x388F3BC5;
            il.ad = v1;
            v0_4[v1 * v9 - 1] = client.al.aba(0xF7B39078).fg(-22299);
            return 1;
        }

        if(3150 == v0) {
            v0_7 = client.al.aba(1013391689).bh(0x621C3C00);
            if(v0_7 != null && (v0_7.bd(0xA86E380D))) {
                v1_4 = il.aj;
                v4 = il.ad + v10;
                il.ad = v4;
                v4 = v4 * v9 - 1;
                if(v0_7.bm(-162011060)) {
                    v2 = 1;
                }

                v1_4[v4] = v2;
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 2036676726) {
            v0_7 = client.al.aba(941257010).bh(1277608359);
            if(v0_7 != null && (v0_7.bd(1209746826))) {
                v1_4 = il.aj;
                v4 = il.ad + 0xF038823;
                il.ad = v4;
                v4 = v4 * v9 - 1;
                if(v0_7.bj(v9)) {
                    v2 = 1;
                }

                v1_4[v4] = v2;
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == -1119000481) {
            v0_7 = client.al.aba(0x48E666F4).bh(0x4CA1F7D2);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad - 2035697140;
                il.ad = v2;
                v1_4[v2 * 0xF2CDE9E9 - 1] = v0_7.bd(0x4FC287D7);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0x758FC970) {
            v0_4 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v0_4[v1 * 0x8CCFAFD8 - 1] = hq.bv * 0xC7857860;
            return 1;
        }

        if(0xC52 == v0) {
            v0_4 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v0_4[v1 * -492667430 - 1] = cx.ba(14);
            return 1;
        }

        if(-1212260748 == v0) {
            v0_1 = il.aq;
            v1 = ft.ab - v7;
            ft.ab = v1;
            v0_2 = v0_1[v1 * 0x58964EA7];
            v1_6 = client.al.aba(-837010625).bh(0x7296DD0D);
            if(v1_6 != null) {
                v1_6.as(v0_2, 0xB2B989EE);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xE7EFA431) {
            v0_7 = client.al.aba(0x762EF780).bh(0x6AE28304);
            if(v0_7 != null) {
                v0_7.ac(0x77);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xC55 == v0) {
            il.ad -= 0xEEFEA6C1;
            v0 = il.aj[il.ad * 0xB480B682];
            v1 = il.aj[il.ad * 0x37AF752C + 1];
            v2_3 = client.al.aba(0xF934DD8E).bh(1556800523);
            if(v2_3 != null) {
                v2_3.ai(v0, v1, 0x31BDD09);
            }

            return 1;
        }

        if(v0 == 0xC56) {
            v0_7 = client.al.aba(0x5FDFA24B).bh(0x561AB60A);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + 1903461283;
                il.ad = v2;
                v1_4[v2 * -1065831705 - 1] = v0_7.hr(0x5C77D944);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0x7ECE225A) {
            v0_7 = client.al.aba(0xE655A201).bh(0x7DBFDE0B);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad - 0x681BC6DF;
                il.ad = v2;
                v1_4[v2 * v9 - 1] = v0_7.hn(0x5482C2CF);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xB96F400A == v0) {
            v0_7 = client.al.aba(0x62887E77).bh(1446336403);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + v10;
                il.ad = v2;
                v1_4[v2 * v9 - 1] = v0_7.ba(0x371AF900);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0x1FFA590D == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v0 = v0_4[v1 * 0x7907F40C];
            v1_6 = client.al.aba(228890741).bh(0x5AB71602);
            if(v1_6 != null) {
                v2_4 = il.aj;
                v4 = il.ad + 0x7C99A10;
                il.ad = v4;
                v2_4[v4 * v9 - 1] = v1_6.bf(v0, 0x33A94F50);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xC5A == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 190471860;
            il.ad = v1;
            v0 = v0_4[v1 * 155025000];
            v1_6 = client.al.aba(0xE94953).bh(1502680483);
            if(v1_6 != null) {
                v2_4 = il.aj;
                v4 = il.ad + v10;
                il.ad = v4;
                v2_4[v4 * 0xE05B56B6 - 1] = v1_6.bn(v0, 0xBBD603B4);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC5B) {
            v0_1 = il.aq;
            v1 = ft.ab - v7;
            ft.ab = v1;
            v0_2 = v0_1[v1 * v6];
            v1_6 = client.al.aba(0x95486E21).bh(0x73508D3D);
            if(v1_6 != null) {
                v2_4 = il.aj;
                v4 = il.ad + v10;
                il.ad = v4;
                v2_4[v4 * 1100967595 - 1] = v1_6.bp(v0_2, 24);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xC5C == v0) {
            v0_4 = il.aj;
            v1 = il.ad + 1407378088;
            il.ad = v1;
            v0 = v0_4[v1 * 0x69D0BDBD];
            v1_6 = client.al.aba(886930373).bh(0x4B4A9E34);
            if(v1_6 != null) {
                String[] v4_2 = il.aq;
                v5_1 = ft.ab + 504101031;
                ft.ab = v5_1;
                v4_2[v5_1 * v6 - 1] = v1_6.bw(v0, 0);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 995355880) {
            v0_4 = il.aj;
            v1 = il.ad - 0x60BEA1CC;
            il.ad = v1;
            v0 = v0_4[v1 * v9];
            v1_6 = client.al.aba(0x40E686DC).bh(2004144310);
            if(v1_6 != null) {
                v2_4 = il.aj;
                v4 = il.ad + v10;
                il.ad = v4;
                v2_4[v4 * 0xEEBC3581 - 1] = v1_6.bo(v0, -49);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xC5E) {
            v0_4 = il.aj;
            v1 = il.ad + 0x1CC86DA1;
            il.ad = v1;
            v0 = v0_4[v1 * v9];
            v1_4 = il.aj;
            v2 = il.ad - 1724758058;
            il.ad = v2;
            v1 = v1_4[v2 * v9];
            v2_3 = client.al.aba(0x38F7E9A5).bh(0x595E0520);
            if(v2_3 != null) {
                v4_3 = il.aj;
                v5_1 = il.ad + v10;
                il.ad = v5_1;
                v4_3[v5_1 * 0xFA013A0D - 1] = v2_3.by(v1, v0, 0xEE9221FB);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0xAF62C141 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v0 = v0_4[v1 * 0x880CC280];
            v1_4 = il.aj;
            v2 = il.ad - v10;
            il.ad = v2;
            v1 = v1_4[v2 * v9];
            v2_3 = client.al.aba(650666729).bh(0x49E1B891);
            if(v2_3 != null) {
                v4_3 = il.aj;
                v5_1 = il.ad + 0xDD4F9C5;
                il.ad = v5_1;
                v4_3[v5_1 * 0xB2004006 - 1] = v2_3.bt(v1, v0, 0x76E22641);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(0x30A323EE == v0) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v0 = v0_4[v1 * 0x3B77E1BC];
            v1_4 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            v1 = v1_4[v4 * 0x6649CB1F];
            ah v4_4 = client.al.aba(-963496601).bh(1251085508);
            if(v4_4 != null) {
                String[] v5_2 = il.aq;
                v8 = ft.ab + 1013190030;
                ft.ab = v8;
                v5_2[v8 * 0x6D0A305 - 1] = v4_4.bq(v1, v0, 0);
                String[] v2_5 = il.aq;
                v5_1 = ft.ab + 1466101110;
                ft.ab = v5_1;
                v2_5[v5_1 * v6 - 1] = v4_4.bv(v1, v0, 434692700);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * v6 - 1] = v4_4.bx(v1, v0, 0xD3A70DD1);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * 0xE0E570CC - 1] = v4_4.bg(v1, v0, 0xB88AD110);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * 0x5E4F81FD - 1] = v4_4.bh(v1, v0, 0x7CB854E0);
                v2_5 = il.aq;
                v5_1 = ft.ab - 2043994568;
                ft.ab = v5_1;
                v2_5[v5_1 * -1251900829 - 1] = v4_4.bz(v1, v0, v13);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * v6 - 1] = v4_4.bb(v1, v0, 0xA44E447C);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * v6 - 1] = v4_4.bc(v1, v0, -1949800555);
                v2_5 = il.aq;
                v5_1 = ft.ab + v7;
                ft.ab = v5_1;
                v2_5[v5_1 * v6 - 1] = v4_4.bk(v1, v0, 90);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == 0xE1E1DB71) {
            v0_7 = client.al.aba(0xEEDBCD20).bh(0x73E61700);
            if(v0_7 != null) {
                v0_7.am(-1880208314);
            }

            return 1;
        }

        if(v0 == -1956750964) {
            ft.ab -= 0x2A6FE2F0;
            String v11_1 = il.aq[ft.ab * v6];
            v12_1 = il.aq[ft.ab * 1272402107 + 1];
            il.ad -= -609896552;
            int v13_1 = il.aj[il.ad * v9];
            v14 = il.aj[il.ad * 0xAFAC2F24 + 1];
            ah v10_1 = client.al.aba(0x69BFAC07).bh(0x5D020D68);
            if(v10_1 != null) {
                v0_4 = il.aj;
                v1 = il.ad - 0xE3FDC7D;
                il.ad = v1;
                v0_4[v1 * 0x53B292F7 - 1] = v10_1.bu(v11_1, v12_1, v13_1, v14, 0x9193D4EE);
            }

            return 1;
        }

        if(v0 == 0xC63) {
            ft.ab -= 0xF070653E;
            v12_1 = il.aq[ft.ab * 0x1ED2E223];
            String v13_2 = il.aq[ft.ab * v6 + 1];
            String v16 = il.aq[ft.ab * 0xC6727953 + v8];
            il.ad -= 0x2AC340FE;
            v14 = il.aj[il.ad * v9];
            int v15 = il.aj[il.ad * v9 + 1];
            int v17 = il.aj[il.ad * 0x259E107B + v8];
            ah v11_2 = client.al.aba(0x1884A179).bh(0x5E103575);
            if(v11_2 != null) {
                v0_4 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v0_4[v1 * 0x2FD939D2 - 1] = v11_2.bs(v12_1, v13_2, v14, v15, v16, v17, 210646817);
            }

            return 1;
        }

        if(v0 == 0xC64) {
            v0_4 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v0 = v0_4[v1 * 0xD85039D8];
            v1_6 = client.al.aba(0x28FDDA0E).bh(1807210729);
            if(v1_6 != null) {
                v1_6.be(v0, 0xED603B6D);
            }

            return 1;
        }

        if(v0 == 0x8FF373DF) {
            v0_4 = il.aj;
            v1 = il.ad - 0x2D14ED0;
            il.ad = v1;
            v0 = v0_4[v1 * 0x5E7C7369];
            v1_6 = client.al.aba(0x50564CF4).bh(0x6873D401);
            if(v1_6 != null) {
                v2_4 = il.aj;
                v4 = il.ad + 0x7346F1AB;
                il.ad = v4;
                v2_4[v4 * 0xB90493F7 - 1] = v1_6.br(v0, 0x9D6FC64F);
            }

            return 1;
        }

        if(0xC66 == v0) {
            v0_4 = il.aj;
            v1 = il.ad - 0xD17CF94;
            il.ad = v1;
            v0 = v0_4[v1 * 139550276];
            v1_6 = client.al.aba(0xD7D8AB81).bh(0x5C340B05);
            if(v1_6 != null) {
                v1_6.bl(v0, 97208008);
            }

            return 1;
        }

        if(v0 == 0xA0052BB0) {
            v0_7 = client.al.aba(0x45E068B7).bh(1967614609);
            if(v0_7 != null) {
                v1_4 = il.aj;
                v2 = il.ad + v10;
                il.ad = v2;
                v1_4[v2 * v9 - 1] = v0_7.ca(9);
                return 1;
            }

            throw new IllegalStateException();
        }

        if(v0 == -1322088064) {
            v0_7 = client.al.aba(-734649801).bh(0x706D912C);
            if(v0_7 != null) {
                v0_7.bi(0xFFFF);
                return 1;
            }

            throw new IllegalStateException();
        }

        return v8;
    }

    static int dm(int arg6, hl arg7, boolean arg8) {
        int[] v7_1;
        ar v6_1;
        int v1;
        int[] v6;
        int v7 = 0x64D7CF4D;
        int v8 = 1304812425;
        if(2700 == arg6) {
            v6 = il.aj;
            v1 = il.ad + 0x2FD514;
            il.ad = v1;
            v6_1 = bl.al(v6[v1 * -1228695640], v7);
            v7_1 = il.aj;
            v1 = il.ad - 0x5817EF78;
            il.ad = v1;
            v7_1[v1 * v8 - 1] = v6_1.fq * 0x857F658F;
            return 1;
        }

        int v3 = 0x4A90AB9;
        if(2701 == arg6) {
            v6 = il.aj;
            v1 = il.ad - 0x151830E5;
            il.ad = v1;
            v6_1 = bl.al(v6[v1 * v8], v7);
            if(v6_1.fq * -1441113208 != -1) {
                v7_1 = il.aj;
                v1 = il.ad + 0x37D82695;
                il.ad = v1;
                v7_1[v1 * v8 - 1] = v6_1.fp * 0x585B9887;
            }
            else {
                v6 = il.aj;
                v7 = il.ad + v3;
                il.ad = v7;
                v6[v7 * 0x50FEBF7D - 1] = 0;
            }

            return 1;
        }

        if(0x5311D06A == arg6) {
            v6 = il.aj;
            v7 = il.ad + 0x51120BB9;
            il.ad = v7;
            if(client.ky.ax(((long)v6[v7 * v8])) != null) {
                v6 = il.aj;
                v7 = il.ad + v3;
                il.ad = v7;
                v6[v7 * 0xE43FA128 - 1] = 1;
            }
            else {
                v6 = il.aj;
                v7 = il.ad - 0x13FBAFB3;
                il.ad = v7;
                v6[v7 * -1842271506 - 1] = 0;
            }

            return 1;
        }

        if(arg6 == 2706) {
            v6 = il.aj;
            v7 = il.ad + 0x4986FA78;
            il.ad = v7;
            v6[v7 * v8 - 1] = client.kt * 0xD233AC37;
            return 1;
        }

        return 2;
    }

    static int dn(int arg4, hl arg5, boolean arg6) {
        int v5 = 2;
        int v6 = 1304812425;
        if(arg4 == 0xE25911B9) {
            il.ad -= 0xCC6CE4E4;
            fe.bl(il.aj[il.ad * 0x75EC6A26], il.aj[il.ad * v6 + 1], il.aj[il.ad * 0x7546985 + v5], 0x12662F21);
            return 1;
        }

        if(arg4 == 0x27FE21CF) {
            int[] v4 = il.aj;
            v5 = il.ad - 0x4A90AB9;
            il.ad = v5;
            ck.br(v4[v5 * -785108024], -84);
            return 1;
        }

        if(1076680423 == arg4) {
            il.ad -= 0x9521572;
            dm.bi(il.aj[il.ad * 0x86873502], il.aj[il.ad * v6 + 1], 0xD51E40A6);
            return 1;
        }

        return v5;
    }

    static int do(int arg8, hl arg9, boolean arg10) {
        String[] v9_1;
        Object v8_2;
        boolean v5_1;
        int v3;
        int v2;
        int[] v1_1;
        int v1;
        int[] v8;
        int v9 = 0x4A90AB9;
        int v10 = 1304812425;
        if(arg8 == 0xF3F) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = client.rn[arg8].ar(-68207507);
            return 1;
        }

        v2 = 0xBAFCC783;
        if(arg8 == 0xF40) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v3 = il.ad + v9;
            il.ad = v3;
            v1_1[v3 * v10 - 1] = client.rn[arg8].al * v2;
            return 1;
        }

        v3 = 0xFF7F8B3F;
        if(arg8 == 0xF41) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = client.rn[arg8].ae * v3;
            return 1;
        }

        int v4 = 0x8D921141;
        if(0xF42 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = client.rn[arg8].ar * v4;
            return 1;
        }

        if(arg8 == 0xF43) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = client.rn[arg8].an * 0x9352F621;
            return 1;
        }

        if(0xF44 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = v8[v1 * v10];
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = client.rn[arg8].ap * 0xADF7FF8D;
            return 1;
        }

        int v5 = 0;
        if(arg8 == 0xF46) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = client.rn[v8[v1 * v10]].ae(1791085342);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(arg8 == 0) {
                v5 = 1;
            }

            v1_1[v2] = v5;
            return 1;
        }

        int v6 = 2;
        if(0xF47 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = client.rn[v8[v1 * v10]].ae(-1639620154);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(arg8 == v6) {
                v5 = 1;
            }

            v1_1[v2] = v5;
            return 1;
        }

        if(0xF48 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = client.rn[v8[v1 * v10]].ae(0x222E6A66);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(arg8 == 5) {
                v5 = 1;
            }

            v1_1[v2] = v5;
            return 1;
        }

        if(arg8 == 0xF49) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            arg8 = client.rn[v8[v1 * v10]].ae(-597537094);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(1 == arg8) {
                v5 = 1;
            }

            v1_1[v2] = v5;
            return 1;
        }

        if(0xF4A == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            if(v8[v1 * v10] == 1) {
                v5_1 = true;
            }

            if(js.rl != null) {
                js.rl.ax(nm.ar, ((boolean)v5), 0xDB622769);
            }

            return 1;
        }

        if(0xF4B == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            if(v8[v1 * v10] == 1) {
                v5_1 = true;
            }

            if(js.rl != null) {
                js.rl.ax(nm.ae, v5_1, 0x5A73FAB);
            }

            return 1;
        }

        if(arg8 == 0xF4C) {
            il.ad -= 0x9521572;
            boolean v8_1 = 1 == il.aj[il.ad * v10] ? true : false;
            if(1 == il.aj[il.ad * v10 + 1]) {
                v5_1 = true;
            }

            if(js.rl != null) {
                client.rh.ax = v5_1;
                js.rl.ax(client.rh, v8_1, 0xA5276050);
            }

            return 1;
        }

        if(0xF4D == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            if(v8[v1 * v10] == 1) {
                v5_1 = true;
            }

            if(js.rl != null) {
                js.rl.ax(nm.al, ((boolean)v5), 0xDF074860);
            }

            return 1;
        }

        if(0xF4E == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            if(v8[v1 * v10] == 1) {
                v5_1 = true;
            }

            if(js.rl != null) {
                js.rl.ax(nm.an, ((boolean)v5), 90760022);
            }

            return 1;
        }

        if(0xF4F == arg8) {
            v8 = il.aj;
            v1 = il.ad + v9;
            il.ad = v1;
            v1 = v1 * v10 - 1;
            if(js.rl == null) {
            }
            else {
                v5 = js.rl.ax.size();
            }

            v8[v1] = v5;
            return 1;
        }

        if(arg8 == 0xF50) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = ((nu)v8_2).ax * 460973165;
            return 1;
        }

        v5 = 0xBC5CDEAD;
        int v7 = 0x8FA23525;
        if(arg8 == 0xF51) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v9_1 = il.aq;
            v10 = ft.ab + v7;
            ft.ab = v10;
            v9_1[v10 * v5 - 1] = ((nu)v8_2).ax(0xFFFF00);
            return 1;
        }

        if(0xF52 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v9_1 = il.aq;
            v10 = ft.ab + v7;
            ft.ab = v10;
            v9_1[v10 * v5 - 1] = ((nu)v8_2).al(1133746401);
            return 1;
        }

        if(arg8 == 0xF53) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            long v9_2 = ji.ax(0x2076E2C1) - dh.rb * 0xE7908015C086ABDL - js.rl.ax.get(v8[v1 * v10]).al * 0x5CFAD116F2438147L;
            arg8 = ((int)(v9_2 / 3600000));
            v9_2 -= ((long)(3600000 * arg8));
            v1 = ((int)(v9_2 / 60000));
            v9 = ((int)((v9_2 - (((long)(60000 * v1)))) / 1000));
            String v8_3 = arg8 + ":" + v1 / 10 + v1 % 10 + ":" + v9 / 10 + v9 % 10;
            v9_1 = il.aq;
            v10 = ft.ab + v7;
            ft.ab = v10;
            v9_1[v10 * v5 - 1] = v8_3;
            return 1;
        }

        if(0xF54 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = ((nu)v8_2).ae.ar * v4;
            return 1;
        }

        if(0xF55 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v1_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = ((nu)v8_2).ae.ae * v3;
            return 1;
        }

        if(0xF56 == arg8) {
            v8 = il.aj;
            v1 = il.ad - v9;
            il.ad = v1;
            v8_2 = js.rl.ax.get(v8[v1 * v10]);
            v1_1 = il.aj;
            v3 = il.ad + v9;
            il.ad = v3;
            v1_1[v3 * v10 - 1] = ((nu)v8_2).ae.al * v2;
            return 1;
        }

        return v6;
    }

    static int dp(int arg3, hl arg4, boolean arg5) {
        int v4_1;
        String[] v3_1;
        int v5;
        int[] v3;
        ar v4 = arg5 ? il.aa : dw.av;
        if(arg3 == 1800) {
            v3 = il.aj;
            v5 = il.ad - 0xE038044;
            il.ad = v5;
            v3[v5 * 0x1BD2C897 - 1] = ct.ae(ib.il(v4, 0xD2862E80), 0x7F0F00B5);
            return 1;
        }

        int v1 = 0xBC5CDEAD;
        if(0x709 == arg3) {
            v3 = il.aj;
            v5 = il.ad + 1870063440;
            il.ad = v5;
            arg3 = v3[v5 * 1304812425] - 1;
            if(v4.dd == null || arg3 >= v4.dd.length || v4.dd[arg3] == null) {
                v3_1 = il.aq;
                v4_1 = ft.ab - 0x1106A6AC;
                ft.ab = v4_1;
                v3_1[v4_1 * v1 - 1] = "";
            }
            else {
                String[] v5_1 = il.aq;
                v1 = ft.ab - 0x4B02D4C5;
                ft.ab = v1;
                v5_1[v1 * 402448074 - 1] = v4.dd[arg3];
            }

            return 1;
        }

        if(0x24DE18EC == arg3) {
            if(v4.dt == null) {
                v3_1 = il.aq;
                v4_1 = ft.ab - 1995978090;
                ft.ab = v4_1;
                v3_1[v4_1 * v1 - 1] = "";
            }
            else {
                v3_1 = il.aq;
                v5 = ft.ab + 1777059210;
                ft.ab = v5;
                v3_1[v5 * v1 - 1] = v4.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dq(int arg8, hl arg9, boolean arg10) {
        int v4;
        int[] v9_1;
        int[] v8;
        int[] v0_1;
        int v3;
        int v2;
        int[] v1;
        int v0;
        int v9 = 1304812425;
        if(arg8 == 4000) {
            il.ad -= 0x6D91D14A;
            arg8 = il.aj[il.ad * 0x7645D3BA];
            v0 = il.aj[il.ad * 0xD0720D47 + 1];
            v1 = il.aj;
            v2 = il.ad - 2087364076;
            il.ad = v2;
            v1[v2 * v9 - 1] = arg8 + v0;
            return 1;
        }

        int v1_1 = 0x9521572;
        v2 = 0x4A90AB9;
        if(4001 == arg8) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * 329640250];
            v0 = il.aj[il.ad * v9 + 1];
            v1 = il.aj;
            v3 = il.ad + v2;
            il.ad = v3;
            v1[v3 * v9 - 1] = arg8 - v0;
            return 1;
        }

        if(0x96D9FCDF == arg8) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * 0x3A3EA077];
            v9 = il.aj[il.ad * v9 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad - 0x5A6FC4A0;
            il.ad = v1_1;
            v0_1[v1_1 * 0x5F80508F - 1] = v9 * arg8;
            return 1;
        }

        if(1108639012 == arg8) {
            il.ad -= 0x771E1971;
            arg8 = il.aj[il.ad * v9];
            v0 = il.aj[il.ad * v9 + 1];
            v1 = il.aj;
            v2 = il.ad - 0x7413FE61;
            il.ad = v2;
            v1[v2 * v9 - 1] = arg8 / v0;
            return 1;
        }

        if(0x6AC8D77E == arg8) {
            v8 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            arg8 = v8[v0 * v9];
            v9_1 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v9_1[v0 * 0x33BB0CD1 - 1] = ((int)(Math.random() * (((double)arg8))));
            return 1;
        }

        if(arg8 == 4005) {
            v8 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            arg8 = v8[v0 * v9];
            v9_1 = il.aj;
            v0 = il.ad + 0xADEBC13;
            il.ad = v0;
            v9_1[v0 * 0x337AACC2 - 1] = ((int)(Math.random() * (((double)(arg8 + 1)))));
            return 1;
        }

        v3 = 2;
        if(4006 == arg8) {
            il.ad -= 390935965;
            arg8 = il.aj[il.ad * 0x2FE23B02];
            v0 = il.aj[il.ad * v9 + 1];
            v1_1 = il.aj[il.ad * v9 + v3];
            v3 = il.aj[il.ad * 0xAB4B2AF9 + 3];
            v4 = il.aj[il.ad * 0x9584BD6E + 4];
            int[] v5 = il.aj;
            int v6 = il.ad + v2;
            il.ad = v6;
            v5[v6 * v9 - 1] = arg8 + (v4 - v1_1) * (v0 - arg8) / (v3 - v1_1);
            return 1;
        }

        if(arg8 == 4007) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * v9];
            v9 = il.aj[il.ad * v9 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad + 0x295B020C;
            il.ad = v1_1;
            v0_1[v1_1 * 0x7D4F6AC0 - 1] = v9 * arg8 / 100 + arg8;
            return 1;
        }

        if(arg8 == 4008) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * v9];
            v9 = il.aj[il.ad * -1185930520 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad + v2;
            il.ad = v1_1;
            v0_1[v1_1 * 750292324 - 1] = arg8 | 1 << v9;
            return 1;
        }

        if(arg8 == 4009) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * v9];
            v9 = il.aj[il.ad * v9 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad + v2;
            il.ad = v1_1;
            v0_1[v1_1 * 0xD9067723 - 1] = arg8 & -1 - (1 << v9);
            return 1;
        }

        v4 = 0;
        if(4010 == arg8) {
            il.ad -= 0x76FAFA33;
            arg8 = il.aj[il.ad * v9];
            v0 = il.aj[il.ad * 1770954308 + 1];
            v1 = il.aj;
            v2 = il.ad - 0x73D96A47;
            il.ad = v2;
            v2 = v2 * v9 - 1;
            if((arg8 & 1 << v0) != 0) {
                v4 = 1;
            }

            v1[v2] = v4;
            return 1;
        }

        if(0xFAB == arg8) {
            il.ad -= 0xAA6A4F5C;
            arg8 = il.aj[il.ad * 0x14E528F1];
            v0 = il.aj[il.ad * v9 + 1];
            v1 = il.aj;
            v2 = il.ad + 0x38C78AFE;
            il.ad = v2;
            v1[v2 * v9 - 1] = arg8 % v0;
            return 1;
        }

        if(0x3AB592E3 == arg8) {
            il.ad -= 0x5FC85305;
            arg8 = il.aj[il.ad * 0x771484C6];
            v0 = il.aj[il.ad * v9 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v9 = il.ad + 0x77E0FC76;
                il.ad = v9;
                v8[v9 * 0xE268E416 - 1] = 0;
            }
            else {
                v1 = il.aj;
                v3 = il.ad + v2;
                il.ad = v3;
                v1[v3 * v9 - 1] = ((int)Math.pow(((double)arg8), ((double)v0)));
            }

            return 1;
        }

        if(0xFAD == arg8) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * v9];
            v0 = il.aj[il.ad * v9 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v8[v0 * v9 - 1] = 0;
                return 1;
            }

            switch(v0) {
                case 0: {
                    v8 = il.aj;
                    v0 = il.ad + v2;
                    il.ad = v0;
                    v8[v0 * v9 - 1] = 0x7FFFFFFF;
                    break;
                }
                case 1: {
                    v9_1 = il.aj;
                    v0 = il.ad - 1420334178;
                    il.ad = v0;
                    v9_1[v0 * 1986840513 - 1] = arg8;
                    break;
                }
                case 2: {
                    v9_1 = il.aj;
                    v0 = il.ad + 190342509;
                    il.ad = v0;
                    v9_1[v0 * 0x2E12CF83 - 1] = ((int)Math.sqrt(((double)arg8)));
                    break;
                }
                case 3: {
                    v0_1 = il.aj;
                    v1_1 = il.ad + 1434093762;
                    il.ad = v1_1;
                    v0_1[v1_1 * v9 - 1] = ((int)Math.cbrt(((double)arg8)));
                    break;
                }
                case 4: {
                    v0_1 = il.aj;
                    v1_1 = il.ad + v2;
                    il.ad = v1_1;
                    v0_1[v1_1 * v9 - 1] = ((int)Math.sqrt(Math.sqrt(((double)arg8))));
                    break;
                }
                default: {
                    v9_1 = il.aj;
                    v1_1 = il.ad + 0x7D03B8B0;
                    il.ad = v1_1;
                    v9_1[v1_1 * 1132580409 - 1] = ((int)Math.pow(((double)arg8), 1 / (((double)v0))));
                    break;
                }
            }

            return 1;
        }

        if(arg8 == 0x8D4788D2) {
            il.ad -= 0x29F61FD7;
            arg8 = il.aj[il.ad * 0xAAD0CB54];
            v9 = il.aj[il.ad * 0x5EA1E4C5 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad - 0x3A4CBFA9;
            il.ad = v1_1;
            v0_1[v1_1 * 0xBCF0438E - 1] = arg8 & v9;
            return 1;
        }

        if(0xFAF == arg8) {
            il.ad -= v1_1;
            arg8 = il.aj[il.ad * 0xB08C75E6];
            v9 = il.aj[il.ad * v9 + 1];
            v0_1 = il.aj;
            v1_1 = il.ad + v2;
            il.ad = v1_1;
            v0_1[v1_1 * 0x1D4E3EDE - 1] = arg8 | v9;
            return 1;
        }

        if(-449985606 == arg8) {
            il.ad -= -2005443607;
            long v8_1 = ((long)il.aj[il.ad * v9]);
            long v0_2 = ((long)il.aj[il.ad * -1104046846 + 1]);
            long v2_1 = ((long)il.aj[il.ad * 0xF510149F + v3]);
            int[] v4_1 = il.aj;
            int v5_1 = il.ad - 614150788;
            il.ad = v5_1;
            v4_1[v5_1 * -1505579363 - 1] = ((int)(v8_1 * v2_1 / v0_2));
            return 1;
        }

        return v3;
    }

    static int dr(int arg4, hl arg5, boolean arg6) {
        int v5 = 2;
        int v0 = 1304812425;
        if(arg4 == 3200) {
            il.ad -= 0xDFB202B;
            fe.bl(il.aj[il.ad * v0], il.aj[il.ad * v0 + 1], il.aj[il.ad * v0 + v5], 0x9929C7D5);
            return 1;
        }

        if(arg4 == 3201) {
            int[] v4 = il.aj;
            v5 = il.ad - 0x4A90AB9;
            il.ad = v5;
            ck.br(v4[v5 * v0], -39);
            return 1;
        }

        if(3202 == arg4) {
            il.ad -= 0x9521572;
            dm.bi(il.aj[il.ad * v0], il.aj[il.ad * v0 + 1], 0xC55A090A);
            return 1;
        }

        return v5;
    }

    static int ds(int arg5, hl arg6, boolean arg7) {
        int v6_2;
        String[] v5_1;
        int[] v5;
        int[] v6 = il.aj;
        int v0 = 0x4A90AB9;
        int v7 = il.ad - v0;
        il.ad = v7;
        int v1 = 1304812425;
        ar v6_1 = bl.al(v6[v7 * v1], 0x64D7CF4D);
        if(arg5 == 0xAF0) {
            v5 = il.aj;
            v7 = il.ad + v0;
            il.ad = v7;
            v5[v7 * v1 - 1] = ct.ae(ib.il(v6_1, 0x90512D05), 0x7F0F00B5);
            return 1;
        }

        int v3 = 0xBC5CDEAD;
        int v4 = 0x8FA23525;
        if(arg5 == 0xAF1) {
            v5 = il.aj;
            v7 = il.ad - v0;
            il.ad = v7;
            arg5 = v5[v7 * v1] - 1;
            if(v6_1.dd == null || arg5 >= v6_1.dd.length || v6_1.dd[arg5] == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                String[] v7_1 = il.aq;
                v0 = ft.ab + v4;
                ft.ab = v0;
                v7_1[v0 * v3 - 1] = v6_1.dd[arg5];
            }

            return 1;
        }

        if(arg5 == 0xAF2) {
            if(v6_1.dt == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                v5_1 = il.aq;
                v7 = ft.ab + v4;
                ft.ab = v7;
                v5_1[v7 * v3 - 1] = v6_1.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dt(int arg8, hl arg9, boolean arg10) {
        int[] v9_1;
        int[] v8;
        int v2;
        int[] v1_1;
        int v1;
        int[] v10_1;
        int v9 = 0x9521572;
        int v10 = 1304812425;
        if(arg8 == 0xB926BF9E) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * 1905017078];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1 = il.ad - 0x4FAA1A62;
            il.ad = v1;
            v10_1[v1 * -1310002449 - 1] = arg8 + v9;
            return 1;
        }

        if(4001 == arg8) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * 0xD1A0F5D2];
            v9 = il.aj[il.ad * 1990096304 + 1];
            v1_1 = il.aj;
            v2 = il.ad - 0x5D7F95BD;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = arg8 - v9;
            return 1;
        }

        if(4002 == arg8) {
            il.ad -= 0x423C77F9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1 = il.ad - 1985114910;
            il.ad = v1;
            v10_1[v1 * 0xDCBB9F7E - 1] = v9 * arg8;
            return 1;
        }

        v2 = 0x4A90AB9;
        if(0x5FDB0362 == arg8) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * -30596452 + 1];
            v10_1 = il.aj;
            v1 = il.ad + v2;
            il.ad = v1;
            v10_1[v1 * 0x54EEB18C - 1] = arg8 / v9;
            return 1;
        }

        if(0x38AAEBFC == arg8) {
            v8 = il.aj;
            v9 = il.ad + 0x6F77C083;
            il.ad = v9;
            arg8 = v8[v9 * 0xA3637669];
            v9_1 = il.aj;
            v10 = il.ad - 0x893B2B;
            il.ad = v10;
            v9_1[v10 * 0x331A547F - 1] = ((int)(Math.random() * (((double)arg8))));
            return 1;
        }

        if(arg8 == 0x4560CC89) {
            v8 = il.aj;
            v9 = il.ad + 0x50F6E486;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            v9_1 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9_1[v10 * -851489700 - 1] = ((int)(Math.random() * (((double)(arg8 + 1)))));
            return 1;
        }

        int v3 = 2;
        if(4006 == arg8) {
            il.ad -= -2013648708;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v1 = il.aj[il.ad * -1087034590 + v3];
            v2 = il.aj[il.ad * 0x1F44D0BB + 3];
            v3 = il.aj[il.ad * v10 + 4];
            int[] v4 = il.aj;
            int v5 = il.ad + 0x1BD49969;
            il.ad = v5;
            v4[v5 * v10 - 1] = arg8 + (v3 - v1) * (v9 - arg8) / (v2 - v1);
            return 1;
        }

        if(arg8 == 4007) {
            il.ad -= 0x146C9640;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v1_1 = il.aj;
            v3 = il.ad + v2;
            il.ad = v3;
            v1_1[v3 * v10 - 1] = v9 * arg8 / 0x9FBBEAED + arg8;
            return 1;
        }

        if(arg8 == 0xEFDCB9D9) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1 = il.ad + v2;
            il.ad = v1;
            v10_1[v1 * 440898660 - 1] = arg8 | 1 << v9;
            return 1;
        }

        if(arg8 == 975031092) {
            il.ad -= 0x550874EF;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v1_1 = il.aj;
            v2 = il.ad + 448610634;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = arg8 & -1 - (1 << v9);
            return 1;
        }

        int v4_1 = 0;
        if(-1770499103 == arg8) {
            il.ad -= 0x6B121594;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v1_1 = il.aj;
            v2 = il.ad - 0x59B1F0DB;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if((arg8 & 1 << v9) != 0) {
                v4_1 = 1;
            }

            v1_1[v2] = v4_1;
            return 1;
        }

        if(0xFAB == arg8) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * 0x8CD04EA5 + 1];
            v10_1 = il.aj;
            v1 = il.ad - 0x5AE595E4;
            il.ad = v1;
            v10_1[v1 * 0x8E1FE6A3 - 1] = arg8 % v9;
            return 1;
        }

        if(0xFAC == arg8) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v9 = il.ad - 1059750812;
                il.ad = v9;
                v8[v9 * 0x58BBB630 - 1] = 0;
            }
            else {
                v10_1 = il.aj;
                v1 = il.ad + v2;
                il.ad = v1;
                v10_1[v1 * 0x5411CF8B - 1] = ((int)Math.pow(((double)arg8), ((double)v9)));
            }

            return 1;
        }

        if(0xB1DFB94 == arg8) {
            il.ad -= 0xC091E1DA;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            if(arg8 == 0) {
                v8 = il.aj;
                v9 = il.ad + 0x24DDA5EF;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
                return 1;
            }

            switch(v9) {
                case 0: {
                    v8 = il.aj;
                    v9 = il.ad - 1663880581;
                    il.ad = v9;
                    v8[v9 * 0x35D51099 - 1] = 0x7FFFFFFF;
                    break;
                }
                case 1: {
                    v9_1 = il.aj;
                    v1 = il.ad + 0x6C280A96;
                    il.ad = v1;
                    v9_1[v1 * v10 - 1] = arg8;
                    break;
                }
                case 2: {
                    v9_1 = il.aj;
                    v1 = il.ad + 0x532B46DA;
                    il.ad = v1;
                    v9_1[v1 * v10 - 1] = ((int)Math.sqrt(((double)arg8)));
                    break;
                }
                case 3: {
                    v9_1 = il.aj;
                    v1 = il.ad + 0x215A0891;
                    il.ad = v1;
                    v9_1[v1 * v10 - 1] = ((int)Math.cbrt(((double)arg8)));
                    break;
                }
                case 4: {
                    v9_1 = il.aj;
                    v10 = il.ad + v2;
                    il.ad = v10;
                    v9_1[v10 * 0xCD97FA56 - 1] = ((int)Math.sqrt(Math.sqrt(((double)arg8))));
                    break;
                }
                default: {
                    v10_1 = il.aj;
                    v1 = il.ad + 0x6611AA66;
                    il.ad = v1;
                    v10_1[v1 * 0xB8CE0036 - 1] = ((int)Math.pow(((double)arg8), 1 / (((double)v9))));
                    break;
                }
            }

            return 1;
        }

        if(arg8 == 0xFAE) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v1_1 = il.aj;
            v2 = il.ad - 0x77F99310;
            il.ad = v2;
            v1_1[v2 * v10 - 1] = arg8 & v9;
            return 1;
        }

        if(0xFAF == arg8) {
            il.ad -= v9;
            arg8 = il.aj[il.ad * v10];
            v9 = il.aj[il.ad * v10 + 1];
            v10_1 = il.aj;
            v1 = il.ad + 0x19DAADC6;
            il.ad = v1;
            v10_1[v1 * -1950652209 - 1] = arg8 | v9;
            return 1;
        }

        if(0xE669252F == arg8) {
            il.ad -= 0xDFB202B;
            long v8_1 = ((long)il.aj[il.ad * 0x5DC8980E]);
            long v4_2 = ((long)il.aj[il.ad * 0xCA7D71D + 1]);
            long v6 = ((long)il.aj[il.ad * v10 + v3]);
            v10_1 = il.aj;
            v1 = il.ad + v2;
            il.ad = v1;
            v10_1[v1 * 0xD25CAAFF - 1] = ((int)(v8_1 * v6 / v4_2));
            return 1;
        }

        return v3;
    }

    static int du(int arg3, hl arg4, boolean arg5) {
        int[] v3;
        int[] v4 = il.aj;
        int v5 = il.ad + 1552890039;
        il.ad = v5;
        int v0 = 1304812425;
        ar v4_1 = bl.al(v4[v5 * v0], 0x64D7CF4D);
        int v1 = 0x4A90AB9;
        if(2600 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.bz * 0x590D50;
            return 1;
        }

        if(91809816 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.bh * 1702633809;
            return 1;
        }

        if(arg3 == -1739732290) {
            String[] v3_1 = il.aq;
            v5 = ft.ab - 0x705DCADB;
            ft.ab = v5;
            v3_1[v5 * 0xEA48D213 - 1] = v4_1.dp;
            return 1;
        }

        if(arg3 == 0x6F9CAAF0) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.bb * 0x83EA0C19;
            return 1;
        }

        if(2604 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * 0x8C8FBAC9 - 1] = v4_1.bc * 1153505113;
            return 1;
        }

        if(2605 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x6E11FF7C;
            il.ad = v5;
            v3[v5 * 325098780 - 1] = v4_1.ct * 0x321E9B5F;
            return 1;
        }

        if(arg3 == -1550825340) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * -407922270 - 1] = v4_1.cl * 8000905;
            return 1;
        }

        if(arg3 == 0xA2F) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.cm * 0xE927C803;
            return 1;
        }

        if(0xA7ED28C3 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 210136614;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.ck * 0x336B0E83;
            return 1;
        }

        if(0x9011BA7A == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x24069C1B;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.bl * 0xBB0925D;
            return 1;
        }

        if(arg3 == 0x5C4A61B1) {
            v3 = il.aj;
            v5 = il.ad + 60428781;
            il.ad = v5;
            v3[v5 * 0xAF750670 - 1] = v4_1.br * 0x4F66F883;
            return 1;
        }

        if(1267219065 == arg3) {
            v3 = il.aj;
            v5 = il.ad + 0x2EE61C59;
            il.ad = v5;
            v3[v5 * v0 - 1] = v4_1.bk * -982040549;
            return 1;
        }

        if(0x479CA804 == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x205BA4A8;
            il.ad = v5;
            v3[v5 * 0x7EC453E2 - 1] = v4_1.bm * 0xDBD4A4F0;
            return 1;
        }

        if(0xCCD502AF == arg3) {
            v3 = il.aj;
            v5 = il.ad - 0x1724A5E1;
            il.ad = v5;
            v3[v5 * 0x3FDEAC77 - 1] = v4_1.be.ax(0x4C97E0C5);
            return 1;
        }

        if(1187705202 == arg3) {
            v3 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v5 = v5 * 0x4F7A621D - 1;
            int v4_2 = v4_1.cg ? 1 : 0;
            v3[v5] = v4_2;
            return 1;
        }

        return 2;
    }

    static int dv(int arg5, hl arg6, boolean arg7) {
        int v6_1;
        String[] v5_1;
        int v7;
        int[] v5;
        ar v6 = arg7 ? il.aa : dw.av;
        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(arg5 == 1800) {
            v5 = il.aj;
            v7 = il.ad + v1;
            il.ad = v7;
            v5[v7 * v0 - 1] = ct.ae(ib.il(v6, 0xB4C66D80), 0x7F0F00B5);
            return 1;
        }

        int v3 = 0xBC5CDEAD;
        int v4 = 0x8FA23525;
        if(0x709 == arg5) {
            v5 = il.aj;
            v7 = il.ad - v1;
            il.ad = v7;
            arg5 = v5[v7 * v0] - 1;
            if(v6.dd == null || arg5 >= v6.dd.length || v6.dd[arg5] == null) {
                v5_1 = il.aq;
                v6_1 = ft.ab + v4;
                ft.ab = v6_1;
                v5_1[v6_1 * v3 - 1] = "";
            }
            else {
                String[] v7_1 = il.aq;
                v0 = ft.ab + v4;
                ft.ab = v0;
                v7_1[v0 * v3 - 1] = v6.dd[arg5];
            }

            return 1;
        }

        if(0x70A == arg5) {
            if(v6.dt == null) {
                v5_1 = il.aq;
                v6_1 = ft.ab + v4;
                ft.ab = v6_1;
                v5_1[v6_1 * v3 - 1] = "";
            }
            else {
                v5_1 = il.aq;
                v7 = ft.ab + v4;
                ft.ab = v7;
                v5_1[v7 * v3 - 1] = v6.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dw(int arg1, hl arg2, boolean arg3) {
        ar v2_1;
        if(arg1 >= 2000) {
            arg1 += -1000;
            int[] v2 = il.aj;
            int v3 = il.ad - 0x4A90AB9;
            il.ad = v3;
            v2_1 = bl.al(v2[v3 * 1304812425], 0x64D7CF4D);
        }
        else if(arg3) {
            v2_1 = il.aa;
        }
        else {
            v2_1 = dw.av;
        }

        if(arg1 == 0x787) {
            if(il.at * 0x103467B < 10) {
                if(v2_1.fk == null) {
                    return 0;
                }

                iw v1 = new iw();
                v1.ae = v2_1;
                v1.ax = v2_1.fk;
                v1.af = il.at * 0x55AFF75F + 0x5314F6D;
                client.nc.al(((mx)v1));
                return 1;
            }

            throw new RuntimeException();
        }

        return 2;
    }

    static int dx(int arg5, hl arg6, boolean arg7) {
        int v4;
        int[] v1_1;
        int v3;
        int[] v2_1;
        int v1;
        int[] v5;
        int v6 = 0x4A90AB9;
        int v7 = 1304812425;
        if(3300 == arg5) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.bj * -2077001153;
            return 1;
        }

        int v2 = 0x9521572;
        if(arg5 == 3301) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7];
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = bj.ax(arg5, v1, -49);
            return 1;
        }

        if(arg5 == 3302) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7];
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = jm.al(arg5, v1, -13);
            return 1;
        }

        if(3303 == arg5) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7];
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = hp.ae(arg5, v1, 0x836EF64E);
            return 1;
        }

        if(arg5 == 3304) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = cu.al(arg5, 1162643250).ae * 1032100177;
            return 1;
        }

        if(arg5 == 3305) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = client.km[arg5];
            return 1;
        }

        if(3306 == arg5) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = client.ko[arg5];
            return 1;
        }

        if(3307 == arg5) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = client.ki[arg5];
            return 1;
        }

        if(arg5 == 3308) {
            arg5 = kt.jz * 1101813865;
            v2 = ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7);
            v1 = nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7);
            int[] v3_1 = il.aj;
            v4 = il.ad + v6;
            il.ad = v4;
            v3_1[v4 * v7 - 1] = (v2 << 14) + (arg5 << 28) + v1;
            return 1;
        }

        if(3309 == arg5) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = arg5 >> 14 & 0x3FFF;
            return 1;
        }

        if(3310 == arg5) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = arg5 >> 28;
            return 1;
        }

        if(arg5 == 0xCEF) {
            v5 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            arg5 = v5[v1 * v7];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = arg5 & 0x3FFF;
            return 1;
        }

        v3 = 0;
        if(arg5 == 0xCF0) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v1 = v1 * v7 - 1;
            if(client.aq) {
                v3 = 1;
            }

            v5[v1] = v3;
            return 1;
        }

        v4 = 0x8000;
        if(0xCF1 == arg5) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7] + v4;
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = bj.ax(arg5, v1, -58);
            return 1;
        }

        if(arg5 == 0xCF2) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7] + v4;
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = jm.al(arg5, v1, 71);
            return 1;
        }

        if(0xCF3 == arg5) {
            il.ad -= v2;
            arg5 = il.aj[il.ad * v7] + v4;
            v1 = il.aj[il.ad * v7 + 1];
            v2_1 = il.aj;
            v3 = il.ad + v6;
            il.ad = v3;
            v2_1[v3 * v7 - 1] = hp.ae(arg5, v1, 0xE0049051);
            return 1;
        }

        v2 = 2;
        if(arg5 == 0xCF4) {
            v1 = 0x12DC6E19;
            if(client.lf * v1 >= v2) {
                v5 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v5[v2 * v7 - 1] = client.lf * v1;
            }
            else {
                v5 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5[v1 * v7 - 1] = 0;
            }

            return 1;
        }

        if(0xCF5 == arg5) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.cd * 0xD205F9E9;
            return 1;
        }

        if(0xCF6 == arg5) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.ae * 0x8076F529;
            return 1;
        }

        if(arg5 == 0xCF9) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.lh * 0x6FFC6629;
            return 1;
        }

        if(0xCFA == arg5) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.ly * 0xB3C744AB;
            return 1;
        }

        if(0xCFB == arg5) {
            if(client.lk) {
                v5 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5[v1 * v7 - 1] = 1;
            }
            else {
                v5 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5[v1 * v7 - 1] = 0;
            }

            return 1;
        }

        if(arg5 == 0xCFC) {
            v5 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5[v1 * v7 - 1] = client.ar * 0x407F0DE1;
            return 1;
        }

        if(0xCFD == arg5) {
            il.ad -= 0x12A42AE4;
            arg5 = il.aj[il.ad * v7] + (il.aj[il.ad * v7 + 1] << 14) + (il.aj[il.ad * v7 + v2] << 28) + il.aj[il.ad * v7 + 3];
            v1_1 = il.aj;
            v2 = il.ad + v6;
            il.ad = v2;
            v1_1[v2 * v7 - 1] = arg5;
            return 1;
        }

        return v2;
    }

    static int dy(int arg5, hl arg6, boolean arg7) {
        int v6_2;
        String[] v5_1;
        int[] v5;
        int[] v6 = il.aj;
        int v0 = 0x4A90AB9;
        int v7 = il.ad - v0;
        il.ad = v7;
        int v1 = 1304812425;
        ar v6_1 = bl.al(v6[v7 * v1], 0x64D7CF4D);
        if(arg5 == 0xAF0) {
            v5 = il.aj;
            v7 = il.ad + v0;
            il.ad = v7;
            v5[v7 * v1 - 1] = ct.ae(ib.il(v6_1, 0xA4F4D2F1), 0x7F0F00B5);
            return 1;
        }

        int v3 = 0xBC5CDEAD;
        int v4 = 0x8FA23525;
        if(arg5 == 0xAF1) {
            v5 = il.aj;
            v7 = il.ad - v0;
            il.ad = v7;
            arg5 = v5[v7 * v1] - 1;
            if(v6_1.dd == null || arg5 >= v6_1.dd.length || v6_1.dd[arg5] == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                String[] v7_1 = il.aq;
                v0 = ft.ab + v4;
                ft.ab = v0;
                v7_1[v0 * v3 - 1] = v6_1.dd[arg5];
            }

            return 1;
        }

        if(arg5 == 0xAF2) {
            if(v6_1.dt == null) {
                v5_1 = il.aq;
                v6_2 = ft.ab + v4;
                ft.ab = v6_2;
                v5_1[v6_2 * v3 - 1] = "";
            }
            else {
                v5_1 = il.aq;
                v7 = ft.ab + v4;
                ft.ab = v7;
                v5_1[v7 * v3 - 1] = v6_1.dt;
            }

            return 1;
        }

        return 2;
    }

    static int dz(int arg8, hl arg9, boolean arg10) {
        boolean v6_2;
        String v8_3;
        int[] v9_2;
        String[] v9_1;
        eg v8_1;
        String[] v8_2;
        int[] v8;
        int v2;
        int v9 = -1;
        int v10 = 1304812425;
        int v0 = 0x4A90AB9;
        if(3600 == arg8) {
            v2 = 0x6BF9605B;
            if(ds.rq.aj * v2 == 0) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = -2;
            }
            else if(ds.rq.aj * v2 == 1) {
                v8 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v8[v2 * v10 - 1] = v9;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = ds.rq.an.al(0xDE45CA);
            }

            return 1;
        }

        int v3 = 0x5B772B0B;
        int v4 = 0xBC5CDEAD;
        int v5 = 0x8FA23525;
        if(3601 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(!ds.rq.ax(-1503700252) || arg8 < 0 || arg8 >= ds.rq.an.al(-2040339619)) {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }
            else {
                v8_1 = ds.rq.an.ai(arg8, -2016701677);
                v9_1 = il.aq;
                v10 = ft.ab + v5;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ed)v8_1).aq(v3);
                v9_1 = il.aq;
                v10 = ft.ab + v5;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ed)v8_1).ab(0xA480BFA5);
            }

            return 1;
        }

        int v6 = 0;
        if(arg8 == 3602) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(!ds.rq.ax(0x8D587214) || arg8 < 0 || arg8 >= ds.rq.an.al(0xEEDB6249)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v9_2[v2 * v10 - 1] = ds.rq.an.ai(arg8, 0x81B90C6F).an * 0x297B4181;
            }

            return 1;
        }

        int v7 = 1257071827;
        if(3603 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(!ds.rq.ax(0x99ABE7D1) || arg8 < 0 || arg8 >= ds.rq.an.al(0x9CCE70BD)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v9_2[v2 * v10 - 1] = ds.rq.an.ai(arg8, -2037800279).aj * v7;
            }

            return 1;
        }

        if(3604 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            v8_3 = v8_2[v9 * v4];
            v9_2 = il.aj;
            v2 = il.ad - v0;
            il.ad = v2;
            hu.ak(v8_3, v9_2[v2 * v10], 1310468048);
            return 1;
        }

        if(arg8 == 3605) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            ds.rq.ad(v8_2[v9 * v4], 35);
            return 1;
        }

        if(arg8 == 3606) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            ds.rq.ao(v8_2[v9 * v4], -1570117941);
            return 1;
        }

        if(3607 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            ds.rq.am(v8_2[v9 * v4], 0);
            return 1;
        }

        if(arg8 == 3608) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            ds.rq.as(v8_2[v9 * v4], -1880437085);
            return 1;
        }

        if(3609 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            v8_3 = iz.if(v8_2[v9 * v4], 72);
            v9_2 = il.aj;
            v2 = il.ad + v0;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(ds.rq.ap(new ew(v8_3, ac.ad), false, -103)) {
                v6 = 1;
            }

            v9_2[v2] = v6;
            return 1;
        }

        if(0xE1B == arg8) {
            if(ai.oq != null) {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = ai.oq.ab;
            }
            else {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }

            return 1;
        }

        if(0xE1C == arg8) {
            if(ai.oq != null) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = ai.oq.al(0x38CA2A41);
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }

            return 1;
        }

        if(0xE1D == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(0x1F4BE1E3)) {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }
            else {
                v9_1 = il.aq;
                v10 = ft.ab + v5;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ai.oq.ai(arg8, -1957470709).ap(0).ax(0x464307E4);
            }

            return 1;
        }

        if(0xE1E == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(0x6EE7F51B)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v9_2[v2 * v10 - 1] = ai.oq.ai(arg8, -2120617081).bc(0x8DD1F2C0);
            }

            return 1;
        }

        if(0xE1F == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(0x248C3888)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v9_2[v2 * v10 - 1] = ai.oq.ai(arg8, -2001417385).aj * v7;
            }

            return 1;
        }

        if(0xE20 == arg8) {
            v8 = il.aj;
            v9 = il.ad + v0;
            il.ad = v9;
            v9 = v9 * v10 - 1;
            if(ai.oq != null) {
                byte v6_1 = ai.oq.ai;
            }

            v8[v9] = v6;
            return 1;
        }

        if(arg8 == 0xE21) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            if.hp(v8_2[v9 * v4], 2096031450);
            return 1;
        }

        if(arg8 == 0xE22) {
            v8 = il.aj;
            v9 = il.ad + v0;
            il.ad = v9;
            v9 = v9 * v10 - 1;
            if(ai.oq != null) {
                v6 = ai.oq.av * 0x4C6ABBEF;
            }

            v8[v9] = v6;
            return 1;
        }

        if(0xE23 == arg8) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            gs.ha(v8_2[v9 * v4], 0x37E0D836);
            return 1;
        }

        if(arg8 == 3620) {
            cy.hv(0x1FAFD063);
            return 1;
        }

        if(0xE25 == arg8) {
            if(!ds.rq.ax(0xB5A787BE)) {
                v8 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v8[v2 * v10 - 1] = v9;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = ds.rq.ap.al(-902970217);
            }

            return 1;
        }

        if(arg8 == 0xE26) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(!ds.rq.ax(0xC19EC8FE) || arg8 < 0 || arg8 >= ds.rq.ap.al(0xF0C0A546)) {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }
            else {
                v8_1 = ds.rq.ap.ai(arg8, 0x89FD7F3E);
                v9_1 = il.aq;
                v10 = ft.ab + v5;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ev)v8_1).aq(v3);
                v9_1 = il.aq;
                v10 = ft.ab + v5;
                ft.ab = v10;
                v9_1[v10 * v4 - 1] = ((ev)v8_1).ab(0xDABF92E2);
            }

            return 1;
        }

        if(arg8 == 0xE27) {
            v8_2 = il.aq;
            v9 = ft.ab - v5;
            ft.ab = v9;
            v8_3 = iz.if(v8_2[v9 * v4], 3);
            v9_2 = il.aj;
            v2 = il.ad + v0;
            il.ad = v2;
            v2 = v2 * v10 - 1;
            if(ds.rq.aj(new ew(v8_3, ac.ad), 13501)) {
                v6 = 1;
            }

            v9_2[v2] = v6;
            return 1;
        }

        if(arg8 == 0xE28) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(635204888) || !ai.oq.ai(arg8, 0x8A954701).ap(0).equals(gu.jg.ax)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 1;
            }

            return 1;
        }

        if(0xE29 == arg8) {
            if(ai.oq == null || ai.oq.af == null) {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = "";
            }
            else {
                v8_2 = il.aq;
                v9 = ft.ab + v5;
                ft.ab = v9;
                v8_2[v9 * v4 - 1] = ai.oq.af;
            }

            return 1;
        }

        if(0xE2A == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(0x27FD7860) || !ai.oq.ai(arg8, -2101037636).ae(0x8690B487)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 1;
            }

            return 1;
        }

        if(arg8 == 0xE2B) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            arg8 = v8[v9 * v10];
            if(ai.oq == null || arg8 >= ai.oq.al(0x1579A2F9) || !ai.oq.ai(arg8, 0x8222049F).bn(0xC5E50475)) {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 0;
            }
            else {
                v8 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8[v9 * v10 - 1] = 1;
            }

            return 1;
        }

        v2 = 0x5AB34763;
        if(0xE2C == arg8) {
            ds.rq.an.aw(v2);
            return 1;
        }

        if(0xE2D == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jj(((boolean)v6)), 0x8DDCFD4B);
            return 1;
        }

        if(arg8 == 3630) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jm(((boolean)v6)), 0x830E5706);
            return 1;
        }

        if(0xE2F == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jv(((boolean)v6)), 0x8DDF6228);
            return 1;
        }

        if(0xE30 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jl(((boolean)v6)), 0x8C4B62FB);
            return 1;
        }

        if(0xE31 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kq(((boolean)v6)), 0x8C3140CB);
            return 1;
        }

        if(0xE32 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new jy(((boolean)v6)), 0x829FD7C1);
            return 1;
        }

        if(arg8 == 0xE33) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new js(((boolean)v6)), -1903991394);
            return 1;
        }

        if(arg8 == 0xE34) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kg(((boolean)v6)), -1976805650);
            return 1;
        }

        if(0xE35 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new kw(((boolean)v6)), -2034702893);
            return 1;
        }

        if(0xE36 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new ka(((boolean)v6)), 0x8EAFC7D0);
            return 1;
        }

        if(arg8 == 0xE37) {
            ds.rq.an.av(-2060102345);
            return 1;
        }

        if(3640 == arg8) {
            ds.rq.ap.aw(v2);
            return 1;
        }

        if(arg8 == 0xE39) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.ap.ao(new jj(((boolean)v6)), 0x833086AA);
            return 1;
        }

        if(arg8 == 0xE3A) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.ap.ao(new jm(((boolean)v6)), 0x8D185CE9);
            return 1;
        }

        if(arg8 == 0xE3B) {
            ds.rq.ap.av(-1930782797);
            return 1;
        }

        if(arg8 == 0xE3C) {
            if(ai.oq != null) {
                ai.oq.aw(v2);
            }

            return 1;
        }

        if(0xE3D == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jj(((boolean)v6)), 0x84E8F083);
            }

            return 1;
        }

        if(0xE3E == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jm(((boolean)v6)), -2093571088);
            }

            return 1;
        }

        if(0xE3F == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jv(((boolean)v6)), 0x8EA4700C);
            }

            return 1;
        }

        if(arg8 == 0xE40) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jl(((boolean)v6)), 0x8B7EE08D);
            }

            return 1;
        }

        if(0xE41 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kq(((boolean)v6)), -2047054780);
            }

            return 1;
        }

        if(arg8 == 3650) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new jy(((boolean)v6)), 0x904EDA5D);
            }

            return 1;
        }

        if(arg8 == 0xE43) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new js(((boolean)v6)), -1960533031);
            }

            return 1;
        }

        if(arg8 == 0xE44) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kg(((boolean)v6)), 0x8E92E6F0);
            }

            return 1;
        }

        if(0xE45 == arg8) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new kw(((boolean)v6)), -2048430384);
            }

            return 1;
        }

        if(arg8 == 0xE46) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new ka(((boolean)v6)), 0x8273DD02);
            }

            return 1;
        }

        if(0xE47 == arg8) {
            if(ai.oq != null) {
                ai.oq.av(-2001215836);
            }

            return 1;
        }

        if(arg8 == 0xE48) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            ds.rq.an.ao(new ke(((boolean)v6)), 0x87A1CFC4);
            return 1;
        }

        if(arg8 == 0xE49) {
            v8 = il.aj;
            v9 = il.ad - v0;
            il.ad = v9;
            if(v8[v9 * v10] == 1) {
                v6_2 = true;
            }

            if(ai.oq != null) {
                ai.oq.ao(new ke(((boolean)v6)), -2046660033);
            }

            return 1;
        }

        return 2;
    }

    static int ea(int arg10, hl arg11, boolean arg12) {
        int[] v1_3;
        int v3_1;
        String v1_2;
        String[] v11_2;
        int[] v11_1;
        ij v10_4;
        na v1_1;
        String v10_3;
        String[] v10_2;
        int v1;
        int[] v10;
        int v11 = 1304812425;
        int v12 = 0x4A90AB9;
        if(arg10 == 5000) {
            v10 = il.aj;
            v1 = il.ad + v12;
            il.ad = v1;
            v10[v1 * v11 - 1] = client.of * 2065516806;
            return 1;
        }

        int v2 = 0x9176C95F;
        byte v3 = 2;
        if(5001 == arg10) {
            il.ad -= 487742100;
            client.of = il.aj[il.ad * v11] * 0xD22577AD;
            ed.ob = di.al(il.aj[il.ad * v11 + 1], 0x9E5E60F);
            if(ed.ob == null) {
                ed.ob = pf.al;
            }

            client.op = il.aj[il.ad * 0x6509733F + v3] * 0x9592CFB;
            na v10_1 = cd.al(nf.bc, client.eh.an, -2099503853);
            v10_1.ae.ar(client.of * -1703500503, 51);
            v10_1.ae.ar(ed.ob.ar * v2, 74);
            v10_1.ae.ar(client.op * 0x946BCF9B, 106);
            client.eh.ae(v10_1, 0x577BB5DD);
            return 1;
        }

        if(0xCAE29A76 == arg10) {
            v10_2 = il.aq;
            v12 = ft.ab - 0x20CFDAB7;
            ft.ab = v12;
            v10_3 = v10_2[v12 * 0x80528523];
            il.ad -= 0xE419E0FF;
            v12 = il.aj[il.ad * v11];
            v11 = il.aj[il.ad * v11 + 1];
            v1_1 = cd.al(nf.cr, client.eh.an, 0x97191F11);
            v1_1.ae.ar(ki.af(v10_3, 0x74) + v3, 85);
            v1_1.ae.ai(v10_3, -51);
            v1_1.ae.ar(v12 - 1, 0x7C);
            v1_1.ae.ar(v11, 0x1F);
            client.eh.ae(v1_1, 372905505);
            return 1;
        }

        int v4 = 0x2CF6DEE0;
        int v5 = -1;
        int v6 = 0x8FA23525;
        int v7 = 0xBC5CDEAD;
        if(5003 == arg10) {
            il.ad -= -174173220;
            v10_4 = bf.ar(il.aj[il.ad * v11], il.aj[il.ad * -1513704254 + 1], 0x694D);
            if(v10_4 != null) {
                v11_1 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v11_1[v1 * -63090853 - 1] = v10_4.ax * 0x7D5124F1;
                v11_1 = il.aj;
                v12 = il.ad + 0x2E085C30;
                il.ad = v12;
                v11_1[v12 * 1738609486 - 1] = v10_4.al * 0xFF7E947;
                v11_2 = il.aq;
                v12 = ft.ab - 0x549BBACF;
                ft.ab = v12;
                v12 = v12 * 107403267 - 1;
                v1_2 = v10_4.ar != null ? v10_4.ar : "";
                v11_2[v12] = v1_2;
                v11_2 = il.aq;
                v12 = ft.ab + 1305298430;
                ft.ab = v12;
                v12 = v12 * 0x551F4734 - 1;
                v1_2 = v10_4.ad != null ? v10_4.ad : "";
                v11_2[v12] = v1_2;
                v11_2 = il.aq;
                v12 = ft.ab + v6;
                ft.ab = v12;
                v12 = v12 * 306284781 - 1;
                v1_2 = v10_4.aq != null ? v10_4.aq : "";
                v11_2[v12] = v1_2;
                v11_1 = il.aj;
                v12 = il.ad - 0x71E9A57E;
                il.ad = v12;
                v12 = v12 * 0x402CC5E0 - 1;
                if(v10_4.ae(v4)) {
                    v3_1 = 1;
                }
                else if(v10_4.ap(0x97CDFC38)) {
                }
                else {
                    v3_1 = 0;
                }

                v11_1[v12] = v3_1;
            }
            else {
                v10 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v10[v1 * v11 - 1] = v5;
                v10 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v10[v1 * v11 - 1] = 0;
                v10_2 = il.aq;
                v11 = ft.ab + v6;
                ft.ab = v11;
                v10_2[v11 * -1900150235 - 1] = "";
                v10_2 = il.aq;
                v11 = ft.ab - 433949014;
                ft.ab = v11;
                v10_2[v11 * 0xEEF0722E - 1] = "";
                v10_2 = il.aq;
                v11 = ft.ab + v6;
                ft.ab = v11;
                v10_2[v11 * v7 - 1] = "";
                v10 = il.aj;
                v11 = il.ad + v12;
                il.ad = v11;
                v10[v11 * -1905053089 - 1] = 0;
            }

            return 1;
        }

        if(arg10 == 5004) {
            v10 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v10_4 = az.an(v10[v1 * v11], -29488);
            if(v10_4 != null) {
                v1_3 = il.aj;
                v2 = il.ad + v12;
                il.ad = v2;
                v1_3[v2 * 94730003 - 1] = v10_4.ae * 0x522086F1;
                v1_3 = il.aj;
                v2 = il.ad - 0x265E9E0F;
                il.ad = v2;
                v1_3[v2 * 1601403368 - 1] = v10_4.al * 0x7BD4D10B;
                String[] v1_4 = il.aq;
                v2 = ft.ab + 0x5AF63EA7;
                ft.ab = v2;
                v2 = v2 * v7 - 1;
                String v5_1 = v10_4.ar != null ? v10_4.ar : "";
                v1_4[v2] = v5_1;
                v1_4 = il.aq;
                v2 = ft.ab - 0x58AA6505;
                ft.ab = v2;
                v2 = v2 * v7 - 1;
                v5_1 = v10_4.ad != null ? v10_4.ad : "";
                v1_4[v2] = v5_1;
                v1_4 = il.aq;
                v2 = ft.ab - 0x68FEEA44;
                ft.ab = v2;
                v2 = v2 * v7 - 1;
                v5_1 = v10_4.aq != null ? v10_4.aq : "";
                v1_4[v2] = v5_1;
                v1_3 = il.aj;
                v2 = il.ad + v12;
                il.ad = v2;
                v2 = v2 * v11 - 1;
                if(v10_4.ae(v4)) {
                    v3_1 = 1;
                }
                else if(v10_4.ap(0x4F0C9385)) {
                }
                else {
                    v3_1 = 0;
                }

                v1_3[v2] = v3_1;
            }
            else {
                v10 = il.aj;
                v1 = il.ad - 0x7F16859C;
                il.ad = v1;
                v10[v1 * 0xF11F44A - 1] = v5;
                v10 = il.aj;
                v1 = il.ad + v12;
                il.ad = v1;
                v10[v1 * v11 - 1] = 0;
                v10_2 = il.aq;
                v11 = ft.ab - 0x6FFFBFE3;
                ft.ab = v11;
                v10_2[v11 * v7 - 1] = "";
                v10_2 = il.aq;
                v11 = ft.ab - 683058739;
                ft.ab = v11;
                v10_2[v11 * 0x6853F871 - 1] = "";
                v10_2 = il.aq;
                v11 = ft.ab + 2035501876;
                ft.ab = v11;
                v10_2[v11 * v7 - 1] = "";
                v10 = il.aj;
                v11 = il.ad + v12;
                il.ad = v11;
                v10[v11 * 0xC62F747E - 1] = 0;
            }

            return 1;
        }

        if(arg10 == 1296491860) {
            if(ed.ob == null) {
                v10 = il.aj;
                v11 = il.ad + v12;
                il.ad = v11;
                v10[v11 * 0x301EF9ED - 1] = v5;
            }
            else {
                v10 = il.aj;
                v11 = il.ad + 440611938;
                il.ad = v11;
                v10[v11 * 0xEE37A5DF - 1] = ed.ob.ar * v2;
            }

            return 1;
        }

        if(5008 == arg10) {
            v10_2 = il.aq;
            v11 = ft.ab - v6;
            ft.ab = v11;
            v10_3 = v10_2[v11 * v7];
            v11_1 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            v11 = v11_1[v1 * 0x272CEF29];
            String v12_1 = v10_3.toLowerCase();
            v5 = 5;
            if(v12_1.startsWith(gs.hs)) {
                v10_3 = v10_3.substring(gs.hs.length());
                goto label_480;
            }
            else {
                if(v12_1.startsWith(gs.hr)) {
                    v10_3 = v10_3.substring(gs.hr.length());
                }
                else {
                    if(v12_1.startsWith(gs.hk)) {
                        v10_3 = v10_3.substring(gs.hk.length());
                    }
                    else {
                        if(v12_1.startsWith(gs.hw)) {
                            v10_3 = v10_3.substring(gs.hw.length());
                        }
                        else {
                            if(v12_1.startsWith(gs.he)) {
                                v10_3 = v10_3.substring(gs.he.length());
                            }
                            else {
                                if(v12_1.startsWith(gs.hq)) {
                                    v10_3 = v10_3.substring(gs.hq.length());
                                }
                                else {
                                    if(v12_1.startsWith(gs.ha)) {
                                        v10_3 = v10_3.substring(gs.ha.length());
                                    }
                                    else {
                                        if(v12_1.startsWith(gs.hj)) {
                                            v10_3 = v10_3.substring(gs.hj.length());
                                        }
                                        else if(v12_1.startsWith(gs.ib)) {
                                            v12 = 8;
                                            v10_3 = v10_3.substring(gs.ib.length());
                                            goto label_660;
                                        }
                                        else if(v12_1.startsWith(gs.ip)) {
                                            v12 = 9;
                                            v10_3 = v10_3.substring(gs.ip.length());
                                            goto label_660;
                                        }
                                        else if(v12_1.startsWith(gs.ig)) {
                                            v12 = 10;
                                            v10_3 = v10_3.substring(gs.ig.length());
                                            goto label_660;
                                        }
                                        else if(v12_1.startsWith(gs.ik)) {
                                            v12 = 11;
                                            v10_3 = v10_3.substring(gs.ik.length());
                                            goto label_660;
                                        }
                                        else if(en.af == ly.ax) {
                                            goto label_480;
                                        }
                                        else if(v12_1.startsWith(gs.hg)) {
                                            v10_3 = v10_3.substring(gs.hg.length());
                                            goto label_480;
                                        }
                                        else if(v12_1.startsWith(gs.hn)) {
                                            v10_3 = v10_3.substring(gs.hn.length());
                                            goto label_488;
                                        }
                                        else {
                                            goto label_587;
                                        }

                                        goto label_536;
                                    }

                                    goto label_528;
                                }

                                goto label_520;
                            }

                            goto label_512;
                        }

                        goto label_504;
                    }

                    goto label_496;
                }

            label_488:
                v12 = 1;
                goto label_660;
            label_587:
                if(v12_1.startsWith(gs.hu)) {
                    v10_3 = v10_3.substring(gs.hu.length());
                label_496:
                    v12 = 2;
                    goto label_660;
                }
                else if(v12_1.startsWith(gs.ho)) {
                    v10_3 = v10_3.substring(gs.ho.length());
                label_504:
                    v12 = 3;
                    goto label_660;
                }
                else if(v12_1.startsWith(gs.hl)) {
                    v10_3 = v10_3.substring(gs.hl.length());
                label_512:
                    v12 = 4;
                    goto label_660;
                }
                else if(v12_1.startsWith(gs.hp)) {
                    v10_3 = v10_3.substring(gs.hp.length());
                label_520:
                    v12 = 5;
                    goto label_660;
                }
                else if(v12_1.startsWith(gs.hv)) {
                    v10_3 = v10_3.substring(gs.hv.length());
                label_528:
                    v12 = 6;
                    goto label_660;
                }
                else if(v12_1.startsWith(gs.il)) {
                    v10_3 = v10_3.substring(gs.il.length());
                }
                else {
                    goto label_629;
                }

            label_536:
                v12 = 7;
                goto label_660;
            label_629:
                if(v12_1.startsWith(gs.ia)) {
                    v12 = 8;
                    v10_3 = v10_3.substring(gs.ia.length());
                    goto label_660;
                }

                if(v12_1.startsWith(gs.is)) {
                    v12 = 9;
                    v10_3 = v10_3.substring(gs.is.length());
                    goto label_660;
                }

                if(v12_1.startsWith(gs.ix)) {
                    v12 = 10;
                    v10_3 = v10_3.substring(gs.ix.length());
                    goto label_660;
                }

                if(v12_1.startsWith(gs.io)) {
                    v12 = 11;
                    v10_3 = v10_3.substring(gs.io.length());
                    goto label_660;
                }

            label_480:
                v12 = 0;
            }

        label_660:
            v1_2 = v10_3.toLowerCase();
            if(v1_2.startsWith(gs.ii)) {
                v10_3 = v10_3.substring(gs.ii.length());
                goto label_667;
            }
            else {
                if(v1_2.startsWith(gs.in)) {
                    v10_3 = v10_3.substring(gs.in.length());
                }
                else {
                    if(v1_2.startsWith(gs.ie)) {
                        v10_3 = v10_3.substring(gs.ie.length());
                    }
                    else {
                        if(v1_2.startsWith(gs.it)) {
                            v10_3 = v10_3.substring(gs.it.length());
                        }
                        else if(v1_2.startsWith(gs.ih)) {
                            v10_3 = v10_3.substring(gs.ih.length());
                            goto label_739;
                        }
                        else {
                            if(ly.ax != en.af) {
                                if(v1_2.startsWith(gs.iy)) {
                                    v10_3 = v10_3.substring(gs.iy.length());
                                label_667:
                                    v5 = 1;
                                    goto label_739;
                                }
                                else if(v1_2.startsWith(gs.id)) {
                                    v10_3 = v10_3.substring(gs.id.length());
                                    goto label_675;
                                }
                                else {
                                    goto label_717;
                                }
                            }

                            goto label_738;
                        }

                        goto label_691;
                    }

                    goto label_683;
                }

            label_675:
                v5 = 2;
                goto label_739;
            label_717:
                if(v1_2.startsWith(gs.iq)) {
                    v10_3 = v10_3.substring(gs.iq.length());
                label_683:
                    v5 = 3;
                    goto label_739;
                }
                else if(v1_2.startsWith(gs.if)) {
                    v10_3 = v10_3.substring(gs.if.length());
                label_691:
                    v5 = 4;
                    goto label_739;
                }
                else if(v1_2.startsWith(gs.ir)) {
                    v10_3 = v10_3.substring(gs.ir.length());
                    goto label_739;
                }

            label_738:
                v5 = 0;
            }

        label_739:
            v1_1 = cd.al(nf.dx, client.eh.an, 0x8ED06FCC);
            v1_1.ae.ar(0, 54);
            v4 = v1_1.ae.ar * 0x47810272;
            v1_1.ae.ar(v11, 29);
            v1_1.ae.ar(v12, v3);
            v1_1.ae.ar(v5, 39);
            et.al(v1_1.ae, v10_3, -1938021510);
            v1_1.ae.ag(v1_1.ae.ar * 0xF24F550B - v4, 0x7FAB55E2);
            client.eh.ae(v1_1, -1474202902);
            return 1;
        }

        if(arg10 == 5009) {
            ft.ab -= 0x1F446A4A;
            v10_3 = il.aq[ft.ab * v7];
            String v11_3 = il.aq[ft.ab * 29092216 + 1];
            na v12_2 = cd.al(nf.dr, client.eh.an, -2085460040);
            v12_2.ae.an(0, 0x447605BB);
            v2 = v12_2.ae.ar * 0x1BA6C3FC;
            v12_2.ae.ai(v10_3, -27);
            et.al(v12_2.ae, v11_3, 0xAB8BD6D2);
            v12_2.ae.az(v12_2.ae.ar * 0xD7379B68 - v2, -765038420);
            client.eh.ae(v12_2, -1640786791);
            return 1;
        }

        if(arg10 == 0xC9AB620B) {
            v10_3 = gu.jg == null || gu.jg.ax == null ? "" : gu.jg.ax.ax(0x3FFD0B20);
            v11_2 = il.aq;
            v12 = ft.ab - 0x1B464605;
            ft.ab = v12;
            v11_2[v12 * 0xC10B4690 - 1] = v10_3;
            return 1;
        }

        if(5016 == arg10) {
            v10 = il.aj;
            v11 = il.ad - 927077764;
            il.ad = v11;
            v10[v11 * 0x78CBD0B2 - 1] = client.op * 0xB6E2FF03;
            return 1;
        }

        if(arg10 == 5017) {
            v10 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            arg10 = v10[v1 * 0xDE5D04BC];
            int[] v12_3 = il.aj;
            v1 = il.ad - 2038131946;
            il.ad = v1;
            v12_3[v1 * v11 - 1] = ev.ap(arg10, -286058450);
            return 1;
        }

        if(arg10 == 5018) {
            v10 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            arg10 = v10[v1 * v11];
            v1_3 = il.aj;
            v2 = il.ad + v12;
            il.ad = v2;
            v1_3[v2 * v11 - 1] = gl.af(arg10, -108);
            return 1;
        }

        if(5019 == arg10) {
            v10 = il.aj;
            v1 = il.ad - v12;
            il.ad = v1;
            arg10 = v10[v1 * 0xEA44C481];
            v1_3 = il.aj;
            v2 = il.ad + v12;
            il.ad = v2;
            v1_3[v2 * v11 - 1] = ae.ab(arg10, 16);
            return 1;
        }

        if(arg10 == -312200412) {
            v10_2 = il.aq;
            v11 = ft.ab + 909874873;
            ft.ab = v11;
            ff.cx(v10_2[v11 * 0x70147A80], 2103010044);
            return 1;
        }

        if(-992523701 == arg10) {
            v10_2 = il.aq;
            v11 = ft.ab - v6;
            ft.ab = v11;
            client.og = v10_2[v11 * 0x6694DF88].toLowerCase().trim();
            return 1;
        }

        if(arg10 == 0xA2DAAE2C) {
            v10_2 = il.aq;
            v11 = ft.ab + v6;
            ft.ab = v11;
            v10_2[v11 * 0xB9B3B012 - 1] = client.og;
            return 1;
        }

        if(5023 == arg10) {
            v10_2 = il.aq;
            v11 = ft.ab + 0x72DE2750;
            ft.ab = v11;
            System.out.println(v10_2[v11 * 0xEEE05475]);
            return 1;
        }

        return v3;
    }

    static int eb(int arg9, hl arg10, boolean arg11) {
        int v10_1;
        int[] v9;
        short v10 = 0x100;
        int v11 = 1304812425;
        if(arg9 == 6200) {
            il.ad -= 0x9521572;
            client.qi = ((short)ha.bt(il.aj[il.ad * -1198600750], 0x7FA9AB23));
            if(client.qi <= 0) {
                client.qi = 0x67B1;
            }

            client.qe = ((short)ha.bt(il.aj[il.ad * v11 + 1], 0x7F6F6BC9));
            if(client.qe <= 0) {
                client.qe = v10;
            }

            return 1;
        }

        if(2021489897 == arg9) {
            il.ad -= 0xC81B60B9;
            client.qx = ((short)il.aj[il.ad * v11]);
            if(client.qx <= 0) {
                client.qx = v10;
            }

            client.qf = ((short)il.aj[il.ad * v11 + 1]);
            if(client.qf <= 0) {
                client.qf = 320;
            }

            return 1;
        }

        byte v1 = 2;
        if(6202 == arg9) {
            il.ad -= 0x12A42AE4;
            client.qp = ((short)il.aj[il.ad * v11]);
            if(client.qp <= 0) {
                client.qp = 1;
            }

            client.qw = ((short)il.aj[il.ad * 0x2B4452B + 1]);
            v10 = 0x7FFF;
            if(client.qw <= 0) {
                client.qw = v10;
            }
            else if(client.qw < client.qp) {
                client.qw = client.qp;
            }

            client.qm = ((short)il.aj[il.ad * v11 + v1]);
            if(client.qm <= 0) {
                client.qm = 1;
            }

            client.qu = ((short)il.aj[il.ad * 0x8B12FE8C + 3]);
            if(client.qu <= 0) {
                client.qu = v10;
            }
            else if(client.qu < client.qm) {
                client.qu = client.qm;
            }

            return 1;
        }

        int v2 = 0x4A90AB9;
        if(6203 == arg9) {
            if(client.lt != null) {
                ao.db(0, 0, client.lt.by * 0x1804E4A5, client.lt.bt * 0x6F0D2CD, false, 0x4C58);
                v9 = il.aj;
                v10_1 = il.ad + 0x73C28948;
                il.ad = v10_1;
                v9[v10_1 * v11 - 1] = client.ql * 0xDCCE0B33;
                v9 = il.aj;
                v10_1 = il.ad + v2;
                il.ad = v10_1;
                v9[v10_1 * v11 - 1] = client.qj * 927018595;
            }
            else {
                v9 = il.aj;
                v10_1 = il.ad + v2;
                il.ad = v10_1;
                v9[v10_1 * v11 - 1] = -1;
                v9 = il.aj;
                v10_1 = il.ad - 0x20C48E42;
                il.ad = v10_1;
                v9[v10_1 * v11 - 1] = -1;
            }

            return 1;
        }

        if(0xB71DA1A2 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - 0x1165798;
            il.ad = v10_1;
            v9[v10_1 * v11 - 1] = client.qx;
            v9 = il.aj;
            v10_1 = il.ad + v2;
            il.ad = v10_1;
            v9[v10_1 * v11 - 1] = client.qf;
            return 1;
        }

        if(-2004647289 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v2;
            il.ad = v10_1;
            v9[v10_1 * v11 - 1] = is.bv(client.qi, 0x8438BA0A);
            v9 = il.aj;
            v10_1 = il.ad + v2;
            il.ad = v10_1;
            v9[v10_1 * v11 - 1] = is.bv(client.qe, -2048998297);
            return 1;
        }

        if(arg9 == 6220) {
            v9 = il.aj;
            v10_1 = il.ad + v2;
            il.ad = v10_1;
            v9[v10_1 * 884180264 - 1] = client.al.adm(0x340AFEBB).aq(0xBD4F33C3);
            return 1;
        }

        if(arg9 == 6221) {
            v9 = il.aj;
            v10_1 = il.ad - 1760360034;
            il.ad = v10_1;
            v9[v10_1 * 1262031795 - 1] = client.al.adm(0x4FC97411).ab(166033357);
            return 1;
        }

        if(arg9 == 6222) {
            v9 = il.aj;
            v10_1 = il.ad - 0x77194094;
            il.ad = v10_1;
            v9[v10_1 * v11 - 1] = client.al.adm(0x7039E218).af(0xBB230BAE);
            return 1;
        }

        if(0x611F067 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v2;
            il.ad = v10_1;
            v9[v10_1 * 1300642436 - 1] = client.al.adm(0x5CD9E2F5).ai(v1);
            return 1;
        }

        return v1;
    }

    static int ec(int arg12, hl arg13, boolean arg14) {
        com.jagex.jagex3.client.input.softkeyboard.ar v12_4;
        int[] v1_4;
        String[] v1_3;
        dc v14_3;
        int[] v2_1;
        String[] v14_2;
        dc v1_2;
        boolean v13_3;
        String[] v12_2;
        String[] v13_2;
        int[] v13_1;
        ih v12_1;
        int v1;
        int[] v12;
        int v13 = 0;
        int v14 = 0x4A90AB9;
        if(6500 == arg12) {
            v12 = il.aj;
            v1 = il.ad + v14;
            il.ad = v1;
            v1 = v1 * 0x78B40073 - 1;
            if(fl.ax(129708000)) {
                v13 = 1;
            }

            v12[v1] = v13;
            return 1;
        }

        int v2 = 0xA45F5417;
        int v3 = -1;
        int v4 = 0xBC5CDEAD;
        int v5 = 0x8FA23525;
        int v6 = 1304812425;
        if(arg12 == 6501) {
            v12_1 = ox.ad(0x57E05CEB);
            if(v12_1 != null) {
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * 1767780061 - 1] = v12_1.af * -1296841012;
                v13_1 = il.aj;
                v1 = il.ad - 101570942;
                il.ad = v1;
                v13_1[v1 * 1717343804 - 1] = v12_1.ai * v2;
                v13_2 = il.aq;
                v1 = ft.ab - 910270613;
                ft.ab = v1;
                v13_2[v1 * -1489008871 - 1] = v12_1.au;
                v13_1 = il.aj;
                v1 = il.ad + 0x5C7CB0D3;
                il.ad = v1;
                v13_1[v1 * 0x71D29702 - 1] = v12_1.am * 0x4F0FEFDA;
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * v6 - 1] = v12_1.av * -798074022;
                v13_2 = il.aq;
                v14 = ft.ab + v5;
                ft.ab = v14;
                v13_2[v14 * 0xDB116AF8 - 1] = v12_1.aa;
            }
            else {
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * v6 - 1] = v3;
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * 0x9F40F0E5 - 1] = 0;
                v12_2 = il.aq;
                v1 = ft.ab + v5;
                ft.ab = v1;
                v12_2[v1 * v4 - 1] = "";
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * -2111068965 - 1] = 0;
                v12 = il.aj;
                v14 = il.ad - 1739750365;
                il.ad = v14;
                v12[v14 * v6 - 1] = 0;
                v12_2 = il.aq;
                v13 = ft.ab + 0x386F50E;
                ft.ab = v13;
                v12_2[v13 * -1461024152 - 1] = "";
            }

            return 1;
        }

        int v7 = -479634605;
        int v8 = 0xBBB22DD;
        int v9 = 0x98D051C9;
        if(0x7674A9E5 == arg12) {
            v12_1 = ev.aq(28);
            if(v12_1 != null) {
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * v6 - 1] = v12_1.af * v8;
                v13_1 = il.aj;
                v14 = il.ad + 1121012756;
                il.ad = v14;
                v13_1[v14 * 0xD4A36699 - 1] = v12_1.ai * v2;
                v13_2 = il.aq;
                v14 = ft.ab + 746505529;
                ft.ab = v14;
                v13_2[v14 * -1311014063 - 1] = v12_1.au;
                v13_1 = il.aj;
                v14 = il.ad - 564259032;
                il.ad = v14;
                v13_1[v14 * v6 - 1] = v12_1.am * v7;
                v13_1 = il.aj;
                v14 = il.ad + 0x50DAD508;
                il.ad = v14;
                v13_1[v14 * v6 - 1] = v12_1.av * v9;
                v13_2 = il.aq;
                v14 = ft.ab + 0x2572E7CB;
                ft.ab = v14;
                v13_2[v14 * -1029980204 - 1] = v12_1.aa;
            }
            else {
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * 0xADE1C2F7 - 1] = v3;
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * -1715706174 - 1] = 0;
                v12_2 = il.aq;
                v1 = ft.ab + v5;
                ft.ab = v1;
                v12_2[v1 * 0x742155E3 - 1] = "";
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * v6 - 1] = 0;
                v12 = il.aj;
                v14 = il.ad - 0x22C533C9;
                il.ad = v14;
                v12[v14 * v6 - 1] = 0;
                v12_2 = il.aq;
                v13 = ft.ab + v5;
                ft.ab = v13;
                v12_2[v13 * v4 - 1] = "";
            }

            return 1;
        }

        if(arg12 == -1092338108) {
            v12 = il.aj;
            v1 = il.ad + 0x62A82036;
            il.ad = v1;
            arg12 = v12[v1 * v6];
            ih v1_1 = null;
            v8 = 0;
            while(v8 < ih.ap * 0x6DE6A9AD) {
                if(ew.an[v8].af * 0xF5DA0FD8 == arg12) {
                    v1_1 = ew.an[v8];
                }
                else {
                    ++v8;
                    continue;
                }

                break;
            }

            if(v1_1 != null) {
                v12 = il.aj;
                v13 = il.ad + 1095380231;
                il.ad = v13;
                v12[v13 * 0x955147BB - 1] = v1_1.af * -121303011;
                v12 = il.aj;
                v13 = il.ad + v14;
                il.ad = v13;
                v12[v13 * v6 - 1] = v1_1.ai * v2;
                v12_2 = il.aq;
                v13 = ft.ab + v5;
                ft.ab = v13;
                v12_2[v13 * 0xF28FB927 - 1] = v1_1.au;
                v12 = il.aj;
                v13 = il.ad + v14;
                il.ad = v13;
                v12[v13 * v6 - 1] = v1_1.am * v7;
                v12 = il.aj;
                v13 = il.ad - 0x1CB701A1;
                il.ad = v13;
                v12[v13 * 0xC6D32F05 - 1] = v1_1.av * v9;
                v12_2 = il.aq;
                v13 = ft.ab + v5;
                ft.ab = v13;
                v12_2[v13 * v4 - 1] = v1_1.aa;
            }
            else {
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * -1581826330 - 1] = v3;
                v12 = il.aj;
                v1 = il.ad - 0x35272C8F;
                il.ad = v1;
                v12[v1 * 0xEE946C22 - 1] = 0;
                v12_2 = il.aq;
                v1 = ft.ab + v5;
                ft.ab = v1;
                v12_2[v1 * v4 - 1] = "";
                v12 = il.aj;
                v1 = il.ad - 0x405C03F7;
                il.ad = v1;
                v12[v1 * v6 - 1] = 0;
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * v6 - 1] = 0;
                v12_2 = il.aq;
                v13 = ft.ab + v5;
                ft.ab = v13;
                v12_2[v13 * 0xCB4A1FB9 - 1] = "";
            }

            return 1;
        }

        v2 = 2;
        if(arg12 == 750629356) {
            il.ad -= 0x1B74FF04;
            arg12 = il.aj[il.ad * v6];
            arg14 = 1 == il.aj[il.ad * v6 + 1] ? true : false;
            v1 = il.aj[il.ad * v6 + v2];
            if(il.aj[il.ad * v6 + 3] == 1) {
                v13_3 = true;
            }

            gs.ar(arg12, arg14, v1, v13_3, -618024210);
            return 1;
        }

        if(arg12 == 0x196F) {
            v12 = il.aj;
            v1 = il.ad + 611503317;
            il.ad = v1;
            arg12 = v12[v1 * v6];
            if(arg12 < 0 || arg12 >= ih.ap * 0x90F11B64) {
                v12 = il.aj;
                v1 = il.ad - 0x1EC83EE0;
                il.ad = v1;
                v12[v1 * v6 - 1] = v3;
                v12 = il.aj;
                v1 = il.ad + 0x395A3846;
                il.ad = v1;
                v12[v1 * v6 - 1] = 0;
                v12_2 = il.aq;
                v1 = ft.ab - 0x25E8FEDB;
                ft.ab = v1;
                v12_2[v1 * v4 - 1] = "";
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * v6 - 1] = 0;
                v12 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v12[v1 * 0x45EE85DF - 1] = 0;
                v12_2 = il.aq;
                v13 = ft.ab + 0x750E885E;
                ft.ab = v13;
                v12_2[v13 * 0x3594A3B1 - 1] = "";
            }
            else {
                v12_1 = ew.an[arg12];
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * v6 - 1] = v12_1.af * v8;
                v13_1 = il.aj;
                v1 = il.ad - 1452643650;
                il.ad = v1;
                v13_1[v1 * -1843460700 - 1] = v12_1.ai * 0x5ADA4457;
                v13_2 = il.aq;
                v1 = ft.ab + 0x83CB369;
                ft.ab = v1;
                v13_2[v1 * v4 - 1] = v12_1.au;
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * v6 - 1] = v12_1.am * 2050284390;
                v13_1 = il.aj;
                v1 = il.ad + v14;
                il.ad = v1;
                v13_1[v1 * v6 - 1] = v12_1.av * v9;
                v13_2 = il.aq;
                v14 = ft.ab + v5;
                ft.ab = v14;
                v13_2[v14 * 0x1AE89012 - 1] = v12_1.aa;
            }

            return 1;
        }

        if(0x1970 == arg12) {
            fw v12_3 = fh.kf;
            int[] v14_1 = il.aj;
            v1 = il.ad + 0x2E574DD1;
            il.ad = v1;
            if(v14_1[v1 * 0xFC2DF0A] == 1) {
                v13_3 = true;
            }

            v12_3.cb(v13_3, 756045400);
            return 1;
        }

        v3 = 1495630439;
        v7 = 0x9521572;
        if(arg12 == 0xADD3FB78) {
            il.ad -= v7;
            arg12 = il.aj[il.ad * v6];
            v13 = il.aj[il.ad * -343393001 + 1];
            v1_2 = dm.al(v13, 725403989);
            if(v1_2.ap(-1429830041)) {
                v14_2 = il.aq;
                v2 = ft.ab + v5;
                ft.ab = v2;
                v14_2[v2 * v4 - 1] = au.al(arg12, 1).af(v13, v1_2.an, -920995390);
            }
            else {
                v2_1 = il.aj;
                v4 = il.ad + v14;
                il.ad = v4;
                v2_1[v4 * 0x96DF4E26 - 1] = au.al(arg12, 1).ab(v13, v1_2.ar * v3, 0x990C57EF);
            }

            return 1;
        }

        if(arg12 == 1005412664) {
            il.ad -= 0xF04C7C8B;
            arg12 = il.aj[il.ad * -1948130769];
            v13 = il.aj[il.ad * v6 + 1];
            v1_2 = dm.al(v13, 0xE0D2D887);
            if(v1_2.ap(-74180283)) {
                v14_2 = il.aq;
                v2 = ft.ab + v5;
                ft.ab = v2;
                v14_2[v2 * v4 - 1] = ok.al(arg12, 0x3982F90).aa(v13, v1_2.an, -92);
            }
            else {
                v2_1 = il.aj;
                v3 = il.ad + v14;
                il.ad = v3;
                v2_1[v3 * 0xD3D03D4D - 1] = ok.al(arg12, 0x46C7ADFD).av(v13, v1_2.ar * 0x64DC2B1F, 0x7F0600DA);
            }

            return 1;
        }

        if(6515 == arg12) {
            il.ad -= v7;
            arg12 = il.aj[il.ad * 12064213];
            v13 = il.aj[il.ad * 0xF575D66D + 1];
            v14_3 = dm.al(v13, 0x76673126);
            if(v14_3.ap(0x989311AE)) {
                v1_3 = il.aq;
                v2 = ft.ab + v5;
                ft.ab = v2;
                v1_3[v2 * v4 - 1] = client.al(arg12, 0x72555DAA).ah(v13, v14_3.an, 1075014353);
            }
            else {
                v1_4 = il.aj;
                v2 = il.ad + 489262203;
                il.ad = v2;
                v1_4[v2 * v6 - 1] = client.al(arg12, 0x201394D4).ag(v13, v14_3.ar * 0x111D8B73, 0x6EF239EB);
            }

            return 1;
        }

        if(0xB40971D7 == arg12) {
            il.ad -= 0x205D0302;
            arg12 = il.aj[il.ad * v6];
            v13 = il.aj[il.ad * 2054243527 + 1];
            v14_3 = dm.al(v13, 0x570055E3);
            if(v14_3.ap(-2056109930)) {
                v1_3 = il.aq;
                v2 = ft.ab + v5;
                ft.ab = v2;
                v1_3[v2 * -1603892051 - 1] = hu.al(arg12, -902857850).aj(v13, v14_3.an, 0x74ADDFA5);
            }
            else {
                v1_4 = il.aj;
                v2 = il.ad + 0xFC5D510;
                il.ad = v2;
                v1_4[v2 * v6 - 1] = hu.al(arg12, -942427607).ap(v13, v14_3.ar * v3, -3994);
            }

            return 1;
        }

        if(6518 == arg12) {
            v12 = il.aj;
            v14 = il.ad - 1530467445;
            il.ad = v14;
            v14 = v14 * 0x1BE11F70 - 1;
            if(client.al.au) {
                v13 = 1;
            }

            v12[v14] = v13;
            return 1;
        }

        if(5601257 == arg12) {
            v12 = il.aj;
            v13 = il.ad - 142048417;
            il.ad = v13;
            v12[v13 * 0x4EFFADD6 - 1] = client.al.abd(1934055847) & 3;
            return 1;
        }

        if(arg12 != 0x59DFC913) {
            if(0xEAB489F6 == arg12) {
            }
            else if(arg12 == 6521) {
                client.al.aba(0x34439C00).gc(0xE95ADC45);
                return 1;
            }
            else if(arg12 == 0x5A1120C2) {
                v12_4 = client.al.aba(0x86408ED1).az(1, 0x3310F9D5);
                v13_2 = il.aq;
                v14 = ft.ab - v5;
                ft.ab = v14;
                String v13_4 = v13_2[v14 * 0x4F75B688];
                if(ie.av(((CharSequence)v13_4), -100)) {
                    v12_4.ao(v13_4, 0x85016F33);
                    v13_1 = il.aj;
                    v14 = il.ad - 1672007570;
                    il.ad = v14;
                    v12_4.ak(v13_1[v14 * 0xF64A9BBE], 0xDDEFCC11);
                    v12_4.at(0xA23A60A5);
                    return 1;
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            else if(arg12 == 6524) {
                v12 = il.aj;
                v13 = il.ad + v14;
                il.ad = v13;
                v12[v13 * -928208738 - 1] = client.al.aba(0xCD9996F0).aq(538072200);
                return 1;
            }
            else if(0x1148E231 == arg12) {
                v12 = il.aj;
                v13 = il.ad + 0xFDE455A;
                il.ad = v13;
                v12[v13 * 0x9C12113E - 1] = client.al.aba(0x76CC18A0).ab(0x1054B5FE);
                return 1;
            }
            else if(6526 == arg12) {
                v12 = il.aj;
                v13 = il.ad - 0x5A57FAE1;
                il.ad = v13;
                v12[v13 * 0x32A42A83 - 1] = client.al.aba(1131840794).af(0x64B3372F);
                return 1;
            }
            else {
                return v2;
            }
        }

        v12_4 = client.al.aba(0xDF68A8B1).az(v2, 0x3310F9D5);
        v13_2 = il.aq;
        v1 = ft.ab + 0x2EAC0DA1;
        ft.ab = v1;
        v12_4.ao(v13_2[v1 * 0x910B404F], 0x89B50120);
        v13_1 = il.aj;
        v1 = il.ad - v14;
        il.ad = v1;
        v12_4.ak(v13_1[v1 * 0x22215EC1], 0xDDEFCC11);
        v12_4.at(0xB5CBA043);
        return 1;
    }

    static int ed(int arg4) {
        return ((int)((Math.log(((double)arg4)) / il.as - 7) * 256));
    }

    static int ee(int arg4) {
        return ((int)((Math.log(((double)arg4)) / il.as - 7) * 256));
    }

    static int ef(int arg9, hl arg10, boolean arg11) {
        da v9_6;
        cg v9_5;
        boolean v0_1;
        pb v9_4;
        dh v10_4;
        af v9_3;
        int[] v10_3;
        int v0;
        String[] v9_2;
        dh v9_1;
        int v10_1;
        int[] v9;
        byte v10 = 7;
        if(6600 == arg9) {
            dl.ab(-1379592400).ai(kt.jz * 0xC8BFB800, ad.fi * 474770003 + (gu.jg.bp * 1545953630 >> v10), nr.fo * 2033783454 + (gu.jg.bw * 0xD19D0C3D >> 7), true, 0x600);
            return 1;
        }

        int v1 = 0x8FA23525;
        int v2 = 1304812425;
        if(arg9 == 0x370A6E00) {
            v9 = il.aj;
            v10_1 = il.ad + 0x56F2A928;
            il.ad = v10_1;
            arg9 = v9[v10_1 * v2];
            String v10_2 = "";
            v9_1 = dl.ab(0x316F2AA5).bn(arg9, -1227674019);
            if(v9_1 != null) {
                v10_2 = v9_1.am(-2048188964);
            }

            v9_2 = il.aq;
            v0 = ft.ab + v1;
            ft.ab = v0;
            v9_2[v0 * 0x7D7FBE52 - 1] = v10_2;
            return 1;
        }

        int v3 = 0x4A90AB9;
        if(0xD78F318C == arg9) {
            v9 = il.aj;
            v0 = il.ad - v3;
            il.ad = v0;
            dl.ab(0x5A5F9F15).av(v9[v0 * v2], v10);
            return 1;
        }

        if(6603 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - 2010243309;
            il.ad = v10_1;
            v9[v10_1 * 0x92CC14FE - 1] = dl.ab(0xC7FD2ED7).bd(14);
            return 1;
        }

        if(0xB8DEF867 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + 0x65EF1EAC;
            il.ad = v10_1;
            dl.ab(0xF9A4E71).as(v9[v10_1 * 1434613608], 0xF5FD0CB7);
            return 1;
        }

        v0 = 0;
        if(0xF8981C89 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v10_1 = v10_1 * v2 - 1;
            if(dl.ab(0xCF8CE237).bf(0xF93C28FF)) {
                v0 = 1;
            }

            v9[v10_1] = v0;
            return 1;
        }

        if(arg9 == 6606) {
            v10_3 = il.aj;
            v0 = il.ad - 0x5CAD06E7;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * 970448281]);
            dl.ab(0xF2AF852C).bp(v9_3.al * 0x8804ECBD, v9_3.ae * 0x69CE48BA, -1031025504);
            return 1;
        }

        int v4 = 0xAEACF223;
        if(arg9 == 6607) {
            v10_3 = il.aj;
            v0 = il.ad + 0x7FCA0692;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * v2]);
            dl.ab(2120004451).bw(v9_3.al * v4, v9_3.ae * -1038640103, 1);
            return 1;
        }

        int v5 = 400591065;
        int v6 = 0xB230B0A5;
        if(0x9727CF9E == arg9) {
            v10_3 = il.aj;
            v0 = il.ad - v3;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * 0x80AE044A]);
            dl.ab(-892680468).bo(v9_3.ax * v5, v9_3.al * v4, v9_3.ae * v6, -1385092983);
            return 1;
        }

        if(arg9 == 0xA7B4BC47) {
            v10_3 = il.aj;
            v0 = il.ad - 2031737669;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * v2]);
            dl.ab(752360317).by(v9_3.ax * v5, v9_3.al * 11978370, v9_3.ae * 0x715B6B60, 0xC2D8F891);
            return 1;
        }

        if(6610 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * 160404945 - 1] = dl.ab(-1680205339).bt(0x31D665C7);
            v9 = il.aj;
            v10_1 = il.ad + 1778170820;
            il.ad = v10_1;
            v9[v10_1 * 0xA6BB3839 - 1] = dl.ab(0xD12BA17C).bv(740981891);
            return 1;
        }

        if(arg9 == 6611) {
            v9 = il.aj;
            v10_1 = il.ad - 0x368E8BE5;
            il.ad = v10_1;
            v9_1 = dl.ab(0x9C6482A4).bn(v9[v10_1 * v2], -2101407079);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 1260680352 - 1] = 0;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * -632888606 - 1] = v9_1.ac(287427031).ax(0xF047FCB3);
            }

            return 1;
        }

        int v7 = 0x999D058;
        if(arg9 == 0xF61B3D9F) {
            v9 = il.aj;
            v10_1 = il.ad - 1505989083;
            il.ad = v10_1;
            v9_1 = dl.ab(0xE313C27D).bn(v9[v10_1 * 0x24C4A1AA], 0xFDA64158);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = 0;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0x6A5E5AF1 - 1] = 0;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = (v9_1.at(0xD07F4A23) - v9_1.ah(v7) + 1) * 874305645;
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * 0x29F216DD - 1] = (v9_1.aw(-2100154546) - v9_1.ay(0x80D9ABE2) + 1) * 0x40;
            }

            return 1;
        }

        if(6613 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - 0x27205BF9;
            il.ad = v10_1;
            v9_1 = dl.ab(410676457).bn(v9[v10_1 * v2], 0xC9810993);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad - 0x3A137B2C;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = 0;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = 0;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0xEAA9C430 - 1] = 0;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = 0;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + 1034003363;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_1.ah(v7) * 0x40;
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * -929335410 - 1] = v9_1.ay(-2123719305) * 0x40;
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * -1002490620 - 1] = v9_1.at(0xD59F1E77) * 1491650487 + 1435950140 - 1;
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_1.aw(-2062182025) * 0x40 + 0x6A4BC1B7 - 1;
            }

            return 1;
        }

        v7 = -1;
        if(arg9 == 315190377) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            v9_1 = dl.ab(0x62900F0F).bn(v9[v10_1 * 0x89AEE6E0], 0xD8DFFAF2);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad + 0x5B8B1749;
                il.ad = v10_1;
                v9[v10_1 * 0xB63DA9A2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad - 0x1F204655;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_1.ag(0xD54EB40F);
            }

            return 1;
        }

        if(6615 == arg9) {
            v9_3 = dl.ab(1850855787).bq(45050198);
            if(v9_3 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0xA82FFFB - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + 2023311097;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_3.al * v4;
                v10_3 = il.aj;
                v0 = il.ad - 0x612393ED;
                il.ad = v0;
                v10_3[v0 * 0x9FA98FB4 - 1] = v9_3.ae * v6;
            }

            return 1;
        }

        if(1305805995 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + 1867590690;
            il.ad = v10_1;
            v9[v10_1 * 0xEB8BB963 - 1] = dl.ab(-77017716).aa(0x7B);
            return 1;
        }

        if(arg9 == 0x5EA442F) {
            v10_3 = il.aj;
            v1 = il.ad + 0x49E7C0B5;
            il.ad = v1;
            v9_3 = new af(v10_3[v1 * v2]);
            v10_4 = dl.ab(-160634702).au(0x32EDA444);
            if(v10_4 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad - 0x4FEA632F;
                il.ad = v10_1;
                v9[v10_1 * 0x56A025F6 - 1] = v7;
                return 1;
            }

            v9 = v10_4.ab(v9_3.ax * v5, v9_3.al * 0x50FC1617, v9_3.ae * v6, 0xB9D56FE3);
            if(v9 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0xC653A566 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0xA1D67E5D - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v1 = il.ad + 0x4F678479;
                il.ad = v1;
                v10_3[v1 * v2 - 1] = v9[0];
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * 0x7E5A1847 - 1] = v9[1];
            }

            return 1;
        }

        if(6618 == arg9) {
            v10_3 = il.aj;
            v0 = il.ad - v3;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * 0x5EFB62DA]);
            v10_4 = dl.ab(0xE0A715C).au(0x447A2FFB);
            if(v10_4 == null) {
                v9 = il.aj;
                v10_1 = il.ad + 1134200620;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0x8B3C8A74 - 1] = v7;
                return 1;
            }

            v9_3 = v10_4.af(v9_3.al * v4, v9_3.ae * v6, 0x535C86C9);
            if(v9_3 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * 0x775D0CF8 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad - 0x603EA256;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_3.ax(-1898600745);
            }

            return 1;
        }

        int v8 = 0x9521572;
        if(6619 == arg9) {
            il.ad -= v8;
            bv.bh(il.aj[il.ad * v2], new af(il.aj[il.ad * v2 + 1]), false, 0x7042D881);
            return 1;
        }

        if(0x894D52D8 == arg9) {
            il.ad -= v8;
            bv.bh(il.aj[il.ad * v2], new af(il.aj[il.ad * -1462848500 + 1]), true, -1295801243);
            return 1;
        }

        if(arg9 == 6621) {
            il.ad -= v8;
            arg9 = il.aj[il.ad * v2];
            af v10_5 = new af(il.aj[il.ad * v2 + 1]);
            v9_1 = dl.ab(910637794).bn(arg9, 0xF8103893);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad - 820685008;
                il.ad = v10_1;
                v9[v10_1 * 0xF18AC24D - 1] = 0;
                return 1;
            }

            int[] v1_1 = il.aj;
            v2 = il.ad + v3;
            il.ad = v2;
            v2 = v2 * 0x236F31F3 - 1;
            if(v9_1.ad(v10_5.ax * 0xE72D0A4F, v10_5.al * v4, v10_5.ae * v6, -16)) {
                v0 = 1;
            }

            v1_1[v2] = v0;
            return 1;
        }

        if(6622 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * v2 - 1] = dl.ab(0x691F3751).bx(0x72F3B232);
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * -181740226 - 1] = dl.ab(0xDE71DC8C).bg(0xFC7C4661);
            return 1;
        }

        if(arg9 == -1720166462) {
            v10_3 = il.aj;
            v0 = il.ad - v3;
            il.ad = v0;
            v9_3 = new af(v10_3[v0 * 0xCF51380B]);
            v9_1 = dl.ab(0xAB8436EF).af(v9_3.ax * v5, v9_3.al * 0x6C2C3953, v9_3.ae * 0x3C7A0182, 98);
            if(v9_1 == null) {
                v9 = il.aj;
                v10_1 = il.ad + 0x3A7A0976;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_1.av(-1880437085);
            }

            return 1;
        }

        if(0x4FFA3849 == arg9) {
            v9_4 = dl.ab(1220847741);
            v10_3 = il.aj;
            v0 = il.ad - v3;
            il.ad = v0;
            v9_4.bz(v10_3[v0 * 0x1E86CF19], -15);
            return 1;
        }

        if(arg9 == 0x10B5EBC0) {
            dl.ab(0xE0BC38C3).bh(-2002072994);
            return 1;
        }

        if(arg9 == 6626) {
            v9_4 = dl.ab(0xBDD74691);
            v10_3 = il.aj;
            v0 = il.ad - 1838930904;
            il.ad = v0;
            v9_4.bb(v10_3[v0 * 0x9B3601F9], 0x9B5968D2);
            return 1;
        }

        if(6627 == arg9) {
            dl.ab(-2015911510).bc(0xAE49FA76);
            return 1;
        }

        if(0x46502C8 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - 0x3902AE2B;
            il.ad = v10_1;
            if(v9[v10_1 * 0xFF035F7D] == 1) {
                v0_1 = true;
            }

            dl.ab(0xD751CF7F).bk(((boolean)v0), 0xC34);
            return 1;
        }

        if(arg9 == 6629) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            dl.ab(0xBAEDC328).bm(v9[v10_1 * v2], 13);
            return 1;
        }

        if(6630 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            dl.ab(0xCBD1DDAC).bj(v9[v10_1 * 0x33ABD2B6], 15);
            return 1;
        }

        if(arg9 == 557627031) {
            dl.ab(0xD0B8E0B9).bu(400872117);
            return 1;
        }

        if(arg9 == 6632) {
            v9 = il.aj;
            v10_1 = il.ad - 0x19DF350E;
            il.ad = v10_1;
            if(v9[v10_1 * v2] == 1) {
                v0_1 = true;
            }

            dl.ab(0xE1DDAF9).bs(((boolean)v0), 0x64E3A25B);
            return 1;
        }

        if(1734980846 == arg9) {
            il.ad -= 0xB06C73B;
            arg9 = il.aj[il.ad * v2];
            if(1 == il.aj[il.ad * v2 + 1]) {
                v0_1 = true;
            }

            dl.ab(397097496).be(arg9, ((boolean)v0), 0x20);
            return 1;
        }

        if(arg9 == 362905960) {
            il.ad -= 0x5130DDE3;
            arg9 = il.aj[il.ad * v2];
            if(il.aj[il.ad * v2 + 1] == 1) {
                v0_1 = true;
            }

            dl.ab(0xF92D5B97).bl(arg9, ((boolean)v0), 0x7BDF2A5A);
            return 1;
        }

        if(6635 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * v2 - 1] = dl.ab(0x6E86A9A).br(0xD9DBE85C);
            return 1;
        }

        if(arg9 == 0xDAE0B3B6) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            arg9 = v9[v10_1 * v2];
            v10_3 = il.aj;
            v1 = il.ad + v3;
            il.ad = v1;
            v1 = v1 * v2 - 1;
            if(dl.ab(0xA22A55CF).bi(arg9, 1)) {
                v0 = 1;
            }

            v10_3[v1] = v0;
            return 1;
        }

        if(arg9 == 6637) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            arg9 = v9[v10_1 * 0x670284C8];
            v10_3 = il.aj;
            v1 = il.ad + v3;
            il.ad = v1;
            v1 = v1 * 0xB4CBC2E1 - 1;
            if(dl.ab(0x9AF36D77).ca(arg9, -65)) {
                v0 = 1;
            }

            v10_3[v1] = v0;
            return 1;
        }

        byte v0_2 = 2;
        if(arg9 == 0xF09D637D) {
            il.ad -= 0xAF591123;
            v9_3 = dl.ab(-2047080741).cf(il.aj[il.ad * v2], new af(il.aj[il.ad * v2 + 1]), v0_2);
            if(v9_3 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + 0x2EBCCCE9;
                il.ad = v0;
                v10_3[v0 * 0x8F6BC0DE - 1] = v9_3.ax(-113049106);
            }

            return 1;
        }

        if(0x19EF == arg9) {
            v9_5 = dl.ab(0xFE96971E).cb(0x5EB08DCB);
            if(v9_5 == null) {
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_5.al(-127);
                v10_3 = il.aj;
                v0 = il.ad + 0x7CB7AFEF;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_5.ax.ax(0x4CB87F63);
            }

            return 1;
        }

        if(arg9 == 0x19F0) {
            v9_5 = dl.ab(-1641458510).cy(0xBCE6BA83);
            if(v9_5 == null) {
                v9 = il.aj;
                v10_1 = il.ad - 2055681865;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
                v9 = il.aj;
                v10_1 = il.ad + v3;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + 0xFEE3A9D;
                il.ad = v0;
                v10_3[v0 * 0xA89535E9 - 1] = v9_5.al(45);
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * v2 - 1] = v9_5.ax.ax(0xB645D491);
            }

            return 1;
        }

        byte v4_1 = 16;
        if(-306950426 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad - 0x2CF72C08;
            il.ad = v10_1;
            v9_6 = ae.al(v9[v10_1 * 0xE70DF6A2], v4_1);
            if(v9_6.ad == null) {
                v9_2 = il.aq;
                v10_1 = ft.ab + v1;
                ft.ab = v10_1;
                v9_2[v10_1 * 0xBC5CDEAD - 1] = "";
            }
            else {
                String[] v10_6 = il.aq;
                v0 = ft.ab - 0x50B22D6F;
                ft.ab = v0;
                v10_6[v0 * 0xBC5CDEAD - 1] = v9_6.ad;
            }

            return 1;
        }

        if(arg9 == 6694) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            v9_6 = ae.al(v9[v10_1 * v2], v4_1);
            v10_3 = il.aj;
            v0 = il.ad - 0x175021C6;
            il.ad = v0;
            v10_3[v0 * 0x2C31EE7B - 1] = v9_6.ab * 1038644085;
            return 1;
        }

        if(arg9 == 690023548) {
            v9 = il.aj;
            v10_1 = il.ad - v3;
            il.ad = v10_1;
            v9_6 = ae.al(v9[v10_1 * v2], v4_1);
            if(v9_6 == null) {
                v9 = il.aj;
                v10_1 = il.ad - 1000763422;
                il.ad = v10_1;
                v9[v10_1 * v2 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * 601047313 - 1] = v9_6.ao * 0x64537821;
            }

            return 1;
        }

        if(0x760992BE == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + 1566013026;
            il.ad = v10_1;
            v9_6 = ae.al(v9[v10_1 * 507340523], v4_1);
            if(v9_6 == null) {
                v9 = il.aj;
                v10_1 = il.ad + 123424170;
                il.ad = v10_1;
                v9[v10_1 * 935085992 - 1] = v7;
            }
            else {
                v10_3 = il.aj;
                v0 = il.ad + v3;
                il.ad = v0;
                v10_3[v0 * 0x3063275F - 1] = v9_6.ap * 1372301195;
            }

            return 1;
        }

        if(6697 == arg9) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * v2 - 1] = jc.az.ax * 0x9AC5A0D7;
            return 1;
        }

        if(arg9 == 6698) {
            v9 = il.aj;
            v10_1 = il.ad + v3;
            il.ad = v10_1;
            v9[v10_1 * v2 - 1] = jc.az.al.ax(-104545150);
            return 1;
        }

        if(arg9 == 6699) {
            v9 = il.aj;
            v10_1 = il.ad + 0x2DE5A0A;
            il.ad = v10_1;
            v9[v10_1 * 0x89407875 - 1] = jc.az.ae.ax(0xCAC850A6);
            return 1;
        }

        return v0_2;
    }

    static int eg(int arg4) {
        return ((int)Math.pow(2, ((double)((((float)arg4)) / 256f + 7f))));
    }

    static int eh(int arg13, hl arg14, boolean arg15) {
        com.jagex.jagex3.client.input.softkeyboard.ar v13_4;
        int[] v4_1;
        String[] v15_1;
        dc v2_3;
        boolean v14_3;
        int v11;
        String[] v13_2;
        String[] v14_2;
        int[] v14_1;
        ih v13_1;
        int v2;
        int[] v13;
        int v14 = 0;
        int v15 = 0x4A90AB9;
        int v0 = 1304812425;
        if(6500 == arg13) {
            v13 = il.aj;
            v2 = il.ad + v15;
            il.ad = v2;
            v2 = v2 * v0 - 1;
            if(fl.ax(129708000)) {
                v14 = 1;
            }

            v13[v2] = v14;
            return 1;
        }

        int v3 = 0x98D051C9;
        int v4 = -479634605;
        int v5 = 0xA45F5417;
        int v6 = -1;
        int v7 = 0xBBB22DD;
        int v8 = 0xBC5CDEAD;
        int v9 = 0x8FA23525;
        if(arg13 == 6501) {
            v13_1 = ox.ad(0xBE2F70E);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        if(6502 == arg13) {
            v13_1 = ev.aq(68);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        int v10 = 0x6DE6A9AD;
        if(arg13 == 6506) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            ih v2_1 = null;
            v11 = 0;
            while(v11 < ih.ap * v10) {
                if(ew.an[v11].af * v7 == arg13) {
                    v2_1 = ew.an[v11];
                }
                else {
                    ++v11;
                    continue;
                }

                break;
            }

            if(v2_1 != null) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.af * v7;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.ai * v5;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.au;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.am * v4;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.av * v3;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        v11 = 2;
        if(arg13 == 6507) {
            il.ad -= 0x12A42AE4;
            arg13 = il.aj[il.ad * v0];
            arg15 = 1 == il.aj[il.ad * v0 + 1] ? true : false;
            v2 = il.aj[il.ad * v0 + v11];
            if(il.aj[il.ad * v0 + 3] == 1) {
                v14_3 = true;
            }

            gs.ar(arg13, arg15, v2, v14_3, -618024210);
            return 1;
        }

        if(arg13 == 0x196F) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            if(arg13 < 0 || arg13 >= ih.ap * v10) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }
            else {
                v13_1 = ew.an[arg13];
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }

            return 1;
        }

        if(0x1970 == arg13) {
            fw v13_3 = fh.kf;
            int[] v2_2 = il.aj;
            v3 = il.ad - v15;
            il.ad = v3;
            if(v2_2[v3 * v0] == 1) {
                v14_3 = true;
            }

            v13_3.cb(v14_3, 756045400);
            return 1;
        }

        v3 = 1495630439;
        v4 = 0x9521572;
        if(arg13 == 6513) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0xFA4CBC4F);
            if(v2_3.ap(0x9E1EB4AC)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = au.al(arg13, 1).af(v14, v2_3.an, 0x6FF4AF37);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = au.al(arg13, 1).ab(v14, v2_3.ar * v3, 0xABB2FEC0);
            }

            return 1;
        }

        if(arg13 == 6514) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 197358901);
            if(v2_3.ap(0xF93837A5)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = ok.al(arg13, 0x28FB8F70).aa(v14, v2_3.an, -105);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = ok.al(arg13, 2002812380).av(v14, v2_3.ar * v3, 0x7F0600DA);
            }

            return 1;
        }

        if(6515 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0xF1E040E0);
            if(v2_3.ap(-376430980)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = client.al(arg13, 2083089490).ah(v14, v2_3.an, -830200917);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = client.al(arg13, 0x6A7D7B00).ag(v14, v2_3.ar * v3, 0x1F093688);
            }

            return 1;
        }

        if(6516 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, -592006356);
            if(v2_3.ap(0xF02450F7)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = hu.al(arg13, 0xB5396EEB).aj(v14, v2_3.an, 0x250FE866);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = hu.al(arg13, 0xC78268BB).ap(v14, v2_3.ar * v3, -34);
            }

            return 1;
        }

        if(6518 == arg13) {
            v13 = il.aj;
            v2 = il.ad + v15;
            il.ad = v2;
            v2 = v2 * v0 - 1;
            if(client.al.au) {
                v14 = 1;
            }

            v13[v2] = v14;
            return 1;
        }

        if(6519 == arg13) {
            v13 = il.aj;
            v14 = il.ad + v15;
            il.ad = v14;
            v13[v14 * v0 - 1] = client.al.abd(0x5D21A0C6) & 3;
            return 1;
        }

        if(arg13 != 6520) {
            if(6522 == arg13) {
            }
            else if(arg13 == 6521) {
                client.al.aba(0xFBAEB669).gc(-176856204);
                return 1;
            }
            else if(arg13 == 6523) {
                v13_4 = client.al.aba(-146034158).az(1, 0x3310F9D5);
                v14_2 = il.aq;
                v2 = ft.ab - v9;
                ft.ab = v2;
                String v14_4 = v14_2[v2 * v8];
                if(ie.av(((CharSequence)v14_4), -7)) {
                    v13_4.ao(v14_4, -2072975340);
                    v14_1 = il.aj;
                    v2 = il.ad - v15;
                    il.ad = v2;
                    v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
                    v13_4.at(0x80E68E32);
                    return 1;
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            else if(arg13 == 6524) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = client.al.aba(0x8F745C3E).aq(2063870084);
                return 1;
            }
            else if(6525 == arg13) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v2 = v2 * v0 - 1;
                if(client.al.aba(0x1BA488E9).ab(693070531)) {
                    v14 = 1;
                }

                v13[v2] = v14;
                return 1;
            }
            else {
                if(6526 == arg13) {
                    v13 = il.aj;
                    v2 = il.ad + v15;
                    il.ad = v2;
                    v2 = v2 * v0 - 1;
                    if(client.al.aba(0xEA58FABD).af(0x4BB465F9)) {
                        v14 = 1;
                    }

                    v13[v2] = v14;
                    return 1;
                }

                return v11;
            }
        }

        v13_4 = client.al.aba(0x6F46E62D).az(v11, 0x3310F9D5);
        v14_2 = il.aq;
        v2 = ft.ab - v9;
        ft.ab = v2;
        v13_4.ao(v14_2[v2 * v8], 0x809599E4);
        v14_1 = il.aj;
        v2 = il.ad - v15;
        il.ad = v2;
        v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
        v13_4.at(0x686515BE);
        return 1;
    }

    static int ei(int arg13, hl arg14, boolean arg15) {
        com.jagex.jagex3.client.input.softkeyboard.ar v13_4;
        int[] v4_1;
        String[] v15_1;
        dc v2_3;
        boolean v14_3;
        int v11;
        String[] v13_2;
        String[] v14_2;
        int[] v14_1;
        ih v13_1;
        int v2;
        int[] v13;
        int v14 = 0;
        int v15 = 0x4A90AB9;
        int v0 = 1304812425;
        if(6500 == arg13) {
            v13 = il.aj;
            v2 = il.ad + v15;
            il.ad = v2;
            v2 = v2 * v0 - 1;
            if(fl.ax(129708000)) {
                v14 = 1;
            }

            v13[v2] = v14;
            return 1;
        }

        int v3 = 0x98D051C9;
        int v4 = -479634605;
        int v5 = 0xA45F5417;
        int v6 = -1;
        int v7 = 0xBBB22DD;
        int v8 = 0xBC5CDEAD;
        int v9 = 0x8FA23525;
        if(arg13 == 6501) {
            v13_1 = ox.ad(1530477852);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        if(6502 == arg13) {
            v13_1 = ev.aq(-36);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        int v10 = 0x6DE6A9AD;
        if(arg13 == 6506) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            ih v2_1 = null;
            v11 = 0;
            while(v11 < ih.ap * v10) {
                if(ew.an[v11].af * v7 == arg13) {
                    v2_1 = ew.an[v11];
                }
                else {
                    ++v11;
                    continue;
                }

                break;
            }

            if(v2_1 != null) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.af * v7;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.ai * v5;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.au;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.am * v4;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.av * v3;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        v11 = 2;
        if(arg13 == 6507) {
            il.ad -= 0x12A42AE4;
            arg13 = il.aj[il.ad * v0];
            arg15 = 1 == il.aj[il.ad * v0 + 1] ? true : false;
            v2 = il.aj[il.ad * v0 + v11];
            if(il.aj[il.ad * v0 + 3] == 1) {
                v14_3 = true;
            }

            gs.ar(arg13, arg15, v2, ((boolean)v14), -618024210);
            return 1;
        }

        if(arg13 == 0x196F) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            if(arg13 < 0 || arg13 >= ih.ap * v10) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }
            else {
                v13_1 = ew.an[arg13];
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }

            return 1;
        }

        if(0x1970 == arg13) {
            fw v13_3 = fh.kf;
            int[] v2_2 = il.aj;
            v3 = il.ad - v15;
            il.ad = v3;
            if(v2_2[v3 * v0] == 1) {
                v14_3 = true;
            }

            v13_3.cb(((boolean)v14), 756045400);
            return 1;
        }

        v3 = 1495630439;
        v4 = 0x9521572;
        if(arg13 == 6513) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0x5030808F);
            if(v2_3.ap(0xC56F5E03)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = au.al(arg13, 1).af(v14, v2_3.an, 0x3A957A94);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = au.al(arg13, 1).ab(v14, v2_3.ar * v3, 0x992198A7);
            }

            return 1;
        }

        if(arg13 == 6514) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0x4C9BD6F4);
            if(v2_3.ap(0x74442A)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = ok.al(arg13, 0x40BCFDA2).aa(v14, v2_3.an, -75);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = ok.al(arg13, -310698700).av(v14, v2_3.ar * v3, 0x7F0600DA);
            }

            return 1;
        }

        if(6515 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0x2EC00035);
            if(v2_3.ap(-1906304401)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = client.al(arg13, 0xFCC16BE5).ah(v14, v2_3.an, 0xB2BAF9EB);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = client.al(arg13, 0x585E1B9B).ag(v14, v2_3.ar * v3, 723700286);
            }

            return 1;
        }

        if(6516 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0xF813C07C);
            if(v2_3.ap(0xAD04F5B8)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = hu.al(arg13, 0x94AEF0CA).aj(v14, v2_3.an, 0x2BE6F7D0);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = hu.al(arg13, 0xC85AF862).ap(v14, v2_3.ar * v3, -14433);
            }

            return 1;
        }

        if(6518 == arg13) {
            v13 = il.aj;
            v2 = il.ad + v15;
            il.ad = v2;
            v2 = v2 * v0 - 1;
            if(client.al.au) {
                v14 = 1;
            }

            v13[v2] = v14;
            return 1;
        }

        if(6519 == arg13) {
            v13 = il.aj;
            v14 = il.ad + v15;
            il.ad = v14;
            v13[v14 * v0 - 1] = client.al.abd(0x7E901F50) & 3;
            return 1;
        }

        if(arg13 != 6520) {
            if(6522 == arg13) {
            }
            else if(arg13 == 6521) {
                client.al.aba(-26330691).gc(0x3ACC1F6A);
                return 1;
            }
            else if(arg13 == 6523) {
                v13_4 = client.al.aba(0x2E1F6F2B).az(1, 0x3310F9D5);
                v14_2 = il.aq;
                v2 = ft.ab - v9;
                ft.ab = v2;
                String v14_4 = v14_2[v2 * v8];
                if(ie.av(((CharSequence)v14_4), -65)) {
                    v13_4.ao(v14_4, -2070943528);
                    v14_1 = il.aj;
                    v2 = il.ad - v15;
                    il.ad = v2;
                    v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
                    v13_4.at(0x4D0D070A);
                    return 1;
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            else if(arg13 == 6524) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = client.al.aba(1709815032).aq(0x3E94E1F7);
                return 1;
            }
            else if(6525 == arg13) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v2 = v2 * v0 - 1;
                if(client.al.aba(1055280727).ab(0x403926A0)) {
                    v14 = 1;
                }

                v13[v2] = v14;
                return 1;
            }
            else {
                if(6526 == arg13) {
                    v13 = il.aj;
                    v2 = il.ad + v15;
                    il.ad = v2;
                    v2 = v2 * v0 - 1;
                    if(client.al.aba(0x5102955C).af(0x70C1F4AF)) {
                        v14 = 1;
                    }

                    v13[v2] = v14;
                    return 1;
                }

                return v11;
            }
        }

        v13_4 = client.al.aba(-1673037450).az(v11, 0x3310F9D5);
        v14_2 = il.aq;
        v2 = ft.ab - v9;
        ft.ab = v2;
        v13_4.ao(v14_2[v2 * v8], -2010378018);
        v14_1 = il.aj;
        v2 = il.ad - v15;
        il.ad = v2;
        v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
        v13_4.at(0x3798FB3A);
        return 1;
    }

    static int ej(int arg2, hl arg3, boolean arg4) {
        int[] v2;
        int v4;
        if(arg2 == 0x985F8EDF) {
            il.ad -= 0xEE6C9325;
            arg2 = il.aj[il.ad * 2002101722];
            v4 = il.aj[il.ad * 1063484202 + 1];
            if(!client.pi) {
                du.cy(arg2, v4, 0x316F1172);
            }

            return 1;
        }

        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(5505 == arg2) {
            v2 = il.aj;
            v4 = il.ad + v1;
            il.ad = v4;
            v2[v4 * v0 - 1] = client.hy * 0xB2EDB909;
            return 1;
        }

        if(5506 == arg2) {
            v2 = il.aj;
            v4 = il.ad + v1;
            il.ad = v4;
            v2[v4 * v0 - 1] = client.ht * 949247702;
            return 1;
        }

        if(arg2 == 5530) {
            v2 = il.aj;
            v4 = il.ad - v1;
            il.ad = v4;
            arg2 = v2[v4 * v0];
            if(arg2 < 0) {
                arg2 = 0;
            }

            client.hn = arg2 * 481600145;
            return 1;
        }

        if(arg2 == 5531) {
            v2 = il.aj;
            v4 = il.ad + v1;
            il.ad = v4;
            v2[v4 * v0 - 1] = client.hn * 0xB8D87B9F;
            return 1;
        }

        return 2;
    }

    static int ek(int arg8, hl arg9, boolean arg10) {
        int[] v2_3;
        int[] v8_2;
        String[] v9_3;
        int[] v9_2;
        String[] v0_1;
        String v9_1;
        String[] v10_2;
        int[] v10_1;
        String v8_1;
        int v2;
        String[] v8;
        int v9 = 0x4A90AB9;
        int v10 = 0x8FA23525;
        int v0 = 1304812425;
        if(arg8 == 4100) {
            v8 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v8_1 = v8[v2 * 0xE9F60D73];
            v10_1 = il.aj;
            v2 = il.ad - v9;
            il.ad = v2;
            v9 = v10_1[v2 * v0];
            v10_2 = il.aq;
            v0 = ft.ab + 0xEA47151;
            ft.ab = v0;
            v10_2[v0 * 0x5157E0AC - 1] = v8_1 + v9;
            return 1;
        }

        int v3 = 0xBC5CDEAD;
        if(arg8 == -1430619700) {
            ft.ab -= 0x1F446A4A;
            v8_1 = il.aq[ft.ab * 0x9054AA26];
            v9_1 = il.aq[ft.ab * 1128800932 + 1];
            v0_1 = il.aq;
            v2 = ft.ab + v10;
            ft.ab = v2;
            v0_1[v2 * v3 - 1] = v8_1 + v9_1;
            return 1;
        }

        if(0x1006 == arg8) {
            v8 = il.aq;
            v9 = ft.ab - 1501141573;
            ft.ab = v9;
            v8_1 = v8[v9 * 0x27DCA7E7];
            v9_2 = il.aj;
            v10 = il.ad - 0x6474C9D4;
            il.ad = v10;
            v9 = v9_2[v10 * 0xF67CDC3E];
            v10_2 = il.aq;
            v0 = ft.ab - 0x119D0214;
            ft.ab = v0;
            v10_2[v0 * v3 - 1] = v8_1 + js.aj(v9, true, 0x74581B2B);
            return 1;
        }

        if(-1009550998 == arg8) {
            v8 = il.aq;
            v9 = ft.ab - 1481470886;
            ft.ab = v9;
            v8_1 = v8[v9 * v3];
            v9_3 = il.aq;
            v0 = ft.ab + v10;
            ft.ab = v0;
            v9_3[v0 * 0x1255919 - 1] = v8_1.toLowerCase();
            return 1;
        }

        int v4 = 2;
        if(arg8 == 0x1008) {
            v8_2 = il.aj;
            v2 = il.ad - v9;
            il.ad = v2;
            il.au.setTime(new Date(((((long)v8_2[v2 * v0])) + 0x2DE1) * 86400000));
            arg8 = il.au.get(5);
            v9 = il.au.get(v4);
            v0 = il.au.get(1);
            String[] v2_2 = il.aq;
            v4 = ft.ab + v10;
            ft.ab = v4;
            v2_2[v4 * v3 - 1] = arg8 + "-" + il.am[v9] + "-" + v0;
            return 1;
        }

        if(arg8 == 0x1F4A498C) {
            ft.ab -= 0x4D8D78FE;
            v8_1 = il.aq[ft.ab * v3];
            v9_1 = il.aq[ft.ab * -2037205988 + 1];
            if(gu.jg.al == null || !gu.jg.al.ae) {
                v9_3 = il.aq;
                v10 = ft.ab - 0x57904B69;
                ft.ab = v10;
                v9_3[v10 * v3 - 1] = v8_1;
            }
            else {
                v8 = il.aq;
                v10 = ft.ab - 0x1B1E4A17;
                ft.ab = v10;
                v8[v10 * v3 - 1] = v9_1;
            }

            return 1;
        }

        if(arg8 == 0x100A) {
            v8_2 = il.aj;
            v10 = il.ad - v9;
            il.ad = v10;
            arg8 = v8_2[v10 * 0xEAF95E72];
            v9_3 = il.aq;
            v10 = ft.ab + 0x671C7F1A;
            ft.ab = v10;
            v9_3[v10 * v3 - 1] = Integer.toString(arg8);
            return 1;
        }

        if(arg8 == 0x100B) {
            ft.ab -= -240094366;
            v8_2 = il.aj;
            v10 = il.ad + v9;
            il.ad = v10;
            v8_2[v10 * v0 - 1] = cb.ah(dm.ax(il.aq[ft.ab * 0x150CA70A], il.aq[ft.ab * v3 + 1], en.af, 0x6FD35204), 16);
            return 1;
        }

        int v5 = 0x78DC0DC9;
        int v6 = 0x9521572;
        int v7 = 0;
        if(0x92C94750 == arg8) {
            v8 = il.aq;
            v9 = ft.ab - 1265700079;
            ft.ab = v9;
            v8_1 = v8[v9 * -236513200];
            il.ad -= v6;
            v9 = il.aj[il.ad * v0];
            od v0_2 = new od(cj.de.ae(il.aj[il.ad * 1550830562 + 1], 0, v5));
            v10_1 = il.aj;
            v2 = il.ad - 0x3FC2838B;
            il.ad = v2;
            v10_1[v2 * 0x53F86890 - 1] = v0_2.aj(v8_1, v9);
            return 1;
        }

        if(0x9DF9A5B1 == arg8) {
            v8 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v8_1 = v8[v2 * v3];
            il.ad -= 0xCA8309D0;
            v10 = il.aj[il.ad * 0x4CAB24B4];
            od v3_1 = new od(cj.de.ae(il.aj[il.ad * 1951711000 + 1], 0, v5));
            v2_3 = il.aj;
            v4 = il.ad + v9;
            il.ad = v4;
            v2_3[v4 * v0 - 1] = v3_1.ap(v8_1, v10);
            return 1;
        }

        if(1420653524 == arg8) {
            ft.ab -= 0x6C4A0160;
            v8_1 = il.aq[ft.ab * v3];
            String v2_4 = il.aq[ft.ab * v3 + 1];
            int[] v4_1 = il.aj;
            v5 = il.ad - v9;
            il.ad = v5;
            if(v4_1[v5 * v0] == 1) {
                v9_3 = il.aq;
                v0 = ft.ab + v10;
                ft.ab = v0;
                v9_3[v0 * 0xCEC0AAA1 - 1] = v8_1;
            }
            else {
                v8 = il.aq;
                v9 = ft.ab + v10;
                ft.ab = v9;
                v8[v9 * v3 - 1] = v2_4;
            }

            return 1;
        }

        if(-332330801 == arg8) {
            v8 = il.aq;
            v9 = ft.ab - 0x2B731F0;
            ft.ab = v9;
            v8_1 = v8[v9 * -1020347642];
            v9_3 = il.aq;
            v0 = ft.ab + v10;
            ft.ab = v0;
            v9_3[v0 * v3 - 1] = od.ad(v8_1);
            return 1;
        }

        if(0x3FFA476 == arg8) {
            v8 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v8_1 = v8[v2 * v3];
            v10_1 = il.aj;
            v2 = il.ad - v9;
            il.ad = v2;
            v9 = v10_1[v2 * v0];
            v10_2 = il.aq;
            v0 = ft.ab + 1293508300;
            ft.ab = v0;
            v10_2[v0 * 605645510 - 1] = v8_1 + (((char)v9));
            return 1;
        }

        if(arg8 == 0x81C93B15) {
            v8_2 = il.aj;
            v9 = il.ad + 0x313FEB75;
            il.ad = v9;
            arg8 = v8_2[v9 * 0xD70D96F7];
            v9_2 = il.aj;
            v10 = il.ad - 0x38183530;
            il.ad = v10;
            v10 = v10 * 0xBFDBA509 - 1;
            if(lm.ag(((char)arg8), 1251110212)) {
                v7 = 1;
            }

            v9_2[v10] = v7;
            return 1;
        }

        if(0x1012 == arg8) {
            v8_2 = il.aj;
            v10 = il.ad + 0x5CA82F2;
            il.ad = v10;
            arg8 = v8_2[v10 * 0x7247E5A9];
            v10_1 = il.aj;
            v2 = il.ad + v9;
            il.ad = v2;
            v10_1[v2 * v0 - 1] = ev.aa(((char)arg8), 0x5F198170);
            return 1;
        }

        if(arg8 == 0x1013) {
            v8_2 = il.aj;
            v9 = il.ad + 0x2A7D90CA;
            il.ad = v9;
            arg8 = v8_2[v9 * 0xB93468AB];
            v9_2 = il.aj;
            v10 = il.ad + 1630276033;
            il.ad = v10;
            v9_2[v10 * 0xCA759F87 - 1] = de.af(((char)arg8), 0x8400B5E0);
            return 1;
        }

        if(arg8 == 0x1014) {
            v8_2 = il.aj;
            v10 = il.ad - 0x52132533;
            il.ad = v10;
            arg8 = v8_2[v10 * 0x2BC5DE43];
            v10_1 = il.aj;
            v0 = il.ad + v9;
            il.ad = v0;
            v0 = v0 * -2006214079 - 1;
            if(at.ai(((char)arg8), 0x7A940FB5)) {
                v7 = 1;
            }

            v10_1[v0] = v7;
            return 1;
        }

        if(arg8 == 0x1015) {
            v8 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v8_1 = v8[v2 * -348490142];
            if(v8_1 != null) {
                v10_1 = il.aj;
                v0 = il.ad + v9;
                il.ad = v0;
                v10_1[v0 * 0x3916F6 - 1] = v8_1.length();
            }
            else {
                v8_2 = il.aj;
                v9 = il.ad - 0x6FEF8685;
                il.ad = v9;
                v8_2[v9 * v0 - 1] = 0;
            }

            return 1;
        }

        if(arg8 == 0x1384218D) {
            v8 = il.aq;
            v9 = ft.ab - v10;
            ft.ab = v9;
            v8_1 = v8[v9 * 0xBB2C8EF9];
            il.ad -= v6;
            v9 = il.aj[il.ad * v0];
            v10 = il.aj[il.ad * v0 + 1];
            v0_1 = il.aq;
            v2 = ft.ab + 0x43768B25;
            ft.ab = v2;
            v0_1[v2 * v3 - 1] = v8_1.substring(v9, v10);
            return 1;
        }

        if(arg8 == 0x5D2FC593) {
            v8 = il.aq;
            v9 = ft.ab - 953052377;
            ft.ab = v9;
            v8_1 = v8[v9 * 0x1ACE47E4];
            StringBuilder v9_4 = new StringBuilder(v8_1.length());
            v0 = 0;
            v2 = 0;
            while(v0 < v8_1.length()) {
                char v3_2 = v8_1.charAt(v0);
                if(v3_2 == 60) {
                    v2 = 1;
                }
                else if(0xD4487E59 == v3_2) {
                    v2 = 0;
                }
                else if(v2 == 0) {
                    v9_4.append(v3_2);
                }

                ++v0;
            }

            v8 = il.aq;
            v0 = ft.ab + v10;
            ft.ab = v0;
            v8[v0 * 0xBA86FBC9 - 1] = v9_4.toString();
            return 1;
        }

        if(arg8 == 1043817840) {
            v8 = il.aq;
            v2 = ft.ab - v10;
            ft.ab = v2;
            v8_1 = v8[v2 * v3];
            v10_1 = il.aj;
            v2 = il.ad - v9;
            il.ad = v2;
            v9 = v10_1[v2 * v0];
            v10_1 = il.aj;
            v2 = il.ad - 0x518325CB;
            il.ad = v2;
            v10_1[v2 * v0 - 1] = v8_1.indexOf(v9);
            return 1;
        }

        if(arg8 == 0xF6CA1747) {
            ft.ab -= 0xB15F93F;
            v8_1 = il.aq[ft.ab * v3];
            v9_1 = il.aq[ft.ab * 0x7FC7006D + 1];
            v10_1 = il.aj;
            v2 = il.ad - 0x5B1DBCB;
            il.ad = v2;
            v10 = v10_1[v2 * 0xFD7413E];
            v2_3 = il.aj;
            v3 = il.ad + 0x4C80A037;
            il.ad = v3;
            v2_3[v3 * v0 - 1] = v8_1.indexOf(v9_1, v10);
            return 1;
        }

        if(0x101A == arg8) {
            v8 = il.aq;
            v9 = ft.ab - 1501404207;
            ft.ab = v9;
            v8_1 = v8[v9 * 0x56150349];
            v9_3 = il.aq;
            v10 = ft.ab + 221103541;
            ft.ab = v10;
            v9_3[v10 * v3 - 1] = v8_1.toUpperCase();
            return 1;
        }

        return v4;
    }

    static int el(int arg0, hl arg1, boolean arg2) {
        if(5630 == arg0) {
            client.ei = 0xDDCA1B82;
            return 1;
        }

        return 2;
    }

    static int em(int arg2, hl arg3, boolean arg4) {
        int v0;
        int[] v2;
        int v3 = 1304812425;
        if(arg2 == 5504) {
            il.ad -= 0x9521572;
            arg2 = il.aj[il.ad * v3];
            v3 = il.aj[il.ad * v3 + 1];
            if(!client.pi) {
                du.cy(arg2, v3, 0x316F1172);
            }

            return 1;
        }

        int v1 = 0x4A90AB9;
        if(5505 == arg2) {
            v2 = il.aj;
            v0 = il.ad + v1;
            il.ad = v0;
            v2[v0 * v3 - 1] = client.hy * 0x720F8187;
            return 1;
        }

        if(5506 == arg2) {
            v2 = il.aj;
            v0 = il.ad + v1;
            il.ad = v0;
            v2[v0 * v3 - 1] = client.ht * 0x62C4AE09;
            return 1;
        }

        if(arg2 == 5530) {
            v2 = il.aj;
            v0 = il.ad - v1;
            il.ad = v0;
            arg2 = v2[v0 * v3];
            if(arg2 < 0) {
                arg2 = 0;
            }

            client.hn = arg2 * 0x7421E05F;
            return 1;
        }

        if(arg2 == 5531) {
            v2 = il.aj;
            v0 = il.ad + v1;
            il.ad = v0;
            v2[v0 * v3 - 1] = client.hn * 0xB8D87B9F;
            return 1;
        }

        return 2;
    }

    static int en(int arg0, hl arg1, boolean arg2) {
        if(5630 == arg0) {
            client.ei = 0xDDCA1B82;
            return 1;
        }

        return 2;
    }

    static int eo(int arg11, hl arg12, boolean arg13) {
        da v11_6;
        cg v11_5;
        boolean v8_1;
        pb v11_4;
        dh v13_3;
        af v11_3;
        int[] v13_2;
        String[] v11_2;
        dh v11_1;
        int v13;
        int[] v11;
        if(6600 == arg11) {
            dl.ab(-510667905).ai(kt.jz * 1101813865, ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7), nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7), true, 0x600);
            return 1;
        }

        int v0 = 0xBC5CDEAD;
        int v1 = 0x8FA23525;
        int v2 = 0x4A90AB9;
        int v3 = 1304812425;
        if(arg11 == 6601) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            arg11 = v11[v13 * v3];
            String v13_1 = "";
            v11_1 = dl.ab(0x45ED7CD5).bn(arg11, 0xB5F4F4D4);
            if(v11_1 != null) {
                v13_1 = v11_1.am(0x8FC6684A);
            }

            v11_2 = il.aq;
            v2 = ft.ab + v1;
            ft.ab = v2;
            v11_2[v2 * v0 - 1] = v13_1;
            return 1;
        }

        if(6602 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            dl.ab(0xAE07961).av(v11[v13 * v3], 97);
            return 1;
        }

        byte v4 = 3;
        if(6603 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(-650715099).bd(v4);
            return 1;
        }

        if(6604 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            dl.ab(0x314502B2).as(v11[v13 * v3], 0xF5FD0CB7);
            return 1;
        }

        if(6605 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(0x88F4BBAF).bf(0xD1923DF4);
            return 1;
        }

        int v5 = 0xB230B0A5;
        int v6 = 0xAEACF223;
        if(arg11 == 6606) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            dl.ab(0xA64DF9D3).bp(v11_3.al * v6, v11_3.ae * v5, 0x5634EFD2);
            return 1;
        }

        if(arg11 == 6607) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            dl.ab(-1080713605).bw(v11_3.al * v6, v11_3.ae * v5, 1);
            return 1;
        }

        int v7 = 400591065;
        if(6608 == arg11) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            dl.ab(-321360918).bo(v11_3.ax * v7, v11_3.al * v6, v11_3.ae * v5, 1012918120);
            return 1;
        }

        if(arg11 == 6609) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            dl.ab(-1427805087).by(v11_3.ax * v7, v11_3.al * v6, v11_3.ae * v5, 0xACBECA08);
            return 1;
        }

        if(6610 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(0x3F393032).bt(0x31D665C7);
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(-225002026).bv(0x1DB0F784);
            return 1;
        }

        int v8 = 0;
        if(arg11 == 6611) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_1 = dl.ab(0xF953544B).bn(v11[v13 * v3], 0xFBF1BE0D);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.ac(287427031).ax(-2023146209);
            }

            return 1;
        }

        if(arg11 == 6612) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_1 = dl.ab(0xF9B06CBA).bn(v11[v13 * v3], 0xDEFDCC00);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = (v11_1.at(0xA2B87DB5) - v11_1.ah(0x999D058) + 1) * 0x40;
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = (v11_1.aw(0x84F20289) - v11_1.ay(0x80B4A45C) + 1) * 0x40;
            }

            return 1;
        }

        if(6613 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_1 = dl.ab(0xC406FD8C).bn(v11[v13 * v3], 0xB9DAEA6E);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.ah(0x999D058) * 0x40;
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.ay(0x80C9F219) * 0x40;
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.at(0x4264E47F) * 0x40 + 0x40 - 1;
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.aw(0x828B2501) * 0x40 + 0x40 - 1;
            }

            return 1;
        }

        int v9 = -1;
        if(arg11 == 6614) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_1 = dl.ab(-1042997719).bn(v11[v13 * v3], 0xE908A034);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.ag(0xD54EB40F);
            }

            return 1;
        }

        if(6615 == arg11) {
            v11_3 = dl.ab(0x86EB0F4E).bq(-253240520);
            if(v11_3 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_3.al * v6;
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_3.ae * v5;
            }

            return 1;
        }

        if(6616 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(0xEEE79950).aa(65);
            return 1;
        }

        if(arg11 == 6617) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            v13_3 = dl.ab(0x2018E641).au(360396661);
            if(v13_3 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                return 1;
            }

            v11 = v13_3.ab(v11_3.ax * v7, v11_3.al * v6, v11_3.ae * v5, 54253980);
            if(v11 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11[0];
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11[1];
            }

            return 1;
        }

        if(6618 == arg11) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            v13_3 = dl.ab(0x9CEBBB36).au(365029640);
            if(v13_3 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                return 1;
            }

            v11_3 = v13_3.af(v11_3.al * v6, v11_3.ae * v5, 950506571);
            if(v11_3 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_3.ax(0xE05B267C);
            }

            return 1;
        }

        int v10 = 0x9521572;
        if(6619 == arg11) {
            il.ad -= v10;
            bv.bh(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), false, 0xE7B216F8);
            return 1;
        }

        if(6620 == arg11) {
            il.ad -= v10;
            bv.bh(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), true, 0xD9E22EDB);
            return 1;
        }

        if(arg11 == 6621) {
            il.ad -= v10;
            arg11 = il.aj[il.ad * v3];
            af v13_4 = new af(il.aj[il.ad * v3 + 1]);
            v11_1 = dl.ab(0x94F678B9).bn(arg11, 0xB287E8A9);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = 0;
                return 1;
            }

            int[] v0_1 = il.aj;
            v1 = il.ad + v2;
            il.ad = v1;
            v1 = v1 * v3 - 1;
            if(v11_1.ad(v13_4.ax * v7, v13_4.al * v6, v13_4.ae * v5, -79)) {
                v8 = 1;
            }

            v0_1[v1] = v8;
            return 1;
        }

        if(6622 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(0xA630D790).bx(0x74CD9A69);
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = dl.ab(0xF602BFF).bg(1820859720);
            return 1;
        }

        if(arg11 == 0x19DF) {
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_3 = new af(v13_2[v0 * v3]);
            v11_1 = dl.ab(0x59CF5690).af(v11_3.ax * v7, v11_3.al * v6, v11_3.ae * v5, 53);
            if(v11_1 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_1.av(-1880437085);
            }

            return 1;
        }

        if(0x19E0 == arg11) {
            v11_4 = dl.ab(0xD58AEA0);
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_4.bz(v13_2[v0 * v3], -20);
            return 1;
        }

        if(arg11 == 6625) {
            dl.ab(0x7505FB4).bh(0xA4FE5C44);
            return 1;
        }

        if(arg11 == 6626) {
            v11_4 = dl.ab(-2089146429);
            v13_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v11_4.bb(v13_2[v0 * v3], 0x78F46115);
            return 1;
        }

        if(6627 == arg11) {
            dl.ab(0x88F36199).bc(0xE00F10EA);
            return 1;
        }

        if(6628 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            if(v11[v13 * v3] == 1) {
                v8_1 = true;
            }

            dl.ab(0x78C90B6D).bk(((boolean)v8), 0xC34);
            return 1;
        }

        if(arg11 == 6629) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            dl.ab(0x477246C7).bm(v11[v13 * v3], v4);
            return 1;
        }

        if(6630 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            dl.ab(1245570013).bj(v11[v13 * v3], 15);
            return 1;
        }

        if(arg11 == 6631) {
            dl.ab(0xD622784).bu(400872117);
            return 1;
        }

        if(arg11 == 6632) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            if(v11[v13 * v3] == 1) {
                v8_1 = true;
            }

            dl.ab(0x12605FD4).bs(((boolean)v8), 2014653572);
            return 1;
        }

        if(6633 == arg11) {
            il.ad -= v10;
            arg11 = il.aj[il.ad * v3];
            if(1 == il.aj[il.ad * v3 + 1]) {
                v8_1 = true;
            }

            dl.ab(844843170).be(arg11, ((boolean)v8), 99);
            return 1;
        }

        if(arg11 == 6634) {
            il.ad -= v10;
            arg11 = il.aj[il.ad * v3];
            if(il.aj[il.ad * v3 + 1] == 1) {
                v8_1 = true;
            }

            dl.ab(0xBAA2F5EA).bl(arg11, ((boolean)v8), 0x7566C2E9);
            return 1;
        }

        if(6635 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v13 = v13 * v3 - 1;
            if(dl.ab(0xCBF03753).br(0x6DD47EC)) {
                v8 = 1;
            }

            v11[v13] = v8;
            return 1;
        }

        if(arg11 == 6636) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            arg11 = v11[v13 * v3];
            v13_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v0 = v0 * v3 - 1;
            if(dl.ab(1708354781).bi(arg11, 1)) {
                v8 = 1;
            }

            v13_2[v0] = v8;
            return 1;
        }

        if(arg11 == 6637) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            arg11 = v11[v13 * v3];
            v13_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v13_2[v0 * v3 - 1] = dl.ab(0x1928D1F1).ca(arg11, -69);
            return 1;
        }

        if(arg11 == 6638) {
            il.ad -= v10;
            v11_3 = dl.ab(-504784677).cf(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), -41);
            if(v11_3 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_3.ax(-1681310867);
            }

            return 1;
        }

        if(0x19EF == arg11) {
            v11_5 = dl.ab(0x81B30DD9).cb(-1024706268);
            if(v11_5 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_5.al(-67);
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_5.ax.ax(1081939430);
            }

            return 1;
        }

        if(arg11 == 0x19F0) {
            v11_5 = dl.ab(-1463640611).cy(1417578902);
            if(v11_5 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_5.al(-86);
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_5.ax.ax(0xAB639B23);
            }

            return 1;
        }

        v4 = 16;
        if(6693 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_6 = ae.al(v11[v13 * v3], v4);
            if(v11_6.ad == null) {
                v11_2 = il.aq;
                v13 = ft.ab + v1;
                ft.ab = v13;
                v11_2[v13 * v0 - 1] = "";
            }
            else {
                String[] v13_5 = il.aq;
                v2 = ft.ab + v1;
                ft.ab = v2;
                v13_5[v2 * v0 - 1] = v11_6.ad;
            }

            return 1;
        }

        if(arg11 == 6694) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_6 = ae.al(v11[v13 * v3], v4);
            v13_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v13_2[v0 * v3 - 1] = v11_6.ab * 0xD6D0BF01;
            return 1;
        }

        if(arg11 == 6695) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_6 = ae.al(v11[v13 * v3], v4);
            if(v11_6 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_6.ao * 0x64537821;
            }

            return 1;
        }

        if(6696 == arg11) {
            v11 = il.aj;
            v13 = il.ad - v2;
            il.ad = v13;
            v11_6 = ae.al(v11[v13 * v3], v4);
            if(v11_6 == null) {
                v11 = il.aj;
                v13 = il.ad + v2;
                il.ad = v13;
                v11[v13 * v3 - 1] = v9;
            }
            else {
                v13_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v13_2[v0 * v3 - 1] = v11_6.ap * 0x6FB9813D;
            }

            return 1;
        }

        if(6697 == arg11) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = jc.az.ax * 1401097027;
            return 1;
        }

        if(arg11 == 6698) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = jc.az.al.ax(0x13E1142B);
            return 1;
        }

        if(arg11 == 6699) {
            v11 = il.aj;
            v13 = il.ad + v2;
            il.ad = v13;
            v11[v13 * v3 - 1] = jc.az.ae.ax(0x409C819D);
            return 1;
        }

        return 2;
    }

    static int ep(int arg7, hl arg8, boolean arg9) {
        da v7_6;
        cg v7_5;
        boolean v3_1;
        pb v7_4;
        dh v9_3;
        af v7_3;
        int[] v9_2;
        String[] v7_2;
        dh v7_1;
        int v9;
        int[] v7;
        if(0xF9B940DE == arg7) {
            dl.ab(-734043067).ai(kt.jz * 1700733305, ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7), nr.fo * 0x519F9BE7 + (gu.jg.bw * 0x342A05C0 >> 7), true, 0x600);
            return 1;
        }

        int v0 = 0xBC5CDEAD;
        int v1 = 1304812425;
        if(arg7 == 145263075) {
            v7 = il.aj;
            v9 = il.ad + 0x7E745840;
            il.ad = v9;
            arg7 = v7[v9 * v1];
            String v9_1 = "";
            v7_1 = dl.ab(0x2F99D7CE).bn(arg7, -307417760);
            if(v7_1 != null) {
                v9_1 = v7_1.am(0x8914F368);
            }

            v7_2 = il.aq;
            v1 = ft.ab - 0x32107C3D;
            ft.ab = v1;
            v7_2[v1 * v0 - 1] = v9_1;
            return 1;
        }

        int v2 = 0x4A90AB9;
        if(0xAFFAB0A3 == arg7) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            dl.ab(0x98FA002B).av(v7[v9 * v1], 27);
            return 1;
        }

        if(6603 == arg7) {
            v7 = il.aj;
            v9 = il.ad - 0x60222CED;
            il.ad = v9;
            v7[v9 * v1 - 1] = dl.ab(0x4DA65F2B).bd(6);
            return 1;
        }

        if(0x4293895D == arg7) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            dl.ab(0x64B6F5EA).as(v7[v9 * v1], 0xF5FD0CB7);
            return 1;
        }

        int v3 = 0;
        if(6605 == arg7) {
            v7 = il.aj;
            v9 = il.ad + v2;
            il.ad = v9;
            v9 = v9 * v1 - 1;
            if(dl.ab(0xB1882098).bf(-708546286)) {
                v3 = 1;
            }

            v7[v9] = v3;
            return 1;
        }

        if(arg7 == 6606) {
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * 0xCD276AA0]);
            dl.ab(0xE39C3D67).bp(v7_3.al * 0x784D0FEC, v7_3.ae * 0x4F19E1EB, 0xE95DC9A8);
            return 1;
        }

        int v4 = 0xB230B0A5;
        int v5 = 0xAEACF223;
        if(arg7 == 0x51D0898F) {
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * 0x2F6B127C]);
            dl.ab(-262229030).bw(v7_3.al * v5, v7_3.ae * v4, 1);
            return 1;
        }

        if(0xFE2FC4D8 == arg7) {
            v9_2 = il.aj;
            v0 = il.ad - 0x6FA93826;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * 0x5EF60E2E]);
            dl.ab(0xC79AC67C).bo(v7_3.ax * 0xE80F3AD2, v7_3.al * v5, v7_3.ae * 1185749902, 0xC6CE3B59);
            return 1;
        }

        if(arg7 == 459967590) {
            v9_2 = il.aj;
            v0 = il.ad - 0x5815BBF8;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * 29106841]);
            dl.ab(0x2D18F633).by(v7_3.ax * 0x873AD041, v7_3.al * v5, v7_3.ae * v4, -2054627613);
            return 1;
        }

        if(6610 == arg7) {
            v7 = il.aj;
            v9 = il.ad + v2;
            il.ad = v9;
            v7[v9 * v1 - 1] = dl.ab(-130161851).bt(0x31D665C7);
            v7 = il.aj;
            v9 = il.ad - 1405618080;
            il.ad = v9;
            v7[v9 * 0x6C4B27EB - 1] = dl.ab(-324090575).bv(2089368123);
            return 1;
        }

        if(arg7 == 6611) {
            v7 = il.aj;
            v9 = il.ad - 0x4A9DA0B7;
            il.ad = v9;
            v7_1 = dl.ab(765790072).bn(v7[v9 * v1], 0xA430B08F);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad + 1007043530;
                il.ad = v9;
                v7[v9 * v1 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * 0x8D0C3602 - 1] = v7_1.ac(287427031).ax(0xCF076AD9);
            }

            return 1;
        }

        int v6 = 0x999D058;
        if(arg7 == 6612) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            v7_1 = dl.ab(0x66099681).bn(v7[v9 * 0xB9EFFC05], 0xCD840D17);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * v1 - 1] = 0;
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * 0xBC463386 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = (v7_1.at(-2068450386) - v7_1.ah(v6) + 1) * 0x40;
                v9_2 = il.aj;
                v0 = il.ad - 0x3443F87A;
                il.ad = v0;
                v9_2[v0 * 0x551A26BE - 1] = (v7_1.aw(-2040893219) - v7_1.ay(0x80C1D453) + 1) * 0xE8017D7B;
            }

            return 1;
        }

        if(6613 == arg7) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            v7_1 = dl.ab(-86496084).bn(v7[v9 * 0xD0D99A4E], 0xE57DD0DD);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad - 0x54A9691F;
                il.ad = v9;
                v7[v9 * v1 - 1] = 0;
                v7 = il.aj;
                v9 = il.ad - 0x6EF5B6C5;
                il.ad = v9;
                v7[v9 * v1 - 1] = 0;
                v7 = il.aj;
                v9 = il.ad + 0x5F8721DB;
                il.ad = v9;
                v7[v9 * 0x8F6C1F5D - 1] = 0;
                v7 = il.aj;
                v9 = il.ad - 0x11FDCDA8;
                il.ad = v9;
                v7[v9 * v1 - 1] = 0;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + 0x27D445F5;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_1.ah(v6) * 0x40;
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_1.ay(0x818D2CDA) * 172700545;
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * 0x96FC74F3 - 1] = v7_1.at(0xD8210B36) * 0x40 - 0x2CB66008 - 1;
                v9_2 = il.aj;
                v0 = il.ad + 0x3138E73D;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_1.aw(-2017966782) * 0x40 + 0x20EA96AA - 1;
            }

            return 1;
        }

        v6 = -1;
        if(arg7 == 6614) {
            v7 = il.aj;
            v9 = il.ad + 0x768A2F5C;
            il.ad = v9;
            v7_1 = dl.ab(0xE88CBCBB).bn(v7[v9 * 973382700], 0xC045E32B);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad - 0x1F9DA8E;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * 0x4F16EEC9 - 1] = v7_1.ag(0xD54EB40F);
            }

            return 1;
        }

        if(1152060564 == arg7) {
            v7_3 = dl.ab(0x3C5C2BAF).bq(-1746520353);
            if(v7_3 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * 0x952D42AA - 1] = v6;
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_3.al * v5;
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_3.ae * -1567530305;
            }

            return 1;
        }

        if(6616 == arg7) {
            v7 = il.aj;
            v9 = il.ad - 0x55C9D194;
            il.ad = v9;
            v7[v9 * -2085960412 - 1] = dl.ab(0xC06B2935).aa(120);
            return 1;
        }

        if(arg7 == 0x1EA8A5E6) {
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * v1]);
            v9_3 = dl.ab(0x6F15AD1).au(0x352541C4);
            if(v9_3 == null) {
                v7 = il.aj;
                v9 = il.ad + 1782920660;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
                v7 = il.aj;
                v9 = il.ad - 1954470964;
                il.ad = v9;
                v7[v9 * 776543049 - 1] = v6;
                return 1;
            }

            v7 = v9_3.ab(v7_3.ax * 400591065, v7_3.al * v5, v7_3.ae * 0x4BA57825, 4339540);
            if(v7 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * 0x75A62069 - 1] = v6;
                v7 = il.aj;
                v9 = il.ad + 0x41EFA608;
                il.ad = v9;
                v7[v9 * -1864050198 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + 0x68144C80;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7[0];
                v9_2 = il.aj;
                v0 = il.ad - 0x4666A574;
                il.ad = v0;
                v9_2[v0 * 0xC86100EC - 1] = v7[1];
            }

            return 1;
        }

        if(0xFBBCBB6 == arg7) {
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * v1]);
            v9_3 = dl.ab(0x33057AD1).au(0x35A0E76D);
            if(v9_3 == null) {
                v7 = il.aj;
                v9 = il.ad + 0x136CBB19;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
                v7 = il.aj;
                v9 = il.ad + 424093144;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
                return 1;
            }

            v7_3 = v9_3.af(v7_3.al * 0x5287C064, v7_3.ae * v4, 0x60E89488);
            if(v7_3 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + 1440868204;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_3.ax(-2088082236);
            }

            return 1;
        }

        v4 = 0x9521572;
        if(-910523700 == arg7) {
            il.ad -= v4;
            bv.bh(il.aj[il.ad * -1724459058], new af(il.aj[il.ad * 0x850B365B + 1]), false, 0x9C33838D);
            return 1;
        }

        if(0x2BB07EFC == arg7) {
            il.ad -= v4;
            bv.bh(il.aj[il.ad * 1684727400], new af(il.aj[il.ad * 0xA315DA3D + 1]), true, 0x4933D9FC);
            return 1;
        }

        if(arg7 == 6621) {
            il.ad -= v4;
            arg7 = il.aj[il.ad * 1387148500];
            af v9_4 = new af(il.aj[il.ad * -171338290 + 1]);
            v7_1 = dl.ab(0xA4BBC13D).bn(arg7, 0xCAC84EEA);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * 0x32533527 - 1] = 0;
                return 1;
            }

            int[] v0_1 = il.aj;
            v4 = il.ad + v2;
            il.ad = v4;
            v4 = v4 * v1 - 1;
            if(v7_1.ad(v9_4.ax * 0x33370421, v9_4.al * 0x8E0B9E77, v9_4.ae * 0x4D056940, -2)) {
                v3 = 1;
            }

            v0_1[v4] = v3;
            return 1;
        }

        if(6622 == arg7) {
            v7 = il.aj;
            v9 = il.ad + v2;
            il.ad = v9;
            v7[v9 * 0x6456869E - 1] = dl.ab(1684548049).bx(0x7650362C);
            v7 = il.aj;
            v9 = il.ad + 1100287087;
            il.ad = v9;
            v7[v9 * 0x5068B6AD - 1] = dl.ab(1371090748).bg(895909220);
            return 1;
        }

        if(arg7 == 0x3431F147) {
            v9_2 = il.aj;
            v0 = il.ad + 1607069117;
            il.ad = v0;
            v7_3 = new af(v9_2[v0 * v1]);
            v7_1 = dl.ab(0x9EAEA0A0).af(v7_3.ax * 0x607548E5, v7_3.al * v5, v7_3.ae * 1034333723, 5);
            if(v7_1 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * 53800471 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + 70595605;
                il.ad = v0;
                v9_2[v0 * 0x194FBF1C - 1] = v7_1.av(-1880437085);
            }

            return 1;
        }

        if(-1707313226 == arg7) {
            v7_4 = dl.ab(0xF05E8B91);
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_4.bz(v9_2[v0 * 0xFB230AC], -72);
            return 1;
        }

        if(arg7 == 6625) {
            dl.ab(-913501785).bh(0x992EC33D);
            return 1;
        }

        if(arg7 == 491611049) {
            v7_4 = dl.ab(-512055870);
            v9_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v7_4.bb(v9_2[v0 * 0x96EFE1E0], 0x675863AB);
            return 1;
        }

        if(0x614EC013 == arg7) {
            dl.ab(0xF08FDA20).bc(-179495970);
            return 1;
        }

        if(6628 == arg7) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            if(v7[v9 * 0x7680E506] == 1) {
                v3_1 = true;
            }

            dl.ab(-602808981).bk(((boolean)v3), 0xC34);
            return 1;
        }

        if(arg7 == 0x8AD26F51) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            dl.ab(0x5EBC41DC).bm(v7[v9 * v1], 0x1F);
            return 1;
        }

        if(0xC89D24E7 == arg7) {
            v7 = il.aj;
            v9 = il.ad + 0x3276AF97;
            il.ad = v9;
            dl.ab(0xB7CAEE8B).bj(v7[v9 * v1], 15);
            return 1;
        }

        if(arg7 == 0x84DCFC37) {
            dl.ab(-1020565476).bu(400872117);
            return 1;
        }

        if(arg7 == 95306886) {
            v7 = il.aj;
            v9 = il.ad + 0x7FFA410B;
            il.ad = v9;
            if(v7[v9 * -448148027] == 1) {
                v3_1 = true;
            }

            dl.ab(-1950731560).bs(((boolean)v3), 0x65350F59);
            return 1;
        }

        if(6633 == arg7) {
            il.ad -= v4;
            arg7 = il.aj[il.ad * v1];
            if(1 == il.aj[il.ad * -1533701228 + 1]) {
                v3_1 = true;
            }

            dl.ab(0x80F52D5F).be(arg7, ((boolean)v3), 3);
            return 1;
        }

        if(arg7 == 6634) {
            il.ad -= v4;
            arg7 = il.aj[il.ad * v1];
            if(il.aj[il.ad * v1 + 1] == 1) {
                v3_1 = true;
            }

            dl.ab(0x90DDA80D).bl(arg7, ((boolean)v3), 0x5D02FB7B);
            return 1;
        }

        if(6635 == arg7) {
            v7 = il.aj;
            v9 = il.ad + v2;
            il.ad = v9;
            v9 = v9 * 0x2804641B - 1;
            if(dl.ab(0xA4DEA2F).br(0xA567443D)) {
                v3 = 1;
            }

            v7[v9] = v3;
            return 1;
        }

        if(arg7 == 6636) {
            v7 = il.aj;
            v9 = il.ad + 0x4F60EC24;
            il.ad = v9;
            arg7 = v7[v9 * v1];
            v9_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v0 = v0 * 0xBEF362CF - 1;
            if(dl.ab(2020674360).bi(arg7, 1)) {
                v3 = 1;
            }

            v9_2[v0] = v3;
            return 1;
        }

        if(arg7 == 6637) {
            v7 = il.aj;
            v9 = il.ad - 0x3665F45D;
            il.ad = v9;
            arg7 = v7[v9 * v1];
            v9_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v0 = v0 * 0xFBB92B71 - 1;
            if(dl.ab(0x1016C2F5).ca(arg7, -85)) {
                v3 = 1;
            }

            v9_2[v0] = v3;
            return 1;
        }

        if(arg7 == 0x8A1E3248) {
            il.ad -= v4;
            v7_3 = dl.ab(0x3F66590D).cf(il.aj[il.ad * 0x2142355D], new af(il.aj[il.ad * 0x205B877 + 1]), -120);
            if(v7_3 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad - 0x17284868;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_3.ax(-22670172);
            }

            return 1;
        }

        if(0x9C81E4F5 == arg7) {
            v7_5 = dl.ab(1364027588).cb(0x4ABAA376);
            if(v7_5 == null) {
                v7 = il.aj;
                v9 = il.ad + 0x72ADACF2;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
                v7 = il.aj;
                v9 = il.ad + 2005275189;
                il.ad = v9;
                v7[v9 * 1682509207 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad - 0x641A6DAF;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_5.al(-57);
                v9_2 = il.aj;
                v0 = il.ad - 620519750;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_5.ax.ax(-7087181);
            }

            return 1;
        }

        if(arg7 == 0x19F0) {
            v7_5 = dl.ab(0x2EC40337).cy(0x8994BF35);
            if(v7_5 == null) {
                v7 = il.aj;
                v9 = il.ad + 0x562E2C10;
                il.ad = v9;
                v7[v9 * 0xBB0A1156 - 1] = v6;
                v7 = il.aj;
                v9 = il.ad + 0x318EFE7B;
                il.ad = v9;
                v7[v9 * -476230612 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * 0xDBCFCC4E - 1] = v7_5.al(-49);
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * 0x748C929F - 1] = v7_5.ax.ax(0xFA916330);
            }

            return 1;
        }

        byte v3_2 = 16;
        if(0xCCA03CD1 == arg7) {
            v7 = il.aj;
            v9 = il.ad - v2;
            il.ad = v9;
            v7_6 = ae.al(v7[v9 * 0x55C360C3], v3_2);
            v1 = 0x8FA23525;
            if(v7_6.ad == null) {
                v7_2 = il.aq;
                v9 = ft.ab + v1;
                ft.ab = v9;
                v7_2[v9 * v0 - 1] = "";
            }
            else {
                String[] v9_5 = il.aq;
                v2 = ft.ab + v1;
                ft.ab = v2;
                v9_5[v2 * v0 - 1] = v7_6.ad;
            }

            return 1;
        }

        if(arg7 == 6694) {
            v7 = il.aj;
            v9 = il.ad + 306555410;
            il.ad = v9;
            v7_6 = ae.al(v7[v9 * 1070438187], v3_2);
            v9_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v9_2[v0 * 708949520 - 1] = v7_6.ab * 0xD6D0BF01;
            return 1;
        }

        if(arg7 == 6695) {
            v7 = il.aj;
            v9 = il.ad + 0x493453FE;
            il.ad = v9;
            v7_6 = ae.al(v7[v9 * 0x3666C04C], v3_2);
            if(v7_6 == null) {
                v7 = il.aj;
                v9 = il.ad + 368700317;
                il.ad = v9;
                v7[v9 * 0x7671E732 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v9_2[v0 * v1 - 1] = v7_6.ao * 1706408465;
            }

            return 1;
        }

        if(6696 == arg7) {
            v7 = il.aj;
            v9 = il.ad - 0x7FC60BF6;
            il.ad = v9;
            v7_6 = ae.al(v7[v9 * v1], v3_2);
            if(v7_6 == null) {
                v7 = il.aj;
                v9 = il.ad + v2;
                il.ad = v9;
                v7[v9 * v1 - 1] = v6;
            }
            else {
                v9_2 = il.aj;
                v0 = il.ad + 0x723D9575;
                il.ad = v0;
                v9_2[v0 * 0xDD50C3C4 - 1] = v7_6.ap * 0x6FB9813D;
            }

            return 1;
        }

        if(6697 == arg7) {
            v7 = il.aj;
            v9 = il.ad + 0x7FC32CDF;
            il.ad = v9;
            v7[v9 * 0x60DF0C1E - 1] = jc.az.ax * 1401097027;
            return 1;
        }

        if(arg7 == 0x4007F8B5) {
            v7 = il.aj;
            v9 = il.ad - 0x505A9DB8;
            il.ad = v9;
            v7[v9 * 1629709173 - 1] = jc.az.al.ax(0x489F909D);
            return 1;
        }

        if(arg7 == 444031601) {
            v7 = il.aj;
            v9 = il.ad + v2;
            il.ad = v9;
            v7[v9 * 0x3DE05C8 - 1] = jc.az.ae.ax(0xB5CC11B9);
            return 1;
        }

        return 2;
    }

    static int eq(int arg4, hl arg5, boolean arg6) {
        int v2;
        int[] v4;
        int v5 = 0xE2F5F8C2;
        int v6 = 1304812425;
        int v0 = 0x4A90AB9;
        if(5306 == arg4) {
            v4 = il.aj;
            v2 = il.ad + v0;
            il.ad = v2;
            v4[v2 * v6 - 1] = fh.ct(v5);
            return 1;
        }

        int v3 = 2;
        if(5307 == arg4) {
            v4 = il.aj;
            v5 = il.ad - v0;
            il.ad = v5;
            arg4 = v4[v5 * v6];
            if(1 == arg4 || v3 == arg4) {
                bk.cq(arg4, 2015744328);
            }

            return 1;
        }

        if(arg4 == 5308) {
            v4 = il.aj;
            v5 = il.ad + v0;
            il.ad = v5;
            v4[v5 * v6 - 1] = li.rg.an * 0x3CA82057;
            return 1;
        }

        if(arg4 == 5309) {
            v4 = il.aj;
            v5 = il.ad - v0;
            il.ad = v5;
            arg4 = v4[v5 * v6];
            if(arg4 == 1 || arg4 == v3) {
                li.rg.an = arg4 * -986002585;
                fr.an(0xF7F84AE);
            }

            return 1;
        }

        if(5310 == arg4) {
            v4 = il.aj;
            v2 = il.ad - v0;
            il.ad = v2;
            client.os = Math.max((((float)v4[v2 * v6])) / 1000f, 1.77778f);
            client.al.cu(fh.ct(v5), -2037494076);
            return 1;
        }

        return v3;
    }

    static int er(int arg4, hl arg5, boolean arg6) {
        int v1;
        int[] v4;
        int v5 = 0xE2F5F8C2;
        int v6 = 0x4A90AB9;
        if(5306 == arg4) {
            v4 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v4[v1 * 0x4E40CCC4 - 1] = fh.ct(v5);
            return 1;
        }

        int v2 = 1304812425;
        int v3 = 2;
        if(5307 == arg4) {
            v4 = il.aj;
            v5 = il.ad - v6;
            il.ad = v5;
            arg4 = v4[v5 * v2];
            if(1 == arg4 || v3 == arg4) {
                bk.cq(arg4, 2015744328);
            }

            return 1;
        }

        if(arg4 == 0x800A5802) {
            v4 = il.aj;
            v5 = il.ad + 0x209E9630;
            il.ad = v5;
            v4[v5 * 0x8342AC60 - 1] = li.rg.an * 0x3CA82057;
            return 1;
        }

        if(arg4 == 5309) {
            v4 = il.aj;
            v5 = il.ad + 0x720341C8;
            il.ad = v5;
            arg4 = v4[v5 * 0xB5D85096];
            if(arg4 == 1 || arg4 == v3) {
                li.rg.an = arg4 * -986002585;
                fr.an(0x128B55A9);
            }

            return 1;
        }

        if(-650872636 == arg4) {
            v4 = il.aj;
            v1 = il.ad - v6;
            il.ad = v1;
            client.os = Math.max((((float)v4[v1 * v2])) / 1000f, 1.77778f);
            client.al.cu(fh.ct(v5), -131222052);
            return 1;
        }

        return v3;
    }

    static int es(int arg9, hl arg10, boolean arg11) {
        int[] v9;
        int v10 = 0x9521572;
        short v11 = 0x100;
        int v0 = 1304812425;
        if(arg9 == 6200) {
            il.ad -= v10;
            client.qi = ((short)ha.bt(il.aj[il.ad * v0], 0x7F89B38C));
            if(client.qi <= 0) {
                client.qi = v11;
            }

            client.qe = ((short)ha.bt(il.aj[il.ad * v0 + 1], 0x7F89E6D0));
            if(client.qe <= 0) {
                client.qe = v11;
            }

            return 1;
        }

        if(6201 == arg9) {
            il.ad -= v10;
            client.qx = ((short)il.aj[il.ad * v0]);
            if(client.qx <= 0) {
                client.qx = v11;
            }

            client.qf = ((short)il.aj[il.ad * v0 + 1]);
            if(client.qf <= 0) {
                client.qf = 320;
            }

            return 1;
        }

        byte v11_1 = 2;
        if(6202 == arg9) {
            il.ad -= 0x12A42AE4;
            client.qp = ((short)il.aj[il.ad * v0]);
            if(client.qp <= 0) {
                client.qp = 1;
            }

            client.qw = ((short)il.aj[il.ad * v0 + 1]);
            short v10_1 = 0x7FFF;
            if(client.qw <= 0) {
                client.qw = v10_1;
            }
            else if(client.qw < client.qp) {
                client.qw = client.qp;
            }

            client.qm = ((short)il.aj[il.ad * v0 + v11_1]);
            if(client.qm <= 0) {
                client.qm = 1;
            }

            client.qu = ((short)il.aj[il.ad * v0 + 3]);
            if(client.qu <= 0) {
                client.qu = v10_1;
            }
            else if(client.qu < client.qm) {
                client.qu = client.qm;
            }

            return 1;
        }

        int v2 = 0x4A90AB9;
        if(6203 == arg9) {
            if(client.lt != null) {
                ao.db(0, 0, client.lt.by * 0x1804E4A5, client.lt.bt * 0x6F0D2CD, false, 0x45AB);
                v9 = il.aj;
                v10 = il.ad + v2;
                il.ad = v10;
                v9[v10 * v0 - 1] = client.ql * 0xDCCE0B33;
                v9 = il.aj;
                v10 = il.ad + v2;
                il.ad = v10;
                v9[v10 * v0 - 1] = client.qj * 927018595;
            }
            else {
                v9 = il.aj;
                v10 = il.ad + v2;
                il.ad = v10;
                v9[v10 * v0 - 1] = -1;
                v9 = il.aj;
                v10 = il.ad + v2;
                il.ad = v10;
                v9[v10 * v0 - 1] = -1;
            }

            return 1;
        }

        if(6204 == arg9) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.qx;
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.qf;
            return 1;
        }

        if(6205 == arg9) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = is.bv(client.qi, -2099817805);
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = is.bv(client.qe, 0xAA0027D7);
            return 1;
        }

        if(arg9 == 6220) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.al.adm(0x37C9937E).aq(0xBB09A696);
            return 1;
        }

        if(arg9 == 6221) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.al.adm(1673803641).ab(0x4226A908);
            return 1;
        }

        if(arg9 == 6222) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.al.adm(908737602).af(0xBB230BAE);
            return 1;
        }

        if(0x184F == arg9) {
            v9 = il.aj;
            v10 = il.ad + v2;
            il.ad = v10;
            v9[v10 * v0 - 1] = client.al.adm(1454271079).ai(v11_1);
            return 1;
        }

        return v11_1;
    }

    static int et(int arg8, hl arg9, boolean arg10) {
        da v8_6;
        cg v8_5;
        boolean v2_1;
        pb v8_4;
        dh v10_3;
        af v8_3;
        int[] v10_2;
        String[] v8_2;
        dh v8_1;
        int v10;
        int[] v8;
        if(0x87D309D3 == arg8) {
            dl.ab(1363692078).ai(kt.jz * 1101813865, ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7), nr.fo * 0x8D80F4D5 + (gu.jg.bw * 0xD19D0C3D >> 7), true, 0x600);
            return 1;
        }

        int v0 = 0x4A90AB9;
        int v1 = 1304812425;
        if(arg8 == 0xE63A2D98) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            arg8 = v8[v10 * v1];
            String v10_1 = "";
            v8_1 = dl.ab(0xFFEC06ED).bn(arg8, -204543290);
            if(v8_1 != null) {
                v10_1 = v8_1.am(0x88D413A7);
            }

            v8_2 = il.aq;
            v0 = ft.ab + 0x21351B2E;
            ft.ab = v0;
            v8_2[v0 * 0xBC5CDEAD - 1] = v10_1;
            return 1;
        }

        if(0x7E493DCE == arg8) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            dl.ab(0xAEE2FFB7).av(v8[v10 * v1], 19);
            return 1;
        }

        if(6603 == arg8) {
            v8 = il.aj;
            v10 = il.ad - 1290616604;
            il.ad = v10;
            v8[v10 * v1 - 1] = dl.ab(0xA487027B).bd(0x7E);
            return 1;
        }

        if(6604 == arg8) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            dl.ab(-615670365).as(v8[v10 * v1], 0xF5FD0CB7);
            return 1;
        }

        int v2 = 0;
        if(6605 == arg8) {
            v8 = il.aj;
            v10 = il.ad + v0;
            il.ad = v10;
            v10 = v10 * 0x3843FE9 - 1;
            if(dl.ab(0x168113AE).bf(0x2DCBAAF9)) {
                v2 = 1;
            }

            v8[v10] = v2;
            return 1;
        }

        int v3 = 0xB230B0A5;
        if(arg8 == 0x94F5629B) {
            v10_2 = il.aj;
            v2 = il.ad - v0;
            il.ad = v2;
            v8_3 = new af(v10_2[v2 * v1]);
            dl.ab(0x506362).bp(v8_3.al * 0x6F89F8B4, v8_3.ae * v3, 0xE39D2FA);
            return 1;
        }

        if(arg8 == 6607) {
            v10_2 = il.aj;
            v0 = il.ad - 1730482638;
            il.ad = v0;
            v8_3 = new af(v10_2[v0 * -2109704998]);
            dl.ab(0x4AE488AF).bw(v8_3.al * 0xC1FAB6C0, v8_3.ae * 0x3A9E9B09, 1);
            return 1;
        }

        int v4 = 400591065;
        int v5 = 0xAEACF223;
        if(6608 == arg8) {
            v10_2 = il.aj;
            v1 = il.ad - v0;
            il.ad = v1;
            v8_3 = new af(v10_2[v1 * 0xBF087EE6]);
            dl.ab(374409068).bo(v8_3.ax * v4, v8_3.al * v5, v8_3.ae * v3, 0xEC13D402);
            return 1;
        }

        if(arg8 == 0x1EE9808E) {
            v10_2 = il.aj;
            v0 = il.ad + 0x7BF3F059;
            il.ad = v0;
            v8_3 = new af(v10_2[v0 * -1017026452]);
            dl.ab(0xE4D805FE).by(v8_3.ax * 1408309431, v8_3.al * v5, v8_3.ae * v3, 0xD0937A4A);
            return 1;
        }

        if(6610 == arg8) {
            v8 = il.aj;
            v10 = il.ad + 1584162007;
            il.ad = v10;
            v8[v10 * 810254051 - 1] = dl.ab(0xBE93FB1A).bt(0x31D665C7);
            v8 = il.aj;
            v10 = il.ad + 0x6EA66A38;
            il.ad = v10;
            v8[v10 * v1 - 1] = dl.ab(0xF50976BE).bv(1529098787);
            return 1;
        }

        if(arg8 == 6611) {
            v8 = il.aj;
            v10 = il.ad + 0x65209199;
            il.ad = v10;
            v8_1 = dl.ab(1367087986).bn(v8[v10 * 0xA5FFDAF], 0xDAED6804);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad - 0x4FCE7246;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
            }
            else {
                v10_2 = il.aj;
                v0 = il.ad - 0x5370F279;
                il.ad = v0;
                v10_2[v0 * 0x58637201 - 1] = v8_1.ac(287427031).ax(0xB3353EE0);
            }

            return 1;
        }

        int v6 = 0x999D058;
        if(arg8 == 0x4DCDCF5D) {
            v8 = il.aj;
            v10 = il.ad + 0x2C44226C;
            il.ad = v10;
            v8_1 = dl.ab(0xDCB5B20A).bn(v8[v10 * v1], -950541704);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad + 0x7046F81E;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
            }
            else {
                v10_2 = il.aj;
                v0 = il.ad + 0xD43E9FE;
                il.ad = v0;
                v10_2[v0 * 0xBBF647A4 - 1] = (v8_1.at(0x9F039E16) - v8_1.ah(v6) + 1) * 0x40;
                v10_2 = il.aj;
                v0 = il.ad + 0x52EA0702;
                il.ad = v0;
                v10_2[v0 * v1 - 1] = (v8_1.aw(0x84F44371) - v8_1.ay(0x82FCAF7C) + 1) * 0x40;
            }

            return 1;
        }

        if(6613 == arg8) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            v8_1 = dl.ab(-2027774220).bn(v8[v10 * v1], 0xE028FDE1);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * 508666839 - 1] = 0;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = 0;
            }
            else {
                v10_2 = il.aj;
                v2 = il.ad + 1502300325;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_1.ah(v6) * 0x40;
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_1.ay(-2110820953) * 0x40;
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * 0xCE6F82B0 - 1] = v8_1.at(768985540) * 0x40 + 0x40 - 1;
                v10_2 = il.aj;
                v0 = il.ad + 0x530C4D87;
                il.ad = v0;
                v10_2[v0 * v1 - 1] = v8_1.aw(0x872FB78C) * 0x40 + 0x40 - 1;
            }

            return 1;
        }

        v6 = -1;
        if(arg8 == 6614) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            v8_1 = dl.ab(-784128706).bn(v8[v10 * v1], 0x94FC7B2B);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * 0xD919ED1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v1 = il.ad + v0;
                il.ad = v1;
                v10_2[v1 * 0xC5BD8B30 - 1] = v8_1.ag(0xD54EB40F);
            }

            return 1;
        }

        if(6615 == arg8) {
            v8_3 = dl.ab(0x9A6E1070).bq(-650654490);
            if(v8_3 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad - 824306758;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v2 = il.ad - 0x50B93A33;
                il.ad = v2;
                v10_2[v2 * 0x3B907429 - 1] = v8_3.al * 0x75A35008;
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_3.ae * 0x24D83864;
            }

            return 1;
        }

        if(-1134925850 == arg8) {
            v8 = il.aj;
            v10 = il.ad + v0;
            il.ad = v10;
            v8[v10 * 689532220 - 1] = dl.ab(0x747AD350).aa(84);
            return 1;
        }

        if(arg8 == -162700416) {
            v10_2 = il.aj;
            v3 = il.ad + 1809073636;
            il.ad = v3;
            v8_3 = new af(v10_2[v3 * v1]);
            v10_3 = dl.ab(0xF06C26D0).au(0x6C06751D);
            if(v10_3 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad + 0x44D3EA5;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                return 1;
            }

            v8 = v10_3.ab(v8_3.ax * 0x119C8E17, v8_3.al * 0xA49F0C0D, v8_3.ae * -1484157240, -2010512405);
            if(v8 == null) {
                v8 = il.aj;
                v10 = il.ad - 0x5E2F21F5;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad - 0x46F892CF;
                il.ad = v10;
                v8[v10 * -1424606635 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v3 = il.ad + v0;
                il.ad = v3;
                v10_2[v3 * v1 - 1] = v8[0];
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8[1];
            }

            return 1;
        }

        if(0xCF3C251F == arg8) {
            v10_2 = il.aj;
            v2 = il.ad - v0;
            il.ad = v2;
            v8_3 = new af(v10_2[v2 * v1]);
            v10_3 = dl.ab(0x28CFF918).au(1490690380);
            if(v10_3 == null) {
                v8 = il.aj;
                v10 = il.ad + 0xF01D63F;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                return 1;
            }

            v8_3 = v10_3.af(v8_3.al * v5, v8_3.ae * v3, 0x2C7F46F9);
            if(v8_3 == null) {
                v8 = il.aj;
                v10 = il.ad - 0xDAFA585;
                il.ad = v10;
                v8[v10 * 0x98E74A3F - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v0 = il.ad + 0x1398A627;
                il.ad = v0;
                v10_2[v0 * v1 - 1] = v8_3.ax(0xCACA383C);
            }

            return 1;
        }

        int v7 = 0x9521572;
        if(6619 == arg8) {
            il.ad -= v7;
            bv.bh(il.aj[il.ad * 0x455051DC], new af(il.aj[il.ad * v1 + 1]), false, 287475052);
            return 1;
        }

        if(0xF1AE30AF == arg8) {
            il.ad -= 0x6EB573CB;
            bv.bh(il.aj[il.ad * v1], new af(il.aj[il.ad * 1085936920 + 1]), true, -2010892215);
            return 1;
        }

        if(arg8 == 6621) {
            il.ad -= 0xD3020B43;
            arg8 = il.aj[il.ad * v1];
            af v10_4 = new af(il.aj[il.ad * v1 + 1]);
            v8_1 = dl.ab(0x541F49F0).bn(arg8, 0x8B665D81);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * -774146903 - 1] = 0;
                return 1;
            }

            int[] v6_1 = il.aj;
            v7 = il.ad + v0;
            il.ad = v7;
            v7 = v7 * v1 - 1;
            if(v8_1.ad(v10_4.ax * v4, v10_4.al * v5, v10_4.ae * v3, -28)) {
                v2 = 1;
            }

            v6_1[v7] = v2;
            return 1;
        }

        if(0x8DA5FB51 == arg8) {
            v8 = il.aj;
            v10 = il.ad + 1370572150;
            il.ad = v10;
            v8[v10 * v1 - 1] = dl.ab(0xADDBA6A1).bx(2035909894);
            v8 = il.aj;
            v10 = il.ad - 0x64F16A08;
            il.ad = v10;
            v8[v10 * 0x9C2B6931 - 1] = dl.ab(0xB72D9463).bg(1249989095);
            return 1;
        }

        if(arg8 == 0xD95A00E6) {
            v10_2 = il.aj;
            v2 = il.ad - v0;
            il.ad = v2;
            v8_3 = new af(v10_2[v2 * 0x5DFEB220]);
            v8_1 = dl.ab(-331965057).af(v8_3.ax * v4, v8_3.al * 0xDBEFFA4, v8_3.ae * v3, 91);
            if(v8_1 == null) {
                v8 = il.aj;
                v10 = il.ad - 1389607010;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v1 = il.ad + v0;
                il.ad = v1;
                v10_2[v1 * 0x2D0303D0 - 1] = v8_1.av(-1880437085);
            }

            return 1;
        }

        if(1803359794 == arg8) {
            v8_4 = dl.ab(0xEEEC224D);
            v10_2 = il.aj;
            v0 = il.ad + 0xDD2B7BF;
            il.ad = v0;
            v8_4.bz(v10_2[v0 * v1], -5);
            return 1;
        }

        if(arg8 == -47709064) {
            dl.ab(-1104100327).bh(0x977BD07C);
            return 1;
        }

        if(arg8 == 6626) {
            v8_4 = dl.ab(0xB01E7D2E);
            v10_2 = il.aj;
            v0 = il.ad + 0x2FDBC6F9;
            il.ad = v0;
            v8_4.bb(v10_2[v0 * v1], 0xFC6FCDAB);
            return 1;
        }

        if(0x2C3C4701 == arg8) {
            dl.ab(0x598A7DFD).bc(0x44F8D790);
            return 1;
        }

        if(6628 == arg8) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            if(v8[v10 * v1] == 1) {
                v2_1 = true;
            }

            dl.ab(0x876EF4B2).bk(((boolean)v2), 0xC34);
            return 1;
        }

        if(arg8 == 0x4A144C5B) {
            v8 = il.aj;
            v10 = il.ad + 0x614A8CAF;
            il.ad = v10;
            dl.ab(2051619113).bm(v8[v10 * v1], 35);
            return 1;
        }

        if(0xDF42C85B == arg8) {
            v8 = il.aj;
            v10 = il.ad + 0x25BACA40;
            il.ad = v10;
            dl.ab(0xF621B482).bj(v8[v10 * v1], 15);
            return 1;
        }

        if(arg8 == 6631) {
            dl.ab(0x95058066).bu(400872117);
            return 1;
        }

        if(arg8 == 0xEDB9F08D) {
            v8 = il.aj;
            v10 = il.ad + 1810585816;
            il.ad = v10;
            if(v8[v10 * v1] == 1) {
                v2_1 = true;
            }

            dl.ab(1053910808).bs(((boolean)v2), 0x350B282C);
            return 1;
        }

        if(0x20C06296 == arg8) {
            il.ad -= v7;
            arg8 = il.aj[il.ad * v1];
            if(1 == il.aj[il.ad * 2060107837 + 1]) {
                v2_1 = true;
            }

            dl.ab(2091246221).be(arg8, ((boolean)v2), 0x7F);
            return 1;
        }

        if(arg8 == 0x9C36A7D1) {
            il.ad -= v7;
            arg8 = il.aj[il.ad * v1];
            if(il.aj[il.ad * 0x48A15703 + 1] == 1) {
                v2_1 = true;
            }

            dl.ab(-1440664187).bl(arg8, ((boolean)v2), 0x6473A00D);
            return 1;
        }

        if(1008766503 == arg8) {
            v8 = il.aj;
            v10 = il.ad + 0x2CDD1ADD;
            il.ad = v10;
            v10 = v10 * 0x239CBF6C - 1;
            if(dl.ab(0xB15EFEE0).br(-1167044900)) {
                v2 = 1;
            }

            v8[v10] = v2;
            return 1;
        }

        if(arg8 == 6636) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            arg8 = v8[v10 * 1654850073];
            v10_2 = il.aj;
            v3 = il.ad + v0;
            il.ad = v3;
            v3 = v3 * v1 - 1;
            if(dl.ab(0xCC3CF44B).bi(arg8, 1)) {
                v2 = 1;
            }

            v10_2[v3] = v2;
            return 1;
        }

        if(arg8 == 6637) {
            v8 = il.aj;
            v10 = il.ad - 0x426E9F88;
            il.ad = v10;
            arg8 = v8[v10 * -317074962];
            v10_2 = il.aj;
            v3 = il.ad + v0;
            il.ad = v3;
            v3 = v3 * v1 - 1;
            if(dl.ab(0xF2060655).ca(arg8, -87)) {
                v2 = 1;
            }

            v10_2[v3] = v2;
            return 1;
        }

        if(arg8 == 611130147) {
            il.ad -= v7;
            v8_3 = dl.ab(381504807).cf(il.aj[il.ad * v1], new af(il.aj[il.ad * 746180216 + 1]), -119);
            if(v8_3 == null) {
                v8 = il.aj;
                v10 = il.ad - 0x6CFFED2D;
                il.ad = v10;
                v8[v10 * 0x19DCF9F - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v0 = il.ad - 471087586;
                il.ad = v0;
                v10_2[v0 * v1 - 1] = v8_3.ax(0xCC0F2ACA);
            }

            return 1;
        }

        if(0x19EF == arg8) {
            v8_5 = dl.ab(0xEA4801E5).cb(2128507062);
            if(v8_5 == null) {
                v8 = il.aj;
                v10 = il.ad + 0x25A00631;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * 0x6BCBCC09 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v2 = il.ad - 0x5760C912;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_5.al(57);
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_5.ax.ax(0x23439FFF);
            }

            return 1;
        }

        if(arg8 == 0x19F0) {
            v8_5 = dl.ab(336770533).cy(0x57D2E06D);
            if(v8_5 == null) {
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
                v8 = il.aj;
                v10 = il.ad + v0;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v10_2[v2 * v1 - 1] = v8_5.al(-125);
                v10_2 = il.aj;
                v0 = il.ad + 0x2929147;
                il.ad = v0;
                v10_2[v0 * 0x167070EF - 1] = v8_5.ax.ax(0xD9AEAACE);
            }

            return 1;
        }

        byte v2_2 = 16;
        if(0xC1893481 == arg8) {
            v8 = il.aj;
            v10 = il.ad - 1215520377;
            il.ad = v10;
            v8_6 = ae.al(v8[v10 * 0xB341196F], v2_2);
            if(v8_6.ad == null) {
                v8_2 = il.aq;
                v10 = ft.ab - 0x3E760C92;
                ft.ab = v10;
                v8_2[v10 * 0x1597148E - 1] = "";
            }
            else {
                String[] v10_5 = il.aq;
                v0 = ft.ab + 1160390784;
                ft.ab = v0;
                v10_5[v0 * -1481028882 - 1] = v8_6.ad;
            }

            return 1;
        }

        if(arg8 == 6694) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            v8_6 = ae.al(v8[v10 * v1], v2_2);
            v10_2 = il.aj;
            v1 = il.ad + v0;
            il.ad = v1;
            v10_2[v1 * 0xC7BC5698 - 1] = v8_6.ab * 0xD6D0BF01;
            return 1;
        }

        if(arg8 == 0x724F0B75) {
            v8 = il.aj;
            v10 = il.ad - v0;
            il.ad = v10;
            v8_6 = ae.al(v8[v10 * v1], v2_2);
            if(v8_6 == null) {
                v8 = il.aj;
                v10 = il.ad + 1741890278;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v0 = il.ad - 1927207028;
                il.ad = v0;
                v10_2[v0 * v1 - 1] = v8_6.ao * 0xAAEDB48B;
            }

            return 1;
        }

        if(1260817298 == arg8) {
            v8 = il.aj;
            v10 = il.ad - 0x26FF722B;
            il.ad = v10;
            v8_6 = ae.al(v8[v10 * v1], v2_2);
            if(v8_6 == null) {
                v8 = il.aj;
                v10 = il.ad + 415602105;
                il.ad = v10;
                v8[v10 * v1 - 1] = v6;
            }
            else {
                v10_2 = il.aj;
                v1 = il.ad + v0;
                il.ad = v1;
                v10_2[v1 * 624540861 - 1] = v8_6.ap * 0x6FB9813D;
            }

            return 1;
        }

        if(6697 == arg8) {
            v8 = il.aj;
            v10 = il.ad + v0;
            il.ad = v10;
            v8[v10 * 0x58254133 - 1] = jc.az.ax * 0xB8F754CA;
            return 1;
        }

        if(arg8 == 0x56EF811B) {
            v8 = il.aj;
            v10 = il.ad - 0x554D1249;
            il.ad = v10;
            v8[v10 * v1 - 1] = jc.az.al.ax(499569206);
            return 1;
        }

        if(arg8 == 6699) {
            v8 = il.aj;
            v10 = il.ad - 887936940;
            il.ad = v10;
            v8[v10 * 615067943 - 1] = jc.az.ae.ax(0x319F50F0);
            return 1;
        }

        return 2;
    }

    static int eu(int arg4) {
        return ((int)((Math.log(((double)arg4)) / il.as - 7) * 256));
    }

    static int ev(int arg4) {
        return ((int)Math.pow(2, ((double)((((float)arg4)) / 256f + 7f))));
    }

    static int ew(int arg0, hl arg1, boolean arg2) {
        if(5630 == arg0) {
            client.ei = 0xDDCA1B82;
            return 1;
        }

        return 2;
    }

    static int ex(int arg13, hl arg14, boolean arg15) {
        com.jagex.jagex3.client.input.softkeyboard.ar v13_4;
        int[] v4_1;
        String[] v15_1;
        dc v2_3;
        boolean v14_3;
        int v11;
        String[] v13_2;
        String[] v14_2;
        int[] v14_1;
        ih v13_1;
        int v2;
        int[] v13;
        int v14 = 0;
        int v15 = 0x4A90AB9;
        int v0 = 1304812425;
        if(6500 == arg13) {
            v13 = il.aj;
            v2 = il.ad + v15;
            il.ad = v2;
            v2 = v2 * v0 - 1;
            if(fl.ax(129708000)) {
                v14 = 1;
            }

            v13[v2] = v14;
            return 1;
        }

        int v3 = 0x98D051C9;
        int v4 = -479634605;
        int v5 = 0xA45F5417;
        int v6 = -1;
        int v7 = 0xBBB22DD;
        int v8 = 0xBC5CDEAD;
        int v9 = 0x8FA23525;
        if(arg13 == 6501) {
            v13_1 = ox.ad(0x160F2C5B);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        if(6502 == arg13) {
            v13_1 = ev.aq(36);
            if(v13_1 != null) {
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        int v10 = 0x6DE6A9AD;
        if(arg13 == 6506) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            ih v2_1 = null;
            v11 = 0;
            while(v11 < ih.ap * v10) {
                if(ew.an[v11].af * v7 == arg13) {
                    v2_1 = ew.an[v11];
                }
                else {
                    ++v11;
                    continue;
                }

                break;
            }

            if(v2_1 != null) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.af * v7;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.ai * v5;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.au;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.am * v4;
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = v2_1.av * v3;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = v2_1.aa;
            }
            else {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }

            return 1;
        }

        v11 = 2;
        if(arg13 == 6507) {
            il.ad -= 0x12A42AE4;
            arg13 = il.aj[il.ad * v0];
            arg15 = 1 == il.aj[il.ad * v0 + 1] ? true : false;
            v2 = il.aj[il.ad * v0 + v11];
            if(il.aj[il.ad * v0 + 3] == 1) {
                v14_3 = true;
            }

            gs.ar(arg13, arg15, v2, ((boolean)v14), -618024210);
            return 1;
        }

        if(arg13 == 0x196F) {
            v13 = il.aj;
            v2 = il.ad - v15;
            il.ad = v2;
            arg13 = v13[v2 * v0];
            if(arg13 < 0 || arg13 >= ih.ap * v10) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = v6;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v13_2[v2 * v8 - 1] = "";
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v13[v2 * v0 - 1] = 0;
                v13_2 = il.aq;
                v14 = ft.ab + v9;
                ft.ab = v14;
                v13_2[v14 * v8 - 1] = "";
            }
            else {
                v13_1 = ew.an[arg13];
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.af * v7;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.ai * v5;
                v14_2 = il.aq;
                v2 = ft.ab + v9;
                ft.ab = v2;
                v14_2[v2 * v8 - 1] = v13_1.au;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.am * v4;
                v14_1 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v14_1[v2 * v0 - 1] = v13_1.av * v3;
                v14_2 = il.aq;
                v15 = ft.ab + v9;
                ft.ab = v15;
                v14_2[v15 * v8 - 1] = v13_1.aa;
            }

            return 1;
        }

        if(0x1970 == arg13) {
            fw v13_3 = fh.kf;
            int[] v2_2 = il.aj;
            v3 = il.ad - v15;
            il.ad = v3;
            if(v2_2[v3 * v0] == 1) {
                v14_3 = true;
            }

            v13_3.cb(((boolean)v14), 756045400);
            return 1;
        }

        v3 = 1495630439;
        v4 = 0x9521572;
        if(arg13 == 6513) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 1385708641);
            if(v2_3.ap(0x9AF7AD35)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = au.al(arg13, 1).af(v14, v2_3.an, -1944995044);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = au.al(arg13, 1).ab(v14, v2_3.ar * v3, -1901248340);
            }

            return 1;
        }

        if(arg13 == 6514) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, -903629929);
            if(v2_3.ap(0x83E2CC11)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = ok.al(arg13, 0x605FACC2).aa(v14, v2_3.an, -80);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = ok.al(arg13, 0xB361C6F2).av(v14, v2_3.ar * v3, 0x7F0600DA);
            }

            return 1;
        }

        if(6515 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 0x5DBF7C05);
            if(v2_3.ap(0xE0E6AE4C)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = client.al(arg13, 0x3C52371).ah(v14, v2_3.an, -665031605);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = client.al(arg13, 0xB7DC95C).ag(v14, v2_3.ar * v3, 974005528);
            }

            return 1;
        }

        if(6516 == arg13) {
            il.ad -= v4;
            arg13 = il.aj[il.ad * v0];
            v14 = il.aj[il.ad * v0 + 1];
            v2_3 = dm.al(v14, 1820411049);
            if(v2_3.ap(0x925D5B7F)) {
                v15_1 = il.aq;
                v0 = ft.ab + v9;
                ft.ab = v0;
                v15_1[v0 * v8 - 1] = hu.al(arg13, 0xCC22A2F8).aj(v14, v2_3.an, 0xF3AA80CB);
            }
            else {
                v4_1 = il.aj;
                v5 = il.ad + v15;
                il.ad = v5;
                v4_1[v5 * v0 - 1] = hu.al(arg13, 0x8F2169F7).ap(v14, v2_3.ar * v3, -24410);
            }

            return 1;
        }

        if(6518 == arg13) {
            v13 = il.aj;
            v14 = il.ad + v15;
            il.ad = v14;
            v13[v14 * v0 - 1] = client.al.au;
            return 1;
        }

        if(6519 == arg13) {
            v13 = il.aj;
            v14 = il.ad + v15;
            il.ad = v14;
            v13[v14 * v0 - 1] = client.al.abd(0x6C6B068A) & 3;
            return 1;
        }

        if(arg13 != 6520) {
            if(6522 == arg13) {
            }
            else if(arg13 == 6521) {
                client.al.aba(0x61B52426).gc(0xDAE63E9F);
                return 1;
            }
            else if(arg13 == 6523) {
                v13_4 = client.al.aba(0xC56E5C02).az(1, 0x3310F9D5);
                v14_2 = il.aq;
                v2 = ft.ab - v9;
                ft.ab = v2;
                String v14_4 = v14_2[v2 * v8];
                if(ie.av(((CharSequence)v14_4), -29)) {
                    v13_4.ao(v14_4, -2076278032);
                    v14_1 = il.aj;
                    v2 = il.ad - v15;
                    il.ad = v2;
                    v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
                    v13_4.at(0x51A02257);
                    return 1;
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            else if(arg13 == 6524) {
                v13 = il.aj;
                v14 = il.ad + v15;
                il.ad = v14;
                v13[v14 * v0 - 1] = client.al.aba(0xE7034FF3).aq(0x5CBC1FDC);
                return 1;
            }
            else if(6525 == arg13) {
                v13 = il.aj;
                v2 = il.ad + v15;
                il.ad = v2;
                v2 = v2 * v0 - 1;
                if(client.al.aba(0xA25304D9).ab(1706894490)) {
                    v14 = 1;
                }

                v13[v2] = v14;
                return 1;
            }
            else {
                if(6526 == arg13) {
                    v13 = il.aj;
                    v14 = il.ad + v15;
                    il.ad = v14;
                    v13[v14 * v0 - 1] = client.al.aba(0x5496CD59).af(0x20AA7CA6);
                    return 1;
                }

                return v11;
            }
        }

        v13_4 = client.al.aba(0xF4599C73).az(v11, 0x3310F9D5);
        v14_2 = il.aq;
        v2 = ft.ab - v9;
        ft.ab = v2;
        v13_4.ao(v14_2[v2 * v8], 0x8472C028);
        v14_1 = il.aj;
        v2 = il.ad - v15;
        il.ad = v2;
        v13_4.ak(v14_1[v2 * v0], 0xDDEFCC11);
        v13_4.at(-643005815);
        return 1;
    }

    static int ey(int arg2, hl arg3, boolean arg4) {
        int v0;
        int[] v2;
        int v3 = 1304812425;
        if(arg2 == 5504) {
            il.ad -= 0xF187B907;
            arg2 = il.aj[il.ad * v3];
            v3 = il.aj[il.ad * v3 + 1];
            if(!client.pi) {
                du.cy(arg2, v3, 0x316F1172);
            }

            return 1;
        }

        int v1 = 0x4A90AB9;
        if(0x5A09423A == arg2) {
            v2 = il.aj;
            v0 = il.ad + v1;
            il.ad = v0;
            v2[v0 * v3 - 1] = client.hy * 0x720F8187;
            return 1;
        }

        if(5506 == arg2) {
            v2 = il.aj;
            v0 = il.ad + v1;
            il.ad = v0;
            v2[v0 * v3 - 1] = client.ht * 1651666200;
            return 1;
        }

        if(arg2 == 0xB6C158EB) {
            v2 = il.aj;
            v0 = il.ad - 0x1D162E64;
            il.ad = v0;
            arg2 = v2[v0 * v3];
            if(arg2 < 0) {
                arg2 = 0;
            }

            client.hn = arg2 * 0x7421E05F;
            return 1;
        }

        if(arg2 == 1052633385) {
            v2 = il.aj;
            v3 = il.ad - 0x7459104C;
            il.ad = v3;
            v2[v3 * 0xD07B3FBE - 1] = client.hn * -574755093;
            return 1;
        }

        return 2;
    }

    static int ez(int arg9, hl arg10, boolean arg11) {
        int[] v11_2;
        int[] v1_1;
        od v3_3;
        String[] v3_2;
        int[] v9_2;
        String[] v10_2;
        String v10_1;
        String[] v0_1;
        int v4;
        int[] v3_1;
        String v9_1;
        int v3;
        String[] v9;
        int v10 = 0x4A90AB9;
        int v11 = 0x8FA23525;
        int v0 = 1304812425;
        int v1 = 0xBC5CDEAD;
        if(arg9 == 4100) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            v3_1 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            v10 = v3_1[v4 * v0];
            v0_1 = il.aq;
            v3 = ft.ab + v11;
            ft.ab = v3;
            v0_1[v3 * v1 - 1] = v9_1 + v10;
            return 1;
        }

        v4 = 0x1F446A4A;
        if(arg9 == 0x1005) {
            ft.ab -= v4;
            v9_1 = il.aq[ft.ab * v1];
            v10_1 = il.aq[ft.ab * v1 + 1];
            v0_1 = il.aq;
            v3 = ft.ab + v11;
            ft.ab = v3;
            v0_1[v3 * v1 - 1] = v9_1 + v10_1;
            return 1;
        }

        if(0x1006 == arg9) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            v3_1 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            v10 = v3_1[v4 * v0];
            v0_1 = il.aq;
            v3 = ft.ab + v11;
            ft.ab = v3;
            v0_1[v3 * v1 - 1] = v9_1 + js.aj(v10, true, 2039038559);
            return 1;
        }

        if(0x1007 == arg9) {
            v9 = il.aq;
            v10 = ft.ab - v11;
            ft.ab = v10;
            v9_1 = v9[v10 * v1];
            v10_2 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v10_2[v0 * v1 - 1] = v9_1.toLowerCase();
            return 1;
        }

        int v5 = 2;
        if(arg9 == 0x1008) {
            v9_2 = il.aj;
            v3 = il.ad - v10;
            il.ad = v3;
            il.au.setTime(new Date(((((long)v9_2[v3 * v0])) + 0x2DE1) * 86400000));
            arg9 = il.au.get(5);
            v10 = il.au.get(v5);
            v0 = il.au.get(1);
            v3_2 = il.aq;
            v4 = ft.ab + v11;
            ft.ab = v4;
            v3_2[v4 * v1 - 1] = arg9 + "-" + il.am[v10] + "-" + v0;
            return 1;
        }

        if(arg9 == 0x1009) {
            ft.ab -= v4;
            v9_1 = il.aq[ft.ab * v1];
            v10_1 = il.aq[ft.ab * v1 + 1];
            if(gu.jg.al == null || !gu.jg.al.ae) {
                v10_2 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v10_2[v0 * v1 - 1] = v9_1;
            }
            else {
                v9 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v9[v0 * v1 - 1] = v10_1;
            }

            return 1;
        }

        if(arg9 == 0x100A) {
            v9_2 = il.aj;
            v3 = il.ad - v10;
            il.ad = v3;
            arg9 = v9_2[v3 * v0];
            v10_2 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v10_2[v0 * v1 - 1] = Integer.toString(arg9);
            return 1;
        }

        if(arg9 == 0x100B) {
            ft.ab -= v4;
            v9_2 = il.aj;
            v11 = il.ad + v10;
            il.ad = v11;
            v9_2[v11 * v0 - 1] = cb.ah(dm.ax(il.aq[ft.ab * v1], il.aq[ft.ab * v1 + 1], en.af, 0x6D132B6D), 16);
            return 1;
        }

        int v6 = 0x78DC0DC9;
        int v7 = 0x9521572;
        int v8 = 0;
        if(0x100C == arg9) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            il.ad -= v7;
            v11 = il.aj[il.ad * v0];
            v3_3 = new od(cj.de.ae(il.aj[il.ad * v0 + 1], 0, v6));
            v1_1 = il.aj;
            v4 = il.ad + v10;
            il.ad = v4;
            v1_1[v4 * v0 - 1] = v3_3.aj(v9_1, v11);
            return 1;
        }

        if(0x100D == arg9) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            il.ad -= v7;
            v11 = il.aj[il.ad * v0];
            v3_3 = new od(cj.de.ae(il.aj[il.ad * v0 + 1], 0, v6));
            v1_1 = il.aj;
            v4 = il.ad + v10;
            il.ad = v4;
            v1_1[v4 * v0 - 1] = v3_3.ap(v9_1, v11);
            return 1;
        }

        if(0x100E == arg9) {
            ft.ab -= v4;
            v9_1 = il.aq[ft.ab * v1];
            String v3_4 = il.aq[ft.ab * v1 + 1];
            int[] v4_1 = il.aj;
            v5 = il.ad - v10;
            il.ad = v5;
            if(v4_1[v5 * v0] == 1) {
                v10_2 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v10_2[v0 * v1 - 1] = v9_1;
            }
            else {
                v9 = il.aq;
                v10 = ft.ab + v11;
                ft.ab = v10;
                v9[v10 * v1 - 1] = v3_4;
            }

            return 1;
        }

        if(0x100F == arg9) {
            v9 = il.aq;
            v10 = ft.ab - v11;
            ft.ab = v10;
            v9_1 = v9[v10 * v1];
            v10_2 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v10_2[v0 * v1 - 1] = od.ad(v9_1);
            return 1;
        }

        if(0x1010 == arg9) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            v3_1 = il.aj;
            v4 = il.ad - v10;
            il.ad = v4;
            v10 = v3_1[v4 * v0];
            v0_1 = il.aq;
            v3 = ft.ab + v11;
            ft.ab = v3;
            v0_1[v3 * v1 - 1] = v9_1 + (((char)v10));
            return 1;
        }

        if(arg9 == 0x1011) {
            v9_2 = il.aj;
            v11 = il.ad - v10;
            il.ad = v11;
            arg9 = v9_2[v11 * v0];
            v11_2 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v1 = v1 * v0 - 1;
            if(lm.ag(((char)arg9), -1569861022)) {
                v8 = 1;
            }

            v11_2[v1] = v8;
            return 1;
        }

        if(0x1012 == arg9) {
            v9_2 = il.aj;
            v11 = il.ad - v10;
            il.ad = v11;
            arg9 = v9_2[v11 * v0];
            v11_2 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v11_2[v1 * v0 - 1] = ev.aa(((char)arg9), 0xD442AC73);
            return 1;
        }

        if(arg9 == 0x1013) {
            v9_2 = il.aj;
            v11 = il.ad - v10;
            il.ad = v11;
            arg9 = v9_2[v11 * v0];
            v11_2 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v1 = v1 * v0 - 1;
            if(de.af(((char)arg9), 0xB48B92B0)) {
                v8 = 1;
            }

            v11_2[v1] = v8;
            return 1;
        }

        if(arg9 == 0x1014) {
            v9_2 = il.aj;
            v11 = il.ad - v10;
            il.ad = v11;
            arg9 = v9_2[v11 * v0];
            v11_2 = il.aj;
            v1 = il.ad + v10;
            il.ad = v1;
            v11_2[v1 * v0 - 1] = at.ai(((char)arg9), 1909345847);
            return 1;
        }

        if(arg9 == 0x1015) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            if(v9_1 != null) {
                v11_2 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v11_2[v1 * v0 - 1] = v9_1.length();
            }
            else {
                v9_2 = il.aj;
                v11 = il.ad + v10;
                il.ad = v11;
                v9_2[v11 * v0 - 1] = 0;
            }

            return 1;
        }

        if(arg9 == 0x1016) {
            v9 = il.aq;
            v10 = ft.ab - v11;
            ft.ab = v10;
            v9_1 = v9[v10 * v1];
            il.ad -= v7;
            v10 = il.aj[il.ad * v0];
            v0 = il.aj[il.ad * v0 + 1];
            v3_2 = il.aq;
            v4 = ft.ab + v11;
            ft.ab = v4;
            v3_2[v4 * v1 - 1] = v9_1.substring(v10, v0);
            return 1;
        }

        if(arg9 == 0x1017) {
            v9 = il.aq;
            v10 = ft.ab - v11;
            ft.ab = v10;
            v9_1 = v9[v10 * v1];
            StringBuilder v10_3 = new StringBuilder(v9_1.length());
            v0 = 0;
            v3 = 0;
            while(v0 < v9_1.length()) {
                char v4_2 = v9_1.charAt(v0);
                if(v4_2 == 60) {
                    v3 = 1;
                }
                else if(62 == v4_2) {
                    v3 = 0;
                }
                else if(v3 == 0) {
                    v10_3.append(v4_2);
                }

                ++v0;
            }

            v9 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v9[v0 * v1 - 1] = v10_3.toString();
            return 1;
        }

        if(arg9 == 4120) {
            v9 = il.aq;
            v3 = ft.ab - v11;
            ft.ab = v3;
            v9_1 = v9[v3 * v1];
            v11_2 = il.aj;
            v1 = il.ad - v10;
            il.ad = v1;
            v11 = v11_2[v1 * v0];
            v1_1 = il.aj;
            v3 = il.ad + v10;
            il.ad = v3;
            v1_1[v3 * v0 - 1] = v9_1.indexOf(v11);
            return 1;
        }

        if(arg9 == 0x1019) {
            ft.ab -= v4;
            v9_1 = il.aq[ft.ab * v1];
            String v11_3 = il.aq[ft.ab * v1 + 1];
            v1_1 = il.aj;
            v3 = il.ad - v10;
            il.ad = v3;
            v1 = v1_1[v3 * v0];
            v3_1 = il.aj;
            v4 = il.ad + v10;
            il.ad = v4;
            v3_1[v4 * v0 - 1] = v9_1.indexOf(v11_3, v1);
            return 1;
        }

        if(0x101A == arg9) {
            v9 = il.aq;
            v10 = ft.ab - v11;
            ft.ab = v10;
            v9_1 = v9[v10 * v1];
            v10_2 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v10_2[v0 * v1 - 1] = v9_1.toUpperCase();
            return 1;
        }

        return v5;
    }

    static int fa(int arg10, hl arg11, boolean arg12) {
        da v10_6;
        cg v10_5;
        boolean v4_1;
        pb v10_4;
        dh v12_3;
        af v10_3;
        int[] v12_2;
        String[] v10_2;
        dh v10_1;
        int v12;
        int[] v10;
        if(6600 == arg10) {
            dl.ab(0x8D2D2DDF).ai(kt.jz * 1101813865, ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7), nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7), true, 0x600);
            return 1;
        }

        int v0 = 0xBC5CDEAD;
        int v1 = 0x8FA23525;
        int v2 = 0x4A90AB9;
        int v3 = 1304812425;
        if(arg10 == 6601) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            arg10 = v10[v12 * v3];
            String v12_1 = "";
            v10_1 = dl.ab(0x26F7042B).bn(arg10, 0xAC0035D1);
            if(v10_1 != null) {
                v12_1 = v10_1.am(0x8207B8A7);
            }

            v10_2 = il.aq;
            v2 = ft.ab + v1;
            ft.ab = v2;
            v10_2[v2 * v0 - 1] = v12_1;
            return 1;
        }

        if(6602 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            dl.ab(-1200309704).av(v10[v12 * v3], 1);
            return 1;
        }

        if(6603 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(0x7E926E50).bd(30);
            return 1;
        }

        if(6604 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            dl.ab(0x57CA3FD9).as(v10[v12 * v3], 0xF5FD0CB7);
            return 1;
        }

        int v4 = 0;
        if(6605 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v12 = v12 * v3 - 1;
            if(dl.ab(0xDBFDC925).bf(-959903890)) {
                v4 = 1;
            }

            v10[v12] = v4;
            return 1;
        }

        int v5 = 0xB230B0A5;
        int v6 = 0xAEACF223;
        if(arg10 == 6606) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            dl.ab(0xEB9B3AF1).bp(v10_3.al * v6, v10_3.ae * v5, 0x1867FE1C);
            return 1;
        }

        if(arg10 == 6607) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            dl.ab(1419301576).bw(v10_3.al * v6, v10_3.ae * v5, 1);
            return 1;
        }

        int v7 = 400591065;
        if(6608 == arg10) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            dl.ab(0xEB67DA43).bo(v10_3.ax * v7, v10_3.al * v6, v10_3.ae * v5, 0x1F77E7AA);
            return 1;
        }

        if(arg10 == 6609) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            dl.ab(-884450699).by(v10_3.ax * v7, v10_3.al * v6, v10_3.ae * v5, 0x8011DDC0);
            return 1;
        }

        if(6610 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(0x1BCF7377).bt(0x31D665C7);
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(0x961D1555).bv(0x43C53A49);
            return 1;
        }

        if(arg10 == 6611) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_1 = dl.ab(307096682).bn(v10[v12 * v3], 0xA114C6B5);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.ac(287427031).ax(112610986);
            }

            return 1;
        }

        int v8 = 0x999D058;
        if(arg10 == 6612) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_1 = dl.ab(0xAB20F04F).bn(v10[v12 * v3], -1805018419);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = (v10_1.at(-2006789801) - v10_1.ah(v8) + 1) * 0x40;
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = (v10_1.aw(-2082673301) - v10_1.ay(-2105774802) + 1) * 0x40;
            }

            return 1;
        }

        if(6613 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_1 = dl.ab(-2002491009).bn(v10[v12 * v3], -1436722061);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.ah(v8) * 0x40;
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.ay(0x80D319EA) * 0x40;
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.at(0xD7E08E1) * 0x40 + 0x40 - 1;
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.aw(-2024060355) * 0x40 + 0x40 - 1;
            }

            return 1;
        }

        v8 = -1;
        if(arg10 == 6614) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_1 = dl.ab(-1961513260).bn(v10[v12 * v3], 0xA1AECB60);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.ag(0xD54EB40F);
            }

            return 1;
        }

        if(6615 == arg10) {
            v10_3 = dl.ab(0xE53C90ED).bq(-104068647);
            if(v10_3 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_3.al * v6;
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_3.ae * v5;
            }

            return 1;
        }

        if(6616 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(0x90CCA6B5).aa(46);
            return 1;
        }

        if(arg10 == 6617) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            v12_3 = dl.ab(0xE17AB311).au(1286952037);
            if(v12_3 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                return 1;
            }

            v10 = v12_3.ab(v10_3.ax * v7, v10_3.al * v6, v10_3.ae * v5, -742540419);
            if(v10 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10[0];
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10[1];
            }

            return 1;
        }

        if(6618 == arg10) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            v12_3 = dl.ab(0xBC6C68EF).au(0x16CD8B37);
            if(v12_3 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                return 1;
            }

            v10_3 = v12_3.af(v10_3.al * v6, v10_3.ae * v5, 1497283401);
            if(v10_3 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_3.ax(1350671405);
            }

            return 1;
        }

        int v9 = 0x9521572;
        if(6619 == arg10) {
            il.ad -= v9;
            bv.bh(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), false, 1500087368);
            return 1;
        }

        if(6620 == arg10) {
            il.ad -= v9;
            bv.bh(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), true, 0x906063C9);
            return 1;
        }

        if(arg10 == 6621) {
            il.ad -= v9;
            arg10 = il.aj[il.ad * v3];
            af v12_4 = new af(il.aj[il.ad * v3 + 1]);
            v10_1 = dl.ab(0x2FE827BB).bn(arg10, 0x8FF4E6BB);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = 0;
                return 1;
            }

            int[] v0_1 = il.aj;
            v1 = il.ad + v2;
            il.ad = v1;
            v1 = v1 * v3 - 1;
            if(v10_1.ad(v12_4.ax * v7, v12_4.al * v6, v12_4.ae * v5, -107)) {
                v4 = 1;
            }

            v0_1[v1] = v4;
            return 1;
        }

        if(6622 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(-1065998470).bx(1855569640);
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = dl.ab(2003054723).bg(2043040867);
            return 1;
        }

        if(arg10 == 0x19DF) {
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_3 = new af(v12_2[v0 * v3]);
            v10_1 = dl.ab(0xFA9A81E).af(v10_3.ax * v7, v10_3.al * v6, v10_3.ae * v5, 73);
            if(v10_1 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_1.av(-1880437085);
            }

            return 1;
        }

        if(0x19E0 == arg10) {
            v10_4 = dl.ab(0x3B1EB012);
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_4.bz(v12_2[v0 * v3], -78);
            return 1;
        }

        if(arg10 == 6625) {
            dl.ab(0xCC039440).bh(0xA70E436D);
            return 1;
        }

        if(arg10 == 6626) {
            v10_4 = dl.ab(0xFE05067A);
            v12_2 = il.aj;
            v0 = il.ad - v2;
            il.ad = v0;
            v10_4.bb(v12_2[v0 * v3], 642808950);
            return 1;
        }

        if(6627 == arg10) {
            dl.ab(0x6CFEF5AF).bc(0xFDCDFE2B);
            return 1;
        }

        if(6628 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            if(v10[v12 * v3] == 1) {
                v4_1 = true;
            }

            dl.ab(0x107E6280).bk(((boolean)v4), 0xC34);
            return 1;
        }

        if(arg10 == 6629) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            dl.ab(0x3AFFB079).bm(v10[v12 * v3], 23);
            return 1;
        }

        if(6630 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            dl.ab(0x45D9D7EF).bj(v10[v12 * v3], 15);
            return 1;
        }

        if(arg10 == 6631) {
            dl.ab(-1537685062).bu(400872117);
            return 1;
        }

        if(arg10 == 6632) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            if(v10[v12 * v3] == 1) {
                v4_1 = true;
            }

            dl.ab(0xE0A58AE6).bs(((boolean)v4), 903253726);
            return 1;
        }

        if(6633 == arg10) {
            il.ad -= v9;
            arg10 = il.aj[il.ad * v3];
            if(1 == il.aj[il.ad * v3 + 1]) {
                v4_1 = true;
            }

            dl.ab(314461034).be(arg10, ((boolean)v4), 60);
            return 1;
        }

        if(arg10 == 6634) {
            il.ad -= v9;
            arg10 = il.aj[il.ad * v3];
            if(il.aj[il.ad * v3 + 1] == 1) {
                v4_1 = true;
            }

            dl.ab(0x3F4B4027).bl(arg10, ((boolean)v4), 0x76F1B7F6);
            return 1;
        }

        if(6635 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v12 = v12 * v3 - 1;
            if(dl.ab(0x331F952B).br(0x1D85E2E1)) {
                v4 = 1;
            }

            v10[v12] = v4;
            return 1;
        }

        if(arg10 == 6636) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            arg10 = v10[v12 * v3];
            v12_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v12_2[v0 * v3 - 1] = dl.ab(0x69C3A26E).bi(arg10, 1);
            return 1;
        }

        if(arg10 == 6637) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            arg10 = v10[v12 * v3];
            v12_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v0 = v0 * v3 - 1;
            if(dl.ab(1390668322).ca(arg10, -85)) {
                v4 = 1;
            }

            v12_2[v0] = v4;
            return 1;
        }

        if(arg10 == 6638) {
            il.ad -= v9;
            v10_3 = dl.ab(0x1AF68CBA).cf(il.aj[il.ad * v3], new af(il.aj[il.ad * v3 + 1]), -28);
            if(v10_3 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_3.ax(0xDD9D7566);
            }

            return 1;
        }

        if(0x19EF == arg10) {
            v10_5 = dl.ab(0x19500BBD).cb(0xF0C199C8);
            if(v10_5 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_5.al(0x2F);
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_5.ax.ax(0xBA86F587);
            }

            return 1;
        }

        if(arg10 == 0x19F0) {
            v10_5 = dl.ab(0x1173A99B).cy(0x46E407B6);
            if(v10_5 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_5.al(0x20);
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_5.ax.ax(0xDA9FF690);
            }

            return 1;
        }

        byte v4_2 = 16;
        if(6693 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_6 = ae.al(v10[v12 * v3], v4_2);
            if(v10_6.ad == null) {
                v10_2 = il.aq;
                v12 = ft.ab + v1;
                ft.ab = v12;
                v10_2[v12 * v0 - 1] = "";
            }
            else {
                String[] v12_5 = il.aq;
                v2 = ft.ab + v1;
                ft.ab = v2;
                v12_5[v2 * v0 - 1] = v10_6.ad;
            }

            return 1;
        }

        if(arg10 == 6694) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_6 = ae.al(v10[v12 * v3], v4_2);
            v12_2 = il.aj;
            v0 = il.ad + v2;
            il.ad = v0;
            v12_2[v0 * v3 - 1] = v10_6.ab * 0xD6D0BF01;
            return 1;
        }

        if(arg10 == 6695) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_6 = ae.al(v10[v12 * v3], v4_2);
            if(v10_6 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_6.ao * 0x64537821;
            }

            return 1;
        }

        if(6696 == arg10) {
            v10 = il.aj;
            v12 = il.ad - v2;
            il.ad = v12;
            v10_6 = ae.al(v10[v12 * v3], v4_2);
            if(v10_6 == null) {
                v10 = il.aj;
                v12 = il.ad + v2;
                il.ad = v12;
                v10[v12 * v3 - 1] = v8;
            }
            else {
                v12_2 = il.aj;
                v0 = il.ad + v2;
                il.ad = v0;
                v12_2[v0 * v3 - 1] = v10_6.ap * 0x6FB9813D;
            }

            return 1;
        }

        if(6697 == arg10) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = jc.az.ax * 1401097027;
            return 1;
        }

        if(arg10 == 6698) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = jc.az.al.ax(0xBE7405A5);
            return 1;
        }

        if(arg10 == 6699) {
            v10 = il.aj;
            v12 = il.ad + v2;
            il.ad = v12;
            v10[v12 * v3 - 1] = jc.az.ae.ax(0xD2AFEE45);
            return 1;
        }

        return 2;
    }

    static void fd(int arg8, af arg9, boolean arg10) {
        dl.ab(-641220040).ag(dl.ab(0x1992ADF8).bn(arg8, -459104940), new af(gu.jg.as * 0x8B4ED29B, (gu.jg.bp * 0x914F0683 >> 7) + ad.fi * 0xB4DA68FF, nr.fo * 0xFBB64FD3 + (gu.jg.bw * 0xD19D0C3D >> 7)), arg9, arg10, -247765060);
    }

    static void fe(int arg8, af arg9, boolean arg10) {
        dl.ab(0x8093B78B).ag(dl.ab(-679956090).bn(arg8, 0xB12E0643), new af(gu.jg.as * 0x420659F, (gu.jg.bp * 0x914F0683 >> 7) + ad.fi * 474770003, nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7)), arg9, arg10, -247765060);
    }

    static String is(String arg2, boolean arg3, int arg4) {
        if(arg3) {
            try {
                String v3 = "https://";
                goto label_4;
            label_3:
                v3 = "http://";
            label_4:
                int v0 = -190026425;
                if(client.ap * v0 == 1) {
                    arg2 = arg2 + "-wtrc";
                }
                else if(client.ap * v0 == 2) {
                    arg2 = arg2 + "-wtqa";
                }
                else if(client.ap * v0 == 3) {
                    arg2 = arg2 + "-wtwip";
                }
                else if(5 == client.ap * v0) {
                    arg2 = arg2 + "-wti";
                }
                else if(4 == client.ap * v0) {
                    arg2 = "local";
                }

                String v4_1 = "";
                if(client.av != null) {
                    v4_1 = "/p=" + client.av;
                }

                return v3 + arg2 + "." + "runescape.com" + "/l=" + en.af + "/a=" + client.aa * 0x57E2FE4D + v4_1 + "/";
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("il.is(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
        else {
            goto label_3;
        }

        goto label_4;
    }
}

