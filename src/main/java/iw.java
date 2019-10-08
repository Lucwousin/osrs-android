import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class iw extends mx {
    String ab;
    int ad;
    public ar ae;
    int af;
    int ai;
    ar aj;
    boolean al;
    public static final int am = 18;
    int an;
    int ap;
    int aq;
    int ar;
    public Object[] ax;

    public iw() {
        super();
        this.ai = 1530037956;
    }

    public static void ae(lo arg16, int arg17) {
        int v11;
        int v6;
        byte v7;
        int v5;
        int v3;
        int v2;
        mx v1;
        lo v0 = arg16;
        try {
            v1 = oj.ax.an();
            if(v1 == null) {
                return;
            }

            v2 = v0.ar * 0xF24F550B;
            v3 = 0x79EF67B1;
            v0.aj(((ow)v1).ax * 0x9F00CF55, v3);
            v5 = 0;
            while(true) {
            label_15:
                if(v5 >= ((ow)v1).al * -1490920515) {
                    goto label_172;
                }

                v7 = 54;
                if(((ow)v1).ar[v5] == 0) {
                    goto label_28;
                }

                v0.ar(((ow)v1).ar[v5], v7);
                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_178;
        }

        goto label_169;
        try {
        label_28:
            v6 = ((ow)v1).ae[v5];
            Object v8 = null;
            int v9 = 2;
            if(v6 == 0) {
                v11 = ((ow)v1).an[v5].getInt(v8);
                v0.ar(0, 61);
                v0.aj(v11, v3);
            }
            else if(1 == v6) {
                ((ow)v1).an[v5].setInt(v8, ((ow)v1).ap[v5]);
                v0.ar(0, 37);
            }
            else if(v9 == v6) {
                v11 = ((ow)v1).an[v5].getModifiers();
                v0.ar(0, 107);
                v0.aj(v11, v3);
            }

            int v12 = 4;
            if(3 == v6) {
                Method v6_1 = ((ow)v1).aj[v5];
                byte[][] v11_1 = ((ow)v1).ad[v5];
                Object[] v13 = new Object[v11_1.length];
                int v14;
                for(v14 = 0; v14 < v11_1.length; ++v14) {
                    v13[v14] = new ObjectInputStream(new ByteArrayInputStream(v11_1[v14])).readObject();
                }

                Object v3_1 = v6_1.invoke(v8, v13);
                if(v3_1 == null) {
                    v0.ar(0, 9);
                    goto label_169;
                }

                if((v3_1 instanceof Number)) {
                    v0.ar(1, 0x7E);
                    v0.aq(((Number)v3_1).longValue());
                    goto label_169;
                }

                if((v3_1 instanceof String)) {
                    v0.ar(v9, ((byte)v9));
                    v0.ai(((String)v3_1), -123);
                    goto label_169;
                }

                v0.ar(v12, 99);
                goto label_169;
            }

            if(v12 != v6) {
                goto label_169;
            }

            v3 = ((ow)v1).aj[v5].getModifiers();
            v0.ar(0, 75);
            v6 = 0x79EF67B1;
            goto label_108;
        }
        catch(RuntimeException v0_1) {
        }
        catch(Throwable ) {
            goto label_111;
            try {
            label_108:
                v0.aj(v3, v6);
                goto label_169;
            }
            catch(RuntimeException v0_1) {
            }
            catch(Throwable ) {
            label_111:
                v3 = -21;
                v7 = 0x79;
                try {
                    v0.ar(v3, v7);
                label_169:
                    ++v5;
                    v3 = 0x79EF67B1;
                    goto label_15;
                label_172:
                    v0.bk(v2, -640863561);
                    ((ow)v1).lp();
                    return;
                }
                catch(RuntimeException v0_1) {
                label_178:
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("iw.ae(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0_1), v1_1.toString());
                }
            }
            catch(Exception ) {
            }
            catch(NullPointerException ) {
            }
            catch(IOException ) {
            }
            catch(SecurityException ) {
            }
            catch(InvocationTargetException ) {
            }
            catch(IllegalArgumentException ) {
            }
            catch(IllegalAccessException ) {
            }
            catch(OptionalDataException ) {
            }
            catch(StreamCorruptedException ) {
            }
            catch(InvalidClassException ) {
            }
            catch(ClassNotFoundException ) {
                try {
                label_166:
                    v0.ar(-10, 43);
                    goto label_169;
                label_161:
                    v0.ar(-11, 66);
                    goto label_169;
                label_156:
                    v0.ar(-12, 0x70);
                    goto label_169;
                label_151:
                    v0.ar(-13, 54);
                    goto label_169;
                label_146:
                    v0.ar(-14, 14);
                    goto label_169;
                label_141:
                    v0.ar(-15, 11);
                    goto label_169;
                label_136:
                    v0.ar(-16, 0x7F);
                    goto label_169;
                label_131:
                    v0.ar(-17, 91);
                    goto label_169;
                label_126:
                    v0.ar(-18, 93);
                    goto label_169;
                label_121:
                    v0.ar(-19, 16);
                    goto label_169;
                label_116:
                    v0.ar(-20, 89);
                    goto label_169;
                }
                catch(RuntimeException v0_1) {
                    goto label_178;
                }
            }
        }
        catch(Exception ) {
            goto label_116;
        }
        catch(NullPointerException ) {
            goto label_121;
        }
        catch(IOException ) {
            goto label_126;
        }
        catch(SecurityException ) {
            goto label_131;
        }
        catch(InvocationTargetException ) {
            goto label_136;
        }
        catch(IllegalArgumentException ) {
            goto label_141;
        }
        catch(IllegalAccessException ) {
            goto label_146;
        }
        catch(OptionalDataException ) {
            goto label_151;
        }
        catch(StreamCorruptedException ) {
            goto label_156;
        }
        catch(InvalidClassException ) {
            goto label_161;
        }
        catch(ClassNotFoundException ) {
            goto label_166;
        }
    }

    public void ae(Object[] arg1) {
        this.ax = arg1;
    }

    public void al(int arg2, int arg3) {
        arg2 *= -601507925;
        try {
            this.ai = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iw.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void an(int arg2) {
        this.ai = arg2 * 0xDC1F4B84;
    }

    public void ap(int arg2) {
        this.ai = arg2 * -601507925;
    }

    public void ar(Object[] arg1) {
        this.ax = arg1;
    }

    public void ax(Object[] arg2, int arg3) {
        try {
            this.ax = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iw.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void bb(int arg8) {
        try {
            if(client.ei * 0xFFCD19BD <= 0) {
                if(ji.ax(0x2076E2C1) > ij.tq * -4612909882721608049L + 60000) {
                }
                else {
                    client.fa.al(0x5833E6C9);
                    dc.ay(40, -104);
                    client.ec = client.eh.aj(-1243530862);
                    client.eh.ap(1);
                    return;
                }
            }

            ea.bg(-12931);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iw.bb(");
            v0.append(')');
            throw lx.al(((Throwable)v8), v0.toString());
        }
    }
}

