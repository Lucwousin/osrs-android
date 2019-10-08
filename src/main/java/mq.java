import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class mq implements Runnable {
    public static final String ab = "gcu2QC";
    lw ae;
    static final int aj = 1;
    public static String al = null;
    Thread an;
    boolean ap;
    static final int aq = 4;
    lw ar;
    public static final int at = 20;
    public static String ax;
    static ar iu;

    public mq() {
        try {
            super();
            this.ae = null;
            this.ar = null;
            this.ap = false;
            mq.ax = "Unknown";
            mq.al = "1.6";
            try {
                mq.ax = System.getProperty("java.vendor");
                mq.al = System.getProperty("java.version");
                goto label_16;
            }
            catch(Exception ) {
            label_16:
                this.ap = false;
                this.an = new Thread(((Runnable)this));
                this.an.setPriority(10);
                this.an.setDaemon(true);
                this.an.start();
                return;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public final lw aa(Runnable arg7, int arg8) {
        return this.ap(2, arg8, 0, arg7, 0xC56CB53D);
    }

    final lw ab(int arg2, int arg3, int arg4, Object arg5) {
        lw v4 = new lw();
        v4.ap = arg2 * 0xDB5A8AB7;
        v4.aj = arg3;
        v4.ad = arg5;
        __monitor_enter(this);
        try {
            if(this.ar != null) {
                this.ar.ax = v4;
                this.ar = v4;
            }
            else {
                this.ae = v4;
                this.ar = v4;
            }

            this.notify();
            __monitor_exit(this);
            return v4;
        label_20:
            __monitor_exit(this);
        }
        catch(Throwable v2) {
            goto label_20;
        }

        throw v2;
    }

    public final lw ad(Runnable arg7, int arg8, int arg9) {
        int v1 = 2;
        int v5 = 0xB7B1156;
        mq v0 = this;
        int v2 = arg8;
        Runnable v4 = arg7;
        try {
            return v0.ap(v1, v2, 0, v4, v5);
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("mq.ad(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public final void ae() {
        int v1;
        lw v0_1;
        while(true) {
            __monitor_enter(this);
            try {
                while(true) {
                label_1:
                    if(this.ap) {
                        goto label_3;
                    }

                    if(this.ae == null) {
                        goto label_52;
                    }

                    v0_1 = this.ae;
                    this.ae = this.ae.ax;
                    if(this.ae == null) {
                        this.ar = null;
                    }

                    __monitor_exit(this);
                    v1 = 2;
                    break;
                }
            }
            catch(Throwable v0) {
                goto label_55;
            }

            try {
                int v2 = v0_1.ap * 0x8F7A7307;
                if(v2 == 1) {
                    v0_1.aq = new Socket(InetAddress.getByName(v0_1.ad), v0_1.aj);
                }
                else if(v1 == v2) {
                    Thread v2_1 = new Thread(v0_1.ad);
                    v2_1.setDaemon(true);
                    v2_1.start();
                    v2_1.setPriority(v0_1.aj);
                    v0_1.aq = v2_1;
                }
                else if(v2 == 4) {
                    v0_1.aq = new DataInputStream(v0_1.ad.openStream());
                }

                v0_1.an = 1;
                continue;
            }
            catch(Throwable ) {
                v0_1.an = v1;
                continue;
            }
            catch(ThreadDeath v0_2) {
                throw v0_2;
            }
        }

        try {
        label_52:
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
            goto label_55;
        }

        try {
        label_3:
            __monitor_exit(this);
            return;
        }
        catch(Throwable v0) {
            try {
            label_55:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_55;
            }

            throw v0;
        }
    }

    public final lw af(String arg7, int arg8) {
        return this.ap(1, arg8, 0, arg7, 0x8BC5EB5B);
    }

    public final lw ai(String arg7, int arg8) {
        return this.ap(1, arg8, 0, arg7, 0xCFE0908E);
    }

    public final lw aj(String arg7, int arg8, int arg9) {
        int v5 = 0x80ED3C35;
        mq v0 = this;
        int v2 = arg8;
        String v4 = arg7;
        try {
            return v0.ap(1, v2, 0, v4, v5);
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("mq.aj(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public final void al() {
        int v1;
        lw v0_1;
        while(true) {
            __monitor_enter(this);
            try {
                while(true) {
                label_1:
                    if(this.ap) {
                        goto label_3;
                    }

                    if(this.ae == null) {
                        goto label_52;
                    }

                    v0_1 = this.ae;
                    this.ae = this.ae.ax;
                    if(this.ae == null) {
                        this.ar = null;
                    }

                    __monitor_exit(this);
                    v1 = 2;
                    break;
                }
            }
            catch(Throwable v0) {
                goto label_55;
            }

            try {
                int v2 = v0_1.ap * 0x8F7A7307;
                if(v2 == 1) {
                    v0_1.aq = new Socket(InetAddress.getByName(v0_1.ad), v0_1.aj);
                }
                else if(v1 == v2) {
                    Thread v2_1 = new Thread(v0_1.ad);
                    v2_1.setDaemon(true);
                    v2_1.start();
                    v2_1.setPriority(v0_1.aj);
                    v0_1.aq = v2_1;
                }
                else if(v2 == 4) {
                    v0_1.aq = new DataInputStream(v0_1.ad.openStream());
                }

                v0_1.an = 1;
                continue;
            }
            catch(Throwable ) {
                v0_1.an = v1;
                continue;
            }
            catch(ThreadDeath v0_2) {
                throw v0_2;
            }
        }

        try {
        label_52:
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
            goto label_55;
        }

        try {
        label_3:
            __monitor_exit(this);
            return;
        }
        catch(Throwable v0) {
            try {
            label_55:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_55;
            }

            throw v0;
        }
    }

    public final void an(byte arg3) {
        try {
            __monitor_enter(this);
        }
        catch(RuntimeException v3) {
            goto label_13;
        }

        try {
            this.ap = true;
            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v3_1) {
            try {
            label_9:
                __monitor_exit(this);
            }
            catch(Throwable v3_1) {
                goto label_9;
            }

            try {
                throw v3_1;
            }
            catch(RuntimeException v3) {
                goto label_13;
            }
        }

        try {
            this.an.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
        catch(RuntimeException v3) {
        label_13:
            StringBuilder v0 = new StringBuilder();
            v0.append("mq.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final lw ap(int arg1, int arg2, int arg3, Object arg4, int arg5) {
        lw v3;
        try {
            v3 = new lw();
            v3.ap = arg1 * 0xDB5A8AB7;
            v3.aj = arg2;
            v3.ad = arg4;
            __monitor_enter(this);
        }
        catch(RuntimeException v1) {
            goto label_24;
        }

        try {
            if(this.ar != null) {
                this.ar.ax = v3;
                this.ar = v3;
            }
            else {
                this.ae = v3;
                this.ar = v3;
            }

            this.notify();
            __monitor_exit(this);
            return v3;
        label_20:
            __monitor_exit(this);
        }
        catch(Throwable v1_1) {
            goto label_20;
        }

        try {
            throw v1_1;
        }
        catch(RuntimeException v1) {
        label_24:
            StringBuilder v2 = new StringBuilder();
            v2.append("mq.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public final void aq() {
        __monitor_enter(this);
        try {
            this.ap = true;
            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_9:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_9;
            }

            throw v0;
        }

        try {
            this.an.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    public final void ar() {
        int v1;
        lw v0_1;
        while(true) {
            __monitor_enter(this);
            try {
                while(true) {
                label_1:
                    if(this.ap) {
                        goto label_3;
                    }

                    if(this.ae == null) {
                        goto label_52;
                    }

                    v0_1 = this.ae;
                    this.ae = this.ae.ax;
                    if(this.ae == null) {
                        this.ar = null;
                    }

                    __monitor_exit(this);
                    v1 = 2;
                    break;
                }
            }
            catch(Throwable v0) {
                goto label_55;
            }

            try {
                int v2 = v0_1.ap * 1715121058;
                if(v2 == 1) {
                    v0_1.aq = new Socket(InetAddress.getByName(v0_1.ad), v0_1.aj);
                }
                else if(v1 == v2) {
                    Thread v2_1 = new Thread(v0_1.ad);
                    v2_1.setDaemon(true);
                    v2_1.start();
                    v2_1.setPriority(v0_1.aj);
                    v0_1.aq = v2_1;
                }
                else if(v2 == 4) {
                    v0_1.aq = new DataInputStream(v0_1.ad.openStream());
                }

                v0_1.an = 1;
                continue;
            }
            catch(Throwable ) {
                v0_1.an = v1;
                continue;
            }
            catch(ThreadDeath v0_2) {
                throw v0_2;
            }
        }

        try {
        label_52:
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
            goto label_55;
        }

        try {
        label_3:
            __monitor_exit(this);
            return;
        }
        catch(Throwable v0) {
            try {
            label_55:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_55;
            }

            throw v0;
        }
    }

    public final lw au(Runnable arg7, int arg8) {
        return this.ap(2, arg8, 0, arg7, -828740680);
    }

    public final lw av(String arg7, int arg8) {
        return this.ap(1, arg8, 0, arg7, 0xCA2840CE);
    }

    public final void ax() {
        int v1;
        lw v0_1;
        while(true) {
            __monitor_enter(this);
            try {
                while(true) {
                label_1:
                    if(this.ap) {
                        goto label_3;
                    }

                    if(this.ae == null) {
                        goto label_52;
                    }

                    v0_1 = this.ae;
                    this.ae = this.ae.ax;
                    if(this.ae == null) {
                        this.ar = null;
                    }

                    __monitor_exit(this);
                    v1 = 2;
                    break;
                }
            }
            catch(Throwable v0) {
                goto label_55;
            }

            try {
                int v2 = v0_1.ap * 0x8F7A7307;
                if(v2 == 1) {
                    v0_1.aq = new Socket(InetAddress.getByName(v0_1.ad), v0_1.aj);
                }
                else if(v1 == v2) {
                    Thread v2_1 = new Thread(v0_1.ad);
                    v2_1.setDaemon(true);
                    v2_1.start();
                    v2_1.setPriority(v0_1.aj);
                    v0_1.aq = v2_1;
                }
                else if(v2 == 4) {
                    v0_1.aq = new DataInputStream(v0_1.ad.openStream());
                }

                v0_1.an = 1;
                continue;
            }
            catch(Throwable ) {
                v0_1.an = v1;
                continue;
            }
            catch(ThreadDeath v0_2) {
                throw v0_2;
            }
        }

        try {
        label_52:
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
            goto label_55;
        }

        try {
        label_3:
            __monitor_exit(this);
            return;
        }
        catch(Throwable v0) {
            try {
            label_55:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_55;
            }

            throw v0;
        }
    }

    public final void run() {
        int v1;
        lw v0_2;
        try {
            while(true) {
            label_0:
                __monitor_enter(this);
                break;
            }
        }
        catch(RuntimeException v0) {
            goto label_59;
        }

        try {
            while(true) {
            label_1:
                if(this.ap) {
                    goto label_3;
                }

                if(this.ae == null) {
                    goto label_52;
                }

                v0_2 = this.ae;
                this.ae = this.ae.ax;
                if(this.ae == null) {
                    this.ar = null;
                }

                __monitor_exit(this);
                v1 = 2;
                break;
            }
        }
        catch(Throwable v0_1) {
            goto label_55;
        }

        try {
            int v2 = v0_2.ap * 0x8F7A7307;
            if(v2 == 1) {
                v0_2.aq = new Socket(InetAddress.getByName(v0_2.ad), v0_2.aj);
            }
            else if(v1 == v2) {
                Thread v2_1 = new Thread(v0_2.ad);
                v2_1.setDaemon(true);
                v2_1.start();
                v2_1.setPriority(v0_2.aj);
                v0_2.aq = v2_1;
            }
            else if(v2 == 4) {
                v0_2.aq = new DataInputStream(v0_2.ad.openStream());
            }

            v0_2.an = 1;
            goto label_0;
        }
        catch(RuntimeException v0) {
        }
        catch(Throwable ) {
            try {
            label_52:
                this.wait();
                goto label_1;
            }
            catch(InterruptedException ) {
                goto label_1;
            }
            catch(Throwable v0_1) {
                goto label_55;
            }

            try {
            label_3:
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_1) {
                try {
                label_55:
                    __monitor_exit(this);
                }
                catch(Throwable v0_1) {
                    goto label_55;
                }

                try {
                    throw v0_1;
                }
                catch(RuntimeException v0) {
                label_59:
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("mq.run(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0), v1_1.toString());
                }
            }
        }
        catch(ThreadDeath v0_3) {
            try {
                throw v0_3;
                v0_2.an = v1;
                goto label_0;
            }
            catch(RuntimeException v0) {
                goto label_59;
            }
        }
    }
}

