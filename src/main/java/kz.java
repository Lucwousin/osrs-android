public class kz {
    static final int ah = 0;
    static kx ax = null;
    public static final int cf = 73;
    public static final int cr = 59;

    kz() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static String aa(lq arg9, int arg10) {
        short v0 = 30320;
        try {
            int v0_1 = arg9.by(v0);
            if(v0_1 > arg10) {
            }
            else {
                arg10 = v0_1;
            }

            byte[] v0_2 = new byte[arg10];
            arg9.ar += kz.ax.al(arg9.ae, 0x2028677F * arg9.ar, v0_2, 0, arg10, 0xA7D66466) * -1880437085;
            return df.ap(v0_2, 0, arg10, 0x7A701CAB);
        }
        catch(Exception ) {
            return "Cabbage";
        }
    }

    public static String ab(lq arg2) {
        return hg.ar(arg2, 0x2AC90280, 0x8EC5281B);
    }

    public static int ad(lq arg10, String arg11) {
        int v0 = arg10.ar * 0xF24F550B;
        byte[] v4 = ir.ar(((CharSequence)arg11), -1295903120);
        arg10.ah(v4.length, -2051111049);
        arg10.ar += kz.ax.ax(v4, 0, v4.length, arg10.ae, arg10.ar * 0xF24F550B, 0x798F) * -1880437085;
        return arg10.ar * 0xF24F550B - v0;
    }

    public static String af(lq arg2) {
        return hg.ar(arg2, 0x7FFF, 0xE0D564DF);
    }

    public static String ai(lq arg2) {
        return hg.ar(arg2, 0x7FFF, 0xEF09AFC4);
    }

    public static void aj(kx arg0) {
        kz.ax = arg0;
    }

    public static void an(kx arg0) {
        kz.ax = arg0;
    }

    public static void ap(kx arg0) {
        kz.ax = arg0;
    }

    public static String aq(lq arg2) {
        return hg.ar(arg2, 0x7FFF, 0x98785986);
    }

    static String au(lq arg9, int arg10) {
        short v0 = 7498;
        try {
            int v0_1 = arg9.by(v0);
            if(v0_1 > arg10) {
            }
            else {
                arg10 = v0_1;
            }

            byte[] v0_2 = new byte[arg10];
            arg9.ar += kz.ax.al(arg9.ae, 0xF24F550B * arg9.ar, v0_2, 0, arg10, 0xD7C403EA) * -1880437085;
            return df.ap(v0_2, 0, arg10, 2120427579);
        }
        catch(Exception ) {
            return "Cabbage";
        }
    }

    public static String av(lq arg2) {
        return hg.ar(arg2, -1775099063, 0xF170421E);
    }

    public static int ax(int arg2, int arg3, byte arg4) {
        int v0 = arg2;
        arg2 = 1;
        while(arg3 > 1) {
            if((arg3 & 1) != 0) {
                arg2 *= v0;
            }

            v0 *= v0;
            arg3 >>= 1;
        }

        if(arg3 == 1) {
            return arg2 * v0;
        }

        return arg2;
    }
}

