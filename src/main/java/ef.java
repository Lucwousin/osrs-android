public final class ef extends mv {
    public int ad;
    public int ae;
    public int aj;
    public int[] al;
    public int an;
    public int ap;
    public int ar;
    public byte[] ax;

    ef() {
        super();
    }

    public void ae() {
        if(this.ae == this.aj && this.ar == this.ad) {
            return;
        }

        byte[] v0 = new byte[this.aj * this.ad];
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < this.ar; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.ae) {
                v0[this.an + v3 + (this.ap + v2) * this.aj] = this.ax[v4];
                ++v3;
                ++v4;
            }

            ++v2;
        }

        this.ax = v0;
        this.ae = this.aj;
        this.ar = this.ad;
        this.an = 0;
        this.ap = 0;
    }

    public void al(int arg7, int arg8, int arg9) {
        int v1;
        for(v1 = 0; v1 < this.al.length; ++v1) {
            int v3 = 0xFF;
            int v2 = (this.al[v1] >> 16 & v3) + arg7;
            if(v2 < 0) {
                v2 = 0;
            }
            else if(v2 > v3) {
                v2 = 0xFF;
            }

            int v4 = (this.al[v1] >> 8 & v3) + arg8;
            if(v4 < 0) {
                v4 = 0;
            }
            else if(v4 > v3) {
                v4 = 0xFF;
            }

            int v5 = (this.al[v1] & v3) + arg9;
            if(v5 < 0) {
                v3 = 0;
            }
            else if(v5 > v3) {
            }
            else {
                v3 = v5;
            }

            this.al[v1] = (v2 << 16) + (v4 << 8) + v3;
        }
    }

    public void an(int arg7, int arg8, int arg9) {
        int v1;
        for(v1 = 0; v1 < this.al.length; ++v1) {
            int v3 = 0xFF;
            int v2 = (this.al[v1] >> 16 & v3) + arg7;
            if(v2 < 0) {
                v2 = 0;
            }
            else if(v2 > v3) {
                v2 = 0xFF;
            }

            int v4 = (this.al[v1] >> 8 & v3) + arg8;
            if(v4 < 0) {
                v4 = 0;
            }
            else if(v4 > v3) {
                v4 = 0xFF;
            }

            int v5 = (this.al[v1] & v3) + arg9;
            if(v5 < 0) {
                v3 = 0;
            }
            else if(v5 > v3) {
            }
            else {
                v3 = v5;
            }

            this.al[v1] = (v2 << 16) + (v4 << 8) + v3;
        }
    }

    public void ap(int arg7, int arg8, int arg9) {
        int v1;
        for(v1 = 0; v1 < this.al.length; ++v1) {
            int v3 = 0xFF;
            int v2 = (this.al[v1] >> 16 & v3) + arg7;
            if(v2 < 0) {
                v2 = 0;
            }
            else if(v2 > v3) {
                v2 = 0xFF;
            }

            int v4 = (this.al[v1] >> 8 & v3) + arg8;
            if(v4 < 0) {
                v4 = 0;
            }
            else if(v4 > v3) {
                v4 = 0xFF;
            }

            int v5 = (this.al[v1] & v3) + arg9;
            if(v5 < 0) {
                v3 = 0;
            }
            else if(v5 > v3) {
            }
            else {
                v3 = v5;
            }

            this.al[v1] = (v2 << 16) + (v4 << 8) + v3;
        }
    }

    public void ar(int arg7, int arg8, int arg9) {
        int v1;
        for(v1 = 0; v1 < this.al.length; ++v1) {
            int v3 = 0xFF;
            int v2 = (this.al[v1] >> 16 & v3) + arg7;
            if(v2 < 0) {
                v2 = 0;
            }
            else if(v2 > v3) {
                v2 = 0xFF;
            }

            int v4 = (this.al[v1] >> 8 & v3) + arg8;
            if(v4 < 0) {
                v4 = 0;
            }
            else if(v4 > v3) {
                v4 = 0xFF;
            }

            int v5 = (this.al[v1] & v3) + arg9;
            if(v5 < 0) {
                v3 = 0;
            }
            else if(v5 > v3) {
            }
            else {
                v3 = v5;
            }

            this.al[v1] = (v2 << 16) + (v4 << 8) + v3;
        }
    }

    public void ax() {
        if(this.ae == this.aj && this.ar == this.ad) {
            return;
        }

        byte[] v0 = new byte[this.aj * this.ad];
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < this.ar; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.ae) {
                v0[this.an + v3 + (this.ap + v2) * this.aj] = this.ax[v4];
                ++v3;
                ++v4;
            }

            ++v2;
        }

        this.ax = v0;
        this.ae = this.aj;
        this.ar = this.ad;
        this.an = 0;
        this.ap = 0;
    }
}

