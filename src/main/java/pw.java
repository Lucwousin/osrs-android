public class pw implements al {
    static final String ae = "_";
    int aj;
    static final String al = "\\.";
    int an;
    int ap;
    client ar;
    static final int ax;

    public pw(client arg3) {
        try {
            super();
            this.ar = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pw.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aa(String arg3) {
        String[] v3 = arg3.split("\\.");
        try {
            this.an = Integer.parseInt(v3[0]) * 1934020745;
            this.ap = Integer.parseInt(v3[1]) * -1031445927;
            this.aj = Integer.parseInt(v3[2]) * 216050600;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    void ab(String arg2) {
        if(arg2.startsWith("1.")) {
            this.ap(arg2, -53);
        }
        else {
            this.aj(arg2, 0x73);
        }
    }

    void ad(String arg2) {
        if(arg2.startsWith("1.")) {
            this.ap(arg2, -19);
        }
        else {
            this.aj(arg2, 21);
        }
    }

    public ax ae() {
        int v12_1;
        int v17;
        String v12;
        String v8;
        String v1;
        int v9;
        pw v0 = this;
        int v3 = 6;
        int v4 = 5;
        int v5 = 3;
        int v6 = 2;
        if(v0.ar.au) {
            v9 = v0.ar.abd(0x6E8D5582) == v6 ? 5 : 6;
        }
        else if(dp.au.startsWith("win")) {
            v9 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v9 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v9 = 3;
        }
        else {
            v9 = 4;
        }

        try {
            v1 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v1 = "";
        }

        try {
            v8 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v8 = "";
        }

        String v10 = "Unknown";
        String v11 = "1.1";
        try {
            v12 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v12 = v10;
            goto label_55;
        }

        try {
            v10 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_55:
            v10 = v11;
        }

        boolean v1_1 = (v1.startsWith("amd64")) || (v1.startsWith("x86_64")) ? true : false;
        int v11_1 = -1;
        if(v9 == 1) {
            if(v8.indexOf("4.0") != v11_1) {
                v17 = 1;
            }
            else if(v8.indexOf("4.1") != v11_1) {
                v17 = 2;
            }
            else if(v8.indexOf("4.9") != v11_1) {
                v17 = 3;
            }
            else if(v8.indexOf("5.0") != v11_1) {
                v17 = 4;
            }
            else if(v8.indexOf("5.1") != v11_1) {
                v17 = 5;
            }
            else if(v8.indexOf("5.2") != v11_1) {
                v17 = 8;
            }
            else if(v8.indexOf("6.0") != v11_1) {
                v17 = 6;
            }
            else if(v8.indexOf("6.1") != v11_1) {
                v17 = 7;
            }
            else if(v8.indexOf("6.2") != v11_1) {
                v17 = 9;
            }
            else if(v8.indexOf("6.3") != v11_1) {
                v17 = 10;
            }
            else if(v8.indexOf("10.0") != v11_1) {
                v17 = 11;
            }
            else {
                goto label_206;
            }
        }
        else if(v9 != v6) {
            int v8_1 = 0x7F03019A;
            if(v9 == v4) {
                v8_1 = v0.ar.aba(-690518973).ad(v8_1) + 10000;
            }
            else if(v3 == v9) {
                v8_1 = v0.ar.aba(243082058).ad(v8_1) + 20000;
            }
            else {
                goto label_206;
            }

            v17 = v8_1;
            goto label_207;
        label_206:
            v17 = 0;
        }
        else if(v8.indexOf("10.4") != v11_1) {
            v17 = 20;
        }
        else if(v8.indexOf("10.5") != v11_1) {
            v17 = 21;
        }
        else if(v8.indexOf("10.6") != v11_1) {
            v17 = 22;
        }
        else if(v8.indexOf("10.7") != v11_1) {
            v17 = 23;
        }
        else if(v8.indexOf("10.8") != v11_1) {
            v17 = 24;
        }
        else if(v8.indexOf("10.9") != v11_1) {
            v17 = 25;
        }
        else if(v8.indexOf("10.10") != v11_1) {
            v17 = 26;
        }
        else if(v8.indexOf("10.11") != v11_1) {
            v17 = 27;
        }
        else if(v8.indexOf("10.12") != v11_1) {
            v17 = 28;
        }
        else if(v8.indexOf("10.13") != v11_1) {
            v17 = 29;
        }
        else {
            goto label_206;
        }

    label_207:
        if(v12.toLowerCase().indexOf("sun") != v11_1) {
            v12_1 = 1;
        }
        else if(v12.toLowerCase().indexOf("microsoft") != v11_1) {
            v12_1 = 2;
        }
        else if(v12.toLowerCase().indexOf("apple") != v11_1) {
            v12_1 = 3;
        }
        else if(v12.toLowerCase().indexOf("oracle") != v11_1) {
            v12_1 = 5;
        }
        else if(v12.toLowerCase().indexOf("android") != v11_1) {
            v12_1 = 6;
        }
        else {
            v12_1 = 4;
        }

        v0.an(v10, 0x7FCF9B27);
        int v2 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        v4 = 0x9061FF2F;
        int v18 = v0.an * v4 > v5 ? Runtime.getRuntime().availableProcessors() : 0;
        return new ax(v9, v1_1, v17, v12_1, v0.an * v4, v0.ap * -1813789207, v0.aj * -388676045, false, v2, v18, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[v5], 0, "");
    }

    void af(String arg2) {
        if(arg2.startsWith("1.")) {
            this.ap(arg2, -20);
        }
        else {
            this.aj(arg2, 0x71);
        }
    }

    void ai(String arg4) {
        String[] v4 = arg4.split("\\.");
        try {
            this.an = Integer.parseInt(v4[1]) * 0x46A5A7CF;
            v4 = v4[2].split("_");
            this.ap = Integer.parseInt(v4[0]) * 0xDEBF29A3;
            this.aj = Integer.parseInt(v4[1]) * 0x1BE724FB;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    void aj(String arg2, byte arg3) {
        try {
            String[] v2_1 = arg2.split("\\.");
            try {
                this.an = Integer.parseInt(v2_1[0]) * 0x46A5A7CF;
                this.ap = Integer.parseInt(v2_1[1]) * -1031445927;
                this.aj = Integer.parseInt(v2_1[2]) * 0x1BE724FB;
            }
            catch(Exception ) {
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pw.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public ax al() {
        int v12_1;
        int v17;
        String v12;
        String v8;
        String v1;
        int v9;
        pw v0 = this;
        int v3 = 6;
        int v4 = 5;
        int v5 = 3;
        int v6 = 2;
        if(v0.ar.au) {
            v9 = v0.ar.abd(0x6A4FDCF7) == v6 ? 5 : 6;
        }
        else if(dp.au.startsWith("win")) {
            v9 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v9 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v9 = 3;
        }
        else {
            v9 = 4;
        }

        try {
            v1 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v1 = "";
        }

        try {
            v8 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v8 = "";
        }

        String v10 = "Unknown";
        String v11 = "1.1";
        try {
            v12 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v12 = v10;
            goto label_55;
        }

        try {
            v10 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_55:
            v10 = v11;
        }

        boolean v1_1 = (v1.startsWith("amd64")) || (v1.startsWith("x86_64")) ? true : false;
        int v11_1 = -1;
        if(v9 == 1) {
            if(v8.indexOf("4.0") != v11_1) {
                v17 = 1;
            }
            else if(v8.indexOf("4.1") != v11_1) {
                v17 = 2;
            }
            else if(v8.indexOf("4.9") != v11_1) {
                v17 = 3;
            }
            else if(v8.indexOf("5.0") != v11_1) {
                v17 = 4;
            }
            else if(v8.indexOf("5.1") != v11_1) {
                v17 = 5;
            }
            else if(v8.indexOf("5.2") != v11_1) {
                v17 = 8;
            }
            else if(v8.indexOf("6.0") != v11_1) {
                v17 = 6;
            }
            else if(v8.indexOf("6.1") != v11_1) {
                v17 = 7;
            }
            else if(v8.indexOf("6.2") != v11_1) {
                v17 = 9;
            }
            else if(v8.indexOf("6.3") != v11_1) {
                v17 = 10;
            }
            else if(v8.indexOf("10.0") != v11_1) {
                v17 = 11;
            }
            else {
                goto label_206;
            }
        }
        else if(v9 != v6) {
            int v8_1 = 0x7F03019A;
            if(v9 == v4) {
                v8_1 = v0.ar.aba(-1972199030).ad(v8_1) + 10000;
            }
            else if(v3 == v9) {
                v8_1 = v0.ar.aba(0x6064DAA5).ad(v8_1) + 20000;
            }
            else {
                goto label_206;
            }

            v17 = v8_1;
            goto label_207;
        label_206:
            v17 = 0;
        }
        else if(v8.indexOf("10.4") != v11_1) {
            v17 = 20;
        }
        else if(v8.indexOf("10.5") != v11_1) {
            v17 = 21;
        }
        else if(v8.indexOf("10.6") != v11_1) {
            v17 = 22;
        }
        else if(v8.indexOf("10.7") != v11_1) {
            v17 = 23;
        }
        else if(v8.indexOf("10.8") != v11_1) {
            v17 = 24;
        }
        else if(v8.indexOf("10.9") != v11_1) {
            v17 = 25;
        }
        else if(v8.indexOf("10.10") != v11_1) {
            v17 = 26;
        }
        else if(v8.indexOf("10.11") != v11_1) {
            v17 = 27;
        }
        else if(v8.indexOf("10.12") != v11_1) {
            v17 = 28;
        }
        else if(v8.indexOf("10.13") != v11_1) {
            v17 = 29;
        }
        else {
            goto label_206;
        }

    label_207:
        if(v12.toLowerCase().indexOf("sun") != v11_1) {
            v12_1 = 1;
        }
        else if(v12.toLowerCase().indexOf("microsoft") != v11_1) {
            v12_1 = 2;
        }
        else if(v12.toLowerCase().indexOf("apple") != v11_1) {
            v12_1 = 3;
        }
        else if(v12.toLowerCase().indexOf("oracle") != v11_1) {
            v12_1 = 5;
        }
        else if(v12.toLowerCase().indexOf("android") != v11_1) {
            v12_1 = 6;
        }
        else {
            v12_1 = 4;
        }

        v0.an(v10, 0x210D9ED3);
        int v2 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        v4 = 0x9061FF2F;
        int v18 = v0.an * v4 > v5 ? Runtime.getRuntime().availableProcessors() : 0;
        return new ax(v9, v1_1, v17, v12_1, v0.an * v4, v0.ap * -1813789207, v0.aj * -388676045, false, v2, v18, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[v5], 0, "");
    }

    void an(String arg2, int arg3) {
        try {
            if(arg2.startsWith("1.")) {
                this.ap(arg2, -3);
            }
            else {
                this.aj(arg2, 0x20);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pw.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ap(String arg3, byte arg4) {
        try {
            String[] v3_1 = arg3.split("\\.");
            try {
                this.an = Integer.parseInt(v3_1[1]) * 0x46A5A7CF;
                v3_1 = v3_1[2].split("_");
                this.ap = Integer.parseInt(v3_1[0]) * -1031445927;
                this.aj = Integer.parseInt(v3_1[1]) * 0x1BE724FB;
            }
            catch(Exception ) {
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("pw.ap(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void aq(String arg2) {
        if(arg2.startsWith("1.")) {
            this.ap(arg2, -78);
        }
        else {
            this.aj(arg2, 18);
        }
    }

    public ax ar() {
        int v12_1;
        int v17;
        String v12;
        String v8;
        String v1;
        int v9;
        pw v0 = this;
        int v3 = 6;
        int v4 = 5;
        int v5 = 3;
        int v6 = 2;
        if(v0.ar.au) {
            v9 = v0.ar.abd(0x61FCCA71) == v6 ? 5 : 6;
        }
        else if(dp.au.startsWith("win")) {
            v9 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v9 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v9 = 3;
        }
        else {
            v9 = 4;
        }

        try {
            v1 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v1 = "";
        }

        try {
            v8 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v8 = "";
        }

        String v10 = "Unknown";
        String v11 = "1.1";
        try {
            v12 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v12 = v10;
            goto label_55;
        }

        try {
            v10 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_55:
            v10 = v11;
        }

        boolean v1_1 = (v1.startsWith("amd64")) || (v1.startsWith("x86_64")) ? true : false;
        int v11_1 = -1;
        if(v9 == 1) {
            if(v8.indexOf("4.0") != v11_1) {
                v17 = 1;
            }
            else if(v8.indexOf("4.1") != v11_1) {
                v17 = 2;
            }
            else if(v8.indexOf("4.9") != v11_1) {
                v17 = 3;
            }
            else if(v8.indexOf("5.0") != v11_1) {
                v17 = 4;
            }
            else if(v8.indexOf("5.1") != v11_1) {
                v17 = 5;
            }
            else if(v8.indexOf("5.2") != v11_1) {
                v17 = 8;
            }
            else if(v8.indexOf("6.0") != v11_1) {
                v17 = 6;
            }
            else if(v8.indexOf("6.1") != v11_1) {
                v17 = 7;
            }
            else if(v8.indexOf("6.2") != v11_1) {
                v17 = 9;
            }
            else if(v8.indexOf("6.3") != v11_1) {
                v17 = 10;
            }
            else if(v8.indexOf("10.0") != v11_1) {
                v17 = 11;
            }
            else {
                goto label_206;
            }
        }
        else if(v9 != v6) {
            int v8_1 = 0x7F03019A;
            if(v9 == v4) {
                v8_1 = v0.ar.aba(60487460).ad(v8_1) + 10000;
            }
            else if(v3 == v9) {
                v8_1 = v0.ar.aba(-1755103943).ad(v8_1) + 20000;
            }
            else {
                goto label_206;
            }

            v17 = v8_1;
            goto label_207;
        label_206:
            v17 = 0;
        }
        else if(v8.indexOf("10.4") != v11_1) {
            v17 = 20;
        }
        else if(v8.indexOf("10.5") != v11_1) {
            v17 = 21;
        }
        else if(v8.indexOf("10.6") != v11_1) {
            v17 = 22;
        }
        else if(v8.indexOf("10.7") != v11_1) {
            v17 = 23;
        }
        else if(v8.indexOf("10.8") != v11_1) {
            v17 = 24;
        }
        else if(v8.indexOf("10.9") != v11_1) {
            v17 = 25;
        }
        else if(v8.indexOf("10.10") != v11_1) {
            v17 = 26;
        }
        else if(v8.indexOf("10.11") != v11_1) {
            v17 = 27;
        }
        else if(v8.indexOf("10.12") != v11_1) {
            v17 = 28;
        }
        else if(v8.indexOf("10.13") != v11_1) {
            v17 = 29;
        }
        else {
            goto label_206;
        }

    label_207:
        if(v12.toLowerCase().indexOf("sun") != v11_1) {
            v12_1 = 1;
        }
        else if(v12.toLowerCase().indexOf("microsoft") != v11_1) {
            v12_1 = 2;
        }
        else if(v12.toLowerCase().indexOf("apple") != v11_1) {
            v12_1 = 3;
        }
        else if(v12.toLowerCase().indexOf("oracle") != v11_1) {
            v12_1 = 5;
        }
        else if(v12.toLowerCase().indexOf("android") != v11_1) {
            v12_1 = 6;
        }
        else {
            v12_1 = 4;
        }

        v0.an(v10, 1933233901);
        int v2 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        int v18 = v0.an * 0x9061FF2F > v5 ? Runtime.getRuntime().availableProcessors() : 0;
        return new ax(v9, v1_1, v17, v12_1, v0.an * -681002150, v0.ap * 1370046777, v0.aj * 0x755F20D2, false, v2, v18, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[v5], 0, "");
    }

    void au(String arg3) {
        String[] v3 = arg3.split("\\.");
        try {
            this.an = Integer.parseInt(v3[0]) * 0xFF610058;
            this.ap = Integer.parseInt(v3[1]) * -1206644444;
            this.aj = Integer.parseInt(v3[2]) * 0xFF200CA8;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    void av(String arg4) {
        String[] v4 = arg4.split("\\.");
        try {
            this.an = Integer.parseInt(v4[1]) * 0x46A5A7CF;
            v4 = v4[2].split("_");
            this.ap = Integer.parseInt(v4[0]) * -1031445927;
            this.aj = Integer.parseInt(v4[1]) * 0x1BE724FB;
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public ax ax(int arg35) {
        ax v8_2;
        int v12_1;
        int v14;
        String v12;
        String v8;
        String v0_1;
        int v9;
        int v5;
        int v3;
        pw v1 = this;
        try {
            v3 = 6;
            int v4 = 5;
            v5 = 3;
            int v6 = 2;
            if(v1.ar.au) {
                v9 = v1.ar.abd(0x7F5D7371) == v6 ? 5 : 6;
            }
            else if(dp.au.startsWith("win")) {
                v9 = 1;
            }
            else if(dp.au.startsWith("mac")) {
                v9 = 2;
            }
            else if(dp.au.startsWith("linux")) {
                goto label_34;
            }
            else {
                goto label_36;
            }

            goto label_37;
        }
        catch(RuntimeException v0) {
            goto label_290;
        }

    label_34:
        v9 = 3;
        goto label_37;
    label_36:
        v9 = 4;
        try {
        label_37:
            v0_1 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v0_1 = "";
        }

        try {
            v8 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v8 = "";
        }

        String v10 = "Unknown";
        String v11 = "1.1";
        try {
            v12 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v12 = v10;
            goto label_55;
        }

        try {
            v10 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_55:
            v10 = v11;
        }

        try {
            boolean v0_2 = (v0_1.startsWith("amd64")) || (v0_1.startsWith("x86_64")) ? true : false;
            int v11_1 = -1;
            if(v9 == 1) {
                if(v8.indexOf("4.0") != v11_1) {
                    v14 = 1;
                }
                else if(v8.indexOf("4.1") != v11_1) {
                    v14 = 2;
                }
                else if(v8.indexOf("4.9") != v11_1) {
                    v14 = 3;
                }
                else if(v8.indexOf("5.0") != v11_1) {
                    v14 = 4;
                }
                else if(v8.indexOf("5.1") != v11_1) {
                    v14 = 5;
                }
                else if(v8.indexOf("5.2") != v11_1) {
                    v14 = 8;
                }
                else if(v8.indexOf("6.0") != v11_1) {
                    v14 = 6;
                }
                else if(v8.indexOf("6.1") != v11_1) {
                    v14 = 7;
                }
                else if(v8.indexOf("6.2") != v11_1) {
                    v14 = 9;
                }
                else if(v8.indexOf("6.3") != v11_1) {
                    v14 = 10;
                }
                else if(v8.indexOf("10.0") != v11_1) {
                    v14 = 11;
                }
                else {
                    goto label_206;
                }
            }
            else if(v9 != v6) {
                int v8_1 = 0x7F03019A;
                if(v9 == v4) {
                    v8_1 = v1.ar.aba(0xB37C63A8).ad(v8_1) + 10000;
                }
                else if(v3 == v9) {
                    v8_1 = v1.ar.aba(0x79F27C64).ad(v8_1) + 20000;
                }
                else {
                    goto label_206;
                }

                v14 = v8_1;
                goto label_207;
            label_206:
                v14 = 0;
            }
            else if(v8.indexOf("10.4") != v11_1) {
                v14 = 20;
            }
            else if(v8.indexOf("10.5") != v11_1) {
                v14 = 21;
            }
            else if(v8.indexOf("10.6") != v11_1) {
                v14 = 22;
            }
            else if(v8.indexOf("10.7") != v11_1) {
                v14 = 23;
            }
            else if(v8.indexOf("10.8") != v11_1) {
                v14 = 24;
            }
            else if(v8.indexOf("10.9") != v11_1) {
                v14 = 25;
            }
            else if(v8.indexOf("10.10") != v11_1) {
                v14 = 26;
            }
            else if(v8.indexOf("10.11") != v11_1) {
                v14 = 27;
            }
            else if(v8.indexOf("10.12") != v11_1) {
                v14 = 28;
            }
            else if(v8.indexOf("10.13") != v11_1) {
                v14 = 29;
            }
            else {
                goto label_206;
            }

        label_207:
            if(v12.toLowerCase().indexOf("sun") != v11_1) {
                v12_1 = 1;
            }
            else if(v12.toLowerCase().indexOf("microsoft") != v11_1) {
                v12_1 = 2;
            }
            else if(v12.toLowerCase().indexOf("apple") != v11_1) {
                v12_1 = 3;
            }
            else if(v12.toLowerCase().indexOf("oracle") != v11_1) {
                v12_1 = 5;
            }
            else if(v12.toLowerCase().indexOf("android") != v11_1) {
                v12_1 = 6;
            }
            else {
                v12_1 = 4;
            }

            v1.an(v10, -1512320203);
            int v17 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
            v3 = 0x9061FF2F;
            int v18 = v1.an * v3 > v5 ? Runtime.getRuntime().availableProcessors() : 0;
            v8_2 = new ax(v9, v0_2, v14, v12_1, v1.an * v3, -1813789207 * v1.ap, v1.aj * -388676045, false, v17, v18, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[v5], 0, "");
        }
        catch(RuntimeException v0) {
        label_290:
            StringBuilder v2 = new StringBuilder();
            v2.append("pw.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v0), v2.toString());
        }

        return v8_2;
    }
}

