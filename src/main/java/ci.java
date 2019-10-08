public class ci {
    static final int af = 6;
    static final int ar = 100;
    public static final int be = 66;
    public static final int bp = 0x20;
    static boolean ch;
    static ef el;

    ci() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ci.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static final int al(double arg22, double arg24, double arg26) {
        double v0;
        double v16;
        double v2;
        double v6 = 0;
        if(v6 != arg24) {
            double v10 = 1;
            v2 = arg26 < 0.5 ? (arg24 + v10) * arg26 : arg26 + arg24 - arg24 * arg26;
            double v8 = 2;
            double v4 = arg26 * v8 - v2;
            double v12 = 0.333333;
            double v14 = arg22 + v12;
            if(v14 > v10) {
                v14 -= v10;
            }

            v12 = arg22 - v12;
            if(v12 < v6) {
                v12 += v10;
            }

            v6 = 6;
            double v18 = 0.666667;
            double v20 = 3;
            if(v14 * v6 < v10) {
                v16 = v4 + (v2 - v4) * v6 * v14;
            }
            else if(v14 * v8 < v10) {
                v16 = v2;
            }
            else if(v14 * v20 < v8) {
                v16 = v4 + (v2 - v4) * (v18 - v14) * v6;
            }
            else {
                v16 = v4;
            }

            if(arg22 * v6 < v10) {
                v0 = arg22 * ((v2 - v4) * v6) + v4;
            }
            else if(arg22 * v8 < v10) {
                v0 = v2;
            }
            else if(arg22 * v20 < v8) {
                v0 = (v18 - arg22) * (v2 - v4) * v6 + v4;
            }
            else {
                v0 = v4;
            }

            if(v12 * v6 < v10) {
                v2 = v12 * ((v2 - v4) * v6) + v4;
                goto label_93;
            }

            if(v12 * v8 < v10) {
                goto label_93;
            }

            if(v20 * v12 < v8) {
                v2 = v4 + (v18 - v12) * (v2 - v4) * v6;
                goto label_93;
            }

            v2 = v4;
        }
        else {
            v0 = arg26;
            v2 = v0;
            v16 = v2;
        }

    label_93:
        return (((int)(v2 * 256))) + (((((int)(v0 * 256))) << 8) + ((((int)(v16 * 256))) << 16));
    }

    static final void gf(int arg13, byte arg14) {
        fr v13_2;
        float v1;
        short v14 = 17050;
        try {
            ht.gz(v14);
            cu.al(0x4C314E0E);
            int v14_1 = id.al(arg13, 3607).ar * 3307661;
            if(v14_1 == 0) {
                return;
            }

            arg13 = an.ae[arg13];
            if(1 == v14_1) {
                switch(arg13) {
                    case 1: {
                        v1 = 0.9f;
                        break;
                    }
                    case 2: {
                        v1 = 0.8f;
                        break;
                    }
                    case 3: {
                        v1 = 0.7f;
                        break;
                    }
                    default: {
                        v1 = 0.6f;
                        break;
                    }
                }

                if(client.al.au) {
                    v1 -= 0.1f;
                }

                client.al.uu.ab(v1, 657700690);
                du.ao(0x80E03CC2);
            }

            int v1_1 = -1;
            int v2 = 2;
            int v3 = 4;
            int v4 = 3;
            if(v14_1 == v4) {
                int v6 = arg13 == 0 ? 0xFF : 0;
                if(1 == arg13) {
                    v6 = 0xC0;
                }

                if(arg13 == v2) {
                    v6 = 0x80;
                }

                if(arg13 == v4) {
                    v6 = 0x40;
                }

                if(arg13 == v3) {
                    v6 = 0;
                }

                int v8 = 0x3310F9D5;
                if(v6 == client.pc * v8) {
                    goto label_83;
                }

                if(client.pc * v8 == 0) {
                    v8 = 2029067435;
                    if(v1_1 != client.pm * v8) {
                        ik.ae(gn.dv, v8 * client.pm, 0, v6, false, -104);
                        client.po = false;
                    }
                    else {
                        goto label_73;
                    }
                }
                else {
                label_73:
                    if(v6 == 0) {
                        gb.an(-279037700);
                        client.po = false;
                    }
                    else {
                        cd.ar(v6, 1234582940);
                    }
                }

                client.pc = v6 * 0x9044777D;
            }

        label_83:
            if(v3 == v14_1) {
                if(arg13 == 0) {
                    client.pb = 0x5C38031B;
                }

                if(1 == arg13) {
                    client.pb = 0x5BE1C5E0;
                }

                if(v2 == arg13) {
                    client.pb = 0xE7EBD940;
                }

                if(v4 == arg13) {
                    client.pb = 0x73F5ECA0;
                }

                if(v3 != arg13) {
                    goto label_98;
                }

                client.pb = 0;
            }

        label_98:
            if(v14_1 == 5) {
                client.kd = 0xE031279D * arg13;
            }

            if(v14_1 == 6) {
                client.lr = 0xC552F833 * arg13;
            }

            if(9 == v14_1) {
                client.lz = 0x3A70E0AD * arg13;
            }

            if(v14_1 == 10) {
                if(arg13 == 0) {
                    client.py = 0x7484FFED;
                }

                if(1 == arg13) {
                    client.py = 0x43EB9720;
                }

                if(v2 == arg13) {
                    client.py = 0xD7F264C0;
                }

                if(v4 == arg13) {
                    client.py = 0x6BF93260;
                }

                if(arg13 != v3) {
                    goto label_129;
                }

                client.py = 0;
            }

        label_129:
            if(v14_1 == 17) {
                client.lg = (0xFFFF & arg13) * -112770721;
            }

            v2 = 0x5091E1D4;
            if(v14_1 == 18) {
                lh v0 = eh.ax(ae.al(v2), arg13, 0x762A0936);
                if(v0 == null) {
                    fr v0_1 = fr.ax;
                }

                fh.kf.cd(((fr)v0), 0x6FC07723);
            }

            if(19 == v14_1) {
                client.ke = v1_1 == arg13 ? -507845255 : (arg13 & 0x7FF) * 507845255;
            }

            if(22 == v14_1) {
                lh v13_1 = eh.ax(ae.al(v2), arg13, 0xD4798D5);
                if(v13_1 == null) {
                    v13_2 = fr.ax;
                }

                fh.kf.cf(v13_2, 0xC1987A0F);
            }
        }
        catch(RuntimeException v13) {
            StringBuilder v14_2 = new StringBuilder();
            v14_2.append("ci.gf(");
            v14_2.append(')');
            throw lx.al(((Throwable)v13), v14_2.toString());
        }
    }
}

