import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

public class jh {
    boolean[] ae;
    long aj;
    static int[] ak = null;
    static final String al = "2";
    @Deprecated String[] an;
    boolean ap;
    Map ar;
    static final int au = 2;
    static final int ax = 2;
    static final int sf = 2;

    jh() {
        try {
            super();
            int v0_1 = 0;
            this.ap = false;
            int v1 = client.cq.au(19, 0x290763A9);
            this.ar = new HashMap();
            this.ae = new boolean[v1];
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                this.ae[v2] = cu.al(v2, 12).ae;
            }

            int v3 = 15;
            if(client.cq.dd(v3, 23)) {
                v0_1 = client.cq.au(v3, 0x8282F232);
            }

            this.an = new String[v0_1];
            this.ab(0xFAFF4600);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("jh.<init>(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    void aa(int arg3, int arg4) {
        this.ar.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        if(this.ae[arg3]) {
            this.ap = true;
        }
    }

    static final void ab(ar arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if(arg0.dx != null) {
                arg0.dx[arg1] = arg2;
                arg0.di[arg1] = arg3;
                return;
            }

            throw new RuntimeException();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jh.ab(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void ab(int arg10) {
        int v5;
        int v4;
        lq v2_1;
        int v3;
        int v1;
        og v10_1;
        arg10 = -366840876;
        try {
            v10_1 = this.ad(false, arg10);
            v1 = 0xEE9012BD;
        }
        catch(RuntimeException v10) {
            goto label_105;
        }

        try {
            byte[] v1_1 = new byte[((int)v10_1.an(v1))];
            int v2;
            for(v2 = 0; true; v2 += v3) {
                if(v2 >= v1_1.length) {
                    goto label_21;
                }

                v3 = v10_1.ap(v1_1, v2, v1_1.length - v2, 1166006047);
                if(v3 == -1) {
                    break;
                }
            }

            throw new EOFException();
        label_21:
            v2_1 = new lq(v1_1);
            if(v2_1.ae.length - v2_1.ar * 0xF24F550B >= 1) {
                goto label_34;
            }
        }
        catch(Exception ) {
            goto label_99;
        }
        catch(Throwable v0) {
            goto label_96;
        }

        int v0_1 = 0x39AB9A7C;
        try {
            v10_1.ae(v0_1);
            return;
        }
        catch(RuntimeException v10) {
        }
        catch(Exception ) {
            return;
        label_34:
            byte v1_2 = -25;
            try {
                v1 = v2_1.ay(v1_2);
                if(v1 >= 0) {
                    v4 = 2;
                    if(v1 > v4) {
                    }
                    else if(v1 >= v4) {
                        v1 = v2_1.ao(0x14FB8C00);
                        v4 = 0;
                        goto label_44;
                    }
                    else {
                        v1 = v2_1.ao(0x61A8D041);
                        v3 = 0;
                        goto label_65;
                    }
                }
            }
            catch(Exception ) {
                goto label_99;
            }
            catch(Throwable v0) {
                goto label_96;
            }

            v0_1 = 0x2FDA8DF9;
            try {
                v10_1.ae(v0_1);
                return;
            }
            catch(RuntimeException v10) {
            }
            catch(Exception ) {
                return;
                try {
                label_65:
                    while(v3 < v1) {
                        v4 = v2_1.ao(0x728F8E3);
                        v5 = v2_1.ac(106);
                        if(this.ae[v4]) {
                            this.ar.put(Integer.valueOf(v4), Integer.valueOf(v5));
                        }

                        ++v3;
                    }

                    v1 = v2_1.ao(-491144508);
                    for(v3 = 0; true; ++v3) {
                        if(v3 >= v1) {
                            goto label_89;
                        }

                        v2_1.ao(-733325990);
                        v2_1.bn(22);
                    }

                label_44:
                    while(v4 < v1) {
                        v5 = v2_1.ao(0xA143EECD);
                        Object v6 = eh.ax(ox.al(1), v2_1.ay(-122), 327406994).aj(v2_1, -657830075);
                        if(this.ae[v5]) {
                            this.ar.put(Integer.valueOf(v5), v6);
                        }

                        ++v4;
                    }
                }
                catch(Exception ) {
                    goto label_99;
                }
                catch(Throwable v0) {
                    goto label_96;
                }

            label_89:
                v1 = 2120330250;
                try {
                    v10_1.ae(v1);
                    goto label_101;
                }
                catch(Exception ) {
                    goto label_101;
                }
                catch(RuntimeException v10) {
                    goto label_105;
                }

            label_99:
                v1 = 1016246845;
                try {
                    v10_1.ae(v1);
                    goto label_101;
                }
                catch(RuntimeException v10) {
                }
                catch(Exception ) {
                    try {
                    label_101:
                        this.ap = false;
                        return;
                    }
                    catch(RuntimeException v10) {
                        goto label_105;
                    }

                label_96:
                    v1 = 0x25796111;
                    try {
                        v10_1.ae(v1);
                        goto label_98;
                    }
                    catch(RuntimeException v10) {
                    }
                    catch(Exception ) {
                        try {
                        label_98:
                            throw v0;
                        }
                        catch(RuntimeException v10) {
                        label_105:
                            StringBuilder v0_2 = new StringBuilder();
                            v0_2.append("jh.ab(");
                            v0_2.append(')');
                            throw lx.al(((Throwable)v10), v0_2.toString());
                        }
                    }
                }
            }
        }
    }

    @Deprecated void ac(int arg2, String arg3) {
        this.an[arg2] = arg3;
    }

    og ad(boolean arg3, int arg4) {
        try {
            return kr.al("2", client.aj.aj, arg3, 4);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("jh.ad(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void ae(int arg1, String arg2, int arg3) {
        try {
            this.ar.put(Integer.valueOf(arg1), arg2);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jh.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void af(int arg7) {
        try {
            if((this.ap) && this.aj * -6311596473752642533L < ji.ax(0x2076E2C1) - 60000) {
                this.aq(-1433743980);
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jh.af(");
            v0.append(')');
            throw lx.al(((Throwable)v7), v0.toString());
        }
    }

    void ag(int arg2, String arg3) {
        this.ar.put(Integer.valueOf(arg2), arg3);
    }

    void ah(int arg2, String arg3) {
        this.ar.put(Integer.valueOf(arg2), arg3);
    }

    boolean ai(int arg3) {
        try {
            return this.ap;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jh.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aj(byte arg4) {
        int v4 = 0;
        int v0 = 0;
        try {
            while(v0 < this.ae.length) {
                if(!this.ae[v0]) {
                    this.ar.remove(Integer.valueOf(v0));
                }

                ++v0;
            }

            while(v4 < this.an.length) {
                this.an[v4] = null;
                ++v4;
            }
        }
        catch(RuntimeException v4_1) {
            goto label_24;
        }

        return;
    label_24:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("jh.aj(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4_1), v0_1.toString());
    }

    @Deprecated void ak(int arg2, String arg3) {
        this.an[arg2] = arg3;
    }

    int al(int arg2, int arg3) {
        try {
            Object v2_1 = this.ar.get(Integer.valueOf(arg2));
            if(!(v2_1 instanceof Integer)) {
                return -1;
            }

            return ((Integer)v2_1).intValue();
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jh.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return -1;
    }

    void am(int arg3, int arg4) {
        this.ar.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        if(this.ae[arg3]) {
            this.ap = true;
        }
    }

    @Deprecated void an(int arg1, String arg2, byte arg3) {
        try {
            this.an[arg1] = arg2;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jh.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    String ao(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof String)) {
            return ((String)v2);
        }

        return "";
    }

    @Deprecated String ap(int arg2, byte arg3) {
        try {
            return this.an[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jh.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void aq(int arg8) {
        int v1_2;
        og v8_1;
        arg8 = 0xEEED104C;
        try {
            v8_1 = this.ad(true, arg8);
        }
        catch(RuntimeException v8) {
            goto label_86;
        }

        try {
            Iterator v1 = this.ar.entrySet().iterator();
            int v2 = 3;
            int v3;
            for(v3 = 0; v1.hasNext(); ++v3) {
                Object v4 = v1.next();
                if(!this.ae[((Map$Entry)v4).getKey().intValue()]) {
                    continue;
                }

                v4 = ((Map$Entry)v4).getValue();
                v2 += 3;
                if((v4 instanceof Integer)) {
                    v2 += 4;
                }
                else if((v4 instanceof String)) {
                    v2 += ki.af(((String)v4), 90);
                }
            }

            lq v1_1 = new lq(v2);
            v1_1.ar(2, 120);
            v1_1.an(v3, 0xBD8589EB);
            Iterator v2_1 = this.ar.entrySet().iterator();
            while(v2_1.hasNext()) {
                Object v3_1 = v2_1.next();
                int v4_1 = ((Map$Entry)v3_1).getKey().intValue();
                if(!this.ae[v4_1]) {
                    continue;
                }

                v1_1.an(v4_1, 0x1A81ADBF);
                v3_1 = ((Map$Entry)v3_1).getValue();
                v1_1.ar(ox.ae(v3_1.getClass(), 1011512780).an * 0xE531A8D1, 5);
                ox.an(v3_1, v1_1, -13238);
            }

            v8_1.al(v1_1.ae, 0, v1_1.ar * 0xF24F550B, 0x7F59490C);
            v1_2 = 0x2D302157;
        }
        catch(Throwable v0) {
            goto label_72;
        }
        catch(Exception ) {
            goto label_75;
        }

        try {
            v8_1.ae(v1_2);
            goto label_77;
        }
        catch(RuntimeException v8) {
            goto label_86;
        }
        catch(Exception ) {
            goto label_77;
        }

    label_75:
        v1_2 = 0x4A44C090;
        try {
            v8_1.ae(v1_2);
            goto label_77;
        }
        catch(Exception ) {
        label_77:
            this.ap = false;
            this.aj = ji.ax(0x2076E2C1) * 0x13C0CA8439EADE13L;
            return;
        }

    label_72:
        v1_2 = 0x1305FC95;
        try {
            v8_1.ae(v1_2);
            goto label_74;
        }
        catch(Exception ) {
        label_74:
            throw v0;
        }

    label_86:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("jh.aq(");
        v0_1.append(')');
        throw lx.al(((Throwable)v8), v0_1.toString());
    }

    String ar(int arg2, int arg3) {
        try {
            Object v2_1 = this.ar.get(Integer.valueOf(arg2));
            if((v2_1 instanceof String)) {
                return ((String)v2_1);
            }

            return "";
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jh.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    String as(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof String)) {
            return ((String)v2);
        }

        return "";
    }

    String at(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof String)) {
            return ((String)v2);
        }

        return "";
    }

    void au(int arg3, int arg4) {
        this.ar.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        if(this.ae[arg3]) {
            this.ap = true;
        }
    }

    void av(int arg3, int arg4) {
        this.ar.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        if(this.ae[arg3]) {
            this.ap = true;
        }
    }

    String aw(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof String)) {
            return ((String)v2);
        }

        return "";
    }

    void ax(int arg2, int arg3, int arg4) {
        try {
            this.ar.put(Integer.valueOf(arg2), Integer.valueOf(arg3));
            if(this.ae[arg2]) {
                this.ap = true;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jh.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    String ay(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof String)) {
            return ((String)v2);
        }

        return "";
    }

    int az(int arg2) {
        Object v2 = this.ar.get(Integer.valueOf(arg2));
        if((v2 instanceof Integer)) {
            return ((Integer)v2).intValue();
        }

        return -1;
    }

    @Deprecated String ba(int arg2) {
        return this.an[arg2];
    }

    boolean bb() {
        return this.ap;
    }

    boolean bc() {
        return this.ap;
    }

    @Deprecated String bd(int arg2) {
        return this.an[arg2];
    }

    void bf() {
        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.ae.length; ++v1) {
            if(!this.ae[v1]) {
                this.ar.remove(Integer.valueOf(v1));
            }
        }

        while(v0 < this.an.length) {
            this.an[v0] = null;
            ++v0;
        }
    }

    void bg() {
        if((this.ap) && this.aj * -6311596473752642533L < ji.ax(0x2076E2C1) - 60000) {
            this.aq(0xF17B9B44);
        }
    }

    boolean bh() {
        return this.ap;
    }

    boolean bk() {
        return this.ap;
    }

    void bn() {
        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.ae.length; ++v1) {
            if(!this.ae[v1]) {
                this.ar.remove(Integer.valueOf(v1));
            }
        }

        while(v0 < this.an.length) {
            this.an[v0] = null;
            ++v0;
        }
    }

    og bo(boolean arg4) {
        return kr.al("2", client.aj.aj, arg4, 4);
    }

    og bp(boolean arg4) {
        return kr.al("2", client.aj.aj, arg4, 4);
    }

    void bq() {
        int v6;
        int v5;
        lq v3_1;
        int v4;
        og v1 = this.ad(false, 0xC4F09646);
        int v2 = 0xEE9012BD;
        try {
            byte[] v2_1 = new byte[((int)v1.an(v2))];
            int v3;
            for(v3 = 0; true; v3 += v4) {
                if(v3 >= v2_1.length) {
                    goto label_21;
                }

                v4 = v1.ap(v2_1, v3, v2_1.length - v3, 1166006047);
                if(v4 == -1) {
                    break;
                }
            }

            throw new EOFException();
        label_21:
            v3_1 = new lq(v2_1);
            if(v3_1.ae.length - v3_1.ar * 0xF24F550B >= 1) {
                goto label_34;
            }
        }
        catch(Exception ) {
            goto label_99;
        }
        catch(Throwable v0) {
            goto label_96;
        }

        int v0_1 = 0x448E8ABF;
        try {
            v1.ae(v0_1);
            return;
        }
        catch(Exception ) {
            return;
        }

    label_34:
        byte v2_2 = -34;
        try {
            v2 = v3_1.ay(v2_2);
            if(v2 >= 0) {
                v5 = 2;
                if(v2 > v5) {
                }
                else if(v2 >= v5) {
                    v2 = v3_1.ao(0xF2E6E9AE);
                    v5 = 0;
                    goto label_44;
                }
                else {
                    v2 = v3_1.ao(0x1810FD7B);
                    v4 = 0;
                    goto label_65;
                }
            }
        }
        catch(Exception ) {
            goto label_99;
        }
        catch(Throwable v0) {
            goto label_96;
        }

        v0_1 = 0x6C77B5CD;
        try {
            v1.ae(v0_1);
            return;
        }
        catch(Exception ) {
            return;
        }

        try {
        label_65:
            while(v4 < v2) {
                v5 = v3_1.ao(0x9D388FE2);
                v6 = v3_1.ac(82);
                if(this.ae[v5]) {
                    this.ar.put(Integer.valueOf(v5), Integer.valueOf(v6));
                }

                ++v4;
            }

            v2 = v3_1.ao(364096304);
            for(v4 = 0; true; ++v4) {
                if(v4 >= v2) {
                    goto label_89;
                }

                v3_1.ao(2088313010);
                v3_1.bn(-21);
            }

        label_44:
            while(v5 < v2) {
                v6 = v3_1.ao(0x9BEFE754);
                Object v7 = eh.ax(ox.al(1), v3_1.ay(-30), 0x50F2AD7F).aj(v3_1, 1230511739);
                if(this.ae[v6]) {
                    this.ar.put(Integer.valueOf(v6), v7);
                }

                ++v5;
            }
        }
        catch(Exception ) {
            goto label_99;
        }
        catch(Throwable v0) {
            goto label_96;
        }

    label_89:
        v2 = 0x13FD443F;
        goto label_90;
    label_99:
        v2 = 0x5D105A0E;
        try {
        label_90:
            v1.ae(v2);
            goto label_101;
        }
        catch(Exception ) {
        label_101:
            this.ap = false;
            return;
        }

    label_96:
        v2 = 0x2F9E2954;
        try {
            v1.ae(v2);
            goto label_98;
        }
        catch(Exception ) {
        label_98:
            throw v0;
        }
    }

    void bt() {
        int v2_2;
        og v0 = this.ad(true, 0xCF4790A2);
        try {
            Iterator v2 = this.ar.entrySet().iterator();
            int v3 = 3;
            int v4;
            for(v4 = 0; v2.hasNext(); ++v4) {
                Object v5 = v2.next();
                if(!this.ae[((Map$Entry)v5).getKey().intValue()]) {
                    continue;
                }

                v5 = ((Map$Entry)v5).getValue();
                v3 += 3;
                if((v5 instanceof Integer)) {
                    v3 += 4;
                }
                else if((v5 instanceof String)) {
                    v3 += ki.af(((String)v5), 75);
                }
            }

            lq v2_1 = new lq(v3);
            v2_1.ar(2, 92);
            v2_1.an(v4, 813291100);
            Iterator v3_1 = this.ar.entrySet().iterator();
            while(v3_1.hasNext()) {
                Object v4_1 = v3_1.next();
                int v5_1 = ((Map$Entry)v4_1).getKey().intValue();
                if(!this.ae[v5_1]) {
                    continue;
                }

                v2_1.an(v5_1, 0x1DA83EFF);
                v4_1 = ((Map$Entry)v4_1).getValue();
                v2_1.ar(ox.ae(v4_1.getClass(), 0xD7E72D67).an * 0xE531A8D1, 54);
                ox.an(v4_1, v2_1, -4189);
            }

            v0.al(v2_1.ae, 0, v2_1.ar * 0xF24F550B, 0x28DC9CA3);
            v2_2 = 2018547601;
            goto label_69;
        }
        catch(Throwable v1) {
            v2_2 = 0x69EDC2B0;
            try {
                v0.ae(v2_2);
                goto label_74;
            }
            catch(Exception ) {
            label_74:
                throw v1;
            }
        }
        catch(Exception ) {
            v2_2 = 0x710FB2E3;
            try {
            label_69:
                v0.ae(v2_2);
                goto label_77;
            }
            catch(Exception ) {
            label_77:
                this.ap = false;
                this.aj = ji.ax(0x2076E2C1) * 0x13C0CA8439EADE13L;
                return;
            }
        }
    }

    void bv() {
        int v2_2;
        og v0 = this.ad(true, -1181046061);
        try {
            Iterator v2 = this.ar.entrySet().iterator();
            int v3 = 3;
            int v4;
            for(v4 = 0; v2.hasNext(); ++v4) {
                Object v5 = v2.next();
                if(!this.ae[((Map$Entry)v5).getKey().intValue()]) {
                    continue;
                }

                v5 = ((Map$Entry)v5).getValue();
                v3 += 3;
                if((v5 instanceof Integer)) {
                    v3 += 4;
                }
                else if((v5 instanceof String)) {
                    v3 += ki.af(((String)v5), 83);
                }
            }

            lq v2_1 = new lq(v3);
            v2_1.ar(2, 100);
            v2_1.an(v4, 0x1EEBB441);
            Iterator v3_1 = this.ar.entrySet().iterator();
            while(v3_1.hasNext()) {
                Object v4_1 = v3_1.next();
                int v5_1 = ((Map$Entry)v4_1).getKey().intValue();
                if(!this.ae[v5_1]) {
                    continue;
                }

                v2_1.an(v5_1, -271013057);
                v4_1 = ((Map$Entry)v4_1).getValue();
                v2_1.ar(ox.ae(v4_1.getClass(), 0xB900DE4D).an * 0xE531A8D1, 0x4F);
                ox.an(v4_1, v2_1, 5323);
            }

            v0.al(v2_1.ae, 0, v2_1.ar * 0xF24F550B, 0x3DA925F0);
            v2_2 = 0x41F92AC6;
            goto label_69;
        }
        catch(Throwable v1) {
            v2_2 = 0x73CBCB0C;
            try {
                v0.ae(v2_2);
                goto label_74;
            }
            catch(Exception ) {
            label_74:
                throw v1;
            }
        }
        catch(Exception ) {
            v2_2 = 0x7807DCBA;
            try {
            label_69:
                v0.ae(v2_2);
                goto label_77;
            }
            catch(Exception ) {
            label_77:
                this.ap = false;
                this.aj = ji.ax(0x2076E2C1) * 0x13C0CA8439EADE13L;
                return;
            }
        }
    }

    og bw(boolean arg4) {
        return kr.al("2", client.aj.aj, arg4, 4);
    }

    void bx() {
        if((this.ap) && this.aj * -6311596473752642533L < ji.ax(0x2076E2C1) - 60000) {
            this.aq(0x34D2D66D);
        }
    }

    void by() {
        int v2_2;
        og v0 = this.ad(true, -1205183165);
        try {
            Iterator v2 = this.ar.entrySet().iterator();
            int v3 = 3;
            int v4;
            for(v4 = 0; v2.hasNext(); ++v4) {
                Object v5 = v2.next();
                if(!this.ae[((Map$Entry)v5).getKey().intValue()]) {
                    continue;
                }

                v5 = ((Map$Entry)v5).getValue();
                v3 += 3;
                if((v5 instanceof Integer)) {
                    v3 += 4;
                }
                else if((v5 instanceof String)) {
                    v3 += ki.af(((String)v5), 49);
                }
            }

            lq v2_1 = new lq(v3);
            v2_1.ar(2, 0x77);
            v2_1.an(v4, 0x903BFC09);
            Iterator v3_1 = this.ar.entrySet().iterator();
            while(v3_1.hasNext()) {
                Object v4_1 = v3_1.next();
                int v5_1 = ((Map$Entry)v4_1).getKey().intValue();
                if(!this.ae[v5_1]) {
                    continue;
                }

                v2_1.an(v5_1, 1971084466);
                v4_1 = ((Map$Entry)v4_1).getValue();
                v2_1.ar(ox.ae(v4_1.getClass(), 0xF966F6B2).an * 0xE531A8D1, 36);
                ox.an(v4_1, v2_1, -8964);
            }

            v0.al(v2_1.ae, 0, v2_1.ar * 0xF24F550B, 0x572CB543);
            v2_2 = 0x1D71C3BF;
            goto label_69;
        }
        catch(Throwable v1) {
            v2_2 = 0x6FD0687B;
            try {
                v0.ae(v2_2);
                goto label_74;
            }
            catch(Exception ) {
            label_74:
                throw v1;
            }
        }
        catch(Exception ) {
            v2_2 = 0x63192AF0;
            try {
            label_69:
                v0.ae(v2_2);
                goto label_77;
            }
            catch(Exception ) {
            label_77:
                this.ap = false;
                this.aj = ji.ax(0x2076E2C1) * 0x13C0CA8439EADE13L;
                return;
            }
        }
    }

    void bz() {
        if((this.ap) && this.aj * -6311596473752642533L < ji.ax(0x2076E2C1) - 60000) {
            this.aq(0x5D699073);
        }
    }
}

