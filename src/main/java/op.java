import java.io.EOFException;
import java.io.IOException;

public class op {
    long ab;
    int ad;
    byte[] ae;
    long af;
    long ai;
    long aj;
    og al;
    int an;
    byte[] ap;
    long aq;
    long ar;
    static final int ax = 200000000;

    public op(og arg5, int arg6, int arg7) throws IOException {
        try {
            super();
            this.ar = 0x10271CC785C01FBFL;
            this.aj = 0x3234C17620BA8CBL;
            this.ad = 0;
            this.al = arg5;
            long v0 = arg5.an(0xEE9012BD) * 0x1D386E6FC124A92BL;
            this.ab = v0;
            this.af = v0 * -3258498282691991667L;
            this.ae = new byte[arg6];
            this.ap = new byte[arg7];
            this.aq = 0;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("op.<init>(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public void aa(byte[] arg4) throws IOException {
        this.an(arg4, 0, arg4.length, 0xD3509E09);
    }

    public void ab() throws IOException {
        this.ad(1250781646);
        this.al.ae(0x13D5F468);
    }

    void ad(int arg18) throws IOException {
        long v2;
        long v6;
        op v1 = this;
        try {
            long v4 = -6925496564762115299L;
            if(v1.aj * v4 != -1) {
                long v10 = -6921123073415056989L;
                if(v1.aj * v4 != v1.ai * v10) {
                    v1.al.ax(v1.aj * v4);
                    v1.ai = v1.aj * -1280949666440772545L;
                }

                int v8 = -10011105;
                v1.al.al(v1.ap, 0, v1.ad * v8, 0x7C074D1F);
                v1.ai += (((long)v1.ad)) * 0x2ED0721CC3E82155L;
                if(v1.ai * v10 > v1.ab * -5516627684734349949L) {
                    v1.ab = v1.ai * 0x45E87F8DFEE03161L;
                }

                long v13 = -2478930107747782719L;
                int v0_1 = 0xE0CB1565;
                if(v1.aj * v4 < v1.ar * v13 || v1.aj * v4 >= v1.ar * v13 + (((long)(v1.an * v0_1)))) {
                    if(v1.ar * v13 >= v1.aj * v4 && v1.ar * v13 < v1.aj * v4 + (((long)(v1.ad * v8)))) {
                        v6 = v1.ar * v13;
                        goto label_82;
                    }

                    v6 = -1;
                }
                else {
                    v6 = v1.aj * v4;
                }

            label_82:
                if(v1.aj * v4 + (((long)(v1.ad * v8))) <= v1.ar * v13 || (((long)(v1.ad * v8))) + v1.aj * v4 > v1.ar * v13 + (((long)(v1.an * v0_1)))) {
                    if(v1.ar * -2478930107747782719L + (((long)(v1.an * v0_1))) > v1.aj * v4 && v1.ar * -2478930107747782719L + (((long)(v1.an * v0_1))) <= (((long)(v1.ad * v8))) + v1.aj * v4) {
                        v2 = v1.ar * -2478930107747782719L + (((long)(v1.an * v0_1)));
                        goto label_147;
                    }

                    v2 = -1;
                }
                else {
                    v2 = (((long)(v1.ad * v8))) + v1.aj * v4;
                }

            label_147:
                if(v6 > -1 && v2 > v6) {
                    System.arraycopy(v1.ap, ((int)(v6 - v1.aj * v4)), v1.ae, ((int)(v6 - v1.ar * -2478930107747782719L)), ((int)(v2 - v6)));
                }

                v1.aj = 0x3234C17620BA8CBL;
                v1.ad = 0;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("op.ad(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0), v2_1.toString());
        }
    }

    public long ae(int arg5) {
        try {
            return this.af * -1922721296302768817L;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("op.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public void af(long arg3) throws IOException {
        if(arg3 >= 0) {
            this.aq = arg3 * -4279291253637180493L;
            return;
        }

        throw new IOException("");
    }

    void ag() throws IOException {
        this.an = 0;
        long v4 = 7356304704283988859L;
        if(this.ai * -6921123073415056989L != this.aq * v4) {
            this.al.ax(this.aq * v4);
            this.ai = this.aq * -2225316316219759543L;
        }

        this.ar = this.aq * -5533650372278136261L;
        while(this.an * 0xE0CB1565 < this.ae.length) {
            int v0 = this.ae.length - this.an * -927740529;
            if(v0 > 200000000) {
                v0 = 200000000;
            }

            v0 = this.al.ap(this.ae, this.an * 0xEC669625, v0, 1166006047);
            if(v0 == -1) {
                return;
            }

            this.ai += (((long)v0)) * 0x5B951920560CCA0BL;
            this.an += v0 * -1483084107;
        }
    }

    public void ah(byte[] arg20, int arg21, int arg22) throws IOException {
        long v5_1;
        long v3_1;
        op v1 = this;
        byte[] v0 = arg20;
        int v2 = arg21;
        int v3 = arg22;
        try {
            long v6 = 7356304704283988859L;
            long v8 = ((long)v3);
            if(v1.aq * v6 + v8 > v1.af * -1922721296302768817L) {
                v1.af = (v1.aq * v6 + v8) * -6964411639753508433L;
            }

            long v10 = -6925496564762115299L;
            long v12 = -1;
            if(v12 != v1.aj * v10 && (v1.aq * v6 < v1.aj * v10 || v1.aq * v6 > v1.aj * v10 + (((long)(v1.ad * -1440902163))))) {
                v1.ad(0x3830B277);
            }

            v6 = -4279291253637180493L;
            if(v12 != v1.aj * v10 && v1.aq * 7356304704283988859L + v8 > v1.aj * v10 + (((long)v1.ap.length))) {
                int v4 = ((int)((((long)v1.ap.length)) - (v1.aq * 7356304704283988859L - v1.aj * v10)));
                System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v4);
                v1.aq += (((long)v4)) * v6;
                v2 += v4;
                v3 -= v4;
                v1.ad = v1.ap.length * -984826401;
                v1.ad(-1192890648);
            }

            if(v3 > v1.ap.length) {
                v8 = -6921123073415056989L;
                long v14 = 7356304704283988859L;
                if(v1.ai * v8 != v1.aq * v14) {
                    v1.al.ax(v1.aq * v14);
                    v1.ai = v1.aq * -2225316316219759543L;
                }

                v1.al.al(v0, v2, v3, 1131232058);
                v14 = ((long)v3);
                v1.ai += 0x5B951920560CCA0BL * v14;
                if(v1.ai * v8 > v1.ab * -5516627684734349949L) {
                    v1.ab = v1.ai * 0x45E87F8DFEE03161L;
                }

                v8 = 7356304704283988859L;
                long v17 = -2478930107747782719L;
                if(v1.aq * v8 < v1.ar * v17 || v1.aq * v8 >= (((long)(v1.an * 0x1F8251BF))) + v1.ar * v17) {
                    v10 = 7356304704283988859L;
                    if(v1.ar * v17 >= v1.aq * v10 && v1.ar * v17 < v1.aq * v10 + v14) {
                        v3_1 = v1.ar * v17;
                        goto label_170;
                    }

                    v3_1 = v12;
                }
                else {
                    v3_1 = v1.aq * 7356304704283988859L;
                }

            label_170:
                int v5 = 0xE0CB1565;
                if(v1.aq * 7356304704283988859L + v14 <= v1.ar * v17 || v1.aq * 7356304704283988859L + v14 > v1.ar * v17 + (((long)(v1.an * v5)))) {
                    if((((long)(v1.an * -780953699))) + v1.ar * v17 > v1.aq * 7356304704283988859L && v1.ar * v17 + (((long)(v1.an * v5))) <= v1.aq * 7356304704283988859L + v14) {
                        v5_1 = v1.ar * v17 + (((long)(v1.an * v5)));
                        goto label_229;
                    }

                    v5_1 = v12;
                }
                else {
                    v5_1 = v1.aq * 7356304704283988859L + v14;
                }

            label_229:
                if(v3_1 > v12 && v5_1 > v3_1) {
                    System.arraycopy(v0, ((int)((((long)v2)) + v3_1 - v1.aq * 7356304704283988859L)), v1.ae, ((int)(v3_1 - v1.ar * v17)), ((int)(v5_1 - v3_1)));
                }

                v1.aq += v14 * -4279291253637180493L;
                return;
            }

            if(v3 <= 0) {
                return;
            }

            if(v1.aj * v10 == v12) {
                v1.aj = v1.aq * 0x79249001815B9577L;
            }

            System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v3);
            v1.aq += (((long)v3)) * -4279291253637180493L;
            if(v1.aq * 7356304704283988859L - v1.aj * v10 > (((long)(v1.ad * -10011105)))) {
                v1.ad = (((int)(v1.aq * 7356304704283988859L - v1.aj * v10))) * -905018519;
            }
        }
        catch(IOException v0_1) {
            v1.ai = -6599208455654656523L;
            throw v0_1;
        }
    }

    public long ai() {
        return this.af * -1922721296302768817L;
    }

    public void aj(byte[] arg22, int arg23, int arg24, int arg25) throws IOException {
        long v3_1;
        long v7;
        op v1 = this;
        byte[] v0 = arg22;
        int v2 = arg23;
        int v3 = arg24;
        try {
            long v6 = 7356304704283988859L;
            long v8 = ((long)v3);
            if(v1.aq * v6 + v8 > v1.af * -1922721296302768817L) {
                v1.af = (v1.aq * v6 + v8) * -6964411639753508433L;
            }

            long v10 = -6925496564762115299L;
            int v12 = -10011105;
            if(-1 != v1.aj * v10 && (v1.aq * v6 < v1.aj * v10 || v1.aq * v6 > v1.aj * v10 + (((long)(v1.ad * v12))))) {
                v1.ad(0x26A535DA);
            }

            int v6_1 = -984826401;
            if(-1 != v1.aj * v10 && v1.aq * 7356304704283988859L + v8 > v1.aj * v10 + (((long)v1.ap.length))) {
                int v4 = ((int)((((long)v1.ap.length)) - (v1.aq * 7356304704283988859L - v1.aj * v10)));
                System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v4);
                v1.aq += (((long)v4)) * -4279291253637180493L;
                v2 += v4;
                v3 -= v4;
                v1.ad = v1.ap.length * v6_1;
                v1.ad(0x5F2EECB9);
            }

            if(v3 > v1.ap.length) {
                v6 = -6921123073415056989L;
                v10 = 7356304704283988859L;
                if(v1.ai * v6 != v1.aq * v10) {
                    v1.al.ax(v1.aq * v10);
                    v1.ai = v1.aq * -2225316316219759543L;
                }

                v1.al.al(v0, v2, v3, 0xEFAABB67);
                v10 = ((long)v3);
                v1.ai += 0x5B951920560CCA0BL * v10;
                if(v1.ai * v6 > v1.ab * -5516627684734349949L) {
                    v1.ab = v1.ai * 0x45E87F8DFEE03161L;
                }

                long v5 = 7356304704283988859L;
                long v12_1 = -2478930107747782719L;
                int v9 = 0xE0CB1565;
                if(v1.aq * v5 < v1.ar * v12_1 || v1.aq * v5 >= (((long)(v1.an * v9))) + v1.ar * v12_1) {
                    v7 = 7356304704283988859L;
                    if(v1.ar * v12_1 >= v1.aq * v7 && v1.ar * v12_1 < v1.aq * v7 + v10) {
                        v3_1 = v1.ar * v12_1;
                        goto label_171;
                    }

                    v3_1 = -1;
                }
                else {
                    v3_1 = v1.aq * 7356304704283988859L;
                }

            label_171:
                v7 = 7356304704283988859L;
                long v19 = v10;
                if(v1.aq * v7 + v10 <= v1.ar * v12_1 || v19 + v1.aq * v7 > v1.ar * v12_1 + (((long)(v1.an * 0xE0CB1565)))) {
                    if((((long)(v1.an * 0xE0CB1565))) + v1.ar * v12_1 > v1.aq * 7356304704283988859L && v1.ar * v12_1 + (((long)(v1.an * 0xE0CB1565))) <= v19 + v1.aq * 7356304704283988859L) {
                        v5 = v1.ar * v12_1 + (((long)(v1.an * 0xE0CB1565)));
                        goto label_232;
                    }

                    v5 = -1;
                }
                else {
                    v5 = v1.aq * 7356304704283988859L + v19;
                }

            label_232:
                if(v3_1 > -1 && v5 > v3_1) {
                    System.arraycopy(v0, ((int)((((long)v2)) + v3_1 - v1.aq * 7356304704283988859L)), v1.ae, ((int)(v3_1 - v1.ar * v12_1)), ((int)(v5 - v3_1)));
                }

                v1.aq += v19 * -4279291253637180493L;
                return;
            }

            if(v3 <= 0) {
                return;
            }

            if(v1.aj * v10 == -1) {
                v1.aj = v1.aq * 0x79249001815B9577L;
            }

            System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v3);
            v1.aq += (((long)v3)) * -4279291253637180493L;
            if(v1.aq * 7356304704283988859L - v1.aj * v10 > (((long)(v1.ad * -10011105)))) {
                v1.ad = (((int)(v1.aq * 7356304704283988859L - v1.aj * v10))) * v6_1;
            }
        }
        catch(RuntimeException v0_1) {
        }
        catch(IOException v0_2) {
            long v2_1 = -6599208455654656523L;
            try {
                v1.ai = v2_1;
                throw v0_2;
            }
            catch(RuntimeException v0_1) {
                StringBuilder v2_2 = new StringBuilder();
                v2_2.append("op.aj(");
                v2_2.append(')');
                throw lx.al(((Throwable)v0_1), v2_2.toString());
            }
        }
    }

    public void al(long arg3) throws IOException {
        if(arg3 < 0) {
            goto label_6;
        }

        arg3 *= -4279291253637180493L;
        try {
            this.aq = arg3;
            return;
        label_6:
            throw new IOException("");
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("op.al(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void am(byte[] arg27, int arg28, int arg29) throws IOException {
        long v17;
        long v5_1;
        int v6_1;
        int v5;
        op v1 = this;
        byte[] v0 = arg27;
        int v2 = arg28;
        int v3 = arg29;
        int v4 = v2 + v3;
        try {
            if(v4 > v0.length) {
                goto label_293;
            }

            long v6 = -6925496564762115299L;
            long v12 = 7356304704283988859L;
            if(v1.aj * v6 != -1 && v1.aq * v12 >= v1.aj * v6) {
                long v4_1 = ((long)v3);
                if(v1.aq * v12 + v4_1 <= (((long)(v1.ad * 0xD587A25C))) + v1.aj * v6) {
                    System.arraycopy(v1.ap, ((int)(v1.aq * v12 - v1.aj * v6)), v0, v2, v3);
                    v1.aq += v4_1 * -4279291253637180493L;
                    return;
                }
            }

            long v8 = v1.aq * v12;
            long v14 = -2478930107747782719L;
            int v16 = 0xE0CB1565;
            if(v1.aq * v12 < v1.ar * v14 || v1.aq * v12 >= v1.ar * v14 + (((long)(v1.an * -2041970320)))) {
                v5 = v2;
                v4 = v3;
            }
            else {
                v4 = ((int)((((long)(v1.an * v16))) - (v1.aq * v12 - v1.ar * v14)));
                if(v4 > v3) {
                    v4 = v3;
                }

                System.arraycopy(v1.ae, ((int)(v1.aq * v12 - v1.ar * v14)), v0, v2, v4);
                v1.aq += (((long)v4)) * -4279291253637180493L;
                v5 = v2 + v4;
                v4 = v3 - v4;
            }

            if(v4 > v1.ae.length) {
                v1.al.ax(v1.aq * v12);
                v1.ai = v1.aq * -2225316316219759543L;
                while(v4 > 0) {
                    v6_1 = v1.al.ap(v0, v5, v4, 1166006047);
                    if(-1 == v6_1) {
                    }
                    else {
                        v14 = ((long)v6_1);
                        v1.ai += 0x5B951920560CCA0BL * v14;
                        v1.aq += v14 * -4279291253637180493L;
                        v5 += v6_1;
                        v4 -= v6_1;
                        continue;
                    }

                    break;
                }
            }
            else if(v4 > 0) {
                v1.ap(0xD91A0146);
                v6_1 = v4 > v1.an * v16 ? v1.an * v16 : v4;
                System.arraycopy(v1.ae, 0, v0, v5, v6_1);
                v5 += v6_1;
                v4 -= v6_1;
                v1.aq += (((long)v6_1)) * -4279291253637180493L;
            }

            v14 = -6925496564762115299L;
            if(-1 != v1.aj * v14) {
                long v24 = v8;
                if(v1.aj * v14 > v1.aq * v12 && v4 > 0) {
                    v6_1 = (((int)(v1.aj * v14 - v1.aq * v12))) + v5;
                    int v7 = v4 + v5;
                    if(v6_1 > v7) {
                        v6_1 = v7;
                    }

                    while(v5 < v6_1) {
                        v0[v5] = 0;
                        --v4;
                        v1.aq += -4279291253637180493L;
                        ++v5;
                    }
                }

                long v7_1 = -6925496564762115299L;
                int v9 = -10011105;
                if(v1.aj * v7_1 < v24 || v1.aj * v7_1 >= v24 + (((long)v3))) {
                    if(v24 >= v1.aj * v7_1 && v24 < v1.aj * v7_1 + (((long)(v1.ad * v9)))) {
                        v5_1 = v24;
                        goto label_215;
                    }

                    v5_1 = -1;
                }
                else {
                    v5_1 = v1.aj * v7_1;
                }

            label_215:
                v14 = -6925496564762115299L;
                if((((long)(v1.ad * v9))) + v1.aj * v14 <= v24 || v1.aj * v14 + (((long)(v1.ad * v9))) > v24 + (((long)v3))) {
                    v7_1 = (((long)v3)) + v24;
                    v14 = -6925496564762115299L;
                    if(v7_1 > v1.aj * v14 && v7_1 <= v1.aj * v14 + (((long)(v1.ad * v9)))) {
                        v17 = v7_1;
                    label_241:
                        v7_1 = -1;
                        goto label_260;
                    }

                    v7_1 = -1;
                    v17 = -1;
                }
                else {
                    v17 = v1.aj * -6925496564762115299L + (((long)(v1.ad * v9)));
                    goto label_241;
                }

            label_260:
                if(v5_1 <= v7_1) {
                    goto label_288;
                }

                if(v17 <= v5_1) {
                    goto label_288;
                }

                System.arraycopy(v1.ap, ((int)(v5_1 - v1.aj * -6925496564762115299L)), v0, v2 + (((int)(v5_1 - v24))), ((int)(v17 - v5_1)));
                if(v17 <= v1.aq * v12) {
                    goto label_288;
                }

                v4 = ((int)((((long)v4)) - (v17 - v1.aq * v12)));
                v1.aq = -4279291253637180493L * v17;
            }
        }
        catch(IOException v0_1) {
            goto label_300;
        }

    label_288:
        if(v4 <= 0) {
            return;
        }

        throw new EOFException();
        try {
        label_293:
            throw new ArrayIndexOutOfBoundsException(v4 - v0.length);
        }
        catch(IOException v0_1) {
        label_300:
            v1.ai = -6599208455654656523L;
            throw v0_1;
        }
    }

    public void an(byte[] arg20, int arg21, int arg22, int arg23) throws IOException {
        int v10;
        int v9;
        int v8_1;
        long v4_1;
        op v1 = this;
        byte[] v0 = arg20;
        int v2 = arg21;
        int v3 = arg22;
        int v4 = v2 + v3;
        try {
            if(v4 > v0.length) {
                goto label_299;
            }

            long v6 = -6925496564762115299L;
            int v12 = -10011105;
            long v13 = 7356304704283988859L;
            if(v1.aj * v6 != -1 && v1.aq * v13 >= v1.aj * v6) {
                v4_1 = ((long)v3);
                if(v1.aq * v13 + v4_1 <= (((long)(v1.ad * v12))) + v1.aj * v6) {
                    System.arraycopy(v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v6)), v0, v2, v3);
                    v1.aq += v4_1 * -4279291253637180493L;
                    return;
                }
            }

            long v8 = 7356304704283988859L;
            v4_1 = v1.aq * v8;
            long v14 = -2478930107747782719L;
            int v16 = 0xE0CB1565;
            if(v1.aq * v8 < v1.ar * v14 || v1.aq * v8 >= v1.ar * v14 + (((long)(v1.an * v16)))) {
                v9 = v2;
                v8_1 = v3;
            }
            else {
                v8_1 = ((int)((((long)(v1.an * v16))) - (v1.aq * 7356304704283988859L - v1.ar * v14)));
                if(v8_1 > v3) {
                    v8_1 = v3;
                }

                System.arraycopy(v1.ae, ((int)(v1.aq * 7356304704283988859L - v1.ar * v14)), v0, v2, v8_1);
                v1.aq += (((long)v8_1)) * -4279291253637180493L;
                v9 = v2 + v8_1;
                v8_1 = v3 - v8_1;
            }

            if(v8_1 > v1.ae.length) {
                v1.al.ax(v1.aq * 7356304704283988859L);
                v1.ai = v1.aq * -2225316316219759543L;
                while(v8_1 > 0) {
                    v10 = v1.al.ap(v0, v9, v8_1, 1166006047);
                    if(-1 == v10) {
                    }
                    else {
                        v14 = ((long)v10);
                        v1.ai += 0x5B951920560CCA0BL * v14;
                        v1.aq += v14 * -4279291253637180493L;
                        v9 += v10;
                        v8_1 -= v10;
                        continue;
                    }

                    break;
                }
            }
            else if(v8_1 > 0) {
                v1.ap(0xA94F3F1F);
                v10 = v8_1 > v1.an * v16 ? v1.an * v16 : v8_1;
                System.arraycopy(v1.ae, 0, v0, v9, v10);
                v9 += v10;
                v8_1 -= v10;
                v1.aq += (((long)v10)) * -4279291253637180493L;
            }

            if(-1 != v1.aj * v6) {
                long v17 = 7356304704283988859L;
                if(v1.aj * v6 > v1.aq * v17 && v8_1 > 0) {
                    int v6_1 = (((int)(v1.aj * -6925496564762115299L - v1.aq * v17))) + v9;
                    int v7 = v8_1 + v9;
                    if(v6_1 > v7) {
                        v6_1 = v7;
                    }

                    while(v9 < v6_1) {
                        v0[v9] = 0;
                        --v8_1;
                        v1.aq += -4279291253637180493L;
                        ++v9;
                    }
                }

                long v9_1 = -6925496564762115299L;
                if(v1.aj * v9_1 < v4_1 || v1.aj * v9_1 >= (((long)v3)) + v4_1) {
                    v9_1 = -6925496564762115299L;
                    if(v4_1 >= v1.aj * v9_1 && v4_1 < v1.aj * v9_1 + (((long)(v1.ad * -10011105)))) {
                        v6 = v4_1;
                        goto label_219;
                    }

                    v6 = -1;
                }
                else {
                    v6 = v1.aj * v9_1;
                }

            label_219:
                v13 = -6925496564762115299L;
                if((((long)(v1.ad * -10011105))) + v1.aj * v13 <= v4_1 || v1.aj * v13 + (((long)(v1.ad * -10011105))) > (((long)v3)) + v4_1) {
                    v9_1 = (((long)v3)) + v4_1;
                    v13 = -6925496564762115299L;
                    if(v9_1 > v1.aj * v13 && v9_1 <= v1.aj * v13 + (((long)(v1.ad * -10011105)))) {
                        goto label_264;
                    }

                    v9_1 = -1;
                }
                else {
                    v9_1 = v1.aj * -6925496564762115299L + (((long)(v1.ad * -10011105)));
                }

            label_264:
                if(v6 <= -1) {
                    goto label_294;
                }

                if(v9_1 <= v6) {
                    goto label_294;
                }

                System.arraycopy(v1.ap, ((int)(v6 - v1.aj * -6925496564762115299L)), v0, v2 + (((int)(v6 - v4_1))), ((int)(v9_1 - v6)));
                v4_1 = 7356304704283988859L;
                if(v9_1 <= v1.aq * v4_1) {
                    goto label_294;
                }

                v8_1 = ((int)((((long)v8_1)) - (v9_1 - v1.aq * v4_1)));
                v1.aq = v9_1 * -4279291253637180493L;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_310;
        }
        catch(IOException v0_2) {
            goto label_307;
        }

    label_294:
        if(v8_1 <= 0) {
            return;
        }

        try {
            throw new EOFException();
            try {
            label_299:
                throw new ArrayIndexOutOfBoundsException(v4 - v0.length);
            }
            catch(IOException v0_2) {
            label_307:
                long v2_1 = -6599208455654656523L;
                try {
                    v1.ai = v2_1;
                    throw v0_2;
                }
                catch(RuntimeException v0_1) {
                label_310:
                    StringBuilder v2_2 = new StringBuilder();
                    v2_2.append("op.an(");
                    v2_2.append(')');
                    throw lx.al(((Throwable)v0_1), v2_2.toString());
                }
            }
        }
        catch(RuntimeException v0_1) {
            goto label_310;
        }
    }

    void ao() throws IOException {
        long v1;
        op v0 = this;
        long v3 = -6925496564762115299L;
        long v5 = -1;
        if(v0.aj * v3 != v5) {
            long v9 = -6921123073415056989L;
            if(v0.aj * v3 != v0.ai * v9) {
                v0.al.ax(v0.aj * v3);
                v0.ai = v0.aj * -1280949666440772545L;
            }

            v0.al.al(v0.ap, 0, v0.ad * -2085408720, 0x705852B9);
            v0.ai += (((long)v0.ad)) * 0x2ED0721CC3E82155L;
            if(v0.ai * v9 > v0.ab * -5516627684734349949L) {
                v0.ab = v0.ai * 0x45E87F8DFEE03161L;
            }

            v9 = -2478930107747782719L;
            int v12 = 0xE0CB1565;
            if(v0.aj * v3 < v0.ar * v9 || v0.aj * v3 >= v0.ar * v9 + (((long)(v0.an * v12)))) {
                if(v0.ar * v9 >= v0.aj * v3 && v0.ar * v9 < v0.aj * v3 + (((long)(v0.ad * -2005287622)))) {
                    v1 = v0.ar * v9;
                    goto label_83;
                }

                v1 = v5;
            }
            else {
                v1 = v0.aj * v3;
            }

        label_83:
            int v14 = -10011105;
            if(v0.aj * v3 + (((long)(v0.ad * v14))) <= v0.ar * v9 || (((long)(v0.ad * v14))) + v0.aj * v3 > v0.ar * v9 + (((long)(v0.an * v12)))) {
                if(v0.ar * v9 + (((long)(v0.an * 0x344EB379))) > v0.aj * v3 && v0.ar * v9 + (((long)(v0.an * v12))) <= (((long)(v0.ad * -10011105))) + v0.aj * v3) {
                    v5 = v0.ar * v9 + (((long)(v0.an * 0xBCBC3B19)));
                    goto label_147;
                }

                v5 = -1;
            }
            else {
                v5 = (((long)(v0.ad * 0x22D3383A))) + v0.aj * v3;
            }

        label_147:
            if(v1 > -1 && v5 > v1) {
                System.arraycopy(v0.ap, ((int)(v1 - v0.aj * v3)), v0.ae, ((int)(v1 - v0.ar * v9)), ((int)(v5 - v1)));
            }

            v0.aj = 0x3234C17620BA8CBL;
            v0.ad = 0;
        }
    }

    void ap(int arg7) throws IOException {
        try {
            this.an = 0;
            long v4 = 7356304704283988859L;
            if(this.ai * -6921123073415056989L != this.aq * v4) {
                this.al.ax(this.aq * v4);
                this.ai = this.aq * -2225316316219759543L;
            }

            this.ar = this.aq * -5533650372278136261L;
            while(true) {
                int v0 = 0xE0CB1565;
                if(this.an * v0 < this.ae.length) {
                    arg7 = this.ae.length - this.an * v0;
                    if(arg7 > 200000000) {
                        arg7 = 200000000;
                    }

                    arg7 = this.al.ap(this.ae, this.an * v0, arg7, 1166006047);
                    if(arg7 == -1) {
                        return;
                    }

                    this.ai += (((long)arg7)) * 0x5B951920560CCA0BL;
                    this.an += arg7 * 481039469;
                    continue;
                }

                return;
            }
        }
        catch(RuntimeException v7) {
            goto label_59;
        }

        return;
    label_59:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("op.ap(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7), v0_1.toString());
    }

    public void aq() throws IOException {
        this.ad(0x2A5FE7EE);
        this.al.ae(0x22E42057);
    }

    public void ar(byte[] arg3, int arg4) throws IOException {
        try {
            this.an(arg3, 0, arg3.length, 0xCE326F81);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("op.ar(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void at(byte[] arg19, int arg20, int arg21) throws IOException {
        long v3_1;
        op v1 = this;
        byte[] v0 = arg19;
        int v2 = arg20;
        int v3 = arg21;
        try {
            long v6 = 7356304704283988859L;
            long v8 = ((long)v3);
            if(v1.aq * v6 + v8 > v1.af * -1922721296302768817L) {
                v1.af = (v1.aq * v6 + v8) * -6964411639753508433L;
            }

            long v10 = -6925496564762115299L;
            long v12 = -1;
            if(v12 != v1.aj * v10 && (v1.aq * v6 < v1.aj * v10 || v1.aq * v6 > v1.aj * v10 + (((long)(v1.ad * -10011105))))) {
                v1.ad(256070627);
            }

            int v6_1 = -984826401;
            long v14 = -4279291253637180493L;
            if(v12 != v1.aj * v10 && v1.aq * 7356304704283988859L + v8 > v1.aj * v10 + (((long)v1.ap.length))) {
                int v4 = ((int)((((long)v1.ap.length)) - (v1.aq * 7356304704283988859L - v1.aj * v10)));
                System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v4);
                v1.aq += (((long)v4)) * v14;
                v2 += v4;
                v3 -= v4;
                v1.ad = v1.ap.length * v6_1;
                v1.ad(0x868FD42E);
            }

            if(v3 > v1.ap.length) {
                v6 = -6921123073415056989L;
                v10 = 7356304704283988859L;
                if(v1.ai * v6 != v1.aq * v10) {
                    v1.al.ax(v1.aq * v10);
                    v1.ai = v1.aq * -2225316316219759543L;
                }

                v1.al.al(v0, v2, v3, -640810750);
                v10 = ((long)v3);
                v1.ai += 0x5B951920560CCA0BL * v10;
                if(v1.ai * v6 > v1.ab * -5516627684734349949L) {
                    v1.ab = v1.ai * 0x45E87F8DFEE03161L;
                }

                long v5 = 7356304704283988859L;
                v12 = -2478930107747782719L;
                if(v1.aq * v5 < v1.ar * v12 || v1.aq * v5 >= (((long)(v1.an * 0xC761E89F))) + v1.ar * v12) {
                    long v7 = 7356304704283988859L;
                    if(v1.ar * v12 >= v1.aq * v7 && v1.ar * v12 < v1.aq * v7 + v10) {
                        v3_1 = v1.ar * v12;
                        goto label_170;
                    }

                    v3_1 = -1;
                }
                else {
                    v3_1 = v1.aq * 7356304704283988859L;
                }

            label_170:
                int v9 = 0xE0CB1565;
                if(v1.aq * 7356304704283988859L + v10 <= v1.ar * v12 || v1.aq * 7356304704283988859L + v10 > v1.ar * v12 + (((long)(v1.an * v9)))) {
                    if((((long)(v1.an * 0x953D9BF9))) + v1.ar * v12 > v1.aq * 7356304704283988859L && v1.ar * v12 + (((long)(v1.an * 0x36432F69))) <= v1.aq * 7356304704283988859L + v10) {
                        v5 = v1.ar * v12 + (((long)(v1.an * v9)));
                        goto label_230;
                    }

                    v5 = -1;
                }
                else {
                    v5 = v1.aq * 7356304704283988859L + v10;
                }

            label_230:
                if(v3_1 > -1 && v5 > v3_1) {
                    System.arraycopy(v0, ((int)((((long)v2)) + v3_1 - v1.aq * 7356304704283988859L)), v1.ae, ((int)(v3_1 - v1.ar * v12)), ((int)(v5 - v3_1)));
                }

                v1.aq += v10 * -4279291253637180493L;
                return;
            }

            if(v3 <= 0) {
                return;
            }

            if(v1.aj * v10 == -1) {
                v1.aj = v1.aq * 0x79249001815B9577L;
            }

            System.arraycopy(v0, v2, v1.ap, ((int)(v1.aq * 7356304704283988859L - v1.aj * v10)), v3);
            v1.aq += (((long)v3)) * -4279291253637180493L;
            if(v1.aq * 7356304704283988859L - v1.aj * v10 > (((long)(v1.ad * 0x32EEFDB0)))) {
                v1.ad = (((int)(v1.aq * 7356304704283988859L - v1.aj * v10))) * v6_1;
            }
        }
        catch(IOException v0_1) {
            v1.ai = -6599208455654656523L;
            throw v0_1;
        }
    }

    public void au(byte[] arg4) throws IOException {
        this.an(arg4, 0, arg4.length, 0xBB3EC04A);
    }

    public void av(byte[] arg4) throws IOException {
        this.an(arg4, 0, arg4.length, 0xA5F657AC);
    }

    void aw() throws IOException {
        long v1;
        op v0 = this;
        long v3 = -6925496564762115299L;
        long v5 = -1;
        if(v0.aj * v3 != v5) {
            long v9 = -6921123073415056989L;
            if(v0.aj * v3 != v0.ai * v9) {
                v0.al.ax(v0.aj * v3);
                v0.ai = v0.aj * -1280949666440772545L;
            }

            v0.al.al(v0.ap, 0, v0.ad * 0xE3157097, 0xF33A71F7);
            v0.ai += (((long)v0.ad)) * 0x2ED0721CC3E82155L;
            if(v0.ai * v9 > v0.ab * -5516627684734349949L) {
                v0.ab = v0.ai * 0x45E87F8DFEE03161L;
            }

            v9 = -2478930107747782719L;
            int v12 = -10011105;
            if(v0.aj * v3 < v0.ar * v9 || v0.aj * v3 >= v0.ar * v9 + (((long)(v0.an * 0x8B8F0F65)))) {
                if(v0.ar * v9 >= v0.aj * v3 && v0.ar * v9 < v0.aj * v3 + (((long)(v0.ad * v12)))) {
                    v1 = v0.ar * v9;
                    goto label_83;
                }

                v1 = v5;
            }
            else {
                v1 = v0.aj * v3;
            }

        label_83:
            int v15 = 0xE0CB1565;
            if(v0.aj * v3 + (((long)(v0.ad * v12))) <= v0.ar * v9 || (((long)(v0.ad * 674134077))) + v0.aj * v3 > v0.ar * v9 + (((long)(v0.an * v15)))) {
                if(v0.ar * v9 + (((long)(v0.an * v15))) > v0.aj * v3 && v0.ar * v9 + (((long)(v0.an * v15))) <= (((long)(v0.ad * v12))) + v0.aj * v3) {
                    v5 = v0.ar * v9 + (((long)(v0.an * v15)));
                    goto label_144;
                }

                v5 = -1;
            }
            else {
                v5 = (((long)(v0.ad * v12))) + v0.aj * v3;
            }

        label_144:
            if(v1 > -1 && v5 > v1) {
                System.arraycopy(v0.ap, ((int)(v1 - v0.aj * v3)), v0.ae, ((int)(v1 - v0.ar * v9)), ((int)(v5 - v1)));
            }

            v0.aj = 0x3234C17620BA8CBL;
            v0.ad = 0;
        }
    }

    public void ax(int arg3) throws IOException {
        arg3 = 0x103AFCD2;
        try {
            this.ad(arg3);
            this.al.ae(1589088622);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("op.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ay() throws IOException {
        long v16;
        long v1;
        op v0 = this;
        long v3 = -6925496564762115299L;
        long v5 = -1;
        if(v0.aj * v3 != v5) {
            long v9 = -6921123073415056989L;
            if(v0.aj * v3 != v0.ai * v9) {
                v0.al.ax(v0.aj * v3);
                v0.ai = v0.aj * -1280949666440772545L;
            }

            v0.al.al(v0.ap, 0, v0.ad * 0x760DF95D, 0xDFA68AE0);
            v0.ai += (((long)v0.ad)) * 0x2ED0721CC3E82155L;
            if(v0.ai * v9 > v0.ab * -5516627684734349949L) {
                v0.ab = v0.ai * 0x45E87F8DFEE03161L;
            }

            v9 = -2478930107747782719L;
            if(v0.aj * v3 < v0.ar * v9 || v0.aj * v3 >= v0.ar * v9 + (((long)(v0.an * 0xFF6D48B5)))) {
                if(v0.ar * v9 >= v0.aj * v3 && v0.ar * v9 < v0.aj * v3 + (((long)(v0.ad * -1505281030)))) {
                    v1 = v0.ar * v9;
                    goto label_83;
                }

                v1 = v5;
            }
            else {
                v1 = v0.aj * v3;
            }

        label_83:
            int v13 = -10011105;
            if(v0.aj * v3 + (((long)(v0.ad * v13))) <= v0.ar * v9 || (((long)(v0.ad * v13))) + v0.aj * v3 > v0.ar * v9 + (((long)(v0.an * 1952300412)))) {
                int v12 = 0xE0CB1565;
                if(v0.ar * v9 + (((long)(v0.an * v12))) > v0.aj * v3 && v0.ar * v9 + (((long)(v0.an * v12))) <= (((long)(v0.ad * v13))) + v0.aj * v3) {
                    v16 = v0.ar * v9 + (((long)(v0.an * v12)));
                    v5 = -1;
                    goto label_150;
                }

                v5 = -1;
                v16 = -1;
            }
            else {
                v16 = (((long)(v0.ad * -804500374))) + v0.aj * v3;
            }

        label_150:
            if(v1 > v5 && v16 > v1) {
                System.arraycopy(v0.ap, ((int)(v1 - v0.aj * v3)), v0.ae, ((int)(v1 - v0.ar * v9)), ((int)(v16 - v1)));
            }

            v0.aj = 0x3234C17620BA8CBL;
            v0.ad = 0;
        }
    }

    public void az(byte[] arg25, int arg26, int arg27) throws IOException {
        long v5_1;
        int v6_1;
        int v5;
        op v1 = this;
        byte[] v0 = arg25;
        int v2 = arg26;
        int v3 = arg27;
        int v4 = v2 + v3;
        try {
            if(v4 > v0.length) {
                goto label_295;
            }

            long v6 = -6925496564762115299L;
            long v12 = 7356304704283988859L;
            if(v1.aj * v6 != -1 && v1.aq * v12 >= v1.aj * v6) {
                long v4_1 = ((long)v3);
                if(v1.aq * v12 + v4_1 <= (((long)(v1.ad * 0x81BE0EE7))) + v1.aj * v6) {
                    System.arraycopy(v1.ap, ((int)(v1.aq * v12 - v1.aj * v6)), v0, v2, v3);
                    v1.aq += v4_1 * -4279291253637180493L;
                    return;
                }
            }

            long v8 = v1.aq * v12;
            long v14 = -2478930107747782719L;
            int v16 = 0xE0CB1565;
            if(v1.aq * v12 < v1.ar * v14 || v1.aq * v12 >= v1.ar * v14 + (((long)(v1.an * v16)))) {
                v5 = v2;
                v4 = v3;
            }
            else {
                v4 = ((int)((((long)(v1.an * 0xE63A7CD2))) - (v1.aq * v12 - v1.ar * v14)));
                if(v4 > v3) {
                    v4 = v3;
                }

                System.arraycopy(v1.ae, ((int)(v1.aq * v12 - v1.ar * v14)), v0, v2, v4);
                v1.aq += (((long)v4)) * -4279291253637180493L;
                v5 = v2 + v4;
                v4 = v3 - v4;
            }

            if(v4 > v1.ae.length) {
                v1.al.ax(v1.aq * v12);
                v1.ai = v1.aq * -2225316316219759543L;
                while(v4 > 0) {
                    v6_1 = v1.al.ap(v0, v5, v4, 1166006047);
                    if(-1 == v6_1) {
                    }
                    else {
                        v14 = ((long)v6_1);
                        v1.ai += 0x5B951920560CCA0BL * v14;
                        v1.aq += v14 * -4279291253637180493L;
                        v5 += v6_1;
                        v4 -= v6_1;
                        continue;
                    }

                    break;
                }
            }
            else if(v4 > 0) {
                v1.ap(0x8B461166);
                v6_1 = v4 > v1.an * -1401187004 ? v1.an * v16 : v4;
                System.arraycopy(v1.ae, 0, v0, v5, v6_1);
                v5 += v6_1;
                v4 -= v6_1;
                v1.aq += (((long)v6_1)) * -4279291253637180493L;
            }

            v14 = -6925496564762115299L;
            if(-1 != v1.aj * v14) {
                long v22 = v8;
                if(v1.aj * v14 > v1.aq * v12 && v4 > 0) {
                    v6_1 = (((int)(v1.aj * v14 - v1.aq * v12))) + v5;
                    int v7 = v4 + v5;
                    if(v6_1 > v7) {
                        v6_1 = v7;
                    }

                    while(v5 < v6_1) {
                        v0[v5] = 0;
                        --v4;
                        v1.aq += -4279291253637180493L;
                        ++v5;
                    }
                }

                long v7_1 = -6925496564762115299L;
                if(v1.aj * v7_1 < v22 || v1.aj * v7_1 >= v22 + (((long)v3))) {
                    if(v22 >= v1.aj * v7_1 && v22 < v1.aj * v7_1 + (((long)(v1.ad * 0x670917DE)))) {
                        v5_1 = v22;
                        goto label_216;
                    }

                    v5_1 = -1;
                }
                else {
                    v5_1 = v1.aj * v7_1;
                }

            label_216:
                v14 = -6925496564762115299L;
                if((((long)(v1.ad * 0xD9782FF6))) + v1.aj * v14 <= v22 || v1.aj * v14 + (((long)(v1.ad * 0xCA72D011))) > v22 + (((long)v3))) {
                    v8 = (((long)v3)) + v22;
                    v14 = -6925496564762115299L;
                    if(v8 > v1.aj * v14 && v8 <= v1.aj * v14 + (((long)(v1.ad * 1040207553)))) {
                        goto label_261;
                    }

                    v8 = -1;
                }
                else {
                    v8 = v1.aj * -6925496564762115299L + (((long)(v1.ad * -10011105)));
                }

            label_261:
                if(v5_1 <= -1) {
                    goto label_290;
                }

                if(v8 <= v5_1) {
                    goto label_290;
                }

                System.arraycopy(v1.ap, ((int)(v5_1 - v1.aj * -6925496564762115299L)), v0, v2 + (((int)(v5_1 - v22))), ((int)(v8 - v5_1)));
                if(v8 <= v1.aq * v12) {
                    goto label_290;
                }

                v4 = ((int)((((long)v4)) - (v8 - v1.aq * v12)));
                v1.aq = v8 * -4279291253637180493L;
            }
        }
        catch(IOException v0_1) {
            goto label_302;
        }

    label_290:
        if(v4 <= 0) {
            return;
        }

        throw new EOFException();
        try {
        label_295:
            throw new ArrayIndexOutOfBoundsException(v4 - v0.length);
        }
        catch(IOException v0_1) {
        label_302:
            v1.ai = -6599208455654656523L;
            throw v0_1;
        }
    }
}

