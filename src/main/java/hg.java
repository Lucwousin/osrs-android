public class hg {
    static final int al = 1;
    int an;
    int[][] ap;
    int ar;
    static final int ax = 14;
    static boolean az = false;
    static final int cf = 18;
    static final int pe = 50;

    public hg(int arg25, int arg26) {
        int v5;
        hg v1 = this;
        int v0 = arg25;
        int v2 = arg26;
        try {
            super();
            if(v2 == v0) {
                return;
            }

            int v3 = ed.al(v0, v2, -161050594);
            v0 /= v3;
            v2 /= v3;
            v1.ar = 0xAEFE8D93 * v0;
            v1.an = 0xCC383BF1 * v2;
            v3 = 14;
            v1.ap = new int[v0][v3];
            v5 = 0;
            while(true) {
            label_23:
                if(v5 >= v0) {
                    return;
                }

                int[] v6 = v1.ap[v5];
                double v9 = ((double)v0);
                double v7 = (((double)v5)) / v9 + 6;
                double v11 = 7;
                int v13 = ((int)Math.floor(v7 - v11 + 1));
                if(v13 < 0) {
                    v13 = 0;
                }

                int v11_1 = ((int)Math.ceil(v11 + v7));
                if(v11_1 > v3) {
                    v11_1 = 14;
                }

                double v14 = (((double)v2)) / v9;
                while(v13 < v11_1) {
                    v9 = (((double)v13)) - v7;
                    double v16 = 3.141593 * v9;
                    v16 = v16 < -0.0001 || v16 > 0.0001 ? v14 * (Math.sin(v16) / v16) : v14;
                    v6[v13] = ((int)Math.floor(v16 * (Math.cos(v9 * 0.224399) * 0.46 + 0.54) * 65536 + 0.5));
                    ++v13;
                }
            }
        }
        catch(RuntimeException v0_1) {
            goto label_85;
        }

        ++v5;
        goto label_23;
        return;
    label_85:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("hg.<init>(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    int ad(int arg5) {
        if(this.ap != null) {
            arg5 = (((int)((((long)(this.an * 0xEB2D5511))) * (((long)arg5)) / (((long)(this.ar * 0x738B989B)))))) + 6;
        }

        return arg5;
    }

    int ae(int arg3, int arg4) {
        try {
            if(this.ap != null) {
                arg3 = (((int)((((long)(this.an * 0xEB2D5511))) * (((long)arg3)) / (((long)(this.ar * 0x738B989B)))))) + 6;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hg.ae(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return arg3;
    }

    int aj(int arg5) {
        if(this.ap != null) {
            arg5 = (((int)((((long)(this.an * -84210200))) * (((long)arg5)) / (((long)(this.ar * 0xFBBF019F)))))) + 6;
        }

        return arg5;
    }

    int al(int arg3, byte arg4) {
        try {
            if(this.ap != null) {
                arg3 = ((int)((((long)(this.an * 0xEB2D5511))) * (((long)arg3)) / (((long)(this.ar * 0x738B989B)))));
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hg.al(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return arg3;
    }

    static final void an(byte[] arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, gy[] arg34, int arg35) {
        lq v4_1;
        int v25;
        int v24;
        int v23;
        int v10;
        int v11;
        lq v14;
        int v9;
        int v8;
        int v2 = arg31;
        int v3 = arg32;
        int v12 = arg33;
        int v4 = 0;
        while(true) {
        label_5:
            int v5 = 8;
            if(v4 >= v5) {
                goto label_27;
            }

            int v6 = 0;
            while(true) {
                if(v6 >= v5) {
                    goto label_25;
                }

                int v7 = arg28 + v4;
                if(v7 > 0) {
                    v8 = 103;
                    if(v7 < v8) {
                        v9 = arg29 + v6;
                        if(v9 > 0 && v9 < v8) {
                            try {
                                arg34[arg27].bx[v7][v9] &= 0xFEFFFFFF;
                            label_23:
                                ++v6;
                                continue;
                            label_25:
                                ++v4;
                                goto label_5;
                            label_27:
                                v14 = new lq(arg26);
                                v11 = 0;
                                while(true) {
                                label_31:
                                    if(v11 >= 4) {
                                        return;
                                    }

                                    v10 = 0;
                                    while(true) {
                                    label_34:
                                        v9 = 0x40;
                                        if(v10 >= v9) {
                                            goto label_95;
                                        }

                                        v8 = 0;
                                        while(true) {
                                        label_37:
                                            if(v8 >= v9) {
                                                goto label_90;
                                            }

                                            if(v11 != arg30 || v10 < v2 || v10 >= v2 + 8 || v8 < v3 || v8 >= v3 + 8) {
                                                v23 = v8;
                                                v24 = v10;
                                                v25 = v11;
                                                v4_1 = v14;
                                                hj.aj(v14, 0, -1, -1, 0, 0, 0, 322063829);
                                            }
                                            else {
                                                v4 = v10 & 7;
                                                v5 = v8 & 7;
                                                v23 = v8;
                                                v24 = v10;
                                                v25 = v11;
                                                hj.aj(v14, arg27, arg28 + bs.ax(v4, v5, v12, 0x30), arg29 + ao.al(v4, v5, v12, -34), 0, 0, arg33, 322063829);
                                                v4_1 = v14;
                                            }

                                            goto label_84;
                                        }
                                    }
                                }
                            }
                            catch(RuntimeException v0) {
                                goto label_102;
                            }
                        }
                    }
                }

                goto label_23;
            }
        }

    label_84:
        v8 = v23 + 1;
        v14 = v4_1;
        v10 = v24;
        v11 = v25;
        v9 = 0x40;
        goto label_37;
    label_90:
        ++v10;
        goto label_34;
    label_95:
        ++v11;
        goto label_31;
        return;
    label_102:
        StringBuilder v1 = new StringBuilder();
        v1.append("hg.an(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }

    int an(int arg5) {
        if(this.ap != null) {
            arg5 = ((int)((((long)(this.an * 0xEB2D5511))) * (((long)arg5)) / (((long)(this.ar * 0x738B989B)))));
        }

        return arg5;
    }

    int ap(int arg5) {
        if(this.ap != null) {
            arg5 = ((int)((((long)(this.an * 0xC6E0DC6D))) * (((long)arg5)) / (((long)(this.ar * 0x6A82AE07)))));
        }

        return arg5;
    }

    int aq(int arg5) {
        if(this.ap != null) {
            arg5 = (((int)((((long)(this.an * 0xEB2D5511))) * (((long)arg5)) / (((long)(this.ar * 0x738B989B)))))) + 6;
        }

        return arg5;
    }

    static String ar(lq arg8, int arg9, int arg10) {
        short v10 = 0x31FD;
        try {
            arg10 = arg8.by(v10);
            if(arg10 > arg9) {
            }
            else {
                arg9 = arg10;
            }

            byte[] v10_1 = new byte[arg9];
            arg8.ar += kz.ax.al(arg8.ae, 0xF24F550B * arg8.ar, v10_1, 0, arg9, 0xCE483945) * -1880437085;
            return df.ap(v10_1, 0, arg9, 0x7EF87CF7);
        }
        catch(RuntimeException v8) {
        }
        catch(Exception ) {
            try {
                return "Cabbage";
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("hg.ar(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }
    }

    byte[] ar(byte[] arg18) {
        hg v0 = this;
        byte[] v1 = arg18;
        if(v0.ap != null) {
            int v3 = 0xEB2D5511;
            int v6 = 0x738B989B;
            int v4 = 14;
            int v2 = (((int)((((long)(v0.an * v3))) * (((long)v1.length)) / (((long)(v0.ar * v6)))))) + v4;
            int[] v5 = new int[v2];
            int v7 = 0;
            int v8 = 0;
            int v9 = 0;
            int v10 = 0;
            while(v8 < v1.length) {
                int v11 = v1[v8];
                int[] v12 = v0.ap[v9];
                int v13;
                for(v13 = 0; v13 < v4; ++v13) {
                    int v14 = v10 + v13;
                    v5[v14] += v12[v13] * v11;
                }

                v9 += v0.an * v3;
                v11 = v9 / (v0.ar * v6);
                v10 += v11;
                v9 -= v0.ar * v6 * v11;
                ++v8;
            }

            v1 = new byte[v2];
            while(v7 < v2) {
                v3 = v5[v7] + 0x8000 >> 16;
                byte v4_1 = -128;
                if(v3 < v4_1) {
                    v1[v7] = v4_1;
                }
                else {
                    v4_1 = 0x7F;
                    v1[v7] = v3 > v4_1 ? v4_1 : ((byte)v3);
                }

                ++v7;
            }
        }

        return v1;
    }

    byte[] ax(byte[] arg18, int arg19) {
        int v7;
        hg v1 = this;
        byte[] v0 = arg18;
        try {
            if(v1.ap != null) {
                int v3 = 0xEB2D5511;
                int v6 = 0x738B989B;
                int v4 = 14;
                int v2 = (((int)((((long)(v1.an * v3))) * (((long)v0.length)) / (((long)(v1.ar * v6)))))) + v4;
                int[] v5 = new int[v2];
                v7 = 0;
                int v8 = 0;
                int v9 = 0;
                int v10 = 0;
                while(v8 < v0.length) {
                    int v11 = v0[v8];
                    int[] v12 = v1.ap[v9];
                    int v13;
                    for(v13 = 0; v13 < v4; ++v13) {
                        int v14 = v10 + v13;
                        v5[v14] += v12[v13] * v11;
                    }

                    v9 += v1.an * v3;
                    v11 = v9 / (v1.ar * v6);
                    v10 += v11;
                    v9 -= v1.ar * v6 * v11;
                    ++v8;
                }

                v0 = new byte[v2];
                while(true) {
                label_53:
                    if(v7 < v2) {
                        v3 = v5[v7] + 0x8000 >> 16;
                        byte v4_1 = -128;
                        if(v3 < v4_1) {
                            v0[v7] = v4_1;
                        }
                        else {
                            v4_1 = 0x7F;
                            v0[v7] = v3 > v4_1 ? v4_1 : ((byte)v3);
                        }

                        goto label_68;
                    }

                    return v0;
                }
            }

            return v0;
        }
        catch(RuntimeException v0_1) {
            goto label_73;
        }

    label_68:
        ++v7;
        goto label_53;
    label_73:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("hg.ax(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
        return v0;
    }

    static final void eg(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        io v12_1;
        mx v12 = null;
        try {
            mx v0;
            for(v0 = client.kw.aj(); v0 != null; v0 = client.kw.aq()) {
                if(((io)v0).ax * 0x647472F3 == arg3 && arg4 == ((io)v0).ae * 0xFFA278D3 && arg5 == ((io)v0).ar * 0x9D0B1463 && ((io)v0).al * 0x15137909 == arg6) {
                    v12 = v0;
                    break;
                }
            }

            if(v12 == null) {
                v12_1 = new io();
                v12_1.ax = arg3 * -411240901;
                v12_1.al = arg6 * 0xFA7DE539;
                v12_1.ae = arg4 * 0x467C9F5B;
                v12_1.ar = arg5 * 0x7CE80D4B;
                ev.ee(v12_1, 0x33917F48);
                client.kw.al(((mx)v12_1));
            }

            v12_1.ad = arg7 * 0x19BEBF8D;
            v12_1.ab = arg8 * -2041144925;
            v12_1.aq = arg9 * 0x372560B5;
            v12_1.af = arg10 * 2000649055;
            v12_1.ai = arg11 * 617031249;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hg.eg(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

