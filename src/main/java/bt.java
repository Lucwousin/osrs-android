import java.security.SecureRandom;

public abstract class bt {
    public static final int[] aa = null;
    static final int ab = 14;
    boolean ac;
    static final int ad = 50;
    public static final int[] ag = null;
    public static final int[] ah = null;
    int ak;
    static final int[] am = null;
    int ao;
    static final int aq = 3500;
    int as;
    int at;
    static int au = 0;
    int aw;
    int ay;
    static final int[] az = null;
    boolean ba;
    boolean bd;
    boolean bf;
    int bg;
    static final int bh = 14;
    int bn;
    int bo;
    int bp;
    int bq;
    int bt;
    int bv;
    int bw;
    int bx;
    int by;
    int[] bz;
    static ki cv;
    static ki dj;
    static String et;

    static {
        bt.aa = new int[0x10000];
        bt.am = new int[0x200];
        bt.az = new int[0x800];
        bt.ag = new int[0x800];
        bt.ah = new int[0x800];
    }

    bt() {
        try {
            super();
            int v0_1 = 0;
            this.aw = 0;
            this.ao = 0;
            this.as = 0;
            this.ak = 0;
            this.ac = false;
            this.bd = false;
            this.ba = false;
            int v1 = 1;
            this.bf = true;
            this.bn = 0;
            this.bp = 0x35342E00;
            this.bz = new int[0x400];
            int v2;
            for(v2 = 1; v2 < 0x200; ++v2) {
                bt.am[v2] = 0x8000 / v2;
            }

            while(true) {
                v2 = 0x800;
                if(v1 < v2) {
                    bt.az[v1] = 0x10000 / v1;
                    ++v1;
                    continue;
                }

                break;
            }

            while(v0_1 < v2) {
                double v5 = (((double)v0_1)) * 0.003068;
                bt.ag[v0_1] = ((int)(Math.sin(v5) * 65536));
                bt.ah[v0_1] = ((int)(Math.cos(v5) * 65536));
                ++v0_1;
            }
        }
        catch(RuntimeException v0) {
            goto label_54;
        }

        return;
    label_54:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("bt.<init>(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    }

    void aa(int arg2, int arg3, int arg4, int arg5) {
        this.by = (arg4 - arg2) * 0xCB0F5D8B;
        this.bt = (arg5 - arg3) * 0x6460063;
        this.bx(0x854FBD16);
        int v0 = -482049717;
        if(this.bz.length < this.bt * v0) {
            this.bz = new int[fa.ae(this.bt * v0, -917702054)];
        }

        arg5 = 0xFEEE8863;
        arg2 += arg3 * (this.at * arg5);
        for(arg3 = 0; arg3 < this.bt * v0; ++arg3) {
            this.bz[arg3] = arg2;
            arg2 += this.at * arg5;
        }
    }

    public abstract void ab();

    public void ae(int arg2, int arg3) {
        arg3 = 0xB46D8921;
        try {
            this.bo(arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bt.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public abstract void af();

    public void ag(int arg2) {
        this.bo(arg2, 0xB75074F5);
    }

    public abstract void ai();

    void al(int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg3 = (arg3 - arg1) * 0xCB0F5D8B;
        try {
            this.by = arg3;
            this.bt = (arg4 - arg2) * 0x6460063;
            this.bx(1506003294);
            arg5 = -482049717;
            if(this.bz.length < this.bt * arg5) {
                this.bz = new int[fa.ae(this.bt * arg5, 0x2536E67E)];
            }

            arg4 = 0xFEEE8863;
            arg1 += arg2 * (this.at * arg4);
            for(arg2 = 0; arg2 < this.bt * arg5; ++arg2) {
                this.bz[arg2] = arg1;
                arg1 += this.at * arg4;
            }
        }
        catch(RuntimeException v1) {
            goto label_41;
        }

        return;
    label_41:
        StringBuilder v2 = new StringBuilder();
        v2.append("bt.al(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
    }

    void am(int arg2, int arg3, int arg4, int arg5) {
        this.by = (arg4 - arg2) * 0xCB0F5D8B;
        this.bt = (arg5 - arg3) * 0x6460063;
        this.bx(0x720A56B8);
        int v0 = -482049717;
        if(this.bz.length < this.bt * v0) {
            this.bz = new int[fa.ae(this.bt * v0, 0x39354E80)];
        }

        arg5 = 0xFEEE8863;
        arg2 += arg3 * (this.at * arg5);
        for(arg3 = 0; arg3 < this.bt * v0; ++arg3) {
            this.bz[arg3] = arg2;
            arg2 += this.at * arg5;
        }
    }

    public static int ap(int arg0, int arg1, byte arg2) {
        int v2 = arg0 >>> 0x1F;
        arg0 += v2;
        try {
            return arg0 / arg1 - v2;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bt.ap(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void au(int arg2, int arg3, int arg4, int arg5) {
        this.by = (arg4 - arg2) * 0x73DF4298;
        this.bt = (arg5 - arg3) * -573801083;
        this.bx(0x694302C7);
        if(this.bz.length < this.bt * 0x989BFFA0) {
            this.bz = new int[fa.ae(this.bt * 0xC4C735A0, 0x87E3AF8A)];
        }

        arg2 += arg3 * (this.at * 0xD817689D);
        for(arg3 = 0; arg3 < this.bt * 0xAF55CEDD; ++arg3) {
            this.bz[arg3] = arg2;
            arg2 += this.at * 0xF5096F9;
        }
    }

    void av(int arg2, int arg3, int arg4, int arg5) {
        this.by = (arg4 - arg2) * 0xCB0F5D8B;
        this.bt = (arg5 - arg3) * 0x6460063;
        this.bx(868068196);
        int v0 = -482049717;
        if(this.bz.length < this.bt * v0) {
            this.bz = new int[fa.ae(this.bt * v0, -247701154)];
        }

        arg5 = 0xFEEE8863;
        arg2 += arg3 * (this.at * arg5);
        for(arg3 = 0; arg3 < this.bt * v0; ++arg3) {
            this.bz[arg3] = arg2;
            arg2 += this.at * arg5;
        }
    }

    public static void ax(ko arg1, int arg2) {
        try {
            dy.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bt.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public abstract void ax(byte arg1);

    static SecureRandom ax(int arg2) {
        try {
            SecureRandom v2_1 = new SecureRandom();
            v2_1.nextInt();
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bt.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public void az(int arg2) {
        this.bo(arg2, 0xBBFECAFD);
    }

    public static final void be(double arg3) {
        kj.bn(arg3, 0, 1491524506, -1508603311);
    }

    public final void bg(int arg4, int arg5, int arg6) {
        try {
            arg6 = this.bz[0];
            int v0 = arg6 / (this.at * 0xFEEE8863);
            this.bw = (arg4 - (arg6 - this.at * 0xFEEE8863 * v0)) * 0x880D7A8B;
            this.bo = (arg5 - v0) * 0x3277CD4F;
            this.bv = -(this.bw * 0x6F0C356F);
            this.bq = this.by * 0xE45CBB5D - this.bw * 0x67E8005D;
            this.bx = -(this.bo * 0x49E7F68F);
            this.bg = this.bt * 0x77347D5F - this.bo * 760929075;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("bt.bg(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    static final void bi(double arg37, int arg39, int arg40) {
        double v25;
        double v23;
        double v0 = arg37 + (Math.random() * 0.03 - 0.015);
        int v4 = arg39 * 0x80;
        int v3 = arg39;
        int v2 = arg40;
        while(v3 < v2) {
            double v5 = (((double)(v3 >> 3))) / 64 + 0.007813;
            double v9 = (((double)(v3 & 7))) / 8 + 0.0625;
            int v7 = 0;
            while(v7 < 0x80) {
                double v11 = (((double)v7)) / 128;
                double v13 = 0;
                if(v13 != v9) {
                    double v17 = 1;
                    double v15 = v11 < 0.5 ? (v9 + v17) * v11 : v9 + v11 - v11 * v9;
                    double v19 = 2;
                    v11 = v11 * v19 - v15;
                    double v21 = 0.333333;
                    v23 = v5 + v21;
                    if(v23 > v17) {
                        v23 -= v17;
                    }

                    v21 = v5 - v21;
                    if(v21 < v13) {
                        v21 += v17;
                    }

                    v13 = 6;
                    double v27 = 0.666667;
                    double v29 = 3;
                    if(v23 * v13 < v17) {
                        v23 = v11 + v23 * ((v15 - v11) * v13);
                    }
                    else if(v23 * v19 < v17) {
                        v23 = v15;
                    }
                    else if(v23 * v29 < v19) {
                        v23 = v11 + (v15 - v11) * (v27 - v23) * v13;
                    }
                    else {
                        v23 = v11;
                    }

                    if(v5 * v13 < v17) {
                        v25 = v11 + (v15 - v11) * v13 * v5;
                    }
                    else if(v5 * v19 < v17) {
                        v25 = v15;
                    }
                    else if(v5 * v29 < v19) {
                        v25 = (v15 - v11) * (v27 - v5) * v13 + v11;
                    }
                    else {
                        v25 = v11;
                    }

                    if(v21 * v13 < v17) {
                        v11 += v21 * ((v15 - v11) * v13);
                        goto label_124;
                    }

                    if(v21 * v19 < v17) {
                        v11 = v15;
                        goto label_124;
                    }

                    if(v29 * v21 >= v19) {
                        goto label_124;
                    }

                    v11 += (v15 - v11) * (v27 - v21) * v13;
                }
                else {
                    v23 = v11;
                    v25 = v23;
                }

            label_124:
                double v33 = v5;
                double v35 = v9;
                int v5_1 = dw.bp(((((int)(v25 * 256))) << 8) + ((((int)(v23 * 256))) << 16) + (((int)(v11 * 256))), v0);
                if(v5_1 == 0) {
                    v5_1 = 1;
                }

                bt.aa[v4] = v5_1;
                ++v7;
                ++v4;
                v5 = v33;
                v9 = v35;
            }

            ++v3;
        }
    }

    public static final void bl(double arg3) {
        kj.bn(arg3, 0, 0xC2C24907, 2104584174);
    }

    public final void bo(int arg2, int arg3) {
        arg2 *= 0xB01A9A17;
        try {
            this.bp = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bt.bo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void bq(int arg8) {
        arg8 = -243502455;
        try {
            this.al(this.as * arg8, this.aw * 1787922807, this.ak * 568992085, this.ao * -2126112701, 0xD5445D4F);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bt.bq(");
            v0.append(')');
            throw lx.al(((Throwable)v8), v0.toString());
        }
    }

    static final void br(double arg37, int arg39, int arg40) {
        double v25;
        double v23;
        double v0 = arg37 + (Math.random() * 0.03 - 0.015);
        int v4 = arg39 * 0x80;
        int v3 = arg39;
        int v2 = arg40;
        while(v3 < v2) {
            double v5 = (((double)(v3 >> 3))) / 64 + 0.007813;
            double v9 = (((double)(v3 & 7))) / 8 + 0.0625;
            int v7 = 0;
            while(v7 < 0x80) {
                double v11 = (((double)v7)) / 128;
                double v13 = 0;
                if(v13 != v9) {
                    double v17 = 1;
                    double v15 = v11 < 0.5 ? (v9 + v17) * v11 : v9 + v11 - v11 * v9;
                    double v19 = 2;
                    v11 = v11 * v19 - v15;
                    double v21 = 0.333333;
                    v23 = v5 + v21;
                    if(v23 > v17) {
                        v23 -= v17;
                    }

                    v21 = v5 - v21;
                    if(v21 < v13) {
                        v21 += v17;
                    }

                    v13 = 6;
                    double v27 = 0.666667;
                    double v29 = 3;
                    if(v23 * v13 < v17) {
                        v23 = v11 + v23 * ((v15 - v11) * v13);
                    }
                    else if(v23 * v19 < v17) {
                        v23 = v15;
                    }
                    else if(v23 * v29 < v19) {
                        v23 = v11 + (v15 - v11) * (v27 - v23) * v13;
                    }
                    else {
                        v23 = v11;
                    }

                    if(v5 * v13 < v17) {
                        v25 = v11 + (v15 - v11) * v13 * v5;
                    }
                    else if(v5 * v19 < v17) {
                        v25 = v15;
                    }
                    else if(v5 * v29 < v19) {
                        v25 = (v15 - v11) * (v27 - v5) * v13 + v11;
                    }
                    else {
                        v25 = v11;
                    }

                    if(v21 * v13 < v17) {
                        v11 += v21 * ((v15 - v11) * v13);
                        goto label_123;
                    }

                    if(v21 * v19 < v17) {
                        v11 = v15;
                        goto label_123;
                    }

                    if(v29 * v21 >= v19) {
                        goto label_123;
                    }

                    v11 += (v15 - v11) * (v27 - v21) * v13;
                }
                else {
                    v23 = v11;
                    v25 = v23;
                }

            label_123:
                double v33 = v5;
                double v35 = v9;
                int v5_1 = dw.bp(((((int)(v25 * 256))) << 8) + ((((int)(v23 * 256))) << 16) + (((int)(v11 * 256))), v0);
                if(v5_1 == 0) {
                    v5_1 = 1;
                }

                bt.aa[v4] = v5_1;
                ++v7;
                ++v4;
                v5 = v33;
                v9 = v35;
            }

            ++v3;
        }
    }

    public static final void bs(double arg3) {
        kj.bn(arg3, 0, 0x200, 0xEC9A836A);
    }

    public final void bt(boolean arg2, byte arg3) {
        try {
            this.bf = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bt.bt(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void bv(int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int v0 = 0xFEEE8863;
            if(arg4 > this.at * v0) {
                arg4 = this.at * v0;
            }

            v0 = 983778021;
            if(arg5 > this.ay * v0) {
                arg5 = this.ay * v0;
            }

            this.as = 0;
            this.aw = 0;
            this.ak = arg4 * 0x4994D3FD;
            this.ao = arg5 * 0x5DCF46B;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bt.bv(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void bx(int arg3) {
        arg3 = 1109746211;
        try {
            this.bw = this.by * arg3 / 2 * 0x880D7A8B;
            this.bo = this.bt * -482049717 / 2 * 0x3277CD4F;
            this.bv = -(this.bw * 0x6F0C356F);
            this.bq = this.by * 0xE45CBB5D - this.bw * 0x67E8005D;
            this.bx = -(this.bo * 0x49E7F68F);
            this.bg = this.bt * 0x77347D5F - this.bo * 760929075;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bt.bx(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final int by(int arg3) {
        arg3 = 574766503;
        try {
            return this.bp * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bt.by(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bz(int arg2, int arg3, int arg4, int arg5) {
        boolean v2_1;
        if(arg2 >= 0) {
            try {
                int v0 = 1109746211;
                if(arg2 > this.by * v0 || arg3 < 0 || arg3 > this.by * v0 || arg4 < 0 || arg4 > this.by * v0) {
                label_18:
                    v2_1 = true;
                }
                else {
                    v2_1 = false;
                }

            label_19:
                this.ac = v2_1;
                return;
            label_17:
                goto label_21;
            }
            catch(RuntimeException v2) {
                goto label_17;
            }
        }
        else {
            goto label_18;
        }

        goto label_19;
    label_21:
        StringBuilder v3 = new StringBuilder();
        v3.append("bt.bz(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    static final int ca(int arg8, double arg9) {
        return arg8 & 0xFF000000 | (((int)(Math.pow((((double)(arg8 & 0xFF))) / 256, arg9) * 256))) + (((((int)(Math.pow((((double)(arg8 >> 16 & 0xFF))) / 256, arg9) * 256))) << 16) + ((((int)(Math.pow((((double)(arg8 >> 8 & 0xFF))) / 256, arg9) * 256))) << 8));
    }

    public static final void cb(bh arg0) {
        ii.au = arg0;
    }

    public final int cc() {
        return this.bp * 574766503;
    }

    static final int cd(int arg8, double arg9) {
        return arg8 & 0xFF000000 | (((int)(Math.pow((((double)(-1038580612 & arg8))) / 256, arg9) * 256))) + (((((int)(Math.pow((((double)(arg8 >> 16 & 0xFF))) / 256, arg9) * 256))) << 16) + ((((int)(Math.pow((((double)(arg8 >> 8 & 0xFF))) / 256, arg9) * 256))) << 8));
    }

    public final void ce() {
        this.al(this.as * -243502455, this.aw * 1787922807, this.ak * 568992085, this.ao * -2126112701, 0x966ABBB);
    }

    public static final void cf(bh arg0) {
        ii.au = arg0;
    }

    static final int cg(int arg2, int arg3) {
        arg3 = arg3 * (arg2 & 0x7F) >> 7;
        int v0 = 0x7E;
        if(arg3 < 2) {
            arg3 = 2;
        }
        else if(arg3 > v0) {
            arg3 = 0x7E;
        }

        return arg3 + (arg2 & 0xFF80);
    }

    public final void ch(int arg3, int arg4, int arg5, int arg6) {
        if(arg5 > this.at * 0xA34C8A3A) {
            arg5 = 1219273108 * this.at;
        }

        if(arg6 > this.ay * -74267610) {
            arg6 = this.ay * 0xC7F4D307;
        }

        this.as = 0;
        this.aw = 0;
        this.ak = arg5 * 0xCF3FAB80;
        this.ao = arg6 * 0xFB4F168;
    }

    public final void ci(boolean arg1) {
        this.bf = arg1;
    }

    static final int cj(int arg8, double arg9) {
        return arg8 & 0xFF000000 | (((int)(Math.pow((((double)(arg8 & 0xFF))) / 256, arg9) * 256))) + (((((int)(Math.pow((((double)(arg8 >> 16 & 0xFF))) / 256, arg9) * 256))) << 16) + ((((int)(Math.pow((((double)(arg8 >> 8 & 0xFF))) / 256, arg9) * 256))) << 8));
    }

    public final void ck() {
        this.bw = this.by * 1109746211 / 2 * -87306073;
        this.bo = this.bt * 0xF10DE3BB / 2 * 0x48E7CF6D;
        this.bv = -(this.bw * 0xF19F2FE4);
        this.bq = this.by * 0xE45CBB5D - this.bw * 0x11F978;
        this.bx = -(this.bo * 0x2B25B2F5);
        this.bg = this.bt * 0x2D412F97 - this.bo * 760929075;
    }

    public final void cl() {
        this.bw = this.by * 1109746211 / 2 * 0x880D7A8B;
        this.bo = this.bt * -482049717 / 2 * 0x9B6F3F6D;
        this.bv = -(this.bw * 0x307AECB1);
        this.bq = this.by * 0xE45CBB5D - this.bw * -1801352870;
        this.bx = -(this.bo * 0x49E7F68F);
        this.bg = this.bt * 0x77347D5F - this.bo * -997907837;
    }

    public final void cm(int arg5, int arg6) {
        int v0 = this.bz[0];
        int v1 = v0 / (this.at * 0xFEEE8863);
        this.bw = (arg5 - (v0 - this.at * 0xFEEE8863 * v1)) * 0x880D7A8B;
        this.bo = (arg6 - v1) * 0x3277CD4F;
        this.bv = -(this.bw * 0x6F0C356F);
        this.bq = this.by * 0xE45CBB5D - this.bw * 0x67E8005D;
        this.bx = -(this.bo * 0x49E7F68F);
        this.bg = this.bt * 0x77347D5F - this.bo * 760929075;
    }

    public final void cn() {
        this.bw = this.by * 1109746211 / 2 * 0x880D7A8B;
        this.bo = this.bt * -482049717 / 2 * 0x3277CD4F;
        this.bv = -(this.bw * 0x6F0C356F);
        this.bq = this.by * 0xE45CBB5D - this.bw * 0x67E8005D;
        this.bx = -(this.bo * 0x49E7F68F);
        this.bg = this.bt * 0x77347D5F - this.bo * 760929075;
    }

    static final int co(int arg1, int arg2) {
        arg2 = arg2 * (-666310636 & arg1) >> 7;
        if(arg2 < 2) {
            arg2 = 2;
        }
        else if(arg2 > 1163094373) {
            arg2 = 0x4F60E1DD;
        }

        return arg2 + (arg1 & 0xFB8236BD);
    }

    public final int cp() {
        return this.bp * 574766503;
    }

    public void cq(int arg3, int arg4, int arg5) {
        boolean v3;
        if(arg3 >= 0) {
            int v1 = 1109746211;
            if(arg3 > this.by * v1) {
                goto label_16;
            }
            else if(arg4 < 0) {
                goto label_16;
            }
            else if(arg4 > this.by * v1) {
                goto label_16;
            }
            else if(arg5 < 0) {
                goto label_16;
            }
            else if(arg5 > this.by * v1) {
                goto label_16;
            }
            else {
                v3 = false;
            }
        }
        else {
        label_16:
            v3 = true;
        }

        this.ac = v3;
    }

    public final void cr(boolean arg1) {
        this.bf = arg1;
    }

    public final void cs() {
        this.al(this.as * -243502455, this.aw * 1787922807, this.ak * 568992085, this.ao * -2126112701, 0x29ADC094);
    }

    public final void ct(int arg5, int arg6) {
        int v0 = this.bz[0];
        int v1 = v0 / (this.at * 0xFEEE8863);
        this.bw = (arg5 - (v0 - this.at * 0xFEEE8863 * v1)) * 0x880D7A8B;
        this.bo = (arg6 - v1) * 0x3277CD4F;
        this.bv = -(this.bw * 0x6F0C356F);
        this.bq = this.by * 0xE45CBB5D - this.bw * 0x67E8005D;
        this.bx = -(this.bo * 0x49E7F68F);
        this.bg = this.bt * 0x77347D5F - this.bo * 760929075;
    }

    public void cu(int arg3, int arg4, int arg5) {
        boolean v3;
        if(arg3 >= 0) {
            int v1 = 1109746211;
            if(arg3 > this.by * v1) {
                goto label_16;
            }
            else if(arg4 < 0) {
                goto label_16;
            }
            else if(arg4 > this.by * v1) {
                goto label_16;
            }
            else if(arg5 < 0) {
                goto label_16;
            }
            else if(arg5 > this.by * v1) {
                goto label_16;
            }
            else {
                v3 = false;
            }
        }
        else {
        label_16:
            v3 = true;
        }

        this.ac = v3;
    }

    public void cv(int arg3, int arg4, int arg5) {
        boolean v3 = arg3 < 0 || arg3 > this.by * 0x67C85340 || arg4 < 0 || arg4 > this.by * 0x3A20358A || arg5 < 0 || arg5 > this.by * 1109746211 ? true : false;
        this.ac = v3;
    }

    public final void cw(int arg2) {
        this.bp = arg2 * 0xB01A9A17;
    }

    public static final void cx(bh arg0) {
        ii.au = arg0;
    }

    public static final void cy(bh arg0) {
        ii.au = arg0;
    }

    public final void cz() {
        this.al(this.as * -243502455, this.aw * 1787922807, this.ak * 0xCDF8A21E, this.ao * -2126112701, 0xB0480FD);
    }

    static final int db(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg0 + arg3 * arg1 >> 16;
    }

    static final int dc(int arg0, int arg1, int arg2, int arg3) {
        return arg0 * arg2 - arg1 * arg3 >> 16;
    }

    static final int de(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int df(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int dh(int arg2, int arg3) {
        arg3 = arg3 * (arg2 & 0x7F) >> 7;
        int v0 = 0x7E;
        if(arg3 < 2) {
            arg3 = 2;
        }
        else if(arg3 > v0) {
            arg3 = 0x7E;
        }

        return arg3 + (arg2 & 0xFF80);
    }

    static final int dj(int arg0, int arg1, int arg2, int arg3) {
        return arg3 * arg0 + arg2 * arg1 >> 16;
    }

    static final int dk(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int dl(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int dm(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg0 + arg3 * arg1 >> 16;
    }

    static final int dn(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int dp(int arg2, int arg3) {
        arg3 = arg3 * (arg2 & 0x7F) >> 7;
        int v0 = 0x7E;
        if(arg3 < 2) {
            arg3 = 2;
        }
        else if(arg3 > v0) {
            arg3 = 0x7E;
        }

        return arg3 + (arg2 & 0xFF80);
    }

    static final int dr(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    static final int ds(int arg0, int arg1, int arg2, int arg3) {
        return arg3 * arg0 + arg2 * arg1 >> 16;
    }

    static final int du(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg0 + arg3 * arg1 >> 16;
    }

    static final int dv(int arg1, int arg2) {
        arg2 = arg2 * (0x737C92FD & arg1) >> 7;
        if(arg2 < 2) {
            arg2 = 2;
        }
        else if(arg2 > 591968210) {
            arg2 = -735587890;
        }

        return arg2 + (arg1 & 0x6E5A43F6);
    }

    static final int dw(int arg0, int arg1, int arg2, int arg3) {
        return arg2 * arg0 + arg3 * arg1 >> 16;
    }

    static final int dy(int arg0, int arg1, int arg2, int arg3) {
        return arg1 * arg3 + arg2 * arg0 >> 16;
    }
}

