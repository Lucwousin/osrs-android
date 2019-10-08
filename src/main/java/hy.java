public class hy implements hf {
    static ko al;

    public hy() {
        super();
    }

    public ht ae() {
        return new hn();
    }

    public ht al() {
        return new hn();
    }

    static int at(int arg4, hl arg5, boolean arg6, int arg7) {
        int v6 = 0x857F658F;
        arg7 = 0x64D7CF4D;
        int v0 = 1304812425;
        int v1 = 0x4A90AB9;
        if(2700 != arg4) {
            goto label_26;
        }

        try {
            int[] v4_1 = il.aj;
            int v5 = il.ad - v1;
            il.ad = v5;
            ar v4_2 = bl.al(v4_1[v5 * v0], arg7);
            int[] v5_1 = il.aj;
            arg7 = il.ad + v1;
            il.ad = arg7;
            v5_1[arg7 * v0 - 1] = v4_2.fq * v6;
            return 1;
        label_26:
            if(2701 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v1;
                il.ad = v5;
                v4_2 = bl.al(v4_1[v5 * v0], arg7);
                if(v4_2.fq * v6 != -1) {
                    v5_1 = il.aj;
                    v6 = il.ad + v1;
                    il.ad = v6;
                    v5_1[v6 * v0 - 1] = v4_2.fp * 0x585B9887;
                }
                else {
                    v4_1 = il.aj;
                    v5 = il.ad + v1;
                    il.ad = v5;
                    v4_1[v5 * v0 - 1] = 0;
                }

                return 1;
            }

            if(2702 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v1;
                il.ad = v5;
                if(client.ky.ax(((long)v4_1[v5 * v0])) != null) {
                    v4_1 = il.aj;
                    v5 = il.ad + v1;
                    il.ad = v5;
                    v4_1[v5 * v0 - 1] = 1;
                }
                else {
                    v4_1 = il.aj;
                    v5 = il.ad + v1;
                    il.ad = v5;
                    v4_1[v5 * v0 - 1] = 0;
                }

                return 1;
            }

            if(arg4 != 2706) {
                return 2;
            }

            v4_1 = il.aj;
            v5 = il.ad + v1;
            il.ad = v5;
            v4_1[v5 * v0 - 1] = client.kt * 0xD233AC37;
            return 1;
        label_25:
        }
        catch(RuntimeException v4) {
            goto label_25;
        }

        StringBuilder v5_2 = new StringBuilder();
        v5_2.append("hy.at(");
        v5_2.append(')');
        throw lx.al(((Throwable)v4), v5_2.toString());
        return 2;
    }

    public ht ax(byte arg3) {
        try {
            return new hn();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hy.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

