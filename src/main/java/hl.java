public class hl extends mv {
    int ad;
    int[] ae;
    int aj;
    int[] al;
    int an;
    int ap;
    oc[] aq;
    String[] ar;
    static gk ax = null;
    static final int di = 4;
    static final int ot = 0x600;

    static {
        hl.ax = new gk(0x80, null);
    }

    hl() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hl.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static hl aa(int arg4, int arg5) {
        long v0 = ((long)(arg4 << 16));
        mv v5 = hl.ax.ax(v0);
        if(v5 != null) {
            return ((hl)v5);
        }

        arg4 = ih.dm.ay(String.valueOf(arg4), 0xD4A3E869);
        hl v2 = null;
        if(arg4 == -1) {
            return v2;
        }

        byte[] v4 = ih.dm.ab(arg4, 0x754B6D53);
        if(v4 != null) {
            if(v4.length <= 1) {
                return v2;
            }
            else {
                hl v4_1 = ap.ar(v4, 5);
                if(v4_1 != null) {
                    hl.ax.ae(((mv)v4_1), v0);
                    return v4_1;
                }
            }
        }

        return v2;
    }

    static hl ab(int arg1, int arg2, int arg3) {
        hl v2 = ac.ae(au.ax(arg2, arg1, 1290207860), arg1, -92);
        if(v2 != null) {
            return v2;
        }

        hl v1 = ac.ae(dj.al(arg3, arg1, 0x4A90AB9), arg1, -35);
        if(v1 != null) {
            return v1;
        }

        return null;
    }

    static hl ad(int arg1, int arg2, int arg3) {
        hl v2 = ac.ae(au.ax(arg2, arg1, 0x268C3742), arg1, 44);
        if(v2 != null) {
            return v2;
        }

        hl v1 = ac.ae(dj.al(arg3, arg1, 0x4A90AB9), arg1, -21);
        if(v1 != null) {
            return v1;
        }

        return null;
    }

    static hl af(int arg1, int arg2, int arg3) {
        hl v2 = ac.ae(au.ax(arg2, arg1, 0x2FC18423), arg1, -13);
        if(v2 != null) {
            return v2;
        }

        hl v1 = ac.ae(dj.al(arg3, arg1, 0x4A90AB9), arg1, 28);
        if(v1 != null) {
            return v1;
        }

        return null;
    }

    static hl ag(byte[] arg13) {
        hl v0 = new hl();
        lq v1 = new lq(arg13);
        v1.ar = (v1.ae.length - 2) * -1880437085;
        int v3 = v1.ae.length - 2 - v1.ao(0x9FE8EA6C) - 12;
        v1.ar = -1880437085 * v3;
        int v13 = v1.ac(105);
        v0.an = v1.ao(881216804) * 0xD6B2F2C7;
        v0.ap = v1.ao(0x643D81F7) * 781987405;
        v0.aj = v1.ao(0x77DF7D2C) * 0x2E1E3D1B;
        v0.ad = v1.ao(0x5E0BA2FA) * -666086369;
        int v2 = v1.ay(-97);
        int v4 = 0;
        if(v2 > 0) {
            v0.aq = v0.an(v2, 303121086);
            int v5;
            for(v5 = 0; v5 < v2; ++v5) {
                int v6 = v1.ao(0x15013235);
                int v8 = v6 > 0 ? fa.ae(v6, 2089488853) : 1;
                oc v7 = new oc(v8);
                v0.aq[v5] = v7;
                while(true) {
                    v8 = v6 - 1;
                    if(v6 <= 0) {
                        break;
                    }

                    v7.al(new mo(v1.ac(0x7A)), ((long)v1.ac(86)));
                    v6 = v8;
                }
            }
        }

        v1.ar = 0;
        v1.bf(0x2F3A6EDD);
        v0.al = new int[v13];
        v0.ae = new int[v13];
        v0.ar = new String[v13];
        while(v1.ar * 0xF24F550B < v3) {
            v13 = v1.ao(-2079640520);
            if(3 == v13) {
                v0.ar[v4] = v1.bn(-61);
            }
            else {
                if(v13 < 100 && 21 != v13 && v13 != 38 && 39 != v13) {
                    v0.ae[v4] = v1.ac(55);
                    goto label_114;
                }

                v0.ae[v4] = v1.ay(-15);
            }

        label_114:
            v0.al[v4] = v13;
            ++v4;
        }

        return v0;
    }

    oc[] ah(int arg1) {
        return new oc[arg1];
    }

    static hl ai(int arg1, int arg2, int arg3) {
        hl v2 = ac.ae(au.ax(arg2, arg1, 0x2C24617F), arg1, -17);
        if(v2 != null) {
            return v2;
        }

        hl v1 = ac.ae(dj.al(arg3, arg1, 0x4A90AB9), arg1, 42);
        if(v1 != null) {
            return v1;
        }

        return null;
    }

    static hl aj(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = hl.ax.ax(v1);
        if(v0 != null) {
            return ((hl)v0);
        }

        byte[] v5 = ih.dm.ae(arg5, 0, 0x78DC0DC9);
        if(v5 == null) {
            return null;
        }

        hl v5_1 = ap.ar(v5, 5);
        hl.ax.ae(((mv)v5_1), v1);
        return v5_1;
    }

    public static ef[] al(ko arg0, int arg1, int arg2, int arg3) {
        arg3 = 402048974;
        try {
            if(!au.at(arg0, arg1, arg2, arg3)) {
                return null;
            }

            return ac.au(5725);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hl.al(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static hl am(byte[] arg13) {
        hl v0 = new hl();
        lq v1 = new lq(arg13);
        v1.ar = (v1.ae.length - 2) * -1880437085;
        int v3 = v1.ae.length - 2 - v1.ao(-1803275973) - 12;
        v1.ar = -1880437085 * v3;
        int v13 = v1.ac(107);
        v0.an = v1.ao(0x69FB776A) * 0xD6B2F2C7;
        v0.ap = v1.ao(0xEB1BFB5A) * 781987405;
        v0.aj = v1.ao(0x987D04A9) * 0x2E1E3D1B;
        v0.ad = v1.ao(0x8B890482) * -666086369;
        int v2 = v1.ay(-37);
        int v4 = 0;
        if(v2 > 0) {
            v0.aq = v0.an(v2, 0x1B0A0B16);
            int v5;
            for(v5 = 0; v5 < v2; ++v5) {
                int v6 = v1.ao(0x8CBD2F36);
                int v8 = v6 > 0 ? fa.ae(v6, 0x5DF1C1E7) : 1;
                oc v7 = new oc(v8);
                v0.aq[v5] = v7;
                while(true) {
                    v8 = v6 - 1;
                    if(v6 <= 0) {
                        break;
                    }

                    v7.al(new mo(v1.ac(109)), ((long)v1.ac(109)));
                    v6 = v8;
                }
            }
        }

        v1.ar = 0;
        v1.bf(0xAEF44FA5);
        v0.al = new int[v13];
        v0.ae = new int[v13];
        v0.ar = new String[v13];
        while(v1.ar * 0xF24F550B < v3) {
            v13 = v1.ao(390534828);
            if(3 == v13) {
                v0.ar[v4] = v1.bn(-9);
            }
            else {
                if(v13 < 100 && 21 != v13 && v13 != 38 && 39 != v13) {
                    v0.ae[v4] = v1.ac(76);
                    goto label_113;
                }

                v0.ae[v4] = v1.ay(-26);
            }

        label_113:
            v0.al[v4] = v13;
            ++v4;
        }

        return v0;
    }

    oc[] an(int arg2, int arg3) {
        try {
            return new oc[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hl.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static hl ap(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = hl.ax.ax(v1);
        if(v0 != null) {
            return ((hl)v0);
        }

        byte[] v5 = ih.dm.ae(arg5, 0, 0x78DC0DC9);
        if(v5 == null) {
            return null;
        }

        hl v5_1 = ap.ar(v5, 5);
        hl.ax.ae(((mv)v5_1), v1);
        return v5_1;
    }

    static hl aq(int arg1, int arg2, int arg3) {
        byte v0 = -39;
        hl v2 = ac.ae(au.ax(arg2, arg1, 0x24C922AC), arg1, v0);
        if(v2 != null) {
            return v2;
        }

        hl v1 = ac.ae(dj.al(arg3, arg1, 0x4A90AB9), arg1, v0);
        if(v1 != null) {
            return v1;
        }

        return null;
    }

    oc[] at(int arg1) {
        return new oc[arg1];
    }

    static hl au(int arg4, int arg5) {
        long v0 = ((long)(arg4 << 16));
        mv v5 = hl.ax.ax(v0);
        if(v5 != null) {
            return ((hl)v5);
        }

        arg4 = ih.dm.ay(String.valueOf(arg4), 0xD4A3E869);
        hl v2 = null;
        if(arg4 == -1) {
            return v2;
        }

        byte[] v4 = ih.dm.ab(arg4, 1487106846);
        if(v4 != null) {
            if(v4.length <= 1) {
                return v2;
            }
            else {
                hl v4_1 = ap.ar(v4, 5);
                if(v4_1 != null) {
                    hl.ax.ae(((mv)v4_1), v0);
                    return v4_1;
                }
            }
        }

        return v2;
    }

    static hl av(int arg4, int arg5) {
        long v0 = ((long)(arg4 << 16));
        mv v5 = hl.ax.ax(v0);
        if(v5 != null) {
            return ((hl)v5);
        }

        arg4 = ih.dm.ay(String.valueOf(arg4), 0xD4A3E869);
        hl v2 = null;
        if(arg4 == -1) {
            return v2;
        }

        byte[] v4 = ih.dm.ab(arg4, 0x60EFE157);
        if(v4 != null) {
            if(v4.length <= 1) {
                return v2;
            }
            else {
                hl v4_1 = ap.ar(v4, 5);
                if(v4_1 != null) {
                    hl.ax.ae(((mv)v4_1), v0);
                    return v4_1;
                }
            }
        }

        return v2;
    }

    oc[] aw(int arg1) {
        return new oc[arg1];
    }

    public static void ax(ko arg1, int arg2) {
        try {
            dq.ax = arg1;
            dq.al = dq.ax.au(16, 0x6B488688) * 0xE002BB93;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("hl.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    oc[] ay(int arg1) {
        return new oc[arg1];
    }

    static hl az(byte[] arg13) {
        hl v0 = new hl();
        lq v1 = new lq(arg13);
        v1.ar = (v1.ae.length - 2) * -1880437085;
        int v3 = v1.ae.length - 2 - v1.ao(1175600628) - 12;
        v1.ar = -1880437085 * v3;
        int v13 = v1.ac(75);
        v0.an = v1.ao(-1570543848) * 0xD6B2F2C7;
        v0.ap = v1.ao(0x9E5A74F3) * 781987405;
        v0.aj = v1.ao(484300612) * 0x2E1E3D1B;
        v0.ad = v1.ao(0x8111C63D) * -666086369;
        int v2 = v1.ay(-73);
        int v4 = 0;
        if(v2 > 0) {
            v0.aq = v0.an(v2, 1801415047);
            int v5;
            for(v5 = 0; v5 < v2; ++v5) {
                int v6 = v1.ao(0x66DE2A42);
                int v8 = v6 > 0 ? fa.ae(v6, -122400246) : 1;
                oc v7 = new oc(v8);
                v0.aq[v5] = v7;
                while(true) {
                    v8 = v6 - 1;
                    if(v6 <= 0) {
                        break;
                    }

                    v7.al(new mo(v1.ac(49)), ((long)v1.ac(18)));
                    v6 = v8;
                }
            }
        }

        v1.ar = 0;
        v1.bf(0x9037CBA7);
        v0.al = new int[v13];
        v0.ae = new int[v13];
        v0.ar = new String[v13];
        while(v1.ar * 0xF24F550B < v3) {
            v13 = v1.ao(0x49DFC3A0);
            if(3 == v13) {
                v0.ar[v4] = v1.bn(14);
            }
            else {
                if(v13 < 100 && 21 != v13 && v13 != 38 && 39 != v13) {
                    v0.ae[v4] = v1.ac(86);
                    goto label_114;
                }

                v0.ae[v4] = v1.ay(-28);
            }

        label_114:
            v0.al[v4] = v13;
            ++v4;
        }

        return v0;
    }
}

