import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class iv {
    static final int ad = 3;
    static final String ae = "passwordchoice.ws";
    public static final int al = 3;
    static final BigInteger an = null;
    static final BigInteger ap = null;
    static final int ar = 1000;
    static final String ax = "m=accountappeal/login.ws";
    static final int kl = 3;

    static {
        iv.an = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
        iv.ap = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    }

    iv() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("iv.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final int ab(long arg16, String arg18) {
        InputStream v0_5;
        OutputStreamWriter v3_2;
        int v14;
        long v0 = arg16;
        String v2 = arg18;
        Random v3 = new Random();
        lq v4 = new lq(0x25D0845);
        lq v5 = new lq(0x9683F8FE);
        int v6 = 4;
        int[] v7 = new int[v6];
        v7[0] = v3.nextInt();
        v7[1] = v3.nextInt();
        int v11 = 2;
        v7[v11] = ((int)(v0 >> 1720152635));
        int v12 = 3;
        v7[v12] = ((int)v0);
        int v8 = 10;
        v4.ar(v8, 0x2F);
        int v13;
        for(v13 = 0; true; ++v13) {
            v14 = 0x79EF67B1;
            if(v13 >= v6) {
                break;
            }

            v4.aj(v3.nextInt(), v14);
        }

        v4.aj(v7[0], v14);
        v4.aj(v7[1], v14);
        v4.aq(v0);
        v4.aq(0);
        int v0_1;
        for(v0_1 = 0; v0_1 < v6; ++v0_1) {
            v4.aj(v3.nextInt(), v14);
        }

        v4.bc(iv.an, iv.ap, 0x4D3667F5);
        v5.ar(v8, 90);
        for(v0_1 = 0; v0_1 < v12; ++v0_1) {
            v5.aj(v3.nextInt(), v14);
        }

        v5.aq(v3.nextLong());
        v5.ad(v3.nextLong());
        dk.ii(v5, 0x33FFBD2B);
        v5.aq(v3.nextLong());
        v5.bc(iv.an, iv.ap, 0x45155F00);
        v0_1 = ki.af(v2, 18);
        int v1 = v0_1 % 8;
        if(v1 != 0) {
            v0_1 += 8 - v1;
        }

        lq v1_1 = new lq(v0_1);
        v1_1.ai(v2, -102);
        int v2_1 = -1880437085;
        v1_1.ar = v0_1 * v2_1;
        v1_1.bg(v7, 0xEE8A55D3);
        v8 = 0xF24F550B;
        lq v0_2 = new lq(v1_1.ar * v8 + (v4.ar * 0x38EB4614 + 5 + v5.ar * 0x90FCDEA4));
        v0_2.ar(v11, 26);
        v0_2.ar(v4.ar * v8, 83);
        v0_2.au(v4.ae, 0, v4.ar * 0xB6C914EC, 0xB9341B39);
        v0_2.ar(v5.ar * 0x6E3D72F2, 54);
        v0_2.au(v5.ae, 0, v5.ar * v8, 0x2BAFFD92);
        v0_2.an(v1_1.ar * 1030058771, 0x4C5EBFE4);
        v0_2.au(v1_1.ae, 0, v1_1.ar * 0x939E5F7A, 0xFB1672FE);
        String v0_3 = cz.ax(v0_2.ae, 0x9C90175B);
        try {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append(il.is("services", false, -1823649109));
            v3_1.append("m=accountappeal/login.ws");
            URLConnection v1_2 = new URL(v3_1.toString()).openConnection();
            v1_2.setDoInput(true);
            v1_2.setDoOutput(true);
            v1_2.setConnectTimeout(5000);
            v3_2 = new OutputStreamWriter(v1_2.getOutputStream());
            v3_2.write("data2=" + iq.ax(((CharSequence)v0_3), -73) + "&dest=" + iq.ax("passwordchoice.ws", -57));
            v3_2.flush();
            v0_5 = v1_2.getInputStream();
            v1_1 = new lq(new byte[0xE0E388CC]);
            do {
                int v4_2 = v0_5.read(v1_1.ae, v1_1.ar * v8, 0x167556CB - v1_1.ar * v8);
                if(v4_2 == -1) {
                    goto label_189;
                }

                v1_1.ar += v4_2 * v2_1;
                if(v1_1.ar * v8 < 0x748E6787) {
                    continue;
                }

                return 5;
            }
            while(true);
        }
        catch(Throwable v0_4) {
            goto label_257;
        }

        return 5;
        try {
        label_189:
            v3_2.close();
            v0_5.close();
            v0_3 = new String(v1_1.ae);
            if(v0_3.startsWith("OFFLINE")) {
                return v6;
            }

            if(v0_3.startsWith("WRONG")) {
                return 7;
            }

            if(v0_3.startsWith("RELOAD")) {
                return v12;
            }

            if(v0_3.startsWith("Not permitted for social network accounts.")) {
                return 6;
            }

            v1_1.bz(v7, -1310509280);
            while(v1_1.ar * v8 > 0) {
                if(v1_1.ae[v1_1.ar * v8 - 1] != 0) {
                    break;
                }

                v1_1.ar -= v2_1;
            }

            v0_3 = new String(v1_1.ae, 0, v1_1.ar * 0xC6E61B40);
            if(bj.ae(v0_3, 0x544BBB6E)) {
                client.al.aba(0x2270B8F8).ga(-85).ax(v0_3, true, 907380845);
                return v11;
            }

            return 5;
        }
        catch(Throwable v0_4) {
        label_257:
            v0_4.printStackTrace();
            return 5;
        }
    }

    static final int ad(long arg16, String arg18) {
        InputStream v0_5;
        OutputStreamWriter v3_2;
        int v14;
        long v0 = arg16;
        String v2 = arg18;
        Random v3 = new Random();
        lq v4 = new lq(0x226FF25C);
        lq v5 = new lq(0x80);
        int v6 = 4;
        int[] v7 = new int[v6];
        v7[0] = v3.nextInt();
        v7[1] = v3.nextInt();
        int v11 = 2;
        v7[v11] = ((int)(v0 >> 0x63186393));
        int v12 = 3;
        v7[v12] = ((int)v0);
        int v8 = 10;
        v4.ar(v8, 39);
        int v13;
        for(v13 = 0; true; ++v13) {
            v14 = 0x79EF67B1;
            if(v13 >= v6) {
                break;
            }

            v4.aj(v3.nextInt(), v14);
        }

        v4.aj(v7[0], v14);
        v4.aj(v7[1], v14);
        v4.aq(v0);
        v4.aq(0);
        int v0_1;
        for(v0_1 = 0; v0_1 < v6; ++v0_1) {
            v4.aj(v3.nextInt(), v14);
        }

        v4.bc(iv.an, iv.ap, -308039040);
        v5.ar(v8, 53);
        for(v0_1 = 0; v0_1 < v12; ++v0_1) {
            v5.aj(v3.nextInt(), v14);
        }

        v5.aq(v3.nextLong());
        v5.ad(v3.nextLong());
        dk.ii(v5, -362053985);
        v5.aq(v3.nextLong());
        v5.bc(iv.an, iv.ap, 0x4A16022B);
        v0_1 = ki.af(v2, 98);
        int v1 = v0_1 % 8;
        if(v1 != 0) {
            v0_1 += 8 - v1;
        }

        lq v1_1 = new lq(v0_1);
        v1_1.ai(v2, -7);
        int v2_1 = -1880437085;
        v1_1.ar = v0_1 * v2_1;
        v1_1.bg(v7, -122497300);
        v13 = 0xF24F550B;
        lq v0_2 = new lq(v1_1.ar * -1092085096 + (v4.ar * v13 + 5 + v5.ar * 627868120));
        v0_2.ar(v11, 104);
        v0_2.ar(v4.ar * 0xFC424139, 20);
        v0_2.au(v4.ae, 0, v4.ar * v13, 154540922);
        v0_2.ar(v5.ar * v13, 86);
        v0_2.au(v5.ae, 0, v5.ar * 0x1FB056AA, 496141390);
        v0_2.an(v1_1.ar * v13, 1971704343);
        v0_2.au(v1_1.ae, 0, v1_1.ar * v13, 0x2F9F2950);
        String v0_3 = cz.ax(v0_2.ae, 0x9C90175B);
        try {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append(il.is("services", false, -2114406120));
            v3_1.append("m=accountappeal/login.ws");
            URLConnection v1_2 = new URL(v3_1.toString()).openConnection();
            v1_2.setDoInput(true);
            v1_2.setDoOutput(true);
            v1_2.setConnectTimeout(5000);
            v3_2 = new OutputStreamWriter(v1_2.getOutputStream());
            v3_2.write("data2=" + iq.ax(((CharSequence)v0_3), -115) + "&dest=" + iq.ax("passwordchoice.ws", -28));
            v3_2.flush();
            v0_5 = v1_2.getInputStream();
            v1_1 = new lq(new byte[1000]);
            do {
                int v5_1 = v0_5.read(v1_1.ae, v1_1.ar * v13, 1000 - v1_1.ar * 0x7EA7BA1B);
                if(v5_1 == -1) {
                    goto label_187;
                }

                v1_1.ar += v5_1 * 0xE349E27B;
                if(v1_1.ar * 0xA767FDDB < 0xF3444743) {
                    continue;
                }

                return 5;
            }
            while(true);
        }
        catch(Throwable v0_4) {
            goto label_257;
        }

        return 5;
        try {
        label_187:
            v3_2.close();
            v0_5.close();
            v0_3 = new String(v1_1.ae);
            if(v0_3.startsWith("OFFLINE")) {
                return v6;
            }

            if(v0_3.startsWith("WRONG")) {
                return 7;
            }

            if(v0_3.startsWith("RELOAD")) {
                return v12;
            }

            if(v0_3.startsWith("Not permitted for social network accounts.")) {
                return 6;
            }

            v1_1.bz(v7, 0xE089863F);
            while(v1_1.ar * v13 > 0) {
                if(v1_1.ae[v1_1.ar * 0x2E73779C - 1] != 0) {
                    break;
                }

                v1_1.ar -= v2_1;
            }

            v0_3 = new String(v1_1.ae, 0, v1_1.ar * v13);
            if(bj.ae(v0_3, 1423203354)) {
                client.al.aba(-1999018423).ga(-10).ax(v0_3, true, 0x28643367);
                return v11;
            }

            return 5;
        }
        catch(Throwable v0_4) {
        label_257:
            v0_4.printStackTrace();
            return 5;
        }
    }

    static boolean af(String arg2) {
        if(arg2 == null) {
            return 0;
        }

        try {
            new URL(arg2);
            return 1;
        }
        catch(MalformedURLException ) {
            return 0;
        }
    }

    static boolean ai(String arg2) {
        if(arg2 == null) {
            return 0;
        }

        try {
            new URL(arg2);
            return 1;
        }
        catch(MalformedURLException ) {
            return 0;
        }
    }

    static final int aj(long arg13, String arg15) {
        InputStream v13_4;
        OutputStreamWriter v0_2;
        int v11;
        Random v0 = new Random();
        lq v1 = new lq(0x80);
        lq v3 = new lq(0x80);
        int v2 = 4;
        int[] v4 = new int[v2];
        v4[0] = v0.nextInt();
        v4[1] = v0.nextInt();
        int v8 = 2;
        v4[v8] = ((int)(arg13 >> 0x20));
        int v9 = 3;
        v4[v9] = ((int)arg13);
        int v5 = 10;
        v1.ar(v5, 56);
        int v10;
        for(v10 = 0; true; ++v10) {
            v11 = 0x79EF67B1;
            if(v10 >= v2) {
                break;
            }

            v1.aj(v0.nextInt(), v11);
        }

        v1.aj(v4[0], v11);
        v1.aj(v4[1], v11);
        v1.aq(arg13);
        v1.aq(0);
        int v13;
        for(v13 = 0; v13 < v2; ++v13) {
            v1.aj(v0.nextInt(), v11);
        }

        v1.bc(iv.an, iv.ap, 0x7F1CA3F9);
        v3.ar(v5, 27);
        for(v13 = 0; v13 < v9; ++v13) {
            v3.aj(v0.nextInt(), v11);
        }

        v3.aq(v0.nextLong());
        v3.ad(v0.nextLong());
        dk.ii(v3, -1256109820);
        v3.aq(v0.nextLong());
        v3.bc(iv.an, iv.ap, 0x109D7858);
        v13 = ki.af(arg15, 38);
        int v14 = v13 % 8;
        if(v14 != 0) {
            v13 += 8 - v14;
        }

        lq v14_1 = new lq(v13);
        v14_1.ai(arg15, -81);
        int v15 = -1880437085;
        v14_1.ar = v13 * v15;
        v14_1.bg(v4, 0xDF17903F);
        v5 = 0xF24F550B;
        v11 = 5;
        lq v13_1 = new lq(v14_1.ar * v5 + (v1.ar * v5 + v11 + v3.ar * v5));
        v13_1.ar(v8, 108);
        v13_1.ar(v1.ar * v5, 107);
        v13_1.au(v1.ae, 0, v1.ar * v5, 0xB1FEE66);
        v13_1.ar(v3.ar * v5, 21);
        v13_1.au(v3.ae, 0, v3.ar * v5, 0x25FB367A);
        v13_1.an(v14_1.ar * v5, -1312093030);
        v13_1.au(v14_1.ae, 0, v14_1.ar * v5, 0x81E29A4A);
        String v13_2 = cz.ax(v13_1.ae, 0x9C90175B);
        try {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append(il.is("services", false, -475257907));
            v0_1.append("m=accountappeal/login.ws");
            URLConnection v14_2 = new URL(v0_1.toString()).openConnection();
            v14_2.setDoInput(true);
            v14_2.setDoOutput(true);
            v14_2.setConnectTimeout(5000);
            v0_2 = new OutputStreamWriter(v14_2.getOutputStream());
            v0_2.write("data2=" + iq.ax(((CharSequence)v13_2), -19) + "&dest=" + iq.ax("passwordchoice.ws", -9));
            v0_2.flush();
            v13_4 = v14_2.getInputStream();
            int v1_2 = 1000;
            v14_1 = new lq(new byte[v1_2]);
            do {
                int v3_1 = v13_4.read(v14_1.ae, v14_1.ar * v5, 1000 - v14_1.ar * v5);
                if(v3_1 == -1) {
                    goto label_179;
                }

                v14_1.ar += v3_1 * v15;
                if(v14_1.ar * v5 < v1_2) {
                    continue;
                }

                return v11;
            }
            while(true);
        }
        catch(Throwable v13_3) {
            goto label_243;
        }

        return v11;
        try {
        label_179:
            v0_2.close();
            v13_4.close();
            v13_2 = new String(v14_1.ae);
            if(v13_2.startsWith("OFFLINE")) {
                return v2;
            }

            if(v13_2.startsWith("WRONG")) {
                return 7;
            }

            if(v13_2.startsWith("RELOAD")) {
                return v9;
            }

            if(v13_2.startsWith("Not permitted for social network accounts.")) {
                return 6;
            }

            v14_1.bz(v4, 0xF07E0711);
            while(v14_1.ar * v5 > 0) {
                if(v14_1.ae[v14_1.ar * v5 - 1] != 0) {
                    break;
                }

                v14_1.ar -= v15;
            }

            v13_2 = new String(v14_1.ae, 0, v14_1.ar * v5);
            if(bj.ae(v13_2, 1151494701)) {
                client.al.aba(0x40A5ABC4).ga(-51).ax(v13_2, true, 0x56174308);
                return v8;
            }

            return v11;
        }
        catch(Throwable v13_3) {
        label_243:
            v13_3.printStackTrace();
            return v11;
        }
    }

    static String am(char arg1, int arg2, byte arg3) {
        try {
            char[] v3 = new char[arg2];
            int v0;
            for(v0 = 0; v0 < arg2; ++v0) {
                v3[v0] = arg1;
            }

            return new String(v3);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("iv.am(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static long an() {
        lq v3_2;
        long v0 = 0;
        try {
            StringBuilder v3 = new StringBuilder();
            v3.append(il.is("services", false, -111401898));
            v3.append("m=accountappeal/login.ws");
            URLConnection v2 = new URL(v3.toString()).openConnection();
            v2.setRequestProperty("connection", "close");
            v2.setDoInput(true);
            v2.setDoOutput(true);
            v2.setConnectTimeout(5000);
            OutputStreamWriter v3_1 = new OutputStreamWriter(v2.getOutputStream());
            v3_1.write("data1=req");
            v3_1.flush();
            InputStream v2_1 = v2.getInputStream();
            int v4 = 1000;
            v3_2 = new lq(new byte[v4]);
            do {
                int v8 = 0xF24F550B;
                int v5 = v2_1.read(v3_2.ae, v3_2.ar * v8, 1000 - v3_2.ar * v8);
                if(-1 == v5) {
                    goto label_43;
                }

                v3_2.ar += v5 * -1880437085;
                if(v3_2.ar * v8 < v4) {
                    continue;
                }

                return v0;
            }
            while(true);
        }
        catch(Exception ) {
            return v0;
        }

        return v0;
        try {
        label_43:
            v3_2.ar = 0;
            return v3_2.bd(831106509);
        }
        catch(Exception ) {
            return v0;
        }
    }

    static long ap() {
        lq v3_2;
        long v0 = 0;
        try {
            StringBuilder v3 = new StringBuilder();
            v3.append(il.is("services", false, 0xE9DEC2FE));
            v3.append("m=accountappeal/login.ws");
            URLConnection v2 = new URL(v3.toString()).openConnection();
            v2.setRequestProperty("connection", "close");
            v2.setDoInput(true);
            v2.setDoOutput(true);
            v2.setConnectTimeout(2005159127);
            OutputStreamWriter v3_1 = new OutputStreamWriter(v2.getOutputStream());
            v3_1.write("data1=req");
            v3_1.flush();
            InputStream v2_1 = v2.getInputStream();
            v3_2 = new lq(new byte[-110854980]);
            do {
                int v4 = v2_1.read(v3_2.ae, v3_2.ar * 0x762D6884, 0xDFFE6DF1 - v3_2.ar * -2083720108);
                if(-1 == v4) {
                    goto label_45;
                }

                v3_2.ar += v4 * 0x92590F7E;
                if(v3_2.ar * 0x6F22BEE7 < 1000) {
                    continue;
                }

                return v0;
            }
            while(true);
        }
        catch(Exception ) {
            return v0;
        }

        return v0;
        try {
        label_45:
            v3_2.ar = 0;
            return v3_2.bd(0x70CB592D);
        }
        catch(Exception ) {
            return v0;
        }
    }

    static final int aq(long arg13, String arg15) {
        InputStream v13_4;
        OutputStreamWriter v0_2;
        int v11;
        Random v0 = new Random();
        lq v1 = new lq(0x80);
        lq v3 = new lq(0x80);
        int v2 = 4;
        int[] v4 = new int[v2];
        v4[0] = v0.nextInt();
        v4[1] = v0.nextInt();
        int v8 = 2;
        v4[v8] = ((int)(arg13 >> 0x20));
        int v9 = 3;
        v4[v9] = ((int)arg13);
        int v5 = 10;
        v1.ar(v5, 106);
        int v10;
        for(v10 = 0; true; ++v10) {
            v11 = 0x79EF67B1;
            if(v10 >= v2) {
                break;
            }

            v1.aj(v0.nextInt(), v11);
        }

        v1.aj(v4[0], v11);
        v1.aj(v4[1], v11);
        v1.aq(arg13);
        v1.aq(0);
        int v13;
        for(v13 = 0; v13 < v2; ++v13) {
            v1.aj(v0.nextInt(), v11);
        }

        v1.bc(iv.an, iv.ap, 0xF587A05E);
        v3.ar(v5, 16);
        for(v13 = 0; v13 < v9; ++v13) {
            v3.aj(v0.nextInt(), v11);
        }

        v3.aq(v0.nextLong());
        v3.ad(v0.nextLong());
        dk.ii(v3, 0xDB323918);
        v3.aq(v0.nextLong());
        v3.bc(iv.an, iv.ap, 2007938667);
        v13 = ki.af(arg15, 43);
        int v14 = v13 % 8;
        if(v14 != 0) {
            v13 += 8 - v14;
        }

        lq v14_1 = new lq(v13);
        v14_1.ai(arg15, -7);
        int v15 = -1880437085;
        v14_1.ar = v13 * v15;
        v14_1.bg(v4, -1506397819);
        v5 = 0xF24F550B;
        v11 = 5;
        lq v13_1 = new lq(v14_1.ar * v5 + (v1.ar * v5 + v11 + v3.ar * v5));
        v13_1.ar(v8, 56);
        v13_1.ar(v1.ar * v5, 0x71);
        v13_1.au(v1.ae, 0, v1.ar * v5, 0xBC72D799);
        v13_1.ar(v3.ar * v5, 0x74);
        v13_1.au(v3.ae, 0, v3.ar * v5, -348620189);
        v13_1.an(v14_1.ar * v5, 0xE682224F);
        v13_1.au(v14_1.ae, 0, v14_1.ar * v5, -341929092);
        String v13_2 = cz.ax(v13_1.ae, 0x9C90175B);
        try {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append(il.is("services", false, 0x9F279E87));
            v0_1.append("m=accountappeal/login.ws");
            URLConnection v14_2 = new URL(v0_1.toString()).openConnection();
            v14_2.setDoInput(true);
            v14_2.setDoOutput(true);
            v14_2.setConnectTimeout(5000);
            v0_2 = new OutputStreamWriter(v14_2.getOutputStream());
            v0_2.write("data2=" + iq.ax(((CharSequence)v13_2), -84) + "&dest=" + iq.ax("passwordchoice.ws", -48));
            v0_2.flush();
            v13_4 = v14_2.getInputStream();
            int v1_2 = 1000;
            v14_1 = new lq(new byte[v1_2]);
            do {
                int v3_1 = v13_4.read(v14_1.ae, v14_1.ar * v5, 1000 - v14_1.ar * v5);
                if(v3_1 == -1) {
                    goto label_179;
                }

                v14_1.ar += v3_1 * v15;
                if(v14_1.ar * v5 < v1_2) {
                    continue;
                }

                return v11;
            }
            while(true);
        }
        catch(Throwable v13_3) {
            goto label_243;
        }

        return v11;
        try {
        label_179:
            v0_2.close();
            v13_4.close();
            v13_2 = new String(v14_1.ae);
            if(v13_2.startsWith("OFFLINE")) {
                return v2;
            }

            if(v13_2.startsWith("WRONG")) {
                return 7;
            }

            if(v13_2.startsWith("RELOAD")) {
                return v9;
            }

            if(v13_2.startsWith("Not permitted for social network accounts.")) {
                return 6;
            }

            v14_1.bz(v4, 0xAEB16AD);
            while(v14_1.ar * v5 > 0) {
                if(v14_1.ae[v14_1.ar * v5 - 1] != 0) {
                    break;
                }

                v14_1.ar -= v15;
            }

            v13_2 = new String(v14_1.ae, 0, v14_1.ar * v5);
            if(bj.ae(v13_2, 957790497)) {
                client.al.aba(-1114070730).ga(61).ax(v13_2, true, 153052310);
                return v8;
            }

            return v11;
        }
        catch(Throwable v13_3) {
        label_243:
            v13_3.printStackTrace();
            return v11;
        }
    }

    static long ar() {
        lq v3_2;
        long v0 = 0;
        try {
            StringBuilder v3 = new StringBuilder();
            v3.append(il.is("services", false, 0xABB02413));
            v3.append("m=accountappeal/login.ws");
            URLConnection v2 = new URL(v3.toString()).openConnection();
            v2.setRequestProperty("connection", "close");
            v2.setDoInput(true);
            v2.setDoOutput(true);
            v2.setConnectTimeout(5000);
            OutputStreamWriter v3_1 = new OutputStreamWriter(v2.getOutputStream());
            v3_1.write("data1=req");
            v3_1.flush();
            InputStream v2_1 = v2.getInputStream();
            int v4 = 1000;
            v3_2 = new lq(new byte[v4]);
            do {
                int v8 = 0xF24F550B;
                int v5 = v2_1.read(v3_2.ae, v3_2.ar * v8, 1000 - v3_2.ar * v8);
                if(-1 == v5) {
                    goto label_43;
                }

                v3_2.ar += v5 * -1880437085;
                if(v3_2.ar * v8 < v4) {
                    continue;
                }

                return v0;
            }
            while(true);
        }
        catch(Exception ) {
            return v0;
        }

        return v0;
        try {
        label_43:
            v3_2.ar = 0;
            return v3_2.bd(220440726);
        }
        catch(Exception ) {
            return v0;
        }
    }

    static boolean av(String arg2) {
        if(arg2 == null) {
            return 0;
        }

        try {
            new URL(arg2);
            return 1;
        }
        catch(MalformedURLException ) {
            return 0;
        }
    }

    static int ax(int arg2) {
        try {
            arg2 = ic.ar - 0x6EA9A347;
            ic.ar = arg2;
            return arg2 * -947590775 - 1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iv.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

