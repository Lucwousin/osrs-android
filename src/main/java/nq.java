import java.nio.ByteBuffer;

public class nq extends nc {
    static byte[][] aq = null;
    ByteBuffer ax;
    public static final int cg = 104;

    nq() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void ad(byte[] arg3) {
        this.ax = ByteBuffer.allocateDirect(arg3.length);
        this.ax.position(0);
        this.ax.put(arg3);
    }

    byte[] ae() {
        byte[] v0 = new byte[this.ax.capacity()];
        this.ax.position(0);
        this.ax.get(v0);
        return v0;
    }

    void aj(byte[] arg3) {
        this.ax = ByteBuffer.allocateDirect(arg3.length);
        this.ax.position(0);
        this.ax.put(arg3);
    }

    void al(byte[] arg2, int arg3) {
        try {
            this.ax = ByteBuffer.allocateDirect(arg2.length);
            this.ax.position(0);
            this.ax.put(arg2);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nq.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    byte[] an() {
        byte[] v0 = new byte[this.ax.capacity()];
        this.ax.position(0);
        this.ax.get(v0);
        return v0;
    }

    byte[] ap() {
        byte[] v0 = new byte[this.ax.capacity()];
        this.ax.position(0);
        this.ax.get(v0);
        return v0;
    }

    void aq(byte[] arg3) {
        this.ax = ByteBuffer.allocateDirect(arg3.length);
        this.ax.position(0);
        this.ax.put(arg3);
    }

    byte[] ar() {
        byte[] v0 = new byte[this.ax.capacity()];
        this.ax.position(0);
        this.ax.get(v0);
        return v0;
    }

    byte[] ax(int arg3) {
        try {
            byte[] v3_1 = new byte[this.ax.capacity()];
            this.ax.position(0);
            this.ax.get(v3_1);
            return v3_1;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("nq.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

