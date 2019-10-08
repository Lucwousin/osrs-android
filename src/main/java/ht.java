import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ht {
    int aa;
    boolean ab;
    static final int ad = 0x4000;
    static final int ae = 1;
    int[] af;
    hz ai;
    static boolean al = false;
    static int an = 0;
    static ScheduledExecutorService ar = null;
    int at;
    int av;
    hz[] aw;
    public static int ax = 0;
    hz[] ay;
    static final int qq = 0x100;

    ht() {
        try {
            super();
            this.ab = false;
            this.av = 0x11B64B20;
            ji.ax(0x2076E2C1);
            this.at = 0;
            this.ay = new hz[8];
            this.aw = new hz[8];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ht.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(byte arg1) throws Exception {
    }

    public void ab(boolean arg2, byte arg3) {
        try {
            this.ab = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ht.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static es[] ab(ko arg0, String arg1, String arg2, short arg3) {
        int v3 = 0xD4A3E869;
        try {
            int v1 = arg0.ay(arg1, v3);
            return id.an(arg0, v1, arg0.aw(v1, arg2, 0xD310CF78), 2096965160);
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("ht.ab(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    public static final ht ac(mq arg8, int arg9, int arg10) {
        ht v0;
        if(ht.ax * 0x6AF63FEE != 0) {
            if(arg9 >= 0) {
                byte v8 = 2;
                if(arg9 < v8) {
                    if(arg10 < 0x2F7EA2EE) {
                        arg10 = 0x3495F4B6;
                    }

                    try {
                        v0 = nk.aq.ax(0);
                        int v1 = ht.al ? 2 : 1;
                        v0.af = new int[v1 * 0x100];
                        v0.aa(v8);
                        v0.aa = ((arg10 & 0xFFFFFC00) + 0x400) * -860272805;
                        if(v0.aa * -1815801040 > 0x4000) {
                            v0.aa = 0x37E703B0;
                        }

                        v0.au(v0.aa * 556110035, 0x7D);
                        if(ht.an * 0xEA37517D > 0 && ig.ap == null) {
                            ig.ap = new hc();
                            ht.ar = Executors.newScheduledThreadPool(1);
                            ht.ar.scheduleAtFixedRate(ig.ap, 0, 1, TimeUnit.MILLISECONDS);
                        }

                        if(ig.ap != null) {
                            if(ig.ap.ax[arg9] == null) {
                                ig.ap.ax[arg9] = v0;
                            }
                            else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    catch(Throwable ) {
                        return new gp();
                    }

                    return v0;
                }
            }

            throw new IllegalArgumentException();
        }

        throw new IllegalStateException();
    }

    public final void ad(int arg3) {
        __monitor_enter(this);
        arg3 = 0x63360647;
        try {
            this.az(arg3);
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
        }
        catch(Exception ) {
            arg3 = 0x76B09D34;
            try {
                this.am(arg3);
                ji.ax(0x2076E2C1);
            }
            catch(Throwable v3) {
            }
            catch(RuntimeException v3_1) {
                try {
                    StringBuilder v0 = new StringBuilder();
                    v0.append("ht.ad(");
                    v0.append(')');
                    throw lx.al(((Throwable)v3_1), v0.toString());
                }
                catch(Throwable v3) {
                    __monitor_exit(this);
                    throw v3;
                }
            }
        }

        __monitor_exit(this);
    }

    final void af(int[] arg18, int arg19) {
        hz v6_2;
        gd v6_1;
        int v11;
        int v10;
        ht v0 = this;
        int[] v1 = arg18;
        int v2 = arg19;
        int v3 = ht.al ? v2 << 1 : v2;
        mg.ab(v1, 0, v3);
        int v5 = 0x7A8292F7;
        v0.at -= v2 * v5;
        int v6 = -1553215801;
        if(v0.ai != null && v0.at * v6 <= 0) {
            v0.at += (ht.ax * 0x2C18D40D >> 4) * v5;
            ac.ai(v0.ai, -24);
            v0.av(v0.ai, v0.ai.bk(), 120);
            v3 = 0xFF;
            v5 = 7;
            int v7 = 0;
            while(true) {
                int v8 = 8;
                if(v3 != 0) {
                    if(v5 < 0) {
                        v10 = v5 & 3;
                        v11 = -(v5 >> 2);
                    }
                    else {
                        v10 = v5;
                        v11 = 0;
                    }

                    int v12 = v3 >>> v10 & 0x11111111;
                    while(v12 != 0) {
                        if((v12 & 1) == 0) {
                        }
                        else {
                            boolean v13 = true;
                            int v14 = 1 << v10;
                            v3 &= ~v14;
                            hz v15 = v0.ay[v10];
                            hz v4 = null;
                            while(true) {
                            label_65:
                                if(v15 != null) {
                                    v6_1 = v15.ag;
                                    if(v6_1 != null && v6_1.ax > v11) {
                                        v3 |= v14;
                                        hz v16 = v15;
                                        v15 = v15.am;
                                        v4 = v16;
                                        continue;
                                    }

                                    break;
                                }

                                goto label_117;
                            }

                            v15.ah = v13;
                            int v9 = v15.ad();
                            v7 += v9;
                            if(v6_1 != null) {
                                v6_1.ax += v9;
                            }

                            if(v7 >= v0.av * 0xF3F675E9) {
                                goto label_124;
                            }

                            v6_2 = v15.ap();
                            if(v6_2 != null) {
                                v9 = v15.az;
                                while(v6_2 != null) {
                                    v0.av(v6_2, v6_2.bk() * v9 >> v8, 34);
                                    v6_2 = v15.aj();
                                    v8 = 8;
                                }
                            }

                            v6_2 = v15.am;
                            v15.am = null;
                            if(v4 == null) {
                                v0.ay[v10] = v6_2;
                            }
                            else {
                                v4.am = v6_2;
                            }

                            if(v6_2 == null) {
                                v0.aw[v10] = v4;
                            }

                            v15 = v6_2;
                            v8 = 8;
                            v13 = true;
                            goto label_65;
                        }

                    label_117:
                        v10 += 4;
                        ++v11;
                        v12 >>>= 4;
                        v8 = 8;
                    }

                    --v5;
                    continue;
                }

                break;
            }

        label_124:
            v3 = 0;
            int v4_1 = 8;
            while(v3 < v4_1) {
                hz v5_1 = v0.ay[v3];
                hz[] v6_3 = v0.ay;
                hz v8_1 = null;
                v0.aw[v3] = v8_1;
                v6_3[v3] = v8_1;
                while(v5_1 != null) {
                    v6_2 = v5_1.am;
                    v5_1.am = v8_1;
                    v5_1 = v6_2;
                }

                ++v3;
            }
        }

        if(v0.at * -1553215801 < 0) {
            v3 = 0;
            v0.at = 0;
        }
        else {
            v3 = 0;
        }

        if(v0.ai != null) {
            v0.ai.aq(v1, v3, v2);
        }

        ji.ax(0x2076E2C1);
    }

    public static final void ag(hf arg0) {
        nk.aq = arg0;
    }

    static void ah(boolean arg1, int arg2) {
        arg2 = 0xD895F935;
        try {
            hq.cm = bi.at(arg2) * 0xE53F385D;
            client.al.aba(0xB4ADC7FD).gc(0x870C519C);
            if(arg1) {
                hq.cg = "";
                hq.co = "";
                mf.dj = 0;
                da.ds = "";
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ht.ah(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static final void ah(hf arg0) {
        nk.aq = arg0;
    }

    public final void aj(int arg1) {
    }

    public static final ht ak(mq arg9, int arg10, int arg11) {
        ht v1;
        if(ht.ax * 0x2C18D40D != 0) {
            if(arg10 >= 0) {
                byte v9 = 2;
                if(arg10 < v9) {
                    if(arg11 < 0x100) {
                        arg11 = 0x100;
                    }

                    try {
                        v1 = nk.aq.ax(0);
                        int v2 = ht.al ? 2 : 1;
                        v1.af = new int[v2 * 0x100];
                        v1.aa(v9);
                        v1.aa = ((arg11 & 0xFFFFFC00) + 0x400) * -860272805;
                        arg11 = 556110035;
                        if(v1.aa * arg11 > 0x4000) {
                            v1.aa = 0x51D6C000;
                        }

                        v1.au(v1.aa * arg11, 0x7E);
                        if(ht.an * 0xEA37517D > 0 && ig.ap == null) {
                            ig.ap = new hc();
                            ht.ar = Executors.newScheduledThreadPool(1);
                            ht.ar.scheduleAtFixedRate(ig.ap, 0, 1, TimeUnit.MILLISECONDS);
                        }

                        if(ig.ap != null) {
                            if(ig.ap.ax[arg10] == null) {
                                ig.ap.ax[arg10] = v1;
                            }
                            else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    catch(Throwable ) {
                        return new gp();
                    }

                    return v1;
                }
            }

            throw new IllegalArgumentException();
        }

        throw new IllegalStateException();
    }

    abstract void al();

    void am(int arg1) {
    }

    public static final void ao(int arg1, boolean arg2, int arg3) {
        if(arg1 >= 8000 && arg1 <= 48000) {
            ht.ax = arg1 * -932603195;
            ht.al = arg2;
            ht.an = arg3 * 0xC3746FD5;
            return;
        }

        throw new IllegalArgumentException();
    }

    public final void ap(hz arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.ai = arg2;
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v3 = new StringBuilder();
                v3.append("ht.ap(");
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

    public final void aq(byte arg5) {
        __monitor_enter(this);
        try {
            ht v0 = null;
            if(ig.ap != null) {
                int v1 = 0;
                int v2 = 1;
                while(v1 < 2) {
                    if(ig.ap.ax[v1] == this) {
                        ig.ap.ax[v1] = v0;
                    }

                    if(ig.ap.ax[v1] != null) {
                        v2 = 0;
                    }

                    ++v1;
                }

                if(v2 == 0) {
                    goto label_29;
                }

                ht.ar.shutdownNow();
                ht.ar = ((ScheduledExecutorService)v0);
                ig.ap = ((hc)v0);
            }

        label_29:
            this.am(0x27F7AB3D);
            this.af = ((int[])v0);
        }
        catch(Throwable v5) {
        }
        catch(RuntimeException v5_1) {
            try {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("ht.aq(");
                v0_1.append(')');
                throw lx.al(((Throwable)v5_1), v0_1.toString());
            }
            catch(Throwable v5) {
                __monitor_exit(this);
                throw v5;
            }
        }

        __monitor_exit(this);
    }

    public static int aq(int arg1, byte arg2) {
        try {
            return ii.ab(bc.az[arg1]);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ht.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static int ar(int arg0, byte arg1) {
        return arg0 >> 17 & 7;
    }

    public static final void as(int arg1, boolean arg2, int arg3) {
        if(arg1 >= -1423055943 && arg1 <= 48000) {
            ht.ax = arg1 * 1786931290;
            ht.al = arg2;
            ht.an = arg3 * 0x6143351D;
            return;
        }

        throw new IllegalArgumentException();
    }

    public static final void at(int arg1, boolean arg2, int arg3) {
        if(arg1 >= 8000 && arg1 <= 48000) {
            ht.ax = arg1 * -932603195;
            ht.al = arg2;
            ht.an = arg3 * 0xC3746FD5;
            return;
        }

        throw new IllegalArgumentException();
    }

    void au(int arg1, byte arg2) throws Exception {
    }

    final void av(hz arg2, int arg3, byte arg4) {
        int v4 = arg3 >> 5;
        try {
            hz v0 = this.aw[v4];
            if(v0 == null) {
                this.ay[v4] = arg2;
            }
            else {
                v0.am = arg2;
            }

            this.aw[v4] = arg2;
            arg2.az = arg3;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ht.av(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static final void aw(int arg1, boolean arg2, int arg3) {
        if(arg1 >= 8000 && arg1 <= 48000) {
            ht.ax = arg1 * -932603195;
            ht.al = arg2;
            ht.an = arg3 * 0xC3746FD5;
            return;
        }

        throw new IllegalArgumentException();
    }

    abstract void ax(int arg1);

    public static final void ay(int arg1, boolean arg2, int arg3) {
        if(arg1 >= 8000 && arg1 <= 48000) {
            ht.ax = arg1 * -932603195;
            ht.al = arg2;
            ht.an = arg3 * 0xC3746FD5;
            return;
        }

        throw new IllegalArgumentException();
    }

    void az(int arg1) throws Exception {
    }

    public final void ba(hz arg1) {
        __monitor_enter(this);
        try {
            this.ai = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    static final void bb(hz arg2) {
        arg2.ah = false;
        if(arg2.ag != null) {
            arg2.ag.ax = 0;
        }

        hz v0;
        for(v0 = arg2.ap(); v0 != null; v0 = arg2.aj()) {
            ac.ai(v0, -54);
        }
    }

    static final void bc(hz arg2) {
        arg2.ah = false;
        if(arg2.ag != null) {
            arg2.ag.ax = 0;
        }

        hz v0;
        for(v0 = arg2.ap(); v0 != null; v0 = arg2.aj()) {
            ac.ai(v0, 23);
        }
    }

    public static final ht bd(mq arg9, int arg10, int arg11) {
        ht v1;
        if(ht.ax * 0x2C18D40D != 0) {
            if(arg10 >= 0) {
                byte v9 = 2;
                if(arg10 < v9) {
                    if(arg11 < 0x100) {
                        arg11 = 0x100;
                    }

                    try {
                        v1 = nk.aq.ax(0);
                        int v2 = ht.al ? 2 : 1;
                        v1.af = new int[v2 * 0x100];
                        v1.aa(v9);
                        v1.aa = ((arg11 & 0xFFFFFC00) + 0x400) * -860272805;
                        arg11 = 556110035;
                        if(v1.aa * arg11 > 0x4000) {
                            v1.aa = 0x51D6C000;
                        }

                        v1.au(v1.aa * arg11, 98);
                        if(ht.an * 0xEA37517D > 0 && ig.ap == null) {
                            ig.ap = new hc();
                            ht.ar = Executors.newScheduledThreadPool(1);
                            ht.ar.scheduleAtFixedRate(ig.ap, 0, 1, TimeUnit.MILLISECONDS);
                        }

                        if(ig.ap != null) {
                            if(ig.ap.ax[arg10] == null) {
                                ig.ap.ax[arg10] = v1;
                            }
                            else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    catch(Throwable ) {
                        return new gp();
                    }

                    return v1;
                }
            }

            throw new IllegalArgumentException();
        }

        throw new IllegalStateException();
    }

    void be(int arg1) throws Exception {
    }

    public final void bf() {
    }

    final void bg(int[] arg17, int arg18) {
        gd v4;
        int v10;
        int v9;
        ht v0 = this;
        int[] v1 = arg17;
        int v2 = arg18;
        int v3 = ht.al ? v2 << 1 : v2;
        mg.ab(v1, 0, v3);
        v0.at -= 0xA33A5472 * v2;
        if(v0.ai != null && v0.at * 514751036 <= 0) {
            v0.at += (ht.ax * 0x2C18D40D >> 4) * 0x7A8292F7;
            ac.ai(v0.ai, -61);
            v0.av(v0.ai, v0.ai.bk(), 109);
            v3 = 0xD30F40D7;
            int v5 = 7;
            int v6 = 0;
            while(true) {
                int v7 = 8;
                if(v3 != 0) {
                    if(v5 < 0) {
                        v9 = v5 & 3;
                        v10 = -(v5 >> 2);
                    }
                    else {
                        v9 = v5;
                        v10 = 0;
                    }

                    int v11 = v3 >>> v9 & 0xDEE7204A;
                    while(v11 != 0) {
                        if((v11 & 1) == 0) {
                        }
                        else {
                            boolean v12 = true;
                            int v13 = 1 << v9;
                            v3 &= ~v13;
                            hz v14 = v0.ay[v9];
                            hz v15 = null;
                            while(true) {
                            label_66:
                                if(v14 != null) {
                                    v4 = v14.ag;
                                    if(v4 != null && v4.ax > v10) {
                                        v3 |= v13;
                                        v15 = v14;
                                        v14 = v14.am;
                                        continue;
                                    }

                                    break;
                                }

                                goto label_117;
                            }

                            v14.ah = v12;
                            int v8 = v14.ad();
                            v6 += v8;
                            if(v4 != null) {
                                v4.ax += v8;
                            }

                            if(v6 >= v0.av * 0xC791FBE3) {
                                goto label_123;
                            }

                            hz v4_1 = v14.ap();
                            if(v4_1 != null) {
                                v8 = v14.az;
                                while(v4_1 != null) {
                                    v0.av(v4_1, v4_1.bk() * v8 >> v7, 34);
                                    v4_1 = v14.aj();
                                    v7 = 8;
                                }
                            }

                            v4_1 = v14.am;
                            v14.am = null;
                            if(v15 == null) {
                                v0.ay[v9] = v4_1;
                            }
                            else {
                                v15.am = v4_1;
                            }

                            if(v4_1 == null) {
                                v0.aw[v9] = v15;
                            }

                            v14 = v4_1;
                            v7 = 8;
                            v12 = true;
                            goto label_66;
                        }

                    label_117:
                        v9 += 4;
                        ++v10;
                        v11 >>>= 4;
                        v7 = 8;
                    }

                    --v5;
                    continue;
                }

                break;
            }

        label_123:
            v3 = 0;
            int v4_2 = 8;
            while(v3 < v4_2) {
                hz v5_1 = v0.ay[v3];
                hz[] v6_1 = v0.ay;
                hz v8_1 = null;
                v0.aw[v3] = v8_1;
                v6_1[v3] = v8_1;
                while(v5_1 != null) {
                    hz v6_2 = v5_1.am;
                    v5_1.am = v8_1;
                    v5_1 = v6_2;
                }

                ++v3;
            }
        }

        if(v0.at * 0x3B7D020D < 0) {
            v3 = 0;
            v0.at = 0;
        }
        else {
            v3 = 0;
        }

        if(v0.ai != null) {
            v0.ai.aq(v1, v3, v2);
        }

        ji.ax(0x2076E2C1);
    }

    final void bh(int[] arg18, int arg19) {
        hz v6_2;
        gd v6_1;
        int v11;
        int v10;
        ht v0 = this;
        int[] v1 = arg18;
        int v2 = arg19;
        int v3 = ht.al ? v2 << 1 : v2;
        mg.ab(v1, 0, v3);
        int v5 = 0x7A8292F7;
        v0.at -= v2 * v5;
        int v6 = -1553215801;
        if(v0.ai != null && v0.at * v6 <= 0) {
            v0.at += (ht.ax * 0x2C18D40D >> 4) * v5;
            ac.ai(v0.ai, -51);
            v0.av(v0.ai, v0.ai.bk(), 88);
            v3 = 0xFF;
            v5 = 7;
            int v7 = 0;
            while(true) {
                int v8 = 8;
                if(v3 != 0) {
                    if(v5 < 0) {
                        v10 = v5 & 3;
                        v11 = -(v5 >> 2);
                    }
                    else {
                        v10 = v5;
                        v11 = 0;
                    }

                    int v12 = v3 >>> v10 & 0x11111111;
                    while(v12 != 0) {
                        if((v12 & 1) == 0) {
                        }
                        else {
                            boolean v13 = true;
                            int v14 = 1 << v10;
                            v3 &= ~v14;
                            hz v15 = v0.ay[v10];
                            hz v4 = null;
                            while(true) {
                            label_65:
                                if(v15 != null) {
                                    v6_1 = v15.ag;
                                    if(v6_1 != null && v6_1.ax > v11) {
                                        v3 |= v14;
                                        hz v16 = v15;
                                        v15 = v15.am;
                                        v4 = v16;
                                        continue;
                                    }

                                    break;
                                }

                                goto label_117;
                            }

                            v15.ah = v13;
                            int v9 = v15.ad();
                            v7 += v9;
                            if(v6_1 != null) {
                                v6_1.ax += v9;
                            }

                            if(v7 >= v0.av * 0xF3F675E9) {
                                goto label_124;
                            }

                            v6_2 = v15.ap();
                            if(v6_2 != null) {
                                v9 = v15.az;
                                while(v6_2 != null) {
                                    v0.av(v6_2, v6_2.bk() * v9 >> v8, 14);
                                    v6_2 = v15.aj();
                                    v8 = 8;
                                }
                            }

                            v6_2 = v15.am;
                            v15.am = null;
                            if(v4 == null) {
                                v0.ay[v10] = v6_2;
                            }
                            else {
                                v4.am = v6_2;
                            }

                            if(v6_2 == null) {
                                v0.aw[v10] = v4;
                            }

                            v15 = v6_2;
                            v8 = 8;
                            v13 = true;
                            goto label_65;
                        }

                    label_117:
                        v10 += 4;
                        ++v11;
                        v12 >>>= 4;
                        v8 = 8;
                    }

                    --v5;
                    continue;
                }

                break;
            }

        label_124:
            v3 = 0;
            int v4_1 = 8;
            while(v3 < v4_1) {
                hz v5_1 = v0.ay[v3];
                hz[] v6_3 = v0.ay;
                hz v8_1 = null;
                v0.aw[v3] = v8_1;
                v6_3[v3] = v8_1;
                while(v5_1 != null) {
                    v6_2 = v5_1.am;
                    v5_1.am = v8_1;
                    v5_1 = v6_2;
                }

                ++v3;
            }
        }

        if(v0.at * -1553215801 < 0) {
            v3 = 0;
            v0.at = 0;
        }
        else {
            v3 = 0;
        }

        if(v0.ai != null) {
            v0.ai.aq(v1, v3, v2);
        }

        ji.ax(0x2076E2C1);
    }

    void bi() {
    }

    void bj(int arg1) throws Exception {
    }

    void bk() throws Exception {
    }

    void bl(int arg1) throws Exception {
    }

    void bm() throws Exception {
    }

    public final void bn() {
    }

    public final void bo() {
        __monitor_enter(this);
        int v0 = 0x8BFDBFA3;
        try {
            this.az(v0);
        }
        catch(Throwable v0_1) {
        }
        catch(Exception ) {
            v0 = 0xF42FDC89;
            try {
                this.am(v0);
                ji.ax(0x2076E2C1);
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    public final void bp() {
        __monitor_enter(this);
        int v0 = 901007840;
        try {
            this.az(v0);
        }
        catch(Throwable v0_1) {
        }
        catch(Exception ) {
            v0 = 0x54A0078E;
            try {
                this.am(v0);
                ji.ax(0x2076E2C1);
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    public void bq(boolean arg1) {
        this.ab = arg1;
    }

    void br() {
    }

    void bs(int arg1) throws Exception {
    }

    public void bt(boolean arg1) {
        this.ab = arg1;
    }

    void bu(int arg1) throws Exception {
    }

    public void bv(boolean arg1) {
        this.ab = arg1;
    }

    public final void bw() {
        __monitor_enter(this);
        int v0 = 0xFE4A81F6;
        try {
            this.az(v0);
        }
        catch(Throwable v0_1) {
        }
        catch(Exception ) {
            v0 = 0xDE99CD9;
            try {
                this.am(v0);
                ji.ax(0x2076E2C1);
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    final void bx(int[] arg17, int arg18) {
        gd v4;
        int v10;
        int v9;
        ht v0 = this;
        int[] v1 = arg17;
        int v2 = arg18;
        int v3 = ht.al ? v2 << 1 : v2;
        mg.ab(v1, 0, v3);
        v0.at -= 0xB714E730 * v2;
        if(v0.ai != null && v0.at * 0x91E0400A <= 0) {
            v0.at += (ht.ax * 0x2C18D40D >> 4) * 0x7A8292F7;
            ac.ai(v0.ai, -52);
            v0.av(v0.ai, v0.ai.bk(), 87);
            v3 = 0xFF;
            int v5 = 7;
            int v6 = 0;
            while(true) {
                int v7 = 8;
                if(v3 != 0) {
                    if(v5 < 0) {
                        v9 = v5 & 3;
                        v10 = -(v5 >> 2);
                    }
                    else {
                        v9 = v5;
                        v10 = 0;
                    }

                    int v11 = v3 >>> v9 & 0x11111111;
                    while(v11 != 0) {
                        if((v11 & 1) == 0) {
                        }
                        else {
                            boolean v12 = true;
                            int v13 = 1 << v9;
                            v3 &= ~v13;
                            hz v14 = v0.ay[v9];
                            hz v15 = null;
                            while(true) {
                            label_66:
                                if(v14 != null) {
                                    v4 = v14.ag;
                                    if(v4 != null && v4.ax > v10) {
                                        v3 |= v13;
                                        v15 = v14;
                                        v14 = v14.am;
                                        continue;
                                    }

                                    break;
                                }

                                goto label_117;
                            }

                            v14.ah = v12;
                            int v8 = v14.ad();
                            v6 += v8;
                            if(v4 != null) {
                                v4.ax += v8;
                            }

                            if(v6 >= v0.av * 1094126500) {
                                goto label_123;
                            }

                            hz v4_1 = v14.ap();
                            if(v4_1 != null) {
                                v8 = v14.az;
                                while(v4_1 != null) {
                                    v0.av(v4_1, v4_1.bk() * v8 >> v7, 6);
                                    v4_1 = v14.aj();
                                    v7 = 8;
                                }
                            }

                            v4_1 = v14.am;
                            v14.am = null;
                            if(v15 == null) {
                                v0.ay[v9] = v4_1;
                            }
                            else {
                                v15.am = v4_1;
                            }

                            if(v4_1 == null) {
                                v0.aw[v9] = v15;
                            }

                            v14 = v4_1;
                            v7 = 8;
                            v12 = true;
                            goto label_66;
                        }

                    label_117:
                        v9 += 4;
                        ++v10;
                        v11 >>>= 4;
                        v7 = 8;
                    }

                    --v5;
                    continue;
                }

                break;
            }

        label_123:
            v3 = 0;
            int v4_2 = 8;
            while(v3 < v4_2) {
                hz v5_1 = v0.ay[v3];
                hz[] v6_1 = v0.ay;
                hz v8_1 = null;
                v0.aw[v3] = v8_1;
                v6_1[v3] = v8_1;
                while(v5_1 != null) {
                    hz v6_2 = v5_1.am;
                    v5_1.am = v8_1;
                    v5_1 = v6_2;
                }

                ++v3;
            }
        }

        if(v0.at * -1553215801 < 0) {
            v3 = 0;
            v0.at = 0;
        }
        else {
            v3 = 0;
        }

        if(v0.ai != null) {
            v0.ai.aq(v1, v3, v2);
        }

        ji.ax(0x2076E2C1);
    }

    public final void by() {
        __monitor_enter(this);
        int v0 = -1347107054;
        try {
            this.az(v0);
        }
        catch(Throwable v0_1) {
        }
        catch(Exception ) {
            v0 = -48405693;
            try {
                this.am(v0);
                ji.ax(0x2076E2C1);
            }
            catch(Throwable v0_1) {
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
    }

    final void bz(int[] arg18, int arg19) {
        hz v6_2;
        gd v6_1;
        int v11;
        int v10;
        ht v0 = this;
        int[] v1 = arg18;
        int v2 = arg19;
        int v3 = ht.al ? v2 << 1 : v2;
        mg.ab(v1, 0, v3);
        int v5 = 0x7A8292F7;
        v0.at -= v2 * v5;
        int v6 = -1553215801;
        if(v0.ai != null && v0.at * v6 <= 0) {
            v0.at += (ht.ax * 0x2C18D40D >> 4) * v5;
            ac.ai(v0.ai, 100);
            v0.av(v0.ai, v0.ai.bk(), 51);
            v3 = 0xFF;
            v5 = 7;
            int v7 = 0;
            while(true) {
                int v8 = 8;
                if(v3 != 0) {
                    if(v5 < 0) {
                        v10 = v5 & 3;
                        v11 = -(v5 >> 2);
                    }
                    else {
                        v10 = v5;
                        v11 = 0;
                    }

                    int v12 = v3 >>> v10 & 0x11111111;
                    while(v12 != 0) {
                        if((v12 & 1) == 0) {
                        }
                        else {
                            boolean v13 = true;
                            int v14 = 1 << v10;
                            v3 &= ~v14;
                            hz v15 = v0.ay[v10];
                            hz v4 = null;
                            while(true) {
                            label_65:
                                if(v15 != null) {
                                    v6_1 = v15.ag;
                                    if(v6_1 != null && v6_1.ax > v11) {
                                        v3 |= v14;
                                        hz v16 = v15;
                                        v15 = v15.am;
                                        v4 = v16;
                                        continue;
                                    }

                                    break;
                                }

                                goto label_117;
                            }

                            v15.ah = v13;
                            int v9 = v15.ad();
                            v7 += v9;
                            if(v6_1 != null) {
                                v6_1.ax += v9;
                            }

                            if(v7 >= v0.av * 0xF3F675E9) {
                                goto label_124;
                            }

                            v6_2 = v15.ap();
                            if(v6_2 != null) {
                                v9 = v15.az;
                                while(v6_2 != null) {
                                    v0.av(v6_2, v6_2.bk() * v9 >> v8, 0x75);
                                    v6_2 = v15.aj();
                                    v8 = 8;
                                }
                            }

                            v6_2 = v15.am;
                            v15.am = null;
                            if(v4 == null) {
                                v0.ay[v10] = v6_2;
                            }
                            else {
                                v4.am = v6_2;
                            }

                            if(v6_2 == null) {
                                v0.aw[v10] = v4;
                            }

                            v15 = v6_2;
                            v8 = 8;
                            v13 = true;
                            goto label_65;
                        }

                    label_117:
                        v10 += 4;
                        ++v11;
                        v12 >>>= 4;
                        v8 = 8;
                    }

                    --v5;
                    continue;
                }

                break;
            }

        label_124:
            v3 = 0;
            int v4_1 = 8;
            while(v3 < v4_1) {
                hz v5_1 = v0.ay[v3];
                hz[] v6_3 = v0.ay;
                hz v8_1 = null;
                v0.aw[v3] = v8_1;
                v6_3[v3] = v8_1;
                while(v5_1 != null) {
                    v6_2 = v5_1.am;
                    v5_1.am = v8_1;
                    v5_1 = v6_2;
                }

                ++v3;
            }
        }

        if(v0.at * -1553215801 < 0) {
            v3 = 0;
            v0.at = 0;
        }
        else {
            v3 = 0;
        }

        if(v0.ai != null) {
            v0.ai.aq(v1, v3, v2);
        }

        ji.ax(0x2076E2C1);
    }

    void ca() throws Exception {
    }

    void cd() throws Exception {
    }

    void cf() throws Exception {
    }

    void cj() throws Exception {
    }

    void cx() throws Exception {
    }

    static final void gb(ar arg1, byte arg2) {
        try {
            if(client.my == null) {
                if(fh.kf.ca(0x6CB72FBB)) {
                }
                else {
                    dt.bu.ah = true;
                    client.my = arg1;
                    as.me = true;
                    fr.mu = arg1.bz * 0xC66492B5;
                    av.mk = arg1.bh * 0x707E2B6D;
                    return;
                }
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ht.gb(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void gz(short arg3) {
        boolean v0_1;
        try {
            mx v3_1;
            for(v3_1 = client.ky.ae(); v3_1 != null; v3_1 = client.ky.ar()) {
                int v1 = ((if)v3_1).ax * 0x199DF2C5;
                if(mr.ar(v1, -460976470)) {
                    ar[] v0 = ar.aj[v1];
                    v1 = 0;
                    while(true) {
                        if(v1 >= v0.length) {
                            break;
                        }
                        else if(v0[v1] != null) {
                            v0_1 = v0[v1].ag;
                        }
                        else {
                            ++v1;
                            continue;
                        }

                        goto label_22;
                    }

                    v0_1 = true;
                label_22:
                    if(v0_1) {
                        goto label_30;
                    }

                    ar v3_2 = bl.al(((int)((if)v3_1).gx), 0x64D7CF4D);
                    if(v3_2 == null) {
                        goto label_30;
                    }

                    kx.gw(v3_2, 0x7FA7B484);
                }

            label_30:
            }
        }
        catch(RuntimeException v3) {
            goto label_36;
        }

        return;
    label_36:
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("ht.gz(");
        v0_2.append(')');
        throw lx.al(((Throwable)v3), v0_2.toString());
    }
}

