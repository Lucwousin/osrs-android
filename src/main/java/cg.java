public abstract class cg {
    int ae;
    public final af al;
    int ar;
    public final af ax;

    cg(af arg2, af arg3) {
        try {
            super();
            this.al = arg2;
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cg.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    abstract int aa();

    public abstract int ab();

    boolean ad(int arg6, int arg7, int arg8) {
        byte v8 = 90;
        try {
            cn v8_1 = this.ae(v8);
            if(v8_1 == null) {
                return 0;
            }

            int v2 = 0x307BE153;
            int v4 = 0xB7DBFCE3;
            if(arg6 >= this.ae * v2 - v8_1.al * v4 / 2) {
                if(arg6 > v8_1.al * v4 / 2 + this.ae * v2) {
                }
                else {
                    int v1 = 0x106821F3;
                    if(arg7 >= this.ar * v1) {
                        if(arg7 <= v8_1.ae * 0xC4C715CF + this.ar * v1) {
                            return 1;
                        }

                        return 0;
                    }
                }
            }

            return 0;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("cg.ad(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        return 0;
    }

    abstract cn ae(byte arg1);

    abstract cn af();

    boolean ag() {
        boolean v0 = this.al(-23) >= 0 ? true : false;
        return v0;
    }

    boolean ah() {
        boolean v0 = this.al(-15) >= 0 ? true : false;
        return v0;
    }

    abstract int ai();

    boolean aj(int arg7, int arg8, int arg9) {
        arg9 = 1023204699;
        try {
            if(!this.ap(arg9)) {
                return 0;
            }

            da v9 = ae.al(this.al(-115), 16);
            int v1 = this.ar(0xAF8BB4C9);
            int v2 = this.an(0xD47FECA9);
            int v4 = 0x307BE153;
            switch(v9.ah.ar * 0x3F9DA0CB) {
                case 0: {
                    if(arg7 > this.ae * v4 - v1 && arg7 <= this.ae * v4) {
                        goto label_47;
                    }

                    return 0;
                }
                case 1: {
                    if(arg7 >= this.ae * v4 && arg7 < v1 + this.ae * v4) {
                        goto label_47;
                    }

                    return 0;
                }
                case 2: {
                    if(arg7 >= this.ae * v4 - v1 / 2 && arg7 <= this.ae * v4 + v1 / 2) {
                        goto label_47;
                    }

                    return 0;
                }
                default: {
                    break;
                }
            }

        label_47:
            arg7 = v9.at.ar;
            arg9 = 0x106821F3;
            switch(arg7 * -1092861077) {
                case 0: {
                    if(arg8 >= this.ar * arg9 && arg8 < this.ar * arg9 + v2) {
                        return 1;
                    }

                    return 0;
                }
                case 1: {
                    try {
                        if(arg8 >= this.ar * arg9 - v2 / 2 && arg8 <= this.ar * arg9 + v2 / 2) {
                            return 1;
                        }

                        return 0;
                    }
                    catch(RuntimeException v7) {
                        goto label_85;
                    }
                }
                case 2: {
                    if(arg8 > this.ar * arg9 - v2 && arg8 <= this.ar * arg9) {
                        return 1;
                    }

                    return 0;
                }
                default: {
                    return 1;
                }
            }
        }
        catch(RuntimeException v7) {
            goto label_85;
        }

        return 1;
    label_85:
        StringBuilder v8 = new StringBuilder();
        v8.append("cg.aj(");
        v8.append(')');
        throw lx.al(((Throwable)v7), v8.toString());
    }

    public abstract int al(byte arg1);

    abstract int am();

    abstract int an(int arg1);

    boolean ap(int arg3) {
        byte v3 = 24;
        try {
            if(this.al(v3) < 0) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cg.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }

        boolean v3_2 = true;
        return v3_2;
    }

    public abstract int aq();

    public static int ar(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if((arg6 & 1) == 1) {
            int v0 = arg5;
            arg5 = arg4;
            arg4 = v0;
        }

        arg3 &= 3;
        if(arg3 == 0) {
            return arg2;
        }

        if(1 == arg3) {
            return 7 - arg1 - (arg4 - 1);
        }

        if(arg3 == 2) {
            return 7 - arg2 - (arg5 - 1);
        }

        return arg1;
    }

    abstract int ar(int arg1);

    abstract int au();

    abstract int av();

    boolean ax(int arg2, int arg3, int arg4) {
        arg4 = 563502609;
        try {
            if(this.aj(arg2, arg3, arg4)) {
                return 1;
            }

            if(!this.ad(arg2, arg3, 0x49C64D7B)) {
                return 0;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cg.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 1;
    }

    abstract int az();

    static void bt(int arg11) {
        int v4;
        long v0 = 0x6FC81C2D4C92025BL;
        try {
            client.bs = v0;
            fq.ut = true;
            client.ca = true;
            client.ox = -1982012566750626467L;
            dj.ax(1998341270);
            client.eh.ax(904514168);
            int v1 = 0;
            client.eh.ap.ar = 0;
            nn v2 = null;
            client.eh.aj = v2;
            client.eh.ai = v2;
            client.eh.av = v2;
            client.eh.aa = v2;
            client.eh.ad = 0;
            client.eh.ab = 0;
            hp.ea.aq(1);
            client.cd = 0;
            client.ei = 0;
            client.cx = 0;
            fh.kf.bs(-1200754068);
            ex.bi = ji.ax(0x2076E2C1) * 0x12C4CD9D55397DCBL;
            dt.bu.ar(-1094984487);
            ll.aj(0xB0250978);
            client.kc = 0;
            fh.kf.at(false, -95);
            client.pd = 0;
            client.ht = 0;
            client.hr = 0;
            dx.rj = ((nb)v2);
            client.pw = 0;
            client.om = -1668940003;
            client.oc = 0;
            client.oj = 0;
            fh.kf.cd(fr.ar, 0x150EFC6B);
            fh.kf.cf(fr.ar, 0xFAF4D887);
            client.eg = 0;
            en.aq(862069463);
            int v0_1;
            for(v0_1 = 0; v0_1 < 0x800; ++v0_1) {
                client.jf[v0_1] = ((hw)v2);
            }

            for(v0_1 = 0; v0_1 < 0x8000; ++v0_1) {
                client.ev[v0_1] = ((ii)v2);
            }

            client.ke = -507845255;
            client.kg.ax();
            client.kq.ax();
            for(v0_1 = 0; v0_1 < 4; ++v0_1) {
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 104;
                    if(v3 >= v4) {
                        break;
                    }

                    int v5;
                    for(v5 = 0; v5 < v4; ++v5) {
                        client.ka[v0_1][v3][v5] = ((fi)v2);
                    }
                }
            }

            client.kw = new fi();
            ds.rq.an(1669768907);
            for(v0_1 = 0; v0_1 < dq.al * -2051630437; ++v0_1) {
                if(id.al(v0_1, 3607) != null) {
                    an.al[v0_1] = 0;
                    an.ae[v0_1] = 0;
                }
            }

            gg.ml.aj(2);
            client.lg = 112770721;
            v4 = 0xD233AC37;
            if(-1 != client.kt * v4) {
                lz.an(client.kt * v4, 0x8614B610);
            }

            mx v0_2;
            for(v0_2 = client.ky.ae(); v0_2 != null; v0_2 = client.ky.ar()) {
                lb.hf(((if)v0_2), true, 10521);
            }

            client.kt = 0x1AC03679;
            v3 = 8;
            client.ky = new oh(v3);
            client.lp = ((ar)v2);
            fh.kf.bs(-2083947478);
            client.rf.ax(null, new int[]{0, 0, 0, 0, 0}, false, -1, 0x3EDE6D0F);
            fh.kf.aa(707237033);
            cz.aj(-2044600709);
            client.bm = true;
            for(v0_1 = 0; v0_1 < 100; ++v0_1) {
                client.np[v0_1] = true;
            }

            ak.cv(70);
            ai.oq = ((em)v2);
            while(v1 < v3) {
                client.rn[v1] = new nk();
                ++v1;
            }

            js.rl = ((nm)v2);
            ah v11_1 = ey.up.bh(2090579297);
            if(v11_1 != null) {
                na v0_3 = cd.al(nf.ay, client.eh.an, 0x89C03A94);
                v0_3.ae.ab(v11_1.bj(1304812425), -984826401);
                v0_3.ae.ab(v11_1.bm(0x6B5D8F62), -984826401);
                client.eh.ae(v0_3, 0x2A932295);
            }
        }
        catch(RuntimeException v11) {
            goto label_217;
        }

        return;
    label_217:
        StringBuilder v0_4 = new StringBuilder();
        v0_4.append("cg.bt(");
        v0_4.append(')');
        throw lx.al(((Throwable)v11), v0_4.toString());
    }
}

