public abstract class ko {
    static lb aa = null;
    int[][] ab;
    int[] ad;
    int[] ae;
    pm[] af;
    static int ag = 0;
    Object[] ai;
    int[] aj;
    int al;
    boolean am;
    pm an;
    int[] ap;
    int[][] aq;
    int[] ar;
    public int au;
    Object[][] av;
    static final String ax = ",";
    boolean az;
    public static final int bo = 39;

    static {
        ko.aa = new lb();
        ko.ag = 0;
    }

    ko(boolean arg2, boolean arg3) {
        try {
            super();
            this.am = arg2;
            this.az = arg3;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int[] aa(int arg2, int arg3) {
        if(arg2 >= 0) {
            try {
                if(arg2 >= this.aq.length) {
                }
                else {
                    return this.aq[arg2];
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ko.aa(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }

        return null;
    }

    public static od aa(byte[] arg0, byte[] arg1, byte arg2) {
        int v2 = 0xD6D9F069;
        try {
            dy.aw(arg0, v2);
            return jt.ah(arg1, 0x60);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ko.aa(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public byte[] ab(int arg4, int arg5) {
        try {
            int v0 = 0x78DC0DC9;
            if(1 == this.av.length) {
                return this.ae(0, arg4, v0);
            }

            if(1 == this.av[arg4].length) {
                return this.ae(arg4, 0, v0);
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ko.ab(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean ac(String arg2, int arg3) {
        try {
            return this.aj(this.an.ax(ok.aq(arg2.toLowerCase(), -180259233), 0x77F89C35), 107342105);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ac(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean ad(byte arg5) {
        int v0 = 0;
        boolean v1 = true;
        try {
            while(true) {
            label_4:
                if(v0 >= this.ae.length) {
                    return v1;
                }

                int v2 = this.ae[v0];
                if(this.ai[v2] == null) {
                    this.av(v2, 0x8BB1308F);
                    if(this.ai[v2] != null) {
                        goto label_18;
                    }

                    break;
                }

                goto label_18;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ko.ad(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        v1 = false;
    label_18:
        ++v0;
        goto label_4;
        return v1;
    }

    protected static final void adj(int arg5) {
        long v1;
        try {
            dh.th.al(0x6F51992A);
            int v0;
            for(v0 = 0; true; ++v0) {
                v1 = 0;
                int v3 = 0x20;
                if(v0 >= v3) {
                    break;
                }

                jz.tx[v0] = v1;
            }

            for(v0 = 0; v0 < v3; ++v0) {
                jz.tj[v0] = v1;
            }

            cq.ta = 0;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ko.adj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    public byte[] ae(int arg2, int arg3, int arg4) {
        int[] v4 = null;
        byte v0 = 78;
        try {
            return this.ar(arg2, arg3, v4, v0);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public byte[] af(int arg2, int arg3, int arg4) {
        int[] v4 = null;
        if(arg2 >= 0) {
            try {
                if(arg2 < this.av.length && this.av[arg2] != null && arg3 >= 0) {
                    if(arg3 >= this.av[arg2].length) {
                    }
                    else {
                        if(this.av[arg2][arg3] == null && !this.at(arg2, v4, 0xB0E29DF0)) {
                            this.av(arg2, 0x246403E7);
                            if(!this.at(arg2, v4, 0x9D56C3FC)) {
                                return ((byte[])v4);
                            }
                        }

                        return gy.af(this.av[arg2][arg3], false, 36);
                    }
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ko.af(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }

        return ((byte[])v4);
    }

    public void ag(int arg3, byte arg4) {
        int v4 = 0;
        try {
            while(v4 < this.av[arg3].length) {
                this.av[arg3][v4] = null;
                ++v4;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("ko.ag(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public void ah(int arg5) {
        int v0 = 0;
        try {
            while(true) {
            label_2:
                if(v0 >= this.av.length) {
                    return;
                }

                if(this.av[v0] != null) {
                    int v1 = 0;
                    while(true) {
                        if(v1 < this.av[v0].length) {
                            this.av[v0][v1] = null;
                            ++v1;
                            continue;
                        }

                        goto label_19;
                    }
                }

                break;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ko.ah(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

    label_19:
        ++v0;
        goto label_2;
    }

    public byte[] ai(int arg4, int arg5) {
        try {
            int v0 = 0x73E61855;
            if(this.av.length == 1) {
                return this.af(0, arg4, v0);
            }

            if(1 == this.av[arg4].length) {
                return this.af(arg4, 0, v0);
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ko.ai(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean aj(int arg2, int arg3) {
        try {
            if(this.ai[arg2] != null) {
                return 1;
            }

            this.av(arg2, 0x6645EA18);
            if(this.ai[arg2] == null) {
                return 0;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 1;
    }

    public boolean ak(String arg2, String arg3, int arg4) {
        try {
            arg2 = arg2.toLowerCase();
            arg3 = arg3.toLowerCase();
            int v2_1 = this.an.ax(ok.aq(((CharSequence)arg2), 0x9AB132A9), 0x2ED2B78D);
            return this.an(v2_1, this.af[v2_1].ax(ok.aq(((CharSequence)arg3), -850203023), -392493010), 0xEC830DC4);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ak(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void al(int arg1, int arg2) {
    }

    public int am(byte arg3) {
        try {
            return this.av.length;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ko.am(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean an(int arg2, int arg3, int arg4) {
        if(arg2 >= 0) {
            try {
                if(arg2 < this.av.length && this.av[arg2] != null && arg3 >= 0) {
                    if(arg3 >= this.av[arg2].length) {
                    }
                    else if(this.av[arg2][arg3] != null) {
                        return 1;
                    }
                    else if(this.ai[arg2] != null) {
                        return 1;
                    }
                    else {
                        this.av(arg2, 0xEF71F82A);
                        if(this.ai[arg2] == null) {
                            return 0;
                        }

                        return 1;
                    }
                }

                return 0;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ko.an(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }

            return 1;
        }

        return 0;
    }

    public boolean ao(String arg2, String arg3, byte arg4) {
        try {
            arg2 = arg2.toLowerCase();
            arg3 = arg3.toLowerCase();
            int v2_1 = this.an.ax(ok.aq(((CharSequence)arg2), -120604211), 0xE5F8D735);
            if(v2_1 < 0) {
                return 0;
            }

            if(this.af[v2_1].ax(ok.aq(((CharSequence)arg3), 0x207B29EF), 0x81254B7C) >= 0) {
                return 1;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ao(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 0;
    }

    public boolean ap(int arg3, int arg4) {
        try {
            if(1 == this.av.length) {
                return this.an(0, arg3, 0xA6C22592);
            }

            if(this.av[arg3].length == 1) {
                return this.an(arg3, 0, 0xF6250775);
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ko.ap(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    int aq(int arg2, int arg3) {
        try {
            if(this.ai[arg2] == null) {
                return 0;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.aq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 100;
    }

    public byte[] ar(int arg3, int arg4, int[] arg5, byte arg6) {
        byte[] v5;
        byte[] v6 = null;
        if(arg3 >= 0) {
            try {
                if(arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
                    if(arg4 >= this.av[arg3].length) {
                    }
                    else {
                        if(this.av[arg3][arg4] == null && !this.at(arg3, arg5, -2110890285)) {
                            this.av(arg3, 0x7EBA3047);
                            if(!this.at(arg3, arg5, 0xD4B219F2)) {
                                return v6;
                            }
                        }

                        v5 = gy.af(this.av[arg3][arg4], false, 99);
                        if(this.az) {
                            this.av[arg3][arg4] = v6;
                        }

                        return v5;
                    }
                }

                return v6;
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("ko.ar(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }

            return v5;
        }

        return v6;
    }

    public byte[] as(String arg2, String arg3, int arg4) {
        try {
            arg2 = arg2.toLowerCase();
            arg3 = arg3.toLowerCase();
            int v2_1 = this.an.ax(ok.aq(((CharSequence)arg2), 0x3978C400), 0x546B010C);
            return this.ae(v2_1, this.af[v2_1].ax(ok.aq(((CharSequence)arg3), 447000654), 0x5EC45823), 0x78DC0DC9);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.as(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean at(int arg17, int[] arg18, int arg19) {
        int v13;
        int v12;
        int v11;
        int[] v9_1;
        lq v7_1;
        byte[] v10_2;
        byte[] v9;
        int v7;
        Object[] v6;
        int[] v5;
        int v0_1;
        boolean v4;
        ko v1 = this;
        int v2 = arg17;
        int[] v3 = arg18;
        try {
            v4 = false;
            if(v1.ai[v2] == null) {
                return 0;
            }

            v0_1 = v1.ad[v2];
            v5 = v1.aq[v2];
            v6 = v1.av[v2];
            v7 = 0;
            while(true) {
                if(v7 >= v0_1) {
                    break;
                }
                else if(v6[v5[v7]] == null) {
                    v7 = 0;
                }
                else {
                    ++v7;
                    continue;
                }

                goto label_25;
            }

            v7 = 1;
        label_25:
            if(v7 != 0) {
                return 1;
            }

            v7 = 2;
            if(v3 != null) {
                if(v3[0] == 0 && v3[1] == 0 && v3[v7] == 0 && v3[3] == 0) {
                    goto label_50;
                }

                v9 = gy.af(v1.ai[v2], true, 28);
                lq v10 = new lq(v9);
                v10.bb(v3, 5, v10.ae.length, 0x489C08E9);
            }
            else {
            label_50:
                v9 = gy.af(v1.ai[v2], false, 0x4F);
            }
        }
        catch(RuntimeException v0) {
            goto label_196;
        }

        byte v10_1 = -75;
        try {
            v10_2 = cn.bf(v9, v10_1);
            goto label_56;
        }
        catch(RuntimeException v0) {
            try {
                RuntimeException v6_1 = v0;
                StringBuilder v0_2 = new StringBuilder();
                v0_2.append("");
                if(v3 != null) {
                    v4 = true;
                }

                v0_2.append(v4);
                v0_2.append(",");
                v0_2.append(v2);
                v0_2.append(",");
                v0_2.append(v9.length);
                v0_2.append(",");
                v0_2.append(client.al(v9, v9.length, -20));
                v0_2.append(",");
                v0_2.append(client.al(v9, v9.length - v7, -103));
                v0_2.append(",");
                v0_2.append(v1.ap[v2]);
                v0_2.append(",");
                v0_2.append(v1.au * 0xBEC371FB);
                throw lx.al(((Throwable)v6_1), v0_2.toString());
            label_56:
                if(v1.am) {
                    v1.ai[v2] = null;
                }

                if(v0_1 > 1) {
                    v2 = v10_2.length - 1;
                    int v3_1 = v10_2[v2] & 0xFF;
                    v7_1 = new lq(v10_2);
                    v9_1 = new int[v0_1];
                    v2 = (v2 - v0_1 * v3_1 * 4) * -1880437085;
                    v7_1.ar = v2;
                    v11 = 0;
                    goto label_76;
                }
                else if(!v1.az) {
                    v6[v5[0]] = ha.ab(v10_2, false, 0x7FD02206);
                }
                else {
                    v6[v5[0]] = v10_2;
                    return 1;
                label_76:
                    while(v11 < v3_1) {
                        v12 = 0;
                        v13 = 0;
                        while(v12 < v0_1) {
                            v13 += v7_1.ac(18);
                            v9_1[v12] += v13;
                            ++v12;
                        }

                        ++v11;
                    }

                    byte[][] v11_1 = new byte[v0_1][];
                    for(v12 = 0; v12 < v0_1; ++v12) {
                        v11_1[v12] = new byte[v9_1[v12]];
                        v9_1[v12] = 0;
                    }

                    v7_1.ar = v2;
                    v2 = 0;
                    for(v12 = 0; v2 < v3_1; v12 = v14) {
                        int v14 = v12;
                        v12 = 0;
                        v13 = 0;
                        while(v12 < v0_1) {
                            v13 += v7_1.ac(76);
                            System.arraycopy(v10_2, v14, v11_1[v12], v9_1[v12], v13);
                            v9_1[v12] += v13;
                            v14 += v13;
                            ++v12;
                        }

                        ++v2;
                    }

                    for(v2 = 0; v2 < v0_1; ++v2) {
                        v6[v5[v2]] = !v1.az ? ha.ab(v11_1[v2], false, 0x7FA31835) : v11_1[v2];
                    }
                }

                return 1;
            }
            catch(RuntimeException v0) {
            label_196:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ko.at(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0), v2_1.toString());
            }
        }
    }

    public int au(int arg2, int arg3) {
        try {
            return this.av[arg2].length;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.au(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void av(int arg1, int arg2) {
    }

    public int aw(int arg1, String arg2, int arg3) {
        try {
            return this.af[arg1].ax(ok.aq(arg2.toLowerCase(), 0xAFE15257), 0x4070DC90);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ko.aw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ax(byte[] arg13, int arg14) {
        int[] v10;
        int v9;
        int v8_1;
        int[] v8;
        int v7;
        int v6;
        int v5;
        try {
            this.au = client.al(arg13, arg13.length, -33) * 0xB9D9F133;
            lq v14 = new lq(cn.bf(arg13, -34));
            int v13_1 = v14.ay(-54);
            if(v13_1 >= 5) {
                int v0 = 7;
                if(v13_1 <= v0) {
                    if(v13_1 >= 6) {
                        v14.ac(0x74);
                    }

                    int v1 = v14.ay(-18);
                    int v2 = 0x6AABCD69;
                    this.al = v13_1 >= v0 ? v14.bv(-1902935318) * v2 : v14.ao(0x9B674F5) * v2;
                    int v3 = 1666290393;
                    this.ae = new int[this.al * v3];
                    if(v13_1 >= v0) {
                        v5 = 0;
                        v6 = -1;
                        v7 = 0;
                        while(v5 < this.al * v3) {
                            v8 = this.ae;
                            v7 += v14.bv(0x8F4E7EC4);
                            v8[v5] = v7;
                            if(this.ae[v5] > v6) {
                                v6 = this.ae[v5];
                            }

                            ++v5;
                        }
                    }
                    else {
                        v5 = 0;
                        v6 = -1;
                        v7 = 0;
                        while(v5 < this.al * v3) {
                            v8 = this.ae;
                            v7 += v14.ao(0x382A17B3);
                            v8[v5] = v7;
                            if(this.ae[v5] > v6) {
                                v6 = this.ae[v5];
                            }

                            ++v5;
                        }
                    }

                    ++v6;
                    this.ap = new int[v6];
                    this.aj = new int[v6];
                    this.ad = new int[v6];
                    this.aq = new int[v6][];
                    this.ai = new Object[v6];
                    this.av = new Object[v6][];
                    if(v1 != 0) {
                        this.ar = new int[v6];
                        for(v5 = 0; v5 < this.al * v3; ++v5) {
                            this.ar[this.ae[v5]] = v14.ac(38);
                        }

                        this.an = new pm(this.ar);
                    }

                    for(v5 = 0; v5 < this.al * v3; ++v5) {
                        this.ap[this.ae[v5]] = v14.ac(0x73);
                    }

                    for(v5 = 0; v5 < this.al * v3; ++v5) {
                        this.aj[this.ae[v5]] = v14.ac(20);
                    }

                    for(v5 = 0; v5 < this.al * v3; ++v5) {
                        this.ad[this.ae[v5]] = v14.ao(0xFF34263C);
                    }

                    if(v13_1 >= v0) {
                        v13_1 = 0;
                        goto label_147;
                    }
                    else {
                        v13_1 = 0;
                        while(true) {
                            if(v13_1 < this.al * v3) {
                                v0 = this.ae[v13_1];
                                v5 = this.ad[v0];
                                this.aq[v0] = new int[v5];
                                v7 = 0;
                                v8_1 = -1;
                                v9 = 0;
                                while(v7 < v5) {
                                    v10 = this.aq[v0];
                                    v9 += v14.ao(0x9B32D987);
                                    v10[v7] = v9;
                                    if(v9 > v8_1) {
                                        v8_1 = v9;
                                    }

                                    ++v7;
                                }

                                this.av[v0] = new Object[v8_1 + 1];
                                ++v13_1;
                                continue;
                            }

                            goto label_208;
                        }

                    label_147:
                        while(v13_1 < this.al * v3) {
                            v0 = this.ae[v13_1];
                            v5 = this.ad[v0];
                            this.aq[v0] = new int[v5];
                            v7 = 0;
                            v8_1 = -1;
                            v9 = 0;
                            while(v7 < v5) {
                                v10 = this.aq[v0];
                                v9 += v14.bv(0x8A75AFDC);
                                v10[v7] = v9;
                                if(v9 > v8_1) {
                                    v8_1 = v9;
                                }

                                ++v7;
                            }

                            this.av[v0] = new Object[v8_1 + 1];
                            ++v13_1;
                        }
                    }

                label_208:
                    if(v1 != 0) {
                        this.ab = new int[v6][];
                        this.af = new pm[v6];
                        for(v13_1 = 0; v13_1 < this.al * v3; ++v13_1) {
                            v0 = this.ae[v13_1];
                            v1 = this.ad[v0];
                            this.ab[v0] = new int[this.av[v0].length];
                            for(v2 = 0; v2 < v1; ++v2) {
                                this.ab[v0][this.aq[v0][v2]] = v14.ac(30);
                            }

                            this.af[v0] = new pm(this.ab[v0]);
                        }
                    }

                    return;
                }
            }

            throw new RuntimeException("");
        }
        catch(RuntimeException v13) {
            StringBuilder v14_1 = new StringBuilder();
            v14_1.append("ko.ax(");
            v14_1.append(')');
            throw lx.al(((Throwable)v13), v14_1.toString());
        }
    }

    public int ay(String arg2, int arg3) {
        try {
            return this.an.ax(ok.aq(arg2.toLowerCase(), 0x7FE87D40), -672744045);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ay(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void az(byte arg3) {
        int v3 = 0;
        try {
            while(v3 < this.ai.length) {
                this.ai[v3] = null;
                ++v3;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ko.az(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public int ba(String arg2, int arg3) {
        try {
            return this.aq(this.an.ax(ok.aq(arg2.toLowerCase(), 0xB94690CE), 0xA5147C13), 0xDF4EF07);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.ba(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean bb(int arg4) {
        if(1 == this.av.length) {
            return this.an(0, arg4, -599004956);
        }

        if(this.av[arg4].length == 1) {
            return this.an(arg4, 0, -1575864230);
        }

        throw new RuntimeException();
    }

    public boolean bc(int arg4) {
        if(1 == this.av.length) {
            return this.an(0, arg4, -634042146);
        }

        if(this.av[arg4].length == 1) {
            return this.an(arg4, 0, 0x23EF6C65);
        }

        throw new RuntimeException();
    }

    public void bd(String arg2, byte arg3) {
        try {
            int v2_1 = this.an.ax(ok.aq(arg2.toLowerCase(), 0xDFBFF11C), 0x4C94A9A9);
            if(v2_1 < 0) {
                return;
            }

            this.al(v2_1, 0x96F6D916);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ko.bd(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    int be(int arg2) {
        if(this.ai[arg2] != null) {
            return 100;
        }

        return 0;
    }

    public boolean bg(int arg3, int arg4) {
        if(arg3 >= 0 && arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
            if(arg4 >= this.av[arg3].length) {
            }
            else if(this.av[arg3][arg4] != null) {
                return 1;
            }
            else if(this.ai[arg3] != null) {
                return 1;
            }
            else {
                this.av(arg3, 0xB9E1563B);
                if(this.ai[arg3] != null) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }

        return 0;
    }

    public boolean bh(int arg3, int arg4) {
        if(arg3 >= 0 && arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
            if(arg4 >= this.av[arg3].length) {
            }
            else if(this.av[arg3][arg4] != null) {
                return 1;
            }
            else if(this.ai[arg3] != null) {
                return 1;
            }
            else {
                this.av(arg3, -2088163628);
                if(this.ai[arg3] != null) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }

        return 0;
    }

    public byte[] bi(int arg5) {
        int v1 = 0x78DC0DC9;
        if(1 == this.av.length) {
            return this.ae(0, arg5, v1);
        }

        if(1 == this.av[arg5].length) {
            return this.ae(arg5, 0, v1);
        }

        throw new RuntimeException();
    }

    public boolean bj() {
        int v1 = 0;
        boolean v2 = true;
        while(v1 < this.ae.length) {
            int v3 = this.ae[v1];
            if(this.ai[v3] == null) {
                this.av(v3, 0x8AE46F14);
                if(this.ai[v3] == null) {
                    v2 = false;
                }
            }

            ++v1;
        }

        return v2;
    }

    public boolean bk(int arg4) {
        if(1 == this.av.length) {
            return this.an(0, arg4, -1454058208);
        }

        if(this.av[arg4].length == 1) {
            return this.an(arg4, 0, 0xC5804AD7);
        }

        throw new RuntimeException();
    }

    int bl(int arg2) {
        if(this.ai[arg2] != null) {
            return 0xFA4D76A8;
        }

        return 0;
    }

    public boolean bm(int arg3) {
        if(this.ai[arg3] != null) {
            return 1;
        }

        this.av(arg3, 0x29542C79);
        if(this.ai[arg3] != null) {
            return 1;
        }

        return 0;
    }

    void bn(byte[] arg14) {
        int v9_1;
        int[] v9;
        int v8;
        int v7;
        int v6;
        this.au = client.al(arg14, arg14.length, 54) * 1773902219;
        lq v0 = new lq(cn.bf(arg14, 9));
        int v14 = v0.ay(-74);
        if(v14 >= 5) {
            int v1 = 7;
            if(v14 <= v1) {
                if(v14 >= 6) {
                    v0.ac(73);
                }

                int v2 = v0.ay(-48);
                int v3 = 0x6AABCD69;
                this.al = v14 >= v1 ? v0.bv(0x98FED019) * v3 : v0.ao(0xE0A7878) * v3;
                int v4 = 1666290393;
                this.ae = new int[this.al * v4];
                if(v14 >= v1) {
                    v6 = 0;
                    v7 = -1;
                    v8 = 0;
                    while(v6 < this.al * v4) {
                        v9 = this.ae;
                        v8 += v0.bv(0x96CCA071);
                        v9[v6] = v8;
                        if(this.ae[v6] > v7) {
                            v7 = this.ae[v6];
                        }

                        ++v6;
                    }
                }
                else {
                    v6 = 0;
                    v7 = 0;
                    v8 = -1;
                    while(v6 < this.al * v4) {
                        v9 = this.ae;
                        v7 += v0.ao(0x49FEE16D);
                        v9[v6] = v7;
                        if(this.ae[v6] > v8) {
                            v8 = this.ae[v6];
                        }

                        ++v6;
                    }

                    v7 = v8;
                }

                ++v7;
                this.ap = new int[v7];
                this.aj = new int[v7];
                this.ad = new int[v7];
                this.aq = new int[v7][];
                this.ai = new Object[v7];
                this.av = new Object[v7][];
                if(v2 != 0) {
                    this.ar = new int[v7];
                    for(v6 = 0; v6 < this.al * v4; ++v6) {
                        this.ar[this.ae[v6]] = v0.ac(67);
                    }

                    this.an = new pm(this.ar);
                }

                for(v6 = 0; v6 < this.al * 0x9F0DACF5; ++v6) {
                    this.ap[this.ae[v6]] = v0.ac(107);
                }

                for(v6 = 0; v6 < this.al * v4; ++v6) {
                    this.aj[this.ae[v6]] = v0.ac(87);
                }

                for(v6 = 0; v6 < this.al * 0x4DC3463F; ++v6) {
                    this.ad[this.ae[v6]] = v0.ao(1153350716);
                }

                if(v14 >= v1) {
                    v14 = 0;
                    goto label_150;
                }
                else {
                    v14 = 0;
                    while(true) {
                        if(v14 < this.al * 0x46F23390) {
                            v1 = this.ae[v14];
                            v4 = this.ad[v1];
                            this.aq[v1] = new int[v4];
                            v6 = 0;
                            v8 = -1;
                            v9_1 = 0;
                            while(v6 < v4) {
                                int[] v10 = this.aq[v1];
                                v9_1 += v0.ao(2068425356);
                                v10[v6] = v9_1;
                                if(v9_1 > v8) {
                                    v8 = v9_1;
                                }

                                ++v6;
                            }

                            this.av[v1] = new Object[v8 + 1];
                            ++v14;
                            continue;
                        }

                        goto label_212;
                    }

                label_150:
                    while(v14 < this.al * v4) {
                        v1 = this.ae[v14];
                        v6 = this.ad[v1];
                        this.aq[v1] = new int[v6];
                        v8 = 0;
                        v9_1 = -1;
                        int v10_1 = 0;
                        while(v8 < v6) {
                            int[] v11 = this.aq[v1];
                            v10_1 += v0.bv(-2103943533);
                            v11[v8] = v10_1;
                            if(v10_1 > v9_1) {
                                v9_1 = v10_1;
                            }

                            ++v8;
                        }

                        this.av[v1] = new Object[v9_1 + 1];
                        ++v14;
                    }
                }

            label_212:
                if(v2 != 0) {
                    this.ab = new int[v7][];
                    this.af = new pm[v7];
                    for(v14 = 0; v14 < this.al * 1023117770; ++v14) {
                        v1 = this.ae[v14];
                        v2 = this.ad[v1];
                        this.ab[v1] = new int[this.av[v1].length];
                        for(v3 = 0; v3 < v2; ++v3) {
                            this.ab[v1][this.aq[v1][v3]] = v0.ac(21);
                        }

                        this.af[v1] = new pm(this.ab[v1]);
                    }
                }

                return;
            }
        }

        throw new RuntimeException("");
    }

    void bo(int arg1) {
    }

    void bp(byte[] arg14) {
        int[] v11;
        int v10;
        int v9;
        int[] v8;
        int v7;
        int v6;
        int v5;
        this.au = client.al(arg14, arg14.length, -113) * 0xB9D9F133;
        lq v0 = new lq(cn.bf(arg14, -4));
        int v14 = v0.ay(-103);
        if(v14 >= 5) {
            int v1 = 7;
            if(v14 <= v1) {
                if(v14 >= 6) {
                    v0.ac(0x7B);
                }

                int v2 = v0.ay(-56);
                this.al = v14 >= v1 ? v0.bv(0x99F6CB5B) * -1657890972 : v0.ao(2087022924) * 0x6AABCD69;
                this.ae = new int[this.al * 0x66408290];
                if(v14 >= v1) {
                    v5 = 0;
                    v6 = 0;
                    v7 = -1;
                    while(v5 < this.al * 0x5A8F52FC) {
                        v8 = this.ae;
                        v6 += v0.bv(0x8E140218);
                        v8[v5] = v6;
                        if(this.ae[v5] > v7) {
                            v7 = this.ae[v5];
                        }

                        ++v5;
                    }
                }
                else {
                    v5 = 0;
                    v6 = 0;
                    v7 = -1;
                    while(v5 < this.al * 1766704819) {
                        v8 = this.ae;
                        v6 += v0.ao(-1390760878);
                        v8[v5] = v6;
                        if(this.ae[v5] > v7) {
                            v7 = this.ae[v5];
                        }

                        ++v5;
                    }
                }

                ++v7;
                this.ap = new int[v7];
                this.aj = new int[v7];
                this.ad = new int[v7];
                this.aq = new int[v7][];
                this.ai = new Object[v7];
                this.av = new Object[v7][];
                if(v2 != 0) {
                    this.ar = new int[v7];
                    for(v5 = 0; v5 < this.al * -2103854537; ++v5) {
                        this.ar[this.ae[v5]] = v0.ac(23);
                    }

                    this.an = new pm(this.ar);
                }

                for(v5 = 0; v5 < this.al * -2053863373; ++v5) {
                    this.ap[this.ae[v5]] = v0.ac(19);
                }

                for(v5 = 0; v5 < this.al * 0x753FDF0C; ++v5) {
                    this.aj[this.ae[v5]] = v0.ac(20);
                }

                for(v5 = 0; true; ++v5) {
                    int v8_1 = 1666290393;
                    if(v5 >= this.al * v8_1) {
                        break;
                    }

                    this.ad[this.ae[v5]] = v0.ao(0x239960EC);
                }

                if(v14 >= v1) {
                    v14 = 0;
                    goto label_154;
                }
                else {
                    v14 = 0;
                    while(true) {
                        if(v14 < this.al * v8_1) {
                            v1 = this.ae[v14];
                            v5 = this.ad[v1];
                            this.aq[v1] = new int[v5];
                            v6 = 0;
                            v9 = 0;
                            v10 = -1;
                            while(v6 < v5) {
                                v11 = this.aq[v1];
                                v9 += v0.ao(0x44AC15C8);
                                v11[v6] = v9;
                                if(v9 > v10) {
                                    v10 = v9;
                                }

                                ++v6;
                            }

                            this.av[v1] = new Object[v10 + 1];
                            ++v14;
                            continue;
                        }

                        goto label_215;
                    }

                label_154:
                    while(v14 < this.al * v8_1) {
                        v1 = this.ae[v14];
                        v5 = this.ad[v1];
                        this.aq[v1] = new int[v5];
                        v6 = 0;
                        v9 = -1;
                        v10 = 0;
                        while(v6 < v5) {
                            v11 = this.aq[v1];
                            v10 += v0.bv(-1690089051);
                            v11[v6] = v10;
                            if(v10 > v9) {
                                v9 = v10;
                            }

                            ++v6;
                        }

                        this.av[v1] = new Object[v9 + 1];
                        ++v14;
                    }
                }

            label_215:
                if(v2 != 0) {
                    this.ab = new int[v7][];
                    this.af = new pm[v7];
                    for(v14 = 0; v14 < this.al * v8_1; ++v14) {
                        v1 = this.ae[v14];
                        v2 = this.ad[v1];
                        this.ab[v1] = new int[this.av[v1].length];
                        int v3;
                        for(v3 = 0; v3 < v2; ++v3) {
                            this.ab[v1][this.aq[v1][v3]] = v0.ac(0x70);
                        }

                        this.af[v1] = new pm(this.ab[v1]);
                    }
                }

                return;
            }
        }

        throw new RuntimeException("");
    }

    public byte[] bq(int arg4, int arg5, int[] arg6) {
        byte[] v0 = null;
        if(arg4 >= 0 && arg4 < this.av.length && this.av[arg4] != null && arg5 >= 0) {
            if(arg5 >= this.av[arg4].length) {
            }
            else {
                if(this.av[arg4][arg5] == null && !this.at(arg4, arg6, -2009965308)) {
                    this.av(arg4, 0x79F9A880);
                    if(!this.at(arg4, arg6, -1043509286)) {
                        return v0;
                    }
                }

                byte[] v6 = gy.af(this.av[arg4][arg5], false, 18);
                if(this.az) {
                    this.av[arg4][arg5] = v0;
                }

                return v6;
            }
        }

        return v0;
    }

    public byte[] br(int arg5) {
        int v1 = 0x78DC0DC9;
        if(1 == this.av.length) {
            return this.ae(0, arg5, v1);
        }

        if(1 == this.av[arg5].length) {
            return this.ae(arg5, 0, v1);
        }

        throw new RuntimeException();
    }

    int bs(int arg2) {
        if(this.ai[arg2] != null) {
            return 100;
        }

        return 0;
    }

    public byte[] bt(int arg3, int arg4) {
        return this.ar(arg3, arg4, null, 81);
    }

    int bu(int arg2) {
        if(this.ai[arg2] != null) {
            return 0xF208B031;
        }

        return 0;
    }

    public byte[] bv(int arg3, int arg4) {
        return this.ar(arg3, arg4, null, 62);
    }

    void bw(byte[] arg14) {
        int[] v11;
        int v10;
        int v9_1;
        int[] v9;
        int v8;
        int v7;
        int v6;
        this.au = client.al(arg14, arg14.length, -9) * 0xB9D9F133;
        lq v0 = new lq(cn.bf(arg14, -1));
        int v14 = v0.ay(-51);
        if(v14 >= 5) {
            int v2 = 7;
            if(v14 <= v2) {
                if(v14 >= 6) {
                    v0.ac(89);
                }

                int v3 = v0.ay(-78);
                int v4 = 0x6AABCD69;
                this.al = v14 >= v2 ? v0.bv(-2094587015) * v4 : v0.ao(0x5DFEED7C) * v4;
                int v5 = 1666290393;
                this.ae = new int[this.al * v5];
                if(v14 >= v2) {
                    v6 = 0;
                    v7 = -1;
                    v8 = 0;
                    while(v6 < this.al * v5) {
                        v9 = this.ae;
                        v8 += v0.bv(-2011075793);
                        v9[v6] = v8;
                        if(this.ae[v6] > v7) {
                            v7 = this.ae[v6];
                        }

                        ++v6;
                    }
                }
                else {
                    v6 = 0;
                    v7 = -1;
                    v8 = 0;
                    while(v6 < this.al * v5) {
                        v9 = this.ae;
                        v8 += v0.ao(74144740);
                        v9[v6] = v8;
                        if(this.ae[v6] > v7) {
                            v7 = this.ae[v6];
                        }

                        ++v6;
                    }
                }

                ++v7;
                this.ap = new int[v7];
                this.aj = new int[v7];
                this.ad = new int[v7];
                this.aq = new int[v7][];
                this.ai = new Object[v7];
                this.av = new Object[v7][];
                if(v3 != 0) {
                    this.ar = new int[v7];
                    for(v6 = 0; v6 < this.al * v5; ++v6) {
                        this.ar[this.ae[v6]] = v0.ac(0x4F);
                    }

                    this.an = new pm(this.ar);
                }

                for(v6 = 0; v6 < this.al * v5; ++v6) {
                    this.ap[this.ae[v6]] = v0.ac(17);
                }

                for(v6 = 0; v6 < this.al * v5; ++v6) {
                    this.aj[this.ae[v6]] = v0.ac(85);
                }

                for(v6 = 0; v6 < this.al * v5; ++v6) {
                    this.ad[this.ae[v6]] = v0.ao(0x70B07019);
                }

                if(v14 >= v2) {
                    v14 = 0;
                    goto label_146;
                }
                else {
                    v14 = 0;
                    while(true) {
                        if(v14 < this.al * v5) {
                            v2 = this.ae[v14];
                            v6 = this.ad[v2];
                            this.aq[v2] = new int[v6];
                            v8 = 0;
                            v9_1 = -1;
                            v10 = 0;
                            while(v8 < v6) {
                                v11 = this.aq[v2];
                                v10 += v0.ao(-234980230);
                                v11[v8] = v10;
                                if(v10 > v9_1) {
                                    v9_1 = v10;
                                }

                                ++v8;
                            }

                            this.av[v2] = new Object[v9_1 + 1];
                            ++v14;
                            continue;
                        }

                        goto label_207;
                    }

                label_146:
                    while(v14 < this.al * v5) {
                        v2 = this.ae[v14];
                        v6 = this.ad[v2];
                        this.aq[v2] = new int[v6];
                        v8 = 0;
                        v9_1 = 0;
                        v10 = -1;
                        while(v8 < v6) {
                            v11 = this.aq[v2];
                            v9_1 += v0.bv(-1991463805);
                            v11[v8] = v9_1;
                            if(v9_1 > v10) {
                                v10 = v9_1;
                            }

                            ++v8;
                        }

                        this.av[v2] = new Object[v10 + 1];
                        ++v14;
                    }
                }

            label_207:
                if(v3 != 0) {
                    this.ab = new int[v7][];
                    this.af = new pm[v7];
                    for(v14 = 0; v14 < this.al * v5; ++v14) {
                        int v1 = this.ae[v14];
                        v2 = this.ad[v1];
                        this.ab[v1] = new int[this.av[v1].length];
                        for(v3 = 0; v3 < v2; ++v3) {
                            this.ab[v1][this.aq[v1][v3]] = v0.ac(0x7C);
                        }

                        this.af[v1] = new pm(this.ab[v1]);
                    }
                }

                return;
            }
        }

        throw new RuntimeException("");
    }

    public byte[] bx(int arg4, int arg5, int[] arg6) {
        byte[] v0 = null;
        if(arg4 >= 0 && arg4 < this.av.length && this.av[arg4] != null && arg5 >= 0) {
            if(arg5 >= this.av[arg4].length) {
            }
            else {
                if(this.av[arg4][arg5] == null && !this.at(arg4, arg6, 0x968FFB6C)) {
                    this.av(arg4, -709126750);
                    if(!this.at(arg4, arg6, -924613702)) {
                        return v0;
                    }
                }

                byte[] v6 = gy.af(this.av[arg4][arg5], false, 0x73);
                if(this.az) {
                    this.av[arg4][arg5] = v0;
                }

                return v6;
            }
        }

        return v0;
    }

    void by(int arg1) {
    }

    public boolean bz(int arg3, int arg4) {
        if(arg3 >= 0 && arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
            if(arg4 >= this.av[arg3].length) {
            }
            else if(this.av[arg3][arg4] != null) {
                return 1;
            }
            else if(this.ai[arg3] != null) {
                return 1;
            }
            else {
                this.av(arg3, -625284730);
                if(this.ai[arg3] != null) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }

        return 0;
    }

    public byte[] ca(int arg5) {
        int v1 = 0x78DC0DC9;
        if(1 == this.av.length) {
            return this.ae(0, arg5, v1);
        }

        if(1 == this.av[arg5].length) {
            return this.ae(arg5, 0, v1);
        }

        throw new RuntimeException();
    }

    void cb(int arg1) {
    }

    public int[] cc(int arg2) {
        if(arg2 >= 0) {
            if(arg2 >= this.aq.length) {
            }
            else {
                return this.aq[arg2];
            }
        }

        return null;
    }

    public byte[] cd(int arg3, int arg4) {
        int[] v0 = null;
        if(arg3 >= 0 && arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
            if(arg4 >= this.av[arg3].length) {
            }
            else {
                if(this.av[arg3][arg4] == null && !this.at(arg3, v0, -863087228)) {
                    this.av(arg3, 236230969);
                    if(!this.at(arg3, v0, 0x604192B8)) {
                        return ((byte[])v0);
                    }
                }

                return gy.af(this.av[arg3][arg4], false, 42);
            }
        }

        return ((byte[])v0);
    }

    public int ce(int arg2) {
        return this.av[arg2].length;
    }

    public byte[] cf(int arg5) {
        int v1 = 0x73E61855;
        if(this.av.length == 1) {
            return this.af(0, arg5, v1);
        }

        if(1 == this.av[arg5].length) {
            return this.af(arg5, 0, v1);
        }

        throw new RuntimeException();
    }

    public int cg(int arg2, String arg3) {
        return this.af[arg2].ax(ok.aq(arg3.toLowerCase(), 0x77EDF105), 0xF2AA4BF3);
    }

    public int ch(int arg2) {
        return this.av[arg2].length;
    }

    public int ci(int arg2) {
        return this.av[arg2].length;
    }

    public byte[] cj(int arg3, int arg4) {
        int[] v0 = null;
        if(arg3 >= 0 && arg3 < this.av.length && this.av[arg3] != null && arg4 >= 0) {
            if(arg4 >= this.av[arg3].length) {
            }
            else {
                if(this.av[arg3][arg4] == null && !this.at(arg3, v0, 0x9BED9253)) {
                    this.av(arg3, 1035129682);
                    if(!this.at(arg3, v0, 0xD9950960)) {
                        return ((byte[])v0);
                    }
                }

                return gy.af(this.av[arg3][arg4], false, 0x71);
            }
        }

        return ((byte[])v0);
    }

    public void ck() {
        int v1;
        for(v1 = 0; v1 < this.av.length; ++v1) {
            if(this.av[v1] != null) {
                int v2;
                for(v2 = 0; v2 < this.av[v1].length; ++v2) {
                    this.av[v1][v2] = null;
                }
            }
        }
    }

    public void cl(int arg4) {
        int v0;
        for(v0 = 0; v0 < this.av[arg4].length; ++v0) {
            this.av[arg4][v0] = null;
        }
    }

    public void cm() {
        int v1;
        for(v1 = 0; v1 < this.av.length; ++v1) {
            if(this.av[v1] != null) {
                int v2;
                for(v2 = 0; v2 < this.av[v1].length; ++v2) {
                    this.av[v1][v2] = null;
                }
            }
        }
    }

    public void cn() {
        int v0;
        for(v0 = 0; v0 < this.ai.length; ++v0) {
            this.ai[v0] = null;
        }
    }

    public boolean co(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 730502668), 0x22CACD49);
        if(v3 < 0) {
            return 0;
        }

        if(this.af[v3].ax(ok.aq(((CharSequence)arg4), 0xCD70C4CB), 0x1ECDA046) < 0) {
            return 0;
        }

        return 1;
    }

    public int[] cp(int arg2) {
        if(arg2 >= 0) {
            if(arg2 >= this.aq.length) {
            }
            else {
                return this.aq[arg2];
            }
        }

        return null;
    }

    boolean cq(int arg17, int[] arg18) {
        int v13;
        int v12;
        int v11;
        int[] v9_1;
        lq v7_1;
        byte[] v10_2;
        byte[] v9;
        ko v1 = this;
        int v2 = arg17;
        int[] v3 = arg18;
        boolean v4 = false;
        if(v1.ai[v2] == null) {
            return 0;
        }

        int v0 = v1.ad[v2];
        int[] v5 = v1.aq[v2];
        Object[] v6 = v1.av[v2];
        int v7 = 0;
        while(true) {
            if(v7 >= v0) {
                break;
            }
            else if(v6[v5[v7]] == null) {
                v7 = 0;
            }
            else {
                ++v7;
                continue;
            }

            goto label_25;
        }

        v7 = 1;
    label_25:
        if(v7 != 0) {
            return 1;
        }

        v7 = 2;
        if(v3 != null) {
            if(v3[0] == 0 && v3[1] == 0 && v3[v7] == 0 && v3[3] == 0) {
                goto label_50;
            }

            v9 = gy.af(v1.ai[v2], true, 52);
            lq v10 = new lq(v9);
            v10.bb(v3, 5, v10.ae.length, 0x2EC15FE9);
        }
        else {
        label_50:
            v9 = gy.af(v1.ai[v2], false, 0x7F);
        }

        byte v10_1 = 15;
        try {
            v10_2 = cn.bf(v9, v10_1);
        }
        catch(RuntimeException v0_1) {
            RuntimeException v6_1 = v0_1;
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("");
            if(v3 != null) {
                v4 = true;
            }

            v0_2.append(v4);
            v0_2.append(",");
            v0_2.append(v2);
            v0_2.append(",");
            v0_2.append(v9.length);
            v0_2.append(",");
            v0_2.append(client.al(v9, v9.length, 30));
            v0_2.append(",");
            v0_2.append(client.al(v9, v9.length - v7, -36));
            v0_2.append(",");
            v0_2.append(v1.ap[v2]);
            v0_2.append(",");
            v0_2.append(v1.au * 0xBEC371FB);
            throw lx.al(((Throwable)v6_1), v0_2.toString());
        }

        if(v1.am) {
            v1.ai[v2] = null;
        }

        if(v0 > 1) {
            v2 = v10_2.length - 1;
            int v3_1 = v10_2[v2] & 1956023329;
            v7_1 = new lq(v10_2);
            v9_1 = new int[v0];
            v2 = (v2 - v0 * v3_1 * 4) * -1880437085;
            v7_1.ar = v2;
            v11 = 0;
            goto label_77;
        }
        else if(!v1.az) {
            v6[v5[0]] = ha.ab(v10_2, false, 0x7FB31128);
        }
        else {
            v6[v5[0]] = v10_2;
            return 1;
        label_77:
            while(v11 < v3_1) {
                v12 = 0;
                v13 = 0;
                while(v12 < v0) {
                    v13 += v7_1.ac(26);
                    v9_1[v12] += v13;
                    ++v12;
                }

                ++v11;
            }

            byte[][] v11_1 = new byte[v0][];
            for(v12 = 0; v12 < v0; ++v12) {
                v11_1[v12] = new byte[v9_1[v12]];
                v9_1[v12] = 0;
            }

            v7_1.ar = v2;
            v2 = 0;
            for(v12 = 0; v2 < v3_1; v12 = v14) {
                int v14 = v12;
                v12 = 0;
                v13 = 0;
                while(v12 < v0) {
                    v13 += v7_1.ac(36);
                    System.arraycopy(v10_2, v14, v11_1[v12], v9_1[v12], v13);
                    v9_1[v12] += v13;
                    v14 += v13;
                    ++v12;
                }

                ++v2;
            }

            for(v2 = 0; v2 < v0; ++v2) {
                v6[v5[v2]] = !v1.az ? ha.ab(v11_1[v2], false, 0x7F15CC53) : v11_1[v2];
            }
        }

        return 1;
    }

    public int cr(int arg2) {
        return this.av[arg2].length;
    }

    public int cs() {
        return this.av.length;
    }

    public void ct() {
        int v1;
        for(v1 = 0; v1 < this.av.length; ++v1) {
            if(this.av[v1] != null) {
                int v2;
                for(v2 = 0; v2 < this.av[v1].length; ++v2) {
                    this.av[v1][v2] = null;
                }
            }
        }
    }

    boolean cu(int arg17, int[] arg18) {
        int v13;
        int v12;
        int v11;
        int[] v9_1;
        lq v7_1;
        byte[] v10_2;
        byte[] v9;
        ko v1 = this;
        int v2 = arg17;
        int[] v3 = arg18;
        boolean v4 = false;
        if(v1.ai[v2] == null) {
            return 0;
        }

        int v0 = v1.ad[v2];
        int[] v5 = v1.aq[v2];
        Object[] v6 = v1.av[v2];
        int v7 = 0;
        while(true) {
            if(v7 >= v0) {
                break;
            }
            else if(v6[v5[v7]] == null) {
                v7 = 0;
            }
            else {
                ++v7;
                continue;
            }

            goto label_25;
        }

        v7 = 1;
    label_25:
        if(v7 != 0) {
            return 1;
        }

        v7 = 2;
        if(v3 != null) {
            if(v3[0] == 0 && v3[1] == 0 && v3[v7] == 0 && v3[3] == 0) {
                goto label_50;
            }

            v9 = gy.af(v1.ai[v2], true, 89);
            lq v10 = new lq(v9);
            v10.bb(v3, 5, v10.ae.length, 0x104DF45B);
        }
        else {
        label_50:
            v9 = gy.af(v1.ai[v2], false, 0x76);
        }

        byte v10_1 = -6;
        try {
            v10_2 = cn.bf(v9, v10_1);
        }
        catch(RuntimeException v0_1) {
            RuntimeException v6_1 = v0_1;
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("");
            if(v3 != null) {
                v4 = true;
            }

            v0_2.append(v4);
            v0_2.append(",");
            v0_2.append(v2);
            v0_2.append(",");
            v0_2.append(v9.length);
            v0_2.append(",");
            v0_2.append(client.al(v9, v9.length, -103));
            v0_2.append(",");
            v0_2.append(client.al(v9, v9.length - v7, 72));
            v0_2.append(",");
            v0_2.append(v1.ap[v2]);
            v0_2.append(",");
            v0_2.append(v1.au * 0xBEC371FB);
            throw lx.al(((Throwable)v6_1), v0_2.toString());
        }

        if(v1.am) {
            v1.ai[v2] = null;
        }

        if(v0 > 1) {
            v2 = v10_2.length - 1;
            int v3_1 = v10_2[v2] & 0xFF;
            v7_1 = new lq(v10_2);
            v9_1 = new int[v0];
            v2 = (v2 - v0 * v3_1 * 4) * -1880437085;
            v7_1.ar = v2;
            v11 = 0;
            goto label_76;
        }
        else if(!v1.az) {
            v6[v5[0]] = ha.ab(v10_2, false, 0x7FA5308B);
        }
        else {
            v6[v5[0]] = v10_2;
            return 1;
        label_76:
            while(v11 < v3_1) {
                v12 = 0;
                v13 = 0;
                while(v12 < v0) {
                    v13 += v7_1.ac(15);
                    v9_1[v12] += v13;
                    ++v12;
                }

                ++v11;
            }

            byte[][] v11_1 = new byte[v0][];
            for(v12 = 0; v12 < v0; ++v12) {
                v11_1[v12] = new byte[v9_1[v12]];
                v9_1[v12] = 0;
            }

            v7_1.ar = v2;
            v2 = 0;
            for(v12 = 0; v2 < v3_1; v12 = v14) {
                int v14 = v12;
                v12 = 0;
                v13 = 0;
                while(v12 < v0) {
                    v13 += v7_1.ac(102);
                    System.arraycopy(v10_2, v14, v11_1[v12], v9_1[v12], v13);
                    v9_1[v12] += v13;
                    v14 += v13;
                    ++v12;
                }

                ++v2;
            }

            for(v2 = 0; v2 < v0; ++v2) {
                v6[v5[v2]] = !v1.az ? ha.ab(v11_1[v2], false, 0x7F6ADDB8) : v11_1[v2];
            }
        }

        return 1;
    }

    public int cv(String arg3) {
        return this.an.ax(ok.aq(arg3.toLowerCase(), -2074077003), 710714809);
    }

    public int[] cw(int arg2) {
        if(arg2 >= 0) {
            if(arg2 >= this.aq.length) {
            }
            else {
                return this.aq[arg2];
            }
        }

        return null;
    }

    public byte[] cx(int arg5) {
        int v1 = 0x73E61855;
        if(this.av.length == 1) {
            return this.af(0, arg5, v1);
        }

        if(1 == this.av[arg5].length) {
            return this.af(arg5, 0, v1);
        }

        throw new RuntimeException();
    }

    void cy(int arg1) {
    }

    public int cz() {
        return this.av.length;
    }

    public byte[] db(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 0x1F223192), 0x262D3D01);
        return this.ae(v3, this.af[v3].ax(ok.aq(((CharSequence)arg4), 1943417806), 0x267ACA0B), 0x78DC0DC9);
    }

    public boolean dc(String arg3) {
        return this.aj(this.an.ax(ok.aq(arg3.toLowerCase(), 0x5A74F705), 0x548A6C35), 1603979670);
    }

    public boolean de(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 208233804), 0x58B57B66);
        return this.an(v3, this.af[v3].ax(ok.aq(((CharSequence)arg4), 0xF56C403A), 0xE3B703E), 226903339);
    }

    public int df(String arg3) {
        return this.aq(this.an.ax(ok.aq(arg3.toLowerCase(), 1237564025), -590690675), 1069861560);
    }

    public boolean dh(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 0x8A7B981B), 0xB7BB9B0E);
        if(v3 < 0) {
            return 0;
        }

        if(this.af[v3].ax(ok.aq(((CharSequence)arg4), 0x4638A34E), 0x972CFAAC) < 0) {
            return 0;
        }

        return 1;
    }

    public boolean dj(String arg3) {
        return this.aj(this.an.ax(ok.aq(arg3.toLowerCase(), 0xA749D6AA), 0xE40A8248), 0xA8087762);
    }

    public boolean dk(String arg3) {
        return this.aj(this.an.ax(ok.aq(arg3.toLowerCase(), 0x6F8C5273), 0xF69BB0B7), 0x49BBFF82);
    }

    public int dl(String arg3) {
        return this.aq(this.an.ax(ok.aq(arg3.toLowerCase(), 0x524968F9), 0xA8AF650B), 0x3ACD6DAD);
    }

    public boolean dm(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), -477541004), 0x4E82C065);
        return this.an(v3, this.af[v3].ax(ok.aq(((CharSequence)arg4), -2059079090), 0xC199AF89), 71224206);
    }

    static final byte[] dn(byte[] arg6) {
        lq v0 = new lq(arg6);
        int v1 = v0.ay(-112);
        int v2 = v0.ac(81);
        if(v2 >= 0 && (ko.ag * 0xEA2C1A61 == 0 || v2 <= ko.ag * 1758146230)) {
            if(v1 == 0) {
                arg6 = new byte[v2];
                v0.bw(arg6, 0, v2, 228677305);
                return arg6;
            }

            int v3 = v0.ac(0x7C);
            if(v3 >= 0) {
                int v5 = 0x57DB1683;
                if(ko.ag * v5 != 0 && v3 > ko.ag * v5) {
                    goto label_41;
                }

                byte[] v4 = new byte[v3];
                if(1 == v1) {
                    kb.ax(v4, v3, arg6, v2, 9);
                }
                else {
                    ko.aa.ax(v0, v4, 0x9F1776C3);
                }

                return v4;
            }

        label_41:
            throw new RuntimeException();
        }

        throw new RuntimeException();
    }

    public boolean dp(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 0x3DE0F35), -1800771494);
        if(v3 < 0) {
            return 0;
        }

        if(this.af[v3].ax(ok.aq(((CharSequence)arg4), 0x67AFD27D), 0x1822D0D4) < 0) {
            return 0;
        }

        return 1;
    }

    static final byte[] dr(byte[] arg6) {
        lq v0 = new lq(arg6);
        int v1 = v0.ay(-3);
        int v2 = v0.ac(0x77);
        if(v2 >= 0) {
            int v4 = 0x57DB1683;
            if(ko.ag * v4 != 0 && v2 > ko.ag * v4) {
                goto label_42;
            }

            if(v1 == 0) {
                arg6 = new byte[v2];
                v0.bw(arg6, 0, v2, 0xA7F9EFD4);
                return arg6;
            }

            int v3 = v0.ac(87);
            if(v3 >= 0 && (ko.ag * v4 == 0 || v3 <= ko.ag * v4)) {
                byte[] v4_1 = new byte[v3];
                if(1 == v1) {
                    kb.ax(v4_1, v3, arg6, v2, 9);
                }
                else {
                    ko.aa.ax(v0, v4_1, 0x9F1776C3);
                }

                return v4_1;
            }

            throw new RuntimeException();
        }

    label_42:
        throw new RuntimeException();
    }

    public void ds(String arg3) {
        int v3 = this.an.ax(ok.aq(arg3.toLowerCase(), 0x133D2BB7), 0x9F053956);
        if(v3 < 0) {
            return;
        }

        this.al(v3, 0x8A130284);
    }

    public byte[] du(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 0xAA2C64B3), 0xF2AB62F6);
        return this.ae(v3, this.af[v3].ax(ok.aq(((CharSequence)arg4), 0xBA77C70E), 0xA434191), 0x78DC0DC9);
    }

    public boolean dv(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), 180020269), 0x89A8BF38);
        if(v3 < 0) {
            return 0;
        }

        if(this.af[v3].ax(ok.aq(((CharSequence)arg4), 0x57B10EE8), -510126723) < 0) {
            return 0;
        }

        return 1;
    }

    public byte[] dw(String arg3, String arg4) {
        arg3 = arg3.toLowerCase();
        arg4 = arg4.toLowerCase();
        int v3 = this.an.ax(ok.aq(((CharSequence)arg3), -541670012), 0x8EFDC4BA);
        return this.ae(v3, this.af[v3].ax(ok.aq(((CharSequence)arg4), 1804856085), 0xD9776177), 0x78DC0DC9);
    }

    public void dy(String arg3) {
        int v3 = this.an.ax(ok.aq(arg3.toLowerCase(), 0x5088DB13), 0x93760D5D);
        if(v3 < 0) {
            return;
        }

        this.al(v3, -1809236562);
    }
}

