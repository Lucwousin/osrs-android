import java.util.LinkedList;

public abstract class ck {
    boolean aa;
    short[][][] ab;
    int ad;
    int ae;
    byte[][][] af;
    byte[][][] ai;
    int aj;
    int al;
    int an;
    int ap;
    short[][][] aq;
    int ar;
    boolean au;
    du[][][][] av;
    int ax;
    static ki dy = null;
    static final int jr = 2;

    ck() {
        try {
            super();
            this.aj = 0x7EF97375;
            this.ad = 0x89B94705;
            new LinkedList();
            this.aa = false;
            this.au = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ck.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    int aa(short arg3) {
        try {
            return this.ar * 0x82A1F09D;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ck.aa(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ab(int arg7, int arg8, lq arg9, byte arg10) {
        arg10 = -28;
        try {
            int v4 = arg9.ay(arg10);
            if(v4 == 0) {
                return;
            }

            if((v4 & 1) != 0) {
                this.af(arg7, arg8, arg9, v4, 108);
            }
            else {
                this.ai(arg7, arg8, arg9, v4, 87);
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("ck.ab(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    void ac(ko arg4) {
        if(this.aj(0x49133496)) {
            return;
        }

        byte[] v4 = arg4.ae(this.aj * -1841530077, this.ad * 0xB71E9233, 0x78DC0DC9);
        if(v4 != null) {
            this.al(new lq(v4), 0xF4069F0C);
            this.aa = true;
            this.au = true;
        }
    }

    static void ad(lq arg5, long arg6) {
        long v0 = 10;
        try {
            arg6 /= v0;
            v0 = 0xFFFF;
            long v2 = 0;
            if(arg6 < v2) {
                arg6 = v2;
            }
            else if(arg6 > v0) {
                arg6 = v0;
            }

            arg5.an(((int)arg6), 0x4A733205);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ck.ad(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void ad(int arg3) {
        du[][][][] v3 = null;
        try {
            this.aq = ((short[][][])v3);
            this.ab = ((short[][][])v3);
            this.af = ((byte[][][])v3);
            this.ai = ((byte[][][])v3);
            this.av = v3;
            this.aa = false;
            this.au = false;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ck.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void af(int arg2, int arg3, lq arg4, int arg5, byte arg6) {
        arg5 = (arg5 & 2) != 0 ? 1 : 0;
        if(arg5 != 0) {
            try {
                this.ab[0][arg2][arg3] = ((short)arg4.ay(-45));
            label_17:
                this.aq[0][arg2][arg3] = ((short)arg4.ay(-117));
                return;
            label_16:
                goto label_25;
            }
            catch(RuntimeException v2) {
                goto label_16;
            }
        }

        goto label_17;
    label_25:
        StringBuilder v3 = new StringBuilder();
        v3.append("ck.af(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    boolean ag() {
        boolean v0 = !this.aa || !this.au ? false : true;
        return v0;
    }

    void ah() {
        this.aq = null;
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.av = null;
        this.aa = false;
        this.au = false;
    }

    void ai(int arg9, int arg10, lq arg11, int arg12, byte arg13) {
        int v0 = 1;
        int v13 = ((arg12 & 24) >> 3) + 1;
        int v1 = (arg12 & 2) != 0 ? 1 : 0;
        if((arg12 & 4) != 0) {
        }
        else {
            v0 = 0;
        }

        try {
            this.aq[0][arg9][arg10] = ((short)arg11.ay(-65));
            if(v1 != 0) {
                arg12 = arg11.ay(-38);
                for(v1 = 0; v1 < arg12; ++v1) {
                    int v3 = arg11.ay(-46);
                    if(v3 != 0) {
                        this.ab[v1][arg9][arg10] = ((short)v3);
                        v3 = arg11.ay(-53);
                        this.af[v1][arg9][arg10] = ((byte)(v3 >> 2));
                        this.ai[v1][arg9][arg10] = ((byte)(v3 & 3));
                    }
                }
            }

            if(v0 != 0) {
                arg12 = 0;
                while(true) {
                label_52:
                    if(arg12 < v13) {
                        v0 = arg11.ay(-119);
                        if(v0 == 0) {
                        }
                        else {
                            du[][] v1_1 = this.av[arg12][arg9];
                            du[] v3_1 = new du[v0];
                            v1_1[arg10] = v3_1;
                            v1 = 0;
                            while(true) {
                                if(v1 < v0) {
                                    int v4 = arg11.bq(-1645507797);
                                    int v5 = arg11.ay(-60);
                                    v3_1[v1] = new du(v4, v5 >> 2, v5 & 3);
                                    ++v1;
                                    continue;
                                }

                                goto label_75;
                            }
                        }

                        goto label_75;
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v9) {
            goto label_80;
        }

    label_75:
        ++arg12;
        goto label_52;
    label_80:
        StringBuilder v10 = new StringBuilder();
        v10.append("ck.ai(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }

    boolean aj(int arg3) {
        try {
            if(!this.aa) {
                return false;
            }
            else if(!this.au) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ck.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    void ak(ko arg4) {
        if(this.aj(0x6300D0C5)) {
            return;
        }

        byte[] v4 = arg4.ae(this.aj * -1841530077, this.ad * 0x9CC02946, 0x78DC0DC9);
        if(v4 != null) {
            this.al(new lq(v4), 0xBC290641);
            this.aa = true;
            this.au = true;
        }
    }

    abstract void al(lq arg1, int arg2);

    boolean am() {
        boolean v0 = !this.aa || !this.au ? false : true;
        return v0;
    }

    void ao(ko arg4) {
        if(this.aj(0x476AA8BA)) {
            return;
        }

        byte[] v4 = arg4.ae(this.aj * -1841530077, this.ad * 0x1FEB81B8, 0x78DC0DC9);
        if(v4 != null) {
            this.al(new lq(v4), 0x26AAB4DC);
            this.aa = true;
            this.au = true;
        }
    }

    abstract void ap(lq arg1);

    void aq(ko arg3, int arg4) {
        arg4 = 946100967;
        try {
            if(this.aj(arg4)) {
                return;
            }

            byte[] v3_1 = arg3.ae(this.aj * -1841530077, this.ad * 0xB71E9233, 0x78DC0DC9);
            if(v3_1 != null) {
                this.al(new lq(v3_1), 0xAE9DF9DF);
                this.aa = true;
                this.au = true;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ck.aq(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void as(ko arg4) {
        if(this.aj(0x4581F1FF)) {
            return;
        }

        byte[] v4 = arg4.ae(this.aj * 2058902460, this.ad * 0xB71E9233, 0x78DC0DC9);
        if(v4 != null) {
            this.al(new lq(v4), 0x85C3F3F4);
            this.aa = true;
            this.au = true;
        }
    }

    void at() {
        this.aq = null;
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.av = null;
        this.aa = false;
        this.au = false;
    }

    boolean au() {
        boolean v0 = !this.aa || !this.au ? false : true;
        return v0;
    }

    int av(int arg3) {
        arg3 = 0xF5C1A1F;
        try {
            return this.ae * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ck.av(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aw() {
        this.aq = null;
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.av = null;
        this.aa = false;
        this.au = false;
    }

    static pf[] ax(int arg2) {
        arg2 = 3;
        try {
            pf[] v2_1 = new pf[arg2];
            v2_1[0] = pf.al;
            v2_1[1] = pf.ax;
            v2_1[2] = pf.ae;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ck.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    void ay() {
        this.aq = null;
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.av = null;
        this.aa = false;
        this.au = false;
    }

    boolean az() {
        boolean v0 = !this.aa || !this.au ? false : true;
        return v0;
    }

    void ba(int arg8, int arg9, lq arg10) {
        int v5 = arg10.ay(-82);
        if(v5 == 0) {
            return;
        }

        if((v5 & 1) != 0) {
            this.af(arg8, arg9, arg10, v5, 101);
        }
        else {
            this.ai(arg8, arg9, arg10, v5, 38);
        }
    }

    void bd(int arg8, int arg9, lq arg10) {
        int v5 = arg10.ay(-103);
        if(v5 == 0) {
            return;
        }

        if((v5 & 1) != 0) {
            this.af(arg8, arg9, arg10, v5, 107);
        }
        else {
            this.ai(arg8, arg9, arg10, v5, 0x20);
        }
    }

    void bf(int arg8, int arg9, lq arg10) {
        int v5 = arg10.ay(-23);
        if(v5 == 0) {
            return;
        }

        if((v5 & 1) != 0) {
            this.af(arg8, arg9, arg10, v5, 0x76);
        }
        else {
            this.ai(arg8, arg9, arg10, v5, 93);
        }
    }

    void bg(int arg10, int arg11, lq arg12, int arg13) {
        int v1 = 1;
        int v0 = ((arg13 & 24) >> 3) + 1;
        int v2 = (arg13 & 2) != 0 ? 1 : 0;
        if((arg13 & 4) != 0) {
        }
        else {
            v1 = 0;
        }

        this.aq[0][arg10][arg11] = ((short)arg12.ay(-100));
        if(v2 != 0) {
            arg13 = arg12.ay(-13);
            for(v2 = 0; v2 < arg13; ++v2) {
                int v4 = arg12.ay(-120);
                if(v4 != 0) {
                    this.ab[v2][arg10][arg11] = ((short)v4);
                    v4 = arg12.ay(-114);
                    this.af[v2][arg10][arg11] = ((byte)(v4 >> 2));
                    this.ai[v2][arg10][arg11] = ((byte)(v4 & 3));
                }
            }
        }

        if(v1 != 0) {
            for(arg13 = 0; arg13 < v0; ++arg13) {
                v1 = arg12.ay(-73);
                if(v1 == 0) {
                }
                else {
                    du[][] v2_1 = this.av[arg13][arg10];
                    du[] v4_1 = new du[v1];
                    v2_1[arg11] = v4_1;
                    for(v2 = 0; v2 < v1; ++v2) {
                        int v5 = arg12.bq(0xF3342BA2);
                        int v6 = arg12.ay(-21);
                        v4_1[v2] = new du(v5, v6 >> 2, v6 & 3);
                    }
                }
            }
        }
    }

    void bn(int arg8, int arg9, lq arg10) {
        int v5 = arg10.ay(-55);
        if(v5 == 0) {
            return;
        }

        if((v5 & 1) != 0) {
            this.af(arg8, arg9, arg10, v5, 103);
        }
        else {
            this.ai(arg8, arg9, arg10, v5, 27);
        }
    }

    void bo(int arg3, int arg4, lq arg5, int arg6) {
        arg6 = (arg6 & 2) != 0 ? 1 : 0;
        if(arg6 != 0) {
            this.ab[0][arg3][arg4] = ((short)arg5.ay(-113));
        }

        this.aq[0][arg3][arg4] = ((short)arg5.ay(-35));
    }

    void bp(int arg3, int arg4, lq arg5, int arg6) {
        arg6 = (arg6 & 2) != 0 ? 1 : 0;
        if(arg6 != 0) {
            this.ab[0][arg3][arg4] = ((short)arg5.ay(-119));
        }

        this.aq[0][arg3][arg4] = ((short)arg5.ay(-93));
    }

    void bq(int arg10, int arg11, lq arg12, int arg13) {
        int v1 = 1;
        int v0 = ((arg13 & 24) >> 3) + 1;
        int v2 = (arg13 & 2) != 0 ? 1 : 0;
        if((arg13 & 4) != 0) {
        }
        else {
            v1 = 0;
        }

        this.aq[0][arg10][arg11] = ((short)arg12.ay(-77));
        if(v2 != 0) {
            arg13 = arg12.ay(-107);
            for(v2 = 0; v2 < arg13; ++v2) {
                int v4 = arg12.ay(-118);
                if(v4 != 0) {
                    this.ab[v2][arg10][arg11] = ((short)v4);
                    v4 = arg12.ay(-36);
                    this.af[v2][arg10][arg11] = ((byte)(v4 >> 2));
                    this.ai[v2][arg10][arg11] = ((byte)(v4 & 3));
                }
            }
        }

        if(v1 != 0) {
            for(arg13 = 0; arg13 < v0; ++arg13) {
                v1 = arg12.ay(-32);
                if(v1 == 0) {
                }
                else {
                    du[][] v2_1 = this.av[arg13][arg10];
                    du[] v4_1 = new du[v1];
                    v2_1[arg11] = v4_1;
                    for(v2 = 0; v2 < v1; ++v2) {
                        int v5 = arg12.bq(0xEB2B22E3);
                        int v6 = arg12.ay(-106);
                        v4_1[v2] = new du(v5, v6 >> 2, v6 & 3);
                    }
                }
            }
        }
    }

    static void br(int arg8, byte arg9) {
        int v9 = -1;
        if(arg8 == v9) {
            try {
                if(!client.po) {
                    gb.an(-279037700);
                }
                else {
                label_9:
                    if(v9 != arg8 && arg8 != client.pm * 2029067435) {
                        int v0 = 0x3310F9D5;
                        if(client.pc * v0 != 0 && !client.po) {
                            er.aj(2, gn.dv, arg8, 0, client.pc * v0, false, 2090764498);
                        }
                    }
                }

            label_29:
                client.pm = arg8 * 0x9A31FE03;
                return;
            label_8:
                goto label_33;
            }
            catch(RuntimeException v8) {
                goto label_8;
            }
        }
        else {
            goto label_9;
        }

        goto label_29;
    label_33:
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("ck.br(");
        v9_1.append(')');
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    void bt(int arg3, int arg4, lq arg5, int arg6) {
        arg6 = (arg6 & 2) != 0 ? 1 : 0;
        if(arg6 != 0) {
            this.ab[0][arg3][arg4] = ((short)arg5.ay(-23));
        }

        this.aq[0][arg3][arg4] = ((short)arg5.ay(-116));
    }

    void bv(int arg10, int arg11, lq arg12, int arg13) {
        int v1 = 1;
        int v0 = ((arg13 & 24) >> 3) + 1;
        int v2 = (arg13 & 2) != 0 ? 1 : 0;
        if((arg13 & 4) != 0) {
        }
        else {
            v1 = 0;
        }

        this.aq[0][arg10][arg11] = ((short)arg12.ay(-72));
        if(v2 != 0) {
            arg13 = arg12.ay(-71);
            for(v2 = 0; v2 < arg13; ++v2) {
                int v4 = arg12.ay(-122);
                if(v4 != 0) {
                    this.ab[v2][arg10][arg11] = ((short)v4);
                    v4 = arg12.ay(-107);
                    this.af[v2][arg10][arg11] = ((byte)(v4 >> 2));
                    this.ai[v2][arg10][arg11] = ((byte)(v4 & 3));
                }
            }
        }

        if(v1 != 0) {
            for(arg13 = 0; arg13 < v0; ++arg13) {
                v1 = arg12.ay(-84);
                if(v1 == 0) {
                }
                else {
                    du[][] v2_1 = this.av[arg13][arg10];
                    du[] v4_1 = new du[v1];
                    v2_1[arg11] = v4_1;
                    for(v2 = 0; v2 < v1; ++v2) {
                        int v5 = arg12.bq(0xF1FF5694);
                        int v6 = arg12.ay(-91);
                        v4_1[v2] = new du(v5, v6 >> 2, v6 & 3);
                    }
                }
            }
        }
    }

    void bw(int arg3, int arg4, lq arg5, int arg6) {
        arg6 = (arg6 & 2) != 0 ? 1 : 0;
        if(arg6 != 0) {
            this.ab[0][arg3][arg4] = ((short)arg5.ay(-108));
        }

        this.aq[0][arg3][arg4] = ((short)arg5.ay(-11));
    }

    void bx(int arg10, int arg11, lq arg12, int arg13) {
        int v1 = 1;
        int v0 = ((arg13 & 24) >> 3) + 1;
        int v2 = (arg13 & 2) != 0 ? 1 : 0;
        if((arg13 & 4) != 0) {
        }
        else {
            v1 = 0;
        }

        this.aq[0][arg10][arg11] = ((short)arg12.ay(-4));
        if(v2 != 0) {
            arg13 = arg12.ay(-44);
            for(v2 = 0; v2 < arg13; ++v2) {
                int v4 = arg12.ay(-96);
                if(v4 != 0) {
                    this.ab[v2][arg10][arg11] = ((short)v4);
                    v4 = arg12.ay(-67);
                    this.af[v2][arg10][arg11] = ((byte)(v4 >> 2));
                    this.ai[v2][arg10][arg11] = ((byte)(v4 & 3));
                }
            }
        }

        if(v1 != 0) {
            for(arg13 = 0; arg13 < v0; ++arg13) {
                v1 = arg12.ay(-88);
                if(v1 == 0) {
                }
                else {
                    du[][] v2_1 = this.av[arg13][arg10];
                    du[] v4_1 = new du[v1];
                    v2_1[arg11] = v4_1;
                    for(v2 = 0; v2 < v1; ++v2) {
                        int v5 = arg12.bq(0x96A5D791);
                        int v6 = arg12.ay(-83);
                        v4_1[v2] = new du(v5, v6 >> 2, v6 & 3);
                    }
                }
            }
        }
    }

    void by(int arg3, int arg4, lq arg5, int arg6) {
        arg6 = (arg6 & 2) != 0 ? 1 : 0;
        if(arg6 != 0) {
            this.ab[0][arg3][arg4] = ((short)arg5.ay(-106));
        }

        this.aq[0][arg3][arg4] = ((short)arg5.ay(-63));
    }

    int bz() {
        return this.ar * 0x82A1F09D;
    }

    static void fc(int arg2, int arg3, byte arg4) {
        try {
            na v4 = cd.al(nf.bd, client.eh.an, 0x82062B36);
            v4.ae.ce(arg2, 0xDDCA1B82);
            v4.ae.an(arg3, 1950790567);
            client.eh.ae(v4, 0xFF030DB9);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ck.fc(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static ar ge(ar arg1, byte arg2) {
        ar v2_1;
        int v2 = -2036249895;
        try {
            v2_1 = az.ib(arg1, v2);
            if(v2_1 == null) {
                v2_1 = arg1.dg;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("ck.ge(");
            v2_2.append(')');
            throw lx.al(((Throwable)v1), v2_2.toString());
        }

        return v2_1;
    }
}

