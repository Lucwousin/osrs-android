import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class gj {
    public static final int ae = 0x40;
    static final int af = 0;
    static final int al = 8;
    static final int ax = 8;
    static final int bk = 500;
    static int ez = 0;
    static final int sb = 500;

    gj() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ag(int arg2) {
        try {
            kf.ax.ah(0x3D33FB02);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("gj.ag(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean ax(int arg17) {
        int v13;
        byte[] v12;
        int v11_1;
        byte v10;
        int v9;
        int v5;
        int v4;
        int v3;
        int v2;
        int v0 = 0x2076E2C1;
        try {
            long v0_2 = ji.ax(v0);
            v2 = ((int)(v0_2 - km.aj * 5677006938123099409L));
            km.aj = v0_2 * 0x645EE94641D33F1L;
            v0 = 200;
            if(v2 > v0) {
                v2 = 200;
            }

            km.ap += v2 * 0xB0A45461;
            v2 = -70103809;
            v3 = 1220765581;
            v4 = 0xF5D8B541;
            v5 = 0xBE0052F5;
            if(km.am * v2 == 0 && km.af * v5 == 0 && km.aa * v4 == 0 && km.aq * v3 == 0) {
                return 1;
            }

            if(km.an != null) {
                goto label_41;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_422;
        }

        return 0;
    label_41:
        int v1 = 1203589025;
        kd v8 = null;
        try {
            if(km.ap * v1 > 30000) {
                goto label_409;
            }

            while(true) {
                v9 = -1189983907;
                v10 = 4;
                if(km.af * v5 < v0 && km.aq * v3 > 0) {
                    mx v1_1 = km.ad.ae();
                    lq v11 = new lq(v10);
                    v11.ar(1, v10);
                    v11.ap(((int)((kd)v1_1).gx), -21);
                    km.an.af(v11.ae, 0, v10);
                    km.ab.al(v1_1, ((kd)v1_1).gx);
                    km.aq -= 0x95843345;
                    km.af += v9;
                    continue;
                }

                break;
            }

            while(true) {
                v3 = 0x4404B2FF;
                if(km.am * v2 < v0 && km.aa * v4 > 0) {
                    mv v1_2 = km.ai.ae();
                    lq v5_1 = new lq(v10);
                    v5_1.ar(0, 92);
                    v5_1.ap(((int)((kd)v1_2).gx), -57);
                    km.an.af(v5_1.ae, 0, v10);
                    ((kd)v1_2).de();
                    km.au.al(((mx)v1_2), ((kd)v1_2).gx);
                    km.aa -= 0xADC6DAC1;
                    km.am += v3;
                    continue;
                }

                break;
            }

            v0 = 0;
            while(true) {
                if(v0 < 100) {
                    v1 = km.an.aj();
                    if(v1 < 0) {
                        break;
                    }
                    else if(v1 == 0) {
                    }
                    else {
                        km.ap = 0;
                        v4 = 0xD81960ED;
                        if(dq.ag == null) {
                            v2 = 8;
                        }
                        else if(km.ay * v4 == 0) {
                            v2 = 1;
                        }
                        else {
                            v2 = 0;
                        }

                        v5 = -1880437085;
                        int v10_1 = 0xF24F550B;
                        if(v2 > 0) {
                            v11_1 = v2 - km.ah.ar * v10_1;
                            if(v11_1 > v1) {
                            }
                            else {
                                v1 = v11_1;
                            }

                            km.an.aq(km.ah.ae, km.ah.ar * v10_1, v1);
                            if(km.ac != 0) {
                                for(v11_1 = 0; v11_1 < v1; ++v11_1) {
                                    v12 = km.ah.ae;
                                    v13 = km.ah.ar * v10_1 + v11_1;
                                    v12[v13] = ((byte)(v12[v13] ^ km.ac));
                                }
                            }

                            km.ah.ar += v1 * v5;
                            if(km.ah.ar * v10_1 < v2) {
                                return 1;
                            }

                            if(dq.ag == null) {
                                km.ah.ar = 0;
                                v1 = km.ah.ay(-67);
                                v2 = km.ah.ao(-175717940);
                                v4 = km.ah.ay(-44);
                                v5 = km.ah.ac(0x70);
                                long v1_3 = ((long)(v2 + (v1 << 16)));
                                mx v10_2 = km.ab.ax(v1_3);
                                hg.az = true;
                                if(v10_2 == null) {
                                    v10_2 = km.au.ax(v1_3);
                                    hg.az = false;
                                }

                                if(v10_2 != null) {
                                    v1 = v4 == 0 ? 5 : 9;
                                    dq.ag = ((kd)v10_2);
                                    hu.at = new lq(v1 + v5 + dq.ag.ae);
                                    hu.at.ar(v4, 58);
                                    hu.at.aj(v5, 0x79EF67B1);
                                    km.ay = 0x407FE728;
                                    km.ah.ar = 0;
                                    goto label_403;
                                }

                                throw new IOException();
                            }

                            if(km.ay * v4 != 0) {
                                goto label_403;
                            }

                            if(km.ah.ae[0] == -1) {
                                km.ay = 0x280FFCE5;
                                km.ah.ar = 0;
                                goto label_403;
                            }

                            dq.ag = v8;
                        }
                        else {
                            v2 = hu.at.ae.length - dq.ag.ae;
                            int v12_1 = 0x200;
                            v11_1 = 0x200 - km.ay * v4;
                            if(v11_1 > v2 - hu.at.ar * v10_1) {
                                v11_1 = v2 - hu.at.ar * v10_1;
                            }

                            if(v11_1 > v1) {
                            }
                            else {
                                v1 = v11_1;
                            }

                            km.an.aq(hu.at.ae, hu.at.ar * v10_1, v1);
                            if(km.ac != 0) {
                                for(v11_1 = 0; v11_1 < v1; ++v11_1) {
                                    byte[] v13_1 = hu.at.ae;
                                    int v14 = hu.at.ar * v10_1 + v11_1;
                                    ((byte[])v13)[v14] = ((byte)(((byte[])v13)[v14] ^ km.ac));
                                }
                            }

                            hu.at.ar += v5 * v1;
                            km.ay += v1 * 0x280FFCE5;
                            if(hu.at.ar * v10_1 == v2) {
                                if(dq.ag.gx == 0xFF00FF) {
                                    ih.as = hu.at;
                                    for(v1 = 0; v1 < 0x100; ++v1) {
                                        ki v2_1 = km.ak[v1];
                                        if(v2_1 != null) {
                                            ih.as.ar = 0x7F567518 * v1 - 0x3069F6D1;
                                            v2_1.da(ih.as.ac(84), ih.as.ac(0x7A), -25);
                                        }
                                    }
                                }
                                else {
                                    km.ao.reset();
                                    km.ao.update(hu.at.ae, 0, v2);
                                    if(dq.ag.al * 0x8FBAED17 != (((int)km.ao.getValue()))) {
                                        try {
                                            km.an.an();
                                            goto label_347;
                                        }
                                        catch(Exception ) {
                                        label_347:
                                            km.bd += 0x9B26A15F;
                                            km.an = ((mz)v8);
                                            km.ac = ((byte)(((int)(Math.random() * 255 + 1))));
                                            return 0;
                                        }
                                    }

                                    km.bd = 0;
                                    km.ba = 0;
                                    ki v10_3 = dq.ag.ax;
                                    v11_1 = ((int)(dq.ag.gx & 0xFFFF));
                                    v12 = hu.at.ae;
                                    boolean v13_2 = 0xFF0000 == (dq.ag.gx & 0xFF0000) ? true : false;
                                    v10_3.dz(v11_1, v12, v13_2, hg.az, 0x635650B6);
                                }

                                dq.ag.lp();
                                if(hg.az) {
                                    km.af -= v9;
                                }
                                else {
                                    km.am -= v3;
                                }

                                km.ay = 0;
                                dq.ag = v8;
                                hu.at = ((lq)v8);
                                goto label_403;
                            }

                            if(km.ay * v4 != v12_1) {
                                return 1;
                            }

                            km.ay = 0;
                        }

                    label_403:
                        ++v0;
                        continue;
                    }
                }

                return 1;
            }

            throw new IOException();
            return 1;
        label_409:
            throw new IOException();
        }
        catch(IOException ) {
            try {
                km.an.an();
                goto label_414;
            }
            catch(Exception ) {
            label_414:
                km.ba += 0x2E50558D;
                km.an = ((mz)v8);
                return 0;
            }
        }

    label_422:
        StringBuilder v1_4 = new StringBuilder();
        v1_4.append("gj.ax(");
        v1_4.append(')');
        throw lx.al(((Throwable)v0_1), v1_4.toString());
    }

    static long ax(int arg9) {
        lq v2_2;
        long v0 = 0;
        try {
            StringBuilder v2 = new StringBuilder();
            v2.append(il.is("services", false, 0x90021D09));
            v2.append("m=accountappeal/login.ws");
            URLConnection v9_1 = new URL(v2.toString()).openConnection();
            v9_1.setRequestProperty("connection", "close");
            v9_1.setDoInput(true);
            v9_1.setDoOutput(true);
            v9_1.setConnectTimeout(5000);
            OutputStreamWriter v2_1 = new OutputStreamWriter(v9_1.getOutputStream());
            v2_1.write("data1=req");
            v2_1.flush();
            InputStream v9_2 = v9_1.getInputStream();
            int v3 = 1000;
            v2_2 = new lq(new byte[v3]);
            do {
                int v7 = 0xF24F550B;
                int v4 = v9_2.read(v2_2.ae, v2_2.ar * v7, 1000 - v2_2.ar * v7);
                if(-1 == v4) {
                    goto label_43;
                }

                v2_2.ar += v4 * -1880437085;
                if(v2_2.ar * v7 < v3) {
                    continue;
                }

                return v0;
            }
            while(true);
        }
        catch(Exception ) {
            return v0;
        }
        catch(RuntimeException v9) {
            goto label_58;
        }

        return v0;
        try {
        label_43:
            v2_2.ar = 0;
            return v2_2.bd(0x36D41114);
        }
        catch(RuntimeException v9) {
        label_58:
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("gj.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v9), v0_1.toString());
        }
        catch(Exception ) {
            return v0;
        }
    }
}

