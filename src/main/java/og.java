import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class og {
    long ae;
    final long al;
    RandomAccessFile ax;

    public og(File arg3, String arg4, long arg5) throws IOException {
        try {
            super();
            if(-1 == arg5) {
                arg5 = 0x7FFFFFFFFFFFFFFFL;
            }

            if(arg3.length() > arg5) {
                arg3.delete();
            }

            this.ax = new RandomAccessFile(arg3, arg4);
            this.al = arg5 * -1029418435015067753L;
            arg5 = 0;
            this.ae = arg5;
            int v3_1 = this.ax.read();
            if(v3_1 != -1 && !arg4.equals("r")) {
                this.ax.seek(arg5);
                this.ax.write(v3_1);
            }

            this.ax.seek(arg5);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("og.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final long aa() throws IOException {
        return this.ax.length();
    }

    public final void ab(byte[] arg9, int arg10, int arg11) throws IOException {
        long v0 = ((long)arg11);
        long v6 = 0x138E9FB1BBC5B827L;
        if(this.ae * -8713271955237392511L + v0 <= this.al * v6) {
            this.ax.write(arg9, arg10, arg11);
            this.ae += v0 * 0x7CE65E575CBC9081L;
            return;
        }

        this.ax.seek(this.al * v6);
        this.ax.write(1);
        throw new EOFException();
    }

    final void ad(long arg3) throws IOException {
        this.ax.seek(arg3);
        this.ae = arg3 * 0x7CE65E575CBC9081L;
    }

    public final void ae(int arg3) throws IOException {
        int v0 = 0x51D0DCFF;
        try {
            this.ar(false, v0);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("og.ae(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public final void af() throws IOException {
        this.ar(false, 0x7DAA5A3F);
    }

    public final int ag(byte[] arg5, int arg6, int arg7) throws IOException {
        int v5 = this.ax.read(arg5, arg6, arg7);
        if(v5 > 0) {
            this.ae += (((long)v5)) * 0x7CE65E575CBC9081L;
        }

        return v5;
    }

    public final void ai() throws IOException {
        this.ar(false, 0x2EFF97A1);
    }

    final void aj(long arg3) throws IOException {
        this.ax.seek(arg3);
        this.ae = arg3 * 0x7CE65E575CBC9081L;
    }

    protected void ajo() throws Throwable {
        if(this.ax != null) {
            System.out.println("");
            this.ae(1460905938);
        }
    }

    protected void ajs() throws Throwable {
        if(this.ax != null) {
            System.out.println("");
            this.ae(0x736903F6);
        }
    }

    public final void al(byte[] arg9, int arg10, int arg11, int arg12) throws IOException {
        long v0 = ((long)arg11);
        long v2 = -8713271955237392511L;
        try {
            long v6 = 0x138E9FB1BBC5B827L;
            if(this.ae * v2 + v0 <= this.al * v6) {
                this.ax.write(arg9, arg10, arg11);
                this.ae += v0 * 0x7CE65E575CBC9081L;
                return;
            }

            this.ax.seek(this.al * v6);
            this.ax.write(1);
            throw new EOFException();
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("og.al(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public final int am(byte[] arg5, int arg6, int arg7) throws IOException {
        int v5 = this.ax.read(arg5, arg6, arg7);
        if(v5 > 0) {
            this.ae += (((long)v5)) * 0x7CE65E575CBC9081L;
        }

        return v5;
    }

    public final long an(int arg3) throws IOException {
        try {
            return this.ax.length();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("og.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final int ap(byte[] arg5, int arg6, int arg7, int arg8) throws IOException {
        int v5_1;
        try {
            v5_1 = this.ax.read(arg5, arg6, arg7);
            if(v5_1 > 0) {
                this.ae += (((long)v5_1)) * 0x7CE65E575CBC9081L;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("og.ap(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return v5_1;
    }

    public final void aq(byte[] arg9, int arg10, int arg11) throws IOException {
        long v0 = ((long)arg11);
        long v6 = 0x138E9FB1BBC5B827L;
        if(this.ae * -8713271955237392511L + v0 <= this.al * v6) {
            this.ax.write(arg9, arg10, arg11);
            this.ae += v0 * 0x7CE65E575CBC9081L;
            return;
        }

        this.ax.seek(this.al * v6);
        this.ax.write(1);
        throw new EOFException();
    }

    public final void ar(boolean arg2, int arg3) throws IOException {
        try {
            if(this.ax != null) {
                goto label_2;
            }

            return;
        }
        catch(RuntimeException v2) {
            goto label_13;
        }

    label_2:
        if(arg2) {
            try {
                this.ax.getFD().sync();
                goto label_6;
            }
            catch(RuntimeException v2) {
            }
            catch(SyncFailedException ) {
                try {
                label_6:
                    this.ax.close();
                    this.ax = null;
                    return;
                }
                catch(RuntimeException v2) {
                label_13:
                    StringBuilder v3 = new StringBuilder();
                    v3.append("og.ar(");
                    v3.append(')');
                    throw lx.al(((Throwable)v2), v3.toString());
                }
            }
        }

        goto label_6;
    }

    public final long au() throws IOException {
        return this.ax.length();
    }

    public final void av(boolean arg2) throws IOException {
        if(this.ax != null) {
            if(arg2) {
                try {
                    this.ax.getFD().sync();
                    goto label_6;
                }
                catch(SyncFailedException ) {
                label_6:
                    this.ax.close();
                    this.ax = null;
                    return;
                }
            }

            goto label_6;
        }
    }

    final void ax(long arg3) throws IOException {
        try {
            this.ax.seek(arg3);
            this.ae = arg3 * 0x7CE65E575CBC9081L;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("og.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final int az(byte[] arg5, int arg6, int arg7) throws IOException {
        int v5 = this.ax.read(arg5, arg6, arg7);
        if(v5 > 0) {
            this.ae += (((long)v5)) * 0x7CE65E575CBC9081L;
        }

        return v5;
    }

    protected void finalize() throws Throwable {
        try {
            if(this.ax != null) {
                System.out.println("");
                this.ae(0x46969860);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("og.finalize(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

