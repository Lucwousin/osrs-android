import java.util.Comparator;

public class jl implements Comparator {
    static final int ad = 5;
    final boolean ax;
    static or fk;

    public jl(boolean arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jl.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((ee)arg2), ((ee)arg3), 35);
    }

    static dl[] al(int arg2) {
        arg2 = 3;
        try {
            dl[] v2_1 = new dl[arg2];
            v2_1[0] = dl.ax;
            v2_1[1] = dl.ae;
            v2_1[2] = dl.al;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jl.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    int al(ee arg3, ee arg4) {
        int v1 = 125406857;
        int v3 = this.ax ? arg3.ap * v1 - arg4.ap * v1 : arg4.ap * v1 - arg3.ap * 0xE7562B71;
        return v3;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((ee)arg2), ((ee)arg3), 101);
    }

    int ax(ee arg2, ee arg3, byte arg4) {
        int v2_1;
        try {
            int v0 = 125406857;
            v2_1 = this.ax ? arg2.ap * v0 - arg3.ap * v0 : arg3.ap * v0 - arg2.ap * v0;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jl.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return v2_1;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((ee)arg2), ((ee)arg3), 27);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jl.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jl.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }
}

