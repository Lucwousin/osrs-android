import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class ll extends mz implements Runnable {
    boolean ab;
    int ad;
    Socket ae;
    final int af;
    final int ai;
    byte[] aj;
    OutputStream al;
    mq an;
    lw ap;
    int aq;
    boolean ar;
    InputStream ax;
    public static final int ce = 87;

    public ll(Socket arg2, mq arg3, int arg4) throws IOException {
        try {
            super();
            this.ar = false;
            this.ad = 0;
            this.aq = 0;
            this.ab = false;
            this.an = arg3;
            this.ae = arg2;
            this.af = 1170649387 * arg4;
            this.ai = (arg4 - 100) * 890738621;
            this.ae.setSoTimeout(30000);
            this.ae.setTcpNoDelay(true);
            this.ae.setReceiveBufferSize(0x10000);
            this.ae.setSendBufferSize(0x10000);
            this.ax = this.ae.getInputStream();
            this.al = this.ae.getOutputStream();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ll.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void aa() {
        if(this.ar) {
            return;
        }

        __monitor_enter(this);
        try {
            this.ar = true;
            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_26:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_26;
            }

            throw v0;
        }

        if(this.ap != null) {
            while(this.ap.an == 0) {
                ju.ax(1);
            }

            if(this.ap.an == 1) {
                try {
                    this.ap.aq.join();
                    goto label_22;
                }
                catch(InterruptedException ) {
                label_22:
                    this.ap = null;
                    return;
                }
            }
        }

        goto label_22;
    }

    void ab(byte[] arg6, int arg7, int arg8, byte arg9) throws IOException {
        int v1;
        int v0;
        try {
            if(this.ar) {
                return;
            }

            v0 = 0;
            if(this.ab) {
                goto label_63;
            }

            v1 = 0x3FD88583;
            if(this.aj == null) {
                this.aj = new byte[this.af * v1];
            }

            __monitor_enter(this);
        }
        catch(RuntimeException v6) {
            goto label_69;
        }

        while(true) {
            if(v0 >= arg8) {
                goto label_51;
            }

            try {
                this.aj[this.aq * 35445075] = arg6[arg7 + v0];
                this.aq = (this.aq * 35445075 + 1) % (this.af * v1) * 0x5F44D2DB;
                if((this.ai * 0x68AEDB95 + this.ad * -381936007) % (this.af * v1) != this.aq * 35445075) {
                    ++v0;
                    continue;
                }

                throw new IOException();
            label_51:
                if(this.ap == null) {
                    this.ap = this.an.ad(((Runnable)this), 3, 0xD21DC9D7);
                }

                this.notifyAll();
                __monitor_exit(this);
                return;
            label_61:
                __monitor_exit(this);
                break;
            }
            catch(Throwable v6_1) {
                goto label_61;
            }
        }

        try {
            throw v6_1;
        label_63:
            this.ab = false;
            throw new IOException();
        }
        catch(RuntimeException v6) {
        label_69:
            StringBuilder v7 = new StringBuilder();
            v7.append("ll.ab(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    void ac(byte[] arg6, int arg7, int arg8) throws IOException {
        if(this.ar) {
            return;
        }

        int v1 = 0;
        if(!this.ab) {
            int v2 = 0x3FD88583;
            if(this.aj == null) {
                this.aj = new byte[this.af * v2];
            }

            __monitor_enter(this);
            while(true) {
                if(v1 >= arg8) {
                    goto label_54;
                }

                try {
                    this.aj[this.aq * 0x37405FA7] = arg6[arg7 + v1];
                    this.aq = (this.aq * 35445075 + 1) % (this.af * v2) * 0x5F44D2DB;
                    if((this.ai * 0x2DEAD3FB + this.ad * 0x2AE7EACA) % (this.af * 0x11E00621) != this.aq * 0x675C7F9B) {
                        ++v1;
                        continue;
                    }

                    throw new IOException();
                label_54:
                    if(this.ap == null) {
                        this.ap = this.an.ad(((Runnable)this), 3, 0xD21DC9D7);
                    }

                    this.notifyAll();
                    __monitor_exit(this);
                    return;
                label_64:
                    __monitor_exit(this);
                    break;
                }
                catch(Throwable v6) {
                    goto label_64;
                }
            }

            throw v6;
        }

        this.ab = false;
        throw new IOException();
    }

    public boolean ad(int arg3) throws IOException {
        try {
            boolean v1 = false;
            if(this.ar) {
                return 0;
            }

            if(this.ax.available() < arg3) {
                return v1;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ll.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return true;
    }

    static void ae(int arg6, String arg7, String arg8, String arg9, int arg10) {
        try {
            Object v10 = ic.ax.get(Integer.valueOf(arg6));
            if(v10 == null) {
                ig v10_1 = new ig();
                ic.ax.put(Integer.valueOf(arg6), v10_1);
            }

            ij v6_1 = v10.ax(arg6, arg7, arg8, arg9, 1102798424);
            ic.al.al(((mx)v6_1), ((long)(v6_1.ax * 0x7D5124F1)));
            ic.ae.al(((mv)v6_1));
            client.mr = client.mg * 0x277F1449;
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("ll.ae(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    public void ae() {
        int v3;
        int v1_2;
        int v4;
        int v2;
        while(true) {
            byte[] v0 = null;
            try {
                __monitor_enter(this);
            }
            catch(Exception v1) {
                goto label_82;
            }

            try {
                v2 = -381936007;
                v4 = 35445075;
                if(this.ad * v2 == this.aq * v4) {
                    if(this.ar) {
                        __monitor_exit(this);
                        goto label_12;
                    }
                    else {
                        goto label_26;
                    }
                }

                goto label_27;
            }
            catch(Throwable v1_1) {
                goto label_78;
            }

            try {
            label_12:
                if(this.ax != null) {
                    this.ax.close();
                }

                if(this.al != null) {
                    this.al.close();
                }

                if(this.ae != null) {
                    this.ae.close();
                }

                goto label_24;
            }
            catch(Exception v1) {
            }
            catch(IOException ) {
                try {
                label_24:
                    this.aj = v0;
                    return;
                }
                catch(Exception v1) {
                    goto label_82;
                }

                try {
                label_26:
                    this.wait();
                    goto label_27;
                }
                catch(Throwable v1_1) {
                }
                catch(InterruptedException ) {
                    try {
                    label_27:
                        v1_2 = this.ad * v2;
                        v3 = this.aq * v4 >= this.ad * v2 ? this.aq * v4 - this.ad * v2 : this.af * 2120083989 - this.ad * 0x31242CAA;
                        __monitor_exit(this);
                        if(v3 <= 0) {
                            continue;
                        }
                    }
                    catch(Throwable v1_1) {
                        goto label_78;
                    }

                    try {
                        this.al.write(this.aj, v1_2, v3);
                        goto label_55;
                    }
                    catch(Exception v1) {
                    }
                    catch(IOException ) {
                        try {
                            this.ab = true;
                        label_55:
                            this.ad = (v3 + this.ad * v2) % (this.af * 0xAE985DC2) * 0x96F14D0B;
                        }
                        catch(Exception v1) {
                            goto label_82;
                        }

                        try {
                            if(this.ad * -1707513933 != this.aq * 0x5DAFF78E) {
                                continue;
                            }

                            this.al.flush();
                            continue;
                        }
                        catch(Exception v1) {
                        }
                        catch(IOException ) {
                            try {
                                this.ab = true;
                                continue;
                            }
                            catch(Exception v1) {
                                goto label_82;
                            }

                            try {
                            label_78:
                                __monitor_exit(this);
                            }
                            catch(Throwable v1_1) {
                                goto label_78;
                            }

                            try {
                                throw v1_1;
                            }
                            catch(Exception v1) {
                            label_82:
                                po.ax(((String)v0), ((Throwable)v1), 0xBFD1E139);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void af(byte[] arg2, int arg3, int arg4) throws IOException {
        byte v0 = 3;
        try {
            this.ab(arg2, arg3, arg4, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ll.af(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ag() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.read();
    }

    public int ah() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.read();
    }

    public void ai() {
        if(this.ar) {
            return;
        }

        __monitor_enter(this);
        try {
            this.ar = true;
            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_26:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_26;
            }

            throw v0;
        }

        if(this.ap != null) {
            while(this.ap.an == 0) {
                ju.ax(1);
            }

            if(this.ap.an == 1) {
                try {
                    this.ap.aq.join();
                    goto label_22;
                }
                catch(InterruptedException ) {
                label_22:
                    this.ap = null;
                    return;
                }
            }
        }

        goto label_22;
    }

    static void aj(int arg2) {
        try {
            ic.ax.clear();
            ic.al.ae();
            ic.ae.ax();
            ic.ar = 0;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ll.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int aj() throws IOException {
        try {
            if(this.ar) {
                return 0;
            }

            return this.ax.available();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ll.aj(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected void ajo() {
        this.an();
    }

    protected void ajs() {
        this.an();
    }

    void ak(byte[] arg6, int arg7, int arg8) throws IOException {
        if(this.ar) {
            return;
        }

        int v1 = 0;
        if(!this.ab) {
            if(this.aj == null) {
                this.aj = new byte[this.af * 843425040];
            }

            __monitor_enter(this);
            while(true) {
                if(v1 >= arg8) {
                    goto label_55;
                }

                try {
                    this.aj[this.aq * 0x3F3CE2F4] = arg6[arg7 + v1];
                    this.aq = (this.aq * 35445075 + 1) % (this.af * 0x8916099) * 0x96C5E2B3;
                    if((this.ai * 0x68AEDB95 + this.ad * -381936007) % (this.af * 0xC4D05FF2) != this.aq * 0xB1B4CFC) {
                        ++v1;
                        continue;
                    }

                    throw new IOException();
                label_55:
                    if(this.ap == null) {
                        this.ap = this.an.ad(((Runnable)this), 3, 0xD21DC9D7);
                    }

                    this.notifyAll();
                    __monitor_exit(this);
                    return;
                label_65:
                    __monitor_exit(this);
                    break;
                }
                catch(Throwable v6) {
                    goto label_65;
                }
            }

            throw v6;
        }

        this.ab = false;
        throw new IOException();
    }

    public void al() {
        int v3;
        int v6;
        int v1_2;
        int v4;
        int v2;
        while(true) {
            byte[] v0 = null;
            try {
                __monitor_enter(this);
            }
            catch(Exception v1) {
                goto label_78;
            }

            try {
                v2 = -381936007;
                v4 = 35445075;
                if(this.ad * v2 == this.aq * v4) {
                    if(this.ar) {
                        __monitor_exit(this);
                        goto label_12;
                    }
                    else {
                        goto label_26;
                    }
                }

                goto label_27;
            }
            catch(Throwable v1_1) {
                goto label_74;
            }

            try {
            label_12:
                if(this.ax != null) {
                    this.ax.close();
                }

                if(this.al != null) {
                    this.al.close();
                }

                if(this.ae != null) {
                    this.ae.close();
                }

                goto label_24;
            }
            catch(Exception v1) {
            }
            catch(IOException ) {
                try {
                label_24:
                    this.aj = v0;
                    return;
                }
                catch(Exception v1) {
                    goto label_78;
                }

                try {
                label_26:
                    this.wait();
                    goto label_27;
                }
                catch(Throwable v1_1) {
                }
                catch(InterruptedException ) {
                    try {
                    label_27:
                        v1_2 = this.ad * v2;
                        v6 = 0x3FD88583;
                        v3 = this.aq * v4 >= this.ad * v2 ? this.aq * v4 - this.ad * v2 : this.af * v6 - this.ad * v2;
                        __monitor_exit(this);
                        if(v3 <= 0) {
                            continue;
                        }
                    }
                    catch(Throwable v1_1) {
                        goto label_74;
                    }

                    try {
                        this.al.write(this.aj, v1_2, v3);
                        goto label_54;
                    }
                    catch(Exception v1) {
                    }
                    catch(IOException ) {
                        try {
                            this.ab = true;
                        label_54:
                            this.ad = (v3 + this.ad * v2) % (this.af * v6) * -1112806455;
                        }
                        catch(Exception v1) {
                            goto label_78;
                        }

                        try {
                            if(this.ad * v2 != this.aq * v4) {
                                continue;
                            }

                            this.al.flush();
                            continue;
                        }
                        catch(Exception v1) {
                        }
                        catch(IOException ) {
                            try {
                                this.ab = true;
                                continue;
                            }
                            catch(Exception v1) {
                                goto label_78;
                            }

                            try {
                            label_74:
                                __monitor_exit(this);
                            }
                            catch(Throwable v1_1) {
                                goto label_74;
                            }

                            try {
                                throw v1_1;
                            }
                            catch(Exception v1) {
                            label_78:
                                po.ax(((String)v0), ((Throwable)v1), 0x58F0F552);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public int am() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.read();
    }

    public void an() {
        try {
            if(this.ar) {
                return;
            }

            __monitor_enter(this);
        }
        catch(RuntimeException v0) {
            goto label_30;
        }

        try {
            this.ar = true;
            this.notifyAll();
            __monitor_exit(this);
            goto label_8;
        }
        catch(Throwable v0_1) {
            try {
            label_26:
                __monitor_exit(this);
            }
            catch(Throwable v0_1) {
                goto label_26;
            }

            try {
                throw v0_1;
            label_8:
                if(this.ap != null) {
                    while(this.ap.an == 0) {
                        ju.ax(1);
                    }

                    if(this.ap.an == 1) {
                        try {
                            this.ap.aq.join();
                            goto label_22;
                        }
                        catch(InterruptedException ) {
                        label_22:
                            lw v0_2 = null;
                            try {
                                this.ap = v0_2;
                                return;
                            }
                            catch(RuntimeException v0) {
                            label_30:
                                StringBuilder v1 = new StringBuilder();
                                v1.append("ll.an(");
                                v1.append(')');
                                throw lx.al(((Throwable)v0), v1.toString());
                            }
                        }
                    }
                }

                goto label_22;
            }
            catch(RuntimeException v0) {
                goto label_30;
            }
        }
    }

    public boolean ao(int arg3) throws IOException {
        boolean v1 = false;
        if(this.ar) {
            return 0;
        }

        if(this.ax.available() >= arg3) {
            v1 = true;
        }

        return v1;
    }

    public int ap() throws IOException {
        try {
            if(this.ar) {
                return 0;
            }

            return this.ax.read();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ll.ap(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int aq(byte[] arg3, int arg4, int arg5) throws IOException {
        try {
            if(this.ar) {
                return 0;
            }

            int v0 = arg4;
            for(arg4 = arg5; true; arg4 -= v1) {
                if(arg4 <= 0) {
                    return arg5;
                }

                int v1 = this.ax.read(arg3, v0, arg4);
                if(v1 <= 0) {
                    break;
                }

                v0 += v1;
            }

            throw new EOFException();
        }
        catch(RuntimeException v3) {
            goto label_19;
        }

        return arg5;
    label_19:
        StringBuilder v4 = new StringBuilder();
        v4.append("ll.aq(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public void ar() {
        int v3;
        int v5;
        int v2;
        int v1_1;
        while(true) {
            byte[] v0 = null;
            try {
                __monitor_enter(this);
                v1_1 = -626204254;
            }
            catch(Exception v1) {
                goto label_84;
            }

            try {
                if(this.ad * v1_1 == this.aq * 35445075) {
                    if(this.ar) {
                        __monitor_exit(this);
                        goto label_12;
                    }
                    else {
                        goto label_26;
                    }
                }

                goto label_27;
            }
            catch(Throwable v1_2) {
                goto label_80;
            }

            try {
            label_12:
                if(this.ax != null) {
                    this.ax.close();
                }

                if(this.al != null) {
                    this.al.close();
                }

                if(this.ae != null) {
                    this.ae.close();
                }

                goto label_24;
            }
            catch(Exception v1) {
            }
            catch(IOException ) {
                try {
                label_24:
                    this.aj = v0;
                    return;
                }
                catch(Exception v1) {
                    goto label_84;
                }

                try {
                label_26:
                    this.wait();
                    goto label_27;
                }
                catch(Throwable v1_2) {
                }
                catch(InterruptedException ) {
                    try {
                    label_27:
                        v2 = -381936007;
                        v1_1 = this.ad * v2;
                        v5 = 0x3FD88583;
                        v3 = this.aq * 0x6B907648 >= this.ad * 0x2B051AA0 ? this.aq * 0x55FE5B2D - this.ad * v2 : this.af * v5 - this.ad * 0xEBEB23B3;
                        __monitor_exit(this);
                        if(v3 <= 0) {
                            continue;
                        }
                    }
                    catch(Throwable v1_2) {
                        goto label_80;
                    }

                    try {
                        this.al.write(this.aj, v1_1, v3);
                        goto label_59;
                    }
                    catch(Exception v1) {
                    }
                    catch(IOException ) {
                        try {
                            this.ab = true;
                        label_59:
                            this.ad = (v3 + this.ad * v2) % (this.af * v5) * -1112806455;
                        }
                        catch(Exception v1) {
                            goto label_84;
                        }

                        try {
                            if(this.ad * v2 != this.aq * 0x238843A0) {
                                continue;
                            }

                            this.al.flush();
                            continue;
                        }
                        catch(Exception v1) {
                        }
                        catch(IOException ) {
                            try {
                                this.ab = true;
                                continue;
                            }
                            catch(Exception v1) {
                                goto label_84;
                            }

                            try {
                            label_80:
                                __monitor_exit(this);
                            }
                            catch(Throwable v1_2) {
                                goto label_80;
                            }

                            try {
                                throw v1_2;
                            }
                            catch(Exception v1) {
                            label_84:
                                po.ax(((String)v0), ((Throwable)v1), 0x618857F7);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public int as(byte[] arg3, int arg4, int arg5) throws IOException {
        if(this.ar) {
            return 0;
        }

        int v0 = arg4;
        for(arg4 = arg5; true; arg4 -= v1) {
            if(arg4 <= 0) {
                return arg5;
            }

            int v1 = this.ax.read(arg3, v0, arg4);
            if(v1 <= 0) {
                break;
            }

            v0 += v1;
        }

        throw new EOFException();
        return arg5;
    }

    public int at() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.available();
    }

    public int au() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.read();
    }

    public void av() {
        if(this.ar) {
            return;
        }

        __monitor_enter(this);
        try {
            this.ar = true;
            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_26:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_26;
            }

            throw v0;
        }

        if(this.ap != null) {
            while(this.ap.an == 0) {
                ju.ax(1);
            }

            if(this.ap.an == 1) {
                try {
                    this.ap.aq.join();
                    goto label_22;
                }
                catch(InterruptedException ) {
                label_22:
                    this.ap = null;
                    return;
                }
            }
        }

        goto label_22;
    }

    public boolean aw(int arg3) throws IOException {
        boolean v1 = false;
        if(this.ar) {
            return 0;
        }

        if(this.ax.available() >= arg3) {
            v1 = true;
        }

        return v1;
    }

    public void ax() {
        int v3;
        int v2;
        int v1_1;
        while(true) {
            byte[] v0 = null;
            try {
                __monitor_enter(this);
                v1_1 = -1162440316;
            }
            catch(Exception v1) {
                goto label_83;
            }

            try {
                if(this.ad * v1_1 == this.aq * 0x39FE6A1A) {
                    if(this.ar) {
                        __monitor_exit(this);
                        goto label_12;
                    }
                    else {
                        goto label_26;
                    }
                }

                goto label_27;
            }
            catch(Throwable v1_2) {
                goto label_79;
            }

            try {
            label_12:
                if(this.ax != null) {
                    this.ax.close();
                }

                if(this.al != null) {
                    this.al.close();
                }

                if(this.ae != null) {
                    this.ae.close();
                }

                goto label_24;
            }
            catch(Exception v1) {
            }
            catch(IOException ) {
                try {
                label_24:
                    this.aj = v0;
                    return;
                }
                catch(Exception v1) {
                    goto label_83;
                }

                try {
                label_26:
                    this.wait();
                    goto label_27;
                }
                catch(Throwable v1_2) {
                }
                catch(InterruptedException ) {
                    try {
                    label_27:
                        v2 = -381936007;
                        v1_1 = this.ad * v2;
                        int v4 = 35445075;
                        v3 = this.aq * v4 >= this.ad * 0xEDFD1E54 ? this.aq * 0x60DE7E20 - this.ad * v2 : this.af * 0x868BC0B1 - this.ad * v2;
                        __monitor_exit(this);
                        if(v3 <= 0) {
                            continue;
                        }
                    }
                    catch(Throwable v1_2) {
                        goto label_79;
                    }

                    try {
                        this.al.write(this.aj, v1_1, v3);
                        goto label_58;
                    }
                    catch(Exception v1) {
                    }
                    catch(IOException ) {
                        try {
                            this.ab = true;
                        label_58:
                            this.ad = (v3 + this.ad * v2) % (this.af * 0x3FD88583) * -1112806455;
                        }
                        catch(Exception v1) {
                            goto label_83;
                        }

                        try {
                            if(this.ad * v2 != this.aq * v4) {
                                continue;
                            }

                            this.al.flush();
                            continue;
                        }
                        catch(Exception v1) {
                        }
                        catch(IOException ) {
                            try {
                                this.ab = true;
                                continue;
                            }
                            catch(Exception v1) {
                                goto label_83;
                            }

                            try {
                            label_79:
                                __monitor_exit(this);
                            }
                            catch(Throwable v1_2) {
                                goto label_79;
                            }

                            try {
                                throw v1_2;
                            }
                            catch(Exception v1) {
                            label_83:
                                po.ax(((String)v0), ((Throwable)v1), 0x40E47BE2);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public int ay() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.available();
    }

    public int az() throws IOException {
        if(this.ar) {
            return 0;
        }

        return this.ax.read();
    }

    public void ba(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ab(arg2, arg3, arg4, 3);
    }

    public void bd(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ab(arg2, arg3, arg4, 3);
    }

    public void bf(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ab(arg2, arg3, arg4, 3);
    }

    public void bn(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ab(arg2, arg3, arg4, 3);
    }

    protected void finalize() {
        try {
            this.an();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ll.finalize(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void run() {
        int v3;
        int v6;
        int v1_2;
        int v4;
        int v2;
        while(true) {
            byte[] v0 = null;
            try {
                __monitor_enter(this);
            }
            catch(Exception v1) {
                goto label_79;
            }
            catch(RuntimeException v0_1) {
                goto label_82;
            }

            try {
                v2 = -381936007;
                v4 = 35445075;
                if(this.ad * v2 == this.aq * v4) {
                    if(this.ar) {
                        __monitor_exit(this);
                        goto label_12;
                    }
                    else {
                        goto label_26;
                    }
                }

                goto label_27;
            }
            catch(Throwable v1_1) {
                goto label_74;
            }

            try {
            label_12:
                if(this.ax != null) {
                    this.ax.close();
                }

                if(this.al != null) {
                    this.al.close();
                }

                if(this.ae != null) {
                    this.ae.close();
                }

                goto label_24;
            }
            catch(RuntimeException v0_1) {
            }
            catch(Exception v1) {
            }
            catch(IOException ) {
                try {
                label_24:
                    this.aj = v0;
                    return;
                }
                catch(Exception v1) {
                    goto label_79;
                }
                catch(RuntimeException v0_1) {
                    goto label_82;
                }

                try {
                label_26:
                    this.wait();
                    goto label_27;
                }
                catch(Throwable v1_1) {
                }
                catch(InterruptedException ) {
                    try {
                    label_27:
                        v1_2 = this.ad * v2;
                        v6 = 0x3FD88583;
                        v3 = this.aq * v4 >= this.ad * v2 ? this.aq * v4 - this.ad * v2 : this.af * v6 - this.ad * v2;
                        __monitor_exit(this);
                        if(v3 <= 0) {
                            continue;
                        }
                    }
                    catch(Throwable v1_1) {
                        goto label_74;
                    }

                    try {
                        this.al.write(this.aj, v1_2, v3);
                        goto label_54;
                    }
                    catch(RuntimeException v0_1) {
                    }
                    catch(Exception v1) {
                    }
                    catch(IOException ) {
                        try {
                            this.ab = true;
                        label_54:
                            this.ad = (v3 + this.ad * v2) % (this.af * v6) * -1112806455;
                        }
                        catch(Exception v1) {
                            goto label_79;
                        }
                        catch(RuntimeException v0_1) {
                            goto label_82;
                        }

                        try {
                            if(this.ad * v2 != this.aq * v4) {
                                continue;
                            }

                            this.al.flush();
                            continue;
                        }
                        catch(RuntimeException v0_1) {
                        }
                        catch(Exception v1) {
                        }
                        catch(IOException ) {
                            try {
                                this.ab = true;
                                continue;
                            }
                            catch(Exception v1) {
                                goto label_79;
                            }
                            catch(RuntimeException v0_1) {
                                goto label_82;
                            }

                            try {
                            label_74:
                                __monitor_exit(this);
                            }
                            catch(Throwable v1_1) {
                                goto label_74;
                            }

                            try {
                                throw v1_1;
                            }
                            catch(RuntimeException v0_1) {
                            label_82:
                                StringBuilder v1_3 = new StringBuilder();
                                v1_3.append("ll.run(");
                                v1_3.append(')');
                                throw lx.al(((Throwable)v0_1), v1_3.toString());
                            }
                            catch(Exception v1) {
                            label_79:
                                v2 = 0x71643E1F;
                                try {
                                    po.ax(((String)v0), ((Throwable)v1), v2);
                                }
                                catch(RuntimeException v0_1) {
                                    goto label_82;
                                }

                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}

