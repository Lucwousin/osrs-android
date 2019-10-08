public class ir extends mx {
    dd ae;
    static final int al = 4;
    static final byte ap = 0;
    fb ar;
    static final int ax = 4;
    static final int dh = 24;

    ir(dd arg3) {
        try {
            super();
            this.ar = new fb();
            this.ae = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ir.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    boolean ae(int arg3) {
        try {
            return this.ar.aq();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ir.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void af(ar arg0, int arg1, int arg2) {
        try {
            if(arg0.dr != null) {
                if(arg0.gn == null) {
                    arg0.gn = new int[arg0.dr.length];
                }

                arg0.gn[arg1] = 0x7FFFFFFF;
                return;
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ir.af(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static od aj(ko arg0, ko arg1, int arg2, int arg3, int arg4) {
        arg4 = 0x402C0C43;
        try {
            if(!au.at(arg0, arg2, arg3, arg4)) {
                return null;
            }

            return jt.ah(arg1.ae(arg2, arg3, 0x78DC0DC9), 59);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ir.aj(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    boolean aj() {
        return this.ar.aq();
    }

    hv al(int arg6, int arg7) {
        hv v0;
        try {
            mx v7 = this.ar.an();
            v0 = null;
            if(v7 != null) {
                int v2 = 1554176203;
                if(((hv)v7).ax * v2 > arg6) {
                }
                else {
                    mx v1 = this.ar.aj();
                    while(true) {
                        mx v4 = v1;
                        v1 = v7;
                        v7 = v4;
                        if(v7 != null && ((hv)v7).ax * v2 <= arg6) {
                            ((hv)v1).lp();
                            v1 = this.ar.aj();
                            continue;
                        }

                        break;
                    }

                    if(((hv)v1).ar * 0x3BF80DBD + ((hv)v1).ax * v2 + this.ae.ai * 0x641ED929 > arg6) {
                        return ((hv)v1);
                    }

                    ((hv)v1).lp();
                    return v0;
                }
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7_1 = new StringBuilder();
            v7_1.append("ir.al(");
            v7_1.append(')');
            throw lx.al(((Throwable)v6), v7_1.toString());
        }

        return v0;
    }

    hv an(int arg7) {
        mx v2;
        mx v0 = this.ar.an();
        hv v1 = null;
        if(v0 != null) {
            int v3 = 1554176203;
            if(((hv)v0).ax * v3 > arg7) {
                return v1;
            }

            while(true) {
                v2 = v0;
                v0 = this.ar.aj();
                if(v0 != null && ((hv)v0).ax * v3 <= arg7) {
                    ((hv)v2).lp();
                    continue;
                }

                break;
            }

            if(((hv)v2).ar * 0xE07E1DE4 + ((hv)v2).ax * -983059221 + this.ae.ai * 0x641ED929 > arg7) {
                return ((hv)v2);
            }

            ((hv)v2).lp();
            return v1;
        }

        return v1;
    }

    boolean ap() {
        return this.ar.aq();
    }

    public static byte[] ar(CharSequence arg4, int arg5) {
        int v1;
        byte[] v0;
        try {
            arg5 = arg4.length();
            v0 = new byte[arg5];
            v1 = 0;
            while(true) {
            label_3:
                if(v1 >= arg5) {
                    return v0;
                }

                int v2 = arg4.charAt(v1);
                if(v2 <= 0 || v2 >= 0x80) {
                    if(v2 >= 0xA0 && v2 <= 0xFF) {
                    label_12:
                        v0[v1] = ((byte)v2);
                        break;
                    }

                    if(v2 == 0x20AC) {
                        v0[v1] = -128;
                        break;
                    }

                    if(v2 == 0x201A) {
                        v0[v1] = -126;
                        break;
                    }

                    if(402 == v2) {
                        v0[v1] = -125;
                        break;
                    }

                    if(v2 == 0x201E) {
                        v0[v1] = -124;
                        break;
                    }

                    if(v2 == 8230) {
                        v0[v1] = -123;
                        break;
                    }

                    if(0x2020 == v2) {
                        v0[v1] = -122;
                        break;
                    }

                    if(v2 == 0x2021) {
                        v0[v1] = -121;
                        break;
                    }

                    if(v2 == 710) {
                        v0[v1] = -120;
                        break;
                    }

                    if(v2 == 0x2030) {
                        v0[v1] = -119;
                        break;
                    }

                    if(0x160 == v2) {
                        v0[v1] = -118;
                        break;
                    }

                    if(0x2039 == v2) {
                        v0[v1] = -117;
                        break;
                    }

                    if(338 == v2) {
                        v0[v1] = -116;
                        break;
                    }

                    if(v2 == 381) {
                        v0[v1] = -114;
                        break;
                    }

                    if(0x2018 == v2) {
                        v0[v1] = -111;
                        break;
                    }

                    if(0x2019 == v2) {
                        v0[v1] = -110;
                        break;
                    }

                    if(8220 == v2) {
                        v0[v1] = -109;
                        break;
                    }

                    if(0x201D == v2) {
                        v0[v1] = -108;
                        break;
                    }

                    if(v2 == 0x2022) {
                        v0[v1] = -107;
                        break;
                    }

                    if(0x2013 == v2) {
                        v0[v1] = -106;
                        break;
                    }

                    if(v2 == 0x2014) {
                        v0[v1] = -105;
                        break;
                    }

                    if(v2 == 732) {
                        v0[v1] = -104;
                        break;
                    }

                    if(8482 == v2) {
                        v0[v1] = -103;
                        break;
                    }

                    if(353 == v2) {
                        v0[v1] = -102;
                        break;
                    }

                    if(8250 == v2) {
                        v0[v1] = -101;
                        break;
                    }

                    if(339 == v2) {
                        v0[v1] = -100;
                        break;
                    }

                    if(v2 == 382) {
                        v0[v1] = -98;
                        break;
                    }

                    if(376 == v2) {
                        v0[v1] = -97;
                        break;
                    }

                    v0[v1] = 0x3F;
                }
                else {
                    goto label_12;
                }

                break;
            }
        }
        catch(RuntimeException v4) {
            goto label_157;
        }

        ++v1;
        goto label_3;
        return v0;
    label_157:
        StringBuilder v5 = new StringBuilder();
        v5.append("ir.ar(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    void ar(int arg10, int arg11, int arg12, int arg13) {
        int v0 = 0;
        mx v2 = null;
        mx v3;
        for(v3 = this.ar.an(); v3 != null; v3 = this.ar.aj()) {
            ++v0;
            int v4 = 1554176203;
            if(((hv)v3).ax * v4 == arg10) {
                ((hv)v3).ax(arg10, arg11, arg12, arg13, 0x4194860);
                return;
            }

            if(((hv)v3).ax * v4 <= arg10) {
                v2 = v3;
            }
        }

        int v1 = 4;
        if(v2 == null) {
            if(v0 < v1) {
                this.ar.ae(new hv(arg10, arg11, arg12, arg13));
            }

            return;
        }

        fb.ar(new hv(arg10, arg11, arg12, arg13), v2);
        if(v0 >= v1) {
            this.ar.an().lp();
        }
    }

    void ax(int arg9, int arg10, int arg11, int arg12, int arg13) {
        mx v13 = null;
        int v0 = 0;
        try {
            mx v2;
            for(v2 = this.ar.an(); v2 != null; v2 = this.ar.aj()) {
                ++v0;
                int v3 = 1554176203;
                if(((hv)v2).ax * v3 == arg9) {
                    ((hv)v2).ax(arg9, arg10, arg11, arg12, 0x2943027A);
                    return;
                }

                if(((hv)v2).ax * v3 <= arg9) {
                    v13 = v2;
                }
            }

            int v1 = 4;
            if(v13 == null) {
                if(v0 < v1) {
                    this.ar.ae(new hv(arg9, arg10, arg11, arg12));
                }

                return;
            }

            fb.ar(new hv(arg9, arg10, arg11, arg12), v13);
            if(v0 >= v1) {
                this.ar.an().lp();
            }
        }
        catch(RuntimeException v9) {
            goto label_44;
        }

        return;
    label_44:
        StringBuilder v10 = new StringBuilder();
        v10.append("ir.ax(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }
}

