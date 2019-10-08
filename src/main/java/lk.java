import java.util.HashMap;

public class lk {
    static int[] an;

    static {
        new HashMap();
    }

    lk() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lk.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static lh ae(lh[] arg3, int arg4) {
        int v0;
        for(v0 = 0; v0 < arg3.length; ++v0) {
            lh v1 = arg3[v0];
            if(arg4 == v1.ax(0xD500F8)) {
                return v1;
            }
        }

        return null;
    }

    public static lh al(lh[] arg3, int arg4) {
        int v0;
        for(v0 = 0; v0 < arg3.length; ++v0) {
            lh v1 = arg3[v0];
            if(arg4 == v1.ax(865682470)) {
                return v1;
            }
        }

        return null;
    }

    public static lh ar(lh[] arg3, int arg4) {
        int v0;
        for(v0 = 0; v0 < arg3.length; ++v0) {
            lh v1 = arg3[v0];
            if(arg4 == v1.ax(0xC6BFBC32)) {
                return v1;
            }
        }

        return null;
    }

    static String ax(int arg1, byte arg2) {
        try {
            return "<img=" + arg1 + ">";
        }
        catch(RuntimeException v1) {
            v2 = new StringBuilder();
            v2.append("lk.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

