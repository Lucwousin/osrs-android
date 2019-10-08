public class or {
    public int ae;
    static final int aj = 400;
    public int al;
    public int ar;
    public int ax;

    public or(int arg2, int arg3, int arg4, int arg5) {
        try {
            super();
            this.ax(arg2, arg3, 0x7F030010);
            this.al(arg4, arg5, 73309098);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("or.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public or(int arg2, int arg3) {
        try {
            this(0, 0, arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("or.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void aa(int arg2, int arg3) {
        this.ax = arg2 * -609044709;
        this.al = arg3 * 0xD384F395;
    }

    public int ab(int arg3) {
        try {
            return this.al * 0xC9ACBFBD;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("or.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ac(int arg4) {
        int v1 = 0xC9ACBFBD;
        boolean v4 = arg4 < this.al * v1 || arg4 >= this.ar * 0x7EDCA66B + this.al * v1 ? false : true;
        return v4;
    }

    void ad(or arg4, or arg5, int arg6) {
        try {
            arg5.al = this.al;
            arg5.ar = this.ar;
            if(this.al * 0xC9ACBFBD < arg4.al * 0xC9ACBFBD) {
                arg5.ar -= arg4.al * -1547490185 - this.al * -1547490185;
                arg5.al = arg4.al;
            }

            byte v6 = 2;
            if(arg5.ai(v6) > arg4.ai(v6)) {
                arg5.ar -= (arg5.ai(v6) - arg4.ai(v6)) * -1775643069;
            }

            if(arg5.ar * 0x7EDCA66B < 0) {
                arg5.ar = 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("or.ad(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean ae(int arg1, int arg2, int arg3) {
        arg3 = 0x6A184910;
        try {
            if(!this.ar(arg1, arg3)) {
                return false;
            }
            else if(!this.an(arg2, 0x4C8E2112)) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("or.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    public int af(int arg3) {
        try {
            return this.ax * 104778515 + this.ae * 0xD1D68747;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("or.af(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ag(int arg2, int arg3) {
        this.ae = arg2 * 0x2A6AF277;
        this.ar = arg3 * -1739047505;
    }

    public void ah(int arg2, int arg3) {
        this.ae = arg2 * 0x2A6AF277;
        this.ar = arg3 * -1775643069;
    }

    public int ai(byte arg3) {
        int v3 = 0xC9ACBFBD;
        try {
            return this.al * v3 + this.ar * 0x7EDCA66B;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("or.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void aj(or arg4, or arg5, byte arg6) {
        try {
            arg5.ax = this.ax;
            arg5.ae = this.ae;
            if(this.ax * 104778515 < arg4.ax * 104778515) {
                arg5.ae -= arg4.ax * 0x77065BD5 - this.ax * 0x77065BD5;
                arg5.ax = arg4.ax;
            }

            int v6 = 0xBB230BAE;
            if(arg5.af(v6) > arg4.af(v6)) {
                arg5.ae -= (arg5.af(v6) - arg4.af(v6)) * 0x2A6AF277;
            }

            if(arg5.ae * 0xD1D68747 < 0) {
                arg5.ae = 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("or.aj(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean ak(int arg4) {
        int v1 = 0xC9ACBFBD;
        boolean v4 = arg4 < this.al * v1 || arg4 >= this.ar * 0x7EDCA66B + this.al * v1 ? false : true;
        return v4;
    }

    public void al(int arg1, int arg2, int arg3) {
        arg1 *= 0x2A6AF277;
        try {
            this.ae = arg1;
            this.ar = arg2 * -1775643069;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("or.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void am(int arg2, int arg3) {
        this.ax = arg2 * -609044709;
        this.al = arg3 * 0xD384F395;
    }

    public boolean an(int arg3, int arg4) {
        try {
            int v0 = 0xC9ACBFBD;
            if(arg3 < this.al * v0) {
                return false;
            }
            else if(arg3 >= this.ar * 0x7EDCA66B + this.al * v0) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("or.an(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public boolean ao(int arg4) {
        boolean v4 = arg4 < this.ax * 104778515 || arg4 >= this.ax * 835309278 + this.ae * 0xD1D68747 ? false : true;
        return v4;
    }

    public void ap(or arg1, or arg2, int arg3) {
        try {
            this.aj(arg1, arg2, 0);
            this.ad(arg1, arg2, 302630981);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("or.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int aq(int arg3) {
        arg3 = 104778515;
        try {
            return this.ax * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("or.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ar(int arg3, int arg4) {
        try {
            int v0 = 104778515;
            if(arg3 < this.ax * v0) {
                return false;
            }
            else if(arg3 >= this.ax * v0 + this.ae * 0xD1D68747) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("or.ar(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public boolean as(int arg4) {
        int v1 = 0xC9ACBFBD;
        boolean v4 = arg4 < this.al * v1 || arg4 >= this.ar * 0x7EDCA66B + this.al * v1 ? false : true;
        return v4;
    }

    public void at(int arg2, int arg3) {
        this.ae = arg2 * -1700359835;
        this.ar = arg3 * 0x1661550;
    }

    public void au(int arg2, int arg3) {
        this.ax = arg2 * -609044709;
        this.al = arg3 * 0xD384F395;
    }

    public void av(int arg2, int arg3) {
        this.ax = arg2 * -609044709;
        this.al = arg3 * 0xD384F395;
    }

    public boolean aw(int arg4) {
        boolean v4 = arg4 < this.ax * -200972342 || arg4 >= this.ax * 0x4109FC6C + this.ae * 0xD148777D ? false : true;
        return v4;
    }

    public void ax(int arg1, int arg2, int arg3) {
        arg1 *= -609044709;
        try {
            this.ax = arg1;
            this.al = arg2 * 0xD384F395;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("or.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean ay(int arg2, int arg3) {
        boolean v2 = !this.ar(arg2, 1105126304) || !this.an(arg3, 46349101) ? false : true;
        return v2;
    }

    public void az(int arg2, int arg3) {
        this.ae = arg2 * 0x2A6AF277;
        this.ar = arg3 * -1775643069;
    }

    public void ba(or arg2, or arg3) {
        this.aj(arg2, arg3, 0);
        this.ad(arg2, arg3, 0x6ED5BE04);
    }

    public int bb() {
        return this.ax * 0xA9A4011D + this.ae * 0xD1D68747;
    }

    public int bc() {
        return this.ax * 0x441975EB + this.ae * 806490474;
    }

    public void bd(or arg2, or arg3) {
        this.aj(arg2, arg3, 0);
        this.ad(arg2, arg3, 0xC8B36C0E);
    }

    public void bf(or arg2, or arg3) {
        this.aj(arg2, arg3, 0);
        this.ad(arg2, arg3, 0xCBF85534);
    }

    public int bg() {
        return this.al * 0xC9ACBFBD;
    }

    public int bh() {
        return this.ax * 104778515 + this.ae * 0xD1D68747;
    }

    public int bj() {
        return this.al * 0xC9ACBFBD + this.ar * 0x7EDCA66B;
    }

    public int bk() {
        return this.al * 0xC9ACBFBD + this.ar * 0x7EDCA66B;
    }

    public int bm() {
        return this.al * 0x66ADAF44 + this.ar * 0x7EDCA66B;
    }

    void bn(or arg5, or arg6) {
        arg6.ax = this.ax;
        arg6.ae = this.ae;
        if(this.ax * 104778515 < arg5.ax * 104778515) {
            arg6.ae -= arg5.ax * 0x77065BD5 - this.ax * 0x77065BD5;
            arg6.ax = arg5.ax;
        }

        int v0 = 0xBB230BAE;
        if(arg6.af(v0) > arg5.af(v0)) {
            arg6.ae -= (arg6.af(v0) - arg5.af(v0)) * 0x2A6AF277;
        }

        if(arg6.ae * 0xD1D68747 < 0) {
            arg6.ae = 0;
        }
    }

    void bo(or arg5, or arg6) {
        arg6.ax = this.ax;
        arg6.ae = this.ae;
        if(this.ax * 0xB2D3980E < arg5.ax * 104778515) {
            arg6.ae -= arg5.ax * 0x77065BD5 - this.ax * 390965342;
            arg6.ax = arg5.ax;
        }

        int v0 = 0xBB230BAE;
        if(arg6.af(v0) > arg5.af(v0)) {
            arg6.ae -= (arg6.af(v0) - arg5.af(v0)) * 0xD5561E39;
        }

        if(arg6.ae * 0xFAD60BC2 < 0) {
            arg6.ae = 0;
        }
    }

    void bp(or arg5, or arg6) {
        arg6.ax = this.ax;
        arg6.ae = this.ae;
        if(this.ax * 104778515 < arg5.ax * 104778515) {
            arg6.ae -= arg5.ax * 0x77065BD5 - this.ax * 0x77065BD5;
            arg6.ax = arg5.ax;
        }

        int v0 = 0xBB230BAE;
        if(arg6.af(v0) > arg5.af(v0)) {
            arg6.ae -= (arg6.af(v0) - arg5.af(v0)) * 0x2A6AF277;
        }

        if(arg6.ae * 0xD1D68747 < 0) {
            arg6.ae = 0;
        }
    }

    public int bq() {
        return this.ax * 104778515;
    }

    public int bs() {
        return this.al * 0xC9ACBFBD + this.ar * 0x7EDCA66B;
    }

    public int bt() {
        return this.ax * 104778515;
    }

    public int bu() {
        return this.al * 0x4F15F72B + this.ar * 0x7EDCA66B;
    }

    public int bv() {
        return this.ax * 104778515;
    }

    void bw(or arg5, or arg6) {
        arg6.ax = this.ax;
        arg6.ae = this.ae;
        if(this.ax * 104778515 < arg5.ax * 104778515) {
            arg6.ae -= arg5.ax * -2094265021 - this.ax * 0xE5668D60;
            arg6.ax = arg5.ax;
        }

        int v0 = 0xBB230BAE;
        if(arg6.af(v0) > arg5.af(v0)) {
            arg6.ae -= (arg6.af(v0) - arg5.af(v0)) * 0x13B00B77;
        }

        if(arg6.ae * 0xAE732439 < 0) {
            arg6.ae = 0;
        }
    }

    public int bx() {
        return this.ax * 104778515;
    }

    void by(or arg5, or arg6) {
        arg6.al = this.al;
        arg6.ar = this.ar;
        if(this.al * 0xC9ACBFBD < arg5.al * 0xC9ACBFBD) {
            arg6.ar -= arg5.al * -1547490185 - this.al * -1547490185;
            arg6.al = arg5.al;
        }

        byte v0 = 2;
        if(arg6.ai(v0) > arg5.ai(v0)) {
            arg6.ar -= (arg6.ai(v0) - arg5.ai(v0)) * -1775643069;
        }

        if(arg6.ar * 0x7EDCA66B < 0) {
            arg6.ar = 0;
        }
    }

    public int bz() {
        return this.al * 0x1043F2BA;
    }

    public final boolean equals(Object arg5) {
        try {
            boolean v1 = false;
            if(((arg5 instanceof or)) && ((or)arg5).ax * 104778515 == this.ax * 104778515 && this.al * 0xC9ACBFBD == ((or)arg5).al * 0xC9ACBFBD && this.ae * 0xD1D68747 == ((or)arg5).ae * 0xD1D68747) {
                if(this.ar * 0x7EDCA66B != ((or)arg5).ar * 0x7EDCA66B) {
                    return v1;
                }

                return true;
            }

            return v1;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("or.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }

        return true;
    }

    public final boolean hd(Object arg5) {
        boolean v1 = false;
        if((arg5 instanceof or)) {
            if(((or)arg5).ax * 104778515 == this.ax * 104778515 && this.al * 0xC9ACBFBD == ((or)arg5).al * 0xC9ACBFBD && this.ae * 0xD1D68747 == ((or)arg5).ae * 0xD1D68747 && this.ar * 0x7EDCA66B == ((or)arg5).ar * 0x7EDCA66B) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    public final boolean hh(Object arg5) {
        boolean v1 = false;
        if((arg5 instanceof or)) {
            if(((or)arg5).ax * 1643065002 == this.ax * 104778515 && this.al * 0xC9ACBFBD == ((or)arg5).al * 0xC9ACBFBD && this.ae * 0xB67AF906 == ((or)arg5).ae * 828275304 && this.ar * 0x7EDCA66B == ((or)arg5).ar * 0x2F6AAF91) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    public String hm() {
        return null;
    }

    public String hx() {
        return null;
    }

    public String hz() {
        return null;
    }

    public String toString() {
        return null;
    }
}

