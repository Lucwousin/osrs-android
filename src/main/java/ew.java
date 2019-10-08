public class ew implements Comparable {
    static final int ae = 6;
    String al;
    static ih[] an = null;
    String ax;
    static final int cr = 0x200;
    static int rd;

    public ew(String arg2, ml arg3) {
        try {
            super();
            this.ax = arg2;
            this.al = do.ar(((CharSequence)arg2), arg3, 0x1010119);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ew.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static int ad(boolean arg2, boolean arg3, int arg4) {
        arg4 = 0;
        if(arg2) {
            int v2 = 0xBE0052F5;
            try {
                arg4 = km.af * v2 + km.aq * 1220765581;
            label_13:
                if(arg3) {
                    return km.aa * 0xF5D8B541 + km.am * -70103809;
                label_12:
                    goto label_23;
                }

                return arg4;
            }
            catch(RuntimeException v2_1) {
                goto label_12;
            }
        }

        goto label_13;
    label_23:
        StringBuilder v3 = new StringBuilder();
        v3.append("ew.ad(");
        v3.append(')');
        throw lx.al(((Throwable)v2_1), v3.toString());
        return arg4;
    }

    public int ad(Object arg2) {
        return this.ae(((ew)arg2), -99);
    }

    public int ae(ew arg2, byte arg3) {
        try {
            if(this.al == null) {
                if(arg2.al == null) {
                    return 0;
                }

                return 1;
            }

            if(arg2.al == null) {
                return -1;
            }

            return this.al.compareTo(arg2.al);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ew.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static final es ai(int arg31, int arg32, int arg33, int arg34, int arg35, boolean arg36, int arg37) {
        fa v30;
        es v1_2;
        dr v12;
        ca v29;
        es v0_3;
        int v2;
        int v1;
        int v14;
        int v0 = arg31;
        int v7 = arg32;
        int v8 = arg33;
        int v9 = arg34;
        int v10 = 2;
        int v11 = -1;
        if(v7 == v11) {
            v14 = 0;
        }
        else {
            v1 = arg35;
            if(v10 == v1 && v7 != 1) {
                v14 = 1;
                goto label_16;
            }

            v14 = v1;
        }

    label_16:
        v10 = 16;
        int v16 = v14;
        long v13 = ((((long)v9)) << 42) + (((((long)v14)) << 40) + (((((long)v7)) << v10) + (((long)v0)) + ((((long)v8)) << 38)));
        if(!arg36) {
            try {
                mv v1_1 = dr.aa.ax(v13);
                if(v1_1 != null) {
                    return ((es)v1_1);
                }

            label_39:
                dr v0_2 = client.al(v0, 0x243FB743);
                if(v7 > 1 && v0_2.be != null) {
                    v1 = 0;
                    v2 = -1;
                    while(v1 < 10) {
                        if(v7 >= v0_2.bl[v1] && v0_2.bl[v1] != 0) {
                            v2 = v0_2.be[v1];
                        }

                        ++v1;
                    }

                    if(v11 == v2) {
                        goto label_61;
                    }

                    v0_2 = client.al(v2, 395106455);
                }

            label_61:
                dr v6 = v0_2;
                ca v5 = v6.ab(1, 60);
                es v17 = null;
                if(v5 == null) {
                    return v17;
                }

                int v27 = 0x286CC599;
                int v18 = 0xBC6389C3;
                int v28 = 0xFA513F6B;
                if(v6.bi * v27 != v11) {
                    v0_3 = ew.ai(v6.br * -2039930253, 10, 1, 0, 0, true, 2108497116);
                    if(v0_3 == null) {
                        return v17;
                    }
                    else {
                        v29 = v5;
                        v12 = v6;
                    }
                }
                else if(v6.cp * v28 != v11) {
                    v29 = v5;
                    v12 = v6;
                    v0_3 = ew.ai(v6.cc * 0x63177321, arg32, arg33, arg34, 0, false, 2020708718);
                    if(v0_3 == null) {
                        return v17;
                    }
                }
                else {
                    v29 = v5;
                    v12 = v6;
                    if(v11 != v12.cr * v18) {
                        v0_3 = ew.ai(0xF27B7AF9 * v12.ci, arg32, 0, 0, 0, false, 0x75D47424);
                        if(v0_3 == null) {
                            return v17;
                        }
                    }
                    else {
                        v0_3 = v17;
                    }
                }

                v1_2 = new es(36, 0x20);
                dr.am.bq(v1_2.ax, 36, 0x20, -84);
                fa v4 = dr.am.ax(0x7038C4F8);
                bt v5_1 = dr.am.al(165729900);
                bi v17_1 = dr.am.ae(0xAF6F93DC).al(-1791608009);
                ((bj)v5_1).bq(0x3BF5F56D);
                ((bj)v5_1).bg(v10, v10, 1808190038);
                ((bj)v5_1).bt(false, 8);
                int v5_2 = -807658005;
                if(v11 != v12.cr * v18) {
                    ((ec)v4).am(v0_3, 0, 0, v5_2);
                }

                int v6_1 = v12.as * -1217022225;
                if(arg36) {
                    v30 = v4;
                    v6_1 = ((int)((((double)v6_1)) * 1.5));
                }
                else {
                    v30 = v4;
                    if(2 == v8) {
                        v6_1 = ((int)((((double)v6_1)) * 1.04));
                    }
                }

                v2 = bt.ag[v12.ak * 0x8BE58883] * v6_1 >> v10;
                int v3 = bt.ah[v12.ak * 0x8BE58883] * v6_1 >> v10;
                v29.ap();
                v17_1.ax(v29, 0, v12.ac * 0xDDF7657F, v12.bd * -1182208677, v12.ak * 0x8BE58883, v12.ba * 0x51249DA7, v12.bf * 0x9009F5A7 + (v2 + v29.bh * 0xCD6CEDE3 / 2), v12.bf * 0x9009F5A7 + v3, 0x7CCD087D);
                if(v11 != v12.cp * v28) {
                    v4 = v30;
                    ((ec)v4).am(v0_3, 0, 0, -807658005);
                }
                else {
                    v4 = v30;
                }

                if(v8 >= 1) {
                    v1_2.aj(1);
                }

                if(v8 >= 2) {
                    v1_2.aj(0xFFFFFF);
                }

                if(v9 != 0) {
                    v1_2.ad(v9);
                }

                dr.am.bq(v1_2.ax, 36, 0x20, -116);
                if(v12.bi * v27 != v11) {
                    v6_1 = 0;
                    ((ec)v4).am(v0_3, 0, 0, -807658005);
                }
                else {
                    v6_1 = 0;
                }

                v0 = v16;
                if(v0 == 1 || v0 == 2 && v12.bn * 401368599 == 1) {
                    ju.au.aq(jz.av(v7, -45), 0, 9, 0xFFFF00, 1, v4);
                }

                while(v6_1 < v1_2.ax.length) {
                    if(v1_2.ax[v6_1] != 0) {
                        v1_2.ax[v6_1] |= 0xFF000000;
                    }

                    ++v6_1;
                }

                if(!arg36) {
                    dr.aa.ae(((mv)v1_2), v13);
                }

                return v1_2;
            }
            catch(RuntimeException v0_1) {
                goto label_285;
            }
        }

        goto label_39;
        return v1_2;
    label_285:
        StringBuilder v1_3 = new StringBuilder();
        v1_3.append("ew.ai(");
        v1_3.append(')');
        throw lx.al(((Throwable)v0_1), v1_3.toString());
    }

    public int aj(Object arg2) {
        return this.ae(((ew)arg2), -60);
    }

    static void ak(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int v0 = -arg17;
        int v1 = arg13;
        int v2;
        for(v2 = arg14; v0 < 0; v2 = v6 + arg15) {
            int v3 = (v1 >> 16) * arg20;
            int v5 = -arg16;
            int v6 = v2;
            v2 = arg12;
            while(v5 < 0) {
                int v7 = (v2 >> 16) + v3;
                try {
                    v7 = arg10[v7];
                    if(v7 != 0) {
                        arg9[v6] = arg11[v7 & 0xFF];
                        ++v6;
                    }
                    else {
                        goto label_22;
                    }

                    goto label_23;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("ew.ak(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0_1), v1_1.toString());
                }

            label_22:
                ++v6;
            label_23:
                v2 += arg18;
                ++v5;
            }

            v1 += arg19;
            ++v0;
        }
    }

    public boolean al(int arg3) {
        try {
            if(this.al == null) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ew.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public boolean an() {
        boolean v0 = this.al != null ? true : false;
        return v0;
    }

    public int ap(ew arg2) {
        if(this.al == null) {
            if(arg2.al == null) {
                return 0;
            }

            return 1;
        }

        if(arg2.al == null) {
            return -1;
        }

        return this.al.compareTo(arg2.al);
    }

    static void ar(int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            long v0 = ((long)arg4);
            mx v4_1 = jb.ax.ax(v0);
            if(v4_1 == null) {
                jb v4_2 = new jb();
                jb.ax.al(((mx)v4_2), v0);
            }

            if(((jb)v4_1).al.length <= arg5) {
                arg8 = arg5 + 1;
                int[] v0_1 = new int[arg8];
                int[] v8 = new int[arg8];
                int v2;
                for(v2 = 0; v2 < ((jb)v4_1).al.length; ++v2) {
                    v0_1[v2] = ((jb)v4_1).al[v2];
                    v8[v2] = ((jb)v4_1).ae[v2];
                }

                for(v2 = ((jb)v4_1).al.length; v2 < arg5; ++v2) {
                    v0_1[v2] = -1;
                    v8[v2] = 0;
                }

                ((jb)v4_1).al = v0_1;
                ((jb)v4_1).ae = v8;
            }

            ((jb)v4_1).al[arg5] = arg6;
            ((jb)v4_1).ae[arg5] = arg7;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ew.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public String ar() {
        return this.ax;
    }

    static final boolean aw(ca arg9, int arg10, int arg11, int arg12, bi arg13, byte arg14) {
        arg14 = 61;
        try {
            if(!bf.az(arg14)) {
                return 0;
            }

            li.ay(arg13.bo, 771406610);
            arg10 += arg9.bz;
            int v13 = arg9.bb + arg11;
            arg11 = arg9.bc + arg12;
            arg12 = arg9.bk;
            int v14 = arg9.bm;
            int v9_1 = arg9.bj;
            int v1 = bc.aj * 1240716205 - arg10;
            int v2 = lr.ad * 0x30864F7D - v13;
            v13 = pg.aq * -780802123 - arg11;
            int v3 = 0xABFB2E61;
            if(Math.abs(v1) > io.av * v3 + arg12) {
                return 0;
            }

            int v4 = 0x2E3670C9;
            if(Math.abs(v2) > he.aa * v4 + v14) {
                return 0;
            }

            int v5 = 690672433;
            if(Math.abs(v13) > bt.au * v5 + v9_1) {
                return 0;
            }

            arg11 = 0x3140C225;
            int v7 = 1012774935;
            if(Math.abs(ai.af * arg11 * v13 - bd.ai * v7 * v2) > he.aa * v4 * v9_1 + bt.au * v5 * v14) {
                return 0;
            }

            arg10 = bd.ai * v7 * v1;
            v7 = 0x6F746E2B;
            if(Math.abs(arg10 - ak.ab * v7 * v13) > v9_1 * (io.av * v3) + bt.au * v5 * arg12) {
                return 0;
            }

            if(Math.abs(ak.ab * v7 * v2 - ai.af * arg11 * v1) <= io.av * v3 * v14 + he.aa * v4 * arg12) {
                return 1;
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ew.aw(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }

        return 0;
    }

    public static void ax(ko arg3, byte arg4) {
        try {
            ds.ax = arg3;
            ds.al = new ds[arg3.au(1, 397939809)];
            int v3_1;
            for(v3_1 = 0; v3_1 < ds.al.length; ++v3_1) {
                byte[] v4 = ds.ax.ae(1, v3_1, 0x78DC0DC9);
                ds.al[v3_1] = new ds();
                if(v4 != null) {
                    ds.al[v3_1].ar(new lq(v4), v3_1, 0x202E);
                }

                ds.al[v3_1].ae(0xFE38BD4A);
            }
        }
        catch(RuntimeException v3) {
            goto label_33;
        }

        return;
    label_33:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("ew.ax(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    public String ax(int arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ew.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void bc(boolean arg1, int arg2) {
        if(arg1) {
            try {
                ok v1_1 = hq.dy ? ok.al : ok.ar;
                client.dz = v1_1;
                return;
            label_8:
                arg2 = 0x8251FD91;
                v1_1 = hp.ea.ad * arg2 == 0 || !li.rg.ad.containsKey(Integer.valueOf(hp.ea.ad * arg2)) ? ok.ae : ok.ax;
                client.dz = v1_1;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("ew.bc(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
        else {
            goto label_8;
        }
    }

    public int compareTo(Object arg3) {
        try {
            return this.ae(((ew)arg3), -47);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ew.compareTo(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean equals(Object arg4) {
        try {
            boolean v1 = false;
            if(!(arg4 instanceof ew)) {
                return 0;
            }

            if(this.al == null) {
                if(((ew)arg4).al == null) {
                    v1 = true;
                }

                return v1;
            }

            if(((ew)arg4).al == null) {
                return 0;
            }

            if(this.hashCode() != ((ew)arg4).hashCode()) {
                return 0;
            }

            return this.al.equals(((ew)arg4).al);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ew.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 0;
    }

    public int hashCode() {
        try {
            if(this.al == null) {
                return 0;
            }

            return this.al.hashCode();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ew.hashCode(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean hd(Object arg4) {
        boolean v1 = false;
        if((arg4 instanceof ew)) {
            if(this.al == null) {
                if(((ew)arg4).al == null) {
                    v1 = true;
                }

                return v1;
            }

            if(((ew)arg4).al == null) {
                return 0;
            }

            if(this.hashCode() != ((ew)arg4).hashCode()) {
                return 0;
            }

            return this.al.equals(((ew)arg4).al);
        }

        return 0;
    }

    public boolean hh(Object arg4) {
        boolean v1 = false;
        if((arg4 instanceof ew)) {
            if(this.al == null) {
                if(((ew)arg4).al == null) {
                    v1 = true;
                }

                return v1;
            }

            if(((ew)arg4).al == null) {
                return 0;
            }

            if(this.hashCode() != ((ew)arg4).hashCode()) {
                return 0;
            }

            return this.al.equals(((ew)arg4).al);
        }

        return 0;
    }

    static final void hi(int arg3) {
        try {
            client.eh.ae(cd.al(nf.cq, client.eh.an, -1826838046), 0xCDEEFF96);
            mx v3_1;
            for(v3_1 = client.ky.ae(); v3_1 != null; v3_1 = client.ky.ar()) {
                int v1 = -1240339733;
                if(((if)v3_1).al * v1 == 0 || 3 == ((if)v3_1).al * v1) {
                    lb.hf(((if)v3_1), true, 2014);
                }
            }

            if(client.lp != null) {
                kx.gw(client.lp, 0x7F5E8AF0);
                client.lp = null;
            }
        }
        catch(RuntimeException v3) {
            goto label_35;
        }

        return;
    label_35:
        StringBuilder v0 = new StringBuilder();
        v0.append("ew.hi(");
        v0.append(')');
        throw lx.al(((Throwable)v3), v0.toString());
    }

    public String hm() {
        return this.ax(2065603843);
    }

    public int ht() {
        if(this.al == null) {
            return 0;
        }

        return this.al.hashCode();
    }

    public String hx() {
        return this.ax(0x4F0303C3);
    }

    public int hy() {
        if(this.al == null) {
            return 0;
        }

        return this.al.hashCode();
    }

    public String hz() {
        return this.ax(0x2359F5E0);
    }

    static void ix(String arg6, boolean arg7, int arg8) {
        try {
            arg6 = arg6.toLowerCase();
            int v0 = 0;
            short[] v1 = new short[16];
            arg8 = 0;
            int v2 = 0;
            while(arg8 < ag.af * -370650601) {
                dr v3 = client.al(arg8, 0x449EF5ED);
                if(!arg7 || (v3.cw)) {
                    int v5 = -1;
                    if(v3.bi * 0x286CC599 != v5) {
                    }
                    else if(v3.ah.toLowerCase().indexOf(arg6) == v5) {
                    }
                    else if(v2 >= 0xFA) {
                        ew.rd = 0xD900EA5;
                        lg.rp = null;
                        return;
                    }
                    else {
                        if(v2 >= v1.length) {
                            short[] v3_1 = new short[v1.length * 2];
                            int v4;
                            for(v4 = 0; v4 < v2; ++v4) {
                                v3_1[v4] = v1[v4];
                            }

                            v1 = v3_1;
                        }

                        v1[v2] = ((short)arg8);
                        ++v2;
                    }
                }
                else {
                }

                ++arg8;
            }

            lg.rp = v1;
            fa.rm = 0;
            ew.rd = v2 * 0xF26FF15B;
            int v7 = 0xE50ED6D3;
            String[] v6_1 = new String[ew.rd * v7];
            while(v0 < ew.rd * v7) {
                v6_1[v0] = client.al(v1[v0], 0x2EF658C9).ah;
                ++v0;
            }

            ki.ax(v6_1, lg.rp, 23);
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7_1 = new StringBuilder();
            v7_1.append("ew.ix(");
            v7_1.append(')');
            throw lx.al(((Throwable)v6), v7_1.toString());
        }
    }

    public String toString() {
        int v0 = 1078503826;
        try {
            return this.ax(v0);
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ew.toString(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }
}

