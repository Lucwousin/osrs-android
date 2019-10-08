public final class ii extends ie {
    public static final int ai = 11;
    public static final int al = 2;
    public static bh au = null;
    public ez ax;
    static final int nm = 100;
    static ef ug;

    ii() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ii.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int ab(long arg2) {
        return ((int)(arg2 >>> 14 & 3));
    }

    static final short ad(float arg1, float arg2, int arg3, int arg4, int arg5) {
        return ((short)((((int)((arg1 + 1f) * 64f))) + (arg3 >> 1) | (arg4 >> 1) + (((int)((arg2 + 1f) * 64f))) << 8));
    }

    final void ad(int arg6, int arg7, boolean arg8) {
        if(this.ch * 2011890317 != -1 && fs.al(this.ch * 0x948B11F0, 1304812425).ag * -635149083 == 1) {
            this.ch = 0x74A26FBB;
        }

        if(!arg8) {
            int v8 = arg6 - this.dc[0];
            int v1 = arg7 - this.dj[0];
            int v3 = -8;
            if(v8 >= v3) {
                int v4 = 8;
                if(v8 <= v4 && v1 >= v3 && v1 <= v4) {
                    if(this.dk * 1522906802 < 9) {
                        this.dk += 0xBB4D8BD8;
                    }

                    for(v8 = this.dk * -1103970950; v8 > 0; --v8) {
                        v4 = v8 - 1;
                        this.dc[v8] = this.dc[v4];
                        this.dj[v8] = this.dj[v4];
                        this.ds[v8] = this.ds[v4];
                    }

                    this.dc[0] = arg6;
                    this.dj[0] = arg7;
                    this.ds[0] = 1;
                    return;
                }
            }
        }

        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg6;
        this.dj[0] = arg7;
        this.bp = this.by * 0x9F4AB013 + this.dc[0] * 0x7CFC1580;
        this.bw = this.dj[0] * 0x606A7B1D + this.by * 210364290;
    }

    final void ae(int arg7, byte arg8) {
        int v0 = this.dc[0];
        int v2 = this.dj[0];
        if(arg7 == 0) {
            --v0;
            ++v2;
        }

        if(1 == arg7) {
            ++v2;
        }

        if(arg7 == 2) {
            ++v0;
            ++v2;
        }

        if(3 == arg7) {
            --v0;
        }

        if(4 == arg7) {
            ++v0;
        }

        if(5 == arg7) {
            --v0;
            --v2;
        }

        if(arg7 == 6) {
            --v2;
        }

        if(7 == arg7) {
            ++v0;
            --v2;
        }

        if(this.ch * 0xC64CF9B7 != -1 && fs.al(this.ch * 2011890317, 1304812425).ag * 0xE278EFF4 == 1) {
            this.ch = 0x74A26FBB;
        }

        if(this.dk * -1091885127 < 9) {
            this.dk += 932553065;
        }

        for(arg7 = this.dk * 0xBE0B07A1; arg7 > 0; --arg7) {
            int v5 = arg7 - 1;
            this.dc[arg7] = this.dc[v5];
            this.dj[arg7] = this.dj[v5];
            this.ds[arg7] = this.ds[v5];
        }

        this.dc[0] = v0;
        this.dj[0] = v2;
        this.ds[0] = arg8;
    }

    final boolean ai(int arg3) {
        try {
            if(this.ax != null) {
                return 1;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ii.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return 0;
    }

    final void aj(int arg6, int arg7, boolean arg8) {
        if(this.ch * 0x4AD6BF1E != -1 && fs.al(this.ch * 2011890317, 1304812425).ag * -635149083 == 1) {
            this.ch = 1470139505;
        }

        if(!arg8) {
            int v8 = arg6 - this.dc[0];
            int v1 = arg7 - this.dj[0];
            int v3 = -8;
            if(v8 >= v3) {
                int v4 = 8;
                if(v8 <= v4 && v1 >= v3 && v1 <= v4) {
                    v1 = -1091885127;
                    if(this.dk * v1 < 9) {
                        this.dk += -1133990263;
                    }

                    for(v8 = this.dk * v1; v8 > 0; --v8) {
                        v4 = v8 - 1;
                        this.dc[v8] = this.dc[v4];
                        this.dj[v8] = this.dj[v4];
                        this.ds[v8] = this.ds[v4];
                    }

                    this.dc[0] = arg6;
                    this.dj[0] = arg7;
                    this.ds[0] = 1;
                    return;
                }
            }
        }

        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg6;
        this.dj[0] = arg7;
        this.bp = this.by * 0x58061358 + this.dc[0] * 0xF0D93B16;
        this.bw = this.dj[0] * -728438600 + this.by * 0x35F49CC0;
    }

    final void al(int arg5, int arg6, boolean arg7, byte arg8) {
        try {
            int v0 = 2011890317;
            if(this.ch * v0 != -1 && fs.al(this.ch * v0, 1304812425).ag * -635149083 == 1) {
                this.ch = 0x74A26FBB;
            }

            if(!arg7) {
                int v7 = arg5 - this.dc[0];
                v0 = arg6 - this.dj[0];
                int v1 = -8;
                if(v7 >= v1) {
                    int v3 = 8;
                    if(v7 <= v3 && v0 >= v1 && v0 <= v3) {
                        v0 = -1091885127;
                        if(this.dk * v0 < 9) {
                            this.dk += -1133990263;
                        }

                        for(v7 = this.dk * v0; v7 > 0; --v7) {
                            v3 = v7 - 1;
                            this.dc[v7] = this.dc[v3];
                            this.dj[v7] = this.dj[v3];
                            this.ds[v7] = this.ds[v3];
                        }

                        this.dc[0] = arg5;
                        this.dj[0] = arg6;
                        this.ds[0] = 1;
                        return;
                    }
                }
            }

            this.dk = 0;
            this.df = 0;
            this.dy = 0;
            this.dc[0] = arg5;
            this.dj[0] = arg6;
            this.bp = this.by * 0x5F371340 + this.dc[0] * 0x7CFC1580;
            this.bw = this.dj[0] * 0xC5758A80 + this.by * 0x35F49CC0;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ii.al(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    final void an(int arg7, byte arg8) {
        int v0 = this.dc[0];
        int v2 = this.dj[0];
        if(arg7 == 0) {
            --v0;
            ++v2;
        }

        if(1 == arg7) {
            ++v2;
        }

        if(arg7 == 2) {
            ++v0;
            ++v2;
        }

        if(3 == arg7) {
            --v0;
        }

        if(4 == arg7) {
            ++v0;
        }

        if(5 == arg7) {
            --v0;
            --v2;
        }

        if(arg7 == 6) {
            --v2;
        }

        if(7 == arg7) {
            ++v0;
            --v2;
        }

        int v4 = 2011890317;
        if(this.ch * v4 != -1 && fs.al(this.ch * v4, 1304812425).ag * -635149083 == 1) {
            this.ch = 0x74A26FBB;
        }

        int v3 = -1091885127;
        if(this.dk * v3 < 9) {
            this.dk += -1133990263;
        }

        for(arg7 = this.dk * v3; arg7 > 0; --arg7) {
            int v5 = arg7 - 1;
            this.dc[arg7] = this.dc[v5];
            this.dj[arg7] = this.dj[v5];
            this.ds[arg7] = this.ds[v5];
        }

        this.dc[0] = v0;
        this.dj[0] = v2;
        this.ds[0] = arg8;
    }

    final void ap(int arg7, byte arg8) {
        int v0 = this.dc[0];
        int v2 = this.dj[0];
        if(arg7 == 0) {
            --v0;
            ++v2;
        }

        if(1 == arg7) {
            ++v2;
        }

        if(arg7 == 2) {
            ++v0;
            ++v2;
        }

        if(3 == arg7) {
            --v0;
        }

        if(4 == arg7) {
            ++v0;
        }

        if(5 == arg7) {
            --v0;
            --v2;
        }

        if(arg7 == 6) {
            --v2;
        }

        if(7 == arg7) {
            ++v0;
            --v2;
        }

        if(this.ch * 0xA0F7609 != -1 && fs.al(this.ch * 2011890317, 1304812425).ag * 904235886 == 1) {
            this.ch = 0x74A26FBB;
        }

        if(this.dk * 0x1A402910 < 9) {
            this.dk += -1133990263;
        }

        for(arg7 = this.dk * 0x66D7826F; arg7 > 0; --arg7) {
            int v5 = arg7 - 1;
            this.dc[arg7] = this.dc[v5];
            this.dj[arg7] = this.dj[v5];
            this.ds[arg7] = this.ds[v5];
        }

        this.dc[0] = v0;
        this.dj[0] = v2;
        this.ds[0] = arg8;
    }

    final void ar(int arg7, byte arg8) {
        int v0 = this.dc[0];
        int v2 = this.dj[0];
        if(arg7 == 0) {
            --v0;
            ++v2;
        }

        if(1 == arg7) {
            ++v2;
        }

        if(arg7 == 2) {
            ++v0;
            ++v2;
        }

        if(3 == arg7) {
            --v0;
        }

        if(4 == arg7) {
            ++v0;
        }

        if(5 == arg7) {
            --v0;
            --v2;
        }

        if(arg7 == 6) {
            --v2;
        }

        if(7 == arg7) {
            ++v0;
            --v2;
        }

        if(this.ch * 2026030008 != -1 && fs.al(this.ch * 2011890317, 1304812425).ag * -635149083 == 1) {
            this.ch = 0x74A26FBB;
        }

        int v3 = -1091885127;
        if(this.dk * v3 < 9) {
            this.dk += -1133990263;
        }

        for(arg7 = this.dk * v3; arg7 > 0; --arg7) {
            int v5 = arg7 - 1;
            this.dc[arg7] = this.dc[v5];
            this.dj[arg7] = this.dj[v5];
            this.ds[arg7] = this.ds[v5];
        }

        this.dc[0] = v0;
        this.dj[0] = v2;
        this.ds[0] = arg8;
    }

    protected final ca as() {
        ca v0_1;
        df v8;
        try {
            ca v1 = null;
            if(this.ax == null) {
                return v1;
            }

            int v2 = 2011890317;
            int v3 = 1304812425;
            int v4 = -1;
            df v6 = this.ch * v2 == v4 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
            v2 = -1493580901;
            if(v4 != this.cp * v2) {
                if(this.bv * 630408529 == this.cp * v2 && v6 != null) {
                    goto label_36;
                }

                v8 = fs.al(this.cp * v2, v3);
            }
            else {
            label_36:
                v8 = ((df)v1);
            }

            v0_1 = this.ax.ap(v6, this.ce * 0x38617D1D, v8, this.ci * 0x6F0EB545, 427107861);
            if(v0_1 == null) {
                return v1;
            }

            v0_1.ap();
            this.db = v0_1.bh * 0x76F6ABEF;
            v2 = 0xA760211D;
            if(this.cl * v2 != v4) {
                int v5 = 432280651;
                if(v4 != this.ck * v5) {
                    v1 = di.al(this.cl * v2, 21).an(this.ck * v5, -2073342328);
                    if(v1 != null) {
                        v1.az(0, -(this.cu * 0x388F2DAF), 0);
                        v0_1 = new ca(new ca[]{v0_1, v1}, 2);
                    }
                }
            }

            if(1 == this.ax.aj * 0xD6248411) {
                v0_1.bf = true;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("ii.as(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }

        return v0_1;
    }

    static final boolean aw(int arg0, int arg1, int arg2) {
        arg2 = 709323622;
        try {
            do v0_1 = ok.al(arg0, arg2);
            if(arg1 == 11) {
                arg1 = 10;
            }

            if(arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }

            return v0_1.ap(arg1, 0x97B395E5);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ii.aw(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    final void ax(int arg6, byte arg7, int arg8) {
        try {
            arg8 = this.dc[0];
            int v1 = this.dj[0];
            if(arg6 == 0) {
                --arg8;
                ++v1;
            }

            if(1 == arg6) {
                ++v1;
            }

            if(arg6 == 2) {
                ++arg8;
                ++v1;
            }

            if(3 == arg6) {
                --arg8;
            }

            if(4 == arg6) {
                ++arg8;
            }

            if(5 == arg6) {
                --arg8;
                --v1;
            }

            if(arg6 == 6) {
                --v1;
            }

            if(7 == arg6) {
                ++arg8;
                --v1;
            }

            int v3 = 2011890317;
            if(this.ch * v3 != -1 && fs.al(this.ch * v3, 1304812425).ag * -635149083 == 1) {
                this.ch = 0x74A26FBB;
            }

            int v2 = -1091885127;
            if(this.dk * v2 < 9) {
                this.dk += -1133990263;
            }

            for(arg6 = this.dk * v2; arg6 > 0; --arg6) {
                int v4 = arg6 - 1;
                this.dc[arg6] = this.dc[v4];
                this.dj[arg6] = this.dj[v4];
                this.ds[arg6] = this.ds[v4];
            }

            this.dc[0] = arg8;
            this.dj[0] = v1;
            this.ds[0] = arg7;
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("ii.ax(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    final boolean bs() {
        if(this.ax == null) {
            return 0;
        }

        return 1;
    }

    static void bw(int[] arg18, int[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28) {
        int v11;
        int v1 = arg27;
        int v2 = 0xFF;
        if(v1 < v2) {
            goto label_17;
        }

        short v10 = 0x45D;
        int[] v1_1 = arg18;
        int[] v2_1 = arg19;
        int v4 = arg21;
        int v5 = arg22;
        int v6 = arg23;
        int v7 = arg24;
        int v8 = arg25;
        int v9 = arg26;
        try {
            az.ah(v1_1, v2_1, 0, v4, v5, v6, v7, v8, v9, v10);
            return;
        label_17:
            int v3 = v1 << 24;
            v4 = -arg24;
            v5 = arg21;
            v6 = arg22;
            while(true) {
            label_22:
                if(v4 >= 0) {
                    return;
                }

                v8 = -arg23;
                while(true) {
                label_25:
                    if(v8 >= 0) {
                        goto label_85;
                    }

                    v9 = v5 + 1;
                    v5 = arg19[v5];
                    if(v5 != 0) {
                        v11 = arg18[v6];
                        if(v11 == 0) {
                            v11 = v6 + 1;
                            arg18[v6] = v5 & 0xFFFFFF | v3;
                        }
                        else {
                            int v12 = v11 >>> 24;
                            int v13 = 0xFF - v12;
                            int v14 = (0xFF - v1) * v13 / v2 + v1;
                            int v15 = 0xFF - v14;
                            arg18[v6] = ((v5 & 0xFF00) * v14 + (v11 & 0xFF00) * v15 & 0xFF0000) + (0xFF00FF00 & v14 * (v5 & 0xFF00FF) + (v11 & 0xFF00FF) * v15) >>> 8 | v13 * v1 / v2 + v12 << 24;
                            v11 = v6 + 1;
                        }

                        break;
                    }
                    else {
                        goto label_72;
                    }
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_76;
        }

        v6 = v11;
        goto label_73;
    label_72:
        ++v6;
    label_73:
        ++v8;
        v5 = v9;
        goto label_25;
    label_85:
        v6 += arg25;
        v5 += arg26;
        ++v4;
        goto label_22;
        return;
    label_76:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ii.bw(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    protected final ca db() {
        df v8;
        ca v1 = null;
        if(this.ax == null) {
            return v1;
        }

        int v2 = 2011890317;
        int v3 = 1304812425;
        int v4 = -1;
        df v6 = this.ch * v2 == v4 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
        v2 = -1493580901;
        if(v4 != this.cp * v2) {
            if(this.bv * 630408529 == this.cp * v2 && v6 != null) {
                goto label_36;
            }

            v8 = fs.al(this.cp * v2, v3);
        }
        else {
        label_36:
            v8 = ((df)v1);
        }

        ca v0 = this.ax.ap(v6, this.ce * 0x38617D1D, v8, this.ci * 0x6F0EB545, 0xEE40FB83);
        if(v0 == null) {
            return v1;
        }

        v0.ap();
        this.db = v0.bh * 0x76F6ABEF;
        v2 = 0xA760211D;
        if(this.cl * v2 != v4) {
            int v5 = 432280651;
            if(v4 != this.ck * v5) {
                v1 = di.al(this.cl * v2, 21).an(this.ck * v5, 0x32A513D5);
                if(v1 != null) {
                    v1.az(0, -(this.cu * 0x388F2DAF), 0);
                    v0 = new ca(new ca[]{v0, v1}, 2);
                }
            }
        }

        if(1 == this.ax.aj * 0xD6248411) {
            v0.bf = true;
        }

        return v0;
    }

    protected final ca dm() {
        df v8;
        ca v1 = null;
        if(this.ax == null) {
            return v1;
        }

        int v2 = 2011890317;
        int v3 = 1304812425;
        int v4 = -1;
        df v6 = this.ch * v2 == v4 || this.cz * 0xFA24C7A3 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
        v2 = -1493580901;
        if(v4 != this.cp * v2) {
            if(this.bv * 0xD8BA7B17 == this.cp * 1903153850 && v6 != null) {
                goto label_37;
            }

            v8 = fs.al(this.cp * v2, v3);
        }
        else {
        label_37:
            v8 = ((df)v1);
        }

        ca v0 = this.ax.ap(v6, this.ce * 0x38617D1D, v8, this.ci * 0x72B01E0F, 0x3F5C726F);
        if(v0 == null) {
            return v1;
        }

        v0.ap();
        this.db = v0.bh * 0x76F6ABEF;
        if(this.cl * 0xA760211D != v4 && v4 != this.ck * 0x22FC4752) {
            v1 = di.al(this.cl * 0xC7C00CEC, 21).an(this.ck * 432280651, 0x9F4D1FF7);
            if(v1 != null) {
                v1.az(0, -(this.cu * 0x388F2DAF), 0);
                v0 = new ca(new ca[]{v0, v1}, 2);
            }
        }

        if(1 == this.ax.aj * 0xD6248411) {
            v0.bf = true;
        }

        return v0;
    }

    protected final ca du() {
        df v7;
        ca v1 = null;
        if(this.ax == null) {
            return v1;
        }

        int v2 = 1304812425;
        int v3 = -1;
        df v5 = this.ch * 0x56B2AFFB == v3 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * 2011890317, v2);
        if(v3 != this.cp * 0x6E490B6F) {
            if(this.bv * -1586066795 == this.cp * 0x6FF18E17 && v5 != null) {
                goto label_39;
            }

            v7 = fs.al(this.cp * 420040157, v2);
        }
        else {
        label_39:
            v7 = ((df)v1);
        }

        ca v0 = this.ax.ap(v5, this.ce * 0x3350F452, v7, this.ci * 0x6F0EB545, 0xCDF5BD22);
        if(v0 == null) {
            return v1;
        }

        v0.ap();
        this.db = v0.bh * -299517004;
        if(this.cl * 0xDB2AE1E8 != v3) {
            int v4 = 432280651;
            if(v3 != this.ck * v4) {
                v1 = di.al(this.cl * 0xAF006878, 21).an(this.ck * v4, 1983277709);
                if(v1 != null) {
                    v1.az(0, -(this.cu * 0x388F2DAF), 0);
                    v0 = new ca(new ca[]{v0, v1}, 2);
                }
            }
        }

        if(1 == this.ax.aj * -1716800294) {
            v0.bf = true;
        }

        return v0;
    }

    static boolean dx(int arg2) {
        boolean v0;
        try {
            v0 = true;
            if((client.jy * 0x2324F123 & 1) == 0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ii.dx(");
            v0_1.append(')');
            throw lx.al(((Throwable)v2), v0_1.toString());
        }

        return v0;
    }
}

