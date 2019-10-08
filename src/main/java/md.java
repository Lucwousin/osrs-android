import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class md {
    static int ae = 0;
    static final int ak = 0x1240108;
    static int al;
    static byte[][] an;
    static byte[][] ap;
    static byte[][][] aq;
    static byte[][] ar;
    static int ax;

    static {
        md.ar = new byte[1000][];
        md.an = new byte[0xFA][];
        md.ap = new byte[50][];
    }

    md() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("md.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static byte[] ab(int arg3) {
        byte[] v3_1;
        Class v0 = md.class;
        __monitor_enter(v0);
        int v2 = -1698069479;
        try {
            v3_1 = md.al(arg3, false, v2);
        }
        catch(Throwable v3) {
            __monitor_exit(v0);
            throw v3;
        }

        __monitor_exit(v0);
        return v3_1;
    }

    static byte[] ad(int arg5, boolean arg6) {
        byte[] v5_2;
        int v6;
        byte[][] v5_1;
        int v3;
        Class v0 = md.class;
        __monitor_enter(v0);
        int v1 = 100;
        byte[] v2 = null;
        if(arg5 == v1) {
            try {
            label_7:
                v3 = -1067990697;
                if(md.ax * v3 > 0) {
                    v5_1 = md.ar;
                    v6 = md.ax - 2089335399;
                    md.ax = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ar[md.ax * v3] = v2;
                    goto label_22;
                }

                goto label_24;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_22:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_7;
        }

    label_24:
        v1 = 5000;
        if(arg5 == v1) {
            try {
            label_28:
                v3 = 0x41E25FAF;
                if(md.al * v3 > 0) {
                    v5_1 = md.an;
                    v6 = md.al + 0x6A9FA8B1;
                    md.al = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.an[md.al * v3] = v2;
                    goto label_43;
                }

                goto label_45;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_43:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_28;
        }

    label_45:
        v1 = 30000;
        if(v1 == arg5) {
            try {
            label_49:
                v3 = 2052631195;
                if(md.ae * v3 > 0) {
                    v5_1 = md.ap;
                    v6 = md.ae + 0x18D5D46D;
                    md.ae = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ap[md.ae * v3] = v2;
                    goto label_64;
                }

                goto label_66;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_64:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_49;
        }

        try {
        label_66:
            v3 = 0;
            if(md.aq != null) {
                v1 = 0;
                while(true) {
                label_70:
                    if(v1 < hv.aj.length) {
                        if((arg5 == hv.aj[v1] || arg5 < hv.aj[v1] && (arg6)) && am.ad[v1] > 0) {
                            v5_1 = md.aq[v1];
                            int[] v6_1 = am.ad;
                            v3 = v6_1[v1] - 1;
                            v6_1[v1] = v3;
                            v5_2 = v5_1[v3];
                            md.aq[v1][am.ad[v1]] = v2;
                            goto label_95;
                        }

                        goto label_97;
                    }

                    goto label_99;
                }
            }

            goto label_99;
        }
        catch(Throwable v5) {
            goto label_125;
        }

    label_95:
        __monitor_exit(v0);
        return v5_2;
    label_97:
        ++v1;
        goto label_70;
    label_99:
        if(arg6) {
            try {
                if(hv.aj == null) {
                    goto label_121;
                }

                while(true) {
                label_102:
                    if(v3 >= hv.aj.length) {
                        goto label_121;
                    }

                    if(arg5 <= hv.aj[v3] && am.ad[v3] < md.aq[v3].length) {
                        v5_2 = new byte[hv.aj[v3]];
                        break;
                    }

                    goto label_119;
                }
            }
            catch(Throwable v5) {
                goto label_125;
            }

            __monitor_exit(v0);
            return v5_2;
        label_119:
            ++v3;
            goto label_102;
        }

        try {
        label_121:
            v5_2 = new byte[arg5];
        }
        catch(Throwable v5) {
        label_125:
            __monitor_exit(v0);
            throw v5;
        }

        __monitor_exit(v0);
        return v5_2;
    }

    static void ae(File arg7, int arg8) {
        try {
            int v1 = 24;
            long v2 = 25;
            if(arg7.exists()) {
                mm.ab = new op(new og(arg7, "rw", v2), v1, 0);
                return;
            }

            RandomAccessFile v8 = new RandomAccessFile(arg7, "rw");
            int v4 = v8.read();
            v8.seek(0);
            v8.write(v4);
            v8.seek(0);
            v8.close();
            mm.ab = new op(new og(arg7, "rw", v2), v1, 0);
            return;
        }
        catch(IOException ) {
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8_1 = new StringBuilder();
            v8_1.append("md.ae(");
            v8_1.append(')');
            throw lx.al(((Throwable)v7), v8_1.toString());
        }
    }

    static byte[] aj(int arg5, boolean arg6) {
        int v3;
        byte[] v5_2;
        int v6;
        byte[][] v5_1;
        int v1;
        Class v0 = md.class;
        __monitor_enter(v0);
        byte[] v2 = null;
        if(arg5 == 0x2EC614CA || arg5 < 100 && (arg6)) {
            v1 = -911514930;
            try {
                if(md.ax * v1 > 0) {
                    v5_1 = md.ar;
                    v6 = md.ax - 0x454AB491;
                    md.ax = v6;
                    v5_2 = v5_1[v6 * -1067990697];
                    md.ar[md.ax * 0xB4A3FF3A] = v2;
                    goto label_25;
                }

                goto label_27;
            }
            catch(Throwable v5) {
                goto label_133;
            }

        label_25:
            __monitor_exit(v0);
            return v5_2;
        }

    label_27:
        if(arg5 == -298026414 || arg5 < 0x4A7180BC && (arg6)) {
            v1 = 0x42AAEFF5;
            try {
                if(md.al * v1 > 0) {
                    v5_1 = md.an;
                    v6 = md.al + 0x613C06CF;
                    md.al = v6;
                    v5_2 = v5_1[v6 * -1574452037];
                    md.an[md.al * 0xA742E66E] = v2;
                    goto label_49;
                }

                goto label_51;
            }
            catch(Throwable v5) {
                goto label_133;
            }

        label_49:
            __monitor_exit(v0);
            return v5_2;
        }

    label_51:
        if(0xBA1027B2 == arg5) {
            try {
            label_56:
                v3 = 2052631195;
                if(md.ae * v3 > 0) {
                    v5_1 = md.ap;
                    v6 = md.ae + 0x35512CBB;
                    md.ae = v6;
                    v5_2 = v5_1[v6 * -1439572405];
                    md.ap[md.ae * v3] = v2;
                    goto label_72;
                }

                goto label_74;
            }
            catch(Throwable v5) {
                goto label_133;
            }

        label_72:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < 0x69205B9A && (arg6)) {
            goto label_56;
        }

        try {
        label_74:
            v3 = 0;
            if(md.aq != null) {
                v1 = 0;
                while(true) {
                label_78:
                    if(v1 < hv.aj.length) {
                        if((arg5 == hv.aj[v1] || arg5 < hv.aj[v1] && (arg6)) && am.ad[v1] > 0) {
                            v5_1 = md.aq[v1];
                            int[] v6_1 = am.ad;
                            v3 = v6_1[v1] - 1;
                            v6_1[v1] = v3;
                            v5_2 = v5_1[v3];
                            md.aq[v1][am.ad[v1]] = v2;
                            goto label_103;
                        }

                        goto label_105;
                    }

                    goto label_107;
                }
            }

            goto label_107;
        }
        catch(Throwable v5) {
            goto label_133;
        }

    label_103:
        __monitor_exit(v0);
        return v5_2;
    label_105:
        ++v1;
        goto label_78;
    label_107:
        if(arg6) {
            try {
                if(hv.aj == null) {
                    goto label_129;
                }

                while(true) {
                label_110:
                    if(v3 >= hv.aj.length) {
                        goto label_129;
                    }

                    if(arg5 <= hv.aj[v3] && am.ad[v3] < md.aq[v3].length) {
                        v5_2 = new byte[hv.aj[v3]];
                        break;
                    }

                    goto label_127;
                }
            }
            catch(Throwable v5) {
                goto label_133;
            }

            __monitor_exit(v0);
            return v5_2;
        label_127:
            ++v3;
            goto label_110;
        }

        try {
        label_129:
            v5_2 = new byte[arg5];
        }
        catch(Throwable v5) {
        label_133:
            __monitor_exit(v0);
            throw v5;
        }

        __monitor_exit(v0);
        return v5_2;
    }

    public static void al(boolean arg2, int arg3) {
        lq v3;
        int v0;
        try {
            if(km.an != null) {
                goto label_3;
            }
        }
        catch(RuntimeException v2) {
            goto label_30;
        }

        return;
        try {
        label_3:
            v0 = 4;
            v3 = new lq(v0);
            if(!arg2) {
                goto label_9;
            }

            goto label_7;
        }
        catch(RuntimeException v2) {
        }
        catch(IOException ) {
            try {
            label_19:
                km.an.an();
                goto label_21;
            }
            catch(Exception ) {
                goto label_21;
            }
            catch(RuntimeException v2) {
                goto label_30;
            }

            try {
            label_7:
                int v2_1 = 2;
                goto label_10;
            label_9:
                v2_1 = 3;
            label_10:
                v3.ar(v2_1, 60);
                v3.ap(0, -1);
                km.an.af(v3.ae, 0, v0);
                return;
            }
            catch(IOException ) {
                goto label_19;
            }
            catch(RuntimeException v2) {
                goto label_30;
            }

            try {
            label_21:
                km.ba += 0x2E50558D;
                km.an = null;
            }
            catch(RuntimeException v2) {
            label_30:
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("md.al(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    static byte[] al(int arg4, boolean arg5, int arg6) {
        byte[] v4_3;
        int v5;
        byte[][] v4_2;
        int v2;
        Class v6 = md.class;
        __monitor_enter(v6);
        int v0 = 100;
        byte[] v1 = null;
        if(arg4 == v0) {
            try {
            label_7:
                v2 = -1067990697;
                if(md.ax * v2 > 0) {
                    v4_2 = md.ar;
                    v5 = md.ax - 2089335399;
                    md.ax = v5;
                    v4_3 = v4_2[v5 * v2];
                    md.ar[md.ax * v2] = v1;
                    goto label_22;
                }

                goto label_24;
            }
            catch(Throwable v4) {
                goto label_136;
            }
            catch(RuntimeException v4_1) {
                goto label_127;
            }

        label_22:
            __monitor_exit(v6);
            return v4_3;
        }
        else if(arg4 < v0 && (arg5)) {
            goto label_7;
        }

    label_24:
        v0 = 5000;
        if(arg4 == v0) {
            try {
            label_28:
                v2 = 0x41E25FAF;
                if(md.al * v2 > 0) {
                    v4_2 = md.an;
                    v5 = md.al + 0x6A9FA8B1;
                    md.al = v5;
                    v4_3 = v4_2[v5 * v2];
                    md.an[md.al * v2] = v1;
                    goto label_43;
                }

                goto label_45;
            }
            catch(Throwable v4) {
                goto label_136;
            }
            catch(RuntimeException v4_1) {
                goto label_127;
            }

        label_43:
            __monitor_exit(v6);
            return v4_3;
        }
        else if(arg4 < v0 && (arg5)) {
            goto label_28;
        }

    label_45:
        v0 = 30000;
        if(v0 == arg4) {
            try {
            label_49:
                v2 = 2052631195;
                if(md.ae * v2 > 0) {
                    v4_2 = md.ap;
                    v5 = md.ae + 0x18D5D46D;
                    md.ae = v5;
                    v4_3 = v4_2[v5 * v2];
                    md.ap[md.ae * v2] = v1;
                    goto label_64;
                }

                goto label_66;
            }
            catch(Throwable v4) {
                goto label_136;
            }
            catch(RuntimeException v4_1) {
                goto label_127;
            }

        label_64:
            __monitor_exit(v6);
            return v4_3;
        }
        else if(arg4 < v0 && (arg5)) {
            goto label_49;
        }

        try {
        label_66:
            v2 = 0;
            if(md.aq != null) {
                v0 = 0;
                while(true) {
                label_70:
                    if(v0 < hv.aj.length) {
                        if((arg4 == hv.aj[v0] || arg4 < hv.aj[v0] && (arg5)) && am.ad[v0] > 0) {
                            v4_2 = md.aq[v0];
                            int[] v5_1 = am.ad;
                            v2 = v5_1[v0] - 1;
                            v5_1[v0] = v2;
                            v4_3 = v4_2[v2];
                            md.aq[v0][am.ad[v0]] = v1;
                            goto label_95;
                        }

                        goto label_97;
                    }

                    goto label_99;
                }
            }

            goto label_99;
        }
        catch(Throwable v4) {
            goto label_136;
        }
        catch(RuntimeException v4_1) {
            goto label_127;
        }

    label_95:
        __monitor_exit(v6);
        return v4_3;
    label_97:
        ++v0;
        goto label_70;
    label_99:
        if(arg5) {
            try {
                if(hv.aj == null) {
                    goto label_121;
                }

                while(true) {
                label_102:
                    if(v2 >= hv.aj.length) {
                        goto label_121;
                    }

                    if(arg4 <= hv.aj[v2] && am.ad[v2] < md.aq[v2].length) {
                        v4_3 = new byte[hv.aj[v2]];
                        break;
                    }

                    goto label_119;
                }
            }
            catch(Throwable v4) {
                goto label_136;
            }
            catch(RuntimeException v4_1) {
                goto label_127;
            }

            __monitor_exit(v6);
            return v4_3;
        label_119:
            ++v2;
            goto label_102;
        }

        try {
        label_121:
            v4_3 = new byte[arg4];
        }
        catch(Throwable v4) {
        }
        catch(RuntimeException v4_1) {
            try {
            label_127:
                StringBuilder v5_2 = new StringBuilder();
                v5_2.append("md.al(");
                v5_2.append(')');
                throw lx.al(((Throwable)v4_1), v5_2.toString());
            }
            catch(Throwable v4) {
            label_136:
                __monitor_exit(v6);
                throw v4;
            }
        }

        __monitor_exit(v6);
        return v4_3;
    }

    public static void an(int[] arg2, int[] arg3) {
        if(arg2 != null) {
            if(arg3 == null) {
            }
            else {
                hv.aj = arg2;
                am.ad = new int[arg2.length];
                md.aq = new byte[arg2.length][][];
                int v2;
                for(v2 = 0; v2 < hv.aj.length; ++v2) {
                    md.aq[v2] = new byte[arg3[v2]][];
                }

                return;
            }
        }

        hv.aj = null;
        am.ad = null;
        md.aq = null;
    }

    static byte[] ap(int arg5, boolean arg6) {
        byte[] v5_2;
        int v6;
        byte[][] v5_1;
        int v3;
        Class v0 = md.class;
        __monitor_enter(v0);
        int v1 = 100;
        byte[] v2 = null;
        if(arg5 == v1) {
            try {
            label_7:
                v3 = -1067990697;
                if(md.ax * v3 > 0) {
                    v5_1 = md.ar;
                    v6 = md.ax - 2089335399;
                    md.ax = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ar[md.ax * v3] = v2;
                    goto label_22;
                }

                goto label_24;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_22:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_7;
        }

    label_24:
        v1 = 5000;
        if(arg5 == v1) {
            try {
            label_28:
                v3 = 0x41E25FAF;
                if(md.al * v3 > 0) {
                    v5_1 = md.an;
                    v6 = md.al + 0x6A9FA8B1;
                    md.al = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.an[md.al * v3] = v2;
                    goto label_43;
                }

                goto label_45;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_43:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_28;
        }

    label_45:
        v1 = 30000;
        if(v1 == arg5) {
            try {
            label_49:
                v3 = 2052631195;
                if(md.ae * v3 > 0) {
                    v5_1 = md.ap;
                    v6 = md.ae + 0x18D5D46D;
                    md.ae = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ap[md.ae * v3] = v2;
                    goto label_64;
                }

                goto label_66;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_64:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_49;
        }

        try {
        label_66:
            v3 = 0;
            if(md.aq != null) {
                v1 = 0;
                while(true) {
                label_70:
                    if(v1 < hv.aj.length) {
                        if((arg5 == hv.aj[v1] || arg5 < hv.aj[v1] && (arg6)) && am.ad[v1] > 0) {
                            v5_1 = md.aq[v1];
                            int[] v6_1 = am.ad;
                            v3 = v6_1[v1] - 1;
                            v6_1[v1] = v3;
                            v5_2 = v5_1[v3];
                            md.aq[v1][am.ad[v1]] = v2;
                            goto label_95;
                        }

                        goto label_97;
                    }

                    goto label_99;
                }
            }

            goto label_99;
        }
        catch(Throwable v5) {
            goto label_125;
        }

    label_95:
        __monitor_exit(v0);
        return v5_2;
    label_97:
        ++v1;
        goto label_70;
    label_99:
        if(arg6) {
            try {
                if(hv.aj == null) {
                    goto label_121;
                }

                while(true) {
                label_102:
                    if(v3 >= hv.aj.length) {
                        goto label_121;
                    }

                    if(arg5 <= hv.aj[v3] && am.ad[v3] < md.aq[v3].length) {
                        v5_2 = new byte[hv.aj[v3]];
                        break;
                    }

                    goto label_119;
                }
            }
            catch(Throwable v5) {
                goto label_125;
            }

            __monitor_exit(v0);
            return v5_2;
        label_119:
            ++v3;
            goto label_102;
        }

        try {
        label_121:
            v5_2 = new byte[arg5];
        }
        catch(Throwable v5) {
        label_125:
            __monitor_exit(v0);
            throw v5;
        }

        __monitor_exit(v0);
        return v5_2;
    }

    static byte[] aq(int arg5, boolean arg6) {
        byte[] v5_2;
        int v6;
        byte[][] v5_1;
        int v3;
        Class v0 = md.class;
        __monitor_enter(v0);
        int v1 = 100;
        byte[] v2 = null;
        if(arg5 == v1) {
            try {
            label_7:
                v3 = -1067990697;
                if(md.ax * v3 > 0) {
                    v5_1 = md.ar;
                    v6 = md.ax - 2089335399;
                    md.ax = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ar[md.ax * v3] = v2;
                    goto label_22;
                }

                goto label_24;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_22:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_7;
        }

    label_24:
        v1 = 5000;
        if(arg5 == v1) {
            try {
            label_28:
                v3 = 0x41E25FAF;
                if(md.al * v3 > 0) {
                    v5_1 = md.an;
                    v6 = md.al + 0x6A9FA8B1;
                    md.al = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.an[md.al * v3] = v2;
                    goto label_43;
                }

                goto label_45;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_43:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_28;
        }

    label_45:
        v1 = 30000;
        if(v1 == arg5) {
            try {
            label_49:
                v3 = 2052631195;
                if(md.ae * v3 > 0) {
                    v5_1 = md.ap;
                    v6 = md.ae + 0x18D5D46D;
                    md.ae = v6;
                    v5_2 = v5_1[v6 * v3];
                    md.ap[md.ae * v3] = v2;
                    goto label_64;
                }

                goto label_66;
            }
            catch(Throwable v5) {
                goto label_125;
            }

        label_64:
            __monitor_exit(v0);
            return v5_2;
        }
        else if(arg5 < v1 && (arg6)) {
            goto label_49;
        }

        try {
        label_66:
            v3 = 0;
            if(md.aq != null) {
                v1 = 0;
                while(true) {
                label_70:
                    if(v1 < hv.aj.length) {
                        if((arg5 == hv.aj[v1] || arg5 < hv.aj[v1] && (arg6)) && am.ad[v1] > 0) {
                            v5_1 = md.aq[v1];
                            int[] v6_1 = am.ad;
                            v3 = v6_1[v1] - 1;
                            v6_1[v1] = v3;
                            v5_2 = v5_1[v3];
                            md.aq[v1][am.ad[v1]] = v2;
                            goto label_95;
                        }

                        goto label_97;
                    }

                    goto label_99;
                }
            }

            goto label_99;
        }
        catch(Throwable v5) {
            goto label_125;
        }

    label_95:
        __monitor_exit(v0);
        return v5_2;
    label_97:
        ++v1;
        goto label_70;
    label_99:
        if(arg6) {
            try {
                if(hv.aj == null) {
                    goto label_121;
                }

                while(true) {
                label_102:
                    if(v3 >= hv.aj.length) {
                        goto label_121;
                    }

                    if(arg5 <= hv.aj[v3] && am.ad[v3] < md.aq[v3].length) {
                        v5_2 = new byte[hv.aj[v3]];
                        break;
                    }

                    goto label_119;
                }
            }
            catch(Throwable v5) {
                goto label_125;
            }

            __monitor_exit(v0);
            return v5_2;
        label_119:
            ++v3;
            goto label_102;
        }

        try {
        label_121:
            v5_2 = new byte[arg5];
        }
        catch(Throwable v5) {
        label_125:
            __monitor_exit(v0);
            throw v5;
        }

        __monitor_exit(v0);
        return v5_2;
    }
}

