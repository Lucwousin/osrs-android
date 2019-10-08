import java.util.Iterator;

public class fq implements fm {
    static int[] aq;
    static ki cg;
    protected static boolean ut;

    public fq() {
        super();
    }

    public float ae(float arg2) {
        return arg2 * arg2 * arg2;
    }

    public float al(float arg2) {
        return arg2 * arg2 * arg2;
    }

    static void aq(int arg2) {
        try {
            Iterator v2_1 = ic.al.iterator();
            while(v2_1.hasNext()) {
                v2_1.next().an(0x342C5D37);
            }
        }
        catch(RuntimeException v2) {
            goto label_11;
        }

        return;
    label_11:
        StringBuilder v0 = new StringBuilder();
        v0.append("fq.aq(");
        v0.append(')');
        throw lx.al(((Throwable)v2), v0.toString());
    }

    public float ar(float arg2) {
        return arg2 * arg2 * arg2;
    }

    static int au(int arg3, hl arg4, boolean arg5, int arg6) {
        int v5;
        int[] v3_1;
        if(arg5) {
            try {
                ar v4 = il.aa;
                goto label_4;
            label_3:
                v4 = dw.av;
            label_4:
                arg6 = 0x857F658F;
                int v0 = 1304812425;
                int v1 = 0x4A90AB9;
                if(1700 == arg3) {
                    v3_1 = il.aj;
                    v5 = il.ad + v1;
                    il.ad = v5;
                    v3_1[v5 * v0 - 1] = v4.fq * arg6;
                    return 1;
                }

                if(arg3 == 1701) {
                    if(-1 != v4.fq * arg6) {
                        v3_1 = il.aj;
                        v5 = il.ad + v1;
                        il.ad = v5;
                        v3_1[v5 * v0 - 1] = v4.fp * 0x585B9887;
                    }
                    else {
                        v3_1 = il.aj;
                        int v4_1 = il.ad + v1;
                        il.ad = v4_1;
                        v3_1[v4_1 * v0 - 1] = 0;
                    }

                    return 1;
                }

                if(1702 != arg3) {
                    return 2;
                }

                v3_1 = il.aj;
                v5 = il.ad + v1;
                il.ad = v5;
                v3_1[v5 * v0 - 1] = v4.at * 990760021;
                return 1;
            }
            catch(RuntimeException v3) {
                StringBuilder v4_2 = new StringBuilder();
                v4_2.append("fq.au(");
                v4_2.append(')');
                throw lx.al(((Throwable)v3), v4_2.toString());
            }
        }
        else {
            goto label_3;
        }

        goto label_4;
        return 2;
    }

    public float ax(float arg1, byte arg2) {
        return arg1 * arg1 * arg1;
    }

    static final int bk(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 * arg2 - arg1 * arg3 >> 16;
    }
}

