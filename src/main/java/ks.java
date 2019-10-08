public class ks extends hz {
    int[] ab;
    int[] ac;
    int[] ad;
    int ae;
    int[] af;
    int[] ai;
    int[] aj;
    int[] ak;
    int al;
    int[] an;
    int[] ao;
    int[] ap;
    int[] aq;
    boolean ar;
    int[] as;
    int[] av;
    int[] aw;
    oh ax;
    int[] ay;
    kc[][] ba;
    kc[][] bd;
    kh bf;
    boolean bn;
    long bo;
    int bp;
    ky bt;
    int bw;
    long by;
    static ki co;

    public ks() {
        try {
            super();
            this.al = 0xF04ED300;
            this.ae = 0x8A02C440;
            this.ar = false;
            this.an = new int[16];
            this.ap = new int[16];
            this.aj = new int[16];
            this.ad = new int[16];
            this.aq = new int[16];
            this.ab = new int[16];
            this.af = new int[16];
            this.ai = new int[16];
            this.av = new int[16];
            this.ay = new int[16];
            this.aw = new int[16];
            this.ao = new int[16];
            this.as = new int[16];
            this.ak = new int[16];
            this.ac = new int[16];
            this.bd = new kc[16][0x80];
            this.ba = new kc[16][0x80];
            this.bf = new kh();
            this.bt = new ky(this);
            this.ax = new oh(0x80);
            this.bv(0xBBB403E);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ks.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void aa(int arg1, int arg2, int arg3) {
        __monitor_enter(this);
        arg3 = -686048537;
        try {
            this.au(arg1, arg2, arg3);
        }
        catch(Throwable v1) {
        }
        catch(RuntimeException v1_1) {
            try {
                StringBuilder v2 = new StringBuilder();
                v2.append("ks.aa(");
                v2.append(')');
                throw lx.al(((Throwable)v1_1), v2.toString());
            }
            catch(Throwable v1) {
                __monitor_exit(this);
                throw v1;
            }
        }

        __monitor_exit(this);
    }

    void ab(kp arg3, boolean arg4, short arg5) {
        __monitor_enter(this);
        int v5 = 0x8C6F6AAE;
        try {
            this.ai(v5);
            this.bf.ax(arg3.al);
            this.bn = arg4;
            this.bo = 0;
            int v3_2 = this.bf.ar();
            int v4;
            for(v4 = 0; v4 < v3_2; ++v4) {
                this.bf.an(v4);
                this.bf.ad(v4);
                this.bf.ap(v4);
            }

            this.bp = this.bf.av() * 0xC5897F09;
            this.bw = this.bf.an[this.bp * 0x4583BF39] * 0x69A256CF;
            this.by = this.bf.ai(this.bw * 0x6D30F02F) * -4562680899733928443L;
        }
        catch(Throwable v3) {
            goto label_57;
        }
        catch(RuntimeException v3_1) {
            goto label_48;
        }

        __monitor_exit(this);
        return;
        try {
        label_48:
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("ks.ab(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3_1), v4_1.toString());
        }
        catch(Throwable v3) {
        label_57:
            __monitor_exit(this);
            throw v3;
        }
    }

    protected hz ac() {
        ky v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bt;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return ((hz)v0_1);
    }

    protected int ad() {
        __monitor_enter(this);
        __monitor_exit(this);
        return 0;
    }

    boolean ae(kp arg7, ko arg8, gq arg9, int arg10, int arg11) {
        boolean v0;
        __monitor_enter(this);
        try {
            arg7.al();
            int[] v11 = null;
            v0 = true;
            if(arg10 > 0) {
                v11 = new int[]{arg10};
            }

            mx v10;
            for(v10 = arg7.ax.ae(); v10 != null; v10 = arg7.ax.ar()) {
                int v2 = ((int)((mb)v10).gx);
                long v4 = ((long)v2);
                mx v3 = this.ax.ax(v4);
                if(v3 == null) {
                    kt v3_1 = dc.ax(arg8, v2, 0x73923774);
                    if(v3_1 == null) {
                        goto label_27;
                    }
                    else {
                        this.ax.al(((mx)v3_1), v4);
                        goto label_23;
                    }
                }
                else {
                label_23:
                    if(!((kt)v3).al(arg9, ((mb)v10).ax, v11, 34)) {
                    label_27:
                        v0 = false;
                    }
                }
            }

            if(v0) {
                arg7.ae();
            }
        }
        catch(Throwable v7) {
            goto label_47;
        }
        catch(RuntimeException v7_1) {
            goto label_38;
        }

        __monitor_exit(this);
        return v0;
        try {
        label_38:
            StringBuilder v8 = new StringBuilder();
            v8.append("ks.ae(");
            v8.append(')');
            throw lx.al(((Throwable)v7_1), v8.toString());
        }
        catch(Throwable v7) {
        label_47:
            __monitor_exit(this);
            throw v7;
        }
    }

    protected void af(int arg19) {
        long v16;
        long v4;
        int v0_2;
        ks v1 = this;
        __monitor_enter(this);
        byte v2 = 41;
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v0_2 = arg19;
            }
            else {
                int v3 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v0_2 = arg19;
                do {
                    long v6 = 0x439CE1094F447313L;
                    long v10 = ((long)v3);
                    v4 = v1.bo * v6 + (((long)v0_2)) * v10;
                    long v12 = 0x597C362D5EB796CDL;
                    v16 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v12 - v4 < 0) {
                        int v4_1 = ((int)((v1.by * v12 - v1.bo * v6 + v10 - 1) / v10));
                        v1.bo += (((long)v4_1)) * v10 * v16;
                        v1.bt.af(v4_1);
                        v0_2 -= v4_1;
                        v1.bj(v2);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_33;
                    }
                }
                while(true);

                goto label_62;
            label_33:
                v1.bo = v4 * v16;
            }

        label_62:
            v1.bt.af(v0_2);
        }
        catch(Throwable v0) {
        }
        catch(RuntimeException v0_1) {
            try {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("ks.af(");
                v3_1.append(((char)v2));
                throw lx.al(((Throwable)v0_1), v3_1.toString());
            }
            catch(Throwable v0) {
                __monitor_exit(this);
                throw v0;
            }
        }

        __monitor_exit(this);
    }

    void ag(kc arg6, boolean arg7, int arg8) {
        int v7;
        try {
            arg8 = arg6.ae.ae.length;
            int v0 = 6;
            int v1 = -1487360653;
            if(!arg7 || !arg6.ae.ap) {
                v7 = ((int)((((long)this.as[arg6.ax * v1])) * (((long)arg8)) >> v0));
            }
            else {
                v7 = ((int)((((long)this.as[arg6.ax * v1])) * (((long)(arg8 + arg8 - arg6.ae.ar))) >> v0));
                arg8 <<= 8;
                if(v7 >= arg8) {
                    v7 = arg8 + arg8 - 1 - v7;
                    arg6.ah.ag(true);
                }
            }

            arg6.ah.az(v7);
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7_1 = new StringBuilder();
            v7_1.append("ks.ag(");
            v7_1.append(')');
            throw lx.al(((Throwable)v6), v7_1.toString());
        }
    }

    void ah(int arg3, int arg4, int arg5, byte arg6) {
        try {
            kc v5 = this.bd[arg3][arg4];
            if(v5 == null) {
                return;
            }

            this.bd[arg3][arg4] = null;
            if((this.ay[arg3] & 2) != 0) {
                mx v3_1;
                for(v3_1 = this.bt.al.aj(); v3_1 != null; v3_1 = this.bt.al.aq()) {
                    if(v5.ax * -1487360653 == ((kc)v3_1).ax * -1487360653 && ((kc)v3_1).au * 0x46310CB9 < 0 && (((kc)v3_1)) != v5) {
                        v5.au = 0;
                        return;
                    }
                }
            }
            else {
                v5.au = 0;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ks.ah(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void ai(int arg3) {
        __monitor_enter(this);
        try {
            this.bf.al();
            this.bv(0xBBB403E);
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("ks.ai(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
    }

    protected hz aj() {
        __monitor_enter(this);
        __monitor_exit(this);
        return null;
    }

    void ak(int arg4, int arg5) {
        try {
            mx v5;
            for(v5 = this.bt.al.aj(); v5 != null; v5 = this.bt.al.aq()) {
                int v0 = -1487360653;
                if((arg4 < 0 || ((kc)v5).ax * v0 == arg4) && ((kc)v5).au * 0x46310CB9 < 0) {
                    this.bd[((kc)v5).ax * v0][((kc)v5).ap * 0x1D70CF25] = null;
                    ((kc)v5).au = 0;
                }
            }
        }
        catch(RuntimeException v4) {
            goto label_31;
        }

        return;
    label_31:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("ks.ak(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    int al(int arg3) {
        arg3 = 0xE37D395B;
        try {
            return this.al * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ks.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void am(int arg2, int arg3, int arg4) {
        try {
            if(arg3 != this.aq[arg2]) {
                this.aq[arg2] = arg3;
                for(arg3 = 0; arg3 < 0x80; ++arg3) {
                    this.ba[arg2][arg3] = null;
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ks.am(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void an(byte arg3) {
        __monitor_enter(this);
        try {
            mx v3_2;
            for(v3_2 = this.ax.ae(); v3_2 != null; v3_2 = this.ax.ar()) {
                ((kt)v3_2).lp();
            }
        }
        catch(Throwable v3) {
            goto label_22;
        }
        catch(RuntimeException v3_1) {
            goto label_13;
        }

        __monitor_exit(this);
        return;
        try {
        label_13:
            StringBuilder v0 = new StringBuilder();
            v0.append("ks.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
        catch(Throwable v3) {
        label_22:
            __monitor_exit(this);
            throw v3;
        }
    }

    void ao(int arg5, int arg6) {
        try {
            mx v6;
            for(v6 = this.bt.al.aj(); v6 != null; v6 = this.bt.al.aq()) {
                int v0 = -1487360653;
                if(arg5 < 0 || ((kc)v6).ax * v0 == arg5) {
                    if(((kc)v6).ah != null) {
                        ((kc)v6).ah.aw(ht.ax * 0x2C18D40D / 100);
                        if(((kc)v6).ah.bv()) {
                            this.bt.ae.ax(((kc)v6).ah);
                        }

                        ((kc)v6).ax(2007815380);
                    }

                    if(((kc)v6).au * 0x46310CB9 < 0) {
                        this.bd[((kc)v6).ax * v0][((kc)v6).ap * 0x1D70CF25] = null;
                    }

                    ((kc)v6).lp();
                }
            }
        }
        catch(RuntimeException v5) {
            goto label_47;
        }

        return;
    label_47:
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("ks.ao(");
        v6_1.append(')');
        throw lx.al(((Throwable)v5), v6_1.toString());
    }

    protected hz ap() {
        ky v0_2;
        __monitor_enter(this);
        try {
            v0_2 = this.bt;
        }
        catch(Throwable v0) {
        }
        catch(RuntimeException v0_1) {
            try {
                StringBuilder v1 = new StringBuilder();
                v1.append("ks.ap(");
                v1.append(')');
                throw lx.al(((Throwable)v0_1), v1.toString());
            }
            catch(Throwable v0) {
                __monitor_exit(this);
                throw v0;
            }
        }

        __monitor_exit(this);
        return ((hz)v0_2);
    }

    protected void aq(int[] arg20, int arg21, int arg22) {
        long v17;
        long v7;
        int v2;
        int v4;
        ks v1 = this;
        int[] v0 = arg20;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v4 = arg21;
                v2 = arg22;
            }
            else {
                int v3 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v4 = arg21;
                v2 = arg22;
                do {
                    long v5 = ((long)v3);
                    long v11 = 0x439CE1094F447313L;
                    v7 = (((long)v2)) * v5 + v1.bo * v11;
                    long v13 = 0x597C362D5EB796CDL;
                    v17 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v13 - v7 < 0) {
                        int v7_1 = ((int)((v1.by * v13 - v1.bo * v11 + v5 - 1) / v5));
                        v1.bo += (((long)v7_1)) * v5 * v17;
                        v1.bt.aq(v0, v4, v7_1);
                        v4 += v7_1;
                        v2 -= v7_1;
                        v1.bj(37);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_34;
                    }
                }
                while(true);

                goto label_66;
            label_34:
                v1.bo = v7 * v17;
            }

        label_66:
            v1.bt.aq(v0, v4, v2);
        }
        catch(Throwable v0_1) {
        }
        catch(RuntimeException v0_2) {
            try {
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ks.aq(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_2), v2_1.toString());
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    void ar(int arg3) {
        __monitor_enter(this);
        try {
            mx v3_2;
            for(v3_2 = this.ax.ae(); v3_2 != null; v3_2 = this.ax.ar()) {
                ((kt)v3_2).ae(0xD1A00933);
            }
        }
        catch(Throwable v3) {
            goto label_23;
        }
        catch(RuntimeException v3_1) {
            goto label_14;
        }

        __monitor_exit(this);
        return;
        try {
        label_14:
            StringBuilder v0 = new StringBuilder();
            v0.append("ks.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
        catch(Throwable v3) {
        label_23:
            __monitor_exit(this);
            throw v3;
        }
    }

    void as(int arg4, int arg5) {
        arg5 = 0;
        if(arg4 >= 0) {
            goto label_9;
        }

        while(true) {
            if(arg5 >= 16) {
                return;
            }

            arg4 = 0x6ECEE8FE;
            try {
                this.as(arg5, arg4);
                ++arg5;
                continue;
                return;
            label_9:
                this.an[arg4] = 0x3200;
                this.ap[arg4] = 0x2000;
                this.aj[arg4] = 0x3FFF;
                this.af[arg4] = 0x2000;
                this.ai[arg4] = 0;
                this.av[arg4] = 0x2000;
                this.bq(arg4, 0xFA0B70F2);
                this.bx(arg4, -1004282904);
                this.ay[arg4] = 0;
                this.aw[arg4] = 0x7FFF;
                this.ao[arg4] = 0x100;
                this.as[arg4] = 0;
                this.bh(arg4, 0x2000, 0x9A6E6A2);
                return;
            }
            catch(RuntimeException v4) {
                StringBuilder v5 = new StringBuilder();
                v5.append("ks.as(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
            }
        }
    }

    void at(int arg1, int arg2, int arg3, int arg4) {
    }

    void au(int arg2, int arg3, int arg4) {
        try {
            this.ad[arg2] = arg3;
            this.ab[arg2] = arg3 & 0xFFFFFF80;
            this.am(arg2, arg3, 0x40A10AE9);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ks.au(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean av(byte arg3) {
        boolean v3_2;
        __monitor_enter(this);
        try {
            v3_2 = this.bf.ae();
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("ks.av(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
        return v3_2;
    }

    void aw(int arg1, int arg2, int arg3) {
        try {
            this.af[arg1] = arg2;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ks.aw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ax(int arg2, int arg3) {
        __monitor_enter(this);
        arg2 *= 0x29F04ED3;
        try {
            this.al = arg2;
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v3 = new StringBuilder();
                v3.append("ks.ax(");
                v3.append(')');
                throw lx.al(((Throwable)v2_1), v3.toString());
            }
            catch(Throwable v2) {
                __monitor_exit(this);
                throw v2;
            }
        }

        __monitor_exit(this);
    }

    void ay(int arg1, int arg2, int arg3) {
    }

    void az(int arg11, int arg12, int arg13, int arg14) {
        arg14 = 0x40;
        byte v0 = -57;
        try {
            this.ah(arg11, arg12, arg14, v0);
            int v0_1 = 21410989;
            int v1 = -1066080123;
            kc v2 = null;
            int v3 = 0x46310CB9;
            int v4 = 0x1D70CF25;
            if((this.ay[arg11] & 2) != 0) {
                mx v14;
                for(v14 = this.bt.al.ad(); v14 != null; v14 = this.bt.al.ab()) {
                    if(((kc)v14).ax * -1487360653 == arg11 && ((kc)v14).au * v3 < 0) {
                        this.bd[arg11][((kc)v14).ap * v4] = v2;
                        this.bd[arg11][arg12] = v14;
                        arg11 = (((kc)v14).ab * -1809088953 * (((kc)v14).af * 0xDE223061) >> 12) + ((kc)v14).aq * 0xB962D04D;
                        ((kc)v14).aq += (arg12 - ((kc)v14).ap * v4 << 8) * v1;
                        ((kc)v14).ab = (arg11 - ((kc)v14).aq * 0xB962D04D) * 1026214775;
                        ((kc)v14).af = 0x473A1000;
                        ((kc)v14).ap = arg12 * v0_1;
                        return;
                    }
                }
            }

            v14 = this.ax.ax(((long)this.aq[arg11]));
            if(v14 == null) {
                return;
            }

            hs v5 = ((kt)v14).al[arg12];
            if(v5 == null) {
                return;
            }

            kc v6 = new kc();
            v6.ax = 0xEFCE3FBB * arg11;
            v6.al = ((kt)v14);
            v6.ae = v5;
            v6.ar = ((kt)v14).ap[arg12];
            v6.an = ((kt)v14).aj[arg12] * 0xD69E649F;
            v6.ap = v0_1 * arg12;
            v6.aj = (((kt)v14).ar[arg12] * (((kt)v14).ax * 0xE0312409 * (arg13 * arg13)) + 0x400 >> 11) * 0x2C317FF3;
            v6.ad = (((kt)v14).an[arg12] & 0xFF) * 0xFA71271;
            v6.aq = ((arg12 << 8) - (((kt)v14).ae[arg12] & 0x7FFF)) * v1;
            v6.ai = 0;
            v6.av = 0;
            v6.aa = 0;
            v6.au = 0x143CC677;
            v6.am = 0;
            if(this.as[arg11] == 0) {
                v6.ah = hx.ar(v5, this.bb(v6, -1497034219), this.bc(v6, 0x72), this.bm(v6, 0xB90FF3BB));
            }
            else {
                v6.ah = hx.ar(v5, this.bb(v6, 0x85A27501), 0, this.bm(v6, 0xE157E482));
                boolean v0_2 = ((kt)v14).ae[arg12] < 0 ? true : false;
                this.ag(v6, v0_2, 0x33111159);
            }

            if(((kt)v14).ae[arg12] < 0) {
                v6.ah.ab(-1);
            }

            v0_1 = 0xF7D5B75F;
            if(v6.an * v0_1 >= 0) {
                kc v14_1 = this.ba[arg11][v6.an * v0_1];
                if(v14_1 != null && v14_1.au * v3 < 0) {
                    this.bd[arg11][v14_1.ap * v4] = v2;
                    v14_1.au = 0;
                }

                this.ba[arg11][v6.an * v0_1] = v6;
            }

            this.bt.al.al(((mx)v6));
            this.bd[arg11][arg12] = v6;
            return;
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ks.az(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    protected hz ba() {
        __monitor_enter(this);
        __monitor_exit(this);
        return null;
    }

    int bb(kc arg9, int arg10) {
        arg10 = 0xB962D04D;
        try {
            int v2 = -1487360653;
            int v0 = arg9.aq * arg10 + (arg9.af * 0xDE223061 * (arg9.ab * -1809088953) >> 12) + ((this.af[arg9.ax * v2] - 0x2000) * this.ao[arg9.ax * v2] >> 12);
            kk v10 = arg9.ar;
            if(v10.ad * 0x223D2CAD > 0) {
                int v4 = 0x5003AF3D;
                if(v10.aj * v4 <= 0 && this.ai[arg9.ax * v2] <= 0) {
                    goto label_73;
                }

                int v3 = v10.aj * v4 << 2;
                arg10 = v10.aq * 0xDF355FE9 << 1;
                int v5 = 0xC7682A33;
                if(arg9.az * v5 < arg10) {
                    v3 = v3 * (arg9.az * v5) / arg10;
                }

                v0 += ((int)((((double)(v3 + (this.ai[arg9.ax * v2] >> 7)))) * Math.sin((((double)(arg9.ag * 0x47D0240B & 0x1FF))) * 0.012272)));
            }

        label_73:
            int v9_1 = ((int)((((double)(arg9.ae.al * 0x100))) * Math.pow(2, (((double)v0)) * 0.000326) / (((double)(ht.ax * 0x2C18D40D))) + 0.5));
            if(v9_1 >= 1) {
                return v9_1;
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10_1 = new StringBuilder();
            v10_1.append("ks.bb(");
            v10_1.append(')');
            throw lx.al(((Throwable)v9), v10_1.toString());
        }

        return 1;
    }

    int bc(kc arg9, byte arg10) {
        int v3;
        int v4;
        int v1;
        int v2;
        int v0;
        try {
            kk v10 = arg9.ar;
            v0 = this.an[arg9.ax * -1487360653] * this.aj[arg9.ax * -1487360653] + 0x1000 >> 13;
            v0 = (arg9.aj * 0xCFE313B * (v0 * v0 + 0x4000 >> 15) + 0x4000 >> 15) * (this.al * 0xE37D395B) + 0x80 >> 8;
            v2 = 0x960583D3;
            if(v10.ae * v2 > 0) {
                v0 = ((int)((((double)v0)) * Math.pow(0.5, (((double)(arg9.ai * 0x1B0EEB87))) * 0.00002 * (((double)(v10.ae * v2)))) + 0.5));
            }

            if(v10.ax != null) {
                v1 = arg9.av * 0x5FB2ED5B;
                v4 = 0x610E4719;
                v2 = v10.ax[arg9.aa * v4 + 1];
                if(arg9.aa * v4 < v10.ax.length - 2) {
                    v3 = (v10.ax[arg9.aa * v4] & 0xFF) << 8;
                    v2 += (v1 - v3) * (v10.ax[arg9.aa * v4 + 3] - v2) / (((v10.ax[arg9.aa * v4 + 2] & 0xFF) << 8) - v3);
                }

                v0 = v2 * v0 + 0x20 >> 6;
            }

            v2 = 0x46310CB9;
            if(arg9.au * v2 > 0 && v10.al != null) {
                v1 = arg9.au * v2;
                v4 = 0xB13D1313;
                v2 = v10.al[arg9.am * v4 + 1];
                if(arg9.am * v4 < v10.al.length - 2) {
                    v3 = (v10.al[arg9.am * v4] & 0xFF) << 8;
                    v2 += (v1 - v3) * (v10.al[arg9.am * v4 + 3] - v2) / (((v10.al[arg9.am * v4 + 2] & 0xFF) << 8) - v3);
                }

                goto label_137;
            }

            return v0;
        }
        catch(RuntimeException v9) {
            StringBuilder v10_1 = new StringBuilder();
            v10_1.append("ks.bc(");
            v10_1.append(')');
            throw lx.al(((Throwable)v9), v10_1.toString());
        }

    label_137:
        return v2 * v0 + 0x20 >> 6;
    }

    protected hz bd() {
        ky v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bt;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return ((hz)v0_1);
    }

    public void be(boolean arg2, byte arg3) {
        try {
            this.ar = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ks.be(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    protected int bf() {
        __monitor_enter(this);
        __monitor_exit(this);
        return 0;
    }

    void bg(int arg8, byte arg9) {
        int v9 = arg8 & 0xF0;
        int v1 = 16;
        if(v9 != 0x80) {
            goto label_14;
        }

        v9 = arg8 & 15;
        int v0 = arg8 >> 8 & 0x7F;
        arg8 = arg8 >> v1 & 0x7F;
        byte v1_1 = -103;
        try {
            this.ah(v9, v0, arg8, v1_1);
            return;
        label_14:
            int v2 = 0x40;
            if(v9 == 0x90) {
                v9 = arg8 & 15;
                v0 = arg8 >> 8 & 0x7F;
                arg8 = arg8 >> v1 & 0x7F;
                if(arg8 > 0) {
                    this.az(v9, v0, arg8, -2099524120);
                }
                else {
                    this.ah(v9, v0, v2, -7);
                }

                return;
            }

            if(0xA0 == v9) {
                this.at(arg8 & 15, arg8 >> 8 & 0x7F, arg8 >> v1 & 0x7F, -1441353049);
                return;
            }

            if(v9 == 0xB0) {
                v9 = arg8 & 15;
                v0 = arg8 >> 8 & 0x7F;
                arg8 = arg8 >> v1 & 0x7F;
                if(v0 == 0) {
                    this.ab[v9] = (arg8 << 14) + (this.ab[v9] & 0xFFE03FFF);
                }

                if(v0 == 0x20) {
                    this.ab[v9] = (this.ab[v9] & 0xFFFFC07F) + (arg8 << 7);
                }

                if(v0 == 1) {
                    this.ai[v9] = (this.ai[v9] & 0xFFFFC07F) + (arg8 << 7);
                }

                if(v0 == 33) {
                    this.ai[v9] = (this.ai[v9] & 0xFFFFFF80) + arg8;
                }

                if(5 == v0) {
                    this.av[v9] = (arg8 << 7) + (this.av[v9] & 0xFFFFC07F);
                }

                if(37 == v0) {
                    this.av[v9] = (this.av[v9] & 0xFFFFFF80) + arg8;
                }

                if(v0 == 7) {
                    this.an[v9] = (arg8 << 7) + (this.an[v9] & 0xFFFFC07F);
                }

                if(v0 == 39) {
                    this.an[v9] = (this.an[v9] & 0xFFFFFF80) + arg8;
                }

                if(v0 == 10) {
                    this.ap[v9] = (arg8 << 7) + (this.ap[v9] & 0xFFFFC07F);
                }

                if(42 == v0) {
                    this.ap[v9] = (this.ap[v9] & 0xFFFFFF80) + arg8;
                }

                if(11 == v0) {
                    this.aj[v9] = (this.aj[v9] & 0xFFFFC07F) + (arg8 << 7);
                }

                if(43 == v0) {
                    this.aj[v9] = (this.aj[v9] & 0xFFFFFF80) + arg8;
                }

                if(v2 == v0) {
                    if(arg8 >= v2) {
                        this.ay[v9] |= 1;
                    }
                    else {
                        this.ay[v9] &= -2;
                    }
                }

                if(v0 == 65) {
                    if(arg8 >= v2) {
                        this.ay[v9] |= 2;
                    }
                    else {
                        this.bq(v9, 0x68FD400C);
                        this.ay[v9] &= -3;
                    }
                }

                if(v0 == 99) {
                    this.aw[v9] = (this.aw[v9] & 0x7F) + (arg8 << 7);
                }

                if(98 == v0) {
                    this.aw[v9] = (this.aw[v9] & 0x3F80) + arg8;
                }

                int v4 = 0x4000;
                if(v0 == 101) {
                    this.aw[v9] = (this.aw[v9] & 0x7F) + v4 + (arg8 << 7);
                }

                if(v0 == 100) {
                    this.aw[v9] = (this.aw[v9] & 0x3F80) + v4 + arg8;
                }

                if(v0 == 120) {
                    this.ao(v9, 2059040433);
                }

                if(v0 == 0x79) {
                    this.as(v9, 0x7095DB98);
                }

                if(0x7B == v0) {
                    this.ak(v9, 0x22FB4D0A);
                }

                if(6 == v0 && v4 == this.aw[v9]) {
                    this.ao[v9] = (arg8 << 7) + (this.ao[v9] & 0xFFFFC07F);
                }

                if(38 == v0 && v4 == this.aw[v9]) {
                    this.ao[v9] = (this.ao[v9] & 0xFFFFFF80) + arg8;
                }

                if(v0 == v1) {
                    this.as[v9] = (arg8 << 7) + (this.as[v9] & 0xFFFFC07F);
                }

                if(v0 == 0x30) {
                    this.as[v9] = (this.as[v9] & 0xFFFFFF80) + arg8;
                }

                if(81 == v0) {
                    if(arg8 >= v2) {
                        this.ay[v9] |= 4;
                    }
                    else {
                        this.bx(v9, -1004282904);
                        this.ay[v9] &= -5;
                    }
                }

                if(v0 == 17) {
                    this.bh(v9, (arg8 << 7) + (this.ak[v9] & 0xFFFFC07F), 820092057);
                }

                if(v0 == 49) {
                    this.bh(v9, (this.ak[v9] & 0xFFFFFF80) + arg8, 0x1CC18047);
                }

                return;
            }

            if(v9 == 0xC0) {
                v9 = arg8 & 15;
                this.am(v9, (arg8 >> 8 & 0x7F) + this.ab[v9], 0xF0F821C);
                return;
            }

            if(v9 == 0xD0) {
                this.ay(arg8 & 15, arg8 >> 8 & 0x7F, 0xE5F10BE8);
                return;
            }

            if(v9 == 0xE0) {
                this.aw(arg8 & 15, (arg8 >> 9 & 0x3F80) + (arg8 >> 8 & 0x7F), 0x1B1C5DB1);
                return;
            }

            if(0xFF != (arg8 & 0xFF)) {
                return;
            }

            this.bv(0xBBB403E);
            return;
        label_13:
        }
        catch(RuntimeException v8) {
            goto label_13;
        }

        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("ks.bg(");
        v9_1.append(')');
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    void bh(int arg9, int arg10, int arg11) {
        try {
            this.ak[arg9] = arg10;
            this.ac[arg9] = ((int)(Math.pow(2, (((double)arg10)) * 0.000549) * 2097152 + 0.5));
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ks.bh(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    void bi(int arg2) {
        __monitor_enter(this);
        arg2 *= 0x29F04ED3;
        try {
            this.al = arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void bj(byte arg7) {
        int v7 = 0x4583BF39;
        try {
            int v0 = this.bp * v7;
            int v1 = 0x6D30F02F;
            v7 = this.bw * v1;
            long v4;
            for(v4 = this.by * 0x597C362D5EB796CDL; v7 == this.bw * v1; v4 = this.bf.ai(v7)) {
                while(this.bf.an[v0] == v7) {
                    this.bf.an(v0);
                    int v2 = this.bf.aq(v0);
                    if(v2 == 1) {
                        this.bf.aj();
                        this.bf.ap(v0);
                        if(!this.bf.aa()) {
                        }
                        else {
                            if((this.bn) && v7 != 0) {
                                this.bf.au(v4);
                                break;
                            }

                            this.bv(0xBBB403E);
                            this.bf.al();
                            return;
                        }
                    }
                    else {
                        if((v2 & 0x80) != 0) {
                            this.bg(v2, -7);
                        }

                        this.bf.ad(v0);
                        this.bf.ap(v0);
                        continue;
                    }

                    break;
                }

                v0 = this.bf.av();
                v7 = this.bf.an[v0];
            }

            this.bp = v0 * 0xC5897F09;
            this.bw = v7 * 0x69A256CF;
            this.by = v4 * -4562680899733928443L;
            return;
        }
        catch(RuntimeException v7_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ks.bj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v7_1), v0_1.toString());
        }
    }

    void bl(int arg2) {
        __monitor_enter(this);
        arg2 *= -28447405;
        try {
            this.al = arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    int bm(kc arg3, int arg4) {
        try {
            arg4 = this.ap[arg3.ax * -1487360653];
            int v1 = 345140881;
            if(arg4 < 0x2000) {
                return arg3.ad * v1 * arg4 + 0x20 >> 6;
            }

            return 0x4000 - ((0x80 - arg3.ad * v1) * (0x4000 - arg4) + 0x20 >> 6);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ks.bm(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    protected int bn() {
        __monitor_enter(this);
        __monitor_exit(this);
        return 0;
    }

    protected void bo(int[] arg20, int arg21, int arg22) {
        long v17;
        long v7;
        int v2;
        int v4;
        ks v1 = this;
        int[] v0 = arg20;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v4 = arg21;
                v2 = arg22;
            }
            else {
                int v3 = v1.ae * 1808021654 * v1.bf.al / (ht.ax * 0x931D96F1);
                v4 = arg21;
                v2 = arg22;
                do {
                    long v5 = ((long)v3);
                    long v11 = 0x439CE1094F447313L;
                    v7 = (((long)v2)) * v5 + v1.bo * v11;
                    long v13 = 0x597C362D5EB796CDL;
                    v17 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v13 - v7 < 0) {
                        int v7_1 = ((int)((v1.by * v13 - v1.bo * v11 + v5 - 1) / v5));
                        v1.bo += (((long)v7_1)) * v5 * v17;
                        v1.bt.aq(v0, v4, v7_1);
                        v4 += v7_1;
                        v2 -= v7_1;
                        v1.bj(17);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_34;
                    }
                }
                while(true);

                goto label_66;
            label_34:
                v1.bo = v7 * v17;
            }

        label_66:
            v1.bt.aq(v0, v4, v2);
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    protected int bp() {
        __monitor_enter(this);
        __monitor_exit(this);
        return 0;
    }

    void bq(int arg4, int arg5) {
        try {
            if((this.ay[arg4] & 2) != 0) {
                mx v5;
                for(v5 = this.bt.al.aj(); v5 != null; v5 = this.bt.al.aq()) {
                    if(arg4 == ((kc)v5).ax * -1487360653 && this.bd[arg4][((kc)v5).ap * 0x1D70CF25] == null && ((kc)v5).au * 0x46310CB9 < 0) {
                        ((kc)v5).au = 0;
                    }
                }
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("ks.bq(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    void br(int arg2) {
        __monitor_enter(this);
        arg2 *= 0x29F04ED3;
        try {
            this.al = arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    boolean bs(kc arg21, int[] arg22, int arg23, int arg24, int arg25) {
        int v6_1;
        ks v1 = this;
        kc v0 = arg21;
        int[] v2 = arg22;
        int v3 = arg24;
        int v4 = 0x2C18D40D;
        try {
            v0.at = ht.ax * v4 / 100 * 159024707;
            int v5 = 0x46310CB9;
            kc v6 = null;
            int v8 = -1487360653;
            int v9 = 0xF7D5B75F;
            if(v0.au * v5 >= 0 && (v0.ah == null || (v0.ah.ak()))) {
                v0.ax(0x770C3D1F);
                arg21.lp();
                if(v0.an * v9 > 0 && v0 == v1.ba[v0.ax * v8][v0.an * v9]) {
                    v1.ba[v0.ax * v8][v0.an * v9] = v6;
                }

                return 1;
            }

            int v10 = 0xDE223061;
            v4 = v0.af * v10;
            double v12 = 0.5;
            double v14 = 2;
            if(v4 > 0) {
                int v11 = v4 - (((int)(Math.pow(v14, (((double)v1.av[v0.ax * v8])) * 0.000492) * 16 + v12)));
                if(v11 < 0) {
                    v11 = 0;
                }

                v0.af = v11 * 2000974753;
            }

            v0.ah.ao(v1.bb(v0, 0xA4DD92FE));
            kk v4_1 = v0.ar;
            v0.az += 0xFA46E0FB;
            v0.ag += v4_1.ad * 485322023;
            double v10_1 = (((double)((v0.ap * 0x1D70CF25 - 60 << 8) + (v0.af * v10 * (v0.ab * -1809088953) >> 12)))) * 0.000005;
            double v16 = 128;
            if(v4_1.ae * 0x960583D3 > 0) {
                v8 = 0x34B8FD71;
                v0.ai += v4_1.ap * v8 > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ap * v8))) * v10_1) * v16 + v12))) * 0x3EEEA37 : 0xF7751B80;
            }

            if(v4_1.ax != null) {
                v0.av += v4_1.ar * 0x460E5DDF > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ar * 0x460E5DDF))) * v10_1) * v16 + v12))) * 244021971 : 1170041216;
                while(true) {
                    v8 = 0x610E4719;
                    if(v0.aa * v8 < v4_1.ax.length - 2 && v0.av * 0x5FB2ED5B > (v4_1.ax[v0.aa * v8 + 2] & 0xFF) << 8) {
                        v0.aa += 0x8BE04A52;
                        continue;
                    }

                    break;
                }

                if(v4_1.ax.length - 2 != v0.aa * v8) {
                    goto label_194;
                }

                if(v4_1.ax[v0.aa * v8 + 1] != 0) {
                    goto label_194;
                }

                v6_1 = 1;
            }
            else {
            label_194:
                v6_1 = 0;
            }

            if(v0.au * v5 >= 0 && v4_1.al != null && (v1.ay[v0.ax * -1487360653] & 1) == 0 && (v0.an * 0xF7D5B75F < 0 || v0 != v1.ba[v0.ax * -1487360653][v0.an * 0xF7D5B75F])) {
                v0.au += v4_1.an * 0xF7130A0B > 0 ? (((int)(Math.pow(v14, v10_1 * (((double)(v4_1.an * 0xF7130A0B)))) * v16 + 0.5))) * 0xEBC33989 : 0xE19CC480;
                while(true) {
                    v9 = 0xB13D1313;
                    if(v0.am * v9 < v4_1.al.length - 2 && v0.au * v5 > (v4_1.al[v0.am * v9 + 2] & 0xFF) << 8) {
                        v0.am += 0xE60F5E36;
                        continue;
                    }

                    break;
                }

                if(v4_1.al.length - 2 != v0.am * v9) {
                    goto label_275;
                }

                v6_1 = 1;
            }

        label_275:
            if(v6_1 != 0) {
                v0.ah.aw(v0.at * 0x9F8D766B);
                if(v2 != null) {
                    v0.ah.aq(v2, arg23, v3);
                }
                else {
                    v0.ah.af(v3);
                }

                if(v0.ah.bv()) {
                    v1.bt.ae.ax(v0.ah);
                }

                v0.ax(0xB157013F);
                if(v0.au * v5 >= 0) {
                    arg21.lp();
                    if(v0.an * 0xF7D5B75F > 0 && v1.ba[v0.ax * -1487360653][v0.an * 0xF7D5B75F] == v0) {
                        v1.ba[v0.ax * -1487360653][v0.an * 0xF7D5B75F] = null;
                    }
                }

                return 1;
            }

            v0.ah.ay(v0.at * 0x9F8D766B, v1.bc(v0, 59), v1.bm(v0, -1216758080));
            return 0;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ks.bs(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    protected void bt(int[] arg20, int arg21, int arg22) {
        long v17;
        long v7;
        int v2;
        int v4;
        ks v1 = this;
        int[] v0 = arg20;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v4 = arg21;
                v2 = arg22;
            }
            else {
                int v3 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v4 = arg21;
                v2 = arg22;
                do {
                    long v5 = ((long)v3);
                    long v11 = 0x439CE1094F447313L;
                    v7 = (((long)v2)) * v5 + v1.bo * v11;
                    long v13 = 0x597C362D5EB796CDL;
                    v17 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v13 - v7 < 0) {
                        int v7_1 = ((int)((v1.by * v13 - v1.bo * v11 + v5 - 1) / v5));
                        v1.bo += (((long)v7_1)) * v5 * v17;
                        v1.bt.aq(v0, v4, v7_1);
                        v4 += v7_1;
                        v2 -= v7_1;
                        v1.bj(-18);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_34;
                    }
                }
                while(true);

                goto label_66;
            label_34:
                v1.bo = v7 * v17;
            }

        label_66:
            v1.bt.aq(v0, v4, v2);
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    boolean bu(kc arg4, byte arg5) {
        try {
            if(arg4.ah != null) {
                return 0;
            }

            if(arg4.au * 0x46310CB9 >= 0) {
                arg4.lp();
                int v0 = 0xF7D5B75F;
                if(arg4.an * v0 > 0) {
                    int v2 = -1487360653;
                    if(this.ba[arg4.ax * v2][arg4.an * v0] == arg4) {
                        this.ba[arg4.ax * v2][arg4.an * v0] = null;
                    }
                }
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ks.bu(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return 1;
    }

    void bv(int arg4) {
        arg4 = 2023625538;
        int v0 = -1;
        try {
            this.ao(v0, arg4);
            this.as(v0, 0x5F29EE5C);
            arg4 = 0;
            v0 = 0;
            while(true) {
                int v1 = 16;
                if(v0 < v1) {
                    this.aq[v0] = this.ad[v0];
                    ++v0;
                    continue;
                }

                break;
            }

            while(arg4 < v1) {
                this.ab[arg4] = this.ad[arg4] & 0xFFFFFF80;
                ++arg4;
            }
        }
        catch(RuntimeException v4) {
            goto label_26;
        }

        return;
    label_26:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ks.bv(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4), v0_1.toString());
    }

    protected void bw(int[] arg20, int arg21, int arg22) {
        long v17;
        long v7;
        int v2;
        int v4;
        ks v1 = this;
        int[] v0 = arg20;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v4 = arg21;
                v2 = arg22;
            }
            else {
                int v3 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v4 = arg21;
                v2 = arg22;
                do {
                    long v5 = ((long)v3);
                    long v11 = 0x439CE1094F447313L;
                    v7 = (((long)v2)) * v5 + v1.bo * v11;
                    long v13 = 0x597C362D5EB796CDL;
                    v17 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v13 - v7 < 0) {
                        int v7_1 = ((int)((v1.by * v13 - v1.bo * v11 + v5 - 1) / v5));
                        v1.bo += (((long)v7_1)) * v5 * v17;
                        v1.bt.aq(v0, v4, v7_1);
                        v4 += v7_1;
                        v2 -= v7_1;
                        v1.bj(-58);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_34;
                    }
                }
                while(true);

                goto label_66;
            label_34:
                v1.bo = v7 * v17;
            }

        label_66:
            v1.bt.aq(v0, v4, v2);
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    void bx(int arg3, int arg4) {
        try {
            if((this.ay[arg3] & 4) != 0) {
                mx v4;
                for(v4 = this.bt.al.aj(); v4 != null; v4 = this.bt.al.aq()) {
                    if(arg3 == ((kc)v4).ax * -1487360653) {
                        ((kc)v4).aw = 0;
                    }
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("ks.bx(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    protected void by(int[] arg20, int arg21, int arg22) {
        long v17;
        long v7;
        int v2;
        int v4;
        ks v1 = this;
        int[] v0 = arg20;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v4 = arg21;
                v2 = arg22;
            }
            else {
                int v3 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v4 = arg21;
                v2 = arg22;
                do {
                    long v5 = ((long)v3);
                    long v11 = 0x439CE1094F447313L;
                    v7 = (((long)v2)) * v5 + v1.bo * v11;
                    long v13 = 0x597C362D5EB796CDL;
                    v17 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v13 - v7 < 0) {
                        int v7_1 = ((int)((v1.by * v13 - v1.bo * v11 + v5 - 1) / v5));
                        v1.bo += (((long)v7_1)) * v5 * v17;
                        v1.bt.aq(v0, v4, v7_1);
                        v4 += v7_1;
                        v2 -= v7_1;
                        v1.bj(-104);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_34;
                    }
                }
                while(true);

                goto label_66;
            label_34:
                v1.bo = v7 * v17;
            }

        label_66:
            v1.bt.aq(v0, v4, v2);
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    protected void bz(int arg18) {
        long v15;
        long v3;
        int v0_1;
        ks v1 = this;
        __monitor_enter(this);
        try {
            if(!v1.bf.ae() || (v1.ar)) {
                v0_1 = arg18;
            }
            else {
                int v2 = v1.ae * 0x986EE279 * v1.bf.al / (ht.ax * 0x2C18D40D);
                v0_1 = arg18;
                do {
                    long v5 = 0x439CE1094F447313L;
                    long v9 = ((long)v2);
                    v3 = v1.bo * v5 + (((long)v0_1)) * v9;
                    long v11 = 0x597C362D5EB796CDL;
                    v15 = 0x11C3FAFC3E474F1BL;
                    if(v1.by * v11 - v3 < 0) {
                        int v3_1 = ((int)((v1.by * v11 - v1.bo * v5 + v9 - 1) / v9));
                        v1.bo += (((long)v3_1)) * v9 * v15;
                        v1.bt.af(v3_1);
                        v0_1 -= v3_1;
                        v1.bj(82);
                        if(v1.bf.ae()) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_32;
                    }
                }
                while(true);

                goto label_62;
            label_32:
                v1.bo = v3 * v15;
            }

        label_62:
            v1.bt.af(v0_1);
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    int ca() {
        return this.al * 0xE37D395B;
    }

    void cb() {
        __monitor_enter(this);
        try {
            mx v0_1;
            for(v0_1 = this.ax.ae(); v0_1 != null; v0_1 = this.ax.ar()) {
                ((kt)v0_1).ae(0xCABF813F);
            }
        }
        catch(Throwable v0) {
            goto label_12;
        }

        __monitor_exit(this);
        return;
    label_12:
        __monitor_exit(this);
        throw v0;
    }

    void cc() {
        __monitor_enter(this);
        try {
            mx v0_1;
            for(v0_1 = this.ax.ae(); v0_1 != null; v0_1 = this.ax.ar()) {
                ((kt)v0_1).ae(0x17B5D9F0);
            }
        }
        catch(Throwable v0) {
            goto label_12;
        }

        __monitor_exit(this);
        return;
    label_12:
        __monitor_exit(this);
        throw v0;
    }

    boolean cd(kp arg8, ko arg9, gq arg10, int arg11) {
        boolean v1;
        __monitor_enter(this);
        try {
            arg8.al();
            int[] v0 = null;
            v1 = true;
            if(arg11 > 0) {
                v0 = new int[]{arg11};
            }

            mx v11;
            for(v11 = arg8.ax.ae(); v11 != null; v11 = arg8.ax.ar()) {
                int v3 = ((int)((mb)v11).gx);
                long v5 = ((long)v3);
                mx v4 = this.ax.ax(v5);
                if(v4 == null) {
                    kt v4_1 = dc.ax(arg9, v3, 2045003893);
                    if(v4_1 == null) {
                        goto label_27;
                    }
                    else {
                        this.ax.al(((mx)v4_1), v5);
                        goto label_23;
                    }
                }
                else {
                label_23:
                    if(!v4_1.al(arg10, ((mb)v11).ax, v0, 93)) {
                    label_27:
                        v1 = false;
                    }
                }
            }

            if(v1) {
                arg8.ae();
            }
        }
        catch(Throwable v8) {
            goto label_36;
        }

        __monitor_exit(this);
        return v1;
    label_36:
        __monitor_exit(this);
        throw v8;
    }

    boolean ce() {
        boolean v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bf.ae();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    boolean cf(kp arg8, ko arg9, gq arg10, int arg11) {
        boolean v1;
        __monitor_enter(this);
        try {
            arg8.al();
            int[] v0 = null;
            v1 = true;
            if(arg11 > 0) {
                v0 = new int[]{arg11};
            }

            mx v11;
            for(v11 = arg8.ax.ae(); v11 != null; v11 = arg8.ax.ar()) {
                int v3 = ((int)((mb)v11).gx);
                long v5 = ((long)v3);
                mx v4 = this.ax.ax(v5);
                if(v4 == null) {
                    kt v4_1 = dc.ax(arg9, v3, 0x752E0644);
                    if(v4_1 != null) {
                        this.ax.al(((mx)v4_1), v5);
                        goto label_24;
                    }
                    else {
                        goto label_20;
                    }
                }
                else {
                label_24:
                    if(!((kt)v4).al(arg10, ((mb)v11).ax, v0, 0x7E)) {
                    label_20:
                        v1 = false;
                    }
                }
            }

            if(v1) {
                arg8.ae();
            }
        }
        catch(Throwable v8) {
            goto label_37;
        }

        __monitor_exit(this);
        return v1;
    label_37:
        __monitor_exit(this);
        throw v8;
    }

    void cg(int arg3, int arg4) {
        if(arg4 != this.aq[arg3]) {
            this.aq[arg3] = arg4;
            for(arg4 = 0; arg4 < 0x80; ++arg4) {
                this.ba[arg3][arg4] = null;
            }
        }
    }

    void ch() {
        __monitor_enter(this);
        try {
            this.bf.al();
            this.bv(0xBBB403E);
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void ci() {
        __monitor_enter(this);
        try {
            this.bf.al();
            this.bv(0xBBB403E);
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    int cj() {
        return this.al * 0xE37D395B;
    }

    public void ck(int arg2, int arg3) {
        __monitor_enter(this);
        int v0 = -1235967038;
        try {
            this.au(arg2, arg3, v0);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void cl(int arg2, int arg3) {
        __monitor_enter(this);
        int v0 = 0x158F5844;
        try {
            this.au(arg2, arg3, v0);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void cm(int arg3, int arg4) {
        this.ad[arg3] = arg4;
        this.ab[arg3] = arg4 & 0xFFFFFF80;
        this.am(arg3, arg4, 0x1C54E78F);
    }

    boolean cn() {
        boolean v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bf.ae();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void co(int arg9, int arg10, int arg11) {
        this.ah(arg9, arg10, -1044114867, -99);
        kc v1 = null;
        if((this.ay[arg9] & 2) != 0) {
            mx v0;
            for(v0 = this.bt.al.ad(); v0 != null; v0 = this.bt.al.ab()) {
                if(((kc)v0).ax * 0x10D54DD4 == arg9 && ((kc)v0).au * 0xD7BF33FD < 0) {
                    this.bd[arg9][((kc)v0).ap * 0x1D70CF25] = v1;
                    this.bd[arg9][arg10] = v0;
                    arg9 = (((kc)v0).ab * 0x26754018 * (((kc)v0).af * 0xDE223061) >> 12) + ((kc)v0).aq * 0x38C2454;
                    ((kc)v0).aq += (arg10 - ((kc)v0).ap * 0x1D70CF25 << 8) * -1066080123;
                    ((kc)v0).ab = (arg9 - ((kc)v0).aq * 0x8D20AE62) * 1026214775;
                    ((kc)v0).af = 0x473A1000;
                    ((kc)v0).ap = arg10 * 21410989;
                    return;
                }
            }
        }

        v0 = this.ax.ax(((long)this.aq[arg9]));
        if(v0 == null) {
            return;
        }

        hs v2 = ((kt)v0).al[arg10];
        if(v2 == null) {
            return;
        }

        kc v3 = new kc();
        v3.ax = 0x743094B * arg9;
        v3.al = ((kt)v0);
        v3.ae = v2;
        v3.ar = ((kt)v0).ap[arg10];
        v3.an = ((kt)v0).aj[arg10] * 1737780835;
        v3.ap = -164311501 * arg10;
        v3.aj = (((kt)v0).ar[arg10] * (((kt)v0).ax * 0xE0312409 * (arg11 * arg11)) + 0x400 >> 11) * -1390782552;
        v3.ad = (((kt)v0).an[arg10] & 0xFF) * 0xFA71271;
        v3.aq = ((arg10 << 8) - (((kt)v0).ae[arg10] & 0x7FFF)) * -1606403033;
        v3.ai = 0;
        v3.av = 0;
        v3.aa = 0;
        v3.au = 0x18C62700;
        v3.am = 0;
        if(this.as[arg9] == 0) {
            v3.ah = hx.ar(v2, this.bb(v3, 0x822890C3), this.bc(v3, 35), this.bm(v3, 0xC0F12F90));
        }
        else {
            v3.ah = hx.ar(v2, this.bb(v3, -1574099834), 0, this.bm(v3, 0xB12A1CFA));
            boolean v2_1 = ((kt)v0).ae[arg10] < 0 ? true : false;
            this.ag(v3, v2_1, 0xA91E0234);
        }

        if(((kt)v0).ae[arg10] < 0) {
            v3.ah.ab(-1);
        }

        if(v3.an * 0xD969FFCD >= 0) {
            kc v0_1 = this.ba[arg9][v3.an * 0x30D37351];
            if(v0_1 != null && v0_1.au * 0xB92D49CC < 0) {
                this.bd[arg9][v0_1.ap * 0x21EC7556] = v1;
                v0_1.au = 0;
            }

            this.ba[arg9][v3.an * 0x938EA827] = v3;
        }

        this.bt.al.al(((mx)v3));
        this.bd[arg9][arg10] = v3;
    }

    void cp() {
        __monitor_enter(this);
        try {
            mx v0_1;
            for(v0_1 = this.ax.ae(); v0_1 != null; v0_1 = this.ax.ar()) {
                ((kt)v0_1).lp();
            }
        }
        catch(Throwable v0) {
            goto label_11;
        }

        __monitor_exit(this);
        return;
    label_11:
        __monitor_exit(this);
        throw v0;
    }

    void cq(int arg3, int arg4) {
        if(arg4 != this.aq[arg3]) {
            this.aq[arg3] = arg4;
            for(arg4 = 0; arg4 < 0x80; ++arg4) {
                this.ba[arg3][arg4] = null;
            }
        }
    }

    void cr() {
        __monitor_enter(this);
        try {
            this.bf.al();
            this.bv(0xBBB403E);
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    boolean cs() {
        boolean v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bf.ae();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void ct(int arg3, int arg4) {
        this.ad[arg3] = arg4;
        this.ab[arg3] = arg4 & 0xFFFFFF80;
        this.am(arg3, arg4, -1911310040);
    }

    void cu(int arg3, int arg4) {
        this.ad[arg3] = arg4;
        this.ab[arg3] = arg4 & 0xFFFFFF80;
        this.am(arg3, arg4, 1985701528);
    }

    void cv(int arg3, int arg4) {
        if(arg4 != this.aq[arg3]) {
            this.aq[arg3] = arg4;
            for(arg4 = 0; arg4 < 0x80; ++arg4) {
                this.ba[arg3][arg4] = null;
            }
        }
    }

    void cw() {
        __monitor_enter(this);
        try {
            mx v0_1;
            for(v0_1 = this.ax.ae(); v0_1 != null; v0_1 = this.ax.ar()) {
                ((kt)v0_1).ae(-1480115883);
            }
        }
        catch(Throwable v0) {
            goto label_12;
        }

        __monitor_exit(this);
        return;
    label_12:
        __monitor_exit(this);
        throw v0;
    }

    boolean cx(kp arg8, ko arg9, gq arg10, int arg11) {
        boolean v1;
        __monitor_enter(this);
        try {
            arg8.al();
            int[] v0 = null;
            v1 = true;
            if(arg11 > 0) {
                v0 = new int[]{arg11};
            }

            mx v11;
            for(v11 = arg8.ax.ae(); v11 != null; v11 = arg8.ax.ar()) {
                int v3 = ((int)((mb)v11).gx);
                long v5 = ((long)v3);
                mx v4 = this.ax.ax(v5);
                if(v4 == null) {
                    kt v4_1 = dc.ax(arg9, v3, 0x7F39E5DC);
                    if(v4_1 == null) {
                        goto label_27;
                    }
                    else {
                        this.ax.al(((mx)v4_1), v5);
                        goto label_23;
                    }
                }
                else {
                label_23:
                    if(!((kt)v4).al(arg10, ((mb)v11).ax, v0, 18)) {
                    label_27:
                        v1 = false;
                    }
                }
            }

            if(v1) {
                arg8.ae();
            }
        }
        catch(Throwable v8) {
            goto label_36;
        }

        __monitor_exit(this);
        return v1;
    label_36:
        __monitor_exit(this);
        throw v8;
    }

    void cy() {
        __monitor_enter(this);
        try {
            mx v0_1;
            for(v0_1 = this.ax.ae(); v0_1 != null; v0_1 = this.ax.ar()) {
                ((kt)v0_1).ae(0x9D95FDA3);
            }
        }
        catch(Throwable v0) {
            goto label_12;
        }

        __monitor_exit(this);
        return;
    label_12:
        __monitor_exit(this);
        throw v0;
    }

    boolean cz() {
        boolean v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.bf.ae();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void da(int arg5) {
        if((this.ay[arg5] & 2) != 0) {
            mx v0;
            for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
                if(arg5 == ((kc)v0).ax * 0x5F4572C7 && this.bd[arg5][((kc)v0).ap * 0xC8DA5D50] == null && ((kc)v0).au * 0x66DDF60A < 0) {
                    ((kc)v0).au = 0;
                }
            }
        }
    }

    void db(kc arg7, boolean arg8) {
        int v8;
        int v0 = arg7.ae.ae.length;
        int v1 = 6;
        if(!arg8 || !arg7.ae.ap) {
            v8 = ((int)((((long)this.as[arg7.ax * 579580696])) * (((long)v0)) >> v1));
        }
        else {
            v8 = ((int)((((long)this.as[arg7.ax * -1487360653])) * (((long)(v0 + v0 - arg7.ae.ar))) >> v1));
            v0 <<= 8;
            if(v8 >= v0) {
                v8 = v0 + v0 - 1 - v8;
                arg7.ah.ag(true);
            }
        }

        arg7.ah.az(v8);
    }

    void dc(int arg1, int arg2) {
    }

    void dd(int arg9) {
        int v1;
        int v0 = arg9 & 0xF0;
        int v2 = 16;
        if(v0 == 0x80) {
            this.ah(arg9 & 15, arg9 >> 8 & 0x7F, arg9 >> v2 & 0x7F, -74);
            return;
        }

        int v3 = 0x40;
        if(v0 == 0x90) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & 0x7F;
            if(arg9 > 0) {
                this.az(v0, v1, arg9, -1105683111);
            }
            else {
                this.ah(v0, v1, v3, -55);
            }

            return;
        }

        if(0xA0 == v0) {
            this.at(arg9 & 15, arg9 >> 8 & 0x7F, arg9 >> v2 & 0x7F, 0x8CDE8438);
            return;
        }

        if(v0 == 0xB0) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & 0x7F;
            if(v1 == 0) {
                this.ab[v0] = (arg9 << 14) + (this.ab[v0] & 0xFFE03FFF);
            }

            if(v1 == 0x20) {
                this.ab[v0] = (this.ab[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 1) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 33) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFFF80) + arg9;
            }

            if(5 == v1) {
                this.av[v0] = (arg9 << 7) + (this.av[v0] & 0xFFFFC07F);
            }

            if(37 == v1) {
                this.av[v0] = (this.av[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == 7) {
                this.an[v0] = (arg9 << 7) + (this.an[v0] & 0xFFFFC07F);
            }

            if(v1 == 39) {
                this.an[v0] = (this.an[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == 10) {
                this.ap[v0] = (arg9 << 7) + (this.ap[v0] & 0xFFFFC07F);
            }

            if(42 == v1) {
                this.ap[v0] = (this.ap[v0] & 0xFFFFFF80) + arg9;
            }

            if(11 == v1) {
                this.aj[v0] = (this.aj[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(43 == v1) {
                this.aj[v0] = (this.aj[v0] & 0xFFFFFF80) + arg9;
            }

            if(v3 == v1) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 1;
                }
                else {
                    this.ay[v0] &= -2;
                }
            }

            if(v1 == 65) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 2;
                }
                else {
                    this.bq(v0, 0x6E0278F3);
                    this.ay[v0] &= -3;
                }
            }

            if(v1 == 99) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + (arg9 << 7);
            }

            if(98 == v1) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + arg9;
            }

            int v5 = 0x4000;
            if(v1 == 101) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + v5 + (arg9 << 7);
            }

            if(v1 == 100) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + v5 + arg9;
            }

            if(v1 == 120) {
                this.ao(v0, 2022448316);
            }

            if(v1 == 0x79) {
                this.as(v0, 0x51EB9223);
            }

            if(0x7B == v1) {
                this.ak(v0, 0x78A24089);
            }

            if(6 == v1 && v5 == this.aw[v0]) {
                this.ao[v0] = (arg9 << 7) + (this.ao[v0] & 0xFFFFC07F);
            }

            if(38 == v1 && v5 == this.aw[v0]) {
                this.ao[v0] = (this.ao[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == v2) {
                this.as[v0] = (arg9 << 7) + (this.as[v0] & 0xFFFFC07F);
            }

            if(v1 == 0x30) {
                this.as[v0] = (this.as[v0] & 0xFFFFFF80) + arg9;
            }

            if(81 == v1) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 4;
                }
                else {
                    this.bx(v0, -1004282904);
                    this.ay[v0] &= -5;
                }
            }

            if(v1 == 17) {
                this.bh(v0, (arg9 << 7) + (this.ak[v0] & 0xFFFFC07F), 1634479670);
            }

            if(v1 == 49) {
                this.bh(v0, (this.ak[v0] & 0xFFFFFF80) + arg9, -1417959079);
            }

            return;
        }

        if(v0 == 0xC0) {
            v0 = arg9 & 15;
            this.am(v0, (arg9 >> 8 & 0x7F) + this.ab[v0], 0xDCA5A822);
            return;
        }

        if(v0 == 0xD0) {
            this.ay(arg9 & 15, arg9 >> 8 & 0x7F, 0xCC6CE548);
            return;
        }

        if(v0 == 0xE0) {
            this.aw(arg9 & 15, (arg9 >> 9 & 0x3F80) + (arg9 >> 8 & 0x7F), 0xCE83BDF5);
            return;
        }

        if(0xFF == (arg9 & 0xFF)) {
            this.bv(0xBBB403E);
            return;
        }
    }

    void de(int arg1, int arg2, int arg3) {
    }

    void df(int arg6) {
        mx v0;
        for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
            int v1 = -1487360653;
            if(arg6 < 0 || ((kc)v0).ax * v1 == arg6) {
                if(((kc)v0).ah != null) {
                    ((kc)v0).ah.aw(ht.ax * 0x2C18D40D / 100);
                    if(((kc)v0).ah.bv()) {
                        this.bt.ae.ax(((kc)v0).ah);
                    }

                    ((kc)v0).ax(1550031640);
                }

                if(((kc)v0).au * 0x46310CB9 < 0) {
                    this.bd[((kc)v0).ax * v1][((kc)v0).ap * 0x1D70CF25] = null;
                }

                ((kc)v0).lp();
            }
        }
    }

    void dg(int arg9) {
        int v1;
        int v0 = -1469552054 & arg9;
        int v2 = 16;
        if(v0 == 0x80) {
            this.ah(arg9 & 15, arg9 >> 8 & 0x41AD5F60, arg9 >> v2 & 0x7F, -47);
            return;
        }

        int v3 = 0x40;
        if(v0 == 0x90) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & 0xAC9A90B4;
            if(arg9 > 0) {
                this.az(v0, v1, arg9, -1379097624);
            }
            else {
                this.ah(v0, v1, v3, 93);
            }

            return;
        }

        if(0xA0 == v0) {
            this.at(arg9 & 15, arg9 >> 8 & 0x4DD0D74E, arg9 >> v2 & 0x7F, -1958878601);
            return;
        }

        if(v0 == 0xB0) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & -749939018;
            if(v1 == 0) {
                this.ab[v0] = (arg9 << 14) + (this.ab[v0] & 0xFFE03FFF);
            }

            if(v1 == 0x20) {
                this.ab[v0] = (this.ab[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 1) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 1586480809) {
                this.ai[v0] = (this.ai[v0] & 0x400675D7) + arg9;
            }

            if(5 == v1) {
                this.av[v0] = (arg9 << 7) + (this.av[v0] & 0xFFFFC07F);
            }

            if(0x64929865 == v1) {
                this.av[v0] = (this.av[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == 7) {
                this.an[v0] = (arg9 << 7) + (this.an[v0] & 0xFFFFC07F);
            }

            if(v1 == 39) {
                this.an[v0] = (this.an[v0] & -42633042) + arg9;
            }

            if(v1 == 10) {
                this.ap[v0] = (arg9 << 7) + (this.ap[v0] & 0xFFFFC07F);
            }

            if(42 == v1) {
                this.ap[v0] = (this.ap[v0] & 0xFFFFFF80) + arg9;
            }

            if(11 == v1) {
                this.aj[v0] = (this.aj[v0] & -761007444) + (arg9 << 7);
            }

            if(-1633562058 == v1) {
                this.aj[v0] = (this.aj[v0] & 0x444BB8C4) + arg9;
            }

            if(v3 == v1) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 1;
                }
                else {
                    this.ay[v0] &= -2;
                }
            }

            if(v1 == -1377723000) {
                if(arg9 >= -1683110730) {
                    this.ay[v0] |= 2;
                }
                else {
                    this.bq(v0, 0xCA04DFFA);
                    this.ay[v0] &= 0xC9DEFE01;
                }
            }

            if(v1 == 99) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + (arg9 << 7);
            }

            if(98 == v1) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + arg9;
            }

            int v4 = 0x4000;
            if(v1 == 101) {
                this.aw[v0] = (this.aw[v0] & 0x8BAF8E7D) + v4 + (arg9 << 7);
            }

            if(v1 == 100) {
                this.aw[v0] = (this.aw[v0] & 0x4C89639F) + v4 + arg9;
            }

            if(v1 == 120) {
                this.ao(v0, 2052778866);
            }

            if(v1 == 0x79) {
                this.as(v0, 1848016045);
            }

            if(0x7B == v1) {
                this.ak(v0, 0x58A1812F);
            }

            if(6 == v1 && 0xB4AAA558 == this.aw[v0]) {
                this.ao[v0] = (arg9 << 7) + (this.ao[v0] & 0x2AA4E8F8);
            }

            if(0x501DC830 == v1 && v4 == this.aw[v0]) {
                this.ao[v0] = (this.ao[v0] & 638232200) + arg9;
            }

            if(v1 == v2) {
                this.as[v0] = (arg9 << 7) + (this.as[v0] & 0xFFFFC07F);
            }

            if(v1 == 0x94125015) {
                this.as[v0] = (this.as[v0] & 0xFFFFFF80) + arg9;
            }

            if(0x320AA14A == v1) {
                if(arg9 >= 1681683085) {
                    this.ay[v0] |= 4;
                }
                else {
                    this.bx(v0, -1004282904);
                    this.ay[v0] &= -5;
                }
            }

            if(v1 == 17) {
                this.bh(v0, (arg9 << 7) + (this.ak[v0] & 0xFFFFC07F), -990807350);
            }

            if(v1 == 49) {
                this.bh(v0, (this.ak[v0] & 0xFFFFFF80) + arg9, 0x2542EE49);
            }

            return;
        }

        if(v0 == -149497900) {
            v0 = arg9 & 15;
            this.am(v0, (arg9 >> 8 & 0x7F) + this.ab[v0], 394825022);
            return;
        }

        if(v0 == -711048215) {
            this.ay(arg9 & 15, arg9 >> 8 & 0x2EAB49F7, 0xEC2703B5);
            return;
        }

        if(v0 == 0xD1B60E29) {
            this.aw(arg9 & 15, (arg9 >> 9 & 0x3F80) + (arg9 >> 8 & 0x7F), 0x6F311FF0);
            return;
        }

        if(0xFF == (arg9 & 0xFF)) {
            this.bv(0xBBB403E);
            return;
        }
    }

    void dh(int arg10, int arg11, int arg12) {
        this.ah(arg10, arg11, 0x77F9FCFA, -12);
        int v1 = 0x1D70CF25;
        kc v2 = null;
        if((this.ay[arg10] & 2) != 0) {
            mx v0;
            for(v0 = this.bt.al.ad(); v0 != null; v0 = this.bt.al.ab()) {
                if(((kc)v0).ax * 0x433699EB == arg10 && ((kc)v0).au * 0xA22402BC < 0) {
                    this.bd[arg10][((kc)v0).ap * 0x3376C485] = v2;
                    this.bd[arg10][arg11] = v0;
                    arg10 = (((kc)v0).ab * -1809088953 * (((kc)v0).af * -474503257) >> 12) + ((kc)v0).aq * 0x1A028907;
                    ((kc)v0).aq += (arg11 - ((kc)v0).ap * v1 << 8) * 0xA6CA3B46;
                    ((kc)v0).ab = (arg10 - ((kc)v0).aq * 0xB962D04D) * 1026214775;
                    ((kc)v0).af = -2040738219;
                    ((kc)v0).ap = arg11 * 21410989;
                    return;
                }
            }
        }

        v0 = this.ax.ax(((long)this.aq[arg10]));
        if(v0 == null) {
            return;
        }

        hs v3 = ((kt)v0).al[arg11];
        if(v3 == null) {
            return;
        }

        kc v4 = new kc();
        v4.ax = 0x3A53D1D5 * arg10;
        v4.al = ((kt)v0);
        v4.ae = v3;
        v4.ar = ((kt)v0).ap[arg11];
        v4.an = ((kt)v0).aj[arg11] * 0xC5AA8A0C;
        v4.ap = 0x456C45D3 * arg11;
        v4.aj = (((kt)v0).ar[arg11] * (((kt)v0).ax * 0xE0312409 * (arg12 * arg12)) + 0x400 >> 11) * 0x7EFD074F;
        v4.ad = (((kt)v0).an[arg11] & 0xFF) * 0x1132B511;
        v4.aq = ((arg11 << 8) - (((kt)v0).ae[arg11] & 0x7FFF)) * -2096801002;
        v4.ai = 0;
        v4.av = 0;
        v4.aa = 0;
        v4.au = 0x8A149045;
        v4.am = 0;
        if(this.as[arg10] == 0) {
            v4.ah = hx.ar(v3, this.bb(v4, -1516807017), this.bc(v4, 0x7C), this.bm(v4, -1051420421));
        }
        else {
            v4.ah = hx.ar(v3, this.bb(v4, 0xAA84EBCD), 0, this.bm(v4, 303706779));
            boolean v3_1 = ((kt)v0).ae[arg11] < 0 ? true : false;
            this.ag(v4, v3_1, 0xD05E7462);
        }

        if(((kt)v0).ae[arg11] < 0) {
            v4.ah.ab(-1);
        }

        if(v4.an * 0xD7C3C9FD >= 0) {
            kc v0_1 = this.ba[arg10][v4.an * 0x4870338D];
            if(v0_1 != null && v0_1.au * 0x30BE4AF0 < 0) {
                this.bd[arg10][v0_1.ap * v1] = v2;
                v0_1.au = 0;
            }

            this.ba[arg10][v4.an * 0xF7D5B75F] = v4;
        }

        this.bt.al.al(((mx)v4));
        this.bd[arg10][arg11] = v4;
    }

    void di() {
        this.ao(-1, 0x791A08EA);
        this.as(-1, 1523043900);
        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = 16;
            if(v1 < v2) {
                this.aq[v1] = this.ad[v1];
                ++v1;
                continue;
            }

            break;
        }

        while(v0 < v2) {
            this.ab[v0] = this.ad[v0] & 0xFFFFFF80;
            ++v0;
        }
    }

    void dj(int arg6) {
        mx v0;
        for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
            int v1 = -1487360653;
            if(arg6 < 0 || ((kc)v0).ax * v1 == arg6) {
                if(((kc)v0).ah != null) {
                    ((kc)v0).ah.aw(ht.ax * 0x2C18D40D / 100);
                    if(((kc)v0).ah.bv()) {
                        this.bt.ae.ax(((kc)v0).ah);
                    }

                    ((kc)v0).ax(494303585);
                }

                if(((kc)v0).au * 0x46310CB9 < 0) {
                    this.bd[((kc)v0).ax * v1][((kc)v0).ap * 0x1D70CF25] = null;
                }

                ((kc)v0).lp();
            }
        }
    }

    void dk(int arg1, int arg2) {
    }

    void dl(int arg5) {
        int v0 = 0;
        if(arg5 < 0) {
            while(v0 < 16) {
                this.as(v0, 0x661DEA75);
                ++v0;
            }

            return;
        }

        this.an[arg5] = 0x3200;
        this.ap[arg5] = 0x2000;
        this.aj[arg5] = 0x3FFF;
        this.af[arg5] = 0x2000;
        this.ai[arg5] = 0;
        this.av[arg5] = 0x2000;
        this.bq(arg5, 0xFCBDA094);
        this.bx(arg5, -1004282904);
        this.ay[arg5] = 0;
        this.aw[arg5] = 0x7FFF;
        this.ao[arg5] = 0x100;
        this.as[arg5] = 0;
        this.bh(arg5, 0x2000, 0xCD500B1F);
    }

    void dm(int arg1, int arg2, int arg3) {
    }

    void dn(int arg5) {
        mx v0;
        for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
            int v1 = -1487360653;
            if((arg5 < 0 || ((kc)v0).ax * v1 == arg5) && ((kc)v0).au * 0x46310CB9 < 0) {
                this.bd[((kc)v0).ax * v1][((kc)v0).ap * 0x1D70CF25] = null;
                ((kc)v0).au = 0;
            }
        }
    }

    void do(int arg4) {
        if((this.ay[arg4] & 4) != 0) {
            mx v0;
            for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
                if(arg4 == ((kc)v0).ax * -1487360653) {
                    ((kc)v0).aw = 0;
                }
            }
        }
    }

    void dp(int arg12, int arg13, int arg14) {
        this.ah(arg12, arg13, 0x40, -50);
        int v1 = -1066080123;
        int v2 = 21410989;
        kc v3 = null;
        int v4 = 0x46310CB9;
        int v5 = 0x1D70CF25;
        if((this.ay[arg12] & 2) != 0) {
            mx v0;
            for(v0 = this.bt.al.ad(); v0 != null; v0 = this.bt.al.ab()) {
                if(((kc)v0).ax * -1487360653 == arg12 && ((kc)v0).au * v4 < 0) {
                    this.bd[arg12][((kc)v0).ap * v5] = v3;
                    this.bd[arg12][arg13] = v0;
                    arg12 = (((kc)v0).ab * -1809088953 * (((kc)v0).af * 0xDE223061) >> 12) + ((kc)v0).aq * 0xB962D04D;
                    ((kc)v0).aq += (arg13 - ((kc)v0).ap * v5 << 8) * v1;
                    ((kc)v0).ab = (arg12 - ((kc)v0).aq * 0xB962D04D) * 1026214775;
                    ((kc)v0).af = 0x473A1000;
                    ((kc)v0).ap = arg13 * v2;
                    return;
                }
            }
        }

        v0 = this.ax.ax(((long)this.aq[arg12]));
        if(v0 == null) {
            return;
        }

        hs v6 = ((kt)v0).al[arg13];
        if(v6 == null) {
            return;
        }

        kc v7 = new kc();
        v7.ax = 0xEFCE3FBB * arg12;
        v7.al = ((kt)v0);
        v7.ae = v6;
        v7.ar = ((kt)v0).ap[arg13];
        v7.an = ((kt)v0).aj[arg13] * 0xD69E649F;
        v7.ap = v2 * arg13;
        v7.aj = (((kt)v0).ar[arg13] * (((kt)v0).ax * 0xE0312409 * (arg14 * arg14)) + 0x400 >> 11) * 0x2C317FF3;
        v7.ad = (((kt)v0).an[arg13] & 0xFF) * 0xFA71271;
        v7.aq = ((arg13 << 8) - (((kt)v0).ae[arg13] & 0x7FFF)) * v1;
        v7.ai = 0;
        v7.av = 0;
        v7.aa = 0;
        v7.au = 0x143CC677;
        v7.am = 0;
        if(this.as[arg12] == 0) {
            v7.ah = hx.ar(v6, this.bb(v7, 0x92BE2FFA), this.bc(v7, 61), this.bm(v7, 0xEF16306E));
        }
        else {
            v7.ah = hx.ar(v6, this.bb(v7, -1428034302), 0, this.bm(v7, 0xB8AF37E1));
            boolean v1_1 = ((kt)v0).ae[arg13] < 0 ? true : false;
            this.ag(v7, v1_1, 1638110071);
        }

        if(((kt)v0).ae[arg13] < 0) {
            v7.ah.ab(-1);
        }

        v1 = 0xF7D5B75F;
        if(v7.an * v1 >= 0) {
            kc v0_1 = this.ba[arg12][v7.an * v1];
            if(v0_1 != null && v0_1.au * v4 < 0) {
                this.bd[arg12][v0_1.ap * v5] = v3;
                v0_1.au = 0;
            }

            this.ba[arg12][v7.an * v1] = v7;
        }

        this.bt.al.al(((mx)v7));
        this.bd[arg12][arg13] = v7;
    }

    void dq(int arg4) {
        if((this.ay[arg4] & 4) != 0) {
            mx v0;
            for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
                if(arg4 == ((kc)v0).ax * -1487360653) {
                    ((kc)v0).aw = 0;
                }
            }
        }
    }

    void dr(int arg5) {
        int v0 = 0;
        if(arg5 < 0) {
            while(v0 < 16) {
                this.as(v0, 0x78AFB5A0);
                ++v0;
            }

            return;
        }

        this.an[arg5] = 0x3200;
        this.ap[arg5] = 0x2000;
        this.aj[arg5] = 0x3FFF;
        this.af[arg5] = 0x2000;
        this.ai[arg5] = 0;
        this.av[arg5] = 0x2000;
        this.bq(arg5, 0xDF37707C);
        this.bx(arg5, -1004282904);
        this.ay[arg5] = 0;
        this.aw[arg5] = 0x7FFF;
        this.ao[arg5] = 0x100;
        this.as[arg5] = 0;
        this.bh(arg5, 0x2000, 0xA7D9CEBC);
    }

    void ds(int arg6) {
        mx v0;
        for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
            int v1 = -1487360653;
            if(arg6 < 0 || ((kc)v0).ax * v1 == arg6) {
                if(((kc)v0).ah != null) {
                    ((kc)v0).ah.aw(ht.ax * 0x2C18D40D / 100);
                    if(((kc)v0).ah.bv()) {
                        this.bt.ae.ax(((kc)v0).ah);
                    }

                    ((kc)v0).ax(160715111);
                }

                if(((kc)v0).au * 0x46310CB9 < 0) {
                    this.bd[((kc)v0).ax * v1][((kc)v0).ap * 0x1D70CF25] = null;
                }

                ((kc)v0).lp();
            }
        }
    }

    void dt(int arg10) {
        int v1;
        int v0 = 0xE582A3E6 & arg10;
        int v2 = 16;
        if(v0 == 0x80) {
            this.ah(arg10 & 15, arg10 >> 8 & 0x94750E78, arg10 >> v2 & 0x7F, 56);
            return;
        }

        int v3 = 0x40;
        if(v0 == 0x90) {
            v0 = arg10 & 15;
            v1 = arg10 >> 8 & 0x7F;
            arg10 = arg10 >> v2 & 0x7F;
            if(arg10 > 0) {
                this.az(v0, v1, arg10, -1153702325);
            }
            else {
                this.ah(v0, v1, v3, -59);
            }

            return;
        }

        if(0xA0 == v0) {
            this.at(arg10 & 15, arg10 >> 8 & 0x11061E9E, arg10 >> v2 & 0x7F, -2041492902);
            return;
        }

        if(v0 == 1407247930) {
            v0 = arg10 & 15;
            v1 = arg10 >> 8 & 0x7F;
            arg10 = arg10 >> v2 & 0x7F;
            if(v1 == 0) {
                this.ab[v0] = (arg10 << 14) + (this.ab[v0] & 0xFFE03FFF);
            }

            if(v1 == 0x20) {
                this.ab[v0] = (this.ab[v0] & 2104460082) + (arg10 << 7);
            }

            if(v1 == 1) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFC07F) + (arg10 << 7);
            }

            if(v1 == 0xA8FD13B3) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFFF80) + arg10;
            }

            if(5 == v1) {
                this.av[v0] = (arg10 << 7) + (this.av[v0] & 0xFFFFC07F);
            }

            if(-726103088 == v1) {
                this.av[v0] = (this.av[v0] & 0xFFFFFF80) + arg10;
            }

            if(v1 == 7) {
                this.an[v0] = (arg10 << 7) + (this.an[v0] & 0xFFFFC07F);
            }

            if(v1 == -636324023) {
                this.an[v0] = (this.an[v0] & 0xFFFFFF80) + arg10;
            }

            if(v1 == 10) {
                this.ap[v0] = (arg10 << 7) + (this.ap[v0] & -468301869);
            }

            if(0xEB0FF0D4 == v1) {
                this.ap[v0] = (this.ap[v0] & 0xF1469F4E) + arg10;
            }

            if(11 == v1) {
                this.aj[v0] = (this.aj[v0] & -1565606599) + (arg10 << 7);
            }

            if(43 == v1) {
                this.aj[v0] = (this.aj[v0] & 0xFFFFFF80) + arg10;
            }

            if(v3 == v1) {
                if(arg10 >= v3) {
                    this.ay[v0] |= 1;
                }
                else {
                    this.ay[v0] &= -2;
                }
            }

            if(v1 == 65) {
                if(arg10 >= v3) {
                    this.ay[v0] |= 2;
                }
                else {
                    this.bq(v0, 1580458417);
                    this.ay[v0] &= -3;
                }
            }

            if(v1 == 99) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + (arg10 << 7);
            }

            if(0xE00A4A08 == v1) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + arg10;
            }

            if(v1 == 0x4FC3FFDE) {
                this.aw[v0] = (this.aw[v0] & 0xEAFECCF8) + 0x3E8EA5D0 + (arg10 << 7);
            }

            if(v1 == -115981019) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) - 0x2D0B67F0 + arg10;
            }

            if(v1 == 120) {
                this.ao(v0, 0x7F705778);
            }

            if(v1 == 0x79) {
                this.as(v0, 0x50E69220);
            }

            if(0x7B == v1) {
                this.ak(v0, 0xDD8100D);
            }

            if(6 == v1 && 0x4000 == this.aw[v0]) {
                this.ao[v0] = (arg10 << 7) + (this.ao[v0] & 0xFFFFC07F);
            }

            if(-214336072 == v1 && 80226072 == this.aw[v0]) {
                this.ao[v0] = (this.ao[v0] & 0xFFFFFF80) + arg10;
            }

            if(v1 == v2) {
                this.as[v0] = (arg10 << 7) + (this.as[v0] & 0xFFFFC07F);
            }

            if(v1 == 0x81BF884D) {
                this.as[v0] = (this.as[v0] & 0x8D1DAD40) + arg10;
            }

            if(81 == v1) {
                if(arg10 >= 0x7E74BC24) {
                    this.ay[v0] |= 4;
                }
                else {
                    this.bx(v0, -1004282904);
                    this.ay[v0] &= -5;
                }
            }

            if(v1 == 17) {
                this.bh(v0, (arg10 << 7) + (this.ak[v0] & 0xFFFFC07F), 1503139269);
            }

            if(v1 == 950422330) {
                this.bh(v0, (this.ak[v0] & 0xFFFFFF80) + arg10, 1709074917);
            }

            return;
        }

        if(v0 == 0x2087139C) {
            v0 = arg10 & 15;
            this.am(v0, (arg10 >> 8 & 0x7F) + this.ab[v0], 0xF05A536E);
            return;
        }

        if(v0 == 0x2C4DD620) {
            this.ay(arg10 & 15, arg10 >> 8 & 0x7F, 0xBC7B8E20);
            return;
        }

        if(v0 == -1909764454) {
            this.aw(arg10 & 15, (arg10 >> 9 & 0x3F80) + (arg10 >> 8 & 0xC552DA89), 720259414);
            return;
        }

        if(768722084 == (arg10 & 0xD7450592)) {
            this.bv(0xBBB403E);
            return;
        }
    }

    void du(int arg4, int arg5, int arg6) {
        kc v6 = this.bd[arg4][arg5];
        if(v6 == null) {
            return;
        }

        this.bd[arg4][arg5] = null;
        if((this.ay[arg4] & 2) != 0) {
            mx v4;
            for(v4 = this.bt.al.aj(); v4 != null; v4 = this.bt.al.aq()) {
                if(v6.ax * 0xA3D21F0C == ((kc)v4).ax * -1487360653 && ((kc)v4).au * -53324510 < 0 && (((kc)v4)) != v6) {
                    v6.au = 0;
                    return;
                }
            }
        }
        else {
            v6.au = 0;
        }
    }

    void dv(int arg12, int arg13, int arg14) {
        this.ah(arg12, arg13, 0x40, -3);
        int v1 = -1066080123;
        kc v2 = null;
        int v3 = 21410989;
        int v4 = 0x46310CB9;
        int v5 = 0x1D70CF25;
        if((this.ay[arg12] & 2) != 0) {
            mx v0;
            for(v0 = this.bt.al.ad(); v0 != null; v0 = this.bt.al.ab()) {
                if(((kc)v0).ax * -1487360653 == arg12 && ((kc)v0).au * v4 < 0) {
                    this.bd[arg12][((kc)v0).ap * v5] = v2;
                    this.bd[arg12][arg13] = v0;
                    arg12 = (((kc)v0).ab * -1809088953 * (((kc)v0).af * 0xDE223061) >> 12) + ((kc)v0).aq * 0xB962D04D;
                    ((kc)v0).aq += (arg13 - ((kc)v0).ap * v5 << 8) * v1;
                    ((kc)v0).ab = (arg12 - ((kc)v0).aq * 0xB962D04D) * 1026214775;
                    ((kc)v0).af = 0x473A1000;
                    ((kc)v0).ap = arg13 * v3;
                    return;
                }
            }
        }

        v0 = this.ax.ax(((long)this.aq[arg12]));
        if(v0 == null) {
            return;
        }

        hs v6 = ((kt)v0).al[arg13];
        if(v6 == null) {
            return;
        }

        kc v7 = new kc();
        v7.ax = 0xEFCE3FBB * arg12;
        v7.al = ((kt)v0);
        v7.ae = v6;
        v7.ar = ((kt)v0).ap[arg13];
        v7.an = ((kt)v0).aj[arg13] * 0xD69E649F;
        v7.ap = v3 * arg13;
        v7.aj = (((kt)v0).ar[arg13] * (((kt)v0).ax * 0xE0312409 * (arg14 * arg14)) + 0x400 >> 11) * 0x2C317FF3;
        v7.ad = (((kt)v0).an[arg13] & 0xFF) * 0xFA71271;
        v7.aq = ((arg13 << 8) - (((kt)v0).ae[arg13] & 0x7FFF)) * v1;
        v7.ai = 0;
        v7.av = 0;
        v7.aa = 0;
        v7.au = 0x143CC677;
        v7.am = 0;
        if(this.as[arg12] == 0) {
            v7.ah = hx.ar(v6, this.bb(v7, 0xA3799966), this.bc(v7, 103), this.bm(v7, -1273000761));
        }
        else {
            v7.ah = hx.ar(v6, this.bb(v7, -2076401843), 0, this.bm(v7, -1951896930));
            boolean v1_1 = ((kt)v0).ae[arg13] < 0 ? true : false;
            this.ag(v7, v1_1, -882936100);
        }

        if(((kt)v0).ae[arg13] < 0) {
            v7.ah.ab(-1);
        }

        v1 = 0xF7D5B75F;
        if(v7.an * v1 >= 0) {
            kc v0_1 = this.ba[arg12][v7.an * v1];
            if(v0_1 != null && v0_1.au * v4 < 0) {
                this.bd[arg12][v0_1.ap * v5] = v2;
                v0_1.au = 0;
            }

            this.ba[arg12][v7.an * v1] = v7;
        }

        this.bt.al.al(((mx)v7));
        this.bd[arg12][arg13] = v7;
    }

    void dw(kc arg7, boolean arg8) {
        int v8;
        int v0 = arg7.ae.ae.length;
        int v1 = 6;
        int v2 = -1487360653;
        if(!arg8 || !arg7.ae.ap) {
            v8 = ((int)((((long)this.as[arg7.ax * v2])) * (((long)v0)) >> v1));
        }
        else {
            v8 = ((int)((((long)this.as[arg7.ax * v2])) * (((long)(v0 + v0 - arg7.ae.ar))) >> v1));
            v0 <<= 8;
            if(v8 >= v0) {
                v8 = v0 + v0 - 1 - v8;
                arg7.ah.ag(true);
            }
        }

        arg7.ah.az(v8);
    }

    void dx() {
        this.ao(-1, 0x79BD001F);
        this.as(-1, 0x74F25379);
        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = 16;
            if(v1 < v2) {
                this.aq[v1] = this.ad[v1];
                ++v1;
                continue;
            }

            break;
        }

        while(v0 < v2) {
            this.ab[v0] = this.ad[v0] & 0xFFFFFF80;
            ++v0;
        }
    }

    void dy(int arg5) {
        mx v0;
        for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
            if(arg5 < 0 || ((kc)v0).ax * 0x4AE73951 == arg5) {
                if(((kc)v0).ah != null) {
                    ((kc)v0).ah.aw(ht.ax * 0x2C18D40D / 100);
                    if(((kc)v0).ah.bv()) {
                        this.bt.ae.ax(((kc)v0).ah);
                    }

                    ((kc)v0).ax(0xA51FAA1D);
                }

                if(((kc)v0).au * 0x2BE70F27 < 0) {
                    this.bd[((kc)v0).ax * 0x1C8E727][((kc)v0).ap * 1541500484] = null;
                }

                ((kc)v0).lp();
            }
        }
    }

    void dz(int arg4) {
        if((this.ay[arg4] & 4) != 0) {
            mx v0;
            for(v0 = this.bt.al.aj(); v0 != null; v0 = this.bt.al.aq()) {
                if(arg4 == ((kc)v0).ax * -1487360653) {
                    ((kc)v0).aw = 0;
                }
            }
        }
    }

    void ea(int arg10, int arg11) {
        this.ak[arg10] = arg11;
        this.ac[arg10] = ((int)(Math.pow(2, (((double)arg11)) * 0.000549) * 2097152 + 0.5));
    }

    boolean eb(kc arg20, int[] arg21, int arg22, int arg23) {
        int v8;
        ks v0 = this;
        kc v1 = arg20;
        int[] v2 = arg21;
        int v3 = arg23;
        v1.at = ht.ax * 0x2C18D40D / 100 * 159024707;
        kc v6 = null;
        int v7 = 0xF7D5B75F;
        if(v1.au * 0x46310CB9 >= 0 && (v1.ah == null || (v1.ah.ak()))) {
            v1.ax(1220667237);
            arg20.lp();
            if(v1.an * -1186960220 > 0 && v1 == v0.ba[v1.ax * 0x54A5BEC][v1.an * -1550031330]) {
                v0.ba[v1.ax * 442979043][v1.an * v7] = v6;
            }

            return 1;
        }

        int v4 = v1.af * 0xCE0E9C88;
        double v10 = 0.5;
        double v12 = 2;
        if(v4 > 0) {
            int v9 = v4 - (((int)(Math.pow(v12, (((double)v0.av[v1.ax * 0x8092D005])) * 0.000492) * 16 + v10)));
            if(v9 < 0) {
                v9 = 0;
            }

            v1.af = v9 * 2000974753;
        }

        v1.ah.ao(v0.bb(v1, 0x86DA360B));
        kk v4_1 = v1.ar;
        v1.az += 0xFA46E0FB;
        v1.ag += v4_1.ad * 485322023;
        double v14 = (((double)((v1.ap * 0x1D70CF25 - 60 << 8) + (v1.af * 0xDE223061 * (v1.ab * -1809088953) >> 12)))) * 0.000005;
        double v17 = 128;
        if(v4_1.ae * 0x960583D3 > 0) {
            v1.ai += v4_1.ap * 0x34B8FD71 > 0 ? (((int)(Math.pow(v12, (((double)(v4_1.ap * 0xE0CA9829))) * v14) * v17 + v10))) * 105907150 : -1103081783;
        }

        if(v4_1.ax != null) {
            int v6_1 = 0x460E5DDF;
            v1.av += v4_1.ar * v6_1 > 0 ? (((int)(Math.pow(v12, (((double)(v4_1.ar * v6_1))) * v14) * v17 + v10))) * 0x20DDD084 : 0xE770C734;
            while(v1.aa * 0x610E4719 < v4_1.ax.length - 2) {
                if(v1.av * 0xEB823A74 <= (v4_1.ax[v1.aa * 0x1003B1C8 + 2] & 0xFF) << 8) {
                    break;
                }

                v1.aa += 0xED30C52F;
            }

            if(v4_1.ax.length - 2 != v1.aa * -1090970686) {
                goto label_199;
            }

            if(v4_1.ax[v1.aa * 0xDAB820EA + 1] != 0) {
                goto label_199;
            }

            v8 = 1;
        }
        else {
        label_199:
            v8 = 0;
        }

        if(v1.au * 0x46310CB9 >= 0 && v4_1.al != null && (v0.ay[v1.ax * 0xD7619331] & 1) == 0 && (v1.an * 0xF7D5B75F < 0 || v1 != v0.ba[v1.ax * 0xE77F1DBF][v1.an * 1474020396])) {
            v1.au += v4_1.an * 0xF7130A0B > 0 ? (((int)(Math.pow(v12, v14 * (((double)(v4_1.an * 0xBC7B9BEB)))) * v17 + v10))) * -1210814791 : 0xE19CC480;
            while(v1.am * 0x38431316 < v4_1.al.length - 2) {
                if(v1.au * -304443772 <= (v4_1.al[v1.am * -1740328205 + 2] & 0xFF) << 8) {
                    break;
                }

                v1.am += 440648475;
            }

            if(v4_1.al.length - 2 != v1.am * 0xE24623D7) {
                goto label_283;
            }

            v8 = 1;
        }

    label_283:
        if(v8 != 0) {
            v1.ah.aw(v1.at * 0x5F136103);
            if(v2 != null) {
                v1.ah.aq(v2, arg22, v3);
            }
            else {
                v1.ah.af(v3);
            }

            if(v1.ah.bv()) {
                v0.bt.ae.ax(v1.ah);
            }

            v1.ax(0xA079971D);
            if(v1.au * 0x46310CB9 >= 0) {
                arg20.lp();
                if(v1.an * 0x9172410C > 0 && v0.ba[v1.ax * -1027007898][v1.an * 0xF7D5B75F] == v1) {
                    v0.ba[v1.ax * 1097694324][v1.an * 0xFEC02DF2] = null;
                }
            }

            return 1;
        }

        v1.ah.ay(v1.at * 0x9F8D766B, v0.bc(v1, 54), v0.bm(v1, 0x7DF75B1));
        return 0;
    }

    public void ec(boolean arg1) {
        this.ar = arg1;
    }

    boolean ed(kc arg21, int[] arg22, int arg23, int arg24) {
        int v6_1;
        ks v0 = this;
        kc v1 = arg21;
        int[] v2 = arg22;
        int v3 = arg24;
        v1.at = ht.ax * 0x2C18D40D / 100 * 159024707;
        int v5 = 0x46310CB9;
        kc v6 = null;
        int v8 = -1487360653;
        int v9 = 0xF7D5B75F;
        if(v1.au * v5 >= 0 && (v1.ah == null || (v1.ah.ak()))) {
            v1.ax(0xAA056670);
            arg21.lp();
            if(v1.an * v9 > 0 && v1 == v0.ba[v1.ax * v8][v1.an * v9]) {
                v0.ba[v1.ax * v8][v1.an * v9] = v6;
            }

            return 1;
        }

        int v10 = 0xDE223061;
        int v4 = v1.af * v10;
        double v12 = 0.5;
        double v14 = 2;
        if(v4 > 0) {
            int v11 = v4 - (((int)(Math.pow(v14, (((double)v0.av[v1.ax * v8])) * 0.000492) * 16 + v12)));
            if(v11 < 0) {
                v11 = 0;
            }

            v1.af = v11 * 2000974753;
        }

        v1.ah.ao(v0.bb(v1, 0x9B3F9353));
        kk v4_1 = v1.ar;
        v1.az += 0xFA46E0FB;
        v1.ag += v4_1.ad * 485322023;
        double v10_1 = (((double)((v1.ap * 0x1D70CF25 - 60 << 8) + (v1.af * v10 * (v1.ab * -1809088953) >> 12)))) * 0.000005;
        double v16 = 128;
        if(v4_1.ae * 0x960583D3 > 0) {
            v8 = 0x34B8FD71;
            v1.ai += v4_1.ap * v8 > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ap * v8))) * v10_1) * v16 + v12))) * 0x3EEEA37 : 0xF7751B80;
        }

        if(v4_1.ax != null) {
            v1.av += v4_1.ar * 0x460E5DDF > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ar * 0x460E5DDF))) * v10_1) * v16 + v12))) * 244021971 : 1170041216;
            while(true) {
                v8 = 0x610E4719;
                if(v1.aa * v8 < v4_1.ax.length - 2 && v1.av * 0x5FB2ED5B > (v4_1.ax[v1.aa * v8 + 2] & 0xFF) << 8) {
                    v1.aa += 0x8BE04A52;
                    continue;
                }

                break;
            }

            if(v4_1.ax.length - 2 != v1.aa * v8) {
                goto label_191;
            }

            if(v4_1.ax[v1.aa * v8 + 1] != 0) {
                goto label_191;
            }

            v6_1 = 1;
        }
        else {
        label_191:
            v6_1 = 0;
        }

        if(v1.au * v5 >= 0 && v4_1.al != null) {
            int v12_1 = -1487360653;
            if((v0.ay[v1.ax * v12_1] & 1) == 0) {
                v9 = 0xF7D5B75F;
                if(v1.an * v9 >= 0 && v1 == v0.ba[v1.ax * v12_1][v1.an * v9]) {
                    goto label_269;
                }

                v1.au += v4_1.an * 0xF7130A0B > 0 ? (((int)(Math.pow(v14, v10_1 * (((double)(v4_1.an * 0xF7130A0B)))) * v16 + 0.5))) * 0xEBC33989 : 0xE19CC480;
                while(true) {
                    v9 = 0xB13D1313;
                    if(v1.am * v9 < v4_1.al.length - 2 && v1.au * v5 > (v4_1.al[v1.am * v9 + 2] & 0xFF) << 8) {
                        v1.am += 0xE60F5E36;
                        continue;
                    }

                    break;
                }

                if(v4_1.al.length - 2 != v1.am * v9) {
                    goto label_269;
                }

                v6_1 = 1;
            }
        }

    label_269:
        if(v6_1 != 0) {
            v1.ah.aw(v1.at * 0x9F8D766B);
            if(v2 != null) {
                v1.ah.aq(v2, arg23, v3);
            }
            else {
                v1.ah.af(v3);
            }

            if(v1.ah.bv()) {
                v0.bt.ae.ax(v1.ah);
            }

            v1.ax(285009008);
            if(v1.au * v5 >= 0) {
                arg21.lp();
                v3 = 0xF7D5B75F;
                if(v1.an * v3 > 0) {
                    v5 = -1487360653;
                    if(v0.ba[v1.ax * v5][v1.an * v3] == v1) {
                        v0.ba[v1.ax * v5][v1.an * v3] = null;
                    }
                }
            }

            return 1;
        }

        v1.ah.ay(v1.at * 0x9F8D766B, v0.bc(v1, 0x3F), v0.bm(v1, 0x28B6D2B));
        return 0;
    }

    boolean ee(kc arg5) {
        if(arg5.ah == null) {
            if(arg5.au * 0x46310CB9 >= 0) {
                arg5.lp();
                int v1 = 0xF7D5B75F;
                if(arg5.an * v1 > 0 && this.ba[arg5.ax * 0xB01F5C08][arg5.an * v1] == arg5) {
                    this.ba[arg5.ax * -1487360653][arg5.an * 435730101] = null;
                }
            }

            return 1;
        }

        return 0;
    }

    void eg() {
        int v0 = this.bp * 0x4583BF39;
        int v2 = 0x6D30F02F;
        int v1 = this.bw * v2;
        long v5;
        for(v5 = this.by * 0x597C362D5EB796CDL; v1 == this.bw * v2; v5 = this.bf.ai(v1)) {
            while(this.bf.an[v0] == v1) {
                this.bf.an(v0);
                int v3 = this.bf.aq(v0);
                if(v3 == 1) {
                    this.bf.aj();
                    this.bf.ap(v0);
                    if(!this.bf.aa()) {
                    }
                    else {
                        if((this.bn) && v1 != 0) {
                            this.bf.au(v5);
                            break;
                        }

                        this.bv(0xBBB403E);
                        this.bf.al();
                        return;
                    }
                }
                else {
                    if((v3 & 0x80) != 0) {
                        this.bg(v3, -50);
                    }

                    this.bf.ad(v0);
                    this.bf.ap(v0);
                    continue;
                }

                break;
            }

            v0 = this.bf.av();
            v1 = this.bf.an[v0];
        }

        this.bp = v0 * 0xC5897F09;
        this.bw = v1 * 0x69A256CF;
        this.by = v5 * -4562680899733928443L;
    }

    public void eh(boolean arg1) {
        this.ar = arg1;
    }

    public void ei(boolean arg1) {
        this.ar = arg1;
    }

    int ej(kc arg10) {
        int v4;
        int v5;
        int v2;
        kk v0 = arg10.ar;
        int v1 = this.an[arg10.ax * -1487360653] * this.aj[arg10.ax * -1487360653] + 0x1000 >> 13;
        v1 = (arg10.aj * 0xCFE313B * (v1 * v1 + 0x4000 >> 15) + 0x4000 >> 15) * (this.al * 0xE37D395B) + 0x80 >> 8;
        int v3 = 0x960583D3;
        if(v0.ae * v3 > 0) {
            v1 = ((int)((((double)v1)) * Math.pow(0.5, (((double)(arg10.ai * 0x1B0EEB87))) * 0.00002 * (((double)(v0.ae * v3)))) + 0.5));
        }

        if(v0.ax != null) {
            v2 = arg10.av * 0x5FB2ED5B;
            v5 = 0x610E4719;
            v3 = v0.ax[arg10.aa * v5 + 1];
            if(arg10.aa * v5 < v0.ax.length - 2) {
                v4 = (v0.ax[arg10.aa * v5] & 0xFF) << 8;
                v3 += (v2 - v4) * (v0.ax[arg10.aa * v5 + 3] - v3) / (((v0.ax[arg10.aa * v5 + 2] & 0xFF) << 8) - v4);
            }

            v1 = v3 * v1 + 0x20 >> 6;
        }

        v3 = 0x46310CB9;
        if(arg10.au * v3 > 0 && v0.al != null) {
            v2 = arg10.au * v3;
            v5 = 0xB13D1313;
            v3 = v0.al[arg10.am * v5 + 1];
            if(arg10.am * v5 < v0.al.length - 2) {
                v4 = (v0.al[arg10.am * v5] & 0xFF) << 8;
                v3 += (v2 - v4) * (v0.al[arg10.am * v5 + 3] - v3) / (((v0.al[arg10.am * v5 + 2] & 0xFF) << 8) - v4);
            }

            v1 = v3 * v1 + 0x20 >> 6;
        }

        return v1;
    }

    void ek(int arg9) {
        int v1;
        int v0 = arg9 & 0xF0;
        int v2 = 16;
        if(v0 == 0x80) {
            this.ah(arg9 & 15, arg9 >> 8 & 0x7F, arg9 >> v2 & 0x7F, -50);
            return;
        }

        int v3 = 0x40;
        if(v0 == 0x90) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & 0x7F;
            if(arg9 > 0) {
                this.az(v0, v1, arg9, 0x83C3D206);
            }
            else {
                this.ah(v0, v1, v3, -58);
            }

            return;
        }

        if(0xA0 == v0) {
            this.at(arg9 & 15, arg9 >> 8 & 0x7F, arg9 >> v2 & 0x7F, -1723158804);
            return;
        }

        if(v0 == 0xB0) {
            v0 = arg9 & 15;
            v1 = arg9 >> 8 & 0x7F;
            arg9 = arg9 >> v2 & 0x7F;
            if(v1 == 0) {
                this.ab[v0] = (arg9 << 14) + (this.ab[v0] & 0xFFE03FFF);
            }

            if(v1 == 0x20) {
                this.ab[v0] = (this.ab[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 1) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(v1 == 33) {
                this.ai[v0] = (this.ai[v0] & 0xFFFFFF80) + arg9;
            }

            if(5 == v1) {
                this.av[v0] = (arg9 << 7) + (this.av[v0] & 0xFFFFC07F);
            }

            if(37 == v1) {
                this.av[v0] = (this.av[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == 7) {
                this.an[v0] = (arg9 << 7) + (this.an[v0] & 0xFFFFC07F);
            }

            if(v1 == 39) {
                this.an[v0] = (this.an[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == 10) {
                this.ap[v0] = (arg9 << 7) + (this.ap[v0] & 0xFFFFC07F);
            }

            if(42 == v1) {
                this.ap[v0] = (this.ap[v0] & 0xFFFFFF80) + arg9;
            }

            if(11 == v1) {
                this.aj[v0] = (this.aj[v0] & 0xFFFFC07F) + (arg9 << 7);
            }

            if(43 == v1) {
                this.aj[v0] = (this.aj[v0] & 0xFFFFFF80) + arg9;
            }

            if(v3 == v1) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 1;
                }
                else {
                    this.ay[v0] &= -2;
                }
            }

            if(v1 == 65) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 2;
                }
                else {
                    this.bq(v0, 0xD6DAD16);
                    this.ay[v0] &= -3;
                }
            }

            if(v1 == 99) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + (arg9 << 7);
            }

            if(98 == v1) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + arg9;
            }

            int v5 = 0x4000;
            if(v1 == 101) {
                this.aw[v0] = (this.aw[v0] & 0x7F) + v5 + (arg9 << 7);
            }

            if(v1 == 100) {
                this.aw[v0] = (this.aw[v0] & 0x3F80) + v5 + arg9;
            }

            if(v1 == 120) {
                this.ao(v0, 0x7F727932);
            }

            if(v1 == 0x79) {
                this.as(v0, 1532807818);
            }

            if(0x7B == v1) {
                this.ak(v0, -108591806);
            }

            if(6 == v1 && v5 == this.aw[v0]) {
                this.ao[v0] = (arg9 << 7) + (this.ao[v0] & 0xFFFFC07F);
            }

            if(38 == v1 && v5 == this.aw[v0]) {
                this.ao[v0] = (this.ao[v0] & 0xFFFFFF80) + arg9;
            }

            if(v1 == v2) {
                this.as[v0] = (arg9 << 7) + (this.as[v0] & 0xFFFFC07F);
            }

            if(v1 == 0x30) {
                this.as[v0] = (this.as[v0] & 0xFFFFFF80) + arg9;
            }

            if(81 == v1) {
                if(arg9 >= v3) {
                    this.ay[v0] |= 4;
                }
                else {
                    this.bx(v0, -1004282904);
                    this.ay[v0] &= -5;
                }
            }

            if(v1 == 17) {
                this.bh(v0, (arg9 << 7) + (this.ak[v0] & 0xFFFFC07F), 0x458E227D);
            }

            if(v1 == 49) {
                this.bh(v0, (this.ak[v0] & 0xFFFFFF80) + arg9, 0x600A29C5);
            }

            return;
        }

        if(v0 == 0xC0) {
            v0 = arg9 & 15;
            this.am(v0, (arg9 >> 8 & 0x7F) + this.ab[v0], 0xDE02B0AA);
            return;
        }

        if(v0 == 0xD0) {
            this.ay(arg9 & 15, arg9 >> 8 & 0x7F, -1785439420);
            return;
        }

        if(v0 == 0xE0) {
            this.aw(arg9 & 15, (arg9 >> 9 & 0x3F80) + (arg9 >> 8 & 0x7F), 0x62A4213B);
            return;
        }

        if(0xFF == (arg9 & 0xFF)) {
            this.bv(0xBBB403E);
            return;
        }
    }

    int el(kc arg4) {
        int v0 = this.ap[arg4.ax * 0xACF52F23];
        if(v0 < 0x2000) {
            return arg4.ad * 0xBC14B6C1 * v0 - 0x3AF03CC1 >> 6;
        }

        return -411907803 - ((0x80 - arg4.ad * -1892177020) * (764107977 - v0) + 0x20 >> 6);
    }

    int em(kc arg10) {
        int v4;
        int v5;
        int v2;
        kk v0 = arg10.ar;
        int v1 = this.an[arg10.ax * -1487360653] * this.aj[arg10.ax * -1487360653] + 0x1000 >> 13;
        v1 = (arg10.aj * 0xCFE313B * (v1 * v1 + 0x4000 >> 15) + 0x4000 >> 15) * (this.al * 0xE37D395B) + 0x80 >> 8;
        int v3 = 0x960583D3;
        if(v0.ae * v3 > 0) {
            v1 = ((int)((((double)v1)) * Math.pow(0.5, (((double)(arg10.ai * 0x1B0EEB87))) * 0.00002 * (((double)(v0.ae * v3)))) + 0.5));
        }

        if(v0.ax != null) {
            v2 = arg10.av * 0x5FB2ED5B;
            v5 = 0x610E4719;
            v3 = v0.ax[arg10.aa * v5 + 1];
            if(arg10.aa * v5 < v0.ax.length - 2) {
                v4 = (v0.ax[arg10.aa * v5] & 0xFF) << 8;
                v3 += (v2 - v4) * (v0.ax[arg10.aa * v5 + 3] - v3) / (((v0.ax[arg10.aa * v5 + 2] & 0xFF) << 8) - v4);
            }

            v1 = v3 * v1 + 0x20 >> 6;
        }

        v3 = 0x46310CB9;
        if(arg10.au * v3 > 0 && v0.al != null) {
            v2 = arg10.au * v3;
            v5 = 0xB13D1313;
            v3 = v0.al[arg10.am * v5 + 1];
            if(arg10.am * v5 < v0.al.length - 2) {
                v4 = (v0.al[arg10.am * v5] & 0xFF) << 8;
                v3 += (v2 - v4) * (v0.al[arg10.am * v5 + 3] - v3) / (((v0.al[arg10.am * v5 + 2] & 0xFF) << 8) - v4);
            }

            v1 = v3 * v1 + 0x20 >> 6;
        }

        return v1;
    }

    int en(kc arg5) {
        int v0 = this.ap[arg5.ax * -1487360653];
        if(v0 < 0x2000) {
            return arg5.ad * 0x6248B34B * v0 - 0x70C02CF0 >> 6;
        }

        return 0x4242F75D - ((0x80 - arg5.ad * 0x1830B363) * (0x4000 - v0) - 2051839275 >> 6);
    }

    int eq(kc arg10) {
        int v3 = -1487360653;
        int v0 = arg10.aq * 0xB962D04D + (arg10.af * 0xDE223061 * (arg10.ab * -1809088953) >> 12) + ((this.af[arg10.ax * v3] - 0x2000) * this.ao[arg10.ax * v3] >> 12);
        kk v1 = arg10.ar;
        if(v1.ad * 0x223D2CAD > 0) {
            int v5 = 0x5003AF3D;
            if(v1.aj * v5 <= 0 && this.ai[arg10.ax * v3] <= 0) {
                goto label_73;
            }

            int v4 = v1.aj * v5 << 2;
            int v1_1 = v1.aq * 0xDF355FE9 << 1;
            int v6 = 0xC7682A33;
            if(arg10.az * v6 < v1_1) {
                v4 = v4 * (arg10.az * v6) / v1_1;
            }

            v0 += ((int)((((double)(v4 + (this.ai[arg10.ax * v3] >> 7)))) * Math.sin((((double)(arg10.ag * 0x47D0240B & 0x1FF))) * 0.012272)));
        }

    label_73:
        int v10 = ((int)((((double)(arg10.ae.al * 0x100))) * Math.pow(2, (((double)v0)) * 0.000326) / (((double)(ht.ax * 0x2C18D40D))) + 0.5));
        if(v10 < 1) {
            v10 = 1;
        }

        return v10;
    }

    void er(int arg10, int arg11) {
        this.ak[arg10] = arg11;
        this.ac[arg10] = ((int)(Math.pow(2, (((double)arg11)) * 0.000549) * 2097152 + 0.5));
    }

    boolean es(kc arg21, int[] arg22, int arg23, int arg24) {
        int v6_1;
        ks v0 = this;
        kc v1 = arg21;
        int[] v2 = arg22;
        int v3 = arg24;
        v1.at = ht.ax * 0x2C18D40D / 100 * 159024707;
        int v5 = 0x46310CB9;
        kc v6 = null;
        int v8 = -1487360653;
        int v9 = 0xF7D5B75F;
        if(v1.au * v5 >= 0 && (v1.ah == null || (v1.ah.ak()))) {
            v1.ax(0x25D6A51);
            arg21.lp();
            if(v1.an * v9 > 0 && v1 == v0.ba[v1.ax * v8][v1.an * v9]) {
                v0.ba[v1.ax * v8][v1.an * v9] = v6;
            }

            return 1;
        }

        int v10 = 0xDE223061;
        int v4 = v1.af * v10;
        double v12 = 0.5;
        double v14 = 2;
        if(v4 > 0) {
            int v11 = v4 - (((int)(Math.pow(v14, (((double)v0.av[v1.ax * v8])) * 0.000492) * 16 + v12)));
            if(v11 < 0) {
                v11 = 0;
            }

            v1.af = v11 * 2000974753;
        }

        v1.ah.ao(v0.bb(v1, 0xA35CF3D0));
        kk v4_1 = v1.ar;
        v1.az += 0xFA46E0FB;
        v1.ag += v4_1.ad * 485322023;
        double v10_1 = (((double)((v1.ap * 0x1D70CF25 - 60 << 8) + (v1.af * v10 * (v1.ab * -1809088953) >> 12)))) * 0.000005;
        double v16 = 128;
        if(v4_1.ae * 0x960583D3 > 0) {
            v8 = 0x34B8FD71;
            v1.ai += v4_1.ap * v8 > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ap * v8))) * v10_1) * v16 + v12))) * 0x3EEEA37 : 0xF7751B80;
        }

        if(v4_1.ax != null) {
            v1.av += v4_1.ar * 0x460E5DDF > 0 ? (((int)(Math.pow(v14, (((double)(v4_1.ar * 0x460E5DDF))) * v10_1) * v16 + v12))) * 244021971 : 1170041216;
            while(true) {
                v8 = 0x610E4719;
                if(v1.aa * v8 < v4_1.ax.length - 2 && v1.av * 0x5FB2ED5B > (v4_1.ax[v1.aa * v8 + 2] & 0xFF) << 8) {
                    v1.aa += 0x8BE04A52;
                    continue;
                }

                break;
            }

            if(v4_1.ax.length - 2 != v1.aa * v8) {
                goto label_191;
            }

            if(v4_1.ax[v1.aa * v8 + 1] != 0) {
                goto label_191;
            }

            v6_1 = 1;
        }
        else {
        label_191:
            v6_1 = 0;
        }

        if(v1.au * v5 >= 0 && v4_1.al != null) {
            int v12_1 = -1487360653;
            if((v0.ay[v1.ax * v12_1] & 1) == 0) {
                v9 = 0xF7D5B75F;
                if(v1.an * v9 >= 0 && v1 == v0.ba[v1.ax * v12_1][v1.an * v9]) {
                    goto label_269;
                }

                v1.au += v4_1.an * 0xF7130A0B > 0 ? (((int)(Math.pow(v14, v10_1 * (((double)(v4_1.an * 0xF7130A0B)))) * v16 + 0.5))) * 0xEBC33989 : 0xE19CC480;
                while(true) {
                    v9 = 0xB13D1313;
                    if(v1.am * v9 < v4_1.al.length - 2 && v1.au * v5 > (v4_1.al[v1.am * v9 + 2] & 0xFF) << 8) {
                        v1.am += 0xE60F5E36;
                        continue;
                    }

                    break;
                }

                if(v4_1.al.length - 2 != v1.am * v9) {
                    goto label_269;
                }

                v6_1 = 1;
            }
        }

    label_269:
        if(v6_1 != 0) {
            v1.ah.aw(v1.at * 0x9F8D766B);
            if(v2 != null) {
                v1.ah.aq(v2, arg23, v3);
            }
            else {
                v1.ah.af(v3);
            }

            if(v1.ah.bv()) {
                v0.bt.ae.ax(v1.ah);
            }

            v1.ax(0xD7EFF433);
            if(v1.au * v5 >= 0) {
                arg21.lp();
                v3 = 0xF7D5B75F;
                if(v1.an * v3 > 0) {
                    v5 = -1487360653;
                    if(v0.ba[v1.ax * v5][v1.an * v3] == v1) {
                        v0.ba[v1.ax * v5][v1.an * v3] = null;
                    }
                }
            }

            return 1;
        }

        v1.ah.ay(v1.at * 0x9F8D766B, v0.bc(v1, 14), v0.bm(v1, 0xE7718327));
        return 0;
    }

    boolean eu(kc arg5) {
        if(arg5.ah == null) {
            if(arg5.au * 0x46310CB9 >= 0) {
                arg5.lp();
                int v1 = 0xF7D5B75F;
                if(arg5.an * v1 > 0) {
                    int v3 = -1487360653;
                    if(this.ba[arg5.ax * v3][arg5.an * v1] == arg5) {
                        this.ba[arg5.ax * v3][arg5.an * v1] = null;
                    }
                }
            }

            return 1;
        }

        return 0;
    }

    void ev() {
        int v0 = this.bp * 0x4583BF39;
        int v2 = 0x6D30F02F;
        int v1 = this.bw * v2;
        long v5;
        for(v5 = this.by * 0x597C362D5EB796CDL; v1 == this.bw * v2; v5 = this.bf.ai(v1)) {
            while(this.bf.an[v0] == v1) {
                this.bf.an(v0);
                int v3 = this.bf.aq(v0);
                if(v3 == 1) {
                    this.bf.aj();
                    this.bf.ap(v0);
                    if(!this.bf.aa()) {
                    }
                    else {
                        if((this.bn) && v1 != 0) {
                            this.bf.au(v5);
                            break;
                        }

                        this.bv(0xBBB403E);
                        this.bf.al();
                        return;
                    }
                }
                else {
                    if((v3 & 0x80) != 0) {
                        this.bg(v3, -15);
                    }

                    this.bf.ad(v0);
                    this.bf.ap(v0);
                    continue;
                }

                break;
            }

            v0 = this.bf.av();
            v1 = this.bf.an[v0];
        }

        this.bp = v0 * 0xC5897F09;
        this.bw = v1 * 0x69A256CF;
        this.by = v5 * -4562680899733928443L;
    }

    void ew() {
        int v0 = this.bp * 0x89208C83;
        int v2 = this.bw * 0x5C5540F0;
        long v5;
        for(v5 = this.by * 0x597C362D5EB796CDL; v2 == this.bw * -153209642; v5 = this.bf.ai(v2)) {
            while(this.bf.an[v0] == v2) {
                this.bf.an(v0);
                int v1 = this.bf.aq(v0);
                if(v1 == 1) {
                    this.bf.aj();
                    this.bf.ap(v0);
                    if(!this.bf.aa()) {
                    }
                    else {
                        if((this.bn) && v2 != 0) {
                            this.bf.au(v5);
                            break;
                        }

                        this.bv(0xBBB403E);
                        this.bf.al();
                        return;
                    }
                }
                else {
                    if((0xA6A2A1AD & v1) != 0) {
                        this.bg(v1, -44);
                    }

                    this.bf.ad(v0);
                    this.bf.ap(v0);
                    continue;
                }

                break;
            }

            v0 = this.bf.av();
            v2 = this.bf.an[v0];
        }

        this.bp = v0 * 0xC5897F09;
        this.bw = v2 * 0x69A256CF;
        this.by = v5 * -4562680899733928443L;
    }

    int ey(kc arg4) {
        int v0 = this.ap[arg4.ax * 0x4803FC15];
        if(v0 < 0x2000) {
            return arg4.ad * 0xFC1486AD * v0 - 974672150 >> 6;
        }

        return 0x4000 - ((0x80 - arg4.ad * 0x19FE8DEE) * (0x4000 - v0) - 1650096874 >> 6);
    }

    void ez(int arg10, int arg11) {
        this.ak[arg10] = arg11;
        this.ac[arg10] = ((int)(Math.pow(2, (((double)arg11)) * 0.000549) * 2097152 + 0.5));
    }
}

