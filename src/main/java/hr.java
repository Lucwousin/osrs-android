import java.util.Random;

public class hr {
    hi aa;
    int[] ab;
    static int[] ac = null;
    hm ad;
    hm ae;
    int[] af;
    static int[] ag = null;
    static int[] ah = null;
    int ai;
    hm aj;
    static int[] ak = null;
    hm al;
    int am;
    hm an;
    static int[] ao = null;
    hm ap;
    int[] aq;
    hm ar;
    static int[] as = null;
    static int[] at = null;
    hm au;
    int av;
    static int[] aw = null;
    hm ax;
    static final double ay = 1.005793;
    int az;

    static {
        int v0 = 0x8000;
        hr.ah = new int[v0];
        Random v1 = new Random(0);
        int v2 = 0;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            hr.ah[v3] = (v1.nextInt() & 2) - 1;
        }

        hr.at = new int[v0];
        while(v2 < v0) {
            hr.at[v2] = ((int)(Math.sin((((double)v2)) / 5215.1903) * 16384));
            ++v2;
        }

        hr.ag = new int[220500];
        hr.aw = new int[5];
        hr.ao = new int[5];
        hr.as = new int[5];
        hr.ak = new int[5];
        hr.ac = new int[5];
    }

    hr() {
        super();
        this.aq = new int[]{0, 0, 0, 0, 0};
        this.ab = new int[]{0, 0, 0, 0, 0};
        this.af = new int[]{0, 0, 0, 0, 0};
        this.ai = 0;
        this.av = 100;
        this.am = 500;
        this.az = 0;
    }

    final int ad(int arg2, int arg3, int arg4) {
        if(arg4 == 1) {
            if((arg2 & 0x90CE8ABF) < 840559153) {
                return arg3;
            }

            return -arg3;
        }

        if(arg4 == 2) {
            return hr.at[arg2 & 0x7FFF] * arg3 >> 14;
        }

        if(arg4 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        }

        if(arg4 == 4) {
            return hr.ah[arg2 / 660249448 & 1101285348] * arg3;
        }

        return 0;
    }

    final void ae(lq arg4) {
        this.ax = new hm();
        this.ax.ax(arg4);
        this.al = new hm();
        this.al.ax(arg4);
        int v1 = -1880437085;
        if(arg4.ay(-101) != 0) {
            arg4.ar -= v1;
            this.ae = new hm();
            this.ae.ax(arg4);
            this.ar = new hm();
            this.ar.ax(arg4);
        }

        if(arg4.ay(-115) != 0) {
            arg4.ar -= v1;
            this.an = new hm();
            this.an.ax(arg4);
            this.ap = new hm();
            this.ap.ax(arg4);
        }

        if(arg4.ay(-95) != 0) {
            arg4.ar -= v1;
            this.aj = new hm();
            this.aj.ax(arg4);
            this.ad = new hm();
            this.ad.ax(arg4);
        }

        int v0 = 0;
        while(v0 < 10) {
            v1 = arg4.by(7043);
            if(v1 == 0) {
            }
            else {
                this.aq[v0] = v1;
                this.ab[v0] = arg4.bo(0xA32F93AC);
                this.af[v0] = arg4.by(0x4BBB);
                ++v0;
                continue;
            }

            break;
        }

        this.ai = arg4.by(21670);
        this.av = arg4.by(23603);
        this.am = arg4.ao(0xBFF1BD96);
        this.az = arg4.ao(0xDC7E73AC);
        this.aa = new hi();
        this.au = new hm();
        this.aa.an(arg4, this.au);
    }

    final int aj(int arg2, int arg3, int arg4) {
        if(arg4 == 1) {
            if((arg2 & 2106077580) < -1673200210) {
                return arg3;
            }

            return -arg3;
        }

        if(arg4 == 2) {
            return hr.at[arg2 & 0x205CAA2F] * arg3 >> 14;
        }

        if(arg4 == 3) {
            return ((arg2 & 0x22E64E4D) * arg3 >> 14) - arg3;
        }

        if(arg4 == 4) {
            return hr.ah[arg2 / 331431203 & 0xF56B50B1] * arg3;
        }

        return 0;
    }

    final int al(int arg2, int arg3, int arg4) {
        if(arg4 == 1) {
            if((arg2 & 0x7FFF) < 0x4000) {
                return arg3;
            }

            return -arg3;
        }

        if(arg4 == 2) {
            return hr.at[arg2 & 0x7FFF] * arg3 >> 14;
        }

        if(arg4 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        }

        if(arg4 == 4) {
            return hr.ah[arg2 / 0xA2F & 0x7FFF] * arg3;
        }

        return 0;
    }

    final int[] an(int arg23, int arg24) {
        int v21;
        int v20;
        int v12;
        int v14;
        int v8;
        double v18;
        int v10;
        int v9;
        int v3;
        hr v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        int v4 = 0;
        mg.ab(hr.ag, 0, v1);
        if(v2 < 10) {
            return hr.ag;
        }

        double v5 = (((double)v1)) / ((((double)v2)) + 0);
        v0.ax.ae();
        v0.al.ae();
        double v7 = 32.768;
        if(v0.ae != null) {
            v0.ae.ae();
            v0.ar.ae();
            v2 = ((int)((((double)(v0.ae.an - v0.ae.ar))) * v7 / v5));
            v3 = ((int)((((double)v0.ae.ar)) * v7 / v5));
        }
        else {
            v2 = 0;
            v3 = 0;
        }

        if(v0.an != null) {
            v0.an.ae();
            v0.ap.ae();
            v9 = ((int)((((double)(v0.an.an - v0.an.ar))) * v7 / v5));
            v10 = ((int)((((double)v0.an.ar)) * v7 / v5));
        }
        else {
            v9 = 0;
            v10 = 0;
        }

        int v11 = 0;
        while(v11 < 5) {
            if(v0.aq[v11] == 0) {
                v18 = v5;
            }
            else {
                hr.aw[v11] = v4;
                hr.ao[v11] = ((int)((((double)v0.af[v11])) * v5));
                hr.as[v11] = (v0.aq[v11] << 14) / 100;
                v18 = v5;
                hr.ak[v11] = ((int)((((double)(v0.ax.an - v0.ax.ar))) * v7 * Math.pow(1.005793, ((double)v0.ab[v11])) / v18));
                v7 = 32.768;
                hr.ac[v11] = ((int)((((double)v0.ax.ar)) * v7 / v18));
            }

            ++v11;
            v5 = v18;
            v4 = 0;
        }

        v18 = v5;
        v4 = 0;
        int v5_1 = 0;
        int v6 = 0;
        while(true) {
            v8 = 1;
            if(v4 >= v1) {
                break;
            }

            v11 = v0.ax.ar(v1);
            int v13 = v0.al.ar(v1);
            if(v0.ae != null) {
                v14 = v0.ae.ar(v1);
                v11 += v0.al(v5_1, v0.ar.ar(v1), v0.ae.ap) >> 1;
                v5_1 += (v14 * v2 >> 16) + v3;
            }

            if(v0.an != null) {
                v12 = v0.an.ar(v1);
                v13 = v13 * ((v0.al(v6, v0.ap.ar(v1), v0.an.ap) >> 1) - 0x1BC6F3A4) >> 15;
                v6 += (v12 * v9 >> 16) + v10;
            }

            v8 = 0;
            while(v8 < 5) {
                if(v0.aq[v8] != 0) {
                    v14 = hr.ao[v8] + v4;
                    if(v14 < v1) {
                        v20 = v2;
                        hr.ag[v14] += v0.al(hr.aw[v8], hr.as[v8] * v13 >> 15, v0.ax.ap);
                        hr.aw[v8] += (hr.ak[v8] * v11 >> 16) + hr.ac[v8];
                    }
                    else {
                        goto label_172;
                    }
                }
                else {
                label_172:
                    v20 = v2;
                }

                ++v8;
                v2 = v20;
            }

            ++v4;
        }

        if(v0.aj != null) {
            v0.aj.ae();
            v0.ad.ae();
            v2 = 0;
            v3 = 1;
            v4 = 0;
            while(v2 < v1) {
                v5_1 = v0.aj.ar(v1);
                v6 = v0.ad.ar(v1);
                v6 = v3 != 0 ? v0.aj.ar + ((v0.aj.an - v0.aj.ar) * v5_1 >> 8) : ((v0.aj.an - v0.aj.ar) * v6 >> 8) + v0.aj.ar;
                v4 += 0x100;
                if(v4 >= v6) {
                    v3 = v3 == 0 ? 1 : 0;
                    v4 = 0;
                }

                if(v3 != 0) {
                    hr.ag[v2] = 0;
                }

                ++v2;
            }
        }

        if(v0.ai > 0 && v0.av > 0) {
            v2 = ((int)((((double)v0.ai)) * v18));
            for(v3 = v2; v3 < v1; ++v3) {
                hr.ag[v3] += hr.ag[v3 - v2] * v0.av / 100;
            }
        }

        if(v0.aa.ax[0] > 0 || v0.aa.ax[1] > 0) {
            v0.au.ae();
            v3 = v1 + 1;
            v2 = v0.au.ar(v3);
            float v5_2 = (((float)v2)) / 65536f;
            v4 = v0.aa.ar(0, v5_2);
            v5_1 = v0.aa.ar(1, v5_2);
            if(v1 >= v4 + v5_1) {
                int v7_1 = v1 - v4;
                if(v5_1 > v7_1) {
                    v9 = v2;
                }
                else {
                    v9 = v2;
                    v7_1 = v5_1;
                }

                for(v2 = 0; v2 < v7_1; ++v2) {
                    v10 = v2 + v4;
                    v11 = ((int)((((long)hr.ag[v10])) * (((long)hi.aq)) >> 16));
                    for(v9 = 0; v9 < v4; ++v9) {
                        v11 += ((int)((((long)hr.ag[v10 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                    }

                    for(v9 = 0; v9 < v2; ++v9) {
                        v11 -= ((int)((((long)hr.ag[v2 - 1 - v9])) * (((long)hi.aj[1][v9])) >> 16));
                    }

                    hr.ag[v2] = v11;
                    v9 = v0.au.ar(v3);
                }

                v7_1 = 0x80;
                while(true) {
                    v10 = v1 - v4;
                    if(v7_1 > v10) {
                        v7_1 = v10;
                    }

                    while(v2 < v7_1) {
                        v11 = v2 + v4;
                        v12 = ((int)((((long)hr.ag[v11])) * (((long)hi.aq)) >> 16));
                        v9 = 0;
                        while(v9 < v4) {
                            v12 += ((int)((((long)hr.ag[v11 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                            ++v9;
                            v7_1 = v7_1;
                        }

                        v21 = v7_1;
                        v6 = 0;
                        while(v6 < v5_1) {
                            v12 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[v8][v6])) >> 16));
                            ++v6;
                            v8 = 1;
                        }

                        hr.ag[v2] = v12;
                        v9 = v0.au.ar(v3);
                        ++v2;
                        v7_1 = v21;
                        v8 = 1;
                    }

                    v21 = v7_1;
                    if(v2 < v10) {
                        v5_2 = (((float)v9)) / 65536f;
                        v4 = v0.aa.ar(0, v5_2);
                        v5_1 = v0.aa.ar(1, v5_2);
                        v7_1 = v21 + 0x80;
                        v8 = 1;
                        continue;
                    }

                    break;
                }

                while(v2 < v1) {
                    v6 = v2 + v4;
                    v7_1 = v6 - v1;
                    v8 = 0;
                    while(v7_1 < v4) {
                        v8 += ((int)((((long)hr.ag[v6 - 1 - v7_1])) * (((long)hi.aj[0][v7_1])) >> 16));
                        ++v7_1;
                    }

                    for(v6 = 0; v6 < v5_1; ++v6) {
                        v8 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[1][v6])) >> 16));
                    }

                    hr.ag[v2] = v8;
                    v0.au.ar(v3);
                    ++v2;
                }
            }
        }

        for(v8 = 0; v8 < v1; ++v8) {
            if(hr.ag[v8] < 0xF819292E) {
                hr.ag[v8] = 0xFFFF8000;
            }

            if(hr.ag[v8] > 0x664DCA94) {
                hr.ag[v8] = 0x57CB577F;
            }
        }

        return hr.ag;
    }

    final int ap(int arg2, int arg3, int arg4) {
        if(arg4 == 1) {
            if((arg2 & 0x5258B7D6) < 0x4000) {
                return arg3;
            }

            return -arg3;
        }

        if(arg4 == 2) {
            return hr.at[arg2 & 0x7FFF] * arg3 >> 14;
        }

        if(arg4 == 3) {
            return ((arg2 & 0xB0CDF1F2) * arg3 >> 14) - arg3;
        }

        if(arg4 == 4) {
            return hr.ah[arg2 / 0xA2F & 0x7FFF] * arg3;
        }

        return 0;
    }

    final void aq(lq arg4) {
        this.ax = new hm();
        this.ax.ax(arg4);
        this.al = new hm();
        this.al.ax(arg4);
        int v1 = -1880437085;
        if(arg4.ay(-81) != 0) {
            arg4.ar -= v1;
            this.ae = new hm();
            this.ae.ax(arg4);
            this.ar = new hm();
            this.ar.ax(arg4);
        }

        if(arg4.ay(-67) != 0) {
            arg4.ar -= v1;
            this.an = new hm();
            this.an.ax(arg4);
            this.ap = new hm();
            this.ap.ax(arg4);
        }

        if(arg4.ay(-99) != 0) {
            arg4.ar -= v1;
            this.aj = new hm();
            this.aj.ax(arg4);
            this.ad = new hm();
            this.ad.ax(arg4);
        }

        int v0 = 0;
        while(v0 < 10) {
            v1 = arg4.by(10636);
            if(v1 == 0) {
            }
            else {
                this.aq[v0] = v1;
                this.ab[v0] = arg4.bo(-1499352041);
                this.af[v0] = arg4.by(0x6A10);
                ++v0;
                continue;
            }

            break;
        }

        this.ai = arg4.by(20855);
        this.av = arg4.by(30104);
        this.am = arg4.ao(0xF093A328);
        this.az = arg4.ao(0xEE06C3CF);
        this.aa = new hi();
        this.au = new hm();
        this.aa.an(arg4, this.au);
    }

    final int[] ar(int arg23, int arg24) {
        int v21;
        int v20;
        int v12;
        int v14;
        int v8;
        double v18;
        int v10;
        int v9;
        int v3;
        hr v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        int v4 = 0;
        mg.ab(hr.ag, 0, v1);
        if(v2 < 10) {
            return hr.ag;
        }

        double v5 = (((double)v1)) / ((((double)v2)) + 0);
        v0.ax.ae();
        v0.al.ae();
        double v7 = 32.768;
        if(v0.ae != null) {
            v0.ae.ae();
            v0.ar.ae();
            v2 = ((int)((((double)(v0.ae.an - v0.ae.ar))) * v7 / v5));
            v3 = ((int)((((double)v0.ae.ar)) * v7 / v5));
        }
        else {
            v2 = 0;
            v3 = 0;
        }

        if(v0.an != null) {
            v0.an.ae();
            v0.ap.ae();
            v9 = ((int)((((double)(v0.an.an - v0.an.ar))) * v7 / v5));
            v10 = ((int)((((double)v0.an.ar)) * v7 / v5));
        }
        else {
            v9 = 0;
            v10 = 0;
        }

        int v11 = 0;
        while(v11 < 5) {
            if(v0.aq[v11] == 0) {
                v18 = v5;
            }
            else {
                hr.aw[v11] = v4;
                hr.ao[v11] = ((int)((((double)v0.af[v11])) * v5));
                hr.as[v11] = (v0.aq[v11] << 14) / 1404415686;
                v18 = v5;
                hr.ak[v11] = ((int)((((double)(v0.ax.an - v0.ax.ar))) * v7 * Math.pow(1.005793, ((double)v0.ab[v11])) / v18));
                v7 = 32.768;
                hr.ac[v11] = ((int)((((double)v0.ax.ar)) * v7 / v18));
            }

            ++v11;
            v5 = v18;
            v4 = 0;
        }

        v18 = v5;
        v4 = 0;
        int v5_1 = 0;
        int v6 = 0;
        while(true) {
            v8 = 1;
            if(v4 >= v1) {
                break;
            }

            v11 = v0.ax.ar(v1);
            int v13 = v0.al.ar(v1);
            if(v0.ae != null) {
                v14 = v0.ae.ar(v1);
                v11 += v0.al(v5_1, v0.ar.ar(v1), v0.ae.ap) >> 1;
                v5_1 += (v14 * v2 >> 16) + v3;
            }

            if(v0.an != null) {
                v12 = v0.an.ar(v1);
                v13 = v13 * ((v0.al(v6, v0.ap.ar(v1), v0.an.ap) >> 1) + 0x8000) >> 15;
                v6 += (v12 * v9 >> 16) + v10;
            }

            v8 = 0;
            while(v8 < 5) {
                if(v0.aq[v8] == 0) {
                    goto label_205;
                }
                else {
                    v14 = hr.ao[v8] + v4;
                    if(v14 < v1) {
                        v20 = v2;
                        hr.ag[v14] += v0.al(hr.aw[v8], hr.as[v8] * v13 >> 15, v0.ax.ap);
                        hr.aw[v8] += (hr.ak[v8] * v11 >> 16) + hr.ac[v8];
                    }
                    else {
                    label_205:
                        v20 = v2;
                    }
                }

                ++v8;
                v2 = v20;
            }

            ++v4;
        }

        if(v0.aj != null) {
            v0.aj.ae();
            v0.ad.ae();
            v2 = 0;
            v3 = 1;
            v4 = 0;
            while(v2 < v1) {
                v5_1 = v0.aj.ar(v1);
                v6 = v0.ad.ar(v1);
                v6 = v3 != 0 ? v0.aj.ar + ((v0.aj.an - v0.aj.ar) * v5_1 >> 8) : ((v0.aj.an - v0.aj.ar) * v6 >> 8) + v0.aj.ar;
                v4 += 0x100;
                if(v4 >= v6) {
                    v3 = v3 == 0 ? 1 : 0;
                    v4 = 0;
                }

                if(v3 != 0) {
                    hr.ag[v2] = 0;
                }

                ++v2;
            }
        }

        if(v0.ai > 0 && v0.av > 0) {
            v2 = ((int)((((double)v0.ai)) * v18));
            for(v3 = v2; v3 < v1; ++v3) {
                hr.ag[v3] += hr.ag[v3 - v2] * v0.av / 0xF88820B2;
            }
        }

        if(v0.aa.ax[0] > 0 || v0.aa.ax[1] > 0) {
            v0.au.ae();
            v3 = v1 + 1;
            v2 = v0.au.ar(v3);
            float v5_2 = (((float)v2)) / 65536f;
            v4 = v0.aa.ar(0, v5_2);
            v5_1 = v0.aa.ar(1, v5_2);
            if(v1 >= v4 + v5_1) {
                int v7_1 = v1 - v4;
                if(v5_1 > v7_1) {
                    v9 = v2;
                }
                else {
                    v9 = v2;
                    v7_1 = v5_1;
                }

                for(v2 = 0; v2 < v7_1; ++v2) {
                    v10 = v2 + v4;
                    v11 = ((int)((((long)hr.ag[v10])) * (((long)hi.aq)) >> 16));
                    for(v9 = 0; v9 < v4; ++v9) {
                        v11 += ((int)((((long)hr.ag[v10 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                    }

                    for(v9 = 0; v9 < v2; ++v9) {
                        v11 -= ((int)((((long)hr.ag[v2 - 1 - v9])) * (((long)hi.aj[1][v9])) >> 16));
                    }

                    hr.ag[v2] = v11;
                    v9 = v0.au.ar(v3);
                }

                v7_1 = 0x22BBA53B;
                while(true) {
                    v10 = v1 - v4;
                    if(v7_1 > v10) {
                        v7_1 = v10;
                    }

                    while(v2 < v7_1) {
                        v11 = v2 + v4;
                        v12 = ((int)((((long)hr.ag[v11])) * (((long)hi.aq)) >> 16));
                        v9 = 0;
                        while(v9 < v4) {
                            v12 += ((int)((((long)hr.ag[v11 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                            ++v9;
                            v7_1 = v7_1;
                        }

                        v21 = v7_1;
                        v6 = 0;
                        while(v6 < v5_1) {
                            v12 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[v8][v6])) >> 16));
                            ++v6;
                            v8 = 1;
                        }

                        hr.ag[v2] = v12;
                        v9 = v0.au.ar(v3);
                        ++v2;
                        v7_1 = v21;
                        v8 = 1;
                    }

                    v21 = v7_1;
                    if(v2 < v10) {
                        v5_2 = (((float)v9)) / 65536f;
                        v4 = v0.aa.ar(0, v5_2);
                        v5_1 = v0.aa.ar(1, v5_2);
                        v7_1 = v21 + 0x80;
                        v8 = 1;
                        continue;
                    }

                    break;
                }

                while(v2 < v1) {
                    v6 = v2 + v4;
                    v7_1 = v6 - v1;
                    v8 = 0;
                    while(v7_1 < v4) {
                        v8 += ((int)((((long)hr.ag[v6 - 1 - v7_1])) * (((long)hi.aj[0][v7_1])) >> 16));
                        ++v7_1;
                    }

                    for(v6 = 0; v6 < v5_1; ++v6) {
                        v8 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[1][v6])) >> 16));
                    }

                    hr.ag[v2] = v8;
                    v0.au.ar(v3);
                    ++v2;
                }
            }
        }

        for(v8 = 0; v8 < v1; ++v8) {
            if(hr.ag[v8] < -473330480) {
                hr.ag[v8] = 0xFFFF8000;
            }

            if(hr.ag[v8] > 0x7FFF) {
                hr.ag[v8] = 0x246D8AEE;
            }
        }

        return hr.ag;
    }

    final int[] ax(int arg23, int arg24) {
        int v21;
        int v20;
        int v12;
        int v14;
        int v8;
        double v18;
        int v10;
        int v9;
        int v3;
        hr v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        int v4 = 0;
        mg.ab(hr.ag, 0, v1);
        if(v2 < 10) {
            return hr.ag;
        }

        double v5 = (((double)v1)) / ((((double)v2)) + 0);
        v0.ax.ae();
        v0.al.ae();
        double v7 = 32.768;
        if(v0.ae != null) {
            v0.ae.ae();
            v0.ar.ae();
            v2 = ((int)((((double)(v0.ae.an - v0.ae.ar))) * v7 / v5));
            v3 = ((int)((((double)v0.ae.ar)) * v7 / v5));
        }
        else {
            v2 = 0;
            v3 = 0;
        }

        if(v0.an != null) {
            v0.an.ae();
            v0.ap.ae();
            v9 = ((int)((((double)(v0.an.an - v0.an.ar))) * v7 / v5));
            v10 = ((int)((((double)v0.an.ar)) * v7 / v5));
        }
        else {
            v9 = 0;
            v10 = 0;
        }

        int v11 = 0;
        while(v11 < 5) {
            if(v0.aq[v11] == 0) {
                v18 = v5;
            }
            else {
                hr.aw[v11] = v4;
                hr.ao[v11] = ((int)((((double)v0.af[v11])) * v5));
                hr.as[v11] = (v0.aq[v11] << 14) / 100;
                v18 = v5;
                hr.ak[v11] = ((int)((((double)(v0.ax.an - v0.ax.ar))) * v7 * Math.pow(1.005793, ((double)v0.ab[v11])) / v18));
                v7 = 32.768;
                hr.ac[v11] = ((int)((((double)v0.ax.ar)) * v7 / v18));
            }

            ++v11;
            v5 = v18;
            v4 = 0;
        }

        v18 = v5;
        v4 = 0;
        int v5_1 = 0;
        int v6 = 0;
        while(true) {
            v8 = 1;
            if(v4 >= v1) {
                break;
            }

            v11 = v0.ax.ar(v1);
            int v13 = v0.al.ar(v1);
            if(v0.ae != null) {
                v14 = v0.ae.ar(v1);
                v11 += v0.al(v5_1, v0.ar.ar(v1), v0.ae.ap) >> 1;
                v5_1 += (v14 * v2 >> 16) + v3;
            }

            if(v0.an != null) {
                v12 = v0.an.ar(v1);
                v13 = v13 * ((v0.al(v6, v0.ap.ar(v1), v0.an.ap) >> 1) + 0x8000) >> 15;
                v6 += (v12 * v9 >> 16) + v10;
            }

            v8 = 0;
            while(v8 < 5) {
                if(v0.aq[v8] == 0) {
                    goto label_204;
                }
                else {
                    v14 = hr.ao[v8] + v4;
                    if(v14 < v1) {
                        v20 = v2;
                        hr.ag[v14] += v0.al(hr.aw[v8], hr.as[v8] * v13 >> 15, v0.ax.ap);
                        hr.aw[v8] += (hr.ak[v8] * v11 >> 16) + hr.ac[v8];
                    }
                    else {
                    label_204:
                        v20 = v2;
                    }
                }

                ++v8;
                v2 = v20;
            }

            ++v4;
        }

        if(v0.aj != null) {
            v0.aj.ae();
            v0.ad.ae();
            v2 = 0;
            v3 = 1;
            v4 = 0;
            while(v2 < v1) {
                v5_1 = v0.aj.ar(v1);
                v6 = v0.ad.ar(v1);
                v6 = v3 != 0 ? v0.aj.ar + ((v0.aj.an - v0.aj.ar) * v5_1 >> 8) : ((v0.aj.an - v0.aj.ar) * v6 >> 8) + v0.aj.ar;
                v4 += 0x100;
                if(v4 >= v6) {
                    v3 = v3 == 0 ? 1 : 0;
                    v4 = 0;
                }

                if(v3 != 0) {
                    hr.ag[v2] = 0;
                }

                ++v2;
            }
        }

        if(v0.ai > 0 && v0.av > 0) {
            v2 = ((int)((((double)v0.ai)) * v18));
            for(v3 = v2; v3 < v1; ++v3) {
                hr.ag[v3] += hr.ag[v3 - v2] * v0.av / 100;
            }
        }

        if(v0.aa.ax[0] > 0 || v0.aa.ax[1] > 0) {
            v0.au.ae();
            v3 = v1 + 1;
            v2 = v0.au.ar(v3);
            float v5_2 = (((float)v2)) / 65536f;
            v4 = v0.aa.ar(0, v5_2);
            v5_1 = v0.aa.ar(1, v5_2);
            if(v1 >= v4 + v5_1) {
                int v7_1 = v1 - v4;
                if(v5_1 > v7_1) {
                    v9 = v2;
                }
                else {
                    v9 = v2;
                    v7_1 = v5_1;
                }

                for(v2 = 0; v2 < v7_1; ++v2) {
                    v10 = v2 + v4;
                    v11 = ((int)((((long)hr.ag[v10])) * (((long)hi.aq)) >> 16));
                    for(v9 = 0; v9 < v4; ++v9) {
                        v11 += ((int)((((long)hr.ag[v10 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                    }

                    for(v9 = 0; v9 < v2; ++v9) {
                        v11 -= ((int)((((long)hr.ag[v2 - 1 - v9])) * (((long)hi.aj[1][v9])) >> 16));
                    }

                    hr.ag[v2] = v11;
                    v9 = v0.au.ar(v3);
                }

                v7_1 = 0x80;
                while(true) {
                    v10 = v1 - v4;
                    if(v7_1 > v10) {
                        v7_1 = v10;
                    }

                    while(v2 < v7_1) {
                        v11 = v2 + v4;
                        v12 = ((int)((((long)hr.ag[v11])) * (((long)hi.aq)) >> 16));
                        v9 = 0;
                        while(v9 < v4) {
                            v12 += ((int)((((long)hr.ag[v11 - 1 - v9])) * (((long)hi.aj[0][v9])) >> 16));
                            ++v9;
                            v7_1 = v7_1;
                        }

                        v21 = v7_1;
                        v6 = 0;
                        while(v6 < v5_1) {
                            v12 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[v8][v6])) >> 16));
                            ++v6;
                            v8 = 1;
                        }

                        hr.ag[v2] = v12;
                        v9 = v0.au.ar(v3);
                        ++v2;
                        v7_1 = v21;
                        v8 = 1;
                    }

                    v21 = v7_1;
                    if(v2 < v10) {
                        v5_2 = (((float)v9)) / 65536f;
                        v4 = v0.aa.ar(0, v5_2);
                        v5_1 = v0.aa.ar(1, v5_2);
                        v7_1 = v21 + 0x80;
                        v8 = 1;
                        continue;
                    }

                    break;
                }

                while(v2 < v1) {
                    v6 = v2 + v4;
                    v7_1 = v6 - v1;
                    v8 = 0;
                    while(v7_1 < v4) {
                        v8 += ((int)((((long)hr.ag[v6 - 1 - v7_1])) * (((long)hi.aj[0][v7_1])) >> 16));
                        ++v7_1;
                    }

                    for(v6 = 0; v6 < v5_1; ++v6) {
                        v8 -= ((int)((((long)hr.ag[v2 - 1 - v6])) * (((long)hi.aj[1][v6])) >> 16));
                    }

                    hr.ag[v2] = v8;
                    v0.au.ar(v3);
                    ++v2;
                }
            }
        }

        for(v8 = 0; v8 < v1; ++v8) {
            v3 = 0xFFFF8000;
            if(hr.ag[v8] < v3) {
                hr.ag[v8] = v3;
            }

            v3 = 0x7FFF;
            if(hr.ag[v8] > v3) {
                hr.ag[v8] = v3;
            }
        }

        return hr.ag;
    }
}

