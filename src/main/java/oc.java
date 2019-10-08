import java.util.Iterator;

public final class oc implements Iterable {
    mx ae;
    mx[] al;
    int an;
    mx ar;
    int ax;

    public oc(int arg4) {
        // Method was not decompiled
    }

    public void aa() {
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            mx v1 = this.al[v0];
            while(true) {
                mx v2 = v1.gb;
                if(v2 == v1) {
                    break;
                }

                v2.lp();
            }
        }

        this.ae = null;
        this.ar = null;
    }

    public void ab(mx arg4, long arg5) {
        if(arg4.gy != null) {
            arg4.lp();
        }

        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg5))];
        arg4.gy = v0.gy;
        arg4.gb = v0;
        arg4.gy.gb = arg4;
        arg4.gb.gy = arg4;
        arg4.gx = arg5;
    }

    public void ad(mx arg4, long arg5) {
        if(arg4.gy != null) {
            arg4.lp();
        }

        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg5))];
        arg4.gy = v0.gy;
        arg4.gb = v0;
        arg4.gy.gb = arg4;
        arg4.gb.gy = arg4;
        arg4.gx = arg5;
    }

    public void ae() {
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            mx v1 = this.al[v0];
            while(true) {
                mx v2 = v1.gb;
                if(v2 == v1) {
                    break;
                }

                v2.lp();
            }
        }

        this.ae = null;
        this.ar = null;
    }

    public void af(mx arg4, long arg5) {
        if(arg4.gy != null) {
            arg4.lp();
        }

        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg5))];
        arg4.gy = v0.gy;
        arg4.gb = v0;
        arg4.gy.gb = arg4;
        arg4.gb.gy = arg4;
        arg4.gx = arg5;
    }

    public mx ag() {
        mx v0;
        if(this.an > 0 && this.ar != this.al[this.an - 1]) {
            v0 = this.ar;
            this.ar = v0.gb;
            return v0;
        }

        do {
            if(this.an >= this.ax) {
                return null;
            }

            mx[] v0_1 = this.al;
            int v1 = this.an;
            this.an = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.al[this.an - 1]);

        this.ar = v0.gb;
        return v0;
    }

    public mx ah() {
        mx v0;
        if(this.an > 0 && this.ar != this.al[this.an - 1]) {
            v0 = this.ar;
            this.ar = v0.gb;
            return v0;
        }

        do {
            if(this.an >= this.ax) {
                return null;
            }

            mx[] v0_1 = this.al;
            int v1 = this.an;
            this.an = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.al[this.an - 1]);

        this.ar = v0.gb;
        return v0;
    }

    public void ai() {
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            mx v1 = this.al[v0];
            while(true) {
                mx v2 = v1.gb;
                if(v2 == v1) {
                    break;
                }

                v2.lp();
            }
        }

        this.ae = null;
        this.ar = null;
    }

    public mx aj(long arg4) {
        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg4))];
        this.ae = v0.gb;
        while(this.ae != v0) {
            if(this.ae.gx == arg4) {
                mx v4 = this.ae;
                this.ae = this.ae.gb;
                return v4;
            }

            this.ae = this.ae.gb;
        }

        this.ae = null;
        return null;
    }

    public void al(mx arg4, long arg5) {
        if(arg4.gy != null) {
            arg4.lp();
        }

        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg5))];
        arg4.gy = v0.gy;
        arg4.gb = v0;
        arg4.gy.gb = arg4;
        arg4.gb.gy = arg4;
        arg4.gx = arg5;
    }

    public mx am() {
        this.an = 0;
        return this.an();
    }

    public mx an() {
        mx v0;
        if(this.an > 0 && this.ar != this.al[this.an - 1]) {
            v0 = this.ar;
            this.ar = v0.gb;
            return v0;
        }

        do {
            if(this.an >= this.ax) {
                return null;
            }

            mx[] v0_1 = this.al;
            int v1 = this.an;
            this.an = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.al[this.an - 1]);

        this.ar = v0.gb;
        return v0;
    }

    public mx ap(long arg4) {
        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg4))];
        this.ae = v0.gb;
        while(this.ae != v0) {
            if(this.ae.gx == arg4) {
                mx v4 = this.ae;
                this.ae = this.ae.gb;
                return v4;
            }

            this.ae = this.ae.gb;
        }

        this.ae = null;
        return null;
    }

    public void aq(mx arg4, long arg5) {
        if(arg4.gy != null) {
            arg4.lp();
        }

        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg5))];
        arg4.gy = v0.gy;
        arg4.gb = v0;
        arg4.gy.gb = arg4;
        arg4.gb.gy = arg4;
        arg4.gx = arg5;
    }

    public mx ar() {
        this.an = 0;
        return this.an();
    }

    public mx au() {
        this.an = 0;
        return this.an();
    }

    public void av() {
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            mx v1 = this.al[v0];
            while(true) {
                mx v2 = v1.gb;
                if(v2 == v1) {
                    break;
                }

                v2.lp();
            }
        }

        this.ae = null;
        this.ar = null;
    }

    public mx ax(long arg4) {
        mx v0 = this.al[((int)((((long)(this.ax - 1))) & arg4))];
        this.ae = v0.gb;
        while(this.ae != v0) {
            if(this.ae.gx == arg4) {
                mx v4 = this.ae;
                this.ae = this.ae.gb;
                return v4;
            }

            this.ae = this.ae.gb;
        }

        this.ae = null;
        return null;
    }

    public mx az() {
        mx v0;
        if(this.an > 0 && this.ar != this.al[this.an - 1]) {
            v0 = this.ar;
            this.ar = v0.gb;
            return v0;
        }

        do {
            if(this.an >= this.ax) {
                return null;
            }

            mx[] v0_1 = this.al;
            int v1 = this.an;
            this.an = v1 + 1;
            v0 = v0_1[v1].gb;
        }
        while(v0 == this.al[this.an - 1]);

        this.ar = v0.gb;
        return v0;
    }

    public Iterator bf() {
        return new ov(this);
    }

    public Iterator bn() {
        return new ov(this);
    }

    public Iterator bp() {
        return new ov(this);
    }

    public Iterator bw() {
        return new ov(this);
    }

    public Iterator iterator() {
        return new ov(this);
    }
}

