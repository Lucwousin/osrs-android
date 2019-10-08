import java.io.File;
import java.io.RandomAccessFile;
import java.math.BigInteger;

public class in {
    static ef ai = null;
    static final BigInteger al = null;
    static final BigInteger ax = null;
    static final int ss = 5;

    static {
        in.ax = new BigInteger("10001", 16);
        in.al = new BigInteger("8f0403bf514c81af14c316746140fce2adde9bc8938aad5330627779354ad7636317554882b0eb2a876ec06725f17d24ee9f6070723de80aa079bce985005ef8d9191a8330e8416d8b2042d8da5943154982b4a10b782b7d5548f5624dad1e3ba6dd4658a55832be345f8e6ce962562e5ee5a983579acbece4b751b3adb8480d", 16);
    }

    in() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("in.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static File al(String arg4, int arg5) {
        RandomAccessFile v1;
        RandomAccessFile v0;
        File v5_1;
        try {
            if(!my.ax) {
                goto label_38;
            }

            Object v5 = my.ae.get(arg4);
            if(v5 != null) {
                return ((File)v5);
            }

            v5_1 = new File(my.al, arg4);
            v0 = null;
        }
        catch(RuntimeException v4) {
            goto label_44;
        }

        try {
            if(!new File(v5_1.getParent()).exists()) {
                goto label_29;
            }

            v1 = new RandomAccessFile(v5_1, "rw");
        }
        catch(Exception ) {
            goto label_33;
        }
        catch(RuntimeException v4) {
            goto label_44;
        }

        try {
            int v0_1 = v1.read();
            v1.seek(0);
            v1.write(v0_1);
            v1.seek(0);
            v1.close();
            my.ae.put(arg4, v5_1);
            return v5_1;
        }
        catch(RuntimeException v4) {
        }
        catch(Exception ) {
            v0 = v1;
            goto label_33;
            try {
            label_29:
                throw new RuntimeException("");
            }
            catch(RuntimeException v4) {
            }
            catch(Exception ) {
            label_33:
                if(v0 != null) {
                    try {
                        v0.close();
                        goto label_35;
                    }
                    catch(RuntimeException v4) {
                    }
                    catch(Exception ) {
                        try {
                        label_35:
                            throw new RuntimeException();
                        label_38:
                            throw new RuntimeException("");
                        }
                        catch(RuntimeException v4) {
                        label_44:
                            StringBuilder v5_2 = new StringBuilder();
                            v5_2.append("in.al(");
                            v5_2.append(')');
                            throw lx.al(((Throwable)v4), v5_2.toString());
                        }
                    }
                }

                goto label_35;
            }
        }
    }

    static gx fd(int arg1, int arg2, int arg3) {
        try {
            client.sd.ax = arg1 * 0x1CB51329;
            client.sd.al = arg2 * 80306533;
            client.sd.ae = 770640005;
            client.sd.ar = 0x5450DEB7;
            return client.sd;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("in.fd(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

