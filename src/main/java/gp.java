public class gp extends ht {
    static final int cr = 1;

    gp() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gp.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void al() {
        __monitor_enter(this);
        int v0 = 0;
        while(true) {
            int v1 = 556110035;
            try {
                if(v0 >= this.aa * v1) {
                    break;
                }

                this.af(this.af, 0x100);
                v0 += 0x100;
                continue;
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    static void an(lo arg18, int arg19, byte arg20) {
        int v10;
        int v0_2;
        int v6;
        lo v0 = arg18;
        int v1 = arg19;
        int v2 = 0x99640198;
        try {
            v2 = v0.jo(1, v2) == 1 ? 1 : 0;
            if(v2 != 0) {
                int[] v5 = ho.aa;
                v6 = ho.av + 0x4FE45817;
                ho.av = v6;
                v5[v6 * 0xC3B65FA7 - 1] = v1;
            }

            v6 = 2;
            int v5_1 = v0.jo(v6, 0x8FCE6B32);
            hw v7 = client.jf[v1];
            int v8 = -900939569;
            if(v5_1 == 0) {
                if(v2 != 0) {
                    v7.ba = false;
                    return;
                }

                if(v1 != client.ja * v8) {
                    ho.ab[v1] = (ad.fi * 474770003 + v7.dc[0] >> 13 << 14) + (v7.as * 0xD54EB40F << 28) + (nr.fo * 0x519F9BE7 + v7.dj[0] >> 13);
                    ho.af[v1] = v7.cc * 0xD35D6E49 != -1 ? v7.cc * 0xD35D6E49 : v7.du * 0xE97D9C4B;
                    ho.ai[v1] = v7.cy * 0x5A6E7359;
                    client.jf[v1] = null;
                    if(v0.jo(1, 0xAF2421D8) != 0) {
                        mm.ap(v0, v1, 0x565A554F);
                    }

                    return;
                }

                throw new RuntimeException();
            }

            int v9 = 4;
            int v11 = 0xE9EBF4E3;
            int v12 = 3;
            int v13 = 0x2E00;
            int v14 = 0xD19D0C3D;
            int v15 = 0x600;
            int v16 = 0x914F0683;
            if(1 == v5_1) {
                v0_2 = v0.jo(v12, 0xB1321BDC);
                v5_1 = v7.dc[0];
                v10 = v7.dj[0];
                if(v0_2 == 0) {
                    --v5_1;
                    --v10;
                }
                else if(v0_2 == 1) {
                    --v10;
                }
                else if(v0_2 == v6) {
                    ++v5_1;
                    --v10;
                }
                else if(v0_2 == v12) {
                    --v5_1;
                }
                else if(v9 == v0_2) {
                    ++v5_1;
                }
                else if(5 == v0_2) {
                    --v5_1;
                    ++v10;
                }
                else if(v0_2 == 6) {
                    ++v10;
                }
                else if(v0_2 == 7) {
                    ++v5_1;
                    ++v10;
                }

                if(v1 == client.ja * v8) {
                    if(v7.bp * v16 >= v15 && v7.bw * v14 >= v15 && v7.bp * v16 < v13 && v7.bw * v14 < v13) {
                        goto label_152;
                    }

                    v7.ab(v5_1, v10, -87);
                    v7.ba = false;
                }
                else {
                label_152:
                    if(v2 != 0) {
                        v7.ba = true;
                        v7.bf = v5_1 * v11;
                        v7.bn = v10 * 104601795;
                        return;
                    }

                    v7.ba = false;
                    v7.aq(v5_1, v10, ho.ar[v1], 21);
                }

                return;
            }

            if(v6 == v5_1) {
                v0_2 = v0.jo(v9, -1572410941);
                v5_1 = v7.dc[0];
                v10 = v7.dj[0];
                if(v0_2 == 0) {
                    v5_1 += -2;
                    v10 += -2;
                }
                else if(1 == v0_2) {
                    --v5_1;
                    v10 += -2;
                }
                else if(v0_2 == v6) {
                    v10 += -2;
                }
                else if(v12 == v0_2) {
                    ++v5_1;
                    v10 += -2;
                }
                else if(v0_2 == v9) {
                    v5_1 += 2;
                    v10 += -2;
                }
                else if(v0_2 == 5) {
                    v5_1 += -2;
                    --v10;
                }
                else if(6 == v0_2) {
                    v5_1 += 2;
                    --v10;
                }
                else if(7 == v0_2) {
                    v5_1 += -2;
                }
                else if(8 == v0_2) {
                    v5_1 += 2;
                }
                else if(9 == v0_2) {
                    v5_1 += -2;
                    ++v10;
                }
                else if(v0_2 == 10) {
                    v5_1 += 2;
                    ++v10;
                }
                else if(v0_2 == 11) {
                    v5_1 += -2;
                    v10 += 2;
                }
                else if(12 == v0_2) {
                    --v5_1;
                    v10 += 2;
                }
                else if(v0_2 == 13) {
                    v10 += 2;
                }
                else if(14 == v0_2) {
                    ++v5_1;
                    v10 += 2;
                }
                else if(15 == v0_2) {
                    v5_1 += 2;
                    v10 += 2;
                }

                if(client.ja * v8 == v1) {
                    if(v7.bp * v16 >= v15 && v7.bw * v14 >= v15 && v7.bp * v16 < v13 && v7.bw * v14 < v13) {
                        goto label_262;
                    }

                    v7.ab(v5_1, v10, -78);
                    v7.ba = false;
                }
                else {
                label_262:
                    if(v2 != 0) {
                        v7.ba = true;
                        v7.bf = v5_1 * v11;
                        v7.bn = v10 * 104601795;
                        return;
                    }

                    v7.ba = false;
                    v7.aq(v5_1, v10, ho.ar[v1], -23);
                }

                return;
            }

            if(v0.jo(1, 0xA0540F09) == 0) {
                v0_2 = v0.jo(12, 0xC78FB1FB);
                v5_1 = v0_2 >> 10;
                v6 = v0_2 >> 5 & 0x1F;
                if(v6 > 15) {
                    v6 += 0xFFFFFFE0;
                }

                v0_2 &= 0x1F;
                if(v0_2 > 15) {
                    v0_2 += 0xFFFFFFE0;
                }

                v9 = v7.dc[0] + v6;
                v0_2 += v7.dj[0];
                if(v1 == client.ja * v8) {
                    if(v7.bp * v16 >= v15 && v7.bw * v14 >= v15 && v7.bp * v16 < v13 && v7.bw * v14 < v13) {
                        goto label_317;
                    }

                    v7.ab(v9, v0_2, -2);
                    v7.ba = false;
                }
                else {
                label_317:
                    if(v2 != 0) {
                        v7.ba = true;
                        v7.bf = v9 * v11;
                        v7.bn = v0_2 * 104601795;
                        goto label_330;
                    }

                    v7.ba = false;
                    v7.aq(v9, v0_2, ho.ar[v1], 75);
                }

            label_330:
                v7.as = (((byte)(v5_1 + v7.as * 0xD54EB40F & 3))) * 0x491DBAEF;
                if(client.ja * v8 == v1) {
                    kt.jz = v7.as * 1904695735;
                }

                return;
            }

            v0_2 = v0.jo(30, -1004549867);
            v5_1 = v0_2 >> 28;
            v6 = (v7.dc[0] + ad.fi * 474770003 + (v0_2 >> 14 & 0x3FFF) & 0x3FFF) - ad.fi * 474770003;
            v0_2 = ((v0_2 & 0x3FFF) + (v7.dj[0] + nr.fo * 0x519F9BE7) & 0x3FFF) - nr.fo * 0x519F9BE7;
            if(client.ja * v8 == v1) {
                if(v7.bp * v16 >= v15 && v7.bw * v14 >= v15 && v7.bp * v16 < v13 && v7.bw * v14 < v13) {
                    goto label_397;
                }

                v7.ab(v6, v0_2, -84);
                v7.ba = false;
            }
            else {
            label_397:
                if(v2 != 0) {
                    v7.ba = true;
                    v7.bf = v6 * v11;
                    v7.bn = v0_2 * 104601795;
                    goto label_410;
                }

                v7.ba = false;
                v7.aq(v6, v0_2, ho.ar[v1], 8);
            }

        label_410:
            v7.as = (((byte)(v7.as * 0xD54EB40F + v5_1 & v12))) * 0x491DBAEF;
            if(v1 == client.ja * v8) {
                kt.jz = v7.as * 1904695735;
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("gp.an(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    void ax(int arg3) {
        __monitor_enter(this);
        arg3 = 0;
        while(true) {
            int v0 = 556110035;
            try {
                if(arg3 >= this.aa * v0) {
                    break;
                }

                this.af(this.af, 0x100);
                arg3 += 0x100;
                continue;
            }
            catch(Throwable v3) {
            }
            catch(RuntimeException v3_1) {
                try {
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("gp.ax(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v3_1), v0_1.toString());
                }
                catch(Throwable v3) {
                    __monitor_exit(this);
                    throw v3;
                }
            }
        }

        __monitor_exit(this);
    }

    static final void eu(byte arg2) {
        try {
            mx v2_1;
            for(v2_1 = client.kw.aj(); v2_1 != null; v2_1 = client.kw.aq()) {
                if(((io)v2_1).ai * 0xD0BE2B1 == -1) {
                    ((io)v2_1).af = 0;
                    ev.ee(((io)v2_1), 1203191850);
                }
                else {
                    ((io)v2_1).lp();
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_20;
        }

        return;
    label_20:
        StringBuilder v0 = new StringBuilder();
        v0.append("gp.eu(");
        v0.append(')');
        throw lx.al(((Throwable)v2), v0.toString());
    }
}

