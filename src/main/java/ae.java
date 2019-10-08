import java.util.Calendar;
import java.util.Date;

public class ae implements al {
    public static final int ac = 26;
    static final int ax;
    static int mm;

    public ae() {
        super();
    }

    static int ab(int arg2, byte arg3) {
        try {
            mx v2_1 = ic.al.ax(((long)arg2));
            int v3 = -1;
            if(v2_1 == null) {
                return v3;
            }

            if(((ij)v2_1).dn == ic.ae.ax) {
                return v3;
            }

            return ((ij)v2_1).dn.ax * 0x7D5124F1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("ae.ab(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public ax ae() {
        int v29;
        int[] v28;
        int v31;
        int v25;
        int v24;
        String v21;
        String v20;
        String v19;
        int v4_1;
        int v13;
        int v8_1;
        int v9_1;
        int v14;
        String v9;
        String v5;
        String v0;
        int v6;
        int v1 = 4;
        int v2 = 3;
        int v3 = 2;
        if(dp.au.startsWith("win")) {
            v6 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v6 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v6 = 3;
        }
        else {
            v6 = 4;
        }

        try {
            v0 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v0 = "";
        }

        try {
            v5 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v5 = "";
        }

        String v7 = "Unknown";
        String v8 = "1.1";
        try {
            v9 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v9 = v7;
            goto label_41;
        }

        try {
            v7 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_41:
            v7 = v8;
        }

        boolean v0_1 = (v0.startsWith("amd64")) || (v0.startsWith("x86_64")) ? true : false;
        int v12 = -1;
        if(1 == v6) {
            if(v5.indexOf("4.0") != v12) {
                v14 = 1;
            }
            else if(v5.indexOf("4.1") != v12) {
                v14 = 2;
            }
            else if(v5.indexOf("4.9") != v12) {
                v14 = 3;
            }
            else if(v5.indexOf("5.0") != v12) {
                v14 = 4;
            }
            else if(v5.indexOf("5.1") != v12) {
                v14 = 5;
            }
            else if(v5.indexOf("5.2") != v12) {
                v14 = 8;
            }
            else if(v5.indexOf("6.0") != v12) {
                v14 = 6;
            }
            else if(v5.indexOf("6.1") != v12) {
                v14 = 7;
            }
            else if(v5.indexOf("6.2") != v12) {
                v14 = 9;
            }
            else if(v5.indexOf("6.3") != v12) {
                v14 = 10;
            }
            else if(v5.indexOf("10.0") != v12) {
                v14 = 11;
            }
            else {
                goto label_177;
            }
        }
        else if(v6 != v3) {
        label_177:
            v14 = 0;
        }
        else if(v5.indexOf("10.4") != v12) {
            v14 = 20;
        }
        else if(v5.indexOf("10.5") != v12) {
            v14 = 21;
        }
        else if(v5.indexOf("10.6") != v12) {
            v14 = 22;
        }
        else if(v5.indexOf("10.7") != v12) {
            v14 = 23;
        }
        else if(v5.indexOf("10.8") != v12) {
            v14 = 24;
        }
        else if(v5.indexOf("10.9") != v12) {
            v14 = 25;
        }
        else if(v5.indexOf("10.10") != v12) {
            v14 = 26;
        }
        else if(v5.indexOf("10.11") != v12) {
            v14 = 27;
        }
        else if(v5.indexOf("10.12") != v12) {
            v14 = 28;
        }
        else if(v5.indexOf("10.13") != v12) {
            v14 = 29;
        }
        else {
            goto label_177;
        }

        if(v9.toLowerCase().indexOf("sun") != v12) {
            v9_1 = 1;
        }
        else if(v9.toLowerCase().indexOf("microsoft") != v12) {
            v9_1 = 2;
        }
        else if(v9.toLowerCase().indexOf("apple") != v12) {
            v9_1 = 3;
        }
        else if(v9.toLowerCase().indexOf("oracle") != v12) {
            v9_1 = 5;
        }
        else {
            v9_1 = 4;
        }

        int v5_1 = 2;
        int v15 = 0;
        try {
            while(true) {
            label_205:
                if(v5_1 < v7.length()) {
                    v8_1 = v7.charAt(v5_1);
                    if(v8_1 >= 0x1770A13D) {
                        break;
                    }
                }

                goto label_218;
            }
        }
        catch(Exception ) {
            goto label_218;
        }

        if(v8_1 <= 0xAF768E2C) {
            v15 = v15 * 10 + (v8_1 + 962320915);
            ++v5_1;
            goto label_205;
        }

    label_218:
        v5_1 = v7.indexOf(0x6805B287, v3) + 1;
        int v16 = 0;
        while(true) {
            v8_1 = 57;
            v13 = 0x30;
            try {
                if(v5_1 < v7.length()) {
                    v12 = v7.charAt(v5_1);
                    if(v12 >= v13) {
                        goto label_228;
                    }
                }
            }
            catch(Exception ) {
            }

            break;
        label_228:
            if(v12 <= v8_1) {
                v16 = v16 * 10 + (v12 - 955480730);
                ++v5_1;
                continue;
            }

            break;
        }

        v1 = v7.indexOf(0x5F, v1) + 1;
        v12 = 0;
        try {
            while(true) {
            label_240:
                if(v1 < v7.length()) {
                    v5_1 = v7.charAt(v1);
                    if(v5_1 >= v13) {
                        break;
                    }
                }

                goto label_251;
            }
        }
        catch(Exception ) {
            goto label_251;
        }

        if(v5_1 <= v8_1) {
            v12 = v12 * 10 + (v5_1 - 0x1B4A4B7E);
            ++v1;
            goto label_240;
        }

    label_251:
        v1 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        v2 = v15 > v2 ? Runtime.getRuntime().availableProcessors() : 0;
        v5 = "";
        String v13_1 = "";
        String v17 = "";
        Calendar v11 = Calendar.getInstance();
        String v32 = "";
        String v33 = "";
        v11.setTime(new Date(-9223372036854775808L));
        int[] v4 = new int[0];
        if(com.jagex.oldscape.osrenderer.ax.ax(926858008)) {
            v5 = com.jagex.oldscape.osrenderer.ax.bu(0x8FE84B0E);
            v7 = com.jagex.oldscape.osrenderer.ax.bs(0x606B29C4);
            v4_1 = com.jagex.oldscape.osrenderer.ax.be(0xC8FD3386);
            v8_1 = com.jagex.oldscape.osrenderer.ax.bl(0x166F);
            v13 = com.jagex.oldscape.osrenderer.ax.br(0xFF7CF6F1);
            int v17_1 = com.jagex.oldscape.osrenderer.ax.bi(107);
            int[] v18 = com.jagex.oldscape.osrenderer.ax.ca(1304812425);
            v19 = com.jagex.oldscape.osrenderer.ax.cj(0xA109585D);
            v20 = com.jagex.oldscape.osrenderer.ax.cf(0xADEEE43A);
            v21 = com.jagex.oldscape.osrenderer.ax.cx(0x400);
            v11.setTimeInMillis(com.jagex.oldscape.osrenderer.ax.cd(0xA60B0DDC) * 1000);
            v32 = v7;
            v24 = v8_1;
            v25 = v13;
            v31 = v17_1;
            v28 = v18;
            v13_1 = v19;
            v33 = v20;
            v17 = v21;
            v29 = v4_1;
            v3 = 2;
        }
        else {
            v28 = v4;
            v24 = -1;
            v25 = -1;
            v29 = -1;
            v31 = -1;
        }

        int v23 = v11.get(v3) + 1;
        int v22 = v11.get(1);
        String v3_1 = "";
        if(v33 == null) {
            v33 = "";
        }

        String v4_2 = v33;
        v7 = "";
        if(v17 == null) {
            v17 = "";
        }

        v8 = v17;
        String v26 = v32 == null ? "" : v32;
        if(v5 == null) {
            v5 = "";
        }

        String v27 = v5;
        int v11_1 = 40;
        if(v3_1.length() > v11_1) {
            v3_1 = v3_1.substring(0, v11_1);
        }

        String v18_1 = v3_1;
        v19 = v4_2.length() > v11_1 ? v4_2.substring(0, 1923040890) : v4_2;
        v4_1 = 10;
        v20 = v7.length() > v4_1 ? v7.substring(0, v4_1) : v7;
        v21 = v8.length() > v4_1 ? v8.substring(0, v4_1) : v8;
        String v30 = v13_1.length() > 120 ? v13_1.substring(0, 0x74BC0904) : v13_1;
        return new ax(v6, v0_1, v14, v9_1, v15, v16, v12, false, v1, v2, v31, 0, v18_1, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30);
    }

    public static da al(int arg1, byte arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 < da.al.length && da.al[arg1] != null) {
                    return da.al[arg1];
                }

            label_10:
                return new da(arg1);
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("ae.al(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }

        goto label_10;
    }

    public static fr[] al(int arg2) {
        arg2 = 4;
        try {
            fr[] v2_1 = new fr[arg2];
            v2_1[0] = fr.ar;
            v2_1[1] = fr.ae;
            v2_1[2] = fr.ax;
            v2_1[3] = fr.al;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ae.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public ax al() {
        int v7_1;
        int v25;
        int[] v28;
        int v31;
        int v24;
        int v29;
        String v21;
        String v20;
        String v19;
        int v11;
        int v8_1;
        int v9_1;
        int v14;
        String v9;
        String v5;
        String v0;
        int v6;
        int v1 = 4;
        int v2 = 3;
        int v3 = 2;
        if(dp.au.startsWith("win")) {
            v6 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v6 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v6 = 3;
        }
        else {
            v6 = 4;
        }

        try {
            v0 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v0 = "";
        }

        try {
            v5 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v5 = "";
        }

        String v7 = "Unknown";
        String v8 = "1.1";
        try {
            v9 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v9 = v7;
            goto label_41;
        }

        try {
            v7 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_41:
            v7 = v8;
        }

        boolean v0_1 = (v0.startsWith("amd64")) || (v0.startsWith("x86_64")) ? true : false;
        int v12 = -1;
        if(1 == v6) {
            if(v5.indexOf("4.0") != v12) {
                v14 = 1;
            }
            else if(v5.indexOf("4.1") != v12) {
                v14 = 2;
            }
            else if(v5.indexOf("4.9") != v12) {
                v14 = 3;
            }
            else if(v5.indexOf("5.0") != v12) {
                v14 = 4;
            }
            else if(v5.indexOf("5.1") != v12) {
                v14 = 5;
            }
            else if(v5.indexOf("5.2") != v12) {
                v14 = 8;
            }
            else if(v5.indexOf("6.0") != v12) {
                v14 = 6;
            }
            else if(v5.indexOf("6.1") != v12) {
                v14 = 7;
            }
            else if(v5.indexOf("6.2") != v12) {
                v14 = 9;
            }
            else if(v5.indexOf("6.3") != v12) {
                v14 = 10;
            }
            else if(v5.indexOf("10.0") != v12) {
                v14 = 11;
            }
            else {
                goto label_177;
            }
        }
        else if(v6 != v3) {
        label_177:
            v14 = 0;
        }
        else if(v5.indexOf("10.4") != v12) {
            v14 = 20;
        }
        else if(v5.indexOf("10.5") != v12) {
            v14 = 21;
        }
        else if(v5.indexOf("10.6") != v12) {
            v14 = 22;
        }
        else if(v5.indexOf("10.7") != v12) {
            v14 = 23;
        }
        else if(v5.indexOf("10.8") != v12) {
            v14 = 24;
        }
        else if(v5.indexOf("10.9") != v12) {
            v14 = 25;
        }
        else if(v5.indexOf("10.10") != v12) {
            v14 = 26;
        }
        else if(v5.indexOf("10.11") != v12) {
            v14 = 27;
        }
        else if(v5.indexOf("10.12") != v12) {
            v14 = 28;
        }
        else if(v5.indexOf("10.13") != v12) {
            v14 = 29;
        }
        else {
            goto label_177;
        }

        if(v9.toLowerCase().indexOf("sun") != v12) {
            v9_1 = 1;
        }
        else if(v9.toLowerCase().indexOf("microsoft") != v12) {
            v9_1 = 2;
        }
        else if(v9.toLowerCase().indexOf("apple") != v12) {
            v9_1 = 3;
        }
        else if(v9.toLowerCase().indexOf("oracle") != v12) {
            v9_1 = 5;
        }
        else {
            v9_1 = 4;
        }

        int v5_1 = 2;
        int v15 = 0;
        try {
            while(true) {
            label_205:
                if(v5_1 < v7.length()) {
                    v8_1 = v7.charAt(v5_1);
                    if(v8_1 >= -308063287) {
                        break;
                    }
                }

                goto label_217;
            }
        }
        catch(Exception ) {
            goto label_217;
        }

        if(v8_1 <= 2092461613) {
            v15 = v15 * 10 + (v8_1 - 0x30);
            ++v5_1;
            goto label_205;
        }

    label_217:
        v5_1 = v7.indexOf(46, v3) + 1;
        int v16 = 0;
        try {
            while(true) {
            label_221:
                if(v5_1 < v7.length()) {
                    v8_1 = v7.charAt(v5_1);
                    if(v8_1 >= 0x30) {
                        break;
                    }
                }

                goto label_233;
            }
        }
        catch(Exception ) {
            goto label_233;
        }

        if(v8_1 <= 57) {
            v16 = v16 * 10 + (v8_1 - 0x30);
            ++v5_1;
            goto label_221;
        }

    label_233:
        v1 = v7.indexOf(0x5F, v1) + 1;
        int v18 = 0;
        try {
            while(true) {
            label_237:
                if(v1 < v7.length()) {
                    v5_1 = v7.charAt(v1);
                    if(v5_1 >= 0xE17F0881) {
                        break;
                    }
                }

                goto label_249;
            }
        }
        catch(Exception ) {
            goto label_249;
        }

        if(v5_1 <= 0x5B87D443) {
            v18 = v18 * 10 + (v5_1 - 0x30);
            ++v1;
            goto label_237;
        }

    label_249:
        v1 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        v2 = v15 > v2 ? Runtime.getRuntime().availableProcessors() : 0;
        v7 = "";
        v8 = "";
        String v13 = "";
        String v17 = "";
        Calendar v12_1 = Calendar.getInstance();
        String v32 = "";
        v12_1.setTime(new Date(-9223372036854775808L));
        int[] v4 = new int[0];
        if(com.jagex.oldscape.osrenderer.ax.ax(0x9FD79891)) {
            v5 = com.jagex.oldscape.osrenderer.ax.bu(-1387905865);
            v7 = com.jagex.oldscape.osrenderer.ax.bs(0x606B29C4);
            int v4_1 = com.jagex.oldscape.osrenderer.ax.be(680634518);
            v8_1 = com.jagex.oldscape.osrenderer.ax.bl(0x338F);
            v11 = com.jagex.oldscape.osrenderer.ax.br(-2073252478);
            int v13_1 = com.jagex.oldscape.osrenderer.ax.bi(0x40);
            int[] v17_1 = com.jagex.oldscape.osrenderer.ax.ca(1304812425);
            v19 = com.jagex.oldscape.osrenderer.ax.cj(0xA96552C4);
            v20 = com.jagex.oldscape.osrenderer.ax.cf(0x2C8F0051);
            v21 = com.jagex.oldscape.osrenderer.ax.cx(0x400);
            v12_1.setTimeInMillis(com.jagex.oldscape.osrenderer.ax.cd(0x92BD0A22) * 1000);
            v29 = v4_1;
            v32 = v5;
            v24 = v8_1;
            v31 = v13_1;
            v28 = v17_1;
            v13 = v19;
            v17 = v21;
            v25 = v11;
        }
        else {
            v28 = v4;
            v20 = v8;
            v24 = -1;
            v25 = -1;
            v29 = -1;
            v31 = -1;
        }

        int v23 = v12_1.get(v3) + 1;
        int v22 = v12_1.get(1);
        String v3_1 = "";
        if(v20 == null) {
            v20 = "";
        }

        String v4_2 = v20;
        v5 = "";
        if(v17 == null) {
            v17 = "";
        }

        v8 = v17;
        if(v7 == null) {
            v7 = "";
        }

        String v26 = v7;
        String v27 = v32 == null ? "" : v32;
        v11 = 40;
        if(v3_1.length() > 0xBA6FCED8) {
            v7_1 = 0;
            v3_1 = v3_1.substring(0, v11);
        }
        else {
            v7_1 = 0;
        }

        if(v4_2.length() > v11) {
            v4_2 = v4_2.substring(v7_1, 55207662);
        }

        v19 = v4_2;
        int v10 = 10;
        v20 = v5.length() > v10 ? v5.substring(v7_1, v10) : v5;
        v21 = v8.length() > v10 ? v8.substring(v7_1, v10) : v8;
        String v30 = v13.length() > 120 ? v13.substring(v7_1, 0x5E1D7401) : v13;
        return new ax(v6, v0_1, v14, v9_1, v15, v16, v18, false, v1, v2, v31, 0, v3_1, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30);
    }

    public ax ar() {
        int v7_1;
        int v24;
        String v3_1;
        int[] v28;
        int v31;
        int v25;
        int v29;
        String v33;
        String v19;
        String v18;
        int v11;
        int v8_1;
        int v9_1;
        int v14;
        String v9;
        String v5;
        String v0;
        int v6;
        int v1 = 4;
        int v2 = 3;
        int v3 = 2;
        if(dp.au.startsWith("win")) {
            v6 = 1;
        }
        else if(dp.au.startsWith("mac")) {
            v6 = 2;
        }
        else if(dp.au.startsWith("linux")) {
            v6 = 3;
        }
        else {
            v6 = 4;
        }

        try {
            v0 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v0 = "";
        }

        try {
            v5 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v5 = "";
        }

        String v7 = "Unknown";
        String v8 = "1.1";
        try {
            v9 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v9 = v7;
            goto label_41;
        }

        try {
            v7 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_41:
            v7 = v8;
        }

        boolean v0_1 = (v0.startsWith("amd64")) || (v0.startsWith("x86_64")) ? true : false;
        int v12 = -1;
        if(1 == v6) {
            if(v5.indexOf("4.0") != v12) {
                v14 = 1;
            }
            else if(v5.indexOf("4.1") != v12) {
                v14 = 2;
            }
            else if(v5.indexOf("4.9") != v12) {
                v14 = 3;
            }
            else if(v5.indexOf("5.0") != v12) {
                v14 = 4;
            }
            else if(v5.indexOf("5.1") != v12) {
                v14 = 5;
            }
            else if(v5.indexOf("5.2") != v12) {
                v14 = 8;
            }
            else if(v5.indexOf("6.0") != v12) {
                v14 = 6;
            }
            else if(v5.indexOf("6.1") != v12) {
                v14 = 7;
            }
            else if(v5.indexOf("6.2") != v12) {
                v14 = 9;
            }
            else if(v5.indexOf("6.3") != v12) {
                v14 = 10;
            }
            else if(v5.indexOf("10.0") != v12) {
                v14 = 11;
            }
            else {
                goto label_176;
            }
        }
        else if(v6 != v3) {
        label_176:
            v14 = 0;
        }
        else if(v5.indexOf("10.4") != v12) {
            v14 = 20;
        }
        else if(v5.indexOf("10.5") != v12) {
            v14 = 21;
        }
        else if(v5.indexOf("10.6") != v12) {
            v14 = 22;
        }
        else if(v5.indexOf("10.7") != v12) {
            v14 = 23;
        }
        else if(v5.indexOf("10.8") != v12) {
            v14 = 24;
        }
        else if(v5.indexOf("10.9") != v12) {
            v14 = 25;
        }
        else if(v5.indexOf("10.10") != v12) {
            v14 = 26;
        }
        else if(v5.indexOf("10.11") != v12) {
            v14 = 27;
        }
        else if(v5.indexOf("10.12") != v12) {
            v14 = 28;
        }
        else if(v5.indexOf("10.13") != v12) {
            v14 = 29;
        }
        else {
            goto label_176;
        }

        if(v9.toLowerCase().indexOf("sun") != v12) {
            v9_1 = 1;
        }
        else if(v9.toLowerCase().indexOf("microsoft") != v12) {
            v9_1 = 2;
        }
        else if(v9.toLowerCase().indexOf("apple") != v12) {
            v9_1 = 3;
        }
        else if(v9.toLowerCase().indexOf("oracle") != v12) {
            v9_1 = 5;
        }
        else {
            v9_1 = 4;
        }

        int v5_1 = 2;
        int v15 = 0;
        while(true) {
            v8_1 = 57;
            int v13 = 0x30;
            try {
                if(v5_1 < v7.length()) {
                    v12 = v7.charAt(v5_1);
                    if(v12 >= v13) {
                        goto label_210;
                    }
                }
            }
            catch(Exception ) {
            }

            break;
        label_210:
            if(v12 <= v8_1) {
                v15 = v15 * 10 + (v12 - 0x30);
                ++v5_1;
                continue;
            }

            break;
        }

        v5_1 = v7.indexOf(46, v3) + 1;
        v12 = 0;
        try {
            while(true) {
            label_221:
                if(v5_1 < v7.length()) {
                    v11 = v7.charAt(v5_1);
                    if(v11 >= v13) {
                        break;
                    }
                }

                goto label_231;
            }
        }
        catch(Exception ) {
            goto label_231;
        }

        if(v11 <= v8_1) {
            v12 = v12 * 10 + (v11 - 0x30);
            ++v5_1;
            goto label_221;
        }

    label_231:
        v1 = v7.indexOf(0x5F, v1) + 1;
        int v16 = 0;
        try {
            while(true) {
            label_235:
                if(v1 < v7.length()) {
                    v5_1 = v7.charAt(v1);
                    if(v5_1 >= v13) {
                        break;
                    }
                }

                goto label_245;
            }
        }
        catch(Exception ) {
            goto label_245;
        }

        if(v5_1 <= v8_1) {
            v16 = v16 * 10 + (v5_1 - 0x30);
            ++v1;
            goto label_235;
        }

    label_245:
        v1 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
        v2 = v15 > v2 ? Runtime.getRuntime().availableProcessors() : 0;
        v5 = "";
        v7 = "";
        v8 = "";
        String v13_1 = "";
        Calendar v4 = Calendar.getInstance();
        String v32 = "";
        v4.setTime(new Date(-9223372036854775808L));
        int[] v10 = new int[0];
        if(com.jagex.oldscape.osrenderer.ax.ax(1111850103)) {
            v5 = com.jagex.oldscape.osrenderer.ax.bu(0xB8E1EAB3);
            v7 = com.jagex.oldscape.osrenderer.ax.bs(0x606B29C4);
            v3 = com.jagex.oldscape.osrenderer.ax.be(0x67BFBF7C);
            v8_1 = com.jagex.oldscape.osrenderer.ax.bl(-22823);
            int v10_1 = com.jagex.oldscape.osrenderer.ax.br(685453740);
            v11 = com.jagex.oldscape.osrenderer.ax.bi(33);
            int[] v13_2 = com.jagex.oldscape.osrenderer.ax.ca(1304812425);
            String v17 = com.jagex.oldscape.osrenderer.ax.cj(0xAEA3ECEC);
            v18 = com.jagex.oldscape.osrenderer.ax.cf(-2105247506);
            v19 = com.jagex.oldscape.osrenderer.ax.cx(0x400);
            v33 = v7;
            v4.setTimeInMillis(com.jagex.oldscape.osrenderer.ax.cd(-2034836018) * 1000);
            v29 = v3;
            v25 = v10_1;
            v31 = v11;
            v28 = v13_2;
            v3_1 = v17;
            v24 = v8_1;
            v7_1 = 2;
        }
        else {
            v33 = v7;
            v18 = v8;
            v28 = v10;
            v19 = v13_1;
            v3_1 = v32;
            v7_1 = 2;
            v24 = -1;
            v25 = -1;
            v29 = -1;
            v31 = -1;
        }

        int v23 = v4.get(v7_1) + 1;
        int v22 = v4.get(1);
        String v4_1 = "";
        if(v18 == null) {
            v18 = "";
        }

        v7 = v18;
        v8 = "";
        if(v19 == null) {
            v19 = "";
        }

        String v10_2 = v19;
        String v26 = v33 == null ? "" : v33;
        if(v5 == null) {
            v5 = "";
        }

        String v27 = v5;
        v11 = 40;
        if(v4_1.length() > v11) {
            v5_1 = 0;
            v4_1 = v4_1.substring(0, v11);
        }
        else {
            v5_1 = 0;
        }

        v18 = v4_1;
        v19 = v7.length() > v11 ? v7.substring(v5_1, v11) : v7;
        v7_1 = 10;
        String v20 = v8.length() > v7_1 ? v8.substring(v5_1, v7_1) : v8;
        String v21 = v10_2.length() > v7_1 ? v10_2.substring(v5_1, v7_1) : v10_2;
        v7_1 = 120;
        if(v3_1.length() > v7_1) {
            v3_1 = v3_1.substring(v5_1, v7_1);
        }

        return new ax(v6, v0_1, v14, v9_1, v15, v12, v16, false, v1, v2, v31, 0, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v3_1);
    }

    public ax ax(int arg36) {
        ax v5_2;
        int v7_1;
        int v24;
        String v3_1;
        int[] v28;
        int v31;
        int v25;
        int v29;
        String v33;
        String v19;
        String v18;
        int v16;
        int v11;
        int v8_1;
        int v9_1;
        int v14;
        int v12;
        boolean v0_2;
        String v9;
        String v5;
        String v0_1;
        int v6;
        int v3;
        int v2;
        int v1;
        try {
            v1 = 4;
            v2 = 3;
            v3 = 2;
            if(dp.au.startsWith("win")) {
                v6 = 1;
            }
            else if(dp.au.startsWith("mac")) {
                v6 = 2;
            }
            else if(dp.au.startsWith("linux")) {
                goto label_20;
            }
            else {
                goto label_22;
            }

            goto label_23;
        }
        catch(RuntimeException v0) {
            goto label_386;
        }

    label_20:
        v6 = 3;
        goto label_23;
    label_22:
        v6 = 4;
        try {
        label_23:
            v0_1 = System.getProperty("os.arch").toLowerCase();
        }
        catch(Exception ) {
            v0_1 = "";
        }

        try {
            v5 = System.getProperty("os.version").toLowerCase();
        }
        catch(Exception ) {
            v5 = "";
        }

        String v7 = "Unknown";
        String v8 = "1.1";
        try {
            v9 = System.getProperty("java.vendor");
        }
        catch(Exception ) {
            v9 = v7;
            goto label_41;
        }

        try {
            v7 = System.getProperty("java.version");
        }
        catch(Exception ) {
        label_41:
            v7 = v8;
        }

        try {
            v0_2 = (v0_1.startsWith("amd64")) || (v0_1.startsWith("x86_64")) ? true : false;
            v12 = -1;
            if(1 == v6) {
                if(v5.indexOf("4.0") != v12) {
                    v14 = 1;
                }
                else if(v5.indexOf("4.1") != v12) {
                    v14 = 2;
                }
                else if(v5.indexOf("4.9") != v12) {
                    v14 = 3;
                }
                else if(v5.indexOf("5.0") != v12) {
                    v14 = 4;
                }
                else if(v5.indexOf("5.1") != v12) {
                    v14 = 5;
                }
                else if(v5.indexOf("5.2") != v12) {
                    v14 = 8;
                }
                else if(v5.indexOf("6.0") != v12) {
                    v14 = 6;
                }
                else if(v5.indexOf("6.1") != v12) {
                    v14 = 7;
                }
                else if(v5.indexOf("6.2") != v12) {
                    v14 = 9;
                }
                else if(v5.indexOf("6.3") != v12) {
                    v14 = 10;
                }
                else if(v5.indexOf("10.0") != v12) {
                    v14 = 11;
                }
                else {
                    goto label_176;
                }
            }
            else if(v6 != v3) {
            label_176:
                v14 = 0;
            }
            else if(v5.indexOf("10.4") != v12) {
                v14 = 20;
            }
            else if(v5.indexOf("10.5") != v12) {
                v14 = 21;
            }
            else if(v5.indexOf("10.6") != v12) {
                v14 = 22;
            }
            else if(v5.indexOf("10.7") != v12) {
                v14 = 23;
            }
            else if(v5.indexOf("10.8") != v12) {
                v14 = 24;
            }
            else if(v5.indexOf("10.9") != v12) {
                v14 = 25;
            }
            else if(v5.indexOf("10.10") != v12) {
                v14 = 26;
            }
            else if(v5.indexOf("10.11") != v12) {
                v14 = 27;
            }
            else if(v5.indexOf("10.12") != v12) {
                v14 = 28;
            }
            else if(v5.indexOf("10.13") != v12) {
                v14 = 29;
            }
            else {
                goto label_176;
            }

            if(v9.toLowerCase().indexOf("sun") != v12) {
                v9_1 = 1;
            }
            else if(v9.toLowerCase().indexOf("microsoft") != v12) {
                v9_1 = 2;
            }
            else if(v9.toLowerCase().indexOf("apple") != v12) {
                v9_1 = 3;
            }
            else if(v9.toLowerCase().indexOf("oracle") != v12) {
                goto label_199;
            }
            else {
                goto label_201;
            }

            goto label_202;
        }
        catch(RuntimeException v0) {
            goto label_386;
        }

    label_199:
        v9_1 = 5;
        goto label_202;
    label_201:
        v9_1 = 4;
    label_202:
        int v5_1 = 2;
        int v15 = 0;
        while(true) {
            v8_1 = 57;
            int v13 = 0x30;
            try {
                if(v5_1 < v7.length()) {
                    v12 = v7.charAt(v5_1);
                    if(v12 >= v13) {
                        goto label_210;
                    }
                }

                break;
            }
            catch(RuntimeException v0) {
                goto label_386;
            }
            catch(Exception ) {
                break;
            }

        label_210:
            if(v12 <= v8_1) {
                v15 = v15 * 10 + (v12 - 0x30);
                ++v5_1;
                continue;
            }

            break;
        }

        v5_1 = 46;
        try {
            v5_1 = v7.indexOf(v5_1, v3) + 1;
            v12 = 0;
            try {
                while(true) {
                label_221:
                    if(v5_1 < v7.length()) {
                        v11 = v7.charAt(v5_1);
                        if(v11 >= v13) {
                            break;
                        }
                    }

                    goto label_231;
                }
            }
            catch(Exception ) {
                goto label_231;
            }
        }
        catch(RuntimeException v0) {
            goto label_386;
        }

        if(v11 <= v8_1) {
            v12 = v12 * 10 + (v11 - 0x30);
            ++v5_1;
            goto label_221;
        }

    label_231:
        v5_1 = 0x5F;
        try {
            v1 = v7.indexOf(v5_1, v1) + 1;
            v16 = 0;
            try {
                while(true) {
                label_235:
                    if(v1 < v7.length()) {
                        v5_1 = v7.charAt(v1);
                        if(v5_1 >= v13) {
                            break;
                        }
                    }

                    goto label_245;
                }
            }
            catch(Exception ) {
                goto label_245;
            }
        }
        catch(RuntimeException v0) {
            goto label_386;
        }

        if(v5_1 <= v8_1) {
            v16 = v16 * 10 + (v5_1 - 0x30);
            ++v1;
            goto label_235;
        }

        try {
        label_245:
            v1 = (((int)(Runtime.getRuntime().maxMemory() / 0x100000))) + 1;
            v2 = v15 > v2 ? Runtime.getRuntime().availableProcessors() : 0;
            v5 = "";
            v7 = "";
            v8 = "";
            String v13_1 = "";
            Calendar v4 = Calendar.getInstance();
            String v32 = "";
            v4.setTime(new Date(-9223372036854775808L));
            int[] v10 = new int[0];
            if(com.jagex.oldscape.osrenderer.ax.ax(0xFD6B6033)) {
                v5 = com.jagex.oldscape.osrenderer.ax.bu(0xC2FED1A5);
                v7 = com.jagex.oldscape.osrenderer.ax.bs(0x606B29C4);
                v3 = com.jagex.oldscape.osrenderer.ax.be(-310936206);
                v8_1 = com.jagex.oldscape.osrenderer.ax.bl(-14996);
                int v10_1 = com.jagex.oldscape.osrenderer.ax.br(-507170080);
                v11 = com.jagex.oldscape.osrenderer.ax.bi(0x20);
                int[] v13_2 = com.jagex.oldscape.osrenderer.ax.ca(1304812425);
                String v17 = com.jagex.oldscape.osrenderer.ax.cj(0xD66CCDAC);
                v18 = com.jagex.oldscape.osrenderer.ax.cf(0x391F6575);
                v19 = com.jagex.oldscape.osrenderer.ax.cx(0x400);
                v33 = v7;
                v4.setTimeInMillis(com.jagex.oldscape.osrenderer.ax.cd(-1484141086) * 1000);
                v29 = v3;
                v25 = v10_1;
                v31 = v11;
                v28 = v13_2;
                v3_1 = v17;
                v24 = v8_1;
                v7_1 = 2;
            }
            else {
                v33 = v7;
                v18 = v8;
                v28 = v10;
                v19 = v13_1;
                v3_1 = v32;
                v7_1 = 2;
                v24 = -1;
                v25 = -1;
                v29 = -1;
                v31 = -1;
            }

            int v23 = v4.get(v7_1) + 1;
            int v22 = v4.get(1);
            String v4_1 = "";
            if(v18 == null) {
                v18 = "";
            }

            v7 = v18;
            v8 = "";
            if(v19 == null) {
                v19 = "";
            }

            String v10_2 = v19;
            String v26 = v33 == null ? "" : v33;
            if(v5 == null) {
                v5 = "";
            }

            String v27 = v5;
            v11 = 40;
            if(v4_1.length() > v11) {
                v5_1 = 0;
                v4_1 = v4_1.substring(0, v11);
            }
            else {
                v5_1 = 0;
            }

            v18 = v4_1;
            v19 = v7.length() > v11 ? v7.substring(v5_1, v11) : v7;
            v7_1 = 10;
            String v20 = v8.length() > v7_1 ? v8.substring(v5_1, v7_1) : v8;
            String v21 = v10_2.length() > v7_1 ? v10_2.substring(v5_1, v7_1) : v10_2;
            v7_1 = 120;
            if(v3_1.length() > v7_1) {
                v3_1 = v3_1.substring(v5_1, v7_1);
            }

            v5_2 = new ax(v6, v0_2, v14, v9_1, v15, v12, v16, false, v1, v2, v31, 0, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v3_1);
        }
        catch(RuntimeException v0) {
            goto label_386;
        }

        return v5_2;
    label_386:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("ae.ax(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    }
}

