import com.jagex.jagex3.client.input.softkeyboard.ar;

public final class fj {
    public static final int ab = 9;
    public static final int ad = 10;
    public static final int af = 13;
    public static final int ai = 14;
    public static final int aj = 9;
    public static final int al = 3;
    public static final int an = 6;
    public static final int ap = 8;
    public static final int aq = 11;
    @Deprecated public static final int av = 15;
    public static final int ax = 1;
    static final int ay = 25;
    static int az;

    fj() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static ar ao(int arg2) {
        try {
            ar v2_1 = client.al.aba(-1276607172).az(1, 0x3310F9D5);
            v2_1.ao(da.ds, -2002582550);
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fj.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final int df(int arg12) {
        int v2;
        int v1;
        try {
            int v0 = 1101813865;
            if(li.rg.ae) {
                return kt.jz * v0;
            }

            arg12 = 3;
            int v3 = 0xD19D0C3D;
            int v4 = 0x914F0683;
            if(fy.hd * 0xAD05ECC3 < 310) {
                if(client.hr * 158061037 == 1) {
                    v1 = aq.hk * 0xBD6EF571 >> 7;
                    v2 = ma.hw * 0x438776D9 >> 7;
                }
                else {
                    v1 = gu.jg.bp * v4 >> 7;
                    v2 = gu.jg.bw * v3 >> 7;
                }

                int v5 = ag.hc * 0x594485D5 >> 7;
                int v6 = fg.hb * -1102211305 >> 7;
                if(v5 >= 0 && v6 >= 0) {
                    int v7 = 104;
                    if(v5 < v7) {
                        if(v6 >= v7) {
                        }
                        else {
                            if(v1 >= 0 && v2 >= 0 && v1 < v7) {
                                if(v2 >= v7) {
                                }
                                else {
                                    if((id.al[kt.jz * v0][v5][v6] & 4) != 0) {
                                        arg12 = kt.jz * v0;
                                    }

                                    v7 = v1 > v5 ? v1 - v5 : v5 - v1;
                                    int v8 = v2 > v6 ? v2 - v6 : v6 - v2;
                                    int v9 = 0x8000;
                                    int v10 = 0x10000;
                                    if(v7 > v8) {
                                        v8 = v8 * v10 / v7;
                                        while(true) {
                                            if(v1 == v5) {
                                                goto label_158;
                                            }

                                            if(v5 < v1) {
                                                ++v5;
                                            }
                                            else if(v5 > v1) {
                                                --v5;
                                            }

                                            if((id.al[kt.jz * v0][v5][v6] & 4) != 0) {
                                                arg12 = kt.jz * v0;
                                            }

                                            v9 += v8;
                                            if(v9 < v10) {
                                                continue;
                                            }

                                            v9 -= v10;
                                            if(v6 < v2) {
                                                ++v6;
                                            }
                                            else if(v6 > v2) {
                                                --v6;
                                            }

                                            if((id.al[kt.jz * v0][v5][v6] & 4) == 0) {
                                                continue;
                                            }

                                            arg12 = kt.jz * v0;
                                        }
                                    }

                                    if(v8 <= 0) {
                                        goto label_158;
                                    }

                                    v7 = v7 * v10 / v8;
                                    while(true) {
                                        if(v6 == v2) {
                                            goto label_158;
                                        }

                                        if(v6 < v2) {
                                            ++v6;
                                        }
                                        else if(v6 > v2) {
                                            --v6;
                                        }

                                        if((id.al[kt.jz * v0][v5][v6] & 4) != 0) {
                                            arg12 = kt.jz * v0;
                                        }

                                        v9 += v7;
                                        if(v9 < v10) {
                                            continue;
                                        }

                                        v9 -= v10;
                                        if(v5 < v1) {
                                            ++v5;
                                        }
                                        else if(v5 > v1) {
                                            --v5;
                                        }

                                        if((id.al[kt.jz * v0][v5][v6] & 4) == 0) {
                                            continue;
                                        }

                                        arg12 = kt.jz * v0;
                                    }
                                }
                            }

                            return kt.jz * v0;
                        }
                    }
                }

                return kt.jz * v0;
            }

        label_158:
            if(gu.jg.bp * v4 >= 0 && gu.jg.bw * v3 >= 0) {
                v2 = 0x3400;
                if(gu.jg.bp * v4 < v2) {
                    if(gu.jg.bw * v3 >= v2) {
                    }
                    else {
                        if((id.al[kt.jz * v0][gu.jg.bp * v4 >> 7][gu.jg.bw * v3 >> 7] & 4) != 0) {
                            arg12 = kt.jz * v0;
                        }

                        return arg12;
                    }
                }
            }

            return kt.jz * v0;
        }
        catch(RuntimeException v12) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("fj.df(");
            v0_1.append(')');
            throw lx.al(((Throwable)v12), v0_1.toString());
        }
    }

    static final int ez(int arg6, int arg7, int arg8, int arg9) {
        arg9 = arg6 >> 7;
        int v0 = arg7 >> 7;
        if(arg9 >= 0 && v0 >= 0) {
            int v1 = 103;
            if(arg9 <= v1) {
                if(v0 > v1) {
                }
                else {
                    if(arg8 < 3) {
                        try {
                            if((id.al[1][arg9][v0] & 2) == 2) {
                                ++arg8;
                            }

                        label_22:
                            arg6 &= 0x7F;
                            arg7 &= 0x7F;
                            int v3 = arg9 + 1;
                            int v5 = 0x80 - arg6;
                            v1 = id.ax[arg8][v3][v0] * arg6 + id.ax[arg8][arg9][v0] * v5 >> 7;
                            ++v0;
                            return (v5 * id.ax[arg8][arg9][v0] + arg6 * id.ax[arg8][v3][v0] >> 7) * arg7 + v1 * (0x80 - arg7) >> 7;
                        label_21:
                            goto label_57;
                        }
                        catch(RuntimeException v6) {
                            goto label_21;
                        }
                    }

                    goto label_22;
                label_57:
                    StringBuilder v7 = new StringBuilder();
                    v7.append("fj.ez(");
                    v7.append(')');
                    throw lx.al(((Throwable)v6), v7.toString());
                }
            }
        }

        return 0;
    }

    public static final boolean fy(int arg6, int arg7, long arg8) {
        try {
            if(ee.fs.bp(kt.jz * 1101813865, arg6, arg7, arg8) < 0) {
                return false;
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("fj.fy(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        boolean v6_1 = true;
        return v6_1;
    }
}

