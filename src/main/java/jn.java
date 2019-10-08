import java.net.URL;

public class jn {
    volatile boolean ae;
    public static final int ah = 19;
    final jd al;
    volatile byte[] ar;
    final URL ax;
    static final int ng = 503;

    jn(URL arg2, jd arg3) {
        try {
            super();
            this.ax = arg2;
            this.al = arg3;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jn.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public byte[] ab() {
        return this.ar;
    }

    public boolean ad() {
        return this.ae;
    }

    public byte[] ae(int arg3) {
        try {
            return this.ar;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jn.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean aj() {
        return this.ae;
    }

    public boolean al(int arg3) {
        try {
            return this.ae;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jn.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void an() {
        this.ae = true;
        if(this.al != null) {
            this.al.ax(this, 77);
        }
    }

    void ap() {
        this.ae = true;
        if(this.al != null) {
            this.al.ax(this, 81);
        }
    }

    public byte[] aq() {
        return this.ar;
    }

    void ar() {
        this.ae = true;
        if(this.al != null) {
            this.al.ax(this, 27);
        }
    }

    void ax(byte arg3) {
        try {
            this.ae = true;
            if(this.al != null) {
                this.al.ax(this, 33);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jn.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

