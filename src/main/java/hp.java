import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class hp {
    static final int ae = 1020;
    Future al;
    ExecutorService ax;
    public static is ea = null;
    static int qa = 0;
    static final int so = 20;

    hp() {
        try {
            super();
            this.ax = Executors.newSingleThreadExecutor();
            this.al = this.ax.submit(new iu());
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hp.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    SecureRandom ab() {
        try {
            return this.al.get();
        }
        catch(Exception ) {
            return bt.ax(-632821409);
        }
    }

    boolean ad() {
        return this.al.isDone();
    }

    SecureRandom ae(byte arg3) {
        try {
            return this.al.get();
        }
        catch(RuntimeException v3) {
        }
        catch(Exception ) {
            int v3_1 = 0x444AA651;
            try {
                return bt.ax(v3_1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0 = new StringBuilder();
                v0.append("hp.ae(");
                v0.append(')');
                throw lx.al(((Throwable)v3), v0.toString());
            }
        }
    }

    static int ae(int arg2, int arg3, int arg4) {
        int v0;
        try {
            mx v2_1 = jb.ax.ax(((long)arg2));
            arg4 = 0;
            if(v2_1 == null) {
                return 0;
            }

            if(arg3 == -1) {
                return 0;
            }

            v0 = 0;
            while(true) {
            label_10:
                if(arg4 >= ((jb)v2_1).ae.length) {
                    return v0;
                }

                if(((jb)v2_1).al[arg4] == arg3) {
                    v0 += ((jb)v2_1).ae[arg4];
                }

                break;
            }
        }
        catch(RuntimeException v2) {
            goto label_24;
        }

        ++arg4;
        goto label_10;
        return v0;
    label_24:
        StringBuilder v3 = new StringBuilder();
        v3.append("hp.ae(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    SecureRandom af() {
        try {
            return this.al.get();
        }
        catch(Exception ) {
            return bt.ax(-1970632662);
        }
    }

    static void ag(int arg3) {
        try {
            int v0 = 0xDF7DE603;
            if(!dw.bx(hq.da * v0, 0x935FF62)) {
                if(dv.bg(hq.da * v0, 0x2F)) {
                }
                else {
                    arg3 = hq.da * v0;
                    if(arg3 != 0) {
                        switch(arg3) {
                            case 2: {
                                goto label_47;
                            }
                            case 3: {
                                goto label_39;
                            }
                            case 4: {
                                goto label_31;
                            }
                        }

                        if(!he.ay(hq.da * v0, 67)) {
                            client.al.aba(-315994780).gj("crsG39", 0x90311D80);
                            eh.ak(false, 0x99B4F050);
                            goto label_59;
                        label_39:
                            if(!he.ay(hq.da * v0, 0x71)) {
                                fs.bc(0x61AAF1F1);
                                goto label_59;
                            label_47:
                                if(!he.ay(hq.da * v0, 87)) {
                                    bz.bb(0x7B);
                                    goto label_59;
                                label_31:
                                    if(!he.ay(hq.da * v0, 0x7C)) {
                                        fz.az(false, false, 0xA0A95949);
                                    }
                                }
                            }
                        }
                    }
                    else {
                        fg.bz(0x4BC238FE);
                        ht.ah(false, -2058366508);
                    }

                label_59:
                    hq.da = 633703253;
                    return;
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("hp.ag(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    boolean aj() {
        return this.al.isDone();
    }

    boolean al(int arg3) {
        try {
            return this.al.isDone();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hp.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void an(int arg17, int arg18, int arg19, boolean arg20, int arg21, boolean arg22, int arg23) {
        int v0 = arg17;
        int v8 = arg18;
        if(v0 < v8) {
            int v1 = v8 + v0;
            try {
                v1 /= 2;
                ih v2 = ew.an[v1];
                ew.an[v1] = ew.an[v8];
                ew.an[v8] = v2;
                v1 = v0;
                int v16 = v1;
                while(v1 < v8) {
                    if(cu.ap(ew.an[v1], v2, arg19, arg20, arg21, arg22, -1873549005) <= 0) {
                        ih v3 = ew.an[v1];
                        ew.an[v1] = ew.an[v16];
                        ew.an[v16] = v3;
                        ++v16;
                    }

                    ++v1;
                }

                ew.an[v8] = ew.an[v16];
                ew.an[v16] = v2;
                hp.an(arg17, v16 - 1, arg19, arg20, arg21, arg22, 1804304783);
                hp.an(v16 + 1, arg18, arg19, arg20, arg21, arg22, 0x5496AC01);
            }
            catch(RuntimeException v0_1) {
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("hp.an(");
                v1_1.append(')');
                throw lx.al(((Throwable)v0_1), v1_1.toString());
            }
        }
    }

    void an() {
        this.ax.shutdown();
        this.ax = null;
    }

    boolean ap() {
        return this.al.isDone();
    }

    public static boolean aq(int arg0, short arg1) {
        boolean v1 = true;
        if((arg0 >> 30 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    SecureRandom aq() {
        try {
            return this.al.get();
        }
        catch(Exception ) {
            return bt.ax(-1546003729);
        }
    }

    void ar() {
        this.ax.shutdown();
        this.ax = null;
    }

    void ax(int arg3) {
        try {
            this.ax.shutdown();
            this.ax = null;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hp.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static boolean dz(hw arg1, int arg2) {
        try {
            boolean v0 = false;
            if(client.jy * 0x2324F123 == 0) {
                return 0;
            }

            if(gu.jg != arg1) {
                if(!bq.dn(0x25130D4)) {
                    if((ii.dx(0xC657C7B0)) && (arg1.al(204640860))) {
                        goto label_22;
                    }

                    if(!le.di(0)) {
                        return v0;
                    }

                    if(!arg1.an(0x89E375F4)) {
                        return v0;
                    }

                    goto label_22;
                }
                else {
                label_22:
                    v0 = true;
                }

                return v0;
            }

            return ee.da(0xA1238FB5);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("hp.dz(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

