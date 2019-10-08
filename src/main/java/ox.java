public class ox implements lh {
    public static final int ab = 2;
    static final int ad = 2;
    static final ox ae = null;
    static es ag = null;
    static final int ai = 3500;
    final oq aj;
    static final ox al = null;
    public final int an;
    final Class ap;
    final int ar;
    static final ox ax = null;
    static final int bj = 8;
    public static final int cs = 88;
    static final int dw = 106;
    static cj jm = null;
    static final int rw = 3;

    static {
        ox.ax = new ox(1, 0, Integer.class, new ou());
        ox.al = new ox(2, 1, Long.class, new om());
        ox.ae = new ox(0, 2, String.class, new oy());
    }

    ox(int arg2, int arg3, Class arg4, oq arg5) {
        try {
            super();
            this.ar = arg2 * 0xAD076923;
            this.an = arg3 * 0xD23FB031;
            this.ap = arg4;
            this.aj = arg5;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ox.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void aa(Object arg2, lq arg3) {
        ox.ap(arg2.getClass(), 2).ax(arg2, arg3, -48);
    }

    public static ox ab(Class arg4) {
        ox[] v0 = ox.al(1);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            ox v2 = v0[v1];
            if(v2.ap == arg4) {
                return v2;
            }
        }

        return null;
    }

    static ih ad(int arg2) {
        try {
            ih.aj = 0;
            return ev.aq(9);
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ox.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static ox[] ad() {
        return new ox[]{ox.ax, ox.al, ox.ae};
    }

    public static ox ae(Class arg3, int arg4) {
        ox v1;
        int v0;
        try {
            ox[] v4 = ox.al(1);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= v4.length) {
                    return null;
                }

                v1 = v4[v0];
                if(v1.ap != arg3) {
                    goto label_9;
                }

                return v1;
            }
        }
        catch(RuntimeException v3) {
            goto label_15;
        }

        return v1;
    label_9:
        ++v0;
        goto label_3;
        return null;
    label_15:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("ox.ae(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    public static void af(Object arg2, lq arg3) {
        ox.ap(arg2.getClass(), 2).ax(arg2, arg3, -5);
    }

    public static void ai(Object arg2, lq arg3) {
        ox.ap(arg2.getClass(), 2).ax(arg2, arg3, -84);
    }

    public Object aj(lq arg2, int arg3) {
        try {
            return this.aj.al(arg2, 0xFF00);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ox.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static ox[] al(byte arg2) {
        int v2 = 3;
        try {
            ox[] v2_2 = new ox[v2];
            v2_2[0] = ox.ax;
            v2_2[1] = ox.al;
            v2_2[2] = ox.ae;
            return v2_2;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ox.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    public Object am(lq arg3) {
        return this.aj.al(arg3, 0xFF00);
    }

    public static void an(Object arg1, lq arg2, short arg3) {
        try {
            ox.ap(arg1.getClass(), 2).ax(arg1, arg2, -89);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ox.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static oq ap(Class arg1, byte arg2) {
        int v2 = -708136080;
        try {
            ox v1_1 = ox.ae(arg1, v2);
            if(v1_1 != null) {
                return v1_1.aj;
            }

            throw new IllegalArgumentException();
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ox.ap(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    public static ox aq(Class arg4) {
        ox[] v0 = ox.al(1);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            ox v2 = v0[v1];
            if(v2.ap == arg4) {
                return v2;
            }
        }

        return null;
    }

    public int ar() {
        return this.an * 0xE2D2F7E5;
    }

    static oq au(Class arg1) {
        ox v1 = ox.ae(arg1, -493653081);
        if(v1 != null) {
            return v1.aj;
        }

        throw new IllegalArgumentException();
    }

    public static void av(Object arg2, lq arg3) {
        ox.ap(arg2.getClass(), 2).ax(arg2, arg3, 40);
    }

    public int ax(int arg3) {
        try {
            return this.an * 0xE531A8D1;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ox.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

