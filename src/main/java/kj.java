public class kj extends mx {
    mr ae;
    byte[] al;
    ki ar;
    public static final int as = 24;
    int ax;

    kj() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void bn(double arg37, int arg39, int arg40, int arg41) {
        double v25;
        double v23;
        int v3;
        try {
            double v0_1 = arg37 + (Math.random() * 0.03 - 0.015);
            int v4 = arg39 * 0x80;
            v3 = arg39;
            int v2 = arg40;
            while(true) {
            label_11:
                if(v3 >= v2) {
                    return;
                }

                double v5 = (((double)(v3 >> 3))) / 64 + 0.007813;
                double v9 = (((double)(v3 & 7))) / 8 + 0.0625;
                int v7 = 0;
                while(v7 < 0x80) {
                    double v11 = (((double)v7)) / 128;
                    double v13 = 0;
                    if(v13 != v9) {
                        double v17 = 1;
                        double v15 = v11 < 0.5 ? (v9 + v17) * v11 : v9 + v11 - v11 * v9;
                        double v19 = 2;
                        v11 = v11 * v19 - v15;
                        double v21 = 0.333333;
                        v23 = v5 + v21;
                        if(v23 > v17) {
                            v23 -= v17;
                        }

                        v21 = v5 - v21;
                        if(v21 < v13) {
                            v21 += v17;
                        }

                        v13 = 6;
                        double v27 = 0.666667;
                        double v29 = 3;
                        if(v23 * v13 < v17) {
                            v23 = v11 + v23 * ((v15 - v11) * v13);
                        }
                        else if(v23 * v19 < v17) {
                            v23 = v15;
                        }
                        else if(v23 * v29 < v19) {
                            v23 = v11 + (v15 - v11) * (v27 - v23) * v13;
                        }
                        else {
                            v23 = v11;
                        }

                        if(v5 * v13 < v17) {
                            v25 = v11 + (v15 - v11) * v13 * v5;
                        }
                        else if(v5 * v19 < v17) {
                            v25 = v15;
                        }
                        else if(v5 * v29 < v19) {
                            v25 = (v15 - v11) * (v27 - v5) * v13 + v11;
                        }
                        else {
                            v25 = v11;
                        }

                        if(v21 * v13 < v17) {
                            v11 += v21 * ((v15 - v11) * v13);
                            goto label_121;
                        }

                        if(v21 * v19 < v17) {
                            v11 = v15;
                            goto label_121;
                        }

                        if(v29 * v21 >= v19) {
                            goto label_121;
                        }

                        v11 += (v15 - v11) * (v27 - v21) * v13;
                    }
                    else {
                        v23 = v11;
                        v25 = v23;
                    }

                label_121:
                    double v33 = v5;
                    double v35 = v9;
                    int v5_1 = dw.bp(((((int)(v25 * 256))) << 8) + ((((int)(v23 * 256))) << 16) + (((int)(v11 * 256))), v0_1);
                    if(v5_1 == 0) {
                        v5_1 = 1;
                    }

                    bt.aa[v4] = v5_1;
                    ++v7;
                    ++v4;
                    v5 = v33;
                    v9 = v35;
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_150;
        }

        ++v3;
        goto label_11;
        return;
    label_150:
        StringBuilder v1 = new StringBuilder();
        v1.append("kj.bn(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }
}

