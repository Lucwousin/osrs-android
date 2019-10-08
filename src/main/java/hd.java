public class hd {
    int ae;
    int[] aj;
    int al;
    int an;
    int ap;
    int ar;
    int ax;

    hd() {
        super();
        this.ax = gf.ar(16);
        this.al = gf.ar(24);
        this.ae = gf.ar(24);
        this.ar = gf.ar(24) + 1;
        this.an = gf.ar(6) + 1;
        int v0 = 8;
        this.ap = gf.ar(v0);
        int[] v2 = new int[this.an];
        int v3 = 0;
        int v4;
        for(v4 = 0; v4 < this.an; ++v4) {
            int v6 = gf.ar(3);
            int v7 = gf.ae() != 0 ? 1 : 0;
            v7 = v7 != 0 ? gf.ar(5) : 0;
            v2[v4] = v7 << 3 | v6;
        }

        this.aj = new int[this.an * 8];
        while(v3 < this.an * 8) {
            int[] v4_1 = this.aj;
            int v5 = (v2[v3 >> 3] & 1 << (v3 & 7)) != 0 ? gf.ar(v0) : -1;
            v4_1[v3] = v5;
            ++v3;
        }
    }

    void ae(float[] arg18, int arg19, boolean arg20) {
        int v1;
        float[] v13;
        int v10;
        int v8;
        hd v0 = this;
        int v2 = arg19;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            arg18[v3] = 0f;
        }

        if(arg20) {
            return;
        }

        v2 = gf.ai[v0.ap].ax;
        v3 = (v0.ae - v0.al) / v0.ar;
        int[] v4 = new int[v3];
        int v5;
        for(v5 = 0; v5 < 8; ++v5) {
            int v7;
            for(v7 = 0; v7 < v3; v7 = v8) {
                if(v5 == 0) {
                    v8 = gf.ai[v0.ap].ae();
                    int v9;
                    for(v9 = v2 - 1; v9 >= 0; --v9) {
                        v10 = v7 + v9;
                        if(v10 < v3) {
                            v4[v10] = v8 % v0.an;
                        }

                        v8 /= v0.an;
                    }
                }

                v8 = v7;
                for(v7 = 0; v7 < v2; ++v7) {
                    v9 = v0.aj[v4[v8] * 8 + v5];
                    if(v9 >= 0) {
                        v10 = v0.al + v0.ar * v8;
                        gh v9_1 = gf.ai[v9];
                        if(v0.ax == 0) {
                            int v11 = v0.ar / v9_1.ax;
                            int v12;
                            for(v12 = 0; v12 < v11; ++v12) {
                                v13 = v9_1.ar();
                                int v14;
                                for(v14 = 0; v14 < v9_1.ax; ++v14) {
                                    v1 = v10 + v12 + v14 * v11;
                                    arg18[v1] += v13[v14];
                                }
                            }
                        }
                        else {
                            for(v1 = 0; v1 < v0.ar; v1 = v12) {
                                float[] v11_1 = v9_1.ar();
                                v12 = v1;
                                for(v1 = 0; v1 < v9_1.ax; ++v1) {
                                    int v13_1 = v10 + v12;
                                    arg18[((int)v13)] += v11_1[v1];
                                    ++v12;
                                }
                            }
                        }
                    }

                    ++v8;
                    if(v8 >= v3) {
                        break;
                    }
                }
            }
        }
    }

    void al(float[] arg18, int arg19, boolean arg20) {
        int v1;
        int v10;
        int v8;
        hd v0 = this;
        int v2 = arg19;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            arg18[v3] = 0f;
        }

        if(arg20) {
            return;
        }

        v2 = gf.ai[v0.ap].ax;
        v3 = (v0.ae - v0.al) / v0.ar;
        int[] v4 = new int[v3];
        int v5;
        for(v5 = 0; v5 < 8; ++v5) {
            int v7;
            for(v7 = 0; v7 < v3; v7 = v8) {
                if(v5 == 0) {
                    v8 = gf.ai[v0.ap].ae();
                    int v9;
                    for(v9 = v2 - 1; v9 >= 0; --v9) {
                        v10 = v7 + v9;
                        if(v10 < v3) {
                            v4[v10] = v8 % v0.an;
                        }

                        v8 /= v0.an;
                    }
                }

                v8 = v7;
                for(v7 = 0; v7 < v2; ++v7) {
                    v9 = v0.aj[v4[v8] * 8 + v5];
                    if(v9 >= 0) {
                        v10 = v0.al + v0.ar * v8;
                        gh v9_1 = gf.ai[v9];
                        if(v0.ax == 0) {
                            int v11 = v0.ar / v9_1.ax;
                            int v12;
                            for(v12 = 0; v12 < v11; ++v12) {
                                float[] v13 = v9_1.ar();
                                int v14;
                                for(v14 = 0; v14 < v9_1.ax; ++v14) {
                                    v1 = v10 + v12 + v14 * v11;
                                    arg18[v1] += v13[v14];
                                }
                            }
                        }
                        else {
                            for(v1 = 0; v1 < v0.ar; v1 = v12) {
                                float[] v11_1 = v9_1.ar();
                                v12 = v1;
                                for(v1 = 0; v1 < v9_1.ax; ++v1) {
                                    int v13_1 = v10 + v12;
                                    arg18[v13_1] += v11_1[v1];
                                    ++v12;
                                }
                            }
                        }
                    }

                    ++v8;
                    if(v8 >= v3) {
                        break;
                    }
                }
            }
        }
    }

    void ar(float[] arg18, int arg19, boolean arg20) {
        int v1;
        int v10;
        int v8;
        hd v0 = this;
        int v2 = arg19;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            arg18[v3] = 0f;
        }

        if(arg20) {
            return;
        }

        v2 = gf.ai[v0.ap].ax;
        v3 = (v0.ae - v0.al) / v0.ar;
        int[] v4 = new int[v3];
        int v5;
        for(v5 = 0; v5 < 8; ++v5) {
            int v7;
            for(v7 = 0; v7 < v3; v7 = v8) {
                if(v5 == 0) {
                    v8 = gf.ai[v0.ap].ae();
                    int v9;
                    for(v9 = v2 - 1; v9 >= 0; --v9) {
                        v10 = v7 + v9;
                        if(v10 < v3) {
                            v4[v10] = v8 % v0.an;
                        }

                        v8 /= v0.an;
                    }
                }

                v8 = v7;
                for(v7 = 0; v7 < v2; ++v7) {
                    v9 = v0.aj[v4[v8] * 8 + v5];
                    if(v9 >= 0) {
                        v10 = v0.al + v0.ar * v8;
                        gh v9_1 = gf.ai[v9];
                        if(v0.ax == 0) {
                            int v11 = v0.ar / v9_1.ax;
                            int v12;
                            for(v12 = 0; v12 < v11; ++v12) {
                                float[] v13 = v9_1.ar();
                                int v14;
                                for(v14 = 0; v14 < v9_1.ax; ++v14) {
                                    v1 = v10 + v12 + v14 * v11;
                                    arg18[v1] += v13[v14];
                                }
                            }
                        }
                        else {
                            for(v1 = 0; v1 < v0.ar; v1 = v12) {
                                float[] v11_1 = v9_1.ar();
                                v12 = v1;
                                for(v1 = 0; v1 < v9_1.ax; ++v1) {
                                    int v13_1 = v10 + v12;
                                    arg18[v13_1] += v11_1[v1];
                                    ++v12;
                                }
                            }
                        }
                    }

                    ++v8;
                    if(v8 >= v3) {
                        break;
                    }
                }
            }
        }
    }

    void ax(float[] arg18, int arg19, boolean arg20) {
        int v1;
        int v10;
        int v8;
        hd v0 = this;
        int v2 = arg19;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            arg18[v3] = 0f;
        }

        if(arg20) {
            return;
        }

        v2 = gf.ai[v0.ap].ax;
        v3 = (v0.ae - v0.al) / v0.ar;
        int[] v4 = new int[v3];
        int v5;
        for(v5 = 0; v5 < 8; ++v5) {
            int v7;
            for(v7 = 0; v7 < v3; v7 = v8) {
                if(v5 == 0) {
                    v8 = gf.ai[v0.ap].ae();
                    int v9;
                    for(v9 = v2 - 1; v9 >= 0; --v9) {
                        v10 = v7 + v9;
                        if(v10 < v3) {
                            v4[v10] = v8 % v0.an;
                        }

                        v8 /= v0.an;
                    }
                }

                v8 = v7;
                for(v7 = 0; v7 < v2; ++v7) {
                    v9 = v0.aj[v4[v8] * 8 + v5];
                    if(v9 >= 0) {
                        v10 = v0.al + v0.ar * v8;
                        gh v9_1 = gf.ai[v9];
                        if(v0.ax == 0) {
                            int v11 = v0.ar / v9_1.ax;
                            int v12;
                            for(v12 = 0; v12 < v11; ++v12) {
                                float[] v13 = v9_1.ar();
                                int v14;
                                for(v14 = 0; v14 < v9_1.ax; ++v14) {
                                    v1 = v10 + v12 + v14 * v11;
                                    arg18[v1] += v13[v14];
                                }
                            }
                        }
                        else {
                            for(v1 = 0; v1 < v0.ar; v1 = v12) {
                                float[] v11_1 = v9_1.ar();
                                v12 = v1;
                                for(v1 = 0; v1 < v9_1.ax; ++v1) {
                                    int v13_1 = v10 + v12;
                                    arg18[v13_1] += v11_1[v1];
                                    ++v12;
                                }
                            }
                        }
                    }

                    ++v8;
                    if(v8 >= v3) {
                        break;
                    }
                }
            }
        }
    }
}

