public class ab extends mv {
    public static short[][] ab = null;
    public final int[] ae;
    static int[] af = null;
    public final int al;
    public final int[] ar;
    public static final int av = 13;
    public final int ax;

    ab(int arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        try {
            super();
            this.ax = arg1 * 0x77D300FF;
            this.al = arg2 * 0x6EC61807;
            this.ae = arg3;
            this.ar = arg4;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ab.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean al(int arg3, int arg4) {
        if(arg4 >= 0 && arg4 < this.ar.length) {
            int v0 = this.ar[arg4];
            if(arg3 >= v0 && arg3 <= this.ae[arg4] + v0) {
                return 1;
            }
        }

        return 0;
    }

    static Class an(String arg1, byte arg2) throws ClassNotFoundException {
        try {
            if(arg1.equals("B")) {
                return Byte.TYPE;
            }

            if(arg1.equals("I")) {
                return Integer.TYPE;
            }

            if(arg1.equals("S")) {
                return Short.TYPE;
            }

            if(arg1.equals("J")) {
                return Long.TYPE;
            }

            if(arg1.equals("Z")) {
                return Boolean.TYPE;
            }

            if(arg1.equals("F")) {
                return Float.TYPE;
            }

            if(arg1.equals("D")) {
                return Double.TYPE;
            }

            if(arg1.equals("C")) {
                return Character.TYPE;
            }

            if(arg1.equals("void")) {
                return Void.TYPE;
            }

            return Class.forName(arg1);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ab.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static int an(int arg1, int arg2) {
        try {
            return ft.ap(bc.az[arg1]);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ab.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean ax(int arg2, int arg3, int arg4) {
        if(arg3 >= 0) {
            try {
                if(arg3 < this.ar.length) {
                    arg4 = this.ar[arg3];
                    if(arg2 >= arg4) {
                        if(arg2 > this.ae[arg3] + arg4) {
                            return 0;
                        }

                        return 1;
                    }
                }

                return 0;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ab.ax(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }

            return 1;
        }

        return 0;
    }

    static boolean bt(do arg6, int arg7) {
        try {
            int v1 = 1284025131;
            int v2 = -1;
            if(arg6.bc != null) {
                int[] v6_1 = arg6.bc;
                arg7 = 0;
                while(true) {
                    if(arg7 < v6_1.length) {
                        if(v2 != ok.al(v6_1[arg7], 0x532E97CA).bn * v1) {
                            return 1;
                        }
                        else {
                            ++arg7;
                            continue;
                        }
                    }

                    return 0;
                }
            }
            else {
                if(v2 == arg6.bn * v1) {
                    return 0;
                }

                return 1;
            }

            return 0;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("ab.bt(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        return 1;
    }
}

