public class db {
    static final int ab = 0x200;
    final int ae;
    public static final int aj = 0x20000000;
    static final db al = null;
    public static final int ar = 5;
    static final db ax = null;
    public static final int bi = 58;
    static final int ew = 14;

    static {
        db.ax = new db(0);
        db.al = new db(1);
    }

    db(int arg3) {
        try {
            super();
            this.ae = arg3 * -560670911;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("db.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected static final boolean adh(int arg2) {
        try {
            return jz.us.ai(0x7FB839ED);
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("db.adh(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int an(CharSequence arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        arg4 -= arg3;
        for(arg7 = 0; arg7 < arg4; ++arg7) {
            int v0 = arg7 + arg3;
            try {
                v0 = arg2.charAt(v0);
                if(v0 <= 0 || v0 >= 0x80) {
                    if(v0 >= 0xA0 && v0 <= 0xFF) {
                    label_12:
                        arg5[arg7 + arg6] = ((byte)v0);
                        goto label_181;
                    }

                    if(v0 == 0x20AC) {
                        arg5[arg6 + arg7] = -128;
                        goto label_181;
                    }

                    if(v0 == 0x201A) {
                        arg5[arg7 + arg6] = -126;
                        goto label_181;
                    }

                    if(402 == v0) {
                        arg5[arg6 + arg7] = -125;
                        goto label_181;
                    }

                    if(0x201E == v0) {
                        arg5[arg7 + arg6] = -124;
                        goto label_181;
                    }

                    if(8230 == v0) {
                        arg5[arg6 + arg7] = -123;
                        goto label_181;
                    }

                    if(0x2020 == v0) {
                        arg5[arg7 + arg6] = -122;
                        goto label_181;
                    }

                    if(0x2021 == v0) {
                        arg5[arg6 + arg7] = -121;
                        goto label_181;
                    }

                    if(710 == v0) {
                        arg5[arg6 + arg7] = -120;
                        goto label_181;
                    }

                    if(0x2030 == v0) {
                        arg5[arg6 + arg7] = -119;
                        goto label_181;
                    }

                    if(v0 == 0x160) {
                        arg5[arg6 + arg7] = -118;
                        goto label_181;
                    }

                    if(v0 == 0x2039) {
                        arg5[arg7 + arg6] = -117;
                        goto label_181;
                    }

                    if(338 == v0) {
                        arg5[arg6 + arg7] = -116;
                        goto label_181;
                    }

                    if(v0 == 381) {
                        arg5[arg7 + arg6] = -114;
                        goto label_181;
                    }

                    if(v0 == 0x2018) {
                        arg5[arg6 + arg7] = -111;
                        goto label_181;
                    }

                    if(0x2019 == v0) {
                        arg5[arg6 + arg7] = -110;
                        goto label_181;
                    }

                    if(8220 == v0) {
                        arg5[arg6 + arg7] = -109;
                        goto label_181;
                    }

                    if(0x201D == v0) {
                        arg5[arg6 + arg7] = -108;
                        goto label_181;
                    }

                    if(0x2022 == v0) {
                        arg5[arg6 + arg7] = -107;
                        goto label_181;
                    }

                    if(v0 == 0x2013) {
                        arg5[arg7 + arg6] = -106;
                        goto label_181;
                    }

                    if(0x2014 == v0) {
                        arg5[arg7 + arg6] = -105;
                        goto label_181;
                    }

                    if(v0 == 732) {
                        arg5[arg6 + arg7] = -104;
                        goto label_181;
                    }

                    if(v0 == 8482) {
                        arg5[arg6 + arg7] = -103;
                        goto label_181;
                    }

                    if(353 == v0) {
                        arg5[arg6 + arg7] = -102;
                        goto label_181;
                    }

                    if(v0 == 8250) {
                        arg5[arg6 + arg7] = -101;
                        goto label_181;
                    }

                    if(339 == v0) {
                        arg5[arg7 + arg6] = -100;
                        goto label_181;
                    }

                    if(382 == v0) {
                        arg5[arg6 + arg7] = -98;
                        goto label_181;
                    }

                    if(376 == v0) {
                        arg5[arg6 + arg7] = -97;
                        goto label_181;
                    }

                    arg5[arg7 + arg6] = 0x3F;
                }
                else {
                    goto label_12;
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("db.an(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }

        label_181:
        }

        return arg4;
    }

    static final void ce(ie arg5, int arg6) {
        try {
            arg6 = arg5.dv * 0xF925C7C7 - client.bj * -2077001153;
            int v0 = arg5.by * 0x346259C0 + arg5.cq * 0xFFBB6F80;
            int v2 = arg5.cg * 0x5ED06380 + arg5.by * 0x346259C0;
            arg5.bp += (v0 - arg5.bp * 0x914F0683) / arg6 * 0x3CF9F82B;
            arg5.bw += (v2 - arg5.bw * 0xD19D0C3D) / arg6 * -410326251;
            arg5.dy = 0;
            arg5.du = arg5.dh * 0x3268BB5;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("db.ce(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    static final void ho(int arg2) {
        arg2 = -1926460729;
        try {
            fq.aq(arg2);
            if(ai.oq != null) {
                ai.oq.dl(0x21C29AFB);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("db.ho(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

