import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class gm {
    public static final byte ae = 2;
    static final int al = 7;
    public static final byte ax = -1;
    public static final int bn = 10000;

    gm() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gm.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final int al(long arg16, String arg18, int arg19) {
        InputStream v0_6;
        OutputStreamWriter v3_2;
        String v0_4;
        int v12;
        int v8_1;
        int v2_1;
        lq v1;
        int v15;
        int v13;
        int[] v7;
        int v5;
        long v0 = arg16;
        String v2 = arg18;
        try {
            Random v3 = new Random();
            lq v4 = new lq(0x80);
            lq v6 = new lq(0x80);
            v5 = 4;
            v7 = new int[v5];
            v7[0] = v3.nextInt();
            v7[1] = v3.nextInt();
            byte v8 = 0x20;
            v7[2] = ((int)(v0 >> v8));
            v13 = 3;
            v7[v13] = ((int)v0);
            int v14 = 10;
            v4.ar(v14, 0x75);
            int v11;
            for(v11 = 0; true; ++v11) {
                v15 = 0x79EF67B1;
                if(v11 >= v5) {
                    break;
                }

                v4.aj(v3.nextInt(), v15);
            }

            v4.aj(v7[0], v15);
            v4.aj(v7[1], v15);
            v4.aq(v0);
            v4.aq(0);
            int v0_2;
            for(v0_2 = 0; v0_2 < v5; ++v0_2) {
                v4.aj(v3.nextInt(), v15);
            }

            v4.bc(iv.an, iv.ap, -870051447);
            v6.ar(v14, v8);
            for(v0_2 = 0; v0_2 < v13; ++v0_2) {
                v6.aj(v3.nextInt(), v15);
            }

            v6.aq(v3.nextLong());
            v6.ad(v3.nextLong());
            dk.ii(v6, 0x8A1AAB37);
            v6.aq(v3.nextLong());
            v6.bc(iv.an, iv.ap, 0x6F37CD6B);
            v0_2 = ki.af(v2, 40);
            if(v0_2 % 8 != 0) {
                v0_2 += 8 - v0_2 % 8;
            }

            v1 = new lq(v0_2);
            v1.ai(v2, -5);
            v2_1 = -1880437085;
            v1.ar = v0_2 * v2_1;
            v1.bg(v7, -248793701);
            v8_1 = 0xF24F550B;
            v12 = 5;
            lq v0_3 = new lq(v1.ar * v8_1 + (v4.ar * v8_1 + v12 + v6.ar * v8_1));
            v0_3.ar(2, 38);
            v0_3.ar(v4.ar * v8_1, 35);
            v0_3.au(v4.ae, 0, v4.ar * v8_1, 0xC8E11368);
            v0_3.ar(v6.ar * v8_1, 0x79);
            v0_3.au(v6.ae, 0, v6.ar * v8_1, 1722005666);
            v0_3.an(v1.ar * v8_1, 627880584);
            v0_3.au(v1.ae, 0, v1.ar * v8_1, 0xF350526C);
            v0_4 = cz.ax(v0_3.ae, 0x9C90175B);
            try {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append(il.is("services", false, -308826699));
                v3_1.append("m=accountappeal/login.ws");
                URLConnection v1_1 = new URL(v3_1.toString()).openConnection();
                v1_1.setDoInput(true);
                v1_1.setDoOutput(true);
                v1_1.setConnectTimeout(5000);
                v3_2 = new OutputStreamWriter(v1_1.getOutputStream());
                v3_2.write("data2=" + iq.ax(((CharSequence)v0_4), -38) + "&dest=" + iq.ax("passwordchoice.ws", 1));
                v3_2.flush();
                v0_6 = v1_1.getInputStream();
                int v4_2 = 1000;
                v1 = new lq(new byte[v4_2]);
                do {
                    int v6_1 = v0_6.read(v1.ae, v1.ar * v8_1, 1000 - v1.ar * v8_1);
                    if(v6_1 == -1) {
                        goto label_182;
                    }

                    v1.ar += v6_1 * v2_1;
                    if(v1.ar * v8_1 < v4_2) {
                        continue;
                    }

                    return v12;
                }
                while(true);
            }
            catch(Throwable v0_5) {
                goto label_248;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_252;
        }

        return v12;
        try {
        label_182:
            v3_2.close();
            v0_6.close();
            v0_4 = new String(v1.ae);
            if(v0_4.startsWith("OFFLINE")) {
                return v5;
            }

            if(v0_4.startsWith("WRONG")) {
                return 7;
            }

            if(v0_4.startsWith("RELOAD")) {
                return v13;
            }

            if(v0_4.startsWith("Not permitted for social network accounts.")) {
                return 6;
            }

            v1.bz(v7, 0x135ABFF9);
            while(v1.ar * v8_1 > 0) {
                if(v1.ae[v1.ar * v8_1 - 1] != 0) {
                    break;
                }

                v1.ar -= v2_1;
            }

            v0_4 = new String(v1.ae, 0, v1.ar * v8_1);
            if(bj.ae(v0_4, 2065994386)) {
                client.al.aba(0xFC4FD3B4).ga(-15).ax(v0_4, true, 0x1B69C1E0);
                return 2;
            }

            return v12;
        }
        catch(Throwable v0_5) {
            try {
            label_248:
                v0_5.printStackTrace();
                return v12;
            }
            catch(RuntimeException v0_1) {
            label_252:
                StringBuilder v1_2 = new StringBuilder();
                v1_2.append("gm.al(");
                v1_2.append(')');
                throw lx.al(((Throwable)v0_1), v1_2.toString());
            }
        }
    }

    static final void ek(int arg7, int arg8, int arg9, int arg10) {
        arg10 = 0x6CE0918B;
        int v0 = 1568437803;
        int v1 = 0x80;
        if(arg7 >= v1 && arg8 >= v1) {
            v1 = 0x3300;
            if(arg7 <= v1) {
                if(arg8 > v1) {
                }
                else {
                    v1 = 1101813865;
                    try {
                        v1 = fj.ez(arg7, arg8, kt.jz * v1, 0x7640D11A) - arg9;
                        arg7 -= ag.hc * 0x594485D5;
                        v1 -= bu.hi * 0x92B48CBF;
                        arg8 -= fg.hb * -1102211305;
                        arg9 = bt.ag[fy.hd * 0xAD05ECC3];
                        int v2 = bt.ah[fy.hd * 0xAD05ECC3];
                        int v3 = bt.ag[it.hh * 2069602569];
                        int[] v4 = bt.ah;
                        int v5 = arg7 * v4[it.hh * 2069602569] + arg8 * v3 >> 16;
                        arg7 = v4[it.hh * 2069602569] * arg8 - v3 * arg7 >> 16;
                        arg8 = v1 * v2 - arg7 * arg9 >> 16;
                        arg7 = v1 * arg9 + arg7 * v2 >> 16;
                        if(arg7 >= 50) {
                            client.ih = (client.ql * 0xDCCE0B33 / 2 + client.qy * 0x5F4F90D3 * v5 / arg7) * -1568437803;
                            client.ir = (client.qj * 927018595 / 2 + client.qy * 0x5F4F90D3 * arg8 / arg7) * 0x931F6E75;
                        }
                        else {
                            client.ih = v0;
                            client.ir = arg10;
                        }

                        return;
                    label_92:
                        client.ih = v0;
                        client.ir = arg10;
                        return;
                    }
                    catch(RuntimeException v7) {
                        StringBuilder v8 = new StringBuilder();
                        v8.append("gm.ek(");
                        v8.append(')');
                        throw lx.al(((Throwable)v7), v8.toString());
                    }
                }
            }
        }

        goto label_92;
    }
}

