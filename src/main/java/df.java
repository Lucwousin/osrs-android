import java.util.Collection;

public class df extends mv {
    public int aa;
    public int ab;
    public int[] ad;
    static ko ae = null;
    int[] af;
    public int ag;
    public int ah;
    public boolean ai;
    int[] aj;
    static ko al = null;
    public int am;
    static gk an = null;
    public int[] ap;
    public int[] aq;
    static gk ar = null;
    public int au;
    public int av;
    static ko ax = null;
    public int az;
    static final int mv = 0x20;
    static ht pu;

    static {
        df.ar = new gk(0x40, null);
        df.an = new gk(100, null);
    }

    df() {
        try {
            super();
            this.ab = 0xFD5FD70F;
            this.ai = false;
            this.av = 77444701;
            this.aa = -1011519133;
            this.au = 0xAB7DA8B3;
            this.am = 0x1E28216F;
            this.az = 0x206AF397;
            this.ag = -302168301;
            this.ah = 147643058;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("df.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static df aa(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = df.ar.ax(v1);
        if(v0 != null) {
            return ((df)v0);
        }

        byte[] v5 = df.ax.ae(12, arg5, 0x78DC0DC9);
        df v0_1 = new df();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0x7B);
        }

        v0_1.an(2060021121);
        df.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public ca ab(ca arg8, int arg9, byte arg10) {
        try {
            int v10 = this.ap[arg9];
            int v1 = 0x547AD1E9;
            bf v0 = bv.af(v10 >> 16, v1);
            int v2 = 0xFFFF;
            v10 &= v2;
            int v3 = 1;
            if(v0 == null) {
                return arg8.al(true);
            }

            bf v4 = null;
            if(this.aj == null || arg9 >= this.aj.length) {
                arg9 = 0;
            }
            else {
                arg9 = this.aj[arg9];
                v4 = bv.af(arg9 >> 16, v1);
                arg9 &= v2;
            }

            if(v4 != null) {
                if(v2 == arg9) {
                }
                else {
                    v1 = v0.al(v10, 0x1F36D208) ^ 1;
                    if(!v4.al(arg9, 0x4C6024E4)) {
                    }
                    else {
                        v3 = 0;
                    }

                    arg8 = arg8.al(v1 & v3);
                    arg8.ab(v0, v10);
                    arg8.ab(v4, arg9);
                    return arg8;
                }
            }

            arg8 = arg8.al(v0.al(v10, 763150618) ^ 1);
            arg8.ab(v0, v10);
            return arg8;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("df.ab(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    ca ac(ca arg5, int arg6, int arg7) {
        arg6 = this.ap[arg6];
        bf v0 = bv.af(arg6 >> 16, 0x547AD1E9);
        arg6 &= 0xFFFF;
        if(v0 == null) {
            return arg5.al(true);
        }

        arg5 = arg5.al(v0.al(arg6, 0x5AF10E34) ^ 1);
        int v2 = 3;
        arg7 &= v2;
        int v3 = 2;
        if(arg7 == 1) {
            arg5.au();
        }
        else if(arg7 == v3) {
            arg5.aa();
        }
        else if(v2 == arg7) {
            arg5.av();
        }

        arg5.ab(v0, arg6);
        if(arg7 == 1) {
            arg5.av();
        }
        else if(arg7 == v3) {
            arg5.aa();
        }
        else if(arg7 == v2) {
            arg5.au();
        }

        return arg5;
    }

    ca ad(ca arg3, int arg4, int arg5) {
        try {
            arg4 = this.ap[arg4];
            bf v5 = bv.af(arg4 >> 16, 0x547AD1E9);
            arg4 &= 0xFFFF;
            boolean v0 = true;
            if(v5 == null) {
                return arg3.ae(true);
            }

            if(!v5.al(arg4, 1405908260)) {
            }
            else {
                v0 = false;
            }

            arg3 = arg3.ae(v0);
            arg3.ab(v5, arg4);
            return arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("df.ad(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static void ae(ih[] arg17, int arg18, int arg19, int[] arg20, int[] arg21, int arg22) {
        int v12;
        int v13;
        int v16;
        int v15;
        int v14;
        int v11;
        int v2 = arg18;
        int v7 = arg19;
        if(v2 < v7) {
            int v1 = v2 - 1;
            int v3 = v7 + 1;
            int v4 = v7 + v2;
            int v5 = 2;
            try {
                v4 /= v5;
                ih v6 = arg17[v4];
                arg17[v4] = arg17[v2];
                arg17[v2] = v6;
                int v8 = v3;
                while(v1 < v8) {
                    v3 = 1;
                    while(true) {
                        v4 = -1;
                        v8 += v4;
                        v11 = v3;
                        v3 = 0;
                        while(true) {
                            v14 = 0xBBB22DD;
                            v15 = 0x98D051C9;
                            int v10 = 3;
                            v16 = 0xD718A153;
                            if(v3 < 4) {
                                if(v5 == arg20[v3]) {
                                    v13 = arg17[v8].az * v16;
                                    v5 = v6.az * v16;
                                }
                                else if(arg20[v3] == 1) {
                                    v13 = arg17[v8].av * v15;
                                    v5 = v6.av * v15;
                                    if(v13 == v4 && 1 == arg21[v3]) {
                                        v13 = 2001;
                                    }

                                    if(v4 != v5) {
                                        goto label_67;
                                    }

                                    if(arg21[v3] != 1) {
                                        goto label_67;
                                    }

                                    v5 = 2001;
                                }
                                else {
                                    if(arg20[v3] == v10) {
                                        v13 = arg17[v8].ab(0x26A77509) ? 1 : 0;
                                        boolean v5_1 = v6.ab(0x1B129890);
                                        goto label_67;
                                    }

                                    v13 = arg17[v8].af * v14;
                                    v5 = v6.af * v14;
                                }

                            label_67:
                                if(v13 != (((int)v5_1))) {
                                    break;
                                }

                                if(v3 == v10) {
                                    v11 = 0;
                                }

                                ++v3;
                                v5 = 2;
                                continue;
                            }
                            else {
                                goto label_83;
                            }
                        }

                        if(1 != arg21[v3] || v13 <= (((int)v5_1))) {
                            if(arg21[v3] == 0 && v13 < (((int)v5_1))) {
                                goto label_83;
                            }

                            v3 = 0;
                        }
                        else {
                        label_83:
                            v3 = v11;
                        }

                        if(v3 == 0) {
                            v3 = 1;
                            break;
                        }

                        v5 = 2;
                    }

                    do {
                        ++v1;
                        v5 = v3;
                        v3 = 0;
                        while(true) {
                            if(v3 < 4) {
                                if(arg20[v3] == 2) {
                                    v12 = arg17[v1].az * v16;
                                    v13 = v6.az * v16;
                                }
                                else if(arg20[v3] == 1) {
                                    v11 = arg17[v1].av * v15;
                                    v12 = v6.av * v15;
                                    if(v11 == v4 && arg21[v3] == 1) {
                                        v11 = 2001;
                                    }

                                    if(v12 == v4 && arg21[v3] == 1) {
                                        v12 = v11;
                                        v13 = 2001;
                                        goto label_142;
                                    }

                                    v13 = v12;
                                    v12 = v11;
                                }
                                else {
                                    if(v10 == arg20[v3]) {
                                        v12 = arg17[v1].ab(0xF5F80F82) ? 1 : 0;
                                        if(v6.ab(0x32738BE1)) {
                                            v13 = 1;
                                            goto label_142;
                                        }

                                        v13 = 0;
                                        goto label_142;
                                    }

                                    v12 = arg17[v1].af * v14;
                                    v13 = v6.af * v14;
                                }

                            label_142:
                                if(v12 != v13) {
                                    break;
                                }

                                if(v3 == v10) {
                                    v5 = 0;
                                }

                                ++v3;
                                continue;
                            }
                            else {
                                goto label_157;
                            }
                        }

                        if(arg21[v3] != 1 || v12 >= v13) {
                            if(arg21[v3] == 0 && v12 > v13) {
                                goto label_157;
                            }

                            v3 = 0;
                        }
                        else {
                        label_157:
                            v3 = v5;
                        }
                    }
                    while(v3 != 0);

                    if(v1 < v8) {
                        ih v3_1 = arg17[v1];
                        arg17[v1] = arg17[v8];
                        arg17[v8] = v3_1;
                    }

                    v5 = 2;
                }

                df.ae(arg17, arg18, v8, arg20, arg21, -1440881980);
                df.ae(arg17, v8 + 1, arg19, arg20, arg21, 0xB3A53FC3);
            }
            catch(RuntimeException v0) {
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("df.ae(");
                v1_1.append(')');
                throw lx.al(((Throwable)v0), v1_1.toString());
            }
        }
    }

    void ae(lq arg2, byte arg3) {
        while(true) {
            arg3 = -58;
            try {
                int v3 = arg2.ay(arg3);
                if(v3 == 0) {
                    return;
                }

                this.ar(arg2, v3, 0xEB422537);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("df.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void ag(lq arg5, int arg6) {
        int v0 = 0;
        if(1 == arg6) {
            arg6 = arg5.ao(0xBF00CE02);
            this.ad = new int[arg6];
            int v1;
            for(v1 = 0; v1 < arg6; ++v1) {
                this.ad[v1] = arg5.ao(880177547);
            }

            this.ap = new int[arg6];
            for(v1 = 0; v1 < arg6; ++v1) {
                this.ap[v1] = arg5.ao(-383071723);
            }

            while(v0 < arg6) {
                this.ap[v0] = (arg5.ao(-499007084) << 16) + this.ap[v0];
                ++v0;
            }
        }
        else {
            if(arg6 == 2) {
                this.ab = arg5.ao(0xDAEFECC8) * 0x2A028F1;
                return;
            }

            if(3 == arg6) {
                arg6 = arg5.ay(-84);
                this.af = new int[arg6 + 1];
                while(v0 < arg6) {
                    this.af[v0] = arg5.ay(-115);
                    ++v0;
                }

                this.af[arg6] = 0x98967F;
                return;
            }

            if(4 == arg6) {
                this.ai = true;
                return;
            }

            if(5 == arg6) {
                this.av = arg5.ay(-100) * -843504519;
                return;
            }

            if(6 == arg6) {
                this.aa = arg5.ao(1117908700) * 1011519133;
                return;
            }

            if(arg6 == 7) {
                this.au = arg5.ao(-1671298010) * 0x9D92D800;
                return;
            }

            if(arg6 == 8) {
                this.am = arg5.ay(-91) * 0x24A8C2FF;
                return;
            }

            if(arg6 == 9) {
                this.az = arg5.ay(-127) * 0xDF950C69;
                return;
            }

            if(arg6 == 10) {
                this.ag = arg5.ay(-71) * 902733075;
                return;
            }

            if(arg6 == 11) {
                this.ah = arg5.ay(-20) * 0xCCDE245B;
                return;
            }

            if(arg6 == 12) {
                arg6 = arg5.ay(-83);
                this.aj = new int[arg6];
                for(v1 = 0; v1 < arg6; ++v1) {
                    this.aj[v1] = arg5.ao(0x3ADDEA51);
                }

                while(true) {
                    if(v0 >= arg6) {
                        return;
                    }

                    this.aj[v0] = (arg5.ao(0x58F9E34F) << 16) + this.aj[v0];
                    ++v0;
                }
            }

            if(13 != arg6) {
                return;
            }

            arg6 = arg5.ay(-33);
            this.aq = new int[arg6];
            while(v0 < arg6) {
                this.aq[v0] = arg5.ak(205993156);
                ++v0;
            }
        }
    }

    void ah(lq arg5, int arg6) {
        int v0 = 0;
        if(1 == arg6) {
            arg6 = arg5.ao(0xA99F0B4D);
            this.ad = new int[arg6];
            int v1;
            for(v1 = 0; v1 < arg6; ++v1) {
                this.ad[v1] = arg5.ao(-749811005);
            }

            this.ap = new int[arg6];
            for(v1 = 0; v1 < arg6; ++v1) {
                this.ap[v1] = arg5.ao(0x81B2C781);
            }

            while(v0 < arg6) {
                this.ap[v0] = (arg5.ao(-1512006046) << 16) + this.ap[v0];
                ++v0;
            }
        }
        else {
            if(arg6 == 2) {
                this.ab = arg5.ao(-1696949900) * 0x2A028F1;
                return;
            }

            if(3 == arg6) {
                arg6 = arg5.ay(-72);
                this.af = new int[arg6 + 1];
                while(v0 < arg6) {
                    this.af[v0] = arg5.ay(-112);
                    ++v0;
                }

                this.af[arg6] = 0x98967F;
                return;
            }

            if(4 == arg6) {
                this.ai = true;
                return;
            }

            if(5 == arg6) {
                this.av = arg5.ay(-106) * -843504519;
                return;
            }

            if(6 == arg6) {
                this.aa = arg5.ao(2103191638) * 1011519133;
                return;
            }

            if(arg6 == 7) {
                this.au = arg5.ao(-1385378009) * 0x5482574D;
                return;
            }

            if(arg6 == 8) {
                this.am = arg5.ay(-86) * -1600079227;
                return;
            }

            byte v2 = -29;
            if(arg6 == 9) {
                this.az = arg5.ay(v2) * 0xDF950C69;
                return;
            }

            if(arg6 == 10) {
                this.ag = arg5.ay(-41) * 302168301;
                return;
            }

            if(arg6 == 11) {
                this.ah = arg5.ay(v2) * -2073662119;
                return;
            }

            if(arg6 == 12) {
                arg6 = arg5.ay(-8);
                this.aj = new int[arg6];
                for(v1 = 0; v1 < arg6; ++v1) {
                    this.aj[v1] = arg5.ao(-842506558);
                }

                while(true) {
                    if(v0 >= arg6) {
                        return;
                    }

                    this.aj[v0] = (arg5.ao(1991168750) << 16) + this.aj[v0];
                    ++v0;
                }
            }

            if(13 != arg6) {
                return;
            }

            arg6 = arg5.ay(-104);
            this.aq = new int[arg6];
            while(v0 < arg6) {
                this.aq[v0] = arg5.ak(-499890921);
                ++v0;
            }
        }
    }

    ca aj(ca arg4, int arg5, int arg6, int arg7) {
        try {
            arg5 = this.ap[arg5];
            bf v7 = bv.af(arg5 >> 16, 0x547AD1E9);
            arg5 &= 0xFFFF;
            if(v7 == null) {
                return arg4.al(true);
            }

            boolean v1 = !v7.al(arg5, 0x5B6ED39B) ? true : false;
            arg4 = arg4.al(v1);
            int v1_1 = 3;
            arg6 &= v1_1;
            int v2 = 2;
            if(arg6 == 1) {
                arg4.au();
            }
            else if(arg6 == v2) {
                arg4.aa();
            }
            else if(v1_1 == arg6) {
                arg4.av();
            }

            arg4.ab(v7, arg5);
            if(arg6 == 1) {
                arg4.av();
            }
            else if(arg6 == v2) {
                arg4.aa();
            }
            else if(arg6 == v1_1) {
                arg4.au();
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("df.aj(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return arg4;
    }

    public ca ak(ca arg4, int arg5) {
        arg5 = this.ap[arg5];
        bf v0 = bv.af(arg5 >> 16, 0x547AD1E9);
        arg5 &= 0xFFFF;
        boolean v1 = true;
        if(v0 == null) {
            return arg4.al(true);
        }

        if(!v0.al(arg5, 0x2E5AF987)) {
        }
        else {
            v1 = false;
        }

        arg4 = arg4.al(v1);
        arg4.ab(v0, arg5);
        return arg4;
    }

    void am(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-5);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x973B1C71);
        }
    }

    void an(int arg4) {
        arg4 = 0x8C0143D9;
        try {
            int v1 = -1;
            if(this.az * arg4 == v1) {
                this.az = this.af != null ? -1087760174 : 0;
            }

            if(v1 == this.ag * -635149083) {
                this.ag = this.af != null ? 604336602 : 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("df.an(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public ca ao(ca arg4, int arg5) {
        arg5 = this.ap[arg5];
        bf v0 = bv.af(arg5 >> 16, 0x547AD1E9);
        arg5 &= 0x6D752D7B;
        boolean v1 = true;
        if(v0 == null) {
            return arg4.al(true);
        }

        if(!v0.al(arg5, 0x3682A50A)) {
        }
        else {
            v1 = false;
        }

        arg4 = arg4.al(v1);
        arg4.ab(v0, arg5);
        return arg4;
    }

    public ca ap(ca arg3, int arg4, int arg5) {
        try {
            arg4 = this.ap[arg4];
            bf v5 = bv.af(arg4 >> 16, 0x547AD1E9);
            arg4 &= 0xFFFF;
            if(v5 == null) {
                return arg3.al(true);
            }

            arg3 = arg3.al(1 ^ v5.al(arg4, 0x325FE30A));
            arg3.ab(v5, arg4);
            return arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("df.ap(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public static String ap(byte[] arg5, int arg6, int arg7, int arg8) {
        try {
            char[] v8 = new char[arg7];
            int v1 = 0;
            int v2 = 0;
            while(v1 < arg7) {
                int v3 = arg5[v1 + arg6] & 0xFF;
                if(v3 == 0) {
                }
                else {
                    if(v3 >= 0x80 && v3 < 0xA0) {
                        v3 = lr.ax[v3 - 0x80];
                        if(v3 == 0) {
                            v3 = 0x3F;
                        }
                    }

                    v8[v2] = ((char)v3);
                    ++v2;
                }

                ++v1;
            }

            return new String(v8, 0, v2);
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("df.ap(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public ca aq(ca arg8, int arg9, df arg10, int arg11, byte arg12) {
        try {
            arg9 = this.ap[arg9];
            int v0 = 0x547AD1E9;
            bf v2 = bv.af(arg9 >> 16, v0);
            int v12 = 0xFFFF;
            int v3 = arg9 & v12;
            if(v2 == null) {
                return arg10.ap(arg8, arg11, -1630886757);
            }

            arg9 = arg10.ap[arg11];
            bf v4 = bv.af(arg9 >> 16, v0);
            int v5 = arg9 & v12;
            arg9 = 1;
            if(v4 == null) {
                arg8 = arg8.al(1 ^ v2.al(v3, 2011601335));
                arg8.ab(v2, v3);
                return arg8;
            }

            int v10 = !v2.al(v3, 0x443F1EE9) ? 1 : 0;
            if(!v4.al(v5, 0x58B06D28)) {
            }
            else {
                arg9 = 0;
            }

            arg8 = arg8.al(arg9 & v10);
            arg8.af(v2, v3, v4, v5, this.af);
            return arg8;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("df.aq(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void ar(lq arg4, int arg5, int arg6) {
        arg6 = 0;
        if(1 == arg5) {
            arg5 = 0x4022569E;
            try {
                arg5 = arg4.ao(arg5);
                this.ad = new int[arg5];
                int v0;
                for(v0 = 0; v0 < arg5; ++v0) {
                    this.ad[v0] = arg4.ao(0x3EE4EFF3);
                }

                this.ap = new int[arg5];
                for(v0 = 0; v0 < arg5; ++v0) {
                    this.ap[v0] = arg4.ao(1799017688);
                }

                while(true) {
                    if(arg6 >= arg5) {
                        return;
                    }

                    this.ap[arg6] = (arg4.ao(0xC6D174BF) << 16) + this.ap[arg6];
                    ++arg6;
                }

            label_38:
                if(arg5 == 2) {
                    this.ab = arg4.ao(0xF1B50AB7) * 0x2A028F1;
                    return;
                }

                if(3 == arg5) {
                    arg5 = arg4.ay(-94);
                    this.af = new int[arg5 + 1];
                    while(arg6 < arg5) {
                        this.af[arg6] = arg4.ay(-113);
                        ++arg6;
                    }

                    this.af[arg5] = 0x98967F;
                    return;
                }

                if(4 == arg5) {
                    this.ai = true;
                    return;
                }

                if(5 == arg5) {
                    this.av = arg4.ay(-67) * -843504519;
                    return;
                }

                if(6 == arg5) {
                    this.aa = arg4.ao(0xC8C34068) * 1011519133;
                    return;
                }

                if(arg5 == 7) {
                    this.au = arg4.ao(0x7BB08AC) * 0x5482574D;
                    return;
                }

                if(arg5 == 8) {
                    this.am = arg4.ay(-19) * -1600079227;
                    return;
                }

                if(arg5 == 9) {
                    this.az = arg4.ay(-46) * 0xDF950C69;
                    return;
                }

                if(arg5 == 10) {
                    this.ag = arg4.ay(-48) * 302168301;
                    return;
                }

                if(arg5 == 11) {
                    this.ah = arg4.ay(-29) * -2073662119;
                    return;
                }

                if(arg5 == 12) {
                    arg5 = arg4.ay(-12);
                    this.aj = new int[arg5];
                    for(v0 = 0; v0 < arg5; ++v0) {
                        this.aj[v0] = arg4.ao(-660451380);
                    }

                    while(true) {
                        if(arg6 >= arg5) {
                            return;
                        }

                        this.aj[arg6] = (arg4.ao(0xC4FFCE51) << 16) + this.aj[arg6];
                        ++arg6;
                    }
                }

                if(13 != arg5) {
                    return;
                }

                arg5 = arg4.ay(-60);
                this.aq = new int[arg5];
                while(true) {
                    if(arg6 >= arg5) {
                        return;
                    }

                    this.aq[arg6] = arg4.ak(0xD3375A71);
                    ++arg6;
                }

            label_37:
                goto label_162;
            }
            catch(RuntimeException v4) {
                goto label_37;
            }
        }
        else {
            goto label_38;
        label_162:
            StringBuilder v5 = new StringBuilder();
            v5.append("df.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public ca as(ca arg4, int arg5) {
        arg5 = this.ap[arg5];
        bf v0 = bv.af(arg5 >> 16, 0x547AD1E9);
        arg5 &= 0xA1DFBFDC;
        boolean v1 = true;
        if(v0 == null) {
            return arg4.al(true);
        }

        if(!v0.al(arg5, 0x3A99D43B)) {
        }
        else {
            v1 = false;
        }

        arg4 = arg4.al(v1);
        arg4.ab(v0, arg5);
        return arg4;
    }

    void at() {
        int v2 = -1;
        if(this.az * 0x8C0143D9 == v2) {
            this.az = this.af != null ? -1087760174 : 0;
        }

        if(v2 == this.ag * -635149083) {
            this.ag = this.af != null ? 604336602 : 0;
        }
    }

    void au(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-40);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0xDE31C3AB);
        }
    }

    public static void av(ko arg0, ko arg1, ko arg2) {
        df.ax = arg0;
        df.al = arg1;
        df.ae = arg2;
    }

    void aw() {
        int v2 = -1;
        if(this.az * 0x8C0143D9 == v2) {
            this.az = this.af != null ? -1087760174 : 0;
        }

        if(v2 == this.ag * -635149083) {
            this.ag = this.af != null ? 604336602 : 0;
        }
    }

    void ay() {
        int v2 = -1;
        if(this.az * 0x8C0143D9 == v2) {
            this.az = this.af != null ? -1087760174 : 0;
        }

        if(v2 == this.ag * -635149083) {
            this.ag = this.af != null ? 604336602 : 0;
        }
    }

    void az(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-37);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -1801815577);
        }
    }

    ca ba(ca arg4, int arg5) {
        arg5 = this.ap[arg5];
        bf v0 = bv.af(arg5 >> 16, 0x547AD1E9);
        arg5 &= 1433035930;
        boolean v1 = true;
        if(v0 == null) {
            return arg4.ae(true);
        }

        if(!v0.al(arg5, 0x7EE2F9E0)) {
        }
        else {
            v1 = false;
        }

        arg4 = arg4.ae(v1);
        arg4.ab(v0, arg5);
        return arg4;
    }

    ca bd(ca arg5, int arg6, int arg7) {
        arg6 = this.ap[arg6];
        bf v0 = bv.af(arg6 >> 16, 0x547AD1E9);
        arg6 &= 0xFFFF;
        if(v0 == null) {
            return arg5.al(true);
        }

        boolean v2 = !v0.al(arg6, 0x6D62841D) ? true : false;
        arg5 = arg5.al(v2);
        int v2_1 = 3;
        arg7 &= v2_1;
        int v3 = 2;
        if(arg7 == 1) {
            arg5.au();
        }
        else if(arg7 == v3) {
            arg5.aa();
        }
        else if(v2_1 == arg7) {
            arg5.av();
        }

        arg5.ab(v0, arg6);
        if(arg7 == 1) {
            arg5.av();
        }
        else if(arg7 == v3) {
            arg5.aa();
        }
        else if(arg7 == v2_1) {
            arg5.au();
        }

        return arg5;
    }

    ca bf(ca arg4, int arg5) {
        arg5 = this.ap[arg5];
        bf v0 = bv.af(arg5 >> 16, 0x547AD1E9);
        arg5 &= 0xFFFF;
        boolean v1 = true;
        if(v0 == null) {
            return arg4.ae(true);
        }

        if(!v0.al(arg5, 1320645538)) {
        }
        else {
            v1 = false;
        }

        arg4 = arg4.ae(v1);
        arg4.ab(v0, arg5);
        return arg4;
    }

    public ca bn(ca arg9, int arg10, df arg11, int arg12) {
        arg10 = this.ap[arg10];
        int v1 = 0x547AD1E9;
        bf v3 = bv.af(arg10 >> 16, v1);
        int v0 = 0xFFFF;
        int v4 = arg10 & v0;
        if(v3 == null) {
            return arg11.ap(arg9, arg12, -1834233021);
        }

        arg10 = arg11.ap[arg12];
        bf v5 = bv.af(arg10 >> 16, v1);
        int v6 = arg10 & v0;
        boolean v10 = true;
        if(v5 == null) {
            if(!v3.al(v4, 0x6FC11962)) {
            }
            else {
                v10 = false;
            }

            arg9 = arg9.al(v10);
            arg9.ab(v3, v4);
            return arg9;
        }

        arg12 = !v3.al(v4, 0x5D4C8FDB) ? 1 : 0;
        if(!v5.al(v6, 0x4BD62FB1)) {
        }
        else {
            arg10 = 0;
        }

        arg9 = arg9.al(arg10 & arg12);
        arg9.af(v3, v4, v5, v6, this.af);
        return arg9;
    }

    public ca bo(ca arg9, int arg10) {
        int v0 = this.ap[arg10];
        int v2 = 0x547AD1E9;
        bf v1 = bv.af(v0 >> 16, v2);
        int v3 = 0xFFFF;
        v0 &= v3;
        int v4 = 1;
        if(v1 == null) {
            return arg9.al(true);
        }

        bf v5 = null;
        if(this.aj == null || arg10 >= this.aj.length) {
            arg10 = 0;
        }
        else {
            arg10 = this.aj[arg10];
            v5 = bv.af(arg10 >> 16, v2);
            arg10 &= v3;
        }

        if(v5 != null) {
            if(v3 == arg10) {
            }
            else {
                v2 = v1.al(v0, 0x6B13C2EF) ^ 1;
                if(!v5.al(arg10, 668086053)) {
                }
                else {
                    v4 = 0;
                }

                arg9 = arg9.al(v2 & v4);
                arg9.ab(v1, v0);
                arg9.ab(v5, arg10);
                return arg9;
            }
        }

        if(!v1.al(v0, 0x4A23AEF5)) {
        }
        else {
            boolean v4_1 = false;
        }

        arg9 = arg9.al(((boolean)v4));
        arg9.ab(v1, v0);
        return arg9;
    }

    public ca bp(ca arg9, int arg10, df arg11, int arg12) {
        arg10 = this.ap[arg10];
        int v1 = 0x547AD1E9;
        bf v3 = bv.af(arg10 >> 16, v1);
        int v0 = 0xFFFF;
        int v4 = arg10 & v0;
        if(v3 == null) {
            return arg11.ap(arg9, arg12, 0x9321DD44);
        }

        arg10 = arg11.ap[arg12];
        bf v5 = bv.af(arg10 >> 16, v1);
        int v6 = arg10 & v0;
        boolean v10 = true;
        if(v5 == null) {
            if(!v3.al(v4, 582560204)) {
            }
            else {
                v10 = false;
            }

            arg9 = arg9.al(v10);
            arg9.ab(v3, v4);
            return arg9;
        }

        arg12 = !v3.al(v4, 0x2B169055) ? 1 : 0;
        if(!v5.al(v6, 0x6F1C2D5F)) {
        }
        else {
            arg10 = 0;
        }

        arg9 = arg9.al(arg10 & arg12);
        arg9.af(v3, v4, v5, v6, this.af);
        return arg9;
    }

    public static void bq(Collection arg1) {
        arg1.add(df.ar);
        arg1.add(df.an);
    }

    static bf bt(int arg6) {
        long v1 = ((long)arg6);
        mv v0 = df.an.ax(v1);
        if(v0 != null) {
            return ((bf)v0);
        }

        bf v6 = af.ax(df.al, df.ae, arg6, false, -42017171);
        if(v6 != null) {
            df.an.ae(((mv)v6), v1);
        }

        return v6;
    }

    static bf bv(int arg6) {
        long v1 = ((long)arg6);
        mv v0 = df.an.ax(v1);
        if(v0 != null) {
            return ((bf)v0);
        }

        bf v6 = af.ax(df.al, df.ae, arg6, false, 0xC57550E8);
        if(v6 != null) {
            df.an.ae(((mv)v6), v1);
        }

        return v6;
    }

    public ca bw(ca arg9, int arg10) {
        int v0 = this.ap[arg10];
        int v2 = 0x547AD1E9;
        bf v1 = bv.af(v0 >> 16, v2);
        int v3 = 0xFFFF;
        v0 &= v3;
        boolean v4 = true;
        if(v1 == null) {
            return arg9.al(true);
        }

        bf v5 = null;
        int v7 = 0;
        if(this.aj == null || arg10 >= this.aj.length) {
            arg10 = 0;
        }
        else {
            arg10 = this.aj[arg10];
            v5 = bv.af(arg10 >> 16, v2);
            arg10 &= v3;
        }

        if(v5 != null) {
            if(v3 == arg10) {
            }
            else {
                if(!v1.al(v0, 0x6D61D50F)) {
                    v7 = 1;
                }

                arg9 = arg9.al((v5.al(arg10, 0x76142FE8) ^ 1) & v7);
                arg9.ab(v1, v0);
                arg9.ab(v5, arg10);
                return arg9;
            }
        }

        if(!v1.al(v0, 0x25AB4F42)) {
        }
        else {
            v4 = false;
        }

        arg9 = arg9.al(v4);
        arg9.ab(v1, v0);
        return arg9;
    }

    public static void bx(Collection arg1) {
        arg1.add(df.ar);
        arg1.add(df.an);
    }

    static bf by(int arg6) {
        long v1 = ((long)arg6);
        mv v0 = df.an.ax(v1);
        if(v0 != null) {
            return ((bf)v0);
        }

        bf v6 = af.ax(df.al, df.ae, arg6, false, 0xD0AC002D);
        if(v6 != null) {
            df.an.ae(((mv)v6), v1);
        }

        return v6;
    }
}

