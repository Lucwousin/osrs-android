import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class mm {
    static int aa = 0;
    static op ab = null;
    static final String ad = "main_file_cache.idx255";
    public static op af = null;
    public static op ai = null;
    static final String aj = "main_file_cache.idx";
    public static final int ak = 27;
    static final int al = 0x100000;
    static final String ap = "main_file_cache.dat2";
    public static op[] av = null;
    static final int ax = 0x3E800000;
    public static File az;

    static {
    }

    mm() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mm.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static og aa(String arg8, String arg9, boolean arg10) {
        File v1 = lu.ar;
        StringBuilder v2 = new StringBuilder();
        v2.append("preferences");
        v2.append(arg8);
        v2.append(".dat");
        File v0 = new File(v1, v2.toString());
        long v2_1 = 10000;
        if(!v0.exists()) {
            goto label_18;
        }

        try {
            return new og(v0, "rw", v2_1);
        }
        catch(IOException ) {
        label_18:
            String v1_1 = "";
            int v6 = 0x9DBD52F3;
            if(0xC06476F2 == mm.aa * v6) {
                v1_1 = "_rc";
            }
            else if(840793093 == mm.aa * v6) {
                v1_1 = "_wip";
            }

            File v5 = mm.az;
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("jagex_");
            v6_1.append(arg9);
            v6_1.append("_preferences");
            v6_1.append(arg8);
            v6_1.append(v1_1);
            v6_1.append(".dat");
            File v4 = new File(v5, v6_1.toString());
            if(!arg10 && (v4.exists())) {
                try {
                    return new og(v4, "rw", v2_1);
                }
                catch(IOException ) {
                    try {
                    label_53:
                        return new og(v0, "rw", v2_1);
                    }
                    catch(IOException ) {
                        throw new RuntimeException();
                    }
                }
            }

            goto label_53;
        }
    }

    public static void ab(ln arg4, String arg5, String arg6, int arg7, int arg8) throws IOException {
        et.an = arg8 * 0x75989855;
        mm.aa = 0x6C0F163B * arg7;
        mm.az = arg4.fi(0xF7197827);
        lu.ar = arg4.fc(arg5, arg6, arg7, 0xB800356C);
        try {
            id.am = System.getProperty("os.name");
        }
        catch(Exception ) {
            id.am = "Unknown";
        }

        dp.au = id.am.toLowerCase();
        fg.ax(lu.ar, 1);
        md.ae(arg4.fo(arg7, -1100082908), 0xAD076923);
        mm.af = new op(new og(in.al("main_file_cache.dat2", 0x305DD7EB), "rw", 0x3E800000), 5200, 0);
        long v0 = 0x100000;
        mm.ai = new op(new og(in.al("main_file_cache.idx255", 0x432EEFBD), "rw", v0), 0x65A9BAF0, 0);
        mm.av = new op[et.an * 0xD32FA4FD];
        int v4;
        for(v4 = 0; v4 < et.an * 0x25D8EE1B; ++v4) {
            op[] v5 = mm.av;
            StringBuilder v2 = new StringBuilder();
            v2.append("main_file_cache.idx");
            v2.append(v4);
            v5[v4] = new op(new og(in.al(v2.toString(), -1970107291), "rw", v0), 6000, 0);
        }
    }

    public static void ac() {
        try {
            mm.af.ax(0x212A6F0F);
            int v0;
            for(v0 = 0; v0 < et.an * 0x3A416EBF; ++v0) {
                mm.av[v0].ax(0xFB022CA);
            }

            mm.ai.ax(675170155);
            mm.ab.ax(1903703674);
            mm.af = null;
            mm.av = null;
            mm.ai = null;
            mm.ab = null;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public static void ad(ln arg6, String arg7, String arg8, int arg9, int arg10) throws IOException {
        et.an = arg10 * 0x75989855;
        mm.aa = 0x6C0F163B * arg9;
        mm.az = arg6.fi(0xD20F074);
        lu.ar = arg6.fc(arg7, arg8, arg9, -1505875597);
        try {
            id.am = System.getProperty("os.name");
        }
        catch(Exception ) {
            id.am = "Unknown";
        }

        dp.au = id.am.toLowerCase();
        fg.ax(lu.ar, 1);
        md.ae(arg6.fo(arg9, -1100082908), 0xAD076923);
        mm.af = new op(new og(in.al("main_file_cache.dat2", 0x2CF57536), "rw", 0x3E800000), 5200, 0);
        long v0 = 0x100000;
        int v8 = 6000;
        mm.ai = new op(new og(in.al("main_file_cache.idx255", 1500255703), "rw", v0), v8, 0);
        int v7 = 0xD32FA4FD;
        mm.av = new op[et.an * v7];
        int v6;
        for(v6 = 0; v6 < et.an * v7; ++v6) {
            op[] v10 = mm.av;
            StringBuilder v4 = new StringBuilder();
            v4.append("main_file_cache.idx");
            v4.append(v6);
            v10[v6] = new op(new og(in.al(v4.toString(), 0x6A5F84FC), "rw", v0), v8, 0);
        }
    }

    public static og af(String arg8, String arg9, boolean arg10) {
        File v1 = lu.ar;
        StringBuilder v2 = new StringBuilder();
        v2.append("preferences");
        v2.append(arg8);
        v2.append(".dat");
        File v0 = new File(v1, v2.toString());
        long v2_1 = 10000;
        if(!v0.exists()) {
            goto label_18;
        }

        try {
            return new og(v0, "rw", v2_1);
        }
        catch(IOException ) {
        label_18:
            String v1_1 = "";
            if(33 == mm.aa * 0xA9B0E268) {
                v1_1 = "_rc";
            }
            else if(34 == mm.aa * 0x7F41C738) {
                v1_1 = "_wip";
            }

            File v5 = mm.az;
            StringBuilder v6 = new StringBuilder();
            v6.append("jagex_");
            v6.append(arg9);
            v6.append("_preferences");
            v6.append(arg8);
            v6.append(v1_1);
            v6.append(".dat");
            File v4 = new File(v5, v6.toString());
            if(!arg10 && (v4.exists())) {
                try {
                    return new og(v4, "rw", v2_1);
                }
                catch(IOException ) {
                    try {
                    label_54:
                        return new og(v0, "rw", v2_1);
                    }
                    catch(IOException ) {
                        throw new RuntimeException();
                    }
                }
            }

            goto label_54;
        }
    }

    static void ag(File arg8) {
        try {
            int v2 = 24;
            long v3 = 25;
            if(arg8.exists()) {
                mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
                return;
            }

            RandomAccessFile v0 = new RandomAccessFile(arg8, "rw");
            int v5 = v0.read();
            v0.seek(0);
            v0.write(v5);
            v0.seek(0);
            v0.close();
            mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    public static byte[] ah() {
        int v0 = 24;
        byte[] v1 = new byte[v0];
        int v2 = 0;
        try {
            mm.ab.al(0);
            mm.ab.ar(v1, 0x39B42EFD);
            int v3 = 0;
            while(v3 < v0) {
                if(v1[v3] != 0) {
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }

            if(v3 < v0) {
                return v1;
            }

            throw new IOException();
        }
        catch(Exception ) {
            while(v2 < v0) {
                v1[v2] = -1;
                ++v2;
            }
        }

        return v1;
    }

    public static og ai(String arg8, String arg9, boolean arg10) {
        File v1 = lu.ar;
        StringBuilder v2 = new StringBuilder();
        v2.append("preferences");
        v2.append(arg8);
        v2.append(".dat");
        File v0 = new File(v1, v2.toString());
        long v2_1 = 10000;
        if(!v0.exists()) {
            goto label_18;
        }

        try {
            return new og(v0, "rw", v2_1);
        }
        catch(IOException ) {
        label_18:
            String v1_1 = "";
            int v6 = 0x9DBD52F3;
            if(33 == mm.aa * v6) {
                v1_1 = "_rc";
            }
            else if(34 == mm.aa * v6) {
                v1_1 = "_wip";
            }

            File v5 = mm.az;
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("jagex_");
            v6_1.append(arg9);
            v6_1.append("_preferences");
            v6_1.append(arg8);
            v6_1.append(v1_1);
            v6_1.append(".dat");
            File v4 = new File(v5, v6_1.toString());
            if(!arg10 && (v4.exists())) {
                try {
                    return new og(v4, "rw", v2_1);
                }
                catch(IOException ) {
                    try {
                    label_53:
                        return new og(v0, "rw", v2_1);
                    }
                    catch(IOException ) {
                        throw new RuntimeException();
                    }
                }
            }

            goto label_53;
        }
    }

    public static void aj(ln arg6, String arg7, String arg8, int arg9, int arg10) throws IOException {
        et.an = arg10 * 0x75989855;
        mm.aa = 0x6C0F163B * arg9;
        mm.az = arg6.fi(0x8D45A9B);
        lu.ar = arg6.fc(arg7, arg8, arg9, 0xACAE9DF9);
        try {
            id.am = System.getProperty("os.name");
        }
        catch(Exception ) {
            id.am = "Unknown";
        }

        dp.au = id.am.toLowerCase();
        fg.ax(lu.ar, 1);
        md.ae(arg6.fo(arg9, -1100082908), 0xAD076923);
        mm.af = new op(new og(in.al("main_file_cache.dat2", 0x4714FDC1), "rw", 0x3E800000), 5200, 0);
        long v0 = 0x100000;
        int v8 = 6000;
        mm.ai = new op(new og(in.al("main_file_cache.idx255", 0xFBE42CA), "rw", v0), v8, 0);
        int v7 = 0xD32FA4FD;
        mm.av = new op[et.an * v7];
        int v6;
        for(v6 = 0; v6 < et.an * v7; ++v6) {
            op[] v10 = mm.av;
            StringBuilder v4 = new StringBuilder();
            v4.append("main_file_cache.idx");
            v4.append(v6);
            v10[v6] = new op(new og(in.al(v4.toString(), 2059741807), "rw", v0), v8, 0);
        }
    }

    public static void ak() {
        try {
            mm.af.ax(0x4B8C3067);
            int v0;
            for(v0 = 0; v0 < et.an * 0xCB0F1687; ++v0) {
                mm.av[v0].ax(0x2A075149);
            }

            mm.ai.ax(656944011);
            mm.ab.ax(652063500);
            mm.af = null;
            mm.av = null;
            mm.ai = null;
            mm.ab = null;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    static void am(File arg8) {
        try {
            int v2 = 24;
            long v3 = 25;
            if(arg8.exists()) {
                mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
                return;
            }

            RandomAccessFile v0 = new RandomAccessFile(arg8, "rw");
            int v5 = v0.read();
            v0.seek(0);
            v0.write(v5);
            v0.seek(0);
            v0.close();
            mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    public static void ao(lq arg3, int arg4) {
        if(mm.ab != null) {
            try {
                mm.ab.al(0);
                mm.ab.aj(arg3.ae, arg4, 24, 0xB984CE18);
                return;
            }
            catch(Exception ) {
                return;
            }
        }
    }

    static boolean ap(lo arg9, int arg10, int arg11) {
        int v6;
        int v5;
        int v4;
        int v9_1;
        int v3;
        arg11 = -1045675246;
        int v0 = 2;
        try {
            arg11 = arg9.jo(v0, arg11);
            if(arg11 == 0) {
                if(arg9.jo(1, 0xC90245C2) != 0) {
                    mm.ap(arg9, arg10, 0x2320DC55);
                }

                v0 = 13;
                arg11 = arg9.jo(v0, 0x9363309E);
                v3 = arg9.jo(v0, -2099036025);
                v9_1 = arg9.jo(1, 0x869F9825) == 1 ? 1 : 0;
                if(v9_1 != 0) {
                    int[] v9_2 = ho.aa;
                    v4 = ho.av + 0x4FE45817;
                    ho.av = v4;
                    v9_2[v4 * 0xC3B65FA7 - 1] = arg10;
                }

                if(client.jf[arg10] == null) {
                    hw[] v9_3 = client.jf;
                    hw v4_1 = new hw();
                    v9_3[arg10] = v4_1;
                    v4_1.ak = 0xE1684B9B * arg10;
                    if(ho.an[arg10] != null) {
                        v4_1.ax(ho.an[arg10], 0x249FFEC7);
                    }

                    v4_1.du = ho.af[arg10] * 0x4EFE4D63;
                    v4_1.cy = ho.ai[arg10] * 0xDDB4A4E9;
                    v5 = ho.ab[arg10] >> 28;
                    v6 = ho.ab[arg10] >> 14 & 0xFF;
                    v9_1 = ho.ab[arg10] & 0xFF;
                    v4_1.ds[0] = ho.ar[arg10];
                    v4_1.as = (((byte)v5)) * 0x491DBAEF;
                    v4_1.ab(arg11 + (v6 << 13) - ad.fi * 474770003, (v9_1 << v0) + v3 - nr.fo * 0x519F9BE7, -121);
                    v4_1.ba = false;
                    return 1;
                }

                throw new RuntimeException();
            }

            v3 = 3;
            if(arg11 == 1) {
                ho.ab[arg10] = ((arg9.jo(v0, 0xAC67D2FF) + (ho.ab[arg10] >> 28) & v3) << 28) + (ho.ab[arg10] & 0xFFFFFFF);
                return 0;
            }

            if(v0 == arg11) {
                v4 = 5;
                v9_1 = arg9.jo(v4, 0xD5669434);
                arg11 = v9_1 >> 3;
                v5 = 7;
                v9_1 &= v5;
                arg11 = arg11 + (ho.ab[arg10] >> 28) & v3;
                int v7 = ho.ab[arg10] >> 14 & 0xFF;
                v6 = ho.ab[arg10] & 0xFF;
                if(v9_1 == 0) {
                    --v7;
                    --v6;
                }

                if(1 == v9_1) {
                    --v6;
                }

                if(v9_1 == v0) {
                    ++v7;
                    --v6;
                }

                if(v9_1 == v3) {
                    --v7;
                }

                if(4 == v9_1) {
                    ++v7;
                }

                if(v4 == v9_1) {
                    --v7;
                    ++v6;
                }

                if(v9_1 == 6) {
                    ++v6;
                }

                if(v5 == v9_1) {
                    ++v7;
                    ++v6;
                }

                ho.ab[arg10] = v6 + ((arg11 << 28) + (v7 << 14));
                return 0;
            }

            v9_1 = arg9.jo(18, 0x9629237A);
            ho.ab[arg10] = (((v9_1 >> 16) + (ho.ab[arg10] >> 28) & v3) << 28) + (((v9_1 >> 8 & 0xFF) + (ho.ab[arg10] >> 14) & 0xFF) << 14) + ((v9_1 & 0xFF) + ho.ab[arg10] & 0xFF);
            return 0;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("mm.ap(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public static void aq(ln arg6, String arg7, String arg8, int arg9, int arg10) throws IOException {
        et.an = arg10 * 0x75989855;
        mm.aa = 0x6C0F163B * arg9;
        mm.az = arg6.fi(0x72AE96BF);
        lu.ar = arg6.fc(arg7, arg8, arg9, 0xB138F410);
        try {
            id.am = System.getProperty("os.name");
        }
        catch(Exception ) {
            id.am = "Unknown";
        }

        dp.au = id.am.toLowerCase();
        fg.ax(lu.ar, 1);
        md.ae(arg6.fo(arg9, -1100082908), 0xAD076923);
        mm.af = new op(new og(in.al("main_file_cache.dat2", 0x397FB50D), "rw", 0x3E800000), 5200, 0);
        long v0 = 0x100000;
        int v8 = 6000;
        mm.ai = new op(new og(in.al("main_file_cache.idx255", 0xEB46CF95), "rw", v0), v8, 0);
        int v7 = 0xD32FA4FD;
        mm.av = new op[et.an * v7];
        int v6;
        for(v6 = 0; v6 < et.an * v7; ++v6) {
            op[] v10 = mm.av;
            StringBuilder v4 = new StringBuilder();
            v4.append("main_file_cache.idx");
            v4.append(v6);
            v10[v6] = new op(new og(in.al(v4.toString(), 0xF46D0EF3), "rw", v0), v8, 0);
        }
    }

    public static void as() {
        try {
            mm.af.ax(2124306745);
            int v0;
            for(v0 = 0; v0 < et.an * 0xD32FA4FD; ++v0) {
                mm.av[v0].ax(0x70A67118);
            }

            mm.ai.ax(451503094);
            mm.ab.ax(0x71E41506);
            mm.af = null;
            mm.av = null;
            mm.ai = null;
            mm.ab = null;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public static byte[] at() {
        int v0 = 24;
        byte[] v1 = new byte[v0];
        int v2 = 0;
        try {
            mm.ab.al(0);
            mm.ab.ar(v1, 0x8ACA2D54);
            int v3 = 0;
            while(v3 < v0) {
                if(v1[v3] != 0) {
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }

            if(v3 < v0) {
                return v1;
            }

            throw new IOException();
        }
        catch(Exception ) {
            while(v2 < v0) {
                v1[v2] = -1;
                ++v2;
            }
        }

        return v1;
    }

    static void au(File arg8) {
        try {
            int v2 = 24;
            long v3 = 25;
            if(arg8.exists()) {
                mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
                return;
            }

            RandomAccessFile v0 = new RandomAccessFile(arg8, "rw");
            int v5 = v0.read();
            v0.seek(0);
            v0.write(v5);
            v0.seek(0);
            v0.close();
            mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    public static og av(String arg8, String arg9, boolean arg10) {
        File v1 = lu.ar;
        StringBuilder v2 = new StringBuilder();
        v2.append("preferences");
        v2.append(arg8);
        v2.append(".dat");
        File v0 = new File(v1, v2.toString());
        long v2_1 = 10000;
        if(!v0.exists()) {
            goto label_18;
        }

        try {
            return new og(v0, "rw", v2_1);
        }
        catch(IOException ) {
        label_18:
            String v1_1 = "";
            if(0x4A15E935 == mm.aa * 0x33D2E4F5) {
                v1_1 = "_rc";
            }
            else if(0x9000C506 == mm.aa * 0x48AED12E) {
                v1_1 = "_wip";
            }

            File v5 = mm.az;
            StringBuilder v6 = new StringBuilder();
            v6.append("jagex_");
            v6.append(arg9);
            v6.append("_preferences");
            v6.append(arg8);
            v6.append(v1_1);
            v6.append(".dat");
            File v4 = new File(v5, v6.toString());
            if(!arg10 && (v4.exists())) {
                try {
                    return new og(v4, "rw", v2_1);
                }
                catch(IOException ) {
                    try {
                    label_54:
                        return new og(v0, "rw", v2_1);
                    }
                    catch(IOException ) {
                        throw new RuntimeException();
                    }
                }
            }

            goto label_54;
        }
    }

    public static void aw(lq arg3, int arg4) {
        if(mm.ab != null) {
            try {
                mm.ab.al(0);
                mm.ab.aj(arg3.ae, arg4, 24, 0xB984CE18);
                return;
            }
            catch(Exception ) {
                return;
            }
        }
    }

    public static byte[] ay() {
        int v0 = 24;
        byte[] v1 = new byte[v0];
        int v2 = 0;
        try {
            mm.ab.al(0);
            mm.ab.ar(v1, 0xB0BF04D6);
            int v3 = 0;
            while(v3 < v0) {
                if(v1[v3] != 0) {
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }

            if(v3 < v0) {
                return v1;
            }

            throw new IOException();
        }
        catch(Exception ) {
            while(v2 < v0) {
                v1[v2] = -1;
                ++v2;
            }
        }

        return v1;
    }

    static void az(File arg8) {
        try {
            int v2 = 24;
            long v3 = 25;
            if(arg8.exists()) {
                mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
                return;
            }

            RandomAccessFile v0 = new RandomAccessFile(arg8, "rw");
            int v5 = v0.read();
            v0.seek(0);
            v0.write(v5);
            v0.seek(0);
            v0.close();
            mm.ab = new op(new og(arg8, "rw", v3), v2, 0);
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    public static void bd() {
        try {
            mm.af.ax(944701052);
            int v0;
            for(v0 = 0; v0 < et.an * 0xD55F1339; ++v0) {
                mm.av[v0].ax(0x1FFA8205);
            }

            mm.ai.ax(0x601AA3E0);
            mm.ab.ax(2000719928);
            mm.af = null;
            mm.av = null;
            mm.ai = null;
            mm.ab = null;
            return;
        }
        catch(Exception ) {
            return;
        }
    }
}

