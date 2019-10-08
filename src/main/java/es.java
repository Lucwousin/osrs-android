public final class es extends mv {
    public int ae;
    public int aj;
    public int al;
    int an;
    public int ap;
    public int ar;
    public int[] ax;

    public es(int arg2, int arg3) {
        this(new int[arg2 * arg3], arg2, arg3);
    }

    es() {
        super();
    }

    public es(int[] arg1, int arg2, int arg3) {
        super();
        this.ax = arg1;
        this.ap = arg2;
        this.al = arg2;
        this.aj = arg3;
        this.ae = arg3;
        this.an = 0;
        this.ar = 0;
    }

    public void aa() {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int[] v0 = new int[this.ap * this.aj];
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        this.ax = v0;
        this.al = this.ap;
        this.ae = this.aj;
        this.ar = 0;
        this.an = 0;
    }

    public es ab() {
        es v0 = new es(this.al, this.ae);
        v0.ap = this.ap;
        v0.aj = this.aj;
        v0.ar = this.ap - this.al - this.ar;
        v0.an = this.an;
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[this.al * v2 + v3] = this.ax[this.al * v2 + this.al - 1 - v3];
            }
        }

        return v0;
    }

    public void ac(int arg9) {
        int[] v0 = new int[this.al * this.ae];
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < this.ae; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                int v5 = this.ax[v4];
                if(v5 == 0) {
                    if(v3 <= 0 || this.ax[v4 - 1] == 0) {
                        if(v2 > 0 && this.ax[v4 - this.al] != 0) {
                            goto label_45;
                        }

                        if(v3 < this.al - 1 && this.ax[v4 + 1] != 0) {
                            goto label_45;
                        }

                        if(v2 >= this.ae - 1) {
                            goto label_46;
                        }

                        if(this.ax[this.al + v4] == 0) {
                            goto label_46;
                        }
                    }
                    else {
                    }

                label_45:
                    v5 = arg9;
                }

            label_46:
                v0[v4] = v5;
                ++v3;
                ++v4;
            }

            ++v2;
        }

        this.ax = v0;
    }

    public void ad(int arg8) {
        int v0;
        for(v0 = this.ae - 1; v0 > 0; --v0) {
            int v1 = this.al * v0;
            int v2;
            for(v2 = this.al - 1; v2 > 0; --v2) {
                int v4 = v2 + v1;
                if(this.ax[v4] == 0 && this.ax[v4 - 1 - this.al] != 0) {
                    this.ax[v4] = arg8;
                }
            }
        }
    }

    public void ae() {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int[] v0 = new int[this.ap * this.aj];
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        this.ax = v0;
        this.al = this.ap;
        this.ae = this.aj;
        this.ar = 0;
        this.an = 0;
    }

    public es af() {
        es v0 = new es(this.ap, this.aj);
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        return v0;
    }

    public void ag(int arg11) {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int v0 = arg11 > this.ar ? this.ar : arg11;
        int v1 = this.ar + arg11 + this.al > this.ap ? this.ap - this.ar - this.al : arg11;
        int v2 = arg11 > this.an ? this.an : arg11;
        if(this.an + arg11 + this.ae > this.aj) {
            arg11 = this.aj - this.an - this.ae;
        }

        int v3 = this.al + v0 + v1;
        v1 = this.ae + v2 + arg11;
        int[] v11 = new int[v3 * v1];
        int v5;
        for(v5 = 0; v5 < this.ae; ++v5) {
            int v6;
            for(v6 = 0; v6 < this.al; ++v6) {
                v11[(v5 + v2) * v3 + (v6 + v0)] = this.ax[this.al * v5 + v6];
            }
        }

        this.ax = v11;
        this.al = v3;
        this.ae = v1;
        this.ar -= v0;
        this.an -= v2;
    }

    public void ah(int arg11) {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int v0 = arg11 > this.ar ? this.ar : arg11;
        int v1 = this.ar + arg11 + this.al > this.ap ? this.ap - this.ar - this.al : arg11;
        int v2 = arg11 > this.an ? this.an : arg11;
        if(this.an + arg11 + this.ae > this.aj) {
            arg11 = this.aj - this.an - this.ae;
        }

        int v3 = this.al + v0 + v1;
        v1 = this.ae + v2 + arg11;
        int[] v11 = new int[v3 * v1];
        int v5;
        for(v5 = 0; v5 < this.ae; ++v5) {
            int v6;
            for(v6 = 0; v6 < this.al; ++v6) {
                v11[(v5 + v2) * v3 + (v6 + v0)] = this.ax[this.al * v5 + v6];
            }
        }

        this.ax = v11;
        this.al = v3;
        this.ae = v1;
        this.ar -= v0;
        this.an -= v2;
    }

    public es ai() {
        es v0 = new es(this.ap, this.aj);
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        return v0;
    }

    public void aj(int arg9) {
        int[] v0 = new int[this.al * this.ae];
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < this.ae; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                int v5 = this.ax[v4];
                if(v5 == 0) {
                    if(v3 <= 0 || this.ax[v4 - 1] == 0) {
                        if(v2 > 0 && this.ax[v4 - this.al] != 0) {
                            goto label_45;
                        }

                        if(v3 < this.al - 1 && this.ax[v4 + 1] != 0) {
                            goto label_45;
                        }

                        if(v2 >= this.ae - 1) {
                            goto label_46;
                        }

                        if(this.ax[this.al + v4] == 0) {
                            goto label_46;
                        }
                    }
                    else {
                    }

                label_45:
                    v5 = arg9;
                }

            label_46:
                v0[v4] = v5;
                ++v3;
                ++v4;
            }

            ++v2;
        }

        this.ax = v0;
    }

    public void ak() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = this.ae - 1;
        int v3;
        for(v3 = 0; v1 >= 0; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                v0[v4] = this.ax[this.al * v1 + v3];
                ++v3;
                ++v4;
            }

            --v1;
        }

        this.ax = v0;
        this.an = this.aj - this.ae - this.an;
    }

    public es al() {
        es v0 = new es(this.ap, this.aj);
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        return v0;
    }

    public void am() {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int[] v0 = new int[this.ap * this.aj];
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        this.ax = v0;
        this.al = this.ap;
        this.ae = this.aj;
        this.ar = 0;
        this.an = 0;
    }

    public void an() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.ae) {
            int v3 = this.al - 1;
            while(v3 >= 0) {
                v0[v2] = this.ax[this.al * v1 + v3];
                --v3;
                ++v2;
            }

            ++v1;
        }

        this.ax = v0;
        this.ar = this.ap - this.al - this.ar;
    }

    public void ao() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = this.ae - 1;
        int v3;
        for(v3 = 0; v1 >= 0; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                v0[v4] = this.ax[this.al * v1 + v3];
                ++v3;
                ++v4;
            }

            --v1;
        }

        this.ax = v0;
        this.an = this.aj - this.ae - this.an;
    }

    public void ap() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = this.ae - 1;
        int v3;
        for(v3 = 0; v1 >= 0; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                v0[v4] = this.ax[this.al * v1 + v3];
                ++v3;
                ++v4;
            }

            --v1;
        }

        this.ax = v0;
        this.an = this.aj - this.ae - this.an;
    }

    public es aq() {
        es v0 = new es(this.al, this.ae);
        v0.ap = this.ap;
        v0.aj = this.aj;
        v0.ar = this.ap - this.al - this.ar;
        v0.an = this.an;
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[this.al * v2 + v3] = this.ax[this.al * v2 + this.al - 1 - v3];
            }
        }

        return v0;
    }

    public void ar(int arg11) {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int v0 = arg11 > this.ar ? this.ar : arg11;
        int v1 = this.ar + arg11 + this.al > this.ap ? this.ap - this.ar - this.al : arg11;
        int v2 = arg11 > this.an ? this.an : arg11;
        if(this.an + arg11 + this.ae > this.aj) {
            arg11 = this.aj - this.an - this.ae;
        }

        int v3 = this.al + v0 + v1;
        v1 = this.ae + v2 + arg11;
        int[] v11 = new int[v3 * v1];
        int v5;
        for(v5 = 0; v5 < this.ae; ++v5) {
            int v6;
            for(v6 = 0; v6 < this.al; ++v6) {
                v11[(v5 + v2) * v3 + (v6 + v0)] = this.ax[this.al * v5 + v6];
            }
        }

        this.ax = v11;
        this.al = v3;
        this.ae = v1;
        this.ar -= v0;
        this.an -= v2;
    }

    public void as() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = this.ae - 1;
        int v3;
        for(v3 = 0; v1 >= 0; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                v0[v4] = this.ax[this.al * v1 + v3];
                ++v3;
                ++v4;
            }

            --v1;
        }

        this.ax = v0;
        this.an = this.aj - this.ae - this.an;
    }

    public void at() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.ae) {
            int v3 = this.al - 1;
            while(v3 >= 0) {
                v0[v2] = this.ax[this.al * v1 + v3];
                --v3;
                ++v2;
            }

            ++v1;
        }

        this.ax = v0;
        this.ar = this.ap - this.al - this.ar;
    }

    public void au() {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int[] v0 = new int[this.ap * this.aj];
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        this.ax = v0;
        this.al = this.ap;
        this.ae = this.aj;
        this.ar = 0;
        this.an = 0;
    }

    public es av() {
        es v0 = new es(this.ap, this.aj);
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[(this.an + v2) * this.ap + (this.ar + v3)] = this.ax[this.al * v2 + v3];
            }
        }

        return v0;
    }

    public void aw() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = this.ae - 1;
        int v3;
        for(v3 = 0; v1 >= 0; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                v0[v4] = this.ax[this.al * v1 + v3];
                ++v3;
                ++v4;
            }

            --v1;
        }

        this.ax = v0;
        this.an = this.aj - this.ae - this.an;
    }

    public es ax() {
        es v0 = new es(this.al, this.ae);
        v0.ap = this.ap;
        v0.aj = this.aj;
        v0.ar = this.ap - this.al - this.ar;
        v0.an = this.an;
        int v2;
        for(v2 = 0; v2 < this.ae; ++v2) {
            int v3;
            for(v3 = 0; v3 < this.al; ++v3) {
                v0.ax[this.al * v2 + v3] = this.ax[this.al * v2 + this.al - 1 - v3];
            }
        }

        return v0;
    }

    public void ay() {
        int[] v0 = new int[this.al * this.ae];
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.ae) {
            int v3 = this.al - 1;
            while(v3 >= 0) {
                v0[v2] = this.ax[this.al * v1 + v3];
                --v3;
                ++v2;
            }

            ++v1;
        }

        this.ax = v0;
        this.ar = this.ap - this.al - this.ar;
    }

    public void az(int arg11) {
        if(this.al == this.ap && this.ae == this.aj) {
            return;
        }

        int v0 = arg11 > this.ar ? this.ar : arg11;
        int v1 = this.ar + arg11 + this.al > this.ap ? this.ap - this.ar - this.al : arg11;
        int v2 = arg11 > this.an ? this.an : arg11;
        if(this.an + arg11 + this.ae > this.aj) {
            arg11 = this.aj - this.an - this.ae;
        }

        int v3 = this.al + v0 + v1;
        v1 = this.ae + v2 + arg11;
        int[] v11 = new int[v3 * v1];
        int v5;
        for(v5 = 0; v5 < this.ae; ++v5) {
            int v6;
            for(v6 = 0; v6 < this.al; ++v6) {
                v11[(v5 + v2) * v3 + (v6 + v0)] = this.ax[this.al * v5 + v6];
            }
        }

        this.ax = v11;
        this.al = v3;
        this.ae = v1;
        this.ar -= v0;
        this.an -= v2;
    }

    public void ba(int arg8) {
        int v0;
        for(v0 = this.ae - 1; v0 > 0; --v0) {
            int v1 = this.al * v0;
            int v2;
            for(v2 = this.al - 1; v2 > 0; --v2) {
                int v4 = v2 + v1;
                if(this.ax[v4] == 0 && this.ax[v4 - 1 - this.al] != 0) {
                    this.ax[v4] = arg8;
                }
            }
        }
    }

    public void bd(int arg9) {
        int[] v0 = new int[this.al * this.ae];
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < this.ae; v3 = v4) {
            int v4 = v3;
            v3 = 0;
            while(v3 < this.al) {
                int v5 = this.ax[v4];
                if(v5 == 0) {
                    if(v3 <= 0 || this.ax[v4 - 1] == 0) {
                        if(v2 > 0 && this.ax[v4 - this.al] != 0) {
                            goto label_45;
                        }

                        if(v3 < this.al - 1 && this.ax[v4 + 1] != 0) {
                            goto label_45;
                        }

                        if(v2 >= this.ae - 1) {
                            goto label_46;
                        }

                        if(this.ax[this.al + v4] == 0) {
                            goto label_46;
                        }
                    }
                    else {
                    }

                label_45:
                    v5 = arg9;
                }

            label_46:
                v0[v4] = v5;
                ++v3;
                ++v4;
            }

            ++v2;
        }

        this.ax = v0;
    }

    public void bf(int arg8) {
        int v0;
        for(v0 = this.ae - 1; v0 > 0; --v0) {
            int v1 = this.al * v0;
            int v2;
            for(v2 = this.al - 1; v2 > 0; --v2) {
                int v4 = v2 + v1;
                if(this.ax[v4] == 0 && this.ax[v4 - 1 - this.al] != 0) {
                    this.ax[v4] = arg8;
                }
            }
        }
    }

    public void bn(int arg8) {
        int v0;
        for(v0 = this.ae - 1; v0 > 0; --v0) {
            int v1 = this.al * v0;
            int v2;
            for(v2 = this.al - 1; v2 > 0; --v2) {
                int v4 = v2 + v1;
                if(this.ax[v4] == 0 && this.ax[v4 - 1 - this.al] != 0) {
                    this.ax[v4] = arg8;
                }
            }
        }
    }
}

