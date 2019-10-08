public class mf {
    static final char[] ae = null;
    static final int al = 12;
    public static final int an = 14;
    public static final int aq = 1;
    static final char[] ar = null;
    static final int ax = 1;
    public static final int bx = 39;
    static ki dc;
    static int dj;

    static {
        mf.ae = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        mf.ar = new char[]{'[', ']', '#'};
    }

    mf() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mf.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static String aa(CharSequence arg5, ml arg6) {
        StringBuilder v6;
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        int v1 = 0;
        int v2 = arg5.length();
        while(v1 < v2) {
            if(!jy.ae(arg5.charAt(v1), 0xF44FF26C)) {
                break;
            }

            ++v1;
        }

        while(v2 > v1) {
            if(!jy.ae(arg5.charAt(v2 - 1), 1059031202)) {
                break;
            }

            --v2;
        }

        int v3 = v2 - v1;
        if(v3 >= 1) {
            if(v3 > iu.ax(arg6, -900939569)) {
            }
            else {
                v6 = new StringBuilder(v3);
                goto label_29;
            }
        }

        return v0;
    label_29:
        while(v1 < v2) {
            char v3_1 = arg5.charAt(v1);
            if(!fp.al(v3_1, -1)) {
            }
            else {
                v3_1 = jw.an(v3_1, 0x572337CA);
                if(v3_1 == 0) {
                }
                else {
                    v6.append(v3_1);
                }
            }

            ++v1;
        }

        if(v6.length() == 0) {
            return v0;
        }

        return v6.toString();
    }

    static final boolean ab(char arg5) {
        if(Character.isISOControl(arg5)) {
            return 0;
        }

        if(ev.aa(arg5, 0x26D6F80D)) {
            return 1;
        }

        char[] v0 = mf.ae;
        int v3;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(arg5 == v0[v3]) {
                return 1;
            }
        }

        v0 = mf.ar;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(v0[v3] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    static final boolean ad(char arg5) {
        if(Character.isISOControl(arg5)) {
            return 0;
        }

        if(ev.aa(arg5, 0xA875FE5D)) {
            return 1;
        }

        char[] v0 = mf.ae;
        int v3;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(arg5 == v0[v3]) {
                return 1;
            }
        }

        v0 = mf.ar;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(v0[v3] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    static final boolean af(char arg1) {
        boolean v1 = 0x705D1E24 == arg1 || 0x20 == arg1 || 0x5F == arg1 || arg1 == 45 ? true : false;
        return v1;
    }

    static char ag(char arg0) {
        switch(arg0) {
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                break;
            }
            default: {
                switch(arg0) {
                    case 199: {
                        return 'c';
                    }
                    case 200: 
                    case 201: 
                    case 202: 
                    case 203: {
                        return 'e';
                    }
                }

                switch(arg0) {
                    case 205: 
                    case 206: 
                    case 207: {
                        break;
                    }
                    default: {
                        switch(arg0) {
                            case 209: {
                                return 'n';
                            }
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: {
                                return 'o';
                            }
                        }

                        switch(arg0) {
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: {
                                return 'u';
                            }
                            default: {
                                switch(arg0) {
                                    case 223: {
                                        return 'b';
                                    }
                                    case 224: 
                                    case 225: 
                                    case 226: 
                                    case 227: 
                                    case 228: {
                                        return 'a';
                                    }
                                }

                                switch(arg0) {
                                    case 231: {
                                        return 'c';
                                    }
                                    case 232: 
                                    case 233: 
                                    case 234: 
                                    case 235: {
                                        return 'e';
                                    }
                                }

                                switch(arg0) {
                                    case 237: 
                                    case 238: 
                                    case 239: {
                                        return 'i';
                                    }
                                    default: {
                                        switch(arg0) {
                                            case 241: {
                                                return 'n';
                                            }
                                            case 242: 
                                            case 243: 
                                            case 244: 
                                            case 245: 
                                            case 246: {
                                                return 'o';
                                            }
                                        }

                                        switch(arg0) {
                                            case 249: 
                                            case 250: 
                                            case 251: 
                                            case 252: {
                                                break;
                                            }
                                            default: {
                                                switch(arg0) {
                                                    case 35: 
                                                    case 91: 
                                                    case 93: {
                                                        return arg0;
                                                    }
                                                    case 32: 
                                                    case 45: 
                                                    case 95: 
                                                    case 160: {
                                                        return '_';
                                                    }
                                                    case 255: 
                                                    case 376: {
                                                        return 'y';
                                                    }
                                                }

                                                return Character.toLowerCase(arg0);
                                            }
                                        }

                                        return 'u';
                                    }
                                }
                            }
                        }
                    }
                }

                return 'i';
            }
        }

        return 'a';
    }

    static char ah(char arg0) {
        switch(arg0) {
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                break;
            }
            default: {
                switch(arg0) {
                    case 199: {
                        return 'c';
                    }
                    case 200: 
                    case 201: 
                    case 202: 
                    case 203: {
                        return 'e';
                    }
                }

                switch(arg0) {
                    case 205: 
                    case 206: 
                    case 207: {
                        break;
                    }
                    default: {
                        switch(arg0) {
                            case 209: {
                                return 'n';
                            }
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: {
                                return 'o';
                            }
                        }

                        switch(arg0) {
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: {
                                return 'u';
                            }
                            default: {
                                switch(arg0) {
                                    case 223: {
                                        return 'b';
                                    }
                                    case 224: 
                                    case 225: 
                                    case 226: 
                                    case 227: 
                                    case 228: {
                                        return 'a';
                                    }
                                }

                                switch(arg0) {
                                    case 231: {
                                        return 'c';
                                    }
                                    case 232: 
                                    case 233: 
                                    case 234: 
                                    case 235: {
                                        return 'e';
                                    }
                                }

                                switch(arg0) {
                                    case 237: 
                                    case 238: 
                                    case 239: {
                                        return 'i';
                                    }
                                    default: {
                                        switch(arg0) {
                                            case 241: {
                                                return 'n';
                                            }
                                            case 242: 
                                            case 243: 
                                            case 244: 
                                            case 245: 
                                            case 246: {
                                                return 'o';
                                            }
                                        }

                                        switch(arg0) {
                                            case 249: 
                                            case 250: 
                                            case 251: 
                                            case 252: {
                                                break;
                                            }
                                            default: {
                                                switch(arg0) {
                                                    case 35: 
                                                    case 91: 
                                                    case 93: {
                                                        return arg0;
                                                    }
                                                    case 32: 
                                                    case 45: 
                                                    case 95: 
                                                    case 160: {
                                                        return '_';
                                                    }
                                                    case 255: 
                                                    case 376: {
                                                        return 'y';
                                                    }
                                                }

                                                return Character.toLowerCase(arg0);
                                            }
                                        }

                                        return 'u';
                                    }
                                }
                            }
                        }
                    }
                }

                return 'i';
            }
        }

        return 'a';
    }

    public static String ai(CharSequence arg5, ml arg6) {
        StringBuilder v6;
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        int v1 = 0;
        int v2 = arg5.length();
        while(v1 < v2) {
            if(!jy.ae(arg5.charAt(v1), 1250473008)) {
                break;
            }

            ++v1;
        }

        while(v2 > v1) {
            if(!jy.ae(arg5.charAt(v2 - 1), 0x4A5A4299)) {
                break;
            }

            --v2;
        }

        int v3 = v2 - v1;
        if(v3 >= 1) {
            if(v3 > iu.ax(arg6, -900939569)) {
            }
            else {
                v6 = new StringBuilder(v3);
                goto label_29;
            }
        }

        return v0;
    label_29:
        while(v1 < v2) {
            char v3_1 = arg5.charAt(v1);
            if(!fp.al(v3_1, 0x40)) {
            }
            else {
                v3_1 = jw.an(v3_1, 0x55271E1F);
                if(v3_1 == 0) {
                }
                else {
                    v6.append(v3_1);
                }
            }

            ++v1;
        }

        if(v6.length() == 0) {
            return v0;
        }

        return v6.toString();
    }

    static final boolean aj(char arg5) {
        if(Character.isISOControl(arg5)) {
            return 0;
        }

        if(ev.aa(arg5, 0x13E1B2FC)) {
            return 1;
        }

        char[] v0 = mf.ae;
        int v3;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(arg5 == v0[v3]) {
                return 1;
            }
        }

        v0 = mf.ar;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(v0[v3] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    public static String am(CharSequence arg5, ml arg6) {
        StringBuilder v6;
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        int v1 = 0;
        int v2 = arg5.length();
        while(v1 < v2) {
            if(!jy.ae(arg5.charAt(v1), 0xF01D44F)) {
                break;
            }

            ++v1;
        }

        while(v2 > v1) {
            if(!jy.ae(arg5.charAt(v2 - 1), 0x766EBC2D)) {
                break;
            }

            --v2;
        }

        int v3 = v2 - v1;
        if(v3 >= 1) {
            if(v3 > iu.ax(arg6, -900939569)) {
            }
            else {
                v6 = new StringBuilder(v3);
                goto label_29;
            }
        }

        return v0;
    label_29:
        while(v1 < v2) {
            char v3_1 = arg5.charAt(v1);
            if(!fp.al(v3_1, -7)) {
            }
            else {
                v3_1 = jw.an(v3_1, 1216520920);
                if(v3_1 == 0) {
                }
                else {
                    v6.append(v3_1);
                }
            }

            ++v1;
        }

        if(v6.length() == 0) {
            return v0;
        }

        return v6.toString();
    }

    static final boolean aq(char arg5) {
        if(Character.isISOControl(arg5)) {
            return 0;
        }

        if(ev.aa(arg5, 0x19E1D02)) {
            return 1;
        }

        char[] v0 = mf.ae;
        int v3;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(arg5 == v0[v3]) {
                return 1;
            }
        }

        v0 = mf.ar;
        for(v3 = 0; v3 < v0.length; ++v3) {
            if(v0[v3] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    public static String at(String arg2) {
        if(arg2 != null && !arg2.isEmpty()) {
            if(arg2.charAt(0) == 35) {
            }
            else {
                return arg2;
            }
        }

        return "";
    }

    public static String au(CharSequence arg5, ml arg6) {
        StringBuilder v6;
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        int v1 = 0;
        int v2 = arg5.length();
        while(v1 < v2) {
            if(!jy.ae(arg5.charAt(v1), 0x6D4D3B4F)) {
                break;
            }

            ++v1;
        }

        while(v2 > v1) {
            if(!jy.ae(arg5.charAt(v2 - 1), -622774900)) {
                break;
            }

            --v2;
        }

        int v3 = v2 - v1;
        if(v3 >= 1) {
            if(v3 > iu.ax(arg6, -900939569)) {
            }
            else {
                v6 = new StringBuilder(v3);
                goto label_29;
            }
        }

        return v0;
    label_29:
        while(v1 < v2) {
            char v3_1 = arg5.charAt(v1);
            if(!fp.al(v3_1, -36)) {
            }
            else {
                v3_1 = jw.an(v3_1, 1807337704);
                if(v3_1 == 0) {
                }
                else {
                    v6.append(v3_1);
                }
            }

            ++v1;
        }

        if(v6.length() == 0) {
            return v0;
        }

        return v6.toString();
    }

    public static String av(CharSequence arg5, ml arg6) {
        StringBuilder v6;
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        int v1 = 0;
        int v2 = arg5.length();
        while(v1 < v2) {
            if(!jy.ae(arg5.charAt(v1), -703055643)) {
                break;
            }

            ++v1;
        }

        while(v2 > v1) {
            if(!jy.ae(arg5.charAt(v2 - 1), 0x7D660BE7)) {
                break;
            }

            --v2;
        }

        int v3 = v2 - v1;
        if(v3 >= 1) {
            if(v3 > iu.ax(arg6, -900939569)) {
            }
            else {
                v6 = new StringBuilder(v3);
                goto label_29;
            }
        }

        return v0;
    label_29:
        while(v1 < v2) {
            char v3_1 = arg5.charAt(v1);
            if(!fp.al(v3_1, -2)) {
            }
            else {
                v3_1 = jw.an(v3_1, 2107227571);
                if(v3_1 == 0) {
                }
                else {
                    v6.append(v3_1);
                }
            }

            ++v1;
        }

        if(v6.length() == 0) {
            return v0;
        }

        return v6.toString();
    }

    static char az(char arg0) {
        switch(arg0) {
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                break;
            }
            default: {
                switch(arg0) {
                    case 199: {
                        return 'c';
                    }
                    case 200: 
                    case 201: 
                    case 202: 
                    case 203: {
                        return 'e';
                    }
                }

                switch(arg0) {
                    case 205: 
                    case 206: 
                    case 207: {
                        break;
                    }
                    default: {
                        switch(arg0) {
                            case 209: {
                                return 'n';
                            }
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: {
                                return 'o';
                            }
                        }

                        switch(arg0) {
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: {
                                return 'u';
                            }
                            default: {
                                switch(arg0) {
                                    case 223: {
                                        return 'b';
                                    }
                                    case 224: 
                                    case 225: 
                                    case 226: 
                                    case 227: 
                                    case 228: {
                                        return 'a';
                                    }
                                }

                                switch(arg0) {
                                    case 231: {
                                        return 'c';
                                    }
                                    case 232: 
                                    case 233: 
                                    case 234: 
                                    case 235: {
                                        return 'e';
                                    }
                                }

                                switch(arg0) {
                                    case 237: 
                                    case 238: 
                                    case 239: {
                                        return 'i';
                                    }
                                    default: {
                                        switch(arg0) {
                                            case 241: {
                                                return 'n';
                                            }
                                            case 242: 
                                            case 243: 
                                            case 244: 
                                            case 245: 
                                            case 246: {
                                                return 'o';
                                            }
                                        }

                                        switch(arg0) {
                                            case 249: 
                                            case 250: 
                                            case 251: 
                                            case 252: {
                                                break;
                                            }
                                            default: {
                                                switch(arg0) {
                                                    case 35: 
                                                    case 91: 
                                                    case 93: {
                                                        return arg0;
                                                    }
                                                    case 32: 
                                                    case 45: 
                                                    case 95: 
                                                    case 160: {
                                                        return '_';
                                                    }
                                                    case 255: 
                                                    case 376: {
                                                        return 'y';
                                                    }
                                                }

                                                return Character.toLowerCase(arg0);
                                            }
                                        }

                                        return 'u';
                                    }
                                }
                            }
                        }
                    }
                }

                return 'i';
            }
        }

        return 'a';
    }

    static final void dy(byte arg11) {
        try {
            mx v6;
            for(v6 = client.kq.aj(); v6 != null; v6 = client.kq.aq()) {
                int v0 = 0xB7140409;
                if(((ia)v6).ae * v0 != kt.jz * 1101813865 || (((ia)v6).ab)) {
                    ((ia)v6).lp();
                }
                else if(client.bj * -2077001153 >= ((ia)v6).al * 0xCD3292DF) {
                    ((ia)v6).ax(client.gs * 0x65B3A7FD, 0x7F08000E);
                    if(((ia)v6).ab) {
                        ((ia)v6).lp();
                    }
                    else {
                        ee.fs.ai(((ia)v6).ae * v0, 1068590781 * ((ia)v6).ar, 0x91CFA9D3 * ((ia)v6).an, -118990919 * ((ia)v6).ap, 60, ((bm)v6), 0, -1, false);
                    }
                }
            }
        }
        catch(RuntimeException v11) {
            goto label_57;
        }

        return;
    label_57:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("mf.dy(");
        v0_1.append(')');
        throw lx.al(((Throwable)v11), v0_1.toString());
    }
}

