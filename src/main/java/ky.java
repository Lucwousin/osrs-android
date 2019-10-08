public class ky extends hz {
    gv ae;
    public static final int aj = 6;
    fi al;
    ks ax;
    public static final int bl = 67;

    ky(ks arg3) {
        try {
            super();
            this.al = new fi();
            this.ae = new gv();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ky.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ab(kc arg8, int arg9) {
        int v2 = -1487360653;
        if((this.ax.ay[arg8.ax * v2] & 4) != 0 && arg8.au * 0x46310CB9 < 0) {
            int v0 = this.ax.ac[arg8.ax * v2] / (ht.ax * 0x2C18D40D);
            int v1 = (0x32A22302 + v0 - arg8.aw * 204849425) / v0;
            arg8.aw = (0xFFFFF & v0 * arg9 + arg8.aw * 204849425) * 29930262;
            if(v1 <= arg9) {
                if(this.ax.as[arg8.ax * v2] == 0) {
                    arg8.ah = hx.ar(arg8.ae, arg8.ah.as(), arg8.ah.au(), arg8.ah.am());
                }
                else {
                    boolean v3 = false;
                    arg8.ah = hx.ar(arg8.ae, arg8.ah.as(), 0, arg8.ah.am());
                    ks v9 = this.ax;
                    if(arg8.al.ae[arg8.ap * 0x44A85BE3] < 0) {
                        v3 = true;
                    }

                    v9.ag(arg8, v3, 0x3A46FE16);
                }

                if(arg8.al.ae[arg8.ap * 0x1D70CF25] < 0) {
                    arg8.ah.ab(-1);
                }

                arg9 = arg8.aw * 0xBFBD408 / v0;
            }
        }

        arg8.ah.af(arg9);
    }

    protected hz ac() {
        mx v0 = this.al.aj();
        if(v0 == null) {
            return null;
        }

        if(((kc)v0).ah != null) {
            return ((kc)v0).ah;
        }

        return this.aj();
    }

    protected int ad() {
        return 0;
    }

    void ae(kc arg11, int[] arg12, int arg13, int arg14, int arg15) {
        int v4;
        int v2 = -1487360653;
        if((this.ax.ay[arg11.ax * v2] & 4) != 0 && arg11.au * 0x46310CB9 < 0) {
            int v3 = 0x2C18D40D;
            int v0 = this.ax.ac[arg11.ax * v2] / (ht.ax * v3);
            while(true) {
                int v1 = (0xFFFFF + v0 - arg11.aw * 204849425) / v0;
                v4 = 0x8DC14FF1;
                if(v1 > arg14) {
                    break;
                }

                arg11.ah.aq(arg12, arg13, v1);
                arg13 += v1;
                arg14 -= v1;
                arg11.aw += (v1 * v0 - 0x100000) * v4;
                v1 = ht.ax * v3 / 100;
                v4 = 0x40000 / v0;
                if(v4 < v1) {
                    v1 = v4;
                }

                hx v4_1 = arg11.ah;
                int v6 = 0x1D70CF25;
                if(this.ax.as[arg11.ax * v2] == 0) {
                    arg11.ah = hx.ar(arg11.ae, v4_1.as(), v4_1.au(), v4_1.am());
                }
                else {
                    boolean v9 = false;
                    arg11.ah = hx.ar(arg11.ae, v4_1.as(), 0, v4_1.am());
                    ks v5 = this.ax;
                    if(arg11.al.ae[arg11.ap * v6] < 0) {
                        v9 = true;
                    }

                    v5.ag(arg11, v9, 0x681E88CD);
                    arg11.ah.at(v1, v4_1.au());
                }

                if(arg11.al.ae[arg11.ap * v6] < 0) {
                    arg11.ah.ab(-1);
                }

                v4_1.aw(v1);
                v4_1.aq(arg12, arg13, arg15 - arg13);
                if(!v4_1.bv()) {
                    continue;
                }

                this.ae.ax(((hz)v4_1));
            }

            arg11.aw += v0 * arg14 * v4;
        }

        arg11.ah.aq(arg12, arg13, arg14);
    }

    protected void af(int arg9) {
        try {
            this.ae.af(arg9);
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                if(this.ax.bu(((kc)v0), -122)) {
                }
                else {
                    int v1 = arg9;
                    while(true) {
                        int v3 = 0x9F8D766B;
                        if(v1 > ((kc)v0).at * v3) {
                            this.al(((kc)v0), ((kc)v0).at * v3, 1064);
                            int v7 = v1 - ((kc)v0).at * v3;
                            if(this.ax.bs(v0, null, 0, v7, 0xD3FAF878)) {
                            }
                            else {
                                v1 = v7;
                                continue;
                            }
                        }
                        else {
                            break;
                        }

                        goto label_40;
                    }

                    this.al(((kc)v0), v1, -2617);
                    ((kc)v0).at -= v1 * 159024707;
                }

            label_40:
            }
        }
        catch(RuntimeException v9) {
            goto label_46;
        }

        return;
    label_46:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ky.af(");
        v0_1.append(')');
        throw lx.al(((Throwable)v9), v0_1.toString());
    }

    protected hz aj() {
        mx v0_1;
        try {
            do {
                v0_1 = this.al.aq();
                if(v0_1 == null) {
                    return null;
                }
            }
            while(((kc)v0_1).ah == null);

            return ((kc)v0_1).ah;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ky.aj(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void al(kc arg8, int arg9, short arg10) {
        try {
            int v1 = -1487360653;
            if((this.ax.ay[arg8.ax * v1] & 4) != 0 && arg8.au * 0x46310CB9 < 0) {
                int v10 = this.ax.ac[arg8.ax * v1] / (ht.ax * 0x2C18D40D);
                int v4 = 204849425;
                int v2 = (v10 + 0xFFFFF - arg8.aw * v4) / v10;
                arg8.aw = (0xFFFFF & v10 * arg9 + arg8.aw * v4) * 0x8DC14FF1;
                if(v2 <= arg9) {
                    int v0 = 0x1D70CF25;
                    if(this.ax.as[arg8.ax * v1] == 0) {
                        arg8.ah = hx.ar(arg8.ae, arg8.ah.as(), arg8.ah.au(), arg8.ah.am());
                    }
                    else {
                        boolean v3 = false;
                        arg8.ah = hx.ar(arg8.ae, arg8.ah.as(), 0, arg8.ah.am());
                        ks v9 = this.ax;
                        if(arg8.al.ae[arg8.ap * v0] < 0) {
                            v3 = true;
                        }

                        v9.ag(arg8, v3, 0xD9619584);
                    }

                    if(arg8.al.ae[arg8.ap * v0] < 0) {
                        arg8.ah.ab(-1);
                    }

                    arg9 = arg8.aw * v4 / v10;
                }
            }

            arg8.ah.af(arg9);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9_1 = new StringBuilder();
            v9_1.append("ky.al(");
            v9_1.append(')');
            throw lx.al(((Throwable)v8), v9_1.toString());
        }
    }

    void an(kc arg9, int arg10) {
        int v2 = -1487360653;
        if((this.ax.ay[arg9.ax * v2] & 4) != 0 && arg9.au * 0x46310CB9 < 0) {
            int v0 = this.ax.ac[arg9.ax * v2] / (ht.ax * 0x2C18D40D);
            int v5 = 204849425;
            int v3 = (v0 + 0xFFFFF - arg9.aw * v5) / v0;
            arg9.aw = (0xFFFFF & v0 * arg10 + arg9.aw * v5) * 0x8DC14FF1;
            if(v3 <= arg10) {
                int v1 = 0x1D70CF25;
                if(this.ax.as[arg9.ax * v2] == 0) {
                    arg9.ah = hx.ar(arg9.ae, arg9.ah.as(), arg9.ah.au(), arg9.ah.am());
                }
                else {
                    boolean v4 = false;
                    arg9.ah = hx.ar(arg9.ae, arg9.ah.as(), 0, arg9.ah.am());
                    ks v10 = this.ax;
                    if(arg9.al.ae[arg9.ap * v1] < 0) {
                        v4 = true;
                    }

                    v10.ag(arg9, v4, 0xF35CCF05);
                }

                if(arg9.al.ae[arg9.ap * v1] < 0) {
                    arg9.ah.ab(-1);
                }

                arg10 = arg9.aw * v5 / v0;
            }
        }

        arg9.ah.af(arg10);
    }

    protected hz ap() {
        try {
            mx v0_1 = this.al.aj();
            if(v0_1 == null) {
                return null;
            }

            if(((kc)v0_1).ah != null) {
                return ((kc)v0_1).ah;
            }

            return this.aj();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ky.ap(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected void aq(int[] arg12, int arg13, int arg14) {
        try {
            this.ae.aq(arg12, arg13, arg14);
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                if(this.ax.bu(((kc)v0), -123)) {
                }
                else {
                    int v9 = arg13;
                    int v8 = arg14;
                    do {
                        int v10 = 0x9F8D766B;
                        if(v8 > ((kc)v0).at * v10) {
                            this.ax(v0, arg12, v9, ((kc)v0).at * v10, v9 + v8, 0);
                            v9 += ((kc)v0).at * v10;
                            v8 -= ((kc)v0).at * v10;
                            if(!this.ax.bs(v0, arg12, v9, v8, 0xD3FAF878)) {
                                continue;
                            }

                            break;
                        }
                        else {
                            goto label_40;
                        }
                    }
                    while(true);

                    goto label_53;
                label_40:
                    this.ax(v0, arg12, v9, v8, v9 + v8, 0);
                    ((kc)v0).at -= v8 * 159024707;
                }

            label_53:
            }
        }
        catch(RuntimeException v12) {
            goto label_59;
        }

        return;
    label_59:
        StringBuilder v13 = new StringBuilder();
        v13.append("ky.aq(");
        v13.append(')');
        throw lx.al(((Throwable)v12), v13.toString());
    }

    void ar(kc arg11, int[] arg12, int arg13, int arg14, int arg15) {
        int v4;
        int v2 = -1487360653;
        if((this.ax.ay[arg11.ax * v2] & 4) != 0 && arg11.au * 0x46310CB9 < 0) {
            int v3 = 0x2C18D40D;
            int v0 = this.ax.ac[arg11.ax * v2] / (ht.ax * v3);
            while(true) {
                int v1 = (0xFFFFF + v0 - arg11.aw * 204849425) / v0;
                v4 = 0x8DC14FF1;
                if(v1 > arg14) {
                    break;
                }

                arg11.ah.aq(arg12, arg13, v1);
                arg13 += v1;
                arg14 -= v1;
                arg11.aw += (v1 * v0 - 0x100000) * v4;
                v1 = ht.ax * v3 / 100;
                v4 = 0x40000 / v0;
                if(v4 < v1) {
                    v1 = v4;
                }

                hx v4_1 = arg11.ah;
                int v6 = 0x1D70CF25;
                if(this.ax.as[arg11.ax * v2] == 0) {
                    arg11.ah = hx.ar(arg11.ae, v4_1.as(), v4_1.au(), v4_1.am());
                }
                else {
                    boolean v9 = false;
                    arg11.ah = hx.ar(arg11.ae, v4_1.as(), 0, v4_1.am());
                    ks v5 = this.ax;
                    if(arg11.al.ae[arg11.ap * v6] < 0) {
                        v9 = true;
                    }

                    v5.ag(arg11, v9, 0x95BF1DC2);
                    arg11.ah.at(v1, v4_1.au());
                }

                if(arg11.al.ae[arg11.ap * v6] < 0) {
                    arg11.ah.ab(-1);
                }

                v4_1.aw(v1);
                v4_1.aq(arg12, arg13, arg15 - arg13);
                if(!v4_1.bv()) {
                    continue;
                }

                this.ae.ax(((hz)v4_1));
            }

            arg11.aw += v0 * arg14 * v4;
        }

        arg11.ah.aq(arg12, arg13, arg14);
    }

    void ax(kc arg10, int[] arg11, int arg12, int arg13, int arg14, byte arg15) {
        int v3;
        try {
            int v1 = -1487360653;
            if((this.ax.ay[arg10.ax * v1] & 4) != 0 && arg10.au * 0x46310CB9 < 0) {
                int v2 = 0x2C18D40D;
                int v15 = this.ax.ac[arg10.ax * v1] / (ht.ax * v2);
                while(true) {
                    int v0 = (0xFFFFF + v15 - arg10.aw * 204849425) / v15;
                    v3 = 0x8DC14FF1;
                    if(v0 > arg13) {
                        break;
                    }

                    arg10.ah.aq(arg11, arg12, v0);
                    arg12 += v0;
                    arg13 -= v0;
                    arg10.aw += (v0 * v15 - 0x100000) * v3;
                    v0 = ht.ax * v2 / 100;
                    v3 = 0x40000 / v15;
                    if(v3 < v0) {
                        v0 = v3;
                    }

                    hx v3_1 = arg10.ah;
                    int v5 = 0x1D70CF25;
                    if(this.ax.as[arg10.ax * v1] == 0) {
                        arg10.ah = hx.ar(arg10.ae, v3_1.as(), v3_1.au(), v3_1.am());
                    }
                    else {
                        boolean v8 = false;
                        arg10.ah = hx.ar(arg10.ae, v3_1.as(), 0, v3_1.am());
                        ks v4 = this.ax;
                        if(arg10.al.ae[arg10.ap * v5] < 0) {
                            v8 = true;
                        }

                        v4.ag(arg10, v8, 0x8C5F06BD);
                        arg10.ah.at(v0, v3_1.au());
                    }

                    if(arg10.al.ae[arg10.ap * v5] < 0) {
                        arg10.ah.ab(-1);
                    }

                    v3_1.aw(v0);
                    v3_1.aq(arg11, arg12, arg14 - arg12);
                    if(!v3_1.bv()) {
                        continue;
                    }

                    this.ae.ax(((hz)v3_1));
                }

                arg10.aw += v15 * arg13 * v3;
            }

            arg10.ah.aq(arg11, arg12, arg13);
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("ky.ax(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    protected hz ba() {
        mx v0;
        do {
            v0 = this.al.aq();
            if(v0 == null) {
                return null;
            }
        }
        while(((kc)v0).ah == null);

        return ((kc)v0).ah;
    }

    protected hz bd() {
        mx v0 = this.al.aj();
        if(v0 == null) {
            return null;
        }

        if(((kc)v0).ah != null) {
            return ((kc)v0).ah;
        }

        return this.aj();
    }

    protected int bf() {
        return 0;
    }

    protected int bn() {
        return 0;
    }

    protected void bo(int[] arg11, int arg12, int arg13) {
        this.ae.aq(arg11, arg12, arg13);
        mx v0;
        for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
            if(this.ax.bu(((kc)v0), -85)) {
            }
            else {
                int v9 = arg12;
                int v8 = arg13;
                do {
                    if(v8 > ((kc)v0).at * 0x40C50A44) {
                        this.ax(v0, arg11, v9, ((kc)v0).at * 0x9F8D766B, v9 + v8, 0);
                        v9 += ((kc)v0).at * 0x9249590D;
                        v8 -= ((kc)v0).at * 0x9C97BCF;
                        if(!this.ax.bs(v0, arg11, v9, v8, 0xD3FAF878)) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_43;
                    }
                }
                while(true);

                goto label_56;
            label_43:
                this.ax(v0, arg11, v9, v8, v9 + v8, 0);
                ((kc)v0).at -= v8 * 0xB382C79F;
            }

        label_56:
        }
    }

    protected int bp() {
        return 0;
    }

    protected void bt(int[] arg12, int arg13, int arg14) {
        this.ae.aq(arg12, arg13, arg14);
        mx v0;
        for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
            if(this.ax.bu(((kc)v0), -39)) {
            }
            else {
                int v9 = arg13;
                int v8 = arg14;
                do {
                    int v10 = 0x9F8D766B;
                    if(v8 > ((kc)v0).at * v10) {
                        this.ax(v0, arg12, v9, ((kc)v0).at * v10, v9 + v8, 0);
                        v9 += ((kc)v0).at * v10;
                        v8 -= ((kc)v0).at * v10;
                        if(!this.ax.bs(v0, arg12, v9, v8, 0xD3FAF878)) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_40;
                    }
                }
                while(true);

                goto label_53;
            label_40:
                this.ax(v0, arg12, v9, v8, v9 + v8, 0);
                ((kc)v0).at -= v8 * 159024707;
            }

        label_53:
        }
    }

    protected void bw(int[] arg11, int arg12, int arg13) {
        this.ae.aq(arg11, arg12, arg13);
        mx v0;
        for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
            if(this.ax.bu(((kc)v0), -72)) {
            }
            else {
                int v9 = arg12;
                int v8 = arg13;
                do {
                    if(v8 > ((kc)v0).at * 0xE6F98D5C) {
                        this.ax(v0, arg11, v9, ((kc)v0).at * 0xFC5F9E99, v9 + v8, 0);
                        v9 += ((kc)v0).at * 1394208198;
                        v8 -= ((kc)v0).at * 0x9C509E1C;
                        if(!this.ax.bs(v0, arg11, v9, v8, 0xD3FAF878)) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_43;
                    }
                }
                while(true);

                goto label_56;
            label_43:
                this.ax(v0, arg11, v9, v8, v9 + v8, 0);
                ((kc)v0).at -= v8 * 0x761859FB;
            }

        label_56:
        }
    }

    protected void by(int[] arg12, int arg13, int arg14) {
        this.ae.aq(arg12, arg13, arg14);
        mx v0;
        for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
            if(this.ax.bu(((kc)v0), -100)) {
            }
            else {
                int v9 = arg13;
                int v8 = arg14;
                do {
                    int v10 = 0x9F8D766B;
                    if(v8 > ((kc)v0).at * v10) {
                        this.ax(v0, arg12, v9, ((kc)v0).at * 899310661, v9 + v8, 0);
                        v9 += ((kc)v0).at * v10;
                        v8 -= ((kc)v0).at * 0x12BF46EB;
                        if(!this.ax.bs(v0, arg12, v9, v8, 0xD3FAF878)) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_42;
                    }
                }
                while(true);

                goto label_55;
            label_42:
                this.ax(v0, arg12, v9, v8, v9 + v8, 0);
                ((kc)v0).at -= v8 * 159024707;
            }

        label_55:
        }
    }

    protected void bz(int arg9) {
        this.ae.af(arg9);
        mx v0;
        for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
            if(this.ax.bu(((kc)v0), -69)) {
            }
            else {
                int v1 = arg9;
                while(true) {
                    if(v1 > ((kc)v0).at * -1038292150) {
                        this.al(((kc)v0), ((kc)v0).at * 0x9F8D766B, -4259);
                        int v7 = v1 - ((kc)v0).at * 0x9F8D766B;
                        if(this.ax.bs(v0, null, 0, v7, 0xD3FAF878)) {
                        }
                        else {
                            v1 = v7;
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    goto label_41;
                }

                this.al(((kc)v0), v1, -4853);
                ((kc)v0).at -= v1 * 159024707;
            }

        label_41:
        }
    }

    static final void gt(ar arg2, int arg3, int arg4, byte arg5) {
        try {
            if(client.li == null) {
                if(fh.kf.ca(0x6FE3C5CF)) {
                }
                else {
                    if(arg2 != null) {
                        if(ck.ge(arg2, 0) == null) {
                        }
                        else {
                            dt.bu.at = true;
                            client.li = arg2;
                            client.lx = ck.ge(arg2, 0);
                            client.lj = arg3 * 0xCF4830F7;
                            client.ln = arg4 * 0x26D0B64F;
                            fv.lu = 0;
                            client.la = false;
                            return;
                        }
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ky.gt(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

