import java.util.zip.CRC32;

public class ki extends ko {
    volatile boolean ac;
    int ak;
    mr ao;
    mr as;
    static final int aw = 200;
    volatile boolean[] ba;
    boolean bd;
    static CRC32 bf;
    int bn;
    int bp;
    int bw;

    static {
        ki.bf = new CRC32();
    }

    public ki(mr arg1, mr arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        try {
            super(arg4, arg5);
            this.ac = false;
            this.bd = false;
            this.bw = 0xB0AA139F;
            this.ao = arg1;
            this.as = arg2;
            this.ak = arg3 * -1251830117;
            this.bd = arg6;
            li.ar(this, this.ak * 0xAF805F93, 0xA2203A16);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ki.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static int af(String arg1, byte arg2) {
        try {
            return arg1.length() + 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ki.af(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void al(int arg2, int arg3) {
        try {
            client.ap(this.ak * 0xAF805F93, arg2, 11);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ki.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    int aq(int arg2, int arg3) {
        try {
            int v0 = 100;
            if(this.ai[arg2] != null) {
                return v0;
            }

            if(this.ba[arg2]) {
                return v0;
            }

            return bc.aj(this.ak * 0xAF805F93, arg2, 0x2DB4B63D);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ki.aq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void av(int arg9, int arg10) {
        try {
            if(this.ao == null || this.ba == null || !this.ba[arg9]) {
                ia.an(this, this.ak * 0xAF805F93, arg9, this.ap[arg9], 2, true, 0x260C9B1C);
            }
            else {
                eg.ad(arg9, this.ao, this, 0x60);
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ki.av(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public static void ax(String[] arg2, short[] arg3, byte arg4) {
        try {
            gn.al(arg2, arg3, 0, arg2.length - 1, 0xED0ACE34);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ki.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    int be(int arg3) {
        int v1 = 100;
        if(this.ai[arg3] != null) {
            return v1;
        }

        if(this.ba[arg3]) {
            return v1;
        }

        return bc.aj(this.ak * 0xAF805F93, arg3, 0x2F4322B1);
    }

    int bl(int arg3) {
        int v1 = 100;
        if(this.ai[arg3] != null) {
            return v1;
        }

        if(this.ba[arg3]) {
            return v1;
        }

        return bc.aj(this.ak * 0xAF805F93, arg3, 0x3FE1FC1E);
    }

    void bo(int arg3) {
        client.ap(this.ak * 0xAF805F93, arg3, 29);
    }

    int bs(int arg3) {
        int v1 = 100;
        if(this.ai[arg3] != null) {
            return v1;
        }

        if(this.ba[arg3]) {
            return v1;
        }

        return bc.aj(this.ak * 0xAF805F93, arg3, -230851697);
    }

    int bu(int arg3) {
        int v1 = 100;
        if(this.ai[arg3] != null) {
            return v1;
        }

        if(this.ba[arg3]) {
            return v1;
        }

        return bc.aj(this.ak * -208119321, arg3, 0x5FD0CE82);
    }

    void by(int arg3) {
        client.ap(this.ak * 0xAF805F93, arg3, -79);
    }

    void cb(int arg10) {
        if(this.ao == null || this.ba == null || !this.ba[arg10]) {
            ia.an(this, this.ak * 1696005176, arg10, this.ap[arg10], 2, true, 0x260C9B1C);
        }
        else {
            eg.ad(arg10, this.ao, this, 0x2F);
        }
    }

    void cy(int arg10) {
        if(this.ao == null || this.ba == null || !this.ba[arg10]) {
            ia.an(this, this.ak * 0xAF805F93, arg10, this.ap[arg10], 2, true, 0x260C9B1C);
        }
        else {
            eg.ad(arg10, this.ao, this, 0x71);
        }
    }

    void da(int arg8, int arg9, byte arg10) {
        arg8 *= 2050460297;
        try {
            this.bn = arg8;
            this.bp = arg9 * -1177267063;
            arg9 = 0xAF805F93;
            if(this.as != null) {
                eg.ad(this.ak * arg9, this.as, this, 94);
            }
            else {
                ia.an(this, 0xFF, this.ak * arg9, this.bn * 0x25610BB9, 0, true, 0x260C9B1C);
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ki.da(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    public boolean dd(int arg2, byte arg3) {
        int v3 = 0x28C00E30;
        try {
            if(this.aa(arg2, v3) == null) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("ki.dd(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    public int dg(int arg4) {
        arg4 = 0;
        int v0 = 0;
        int v1 = 0;
        try {
            while(arg4 < this.ai.length) {
                if(this.ad[arg4] > 0) {
                    v0 += 100;
                    v1 += this.aq(arg4, 1642400485);
                }

                ++arg4;
            }

            arg4 = 100;
            if(v0 == 0) {
                return arg4;
            }

            return v1 * 100 / v0;
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ki.dg(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    public int di(int arg5) {
        try {
            int v0 = 100;
            if(this.ac) {
                return v0;
            }

            int v1 = 99;
            if(this.ai != null) {
                return v1;
            }

            arg5 = bc.aj(0xFF, this.ak * 0xAF805F93, 0xBFE428CE);
            if(arg5 < v0) {
                return arg5;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ki.di(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return 99;
    }

    void do(mr arg11, int arg12, byte[] arg13, boolean arg14, short arg15) {
        int v4;
        int v15;
        try {
            byte v0 = 8;
            int v1 = 0xAF805F93;
            int v2 = 0;
            if(arg11 != this.as) {
                if(!arg14 && this.bw * -400705631 == arg12) {
                    this.ac = true;
                }

                if(arg13 != null) {
                    int v3 = 2;
                    if(arg13.length <= v3) {
                    }
                    else {
                        ki.bf.reset();
                        ki.bf.update(arg13, 0, arg13.length - v3);
                        v15 = ((int)ki.bf.getValue());
                        v4 = (arg13[arg13.length - 1] & 0xFF) + ((arg13[arg13.length - v3] & 0xFF) << 8);
                        if(this.ap[arg12] == v15) {
                            if(this.aj[arg12] != v4) {
                            }
                            else {
                                this.ba[arg12] = true;
                                if(arg14) {
                                    this.ai[arg12] = ha.ab(arg13, false, 0x7F570D8E);
                                }
                                else {
                                }

                                return;
                            }
                        }

                        goto label_139;
                    }
                }

                goto label_155;
            }
            else if(!this.ac) {
                int v11_1 = 0x25610BB9;
                if(arg13 == null) {
                    ia.an(this, 0xFF, this.ak * v1, this.bn * v11_1, 0, true, 0x260C9B1C);
                    return;
                }
                else {
                    ki.bf.reset();
                    ki.bf.update(arg13, 0, arg13.length);
                    if(this.bn * v11_1 != (((int)ki.bf.getValue()))) {
                        ia.an(this, 0xFF, this.ak * v1, this.bn * v11_1, 0, true, 0x260C9B1C);
                        return;
                    }
                    else {
                        lq v14 = new lq(cn.bf(arg13, 28));
                        v15 = v14.ay(-110);
                        v4 = 6;
                        if(v15 != 5) {
                            if(v15 == v4) {
                            }
                            else {
                                StringBuilder v13 = new StringBuilder();
                                v13.append(v15);
                                v13.append(",");
                                v13.append(this.ak * v1);
                                v13.append(",");
                                v13.append(arg12);
                                throw new RuntimeException(v13.toString());
                            }
                        }

                        if(v15 >= v4) {
                            v2 = v14.ac(107);
                        }

                        if(this.bp * 0x818F61B9 != v2) {
                            ia.an(this, 0xFF, this.ak * v1, this.bn * v11_1, 0, true, 0x260C9B1C);
                            return;
                        }

                        this.ax(arg13, 1797696490);
                        this.dq(v0);
                    }
                }
            }
            else {
                throw new RuntimeException();
            }

            return;
        label_139:
            this.ba[arg12] = false;
            if((this.bd) || (arg14)) {
                ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
            }

            return;
        label_155:
            this.ba[arg12] = false;
            if((this.bd) || (arg14)) {
                ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ki.do(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    void dq(byte arg4) {
        try {
            this.ba = new boolean[this.ai.length];
            int v4_1 = 0;
            int v0;
            for(v0 = 0; v0 < this.ba.length; ++v0) {
                this.ba[v0] = false;
            }

            if(this.ao == null) {
                this.ac = true;
                return;
            }

            this.bw = 0xB0AA139F;
            while(v4_1 < this.ba.length) {
                if(this.ad[v4_1] > 0) {
                    id.ap(v4_1, this.ao, this, 0x2A66D640);
                    this.bw = 0x4F55EC61 * v4_1;
                }

                ++v4_1;
            }

            if(-1 == this.bw * -400705631) {
                this.ac = true;
            }
        }
        catch(RuntimeException v4) {
            goto label_43;
        }

        return;
    label_43:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ki.dq(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4), v0_1.toString());
    }

    public boolean dt(int arg2, int arg3) {
        try {
            return this.ba[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ki.dt(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean dx(byte arg3) {
        try {
            return this.ac;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ki.dx(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void dz(int arg3, byte[] arg4, boolean arg5, boolean arg6, int arg7) {
        byte v7 = 14;
        if(arg5) {
            try {
                if(!this.ac) {
                    if(this.as != null) {
                        cx.an(this.ak * 0xAF805F93, arg4, this.as, v7);
                    }

                    this.ax(arg4, -850206884);
                    this.dq(4);
                }
                else {
                    throw new RuntimeException();
                label_19:
                    arg4[arg4.length - 2] = ((byte)(this.aj[arg3] >> 8));
                    arg4[arg4.length - 1] = ((byte)this.aj[arg3]);
                    if(this.ao != null) {
                        cx.an(arg3, arg4, this.ao, v7);
                        this.ba[arg3] = true;
                    }

                    if(!arg6) {
                        return;
                    }

                    this.ai[arg3] = ha.ab(arg4, false, 0x7F31DB69);
                }
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("ki.dz(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }
        }
        else {
            goto label_19;
        }
    }

    public int ea() {
        int v1 = 100;
        if(this.ac) {
            return v1;
        }

        int v2 = 99;
        if(this.ai != null) {
            return v2;
        }

        int v0 = bc.aj(0xFF, this.ak * 0xAF805F93, 0x42B300B5);
        if(v0 >= v1) {
            v0 = 99;
        }

        return v0;
    }

    public boolean eb(int arg2) {
        return this.ba[arg2];
    }

    public int ec() {
        int v0 = 0;
        int v1 = 0;
        int v2 = 0;
        while(v0 < this.ai.length) {
            if(this.ad[v0] > 0) {
                v1 += 100;
                v2 += this.aq(v0, 0x4CB603C6);
            }

            ++v0;
        }

        v0 = 100;
        if(v1 == 0) {
            return v0;
        }

        return v2 * 100 / v1;
    }

    public boolean ed(int arg2) {
        return this.ba[arg2];
    }

    public boolean ee(int arg2) {
        return this.ba[arg2];
    }

    void eg() {
        this.ba = new boolean[this.ai.length];
        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.ba.length; ++v1) {
            this.ba[v1] = false;
        }

        if(this.ao == null) {
            this.ac = true;
            return;
        }

        this.bw = 0xB0AA139F;
        while(v0 < this.ba.length) {
            if(this.ad[v0] > 0) {
                id.ap(v0, this.ao, this, 0x2A66D640);
                this.bw = 0x4F55EC61 * v0;
            }

            ++v0;
        }

        if(-1 == this.bw * -400705631) {
            this.ac = true;
        }
    }

    public boolean eh(int arg2) {
        boolean v2 = this.aa(arg2, 0x6BCCC609) != null ? true : false;
        return v2;
    }

    void ej(int arg9, int arg10) {
        this.bn = arg9 * 2050460297;
        this.bp = arg10 * -1177267063;
        arg10 = 0xAF805F93;
        if(this.as != null) {
            eg.ad(this.ak * arg10, this.as, this, 0x40);
        }
        else {
            ia.an(this, 0xFF, this.ak * arg10, this.bn * 0x25610BB9, 0, true, 0x260C9B1C);
        }
    }

    public boolean ek() {
        return this.ac;
    }

    void el(mr arg11, int arg12, byte[] arg13, boolean arg14) {
        int v3;
        int v0;
        int v1 = 0xAF805F93;
        int v2 = 0;
        if(arg11 != this.as) {
            if(!arg14 && this.bw * 0xE8CCE349 == arg12) {
                this.ac = true;
            }

            if(arg13 != null) {
                v3 = 2;
                if(arg13.length <= v3) {
                }
                else {
                    ki.bf.reset();
                    ki.bf.update(arg13, 0, arg13.length - v3);
                    v0 = ((int)ki.bf.getValue());
                    int v4 = (arg13[arg13.length - 1] & -1009966558) + ((arg13[arg13.length - v3] & 0xFF) << 8);
                    if(this.ap[arg12] == v0) {
                        if(this.aj[arg12] != v4) {
                        }
                        else {
                            this.ba[arg12] = true;
                            if(arg14) {
                                this.ai[arg12] = ha.ab(arg13, false, 0x7F376DF7);
                            }
                            else {
                            }

                            return;
                        }
                    }

                    goto label_144;
                }
            }

            goto label_160;
        }
        else if(!this.ac) {
            int v11 = 0x25610BB9;
            if(arg13 == null) {
                ia.an(this, 0xFF, this.ak * 0xBC0A70D0, this.bn * v11, 0, true, 0x260C9B1C);
                return;
            }
            else {
                ki.bf.reset();
                ki.bf.update(arg13, 0, arg13.length);
                if(this.bn * v11 != (((int)ki.bf.getValue()))) {
                    ia.an(this, 0x627E53B9, this.ak * v1, this.bn * -343309540, 0, true, 0x260C9B1C);
                    return;
                }
                else {
                    lq v14 = new lq(cn.bf(arg13, 55));
                    v0 = v14.ay(-114);
                    v3 = 6;
                    if(v0 != 5) {
                        if(v0 == v3) {
                        }
                        else {
                            StringBuilder v13 = new StringBuilder();
                            v13.append(v0);
                            v13.append(",");
                            v13.append(this.ak * 0x223BA573);
                            v13.append(",");
                            v13.append(arg12);
                            throw new RuntimeException(v13.toString());
                        }
                    }

                    if(v0 >= v3) {
                        v2 = v14.ac(61);
                    }

                    if(this.bp * 0x818F61B9 != v2) {
                        ia.an(this, 0xFF, this.ak * 0xE161E364, this.bn * v11, 0, true, 0x260C9B1C);
                        return;
                    }

                    this.ax(arg13, 0xCD610C17);
                    this.dq(52);
                }
            }
        }
        else {
            throw new RuntimeException();
        }

        return;
    label_144:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }

        return;
    label_160:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * 694707670, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }
    }

    void em(int arg9, int arg10) {
        this.bn = arg9 * 2050460297;
        this.bp = arg10 * -1177267063;
        arg10 = 0xAF805F93;
        if(this.as != null) {
            eg.ad(this.ak * arg10, this.as, this, 14);
        }
        else {
            ia.an(this, 0xFF, this.ak * arg10, this.bn * 0x25610BB9, 0, true, 0x260C9B1C);
        }
    }

    void en(int arg4, byte[] arg5, boolean arg6, boolean arg7) {
        byte v0 = 14;
        if(!arg6) {
            arg5[arg5.length - 2] = ((byte)(this.aj[arg4] >> 8));
            arg5[arg5.length - 1] = ((byte)this.aj[arg4]);
            if(this.ao != null) {
                cx.an(arg4, arg5, this.ao, v0);
                this.ba[arg4] = true;
            }

            if(!arg7) {
                return;
            }

            this.ai[arg4] = ha.ab(arg5, false, 0x7FA67343);
        }
        else if(!this.ac) {
            if(this.as != null) {
                cx.an(this.ak * 0x90B6624F, arg5, this.as, v0);
            }

            this.ax(arg5, 0x2181D7F6);
            this.dq(45);
        }
        else {
            throw new RuntimeException();
        }
    }

    public int eq() {
        if(this.ac) {
            return -1320458328;
        }

        if(this.ai != null) {
            return 99;
        }

        int v0 = bc.aj(0x328E6780, this.ak * 0xA6663E21, -1318640264);
        if(v0 >= 0x90A7AD22) {
            v0 = 0x989CC512;
        }

        return v0;
    }

    public int er() {
        int v1 = 100;
        if(this.ac) {
            return v1;
        }

        int v2 = 99;
        if(this.ai != null) {
            return v2;
        }

        int v0 = bc.aj(0xFF, this.ak * 0xAF805F93, -1084050311);
        if(v0 >= v1) {
            v0 = 99;
        }

        return v0;
    }

    public boolean es(int arg2) {
        return this.ba[arg2];
    }

    public boolean eu(int arg2) {
        return this.ba[arg2];
    }

    void ev(mr arg11, int arg12, byte[] arg13, boolean arg14) {
        int v3;
        int v1 = 0xAF805F93;
        int v2 = 0;
        if(arg11 != this.as) {
            if(!arg14 && this.bw * 2043380676 == arg12) {
                this.ac = true;
            }

            if(arg13 != null) {
                v3 = 2;
                if(arg13.length <= v3) {
                }
                else {
                    ki.bf.reset();
                    ki.bf.update(arg13, 0, arg13.length - v3);
                    int v0 = ((int)ki.bf.getValue());
                    int v4 = (arg13[arg13.length - 1] & 0xFF) + ((arg13[arg13.length - v3] & 0xFF) << 8);
                    if(this.ap[arg12] == v0) {
                        if(this.aj[arg12] != v4) {
                        }
                        else {
                            this.ba[arg12] = true;
                            if(arg14) {
                                this.ai[arg12] = ha.ab(arg13, false, 0x7F2CE952);
                            }
                            else {
                            }

                            return;
                        }
                    }

                    goto label_143;
                }
            }

            goto label_159;
        }
        else if(!this.ac) {
            int v11 = 0x25610BB9;
            if(arg13 == null) {
                ia.an(this, 0xF8E910C2, this.ak * v1, this.bn * v11, 0, true, 0x260C9B1C);
                return;
            }
            else {
                ki.bf.reset();
                ki.bf.update(arg13, 0, arg13.length);
                if(this.bn * 1242806160 != (((int)ki.bf.getValue()))) {
                    ia.an(this, 0xFF, this.ak * 0x15640503, this.bn * v11, 0, true, 0x260C9B1C);
                    return;
                }
                else {
                    lq v11_1 = new lq(cn.bf(arg13, 0x70));
                    int v14 = v11_1.ay(-89);
                    v3 = 6;
                    if(v14 != 5) {
                        if(v14 == v3) {
                        }
                        else {
                            StringBuilder v13 = new StringBuilder();
                            v13.append(v14);
                            v13.append(",");
                            v13.append(this.ak * 0xB95A444C);
                            v13.append(",");
                            v13.append(arg12);
                            throw new RuntimeException(v13.toString());
                        }
                    }

                    if(v14 >= v3) {
                        v2 = v11_1.ac(11);
                    }

                    if(this.bp * 0x818F61B9 != v2) {
                        ia.an(this, 0xFF, this.ak * v1, this.bn * 380285708, 0, true, 0x260C9B1C);
                        return;
                    }

                    this.ax(arg13, 0x1F824BD3);
                    this.dq(59);
                }
            }
        }
        else {
            throw new RuntimeException();
        }

        return;
    label_143:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }

        return;
    label_159:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * 0x4E0F6C36, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }
    }

    void ew(mr arg11, int arg12, byte[] arg13, boolean arg14) {
        int v4;
        int v0;
        int v1 = 0xAF805F93;
        int v2 = 0;
        if(arg11 != this.as) {
            if(!arg14 && this.bw * -400705631 == arg12) {
                this.ac = true;
            }

            if(arg13 != null) {
                int v3 = 2;
                if(arg13.length <= v3) {
                }
                else {
                    ki.bf.reset();
                    ki.bf.update(arg13, 0, arg13.length - v3);
                    v0 = ((int)ki.bf.getValue());
                    v4 = (arg13[arg13.length - 1] & 0xFF) + ((arg13[arg13.length - v3] & 0xFF) << 8);
                    if(this.ap[arg12] == v0) {
                        if(this.aj[arg12] != v4) {
                        }
                        else {
                            this.ba[arg12] = true;
                            if(arg14) {
                                this.ai[arg12] = ha.ab(arg13, false, 0x7F9DE1DB);
                            }
                            else {
                            }

                            return;
                        }
                    }

                    goto label_139;
                }
            }

            goto label_155;
        }
        else if(!this.ac) {
            int v11 = 0x25610BB9;
            if(arg13 == null) {
                ia.an(this, 0xFF, this.ak * v1, this.bn * v11, 0, true, 0x260C9B1C);
                return;
            }
            else {
                ki.bf.reset();
                ki.bf.update(arg13, 0, arg13.length);
                if(this.bn * v11 != (((int)ki.bf.getValue()))) {
                    ia.an(this, 0xFF, this.ak * v1, this.bn * v11, 0, true, 0x260C9B1C);
                    return;
                }
                else {
                    lq v14 = new lq(cn.bf(arg13, -42));
                    v0 = v14.ay(-109);
                    v4 = 6;
                    if(v0 != 5) {
                        if(v0 == v4) {
                        }
                        else {
                            StringBuilder v13 = new StringBuilder();
                            v13.append(v0);
                            v13.append(",");
                            v13.append(this.ak * v1);
                            v13.append(",");
                            v13.append(arg12);
                            throw new RuntimeException(v13.toString());
                        }
                    }

                    if(v0 >= v4) {
                        v2 = v14.ac(91);
                    }

                    if(this.bp * 0x818F61B9 != v2) {
                        ia.an(this, 0xFF, this.ak * v1, this.bn * v11, 0, true, 0x260C9B1C);
                        return;
                    }

                    this.ax(arg13, 0xE4C93EF3);
                    this.dq(76);
                }
            }
        }
        else {
            throw new RuntimeException();
        }

        return;
    label_139:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }

        return;
    label_155:
        this.ba[arg12] = false;
        if((this.bd) || (arg14)) {
            ia.an(this, this.ak * v1, arg12, this.ap[arg12], 2, arg14, 0x260C9B1C);
        }
    }

    void ey(int arg9, int arg10) {
        this.bn = arg9 * 2050460297;
        this.bp = arg10 * -1177267063;
        if(this.as != null) {
            eg.ad(this.ak * 0x3AA44254, this.as, this, 0x20);
        }
        else {
            ia.an(this, 0x9F11DECB, this.ak * 0xAF805F93, this.bn * 0x81215597, 0, true, 0x260C9B1C);
        }
    }

    public boolean ez() {
        return this.ac;
    }
}

