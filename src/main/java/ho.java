public class ho {
    static int[] aa = null;
    static int[] ab = null;
    static int ad = 0;
    static byte[] ae = null;
    static int[] af = null;
    static int[] ai = null;
    public static int[] aj = null;
    static lq[] an = null;
    public static int ap = 0;
    static int[] aq = null;
    static byte[] ar = null;
    static lq au = null;
    static int av = 0;
    static final int ax = 2;
    public static final int ay = 0x1000000;
    static int fu;
    protected static mq sh;

    static {
        ho.ae = new byte[0x800];
        ho.ar = new byte[0x800];
        ho.an = new lq[0x800];
        ho.ap = 0;
        ho.aj = new int[0x800];
        ho.ad = 0;
        ho.aq = new int[0x800];
        ho.ab = new int[0x800];
        ho.af = new int[0x800];
        ho.ai = new int[0x800];
        ho.av = 0;
        ho.aa = new int[0x800];
        ho.au = new lq(new byte[5000]);
    }

    ho() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ho.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void aa(lo arg10) {
        int[] v0;
        int v10;
        int v7;
        int v3;
        int v5;
        int v4;
        arg10.jg(0x7FC012E5);
        int v1 = 0;
        int v2 = 0;
        while(true) {
            v4 = 0x474DFE7D;
            v5 = 0xEE9DF063;
            if(v1 >= ho.ap * v4) {
                break;
            }

            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, 0x80AA7F92) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg10, v3, 11);
                }
            }

            ++v1;
        }

        arg10.ju(0x5C8D93FA);
        if(v2 == 0) {
            arg10.jg(0x7FD5E700);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ap * v4) {
            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, -680109076) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg10, v3, -73);
                }
            }

            ++v1;
        }

        arg10.ju(0x4AC5ECB9);
        if(v2 == 0) {
            arg10.jg(0x7F5622AB);
            v1 = 0;
            goto label_82;
        }

        throw new RuntimeException();
        while(true) {
        label_82:
            v7 = 0x24902B03;
            if(v1 >= ho.ad * v7) {
                break;
            }

            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, 0x9EAE5285) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg10, v3, 302670390)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg10.ju(1232703250);
        if(v2 == 0) {
            arg10.jg(0x7F73AF89);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ad * v7) {
            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, 0x80AD3D51) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg10, v3, 1178440403)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg10.ju(620673620);
        if(v2 == 0) {
            ho.ap = 0;
            ho.ad = 0;
            v10 = 1;
        }
        else {
            throw new RuntimeException();
        }

        while(v10 < 0x800) {
            ho.ae[v10] = ((byte)(ho.ae[v10] >> 1));
            if(client.jf[v10] != null) {
                v0 = ho.aj;
                v1 = ho.ap + 0x5F01EAD5;
                ho.ap = v1;
                v0[v1 * v4 - 1] = v10;
            }
            else {
                v0 = ho.aq;
                v1 = ho.ad - 0x20DE855;
                ho.ad = v1;
                v0[v1 * v7 - 1] = v10;
            }

            ++v10;
        }
    }

    static final void ab(lo arg9) {
        arg9.jg(0x7F71A842);
        int v1 = client.ja * -900939569;
        hw[] v0 = client.jf;
        hw v2 = new hw();
        v0[v1] = v2;
        gu.jg = v2;
        v2.ak = 0xE1684B9B * v1;
        int v0_1 = arg9.jo(30, -2120428891);
        v2.dc[0] = (v0_1 >> 14 & 0x3FFF) - ad.fi * 474770003;
        v2.bp = ((v2.dc[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * 0x3CF9F82B;
        v2.dj[0] = (v0_1 & 0x3FFF) - nr.fo * 0x519F9BE7;
        v2.bw = ((v2.dj[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * -410326251;
        int v3 = (((byte)(v0_1 >> 28))) * 0x491DBAEF;
        v2.as = v3;
        kt.jz = v3 * 1904695735;
        if(ho.an[v1] != null) {
            v2.ax(ho.an[v1], -1162484700);
        }

        ho.ap = 0;
        int[] v0_2 = ho.aj;
        int v2_1 = ho.ap + 0x5F01EAD5;
        ho.ap = v2_1;
        v0_2[v2_1 * 0x474DFE7D - 1] = v1;
        ho.ae[v1] = 0;
        ho.ad = 0;
        for(v0_1 = 1; v0_1 < 0x800; ++v0_1) {
            if(v1 == v0_1) {
            }
            else {
                v2_1 = arg9.jo(18, 0x8B4E2FD8);
                ho.ab[v0_1] = (v2_1 >> 16 << 28) + ((v2_1 >> 8 & 597) << 14) + (v2_1 & 597);
                ho.af[v0_1] = 0;
                ho.ai[v0_1] = -1;
                int[] v2_2 = ho.aq;
                int v4 = ho.ad - 0x20DE855;
                ho.ad = v4;
                v2_2[v4 * 0x24902B03 - 1] = v0_1;
                ho.ae[v0_1] = 0;
            }
        }

        arg9.ju(2093236610);
    }

    static void ac() {
        int v0 = 0;
        ho.ap = 0;
        while(v0 < 0x800) {
            ho.an[v0] = null;
            ho.ar[v0] = 1;
            ++v0;
        }
    }

    static final void af(lo arg9) {
        arg9.jg(0x7F27AE54);
        int v1 = client.ja * -900939569;
        hw[] v0 = client.jf;
        hw v2 = new hw();
        v0[v1] = v2;
        gu.jg = v2;
        v2.ak = 0xE1684B9B * v1;
        int v0_1 = arg9.jo(30, -1802914206);
        v2.dc[0] = (v0_1 >> 14 & 0x3FFF) - ad.fi * 474770003;
        v2.bp = ((v2.dc[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * 0x3CF9F82B;
        v2.dj[0] = (v0_1 & 0x3FFF) - nr.fo * 0x519F9BE7;
        v2.bw = ((v2.dj[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * -410326251;
        int v3 = (((byte)(v0_1 >> 28))) * 0x491DBAEF;
        v2.as = v3;
        kt.jz = v3 * 1904695735;
        if(ho.an[v1] != null) {
            v2.ax(ho.an[v1], 0xA1927B68);
        }

        ho.ap = 0;
        int[] v0_2 = ho.aj;
        int v2_1 = ho.ap + 0x5F01EAD5;
        ho.ap = v2_1;
        v0_2[v2_1 * 0x474DFE7D - 1] = v1;
        ho.ae[v1] = 0;
        ho.ad = 0;
        for(v0_1 = 1; v0_1 < 0x800; ++v0_1) {
            if(v1 == v0_1) {
            }
            else {
                v2_1 = arg9.jo(18, 0x803CA6C4);
                ho.ab[v0_1] = (v2_1 >> 16 << 28) + ((v2_1 >> 8 & 597) << 14) + (v2_1 & 597);
                ho.af[v0_1] = 0;
                ho.ai[v0_1] = -1;
                int[] v2_2 = ho.aq;
                int v4 = ho.ad - 0x20DE855;
                ho.ad = v4;
                v2_2[v4 * 0x24902B03 - 1] = v0_1;
                ho.ae[v0_1] = 0;
            }
        }

        arg9.ju(0x447BB86C);
    }

    static int ag(lo arg3) {
        int v3;
        int v0 = 2;
        int v1 = arg3.jo(v0, 0x88EABEEB);
        if(v1 == 0) {
            v3 = 0;
        }
        else {
            if(v1 == 1) {
                v0 = 5;
                v1 = 0xC2F12BD6;
            }
            else if(v1 == v0) {
                v0 = 8;
                v1 = 0xAF03B2CE;
            }
            else {
                goto label_16;
            }

            return arg3.jo(v0, v1);
        label_16:
            v3 = arg3.jo(11, -719898510);
        }

        return v3;
    }

    static boolean ah(lo arg10, int arg11) {
        int v7;
        int v6;
        int v5;
        int v10;
        int v4;
        int v0 = 2;
        int v1 = arg10.jo(v0, -1722508904);
        if(v1 == 0) {
            if(arg10.jo(1, 0xAA2BC850) != 0) {
                mm.ap(arg10, arg11, 51936709);
            }

            v1 = 13;
            v0 = arg10.jo(v1, 0xBC335F11);
            v4 = arg10.jo(v1, 0x9E2C9016);
            v10 = arg10.jo(1, 0x9213FA05) == 1 ? 1 : 0;
            if(v10 != 0) {
                int[] v10_1 = ho.aa;
                v5 = ho.av + 0x4FE45817;
                ho.av = v5;
                v10_1[v5 * 0xC3B65FA7 - 1] = arg11;
            }

            if(client.jf[arg11] == null) {
                hw[] v10_2 = client.jf;
                hw v5_1 = new hw();
                v10_2[arg11] = v5_1;
                v5_1.ak = 0xE1684B9B * arg11;
                if(ho.an[arg11] != null) {
                    v5_1.ax(ho.an[arg11], 0x47460D62);
                }

                v5_1.du = ho.af[arg11] * 0x4EFE4D63;
                v5_1.cy = ho.ai[arg11] * 0xDDB4A4E9;
                v6 = ho.ab[arg11] >> 28;
                v7 = ho.ab[arg11] >> 14 & 0xFF;
                v10 = ho.ab[arg11] & 0xFF;
                v5_1.ds[0] = ho.ar[arg11];
                v5_1.as = (((byte)v6)) * 0x491DBAEF;
                v5_1.ab(v0 + (v7 << 13) - ad.fi * 474770003, (v10 << v1) + v4 - nr.fo * 0x519F9BE7, -25);
                v5_1.ba = false;
                return 1;
            }

            throw new RuntimeException();
        }

        v4 = 3;
        if(v1 == 1) {
            ho.ab[arg11] = ((arg10.jo(v0, 0xD0C3CB16) + (ho.ab[arg11] >> 28) & v4) << 28) + (ho.ab[arg11] & 0xFFFFFFF);
            return 0;
        }

        if(v0 == v1) {
            v5 = 5;
            v10 = arg10.jo(v5, 0x8BDC6F91);
            v1 = v10 >> 3;
            v6 = 7;
            v10 &= v6;
            v1 = v1 + (ho.ab[arg11] >> 28) & v4;
            int v8 = ho.ab[arg11] >> 14 & 0xFF;
            v7 = ho.ab[arg11] & 0xFF;
            if(v10 == 0) {
                --v8;
                --v7;
            }

            if(1 == v10) {
                --v7;
            }

            if(v10 == v0) {
                ++v8;
                --v7;
            }

            if(v10 == v4) {
                --v8;
            }

            if(4 == v10) {
                ++v8;
            }

            if(v5 == v10) {
                --v8;
                ++v7;
            }

            if(v10 == 6) {
                ++v7;
            }

            if(v6 == v10) {
                ++v8;
                ++v7;
            }

            ho.ab[arg11] = v7 + ((v1 << 28) + (v8 << 14));
            return 0;
        }

        v10 = arg10.jo(18, 0xC6587F19);
        ho.ab[arg11] = (((v10 >> 16) + (ho.ab[arg11] >> 28) & v4) << 28) + (((v10 >> 8 & 0xFF) + (ho.ab[arg11] >> 14) & 0xFF) << 14) + ((v10 & 0xFF) + ho.ab[arg11] & 0xFF);
        return 0;
    }

    static final void ai(lo arg9) {
        arg9.jg(0x7FF996C4);
        int v1 = client.ja * -900939569;
        hw[] v0 = client.jf;
        hw v2 = new hw();
        v0[v1] = v2;
        gu.jg = v2;
        v2.ak = 0xE1684B9B * v1;
        int v0_1 = arg9.jo(30, 0x9FA4040E);
        v2.dc[0] = (v0_1 >> 14 & 0x3FFF) - ad.fi * 474770003;
        v2.bp = ((v2.dc[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * 0x3CF9F82B;
        v2.dj[0] = (v0_1 & 0x3FFF) - nr.fo * 0x519F9BE7;
        v2.bw = ((v2.dj[0] << 7) + (v2.ad(0xCBF5CAC1) << 6)) * -410326251;
        int v3 = (((byte)(v0_1 >> 28))) * 0x491DBAEF;
        v2.as = v3;
        kt.jz = v3 * 1904695735;
        if(ho.an[v1] != null) {
            v2.ax(ho.an[v1], 0x503D0964);
        }

        ho.ap = 0;
        int[] v0_2 = ho.aj;
        int v2_1 = ho.ap + 0x5F01EAD5;
        ho.ap = v2_1;
        v0_2[v2_1 * 0x474DFE7D - 1] = v1;
        ho.ae[v1] = 0;
        ho.ad = 0;
        for(v0_1 = 1; v0_1 < 0x800; ++v0_1) {
            if(v1 == v0_1) {
            }
            else {
                v2_1 = arg9.jo(18, 0x99EDE419);
                ho.ab[v0_1] = (v2_1 >> 16 << 28) + ((v2_1 >> 8 & 597) << 14) + (v2_1 & 597);
                ho.af[v0_1] = 0;
                ho.ai[v0_1] = -1;
                int[] v2_2 = ho.aq;
                int v4 = ho.ad - 0x20DE855;
                ho.ad = v4;
                v2_2[v4 * 0x24902B03 - 1] = v0_1;
                ho.ae[v0_1] = 0;
            }
        }

        arg9.ju(1764340210);
    }

    static void ak() {
        int v0 = 0;
        ho.ap = 0;
        while(v0 < 208697004) {
            ho.an[v0] = null;
            ho.ar[v0] = 1;
            ++v0;
        }
    }

    static int al(int arg0) {
        return 15;
    }

    static final void am(lo arg9) {
        int[] v0;
        int v9;
        int v3;
        int v5;
        int v4;
        arg9.jg(0x7FDC95DC);
        int v1 = 0;
        int v2 = 0;
        while(true) {
            v4 = 0x474DFE7D;
            v5 = 0xEE9DF063;
            if(v1 >= ho.ap * v4) {
                break;
            }

            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg9.jo(1, -1700366669) == 0) {
                    v2 = ex.ar(arg9, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg9, v3, -25);
                }
            }

            ++v1;
        }

        arg9.ju(0x13F0DEB3);
        if(v2 == 0) {
            arg9.jg(0x7FDB748B);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ap * 0x1B250AFD) {
            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg9.jo(1, 0xC5A395F7) == 0) {
                    v2 = ex.ar(arg9, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg9, v3, -28);
                }
            }

            ++v1;
        }

        arg9.ju(0x2655FD8D);
        if(v2 == 0) {
            arg9.jg(0x7F7BC5D1);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ad * 0x24902B03) {
            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg9.jo(1, 0xBAE91BAB) == 0) {
                    v2 = ex.ar(arg9, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg9, v3, 0xC2DFF6F8)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg9.ju(2072277786);
        if(v2 == 0) {
            arg9.jg(0x7FAF403F);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ad * 0x3FF2E456) {
            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg9.jo(1, 0xA00CCD42) == 0) {
                    v2 = ex.ar(arg9, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg9, v3, 0x2EFD0A4C)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg9.ju(639349907);
        if(v2 == 0) {
            ho.ap = 0;
            ho.ad = 0;
            v9 = 1;
        }
        else {
            throw new RuntimeException();
        }

        while(v9 < 1274000586) {
            ho.ae[v9] = ((byte)(ho.ae[v9] >> 1));
            if(client.jf[v9] != null) {
                v0 = ho.aj;
                v1 = ho.ap + 0x5F01EAD5;
                ho.ap = v1;
                v0[v1 * v4 - 1] = v9;
            }
            else {
                v0 = ho.aq;
                v1 = ho.ad - 0x20DE855;
                ho.ad = v1;
                v0[v1 * 0xB35059E7 - 1] = v9;
            }

            ++v9;
        }
    }

    static final void ao(lo arg20, int arg21, hw arg22, int arg23) {
        int v18;
        int v16;
        int v5;
        int v6;
        int v4;
        int v3;
        int v2;
        int v7;
        int v8;
        int v9;
        lo v0 = arg20;
        hw v10 = arg22;
        int v11 = arg23;
        int v12 = -2077001153;
        byte v13 = 2;
        if((v11 & 8) != 0) {
            v9 = v0.ay(-107);
            v8 = 0x7FFF;
            if(v9 > 0) {
                v7 = 0;
                while(v7 < v9) {
                    v2 = v0.by(0x68E1);
                    if(v8 == v2) {
                        v2 = v0.by(32088);
                        v3 = v0.by(0x29EF);
                        v4 = v0.by(10631);
                        v6 = v0.by(8492);
                        v5 = v4;
                        v4 = v3;
                        goto label_36;
                    }
                    else if(0x7FFE != v2) {
                        v4 = v0.by(17099);
                        v5 = -1;
                        v6 = -1;
                    label_36:
                        v3 = v2;
                    }
                    else {
                        v3 = -1;
                        v4 = -1;
                        v5 = -1;
                        v6 = -1;
                    }

                    arg22.bl(v3, v4, v5, v6, client.bj * v12, v0.by(0x2BE0), 7);
                    ++v7;
                    v9 = v9;
                    v8 = 0x7FFF;
                }
            }

            int v14 = 0x7FFF;
            v9 = v0.bl(v13);
            if(v9 <= 0) {
                goto label_94;
            }

            v8 = 0;
            while(v8 < v9) {
                v3 = v0.by(0x3F57);
                v5 = v0.by(28290);
                if(v14 != v5) {
                    v6 = v0.by(5417);
                    v7 = v0.be(0);
                    v16 = v5 > 0 ? v0.be(0) : v7;
                    v18 = v8;
                    v8 = v16;
                    v16 = v9;
                    arg22.br(v3, client.bj * v12, v5, v6, v7, v8, -769304979);
                }
                else {
                    v18 = v8;
                    v16 = v9;
                    v10.bi(v3, 1431039018);
                }

                v8 = v18 + 1;
                v9 = v16;
            }
        }

    label_94:
        byte v14_1 = (v11 & 0x400) != 0 ? v0.bi(0x4F20FA55) : -1;
        v3 = 0xFFFF;
        if((v11 & 4) != 0) {
            v2 = v0.ao(140072855);
            if(v2 == v3) {
                v2 = -1;
            }

            jb.cm(v10, v2, v0.be(0), 0x51E0870D);
        }

        v4 = -1639783094;
        if((v11 & 0x40) != 0) {
            v2 = v0.cb(-93);
            lh v6_1 = eh.ax(dj.al(-1372027803), v0.bl(v13), 759351205);
            boolean v7_1 = v0.br(0x7AB3FF73) == 1 ? true : false;
            v8 = v0.ay(-15);
            v9 = v0.ar * 0xF24F550B;
            if(v10.ax != null && v10.al != null) {
                v3 = !((gc)v6_1).ab || !ds.rq.aj(v10.ax, -13506) ? 0 : 1;
                if(v3 != 0) {
                    goto label_232;
                }

                if(client.jn * 359259607 != 0) {
                    goto label_232;
                }

                if(v10.ao) {
                    goto label_232;
                }

                ho.au.ar = 0;
                v0.cl(ho.au.ae, 0, v8, 1);
                ho.au.ar = 0;
                String v3_1 = od.ad(ap.au(cd.ae(ho.au, 561256630), 2001460875));
                v10.bm = v3_1.trim();
                v10.be = (v2 >> 8) * 0x4E88A893;
                v10.bl = (v2 & 0xFF) * 0xBC059B71;
                v10.bs = v4;
                v10.bj = v7_1;
                boolean v2_1 = v10 == gu.jg || !((gc)v6_1).ab || client.og == "" || v3_1.toLowerCase().indexOf(client.og) != -1 ? false : true;
                v10.bu = v2_1;
                if(((gc)v6_1).aq) {
                    v2 = v7_1 ? 91 : 1;
                }
                else if(v7_1) {
                    v2 = 90;
                }
                else {
                    v2 = 2;
                }

                if(-1 != ((gc)v6_1).ad * 0x5A739A73) {
                    ib.al(v2, lk.ax(((gc)v6_1).ad * 0x5A739A73, -29) + v10.ax.ax(1670611735), v3_1, 0xFFD5C1CD);
                    goto label_232;
                }

                ib.al(v2, v10.ax.ax(0x7E78577F), v3_1, 0xE7F90D4);
            }

        label_232:
            v0.ar = (v8 + v9) * -1880437085;
        }

        if((v11 & 2) != 0) {
            v10.cy = v0.cb(-54) * 0xDDB4A4E9;
            if(v10.cy * 0x5A6E7359 == 0xFFFF) {
                v10.cy = 0x224B5B17;
            }
        }

        byte v3_2 = 3;
        if((v11 & 0x800) != 0) {
            for(v2 = 0; v2 < v3_2; ++v2) {
                v10.aj[v2] = v0.bn(-2);
            }
        }

        if((v11 & 0x100) != 0) {
            ho.ar[arg21] = v0.bi(-904646185);
        }

        if((v11 & 0x80) != 0) {
            v10.cc = v0.cb(-103) * -1163009031;
            if(v10.dk * -1091885127 == 0) {
                v10.du = v10.cc * 0x81BB9B3B;
                v10.cc = 1163009031;
            }
        }

        if((v11 & 0x200) != 0) {
            v6 = 0x6449C51F;
            v10.cq = v0.bi(-1183034647) * v6;
            v7 = 0xB48720F7;
            v10.cg = v0.aw(-1215098345) * v7;
            v8 = 0x6B9042FD;
            v10.cv = v0.ca(0xFBD665E8) * v8;
            v9 = 0x23E66C3;
            v10.co = v0.bi(0x267C03A4) * v9;
            v10.dv = (v0.ao(0x233F77DE) + client.bj * -2077001153) * 0x21C7C9F7;
            v10.dp = (v0.ao(-755072109) + client.bj * -2077001153) * -2044357351;
            v10.dh = v0.cb(-28) * 0xE90A13B7;
            if(v10.ba) {
                v10.cq += v10.bf * -908304491;
                v10.cg += v10.bn * 910046141;
                v10.cv += v10.bf * 0x4FE24E9F;
                v10.co += v10.bn * 0x7C9F9A01;
                v10.dk = 0;
            }
            else {
                v10.cq += v10.dc[0] * v6;
                v10.cg += v10.dj[0] * v7;
                v10.cv += v10.dc[0] * v8;
                v10.co += v10.dj[0] * v9;
                v10.dk = -1133990263;
            }

            v10.df = 0;
        }

        if((v11 & 0x20) != 0) {
            v10.bm = v0.bn(v3_2);
            if(v10.bm.charAt(0) == 0x7E) {
                v10.bm = v10.bm.substring(1);
                ib.al(2, v10.ax.ax(0x374BD763), v10.bm, 0x7CE0E1EA);
            }
            else {
                v7 = 2;
                if(v10 == gu.jg) {
                    ib.al(v7, v10.ax.ax(1650946343), v10.bm, 0x6F0F536C);
                }
            }

            v10.bj = false;
            v10.be = 0;
            v10.bl = 0;
            v10.bs = v4;
        }

        if((v11 & 0x1000) != 0) {
            v10.cl = v0.cw(0x5C1BA415) * 0x50A1A935;
            v2 = v0.ac(18);
            v10.cu = (v2 >> 16) * 0x5156494F;
            v10.ct = ((v2 & 0xFFFF) + client.bj * -2077001153) * 1522712035;
            v10.ck = 0;
            v10.cm = 0;
            if(v10.ct * 0xD02A6FCB > client.bj * -2077001153) {
                v10.ck = 0x2AB9EA9D;
            }

            if(v10.cl * 0xA760211D != 0xFFFF) {
                goto label_455;
            }

            v10.cl = 0xAF5E56CB;
        }

    label_455:
        if((v11 & 16) != 0) {
            v2 = v0.ay(-35);
            byte[] v3_3 = new byte[v2];
            lq v4_1 = new lq(v3_3);
            v0.cl(v3_3, 0, v2, 1);
            ho.an[arg21] = v4_1;
            v10.ax(v4_1, 0x148600B3);
        }

        if(v10.ba) {
            if(v14_1 == 0x7F) {
                v10.ab(v10.bf * 0x8370F0CB, v10.bn * -583444501, -82);
            }
            else {
                if(v14_1 != -1) {
                }
                else {
                    v14_1 = ho.ar[arg21];
                }

                v10.aq(v10.bf * 0x8370F0CB, v10.bn * -583444501, v14_1, 0x2F);
            }
        }
    }

    static final void as(lo arg20, int arg21, hw arg22, int arg23) {
        int v18;
        int v16;
        int v5;
        int v6;
        int v4;
        int v3;
        int v2;
        int v7;
        int v8;
        int v9;
        lo v0 = arg20;
        hw v10 = arg22;
        int v11 = arg23;
        int v12 = -2077001153;
        byte v13 = 2;
        if((v11 & 8) != 0) {
            v9 = v0.ay(-104);
            v8 = 0x7FFF;
            if(v9 > 0) {
                v7 = 0;
                while(v7 < v9) {
                    v2 = v0.by(0x433D);
                    if(v8 == v2) {
                        v2 = v0.by(17310);
                        v3 = v0.by(0x4BAE);
                        v4 = v0.by(21970);
                        v6 = v0.by(6695);
                        v5 = v4;
                        v4 = v3;
                        goto label_28;
                    }
                    else if(0x7FFE != v2) {
                        v4 = v0.by(10262);
                        v5 = -1;
                        v6 = -1;
                    label_28:
                        v3 = v2;
                    }
                    else {
                        v3 = -1;
                        v4 = -1;
                        v5 = -1;
                        v6 = -1;
                    }

                    arg22.bl(v3, v4, v5, v6, client.bj * v12, v0.by(0x485C), 7);
                    ++v7;
                    v9 = v9;
                    v8 = 0x7FFF;
                }
            }

            int v14 = 0x7FFF;
            v9 = v0.bl(v13);
            if(v9 <= 0) {
                goto label_94;
            }

            v8 = 0;
            while(v8 < v9) {
                v3 = v0.by(0x7F69);
                v5 = v0.by(0x305A);
                if(v14 != v5) {
                    v6 = v0.by(0x7AC0);
                    v7 = v0.be(0);
                    v16 = v5 > 0 ? v0.be(0) : v7;
                    v18 = v8;
                    v8 = v16;
                    v16 = v9;
                    arg22.br(v3, client.bj * v12, v5, v6, v7, v8, -769304979);
                }
                else {
                    v18 = v8;
                    v16 = v9;
                    v10.bi(v3, 0x39B56745);
                }

                v8 = v18 + 1;
                v9 = v16;
            }
        }

    label_94:
        byte v14_1 = (v11 & 0x400) != 0 ? v0.bi(1965219097) : -1;
        v3 = 0xFFFF;
        if((v11 & 4) != 0) {
            v2 = v0.ao(-1415191830);
            if(v2 == v3) {
                v2 = -1;
            }

            jb.cm(v10, v2, v0.be(0), 0x39590271);
        }

        v4 = -1639783094;
        if((v11 & 0x40) != 0) {
            v2 = v0.cb(-56);
            lh v6_1 = eh.ax(dj.al(-487736001), v0.bl(v13), 0x5BF8DE43);
            boolean v7_1 = v0.br(0x64FD3067) == 1 ? true : false;
            v8 = v0.ay(-8);
            v9 = v0.ar * 0xF24F550B;
            if(v10.ax != null && v10.al != null) {
                v3 = !((gc)v6_1).ab || !ds.rq.aj(v10.ax, -15169) ? 0 : 1;
                if(v3 != 0) {
                    goto label_232;
                }

                if(client.jn * 359259607 != 0) {
                    goto label_232;
                }

                if(v10.ao) {
                    goto label_232;
                }

                ho.au.ar = 0;
                v0.cl(ho.au.ae, 0, v8, 1);
                ho.au.ar = 0;
                String v3_1 = od.ad(ap.au(cd.ae(ho.au, 0xD0CE121A), 0x725C4B6C));
                v10.bm = v3_1.trim();
                v10.be = (v2 >> 8) * 0x4E88A893;
                v10.bl = (v2 & 0xFF) * 0xBC059B71;
                v10.bs = v4;
                v10.bj = v7_1;
                boolean v2_1 = v10 == gu.jg || !((gc)v6_1).ab || client.og == "" || v3_1.toLowerCase().indexOf(client.og) != -1 ? false : true;
                v10.bu = v2_1;
                if(((gc)v6_1).aq) {
                    v2 = v7_1 ? 91 : 1;
                }
                else if(v7_1) {
                    v2 = 90;
                }
                else {
                    v2 = 2;
                }

                if(-1 != ((gc)v6_1).ad * 0x5A739A73) {
                    ib.al(v2, lk.ax(((gc)v6_1).ad * 0x5A739A73, -66) + v10.ax.ax(0x70188A0F), v3_1, 0x337F53AA);
                    goto label_232;
                }

                ib.al(v2, v10.ax.ax(0x741E40D7), v3_1, 48619108);
            }

        label_232:
            v0.ar = (v8 + v9) * -1880437085;
        }

        if((v11 & 2) != 0) {
            v10.cy = v0.cb(-47) * 0xDDB4A4E9;
            if(v10.cy * 0x5A6E7359 == 0xFFFF) {
                v10.cy = 0x224B5B17;
            }
        }

        if((v11 & 0x800) != 0) {
            for(v2 = 0; v2 < 3; ++v2) {
                v10.aj[v2] = v0.bn(36);
            }
        }

        if((v11 & 0x100) != 0) {
            ho.ar[arg21] = v0.bi(0x87EE0A11);
        }

        if((v11 & 0x80) != 0) {
            v10.cc = v0.cb(-2) * -1163009031;
            if(v10.dk * -1091885127 == 0) {
                v10.du = v10.cc * 0x81BB9B3B;
                v10.cc = 1163009031;
            }
        }

        if((v11 & 0x200) != 0) {
            v3 = 0x6449C51F;
            v10.cq = v0.bi(0xEF863FBC) * v3;
            v6 = 0xB48720F7;
            v10.cg = v0.aw(-1215098345) * v6;
            v7 = 0x6B9042FD;
            v10.cv = v0.ca(0xFBD665E8) * v7;
            v8 = 0x23E66C3;
            v10.co = v0.bi(607982612) * v8;
            v10.dv = (v0.ao(517883960) + client.bj * -2077001153) * 0x21C7C9F7;
            v10.dp = (v0.ao(0xF8C5AB01) + client.bj * -2077001153) * -2044357351;
            v10.dh = v0.cb(-79) * 0xE90A13B7;
            if(v10.ba) {
                v10.cq += v10.bf * -908304491;
                v10.cg += v10.bn * 910046141;
                v10.cv += v10.bf * 0x4FE24E9F;
                v10.co += v10.bn * 0x7C9F9A01;
                v10.dk = 0;
            }
            else {
                v10.cq += v10.dc[0] * v3;
                v10.cg += v10.dj[0] * v6;
                v10.cv += v10.dc[0] * v7;
                v10.co += v10.dj[0] * v8;
                v10.dk = -1133990263;
            }

            v10.df = 0;
        }

        if((v11 & 0x20) != 0) {
            v10.bm = v0.bn(-33);
            if(v10.bm.charAt(0) == 0x7E) {
                v10.bm = v10.bm.substring(1);
                ib.al(2, v10.ax.ax(690699369), v10.bm, 0x92668ED0);
            }
            else {
                v7 = 2;
                if(v10 == gu.jg) {
                    ib.al(v7, v10.ax.ax(0x667E21D9), v10.bm, 501013797);
                }
            }

            v10.bj = false;
            v10.be = 0;
            v10.bl = 0;
            v10.bs = v4;
        }

        if((v11 & 0x1000) != 0) {
            v10.cl = v0.cw(-1129044795) * 0x50A1A935;
            v2 = v0.ac(77);
            v10.cu = (v2 >> 16) * 0x5156494F;
            v10.ct = ((v2 & 0xFFFF) + client.bj * -2077001153) * 1522712035;
            v10.ck = 0;
            v10.cm = 0;
            if(v10.ct * 0xD02A6FCB > client.bj * -2077001153) {
                v10.ck = 0x2AB9EA9D;
            }

            if(v10.cl * 0xA760211D != 0xFFFF) {
                goto label_456;
            }

            v10.cl = 0xAF5E56CB;
        }

    label_456:
        if((v11 & 16) != 0) {
            v2 = v0.ay(-48);
            byte[] v3_2 = new byte[v2];
            lq v4_1 = new lq(v3_2);
            v0.cl(v3_2, 0, v2, 1);
            ho.an[arg21] = v4_1;
            v10.ax(v4_1, 0x99676818);
        }

        if(v10.ba) {
            v2 = 0x8370F0CB;
            if(v14_1 == 0x7F) {
                v10.ab(v10.bf * v2, v10.bn * -583444501, -55);
            }
            else {
                if(v14_1 != -1) {
                }
                else {
                    v14_1 = ho.ar[arg21];
                }

                v10.aq(v10.bf * v2, v10.bn * -583444501, v14_1, -59);
            }
        }
    }

    static boolean at(lo arg10, int arg11) {
        int v7;
        int v6;
        int v5;
        int v10;
        int v4;
        int v0 = 2;
        int v1 = arg10.jo(v0, 0xBD8F329C);
        if(v1 == 0) {
            if(arg10.jo(1, 0x802470E9) != 0) {
                mm.ap(arg10, arg11, 0x576F520E);
            }

            v1 = 13;
            v0 = arg10.jo(v1, 0x9F2BBE20);
            v4 = arg10.jo(v1, -1281820097);
            v10 = arg10.jo(1, -1637111108) == 1 ? 1 : 0;
            if(v10 != 0) {
                int[] v10_1 = ho.aa;
                v5 = ho.av + 0x4FE45817;
                ho.av = v5;
                v10_1[v5 * 0xC3B65FA7 - 1] = arg11;
            }

            if(client.jf[arg11] == null) {
                hw[] v10_2 = client.jf;
                hw v5_1 = new hw();
                v10_2[arg11] = v5_1;
                v5_1.ak = 0xE1684B9B * arg11;
                if(ho.an[arg11] != null) {
                    v5_1.ax(ho.an[arg11], -1360479950);
                }

                v5_1.du = ho.af[arg11] * 0x4EFE4D63;
                v5_1.cy = ho.ai[arg11] * 0xDDB4A4E9;
                v6 = ho.ab[arg11] >> 28;
                v7 = ho.ab[arg11] >> 14 & 0xFF;
                v10 = ho.ab[arg11] & 0xFF;
                v5_1.ds[0] = ho.ar[arg11];
                v5_1.as = (((byte)v6)) * 0x491DBAEF;
                v5_1.ab(v0 + (v7 << 13) - ad.fi * 474770003, (v10 << v1) + v4 - nr.fo * 0x519F9BE7, -104);
                v5_1.ba = false;
                return 1;
            }

            throw new RuntimeException();
        }

        v4 = 3;
        if(v1 == 1) {
            ho.ab[arg11] = ((arg10.jo(v0, 0x9B8BDE12) + (ho.ab[arg11] >> 28) & v4) << 28) + (ho.ab[arg11] & 0xFFFFFFF);
            return 0;
        }

        if(v0 == v1) {
            v5 = 5;
            v10 = arg10.jo(v5, 0x8D53028A);
            v1 = v10 >> 3;
            v6 = 7;
            v10 &= v6;
            v1 = v1 + (ho.ab[arg11] >> 28) & v4;
            int v8 = ho.ab[arg11] >> 14 & 0xFF;
            v7 = ho.ab[arg11] & 0xFF;
            if(v10 == 0) {
                --v8;
                --v7;
            }

            if(1 == v10) {
                --v7;
            }

            if(v10 == v0) {
                ++v8;
                --v7;
            }

            if(v10 == v4) {
                --v8;
            }

            if(4 == v10) {
                ++v8;
            }

            if(v5 == v10) {
                --v8;
                ++v7;
            }

            if(v10 == 6) {
                ++v7;
            }

            if(v6 == v10) {
                ++v8;
                ++v7;
            }

            ho.ab[arg11] = v7 + ((v1 << 28) + (v8 << 14));
            return 0;
        }

        v10 = arg10.jo(18, -1024908951);
        ho.ab[arg11] = (((v10 >> 16) + (ho.ab[arg11] >> 28) & v4) << 28) + (((v10 >> 8 & 0xFF) + (ho.ab[arg11] >> 14) & 0xFF) << 14) + ((v10 & 0xFF) + ho.ab[arg11] & 0xFF);
        return 0;
    }

    static final void au(lo arg10) {
        int[] v0;
        int v10;
        int v7;
        int v3;
        int v5;
        int v4;
        arg10.jg(0x7F2D1540);
        int v1 = 0;
        int v2 = 0;
        while(true) {
            v4 = 0x474DFE7D;
            v5 = 0xEE9DF063;
            if(v1 >= ho.ap * v4) {
                break;
            }

            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, -1010365087) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg10, v3, -56);
                }
            }

            ++v1;
        }

        arg10.ju(0x6778A001);
        if(v2 == 0) {
            arg10.jg(0x7F975D4C);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ap * v4) {
            v3 = ho.aj[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, -1926116071) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else {
                    gp.an(arg10, v3, 67);
                }
            }

            ++v1;
        }

        arg10.ju(0x6CF48D16);
        if(v2 == 0) {
            arg10.jg(0x7F54DE50);
            v1 = 0;
            goto label_82;
        }

        throw new RuntimeException();
        while(true) {
        label_82:
            v7 = 0x24902B03;
            if(v1 >= ho.ad * v7) {
                break;
            }

            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) != 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, -1052091976) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg10, v3, 0x8B7EA198)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg10.ju(0x4F957C45);
        if(v2 == 0) {
            arg10.jg(0x7FEECCEE);
            v1 = 0;
        }
        else {
            throw new RuntimeException();
        }

        while(v1 < ho.ad * v7) {
            v3 = ho.aq[v1];
            if((ho.ae[v3] & 1) == 0) {
                if(v2 > 0) {
                    --v2;
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(arg10.jo(1, -978024254) == 0) {
                    v2 = ex.ar(arg10, v5);
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
                else if(mm.ap(arg10, v3, 401166010)) {
                    ho.ae[v3] = ((byte)(ho.ae[v3] | 2));
                }
            }

            ++v1;
        }

        arg10.ju(2033472880);
        if(v2 == 0) {
            ho.ap = 0;
            ho.ad = 0;
            v10 = 1;
        }
        else {
            throw new RuntimeException();
        }

        while(v10 < 0x800) {
            ho.ae[v10] = ((byte)(ho.ae[v10] >> 1));
            if(client.jf[v10] != null) {
                v0 = ho.aj;
                v1 = ho.ap + 0x5F01EAD5;
                ho.ap = v1;
                v0[v1 * v4 - 1] = v10;
            }
            else {
                v0 = ho.aq;
                v1 = ho.ad - 0x20DE855;
                ho.ad = v1;
                v0[v1 * v7 - 1] = v10;
            }

            ++v10;
        }
    }

    static final void av(lo arg4, int arg5) {
        int v0 = arg4.ar * 0xE7C07F98;
        ho.av = 0;
        ce.ae(arg4, 7);
        fd.aj(arg4, 83);
        int v2 = 0xF24F550B;
        if(arg4.ar * v2 - v0 == arg5) {
            return;
        }

        StringBuilder v3 = new StringBuilder();
        v3.append(arg4.ar * v2 - v0);
        v3.append(" ");
        v3.append(arg5);
        throw new RuntimeException(v3.toString());
    }

    static final void aw(lo arg5) {
        int v0;
        for(v0 = 0; v0 < ho.av * 0xC3B65FA7; ++v0) {
            int v1 = ho.aa[v0];
            hw v2 = client.jf[v1];
            int v3 = arg5.ay(-30);
            if((v3 & 1) != 0) {
                v3 += arg5.ay(-79) << 8;
            }

            dd.ad(arg5, v1, v2, v3, 0x70CFCE3);
        }
    }

    static final void ay(lo arg5) {
        int v0;
        for(v0 = 0; v0 < ho.av * 0xC3B65FA7; ++v0) {
            int v1 = ho.aa[v0];
            hw v2 = client.jf[v1];
            int v3 = arg5.ay(-7);
            if((v3 & 1) != 0) {
                v3 += arg5.ay(-74) << 8;
            }

            dd.ad(arg5, v1, v2, v3, 2071108197);
        }
    }

    static int az(lo arg3) {
        int v3;
        int v0 = 2;
        int v1 = arg3.jo(v0, 0x9345710B);
        if(v1 == 0) {
            v3 = 0;
        }
        else if(v1 == 1) {
            v3 = arg3.jo(5, 0x9F229F91);
        }
        else if(v1 == v0) {
            v3 = arg3.jo(8, 0xCA7C0589);
        }
        else {
            v3 = arg3.jo(11, -1696111850);
        }

        return v3;
    }

    static void ba() {
        int v0 = 0;
        ho.ap = 0;
        while(v0 < 0x800) {
            ho.an[v0] = null;
            ho.ar[v0] = 1;
            ++v0;
        }
    }

    static void bd() {
        int v0 = 0;
        ho.ap = 0;
        while(v0 < 0x800) {
            ho.an[v0] = null;
            ho.ar[v0] = 1;
            ++v0;
        }
    }

    static void bf() {
        int v0 = 0;
        ho.ap = 0;
        while(v0 < 0x800) {
            ho.an[v0] = null;
            ho.ar[v0] = 1;
            ++v0;
        }
    }
}

