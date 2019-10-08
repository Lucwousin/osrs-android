public class en extends er {
    static ly af = null;
    static final int aj = 400;
    final ml aq;
    static mr rs = null;
    static final int su = 14;

    public en(ml arg3) {
        int v0 = 400;
        try {
            super(v0);
            this.aq = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("en.<init>(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public static void ab(int arg4) {
        kp v1 = null;
        try {
            if(1 != kv.an * 0xDDB5E297) {
                return;
            }

            arg4 = kv.ar.al(0x594C78A5);
            if(arg4 > 0 && (kv.ar.av(-34))) {
                arg4 -= bs.ab * 0x510A76F1;
                if(arg4 < 0) {
                    arg4 = 0;
                }

                kv.ar.ax(arg4, -698699107);
                return;
            }

            kv.ar.ai(0x801BB346);
            kv.ar.an(-28);
            kv.an = kv.ap != null ? 0xE84F7A4E : 0;
            dz.ai = v1;
            eo.av = ((gq)v1);
        }
        catch(RuntimeException v4) {
        }
        catch(Exception v4_1) {
            try {
                v4_1.printStackTrace();
                kv.ar.ai(-932038520);
                kv.an = 0;
                dz.ai = v1;
                eo.av = ((gq)v1);
                kv.ap = ((ko)v1);
            }
            catch(RuntimeException v4) {
                StringBuilder v0 = new StringBuilder();
                v0.append("en.ab(");
                v0.append(')');
                throw lx.al(((Throwable)v4), v0.toString());
            }
        }
    }

    static String an(int arg2) {
        String v2_1;
        try {
            v2_1 = li.rg.aj ? ff.az(hq.cg, 0xC52642B0) : hq.cg;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("en.an(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        return v2_1;
    }

    static void aq(int arg2) {
        arg2 = 0;
        try {
            ho.ap = 0;
            while(arg2 < 0x800) {
                ho.an[arg2] = null;
                ho.ar[arg2] = 1;
                ++arg2;
            }
        }
        catch(RuntimeException v2) {
            goto label_15;
        }

        return;
    label_15:
        StringBuilder v0 = new StringBuilder();
        v0.append("en.aq(");
        v0.append(')');
        throw lx.al(((Throwable)v2), v0.toString());
    }

    eg at(int arg3) {
        try {
            return new ev();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("en.at(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    eg[] ay(int arg2, int arg3) {
        try {
            return new ev[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("en.ay(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    eg cg() {
        return new ev();
    }

    eg[] co(int arg1) {
        return new ev[arg1];
    }

    eg cq() {
        return new ev();
    }

    eg cu() {
        return new ev();
    }

    eg cv() {
        return new ev();
    }

    public void dc(lq arg5, int arg6, int arg7) {
        eg v0_1;
        while(true) {
            arg7 = 0xF24F550B;
            try {
                if(arg5.ar * arg7 >= arg6) {
                    return;
                }

                int v0 = 1;
                if(1 == (arg5.ay(-103) & 1)) {
                }
                else {
                    v0 = 0;
                }

                ew v7 = new ew(arg5.bn(9), this.aq);
                ew v1 = new ew(arg5.bn(28), this.aq);
                arg5.bn(-29);
                if(v7.al(0xAEE34F17)) {
                    int v2 = 0xCB65D8C2;
                    eg v3 = this.ap(v7, v2);
                    if(v0 != 0) {
                        v0_1 = this.ap(v1, v2);
                        if(v0_1 == null) {
                            goto label_35;
                        }
                        else if(v3 == v0_1) {
                            goto label_35;
                        }
                        else if(v3 != null) {
                            this.aq(v0_1, 0x5AC8AE2);
                            goto label_35;
                        }
                    }
                    else {
                    label_35:
                        v0_1 = v3;
                    }

                    if(v0_1 != null) {
                        this.aa(v0_1, v7, v1, 48358805);
                        continue;
                    }

                    if(this.al(-1490574702) >= 400) {
                        continue;
                    }

                    this.af(v7, v1, 0x830F8F29).ax = this.al(0x7E389333) * 0x7CF1C39;
                    continue;
                }

                throw new IllegalStateException();
            }
            catch(RuntimeException v5) {
                StringBuilder v6 = new StringBuilder();
                v6.append("en.dc(");
                v6.append(')');
                throw lx.al(((Throwable)v5), v6.toString());
            }
        }
    }

    eg[] dh(int arg1) {
        return new ev[arg1];
    }

    public void dj(lq arg6, int arg7) {
        eg v1_1;
        while(true) {
            if(arg6.ar * 0xF24F550B >= arg7) {
                return;
            }

            int v1 = 1;
            if(1 == (arg6.ay(-100) & 1)) {
            }
            else {
                v1 = 0;
            }

            ew v0 = new ew(arg6.bn(90), this.aq);
            ew v2 = new ew(arg6.bn(50), this.aq);
            arg6.bn(19);
            if(!v0.al(0x4B003086)) {
                break;
            }

            int v3 = 0xCB65D8C2;
            eg v4 = this.ap(v0, v3);
            if(v1 != 0) {
                v1_1 = this.ap(v2, v3);
                if(v1_1 == null) {
                    goto label_35;
                }
                else if(v4 == v1_1) {
                    goto label_35;
                }
                else if(v4 != null) {
                    this.aq(v1_1, 288515706);
                    goto label_35;
                }
            }
            else {
            label_35:
                v1_1 = v4;
            }

            if(v1_1 != null) {
                this.aa(v1_1, v0, v2, 0xF607AF74);
                continue;
            }

            if(this.al(0x4A53619) >= 400) {
                continue;
            }

            this.af(v0, v2, 0x8CD2421C).ax = this.al(-777819053) * 0x7CF1C39;
        }

        throw new IllegalStateException();
    }

    eg[] dp(int arg1) {
        return new ev[arg1];
    }

    public void ds(lq arg6, int arg7) {
        eg v1_1;
        while(true) {
            if(arg6.ar * 0x6EC5553F >= arg7) {
                return;
            }

            int v1 = 1;
            if(1 == (arg6.ay(-68) & 1)) {
            }
            else {
                v1 = 0;
            }

            ew v0 = new ew(arg6.bn(60), this.aq);
            ew v2 = new ew(arg6.bn(-61), this.aq);
            arg6.bn(-22);
            if(!v0.al(0x687705F3)) {
                break;
            }

            int v3 = 0xCB65D8C2;
            eg v4 = this.ap(v0, v3);
            if(v1 != 0) {
                v1_1 = this.ap(v2, v3);
                if(v1_1 == null) {
                    goto label_35;
                }
                else if(v4 == v1_1) {
                    goto label_35;
                }
                else if(v4 != null) {
                    this.aq(v1_1, 0x4831DB2F);
                    goto label_35;
                }
            }
            else {
            label_35:
                v1_1 = v4;
            }

            if(v1_1 != null) {
                this.aa(v1_1, v0, v2, 0xEF972BB9);
                continue;
            }

            if(this.al(-4073507) >= 0xD56AD650) {
                continue;
            }

            this.af(v0, v2, 0x8D61D379).ax = this.al(0x815D76C0) * 0xE4C4E6E7;
        }

        throw new IllegalStateException();
    }

    eg[] dv(int arg1) {
        return new ev[arg1];
    }

    eg[] dw(int arg1) {
        return new ev[arg1];
    }

    public void dy(lq arg6, int arg7) {
        eg v1_1;
        while(true) {
            if(arg6.ar * 0xF24F550B >= arg7) {
                return;
            }

            int v1 = 1;
            if(1 == (arg6.ay(-7) & 1)) {
            }
            else {
                v1 = 0;
            }

            ew v0 = new ew(arg6.bn(-36), this.aq);
            ew v2 = new ew(arg6.bn(-6), this.aq);
            arg6.bn(40);
            if(!v0.al(0xCBFA0A8D)) {
                break;
            }

            int v3 = 0xCB65D8C2;
            eg v4 = this.ap(v0, v3);
            if(v1 != 0) {
                v1_1 = this.ap(v2, v3);
                if(v1_1 == null) {
                    goto label_35;
                }
                else if(v4 == v1_1) {
                    goto label_35;
                }
                else if(v4 != null) {
                    this.aq(v1_1, 634690957);
                    goto label_35;
                }
            }
            else {
            label_35:
                v1_1 = v4;
            }

            if(v1_1 != null) {
                this.aa(v1_1, v0, v2, 660807166);
                continue;
            }

            if(this.al(0x631D8862) >= 400) {
                continue;
            }

            this.af(v0, v2, -1940780230).ax = this.al(0x5169EA39) * 0x7CF1C39;
        }

        throw new IllegalStateException();
    }
}

