import com.jagex.jagex3.client.input.softkeyboard.ar;
import java.text.DecimalFormat;
import java.util.Calendar;

public class hq {
    public static final int aa = 14;
    static int ab = 0;
    static ef af = null;
    static es ah = null;
    static final int al = 0x2FD;
    static final int an = 19;
    static ef au = null;
    static ef av = null;
    static final int ax = 22;
    static final int bf = 200;
    static final int bn = 0xAB;
    static int bo = 0;
    static int bp = 0x62A75EBD;
    static String bq = null;
    public static final int bt = 41;
    static int bv = 0;
    static float bw = 0f;
    static final int bx = 0;
    static int by = 0;
    static String cg = null;
    static int ch = 0;
    static final int ci = 0;
    static int cm = 0;
    static String co = null;
    static String cq = null;
    static String ct = null;
    static String cu = null;
    static String cv = null;
    static int cz = 0;
    static int da = 0;
    static boolean de = false;
    static boolean df = false;
    static String dg = null;
    static boolean dk = false;
    static int dq = 0;
    static long dt = 0;
    static String dv = null;
    static boolean dy = false;
    static boolean ea = false;
    static final DecimalFormat eb = null;
    static int ed = 0;
    static int eg = 0;
    static final fm eh = null;
    static String ek = null;
    static final int eo = 300;
    static int ev = 0;
    static int ew = 0;
    static long fd = 0;
    static long fe = 0;
    static long fh = 0;
    static final int[] fi = null;
    static long fl = 0;
    static int[] ft = null;
    static final fm fy = null;
    static ha fz = null;
    static final int kp = 2;

    static {
        hq.bw = ((float)(hq.bp * 0x1A8B6787));
        hq.bo = hq.bp * 288238209;
        hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
        hq.bv = 0x2BE68972;
        hq.bq = "";
        hq.ch = 1719607703;
        hq.cz = 99320303;
        hq.cm = 0;
        hq.ct = "";
        hq.cu = "";
        hq.cq = "";
        hq.cv = "";
        hq.cg = "";
        hq.co = "";
        hq.dv = "";
        hq.de = false;
        hq.dk = false;
        hq.dy = true;
        hq.df = false;
        hq.da = 633703253;
        hq.dq = 0;
        hq.dt = 0x55953E707FC37789L;
        hq.dg = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
        hq.ek = "1234567890";
        hq.ea = false;
        hq.ew = 0x80697E01;
        hq.ev = 0;
        hq.eg = 0;
        hq.ed = 0x8FAC48F3;
        hq.eb = new DecimalFormat("##0.00");
        hq.eh = new ff();
        hq.fe = -5161604373339942693L;
        hq.fd = 6157203130767709075L;
        hq.fz = new ha();
        hq.fy = new fq();
        hq.fh = -9192220285612460777L;
        hq.fl = -8391680332296396343L;
        hq.fi = new int[4];
    }

    hq() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final boolean ar(int arg26, int arg27, int arg28, gx arg29, gy arg30, byte arg31) {
        int v12_1;
        int v20;
        int v5;
        int v15;
        int v14;
        int v6 = arg28;
        gy v7 = arg30;
        int v8 = arg26 - 0x40;
        int v9 = arg27 - 0x40;
        try {
            gb.ae[0x40][0x40] = 99;
            gb.ar[0x40][0x40] = 0;
            gb.ad[0] = arg26;
            gb.aq[0] = arg27;
            int[][] v11 = v7.bx;
            boolean v12 = true;
            int v1 = arg26;
            int v2 = arg27;
            int v0_1 = 0;
            int v13 = 1;
            while(true) {
                v14 = -2009184621;
                v15 = 0xE6F2E44B;
                if(v13 == v0_1) {
                    break;
                }

                int v16 = gb.ad[v0_1];
                int v17 = gb.aq[v0_1];
                int v18 = v16 - v7.by * 0xD3E61C35;
                int v19 = v17 - v7.bt * 0x2144FD29;
                int v10 = v17 - v9;
                int v21 = v16 - v8;
                int v22 = v0_1 + 1 & 0xFFF;
                if(arg29.ax(arg28, v16, v17, arg30, -3)) {
                    gb.an = v16 * v15;
                    gb.ap = v17 * v14;
                    return v12;
                }

                v1 = v21;
                v0_1 = gb.ar[v1][v10] + (((int)v12));
                v2 = 0x124013E;
                int v3 = 0x1240138;
                int v4 = 0x124010E;
                if(v1 > 0) {
                    v14 = v1 - 1;
                    if(gb.ae[v14][v10] != 0) {
                    }
                    else {
                        v5 = v18 - 1;
                        if((v11[v5][v19] & v4) != 0) {
                        }
                        else if((v11[v5][v6 + v19 - 1] & v3) != 0) {
                        }
                        else {
                            v15 = 1;
                            while(true) {
                                if(v15 >= v6 - 1) {
                                    break;
                                }
                                else if((v11[v5][v19 + v15] & v2) != 0) {
                                }
                                else {
                                    ++v15;
                                    continue;
                                }

                                goto label_113;
                            }

                            gb.ad[v13] = v16 - 1;
                            gb.aq[v13] = v17;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v14][v10] = 2;
                            gb.ar[v14][v10] = v0_1;
                        }
                    }
                }

            label_113:
                v3 = 0x80 - v6;
                v5 = 0x12401E3;
                v14 = 0x12401E0;
                v15 = 0x1240183;
                if(v1 < v3) {
                    v21 = v1 + 1;
                    if(gb.ae[v21][v10] != 0) {
                    }
                    else {
                        v20 = v18 + v6;
                        if((v11[v20][v19] & v15) != 0) {
                        }
                        else if((v11[v20][v19 + v6 - 1] & v14) != 0) {
                        }
                        else {
                            v2 = 1;
                            while(true) {
                                if(v2 >= v6 - 1) {
                                    break;
                                }
                                else if((v11[v20][v2 + v19] & v5) != 0) {
                                }
                                else {
                                    ++v2;
                                    continue;
                                }

                                goto label_163;
                            }

                            gb.ad[v13] = v16 + 1;
                            gb.aq[v13] = v17;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v21][v10] = 8;
                            gb.ar[v21][v10] = v0_1;
                        }
                    }
                }

            label_163:
                v2 = 0x124018F;
                if(v10 > 0) {
                    v20 = v10 - 1;
                    if(gb.ae[v1][v20] != 0) {
                    }
                    else {
                        v21 = v19 - 1;
                        if((v11[v18][v21] & v4) != 0) {
                        }
                        else if((v11[v6 + v18 - (((int)v12))][v21] & v15) != 0) {
                        }
                        else {
                            v14 = 1;
                            while(true) {
                                if(v14 >= v6 - 1) {
                                    break;
                                }
                                else if((v11[v18 + v14][v21] & v2) != 0) {
                                }
                                else {
                                    ++v14;
                                    continue;
                                }

                                goto label_209;
                            }

                            gb.ad[v13] = v16;
                            gb.aq[v13] = v17 - 1;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v1][v20] = ((int)v12);
                            gb.ar[v1][v20] = v0_1;
                        }
                    }
                }

            label_209:
                v5 = 0x12401F8;
                if(v10 < v3) {
                    v20 = v10 + 1;
                    if(gb.ae[v1][v20] != 0) {
                    }
                    else {
                        v21 = v19 + v6;
                        if((v11[v18][v21] & 0x1240138) != 0) {
                        }
                        else if((v11[v18 + v6 - (((int)v12))][v21] & 0x12401E0) != 0) {
                        }
                        else {
                            v14 = 1;
                            while(true) {
                                if(v14 >= v6 - 1) {
                                    break;
                                }
                                else if((v11[v18 + v14][v21] & v5) != 0) {
                                }
                                else {
                                    ++v14;
                                    continue;
                                }

                                goto label_258;
                            }

                            gb.ad[v13] = v16;
                            gb.aq[v13] = v17 + 1;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v1][v20] = 4;
                            gb.ar[v1][v20] = v0_1;
                        }
                    }
                }

            label_258:
                if(v1 > 0 && v10 > 0) {
                    v14 = v1 - 1;
                    v20 = v10 - 1;
                    if(gb.ae[v14][v20] != 0) {
                    }
                    else {
                        v12_1 = v18 - 1;
                        int v24 = v19 - 1;
                        if((v11[v12_1][v24] & v4) != 0) {
                        }
                        else {
                            v4 = 1;
                            while(true) {
                                if(v4 >= v6) {
                                    break;
                                }
                                else if((v11[v12_1][v4 + v24] & 0x124013E) != 0) {
                                }
                                else if((v11[v4 + v12_1][v24] & v2) != 0) {
                                }
                                else {
                                    ++v4;
                                    continue;
                                }

                                goto label_306;
                            }

                            gb.ad[v13] = v16 - 1;
                            gb.aq[v13] = v17 - 1;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v14][v20] = 3;
                            gb.ar[v14][v20] = v0_1;
                        }
                    }
                }

            label_306:
                if(v1 < v3 && v10 > 0) {
                    v12_1 = v1 + 1;
                    v14 = v10 - 1;
                    if(gb.ae[v12_1][v14] != 0) {
                    }
                    else {
                        v4 = v18 + v6;
                        v21 = v19 - 1;
                        if((v11[v4][v21] & v15) != 0) {
                        }
                        else {
                            v15 = 1;
                            while(true) {
                                if(v15 >= v6) {
                                    break;
                                }
                                else if((v11[v4][v21 + v15] & 0x12401E3) != 0) {
                                }
                                else if((v11[v15 + v18][v21] & v2) != 0) {
                                }
                                else {
                                    ++v15;
                                    continue;
                                }

                                goto label_354;
                            }

                            gb.ad[v13] = v16 + 1;
                            gb.aq[v13] = v17 - 1;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v12_1][v14] = 9;
                            gb.ar[v12_1][v14] = v0_1;
                        }
                    }
                }

            label_354:
                if(v1 > 0 && v10 < v3) {
                    v4 = v1 - 1;
                    v12_1 = v10 + 1;
                    if(gb.ae[v4][v12_1] != 0) {
                    }
                    else {
                        v2 = v18 - 1;
                        v15 = v6 + v19;
                        if((v11[v2][v15] & 0x1240138) != 0) {
                        }
                        else {
                            v14 = 1;
                            while(true) {
                                if(v14 >= v6) {
                                    break;
                                }
                                else if((v11[v2][v14 + v19] & 0x124013E) != 0) {
                                }
                                else if((v11[v2 + v14][v15] & v5) != 0) {
                                }
                                else {
                                    ++v14;
                                    continue;
                                }

                                goto label_403;
                            }

                            gb.ad[v13] = v16 - 1;
                            gb.aq[v13] = v17 + 1;
                            v13 = v13 + 1 & 0xFFF;
                            gb.ae[v4][v12_1] = 6;
                            gb.ar[v4][v12_1] = v0_1;
                        }
                    }
                }

            label_403:
                if(v1 < v3 && v10 < v3) {
                    v4 = v1 + 1;
                    v3 = v10 + 1;
                    if(gb.ae[v4][v3] != 0) {
                    }
                    else {
                        v1 = v18 + v6;
                        v10 = v6 + v19;
                        if((v11[v1][v10] & 0x12401E0) != 0) {
                        }
                        else {
                            v2 = 1;
                            while(true) {
                                if(v2 >= v6) {
                                    break;
                                }
                                else if((v11[v2 + v18][v10] & v5) != 0) {
                                }
                                else if((v11[v1][v19 + v2] & 0x12401E3) != 0) {
                                }
                                else {
                                    ++v2;
                                    continue;
                                }

                                goto label_453;
                            }

                            gb.ad[v13] = v16 + 1;
                            gb.aq[v13] = v17 + 1;
                            gb.ae[v4][v3] = 12;
                            gb.ar[v4][v3] = v0_1;
                            v13 = v13 + 1 & 0xFFF;
                        }
                    }
                }

            label_453:
                v1 = v16;
                v2 = v17;
                v0_1 = v22;
                v12 = true;
            }

            gb.an = v1 * v15;
            gb.ap = v2 * v14;
            return 0;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("hq.ar(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static int be(ko arg3, ko arg4) {
        int v3 = arg3.ak("titlewide.jpg", "", 1478963604) ? 1 : 0;
        if(arg4.ak("logo_osrs", "", 0x654F4C71)) {
            ++v3;
        }

        if(arg4.ak("logo_deadman_mode", "", 0x80872899)) {
            ++v3;
        }

        if(arg4.ak("titlebox", "", 0xBA6B4E9F)) {
            ++v3;
        }

        if(arg4.ak("titlebutton", "", 0x40274713)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_large", "", -1228709403)) {
            ++v3;
        }

        if(arg4.ak("play_now_text", "", 1640344094)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_wide42,1", "", 1479190890)) {
            ++v3;
        }

        if(arg4.ak("runes", "", 0x4F015833)) {
            ++v3;
        }

        if(arg4.ak("title_mute", "", 0xA53177D8)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,0", "", 0xEF4CDDB2)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,2", "", 0x8EC5266C)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,4", "", 1457791604)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,6", "", 0xA35C4D01)) {
            ++v3;
        }

        if(arg4.ak("login_icons", "", 0x4420085D)) {
            ++v3;
        }

        arg4.ak("sl_back", "", 0x70746B23);
        arg4.ak("sl_flags", "", 0xAA9B62E9);
        arg4.ak("sl_arrows", "", 0x1C671222);
        arg4.ak("sl_stars", "", 625334202);
        arg4.ak("sl_button", "", 0x62EDA01B);
        return v3;
    }

    static int bi(ko arg3, ko arg4) {
        int v3 = arg3.ak("titlewide.jpg", "", 0xAA0AF953) ? 1 : 0;
        if(arg4.ak("logo_osrs", "", -1438405947)) {
            ++v3;
        }

        if(arg4.ak("logo_deadman_mode", "", 1816016796)) {
            ++v3;
        }

        if(arg4.ak("titlebox", "", 0xD4FBC40D)) {
            ++v3;
        }

        if(arg4.ak("titlebutton", "", 0xE90809E8)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_large", "", 1695814702)) {
            ++v3;
        }

        if(arg4.ak("play_now_text", "", 1555118707)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_wide42,1", "", 1480846240)) {
            ++v3;
        }

        if(arg4.ak("runes", "", 0xE47470B5)) {
            ++v3;
        }

        if(arg4.ak("title_mute", "", 1803194682)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,0", "", 0xD3802BEA)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,2", "", 1115203399)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,4", "", 0x14D3D6AC)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,6", "", -1002385010)) {
            ++v3;
        }

        if(arg4.ak("login_icons", "", 0x1F08379)) {
            ++v3;
        }

        arg4.ak("sl_back", "", 0x6F2AC6D);
        arg4.ak("sl_flags", "", -1823546804);
        arg4.ak("sl_arrows", "", 0x21C424DF);
        arg4.ak("sl_stars", "", 0x8314FF28);
        arg4.ak("sl_button", "", 0x38FE4190);
        return v3;
    }

    static int bl(ko arg3, ko arg4) {
        int v3 = arg3.ak("titlewide.jpg", "", 0x13BA3830) ? 1 : 0;
        if(arg4.ak("logo_osrs", "", 0xD30B9C10)) {
            ++v3;
        }

        if(arg4.ak("logo_deadman_mode", "", 0xECF6E3F0)) {
            ++v3;
        }

        if(arg4.ak("titlebox", "", 646497009)) {
            ++v3;
        }

        if(arg4.ak("titlebutton", "", 0xAEFC47A)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_large", "", 0xAA4D5B0)) {
            ++v3;
        }

        if(arg4.ak("play_now_text", "", -2007338569)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_wide42,1", "", 0x8403850)) {
            ++v3;
        }

        if(arg4.ak("runes", "", 0xF58E0F87)) {
            ++v3;
        }

        if(arg4.ak("title_mute", "", 0xC85571F6)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,0", "", 0x73597457)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,2", "", 0x29509DF6)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,4", "", -2075449175)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,6", "", -74261017)) {
            ++v3;
        }

        if(arg4.ak("login_icons", "", 0x870FCFAA)) {
            ++v3;
        }

        arg4.ak("sl_back", "", 0x5840DCAF);
        arg4.ak("sl_flags", "", -935032640);
        arg4.ak("sl_arrows", "", 0xFE5C7297);
        arg4.ak("sl_stars", "", 2019809816);
        arg4.ak("sl_button", "", 0xA81A7A58);
        return v3;
    }

    static int br(ko arg3, ko arg4) {
        int v3 = arg3.ak("titlewide.jpg", "", 0x2C4CB43B) ? 1 : 0;
        if(arg4.ak("logo_osrs", "", 0x9E66E72B)) {
            ++v3;
        }

        if(arg4.ak("logo_deadman_mode", "", 223092377)) {
            ++v3;
        }

        if(arg4.ak("titlebox", "", -1013306404)) {
            ++v3;
        }

        if(arg4.ak("titlebutton", "", 0x398B1D1C)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_large", "", 0xC18402D8)) {
            ++v3;
        }

        if(arg4.ak("play_now_text", "", 0x584B5EB6)) {
            ++v3;
        }

        if(arg4.ak("titlebutton_wide42,1", "", 0xEB20A739)) {
            ++v3;
        }

        if(arg4.ak("runes", "", 0xE77644F3)) {
            ++v3;
        }

        if(arg4.ak("title_mute", "", 0xB88E8EE0)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,0", "", -1297427320)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,2", "", -1658079877)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,4", "", 808460001)) {
            ++v3;
        }

        if(arg4.ak("options_radio_buttons,6", "", 0x7522889A)) {
            ++v3;
        }

        if(arg4.ak("login_icons", "", 0xB6FAB4B6)) {
            ++v3;
        }

        arg4.ak("sl_back", "", 0x1A1F84BF);
        arg4.ak("sl_flags", "", -1152601706);
        arg4.ak("sl_arrows", "", 0x1769936B);
        arg4.ak("sl_stars", "", 0x2660F07A);
        arg4.ak("sl_button", "", 1160264240);
        return v3;
    }

    static void ca(ko arg16, ko arg17, boolean arg18, int arg19, fa arg20) {
        ko v0 = arg17;
        boolean v1 = arg18;
        int v2 = arg19;
        int v3 = 0xE53F385D;
        if(4 == v2) {
            fj.ao(-2043515849).at(0x5A20B6B4);
            hq.cm = v2 * v3;
        }

        if(eo.aq) {
            return;
        }

        dt.bu.bj(0x50951DF0);
        client.al.acx(hq.fz, 0x338217CF);
        byte v5 = 2;
        client.al.aba(-1405002860).ba(false, v5);
        ha v4 = hq.fz;
        boolean v7 = !client.al.au ? true : false;
        v4.ax = v7;
        if(v2 == 0) {
            ht.ah(v1, 0xD6A6DD80);
        }
        else {
            hq.cm = v2 * v3;
        }

        arg20.al(0x74);
        ox.ag = ah.ax(arg16.as("titlewide.jpg", "", 0x3F449090), 0);
        hq.ah = ox.ag.ax();
        gn.at = (0x20000000 & client.ar * 0x407F0DE1) != 0 ? aa.aq(v0, "logo_deadman_mode", "", -114) : aa.aq(v0, "logo_osrs", "", -70);
        hq.af = aa.aq(v0, "titlebox", "", -102);
        fj.az = hq.af.ar * 0xE6222AD3;
        in.ai = aa.aq(v0, "titlebutton", "", -16);
        hq.av = aa.aq(v0, "titlebutton_large", "", -50);
        li.aa = aa.aq(v0, "play_now_text", "", -61);
        hq.au = aa.aq(v0, "titlebutton_wide42,1", "", -20);
        eh.am = dl.ad(v0, "login_icons", "", 0x6E0C0A57);
        ax.ay = dl.ad(v0, "title_mute", "", 0x6E0C0A57);
        bz.aw = aa.aq(v0, "options_radio_buttons,0", "", -57);
        dx.ao = aa.aq(v0, "options_radio_buttons,4", "", -86);
        oa.as = aa.aq(v0, "options_radio_buttons,2", "", -63);
        bc.ak = aa.aq(v0, "options_radio_buttons,6", "", -77);
        ct.du = bz.aw.ae * -2014500871;
        gy.dm = bz.aw.ar * 0x9E48DA35;
        cl.ac = new jx(dl.ad(v0, "runes", "", 0x6E0C0A57));
        if(v1) {
            hq.cg = "";
            hq.co = "";
        }

        mf.dj = 0;
        da.ds = "";
        hq.dy = true;
        hq.ea = false;
        hq.bo = -1093157059;
        hq.bp = 0x62A75EBD;
        hq.bw = ((float)(hq.bp * 0x1A8B6787));
        if(!li.rg.ar) {
            as.ap(2, gn.dv, "scape main", "", 0xFF, false, -303313614);
        }
        else {
            jj.ad(v5, 0xC798B771);
        }

        md.al(false, 0xFF00FF00);
        eo.aq = true;
        hq.ab = (dq.tv * 0xD9CC4AFD - 0x2FD) / v5 * 0x8DFA78EB;
        hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
        bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
    }

    static String cb() {
        String v0 = li.rg.aj ? ff.az(hq.cg, 0xC52642B0) : hq.cg;
        return v0;
    }

    static void cc() {
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

    static ef cd(boolean arg0, boolean arg1) {
        ef v0;
        if(arg0) {
            v0 = arg1 ? bc.ak : oa.as;
        }
        else if(arg1) {
            v0 = dx.ao;
        }
        else {
            v0 = bz.aw;
        }

        return v0;
    }

    static void ce() {
        if(!client.er || hq.cg == null || hq.cg.length() <= 0) {
            ik.ab(-303515206);
        }
        else {
            ev.af(1701428291);
        }
    }

    static ef cf(boolean arg0, boolean arg1) {
        ef v0;
        if(arg0) {
            v0 = arg1 ? bc.ak : oa.as;
        }
        else if(arg1) {
            v0 = dx.ao;
        }
        else {
            v0 = bz.aw;
        }

        return v0;
    }

    static void cg() {
        hq.dq = 0xC9A04409;
        bs.aq(hq.dq * 0xF4A0196B, -1448159510);
        am.ai(hq.dq * 0xF4A0196B, 0xAB280EDC);
    }

    static void ch() {
        if(!client.er || hq.cg == null || hq.cg.length() <= 0) {
            ik.ab(-750340747);
        }
        else {
            ev.af(740928572);
        }
    }

    static void ci() {
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
        cl.ac.al(0xA90C64F0);
        jj.ad(2, -203091479);
        md.al(true, 0xFF00FF00);
        hq.dv = "";
        hq.da = 633703253;
        hq.df = false;
        eo.aq = false;
        hq.fz.ar(0x91F24F40);
    }

    static ef cj(boolean arg0, boolean arg1) {
        ef v0;
        if(arg0) {
            v0 = arg1 ? bc.ak : oa.as;
        }
        else if(arg1) {
            v0 = dx.ao;
        }
        else {
            v0 = bz.aw;
        }

        return v0;
    }

    static void ck(int arg2) {
        ar v0 = client.al.aba(0x489D84B0).gl(0x7F7E22B0);
        if(v0 == null) {
            v0 = ey.aw(0x9AF127D0);
        }

        if(v0 != null) {
            v0.ay(arg2, -427340705);
        }
    }

    static void cl(int arg2) {
        ar v0 = client.al.aba(0xD9DC0308).gl(0x61594AC5);
        if(v0 == null) {
            v0 = ey.aw(0x3FE443A1);
        }

        if(v0 != null) {
            v0.ay(arg2, 0xFC94C7A0);
        }
    }

    static void cm(int arg2) {
        ar v0 = client.al.aba(0x48002FFB).gl(0x706B816F);
        if(v0 == null) {
            v0 = ey.aw(0xD8DCC8A7);
        }

        if(v0 != null) {
            v0.ay(arg2, 0x8CF87D2E);
        }
    }

    static void cn() {
        if(!client.er || hq.cg == null || hq.cg.length() <= 0) {
            ik.ab(0xED478D50);
        }
        else {
            ev.af(0xBFF26B75);
        }
    }

    static void co(int arg2) {
        if(client.al.aba(2080282939).gu(-112)) {
            client.al.aba(-325329801).gl(0x54BBA830).ay(arg2, -1018812898);
        }
    }

    static void cp() {
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

    static void cq() {
        hq.dq = 0;
        bs.aq(hq.dq * 0xAF2038C6, 0xD2BE1159);
        am.ai(hq.dq * 0xA068C2BE, 0x8283F55B);
    }

    static void cr() {
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
        cl.ac.al(0x37F1FEA3);
        jj.ad(2, -375120553);
        md.al(true, 0xFF00FF00);
        hq.dv = "";
        hq.da = 633703253;
        hq.df = false;
        eo.aq = false;
        hq.fz.ar(-1724300307);
    }

    static void cs() {
        if(!client.er || hq.cg == null || hq.cg.length() <= 0) {
            ik.ab(0xBAABCB8A);
        }
        else {
            ev.af(0x180D3728);
        }
    }

    static void ct(int arg2) {
        ar v0 = client.al.aba(-1092357010).gl(0x5B0534B3);
        if(v0 == null) {
            v0 = ey.aw(639801580);
        }

        if(v0 != null) {
            v0.ay(arg2, -2067046877);
        }
    }

    static void cu() {
        hq.dq = 0;
        bs.aq(hq.dq * 0xF4A0196B, 1565010612);
        am.ai(hq.dq * 0xF4A0196B, -2043602164);
    }

    static void cv() {
        hq.dq = 0xCEB54B43;
        bs.aq(hq.dq * 0xF4A0196B, 0x5F28C5B6);
        am.ai(hq.dq * 0xF4A0196B, 0x999A7ED8);
    }

    static void cw() {
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

    static String cx() {
        String v0 = li.rg.aj ? ff.az(hq.cg, 0xC52642B0) : hq.cg;
        return v0;
    }

    static void cy() {
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

    static void cz() {
        if(!client.er || hq.cg == null || hq.cg.length() <= 0) {
            ik.ab(-2088304952);
        }
        else {
            ev.af(832860440);
        }
    }

    static void da(boolean arg2) {
        hq.cm = bi.at(2085470834) * 0xDA47336D;
        client.al.aba(0xCC2FB3F4).gc(0xCEC6F76B);
        if(arg2) {
            hq.cg = "";
            hq.co = "";
            mf.dj = 0;
            da.ds = "";
        }
    }

    static void db(int arg2) {
        if(2 == hq.cm * 0x10DCEBE1) {
            hq.dq = arg2 * 1957510101;
        }
    }

    static void dc() {
        int v1 = 0xF7EE5BF5;
        if(2 == hq.cm * v1) {
            v1 = 0xF4A0196B;
            if(hq.dq * v1 == 0) {
                if(hq.cg.length() > 0) {
                    hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
                }
            }
            else if(hq.dq * v1 == 1 && hq.co.length() > 0) {
                hq.co = hq.co.substring(0, hq.co.length() - 1);
            }
        }
        else if(hq.cm * v1 == 4) {
            if(da.ds.length() > 0) {
                da.ds = da.ds.substring(0, da.ds.length() - 1);
            }
        }
        else if(hq.cm * v1 == 5 && hq.cg.length() > 0) {
            hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
        }
    }

    static boolean dd(int arg6) {
        if(hq.df) {
            return 0;
        }

        int v2 = 0x407F0DE1;
        int v4 = -633703253;
        int v5 = 0xE53F385D;
        if((client.ar * v2 & 0x2000000) != 0) {
            hq.ct = "";
            hq.cu = gs.je;
            hq.cq = gs.jd;
            hq.cv = gs.jm;
            hq.cm = v5;
            hq.da = arg6 * v4;
            return 1;
        }

        if((client.ar * v2 & 4) != 0) {
            if((client.ar * v2 & 0x400) != 0) {
                hq.cu = gs.ji;
                hq.cq = gs.jb;
                hq.cv = gs.jn;
            }
            else {
                hq.cu = gs.im;
                hq.cq = gs.iu;
                hq.cv = gs.jc;
            }

            hq.ct = gs.ic;
            hq.cm = v5;
            hq.da = arg6 * v4;
            return 1;
        }

        if((client.ar * v2 & 0x400) != 0) {
            hq.cu = gs.jx;
            hq.cq = gs.jh;
            hq.cv = gs.jk;
            hq.ct = gs.ic;
            hq.cm = v5;
            hq.da = arg6 * v4;
            return 1;
        }

        return 0;
    }

    static void de() {
        if(2 == hq.cm * 0x5A6CB061) {
            if(hq.dq * 1467050018 == 0) {
                if(hq.cg.length() > 0) {
                    hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
                }
            }
            else if(hq.dq * 0xF4A0196B == 1 && hq.co.length() > 0) {
                hq.co = hq.co.substring(0, hq.co.length() - 1);
            }
        }
        else if(hq.cm * 0xF7EE5BF5 == 4) {
            if(da.ds.length() > 0) {
                da.ds = da.ds.substring(0, da.ds.length() - 1);
            }
        }
        else if(hq.cm * 0x3A505E1 == 5 && hq.cg.length() > 0) {
            hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
        }
    }

    static void df(jz arg17, fa arg18) {
        int v4_2;
        int v5_1;
        ls v1_3;
        la v0_4;
        int v3_1;
        ar v0_2;
        int v6_1;
        int v13_1;
        int v7;
        int v12;
        int v8_2;
        int v9_1;
        if(hq.ea) {
            jk.bo(arg17, arg18, 2095994168);
            return;
        }

        int v1 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 1337690017;
        boolean v0 = hq.fz.an;
        boolean v3 = hq.fz.ap;
        boolean v4 = hq.fz.aj;
        boolean v5 = hq.fz.ad;
        hq.fz.ae(5039);
        if((v0) && v1 >= hq.ab * 0xA212E039 - 0x6239CA1B - 0x5D379506 && v1 < hq.ab * 0x4D586FC3 + 0x4E55A0C6 && v2 >= 438 && v2 < 2014526806) {
            hu v8 = li.rg;
            boolean v9 = !li.rg.ar ? true : false;
            v8.ar = v9;
            fr.an(0xE2C2F890);
            if(!li.rg.ar) {
                bi.al(gn.dv, "scape main", "", 0xFF, false, 0xD12BDCDB);
                goto label_70;
            }

            gb.an(-279037700);
        }

    label_70:
        if(client.ac * 0x498EF1C3 == 5) {
            return;
        }

        if(hq.fe * 0x61810D62574D4ADL == -1) {
            hq.fe = (ji.ax(0x2076E2C1) + 1000) * 0x47A1B3D48807AF25L;
        }

        long v8_1 = ji.ax(0x2076E2C1);
        if((aa.bd(0)) && hq.fd * -8957420507059323547L == -1) {
            hq.fd = v8_1 * -6157203130767709075L;
            if(hq.fd * -8957420507059323547L > hq.fe * 0x61810D62574D4ADL) {
                hq.fe = hq.fd * -7353492469576586599L;
            }
        }

        if(client.ac * 0x498EF1C3 != 10 && 11 != client.ac * 0x44A83297) {
            return;
        }

        int v10 = 104778515;
        int v11 = 20;
        if(en.af == ly.ax) {
            if(v0) {
                v9_1 = hq.ab * 0x4D586FC3 + v11;
                v8_2 = 0x1D9ADD1C;
                v12 = 0x7C6D0BFB;
                if(v1 >= v9_1 && v1 <= v9_1 + v12 && v2 >= v8_2 && v2 <= 0x72C8C8E1) {
                    bs.bt(924705029);
                    return;
                }

                if(jl.fk == null) {
                    goto label_227;
                }

                if(v2 < jl.fk.al * 0xCF639740 - 30) {
                    goto label_227;
                }

                if(v2 > jl.fk.ar * 0x7EDCA66B + jl.fk.al * 0xC9ACBFBD + 30) {
                    goto label_227;
                }

                if(v1 >= jl.fk.ax * 0x79677930 && v1 <= jl.fk.ae * 561107904 + jl.fk.ax * v10) {
                    client.al.aba(1015460177).ga(102).ax(gs.og, true, 0x34A6B1C2);
                    goto label_227;
                }

                if(v1 >= bl.fv.ax * 0xDF7088DE && v1 <= bl.fv.ax * -1738849260 + bl.fv.ae * 0xD1D68747) {
                    client.al.aba(0x9FDF9AA2).ga(-82).ax(gs.oz, true, 0xEF598806);
                    goto label_227;
                }

                if(v1 < eh.fc.ax * v10) {
                    goto label_227;
                }

                if(v1 > eh.fc.ae * 0xD1D68747 + eh.fc.ax * v10) {
                    goto label_227;
                }

                client.al.aba(0x6D670D0F).gn(602362573);
            }

        label_227:
            if(li.ab == null) {
                goto label_231;
            }

            bs.bt(924705029);
        }

    label_231:
        v8_2 = client.al.abs(0xB6848A76);
        if(v8_2 != hq.ed * 63865970) {
            hq.ed = 0xCF55AC86 * v8_2;
            bf.ee = client.bj * -484602577;
        }

        v9_1 = 2;
        if(client.bj * -2077001153 >= bf.ee * 0x530AB108 + 8) {
            if(-1 != hq.ed * 0x35001BF0 && v8_2 < fj.az * 300090411 + 0x34097D6A) {
                hq.bo = (v8_2 - fj.az * 0x46AFBD5B) / v9_1 * 0x4D808A0E;
                if(hq.bo * 0x337D3E07 < 0) {
                    hq.bo = 0;
                }
                else {
                }

                goto label_281;
            }

            hq.bo = 0xF8D53607;
        }

    label_281:
        if(hq.bp * 1809495433 != hq.bo * 0x92C3B7F8) {
            float v12_1 = ((((float)(hq.bo * 0x337D3E07))) - hq.bw) * 0.25f;
            if(v12_1 > -0.5f && v12_1 < 0.5f) {
                v12_1 = ((float)(hq.bo * -2029288097 - hq.bp * 0x5AC687D0));
            }

            hq.bw += v12_1;
            hq.bp = (((int)hq.bw)) * 0xF499AE37;
        }

        v8_2 = 0xD700E425;
        v12 = 0x1A8B6787;
        if((v0) && (v1 < bi.bt * v8_2 - hq.af.ae / v9_1 || v1 > hq.af.ae / v9_1 + bi.bt * v8_2 || v2 < hq.bp * 1421406630 || v2 > hq.af.ar + hq.bp * v12)) {
            client.al.aba(885520008).gc(-1925520104);
        }

        int v14 = 3;
        int v15 = 287427031;
        if(hq.cm * 0xEAD6EF6A != 0) {
            v14 = 75;
            if(hq.cm * 0xAF68C70 == 1) {
                v8_2 = bi.bt * 605141886 + 2120977196;
                v5_1 = hq.bp * v12 - 0x4338A747;
                if((v3) || (v0) && v1 >= v8_2 - 75 && v1 <= v8_2 + v14 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    hq.df = true;
                    hp.ag(1111977309);
                }

                v7 = bi.bt * 0x572715B8 + 80;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v7 + 0x291F9895) {
                    }
                    else if(v1 > v7 - 0x50AAE6FF) {
                    }
                    else if(v2 < v5_1 - 20) {
                    }
                    else if(v2 <= v5_1 + v11) {
                        goto label_571;
                    }

                    return;
                }

            label_571:
                ht.ah(false, 0xB79E169B);
                return;
            }

            byte v6 = 15;
            v11 = 0x63D3C206;
            if(2120643284 * hq.cm == v9_1) {
                ar v13 = client.al.aba(1180881754).gl(1589062280);
                if(v13 != null) {
                    v13_1 = v13.aw(0x320D8D5D);
                    if(v13_1 >= 0) {
                        hq.dq = v13_1 * 0x6CBF4BEC;
                    }
                }

                v13_1 = hq.bp * v12 + 100 + 1850907269 + 52;
                if((v0) && v1 >= bi.bt * v8_2 - hq.af.ae / v9_1 && v1 <= bi.bt * 0xD9B5ADF5 + hq.af.ae / v9_1 && v2 >= v13_1 - 12 && v2 < v13_1 + 2) {
                    ik.ab(0xD140553B);
                }

                v13_1 += v6;
                if((v0) && v1 >= bi.bt * -113065085 - hq.af.ae / v9_1 && v1 <= hq.af.ae / v9_1 + bi.bt * -24237203 && v2 >= v13_1 - 12 && v2 < v13_1 + v9_1) {
                    ev.af(0xA42F2B38);
                }

                v8_2 = hq.bp * v12 - 0x6549E833;
                if(em.cl != null) {
                    v6_1 = em.cl.ae * -655533260 / v9_1;
                    if((v0) && v1 >= em.cl.ax * v10 - v6_1 && v1 <= em.cl.ax * 0x96098DE9 + v6_1 && v2 >= v8_2 - 15 && v2 < v8_2) {
                        switch(hq.cz * 0x2D49CD0F) {
                            case 1: {
                                goto label_685;
                            }
                            case 2: {
                                goto label_676;
                            }
                        }

                        goto label_688;
                    label_676:
                        client.al.aba(0x5EE196A5).ga(-55).ax("https://support.runescape.com/hc/en-gb", true, 0x90D7F8B6);
                        goto label_688;
                    label_685:
                        ha.ac(0x21EFA927);
                        return;
                    }
                }

            label_688:
                v8_2 = bi.bt * 0x8BD61C41 - 0xE47156D;
                v6_1 = hq.bp * v12 + 2021185780;
                if((v0) && v1 >= v8_2 + 0x1B417518 && v1 <= v8_2 + 0x71070006 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ik.ab(0xBA6565F);
                        ax.bf(gs.es, gs.eb, gs.eh, v11);
                        return;
                    }
                    else if(hq.co.length() == 0) {
                        ev.af(0x6FBF1CE);
                        ax.bf(gs.ec, gs.ei, gs.ex, v11);
                        return;
                    }
                    else {
                        client.al.aba(0x402548A4).gc(0xA2DEFC5);
                        ax.bf(gs.jf, gs.jz, gs.ja, v11);
                        he.bm(hq.co, client.al.au, -40);
                        return;
                    }
                }

                v8_2 = hq.by * v15 + 260;
                if((v0) && v1 >= v8_2 - 75 && v1 <= v8_2 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    ht.ah(true, 0x8EE7C94E);
                    hq.dy = true;
                }

                v8_2 = bi.bt * -1403423864 + 0x21DBF219;
                v6_1 = hq.bp * 0x5A44655B - 0x5FEEDD43;
                boolean v6_2 = v1 < v8_2 || v1 >= ct.du * -1054050639 + v8_2 || v2 < v6_1 || v2 >= gy.dm * 0xB47099DA + v6_1 ? false : true;
                hq.de = v6_2;
                if((v0) && (hq.de)) {
                    v6_2 = !client.er ? true : false;
                    client.er = v6_2;
                    if(client.er) {
                        goto label_811;
                    }

                    if(li.rg.ap == null) {
                        goto label_811;
                    }

                    li.rg.ap = null;
                    fr.an(0xCE8E7317);
                }

            label_811:
                if(client.al.abd(1908239960) == 3 || client.al.abd(1808582840) == v9_1) {
                    v6_1 = hq.bp * 0x82EE3E11 + 210;
                    if((v0) && v1 >= bi.bt * -307348914 - hq.au.ae / v9_1 && v1 <= hq.au.ae / v9_1 + bi.bt * 0xD700E425 && v2 >= v6_1 && v2 <= v6_1 + hq.au.ar) {
                        fg.bz(0x50E0453F);
                    }
                }

                v6_1 = bi.bt * 0xD700E425 + 24;
                v8_2 = hq.bp * v12 + 106;
                boolean v1_1 = v1 < v6_1 || v1 >= v6_1 + ct.du * 0x9A3F0860 || v2 < v8_2 || v2 >= gy.dm * 0x34B33468 + v8_2 ? false : true;
                hq.dk = v1_1;
                if((v0) && (hq.dk)) {
                    hu v0_1 = li.rg;
                    v1_1 = !li.rg.aj ? true : false;
                    v0_1.aj = v1_1;
                    if(!li.rg.aj) {
                        hq.cg = "";
                        li.rg.ap = null;
                        v0_2 = client.al.aba(-2089621015).gl(0x5F454850);
                        if(v0_2 != null) {
                            v0_2.as("", 0, 0x88A0F603);
                        }

                        ei.ad(0xF43F2E3A);
                    }

                    fr.an(0xF2FA152F);
                }

                if(v4) {
                    ht.ah(true, 0x3FB93F4);
                    hq.dy = true;
                    return;
                }

                if(v3) {
                    if(hq.dq * 0xF4A0196B == 0) {
                        ev.af(-108608376);
                        return;
                    }

                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ax.bf(gs.es, gs.eb, gs.eh, v11);
                        ik.ab(0x120A05FA);
                        return;
                    }

                    if(hq.co.length() == 0) {
                        ax.bf(gs.ec, gs.ei, gs.ex, v11);
                        ev.af(-1823918660);
                        return;
                    }

                    client.al.aba(0x4173F8C6).gc(0x2B76FA88);
                    ax.bf(gs.jf, gs.jz, gs.ja, v11);
                    he.bm(hq.co, client.al.au, -23);
                    return;
                }

                if(!v5) {
                    return;
                }

                if(hq.dq * 0xF4A0196B == 0) {
                    ev.af(0x7F966237);
                    return;
                }

                ik.ab(0xBB2F2E3D);
                return;
            }

            if(hq.cm * -1505154501 == 3) {
                v5_1 = hq.by * v15 + 180;
                v7 = hq.bp * v12 + 1510022701;
                if((v3) || (v4) || (v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v7 - 20 && v2 <= v7 + 20) {
                    ht.ah(false, 0xB1B93402);
                }

                v3_1 = hq.by * v15 + 180;
                v6_1 = hq.bp * 0x32C15F53 - 0x1C25D5B8;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 98028739) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v6_1 - 20) {
                    return;
                }

                if(v2 > v6_1 + 20) {
                    return;
                }

                ha.ac(0xBD4EC43F);
                return;
            }

            if(4 == hq.cm * 0x431A0C62) {
                v6_1 = hq.by * 0x4F58AF4E + 1695090380 - 0x635175C3;
                v8_2 = hq.bp * v12 - 1306261200;
                if(!v3 && (!v0 || v1 < v6_1 - 75 || v1 > v6_1 - 941334082 || v2 < v8_2 - 20 || v2 > v8_2 + 20)) {
                    if((v0) && v1 >= hq.by * 1817603242 + 180 - 0x710077B0 && v1 <= hq.by * 0xF3A07976 + 170 && v2 >= hq.bp * 0x59FDF5E4 + 92 && v2 <= hq.bp * v12 + 0x7D) {
                        ar v3_2 = client.al.aba(0x1BB6AD95).gl(0x544B0990);
                        if(v3_2 == null) {
                            v3_2 = fj.ao(-2035996484);
                        }

                        if(v3_2 == null) {
                            goto label_1090;
                        }

                        v3_2.at(0xFA9C2F32);
                    }

                label_1090:
                    if((v0) && v1 >= hq.by * 0x4417436C + 0xAB && v1 <= hq.by * v15 - 1540692000 && v2 >= hq.bp * v12 - 0x50028576 && v2 <= hq.bp * 0x20C154F2 + 0x7D) {
                        v3 = !hq.dy ? true : false;
                        hq.dy = v3;
                    }

                    if((v0) && v1 >= hq.by * -1294046663 - 0x7564C1C3 && v1 <= hq.by * v15 - 0x233561B && v2 >= hq.bp * 0x8B044FFA + 180 && v2 <= hq.bp * v12 + 0x4A241EA6) {
                        la v3_3 = client.al.aba(0x3F674269).ga(10);
                        v3_3.ax(il.is("secure", true, 0xEFF1D565) + "m=totp-authenticator/disableTOTPRequest", true, -478772410);
                    }

                    v5_1 = hq.by * 0xE661033D + 0x4E631B49;
                    if(!v4) {
                        if(!v0) {
                        }
                        else if(v1 < v5_1 - 0x111DD1F) {
                        }
                        else if(v1 > v5_1 + 703097182) {
                        }
                        else if(v2 < v8_2 - 20) {
                        }
                        else if(v2 <= v8_2 + 20) {
                            goto label_1183;
                        }

                        return;
                    }

                label_1183:
                    ew.bc(false, 0x34EFDF88);
                    ht.ah(true, -1961057401);
                    return;
                }

                da.ds.trim();
                if(da.ds.length() != 6) {
                    ax.bf(gs.bg, gs.bz, gs.bh, v11);
                    return;
                }

                mf.dj = Integer.parseInt(da.ds) * 0xD79967D1;
                da.ds = "";
                ax.bf(gs.jf, gs.jz, gs.ja, v11);
                if(hp.ea.ai(1)) {
                    hp.ea.ar(true, 0xAE3DFBF8);
                }

                ew.bc(true, 0x12D2B689);
                dc.ay(20, -49);
                return;
            }

            if(hq.cm * 1011809211 == 5) {
                v5_1 = hq.by * 0xF7B075F2 + 180;
                v11 = hq.bp * v12 - 0x2795522F;
                if((v0) && v1 >= v5_1 - 140 && v1 <= v5_1 + 148342200 && v2 >= v11 - 20 && v2 <= v11 + 20) {
                    v0_2 = client.al.aba(-2015264485).gl(2108212138);
                    if(v0_2 == null) {
                        v0_2 = ga.as(0xC33F07B3);
                    }

                    if(v0_2 != null) {
                        v0_2.at(2072605192);
                    }

                    return;
                }

                v5_1 = hq.by * v15 + 100;
                v8_2 = hq.bp * v12 - 0x51B00AC8;
                if((v0) && v1 >= v5_1 + 0x1F0319EE && v1 <= v5_1 + 0x2A63F425 && v2 >= v8_2 - 20 && v2 <= v8_2 + 20) {
                    ev.bd(1);
                    return;
                }

                v11 = hq.by * v15 - 1103539636;
                if((v0) && v1 >= v11 - 75 && v1 <= v11 + 75 && v2 >= v8_2 - 20 && v2 <= v8_2 + 20) {
                    eh.ak(true, 0xC1C1AA10);
                }

                v8_2 = hq.bp * 0x5C6F0942 - 0x591703B1;
                if(dq.ck != null) {
                    v11 = dq.ck.ae * -1185589100 / v9_1;
                    if((v0) && v1 >= dq.ck.ax * v10 - v11 && v1 <= dq.ck.ax * v10 + v11 && v2 >= v8_2 - 15 && v2 < v8_2) {
                        la v5_3 = client.al.aba(0xEB782984).ga(-10);
                        v5_3.ax(il.is("secure", true, 0xCE81FED2) + "m=weblogin/g=oldscape/cant_log_in", true, 0xFC408CB9);
                    }
                }

                if(v4) {
                    eh.ak(true, 0x9D4B80CE);
                }
                else if(v3) {
                    ev.bd(1);
                    return;
                }

                v3_1 = hq.by * v15 - 0x84B2CE2;
                v4_2 = hq.bp * v12 + 0xB9;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 + 0x2BFAD10C) {
                    return;
                }

                if(v1 > v3_1 + 0x1AA901CB) {
                    return;
                }

                if(v2 < v4_2 - 15) {
                    return;
                }

                if(v2 > v4_2 + v6) {
                    return;
                }

                ls v0_3 = client.al.aba(0x5929FF38);
                v0_3.gj("flSB8L", 0x2981E4DB);
                v0_4 = v0_3.ga(25);
                v0_4.ax(il.is("secure", true, 0xADD3D4C7) + "m=weblogin/g=oldscape/cant_log_in", true, 1951102011);
                return;
            }

            if(hq.cm * 0x82BF56E7 == 6) {
                if((v3) || (v4)) {
                    ht.ah(false, 0x5562C430);
                }

                v1 = hq.bp * v12 - 575063995;
                if(!v0) {
                    return;
                }

                if(v2 < v1 - 20) {
                    return;
                }

                if(v2 > v1 + 20) {
                    return;
                }

                ht.ah(false, 2071048483);
                return;
            }

            if(hq.cm * 0xE6BEAF63 == 7) {
                v3_1 = hq.by * v15 + 180 - 211707179;
                v4_2 = hq.bp * 0x6908418C - 0x3A77C9E0;
                if((v0) && v1 >= v3_1 - 1960601009 && v1 <= v3_1 + 0x48E4624C && v2 >= v4_2 - 20 && v2 <= v4_2 + 20) {
                    v0_4 = client.al.aba(0xD515DD85).ga(-73);
                    v0_4.ax(il.is("secure", true, -2093320863) + "m=dob/set_dob.ws", true, 0x4C47D10F);
                    ax.bf(gs.mq, gs.ma, gs.md, v11);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_1 = hq.by * -29260419 + 260;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 + 0x6470AADF) {
                    return;
                }

                if(v1 > v3_1 - 0x1BD29840) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                eh.ak(true, 0xC3919F75);
                return;
            }

            if(8 == hq.cm * 0xD9358FFD) {
                v3_1 = hq.by * v15 + 187836083;
                v6_1 = hq.bp * 0x59F724A - 0x6F496B1C;
                if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 0x22E562B3 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    client.al.aba(0xB34D3705).ga(78).ax(gs.og, true, 0xA0AEEBE2);
                    ax.bf(gs.mq, gs.ma, gs.md, v11);
                    hq.cm = 0x898AC9A2;
                    return;
                }

                v3_1 = hq.by * -351043061 + 260;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 + 1370449302) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v6_1 - 20) {
                    return;
                }

                if(v2 > v6_1 + 20) {
                    return;
                }

                ht.ah(true, 0xC204C5CB);
                return;
            }

            if(9 == hq.cm * 0xA35BA069) {
                v6_1 = hq.by * v15 + 0xCF1CF63;
                v7 = hq.bp * -1815971301 - 0x587D2933;
                if(!v3 && !v4) {
                    if(!v0) {
                    }
                    else if(v1 < v6_1 - 1860103715) {
                    }
                    else if(v1 > v6_1 + 75) {
                    }
                    else if(v2 < v7 - 20) {
                    }
                    else if(v2 <= v7 + 20) {
                        goto label_1575;
                    }

                    return;
                }

            label_1575:
                ht.ah(false, 0x3CAF64B5);
                return;
            }

            if(hq.cm * 0xF0A27699 == 10) {
                v5_1 = hq.by * v15 + 180;
                v7 = hq.bp * -86074834 + 38;
                if(((v3) || (v0) && v1 >= v5_1 - 109 && v1 <= 0x4504D923 + v5_1 && v2 >= v7 && v2 <= v7 - 0x15AE4860) && !he.ay(4, 107)) {
                    fz.az(false, false, 1661704086);
                }

                v3_1 = hq.bp * v12 + 140;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 + 0x3D90C030) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v3_1) {
                    }
                    else if(v2 <= v3_1 + 40) {
                        goto label_1624;
                    }

                    return;
                }

            label_1624:
                hq.cm = 0xD9B76BFF;
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 11) {
                v4_2 = bi.bt * 0xD700E425 - 0x75815FE;
                v6_1 = hq.bp * v12 + 0x41D42FFF;
                if((v0) && v1 >= v4_2 - 2079107325 && v1 <= v4_2 - 0x438BC64B && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    hp.ea.af(-33);
                    client.al.aba(0x2499FC3A).bq(new String[]{"wgahnagl", "name"}, 18);
                    ht.ah(true, 0x55F54EAB);
                }

                v5_1 = bi.bt * 0x7495FA94 - 924210252;
                if((!v0 || v1 < v5_1 - 75 || v1 > v5_1 + 1911790510 || v2 < v6_1 - 20 || v2 > v6_1 + 20) && !v3) {
                    return;
                }

                hq.cm = -193449054;
                return;
            }

            if(12 == hq.cm * 0xF7EE5BF5) {
                v5_1 = bi.bt * 0xD700E425;
                v8_2 = hq.bp * 0xF478AA77 - 480020287 + 0x3034F37A;
                if((v0) && v2 >= v8_2 - 20 && v2 <= v8_2 + 20) {
                    if(v1 >= v5_1 + 0x1EA74084 && v1 <= v5_1 - 20) {
                        client.al.aba(-484060110).ga(19).ax(gs.og, true, 0xE3D722C0);
                        goto label_1734;
                    }

                    if(v1 < v5_1) {
                        goto label_1734;
                    }

                    if(v1 > v5_1 + 0x75F10997) {
                        goto label_1734;
                    }

                    client.al.aba(1255303860).ga(41).ax(gs.oz, true, 0x10684BBC);
                }

            label_1734:
                v6_1 = bi.bt * -1652471097 - 80;
                v7 = hq.bp * v12 - 866550599;
                if((v0) && v1 >= v6_1 + 0x1CFB3A66 && v1 <= v6_1 + 75 && v2 >= v7 - 20 && v2 <= v7 + 20) {
                    client.al.aba(0xC4F35A9F).fs(0xA3765339);
                    hp.ag(0x67929DEC);
                }

                v5_1 = bi.bt * 0xD700E425 + 80;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v7 - 20 && v2 <= v7 + 20 || (v3)) {
                    hq.da = 0x74EDF575;
                    hq.cm = 0x826031F8;
                }

                if(!v4) {
                    return;
                }

                hq.da = 633703253;
                ht.ah(false, 643639062);
                return;
            }

            if(hq.cm * 309727879 == 13) {
                v3_1 = bi.bt * 0xD700E425;
                v7 = hq.bp * 0xA8470B93 - 0x11550264;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v3_1 - 75) {
                    }
                    else if(v1 > v3_1 - 0x1DA812CF) {
                    }
                    else if(v2 < v7 - 20) {
                    }
                    else if(v2 <= v7 + 20) {
                        goto label_1814;
                    }

                    return;
                }

            label_1814:
                ht.ah(false, 90494941);
                return;
            }

            if(hq.cm * 0x185D5FF9 == 14) {
                String v3_4 = "";
                switch(hq.ch * -1172087144) {
                    case 0: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                        break;
                    }
                    case 1: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                        break;
                    }
                    default: {
                        ht.ah(false, 106243034);
                        break;
                    }
                }

                v4_2 = hq.by * v15 + 180;
                v5_1 = hq.bp * v12 + 105;
                if((v0) && v1 >= v4_2 + 1022214110 && v1 <= v4_2 + 1370052686 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    client.al.aba(742534730).ga(22).ax(v3_4, true, -1901947040);
                    ax.bf(gs.mq, gs.ma, gs.md, v11);
                    hq.cm = 0x6F55380F;
                    return;
                }

                v3_1 = hq.by * v15 - 0x671FA617;
                v4_2 = hq.bp * v12 + 0x6999374A;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 0x61F58C87) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                if(hp.ea.ai(1)) {
                    ht.ah(false, 0x72F11BF5);
                    return;
                }

                eh.ak(false, 0xA5AFBC6B);
                return;
            }

            if(16 != hq.cm * 0xF7EE5BF5) {
                if(hq.cm * 0xF7EE5BF5 == 19) {
                }
                else if(hq.cm * -1552076205 == 18) {
                    long v0_5 = ji.ax(0x2076E2C1);
                    if(-1 == hq.dt * 0x24B4CA886ADBD147L) {
                        hq.dt = -6166903917654538121L * v0_5;
                    }

                    if(v0_5 - hq.dt * 0x24B4CA886ADBD147L <= 2000) {
                        return;
                    }

                    hq.dt = 0x55953E707FC37789L;
                    fz.az(true, false, -800004333);
                    return;
                }
                else {
                    if(17 == hq.cm * 0xB4893D71) {
                        ah v0_6 = client.al.aba(0x1442372).bh(1235409996);
                        if(v0_6 != null) {
                            am v0_7 = v0_6.hs(0x5B6D6C7C);
                            if(v0_7 == null) {
                                return;
                            }

                            if(v0_7.ax(75)) {
                                ax.bf(gs.jy, gs.js, gs.jl, v11);
                                hq.cm = 0x2F74DB9C;
                                return;
                            }

                            ax.bf(gs.jv, gs.ke, gs.ka, v11);
                            hq.cm = 439902107;
                            return;
                        }

                        ax.bf(gs.jv, gs.ke, gs.ka, v11);
                        hq.cm = 0x3B12EE7;
                        return;
                    }

                    if(hq.cm * -1630675437 == v6) {
                        ag v0_8 = hp.ea.am(0x7007920B);
                        if(v0_8 == null) {
                            return;
                        }

                        if(v0_8.ax(-2106177003)) {
                            hq.cm = -1806710425;
                            ax.bf(gs.jf, gs.jz, gs.ja, v11);
                            hp.ea.ad = 0xE4D0E2A7;
                            client.al.aba(0x6084C96D).bo("wgahnagl", hp.ea.ad * 1043449458, -81);
                            hp.ea.an(1645595018);
                            ew.bc(false, 0x37B5EF0C);
                            dc.ay(20, -26);
                        }
                        else {
                            v1_3 = client.al.aba(0x70396252);
                            switch(v0_8.al(0xDD782C77)) {
                                case 1: {
                                    goto label_2043;
                                }
                                case 2: {
                                    goto label_2033;
                                }
                            }

                            v1_3.gj("gcu2QC", 0x910B4E03);
                            ax.bf(gs.kr, gs.ku, gs.kb, v11);
                            hq.cm = 0x5F4643EA;
                            goto label_2052;
                        label_2033:
                            v1_3.gj("gcu2QC", 0x6B45CAF9);
                            ax.bf(gs.kf, gs.kd, gs.kj, v11);
                            hq.cm = 0xB5EF1E4F;
                            goto label_2052;
                        label_2043:
                            v1_3.gj("gcu1M3", -660885700);
                            ax.bf(gs.kx, gs.kz, gs.kv, v11);
                            hq.cm = 0x29F9C2E8;
                        }

                    label_2052:
                        hp.ea.az(null, -99);
                        return;
                    }

                    if(hq.cm * -943553060 == 23) {
                        av v0_9 = hp.ea.ag(1385202907);
                        if(v0_9 == null) {
                            return;
                        }

                        if(v0_9.ax(0xDDCA94CD)) {
                            hq.cm = 1545499806;
                            ax.bf(gs.jf, gs.jz, gs.ja, v11);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(0xAE42D2CA).bo("wgahnagl", hp.ea.ad * 0x19BA24C9, -57);
                            hp.ea.an(0xDCAF0F71);
                            ew.bc(false, 0xE036696);
                            dc.ay(20, -100);
                        }
                        else {
                            v1_3 = client.al.aba(0x89B1F379);
                            if(v0_9.al(0x6FB568F0) != 1) {
                                v1_3.gj("gsu6PD", 0x8A146F4C);
                                ax.bf(gs.ky, gs.kh, gs.kk, v11);
                                hq.cm = 0xF38FB45;
                            }
                            else {
                                v1_3.gj("gscD0G", -1810636185);
                                hq.cm = 0;
                            }
                        }

                        hp.ea.ah(null, 0x7FCD6E81);
                        return;
                    }

                    if(21 == hq.cm * 0xDCAF6F1F) {
                        v4_2 = bi.bt * 0xD700E425 - 80;
                        v6_1 = hq.bp * v12 - 0x4996F79A;
                        if((v0) && v1 >= v4_2 + 691103330 && v1 <= v4_2 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                            client.al.aba(1083320122).gm(1);
                            hp.ag(0x2EF17215);
                        }

                        v5_1 = bi.bt * 0xBF1D0C10 + 80;
                        if((!v0 || v1 < v5_1 - 0x2607C29A || v1 > v5_1 + 640173185 || v2 < v6_1 - 20 || v2 > v6_1 + 20) && !v3) {
                            return;
                        }

                        hq.da = 633703253;
                        ht.ah(false, 0x8FB09824);
                        return;
                    }

                    if(hq.cm * 0x818B9B7E == 22) {
                        v7 = hq.by * 0x507C7225 + 0x1A02EC72;
                        v4_2 = hq.bp * v12 + 0xE15B9F7;
                        if(!v3) {
                            if(!v0) {
                            }
                            else if(v1 < v7 - 75) {
                            }
                            else if(v1 > v7 + 75) {
                            }
                            else if(v2 < v4_2 - 20) {
                            }
                            else if(v2 <= v4_2 + 20) {
                                goto label_2206;
                            }

                            return;
                        }

                    label_2206:
                        ax.bf(gs.kp, gs.kl, gs.kn, v11);
                        client.al.aba(0x1DA97BC0).ac(v6);
                        return;
                    }

                    if(24 != hq.cm * 0xF7EE5BF5) {
                        return;
                    }

                    v4_2 = hq.by * v15 + 180;
                    v5_1 = hq.bp * v12 + 140;
                    if(!v3) {
                        if(!v0) {
                        }
                        else if(v1 < v4_2 + 0x50289321) {
                        }
                        else if(v1 > v4_2 + 75) {
                        }
                        else if(v2 < v5_1 - 20) {
                        }
                        else if(v2 <= v5_1 + 20) {
                            goto label_2240;
                        }

                        return;
                    }

                label_2240:
                    ht.ah(false, 2007337560);
                    return;
                }
            }

            v5_1 = bi.bt * 0x67FEC01C - 80;
            v3_1 = hq.bp * -910084704 - 2040410925;
            if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 - 1720179652 && v2 >= v3_1 - 20 && v2 <= v3_1 + 20) {
                ep.bh(0x7F077FAC);
                ax.bf(gs.jr, gs.jp, gs.jt, v11);
                hq.cm = 0x62FEF2CD;
                return;
            }

            v5_1 = bi.bt * 0x1F5C258C + 80;
            if((v0) && v1 >= v5_1 + 0x3CF86D18 && v1 <= v5_1 + 75 && v2 >= v3_1 - 20 && v2 <= v3_1 + 20) {
                fz.az(true, false, 0x259F6C00);
                return;
            }

            if(!v4) {
                return;
            }

            hq.cm = bi.at(0x9B0AE63B) * 0xE53F385D;
            return;
        }
        else if(v4) {
            client.al.aba(0x936298F0).bd(0xC63A7762);
            return;
        }
        else {
            ah v4_1 = client.al.aba(0xDFD6B2E2).bh(0x707F11DF);
            if(v4_1 != null && ((v4_1.hf(-52)) || (v4_1.ad(0x4CFCE56F)))) {
                v8_2 = hq.by * v15 - 1306820039;
                v10 = hq.bp * 0xD14F8F7F + 100 - 1320923028;
                v5_1 = hq.au.ae / v9_1;
                v11 = hq.au.ar;
                if((v0) && v1 >= v8_2 - v5_1 && v1 <= v8_2 + v5_1 && v2 >= v10 && v2 <= v10 + v11) {
                    if(v4_1.hf(-123)) {
                        if(!dw.bx(v9_1, 0xCF476521) && !dv.bg(v9_1, -2)) {
                            if(he.ay(v9_1, 102)) {
                            }
                            else {
                                bz.bb(16);
                                goto label_430;
                            }
                        }

                        return;
                    }
                    else {
                        if(!v4_1.ad(0x5E44DC72)) {
                            goto label_430;
                        }

                        if(!dw.bx(v14, 0x96959CDC) && !dv.bg(v14, -62)) {
                            if(he.ay(v14, 0x7D)) {
                            }
                            else {
                                fs.bc(2089982653);
                                goto label_430;
                            }
                        }

                        return;
                    }
                }

            label_430:
                v10 += v11 + 6;
                if((!v0 || v1 < v8_2 - v5_1 || v1 > v8_2 + v5_1 || v2 < v10 || v2 > v11 + v10) && !v3) {
                    return;
                }

                if(!dw.bx(1, 0xB9D93BE4) && !dv.bg(1, 13)) {
                    if(he.ay(1, 90)) {
                    }
                    else {
                        client.al.aba(0x9AE1D0F6).gj("crsG39", -774019509);
                        eh.ak(false, -1460849006);
                        return;
                    }
                }

                return;
            }

            v4_2 = bi.bt * v8_2 - 80;
            v5_1 = hq.bp * 0x4D0003A9 + 100 + v11;
            if((v0) && v1 >= v4_2 + 0x36C687A0 && v1 <= v4_2 - 914102212 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                if(!dw.bx(0, 0x369BDA65)) {
                    if(dv.bg(0, -9)) {
                    }
                    else {
                        fg.bz(0x3CF74090);
                        goto label_491;
                    }
                }

                return;
            }

        label_491:
            v4_2 = bi.bt * v8_2 + 80;
            if((!v0 || v1 < v4_2 + 0x16363C3C || v1 > v4_2 + 290788193 || v2 < v5_1 - 20 || v2 > v5_1 + v11) && !v3) {
                return;
            }

            if(!dw.bx(1, 0xF793722F) && !dv.bg(1, 0x60)) {
                if(he.ay(1, 78)) {
                }
                else {
                    client.al.aba(0x5679CF16).gj("crsG39", 0x826E01F1);
                    eh.ak(false, 0xA21C50C2);
                    return;
                }
            }

            return;
        }
    }

    static ar dg() {
        ar v0 = client.al.aba(0x7D9F5C15).az(0, 0x3310F9D5);
        v0.as(hq.cg, 0, -1368866104);
        v0.as(hq.co, 1, -1119957707);
        return v0;
    }

    static void dh(int arg2) {
        if(client.al.aba(0x10C77950).gu(-22)) {
            client.al.aba(0xBF6DA70D).gl(0x7ECAF3CB).ay(arg2, 0xA5255B29);
        }
    }

    static void di(boolean arg2) {
        hq.cm = bi.at(0x706013E6) * 0xE53F385D;
        client.al.aba(0x2DD8B72D).gc(-992828057);
        if(arg2) {
            hq.cg = "";
            hq.co = "";
            mf.dj = 0;
            da.ds = "";
        }
    }

    static void dj(jz arg17, fa arg18) {
        int v4_2;
        int v5_1;
        ls v1_3;
        la v0_4;
        int v3_3;
        ar v0_2;
        int v6;
        int v11;
        int v7_1;
        int v8;
        if(hq.ea) {
            jk.bo(arg17, arg18, 420129401);
            return;
        }

        int v1 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 0x1516846B;
        boolean v0 = hq.fz.an;
        boolean v3 = hq.fz.ap;
        boolean v4 = hq.fz.aj;
        boolean v5 = hq.fz.ad;
        hq.fz.ae(10034);
        if((v0) && v1 >= hq.ab * 0x4D586FC3 + 0x2FD - 0x1AB09B83 && v1 < hq.ab * 0x24F58EEF + 0x56B939D3 && v2 >= 438 && v2 < 503) {
            li.rg.ar ^= 1;
            fr.an(0x89106AB9);
            if(!li.rg.ar) {
                bi.al(gn.dv, "scape main", "", 2077052385, false, 0xE67D9A5);
            }
            else {
                gb.an(-279037700);
            }
        }

        if(client.ac * 0x1B286775 == 5) {
            return;
        }

        if(hq.fe * 0x61810D62574D4ADL == -1) {
            hq.fe = (ji.ax(0x2076E2C1) + 1000) * 0x47A1B3D48807AF25L;
        }

        long v7 = ji.ax(0x2076E2C1);
        if((aa.bd(0)) && hq.fd * -8957420507059323547L == -1) {
            hq.fd = v7 * -6157203130767709075L;
            if(hq.fd * -8957420507059323547L > hq.fe * 0x61810D62574D4ADL) {
                hq.fe = hq.fd * -7353492469576586599L;
            }
        }

        if(client.ac * 1862002203 != 10 && 11 != client.ac * 0x787F73C9) {
            return;
        }

        int v10 = 20;
        if(en.af == ly.ax) {
            if(v0) {
                v8 = hq.ab * 0x4D586FC3 + v10;
                v7_1 = 0x1C0;
                v11 = 0x1ED29A90;
                if(v1 >= v8 && v1 <= v8 + v11 && v2 >= v7_1 && v2 <= 483) {
                    bs.bt(924705029);
                    return;
                }

                if(jl.fk == null) {
                    goto label_225;
                }

                if(v2 < jl.fk.al * 0xC9ACBFBD - 30) {
                    goto label_225;
                }

                if(v2 > jl.fk.ar * -1707320065 + jl.fk.al * 562588023 + 30) {
                    goto label_225;
                }

                if(v1 >= jl.fk.ax * 0x657EDDEF && v1 <= jl.fk.ae * 0xD1D68747 + jl.fk.ax * 0xFD1DC242) {
                    client.al.aba(1472702117).ga(30).ax(gs.og, true, -948424034);
                    goto label_225;
                }

                if(v1 >= bl.fv.ax * 0xB458BC0C && v1 <= bl.fv.ax * 0x7B4F5E04 + bl.fv.ae * 0xD1D68747) {
                    client.al.aba(635808547).ga(-5).ax(gs.oz, true, 0x9BF1ED7F);
                    goto label_225;
                }

                if(v1 < eh.fc.ax * 0x899E5106) {
                    goto label_225;
                }

                if(v1 > eh.fc.ae * 0xD1D68747 + eh.fc.ax * -298930818) {
                    goto label_225;
                }

                client.al.aba(0x692F7494).gn(0xF29BB68);
            }

        label_225:
            if(li.ab == null) {
                goto label_229;
            }

            bs.bt(924705029);
        }

    label_229:
        v7_1 = client.al.abs(0xB6848A76);
        if(v7_1 != hq.ed * 0x2AABEFC5) {
            hq.ed = 0x5CCB1D5B * v7_1;
            bf.ee = client.bj * -484602577;
        }

        v8 = 2;
        if(client.bj * 0x8E9FEF6F >= bf.ee * 0x182E1AF7 + 8) {
            if(-1 != hq.ed * 0x2AABEFC5 && v7_1 < fj.az * 0x46AFBD5B + 0xAB) {
                hq.bo = (v7_1 - fj.az * 0x46AFBD5B) / v8 * 0x6CE7CFB7;
                if(hq.bo * 0xB0E7DBB6 < 0) {
                    hq.bo = 0;
                }
                else {
                }

                goto label_278;
            }

            hq.bo = -1093157059;
        }

    label_278:
        if(hq.bp * -1830930142 != hq.bo * 0x337D3E07) {
            float v11_1 = ((((float)(hq.bo * 0x337D3E07))) - hq.bw) * 0.25f;
            if(v11_1 > -0.5f && v11_1 < 0.5f) {
                v11_1 = ((float)(hq.bo * 0xF914119B - hq.bp * 0x8149FFAC));
            }

            hq.bw += v11_1;
            hq.bp = (((int)hq.bw)) * 0xF499AE37;
        }

        v7_1 = 0xD700E425;
        if((v0) && (v1 < bi.bt * v7_1 - hq.af.ae / v8 || v1 > hq.af.ae / v8 + bi.bt * v7_1 || v2 < hq.bp * 0x4F86C061 || v2 > hq.af.ar + hq.bp * 0xCE14F8AF)) {
            client.al.aba(-1827350728).gc(0xFCFB83F0);
        }

        byte v12 = 50;
        int v13 = 287427031;
        if(hq.cm * 0x8FE51509 != 0) {
            if(hq.cm * 0x5ACA6234 == 1) {
                v7_1 = bi.bt * 0xC14E46F6 - 80;
                v5_1 = hq.bp * -109725720 + 1218102211;
                if((v3) || (v0) && v1 >= v7_1 + 1410633097 && v1 <= v7_1 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    hq.df = true;
                    hp.ag(-750106434);
                }

                v6 = bi.bt * 0xD40A083E + 80;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v6 - 0x734ACABF) {
                    }
                    else if(v1 > v6 - 0x23BE4C21) {
                    }
                    else if(v2 < v5_1 - 20) {
                    }
                    else if(v2 <= v5_1 + v10) {
                        goto label_573;
                    }

                    return;
                }

            label_573:
                ht.ah(false, 909451854);
                return;
            }

            v11 = 15;
            int v15 = 0x1A8B6787;
            int v9 = 0x63D3C206;
            if(hq.cm * 0x42D9B76C == v8) {
                ar v10_1 = client.al.aba(1029630396).gl(0x5DF75F7E);
                if(v10_1 != null) {
                    v10 = v10_1.aw(0x320D8D5D);
                    if(v10 >= 0) {
                        hq.dq = v10 * 202197015;
                    }
                }

                v10 = hq.bp * v15 + 100 - 0x5A896517 + 52;
                if((v0) && v1 >= bi.bt * -1900241504 - hq.af.ae / v8 && v1 <= bi.bt * 0xC512E981 + hq.af.ae / v8 && v2 >= v10 - 12 && v2 < v10 + 2) {
                    ik.ab(0xED8FBA0E);
                }

                v10 += v11;
                if((v0) && v1 >= bi.bt * 0x48F0B8D6 - hq.af.ae / v8 && v1 <= hq.af.ae / v8 + bi.bt * v7_1 && v2 >= v10 - 12 && v2 < v10 + v8) {
                    ev.af(0x7085479E);
                }

                v10 = hq.bp * 0xD2C2B4F4 + 190;
                if(em.cl != null) {
                    v11 = em.cl.ae * 0xD1D68747 / v8;
                    if((v0) && v1 >= em.cl.ax * 104778515 - v11 && v1 <= em.cl.ax * 104778515 + v11 && v2 >= v10 - 15 && v2 < v10) {
                        switch(hq.cz * -1640382406) {
                            case 1: {
                                goto label_689;
                            }
                            case 2: {
                                goto label_680;
                            }
                        }

                        goto label_692;
                    label_689:
                        ha.ac(-1310602349);
                        return;
                    label_680:
                        client.al.aba(1269607875).ga(-42).ax("https://support.runescape.com/hc/en-gb", true, 0x11FC8CF0);
                    }
                }

            label_692:
                v11 = bi.bt * -1270901738 + 0x6F7BB624;
                v10 = hq.bp * v15 + 100 + v12;
                if((v0) && v1 >= v11 - 75 && v1 <= v11 + 878895003 && v2 >= v10 - 20 && v2 <= v10 + 20) {
                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ik.ab(-2019944921);
                        ax.bf(gs.es, gs.eb, gs.eh, v9);
                        return;
                    }
                    else if(hq.co.length() == 0) {
                        ev.af(0xDFE9302D);
                        ax.bf(gs.ec, gs.ei, gs.ex, v9);
                        return;
                    }
                    else {
                        client.al.aba(0x5A0B1826).gc(0x8AE57155);
                        ax.bf(gs.jf, gs.jz, gs.ja, v9);
                        he.bm(hq.co, client.al.au, -89);
                        return;
                    }
                }

                v11 = hq.by * 287427031 - 0x3002E0AD;
                if((v0) && v1 >= v11 - 0x6C0FAEDE && v1 <= v11 + 75 && v2 >= v10 - 20 && v2 <= v10 + 20) {
                    ht.ah(true, 0xF2C9C029);
                    hq.dy = true;
                }

                v10 = bi.bt * v7_1 - 0x75;
                v11 = hq.bp * 0x45E39719 + 0x51CEA4E5;
                boolean v10_2 = v1 < v10 || v1 >= ct.du * 0x7F06EA49 + v10 || v2 < v11 || v2 >= gy.dm * 0xB429C951 + v11 ? false : true;
                hq.de = v10_2;
                if((v0) && (hq.de)) {
                    v10_2 = !client.er ? true : false;
                    client.er = v10_2;
                    if(client.er) {
                        goto label_812;
                    }

                    if(li.rg.ap == null) {
                        goto label_812;
                    }

                    li.rg.ap = null;
                    fr.an(0x9AC18788);
                }

            label_812:
                if(client.al.abd(1836629701) == 3 || client.al.abd(0x67D24F1D) == v8) {
                    v10 = hq.bp * v15 + 210;
                    if((v0) && v1 >= bi.bt * 0xF05F33D2 - hq.au.ae / v8 && v1 <= hq.au.ae / v8 + bi.bt * v7_1 && v2 >= v10 && v2 <= v10 + hq.au.ar) {
                        fg.bz(0x58FDA556);
                    }
                }

                v8 = bi.bt * v7_1 + 24;
                v7_1 = hq.bp * v15 + 106;
                boolean v1_1 = v1 < v8 || v1 >= v8 + ct.du * 0x7F06EA49 || v2 < v7_1 || v2 >= gy.dm * 0x1F26B7EB + v7_1 ? false : true;
                hq.dk = v1_1;
                if((v0) && (hq.dk)) {
                    hu v0_1 = li.rg;
                    v1_1 = !li.rg.aj ? true : false;
                    v0_1.aj = v1_1;
                    if(!li.rg.aj) {
                        hq.cg = "";
                        li.rg.ap = null;
                        v0_2 = client.al.aba(0x4AD3373F).gl(0x731ECF2C);
                        if(v0_2 != null) {
                            v0_2.as("", 0, 0x845BEFD4);
                        }

                        ei.ad(0xF43F2E3A);
                    }

                    fr.an(195240897);
                }

                if(v4) {
                    ht.ah(true, 904076632);
                    hq.dy = true;
                    return;
                }

                if(v3) {
                    if(hq.dq * 462085860 == 0) {
                        ev.af(0x13565FC6);
                        return;
                    }

                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ax.bf(gs.es, gs.eb, gs.eh, v9);
                        ik.ab(-1527013020);
                        return;
                    }

                    if(hq.co.length() == 0) {
                        ax.bf(gs.ec, gs.ei, gs.ex, v9);
                        ev.af(0x5586119D);
                        return;
                    }

                    client.al.aba(0x6FA98CDD).gc(-1906806242);
                    ax.bf(gs.jf, gs.jz, gs.ja, v9);
                    he.bm(hq.co, client.al.au, -36);
                    return;
                }

                if(!v5) {
                    return;
                }

                if(hq.dq * 0xEB41BF3D == 0) {
                    ev.af(0x771E54CE);
                    return;
                }

                ik.ab(-2011874636);
                return;
            }

            v10 = 0xF7EE5BF5;
            if(hq.cm * v10 == 3) {
                v5_1 = hq.by * 0x40E2D1AF - 0x2CB9C23F;
                v7_1 = hq.bp * v15 + 724688013;
                if((v3) || (v4) || (v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v7_1 - 20 && v2 <= v7_1 + 20) {
                    ht.ah(false, 0x16EAAD34);
                }

                v4_2 = hq.by * 287427031 - 0x68ACC1B4;
                v5_1 = hq.bp * v15 + 1250801714;
                if(!v0) {
                    return;
                }

                if(v1 < v4_2 + 0x3D06F0D2) {
                    return;
                }

                if(v1 > v4_2 - 0x1548B0FD) {
                    return;
                }

                if(v2 < v5_1 - 20) {
                    return;
                }

                if(v2 > v5_1 + 20) {
                    return;
                }

                ha.ac(-625640419);
                return;
            }

            if(4 == hq.cm * v10) {
                v5_1 = hq.by * 287427031 + 0x5AA56200;
                v8 = hq.bp * v15 - 0x1C198402;
                if(!v3 && (!v0 || v1 < v5_1 - 75 || v1 > v5_1 + 75 || v2 < v8 - 20 || v2 > v8 + 20)) {
                    if((v0) && v1 >= hq.by * 0x9D9A1890 + 50 && v1 <= hq.by * -1030576926 - 0x4A699CDE && v2 >= hq.bp * 0x44B72C4D + 92 && v2 <= hq.bp * 0xA374D3C6 - 0x5CDD1B1D) {
                        ar v3_1 = client.al.aba(0xB4A8F381).gl(2009205580);
                        if(v3_1 == null) {
                            v3_1 = fj.ao(0x81D3EE33);
                        }

                        if(v3_1 == null) {
                            goto label_1089;
                        }

                        v3_1.at(0x8C06B8D1);
                    }

                label_1089:
                    if((v0) && v1 >= hq.by * -1164724089 + 220802124 && v1 <= hq.by * -1465019420 - 0x6C49AF && v2 >= hq.bp * v15 - 0x34C89760 && v2 <= hq.bp * 0x34AA92BB + 0x7D) {
                        v3 = !hq.dy ? true : false;
                        hq.dy = v3;
                    }

                    if((v0) && v1 >= hq.by * 35859060 + 0x92 && v1 <= hq.by * 287427031 - 2014048074 && v2 >= hq.bp * v15 - 0x7F3CAC1A && v2 <= hq.bp * 0x5F4DA602 - 0x71A40DEE) {
                        la v3_2 = client.al.aba(1433840150).ga(-12);
                        v3_2.ax(il.is("secure", true, -205439633) + "m=totp-authenticator/disableTOTPRequest", true, 0xBBF54D2D);
                    }

                    v3_3 = hq.by * 287427031 + 260;
                    if(!v4) {
                        if(!v0) {
                        }
                        else if(v1 < v3_3 + 0x7F656AD3) {
                        }
                        else if(v1 > v3_3 - 0x69794780) {
                        }
                        else if(v2 < v8 - 20) {
                        }
                        else if(v2 <= v8 + 20) {
                            goto label_1186;
                        }

                        return;
                    }

                label_1186:
                    ew.bc(false, 1171838807);
                    ht.ah(true, 0x3852F6B6);
                    return;
                }

                da.ds.trim();
                if(da.ds.length() != 6) {
                    ax.bf(gs.bg, gs.bz, gs.bh, v9);
                    return;
                }

                mf.dj = Integer.parseInt(da.ds) * 0xD79967D1;
                da.ds = "";
                ax.bf(gs.jf, gs.jz, gs.ja, v9);
                if(hp.ea.ai(1)) {
                    hp.ea.ar(true, 0xAE3DFBF8);
                }

                ew.bc(true, 0x6F7F937A);
                dc.ay(20, -7);
                return;
            }

            if(hq.cm * 0x2FE82DF5 == 5) {
                v5_1 = hq.by * 287427031 + 180;
                v7_1 = hq.bp * 0xD9698A4D + 109;
                if((v0) && v1 >= v5_1 - 0x1F0965A9 && v1 <= v5_1 + 140 && v2 >= v7_1 - 20 && v2 <= v7_1 + 20) {
                    v0_2 = client.al.aba(0x4EEF1304).gl(1590593933);
                    if(v0_2 == null) {
                        v0_2 = ga.as(-1266900647);
                    }

                    if(v0_2 != null) {
                        v0_2.at(0x43A1CB5A);
                    }

                    return;
                }

                v5_1 = hq.by * 287427031 - 0x4D78FDE2 + 0x1925965D;
                v9 = hq.bp * 345020183 + 0x74AAB1F8;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v9 - 20 && v2 <= v9 + 20) {
                    ev.bd(1);
                    return;
                }

                v7_1 = hq.by * 287427031 - 0x7399CCF2;
                if((v0) && v1 >= v7_1 - 75 && v1 <= v7_1 + 75 && v2 >= v9 - 20 && v2 <= v9 + 20) {
                    eh.ak(true, 0x909CFC1E);
                }

                v5_1 = hq.bp * v15 + 190;
                if(dq.ck != null) {
                    v9 = dq.ck.ae * 0x3B66887C / v8;
                    if((v0) && v1 >= dq.ck.ax * 104778515 - v9 && v1 <= dq.ck.ax * 104778515 + v9 && v2 >= v5_1 - 15 && v2 < v5_1) {
                        la v5_3 = client.al.aba(0xCB0B3ED5).ga(-21);
                        v5_3.ax(il.is("secure", true, 0x8EC16932) + "m=weblogin/g=oldscape/cant_log_in", true, -1388387630);
                    }
                }

                if(v4) {
                    eh.ak(true, -682702171);
                }
                else if(v3) {
                    ev.bd(1);
                    return;
                }

                v3_3 = hq.by * 287427031 - 0x4B743A1;
                v4_2 = hq.bp * 1654041607 - 0x1C6F720E;
                if(!v0) {
                    return;
                }

                if(v1 < v3_3 - 100) {
                    return;
                }

                if(v1 > v3_3 - 0x5AF0861F) {
                    return;
                }

                if(v2 < v4_2 - 15) {
                    return;
                }

                if(v2 > v4_2 + v11) {
                    return;
                }

                ls v0_3 = client.al.aba(0x86CF521E);
                v0_3.gj("flSB8L", 0x9062CC36);
                v0_4 = v0_3.ga(-1);
                v0_4.ax(il.is("secure", true, 0xB1FABF6F) + "m=weblogin/g=oldscape/cant_log_in", true, 0xC90C4EC2);
                return;
            }

            if(hq.cm * 0x40F96CF7 == 6) {
                if((v3) || (v4)) {
                    ht.ah(false, 1968827076);
                }

                v1 = hq.bp * v15 + 901993047 + v12;
                if(!v0) {
                    return;
                }

                if(v2 < v1 - 20) {
                    return;
                }

                if(v2 > v1 + 20) {
                    return;
                }

                ht.ah(false, 1103950654);
                return;
            }

            if(hq.cm * -1752704643 == 7) {
                v3_3 = hq.by * 287427031 + 180 + 642540851;
                v4_2 = hq.bp * -2021802388 + 0x4E1CFF66 + v12;
                if((v0) && v1 >= v3_3 - 75 && v1 <= v3_3 + 0x33258800 && v2 >= v4_2 - 20 && v2 <= v4_2 + 20) {
                    v0_4 = client.al.aba(0x8AFC94A5).ga(-46);
                    v0_4.ax(il.is("secure", true, 0xF659C412) + "m=dob/set_dob.ws", true, 0x4E088A39);
                    ax.bf(gs.mq, gs.ma, gs.md, v9);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_3 = hq.by * 243958670 - 0x1FFC8A8D;
                if(!v0) {
                    return;
                }

                if(v1 < v3_3 - 75) {
                    return;
                }

                if(v1 > v3_3 + 0x39C5D4AB) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                eh.ak(true, 0x907058A6);
                return;
            }

            if(8 == hq.cm * v10) {
                v4_2 = hq.by * -945648306 + 100;
                v7_1 = hq.bp * 0x232E430B - 0x72694D3F + v12;
                if((v0) && v1 >= v4_2 + 0x4A296D6D && v1 <= v4_2 + 75 && v2 >= v7_1 - 20 && v2 <= v7_1 + 20) {
                    client.al.aba(0x77F1712C).ga(69).ax(gs.og, true, -1669011401);
                    ax.bf(gs.mq, gs.ma, gs.md, v9);
                    hq.cm = 1539558202;
                    return;
                }

                v3_3 = hq.by * 0x99FB6D33 + 260;
                if(!v0) {
                    return;
                }

                if(v1 < v3_3 + 0x7BF64380) {
                    return;
                }

                if(v1 > v3_3 + 75) {
                    return;
                }

                if(v2 < v7_1 - 20) {
                    return;
                }

                if(v2 > v7_1 + 20) {
                    return;
                }

                ht.ah(true, 2100959509);
                return;
            }

            if(9 == hq.cm * 0xB52E8407) {
                v6 = hq.by * 0x72A768D4 + 180;
                v7_1 = hq.bp * 0x2EA4838E - 0x51C237EB;
                if(!v3 && !v4) {
                    if(!v0) {
                    }
                    else if(v1 < v6 - 308013776) {
                    }
                    else if(v1 > v6 + 75) {
                    }
                    else if(v2 < v7_1 - 20) {
                    }
                    else if(v2 <= v7_1 + 20) {
                        goto label_1581;
                    }

                    return;
                }

            label_1581:
                ht.ah(false, 205855843);
                return;
            }

            if(hq.cm * 705461004 == 10) {
                v6 = hq.by * 287427031 - 0x4CA2C5D5;
                v8 = hq.bp * 0x8569B921 - 0x7197FC70;
                if(((v3) || (v0) && v1 >= v6 - 109 && v1 <= 0x8504EF78 + v6 && v2 >= v8 && v2 <= v8 + 68) && !he.ay(4, 70)) {
                    fz.az(false, false, 2098842855);
                }

                v3_3 = hq.bp * 0xA718E8CC + 140;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v6 - 0xEB37DF1) {
                    }
                    else if(v1 > v6 + 0x281B94F5) {
                    }
                    else if(v2 < v3_3) {
                    }
                    else if(v2 <= v3_3 + 0x534B3EF8) {
                        goto label_1634;
                    }

                    return;
                }

            label_1634:
                hq.cm = 0xD9B76BFF;
                return;
            }

            if(hq.cm * v10 == 11) {
                v4_2 = bi.bt * v7_1 - 80;
                v5_1 = hq.bp * -1260043702 + 120;
                if((v0) && v1 >= v4_2 - 0x291E5422 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    hp.ea.af(-61);
                    client.al.aba(0x86303D83).bq(new String[]{"wgahnagl", "name"}, -125);
                    ht.ah(true, 0xF5AF9EC8);
                }

                v4_2 = bi.bt * v7_1 + 80;
                if((!v0 || v1 < v4_2 - 75 || v1 > v4_2 + 75 || v2 < v5_1 - 20 || v2 > v5_1 + 20) && !v3) {
                    return;
                }

                hq.cm = -193449054;
                return;
            }

            if(12 == hq.cm * 0x565A827D) {
                v5_1 = bi.bt * v7_1;
                v9 = hq.bp * v15 - 190326851 + 0x433B506B;
                if((v0) && v2 >= v9 - 20 && v2 <= v9 + 20) {
                    if(v1 >= v5_1 - 150 && v1 <= v5_1 - 20) {
                        client.al.aba(0x7F0D338).ga(46).ax(gs.og, true, 1350377047);
                        goto label_1733;
                    }

                    if(v1 < v5_1) {
                        goto label_1733;
                    }

                    if(v1 > v5_1 + 90) {
                        goto label_1733;
                    }

                    client.al.aba(-2054722484).ga(29).ax(gs.oz, true, 0x72478443);
                }

            label_1733:
                v6 = bi.bt * 0xBD1D2157 - 80;
                v8 = hq.bp * v15 + 0x320D4871;
                if((v0) && v1 >= v6 - 75 && v1 <= v6 + 75 && v2 >= v8 - 20 && v2 <= v8 + 20) {
                    client.al.aba(0x6F5BC92D).fs(0xADE0E30C);
                    hp.ag(0xE49CF842);
                }

                v5_1 = bi.bt * v7_1 - 0x5A063F53;
                if((v0) && v1 >= v5_1 - 0x4A31ABDB && v1 <= v5_1 + 0x7355999F && v2 >= v8 - 20 && v2 <= v8 + 20 || (v3)) {
                    hq.da = 633703253;
                    hq.cm = 0xA435DCB9;
                }

                if(!v4) {
                    return;
                }

                hq.da = 678313019;
                ht.ah(false, 0xE609CD08);
                return;
            }

            if(hq.cm * 0x4549D4B0 == 13) {
                v5_1 = bi.bt * 0xD35AF33;
                v3_3 = hq.bp * v15 + 100 + v12;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 615285300) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v3_3 - 20) {
                    }
                    else if(v2 <= v3_3 + 20) {
                        goto label_1810;
                    }

                    return;
                }

            label_1810:
                ht.ah(false, 0x32F88A32);
                return;
            }

            if(hq.cm * 0x9B1DA13E == 14) {
                String v3_4 = "";
                switch(hq.ch * 0x803A91D9) {
                    case 0: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                        break;
                    }
                    case 1: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                        break;
                    }
                    default: {
                        ht.ah(false, 626801480);
                        break;
                    }
                }

                v4_2 = hq.by * -1421068104 + 0x79445DB;
                v7_1 = hq.bp * v15 + 0x1A79B93C;
                if((v0) && v1 >= v4_2 - 0x74FF7BAA && v1 <= v4_2 - 1130859573 && v2 >= v7_1 - 20 && v2 <= v7_1 + 20) {
                    client.al.aba(-145987609).ga(26).ax(v3_4, true, 898203098);
                    ax.bf(gs.mq, gs.ma, gs.md, v9);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_3 = hq.by * 287427031 + 180;
                v4_2 = hq.bp * v15 - 0x220B0F95;
                if(!v0) {
                    return;
                }

                if(v1 < v3_3 - 75) {
                    return;
                }

                if(v1 > v3_3 + 1773891110) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                if(hp.ea.ai(1)) {
                    ht.ah(false, 0x635F37AC);
                    return;
                }

                eh.ak(false, -1429400760);
                return;
            }

            if(16 != hq.cm * v10) {
                if(hq.cm * v10 == 19) {
                }
                else if(hq.cm * 1909826723 == 18) {
                    long v0_5 = ji.ax(0x2076E2C1);
                    if(-1 == hq.dt * 0x24B4CA886ADBD147L) {
                        hq.dt = -6166903917654538121L * v0_5;
                    }

                    if(v0_5 - hq.dt * 0x24B4CA886ADBD147L <= 2000) {
                        return;
                    }

                    hq.dt = 0x55953E707FC37789L;
                    fz.az(true, false, -500715171);
                    return;
                }
                else {
                    if(17 == hq.cm * 0x1C7BF33) {
                        ah v0_6 = client.al.aba(0xF164D4E).bh(1321288100);
                        if(v0_6 != null) {
                            am v0_7 = v0_6.hs(1705900896);
                            if(v0_7 == null) {
                                return;
                            }

                            if(v0_7.ax(90)) {
                                ax.bf(gs.jy, gs.js, gs.jl, v9);
                                hq.cm = 0x1E71F68A;
                                return;
                            }

                            ax.bf(gs.jv, gs.ke, gs.ka, v9);
                            hq.cm = 629060420;
                            return;
                        }

                        ax.bf(gs.jv, gs.ke, gs.ka, v9);
                        hq.cm = 0x3B12EE7;
                        return;
                    }

                    if(hq.cm * -1024811351 == v11) {
                        ag v0_8 = hp.ea.am(0xCF713B0F);
                        if(v0_8 == null) {
                            return;
                        }

                        if(v0_8.ax(-2021833895)) {
                            hq.cm = -193449054;
                            ax.bf(gs.jf, gs.jz, gs.ja, v9);
                            hp.ea.ad = 0x48E92708;
                            client.al.aba(0x1384D410).bo("wgahnagl", hp.ea.ad * 0x8251FD91, -96);
                            hp.ea.an(-121349001);
                            ew.bc(false, 0x57E8E755);
                            dc.ay(20, -70);
                        }
                        else {
                            v1_3 = client.al.aba(-1897299059);
                            switch(v0_8.al(0xEF5C0AB9)) {
                                case 1: {
                                    goto label_2032;
                                }
                                case 2: {
                                    goto label_2022;
                                }
                            }

                            v1_3.gj("gcu2QC", 0x9341324C);
                            ax.bf(gs.kr, gs.ku, gs.kb, v9);
                            hq.cm = 0xF38FB45;
                            goto label_2048;
                        label_2022:
                            v1_3.gj("gcu2QC", 0x8F4B3628);
                            ax.bf(gs.kf, gs.kd, gs.kj, v9);
                            hq.cm = 0x2726FB8D;
                            goto label_2048;
                        label_2032:
                            v1_3.gj("gcu1M3", 831504028);
                            ax.bf(gs.kx, gs.kz, gs.kv, v9);
                            hq.cm = 0x29F9C2E8;
                        }

                    label_2048:
                        hp.ea.az(null, -90);
                        return;
                    }

                    if(hq.cm * 886690980 == 23) {
                        av v0_9 = hp.ea.ag(1302666284);
                        if(v0_9 == null) {
                            return;
                        }

                        if(v0_9.ax(0x7E97EC0)) {
                            hq.cm = -193449054;
                            ax.bf(gs.jf, gs.jz, gs.ja, v9);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(0xA0876B8F).bo("wgahnagl", hp.ea.ad * 0x53571C21, -20);
                            hp.ea.an(0x56853929);
                            ew.bc(false, -144059854);
                            dc.ay(20, -110);
                        }
                        else {
                            v1_3 = client.al.aba(68020052);
                            if(v0_9.al(1667699650) != 1) {
                                v1_3.gj("gsu6PD", 0xF128C982);
                                ax.bf(gs.ky, gs.kh, gs.kk, v9);
                                hq.cm = -1364820664;
                            }
                            else {
                                v1_3.gj("gscD0G", 0x45799E89);
                                hq.cm = 0;
                            }
                        }

                        hp.ea.ah(null, 0x7FCD6E81);
                        return;
                    }

                    if(21 == hq.cm * v10) {
                        v4_2 = bi.bt * v7_1 - 80;
                        v7_1 = hq.bp * 0xA99F4272 + 140;
                        if((v0) && v1 >= v4_2 - 0x535C9F3F && v1 <= v4_2 - 0x3C85F21 && v2 >= v7_1 - 20 && v2 <= v7_1 + 20) {
                            client.al.aba(0x3B23F47C).gm(1);
                            hp.ag(-358186270);
                        }

                        v5_1 = bi.bt * 0x6C496037 + 80;
                        if((!v0 || v1 < v5_1 + 0x610E82F6 || v1 > v5_1 + 75 || v2 < v7_1 - 20 || v2 > v7_1 + 20) && !v3) {
                            return;
                        }

                        hq.da = 633703253;
                        ht.ah(false, 0xD075CF50);
                        return;
                    }

                    if(hq.cm * 111769908 == 22) {
                        v5_1 = hq.by * -1266076461 + 180;
                        v4_2 = hq.bp * v15 + 130;
                        if(!v3) {
                            if(!v0) {
                            }
                            else if(v1 < v5_1 + 0x42F31306) {
                            }
                            else if(v1 > v5_1 + 0x40044383) {
                            }
                            else if(v2 < v4_2 - 20) {
                            }
                            else if(v2 <= v4_2 + 20) {
                                goto label_2197;
                            }

                            return;
                        }

                    label_2197:
                        ax.bf(gs.kp, gs.kl, gs.kn, v9);
                        client.al.aba(-1287035431).ac(-3);
                        return;
                    }

                    if(24 != hq.cm * 517003484) {
                        return;
                    }

                    v4_2 = hq.by * 287427031 + 0x6F0E750D;
                    v6 = hq.bp * 0xB76AF9E0 + 0x30ADD33E;
                    if(!v3) {
                        if(!v0) {
                        }
                        else if(v1 < v4_2 + 0x3358CD22) {
                        }
                        else if(v1 > v4_2 + 853350601) {
                        }
                        else if(v2 < v6 - 20) {
                        }
                        else if(v2 <= v6 + 20) {
                            goto label_2236;
                        }

                        return;
                    }

                label_2236:
                    ht.ah(false, 2093944040);
                    return;
                }
            }

            v3_3 = bi.bt * v7_1 - 80;
            v5_1 = hq.bp * v15 + 120;
            if((v0) && v1 >= v3_3 - 0x7C6F7E90 && v1 <= v3_3 - 948803097 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                ep.bh(0x7F2098DB);
                ax.bf(gs.jr, gs.jp, gs.jt, v9);
                hq.cm = 0x76B42ACE;
                return;
            }

            v3_3 = bi.bt * 0xA4B80897 + 80;
            if((v0) && v1 >= v3_3 - 75 && v1 <= v3_3 + 0x2E17918D && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                fz.az(true, false, -2000015542);
                return;
            }

            if(!v4) {
                return;
            }

            hq.cm = bi.at(0xAE8E9CBA) * 0xE53F385D;
            return;
        }
        else if(v4) {
            client.al.aba(0xF69CA9B).bd(0xC63A7762);
            return;
        }
        else {
            ah v4_1 = client.al.aba(1013170350).bh(0x69745352);
            if(v4_1 != null && ((v4_1.hf(-6)) || (v4_1.ad(0xF1D505A9)))) {
                v7_1 = hq.by * v13 - 0x66AB14B3;
                v10 = hq.bp * 0x5D59F3CB - 0x3A5FA76B - 0x7660A09E;
                v5_1 = hq.au.ae / v8;
                v11 = hq.au.ar;
                if((v0) && v1 >= v7_1 - v5_1 && v1 <= v7_1 + v5_1 && v2 >= v10 && v2 <= v10 + v11) {
                    if(v4_1.hf(-122)) {
                        if(!dw.bx(v8, 572831099) && !dv.bg(v8, 24)) {
                            if(he.ay(v8, 0x75)) {
                            }
                            else {
                                bz.bb(76);
                                goto label_431;
                            }
                        }

                        return;
                    }
                    else {
                        if(!v4_1.ad(1095208681)) {
                            goto label_431;
                        }

                        if(!dw.bx(3, 0xDD4B3F9C) && !dv.bg(3, -12)) {
                            if(he.ay(3, 0x75)) {
                            }
                            else {
                                fs.bc(1098824937);
                                goto label_431;
                            }
                        }

                        return;
                    }
                }

            label_431:
                v10 += v11 + 6;
                if((!v0 || v1 < v7_1 - v5_1 || v1 > v7_1 + v5_1 || v2 < v10 || v2 > v11 + v10) && !v3) {
                    return;
                }

                if(!dw.bx(1, -1135045421) && !dv.bg(1, 13)) {
                    if(he.ay(1, 101)) {
                    }
                    else {
                        client.al.aba(-232635803).gj("crsG39", 0x92ABC644);
                        eh.ak(false, 0xD7B044D1);
                        return;
                    }
                }

                return;
            }

            v4_2 = bi.bt * v7_1 + 400380170;
            v5_1 = hq.bp * 0x30414667 + 100 + v10;
            if((v0) && v1 >= v4_2 + 1036378026 && v1 <= v4_2 - 0x1E0C377A && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                if(!dw.bx(0, -1110869579)) {
                    if(dv.bg(0, -30)) {
                    }
                    else {
                        fg.bz(1222017761);
                        goto label_493;
                    }
                }

                return;
            }

        label_493:
            v4_2 = bi.bt * -2062201079 + 0x618A0E7E;
            if((!v0 || v1 < v4_2 - 75 || v1 > v4_2 - 0x220CB705 || v2 < v5_1 - 20 || v2 > v5_1 + v10) && !v3) {
                return;
            }

            if(!dw.bx(1, -174310674) && !dv.bg(1, v12)) {
                if(he.ay(1, 66)) {
                }
                else {
                    client.al.aba(0x866D00F5).gj("crsG39", 0xF37528F2);
                    eh.ak(false, 0xB7F4311A);
                    return;
                }
            }

            return;
        }
    }

    static void dk() {
        if(2 == hq.cm * 80640479) {
            if(hq.dq * 0x8FB0AC3B == 0) {
                if(hq.cg.length() > 0) {
                    hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
                }
            }
            else if(hq.dq * 0xD7BE11E1 == 1 && hq.co.length() > 0) {
                hq.co = hq.co.substring(0, hq.co.length() - 1);
            }
        }
        else if(hq.cm * -129160850 == 4) {
            if(da.ds.length() > 0) {
                da.ds = da.ds.substring(0, da.ds.length() - 1);
            }
        }
        else if(hq.cm * 0x25EFB85C == 5 && hq.cg.length() > 0) {
            hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
        }
    }

    static void dl() {
        if(!dw.bx(hq.da * 0xCCAE403B, 0x9076A18D)) {
            int v1 = 0xDF7DE603;
            if(dv.bg(hq.da * v1, 10)) {
            }
            else {
                int v2 = hq.da * -44814038;
                if(v2 != 0) {
                    switch(v2) {
                        case 2: {
                            goto label_51;
                        }
                        case 3: {
                            goto label_42;
                        }
                        case 4: {
                            goto label_33;
                        }
                    }

                    if(!he.ay(hq.da * v1, 80)) {
                        client.al.aba(0xCD793CAE).gj("crsG39", 0xE4E5DB07);
                        eh.ak(false, 0xABA702BA);
                        goto label_64;
                    label_33:
                        if(!he.ay(hq.da * 0xDA40BD9D, 0x76)) {
                            fz.az(false, false, 0x6F4C4D66);
                            goto label_64;
                        label_51:
                            if(!he.ay(hq.da * 0xF9D82C51, 0x7C)) {
                                bz.bb(36);
                                goto label_64;
                            label_42:
                                if(!he.ay(hq.da * 894088011, 108)) {
                                    fs.bc(0xE108EEC);
                                }
                            }
                        }
                    }
                }
                else {
                    fg.bz(2088584504);
                    ht.ah(false, 0xA5783E77);
                }

            label_64:
                hq.da = 633703253;
                return;
            }
        }
    }

    static void dm(char arg6) {
        int v0;
        int v1 = 0xF7EE5BF5;
        int v2 = 320;
        int v3 = 0;
        if(hq.cm * v1 == 2) {
            v0 = 0;
            while(v0 < hq.dg.length()) {
                if(arg6 == hq.dg.charAt(v0)) {
                    v3 = 1;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }

            if(v3 == 0) {
                return;
            }

            v1 = 0xF4A0196B;
            if(hq.dq * v1 == 0) {
                if(hq.cg.length() >= v2) {
                    return;
                }

                hq.cg = hq.cg + arg6;
                return;
            }

            if(1 != hq.dq * v1) {
                return;
            }

            if(hq.co.length() >= 20) {
                return;
            }

            hq.co = hq.co + arg6;
        }
        else {
            if(4 == hq.cm * v1) {
                v0 = 0;
                while(v0 < hq.ek.length()) {
                    if(arg6 == hq.ek.charAt(v0)) {
                        v3 = 1;
                    }
                    else {
                        ++v0;
                        continue;
                    }

                    break;
                }

                if(v3 == 0) {
                    return;
                }

                if(da.ds.length() >= 6) {
                    return;
                }

                da.ds = da.ds + arg6;
                return;
            }

            if(hq.cm * v1 != 5) {
                return;
            }

            v0 = 0;
            while(v0 < hq.dg.length()) {
                if(arg6 == hq.dg.charAt(v0)) {
                    v3 = 1;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }

            if(v3 == 0) {
                return;
            }

            if(hq.cg.length() >= v2) {
                return;
            }

            hq.cg = hq.cg + arg6;
        }
    }

    static void dn() {
        int v1 = 0xDF7DE603;
        if(!dw.bx(hq.da * v1, 0xC1308242)) {
            if(dv.bg(hq.da * v1, 14)) {
            }
            else {
                int v2 = hq.da * -2090992247;
                if(v2 != 0) {
                    byte v3 = 107;
                    switch(v2) {
                        case 2: {
                            goto label_50;
                        }
                        case 3: {
                            goto label_42;
                        }
                        case 4: {
                            goto label_34;
                        }
                    }

                    if(!he.ay(hq.da * 0xE00ACBEF, 0x6F)) {
                        client.al.aba(0xB56AF6BF).gj("crsG39", 0xF90845B9);
                        eh.ak(false, 0xD135706C);
                        goto label_61;
                    label_50:
                        if(!he.ay(hq.da * v1, v3)) {
                            bz.bb(0x7F);
                            goto label_61;
                        label_34:
                            if(!he.ay(hq.da * v1, 104)) {
                                fz.az(false, false, 382145057);
                                goto label_61;
                            label_42:
                                if(!he.ay(hq.da * -645183960, v3)) {
                                    fs.bc(0x78056C87);
                                }
                            }
                        }
                    }
                }
                else {
                    fg.bz(0x3A0B4BF6);
                    ht.ah(false, 0x1DA77B);
                }

            label_61:
                hq.da = 633703253;
                return;
            }
        }
    }

    static void do(boolean arg2) {
        hq.cm = bi.at(292820965) * -443036221;
        client.al.aba(0x9C31543B).gc(-1300013813);
        if(arg2) {
            hq.cg = "";
            hq.co = "";
            mf.dj = 0;
            da.ds = "";
        }
    }

    static void dp(int arg2) {
        if(client.al.aba(0xD25A6288).gu(-18)) {
            client.al.aba(0x28601EBE).gl(1497608652).ay(arg2, 0x6FE0D173);
        }
    }

    static int dq() {
        if(hp.ea.ai(1)) {
            ls v0 = client.al.aba(0xC56695CD);
            hp.ea.ad = v0.bv("wgahnagl", 0, 57) * 0x18C06371;
            hq.dv = v0.bt("name", "", -76);
            if(hp.ea.ad * 0x8251FD91 == 0 && -1000 != hp.ea.ad * -702888049) {
                hq.dv = "";
                v0.bq(new String[]{"name"}, -116);
                return 0;
            }

            if(hq.dv.isEmpty()) {
                hp.ea.ad = 0;
                v0.bq(new String[]{"wgahnagl"}, -39);
                return 0;
            }

            return 10;
        }

        hp.ea.ad = 0;
        hq.dv = "";
        return 0;
    }

    static void dr() {
        int v1 = 0xDF7DE603;
        if(!dw.bx(hq.da * v1, 0xD26A6BAB)) {
            if(dv.bg(hq.da * v1, 84)) {
            }
            else {
                int v0 = hq.da * v1;
                if(v0 != 0) {
                    switch(v0) {
                        case 2: {
                            goto label_47;
                        }
                        case 3: {
                            goto label_39;
                        }
                        case 4: {
                            goto label_31;
                        }
                    }

                    if(!he.ay(hq.da * v1, 100)) {
                        client.al.aba(0x3F255D1E).gj("crsG39", -1290064286);
                        eh.ak(false, -1192459306);
                        goto label_59;
                    label_39:
                        if(!he.ay(hq.da * v1, 0x40)) {
                            fs.bc(1908960638);
                            goto label_59;
                        label_47:
                            if(!he.ay(hq.da * v1, 76)) {
                                bz.bb(87);
                                goto label_59;
                            label_31:
                                if(!he.ay(hq.da * v1, 0x6F)) {
                                    fz.az(false, false, 0x7F447019);
                                }
                            }
                        }
                    }
                }
                else {
                    fg.bz(1824960605);
                    ht.ah(false, 0x578D9F94);
                }

            label_59:
                hq.da = 633703253;
                return;
            }
        }
    }

    static void ds(jz arg16, fa arg17) {
        int v4_2;
        int v5_1;
        ls v1_3;
        la v0_4;
        ar v0_2;
        int v6_1;
        int v3_1;
        int v8_2;
        int v9_1;
        if(hq.ea) {
            jk.bo(arg16, arg17, 2106424007);
            return;
        }

        int v1 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 0xEE0C033F;
        boolean v0 = hq.fz.an;
        boolean v3 = hq.fz.ap;
        boolean v4 = hq.fz.aj;
        boolean v5 = hq.fz.ad;
        hq.fz.ae(6770);
        if((v0) && v1 >= hq.ab * 0x4D586FC3 + 700 && v1 < hq.ab * 0x4D586FC3 + 0x2FD && v2 >= 438 && v2 < 503) {
            hu v8 = li.rg;
            boolean v9 = !li.rg.ar ? true : false;
            v8.ar = v9;
            fr.an(0xF4C88864);
            if(!li.rg.ar) {
                bi.al(gn.dv, "scape main", "", 0xFF, false, 484631530);
                goto label_67;
            }

            gb.an(-279037700);
        }

    label_67:
        if(client.ac * 0x498EF1C3 == 5) {
            return;
        }

        if(hq.fe * 0x61810D62574D4ADL == -1) {
            hq.fe = (ji.ax(0x2076E2C1) + 1000) * 0x47A1B3D48807AF25L;
        }

        long v8_1 = ji.ax(0x2076E2C1);
        if((aa.bd(0)) && hq.fd * -8957420507059323547L == -1) {
            hq.fd = v8_1 * -6157203130767709075L;
            if(hq.fd * -8957420507059323547L > hq.fe * 0x61810D62574D4ADL) {
                hq.fe = hq.fd * -7353492469576586599L;
            }
        }

        if(client.ac * 0x498EF1C3 != 10 && 11 != client.ac * 0x498EF1C3) {
            return;
        }

        int v10 = 104778515;
        int v11 = 20;
        if(en.af == ly.ax) {
            if(v0) {
                v9_1 = hq.ab * 0x4D586FC3 + v11;
                v8_2 = 0x1C0;
                if(v1 >= v9_1 && v1 <= v9_1 + 100 && v2 >= v8_2 && v2 <= 483) {
                    bs.bt(924705029);
                    return;
                }

                if(jl.fk == null) {
                    goto label_220;
                }

                if(v2 < jl.fk.al * 0xC9ACBFBD - 30) {
                    goto label_220;
                }

                if(v2 > jl.fk.ar * 0x7EDCA66B + jl.fk.al * 0xC9ACBFBD + 30) {
                    goto label_220;
                }

                if(v1 >= jl.fk.ax * v10 && v1 <= jl.fk.ae * 0xD1D68747 + jl.fk.ax * v10) {
                    client.al.aba(0x7415ED9A).ga(-2).ax(gs.og, true, 1330409766);
                    goto label_220;
                }

                if(v1 >= bl.fv.ax * v10 && v1 <= bl.fv.ax * v10 + bl.fv.ae * 0xD1D68747) {
                    client.al.aba(-1609182003).ga(-8).ax(gs.oz, true, 224550475);
                    goto label_220;
                }

                if(v1 < eh.fc.ax * v10) {
                    goto label_220;
                }

                if(v1 > eh.fc.ae * 0xD1D68747 + eh.fc.ax * v10) {
                    goto label_220;
                }

                client.al.aba(-63010409).gn(0x29DE1FC5);
            }

        label_220:
            if(li.ab == null) {
                goto label_224;
            }

            bs.bt(924705029);
        }

    label_224:
        v8_2 = client.al.abs(0xB6848A76);
        if(v8_2 != hq.ed * 0x2AABEFC5) {
            hq.ed = 0x7053B70D * v8_2;
            bf.ee = client.bj * -484602577;
        }

        v9_1 = 2;
        if(client.bj * -2077001153 >= bf.ee * 0x6FCD3FF1 + 8) {
            if(-1 != hq.ed * 0x2AABEFC5 && v8_2 < fj.az * 0x46AFBD5B + 0xAB) {
                hq.bo = (v8_2 - fj.az * 0x46AFBD5B) / v9_1 * 0x6CE7CFB7;
                if(hq.bo * 0x337D3E07 < 0) {
                    hq.bo = 0;
                }
                else {
                }

                goto label_273;
            }

            hq.bo = -1093157059;
        }

    label_273:
        int v12 = 0x1A8B6787;
        if(hq.bp * v12 != hq.bo * 0x337D3E07) {
            float v13 = ((((float)(hq.bo * 0x337D3E07))) - hq.bw) * 0.25f;
            if(v13 > -0.5f && v13 < 0.5f) {
                v13 = ((float)(hq.bo * 0x337D3E07 - hq.bp * v12));
            }

            hq.bw += v13;
            hq.bp = (((int)hq.bw)) * 0xF499AE37;
        }

        v8_2 = 0xD700E425;
        if((v0) && (v1 < bi.bt * v8_2 - hq.af.ae / v9_1 || v1 > hq.af.ae / v9_1 + bi.bt * v8_2 || v2 < hq.bp * v12 || v2 > hq.af.ar + hq.bp * v12)) {
            client.al.aba(0xD7B7C11A).gc(0xA384DA56);
        }

        int v14 = 0xF7EE5BF5;
        int v15 = 287427031;
        if(hq.cm * v14 != 0) {
            if(hq.cm * v14 == 1) {
                v5_1 = bi.bt * v8_2 - 80;
                v9_1 = hq.bp * v12 + 150;
                if((v3) || (v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v9_1 - 20 && v2 <= v9_1 + 20) {
                    hq.df = true;
                    hp.ag(0x5D7ABF5D);
                }

                v3_1 = bi.bt * v8_2 + 80;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v3_1 - 75) {
                    }
                    else if(v1 > v3_1 + 75) {
                    }
                    else if(v2 < v9_1 - 20) {
                    }
                    else if(v2 <= v9_1 + v11) {
                        goto label_545;
                    }

                    return;
                }

            label_545:
                ht.ah(false, 0x5CDA1728);
                return;
            }

            int v13_1 = hq.cm * v14;
            v14 = 0x63D3C206;
            if(v13_1 == v9_1) {
                ar v6 = client.al.aba(0xEE8CEB3F).gl(0x523FDD4D);
                if(v6 != null) {
                    v6_1 = v6.aw(0x320D8D5D);
                    if(v6_1 >= 0) {
                        hq.dq = v6_1 * 0xCEB54B43;
                    }
                }

                v6_1 = hq.bp * v12 + 82;
                if((v0) && v1 >= bi.bt * v8_2 - hq.af.ae / v9_1 && v1 <= bi.bt * v8_2 + hq.af.ae / v9_1 && v2 >= v6_1 - 12 && v2 < v6_1 + 2) {
                    ik.ab(0xA29B4196);
                }

                v6_1 += 15;
                if((v0) && v1 >= bi.bt * v8_2 - hq.af.ae / v9_1 && v1 <= hq.af.ae / v9_1 + bi.bt * v8_2 && v2 >= v6_1 - 12 && v2 < v6_1 + v9_1) {
                    ev.af(0xEC5D30A9);
                }

                v6_1 = hq.bp * v12 + 190;
                if(em.cl != null) {
                    v11 = em.cl.ae * 0xD1D68747 / v9_1;
                    if((v0) && v1 >= em.cl.ax * v10 - v11 && v1 <= em.cl.ax * v10 + v11 && v2 >= v6_1 - 15 && v2 < v6_1) {
                        switch(hq.cz * 0x2D49CD0F) {
                            case 1: {
                                goto label_651;
                            }
                            case 2: {
                                goto label_642;
                            }
                        }

                        goto label_654;
                    label_642:
                        client.al.aba(0x39AAC171).ga(91).ax("https://support.runescape.com/hc/en-gb", true, 0x1F476C83);
                        goto label_654;
                    label_651:
                        ha.ac(0xCDFA2D42);
                        return;
                    }
                }

            label_654:
                v6_1 = bi.bt * v8_2 - 80;
                v10 = hq.bp * v12 + 150;
                if((v0) && v1 >= v6_1 - 75 && v1 <= v6_1 + 75 && v2 >= v10 - 20 && v2 <= v10 + 20) {
                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ik.ab(0xFEA55CF);
                        ax.bf(gs.es, gs.eb, gs.eh, v14);
                        return;
                    }
                    else if(hq.co.length() == 0) {
                        ev.af(0xE658512);
                        ax.bf(gs.ec, gs.ei, gs.ex, v14);
                        return;
                    }
                    else {
                        client.al.aba(0x6D530886).gc(0xCE4D3CBB);
                        ax.bf(gs.jf, gs.jz, gs.ja, v14);
                        he.bm(hq.co, client.al.au, -101);
                        return;
                    }
                }

                v6_1 = hq.by * v15 + 260;
                if((v0) && v1 >= v6_1 - 75 && v1 <= v6_1 + 75 && v2 >= v10 - 20 && v2 <= v10 + 20) {
                    ht.ah(true, 0x96F79938);
                    hq.dy = true;
                }

                v6_1 = bi.bt * v8_2 - 0x75;
                v10 = hq.bp * v12 + 106;
                boolean v6_2 = v1 < v6_1 || v1 >= ct.du * 0x7F06EA49 + v6_1 || v2 < v10 || v2 >= gy.dm * -34920419 + v10 ? false : true;
                hq.de = v6_2;
                if((v0) && (hq.de)) {
                    client.er ^= 1;
                    if(!client.er && li.rg.ap != null) {
                        li.rg.ap = null;
                        fr.an(0xA4AB5C19);
                    }
                }

                if(client.al.abd(0x5E03CC5D) == 3 || client.al.abd(2078804063) == v9_1) {
                    v6_1 = hq.bp * v12 + 210;
                    if((v0) && v1 >= bi.bt * v8_2 - hq.au.ae / v9_1 && v1 <= hq.au.ae / v9_1 + bi.bt * v8_2 && v2 >= v6_1 && v2 <= v6_1 + hq.au.ar) {
                        fg.bz(1730529335);
                    }
                }

                v6_1 = bi.bt * v8_2 + 24;
                v8_2 = hq.bp * v12 + 106;
                boolean v1_1 = v1 < v6_1 || v1 >= v6_1 + ct.du * 0x7F06EA49 || v2 < v8_2 || v2 >= gy.dm * -34920419 + v8_2 ? false : true;
                hq.dk = v1_1;
                if((v0) && (hq.dk)) {
                    hu v0_1 = li.rg;
                    v1_1 = !li.rg.aj ? true : false;
                    v0_1.aj = v1_1;
                    if(!li.rg.aj) {
                        hq.cg = "";
                        li.rg.ap = null;
                        v0_2 = client.al.aba(-1402837838).gl(0x50DCF0D7);
                        if(v0_2 != null) {
                            v0_2.as("", 0, -2044259495);
                        }

                        ei.ad(0xF43F2E3A);
                    }

                    fr.an(131600002);
                }

                if(v4) {
                    ht.ah(true, 1694640002);
                    hq.dy = true;
                    return;
                }

                if(v3) {
                    if(hq.dq * 0xF4A0196B == 0) {
                        ev.af(-491071719);
                        return;
                    }

                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ax.bf(gs.es, gs.eb, gs.eh, v14);
                        ik.ab(-1092220290);
                        return;
                    }

                    if(hq.co.length() == 0) {
                        ax.bf(gs.ec, gs.ei, gs.ex, v14);
                        ev.af(0xE4B606DC);
                        return;
                    }

                    client.al.aba(0xE95BF91).gc(0x1AEBB430);
                    ax.bf(gs.jf, gs.jz, gs.ja, v14);
                    he.bm(hq.co, client.al.au, -119);
                    return;
                }

                if(!v5) {
                    return;
                }

                if(hq.dq * 0xF4A0196B == 0) {
                    ev.af(0xE6AF00EB);
                    return;
                }

                ik.ab(0x97D7521E);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 3) {
                v5_1 = hq.by * v15 + 180;
                v6_1 = hq.bp * v12 + 105;
                if((v3) || (v4) || (v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    ht.ah(false, 0xAE5F6AE7);
                }

                v3_1 = hq.by * v15 + 180;
                v4_2 = hq.bp * v12 + 0x9B;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                ha.ac(0x1B506BEC);
                return;
            }

            if(4 == hq.cm * 0xF7EE5BF5) {
                v5_1 = hq.by * v15 + 100;
                v6_1 = hq.bp * v12 + 150;
                if(!v3 && (!v0 || v1 < v5_1 - 75 || v1 > v5_1 + 75 || v2 < v6_1 - 20 || v2 > v6_1 + 20)) {
                    if((v0) && v1 >= hq.by * v15 + 50 && v1 <= hq.by * v15 + 170 && v2 >= hq.bp * v12 + 92 && v2 <= hq.bp * v12 + 0x7D) {
                        ar v3_2 = client.al.aba(0xCF7FBD26).gl(0x53B64F89);
                        if(v3_2 == null) {
                            v3_2 = fj.ao(0x87F08C97);
                        }

                        if(v3_2 == null) {
                            goto label_1021;
                        }

                        v3_2.at(-1901119902);
                    }

                label_1021:
                    if((v0) && v1 >= hq.by * v15 + 0xAB && v1 <= hq.by * v15 + 310 && v2 >= hq.bp * v12 + 92 && v2 <= hq.bp * v12 + 0x7D) {
                        hq.dy ^= 1;
                    }

                    if((v0) && v1 >= hq.by * v15 + 0x92 && v1 <= hq.by * v15 + 0xD6 && v2 >= hq.bp * v12 + 180 && v2 <= hq.bp * v12 + 0xC0) {
                        la v3_3 = client.al.aba(734910324).ga(61);
                        v3_3.ax(il.is("secure", true, 0xE4990EB1) + "m=totp-authenticator/disableTOTPRequest", true, 0x456C457);
                    }

                    v3_1 = hq.by * v15 + 260;
                    if(!v4) {
                        if(!v0) {
                        }
                        else if(v1 < v3_1 - 75) {
                        }
                        else if(v1 > v3_1 + 75) {
                        }
                        else if(v2 < v6_1 - 20) {
                        }
                        else if(v2 <= v6_1 + 20) {
                            goto label_1097;
                        }

                        return;
                    }

                label_1097:
                    ew.bc(false, 0x33F46EC4);
                    ht.ah(true, 0xA56B3993);
                    return;
                }

                da.ds.trim();
                if(da.ds.length() != 6) {
                    ax.bf(gs.bg, gs.bz, gs.bh, v14);
                    return;
                }

                mf.dj = Integer.parseInt(da.ds) * 0xD79967D1;
                da.ds = "";
                ax.bf(gs.jf, gs.jz, gs.ja, v14);
                if(hp.ea.ai(1)) {
                    hp.ea.ar(true, 0xAE3DFBF8);
                }

                ew.bc(true, 1110330175);
                dc.ay(20, -45);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 5) {
                v5_1 = hq.by * v15 + 180;
                v6_1 = hq.bp * v12 + 109;
                if((v0) && v1 >= v5_1 - 140 && v1 <= v5_1 + 140 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    v0_2 = client.al.aba(0xB42BD572).gl(0x769466C8);
                    if(v0_2 == null) {
                        v0_2 = ga.as(0x8F101C74);
                    }

                    if(v0_2 != null) {
                        v0_2.at(0xBD932ED5);
                    }

                    return;
                }

                v5_1 = hq.by * v15 + 100;
                v6_1 = hq.bp * v12 + 150;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    ev.bd(1);
                    return;
                }

                v5_1 = hq.by * v15 + 260;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    eh.ak(true, -1635107850);
                }

                v5_1 = hq.bp * v12 + 190;
                if(dq.ck != null) {
                    v8_2 = dq.ck.ae * 0xD1D68747 / v9_1;
                    if((v0) && v1 >= dq.ck.ax * v10 - v8_2 && v1 <= dq.ck.ax * v10 + v8_2 && v2 >= v5_1 - 15 && v2 < v5_1) {
                        la v5_3 = client.al.aba(0xDF21E16F).ga(97);
                        v5_3.ax(il.is("secure", true, 0xC4DCD80C) + "m=weblogin/g=oldscape/cant_log_in", true, 0xDAE1C26);
                    }
                }

                if(v4) {
                    eh.ak(true, 0xD7D851CA);
                }
                else if(v3) {
                    ev.bd(1);
                    return;
                }

                v3_1 = hq.by * v15 + 180;
                v4_2 = hq.bp * v12 + 0xB9;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 100) {
                    return;
                }

                if(v1 > v3_1 + 100) {
                    return;
                }

                if(v2 < v4_2 - 15) {
                    return;
                }

                if(v2 > v4_2 + 15) {
                    return;
                }

                ls v0_3 = client.al.aba(0xA0152359);
                v0_3.gj("flSB8L", 0x667E07ED);
                v0_4 = v0_3.ga(-32);
                v0_4.ax(il.is("secure", true, 0x81125AF1) + "m=weblogin/g=oldscape/cant_log_in", true, 0xB52FB11F);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 6) {
                if((v3) || (v4)) {
                    ht.ah(false, 0x6F8CE982);
                }

                v1 = hq.bp * v12 + 150;
                if(!v0) {
                    return;
                }

                if(v2 < v1 - 20) {
                    return;
                }

                if(v2 > v1 + 20) {
                    return;
                }

                ht.ah(false, 0x6DF55D9);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 7) {
                v3_1 = hq.by * v15 + 100;
                v4_2 = hq.bp * v12 + 150;
                if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 75 && v2 >= v4_2 - 20 && v2 <= v4_2 + 20) {
                    v0_4 = client.al.aba(0x37200F2C).ga(0x4F);
                    v0_4.ax(il.is("secure", true, -902703419) + "m=dob/set_dob.ws", true, 1237009367);
                    ax.bf(gs.mq, gs.ma, gs.md, v14);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_1 = hq.by * v15 + 260;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                eh.ak(true, 0xC68FDE00);
                return;
            }

            if(8 == hq.cm * 0xF7EE5BF5) {
                v3_1 = hq.by * v15 + 100;
                v4_2 = hq.bp * v12 + 150;
                if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 75 && v2 >= v4_2 - 20 && v2 <= v4_2 + 20) {
                    client.al.aba(0xA6DF94A8).ga(15).ax(gs.og, true, 0x1C9B5489);
                    ax.bf(gs.mq, gs.ma, gs.md, v14);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_1 = hq.by * v15 + 260;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                ht.ah(true, 0x9380852D);
                return;
            }

            if(9 == hq.cm * 0xF7EE5BF5) {
                v5_1 = hq.by * v15 + 180;
                v6_1 = hq.bp * v12 + 140;
                if(!v3 && !v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 75) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v6_1 - 20) {
                    }
                    else if(v2 <= v6_1 + 20) {
                        goto label_1454;
                    }

                    return;
                }

            label_1454:
                ht.ah(false, 0x506BDBEE);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 10) {
                v5_1 = hq.by * v15 + 180;
                v6_1 = hq.bp * v12 + 38;
                if(((v3) || (v0) && v1 >= v5_1 - 109 && v1 <= v5_1 + 109 && v2 >= v6_1 && v2 <= v6_1 + 68) && !he.ay(4, 0x77)) {
                    fz.az(false, false, 0xE1C53F5E);
                }

                v3_1 = hq.bp * v12 + 140;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 75) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v3_1) {
                    }
                    else if(v2 <= v3_1 + 40) {
                        goto label_1498;
                    }

                    return;
                }

            label_1498:
                hq.cm = 0xD9B76BFF;
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 11) {
                v4_2 = bi.bt * v8_2 - 80;
                v5_1 = hq.bp * v12 + 120;
                if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    hp.ea.af(67);
                    client.al.aba(1936970958).bq(new String[]{"wgahnagl", "name"}, -125);
                    ht.ah(true, 0xAD208AF1);
                }

                v4_2 = bi.bt * v8_2 + 80;
                if((!v0 || v1 < v4_2 - 75 || v1 > v4_2 + 75 || v2 < v5_1 - 20 || v2 > v5_1 + 20) && !v3) {
                    return;
                }

                hq.cm = -193449054;
                return;
            }

            if(12 == hq.cm * 0xF7EE5BF5) {
                v5_1 = bi.bt * v8_2;
                v6_1 = hq.bp * v12 + 55;
                if((v0) && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    if(v1 >= v5_1 - 150 && v1 <= v5_1 - 20) {
                        client.al.aba(0x89CFD179).ga(-3).ax(gs.og, true, 0x2B5D882E);
                        goto label_1594;
                    }

                    if(v1 < v5_1) {
                        goto label_1594;
                    }

                    if(v1 > v5_1 + 90) {
                        goto label_1594;
                    }

                    client.al.aba(0x8FE480C9).ga(-85).ax(gs.oz, true, 0x60B71490);
                }

            label_1594:
                v5_1 = bi.bt * v8_2 - 80;
                v6_1 = hq.bp * v12 + 140;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20) {
                    client.al.aba(0x53698797).fs(-563295800);
                    hp.ag(0x5205983B);
                }

                v5_1 = bi.bt * v8_2 + 80;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v6_1 - 20 && v2 <= v6_1 + 20 || (v3)) {
                    hq.da = 633703253;
                    hq.cm = 0xA435DCB9;
                }

                if(!v4) {
                    return;
                }

                hq.da = 633703253;
                ht.ah(false, 2095495005);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 13) {
                v3_1 = bi.bt * v8_2;
                v5_1 = hq.bp * v12 + 150;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v3_1 - 75) {
                    }
                    else if(v1 > v3_1 + 75) {
                    }
                    else if(v2 < v5_1 - 20) {
                    }
                    else if(v2 <= v5_1 + 20) {
                        goto label_1664;
                    }

                    return;
                }

            label_1664:
                ht.ah(false, 0x7EEBEE09);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 14) {
                String v3_4 = "";
                switch(hq.ch * 0x803A91D9) {
                    case 0: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                        break;
                    }
                    case 1: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                        break;
                    }
                    default: {
                        ht.ah(false, 0x9B20116B);
                        break;
                    }
                }

                v4_2 = hq.by * v15 + 180;
                v5_1 = hq.bp * v12 + 105;
                if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    client.al.aba(-224034408).ga(-43).ax(v3_4, true, 0x6D1D8E60);
                    ax.bf(gs.mq, gs.ma, gs.md, v14);
                    hq.cm = 0x5F7B522E;
                    return;
                }

                v3_1 = hq.by * v15 + 180;
                v4_2 = hq.bp * v12 + 0x9B;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + 20) {
                    return;
                }

                if(hp.ea.ai(1)) {
                    ht.ah(false, 0xCE4E563A);
                    return;
                }

                eh.ak(false, 0xA5E0FE1A);
                return;
            }

            v9_1 = 0xF7EE5BF5;
            if(16 != hq.cm * v9_1) {
                if(hq.cm * v9_1 == 19) {
                }
                else if(hq.cm * v9_1 == 18) {
                    long v0_5 = ji.ax(0x2076E2C1);
                    if(-1 == hq.dt * 0x24B4CA886ADBD147L) {
                        hq.dt = -6166903917654538121L * v0_5;
                    }

                    if(v0_5 - hq.dt * 0x24B4CA886ADBD147L <= 2000) {
                        return;
                    }

                    hq.dt = 0x55953E707FC37789L;
                    fz.az(true, false, 0x713830F);
                    return;
                }
                else {
                    if(17 == hq.cm * 0xF7EE5BF5) {
                        ah v0_6 = client.al.aba(0xE07FB5BF).bh(1555400542);
                        if(v0_6 != null) {
                            am v0_7 = v0_6.hs(0x7D4BB023);
                            if(v0_7 == null) {
                                return;
                            }

                            if(v0_7.ax(71)) {
                                ax.bf(gs.jy, gs.js, gs.jl, v14);
                                hq.cm = 0x1E71F68A;
                                return;
                            }

                            ax.bf(gs.jv, gs.ke, gs.ka, v14);
                            hq.cm = 0x3B12EE7;
                            return;
                        }

                        ax.bf(gs.jv, gs.ke, gs.ka, v14);
                        hq.cm = 0x3B12EE7;
                        return;
                    }

                    if(hq.cm * 0xF7EE5BF5 == 15) {
                        ag v0_8 = hp.ea.am(970617913);
                        if(v0_8 == null) {
                            return;
                        }

                        if(v0_8.ax(0x8D9A0EDB)) {
                            hq.cm = -193449054;
                            ax.bf(gs.jf, gs.jz, gs.ja, v14);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(-708428988).bo("wgahnagl", hp.ea.ad * 0x8251FD91, -94);
                            hp.ea.an(854504261);
                            ew.bc(false, 0x45AF9BE2);
                            dc.ay(20, -6);
                        }
                        else {
                            v1_3 = client.al.aba(0x2EB4426B);
                            switch(v0_8.al(0xFD2F343F)) {
                                case 1: {
                                    goto label_1885;
                                }
                                case 2: {
                                    goto label_1875;
                                }
                            }

                            v1_3.gj("gcu2QC", 0xFB9FBFE0);
                            ax.bf(gs.kr, gs.ku, gs.kb, v14);
                            hq.cm = 0xF38FB45;
                            goto label_1894;
                        label_1875:
                            v1_3.gj("gcu2QC", 1204695057);
                            ax.bf(gs.kf, gs.kd, gs.kj, v14);
                            hq.cm = 0xF38FB45;
                            goto label_1894;
                        label_1885:
                            v1_3.gj("gcu1M3", -734800009);
                            ax.bf(gs.kx, gs.kz, gs.kv, v14);
                            hq.cm = 0x29F9C2E8;
                        }

                    label_1894:
                        hp.ea.az(null, -97);
                        return;
                    }

                    if(hq.cm * 0xF7EE5BF5 == 23) {
                        av v0_9 = hp.ea.ag(0x3A09A41);
                        if(v0_9 == null) {
                            return;
                        }

                        if(v0_9.ax(0xC6F8B70)) {
                            hq.cm = -193449054;
                            ax.bf(gs.jf, gs.jz, gs.ja, v14);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(0xD25CAFC4).bo("wgahnagl", hp.ea.ad * 0x8251FD91, -85);
                            hp.ea.an(0x3B54CAF2);
                            ew.bc(false, 1237023607);
                            dc.ay(20, -115);
                        }
                        else {
                            v1_3 = client.al.aba(0xD5674F96);
                            if(v0_9.al(0x4245752D) != 1) {
                                v1_3.gj("gsu6PD", 0xA8405267);
                                ax.bf(gs.ky, gs.kh, gs.kk, v14);
                                hq.cm = 0xF38FB45;
                            }
                            else {
                                v1_3.gj("gscD0G", 0x8E941FDF);
                                hq.cm = 0;
                            }
                        }

                        hp.ea.ah(null, 0x7FCD6E81);
                        return;
                    }

                    if(21 == hq.cm * 0xF7EE5BF5) {
                        v4_2 = bi.bt * v8_2 - 80;
                        v5_1 = hq.bp * v12 + 140;
                        if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                            client.al.aba(-2093311591).gm(1);
                            hp.ag(0xDFB78CA7);
                        }

                        v4_2 = bi.bt * v8_2 + 80;
                        if((!v0 || v1 < v4_2 - 75 || v1 > v4_2 + 75 || v2 < v5_1 - 20 || v2 > v5_1 + 20) && !v3) {
                            return;
                        }

                        hq.da = 633703253;
                        ht.ah(false, 0x61EB4FEA);
                        return;
                    }

                    if(hq.cm * 0xF7EE5BF5 == 22) {
                        v4_2 = hq.by * v15 + 180;
                        v5_1 = hq.bp * v12 + 130;
                        if(!v3) {
                            if(!v0) {
                            }
                            else if(v1 < v4_2 - 75) {
                            }
                            else if(v1 > v4_2 + 75) {
                            }
                            else if(v2 < v5_1 - 20) {
                            }
                            else if(v2 <= v5_1 + 20) {
                                goto label_2036;
                            }

                            return;
                        }

                    label_2036:
                        ax.bf(gs.kp, gs.kl, gs.kn, v14);
                        client.al.aba(0x91A94C17).ac(-26);
                        return;
                    }

                    if(24 != hq.cm * 0xF7EE5BF5) {
                        return;
                    }

                    v4_2 = hq.by * v15 + 180;
                    v5_1 = hq.bp * v12 + 140;
                    if(!v3) {
                        if(!v0) {
                        }
                        else if(v1 < v4_2 - 75) {
                        }
                        else if(v1 > v4_2 + 75) {
                        }
                        else if(v2 < v5_1 - 20) {
                        }
                        else if(v2 <= v5_1 + 20) {
                            goto label_2069;
                        }

                        return;
                    }

                label_2069:
                    ht.ah(false, 0x4344C319);
                    return;
                }
            }

            v3_1 = bi.bt * v8_2 - 80;
            v5_1 = hq.bp * v12 + 120;
            if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                ep.bh(0x7F8C55FC);
                ax.bf(gs.jr, gs.jp, gs.jt, v14);
                hq.cm = 0x3932BE2D;
                return;
            }

            v3_1 = bi.bt * v8_2 + 80;
            if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                fz.az(true, false, 0x7DCF004A);
                return;
            }

            if(!v4) {
                return;
            }

            hq.cm = bi.at(0xED154141) * 0xE53F385D;
            return;
        }
        else if(v4) {
            client.al.aba(511850068).bd(0xC63A7762);
            return;
        }
        else {
            ah v4_1 = client.al.aba(0x8FC7C293).bh(2060711661);
            if(v4_1 != null && ((v4_1.hf(-60)) || (v4_1.ad(495131260)))) {
                v5_1 = hq.by * v15 + 180;
                v8_2 = hq.bp * v12 + 58;
                v10 = hq.au.ae / v9_1;
                v11 = hq.au.ar;
                if((v0) && v1 >= v5_1 - v10 && v1 <= v5_1 + v10 && v2 >= v8_2 && v2 <= v8_2 + v11) {
                    if(v4_1.hf(-105)) {
                        if(!dw.bx(v9_1, 0x335418F3) && !dv.bg(v9_1, -48)) {
                            if(he.ay(v9_1, 0x5F)) {
                            }
                            else {
                                bz.bb(0x20);
                                goto label_418;
                            }
                        }

                        return;
                    }
                    else {
                        if(!v4_1.ad(-605630761)) {
                            goto label_418;
                        }

                        if(!dw.bx(3, 0x2EFF0B34) && !dv.bg(3, -39)) {
                            if(he.ay(3, 0x71)) {
                            }
                            else {
                                fs.bc(1954015529);
                                goto label_418;
                            }
                        }

                        return;
                    }
                }

            label_418:
                v8_2 += v11 + 6;
                if((!v0 || v1 < v5_1 - v10 || v1 > v5_1 + v10 || v2 < v8_2 || v2 > v11 + v8_2) && !v3) {
                    return;
                }

                if(!dw.bx(1, 0x2727B1AE) && !dv.bg(1, -103)) {
                    if(he.ay(1, 89)) {
                    }
                    else {
                        client.al.aba(0x39EE35E0).gj("crsG39", -400710018);
                        eh.ak(false, 0xD905D3EE);
                        return;
                    }
                }

                return;
            }

            v4_2 = bi.bt * v8_2 - 80;
            v5_1 = hq.bp * v12 + 100 + v11;
            if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                if(!dw.bx(0, 652970194)) {
                    if(dv.bg(0, -45)) {
                    }
                    else {
                        fg.bz(1221025880);
                        goto label_476;
                    }
                }

                return;
            }

        label_476:
            v4_2 = bi.bt * v8_2 + 80;
            if((!v0 || v1 < v4_2 - 75 || v1 > v4_2 + 75 || v2 < v5_1 - 20 || v2 > v5_1 + v11) && !v3) {
                return;
            }

            if(!dw.bx(1, 0xB2BB589F) && !dv.bg(1, 44)) {
                if(he.ay(1, 98)) {
                }
                else {
                    client.al.aba(0x243D2760).gj("crsG39", 0xCC485DED);
                    eh.ak(false, 0xA5B6860D);
                    return;
                }
            }

            return;
        }
    }

    static int dt() {
        if(hp.ea.ai(1)) {
            ls v0 = client.al.aba(0x24B721CE);
            hp.ea.ad = v0.bv("wgahnagl", 0, -26) * 0x18C06371;
            hq.dv = v0.bt("name", "", 17);
            int v3 = 0x8251FD91;
            if(hp.ea.ad * v3 == 0 && -1000 != hp.ea.ad * v3) {
                hq.dv = "";
                v0.bq(new String[]{"name"}, -74);
                return 0;
            }

            if(hq.dv.isEmpty()) {
                hp.ea.ad = 0;
                v0.bq(new String[]{"wgahnagl"}, 26);
                return 0;
            }

            return 10;
        }

        hp.ea.ad = 0;
        hq.dv = "";
        return 0;
    }

    static void du(char arg6) {
        int v0;
        int v1 = 0xF7EE5BF5;
        int v2 = 320;
        int v3 = 0;
        if(hq.cm * v1 == 2) {
            v0 = 0;
            while(v0 < hq.dg.length()) {
                if(arg6 == hq.dg.charAt(v0)) {
                    v3 = 1;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }

            if(v3 == 0) {
                return;
            }

            v1 = 0xF4A0196B;
            if(hq.dq * v1 == 0) {
                if(hq.cg.length() >= v2) {
                    return;
                }

                hq.cg = hq.cg + arg6;
                return;
            }

            if(1 != hq.dq * v1) {
                return;
            }

            if(hq.co.length() >= 20) {
                return;
            }

            hq.co = hq.co + arg6;
        }
        else {
            if(4 == hq.cm * v1) {
                v0 = 0;
                while(v0 < hq.ek.length()) {
                    if(arg6 == hq.ek.charAt(v0)) {
                        v3 = 1;
                    }
                    else {
                        ++v0;
                        continue;
                    }

                    break;
                }

                if(v3 == 0) {
                    return;
                }

                if(da.ds.length() >= 6) {
                    return;
                }

                da.ds = da.ds + arg6;
                return;
            }

            if(hq.cm * v1 != 5) {
                return;
            }

            v0 = 0;
            while(v0 < hq.dg.length()) {
                if(arg6 == hq.dg.charAt(v0)) {
                    v3 = 1;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }

            if(v3 == 0) {
                return;
            }

            if(hq.cg.length() >= v2) {
                return;
            }

            hq.cg = hq.cg + arg6;
        }
    }

    static void dv(int arg2) {
        if(client.al.aba(0x8E6A9070).gu(-66)) {
            client.al.aba(1977710391).gl(0x5696FB2B).ay(arg2, 506001144);
        }
    }

    static void dw(int arg2) {
        if(2 == hq.cm * 0xF7EE5BF5) {
            hq.dq = arg2 * 0xCEB54B43;
        }
    }

    static void dx() {
        int v1 = 0xDF7DE603;
        if(!dw.bx(hq.da * v1, 0xF044A402)) {
            if(dv.bg(hq.da * v1, -2)) {
            }
            else {
                int v0 = hq.da * v1;
                if(v0 != 0) {
                    switch(v0) {
                        case 2: {
                            goto label_47;
                        }
                        case 3: {
                            goto label_39;
                        }
                        case 4: {
                            goto label_31;
                        }
                    }

                    if(!he.ay(hq.da * v1, 104)) {
                        client.al.aba(0xC4810F41).gj("crsG39", 0x558F9A0D);
                        eh.ak(false, 0x9B858946);
                        goto label_59;
                    label_39:
                        if(!he.ay(hq.da * v1, 68)) {
                            fs.bc(0x4910A948);
                            goto label_59;
                        label_47:
                            if(!he.ay(hq.da * v1, 0x3F)) {
                                bz.bb(69);
                                goto label_59;
                            label_31:
                                if(!he.ay(hq.da * v1, 81)) {
                                    fz.az(false, false, 0xEC7F71A6);
                                }
                            }
                        }
                    }
                }
                else {
                    fg.bz(0x51937054);
                    ht.ah(false, 0xEBF272A9);
                }

            label_59:
                hq.da = 633703253;
                return;
            }
        }
    }

    static void dy(jz arg17, fa arg18) {
        int v4_2;
        int v5_1;
        ls v1_3;
        la v0_4;
        int v3_1;
        int v7;
        ar v0_2;
        int v8_2;
        int v9_1;
        if(hq.ea) {
            jk.bo(arg17, arg18, 0x44E90D6B);
            return;
        }

        int v1 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 0xEE0C033F;
        boolean v0 = hq.fz.an;
        boolean v3 = hq.fz.ap;
        boolean v4 = hq.fz.aj;
        boolean v5 = hq.fz.ad;
        hq.fz.ae(0xB88);
        if((v0) && v1 >= hq.ab * 0x8FC400D4 + 1230489818 && v1 < hq.ab * 0x4D586FC3 + 0x2FD && v2 >= 438 && v2 < 0xF5EA4BA0) {
            hu v8 = li.rg;
            boolean v9 = !li.rg.ar ? true : false;
            v8.ar = v9;
            fr.an(0x8355CEFF);
            if(!li.rg.ar) {
                bi.al(gn.dv, "scape main", "", 0xA0FC035E, false, 0xF461E19);
                goto label_68;
            }

            gb.an(-279037700);
        }

    label_68:
        if(client.ac * 0xF62F8F57 == 5) {
            return;
        }

        if(hq.fe * 0x61810D62574D4ADL == -1) {
            hq.fe = (ji.ax(0x2076E2C1) + 1000) * 0x47A1B3D48807AF25L;
        }

        long v8_1 = ji.ax(0x2076E2C1);
        if((aa.bd(0)) && hq.fd * -8957420507059323547L == -1) {
            hq.fd = v8_1 * -6157203130767709075L;
            if(hq.fd * -8957420507059323547L > hq.fe * 0x61810D62574D4ADL) {
                hq.fe = hq.fd * -7353492469576586599L;
            }
        }

        if(client.ac * 0x498EF1C3 != 10 && 11 != client.ac * 0x6A4FF9CD) {
            return;
        }

        int v10 = 20;
        if(en.af == ly.ax) {
            if(v0) {
                v9_1 = hq.ab * 0x2D8C1500 + v10;
                v8_2 = 0x1C0;
                if(v1 >= v9_1 && v1 <= v9_1 + 100 && v2 >= v8_2 && v2 <= -1858032011) {
                    bs.bt(924705029);
                    return;
                }

                if(jl.fk == null) {
                    goto label_226;
                }

                if(v2 < jl.fk.al * 0x8C7EEFF6 - 30) {
                    goto label_226;
                }

                if(v2 > jl.fk.ar * 0x7EDCA66B + jl.fk.al * 0xC9ACBFBD + 30) {
                    goto label_226;
                }

                if(v1 >= jl.fk.ax * 1450667288 && v1 <= jl.fk.ae * 0xD1D68747 + jl.fk.ax * 0x21A30C34) {
                    client.al.aba(680645761).ga(-18).ax(gs.og, true, -1146046060);
                    goto label_226;
                }

                if(v1 >= bl.fv.ax * 104778515 && v1 <= bl.fv.ax * 104778515 + bl.fv.ae * 0xD1D68747) {
                    client.al.aba(0xCD252CE1).ga(9).ax(gs.oz, true, 0x91F4490B);
                    goto label_226;
                }

                if(v1 < eh.fc.ax * 104778515) {
                    goto label_226;
                }

                if(v1 > eh.fc.ae * 0xD1D68747 + eh.fc.ax * 104778515) {
                    goto label_226;
                }

                client.al.aba(0x8DD8D3DD).gn(1910725349);
            }

        label_226:
            if(li.ab == null) {
                goto label_230;
            }

            bs.bt(924705029);
        }

    label_230:
        v8_2 = client.al.abs(0xB6848A76);
        if(v8_2 != hq.ed * 0xFF9C1137) {
            hq.ed = 0xB02BD6D6 * v8_2;
            bf.ee = client.bj * 0xD4E8AC31;
        }

        v9_1 = 2;
        if(client.bj * -2077001153 >= bf.ee * 0x6FCD3FF1 + 8) {
            if(-1 != hq.ed * 0x71B204D && v8_2 < fj.az * 0xBA486D1 - 0x5AF464C5) {
                hq.bo = (v8_2 - fj.az * 0x46AFBD5B) / v9_1 * 0x6CE7CFB7;
                if(hq.bo * 0x9FEF12BE < 0) {
                    hq.bo = 0;
                }
                else {
                }

                goto label_280;
            }

            hq.bo = -1093157059;
        }

    label_280:
        v8_2 = 0x1A8B6787;
        if(hq.bp * 0x4FF1175D != hq.bo * 0x337D3E07) {
            float v12 = ((((float)(hq.bo * 0x337D3E07))) - hq.bw) * 0.25f;
            if(v12 > -0.5f && v12 < 0.5f) {
                v12 = ((float)(hq.bo * 1496108657 - hq.bp * v8_2));
            }

            hq.bw += v12;
            hq.bp = (((int)hq.bw)) * 326704683;
        }

        int v11 = 0xD700E425;
        if((v0) && (v1 < bi.bt * 0xDFB239FD - hq.af.ae / v9_1 || v1 > hq.af.ae / v9_1 + bi.bt * v11 || v2 < hq.bp * 0x3170E1D5 || v2 > hq.af.ar + hq.bp * 0x202E39FB)) {
            client.al.aba(0xE3BC66A3).gc(-1022352044);
        }

        int v13 = 3;
        int v14 = 287427031;
        if(hq.cm * -240202416 != 0) {
            int v15 = 0xF7EE5BF5;
            if(hq.cm * v15 == 1) {
                v5_1 = bi.bt * v11 - 80;
                v8_2 = hq.bp * 0x1F0B8B87 - 2010808802;
                if((v3) || (v0) && v1 >= v5_1 + 511271810 && v1 <= v5_1 + 75 && v2 >= v8_2 - 20 && v2 <= v8_2 + 20) {
                    hq.df = true;
                    hp.ag(0x307A211C);
                }

                v5_1 = bi.bt * 0x92997094 + 80;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 75) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v8_2 - 20) {
                    }
                    else if(v2 <= v8_2 + v10) {
                        goto label_568;
                    }

                    return;
                }

            label_568:
                ht.ah(false, 0xD707310C);
                return;
            }

            int v12_1 = hq.cm * v15;
            v15 = 15;
            int v6 = 0x63D3C206;
            if(v12_1 == v9_1) {
                ar v8_3 = client.al.aba(0x2B13EDF8).gl(0x60704F02);
                if(v8_3 != null) {
                    v8_2 = v8_3.aw(0x320D8D5D);
                    if(v8_2 >= 0) {
                        hq.dq = v8_2 * 0xCEB54B43;
                    }
                }

                v12_1 = hq.bp * 0xE458EE86 + 100 + 0x4093C1FC + 52;
                if((v0) && v1 >= bi.bt * 943480103 - hq.af.ae / v9_1 && v1 <= bi.bt * v11 + hq.af.ae / v9_1 && v2 >= v12_1 - 12 && v2 < v12_1 + 2) {
                    ik.ab(0xD2AFBFF4);
                }

                v12_1 += v15;
                if((v0) && v1 >= bi.bt * 0xCEFECDB1 - hq.af.ae / v9_1 && v1 <= hq.af.ae / v9_1 + bi.bt * v11 && v2 >= v12_1 - 12 && v2 < v12_1 + v9_1) {
                    ev.af(-1716250064);
                }

                v8_2 = hq.bp * 0x1A206446 + 190;
                if(em.cl != null) {
                    v12_1 = em.cl.ae * 1900702915 / v9_1;
                    if((v0) && v1 >= em.cl.ax * 1081315770 - v12_1 && v1 <= em.cl.ax * 1160100129 + v12_1 && v2 >= v8_2 - 15 && v2 < v8_2) {
                        switch(hq.cz * -1540273625) {
                            case 1: {
                                goto label_682;
                            }
                            case 2: {
                                goto label_673;
                            }
                        }

                        goto label_685;
                    label_673:
                        client.al.aba(1054395182).ga(-20).ax("https://support.runescape.com/hc/en-gb", true, 0xADAC0FAC);
                        goto label_685;
                    label_682:
                        ha.ac(0x7A9D162);
                        return;
                    }
                }

            label_685:
                v12_1 = bi.bt * 0x8847B0F3 - 80;
                v13 = hq.bp * 0xA6302BE0 - 0x6F9ADFD8;
                if((v0) && v1 >= v12_1 - 89320013 && v1 <= v12_1 + 1709319214 && v2 >= v13 - 20 && v2 <= v13 + 20) {
                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ik.ab(0x82DA7620);
                        ax.bf(gs.es, gs.eb, gs.eh, v6);
                        return;
                    }
                    else if(hq.co.length() == 0) {
                        ev.af(0xF5862AA0);
                        ax.bf(gs.ec, gs.ei, gs.ex, v6);
                        return;
                    }
                    else {
                        client.al.aba(1491420469).gc(0xBC1A4824);
                        ax.bf(gs.jf, gs.jz, gs.ja, v6);
                        he.bm(hq.co, client.al.au, -35);
                        return;
                    }
                }

                v8_2 = hq.by * v14 + 260;
                if((v0) && v1 >= v8_2 - 75 && v1 <= v8_2 + 75 && v2 >= v13 - 20 && v2 <= v13 + v10) {
                    ht.ah(true, 0x9CA71464);
                    hq.dy = true;
                }

                v8_2 = bi.bt * v11 - 0x75;
                v10 = hq.bp * 0xA1EA1D0E + 106;
                boolean v8_4 = v1 < v8_2 || v1 >= ct.du * 0x3900C60D + v8_2 || v2 < v10 || v2 >= gy.dm * -34920419 + v10 ? false : true;
                hq.de = v8_4;
                if((v0) && (hq.de)) {
                    v8_4 = !client.er ? true : false;
                    client.er = v8_4;
                    if(client.er) {
                        goto label_802;
                    }

                    if(li.rg.ap == null) {
                        goto label_802;
                    }

                    li.rg.ap = null;
                    fr.an(0x1A60C7B5);
                }

            label_802:
                if(client.al.abd(0x652919B6) == 3 || client.al.abd(1971092373) == v9_1) {
                    v8_2 = hq.bp * 0x1A8B6787 + 210;
                    if((v0) && v1 >= bi.bt * 0x50CB9DC8 - hq.au.ae / v9_1 && v1 <= hq.au.ae / v9_1 + bi.bt * 0x73FB3672 && v2 >= v8_2 && v2 <= v8_2 + hq.au.ar) {
                        fg.bz(2039432057);
                    }
                }

                v9_1 = bi.bt * -1035241594 + 24;
                v10 = hq.bp * 0xDD08A1F5 + 507747980;
                boolean v1_1 = v1 < v9_1 || v1 >= v9_1 + ct.du * 0xBDC0EBCE || v2 < v10 || v2 >= gy.dm * 2125784809 + v10 ? false : true;
                hq.dk = v1_1;
                if((v0) && (hq.dk)) {
                    hu v0_1 = li.rg;
                    v1_1 = !li.rg.aj ? true : false;
                    v0_1.aj = v1_1;
                    if(!li.rg.aj) {
                        hq.cg = "";
                        li.rg.ap = null;
                        v0_2 = client.al.aba(0xAB4A4726).gl(0x6717858B);
                        if(v0_2 != null) {
                            v0_2.as("", 0, 0xAEB72F35);
                        }

                        ei.ad(0xF43F2E3A);
                    }

                    fr.an(0x80576680);
                }

                if(v4) {
                    ht.ah(true, -23473109);
                    hq.dy = true;
                    return;
                }

                if(v3) {
                    if(hq.dq * 675059588 == 0) {
                        ev.af(1606018979);
                        return;
                    }

                    hq.cg = hq.cg.trim();
                    if(hq.cg.length() == 0) {
                        ax.bf(gs.es, gs.eb, gs.eh, v6);
                        ik.ab(0xFF8C3D55);
                        return;
                    }

                    if(hq.co.length() == 0) {
                        ax.bf(gs.ec, gs.ei, gs.ex, v6);
                        ev.af(0xAD1EB490);
                        return;
                    }

                    client.al.aba(0xBD2169E7).gc(0xD8B96475);
                    ax.bf(gs.jf, gs.jz, gs.ja, v6);
                    he.bm(hq.co, client.al.au, -88);
                    return;
                }

                if(!v5) {
                    return;
                }

                if(hq.dq * 0xF4A0196B == 0) {
                    ev.af(0x2BBE5C23);
                    return;
                }

                ik.ab(0xEF53F157);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 3) {
                v5_1 = hq.by * 0xBE0B0C12 + 0x168A209C;
                v7 = hq.bp * 0x1A8B6787 + 0xDFA4F7A;
                if((v3) || (v4) || (v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v7 - 20 && v2 <= v7 + v10) {
                    ht.ah(false, 0x105FC74C);
                }

                v3_1 = hq.by * v14 + 180;
                v5_1 = hq.bp * 1387000200 + 0x9B;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v5_1 - 20) {
                    return;
                }

                if(v2 > v5_1 + v10) {
                    return;
                }

                ha.ac(0x716FD7F8);
                return;
            }

            if(4 == hq.cm * 0xF7EE5BF5) {
                v5_1 = hq.by * v14 + 0x6FB46F05 + 1920417940;
                v8_2 = hq.bp * 0x9AE6FD0A + 617882220;
                if(!v3 && (!v0 || v1 < v5_1 - 75 || v1 > v5_1 - 0x83E5F45 || v2 < v8_2 - 20 || v2 > v8_2 + 20)) {
                    if((v0) && v1 >= hq.by * v14 + 304695957 && v1 <= hq.by * 0xAEDB134C + 170 && v2 >= hq.bp * 0x54BF68C6 + 1350007369 && v2 <= hq.bp * 0x4C6743A5 + 0x7D) {
                        ar v3_2 = client.al.aba(0xF2427CFA).gl(0x5B25E90A);
                        if(v3_2 == null) {
                            v3_2 = fj.ao(0x8F181672);
                        }

                        if(v3_2 == null) {
                            goto label_1079;
                        }

                        v3_2.at(0x5B74834);
                    }

                label_1079:
                    if((v0) && v1 >= hq.by * 0xB19FED92 + 1408167317 && v1 <= hq.by * v14 - 0xF6C04C6 && v2 >= hq.bp * 1967509196 - 0x7FC3165C && v2 <= hq.bp * 0xE72C7386 + 0x7D) {
                        hq.dy ^= 1;
                    }

                    if((v0) && v1 >= hq.by * v14 + 0x15FBA148 - 1065004462 && v1 <= hq.by * v14 + 0x57FE4112 && v2 >= hq.bp * 0x7513CD2E + 180 && v2 <= hq.bp * 0x508D8248 + 0x71069445) {
                        la v3_3 = client.al.aba(829202806).ga(-39);
                        v3_3.ax(il.is("secure", true, 0xABC1E9A1) + "m=totp-authenticator/disableTOTPRequest", true, 0x12C74210);
                    }

                    v3_1 = hq.by * v14 + 260;
                    if(!v4) {
                        if(!v0) {
                        }
                        else if(v1 < v3_1 - 0x27A005A6) {
                        }
                        else if(v1 > v3_1 + 75) {
                        }
                        else if(v2 < v8_2 - 20) {
                        }
                        else if(v2 <= v8_2 + v10) {
                            goto label_1168;
                        }

                        return;
                    }

                label_1168:
                    ew.bc(false, 0x5A0C326F);
                    ht.ah(true, 0xBD727FA3);
                    return;
                }

                da.ds.trim();
                if(da.ds.length() != 6) {
                    ax.bf(gs.bg, gs.bz, gs.bh, v6);
                    return;
                }

                mf.dj = Integer.parseInt(da.ds) * 0xD79967D1;
                da.ds = "";
                ax.bf(gs.jf, gs.jz, gs.ja, v6);
                if(hp.ea.ai(1)) {
                    hp.ea.ar(true, 0xAE3DFBF8);
                }

                ew.bc(true, 0x7005286C);
                dc.ay(v10, -92);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 5) {
                v5_1 = hq.by * 12830393 + 180;
                v8_2 = hq.bp * 0x1A8B6787 + 0x304B0C04;
                if((v0) && v1 >= v5_1 + 0x5E1FB857 && v1 <= v5_1 + 140 && v2 >= v8_2 - 20 && v2 <= v8_2 + v10) {
                    v0_2 = client.al.aba(886287402).gl(1498309211);
                    if(v0_2 == null) {
                        v0_2 = ga.as(0x98C0E2E0);
                    }

                    if(v0_2 != null) {
                        v0_2.at(-1637299409);
                    }

                    return;
                }

                v5_1 = hq.by * v14 + 0x6469EAB3;
                v8_2 = hq.bp * 0x1A8B6787 + 0x14C02C18;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v8_2 - 20 && v2 <= v8_2 + 20) {
                    ev.bd(1);
                    return;
                }

                v5_1 = hq.by * 0xDB1069D9 + 260;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 - 0x4FC50741 && v2 >= v8_2 - 20 && v2 <= v8_2 + v10) {
                    eh.ak(true, 0xA3C2111D);
                }

                v5_1 = hq.bp * 0x1A8B6787 + 0x25765E7F;
                if(dq.ck != null) {
                    v8_2 = dq.ck.ae * 0x8A3C34A1 / v9_1;
                    if((v0) && v1 >= dq.ck.ax * 104778515 - v8_2 && v1 <= dq.ck.ax * 993097685 + v8_2 && v2 >= v5_1 - 15 && v2 < v5_1) {
                        la v5_3 = client.al.aba(0x8FCC1420).ga(-15);
                        v5_3.ax(il.is("secure", true, 0xAB12D3C6) + "m=weblogin/g=oldscape/cant_log_in", true, 0x6D9F4CF0);
                    }
                }

                if(v4) {
                    eh.ak(true, 0x84409000);
                }
                else if(v3) {
                    ev.bd(1);
                    return;
                }

                v3_1 = hq.by * v14 + 180;
                v4_2 = hq.bp * -1907074888 + 0xB9;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 100) {
                    return;
                }

                if(v1 > v3_1 + 100) {
                    return;
                }

                if(v2 < v4_2 - 15) {
                    return;
                }

                if(v2 > v4_2 + v15) {
                    return;
                }

                ls v0_3 = client.al.aba(2087106012);
                v0_3.gj("flSB8L", 497020850);
                v0_4 = v0_3.ga(-87);
                v0_4.ax(il.is("secure", true, 0xF0F30ECD) + "m=weblogin/g=oldscape/cant_log_in", true, -489836200);
                return;
            }

            if(hq.cm * 0xC0BD54F1 == 6) {
                if((v3) || (v4)) {
                    ht.ah(false, 404764870);
                }

                v1 = hq.bp * -10013305 + 0x7D04D0D1;
                if(!v0) {
                    return;
                }

                if(v2 < v1 - 20) {
                    return;
                }

                if(v2 > v1 + v10) {
                    return;
                }

                ht.ah(false, 0xF78FF39B);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 7) {
                v4_2 = hq.by * 0x209D4D1F + 180 + 0x22058506;
                v3_1 = hq.bp * 0x9613182C + 150;
                if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v3_1 - 20 && v2 <= v3_1 + 20) {
                    v0_4 = client.al.aba(-1278028011).ga(-89);
                    v0_4.ax(il.is("secure", true, 0xFACB2F09) + "m=dob/set_dob.ws", true, 0xF7AD8CD2);
                    ax.bf(gs.mq, gs.ma, gs.md, v6);
                    hq.cm = 1669522075;
                    return;
                }

                v4_2 = hq.by * v14 - 1404038804;
                if(!v0) {
                    return;
                }

                if(v1 < v4_2 - 75) {
                    return;
                }

                if(v1 > v4_2 + 75) {
                    return;
                }

                if(v2 < v3_1 - 20) {
                    return;
                }

                if(v2 > v3_1 + v10) {
                    return;
                }

                eh.ak(true, 0xA9D2AFEF);
                return;
            }

            if(8 == hq.cm * 0xF7EE5BF5) {
                v3_1 = hq.by * v14 + 0x3B8254BC - 0x10E42C6C;
                v5_1 = hq.bp * 0x52FA8E9E + 150;
                if((v0) && v1 >= v3_1 - 75 && v1 <= v3_1 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + 20) {
                    client.al.aba(0x81B5B097).ga(17).ax(gs.og, true, 0x597E30AB);
                    ax.bf(gs.mq, gs.ma, gs.md, v6);
                    hq.cm = 1177329000;
                    return;
                }

                v3_1 = hq.by * 0xB2B45104 - 0x741E8D27;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 - 75) {
                    return;
                }

                if(v1 > v3_1 + 75) {
                    return;
                }

                if(v2 < v5_1 - 20) {
                    return;
                }

                if(v2 > v5_1 + v10) {
                    return;
                }

                ht.ah(true, -2085307169);
                return;
            }

            if(9 == hq.cm * 0xF7EE5BF5) {
                v5_1 = hq.by * v14 + 180;
                v7 = hq.bp * 0x1A8B6787 - 0x4ACEAF7;
                if(!v3 && !v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 75) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v7 - 20) {
                    }
                    else if(v2 <= v7 + v10) {
                        goto label_1546;
                    }

                    return;
                }

            label_1546:
                ht.ah(false, 1535580628);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 10) {
                v6 = hq.by * v14 - 0x71BF2B29;
                v8_2 = hq.bp * 0xF2ECB5B - 0x587E8D2F;
                if(((v3) || (v0) && v1 >= v6 - 109 && v1 <= v6 + 109 && v2 >= v8_2 && v2 <= v8_2 - 1657912707) && !he.ay(4, 0x74)) {
                    fz.az(false, false, 0xBCBB7FBE);
                }

                v7 = hq.bp * 0x74BDBE98 - 1554790553;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v6 - 75) {
                    }
                    else if(v1 > v6 - 0x783C3F1) {
                    }
                    else if(v2 < v7) {
                    }
                    else if(v2 <= v7 + 40) {
                        goto label_1598;
                    }

                    return;
                }

            label_1598:
                hq.cm = 0xD9B76BFF;
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 11) {
                v5_1 = bi.bt * 0x3F4F63B0 - 80;
                v4_2 = hq.bp * 0xA9D01A6F + 100 + v10;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v4_2 - 20 && v2 <= v4_2 + 20) {
                    hp.ea.af(-32);
                    client.al.aba(0x4A22B165).bq(new String[]{"wgahnagl", "name"}, -27);
                    ht.ah(true, 0x1700DB07);
                }

                v5_1 = bi.bt * -1285770694 + 80;
                if((!v0 || v1 < v5_1 - 0x18C976CE || v1 > v5_1 + 0x2AAB3029 || v2 < v4_2 - 20 || v2 > v4_2 + v10) && !v3) {
                    return;
                }

                hq.cm = 0xD19E0542;
                return;
            }

            if(12 == hq.cm * -1280406392) {
                v5_1 = bi.bt * v11;
                v6 = hq.bp * 0x1A8B6787 + 55;
                if((v0) && v2 >= v6 - 20 && v2 <= v6 + v10) {
                    if(v1 >= v5_1 + 1501542470 && v1 <= v5_1 - 20) {
                        client.al.aba(0xBD490CF7).ga(76).ax(gs.og, true, 0xF6ABB064);
                        goto label_1699;
                    }

                    if(v1 < v5_1) {
                        goto label_1699;
                    }

                    if(v1 > v5_1 + 0x4F2E3D8E) {
                        goto label_1699;
                    }

                    client.al.aba(-1354054106).ga(-14).ax(gs.oz, true, -1999512450);
                }

            label_1699:
                v6 = bi.bt * 0xA3906324 - 80;
                v9_1 = hq.bp * 0xAD6F77DC + 0x28C250B0;
                if((v0) && v1 >= v6 - 75 && v1 <= v6 + 0x684F7A6F && v2 >= v9_1 - 20 && v2 <= v9_1 + 20) {
                    client.al.aba(1054971319).fs(0x2F150E2A);
                    hp.ag(0xB3292DE);
                }

                v5_1 = bi.bt * v11 + 80;
                if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 - 284066001 && v2 >= v9_1 - 20 && v2 <= v9_1 + v10 || (v3)) {
                    hq.da = -978010034;
                    hq.cm = 1682512300;
                }

                if(!v4) {
                    return;
                }

                hq.da = 0xFA528F45;
                ht.ah(false, 0xE752E282);
                return;
            }

            if(hq.cm * 0x3309D5F5 == 13) {
                v5_1 = bi.bt * 0x6ABFAFC2;
                v7 = hq.bp * 0xBF061D02 - 1074902761;
                if(!v4) {
                    if(!v0) {
                    }
                    else if(v1 < v5_1 - 44130033) {
                    }
                    else if(v1 > v5_1 + 75) {
                    }
                    else if(v2 < v7 - 20) {
                    }
                    else if(v2 <= v7 + v10) {
                        goto label_1778;
                    }

                    return;
                }

            label_1778:
                ht.ah(false, 0x2FE0FF63);
                return;
            }

            if(hq.cm * 0xF7EE5BF5 == 14) {
                String v3_4 = "";
                switch(hq.ch * 0x803A91D9) {
                    case 0: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                        break;
                    }
                    case 1: {
                        v3_4 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                        break;
                    }
                    default: {
                        ht.ah(false, 0x80D31E10);
                        break;
                    }
                }

                v4_2 = hq.by * v14 + 0x4F69C7D;
                v5_1 = hq.bp * 0x1A8B6787 + 105;
                if((v0) && v1 >= v4_2 - 75 && v1 <= v4_2 + 75 && v2 >= v5_1 - 20 && v2 <= v5_1 + v10) {
                    client.al.aba(0xF4B525AA).ga(0x40).ax(v3_4, true, 0x52F0F3B0);
                    ax.bf(gs.mq, gs.ma, gs.md, v6);
                    hq.cm = -1726888406;
                    return;
                }

                v3_1 = hq.by * v14 + 180;
                v4_2 = hq.bp * 0x312ABDEF - 390260703;
                if(!v0) {
                    return;
                }

                if(v1 < v3_1 + 1853050212) {
                    return;
                }

                if(v1 > v3_1 + 0xECA04E9) {
                    return;
                }

                if(v2 < v4_2 - 20) {
                    return;
                }

                if(v2 > v4_2 + v10) {
                    return;
                }

                if(hp.ea.ai(1)) {
                    ht.ah(false, 884207901);
                    return;
                }

                eh.ak(false, 0xAFCAEE96);
                return;
            }

            v9_1 = 0xF7EE5BF5;
            if(16 != hq.cm * v9_1) {
                if(hq.cm * v9_1 == 19) {
                }
                else if(hq.cm * v9_1 == 18) {
                    long v0_5 = ji.ax(0x2076E2C1);
                    if(-1 == hq.dt * 0x24B4CA886ADBD147L) {
                        hq.dt = -6166903917654538121L * v0_5;
                    }

                    if(v0_5 - hq.dt * 0x24B4CA886ADBD147L <= 2000) {
                        return;
                    }

                    hq.dt = 0x55953E707FC37789L;
                    fz.az(true, false, 765904237);
                    return;
                }
                else {
                    if(17 == hq.cm * 0xF7EE5BF5) {
                        ah v0_6 = client.al.aba(0x2D313406).bh(0x7C7C4803);
                        if(v0_6 != null) {
                            am v0_7 = v0_6.hs(0x5B202265);
                            if(v0_7 == null) {
                                return;
                            }

                            if(v0_7.ax(102)) {
                                ax.bf(gs.jy, gs.js, gs.jl, v6);
                                hq.cm = 0x28AF19F9;
                                return;
                            }

                            ax.bf(gs.jv, gs.ke, gs.ka, v6);
                            hq.cm = 0x3B12EE7;
                            return;
                        }

                        ax.bf(gs.jv, gs.ke, gs.ka, v6);
                        hq.cm = 0x2F220588;
                        return;
                    }

                    if(hq.cm * 0x5FD449F == v15) {
                        ag v0_8 = hp.ea.am(0x3414FC9B);
                        if(v0_8 == null) {
                            return;
                        }

                        if(v0_8.ax(-2060028375)) {
                            hq.cm = 0xE803EB69;
                            ax.bf(gs.jf, gs.jz, gs.ja, v6);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(0x7656A6FF).bo("wgahnagl", hp.ea.ad * 0x8251FD91, -83);
                            hp.ea.an(0xAEC4FC99);
                            ew.bc(false, 914486900);
                            dc.ay(v10, -30);
                        }
                        else {
                            v1_3 = client.al.aba(1230024403);
                            switch(v0_8.al(0xFF15926A)) {
                                case 1: {
                                    goto label_1999;
                                }
                                case 2: {
                                    goto label_1989;
                                }
                            }

                            v1_3.gj("gcu2QC", 0x8CA2A18C);
                            ax.bf(gs.kr, gs.ku, gs.kb, v6);
                            hq.cm = 0xF38FB45;
                            goto label_2011;
                        label_1989:
                            v1_3.gj("gcu2QC", 0xD0D7D624);
                            ax.bf(gs.kf, gs.kd, gs.kj, v6);
                            hq.cm = 0xF38FB45;
                            goto label_2011;
                        label_1999:
                            v1_3.gj("gcu1M3", 0xF51B1686);
                            ax.bf(gs.kx, gs.kz, gs.kv, v6);
                            hq.cm = 0x29F9C2E8;
                        }

                    label_2011:
                        hp.ea.az(null, -74);
                        return;
                    }

                    if(hq.cm * 0xF7EE5BF5 == 23) {
                        av v0_9 = hp.ea.ag(1511904803);
                        if(v0_9 == null) {
                            return;
                        }

                        if(v0_9.ax(-1601016189)) {
                            hq.cm = 482814057;
                            ax.bf(gs.jf, gs.jz, gs.ja, v6);
                            hp.ea.ad = 0x507B8E98;
                            client.al.aba(0x608ED9FB).bo("wgahnagl", hp.ea.ad * 0x542C1B7D, -44);
                            hp.ea.an(0xB58E1685);
                            ew.bc(false, 0x7341D80C);
                            dc.ay(v10, -98);
                        }
                        else {
                            v1_3 = client.al.aba(0x27CEA356);
                            if(v0_9.al(1043897970) != 1) {
                                v1_3.gj("gsu6PD", 0x17654C62);
                                ax.bf(gs.ky, gs.kh, gs.kk, v6);
                                hq.cm = 0x6C6A5205;
                            }
                            else {
                                v1_3.gj("gscD0G", 0xB72AFC83);
                                hq.cm = 0;
                            }
                        }

                        hp.ea.ah(null, 0x7FCD6E81);
                        return;
                    }

                    if(21 == hq.cm * 1250007005) {
                        v5_1 = bi.bt * 0xC3162F62 + 826030191;
                        v6 = hq.bp * 0x1A8B6787 + 0x7473E73E;
                        if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 - 0x4F039D37 && v2 >= v6 - 20 && v2 <= v6 + 20) {
                            client.al.aba(0xEB371E09).gm(1);
                            hp.ag(1590057459);
                        }

                        v7 = bi.bt * 0x70B35FE2 - 0x1F6C244F;
                        if((!v0 || v1 < v7 - 75 || v1 > v7 - 0x1F3D6DCF || v2 < v6 - 20 || v2 > v6 + v10) && !v3) {
                            return;
                        }

                        hq.da = 0x12AB769F;
                        ht.ah(false, 0x48CD23FC);
                        return;
                    }

                    if(hq.cm * 0xF7EE5BF5 == 22) {
                        v4_2 = hq.by * v14 + 180;
                        v5_1 = hq.bp * 0x1A8B6787 + 206501442;
                        if(!v3) {
                            if(!v0) {
                            }
                            else if(v1 < v4_2 + 969829006) {
                            }
                            else if(v1 > v4_2 + 75) {
                            }
                            else if(v2 < v5_1 - 20) {
                            }
                            else if(v2 <= v5_1 + v10) {
                                goto label_2162;
                            }

                            return;
                        }

                    label_2162:
                        ax.bf(gs.kp, gs.kl, gs.kn, v6);
                        client.al.aba(0xB39071FF).ac(4);
                        return;
                    }

                    if(24 != hq.cm * 0xF7EE5BF5) {
                        return;
                    }

                    v4_2 = hq.by * v14 - 0x50FEB94B;
                    v5_1 = hq.bp * -289840252 + 140;
                    if(!v3) {
                        if(!v0) {
                        }
                        else if(v1 < v4_2 - 75) {
                        }
                        else if(v1 > v4_2 + 75) {
                        }
                        else if(v2 < v5_1 - 20) {
                        }
                        else if(v2 <= v5_1 + v10) {
                            goto label_2196;
                        }

                        return;
                    }

                label_2196:
                    ht.ah(false, 1948474805);
                    return;
                }
            }

            v5_1 = bi.bt * -570240465 - 80;
            v3_1 = hq.bp * 0x1A8B6787 - 1792097351 + v10;
            if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 + 75 && v2 >= v3_1 - 20 && v2 <= v3_1 + 20) {
                ep.bh(0x7F926EC5);
                ax.bf(gs.jr, gs.jp, gs.jt, v6);
                hq.cm = 0x1FC5A06B;
                return;
            }

            v5_1 = bi.bt * v11 - 0x50430A9A;
            if((v0) && v1 >= v5_1 - 75 && v1 <= v5_1 - 1489088235 && v2 >= v3_1 - 20 && v2 <= v3_1 + v10) {
                fz.az(true, false, 0x4AE3CFC6);
                return;
            }

            if(!v4) {
                return;
            }

            hq.cm = bi.at(0xE600FF08) * 0xE53F385D;
            return;
        }
        else if(v4) {
            client.al.aba(0xC3BB5D07).bd(0xC63A7762);
            return;
        }
        else {
            ah v4_1 = client.al.aba(0x89E1720C).bh(1259751020);
            if(v4_1 != null && ((v4_1.hf(-13)) || (v4_1.ad(0x65E830CF)))) {
                v10 = hq.by * v14 - 1001807277;
                v5_1 = hq.bp * v8_2 - 1452902214 + 0x63666E53;
                v8_2 = hq.au.ae / v9_1;
                v11 = hq.au.ar;
                if((v0) && v1 >= v10 - v8_2 && v1 <= v10 + v8_2 && v2 >= v5_1 && v2 <= v5_1 + v11) {
                    if(v4_1.hf(-73)) {
                        if(!dw.bx(v9_1, -64034309) && !dv.bg(v9_1, -5)) {
                            if(he.ay(v9_1, 0x70)) {
                            }
                            else {
                                bz.bb(24);
                                goto label_430;
                            }
                        }

                        return;
                    }
                    else {
                        if(!v4_1.ad(0x1D727F54)) {
                            goto label_430;
                        }

                        if(!dw.bx(v13, 0x767938D) && !dv.bg(v13, -5)) {
                            if(he.ay(v13, 0x60)) {
                            }
                            else {
                                fs.bc(-424093068);
                                goto label_430;
                            }
                        }

                        return;
                    }
                }

            label_430:
                v5_1 += v11 + 6;
                if((!v0 || v1 < v10 - v8_2 || v1 > v10 + v8_2 || v2 < v5_1 || v2 > v11 + v5_1) && !v3) {
                    return;
                }

                if(!dw.bx(1, 0x19F6C914) && !dv.bg(1, 25)) {
                    if(he.ay(1, 0x79)) {
                    }
                    else {
                        client.al.aba(0x9D1658E4).gj("crsG39", 1301629562);
                        eh.ak(false, 0xAB7531D9);
                        return;
                    }
                }

                return;
            }

            v4_2 = bi.bt * 0xEB569ECD - 80;
            v9_1 = hq.bp * v8_2 + 0x1D4FDEA0 + v10;
            if((v0) && v1 >= v4_2 - 2001109937 && v1 <= v4_2 + 75 && v2 >= v9_1 - 20 && v2 <= v9_1 + 20) {
                if(!dw.bx(0, 0xEA96D39D)) {
                    if(dv.bg(0, 42)) {
                    }
                    else {
                        fg.bz(0x59141A0E);
                        goto label_491;
                    }
                }

                return;
            }

        label_491:
            v4_2 = bi.bt * 0x2FDE812B - 0xB601E69;
            if((!v0 || v1 < v4_2 + 0x31191DD9 || v1 > v4_2 + 75 || v2 < v9_1 - 20 || v2 > v9_1 + v10) && !v3) {
                return;
            }

            if(!dw.bx(1, -716936780) && !dv.bg(1, -99)) {
                if(he.ay(1, 0x40)) {
                }
                else {
                    client.al.aba(0xBF5E68BC).gj("crsG39", 0x200C6F86);
                    eh.ak(false, 0xB02E9BDE);
                    return;
                }
            }

            return;
        }
    }

    static void dz(boolean arg2) {
        hq.cm = bi.at(1810410296) * 0x2F9E9A6E;
        client.al.aba(0x1499D3D2).gc(667338034);
        if(arg2) {
            hq.cg = "";
            hq.co = "";
            mf.dj = 0;
            da.ds = "";
        }
    }

    static ar ea() {
        ar v0 = client.al.aba(0x2843650F).az(1, 0x3310F9D5);
        v0.ao(da.ds, -2020403106);
        return v0;
    }

    static void eb(od arg23, od arg24, fa arg25) {
        int v22;
        int v21;
        int v12;
        ih v14_2;
        int v19;
        String v13_1;
        int v0_1;
        od v7 = arg24;
        fa v15 = arg25;
        int v14 = hq.fz.ae * 0x249E9B9;
        int v13 = hq.fz.ar * 0xEE0C033F;
        if(aw.er == null) {
            aw.er = ht.ab(eo.dh, "sl_back", "", 5000);
        }

        int v1 = 0x6E0C0A57;
        if(nc.eq == null) {
            nc.eq = dl.ad(eo.dh, "sl_flags", "", v1);
        }

        if(fy.ej == null) {
            fy.ej = dl.ad(eo.dh, "sl_arrows", "", v1);
        }

        if(gy.em == null) {
            gy.em = dl.ad(eo.dh, "sl_stars", "", v1);
        }

        if(bl.en == null) {
            bl.en = aa.aq(eo.dh, "leftarrow", "", -90);
        }

        if(ci.el == null) {
            ci.el = aa.aq(eo.dh, "rightarrow", "", -34);
        }

        int v16 = 0x4D586FC3;
        arg25.ar(hq.ab * v16, 23, 0x2FD, 480, 0, 2);
        arg25.fd(hq.ab * v16, 0, 0x7D, 23, 0xBD9839, 0x8B6608, 0xFF1B220E);
        arg25.fd(hq.ab * v16 + 0x7D, 0, 640, 23, 0x4F4F4F, 0x292929, 0xA9ABCC5D);
        fa v10 = v15;
        int v8 = v14;
        int v9 = v13;
        arg23.ai(gs.nz, hq.ab * v16 + 62, 15, 0, -1, arg25);
        if(gy.em != null) {
            v10.ag(gy.em[1], hq.ab * v16 + 140, 1, 1);
            arg24.aq(gs.np, hq.ab * v16 + 0x98, 10, 0xFFFFFF, -1, arg25);
            v10.ag(gy.em[0], hq.ab * v16 + 140, 12, 1);
            arg24.aq(gs.nt, hq.ab * v16 + 0x98, 21, 0xFFFFFF, -1, arg25);
        }

        v13 = 4;
        byte v14_1 = 2;
        if(fy.ej != null) {
            ef v0 = ih.aq[0] != 0 || ih.ad[0] != 1 ? fy.ej[0] : fy.ej[v14_1];
            ef v15_1 = v0;
            v0 = ih.aq[0] != 0 || 1 != ih.ad[0] ? fy.ej[1] : fy.ej[3];
            ef v6 = v0;
            v0_1 = hq.ab * v16 + 280;
            v10.ag(v15_1, v0_1, v13, 1);
            v10.ag(v6, v0_1 + 15, v13, 1);
            arg23.aq(gs.nx, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
            v0_1 = hq.ab * v16 + 390;
            v10.ag(v15_1, v0_1, v13, 1);
            v10.ag(v6, v0_1 + 15, v13, 1);
            arg23.aq(gs.nk, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
            v0_1 = hq.ab * v16 + 500;
            v10.ag(v15_1, v0_1, v13, 1);
            v10.ag(v6, v0_1 + 15, v13, 1);
            arg23.aq(gs.nv, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
            v0_1 = hq.ab * v16 + 610;
            v10.ag(v15_1, v0_1, v13, 1);
            v10.ag(v6, v0_1 + 15, v13, 1);
            arg23.aq(gs.nn, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
        }

        arg25.ar(hq.ab * v16 + 708, 4, 50, 16, 0, 2);
        byte v11 = 25;
        arg24.ai(gs.lb, hq.ab * v16 + 733, 16, 0xFFFFFF, -1, arg25);
        hq.ew = 0x80697E01;
        if(aw.er != null) {
            ce.eu = ds.bp(1402213511);
            int v15_2 = 0x9BA2F453;
            hq.eg = ((ce.eu.ar * v15_2 + ih.ap * 0x6DE6A9AD - 1) / (ce.eu.ar * v15_2) - ce.eu.ae * 0xDFEB996D) * 0xDA5FB577;
            int v17 = 0xE513D117;
            if(bl.en != null && hq.ev * v17 > 0) {
                v10.ag(bl.en, hq.ab * v16 + ce.eu.aj * 0xE1ECC05D - bl.en.ae - ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / v14_1 - bl.en.ar / v14_1, 1);
            }

            if(ci.el != null && hq.ev * v17 < hq.eg * 1447801927) {
                v10.ag(ci.el, hq.ab * v16 + ce.eu.ad * -1103381197 + ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / v14_1 - ci.el.ar / v14_1, 1);
            }

            v1 = ce.eu.aq * 0x399617D7 + 23;
            v0_1 = hq.ab * v16 + ce.eu.aj * 0xE1ECC05D;
            int v2 = hq.ev * v17;
            int v4 = v0_1;
            int v5 = v1;
            v16 = v2;
            int v6_1 = ce.eu.ar * v15_2 * v2;
            v0_1 = 0;
            int v18 = 0;
            while(v6_1 < ih.ap * 0x6DE6A9AD) {
                if(v16 - hq.ev * v17 >= ce.eu.ae * 0xDFEB996D) {
                }
                else {
                    ih v3 = ew.an[v6_1];
                    v2 = 0x98D051C9;
                    String v1_1 = Integer.toString(v3.av * v2);
                    if(v3.av * v2 == -1) {
                        v1_1 = gs.nf;
                        goto label_384;
                    }
                    else if(v3.av * v2 > 1980) {
                        v1_1 = gs.na;
                    label_384:
                        v13_1 = v1_1;
                        v1 = 0;
                    }
                    else {
                        v13_1 = v1_1;
                        v1 = 1;
                    }

                    if(v3.au(105)) {
                        v2 = v3.ab(1503958955) ? 7 : 6;
                        goto label_402;
                    }
                    else if(v3.aa(v14_1)) {
                        v2 = v3.ab(0x23B2D031) ? 5 : 4;
                        v19 = 0xFF0000;
                    }
                    else {
                        if(v3.ai(0x75)) {
                            if(v3.ab(0x1F6D150F)) {
                                v2 = 3;
                                goto label_402;
                            }

                            v2 = 2;
                        }
                        else {
                            v2 = v3.ab(1035060657) ? 1 : 0;
                        }

                    label_402:
                        v19 = 0;
                    }

                    int v20 = -250202335;
                    if(v8 < v4 || v9 < v5 || v8 >= ce.eu.ax * -204538603 + v4 || v9 >= ce.eu.al * v20 + v5 || v1 == 0) {
                        v14_2 = v3;
                        v12 = v4;
                        v15_2 = v5;
                        v21 = v6_1;
                        v10.aa(aw.er[v2], v12, v15_2, v11);
                        v22 = v0_1;
                    }
                    else {
                        hq.ew = 0x7F9681FF * v6_1;
                        v14_2 = v3;
                        v12 = v4;
                        v15_2 = v5;
                        v21 = v6_1;
                        arg25.bd(aw.er[v2], v4, v5, 0x80, 0xFFFFFF, 0x368904BA);
                        v22 = 1;
                    }

                    if(nc.eq != null) {
                        ef[] v0_2 = nc.eq;
                        v1 = v14_2.ab(1194726890) ? 8 : 0;
                        v10.ag(v0_2[v1 + v14_2.am * -479634605], v12 + 29, v15_2, 1);
                    }

                    arg23.ai(Integer.toString(v14_2.af * 0xBBB22DD), v12 + 15, ce.eu.al * v20 / 2 + v15_2 + 5, v19, -1, arg25);
                    v14_1 = 2;
                    arg24.ai(v13_1, v12 + 60, v15_2 + ce.eu.al * v20 / v14_1 + 5, 0xFFFFFFF, -1, arg25);
                    v5 = v15_2 + (ce.eu.al * v20 + ce.eu.ap * 0xDF01D95D);
                    v0_1 = v18 + 1;
                    if(v0_1 >= ce.eu.ar * 0x9BA2F453) {
                        v0_1 = ce.eu.aq * 0x399617D7 + 23;
                        v4 = v12 + (ce.eu.ax * -204538603 + ce.eu.an * 0x75C55DF7);
                        ++v16;
                        v5 = v0_1;
                        v18 = 0;
                    }
                    else {
                        v18 = v0_1;
                        v4 = v12;
                    }

                    v6_1 = v21 + 1;
                    v0_1 = v22;
                    continue;
                }

                break;
            }

            if(v0_1 == 0) {
                return;
            }

            v12 = v7.ar(ew.an[hq.ew * 0xDE657DFF].au) + 6;
            v13 = v7.aj + 8;
            v0_1 = v9 + 25;
            if(v0_1 + v13 > 480) {
                v0_1 = v9 - 25 - v13;
            }

            int v11_1 = v8 - v12 / 2;
            arg25.ar(v11_1, v0_1, v12, v13, 0xFFFFA0, 2);
            arg25.fz(v11_1, v0_1, v12, v13, 0, 0xF9A7FB61);
            arg24.ai(ew.an[hq.ew * 0xDE657DFF].au, v8, v7.aj + v0_1 + 4, 0, -1, arg25);
        }
    }

    static ib ec() {
        int v8;
        int v7;
        int v3;
        int v4;
        int v2;
        ib v0 = new ib();
        v0.ax = 0x580C84F8;
        v0.al = 0x1F6CF4B3;
        v0.ae = 0x332F6AC3;
        v0.ar = 1305640072;
        do {
        label_10:
            v2 = 0x9BA2F453;
            int v1 = v0.ar * v2;
            v4 = 0xDFEB996D;
            v3 = v0.ae * v4;
            v7 = 0x6DE6A9AD;
            if(v0.ar * v2 * (v0.ae * v4 - 1) >= ih.ap * v7) {
                v0.ae -= -1104455579;
            }

            v8 = 0x78936FDB;
            if((v0.ar * v2 - 1) * (v0.ae * v4) >= ih.ap * v7) {
                v0.ar -= v8;
            }

            if(v0.ae * v4 * (v0.ar * v2 - 1) >= ih.ap * v7) {
                v0.ar -= v8;
            }

            if(v0.ar * v2 != v1) {
                goto label_10;
            }
        }
        while(v0.ae * v4 != v3);

        int v5 = -204538603;
        v0.an = (0x2FD - v0.ae * v4 * (v0.ax * v5)) / (v0.ae * v4 + 1) * 0x891273C7;
        v3 = 0x75C55DF7;
        int v6 = 5;
        if(v0.an * v3 > v6) {
            v0.an = 0xAD5C42E3;
        }

        v7 = -250202335;
        v0.ap = (480 - v0.al * v7 * (v0.ar * v2)) / (v0.ar * v2 + 1) * -1109048587;
        v8 = 0xDF01D95D;
        if(v0.ap * v8 > v6) {
            v0.ap = -1250275639;
        }

        v0.aj = (0x2FD - v0.ax * v5 * (v0.ae * v4) - (v0.ae * v4 - 1) * (v0.an * v3)) / 2 * 0x906913F5;
        v0.ad = (v0.aj * 0xE1ECC05D + (v0.ax * v5 + v0.an * v3) * (v0.ae * v4) - v0.an * v3) * -1856600581;
        v0.aq = (480 - v0.ar * v2 * (v0.al * v7) - (v0.ar * v2 - 1) * (v0.ap * v8)) / 2 * 0x377FCBE7;
        return v0;
    }

    static void ed(od arg23, od arg24, fa arg25) {
        int v22;
        int v21;
        int v12;
        ih v15_2;
        int v20;
        String v14_1;
        int v0_1;
        od v7 = arg24;
        fa v15 = arg25;
        int v14 = hq.fz.ae * 0xBC2360D1;
        int v13 = hq.fz.ar * 1049922468;
        if(aw.er == null) {
            aw.er = ht.ab(eo.dh, "sl_back", "", 5000);
        }

        int v1 = 0x6E0C0A57;
        if(nc.eq == null) {
            nc.eq = dl.ad(eo.dh, "sl_flags", "", v1);
        }

        if(fy.ej == null) {
            fy.ej = dl.ad(eo.dh, "sl_arrows", "", v1);
        }

        if(gy.em == null) {
            gy.em = dl.ad(eo.dh, "sl_stars", "", v1);
        }

        if(bl.en == null) {
            bl.en = aa.aq(eo.dh, "leftarrow", "", -37);
        }

        if(ci.el == null) {
            ci.el = aa.aq(eo.dh, "rightarrow", "", -24);
        }

        int v16 = 0x4D586FC3;
        arg25.ar(hq.ab * v16, 23, 0x92842B34, 0xDE4033CD, 0, 2);
        arg25.fd(hq.ab * v16, 0, 1899070934, 23, 1273616701, 0x8B6608, 0x32CFAE6C);
        arg25.fd(hq.ab * v16 - 1111213603, 0, 0xD3635276, 23, 0x4F4F4F, 0x292929, 0x44253EF9);
        fa v10 = v15;
        int v8 = v14;
        int v9 = v13;
        arg23.ai(gs.nz, -408822406 + hq.ab * v16, 15, 0, -1, arg25);
        if(gy.em != null) {
            v10.ag(gy.em[1], hq.ab * 0x3ACD767 + 140, 1, 1);
            arg24.aq(gs.np, hq.ab * v16 + 0x6604BFB8, 10, 0xFFFFFF, -1, arg25);
            v10.ag(gy.em[0], hq.ab * 0x4356AF25 + 0x630B8D5C, 12, 1);
            arg24.aq(gs.nt, 0x93F26AD2 + hq.ab * v16, 21, 0xFFFFFF, -1, arg25);
        }

        v13 = 3;
        v14 = 4;
        byte v15_1 = 2;
        if(fy.ej != null) {
            ef v0 = ih.aq[0] != 0 || ih.ad[0] != 1 ? fy.ej[0] : fy.ej[v15_1];
            ef v6 = v0;
            v0 = ih.aq[0] != 0 || 1 != ih.ad[0] ? fy.ej[1] : fy.ej[v13];
            ef v5 = v0;
            v0_1 = hq.ab * v16 + 280;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg23.aq(gs.nx, 1890690520 + v0_1, 17, -2045005599, -1, arg25);
            v0_1 = hq.ab * v16 + 390;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg23.aq(gs.nk, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
            v0_1 = hq.ab * v16 + 500;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg23.aq(gs.nv, v0_1 + 0x20, 17, 0xFFFFFF, -1, arg25);
            v0_1 = hq.ab * v16 + 610;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg23.aq(gs.nn, 0xD4ECFC4C + v0_1, 17, 0x2D719C5, -1, arg25);
        }

        arg25.ar(hq.ab * v16 + 708, 4, 50, 16, 0, 2);
        byte v11 = 25;
        arg24.ai(gs.lb, hq.ab * v16 + 733, 16, -673200597, -1, arg25);
        hq.ew = 0x80697E01;
        if(aw.er != null) {
            ce.eu = ds.bp(0x5CE0B07B);
            int v17 = 0x6DE6A9AD;
            hq.eg = ((ce.eu.ar * 0x9BA2F453 + ih.ap * v17 - 1) / (ce.eu.ar * -690239816) - ce.eu.ae * 0x4FB87A1) * 0xDA5FB577;
            if(bl.en != null && hq.ev * -115301025 > 0) {
                v10.ag(bl.en, hq.ab * 0x850BEDE0 + ce.eu.aj * 0xE1ECC05D - bl.en.ae - ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / v15_1 - bl.en.ar / v15_1, 1);
            }

            v1 = 0xE513D117;
            if(ci.el != null && hq.ev * v1 < hq.eg * 1447801927) {
                v10.ag(ci.el, hq.ab * v16 + ce.eu.ad * 0x594AA067 + ce.eu.an * 0x99E10E95, bv.tt * 742742805 / v15_1 - ci.el.ar / v15_1, 1);
            }

            int v2 = ce.eu.aq * 0x399617D7 + 23;
            v0_1 = hq.ab * v16 + ce.eu.aj * 0xEB65DE19;
            int v3 = hq.ev * v1;
            int v5_1 = v2;
            v16 = v3;
            int v6_1 = ce.eu.ar * 0x6C374DEA * v3;
            int v18 = 0;
            int v4 = v0_1;
            v0_1 = 0;
            while(v6_1 < ih.ap * v17) {
                if(v16 - hq.ev * 960052405 >= ce.eu.ae * 338881044) {
                }
                else {
                    ih v3_1 = ew.an[v6_1];
                    String v1_1 = Integer.toString(v3_1.av * 0x98D051C9);
                    if(v3_1.av * 0xCE4CF5FF == -1) {
                        v1_1 = gs.nf;
                        goto label_406;
                    }
                    else if(v3_1.av * -1692079182 > 0xABF73AFB) {
                        v1_1 = gs.na;
                    label_406:
                        v14_1 = v1_1;
                        v1 = 0;
                    }
                    else {
                        v14_1 = v1_1;
                        v1 = 1;
                    }

                    if(v3_1.au(28)) {
                        v2 = v3_1.ab(0xFCADA8CC) ? 7 : 6;
                        goto label_426;
                    }
                    else if(v3_1.aa(v15_1)) {
                        v2 = v3_1.ab(0x5DA5E5EB) ? 5 : 4;
                        v20 = 1751406370;
                    }
                    else {
                        if(v3_1.ai(15)) {
                            if(v3_1.ab(0x690DE9BD)) {
                                v2 = 3;
                                goto label_426;
                            }

                            v2 = 2;
                        }
                        else {
                            v2 = v3_1.ab(0xE5F8654D) ? 1 : 0;
                        }

                    label_426:
                        v20 = 0;
                    }

                    if(v8 < v4 || v9 < v5_1 || v8 >= ce.eu.ax * 0xC675F04E + v4 || v9 >= ce.eu.al * -250202335 + v5_1 || v1 == 0) {
                        v15_2 = v3_1;
                        v12 = v4;
                        v13 = v5_1;
                        v21 = v6_1;
                        v10.aa(aw.er[v2], v12, v13, v11);
                        v22 = v0_1;
                    }
                    else {
                        hq.ew = 0x987BCDF1 * v6_1;
                        v15_2 = v3_1;
                        v12 = v4;
                        v13 = v5_1;
                        v21 = v6_1;
                        arg25.bd(aw.er[v2], v4, v5_1, 0x80, 0x90C70940, 0x368904BA);
                        v22 = 1;
                    }

                    if(nc.eq != null) {
                        ef[] v0_2 = nc.eq;
                        v1 = v15_2.ab(0x7350B96) ? 8 : 0;
                        v10.ag(v0_2[v1 + v15_2.am * -479634605], v12 + 29, v13, 1);
                    }

                    arg23.ai(Integer.toString(v15_2.af * 0xBBB22DD), v12 + 15, ce.eu.al * 2087202746 / 2 + v13 + 5, v20, -1, arg25);
                    v15_1 = 2;
                    arg24.ai(v14_1, v12 + 807300857, v13 + ce.eu.al * -250202335 / v15_1 + 5, 0x1F7416AB, -1, arg25);
                    v5_1 = v13 + (ce.eu.al * 1374605924 + ce.eu.ap * 0xFCDDBAF0);
                    v0_1 = v18 + 1;
                    if(v0_1 >= ce.eu.ar * 0x9BA2F453) {
                        v0_1 = ce.eu.aq * -106275436 + 23;
                        v4 = v12 + (ce.eu.ax * 991086574 + ce.eu.an * 0x80BFE5F3);
                        ++v16;
                        v5_1 = v0_1;
                        v18 = 0;
                    }
                    else {
                        v18 = v0_1;
                        v4 = v12;
                    }

                    v6_1 = v21 + 1;
                    v0_1 = v22;
                    continue;
                }

                break;
            }

            if(v0_1 == 0) {
                return;
            }

            v12 = v7.ar(ew.an[hq.ew * 1403216809].au) + 6;
            v13 = v7.aj + 8;
            v0_1 = v9 + 25;
            if(v0_1 + v13 > 480) {
                v0_1 = v9 - 25 - v13;
            }

            v1 = v8 - v12 / 2;
            arg25.ar(v1, v0_1, v12, v13, 0xFFFFA0, 2);
            arg25.fz(v1, v0_1, v12, v13, 0, 0xF6FFA2BC);
            arg24.ai(ew.an[hq.ew * 0xDE657DFF].au, v8, v7.aj + v0_1 + 4, 0, -1, arg25);
        }
    }

    static void ee(od arg25, od arg26, fa arg27) {
        int v23;
        int v21;
        int v15_2;
        int v20;
        int v2_1;
        String v19;
        String v1_1;
        int v0_1;
        od v7 = arg26;
        fa v15 = arg27;
        int v14 = hq.fz.ae * 0xDFF8DCA6;
        int v13 = hq.fz.ar * 0xEE0C033F;
        if(aw.er == null) {
            aw.er = ht.ab(eo.dh, "sl_back", "", 5000);
        }

        int v1 = 0x6E0C0A57;
        if(nc.eq == null) {
            nc.eq = dl.ad(eo.dh, "sl_flags", "", v1);
        }

        if(fy.ej == null) {
            fy.ej = dl.ad(eo.dh, "sl_arrows", "", v1);
        }

        if(gy.em == null) {
            gy.em = dl.ad(eo.dh, "sl_stars", "", v1);
        }

        if(bl.en == null) {
            bl.en = aa.aq(eo.dh, "leftarrow", "", -72);
        }

        if(ci.el == null) {
            ci.el = aa.aq(eo.dh, "rightarrow", "", -78);
        }

        arg27.ar(1797860275 * hq.ab, 23, 0x968B8FBF, -979020313, 0, 2);
        int v16 = 0x4D586FC3;
        arg27.fd(hq.ab * v16, 0, 0x7D, 23, 0x2F1280D1, 0x8B6608, 0xFCBCFC1E);
        arg27.fd(hq.ab * v16 + 0x2B707E66, 0, 640, 23, 0x4F4F4F, 0x292929, 199871028);
        fa v10 = v15;
        int v8 = v14;
        int v9 = v13;
        arg25.ai(gs.nz, 0x8D231F9B + hq.ab * 0x6653048F, 15, 0, -1, arg27);
        if(gy.em != null) {
            v10.ag(gy.em[1], hq.ab * v16 - 145019868, 1, 1);
            arg26.aq(gs.np, hq.ab * v16 - 0x5F56EB88, 10, 0xFFFFFF, -1, arg27);
            v10.ag(gy.em[0], hq.ab * 0x89BF8377 + 560068798, 12, 1);
            arg26.aq(gs.nt, 0xCDCF574 + hq.ab * -763270746, 21, 0xFFFFFF, -1, arg27);
        }

        v13 = 3;
        v14 = 4;
        byte v15_1 = 2;
        if(fy.ej != null) {
            ef v0 = ih.aq[0] != 0 || ih.ad[0] != 1 ? fy.ej[0] : fy.ej[v15_1];
            ef v6 = v0;
            v0 = ih.aq[0] != 0 || 1 != ih.ad[0] ? fy.ej[1] : fy.ej[v13];
            ef v5 = v0;
            v0_1 = hq.ab * v16 - 408607867;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg25.aq(gs.nx, 0x5924DA8B + v0_1, 17, 0xFFFFFF, -1, arg27);
            v0_1 = hq.ab * -1667916770 + 390;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg25.aq(gs.nk, 1762997480 + v0_1, 17, 0xB3F71F4E, -1, arg27);
            v1 = hq.ab * 0x84FCFD9D + 0x6D43760D;
            v10.ag(v6, v1, v14, 1);
            v10.ag(v5, v1 + 15, v14, 1);
            arg25.aq(gs.nv, v1 - 0x47A942A0, 17, 0x8407772, -1, arg27);
            v0_1 = hq.ab * v16 + 610;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg25.aq(gs.nn, 951360471 + v0_1, 17, 114003110, -1, arg27);
        }

        arg27.ar(hq.ab * 0xA368C580 - 0x576D1150, 4, 50, 16, 0, 2);
        byte v11 = 25;
        arg26.ai(gs.lb, hq.ab * v16 - 0x4FCB9528, 16, 0xFFFFFF, -1, arg27);
        hq.ew = 0x25B85113;
        if(aw.er != null) {
            ce.eu = ds.bp(1767274150);
            hq.eg = ((ce.eu.ar * 0x3CDF810D + ih.ap * 0x47113FA7 - 1) / (ce.eu.ar * 0x9BA2F453) - ce.eu.ae * 0x405A4923) * 0xDA5FB577;
            v1 = 0xEB8ABBEE;
            if(bl.en != null && hq.ev * 0xE513D117 > 0) {
                v10.ag(bl.en, hq.ab * v16 + ce.eu.aj * 0xAE128907 - bl.en.ae - ce.eu.an * v1, bv.tt * 0x61D5857C / v15_1 - bl.en.ar / v15_1, 1);
            }

            if(ci.el != null && hq.ev * -1013238167 < hq.eg * 0x392520F1) {
                v10.ag(ci.el, hq.ab * v16 + ce.eu.ad * -1103381197 + ce.eu.an * v1, bv.tt * 1101908444 / v15_1 - ci.el.ar / v15_1, 1);
            }

            v0_1 = ce.eu.aq * 0x399617D7 + 23;
            v1 = hq.ab * -207125032 + ce.eu.aj * 0xE2AB6561;
            int v3 = hq.ev * 0x6BFEC8D5;
            int v5_1 = v0_1;
            v16 = v3;
            int v6_1 = ce.eu.ar * 0x9FC099CC * v3;
            v0_1 = 0;
            int v17 = 0;
            int v4 = v1;
            while(v6_1 < ih.ap * 0x6DE6A9AD) {
                if(v16 - hq.ev * 0xFF6D01C5 >= ce.eu.ae * 0xDFEB996D) {
                }
                else {
                    ih v14_1 = ew.an[v6_1];
                    String v2 = Integer.toString(v14_1.av * 0x7B52A005);
                    if(v14_1.av * 0x98D051C9 == -1) {
                        v1_1 = gs.nf;
                        goto label_418;
                    }
                    else if(v14_1.av * 0x98D051C9 > 0xF92A5CA2) {
                        v1_1 = gs.na;
                    label_418:
                        v19 = v1_1;
                        v1 = 0;
                    }
                    else {
                        v19 = v2;
                        v1 = 1;
                    }

                    if(v14_1.au(5)) {
                        v2_1 = v14_1.ab(0x739DBDCE) ? 7 : 6;
                        goto label_437;
                    }
                    else if(v14_1.aa(v15_1)) {
                        v2_1 = v14_1.ab(0x4BC7508B) ? 5 : 4;
                        v20 = 0xFF0000;
                    }
                    else {
                        if(v14_1.ai(59)) {
                            if(v14_1.ab(0x27C6F52D)) {
                                v2_1 = 3;
                                goto label_437;
                            }

                            v2_1 = 2;
                        }
                        else {
                            v2_1 = v14_1.ab(0x108808F) ? 1 : 0;
                        }

                    label_437:
                        v20 = 0;
                    }

                    int v18 = -250202335;
                    if(v8 < v4 || v9 < v5_1 || v8 >= ce.eu.ax * 0xA2FEACB4 + v4 || v9 >= ce.eu.al * v18 + v5_1 || v1 == 0) {
                        v13 = v4;
                        v15_2 = v5_1;
                        v21 = v6_1;
                        v10.aa(aw.er[v2_1], v13, v15_2, v11);
                        v23 = v0_1;
                    }
                    else {
                        hq.ew = 0x7F9681FF * v6_1;
                        v13 = v4;
                        v15_2 = v5_1;
                        v21 = v6_1;
                        arg27.bd(aw.er[v2_1], v4, v5_1, 0xCFEAE00A, 0xFFFFFF, 0x368904BA);
                        v23 = 1;
                    }

                    if(nc.eq != null) {
                        ef[] v0_2 = nc.eq;
                        v1 = v14_1.ab(0x22F16CAB) ? 8 : 0;
                        v10.ag(v0_2[v1 + v14_1.am * -416204716], v13 + 29, v15_2, 1);
                    }

                    arg25.ai(Integer.toString(v14_1.af * 0xBBB22DD), v13 + 15, ce.eu.al * 0xC84F83AF / 2 + v15_2 + 5, v20, -1, arg27);
                    arg26.ai(v19, v13 + 0x739AAD3B, v15_2 + ce.eu.al * v18 / 2 + 5, 0x1521FEF, -1, arg27);
                    v5_1 = v15_2 + (ce.eu.al * v18 + ce.eu.ap * 0xBD857CB6);
                    v0_1 = v17 + 1;
                    if(v0_1 >= ce.eu.ar * 0x2EB8F5D) {
                        v0_1 = ce.eu.aq * 0x399617D7 + 23;
                        v4 = v13 + (ce.eu.ax * -204538603 + ce.eu.an * 0x75C55DF7);
                        ++v16;
                        v5_1 = v0_1;
                        v17 = 0;
                    }
                    else {
                        v17 = v0_1;
                        v4 = v13;
                    }

                    v6_1 = v21 + 1;
                    v0_1 = v23;
                    v15_1 = 2;
                    continue;
                }

                break;
            }

            if(v0_1 == 0) {
                return;
            }

            int v12 = v7.ar(ew.an[hq.ew * 0xDE657DFF].au) + 6;
            v13 = v7.aj + 8;
            v0_1 = v9 + 25;
            if(v0_1 + v13 > 480) {
                v0_1 = v9 - 25 - v13;
            }

            int v11_1 = v8 - v12 / 2;
            arg27.ar(v11_1, v0_1, v12, v13, -752238307, 2);
            arg27.fz(v11_1, v0_1, v12, v13, 0, 0xF44C480C);
            arg26.ai(ew.an[hq.ew * 0xF10A1BEC].au, v8, v7.aj + v0_1 + 4, 0, -1, arg27);
        }
    }

    static int ef() {
        int v0 = hq.fz.ae * 0xEBDE5191;
        int v1 = hq.fz.ar * 0xEE0C033F;
        ib v2 = ds.bp(0x4B06A32B);
        int v4 = 0x399617D7;
        int v3 = v2.aq * v4 + 23;
        int v5 = v2.aj * 0xE1ECC05D + hq.ab * 0x4C5C4D15;
        int v6 = hq.ev * 0xE513D117 * (v2.ar * 0x8A996DB4);
        int v8 = 0;
        while(v6 < ih.ap * 0x6DE6A9AD) {
            int v9 = -250202335;
            if(v0 >= v5 && v1 >= v3 && v0 < v2.ax * 0x3EF61194 + v5 && v1 < v2.al * v9 + v3) {
                return v6;
            }

            v3 += v2.ap * 0xDF01D95D + v2.al * v9;
            ++v8;
            if(v8 >= v2.ar * 0x9BA2F453) {
                v3 = v2.aq * v4 + 23;
                v5 += v2.ax * -204538603 + v2.an * 0x5D38006E;
                v8 = 0;
            }

            ++v6;
        }

        return -1;
    }

    static void eg(od arg24, od arg25, od arg26, boolean arg27, fa arg28) {
        String v0_5;
        int v12_2;
        ef v0_4;
        int v1_1;
        float v7_1;
        float v5_1;
        int v11;
        int v2;
        byte v12_1;
        int v6;
        String v19_1;
        int v3;
        byte v10_1;
        int v20;
        int v19;
        int v0;
        od v12 = arg24;
        od v13 = arg25;
        fa v14 = arg28;
        v14.al(35);
        int v15 = 2;
        hq.ab = (dq.tv * 0xD9CC4AFD + 2024990606) / v15 * 0xA0B03B3;
        hq.by = hq.ab * 0x116943F5 + 0x2DFE2371;
        bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
        if(hq.ea) {
            gn.bn(v12, v13, v14, 0x25BE05FE);
            return;
        }

        long v16 = ji.ax(0x2076E2C1);
        if(-1 == hq.fl * -611935993406195833L) {
            hq.fh = (v16 + 300) * 0x7F9153A5B5120AE9L;
            hq.fl = hq.fh * 0x3E24E342FD076C1FL - 0xD397F4858CD2F18L;
        }

        if(v16 < hq.fh * -4462661976294855335L) {
            return;
        }

        int v7 = 0xD700E425;
        if(v16 < hq.fl * -611935993406195833L) {
            v0 = ((int)((((float)(v14.al * 450521320 / v15))) * hq.fy.ax(1f - (((float)(hq.fl * -611935993406195833L - v16))) / 600f, 0)));
            arg28.ef(bi.bt * 0x45796893 - v0, 0, bi.bt * v7 + v0, 0xC99696FF, 0x9DEEE4DE);
        }

        gx.bq(v14, 0x95D57BE8);
        int v8 = 0x1A8B6787;
        int v10 = 5;
        int v18 = 287427031;
        int v9 = 20;
        if(client.ac * 0x498EF1C3 == 0 || client.ac * 0xEEB736F0 == v10) {
            arg24.ai(gs.iv, hq.by * -277990350 + 180, hq.bp * 0x1DA65295 + 54, 0xFFFFFF, -1, arg28);
            v19 = hq.bp * v8 - 0x38CA2BB3;
            arg28.fz(hq.by * v18 + 180 + 0x5EF51C0A, v19, 0x560B4CAE, 34, 9179409, 0xD15A3B98);
            arg28.fz(hq.by * 0x9D960734 - 1672140626 + 2020815788, v19 + 1, 0x3E4D1001, 0x4597F552, 0, 0x99A0982E);
            v19 += 2;
            arg28.ar(hq.by * v18 - 727404602, v19, hq.bv * 0x7542FCB9, 30, 9179409, 2);
            arg28.ar(hq.bv * 0xE7509707 + (hq.by * 2034898640 - 1692610834 - 1905754862), v19, 0xBAAB5FB7 - hq.bv * 0xB92C407C, 30, 0, 2);
            if(client.al.abd(0x73631AFD) == 3) {
                hq.bq = "Initialising game";
            }

            arg24.ai(hq.bq, hq.by * -600251693 + 180, hq.bp * v8 + 0x3FFFB991 + v10 - v9, 0xFFFFFF, -1, arg28);
        }

        v19 = 0xF7EE5BF5;
        if(v9 == client.ac * -2002162202 || hq.cm * 0xE5FC088D == v9) {
            v14.ag(hq.af, hq.by * v18 + 180 - hq.af.ae / v15, hq.bp * -72580301 + 0x6708CDDD - hq.af.ar / v15, 1);
            v20 = hq.bp * 0x16FD1AE7 - 1921026093;
            v10_1 = 1;
            v7 = 15;
            arg24.ai(hq.cu, hq.by * 0x3AD7321F - 0x70F828DF, v20, 0xFFFF00, 0, arg28);
            v20 += 15;
            arg24.ai(hq.cq, hq.by * v18 + 180, v20, 1008368486, 0, arg28);
            v20 += 15;
            arg24.ai(hq.cv, hq.by * v18 + 180, v20, 0x12BCC7F, 0, arg28);
            v20 += 22;
            if(hq.cm * v19 != 4 && hq.cm * 2015277683 != 0 && hq.cm * v19 != 10 && hq.cm * 0xA690B771 != v9 && 18 != hq.cm * v19 && 16 != hq.cm * v19 && hq.cm * v19 != 1) {
                arg24.aq(gs.lf, hq.by * 705864100 + 180 + 0x293CFA0E, v20, 0x1F2AEE06, 0, arg28);
                v0 = 200;
                String v1;
                for(v1 = en.an(0x19EB52EA); v12.ar(v1) > v0; v1 = v1.substring(0, v1.length() - 1)) {
                }

                arg24.aq(od.ad(v1), hq.by * 0xFD6D9E91 + 110, v20, 0xFFFFFF, 0, arg28);
                arg24.aq(gs.lg + ff.az(hq.co, 0xC52642B0), hq.by * -2004425272 + 180 - 0x1AC1880D, v20 + 15, 0x3A2B6A2F, 0, arg28);
            }

            if(v9 != hq.cm * v19) {
                goto label_381;
            }

            he.bm(hq.co, client.al.au, -101);
        }
        else {
            v7 = 15;
            v10_1 = 1;
        }

    label_381:
        if(10 == client.ac * 0x498EF1C3 || 11 == client.ac * 0x8BE58FF3) {
            v14.ag(hq.af, hq.by * v18, hq.bp * v8, v10_1);
            if(hq.cm * v19 == 0) {
                v3 = hq.bp * 0x4B5EE602 - 0x1FE6F522;
                v7 = hq.by * 0xFD1A3E29 + 180;
                ah v0_2 = client.al.aba(975034836).bh(1555520985);
                if(v0_2 != null) {
                    if(!v0_2.hf(-19) && !v0_2.ad(0x45954E37)) {
                        goto label_524;
                    }

                    v1 = "";
                    if(v0_2.hf(-87)) {
                        v19_1 = gs.lj;
                        v8 = 1;
                    }
                    else if(v0_2.ad(0xB9CF0817)) {
                        v19_1 = gs.ln;
                        v8 = 2;
                    }
                    else {
                        v19_1 = v1;
                        v8 = 0;
                    }

                    arg24.ai(gs.lt, 0x46F8E574 + hq.by * v18, hq.bp * 0x173EE51E - 0x3AA309B4 + 1635080493, 0xFFFF00, 0, arg28);
                    v6 = hq.bp * -1204209823 + 100 - 0x60D19E4C;
                    int v5 = v7 - hq.au.ae / v15;
                    v14.ag(hq.au, v5, v6, v10_1);
                    v14.ag(eh.am[v8], v5 + 4, v6 + 4, v10_1);
                    v8 = eh.am[v8].ae / v15 + bi.bt * 0xD700E425 + 3;
                    arg24.ai(v19_1, v8, v6 + 26, 0xFFFFFF, 0, arg28);
                    v6 += hq.au.ar + 6;
                    v14.ag(hq.au, v7 - hq.au.ae / v15, v6, v10_1);
                    v14.ag(eh.am[0], v5 + 5, v6 + 4, v10_1);
                    arg24.ai(gs.lv, v8, v6 + 26, 0xFFFFFF, 0, arg28);
                    v12_1 = 0;
                }
                else {
                label_524:
                    v7 += -80;
                    arg24.ai(gs.lt, hq.by * v18 + 180, v3, 0xFFFF00, 0, arg28);
                    v8 = hq.bp * 0x2ACE20AF + 100 + v9 - 20;
                    v14.ag(in.ai, v7 + 0x5B7ADF29, v8, v10_1);
                    v12_1 = 0;
                    arg24.av(gs.li, v7 - 403891741, v8, 0x90, -1905534081, 0xFFFFFF, 0, 1, 1, 0, arg28);
                    v0 = hq.by * -275407204 + 0x48B5C9C7;
                    v14.ag(in.ai, v0 - 73, v8, 1);
                    arg24.av(gs.lx, v0 + 0x1273E040, v8, 0xD7A88404, 40, 0xFFFFFF, 0, 1, 1, 0, arg28);
                }

                if(client.al.abd(1502898333) == 3) {
                    goto label_392;
                }

                v8 = hq.bp * 0x6EC97D90 + 0xAE;
                if(hq.fe * 0x61810D62574D4ADL == -1) {
                    goto label_392;
                }

                if(v16 < hq.fe * 0x61810D62574D4ADL) {
                    goto label_392;
                }

                if(hq.fd * -8957420507059323547L != -1 && v16 >= hq.fd * -8957420507059323547L + 5000) {
                    goto label_392;
                }

                iz v0_3 = dc.bf(0x89561FB5);
                v1 = "All game data synchronised";
                v2 = v13.ar(v1);
                v9 = hq.by * v18 + 180 + 903439102;
                if(v0_3 != null) {
                    v0 = cx.ba(14);
                    StringBuilder v4 = new StringBuilder();
                    v4.append("Synchronising game data - ");
                    v4.append("99.11%");
                    int v4_1 = v13.ar(v4.toString());
                    v19_1 = "Synchronising game data - " + hq.eb.format(((double)((((float)v0)) / 100f))) + "%";
                    v11 = v0 * 300 / 0x39FC50DC;
                    v20 = v4_1;
                    v10 = 0x31C3E7;
                }
                else {
                    v19_1 = v1;
                    v20 = v2;
                    v10 = 0xB95728F6;
                    v11 = 0xC5B8DA02;
                }

                v6 = 304;
                if(-1 != hq.fd * -8957420507059323547L && v16 > hq.fd * -8957420507059323547L + 4700) {
                    v5_1 = 1f - (((float)(v16 - hq.fd * -8957420507059323547L - 4700))) / 300f;
                    goto label_703;
                }
                else if(v16 < hq.fe * 0x61810D62574D4ADL + 300) {
                    v5_1 = (((float)(v16 - hq.fe * 0x61810D62574D4ADL))) / 300f;
                label_703:
                    v7_1 = v5_1;
                }
                else {
                    v7_1 = 1f;
                }

                v14.et(hq.fi, 1332403083);
                if(v7_1 != 1f) {
                    v0 = ((int)(hq.eh.ax(v7_1, v12_1) * 304f));
                    v1_1 = hq.by * 1690503238 + 0xF2130C1 - v0 / 2;
                    v2 = v8 - 14;
                    arg28.ef(v1_1, v2, v0 + v1_1, v2 + 20, 0xD6478207);
                }

                int v22 = ((int)(128f * v7_1));
                arg28.fy(v9 - 2, v8 - 14, v6, 20, v10, v22, 0x89F16204);
                arg28.ae(v9, v8 - 12, v11, 16, v10, v22, 0x569EB0B2);
                arg25.ab(v19_1, hq.by * v18 + 180 - v20 / 2, v8, 39303303, 0, ((int)(v7_1 * 255f)), arg28);
                v14.fa(hq.fi, -989494300);
                goto label_392;
            }
            else {
                if(1 == hq.cm * 0x10E861C) {
                    arg24.ai(hq.ct, hq.by * 396538790 + 1040607404, hq.bp * v8 + 30, 0x61BE809E, 0, arg28);
                    v8 = hq.bp * v8 + 65;
                    arg24.ai(hq.cu, hq.by * v18 + 180, v8, 0xFFFFFF, 0, arg28);
                    v8 += v7;
                    arg24.ai(hq.cq, hq.by * v18 + 180, v8, 0x2A8AE745, 0, arg28);
                    arg24.ai(hq.cv, hq.by * -220871262 + 180, v8 + 15, -1518066858, 0, arg28);
                    v2 = hq.by * v18 - 0x50620E6A + 0x31ABEDD8;
                    v1_1 = hq.bp * 0x81CE241B + 150;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 1432119107, v7, 1);
                    v8 = v1_1 + 5;
                    arg24.ai(gs.aj, v2, v8, -1039440241, 0, arg28);
                    v2 = hq.by * 0xEA186F4D + 0x2630455E;
                    v14.ag(in.ai, v2 + 0x7850AD38, v7, 1);
                    arg24.ai(gs.lb, v2, v8, 0x2301CA05, 0, arg28);
                    goto label_392;
                }

                v11 = 5;
                if(2 == hq.cm * v19) {
                    v9 = hq.bp * -2029802685 - 0x1B4070BA + 0x238B9106;
                    arg24.ai(hq.cu, bi.bt * 0x69905E24, v9, 0xFFFF00, 0, arg28);
                    v9 += v7;
                    arg24.ai(hq.cq, bi.bt * 0xD700E425, v9, 0xF065D572, 0, arg28);
                    v9 += v7;
                    arg24.ai(hq.cv, bi.bt * 0xD700E425, v9, 0xFFFF00, 0, arg28);
                    v9 = v9 + v7 + 7;
                    arg24.aq(gs.lf, bi.bt * 0xD700E425 + 0x60BC9F24, v9, -2040281961, 0, arg28);
                    v0 = 200;
                    v1 = en.an(407816998);
                    v12 = arg24;
                    while(v12.ar(v1) > v0) {
                        v1 = v1.substring(1);
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1_1 = hq.dq * 0xE9D7D70F == 0 ? 1 : 0;
                    v2 = client.bj * -2077001153 % 0xCCC05912 < 20 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(-205940857, 0x1B28FA27) + jc.ae : "";
                    v0_1.append(v1);
                    v10 = 20;
                    arg24.aq(v0_1.toString(), bi.bt * 0x59F37E0A - 70, v9, -1364560456, 0, arg28);
                    v3 = v9 + 15;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lg);
                    v0_1.append(ff.az(hq.co, 0xC52642B0));
                    v1_1 = 1 == hq.dq * 0xFE0FBBEA ? 1 : 0;
                    v2 = client.bj * 595213002 % 0x62FC8EF6 < v10 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, 2068620276) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), bi.bt * 0xF5AADEB9 - 108, v3, 0xFFFFFF, 0, arg28);
                    v7 = hq.bp * v8 + 106;
                    v0 = bi.bt * 0xD700E425 - 0x75;
                    ef v1_3 = fl.ar(client.er, hq.de, 0x51CE4CB7);
                    v14.ag(v1_3, v0, v7, 1);
                    v9 = v7 + 13;
                    arg25.aq(gs.lq, v0 + (v1_3.ae + v11), v9, 0x43749266, 0, arg28);
                    v1_1 = bi.bt * 0x4F51AB + 24;
                    v0_4 = fl.ar(li.rg.aj, hq.dk, 0xD494FD72);
                    v14.ag(v0_4, v1_1, v7, 1);
                    arg25.aq(gs.lo, v1_1 + (v0_4.ae + v11), v9, 0xFFFF00, 0, arg28);
                    v2 = bi.bt * -851920574 + 0x508B6002;
                    v0 = hq.bp * v8 + 0x7F0AF5A4;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 0x7B40AFC, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.lc, v2, v8, 0xFFFFFF, 0, arg28);
                    v2 = bi.bt * 0xE722E7F7 - 0x2EB1FA52;
                    v14.ag(in.ai, v2 - 1421043917, v7, 1);
                    arg24.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg28);
                    v3 = hq.bp * 0xEF59FC77 - 0x3B776FDF;
                    dl.cn = hq.cz * 0x316CC049 != 2 ? gs.mu : gs.mm;
                    em.cl = new or(bi.bt * 0xF3F10AC6, v3, v13.ar(dl.cn), 11);
                    dq.ck = new or(bi.bt * 0x5504A064, v3, v13.ar(gs.mk), 11);
                    arg25.ai(dl.cn, bi.bt * -715206707, v3, 0xB562AD82, 0, arg28);
                    if(client.al.abd(2034113218) != 3 && client.al.abd(2027633771) != 2) {
                        goto label_392;
                    }

                    v1_1 = hq.bp * 0x13A62871 + 210;
                    v0 = bi.bt * 0xD700E425 - hq.au.ae / 2;
                    v14.ag(hq.au, v0, v1_1, 1);
                    v14.ag(eh.am[0], v0 + v11, v1_1 + 4, 1);
                    arg24.ai(gs.le, bi.bt * 0x5F5C346F + eh.am[1].ae / 2 + 3, v1_1 + 26, 593706451, 0, arg28);
                    goto label_392;
                }

                v10 = 20;
                v12 = arg24;
                if(3 == hq.cm * v19) {
                    v8 = hq.bp * v8 + 100 + 0x55CAB0A;
                    arg24.ai(gs.ll, hq.by * 0x880BCD4B - 0xAB99EA3, v8, 0xFFFF00, 0, arg28);
                    v8 += v10;
                    arg25.ai(gs.la, hq.by * -2014807919 + 0x1B88E868, v8, 0xFFFF00, 0, arg28);
                    arg25.ai(gs.lu, 0x502AD644 + hq.by * v18, v8 + 15, 0x5287F72E, 0, arg28);
                    v2 = hq.by * v18 + 180;
                    v0 = hq.bp * -244083645 + 100 + v11;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg26.ai(gs.lw, v2, v0 + 5, -611794402, 0, arg28);
                    v2 = hq.by * v18 + 0x5B9A4C17;
                    v0 = hq.bp * 0xFFFC4C9C + 0x4BFF7E52;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg26.ai(gs.ls, v2, v0 + 5, 0x7600F92B, 0, arg28);
                    goto label_392;
                }

                if(4 == hq.cm * 0x2FC44449) {
                    arg24.ai(gs.jj, hq.by * v18 + 180, hq.bp * -1202943793 - 0x706C5E8F - 0x508500FA, 0xFFFF00, 0, arg28);
                    v9 = hq.bp * v8 + 65;
                    arg24.ai(hq.cu, hq.by * 0x4FD6674D - 0x100A2D47, v9, 0xFFFFFF, 0, arg28);
                    v9 += v7;
                    arg24.ai(hq.cq, hq.by * 0xA05B8653 + 0x37A2E57F, v9, 0x35A3E08, 0, arg28);
                    v9 += v7;
                    arg24.ai(hq.cv, hq.by * v18 + 180, v9, 0xF658E05D, 0, arg28);
                    v9 += v7;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lk);
                    v0_1.append(ff.az(da.ds, 0xC52642B0));
                    v1 = client.bj * -2077001153 % 40 < v10 ? im.al(0xFFFF00, 0x6CFE4FF7) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), hq.by * 0x26E6E610 - 0x4FCD5C32, v9, 0xFD070956, 0, arg28);
                    v9 += -8;
                    arg24.aq(gs.ab, hq.by * 1580049619 + 0xAB, v9, 0x4FEF1536, 0, arg28);
                    v9 += v7;
                    arg24.aq(gs.af, hq.by * v18 + 0xAB, v9, 0xFFFF00, 0, arg28);
                    v1_1 = hq.by * -1827267405 + 0xAB + v12.ar(gs.af) + v7;
                    v9 -= v12.aj;
                    v0_4 = hq.dy ? oa.as : bz.aw;
                    v14.ag(v0_4, v1_1, v9, 1);
                    v2 = hq.by * 0x602F2B29 + 100;
                    v7 = hq.bp * v8 + 150;
                    v8 = v7 - 20;
                    v14.ag(in.ai, v2 - 1204101466, v8, 1);
                    v9 = v7 + 5;
                    arg24.ai(gs.aj, v2, v9, 0x5E759766, 0, arg28);
                    v2 = hq.by * 0x35F11F2B + 0x19AFC3A5;
                    v14.ag(in.ai, v2 + 136611703, v8, 1);
                    arg24.ai(gs.lb, v2, v9, 0x1518AEF3, 0, arg28);
                    arg25.ai(gs.jw, -909933480 + hq.by * v18, v7 + 0x78791001, 0xFF, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * v19 == v11) {
                    arg24.ai(gs.ld, hq.by * 0x99CF487D + 180, hq.bp * 0x69B3DE61 + 0x2B4E632A - 0x26C0EC0A, 0xFFFF00, 0, arg28);
                    v9 = hq.bp * 1983326700 + 0x2A3EF310 - 215401652;
                    arg26.ai(hq.cu, hq.by * 147272004 + 180, v9, 0x95B9980, 0, arg28);
                    v9 += v7;
                    arg26.ai(hq.cq, hq.by * v18 + 0x223A0D79, v9, 0x38309B57, 0, arg28);
                    v9 += v7;
                    arg26.ai(hq.cv, hq.by * 0x2A9D9132 + 180, v9, 0xFF044135, 0, arg28);
                    v7 = v9 + v7 + 14;
                    arg24.aq(gs.my, hq.by * v18 + 35, v7, 0xFFFFFF, 0, arg28);
                    v0 = 0xFA08FD03;
                    for(v1 = en.an(0xE4E45320); v12.ar(v1) > v0; v1 = v1.substring(1)) {
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1 = client.bj * 0x4D5670C0 % 40 < v10 ? im.al(-470604934, 0xB127E986) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), hq.by * v18 - 0x62186F55 - 0x6370A188, v7, -2118461308, 0, arg28);
                    v2 = hq.by * 0xAF5CDDB2 + 100;
                    v0 = hq.bp * v8 - 0x6E806A54;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.me, v2, v8, 0x71F02768, 0, arg28);
                    v2 = hq.by * 0xA7032B56 + 260;
                    v14.ag(in.ai, v2 + 0x4040A974, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg28);
                    arg25.ai(gs.mk, bi.bt * 0x90380641, hq.bp * 0x55010EFE - 472370097, 0xE263DD40, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * v19 == 6) {
                    v8 = hq.bp * v8 + 100 - 0x7FF2B916;
                    arg24.ai(hq.cu, hq.by * 0xFAA68C2E + 180, v8, 0xFFFF00, 0, arg28);
                    v8 += v7;
                    arg24.ai(hq.cq, hq.by * v18 + 180, v8, -1424206081, 0, arg28);
                    arg24.ai(hq.cv, hq.by * v18 + 180, v8 + 15, 0x16C9C66, 0, arg28);
                    v2 = hq.by * 0xF8187F32 - 710656596;
                    v0 = hq.bp * 0xE43E99A7 + 150;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg24.ai(gs.mh, v2, v0 + 5, 0x277187A6, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * v19 == 7) {
                    v8 = hq.bp * v8 + 45;
                    arg24.ai(gs.nj, hq.by * 1005070337 + 180, v8, 0xFFFF00, 0, arg28);
                    v8 += v7;
                    arg26.ai(gs.nu, hq.by * -94087860 + 180, v8, 0x806F4490, 0, arg28);
                    arg26.ai(gs.nm, hq.by * -1037067801 + 180, v8 + 15, 0x374426CD, 0, arg28);
                    v2 = hq.by * 0xD001361C + 1168068300;
                    v0 = hq.bp * 478968601 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 + 1158802219, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.nh, v2, v8, -2099993994, 0, arg28);
                    v2 = hq.by * 0xAFA85CFD + 0x1CC73AB3;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0x46585010, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * 0xCF1806FE == 8) {
                    v8 = hq.bp * 0x60332FA9 + 1644021370 + 0x6FAD670A;
                    arg24.ai(hq.cu, hq.by * v18 + 180, v8, 0xC5430C9B, 0, arg28);
                    v8 += v7;
                    arg26.ai(hq.cq, hq.by * 0x78915006 + 180, v8, 0xCAA4FA35, 0, arg28);
                    arg26.ai(hq.cv, hq.by * -1456368602 + 180, v8 + 15, 0xFFFF00, 0, arg28);
                    v2 = hq.by * 1574067911 - 0x3203FA9A;
                    v0 = hq.bp * 0x3CE5BFA8 - 0x55B486E0;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.fo, v2, v8, -1601001239, 0, arg28);
                    v2 = hq.by * v18 + 27908377;
                    v14.ag(in.ai, v2 - 0x423C247D, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(9 == hq.cm * v19) {
                    v7 = hq.bp * v8 - 240105745 - 0x45AF94B3;
                    arg24.ai(hq.cu, hq.by * v18 + 180, v7, 0xFFFF00, 0, arg28);
                    v7 += 25;
                    arg24.ai(hq.cq, hq.by * 0xFEB74735 + 180, v7, 0xB6F4C328, 0, arg28);
                    arg24.ai(hq.cv, 0x1EB056F7 + hq.by * 0xADC0E93E, v7 + 25, 0x7A08504D, 0, arg28);
                    v2 = hq.by * v18 - 1050186937;
                    v1_1 = hq.bp * 0xD5AF62C9 + 0x124B8FBE;
                    v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                    arg24.ai(gs.lw, v2, v1_1 + 5, 0xB78D3291, 0, arg28);
                    goto label_392;
                }

                if(10 == hq.cm * v19) {
                    v9 = hq.by * v18 + 0x14242F40;
                    v8 = hq.bp * v8 + 0x522C027C;
                    arg24.ai(gs.lt, hq.by * 0x3B8D2100 - 0x3F24CAA6, v8, 392247098, 0, arg28);
                    v8 += v10;
                    v14.ag(hq.av, v9 - 0x63FF5D93, v8, 1);
                    if(je.ap(hq.dv, 0x2E33B013).isEmpty()) {
                        v14.ag(li.aa, v9 - 1707036077, v8 + 18, 1);
                    }
                    else {
                        v14.ag(li.aa, v9 + 679389930, v8 + 5, 1);
                        arg24.ai(hq.dv, v9, v8 + 53, 0xA8274706, 0, arg28);
                    }

                    v1_1 = hq.bp * 0xFA27A670 - 0x4F6D0CB9;
                    v14.ag(in.ai, v9 + 0x199AF6D5, v1_1, 1);
                    arg24.ai("Sign out", v9, v1_1 + 25, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(11 == hq.cm * 0x9B036B4C) {
                    arg24.ai("Are you sure you want to sign out?", hq.by * v18 + 180, hq.bp * v8 + 80, 0xBB8F67E4, 0, arg28);
                    v2 = hq.by * 429079688 - 0x73FA5D8A;
                    v0 = hq.bp * v8 + 100 + v10;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 1420583953, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai("Yes", v2, v8, 0x5F9D6062, 0, arg28);
                    v2 = hq.by * 0xCB65D24E - 1301088580;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai("No", v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * 0x533F3EAD == 12) {
                    v7 = bi.bt * 0xD700E425;
                    v8 = hq.bp * v8 + 45;
                    arg26.ai(gs.ny, v7, v8, 0x5FAC4FF, 0, arg28);
                    v8 += 17;
                    arg26.ai(gs.os, v7, v8, 0xFFFFFF, 0, arg28);
                    v8 += 17;
                    arg26.ai(gs.oa, v7, v8, -1729001016, 0, arg28);
                    arg26.ai(gs.of, v7, v8 + 17, 0xFFFFFF, 0, arg28);
                    v2 = bi.bt * 0xD700E425 + 0x6F0B8473;
                    v1_1 = hq.bp * 0xE2D045D3 + 0x6D881AC0;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg24.ai(gs.oy, v2, v8, 1097222165, 0, arg28);
                    v2 = bi.bt * 0x18BA0CBF + 80;
                    v14.ag(in.ai, v2 + 0x201FBA4C, v7, 1);
                    arg24.ai(gs.om, v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * 0x751A4532 == 13) {
                    v7 = hq.bp * v8 + 800252999 + 1248103401;
                    arg26.ai(gs.ob, hq.by * 0x6EEF2048 + 180, v7, 1559783004, 0, arg28);
                    arg26.ai(gs.op, 910378829 + hq.by * v18, v7 + 20, 0x469C1F1E, 0, arg28);
                    v2 = hq.by * 0x25335FFD - 417730029;
                    v3 = hq.bp * 596041141 + 0x58905AC6;
                    v14.ag(in.ai, v2 - 73, v3 - 20, 1);
                    arg24.ai(gs.mh, v2, v3 + v11, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(hq.cm * v19 == 14) {
                    v9 = hq.bp * 0x98D0C4CE + 100 + 0x66CDAF47;
                    switch(hq.ch * 0x152B44FF) {
                        case 0: {
                            ax.bf(gs.cj, gs.cd, gs.cf, 0x63D3C206);
                            break;
                        }
                        case 1: {
                            ax.bf(gs.dl, gs.dr, gs.dn, 0x63D3C206);
                            break;
                        }
                        default: {
                            ht.ah(false, 0xE731F58F);
                            break;
                        }
                    }

                    arg24.ai(hq.cu, hq.by * v18 + 180, v9, 0xFFFF00, 0, arg28);
                    v9 += v7;
                    arg26.ai(hq.cq, hq.by * 0xAFBA9E31 + 180, v9, 0xFFFF00, 0, arg28);
                    arg26.ai(hq.cv, hq.by * v18 + 180, v9 + 15, 0xFFFF00, 0, arg28);
                    v2 = hq.by * v18 - 0x452F7A8D;
                    v0 = hq.bp * v8 - 0x67E45F02 + v11;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg24.ai(gs.bx, v2, v0 + 5, -305253915, 0, arg28);
                    v2 = hq.by * v18 + 180;
                    v1_1 = hq.bp * -1815194130 - 1274734004;
                    v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                    arg24.ai(gs.mh, v2, v1_1 + 5, 0xFFFFFF, 0, arg28);
                    goto label_392;
                }

                if(16 != hq.cm * -1959126110) {
                    if(hq.cm * 0x3848CE03 == 19) {
                    }
                    else {
                        if(hq.cm * v19 != 17) {
                            if(hq.cm * 0x8D29635B == 18) {
                            }
                            else {
                                if(hq.cm * v19 != v7) {
                                    if(23 == hq.cm * v19) {
                                    }
                                    else if(21 == hq.cm * -609436990) {
                                        v7 = bi.bt * -1806010139;
                                        v9 = hq.bp * v8 + 100 - 0x36F2D3F1;
                                        arg26.ai(gs.oe, v7, v9, 0xE0590E3D, 0, arg28);
                                        v9 += 17;
                                        arg26.ai(gs.od, v7, v9, 2071798966, 0, arg28);
                                        v9 += 17;
                                        arg26.ai(gs.ox, v7, v9, 0x8B4F5A1A, 0, arg28);
                                        arg26.ai(gs.oq, v7, v9 + 17, 0xAB2D4605, 0, arg28);
                                        v2 = bi.bt * 0xDC50C77 + 0x7EF4B93B;
                                        v0 = hq.bp * v8 - 0x4AEE19F1;
                                        v7 = v0 - 20;
                                        v14.ag(in.ai, v2 - 73, v7, 1);
                                        v8 = v0 + 5;
                                        arg24.ai(gs.oy, v2, v8, 0xFFFFFF, 0, arg28);
                                        v2 = bi.bt * 0x95987A0C + 80;
                                        v14.ag(in.ai, v2 - 1100685521, v7, 1);
                                        arg24.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg28);
                                        goto label_392;
                                    }
                                    else {
                                        if(22 == hq.cm * v19) {
                                            v7 = hq.bp * 1084583092 + 100 - 0x43AD92CF;
                                            arg24.ai(hq.cu, 0x48324740 + hq.by * 0x53549930, v7, 0xFFFF00, 0, arg28);
                                            v7 += 25;
                                            arg26.ai(hq.cq, -30003008 + hq.by * 0x57D94BF7, v7, 0xF8982ABD, 0, arg28);
                                            arg26.ai(hq.cv, hq.by * v18 - 1190560929, v7 + 25, 0xC24693F9, 0, arg28);
                                            v2 = hq.by * v18 + 0x456F85F2;
                                            v1_1 = hq.bp * 0xDB18C8D5 - 1400487519;
                                            v14.ag(in.ai, v2 + 0x7032D1B3, v1_1 - 20, 1);
                                            arg24.ai(gs.gu, v2, v1_1 + 5, 0xFFFFFF, 0, arg28);
                                        }
                                        else if(24 == hq.cm * v19) {
                                            v7 = hq.bp * v8 + 100 - 1056500631;
                                            arg24.ai(hq.cu, hq.by * -539040888 + 180, v7, 0xFFFF00, 0, arg28);
                                            v7 += 25;
                                            arg26.ai(hq.cq, hq.by * 0xF2993743 + 180, v7, 1300500146, 0, arg28);
                                            arg26.ai(hq.cv, hq.by * v18 + 180, v7 + 25, 0xFFFF00, 0, arg28);
                                            v2 = hq.by * 0x809105AC + 180;
                                            v1_1 = hq.bp * v8 - 1522330208;
                                            v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                                            arg24.ai(gs.an, v2, v1_1 + 5, 0xFFFFFF, 0, arg28);
                                        }
                                        else {
                                        }

                                        goto label_392;
                                    }
                                }

                                v7 = hq.bp * v8 - 0x6F48EAF7;
                                arg24.ai(hq.cu, 0xB815740E + hq.by * 0xB78B1F8C, v7, 0xFFFF00, 0, arg28);
                                v7 += 25;
                                arg24.ai(hq.cq, hq.by * -1714350631 - 0x320D922F, v7, 0xD37647C0, 0, arg28);
                                arg24.ai(hq.cv, hq.by * 0xCCF08B17 + 0x3B4F8ADB, v7 + 25, 0x8B03A700, 0, arg28);
                                goto label_392;
                            }
                        }

                        v8 = hq.bp * v8 + 30;
                        arg24.ai(hq.cu, 427740027 * bi.bt, v8, 0xFFFF00, 0, arg28);
                        v8 += v7;
                        arg24.ai(hq.cq, bi.bt * 0xD700E425, v8, 0xFFFF00, 0, arg28);
                        arg24.ai(hq.cv, 0xD700E425 * bi.bt, v8 + 15, 0xFFFF00, 0, arg28);
                    label_392:
                        v12_2 = 5;
                        goto label_2772;
                    }
                }

                v8 = hq.bp * v8 + 100 - 0x608F0EE3;
                arg24.ai(hq.cu, 0xD700E425 * bi.bt, v8, 2010872465, 0, arg28);
                v8 += v7;
                arg24.ai(hq.cq, 840398890 * bi.bt, v8, 0xBBD63BF0, 0, arg28);
                arg24.ai(hq.cv, bi.bt * 0x593D8FAB, v8 + 15, 1204769080, 0, arg28);
                v0_5 = hq.cm * v19 == 16 ? gs.kw : gs.kg;
                v1 = v0_5;
                v0 = hq.by * 0x63FAC4FC + 180 + 2021020546;
                v9 = hq.bp * 0x4A2FB487 + 0x684161DA + v10 - 20;
                v14.ag(in.ai, v0 + 0x14A2DC9A, v9, 1);
                v12_2 = 5;
                arg24.av(v1, v0 - 73, v9, 0x90, 0x9E667074, 0xFFFFFF, 0, 1, 1, 0, arg28);
                v2 = hq.by * 0xC84AB7BE + 0xCD9BF35;
                v14.ag(in.ai, v2 - 1035208702, v9, 1);
                arg24.av(gs.kq, v2 - 73, v9, 0xB881316F, 40, 0xFFFFFF, 0, 1, 1, 0, arg28);
            }
        }
        else {
            goto label_392;
        }

    label_2772:
        if(v16 >= hq.fl * -611935993406195833L) {
            cl.ac.ae(hq.ab * 0x4D586FC3 - 22, client.bj * -2077001153, v14, -20);
            cl.ac.ae(hq.ab * 0xE2B3F91D + 787 + 0x379A27A5, client.bj * -2077001153, v14, -26);
        }

        v14.ag(ax.ay[li.rg.ar], hq.ab * 0xA79EFC75 - 0x6CCDC8B1, 0x1C0, 1);
        if(client.ac * 0xC5C7CFA0 > v12_2 && ly.ax == en.af) {
            if(dy.ey != null) {
                v0 = hq.ab * -2094874308 + 20;
                v14.ag(dy.ey, v0, 0x5550A880, 1);
                v1_2 = new StringBuilder();
                v1_2.append(gs.hc);
                v1_2.append(" ");
                v1_2.append(client.ae * 0x8076F529);
                v7 = v0 + 0x2E2E992;
                arg24.ai(v1_2.toString(), v7, 0x8F618EE9, 0xC5F2CDC0, 0, arg28);
                if(li.ab != null) {
                    arg25.ai(gs.ne, v7, 0x8F618EF7, 0xFFFFFF, 0, arg28);
                }
                else {
                    v0_5 = client.al.au ? gs.ni : gs.ns;
                    arg25.ai(v0_5, v7, 0x8F618EF7, 0x248283AF, 0, arg28);
                }
            }
            else {
                dy.ey = aa.aq(eo.dh, "sl_button", "", -18);
            }

            v7 = 11;
            v8 = bi.bt * 0xB92CFD5E;
            arg25.ai(String.format(gs.nl, Integer.valueOf(Calendar.getInstance().get(1))), v8, 465, 0xED3EFA03, 0, arg28);
            v10 = 477;
            arg25.ai(gs.nw, v8, v10, 0x267FB4A0, 0, arg28);
            if(jl.fk != null && bl.fv != null && eh.fc != null) {
                return;
            }

            v8 -= v13.ar(gs.nw) / 2;
            v0 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nr))) + v8;
            v1_1 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nb))) + v8;
            v8 += v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.ng)));
            jl.fk = new or(v0, v10, v13.ar(gs.nr), v7);
            bl.fv = new or(v1_1, v10, v13.ar(gs.nb), v7);
            eh.fc = new or(v8, v10, v13.ar(gs.ng), v7);
        }
    }

    static ib eh() {
        int v8;
        int v7;
        int v3;
        int v4;
        int v2;
        ib v0 = new ib();
        v0.ax = 0x580C84F8;
        v0.al = 0x1F6CF4B3;
        v0.ae = 0x332F6AC3;
        v0.ar = 1305640072;
        do {
        label_10:
            v2 = 0x9BA2F453;
            int v1 = v0.ar * v2;
            v4 = 0xDFEB996D;
            v3 = v0.ae * v4;
            v7 = 0x6DE6A9AD;
            if(v0.ar * v2 * (v0.ae * v4 - 1) >= ih.ap * v7) {
                v0.ae -= -1104455579;
            }

            v8 = 0x78936FDB;
            if((v0.ar * v2 - 1) * (v0.ae * v4) >= ih.ap * v7) {
                v0.ar -= v8;
            }

            if(v0.ae * v4 * (v0.ar * v2 - 1) >= ih.ap * v7) {
                v0.ar -= v8;
            }

            if(v0.ar * v2 != v1) {
                goto label_10;
            }
        }
        while(v0.ae * v4 != v3);

        int v5 = -204538603;
        v0.an = (0x2FD - v0.ae * v4 * (v0.ax * v5)) / (v0.ae * v4 + 1) * 0x891273C7;
        v3 = 0x75C55DF7;
        int v6 = 5;
        if(v0.an * v3 > v6) {
            v0.an = 0xAD5C42E3;
        }

        v7 = -250202335;
        v0.ap = (480 - v0.al * v7 * (v0.ar * v2)) / (v0.ar * v2 + 1) * -1109048587;
        v8 = 0xDF01D95D;
        if(v0.ap * v8 > v6) {
            v0.ap = -1250275639;
        }

        v0.aj = (0x2FD - v0.ax * v5 * (v0.ae * v4) - (v0.ae * v4 - 1) * (v0.an * v3)) / 2 * 0x906913F5;
        v0.ad = (v0.aj * 0xE1ECC05D + (v0.ax * v5 + v0.an * v3) * (v0.ae * v4) - v0.an * v3) * -1856600581;
        v0.aq = (480 - v0.ar * v2 * (v0.al * v7) - (v0.ar * v2 - 1) * (v0.ap * v8)) / 2 * 0x377FCBE7;
        return v0;
    }

    static int ei() {
        int v0 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 0xEE0C033F;
        ib v1 = ds.bp(0x677FA0E4);
        int v4 = 0x399617D7;
        int v3 = v1.aq * v4 + 23;
        int v5 = v1.aj * 0xE1ECC05D + hq.ab * 0x4D586FC3;
        int v8 = 0x9BA2F453;
        int v6 = hq.ev * 0xE513D117 * (v1.ar * v8);
        int v9 = 0;
        while(v6 < ih.ap * 0x6DE6A9AD) {
            int v10 = -204538603;
            int v11 = -250202335;
            if(v0 >= v5 && v2 >= v3 && v0 < v1.ax * v10 + v5 && v2 < v1.al * v11 + v3) {
                return v6;
            }

            v3 += v1.ap * 0xDF01D95D + v1.al * v11;
            ++v9;
            if(v9 >= v1.ar * v8) {
                v3 = v1.aq * v4 + 23;
                v5 += v1.ax * v10 + v1.an * 0x75C55DF7;
                v9 = 0;
            }

            ++v6;
        }

        return -1;
    }

    static void ej(boolean arg1) {
        hq.cu = gs.ij;
        hq.cq = gs.iz;
        hq.cv = gs.iw;
        hq.cm = 0xCA7E70BA;
        if(arg1) {
            hq.co = "";
        }

        ah.ap(0x7CA09F1);
        ey.aw(0xEB95E8A8);
        ei.ad(0xF43F2E3A);
    }

    static ar ek() {
        ar v0 = client.al.aba(0x5302DE1C).az(0, 0x3310F9D5);
        v0.as(hq.cg, 0, 0x98B6F419);
        v0.as(hq.co, 1, 0xBC6C1455);
        return v0;
    }

    static void el(od arg25, od arg26, od arg27, boolean arg28, fa arg29) {
        String v0_5;
        int v12_2;
        ef v0_4;
        int v1_1;
        float v7_1;
        float v5_1;
        int v11;
        int v4_1;
        int v2;
        byte v12_1;
        int v6;
        String v21_1;
        int v3;
        byte v10_1;
        int v7;
        int v0;
        od v12 = arg25;
        od v13 = arg26;
        fa v14 = arg29;
        v14.al(89);
        int v15 = 2;
        hq.ab = (dq.tv * 0x9F1CAC3D - 0x2FD) / v15 * -1412083403;
        hq.by = hq.ab * 1659746085 - 0x5FE64FBA;
        bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
        if(hq.ea) {
            gn.bn(v12, v13, v14, 0x1F29E7F6);
            return;
        }

        long v16 = ji.ax(0x2076E2C1);
        if(-1 == hq.fl * -611935993406195833L) {
            hq.fh = (v16 + 300) * 0x7F9153A5B5120AE9L;
            hq.fl = hq.fh * 0x3E24E342FD076C1FL - 0xD397F4858CD2F18L;
        }

        if(v16 < hq.fh * -4462661976294855335L) {
            return;
        }

        int v18 = 0xD700E425;
        if(v16 < hq.fl * -611935993406195833L) {
            v0 = ((int)((((float)(v14.al * -107049639 / v15))) * hq.fy.ax(1f - (((float)(hq.fl * -611935993406195833L - v16))) / 600f, 0)));
            arg29.ef(bi.bt * 0x7F205EBD - v0, 0, bi.bt * v18 + v0, 0x2A9DF2, 0xAFF1F836);
        }

        gx.bq(v14, 0xD8580FCC);
        int v10 = 5;
        int v19 = 0x1A8B6787;
        int v9 = 20;
        int v20 = 287427031;
        if(client.ac * 0x498EF1C3 == 0 || client.ac * 0x2D64C477 == v10) {
            arg25.ai(gs.iv, hq.by * 1474668140 + 180, hq.bp * 0x2D36472E + 54, 0xFFFFFF, -1, arg29);
            v7 = hq.bp * v19 + 62;
            arg29.fz(hq.by * v20 - 2042141068 - 0x1D7399B8, v7, 0xD24CFCAB, 1198702405, 9179409, 0xBF1E464A);
            arg29.fz(hq.by * 0x673B9619 + 180 + 0x5BF89531, v7 + 1, 0xDF007DF5, 0x6E59C9EE, 0, -1565643608);
            v7 += v15;
            arg29.ar(hq.by * v20 + 30, v7, hq.bv * 0x97C256EA, 30, 9179409, 2);
            arg29.ar(hq.by * 0x2E7FE206 + 180 - 1550392940 + hq.bv * 0xE7509707, v7, 300 - hq.bv * 0x18E6433D, 30, 0, 2);
            if(client.al.abd(0x6AAFBB13) == 3) {
                hq.bq = "Initialising game";
            }

            arg25.ai(hq.bq, hq.by * 0x6EDD0EA5 - 302026403, hq.bp * v19 - 1015725608 + v10 - v9, -1482560426, -1, arg29);
        }

        v7 = 0xF7EE5BF5;
        int v8 = 15;
        if(v9 == client.ac * 0x498EF1C3 || hq.cm * -1405879206 == v9) {
            v14.ag(hq.af, hq.by * 0x70A0AC27 + 1576090579 - hq.af.ae / v15, hq.bp * v19 + 100 - hq.af.ar / v15, 1);
            int v21 = hq.bp * 0x961B58C9 + 100 + 0x4A5CD8F8;
            v10_1 = 1;
            arg25.ai(hq.cu, hq.by * 0x384410AE + 0x3B262055, v21, -1575807596, 0, arg29);
            v21 += 15;
            arg25.ai(hq.cq, hq.by * v20 - 0x67916A18, v21, 0x3B55903B, 0, arg29);
            v21 += 15;
            arg25.ai(hq.cv, hq.by * -1573393740 + 180, v21, 0xFFFF00, 0, arg29);
            v21 += 22;
            if(hq.cm * 0x2EE0E994 != 4 && hq.cm * -514056843 != 0 && hq.cm * v7 != 10 && hq.cm * v7 != v9 && 18 != hq.cm * v7 && 16 != hq.cm * v7 && hq.cm * v7 != 1) {
                arg25.aq(gs.lf, hq.by * v20 + 180 + 288470790, v21, 0x2DF3A73E, 0, arg29);
                v0 = 0xD79CADB4;
                String v1;
                for(v1 = en.an(0x95980AE9); v12.ar(v1) > v0; v1 = v1.substring(0, v1.length() - 1)) {
                }

                arg25.aq(od.ad(v1), hq.by * v20 + 180 + 2028451207, v21, -1253880139, 0, arg29);
                arg25.aq(gs.lg + ff.az(hq.co, 0xC52642B0), hq.by * 0x6E685DA1 + 180 - 0xDEA1F4E, v21 + 15, 0xFFFFFF, 0, arg29);
            }

            if(v9 != hq.cm * v7) {
                goto label_371;
            }

            he.bm(hq.co, client.al.au, -26);
        }
        else {
            v10_1 = 1;
        }

    label_371:
        if(10 == client.ac * 0x498EF1C3 || 11 == client.ac * 0x1106377F) {
            v14.ag(hq.af, hq.by * 0xF2E45E6F, hq.bp * 0xD70042E5, v10_1);
            if(hq.cm * v7 == 0) {
                v3 = hq.bp * v19 + 80;
                v7 = hq.by * v20 + 0x29E73E5;
                ah v0_2 = client.al.aba(-875521500).bh(1943645740);
                if(v0_2 != null) {
                    if(!v0_2.hf(-90) && !v0_2.ad(1052920257)) {
                        goto label_510;
                    }

                    v1 = "";
                    if(v0_2.hf(-15)) {
                        v21_1 = gs.lj;
                        v8 = 1;
                    }
                    else if(v0_2.ad(0x359DEE9B)) {
                        v21_1 = gs.ln;
                        v8 = 2;
                    }
                    else {
                        v21_1 = v1;
                        v8 = 0;
                    }

                    arg25.ai(gs.lt, hq.by * 0x168E5561 + 180, hq.bp * 0x7606F13A + 44, 0xBACCDA21, 0, arg29);
                    v6 = hq.bp * v19 + 58;
                    int v5 = v7 - hq.au.ae / v15;
                    v14.ag(hq.au, v5, v6, v10_1);
                    v14.ag(eh.am[v8], v5 + 4, v6 + 4, v10_1);
                    v8 = eh.am[v8].ae / v15 + bi.bt * 0x3FF8F079 + 3;
                    arg25.ai(v21_1, v8, v6 + 26, 0xFFFFFF, 0, arg29);
                    v6 += hq.au.ar + 6;
                    v14.ag(hq.au, v7 - hq.au.ae / v15, v6, v10_1);
                    v14.ag(eh.am[0], v5 + 5, v6 + 4, v10_1);
                    arg25.ai(gs.lv, v8, v6 + 26, 0xFFFFFF, 0, arg29);
                    v12_1 = 0;
                }
                else {
                label_510:
                    v7 += -80;
                    arg25.ai(gs.lt, hq.by * v20 + 180, v3, 0xFFFF00, 0, arg29);
                    v8 = hq.bp * 0xA7A05E21 + 100 + v9 - 20;
                    v14.ag(in.ai, v7 - 0x3CFCFF43, v8, v10_1);
                    v12_1 = 0;
                    arg25.av(gs.li, v7 - 73, v8, 1180281729, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
                    v2 = hq.by * v20 - 0x57C760F3;
                    v14.ag(in.ai, v2, v8, 1);
                    arg25.av(gs.lx, v2, v8, 0x94DBF72C, 40, -1948390602, 0, 1, 1, 0, arg29);
                }

                if(client.al.abd(0x6AD350B6) == 3) {
                    goto label_382;
                }

                v8 = hq.bp * v19 + 0xAE;
                if(hq.fe * 0x61810D62574D4ADL == -1) {
                    goto label_382;
                }

                if(v16 < hq.fe * 0x61810D62574D4ADL) {
                    goto label_382;
                }

                if(hq.fd * -8957420507059323547L != -1 && v16 >= hq.fd * -8957420507059323547L + 5000) {
                    goto label_382;
                }

                iz v0_3 = dc.bf(0xA336A941);
                v1 = "All game data synchronised";
                v2 = v13.ar(v1);
                v9 = hq.by * v20 + 30;
                if(v0_3 != null) {
                    v0 = cx.ba(14);
                    StringBuilder v4 = new StringBuilder();
                    v4.append("Synchronising game data - ");
                    v4.append("99.11%");
                    v4_1 = v13.ar(v4.toString());
                    v21_1 = "Synchronising game data - " + hq.eb.format(((double)((((float)v0)) / 100f))) + "%";
                    v11 = 0xB9BDA4DC * v0 / 10000;
                    v10 = v4_1;
                    v19 = 0x31C3E7;
                }
                else {
                    v21_1 = v1;
                    v10 = v2;
                    v11 = 300;
                    v19 = 0x329F062C;
                }

                v6 = 0xBB574F5F;
                if(-1 != hq.fd * -8957420507059323547L && v16 > hq.fd * -8957420507059323547L + 4700) {
                    v5_1 = 1f - (((float)(v16 - hq.fd * -8957420507059323547L - 4700))) / 300f;
                    goto label_671;
                }
                else if(v16 < hq.fe * 0x61810D62574D4ADL + 300) {
                    v5_1 = (((float)(v16 - hq.fe * 0x61810D62574D4ADL))) / 300f;
                label_671:
                    v7_1 = v5_1;
                }
                else {
                    v7_1 = 1f;
                }

                v14.et(hq.fi, -1966105709);
                if(v7_1 != 1f) {
                    v0 = ((int)(hq.eh.ax(v7_1, v12_1) * 304f));
                    v1_1 = hq.by * 0x1C9B480A + 180 - v0 / 2;
                    v2 = v8 - 14;
                    arg29.ef(v1_1, v2, v0 + v1_1, v2 + 20, 0x39813465);
                }

                int v23 = ((int)(128f * v7_1));
                arg29.fy(v9 - 2, v8 - 14, v6, 20, v19, v23, 0x89F16204);
                arg29.ae(v9, v8 - 12, v11, 16, v19, v23, 0x5F29EAC7);
                arg26.ab(v21_1, hq.by * v20 + 0x1BC8F7BE - v10 / 2, v8, 0x70DB2ACE, 0, ((int)(v7_1 * 255f)), arg29);
                v14.fa(hq.fi, -989494300);
                goto label_382;
            }
            else {
                if(1 == hq.cm * 0x600ED19A) {
                    arg25.ai(hq.ct, hq.by * 1763348099 + 180, hq.bp * 0x65F1778 + 0x10FAC3EC, 0x8A13BB39, 0, arg29);
                    v7 = hq.bp * v19 - 1060215308;
                    arg25.ai(hq.cu, 0xBF6ADE75 + hq.by * v20, v7, 0xFFFFFF, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cq, hq.by * 0x15ACDF75 - 0x50AE0240, v7, 0xFFFFFF, 0, arg29);
                    arg25.ai(hq.cv, hq.by * v20 + 180, v7 + 15, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * -2070006875 + 100;
                    v1_1 = hq.bp * v19 - 0x16E65546;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 0x32C257CF, v7, 1);
                    v8 = v1_1 + 5;
                    arg25.ai(gs.aj, v2, v8, -473402745, 0, arg29);
                    v2 = hq.by * 0x4BD04D10 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_382;
                }

                v11 = 5;
                if(2 == hq.cm * -664253042) {
                    v7 = hq.bp * v19 + 0x368E92AF + 0x3583B3B4;
                    arg25.ai(hq.cu, bi.bt * v18, v7, 0xFFFF00, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cq, bi.bt * v18, v7, 0x9E21949, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cv, bi.bt * v18, v7, 1002749388, 0, arg29);
                    v7 = v7 + v8 + 7;
                    arg25.aq(gs.lf, bi.bt * v18 - 1084560110, v7, 0x22F2A960, 0, arg29);
                    v0 = 200;
                    v1 = en.an(1571051123);
                    v12 = arg25;
                    while(v12.ar(v1) > v0) {
                        v1 = v1.substring(1);
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1_1 = hq.dq * 0x36270AB8 == 0 ? 1 : 0;
                    v9 = 20;
                    v2 = client.bj * 0xD5FC0F41 % 40 < v9 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, 1508985110) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), bi.bt * -1906216365 - 70, v7, 0xFFFFFF, 0, arg29);
                    v3 = v7 + 15;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lg);
                    v0_1.append(ff.az(hq.co, 0xC52642B0));
                    v1_1 = 1 == hq.dq * 0xA36012C2 ? 1 : 0;
                    v2 = client.bj * 0x526720AB % 40 < v9 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0x60C0ACE, 0x312FD657) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), bi.bt * v18 - 108, v3, 787298609, 0, arg29);
                    v7 = hq.bp * 88267306 + 0x1CB50D10;
                    v1_1 = bi.bt * 2014937633 - 0x75;
                    v0_4 = fl.ar(client.er, hq.de, 0x51AF53D9);
                    v14.ag(v0_4, v1_1, v7, 1);
                    v8 = v7 + 13;
                    arg26.aq(gs.lq, v1_1 + (v0_4.ae + v11), v8, 0xFFFF00, 0, arg29);
                    v0 = bi.bt * v18 + 24;
                    ef v1_3 = fl.ar(li.rg.aj, hq.dk, 0xCE97BC71);
                    v14.ag(v1_3, v0, v7, 1);
                    arg26.aq(gs.lo, v0 + (v1_3.ae + v11), v8, 0xFFFF00, 0, arg29);
                    v2 = bi.bt * v18 - 80;
                    v0 = hq.bp * 2078440501 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.lc, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = bi.bt * 0xC77FD7A3 - 0x40925A7F;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.lb, v2, v8, 0x9D8807D9, 0, arg29);
                    v3 = hq.bp * v19 + 702567096;
                    dl.cn = hq.cz * 0x2D49CD0F != 2 ? gs.mu : gs.mm;
                    em.cl = new or(bi.bt * v18, v3, v13.ar(dl.cn), 11);
                    dq.ck = new or(bi.bt * v18, v3, v13.ar(gs.mk), 11);
                    arg26.ai(dl.cn, bi.bt * 0xE23E6843, v3, 0xFFFFFF, 0, arg29);
                    if(client.al.abd(0x5D57AEFA) != 3 && client.al.abd(0x7D81CFC4) != 2) {
                        goto label_382;
                    }

                    v0 = hq.bp * v19 + 0x4241CC0F;
                    v1_1 = bi.bt * 0x7FCD0530 - hq.au.ae / 2;
                    v14.ag(hq.au, v1_1, v0, 1);
                    v14.ag(eh.am[0], v1_1 + v11, v0 + 4, 1);
                    arg25.ai(gs.le, bi.bt * v18 + eh.am[1].ae / 2 + 3, v0 + 26, 0xD65E2495, 0, arg29);
                    goto label_382;
                }

                v9 = 20;
                v12 = arg25;
                if(3 == hq.cm * -630531699) {
                    v7 = hq.bp * 1063643550 - 0x6F4A4984;
                    arg25.ai(gs.ll, hq.by * 0x2E3E3413 + 316020746, v7, 0xFFFF00, 0, arg29);
                    v7 += v9;
                    arg26.ai(gs.la, hq.by * 0x2915E0DB - 75606676, v7, 0xFFFF00, 0, arg29);
                    arg26.ai(gs.lu, 820075882 + hq.by * v20, v7 + 15, 0x60158725, 0, arg29);
                    v2 = hq.by * v20 + 894988730;
                    v1_1 = hq.bp * v19 + 608866701 + v11;
                    v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                    arg27.ai(gs.lw, v2, v1_1 + 5, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * 1723670874 - 308470431;
                    v14.ag(in.ai, v2 - 1001691901, v0 - 20, 1);
                    arg27.ai(gs.ls, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_382;
                }

                if(4 == hq.cm * v7) {
                    arg25.ai(gs.jj, hq.by * 0x1C1CFF52 + 0x7804FB19, hq.bp * v19 + 100 + 0x721A439, -1470074055, 0, arg29);
                    v7 = hq.bp * 0xE7132490 - 0x2F5E36BB + 0x6F3AC61A;
                    arg25.ai(hq.cu, hq.by * 0x94490083 - 0x5467FF70, v7, 0xFFFFFF, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cq, hq.by * 0xA980425E - 0x1240A5A1, v7, 0xFFFFFF, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cv, hq.by * 0xAA034371 + 180, v7, 848207462, 0, arg29);
                    v7 += v8;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lk);
                    v0_1.append(ff.az(da.ds, 0xC52642B0));
                    v1 = client.bj * -2077001153 % 40 < v9 ? im.al(0xFFFF00, 0xCC13FA3C) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), hq.by * v20 - 0x225C10C9, v7, 0xCE45B66F, 0, arg29);
                    v7 += -8;
                    arg25.aq(gs.ab, hq.by * v20 + 0xAB, v7, 0xFFFF00, 0, arg29);
                    v7 += v8;
                    arg25.aq(gs.af, hq.by * v20 + 0xAB, v7, 0xFFFF00, 0, arg29);
                    v1_1 = hq.by * 0xB8B87D86 + 0xAB + v12.ar(gs.af) + v8;
                    v7 -= v12.aj;
                    v0_4 = hq.dy ? oa.as : bz.aw;
                    v14.ag(v0_4, v1_1, v7, 1);
                    v2 = hq.by * 0x2479B519 + 100;
                    v7 = hq.bp * v19 + 0x5B090376;
                    v8 = v7 - 20;
                    v14.ag(in.ai, v2 + 1232225106, v8, 1);
                    v19 = v7 + 5;
                    arg25.ai(gs.aj, v2, v19, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * -891220904 - 0x44D573A5;
                    v14.ag(in.ai, v2 + 971807560, v8, 1);
                    arg25.ai(gs.lb, v2, v19, -1310515539, 0, arg29);
                    arg26.ai(gs.jw, 0x5E200D1B + hq.by * v20, v7 + 36, -1968277009, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * 0xC4AD275B == v11) {
                    arg25.ai(gs.ld, hq.by * 0x20E26E7E + 180, hq.bp * v19 - 0x64C500F9, 0xFFFF00, 0, arg29);
                    v7 = hq.bp * v19 + 50;
                    arg27.ai(hq.cu, hq.by * 0xC857D61C + 458980009, v7, 0xF1E4661A, 0, arg29);
                    v7 += v8;
                    arg27.ai(hq.cq, hq.by * 1919137093 + 0x40F78E71, v7, 0xDE32C30A, 0, arg29);
                    v7 += v8;
                    arg27.ai(hq.cv, hq.by * v20 - 0x66A47101, v7, -1430587075, 0, arg29);
                    v7 = v7 + v8 + 14;
                    arg25.aq(gs.my, hq.by * v20 + 35, v7, 0xFFFFFF, 0, arg29);
                    v0 = 0xAE;
                    for(v1 = en.an(1709875483); v12.ar(v1) > v0; v1 = v1.substring(1)) {
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1 = client.bj * 0xF1BB3AC4 % 507357062 < v9 ? im.al(0xFFFF00, 0x9FFF6A00) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), hq.by * v20 + 0x51C4DAE7 + 0x1166C78D, v7, 0x664625E1, 0, arg29);
                    v2 = hq.by * v20 + 180 - 1650351773;
                    v1_1 = hq.bp * v19 + 0x2E3ED07E;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg25.ai(gs.me, v2, v8, 0xA4B3E6B7, 0, arg29);
                    v2 = hq.by * v20 + 0xE908087;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 0x5B772B0B, 0, arg29);
                    arg26.ai(gs.mk, bi.bt * -2006087288, hq.bp * v19 - 0x2DC8D420, 0xFFFFFF, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * v7 == 6) {
                    v7 = hq.bp * v19 - 0x50F28A54 + 0x3F8DCC71;
                    arg25.ai(hq.cu, 0xAFB99ECC + hq.by * v20, v7, 0x27DEE810, 0, arg29);
                    v7 += v8;
                    arg25.ai(hq.cq, hq.by * 0xBCFF0CAC + 180, v7, 0x5DFAE331, 0, arg29);
                    arg25.ai(hq.cv, hq.by * 0x9A094F99 - 68067060, v7 + 15, 0xF306FDF3, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * 0x910E61DB - 0x5C52D2B1;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.mh, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * v7 == 7) {
                    v7 = hq.bp * 0x24F65AA4 - 0x6F3E2178;
                    arg25.ai(gs.nj, hq.by * v20 + 0x72AE7AFF, v7, 0xFFFF00, 0, arg29);
                    v7 += v8;
                    arg27.ai(gs.nu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                    arg27.ai(gs.nm, hq.by * 0x7F1D6B39 + 180, v7 + 15, 0x1EFC62CE, 0, arg29);
                    v2 = hq.by * v20 + 0x47ECF928;
                    v1_1 = hq.bp * 0xE6D22227 + 0x2C737485;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg25.ai(gs.nh, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * -1709985017 + 0x12FD7F08;
                    v14.ag(in.ai, v2 + 0x5C5C71F3, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 122020582, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * v7 == 8) {
                    v7 = hq.bp * 0xAF036077 + 0x65BABE60;
                    arg25.ai(hq.cu, hq.by * 487770449 + 0xACD483B, v7, 0xFFFF00, 0, arg29);
                    v7 += v8;
                    arg27.ai(hq.cq, hq.by * v20 + 0x26D155B3, v7, 0xFFFF00, 0, arg29);
                    arg27.ai(hq.cv, hq.by * 0x27BCAFC8 + 180, v7 + 15, 1322484007, 0, arg29);
                    v2 = hq.by * v20 + 0x2CFF51C4;
                    v0 = hq.bp * 0x2EEB1F2C + 0x2F26F9C7;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.fo, v2, v8, 0xEBF3E8D0, 0, arg29);
                    v2 = hq.by * v20 + 0x17CDD76D;
                    v14.ag(in.ai, v2 + 0x50A4EC03, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 0x7F96C9ED, 0, arg29);
                    goto label_382;
                }

                if(9 == hq.cm * 1582061752) {
                    v7 = hq.bp * v19 + 50;
                    arg25.ai(hq.cu, hq.by * 0x19E39FFD - 0x5922C20C, v7, 0xFFFF00, 0, arg29);
                    v7 += 25;
                    arg25.ai(hq.cq, hq.by * v20 + 180, v7, 836101430, 0, arg29);
                    arg25.ai(hq.cv, hq.by * 0x96E2C36A + 180, v7 + 25, -1099546302, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 140;
                    v14.ag(in.ai, v2 + 1699129022, v0 - 20, 1);
                    arg25.ai(gs.lw, v2, v0 + 5, 0x2B3B8743, 0, arg29);
                    goto label_382;
                }

                if(10 == hq.cm * 0x1CBD1190) {
                    v7 = hq.by * 0x4FB1E8C4 + 0x3CA1325F;
                    v19 = hq.bp * 0x543080A8 + 1600022438;
                    arg25.ai(gs.lt, hq.by * v20 - 0x72287B61, v19, 0xC0575DA1, 0, arg29);
                    v0 = v19 + 20;
                    v14.ag(hq.av, v7 - 109, v0, 1);
                    if(je.ap(hq.dv, 0x2E33B013).isEmpty()) {
                        v14.ag(li.aa, v7 - 0x30, v0 + 18, 1);
                    }
                    else {
                        v14.ag(li.aa, v7 - 0x25255540, v0 + 5, 1);
                        arg25.ai(hq.dv, v7, v0 - 0xFA85E8D, 180038782, 0, arg29);
                    }

                    v1_1 = hq.bp * 0x7553C6DA - 0x2604A1BA;
                    v14.ag(in.ai, v7 - 73, v1_1, 1);
                    arg25.ai("Sign out", v7, v1_1 + 25, 510667940, 0, arg29);
                    goto label_382;
                }

                if(11 == hq.cm * 0x7325F100) {
                    arg25.ai("Are you sure you want to sign out?", hq.by * v20 + 180, hq.bp * v19 + 80, 0xFFFF00, 0, arg29);
                    v2 = hq.by * -2072322499 + 0x6AA17265;
                    v1_1 = hq.bp * v19 - 2006227590 + v9;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg25.ai("Yes", v2, v8, -975600971, 0, arg29);
                    v2 = hq.by * v20 - 0x2F1B377D;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai("No", v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * 0x7EF7082F == 12) {
                    v7 = bi.bt * 0x92BF4711;
                    v8 = hq.bp * 0xF0B9F6AF + 45;
                    arg27.ai(gs.ny, v7, v8, 0xFFFFFF, 0, arg29);
                    v8 += 17;
                    arg27.ai(gs.os, v7, v8, 0x96509500, 0, arg29);
                    v8 += 17;
                    arg27.ai(gs.oa, v7, v8, 0x78A2C04B, 0, arg29);
                    arg27.ai(gs.of, v7, v8 + 17, 316901739, 0, arg29);
                    v2 = bi.bt * 0x8E071653 - 80;
                    v1_1 = hq.bp * v19 - 0x47FE9624;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg25.ai(gs.oy, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = bi.bt * v18 - 0x31D0587E;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.om, v2, v8, 485221026, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * v7 == 13) {
                    v7 = hq.bp * -782884018 + 0x4F3446FF - 871686500;
                    arg27.ai(gs.ob, hq.by * 0xCFAE3473 + 180, v7, 0xFFFFFF, 0, arg29);
                    arg27.ai(gs.op, 0x39913A37 + hq.by * v20, v7 + 20, 0x1793FA3C, 0, arg29);
                    v2 = hq.by * 0x3733BD52 + 180;
                    v3 = hq.bp * 0xDA6250F9 - 1700908757;
                    v14.ag(in.ai, v2 - 73, v3 - 20, 1);
                    arg25.ai(gs.mh, v2, v3 + v11, 760831466, 0, arg29);
                    goto label_382;
                }

                if(hq.cm * v7 == 14) {
                    v7 = hq.bp * v19 + 30;
                    switch(hq.ch * 0xA5FB0EE0) {
                        case 0: {
                            ax.bf(gs.cj, gs.cd, gs.cf, 0x63D3C206);
                            break;
                        }
                        case 1: {
                            ax.bf(gs.dl, gs.dr, gs.dn, 0x63D3C206);
                            break;
                        }
                        default: {
                            ht.ah(false, 0x263F4FDE);
                            break;
                        }
                    }

                    arg25.ai(hq.cu, hq.by * v20 - 0x68B342F3, v7, 0x766D8830, 0, arg29);
                    v7 += v8;
                    arg27.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                    arg27.ai(hq.cv, hq.by * 0x322C0428 + 180, v7 + 15, 0x15E6DE7B, 0, arg29);
                    v2 = hq.by * v20 - 2045269086;
                    v0 = hq.bp * v19 - 0x20EB311 + v11;
                    v14.ag(in.ai, v2 + 0x258F7926, v0 - 20, 1);
                    arg25.ai(gs.bx, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v1_1 = hq.bp * -476673095 + 0x9B;
                    v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                    arg25.ai(gs.mh, v2, v1_1 + 5, 0xADB46071, 0, arg29);
                    goto label_382;
                }

                if(16 != hq.cm * v7) {
                    if(hq.cm * v7 == 19) {
                    }
                    else {
                        if(hq.cm * v7 != 17) {
                            if(hq.cm * v7 == 18) {
                            }
                            else {
                                if(hq.cm * -1052250140 != v8) {
                                    if(23 == hq.cm * 0xA0C6BDD2) {
                                    }
                                    else if(21 == hq.cm * 0x1CE60FFD) {
                                        v7 = bi.bt * v18;
                                        v8 = hq.bp * v19 - 0x1A641D75 - 914773063;
                                        arg27.ai(gs.oe, v7, v8, 0xFFFFFF, 0, arg29);
                                        v8 += 17;
                                        arg27.ai(gs.od, v7, v8, 0xFFFFFF, 0, arg29);
                                        v8 += 17;
                                        arg27.ai(gs.ox, v7, v8, 0xFFFFFF, 0, arg29);
                                        arg27.ai(gs.oq, v7, v8 + 17, 0xFFFFFF, 0, arg29);
                                        v2 = bi.bt * v18 + 0x1DE015DC;
                                        v0 = hq.bp * v19 + 140;
                                        v7 = v0 - 20;
                                        v14.ag(in.ai, v2 + 0x120E12FB, v7, 1);
                                        v8 = v0 + 5;
                                        arg25.ai(gs.oy, v2, v8, 0xB721963F, 0, arg29);
                                        v2 = bi.bt * 0xEEFBFA5D + 80;
                                        v14.ag(in.ai, v2 - 73, v7, 1);
                                        arg25.ai(gs.lb, v2, v8, 0x69F4C55A, 0, arg29);
                                        goto label_382;
                                    }
                                    else {
                                        if(22 == hq.cm * v7) {
                                            v7 = hq.bp * 0x429DB7AC + 50;
                                            arg25.ai(hq.cu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            v7 += 25;
                                            arg27.ai(hq.cq, 595120826 + hq.by * 102239690, v7, 0xFFFF00, 0, arg29);
                                            arg27.ai(hq.cv, hq.by * v20 - 0x8349982, v7 + 25, -690674116, 0, arg29);
                                            v2 = hq.by * 0x97D034D2 + 180;
                                            v1_1 = hq.bp * v19 + 0x1B1B9D77;
                                            v14.ag(in.ai, v2 - 73, v1_1 - 20, 1);
                                            arg25.ai(gs.gu, v2, v1_1 + 5, 0x1243F1AD, 0, arg29);
                                        }
                                        else if(24 == hq.cm * v7) {
                                            v7 = hq.bp * 0xD945A9B2 + 108870739 - 840838438;
                                            arg25.ai(hq.cu, hq.by * v20 + 1838883910, v7, -108222345, 0, arg29);
                                            v7 += 25;
                                            arg27.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            arg27.ai(hq.cv, hq.by * v20 + 180, v7 + 25, 0x1C59AE41, 0, arg29);
                                            v2 = hq.by * v20 + 0xA6F422D;
                                            v1_1 = hq.bp * 0x27A5FD9E + 140;
                                            v14.ag(in.ai, v2 - 0x28B5BB2B, v1_1 - 20, 1);
                                            arg25.ai(gs.an, v2, v1_1 + 5, 2097993093, 0, arg29);
                                        }
                                        else {
                                        }

                                        goto label_382;
                                    }
                                }

                                v7 = hq.bp * v19 + 0x2D918200;
                                arg25.ai(hq.cu, 0x80495D96 + hq.by * 0xF31CA98F, v7, 0xA468FDB4, 0, arg29);
                                v7 += 25;
                                arg25.ai(hq.cq, hq.by * v20 + 180, v7, 0xF9E5010B, 0, arg29);
                                arg25.ai(hq.cv, hq.by * 0xEF241B14 - 742041590, v7 + 25, 0xFFFF00, 0, arg29);
                                goto label_382;
                            }
                        }

                        v7 = hq.bp * v19 - 0x4386259C;
                        arg25.ai(hq.cu, bi.bt * v18, v7, 0xFFFF00, 0, arg29);
                        v7 += v8;
                        arg25.ai(hq.cq, bi.bt * 1820005374, v7, 0x52790B79, 0, arg29);
                        arg25.ai(hq.cv, bi.bt * v18, v7 + 15, 0xFFFF00, 0, arg29);
                    label_382:
                        v12_2 = 5;
                        goto label_2708;
                    }
                }

                v7 = hq.bp * v19 + 100 + 0x115D16DE;
                arg25.ai(hq.cu, 0xAC0DFD6F * bi.bt, v7, 0xFFFF00, 0, arg29);
                v7 += v8;
                arg25.ai(hq.cq, 1209040017 * bi.bt, v7, 0xFFFF00, 0, arg29);
                arg25.ai(hq.cv, bi.bt * v18, v7 + 15, 0x853F421, 0, arg29);
                v0_5 = hq.cm * 0x2C7E3136 == 16 ? gs.kw : gs.kg;
                v4_1 = hq.by * -1430451303 + 27;
                v8 = hq.bp * v19 - 0x6F4948F1 + v9 - 20;
                v14.ag(in.ai, v4_1, v8, 1);
                v12_2 = 5;
                arg25.av(v0_5, v4_1, v8, 0x90, 0x2F5F8F6B, 0xFFFFFF, 0, 1, 1, 0, arg29);
                v1_1 = hq.by * 0x6072AB4A + 260;
                v14.ag(in.ai, v1_1 - 0x4B45DD5, v8, 1);
                arg25.av(gs.kq, v1_1 - 73, v8, 0xCE2F0CD0, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
            }
        }
        else {
            goto label_382;
        }

    label_2708:
        if(v16 >= hq.fl * -611935993406195833L) {
            cl.ac.ae(hq.ab * 0x4D586FC3 - 22, client.bj * 0x36085317, v14, -116);
            cl.ac.ae(hq.ab * 0x211C4FB1 - 0x563234FE + 2011928188, client.bj * 0x4D1E3D9B, v14, -55);
        }

        v14.ag(ax.ay[li.rg.ar], hq.ab * 0x4D586FC3 + 710, -829903733, 1);
        if(client.ac * 0x498EF1C3 > v12_2 && ly.ax == en.af) {
            if(dy.ey != null) {
                v0 = hq.ab * 0x5BF3C708 + 20;
                v14.ag(dy.ey, v0, 0xD14C8EF1, 1);
                v1_2 = new StringBuilder();
                v1_2.append(gs.hc);
                v1_2.append(" ");
                v1_2.append(client.ae * 0x8076F529);
                v7 = v0 + 50;
                arg25.ai(v1_2.toString(), v7, 0xC7379FA9, 0xFFFFFF, 0, arg29);
                if(li.ab != null) {
                    arg26.ai(gs.ne, v7, 0xC7379FB7, 0xFFFFFF, 0, arg29);
                }
                else {
                    v0_5 = client.al.au ? gs.ni : gs.ns;
                    arg26.ai(v0_5, v7, 0xC7379FB7, 0xFFFFFF, 0, arg29);
                }
            }
            else {
                dy.ey = aa.aq(eo.dh, "sl_button", "", -127);
            }

            v7 = 11;
            v8 = bi.bt * v18;
            arg26.ai(String.format(gs.nl, Integer.valueOf(Calendar.getInstance().get(1))), v8, 0x639C6E11, -996062970, 0, arg29);
            v10 = 0x639C6E1D;
            arg26.ai(gs.nw, v8, v10, 0x1DB3BF2B, 0, arg29);
            if(jl.fk != null && bl.fv != null && eh.fc != null) {
                return;
            }

            v8 -= v13.ar(gs.nw) / 2;
            v0 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nr))) + v8;
            v1_1 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nb))) + v8;
            v8 += v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.ng)));
            jl.fk = new or(v0, v10, v13.ar(gs.nr), v7);
            bl.fv = new or(v1_1, v10, v13.ar(gs.nb), v7);
            eh.fc = new or(v8, v10, v13.ar(gs.ng), v7);
        }
    }

    static void em() {
        client.al.aba(1200022053).gj("fpVPSZ", 1974697505);
        ax.bf(gs.mg, gs.mv, gs.ms, 0x63D3C206);
        hq.cm = 2050759121;
        ga.as(-1317805492).at(-2073539156);
    }

    static void en() {
        hq.cg = hq.cg.trim();
        int v1 = 0x63D3C206;
        if(hq.cg.length() == 0) {
            ax.bf(gs.mg, gs.mv, gs.ms, v1);
            return;
        }

        long v2 = gj.ax(306570266);
        int v0 = v2 == 0 ? 5 : gm.al(v2, hq.cg, 0x7F664489);
        switch(v0) {
            case 2: {
                client.al.aba(-1838260833).gj("ariMOV", 0xF0780FF6);
                ax.bf(gs.mb, gs.mo, gs.mi, v1);
                hq.cm = 0x688528DD;
                break;
            }
            case 3: {
                ax.bf(gs.mx, gs.mt, gs.mj, v1);
                break;
            }
            case 4: {
                ax.bf(gs.mr, gs.mn, gs.mz, v1);
                break;
            }
            case 5: {
                ax.bf(gs.mw, gs.mp, gs.mf, v1);
                break;
            }
            case 6: {
                ax.bf(gs.ml, gs.mc, gs.no, v1);
                break;
            }
            case 7: {
                ax.bf(gs.nq, gs.nc, gs.nd, v1);
                break;
            }
            default: {
                break;
            }
        }
    }

    static int eo() {
        int v0 = hq.fz.ae * 0x849F5667;
        int v2 = hq.fz.ar * 293301646;
        ib v1 = ds.bp(0x72311CB6);
        int v3 = v1.aq * 0x399617D7 + 23;
        int v4 = v1.aj * 0xE1ECC05D + hq.ab * 0x14B44A47;
        int v7 = 0x9BA2F453;
        int v5 = hq.ev * -107694710 * (v1.ar * v7);
        int v8 = 0;
        while(v5 < ih.ap * 0x6DE6A9AD) {
            if(v0 >= v4 && v2 >= v3 && v0 < v1.ax * 0xB69C63D5 + v4 && v2 < v1.al * 0x7A63FB7A + v3) {
                return v5;
            }

            v3 += v1.ap * 0xDF01D95D + v1.al * -250202335;
            ++v8;
            if(v8 >= v1.ar * v7) {
                v3 = v1.aq * 0x57DE2C4C + 23;
                v4 += v1.ax * -2009623674 + v1.an * 0xE0FCCBEB;
                v8 = 0;
            }

            ++v5;
        }

        return -1;
    }

    static int ep() {
        int v0 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 1049426107;
        ib v1 = ds.bp(0x5B0572AF);
        int v3 = v1.aq * 0x2F702F6F + 23;
        int v4 = v1.aj * 0xE5CF8E6C + hq.ab * 0x4D586FC3;
        int v7 = 0x9BA2F453;
        int v5 = hq.ev * 0xE513D117 * (v1.ar * v7);
        int v8 = 0;
        while(v5 < ih.ap * 1095412616) {
            if(v0 >= v4 && v2 >= v3 && v0 < v1.ax * -204538603 + v4 && v2 < v1.al * -250202335 + v3) {
                return v5;
            }

            v3 += v1.ap * 1368610770 + v1.al * 0x702AC476;
            ++v8;
            if(v8 >= v1.ar * v7) {
                v3 = v1.aq * 0x5BEF152D + 23;
                v4 += v1.ax * 0x2F0453E + v1.an * -1851020165;
                v8 = 0;
            }

            ++v5;
        }

        return -1;
    }

    static ar eq() {
        ar v0 = client.al.aba(0x1F4BDEC1).az(3, 0x3310F9D5);
        v0.ao(hq.cg, -2074356155);
        return v0;
    }

    static ar er() {
        ar v0 = client.al.aba(0x1B9CB37C).az(3, 0x3310F9D5);
        v0.ao(hq.cg, 0x8C283220);
        return v0;
    }

    static void es(od arg24, od arg25, fa arg26) {
        int v23;
        int v22;
        int v12;
        ih v15_2;
        int v20;
        String v13_1;
        int v0_1;
        od v7 = arg25;
        fa v15 = arg26;
        int v14 = hq.fz.ae * 0x249E9B9;
        int v13 = hq.fz.ar * 0x30589FE1;
        if(aw.er == null) {
            aw.er = ht.ab(eo.dh, "sl_back", "", 5000);
        }

        int v1 = 0x6E0C0A57;
        if(nc.eq == null) {
            nc.eq = dl.ad(eo.dh, "sl_flags", "", v1);
        }

        if(fy.ej == null) {
            fy.ej = dl.ad(eo.dh, "sl_arrows", "", v1);
        }

        if(gy.em == null) {
            gy.em = dl.ad(eo.dh, "sl_stars", "", v1);
        }

        if(bl.en == null) {
            bl.en = aa.aq(eo.dh, "leftarrow", "", -54);
        }

        if(ci.el == null) {
            ci.el = aa.aq(eo.dh, "rightarrow", "", -30);
        }

        arg26.ar(0x2897E022 * hq.ab, 23, 0x890A0013, 1568984230, 0, 2);
        int v16 = 0x4D586FC3;
        arg26.fd(hq.ab * v16, 0, -659807706, 23, 0x630C47A2, 0x8B6608, 0x9E27F1D8);
        arg26.fd(hq.ab * v16 + 0x7D, 0, 640, 23, 0x4F4F4F, 0x292929, 750231925);
        fa v10 = v15;
        int v8 = v14;
        int v9 = v13;
        arg24.ai(gs.nz, 0xB41A2206 + hq.ab * 0x914825C7, 15, 0, -1, arg26);
        if(gy.em != null) {
            v10.ag(gy.em[1], hq.ab * -2042030517 - 1698850105, 1, 1);
            arg25.aq(gs.np, hq.ab * v16 + 0x7C0F8F78, 10, 0xC5DC61D9, -1, arg26);
            v10.ag(gy.em[0], hq.ab * 0xF490012D + 910923473, 12, 1);
            arg25.aq(gs.nt, hq.ab * v16 + 0x98, 21, 0xFFFFFF, -1, arg26);
        }

        v13 = 3;
        v14 = 4;
        byte v15_1 = 2;
        if(fy.ej != null) {
            ef v0 = ih.aq[0] != 0 || ih.ad[0] != 1 ? fy.ej[0] : fy.ej[v15_1];
            ef v6 = v0;
            v0 = ih.aq[0] != 0 || 1 != ih.ad[0] ? fy.ej[1] : fy.ej[v13];
            ef v5 = v0;
            v0_1 = hq.ab * v16 + 280;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg24.aq(gs.nx, v0_1 + 0x20, 17, 0xEE689FF5, -1, arg26);
            v1 = hq.ab * v16 - 0x40F086B1;
            v10.ag(v6, v1, v14, 1);
            v10.ag(v5, v1 + 15, v14, 1);
            arg24.aq(gs.nk, v1 + 0x20, 17, 0x4090B0C2, -1, arg26);
            v0_1 = hq.ab * v16 - 1164650892;
            v10.ag(v6, v0_1, v14, 1);
            v10.ag(v5, v0_1 + 15, v14, 1);
            arg24.aq(gs.nv, v0_1 + 0x20, 17, 0xD061FB32, -1, arg26);
            v1 = hq.ab * 0xEE0660AA + 610;
            v10.ag(v6, v1, v14, 1);
            v10.ag(v5, v1 + 15, v14, 1);
            arg24.aq(gs.nn, v1 - 0x5C5BEC67, 17, 0xFFFFFF, -1, arg26);
        }

        arg26.ar(hq.ab * 0x21AFCDD5 + 708, 4, 982096484, 16, 0, 2);
        byte v11 = 25;
        arg25.ai(gs.lb, hq.ab * v16 + 1016826605, 16, -100078661, -1, arg26);
        hq.ew = 0x908F00BE;
        if(aw.er != null) {
            ce.eu = ds.bp(1536308817);
            v13 = 0xDFEB996D;
            hq.eg = ((ce.eu.ar * 355832290 + ih.ap * 0x6DE6A9AD - 1) / (ce.eu.ar * 1588605400) - ce.eu.ae * v13) * 0xBCE614AA;
            v16 = 0xE513D117;
            if(bl.en != null && hq.ev * v16 > 0) {
                v10.ag(bl.en, hq.ab * 0xF5664194 + ce.eu.aj * 0xB80AD405 - bl.en.ae - ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / v15_1 - bl.en.ar / v15_1, 1);
            }

            if(ci.el != null && hq.ev * v16 < hq.eg * 0x148FBA63) {
                v10.ag(ci.el, hq.ab * 0xF57A542D + ce.eu.ad * 0x2FD4ACF2 + ce.eu.an * 0xEB8ABBEE, bv.tt * 780190698 / v15_1 - ci.el.ar / v15_1, 1);
            }

            v1 = ce.eu.aq * 0xD7D9E470 + 23;
            v0_1 = hq.ab * 1523478058 + ce.eu.aj * 0x13D307A8;
            int v2 = hq.ev * v16;
            int v5_1 = v1;
            int v17 = v2;
            int v6_1 = ce.eu.ar * 104881009 * v2;
            int v18 = 0;
            int v4 = v0_1;
            v0_1 = 0;
            while(v6_1 < ih.ap * 122033646) {
                if(v17 - hq.ev * v16 >= ce.eu.ae * v13) {
                }
                else {
                    ih v3 = ew.an[v6_1];
                    String v1_1 = Integer.toString(v3.av * -1299502826);
                    if(v3.av * 0x21E0E25C == -1) {
                        v1_1 = gs.nf;
                        goto label_418;
                    }
                    else if(v3.av * 171001747 > 1980) {
                        v1_1 = gs.na;
                    label_418:
                        v13_1 = v1_1;
                        v1 = 0;
                    }
                    else {
                        v13_1 = v1_1;
                        v1 = 1;
                    }

                    if(v3.au(83)) {
                        v2 = v3.ab(907680406) ? 7 : 6;
                        goto label_440;
                    }
                    else if(v3.aa(v15_1)) {
                        v2 = v3.ab(0x4A009F3) ? 5 : 4;
                        v20 = 0xFF0000;
                    }
                    else {
                        if(v3.ai(0x7E)) {
                            if(v3.ab(0x6C16FCDF)) {
                                v2 = 3;
                                goto label_440;
                            }

                            v2 = 2;
                        }
                        else {
                            v2 = v3.ab(0xFF0F8CFF) ? 1 : 0;
                        }

                    label_440:
                        v20 = 0;
                    }

                    int v21 = -250202335;
                    if(v8 < v4 || v9 < v5_1 || v8 >= ce.eu.ax * -622705273 + v4 || v9 >= ce.eu.al * v21 + v5_1 || v1 == 0) {
                        v15_2 = v3;
                        v12 = v4;
                        v14 = v5_1;
                        v22 = v6_1;
                        v10.aa(aw.er[v2], v12, v14, v11);
                        v23 = v0_1;
                    }
                    else {
                        hq.ew = 0x7F9681FF * v6_1;
                        v15_2 = v3;
                        v12 = v4;
                        v14 = v5_1;
                        v22 = v6_1;
                        arg26.bd(aw.er[v2], v4, v5_1, 0x80, 0xAF060FA5, 0x368904BA);
                        v23 = 1;
                    }

                    if(nc.eq != null) {
                        ef[] v0_2 = nc.eq;
                        v1 = v15_2.ab(0x3E4E907B) ? 8 : 0;
                        v10.ag(v0_2[v1 + v15_2.am * 0x7B4E3F04], v12 + 29, v14, 1);
                    }

                    arg24.ai(Integer.toString(v15_2.af * 0xCA20B5F4), v12 + 15, ce.eu.al * v21 / 2 + v14 + 5, v20, -1, arg26);
                    v15_1 = 2;
                    arg25.ai(v13_1, v12 + 60, v14 + ce.eu.al * 0x6DF750C6 / v15_1 + 5, 0xFFFFFFF, -1, arg26);
                    v5_1 = v14 + (ce.eu.al * v21 + ce.eu.ap * 0xDF01D95D);
                    v0_1 = v18 + 1;
                    if(v0_1 >= ce.eu.ar * 0x9BA2F453) {
                        v0_1 = ce.eu.aq * 0x399617D7 + 23;
                        v4 = v12 + (ce.eu.ax * -204538603 + ce.eu.an * 0x75C55DF7);
                        ++v17;
                        v5_1 = v0_1;
                        v18 = 0;
                    }
                    else {
                        v18 = v0_1;
                        v4 = v12;
                    }

                    v6_1 = v22 + 1;
                    v0_1 = v23;
                    v13 = 0xDFEB996D;
                    continue;
                }

                break;
            }

            if(v0_1 == 0) {
                return;
            }

            v12 = v7.ar(ew.an[hq.ew * 0x39CEF448].au) + 6;
            v13 = v7.aj + 8;
            v0_1 = v9 + 25;
            if(v0_1 + v13 > -1704405800) {
                v0_1 = v9 - 25 - v13;
            }

            v1 = v8 - v12 / 2;
            arg26.ar(v1, v0_1, v12, v13, 0xFFFFA0, 2);
            arg26.fz(v1, v0_1, v12, v13, 0, -1365354034);
            arg25.ai(ew.an[hq.ew * 0xDE657DFF].au, v8, v7.aj + v0_1 + 4, 0, -1, arg26);
        }
    }

    static void et(jz arg13, fa arg14) {
        int v13 = hq.fz.ae * 0x249E9B9;
        int v0 = hq.fz.ar * 0xEE0C033F;
        boolean v1 = hq.fz.an;
        boolean v2 = hq.fz.aj;
        boolean v3 = hq.fz.aq;
        boolean v4 = hq.fz.ab;
        hq.fz.ae(21069);
        int v5 = 0xDA4D3441;
        if(v2) {
            dr.bv(arg14, v5);
            return;
        }

        int v2_1 = -1692502361;
        int v6 = 0xE513D117;
        if((v3) && hq.ev * v6 > 0 && bl.en != null) {
            hq.ev -= v2_1;
        }

        if((v4) && hq.ev * 0xB4B18770 < hq.eg * 1447801927 && ci.el != null) {
            hq.ev += 0x8A33C7FC;
        }

        if(v1) {
            int v3_1 = hq.ab * -109176546 + 280;
            int v4_1 = 18;
            int v7 = 4;
            if(v13 >= v3_1 && v13 <= v3_1 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(0, 0, 1551209905);
                return;
            }

            if(v13 >= v3_1 + 15 && v13 <= v3_1 + 0x489B7A51 && v0 >= v7 && v0 <= v4_1) {
                dk.al(0, 1, 1848103081);
                return;
            }

            int v8 = 0x4D586FC3;
            v3_1 = hq.ab * v8 + 390;
            if(v13 >= v3_1 && v13 <= v3_1 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(1, 0, 0xEF55E6D9);
                return;
            }

            if(v13 >= v3_1 + 15 && v13 <= v3_1 + 80 && v0 >= v7 && v0 <= v4_1) {
                dk.al(1, 1, 0xEF8D6C54);
                return;
            }

            v3_1 = hq.ab * v8 + 500;
            int v10 = 2;
            if(v13 >= v3_1 && v13 <= v3_1 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v10, 0, 152871709);
                return;
            }

            if(v13 >= v3_1 + 15 && v13 <= v3_1 + 229406547 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v10, 1, 0xE2AA7079);
                return;
            }

            v3_1 = hq.ab * v8 - 0x75D27AD4;
            int v11 = 3;
            if(v13 >= v3_1 && v13 <= v3_1 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v11, 0, 412049007);
                return;
            }

            if(v13 >= v3_1 + 15 && v13 <= v3_1 + 80 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v11, 1, 0x1C560001);
                return;
            }

            if(v13 >= hq.ab * 1800121155 + 708 && v0 >= v7 && v13 <= hq.ab * v8 + 0xB5A900E && v0 <= 20) {
                dr.bv(arg14, v5);
                return;
            }

            if(hq.ew * 0xDE657DFF != -1 && hq.ew * 0xB8D90ACE == gy.bw(1506615946)) {
                dm.by(ew.an[hq.ew * 0xB9F9D4CD], 0x3AFA4B64);
                dr.bv(arg14, v5);
                return;
            }

            if(ce.eu == null) {
                return;
            }

            int v1_1 = 742742805;
            if(hq.ev * v6 > 0 && bl.en != null && v13 >= 0 && v13 <= hq.ab * v8 + ce.eu.aj * 1716006870 - ce.eu.an * 0xEB8ABBEE && v0 >= bv.tt * v1_1 / v10 + 1553917025 && v0 <= bv.tt * 0xDF8D07C4 / v10 - 0x1BEBF479) {
                hq.ev -= v2_1;
            }

            if(hq.ev * v6 >= hq.eg * 0x7AA004B1) {
                return;
            }

            if(ci.el == null) {
                return;
            }

            if(v13 < ce.eu.an * 0xEED14BB5 + (dq.tv * -783381005 - hq.ab * 0xC0D0F643 - ce.eu.aj * 1940499895)) {
                return;
            }

            if(v13 > dq.tv * 0xD9CC4AFD) {
                return;
            }

            if(v0 < bv.tt * v1_1 / v10 - 100) {
                return;
            }

            if(v0 > bv.tt * 0xBD73377 / v10 - 0x6D08EC2D) {
                return;
            }

            hq.ev += v2_1;
        }
    }

    static void eu(String arg0, String arg1, String arg2) {
        hq.cu = arg0;
        hq.cq = arg1;
        hq.cv = arg2;
    }

    static void ev(od arg25, od arg26, od arg27, boolean arg28, fa arg29) {
        String v0_4;
        int v12_2;
        ef v1_3;
        int v1_1;
        float v7_1;
        float v5_1;
        int v11;
        String v19_1;
        int v4_1;
        int v2;
        byte v12_1;
        int v6;
        String v21_1;
        int v3;
        byte v10_1;
        int v21;
        int v7;
        int v0;
        od v12 = arg25;
        od v13 = arg26;
        fa v14 = arg29;
        v14.al(38);
        int v15 = 2;
        hq.ab = (dq.tv * 0xD9CC4AFD - 0x2FD) / v15 * 0x8DFA78EB;
        hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
        bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
        if(hq.ea) {
            gn.bn(v12, v13, v14, 0x27082B5B);
            return;
        }

        long v16 = ji.ax(0x2076E2C1);
        if(-1 == hq.fl * -611935993406195833L) {
            hq.fh = (v16 + 300) * 0x7F9153A5B5120AE9L;
            hq.fl = hq.fh * 0x3E24E342FD076C1FL - 0xD397F4858CD2F18L;
        }

        if(v16 < hq.fh * -4462661976294855335L) {
            return;
        }

        int v18 = 0xD700E425;
        if(v16 < hq.fl * -611935993406195833L) {
            v0 = ((int)((((float)(v14.al * -107049639 / v15))) * hq.fy.ax(1f - (((float)(hq.fl * -611935993406195833L - v16))) / 600f, 0)));
            arg29.ef(bi.bt * v18 - v0, 0, bi.bt * v18 + v0, 503, 0x1AD9DC08);
        }

        gx.bq(v14, -1832300468);
        int v10 = 5;
        int v9 = 20;
        int v19 = 0x1A8B6787;
        int v20 = 287427031;
        if(client.ac * 0x498EF1C3 == 0 || client.ac * 0x498EF1C3 == v10) {
            arg25.ai(gs.iv, hq.by * v20 + 180, hq.bp * v19 + 54, 0xFFFFFF, -1, arg29);
            v7 = hq.bp * v19 + 62;
            arg29.fz(hq.by * v20 + 28, v7, 304, 34, 9179409, 0xFFC0011C);
            arg29.fz(hq.by * v20 + 29, v7 + 1, 302, 0x20, 0, -1000130085);
            v7 += v15;
            arg29.ar(hq.by * v20 + 30, v7, hq.bv * 0xE7509707, 30, 9179409, 2);
            arg29.ar(hq.by * v20 + 30 + hq.bv * 0xE7509707, v7, 300 - hq.bv * 0xE7509707, 30, 0, 2);
            if(client.al.abd(0x5F02F5F5) == 3) {
                hq.bq = "Initialising game";
            }

            arg25.ai(hq.bq, hq.by * v20 + 180, hq.bp * v19 + 100 + v10 - 20, 0xFFFFFF, -1, arg29);
        }

        v7 = 15;
        int v8 = 0xF7EE5BF5;
        if(v9 == client.ac * 0x498EF1C3 || hq.cm * v8 == v9) {
            v14.ag(hq.af, hq.by * v20 + 180 - hq.af.ae / v15, hq.bp * v19 + 100 - hq.af.ar / v15, 1);
            v21 = hq.bp * v19 + 30;
            v10_1 = 1;
            arg25.ai(hq.cu, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg29);
            v21 += 15;
            arg25.ai(hq.cq, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg29);
            v21 += 15;
            arg25.ai(hq.cv, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg29);
            v21 += 22;
            if(hq.cm * v8 != 4 && hq.cm * v8 != 0 && hq.cm * v8 != 10 && hq.cm * v8 != v9 && 18 != hq.cm * v8 && 16 != hq.cm * v8 && hq.cm * v8 != 1) {
                arg25.aq(gs.lf, hq.by * v20 + 70, v21, 0xFFFFFF, 0, arg29);
                v0 = 200;
                String v1;
                for(v1 = en.an(0x7C0DD9F0); v12.ar(v1) > v0; v1 = v1.substring(0, v1.length() - 1)) {
                }

                arg25.aq(od.ad(v1), hq.by * v20 + 110, v21, 0xFFFFFF, 0, arg29);
                arg25.aq(gs.lg + ff.az(hq.co, 0xC52642B0), hq.by * v20 + 72, v21 + 15, 0xFFFFFF, 0, arg29);
            }

            if(v9 != hq.cm * v8) {
                goto label_343;
            }

            he.bm(hq.co, client.al.au, -86);
        }
        else {
            v10_1 = 1;
        }

    label_343:
        if(10 == client.ac * 0x498EF1C3 || 11 == client.ac * 0x498EF1C3) {
            v14.ag(hq.af, hq.by * v20, hq.bp * v19, v10_1);
            if(hq.cm * v8 == 0) {
                v3 = hq.bp * v19 + 80;
                v7 = hq.by * v20 + 180;
                ah v0_2 = client.al.aba(0x44B6F7A8).bh(0x513C8BF3);
                if(v0_2 != null) {
                    if(!v0_2.hf(-7) && !v0_2.ad(0x7269B3F3)) {
                        goto label_476;
                    }

                    v1 = "";
                    if(v0_2.hf(-20)) {
                        v21_1 = gs.lj;
                        v8 = 1;
                    }
                    else if(v0_2.ad(0x607D407A)) {
                        v21_1 = gs.ln;
                        v8 = 2;
                    }
                    else {
                        v21_1 = v1;
                        v8 = 0;
                    }

                    arg25.ai(gs.lt, hq.by * v20 + 180, hq.bp * v19 + 44, 0xFFFF00, 0, arg29);
                    v6 = hq.bp * v19 + 58;
                    int v5 = v7 - hq.au.ae / v15;
                    v14.ag(hq.au, v5, v6, v10_1);
                    v14.ag(eh.am[v8], v5 + 4, v6 + 4, v10_1);
                    v8 = eh.am[v8].ae / v15 + bi.bt * v18 + 3;
                    arg25.ai(v21_1, v8, v6 + 26, 0xFFFFFF, 0, arg29);
                    v6 += hq.au.ar + 6;
                    v14.ag(hq.au, v7 - hq.au.ae / v15, v6, v10_1);
                    v14.ag(eh.am[0], v5 + 5, v6 + 4, v10_1);
                    arg25.ai(gs.lv, v8, v6 + 26, 0xFFFFFF, 0, arg29);
                    v12_1 = 0;
                }
                else {
                label_476:
                    arg25.ai(gs.lt, hq.by * v20 + 180, v3, 0xFFFF00, 0, arg29);
                    v2 = v7 - 0x99;
                    v8 = hq.bp * v19 + 100 + v9 - 20;
                    v14.ag(in.ai, v2, v8, v10_1);
                    v12_1 = 0;
                    arg25.av(gs.li, v2, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
                    v2 = hq.by * v20 + 0xBB;
                    v14.ag(in.ai, v2, v8, 1);
                    arg25.av(gs.lx, v2, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
                }

                if(client.al.abd(0x7E124B82) == 3) {
                    goto label_354;
                }

                v8 = hq.bp * v19 + 0xAE;
                if(hq.fe * 0x61810D62574D4ADL == -1) {
                    goto label_354;
                }

                if(v16 < hq.fe * 0x61810D62574D4ADL) {
                    goto label_354;
                }

                if(hq.fd * -8957420507059323547L != -1 && v16 >= hq.fd * -8957420507059323547L + 5000) {
                    goto label_354;
                }

                iz v0_3 = dc.bf(-1817015836);
                v1 = "All game data synchronised";
                v2 = v13.ar(v1);
                v9 = hq.by * v20 + 30;
                if(v0_3 != null) {
                    v0 = cx.ba(14);
                    StringBuilder v4 = new StringBuilder();
                    v4.append("Synchronising game data - ");
                    v4.append("99.11%");
                    v4_1 = v13.ar(v4.toString());
                    v19_1 = "Synchronising game data - " + hq.eb.format(((double)((((float)v0)) / 100f))) + "%";
                    v11 = v0 * 300 / 10000;
                    v21 = v4_1;
                    v10 = 0x31C3E7;
                }
                else {
                    v19_1 = v1;
                    v21 = v2;
                    v10 = 9226041;
                    v11 = 300;
                }

                v6 = 304;
                if(-1 != hq.fd * -8957420507059323547L && v16 > hq.fd * -8957420507059323547L + 4700) {
                    v5_1 = 1f - (((float)(v16 - hq.fd * -8957420507059323547L - 4700))) / 300f;
                    goto label_646;
                }
                else if(v16 < hq.fe * 0x61810D62574D4ADL + 300) {
                    v5_1 = (((float)(v16 - hq.fe * 0x61810D62574D4ADL))) / 300f;
                label_646:
                    v7_1 = v5_1;
                }
                else {
                    v7_1 = 1f;
                }

                v14.et(hq.fi, 0x3041FEF6);
                if(v7_1 != 1f) {
                    v0 = ((int)(hq.eh.ax(v7_1, v12_1) * 304f));
                    v1_1 = hq.by * v20 + 180 - v0 / 2;
                    v2 = v8 - 14;
                    arg29.ef(v1_1, v2, v0 + v1_1, v2 + 20, 0x8A44EBE2);
                }

                int v23 = ((int)(128f * v7_1));
                arg29.fy(v9 - 2, v8 - 14, v6, 20, v10, v23, 0x89F16204);
                arg29.ae(v9, v8 - 12, v11, 16, v10, v23, 0x3F42B810);
                arg26.ab(v19_1, hq.by * v20 + 180 - v21 / 2, v8, 0xFFFFFF, 0, ((int)(v7_1 * 255f)), arg29);
                v14.fa(hq.fi, -989494300);
                goto label_354;
            }
            else {
                if(1 == hq.cm * v8) {
                    arg25.ai(hq.ct, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg29);
                    v8 = hq.bp * v19 + 65;
                    arg25.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg29);
                    arg25.ai(hq.cv, hq.by * v20 + 180, v8 + 15, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 100;
                    v0 = hq.bp * v19 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.aj, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                v11 = 5;
                if(2 == hq.cm * v8) {
                    v8 = hq.bp * v19 + 30;
                    arg25.ai(hq.cu, bi.bt * v18, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cq, bi.bt * v18, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cv, bi.bt * v18, v8, 0xFFFF00, 0, arg29);
                    v8 = v8 + v7 + 7;
                    arg25.aq(gs.lf, bi.bt * v18 - 110, v8, 0xFFFFFF, 0, arg29);
                    v0 = 200;
                    v1 = en.an(0x1A562226);
                    v12 = arg25;
                    while(v12.ar(v1) > v0) {
                        v1 = v1.substring(1);
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1_1 = hq.dq * 0xF4A0196B == 0 ? 1 : 0;
                    v9 = 20;
                    v2 = client.bj * -2077001153 % 40 < v9 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, 0xA5F18238) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), bi.bt * v18 - 70, v8, 0xFFFFFF, 0, arg29);
                    v3 = v8 + 15;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lg);
                    v0_1.append(ff.az(hq.co, 0xC52642B0));
                    v1_1 = 1 == hq.dq * 0xF4A0196B ? 1 : 0;
                    v2 = client.bj * -2077001153 % 40 < v9 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, 1854642300) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), bi.bt * v18 - 108, v3, 0xFFFFFF, 0, arg29);
                    v7 = hq.bp * v19 + 106;
                    v0 = bi.bt * v18 - 0x75;
                    v1_3 = fl.ar(client.er, hq.de, 745309594);
                    v14.ag(v1_3, v0, v7, 1);
                    v8 = v7 + 13;
                    arg26.aq(gs.lq, v0 + (v1_3.ae + v11), v8, 0xFFFF00, 0, arg29);
                    v0 = bi.bt * v18 + 24;
                    v1_3 = fl.ar(li.rg.aj, hq.dk, -100432871);
                    v14.ag(v1_3, v0, v7, 1);
                    arg26.aq(gs.lo, v0 + (v1_3.ae + v11), v8, 0xFFFF00, 0, arg29);
                    v2 = bi.bt * v18 - 80;
                    v0 = hq.bp * v19 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.lc, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = bi.bt * v18 + 80;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg29);
                    v3 = hq.bp * v19 + 0xBA;
                    dl.cn = hq.cz * 0x2D49CD0F != 2 ? gs.mu : gs.mm;
                    em.cl = new or(bi.bt * v18, v3, v13.ar(dl.cn), 11);
                    dq.ck = new or(bi.bt * v18, v3, v13.ar(gs.mk), 11);
                    arg26.ai(dl.cn, bi.bt * v18, v3, 0xFFFFFF, 0, arg29);
                    if(client.al.abd(0x5AD21835) != 3 && client.al.abd(1690590507) != 2) {
                        goto label_354;
                    }

                    v0 = hq.bp * v19 + 210;
                    v1_1 = bi.bt * v18 - hq.au.ae / 2;
                    v14.ag(hq.au, v1_1, v0, 1);
                    v14.ag(eh.am[0], v1_1 + v11, v0 + 4, 1);
                    arg25.ai(gs.le, bi.bt * v18 + eh.am[1].ae / 2 + 3, v0 + 26, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                v9 = 20;
                v12 = arg25;
                if(3 == hq.cm * v8) {
                    v8 = hq.bp * v19 + 30;
                    arg25.ai(gs.ll, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v9;
                    arg26.ai(gs.la, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    arg26.ai(gs.lu, hq.by * v20 + 180, v8 + 15, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 100 + v11;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg27.ai(gs.lw, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 0x9B;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg27.ai(gs.ls, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(4 == hq.cm * v8) {
                    arg25.ai(gs.jj, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg29);
                    v8 = hq.bp * v19 + 65;
                    arg25.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cv, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg29);
                    v8 += v7;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lk);
                    v0_1.append(ff.az(da.ds, 0xC52642B0));
                    v1 = client.bj * -2077001153 % 40 < v9 ? im.al(0xFFFF00, 0x26D363A6) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), hq.by * v20 + 72, v8, 0xFFFFFF, 0, arg29);
                    v8 += -8;
                    arg25.aq(gs.ab, hq.by * v20 + 0xAB, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg25.aq(gs.af, hq.by * v20 + 0xAB, v8, 0xFFFF00, 0, arg29);
                    v0 = hq.by * v20 + 0xAB + v12.ar(gs.af) + v7;
                    v8 -= v12.aj;
                    v1_3 = hq.dy ? oa.as : bz.aw;
                    v14.ag(v1_3, v0, v8, 1);
                    v2 = hq.by * v20 + 100;
                    v7 = hq.bp * v19 + 150;
                    v8 = v7 - 20;
                    v14.ag(in.ai, v2 - 73, v8, 1);
                    v19 = v7 + 5;
                    arg25.ai(gs.aj, v2, v19, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v8, 1);
                    arg25.ai(gs.lb, v2, v19, 0xFFFFFF, 0, arg29);
                    arg26.ai(gs.jw, hq.by * v20 + 180, v7 + 36, 0xFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == v11) {
                    arg25.ai(gs.ld, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg29);
                    v8 = hq.bp * v19 + 50;
                    arg27.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg27.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg27.ai(hq.cv, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v7 = v8 + v7 + 14;
                    arg25.aq(gs.my, hq.by * v20 + 35, v7, 0xFFFFFF, 0, arg29);
                    v0 = 0xAE;
                    for(v1 = en.an(0x77005382); v12.ar(v1) > v0; v1 = v1.substring(1)) {
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1 = client.bj * -2077001153 % 40 < v9 ? im.al(0xFFFF00, 0xCF61688F) + jc.ae : "";
                    v0_1.append(v1);
                    arg25.aq(v0_1.toString(), hq.by * v20 + 0x92, v7, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 100;
                    v0 = hq.bp * v19 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.me, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg29);
                    arg26.ai(gs.mk, bi.bt * v18, hq.bp * v19 + 0xB9, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 6) {
                    v8 = hq.bp * v19 + 30;
                    arg25.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg25.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    arg25.ai(hq.cv, hq.by * v20 + 180, v8 + 15, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 150;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.mh, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 7) {
                    v8 = hq.bp * v19 + 45;
                    arg25.ai(gs.nj, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg27.ai(gs.nu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    arg27.ai(gs.nm, hq.by * v20 + 180, v8 + 15, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 100;
                    v0 = hq.bp * v19 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.nh, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 8) {
                    v8 = hq.bp * v19 + 45;
                    arg25.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg27.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    arg27.ai(hq.cv, hq.by * v20 + 180, v8 + 15, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 100;
                    v0 = hq.bp * v19 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.fo, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(9 == hq.cm * v8) {
                    v7 = hq.bp * v19 + 50;
                    arg25.ai(hq.cu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                    v7 += 25;
                    arg25.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                    arg25.ai(hq.cv, hq.by * v20 + 180, v7 + 25, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 140;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.lw, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(10 == hq.cm * v8) {
                    v8 = hq.by * v20 + 180;
                    v21 = hq.bp * v19 + 38;
                    arg25.ai(gs.lt, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg29);
                    v0 = v21 + 20;
                    v14.ag(hq.av, v8 - 109, v0, 1);
                    if(je.ap(hq.dv, 0x2E33B013).isEmpty()) {
                        v14.ag(li.aa, v8 - 0x30, v0 + 18, 1);
                    }
                    else {
                        v14.ag(li.aa, v8 - 0x30, v0 + 5, 1);
                        arg25.ai(hq.dv, v8, v0 + 53, 0xFFFF00, 0, arg29);
                    }

                    v0 = hq.bp * v19 + 140;
                    v14.ag(in.ai, v8 - 73, v0, 1);
                    arg25.ai("Sign out", v8, v0 + 25, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(11 == hq.cm * v8) {
                    arg25.ai("Are you sure you want to sign out?", hq.by * v20 + 180, hq.bp * v19 + 80, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 100;
                    v0 = hq.bp * v19 + 100 + v9;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai("Yes", v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai("No", v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 12) {
                    v7 = bi.bt * v18;
                    v8 = hq.bp * v19 + 45;
                    arg27.ai(gs.ny, v7, v8, 0xFFFFFF, 0, arg29);
                    v8 += 17;
                    arg27.ai(gs.os, v7, v8, 0xFFFFFF, 0, arg29);
                    v8 += 17;
                    arg27.ai(gs.oa, v7, v8, 0xFFFFFF, 0, arg29);
                    arg27.ai(gs.of, v7, v8 + 17, 0xFFFFFF, 0, arg29);
                    v2 = bi.bt * v18 - 80;
                    v0 = hq.bp * v19 + 140;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg25.ai(gs.oy, v2, v8, 0xFFFFFF, 0, arg29);
                    v2 = bi.bt * v18 + 80;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg25.ai(gs.om, v2, v8, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 13) {
                    v7 = hq.bp * v19 + 60;
                    arg27.ai(gs.ob, hq.by * v20 + 180, v7, 0xFFFFFF, 0, arg29);
                    arg27.ai(gs.op, hq.by * v20 + 180, v7 + 20, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 140;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.mh, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(hq.cm * v8 == 14) {
                    v8 = hq.bp * v19 + 30;
                    switch(hq.ch * 0x803A91D9) {
                        case 0: {
                            ax.bf(gs.cj, gs.cd, gs.cf, 0x63D3C206);
                            break;
                        }
                        case 1: {
                            ax.bf(gs.dl, gs.dr, gs.dn, 0x63D3C206);
                            break;
                        }
                        default: {
                            ht.ah(false, 0x25864314);
                            break;
                        }
                    }

                    arg25.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    v8 += v7;
                    arg27.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg29);
                    arg27.ai(hq.cv, hq.by * v20 + 180, v8 + 15, 0xFFFF00, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 100 + v11;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.bx, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    v2 = hq.by * v20 + 180;
                    v0 = hq.bp * v19 + 0x9B;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg25.ai(gs.mh, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                    goto label_354;
                }

                if(16 != hq.cm * v8) {
                    if(hq.cm * v8 == 19) {
                    }
                    else {
                        if(hq.cm * v8 != 17) {
                            if(hq.cm * v8 == 18) {
                            }
                            else {
                                if(hq.cm * v8 != v7) {
                                    if(23 == hq.cm * v8) {
                                    }
                                    else if(21 == hq.cm * v8) {
                                        v7 = bi.bt * v18;
                                        v8 = hq.bp * v19 + 45;
                                        arg27.ai(gs.oe, v7, v8, 0xFFFFFF, 0, arg29);
                                        v8 += 17;
                                        arg27.ai(gs.od, v7, v8, 0xFFFFFF, 0, arg29);
                                        v8 += 17;
                                        arg27.ai(gs.ox, v7, v8, 0xFFFFFF, 0, arg29);
                                        arg27.ai(gs.oq, v7, v8 + 17, 0xFFFFFF, 0, arg29);
                                        v2 = bi.bt * v18 - 80;
                                        v0 = hq.bp * v19 + 140;
                                        v7 = v0 - 20;
                                        v14.ag(in.ai, v2 - 73, v7, 1);
                                        v8 = v0 + 5;
                                        arg25.ai(gs.oy, v2, v8, 0xFFFFFF, 0, arg29);
                                        v2 = bi.bt * v18 + 80;
                                        v14.ag(in.ai, v2 - 73, v7, 1);
                                        arg25.ai(gs.lb, v2, v8, 0xFFFFFF, 0, arg29);
                                        goto label_354;
                                    }
                                    else {
                                        if(22 == hq.cm * v8) {
                                            v7 = hq.bp * v19 + 50;
                                            arg25.ai(hq.cu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            v7 += 25;
                                            arg27.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            arg27.ai(hq.cv, hq.by * v20 + 180, v7 + 25, 0xFFFF00, 0, arg29);
                                            v2 = hq.by * v20 + 180;
                                            v0 = hq.bp * v19 + 130;
                                            v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                                            arg25.ai(gs.gu, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                                        }
                                        else if(24 == hq.cm * v8) {
                                            v7 = hq.bp * v19 + 50;
                                            arg25.ai(hq.cu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            v7 += 25;
                                            arg27.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                            arg27.ai(hq.cv, hq.by * v20 + 180, v7 + 25, 0xFFFF00, 0, arg29);
                                            v2 = hq.by * v20 + 180;
                                            v0 = hq.bp * v19 + 140;
                                            v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                                            arg25.ai(gs.an, v2, v0 + 5, 0xFFFFFF, 0, arg29);
                                        }
                                        else {
                                        }

                                        goto label_354;
                                    }
                                }

                                v7 = hq.bp * v19 + 50;
                                arg25.ai(hq.cu, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                v7 += 25;
                                arg25.ai(hq.cq, hq.by * v20 + 180, v7, 0xFFFF00, 0, arg29);
                                arg25.ai(hq.cv, hq.by * v20 + 180, v7 + 25, 0xFFFF00, 0, arg29);
                                goto label_354;
                            }
                        }

                        v8 = hq.bp * v19 + 30;
                        arg25.ai(hq.cu, bi.bt * v18, v8, 0xFFFF00, 0, arg29);
                        v8 += v7;
                        arg25.ai(hq.cq, bi.bt * v18, v8, 0xFFFF00, 0, arg29);
                        arg25.ai(hq.cv, bi.bt * v18, v8 + 15, 0xFFFF00, 0, arg29);
                    label_354:
                        v12_2 = 5;
                        goto label_2450;
                    }
                }

                v21 = hq.bp * v19 + 30;
                arg25.ai(hq.cu, bi.bt * v18, v21, 0xFFFF00, 0, arg29);
                v21 += 15;
                arg25.ai(hq.cq, bi.bt * v18, v21, 0xFFFF00, 0, arg29);
                arg25.ai(hq.cv, bi.bt * v18, v21 + 15, 0xFFFF00, 0, arg29);
                v0_4 = hq.cm * v8 == 16 ? gs.kw : gs.kg;
                v4_1 = hq.by * v20 + 27;
                v8 = hq.bp * v19 + 100 + v9 - 20;
                v14.ag(in.ai, v4_1, v8, 1);
                v12_2 = 5;
                arg25.av(v0_4, v4_1, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
                v2 = hq.by * v20 + 0xBB;
                v14.ag(in.ai, v2, v8, 1);
                arg25.av(gs.kq, v2, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg29);
            }
        }
        else {
            goto label_354;
        }

    label_2450:
        if(v16 >= hq.fl * -611935993406195833L) {
            cl.ac.ae(hq.ab * 0x4D586FC3 - 22, client.bj * -2077001153, v14, -110);
            cl.ac.ae(hq.ab * 0x4D586FC3 + 659, client.bj * -2077001153, v14, -104);
        }

        ef[] v0_5 = ax.ay;
        v1_1 = li.rg.ar ? 1 : 0;
        v14.ag(v0_5[v1_1], hq.ab * 0x4D586FC3 + 710, 0x1C0, 1);
        if(client.ac * 0x498EF1C3 > v12_2 && ly.ax == en.af) {
            if(dy.ey != null) {
                v0 = hq.ab * 0x4D586FC3 + 20;
                v14.ag(dy.ey, v0, 0x1C0, 1);
                v1_2 = new StringBuilder();
                v1_2.append(gs.hc);
                v1_2.append(" ");
                v1_2.append(client.ae * 0x8076F529);
                v7 = v0 + 50;
                arg25.ai(v1_2.toString(), v7, 0x1CF, 0xFFFFFF, 0, arg29);
                if(li.ab != null) {
                    arg26.ai(gs.ne, v7, 477, 0xFFFFFF, 0, arg29);
                }
                else {
                    v0_4 = client.al.au ? gs.ni : gs.ns;
                    v1 = v0_4;
                    arg26.ai(v1, v7, 477, 0xFFFFFF, 0, arg29);
                }
            }
            else {
                dy.ey = aa.aq(eo.dh, "sl_button", "", -63);
            }

            v7 = 11;
            v8 = bi.bt * v18;
            arg26.ai(String.format(gs.nl, Integer.valueOf(Calendar.getInstance().get(1))), v8, 465, 0xFFFFFF, 0, arg29);
            v10 = 477;
            arg26.ai(gs.nw, v8, v10, 0xFFFFFF, 0, arg29);
            if(jl.fk != null && bl.fv != null && eh.fc != null) {
                return;
            }

            v8 -= v13.ar(gs.nw) / 2;
            v0 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nr))) + v8;
            v1_1 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nb))) + v8;
            v8 += v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.ng)));
            jl.fk = new or(v0, v10, v13.ar(gs.nr), v7);
            bl.fv = new or(v1_1, v10, v13.ar(gs.nb), v7);
            eh.fc = new or(v8, v10, v13.ar(gs.ng), v7);
        }
    }

    static void ew(od arg24, od arg25, od arg26, boolean arg27, fa arg28) {
        String v0_5;
        int v12_2;
        ef v1_3;
        float v7_1;
        float v5_1;
        int v11;
        String v18_1;
        int v4_1;
        int v2;
        int v1_1;
        byte v12_1;
        int v6;
        String v20_1;
        int v3;
        byte v10_1;
        int v20;
        int v7;
        int v0;
        od v12 = arg24;
        od v13 = arg25;
        fa v14 = arg28;
        v14.al(54);
        int v15 = 2;
        hq.ab = (dq.tv * 0xD9CC4AFD - 0x2FD) / v15 * 1301486075;
        hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
        bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
        if(hq.ea) {
            gn.bn(v12, v13, v14, 2104823400);
            return;
        }

        long v16 = ji.ax(0x2076E2C1);
        if(-1 == hq.fl * -611935993406195833L) {
            hq.fh = (v16 + 300) * 0x7F9153A5B5120AE9L;
            hq.fl = hq.fh * 0x3E24E342FD076C1FL - 0xD397F4858CD2F18L;
        }

        if(v16 < hq.fh * -4462661976294855335L) {
            return;
        }

        if(v16 < hq.fl * -611935993406195833L) {
            v0 = ((int)((((float)(v14.al * -107049639 / v15))) * hq.fy.ax(1f - (((float)(hq.fl * -611935993406195833L - v16))) / 600f, 0)));
            arg28.ef(bi.bt * 205662169 - v0, 0, bi.bt * 0x50EEB843 + v0, 0x56209482, -690493837);
        }

        gx.bq(v14, -503673204);
        int v10 = 5;
        int v18 = 0x1A8B6787;
        int v9 = 20;
        int v19 = 287427031;
        if(client.ac * 0x4487490B == 0 || client.ac * 0x25FB53BF == v10) {
            arg24.ai(gs.iv, hq.by * 0xBAD0C20E + 0x101A5C1C, hq.bp * v18 + 54, 0x9105D202, -1, arg28);
            v7 = hq.bp * v18 + 62;
            arg28.fz(hq.by * 0x64546484 + 28, v7, 0x52B70160, 1908750526, 9179409, 0xBD45D2D1);
            arg28.fz(hq.by * v19 + 29, v7 + 1, 302, 0x834FD72F, 0, 0xD1AB8157);
            v7 += v15;
            arg28.ar(hq.by * v19 + 30, v7, hq.bv * 0xE7509707, 30, 0xE04D7A3C, 2);
            arg28.ar(hq.by * 425089638 + 30 + hq.bv * 0xE7509707, v7, 0x70AF9070 - hq.bv * 0x546C07FC, 30, 0, 2);
            if(client.al.abd(0x6FD92CC1) == 3) {
                hq.bq = "Initialising game";
            }

            arg24.ai(hq.bq, hq.by * 1008860139 + 0xD1BA23, hq.bp * 1511186055 - 0x6A4E9BE4 + v10 - 20, 0x3562CF82, -1, arg28);
        }

        v7 = 0xF7EE5BF5;
        int v8 = 15;
        if(v9 == client.ac * 0x498EF1C3 || hq.cm * v7 == v9) {
            v14.ag(hq.af, hq.by * 0x4D350DC1 + 180 - hq.af.ae / v15, hq.bp * 0xC77F49C9 + 1996400760 - hq.af.ar / v15, 1);
            v20 = hq.bp * v18 + 730610853 + 0x6C0F09E;
            v10_1 = 1;
            arg24.ai(hq.cu, hq.by * 0x6A3DD53A + 180, v20, 0xFAB56DBE, 0, arg28);
            v20 += 15;
            arg24.ai(hq.cq, hq.by * v19 + 180, v20, 0xFFFF00, 0, arg28);
            v20 += 15;
            arg24.ai(hq.cv, hq.by * v19 - 0x28A02658, v20, 0xFFFF00, 0, arg28);
            v20 += 22;
            if(hq.cm * v7 != 4 && hq.cm * 0x5A1573DB != 0 && hq.cm * v7 != 10 && hq.cm * v7 != v9 && 18 != hq.cm * 0xDFEF18FF && 16 != hq.cm * v7 && hq.cm * 1142001019 != 1) {
                arg24.aq(gs.lf, hq.by * 0x5E0391DF + 70, v20, 0xFFFFFF, 0, arg28);
                v0 = 0x4842929A;
                String v1;
                for(v1 = en.an(0x1603E62F); v12.ar(v1) > v0; v1 = v1.substring(0, v1.length() - 1)) {
                }

                arg24.aq(od.ad(v1), hq.by * 0x5B8671A1 + 110, v20, 0xF8057FEC, 0, arg28);
                arg24.aq(gs.lg + ff.az(hq.co, 0xC52642B0), hq.by * v19 - 0x603DD4D3 - 0xA93E14F, v20 + 15, 0xFFFFFF, 0, arg28);
            }

            if(v9 != hq.cm * -2011331200) {
                goto label_371;
            }

            he.bm(hq.co, client.al.au, -46);
        }
        else {
            v10_1 = 1;
        }

    label_371:
        if(10 == client.ac * 0x498EF1C3 || 11 == client.ac * 0x498EF1C3) {
            v14.ag(hq.af, hq.by * v19, hq.bp * v18, v10_1);
            if(hq.cm * v7 == 0) {
                v3 = hq.bp * 0x240EB006 + 80;
                v7 = hq.by * v19 + 180;
                ah v0_2 = client.al.aba(-1870099484).bh(0x52F9B002);
                if(v0_2 != null) {
                    if(!v0_2.hf(-77) && !v0_2.ad(1360210889)) {
                        goto label_510;
                    }

                    v1 = "";
                    if(v0_2.hf(-66)) {
                        v20_1 = gs.lj;
                        v8 = 1;
                    }
                    else if(v0_2.ad(0x4554ED04)) {
                        v20_1 = gs.ln;
                        v8 = 2;
                    }
                    else {
                        v20_1 = v1;
                        v8 = 0;
                    }

                    arg24.ai(gs.lt, 0xDFBB123B + hq.by * v19, hq.bp * v18 + 0x7035F90A, 0xFFFF00, 0, arg28);
                    v6 = hq.bp * 0x36AA84CA + 0x7DF3E1B5 + 1200699090;
                    int v5 = v7 - hq.au.ae / v15;
                    v14.ag(hq.au, v5, v6, v10_1);
                    v14.ag(eh.am[v8], v5 + 4, v6 + 4, v10_1);
                    v8 = eh.am[v8].ae / v15 + bi.bt * 0x40D193D + 3;
                    arg24.ai(v20_1, v8, v6 + 26, 0xFFFFFF, 0, arg28);
                    v6 += hq.au.ar + 6;
                    v14.ag(hq.au, v7 - hq.au.ae / v15, v6, v10_1);
                    v14.ag(eh.am[0], v5 + 5, v6 + 4, v10_1);
                    arg24.ai(gs.lv, v8, v6 + 26, -389404002, 0, arg28);
                    v12_1 = 0;
                }
                else {
                label_510:
                    v7 += -80;
                    arg24.ai(gs.lt, hq.by * 0x7263F2A1 + 0x2D0D14B9, v3, 0xDA826C02, 0, arg28);
                    v8 = hq.bp * v18 + 100 + v9 - 20;
                    v14.ag(in.ai, v7 + 1286006694, v8, v10_1);
                    v12_1 = 0;
                    arg24.av(gs.li, v7 + 0x52C1B64C, v8, 0xB4A09D09, 0xD3F89933, 0xFFFFFF, 0, 1, 1, 0, arg28);
                    v1_1 = hq.by * -1400650311 + 0x726B775E;
                    v14.ag(in.ai, v1_1 - 1532844000, v8, 1);
                    arg24.av(gs.lx, v1_1 - 73, v8, 0xF4EFD06E, -103595692, 0xFFFFFF, 0, 1, 1, 0, arg28);
                }

                if(client.al.abd(2056635459) == 3) {
                    goto label_382;
                }

                v8 = hq.bp * v18 + 0xAE;
                if(hq.fe * 0x61810D62574D4ADL == -1) {
                    goto label_382;
                }

                if(v16 < hq.fe * 0x61810D62574D4ADL) {
                    goto label_382;
                }

                if(hq.fd * -8957420507059323547L != -1 && v16 >= hq.fd * -8957420507059323547L + 5000) {
                    goto label_382;
                }

                iz v0_3 = dc.bf(0x9F303B02);
                v1 = "All game data synchronised";
                v2 = v13.ar(v1);
                v9 = hq.by * 0x82379DC0 + 30;
                if(v0_3 != null) {
                    v0 = cx.ba(14);
                    StringBuilder v4 = new StringBuilder();
                    v4.append("Synchronising game data - ");
                    v4.append("99.11%");
                    v4_1 = v13.ar(v4.toString());
                    v18_1 = "Synchronising game data - " + hq.eb.format(((double)((((float)v0)) / 100f))) + "%";
                    v10 = v0 * 300 / 10000;
                    v20 = v4_1;
                    v11 = 0x210C9C15;
                }
                else {
                    v18_1 = v1;
                    v20 = v2;
                    v10 = 300;
                    v11 = 9226041;
                }

                v6 = 382617204;
                if(-1 != hq.fd * -8957420507059323547L && v16 > hq.fd * -8957420507059323547L + 4700) {
                    v5_1 = 1f - (((float)(v16 - hq.fd * -8957420507059323547L - 4700))) / 300f;
                    goto label_678;
                }
                else if(v16 < hq.fe * 0x61810D62574D4ADL + 300) {
                    v5_1 = (((float)(v16 - hq.fe * 0x61810D62574D4ADL))) / 300f;
                label_678:
                    v7_1 = v5_1;
                }
                else {
                    v7_1 = 1f;
                }

                v14.et(hq.fi, -897013588);
                if(v7_1 != 1f) {
                    v0 = ((int)(hq.eh.ax(v7_1, v12_1) * 304f));
                    v1_1 = hq.by * -600924369 - 0x5E5A61B7 - v0 / 2;
                    v2 = v8 - 14;
                    arg28.ef(v1_1, v2, v0 + v1_1, v2 + 20, 0x9FA32134);
                }

                int v22 = ((int)(128f * v7_1));
                arg28.fy(v9 - 2, v8 - 14, v6, 20, v11, v22, 0x89F16204);
                arg28.ae(v9, v8 - 12, v10, 16, v11, v22, 0x5BE960D8);
                arg25.ab(v18_1, hq.by * v19 + 180 - v20 / 2, v8, 0xB7A4102F, 0, ((int)(v7_1 * 255f)), arg28);
                v14.fa(hq.fi, -989494300);
                goto label_382;
            }
            else {
                if(1 == hq.cm * v7) {
                    arg24.ai(hq.ct, hq.by * v19 + 1960119640, hq.bp * v18 + 30, 0xFFFF00, 0, arg28);
                    v7 = hq.bp * -1159130760 + 100 + 0x4228E066;
                    arg24.ai(hq.cu, hq.by * v19 + 180, v7, 0x1362026F, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cq, hq.by * 1146839600 + 0x46B79D1B, v7, 0xCA0B0A6E, 0, arg28);
                    arg24.ai(hq.cv, hq.by * v19 + 180, v7 + 15, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * v19 + 180 + 0x64432731;
                    v0 = hq.bp * v18 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 0x1E9EE10D, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.aj, v2, v8, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * 1900264413 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.lb, v2, v8, 1220892000, 0, arg28);
                    goto label_382;
                }

                v11 = 5;
                v9 = 0xD700E425;
                if(2 == hq.cm * 760083527) {
                    v7 = hq.bp * v18 + 100 - 0x17A6632F;
                    arg24.ai(hq.cu, bi.bt * 0xD378AFEC, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cq, bi.bt * v9, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cv, 201702426 * bi.bt, v7, 0xFFFF00, 0, arg28);
                    v7 = v7 + v8 + 7;
                    arg24.aq(gs.lf, bi.bt * 0xCE36198D - 110, v7, -74668109, 0, arg28);
                    v0 = 0xDEA19F1D;
                    v1 = en.an(0x831717A0);
                    v12 = arg24;
                    while(v12.ar(v1) > v0) {
                        v1 = v1.substring(1);
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1_1 = hq.dq * 0xF4A0196B == 0 ? 1 : 0;
                    v2 = client.bj * 0xA1D40DA1 % 0x92BACF0B < 20 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, -162605214) + jc.ae : "";
                    v0_1.append(v1);
                    v10 = 20;
                    arg24.aq(v0_1.toString(), bi.bt * v9 - 70, v7, 0xFFFFFF, 0, arg28);
                    v3 = v7 + 15;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lg);
                    v0_1.append(ff.az(hq.co, 0xC52642B0));
                    v1_1 = 1 == hq.dq * 0xF4A0196B ? 1 : 0;
                    v2 = client.bj * -2077001153 % 40 < v10 ? 1 : 0;
                    v1 = (v1_1 & v2) != 0 ? im.al(0xFFFF00, 0x45FADC18) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), bi.bt * 862095048 - 108, v3, 0xFFFFFF, 0, arg28);
                    v7 = hq.bp * 0x5CB55F18 - 0x6D9A3239;
                    v0 = bi.bt * v9 - 0x75;
                    v1_3 = fl.ar(client.er, hq.de, 0x3E0D8F18);
                    v14.ag(v1_3, v0, v7, 1);
                    v8 = v7 + 13;
                    arg25.aq(gs.lq, v0 + (v1_3.ae + v11), v8, 0xFFFF00, 0, arg28);
                    v1_1 = bi.bt * -1012073836 + 24;
                    ef v0_4 = fl.ar(li.rg.aj, hq.dk, 0xE87ECF47);
                    v14.ag(v0_4, v1_1, v7, 1);
                    arg25.aq(gs.lo, v1_1 + (v0_4.ae + v11), v8, 0xFFFF00, 0, arg28);
                    v2 = bi.bt * v9 + 0x770E8920;
                    v0 = hq.bp * 0x390E83DD - 0x2BDE4D91;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.lc, v2, v8, 0xB9AECA60, 0, arg28);
                    v2 = bi.bt * v9 + 0x62D6725B;
                    v14.ag(in.ai, v2 + 1635301815, v7, 1);
                    arg24.ai(gs.lb, v2, v8, 0x1CB29475, 0, arg28);
                    v3 = hq.bp * 0xE844B86E + 0x54E4604F;
                    dl.cn = hq.cz * 0x2D49CD0F != 2 ? gs.mu : gs.mm;
                    em.cl = new or(bi.bt * v9, v3, v13.ar(dl.cn), 11);
                    dq.ck = new or(bi.bt * v9, v3, v13.ar(gs.mk), 11);
                    arg25.ai(dl.cn, bi.bt * -1322953108, v3, 0xFFFFFF, 0, arg28);
                    if(client.al.abd(1714609033) != 3 && client.al.abd(1814205015) != 2) {
                        goto label_382;
                    }

                    v1_1 = hq.bp * 0x3130B422 + 210;
                    v0 = bi.bt * v9 - hq.au.ae / 2;
                    v14.ag(hq.au, v0, v1_1, 1);
                    v14.ag(eh.am[0], v0 + v11, v1_1 + 4, 1);
                    arg24.ai(gs.le, bi.bt * v9 + eh.am[1].ae / 2 + 3, v1_1 + 26, -248901207, 0, arg28);
                    goto label_382;
                }

                v10 = 20;
                v12 = arg24;
                if(3 == hq.cm * 0xD0F8037) {
                    v7 = hq.bp * v18 - 0x2BD92026;
                    arg24.ai(gs.ll, 0x10ABDBA4 + hq.by * v19, v7, 0xFFFF00, 0, arg28);
                    v7 += v10;
                    arg25.ai(gs.la, 0x28C89E02 + hq.by * v19, v7, 0xE744F765, 0, arg28);
                    arg25.ai(gs.lu, 0xD712F4BF + hq.by * -120334062, v7 + 15, 0xDEDA70C5, 0, arg28);
                    v2 = hq.by * v19 - 0x258371A1;
                    v0 = hq.bp * -1182082414 + 100 + v11;
                    v14.ag(in.ai, v2 - 406669050, v0 - 20, 1);
                    arg26.ai(gs.lw, v2, v0 + 5, 0x10D4F800, 0, arg28);
                    v2 = hq.by * v19 + 180;
                    v0 = hq.bp * v18 + 1636052006;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg26.ai(gs.ls, v2, v0 + 5, 203145937, 0, arg28);
                    goto label_382;
                }

                if(4 == hq.cm * v7) {
                    arg24.ai(gs.jj, hq.by * 1842877305 - 1013638257, hq.bp * v18 + 0x228CF6E1, 0xA9797AF3, 0, arg28);
                    v7 = hq.bp * v18 + 100 + 0x4276283;
                    arg24.ai(hq.cu, hq.by * 0xFA9C362 + 180, v7, 0x99A75AE, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cq, hq.by * v19 + 0xB3A6CE2, v7, 0x70E46F4F, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cv, hq.by * 0xCD4DD07B + 180, v7, 0xF69F562C, 0, arg28);
                    v7 += v8;
                    v0_1 = new StringBuilder();
                    v0_1.append(gs.lk);
                    v0_1.append(ff.az(da.ds, 0xC52642B0));
                    v1 = client.bj * -2077001153 % 40 < v10 ? im.al(0x6F3C5CC3, -903564622) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), hq.by * v19 + 72, v7, 0xFFFFFF, 0, arg28);
                    v7 += -8;
                    arg24.aq(gs.ab, hq.by * 0xE31E4E08 - 0x10C51EF7, v7, 602061868, 0, arg28);
                    v7 += v8;
                    arg24.aq(gs.af, hq.by * 0x1F1A6389 + 0x4C3F72C9, v7, 0xFFFF00, 0, arg28);
                    v0 = hq.by * v19 + 0xAB + v12.ar(gs.af) + v8;
                    v7 -= v12.aj;
                    v1_3 = hq.dy ? oa.as : bz.aw;
                    v14.ag(v1_3, v0, v7, 1);
                    v2 = hq.by * 0xCAB26167 - 0x6F9F3FB3;
                    v7 = hq.bp * 0x5BE302F8 + 0x78D7666F;
                    v8 = v7 - 20;
                    v14.ag(in.ai, v2 - 0x79740BC0, v8, 1);
                    v9 = v7 + 5;
                    arg24.ai(gs.aj, v2, v9, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * v19 + 0x4F6B4BB;
                    v14.ag(in.ai, v2 - 73, v8, 1);
                    arg24.ai(gs.lb, v2, v9, 0x1D7744BE, 0, arg28);
                    arg25.ai(gs.jw, hq.by * v19 + 180, v7 + 0x496F239F, 1713498070, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * v7 == v11) {
                    arg24.ai(gs.ld, hq.by * v19 + 180, hq.bp * 436086220 - 0x38DA703 + 0x5F99E84A, 0xFFFF00, 0, arg28);
                    v7 = hq.bp * -740580495 - 1137037891;
                    arg26.ai(hq.cu, hq.by * v19 + 0x61BB57A7, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg26.ai(hq.cq, hq.by * -993108097 + 747401905, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg26.ai(hq.cv, hq.by * v19 + 180, v7, 0xFFFF00, 0, arg28);
                    v7 = v7 + v8 + 14;
                    arg24.aq(gs.my, hq.by * v19 - 0x7D86A63, v7, 0xF073117D, 0, arg28);
                    v0 = 0x5FB683B5;
                    for(v1 = en.an(1709546668); v12.ar(v1) > v0; v1 = v1.substring(1)) {
                    }

                    v0_1 = new StringBuilder();
                    v0_1.append(od.ad(v1));
                    v1 = client.bj * -2077001153 % 0x40BFFE82 < v10 ? im.al(0xFFFF00, -408185708) + jc.ae : "";
                    v0_1.append(v1);
                    arg24.aq(v0_1.toString(), hq.by * 0x4F06F436 + 0x92, v7, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * -937991190 + 180 - 0x5256A33F;
                    v0 = hq.bp * v18 + 150;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 + 0x75358B72, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.me, v2, v8, 0x116CCD5, 0, arg28);
                    v2 = hq.by * v19 + 2106295868;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg28);
                    arg25.ai(gs.mk, bi.bt * v9, hq.bp * v18 - 0x7CB50417, 0x9FDF896B, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * 0x9C10059F == 6) {
                    v7 = hq.bp * v18 + 100 - 0x5E7D6615;
                    arg24.ai(hq.cu, 1355206087 + hq.by * v19, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg24.ai(hq.cq, hq.by * 0x4371CDFB + 180, v7, 0xFFFF00, 0, arg28);
                    arg24.ai(hq.cv, hq.by * 0x59017D0C + 1374021923, v7 + 15, 0xFFFF00, 0, arg28);
                    v2 = hq.by * v19 + 0x196CEBC5;
                    v0 = hq.bp * v18 - 1213840622;
                    v14.ag(in.ai, v2 + 432301793, v0 - 20, 1);
                    arg24.ai(gs.mh, v2, v0 + 5, 0xFFFFFF, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * -1421110113 == 7) {
                    v7 = hq.bp * 0x21A559B0 - 0x3397FE4C + 107300321;
                    arg24.ai(gs.nj, hq.by * v19 + 0x750739CA, v7, 0xFFFF00, 0, arg28);
                    v7 += v8;
                    arg26.ai(gs.nu, 0x1D0F1175 + hq.by * v19, v7, 0xFFFF00, 0, arg28);
                    arg26.ai(gs.nm, hq.by * 0x94D4B8DA + 180, v7 + 15, 1280192877, 0, arg28);
                    v2 = hq.by * v19 + 100;
                    v1_1 = hq.bp * v18 + 1633531067;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 0x6463D58E, v7, 1);
                    v8 = v1_1 + 5;
                    arg24.ai(gs.nh, v2, v8, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * v19 + 0x3CF1DA7;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * 0x1FD61AAE == 8) {
                    v7 = hq.bp * v18 + 100 - 1571330262;
                    arg24.ai(hq.cu, hq.by * 0x235A6F39 + 180, v7, 0x8E7051A1, 0, arg28);
                    v7 += v8;
                    arg26.ai(hq.cq, hq.by * 0x346BFA7 + 0x284B6BF5, v7, 0xFFFF00, 0, arg28);
                    arg26.ai(hq.cv, 0x20888875 + hq.by * v19, v7 + 15, 0xFFFF00, 0, arg28);
                    v2 = hq.by * 0xA3F45E55 + 180 + 0x4C27E41C;
                    v0 = hq.bp * 0xEF26817F + 0x3F59F890;
                    v7 = v0 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v0 + 5;
                    arg24.ai(gs.fo, v2, v8, -2059985200, 0, arg28);
                    v2 = hq.by * -2002501268 + 260;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.mh, v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_382;
                }

                if(9 == hq.cm * v7) {
                    v7 = hq.bp * v18 - 0x4754EE9 + 0x1880C641;
                    arg24.ai(hq.cu, hq.by * 0xF5DFC06B - 999702955, v7, -602415939, 0, arg28);
                    v7 += 25;
                    arg24.ai(hq.cq, hq.by * v19 + 180, v7, -430289594, 0, arg28);
                    arg24.ai(hq.cv, 0x74CACC8D + hq.by * 0x68332C64, v7 + 25, 0xFFFF00, 0, arg28);
                    v2 = hq.by * 0x7A86A51F - 695886890;
                    v1_1 = hq.bp * 0x5717CF9 - 1662860846;
                    v14.ag(in.ai, v2 + 0x24945F47, v1_1 - 20, 1);
                    arg24.ai(gs.lw, v2, v1_1 + 5, 0xA0C218E3, 0, arg28);
                    goto label_382;
                }

                if(10 == hq.cm * 0x7322A19B) {
                    v7 = hq.by * 0x9B7FCB25 + 180;
                    v9 = hq.bp * 0x2F060C82 + 38;
                    arg24.ai(gs.lt, hq.by * v19 + 180, v9, -120709607, 0, arg28);
                    v9 += v10;
                    v14.ag(hq.av, v7 - 109, v9, 1);
                    if(je.ap(hq.dv, 0x2E33B013).isEmpty()) {
                        v14.ag(li.aa, v7 - 0x30, v9 + 18, 1);
                    }
                    else {
                        v14.ag(li.aa, v7 - 0x4F6CC159, v9 + 5, 1);
                        arg24.ai(hq.dv, v7, v9 + 53, 0xFFFF00, 0, arg28);
                    }

                    v1_1 = hq.bp * 0x8F51F4B7 + 0x3F46FDE9;
                    v14.ag(in.ai, v7 - 73, v1_1, 1);
                    arg24.ai("Sign out", v7, v1_1 + 25, 0xFFFFFF, 0, arg28);
                    goto label_382;
                }

                if(11 == hq.cm * 0xCD33E4A4) {
                    arg24.ai("Are you sure you want to sign out?", hq.by * 1831302442 + 180, hq.bp * v18 + 0x45732A6, 0xFFFF00, 0, arg28);
                    v2 = hq.by * 0xDD1DF2ED + 180 + 0x8899500;
                    v1_1 = hq.bp * v18 + 778331101 + v10;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    v8 = v1_1 + 5;
                    arg24.ai("Yes", v2, v8, 0x90FB129E, 0, arg28);
                    v2 = hq.by * 0xC4BBA668 + 260;
                    v14.ag(in.ai, v2 + 1741371077, v7, 1);
                    arg24.ai("No", v2, v8, 0x8F9D0A4D, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * v7 == 12) {
                    v7 = bi.bt * v9;
                    v8 = hq.bp * 0xA7B0FBA3 + 45;
                    arg26.ai(gs.ny, v7, v8, 0xFFFFFF, 0, arg28);
                    v8 += 17;
                    arg26.ai(gs.os, v7, v8, 0xFFFFFF, 0, arg28);
                    v8 += 17;
                    arg26.ai(gs.oa, v7, v8, 0x15992B40, 0, arg28);
                    arg26.ai(gs.of, v7, v8 + 17, -1409174250, 0, arg28);
                    v2 = bi.bt * -884206983 + 0x765F90A;
                    v1_1 = hq.bp * 1529284003 - 0x2379DB61;
                    v7 = v1_1 - 20;
                    v14.ag(in.ai, v2 + 576399710, v7, 1);
                    v8 = v1_1 + 5;
                    arg24.ai(gs.oy, v2, v8, 0xFFFFFF, 0, arg28);
                    v2 = bi.bt * v9 + 80;
                    v14.ag(in.ai, v2 - 73, v7, 1);
                    arg24.ai(gs.om, v2, v8, 0xFFFFFF, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * 0x4E4095B5 == 13) {
                    v7 = hq.bp * 0x2945BC1 + 60;
                    arg26.ai(gs.ob, hq.by * v19 + 180, v7, 0xB05F2951, 0, arg28);
                    arg26.ai(gs.op, hq.by * v19 + 180, v7 + 20, 0xFFFFFF, 0, arg28);
                    v2 = hq.by * -692303403 - 782485102;
                    v1_1 = hq.bp * 1282065990 + 140;
                    v14.ag(in.ai, v2 + 0x3F068A66, v1_1 - 20, 1);
                    arg24.ai(gs.mh, v2, v1_1 + 5, 0x47541831, 0, arg28);
                    goto label_382;
                }

                if(hq.cm * v7 == 14) {
                    v7 = hq.bp * 1903074556 + 100 + 0x1F9FA11B;
                    switch(hq.ch * 0xB14A5F75) {
                        case 0: {
                            ax.bf(gs.cj, gs.cd, gs.cf, 0x63D3C206);
                            break;
                        }
                        case 1: {
                            ax.bf(gs.dl, gs.dr, gs.dn, 0x63D3C206);
                            break;
                        }
                        default: {
                            ht.ah(false, -1029585057);
                            break;
                        }
                    }

                    arg24.ai(hq.cu, hq.by * v19 + 0x560125CE, v7, 1286029799, 0, arg28);
                    v7 += v8;
                    arg26.ai(hq.cq, hq.by * v19 + 180, v7, 0xFFFF00, 0, arg28);
                    arg26.ai(hq.cv, hq.by * v19 + 0x64FC8932, v7 + 15, 0xFFFF00, 0, arg28);
                    v2 = hq.by * v19 + 180;
                    v0 = hq.bp * -1663200181 + 0x3ABFA8F0 + v11;
                    v14.ag(in.ai, v2 - 0x7E88E6AF, v0 - 20, 1);
                    arg24.ai(gs.bx, v2, v0 + 5, 480014375, 0, arg28);
                    v2 = hq.by * v19 + 180;
                    v0 = hq.bp * v18 + 0x19E7F534;
                    v14.ag(in.ai, v2 - 73, v0 - 20, 1);
                    arg24.ai(gs.mh, v2, v0 + 5, 0xFD1B2691, 0, arg28);
                    goto label_382;
                }

                if(16 != hq.cm * v7) {
                    if(hq.cm * 0x97624D18 == 19) {
                    }
                    else {
                        if(hq.cm * v7 != 17) {
                            if(hq.cm * 0xAD08DCEF == 18) {
                            }
                            else {
                                if(hq.cm * v7 != v8) {
                                    if(23 == hq.cm * v7) {
                                    }
                                    else if(21 == hq.cm * 0xF6B899D1) {
                                        v7 = bi.bt * v9;
                                        v8 = hq.bp * v18 + 407718627 - 0xBB83369;
                                        arg26.ai(gs.oe, v7, v8, 0xFFFFFF, 0, arg28);
                                        v8 += 17;
                                        arg26.ai(gs.od, v7, v8, 0xCAFFFD23, 0, arg28);
                                        v8 += 17;
                                        arg26.ai(gs.ox, v7, v8, 0xFFFFFF, 0, arg28);
                                        arg26.ai(gs.oq, v7, v8 + 17, 1741805064, 0, arg28);
                                        v2 = bi.bt * 0x64034EA7 + 0x6DFD7A44;
                                        v3 = hq.bp * 0x9130C889 - 0x24B32F74;
                                        v7 = v3 - 20;
                                        v14.ag(in.ai, v2 - 1467582610, v7, 1);
                                        v8 = v3 + 5;
                                        arg24.ai(gs.oy, v2, v8, 0xB5280240, 0, arg28);
                                        v2 = bi.bt * 0xB12BB1EB + 80;
                                        v14.ag(in.ai, v2 - 73, v7, 1);
                                        arg24.ai(gs.lb, v2, v8, 0xAD80AEBD, 0, arg28);
                                        goto label_382;
                                    }
                                    else {
                                        if(22 == hq.cm * v7) {
                                            v7 = hq.bp * 0x1859638F + 50;
                                            arg24.ai(hq.cu, 0x3A95A50F + hq.by * 0xA0F979C2, v7, 0xEA3EFCA2, 0, arg28);
                                            v7 += 25;
                                            arg26.ai(hq.cq, 0x46C0F374 + hq.by * v19, v7, 1026933075, 0, arg28);
                                            arg26.ai(hq.cv, hq.by * v19 + 180, v7 + 25, 0xFFFF00, 0, arg28);
                                            v2 = hq.by * 0xFC951A33 - 0x46EA5E45;
                                            v0 = hq.bp * v18 + 130;
                                            v14.ag(in.ai, v2 + 495580705, v0 - 20, 1);
                                            arg24.ai(gs.gu, v2, v0 + 5, 0xFFFFFF, 0, arg28);
                                        }
                                        else if(24 == hq.cm * 0xC694EDFE) {
                                            v7 = hq.bp * 0x87207AC8 + 0x15B14A2F;
                                            arg24.ai(hq.cu, hq.by * v19 + 180, v7, 0xFFFF00, 0, arg28);
                                            v7 += 25;
                                            arg26.ai(hq.cq, hq.by * v19 + 180, v7, 0xCF28878B, 0, arg28);
                                            arg26.ai(hq.cv, 1962010021 + hq.by * 0x355C7574, v7 + 25, 0xFFFF00, 0, arg28);
                                            v2 = hq.by * -1404960469 + 180;
                                            v3 = hq.bp * v18 + 0x47059949;
                                            v14.ag(in.ai, v2 + 0x8204B56, v3 - 20, 1);
                                            arg24.ai(gs.an, v2, v3 + v11, 0xDF4C6C48, 0, arg28);
                                        }
                                        else {
                                        }

                                        goto label_382;
                                    }
                                }

                                v7 = hq.bp * v18 + 100 + 0xED621AD;
                                arg24.ai(hq.cu, hq.by * v19 + 180, v7, 0xFD08E5F2, 0, arg28);
                                v7 += 25;
                                arg24.ai(hq.cq, hq.by * v19 - 930174926, v7, 0xD784861, 0, arg28);
                                arg24.ai(hq.cv, hq.by * 0x38CEF392 + 180, v7 + 25, 1665633480, 0, arg28);
                                goto label_382;
                            }
                        }

                        v7 = hq.bp * 0x31DFB34C + 0xCB36FDD;
                        arg24.ai(hq.cu, bi.bt * v9, v7, 0xFFFF00, 0, arg28);
                        v7 += v8;
                        arg24.ai(hq.cq, bi.bt * 0x40A3A989, v7, 2067224379, 0, arg28);
                        arg24.ai(hq.cv, bi.bt * v9, v7 + 15, 0x981B6F98, 0, arg28);
                    label_382:
                        v12_2 = 5;
                        goto label_2733;
                    }
                }

                v7 = hq.bp * 427111086 + 100 + 0x759AF73;
                arg24.ai(hq.cu, -1503358604 * bi.bt, v7, 0xDE10AD59, 0, arg28);
                v7 += v8;
                arg24.ai(hq.cq, 0x252C5FBB * bi.bt, v7, 0xFFFF00, 0, arg28);
                arg24.ai(hq.cv, bi.bt * v9, v7 + 15, 0xFFFF00, 0, arg28);
                v0_5 = hq.cm * 816024260 == 16 ? gs.kw : gs.kg;
                v1 = v0_5;
                v4_1 = hq.by * 0xF0E28D1C + 180 + 0x69D3AA1B - 73;
                v9 = hq.bp * v18 + 0x3FBC7300 + v10 - 20;
                v14.ag(in.ai, v4_1, v9, 1);
                v12_2 = 5;
                arg24.av(v1, v4_1, v9, 0x3DF3F9B2, 0xCFA2B76, 0xFFFFFF, 0, 1, 1, 0, arg28);
                v2 = hq.by * -169338011 + 0x325F22AB;
                v14.ag(in.ai, v2, v9, 1);
                arg24.av(gs.kq, v2, v9, 0x90, 40, 0x63DC5B0C, 0, 1, 1, 0, arg28);
            }
        }
        else {
            goto label_382;
        }

    label_2733:
        if(v16 >= hq.fl * -611935993406195833L) {
            cl.ac.ae(hq.ab * 0x4D586FC3 - 22, client.bj * -2077001153, v14, -59);
            cl.ac.ae(hq.ab * 0x2F62B293 + 61630918 - 0x45FBC00F, client.bj * 0x36DF053B, v14, -28);
        }

        ef[] v0_6 = ax.ay;
        v1_1 = li.rg.ar ? 1 : 0;
        v14.ag(v0_6[v1_1], hq.ab * 0xE005BCCD + 710, 0x350C3860, 1);
        if(client.ac * 0xE09AC224 > v12_2 && ly.ax == en.af) {
            if(dy.ey != null) {
                v0 = hq.ab * 0x8C21E44A + 20;
                v14.ag(dy.ey, v0, 0x1C0, 1);
                v1_2 = new StringBuilder();
                v1_2.append(gs.hc);
                v1_2.append(" ");
                v1_2.append(client.ae * 0x72B9F0D3);
                v7 = v0 + 50;
                arg24.ai(v1_2.toString(), v7, 0x1CF, 0x98AF151F, 0, arg28);
                if(li.ab != null) {
                    arg25.ai(gs.ne, v7, 477, 0xFFFFFF, 0, arg28);
                }
                else {
                    v0_5 = client.al.au ? gs.ni : gs.ns;
                    arg25.ai(v0_5, v7, 477, 0xFFFFFF, 0, arg28);
                }
            }
            else {
                dy.ey = aa.aq(eo.dh, "sl_button", "", -27);
            }

            v7 = 11;
            v8 = bi.bt * 0xA69EEE7D;
            arg25.ai(String.format(gs.nl, Integer.valueOf(Calendar.getInstance().get(1))), v8, 465, 383104488, 0, arg28);
            v10 = 477;
            arg25.ai(gs.nw, v8, v10, 0xFFFFFF, 0, arg28);
            if(jl.fk != null && bl.fv != null && eh.fc != null) {
                return;
            }

            v8 -= v13.ar(gs.nw) / 2;
            v0 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nr))) + v8;
            v1_1 = v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nb))) + v8;
            v8 += v13.ar(gs.nw.substring(0, gs.nw.indexOf(gs.ng)));
            jl.fk = new or(v0, v10, v13.ar(gs.nr), v7);
            bl.fv = new or(v1_1, v10, v13.ar(gs.nb), v7);
            eh.fc = new or(v8, v10, v13.ar(gs.ng), v7);
        }
    }

    static int ex() {
        int v0 = hq.fz.ae * 0x249E9B9;
        int v2 = hq.fz.ar * 0xEE0C033F;
        ib v1 = ds.bp(1857720092);
        int v4 = 0x399617D7;
        int v3 = v1.aq * v4 + 23;
        int v5 = v1.aj * 0xE1ECC05D + hq.ab * 0x4D586FC3;
        int v8 = 0x9BA2F453;
        int v6 = hq.ev * 0xE513D117 * (v1.ar * v8);
        int v9 = 0;
        while(v6 < ih.ap * 0x6DE6A9AD) {
            int v10 = -204538603;
            int v11 = -250202335;
            if(v0 >= v5 && v2 >= v3 && v0 < v1.ax * v10 + v5 && v2 < v1.al * v11 + v3) {
                return v6;
            }

            v3 += v1.ap * 0xDF01D95D + v1.al * v11;
            ++v9;
            if(v9 >= v1.ar * v8) {
                v3 = v1.aq * v4 + 23;
                v5 += v1.ax * v10 + v1.an * 0x75C55DF7;
                v9 = 0;
            }

            ++v6;
        }

        return -1;
    }

    static void ey() {
        hq.cg = hq.cg.trim();
        int v1 = 0x63D3C206;
        if(hq.cg.length() == 0) {
            ax.bf(gs.mg, gs.mv, gs.ms, v1);
            return;
        }

        long v2 = gj.ax(0xC5ABA107);
        int v0 = v2 == 0 ? 5 : gm.al(v2, hq.cg, 2033363071);
        switch(v0) {
            case 2: {
                client.al.aba(0x9990BA07).gj("ariMOV", 0xD07650FB);
                ax.bf(gs.mb, gs.mo, gs.mi, v1);
                hq.cm = 0x11CDFFFB;
                break;
            }
            case 3: {
                ax.bf(gs.mx, gs.mt, gs.mj, v1);
                break;
            }
            case 4: {
                ax.bf(gs.mr, gs.mn, gs.mz, v1);
                break;
            }
            case 5: {
                ax.bf(gs.mw, gs.mp, gs.mf, v1);
                break;
            }
            case 6: {
                ax.bf(gs.ml, gs.mc, gs.no, v1);
                break;
            }
            case 7: {
                ax.bf(gs.nq, gs.nc, gs.nd, v1);
                break;
            }
            default: {
                break;
            }
        }
    }

    static ar ez() {
        ar v0 = client.al.aba(0xCA6BAB6E).az(1, 0x3310F9D5);
        v0.ao(da.ds, 0x823A0CB7);
        return v0;
    }

    static void fa(jz arg12, fa arg13) {
        int v12 = hq.fz.ae * 0x249E9B9;
        int v0 = hq.fz.ar * 0xEE0C033F;
        boolean v1 = hq.fz.an;
        boolean v2 = hq.fz.aj;
        boolean v3 = hq.fz.aq;
        boolean v4 = hq.fz.ab;
        hq.fz.ae(0x4068);
        int v5 = 0xDA4D3441;
        if(v2) {
            dr.bv(arg13, v5);
            return;
        }

        int v2_1 = -1692502361;
        int v6 = 0xE513D117;
        if((v3) && hq.ev * v6 > 0 && bl.en != null) {
            hq.ev -= v2_1;
        }

        if((v4) && hq.ev * v6 < hq.eg * 1447801927 && ci.el != null) {
            hq.ev += v2_1;
        }

        if(v1) {
            int v3_1 = 0x4D586FC3;
            int v1_1 = hq.ab * v3_1 + 280;
            int v7 = 18;
            int v8 = 4;
            if(v12 >= v1_1 && v12 <= v1_1 + 14 && v0 >= v8 && v0 <= v7) {
                dk.al(0, 0, 1841201106);
                return;
            }

            if(v12 >= v1_1 + 15 && v12 <= v1_1 + 80 && v0 >= v8 && v0 <= v7) {
                dk.al(0, 1, 0xDFB679CD);
                return;
            }

            v1_1 = hq.ab * v3_1 + 390;
            if(v12 >= v1_1 && v12 <= v1_1 + 14 && v0 >= v8 && v0 <= v7) {
                dk.al(1, 0, 0x40F1C16C);
                return;
            }

            if(v12 >= v1_1 + 15 && v12 <= v1_1 + 80 && v0 >= v8 && v0 <= v7) {
                dk.al(1, 1, 0x38429F48);
                return;
            }

            v1_1 = hq.ab * v3_1 + 500;
            int v9 = 2;
            if(v12 >= v1_1 && v12 <= v1_1 + 14 && v0 >= v8 && v0 <= v7) {
                dk.al(v9, 0, 0x5EA2A18E);
                return;
            }

            if(v12 >= v1_1 + 15 && v12 <= v1_1 + 80 && v0 >= v8 && v0 <= v7) {
                dk.al(v9, 1, 0xF1E493F5);
                return;
            }

            v1_1 = hq.ab * v3_1 + 610;
            if(v12 >= v1_1 && v12 <= v1_1 + 14 && v0 >= v8 && v0 <= v7) {
                dk.al(3, 0, 1641206994);
                return;
            }

            if(v12 >= v1_1 + 15 && v12 <= v1_1 + 80 && v0 >= v8 && v0 <= v7) {
                dk.al(3, 1, 0xECE34600);
                return;
            }

            if(v12 >= hq.ab * v3_1 + 708 && v0 >= v8 && v12 <= hq.ab * v3_1 + 0x2F6 && v0 <= 20) {
                dr.bv(arg13, v5);
                return;
            }

            int v4_1 = 0xDE657DFF;
            if(hq.ew * v4_1 != -1 && hq.ew * v4_1 == gy.bw(0x48769C8A)) {
                dm.by(ew.an[hq.ew * v4_1], -1848028437);
                dr.bv(arg13, v5);
                return;
            }

            if(ce.eu == null) {
                return;
            }

            v1_1 = 742742805;
            if(hq.ev * v6 > 0 && bl.en != null && v12 >= 0 && v12 <= hq.ab * v3_1 + ce.eu.aj * 0xE1ECC05D - ce.eu.an * 0xEB8ABBEE && v0 >= bv.tt * v1_1 / v9 - 100 && v0 <= bv.tt * v1_1 / v9 + 100) {
                hq.ev -= v2_1;
            }

            if(hq.ev * v6 >= hq.eg * 1447801927) {
                return;
            }

            if(ci.el == null) {
                return;
            }

            if(v12 < ce.eu.an * 0xEB8ABBEE + (dq.tv * 0xD9CC4AFD - hq.ab * v3_1 - ce.eu.aj * 0xE1ECC05D)) {
                return;
            }

            if(v12 > dq.tv * 0xD9CC4AFD) {
                return;
            }

            if(v0 < bv.tt * v1_1 / v9 - 100) {
                return;
            }

            if(v0 > bv.tt * v1_1 / v9 + 100) {
                return;
            }

            hq.ev += v2_1;
        }
    }

    static boolean fb(int arg2) {
        if(!client.al.aba(-1886170086).gg(0x2F)) {
            hq.cm = 0x4E51CCE1;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static boolean fc(int arg2) {
        if(!client.al.aba(-2028097804).fg(-14764)) {
            hq.cm = 0xBEF6A45C;
            hq.da = arg2 * 1050927162;
            return 1;
        }

        return 0;
    }

    static void fd(jz arg13, fa arg14) {
        int v13 = hq.fz.ae * -394603670;
        int v0 = hq.fz.ar * 0xEE0C033F;
        boolean v1 = hq.fz.an;
        boolean v2 = hq.fz.aj;
        boolean v3 = hq.fz.aq;
        boolean v4 = hq.fz.ab;
        hq.fz.ae(0x56AC);
        int v5 = 0xDA4D3441;
        if(v2) {
            dr.bv(arg14, v5);
            return;
        }

        int v2_1 = 0xE513D117;
        if((v3) && hq.ev * v2_1 > 0 && bl.en != null) {
            hq.ev -= 0x21C57D8F;
        }

        int v3_1 = -1692502361;
        if((v4) && hq.ev * 0xB87CB56A < hq.eg * 0xF22F8A41 && ci.el != null) {
            hq.ev += v3_1;
        }

        if(v1) {
            int v6 = hq.ab * 0x996379E5 + 0x401A8504;
            int v4_1 = 18;
            int v7 = 4;
            if(v13 >= v6 && v13 <= v6 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(0, 0, 0xD338D037);
                return;
            }

            if(v13 >= v6 + 15 && v13 <= v6 - 1206826142 && v0 >= v7 && v0 <= v4_1) {
                dk.al(0, 1, 0xDF9A0BF9);
                return;
            }

            int v8 = hq.ab * 1971615570 + 1028475784;
            if(v13 >= v8 && v13 <= v8 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(1, 0, 0xE5DAA4A5);
                return;
            }

            if(v13 >= v8 + 15 && v13 <= v8 + 80 && v0 >= v7 && v0 <= v4_1) {
                dk.al(1, 1, -1797800001);
                return;
            }

            v8 = hq.ab * 0x897D468F + 500;
            v6 = 2;
            if(v13 >= v8 && v13 <= v8 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v6, 0, 0xBB80CAAA);
                return;
            }

            if(v13 >= v8 + 15 && v13 <= v8 + 80 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v6, 1, 0x4C192FD7);
                return;
            }

            int v10 = 0x4D586FC3;
            v8 = hq.ab * v10 + 0x35215533;
            int v11 = 3;
            if(v13 >= v8 && v13 <= v8 + 14 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v11, 0, 0x89AFCB23);
                return;
            }

            if(v13 >= v8 + 15 && v13 <= v8 + 80 && v0 >= v7 && v0 <= v4_1) {
                dk.al(v11, 1, 0x9C992BF6);
                return;
            }

            if(v13 >= hq.ab * 0xA82703B7 + 708 && v0 >= v7 && v13 <= hq.ab * -904690227 + 0x5B07116C && v0 <= 20) {
                dr.bv(arg14, v5);
                return;
            }

            if(hq.ew * 0xDE657DFF != -1 && hq.ew * 1295878620 == gy.bw(0x689D8600)) {
                dm.by(ew.an[hq.ew * 0x5242EEA], 0xC2728551);
                dr.bv(arg14, v5);
                return;
            }

            if(ce.eu == null) {
                return;
            }

            int v14 = 0xEB8ABBEE;
            v4_1 = 742742805;
            if(hq.ev * 0x81CF20D6 > 0 && bl.en != null && v13 >= 0 && v13 <= hq.ab * 0x805E2C1 + ce.eu.aj * 0xC9EE5D50 - ce.eu.an * v14 && v0 >= bv.tt * v4_1 / v6 - 100 && v0 <= bv.tt * v4_1 / v6 - 0x13FC656F) {
                hq.ev -= v3_1;
            }

            if(hq.ev * v2_1 >= hq.eg * 0x84FED906) {
                return;
            }

            if(ci.el == null) {
                return;
            }

            if(v13 < ce.eu.an * v14 + (dq.tv * 0x76F75F0E - hq.ab * v10 - ce.eu.aj * 0x37D07624)) {
                return;
            }

            if(v13 > dq.tv * 0x50B43510) {
                return;
            }

            if(v0 < bv.tt * 0x508E7008 / v6 - 100) {
                return;
            }

            if(v0 > bv.tt * v4_1 / v6 - 0x549DCDFA) {
                return;
            }

            hq.ev += 0x73D06340;
        }
    }

    static void fe(jz arg12, fa arg13) {
        int v12 = hq.fz.ae * 0x7F3F9E95;
        int v0 = hq.fz.ar * 0xEE0C033F;
        boolean v1 = hq.fz.an;
        boolean v2 = hq.fz.aj;
        boolean v3 = hq.fz.aq;
        boolean v4 = hq.fz.ab;
        hq.fz.ae(0x2ECF);
        int v5 = 0xDA4D3441;
        if(v2) {
            dr.bv(arg13, v5);
            return;
        }

        if((v3) && hq.ev * -371051867 > 0 && bl.en != null) {
            hq.ev -= -2000131786;
        }

        int v2_1 = -1692502361;
        if((v4) && hq.ev * -1712843203 < hq.eg * 0x24CA5272 && ci.el != null) {
            hq.ev += v2_1;
        }

        if(v1) {
            int v3_1 = hq.ab * 0x9B44AD60 + 280;
            int v4_1 = 18;
            int v6 = 4;
            if(v12 >= v3_1 && v12 <= v3_1 + 14 && v0 >= v6 && v0 <= v4_1) {
                dk.al(0, 0, -1294087907);
                return;
            }

            if(v12 >= v3_1 + 15 && v12 <= v3_1 + 80 && v0 >= v6 && v0 <= v4_1) {
                dk.al(0, 1, 0x36EFCFD0);
                return;
            }

            int v7 = 0x4D586FC3;
            v3_1 = hq.ab * v7 + 390;
            if(v12 >= v3_1 && v12 <= v3_1 + 14 && v0 >= v6 && v0 <= v4_1) {
                dk.al(1, 0, 700795321);
                return;
            }

            if(v12 >= v3_1 + 15 && v12 <= v3_1 - 0x242B51FD && v0 >= v6 && v0 <= v4_1) {
                dk.al(1, 1, 0x60FD6294);
                return;
            }

            int v9 = hq.ab * v7 + 200067474;
            v3_1 = 2;
            if(v12 >= v9 && v12 <= v9 + 14 && v0 >= v6 && v0 <= v4_1) {
                dk.al(v3_1, 0, 0xE8EA545C);
                return;
            }

            if(v12 >= v9 + 15 && v12 <= v9 + 80 && v0 >= v6 && v0 <= v4_1) {
                dk.al(v3_1, 1, -1822209581);
                return;
            }

            v9 = hq.ab * 0xC9CF1498 + 0x42D95F3B;
            int v10 = 3;
            if(v12 >= v9 && v12 <= v9 + 14 && v0 >= v6 && v0 <= v4_1) {
                dk.al(v10, 0, 0x89242F43);
                return;
            }

            if(v12 >= v9 + 15 && v12 <= v9 - 0x38B37F7F && v0 >= v6 && v0 <= v4_1) {
                dk.al(v10, 1, 0x103197FC);
                return;
            }

            if(v12 >= hq.ab * v7 + 708 && v0 >= v6 && v12 <= hq.ab * -170017269 - 0x381ECCA8 && v0 <= 20) {
                dr.bv(arg13, v5);
                return;
            }

            if(hq.ew * -2006787158 != -1 && hq.ew * 0x761C91FE == gy.bw(-1162500313)) {
                dm.by(ew.an[hq.ew * 0x209AFECF], 0x9BB91EF6);
                dr.bv(arg13, v5);
                return;
            }

            if(ce.eu == null) {
                return;
            }

            int v13 = 0xEB8ABBEE;
            v4_1 = 742742805;
            if(hq.ev * -1203903388 > 0 && bl.en != null && v12 >= 0 && v12 <= hq.ab * -2019461081 + ce.eu.aj * -1213027166 - ce.eu.an * v13 && v0 >= bv.tt * v4_1 / v3_1 + 2004040384 && v0 <= bv.tt * 0xE2EDA7E5 / v3_1 + 0x721DDF85) {
                hq.ev -= 0xA3B20D6D;
            }

            if(hq.ev * 0xE513D117 >= hq.eg * 1447801927) {
                return;
            }

            if(ci.el == null) {
                return;
            }

            if(v12 < ce.eu.an * v13 + (dq.tv * -1482506709 - hq.ab * 0xE82EFC8C - ce.eu.aj * 0xE1ECC05D)) {
                return;
            }

            if(v12 > dq.tv * 0xD9CC4AFD) {
                return;
            }

            if(v0 < bv.tt * v4_1 / v3_1 - 100) {
                return;
            }

            if(v0 > bv.tt * v4_1 / v3_1 + 100) {
                return;
            }

            hq.ev += v2_1;
        }
    }

    static void ff() {
        ls v0 = client.al.aba(0x40FCF903);
        ah v1 = v0.bh(0x544370F6);
        if(v1 != null) {
            v1.ah("acipK9", 0x7F6C5B6C);
            v1.aq(-1903261252);
        }
        else {
            la v0_1 = v0.ga(44);
            v0_1.ax(il.is("secure", true, 0xB6C29DB0) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, -1953703715);
        }
    }

    static void fg() {
        client.al.aba(-1700563451).gj("cgs2K0", 0xBAFBADA4);
        hq.cm = 0x98AE105B;
        ax.bf(gs.kc, gs.ks, gs.kt, 0x63D3C206);
        ah v0 = client.al.aba(1315673830).bh(1961300705);
        int v1 = 0x7FCD6E81;
        if(v0 != null) {
            hp.ea.ah(null, v1);
            v0.aj(0x25208DE9);
        }
        else {
            hp.ea.ah(new av(false, 2), v1);
        }
    }

    static void fh(fa arg9) {
        int v7 = 0x4D586FC3;
        int v8 = hq.ab * v7 - (ox.ag.al - 0x17F);
        if(v8 > 0) {
            arg9.at(ox.ag, 0, 0, ox.ag.al * 2, ox.ag.ae * 2, 0x4390813B);
            arg9.at(hq.ah, arg9.al * -107049639 - hq.ah.al * 2, 0, hq.ah.al * 2, hq.ah.ae * 2, 0x4390813B);
        }

        arg9.aa(ox.ag, v8, 0, 25);
        arg9.aa(hq.ah, hq.ab * v7 + 382, 0, 25);
        arg9.ag(gn.at, hq.ab * v7 + 382 - gn.at.ae / 2 - gn.at.an, 89 - gn.at.ar / 2, 1);
    }

    static boolean fi(int arg2) {
        if(!client.al.aba(1975085756).fg(-1892)) {
            hq.cm = 0xBEF6A45C;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static void fj() {
        client.al.aba(0x235BAFDA).gj("cgs2K0", 0xA50AC30E);
        hq.cm = 0x98AE105B;
        ax.bf(gs.kc, gs.ks, gs.kt, 0x63D3C206);
        ah v0 = client.al.aba(0xFAFFDE5D).bh(0x7EE56E4B);
        int v1 = 0x7FCD6E81;
        if(v0 != null) {
            hp.ea.ah(null, v1);
            v0.aj(0xBAF56D9E);
        }
        else {
            hp.ea.ah(new av(false, 2), v1);
        }
    }

    static void fk(fa arg9) {
        int v7 = 0x4D586FC3;
        int v8 = hq.ab * v7 - (ox.ag.al - 0x17F);
        if(v8 > 0) {
            arg9.at(ox.ag, 0, 0, ox.ag.al * 2, ox.ag.ae * 2, 0x4390813B);
            arg9.at(hq.ah, arg9.al * -107049639 - hq.ah.al * 2, 0, hq.ah.al * 2, hq.ah.ae * 2, 0x4390813B);
        }

        arg9.aa(ox.ag, v8, 0, 25);
        arg9.aa(hq.ah, hq.ab * v7 + 382, 0, 25);
        arg9.ag(gn.at, hq.ab * v7 + 382 - gn.at.ae / 2 - gn.at.an, 89 - gn.at.ar / 2, 1);
    }

    static void fl(fa arg15) {
        int v0 = hq.ab * -1510120088 - (ox.ag.al - 0x17F);
        if(v0 > 0) {
            arg15.at(ox.ag, 0, 0, ox.ag.al * 2, ox.ag.ae * 2, 0x4390813B);
            arg15.at(hq.ah, arg15.al * -107049639 - hq.ah.al * 2, 0, hq.ah.al * 2, hq.ah.ae * 2, 0x4390813B);
        }

        arg15.aa(ox.ag, v0, 0, 25);
        arg15.aa(hq.ah, hq.ab * 0x4D586FC3 + 382, 0, 25);
        arg15.ag(gn.at, hq.ab * 0x4D586FC3 + 382 - gn.at.ae / 2 - gn.at.an, 89 - gn.at.ar / 2, 1);
    }

    static void fm() {
        ls v0 = client.al.aba(-94140590);
        ah v1 = v0.bh(0x4F7601DD);
        if(v1 != null) {
            v1.ah("acipK9", 0x7FE9A60A);
            v1.aq(-649600211);
        }
        else {
            la v0_1 = v0.ga(54);
            v0_1.ax(il.is("secure", true, 0x88D801C3) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, 0xAA7A2921);
        }
    }

    static boolean fn(int arg2) {
        if(!client.al.aba(5791305).gg(4)) {
            hq.cm = 0xCE2F9FA1;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static boolean fo(int arg2) {
        if(!client.al.aba(0xB05B50EE).fg(-3959)) {
            hq.cm = 440583660;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static void fp() {
        ah v0 = client.al.aba(0x290B7356).bh(2057702934);
        if(v0 != null) {
            v0.ao(-716096533);
        }
    }

    static void fq() {
        ah v0 = client.al.aba(-1053001804).bh(0x5EAE10A4);
        if(v0 != null) {
            v0.ao(-716096533);
        }
    }

    static void fr() {
        client.al.aba(0xB8058A94).gj("cgs2K0", 0x4F68F6C1);
        hq.cm = 0x98AE105B;
        ax.bf(gs.kc, gs.ks, gs.kt, 0x63D3C206);
        ah v0 = client.al.aba(-581525803).bh(0x6F7B521E);
        int v1 = 0x7FCD6E81;
        if(v0 != null) {
            hp.ea.ah(null, v1);
            v0.aj(977700895);
        }
        else {
            hp.ea.ah(new av(false, 2), v1);
        }
    }

    static void fs() {
        client.al.aba(2082099537).gj("cgs2K0", 0xC1CFD46E);
        hq.cm = 0x98AE105B;
        ax.bf(gs.kc, gs.ks, gs.kt, 0x63D3C206);
        ah v0 = client.al.aba(0x34C257EB).bh(0x7C8CBA06);
        int v1 = 0x7FCD6E81;
        if(v0 != null) {
            hp.ea.ah(null, v1);
            v0.aj(0x76BE3A4C);
        }
        else {
            hp.ea.ah(new av(false, 2), v1);
        }
    }

    static void ft() {
        client.al.aba(0x66401BF1).gj("cgcPRM", 763094146);
        hq.cm = 1857310067;
        ax.bf(gs.km, gs.ko, gs.ki, 0x63D3C206);
        ah v0 = client.al.aba(960961813).bh(0x4A2094F2);
        if(v0 == null || !v0.hf(-24)) {
            hp.ea.az(new ag(false, 3), -64);
        }
        else {
            hp.ea.az(null, -22);
            v0.ap(-115);
        }
    }

    static boolean fu(int arg2) {
        if(!client.al.aba(0x48E06FC0).gg(25)) {
            hq.cm = 0xCE2F9FA1;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static boolean fv(int arg2) {
        if(!client.al.aba(0x5342404C).fg(-717)) {
            hq.cm = 0xBEF6A45C;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static void fw() {
        ah v0 = client.al.aba(0xDCBB8BF7).bh(0x7E9C7904);
        if(v0 != null) {
            v0.ao(-716096533);
        }
    }

    static boolean fx(int arg2) {
        if(!client.al.aba(0x329D4902).gg(16)) {
            hq.cm = 0xCE2F9FA1;
            hq.da = arg2 * -633703253;
            return 1;
        }

        return 0;
    }

    static void fy(fa arg1) {
        hq.ea = false;
        gx.bq(arg1, 0xEE4A0170);
    }

    static void fz(ih arg4) {
        if(arg4.ab(0x2D715B04) != client.aq) {
            client.aq = arg4.ab(0x35F98F2);
            be.as(arg4.ab(0x46D86FBA), 0x1484BE70);
            client.al.aba(0x623900B0).bp("fhtagn", arg4.ab(1703968024), 0xE517DB66);
        }

        dd.do = arg4.aa;
        client.ae = arg4.af * 22487701;
        client.ar = arg4.ai * 0x2986F0F7;
        int v1 = -190026425;
        int v2 = 0xBBB22DD;
        int v0 = client.ap * v1 == 0 ? 0xAA4A : arg4.af * v2 + 40000;
        gu.dq = v0 * 1248099281;
        v0 = -1080391757;
        int v4 = client.ap * v1 == 0 ? 443 : arg4.af * v2 + 50000;
        bf.dt = v4 * v0;
        ol.dd = gu.dq * 886379063;
        hq.df = false;
    }

    static void ga() {
        dc.ay(10, -109);
        hq.cm = 0x53F385D0;
        String v0 = hq.dv == null || (hq.dv.isEmpty()) ? gs.ju : String.format(gs.jo, hq.dv);
        ax.bf(gs.jq, gs.jg, v0, 0x63D3C206);
    }

    static void gb() {
        hq.cm = 2112702648;
        ax.bf(gs.lm, gs.lr, gs.lz, 0x63D3C206);
    }

    static void gc(int arg1) {
        hq.cm = 1498949990;
        hq.ch = arg1 * -1719607703;
    }

    static void gg(int arg1) {
        hq.cm = 0x89751516;
        hq.ch = arg1 * -1719607703;
    }

    static void gj() {
        dc.ay(10, -32);
        hq.cm = 0x5ADF1719;
        String v0 = hq.dv == null || (hq.dv.isEmpty()) ? gs.ju : String.format(gs.jo, hq.dv);
        ax.bf(gs.jq, gs.jg, v0, 0x63D3C206);
    }

    static void gl(String arg4, boolean arg5) {
        ah v0 = client.al.aba(0x55BBCCF6).bh(0x758C77C4);
        int v1 = 20;
        if(v0 != null) {
            if(v1 != hq.cm * 0x560681D4) {
                hq.cm = 0xE8F06744;
                v0.aw(0x3F91C114);
            }

            aa v0_1 = v0.ay(1105510614);
            if(v0_1 != null) {
                if(v0_1.ax(-92)) {
                    hp.ea.ax(arg4, 0x71386685);
                    goto label_33;
                }

                hp.ea.al(arg4, arg5, 0x6ACE7282);
                goto label_33;
            }

            return;
        }
        else {
            hp.ea.al(arg4, arg5, 1665050234);
        }

    label_33:
        hq.cm = 0xCA7E70BA;
        ew.bc(false, 1040505949);
        dc.ay(v1, -43);
    }

    static void gm(int arg1) {
        hq.cm = 0x89751516;
        hq.ch = arg1 * -1719607703;
    }

    static void gn() {
        dc.ay(10, -49);
        hq.cm = 0x53F385D0;
        String v0 = hq.dv == null || (hq.dv.isEmpty()) ? gs.ju : String.format(gs.jo, hq.dv);
        ax.bf(gs.jq, gs.jg, v0, 0x63D3C206);
    }

    static void gr() {
        hq.cm = 2112702648;
        ax.bf(gs.lp, gs.lh, gs.ly, 0x63D3C206);
    }

    static void gs() {
        dc.ay(10, -103);
        hq.cm = 0x53F385D0;
        String v0 = hq.dv == null || (hq.dv.isEmpty()) ? gs.ju : String.format(gs.jo, hq.dv);
        ax.bf(gs.jq, gs.jg, v0, 0x63D3C206);
    }

    static void gu(String arg4, boolean arg5) {
        ah v0 = client.al.aba(0x8F65F860).bh(0x6D46D367);
        int v1 = 20;
        if(v0 != null) {
            if(v1 != hq.cm * 0xF7EE5BF5) {
                hq.cm = 0xE8F06744;
                v0.aw(0x3F91C114);
            }

            aa v0_1 = v0.ay(0x89464A7F);
            if(v0_1 != null) {
                if(v0_1.ax(-26)) {
                    hp.ea.ax(arg4, 0x71386685);
                    goto label_33;
                }

                hp.ea.al(arg4, arg5, 0x7F8527D3);
                goto label_33;
            }

            return;
        }
        else {
            hp.ea.al(arg4, arg5, 0x5F3D4EC5);
        }

    label_33:
        hq.cm = 0xCA7E70BA;
        ew.bc(false, 0x34277A0);
        dc.ay(v1, -53);
    }

    static void gx() {
        hq.cm = 230533463;
        ax.bf(gs.lm, gs.lr, gs.lz, 0x63D3C206);
    }

    static void gy() {
        hq.cm = 2112702648;
        ax.bf(gs.lm, gs.lr, gs.lz, 0x63D3C206);
    }
}

