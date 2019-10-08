import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;

public class py extends RuntimeException {
    public static int ae;
    Throwable aj;
    public static String al;
    public static int an;
    String ap;
    public static short[] aq;

    py(Throwable arg2, String arg3) {
        try {
            super();
            this.ap = arg3;
            this.aj = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("py.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static String ab(Throwable arg8) throws IOException {
        String v0_1;
        if((arg8 instanceof py)) {
            v0_1 = ((py)arg8).ap + " | ";
            arg8 = ((py)arg8).aj;
        }
        else {
            v0_1 = "";
        }

        StringWriter v1 = new StringWriter();
        PrintWriter v2 = new PrintWriter(((Writer)v1));
        arg8.printStackTrace(v2);
        v2.close();
        BufferedReader v1_1 = new BufferedReader(new StringReader(v1.toString()));
        String v8 = v1_1.readLine();
        while(true) {
            String v2_1 = v1_1.readLine();
            if(v2_1 == null) {
                break;
            }

            int v3 = v2_1.indexOf(40);
            int v5 = v3 + 1;
            int v4 = v2_1.indexOf(41, v5);
            char v6 = ' ';
            if(v3 >= 0 && v4 >= 0) {
                String v4_1 = v2_1.substring(v5, v4);
                v5 = v4_1.indexOf(".java:");
                if(v5 >= 0) {
                    v2_1 = v4_1.substring(0, v5) + v4_1.substring(v5 + 5);
                    v0_1 = v0_1 + v2_1 + v6;
                    continue;
                }
                else {
                    v2_1 = v2_1.substring(0, v3);
                }
            }

            v2_1 = v2_1.trim();
            v2_1 = v2_1.substring(v2_1.lastIndexOf(v6) + 1);
            v2_1 = v2_1.substring(v2_1.lastIndexOf(9) + 1);
            v0_1 = v0_1 + v2_1 + v6;
        }

        return v0_1 + "| " + v8;
    }

    public static py ad(Throwable arg2, String arg3) {
        py v2;
        if((arg2 instanceof py)) {
            ((py)arg2).ap = ((py)arg2).ap + '氊' + arg3;
        }
        else {
            v2 = new py(arg2, arg3);
        }

        return ((Throwable)v2);
    }

    public Throwable af() {
        return this.aj;
    }

    public Throwable ai() {
        return this.aj;
    }

    public static py aj(Throwable arg2, String arg3) {
        py v2;
        if((arg2 instanceof py)) {
            ((py)arg2).ap = ((py)arg2).ap + ' ' + arg3;
        }
        else {
            v2 = new py(arg2, arg3);
        }

        return ((Throwable)v2);
    }

    public static void an(String arg4, Throwable arg5) {
        try {
            String v0 = "";
            if(arg5 != null) {
                v0 = fd.ae(arg5, 0xC865D85B);
            }

            if(arg4 != null) {
                if(arg5 != null) {
                    v0 = v0 + " | ";
                }

                v0 = v0 + arg4;
            }

            PrintStream v4 = System.out;
            v4.println("Error: " + v0);
            arg4 = v0.replace(':', '.').replace('櫽', 'ᝐ').replace('&', 'Ϙ').replace('#', '_');
            if(jw.ax == null) {
                return;
            }

            URL v0_1 = jw.ax;
            StringBuilder v1 = new StringBuilder();
            v1.append("clienterror.ws?cv=");
            v1.append(py.ae * -1800627704);
            v1.append("&cs=");
            v1.append(oi.ar * 1024930621);
            v1.append("&u=");
            v1.append(py.al);
            v1.append("&v1=");
            v1.append(mq.ax);
            v1.append("&v2=");
            v1.append(mq.al);
            v1.append("&e=");
            v1.append(arg4);
            v1.append("&ct=");
            v1.append(py.an * 0xB96221BB);
            v1.append("&e=");
            v1.append(arg4);
            DataInputStream v4_1 = new DataInputStream(new URL(v0_1, v1.toString()).openStream());
            v4_1.read();
            v4_1.close();
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public static void ap(String arg4, Throwable arg5) {
        try {
            String v0 = "";
            if(arg5 != null) {
                v0 = fd.ae(arg5, 0xC865D85B);
            }

            if(arg4 != null) {
                if(arg5 != null) {
                    v0 = v0 + " | ";
                }

                v0 = v0 + arg4;
            }

            PrintStream v4 = System.out;
            v4.println("Error: " + v0);
            arg4 = v0.replace(':', '瞮').replace('ħ', '眘').replace('뗿', '_').replace('Ộ', '뾐');
            if(jw.ax == null) {
                return;
            }

            URL v0_1 = jw.ax;
            StringBuilder v1 = new StringBuilder();
            v1.append("clienterror.ws?cv=");
            v1.append(py.ae * 0x28B4BF21);
            v1.append("&cs=");
            v1.append(oi.ar * -575091141);
            v1.append("&u=");
            v1.append(py.al);
            v1.append("&v1=");
            v1.append(mq.ax);
            v1.append("&v2=");
            v1.append(mq.al);
            v1.append("&e=");
            v1.append(arg4);
            v1.append("&ct=");
            v1.append(py.an * 0xB96221BB);
            v1.append("&e=");
            v1.append(arg4);
            DataInputStream v4_1 = new DataInputStream(new URL(v0_1, v1.toString()).openStream());
            v4_1.read();
            v4_1.close();
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public static py aq(Throwable arg2, String arg3) {
        py v2;
        if((arg2 instanceof py)) {
            ((py)arg2).ap = ((py)arg2).ap + ' ' + arg3;
        }
        else {
            v2 = new py(arg2, arg3);
        }

        return ((Throwable)v2);
    }

    public Throwable ar(byte arg3) {
        try {
            return this.aj;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("py.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

