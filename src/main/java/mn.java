import java.io.IOException;
import java.io.OutputStream;

public class mn implements Runnable {
    boolean ad;
    int ae;
    IOException aj;
    OutputStream al;
    int an;
    int ap;
    byte[] ar;
    Thread ax;

    mn(OutputStream arg2, int arg3) {
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

    void aa(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    int ab() {
        int v0_1;
        int v1;
        __monitor_enter(this);
        try {
            while(true) {
            label_1:
                v1 = -1;
                if(this.aj == null) {
                    goto label_6;
                }

                break;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_6:
            v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
        }
        catch(Throwable v0) {
            goto label_34;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.al.flush();
        }
        catch(IOException v0_2) {
            try {
                this.aj = v0_2;
            }
            catch(Throwable v0) {
                goto label_34;
            }

            __monitor_exit(this);
            return v1;
        }

        try {
            if(!this.an()) {
                goto label_27;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_27:
            this.wait();
            goto label_1;
        }
        catch(Throwable v0) {
        }
        catch(InterruptedException ) {
            goto label_1;
        }

    label_34:
        __monitor_exit(this);
        throw v0;
    }

    void ad() {
        __monitor_enter(this);
        try {
            this.ad = true;
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
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    public void ae() {
        do {
            int v0 = this.ap();
            if(v0 == -1) {
                return;
            }

            try {
                if(this.an + v0 <= this.ae) {
                    this.al.write(this.ar, this.an, v0);
                }
                else {
                    int v1 = this.ae - this.an;
                    this.al.write(this.ar, this.an, v1);
                    this.al.write(this.ar, 0, v0 - v1);
                }
            }
            catch(IOException v0_1) {
                __monitor_enter(this);
                try {
                    this.aj = v0_1;
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable v0_2) {
                    goto label_44;
                }
            }

            __monitor_enter(this);
            try {
                this.an = (this.an + v0) % this.ae;
                __monitor_exit(this);
            }
            catch(Throwable v0_2) {
                goto label_36;
            }
        }
        while(!this.an());

        return;
        try {
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_44;
        }

        throw v0_2;
        try {
        label_36:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_36;
        }

        throw v0_2;
    }

    void af(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    void ag() {
        __monitor_enter(this);
        try {
            this.ad = true;
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
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    void ah() {
        __monitor_enter(this);
        try {
            this.ad = true;
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
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    void ai(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    void aj(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    public void al() {
        do {
            int v0 = this.ap();
            if(v0 == -1) {
                return;
            }

            try {
                if(this.an + v0 <= this.ae) {
                    this.al.write(this.ar, this.an, v0);
                }
                else {
                    int v1 = this.ae - this.an;
                    this.al.write(this.ar, this.an, v1);
                    this.al.write(this.ar, 0, v0 - v1);
                }
            }
            catch(IOException v0_1) {
                __monitor_enter(this);
                try {
                    this.aj = v0_1;
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable v0_2) {
                    goto label_44;
                }
            }

            __monitor_enter(this);
            try {
                this.an = (this.an + v0) % this.ae;
                __monitor_exit(this);
            }
            catch(Throwable v0_2) {
                goto label_36;
            }
        }
        while(!this.an());

        return;
        try {
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_44;
        }

        throw v0_2;
        try {
        label_36:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_36;
        }

        throw v0_2;
    }

    void am() {
        __monitor_enter(this);
        try {
            this.ad = true;
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
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    boolean an() {
        if(this.ad) {
            try {
                this.al.close();
                if(this.aj != null) {
                    return 1;
                }

                this.aj = new IOException("");
            }
            catch(IOException v0) {
                if(this.aj != null) {
                    return 1;
                }

                this.aj = new IOException(((Throwable)v0));
            }

            return 1;
        }

        return 0;
    }

    int ap() {
        int v0_1;
        int v1;
        __monitor_enter(this);
        try {
            while(true) {
            label_1:
                v1 = -1;
                if(this.aj == null) {
                    goto label_6;
                }

                break;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_6:
            v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
        }
        catch(Throwable v0) {
            goto label_34;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.al.flush();
        }
        catch(IOException v0_2) {
            try {
                this.aj = v0_2;
            }
            catch(Throwable v0) {
                goto label_34;
            }

            __monitor_exit(this);
            return v1;
        }

        try {
            if(!this.an()) {
                goto label_27;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_27:
            this.wait();
            goto label_1;
        }
        catch(Throwable v0) {
        }
        catch(InterruptedException ) {
            goto label_1;
        }

    label_34:
        __monitor_exit(this);
        throw v0;
    }

    int aq() {
        int v0_1;
        int v1;
        __monitor_enter(this);
        try {
            while(true) {
            label_1:
                v1 = -1;
                if(this.aj == null) {
                    goto label_6;
                }

                break;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_6:
            v0_1 = this.an <= this.ap ? this.ap - this.an : this.ae - this.an + this.ap;
        }
        catch(Throwable v0) {
            goto label_34;
        }

        if(v0_1 > 0) {
            __monitor_exit(this);
            return v0_1;
        }

        try {
            this.al.flush();
        }
        catch(IOException v0_2) {
            try {
                this.aj = v0_2;
            }
            catch(Throwable v0) {
                goto label_34;
            }

            __monitor_exit(this);
            return v1;
        }

        try {
            if(!this.an()) {
                goto label_27;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_27:
            this.wait();
            goto label_1;
        }
        catch(Throwable v0) {
        }
        catch(InterruptedException ) {
            goto label_1;
        }

    label_34:
        __monitor_exit(this);
        throw v0;
    }

    public void ar() {
        do {
            int v0 = this.ap();
            if(v0 == -1) {
                return;
            }

            try {
                if(this.an + v0 <= this.ae) {
                    this.al.write(this.ar, this.an, v0);
                }
                else {
                    int v1 = this.ae - this.an;
                    this.al.write(this.ar, this.an, v1);
                    this.al.write(this.ar, 0, v0 - v1);
                }
            }
            catch(IOException v0_1) {
                __monitor_enter(this);
                try {
                    this.aj = v0_1;
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable v0_2) {
                    goto label_44;
                }
            }

            __monitor_enter(this);
            try {
                this.an = (this.an + v0) % this.ae;
                __monitor_exit(this);
            }
            catch(Throwable v0_2) {
                goto label_36;
            }
        }
        while(!this.an());

        return;
        try {
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_44;
        }

        throw v0_2;
        try {
        label_36:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_36;
        }

        throw v0_2;
    }

    void au(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    void av(byte[] arg4, int arg5, int arg6) throws IOException {
        if(arg6 >= 0 && arg5 >= 0 && arg5 + arg6 <= arg4.length) {
            __monitor_enter(this);
            try {
                if(this.aj == null) {
                    int v0 = this.an <= this.ap ? this.ae - this.ap + this.an - 1 : this.an - this.ap - 1;
                    if(v0 >= arg6) {
                        if(this.ap + arg6 <= this.ae) {
                            System.arraycopy(arg4, arg5, this.ar, this.ap, arg6);
                        }
                        else {
                            v0 = this.ae - this.ap;
                            System.arraycopy(arg4, arg5, this.ar, this.ap, v0);
                            System.arraycopy(arg4, arg5 + v0, this.ar, 0, arg6 - v0);
                        }

                        this.ap = (this.ap + arg6) % this.ae;
                        this.notifyAll();
                        __monitor_exit(this);
                        return;
                    }

                    throw new IOException("");
                }
                else {
                    throw new IOException(this.aj.toString());
                label_60:
                    __monitor_exit(this);
                    goto label_61;
                }

                goto label_62;
            }
            catch(Throwable v4) {
                goto label_60;
            }

        label_61:
            throw v4;
        }

    label_62:
        throw new IOException();
    }

    public void ax() {
        do {
            int v0 = this.ap();
            if(v0 == -1) {
                return;
            }

            try {
                if(this.an + v0 <= this.ae) {
                    this.al.write(this.ar, this.an, v0);
                }
                else {
                    int v1 = this.ae - this.an;
                    this.al.write(this.ar, this.an, v1);
                    this.al.write(this.ar, 0, v0 - v1);
                }
            }
            catch(IOException v0_1) {
                __monitor_enter(this);
                try {
                    this.aj = v0_1;
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable v0_2) {
                    goto label_44;
                }
            }

            __monitor_enter(this);
            try {
                this.an = (this.an + v0) % this.ae;
                __monitor_exit(this);
            }
            catch(Throwable v0_2) {
                goto label_36;
            }
        }
        while(!this.an());

        return;
        try {
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_44;
        }

        throw v0_2;
        try {
        label_36:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_36;
        }

        throw v0_2;
    }

    void az() {
        __monitor_enter(this);
        try {
            this.ad = true;
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
            this.ax.join();
            return;
        }
        catch(InterruptedException ) {
            return;
        }
    }

    public void run() {
        do {
            int v0 = this.ap();
            if(v0 == -1) {
                return;
            }

            try {
                if(this.an + v0 <= this.ae) {
                    this.al.write(this.ar, this.an, v0);
                }
                else {
                    int v1 = this.ae - this.an;
                    this.al.write(this.ar, this.an, v1);
                    this.al.write(this.ar, 0, v0 - v1);
                }
            }
            catch(IOException v0_1) {
                __monitor_enter(this);
                try {
                    this.aj = v0_1;
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable v0_2) {
                    goto label_44;
                }
            }

            __monitor_enter(this);
            try {
                this.an = (this.an + v0) % this.ae;
                __monitor_exit(this);
            }
            catch(Throwable v0_2) {
                goto label_36;
            }
        }
        while(!this.an());

        return;
        try {
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_44;
        }

        throw v0_2;
        try {
        label_36:
            __monitor_exit(this);
        }
        catch(Throwable v0_2) {
            goto label_36;
        }

        throw v0_2;
    }
}

