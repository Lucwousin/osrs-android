import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class iu implements Callable {
    static final int ar = 0x400;

    iu() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("iu.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static ex[] al(int arg2) {
        arg2 = 3;
        try {
            ex[] v2_1 = new ex[arg2];
            v2_1[0] = ex.ax;
            v2_1[1] = ex.al;
            v2_1[2] = ex.ae;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("iu.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static SecureRandom al() {
        SecureRandom v0 = new SecureRandom();
        v0.nextInt();
        return v0;
    }

    static void ar(int arg4, int arg5, int arg6, do arg7, int arg8, int arg9) {
        try {
            iq v9 = new iq();
            v9.al = arg4 * 0x378CE0B1;
            v9.ae = 0x71DAB880 * arg5;
            v9.ar = 0xCF17E580 * arg6;
            int v0 = 0xB46CA623;
            arg4 = arg7.az * v0;
            int v2 = 0x4B9D7897;
            int v1 = arg7.ag * v2;
            if(arg8 == 1 || 3 == arg8) {
                arg4 = arg7.ag * v2;
                v1 = arg7.az * v0;
            }

            v9.an = (arg4 + arg5) * 0x64903B80;
            v9.ap = (v1 + arg6) * 0xDA792E80;
            v9.ad = arg7.bj * -1017298225;
            v9.aj = arg7.bu * 0x8B5F5380;
            v9.ab = arg7.bs * 0xE1202473;
            v9.af = arg7.be * 0x3DDCE3FF;
            v9.ai = arg7.bl;
            if(arg7.bc != null) {
                v9.au = arg7;
                v9.ae(0x9C77EB09);
            }

            iq.ax.al(((mx)v9));
            if(v9.ai != null) {
                v9.av = (v9.ab * 0xD2ABCE41 + (((int)(Math.random() * (((double)(v9.af * 1919520231 - v9.ab * 0xD2ABCE41))))))) * 0xC9790F0D;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("iu.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    static final int ax(ml arg1, int arg2) {
        arg2 = 12;
        if(arg1 == null) {
            return arg2;
        }

        try {
            if(arg1.ab * 0xCE6266CB == 4) {
                return 20;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("iu.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return arg2;
    }

    public Object call() {
        int v0 = 0xE9AFABB1;
        try {
            return bt.ax(v0);
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("iu.call(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }
}

