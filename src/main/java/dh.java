import java.util.Iterator;
import java.util.LinkedList;

public class dh {
    boolean aa;
    int ab;
    int ad;
    int af;
    int ai;
    int aj;
    String an;
    String ap;
    af aq;
    int ar;
    LinkedList au;
    int av;
    static long rb;
    static ld th;

    public dh() {
        super();
        this.ar = 0x4DD7B5B;
        this.aj = 0xD25145F;
        this.ad = 0x4B0F0229;
        this.aq = null;
        this.ab = 0xC7ACF79B;
        this.af = 0;
        this.ai = -936084667;
        this.av = 0;
        this.aa = false;
    }

    public boolean aa(int arg3) {
        try {
            return this.aa;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.aa(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int[] ab(int arg3, int arg4, int arg5, int arg6) {
        Object v0;
        try {
            Iterator v6 = this.au.iterator();
            do {
                if(!v6.hasNext()) {
                    return null;
                }

                v0 = v6.next();
            }
            while(!((cm)v0).al(arg3, arg4, arg5, 0x91A305BC));

            return ((cm)v0).ar(arg3, arg4, arg5, -1606863509);
        }
        catch(RuntimeException v3) {
            goto label_15;
        }

        return null;
    label_15:
        StringBuilder v4 = new StringBuilder();
        v4.append("dh.ab(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public af ac(int arg3) {
        try {
            return new af(this.aq);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ac(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ad(int arg3, int arg4, int arg5, byte arg6) {
        try {
            Iterator v6 = this.au.iterator();
            do {
                if(!v6.hasNext()) {
                    return 0;
                }

                if(!v6.next().al(arg3, arg4, arg5, 0x80A89F7C)) {
                    continue;
                }

                return 1;
            }
            while(true);
        }
        catch(RuntimeException v3) {
            goto label_14;
        }

        return 1;
    label_14:
        StringBuilder v4 = new StringBuilder();
        v4.append("dh.ad(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public af af(int arg3, int arg4, int arg5) {
        Object v0;
        try {
            Iterator v5 = this.au.iterator();
            do {
                if(!v5.hasNext()) {
                    return null;
                }

                v0 = v5.next();
            }
            while(!((cm)v0).ae(arg3, arg4, 35));

            return ((cm)v0).an(arg3, arg4, 0x79);
        }
        catch(RuntimeException v3) {
            goto label_15;
        }

        return null;
    label_15:
        StringBuilder v4 = new StringBuilder();
        v4.append("dh.af(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public int ag(int arg3) {
        arg3 = 0x66E045E7;
        try {
            return this.ad * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ag(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ah(int arg3) {
        try {
            return this.ab * -1474008723;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ah(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ai(int arg3) {
        try {
            Iterator v3_1 = this.au.iterator();
            while(v3_1.hasNext()) {
                v3_1.next().ax(this, 0xABE876F7);
            }
        }
        catch(RuntimeException v3) {
            goto label_11;
        }

        return;
    label_11:
        StringBuilder v0 = new StringBuilder();
        v0.append("dh.ai(");
        v0.append(')');
        throw lx.al(((Throwable)v3), v0.toString());
    }

    cm aj(lq arg3, byte arg4) {
        arg4 = -32;
        try {
            switch(eh.ax(ct.al(0xA9AF6405), arg3.ay(arg4), 0x6180E6DC).an * 867032263) {
                case 0: {
                    goto label_21;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_15;
                }
                case 3: {
                    goto label_12;
                }
            }

            throw new IllegalStateException("");
        label_18:
            cs v4 = new cs();
            goto label_23;
        label_21:
            ch v4_1 = new ch();
            goto label_23;
        label_12:
            cb v4_2 = new cb();
            goto label_23;
        label_15:
            cr v4_3 = new cr();
        label_23:
            ((cm)v4_1).ap(arg3, 1017441409);
            return ((cm)v4_1);
        }
        catch(RuntimeException v3) {
            StringBuilder v4_4 = new StringBuilder();
            v4_4.append("dh.aj(");
            v4_4.append(')');
            throw lx.al(((Throwable)v3), v4_4.toString());
        }
    }

    public int ak(byte arg3) {
        try {
            return this.aq.ae * 0xB230B0A5;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ak(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String am(int arg3) {
        try {
            return this.ap;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.am(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ao(int arg3) {
        try {
            return this.aq.al * 0xAEACF223;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ap(lq arg3, int arg4, int arg5) {
        arg4 *= 0xFB2284A5;
        try {
            this.ar = arg4;
            this.an = arg3.bn(51);
            this.ap = arg3.bn(-7);
            this.aq = new af(arg3.ac(85));
            this.aj = arg3.ac(80) * 0xF2DAEBA1;
            arg3.ay(-13);
            arg5 = 0;
            boolean v0 = true;
            if(arg3.ay(-49) == 1) {
            }
            else {
                v0 = false;
            }

            this.aa = v0;
            this.ad = arg3.ay(-26) * 0xB4F0FDD7;
            arg4 = arg3.ay(-116);
            this.au = new LinkedList();
            while(arg5 < arg4) {
                this.au.add(this.aj(arg3, -21));
                ++arg5;
            }

            this.ai(0x3D76DAD);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("dh.ap(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean aq(int arg5, int arg6, int arg7) {
        try {
            arg7 = arg5 / 0x40;
            int v0 = arg6 / 0x40;
            if(arg7 >= this.ab * -1474008723) {
                if(arg7 > this.af * 0xA95E9011) {
                }
                else {
                    if(v0 >= this.ai * 0xB342073) {
                        if(v0 > this.av * 0x9FFD4C8B) {
                        }
                        else {
                            Iterator v7 = this.au.iterator();
                            do {
                                if(v7.hasNext()) {
                                    if(!v7.next().ae(arg5, arg6, -83)) {
                                        continue;
                                    }

                                    return 1;
                                }
                                else {
                                    return 0;
                                }
                            }
                            while(true);
                        }
                    }

                    return 0;
                }
            }

            return 0;
        }
        catch(RuntimeException v5) {
            goto label_36;
        }

        return 1;
    label_36:
        StringBuilder v6 = new StringBuilder();
        v6.append("dh.aq(");
        v6.append(')');
        throw lx.al(((Throwable)v5), v6.toString());
        return 0;
    }

    public int as(int arg3) {
        try {
            return this.aq.ax * 400591065;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.as(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int at(int arg3) {
        try {
            return this.af * 0xA95E9011;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.at(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String au(int arg3) {
        try {
            return this.an;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.au(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int av(int arg3) {
        try {
            return this.ar * -1170095315;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.av(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int aw(int arg3) {
        try {
            return this.av * 0x9FFD4C8B;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static void ax(ko arg1, int arg2) {
        try {
            dc.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dh.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int ay(int arg3) {
        try {
            return this.ai * 0xB342073;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.ay(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int az(int arg3) {
        try {
            return this.aj * 2081536097;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dh.az(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ba(lq arg4, int arg5) {
        this.ar = arg5 * 0xFB2284A5;
        this.an = arg4.bn(3);
        this.ap = arg4.bn(24);
        this.aq = new af(arg4.ac(23));
        this.aj = arg4.ac(43) * 0xF2DAEBA1;
        arg4.ay(-77);
        int v0 = 0;
        boolean v1 = true;
        if(arg4.ay(-42) == 1) {
        }
        else {
            v1 = false;
        }

        this.aa = v1;
        this.ad = arg4.ay(-67) * 0xB4F0FDD7;
        arg5 = arg4.ay(-102);
        this.au = new LinkedList();
        while(v0 < arg5) {
            this.au.add(this.aj(arg4, 9));
            ++v0;
        }

        this.ai(0x3399B4F0);
    }

    public int[] bb(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).al(arg4, arg5, arg6, 0x8C0B3D7F));

        return ((cm)v1).ar(arg4, arg5, arg6, 0xA7CA1031);
    }

    public int[] bc(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).al(arg4, arg5, arg6, 0x851D24A0));

        return ((cm)v1).ar(arg4, arg5, arg6, 0x963FEE50);
    }

    public void bd(lq arg4, int arg5) {
        this.ar = arg5 * 0xFB2284A5;
        this.an = arg4.bn(20);
        this.ap = arg4.bn(46);
        this.aq = new af(arg4.ac(81));
        this.aj = arg4.ac(49) * 0xF2DAEBA1;
        arg4.ay(-18);
        int v0 = 0;
        boolean v1 = true;
        if(arg4.ay(-59) == 1) {
        }
        else {
            v1 = false;
        }

        this.aa = v1;
        this.ad = arg4.ay(-31) * 0xB4F0FDD7;
        arg5 = arg4.ay(-41);
        this.au = new LinkedList();
        while(v0 < arg5) {
            this.au.add(this.aj(arg4, 97));
            ++v0;
        }

        this.ai(-494288603);
    }

    public int be() {
        return this.ar * -1170095315;
    }

    public void bf(lq arg4, int arg5) {
        this.ar = arg5 * 0xFB2284A5;
        this.an = arg4.bn(42);
        this.ap = arg4.bn(0x1F);
        this.aq = new af(arg4.ac(17));
        this.aj = arg4.ac(87) * 0x59FE1F3;
        arg4.ay(-57);
        int v0 = 0;
        boolean v1 = true;
        if(arg4.ay(-96) == 1) {
        }
        else {
            v1 = false;
        }

        this.aa = v1;
        this.ad = arg4.ay(-28) * 0xE02197AB;
        arg5 = arg4.ay(-79);
        this.au = new LinkedList();
        while(v0 < arg5) {
            this.au.add(this.aj(arg4, -6));
            ++v0;
        }

        this.ai(0xE46E2701);
    }

    public boolean bg(int arg6, int arg7) {
        int v0 = arg6 / 0x40;
        int v1 = arg7 / 0x40;
        if(v0 >= this.ab * -1474008723) {
            if(v0 > this.af * 0xA95E9011) {
            }
            else {
                if(v1 >= this.ai * 0xB342073) {
                    if(v1 > this.av * 0x9FFD4C8B) {
                    }
                    else {
                        Iterator v0_1 = this.au.iterator();
                        do {
                            if(v0_1.hasNext()) {
                                if(!v0_1.next().ae(arg6, arg7, -103)) {
                                    continue;
                                }

                                return 1;
                            }
                            else {
                                return 0;
                            }
                        }
                        while(true);

                        return 1;
                    }
                }

                return 0;
            }
        }

        return 0;
    }

    public int[] bh(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).al(arg4, arg5, arg6, -2026424241));

        return ((cm)v1).ar(arg4, arg5, arg6, 0xB3541F0B);
    }

    public boolean bi() {
        return this.aa;
    }

    void bj() {
        Iterator v0 = this.au.iterator();
        while(v0.hasNext()) {
            v0.next().ax(this, 0xB1D213A3);
        }
    }

    public af bk(int arg4, int arg5) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).ae(arg4, arg5, -119));

        return ((cm)v1).an(arg4, arg5, 86);
    }

    public int bl() {
        return this.ar * -1170095315;
    }

    public af bm(int arg4, int arg5) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).ae(arg4, arg5, -99));

        return ((cm)v1).an(arg4, arg5, 12);
    }

    cm bn(lq arg4) {
        switch(eh.ax(ct.al(-1680437588), arg4.ay(-10), 0x3E50B999).an * 104404815) {
            case 0: {
                goto label_23;
            }
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_17;
            }
            case 3: {
                goto label_14;
            }
        }

        throw new IllegalStateException("");
    label_17:
        cr v0 = new cr();
        goto label_25;
    label_20:
        cs v0_1 = new cs();
        goto label_25;
    label_23:
        ch v0_2 = new ch();
        goto label_25;
    label_14:
        cb v0_3 = new cb();
    label_25:
        ((cm)v0_3).ap(arg4, 1017441409);
        return ((cm)v0_3);
    }

    cm bo(lq arg4) {
        switch(eh.ax(ct.al(0x93F8089F), arg4.ay(-15), 0x2AF525F0).an * 867032263) {
            case 0: {
                goto label_23;
            }
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_17;
            }
            case 3: {
                goto label_14;
            }
        }

        throw new IllegalStateException("");
    label_17:
        cr v0 = new cr();
        goto label_25;
    label_20:
        cs v0_1 = new cs();
        goto label_25;
    label_23:
        ch v0_2 = new ch();
        goto label_25;
    label_14:
        cb v0_3 = new cb();
    label_25:
        ((cm)v0).ap(arg4, 1017441409);
        return ((cm)v0);
    }

    cm bp(lq arg4) {
        switch(eh.ax(ct.al(0xAED397DF), arg4.ay(-72), 2094381948).an * 867032263) {
            case 0: {
                goto label_23;
            }
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_17;
            }
            case 3: {
                goto label_14;
            }
        }

        throw new IllegalStateException("");
    label_17:
        cr v0 = new cr();
        goto label_25;
    label_20:
        cs v0_1 = new cs();
        goto label_25;
    label_23:
        ch v0_2 = new ch();
        goto label_25;
    label_14:
        cb v0_3 = new cb();
    label_25:
        ((cm)v0_1).ap(arg4, 1017441409);
        return ((cm)v0_1);
    }

    public boolean bq(int arg6, int arg7) {
        int v0 = arg6 / 0x40;
        int v1 = arg7 / 0x40;
        if(v0 >= this.ab * 0x2B2A54E1) {
            if(v0 > this.af * 2086649150) {
            }
            else {
                if(v1 >= this.ai * 0xB342073) {
                    if(v1 > this.av * 0x9FFD4C8B) {
                    }
                    else {
                        Iterator v0_1 = this.au.iterator();
                        do {
                            if(v0_1.hasNext()) {
                                if(!v0_1.next().ae(arg6, arg7, -92)) {
                                    continue;
                                }

                                return 1;
                            }
                            else {
                                return 0;
                            }
                        }
                        while(true);

                        return 1;
                    }
                }

                return 0;
            }
        }

        return 0;
    }

    public boolean br() {
        return this.aa;
    }

    public int bs() {
        return this.ar * -1170095315;
    }

    public boolean bt(int arg4, int arg5, int arg6) {
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return 0;
            }
        }
        while(!v0.next().al(arg4, arg5, arg6, -2051001494));

        return 1;
    }

    void bu() {
        Iterator v0 = this.au.iterator();
        while(v0.hasNext()) {
            v0.next().ax(this, -1354340209);
        }
    }

    public boolean bv(int arg6, int arg7) {
        int v0 = arg6 / 0x40;
        int v1 = arg7 / 0x20047AE5;
        if(v0 >= this.ab * -1474008723) {
            if(v0 > this.af * 0xA95E9011) {
            }
            else {
                if(v1 >= this.ai * -746103086) {
                    if(v1 > this.av * 0x9FFD4C8B) {
                    }
                    else {
                        Iterator v0_1 = this.au.iterator();
                        do {
                            if(v0_1.hasNext()) {
                                if(!v0_1.next().ae(arg6, arg7, -35)) {
                                    continue;
                                }

                                return 1;
                            }

                            return 0;
                        }
                        while(true);

                        return 1;
                    }
                }

                return 0;
            }
        }

        return 0;
    }

    cm bw(lq arg4) {
        switch(eh.ax(ct.al(0x8B0C0C1C), arg4.ay(-84), 0x47471153).an * 39968061) {
            case 0: {
                goto label_23;
            }
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_17;
            }
            case 3: {
                goto label_14;
            }
        }

        throw new IllegalStateException("");
    label_17:
        cr v0 = new cr();
        goto label_25;
    label_20:
        cs v0_1 = new cs();
        goto label_25;
    label_23:
        ch v0_2 = new ch();
        goto label_25;
    label_14:
        cb v0_3 = new cb();
    label_25:
        ((cm)v0_1).ap(arg4, 1017441409);
        return ((cm)v0_1);
    }

    public boolean bx(int arg6, int arg7) {
        int v0 = arg6 / 0x4C40BB03;
        int v1 = arg7 / -1756502689;
        if(v0 >= this.ab * 0xE096B674) {
            if(v0 > this.af * 0x145FE54A) {
            }
            else if(v1 >= this.ai * 0xB342073) {
                if(v1 > this.av * 0x508795F7) {
                }
                else {
                    Iterator v0_1 = this.au.iterator();
                    do {
                        if(v0_1.hasNext()) {
                            if(!v0_1.next().ae(arg6, arg7, -44)) {
                                continue;
                            }

                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                    while(true);

                    return 1;
                }
            }
        }

        return 0;
    }

    public boolean by(int arg4, int arg5, int arg6) {
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return 0;
            }
        }
        while(!v0.next().al(arg4, arg5, arg6, 0x825E3FC1));

        return 1;
    }

    public int[] bz(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.au.iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((cm)v1).al(arg4, arg5, arg6, 0x8BAC8260));

        return ((cm)v1).ar(arg4, arg5, arg6, -2003753525);
    }

    public boolean ca() {
        return this.aa;
    }

    public String cb() {
        return this.ap;
    }

    int cc() {
        return this.aj * 2081536097;
    }

    public String cd() {
        return this.an;
    }

    public int ce() {
        return this.ab * 0xF6D8D21B;
    }

    public String cf() {
        return this.an;
    }

    public int cg() {
        return this.aq.al * 0xAEACF223;
    }

    public int ch() {
        return this.ab * -1474008723;
    }

    int ci() {
        return this.aj * 2081536097;
    }

    public String cj() {
        return this.an;
    }

    public int ck() {
        return this.ai * 0xB342073;
    }

    public int cl() {
        return this.af * 0xA95E9011;
    }

    public int cm() {
        return this.av * 0x9FFD4C8B;
    }

    public int cn() {
        return this.af * 0x44D9C890;
    }

    public int co() {
        return this.aq.ax * 0x9BD73271;
    }

    int cp() {
        return this.aj * 2081536097;
    }

    public int cq() {
        return this.aq.al * 0xAEACF223;
    }

    public int cr() {
        return this.ad * 0x81F48191;
    }

    public int cs() {
        return this.ab * -1474008723;
    }

    public int ct() {
        return this.aq.al * 0xAEACF223;
    }

    public int cu() {
        return this.aq.al * 0xAEACF223;
    }

    public int cv() {
        return this.aq.al * 0xAEACF223;
    }

    int cw() {
        return this.aj * 2081536097;
    }

    public String cx() {
        return this.ap;
    }

    public String cy() {
        return this.ap;
    }

    public int cz() {
        return this.af * 0xA95E9011;
    }

    public int db() {
        return this.aq.ae * 0xB230B0A5;
    }

    public af dc() {
        return new af(this.aq);
    }

    public af de() {
        return new af(this.aq);
    }

    public int dh() {
        return this.aq.ax * 400591065;
    }

    public af dj() {
        return new af(this.aq);
    }

    public af dk() {
        return new af(this.aq);
    }

    public int dm() {
        return this.aq.ae * 2086827505;
    }

    public int dp() {
        return this.aq.ax * 400591065;
    }

    public int du() {
        return this.aq.ae * 0xB230B0A5;
    }

    public int dv() {
        return this.aq.ax * 0x870B00A;
    }

    public int dw() {
        return this.aq.ae * 0xB230B0A5;
    }

    static void fv(int arg8, String arg9, int arg10) {
        na v8_1;
        int v4;
        arg10 = 0x474DFE7D;
        try {
            int v0 = ho.ap * arg10;
            int[] v10 = ho.aj;
            ew v1 = new ew(arg9, ac.ad);
            int v2 = 0;
            int v3 = 0;
            while(true) {
                v4 = 4;
                if(v3 < v0) {
                    hw v6 = client.jf[v10[v3]];
                    if(v6 != null && gu.jg != v6 && v6.ax != null && (v6.ax.equals(v1))) {
                        if(1 == arg8) {
                            v8_1 = cd.al(nf.dn, client.eh.an, 0x83047010);
                            v8_1.ae.an(v10[v3], 0x1A200BA5);
                            v8_1.ae.bj(0, 0x8AE59A3B);
                            client.eh.ae(v8_1, -5840621);
                        }
                        else if(arg8 == v4) {
                            v8_1 = cd.al(nf.bj, client.eh.an, 0x8DE19777);
                            v8_1.ae.cf(v10[v3], 1297904548);
                            v8_1.ae.bs(0, 0x9AFC445C);
                            client.eh.ae(v8_1, 0xB36AA5DE);
                        }
                        else if(6 == arg8) {
                            v8_1 = cd.al(nf.bl, client.eh.an, -2044129860);
                            v8_1.ae.bs(0, 0xB5C1ABBF);
                            v8_1.ae.cx(v10[v3], -17);
                            client.eh.ae(v8_1, 0xFA15023D);
                        }
                        else if(arg8 == 7) {
                            v8_1 = cd.al(nf.df, client.eh.an, -1955508306);
                            v8_1.ae.bu(0, 3);
                            v8_1.ae.an(v10[v3], 0x95B3D945);
                            client.eh.ae(v8_1, -980858483);
                        }

                        v2 = 1;
                        break;
                    }

                    ++v3;
                    continue;
                }

                break;
            }

            if(v2 == 0) {
                ib.al(v4, "", gs.gb + arg9, 1572102990);
            }
        }
        catch(RuntimeException v8) {
            goto label_109;
        }

        return;
    label_109:
        StringBuilder v9 = new StringBuilder();
        v9.append("dh.fv(");
        v9.append(')');
        throw lx.al(((Throwable)v8), v9.toString());
    }
}

