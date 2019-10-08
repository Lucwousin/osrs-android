public class kg extends eq {
    static final int ac = 0x1240138;
    public static final int ag = 18;
    final boolean al;
    public static final int ci = 86;

    public kg(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kg.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg6, ee arg7, int arg8) {
        try {
            int v0 = 0x8076F529;
            int v2 = 0x297B4181;
            int v3 = 1;
            if(client.ae * v0 != arg6.an * v2) {
                if(client.ae * v0 != arg7.an * v2) {
                    goto label_28;
                }

                if(this.al) {
                }
                else {
                    v3 = -1;
                }

                return v3;
            }
            else if(arg7.an * v2 != client.ae * v0) {
                if(this.al) {
                    v3 = -1;
                }

                return v3;
            }

        label_28:
            return this.al(((eg)arg6), ((eg)arg7), 49);
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("kg.ab(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), -2093605746);
    }

    static int aj(int arg5, hl arg6, boolean arg7, int arg8) {
        arg8 = 0x4A90AB9;
        int v0 = 1304812425;
        if(arg5 >= 2000) {
            arg5 += -1000;
            try {
                int[] v6 = il.aj;
                int v7 = il.ad - arg8;
                il.ad = v7;
                ar v6_1 = bl.al(v6[v7 * v0], 0x64D7CF4D);
                goto label_18;
            label_14:
                v6_1 = arg7 ? il.aa : dw.av;
            label_18:
                kx.gw(v6_1, 0x7FBCE20E);
                int v1 = 0x4BC;
                int v2 = 1205;
                if(arg5 != 1200 && v2 != arg5) {
                    if(arg5 == v1) {
                    }
                    else {
                        v1 = 0x6015A63B;
                        if(arg5 == 1201) {
                            v6_1.cp = -1296555170;
                            int[] v5_1 = il.aj;
                            v7 = il.ad - arg8;
                            il.ad = v7;
                            v6_1.ci = v5_1[v7 * v0] * v1;
                            return 1;
                        }
                        else if(arg5 == 1202) {
                            v6_1.cp = 202650893;
                            v6_1.ci = gu.jg.al.aq(-19) * v1;
                            return 1;
                        }
                        else {
                            return 2;
                        }
                    }
                }

                il.ad -= 0x9521572;
                v7 = il.aj[il.ad * v0];
                arg8 = il.aj[il.ad * v0 + 1];
                v6_1.fq = 162011503 * v7;
                v6_1.fp = arg8 * 311012663;
                dr v7_1 = client.al(v7, 0x7B03DF4B);
                v6_1.cl = v7_1.ak * 0xE20C76AB;
                v6_1.ck = v7_1.ac * 0xCEACC4B9;
                v6_1.cm = v7_1.bd * 1468130953;
                v6_1.cz = v7_1.ba * 0xE5BE408F;
                v6_1.cn = v7_1.bf * 0xDAB63F35;
                v6_1.ct = v7_1.as * 0x43EFA677;
                arg8 = 0;
                if(arg5 == v2) {
                    v6_1.co = 0;
                }
                else {
                    arg5 = arg5 == v1 ? 1 : 0;
                    if(1 == v7_1.bn * 401368599) {
                        arg8 = 1;
                    }

                    if((arg5 | arg8) != 0) {
                        v6_1.co = 0x64AA6033;
                        goto label_120;
                    }

                    v6_1.co = 0xC954C066;
                }

            label_120:
                v7 = -1377940245;
                arg8 = 0x2CDAC8F9;
                v0 = 0xAEF2920;
                if(v6_1.cu * v7 > 0) {
                    v6_1.ct = v6_1.ct * v0 / (v6_1.cu * v7) * arg8;
                }
                else {
                    v7 = -1380766737;
                    if(v6_1.bn * v7 > 0) {
                        v6_1.ct = v6_1.ct * v0 / (v6_1.bn * v7) * arg8;
                    }
                }

                return 1;
            }
            catch(RuntimeException v5) {
                StringBuilder v6_2 = new StringBuilder();
                v6_2.append("kg.aj(");
                v6_2.append(')');
                throw lx.al(((Throwable)v5), v6_2.toString());
            }
        }
        else {
            goto label_14;
        }

        goto label_18;
        return 1;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 0x1073B60D);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0xFCD41B3);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("kg.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

