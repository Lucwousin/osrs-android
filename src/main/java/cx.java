import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class cx extends dh {
    List ae;
    HashSet al;
    HashSet ax;
    static final int bc = 16;

    cx() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cx.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void ae(lq arg4, lq arg5, int arg6, boolean arg7) {
        this.ap(arg4, arg6, 1940402220);
        int v4 = arg5.ao(53454007);
        this.ax = new HashSet(v4);
        arg6 = 0;
        int v0;
        for(v0 = 0; v0 < v4; ++v0) {
            cp v1 = new cp();
            int v2 = 0x7F030202;
            try {
                v1.ax(arg5, v2);
            }
            catch(IllegalStateException ) {
                goto label_16;
            }

            this.ax.add(v1);
        label_16:
        }

        v4 = arg5.ao(0xD2A133F9);
        this.al = new HashSet(v4);
        while(arg6 < v4) {
            cq v0_1 = new cq();
            byte v1_1 = 0x73;
            try {
                v0_1.ax(arg5, v1_1);
            }
            catch(IllegalStateException ) {
                goto label_30;
            }

            this.al.add(v0_1);
        label_30:
            ++arg6;
        }

        this.al(arg5, arg7, 0xC8F52998);
    }

    void al(lq arg8, boolean arg9, int arg10) {
        int v1;
        try {
            this.ae = new LinkedList();
            arg10 = arg8.ao(1606770016);
            v1 = 0;
            while(true) {
            label_7:
                if(v1 >= arg10) {
                    return;
                }

                int v2 = arg8.bq(0xC5122CAF);
                af v3 = new af(arg8.ac(25));
                int v5 = 1;
                if(arg8.ay(-79) == 1) {
                }
                else {
                    v5 = 0;
                }

                if((arg9) || v5 == 0) {
                    this.ae.add(new co(null, v3, v2, null));
                }

                break;
            }
        }
        catch(RuntimeException v8) {
            goto label_32;
        }

        ++v1;
        goto label_7;
        return;
    label_32:
        StringBuilder v9 = new StringBuilder();
        v9.append("cx.al(");
        v9.append(')');
        throw lx.al(((Throwable)v8), v9.toString());
    }

    static void an(int arg2, byte[] arg3, mr arg4, byte arg5) {
        try {
            kj v5 = new kj();
            v5.ax = 0;
            v5.gx = ((long)arg2);
            v5.al = arg3;
            v5.ae = arg4;
            kf.ax.am(v5, -2117305414);
            kf.ax.aj(421979603);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cx.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void an(lq arg9, boolean arg10) {
        this.ae = new LinkedList();
        int v0 = arg9.ao(0x44B4F183);
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg9.bq(-912350083);
            af v4 = new af(arg9.ac(0x76));
            int v6 = 1;
            if(arg9.ay(-10) == 1) {
            }
            else {
                v6 = 0;
            }

            if((arg10) || v6 == 0) {
                this.ae.add(new co(null, v4, v3, null));
            }
        }
    }

    public static void ap(Collection arg1, int arg2) {
        try {
            arg1.add(dy.al);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cx.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ar(lq arg4, lq arg5, int arg6, boolean arg7) {
        this.ap(arg4, arg6, 0x5DEF27D4);
        int v4 = arg5.ao(0xA537FD46);
        this.ax = new HashSet(v4);
        arg6 = 0;
        int v0;
        for(v0 = 0; v0 < v4; ++v0) {
            cp v1 = new cp();
            int v2 = 0x7F030202;
            try {
                v1.ax(arg5, v2);
            }
            catch(IllegalStateException ) {
                goto label_16;
            }

            this.ax.add(v1);
        label_16:
        }

        v4 = arg5.ao(0x1535C222);
        this.al = new HashSet(v4);
        while(arg6 < v4) {
            cq v0_1 = new cq();
            byte v1_1 = -2;
            try {
                v0_1.ax(arg5, v1_1);
            }
            catch(IllegalStateException ) {
                goto label_30;
            }

            this.al.add(v0_1);
        label_30:
            ++arg6;
        }

        this.al(arg5, arg7, 0xBFB77FE4);
    }

    void ax(lq arg3, lq arg4, int arg5, boolean arg6, int arg7) {
        arg7 = 1747308904;
        try {
            this.ap(arg3, arg5, arg7);
            int v3_1 = arg4.ao(0x40D6AD30);
            this.ax = new HashSet(v3_1);
            for(arg7 = 0; arg7 < v3_1; ++arg7) {
                cp v0 = new cp();
                int v1 = 0x7F030202;
                try {
                    v0.ax(arg4, v1);
                }
                catch(IllegalStateException ) {
                    goto label_16;
                }

                this.ax.add(v0);
            label_16:
            }

            v3_1 = arg4.ao(0xCB6147B);
            this.al = new HashSet(v3_1);
            for(arg7 = 0; arg7 < v3_1; ++arg7) {
                cq v0_1 = new cq();
                try {
                    v0_1.ax(arg4, 0);
                }
                catch(IllegalStateException ) {
                    goto label_30;
                }

                this.al.add(v0_1);
            label_30:
            }

            this.al(arg4, arg6, 0x237B6480);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cx.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static int ba(byte arg5) {
        int v0;
        try {
            v0 = 10000;
            if(client.rv != null) {
                int v1 = 0x4CFB637B;
                if(client.rx * v1 >= client.rv.size()) {
                }
                else {
                    int v5_1 = 0;
                    int v2 = 0;
                    while(v5_1 <= client.rx * v1) {
                        v2 += client.rv.get(v5_1).ar * -760681885;
                        ++v5_1;
                    }

                    return v2 * 10000 / (client.ry * 0x563C5937);
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("cx.ba(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v0;
    }
}

