import java.io.EOFException;
import java.io.IOException;

public final class mr {
    op ae;
    op al;
    int an;
    int ar;
    static byte[] ax;

    static {
        mr.ax = new byte[520];
    }

    public mr(int arg2, op arg3, op arg4, int arg5) {
        try {
            super();
            this.al = null;
            this.ae = null;
            this.an = 0x17BF7CE8;
            this.ar = arg2 * 0xF20C25FD;
            this.al = arg3;
            this.ae = arg4;
            this.an = arg5 * 1310301537;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("mr.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean ab(int arg25, byte[] arg26, int arg27, boolean arg28) {
        int v15;
        int v9;
        int v8;
        int v6;
        int v5;
        boolean v14;
        int v11;
        mr v1 = this;
        int v0 = arg25;
        byte[] v2 = arg26;
        int v3 = arg27;
        op v4 = v1.al;
        __monitor_enter(v4);
        int v7 = 5;
        int v10 = 6;
        int v12 = 8;
        if(arg28) {
            try {
                v11 = v0 * 6;
                if(v1.ae.ae(-2022408675) < (((long)(v11 + 6)))) {
                }
                else {
                    goto label_20;
                }
            }
            catch(IOException ) {
                goto label_389;
            }

            __monitor_exit(v4);
            return 0;
            try {
            label_20:
                v1.ae.al(((long)v11));
                v1.ae.an(mr.ax, 0, v10, 0x20E93113);
                v11 = (mr.ax[v7] & 0xFF) + (((mr.ax[4] & 0xFF) << v12) + ((mr.ax[3] & 0xFF) << 16));
                if(v11 > 0) {
                    if((((long)v11)) > v1.al.ae(0xB51886D0) / 520) {
                        goto label_50;
                    }

                    goto label_64;
                }
            }
            catch(IOException ) {
                goto label_389;
            }

        label_50:
            __monitor_exit(v4);
            return 0;
        }
        else {
            try {
                v11 = ((int)((v1.al.ae(0x89DB2D13) + 0x207) / 520));
                if(v11 == 0) {
                    v11 = 1;
                }

            label_64:
                mr.ax[0] = ((byte)(v3 >> 16));
                mr.ax[1] = ((byte)(v3 >> 8));
                mr.ax[2] = ((byte)v3);
                mr.ax[3] = ((byte)(v11 >> 16));
                mr.ax[4] = ((byte)(v11 >> 8));
                mr.ax[v7] = ((byte)v11);
                v1.ae.al(((long)(v0 * 6)));
                v1.ae.aj(mr.ax, 0, v10, 0xB984CE18);
                v14 = arg28;
                v5 = 0;
                v6 = 0;
                while(true) {
                label_101:
                    if(v5 >= v3) {
                        goto label_386;
                    }

                    if(v14) {
                        v1.al.al((((long)v11)) * 520);
                        if(v0 > 0xFFFF) {
                            try {
                                v1.al.an(mr.ax, 0, 10, 0xA6BB9B4C);
                            }
                            catch(EOFException ) {
                                goto label_386;
                            }

                            v7 = (mr.ax[3] & 0xFF) + (((mr.ax[2] & 0xFF) << v12) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            v8 = ((mr.ax[4] & 0xFF) << v12) + (mr.ax[5] & 0xFF);
                            v9 = (mr.ax[v12] & 0xFF) + (((mr.ax[7] & 0xFF) << v12) + ((mr.ax[v10] & 0xFF) << 16));
                            v12 = mr.ax[9] & 0xFF;
                        }
                        else {
                            try {
                                v1.al.an(mr.ax, 0, 8, 620523700);
                            }
                            catch(EOFException ) {
                                goto label_386;
                            }

                            v7 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v8 = (mr.ax[3] & 0xFF) + ((mr.ax[2] & 0xFF) << 8);
                            v9 = ((mr.ax[4] & 0xFF) << 16) + ((mr.ax[5] & 0xFF) << 8) + (mr.ax[v10] & 0xFF);
                            v12 = mr.ax[7] & 0xFF;
                        }

                        if(v0 == v7 && v6 == v8) {
                            if(v12 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v9 >= 0) {
                                    if((((long)v9)) > v1.al.ae(0xAB5E0189) / 520) {
                                        goto label_226;
                                    }

                                    goto label_231;
                                }

                                goto label_226;
                            }
                        }

                        goto label_228;
                    }
                    else {
                        goto label_230;
                    }
                }
            }
            catch(IOException ) {
                goto label_389;
            }
        }

        goto label_64;
    label_226:
        __monitor_exit(v4);
        return 0;
    label_228:
        __monitor_exit(v4);
        return 0;
    label_230:
        v9 = 0;
    label_231:
        if(v9 == 0) {
            try {
                v7 = ((int)((v1.al.ae(0xB6B8981B) + 0x207) / 520));
                if(v7 == 0) {
                    ++v7;
                }

                if(v7 == v11) {
                    ++v7;
                }

                v14 = false;
                goto label_247;
            label_246:
                v7 = v9;
            label_247:
                if(v0 > 0xFFFF) {
                    v8 = v3 - v5;
                    v9 = 510;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 24));
                    mr.ax[1] = ((byte)(v0 >> 16));
                    mr.ax[2] = ((byte)(v0 >> 8));
                    mr.ax[3] = ((byte)v0);
                    mr.ax[4] = ((byte)(v6 >> 8));
                    mr.ax[5] = ((byte)v6);
                    mr.ax[v10] = ((byte)(v7 >> 16));
                    mr.ax[7] = ((byte)(v7 >> 8));
                    mr.ax[8] = ((byte)v7);
                    mr.ax[9] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, 10, v15);
                    if(v8 > v9) {
                        v8 = 510;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                    v12 = 8;
                }
                else {
                    v8 = v3 - v5;
                    v9 = 0x200;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 8));
                    mr.ax[1] = ((byte)v0);
                    mr.ax[2] = ((byte)(v6 >> 8));
                    mr.ax[3] = ((byte)v6);
                    mr.ax[4] = ((byte)(v7 >> 16));
                    mr.ax[5] = ((byte)(v7 >> 8));
                    mr.ax[6] = ((byte)v7);
                    mr.ax[7] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v12 = 8;
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, v12, v15);
                    if(v8 > v9) {
                        v8 = 0x200;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                }

                goto label_382;
            }
            catch(Throwable v0_1) {
                goto label_53;
            }
            catch(IOException ) {
                goto label_389;
            }
        }
        else {
            goto label_246;
        }

        goto label_247;
    label_382:
        ++v6;
        v10 = 6;
        goto label_101;
        try {
        label_386:
            __monitor_exit(v4);
            return 1;
        label_389:
            __monitor_exit(v4);
            return 0;
        }
        catch(Throwable v0_1) {
        label_53:
            try {
                __monitor_exit(v4);
            }
            catch(Throwable v0_1) {
                goto label_53;
            }

            throw v0_1;
        }
    }

    public boolean ad(int arg9, byte[] arg10, int arg11) {
        op v0 = this.al;
        __monitor_enter(v0);
        if(arg11 >= 0) {
            try {
                if(arg11 <= this.an * 0xAF0BC6A1) {
                    boolean v1 = this.ae(arg9, arg10, arg11, true, 0x565A827D);
                    if(!v1) {
                        v1 = this.ae(arg9, arg10, arg11, false, 0x565A827D);
                    }

                    __monitor_exit(v0);
                    return v1;
                }

            label_26:
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("");
                v1_1.append(this.ar * 0x6660DF55);
                v1_1.append(',');
                v1_1.append(arg9);
                v1_1.append(',');
                v1_1.append(arg11);
                throw new IllegalArgumentException(v1_1.toString());
            label_43:
                __monitor_exit(v0);
                goto label_44;
            }
            catch(Throwable v9) {
                goto label_43;
            }
        }

        goto label_26;
    label_44:
        throw v9;
    }

    boolean ae(int arg25, byte[] arg26, int arg27, boolean arg28, int arg29) {
        int v15;
        int v9;
        int v8;
        int v6;
        int v5;
        boolean v14;
        int v11;
        int v12;
        int v10;
        int v7;
        op v4;
        mr v1 = this;
        int v0 = arg25;
        byte[] v2 = arg26;
        int v3 = arg27;
        try {
            v4 = v1.al;
            __monitor_enter(v4);
            v7 = 5;
            v10 = 6;
            v12 = 8;
            if(arg28) {
            }
            else {
                goto label_54;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_395;
        }

        try {
            v11 = v0 * 6;
            if(v1.ae.ae(0x2FD27E) < (((long)(v11 + 6)))) {
            }
            else {
                goto label_20;
            }
        }
        catch(IOException ) {
            goto label_389;
        }

        __monitor_exit(v4);
        return 0;
        try {
        label_20:
            v1.ae.al(((long)v11));
            v1.ae.an(mr.ax, 0, v10, 0xBE2003DB);
            v11 = (mr.ax[v7] & 0xFF) + (((mr.ax[4] & 0xFF) << v12) + ((mr.ax[3] & 0xFF) << 16));
            if(v11 > 0) {
                if((((long)v11)) > v1.al.ae(463280062) / 520) {
                    goto label_50;
                }

                goto label_64;
            }
        }
        catch(IOException ) {
            goto label_389;
        }

    label_50:
        __monitor_exit(v4);
        return 0;
        try {
        label_54:
            v11 = ((int)((v1.al.ae(0xACCE7778) + 0x207) / 520));
            if(v11 == 0) {
                v11 = 1;
            }

        label_64:
            mr.ax[0] = ((byte)(v3 >> 16));
            mr.ax[1] = ((byte)(v3 >> 8));
            mr.ax[2] = ((byte)v3);
            mr.ax[3] = ((byte)(v11 >> 16));
            mr.ax[4] = ((byte)(v11 >> 8));
            mr.ax[v7] = ((byte)v11);
            v1.ae.al(((long)(v0 * 6)));
            v1.ae.aj(mr.ax, 0, v10, 0xB984CE18);
            v14 = arg28;
            v5 = 0;
            v6 = 0;
            while(true) {
            label_101:
                if(v5 >= v3) {
                    goto label_386;
                }

                if(v14) {
                    v1.al.al((((long)v11)) * 520);
                    if(v0 > 0xFFFF) {
                        try {
                            v1.al.an(mr.ax, 0, 10, 1924645406);
                        }
                        catch(EOFException ) {
                            goto label_386;
                        }

                        v7 = (mr.ax[3] & 0xFF) + (((mr.ax[2] & 0xFF) << v12) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                        v8 = ((mr.ax[4] & 0xFF) << v12) + (mr.ax[5] & 0xFF);
                        v9 = (mr.ax[v12] & 0xFF) + (((mr.ax[7] & 0xFF) << v12) + ((mr.ax[v10] & 0xFF) << 16));
                        v12 = mr.ax[9] & 0xFF;
                    }
                    else {
                        try {
                            v1.al.an(mr.ax, 0, 8, 0x1725BF84);
                        }
                        catch(EOFException ) {
                            goto label_386;
                        }

                        v7 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                        v8 = (mr.ax[3] & 0xFF) + ((mr.ax[2] & 0xFF) << 8);
                        v9 = ((mr.ax[4] & 0xFF) << 16) + ((mr.ax[5] & 0xFF) << 8) + (mr.ax[v10] & 0xFF);
                        v12 = mr.ax[7] & 0xFF;
                    }

                    if(v0 == v7 && v6 == v8) {
                        if(v12 != v1.ar * 0x6660DF55) {
                        }
                        else {
                            if(v9 >= 0) {
                                if((((long)v9)) > v1.al.ae(-1290194083) / 520) {
                                    break;
                                }

                                goto label_231;
                            }

                            break;
                        }
                    }

                    goto label_228;
                }
                else {
                    goto label_230;
                }
            }
        }
        catch(IOException ) {
            goto label_389;
        }

        __monitor_exit(v4);
        return 0;
    label_228:
        __monitor_exit(v4);
        return 0;
    label_230:
        v9 = 0;
    label_231:
        if(v9 == 0) {
            try {
                v7 = ((int)((v1.al.ae(0x1BA606FD) + 0x207) / 520));
                if(v7 == 0) {
                    ++v7;
                }

                if(v7 == v11) {
                    ++v7;
                }

                v14 = false;
                goto label_247;
            label_246:
                v7 = v9;
            label_247:
                if(v0 > 0xFFFF) {
                    v8 = v3 - v5;
                    v9 = 510;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 24));
                    mr.ax[1] = ((byte)(v0 >> 16));
                    mr.ax[2] = ((byte)(v0 >> 8));
                    mr.ax[3] = ((byte)v0);
                    mr.ax[4] = ((byte)(v6 >> 8));
                    mr.ax[5] = ((byte)v6);
                    mr.ax[v10] = ((byte)(v7 >> 16));
                    mr.ax[7] = ((byte)(v7 >> 8));
                    mr.ax[8] = ((byte)v7);
                    mr.ax[9] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, 10, v15);
                    if(v8 > v9) {
                        v8 = 510;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                    v12 = 8;
                }
                else {
                    v8 = v3 - v5;
                    v9 = 0x200;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 8));
                    mr.ax[1] = ((byte)v0);
                    mr.ax[2] = ((byte)(v6 >> 8));
                    mr.ax[3] = ((byte)v6);
                    mr.ax[4] = ((byte)(v7 >> 16));
                    mr.ax[5] = ((byte)(v7 >> 8));
                    mr.ax[6] = ((byte)v7);
                    mr.ax[7] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v12 = 8;
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, v12, v15);
                    if(v8 > v9) {
                        v8 = 0x200;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                }

                goto label_382;
            }
            catch(Throwable v0_2) {
                goto label_53;
            }
            catch(IOException ) {
                goto label_389;
            }
        }
        else {
            goto label_246;
        }

        goto label_247;
    label_382:
        ++v6;
        v10 = 6;
        goto label_101;
        try {
        label_386:
            __monitor_exit(v4);
            return 1;
        label_389:
            __monitor_exit(v4);
            return 0;
        }
        catch(Throwable v0_2) {
        label_53:
            try {
                __monitor_exit(v4);
            }
            catch(Throwable v0_2) {
                goto label_53;
            }

            try {
                throw v0_2;
            }
            catch(RuntimeException v0_1) {
            label_395:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("mr.ae(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_1), v2_1.toString());
            }
        }
    }

    boolean af(int arg25, byte[] arg26, int arg27, boolean arg28) {
        int v15;
        int v9;
        int v8;
        int v6;
        int v5;
        boolean v14;
        int v11;
        mr v1 = this;
        int v0 = arg25;
        byte[] v2 = arg26;
        int v3 = arg27;
        op v4 = v1.al;
        __monitor_enter(v4);
        int v7 = 5;
        int v10 = 6;
        int v12 = 8;
        if(arg28) {
            try {
                v11 = v0 * 6;
                if(v1.ae.ae(0x959D12BB) < (((long)(v11 + 6)))) {
                }
                else {
                    goto label_20;
                }
            }
            catch(IOException ) {
                goto label_389;
            }

            __monitor_exit(v4);
            return 0;
            try {
            label_20:
                v1.ae.al(((long)v11));
                v1.ae.an(mr.ax, 0, v10, -1639456002);
                v11 = (mr.ax[v7] & 0xFF) + (((mr.ax[4] & 0xFF) << v12) + ((mr.ax[3] & 0xFF) << 16));
                if(v11 > 0) {
                    if((((long)v11)) > v1.al.ae(-975031407) / 520) {
                        goto label_50;
                    }

                    goto label_64;
                }
            }
            catch(IOException ) {
                goto label_389;
            }

        label_50:
            __monitor_exit(v4);
            return 0;
        }
        else {
            try {
                v11 = ((int)((v1.al.ae(-1750408047) + 0x207) / 520));
                if(v11 == 0) {
                    v11 = 1;
                }

            label_64:
                mr.ax[0] = ((byte)(v3 >> 16));
                mr.ax[1] = ((byte)(v3 >> 8));
                mr.ax[2] = ((byte)v3);
                mr.ax[3] = ((byte)(v11 >> 16));
                mr.ax[4] = ((byte)(v11 >> 8));
                mr.ax[v7] = ((byte)v11);
                v1.ae.al(((long)(v0 * 6)));
                v1.ae.aj(mr.ax, 0, v10, 0xB984CE18);
                v14 = arg28;
                v5 = 0;
                v6 = 0;
                while(true) {
                label_101:
                    if(v5 >= v3) {
                        goto label_386;
                    }

                    if(v14) {
                        v1.al.al((((long)v11)) * 520);
                        if(v0 > 0xFFFF) {
                            try {
                                v1.al.an(mr.ax, 0, 10, 703013866);
                            }
                            catch(EOFException ) {
                                goto label_386;
                            }

                            v7 = (mr.ax[3] & 0xFF) + (((mr.ax[2] & 0xFF) << v12) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            v8 = ((mr.ax[4] & 0xFF) << v12) + (mr.ax[5] & 0xFF);
                            v9 = (mr.ax[v12] & 0xFF) + (((mr.ax[7] & 0xFF) << v12) + ((mr.ax[v10] & 0xFF) << 16));
                            v12 = mr.ax[9] & 0xFF;
                        }
                        else {
                            try {
                                v1.al.an(mr.ax, 0, 8, 0x7EBEC38B);
                            }
                            catch(EOFException ) {
                                goto label_386;
                            }

                            v7 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v8 = (mr.ax[3] & 0xFF) + ((mr.ax[2] & 0xFF) << 8);
                            v9 = ((mr.ax[4] & 0xFF) << 16) + ((mr.ax[5] & 0xFF) << 8) + (mr.ax[v10] & 0xFF);
                            v12 = mr.ax[7] & 0xFF;
                        }

                        if(v0 == v7 && v6 == v8) {
                            if(v12 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v9 >= 0) {
                                    if((((long)v9)) > v1.al.ae(0xC8016D30) / 520) {
                                        goto label_226;
                                    }

                                    goto label_231;
                                }

                                goto label_226;
                            }
                        }

                        goto label_228;
                    }
                    else {
                        goto label_230;
                    }
                }
            }
            catch(IOException ) {
                goto label_389;
            }
        }

        goto label_64;
    label_226:
        __monitor_exit(v4);
        return 0;
    label_228:
        __monitor_exit(v4);
        return 0;
    label_230:
        v9 = 0;
    label_231:
        if(v9 == 0) {
            try {
                v7 = ((int)((v1.al.ae(0x213576B7) + 0x207) / 520));
                if(v7 == 0) {
                    ++v7;
                }

                if(v7 == v11) {
                    ++v7;
                }

                v14 = false;
                goto label_247;
            label_246:
                v7 = v9;
            label_247:
                if(v0 > 0xFFFF) {
                    v8 = v3 - v5;
                    v9 = 510;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 24));
                    mr.ax[1] = ((byte)(v0 >> 16));
                    mr.ax[2] = ((byte)(v0 >> 8));
                    mr.ax[3] = ((byte)v0);
                    mr.ax[4] = ((byte)(v6 >> 8));
                    mr.ax[5] = ((byte)v6);
                    mr.ax[v10] = ((byte)(v7 >> 16));
                    mr.ax[7] = ((byte)(v7 >> 8));
                    mr.ax[8] = ((byte)v7);
                    mr.ax[9] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, 10, v15);
                    if(v8 > v9) {
                        v8 = 510;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                    v12 = 8;
                }
                else {
                    v8 = v3 - v5;
                    v9 = 0x200;
                    if(v8 <= v9) {
                        v7 = 0;
                    }

                    mr.ax[0] = ((byte)(v0 >> 8));
                    mr.ax[1] = ((byte)v0);
                    mr.ax[2] = ((byte)(v6 >> 8));
                    mr.ax[3] = ((byte)v6);
                    mr.ax[4] = ((byte)(v7 >> 16));
                    mr.ax[5] = ((byte)(v7 >> 8));
                    mr.ax[6] = ((byte)v7);
                    mr.ax[7] = ((byte)(v1.ar * 0x6660DF55));
                    v1.al.al((((long)v11)) * 520);
                    v12 = 8;
                    v15 = 0xB984CE18;
                    v1.al.aj(mr.ax, 0, v12, v15);
                    if(v8 > v9) {
                        v8 = 0x200;
                    }

                    v1.al.aj(v2, v5, v8, v15);
                    v5 += v8;
                    v11 = v7;
                }

                goto label_382;
            }
            catch(Throwable v0_1) {
                goto label_53;
            }
            catch(IOException ) {
                goto label_389;
            }
        }
        else {
            goto label_246;
        }

        goto label_247;
    label_382:
        ++v6;
        v10 = 6;
        goto label_101;
        try {
        label_386:
            __monitor_exit(v4);
            return 1;
        label_389:
            __monitor_exit(v4);
            return 0;
        }
        catch(Throwable v0_1) {
        label_53:
            try {
                __monitor_exit(v4);
            }
            catch(Throwable v0_1) {
                goto label_53;
            }

            throw v0_1;
        }
    }

    public byte[] aj(int arg27) {
        int v24;
        int v14;
        int v3_1;
        int v12;
        int v11;
        byte[] v7;
        long v20;
        int v15;
        int v13;
        int v4;
        int v5;
        int v6;
        mr v1 = this;
        int v0 = arg27;
        op v2 = v1.al;
        __monitor_enter(v2);
        byte[] v3 = null;
        try {
            v6 = v0 * 6;
            if(v1.ae.ae(0x2F32B901) >= (((long)(v6 + 6)))) {
                goto label_14;
            }
        }
        catch(IOException ) {
            goto label_252;
        }

        __monitor_exit(v2);
        return v3;
        try {
        label_14:
            v1.ae.al(((long)v6));
            v1.ae.an(mr.ax, 0, 6, -300306442);
            v5 = 2;
            v4 = (mr.ax[v5] & 0xFF) + (((mr.ax[1] & 0xFF) << 8) + ((mr.ax[0] & 0xFF) << 16));
            v13 = 3;
            v15 = 4;
            v6 = (mr.ax[5] & 0xFF) + (((mr.ax[v13] & 0xFF) << 16) + ((mr.ax[v15] & 0xFF) << 8));
            if(v4 >= 0) {
                if(v4 > v1.an * 0xAF0BC6A1) {
                }
                else {
                    if(v6 > 0) {
                        v20 = 520;
                        if((((long)v6)) > v1.al.ae(0xD4B48E99) / v20) {
                        }
                        else {
                            v7 = new byte[v4];
                            v11 = v6;
                            v6 = 0;
                            v12 = 0;
                            goto label_74;
                        }
                    }

                    goto label_244;
                }
            }

            goto label_247;
        }
        catch(IOException ) {
            goto label_252;
        }

        while(true) {
        label_74:
            if(v6 >= v4) {
                goto label_242;
            }
            else if(v11 == 0) {
                try {
                    __monitor_exit(v2);
                    return v3;
                    try {
                    label_78:
                        v1.al.al((((long)v11)) * v20);
                        int v9 = v4 - v6;
                        if(v0 > 0xFFFF) {
                            if(v9 > 510) {
                                v9 = 510;
                            }

                            v1.al.an(mr.ax, 0, v9 + 10, 0x8A4EFBEB);
                            v3_1 = (mr.ax[v13] & 0xFF) + (((mr.ax[v5] & 0xFF) << 8) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            int v10 = (mr.ax[5] & 0xFF) + ((mr.ax[v15] & 0xFF) << 8);
                            v11 = (mr.ax[8] & 0xFF) + (((mr.ax[6] & 0xFF) << 16) + ((mr.ax[7] & 0xFF) << 8));
                            v14 = mr.ax[9] & 0xFF;
                            v5 = v11;
                            v24 = 10;
                            v11 = v10;
                        }
                        else {
                            if(v9 > 0x200) {
                                v9 = 0x200;
                            }

                            v1.al.an(mr.ax, 0, v9 + 8, 0x507FB752);
                            v3_1 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v11 = ((mr.ax[v5] & 0xFF) << 8) + (mr.ax[v13] & 0xFF);
                            v24 = 8;
                            int v25 = ((mr.ax[5] & 0xFF) << 8) + ((mr.ax[4] & 0xFF) << 16) + (mr.ax[6] & 0xFF);
                            v14 = mr.ax[7] & 0xFF;
                            v5 = v25;
                        }

                        if(v3_1 == v0 && v12 == v11) {
                            if(v14 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v5 >= 0) {
                                    if((((long)v5)) > v1.al.ae(530037805) / v20) {
                                    }
                                    else {
                                        v9 += v24;
                                        v3_1 = v24;
                                        while(true) {
                                            if(v3_1 < v9) {
                                                v7[v6] = mr.ax[v3_1];
                                                ++v3_1;
                                                ++v6;
                                                continue;
                                            }
                                            else {
                                                goto label_228;
                                            }
                                        }
                                    }
                                }

                                break;
                            }
                        }

                        goto label_239;
                    }
                    catch(IOException ) {
                        goto label_252;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_255;
                }
            }
            else {
                goto label_78;
            label_228:
                ++v12;
                v11 = v5;
                v3 = null;
                v5 = 2;
                v15 = 4;
                continue;
            }

            goto label_244;
        }

        try {
            __monitor_exit(v2);
            return null;
        label_239:
            __monitor_exit(v2);
            return null;
        label_242:
            __monitor_exit(v2);
            return v7;
        label_252:
            __monitor_exit(v2);
            return null;
        label_244:
            __monitor_exit(v2);
            return null;
        label_247:
            __monitor_exit(v2);
            return v3;
        label_255:
            __monitor_exit(v2);
        }
        catch(Throwable v0_1) {
            goto label_255;
        }

        throw v0_1;
    }

    public boolean al(int arg8, byte[] arg9, int arg10, byte arg11) {
        op v11;
        try {
            v11 = this.al;
            __monitor_enter(v11);
            if(arg10 >= 0) {
                goto label_3;
            }

            goto label_26;
        }
        catch(RuntimeException v8) {
            goto label_47;
        }

        try {
        label_3:
            if(arg10 <= this.an * 0xAF0BC6A1) {
                boolean v0 = this.ae(arg8, arg9, arg10, true, 0x565A827D);
                if(!v0) {
                    v0 = this.ae(arg8, arg9, arg10, false, 0x565A827D);
                }

                __monitor_exit(v11);
                return v0;
            }

        label_26:
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("");
            v0_1.append(this.ar * 0x6660DF55);
            v0_1.append(',');
            v0_1.append(arg8);
            v0_1.append(',');
            v0_1.append(arg10);
            throw new IllegalArgumentException(v0_1.toString());
        label_43:
            __monitor_exit(v11);
        }
        catch(Throwable v8_1) {
            goto label_43;
        }

        try {
            throw v8_1;
        }
        catch(RuntimeException v8) {
        label_47:
            StringBuilder v9 = new StringBuilder();
            v9.append("mr.al(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    public byte[] an(int arg27) {
        int v24;
        int v14;
        int v3_1;
        int v12;
        int v11;
        byte[] v7;
        long v20;
        int v15;
        int v13;
        int v4;
        int v5;
        int v6;
        mr v1 = this;
        int v0 = arg27;
        op v2 = v1.al;
        __monitor_enter(v2);
        byte[] v3 = null;
        try {
            v6 = v0 * 6;
            if(v1.ae.ae(0xCEF3D90C) >= (((long)(v6 + 6)))) {
                goto label_14;
            }
        }
        catch(IOException ) {
            goto label_252;
        }

        __monitor_exit(v2);
        return v3;
        try {
        label_14:
            v1.ae.al(((long)v6));
            v1.ae.an(mr.ax, 0, 6, 0xDDBE5E4D);
            v5 = 2;
            v4 = (mr.ax[v5] & 0xFF) + (((mr.ax[1] & 0xFF) << 8) + ((mr.ax[0] & 0xFF) << 16));
            v13 = 3;
            v15 = 4;
            v6 = (mr.ax[5] & 0xFF) + (((mr.ax[v13] & 0xFF) << 16) + ((mr.ax[v15] & 0xFF) << 8));
            if(v4 >= 0) {
                if(v4 > v1.an * 0xAF0BC6A1) {
                }
                else {
                    if(v6 > 0) {
                        v20 = 520;
                        if((((long)v6)) > v1.al.ae(0xDA9D5162) / v20) {
                        }
                        else {
                            v7 = new byte[v4];
                            v11 = v6;
                            v6 = 0;
                            v12 = 0;
                            goto label_74;
                        }
                    }

                    goto label_244;
                }
            }

            goto label_247;
        }
        catch(IOException ) {
            goto label_252;
        }

        while(true) {
        label_74:
            if(v6 >= v4) {
                goto label_242;
            }
            else if(v11 == 0) {
                try {
                    __monitor_exit(v2);
                    return v3;
                    try {
                    label_78:
                        v1.al.al((((long)v11)) * v20);
                        int v9 = v4 - v6;
                        if(v0 > 0xFFFF) {
                            if(v9 > 510) {
                                v9 = 510;
                            }

                            v1.al.an(mr.ax, 0, v9 + 10, 0x1D5B683E);
                            v3_1 = (mr.ax[v13] & 0xFF) + (((mr.ax[v5] & 0xFF) << 8) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            int v10 = (mr.ax[5] & 0xFF) + ((mr.ax[v15] & 0xFF) << 8);
                            v11 = (mr.ax[8] & 0xFF) + (((mr.ax[6] & 0xFF) << 16) + ((mr.ax[7] & 0xFF) << 8));
                            v14 = mr.ax[9] & 0xFF;
                            v5 = v11;
                            v24 = 10;
                            v11 = v10;
                        }
                        else {
                            if(v9 > 0x200) {
                                v9 = 0x200;
                            }

                            v1.al.an(mr.ax, 0, v9 + 8, 0x958C127E);
                            v3_1 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v11 = ((mr.ax[v5] & 0xFF) << 8) + (mr.ax[v13] & 0xFF);
                            v24 = 8;
                            int v25 = ((mr.ax[5] & 0xFF) << 8) + ((mr.ax[4] & 0xFF) << 16) + (mr.ax[6] & 0xFF);
                            v14 = mr.ax[7] & 0xFF;
                            v5 = v25;
                        }

                        if(v3_1 == v0 && v12 == v11) {
                            if(v14 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v5 >= 0) {
                                    if((((long)v5)) > v1.al.ae(156690334) / v20) {
                                    }
                                    else {
                                        v9 += v24;
                                        v3_1 = v24;
                                        while(true) {
                                            if(v3_1 < v9) {
                                                v7[v6] = mr.ax[v3_1];
                                                ++v3_1;
                                                ++v6;
                                                continue;
                                            }
                                            else {
                                                goto label_228;
                                            }
                                        }
                                    }
                                }

                                break;
                            }
                        }

                        goto label_239;
                    }
                    catch(IOException ) {
                        goto label_252;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_255;
                }
            }
            else {
                goto label_78;
            label_228:
                ++v12;
                v11 = v5;
                v3 = null;
                v5 = 2;
                v15 = 4;
                continue;
            }

            goto label_244;
        }

        try {
            __monitor_exit(v2);
            return null;
        label_239:
            __monitor_exit(v2);
            return null;
        label_242:
            __monitor_exit(v2);
            return v7;
        label_252:
            __monitor_exit(v2);
            return null;
        label_244:
            __monitor_exit(v2);
            return null;
        label_247:
            __monitor_exit(v2);
            return v3;
        label_255:
            __monitor_exit(v2);
        }
        catch(Throwable v0_1) {
            goto label_255;
        }

        throw v0_1;
    }

    public byte[] ap(int arg27) {
        int v24;
        int v14;
        int v3_1;
        int v12;
        int v11;
        byte[] v7;
        long v20;
        int v15;
        int v13;
        int v4;
        int v5;
        int v6;
        mr v1 = this;
        int v0 = arg27;
        op v2 = v1.al;
        __monitor_enter(v2);
        byte[] v3 = null;
        try {
            v6 = v0 * 6;
            if(v1.ae.ae(-1411560887) >= (((long)(v6 + 6)))) {
                goto label_14;
            }
        }
        catch(IOException ) {
            goto label_252;
        }

        __monitor_exit(v2);
        return v3;
        try {
        label_14:
            v1.ae.al(((long)v6));
            v1.ae.an(mr.ax, 0, 6, -384454230);
            v5 = 2;
            v4 = (mr.ax[v5] & 0xFF) + (((mr.ax[1] & 0xFF) << 8) + ((mr.ax[0] & 0xFF) << 16));
            v13 = 3;
            v15 = 4;
            v6 = (mr.ax[5] & 0xFF) + (((mr.ax[v13] & 0xFF) << 16) + ((mr.ax[v15] & 0xFF) << 8));
            if(v4 >= 0) {
                if(v4 > v1.an * 0xAF0BC6A1) {
                }
                else {
                    if(v6 > 0) {
                        v20 = 520;
                        if((((long)v6)) > v1.al.ae(0x86B7F359) / v20) {
                        }
                        else {
                            v7 = new byte[v4];
                            v11 = v6;
                            v6 = 0;
                            v12 = 0;
                            goto label_74;
                        }
                    }

                    goto label_244;
                }
            }

            goto label_247;
        }
        catch(IOException ) {
            goto label_252;
        }

        while(true) {
        label_74:
            if(v6 >= v4) {
                goto label_242;
            }
            else if(v11 == 0) {
                try {
                    __monitor_exit(v2);
                    return v3;
                    try {
                    label_78:
                        v1.al.al((((long)v11)) * v20);
                        int v9 = v4 - v6;
                        if(v0 > 0xFFFF) {
                            if(v9 > 510) {
                                v9 = 510;
                            }

                            v1.al.an(mr.ax, 0, v9 + 10, -220738153);
                            v3_1 = (mr.ax[v13] & 0xFF) + (((mr.ax[v5] & 0xFF) << 8) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            int v10 = (mr.ax[5] & 0xFF) + ((mr.ax[v15] & 0xFF) << 8);
                            v11 = (mr.ax[8] & 0xFF) + (((mr.ax[6] & 0xFF) << 16) + ((mr.ax[7] & 0xFF) << 8));
                            v14 = mr.ax[9] & 0xFF;
                            v5 = v11;
                            v24 = 10;
                            v11 = v10;
                        }
                        else {
                            if(v9 > 0x200) {
                                v9 = 0x200;
                            }

                            v1.al.an(mr.ax, 0, v9 + 8, -106480959);
                            v3_1 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v11 = ((mr.ax[v5] & 0xFF) << 8) + (mr.ax[v13] & 0xFF);
                            v24 = 8;
                            int v25 = ((mr.ax[5] & 0xFF) << 8) + ((mr.ax[4] & 0xFF) << 16) + (mr.ax[6] & 0xFF);
                            v14 = mr.ax[7] & 0xFF;
                            v5 = v25;
                        }

                        if(v3_1 == v0 && v12 == v11) {
                            if(v14 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v5 >= 0) {
                                    if((((long)v5)) > v1.al.ae(465474103) / v20) {
                                    }
                                    else {
                                        v9 += v24;
                                        v3_1 = v24;
                                        while(true) {
                                            if(v3_1 < v9) {
                                                v7[v6] = mr.ax[v3_1];
                                                ++v3_1;
                                                ++v6;
                                                continue;
                                            }
                                            else {
                                                goto label_228;
                                            }
                                        }
                                    }
                                }

                                break;
                            }
                        }

                        goto label_239;
                    }
                    catch(IOException ) {
                        goto label_252;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_255;
                }
            }
            else {
                goto label_78;
            label_228:
                ++v12;
                v11 = v5;
                v3 = null;
                v5 = 2;
                v15 = 4;
                continue;
            }

            goto label_244;
        }

        try {
            __monitor_exit(v2);
            return null;
        label_239:
            __monitor_exit(v2);
            return null;
        label_242:
            __monitor_exit(v2);
            return v7;
        label_252:
            __monitor_exit(v2);
            return null;
        label_244:
            __monitor_exit(v2);
            return null;
        label_247:
            __monitor_exit(v2);
            return v3;
        label_255:
            __monitor_exit(v2);
        }
        catch(Throwable v0_1) {
            goto label_255;
        }

        throw v0_1;
    }

    public boolean aq(int arg9, byte[] arg10, int arg11) {
        op v0 = this.al;
        __monitor_enter(v0);
        if(arg11 >= 0) {
            try {
                if(arg11 <= this.an * 0x42A202BB) {
                    boolean v1 = this.ae(arg9, arg10, arg11, true, 0x565A827D);
                    if(!v1) {
                        v1 = this.ae(arg9, arg10, arg11, false, 0x565A827D);
                    }

                    __monitor_exit(v0);
                    return v1;
                }

            label_26:
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("");
                v1_1.append(this.ar * 0x6660DF55);
                v1_1.append('');
                v1_1.append(arg9);
                v1_1.append(',');
                v1_1.append(arg11);
                throw new IllegalArgumentException(v1_1.toString());
            label_44:
                __monitor_exit(v0);
                goto label_45;
            }
            catch(Throwable v9) {
                goto label_44;
            }
        }

        goto label_26;
    label_45:
        throw v9;
    }

    public static boolean ar(int arg7, int arg8) {
        try {
            if(ar.ad[arg7]) {
                return 1;
            }

            if(!ar.aq.aj(arg7, 0xCE956B20)) {
                return 0;
            }

            arg8 = ar.aq.au(arg7, 1799564404);
            if(arg8 == 0) {
                ar.ad[arg7] = true;
                return 1;
            }

            if(ar.aj[arg7] == null) {
                ar.aj[arg7] = new ar[arg8];
            }

            int v2;
            for(v2 = 0; v2 < arg8; ++v2) {
                if(ar.aj[arg7][v2] == null) {
                    byte[] v3 = ar.aq.ae(arg7, v2, 0x78DC0DC9);
                    if(v3 != null) {
                        ar.aj[arg7][v2] = new ar();
                        ar.aj[arg7][v2].ah = ((arg7 << 16) + v2) * 0xE2826D41;
                        if(v3[0] == -1) {
                            ar.aj[arg7][v2].aj(new lq(v3), -1470570228);
                        }
                        else {
                            ar.aj[arg7][v2].ap(new lq(v3), 1671175705);
                        }
                    }
                }
            }

            ar.ad[arg7] = true;
            return 1;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("mr.ar(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public byte[] ar(int arg27) {
        int v24;
        int v14;
        int v3_1;
        int v12;
        int v11;
        byte[] v7;
        long v20;
        int v15;
        int v13;
        int v4;
        int v5;
        int v6;
        mr v1 = this;
        int v0 = arg27;
        op v2 = v1.al;
        __monitor_enter(v2);
        byte[] v3 = null;
        try {
            v6 = v0 * 6;
            if(v1.ae.ae(0x24854525) >= (((long)(v6 + 6)))) {
                goto label_14;
            }
        }
        catch(IOException ) {
            goto label_260;
        }

        __monitor_exit(v2);
        return v3;
        try {
        label_14:
            v1.ae.al(((long)v6));
            v1.ae.an(mr.ax, 0, 6, 0x9F97A0E6);
            v5 = 2;
            v4 = (mr.ax[v5] & 0xFF) + (((mr.ax[1] & 0xEC02836A) << 8) + ((mr.ax[0] & 0xE92E4AD3) << 16));
            v13 = 3;
            v15 = 4;
            v6 = (mr.ax[5] & 0xDD387FC7) + (((mr.ax[v13] & -155949082) << 16) + ((mr.ax[v15] & 0xFF) << 8));
            if(v4 >= 0) {
                if(v4 > v1.an * 0xAF0BC6A1) {
                }
                else {
                    if(v6 > 0) {
                        v20 = 520;
                        if((((long)v6)) > v1.al.ae(-1876808074) / v20) {
                        }
                        else {
                            v7 = new byte[v4];
                            v11 = v6;
                            v6 = 0;
                            v12 = 0;
                            goto label_78;
                        }
                    }

                    goto label_252;
                }
            }

            goto label_255;
        }
        catch(IOException ) {
            goto label_260;
        }

        while(true) {
        label_78:
            if(v6 >= v4) {
                goto label_250;
            }
            else if(v11 == 0) {
                try {
                    __monitor_exit(v2);
                    return v3;
                    try {
                    label_82:
                        v1.al.al((((long)v11)) * v20);
                        int v9 = v4 - v6;
                        if(v0 > 0xFFFF) {
                            if(v9 > 1670609001) {
                                v9 = 0x9956C347;
                            }

                            v1.al.an(mr.ax, 0, v9 + 10, 0x6F443A6E);
                            v3_1 = (mr.ax[v13] & -1570219685) + (((mr.ax[v5] & 0xFF) << 8) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            int v10 = (mr.ax[5] & 0xFF) + ((mr.ax[v15] & 0xFF) << 8);
                            v11 = (mr.ax[8] & 0x430C7672) + (((mr.ax[6] & 0x5FC339EA) << 16) + ((mr.ax[7] & 1920050533) << 8));
                            v14 = mr.ax[9] & 0xFF;
                            v5 = v11;
                            v24 = 10;
                            v11 = v10;
                        }
                        else {
                            if(v9 > 0x46BC8AC5) {
                                v9 = 0x200;
                            }

                            v1.al.an(mr.ax, 0, v9 + 8, 0x7F15E384);
                            v3_1 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xAE58540D) << 8);
                            v11 = ((mr.ax[v5] & 0xFF) << 8) + (mr.ax[v13] & 0x2910DEBB);
                            v24 = 8;
                            int v25 = ((mr.ax[5] & 0xFF) << 8) + ((mr.ax[v15] & 0x4F9E7C6D) << 16) + (mr.ax[6] & 0xFF);
                            v14 = mr.ax[7] & 0xFF;
                            v5 = v25;
                        }

                        if(v3_1 == v0 && v12 == v11) {
                            if(v14 != v1.ar * 0xB9FC240E) {
                            }
                            else {
                                if(v5 >= 0) {
                                    if((((long)v5)) > v1.al.ae(0x89482A6B) / v20) {
                                    }
                                    else {
                                        v9 += v24;
                                        v3_1 = v24;
                                        while(true) {
                                            if(v3_1 < v9) {
                                                v7[v6] = mr.ax[v3_1];
                                                ++v3_1;
                                                ++v6;
                                                continue;
                                            }
                                            else {
                                                goto label_237;
                                            }
                                        }
                                    }
                                }

                                break;
                            }
                        }

                        goto label_247;
                    }
                    catch(IOException ) {
                        goto label_260;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_263;
                }
            }
            else {
                goto label_82;
            label_237:
                ++v12;
                v11 = v5;
                v3 = null;
                v5 = 2;
                continue;
            }

            goto label_252;
        }

        try {
            __monitor_exit(v2);
            return null;
        label_247:
            __monitor_exit(v2);
            return null;
        label_250:
            __monitor_exit(v2);
            return v7;
        label_260:
            __monitor_exit(v2);
            return null;
        label_252:
            __monitor_exit(v2);
            return null;
        label_255:
            __monitor_exit(v2);
            return v3;
        label_263:
            __monitor_exit(v2);
        }
        catch(Throwable v0_1) {
            goto label_263;
        }

        throw v0_1;
    }

    public byte[] ax(int arg27, int arg28) {
        int v24;
        int v14;
        int v3_1;
        int v12;
        int v11;
        byte[] v7;
        long v20;
        int v15;
        int v13;
        int v4;
        int v5;
        int v6;
        byte[] v3;
        op v2;
        mr v1 = this;
        int v0 = arg27;
        try {
            v2 = v1.al;
            __monitor_enter(v2);
            v3 = null;
        }
        catch(RuntimeException v0_1) {
            goto label_259;
        }

        try {
            v6 = v0 * 6;
            if(v1.ae.ae(-1751015992) >= (((long)(v6 + 6)))) {
                goto label_14;
            }
        }
        catch(IOException ) {
            goto label_252;
        }

        __monitor_exit(v2);
        return v3;
        try {
        label_14:
            v1.ae.al(((long)v6));
            v1.ae.an(mr.ax, 0, 6, 0x7E4FCB2A);
            v5 = 2;
            v4 = (mr.ax[v5] & 0xFF) + (((mr.ax[1] & 0xFF) << 8) + ((mr.ax[0] & 0xFF) << 16));
            v13 = 3;
            v15 = 4;
            v6 = (mr.ax[5] & 0xFF) + (((mr.ax[v13] & 0xFF) << 16) + ((mr.ax[v15] & 0xFF) << 8));
            if(v4 >= 0) {
                if(v4 > v1.an * 0xAF0BC6A1) {
                }
                else {
                    if(v6 > 0) {
                        v20 = 520;
                        if((((long)v6)) > v1.al.ae(0x91435B30) / v20) {
                        }
                        else {
                            v7 = new byte[v4];
                            v11 = v6;
                            v6 = 0;
                            v12 = 0;
                            goto label_74;
                        }
                    }

                    goto label_244;
                }
            }

            goto label_247;
        }
        catch(IOException ) {
            goto label_252;
        }

        while(true) {
        label_74:
            if(v6 >= v4) {
                goto label_242;
            }
            else if(v11 == 0) {
                try {
                    __monitor_exit(v2);
                    return v3;
                    try {
                    label_78:
                        v1.al.al((((long)v11)) * v20);
                        int v9 = v4 - v6;
                        if(v0 > 0xFFFF) {
                            if(v9 > 510) {
                                v9 = 510;
                            }

                            v1.al.an(mr.ax, 0, v9 + 10, -1309768997);
                            v3_1 = (mr.ax[v13] & 0xFF) + (((mr.ax[v5] & 0xFF) << 8) + (((mr.ax[1] & 0xFF) << 16) + ((mr.ax[0] & 0xFF) << 24)));
                            int v10 = (mr.ax[5] & 0xFF) + ((mr.ax[v15] & 0xFF) << 8);
                            v11 = (mr.ax[8] & 0xFF) + (((mr.ax[6] & 0xFF) << 16) + ((mr.ax[7] & 0xFF) << 8));
                            v14 = mr.ax[9] & 0xFF;
                            v5 = v11;
                            v24 = 10;
                            v11 = v10;
                        }
                        else {
                            if(v9 > 0x200) {
                                v9 = 0x200;
                            }

                            v1.al.an(mr.ax, 0, v9 + 8, 0xC5F7DA26);
                            v3_1 = (mr.ax[1] & 0xFF) + ((mr.ax[0] & 0xFF) << 8);
                            v11 = ((mr.ax[v5] & 0xFF) << 8) + (mr.ax[v13] & 0xFF);
                            v24 = 8;
                            int v25 = ((mr.ax[5] & 0xFF) << 8) + ((mr.ax[4] & 0xFF) << 16) + (mr.ax[6] & 0xFF);
                            v14 = mr.ax[7] & 0xFF;
                            v5 = v25;
                        }

                        if(v3_1 == v0 && v12 == v11) {
                            if(v14 != v1.ar * 0x6660DF55) {
                            }
                            else {
                                if(v5 >= 0) {
                                    if((((long)v5)) > v1.al.ae(0xD811D098) / v20) {
                                    }
                                    else {
                                        v9 += v24;
                                        v3_1 = v24;
                                        while(true) {
                                            if(v3_1 < v9) {
                                                v7[v6] = mr.ax[v3_1];
                                                ++v3_1;
                                                ++v6;
                                                continue;
                                            }
                                            else {
                                                goto label_228;
                                            }
                                        }
                                    }
                                }

                                break;
                            }
                        }

                        goto label_239;
                    }
                    catch(IOException ) {
                        goto label_252;
                    }
                }
                catch(Throwable v0_2) {
                    goto label_255;
                }
            }
            else {
                goto label_78;
            label_228:
                ++v12;
                v11 = v5;
                v3 = null;
                v5 = 2;
                v15 = 4;
                continue;
            }

            goto label_244;
        }

        try {
            __monitor_exit(v2);
            return null;
        label_239:
            __monitor_exit(v2);
            return null;
        label_242:
            __monitor_exit(v2);
            return v7;
        label_252:
            __monitor_exit(v2);
            return null;
        label_244:
            __monitor_exit(v2);
            return null;
        label_247:
            __monitor_exit(v2);
            return v3;
        label_255:
            __monitor_exit(v2);
        }
        catch(Throwable v0_2) {
            goto label_255;
        }

        try {
            throw v0_2;
        }
        catch(RuntimeException v0_1) {
        label_259:
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("mr.ax(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public String hm() {
        return "" + this.ar * 0xEBFB4C25;
    }

    public String hx() {
        return "" + this.ar * 0x6660DF55;
    }

    public String hz() {
        return "" + this.ar * 0x6660DF55;
    }

    public String toString() {
        try {
            return "" + this.ar * 0x6660DF55;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mr.toString(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

