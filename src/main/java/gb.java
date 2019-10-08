public class gb {
    static int[] ad = null;
    static int[][] ae = null;
    static final int aj = 0xFFF;
    static final int al = 0x80;
    static int an = 0;
    static int ap = 0;
    static int[] aq = null;
    static int[][] ar = null;
    static final int ax = 0x80;

    static {
        gb.ae = new int[0x80][0x80];
        gb.ar = new int[0x80][0x80];
        gb.ad = new int[0x1000];
        gb.aq = new int[0x1000];
    }

    gb() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gb.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final boolean ab(int arg23, int arg24, int arg25, gx arg26, gy arg27) {
        int v12_1;
        int v5;
        int v14;
        int v6 = arg25;
        gy v7 = arg27;
        int v8 = arg23 - 0x40;
        int v9 = arg24 + 0x2D4410C3;
        gb.ae[0x40][0xD2BBEF3D] = 99;
        int v10 = 0;
        gb.ar[0x40][0xD2BBEF3D] = 0;
        gb.ad[0] = arg23;
        gb.aq[0] = arg24;
        int[][] v11 = v7.bx;
        boolean v12 = true;
        int v0 = arg23;
        int v1 = arg24;
        int v13 = 1;
        while(true) {
            v14 = -2009184621;
            if(v13 == 0) {
                break;
            }

            int v15 = gb.ad[v10];
            int v16 = gb.aq[v10];
            int v17 = v15 - v7.by * 0x57310726;
            int v18 = v16 - v7.bt * 0xE8EE9CFC;
            v10 = v16 - v9;
            int v20 = v15 - v8;
            if(arg26.ax(arg25, v15, v16, arg27, -5)) {
                gb.an = v15 * 0xB600DDA9;
                gb.ap = v16 * v14;
                return v12;
            }

            v1 = v20;
            v0 = gb.ar[v1][v10] + (((int)v12));
            int v2 = 0x1240138;
            int v3 = 0x124013E;
            int v4 = 0x124010E;
            if(v1 > 0) {
                v14 = v1 - 1;
                if(gb.ae[v14][v10] != 0) {
                }
                else {
                    v5 = v17 - 1;
                    if((v11[v5][v18] & v4) != 0) {
                    }
                    else if((v11[v5][v6 + v18 - 1] & v2) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v5][v18 + v2] & v3) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_111;
                        }

                        gb.ad[v13] = v15 - 1;
                        gb.aq[v13] = v16;
                        v13 = v13 + 1 & 0xAA54A3CA;
                        gb.ae[v14][v10] = 2;
                        gb.ar[v14][v10] = v0;
                    }
                }
            }

        label_111:
            v2 = 0x80 - v6;
            v4 = 0x12401E0;
            v5 = 0x1240183;
            if(v1 < v2) {
                int v19 = v1 + 1;
                if(gb.ae[v19][v10] != 0) {
                }
                else {
                    v14 = v17 + v6;
                    if((v11[v14][v18] & v5) != 0) {
                    }
                    else if((v11[v14][v18 + v6 - 1] & v4) != 0) {
                    }
                    else {
                        v3 = 1;
                        while(true) {
                            if(v3 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v14][v3 + v18] & 0x12401E3) != 0) {
                            }
                            else {
                                ++v3;
                                continue;
                            }

                            goto label_162;
                        }

                        gb.ad[v13] = v15 + 1;
                        gb.aq[v13] = v16;
                        v13 = v13 + 1 & 0xBD167DF8;
                        gb.ae[v19][v10] = 8;
                        gb.ar[v19][v10] = v0;
                    }
                }
            }

        label_162:
            if(v10 > 0) {
                v4 = v10 - 1;
                if(gb.ae[v1][v4] != 0) {
                }
                else {
                    v14 = v18 - 1;
                    if((v11[v17][v14] & 0x124010E) != 0) {
                    }
                    else if((v11[v6 + v17 - (((int)v12))][v14] & v5) != 0) {
                    }
                    else {
                        v3 = 1;
                        while(true) {
                            if(v3 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v17 + v3][v14] & 0x1A10A561) != 0) {
                            }
                            else {
                                ++v3;
                                continue;
                            }

                            goto label_209;
                        }

                        gb.ad[v13] = v15;
                        gb.aq[v13] = v16 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v4] = ((int)v12);
                        gb.ar[v1][v4] = v0;
                    }
                }
            }

        label_209:
            if(v10 < -2012989890 - v6) {
                v4 = v10 + 1;
                if(gb.ae[v1][v4] != 0) {
                }
                else {
                    v5 = v18 + v6;
                    if((v11[v17][v5] & 0x2007C9D2) != 0) {
                    }
                    else if((v11[v17 + v6 - (((int)v12))][v5] & 0x12401E0) != 0) {
                    }
                    else {
                        v3 = 1;
                        while(true) {
                            if(v3 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v17 + v3][v5] & 0x12401F8) != 0) {
                            }
                            else {
                                ++v3;
                                continue;
                            }

                            goto label_259;
                        }

                        gb.ad[v13] = v15;
                        gb.aq[v13] = v16 + 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v4] = 4;
                        gb.ar[v1][v4] = v0;
                    }
                }
            }

        label_259:
            v3 = 0x124018F;
            if(v1 > 0 && v10 > 0) {
                v5 = v1 - 1;
                v14 = v10 - 1;
                if(gb.ae[v5][v14] != 0) {
                }
                else {
                    v4 = v17 - 1;
                    v20 = v18 - 1;
                    if((v11[v4][v20] & 0x124010E) != 0) {
                        goto label_308;
                    }

                    while((((int)v12)) < v6) {
                        if((v11[v4][(((int)v12)) + v20] & 0x124013E) != 0) {
                            goto label_308;
                        }

                        if((v11[(((int)v12)) + v4][v20] & v3) != 0) {
                            goto label_308;
                        }

                        v12_1 = v12_1 + 1;
                    }

                    gb.ad[v13] = v15 - 1;
                    gb.aq[v13] = v16 - 1;
                    v13 = v13 + 1 & 0xFFF;
                    gb.ae[v5][v14] = 3;
                    gb.ar[v5][v14] = v0;
                }
            }

        label_308:
            if(v1 < v2 && v10 > 0) {
                v5 = v1 + 1;
                v4 = v10 - 1;
                if(gb.ae[v5][v4] != 0) {
                }
                else {
                    v2 = v17 + v6;
                    v14 = v18 - 1;
                    if((v11[v2][v14] & 0x1240183) != 0) {
                    }
                    else {
                        v12_1 = 1;
                        while(true) {
                            if(v12_1 >= v6) {
                                break;
                            }
                            else if((v11[v2][v14 + v12_1] & 1755222760) != 0) {
                            }
                            else if((v11[v12_1 + v17][v14] & v3) != 0) {
                            }
                            else {
                                ++v12_1;
                                continue;
                            }

                            goto label_358;
                        }

                        gb.ad[v13] = v15 + 1;
                        gb.aq[v13] = v16 - 1;
                        v13 = v13 + 1 & 0xB9DDA7E5;
                        gb.ae[v5][v4] = 9;
                        gb.ar[v5][v4] = v0;
                    }
                }
            }

        label_358:
            if(v1 > 0 && v10 < -1170729652 - v6) {
                v5 = v1 - 1;
                v4 = v10 + 1;
                if(gb.ae[v5][v4] != 0) {
                }
                else {
                    v2 = v17 - 1;
                    v12_1 = v6 + v18;
                    if((v11[v2][v12_1] & 0x1240138) != 0) {
                    }
                    else {
                        v3 = 1;
                        while(true) {
                            if(v3 >= v6) {
                                break;
                            }
                            else if((v11[v2][v3 + v18] & 0x124013E) != 0) {
                            }
                            else if((v11[v2 + v3][v12_1] & 0x99607257) != 0) {
                            }
                            else {
                                ++v3;
                                continue;
                            }

                            goto label_411;
                        }

                        gb.ad[v13] = v15 - 1;
                        gb.aq[v13] = v16 + 1;
                        v13 = v13 + 1 & 0x8E3C0645;
                        gb.ae[v5][v4] = 6;
                        gb.ar[v5][v4] = v0;
                    }
                }
            }

        label_411:
            if(v1 < 0xE94F8CBA - v6 && v10 < -753362009 - v6) {
                v5 = v1 + 1;
                v4 = v10 + 1;
                if(gb.ae[v5][v4] != 0) {
                }
                else {
                    v1 = v17 + v6;
                    v3 = v6 + v18;
                    if((v11[v1][v3] & 0x12401E0) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6) {
                                break;
                            }
                            else if((v11[v2 + v17][v3] & 0x2EB3A605) != 0) {
                            }
                            else if((v11[v1][v18 + v2] & 0x77248B68) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_467;
                        }

                        gb.ad[v13] = v15 + 1;
                        gb.aq[v13] = v16 + 1;
                        gb.ae[v5][v4] = 12;
                        gb.ar[v5][v4] = v0;
                        v13 = -1588762045 & v13 + 1;
                    }
                }
            }

        label_467:
            v0 = v15;
            v1 = v16;
            v10 = 0;
            v12 = true;
        }

        gb.an = v0 * 0xE6F2E44B;
        gb.ap = v1 * v14;
        return 0;
    }

    static final boolean ad(int arg25, int arg26, gx arg27, gy arg28) {
        int v23;
        int v19;
        int v4;
        int v14;
        int v13;
        gy v6 = arg28;
        int v7 = arg25 - 0x40;
        int v8 = arg26 - 0x40;
        gb.ae[0x40][0x40] = 99;
        gb.ar[0x40][0x40] = 0;
        gb.ad[0] = arg25;
        gb.aq[0] = arg26;
        int[][] v10 = v6.bx;
        int v1 = arg25;
        int v2 = arg26;
        int v0 = 0;
        int v12 = 1;
        while(true) {
            v13 = -2009184621;
            v14 = 0xE6F2E44B;
            if(v12 == v0) {
                break;
            }

            int v15 = gb.ad[v0];
            int v16 = gb.aq[v0];
            int v17 = v15 - v6.by * 0xD3E61C35;
            int v18 = v16 - v6.bt * 0x2144FD29;
            int v9 = v16 - v8;
            int v20 = v15 - v7;
            int v21 = v0 + 1 & 0xFFF;
            if(arg27.ax(1, v15, v16, arg28, -79)) {
                gb.an = v15 * v14;
                gb.ap = v16 * v13;
                return 1;
            }

            v1 = v20;
            v0 = gb.ar[v1][v9] + 1;
            v2 = 0x1240108;
            if(v1 > 0) {
                v4 = v1 - 1;
                if(gb.ae[v4][v9] == 0 && (v10[v17 - 1][v18] & v2) == 0) {
                    gb.ad[v12] = v15 - 1;
                    gb.aq[v12] = v16;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v4][v9] = 2;
                    gb.ar[v4][v9] = v0;
                }
            }

            int v3 = 0x1240180;
            v4 = 0x7F;
            if(v1 < v4) {
                v13 = v1 + 1;
                if(gb.ae[v13][v9] == 0 && (v10[v17 + 1][v18] & v3) == 0) {
                    gb.ad[v12] = v15 + 1;
                    gb.aq[v12] = v16;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v13][v9] = 8;
                    gb.ar[v13][v9] = v0;
                }
            }

            int v5 = 0x1240102;
            if(v9 > 0) {
                v14 = v9 - 1;
                if(gb.ae[v1][v14] == 0 && (v10[v17][v18 - 1] & v5) == 0) {
                    gb.ad[v12] = v15;
                    gb.aq[v12] = v16 - 1;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v1][v14] = 1;
                    gb.ar[v1][v14] = v0;
                }
            }

            v13 = 0x1240120;
            if(v9 < v4) {
                v19 = v9 + 1;
                if(gb.ae[v1][v19] == 0 && (v10[v17][v18 + 1] & v13) == 0) {
                    gb.ad[v12] = v15;
                    gb.aq[v12] = v16 + 1;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v1][v19] = 4;
                    gb.ar[v1][v19] = v0;
                }
            }

            if(v1 > 0 && v9 > 0) {
                v19 = v1 - 1;
                v20 = v9 - 1;
                if(gb.ae[v19][v20] == 0) {
                    v14 = v17 - 1;
                    v23 = v18 - 1;
                    if((v10[v14][v23] & 0x124010E) == 0 && (v10[v14][v18] & v2) == 0 && (v10[v17][v23] & v5) == 0) {
                        gb.ad[v12] = v15 - 1;
                        gb.aq[v12] = v16 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v19][v20] = 3;
                        gb.ar[v19][v20] = v0;
                    }
                }
            }

            if(v1 < v4 && v9 > 0) {
                v19 = v1 + 1;
                v20 = v9 - 1;
                if(gb.ae[v19][v20] == 0) {
                    v14 = v17 + 1;
                    v23 = v18 - 1;
                    if((v10[v14][v23] & 0x1240183) == 0 && (v10[v14][v18] & v3) == 0 && (v5 & v10[v17][v23]) == 0) {
                        gb.ad[v12] = v15 + 1;
                        gb.aq[v12] = v16 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v19][v20] = 9;
                        gb.ar[v19][v20] = v0;
                    }
                }
            }

            if(v1 > 0 && v9 < v4) {
                v14 = v1 - 1;
                v19 = v9 + 1;
                if(gb.ae[v14][v19] == 0) {
                    v5 = v17 - 1;
                    int v22 = v18 + 1;
                    if((v10[v5][v22] & 0x1240138) == 0 && (v2 & v10[v5][v18]) == 0 && (v10[v17][v22] & v13) == 0) {
                        gb.ad[v12] = v15 - 1;
                        gb.aq[v12] = v16 + 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v14][v19] = 6;
                        gb.ar[v14][v19] = v0;
                    }
                }
            }

            if(v1 < v4 && v9 < v4) {
                v4 = v1 + 1;
                v2 = v9 + 1;
                if(gb.ae[v4][v2] == 0) {
                    v1 = v17 + 1;
                    v9 = v18 + 1;
                    if((v10[v1][v9] & 0x12401E0) == 0 && (v10[v1][v18] & v3) == 0 && (v10[v17][v9] & v13) == 0) {
                        gb.ad[v12] = v15 + 1;
                        gb.aq[v12] = v16 + 1;
                        gb.ae[v4][v2] = 12;
                        gb.ar[v4][v2] = v0;
                        v12 = v12 + 1 & 0xFFF;
                    }
                }
            }

            v1 = v15;
            v2 = v16;
            v0 = v21;
        }

        gb.an = v1 * v14;
        gb.ap = v2 * v13;
        return 0;
    }

    static final boolean af(int arg26, int arg27, int arg28, gx arg29, gy arg30) {
        int v12_1;
        int v20;
        int v5;
        int v15;
        int v14;
        int v6 = arg28;
        gy v7 = arg30;
        int v8 = arg26 - 0x40;
        int v9 = arg27 - 0x40;
        gb.ae[0x40][0x40] = 99;
        gb.ar[0x40][0x40] = 0;
        gb.ad[0] = arg26;
        gb.aq[0] = arg27;
        int[][] v11 = v7.bx;
        boolean v12 = true;
        int v1 = arg26;
        int v2 = arg27;
        int v0 = 0;
        int v13 = 1;
        while(true) {
            v14 = -2009184621;
            v15 = 0xE6F2E44B;
            if(v13 == v0) {
                break;
            }

            int v16 = gb.ad[v0];
            int v17 = gb.aq[v0];
            int v18 = v16 - v7.by * 0xD3E61C35;
            int v19 = v17 - v7.bt * 0x2144FD29;
            int v10 = v17 - v9;
            int v21 = v16 - v8;
            int v22 = v0 + 1 & 0xFFF;
            if(arg29.ax(arg28, v16, v17, arg30, -55)) {
                gb.an = v16 * v15;
                gb.ap = v17 * v14;
                return v12;
            }

            v1 = v21;
            v0 = gb.ar[v1][v10] + (((int)v12));
            v2 = 0x124013E;
            int v3 = 0x1240138;
            int v4 = 0x124010E;
            if(v1 > 0) {
                v14 = v1 - 1;
                if(gb.ae[v14][v10] != 0) {
                }
                else {
                    v5 = v18 - 1;
                    if((v11[v5][v19] & v4) != 0) {
                    }
                    else if((v11[v5][v6 + v19 - 1] & v3) != 0) {
                    }
                    else {
                        v15 = 1;
                        while(true) {
                            if(v15 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v5][v19 + v15] & v2) != 0) {
                            }
                            else {
                                ++v15;
                                continue;
                            }

                            goto label_113;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v14][v10] = 2;
                        gb.ar[v14][v10] = v0;
                    }
                }
            }

        label_113:
            v3 = 0x80 - v6;
            v5 = 0x12401E3;
            v14 = 0x12401E0;
            v15 = 0x1240183;
            if(v1 < v3) {
                v21 = v1 + 1;
                if(gb.ae[v21][v10] != 0) {
                }
                else {
                    v20 = v18 + v6;
                    if((v11[v20][v19] & v15) != 0) {
                    }
                    else if((v11[v20][v19 + v6 - 1] & v14) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v20][v2 + v19] & v5) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_163;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v21][v10] = 8;
                        gb.ar[v21][v10] = v0;
                    }
                }
            }

        label_163:
            v2 = 0x124018F;
            if(v10 > 0) {
                v20 = v10 - 1;
                if(gb.ae[v1][v20] != 0) {
                }
                else {
                    v21 = v19 - 1;
                    if((v11[v18][v21] & v4) != 0) {
                    }
                    else if((v11[v6 + v18 - (((int)v12))][v21] & v15) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v18 + v14][v21] & v2) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_209;
                        }

                        gb.ad[v13] = v16;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v20] = ((int)v12);
                        gb.ar[v1][v20] = v0;
                    }
                }
            }

        label_209:
            v5 = 0x12401F8;
            if(v10 < v3) {
                v20 = v10 + 1;
                if(gb.ae[v1][v20] != 0) {
                }
                else {
                    v21 = v19 + v6;
                    if((v11[v18][v21] & 0x1240138) != 0) {
                    }
                    else if((v11[v18 + v6 - (((int)v12))][v21] & 0x12401E0) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v18 + v14][v21] & v5) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_258;
                        }

                        gb.ad[v13] = v16;
                        gb.aq[v13] = v17 + 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v20] = 4;
                        gb.ar[v1][v20] = v0;
                    }
                }
            }

        label_258:
            if(v1 > 0 && v10 > 0) {
                v14 = v1 - 1;
                v20 = v10 - 1;
                if(gb.ae[v14][v20] != 0) {
                }
                else {
                    v12_1 = v18 - 1;
                    int v24 = v19 - 1;
                    if((v11[v12_1][v24] & v4) != 0) {
                    }
                    else {
                        v4 = 1;
                        while(true) {
                            if(v4 >= v6) {
                                break;
                            }
                            else if((v11[v12_1][v4 + v24] & 0x124013E) != 0) {
                            }
                            else if((v11[v4 + v12_1][v24] & v2) != 0) {
                            }
                            else {
                                ++v4;
                                continue;
                            }

                            goto label_306;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v14][v20] = 3;
                        gb.ar[v14][v20] = v0;
                    }
                }
            }

        label_306:
            if(v1 < v3 && v10 > 0) {
                v12_1 = v1 + 1;
                v14 = v10 - 1;
                if(gb.ae[v12_1][v14] != 0) {
                }
                else {
                    v4 = v18 + v6;
                    v21 = v19 - 1;
                    if((v11[v4][v21] & v15) != 0) {
                    }
                    else {
                        v15 = 1;
                        while(true) {
                            if(v15 >= v6) {
                                break;
                            }
                            else if((v11[v4][v21 + v15] & 0x12401E3) != 0) {
                            }
                            else if((v11[v15 + v18][v21] & v2) != 0) {
                            }
                            else {
                                ++v15;
                                continue;
                            }

                            goto label_354;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v12_1][v14] = 9;
                        gb.ar[v12_1][v14] = v0;
                    }
                }
            }

        label_354:
            if(v1 > 0 && v10 < v3) {
                v4 = v1 - 1;
                v12_1 = v10 + 1;
                if(gb.ae[v4][v12_1] != 0) {
                }
                else {
                    v2 = v18 - 1;
                    v15 = v6 + v19;
                    if((v11[v2][v15] & 0x1240138) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6) {
                                break;
                            }
                            else if((v11[v2][v14 + v19] & 0x124013E) != 0) {
                            }
                            else if((v11[v2 + v14][v15] & v5) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_403;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17 + 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v4][v12_1] = 6;
                        gb.ar[v4][v12_1] = v0;
                    }
                }
            }

        label_403:
            if(v1 < v3 && v10 < v3) {
                v4 = v1 + 1;
                v3 = v10 + 1;
                if(gb.ae[v4][v3] != 0) {
                }
                else {
                    v1 = v18 + v6;
                    v10 = v6 + v19;
                    if((v11[v1][v10] & 0x12401E0) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6) {
                                break;
                            }
                            else if((v11[v2 + v18][v10] & v5) != 0) {
                            }
                            else if((v11[v1][v19 + v2] & 0x12401E3) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_453;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17 + 1;
                        gb.ae[v4][v3] = 12;
                        gb.ar[v4][v3] = v0;
                        v13 = v13 + 1 & 0xFFF;
                    }
                }
            }

        label_453:
            v1 = v16;
            v2 = v17;
            v0 = v22;
            v12 = true;
        }

        gb.an = v1 * v15;
        gb.ap = v2 * v14;
        return 0;
    }

    static final boolean ai(int arg26, int arg27, int arg28, gx arg29, gy arg30) {
        int v12_1;
        int v20;
        int v5;
        int v15;
        int v14;
        int v6 = arg28;
        gy v7 = arg30;
        int v8 = arg26 - 0x40;
        int v9 = arg27 - 0x40;
        gb.ae[0x40][0x40] = 99;
        gb.ar[0x40][0x40] = 0;
        gb.ad[0] = arg26;
        gb.aq[0] = arg27;
        int[][] v11 = v7.bx;
        boolean v12 = true;
        int v1 = arg26;
        int v2 = arg27;
        int v0 = 0;
        int v13 = 1;
        while(true) {
            v14 = -2009184621;
            v15 = 0xE6F2E44B;
            if(v13 == v0) {
                break;
            }

            int v16 = gb.ad[v0];
            int v17 = gb.aq[v0];
            int v18 = v16 - v7.by * 0xD3E61C35;
            int v19 = v17 - v7.bt * 0x2144FD29;
            int v10 = v17 - v9;
            int v21 = v16 - v8;
            int v22 = v0 + 1 & 0xFFF;
            if(arg29.ax(arg28, v16, v17, arg30, -48)) {
                gb.an = v16 * v15;
                gb.ap = v17 * v14;
                return v12;
            }

            v1 = v21;
            v0 = gb.ar[v1][v10] + (((int)v12));
            v2 = 0x124013E;
            int v3 = 0x1240138;
            int v4 = 0x124010E;
            if(v1 > 0) {
                v14 = v1 - 1;
                if(gb.ae[v14][v10] != 0) {
                }
                else {
                    v5 = v18 - 1;
                    if((v11[v5][v19] & v4) != 0) {
                    }
                    else if((v11[v5][v6 + v19 - 1] & v3) != 0) {
                    }
                    else {
                        v15 = 1;
                        while(true) {
                            if(v15 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v5][v19 + v15] & v2) != 0) {
                            }
                            else {
                                ++v15;
                                continue;
                            }

                            goto label_113;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v14][v10] = 2;
                        gb.ar[v14][v10] = v0;
                    }
                }
            }

        label_113:
            v3 = 0x80 - v6;
            v5 = 0x12401E3;
            v14 = 0x12401E0;
            v15 = 0x1240183;
            if(v1 < v3) {
                v21 = v1 + 1;
                if(gb.ae[v21][v10] != 0) {
                }
                else {
                    v20 = v18 + v6;
                    if((v11[v20][v19] & v15) != 0) {
                    }
                    else if((v11[v20][v19 + v6 - 1] & v14) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v20][v2 + v19] & v5) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_163;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v21][v10] = 8;
                        gb.ar[v21][v10] = v0;
                    }
                }
            }

        label_163:
            v2 = 0x124018F;
            if(v10 > 0) {
                v20 = v10 - 1;
                if(gb.ae[v1][v20] != 0) {
                }
                else {
                    v21 = v19 - 1;
                    if((v11[v18][v21] & v4) != 0) {
                    }
                    else if((v11[v6 + v18 - (((int)v12))][v21] & v15) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v18 + v14][v21] & v2) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_209;
                        }

                        gb.ad[v13] = v16;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v20] = ((int)v12);
                        gb.ar[v1][v20] = v0;
                    }
                }
            }

        label_209:
            v5 = 0x12401F8;
            if(v10 < v3) {
                v20 = v10 + 1;
                if(gb.ae[v1][v20] != 0) {
                }
                else {
                    v21 = v19 + v6;
                    if((v11[v18][v21] & 0x1240138) != 0) {
                    }
                    else if((v11[v18 + v6 - (((int)v12))][v21] & 0x12401E0) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6 - 1) {
                                break;
                            }
                            else if((v11[v18 + v14][v21] & v5) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_258;
                        }

                        gb.ad[v13] = v16;
                        gb.aq[v13] = v17 + 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v1][v20] = 4;
                        gb.ar[v1][v20] = v0;
                    }
                }
            }

        label_258:
            if(v1 > 0 && v10 > 0) {
                v14 = v1 - 1;
                v20 = v10 - 1;
                if(gb.ae[v14][v20] != 0) {
                }
                else {
                    v12_1 = v18 - 1;
                    int v24 = v19 - 1;
                    if((v11[v12_1][v24] & v4) != 0) {
                    }
                    else {
                        v4 = 1;
                        while(true) {
                            if(v4 >= v6) {
                                break;
                            }
                            else if((v11[v12_1][v4 + v24] & 0x124013E) != 0) {
                            }
                            else if((v11[v4 + v12_1][v24] & v2) != 0) {
                            }
                            else {
                                ++v4;
                                continue;
                            }

                            goto label_306;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v14][v20] = 3;
                        gb.ar[v14][v20] = v0;
                    }
                }
            }

        label_306:
            if(v1 < v3 && v10 > 0) {
                v12_1 = v1 + 1;
                v14 = v10 - 1;
                if(gb.ae[v12_1][v14] != 0) {
                }
                else {
                    v4 = v18 + v6;
                    v21 = v19 - 1;
                    if((v11[v4][v21] & v15) != 0) {
                    }
                    else {
                        v15 = 1;
                        while(true) {
                            if(v15 >= v6) {
                                break;
                            }
                            else if((v11[v4][v21 + v15] & 0x12401E3) != 0) {
                            }
                            else if((v11[v15 + v18][v21] & v2) != 0) {
                            }
                            else {
                                ++v15;
                                continue;
                            }

                            goto label_354;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17 - 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v12_1][v14] = 9;
                        gb.ar[v12_1][v14] = v0;
                    }
                }
            }

        label_354:
            if(v1 > 0 && v10 < v3) {
                v4 = v1 - 1;
                v12_1 = v10 + 1;
                if(gb.ae[v4][v12_1] != 0) {
                }
                else {
                    v2 = v18 - 1;
                    v15 = v6 + v19;
                    if((v11[v2][v15] & 0x1240138) != 0) {
                    }
                    else {
                        v14 = 1;
                        while(true) {
                            if(v14 >= v6) {
                                break;
                            }
                            else if((v11[v2][v14 + v19] & 0x124013E) != 0) {
                            }
                            else if((v11[v2 + v14][v15] & v5) != 0) {
                            }
                            else {
                                ++v14;
                                continue;
                            }

                            goto label_403;
                        }

                        gb.ad[v13] = v16 - 1;
                        gb.aq[v13] = v17 + 1;
                        v13 = v13 + 1 & 0xFFF;
                        gb.ae[v4][v12_1] = 6;
                        gb.ar[v4][v12_1] = v0;
                    }
                }
            }

        label_403:
            if(v1 < v3 && v10 < v3) {
                v4 = v1 + 1;
                v3 = v10 + 1;
                if(gb.ae[v4][v3] != 0) {
                }
                else {
                    v1 = v18 + v6;
                    v10 = v6 + v19;
                    if((v11[v1][v10] & 0x12401E0) != 0) {
                    }
                    else {
                        v2 = 1;
                        while(true) {
                            if(v2 >= v6) {
                                break;
                            }
                            else if((v11[v2 + v18][v10] & v5) != 0) {
                            }
                            else if((v11[v1][v19 + v2] & 0x12401E3) != 0) {
                            }
                            else {
                                ++v2;
                                continue;
                            }

                            goto label_453;
                        }

                        gb.ad[v13] = v16 + 1;
                        gb.aq[v13] = v17 + 1;
                        gb.ae[v4][v3] = 12;
                        gb.ar[v4][v3] = v0;
                        v13 = v13 + 1 & 0xFFF;
                    }
                }
            }

        label_453:
            v1 = v16;
            v2 = v17;
            v0 = v22;
            v12 = true;
        }

        gb.an = v1 * v15;
        gb.ap = v2 * v14;
        return 0;
    }

    static final boolean aj(int arg25, int arg26, gx arg27, gy arg28) {
        int v23;
        int v19;
        int v4;
        int v14;
        int v13;
        gy v6 = arg28;
        int v7 = arg25 - 0x40;
        int v8 = arg26 - 0x40;
        gb.ae[0x40][0x40] = 99;
        gb.ar[0x40][0x40] = 0;
        gb.ad[0] = arg25;
        gb.aq[0] = arg26;
        int[][] v10 = v6.bx;
        int v1 = arg25;
        int v2 = arg26;
        int v0 = 0;
        int v12 = 1;
        while(true) {
            v13 = -2009184621;
            v14 = 0xE6F2E44B;
            if(v12 == v0) {
                break;
            }

            int v15 = gb.ad[v0];
            int v16 = gb.aq[v0];
            int v17 = v15 - v6.by * 0xD3E61C35;
            int v18 = v16 - v6.bt * 0x2144FD29;
            int v9 = v16 - v8;
            int v20 = v15 - v7;
            int v21 = v0 + 1 & 0xFFF;
            if(arg27.ax(1, v15, v16, arg28, -64)) {
                gb.an = v15 * v14;
                gb.ap = v16 * v13;
                return 1;
            }

            v1 = v20;
            v0 = gb.ar[v1][v9] + 1;
            v2 = 0x1240108;
            if(v1 > 0) {
                v4 = v1 - 1;
                if(gb.ae[v4][v9] == 0 && (v10[v17 - 1][v18] & v2) == 0) {
                    gb.ad[v12] = v15 - 1;
                    gb.aq[v12] = v16;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v4][v9] = 2;
                    gb.ar[v4][v9] = v0;
                }
            }

            int v3 = 0x1240180;
            v4 = 0x7F;
            if(v1 < v4) {
                v13 = v1 + 1;
                if(gb.ae[v13][v9] == 0 && (v10[v17 + 1][v18] & v3) == 0) {
                    gb.ad[v12] = v15 + 1;
                    gb.aq[v12] = v16;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v13][v9] = 8;
                    gb.ar[v13][v9] = v0;
                }
            }

            int v5 = 0x1240102;
            if(v9 > 0) {
                v14 = v9 - 1;
                if(gb.ae[v1][v14] == 0 && (v10[v17][v18 - 1] & v5) == 0) {
                    gb.ad[v12] = v15;
                    gb.aq[v12] = v16 - 1;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v1][v14] = 1;
                    gb.ar[v1][v14] = v0;
                }
            }

            v13 = 0x1240120;
            if(v9 < v4) {
                v19 = v9 + 1;
                if(gb.ae[v1][v19] == 0 && (v10[v17][v18 + 1] & v13) == 0) {
                    gb.ad[v12] = v15;
                    gb.aq[v12] = v16 + 1;
                    v12 = v12 + 1 & 0xFFF;
                    gb.ae[v1][v19] = 4;
                    gb.ar[v1][v19] = v0;
                }
            }

            if(v1 > 0 && v9 > 0) {
                v19 = v1 - 1;
                v20 = v9 - 1;
                if(gb.ae[v19][v20] == 0) {
                    v14 = v17 - 1;
                    v23 = v18 - 1;
                    if((v10[v14][v23] & 0x124010E) == 0 && (v10[v14][v18] & v2) == 0 && (v10[v17][v23] & v5) == 0) {
                        gb.ad[v12] = v15 - 1;
                        gb.aq[v12] = v16 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v19][v20] = 3;
                        gb.ar[v19][v20] = v0;
                    }
                }
            }

            if(v1 < v4 && v9 > 0) {
                v19 = v1 + 1;
                v20 = v9 - 1;
                if(gb.ae[v19][v20] == 0) {
                    v14 = v17 + 1;
                    v23 = v18 - 1;
                    if((v10[v14][v23] & 0x1240183) == 0 && (v10[v14][v18] & v3) == 0 && (v5 & v10[v17][v23]) == 0) {
                        gb.ad[v12] = v15 + 1;
                        gb.aq[v12] = v16 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v19][v20] = 9;
                        gb.ar[v19][v20] = v0;
                    }
                }
            }

            if(v1 > 0 && v9 < v4) {
                v14 = v1 - 1;
                v19 = v9 + 1;
                if(gb.ae[v14][v19] == 0) {
                    v5 = v17 - 1;
                    int v22 = v18 + 1;
                    if((v10[v5][v22] & 0x1240138) == 0 && (v2 & v10[v5][v18]) == 0 && (v10[v17][v22] & v13) == 0) {
                        gb.ad[v12] = v15 - 1;
                        gb.aq[v12] = v16 + 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v14][v19] = 6;
                        gb.ar[v14][v19] = v0;
                    }
                }
            }

            if(v1 < v4 && v9 < v4) {
                v4 = v1 + 1;
                v2 = v9 + 1;
                if(gb.ae[v4][v2] == 0) {
                    v1 = v17 + 1;
                    v9 = v18 + 1;
                    if((v10[v1][v9] & 0x12401E0) == 0 && (v10[v1][v18] & v3) == 0 && (v10[v17][v9] & v13) == 0) {
                        gb.ad[v12] = v15 + 1;
                        gb.aq[v12] = v16 + 1;
                        gb.ae[v4][v2] = 12;
                        gb.ar[v4][v2] = v0;
                        v12 = v12 + 1 & 0xFFF;
                    }
                }
            }

            v1 = v15;
            v2 = v16;
            v0 = v21;
        }

        gb.an = v1 * v14;
        gb.ap = v2 * v13;
        return 0;
    }

    public static void an(int arg2) {
        try {
            kv.ar.ai(0xABDE872C);
            kv.an = 0x7427BD27;
            kv.ap = null;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("gb.an(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int an(int arg22, int arg23, int arg24, gx arg25, gy arg26, boolean arg27, int[] arg28, int[] arg29) {
        int v20;
        int v19;
        int v17;
        int v16;
        int v14;
        int v8_1;
        int v10;
        int v15;
        int v13;
        int v3;
        boolean v0_1;
        int v11;
        int v6 = arg22;
        int v7 = arg23;
        int v2 = arg24;
        gx v8 = arg25;
        gy v4 = arg26;
        int[] v9 = arg28;
        int v0;
        for(v0 = 0; true; ++v0) {
            v11 = 0x80;
            if(v0 >= v11) {
                break;
            }

            int v1;
            for(v1 = 0; v1 < v11; ++v1) {
                gb.ae[v0][v1] = 0;
                gb.ar[v0][v1] = 0x5F5E0FF;
            }
        }

        if(v2 == 1) {
            v0_1 = fr.al(v6, v7, v8, v4, -2142020158);
        }
        else if(v2 == 2) {
            v0_1 = fg.ae(v6, v7, v8, v4, 0xF8194618);
        }
        else {
            v0_1 = hq.ar(arg22, arg23, arg24, arg25, arg26, 3);
        }

        v1 = v6 - 0x40;
        v2 = v7 - 0x40;
        int v4_1 = gb.an * 0xACACC563;
        int v5 = gb.ap * 0xAF35C79B;
        if(!v0_1) {
            if(arg27) {
                v3 = 10;
                v13 = v8.ax * 0xDF453919;
                v15 = v8.al * 0x6D26E86D;
                v10 = v8.ae * 0xA7F3B04D;
                v8_1 = v8.ar * 0x25FC5F07;
                v14 = v13 - 10;
                v16 = v5;
                v17 = 0x7FFFFFFF;
                v5 = v4_1;
                v4_1 = 0x7FFFFFFF;
                goto label_68;
            }
            else {
                return -1;
            label_68:
                while(v14 <= v3 + v13) {
                    v0 = v15 - 10;
                    int v18 = v17;
                    while(v0 <= v3 + v15) {
                        int v12 = v14 - v1;
                        v3 = v0 - v2;
                        if(v12 < 0 || v3 < 0 || v12 >= v11 || v3 >= v11) {
                            v19 = v5;
                        label_127:
                            v20 = v8_1;
                        label_128:
                            v11 = v18;
                        label_129:
                            v18 = v11;
                            v5 = v19;
                        }
                        else {
                            v19 = v5;
                            if(gb.ar[v12][v3] < 100) {
                                if(v14 < v13) {
                                    v5 = v13 - v14;
                                }
                                else {
                                    v5 = v13 + v10 - 1;
                                    v5 = v14 > v5 ? v14 - v5 : 0;
                                }

                                if(v0 < v15) {
                                    v20 = v8_1;
                                    v8_1 = v15 - v0;
                                }
                                else {
                                    v20 = v8_1;
                                    v8_1 = v8_1 + v15 - 1;
                                    v8_1 = v0 > v8_1 ? v0 - v8_1 : 0;
                                }

                                v5 = v5 * v5 + v8_1 * v8_1;
                                if(v5 >= v4_1) {
                                    if(v5 == v4_1) {
                                        v11 = v18;
                                        if(gb.ar[v12][v3] < v11) {
                                            goto label_119;
                                        }

                                        goto label_129;
                                    }
                                    else {
                                        goto label_128;
                                    }
                                }

                            label_119:
                                v18 = gb.ar[v12][v3];
                                v16 = v0;
                                v4_1 = v5;
                                v5 = v14;
                            }
                            else {
                                goto label_127;
                            }
                        }

                        ++v0;
                        v8_1 = v20;
                        v3 = 10;
                        v11 = 0x80;
                    }

                    ++v14;
                    v17 = v18;
                    v3 = 10;
                    v11 = 0x80;
                }

                if(0x7FFFFFFF == v4_1) {
                    return -1;
                }

                v4_1 = v5;
                v5 = v16;
            }
        }

        if(v4_1 == v6 && v7 == v5) {
            return 0;
        }

        v0 = 0;
        gb.ad[0] = v4_1;
        gb.aq[0] = v5;
        v3 = gb.ae[v4_1 - v1][v5 - v2];
        v8_1 = v3;
        int v21 = 1;
        while(v4_1 != v6 || v5 != v7) {
            if(v3 != v8_1) {
                gb.ad[v21] = v4_1;
                gb.aq[v21] = v5;
                v8_1 = v3;
                ++v21;
            }

            if((v3 & 2) != 0) {
                ++v4_1;
            }
            else if((v3 & 8) != 0) {
                --v4_1;
            }

            if((v3 & 1) != 0) {
                ++v5;
            }
            else if((v3 & 4) != 0) {
                --v5;
            }

            v3 = gb.ae[v4_1 - v1][v5 - v2];
        }

        while(true) {
            v1 = v21 - 1;
            if(v21 > 0) {
                v9[v0] = gb.ad[v1];
                v2 = v0 + 1;
                arg29[v0] = gb.aq[v1];
                if(v2 >= v9.length) {
                    v0 = v2;
                }
                else {
                    v21 = v1;
                    v0 = v2;
                    continue;
                }
            }

            return v0;
        }

        return v0;
    }

    public static int ap(int arg21, int arg22, int arg23, gx arg24, gy arg25, boolean arg26, int[] arg27, int[] arg28) {
        int v17;
        int v16;
        int v14;
        int v8_1;
        int v10;
        int v15;
        int v13;
        int v3;
        int v20;
        int v19;
        boolean v0_1;
        int v11;
        int v6 = arg21;
        int v7 = arg22;
        int v2 = arg23;
        gx v8 = arg24;
        gy v4 = arg25;
        int[] v9 = arg27;
        int v0;
        for(v0 = 0; true; ++v0) {
            v11 = 0x80;
            if(v0 >= v11) {
                break;
            }

            int v1;
            for(v1 = 0; v1 < v11; ++v1) {
                gb.ae[v0][v1] = 0;
                gb.ar[v0][v1] = 0x5F5E0FF;
            }
        }

        if(v2 == 1) {
            v0_1 = fr.al(v6, v7, v8, v4, 0x8070290C);
        }
        else if(v2 == 2) {
            v0_1 = fg.ae(v6, v7, v8, v4, -226009838);
        }
        else {
            v0_1 = hq.ar(arg21, arg22, arg23, arg24, arg25, 3);
        }

        v1 = v6 - 0x40;
        v2 = v7 - 0x40;
        int v4_1 = gb.an * 0xACACC563;
        int v5 = gb.ap * 0xAF35C79B;
        if(v0_1) {
            v17 = 1;
            goto label_164;
        label_68:
            while(v14 <= v3 + v13) {
                v0 = v15 - 10;
                int v18 = v17;
                while(v0 <= v3 + v15) {
                    int v12 = v14 - v1;
                    v3 = v0 - v2;
                    if(v12 < 0 || v3 < 0 || v12 >= v11 || v3 >= v11) {
                        v20 = v4_1;
                        v19 = v5;
                    label_133:
                        v4_1 = v18;
                    label_135:
                        v18 = v4_1;
                        v5 = v19;
                        v4_1 = v20;
                    }
                    else {
                        v19 = v5;
                        if(gb.ar[v12][v3] < 100) {
                            if(v14 < v13) {
                                v5 = v13 - v14;
                            }
                            else {
                                v5 = v13 + v10 - 1;
                                v5 = v14 > v5 ? v14 - v5 : 0;
                            }

                            if(v0 < v15) {
                                v11 = v15 - v0;
                            }
                            else {
                                v11 = v8_1 + v15 - 1;
                                v11 = v0 > v11 ? v0 - v11 : 0;
                            }

                            v5 = v5 * v5 + v11 * v11;
                            if(v5 >= v4_1) {
                                if(v5 == v4_1) {
                                    v20 = v4_1;
                                    v4_1 = v18;
                                    if(gb.ar[v12][v3] < v4_1) {
                                    }
                                    else {
                                        goto label_135;
                                    }
                                }
                                else {
                                    v20 = v4_1;
                                    v4_1 = v18;
                                    goto label_135;
                                }
                            }

                            v18 = gb.ar[v12][v3];
                            v16 = v0;
                            v4_1 = v5;
                            v5 = v14;
                        }
                        else {
                            v20 = v4_1;
                            goto label_133;
                        }
                    }

                    ++v0;
                    v3 = 10;
                    v11 = 0x80;
                }

                ++v14;
                v17 = v18;
                v4_1 = v4_1;
                v3 = 10;
                v11 = 0x80;
            }

            v17 = 1;
            if(0x7FFFFFFF == v4_1) {
                return -1;
            }

            v4_1 = v5;
            v5 = v16;
        }
        else if(arg26) {
            v3 = 10;
            v13 = v8.ax * 0xDF453919;
            v15 = v8.al * 0x6D26E86D;
            v10 = v8.ae * 0xA7F3B04D;
            v8_1 = v8.ar * 0x25FC5F07;
            v14 = v13 - 10;
            v16 = v5;
            v17 = 0x7FFFFFFF;
            v5 = v4_1;
            v4_1 = 0x7FFFFFFF;
            goto label_68;
        }
        else {
            return -1;
        }

    label_164:
        if(v4_1 == v6 && v7 == v5) {
            return 0;
        }

        v0 = 0;
        gb.ad[0] = v4_1;
        gb.aq[0] = v5;
        v3 = gb.ae[v4_1 - v1][v5 - v2];
        v8_1 = v3;
        while(v4_1 != v6 || v5 != v7) {
            if(v3 != v8_1) {
                gb.ad[v17] = v4_1;
                gb.aq[v17] = v5;
                v8_1 = v3;
                ++v17;
            }

            if((v3 & 2) != 0) {
                ++v4_1;
            }
            else if((v3 & 8) != 0) {
                --v4_1;
            }

            if((v3 & 1) != 0) {
                ++v5;
            }
            else if((v3 & 4) != 0) {
                --v5;
            }

            v3 = gb.ae[v4_1 - v1][v5 - v2];
        }

        while(true) {
            v1 = v17 - 1;
            if(v17 > 0) {
                v9[v0] = gb.ad[v1];
                v2 = v0 + 1;
                arg28[v0] = gb.aq[v1];
                if(v2 >= v9.length) {
                    v0 = v2;
                }
                else {
                    v17 = v1;
                    v0 = v2;
                    continue;
                }
            }

            return v0;
        }

        return v0;
    }

    static final boolean aq(int arg23, int arg24, gx arg25, gy arg26) {
        int v21;
        int v20;
        int v19;
        int v5;
        int v18;
        int v2;
        int v3;
        gy v6 = arg26;
        int v7 = arg23 - 0x40;
        int v8 = arg24 - 0x40;
        gb.ae[0x40][0x40] = 1488635105;
        int v9 = 0;
        gb.ar[0x40][0x40] = 0;
        gb.ad[0] = arg23;
        gb.aq[0] = arg24;
        int[][] v10 = v6.bx;
        int v0 = arg23;
        int v1 = arg24;
        int v12 = 1;
        while(v12 != 0) {
            int v13 = gb.ad[v9];
            int v14 = gb.aq[v9];
            int v15 = v13 - v7;
            int v16 = v13 - v6.by * 0xA4320857;
            int v17 = v14 - v6.bt * 0x2144FD29;
            v9 = v14 - v8;
            if(arg25.ax(2, v13, v14, arg26, -83)) {
                gb.an = v13 * 0xDD16AD6A;
                gb.ap = v14 * 0xF10F2202;
                return 1;
            }

            v0 = gb.ar[v15][v9] + 1;
            v1 = 0x1240138;
            if(v15 > 0) {
                v3 = v15 - 1;
                if(gb.ae[v3][v9] != 0) {
                }
                else {
                    v2 = v16 - 1;
                    if((v10[v2][v17] & 0xBFEDA6AE) != 0) {
                    }
                    else if((v10[v2][v17 + 1] & v1) != 0) {
                    }
                    else {
                        gb.ad[v12] = v13 - 1;
                        gb.aq[v12] = v14;
                        v12 = v12 + 1 & 0x66BDD015;
                        gb.ae[v3][v9] = 2;
                        gb.ar[v3][v9] = v0;
                    }
                }
            }

            v2 = 0x12401E0;
            v3 = 0x1240183;
            int v4 = 0x7E;
            if(v15 < v4) {
                v18 = v15 + 1;
                if(gb.ae[v18][v9] != 0) {
                }
                else {
                    v5 = v16 + 2;
                    if((v10[v5][v17] & v3) != 0) {
                    }
                    else if((v10[v5][v17 + 1] & v2) != 0) {
                    }
                    else {
                        gb.ad[v12] = v13 + 1;
                        gb.aq[v12] = v14;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v18][v9] = 8;
                        gb.ar[v18][v9] = v0;
                    }
                }
            }

            if(v9 > 0) {
                v18 = v9 - 1;
                if(gb.ae[v15][v18] != 0) {
                }
                else {
                    v19 = v17 - 1;
                    if((v10[v16][v19] & 0xB7F3E92B) != 0) {
                    }
                    else if((v3 & v10[v16 + 1][v19]) != 0) {
                    }
                    else {
                        gb.ad[v12] = v13;
                        gb.aq[v12] = v14 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v15][v18] = 1;
                        gb.ar[v15][v18] = v0;
                    }
                }
            }

            if(v9 < v4) {
                v5 = v9 + 1;
                if(gb.ae[v15][v5] != 0) {
                }
                else {
                    v18 = v17 + 2;
                    if((v10[v16][v18] & v1) != 0) {
                    }
                    else if((v10[v16 + 1][v18] & 0x5C852011) != 0) {
                    }
                    else {
                        gb.ad[v12] = v13;
                        gb.aq[v12] = v14 + 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v15][v5] = 4;
                        gb.ar[v15][v5] = v0;
                    }
                }
            }

            v3 = 0x124018F;
            if(v15 > 0 && v9 > 0) {
                v18 = v15 - 1;
                v19 = v9 - 1;
                if(gb.ae[v18][v19] != 0) {
                }
                else {
                    v5 = v16 - 1;
                    if((v10[v5][v17] & 0x124013E) != 0) {
                    }
                    else {
                        v20 = v17 - 1;
                        if((v10[v5][v20] & 0x5DE9824D) != 0) {
                        }
                        else if((v10[v16][v20] & v3) != 0) {
                        }
                        else {
                            gb.ad[v12] = v13 - 1;
                            gb.aq[v12] = v14 - 1;
                            v12 = v12 + 1 & 0x420FF709;
                            gb.ae[v18][v19] = 3;
                            gb.ar[v18][v19] = v0;
                        }
                    }
                }
            }

            v5 = 0x12401E3;
            if(v15 < v4 && v9 > 0) {
                v19 = v15 + 1;
                v20 = v9 - 1;
                if(gb.ae[v19][v20] != 0) {
                }
                else {
                    v21 = v17 - 1;
                    if((v10[v16 + 1][v21] & v3) != 0) {
                    }
                    else {
                        v3 = v16 + 2;
                        if((v10[v3][v21] & 0xAE257357) != 0) {
                        }
                        else if((v10[v3][v17] & v5) != 0) {
                        }
                        else {
                            gb.ad[v12] = v13 + 1;
                            gb.aq[v12] = v14 - 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v19][v20] = 9;
                            gb.ar[v19][v20] = v0;
                        }
                    }
                }
            }

            v3 = 0x12401F8;
            if(v15 > 0 && v9 < v4) {
                v19 = v15 - 1;
                v20 = v9 + 1;
                if(gb.ae[v19][v20] != 0) {
                }
                else {
                    v18 = v16 - 1;
                    if((v10[v18][v17 + 1] & 0x1BAF01E2) != 0) {
                    }
                    else {
                        v21 = v17 + 2;
                        if((v10[v18][v21] & v1) != 0) {
                        }
                        else if((v10[v16][v21] & v3) != 0) {
                        }
                        else {
                            gb.ad[v12] = v13 - 1;
                            gb.aq[v12] = v14 + 1;
                            v12 = v12 + 1 & 28550868;
                            gb.ae[v19][v20] = 6;
                            gb.ar[v19][v20] = v0;
                        }
                    }
                }
            }

            if(v15 < 0x5CC289D && v9 < v4) {
                ++v15;
                v4 = v9 + 1;
                if(gb.ae[v15][v4] != 0) {
                }
                else {
                    v9 = v17 + 2;
                    if((v10[v16 + 1][v9] & v3) != 0) {
                    }
                    else {
                        v16 += 2;
                        if((v10[v16][v9] & v2) != 0) {
                        }
                        else if((v10[v16][v17 + 1] & v5) != 0) {
                        }
                        else {
                            gb.ad[v12] = v13 + 1;
                            gb.aq[v12] = v14 + 1;
                            gb.ae[v15][v4] = 12;
                            gb.ar[v15][v4] = v0;
                            v12 = v12 + 1 & 0xFFF;
                        }
                    }
                }
            }

            v0 = v13;
            v1 = v14;
            v9 = 0;
        }

        gb.an = v0 * 0x71673605;
        gb.ap = v1 * -2009184621;
        return 0;
    }
}

