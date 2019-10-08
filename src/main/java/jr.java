import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class jr {
    jn ae;
    je al;
    final List an;
    List ap;
    public static final int aq = 76;
    final jt ar;
    URL ax;

    public jr(URL arg3) {
        try {
            super();
            this.ar = new jt("universal");
            this.an = new LinkedList();
            this.ap = new LinkedList();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jr.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aa(String arg6, jt arg7) {
        int v0 = arg6.indexOf(61);
        if(v0 != -1) {
            int v1 = 0;
            String v2 = arg6.substring(0, v0).trim().toLowerCase();
            StringBuilder v3 = new StringBuilder(arg6.substring(v0 + 1).trim());
            while(true) {
                int v6 = v3.indexOf("\\\\", v1);
                v0 = v3.indexOf("\\n", v1);
                if(v6 < 0 && v0 < 0) {
                    if(v2.startsWith("lang")) {
                        v6 = 4;
                        try {
                            this.ap.add(new jp(Integer.parseInt(v2.substring(v6)), v3.toString()));
                            goto label_30;
                        }
                        catch(NumberFormatException ) {
                        label_30:
                            arg7.ae.put(v2, v3.toString());
                            return;
                        }
                    }

                    goto label_30;
                }

                if(v6 >= 0 && (v0 < 0 || v0 >= v6)) {
                    v3.replace(v6, v6 + 2, "\\");
                    v1 = v6 + 1;
                    continue;
                }

                v3.replace(v0, v0 + 2, "\n");
                v1 = v0 + 1;
            }
        }
    }

    void ab(String arg3, jt arg4) {
        int v0 = arg3.indexOf(61);
        if(v0 != -1) {
            arg4.al.put(arg3.substring(0, v0).trim(), arg3.substring(v0 + 1).trim());
        }
    }

    public boolean ad(int arg8) {
        if(this.al == null) {
            this.al = new je();
            mt.ax(arg8, this.ar.ae, 1983610013);
        }

        je v8 = null;
        try {
            if(this.ax != null) {
                if(this.ae == null) {
                    this.ae = this.al.an(this.ax, 379054440);
                }
                else if(this.ae.al(0x6EE0BDA6)) {
                    no v3 = new no(new String(this.ae.ae(0xE4D30573), "CP1252").split("[\\r\\n]+"));
                    jt v1 = this.ar;
                    while(true) {
                        String[] v4 = v3.al(-1649706116);
                        if(v4 != null) {
                            if(v4[0].equals("param")) {
                                this.al(v4[1], v1, 0x7D);
                            }
                            else if(v4[0].equals("msg")) {
                                this.ae(v4[1], v1, 0xFC907785);
                            }
                            else {
                                this.ar(v4, v1, 0xFF7A679F);
                            }

                            continue;
                        }
                        else {
                            String v1_1 = v3.ax(1132075609);
                            if(v1_1 != null) {
                                jt v4_1 = new jt(v1_1);
                                this.an.add(v4_1);
                                v1 = v4_1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        return 0;
                    }

                    this.al.aj(17);
                    this.al = v8;
                    return 1;
                }

                return 0;
            }

            throw new Exception();
        }
        catch(Exception ) {
            if(this.al != null) {
                this.al.aj(120);
                this.al = v8;
            }

            return 1;
        }
    }

    void ae(String arg5, jt arg6, int arg7) {
        int v5_1;
        StringBuilder v2;
        String v1;
        int v0;
        arg7 = 61;
        try {
            arg7 = arg5.indexOf(arg7);
            if(arg7 != -1) {
                v0 = 0;
                v1 = arg5.substring(0, arg7).trim().toLowerCase();
                v2 = new StringBuilder(arg5.substring(arg7 + 1).trim());
                while(true) {
                label_13:
                    v5_1 = v2.indexOf("\\\\", v0);
                    arg7 = v2.indexOf("\\n", v0);
                    if(v5_1 < 0 && arg7 < 0) {
                        if(v1.startsWith("lang")) {
                            goto label_22;
                        }

                        goto label_30;
                    }

                    goto label_34;
                }
            }

            return;
        }
        catch(RuntimeException v5) {
            goto label_53;
        }

    label_22:
        v5_1 = 4;
        try {
            this.ap.add(new jp(Integer.parseInt(v1.substring(v5_1)), v2.toString()));
            goto label_30;
        }
        catch(NumberFormatException ) {
        label_30:
            arg6.ae.put(v1, v2.toString());
            return;
        }

    label_34:
        if(v5_1 >= 0 && (arg7 < 0 || arg7 >= v5_1)) {
            v2.replace(v5_1, v5_1 + 2, "\\");
            v0 = v5_1 + 1;
            goto label_13;
        }

        v2.replace(arg7, arg7 + 2, "\n");
        v0 = arg7 + 1;
        goto label_13;
    label_53:
        StringBuilder v6 = new StringBuilder();
        v6.append("jr.ae(");
        v6.append(')');
        throw lx.al(((Throwable)v5), v6.toString());
    }

    void af(String arg3, jt arg4) {
        int v0 = arg3.indexOf(61);
        if(v0 != -1) {
            arg4.al.put(arg3.substring(0, v0).trim(), arg3.substring(v0 + 1).trim());
        }
    }

    void ag(String[] arg3, jt arg4) {
        arg4.ax.put(arg3[0], arg3[1]);
    }

    public jt ah() {
        return this.ar;
    }

    void ai(String arg3, jt arg4) {
        int v0 = arg3.indexOf(61);
        if(v0 != -1) {
            arg4.al.put(arg3.substring(0, v0).trim(), arg3.substring(v0 + 1).trim());
        }
    }

    public boolean aj(int arg8) {
        if(this.al == null) {
            this.al = new je();
            mt.ax(arg8, this.ar.ae, 0x6E44847C);
        }

        je v8 = null;
        try {
            if(this.ax != null) {
                if(this.ae == null) {
                    this.ae = this.al.an(this.ax, 0x2DCD24FB);
                }
                else if(this.ae.al(1741010730)) {
                    no v3 = new no(new String(this.ae.ae(0xE4D30573), "CP1252").split("[\\r\\n]+"));
                    jt v1 = this.ar;
                    while(true) {
                        String[] v4 = v3.al(0xE9FA8C07);
                        if(v4 != null) {
                            if(v4[0].equals("param")) {
                                this.al(v4[1], v1, 23);
                            }
                            else if(v4[0].equals("msg")) {
                                this.ae(v4[1], v1, 0xFC907785);
                            }
                            else {
                                this.ar(v4, v1, 0x69104086);
                            }

                            continue;
                        }
                        else {
                            String v1_1 = v3.ax(501763000);
                            if(v1_1 != null) {
                                jt v4_1 = new jt(v1_1);
                                this.an.add(v4_1);
                                v1 = v4_1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        return 0;
                    }

                    this.al.aj(78);
                    this.al = v8;
                    return 1;
                }

                return 0;
            }

            throw new Exception();
        }
        catch(Exception ) {
            if(this.al != null) {
                this.al.aj(29);
                this.al = v8;
            }

            return 1;
        }
    }

    void al(String arg2, jt arg3, byte arg4) {
        int v4 = 61;
        try {
            v4 = arg2.indexOf(v4);
            if(v4 != -1) {
                arg3.al.put(arg2.substring(0, v4).trim(), arg2.substring(v4 + 1).trim());
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jr.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void am(String[] arg3, jt arg4) {
        arg4.ax.put(arg3[0], arg3[1]);
    }

    public jt an(byte arg3) {
        try {
            return this.ar;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jr.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public URL ao() {
        return this.ax;
    }

    public URL ap(int arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jr.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean aq(int arg8) {
        if(this.al == null) {
            this.al = new je();
            mt.ax(arg8, this.ar.ae, 0x5FAFD1A1);
        }

        je v8 = null;
        try {
            if(this.ax != null) {
                if(this.ae == null) {
                    this.ae = this.al.an(this.ax, 0x572FAD8C);
                }
                else if(this.ae.al(0x7039C56C)) {
                    no v3 = new no(new String(this.ae.ae(0xE4D30573), "CP1252").split("[\\r\\n]+"));
                    jt v1 = this.ar;
                    while(true) {
                        String[] v4 = v3.al(0x5991D023);
                        if(v4 != null) {
                            if(v4[0].equals("param")) {
                                this.al(v4[1], v1, 0x40);
                            }
                            else if(v4[0].equals("msg")) {
                                this.ae(v4[1], v1, 0xFC907785);
                            }
                            else {
                                this.ar(v4, v1, 0x197685A3);
                            }

                            continue;
                        }
                        else {
                            String v1_1 = v3.ax(0x2602A2E6);
                            if(v1_1 != null) {
                                jt v4_1 = new jt(v1_1);
                                this.an.add(v4_1);
                                v1 = v4_1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        return 0;
                    }

                    this.al.aj(78);
                    this.al = v8;
                    return 1;
                }

                return 0;
            }

            throw new Exception();
        }
        catch(Exception ) {
            if(this.al != null) {
                this.al.aj(0x76);
                this.al = v8;
            }

            return 1;
        }
    }

    void ar(String[] arg2, jt arg3, int arg4) {
        try {
            arg3.ax.put(arg2[0], arg2[1]);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jr.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public URL as() {
        return this.ax;
    }

    public jt at() {
        return this.ar;
    }

    void au(String arg6, jt arg7) {
        int v0 = arg6.indexOf(61);
        if(v0 != -1) {
            int v1 = 0;
            String v2 = arg6.substring(0, v0).trim().toLowerCase();
            StringBuilder v3 = new StringBuilder(arg6.substring(v0 + 1).trim());
            while(true) {
                int v6 = v3.indexOf("\\\\", v1);
                v0 = v3.indexOf("\\n", v1);
                if(v6 < 0 && v0 < 0) {
                    if(v2.startsWith("lang")) {
                        v6 = 4;
                        try {
                            this.ap.add(new jp(Integer.parseInt(v2.substring(v6)), v3.toString()));
                            goto label_30;
                        }
                        catch(NumberFormatException ) {
                        label_30:
                            arg7.ae.put(v2, v3.toString());
                            return;
                        }
                    }

                    goto label_30;
                }

                if(v6 >= 0 && (v0 < 0 || v0 >= v6)) {
                    v3.replace(v6, v6 + 2, "\\");
                    v1 = v6 + 1;
                    continue;
                }

                v3.replace(v0, v0 + 2, "\n");
                v1 = v0 + 1;
            }
        }
    }

    void av(String arg6, jt arg7) {
        int v0 = arg6.indexOf(61);
        if(v0 != -1) {
            int v1 = 0;
            String v2 = arg6.substring(0, v0).trim().toLowerCase();
            StringBuilder v3 = new StringBuilder(arg6.substring(v0 + 1).trim());
            while(true) {
                int v6 = v3.indexOf("\\\\", v1);
                v0 = v3.indexOf("\\n", v1);
                if(v6 < 0 && v0 < 0) {
                    if(v2.startsWith("lang")) {
                        v6 = 4;
                        try {
                            this.ap.add(new jp(Integer.parseInt(v2.substring(v6)), v3.toString()));
                            goto label_30;
                        }
                        catch(NumberFormatException ) {
                        label_30:
                            arg7.ae.put(v2, v3.toString());
                            return;
                        }
                    }

                    goto label_30;
                }

                if(v6 >= 0 && (v0 < 0 || v0 >= v6)) {
                    v3.replace(v6, v6 + 2, "\\");
                    v1 = v6 + 1;
                    continue;
                }

                v3.replace(v0, v0 + 2, "\n");
                v1 = v0 + 1;
            }
        }
    }

    public URL aw() {
        return this.ax;
    }

    public boolean ax(int arg7, int arg8) {
        try {
            if(this.al == null) {
                this.al = new je();
                mt.ax(arg7, this.ar.ae, 1522036441);
            }
        }
        catch(RuntimeException v7) {
            goto label_86;
        }

        je v7_1 = null;
        try {
            if(this.ax != null) {
                if(this.ae == null) {
                    this.ae = this.al.an(this.ax, 0x18046CC7);
                }
                else if(this.ae.al(0x5DD8C34D)) {
                    no v2 = new no(new String(this.ae.ae(0xE4D30573), "CP1252").split("[\\r\\n]+"));
                    jt v0 = this.ar;
                    while(true) {
                        String[] v3 = v2.al(-800465365);
                        if(v3 != null) {
                            if(v3[0].equals("param")) {
                                this.al(v3[1], v0, 0x6F);
                            }
                            else if(v3[0].equals("msg")) {
                                this.ae(v3[1], v0, 0xFC907785);
                            }
                            else {
                                this.ar(v3, v0, 0x51BE43EE);
                            }

                            continue;
                        }
                        else {
                            String v0_1 = v2.ax(-101616008);
                            if(v0_1 != null) {
                                jt v3_1 = new jt(v0_1);
                                this.an.add(v3_1);
                                v0 = v3_1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        return 0;
                    }

                    this.al.aj(109);
                    this.al = v7_1;
                    return 1;
                }

                return 0;
            }

            throw new Exception();
        }
        catch(Exception ) {
            if(this.al != null) {
                this.al.aj(0x79);
                this.al = v7_1;
            }

            return 1;
        }

    label_86:
        StringBuilder v8 = new StringBuilder();
        v8.append("jr.ax(");
        v8.append(')');
        throw lx.al(((Throwable)v7), v8.toString());
    }

    public URL ay() {
        return this.ax;
    }

    void az(String[] arg3, jt arg4) {
        arg4.ax.put(arg3[0], arg3[1]);
    }
}

