public final class oh {
    mx ae;
    mx[] al;
    int an;
    mx ar;
    int ax;

    public oh(int arg4) {
        // Method was not decompiled
    }

    public mx ab() {
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

    public mx ad() {
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

    public mx ae() {
        this.an = 0;
        return this.ar();
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

    public mx an(long arg4) {
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

    public mx aq() {
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

    public mx ar() {
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
}

