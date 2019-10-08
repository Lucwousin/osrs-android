import com.jagex.oldscape.osrenderer.ax;

public class hn extends ht {
    hn() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hn.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(byte arg1) {
    }

    void al() {
        __monitor_enter(this);
        try {
            if(this.af != null) {
                goto label_5;
            }
        }
        catch(Throwable v0) {
            goto label_35;
        }

        __monitor_exit(this);
        return;
    label_5:
        int v0_1 = 1018239186;
        int v1 = 0xF34FA638;
        try {
            ax.bb(v0_1);
            v0_1 = ax.bj(-401116775);
            int v2 = ax.bm(0);
            if(v0_1 < v2) {
                while(true) {
                label_13:
                    if(v0_1 < v2) {
                        int v4 = 0x100;
                        this.af(this.af, v4);
                        if(!this.ab) {
                            int[] v3 = this.af;
                            if(hn.al) {
                                v4 = 0x200;
                            }

                            ax.bk(v3, v4, 0x34BC0E9F);
                        }

                        goto label_25;
                    }

                    goto label_27;
                }
            }

            goto label_27;
        }
        catch(Exception ) {
            goto label_27;
        }
        catch(Throwable v0) {
            goto label_30;
        }

    label_25:
        v0_1 += 0x100;
        goto label_13;
        try {
        label_30:
            ax.bc(v1);
            throw v0;
        label_27:
            ax.bc(v1);
        }
        catch(Throwable v0) {
        label_35:
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void am(int arg3) {
        byte v3 = -21;
        try {
            ax.bh(v3);
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hn.am(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void au(int arg2, byte arg3) {
        byte v2 = 87;
        try {
            ax.bz(v2);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hn.au(");
            v3.append(')');
            throw lx.al(((Throwable)v2_1), v3.toString());
        }
    }

    void ax(int arg6) {
        __monitor_enter(this);
        try {
            if(this.af != null) {
                goto label_5;
            }
        }
        catch(Throwable v6) {
            goto label_46;
        }
        catch(RuntimeException v6_1) {
            goto label_37;
        }

        __monitor_exit(this);
        return;
    label_5:
        arg6 = 1030635928;
        int v0 = 0xF34FA638;
        try {
            ax.bb(arg6);
            arg6 = ax.bj(1976052497);
            int v1 = ax.bm(0);
            if(arg6 < v1) {
                while(true) {
                label_13:
                    if(arg6 < v1) {
                        int v3 = 0x100;
                        this.af(this.af, v3);
                        if(!this.ab) {
                            int[] v2 = this.af;
                            if(hn.al) {
                                v3 = 0x200;
                            }

                            ax.bk(v2, v3, 1230907237);
                        }

                        goto label_25;
                    }

                    goto label_27;
                }
            }

            goto label_27;
        }
        catch(Exception ) {
            goto label_27;
        }
        catch(Throwable v6) {
            goto label_30;
        }

    label_25:
        arg6 += 0x100;
        goto label_13;
        try {
        label_30:
            ax.bc(v0);
            throw v6;
        label_27:
            ax.bc(v0);
        }
        catch(Throwable v6) {
        }
        catch(RuntimeException v6_1) {
            try {
            label_37:
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("hn.ax(");
                v0_1.append(')');
                throw lx.al(((Throwable)v6_1), v0_1.toString());
            }
            catch(Throwable v6) {
            label_46:
                __monitor_exit(this);
                throw v6;
            }
        }

        __monitor_exit(this);
    }

    void az(int arg1) {
    }

    void be(int arg1) {
        ax.bz(38);
    }

    void bi() {
        ax.bh(-54);
    }

    void bj(int arg1) {
        ax.bz(23);
    }

    void bk() {
    }

    void bl(int arg1) {
        ax.bz(60);
    }

    void bm() {
    }

    void br() {
        ax.bh(-119);
    }

    void bs(int arg1) {
        ax.bz(66);
    }

    void bu(int arg1) {
        ax.bz(87);
    }

    void ca() {
    }

    void cd() {
    }

    void cf() {
    }

    void cj() {
    }

    void cx() {
    }
}

