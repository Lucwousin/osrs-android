public class iy implements fk {
    boolean aa;
    int ab;
    public int[] ad;
    int ae;
    int af;
    boolean ag;
    boolean ah;
    int ai;
    public int[] aj;
    static final int al = 4;
    boolean am;
    long an;
    public int[] ap;
    public int[] aq;
    int ar;
    int as;
    boolean at;
    boolean au;
    int av;
    public ik ax;
    static final int ay = 600;
    boolean az;
    boolean ba;
    long[] bb;
    double bc;
    int bd;
    int bg;
    int[] bh;
    int bk;
    int bn;
    boolean[] bo;
    int[] bp;
    long bq;
    mt bs;
    int bt;
    mt bu;
    boolean bv;
    char[] bw;
    int by;
    int[] bz;
    static es[] gi;

    iy() {
        try {
            super();
            this.ax = ik.ax;
            this.ae = 0;
            this.ar = 0;
            this.ap = new int[4];
            this.aj = new int[4];
            this.ad = new int[4];
            this.aq = new int[4];
            this.ab = 0x9F97ACC1;
            this.af = 2007756645;
            this.ai = 2034609813;
            this.av = 0x29915873;
            this.aa = false;
            this.au = true;
            this.am = true;
            this.az = false;
            this.ag = false;
            this.ah = false;
            this.at = false;
            this.ba = false;
            this.bn = 0;
            this.bp = new int[0x80];
            this.bw = new char[0x80];
            this.bo = new boolean[106];
            this.by = 0x91401159;
            this.bt = 0x755546DF;
            this.bg = 0;
            this.bz = new int[500];
            this.bh = new int[500];
            this.bb = new long[500];
            this.bk = 0;
            this.bu = new mt(5);
            this.bs = new mt(5);
            this.ae(100, -1099472016);
            this.ak(1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("iy.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean aa(int arg1, long arg2) {
        return 1;
    }

    public boolean ab(int arg2, int arg3, int arg4, int arg5, long arg6) {
        arg3 = 4;
        if(arg2 >= arg3) {
            return 1;
        }

        try {
            int v6 = 0x53693503;
            if(this.ar * v6 == 0) {
                return 1;
            }

            this.ar -= 0x2952DDAB;
            int v7 = 0;
            if(this.ar * v6 == 0) {
                arg5 = this.ax.am * 0x555CF47F;
                if(arg5 == 1) {
                    this.ao(ik.ae, 109);
                }
                else if(arg5 == arg3) {
                    this.ao(ik.ad, 104);
                }
                else if(arg5 != 14) {
                    switch(arg5) {
                        case 7: {
                            goto label_51;
                        }
                        case 8: {
                            goto label_37;
                        }
                        case 9: {
                            goto label_33;
                        }
                        case 10: {
                            goto label_29;
                        }
                        case 6: 
                        case 11: {
                            goto label_55;
                        }
                        case 12: {
                            goto label_27;
                        }
                    }

                    goto label_70;
                label_33:
                    this.ao(ik.ab, 51);
                    goto label_70;
                label_51:
                    this.ao(ik.ae, 5);
                    goto label_70;
                label_37:
                    this.ao(ik.an, 0x7B);
                    this.ad[0] = this.ai * 0xE9455343;
                    this.aq[0] = this.av * 0xE62AF345;
                    goto label_70;
                label_55:
                    this.ao(ik.au, 120);
                    goto label_70;
                label_27:
                    this.ak(1);
                    goto label_70;
                label_29:
                    this.ao(ik.au, 26);
                }
                else {
                    this.ao(ik.ae, 17);
                }
            }

        label_70:
            if(1 == this.ar * v6 && this.ax == ik.av) {
                arg3 = 1520973041;
                if(arg2 == 0) {
                    v7 = 1;
                }

                this.bk = v7 * arg3;
                this.ao(ik.ai, 8);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iy.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 1;
    }

    void ac(int arg4) {
        arg4 = 0;
        while(arg4 < 4) {
            try {
                int[] v0 = this.ap;
                this.aj[arg4] = -1;
                v0[arg4] = -1;
                v0 = this.ad;
                this.aq[arg4] = -1;
                v0[arg4] = -1;
                ++arg4;
                continue;
            }
            catch(RuntimeException v4) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("iy.ac(");
                v0_1.append(')');
                throw lx.al(((Throwable)v4), v0_1.toString());
            }
        }
    }

    public boolean ad(char arg3, long arg4) {
        try {
            int v5 = -1314224045;
            if(this.bn * v5 < this.bp.length) {
                this.bp[this.bn * v5] = -1;
                this.bw[this.bn * v5] = arg3;
                this.bn += 0x343CFBDB;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("iy.ad(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return 1;
    }

    void ae(int arg2, int arg3) {
        arg2 *= 0x8C8A555;
        try {
            this.as = arg2;
            this.at(0xD2FF6D03);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iy.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean af(int arg16, int arg17, int arg18, long arg19) {
        int v8;
        iy v1 = this;
        int v0 = arg16;
        int v2 = arg17;
        int v3 = arg18;
        if(v0 >= 4) {
            return 1;
        }

        int v4 = 0x2076E2C1;
        try {
            long v6 = ji.ax(v4);
            v4 = v1.aq[v0];
            int v9 = 0x69C26C4B;
            if(1 == v1.ae * v9) {
                v1.bs.ax(((long)(v2 - v1.ad[0])));
                v1.bu.ax(((long)(v3 - v1.aq[0])));
            }

            v1.ad[v0] = v2;
            v1.aq[v0] = v3;
            int v12 = 0x555CF47F;
            if(2 == v1.ar * 0x53693503) {
                if(v1.ax.am * v12 != 6) {
                }
                else {
                    v8 = ((int)((this.bs(0, 1, 0) - v1.bc) / 5));
                    v1.bc += ((double)(v8 * 5));
                    client.nq += -v8 * 2000011673;
                }
            }

            if(v0 == 0) {
                this.am(v2, v3, arg19);
                if(v1.ae * v9 == 1 && v6 >= v1.an * 3190598018950663463L) {
                    v0 = v1.ap[0];
                    v8 = v1.aj[0];
                    int v10 = 1954780371;
                    if(v2 >= v0 - v1.bd * v10 && v2 <= v1.bd * v10 + v0 && v3 >= v8 - v1.bd * v10 && v3 <= v1.bd * v10 + v8) {
                        return 1;
                    }

                    v1.az = true;
                    v0 = v1.ax.am * v12;
                    if(v0 == 1) {
                        goto label_117;
                    }

                    if(v0 == 10) {
                        goto label_112;
                    }

                    switch(v0) {
                        case 7: {
                            goto label_108;
                        }
                        case 8: {
                            goto label_104;
                        }
                    }

                    return 1;
                label_104:
                    this.ao(ik.an, 14);
                    return 1;
                label_108:
                    if(v1.ba) {
                        return 1;
                    }

                    this.bk(v6);
                    return 1;
                label_112:
                    client.no = (v3 - v4) * 0xF609BD39;
                    return 1;
                label_117:
                    this.ao(ik.au, 46);
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("iy.af(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }

        return 1;
    }

    void ag(int arg1, int arg2, byte arg3) {
        arg1 *= 0x6068533F;
        try {
            this.ab = arg1;
            this.af = arg2 * -2007756645;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("iy.ag(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ah(int arg3) {
        try {
            this.ag(this.ad[0], this.aq[0], 103);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.ah(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ai(int arg2, int arg3, long arg4) {
        int v0 = -2034609813 * arg2;
        try {
            this.ai = v0;
            this.av = 0xD66EA78D * arg3;
            this.am(arg2, arg3, arg4);
            int v5 = this.ax.am * 0x555CF47F;
            if(v5 != 2) {
                if(v5 != 8 && v5 != 14) {
                    return 1;
                }

                if(ik.ar == this.ax) {
                    this.ao(ik.an, 84);
                }

                this.ad[0] = arg2;
                this.aq[0] = arg3;
            }
            else {
                this.ad[0] = arg2;
                this.aq[0] = arg3;
                this.ag(arg2, arg3, 19);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iy.ai(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 1;
    }

    public boolean aj(int arg1, long arg2) {
        try {
            this.bo[arg1] = false;
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("iy.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ak(byte arg4) {
        try {
            if(this.ar * 0x53693503 == 0) {
                this.ax = ik.ax;
                this.aw(0x55D2B057);
                this.ae = 0;
                this.ac(0x73F70869);
                int v1 = 0xE9455343;
                if(this.ai * v1 != -1) {
                    this.ad[0] = this.ai * v1;
                    this.aq[0] = this.av * 0xE62AF345;
                }

                this.bk = 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.ak(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    int al(int arg3) {
        try {
            arg3 = ((int)this.bs.al(0x983612EB));
            this.bs.ae(12840);
            if(arg3 <= -5) {
                return arg3;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        if(arg3 < 5) {
            arg3 = 0;
        }

        return arg3;
    }

    void am(int arg10, int arg11, long arg12) {
        try {
            int v1 = 1914185079;
            int v2 = 0xD7F64447;
            if(this.bg * v1 > 0 && arg12 / 50 == this.bb[this.bg * v1 - 1] / 50) {
                this.bg -= v2;
            }
            else if(this.bg * v1 >= 500) {
                return;
            }

            this.bz[this.bg * v1] = arg10;
            this.bh[this.bg * v1] = arg11;
            this.bb[this.bg * v1] = arg12;
            this.bg += v2;
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("iy.am(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    void an(int arg3) {
        arg3 = 0x755546DF;
        try {
            this.bt = arg3;
            this.by = 0x91401159;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ao(ik arg4, byte arg5) {
        try {
            this.ax = arg4;
            int v4_1 = this.ax.am * 0x555CF47F;
            if(v4_1 != 8) {
                switch(v4_1) {
                    case 11: {
                        goto label_36;
                    }
                    case 12: {
                        goto label_9;
                    }
                }

                return;
            label_36:
                client.hs = this.ad[this.bk * 0xC52C3C11] * 0x25EA9C8D;
                client.hg = this.aq[this.bk * 0xC52C3C11] * 110945865;
                return;
            label_9:
                int v0 = 0xE9455343;
                if(-1 != this.ai * v0) {
                    this.ag(this.ai * v0, this.av * 0xE62AF345, 51);
                    this.ad[0] = this.ai * v0;
                    this.aq[0] = this.av * 0xE62AF345;
                }
                else {
                    this.az(0xFFFFFF);
                }

                this.ak(1);
            }
            else {
                if(this.ar * 0x53693503 != 0) {
                    return;
                }

                this.ax = ik.an;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("iy.ao(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean ap(int arg2, long arg3) {
        try {
            int v4 = -1314224045;
            if(this.bn * v4 < this.bp.length) {
                this.bp[this.bn * v4] = arg2;
                this.bw[this.bn * v4] = '\u0000';
                this.bn += 0x343CFBDB;
            }

            this.bo[arg2] = true;
            if(client.lf * 0x12DC6E19 >= 2 && 66 == arg2 && (this.bo[82])) {
                do.bm(16);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iy.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 1;
    }

    public boolean aq(int arg16, int arg17, int arg18, int arg19, long arg20) {
        iy v8 = this;
        int v0 = arg16;
        int v1 = arg17;
        int v2 = arg18;
        int v3 = arg19;
        int v4 = 4;
        if(v0 >= v4) {
            return 1;
        }

        byte v10 = 41;
        try {
            int v6 = 0x69C26C4B;
            if(v0 > v8.ae * v6) {
                return 1;
            }

            if(v0 == 0) {
                v8.an = ji.ax(0x2076E2C1) * -2988759049358404969L;
            }

            if(v8.ae * v6 == v0) {
                v8.ae += 0x4C1EFD63;
                v8.ap[v0] = v2;
                v8.aj[v0] = v3;
            }

            v8.ar += 0x2952DDAB;
            v8.ad[v0] = v2;
            v8.aq[v0] = v3;
            int v5 = 0x555CF47F;
            int v11 = 2;
            if(1 == v8.ae * v6) {
                v8.ba = true;
                v0 = v8.ax.am * v5;
                if(v0 == v11) {
                    if(v1 == v4 && (ci.ch)) {
                        this.ao(ik.ai, 19);
                        return 1;
                    }

                    this.ag(v2, v3, 82);
                    if(v1 == v11) {
                        this.ao(ik.ar, 42);
                    }
                    else {
                        this.ao(ik.al, v10);
                    }

                    boolean v6_1 = v11 == v1 ? true : false;
                    this.au(arg18, arg19, arg20, v6_1, 0xFF00);
                }
                else if(v0 != 14) {
                }
                else if(v8.aa) {
                    this.ao(ik.ae, 5);
                }
            }
            else {
                if(v11 != v8.ae * v6) {
                    return 1;
                }

                v0 = v8.ax.am * v5;
                if(v0 != v11 && v0 != 7 && v0 != 11) {
                    return 1;
                }

                this.ao(ik.av, 52);
                v8.bc = this.bs(0, 1, 0);
                this.bu(0, 1, 0);
                Math.log(((double)client.qi));
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("iy.aq(");
            v1_1.append(((char)v10));
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }

        return 1;
    }

    void ar(int arg3) {
        try {
            this.bg = 0;
            this.an(-2010092370);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void as(short arg9) {
        try {
            if(this.ax != ik.al) {
                return;
            }

            this.az(0xFFFFFF);
            if(this.az) {
                this.bk(0);
            }
            else {
                if(!this.aa) {
                    int v0 = 0x53693503;
                    if(this.ar * v0 == 0) {
                    }
                    else if(this.am) {
                        if(1 != this.ar * v0) {
                        }
                        else if(ji.ax(0x2076E2C1) >= this.an * 3190598018950663463L + 600) {
                            this.ao(ik.ar, 66);
                        }
                        else {
                        }

                        return;
                    }
                    else {
                        return;
                    }
                }

                this.ao(ik.ae, 0x60);
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("iy.as(");
            v0_1.append(')');
            throw lx.al(((Throwable)v9), v0_1.toString());
        }
    }

    void at(int arg3) {
        try {
            this.bd = this.as * 0xBCA6AFB5 / 200 * -120462501;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.at(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void au(int arg1, int arg2, long arg3, boolean arg5, int arg6) {
        arg1 *= 0x6EBFEEA7;
        try {
            this.by = arg1;
            this.bt = arg2 * 0x8AAAB921;
            this.bq = arg3 * 0x79B433B508979FEFL;
            this.bv = arg5;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("iy.au(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean av(int arg1, long arg2) {
        return 1;
    }

    public void aw(int arg3) {
        try {
            this.ag = false;
            this.at = false;
            this.ah = false;
            this.az = false;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ax(byte arg3) {
        int v3_1;
        try {
            v3_1 = ((int)this.bu.al(0x9B6FD360));
            this.bu.ae(9298);
            if(v3_1 <= -5) {
                return v3_1;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        if(v3_1 < 5) {
            return 0;
        }

        return v3_1;
    }

    void ay(int arg3) {
        try {
            this.bn = 0;
            this.ba = false;
            this.an(-2093605504);
            arg3 = this.ax.am * 0x555CF47F;
            if(arg3 == 0 || arg3 == 3) {
                this.ao(ik.au, 8);
            }
            else {
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.ay(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void az(int arg3) {
        arg3 = 2007756645;
        try {
            this.af = arg3;
            this.ab = 0x9F97ACC1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.az(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ba(int arg2, long arg3) {
        if(this.bn * -1314224045 < this.bp.length) {
            this.bp[this.bn * -516707378] = arg2;
            this.bw[this.bn * 0x72B27B47] = '\u0000';
            this.bn += 0x343CFBDB;
        }

        this.bo[arg2] = true;
        if(client.lf * 0xE8CB7A71 >= 2 && -2026040380 == arg2 && (this.bo[0x9C02E1D6])) {
            do.bm(36);
        }

        return 1;
    }

    public boolean bb(int arg1, long arg2) {
        return 1;
    }

    public boolean bc(int arg1, long arg2) {
        return 1;
    }

    public boolean bd(int arg2, long arg3) {
        if(this.bn * 0x5BC093BE < this.bp.length) {
            this.bp[this.bn * -1314224045] = arg2;
            this.bw[this.bn * -1314224045] = '\u0000';
            this.bn += 0x27B42C0C;
        }

        this.bo[arg2] = true;
        if(client.lf * 1934207709 >= 2 && 403434610 == arg2 && (this.bo[82])) {
            do.bm(12);
        }

        return 1;
    }

    int be() {
        int v0 = ((int)this.bu.al(0xD0C1120E));
        this.bu.ae(0x6667);
        if(v0 > -5 && v0 < 5) {
            return 0;
        }

        return v0;
    }

    public boolean bf(int arg1, long arg2) {
        this.bo[arg1] = false;
        return 1;
    }

    public boolean bg(int arg2, int arg3, long arg4) {
        this.ai = -2034609813 * arg2;
        this.av = 0xD66EA78D * arg3;
        this.am(arg2, arg3, arg4);
        int v5 = this.ax.am * 0x555CF47F;
        if(v5 != 2) {
            if(v5 != 8 && v5 != 14) {
                return 1;
            }

            if(ik.ar == this.ax) {
                this.ao(ik.an, 62);
            }

            this.ad[0] = arg2;
            this.aq[0] = arg3;
        }
        else {
            this.ad[0] = arg2;
            this.aq[0] = arg3;
            this.ag(arg2, arg3, 56);
        }

        return 1;
    }

    public boolean bh(int arg1, long arg2) {
        return 1;
    }

    int bi() {
        int v0 = ((int)this.bs.al(1150654397));
        this.bs.ae(0x3B1E);
        if(v0 > -5 && v0 < 5) {
            v0 = 0;
        }

        return v0;
    }

    void bj(int arg3) {
        try {
            this.ar = 0;
            this.ak(1);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iy.bj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void bk(long arg7) {
        try {
            if(this.at) {
                if((this.ah) && arg7 < this.an * 3190598018950663463L + 150) {
                    goto label_14;
                }

                this.ao(ik.aj, 0x1F);
            }
            else {
            label_14:
                if(this.ah) {
                    this.ao(ik.aq, 0x7C);
                    return;
                }

                if(this.ag) {
                    this.ao(ik.ai, 109);
                    return;
                }

                this.ao(ik.au, 75);
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("iy.bk(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    int bl() {
        int v0 = ((int)this.bu.al(148755401));
        this.bu.ae(7292);
        if(v0 > -5 && v0 < 5) {
            return 0;
        }

        return v0;
    }

    public boolean bm(int arg2, int arg3) {
        try {
            return this.bo[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iy.bm(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean bn(char arg2, long arg3) {
        if(this.bn * 0x94D6C37F < this.bp.length) {
            this.bp[this.bn * 1019015731] = -1;
            this.bw[this.bn * 0x5C9F2BFA] = arg2;
            this.bn += 0x343CFBDB;
        }

        return 1;
    }

    public boolean bo(int arg2, int arg3, int arg4, int arg5, long arg6) {
        arg3 = 4;
        if(arg2 >= arg3) {
            return 1;
        }

        int v6 = 0x53693503;
        if(this.ar * v6 == 0) {
            return 1;
        }

        this.ar -= 0x2952DDAB;
        int v7 = 0;
        if(this.ar * v6 == 0) {
            arg5 = this.ax.am * 0x555CF47F;
            if(arg5 == 1) {
                this.ao(ik.ae, 68);
            }
            else if(arg5 == arg3) {
                this.ao(ik.ad, 0x77);
            }
            else if(arg5 != 14) {
                switch(arg5) {
                    case 7: {
                        goto label_51;
                    }
                    case 8: {
                        goto label_37;
                    }
                    case 9: {
                        goto label_33;
                    }
                    case 10: {
                        goto label_29;
                    }
                    case 6: 
                    case 11: {
                        goto label_55;
                    }
                    case 12: {
                        goto label_27;
                    }
                }

                goto label_70;
            label_33:
                this.ao(ik.ab, 103);
                goto label_70;
            label_51:
                this.ao(ik.ae, 56);
                goto label_70;
            label_37:
                this.ao(ik.an, 15);
                this.ad[0] = this.ai * 0xE9455343;
                this.aq[0] = this.av * 0xE62AF345;
                goto label_70;
            label_55:
                this.ao(ik.au, 88);
                goto label_70;
            label_27:
                this.ak(1);
                goto label_70;
            label_29:
                this.ao(ik.au, 12);
            }
            else {
                this.ao(ik.ae, 22);
            }
        }

    label_70:
        if(1 == this.ar * v6 && this.ax == ik.av) {
            arg3 = 1520973041;
            if(arg2 == 0) {
                v7 = 1;
            }

            this.bk = v7 * arg3;
            this.ao(ik.ai, 17);
        }

        return 1;
    }

    public boolean bp(int arg14, int arg15, int arg16, int arg17, long arg18) {
        iy v7 = this;
        int v0 = arg14;
        int v1 = arg15;
        int v2 = arg16;
        int v3 = arg17;
        byte v4 = 4;
        if(v0 >= v4) {
            return 1;
        }

        int v6 = 0x69C26C4B;
        if(v0 > v7.ae * v6) {
            return 1;
        }

        if(v0 == 0) {
            v7.an = ji.ax(0x2076E2C1) * -2988759049358404969L;
        }

        if(v7.ae * v6 == v0) {
            v7.ae += 0x4C1EFD63;
            v7.ap[v0] = v2;
            v7.aj[v0] = v3;
        }

        v7.ar += 0x2952DDAB;
        v7.ad[v0] = v2;
        v7.aq[v0] = v3;
        int v5 = 0x555CF47F;
        int v10 = 2;
        if(1 == v7.ae * v6) {
            v7.ba = true;
            v0 = v7.ax.am * v5;
            if(v0 == v10) {
                if(v1 == v4 && (ci.ch)) {
                    this.ao(ik.ai, 98);
                    return 1;
                }

                this.ag(v2, v3, 82);
                if(v1 == v10) {
                    this.ao(ik.ar, 120);
                }
                else {
                    this.ao(ik.al, v4);
                }

                boolean v5_1 = v10 == v1 ? true : false;
                this.au(arg16, arg17, arg18, v5_1, 0xFF00);
            }
            else if(v0 != 14) {
            }
            else if(v7.aa) {
                this.ao(ik.ae, 0x7E);
            }
        }
        else {
            if(v10 != v7.ae * v6) {
                return 1;
            }

            v0 = v7.ax.am * v5;
            if(v0 != v10 && v0 != 7 && v0 != 11) {
                return 1;
            }

            this.ao(ik.av, 103);
            v7.bc = this.bs(0, 1, 0);
            this.bu(0, 1, 0);
            Math.log(((double)client.qi));
        }

        return 1;
    }

    public boolean bq(int arg11, int arg12, int arg13, long arg14) {
        if(arg11 >= 4) {
            return 1;
        }

        long v1 = ji.ax(0x2076E2C1);
        int v3 = this.aq[arg11];
        if(1 == this.ae * -494935000) {
            this.bs.ax(((long)(arg12 - this.ad[0])));
            this.bu.ax(((long)(arg13 - this.aq[0])));
        }

        this.ad[arg11] = arg12;
        this.aq[arg11] = arg13;
        if(2 == this.ar * -1420123076) {
            if(this.ax.am * 0x555CF47F != 6) {
            }
            else {
                int v5 = ((int)((this.bs(0, 1, 0) - this.bc) / 5));
                this.bc += ((double)(v5 * 5));
                client.nq += -v5 * 2000011673;
            }
        }

        if(arg11 == 0) {
            this.am(arg12, arg13, arg14);
            if(this.ae * 0xC5D4317E == 1 && v1 >= this.an * 3190598018950663463L) {
                arg11 = this.ap[0];
                int v14 = this.aj[0];
                int v4 = 1954780371;
                if(arg12 >= arg11 - this.bd * v4 && arg12 <= this.bd * 0xF6B34F21 + arg11 && arg13 >= v14 - this.bd * v4 && arg13 <= this.bd * v4 + v14) {
                    return 1;
                }

                this.az = true;
                arg12 = this.ax.am * 0xD559A5F6;
                if(arg12 == 1) {
                    goto label_113;
                }

                if(arg12 == 10) {
                    goto label_108;
                }

                switch(arg12) {
                    case 7: {
                        goto label_104;
                    }
                    case 8: {
                        goto label_100;
                    }
                }

                return 1;
            label_100:
                this.ao(ik.an, 0x7F);
                return 1;
            label_104:
                if(this.ba) {
                    return 1;
                }

                this.bk(v1);
                return 1;
            label_108:
                client.no = (arg13 - v3) * 0xF609BD39;
                return 1;
            label_113:
                this.ao(ik.au, 18);
            }
        }

        return 1;
    }

    int br() {
        int v0 = ((int)this.bu.al(-1430004671));
        this.bu.ae(0xF0E);
        if(v0 > -5 && v0 < 5) {
            v0 = 0;
        }

        return v0;
    }

    double bs(int arg3, int arg4, byte arg5) {
        try {
            return Math.hypot(((double)(this.ad[arg3] - this.ad[arg4])), ((double)(this.aq[arg3] - this.aq[arg4])));
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("iy.bs(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean bt(int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg2 = 4;
        if(arg1 >= arg2) {
            return 1;
        }

        int v5 = 0x53693503;
        if(this.ar * v5 == 0) {
            return 1;
        }

        this.ar -= 0x2952DDAB;
        arg4 = this.ar * v5;
        v5 = 0;
        if(arg4 == 0) {
            arg4 = this.ax.am * 0x555CF47F;
            if(arg4 == 1) {
                this.ao(ik.ae, 19);
            }
            else if(arg4 == arg2) {
                this.ao(ik.ad, 0x3F);
            }
            else if(arg4 != 14) {
                switch(arg4) {
                    case 7: {
                        goto label_51;
                    }
                    case 8: {
                        goto label_37;
                    }
                    case 9: {
                        goto label_33;
                    }
                    case 10: {
                        goto label_29;
                    }
                    case 6: 
                    case 11: {
                        goto label_55;
                    }
                    case 12: {
                        goto label_27;
                    }
                }

                goto label_70;
            label_33:
                this.ao(ik.ab, 67);
                goto label_70;
            label_51:
                this.ao(ik.ae, 0x75);
                goto label_70;
            label_37:
                this.ao(ik.an, 7);
                this.ad[0] = this.ai * 0xE9455343;
                this.aq[0] = this.av * 0xE62AF345;
                goto label_70;
            label_55:
                this.ao(ik.au, 0x30);
                goto label_70;
            label_27:
                this.ak(1);
                goto label_70;
            label_29:
                this.ao(ik.au, 84);
            }
            else {
                this.ao(ik.ae, 0x20);
            }
        }

    label_70:
        if(1 == this.ar * 0xD97770BA && this.ax == ik.av) {
            arg2 = 1520973041;
            if(arg1 == 0) {
                v5 = 1;
            }

            this.bk = v5 * arg2;
            this.ao(ik.ai, 24);
        }

        return 1;
    }

    double bu(int arg3, int arg4, byte arg5) {
        try {
            return Math.atan2(((double)(this.ad[arg3] - this.ad[arg4])), ((double)(this.aq[arg3] - this.aq[arg4])));
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("iy.bu(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean bv(int arg17, int arg18, int arg19, long arg20) {
        iy v0 = this;
        int v1 = arg17;
        int v2 = arg18;
        int v3 = arg19;
        if(v1 >= 4) {
            return 1;
        }

        long v5 = ji.ax(0x2076E2C1);
        int v7 = v0.aq[v1];
        if(1 == v0.ae * 0x6199261F) {
            v0.bs.ax(((long)(v2 - v0.ad[0])));
            v0.bu.ax(((long)(v3 - v0.aq[0])));
        }

        v0.ad[v1] = v2;
        v0.aq[v1] = v3;
        int v11 = 0x555CF47F;
        if(2 == v0.ar * 2060203269) {
            if(v0.ax.am * v11 != 6) {
            }
            else {
                int v9 = ((int)((v0.bs(0, 1, 0) - v0.bc) / 5));
                v0.bc += ((double)(v9 * 5));
                client.nq += -v9 * 2003640250;
            }
        }

        if(v1 == 0) {
            v0.am(v2, v3, arg20);
            if(v0.ae * 0x443FCE24 == 1 && v5 >= v0.an * 3190598018950663463L) {
                v1 = v0.ap[0];
                int v8 = v0.aj[0];
                int v10 = 1954780371;
                if(v2 >= v1 - v0.bd * v10 && v2 <= v0.bd * 0x84EBB0C1 + v1 && v3 >= v8 - v0.bd * 0x66EF44C1 && v3 <= v0.bd * v10 + v8) {
                    return 1;
                }

                v0.az = true;
                v1 = v0.ax.am * v11;
                if(v1 == 1) {
                    goto label_118;
                }

                if(v1 == 10) {
                    goto label_113;
                }

                switch(v1) {
                    case 7: {
                        goto label_109;
                    }
                    case 8: {
                        goto label_105;
                    }
                }

                return 1;
            label_105:
                v0.ao(ik.an, 72);
                return 1;
            label_109:
                if(v0.ba) {
                    return 1;
                }

                v0.bk(v5);
                return 1;
            label_113:
                client.no = (v3 - v7) * 0xF609BD39;
                return 1;
            label_118:
                v0.ao(ik.au, 0x7A);
            }
        }

        return 1;
    }

    public boolean bw(int arg14, int arg15, int arg16, int arg17, long arg18) {
        iy v7 = this;
        int v0 = arg14;
        int v1 = arg15;
        int v2 = arg16;
        int v3 = arg17;
        int v4 = 4;
        if(v0 >= v4) {
            return 1;
        }

        int v6 = 0x69C26C4B;
        if(v0 > v7.ae * v6) {
            return 1;
        }

        if(v0 == 0) {
            v7.an = ji.ax(0x2076E2C1) * -2988759049358404969L;
        }

        if(v7.ae * v6 == v0) {
            v7.ae += -97195077;
            v7.ap[v0] = v2;
            v7.aj[v0] = v3;
        }

        v7.ar += -1699945150;
        v7.ad[v0] = v2;
        v7.aq[v0] = v3;
        boolean v5 = false;
        v6 = 2;
        if(1 == v7.ae * 0xB5E54453) {
            v7.ba = true;
            int v9 = v7.ax.am * 0x67E87732;
            if(v9 == v6) {
                if(v1 == v4 && (ci.ch)) {
                    this.ao(ik.ai, 29);
                    return 1;
                }

                this.ag(v2, v3, 0x4F);
                if(v1 == v6) {
                    this.ao(ik.ar, 104);
                }
                else {
                    this.ao(ik.al, 0x70);
                }

                if(v6 == v1) {
                    v5 = true;
                }

                this.au(arg16, arg17, arg18, v5, 0xFF00);
            }
            else if(v9 != 14) {
            }
            else if(v7.aa) {
                this.ao(ik.ae, 120);
            }
        }
        else {
            if(v6 != v7.ae * 0xB366FA24) {
                return 1;
            }

            v0 = v7.ax.am * 0x555CF47F;
            if(v0 != v6 && v0 != 7 && v0 != 11) {
                return 1;
            }

            this.ao(ik.av, 58);
            v7.bc = this.bs(0, 1, 0);
            this.bu(0, 1, 0);
            Math.log(((double)client.qi));
        }

        return 1;
    }

    public boolean bx(int arg2, int arg3, long arg4) {
        this.ai = -2034609813 * arg2;
        this.av = 0xC683481C * arg3;
        this.am(arg2, arg3, arg4);
        int v5 = this.ax.am * 0xFF7E0243;
        if(v5 != 2) {
            if(v5 != 8 && v5 != 14) {
                return 1;
            }

            if(ik.ar == this.ax) {
                this.ao(ik.an, 12);
            }

            this.ad[0] = arg2;
            this.aq[0] = arg3;
        }
        else {
            this.ad[0] = arg2;
            this.aq[0] = arg3;
            this.ag(arg2, arg3, 49);
        }

        return 1;
    }

    public boolean by(int arg2, int arg3, int arg4, int arg5, long arg6) {
        arg3 = 4;
        if(arg2 >= arg3) {
            return 1;
        }

        int v6 = 0x53693503;
        if(this.ar * v6 == 0) {
            return 1;
        }

        this.ar -= 0x2952DDAB;
        int v7 = 0;
        if(this.ar * 0xD9189920 == 0) {
            arg5 = this.ax.am * 716056049;
            if(arg5 == 1) {
                this.ao(ik.ae, 81);
            }
            else if(arg5 == arg3) {
                this.ao(ik.ad, 0x77);
            }
            else if(arg5 != 14) {
                switch(arg5) {
                    case 7: {
                        goto label_52;
                    }
                    case 8: {
                        goto label_38;
                    }
                    case 9: {
                        goto label_34;
                    }
                    case 10: {
                        goto label_30;
                    }
                    case 6: 
                    case 11: {
                        goto label_56;
                    }
                    case 12: {
                        goto label_28;
                    }
                }

                goto label_71;
            label_34:
                this.ao(ik.ab, 8);
                goto label_71;
            label_52:
                this.ao(ik.ae, 103);
                goto label_71;
            label_38:
                this.ao(ik.an, 25);
                this.ad[0] = this.ai * -1304033010;
                this.aq[0] = this.av * 0xE62AF345;
                goto label_71;
            label_56:
                this.ao(ik.au, 88);
                goto label_71;
            label_28:
                this.ak(1);
                goto label_71;
            label_30:
                this.ao(ik.au, 30);
            }
            else {
                this.ao(ik.ae, 76);
            }
        }

    label_71:
        if(1 == this.ar * v6 && this.ax == ik.av) {
            arg3 = 1520973041;
            if(arg2 == 0) {
                v7 = 1;
            }

            this.bk = v7 * arg3;
            this.ao(ik.ai, 0x40);
        }

        return 1;
    }

    public boolean bz(int arg1, long arg2) {
        return 1;
    }

    int ca() {
        int v0 = ((int)this.bs.al(-517450905));
        this.bs.ae(0x4F60);
        if(v0 > -5 && v0 < 5) {
            v0 = 0;
        }

        return v0;
    }

    void cb() {
        this.bt = 0x319E6F83;
        this.by = 0x704B8448;
    }

    void cc(int arg2, int arg3, long arg4, boolean arg6) {
        this.by = arg2 * 0x6EBFEEA7;
        this.bt = arg3 * 0x8AAAB921;
        this.bq = arg4 * 0x79B433B508979FEFL;
        this.bv = arg6;
    }

    void cd() {
        this.bg = 0;
        this.an(0x82A14500);
    }

    void ce() {
        this.af = -1367796906;
        this.ab = 0xC996E4F;
    }

    void cf() {
        this.bg = 0;
        this.an(-2036861990);
    }

    void cg() {
        this.bn = 0;
        this.ba = false;
        this.an(-2089005814);
        int v0 = this.ax.am * 0x555CF47F;
        if(v0 == 0 || v0 == 3) {
            this.ao(ik.au, 0x7F);
        }
        else {
        }
    }

    void ch() {
        this.af = 2007756645;
        this.ab = 0x9F97ACC1;
    }

    void ci(int arg10, int arg11, long arg12) {
        int v1 = 1914185079;
        int v2 = 0xD7F64447;
        if(this.bg * v1 > 0 && arg12 / 50 == this.bb[this.bg * v1 - 1] / 50) {
            this.bg -= v2;
        }
        else if(this.bg * v1 >= 500) {
            return;
        }

        this.bz[this.bg * v1] = arg10;
        this.bh[this.bg * v1] = arg11;
        this.bb[this.bg * v1] = arg12;
        this.bg += v2;
    }

    void cj(int arg2) {
        this.as = arg2 * 0x8C8A555;
        this.at(0xD2FF6D03);
    }

    void ck(int arg2, int arg3) {
        this.ab = arg2 * 0x6068533F;
        this.af = arg3 * -2007756645;
    }

    void cl(int arg2, int arg3) {
        this.ab = arg2 * 0x6068533F;
        this.af = arg3 * -2007756645;
    }

    void cm(int arg2, int arg3) {
        this.ab = arg2 * 0x6068533F;
        this.af = arg3 * -2007756645;
    }

    void cn(int arg2, int arg3) {
        this.ab = arg2 * 0x6068533F;
        this.af = arg3 * -2007756645;
    }

    void co() {
        this.bn = 0;
        this.ba = false;
        this.an(-2048599427);
        int v0 = this.ax.am * 0x555CF47F;
        if(v0 == 0 || v0 == 3) {
            this.ao(ik.au, 0x40);
        }
        else {
        }
    }

    void cp(int arg2, int arg3, long arg4, boolean arg6) {
        this.by = arg2 * 0x6EBFEEA7;
        this.bt = arg3 * 0x8AAAB921;
        this.bq = arg4 * 0x79B433B508979FEFL;
        this.bv = arg6;
    }

    void cq() {
        this.bd = this.as * 0xBCA6AFB5 / 200 * 0xA0691B7A;
    }

    void cr(int arg10, int arg11, long arg12) {
        int v1 = 1914185079;
        int v2 = 0xD7F64447;
        if(this.bg * v1 > 0 && arg12 / 50 == this.bb[this.bg * v1 - 1] / 50) {
            this.bg -= v2;
        }
        else if(this.bg * v1 >= 500) {
            return;
        }

        this.bz[this.bg * v1] = arg10;
        this.bh[this.bg * v1] = arg11;
        this.bb[this.bg * v1] = arg12;
        this.bg += v2;
    }

    void cs() {
        this.af = 0x768CF691;
        this.ab = 0x9F97ACC1;
    }

    void ct() {
        this.ag(this.ad[0], this.aq[0], 0x7C);
    }

    void cu() {
        this.ag(this.ad[0], this.aq[0], 17);
    }

    void cv() {
        this.bn = 0;
        this.ba = false;
        this.an(0x81F76C86);
        int v0 = this.ax.am * 0x555CF47F;
        if(v0 == 0 || v0 == 3) {
            this.ao(ik.au, 16);
        }
        else {
        }
    }

    void cw(int arg2, int arg3, long arg4, boolean arg6) {
        this.by = arg2 * 0x6EBFEEA7;
        this.bt = arg3 * 0x8AAAB921;
        this.bq = arg4 * 0x79B433B508979FEFL;
        this.bv = arg6;
    }

    void cx() {
        this.bt = 0x2A6D5603;
        this.by = 0x7F2CC0B6;
    }

    void cy() {
        this.bt = 0xF808868D;
        this.by = 0x91401159;
    }

    void cz() {
        this.af = 0x5656E05F;
        this.ab = 0x9F97ACC1;
    }

    double da(int arg4, int arg5) {
        return Math.atan2(((double)(this.ad[arg4] - this.ad[arg5])), ((double)(this.aq[arg4] - this.aq[arg5])));
    }

    public void db(ik arg4) {
        this.ax = arg4;
        int v4 = this.ax.am * 0x11AADF92;
        if(v4 != 8) {
            switch(v4) {
                case 11: {
                    goto label_38;
                }
                case 12: {
                    goto label_9;
                }
            }

            return;
        label_38:
            client.hs = this.ad[this.bk * 0xC52C3C11] * 0x25EA9C8D;
            client.hg = this.aq[this.bk * 0xC52C3C11] * 110945865;
            return;
        label_9:
            int v1 = 0xE9455343;
            if(-1 != this.ai * v1) {
                this.ag(this.ai * 0x886C006C, this.av * -1703533847, 0x1F);
                this.ad[0] = this.ai * v1;
                this.aq[0] = this.av * 0xE62AF345;
            }
            else {
                this.az(0xFFFFFF);
            }

            this.ak(1);
        }
        else {
            if(this.ar * 0x53693503 != 0) {
                return;
            }

            this.ax = ik.an;
        }
    }

    void dc() {
        if(this.ar * 0x53693503 == 0) {
            this.ax = ik.ax;
            this.aw(0x55D2B057);
            this.ae = 0;
            this.ac(0x38CC6FF6);
            int v2 = 0xE9455343;
            if(this.ai * v2 != -1) {
                this.ad[0] = this.ai * v2;
                this.aq[0] = this.av * 0xE62AF345;
            }

            this.bk = 0;
        }
    }

    public void de() {
        if(this.ax != ik.al) {
            return;
        }

        this.az(0xFFFFFF);
        if(this.az) {
            this.bk(0);
        }
        else {
            if(!this.aa) {
                if(this.ar * 0x53693503 == 0) {
                }
                else if(this.am) {
                    if(1 != this.ar * 480554380) {
                    }
                    else if(ji.ax(0x2076E2C1) >= this.an * 3190598018950663463L + 600) {
                        this.ao(ik.ar, 56);
                    }
                    else {
                    }

                    return;
                }
                else {
                    return;
                }
            }

            this.ao(ik.ae, 39);
        }
    }

    void df(long arg7) {
        if(this.at) {
            if((this.ah) && arg7 < this.an * 3190598018950663463L + 150) {
                goto label_14;
            }

            this.ao(ik.aj, 13);
        }
        else {
        label_14:
            if(this.ah) {
                this.ao(ik.aq, 0x60);
                return;
            }

            if(this.ag) {
                this.ao(ik.ai, 27);
                return;
            }

            this.ao(ik.au, 0x7C);
        }
    }

    public void dh() {
        this.ag = false;
        this.at = false;
        this.ah = false;
        this.az = false;
    }

    void di() {
        this.ar = 0;
        this.ak(1);
    }

    void dj() {
        int v0;
        for(v0 = 0; v0 < 4; ++v0) {
            int[] v1 = this.ap;
            this.aj[v0] = -1;
            v1[v0] = -1;
            v1 = this.ad;
            this.aq[v0] = -1;
            v1[v0] = -1;
        }
    }

    void dk() {
        if(this.ar * 0x641AF6BB == 0) {
            this.ax = ik.ax;
            this.aw(0x55D2B057);
            this.ae = 0;
            this.ac(-796202201);
            if(this.ai * -505952295 != -1) {
                this.ad[0] = this.ai * -100417660;
                this.aq[0] = this.av * -1222920685;
            }

            this.bk = 0;
        }
    }

    void dl(long arg7) {
        if(this.at) {
            if((this.ah) && arg7 < this.an * 3190598018950663463L + 150) {
                goto label_14;
            }

            this.ao(ik.aj, 8);
        }
        else {
        label_14:
            if(this.ah) {
                this.ao(ik.aq, 108);
                return;
            }

            if(this.ag) {
                this.ao(ik.ai, 84);
                return;
            }

            this.ao(ik.au, 12);
        }
    }

    public void dm() {
        if(this.ax != ik.al) {
            return;
        }

        this.az(0xFFFFFF);
        if(this.az) {
            this.bk(0);
        }
        else {
            if(!this.aa) {
                int v1 = 0x53693503;
                if(this.ar * v1 == 0) {
                }
                else if(this.am) {
                    if(1 != this.ar * v1) {
                    }
                    else if(ji.ax(0x2076E2C1) >= this.an * 3190598018950663463L + 600) {
                        this.ao(ik.ar, 30);
                    }
                    else {
                    }

                    return;
                }
                else {
                    return;
                }
            }

            this.ao(ik.ae, 69);
        }
    }

    public boolean dn(int arg2) {
        return this.bo[arg2];
    }

    double do(int arg4, int arg5) {
        return Math.atan2(((double)(this.ad[arg4] - this.ad[arg5])), ((double)(this.aq[arg4] - this.aq[arg5])));
    }

    public void dp() {
        this.ag = false;
        this.at = false;
        this.ah = false;
        this.az = false;
    }

    double dq(int arg4, int arg5) {
        return Math.hypot(((double)(this.ad[arg4] - this.ad[arg5])), ((double)(this.aq[arg4] - this.aq[arg5])));
    }

    public boolean dr(int arg2) {
        return this.bo[arg2];
    }

    void ds() {
        int v0;
        for(v0 = 0; v0 < 4; ++v0) {
            int[] v1 = this.ap;
            this.aj[v0] = -1;
            v1[v0] = -1;
            v1 = this.ad;
            this.aq[v0] = -1;
            v1[v0] = -1;
        }
    }

    double dt(int arg4, int arg5) {
        return Math.hypot(((double)(this.ad[arg4] - this.ad[arg5])), ((double)(this.aq[arg4] - this.aq[arg5])));
    }

    public void du() {
        if(this.ax != ik.al) {
            return;
        }

        this.az(0xFFFFFF);
        if(this.az) {
            this.bk(0);
        }
        else {
            if(!this.aa) {
                if(this.ar * 0x53693503 == 0) {
                }
                else if(this.am) {
                    if(1 != this.ar * -948207708) {
                    }
                    else if(ji.ax(0x2076E2C1) >= this.an * 3190598018950663463L + 600) {
                        this.ao(ik.ar, 98);
                    }
                    else {
                    }

                    return;
                }
                else {
                    return;
                }
            }

            this.ao(ik.ae, 6);
        }
    }

    void dv() {
        this.bn = 0;
        this.ba = false;
        this.an(-2043942119);
        int v0 = this.ax.am * 0x555CF47F;
        if(v0 == 0 || v0 == 3) {
            this.ao(ik.au, 8);
        }
        else {
        }
    }

    public void dw() {
        this.ag = false;
        this.at = false;
        this.ah = false;
        this.az = false;
    }

    void dx() {
        this.ar = 0;
        this.ak(1);
    }

    void dy() {
        int v0;
        for(v0 = 0; v0 < 4; ++v0) {
            int[] v1 = this.ap;
            this.aj[v0] = -1;
            v1[v0] = -1;
            v1 = this.ad;
            this.aq[v0] = -1;
            v1[v0] = -1;
        }
    }

    double dz(int arg4, int arg5) {
        return Math.atan2(((double)(this.ad[arg4] - this.ad[arg5])), ((double)(this.aq[arg4] - this.aq[arg5])));
    }
}

