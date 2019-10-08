import java.io.IOException;
import java.net.Socket;

public class mp extends mz {
    mn ae;
    mw al;
    Socket ax;

    mp(Socket arg2, int arg3, int arg4) throws IOException {
        super();
        this.ax = arg2;
        this.ax.setSoTimeout(30000);
        this.ax.setTcpNoDelay(true);
        this.ax.setReceiveBufferSize(0x10000);
        this.ax.setSendBufferSize(0x10000);
        this.al = new mw(this.ax.getInputStream(), arg3);
        this.ae = new mn(this.ax.getOutputStream(), arg4);
    }

    public void aa() {
        this.ae.ad();
        try {
            this.ax.close();
            goto label_4;
        }
        catch(IOException ) {
        label_4:
            this.al.ab();
            return;
        }
    }

    public boolean ad(int arg2) throws IOException {
        return this.al.ap(arg2);
    }

    public void af(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ae.aj(arg2, arg3, arg4);
    }

    public int ag() throws IOException {
        return this.al.ad();
    }

    public int ah() throws IOException {
        return this.al.ad();
    }

    public void ai() {
        this.ae.ad();
        try {
            this.ax.close();
            goto label_4;
        }
        catch(IOException ) {
        label_4:
            this.al.ab();
            return;
        }
    }

    public int aj() throws IOException {
        return this.al.aj();
    }

    protected void ajo() {
        this.an();
    }

    protected void ajs() {
        this.an();
    }

    public int am() throws IOException {
        return this.al.ad();
    }

    public void an() {
        this.ae.ad();
        try {
            this.ax.close();
            goto label_4;
        }
        catch(IOException ) {
        label_4:
            this.al.ab();
            return;
        }
    }

    public boolean ao(int arg2) throws IOException {
        return this.al.ap(arg2);
    }

    public int ap() throws IOException {
        return this.al.ad();
    }

    public int aq(byte[] arg2, int arg3, int arg4) throws IOException {
        return this.al.aq(arg2, arg3, arg4);
    }

    public int as(byte[] arg2, int arg3, int arg4) throws IOException {
        return this.al.aq(arg2, arg3, arg4);
    }

    public int at() throws IOException {
        return this.al.aj();
    }

    public int au() throws IOException {
        return this.al.ad();
    }

    public void av() {
        this.ae.ad();
        try {
            this.ax.close();
            goto label_4;
        }
        catch(IOException ) {
        label_4:
            this.al.ab();
            return;
        }
    }

    public boolean aw(int arg2) throws IOException {
        return this.al.ap(arg2);
    }

    public int ay() throws IOException {
        return this.al.aj();
    }

    public int az() throws IOException {
        return this.al.ad();
    }

    public void ba(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ae.aj(arg2, arg3, arg4);
    }

    public void bd(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ae.aj(arg2, arg3, arg4);
    }

    public void bf(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ae.aj(arg2, arg3, arg4);
    }

    public void bn(byte[] arg2, int arg3, int arg4) throws IOException {
        this.ae.aj(arg2, arg3, arg4);
    }

    protected void finalize() {
        this.an();
    }
}

