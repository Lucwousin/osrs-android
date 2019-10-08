import java.io.IOException;

public class br {
    static ko aq = null;
    static final int ar = 0xFF808080;

    br() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("br.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ae(mz arg3, boolean arg4, byte arg5) {
        mx v3_1;
        try {
            mz v0 = null;
            if(km.an != null) {
                try {
                    km.an.an();
                    goto label_5;
                }
                catch(Exception ) {
                label_5:
                    km.an = v0;
                }
            }

            km.an = arg3;
            md.al(arg4, 0xFF00FF00);
            km.ah.ar = 0;
            dq.ag = ((kd)v0);
            hu.at = ((lq)v0);
            km.ay = 0;
            while(true) {
                v3_1 = km.ab.ae();
                if(v3_1 != null) {
                    km.ad.al(v3_1, ((kd)v3_1).gx);
                    km.aq += 0x95843345;
                    km.af -= -1189983907;
                    continue;
                }

                break;
            }

            while(true) {
                v3_1 = km.au.ae();
                if(v3_1 == null) {
                    break;
                }

                km.ai.al(((mv)v3_1));
                km.av.al(v3_1, ((kd)v3_1).gx);
                km.aa += 0xADC6DAC1;
                km.am -= 0x4404B2FF;
            }

            if(km.ac != 0) {
                try {
                    lq v3_2 = new lq(4);
                    v3_2.ar(4, 99);
                    v3_2.ar(km.ac, 42);
                    v3_2.an(0, 0xDF88004E);
                    km.an.af(v3_2.ae, 0, 4);
                }
                catch(IOException ) {
                    try {
                        km.an.an();
                        goto label_39;
                    }
                    catch(Exception ) {
                    label_39:
                        km.ba += 0x2E50558D;
                        km.an = v0;
                    }
                }
            }

            km.ap = 0;
            km.aj = ji.ax(0x2076E2C1) * 0x645EE94641D33F1L;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("br.ae(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public static void iy(int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            na v6 = cd.al(nf.bo, client.eh.an, 0x900645A9);
            v6.ae.bu(arg4, 3);
            lo v4 = v6.ae;
            int v0 = arg5 ? client.hv * 0x9DEF804D : 0;
            v4.cr(v0, 0x4A90AB9);
            v6.ae.an(arg2, -40297820);
            v6.ae.an(arg3, 0xFF828356);
            client.eh.ae(v6, 0xF3550E42);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("br.iy(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

