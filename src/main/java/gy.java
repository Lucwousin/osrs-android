public class gy {
    static final int ac = 200;
    static final int ad = 0x80;
    static final int ae = 4;
    static final int ai = 0x800;
    static final int aj = 0x40;
    static final int ap = 0x20;
    static final int ar = 8;
    static final int au = 0x4000;
    static final int ax = 1;
    static final int az = 0x10000;
    int bq;
    int bt;
    int bv;
    static final int bw = 0x124018F;
    public int[][] bx;
    int by;
    static final int dl = 0;
    static int dm = 0;
    static final int do = 1;
    static ef[] em;

    public gy(int arg2, int arg3) {
        try {
            super();
            this.by = 0;
            this.bt = 0;
            this.bv = arg2 * 0xE932FB4B;
            this.bq = arg3 * 1572044433;
            this.bx = new int[this.bv * 1165309539][this.bq * 0x64480271];
            this.ax(-400581187);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("gy.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void aa(int arg17, int arg18, int arg19, int arg20, boolean arg21) {
        int v13;
        int v12;
        int v11;
        gy v0 = this;
        int v1 = arg19;
        int v2 = arg20;
        int v3 = arg17 - v0.by * 0xD3E61C35;
        int v4 = arg18 - v0.bt * 0x2144FD29;
        int v5 = 0x20;
        int v6 = 8;
        int v7 = 0x80;
        int v8 = 3;
        int v9 = 2;
        if(v1 == 0) {
            if(v2 == 0) {
                v0.ap(v3, v4, v7, -52517097);
                v0.ap(v3 - 1, v4, v6, 0xC6D88419);
            }

            if(1 == v2) {
                v0.ap(v3, v4, v9, 858330001);
                v0.ap(v3, v4 + 1, v5, 412210762);
            }

            if(v9 == v2) {
                v0.ap(v3, v4, v6, 0xFAD96507);
                v0.ap(v3 + 1, v4, v7, 245027051);
            }

            if(v2 != v8) {
                goto label_42;
            }

            v0.ap(v3, v4, v5, -1295509083);
            v0.ap(v3, v4 - 1, v9, 0x6EFADFAC);
        }

    label_42:
        if(v1 == 1 || v8 == v1) {
            v11 = 16;
            if(v2 == 0) {
                v0.ap(v3, v4, 1, -2077018765);
                v0.ap(v3 - 1, v4 + 1, v11, 0x9177F7E3);
            }

            v12 = 0x40;
            v13 = 4;
            if(1 == v2) {
                v0.ap(v3, v4, v13, 0x72BFA324);
                v0.ap(v3 + 1, v4 + 1, v12, 0x8BEF6DD7);
            }

            if(v9 == v2) {
                v0.ap(v3, v4, v11, 1128124906);
                v0.ap(v3 + 1, v4 - 1, 1, 0xF524CF19);
            }

            if(v2 != v8) {
                goto label_75;
            }

            v0.ap(v3, v4, v12, 0x95086046);
            v0.ap(v3 - 1, v4 - 1, v13, 0x4D4211C9);
        }

    label_75:
        if(v1 == v9) {
            if(v2 == 0) {
                v0.ap(v3, v4, 130, 0xBE70A3D2);
                v0.ap(v3 - 1, v4, v6, 0xD1A968F3);
                v0.ap(v3, v4 + 1, v5, -1105601002);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 10, 0x196E0DD1);
                v0.ap(v3, v4 + 1, v5, -564072870);
                v11 = 0x80;
                v0.ap(v3 + 1, v4, v11, 0x15CE4E29);
            }
            else {
                v11 = 0x80;
            }

            if(v9 == v2) {
                v0.ap(v3, v4, 40, 0x49FB5070);
                v0.ap(v3 + 1, v4, v11, 0xB5E2F8D);
                v0.ap(v3, v4 - 1, v9, 0x66D53887);
            }

            if(v2 != v8) {
                goto label_119;
            }

            v0.ap(v3, v4, 0xA0, 0x3236F7BF);
            v0.ap(v3, v4 - 1, v9, -1025270787);
            v0.ap(v3 - 1, v4, v6, -1703613972);
        }

    label_119:
        if(arg21) {
            v5 = 0x4000;
            v6 = 0x400;
            v7 = 0x1000;
            v11 = 0x10000;
            if(v1 == 0) {
                if(v2 == 0) {
                    v0.ap(v3, v4, v11, 0xF31BF72B);
                    v0.ap(v3 - 1, v4, v7, -1148090099);
                }

                if(1 == v2) {
                    v0.ap(v3, v4, v6, 0x410A037);
                    v0.ap(v3, v4 + 1, v5, 0xDBDAF2C);
                }

                if(v2 == v9) {
                    v0.ap(v3, v4, v7, 0xE2CD76E7);
                    v0.ap(v3 + 1, v4, v11, -649868870);
                }

                if(v8 != v2) {
                    goto label_149;
                }

                v0.ap(v3, v4, v5, 0x207DC16B);
                v0.ap(v3, v4 - 1, v6, 0xFE2F8ADB);
            }

        label_149:
            if(v1 == 1 || v8 == v1) {
                v12 = 0x2000;
                v13 = 0x200;
                if(v2 == 0) {
                    v0.ap(v3, v4, v13, 0x21210630);
                    v0.ap(v3 - 1, v4 + 1, v12, 0x1AFD5FBB);
                }

                if(1 == v2) {
                    v0.ap(v3, v4, 0x800, 1914811057);
                    v0.ap(v3 + 1, v4 + 1, 0x8000, 0xC0E8FBD9);
                }

                if(v9 == v2) {
                    v0.ap(v3, v4, v12, 0xCDFD5F46);
                    v0.ap(v3 + 1, v4 - 1, v13, 0x34974958);
                }

                if(v8 != v2) {
                    goto label_185;
                }

                v0.ap(v3, v4, 0x8000, 0x235B7FF5);
                v0.ap(v3 - 1, v4 - 1, 0x800, 0xC74D0E52);
            }

        label_185:
            if(v9 != v1) {
                return;
            }

            if(v2 == 0) {
                v0.ap(v3, v4, 0x10400, -1930669505);
                v0.ap(v3 - 1, v4, v7, 0xA4A89727);
                v0.ap(v3, v4 + 1, v5, 0x1136D7F1);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 0x1400, 0xD7E9B5C7);
                v0.ap(v3, v4 + 1, v5, 0x9B19AEF9);
                v0.ap(v3 + 1, v4, 0x10000, 0x6F38660D);
            }

            if(v2 == v9) {
                v0.ap(v3, v4, 0x5000, 0x122F962F);
                v0.ap(v3 + 1, v4, 0x10000, 0x780F6706);
                v0.ap(v3, v4 - 1, 0x400, 0xCA856F29);
            }

            if(v8 != v2) {
                return;
            }

            v0.ap(v3, v4, 0x14000, 0xDAF51943);
            v0.ap(v3, v4 - 1, 0x400, 0x7A1C8D0A);
            v0.ap(v3 - 1, v4, v7, 0xF301F22C);
        }
    }

    public void ab(int arg2, int arg3, int arg4) {
        try {
            arg2 -= this.by * 0xD3E61C35;
            arg3 -= this.bt * 0x2144FD29;
            this.bx[arg2][arg3] &= 0xFFFBFFFF;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("gy.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ac(int arg2, int arg3, int arg4) {
        this.bx[arg2][arg3] |= arg4;
    }

    public void ad(int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        int v10 = 0x100;
        if(arg9) {
            v10 = 0x20100;
        }

        int v9 = 0xD3E61C35;
        try {
            arg4 -= this.by * v9;
            arg5 -= this.bt * 0x2144FD29;
            if(1 == arg8 || arg8 == 3) {
                int v2 = arg7;
                arg7 = arg6;
                arg6 = v2;
            }

            arg8 = arg4;
            while(true) {
            label_19:
                if(arg8 >= arg6 + arg4) {
                    return;
                }

                if(arg8 >= 0 && arg8 < this.bv * 1165309539) {
                    v9 = arg5;
                    while(true) {
                    label_27:
                        if(v9 < arg7 + arg5) {
                            if(v9 >= 0 && v9 < this.bq * 0x64480271) {
                                this.aq(arg8, v9, v10, 0xFE9FBAFF);
                            }

                            goto label_36;
                        }

                        goto label_38;
                    }
                }

                goto label_38;
            }
        }
        catch(RuntimeException v4) {
            goto label_43;
        }

    label_36:
        ++v9;
        goto label_27;
    label_38:
        ++arg8;
        goto label_19;
        return;
    label_43:
        StringBuilder v5 = new StringBuilder();
        v5.append("gy.ad(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public void ae(int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        int v0;
        arg9 = 0x100;
        if(arg8) {
            arg9 = 0x20100;
        }

        int v8 = 0xD3E61C35;
        try {
            arg4 -= this.by * v8;
            arg5 -= this.bt * 0x2144FD29;
            v8 = arg4;
            while(true) {
            label_12:
                if(v8 >= arg4 + arg6) {
                    return;
                }

                if(v8 >= 0 && v8 < this.bv * 1165309539) {
                    v0 = arg5;
                    while(true) {
                    label_20:
                        if(v0 < arg5 + arg7) {
                            if(v0 >= 0 && v0 < this.bq * 0x64480271) {
                                this.ap(v8, v0, arg9, 0x8A1CD801);
                            }

                            goto label_29;
                        }

                        goto label_31;
                    }
                }

                goto label_31;
            }
        }
        catch(RuntimeException v4) {
            goto label_36;
        }

    label_29:
        ++v0;
        goto label_20;
    label_31:
        ++v8;
        goto label_12;
        return;
    label_36:
        StringBuilder v5 = new StringBuilder();
        v5.append("gy.ae(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public static byte[] af(Object arg0, boolean arg1, byte arg2) {
        if(arg0 == null) {
            return null;
        }

        try {
            if((arg0 instanceof byte[])) {
                if(arg1) {
                    return co.ai(((byte[])arg0), 0x84CD2731);
                }

                return arg0;
            }

            if((arg0 instanceof nc)) {
                return ((nc)arg0).ax(0xF8D672F1);
            }

            throw new IllegalArgumentException();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gy.af(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void af() {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v3 = 1165309539;
            if(v1 >= this.bv * v3) {
                return;
            }

            int v2;
            for(v2 = 0; true; ++v2) {
                int v5 = 0x64480271;
                if(v2 >= this.bq * v5) {
                    break;
                }

                this.bx[v1][v2] = v1 == 0 || v2 == 0 || v1 >= this.bv * v3 - 5 || v2 >= this.bq * v5 - 5 ? 0xFFFFFF : 0x1000000;
            }
        }
    }

    public void ag(int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int v9 = arg9 ? 0x20100 : 0x100;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0x2144FD29;
        int v0;
        for(v0 = arg5; v0 < arg5 + arg7; ++v0) {
            if(v0 >= 0 && v0 < this.bv * 1165309539) {
                int v1;
                for(v1 = arg6; v1 < arg6 + arg8; ++v1) {
                    if(v1 >= 0 && v1 < this.bq * 0x64480271) {
                        this.ap(v0, v1, v9, 0x30F787BE);
                    }
                }
            }
        }
    }

    public void ah(int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int v9 = arg9 ? 0x1F85B9F8 : 0x1F83B9F8;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0xE5982BE0;
        int v0;
        for(v0 = arg5; v0 < arg5 + arg7; ++v0) {
            if(v0 >= 0 && v0 < this.bv * 0x99F85BEA) {
                int v1;
                for(v1 = arg6; v1 < arg6 + arg8; ++v1) {
                    if(v1 >= 0 && v1 < this.bq * 101737048) {
                        this.ap(v0, v1, v9, -2041013475);
                    }
                }
            }
        }
    }

    public void ai() {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v3 = 1165309539;
            if(v1 >= this.bv * v3) {
                return;
            }

            int v2;
            for(v2 = 0; true; ++v2) {
                int v5 = 0x64480271;
                if(v2 >= this.bq * v5) {
                    break;
                }

                this.bx[v1][v2] = v1 == 0 || v2 == 0 || v1 >= this.bv * v3 - 5 || v2 >= this.bq * v5 - 5 ? 0xFFFFFF : 0x1000000;
            }
        }
    }

    public void aj(int arg17, int arg18, int arg19, int arg20, boolean arg21, byte arg22) {
        int v12;
        int v11;
        gy v1 = this;
        int v0 = arg19;
        int v2 = arg20;
        int v3 = 0xD3E61C35;
        try {
            v3 = arg17 - v1.by * v3;
            int v4 = arg18 - v1.bt * 0x2144FD29;
            int v5 = 0x20;
            int v6 = 8;
            int v7 = 0x80;
            int v8 = 3;
            int v9 = 2;
            if(v0 == 0) {
                if(v2 == 0) {
                    v1.aq(v3, v4, v7, 0xF2970EF);
                    v1.aq(v3 - 1, v4, v6, 0x7066A3AF);
                }

                if(v2 == 1) {
                    v1.aq(v3, v4, v9, 890488987);
                    v1.aq(v3, v4 + 1, v5, 0x1DE30974);
                }

                if(v9 == v2) {
                    v1.aq(v3, v4, v6, 0x552D40A);
                    v1.aq(v3 + 1, v4, v7, 0x80C8269D);
                }

                if(v2 != v8) {
                    goto label_42;
                }

                v1.aq(v3, v4, v5, 0x3F4369F1);
                v1.aq(v3, v4 - 1, v9, 0x2F8318D9);
            }

        label_42:
            if(1 == v0 || v8 == v0) {
                v11 = 16;
                if(v2 == 0) {
                    v1.aq(v3, v4, 1, 297110972);
                    v1.aq(v3 - 1, v4 + 1, v11, 0xCFDD8FBB);
                }

                v12 = 0x40;
                int v13 = 4;
                if(1 == v2) {
                    v1.aq(v3, v4, v13, 0x7E83E223);
                    v1.aq(v3 + 1, v4 + 1, v12, 0x109569C1);
                }

                if(v2 == v9) {
                    v1.aq(v3, v4, v11, 0xCBE5B4B6);
                    v1.aq(v3 + 1, v4 - 1, 1, 0xEE77126F);
                }

                if(v8 != v2) {
                    goto label_75;
                }

                v1.aq(v3, v4, v12, 1777087083);
                v1.aq(v3 - 1, v4 - 1, v13, 0xAEC5B156);
            }

        label_75:
            if(v0 == v9) {
                if(v2 == 0) {
                    v1.aq(v3, v4, 130, 0x9F145536);
                    v1.aq(v3 - 1, v4, v6, 0xB05D3A2D);
                    v1.aq(v3, v4 + 1, v5, 0xE9E01A90);
                }

                if(1 == v2) {
                    v1.aq(v3, v4, 10, 0x25AB6DD6);
                    v1.aq(v3, v4 + 1, v5, 0xA802930F);
                    v1.aq(v3 + 1, v4, 0x80, 1952308347);
                }

                if(v9 == v2) {
                    v1.aq(v3, v4, 40, 0x26D35AED);
                    v1.aq(v3 + 1, v4, 0x80, 0xED73F88E);
                    v1.aq(v3, v4 - 1, v9, 0x3D770BA1);
                }

                if(v8 != v2) {
                    goto label_118;
                }

                v1.aq(v3, v4, 0xA0, 0x72454AEB);
                v1.aq(v3, v4 - 1, v9, 7550568);
                v1.aq(v3 - 1, v4, v6, 436000729);
            }

        label_118:
            if(arg21) {
                v5 = 0x4000;
                v6 = 0x400;
                v7 = 0x1000;
                v11 = 0x10000;
                if(v0 == 0) {
                    if(v2 == 0) {
                        v1.aq(v3, v4, v11, -1724024869);
                        v1.aq(v3 - 1, v4, v7, 0xC80BC523);
                    }

                    if(1 == v2) {
                        v1.aq(v3, v4, v6, -71420806);
                        v1.aq(v3, v4 + 1, v5, 0xB0265123);
                    }

                    if(v2 == v9) {
                        v1.aq(v3, v4, v7, 0xD0B88E3F);
                        v1.aq(v3 + 1, v4, v11, 0xE07F2AD7);
                    }

                    if(v8 != v2) {
                        goto label_148;
                    }

                    v1.aq(v3, v4, v5, -1080941780);
                    v1.aq(v3, v4 - 1, v6, 0x8263AEB);
                }

            label_148:
                if(1 == v0 || v0 == v8) {
                    v12 = 0x200;
                    if(v2 == 0) {
                        v1.aq(v3, v4, v12, 0x250E24DD);
                        v1.aq(v3 - 1, v4 + 1, 0x2000, 0xCEB0EDCC);
                    }

                    v6 = 0x800;
                    if(v2 == 1) {
                        v1.aq(v3, v4, v6, 0xA0385917);
                        v1.aq(v3 + 1, v4 + 1, 0x8000, 0x44A30EBB);
                    }

                    if(v2 == v9) {
                        v1.aq(v3, v4, 0x2000, 0xABF59356);
                        v1.aq(v3 + 1, v4 - 1, v12, 0x5A7043D7);
                    }

                    if(v8 != v2) {
                        goto label_184;
                    }

                    v1.aq(v3, v4, 0x8000, 0x43783763);
                    v1.aq(v3 - 1, v4 - 1, v6, 0x175F3B31);
                }

            label_184:
                if(v0 != v9) {
                    return;
                }

                if(v2 == 0) {
                    v1.aq(v3, v4, 0x10400, 0x6B3054DA);
                    v1.aq(v3 - 1, v4, v7, -1156015910);
                    v1.aq(v3, v4 + 1, v5, 0xFB7EBC7);
                }

                if(1 == v2) {
                    v1.aq(v3, v4, 0x1400, 0x5D3CB5F8);
                    v1.aq(v3, v4 + 1, v5, 0x39B4EA2B);
                    v1.aq(v3 + 1, v4, 0x10000, 0x5EFC40CD);
                }

                if(v9 == v2) {
                    v1.aq(v3, v4, 0x5000, -508333426);
                    v1.aq(v3 + 1, v4, 0x10000, 0x8C60CDCE);
                    v1.aq(v3, v4 - 1, 0x400, 0x1293FB96);
                }

                if(v2 != v8) {
                    return;
                }

                v1.aq(v3, v4, 0x14000, -1632409165);
                v1.aq(v3, v4 - 1, 0x400, 1834080399);
                v1.aq(v3 - 1, v4, v7, 0x80403C7F);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("gy.aj(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void ak(int arg3, int arg4) {
        arg3 -= this.by * 0x5EF0D808;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] |= 1820843639;
    }

    public static dt al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dt.ar.ax(v0);
            if(v5 != null) {
                return ((dt)v5);
            }

            byte[] v4_1 = dt.ax.ae(3, arg4, 0x78DC0DC9);
            dt v5_1 = new dt();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), -1);
            }

            dt.ar.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("gy.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public void al(int arg17, int arg18, int arg19, int arg20, boolean arg21, byte arg22) {
        int v12;
        int v11;
        gy v1 = this;
        int v0 = arg19;
        int v2 = arg20;
        int v3 = 0xD3E61C35;
        try {
            v3 = arg17 - v1.by * v3;
            int v4 = arg18 - v1.bt * 0x2144FD29;
            int v5 = 0x20;
            int v6 = 8;
            int v7 = 0x80;
            int v8 = 3;
            int v9 = 2;
            if(v0 == 0) {
                if(v2 == 0) {
                    v1.ap(v3, v4, v7, 0x5D32DBC3);
                    v1.ap(v3 - 1, v4, v6, 1519696209);
                }

                if(1 == v2) {
                    v1.ap(v3, v4, v9, 0x1A1A0157);
                    v1.ap(v3, v4 + 1, v5, 0x220A5278);
                }

                if(v9 == v2) {
                    v1.ap(v3, v4, v6, 0xFB6AE031);
                    v1.ap(v3 + 1, v4, v7, 150041258);
                }

                if(v2 != v8) {
                    goto label_42;
                }

                v1.ap(v3, v4, v5, 0xB6DD783C);
                v1.ap(v3, v4 - 1, v9, 0x515F61C6);
            }

        label_42:
            if(v0 == 1 || v8 == v0) {
                v11 = 16;
                if(v2 == 0) {
                    v1.ap(v3, v4, 1, 0xD9C8F7FE);
                    v1.ap(v3 - 1, v4 + 1, v11, 560288970);
                }

                v12 = 0x40;
                int v13 = 4;
                if(1 == v2) {
                    v1.ap(v3, v4, v13, 0x99FBF0DE);
                    v1.ap(v3 + 1, v4 + 1, v12, 2076770972);
                }

                if(v9 == v2) {
                    v1.ap(v3, v4, v11, 0x1D418079);
                    v1.ap(v3 + 1, v4 - 1, 1, -2025867805);
                }

                if(v2 != v8) {
                    goto label_75;
                }

                v1.ap(v3, v4, v12, 0xED4DBEF1);
                v1.ap(v3 - 1, v4 - 1, v13, -189355054);
            }

        label_75:
            if(v0 == v9) {
                if(v2 == 0) {
                    v1.ap(v3, v4, 130, 0x8D20C23F);
                    v1.ap(v3 - 1, v4, v6, 0xA1108FF9);
                    v1.ap(v3, v4 + 1, v5, -460028289);
                }

                if(1 == v2) {
                    v1.ap(v3, v4, 10, 0x9B6CE514);
                    v1.ap(v3, v4 + 1, v5, 0x2BBF0B40);
                    v1.ap(v3 + 1, v4, 0x80, -1014289698);
                }

                if(v9 == v2) {
                    v1.ap(v3, v4, 40, 0x2F16F5DB);
                    v1.ap(v3 + 1, v4, 0x80, 0x492890DB);
                    v1.ap(v3, v4 - 1, v9, -2082600773);
                }

                if(v2 != v8) {
                    goto label_118;
                }

                v1.ap(v3, v4, 0xA0, 0x52540633);
                v1.ap(v3, v4 - 1, v9, 0x3739BFAF);
                v1.ap(v3 - 1, v4, v6, -1600031116);
            }

        label_118:
            if(arg21) {
                v5 = 0x4000;
                v6 = 0x1000;
                v7 = 0x400;
                v11 = 0x10000;
                if(v0 == 0) {
                    if(v2 == 0) {
                        v1.ap(v3, v4, v11, 0x9E97613D);
                        v1.ap(v3 - 1, v4, v6, 0xB0E2036C);
                    }

                    if(1 == v2) {
                        v1.ap(v3, v4, v7, 2055066863);
                        v1.ap(v3, v4 + 1, v5, 0xD3940BF6);
                    }

                    if(v2 == v9) {
                        v1.ap(v3, v4, v6, 0x2AC48EA5);
                        v1.ap(v3 + 1, v4, v11, 0x3A9ACFCB);
                    }

                    if(v8 != v2) {
                        goto label_148;
                    }

                    v1.ap(v3, v4, v5, 0x294BDEE2);
                    v1.ap(v3, v4 - 1, v7, 0xDFFA8050);
                }

            label_148:
                if(v0 == 1 || v8 == v0) {
                    v12 = 0x200;
                    if(v2 == 0) {
                        v1.ap(v3, v4, v12, 0x93C7F821);
                        v1.ap(v3 - 1, v4 + 1, 0x2000, 911380068);
                    }

                    v7 = 0x800;
                    if(1 == v2) {
                        v1.ap(v3, v4, v7, 0xC2F4F920);
                        v1.ap(v3 + 1, v4 + 1, 0x8000, 0x539D0538);
                    }

                    if(v9 == v2) {
                        v1.ap(v3, v4, 0x2000, -1700836303);
                        v1.ap(v3 + 1, v4 - 1, v12, 0x1656C217);
                    }

                    if(v8 != v2) {
                        goto label_184;
                    }

                    v1.ap(v3, v4, 0x8000, 0x8750AB8E);
                    v1.ap(v3 - 1, v4 - 1, v7, -777955013);
                }

            label_184:
                if(v9 != v0) {
                    return;
                }

                if(v2 == 0) {
                    v1.ap(v3, v4, 0x10400, 2032605858);
                    v1.ap(v3 - 1, v4, v6, 0x532C7798);
                    v1.ap(v3, v4 + 1, v5, 0x5C602462);
                }

                if(1 == v2) {
                    v1.ap(v3, v4, 0x1400, 0x62C191B2);
                    v1.ap(v3, v4 + 1, v5, -1401442668);
                    v1.ap(v3 + 1, v4, 0x10000, 0xCC29AF69);
                }

                if(v2 == v9) {
                    v1.ap(v3, v4, 0x5000, 0x2B5EB224);
                    v1.ap(v3 + 1, v4, 0x10000, 97658057);
                    v1.ap(v3, v4 - 1, 0x400, 0x38432874);
                }

                if(v8 != v2) {
                    return;
                }

                v1.ap(v3, v4, 0x14000, -703461410);
                v1.ap(v3, v4 - 1, 0x400, -1113096791);
                v1.ap(v3 - 1, v4, v6, 0x33F337B);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("gy.al(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public static ds al(int arg1, int arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 >= ds.al.length) {
                }
                else {
                    return ds.al[arg1];
                }

            label_10:
                return ds.ae;
            label_9:
                goto label_12;
            }
            catch(RuntimeException v1) {
                goto label_9;
            }
        }

        goto label_10;
    label_12:
        StringBuilder v2 = new StringBuilder();
        v2.append("gy.al(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
    }

    public void am(int arg17, int arg18, int arg19, int arg20, boolean arg21) {
        int v11;
        int v10;
        gy v0 = this;
        int v1 = arg19;
        int v2 = arg20;
        int v3 = arg17 - v0.by * 0x8FB06945;
        int v4 = arg18 - v0.bt * 0x2144FD29;
        int v5 = 0x20;
        int v6 = 8;
        int v7 = 3;
        int v8 = 2;
        if(v1 == 0) {
            v10 = 0x80;
            if(v2 == 0) {
                v0.ap(v3, v4, v10, 0xBE5158E);
                v0.ap(v3 - 1, v4, v6, 0xAEDB1361);
            }

            if(1 == v2) {
                v0.ap(v3, v4, v8, -1150831593);
                v0.ap(v3, v4 + 1, 0x693B46A0, 0xF2EE7F7E);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, v6, 0x5590E2EE);
                v0.ap(v3 + 1, v4, v10, 0x8A190778);
            }

            if(v2 != v7) {
                goto label_43;
            }

            v0.ap(v3, v4, v5, 0xA15913D6);
            v0.ap(v3, v4 - 1, v8, 0x6800F05A);
        }

    label_43:
        if(v1 == 1 || v7 == v1) {
            v10 = 16;
            if(v2 == 0) {
                v0.ap(v3, v4, 1, 0x13A2DFEE);
                v0.ap(v3 - 1, v4 + 1, v10, 0x21C0464D);
            }

            v11 = 0x40;
            int v12 = 4;
            if(1 == v2) {
                v0.ap(v3, v4, v12, 0x91750083);
                v0.ap(v3 + 1, v4 + 1, v11, 0x696409F4);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, v10, 0x4CE904E1);
                v0.ap(v3 + 1, v4 - 1, 1, 0x6CEEE2B5);
            }

            if(v2 != v7) {
                goto label_76;
            }

            v0.ap(v3, v4, v11, 0xF63D951C);
            v0.ap(v3 - 1, v4 - 1, v12, 0xFB72A60B);
        }

    label_76:
        if(v1 == v8) {
            if(v2 == 0) {
                v0.ap(v3, v4, 130, -258469400);
                v0.ap(v3 - 1, v4, v6, 0xE6B903D8);
                v0.ap(v3, v4 + 1, v5, -722575001);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 10, -450320465);
                v0.ap(v3, v4 + 1, v5, -900810505);
                v0.ap(v3 + 1, v4, 1201396040, -2095505621);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, 0x88556FF9, 1716007938);
                v0.ap(v3 + 1, v4, 300914645, 295490875);
                v0.ap(v3, v4 - 1, v8, 0xFF9407D1);
            }

            if(v2 != v7) {
                goto label_119;
            }

            v0.ap(v3, v4, 0xDFB9CDE1, -672304523);
            v0.ap(v3, v4 - 1, v8, -1924389801);
            v0.ap(v3 - 1, v4, v6, 1360786018);
        }

    label_119:
        if(arg21) {
            v5 = 0x10000;
            v6 = 0x4000;
            v10 = 0x400;
            if(v1 == 0) {
                if(v2 == 0) {
                    v0.ap(v3, v4, v5, 0x12F91208);
                    v0.ap(v3 - 1, v4, 0xAF26BB28, 1986706893);
                }

                if(1 == v2) {
                    v0.ap(v3, v4, v10, -1030890336);
                    v0.ap(v3, v4 + 1, v6, 0xD4CD1A1F);
                }

                if(v2 == v8) {
                    v0.ap(v3, v4, 0x1000, 0xC605DAFD);
                    v0.ap(v3 + 1, v4, 0x6F8A7514, 0x966C3D9A);
                }

                if(v7 != v2) {
                    goto label_151;
                }

                v0.ap(v3, v4, v6, 0x37C523E7);
                v0.ap(v3, v4 - 1, v10, 0x34C758C1);
            }

        label_151:
            if(v1 == 1 || v7 == v1) {
                if(v2 == 0) {
                    v0.ap(v3, v4, 0x808E8DA5, 0x30197FE5);
                    v0.ap(v3 - 1, v4 + 1, 0xE3CC95D4, -100080493);
                }

                v11 = 0x8000;
                if(1 == v2) {
                    v0.ap(v3, v4, 0xD30D27C2, -1002002425);
                    v0.ap(v3 + 1, v4 + 1, v11, 0xE58085E7);
                }

                if(v8 == v2) {
                    v0.ap(v3, v4, 0xADF258BA, -43671105);
                    v0.ap(v3 + 1, v4 - 1, 2063701402, 1423300028);
                }

                if(v7 != v2) {
                    goto label_188;
                }

                v0.ap(v3, v4, v11, 0x980C07AB);
                v0.ap(v3 - 1, v4 - 1, -373710075, 0xB67D5E81);
            }

        label_188:
            if(v8 != v1) {
                return;
            }

            if(v2 == 0) {
                v0.ap(v3, v4, 0xBBC440CF, 0x62D0F62);
                v0.ap(v3 - 1, v4, 0x6F6566E4, -2025972116);
                v0.ap(v3, v4 + 1, v6, 0xBFF31C4C);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 0x1400, 0x492ADECA);
                v0.ap(v3, v4 + 1, 0x95A1A69A, 0x4B6DAF6D);
                v0.ap(v3 + 1, v4, -1366528905, 0xA357B04B);
            }

            if(v2 == v8) {
                v0.ap(v3, v4, 0x9A2F572, 0x32DC8436);
                v0.ap(v3 + 1, v4, v5, 1674107988);
                v0.ap(v3, v4 - 1, v10, 0xE31DAA54);
            }

            if(v7 != v2) {
                return;
            }

            v0.ap(v3, v4, 0x14000, -174220465);
            v0.ap(v3, v4 - 1, v10, 0x6C516C83);
            v0.ap(v3 - 1, v4, 0x48B7AFC5, 0x994DDFFC);
        }
    }

    public static void an(lq arg2, int arg3, int arg4) {
        try {
            if(mm.ab != null) {
                try {
                    mm.ab.al(0);
                    mm.ab.aj(arg2.ae, arg3, 24, 0xB984CE18);
                }
                catch(Exception ) {
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("gy.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void an(int arg2, int arg3, byte arg4) {
        try {
            arg2 -= this.by * 0xD3E61C35;
            arg3 -= this.bt * 0x2144FD29;
            this.bx[arg2][arg3] |= 0x40000;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("gy.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ao(int arg3, int arg4) {
        arg3 -= this.by * 659781405;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] |= 0x200000;
    }

    void ap(int arg1, int arg2, int arg3, int arg4) {
        try {
            this.bx[arg1][arg2] |= arg3;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gy.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void aq(int arg1, int arg2, int arg3, int arg4) {
        try {
            this.bx[arg1][arg2] &= ~arg3;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gy.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ar(int arg2, int arg3, int arg4) {
        arg4 = 0xD3E61C35;
        try {
            arg2 -= this.by * arg4;
            arg3 -= this.bt * 0x2144FD29;
            this.bx[arg2][arg3] |= 0x200000;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("gy.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void as(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] |= 0x40000;
    }

    public void at(int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int v9 = arg9 ? 0x20100 : 0x100;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0x2144FD29;
        int v0;
        for(v0 = arg5; v0 < arg5 + arg7; ++v0) {
            if(v0 >= 0 && v0 < this.bv * 1165309539) {
                int v1;
                for(v1 = arg6; v1 < arg6 + arg8; ++v1) {
                    if(v1 >= 0 && v1 < this.bq * 0x64480271) {
                        this.ap(v0, v1, v9, 0xF42C3FF1);
                    }
                }
            }
        }
    }

    public void au(int arg17, int arg18, int arg19, int arg20, boolean arg21) {
        gy v0 = this;
        int v1 = arg19;
        int v2 = arg20;
        int v3 = arg17 - v0.by * 0xB09E1213;
        int v4 = arg18 - v0.bt * 0x2144FD29;
        int v5 = 0x80;
        int v6 = 8;
        int v7 = 3;
        int v8 = 2;
        if(v1 == 0) {
            if(v2 == 0) {
                v0.ap(v3, v4, v5, 496050258);
                v0.ap(v3 - 1, v4, v6, -2074553265);
            }

            if(1 == v2) {
                v0.ap(v3, v4, v8, 0x20E98FAC);
                v0.ap(v3, v4 + 1, 0x952F74C1, 0x20AA9CAA);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, v6, 0xFB108DC5);
                v0.ap(v3 + 1, v4, 0x4F62F0F6, 0x1F233505);
            }

            if(v2 != v7) {
                goto label_44;
            }

            v0.ap(v3, v4, 0xB6062189, 1053342737);
            v0.ap(v3, v4 - 1, v8, 1655929660);
        }

    label_44:
        if(v1 == 1 || v7 == v1) {
            int v10 = 16;
            if(v2 == 0) {
                v0.ap(v3, v4, 1, -804935002);
                v0.ap(v3 - 1, v4 + 1, v10, 0xE3904D8F);
            }

            int v11 = 4;
            if(1 == v2) {
                v0.ap(v3, v4, v11, 0x1D830502);
                v0.ap(v3 + 1, v4 + 1, -2111077404, 0x43F40BF2);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, v10, 0x712FBBE5);
                v0.ap(v3 + 1, v4 - 1, 1, -374022560);
            }

            if(v2 != v7) {
                goto label_78;
            }

            v0.ap(v3, v4, 959169150, 0xEB8FFC1A);
            v0.ap(v3 - 1, v4 - 1, v11, 0xBB17102A);
        }

    label_78:
        if(v1 == v8) {
            if(v2 == 0) {
                v0.ap(v3, v4, 0x7E84EFA9, -1416248760);
                v0.ap(v3 - 1, v4, v6, -1704472510);
                v0.ap(v3, v4 + 1, 0x12CD7EDA, 0xEA9CDBC4);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 10, 1180804755);
                v0.ap(v3, v4 + 1, 0x227354FD, 0x3034245F);
                v0.ap(v3 + 1, v4, v5, 0xE220EE4A);
            }

            if(v8 == v2) {
                v0.ap(v3, v4, 0xFC3C7D32, -1070935751);
                v0.ap(v3 + 1, v4, v5, -343694038);
                v0.ap(v3, v4 - 1, v8, 0x63F5988E);
            }

            if(v2 != v7) {
                goto label_121;
            }

            v0.ap(v3, v4, -496905390, 0xF734DFDD);
            v0.ap(v3, v4 - 1, v8, -605256059);
            v0.ap(v3 - 1, v4, v6, 0x9B59333F);
        }

    label_121:
        if(arg21) {
            v5 = 0x400;
            if(v1 == 0) {
                if(v2 == 0) {
                    v0.ap(v3, v4, -37653960, 0x9A1F4F05);
                    v0.ap(v3 - 1, v4, 0x1000, 1238786740);
                }

                if(1 == v2) {
                    v0.ap(v3, v4, v5, 0xB48AEC81);
                    v0.ap(v3, v4 + 1, 112892530, 0x8E85A370);
                }

                if(v2 == v8) {
                    v0.ap(v3, v4, 0x3F8CB758, -598189110);
                    v0.ap(v3 + 1, v4, -1274006042, 0x9944C4D3);
                }

                if(v7 != v2) {
                    goto label_155;
                }

                v0.ap(v3, v4, -1320496662, 142165210);
                v0.ap(v3, v4 - 1, 0x4AFA31CE, 0xE4CF8DAD);
            }

        label_155:
            if(v1 == 1 || v7 == v1) {
                if(v2 == 0) {
                    v0.ap(v3, v4, 0xFB079EF6, 0xA07460AD);
                    v0.ap(v3 - 1, v4 + 1, 0xCEF0B947, 0x2E8F9E92);
                }

                v6 = 0x8000;
                if(1 == v2) {
                    v0.ap(v3, v4, 0x800, 0x5D806C08);
                    v0.ap(v3 + 1, v4 + 1, v6, 640035122);
                }

                if(v8 == v2) {
                    v0.ap(v3, v4, 0x2000, -1456900272);
                    v0.ap(v3 + 1, v4 - 1, 0x200, 0xE257CC98);
                }

                if(v7 != v2) {
                    goto label_192;
                }

                v0.ap(v3, v4, v6, 0xA6A96357);
                v0.ap(v3 - 1, v4 - 1, 0xD9FD3ED, 0x3937E68E);
            }

        label_192:
            if(v8 != v1) {
                return;
            }

            if(v2 == 0) {
                v0.ap(v3, v4, 711339320, -874947800);
                v0.ap(v3 - 1, v4, 0xC5D914BA, 0xD7F5A9DB);
                v0.ap(v3, v4 + 1, 0xF9E779C, 0x452F1AE0);
            }

            if(1 == v2) {
                v0.ap(v3, v4, 0xEF5D46B6, -125679200);
                v0.ap(v3, v4 + 1, 0x4000, 0x7295D376);
                v0.ap(v3 + 1, v4, 0x75629725, 0xBD6C89A1);
            }

            if(v2 == v8) {
                v0.ap(v3, v4, 0x1D43C4F0, -2044757105);
                v0.ap(v3 + 1, v4, -1290316034, -1010629736);
                v0.ap(v3, v4 - 1, v5, 1854430540);
            }

            if(v7 != v2) {
                return;
            }

            v0.ap(v3, v4, 0x14000, -460099199);
            v0.ap(v3, v4 - 1, 0x8B5F53BB, 1263776030);
            v0.ap(v3 - 1, v4, 0xA9D0BF39, 0x40B24CF1);
        }
    }

    static int av(int arg1, int arg2, int arg3, int arg4) {
        try {
            if((id.al[arg1][arg2][arg3] & 8) != 0) {
                return 0;
            }

            if(arg1 > 0) {
                if((id.al[1][arg2][arg3] & 2) == 0) {
                    return arg1;
                }

                goto label_16;
            }

            return arg1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gy.av(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

    label_16:
        return arg1 - 1;
    }

    public void av() {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v3 = 1165309539;
            if(v1 >= this.bv * v3) {
                return;
            }

            int v2;
            for(v2 = 0; true; ++v2) {
                int v5 = 0x64480271;
                if(v2 >= this.bq * v5) {
                    break;
                }

                this.bx[v1][v2] = v1 == 0 || v2 == 0 || v1 >= this.bv * v3 - 5 || v2 >= this.bq * v5 - 5 ? 0xFFFFFF : 0x1000000;
            }
        }
    }

    public void aw(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] |= 0x200000;
    }

    public void ax(int arg6) {
        int v1;
        int v0 = 0;
        try {
            while(true) {
            label_2:
                int v2 = 1165309539;
                if(v0 >= this.bv * v2) {
                    return;
                }

                v1 = 0;
                while(true) {
                label_7:
                    int v4 = 0x64480271;
                    if(v1 >= this.bq * v4) {
                        goto label_33;
                    }

                    this.bx[v0][v1] = v0 == 0 || v1 == 0 || v0 >= this.bv * v2 - 5 || v1 >= this.bq * v4 - 5 ? 0xFFFFFF : 0x1000000;
                    break;
                }
            }
        }
        catch(RuntimeException v6) {
            goto label_38;
        }

        ++v1;
        goto label_7;
    label_33:
        ++v0;
        goto label_2;
    label_38:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("gy.ax(");
        v0_1.append(')');
        throw lx.al(((Throwable)v6), v0_1.toString());
    }

    public void ay(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] |= 0x200000;
    }

    public void az(int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int v9 = arg9 ? 0x7F1FFD2C : 0x100;
        arg5 -= this.by * 1977102981;
        arg6 -= this.bt * 1205491703;
        int v0;
        for(v0 = arg5; v0 < arg5 + arg7; ++v0) {
            if(v0 >= 0 && v0 < this.bv * 1165309539) {
                int v1;
                for(v1 = arg6; v1 < arg6 + arg8; ++v1) {
                    if(v1 >= 0 && v1 < this.bq * 0xE3C08351) {
                        this.ap(v0, v1, v9, 2065945690);
                    }
                }
            }
        }
    }

    public void ba(int arg17, int arg18, int arg19, int arg20, boolean arg21) {
        int v10;
        gy v0 = this;
        int v1 = arg19;
        int v2 = arg20;
        int v3 = arg17 - v0.by * 0xD3E61C35;
        int v4 = arg18 - v0.bt * 0x3A85BAE6;
        int v5 = 0x80;
        int v6 = 8;
        int v7 = 3;
        int v8 = 2;
        if(v1 == 0) {
            if(v2 == 0) {
                v0.aq(v3, v4, v5, -594063970);
                v0.aq(v3 - 1, v4, v6, 0xB720BD33);
            }

            if(v2 == 1) {
                v0.aq(v3, v4, v8, 0xE05B78E8);
                v0.aq(v3, v4 + 1, 0x21D5D1, 1390249429);
            }

            if(v8 == v2) {
                v0.aq(v3, v4, v6, 1370596535);
                v0.aq(v3 + 1, v4, 0x6505A7C2, 0x3CFE1473);
            }

            if(v2 != v7) {
                goto label_44;
            }

            v0.aq(v3, v4, -2098652261, 0x2F7348F5);
            v0.aq(v3, v4 - 1, v8, 0xBAC9C718);
        }

    label_44:
        if(1 == v1 || v7 == v1) {
            v10 = 16;
            if(v2 == 0) {
                v0.aq(v3, v4, 1, -1436002513);
                v0.aq(v3 - 1, v4 + 1, v10, 0xAD7828D7);
            }

            int v11 = 0x40;
            int v12 = 4;
            if(1 == v2) {
                v0.aq(v3, v4, v12, -2114088030);
                v0.aq(v3 + 1, v4 + 1, v11, 1584798042);
            }

            if(v2 == v8) {
                v0.aq(v3, v4, v10, 0x962D6F4D);
                v0.aq(v3 + 1, v4 - 1, 1, 1986780535);
            }

            if(v7 != v2) {
                goto label_77;
            }

            v0.aq(v3, v4, v11, 0xEBA272FE);
            v0.aq(v3 - 1, v4 - 1, v12, 1837738170);
        }

    label_77:
        if(v1 == v8) {
            v10 = 0x20;
            if(v2 == 0) {
                v0.aq(v3, v4, 0xBBA93F6A, -1904522397);
                v0.aq(v3 - 1, v4, v6, 0xFC692FFB);
                v0.aq(v3, v4 + 1, v10, 0xE4898621);
            }

            if(1 == v2) {
                v0.aq(v3, v4, 10, 0x712BD4E9);
                v0.aq(v3, v4 + 1, v10, 0x5A650FD8);
                v0.aq(v3 + 1, v4, v5, 0xF565FA9D);
            }

            if(v8 == v2) {
                v0.aq(v3, v4, 40, 0x383F833A);
                v0.aq(v3 + 1, v4, 0xCEA39E81, -2026712);
                v0.aq(v3, v4 - 1, v8, 0x3503591E);
            }

            if(v7 != v2) {
                goto label_120;
            }

            v0.aq(v3, v4, 0xA0, 709293605);
            v0.aq(v3, v4 - 1, v8, 0x80FC0987);
            v0.aq(v3 - 1, v4, v6, 0xC7621047);
        }

    label_120:
        if(arg21) {
            v5 = 0x1000;
            if(v1 == 0) {
                if(v2 == 0) {
                    v0.aq(v3, v4, 0x707672C5, 0xFE052DBC);
                    v0.aq(v3 - 1, v4, v5, 0xCBC6FBEB);
                }

                v6 = 0x4000;
                v10 = 0x400;
                if(1 == v2) {
                    v0.aq(v3, v4, v10, 0xC30FB352);
                    v0.aq(v3, v4 + 1, v6, 1500844711);
                }

                if(v2 == v8) {
                    v0.aq(v3, v4, 371421720, 0x7CAD3044);
                    v0.aq(v3 + 1, v4, 0xB68EA42F, 0x904487D9);
                }

                if(v7 != v2) {
                    goto label_152;
                }

                v0.aq(v3, v4, v6, 0x6D4267F9);
                v0.aq(v3, v4 - 1, v10, -1043227592);
            }

        label_152:
            if(1 == v1 || v1 == v7) {
                v6 = 0x2000;
                if(v2 == 0) {
                    v0.aq(v3, v4, 0xEDA02FFA, 0x7E83115C);
                    v0.aq(v3 - 1, v4 + 1, v6, 0xF8FD7A66);
                }

                v10 = 0x8000;
                if(v2 == 1) {
                    v0.aq(v3, v4, 120430571, 0xD3E9EDE9);
                    v0.aq(v3 + 1, v4 + 1, v10, -1542042502);
                }

                if(v2 == v8) {
                    v0.aq(v3, v4, v6, 2080457145);
                    v0.aq(v3 + 1, v4 - 1, -590244003, 0x66411A99);
                }

                if(v7 != v2) {
                    goto label_188;
                }

                v0.aq(v3, v4, v10, 0x2D80BC9C);
                v0.aq(v3 - 1, v4 - 1, 0xE09384F6, 0x79D9027F);
            }

        label_188:
            if(v1 != v8) {
                return;
            }

            if(v2 == 0) {
                v0.aq(v3, v4, 0x10400, 0x6E86E41F);
                v0.aq(v3 - 1, v4, v5, 0xB20580F);
                v0.aq(v3, v4 + 1, 0x5586F73D, 0x28850EA0);
            }

            if(1 == v2) {
                v0.aq(v3, v4, 0xE059AD16, -2116469018);
                v0.aq(v3, v4 + 1, 0x122F5B, 0xA3D5FF61);
                v0.aq(v3 + 1, v4, 0x10000, 0x5A244CED);
            }

            if(v8 == v2) {
                v0.aq(v3, v4, 0x30F71EEE, 1667773330);
                v0.aq(v3 + 1, v4, -894907953, 0xA5CC5E1);
                v0.aq(v3, v4 - 1, 0xA37BA520, 0x9C65F066);
            }

            if(v2 != v7) {
                return;
            }

            v0.aq(v3, v4, 0xD14D3908, 0x2D92FFEC);
            v0.aq(v3, v4 - 1, 320415585, 0x6056221E);
            v0.aq(v3 - 1, v4, v5, -104955601);
        }
    }

    void bd(int arg2, int arg3, int arg4) {
        this.bx[arg2][arg3] |= arg4;
    }

    public void bf(int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int v10 = arg10 ? 0x20100 : 0x100;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0x2144FD29;
        if(1 == arg9 || arg9 == 3) {
            int v3 = arg8;
            arg8 = arg7;
            arg7 = v3;
        }

        for(arg9 = arg5; arg9 < arg7 + arg5; ++arg9) {
            if(arg9 >= 0 && arg9 < this.bv * 1165309539) {
                int v0;
                for(v0 = arg6; v0 < arg8 + arg6; ++v0) {
                    if(v0 >= 0 && v0 < this.bq * 0x25FB543E) {
                        this.aq(arg9, v0, v10, 0x62D21C20);
                    }
                }
            }
        }
    }

    public void bn(int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int v10 = arg10 ? 1419697049 : 0x100;
        arg5 -= this.by * -1517193700;
        arg6 -= this.bt * 0x1F052809;
        if(1 == arg9 || arg9 == 3) {
            int v3 = arg8;
            arg8 = arg7;
            arg7 = v3;
        }

        for(arg9 = arg5; arg9 < arg7 + arg5; ++arg9) {
            if(arg9 >= 0 && arg9 < this.bv * 1165309539) {
                int v0;
                for(v0 = arg6; v0 < arg8 + arg6; ++v0) {
                    if(v0 >= 0 && v0 < this.bq * 0x64480271) {
                        this.aq(arg9, v0, v10, 0xB6CA6655);
                    }
                }
            }
        }
    }

    void bo(int arg2, int arg3, int arg4) {
        this.bx[arg2][arg3] &= ~arg4;
    }

    public void bp(int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int v10 = arg10 ? 0x10EFF603 : 0x100;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0x2144FD29;
        if(1 == arg9 || arg9 == 3) {
            int v3 = arg8;
            arg8 = arg7;
            arg7 = v3;
        }

        for(arg9 = arg5; arg9 < arg7 + arg5; ++arg9) {
            if(arg9 >= 0 && arg9 < this.bv * 1165309539) {
                int v0;
                for(v0 = arg6; v0 < arg8 + arg6; ++v0) {
                    if(v0 >= 0 && v0 < this.bq * 0x64480271) {
                        this.aq(arg9, v0, v10, 0xFF9D4A01);
                    }
                }
            }
        }
    }

    public void bq(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] &= 0xFFFBFFFF;
    }

    public void bt(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] &= 0xFFFBFFFF;
    }

    public void bv(int arg3, int arg4) {
        arg3 -= this.by * 0x87C9065B;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] &= 0xFFFBFFFF;
    }

    static int bw(int arg13) {
        int v5;
        arg13 = 0x249E9B9;
        try {
            int v0 = hq.fz.ae * arg13;
            int v1 = hq.fz.ar * 0xEE0C033F;
            ib v13_1 = ds.bp(0x600120EE);
            int v3 = 0x399617D7;
            int v2 = v13_1.aq * v3 + 23;
            int v4 = v13_1.aj * 0xE1ECC05D + hq.ab * 0x4D586FC3;
            int v7 = 0x9BA2F453;
            v5 = hq.ev * 0xE513D117 * (v13_1.ar * v7);
            int v8 = 0;
            while(true) {
            label_30:
                if(v5 >= ih.ap * 0x6DE6A9AD) {
                    return -1;
                }

                int v9 = -250202335;
                int v10 = -204538603;
                if(v0 >= v4 && v1 >= v2 && v0 < v13_1.ax * v10 + v4 && v1 < v13_1.al * v9 + v2) {
                    return v5;
                }

                v2 += v13_1.ap * 0xDF01D95D + v13_1.al * v9;
                ++v8;
                if(v8 >= v13_1.ar * v7) {
                    v2 = v13_1.aq * v3 + 23;
                    v4 += v13_1.ax * v10 + v13_1.an * 0x75C55DF7;
                    v8 = 0;
                }

                break;
            }
        }
        catch(RuntimeException v13) {
            goto label_75;
        }

        ++v5;
        goto label_30;
        return -1;
    label_75:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("gy.bw(");
        v0_1.append(')');
        throw lx.al(((Throwable)v13), v0_1.toString());
    }

    public void bw(int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int v10 = arg10 ? 0x20100 : 0x100;
        arg5 -= this.by * 0xD3E61C35;
        arg6 -= this.bt * 0x2144FD29;
        if(1 == arg9 || arg9 == 3) {
            int v3 = arg8;
            arg8 = arg7;
            arg7 = v3;
        }

        for(arg9 = arg5; arg9 < arg7 + arg5; ++arg9) {
            if(arg9 >= 0 && arg9 < this.bv * 1165309539) {
                int v0;
                for(v0 = arg6; v0 < arg8 + arg6; ++v0) {
                    if(v0 >= 0 && v0 < this.bq * 0x64480271) {
                        this.aq(arg9, v0, v10, 0xD137A221);
                    }
                }
            }
        }
    }

    public void bx(int arg3, int arg4) {
        arg3 -= this.by * 0x8C9D6ED;
        arg4 -= this.bt * 1507126196;
        this.bx[arg3][arg4] &= 0xFFFBFFFF;
    }

    public void by(int arg3, int arg4) {
        arg3 -= this.by * 0xD3E61C35;
        arg4 -= this.bt * 0x2144FD29;
        this.bx[arg3][arg4] &= 0xFFFBFFFF;
    }

    static void fb(String arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            cn.fh.af(arg7, arg8, arg9, 0xFFFF00, -1, client.al.uu.ax(485001836));
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("gy.fb(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }
}

