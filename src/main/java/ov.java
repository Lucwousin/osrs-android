import java.util.Iterator;

public class ov implements Iterator {
    int ae;
    mx al;
    mx ar;
    oc ax;

    ov(oc arg2) {
        super();
        this.ar = null;
        this.ax = arg2;
        this.aq();
    }

    void ab() {
        this.al = this.ax.al[0].gb;
        this.ae = 1;
        this.ar = null;
    }

    public void ad() {
        if(this.ar != null) {
            this.ar.lp();
            this.ar = null;
            return;
        }

        throw new IllegalStateException();
    }

    public boolean ae() {
        if(this.al != this.ax.al[this.ae - 1]) {
            return 1;
        }

        while(this.ae < this.ax.ax) {
            mx[] v0 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            if(v0[v1].gb != this.ax.al[this.ae - 1]) {
                this.al = this.ax.al[this.ae - 1].gb;
                return 1;
            }

            this.al = this.ax.al[this.ae - 1];
        }

        return 0;
    }

    void af() {
        this.al = this.ax.al[0].gb;
        this.ae = 1;
        this.ar = null;
    }

    void ai() {
        this.al = this.ax.al[0].gb;
        this.ae = 1;
        this.ar = null;
    }

    public void aj() {
        if(this.ar != null) {
            this.ar.lp();
            this.ar = null;
            return;
        }

        throw new IllegalStateException();
    }

    public Object al() {
        mx v0;
        if(this.al != this.ax.al[this.ae - 1]) {
            v0 = this.al;
            this.al = v0.gb;
            this.ar = v0;
            return v0;
        }

        do {
            if(this.ae >= this.ax.ax) {
                return null;
            }

            mx[] v0_1 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.ax.al[this.ae - 1]);

        this.al = v0.gb;
        this.ar = v0;
        return v0;
    }

    public boolean an() {
        if(this.al != this.ax.al[this.ae - 1]) {
            return 1;
        }

        while(this.ae < this.ax.ax) {
            mx[] v0 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            if(v0[v1].gb != this.ax.al[this.ae - 1]) {
                this.al = this.ax.al[this.ae - 1].gb;
                return 1;
            }

            this.al = this.ax.al[this.ae - 1];
        }

        return 0;
    }

    public void ap() {
        if(this.ar != null) {
            this.ar.lp();
            this.ar = null;
            return;
        }

        throw new IllegalStateException();
    }

    void aq() {
        this.al = this.ax.al[0].gb;
        this.ae = 1;
        this.ar = null;
    }

    public boolean ar() {
        if(this.al != this.ax.al[this.ae - 1]) {
            return 1;
        }

        while(this.ae < this.ax.ax) {
            mx[] v0 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            if(v0[v1].gb != this.ax.al[this.ae - 1]) {
                this.al = this.ax.al[this.ae - 1].gb;
                return 1;
            }

            this.al = this.ax.al[this.ae - 1];
        }

        return 0;
    }

    void av() {
        this.al = this.ax.al[0].gb;
        this.ae = 1;
        this.ar = null;
    }

    public Object ax() {
        mx v0;
        if(this.al != this.ax.al[this.ae - 1]) {
            v0 = this.al;
            this.al = v0.gb;
            this.ar = v0;
            return v0;
        }

        do {
            if(this.ae >= this.ax.ax) {
                return null;
            }

            mx[] v0_1 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.ax.al[this.ae - 1]);

        this.al = v0.gb;
        this.ar = v0;
        return v0;
    }

    public boolean hasNext() {
        if(this.al != this.ax.al[this.ae - 1]) {
            return 1;
        }

        while(this.ae < this.ax.ax) {
            mx[] v0 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            if(v0[v1].gb != this.ax.al[this.ae - 1]) {
                this.al = this.ax.al[this.ae - 1].gb;
                return 1;
            }

            this.al = this.ax.al[this.ae - 1];
        }

        return 0;
    }

    public Object next() {
        mx v0;
        if(this.al != this.ax.al[this.ae - 1]) {
            v0 = this.al;
            this.al = v0.gb;
            this.ar = v0;
            return v0;
        }

        do {
            if(this.ae >= this.ax.ax) {
                return null;
            }

            mx[] v0_1 = this.ax.al;
            int v1 = this.ae;
            this.ae = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.ax.al[this.ae - 1]);

        this.al = v0.gb;
        this.ar = v0;
        return v0;
    }

    public void remove() {
        if(this.ar != null) {
            this.ar.lp();
            this.ar = null;
            return;
        }

        throw new IllegalStateException();
    }
}

