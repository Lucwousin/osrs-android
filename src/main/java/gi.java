public final class gi {
    oc ae;
    int al;
    gr an;
    fc ar;
    int ax;

    public gi(int arg3, int arg4) {
        super();
        this.ar = new fc();
        this.ax = arg3;
        this.al = arg3;
        int v0 = 1;
        while(true) {
            int v1 = v0 + v0;
            if(v1 < arg3 && v0 < arg4) {
                v0 = v1;
                continue;
            }

            break;
        }

        this.ae = new oc(v0);
    }

    public void aa(int arg6) {
        mv v0;
        for(v0 = this.ar.an(); v0 != null; v0 = this.ar.aj()) {
            if(!((gw)v0).al()) {
                long v1 = ((gw)v0).dl + 1;
                ((gw)v0).dl = v1;
                if(v1 > (((long)arg6))) {
                    gt v1_1 = new gt(((gw)v0).ax(), ((gw)v0).al);
                    this.ae.al(((mx)v1_1), ((gw)v0).gx);
                    fc.ae(((mv)v1_1), v0);
                    ((gw)v0).lp();
                    ((gw)v0).de();
                }
            }
            else if(((gw)v0).ax() == null) {
                ((gw)v0).lp();
                ((gw)v0).de();
                this.al += ((gw)v0).al;
            }
        }
    }

    void ab(gw arg2) {
        if(arg2 != null) {
            arg2.lp();
            arg2.de();
            this.al += arg2.al;
        }
    }

    void ad(long arg2) {
        this.ae(this.ae.ax(arg2));
    }

    void ae(gw arg2) {
        if(arg2 != null) {
            arg2.lp();
            arg2.de();
            this.al += arg2.al;
        }
    }

    void af(gw arg2) {
        if(arg2 != null) {
            arg2.lp();
            arg2.de();
            this.al += arg2.al;
        }
    }

    public void ai(Object arg3, long arg4, int arg6) {
        if(arg6 > this.ax) {
            goto label_32;
        }

        this.al(arg4);
        this.al -= arg6;
        while(true) {
            if(this.al >= 0) {
                goto label_23;
            }

            mv v0 = this.ar.ar();
            if(v0 == null) {
                break;
            }

            ((gw)v0).al();
            this.ae(((gw)v0));
            if(this.an == null) {
                continue;
            }

            this.an.ax(((gw)v0).ax());
        }

        throw new RuntimeException("");
    label_23:
        gz v0_1 = new gz(arg3, arg6);
        this.ae.al(((mx)v0_1), arg4);
        this.ar.al(((mv)v0_1));
        ((gw)v0_1).dl = 0;
        return;
    label_32:
        throw new IllegalStateException();
    }

    public Object aj(long arg7) {
        mx v7 = this.ae.ax(arg7);
        Object v8 = null;
        if(v7 == null) {
            return v8;
        }

        Object v0 = ((gw)v7).ax();
        if(v0 == null) {
            ((gw)v7).lp();
            ((gw)v7).de();
            this.al += ((gw)v7).al;
            return v8;
        }

        long v1 = 0;
        if(((gw)v7).al()) {
            gz v8_1 = new gz(v0, ((gw)v7).al);
            this.ae.al(((mx)v8_1), ((gw)v7).gx);
            this.ar.al(((mv)v8_1));
            ((gw)v8_1).dl = v1;
            ((gw)v7).lp();
            ((gw)v7).de();
        }
        else {
            this.ar.al(((mv)v7));
            ((gw)v7).dl = v1;
        }

        return v0;
    }

    void al(long arg2) {
        this.ae(this.ae.ax(arg2));
    }

    public void am() {
        this.ar.ax();
        this.ae.ae();
        this.al = this.ax;
    }

    public void an(int arg6) {
        mv v0;
        for(v0 = this.ar.an(); v0 != null; v0 = this.ar.aj()) {
            if(!((gw)v0).al()) {
                long v1 = ((gw)v0).dl + 1;
                ((gw)v0).dl = v1;
                if(v1 > (((long)arg6))) {
                    gt v1_1 = new gt(((gw)v0).ax(), ((gw)v0).al);
                    this.ae.al(((mx)v1_1), ((gw)v0).gx);
                    fc.ae(((mv)v1_1), v0);
                    ((gw)v0).lp();
                    ((gw)v0).de();
                }
            }
            else if(((gw)v0).ax() == null) {
                ((gw)v0).lp();
                ((gw)v0).de();
                this.al += ((gw)v0).al;
            }
        }
    }

    public void ap() {
        this.ar.ax();
        this.ae.ae();
        this.al = this.ax;
    }

    void aq(long arg2) {
        this.ae(this.ae.ax(arg2));
    }

    public void ar(Object arg3, long arg4, int arg6) {
        if(arg6 > this.ax) {
            goto label_32;
        }

        this.al(arg4);
        this.al -= arg6;
        while(true) {
            if(this.al >= 0) {
                goto label_23;
            }

            mv v0 = this.ar.ar();
            if(v0 == null) {
                break;
            }

            ((gw)v0).al();
            this.ae(((gw)v0));
            if(this.an == null) {
                continue;
            }

            this.an.ax(((gw)v0).ax());
        }

        throw new RuntimeException("");
    label_23:
        gz v0_1 = new gz(arg3, arg6);
        this.ae.al(((mx)v0_1), arg4);
        this.ar.al(((mv)v0_1));
        ((gw)v0_1).dl = 0;
        return;
    label_32:
        throw new IllegalStateException();
    }

    public void au() {
        this.ar.ax();
        this.ae.ae();
        this.al = this.ax;
    }

    public void av(Object arg3, long arg4, int arg6) {
        if(arg6 > this.ax) {
            goto label_32;
        }

        this.al(arg4);
        this.al -= arg6;
        while(true) {
            if(this.al >= 0) {
                goto label_23;
            }

            mv v0 = this.ar.ar();
            if(v0 == null) {
                break;
            }

            ((gw)v0).al();
            this.ae(((gw)v0));
            if(this.an == null) {
                continue;
            }

            this.an.ax(((gw)v0).ax());
        }

        throw new RuntimeException("");
    label_23:
        gz v0_1 = new gz(arg3, arg6);
        this.ae.al(((mx)v0_1), arg4);
        this.ar.al(((mv)v0_1));
        ((gw)v0_1).dl = 0;
        return;
    label_32:
        throw new IllegalStateException();
    }

    public Object ax(long arg7) {
        mx v7 = this.ae.ax(arg7);
        Object v8 = null;
        if(v7 == null) {
            return v8;
        }

        Object v0 = ((gw)v7).ax();
        if(v0 == null) {
            ((gw)v7).lp();
            ((gw)v7).de();
            this.al += ((gw)v7).al;
            return v8;
        }

        long v1 = 0;
        if(((gw)v7).al()) {
            gz v8_1 = new gz(v0, ((gw)v7).al);
            this.ae.al(((mx)v8_1), ((gw)v7).gx);
            this.ar.al(((mv)v8_1));
            ((gw)v8_1).dl = v1;
            ((gw)v7).lp();
            ((gw)v7).de();
        }
        else {
            this.ar.al(((mv)v7));
            ((gw)v7).dl = v1;
        }

        return v0;
    }

    public void az() {
        this.ar.ax();
        this.ae.ae();
        this.al = this.ax;
    }
}

