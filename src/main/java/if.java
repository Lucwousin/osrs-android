public class if extends mx {
    boolean ae;
    int al;
    public static final String am = "fhtagn";
    public static final int av = 57;
    int ax;

    if() {
        try {
            super();
            this.ae = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("if.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ae(ko arg16, ko arg17, boolean arg18, int arg19, fa arg20, int arg21) {
        ko v0 = arg17;
        boolean v1 = arg18;
        int v2 = arg19;
        int v4 = 0xE53F385D;
        if(4 == v2) {
            int v3 = -2026865106;
            try {
                fj.ao(v3).at(0xBBF55601);
                hq.cm = v2 * v4;
            label_12:
                if(eo.aq) {
                    return;
                }

                dt.bu.bj(0x50951DF0);
                client.al.acx(hq.fz, 0x513E3E5F);
                byte v5 = 2;
                client.al.aba(0x91032B88).ba(false, v5);
                hq.fz.ax = client.al.au ^ 1;
                if(v2 == 0) {
                    ht.ah(v1, 0xB940380D);
                }
                else {
                    hq.cm = v2 * v4;
                }

                arg20.al(8);
                ox.ag = ah.ax(arg16.as("titlewide.jpg", "", 0x2E102EE7), 0);
                hq.ah = ox.ag.ax();
                gn.at = (0x20000000 & client.ar * 0x407F0DE1) != 0 ? aa.aq(v0, "logo_deadman_mode", "", -14) : aa.aq(v0, "logo_osrs", "", -51);
                hq.af = aa.aq(v0, "titlebox", "", -41);
                fj.az = hq.af.ar * 0xE6222AD3;
                in.ai = aa.aq(v0, "titlebutton", "", -90);
                hq.av = aa.aq(v0, "titlebutton_large", "", -34);
                li.aa = aa.aq(v0, "play_now_text", "", -86);
                hq.au = aa.aq(v0, "titlebutton_wide42,1", "", -19);
                eh.am = dl.ad(v0, "login_icons", "", 0x6E0C0A57);
                ax.ay = dl.ad(v0, "title_mute", "", 0x6E0C0A57);
                bz.aw = aa.aq(v0, "options_radio_buttons,0", "", -96);
                dx.ao = aa.aq(v0, "options_radio_buttons,4", "", -36);
                oa.as = aa.aq(v0, "options_radio_buttons,2", "", -6);
                bc.ak = aa.aq(v0, "options_radio_buttons,6", "", -83);
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
                    as.ap(2, gn.dv, "scape main", "", 0xFF, false, 0xC46FEA4B);
                }
                else {
                    jj.ad(v5, 0x4860199C);
                }

                md.al(false, 0xFF00FF00);
                eo.aq = true;
                hq.ab = (dq.tv * 0xD9CC4AFD - 0x2FD) / v5 * 0x8DFA78EB;
                hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
                bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
                return;
            }
            catch(RuntimeException v0_1) {
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("if.ae(");
                v1_1.append(')');
                throw lx.al(((Throwable)v0_1), v1_1.toString());
            }
        }

        goto label_12;
    }

    static final int bu(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    public static final int et(int arg2) {
        try {
            return client.ke * 0xE8408B37;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("if.et(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final void hp(String arg3, int arg4) {
        try {
            if(ai.oq == null) {
                return;
            }

            na v4 = cd.al(nf.dp, client.eh.an, -2097830978);
            v4.ae.ar(ki.af(arg3, 0x73), 0x3F);
            v4.ae.ai(arg3, -73);
            client.eh.ae(v4, 0x5A2A767A);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("if.hp(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }
}

