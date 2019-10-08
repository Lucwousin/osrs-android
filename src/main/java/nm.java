import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nm {
    public static Comparator ae = null;
    public static final int aj = 6;
    public static Comparator al = null;
    public static Comparator an = null;
    public static Comparator ar = null;
    public final List ax;
    public static final int bd = 33;

    static {
        nm.al = new nx();
        new nh();
        nm.ae = new nv();
        nm.ar = new nt();
        nm.an = new nz();
    }

    public nm(lq arg6, boolean arg7) {
        try {
            super();
            int v7 = arg6.ao(-1706706067);
            int v1 = 0;
            byte v2 = 1;
            int v0 = arg6.ay(-59) == 1 ? 1 : 0;
            if(v0 != 0) {
            }
            else {
                v2 = 0;
            }

            v0 = arg6.ao(0xF713FBF9);
            this.ax = new ArrayList(v0);
            while(v1 < v0) {
                this.ax.add(new nu(arg6, v2, v7));
                ++v1;
            }
        }
        catch(RuntimeException v6) {
            goto label_29;
        }

        return;
    label_29:
        StringBuilder v7_1 = new StringBuilder();
        v7_1.append("nm.<init>(");
        v7_1.append(')');
        throw lx.al(((Throwable)v6), v7_1.toString());
    }

    public void ae(Comparator arg1, boolean arg2) {
        if(arg2) {
            Collections.sort(this.ax, arg1);
        }
        else {
            Collections.sort(this.ax, Collections.reverseOrder(arg1));
        }
    }

    public void al(Comparator arg1, boolean arg2) {
        if(arg2) {
            Collections.sort(this.ax, arg1);
        }
        else {
            Collections.sort(this.ax, Collections.reverseOrder(arg1));
        }
    }

    public void an(Comparator arg1, boolean arg2) {
        if(arg2) {
            Collections.sort(this.ax, arg1);
        }
        else {
            Collections.sort(this.ax, Collections.reverseOrder(arg1));
        }
    }

    public void ar(Comparator arg1, boolean arg2) {
        if(arg2) {
            Collections.sort(this.ax, arg1);
        }
        else {
            Collections.sort(this.ax, Collections.reverseOrder(arg1));
        }
    }

    public void ax(Comparator arg1, boolean arg2, int arg3) {
        if(arg2) {
            try {
                Collections.sort(this.ax, arg1);
                return;
            label_4:
                Collections.sort(this.ax, Collections.reverseOrder(arg1));
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("nm.ax(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
        else {
            goto label_4;
        }
    }
}

