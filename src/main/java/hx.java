public class hx extends hz {
    int aa;
    int ab;
    int ad;
    int ae;
    boolean af;
    int ai;
    int aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int au;
    int av;
    int ax;

    hx(hs arg2, int arg3, int arg4) {
        super();
        this.ag = ((gd)arg2);
        this.aq = arg2.ar;
        this.ab = arg2.an;
        this.af = arg2.ap;
        this.al = arg3;
        this.ae = arg4;
        this.ar = 0x2000;
        this.ax = 0;
        this.an();
    }

    hx(hs arg2, int arg3, int arg4, int arg5) {
        super();
        this.ag = ((gd)arg2);
        this.aq = arg2.ar;
        this.ab = arg2.an;
        this.af = arg2.ap;
        this.al = arg3;
        this.ae = arg4;
        this.ar = arg5;
        this.ax = 0;
        this.an();
    }

    void aa(int arg1, int arg2) {
        __monitor_enter(this);
        try {
            this.ae = arg1;
            this.ar = arg2;
            this.ai = 0;
            this.an();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    public void ab(int arg1) {
        __monitor_enter(this);
        try {
            this.ad = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    protected hz ac() {
        return null;
    }

    protected int ad() {
        if(this.ae == 0 && this.ai == 0) {
            return 0;
        }

        return 1;
    }

    public static hx ae(hs arg5, int arg6, int arg7) {
        if(arg5.ae != null) {
            if(arg5.ae.length == 0) {
            }
            else {
                return new hx(arg5, ((int)((((long)arg5.al)) * 0x100 * (((long)arg6)) / (((long)(ht.ax * 968021268))))), arg7 << 6);
            }
        }

        return null;
    }

    public void af(int arg8) {
        int v4;
        int v0_1;
        int v3;
        int v2;
        __monitor_enter(this);
        try {
            if(this.ai > 0) {
                if(arg8 >= this.ai) {
                    if(this.ae == 0x80000000) {
                        this.ae = 0;
                        this.aj = 0;
                        this.ap = 0;
                        this.an = 0;
                        this.lp();
                        arg8 = this.ai;
                    }

                    this.ai = 0;
                    this.an();
                }
                else {
                    this.an += this.av * arg8;
                    this.ap += this.aa * arg8;
                    this.aj += this.au * arg8;
                    this.ai -= arg8;
                }
            }

            gd v0 = this.ag;
            v2 = this.aq << 8;
            v3 = this.ab << 8;
            v0_1 = ((hs)v0).ae.length << 8;
            v4 = v3 - v2;
            if(v4 <= 0) {
                this.ad = 0;
            }

            if(this.ax < 0) {
                if(this.al > 0) {
                    this.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_55;
                }
            }

            goto label_57;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_55:
        __monitor_exit(this);
        return;
        try {
        label_57:
            if(this.ax >= v0_1) {
                if(this.al < 0) {
                    this.ax = v0_1 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_66;
                }
            }

            goto label_68;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_66:
        __monitor_exit(this);
        return;
        try {
        label_68:
            this.ax += this.al * arg8;
            if(this.ad >= 0) {
                goto label_140;
            }

            if(!this.af) {
                goto label_116;
            }

            if(this.al < 0) {
                if(this.ax >= v2) {
                    goto label_81;
                }
                else {
                    goto label_83;
                }
            }

            goto label_91;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_81:
        __monitor_exit(this);
        return;
    label_83:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
        label_91:
            while(this.ax < v3) {
                goto label_93;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        arg8 = v3 + v3 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            if(this.ax < v2) {
                goto label_107;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_107:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            goto label_91;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_93:
        __monitor_exit(this);
        return;
        try {
        label_116:
            if(this.al >= 0) {
                goto label_129;
            }
            else if(this.ax >= v2) {
            }
            else {
                goto label_122;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_122:
        --v3;
        try {
            this.ax = v3 - (v3 - this.ax) % v4;
            goto label_138;
        label_129:
            if(this.ax < v3) {
            }
            else {
                goto label_133;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
        try {
        label_133:
            this.ax = v2 + (this.ax - v2) % v4;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_138:
        __monitor_exit(this);
        return;
        try {
        label_140:
            if(this.ad > 0) {
                if(this.af) {
                    if(this.al < 0) {
                        if(this.ax >= v2) {
                            goto label_148;
                        }
                        else {
                            goto label_150;
                        }
                    }

                    goto label_163;
                }
                else {
                    goto label_197;
                }
            }

            goto label_249;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_148:
        __monitor_exit(this);
        return;
    label_150:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 == 0) {
                goto label_249;
            }

            do {
            label_163:
                if(this.ax >= v3) {
                    break;
                }

                goto label_165;
            }
            while(true);
        }
        catch(Throwable v8) {
            goto label_266;
        }

        arg8 = v3 + v3 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 == 0) {
                goto label_249;
            }

            if(this.ax < v2) {
                goto label_184;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_184:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 != 0) {
                goto label_163;
            }

            goto label_249;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_165:
        __monitor_exit(this);
        return;
        try {
        label_197:
            if(this.al >= 0) {
                goto label_224;
            }
            else if(this.ax >= v2) {
            }
            else {
                goto label_203;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_203:
        --v3;
        try {
            v3 = (v3 - this.ax) / v4;
            if(v3 >= this.ad) {
                this.ax += v4 * this.ad;
                this.ad = 0;
                goto label_249;
            }
            else {
                this.ax += v4 * v3;
                this.ad -= v3;
                goto label_247;
            label_224:
                if(this.ax < v3) {
                    goto label_226;
                }
                else {
                    goto label_228;
                }
            }

            goto label_247;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_226:
        __monitor_exit(this);
        return;
        try {
        label_228:
            arg8 = (this.ax - v2) / v4;
            if(arg8 >= this.ad) {
                this.ax -= v4 * this.ad;
                this.ad = 0;
                goto label_249;
            }
            else {
                this.ax -= v4 * arg8;
                this.ad -= arg8;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_247:
        __monitor_exit(this);
        return;
        try {
        label_249:
            if(this.al < 0) {
                if(this.ax < 0) {
                    this.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else if(this.ax >= v0_1) {
                this.ax = v0_1;
                this.ah();
                this.lp();
            }
        }
        catch(Throwable v8) {
        label_266:
            __monitor_exit(this);
            throw v8;
        }

        __monitor_exit(this);
    }

    public void ag(boolean arg3) {
        __monitor_enter(this);
        try {
            this.al = (this.al ^ this.al >> 0x1F) + (this.al >>> 0x1F);
            if(arg3) {
                this.al = -this.al;
            }
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    void ah() {
        if(this.ai != 0) {
            if(this.ae == 0x80000000) {
                this.ae = 0;
            }

            this.ai = 0;
            this.an();
        }
    }

    public void ai(int arg2) {
        __monitor_enter(this);
        arg2 <<= 6;
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    protected hz aj() {
        return null;
    }

    public boolean ak() {
        boolean v0 = this.ax < 0 || this.ax >= this.ag.ae.length << 8 ? true : false;
        return v0;
    }

    static int al(int arg4, int arg5) {
        return arg5 < 0 ? -arg4 : ((int)((((double)arg4)) * Math.sqrt((((double)arg5)) * 0.000122) + 0.5));
    }

    public int am() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ar < 0 ? -1 : this.ar;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void an() {
        this.an = this.ae;
        this.ap = hx.ax(this.ae, this.ar);
        this.aj = hx.al(this.ae, this.ar);
    }

    public void ao(int arg2) {
        __monitor_enter(this);
        try {
            this.al = this.al < 0 ? -arg2 : arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    protected hz ap() {
        return null;
    }

    public void aq(int[] arg15, int arg16, int arg17) {
        int v3;
        int v1;
        int v12;
        int v11;
        int v10;
        int v9;
        gd v8;
        hx v7 = this;
        int v0 = arg17;
        __monitor_enter(this);
        try {
            if(v7.ae == 0 && v7.ai == 0) {
                this.af(v0);
                goto label_8;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_8:
        __monitor_exit(this);
        return;
        try {
        label_10:
            v8 = v7.ag;
            v9 = v7.aq << 8;
            v10 = v7.ab << 8;
            v11 = ((hs)v8).ae.length << 8;
            v12 = v10 - v9;
            if(v12 <= 0) {
                v7.ad = 0;
            }

            v0 += arg16;
            if(v7.ax < 0) {
                if(v7.al > 0) {
                    v7.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_32;
                }
            }

            goto label_34;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_32:
        __monitor_exit(this);
        return;
        try {
        label_34:
            if(v7.ax >= v11) {
                if(v7.al < 0) {
                    v7.ax = v11 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_43;
                }
            }

            goto label_45;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_43:
        __monitor_exit(this);
        return;
        try {
        label_45:
            if(v7.ad >= 0) {
                goto label_159;
            }

            if(!v7.af) {
                goto label_117;
            }

            if(v7.al < 0) {
                v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax >= v9) {
                    goto label_62;
                }
                else {
                    goto label_64;
                }
            }
            else {
                goto label_74;
            }

            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_62:
        __monitor_exit(this);
        return;
    label_64:
        int v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v3 = v1;
            goto label_75;
        label_74:
            v3 = arg16;
            while(true) {
            label_75:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_86;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_108;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_108:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_86:
        __monitor_exit(this);
        return;
        try {
        label_117:
            if(v7.al >= 0) {
                goto label_140;
            }

            v3 = arg16;
            while(true) {
            label_120:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_131;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v7.ax = v1 - (v1 - v7.ax) % v12;
            goto label_120;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_131:
        __monitor_exit(this);
        return;
        try {
        label_140:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v7.ax = (v7.ax - v9) % v12 + v9;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_159:
            if(v7.ad <= 0) {
                goto label_316;
            }
            else if(v7.af) {
                if(v7.al < 0) {
                    v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                    if(v7.ax >= v9) {
                        goto label_176;
                    }
                    else {
                        goto label_178;
                    }
                }
                else {
                    goto label_194;
                }

                goto label_195;
            }
            else {
                goto label_246;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_176:
        __monitor_exit(this);
        return;
    label_178:
        v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v2 = v7.ad - 1;
            v7.ad = v2;
            if(v2 == 0) {
                v3 = v1;
                goto label_317;
            }
            else {
                v3 = v1;
                goto label_195;
            label_194:
                v3 = arg16;
            }

            do {
            label_195:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_206;
            }
            while(true);
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 == 0) {
                goto label_317;
            }

            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_233;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_233:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 != 0) {
                goto label_195;
            }

            goto label_317;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_206:
        __monitor_exit(this);
        return;
        try {
        label_246:
            if(v7.al >= 0) {
                goto label_283;
            }

            v3 = arg16;
            while(true) {
            label_249:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_260;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v1 = (v1 - v7.ax) / v12;
            if(v1 >= v7.ad) {
                v7.ax += v12 * v7.ad;
                v7.ad = 0;
                goto label_317;
            }

            v7.ax += v12 * v1;
            v7.ad -= v1;
            goto label_249;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_260:
        __monitor_exit(this);
        return;
        try {
        label_283:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v1 = (v7.ax - v9) / v12;
                if(v1 >= v7.ad) {
                    v7.ax -= v12 * v7.ad;
                    v7.ad = 0;
                    goto label_317;
                }

                v7.ax -= v12 * v1;
                v7.ad -= v1;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_316:
            v3 = arg16;
        label_317:
            if(v7.al < 0) {
                this.bx(arg15, v3, 0, v0, 0);
                if(v7.ax < 0) {
                    v7.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else {
                this.bq(arg15, v3, v11, v0, 0);
                if(v7.ax >= v11) {
                    v7.ax = v11;
                    this.ah();
                    this.lp();
                }
            }
        }
        catch(Throwable v0_1) {
        label_346:
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    public static hx ar(hs arg1, int arg2, int arg3, int arg4) {
        if(arg1.ae != null) {
            if(arg1.ae.length == 0) {
            }
            else {
                return new hx(arg1, arg2, arg3, arg4);
            }
        }

        return null;
    }

    public int as() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void at(int arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.ay(arg2, arg3, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public int au() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ae == 0x80000000 ? 0 : this.ae;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void av(int arg2) {
        __monitor_enter(this);
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void aw(int arg3) {
        __monitor_enter(this);
        if(arg3 == 0) {
            try {
                this.av(0);
                this.lp();
            }
            catch(Throwable v3) {
                goto label_59;
            }

            __monitor_exit(this);
            return;
        }

        try {
            if(this.ap == 0 && this.aj == 0) {
                this.ai = 0;
                this.ae = 0;
                this.an = 0;
                this.lp();
                goto label_17;
            }

            goto label_19;
        }
        catch(Throwable v3) {
            goto label_59;
        }

    label_17:
        __monitor_exit(this);
        return;
        try {
        label_19:
            int v0 = -this.an;
            if(this.an > v0) {
                v0 = this.an;
            }

            if(-this.ap > v0) {
                v0 = -this.ap;
            }

            if(this.ap > v0) {
                v0 = this.ap;
            }

            if(-this.aj > v0) {
                v0 = -this.aj;
            }

            if(this.aj > v0) {
                v0 = this.aj;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ai = arg3;
            this.ae = 0x80000000;
            this.av = -this.an / arg3;
            this.aa = -this.ap / arg3;
            this.au = -this.aj / arg3;
        }
        catch(Throwable v3) {
        label_59:
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    static int ax(int arg4, int arg5) {
        if(arg5 < 0) {
        }
        else {
            arg4 = ((int)((((double)arg4)) * Math.sqrt((((double)(0x4000 - arg5))) * 0.000122) + 0.5));
        }

        return arg4;
    }

    public void ay(int arg5, int arg6, int arg7) {
        int v1;
        int v0;
        __monitor_enter(this);
        if(arg5 == 0) {
            try {
                this.aa(arg6, arg7);
            }
            catch(Throwable v5) {
                goto label_62;
            }

            __monitor_exit(this);
            return;
        }

        try {
            v0 = hx.ax(arg6, arg7);
            v1 = hx.al(arg6, arg7);
            if(this.ap == v0 && this.aj == v1) {
                this.ai = 0;
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v5) {
            goto label_62;
        }

    label_13:
        __monitor_exit(this);
        return;
        try {
        label_15:
            int v2 = arg6 - this.an;
            if(this.an - arg6 > v2) {
                v2 = this.an - arg6;
            }

            if(v0 - this.ap > v2) {
                v2 = v0 - this.ap;
            }

            if(this.ap - v0 > v2) {
                v2 = this.ap - v0;
            }

            if(v1 - this.aj > v2) {
                v2 = v1 - this.aj;
            }

            if(this.aj - v1 > v2) {
                v2 = this.aj - v1;
            }

            if(arg5 > v2) {
                arg5 = v2;
            }

            this.ai = arg5;
            this.ae = arg6;
            this.ar = arg7;
            this.av = (arg6 - this.an) / arg5;
            this.aa = (v0 - this.ap) / arg5;
            this.au = (v1 - this.aj) / arg5;
        }
        catch(Throwable v5) {
        label_62:
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public void az(int arg3) {
        __monitor_enter(this);
        try {
            int v0 = this.ag.ae.length << 8;
            if(arg3 < -1) {
                arg3 = -1;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ax = arg3;
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    protected hz ba() {
        return null;
    }

    static int bb(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = (arg10 >> 8) + arg5 - arg1;
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int bc(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = arg4 + arg3 - ((arg8 >> 8) - 1);
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 - 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 - 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            --arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    protected hz bd() {
        return null;
    }

    static int be(int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg2 = (arg12 + 0x100 - arg6 + arg14) / arg14 + arg7;
            if(arg2 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg2 = arg11;
        }

        arg3 = arg7 << 1;
        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = arg6 >> 8;
            int v0 = (arg4[arg7 - 1] << 8) + (arg4[arg7] - arg4[arg7 - 1]) * (arg6 & 0xFF);
            arg7 = arg3 + 1;
            arg5[arg3] += v0 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += v0 * arg9 >> 6;
            arg6 += arg14;
        }

        if(arg14 != 0) {
            arg2 = (arg3 >> 1) + (arg12 - arg6 + arg14) / arg14;
            if(arg2 > arg11) {
                goto label_41;
            }
        }
        else {
        label_41:
            arg2 = arg11;
        }

        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = (arg15 << 8) + (arg4[arg6 >> 8] - arg15) * (arg6 & 0xFF);
            arg10 = arg3 + 1;
            arg5[arg3] += arg7 * arg8 >> 6;
            arg3 = arg10 + 1;
            arg5[arg10] += arg7 * arg9 >> 6;
            arg6 += arg14;
        }

        arg13.ax = arg6;
        return arg3 >> 1;
    }

    protected int bf() {
        if(this.ae == 0 && this.ai == 0) {
            return 0;
        }

        return 1;
    }

    boolean bg() {
        int v4;
        int v3;
        int v0 = this.ae;
        int v1 = 0x80000000;
        if(v0 == v1) {
            v0 = 0;
            v3 = 0;
            v4 = 0;
        }
        else {
            v3 = hx.ax(v0, this.ar);
            v4 = hx.al(v0, this.ar);
        }

        if(this.an == v0 && this.ap == v3) {
            if(this.aj != v4) {
            }
            else if(this.ae == v1) {
                this.ae = 0;
                this.aj = 0;
                this.ap = 0;
                this.an = 0;
                this.lp();
                return 1;
            }
            else {
                this.an();
                return 0;
            }
        }

        int v5 = -1;
        if(this.an < v0) {
            this.av = 1;
            this.ai = v0 - this.an;
        }
        else if(this.an > v0) {
            this.av = v5;
            this.ai = this.an - v0;
        }
        else {
            this.av = 0;
        }

        if(this.ap < v3) {
            this.aa = 1;
            if(this.ai != 0 && this.ai <= v3 - this.ap) {
                goto label_73;
            }

            this.ai = v3 - this.ap;
        }
        else {
            if(this.ap > v3) {
                this.aa = v5;
                if(this.ai != 0 && this.ai <= this.ap - v3) {
                    goto label_73;
                }

                this.ai = this.ap - v3;
                goto label_73;
            }

            this.aa = 0;
        }

    label_73:
        if(this.aj < v4) {
            this.au = 1;
            if(this.ai != 0 && this.ai <= v4 - this.aj) {
                return 0;
            }

            this.ai = v4 - this.aj;
        }
        else {
            if(this.aj > v4) {
                this.au = v5;
                if(this.ai != 0 && this.ai <= this.aj - v4) {
                    return 0;
                }

                this.ai = this.aj - v4;
                return 0;
            }

            this.au = 0;
        }

        return 0;
    }

    static int bh(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = (arg8 >> 8) + arg4 - arg3;
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 + 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 + 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            ++arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    static int bi(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + arg3 - ((arg9 >> 8) - 1);
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 - 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 - 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            --arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int bj(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (arg12 - arg7 + arg14 - 0x101) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4] << 8) + (arg5[arg4 + 1] - arg5[arg4]) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14 - 1) / arg14;
            if(arg3 > arg11) {
                goto label_34;
            }
        }
        else {
        label_34:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg5[arg7 >> 8] << 8) + (arg15 - arg5[arg7 >> 8]) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    int bk() {
        int v2;
        int v0 = this.an * 3 >> 6;
        int v1 = (v0 >> 0x1F ^ v0) + (v0 >>> 0x1F);
        if(this.ad == 0) {
            v0 = this.ax * v1;
            v2 = this.ag.ae.length << 8;
            goto label_15;
        }
        else if(this.ad >= 0) {
            v0 = this.aq * v1;
            v2 = this.ag.ae.length;
        label_15:
            v1 -= v0 / v2;
        }

        v0 = 0xFF;
        if(v1 > v0) {
        }
        else {
            v0 = v1;
        }

        return v0;
    }

    static int bl(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = (arg9 >> 8) + arg4 - arg3;
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 + 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 + 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            ++arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int bm(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = arg5 + arg1 - ((arg10 >> 8) - 1);
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    protected int bn() {
        if(this.ae == 0 && this.ai == 0) {
            return 0;
        }

        return 1;
    }

    public void bo(int[] arg15, int arg16, int arg17) {
        int v3;
        int v1;
        int v12;
        int v11;
        int v10;
        int v9;
        gd v8;
        hx v7 = this;
        int v0 = arg17;
        __monitor_enter(this);
        try {
            if(v7.ae == 0 && v7.ai == 0) {
                this.af(v0);
                goto label_8;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_8:
        __monitor_exit(this);
        return;
        try {
        label_10:
            v8 = v7.ag;
            v9 = v7.aq << 8;
            v10 = v7.ab << 8;
            v11 = ((hs)v8).ae.length << 8;
            v12 = v10 - v9;
            if(v12 <= 0) {
                v7.ad = 0;
            }

            v0 += arg16;
            if(v7.ax < 0) {
                if(v7.al > 0) {
                    v7.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_32;
                }
            }

            goto label_34;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_32:
        __monitor_exit(this);
        return;
        try {
        label_34:
            if(v7.ax >= v11) {
                if(v7.al < 0) {
                    v7.ax = v11 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_43;
                }
            }

            goto label_45;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_43:
        __monitor_exit(this);
        return;
        try {
        label_45:
            if(v7.ad >= 0) {
                goto label_159;
            }

            if(!v7.af) {
                goto label_117;
            }

            if(v7.al < 0) {
                v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax >= v9) {
                    goto label_62;
                }
                else {
                    goto label_64;
                }
            }
            else {
                goto label_74;
            }

            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_62:
        __monitor_exit(this);
        return;
    label_64:
        int v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v3 = v1;
            goto label_75;
        label_74:
            v3 = arg16;
            while(true) {
            label_75:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_86;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_108;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_108:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_86:
        __monitor_exit(this);
        return;
        try {
        label_117:
            if(v7.al >= 0) {
                goto label_140;
            }

            v3 = arg16;
            while(true) {
            label_120:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_131;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v7.ax = v1 - (v1 - v7.ax) % v12;
            goto label_120;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_131:
        __monitor_exit(this);
        return;
        try {
        label_140:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v7.ax = (v7.ax - v9) % v12 + v9;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_159:
            if(v7.ad <= 0) {
                goto label_316;
            }
            else if(v7.af) {
                if(v7.al < 0) {
                    v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                    if(v7.ax >= v9) {
                        goto label_176;
                    }
                    else {
                        goto label_178;
                    }
                }
                else {
                    goto label_194;
                }

                goto label_195;
            }
            else {
                goto label_246;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_176:
        __monitor_exit(this);
        return;
    label_178:
        v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v2 = v7.ad - 1;
            v7.ad = v2;
            if(v2 == 0) {
                v3 = v1;
                goto label_317;
            }
            else {
                v3 = v1;
                goto label_195;
            label_194:
                v3 = arg16;
            }

            do {
            label_195:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_206;
            }
            while(true);
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 == 0) {
                goto label_317;
            }

            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_233;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_233:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 != 0) {
                goto label_195;
            }

            goto label_317;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_206:
        __monitor_exit(this);
        return;
        try {
        label_246:
            if(v7.al >= 0) {
                goto label_283;
            }

            v3 = arg16;
            while(true) {
            label_249:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_260;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v1 = (v1 - v7.ax) / v12;
            if(v1 >= v7.ad) {
                v7.ax += v12 * v7.ad;
                v7.ad = 0;
                goto label_317;
            }

            v7.ax += v12 * v1;
            v7.ad -= v1;
            goto label_249;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_260:
        __monitor_exit(this);
        return;
        try {
        label_283:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v1 = (v7.ax - v9) / v12;
                if(v1 >= v7.ad) {
                    v7.ax -= v12 * v7.ad;
                    v7.ad = 0;
                    goto label_317;
                }

                v7.ax -= v12 * v1;
                v7.ad -= v1;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_316:
            v3 = arg16;
        label_317:
            if(v7.al < 0) {
                this.bx(arg15, v3, 0, v0, 0);
                if(v7.ax < 0) {
                    v7.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else {
                this.bq(arg15, v3, v11, v0, 0);
                if(v7.ax >= v11) {
                    v7.ax = v11;
                    this.ah();
                    this.lp();
                }
            }
        }
        catch(Throwable v0_1) {
        label_346:
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    protected int bp() {
        if(this.ae == 0 && this.ai == 0) {
            return 0;
        }

        return 1;
    }

    int bq(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(true) {
            int v1 = 0x100;
            if(v15.ai <= 0) {
                break;
            }

            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != v1 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cd(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.br(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bl(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == v1 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bb(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bh(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.bu(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    static int br(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = (arg12 >> 8) + arg5 - arg1;
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int bs(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (arg12 + 0x100 - arg7 + arg14) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4 - 1] << 8) + (arg5[arg4] - arg5[arg4 - 1]) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14) / arg14;
            if(arg3 > arg11) {
                goto label_33;
            }
        }
        else {
        label_33:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg15 << 8) + (arg5[arg7 >> 8] - arg15) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    public void bt(int[] arg15, int arg16, int arg17) {
        int v3;
        int v1;
        int v12;
        int v11;
        int v10;
        int v9;
        gd v8;
        hx v7 = this;
        int v0 = arg17;
        __monitor_enter(this);
        try {
            if(v7.ae == 0 && v7.ai == 0) {
                this.af(v0);
                goto label_8;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_8:
        __monitor_exit(this);
        return;
        try {
        label_10:
            v8 = v7.ag;
            v9 = v7.aq << 8;
            v10 = v7.ab << 8;
            v11 = ((hs)v8).ae.length << 8;
            v12 = v10 - v9;
            if(v12 <= 0) {
                v7.ad = 0;
            }

            v0 += arg16;
            if(v7.ax < 0) {
                if(v7.al > 0) {
                    v7.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_32;
                }
            }

            goto label_34;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_32:
        __monitor_exit(this);
        return;
        try {
        label_34:
            if(v7.ax >= v11) {
                if(v7.al < 0) {
                    v7.ax = v11 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_43;
                }
            }

            goto label_45;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_43:
        __monitor_exit(this);
        return;
        try {
        label_45:
            if(v7.ad >= 0) {
                goto label_159;
            }

            if(!v7.af) {
                goto label_117;
            }

            if(v7.al < 0) {
                v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax >= v9) {
                    goto label_62;
                }
                else {
                    goto label_64;
                }
            }
            else {
                goto label_74;
            }

            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_62:
        __monitor_exit(this);
        return;
    label_64:
        int v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v3 = v1;
            goto label_75;
        label_74:
            v3 = arg16;
            while(true) {
            label_75:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_86;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_108;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_108:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_86:
        __monitor_exit(this);
        return;
        try {
        label_117:
            if(v7.al >= 0) {
                goto label_140;
            }

            v3 = arg16;
            while(true) {
            label_120:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_131;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v7.ax = v1 - (v1 - v7.ax) % v12;
            goto label_120;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_131:
        __monitor_exit(this);
        return;
        try {
        label_140:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v7.ax = (v7.ax - v9) % v12 + v9;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_159:
            if(v7.ad <= 0) {
                goto label_316;
            }
            else if(v7.af) {
                if(v7.al < 0) {
                    v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                    if(v7.ax >= v9) {
                        goto label_176;
                    }
                    else {
                        goto label_178;
                    }
                }
                else {
                    goto label_194;
                }

                goto label_195;
            }
            else {
                goto label_246;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_176:
        __monitor_exit(this);
        return;
    label_178:
        v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v2 = v7.ad - 1;
            v7.ad = v2;
            if(v2 == 0) {
                v3 = v1;
                goto label_317;
            }
            else {
                v3 = v1;
                goto label_195;
            label_194:
                v3 = arg16;
            }

            do {
            label_195:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_206;
            }
            while(true);
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 == 0) {
                goto label_317;
            }

            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_233;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_233:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 != 0) {
                goto label_195;
            }

            goto label_317;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_206:
        __monitor_exit(this);
        return;
        try {
        label_246:
            if(v7.al >= 0) {
                goto label_283;
            }

            v3 = arg16;
            while(true) {
            label_249:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_260;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v1 = (v1 - v7.ax) / v12;
            if(v1 >= v7.ad) {
                v7.ax += v12 * v7.ad;
                v7.ad = 0;
                goto label_317;
            }

            v7.ax += v12 * v1;
            v7.ad -= v1;
            goto label_249;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_260:
        __monitor_exit(this);
        return;
        try {
        label_283:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v1 = (v7.ax - v9) / v12;
                if(v1 >= v7.ad) {
                    v7.ax -= v12 * v7.ad;
                    v7.ad = 0;
                    goto label_317;
                }

                v7.ax -= v12 * v1;
                v7.ad -= v1;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_316:
            v3 = arg16;
        label_317:
            if(v7.al < 0) {
                this.bx(arg15, v3, 0, v0, 0);
                if(v7.ax < 0) {
                    v7.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else {
                this.bq(arg15, v3, v11, v0, 0);
                if(v7.ax >= v11) {
                    v7.ax = v11;
                    this.ah();
                    this.lp();
                }
            }
        }
        catch(Throwable v0_1) {
        label_346:
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    static int bu(int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg2 = (arg12 - arg6 + arg14 - 0x101) / arg14 + arg7;
            if(arg2 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg2 = arg11;
        }

        arg3 = arg7 << 1;
        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = arg6 >> 8;
            int v0 = (arg4[arg7] << 8) + (arg4[arg7 + 1] - arg4[arg7]) * (arg6 & 0xFF);
            arg7 = arg3 + 1;
            arg5[arg3] += v0 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += v0 * arg9 >> 6;
            arg6 += arg14;
        }

        if(arg14 != 0) {
            arg2 = (arg3 >> 1) + (arg12 - arg6 + arg14 - 1) / arg14;
            if(arg2 > arg11) {
                goto label_42;
            }
        }
        else {
        label_42:
            arg2 = arg11;
        }

        arg2 <<= 1;
        while(arg3 < arg2) {
            arg10 = (arg4[arg6 >> 8] << 8) + (arg15 - arg4[arg6 >> 8]) * (arg6 & 0xFF);
            arg7 = arg3 + 1;
            arg5[arg3] += arg10 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += arg10 * arg9 >> 6;
            arg6 += arg14;
        }

        arg13.ax = arg6;
        return arg3 >> 1;
    }

    public boolean bv() {
        boolean v0 = this.ai != 0 ? true : false;
        return v0;
    }

    public void bw(int[] arg15, int arg16, int arg17) {
        int v3;
        int v1;
        int v12;
        int v11;
        int v10;
        int v9;
        gd v8;
        hx v7 = this;
        int v0 = arg17;
        __monitor_enter(this);
        try {
            if(v7.ae == 0 && v7.ai == 0) {
                this.af(v0);
                goto label_8;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_8:
        __monitor_exit(this);
        return;
        try {
        label_10:
            v8 = v7.ag;
            v9 = v7.aq << 8;
            v10 = v7.ab << 8;
            v11 = ((hs)v8).ae.length << 8;
            v12 = v10 - v9;
            if(v12 <= 0) {
                v7.ad = 0;
            }

            v0 += arg16;
            if(v7.ax < 0) {
                if(v7.al > 0) {
                    v7.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_32;
                }
            }

            goto label_34;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_32:
        __monitor_exit(this);
        return;
        try {
        label_34:
            if(v7.ax >= v11) {
                if(v7.al < 0) {
                    v7.ax = v11 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_43;
                }
            }

            goto label_45;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_43:
        __monitor_exit(this);
        return;
        try {
        label_45:
            if(v7.ad >= 0) {
                goto label_159;
            }

            if(!v7.af) {
                goto label_117;
            }

            if(v7.al < 0) {
                v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax >= v9) {
                    goto label_62;
                }
                else {
                    goto label_64;
                }
            }
            else {
                goto label_74;
            }

            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_62:
        __monitor_exit(this);
        return;
    label_64:
        int v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v3 = v1;
            goto label_75;
        label_74:
            v3 = arg16;
            while(true) {
            label_75:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_86;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_108;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_108:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_86:
        __monitor_exit(this);
        return;
        try {
        label_117:
            if(v7.al >= 0) {
                goto label_140;
            }

            v3 = arg16;
            while(true) {
            label_120:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_131;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v7.ax = v1 - (v1 - v7.ax) % v12;
            goto label_120;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_131:
        __monitor_exit(this);
        return;
        try {
        label_140:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v7.ax = (v7.ax - v9) % v12 + v9;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_159:
            if(v7.ad <= 0) {
                goto label_316;
            }
            else if(v7.af) {
                if(v7.al < 0) {
                    v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                    if(v7.ax >= v9) {
                        goto label_176;
                    }
                    else {
                        goto label_178;
                    }
                }
                else {
                    goto label_194;
                }

                goto label_195;
            }
            else {
                goto label_246;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_176:
        __monitor_exit(this);
        return;
    label_178:
        v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v2 = v7.ad - 1;
            v7.ad = v2;
            if(v2 == 0) {
                v3 = v1;
                goto label_317;
            }
            else {
                v3 = v1;
                goto label_195;
            label_194:
                v3 = arg16;
            }

            do {
            label_195:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_206;
            }
            while(true);
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 == 0) {
                goto label_317;
            }

            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_233;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_233:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 != 0) {
                goto label_195;
            }

            goto label_317;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_206:
        __monitor_exit(this);
        return;
        try {
        label_246:
            if(v7.al >= 0) {
                goto label_283;
            }

            v3 = arg16;
            while(true) {
            label_249:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_260;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v1 = (v1 - v7.ax) / v12;
            if(v1 >= v7.ad) {
                v7.ax += v12 * v7.ad;
                v7.ad = 0;
                goto label_317;
            }

            v7.ax += v12 * v1;
            v7.ad -= v1;
            goto label_249;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_260:
        __monitor_exit(this);
        return;
        try {
        label_283:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v1 = (v7.ax - v9) / v12;
                if(v1 >= v7.ad) {
                    v7.ax -= v12 * v7.ad;
                    v7.ad = 0;
                    goto label_317;
                }

                v7.ax -= v12 * v1;
                v7.ad -= v1;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_316:
            v3 = arg16;
        label_317:
            if(v7.al < 0) {
                this.bx(arg15, v3, 0, v0, 0);
                if(v7.ax < 0) {
                    v7.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else {
                this.bq(arg15, v3, v11, v0, 0);
                if(v7.ax >= v11) {
                    v7.ax = v11;
                    this.ah();
                    this.lp();
                }
            }
        }
        catch(Throwable v0_1) {
        label_346:
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    int bx(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(true) {
            int v1 = 0xFFFFFF00;
            if(v15.ai <= 0) {
                break;
            }

            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != v1 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == v1 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    public void by(int[] arg15, int arg16, int arg17) {
        int v3;
        int v1;
        int v12;
        int v11;
        int v10;
        int v9;
        gd v8;
        hx v7 = this;
        int v0 = arg17;
        __monitor_enter(this);
        try {
            if(v7.ae == 0 && v7.ai == 0) {
                this.af(v0);
                goto label_8;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_8:
        __monitor_exit(this);
        return;
        try {
        label_10:
            v8 = v7.ag;
            v9 = v7.aq << 8;
            v10 = v7.ab << 8;
            v11 = ((hs)v8).ae.length << 8;
            v12 = v10 - v9;
            if(v12 <= 0) {
                v7.ad = 0;
            }

            v0 += arg16;
            if(v7.ax < 0) {
                if(v7.al > 0) {
                    v7.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_32;
                }
            }

            goto label_34;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_32:
        __monitor_exit(this);
        return;
        try {
        label_34:
            if(v7.ax >= v11) {
                if(v7.al < 0) {
                    v7.ax = v11 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_43;
                }
            }

            goto label_45;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_43:
        __monitor_exit(this);
        return;
        try {
        label_45:
            if(v7.ad >= 0) {
                goto label_159;
            }

            if(!v7.af) {
                goto label_117;
            }

            if(v7.al < 0) {
                v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax >= v9) {
                    goto label_62;
                }
                else {
                    goto label_64;
                }
            }
            else {
                goto label_74;
            }

            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_62:
        __monitor_exit(this);
        return;
    label_64:
        int v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v3 = v1;
            goto label_75;
        label_74:
            v3 = arg16;
            while(true) {
            label_75:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_86;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_108;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_108:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            goto label_75;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_86:
        __monitor_exit(this);
        return;
        try {
        label_117:
            if(v7.al >= 0) {
                goto label_140;
            }

            v3 = arg16;
            while(true) {
            label_120:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_131;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v7.ax = v1 - (v1 - v7.ax) % v12;
            goto label_120;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_131:
        __monitor_exit(this);
        return;
        try {
        label_140:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v7.ax = (v7.ax - v9) % v12 + v9;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_159:
            if(v7.ad <= 0) {
                goto label_316;
            }
            else if(v7.af) {
                if(v7.al < 0) {
                    v1 = this.bx(arg15, arg16, v9, v0, ((hs)v8).ae[v7.aq]);
                    if(v7.ax >= v9) {
                        goto label_176;
                    }
                    else {
                        goto label_178;
                    }
                }
                else {
                    goto label_194;
                }

                goto label_195;
            }
            else {
                goto label_246;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_176:
        __monitor_exit(this);
        return;
    label_178:
        v2 = v9 + v9 - 1;
        try {
            v7.ax = v2 - v7.ax;
            v7.al = -v7.al;
            v2 = v7.ad - 1;
            v7.ad = v2;
            if(v2 == 0) {
                v3 = v1;
                goto label_317;
            }
            else {
                v3 = v1;
                goto label_195;
            label_194:
                v3 = arg16;
            }

            do {
            label_195:
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax >= v10) {
                    break;
                }

                goto label_206;
            }
            while(true);
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 + v10 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 == 0) {
                goto label_317;
            }

            v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.aq]);
            if(v7.ax < v9) {
                goto label_233;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
    label_233:
        v1 = v9 + v9 - 1;
        try {
            v7.ax = v1 - v7.ax;
            v7.al = -v7.al;
            v1 = v7.ad - 1;
            v7.ad = v1;
            if(v1 != 0) {
                goto label_195;
            }

            goto label_317;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_206:
        __monitor_exit(this);
        return;
        try {
        label_246:
            if(v7.al >= 0) {
                goto label_283;
            }

            v3 = arg16;
            while(true) {
            label_249:
                v3 = this.bx(arg15, v3, v9, v0, ((hs)v8).ae[v7.ab - 1]);
                if(v7.ax < v9) {
                    break;
                }

                goto label_260;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        v1 = v10 - 1;
        try {
            v1 = (v1 - v7.ax) / v12;
            if(v1 >= v7.ad) {
                v7.ax += v12 * v7.ad;
                v7.ad = 0;
                goto label_317;
            }

            v7.ax += v12 * v1;
            v7.ad -= v1;
            goto label_249;
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

    label_260:
        __monitor_exit(this);
        return;
        try {
        label_283:
            v3 = arg16;
            while(true) {
                v3 = this.bq(arg15, v3, v10, v0, ((hs)v8).ae[v7.aq]);
                if(v7.ax < v10) {
                    break;
                }

                v1 = (v7.ax - v9) / v12;
                if(v1 >= v7.ad) {
                    v7.ax -= v12 * v7.ad;
                    v7.ad = 0;
                    goto label_317;
                }

                v7.ax -= v12 * v1;
                v7.ad -= v1;
            }
        }
        catch(Throwable v0_1) {
            goto label_346;
        }

        __monitor_exit(this);
        return;
        try {
        label_316:
            v3 = arg16;
        label_317:
            if(v7.al < 0) {
                this.bx(arg15, v3, 0, v0, 0);
                if(v7.ax < 0) {
                    v7.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else {
                this.bq(arg15, v3, v11, v0, 0);
                if(v7.ax >= v11) {
                    v7.ax = v11;
                    this.ah();
                    this.lp();
                }
            }
        }
        catch(Throwable v0_1) {
        label_346:
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    public void bz(int arg8) {
        int v4;
        int v0_1;
        int v3;
        int v2;
        __monitor_enter(this);
        try {
            if(this.ai > 0) {
                if(arg8 >= this.ai) {
                    if(this.ae == 0x30C833) {
                        this.ae = 0;
                        this.aj = 0;
                        this.ap = 0;
                        this.an = 0;
                        this.lp();
                        arg8 = this.ai;
                    }

                    this.ai = 0;
                    this.an();
                }
                else {
                    this.an += this.av * arg8;
                    this.ap += this.aa * arg8;
                    this.aj += this.au * arg8;
                    this.ai -= arg8;
                }
            }

            gd v0 = this.ag;
            v2 = this.aq << 8;
            v3 = this.ab << 8;
            v0_1 = ((hs)v0).ae.length << 8;
            v4 = v3 - v2;
            if(v4 <= 0) {
                this.ad = 0;
            }

            if(this.ax < 0) {
                if(this.al > 0) {
                    this.ax = 0;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_55;
                }
            }

            goto label_57;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_55:
        __monitor_exit(this);
        return;
        try {
        label_57:
            if(this.ax >= v0_1) {
                if(this.al < 0) {
                    this.ax = v0_1 - 1;
                }
                else {
                    this.ah();
                    this.lp();
                    goto label_66;
                }
            }

            goto label_68;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_66:
        __monitor_exit(this);
        return;
        try {
        label_68:
            this.ax += this.al * arg8;
            if(this.ad >= 0) {
                goto label_140;
            }

            if(!this.af) {
                goto label_116;
            }

            if(this.al < 0) {
                if(this.ax >= v2) {
                    goto label_81;
                }
                else {
                    goto label_83;
                }
            }

            goto label_91;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_81:
        __monitor_exit(this);
        return;
    label_83:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
        label_91:
            while(this.ax < v3) {
                goto label_93;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        arg8 = v3 + v3 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            if(this.ax < v2) {
                goto label_107;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_107:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            goto label_91;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_93:
        __monitor_exit(this);
        return;
        try {
        label_116:
            if(this.al >= 0) {
                goto label_129;
            }
            else if(this.ax >= v2) {
            }
            else {
                goto label_122;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_122:
        --v3;
        try {
            this.ax = v3 - (v3 - this.ax) % v4;
            goto label_138;
        label_129:
            if(this.ax < v3) {
            }
            else {
                goto label_133;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
        try {
        label_133:
            this.ax = v2 + (this.ax - v2) % v4;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_138:
        __monitor_exit(this);
        return;
        try {
        label_140:
            if(this.ad > 0) {
                if(this.af) {
                    if(this.al < 0) {
                        if(this.ax >= v2) {
                            goto label_148;
                        }
                        else {
                            goto label_150;
                        }
                    }

                    goto label_163;
                }
                else {
                    goto label_197;
                }
            }

            goto label_249;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_148:
        __monitor_exit(this);
        return;
    label_150:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 == 0) {
                goto label_249;
            }

            do {
            label_163:
                if(this.ax >= v3) {
                    break;
                }

                goto label_165;
            }
            while(true);
        }
        catch(Throwable v8) {
            goto label_266;
        }

        arg8 = v3 + v3 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 == 0) {
                goto label_249;
            }

            if(this.ax < v2) {
                goto label_184;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_184:
        arg8 = v2 + v2 - 1;
        try {
            this.ax = arg8 - this.ax;
            this.al = -this.al;
            arg8 = this.ad - 1;
            this.ad = arg8;
            if(arg8 != 0) {
                goto label_163;
            }

            goto label_249;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_165:
        __monitor_exit(this);
        return;
        try {
        label_197:
            if(this.al >= 0) {
                goto label_224;
            }
            else if(this.ax >= v2) {
            }
            else {
                goto label_203;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

        __monitor_exit(this);
        return;
    label_203:
        --v3;
        try {
            v3 = (v3 - this.ax) / v4;
            if(v3 >= this.ad) {
                this.ax += v4 * this.ad;
                this.ad = 0;
                goto label_249;
            }
            else {
                this.ax += v4 * v3;
                this.ad -= v3;
                goto label_247;
            label_224:
                if(this.ax < v3) {
                    goto label_226;
                }
                else {
                    goto label_228;
                }
            }

            goto label_247;
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_226:
        __monitor_exit(this);
        return;
        try {
        label_228:
            arg8 = (this.ax - v2) / v4;
            if(arg8 >= this.ad) {
                this.ax -= v4 * this.ad;
                this.ad = 0;
                goto label_249;
            }
            else {
                this.ax -= v4 * arg8;
                this.ad -= arg8;
            }
        }
        catch(Throwable v8) {
            goto label_266;
        }

    label_247:
        __monitor_exit(this);
        return;
        try {
        label_249:
            if(this.al < 0) {
                if(this.ax < 0) {
                    this.ax = -1;
                    this.ah();
                    this.lp();
                }
            }
            else if(this.ax >= v0_1) {
                this.ax = v0_1;
                this.ah();
                this.lp();
            }
        }
        catch(Throwable v8) {
        label_266:
            __monitor_exit(this);
            throw v8;
        }

        __monitor_exit(this);
    }

    static int ca(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = arg5 + arg1 - ((arg12 >> 8) - 1);
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 - 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 - 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int cb(int arg4, int arg5) {
        return arg5 < 0 ? -arg4 : ((int)((((double)arg4)) * Math.sqrt((((double)arg5)) * 0.000122) + 0.5));
    }

    public static hx cc(hs arg5, int arg6, int arg7) {
        if(arg5.ae != null) {
            if(arg5.ae.length == 0) {
            }
            else {
                return new hx(arg5, ((int)((((long)arg5.al)) * 0x100 * (((long)arg6)) / (((long)(ht.ax * 0x7FCACEE5))))), arg7 << 6);
            }
        }

        return null;
    }

    static int cd(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v4;
        int v7;
        int v3 = arg25;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v7 = arg19 + (arg26 - arg18 + arg28 - 0x101) / arg28;
            if(v7 > v3) {
                goto label_14;
            }
        }
        else {
        label_14:
            v7 = v3;
        }

        int v2 = arg19 << 1;
        v7 <<= 1;
        int v6 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v7) {
            int v10 = v6 >> 8;
            int v12 = (arg16[v10] << 8) + (arg16[v10 + 1] - arg16[v10]) * (v6 & 0xFF);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        if(arg28 != 0) {
            v4 = (arg26 - v6 + arg28 - 1) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v7 = (arg16[v6 >> 8] << 8) + (arg29 - arg16[v6 >> 8]) * (v6 & 0xFF);
            v4 = v2 + 1;
            arg17[v2] += v7 * v8 >> 6;
            v8 += arg22;
            v2 = v4 + 1;
            arg17[v4] += v7 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v6;
        return v0;
    }

    public void ce(int arg1) {
        __monitor_enter(this);
        try {
            this.ad = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    static int cf(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v7;
        int v6;
        int v3 = arg23;
        int v4 = arg24;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v6 = arg19 + (v4 + 0x100 - arg18 + arg26) / arg26;
            if(v6 > v3) {
                goto label_25;
            }
            else {
                v7 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_25:
            v7 = arg18;
            v2 = arg19;
            v8 = arg20;
            v6 = v3;
        }

        while(v2 < v6) {
            int v9 = v7 >> 8;
            arg17[v2] += ((arg16[v9 - 1] << 8) + (arg16[v9] - arg16[v9 - 1]) * (v7 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v7 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            v4 = (v4 - v7 + arg26) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg27 << 8) + (arg16[v7 >> 8] - arg27) * (v7 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v7 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v7;
        return v2;
    }

    public int cg() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ae == 0xAD7C23CE ? 0 : this.ae;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void ch(int arg1) {
        __monitor_enter(this);
        try {
            this.ad = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    public static hx ci(hs arg1, int arg2, int arg3, int arg4) {
        if(arg1.ae != null) {
            if(arg1.ae.length == 0) {
            }
            else {
                return new hx(arg1, arg2, arg3, arg4);
            }
        }

        return null;
    }

    static int cj(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v6;
        int v7;
        int v3 = arg23;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v7 = arg19 + (arg24 - arg18 + arg26 - 0x101) / arg26;
            if(v7 > v3) {
                goto label_24;
            }
            else {
                v6 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_24:
            v6 = arg18;
            v2 = arg19;
            v8 = arg20;
            v7 = v3;
        }

        while(v2 < v7) {
            int v9 = v6 >> 8;
            arg17[v2] += ((arg16[v9] << 8) + (arg16[v9 + 1] - arg16[v9]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            int v4 = (arg24 - v6 + arg26 - 1) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg16[v6 >> 8] << 8) + (arg27 - arg16[v6 >> 8]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v6;
        return v2;
    }

    void ck(int arg2) {
        __monitor_enter(this);
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void cl(int arg2) {
        __monitor_enter(this);
        arg2 <<= 6;
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void cm(int arg2) {
        __monitor_enter(this);
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void cn(int arg2) {
        __monitor_enter(this);
        arg2 <<= 6;
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public int co() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ae == 0x80000000 ? 0 : this.ae;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public static hx cp(hs arg1, int arg2, int arg3, int arg4) {
        if(arg1.ae != null) {
            if(arg1.ae.length == 0) {
            }
            else {
                return new hx(arg1, arg2, arg3, arg4);
            }
        }

        return null;
    }

    void cq(int arg1, int arg2) {
        __monitor_enter(this);
        try {
            this.ae = arg1;
            this.ar = arg2;
            this.ai = 0;
            this.an();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    void cr() {
        this.an = this.ae;
        this.ap = hx.ax(this.ae, this.ar);
        this.aj = hx.al(this.ae, this.ar);
    }

    public void cs(int arg1) {
        __monitor_enter(this);
        try {
            this.ad = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    void ct(int arg2) {
        __monitor_enter(this);
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void cu(int arg2) {
        __monitor_enter(this);
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void cv(int arg1, int arg2) {
        __monitor_enter(this);
        try {
            this.ae = arg1;
            this.ar = arg2;
            this.ai = 0;
            this.an();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    static int cw(int arg4, int arg5) {
        return arg5 < 0 ? -arg4 : ((int)((((double)arg4)) * Math.sqrt((((double)arg5)) * 0.000122) + 0.5));
    }

    static int cx(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v6;
        int v3 = arg25;
        int v4 = arg26;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v6 = arg19 + (v4 + 0x100 - arg18 + arg28) / arg28;
            if(v6 > v3) {
                goto label_15;
            }
        }
        else {
        label_15:
            v6 = v3;
        }

        int v2 = arg19 << 1;
        v6 <<= 1;
        int v7 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v6) {
            int v10 = v7 >> 8;
            int v12 = (arg16[v10 - 1] << 8) + (arg16[v10] - arg16[v10 - 1]) * (v7 & 0xFF);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        if(arg28 != 0) {
            v4 = (v4 - v7 + arg28) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v4 = (arg29 << 8) + (arg16[v7 >> 8] - arg29) * (v7 & 0xFF);
            v6 = v2 + 1;
            arg17[v2] += v4 * v8 >> 6;
            v8 += arg22;
            v2 = v6 + 1;
            arg17[v6] += v4 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v7;
        return v0;
    }

    static int cy(int arg4, int arg5) {
        return arg5 < 0 ? -arg4 : ((int)((((double)arg4)) * Math.sqrt((((double)arg5)) * 0.000122) + 0.5));
    }

    public void cz(int arg2) {
        __monitor_enter(this);
        arg2 <<= 6;
        try {
            this.aa(arg2, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void da(int arg3) {
        __monitor_enter(this);
        if(arg3 == 0) {
            try {
                this.av(0);
                this.lp();
            }
            catch(Throwable v3) {
                goto label_58;
            }

            __monitor_exit(this);
            return;
        }

        try {
            if(this.ap == 0 && this.aj == 0) {
                this.ai = 0;
                this.ae = 0;
                this.an = 0;
                this.lp();
                goto label_15;
            }

            goto label_17;
        }
        catch(Throwable v3) {
            goto label_58;
        }

    label_15:
        __monitor_exit(this);
        return;
        try {
        label_17:
            int v0 = -this.an;
            if(this.an > v0) {
                v0 = this.an;
            }

            if(-this.ap > v0) {
                v0 = -this.ap;
            }

            if(this.ap > v0) {
                v0 = this.ap;
            }

            if(-this.aj > v0) {
                v0 = -this.aj;
            }

            if(this.aj > v0) {
                v0 = this.aj;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ai = arg3;
            this.ae = 0x80000000;
            this.av = -this.an / arg3;
            this.aa = -this.ap / arg3;
            this.au = -this.aj / arg3;
        }
        catch(Throwable v3) {
        label_58:
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    public void db(int arg3) {
        __monitor_enter(this);
        try {
            int v0 = this.ag.ae.length << 8;
            if(arg3 < -1) {
                arg3 = -1;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ax = arg3;
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    void dc() {
        if(this.ai != 0) {
            if(this.ae == 0x80000000) {
                this.ae = 0;
            }

            this.ai = 0;
            this.an();
        }
    }

    public int dd() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    void de() {
        if(this.ai != 0) {
            if(this.ae == 0x80000000) {
                this.ae = 0;
            }

            this.ai = 0;
            this.an();
        }
    }

    public void df(int arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.ay(arg2, arg3, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public int dg() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public int dh() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ar < 0 ? -1 : this.ar;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void di(int arg3) {
        __monitor_enter(this);
        if(arg3 == 0) {
            try {
                this.av(0);
                this.lp();
            }
            catch(Throwable v3) {
                goto label_58;
            }

            __monitor_exit(this);
            return;
        }

        try {
            if(this.ap == 0 && this.aj == 0) {
                this.ai = 0;
                this.ae = 0;
                this.an = 0;
                this.lp();
                goto label_15;
            }

            goto label_17;
        }
        catch(Throwable v3) {
            goto label_58;
        }

    label_15:
        __monitor_exit(this);
        return;
        try {
        label_17:
            int v0 = -this.an;
            if(this.an > v0) {
                v0 = this.an;
            }

            if(-this.ap > v0) {
                v0 = -this.ap;
            }

            if(this.ap > v0) {
                v0 = this.ap;
            }

            if(-this.aj > v0) {
                v0 = -this.aj;
            }

            if(this.aj > v0) {
                v0 = this.aj;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ai = arg3;
            this.ae = 347479410;
            this.av = -this.an / arg3;
            this.aa = -this.ap / arg3;
            this.au = -this.aj / arg3;
        }
        catch(Throwable v3) {
        label_58:
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    void dj() {
        if(this.ai != 0) {
            if(this.ae == -1291943060) {
                this.ae = 0;
            }

            this.ai = 0;
            this.an();
        }
    }

    void dk() {
        if(this.ai != 0) {
            if(this.ae == 0x80000000) {
                this.ae = 0;
            }

            this.ai = 0;
            this.an();
        }
    }

    public void dl(int arg5, int arg6, int arg7) {
        int v1;
        int v0;
        __monitor_enter(this);
        if(arg5 == 0) {
            try {
                this.aa(arg6, arg7);
            }
            catch(Throwable v5) {
                goto label_62;
            }

            __monitor_exit(this);
            return;
        }

        try {
            v0 = hx.ax(arg6, arg7);
            v1 = hx.al(arg6, arg7);
            if(this.ap == v0 && this.aj == v1) {
                this.ai = 0;
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v5) {
            goto label_62;
        }

    label_13:
        __monitor_exit(this);
        return;
        try {
        label_15:
            int v2 = arg6 - this.an;
            if(this.an - arg6 > v2) {
                v2 = this.an - arg6;
            }

            if(v0 - this.ap > v2) {
                v2 = v0 - this.ap;
            }

            if(this.ap - v0 > v2) {
                v2 = this.ap - v0;
            }

            if(v1 - this.aj > v2) {
                v2 = v1 - this.aj;
            }

            if(this.aj - v1 > v2) {
                v2 = this.aj - v1;
            }

            if(arg5 > v2) {
                arg5 = v2;
            }

            this.ai = arg5;
            this.ae = arg6;
            this.ar = arg7;
            this.av = (arg6 - this.an) / arg5;
            this.aa = (v0 - this.ap) / arg5;
            this.au = (v1 - this.aj) / arg5;
        }
        catch(Throwable v5) {
        label_62:
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public void dm(int arg3) {
        __monitor_enter(this);
        try {
            int v0 = this.ag.ae.length << 8;
            if(arg3 < -1) {
                arg3 = -1;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ax = arg3;
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    public void dn(int arg5, int arg6, int arg7) {
        int v1;
        int v0;
        __monitor_enter(this);
        if(arg5 == 0) {
            try {
                this.aa(arg6, arg7);
            }
            catch(Throwable v5) {
                goto label_62;
            }

            __monitor_exit(this);
            return;
        }

        try {
            v0 = hx.ax(arg6, arg7);
            v1 = hx.al(arg6, arg7);
            if(this.ap == v0 && this.aj == v1) {
                this.ai = 0;
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v5) {
            goto label_62;
        }

    label_13:
        __monitor_exit(this);
        return;
        try {
        label_15:
            int v2 = arg6 - this.an;
            if(this.an - arg6 > v2) {
                v2 = this.an - arg6;
            }

            if(v0 - this.ap > v2) {
                v2 = v0 - this.ap;
            }

            if(this.ap - v0 > v2) {
                v2 = this.ap - v0;
            }

            if(v1 - this.aj > v2) {
                v2 = v1 - this.aj;
            }

            if(this.aj - v1 > v2) {
                v2 = this.aj - v1;
            }

            if(arg5 > v2) {
                arg5 = v2;
            }

            this.ai = arg5;
            this.ae = arg6;
            this.ar = arg7;
            this.av = (arg6 - this.an) / arg5;
            this.aa = (v0 - this.ap) / arg5;
            this.au = (v1 - this.aj) / arg5;
        }
        catch(Throwable v5) {
        label_62:
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public void do(int arg2) {
        __monitor_enter(this);
        try {
            this.al = this.al < 0 ? -arg2 : arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public int dp() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ar < 0 ? -1 : this.ar;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public int dq() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void dr(int arg5, int arg6, int arg7) {
        int v1;
        int v0;
        __monitor_enter(this);
        if(arg5 == 0) {
            try {
                this.aa(arg6, arg7);
            }
            catch(Throwable v5) {
                goto label_62;
            }

            __monitor_exit(this);
            return;
        }

        try {
            v0 = hx.ax(arg6, arg7);
            v1 = hx.al(arg6, arg7);
            if(this.ap == v0 && this.aj == v1) {
                this.ai = 0;
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v5) {
            goto label_62;
        }

    label_13:
        __monitor_exit(this);
        return;
        try {
        label_15:
            int v2 = arg6 - this.an;
            if(this.an - arg6 > v2) {
                v2 = this.an - arg6;
            }

            if(v0 - this.ap > v2) {
                v2 = v0 - this.ap;
            }

            if(this.ap - v0 > v2) {
                v2 = this.ap - v0;
            }

            if(v1 - this.aj > v2) {
                v2 = v1 - this.aj;
            }

            if(this.aj - v1 > v2) {
                v2 = this.aj - v1;
            }

            if(arg5 > v2) {
                arg5 = v2;
            }

            this.ai = arg5;
            this.ae = arg6;
            this.ar = arg7;
            this.av = (arg6 - this.an) / arg5;
            this.aa = (v0 - this.ap) / arg5;
            this.au = (v1 - this.aj) / arg5;
        }
        catch(Throwable v5) {
        label_62:
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public void ds(int arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.ay(arg2, arg3, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public int dt() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void du(int arg3) {
        __monitor_enter(this);
        try {
            int v0 = this.ag.ae.length << 8;
            if(arg3 < -1) {
                arg3 = -1;
            }

            if(arg3 > v0) {
                arg3 = v0;
            }

            this.ax = arg3;
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    public int dv() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ar < 0 ? -1 : this.ar;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public int dw() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ar < 0 ? -1 : this.ar;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public void dx(int arg5, int arg6, int arg7) {
        int v1;
        int v0;
        __monitor_enter(this);
        if(arg5 == 0) {
            try {
                this.aa(arg6, arg7);
            }
            catch(Throwable v5) {
                goto label_62;
            }

            __monitor_exit(this);
            return;
        }

        try {
            v0 = hx.ax(arg6, arg7);
            v1 = hx.al(arg6, arg7);
            if(this.ap == v0 && this.aj == v1) {
                this.ai = 0;
                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v5) {
            goto label_62;
        }

    label_13:
        __monitor_exit(this);
        return;
        try {
        label_15:
            int v2 = arg6 - this.an;
            if(this.an - arg6 > v2) {
                v2 = this.an - arg6;
            }

            if(v0 - this.ap > v2) {
                v2 = v0 - this.ap;
            }

            if(this.ap - v0 > v2) {
                v2 = this.ap - v0;
            }

            if(v1 - this.aj > v2) {
                v2 = v1 - this.aj;
            }

            if(this.aj - v1 > v2) {
                v2 = this.aj - v1;
            }

            if(arg5 > v2) {
                arg5 = v2;
            }

            this.ai = arg5;
            this.ae = arg6;
            this.ar = arg7;
            this.av = (arg6 - this.an) / arg5;
            this.aa = (v0 - this.ap) / arg5;
            this.au = (v1 - this.aj) / arg5;
        }
        catch(Throwable v5) {
        label_62:
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public void dy(int arg2, int arg3) {
        __monitor_enter(this);
        try {
            this.ay(arg2, arg3, this.am());
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public void dz(int arg2) {
        __monitor_enter(this);
        try {
            this.al = this.al < 0 ? -arg2 : arg2;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public boolean ea() {
        boolean v0 = this.ai != 0 ? true : false;
        return v0;
    }

    static int eb(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = (arg8 >> 8) + arg4 - arg3;
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 + 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 + 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            ++arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    static int ec(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = (arg10 >> 8) + arg5 - arg1;
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    boolean ed() {
        int v3;
        int v1;
        int v0 = this.ae;
        if(v0 == 0x9DB0653) {
            v0 = 0;
            v1 = 0;
            v3 = 0;
        }
        else {
            v1 = hx.ax(v0, this.ar);
            v3 = hx.al(v0, this.ar);
        }

        if(this.an == v0 && this.ap == v1) {
            if(this.aj != v3) {
            }
            else if(this.ae == 0x80000000) {
                this.ae = 0;
                this.aj = 0;
                this.ap = 0;
                this.an = 0;
                this.lp();
                return 1;
            }
            else {
                this.an();
                return 0;
            }
        }

        int v6 = -1;
        if(this.an < v0) {
            this.av = 1;
            this.ai = v0 - this.an;
        }
        else if(this.an > v0) {
            this.av = v6;
            this.ai = this.an - v0;
        }
        else {
            this.av = 0;
        }

        if(this.ap < v1) {
            this.aa = 1;
            if(this.ai != 0 && this.ai <= v1 - this.ap) {
                goto label_74;
            }

            this.ai = v1 - this.ap;
        }
        else {
            if(this.ap > v1) {
                this.aa = v6;
                if(this.ai != 0 && this.ai <= this.ap - v1) {
                    goto label_74;
                }

                this.ai = this.ap - v1;
                goto label_74;
            }

            this.aa = 0;
        }

    label_74:
        if(this.aj < v3) {
            this.au = 1;
            if(this.ai != 0 && this.ai <= v3 - this.aj) {
                return 0;
            }

            this.ai = v3 - this.aj;
        }
        else {
            if(this.aj > v3) {
                this.au = v6;
                if(this.ai != 0 && this.ai <= this.aj - v3) {
                    return 0;
                }

                this.ai = this.aj - v3;
                return 0;
            }

            this.au = 0;
        }

        return 0;
    }

    boolean ee() {
        int v4;
        int v3;
        int v0 = this.ae;
        int v1 = 0x80000000;
        if(v0 == v1) {
            v0 = 0;
            v3 = 0;
            v4 = 0;
        }
        else {
            v3 = hx.ax(v0, this.ar);
            v4 = hx.al(v0, this.ar);
        }

        if(this.an == v0 && this.ap == v3) {
            if(this.aj != v4) {
            }
            else if(this.ae == v1) {
                this.ae = 0;
                this.aj = 0;
                this.ap = 0;
                this.an = 0;
                this.lp();
                return 1;
            }
            else {
                this.an();
                return 0;
            }
        }

        int v5 = -1;
        if(this.an < v0) {
            this.av = 1;
            this.ai = v0 - this.an;
        }
        else if(this.an > v0) {
            this.av = v5;
            this.ai = this.an - v0;
        }
        else {
            this.av = 0;
        }

        if(this.ap < v3) {
            this.aa = 1;
            if(this.ai != 0 && this.ai <= v3 - this.ap) {
                goto label_73;
            }

            this.ai = v3 - this.ap;
        }
        else {
            if(this.ap > v3) {
                this.aa = v5;
                if(this.ai != 0 && this.ai <= this.ap - v3) {
                    goto label_73;
                }

                this.ai = this.ap - v3;
                goto label_73;
            }

            this.aa = 0;
        }

    label_73:
        if(this.aj < v4) {
            this.au = 1;
            if(this.ai != 0 && this.ai <= v4 - this.aj) {
                return 0;
            }

            this.ai = v4 - this.aj;
        }
        else {
            if(this.aj > v4) {
                this.au = v5;
                if(this.ai != 0 && this.ai <= this.aj - v4) {
                    return 0;
                }

                this.ai = this.aj - v4;
                return 0;
            }

            this.au = 0;
        }

        return 0;
    }

    static int ef(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = arg4 + arg3 - ((arg8 >> 8) - 1);
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 - 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 - 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            --arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    int eg(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(v15.ai > 0) {
            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != 0x91AA095F || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == 0xCE8EFCCF && (v14_1.ax & 0x9044BF7C) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    static int eh(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = (arg8 >> 8) + arg4 - arg3;
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 + 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 + 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            ++arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    static int ei(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = (arg10 >> 8) + arg5 - arg1;
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 + 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 + 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    int ej(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(true) {
            int v1 = 0x100;
            if(v15.ai <= 0) {
                break;
            }

            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != v1 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cd(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.br(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bl(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == v1 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bb(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bh(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.bu(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    public int ek() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.al < 0 ? -this.al : this.al;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    int el(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(v15.ai > 0) {
            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != 1977109974 || (v15.ax & -1502035159) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_104;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_104:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == 0x338C7D8C && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    int em(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(v15.ai > 0) {
            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != 0x100 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cd(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.br(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bl(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == 1552094741 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bb(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bh(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.bu(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    int en(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(v15.ai > 0) {
            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != 0xFFFFFF00 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == 0x919734F2 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    static int eo(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = arg5 + arg1 - ((arg10 >> 8) - 1);
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int ep(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = arg4 + arg3 - ((arg8 >> 8) - 1);
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 - 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 - 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            --arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    public boolean eq() {
        boolean v0 = this.ai != 0 ? true : false;
        return v0;
    }

    public boolean er() {
        boolean v0 = this.ai != 0 ? true : false;
        return v0;
    }

    static int es(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = (arg8 >> 8) + arg4 - arg3;
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 + 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 + 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            ++arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    static int et(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = arg5 + arg1 - ((arg10 >> 8) - 1);
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    boolean eu() {
        int v4;
        int v3;
        int v0 = this.ae;
        int v1 = 0x80000000;
        if(v0 == v1) {
            v0 = 0;
            v3 = 0;
            v4 = 0;
        }
        else {
            v3 = hx.ax(v0, this.ar);
            v4 = hx.al(v0, this.ar);
        }

        if(this.an == v0 && this.ap == v3) {
            if(this.aj != v4) {
            }
            else if(this.ae == v1) {
                this.ae = 0;
                this.aj = 0;
                this.ap = 0;
                this.an = 0;
                this.lp();
                return 1;
            }
            else {
                this.an();
                return 0;
            }
        }

        int v5 = -1;
        if(this.an < v0) {
            this.av = 1;
            this.ai = v0 - this.an;
        }
        else if(this.an > v0) {
            this.av = v5;
            this.ai = this.an - v0;
        }
        else {
            this.av = 0;
        }

        if(this.ap < v3) {
            this.aa = 1;
            if(this.ai != 0 && this.ai <= v3 - this.ap) {
                goto label_73;
            }

            this.ai = v3 - this.ap;
        }
        else {
            if(this.ap > v3) {
                this.aa = v5;
                if(this.ai != 0 && this.ai <= this.ap - v3) {
                    goto label_73;
                }

                this.ai = this.ap - v3;
                goto label_73;
            }

            this.aa = 0;
        }

    label_73:
        if(this.aj < v4) {
            this.au = 1;
            if(this.ai != 0 && this.ai <= v4 - this.aj) {
                return 0;
            }

            this.ai = v4 - this.aj;
        }
        else {
            if(this.aj > v4) {
                this.au = v5;
                if(this.ai != 0 && this.ai <= this.aj - v4) {
                    return 0;
                }

                this.ai = this.aj - v4;
                return 0;
            }

            this.au = 0;
        }

        return 0;
    }

    int ev(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(true) {
            int v1 = 0xFFFFFF00;
            if(v15.ai <= 0) {
                break;
            }

            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != v1 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == v1 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    int ew(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(v15.ai > 0) {
            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != 0xFB8B257F || (v15.ax & 0x9B303A89) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cx(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_104;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cf(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.ca(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bi(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_104:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == 0xFFFFFF00 && (v14_1.ax & 0x4DED990D) == 0) {
            if(ht.al) {
                return hx.bm(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bc(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.be(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bs(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    static int ex(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, hx arg9) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 = arg4 + arg3 - ((arg8 >> 8) - 1);
        if(arg6 > arg7) {
            arg6 = arg7;
        }

        arg6 += -3;
        while(arg4 < arg6) {
            arg7 = arg4 + 1;
            int v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg3 = arg7 + 1;
            arg8 = v0 - 1;
            arg2[arg7] += arg1[v0] * arg5;
            arg4 = arg3 + 1;
            v0 = arg8 - 1;
            arg2[arg3] += arg1[arg8] * arg5;
            arg2[arg4] += arg1[v0] * arg5;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg6 += 3;
        while(arg4 < arg6) {
            arg2[arg4] += arg1[arg3] * arg5;
            ++arg4;
            --arg3;
        }

        arg9.ax = arg3 << 8;
        return arg4;
    }

    int ey(int[] arg19, int arg20, int arg21, int arg22, int arg23) {
        hx v14_1;
        int v17;
        hx v15 = this;
        int v14 = arg22;
        int v5 = arg20;
        while(true) {
            int v1 = 0x100;
            if(v15.ai <= 0) {
                break;
            }

            int v0 = v15.ai + v5;
            int v11 = v0 > v14 ? v14 : v0;
            v15.ai += v5;
            if(v15.al != v1 || (v15.ax & 0xFF) != 0) {
                if(ht.al) {
                    v17 = v14;
                    v5 = hx.cd(0, 0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this, v15.al, arg23);
                    v14_1 = this;
                    goto label_103;
                }

                v17 = v14;
                v14_1 = this;
                v5 = hx.cj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, v14_1.av, 0, v11, arg21, this, v14_1.al, arg23);
            }
            else {
                v0 = ht.al ? hx.br(0, v15.ag.ae, arg19, v15.ax, v5, v15.ap, v15.aj, v15.aa, v15.au, 0, v11, arg21, this) : hx.bl(v15.ag.ae, arg19, v15.ax, v5, v15.an, v15.av, 0, v11, arg21, this);
                v5 = v0;
                v17 = v14;
                v14_1 = v15;
            }

        label_103:
            v14_1.ai -= v5;
            if(v14_1.ai != 0) {
                return v5;
            }

            if(this.bg()) {
                return v17;
            }

            v15 = v14_1;
            v14 = v17;
        }

        v14_1 = v15;
        if(v14_1.al == v1 && (v14_1.ax & 0xFF) == 0) {
            if(ht.al) {
                return hx.bb(0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this);
            }
            else {
                return hx.bh(v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this);
            }
        }

        if(ht.al) {
            return hx.bu(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.ap, v14_1.aj, 0, arg22, arg21, this, v14_1.al, arg23);
        }

        return hx.bj(0, 0, v14_1.ag.ae, arg19, v14_1.ax, v5, v14_1.an, 0, arg22, arg21, this, v14_1.al, arg23);
    }

    public boolean ez() {
        boolean v0 = this.ax < 0 || this.ax >= this.ag.ae.length << 8 ? true : false;
        return v0;
    }

    static int fa(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, hx arg11) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg4 = arg5 + arg1 - ((arg10 >> 8) - 1);
        if(arg4 > arg9) {
            arg4 = arg9;
        }

        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8 - 1;
            arg8 = arg2[arg8];
            arg9 = arg5 + 1;
            arg3[arg5] += arg8 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg8 * arg7;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg8 = arg1 - 1;
            arg1 = arg2[arg1];
            arg9 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg5 = arg9 + 1;
            arg3[arg9] += arg1 * arg7;
            arg1 = arg8;
        }

        arg11.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fb(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = (arg12 >> 8) + arg5 - arg1;
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fc(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = (arg9 >> 8) + arg4 - arg3;
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 + 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 + 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            ++arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fd(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (arg12 - arg7 + arg14 - 0x101) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4] << 8) + (arg5[arg4 + 1] - arg5[arg4]) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14 - 1) / arg14;
            if(arg3 > arg11) {
                goto label_34;
            }
        }
        else {
        label_34:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg5[arg7 >> 8] << 8) + (arg15 - arg5[arg7 >> 8]) * (0xFA7254F7 & arg7)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    static int fe(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (arg12 - arg7 + arg14 + 0x489B37AC) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_8;
            }
        }
        else {
        label_8:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4] << 8) + (arg5[arg4 + 1] - arg5[arg4]) * (0xE00ED135 & arg7)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14 - 1) / arg14;
            if(arg3 > arg11) {
                goto label_36;
            }
        }
        else {
        label_36:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg5[arg7 >> 8] << 8) + (arg15 - arg5[arg7 >> 8]) * (0xF5FAFE4 & arg7)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    static int ff(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + arg3 - ((arg9 >> 8) - 1);
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 - 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 - 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            --arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fg(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v7;
        int v6;
        int v3 = arg23;
        int v4 = arg24;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v6 = arg19 + (v4 + 0x100 - arg18 + arg26) / arg26;
            if(v6 > v3) {
                goto label_25;
            }
            else {
                v7 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_25:
            v7 = arg18;
            v2 = arg19;
            v8 = arg20;
            v6 = v3;
        }

        while(v2 < v6) {
            int v9 = v7 >> 8;
            arg17[v2] += ((arg16[v9 - 1] << 8) + (arg16[v9] - arg16[v9 - 1]) * (v7 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v7 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            v4 = (v4 - v7 + arg26) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg27 << 8) + (arg16[v7 >> 8] - arg27) * (v7 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v7 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v7;
        return v2;
    }

    static int fh(int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg2 = (arg12 + 0x100 - arg6 + arg14) / arg14 + arg7;
            if(arg2 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg2 = arg11;
        }

        arg3 = arg7 << 1;
        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = arg6 >> 8;
            int v0 = (arg4[arg7 - 1] << 8) + (arg4[arg7] - arg4[arg7 - 1]) * (0x93A0E6AB & arg6);
            arg7 = arg3 + 1;
            arg5[arg3] += v0 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += v0 * arg9 >> 6;
            arg6 += arg14;
        }

        if(arg14 != 0) {
            arg2 = (arg3 >> 1) + (arg12 - arg6 + arg14) / arg14;
            if(arg2 > arg11) {
                goto label_42;
            }
        }
        else {
        label_42:
            arg2 = arg11;
        }

        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = (arg15 << 8) + (arg4[arg6 >> 8] - arg15) * (arg6 & 0xFF);
            arg10 = arg3 + 1;
            arg5[arg3] += arg7 * arg8 >> 6;
            arg3 = arg10 + 1;
            arg5[arg10] += arg7 * arg9 >> 6;
            arg6 += arg14;
        }

        arg13.ax = arg6;
        return arg3 >> 1;
    }

    static int fi(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = (arg12 >> 8) + arg5 - arg1;
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fj(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v4;
        int v7;
        int v3 = arg25;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v7 = arg19 + (arg26 - arg18 + arg28 - 0x101) / arg28;
            if(v7 > v3) {
                goto label_14;
            }
        }
        else {
        label_14:
            v7 = v3;
        }

        int v2 = arg19 << 1;
        v7 <<= 1;
        int v6 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v7) {
            int v10 = v6 >> 8;
            int v12 = (arg16[v10] << 8) + (arg16[v10 + 1] - arg16[v10]) * (-1496063706 & v6);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        if(arg28 != 0) {
            v4 = (arg26 - v6 + arg28 - 1) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v7 = (arg16[v6 >> 8] << 8) + (arg29 - arg16[v6 >> 8]) * (v6 & 0xFF);
            v4 = v2 + 1;
            arg17[v2] += v7 * v8 >> 6;
            v8 += arg22;
            v2 = v4 + 1;
            arg17[v4] += v7 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v6;
        return v0;
    }

    static int fk(int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg2 = (0x5DCF0AAF + arg12 - arg6 + arg14) / arg14 + arg7;
            if(arg2 > arg11) {
                goto label_8;
            }
        }
        else {
        label_8:
            arg2 = arg11;
        }

        arg3 = arg7 << 1;
        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = arg6 >> 8;
            int v0 = (arg4[arg7 - 1] << 8) + (arg4[arg7] - arg4[arg7 - 1]) * (arg6 & 0xFF);
            arg7 = arg3 + 1;
            arg5[arg3] += v0 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += v0 * arg9 >> 6;
            arg6 += arg14;
        }

        if(arg14 != 0) {
            arg2 = (arg3 >> 1) + (arg12 - arg6 + arg14) / arg14;
            if(arg2 > arg11) {
                goto label_42;
            }
        }
        else {
        label_42:
            arg2 = arg11;
        }

        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = (arg15 << 8) + (arg4[arg6 >> 8] - arg15) * (arg6 & 0xFF);
            arg10 = arg3 + 1;
            arg5[arg3] += arg7 * arg8 >> 6;
            arg3 = arg10 + 1;
            arg5[arg10] += arg7 * arg9 >> 6;
            arg6 += arg14;
        }

        arg13.ax = arg6;
        return arg3 >> 1;
    }

    static int fl(int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg2 = (-1462974087 + arg12 - arg6 + arg14) / arg14 + arg7;
            if(arg2 > arg11) {
                goto label_8;
            }
        }
        else {
        label_8:
            arg2 = arg11;
        }

        arg3 = arg7 << 1;
        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = arg6 >> 8;
            int v0 = (arg4[arg7 - 1] << 8) + (arg4[arg7] - arg4[arg7 - 1]) * (0x30309943 & arg6);
            arg7 = arg3 + 1;
            arg5[arg3] += v0 * arg8 >> 6;
            arg3 = arg7 + 1;
            arg5[arg7] += v0 * arg9 >> 6;
            arg6 += arg14;
        }

        if(arg14 != 0) {
            arg2 = (arg3 >> 1) + (arg12 - arg6 + arg14) / arg14;
            if(arg2 > arg11) {
                goto label_43;
            }
        }
        else {
        label_43:
            arg2 = arg11;
        }

        arg2 <<= 1;
        while(arg3 < arg2) {
            arg7 = (arg15 << 8) + (arg4[arg6 >> 8] - arg15) * (arg6 & 0xFF);
            arg10 = arg3 + 1;
            arg5[arg3] += arg7 * arg8 >> 6;
            arg3 = arg10 + 1;
            arg5[arg10] += arg7 * arg9 >> 6;
            arg6 += arg14;
        }

        arg13.ax = arg6;
        return arg3 >> 1;
    }

    static int fm(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + arg3 - ((arg9 >> 8) - 1);
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 - 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 - 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            --arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fn(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + arg3 - ((arg9 >> 8) - 1);
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 - 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 - 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            --arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fo(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = (arg12 >> 8) + arg5 - arg1;
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fp(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v6;
        int v7;
        int v3 = arg23;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v7 = arg19 + (arg24 - arg18 + arg26 - 0x101) / arg26;
            if(v7 > v3) {
                goto label_24;
            }
            else {
                v6 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_24:
            v6 = arg18;
            v2 = arg19;
            v8 = arg20;
            v7 = v3;
        }

        while(v2 < v7) {
            int v9 = v6 >> 8;
            arg17[v2] += ((arg16[v9] << 8) + (arg16[v9 + 1] - arg16[v9]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            int v4 = (arg24 - v6 + arg26 - 1) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg16[v6 >> 8] << 8) + (arg27 - arg16[v6 >> 8]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v6;
        return v2;
    }

    static int fq(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = arg5 + arg1 - ((arg12 >> 8) - 1);
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 - 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 - 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 - 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fr(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v4;
        int v7;
        int v3 = arg25;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v7 = arg19 + (arg26 - arg18 + arg28 - 0x101) / arg28;
            if(v7 > v3) {
                goto label_14;
            }
        }
        else {
        label_14:
            v7 = v3;
        }

        int v2 = arg19 << 1;
        v7 <<= 1;
        int v6 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v7) {
            int v10 = v6 >> 8;
            int v12 = (arg16[v10] << 8) + (arg16[v10 + 1] - arg16[v10]) * (v6 & 0xFF);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        if(arg28 != 0) {
            v4 = (arg26 - v6 + arg28 - 1) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v7 = (arg16[v6 >> 8] << 8) + (arg29 - arg16[v6 >> 8]) * (v6 & 0xFF);
            v4 = v2 + 1;
            arg17[v2] += v7 * v8 >> 6;
            v8 += arg22;
            v2 = v4 + 1;
            arg17[v4] += v7 * v9 >> 6;
            v9 += arg23;
            v6 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v6;
        return v0;
    }

    static int fs(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v4;
        int v6;
        int v3 = arg25;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v6 = arg19 + (arg26 + 0x7EB74B19 - arg18 + arg28) / arg28;
            if(v6 > v3) {
                goto label_15;
            }
        }
        else {
        label_15:
            v6 = v3;
        }

        int v2 = arg19 << 1;
        v6 <<= 1;
        int v7 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v6) {
            int v10 = v7 >> 8;
            int v12 = (arg16[v10 - 1] << 8) + (arg16[v10] - arg16[v10 - 1]) * (0xE76FA0E4 & v7);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        if(arg28 != 0) {
            v4 = (arg26 - v7 + arg28) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v4 = (arg29 << 8) + (arg16[v7 >> 8] - arg29) * (0x3CFFA7E7 & v7);
            v6 = v2 + 1;
            arg17[v2] += v4 * v8 >> 6;
            v8 += arg22;
            v2 = v6 + 1;
            arg17[v6] += v4 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v7;
        return v0;
    }

    static int ft(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v6;
        int v7;
        int v3 = arg23;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v7 = arg19 + (arg24 - arg18 + arg26 + 0x4B73FDA0) / arg26;
            if(v7 > v3) {
                goto label_25;
            }
            else {
                v6 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_25:
            v6 = arg18;
            v2 = arg19;
            v8 = arg20;
            v7 = v3;
        }

        while(v2 < v7) {
            int v9 = v6 >> 8;
            arg17[v2] += ((arg16[v9] << 8) + (arg16[v9 + 1] - arg16[v9]) * (-2058231314 & v6)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            int v4 = (arg24 - v6 + arg26 - 1) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg16[v6 >> 8] << 8) + (arg27 - arg16[v6 >> 8]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v6;
        return v2;
    }

    static int fu(int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13) {
        arg1 = arg4 >> 8;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 <<= 2;
        arg4 = (arg12 >> 8) + arg5 - arg1;
        if(arg4 > arg11) {
            arg4 = arg11;
        }

        arg13.an += arg13.av * (arg4 - arg5);
        arg5 <<= 1;
        arg4 = (arg4 << 1) - 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10 + 1;
            arg10 = arg2[arg10];
            arg11 = arg5 + 1;
            arg3[arg5] += arg10 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg10 * arg7;
            arg7 += arg9;
        }

        arg4 += 6;
        while(arg5 < arg4) {
            arg10 = arg1 + 1;
            arg1 = arg2[arg1];
            arg11 = arg5 + 1;
            arg3[arg5] += arg1 * arg6;
            arg6 += arg8;
            arg5 = arg11 + 1;
            arg3[arg11] += arg1 * arg7;
            arg7 += arg9;
            arg1 = arg10;
        }

        arg13.ap = arg6 >> 2;
        arg13.aj = arg7 >> 2;
        arg13.ax = arg1 << 8;
        return arg5 >> 1;
    }

    static int fv(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = (arg9 >> 8) + arg4 - arg3;
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 + 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 + 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 + 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 + 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            ++arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fw(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, hx arg25, int arg26, int arg27) {
        int v8;
        int v2;
        int v6;
        int v7;
        int v3 = arg23;
        hx v5 = arg25;
        v5.ap -= v5.aa * arg19;
        v5.aj -= v5.au * arg19;
        if(arg26 != 0) {
            v7 = arg19 + (arg24 - arg18 + arg26 - 0x101) / arg26;
            if(v7 > v3) {
                goto label_24;
            }
            else {
                v6 = arg18;
                v2 = arg19;
                v8 = arg20;
            }
        }
        else {
        label_24:
            v6 = arg18;
            v2 = arg19;
            v8 = arg20;
            v7 = v3;
        }

        while(v2 < v7) {
            int v9 = v6 >> 8;
            arg17[v2] += ((arg16[v9] << 8) + (arg16[v9 + 1] - arg16[v9]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        if(arg26 != 0) {
            int v4 = (arg24 - v6 + arg26 - 1) / arg26 + v2;
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        while(v2 < v3) {
            arg17[v2] += ((arg16[v6 >> 8] << 8) + (arg27 - arg16[v6 >> 8]) * (v6 & 0xFF)) * v8 >> 6;
            v8 += arg21;
            v6 += arg26;
            ++v2;
        }

        v5.ap += v5.aa * v2;
        v5.aj += v5.au * v2;
        v5.an = v8;
        v5.ax = v6;
        return v2;
    }

    static int fx(byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, hx arg10) {
        arg3 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + arg3 - ((arg9 >> 8) - 1);
        if(arg7 > arg8) {
            arg7 = arg8;
        }

        int v0 = arg7 - arg4;
        arg10.ap += arg10.aa * v0;
        arg10.aj += arg10.au * v0;
        arg7 += -3;
        while(arg4 < arg7) {
            arg8 = arg4 + 1;
            v0 = arg3 - 1;
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            arg3 = arg8 + 1;
            arg9 = v0 - 1;
            arg2[arg8] += arg1[v0] * arg5;
            arg5 += arg6;
            arg4 = arg3 + 1;
            v0 = arg9 - 1;
            arg2[arg3] += arg1[arg9] * arg5;
            arg5 += arg6;
            arg2[arg4] += arg1[v0] * arg5;
            arg5 += arg6;
            ++arg4;
            arg3 = v0 - 1;
        }

        arg7 += 3;
        while(arg4 < arg7) {
            arg2[arg4] += arg1[arg3] * arg5;
            arg5 += arg6;
            ++arg4;
            --arg3;
        }

        arg10.an = arg5 >> 2;
        arg10.ax = arg3 << 8;
        return arg4;
    }

    static int fy(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (0x1778488F + arg12 - arg7 + arg14) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_8;
            }
        }
        else {
        label_8:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4 - 1] << 8) + (arg5[arg4] - arg5[arg4 - 1]) * (-980933078 & arg7)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14) / arg14;
            if(arg3 > arg11) {
                goto label_35;
            }
        }
        else {
        label_35:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg15 << 8) + (arg5[arg7 >> 8] - arg15) * (417160086 & arg7)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    static int fz(int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, hx arg13, int arg14, int arg15) {
        if(arg14 != 0) {
            arg3 = (arg12 + 0x100 - arg7 + arg14) / arg14 + arg8;
            if(arg3 > arg11) {
                goto label_7;
            }
        }
        else {
        label_7:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg4 = arg7 >> 8;
            arg6[arg8] += ((arg5[arg4 - 1] << 8) + (arg5[arg4] - arg5[arg4 - 1]) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        if(arg14 != 0) {
            arg3 = arg8 + (arg12 - arg7 + arg14) / arg14;
            if(arg3 > arg11) {
                goto label_33;
            }
        }
        else {
        label_33:
            arg3 = arg11;
        }

        while(arg8 < arg3) {
            arg6[arg8] += ((arg15 << 8) + (arg5[arg7 >> 8] - arg15) * (arg7 & 0xFF)) * arg9 >> 6;
            arg7 += arg14;
            ++arg8;
        }

        arg13.ax = arg7;
        return arg8;
    }

    int gc() {
        int v0 = this.an * 3 >> 6;
        int v1 = (v0 >> 0x1F ^ v0) + (v0 >>> 0xF0D52CDF);
        if(this.ad == 0) {
            v1 -= this.ax * v1 / (this.ag.ae.length << 8);
        }
        else if(this.ad >= 0) {
            v1 -= this.aq * v1 / this.ag.ae.length;
        }

        if(v1 > 0x9224FFDB) {
            v1 = 0x78FF3242;
        }

        return v1;
    }

    static int gg(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v6;
        int v3 = arg25;
        int v4 = arg26;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v6 = arg19 + (v4 + 0x100 - arg18 + arg28) / arg28;
            if(v6 > v3) {
                goto label_15;
            }
        }
        else {
        label_15:
            v6 = v3;
        }

        int v2 = arg19 << 1;
        v6 <<= 1;
        int v7 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v6) {
            int v10 = v7 >> 8;
            int v12 = (arg16[v10 - 1] << 8) + (arg16[v10] - arg16[v10 - 1]) * (0xB982622F & v7);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        if(arg28 != 0) {
            v4 = (v4 - v7 + arg28) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v4 = (arg29 << 8) + (arg16[v7 >> 8] - arg29) * (v7 & 0xFF);
            v6 = v2 + 1;
            arg17[v2] += v4 * v8 >> 6;
            v8 += arg22;
            v2 = v6 + 1;
            arg17[v6] += v4 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v7;
        return v0;
    }

    static int gm(int arg14, int arg15, byte[] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, hx arg27, int arg28, int arg29) {
        int v6;
        int v3 = arg25;
        int v4 = arg26;
        hx v5 = arg27;
        v5.an -= v5.av * arg19;
        if(arg28 != 0) {
            v6 = arg19 + (v4 + 0x100 - arg18 + arg28) / arg28;
            if(v6 > v3) {
                goto label_15;
            }
        }
        else {
        label_15:
            v6 = v3;
        }

        int v2 = arg19 << 1;
        v6 <<= 1;
        int v7 = arg18;
        int v8 = arg20;
        int v9 = arg21;
        while(v2 < v6) {
            int v10 = v7 >> 8;
            int v12 = (arg16[v10 - 1] << 8) + (arg16[v10] - arg16[v10 - 1]) * (0x6EFBFBFA & v7);
            v10 = v2 + 1;
            arg17[v2] += v12 * v8 >> 6;
            v8 += arg22;
            v2 = v10 + 1;
            arg17[v10] += v12 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        if(arg28 != 0) {
            v4 = (v4 - v7 + arg28) / arg28 + (v2 >> 1);
            if(v4 > v3) {
            }
            else {
                v3 = v4;
            }
        }

        v3 <<= 1;
        while(v2 < v3) {
            v4 = (arg29 << 8) + (arg16[v7 >> 8] - arg29) * (0x78F7AA2C & v7);
            v6 = v2 + 1;
            arg17[v2] += v4 * v8 >> 6;
            v8 += arg22;
            v2 = v6 + 1;
            arg17[v6] += v4 * v9 >> 6;
            v9 += arg23;
            v7 += arg28;
        }

        int v0 = v2 >> 1;
        v5.an += v5.av * v0;
        v5.ap = v8;
        v5.aj = v9;
        v5.ax = v7;
        return v0;
    }
}

