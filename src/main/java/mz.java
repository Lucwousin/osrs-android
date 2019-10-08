import java.io.IOException;
import java.net.Socket;

public abstract class mz {
    protected mz() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public abstract void aa();

    public abstract boolean ad(int arg1) throws IOException;

    public abstract void af(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract int ag() throws IOException;

    public abstract int ah() throws IOException;

    public abstract void ai();

    public abstract int aj() throws IOException;

    static double al(double arg1, double arg3, double arg5) {
        arg1 = (arg1 - arg3) / arg5;
        try {
            return bi.ax(arg1) / arg5;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("mz.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public abstract int am() throws IOException;

    public abstract void an();

    public abstract boolean ao(int arg1) throws IOException;

    public abstract int ap() throws IOException;

    public abstract int aq(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract int as(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract int at() throws IOException;

    public abstract int au() throws IOException;

    public abstract void av();

    public abstract boolean aw(int arg1) throws IOException;

    public abstract int ay() throws IOException;

    public abstract int az() throws IOException;

    public abstract void ba(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void bd(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void bf(byte[] arg1, int arg2, int arg3) throws IOException;

    static void bn(int[] arg15, int[] arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        int v0 = arg24;
        int v2 = 0xFF - v0;
        int v3 = 0xFF00FF;
        int v5 = 0xFF00FF00;
        int v4 = (arg25 & v3) * v2 & v5;
        int v6 = 0xFF00;
        int v1 = (arg25 & v6) * v2;
        v2 = 0xFF0000;
        v1 = (v1 & v2 | v4) >>> 8;
        v4 = -arg21;
        int v7 = arg18;
        int v8 = arg19;
        while(v4 < 0) {
            int v10 = -arg20;
            while(v10 < 0) {
                int v11 = v7 + 1;
                try {
                    v7 = arg16[v7];
                    if(v7 != 0) {
                        arg15[v8] = (((v7 & v6) * v0 & v2 | (v7 & v3) * v0 & v5) >>> 8) + v1 | 0xFF000000;
                        ++v8;
                    }
                    else {
                        goto label_40;
                    }

                    goto label_41;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("mz.bn(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0_1), v1_1.toString());
                }

            label_40:
                ++v8;
            label_41:
                ++v10;
                v7 = v11;
            }

            v8 += arg22;
            v7 += arg23;
            ++v4;
        }
    }

    public abstract void bn(byte[] arg1, int arg2, int arg3) throws IOException;

    public static mz bo(Socket arg1, int arg2, int arg3) throws IOException {
        return new mp(arg1, arg2, arg3);
    }

    public static mz bw(Socket arg1, int arg2, int arg3) throws IOException {
        return new mp(arg1, arg2, arg3);
    }

    public static mz by(Socket arg1, int arg2, int arg3) throws IOException {
        return new mp(arg1, arg2, arg3);
    }
}

