import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class oj {
    public static final int ab = 27;
    public static final int ae = 2;
    static final int av = 100;
    static fb ax;

    static {
        oj.ax = new fb();
    }

    oj() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("oj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void aa(lq arg16, int arg17) {
        int v9_2;
        int v7_1;
        Method[] v6;
        lq v0 = arg16;
        ow v1 = new ow();
        v1.al = v0.ay(-86) * -724835602;
        v1.ax = v0.ac(22) * 0x44C7DC39;
        int v3 = -1490920515;
        v1.ae = new int[v1.al * v3];
        v1.ar = new int[v1.al * 0x3AF2DB45];
        v1.an = new Field[v1.al * v3];
        v1.ap = new int[v1.al * v3];
        v1.aj = new Method[v1.al * -1395155890];
        v1.ad = new byte[v1.al * 308102352][][];
        int v4 = 0;
        while(v4 < v1.al * v3) {
            byte v5 = -82;
            try {
                int v5_1 = v0.ay(v5);
                if(v5_1 != 0 && 1 != v5_1) {
                    byte v7 = 2;
                    if(v5_1 == v7) {
                    }
                    else {
                        int v8 = 3;
                        if(v8 != v5_1 && v5_1 != 4) {
                            goto label_189;
                        }

                        String v9 = v0.bn(-57);
                        String v10 = v0.bn(27);
                        int v11 = v0.ay(-115);
                        String[] v12 = new String[v11];
                        int v13;
                        for(v13 = 0; v13 < v11; ++v13) {
                            v12[v13] = v0.bn(56);
                        }

                        String v13_1 = v0.bn(28);
                        byte[][] v14 = new byte[v11][];
                        if(v5_1 == v8) {
                            for(v8 = 0; v8 < v11; ++v8) {
                                int v15 = v0.ac(0x4F);
                                v14[v8] = new byte[v15];
                                v0.bw(v14[v8], 0, v15, 0x1AC108C8);
                            }
                        }

                        v1.ae[v4] = v5_1;
                        Class[] v3_1 = new Class[v11];
                        for(v5_1 = 0; v5_1 < v11; ++v5_1) {
                            v3_1[v5_1] = ab.an(v12[v5_1], v7);
                        }

                        Class v5_2 = ab.an(v13_1, 61);
                        if(ab.an(v9, 36).getClassLoader() != null) {
                            v6 = ab.an(v9, 58).getDeclaredMethods();
                            v7_1 = 0;
                        }
                        else {
                            throw new SecurityException();
                        }

                        while(v7_1 < v6.length) {
                            Method v8_1 = v6[v7_1];
                            if(v8_1.getName().equals(v10)) {
                                Class[] v9_1 = v8_1.getParameterTypes();
                                if(v9_1.length == v3_1.length) {
                                    v11 = 0;
                                    while(true) {
                                        if(v11 >= v3_1.length) {
                                            break;
                                        }
                                        else if(v3_1[v11] != v9_1[v11]) {
                                            v9_2 = 0;
                                        }
                                        else {
                                            ++v11;
                                            continue;
                                        }

                                        goto label_130;
                                    }

                                    v9_2 = 1;
                                label_130:
                                    if(v9_2 == 0) {
                                        goto label_135;
                                    }

                                    if(v5_2 != v8_1.getReturnType()) {
                                        goto label_135;
                                    }

                                    v1.aj[v4] = v8_1;
                                }
                            }

                        label_135:
                            ++v7_1;
                        }

                        v1.ad[v4] = v14;
                        goto label_189;
                    }
                }

                String v3_2 = v0.bn(-9);
                String v6_1 = v0.bn(-30);
                v7_1 = 1 == v5_1 ? v0.ac(50) : 0;
                v1.ae[v4] = v5_1;
                v1.ap[v4] = v7_1;
                if(ab.an(v3_2, -26).getClassLoader() != null) {
                    v1.an[v4] = ab.an(v3_2, -38).getDeclaredField(v6_1);
                    goto label_189;
                }

                throw new SecurityException();
            }
            catch(Throwable ) {
                v1.ar[v4] = -5;
            }
            catch(Exception ) {
                v1.ar[v4] = -4;
            }
            catch(NullPointerException ) {
                v1.ar[v4] = 0x23A3CCC0;
            }
            catch(SecurityException ) {
                v1.ar[v4] = -2;
            }
            catch(ClassNotFoundException ) {
                v1.ar[v4] = -1;
            }

        label_189:
            ++v4;
            v3 = -1490920515;
        }

        oj.ax.al(((mx)v1));
    }

    public static boolean ab() {
        if(oj.ax.an() == null) {
            return 0;
        }

        return 1;
    }

    public static void ad() {
        oj.ax = new fb();
    }

    public static boolean af() {
        if(oj.ax.an() == null) {
            return 0;
        }

        return 1;
    }

    static Class ag(String arg1) throws ClassNotFoundException {
        if(arg1.equals("B")) {
            return Byte.TYPE;
        }

        if(arg1.equals("I")) {
            return Integer.TYPE;
        }

        if(arg1.equals("S")) {
            return Short.TYPE;
        }

        if(arg1.equals("J")) {
            return Long.TYPE;
        }

        if(arg1.equals("Z")) {
            return Boolean.TYPE;
        }

        if(arg1.equals("F")) {
            return Float.TYPE;
        }

        if(arg1.equals("D")) {
            return Double.TYPE;
        }

        if(arg1.equals("C")) {
            return Character.TYPE;
        }

        if(arg1.equals("void")) {
            return Void.TYPE;
        }

        return Class.forName(arg1);
    }

    static Class ah(String arg1) throws ClassNotFoundException {
        if(arg1.equals("B")) {
            return Byte.TYPE;
        }

        if(arg1.equals("I")) {
            return Integer.TYPE;
        }

        if(arg1.equals("S")) {
            return Short.TYPE;
        }

        if(arg1.equals("J")) {
            return Long.TYPE;
        }

        if(arg1.equals("Z")) {
            return Boolean.TYPE;
        }

        if(arg1.equals("F")) {
            return Float.TYPE;
        }

        if(arg1.equals("D")) {
            return Double.TYPE;
        }

        if(arg1.equals("C")) {
            return Character.TYPE;
        }

        if(arg1.equals("void")) {
            return Void.TYPE;
        }

        return Class.forName(arg1);
    }

    public static void ai(lo arg16) {
        int v6;
        int v13;
        lo v0 = arg16;
        mx v1 = oj.ax.an();
        if(v1 == null) {
            return;
        }

        int v2 = v0.ar * 100280249;
        int v3 = 0x79EF67B1;
        v0.aj(((ow)v1).ax * 1544000147, v3);
        int v5 = 0;
        while(v5 < ((ow)v1).al * -1490920515) {
            if(((ow)v1).ar[v5] != 0) {
                v0.ar(((ow)v1).ar[v5], 76);
                goto label_168;
            }

            try {
                int v8 = ((ow)v1).ae[v5];
                byte v9 = 50;
                int v10 = 2;
                Object v11 = null;
                if(v8 == 0) {
                    v13 = ((ow)v1).an[v5].getInt(v11);
                    v0.ar(0, v9);
                    v0.aj(v13, v3);
                }
                else if(1 == v8) {
                    ((ow)v1).an[v5].setInt(v11, ((ow)v1).ap[v5]);
                    v0.ar(0, v9);
                }
                else if(v10 == v8) {
                    int v9_1 = ((ow)v1).an[v5].getModifiers();
                    v0.ar(0, 45);
                    v0.aj(v9_1, v3);
                }

                v13 = 4;
                if(3 == v8) {
                    Method v8_1 = ((ow)v1).aj[v5];
                    byte[][] v9_2 = ((ow)v1).ad[v5];
                    Object[] v14 = new Object[v9_2.length];
                    int v15;
                    for(v15 = 0; v15 < v9_2.length; ++v15) {
                        v14[v15] = new ObjectInputStream(new ByteArrayInputStream(v9_2[v15])).readObject();
                    }

                    Object v3_1 = v8_1.invoke(v11, v14);
                    if(v3_1 == null) {
                        v0.ar(0, 60);
                        goto label_168;
                    }

                    if((v3_1 instanceof Number)) {
                        v0.ar(1, 8);
                        v0.aq(((Number)v3_1).longValue());
                        goto label_168;
                    }

                    if((v3_1 instanceof String)) {
                        v0.ar(v10, 36);
                        v0.ai(((String)v3_1), -105);
                        goto label_168;
                    }

                    v0.ar(v13, 26);
                    goto label_168;
                }

                if(v13 != v8) {
                    goto label_168;
                }

                v3 = ((ow)v1).aj[v5].getModifiers();
                v0.ar(0, 93);
                v6 = 0x79EF67B1;
            }
            catch(Throwable ) {
                goto label_110;
            }
            catch(Exception ) {
                goto label_115;
            }
            catch(NullPointerException ) {
                goto label_120;
            }
            catch(IOException ) {
                goto label_125;
            }
            catch(SecurityException ) {
                goto label_130;
            }
            catch(InvocationTargetException ) {
                goto label_135;
            }
            catch(IllegalArgumentException ) {
                goto label_140;
            }
            catch(IllegalAccessException ) {
                goto label_145;
            }
            catch(OptionalDataException ) {
                goto label_150;
            }
            catch(StreamCorruptedException ) {
                goto label_155;
            }
            catch(InvalidClassException ) {
                goto label_160;
            }
            catch(ClassNotFoundException ) {
                goto label_165;
            }

            try {
                v0.aj(v3, v6);
            }
            catch(Throwable ) {
            label_110:
                v0.ar(-21, 68);
            }
            catch(Exception ) {
            label_115:
                v0.ar(0xB910BBC1, 105);
            }
            catch(NullPointerException ) {
            label_120:
                v0.ar(-19, 54);
            }
            catch(IOException ) {
            label_125:
                v0.ar(-18, 0x7F);
            }
            catch(SecurityException ) {
            label_130:
                v0.ar(0x3313C631, 68);
            }
            catch(InvocationTargetException ) {
            label_135:
                v0.ar(0x30D6CCFE, 0x5F);
            }
            catch(IllegalArgumentException ) {
            label_140:
                v0.ar(-15, 67);
            }
            catch(IllegalAccessException ) {
            label_145:
                v0.ar(-14, 44);
            }
            catch(OptionalDataException ) {
            label_150:
                v0.ar(0xA33F6CAE, 0x7E);
            }
            catch(StreamCorruptedException ) {
            label_155:
                v0.ar(-12, 27);
            }
            catch(InvalidClassException ) {
            label_160:
                v0.ar(-11, 94);
            }
            catch(ClassNotFoundException ) {
            label_165:
                v0.ar(0x92F51026, 27);
            }

        label_168:
            ++v5;
            v3 = 0x79EF67B1;
        }

        v0.bk(v2, 0x844C502D);
        ((ow)v1).lp();
    }

    public static void aj() {
        oj.ax = new fb();
    }

    public static void am(lq arg16, int arg17) {
        int v11_2;
        int v8_1;
        Method[] v7_1;
        lq v0 = arg16;
        ow v1 = new ow();
        v1.al = v0.ay(-90) * 0xEBA73795;
        v1.ax = v0.ac(15) * 0xB2CB5FD;
        int v3 = -1490920515;
        v1.ae = new int[v1.al * v3];
        v1.ar = new int[v1.al * v3];
        v1.an = new Field[v1.al * v3];
        v1.ap = new int[v1.al * v3];
        v1.aj = new Method[v1.al * v3];
        v1.ad = new byte[v1.al * v3][][];
        int v4 = 0;
        while(v4 < v1.al * v3) {
            byte v5 = -81;
            try {
                int v5_1 = v0.ay(v5);
                if(v5_1 != 0 && 1 != v5_1) {
                    if(v5_1 == 2) {
                    }
                    else {
                        int v7 = 3;
                        if(v7 != v5_1 && v5_1 != 4) {
                            goto label_185;
                        }

                        String v8 = v0.bn(-20);
                        String v9 = v0.bn(-76);
                        int v10 = v0.ay(-105);
                        String[] v11 = new String[v10];
                        int v12;
                        for(v12 = 0; v12 < v10; ++v12) {
                            v11[v12] = v0.bn(61);
                        }

                        String v12_1 = v0.bn(13);
                        byte[][] v13 = new byte[v10][];
                        if(v5_1 == v7) {
                            for(v7 = 0; v7 < v10; ++v7) {
                                int v14 = v0.ac(55);
                                v13[v7] = new byte[v14];
                                v0.bw(v13[v7], 0, v14, 0x13950821);
                            }
                        }

                        v1.ae[v4] = v5_1;
                        Class[] v3_1 = new Class[v10];
                        for(v5_1 = 0; v5_1 < v10; ++v5_1) {
                            v3_1[v5_1] = ab.an(v11[v5_1], -32);
                        }

                        Class v5_2 = ab.an(v12_1, 21);
                        if(ab.an(v8, 11).getClassLoader() != null) {
                            v7_1 = ab.an(v8, -67).getDeclaredMethods();
                            v8_1 = 0;
                        }
                        else {
                            throw new SecurityException();
                        }

                        while(v8_1 < v7_1.length) {
                            Method v10_1 = v7_1[v8_1];
                            if(v10_1.getName().equals(v9)) {
                                Class[] v11_1 = v10_1.getParameterTypes();
                                if(v11_1.length == v3_1.length) {
                                    v12 = 0;
                                    while(true) {
                                        if(v12 >= v3_1.length) {
                                            break;
                                        }
                                        else if(v3_1[v12] != v11_1[v12]) {
                                            v11_2 = 0;
                                        }
                                        else {
                                            ++v12;
                                            continue;
                                        }

                                        goto label_127;
                                    }

                                    v11_2 = 1;
                                label_127:
                                    if(v11_2 == 0) {
                                        goto label_132;
                                    }

                                    if(v5_2 != v10_1.getReturnType()) {
                                        goto label_132;
                                    }

                                    v1.aj[v4] = v10_1;
                                }
                            }

                        label_132:
                            ++v8_1;
                        }

                        v1.ad[v4] = v13;
                        goto label_185;
                    }
                }

                String v3_2 = v0.bn(0x30);
                String v7_2 = v0.bn(87);
                int v6 = 1 == v5_1 ? v0.ac(83) : 0;
                v1.ae[v4] = v5_1;
                v1.ap[v4] = v6;
                if(ab.an(v3_2, 84).getClassLoader() != null) {
                    v1.an[v4] = ab.an(v3_2, -50).getDeclaredField(v7_2);
                    goto label_185;
                }

                throw new SecurityException();
            }
            catch(Throwable ) {
                v1.ar[v4] = -5;
            }
            catch(Exception ) {
                v1.ar[v4] = -4;
            }
            catch(NullPointerException ) {
                v1.ar[v4] = -3;
            }
            catch(SecurityException ) {
                v1.ar[v4] = -2;
            }
            catch(ClassNotFoundException ) {
                v1.ar[v4] = -1;
            }

        label_185:
            ++v4;
            v3 = -1490920515;
        }

        oj.ax.al(((mx)v1));
    }

    public static void ap() {
        oj.ax = new fb();
    }

    public static boolean aq() {
        if(oj.ax.an() == null) {
            return 0;
        }

        return 1;
    }

    static Class at(String arg1) throws ClassNotFoundException {
        if(arg1.equals("B")) {
            return Byte.TYPE;
        }

        if(arg1.equals("I")) {
            return Integer.TYPE;
        }

        if(arg1.equals("S")) {
            return Short.TYPE;
        }

        if(arg1.equals("J")) {
            return Long.TYPE;
        }

        if(arg1.equals("Z")) {
            return Boolean.TYPE;
        }

        if(arg1.equals("F")) {
            return Float.TYPE;
        }

        if(arg1.equals("D")) {
            return Double.TYPE;
        }

        if(arg1.equals("C")) {
            return Character.TYPE;
        }

        if(arg1.equals("void")) {
            return Void.TYPE;
        }

        return Class.forName(arg1);
    }

    public static void au(lq arg14, int arg15) {
        Method[] v5_1;
        int v11;
        String v5;
        ow v15 = new ow();
        v15.al = arg14.ay(-98) * 0x536DB5FF;
        v15.ax = arg14.ac(90) * 0xB2CB5FD;
        v15.ae = new int[v15.al * 0xC8A91CD4];
        v15.ar = new int[v15.al * -2033784989];
        v15.an = new Field[v15.al * -1490920515];
        v15.ap = new int[v15.al * 0xD7E0EC7A];
        v15.aj = new Method[v15.al * -1490920515];
        v15.ad = new byte[v15.al * -1490920515][][];
        int v1;
        for(v1 = 0; v1 < v15.al * 763826800; ++v1) {
            byte v2 = -18;
            try {
                int v2_1 = arg14.ay(v2);
                if(v2_1 != 0 && 1 != v2_1) {
                    if(v2_1 == 2) {
                    }
                    else {
                        int v4 = 3;
                        if(v4 != v2_1 && v2_1 != 4) {
                            goto label_187;
                        }

                        v5 = arg14.bn(-17);
                        String v6 = arg14.bn(0x1F);
                        int v7 = arg14.ay(-91);
                        String[] v8 = new String[v7];
                        int v9;
                        for(v9 = 0; v9 < v7; ++v9) {
                            v8[v9] = arg14.bn(51);
                        }

                        String v9_1 = arg14.bn(68);
                        byte[][] v10 = new byte[v7][];
                        if(v2_1 == v4) {
                            for(v4 = 0; v4 < v7; ++v4) {
                                v11 = arg14.ac(120);
                                v10[v4] = new byte[v11];
                                arg14.bw(v10[v4], 0, v11, 0x821C903E);
                            }
                        }

                        v15.ae[v1] = v2_1;
                        Class[] v2_2 = new Class[v7];
                        for(v4 = 0; v4 < v7; ++v4) {
                            v2_2[v4] = ab.an(v8[v4], 61);
                        }

                        Class v4_1 = ab.an(v9_1, -33);
                        if(ab.an(v5, 44).getClassLoader() != null) {
                            v5_1 = ab.an(v5, -8).getDeclaredMethods();
                            v7 = 0;
                        }
                        else {
                            throw new SecurityException();
                        }

                        while(v7 < v5_1.length) {
                            Method v8_1 = v5_1[v7];
                            if(v8_1.getName().equals(v6)) {
                                Class[] v9_2 = v8_1.getParameterTypes();
                                if(v9_2.length == v2_2.length) {
                                    v11 = 0;
                                    while(true) {
                                        if(v11 >= v2_2.length) {
                                            break;
                                        }
                                        else if(v2_2[v11] != v9_2[v11]) {
                                            v9 = 0;
                                        }
                                        else {
                                            ++v11;
                                            continue;
                                        }

                                        goto label_129;
                                    }

                                    v9 = 1;
                                label_129:
                                    if(v9 == 0) {
                                        goto label_134;
                                    }

                                    if(v4_1 != v8_1.getReturnType()) {
                                        goto label_134;
                                    }

                                    v15.aj[v1] = v8_1;
                                }
                            }

                        label_134:
                            ++v7;
                        }

                        v15.ad[v1] = v10;
                        goto label_187;
                    }
                }

                String v4_2 = arg14.bn(-13);
                v5 = arg14.bn(103);
                int v3 = 1 == v2_1 ? arg14.ac(99) : 0;
                v15.ae[v1] = v2_1;
                v15.ap[v1] = v3;
                if(ab.an(v4_2, -54).getClassLoader() != null) {
                    v15.an[v1] = ab.an(v4_2, 16).getDeclaredField(v5);
                    goto label_187;
                }

                throw new SecurityException();
            }
            catch(Throwable ) {
                v15.ar[v1] = 736847052;
            }
            catch(Exception ) {
                v15.ar[v1] = 0x11CA1498;
            }
            catch(NullPointerException ) {
                v15.ar[v1] = 0x385CE7D2;
            }
            catch(SecurityException ) {
                v15.ar[v1] = -1579915107;
            }
            catch(ClassNotFoundException ) {
                v15.ar[v1] = -1;
            }

        label_187:
        }

        oj.ax.al(((mx)v15));
    }

    public static void av(lo arg16) {
        int v6;
        int v13;
        lo v0 = arg16;
        mx v1 = oj.ax.an();
        if(v1 == null) {
            return;
        }

        int v2 = v0.ar * 0xF24F550B;
        int v3 = 0x79EF67B1;
        v0.aj(((ow)v1).ax * 0x9F00CF55, v3);
        int v5 = 0;
        while(v5 < ((ow)v1).al * -1490920515) {
            if(((ow)v1).ar[v5] != 0) {
                v0.ar(((ow)v1).ar[v5], 109);
                goto label_168;
            }

            try {
                int v8 = ((ow)v1).ae[v5];
                int v9 = 2;
                byte v10 = 4;
                Object v11 = null;
                if(v8 == 0) {
                    v13 = ((ow)v1).an[v5].getInt(v11);
                    v0.ar(0, 46);
                    v0.aj(v13, v3);
                }
                else if(1 == v8) {
                    ((ow)v1).an[v5].setInt(v11, ((ow)v1).ap[v5]);
                    v0.ar(0, v10);
                }
                else if(v9 == v8) {
                    v13 = ((ow)v1).an[v5].getModifiers();
                    v0.ar(0, 0x72);
                    v0.aj(v13, v3);
                }

                if(3 == v8) {
                    Method v8_1 = ((ow)v1).aj[v5];
                    byte[][] v13_1 = ((ow)v1).ad[v5];
                    Object[] v14 = new Object[v13_1.length];
                    int v15;
                    for(v15 = 0; v15 < v13_1.length; ++v15) {
                        v14[v15] = new ObjectInputStream(new ByteArrayInputStream(v13_1[v15])).readObject();
                    }

                    Object v3_1 = v8_1.invoke(v11, v14);
                    if(v3_1 == null) {
                        v0.ar(0, 71);
                        goto label_168;
                    }

                    if((v3_1 instanceof Number)) {
                        v0.ar(1, 13);
                        v0.aq(((Number)v3_1).longValue());
                        goto label_168;
                    }

                    if((v3_1 instanceof String)) {
                        v0.ar(v9, 84);
                        v0.ai(((String)v3_1), -88);
                        goto label_168;
                    }

                    v0.ar(v10, 106);
                    goto label_168;
                }

                if(v10 != v8) {
                    goto label_168;
                }

                v3 = ((ow)v1).aj[v5].getModifiers();
                v0.ar(0, 0x7C);
                v6 = 0x79EF67B1;
            }
            catch(Throwable ) {
                goto label_110;
            }
            catch(Exception ) {
                goto label_115;
            }
            catch(NullPointerException ) {
                goto label_120;
            }
            catch(IOException ) {
                goto label_125;
            }
            catch(SecurityException ) {
                goto label_130;
            }
            catch(InvocationTargetException ) {
                goto label_135;
            }
            catch(IllegalArgumentException ) {
                goto label_140;
            }
            catch(IllegalAccessException ) {
                goto label_145;
            }
            catch(OptionalDataException ) {
                goto label_150;
            }
            catch(StreamCorruptedException ) {
                goto label_155;
            }
            catch(InvalidClassException ) {
                goto label_160;
            }
            catch(ClassNotFoundException ) {
                goto label_165;
            }

            try {
                v0.aj(v3, v6);
            }
            catch(Throwable ) {
            label_110:
                v0.ar(-21, 94);
            }
            catch(Exception ) {
            label_115:
                v0.ar(-20, 50);
            }
            catch(NullPointerException ) {
            label_120:
                v0.ar(-19, 0x79);
            }
            catch(IOException ) {
            label_125:
                v0.ar(-18, 100);
            }
            catch(SecurityException ) {
            label_130:
                v0.ar(-17, 0x79);
            }
            catch(InvocationTargetException ) {
            label_135:
                v0.ar(-16, 50);
            }
            catch(IllegalArgumentException ) {
            label_140:
                v0.ar(-15, 50);
            }
            catch(IllegalAccessException ) {
            label_145:
                v0.ar(-14, 0x30);
            }
            catch(OptionalDataException ) {
            label_150:
                v0.ar(-13, 8);
            }
            catch(StreamCorruptedException ) {
            label_155:
                v0.ar(-12, 7);
            }
            catch(InvalidClassException ) {
            label_160:
                v0.ar(-11, 23);
            }
            catch(ClassNotFoundException ) {
            label_165:
                v0.ar(-10, 0x73);
            }

        label_168:
            ++v5;
            v3 = 0x79EF67B1;
        }

        v0.bk(v2, 0xE7014907);
        ((ow)v1).lp();
    }

    static Class az(String arg1) throws ClassNotFoundException {
        if(arg1.equals("B")) {
            return Byte.TYPE;
        }

        if(arg1.equals("I")) {
            return Integer.TYPE;
        }

        if(arg1.equals("S")) {
            return Short.TYPE;
        }

        if(arg1.equals("J")) {
            return Long.TYPE;
        }

        if(arg1.equals("Z")) {
            return Boolean.TYPE;
        }

        if(arg1.equals("F")) {
            return Float.TYPE;
        }

        if(arg1.equals("D")) {
            return Double.TYPE;
        }

        if(arg1.equals("C")) {
            return Character.TYPE;
        }

        if(arg1.equals("void")) {
            return Void.TYPE;
        }

        return Class.forName(arg1);
    }
}

