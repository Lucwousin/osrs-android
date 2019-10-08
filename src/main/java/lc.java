public class lc implements lv {
    public static final int ad = 1;
    String[] ae;
    static final int bq = 10;

    public lc(String[] arg3) {
        try {
            super();
            this.ae = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lc.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void al() {
        ah v0 = client.al.aba(0xC00B61EC).bh(0x683C2718);
        if(v0 != null) {
            v0.ah("npR101", 0x7F5D0EC0);
            if(this.ae.length != 0 && this.ae[0] != null) {
                v0.az(this.ae[0], -1);
            }
        }
    }

    public void ax(int arg3) {
        try {
            ah v3_1 = client.al.aba(0x9009B68D).bh(1500916773);
            if(v3_1 != null) {
                v3_1.ah("npR101", 0x7F0D7ED0);
                if(this.ae.length != 0 && this.ae[0] != null) {
                    v3_1.az(this.ae[0], -1);
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lc.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

