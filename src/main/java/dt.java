import java.util.Collection;

public class dt extends mv {
    short[] ab;
    short[] ad;
    public static int ae = 0;
    int[] af;
    public boolean ai;
    short[] aj;
    public int an;
    int[] ap;
    short[] aq;
    static gk ar = null;
    static ko ax = null;
    static final int bt = 8;
    public static iy bu;

    static {
        dt.ar = new gk(0x40, null);
    }

    dt() {
        try {
            super();
            this.an = 1010423945;
            this.af = new int[]{-1, -1, -1, -1, -1};
            this.ai = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dt.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-11);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 1835541209);
        }
    }

    public static void ab(ko arg1, ko arg2) {
        dt.ax = arg1;
        hy.al = arg2;
        dt.ae = dt.ax.au(3, 0x7E598414) * 600511677;
    }

    public boolean ac() {
        int v0 = 0;
        boolean v2 = true;
        while(v0 < 5) {
            if(-1 != this.af[v0] && !hy.al.an(this.af[v0], 0, -2005362817)) {
                v2 = false;
            }

            ++v0;
        }

        return v2;
    }

    static final boolean ad(byte[] arg9, int arg10, int arg11, int arg12) {
        int v1_1;
        boolean v4;
        boolean v1;
        lq v12;
        try {
            v12 = new lq(arg9);
            int v9_1 = -1;
            v1 = true;
            while(true) {
            label_5:
                int v2 = v12.bt(0x7F030049);
                if(v2 == 0) {
                    return v1;
                }

                v9_1 += v2;
                v4 = v1;
                v1_1 = 0;
                int v3 = 0;
                while(true) {
                label_14:
                    if(v1_1 == 0) {
                        int v5 = v12.by(7877);
                        if(v5 != 0) {
                            v3 += v5 - 1;
                            int v7 = v12.ay(-46) >> 2;
                            int v6 = (v3 >> 6 & 0x3F) + arg10;
                            v5 = (v3 & 0x3F) + arg11;
                            if(v6 <= 0) {
                                continue;
                            }

                            if(v5 <= 0) {
                                continue;
                            }

                            int v8 = 103;
                            if(v6 >= v8) {
                                continue;
                            }

                            if(v5 >= v8) {
                                continue;
                            }

                            do v5_1 = ok.al(v9_1, 0x49DF3F24);
                            if(v7 == 22 && (client.ab) && v5_1.ay * 0xE5018CDF == 0 && 1 != v5_1.ah * 0xE748B627 && !v5_1.bz) {
                                continue;
                            }

                            if(!v5_1.aj(0xEEDCA494)) {
                                client.fm += -1102395821;
                                v4 = false;
                            }

                            break;
                        }
                    }
                    else {
                        goto label_15;
                    }

                    goto label_25;
                }
            }
        }
        catch(RuntimeException v9) {
            goto label_71;
        }

        v1_1 = 1;
        goto label_14;
        try {
        label_15:
            if(v12.by(9147) == 0) {
            label_25:
                v1 = v4;
                goto label_5;
            }

            v12.ay(-79);
            goto label_14;
            return v1;
        }
        catch(RuntimeException v9) {
        label_71:
            StringBuilder v10 = new StringBuilder();
            v10.append("dt.ad(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public by ad(byte arg8) {
        by v8_2;
        int v8 = 5;
        try {
            by[] v0 = new by[v8];
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            while(v2 < v8) {
                if(-1 != this.af[v2]) {
                    v0[v3] = by.ax(hy.al, this.af[v2], 0);
                    ++v3;
                }

                ++v2;
            }

            v8_2 = new by(v0, v3);
            if(this.aj != null) {
                int v0_1;
                for(v0_1 = 0; v0_1 < this.aj.length; ++v0_1) {
                    v8_2.av(this.aj[v0_1], this.ad[v0_1]);
                }
            }

            if(this.aq != null) {
                while(v1 < this.aq.length) {
                    v8_2.aa(this.aq[v1], this.ab[v1]);
                    ++v1;
                }
            }
        }
        catch(RuntimeException v8_1) {
            goto label_49;
        }

        return v8_2;
    label_49:
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("dt.ad(");
        v0_2.append(')');
        throw lx.al(((Throwable)v8_1), v0_2.toString());
    }

    void ae(lq arg2, byte arg3) {
        while(true) {
            arg3 = -19;
            try {
                int v3 = arg2.ay(arg3);
                if(v3 == 0) {
                    return;
                }

                this.ar(arg2, v3, 0xACF22430);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dt.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public static dt af(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dt.ar.ax(v1);
        if(v0 != null) {
            return ((dt)v0);
        }

        byte[] v5 = dt.ax.ae(3, arg5, 0x78DC0DC9);
        dt v0_1 = new dt();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -1);
        }

        dt.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ag(lq arg4, int arg5) {
        if(1 == arg5) {
            this.an = arg4.ay(-13) * -1010423945;
        }
        else {
            int v2 = 0;
            if(arg5 == 2) {
                arg5 = arg4.ay(-17);
                this.ap = new int[arg5];
                while(v2 < arg5) {
                    this.ap[v2] = arg4.ao(0xC7E491F9);
                    ++v2;
                }
            }
            else if(arg5 == 3) {
                this.ai = true;
            }
            else if(40 == arg5) {
                arg5 = arg4.ay(-85);
                this.aj = new short[arg5];
                this.ad = new short[arg5];
                while(v2 < arg5) {
                    this.aj[v2] = ((short)arg4.ao(-958046663));
                    this.ad[v2] = ((short)arg4.ao(0x9F936FF8));
                    ++v2;
                }
            }
            else if(arg5 == 41) {
                arg5 = arg4.ay(-68);
                this.aq = new short[arg5];
                this.ab = new short[arg5];
                while(v2 < arg5) {
                    this.aq[v2] = ((short)arg4.ao(0xE3B2B635));
                    this.ab[v2] = ((short)arg4.ao(0x4BFADFB2));
                    ++v2;
                }
            }
            else {
                int v0 = 60;
                if(arg5 >= v0 && arg5 < 70) {
                    this.af[arg5 - v0] = arg4.ao(0x55CF00E8);
                }
            }
        }
    }

    public boolean ah() {
        if(this.ap == null) {
            return 1;
        }

        int v1 = 0;
        boolean v2 = true;
        while(v1 < this.ap.length) {
            if(!hy.al.an(this.ap[v1], 0, 0x86B648F1)) {
                v2 = false;
            }

            ++v1;
        }

        return v2;
    }

    public static dt ai(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dt.ar.ax(v1);
        if(v0 != null) {
            return ((dt)v0);
        }

        byte[] v5 = dt.ax.ae(3, arg5, 0x78DC0DC9);
        dt v0_1 = new dt();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -1);
        }

        dt.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public boolean aj(byte arg6) {
        int v6 = 0;
        boolean v1 = true;
        while(v6 < 5) {
            int v2 = -1;
            try {
                if(v2 != this.af[v6]) {
                    if(hy.al.an(this.af[v6], 0, 186073400)) {
                        goto label_17;
                    }

                    goto label_16;
                }

                goto label_17;
            }
            catch(RuntimeException v6_1) {
                StringBuilder v0 = new StringBuilder();
                v0.append("dt.aj(");
                v0.append(')');
                throw lx.al(((Throwable)v6_1), v0.toString());
            }

        label_16:
            v1 = false;
        label_17:
            ++v6;
        }

        return v1;
    }

    public boolean ak() {
        int v0 = 0;
        boolean v2 = true;
        while(v0 < 5) {
            if(-1 != this.af[v0] && !hy.al.an(this.af[v0], 0, 0xAADE3532)) {
                v2 = false;
            }

            ++v0;
        }

        return v2;
    }

    void am(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-14);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x9CA0423A);
        }
    }

    public boolean an(int arg6) {
        boolean v1;
        int v0;
        try {
            if(this.ap == null) {
                return 1;
            }

            v0 = 0;
            v1 = true;
            while(true) {
            label_7:
                if(v0 >= this.ap.length) {
                    return v1;
                }

                if(!hy.al.an(this.ap[v0], 0, -1119076668)) {
                    break;
                }

                goto label_17;
            }
        }
        catch(RuntimeException v6) {
            goto label_22;
        }

        v1 = false;
    label_17:
        ++v0;
        goto label_7;
        return v1;
    label_22:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("dt.an(");
        v0_1.append(')');
        throw lx.al(((Throwable)v6), v0_1.toString());
    }

    public by ao() {
        if(this.ap == null) {
            return null;
        }

        by[] v0 = new by[this.ap.length];
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < this.ap.length; ++v2) {
            v0[v2] = by.ax(hy.al, this.ap[v2], 0);
        }

        by v0_1 = v0.length == 1 ? v0[0] : new by(v0, v0.length);
        if(this.aj != null) {
            for(v2 = 0; v2 < this.aj.length; ++v2) {
                v0_1.av(this.aj[v2], this.ad[v2]);
            }
        }

        if(this.aq != null) {
            while(v1 < this.aq.length) {
                v0_1.aa(this.aq[v1], this.ab[v1]);
                ++v1;
            }
        }

        return v0_1;
    }

    public by ap(int arg5) {
        by v5_2;
        try {
            if(this.ap == null) {
                return null;
            }

            by[] v5_1 = new by[this.ap.length];
            int v0 = 0;
            int v1;
            for(v1 = 0; v1 < this.ap.length; ++v1) {
                v5_1[v1] = by.ax(hy.al, this.ap[v1], 0);
            }

            v5_2 = v5_1.length == 1 ? v5_1[0] : new by(v5_1, v5_1.length);
            if(this.aj != null) {
                for(v1 = 0; v1 < this.aj.length; ++v1) {
                    v5_2.av(this.aj[v1], this.ad[v1]);
                }
            }

            if(this.aq != null) {
                while(v0 < this.aq.length) {
                    v5_2.aa(this.aq[v0], this.ab[v0]);
                    ++v0;
                }
            }
        }
        catch(RuntimeException v5) {
            goto label_56;
        }

        return v5_2;
    label_56:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("dt.ap(");
        v0_1.append(')');
        throw lx.al(((Throwable)v5), v0_1.toString());
    }

    public static String aq(int arg2) {
        try {
            return bt.et;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dt.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    void ar(lq arg4, int arg5, int arg6) {
        char v6 = ')';
        if(1 == arg5) {
            byte v5 = -115;
            try {
                this.an = arg4.ay(v5) * -1010423945;
                return;
            label_11:
                int v2 = 0;
                if(arg5 == 2) {
                    arg5 = arg4.ay(-76);
                    this.ap = new int[arg5];
                    while(v2 < arg5) {
                        this.ap[v2] = arg4.ao(-190009902);
                        ++v2;
                    }
                }
                else if(arg5 == 3) {
                    this.ai = true;
                }
                else if(40 == arg5) {
                    arg5 = arg4.ay(-30);
                    this.aj = new short[arg5];
                    this.ad = new short[arg5];
                    while(v2 < arg5) {
                        this.aj[v2] = ((short)arg4.ao(0x91693941));
                        this.ad[v2] = ((short)arg4.ao(1443089012));
                        ++v2;
                    }
                }
                else if(arg5 == v6) {
                    arg5 = arg4.ay(-8);
                    this.aq = new short[arg5];
                    this.ab = new short[arg5];
                    while(v2 < arg5) {
                        this.aq[v2] = ((short)arg4.ao(0xACEF5FD6));
                        this.ab[v2] = ((short)arg4.ao(-1051364126));
                        ++v2;
                    }
                }
                else {
                    int v0 = 60;
                    if(arg5 >= v0 && arg5 < 70) {
                        this.af[arg5 - v0] = arg4.ao(0x52002CEE);
                        return;
                    label_10:
                        goto label_80;
                    }
                }
            }
            catch(RuntimeException v4) {
                goto label_10;
            }
        }
        else {
            goto label_11;
        label_80:
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("dt.ar(");
            v5_1.append(v6);
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    static void as(int arg3) {
        arg3 = 0;
        try {
            while(true) {
            label_1:
                if(arg3 >= jw.ad.length) {
                    return;
                }

                if(jw.ad[arg3] != 0) {
                    jw.ad[arg3] |= 0xFF000000;
                }

                break;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dt.as(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        ++arg3;
        goto label_1;
    }

    public by as() {
        if(this.ap == null) {
            return null;
        }

        by[] v0 = new by[this.ap.length];
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < this.ap.length; ++v2) {
            v0[v2] = by.ax(hy.al, this.ap[v2], 0);
        }

        by v0_1 = v0.length == 1 ? v0[0] : new by(v0, v0.length);
        if(this.aj != null) {
            for(v2 = 0; v2 < this.aj.length; ++v2) {
                v0_1.av(this.aj[v2], this.ad[v2]);
            }
        }

        if(this.aq != null) {
            while(v1 < this.aq.length) {
                v0_1.aa(this.aq[v1], this.ab[v1]);
                ++v1;
            }
        }

        return v0_1;
    }

    public boolean at() {
        if(this.ap == null) {
            return 1;
        }

        int v1 = 0;
        boolean v2 = true;
        while(v1 < this.ap.length) {
            if(!hy.al.an(this.ap[v1], 0, 0x36698844)) {
                v2 = false;
            }

            ++v1;
        }

        return v2;
    }

    void au(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-84);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 702430816);
        }
    }

    public static dt av(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dt.ar.ax(v1);
        if(v0 != null) {
            return ((dt)v0);
        }

        byte[] v5 = dt.ax.ae(3, arg5, 0x78DC0DC9);
        dt v0_1 = new dt();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -1);
        }

        dt.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public boolean aw() {
        if(this.ap == null) {
            return 1;
        }

        int v1 = 0;
        boolean v2 = true;
        while(v1 < this.ap.length) {
            if(!hy.al.an(this.ap[v1], 0, 0x9B805577)) {
                v2 = false;
            }

            ++v1;
        }

        return v2;
    }

    public boolean ay() {
        if(this.ap == null) {
            return 1;
        }

        int v1 = 0;
        boolean v2 = true;
        while(v1 < this.ap.length) {
            if(!hy.al.an(this.ap[v1], 0, -1100703983)) {
                v2 = false;
            }

            ++v1;
        }

        return v2;
    }

    static void az(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v1;
        int v0;
        arg5 = -(arg8 >> 2);
        arg8 = -(arg8 & 3);
        arg9 = -arg9;
        while(true) {
            if(arg9 >= 0) {
                return;
            }

            arg12 = arg7;
            arg7 = arg6;
            arg6 = arg5;
            while(true) {
                if(arg6 >= 0) {
                    goto label_44;
                }

                v0 = arg7 + 1;
                try {
                    arg7 = arg4[arg7];
                    if(arg7 != 0) {
                        v1 = arg12 + 1;
                        arg3[arg12] = arg7;
                    }
                    else {
                        v1 = arg12 + 1;
                    }

                    arg7 = v0 + 1;
                    arg12 = arg4[v0];
                    if(arg12 != 0) {
                        v0 = v1 + 1;
                        arg3[v1] = arg12;
                    }
                    else {
                        v0 = v1 + 1;
                    }

                    arg12 = arg7 + 1;
                    arg7 = arg4[arg7];
                    if(arg7 != 0) {
                        v1 = v0 + 1;
                        arg3[v0] = arg7;
                    }
                    else {
                        v1 = v0 + 1;
                    }

                    arg7 = arg12 + 1;
                    arg12 = arg4[arg12];
                    if(arg12 != 0) {
                        arg3[v1] = arg12;
                        arg12 = v1 + 1;
                    }
                    else {
                        arg12 = v1 + 1;
                    }

                    ++arg6;
                    continue;
                label_44:
                    arg6 = arg8;
                    while(true) {
                    label_45:
                        if(arg6 >= 0) {
                            goto label_66;
                        }

                        v0 = arg7 + 1;
                        arg7 = arg4[arg7];
                        if(arg7 != 0) {
                            arg3[arg12] = arg7;
                            ++arg12;
                        }
                        else {
                            break;
                        }

                        goto label_54;
                    }
                }
                catch(RuntimeException v3) {
                    goto label_57;
                }
            }

            ++arg12;
        label_54:
            ++arg6;
            arg7 = v0;
            goto label_45;
        label_66:
            ++arg9;
            int v2 = arg7 + arg11;
            arg7 = arg12 + arg10;
            arg6 = v2;
        }

    label_57:
        StringBuilder v4 = new StringBuilder();
        v4.append("dt.az(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    void az(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-59);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x92E2DEF8);
        }
    }

    public by ba() {
        int v0 = 5;
        by[] v1 = new by[v0];
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v3 < v0) {
            if(-1 != this.af[v3]) {
                v1[v4] = by.ax(hy.al, this.af[v3], 0);
                ++v4;
            }

            ++v3;
        }

        by v0_1 = new by(v1, v4);
        if(this.aj != null) {
            int v1_1;
            for(v1_1 = 0; v1_1 < this.aj.length; ++v1_1) {
                v0_1.av(this.aj[v1_1], this.ad[v1_1]);
            }
        }

        if(this.aq != null) {
            while(v2 < this.aq.length) {
                v0_1.aa(this.aq[v2], this.ab[v2]);
                ++v2;
            }
        }

        return v0_1;
    }

    public by bd() {
        int v0 = 5;
        by[] v1 = new by[v0];
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v3 < v0) {
            if(-1 != this.af[v3]) {
                v1[v4] = by.ax(hy.al, this.af[v3], 0);
                ++v4;
            }

            ++v3;
        }

        by v0_1 = new by(v1, v4);
        if(this.aj != null) {
            int v1_1;
            for(v1_1 = 0; v1_1 < this.aj.length; ++v1_1) {
                v0_1.av(this.aj[v1_1], this.ad[v1_1]);
            }
        }

        if(this.aq != null) {
            while(v2 < this.aq.length) {
                v0_1.aa(this.aq[v2], this.ab[v2]);
                ++v2;
            }
        }

        return v0_1;
    }

    public static void bf(Collection arg1) {
        arg1.add(dt.ar);
    }

    public static void bn(Collection arg1) {
        arg1.add(dt.ar);
    }

    static void de(byte arg2) {
        try {
            int v0 = 0xE8408B37;
            if(client.ke * v0 >= 0 && client.jf[client.ke * v0] != null) {
                cn.dc(client.jf[client.ke * v0], false, 0x9657E6DC);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dt.de(");
            v0_1.append(')');
            throw lx.al(((Throwable)v2), v0_1.toString());
        }
    }
}

