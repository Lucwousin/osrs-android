import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class mw implements Runnable {
    int ae;
    IOException aj;
    InputStream al;
    int an;
    int ap;
    byte[] ar;
    Thread ax;

    mw(InputStream arg2, int arg3) {
        super();
        this.an = 0;
        this.ap = 0;
        this.al = arg2;
        this.ae = arg3 + 1;
        this.ar = new byte[this.ae];
        this.ax = new Thread(((Runnable)this));
        this.ax.setDaemon(true);
        this.ax.start();
    }

    int aa() throws IOException {
        __monitor_enter(this);
        try {
            int v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
            if(v0_1 <= 0) {
                if(this.aj == null) {
                }
                else {
                    throw new IOException(this.aj.toString());
                }
            }

            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_26:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_26;
        }

        throw v0;
    }

    void ab() {
        __monitor_enter(this);
        try {
            if(this.aj == null) {
                this.aj = new IOException("");
            }

            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_13:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            throw v0;
        }

        try {
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    int ad() throws IOException {
        __monitor_enter(this);
        try {
            if(this.an == this.ap) {
                if(this.aj == null) {
                    __monitor_exit(this);
                    return -1;
                }

                throw new IOException(this.aj.toString());
            }

            int v0_1 = this.ar[this.an] & 0xFF;
            this.an = (this.an + 1) % this.ae;
            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_27:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_27;
        }

        throw v0;
    }

    public void ae() {
        while(true) {
            int v0 = this.an();
            int v1 = -1;
            if(v0 == v1) {
                return;
            }

            try {
                v0 = this.al.read(this.ar, this.ap, v0);
                if(v0 == v1) {
                    break;
                }
            }
            catch(IOException v0_1) {
                goto label_24;
            }

            __monitor_enter(this);
            try {
                this.ap = (this.ap + v0) % this.ae;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable v0_2) {
                goto label_18;
            }
        }

        try {
            throw new EOFException();
        }
        catch(IOException v0_1) {
        label_24:
            __monitor_enter(this);
            try {
                this.aj = v0_1;
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_2) {
                goto label_29;
            }
        }

        return;
        try {
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_29;
        }

        throw v0_2;
        try {
        label_18:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_18;
        }

        throw v0_2;
    }

    int af() {
        int v0_1;
        __monitor_enter(this);
        try {
        label_1:
            while(this.aj == null) {
                goto label_6;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        __monitor_exit(this);
        return -1;
        try {
        label_6:
            if(this.an == 0) {
                v0_1 = this.ae - this.ap - 1;
            }
            else if(this.an <= this.ap) {
                v0_1 = this.ae - this.ap;
            }
            else {
                v0_1 = this.an - this.ap - 1;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
        }

    label_30:
        __monitor_exit(this);
        throw v0;
    }

    int ag() throws IOException {
        __monitor_enter(this);
        try {
            if(this.an == this.ap) {
                if(this.aj == null) {
                    __monitor_exit(this);
                    return -1;
                }

                throw new IOException(this.aj.toString());
            }

            int v0_1 = this.ar[this.an] & 0xFF;
            this.an = (this.an + 1) % this.ae;
            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_27:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_27;
        }

        throw v0;
    }

    int ah(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    int ai() {
        int v0_1;
        __monitor_enter(this);
        try {
        label_1:
            while(this.aj == null) {
                goto label_6;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        __monitor_exit(this);
        return -1;
        try {
        label_6:
            if(this.an == 0) {
                v0_1 = this.ae - this.ap - 1;
            }
            else if(this.an <= this.ap) {
                v0_1 = this.ae - this.ap;
            }
            else {
                v0_1 = this.an - this.ap - 1;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
        }

    label_30:
        __monitor_exit(this);
        throw v0;
    }

    int aj() throws IOException {
        __monitor_enter(this);
        try {
            int v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
            if(v0_1 <= 0) {
                if(this.aj == null) {
                }
                else {
                    throw new IOException(this.aj.toString());
                }
            }

            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_26:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_26;
        }

        throw v0;
    }

    void ak() {
        __monitor_enter(this);
        try {
            if(this.aj == null) {
                this.aj = new IOException("");
            }

            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_13:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            throw v0;
        }

        try {
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    public void al() {
        while(true) {
            int v0 = this.an();
            int v1 = -1;
            if(v0 == v1) {
                return;
            }

            try {
                v0 = this.al.read(this.ar, this.ap, v0);
                if(v0 == v1) {
                    break;
                }
            }
            catch(IOException v0_1) {
                goto label_24;
            }

            __monitor_enter(this);
            try {
                this.ap = (this.ap + v0) % this.ae;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable v0_2) {
                goto label_18;
            }
        }

        try {
            throw new EOFException();
        }
        catch(IOException v0_1) {
        label_24:
            __monitor_enter(this);
            try {
                this.aj = v0_1;
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_2) {
                goto label_29;
            }
        }

        return;
        try {
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_29;
        }

        throw v0_2;
        try {
        label_18:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_18;
        }

        throw v0_2;
    }

    int am() throws IOException {
        __monitor_enter(this);
        try {
            int v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
            if(v0_1 <= 0) {
                if(this.aj == null) {
                }
                else {
                    throw new IOException(this.aj.toString());
                }
            }

            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_26:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_26;
        }

        throw v0;
    }

    int an() {
        int v0_1;
        __monitor_enter(this);
        try {
        label_1:
            while(this.aj == null) {
                goto label_6;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        __monitor_exit(this);
        return -1;
        try {
        label_6:
            if(this.an == 0) {
                v0_1 = this.ae - this.ap - 1;
            }
            else if(this.an <= this.ap) {
                v0_1 = this.ae - this.ap;
            }
            else {
                v0_1 = this.an - this.ap - 1;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
        }

    label_30:
        __monitor_exit(this);
        throw v0;
    }

    int ao(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    boolean ap(int arg4) throws IOException {
        if(arg4 == 0) {
            return 1;
        }

        if(arg4 > 0 && arg4 < this.ae) {
            __monitor_enter(this);
            try {
                int v1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(v1 < arg4) {
                    if(this.aj == null) {
                        this.notifyAll();
                        __monitor_exit(this);
                        return 0;
                    }

                    throw new IOException(this.aj.toString());
                }

                __monitor_exit(this);
                return 1;
            label_34:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_34;
            }

            throw v4;
        }

        throw new IOException();
    }

    int aq(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    public void ar() {
        while(true) {
            int v0 = this.an();
            int v1 = -1;
            if(v0 == v1) {
                return;
            }

            try {
                v0 = this.al.read(this.ar, this.ap, v0);
                if(v0 == v1) {
                    break;
                }
            }
            catch(IOException v0_1) {
                goto label_24;
            }

            __monitor_enter(this);
            try {
                this.ap = (this.ap + v0) % this.ae;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable v0_2) {
                goto label_18;
            }
        }

        try {
            throw new EOFException();
        }
        catch(IOException v0_1) {
        label_24:
            __monitor_enter(this);
            try {
                this.aj = v0_1;
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_2) {
                goto label_29;
            }
        }

        return;
        try {
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_29;
        }

        throw v0_2;
        try {
        label_18:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_18;
        }

        throw v0_2;
    }

    void as() {
        __monitor_enter(this);
        try {
            if(this.aj == null) {
                this.aj = new IOException("");
            }

            this.notifyAll();
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            try {
            label_13:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_13;
            }

            throw v0;
        }

        try {
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    int at(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    int au() throws IOException {
        __monitor_enter(this);
        try {
            int v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
            if(v0_1 <= 0) {
                if(this.aj == null) {
                }
                else {
                    throw new IOException(this.aj.toString());
                }
            }

            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_26:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_26;
        }

        throw v0;
    }

    int av() {
        int v0_1;
        __monitor_enter(this);
        try {
        label_1:
            while(this.aj == null) {
                goto label_6;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        __monitor_exit(this);
        return -1;
        try {
        label_6:
            if(this.an == 0) {
                v0_1 = this.ae - this.ap - 1;
            }
            else if(this.an <= this.ap) {
                v0_1 = this.ae - this.ap;
            }
            else {
                v0_1 = this.an - this.ap - 1;
            }
        }
        catch(Throwable v0) {
            goto label_30;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.wait();
            goto label_1;
        }
        catch(InterruptedException ) {
            goto label_1;
        }
        catch(Throwable v0) {
        }

    label_30:
        __monitor_exit(this);
        throw v0;
    }

    int aw(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    public void ax() {
        while(true) {
            int v0 = this.an();
            int v1 = -1;
            if(v0 == v1) {
                return;
            }

            try {
                v0 = this.al.read(this.ar, this.ap, v0);
                if(v0 == v1) {
                    break;
                }
            }
            catch(IOException v0_1) {
                goto label_24;
            }

            __monitor_enter(this);
            try {
                this.ap = (this.ap + v0) % this.ae;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable v0_2) {
                goto label_18;
            }
        }

        try {
            throw new EOFException();
        }
        catch(IOException v0_1) {
        label_24:
            __monitor_enter(this);
            try {
                this.aj = v0_1;
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_2) {
                goto label_29;
            }
        }

        return;
        try {
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_29;
        }

        throw v0_2;
        try {
        label_18:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_18;
        }

        throw v0_2;
    }

    int ay(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                int v0 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
                if(arg6 > v0) {
                    arg6 = v0;
                }

                if(arg6 == 0) {
                    if(this.aj == null) {
                    }
                    else {
                        throw new IOException(this.aj.toString());
                    }
                }

                if(this.an + arg6 <= this.ae) {
                    System.arraycopy(this.ar, this.an, arg4, arg5, arg6);
                }
                else {
                    v0 = this.ae - this.an;
                    System.arraycopy(this.ar, this.an, arg4, arg5, v0);
                    System.arraycopy(this.ar, 0, arg4, arg5 + v0, arg6 - v0);
                }

                this.an = (this.an + arg6) % this.ae;
                this.notifyAll();
                __monitor_exit(this);
                return arg6;
            label_57:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_57;
            }

            throw v4;
        }

        throw new IOException();
    }

    int az() throws IOException {
        __monitor_enter(this);
        try {
            if(this.an == this.ap) {
                if(this.aj == null) {
                    __monitor_exit(this);
                    return -1;
                }

                throw new IOException(this.aj.toString());
            }

            int v0_1 = this.ar[this.an] & 0xFF;
            this.an = (this.an + 1) % this.ae;
            this.notifyAll();
            __monitor_exit(this);
            return v0_1;
        label_27:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_27;
        }

        throw v0;
    }

    public void run() {
        while(true) {
            int v0 = this.an();
            int v1 = -1;
            if(v0 == v1) {
                return;
            }

            try {
                v0 = this.al.read(this.ar, this.ap, v0);
                if(v0 == v1) {
                    break;
                }
            }
            catch(IOException v0_1) {
                goto label_24;
            }

            __monitor_enter(this);
            try {
                this.ap = (this.ap + v0) % this.ae;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable v0_2) {
                goto label_18;
            }
        }

        try {
            throw new EOFException();
        }
        catch(IOException v0_1) {
        label_24:
            __monitor_enter(this);
            try {
                this.aj = v0_1;
                __monitor_exit(this);
                return;
            }
            catch(Throwable v0_2) {
                goto label_29;
            }
        }

        return;
        try {
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_29;
        }

        throw v0_2;
        try {
        label_18:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_18;
        }

        throw v0_2;
    }
}

