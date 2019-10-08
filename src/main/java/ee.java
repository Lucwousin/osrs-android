public class ee extends eg {
    public int aj;
    public int an;
    static final int ao = 0x1240102;
    public int ap;
    static ot dr;
    static bg fs;

    ee() {
        try {
            super();
            this.an = 0xB19017F;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ee.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void bb(int arg1, int arg2, int arg3) {
        arg1 *= 0xF4E6FE81;
        try {
            this.an = arg1;
            this.ap = arg2 * 0x25A047B9;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ee.bb(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int bc(int arg3) {
        arg3 = 0x297B4181;
        try {
            return this.an * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ee.bc(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int be() {
        return this.an * 977641043;
    }

    public boolean bi() {
        boolean v0 = this.an * 0x297B4181 > 0 ? true : false;
        return v0;
    }

    public int bj() {
        return this.an * 0x297B4181;
    }

    public boolean bk(byte arg3) {
        try {
            if(this.an * 0x297B4181 <= 0) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ee.bk(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public boolean bl() {
        boolean v0 = this.an * -2020747552 > 0 ? true : false;
        return v0;
    }

    void bm(int arg2, int arg3) {
        this.an = arg2 * 0xF4E6FE81;
        this.ap = arg3 * 0x25A047B9;
    }

    static int bo(int arg1, hl arg2, boolean arg3, int arg4) {
        int[] v1_1;
        int v3 = 1304812425;
        if(arg1 != 5504) {
            goto label_24;
        }

        try {
            il.ad -= 0x9521572;
            arg1 = il.aj[il.ad * v3];
            int v2 = il.aj[il.ad * v3 + 1];
            if(!client.pi) {
                du.cy(arg1, v2, 0x316F1172);
            }

            return 1;
        label_24:
            int v0 = 0x4A90AB9;
            if(5505 == arg1) {
                v1_1 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v1_1[v2 * v3 - 1] = client.hy * 0x720F8187;
                return 1;
            }

            if(5506 == arg1) {
                v1_1 = il.aj;
                v2 = il.ad + v0;
                il.ad = v2;
                v1_1[v2 * v3 - 1] = client.ht * 0x62C4AE09;
                return 1;
            }

            if(arg1 == 5530) {
                v1_1 = il.aj;
                v2 = il.ad - v0;
                il.ad = v2;
                arg1 = v1_1[v2 * v3];
                if(arg1 < 0) {
                    arg1 = 0;
                }

                client.hn = arg1 * 0x7421E05F;
                return 1;
            }

            if(arg1 != 5531) {
                return 2;
            }

            v1_1 = il.aj;
            v2 = il.ad + v0;
            il.ad = v2;
            v1_1[v2 * v3 - 1] = client.hn * 0xB8D87B9F;
            return 1;
        label_23:
        }
        catch(RuntimeException v1) {
            goto label_23;
        }

        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ee.bo(");
        v2_1.append(')');
        throw lx.al(((Throwable)v1), v2_1.toString());
        return 2;
    }

    public boolean br() {
        boolean v0 = this.an * 0x297B4181 > 0 ? true : false;
        return v0;
    }

    public int bs() {
        return this.an * 0x9582DC86;
    }

    public int bu() {
        return this.an * 0xA465ADF;
    }

    static boolean da(int arg2) {
        try {
            if((client.jy * 0x2324F123 & 8) == 0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ee.da(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }
}

