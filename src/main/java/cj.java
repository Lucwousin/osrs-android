import java.util.Arrays;

public class cj implements bh {
    int ae;
    ko aj;
    fi al;
    double an;
    int ap;
    int ar;
    bb[] ax;
    public static final int bn = 0x1F;
    static final int bv = 17;
    static ki de;
    static boolean oy;

    public cj(ko arg4, ko arg5, int arg6, double arg7, int arg9) {
        try {
            super();
            this.al = new fi();
            this.ar = 0;
            this.an = 1;
            this.ap = 0x4D00A280;
            this.aj = arg5;
            this.ae = arg6 * 0xF84A8435;
            this.ar = this.ae * 0x5BB04BCD;
            this.an = arg7;
            this.ap = arg9 * 0xE49A0145;
            int[] v5 = arg4.aa(0, 0xCD615AC8);
            arg6 = v5.length;
            this.ax = new bb[arg4.au(0, 1551086418)];
            int v7;
            for(v7 = 0; v7 < arg6; ++v7) {
                this.ax[v5[v7]] = new bb(new lq(arg4.ae(0, v5[v7], 0x78DC0DC9)));
            }
        }
        catch(RuntimeException v4) {
            goto label_46;
        }

        return;
    label_46:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("cj.<init>(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    public int[][] aa() {
        int[][] v0 = new int[this.ax.length][];
        int v1;
        for(v1 = 0; v1 < this.ax.length; ++v1) {
            bb v2 = this.ax[v1];
            if(v2 == null) {
            }
            else if(!v2.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                return null;
            }
            else {
                v0[v1] = Arrays.copyOf(v2.au, v2.au.length);
            }
        }

        return v0;
    }

    public bb ab(int arg2) {
        return this.ax[arg2];
    }

    public int ac() {
        return this.ax.length;
    }

    public bb ad(int arg2) {
        return this.ax[arg2];
    }

    public int[] ae(int arg5, byte arg6) {
        try {
            bb v5_1 = this.ax[arg5];
            if(v5_1 != null) {
                if(v5_1.au != null) {
                    this.al.ae(((mx)v5_1));
                    v5_1.am = true;
                    return v5_1.au;
                }
                else if(v5_1.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                    if(this.ar * 0xCF46BB91 == 0) {
                        this.al.ap().al();
                    }
                    else {
                        this.ar -= 1675060593;
                    }

                    this.al.ae(((mx)v5_1));
                    v5_1.am = true;
                    return v5_1.au;
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("cj.ae(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return null;
    }

    public bb af(int arg2) {
        return this.ax[arg2];
    }

    public int[] ag(int arg6) {
        bb v6 = this.ax[arg6];
        if(v6 != null) {
            if(v6.au != null) {
                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
            else if(v6.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                if(this.ar * 0xCF46BB91 == 0) {
                    this.al.ap().al();
                }
                else {
                    this.ar -= 1675060593;
                }

                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
        }

        return null;
    }

    public int ah(int arg2) {
        if(this.ax[arg2] != null) {
            return this.ax[arg2].an;
        }

        return 0;
    }

    public static ef ai(ko arg0, int arg1, byte arg2) {
        arg2 = -1;
        try {
            if(!jp.ay(arg0, arg1, arg2)) {
                return null;
            }

            return bp.am(arg2);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cj.ai(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[][] ai() {
        int[][] v0 = new int[this.ax.length][];
        int v1;
        for(v1 = 0; v1 < this.ax.length; ++v1) {
            bb v2 = this.ax[v1];
            if(v2 == null) {
            }
            else if(!v2.ax(this.an, this.ap * 0x72C03B05, this.aj)) {
                return null;
            }
            else {
                v0[v1] = Arrays.copyOf(v2.au, v2.au.length);
            }
        }

        return v0;
    }

    public int aj(short arg3) {
        try {
            return this.ax.length;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cj.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ak() {
        return this.ax.length;
    }

    public int[][] al(int arg7) {
        int v0;
        int[][] v7_1;
        try {
            v7_1 = new int[this.ax.length][];
            v0 = 0;
            while(true) {
            label_4:
                if(v0 >= this.ax.length) {
                    return v7_1;
                }

                bb v1 = this.ax[v0];
                if(v1 == null) {
                }
                else if(!v1.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                    return null;
                }
                else {
                    v7_1[v0] = Arrays.copyOf(v1.au, v1.au.length);
                }

                break;
            }
        }
        catch(RuntimeException v7) {
            goto label_30;
        }

        ++v0;
        goto label_4;
        return v7_1;
    label_30:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("cj.al(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7), v0_1.toString());
    }

    public int[] am(int arg6) {
        bb v6 = this.ax[arg6];
        if(v6 != null) {
            if(v6.au != null) {
                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
            else if(v6.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                if(this.ar * 0xCF46BB91 == 0) {
                    this.al.ap().al();
                }
                else {
                    this.ar -= 1675060593;
                }

                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
        }

        return null;
    }

    public boolean an(int arg2, int arg3) {
        try {
            return this.ax[arg2].ap;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cj.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean ao(int arg2) {
        boolean v2 = 0x40 == this.ap * 0x4088698D ? true : false;
        return v2;
    }

    public boolean ap(int arg2, int arg3) {
        arg2 = 0x40;
        arg3 = 0x4088698D;
        try {
            if(arg2 != this.ap * arg3) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cj.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    public bb aq(int arg2) {
        return this.ax[arg2];
    }

    public int ar(int arg2, int arg3) {
        try {
            if(this.ax[arg2] == null) {
                return 0;
            }

            return this.ax[arg2].an;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cj.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 0;
    }

    public boolean as(int arg2) {
        boolean v2 = 0x40 == this.ap * 0xD82B41 ? true : false;
        return v2;
    }

    static final void at(int arg2) {
        try {
            dz.aq(gs.ht, 0x7F05002F);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cj.at(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int at(int arg2) {
        if(this.ax[arg2] != null) {
            return this.ax[arg2].an;
        }

        return 0;
    }

    public int[] au(int arg6) {
        bb v6 = this.ax[arg6];
        if(v6 != null) {
            if(v6.au != null) {
                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
            else if(v6.ax(this.an, this.ap * 0x4088698D, this.aj)) {
                if(this.ar * 0xCF46BB91 == 0) {
                    this.al.ap().al();
                }
                else {
                    this.ar -= 0x567E9B2E;
                }

                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
        }

        return null;
    }

    public int[][] av() {
        int[][] v0 = new int[this.ax.length][];
        int v1;
        for(v1 = 0; v1 < this.ax.length; ++v1) {
            bb v2 = this.ax[v1];
            if(v2 == null) {
            }
            else if(!v2.ax(this.an, this.ap * 824400156, this.aj)) {
                return null;
            }
            else {
                v0[v1] = Arrays.copyOf(v2.au, v2.au.length);
            }
        }

        return v0;
    }

    public boolean aw(int arg2) {
        return this.ax[arg2].ap;
    }

    public bb ax(int arg2, int arg3) {
        try {
            return this.ax[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cj.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean ay(int arg2) {
        return this.ax[arg2].ap;
    }

    public int[] az(int arg6) {
        bb v6 = this.ax[arg6];
        if(v6 != null) {
            if(v6.au != null) {
                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
            else if(v6.ax(this.an, this.ap * 0x3020CDDC, this.aj)) {
                if(this.ar * 0xF74F03B8 == 0) {
                    this.al.ap().al();
                }
                else {
                    this.ar -= 0x110C4693;
                }

                this.al.ae(((mx)v6));
                v6.am = true;
                return v6.au;
            }
        }

        return null;
    }

    void ba(double arg2) {
        try {
            this.an = arg2;
            this.bf(0xBF688096);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cj.ba(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int bd(int arg10) {
        try {
            bb[] v10_1 = this.ax;
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            while(v1 < v10_1.length) {
                bb v4 = v10_1[v1];
                if(v4 != null) {
                    if(v4.aj == null) {
                    }
                    else {
                        v2 += v4.aj.length;
                        int[] v4_1 = v4.aj;
                        int v5 = v3;
                        for(v3 = 0; v3 < v4_1.length; ++v3) {
                            if(this.aj.ap(v4_1[v3], 0x6460DFFB)) {
                                ++v5;
                            }
                        }

                        v3 = v5;
                    }
                }

                ++v1;
            }

            if(v2 == 0) {
                return 0;
            }

            return v3 * 100 / v2;
        }
        catch(RuntimeException v10) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cj.bd(");
            v0.append(')');
            throw lx.al(((Throwable)v10), v0.toString());
        }
    }

    public void bf(int arg3) {
        arg3 = 0;
        try {
            while(arg3 < this.ax.length) {
                if(this.ax[arg3] != null) {
                    this.ax[arg3].al();
                }

                ++arg3;
            }

            this.al = new fi();
            this.ar = this.ae * 0x5BB04BCD;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cj.bf(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bg(int arg4) {
        int v0;
        for(v0 = 0; v0 < this.ax.length; ++v0) {
            bb v1 = this.ax[v0];
            if(v1 != null && v1.af != 0) {
                v1.ae(arg4);
            }
        }
    }

    public void bn(int arg3, byte arg4) {
        int v4 = 0;
        try {
            while(true) {
            label_1:
                if(v4 >= this.ax.length) {
                    return;
                }

                bb v0 = this.ax[v4];
                if(v0 != null && v0.af != 0) {
                    v0.ae(arg3);
                }

                break;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("cj.bn(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }

        ++v4;
        goto label_1;
    }

    public int bo() {
        bb[] v0 = this.ax;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v0.length) {
            bb v5 = v0[v2];
            if(v5 != null) {
                if(v5.aj == null) {
                }
                else {
                    v3 += v5.aj.length;
                    int[] v5_1 = v5.aj;
                    int v6 = v4;
                    for(v4 = 0; v4 < v5_1.length; ++v4) {
                        if(this.aj.ap(v5_1[v4], 0x6460DFFB)) {
                            ++v6;
                        }
                    }

                    v4 = v6;
                }
            }

            ++v2;
        }

        if(v3 == 0) {
            return 0;
        }

        return v4 * 100 / v3;
    }

    public int bp() {
        bb[] v0 = this.ax;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v0.length) {
            bb v5 = v0[v2];
            if(v5 != null) {
                if(v5.aj == null) {
                }
                else {
                    v3 += v5.aj.length;
                    int[] v5_1 = v5.aj;
                    int v6 = v4;
                    for(v4 = 0; v4 < v5_1.length; ++v4) {
                        if(this.aj.ap(v5_1[v4], 0x6460DFFB)) {
                            ++v6;
                        }
                    }

                    v4 = v6;
                }
            }

            ++v2;
        }

        if(v3 == 0) {
            return 0;
        }

        return v4 * 0x2EFB1606 / v3;
    }

    static int bq(int arg8, hl arg9, boolean arg10, byte arg11) {
        int v9_1;
        int[] v8_1;
        byte v10_1;
        int v10 = 0x9521572;
        short v11 = 0x100;
        int v0 = 1304812425;
        if(arg8 != 6200) {
            goto label_35;
        }

        try {
            il.ad -= v10;
            client.qi = ((short)ha.bt(il.aj[il.ad * v0], 0x7FE808B7));
            if(client.qi <= 0) {
                client.qi = v11;
            }

            client.qe = ((short)ha.bt(il.aj[il.ad * v0 + 1], 0x7FCBE499));
            if(client.qe <= 0) {
                client.qe = v11;
            }

            return 1;
        label_35:
            if(6201 == arg8) {
                il.ad -= v10;
                client.qx = ((short)il.aj[il.ad * v0]);
                if(client.qx <= 0) {
                    client.qx = v11;
                }

                client.qf = ((short)il.aj[il.ad * v0 + 1]);
                if(client.qf <= 0) {
                    client.qf = 320;
                }

                return 1;
            }

            v10_1 = 2;
            if(6202 == arg8) {
                il.ad -= 0x12A42AE4;
                client.qp = ((short)il.aj[il.ad * v0]);
                if(client.qp <= 0) {
                    client.qp = 1;
                }

                client.qw = ((short)il.aj[il.ad * v0 + 1]);
                short v9 = 0x7FFF;
                if(client.qw <= 0) {
                    client.qw = v9;
                }
                else if(client.qw < client.qp) {
                    client.qw = client.qp;
                }

                client.qm = ((short)il.aj[il.ad * v0 + v10_1]);
                if(client.qm <= 0) {
                    client.qm = 1;
                }

                client.qu = ((short)il.aj[il.ad * v0 + 3]);
                if(client.qu <= 0) {
                    client.qu = v9;
                }
                else if(client.qu < client.qm) {
                    client.qu = client.qm;
                }

                return 1;
            }

            int v11_1 = 0x4A90AB9;
            if(6203 == arg8) {
                if(client.lt != null) {
                    ao.db(0, 0, client.lt.by * 0x1804E4A5, client.lt.bt * 0x6F0D2CD, false, 31044);
                    v8_1 = il.aj;
                    v9_1 = il.ad + v11_1;
                    il.ad = v9_1;
                    v8_1[v9_1 * v0 - 1] = client.ql * 0xDCCE0B33;
                    v8_1 = il.aj;
                    v9_1 = il.ad + v11_1;
                    il.ad = v9_1;
                    v8_1[v9_1 * v0 - 1] = client.qj * 927018595;
                }
                else {
                    v8_1 = il.aj;
                    v9_1 = il.ad + v11_1;
                    il.ad = v9_1;
                    v8_1[v9_1 * v0 - 1] = -1;
                    v8_1 = il.aj;
                    v9_1 = il.ad + v11_1;
                    il.ad = v9_1;
                    v8_1[v9_1 * v0 - 1] = -1;
                }

                return 1;
            }

            if(6204 == arg8) {
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = client.qx;
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = client.qf;
                return 1;
            }

            if(6205 == arg8) {
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = is.bv(client.qi, 0xA7C01A6E);
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = is.bv(client.qe, 0xB8A6A8F5);
                return 1;
            }

            if(arg8 == 6220) {
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = client.al.adm(0x62BC0979).aq(0x953F2EE7);
                return 1;
            }

            if(arg8 == 6221) {
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = client.al.adm(0x598F2E62).ab(2007878774);
                return 1;
            }

            if(arg8 == 6222) {
                v8_1 = il.aj;
                v9_1 = il.ad + v11_1;
                il.ad = v9_1;
                v8_1[v9_1 * v0 - 1] = client.al.adm(0x2EB36E71).af(0xBB230BAE);
                return 1;
            }

            if(0x184F != arg8) {
                return v10_1;
            }

            v8_1 = il.aj;
            v9_1 = il.ad + v11_1;
            il.ad = v9_1;
            v8_1[v9_1 * v0 - 1] = client.al.adm(1709940331).ai(v10_1);
            return 1;
        label_34:
        }
        catch(RuntimeException v8) {
            goto label_34;
        }

        StringBuilder v9_2 = new StringBuilder();
        v9_2.append("cj.bq(");
        v9_2.append(')');
        throw lx.al(((Throwable)v8), v9_2.toString());
        return v10_1;
    }

    public void bq(int arg4) {
        int v0;
        for(v0 = 0; v0 < this.ax.length; ++v0) {
            bb v1 = this.ax[v0];
            if(v1 != null && v1.af != 0) {
                v1.ae(arg4);
            }
        }
    }

    void bt(double arg1) {
        this.an = arg1;
        this.bf(0x5AECC5C1);
    }

    public void bv() {
        int v0;
        for(v0 = 0; v0 < this.ax.length; ++v0) {
            if(this.ax[v0] != null) {
                this.ax[v0].al();
            }
        }

        this.al = new fi();
        this.ar = this.ae * 0x2B2B8959;
    }

    public int bw() {
        bb[] v0 = this.ax;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v0.length) {
            bb v5 = v0[v2];
            if(v5 != null) {
                if(v5.aj == null) {
                }
                else {
                    v3 += v5.aj.length;
                    int[] v5_1 = v5.aj;
                    int v6 = v4;
                    for(v4 = 0; v4 < v5_1.length; ++v4) {
                        if(this.aj.ap(v5_1[v4], 0x6460DFFB)) {
                            ++v6;
                        }
                    }

                    v4 = v6;
                }
            }

            ++v2;
        }

        if(v3 == 0) {
            return 0;
        }

        return v4 * 100 / v3;
    }

    public void bx(int arg4) {
        int v0;
        for(v0 = 0; v0 < this.ax.length; ++v0) {
            bb v1 = this.ax[v0];
            if(v1 != null && v1.af != 0) {
                v1.ae(arg4);
            }
        }
    }

    void by(double arg1) {
        this.an = arg1;
        this.bf(-1820715138);
    }

    public void bz(int arg4) {
        int v0;
        for(v0 = 0; v0 < this.ax.length; ++v0) {
            bb v1 = this.ax[v0];
            if(v1 != null && v1.af != 0) {
                v1.ae(arg4);
            }
        }
    }

    static final void cr(int arg3) {
        arg3 = 0;
        try {
            while(true) {
            label_1:
                if(arg3 >= client.eg * 359080599) {
                    return;
                }

                ii v0 = client.ev[client.eu[arg3]];
                if(v0 != null) {
                    id.ch(((ie)v0), v0.ax.aj * 0xD6248411, 20);
                }

                break;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("cj.cr(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }

        ++arg3;
        goto label_1;
    }

    static void id(int arg1, int arg2) {
        arg1 *= 2068263909;
        try {
            client.hr = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cj.id(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

