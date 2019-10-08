public class hc implements Runnable {
    public static final int ab = 10;
    public static final int af = 55;
    volatile ht[] ax;
    public static final int bw = 38;

    hc() {
        try {
            super();
            this.ax = new ht[2];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ac(ki arg0, String arg1, byte arg2) {
        try {
            iz v2 = new iz(arg0, arg1);
            client.rv.add(v2);
            client.ry += v2.ae * 0x753487BF;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hc.ac(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void ae() {
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                ht v1 = this.ax[v0];
                if(v1 != null) {
                    v1.ax(0xED3ACC04);
                }
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), -1536668904);
                return;
            }
        }
    }

    public void al() {
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                ht v1 = this.ax[v0];
                if(v1 != null) {
                    v1.ax(0x992E0E0B);
                }
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), -1472294043);
                return;
            }
        }
    }

    public void ar() {
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                ht v1 = this.ax[v0];
                if(v1 != null) {
                    v1.ax(-440794094);
                }
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), -2085029978);
                return;
            }
        }
    }

    static cv ax(byte[] arg1, byte arg2) {
        if(arg1 != null) {
            goto label_4;
        }

        try {
            return new cv();
        label_4:
            return new cv(ah.ax(arg1, 0).ax);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("hc.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ax() {
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                ht v1 = this.ax[v0];
                if(v1 != null) {
                    v1.ax(0x1E809756);
                }
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), 0x1DB7057F);
                return;
            }
        }
    }

    static final boolean gc(ar arg5, byte arg6) {
        int v6;
        try {
            if(arg5.fo == null) {
                return 0;
            }

            v6 = 0;
            while(true) {
            label_5:
                if(v6 >= arg5.fo.length) {
                    return 1;
                }

                int v1 = bd.gl(arg5, v6, 27);
                int v2 = arg5.fu[v6];
                if(arg5.fo[v6] == 2) {
                    if(v1 >= v2) {
                        return 0;
                    }
                }
                else if(arg5.fo[v6] == 3) {
                    if(v1 <= v2) {
                        return 0;
                    }
                }
                else if(arg5.fo[v6] == 4) {
                    break;
                }
                else {
                    goto label_30;
                }

                goto label_32;
            }
        }
        catch(RuntimeException v5) {
            goto label_38;
        }

        if(v1 == v2) {
            return 0;
        label_30:
            if(v1 != v2) {
                return 0;
            }
        }

    label_32:
        ++v6;
        goto label_5;
        return 1;
    label_38:
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("hc.gc(");
        v6_1.append(')');
        throw lx.al(((Throwable)v5), v6_1.toString());
    }

    public void run() {
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                ht v1 = this.ax[v0];
                if(v1 != null) {
                    v1.ax(0xADFECBDA);
                }
            }
            catch(RuntimeException v0_1) {
            }
            catch(Exception v0_2) {
                String v1_1 = null;
                int v2 = 0x1D642A02;
                try {
                    po.ax(v1_1, ((Throwable)v0_2), v2);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_2 = new StringBuilder();
                    v1_2.append("hc.run(");
                    v1_2.append(')');
                    throw lx.al(((Throwable)v0_1), v1_2.toString());
                }
            }
        }
    }
}

