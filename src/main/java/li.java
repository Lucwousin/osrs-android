public class li {
    static ef aa = null;
    static jn ab = null;
    public static final li ae = null;
    public static final int af = 30;
    String aj;
    public static final li al = null;
    public static final li an = null;
    public static final li ap = null;
    static int aq = 0;
    public static final li ar = null;
    public static final li ax = null;
    static final int bj = 5;
    static final int bn = 1;
    public static final int cc = 1009;
    public static final int cn = 90;
    static hu rg;
    static ef tf;

    static {
        li.ax = new li("p11_full");
        li.al = new li("p12_full");
        li.ae = new li("b12_full");
        li.ar = new li("verdana_11pt_regular");
        li.an = new li("verdana_13pt_regular");
        li.ap = new li("verdana_15pt_regular");
    }

    li(String arg3) {
        try {
            super();
            this.aj = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("li.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void ae(int arg7, int arg8, int arg9, int arg10, int arg11) {
        for(arg11 = arg8; true; ++arg11) {
            int v0 = arg10 + arg8;
            if(arg11 > v0) {
                return;
            }

            int v1;
            for(v1 = arg7; true; ++v1) {
                int v2 = arg9 + arg7;
                if(v1 > v2) {
                    break;
                }

                if(v1 >= 0) {
                    int v3 = 104;
                    if(v1 < v3 && arg11 >= 0 && arg11 < v3) {
                        try {
                            nt.ad[0][v1][arg11] = 0x7F;
                            if(arg7 == v1 && v1 > 0) {
                                id.ax[0][v1][arg11] = id.ax[0][v1 - 1][arg11];
                            }

                            v3 = 103;
                            if(v1 == v2 && v1 < v3) {
                                id.ax[0][v1][arg11] = id.ax[0][v1 + 1][arg11];
                            }

                            if(arg11 == arg8 && arg11 > 0) {
                                id.ax[0][v1][arg11] = id.ax[0][v1][arg11 - 1];
                            }

                            if(v0 != arg11) {
                                goto label_73;
                            }

                            if(arg11 >= v3) {
                                goto label_73;
                            }

                            id.ax[0][v1][arg11] = id.ax[0][v1][arg11 + 1];
                        }
                        catch(RuntimeException v7) {
                            StringBuilder v8 = new StringBuilder();
                            v8.append("li.ae(");
                            v8.append(')');
                            throw lx.al(((Throwable)v7), v8.toString());
                        }
                    }
                }

            label_73:
            }
        }
    }

    public static li[] ae() {
        return new li[]{li.ap, li.ar, li.al, li.ae, li.an, li.ax};
    }

    public static li[] al() {
        return new li[]{li.ap, li.ar, li.al, li.ae, li.an, li.ax};
    }

    static void ar(ki arg7, int arg8, int arg9) {
        try {
            if(ih.as != null) {
                ih.as.ar = arg8 * 0x7F567518 - 0x3069F6D1;
                arg7.da(ih.as.ac(74), ih.as.ac(0x70), 57);
                return;
            }

            ia.an(null, 0xFF, 0xFF, 0, 0, true, 0x260C9B1C);
            km.ak[arg8] = arg7;
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("li.ar(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public static li[] ar() {
        return new li[]{li.ap, li.ar, li.al, li.ae, li.an, li.ax};
    }

    public static li[] ax(byte arg2) {
        int v2 = 6;
        try {
            li[] v2_2 = new li[v2];
            v2_2[0] = li.ap;
            v2_2[1] = li.ar;
            v2_2[2] = li.al;
            v2_2[3] = li.ae;
            v2_2[4] = li.an;
            v2_2[5] = li.ax;
            return v2_2;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("li.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    static final void ay(bt arg13, int arg14) {
        try {
            if(bc.ap) {
                return;
            }

            arg14 = bg.bd;
            int v0 = bg.ba;
            int v1 = bg.bf;
            int v2 = bg.bn;
            int v5 = (bc.ar * 0xB0766F17 - arg13.bw * 1126407459) * 50 / (arg13.bp * 574766503);
            int v7 = (bc.an * 1709601659 - arg13.bo * 0xF7F729AF) * 50 / (arg13.bp * 574766503);
            int v11 = (bc.ar * 0xB0766F17 - arg13.bw * 1126407459) * 3500 / (arg13.bp * 574766503);
            int v6 = (bc.an * 1709601659 - arg13.bo * 0xF7F729AF) * 3500 / (arg13.bp * 574766503);
            int v8 = jz.bj(v7, 50, v0, arg14, 0x30);
            int v3 = if.bu(v7, 50, v0, arg14, -320147500);
            int v13_1 = jz.bj(v6, 3500, v0, arg14, 0x30);
            arg14 = if.bu(v6, 3500, v0, arg14, 0x6E5ACD2F);
            v0 = fq.bk(v5, v3, v2, v1, 0x17C619A9);
            v3 = bf.bm(v5, v3, v2, v1, -1591082004);
            v5 = fq.bk(v11, arg14, v2, v1, 0xF9FB699);
            arg14 = bf.bm(v11, arg14, v2, v1, -1591082004);
            bc.aj = (v0 + v5) / 2 * -1034352603;
            lr.ad = (v8 + v13_1) / 2 * 0x795FE1D5;
            pg.aq = (v3 + arg14) / 2 * 0x1110E9D;
            ak.ab = (v5 - v0) / 2 * 0x812E083;
            ai.af = (v13_1 - v8) / 2 * -322205267;
            bd.ai = (arg14 - v3) / 2 * 0x3032FFA7;
            io.av = Math.abs(ak.ab * 0x6F746E2B) * 0xA3C5F5A1;
            he.aa = Math.abs(ai.af * 0x3140C225) * 0xB150A979;
            bt.au = Math.abs(bd.ai * 1012774935) * 0x4FDBA5D1;
            return;
        }
        catch(RuntimeException v13) {
            StringBuilder v14 = new StringBuilder();
            v14.append("li.ay(");
            v14.append(')');
            throw lx.al(((Throwable)v13), v14.toString());
        }
    }

    static void fi(int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        na v6;
        arg7 = 0xE0F51F98;
        try {
            ar v7 = eh.ae(arg3, arg4, arg7);
            if(v7 == null) {
                return;
            }

            if(v7.eo != null) {
                iw v0 = new iw();
                v0.ae = v7;
                v0.ap = 1406718737 * arg2;
                v0.ab = arg6;
                v0.ax = v7.eo;
                bv.ax(v0, 0x8BF569CB);
            }

            boolean v0_1 = v7.ao * 0xD2D07C71 > 0 ? gl.hs(v7, 0xDFBAAB5E) : true;
            if(!v0_1) {
                return;
            }

            if(!fl.al(ib.il(v7, -1600625838), arg2 - 1, 0x52AE9C0F)) {
                return;
            }

            arg7 = 0x79EF67B1;
            if(arg2 == 1) {
                v6 = cd.al(nf.av, client.eh.an, 0x837E5FA9);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x54504798);
                v6.ae.an(arg5, 0x12FE19A7);
                client.eh.ae(v6, 160376780);
            }

            if(2 == arg2) {
                v6 = cd.al(nf.ah, client.eh.an, 0x98E468AF);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0xD9A6E0D6);
                v6.ae.an(arg5, 0xD715892D);
                client.eh.ae(v6, 0xFEB5B68C);
            }

            if(arg2 == 3) {
                v6 = cd.al(nf.dl, client.eh.an, -2006006527);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x2656FAD2);
                v6.ae.an(arg5, 0xFD57A342);
                client.eh.ae(v6, 0x8A55D350);
            }

            if(arg2 == 4) {
                v6 = cd.al(nf.bf, client.eh.an, -1741809229);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x8ACD074F);
                v6.ae.an(arg5, -869886590);
                client.eh.ae(v6, 0xE6830A27);
            }

            if(5 == arg2) {
                v6 = cd.al(nf.ac, client.eh.an, 0x80BA7EE0);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0xDC7BC985);
                v6.ae.an(arg5, 0xFA0AB228);
                client.eh.ae(v6, 0x593D377B);
            }

            if(6 == arg2) {
                v6 = cd.al(nf.br, client.eh.an, -1888005478);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x5E4954B7);
                v6.ae.an(arg5, 0xFA587924);
                client.eh.ae(v6, 405965368);
            }

            if(7 == arg2) {
                v6 = cd.al(nf.as, client.eh.an, 0x8DE1C26B);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x530363C2);
                v6.ae.an(arg5, 0xB0542221);
                client.eh.ae(v6, 0x33984EB7);
            }

            if(8 == arg2) {
                v6 = cd.al(nf.bq, client.eh.an, 0x85FF5F29);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0xE05799A9);
                v6.ae.an(arg5, 0xAF89B79E);
                client.eh.ae(v6, 548606840);
            }

            if(arg2 == 9) {
                v6 = cd.al(nf.dc, client.eh.an, 0x8D7BB384);
                v6.ae.aj(arg3, arg7);
                v6.ae.an(arg4, 0x4A053B29);
                v6.ae.an(arg5, 0x4A71D2FD);
                client.eh.ae(v6, 0x5C4CEDC6);
            }

            if(arg2 == 10) {
                na v2_1 = cd.al(nf.db, client.eh.an, -2099379106);
                v2_1.ae.aj(arg3, arg7);
                v2_1.ae.an(arg4, 0x28C6F14A);
                v2_1.ae.an(arg5, 0x6FEC098F);
                client.eh.ae(v2_1, 0xB6966181);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("li.fi(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

