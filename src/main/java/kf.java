public class kf implements Runnable {
    final fi ae;
    final fi al;
    Thread an;
    int ar;
    static final kf ax;

    static {
        kf.ax = new kf();
    }

    kf() {
        try {
            super();
            this.al = new fi();
            this.ae = new fi();
            this.ar = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kf.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(int arg3) {
        __monitor_enter(this);
        arg3 = 1666958040;
        try {
            this.ar = arg3;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("kf.aa(");
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

    static void ac(int arg8, mr arg9, ki arg10) {
        byte[] v5 = kf.ax.aq(arg8, arg9, -910601188);
        if(v5 != null) {
            arg10.do(arg9, arg8, v5, true, 0x1EF);
            return;
        }

        arg10.do(arg9, arg8, arg9.ax(arg8, -1850432167), true, 0x1EF);
    }

    public void ae() {
        while(true) {
            int v0 = 0x7FA84234;
            try {
                kj v0_2 = this.ai(v0);
                int v1 = 0xE0A2B6AB;
                if(v0_2 == null) {
                    ju.ax(100);
                    if(this.av(v1)) {
                        return;
                    }

                    this.au(-101);
                    continue;
                }

                if(v0_2.ax * 0x15B8A732 == 0) {
                    v0_2.ae.al(((int)v0_2.gx), v0_2.al, v0_2.al.length, 103);
                }
                else if(1 == v0_2.ax * 0xED230479) {
                    v0_2.al = v0_2.ae.ax(((int)v0_2.gx), 0x80086280);
                    this.az(v0_2, 51);
                }

                if(this.av(v1)) {
                    return;
                }

                this.aa(0x805E2CD0);
                continue;
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), 0xAFEE884E);
                return;
            }
        }
    }

    kj af(byte arg3) {
        __monitor_enter(this);
        try {
            __monitor_exit(this);
            return this.ae.an();
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
        label_8:
            try {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("kf.af(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3_1), v0_1.toString());
            }
            catch(Throwable v3) {
            label_24:
                __monitor_exit(this);
                throw v3;
            }
        }
        catch(Exception v3_2) {
            int v0 = 0xCB17FB98;
            String v1 = null;
            try {
                po.ax(v1, ((Throwable)v3_2), v0);
            }
            catch(Throwable v3) {
                goto label_24;
            }
            catch(RuntimeException v3_1) {
                goto label_8;
            }

            __monitor_exit(this);
            return ((kj)v1);
        }
    }

    void ah(int arg3) {
        __monitor_enter(this);
        arg3 = 1750375121;
        try {
            if(this.ar * arg3 != 0) {
                this.ar = 0xD9C3FE31;
                try {
                    this.wait();
                }
                catch(InterruptedException ) {
                }
            }
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("kf.ah(");
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

    kj ai(int arg3) {
        mx v0_1;
        __monitor_enter(this);
        String v3 = null;
        try {
            v0_1 = this.al.aj();
            goto label_13;
        }
        catch(Throwable v3_1) {
        }
        catch(RuntimeException v3_2) {
        }
        catch(Exception v0) {
            int v1 = -1491454420;
            try {
                po.ax(v3, ((Throwable)v0), v1);
                v0_1 = ((mx)v3);
            }
            catch(Throwable v3_1) {
                goto label_28;
            }
            catch(RuntimeException v3_2) {
                goto label_8;
            }

        label_13:
            if(v0_1 == null) {
                __monitor_exit(this);
                return ((kj)v3);
            }

            try {
                ((kj)v0_1).lp();
            }
            catch(Throwable v3_1) {
            }
            catch(RuntimeException v3_2) {
            label_8:
                try {
                    StringBuilder v0_2 = new StringBuilder();
                    v0_2.append("kf.ai(");
                    v0_2.append(')');
                    throw lx.al(((Throwable)v3_2), v0_2.toString());
                }
                catch(Throwable v3_1) {
                label_28:
                    __monitor_exit(this);
                    throw v3_1;
                }
            }
        }

        __monitor_exit(this);
        return ((kj)v0_1);
    }

    void aj(int arg3) {
        __monitor_enter(this);
        arg3 = 1750375121;
        try {
            if(this.ar * arg3 == 0) {
                this.an = new Thread(kf.ax);
                this.an.setDaemon(true);
                this.an.start();
                this.an.setPriority(5);
            }

            this.ar = 1666958040;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("kf.aj(");
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

    void ak() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 == 0) {
                this.an = new Thread(kf.ax);
                this.an.setDaemon(true);
                this.an.start();
                this.an.setPriority(5);
            }

            this.ar = 1666958040;
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    public void al() {
        while(true) {
            int v0 = 0x7F3766D0;
            try {
                kj v0_2 = this.ai(v0);
                int v1 = 0xE0A2B6AB;
                if(v0_2 == null) {
                    ju.ax(100);
                    if(this.av(v1)) {
                        return;
                    }

                    this.au(-117);
                    continue;
                }

                if(v0_2.ax * 0x987DA24E == 0) {
                    v0_2.ae.al(((int)v0_2.gx), v0_2.al, v0_2.al.length, 0x7F);
                }
                else if(1 == v0_2.ax * 0xED230479) {
                    v0_2.al = v0_2.ae.ax(((int)v0_2.gx), 0x805DD568);
                    this.az(v0_2, 49);
                }

                if(this.av(v1)) {
                    return;
                }

                this.aa(-2070823534);
                continue;
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), 0x6D3428A5);
                return;
            }
        }
    }

    void am(kj arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.al.al(((mx)arg2));
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v3 = new StringBuilder();
                v3.append("kf.am(");
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

    static void ao(int arg3, mr arg4, ki arg5) {
        kj v0 = new kj();
        v0.ax = 0x6FBC25C9;
        v0.gx = ((long)arg3);
        v0.ae = arg4;
        v0.ar = arg5;
        kf.ax.am(v0, 0x82D13A00);
        kf.ax.aj(0x141C0C27);
    }

    byte[] aq(int arg6, mr arg7, int arg8) {
        byte[] v6_3;
        mx v0;
        __monitor_enter(this);
        byte[] v8 = null;
        try {
            v0 = this.al.aj();
            while(true) {
            label_4:
                if(v0 == null) {
                    goto label_20;
                }

                if(((kj)v0).gx == (((long)arg6)) && arg7 == ((kj)v0).ae && ((kj)v0).ax * 0xED230479 == 0) {
                    v6_3 = ((kj)v0).al;
                    break;
                }

                goto label_17;
            }
        }
        catch(Throwable v6) {
            goto label_40;
        }
        catch(RuntimeException v6_1) {
            goto label_25;
        }
        catch(Exception v6_2) {
            goto label_27;
        }

        __monitor_exit(this);
        return v6_3;
        try {
        label_17:
            v0 = this.al.aq();
            goto label_4;
        }
        catch(Throwable v6) {
            goto label_40;
        }
        catch(RuntimeException v6_1) {
            goto label_25;
        }
        catch(Exception v6_2) {
            goto label_27;
        }

    label_20:
        __monitor_exit(this);
        return v8;
    label_27:
        int v7 = 0x40B4829;
        try {
            po.ax(((String)v8), ((Throwable)v6_2), v7);
        }
        catch(Throwable v6) {
            goto label_40;
        }
        catch(RuntimeException v6_1) {
            goto label_25;
        }

        __monitor_exit(this);
        return v8;
    label_25:
        try {
            StringBuilder v7_1 = new StringBuilder();
            v7_1.append("kf.aq(");
            v7_1.append(')');
            throw lx.al(((Throwable)v6_1), v7_1.toString());
        }
        catch(Throwable v6) {
        label_40:
            __monitor_exit(this);
            throw v6;
        }
    }

    public void ar() {
        while(true) {
            int v0 = 0x7F2C214C;
            try {
                kj v0_2 = this.ai(v0);
                int v1 = 0xE0A2B6AB;
                if(v0_2 == null) {
                    ju.ax(100);
                    if(this.av(v1)) {
                        return;
                    }

                    this.au(-126);
                    continue;
                }

                if(v0_2.ax * 0xED230479 == 0) {
                    v0_2.ae.al(((int)v0_2.gx), v0_2.al, v0_2.al.length, 102);
                }
                else if(1 == v0_2.ax * 0xA8872C92) {
                    v0_2.al = v0_2.ae.ax(((int)v0_2.gx), 0xA011A490);
                    this.az(v0_2, -36);
                }

                if(this.av(v1)) {
                    return;
                }

                this.aa(-2027139869);
                continue;
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), 0xE6F88944);
                return;
            }
        }
    }

    static void as(int arg3, mr arg4, ki arg5) {
        kj v0 = new kj();
        v0.ax = 0x6FBC25C9;
        v0.gx = ((long)arg3);
        v0.ae = arg4;
        v0.ar = arg5;
        kf.ax.am(v0, 0x89C07587);
        kf.ax.aj(451068296);
    }

    static void at(int arg3, byte[] arg4, mr arg5) {
        kj v0 = new kj();
        v0.ax = 0;
        v0.gx = ((long)arg3);
        v0.al = arg4;
        v0.ae = arg5;
        kf.ax.am(v0, -1960135459);
        kf.ax.aj(0x572838F4);
    }

    void au(byte arg3) {
        __monitor_enter(this);
        try {
            this.ar -= 0xD9C3FE31;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("kf.au(");
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

    public static int av(String arg1, int arg2) {
        try {
            return arg1.length() + 2;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("kf.av(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    boolean av(int arg3) {
        __monitor_enter(this);
        arg3 = 1750375121;
        try {
            if(this.ar * arg3 > 1) {
                goto label_11;
            }

            this.ar = 0;
            this.notifyAll();
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("kf.av(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
        return 1;
    label_11:
        __monitor_exit(this);
        return 0;
    }

    static void aw(int arg3, byte[] arg4, mr arg5) {
        kj v0 = new kj();
        v0.ax = 0;
        v0.gx = ((long)arg3);
        v0.al = arg4;
        v0.ae = arg5;
        kf.ax.am(v0, 0x81FEFBF5);
        kf.ax.aj(0x731EE048);
    }

    static void ax(byte arg10) {
        float v2;
        int v10 = 2000;
        try {
            fq.aq = new int[v10];
            v10 = 0;
            int v0;
            for(v0 = 0xF0; true; v0 += -12) {
                v2 = 360f;
                if(v10 >= 16) {
                    break;
                }

                fq.aq[v10] = ma.ax(((double)((((float)v0)) / v2)), 0.9999, ((double)((((float)v10)) * 0.425f / 16f + 0.075f)));
                ++v10;
            }

            v0 = 0x30;
            while(true) {
            label_27:
                if(v10 >= fq.aq.length) {
                    return;
                }

                int v1 = v10 * 2;
                int v3 = ma.ax(((double)((((float)v0)) / v2)), 0.9999, 0.5);
                while(v10 < v1) {
                    if(v10 >= fq.aq.length) {
                        break;
                    }

                    fq.aq[v10] = v3;
                    ++v10;
                }
            }
        }
        catch(RuntimeException v10_1) {
            goto label_50;
        }

        v0 += -8;
        goto label_27;
        return;
    label_50:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("kf.ax(");
        v0_1.append(')');
        throw lx.al(((Throwable)v10_1), v0_1.toString());
    }

    public void ax() {
        while(true) {
            int v0 = 0x7FE7D2AF;
            try {
                kj v0_2 = this.ai(v0);
                int v1 = 0xE0A2B6AB;
                if(v0_2 == null) {
                    ju.ax(100);
                    if(this.av(v1)) {
                        return;
                    }

                    this.au(-100);
                    continue;
                }

                int v3 = 0xED230479;
                if(v0_2.ax * v3 == 0) {
                    v0_2.ae.al(((int)v0_2.gx), v0_2.al, v0_2.al.length, 110);
                }
                else if(1 == v0_2.ax * v3) {
                    v0_2.al = v0_2.ae.ax(((int)v0_2.gx), -1902498791);
                    this.az(v0_2, 72);
                }

                if(this.av(v1)) {
                    return;
                }

                this.aa(-2054825491);
                continue;
            }
            catch(Exception v0_1) {
                po.ax(null, ((Throwable)v0_1), 0x48CD1467);
                return;
            }
        }
    }

    static void ay(int arg3, byte[] arg4, mr arg5) {
        kj v0 = new kj();
        v0.ax = 0;
        v0.gx = ((long)arg3);
        v0.al = arg4;
        v0.ae = arg5;
        kf.ax.am(v0, 0x843DFDB5);
        kf.ax.aj(0x3547A3EF);
    }

    void az(kj arg2, byte arg3) {
        __monitor_enter(this);
        try {
            this.ae.al(((mx)arg2));
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v3 = new StringBuilder();
                v3.append("kf.az(");
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

    static void ba(int arg8, mr arg9, ki arg10) {
        byte[] v5 = kf.ax.aq(arg8, arg9, -910601188);
        if(v5 != null) {
            arg10.do(arg9, arg8, v5, true, 0x1EF);
            return;
        }

        arg10.do(arg9, arg8, arg9.ax(arg8, -1646365905), true, 0x1EF);
    }

    void bb() {
        __monitor_enter(this);
        try {
            this.ar -= 0xD743571F;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void bc(kj arg2) {
        __monitor_enter(this);
        try {
            this.al.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    static void bd(int arg8, mr arg9, ki arg10) {
        byte[] v5 = kf.ax.aq(arg8, arg9, -910601188);
        if(v5 != null) {
            arg10.do(arg9, arg8, v5, true, 0x1EF);
            return;
        }

        arg10.do(arg9, arg8, arg9.ax(arg8, 0x87CFE0FF), true, 0x1EF);
    }

    void be(kj arg2) {
        __monitor_enter(this);
        try {
            this.ae.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public static void bf() {
        while(true) {
            kj v0 = kf.ax.af(-80);
            if(v0 == null) {
                return;
            }

            v0.ar.do(v0.ae, ((int)v0.gx), v0.al, false, 0x1EF);
        }
    }

    void bg() {
        __monitor_enter(this);
        int v0 = 1666958040;
        try {
            this.ar = v0;
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    void bh() {
        __monitor_enter(this);
        try {
            this.ar -= 0xD9C3FE31;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void bi() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 != 0) {
                this.ar = 0xD9C3FE31;
                try {
                    this.wait();
                }
                catch(InterruptedException ) {
                }
            }
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    void bj(kj arg2) {
        __monitor_enter(this);
        try {
            this.al.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void bk(kj arg2) {
        __monitor_enter(this);
        try {
            this.al.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public static void bl() {
        kf.ax.ah(0x3D33FB02);
    }

    void bm(kj arg2) {
        __monitor_enter(this);
        try {
            this.al.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    kj bn() {
        __monitor_enter(this);
        try {
            __monitor_exit(this);
            return this.ae.an();
        }
        catch(Throwable v0) {
        label_13:
            __monitor_exit(this);
            throw v0;
        }
        catch(Exception v0_1) {
            int v1 = 29682097;
            String v2 = null;
            try {
                po.ax(v2, ((Throwable)v0_1), v1);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            __monitor_exit(this);
            return ((kj)v2);
        }
    }

    kj bo() {
        mx v1_1;
        __monitor_enter(this);
        String v0 = null;
        try {
            v1_1 = this.al.aj();
            goto label_11;
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v1) {
            int v2 = 702080982;
            try {
                po.ax(v0, ((Throwable)v1), v2);
                v1_1 = ((mx)v0);
            }
            catch(Throwable v0_1) {
                goto label_17;
            }

        label_11:
            if(v1_1 == null) {
                __monitor_exit(this);
                return ((kj)v0);
            }

            try {
                ((kj)v1_1).lp();
            }
            catch(Throwable v0_1) {
            label_17:
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
        return ((kj)v1_1);
    }

    kj bp() {
        __monitor_enter(this);
        try {
            __monitor_exit(this);
            return this.ae.an();
        }
        catch(Throwable v0) {
        label_13:
            __monitor_exit(this);
            throw v0;
        }
        catch(Exception v0_1) {
            int v1 = 0x4EF805BB;
            String v2 = null;
            try {
                po.ax(v2, ((Throwable)v0_1), v1);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            __monitor_exit(this);
            return ((kj)v2);
        }
    }

    boolean bq() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 > 1) {
                goto label_11;
            }

            this.ar = 0;
            this.notifyAll();
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
        return 1;
    label_11:
        __monitor_exit(this);
        return 0;
    }

    public static void br() {
        kf.ax.ah(0x3D33FB02);
    }

    void bs(kj arg2) {
        __monitor_enter(this);
        try {
            this.ae.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    kj bt() {
        mx v1_1;
        __monitor_enter(this);
        String v0 = null;
        try {
            v1_1 = this.al.aj();
            goto label_11;
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v1) {
            int v2 = 0x68348330;
            try {
                po.ax(v0, ((Throwable)v1), v2);
                v1_1 = ((mx)v0);
            }
            catch(Throwable v0_1) {
                goto label_17;
            }

        label_11:
            if(v1_1 == null) {
                __monitor_exit(this);
                return ((kj)v0);
            }

            try {
                ((kj)v1_1).lp();
            }
            catch(Throwable v0_1) {
            label_17:
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
        return ((kj)v1_1);
    }

    void bu(kj arg2) {
        __monitor_enter(this);
        try {
            this.ae.al(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    boolean bv() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 > 1) {
                goto label_11;
            }

            this.ar = 0;
            this.notifyAll();
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
        return 1;
    label_11:
        __monitor_exit(this);
        return 0;
    }

    kj bw() {
        __monitor_enter(this);
        try {
            __monitor_exit(this);
            return this.ae.an();
        }
        catch(Throwable v0) {
        label_13:
            __monitor_exit(this);
            throw v0;
        }
        catch(Exception v0_1) {
            int v1 = 0x73F9EB8C;
            String v2 = null;
            try {
                po.ax(v2, ((Throwable)v0_1), v1);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            __monitor_exit(this);
            return ((kj)v2);
        }
    }

    void bx() {
        __monitor_enter(this);
        int v0 = -1807377996;
        try {
            this.ar = v0;
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    kj by() {
        mx v1_1;
        __monitor_enter(this);
        String v0 = null;
        try {
            v1_1 = this.al.aj();
            goto label_11;
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v1) {
            int v2 = -933101094;
            try {
                po.ax(v0, ((Throwable)v1), v2);
                v1_1 = ((mx)v0);
            }
            catch(Throwable v0_1) {
                goto label_17;
            }

        label_11:
            if(v1_1 == null) {
                __monitor_exit(this);
                return ((kj)v0);
            }

            try {
                ((kj)v1_1).lp();
            }
            catch(Throwable v0_1) {
            label_17:
                __monitor_exit(this);
                throw v0_1;
            }
        }

        __monitor_exit(this);
        return ((kj)v1_1);
    }

    void bz() {
        __monitor_enter(this);
        int v0 = 1666958040;
        try {
            this.ar = v0;
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    void ca() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 != 0) {
                this.ar = 0xD9C3FE31;
                try {
                    this.wait();
                }
                catch(InterruptedException ) {
                }
            }
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    void cj() {
        __monitor_enter(this);
        int v0 = 1750375121;
        try {
            if(this.ar * v0 != 0) {
                this.ar = 0xD9C3FE31;
                try {
                    this.wait();
                }
                catch(InterruptedException ) {
                }
            }
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    public void run() {
        while(true) {
            int v0 = 0x7FE97284;
            try {
                kj v0_3 = this.ai(v0);
                int v1 = 0xE0A2B6AB;
                if(v0_3 == null) {
                    ju.ax(100);
                    if(this.av(v1)) {
                        return;
                    }

                    this.au(-44);
                    continue;
                }

                int v3 = 0xED230479;
                if(v0_3.ax * v3 == 0) {
                    v0_3.ae.al(((int)v0_3.gx), v0_3.al, v0_3.al.length, 0x60);
                }
                else if(1 == v0_3.ax * v3) {
                    v0_3.al = v0_3.ae.ax(((int)v0_3.gx), 0x90A4ECFB);
                    this.az(v0_3, 101);
                }

                if(this.av(v1)) {
                    return;
                }

                this.aa(-2023503854);
                continue;
            }
            catch(RuntimeException v0_1) {
            }
            catch(Exception v0_2) {
                String v1_1 = null;
                int v2 = 0xCC34C17E;
                try {
                    po.ax(v1_1, ((Throwable)v0_2), v2);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_2 = new StringBuilder();
                    v1_2.append("kf.run(");
                    v1_2.append(')');
                    throw lx.al(((Throwable)v0_1), v1_2.toString());
                }
            }
        }
    }
}

