import java.util.Collection;

public class ek extends mv {
    public int ab;
    public int ad;
    static ek ae = null;
    public int af;
    protected static final String ah = "mglwnafh";
    public int ai;
    public int aj;
    static ek[] al = null;
    public int an;
    static final int ao = 40;
    public boolean ap;
    public int aq;
    public int ar;
    public static final int au = 62;
    public int av;
    static ko ax = null;
    public static final int ba = 28;
    public static final int bh = 42;
    public static int ix;

    static {
        ek.ae = new ek();
    }

    ek() {
        try {
            super();
            this.ar = 0;
            this.an = 0xFAAB630B;
            this.ap = true;
            this.aj = -1593470045;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ek.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg3, int arg4) {
        while(true) {
            int v0 = arg3.ay(-37);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, arg4, -112);
        }
    }

    public static void ab(Collection arg1, int arg2) {
        try {
            arg1.add(aj.ai);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ek.ab(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static ek ab(int arg1) {
        if(arg1 >= 0) {
            if(arg1 >= ek.al.length) {
            }
            else {
                return ek.al[arg1];
            }
        }

        return ek.ae;
    }

    public static void ad(ko arg4) {
        ek.ax = arg4;
        int v1 = 4;
        ek.al = new ek[arg4.au(v1, 0xB73056EB)];
        int v4;
        for(v4 = 0; v4 < ek.al.length; ++v4) {
            byte[] v0 = ek.ax.ae(v1, v4, 0x78DC0DC9);
            ek.al[v4] = new ek();
            if(v0 != null) {
                ek.al[v4].ar(new lq(v0), v4, -896906102);
            }

            ek.al[v4].ae(0xB7230E3E);
        }
    }

    void ae(int arg3) {
        arg3 = -1;
        try {
            int v1 = 0x7EE2C7F5;
            if(arg3 != this.aj * v1) {
                this.ap(this.aj * v1, 0x470E8003);
                this.af = this.ad * 448668105;
                this.ai = this.aq * 0x23D911F9;
                this.av = this.ab * 0xEA7FF363;
            }

            this.ap(this.ar * 0x670C51A7, 0x9EFDD76E);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ek.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void af() {
        if(-1 != this.aj * 0x713B23F4) {
            this.ap(this.aj * 0x7EE2C7F5, 1505666155);
            this.af = this.ad * 0x55D938F5;
            this.ai = this.aq * 0x32242371;
            this.av = this.ab * 0xF0F4771B;
        }

        this.ap(this.ar * 0x670C51A7, 0x32658EEF);
    }

    void ag(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(-2019289315) * 1007109655;
        }
        else if(2 == arg2) {
            this.an = arg1.ay(-111) * 0x5549CF5;
        }
        else if(arg2 == 5) {
            this.ap = false;
        }
        else if(arg2 == 7) {
            this.aj = arg1.ak(0xE2E1666B) * 1593470045;
        }
    }

    void ah(int arg27) {
        ek v0 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg27 >> 16 & v3))) / v6;
        double v8 = (((double)(arg27 >> 8 & v3))) / v6;
        double v1 = (((double)(arg27 & v3))) / v6;
        double v10 = v8 < v4 ? v8 : v4;
        if(v1 < v10) {
            v10 = v1;
        }

        double v12 = v8 > v4 ? v8 : v4;
        if(v1 > v12) {
            v12 = v1;
        }

        double v14 = v10 + v12;
        double v16 = 2;
        double v18 = v14 / v16;
        double v20 = 0;
        if(v12 != v10) {
            double v22 = 0.5;
            v14 = v18 < v22 ? (v12 - v10) / v14 : v20;
            if(v18 >= v22) {
                v14 = (v12 - v10) / (v16 - v12 - v10);
            }

            if(v4 == v12) {
                v20 = (v8 - v1) / (v12 - v10);
                goto label_67;
            }

            if(v8 == v12) {
                v20 = (v1 - v4) / (v12 - v10) + v16;
                goto label_67;
            }

            if(v1 != v12) {
                goto label_67;
            }

            v20 = (v4 - v8) / (v12 - v10) + 4;
        }
        else {
            v14 = v20;
        }

    label_67:
        v0.ad = (((int)(v20 / 6 * v6))) * 0xE106D0F;
        v0.aq = (((int)(v14 * v6))) * -1835637081;
        v0.ab = (((int)(v18 * v6))) * 304362961;
        int v2 = -2044927721;
        if(v0.aq * v2 < 0) {
            v0.aq = 0;
        }
        else if(v0.aq * v2 > v3) {
            v0.aq = 0x3D04059;
        }

        v2 = 0x703C4331;
        if(v0.ab * v2 < 0) {
            v0.ab = 0;
        }
        else if(v0.ab * v2 > v3) {
            v0.ab = 0x12119B2F;
        }
    }

    void ai() {
        int v1 = 0x7EE2C7F5;
        if(-1 != this.aj * v1) {
            this.ap(this.aj * v1, 0xA849E207);
            this.af = this.ad * 448668105;
            this.ai = this.aq * 0x23D911F9;
            this.av = this.ab * 0xEA7FF363;
        }

        this.ap(this.ar * 0x670C51A7, 0xFF48CC8);
    }

    public static void aj(ko arg4) {
        ek.ax = arg4;
        int v1 = 4;
        ek.al = new ek[arg4.au(v1, 0x3CF17AB0)];
        int v4;
        for(v4 = 0; v4 < ek.al.length; ++v4) {
            byte[] v0 = ek.ax.ae(v1, v4, 0x78DC0DC9);
            ek.al[v4] = new ek();
            if(v0 != null) {
                ek.al[v4].ar(new lq(v0), v4, -1019502720);
            }

            ek.al[v4].ae(0x381E3D1);
        }
    }

    void am(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(0xC8AD4E24) * 1007109655;
        }
        else if(2 == arg2) {
            this.an = arg1.ay(-105) * 0x5549CF5;
        }
        else if(arg2 == 5) {
            this.ap = false;
        }
        else if(arg2 == 7) {
            this.aj = arg1.ak(-1652041449) * 1593470045;
        }
    }

    void an(lq arg1, int arg2, int arg3, byte arg4) {
        if(1 == arg2) {
            arg2 = 0xCA20507F;
            try {
                this.ar = arg1.ak(arg2) * 1007109655;
                return;
            label_10:
                if(2 == arg2) {
                    this.an = arg1.ay(-24) * 0x5549CF5;
                }
                else if(arg2 == 5) {
                    this.ap = false;
                }
                else if(arg2 == 7) {
                    this.aj = arg1.ak(0x26A3E0AF) * 1593470045;
                    return;
                label_9:
                    goto label_31;
                }
            }
            catch(RuntimeException v1) {
                goto label_9;
            }
        }
        else {
            goto label_10;
        label_31:
            StringBuilder v2 = new StringBuilder();
            v2.append("ek.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ap(int arg29, int arg30) {
        ek v1 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg29 >> 16 & v3))) / v6;
        double v8 = (((double)(arg29 >> 8 & v3))) / v6;
        double v10 = (((double)(arg29 & v3))) / v6;
        double v12 = v8 < v4 ? v8 : v4;
        if(v10 < v12) {
            v12 = v10;
        }

        double v14 = v8 > v4 ? v8 : v4;
        if(v10 > v14) {
            v14 = v10;
        }

        double v16 = v12 + v14;
        double v18 = 2;
        double v20 = v16 / v18;
        double v22 = 0;
        if(v14 != v12) {
            double v24 = 0.5;
            v16 = v20 < v24 ? (v14 - v12) / v16 : v22;
            if(v20 >= v24) {
                v16 = (v14 - v12) / (v18 - v14 - v12);
            }

            if(v4 == v14) {
                v22 = (v8 - v10) / (v14 - v12);
                goto label_67;
            }

            if(v8 == v14) {
                v22 = (v10 - v4) / (v14 - v12) + v18;
                goto label_67;
            }

            if(v10 != v14) {
                goto label_67;
            }

            v22 = (v4 - v8) / (v14 - v12) + 4;
        }
        else {
            v16 = v22;
        }

    label_67:
        int v0 = (((int)(v22 / 6 * v6))) * 0xE106D0F;
        try {
            v1.ad = v0;
            v1.aq = (((int)(v16 * v6))) * -1835637081;
            v1.ab = (((int)(v20 * v6))) * 304362961;
            int v2 = -2044927721;
            if(v1.aq * v2 < 0) {
                v1.aq = 0;
            }
            else if(v1.aq * v2 > v3) {
                v1.aq = 0x3D04059;
            }

            v2 = 0x703C4331;
            if(v1.ab * v2 < 0) {
                v1.ab = 0;
            }
            else if(v1.ab * v2 > v3) {
                v1.ab = 0x12119B2F;
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ek.ap(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public static void aq(ko arg4) {
        ek.ax = arg4;
        int v1 = 4;
        ek.al = new ek[arg4.au(v1, -2057364940)];
        int v4;
        for(v4 = 0; v4 < ek.al.length; ++v4) {
            byte[] v0 = ek.ax.ae(v1, v4, 0x78DC0DC9);
            ek.al[v4] = new ek();
            if(v0 != null) {
                ek.al[v4].ar(new lq(v0), v4, 0xF02D293D);
            }

            ek.al[v4].ae(0x8FEA3760);
        }
    }

    void ar(lq arg2, int arg3, int arg4) {
        while(true) {
            byte v4 = -70;
            try {
                arg4 = arg2.ay(v4);
                if(arg4 == 0) {
                    return;
                }

                this.an(arg2, arg4, arg3, -96);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ek.ar(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    void at(int arg27) {
        ek v0 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg27 >> 16 & v3))) / v6;
        double v8 = (((double)(arg27 >> 8 & v3))) / v6;
        double v1 = (((double)(arg27 & v3))) / v6;
        double v10 = v8 < v4 ? v8 : v4;
        if(v1 < v10) {
            v10 = v1;
        }

        double v12 = v8 > v4 ? v8 : v4;
        if(v1 > v12) {
            v12 = v1;
        }

        double v14 = v10 + v12;
        double v16 = 2;
        double v18 = v14 / v16;
        double v20 = 0;
        if(v12 != v10) {
            double v22 = 0.5;
            v14 = v18 < v22 ? (v12 - v10) / v14 : v20;
            if(v18 >= v22) {
                v14 = (v12 - v10) / (v16 - v12 - v10);
            }

            if(v4 == v12) {
                v20 = (v8 - v1) / (v12 - v10);
                goto label_66;
            }

            if(v8 == v12) {
                v20 = (v1 - v4) / (v12 - v10) + v16;
                goto label_66;
            }

            if(v1 != v12) {
                goto label_66;
            }

            v20 = (v4 - v8) / (v12 - v10) + 4;
        }
        else {
            v14 = v20;
        }

    label_66:
        v0.ad = (((int)(v20 / 6 * v6))) * 0xE106D0F;
        v0.aq = (((int)(v14 * v6))) * -1835637081;
        v0.ab = (((int)(v18 * v6))) * 304362961;
        int v2 = -2044927721;
        if(v0.aq * v2 < 0) {
            v0.aq = 0;
        }
        else if(v0.aq * v2 > v3) {
            v0.aq = 0x3D04059;
        }

        v2 = 0x703C4331;
        if(v0.ab * v2 < 0) {
            v0.ab = 0;
        }
        else if(v0.ab * v2 > v3) {
            v0.ab = 0x12119B2F;
        }
    }

    void au(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(-88324750) * 1007109655;
        }
        else if(2 == arg2) {
            this.an = arg1.ay(-102) * 0x5549CF5;
        }
        else if(arg2 == 5) {
            this.ap = false;
        }
        else if(arg2 == 7) {
            this.aj = arg1.ak(0x8410082D) * 1593470045;
        }
    }

    void av(lq arg3, int arg4) {
        while(true) {
            int v0 = arg3.ay(-83);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, arg4, -16);
        }
    }

    public static boolean ax(ko arg0, ko arg1, ko arg2, ks arg3, int arg4) {
        try {
            kv.ax = arg0;
            kv.al = arg1;
            kv.ae = arg2;
            kv.ar = arg3;
            kv.an = 0;
            return 1;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ek.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void az(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(0x9D4FB062) * 1007109655;
        }
        else if(2 == arg2) {
            this.an = arg1.ay(-72) * 0x5549CF5;
        }
        else if(arg2 == 5) {
            this.ap = false;
        }
        else if(arg2 == 7) {
            this.aj = arg1.ak(0xE769780E) * 52025702;
        }
    }

    static void du(short arg2) {
        int v2 = 0xF0B2F2BB;
        try {
            if(client.oc * v2 == gu.jg.bp * 0x914F0683 >> 7 && client.oj * 0xD1803407 == gu.jg.bw * 0xD19D0C3D >> 7) {
                client.oc = 0;
            }
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ek.du(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    public static final void fl(int arg2, int arg3, int arg4, int arg5, int arg6) {
        for(arg6 = 0; true; ++arg6) {
            int v0 = 0x65E6DD07;
            try {
                if(arg6 >= client.nh * v0) {
                    return;
                }

                if(client.nk[arg6] + client.nn[arg6] > arg2 && client.nk[arg6] < arg4 + arg2 && client.nf[arg6] + client.nv[arg6] > arg3 && client.nv[arg6] < arg3 + arg5) {
                    client.nt[arg6] = true;
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ek.fl(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    static final void ga(int arg0, int arg1, int arg2) {
        arg2 = -1506497054;
        try {
            if(!mr.ar(arg0, arg2)) {
                return;
            }

            fy.gj(ar.aj[arg0], arg1, -830319385);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ek.ga(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

