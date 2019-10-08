public class aq {
    public static final short[] ae = null;
    public static final short[][] al = null;
    public static final short[][] ar = null;
    public static final short[] ax = null;
    public static final String az = "name";
    public static final int ct = 98;
    static int hk;

    static {
        aq.ax = new short[]{6798, 8741, 0x6296, 4626, 4550};
        aq.al = new short[][]{new short[]{6798, 107, 10283, 16, 4797, 0x1E40, 5799, 4634, -31839, 0x57A1, 0xBA7, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 0x7112, -15701, -14010}, new short[]{8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 0x12AF, 0x53D, 0x40C2, -30533, 0x6297, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 0x7112, -15701, -14010}, new short[]{0x6296, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 0x12AF, 0x53D, 0x40C2, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 0x7112, -15701, -14010}, new short[]{4626, 0x2B8A, 6439, 12, 4758, 10270}, new short[]{4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 0x7F, -31821, -17991}};
        aq.ae = new short[]{-10304, 9104, -1, -1, -1};
        aq.ar = new short[][]{new short[]{6554, 0x73, 10304, 28, 5702, 7756, 5681, 4510, -31835, 0x57A5, 0xB2B, -11339, 16, 5157, 10446, 0xE4A, -27314, -21965, 472, 580, 0x310, 0x55CE, 28950, -15697, -14002}, new short[]{9104, 10275, 7595, 3610, 0x1F27, 8526, 918, -26734, 0x5F92, 10145, -6882, 5027, 0x5B1, 0x40B5, -30545, 0x638E, 24, 0x1510, 10429, 0xE59, -27335, -21957, 0xC0, 0x2AF, 412, 0x553D, 0x70A3, -15460, -14019}, new short[0], new short[0], new short[0]};
    }

    aq() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("aq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void aa(String arg3, int arg4) {
        try {
            na v4 = cd.al(nf.cv, client.eh.an, 0x80EAAB02);
            v4.ae.ar(ki.af(arg3, 71), 0x7F);
            v4.ae.ai(arg3, -85);
            client.eh.ae(v4, 2077404451);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("aq.aa(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public static boolean ae(long arg2) {
        boolean v2_1;
        if(arg2 != 0) {
            try {
                if(cp.af(arg2)) {
                    goto label_16;
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("aq.ae(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }

            v2_1 = true;
        }
        else {
        label_16:
            v2_1 = false;
        }

        return v2_1;
    }

    static boolean ae(int arg1, int arg2) {
        if(arg1 == 4 && arg2 >= 8) {
            return 0;
        }

        return 1;
    }

    static char al(char arg1, byte arg2) {
        if(arg1 != 0xB5) {
            if(402 == arg1) {
            }
            else {
                try {
                    return Character.toTitleCase(arg1);
                }
                catch(RuntimeException v1) {
                    StringBuilder v2 = new StringBuilder();
                    v2.append("aq.al(");
                    v2.append(')');
                    throw lx.al(((Throwable)v1), v2.toString());
                }
            }
        }

        return arg1;
    }

    static boolean al(int arg1, int arg2) {
        if(arg1 == 4 && arg2 >= 8) {
            return 0;
        }

        return 1;
    }

    static boolean an(int arg1, int arg2) {
        if(arg1 == 4 && arg2 >= 8) {
            return 0;
        }

        return 1;
    }

    static boolean ar(int arg1, int arg2) {
        if(arg1 == 4 && arg2 >= 8) {
            return 0;
        }

        return 1;
    }
}

