public class ig {
    int ae;
    ij[] al;
    static final int an = -2;
    static hc ap = null;
    static final int ax = 100;
    static je fe;

    ig() {
        try {
            super();
            this.al = new ij[100];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ig.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    int ad() {
        return this.ae * -109323801;
    }

    int ae(int arg3) {
        try {
            return this.ae * -109323801;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ig.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    ij aj(int arg3) {
        if(arg3 >= 0) {
            if(arg3 >= this.ae * 2007480969) {
            }
            else {
                return this.al[arg3];
            }
        }

        return null;
    }

    ij al(int arg2, int arg3) {
        if(arg2 >= 0) {
            arg3 = -109323801;
            try {
                if(arg2 >= this.ae * arg3) {
                }
                else {
                    return this.al[arg2];
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ig.al(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }

        return null;
    }

    ij an(int arg3) {
        if(arg3 >= 0) {
            if(arg3 >= this.ae * -109323801) {
            }
            else {
                return this.al[arg3];
            }
        }

        return null;
    }

    ij ap(int arg3) {
        if(arg3 >= 0) {
            if(arg3 >= this.ae * -109323801) {
            }
            else {
                return this.al[arg3];
            }
        }

        return null;
    }

    int aq() {
        return this.ae * -341943240;
    }

    static int ar(char arg1, ly arg2, byte arg3) {
        int v3 = arg1 << 4;
        try {
            if((Character.isUpperCase(arg1)) || (Character.isTitleCase(arg1))) {
                int v1_1 = Character.toLowerCase(arg1);
                v3 = (v1_1 << 4) + 1;
            }

            if(0xF1 == v1_1) {
                if(ly.ap != arg2) {
                    return v3;
                }

                return 0x6E2;
            }

            return v3;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ig.ar(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 0x6E2;
    }

    ij ar(int arg11, String arg12, String arg13, String arg14) {
        ij v0 = this.al[99];
        int v8 = -109323801;
        int v1;
        for(v1 = this.ae * v8; true; --v1) {
            int v9 = 100;
            if(v1 <= 0) {
                break;
            }

            if(v9 == v1) {
            }
            else {
                this.al[v1] = this.al[v1 - 1];
            }
        }

        if(v0 == null) {
            v0 = new ij(arg11, arg12, arg14, arg13);
        }
        else {
            v0.lp();
            v0.de();
            v0.ax(arg11, arg12, arg14, arg13, -1775014074);
        }

        this.al[0] = v0;
        if(this.ae * v8 < v9) {
            this.ae += 2105158103;
        }

        return v0;
    }

    public static void ax(ko arg1, int arg2) {
        try {
            dj.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ig.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    ij ax(int arg10, String arg11, String arg12, String arg13, int arg14) {
        ij v14;
        try {
            v14 = this.al[99];
            int v7 = -109323801;
            int v0;
            for(v0 = this.ae * v7; true; --v0) {
                int v8 = 100;
                if(v0 <= 0) {
                    break;
                }

                if(v8 == v0) {
                }
                else {
                    this.al[v0] = this.al[v0 - 1];
                }
            }

            if(v14 == null) {
                v14 = new ij(arg10, arg11, arg13, arg12);
            }
            else {
                v14.lp();
                v14.de();
                v14.ax(arg10, arg11, arg13, arg12, 0xE9E131B2);
            }

            this.al[0] = v14;
            if(this.ae * v7 < v8) {
                this.ae += 2105158103;
            }
        }
        catch(RuntimeException v10) {
            goto label_43;
        }

        return v14;
    label_43:
        StringBuilder v11 = new StringBuilder();
        v11.append("ig.ax(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }
}

