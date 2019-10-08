import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.URL;

public class po {
    public static final int ad = 7;
    public static final int ae = 2;
    public static final int af = 10;
    public static final int al = 1;
    public static final int an = 4;
    public static final int aq = 8;
    public static final int ar = 3;
    public static final int as = 26;
    public static final int au = 17;
    public static final int ax = 13;
    public static final int ay = 23;
    public static final int ba = 34;
    public static final int bm = 57;

    po() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("po.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ax(String arg3, Throwable arg4, int arg5) {
        try {
            String v5 = "";
            if(arg4 != null) {
                v5 = fd.ae(arg4, 0xC865D85B);
            }

            if(arg3 != null) {
                if(arg4 != null) {
                    v5 = v5 + " | ";
                }

                v5 = v5 + arg3;
            }

            PrintStream v3_1 = System.out;
            v3_1.println("Error: " + v5);
            arg3 = v5.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if(jw.ax == null) {
                return;
            }

            URL v5_1 = jw.ax;
            StringBuilder v0 = new StringBuilder();
            v0.append("clienterror.ws?cv=");
            v0.append(py.ae * 0x28B4BF21);
            v0.append("&cs=");
            v0.append(oi.ar * 1024930621);
            v0.append("&u=");
            v0.append(py.al);
            v0.append("&v1=");
            v0.append(mq.ax);
            v0.append("&v2=");
            v0.append(mq.al);
            v0.append("&e=");
            v0.append(arg3);
            v0.append("&ct=");
            v0.append(py.an * 0xB96221BB);
            v0.append("&e=");
            v0.append(arg3);
            DataInputStream v3_2 = new DataInputStream(new URL(v5_1, v0.toString()).openStream());
            v3_2.read();
            v3_2.close();
            return;
        }
        catch(Exception ) {
            return;
        }
        catch(RuntimeException v3) {
            v4 = new StringBuilder();
            v4.append("po.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

