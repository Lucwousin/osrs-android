public class gq {
    oh ae;
    ko al;
    static final int ao = 30;
    oh ar;
    ko ax;

    public gq(ko arg3, ko arg4) {
        try {
            super();
            this.ae = new oh(0x100);
            this.ar = new oh(0x100);
            this.ax = arg3;
            this.al = arg4;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("gq.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public hs ab(int arg6, int[] arg7) {
        int v1 = 498702554;
        if(this.al.am(87) == 1) {
            return this.al(0, arg6, arg7, v1);
        }

        if(this.al.au(arg6, -689806439) == 1) {
            return this.al(arg6, 0, arg7, v1);
        }

        throw new RuntimeException();
    }

    public hs ad(int arg6, int[] arg7) {
        int v1 = 498702554;
        if(this.al.am(0x77) == 1) {
            return this.al(0, arg6, arg7, v1);
        }

        if(this.al.au(arg6, 0xC790D62E) == 1) {
            return this.al(arg6, 0, arg7, v1);
        }

        throw new RuntimeException();
    }

    public hs ae(int arg4, int[] arg5, int arg6) {
        try {
            if(this.ax.am(120) == 1) {
                return this.ax(0, arg4, arg5, 0x802ECB4C);
            }

            if(this.ax.au(arg4, 0x5963D4A0) == 1) {
                return this.ax(arg4, 0, arg5, 0x8086AD03);
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("gq.ae(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public hs af(int arg6, int[] arg7) {
        int v1 = 498702554;
        if(this.al.am(42) == 1) {
            return this.al(0, arg6, arg7, v1);
        }

        if(this.al.au(arg6, 0x4ECACC8) == 1) {
            return this.al(arg6, 0, arg7, v1);
        }

        throw new RuntimeException();
    }

    public hs ai(int arg6, int[] arg7) {
        int v1 = 498702554;
        if(this.al.am(0x70) == 1) {
            return this.al(0, arg6, arg7, v1);
        }

        if(this.al.au(arg6, 0xFE8CEBF2) == 1) {
            return this.al(arg6, 0, arg7, v1);
        }

        throw new RuntimeException();
    }

    public hs aj(int arg5, int[] arg6) {
        if(this.ax.am(24) == 1) {
            return this.ax(0, arg5, arg6, 0x8076CC90);
        }

        if(this.ax.au(arg5, 0x1F2F5068) == 1) {
            return this.ax(arg5, 0, arg6, 0x8035F51F);
        }

        throw new RuntimeException();
    }

    hs al(int arg5, int arg6, int[] arg7, int arg8) {
        gf v2_1;
        long v0 = (((long)((arg5 << 4 & 0xFFFF | arg5 >>> 12) ^ arg6 | arg5 << 16))) ^ 0x100000000L;
        try {
            mx v8 = this.ar.ax(v0);
            if(v8 != null) {
                return ((hs)v8);
            }

            hs v8_1 = null;
            if(arg7 != null && arg7[0] <= 0) {
                return v8_1;
            }

            mx v2 = this.ae.ax(v0);
            if(v2 == null) {
                v2_1 = gf.aq(this.al, arg5, arg6);
                if(v2_1 == null) {
                    return v8_1;
                }
                else {
                    this.ae.al(((mx)v2_1), v0);
                }
            }

            hs v5_1 = v2_1.ab(arg7);
            if(v5_1 == null) {
                return v8_1;
            }

            v2_1.lp();
            this.ar.al(((mx)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("gq.al(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    hs an(int arg6, int arg7, int[] arg8) {
        long v0 = ((long)((arg6 << 4 & 0xFFFF | arg6 >>> 12) ^ arg7 | arg6 << 16));
        mx v2 = this.ar.ax(v0);
        if(v2 != null) {
            return ((hs)v2);
        }

        hs v2_1 = null;
        if(arg8 != null && arg8[0] <= 0) {
            return v2_1;
        }

        hb v6 = hb.ax(this.ax, arg6, arg7);
        if(v6 == null) {
            return v2_1;
        }

        hs v6_1 = v6.al();
        this.ar.al(((mx)v6_1), v0);
        if(arg8 != null) {
            arg8[0] -= v6_1.ae.length;
        }

        return v6_1;
    }

    hs ap(int arg5, int arg6, int[] arg7) {
        gf v3_1;
        long v0 = (((long)((arg5 << 4 & 0xFFFF | arg5 >>> 12) ^ arg6 | arg5 << 16))) ^ 0x100000000L;
        mx v2 = this.ar.ax(v0);
        if(v2 != null) {
            return ((hs)v2);
        }

        hs v2_1 = null;
        if(arg7 != null && arg7[0] <= 0) {
            return v2_1;
        }

        mx v3 = this.ae.ax(v0);
        if(v3 == null) {
            v3_1 = gf.aq(this.al, arg5, arg6);
            if(v3_1 == null) {
                return v2_1;
            }
            else {
                this.ae.al(((mx)v3_1), v0);
            }
        }

        hs v5 = v3_1.ab(arg7);
        if(v5 == null) {
            return v2_1;
        }

        v3_1.lp();
        this.ar.al(((mx)v5), v0);
        return v5;
    }

    public hs aq(int arg6, int[] arg7) {
        int v1 = 498702554;
        if(this.al.am(103) == 1) {
            return this.al(0, arg6, arg7, v1);
        }

        if(this.al.au(arg6, 0x5C27856F) == 1) {
            return this.al(arg6, 0, arg7, v1);
        }

        throw new RuntimeException();
    }

    public hs ar(int arg5, int[] arg6, int arg7) {
        try {
            int v0 = 498702554;
            if(this.al.am(0x71) == 1) {
                return this.al(0, arg5, arg6, v0);
            }

            if(this.al.au(arg5, 0x6A401C3F) == 1) {
                return this.al(arg5, 0, arg6, v0);
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("gq.ar(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    hs ax(int arg5, int arg6, int[] arg7, int arg8) {
        hs v5_2;
        long v0 = ((long)((arg5 << 4 & 0xFFFF | arg5 >>> 12) ^ arg6 | arg5 << 16));
        try {
            mx v8 = this.ar.ax(v0);
            if(v8 != null) {
                return ((hs)v8);
            }

            hs v8_1 = null;
            if(arg7 != null && arg7[0] <= 0) {
                return v8_1;
            }

            hb v5_1 = hb.ax(this.ax, arg5, arg6);
            if(v5_1 == null) {
                return v8_1;
            }

            v5_2 = v5_1.al();
            this.ar.al(((mx)v5_2), v0);
            if(arg7 != null) {
                arg7[0] -= v5_2.ae.length;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("gq.ax(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return v5_2;
    }

    static int bg(int arg9, hl arg10, boolean arg11, byte arg12) {
        da v9_7;
        cg v9_6;
        boolean v3_1;
        pb v9_5;
        dh v10_3;
        af v9_4;
        int[] v10_2;
        String[] v9_3;
        dh v9_2;
        int v10;
        int[] v9_1;
        if(6600 != arg9) {
            goto label_32;
        }

        arg9 = 1101813865;
        try {
            dl.ab(1428075056).ai(kt.jz * arg9, ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7), nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7), true, 0x600);
            return 1;
        label_32:
            int v12 = 0xBC5CDEAD;
            int v0 = 0x8FA23525;
            int v1 = 0x4A90AB9;
            int v2 = 1304812425;
            if(arg9 == 6601) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                arg9 = v9_1[v10 * v2];
                String v10_1 = "";
                v9_2 = dl.ab(0x5DC71B99).bn(arg9, -837440492);
                if(v9_2 != null) {
                    v10_1 = v9_2.am(0x81021D9E);
                }

                v9_3 = il.aq;
                v1 = ft.ab + v0;
                ft.ab = v1;
                v9_3[v1 * v12 - 1] = v10_1;
                return 1;
            }

            if(6602 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                dl.ab(0x57767B85).av(v9_1[v10 * v2], 80);
                return 1;
            }

            if(6603 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(1917093475).bd(101);
                return 1;
            }

            if(6604 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                dl.ab(-2019072504).as(v9_1[v10 * v2], 0xF5FD0CB7);
                return 1;
            }

            int v3 = 0;
            if(6605 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v10 = v10 * v2 - 1;
                if(dl.ab(0x18B745EF).bf(0x5C9DB2CE)) {
                    v3 = 1;
                }

                v9_1[v10] = v3;
                return 1;
            }

            int v4 = 0xB230B0A5;
            int v5 = 0xAEACF223;
            if(arg9 == 6606) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                dl.ab(-15890350).bp(v9_4.al * v5, v9_4.ae * v4, 0x4B53F199);
                return 1;
            }

            if(arg9 == 6607) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                dl.ab(-745242057).bw(v9_4.al * v5, v9_4.ae * v4, 1);
                return 1;
            }

            int v6 = 400591065;
            if(6608 == arg9) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                dl.ab(-2050745964).bo(v9_4.ax * v6, v9_4.al * v5, v9_4.ae * v4, 0x13D1E031);
                return 1;
            }

            if(arg9 == 6609) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                dl.ab(-405019234).by(v9_4.ax * v6, v9_4.al * v5, v9_4.ae * v4, 0x8BA4232B);
                return 1;
            }

            if(6610 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(0x1ADBE72).bt(0x31D665C7);
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(0x487F3E37).bv(471063702);
                return 1;
            }

            if(arg9 == 6611) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_2 = dl.ab(0xCE42D2C9).bn(v9_1[v10 * v2], -1514100930);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.ac(287427031).ax(-405439990);
                }

                return 1;
            }

            int v7 = 0x999D058;
            if(arg9 == 6612) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_2 = dl.ab(0x96E0E41F).bn(v9_1[v10 * v2], 0x9DB0AC36);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = (v9_2.at(0x81828531) - v9_2.ah(v7) + 1) * 0x40;
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = (v9_2.aw(-2019943350) - v9_2.ay(0x82BA5DF3) + 1) * 0x40;
                }

                return 1;
            }

            if(6613 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_2 = dl.ab(0x7E688083).bn(v9_1[v10 * v2], -1652446077);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.ah(v7) * 0x40;
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.ay(-2109078698) * 0x40;
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.at(-477912040) * 0x40 + 0x40 - 1;
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.aw(0x80319876) * 0x40 + 0x40 - 1;
                }

                return 1;
            }

            v7 = -1;
            if(arg9 == 6614) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_2 = dl.ab(0xD8F034C2).bn(v9_1[v10 * v2], -1161870056);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.ag(0xD54EB40F);
                }

                return 1;
            }

            if(6615 == arg9) {
                v9_4 = dl.ab(0x28F07367).bq(0xA0AB0BE1);
                if(v9_4 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_4.al * v5;
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_4.ae * v4;
                }

                return 1;
            }

            if(6616 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(-2070908106).aa(43);
                return 1;
            }

            if(arg9 == 6617) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                v10_3 = dl.ab(2022570477).au(0x671B02A2);
                if(v10_3 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    return 1;
                }

                v9_1 = v10_3.ab(v9_4.ax * v6, v9_4.al * v5, v9_4.ae * v4, 0x9059F05B);
                if(v9_1 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_1[0];
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_1[1];
                }

                return 1;
            }

            if(6618 == arg9) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                v10_3 = dl.ab(0x2C6B5D85).au(0x17D59BF7);
                if(v10_3 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    return 1;
                }

                v9_4 = v10_3.af(v9_4.al * v5, v9_4.ae * v4, 0x2DDE9BF3);
                if(v9_4 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_4.ax(0x29A2A4FC);
                }

                return 1;
            }

            int v8 = 0x9521572;
            if(6619 == arg9) {
                il.ad -= v8;
                bv.bh(il.aj[il.ad * v2], new af(il.aj[il.ad * v2 + 1]), false, -602614082);
                return 1;
            }

            if(6620 == arg9) {
                il.ad -= v8;
                bv.bh(il.aj[il.ad * v2], new af(il.aj[il.ad * v2 + 1]), true, 1110789021);
                return 1;
            }

            if(arg9 == 6621) {
                il.ad -= v8;
                arg9 = il.aj[il.ad * v2];
                af v10_4 = new af(il.aj[il.ad * v2 + 1]);
                v9_2 = dl.ab(101344003).bn(arg9, -1982002514);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = 0;
                    return 1;
                }

                int[] v12_1 = il.aj;
                v0 = il.ad + v1;
                il.ad = v0;
                v0 = v0 * v2 - 1;
                if(v9_2.ad(v10_4.ax * v6, v10_4.al * v5, v10_4.ae * v4, -69)) {
                    v3 = 1;
                }

                v12_1[v0] = v3;
                return 1;
            }

            if(6622 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(0xF915C6FC).bx(1775819107);
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = dl.ab(0x944F68EA).bg(0x3A19DF91);
                return 1;
            }

            if(arg9 == 0x19DF) {
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_4 = new af(v10_2[v12 * v2]);
                v9_2 = dl.ab(0xFF81877E).af(v9_4.ax * v6, v9_4.al * v5, v9_4.ae * v4, 0x2F);
                if(v9_2 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_2.av(-1880437085);
                }

                return 1;
            }

            if(0x19E0 == arg9) {
                v9_5 = dl.ab(0xF67B78FD);
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_5.bz(v10_2[v12 * v2], -33);
                return 1;
            }

            if(arg9 == 6625) {
                dl.ab(0x981D0FD6).bh(-1724007599);
                return 1;
            }

            if(arg9 == 6626) {
                v9_5 = dl.ab(0xE5A0A886);
                v10_2 = il.aj;
                v12 = il.ad - v1;
                il.ad = v12;
                v9_5.bb(v10_2[v12 * v2], 0x34F6910F);
                return 1;
            }

            if(6627 == arg9) {
                dl.ab(0x8DB5F2FE).bc(0xB2EA8919);
                return 1;
            }

            if(6628 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                if(v9_1[v10 * v2] == 1) {
                    v3_1 = true;
                }

                dl.ab(0xD30C268A).bk(v3_1, 0xC34);
                return 1;
            }

            byte v4_1 = 16;
            if(arg9 == 6629) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                dl.ab(356037754).bm(v9_1[v10 * v2], v4_1);
                return 1;
            }

            if(6630 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                dl.ab(0xA200FA9B).bj(v9_1[v10 * v2], 15);
                return 1;
            }

            if(arg9 == 6631) {
                dl.ab(0x14BD2BA2).bu(400872117);
                return 1;
            }

            if(arg9 == 6632) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                if(v9_1[v10 * v2] == 1) {
                    v3_1 = true;
                }

                dl.ab(-978460502).bs(v3_1, 1380190150);
                return 1;
            }

            if(6633 == arg9) {
                il.ad -= v8;
                arg9 = il.aj[il.ad * v2];
                if(1 == il.aj[il.ad * v2 + 1]) {
                    v3_1 = true;
                }

                dl.ab(0xB5F3CBF0).be(arg9, v3_1, 36);
                return 1;
            }

            if(arg9 == 6634) {
                il.ad -= v8;
                arg9 = il.aj[il.ad * v2];
                if(il.aj[il.ad * v2 + 1] == 1) {
                    v3_1 = true;
                }

                dl.ab(-221048365).bl(arg9, v3_1, 1800235103);
                return 1;
            }

            if(6635 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v10 = v10 * v2 - 1;
                if(dl.ab(0x4AFD2258).br(650075440)) {
                    v3 = 1;
                }

                v9_1[v10] = v3;
                return 1;
            }

            if(arg9 == 6636) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                arg9 = v9_1[v10 * v2];
                v10_2 = il.aj;
                v12 = il.ad + v1;
                il.ad = v12;
                v12 = v12 * v2 - 1;
                if(dl.ab(0xA509CA31).bi(arg9, 1)) {
                    v3 = 1;
                }

                v10_2[v12] = v3;
                return 1;
            }

            if(arg9 == 6637) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                arg9 = v9_1[v10 * v2];
                v10_2 = il.aj;
                v12 = il.ad + v1;
                il.ad = v12;
                v10_2[v12 * v2 - 1] = dl.ab(0x31F9D78D).ca(arg9, -56);
                return 1;
            }

            if(arg9 == 6638) {
                il.ad -= v8;
                v9_4 = dl.ab(854350762).cf(il.aj[il.ad * v2], new af(il.aj[il.ad * v2 + 1]), -25);
                if(v9_4 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_4.ax(0xDCB55B50);
                }

                return 1;
            }

            if(0x19EF == arg9) {
                v9_6 = dl.ab(-130644129).cb(0xBFB3279A);
                if(v9_6 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_6.al(24);
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_6.ax.ax(0x5895691D);
                }

                return 1;
            }

            if(arg9 == 0x19F0) {
                v9_6 = dl.ab(0xEF7A9DC1).cy(1705391755);
                if(v9_6 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_6.al(0x3F);
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_6.ax.ax(0x9B1EE9D3);
                }

                return 1;
            }

            if(6693 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_7 = ae.al(v9_1[v10 * v2], v4_1);
                if(v9_7.ad == null) {
                    v9_3 = il.aq;
                    v10 = ft.ab + v0;
                    ft.ab = v10;
                    v9_3[v10 * v12 - 1] = "";
                }
                else {
                    String[] v10_5 = il.aq;
                    v1 = ft.ab + v0;
                    ft.ab = v1;
                    v10_5[v1 * v12 - 1] = v9_7.ad;
                }

                return 1;
            }

            if(arg9 == 6694) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_7 = ae.al(v9_1[v10 * v2], v4_1);
                v10_2 = il.aj;
                v12 = il.ad + v1;
                il.ad = v12;
                v10_2[v12 * v2 - 1] = v9_7.ab * 0xD6D0BF01;
                return 1;
            }

            if(arg9 == 6695) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_7 = ae.al(v9_1[v10 * v2], v4_1);
                if(v9_7 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_7.ao * 0x64537821;
                }

                return 1;
            }

            if(6696 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v1;
                il.ad = v10;
                v9_7 = ae.al(v9_1[v10 * v2], v4_1);
                if(v9_7 == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + v1;
                    il.ad = v10;
                    v9_1[v10 * v2 - 1] = v7;
                }
                else {
                    v10_2 = il.aj;
                    v12 = il.ad + v1;
                    il.ad = v12;
                    v10_2[v12 * v2 - 1] = v9_7.ap * 0x6FB9813D;
                }

                return 1;
            }

            if(6697 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = jc.az.ax * 1401097027;
                return 1;
            }

            if(arg9 == 6698) {
                v9_1 = il.aj;
                v10 = il.ad + v1;
                il.ad = v10;
                v9_1[v10 * v2 - 1] = jc.az.al.ax(-141006446);
                return 1;
            }

            if(arg9 != 6699) {
                return 2;
            }

            v9_1 = il.aj;
            v10 = il.ad + v1;
            il.ad = v10;
            v9_1[v10 * v2 - 1] = jc.az.ae.ax(0x3529A957);
            return 1;
        label_31:
        }
        catch(RuntimeException v9) {
            goto label_31;
        }

        StringBuilder v10_6 = new StringBuilder();
        v10_6.append("gq.bg(");
        v10_6.append(')');
        throw lx.al(((Throwable)v9), v10_6.toString());
        return 2;
    }

    static final void eq(boolean arg16, lo arg17, int arg18) {
        int v4;
        int v0_2;
        int v7;
        int v6;
        int v1;
        lo v0 = arg17;
        try {
            client.gm = arg16;
            int v2 = 0xD4A3E869;
            int v3 = 4;
            if(!client.gm) {
                v1 = v0.cw(-1183108372);
                v6 = v0.cw(0x7645BAFA);
                v7 = v0.ao(0xE48BFF98);
                du.fr = new int[v7][v3];
                int v8;
                for(v8 = 0; v8 < v7; ++v8) {
                    int v9;
                    for(v9 = 0; v9 < v3; ++v9) {
                        du.fr[v8][v9] = v0.ac(51);
                    }
                }

                dj.fp = new int[v7];
                fp.fw = new int[v7];
                hq.ft = new int[v7];
                ce.fj = new byte[v7][];
                kd.fg = new byte[v7][];
                v3 = 49;
                v7 = 0x30;
                if(v7 != v1 / 8 && v1 / 8 != v3) {
                    goto label_50;
                }
                else if(v6 / 8 == v7) {
                    v0_2 = 1;
                }
                else {
                label_50:
                    v0_2 = 0;
                }

                if(v7 == v1 / 8 && 0x94 == v6 / 8) {
                    v0_2 = 1;
                }

                v7 = (v1 - 6) / 8;
                v4 = 0;
                while(v7 <= (v1 + 6) / 8) {
                    for(v8 = (v6 - 6) / 8; v8 <= (v6 + 6) / 8; ++v8) {
                        v9 = (v7 << 8) + v8;
                        if(v0_2 == 0) {
                        label_82:
                            dj.fp[v4] = v9;
                            int[] v9_1 = fp.fw;
                            ki v10 = ks.co;
                            StringBuilder v11 = new StringBuilder();
                            v11.append("m");
                            v11.append(v7);
                            v11.append("_");
                            v11.append(v8);
                            v9_1[v4] = v10.ay(v11.toString(), v2);
                            v9_1 = hq.ft;
                            v10 = ks.co;
                            v11 = new StringBuilder();
                            v11.append("l");
                            v11.append(v7);
                            v11.append("_");
                            v11.append(v8);
                            v9_1[v4] = v10.ay(v11.toString(), v2);
                            ++v4;
                        }
                        else if(v8 != v3 && v8 != 0x95 && 0x93 != v8 && v7 != 50) {
                            if(v3 != v7) {
                                goto label_82;
                            }
                            else if(v8 == 0x2F) {
                            }
                            else {
                                goto label_82;
                            }
                        }
                    }

                    ++v7;
                }

                dr.ej(v1, v6, true, 0x7F16549A);
            }
            else {
                v1 = v0.cw(0xA6BFB9AC);
                v6 = v0.bl(2) == 1 ? 1 : 0;
                v7 = v0.cb(-49);
                v8 = v0.ao(0xCF7843B7);
                v0.jg(0x7F5B696F);
                for(v9 = 0; true; ++v9) {
                    int v10_1 = -1;
                    int v11_1 = 13;
                    if(v9 >= v3) {
                        break;
                    }

                    int v12;
                    for(v12 = 0; v12 < v11_1; ++v12) {
                        int v13;
                        for(v13 = 0; v13 < v11_1; ++v13) {
                            client.gc[v9][v12][v13] = v0.jo(1, 0xCC5510BC) == 1 ? v0.jo(26, -1509172034) : v10_1;
                        }
                    }
                }

                v0.ju(661709240);
                du.fr = new int[v8][v3];
                for(v4 = 0; v4 < v8; ++v4) {
                    for(v9 = 0; v9 < v3; ++v9) {
                        du.fr[v4][v9] = v0.ac(68);
                    }
                }

                dj.fp = new int[v8];
                fp.fw = new int[v8];
                hq.ft = new int[v8];
                ce.fj = new byte[v8][];
                kd.fg = new byte[v8][];
                v0_2 = 0;
                v4 = 0;
                while(v0_2 < v3) {
                    v8 = v4;
                    v4 = 0;
                    while(v4 < v11_1) {
                        v9 = v8;
                        for(v8 = 0; v8 < v11_1; ++v8) {
                            v12 = client.gc[v0_2][v4][v8];
                            if(v10_1 != v12) {
                                v12 = (v12 >> 3 & 0x7FF) / 8 + ((v12 >> 14 & 0x3FF) / 8 << 8);
                                v13 = 0;
                                while(v13 < v9) {
                                    if(dj.fp[v13] == v12) {
                                        v12 = -1;
                                    }
                                    else {
                                        ++v13;
                                        continue;
                                    }

                                    break;
                                }

                                if(v10_1 == v12) {
                                    goto label_254;
                                }

                                dj.fp[v9] = v12;
                                v13 = v12 >> 8 & 0xFF;
                                v12 &= 0xFF;
                                int[] v14 = fp.fw;
                                ki v15 = ks.co;
                                StringBuilder v3_1 = new StringBuilder();
                                v3_1.append("m");
                                v3_1.append(v13);
                                v3_1.append("_");
                                v3_1.append(v12);
                                v14[v9] = v15.ay(v3_1.toString(), v2);
                                int[] v3_2 = hq.ft;
                                ki v5 = ks.co;
                                StringBuilder v14_1 = new StringBuilder();
                                v14_1.append("l");
                                v14_1.append(v13);
                                v14_1.append("_");
                                v14_1.append(v12);
                                v3_2[v9] = v5.ay(v14_1.toString(), v2);
                                ++v9;
                            }

                        label_254:
                        }

                        ++v4;
                        v8 = v9;
                    }

                    ++v0_2;
                    v4 = v8;
                    v3 = 4;
                }

                boolean v0_3 = v6 == 0 ? true : false;
                dr.ej(v7, v1, v0_3, 0x7F5F3FA5);
            }
        }
        catch(RuntimeException v0_1) {
            goto label_277;
        }

        return;
    label_277:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("gq.eq(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
    }

    static final void er(int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int v2;
        int v1;
        arg11 = 0xD781824C;
        try {
            arg9 = bz.ea(arg9, arg10, arg11);
            arg10 = 0x800 - arg7 & 0x7FF;
            arg11 = 0x800 - arg8 & 0x7FF;
            int v0 = 0;
            if(arg10 != 0) {
                v1 = bt.ag[arg10];
                v2 = -(arg9 * v1) >> 16;
                arg9 = bt.ah[arg10] * arg9 >> 16;
            }
            else {
                v2 = 0;
            }

            if(arg11 != 0) {
                arg10 = bt.ag[arg11];
                v1 = arg10 * arg9 >> 16;
                arg9 = arg9 * bt.ah[arg11] >> 16;
                v0 = v1;
            }

            ag.hc = (arg4 - v0) * 0x71608B7D;
            bu.hi = (arg5 - v2) * 0x303CE33F;
            fg.hb = (arg6 - arg9) * 0x543710A7;
            fy.hd = arg7 * 0x53FB23EB;
            it.hh = arg8 * 0xB9EA3D39;
            if(1 == client.hr * 158061037 && client.lf * 0x12DC6E19 >= 2 && client.bj * -2077001153 % 50 == 0) {
                arg7 = 0xBD6EF571;
                arg8 = 0x438776D9;
                if(gu.jg.bp * 0x914F0683 >> 7 == aq.hk * arg7 >> 7 && ma.hw * arg8 >> 7 == gu.jg.bw * 0xD19D0C3D >> 7) {
                    return;
                }

                br.iy(ad.fi * 474770003 + (aq.hk * arg7 >> 7), nr.fo * 0x519F9BE7 + (ma.hw * arg8 >> 7), gu.jg.as * 0xD54EB40F, true, 0x5F877FC5);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("gq.er(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }
}

