import java.util.Hashtable;

public class jt {
    Hashtable ae;
    public Hashtable al;
    public Hashtable ax;
    public static final int ay = 3;

    jt(String arg3) {
        try {
            super();
            this.ax = new Hashtable();
            this.al = new Hashtable();
            this.ae = new Hashtable();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jt.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static od ah(byte[] arg8, byte arg9) {
        if(arg8 == null) {
            return null;
        }

        try {
            od v9 = new od(arg8, fe.ar, lk.an, fe.ap, gu.aj, jw.ad, nq.aq);
            ey.ao(0xE32A2B7D);
            return v9;
        }
        catch(RuntimeException v8) {
            StringBuilder v9_1 = new StringBuilder();
            v9_1.append("jt.ah(");
            v9_1.append(')');
            throw lx.al(((Throwable)v8), v9_1.toString());
        }
    }

    static void ak(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                try {
                    arg5 = arg4[arg5];
                    if(arg5 != 0) {
                        arg8 = arg3[arg7] + arg5;
                        arg6 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0xFF00FF);
                        arg5 = (0x1000100 & arg6) + (arg8 - arg6 & 0x10000);
                        arg3[arg7] = arg5 - (arg5 >>> 8) | arg8 - arg5;
                        ++arg7;
                    }
                    else {
                        goto label_27;
                    }

                    goto label_28;
                }
                catch(RuntimeException v0) {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("jt.ak(");
                    v1.append(')');
                    throw lx.al(((Throwable)v0), v1.toString());
                }

            label_27:
                ++arg7;
            label_28:
                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }
}

