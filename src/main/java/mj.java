import java.util.Collection;

public class mj {
    int ae;
    final Object[] al;
    final Class ax;
    public static final int bi = 69;

    public mj(Class arg2, int arg3) {
        try {
            super();
            this.ax = arg2;
            this.al = new Object[arg3];
            this.ae = 0;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("mj.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public Object aa() {
        Object v0_1;
        __monitor_enter(this);
        try {
            if(this.ae * 742301271 != 0) {
                goto label_9;
            }

            v0_1 = this.ax(1);
        }
        catch(Throwable v0) {
            goto label_14;
        }

        __monitor_exit(this);
        return v0_1;
    label_9:
        int v0_2 = 0xCFF809B5;
        try {
            v0_1 = this.al(v0_2);
        }
        catch(Throwable v0) {
        label_14:
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    Object ab() {
        Object[] v0 = this.al;
        int v1 = this.ae - 580990321;
        this.ae = v1;
        return v0[v1 * 0xD7C2EB91];
    }

    public static void ad(Collection arg1, int arg2) {
        try {
            arg1.add(dn.al);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("mj.ad(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static int ad(long arg2) {
        return ((int)(arg2 >>> 7 & 0x7F));
    }

    Object ad() {
        Object[] v0 = this.al;
        int v1 = this.ae - 580990321;
        this.ae = v1;
        return v0[v1 * 0xD7C2EB91];
    }

    public Object ae(int arg3) {
        Object v3_2;
        __monitor_enter(this);
        try {
            if(this.ae * 0xD7C2EB91 != 0) {
                goto label_9;
            }

            v3_2 = this.ax(1);
        }
        catch(Throwable v3) {
            goto label_25;
        }
        catch(RuntimeException v3_1) {
            goto label_16;
        }

        __monitor_exit(this);
        return v3_2;
    label_9:
        arg3 = 0x8A1A4DB6;
        try {
            v3_2 = this.al(arg3);
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
            label_16:
                StringBuilder v0 = new StringBuilder();
                v0.append("mj.ae(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
            label_25:
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
        return v3_2;
    }

    Object af() {
        Object[] v0 = this.al;
        int v1 = this.ae - 580990321;
        this.ae = v1;
        return v0[v1 * 0xD7C2EB91];
    }

    public void ag(Object arg4) {
        __monitor_enter(this);
        int v0 = 0x604F4305;
        try {
            if(this.ae * v0 < this.al.length) {
                Object[] v0_1 = this.al;
                int v1 = this.ae + 580990321;
                this.ae = v1;
                v0_1[v1 * -2107540827 - 1] = arg4;
            }
        }
        catch(Throwable v4) {
            __monitor_exit(this);
            throw v4;
        }

        __monitor_exit(this);
    }

    public void ah(Object arg4) {
        __monitor_enter(this);
        int v0 = -1146508405;
        try {
            if(this.ae * v0 < this.al.length) {
                Object[] v0_1 = this.al;
                int v1 = this.ae - 0x1F7DA6F3;
                this.ae = v1;
                v0_1[v1 * 0x9C8AF7C0 - 1] = arg4;
            }
        }
        catch(Throwable v4) {
            __monitor_exit(this);
            throw v4;
        }

        __monitor_exit(this);
    }

    public Object ai() {
        Object v0_1;
        __monitor_enter(this);
        try {
            if(this.ae * -500854205 != 0) {
                goto label_9;
            }

            v0_1 = this.ax(1);
        }
        catch(Throwable v0) {
            goto label_14;
        }

        __monitor_exit(this);
        return v0_1;
    label_9:
        int v0_2 = 0xB2A2B723;
        try {
            v0_1 = this.al(v0_2);
        }
        catch(Throwable v0) {
        label_14:
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    Object aj() {
        try {
            return this.ax.newInstance();
        }
        catch(IllegalAccessException ) {
            throw new RuntimeException();
        }
    }

    Object al(int arg3) {
        try {
            Object[] v3_1 = this.al;
            int v0 = this.ae - 580990321;
            this.ae = v0;
            return v3_1[v0 * 0xD7C2EB91];
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("mj.al(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void am(Object arg5) {
        __monitor_enter(this);
        try {
            int v1 = 0xD7C2EB91;
            if(this.ae * v1 < this.al.length) {
                Object[] v0 = this.al;
                int v2 = this.ae + 580990321;
                this.ae = v2;
                v0[v2 * v1 - 1] = arg5;
            }
        }
        catch(Throwable v5) {
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    Object an() {
        try {
            return this.ax.newInstance();
        }
        catch(IllegalAccessException ) {
            throw new RuntimeException();
        }
    }

    Object ap() {
        try {
            return this.ax.newInstance();
        }
        catch(IllegalAccessException ) {
            throw new RuntimeException();
        }
    }

    Object aq() {
        Object[] v0 = this.al;
        int v1 = this.ae + 0x66DA2078;
        this.ae = v1;
        return v0[v1 * 0x21969980];
    }

    public void ar(Object arg4, int arg5) {
        __monitor_enter(this);
        try {
            int v0 = 0xD7C2EB91;
            if(this.ae * v0 < this.al.length) {
                Object[] v5 = this.al;
                int v1 = this.ae + 580990321;
                this.ae = v1;
                v5[v1 * v0 - 1] = arg4;
            }
        }
        catch(Throwable v4) {
        }
        catch(RuntimeException v4_1) {
            try {
                StringBuilder v5_1 = new StringBuilder();
                v5_1.append("mj.ar(");
                v5_1.append(')');
                throw lx.al(((Throwable)v4_1), v5_1.toString());
            }
            catch(Throwable v4) {
                __monitor_exit(this);
                throw v4;
            }
        }

        __monitor_exit(this);
    }

    public void au(Object arg5) {
        __monitor_enter(this);
        try {
            int v1 = 0xD7C2EB91;
            if(this.ae * v1 < this.al.length) {
                Object[] v0 = this.al;
                int v2 = this.ae + 580990321;
                this.ae = v2;
                v0[v2 * v1 - 1] = arg5;
            }
        }
        catch(Throwable v5) {
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }

    public Object av() {
        Object v0_1;
        __monitor_enter(this);
        try {
            if(this.ae * 0xD7C2EB91 != 0) {
                goto label_9;
            }

            v0_1 = this.ax(1);
        }
        catch(Throwable v0) {
            goto label_14;
        }

        __monitor_exit(this);
        return v0_1;
    label_9:
        int v0_2 = -861821202;
        try {
            v0_1 = this.al(v0_2);
        }
        catch(Throwable v0) {
        label_14:
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    Object ax(byte arg3) {
        try {
            return this.ax.newInstance();
        }
        catch(RuntimeException v3) {
        }
        catch(IllegalAccessException ) {
            try {
                throw new RuntimeException();
            }
            catch(RuntimeException v3) {
                StringBuilder v0 = new StringBuilder();
                v0.append("mj.ax(");
                v0.append(')');
                throw lx.al(((Throwable)v3), v0.toString());
            }
        }
    }

    public void az(Object arg5) {
        __monitor_enter(this);
        try {
            int v1 = 0xD7C2EB91;
            if(this.ae * v1 < this.al.length) {
                Object[] v0 = this.al;
                int v2 = this.ae + 580990321;
                this.ae = v2;
                v0[v2 * v1 - 1] = arg5;
            }
        }
        catch(Throwable v5) {
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
    }
}

