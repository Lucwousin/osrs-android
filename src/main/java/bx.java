public class bx {
    int ae;
    int al;
    int ar;
    int ax;
    public static final int az = 33;
    public static final int bn = 36;
    static final int pf = 2;

    bx() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bx.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    bx(bx arg3) {
        try {
            super();
            this.ax = arg3.ax;
            this.al = arg3.al;
            this.ae = arg3.ae;
            this.ar = arg3.ar;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bx.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static di al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = di.al.ax(v0);
            if(v5 != null) {
                return ((di)v5);
            }

            byte[] v4_1 = di.ax.ae(14, arg4, 0x78DC0DC9);
            di v5_1 = new di();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 0xE135E890);
            }

            di.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("bx.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    static int av(int arg2, hl arg3, boolean arg4, int arg5) {
        int v4;
        int[] v2_1;
        if(arg4) {
            try {
                ar v3 = il.aa;
                goto label_4;
            label_3:
                v3 = dw.av;
            label_4:
                arg5 = 1304812425;
                int v0 = 0x4A90AB9;
                if(1500 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * arg5 - 1] = v3.bw * 0xAFCF1FA3;
                    return 1;
                }

                if(1501 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * arg5 - 1] = v3.bo * 0xA8B630B5;
                    return 1;
                }

                if(arg2 == 1502) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * arg5 - 1] = v3.by * 0x1804E4A5;
                    return 1;
                }

                if(arg2 == 0x5DF) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * arg5 - 1] = v3.bt * 0x6F0D2CD;
                    return 1;
                }

                if(arg2 == 0x5E0) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * arg5 - 1] = v3.bg;
                    return 1;
                }

                if(arg2 != 1505) {
                    return 2;
                }

                v2_1 = il.aj;
                v4 = il.ad + v0;
                il.ad = v4;
                v2_1[v4 * arg5 - 1] = v3.bx * 0xBA6F66AD;
                return 1;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("bx.av(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
        else {
            goto label_3;
        }

        goto label_4;
        return 2;
    }

    static final void ey(byte arg32) {
        int v14_1;
        int v13;
        int v15;
        int v5_1;
        byte v4_1;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v0 = 1408970391;
        try {
            dn.em(false, v0);
            client.fx = 0;
            int v3 = 0;
            int v4 = 1;
            while(true) {
                v6 = -1;
                if(v3 >= ce.fj.length) {
                    break;
                }

                if(v6 != fp.fw[v3] && ce.fj[v3] == null) {
                    ce.fj[v3] = ks.co.ae(fp.fw[v3], 0, 0x78DC0DC9);
                    if(ce.fj[v3] == null) {
                        client.fx += 0xA3F53C81;
                        v4 = 0;
                    }
                }

                if(hq.ft[v3] != v6 && kd.fg[v3] == null) {
                    kd.fg[v3] = ks.co.ar(hq.ft[v3], 0, du.fr[v3], -67);
                    if(kd.fg[v3] == null) {
                        client.fx += 0xA3F53C81;
                        v4 = 0;
                    }
                }

                ++v3;
            }

            if(v4 == 0) {
                client.fq = 0x89F587D5;
                return;
            }

            client.fm = 0;
            v3 = 0;
            v4 = 1;
            while(true) {
                v7 = 0x519F9BE7;
                v8 = 474770003;
                v9 = 0x40;
                v10 = 8;
                if(v3 >= ce.fj.length) {
                    break;
                }

                byte[] v5 = kd.fg[v3];
                if(v5 != null) {
                    v10 = (dj.fp[v3] >> 8) * 0x40 - ad.fi * v8;
                    v8 = (dj.fp[v3] & 0xFF) * 0x40 - nr.fo * v7;
                    if(client.gm) {
                        v10 = 10;
                        v8 = 10;
                    }

                    v4 &= dt.ad(v5, v10, v8, 0x8B95CF13);
                }

                ++v3;
            }

            if(v4 == 0) {
                client.fq = 0x13EB0FAA;
                return;
            }

            if(client.fq * 1405450621 != 0) {
                client.al.uu.ad(0x4B34FCEB);
                eq.dh(gs.ai + jc.aj + jc.ar + 100 + "%" + jc.an, true, 0xB7B9BB0C);
            }

            cw.bu(-1498193060);
            ee.fs.ax();
            for(v3 = 0; true; ++v3) {
                v4_1 = 4;
                if(v3 >= v4_1) {
                    break;
                }

                client.gg[v3].ax(-400581187);
            }

            for(v3 = 0; true; ++v3) {
                v5_1 = 104;
                if(v3 >= v4_1) {
                    break;
                }

                int v11;
                for(v11 = 0; v11 < v5_1; ++v11) {
                    int v12;
                    for(v12 = 0; v12 < v5_1; ++v12) {
                        id.al[v3][v11][v12] = 0;
                    }
                }
            }

            cw.bu(0x5B3362F);
            bj.ax(1458014233);
            v3 = ce.fj.length;
            de.ax(0x87E360C7);
            dn.em(true, v0);
            if(!client.gm) {
                for(v11 = 0; v11 < v3; ++v11) {
                    v15 = (dj.fp[v11] >> v10) * 0x40 - ad.fi * v8;
                    int v16 = (dj.fp[v11] & 0xFF) * 0x40 - nr.fo * v7;
                    byte[] v14 = ce.fj[v11];
                    if(v14 != null) {
                        cw.bu(-1038265545);
                        aa.ar(v14, v15, v16, ho.fu * -170369416 - 0x30, dl.fb * 0x3B7FAD28 - 0x30, client.gg, -74);
                    }
                }

                for(v11 = 0; v11 < v3; ++v11) {
                    v12 = (dj.fp[v11] >> v10) * 0x40 - ad.fi * v8;
                    v13 = (dj.fp[v11] & 0xFF) * 0x40 - nr.fo * v7;
                    if(ce.fj[v11] == null && dl.fb * 0x676FF5A5 < 800) {
                        cw.bu(204851565);
                        li.ae(v12, v13, v9, v9, 0x59416BE4);
                    }
                }

                dn.em(true, v0);
                for(v11 = 0; v11 < v3; ++v11) {
                    byte[] v13_1 = kd.fg[v11];
                    if(v13_1 != null) {
                        v14_1 = (dj.fp[v11] >> v10) * 0x40 - ad.fi * v8;
                        v15 = (dj.fp[v11] & 0xFF) * 0x40 - nr.fo * v7;
                        cw.bu(0x3A5C360D);
                        je.aq(v13_1, v14_1, v15, ee.fs, client.gg, -1503080722);
                    }
                }
            }

            if(client.gm) {
                for(v3 = 0; true; ++v3) {
                    v7 = 13;
                    if(v3 >= v4_1) {
                        break;
                    }

                    cw.bu(0xD8322E73);
                    for(v8 = 0; v8 < v7; ++v8) {
                        for(v9 = 0; v9 < v7; ++v9) {
                            v11 = client.gc[v3][v8][v9];
                            if(v11 != v6) {
                                v15 = v11 >> 24 & 3;
                                int v18 = v11 >> 1 & 3;
                                v12 = v11 >> 14 & 0x3FF;
                                v11 = v11 >> 3 & 0x7FF;
                                v13 = (v12 / 8 << v10) + v11 / 8;
                                v14_1 = 0;
                                while(true) {
                                    if(v14_1 < dj.fp.length) {
                                        if(v13 == dj.fp[v14_1] && ce.fj[v14_1] != null) {
                                            hg.an(ce.fj[v14_1], v3, v8 * 8, v9 * 8, v15, (v12 & 7) * 8, (v11 & 7) * 8, v18, client.gg, 0x7F03003B);
                                            v5_1 = 1;
                                            break;
                                        }

                                        ++v14_1;
                                        continue;
                                    }
                                    else {
                                        goto label_314;
                                    }
                                }
                            }
                            else {
                            label_314:
                                v5_1 = 0;
                            }

                            if(v5_1 == 0) {
                                cz.ap(v3, v8 * 8, v9 * 8, 0xB35F9CA5);
                            }
                        }
                    }
                }

                for(v3 = 0; v3 < v7; ++v3) {
                    for(v5_1 = 0; v5_1 < v7; ++v5_1) {
                        if(v6 == client.gc[0][v3][v5_1]) {
                            li.ae(v3 * 8, v5_1 * 8, v10, v10, 0x59416BE4);
                        }
                    }
                }

                dn.em(true, v0);
                for(v3 = 0; v3 < v4_1; ++v3) {
                    cw.bu(-2098242205);
                    for(v5_1 = 0; v5_1 < v7; ++v5_1) {
                        for(v8 = 0; v8 < v7; ++v8) {
                            v9 = client.gc[v3][v5_1][v8];
                            if(v6 != v9) {
                                int v25 = v9 >> 24 & 3;
                                int v28 = v9 >> 1 & 3;
                                v11 = v9 >> 14 & 0x3FF;
                                v9 = v9 >> 3 & 0x7FF;
                                v12 = v9 / 8 + (v11 / 8 << v10);
                                for(v13 = 0; v13 < dj.fp.length; ++v13) {
                                    if(v12 == dj.fp[v13] && kd.fg[v13] != null) {
                                        ec.ab(kd.fg[v13], v3, v5_1 * 8, v8 * 8, v25, (v11 & 7) * 8, (v9 & 7) * 8, v28, ee.fs, client.gg, 1916520314);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            dn.em(true, v0);
            cw.bu(0x4BF61C48);
            ex.ai(ee.fs, client.gg, 80);
            dn.em(true, v0);
            v0 = id.ae * 0x61C2FDFD;
            if(v0 > kt.jz * 1101813865) {
                v0 = kt.jz * 1101813865;
            }

            if(v0 < kt.jz * 1101813865 - 1) {
            }

            if(client.ab) {
                ee.fs.al(id.ae * 0x61C2FDFD);
            }
            else {
                ee.fs.al(0);
            }

            v0 = 0;
            int v2 = 104;
            while(v0 < v2) {
                for(v3 = 0; v3 < v2; ++v3) {
                    dm.eb(v0, v3, 0x804BDF6B);
                }

                ++v0;
            }

            cw.bu(36901412);
            gp.eu(-9);
            do.an.ar();
            if(client.al.adn(0x2F)) {
                na v0_2 = cd.al(nf.ab, client.eh.an, 0x9287909D);
                v0_2.ae.aj(0x3F008EDD, 0x79EF67B1);
                client.eh.ae(v0_2, 370264779);
            }

            if(!client.gm) {
                v0 = (ho.fu * 0xFEBB0BCF - 6) / v10;
                int v1 = (ho.fu * 0xFEBB0BCF + 6) / v10;
                v3 = (dl.fb * 0x676FF5A5 - 6) / v10;
                v5_1 = (dl.fb * 0x676FF5A5 + 6) / v10;
                for(v2 = v0 - 1; v2 <= v1 + 1; ++v2) {
                    for(v6 = v3 - 1; v6 <= v5_1 + 1; ++v6) {
                        if(v2 < v0 || v2 > v1 || v6 < v3 || v6 > v5_1) {
                            ki v7_1 = ks.co;
                            v7_1.bd("m" + v2 + "_" + v6, v4_1);
                            v7_1 = ks.co;
                            v7_1.bd("l" + v2 + "_" + v6, v4_1);
                        }
                        else {
                        }
                    }
                }
            }

            dc.ay(30, -110);
            cw.bu(0x807A8ABB);
            cf.al(-106);
            client.eh.ae(cd.al(nf.de, client.eh.an, -1803207978), 0xD23D303);
            ko.adj(346700402);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("bx.ey(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }
}

