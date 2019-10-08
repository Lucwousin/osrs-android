public class ed extends ee {
    public static final String ai = "gsu6PD";
    boolean ar;
    boolean ax;
    public static final int bg = 40;
    static final int dd = 2000;
    static pf ob;

    ed() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ed.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int ad(Object arg2) {
        return this.ax(((ed)arg2), -350645658);
    }

    int ae(ed arg7) {
        int v1 = 0x8076F529;
        int v3 = 0x297B4181;
        int v4 = -1;
        if(client.ae * v1 == this.an * v3 && arg7.an * v3 != client.ae * v1) {
            return v4;
        }

        if(arg7.an * v3 == client.ae * v1 && this.an * v3 != client.ae * v1) {
            return 1;
        }

        if(this.an * v3 != 0 && arg7.an * v3 == 0) {
            return v4;
        }

        if(arg7.an * v3 != 0 && this.an * v3 == 0) {
            return 1;
        }

        if((this.ax) && !arg7.ax) {
            return v4;
        }

        if(!this.ax && (arg7.ax)) {
            return 1;
        }

        if((this.ar) && !arg7.ar) {
            return v4;
        }

        if(!this.ar && (arg7.ar)) {
            return 1;
        }

        v1 = 125406857;
        if(this.an * v3 != 0) {
            return this.ap * v1 - arg7.ap * v1;
        }

        return arg7.ap * v1 - this.ap * v1;
    }

    public int aj(Object arg2) {
        return this.ax(((ed)arg2), 0x91CB5195);
    }

    public static int al(int arg1, int arg2, int arg3) {
        if(arg2 > arg1) {
        label_5:
            if(arg1 != 0) {
                try {
                    arg2 %= arg1;
                }
                catch(RuntimeException v1) {
                    StringBuilder v2 = new StringBuilder();
                    v2.append("ed.al(");
                    v2.append(')');
                    throw lx.al(((Throwable)v1), v2.toString());
                }
            }
            else {
                return arg2;
            }
        }

        int v0 = arg2;
        arg2 = arg1;
        arg1 = v0;
        goto label_5;
    }

    public int al(eg arg2, int arg3) {
        try {
            return this.ax(((ed)arg2), 1914406410);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ed.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int an(eg arg2) {
        return this.ax(((ed)arg2), 0xCF3B212E);
    }

    public int ar(eg arg2) {
        return this.ax(((ed)arg2), 1904862489);
    }

    int ax(ed arg6, int arg7) {
        try {
            int v0 = 0x8076F529;
            int v2 = 0x297B4181;
            int v3 = -1;
            if(client.ae * v0 == this.an * v2 && arg6.an * v2 != client.ae * v0) {
                return v3;
            }

            if(arg6.an * v2 == client.ae * v0 && this.an * v2 != client.ae * v0) {
                return 1;
            }

            if(this.an * v2 != 0 && arg6.an * v2 == 0) {
                return v3;
            }

            if(arg6.an * v2 != 0 && this.an * v2 == 0) {
                return 1;
            }

            if((this.ax) && !arg6.ax) {
                return v3;
            }

            if(!this.ax && (arg6.ax)) {
                return 1;
            }

            if((this.ar) && !arg6.ar) {
                return v3;
            }

            if(!this.ar && (arg6.ar)) {
                return 1;
            }

            v0 = 125406857;
            if(this.an * v2 != 0) {
                return this.ap * v0 - arg6.ap * v0;
            }

            return arg6.ap * v0 - this.ap * v0;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("ed.ax(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    int ba(ed arg7) {
        int v1 = 0x8076F529;
        int v3 = 0x297B4181;
        int v4 = -1;
        if(client.ae * v1 == this.an * v3 && arg7.an * v3 != client.ae * v1) {
            return v4;
        }

        if(arg7.an * v3 == client.ae * v1 && this.an * v3 != client.ae * v1) {
            return 1;
        }

        if(this.an * v3 != 0 && arg7.an * v3 == 0) {
            return v4;
        }

        if(arg7.an * v3 != 0 && this.an * v3 == 0) {
            return 1;
        }

        if((this.ax) && !arg7.ax) {
            return v4;
        }

        if(!this.ax && (arg7.ax)) {
            return 1;
        }

        if((this.ar) && !arg7.ar) {
            return v4;
        }

        if(!this.ar && (arg7.ar)) {
            return 1;
        }

        v1 = 125406857;
        if(this.an * v3 != 0) {
            return this.ap * v1 - arg7.ap * v1;
        }

        return arg7.ap * v1 - this.ap * v1;
    }

    int bf(ed arg7) {
        int v2 = 0x297B4181;
        int v3 = -1;
        if(client.ae * 0x6DA5D006 == this.an * v2 && arg7.an * 820330120 != client.ae * 0x771F396E) {
            return v3;
        }

        if(arg7.an * v2 == client.ae * 0xDCD57FE6 && this.an * v2 != client.ae * 0x70CD35F8) {
            return 1;
        }

        if(this.an * v2 != 0 && arg7.an * v2 == 0) {
            return v3;
        }

        if(arg7.an * v2 != 0 && this.an * 0x50F04BDC == 0) {
            return 1;
        }

        if((this.ax) && !arg7.ax) {
            return v3;
        }

        if(!this.ax && (arg7.ax)) {
            return 1;
        }

        if((this.ar) && !arg7.ar) {
            return v3;
        }

        if(!this.ar && (arg7.ar)) {
            return 1;
        }

        if(this.an * 0x5A2FD6FB != 0) {
            return this.ap * 0x48A6D9B9 - arg7.ap * 125406857;
        }

        return arg7.ap * 0x73EB31B5 - this.ap * 0x55BC29C0;
    }

    static final void cf(int arg7) {
        int v4;
        String v3;
        int v0;
        try {
            int[] v7_1 = ho.aj;
            v0 = 0;
            int v1 = 0;
            while(true) {
                v3 = null;
                v4 = 0x173DE2CF;
                int v5 = 0x1CEDE42F;
                if(v1 < ho.ap * 0x474DFE7D) {
                    hw v2 = client.jf[v7_1[v1]];
                    if(v2 != null && v2.bs * v5 > 0) {
                        v2.bs -= v4;
                        if(v2.bs * v5 == 0) {
                            v2.bm = v3;
                        }
                    }

                    ++v1;
                    continue;
                }

                break;
            }

            while(true) {
            label_26:
                if(v0 >= client.eg * 359080599) {
                    return;
                }

                ii v7_2 = client.ev[client.eu[v0]];
                if(v7_2 != null && v7_2.bs * v5 > 0) {
                    v7_2.bs -= v4;
                    if(v7_2.bs * v5 == 0) {
                        v7_2.bm = v3;
                    }
                }

                break;
            }
        }
        catch(RuntimeException v7) {
            goto label_50;
        }

        ++v0;
        goto label_26;
        return;
    label_50:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ed.cf(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7), v0_1.toString());
    }

    public int compareTo(Object arg3) {
        try {
            return this.ax(((ed)arg3), 0x7FAA3075);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ed.compareTo(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

