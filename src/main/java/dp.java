public final class dp {
    static ko ab = null;
    int ae;
    static final int af = 0x400;
    int al;
    static final int ap = 0xEDB88320;
    int ar;
    static final int at = 20;
    public static String au = null;
    int ax;
    static final int bn = 3;

    dp(cy arg3) {
        try {
            cy.this = arg3;
            super();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dp.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final int ag(int arg1, int arg2, int arg3) {
        arg1 += arg2 * 57;
        arg1 ^= arg1 << 13;
        return (0x7FFFFFFF & (arg1 * arg1 * 0x3D73 + 0xC0AE5) * arg1 + 0x5208DD0D) >> 19 & 0xFF;
    }

    static void gy(ar arg3, int arg4, int arg5, int arg6) {
        arg4 *= -926860441;
        try {
            arg3.bz = arg4;
            arg6 = 0x55D2B057;
            if(arg3.bz * arg6 > arg3.bb * 0x83EA0C19 - arg3.by * 0x1804E4A5) {
                arg3.bz = arg3.bb * 0xAACDA10F - arg3.by * 0x130F0563;
            }

            if(arg3.bz * arg6 < 0) {
                arg3.bz = 0;
            }

            arg3.bh = arg5 * -427350331;
            arg5 = 0x4407680D;
            if(arg3.bh * arg5 > arg3.bc * 1153505113 - arg3.bt * 0x6F0D2CD) {
                arg3.bh = arg3.bc * 0xD7FD2D7D - arg3.bt * 0x6EB7A5C1;
            }

            if(arg3.bh * arg5 < 0) {
                arg3.bh = 0;
            }

            kx.gw(arg3, 0x7FDD0423);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("dp.gy(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

