import java.util.HashMap;

public class lx {
    HashMap ae;
    ko al;
    static final int ap = 3;
    ko ax;

    public lx(ko arg2, ko arg3) {
        try {
            super();
            this.ax = arg2;
            this.al = arg3;
            this.ae = new HashMap();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lx.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public HashMap ae(li[] arg9) {
        HashMap v0 = new HashMap();
        int v1;
        for(v1 = 0; v1 < arg9.length; ++v1) {
            li v2 = arg9[v1];
            if(this.ae.containsKey(v2)) {
                v0.put(v2, this.ae.get(v2));
            }
            else {
                od v3 = jk.af(this.ax, this.al, v2.aj, "", 634076529);
                if(v3 != null) {
                    this.ae.put(v2, v3);
                    v0.put(v2, v3);
                }
            }
        }

        return v0;
    }

    public static py al(Throwable arg2, String arg3) {
        py v2_1;
        try {
            if((arg2 instanceof py)) {
                ((py)arg2).ap = ((py)arg2).ap + ' ' + arg3;
            }
            else {
                v2_1 = new py(arg2, arg3);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lx.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return ((Throwable)v2_1);
    }

    public HashMap al(li[] arg9) {
        HashMap v0 = new HashMap();
        int v1;
        for(v1 = 0; v1 < arg9.length; ++v1) {
            li v2 = arg9[v1];
            if(this.ae.containsKey(v2)) {
                v0.put(v2, this.ae.get(v2));
            }
            else {
                od v3 = jk.af(this.ax, this.al, v2.aj, "", -1154407767);
                if(v3 != null) {
                    this.ae.put(v2, v3);
                    v0.put(v2, v3);
                }
            }
        }

        return v0;
    }

    public HashMap ar(li[] arg9) {
        HashMap v0 = new HashMap();
        int v1;
        for(v1 = 0; v1 < arg9.length; ++v1) {
            li v2 = arg9[v1];
            if(this.ae.containsKey(v2)) {
                v0.put(v2, this.ae.get(v2));
            }
            else {
                od v3 = jk.af(this.ax, this.al, v2.aj, "", -883210937);
                if(v3 != null) {
                    this.ae.put(v2, v3);
                    v0.put(v2, v3);
                }
            }
        }

        return v0;
    }

    public HashMap ax(li[] arg8, int arg9) {
        int v0;
        HashMap v9;
        try {
            v9 = new HashMap();
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= arg8.length) {
                    return v9;
                }

                li v1 = arg8[v0];
                if(this.ae.containsKey(v1)) {
                    v9.put(v1, this.ae.get(v1));
                }
                else {
                    od v2 = jk.af(this.ax, this.al, v1.aj, "", 0xEBA8DA1C);
                    if(v2 != null) {
                        this.ae.put(v1, v2);
                        v9.put(v1, v2);
                    }
                }

                break;
            }
        }
        catch(RuntimeException v8) {
            goto label_28;
        }

        ++v0;
        goto label_3;
        return v9;
    label_28:
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("lx.ax(");
        v9_1.append(')');
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    static void bv(int arg3) {
        try {
            client.eh.ax(0xFA13C489);
            int v0 = 0;
            client.eh.ap.ar = 0;
            nn v1 = null;
            client.eh.aj = v1;
            client.eh.ai = v1;
            client.eh.av = v1;
            client.eh.aa = v1;
            client.eh.ad = 0;
            client.eh.ab = 0;
            client.cd = 0;
            fh.kf.bs(-1264899506);
            client.pw = 0;
            client.oc = 0;
            for(arg3 = 0; arg3 < 0x800; ++arg3) {
                client.jf[arg3] = ((hw)v1);
            }

            gu.jg = ((hw)v1);
            for(arg3 = 0; arg3 < client.ev.length; ++arg3) {
                ii v1_1 = client.ev[arg3];
                if(v1_1 != null) {
                    ((ie)v1_1).cy = 0x224B5B17;
                    ((ie)v1_1).cw = false;
                }
            }

            cz.aj(0x3DE24F25);
            dc.ay(30, -79);
            while(v0 < 100) {
                client.np[v0] = true;
                ++v0;
            }

            ak.cv(66);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lx.bv(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }
}

