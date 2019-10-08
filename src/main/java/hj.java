public class hj extends bm {
    int ad;
    int ae;
    df aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int ax;
    static final int ba = 0x7F;
    static final int bs = 10;
    static es ga;

    hj(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, bm arg10) {
        try {
            super();
            this.ax = arg2 * 0xA0FAE04B;
            this.al = arg3 * 2001847357;
            this.ae = arg4 * 0x3F750D61;
            this.ar = arg5 * 0x715FABCF;
            this.an = arg6 * 0xA2807E85;
            this.ap = arg7 * 0xB01DCC13;
            arg2 = -1;
            if(arg2 != arg8) {
                this.aj = fs.al(arg8, 1304812425);
                this.ad = 0;
                arg4 = 0x4979087B;
                this.aq = client.bj * 0xDF54B445 - arg4;
                if(this.aj.ah * 0x2D690AE9 == 0 && arg10 != null && ((arg10 instanceof hj)) && this.aj == ((hj)arg10).aj) {
                    this.ad = ((hj)arg10).ad;
                    this.aq = ((hj)arg10).aq;
                    return;
                }

                if(!arg9) {
                    return;
                }

                if(arg2 == this.aj.ab * 0xB171C811) {
                    return;
                }

                this.ad = (((int)(Math.random() * (((double)this.aj.ap.length))))) * 2006231377;
                this.aq -= (((int)(Math.random() * (((double)this.aj.ad[this.ad * 0xD0CC3FB1]))))) * arg4;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hj.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void aj(lq arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        byte v13 = -23;
        int v0 = 49;
        if(arg8 >= 0) {
            int v2 = 104;
            if(arg8 >= v2) {
                goto label_105;
            }
            else if(arg9 < 0) {
                goto label_105;
            }
            else if(arg9 < v2) {
                try {
                    id.al[arg7][arg8][arg9] = 0;
                    while(true) {
                        v2 = arg6.ay(v13);
                        if(v2 == 0) {
                            break;
                        }
                        else if(v2 == 1) {
                            int v6_1 = arg6.ay(-104);
                            if(1 == v6_1) {
                                v6_1 = 0;
                            }

                            if(arg7 == 0) {
                                id.ax[0][arg8][arg9] = -v6_1 * 8;
                                return;
                            }

                            id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - v6_1 * 8;
                        }
                        else {
                            if(v2 <= v0) {
                                id.an[arg7][arg8][arg9] = arg6.aw(-1215098345);
                                v2 += -2;
                                id.ap[arg7][arg8][arg9] = ((byte)(v2 / 4));
                                id.aj[arg7][arg8][arg9] = ((byte)(v2 + arg12 & 3));
                                continue;
                            }

                            if(v2 <= 81) {
                                id.al[arg7][arg8][arg9] = ((byte)(v2 - 49));
                                continue;
                            }

                            id.ar[arg7][arg8][arg9] = ((byte)(v2 - 81));
                            continue;
                        }

                        return;
                    }

                    if(arg7 == 0) {
                        id.ax[0][arg8][arg9] = -di.aa(arg10 + (arg8 + 0xE3B7B), 0x87CCE + arg9 + arg11, 0xA8964315) * 8;
                        return;
                    }

                    id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - 0xF0;
                    return;
                    while(true) {
                    label_105:
                        arg7 = arg6.ay(-84);
                        if(arg7 == 0) {
                            return;
                        }

                        if(1 == arg7) {
                            arg6.ay(v13);
                            return;
                        }

                        if(arg7 > v0) {
                            continue;
                        }

                        arg6.ay(-7);
                    }

                    return;
                }
                catch(RuntimeException v6) {
                    StringBuilder v7 = new StringBuilder();
                    v7.append("hj.aj(");
                    v7.append(')');
                    throw lx.al(((Throwable)v6), v7.toString());
                }
            }
            else {
                goto label_105;
            }
        }
        else {
            goto label_105;
        }
    }

    static String al(byte[] arg5, int arg6, int arg7, int arg8) {
        try {
            StringBuilder v8 = new StringBuilder();
            int v0;
            for(v0 = arg6; v0 < arg7 + arg6; v0 += 3) {
                int v1 = arg5[v0] & 0xFF;
                v8.append(lm.ax[v1 >>> 2]);
                if(v0 < arg7 - 1) {
                    int v2 = arg5[v0 + 1] & 0xFF;
                    v8.append(lm.ax[(v1 & 3) << 4 | v2 >>> 4]);
                    if(v0 < arg7 - 2) {
                        v1 = arg5[v0 + 2] & 0xFF;
                        v8.append(lm.ax[(v2 & 15) << 2 | v1 >>> 6]);
                        v8.append(lm.ax[v1 & 0x3F]);
                    }
                    else {
                        v8.append(lm.ax[(v2 & 15) << 2]);
                        v8.append("=");
                    }
                }
                else {
                    v8.append(lm.ax[(v1 & 3) << 4]);
                    v8.append("==");
                }
            }

            return v8.toString();
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("hj.al(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public static int ar(int arg2, int arg3) {
        int v0;
        arg3 = 16;
        if(arg2 < 0 || arg2 >= 0x10000) {
            arg2 >>>= 16;
            v0 = 16;
        }
        else {
            v0 = 0;
        }

        if(arg2 >= 0x100) {
            arg2 >>>= 8;
            v0 += 8;
        }

        if(arg2 >= arg3) {
            arg2 >>>= 4;
            v0 += 4;
        }

        if(arg2 >= 4) {
            arg2 >>>= 2;
            v0 += 2;
        }

        if(arg2 >= 1) {
            arg2 >>>= 1;
            ++v0;
        }

        return v0 + arg2;
    }

    protected final ca as() {
        int v1_1;
        int v3;
        try {
            df v1 = null;
            int v2 = 0xD0CC3FB1;
            if(this.aj != null) {
                v3 = -2077001153;
                int v0_1 = client.bj * v3 - this.aq * 0x310596B3;
                if(v0_1 > 100 && this.aj.ab * 0xB171C811 > 0) {
                    v0_1 = 100;
                }

                do {
                    if(v0_1 > this.aj.ad[this.ad * v2]) {
                        v0_1 -= this.aj.ad[this.ad * v2];
                        this.ad += 2006231377;
                        if(this.ad * v2 < this.aj.ap.length) {
                            continue;
                        }

                        this.ad -= this.aj.ab * 0xD2E78661;
                        if(this.ad * v2 >= 0 && this.ad * v2 < this.aj.ap.length) {
                            continue;
                        }

                        break;
                    }

                    goto label_58;
                }
                while(true);

                this.aj = v1;
            label_58:
                this.aq = (client.bj * v3 - v0_1) * 0x4979087B;
            }

            do v0_2 = ok.al(this.ax * 975563107, 800791607);
            if(v0_2.bc != null) {
                v0_2 = v0_2.ai(-702090457);
            }

            if(v0_2 == null) {
                return ((ca)v1);
            }

            v3 = 1801737889;
            int v4 = 0xB46CA623;
            int v5 = 0x4B9D7897;
            if(this.ae * v3 == 1 || 3 == this.ae * v3) {
                v1_1 = v0_2.ag * v5;
                v4 *= v0_2.az;
            }
            else {
                v1_1 = v0_2.az * v4;
                v4 = v0_2.ag * v5;
            }

            v5 = (v1_1 >> 1) + this.an * 0x5901CA4D;
            int v7 = this.an * 0x5901CA4D + (v1_1 + 1 >> 1);
            int v9 = (v4 >> 1) + this.ap * 0xA8F1DE1B;
            int v6 = (v4 + 1 >> 1) + this.ap * 0xA8F1DE1B;
            return v0_2.ab(this.al * 0x4C69F315, v3 * this.ae, id.ax[this.ar * 0x53AD7B2F], (this.an * 0x5901CA4D << 7) + (v1_1 << 6), id.ax[this.ar * 0x53AD7B2F][v7][v6] + (id.ax[this.ar * 0x53AD7B2F][v5][v9] + id.ax[this.ar * 0x53AD7B2F][v7][v9] + id.ax[this.ar * 0x53AD7B2F][v5][v6]) >> 2, (this.ap * 0xA8F1DE1B << 7) + (v4 << 6), this.aj, this.ad * v2, 0x4A90AB9);
        }
        catch(RuntimeException v0) {
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("hj.as(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0), v1_2.toString());
        }
    }

    static final void bs(int arg10) {
        int v6;
        int v5;
        int v2;
        int v0 = 0;
        try {
            while(true) {
                v2 = 0xFE380E33;
                if(v0 >= client.pd * v2) {
                    break;
                }

                --client.pa[v0];
                if(client.pa[v0] < -10) {
                    client.pd -= 0xC7119CFB;
                    int v1;
                    for(v1 = v0; v1 < client.pd * v2; v1 = v5) {
                        v5 = v1 + 1;
                        client.px[v1] = client.px[v5];
                        client.ps[v1] = client.ps[v5];
                        client.pq[v1] = client.pq[v5];
                        client.pa[v1] = client.pa[v5];
                        client.pz[v1] = client.pz[v5];
                    }

                    --v0;
                }
                else {
                    hb v1_1 = client.ps[v0];
                    if(v1_1 == null) {
                        v1_1 = hb.ax(fq.cg, client.px[v0], 0);
                        if(v1_1 != null) {
                            client.pa[v0] += v1_1.ae();
                            client.ps[v0] = v1_1;
                        }
                        else {
                            goto label_132;
                        }
                    }

                    if(client.pa[v0] >= 0) {
                        goto label_132;
                    }

                    int v3 = -100;
                    if(client.pz[v0] != 0) {
                        v2 = (client.pz[v0] & 0xFF) * 0x80;
                        int v4 = (client.pz[v0] >> 16 & 0xFF) * 0x80 + 0x40 - gu.jg.bp * 0x914F0683;
                        if(v4 < 0) {
                            v4 = -v4;
                        }

                        v5 = (client.pz[v0] >> 8 & 0xFF) * 0x80 + 0x40 - gu.jg.bw * 0xD19D0C3D;
                        if(v5 < 0) {
                            v5 = -v5;
                        }

                        v4 = v4 + v5 - 0x80;
                        if(v4 > v2) {
                            client.pa[v0] = v3;
                            goto label_132;
                        }

                        if(v4 < 0) {
                            v4 = 0;
                        }

                        v6 = client.py * 0x6EC3BC9B * (v2 - v4) / v2;
                    }
                    else {
                        v6 = client.pb * 0xE0F0EA6D;
                    }

                    if(v6 > 0) {
                        hx v1_2 = hx.ae(v1_1.al().ax(oz.pp), 100, v6);
                        v1_2.ab(client.pq[v0] - 1);
                        lo.pr.ax(((hz)v1_2));
                    }

                    client.pa[v0] = v3;
                }

            label_132:
                ++v0;
            }

            if((client.po) && !co.aq(0x1F67CC50)) {
                v1 = 0x3310F9D5;
                if(client.pc * v1 != 0) {
                    v2 = 2029067435;
                    if(-1 != client.pm * v2) {
                        ik.ae(gn.dv, client.pm * v2, 0, client.pc * v1, false, -115);
                    }
                }

                client.po = false;
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("hj.bs(");
            v0_1.append(')');
            throw lx.al(((Throwable)v10), v0_1.toString());
        }
    }

    protected final ca db() {
        int v0;
        df v1 = null;
        int v2 = 0xD0CC3FB1;
        if(this.aj != null) {
            int v3 = -2077001153;
            v0 = client.bj * v3 - this.aq * 0x310596B3;
            if(v0 > 100 && this.aj.ab * 0xB171C811 > 0) {
                v0 = 100;
            }

            do {
                if(v0 > this.aj.ad[this.ad * v2]) {
                    v0 -= this.aj.ad[this.ad * v2];
                    this.ad += 2006231377;
                    if(this.ad * v2 < this.aj.ap.length) {
                        continue;
                    }

                    this.ad -= this.aj.ab * 0xD2E78661;
                    if(this.ad * v2 >= 0 && this.ad * v2 < this.aj.ap.length) {
                        continue;
                    }

                    break;
                }

                goto label_58;
            }
            while(true);

            this.aj = v1;
        label_58:
            this.aq = (client.bj * v3 - v0) * 0x4979087B;
        }

        do v0_1 = ok.al(this.ax * 975563107, 337210225);
        if(v0_1.bc != null) {
            v0_1 = v0_1.ai(-293066316);
        }

        do v3_1 = v0_1;
        if(v3_1 == null) {
            return ((ca)v1);
        }

        int v1_1 = 1801737889;
        int v4 = 0xB46CA623;
        int v5 = 0x4B9D7897;
        if(this.ae * v1_1 == 1 || 3 == this.ae * v1_1) {
            v0 = v3_1.ag * v5;
            v4 *= v3_1.az;
        }
        else {
            v0 = v3_1.az * v4;
            v4 = v3_1.ag * v5;
        }

        v5 = (v0 >> 1) + this.an * 0x5901CA4D;
        int v7 = this.an * 0x5901CA4D + (v0 + 1 >> 1);
        int v9 = (v4 >> 1) + this.ap * 0xA8F1DE1B;
        int v6 = (v4 + 1 >> 1) + this.ap * 0xA8F1DE1B;
        return v3_1.ab(0x4C69F315 * this.al, this.ae * v1_1, id.ax[this.ar * 0x53AD7B2F], (v0 << 6) + (this.an * 0x5901CA4D << 7), id.ax[this.ar * 0x53AD7B2F][v7][v6] + (id.ax[this.ar * 0x53AD7B2F][v5][v9] + id.ax[this.ar * 0x53AD7B2F][v7][v9] + id.ax[this.ar * 0x53AD7B2F][v5][v6]) >> 2, (this.ap * 0xA8F1DE1B << 7) + (v4 << 6), this.aj, this.ad * v2, 0x4A90AB9);
    }

    protected final ca dm() {
        int v3;
        int v5;
        int v0;
        df v1 = null;
        if(this.aj != null) {
            int v2 = -2077001153;
            v0 = client.bj * v2 - this.aq * 0x310596B3;
            if(v0 > 100 && this.aj.ab * 0xB171C811 > 0) {
                v0 = 1708691764;
            }

            do {
                v5 = 0xD0CC3FB1;
                if(v0 > this.aj.ad[this.ad * v5]) {
                    v0 -= this.aj.ad[this.ad * -170568310];
                    this.ad += 0x9229CA82;
                    if(this.ad * -305352411 < this.aj.ap.length) {
                        continue;
                    }

                    this.ad -= this.aj.ab * 0xD2E78661;
                    if(this.ad * 0x533F0E39 >= 0 && this.ad * v5 < this.aj.ap.length) {
                        continue;
                    }

                    break;
                }

                goto label_61;
            }
            while(true);

            this.aj = v1;
        label_61:
            this.aq = (client.bj * v2 - v0) * 0x45E3004A;
        }

        do v0_1 = ok.al(this.ax * -2013500049, -281550306);
        if(v0_1.bc != null) {
            v0_1 = v0_1.ai(-178578105);
        }

        do v2_1 = v0_1;
        if(v2_1 == null) {
            return ((ca)v1);
        }

        if(this.ae * 1801737889 == 1 || 3 == this.ae * 364069694) {
            v0 = 0x4B9D7897 * v2_1.ag;
            v3 = v2_1.az * 0xB46CA623;
        }
        else {
            v0 = v2_1.az * 0xD0E5DC20;
            v3 = v2_1.ag * -1570800298;
        }

        int v4 = (v0 >> 1) + this.an * -453765060;
        int v6 = this.an * 0x5901CA4D + (v0 + 1 >> 1);
        v5 = (v3 >> 1) + this.ap * 0x7A100C4;
        int v1_1 = (v3 + 1 >> 1) + this.ap * 0xA8F1DE1B;
        return v2_1.ab(this.al * 0xAF9A2175, 0x51D1F736 * this.ae, id.ax[this.ar * 0xE154B28C], (v0 << 6) + (this.an * 1140280830 << 7), id.ax[this.ar * 0xE154B28C][v6][v1_1] + (id.ax[this.ar * 0xE154B28C][v4][v5] + id.ax[this.ar * 0xE154B28C][v6][v5] + id.ax[this.ar * 0xE154B28C][v4][v1_1]) >> 2, (this.ap * 0x5F5602CC << 7) + (v3 << 6), this.aj, this.ad * -1078080951, 0x4A90AB9);
    }

    protected final ca du() {
        int v0;
        df v1 = null;
        int v2 = 0xD0CC3FB1;
        if(this.aj != null) {
            v0 = client.bj * -2077001153 - this.aq * 0x310596B3;
            if(v0 > 1807452083 && this.aj.ab * -1035549690 > 0) {
                v0 = 100;
            }

            do {
                if(v0 > this.aj.ad[this.ad * v2]) {
                    v0 -= this.aj.ad[this.ad * 0x5590B4AE];
                    this.ad += 2006231377;
                    if(this.ad * 0x46D43271 < this.aj.ap.length) {
                        continue;
                    }

                    this.ad -= this.aj.ab * 1267102260;
                    if(this.ad * 0x3B901964 >= 0 && this.ad * v2 < this.aj.ap.length) {
                        continue;
                    }

                    break;
                }

                goto label_61;
            }
            while(true);

            this.aj = v1;
        label_61:
            this.aq = (client.bj * 0x1F163AEF - v0) * 0x4979087B;
        }

        do v0_1 = ok.al(this.ax * 975563107, 0xC5A2A63D);
        if(v0_1.bc != null) {
            v0_1 = v0_1.ai(0xE9F2AB53);
        }

        do v3 = v0_1;
        if(v3 == null) {
            return ((ca)v1);
        }

        int v1_1 = 1801737889;
        int v4 = 0xB46CA623;
        if(this.ae * v1_1 == 1 || 3 == this.ae * v1_1) {
            v0 = 0x4B9D7897 * v3.ag;
            v4 *= v3.az;
        }
        else {
            v0 = v3.az * v4;
            v4 = v3.ag * 0x4D51E08A;
        }

        int v6 = (v0 >> 1) + this.an * 0x5901CA4D;
        int v8 = this.an * 1038593591 + (v0 + 1 >> 1);
        int v7 = (v4 >> 1) + this.ap * 0xB9A07F6D;
        int v5 = (v4 + 1 >> 1) + this.ap * 0xA8F1DE1B;
        return v3.ab(0x4C69F315 * this.al, this.ae * v1_1, id.ax[this.ar * 0x53AD7B2F], (v0 << 6) + (this.an * 0x16E79461 << 7), id.ax[this.ar * 0x53AD7B2F][v8][v5] + (id.ax[this.ar * 0x53AD7B2F][v6][v7] + id.ax[this.ar * 0x53AD7B2F][v8][v7] + id.ax[this.ar * 0x53AD7B2F][v6][v5]) >> 2, (this.ap * 0xA8F1DE1B << 7) + (v4 << 6), this.aj, this.ad * v2, 0x4A90AB9);
    }

    public static final void fz(int arg2, int arg3, int arg4) {
        try {
            ee.fs.bx(kt.jz * 1101813865, arg2, arg3, false);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hj.fz(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

