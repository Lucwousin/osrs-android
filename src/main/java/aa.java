public class aa {
    public static final int ag = 20;
    public static final String ap = "cgcPRM";
    final boolean ax;
    static final int az = 5;
    public static final int bd = 28;
    static final int cj = 16;
    static int ek;

    public aa(boolean arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("aa.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean al() {
        return this.ax;
    }

    public static ef aq(ko arg0, String arg1, String arg2, byte arg3) {
        int v3 = 0xD4A3E869;
        try {
            int v1 = arg0.ay(arg1, v3);
            return dk.ar(arg0, v1, arg0.aw(v1, arg2, 1365400513), 0x3F);
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("aa.aq(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static final void ar(byte[] arg18, int arg19, int arg20, int arg21, int arg22, gy[] arg23, byte arg24) {
        int v15;
        int v14;
        int v3 = 0;
        while(true) {
        label_2:
            int v4 = 4;
            int v5 = 0x40;
            if(v3 >= v4) {
                goto label_29;
            }

            v4 = 0;
            while(true) {
            label_6:
                if(v4 >= v5) {
                    goto label_27;
                }

                int v6 = 0;
                while(true) {
                    if(v6 >= v5) {
                        goto label_25;
                    }

                    int v7 = v4 + arg19;
                    if(v7 > 0) {
                        int v8 = 103;
                        if(v7 < v8) {
                            int v9 = arg20 + v6;
                            if(v9 > 0 && v9 < v8) {
                                try {
                                    arg23[v3].bx[v7][v9] &= 0xFEFFFFFF;
                                label_23:
                                    ++v6;
                                    continue;
                                label_25:
                                    ++v4;
                                    goto label_6;
                                label_27:
                                    ++v3;
                                    goto label_2;
                                label_29:
                                    lq v3_1 = new lq(arg18);
                                    v14 = 0;
                                    while(true) {
                                    label_33:
                                        if(v14 >= v4) {
                                            return;
                                        }

                                        v15 = 0;
                                        while(true) {
                                        label_35:
                                            if(v15 >= v5) {
                                                goto label_53;
                                            }

                                            int v13;
                                            for(v13 = 0; true; ++v13) {
                                                if(v13 >= v5) {
                                                    goto label_51;
                                                }

                                                hj.aj(v3_1, v14, arg19 + v15, v13 + arg20, arg21, arg22, 0, 322063829);
                                            }
                                        }
                                    }
                                }
                                catch(RuntimeException v0) {
                                    goto label_58;
                                }
                            }
                        }
                    }

                    goto label_23;
                }
            }
        }

    label_51:
        ++v15;
        goto label_35;
    label_53:
        ++v14;
        goto label_33;
        return;
    label_58:
        StringBuilder v1 = new StringBuilder();
        v1.append("aa.ar(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }

    public boolean ax(byte arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("aa.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static boolean bd(byte arg3) {
        try {
            if(client.rv != null) {
                int v1 = 0x4CFB637B;
                if(client.rx * v1 >= client.rv.size()) {
                    return 1;
                }

                while(true) {
                    if(client.rx * v1 >= client.rv.size()) {
                        return 1;
                    }

                    if(!client.rv.get(client.rx * v1).ax(0x6C752996)) {
                        return 0;
                    }

                    client.rx += 0xC57D03B3;
                }
            }

            return 1;
        }
        catch(RuntimeException v3) {
            goto label_33;
        }

        return 1;
    label_33:
        StringBuilder v0 = new StringBuilder();
        v0.append("aa.bd(");
        v0.append(')');
        throw lx.al(((Throwable)v3), v0.toString());
        return 1;
    }
}

