public class no {
    int al;
    String[] ax;
    static final int sx = 7;

    public no(String[] arg3) {
        try {
            super();
            this.al = 0;
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("no.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String[] ad() {
        String v0_1;
        int v1;
        while(true) {
            String[] v2 = null;
            if(this.al * 0xEC98D6BA >= this.ax.length) {
                return v2;
            }

            String[] v0 = this.ax;
            int v3 = 0x1FB3C7FD;
            v1 = this.al + v3;
            this.al = v1;
            v0_1 = v0[v1 * 1034609274 - 1].trim();
            if(v0_1.startsWith("#")) {
                continue;
            }

            if(v0_1.startsWith("//")) {
                continue;
            }

            if(v0_1.length() == 0) {
                continue;
            }

            if((v0_1.startsWith("[")) && (v0_1.endsWith("]"))) {
                this.al -= v3;
                return v2;
            }

            v1 = v0_1.indexOf(61);
            if(-1 != v1) {
                break;
            }
        }

        return new String[]{v0_1.substring(0, v1).trim(), v0_1.substring(v1 + 1).trim()};
    }

    public String ae() {
        String v0_1;
        while(true) {
            int v1 = 211668309;
            if(this.al * v1 >= this.ax.length) {
                return null;
            }

            String[] v0 = this.ax;
            int v2 = this.al + 0x1FB3C7FD;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(!v0_1.startsWith("[")) {
                continue;
            }

            if(v0_1.endsWith("]")) {
                break;
            }
        }

        return v0_1.substring(1, v0_1.length() - 1).trim();
    }

    public String aj() {
        String v0_1;
        while(true) {
            int v1 = 211668309;
            if(this.al * v1 >= this.ax.length) {
                return null;
            }

            String[] v0 = this.ax;
            int v2 = this.al + 0x1FB3C7FD;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(!v0_1.startsWith("[")) {
                continue;
            }

            if(v0_1.endsWith("]")) {
                break;
            }
        }

        return v0_1.substring(1, v0_1.length() - 1).trim();
    }

    public String[] al(int arg6) {
        String v6_2;
        int v1;
        String[] v2;
        try {
            while(true) {
                int v0 = 211668309;
                v2 = null;
                if(this.al * v0 >= this.ax.length) {
                    return v2;
                }

                String[] v6_1 = this.ax;
                int v3 = 0x1FB3C7FD;
                v1 = this.al + v3;
                this.al = v1;
                v6_2 = v6_1[v1 * v0 - 1].trim();
                if(v6_2.startsWith("#")) {
                    continue;
                }

                if(v6_2.startsWith("//")) {
                    continue;
                }

                if(v6_2.length() == 0) {
                    continue;
                }

                if((v6_2.startsWith("[")) && (v6_2.endsWith("]"))) {
                    this.al -= v3;
                    return v2;
                }

                v1 = v6_2.indexOf(61);
                if(-1 != v1) {
                    break;
                }
            }

            return new String[]{v6_2.substring(0, v1).trim(), v6_2.substring(v1 + 1).trim()};
        }
        catch(RuntimeException v6) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("no.al(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6), v0_1.toString());
        }

        return v2;
    }

    public String an() {
        String v0_1;
        while(true) {
            int v1 = 211668309;
            if(this.al * v1 >= this.ax.length) {
                return null;
            }

            String[] v0 = this.ax;
            int v2 = this.al + 0x1FB3C7FD;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(!v0_1.startsWith("[")) {
                continue;
            }

            if(v0_1.endsWith("]")) {
                break;
            }
        }

        return v0_1.substring(1, v0_1.length() - 1).trim();
    }

    public String ap() {
        String v0_1;
        while(true) {
            int v1 = 211668309;
            if(this.al * v1 >= this.ax.length) {
                return null;
            }

            String[] v0 = this.ax;
            int v2 = this.al + 0x1FB3C7FD;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(!v0_1.startsWith("[")) {
                continue;
            }

            if(v0_1.endsWith("]")) {
                break;
            }
        }

        return v0_1.substring(1, v0_1.length() - 1).trim();
    }

    public String[] aq() {
        String v0_1;
        int v2;
        while(true) {
            int v1 = 211668309;
            String[] v3 = null;
            if(this.al * v1 >= this.ax.length) {
                return v3;
            }

            String[] v0 = this.ax;
            int v4 = 0x1FB3C7FD;
            v2 = this.al + v4;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(v0_1.startsWith("#")) {
                continue;
            }

            if(v0_1.startsWith("//")) {
                continue;
            }

            if(v0_1.length() == 0) {
                continue;
            }

            if((v0_1.startsWith("[")) && (v0_1.endsWith("]"))) {
                this.al -= v4;
                return v3;
            }

            v2 = v0_1.indexOf(61);
            if(-1 != v2) {
                break;
            }
        }

        return new String[]{v0_1.substring(0, v2).trim(), v0_1.substring(v2 + 1).trim()};
    }

    public String ar() {
        String v0_1;
        while(true) {
            int v1 = 211668309;
            if(this.al * v1 >= this.ax.length) {
                return null;
            }

            String[] v0 = this.ax;
            int v2 = this.al + 0x1FB3C7FD;
            this.al = v2;
            v0_1 = v0[v2 * v1 - 1].trim();
            if(!v0_1.startsWith("[")) {
                continue;
            }

            if(v0_1.endsWith("]")) {
                break;
            }
        }

        return v0_1.substring(1, v0_1.length() - 1).trim();
    }

    public String ax(int arg4) {
        String v4_2;
        try {
            while(true) {
                int v0 = 211668309;
                if(this.al * v0 >= this.ax.length) {
                    return null;
                }

                String[] v4_1 = this.ax;
                int v1 = this.al + 0x1FB3C7FD;
                this.al = v1;
                v4_2 = v4_1[v1 * v0 - 1].trim();
                if(!v4_2.startsWith("[")) {
                    continue;
                }

                if(v4_2.endsWith("]")) {
                    break;
                }
            }

            return v4_2.substring(1, v4_2.length() - 1).trim();
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("no.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }

        return null;
    }
}

