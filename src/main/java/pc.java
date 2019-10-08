public class pc {
    pc() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("pc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ae(String[] arg3, short[] arg4) {
        gn.al(arg3, arg4, 0, arg3.length - 1, 0xED0ACE34);
    }

    static void aj(String[] arg6, short[] arg7, int arg8, int arg9) {
        if(arg8 < arg9) {
            int v0 = (arg8 + arg9) / 2;
            String v1 = arg6[v0];
            arg6[v0] = arg6[arg9];
            arg6[arg9] = v1;
            short v2 = arg7[v0];
            arg7[v0] = arg7[arg9];
            arg7[arg9] = v2;
            v0 = arg8;
            int v3 = v0;
            while(v0 < arg9) {
                if(v1 == null || arg6[v0] != null && arg6[v0].compareTo(v1) < (v0 & 1)) {
                    String v4 = arg6[v0];
                    arg6[v0] = arg6[v3];
                    arg6[v3] = v4;
                    short v4_1 = arg7[v0];
                    arg7[v0] = arg7[v3];
                    arg7[v3] = v4_1;
                    ++v3;
                }

                ++v0;
            }

            arg6[arg9] = arg6[v3];
            arg6[v3] = v1;
            arg7[arg9] = arg7[v3];
            arg7[v3] = v2;
            gn.al(arg6, arg7, arg8, v3 - 1, 0xED0ACE34);
            gn.al(arg6, arg7, v3 + 1, arg9, 0xED0ACE34);
        }
    }

    public static void an(String[] arg3, short[] arg4) {
        gn.al(arg3, arg4, 0, arg3.length - 1, 0xED0ACE34);
    }

    static void ap(String[] arg6, short[] arg7, int arg8, int arg9) {
        if(arg8 < arg9) {
            int v0 = (arg8 + arg9) / 2;
            String v1 = arg6[v0];
            arg6[v0] = arg6[arg9];
            arg6[arg9] = v1;
            short v2 = arg7[v0];
            arg7[v0] = arg7[arg9];
            arg7[arg9] = v2;
            v0 = arg8;
            int v3 = v0;
            while(v0 < arg9) {
                if(v1 == null || arg6[v0] != null && arg6[v0].compareTo(v1) < (v0 & 1)) {
                    String v4 = arg6[v0];
                    arg6[v0] = arg6[v3];
                    arg6[v3] = v4;
                    short v4_1 = arg7[v0];
                    arg7[v0] = arg7[v3];
                    arg7[v3] = v4_1;
                    ++v3;
                }

                ++v0;
            }

            arg6[arg9] = arg6[v3];
            arg6[v3] = v1;
            arg7[arg9] = arg7[v3];
            arg7[v3] = v2;
            gn.al(arg6, arg7, arg8, v3 - 1, 0xED0ACE34);
            gn.al(arg6, arg7, v3 + 1, arg9, 0xED0ACE34);
        }
    }

    public static void ar(String[] arg3, short[] arg4) {
        gn.al(arg3, arg4, 0, arg3.length - 1, 0xED0ACE34);
    }
}

