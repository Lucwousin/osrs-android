import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ic {
    static final fc ae;
    static final oc al;
    static int ar;
    static final Map ax;

    static {
        ic.ax = new HashMap();
        ic.al = new oc(0x400);
        ic.ae = new fc();
        ic.ar = 0;
    }

    ic() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ic.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void aa(int arg2, String arg3, String arg4) {
        ll.ae(arg2, arg3, arg4, null, 0xF8E5F008);
    }

    static ij ac(int arg3) {
        return ic.al.ax(((long)arg3));
    }

    static void ag(int arg9, String arg10, String arg11, String arg12) {
        ig v0_1;
        Object v0 = ic.ax.get(Integer.valueOf(arg9));
        if(v0 == null) {
            v0_1 = new ig();
            ic.ax.put(Integer.valueOf(arg9), v0_1);
        }

        ij v9 = v0_1.ax(arg9, arg10, arg11, arg12, 0x68F3C69F);
        ic.al.al(((mx)v9), ((long)(v9.ax * 220630269)));
        ic.ae.al(((mv)v9));
        client.mr = client.mg * 0xDE084D10;
    }

    static void ah(int arg9, String arg10, String arg11, String arg12) {
        ig v0_1;
        Object v0 = ic.ax.get(Integer.valueOf(arg9));
        if(v0 == null) {
            v0_1 = new ig();
            ic.ax.put(Integer.valueOf(arg9), v0_1);
        }

        ij v9 = v0_1.ax(arg9, arg10, arg11, arg12, 0x60B92D58);
        ic.al.al(((mx)v9), ((long)(v9.ax * 0x7D5124F1)));
        ic.ae.al(((mv)v9));
        client.mr = client.mg * 0x277F1449;
    }

    static ij ak(int arg3) {
        return ic.al.ax(((long)arg3));
    }

    static void am(int arg2, String arg3, String arg4) {
        ll.ae(arg2, arg3, arg4, null, 0xDE1C2C8F);
    }

    static ij ao(int arg3) {
        return ic.al.ax(((long)arg3));
    }

    static ij as(int arg3) {
        return ic.al.ax(((long)arg3));
    }

    static ij at(int arg1, int arg2) {
        return ic.ax.get(Integer.valueOf(arg1)).al(arg2, 1201769080);
    }

    static void au(int arg2, String arg3, String arg4) {
        ll.ae(arg2, arg3, arg4, null, 0xEA2064F);
    }

    static int av() {
        int v0 = ic.ar - 0x6EA9A347;
        ic.ar = v0;
        return v0 * -947590775 - 1;
    }

    static ij aw(int arg1, int arg2) {
        return ic.ax.get(Integer.valueOf(arg1)).al(arg2, 1201769080);
    }

    static ij ay(int arg1, int arg2) {
        return ic.ax.get(Integer.valueOf(arg1)).al(arg2, 1201769080);
    }

    static void az(int arg2, String arg3, String arg4) {
        ll.ae(arg2, arg3, arg4, null, 0x17808810);
    }

    static int ba(int arg1) {
        Object v1 = ic.ax.get(Integer.valueOf(arg1));
        if(v1 == null) {
            return 0;
        }

        return ((ig)v1).ae(0xE05ABD1A);
    }

    static String bb() {
        String v0 = "";
        Iterator v1 = ic.al.iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            v0 = v0 + ((ij)v2).ar + ':' + ((ij)v2).aq + '\n';
        }

        return v0;
    }

    static int bd(int arg1) {
        Object v1 = ic.ax.get(Integer.valueOf(arg1));
        if(v1 == null) {
            return 0;
        }

        return ((ig)v1).ae(0xD4036D7E);
    }

    static void bf() {
        ic.ax.clear();
        ic.al.ae();
        ic.ae.ax();
        ic.ar = 0;
    }

    static int bg(int arg3) {
        mx v3 = ic.al.ax(((long)arg3));
        int v0 = -1;
        if(v3 == null) {
            return v0;
        }

        if(((ij)v3).dn == ic.ae.ax) {
            return v0;
        }

        return ((ij)v3).dn.ax * 0x7D5124F1;
    }

    static String bh() {
        String v0 = "";
        Iterator v1 = ic.al.iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            v0 = v0 + ((ij)v2).ar + ':' + ((ij)v2).aq + '\n';
        }

        return v0;
    }

    static void bn() {
        ic.ax.clear();
        ic.al.ae();
        ic.ae.ax();
        ic.ar = 0;
    }

    static void bo() {
        Iterator v0 = ic.al.iterator();
        while(v0.hasNext()) {
            v0.next().al(85);
        }
    }

    static void bp() {
        ic.ax.clear();
        ic.al.ae();
        ic.ae.ax();
        ic.ar = 0;
    }

    static int bq(int arg3) {
        mx v3 = ic.al.ax(((long)arg3));
        int v0 = -1;
        if(v3 == null) {
            return v0;
        }

        if(((ij)v3).dn == ic.ae.ax) {
            return v0;
        }

        return ((ij)v3).dn.ax * 0x7D5124F1;
    }

    static void bt() {
        Iterator v0 = ic.al.iterator();
        while(v0.hasNext()) {
            v0.next().an(0x69D5B9A5);
        }
    }

    static void bv() {
        Iterator v0 = ic.al.iterator();
        while(v0.hasNext()) {
            v0.next().an(0x7530E54A);
        }
    }

    static void bw() {
        Iterator v0 = ic.al.iterator();
        while(v0.hasNext()) {
            v0.next().al(104);
        }
    }

    static int bx(int arg3) {
        mx v3 = ic.al.ax(((long)arg3));
        int v0 = -1;
        if(v3 == null) {
            return v0;
        }

        if(((ij)v3).dn == ic.ae.ax) {
            return v0;
        }

        return ((ij)v3).dn.ax * 0x7D5124F1;
    }

    static void by() {
        Iterator v0 = ic.al.iterator();
        while(v0.hasNext()) {
            v0.next().al(0x76);
        }
    }

    static int bz(int arg3) {
        mx v3 = ic.al.ax(((long)arg3));
        int v0 = -1;
        if(v3 == null) {
            return v0;
        }

        if(ic.ae.ax == ((ij)v3).dr) {
            return v0;
        }

        return ((ij)v3).dr.ax * 0x7D5124F1;
    }
}

