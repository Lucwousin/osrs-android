import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class my {
    static Hashtable ae = null;
    static File al = null;
    static boolean ax = false;
    public static final int bs = 49;

    static {
        my.ae = new Hashtable(16);
    }

    my() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("my.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static File ad(String arg5) {
        RandomAccessFile v2;
        if(my.ax) {
            Object v0 = my.ae.get(arg5);
            if(v0 != null) {
                return ((File)v0);
            }

            File v0_1 = new File(my.al, arg5);
            RandomAccessFile v1 = null;
            try {
                if(!new File(v0_1.getParent()).exists()) {
                    goto label_29;
                }

                v2 = new RandomAccessFile(v0_1, "rw");
            }
            catch(Exception ) {
                goto label_33;
            }

            try {
                int v1_1 = v2.read();
                v2.seek(0);
                v2.write(v1_1);
                v2.seek(0);
                v2.close();
                my.ae.put(arg5, v0_1);
                return v0_1;
            }
            catch(Exception ) {
                v1 = v2;
                goto label_33;
            }

            try {
            label_29:
                throw new RuntimeException("");
            }
            catch(Exception ) {
            label_33:
                if(v1 != null) {
                    try {
                        v1.close();
                        goto label_35;
                    }
                    catch(Exception ) {
                    label_35:
                        throw new RuntimeException();
                    }
                }

                goto label_35;
            }
        }

        throw new RuntimeException("");
    }

    static void ae(File arg1) {
        my.al = arg1;
        if(my.al.exists()) {
            my.ax = true;
            return;
        }

        throw new RuntimeException("");
    }

    static File aj(String arg5) {
        RandomAccessFile v2;
        if(my.ax) {
            Object v0 = my.ae.get(arg5);
            if(v0 != null) {
                return ((File)v0);
            }

            File v0_1 = new File(my.al, arg5);
            RandomAccessFile v1 = null;
            try {
                if(!new File(v0_1.getParent()).exists()) {
                    goto label_29;
                }

                v2 = new RandomAccessFile(v0_1, "rw");
            }
            catch(Exception ) {
                goto label_33;
            }

            try {
                int v1_1 = v2.read();
                v2.seek(0);
                v2.write(v1_1);
                v2.seek(0);
                v2.close();
                my.ae.put(arg5, v0_1);
                return v0_1;
            }
            catch(Exception ) {
                v1 = v2;
                goto label_33;
            }

            try {
            label_29:
                throw new RuntimeException("");
            }
            catch(Exception ) {
            label_33:
                if(v1 != null) {
                    try {
                        v1.close();
                        goto label_35;
                    }
                    catch(Exception ) {
                    label_35:
                        throw new RuntimeException();
                    }
                }

                goto label_35;
            }
        }

        throw new RuntimeException("");
    }

    static void an(File arg1) {
        my.al = arg1;
        if(my.al.exists()) {
            my.ax = true;
            return;
        }

        throw new RuntimeException("");
    }

    static File ap(String arg5) {
        RandomAccessFile v2;
        if(my.ax) {
            Object v0 = my.ae.get(arg5);
            if(v0 != null) {
                return ((File)v0);
            }

            File v0_1 = new File(my.al, arg5);
            RandomAccessFile v1 = null;
            try {
                if(!new File(v0_1.getParent()).exists()) {
                    goto label_29;
                }

                v2 = new RandomAccessFile(v0_1, "rw");
            }
            catch(Exception ) {
                goto label_33;
            }

            try {
                int v1_1 = v2.read();
                v2.seek(0);
                v2.write(v1_1);
                v2.seek(0);
                v2.close();
                my.ae.put(arg5, v0_1);
                return v0_1;
            }
            catch(Exception ) {
                v1 = v2;
                goto label_33;
            }

            try {
            label_29:
                throw new RuntimeException("");
            }
            catch(Exception ) {
            label_33:
                if(v1 != null) {
                    try {
                        v1.close();
                        goto label_35;
                    }
                    catch(Exception ) {
                    label_35:
                        throw new RuntimeException();
                    }
                }

                goto label_35;
            }
        }

        throw new RuntimeException("");
    }

    static File aq(String arg5) {
        RandomAccessFile v2;
        if(my.ax) {
            Object v0 = my.ae.get(arg5);
            if(v0 != null) {
                return ((File)v0);
            }

            File v0_1 = new File(my.al, arg5);
            RandomAccessFile v1 = null;
            try {
                if(!new File(v0_1.getParent()).exists()) {
                    goto label_29;
                }

                v2 = new RandomAccessFile(v0_1, "rw");
            }
            catch(Exception ) {
                goto label_33;
            }

            try {
                int v1_1 = v2.read();
                v2.seek(0);
                v2.write(v1_1);
                v2.seek(0);
                v2.close();
                my.ae.put(arg5, v0_1);
                return v0_1;
            }
            catch(Exception ) {
                v1 = v2;
                goto label_33;
            }

            try {
            label_29:
                throw new RuntimeException("");
            }
            catch(Exception ) {
            label_33:
                if(v1 != null) {
                    try {
                        v1.close();
                        goto label_35;
                    }
                    catch(Exception ) {
                    label_35:
                        throw new RuntimeException();
                    }
                }

                goto label_35;
            }
        }

        throw new RuntimeException("");
    }

    static void ar(File arg1) {
        my.al = arg1;
        if(my.al.exists()) {
            my.ax = true;
            return;
        }

        throw new RuntimeException("");
    }
}

