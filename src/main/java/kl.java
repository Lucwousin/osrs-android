public class kl {
    static int[] ax;

    static {
        new Object();
        int v0 = 33;
        kl.ax = new int[v0];
        kl.ax[0] = 0;
        int v1 = 2;
        int v2;
        for(v2 = 1; v2 < v0; ++v2) {
            kl.ax[v2] = v1 - 1;
            v1 += v1;
        }
    }

    kl() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kl.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int aa(int arg1, int arg2) {
        int v0 = arg1 >>> 0x1F;
        return (arg1 + v0) / arg2 - v0;
    }

    public static int ab(int arg1) {
        --arg1;
        arg1 |= arg1 >>> 1;
        arg1 |= arg1 >>> 2;
        arg1 |= arg1 >>> 4;
        arg1 |= arg1 >>> 8;
        return (arg1 | arg1 >>> 16) + 1;
    }

    public static int ad(int arg1, int arg2) {
        if(arg2 > arg1) {
        label_5:
            if(arg1 != 0) {
                arg2 %= arg1;
            }
            else {
                return arg2;
            }
        }

        int v0 = arg2;
        arg2 = arg1;
        arg1 = v0;
        goto label_5;
    }

    public static int af(int arg1) {
        --arg1;
        arg1 |= arg1 >>> 1;
        arg1 |= arg1 >>> 2;
        arg1 |= arg1 >>> 4;
        arg1 |= arg1 >>> 8;
        return (arg1 | arg1 >>> 16) + 1;
    }

    public static int ai(int arg2, int arg3) {
        int v0 = 0;
        while(arg3 > 0) {
            v0 = v0 << 1 | arg2 & 1;
            arg2 >>>= 1;
            --arg3;
        }

        return v0;
    }

    public static int aj(int arg3, int arg4) {
        int v1 = arg3;
        arg3 = 1;
        while(arg4 > 1) {
            if((arg4 & 1) != 0) {
                arg3 *= v1;
            }

            v1 *= v1;
            arg4 >>= 1;
        }

        if(arg4 == 1) {
            arg3 *= v1;
        }

        return arg3;
    }

    public static int aq(int arg1, int arg2) {
        if(arg2 > arg1) {
        label_5:
            if(arg1 != 0) {
                arg2 %= arg1;
            }
            else {
                return arg2;
            }
        }

        int v0 = arg2;
        arg2 = arg1;
        arg1 = v0;
        goto label_5;
    }

    public static int av(int arg1, int arg2) {
        int v0 = arg1 >>> 0x1F;
        return (arg1 + v0) / arg2 - v0;
    }
}

