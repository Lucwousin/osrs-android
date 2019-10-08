import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class er {
    eg[] ae;
    int al;
    HashMap an;
    Comparator ap;
    HashMap ar;
    final int ax;
    static final int bf = 0x1240180;
    public static final int bx = 50;
    static final int gv = 334;

    er(int arg3) {
        try {
            super();
            this.al = 0;
            this.ap = null;
            this.ax = 0x3C037FF9 * arg3;
            this.ae = this.ay(arg3, 0xF41906B5);
            this.ar = new HashMap(arg3 / 8);
            this.an = new HashMap(arg3 / 8);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("er.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void aa(char arg5, byte arg6) {
        int v6;
        try {
            int v0 = 0xF7EE5BF5;
            int v2 = 320;
            int v3 = 0;
            if(hq.cm * v0 == 2) {
                v6 = 0;
                while(v6 < hq.dg.length()) {
                    if(arg5 == hq.dg.charAt(v6)) {
                        v3 = 1;
                    }
                    else {
                        ++v6;
                        continue;
                    }

                    break;
                }

                if(v3 == 0) {
                    return;
                }

                v0 = 0xF4A0196B;
                if(hq.dq * v0 == 0) {
                    if(hq.cg.length() >= v2) {
                        return;
                    }

                    hq.cg = hq.cg + arg5;
                    return;
                }

                if(1 != hq.dq * v0) {
                    return;
                }

                if(hq.co.length() >= 20) {
                    return;
                }

                hq.co = hq.co + arg5;
            }
            else {
                if(4 == hq.cm * v0) {
                    v6 = 0;
                    while(v6 < hq.ek.length()) {
                        if(arg5 == hq.ek.charAt(v6)) {
                            v3 = 1;
                        }
                        else {
                            ++v6;
                            continue;
                        }

                        break;
                    }

                    if(v3 == 0) {
                        return;
                    }

                    if(da.ds.length() >= 6) {
                        return;
                    }

                    da.ds = da.ds + arg5;
                    return;
                }

                if(hq.cm * v0 != 5) {
                    return;
                }

                v6 = 0;
                while(v6 < hq.dg.length()) {
                    if(arg5 == hq.dg.charAt(v6)) {
                        v3 = 1;
                    }
                    else {
                        ++v6;
                        continue;
                    }

                    break;
                }

                if(v3 == 0) {
                    return;
                }

                if(hq.cg.length() >= v2) {
                    return;
                }

                hq.cg = hq.cg + arg5;
            }
        }
        catch(RuntimeException v5) {
            v6_1 = new StringBuilder();
            v6_1.append("er.aa(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    final void aa(eg arg1, ew arg2, ew arg3, int arg4) {
        arg4 = 0x7EC06062;
        try {
            this.am(arg1, arg4);
            arg1.af(arg2, arg3, 0xADF2D6B2);
            this.ag(arg1, 93);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("er.aa(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    eg ab(ew arg2, int arg3) {
        ew v3 = null;
        int v0 = 0x8F709760;
        try {
            return this.af(arg2, v3, v0);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("er.ab(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public int ac() {
        return this.al * 0x7008A415;
    }

    public final boolean ad(ew arg2, int arg3) {
        arg3 = 0xCB65D8C2;
        try {
            eg v2_1 = this.ap(arg2, arg3);
            if(v2_1 == null) {
                return 0;
            }

            this.aq(v2_1, 0x7CD7F294);
            return 1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.ad(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean ae(int arg3) {
        arg3 = 0xD6491249;
        try {
            if(this.ax * arg3 != this.al * 0x7008A415) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("er.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    eg af(ew arg2, ew arg3, int arg4) {
        arg4 = 0xCB65D8C2;
        try {
            if(this.ap(arg2, arg4) == null) {
                eg v4 = this.at(0x139AC65F);
                v4.af(arg2, arg3, 0x76C77C42);
                this.az(v4, -908752740);
                this.ag(v4, 82);
                return v4;
            }

            throw new IllegalStateException();
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.af(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void ag(eg arg2, byte arg3) {
        try {
            this.ar.put(arg2.al, arg2);
            if(arg2.ae != null) {
                Object v3 = this.an.put(arg2.ae, arg2);
                if(v3 != null && arg2 != (((eg)v3))) {
                    ((eg)v3).ae = null;
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("er.ag(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    final void ah(int arg5, byte arg6) {
        try {
            this.al -= 0xB8540B3D;
            int v0 = 0x7008A415;
            if(arg5 < this.al * v0) {
                System.arraycopy(this.ae, arg5 + 1, this.ae, arg5, this.al * v0 - arg5);
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("er.ah(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public final eg ai(int arg2, int arg3) {
        if(arg2 >= 0) {
            try {
                if(arg2 < this.al * 0x7008A415) {
                    return this.ae[arg2];
                }

            label_8:
                throw new ArrayIndexOutOfBoundsException(arg2);
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("er.ai(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }

        goto label_8;
    }

    public static void aj(int arg0, ko arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        arg6 = 0x7427BD27;
        try {
            kv.an = arg6;
            kv.ap = arg1;
            kv.aj = arg2 * 0x38840C49;
            kv.ad = arg3 * 0x4F583F8D;
            li.aq = arg4 * 0xD7CD3D6B;
            kv.af = arg5;
            bs.ab = arg0 * 0x3013BA11;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("er.aj(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    eg aj(ew arg2, int arg3) {
        arg3 = 0xB3BC51C0;
        try {
            if(!arg2.al(arg3)) {
                return null;
            }

            return this.an.get(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ak() {
        this.al = 0;
        Arrays.fill(this.ae, null);
        this.ar.clear();
        this.an.clear();
    }

    public int al(int arg3) {
        arg3 = 0x7008A415;
        try {
            return this.al * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("er.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void am(eg arg2, int arg3) {
        try {
            if(this.ar.remove(arg2.al) != null) {
                if(arg2.ae != null) {
                    this.an.remove(arg2.ae);
                }

                return;
            }

            throw new IllegalStateException();
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.am(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public eg an(ew arg2, int arg3) {
        arg3 = 0xCB65D8C2;
        try {
            eg v3 = this.ap(arg2, arg3);
            if(v3 != null) {
                return v3;
            }

            return this.aj(arg2, 0x92329A8B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("er.an(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public final void ao(Comparator arg2, int arg3) {
        try {
            if(this.ap == null) {
                this.ap = arg2;
            }
            else if((this.ap instanceof eq)) {
                this.ap.ax(arg2, 0xAF3F7384);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.ao(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    eg ap(ew arg2, int arg3) {
        arg3 = 0x9F54818C;
        try {
            if(!arg2.al(arg3)) {
                return null;
            }

            return this.ar.get(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void aq(eg arg2, int arg3) {
        arg3 = 0x808531AD;
        try {
            arg3 = this.au(arg2, arg3);
            if(arg3 == -1) {
                return;
            }

            this.ah(arg3, -89);
            this.am(arg2, 2083692140);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.aq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static hu ar(int arg5) {
        og v1;
        int v4;
        hu v0;
        try {
            v0 = new hu();
            try {
                v4 = 0;
                v1 = kr.al("", client.aj.aj, false, 4);
                arg5 = 0xEE9012BD;
            }
            catch(Exception ) {
                v1 = ((og)arg5);
                goto label_33;
            }
        }
        catch(RuntimeException v5) {
            goto label_39;
        }

        try {
            byte[] v5_1 = new byte[((int)v1.an(arg5))];
            while(true) {
                if(v4 >= v5_1.length) {
                    goto label_26;
                }

                int v2 = v1.ap(v5_1, v4, v5_1.length - v4, 1166006047);
                if(v2 == -1) {
                    break;
                }

                v4 += v2;
            }

            throw new IOException();
        label_26:
            v0 = new hu(new lq(v5_1));
            goto label_33;
        }
        catch(Exception ) {
        label_33:
            if(v1 != null) {
                arg5 = 0x3ABFF8D1;
                try {
                    v1.ae(arg5);
                    return v0;
                }
                catch(RuntimeException v5) {
                label_39:
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("er.ar(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v5), v0_1.toString());
                }
                catch(Exception ) {
                    return v0;
                }
            }

            return v0;
        }
    }

    public boolean ar(ew arg2, int arg3) {
        arg3 = 0xC6693913;
        try {
            if(!arg2.al(arg3)) {
                return 0;
            }

            if(this.ar.containsKey(arg2)) {
                return 1;
            }

            return this.an.containsKey(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("er.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void as() {
        this.al = 0;
        Arrays.fill(this.ae, null);
        this.ar.clear();
        this.an.clear();
    }

    abstract eg at(int arg1);

    final int au(eg arg3, int arg4) {
        arg4 = 0;
        try {
            while(true) {
            label_1:
                if(arg4 >= this.al * 0x7008A415) {
                    return -1;
                }

                if(arg3 != this.ae[arg4]) {
                    goto label_9;
                }

                return arg4;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("er.au(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return arg4;
    label_9:
        ++arg4;
        goto label_1;
        return -1;
    }

    public final void av(int arg4) {
        try {
            int v0 = 0x7008A415;
            if(this.ap == null) {
                Arrays.sort(this.ae, 0, this.al * v0);
            }
            else {
                Arrays.sort(this.ae, 0, this.al * v0, this.ap);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("er.av(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    public final void aw(int arg3) {
        Comparator v3 = null;
        try {
            this.ap = v3;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("er.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    static int ax(ko arg3, ko arg4, byte arg5) {
        int v5 = 0;
        try {
            if(arg3.ak("titlewide.jpg", "", 0xF1F2C156)) {
                v5 = 1;
            }

            if(arg4.ak("logo_osrs", "", 0x140FEA5B)) {
                ++v5;
            }

            if(arg4.ak("logo_deadman_mode", "", -7750881)) {
                ++v5;
            }

            if(arg4.ak("titlebox", "", 0xE9A3E44E)) {
                ++v5;
            }

            if(arg4.ak("titlebutton", "", -1269669240)) {
                ++v5;
            }

            if(arg4.ak("titlebutton_large", "", -1740259916)) {
                ++v5;
            }

            if(arg4.ak("play_now_text", "", -1034252762)) {
                ++v5;
            }

            if(arg4.ak("titlebutton_wide42,1", "", 0x9EFA471C)) {
                ++v5;
            }

            if(arg4.ak("runes", "", 0x3FA75F47)) {
                ++v5;
            }

            if(arg4.ak("title_mute", "", 0x3F7F30F6)) {
                ++v5;
            }

            if(arg4.ak("options_radio_buttons,0", "", 0x81309482)) {
                ++v5;
            }

            if(arg4.ak("options_radio_buttons,2", "", 1452902564)) {
                ++v5;
            }

            if(arg4.ak("options_radio_buttons,4", "", 167015750)) {
                ++v5;
            }

            if(arg4.ak("options_radio_buttons,6", "", 0xC874F686)) {
                ++v5;
            }

            if(arg4.ak("login_icons", "", 1014294124)) {
                ++v5;
            }

            arg4.ak("sl_back", "", 0x25BECD10);
            arg4.ak("sl_flags", "", 124204997);
            arg4.ak("sl_arrows", "", 0xB3C8F8D8);
            arg4.ak("sl_stars", "", 0xDF693AAB);
            arg4.ak("sl_button", "", 0xA0B1E1A1);
            return v5;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("er.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void ax(byte arg3) {
        try {
            this.al = 0;
            Arrays.fill(this.ae, null);
            this.ar.clear();
            this.an.clear();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("er.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    abstract eg[] ay(int arg1, int arg2);

    final void az(eg arg3, int arg4) {
        try {
            eg[] v4 = this.ae;
            int v0 = this.al - 0x47ABF4C3;
            this.al = v0;
            v4[v0 * 0x7008A415 - 1] = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("er.az(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public boolean ba() {
        boolean v0 = this.ax * 0xF741292C == this.al * 0x7008A415 ? true : false;
        return v0;
    }

    public final boolean bb(ew arg2) {
        eg v2 = this.ap(arg2, 0xCB65D8C2);
        if(v2 == null) {
            return 0;
        }

        this.aq(v2, 0x150FBE22);
        return 1;
    }

    public final boolean bc(ew arg2) {
        eg v2 = this.ap(arg2, 0xCB65D8C2);
        if(v2 == null) {
            return 0;
        }

        this.aq(v2, 0x5E1A0737);
        return 1;
    }

    public int bd() {
        return this.al * 0x7008A415;
    }

    eg be(ew arg3) {
        return this.af(arg3, null, 0x8503AE7A);
    }

    public boolean bf() {
        boolean v0 = this.ax * -952639069 == this.al * 0x5FDBEF99 ? true : false;
        return v0;
    }

    eg bg(ew arg2) {
        if(!arg2.al(0x95690FE0)) {
            return null;
        }

        return this.an.get(arg2);
    }

    eg bh(ew arg2) {
        if(!arg2.al(-580223530)) {
            return null;
        }

        return this.an.get(arg2);
    }

    eg bi(ew arg3, ew arg4) {
        if(this.ap(arg3, 0xCB65D8C2) == null) {
            eg v0 = this.at(0x20EF253A);
            v0.af(arg3, arg4, 0x1A61CD04);
            this.az(v0, 0x87A51F31);
            this.ag(v0, 84);
            return v0;
        }

        throw new IllegalStateException();
    }

    final void bj(eg arg3) {
        int v0 = this.au(arg3, 0x812730A8);
        if(v0 == -1) {
            return;
        }

        this.ah(v0, -62);
        this.am(arg3, 0x7AC7805D);
    }

    public final boolean bk(ew arg2) {
        eg v2 = this.ap(arg2, 0xCB65D8C2);
        if(v2 == null) {
            return 0;
        }

        this.aq(v2, -67000550);
        return 1;
    }

    eg bl(ew arg3) {
        return this.af(arg3, null, 0x83421F2F);
    }

    public final boolean bm(ew arg2) {
        eg v2 = this.ap(arg2, 0xCB65D8C2);
        if(v2 == null) {
            return 0;
        }

        this.aq(v2, 0x1F05E492);
        return 1;
    }

    public boolean bn() {
        boolean v0 = this.ax * 0xD6491249 == this.al * 0x7008A415 ? true : false;
        return v0;
    }

    public eg bo(ew arg2) {
        eg v0 = this.ap(arg2, 0xCB65D8C2);
        if(v0 != null) {
            return v0;
        }

        return this.aj(arg2, 0xDBF65DC1);
    }

    public boolean bp(ew arg2) {
        if(!arg2.al(1658544000)) {
            return 0;
        }

        if(this.ar.containsKey(arg2)) {
            return 1;
        }

        return this.an.containsKey(arg2);
    }

    eg bq(ew arg2) {
        if(!arg2.al(-1488404137)) {
            return null;
        }

        return this.ar.get(arg2);
    }

    eg br(ew arg3, ew arg4) {
        if(this.ap(arg3, 0xCB65D8C2) == null) {
            eg v0 = this.at(0x66DA1329);
            v0.af(arg3, arg4, 0xD78547CF);
            this.az(v0, 1018678884);
            this.ag(v0, 35);
            return v0;
        }

        throw new IllegalStateException();
    }

    final void bs(eg arg3) {
        int v0 = this.au(arg3, 0x806850A1);
        if(v0 == -1) {
            return;
        }

        this.ah(v0, -40);
        this.am(arg3, 0x79FF4ACB);
    }

    public eg bt(ew arg2) {
        eg v0 = this.ap(arg2, 0xCB65D8C2);
        if(v0 != null) {
            return v0;
        }

        return this.aj(arg2, 0xBF3F851E);
    }

    final void bu(eg arg3) {
        int v0 = this.au(arg3, 0x8171F42F);
        if(v0 == -1) {
            return;
        }

        this.ah(v0, -71);
        this.am(arg3, 0x7D6F3C67);
    }

    eg bv(ew arg2) {
        if(!arg2.al(0x70F75061)) {
            return null;
        }

        return this.ar.get(arg2);
    }

    public boolean bw(ew arg2) {
        if(!arg2.al(0xE01710D2)) {
            return 0;
        }

        if(this.ar.containsKey(arg2)) {
            return 1;
        }

        return this.an.containsKey(arg2);
    }

    eg bx(ew arg2) {
        if(!arg2.al(198877640)) {
            return null;
        }

        return this.ar.get(arg2);
    }

    public eg by(ew arg2) {
        eg v0 = this.ap(arg2, 0xCB65D8C2);
        if(v0 != null) {
            return v0;
        }

        return this.aj(arg2, 0x80026639);
    }

    eg bz(ew arg2) {
        if(!arg2.al(756470485)) {
            return null;
        }

        return this.an.get(arg2);
    }

    public final eg ca(int arg3) {
        if(arg3 >= 0 && arg3 < this.al * 0xA4FF8AFE) {
            return this.ae[arg3];
        }

        throw new ArrayIndexOutOfBoundsException(arg3);
    }

    public final void cb() {
        if(this.ap == null) {
            Arrays.sort(this.ae, 0, this.al * 0x7008A415);
        }
        else {
            Arrays.sort(this.ae, 0, this.al * -1739340311, this.ap);
        }
    }

    final int cc(eg arg4) {
        int v0;
        for(v0 = 0; v0 < this.al * 0x7008A415; ++v0) {
            if(arg4 == this.ae[v0]) {
                return v0;
            }
        }

        return -1;
    }

    public final eg cd(int arg3) {
        if(arg3 >= 0 && arg3 < this.al * 0x7008A415) {
            return this.ae[arg3];
        }

        throw new ArrayIndexOutOfBoundsException(arg3);
    }

    final void ce(eg arg3) {
        if(this.ar.remove(arg3.al) != null) {
            if(arg3.ae != null) {
                this.an.remove(arg3.ae);
            }

            return;
        }

        throw new IllegalStateException();
    }

    public final void cf() {
        int v1 = 0x7008A415;
        if(this.ap == null) {
            Arrays.sort(this.ae, 0, this.al * v1);
        }
        else {
            Arrays.sort(this.ae, 0, this.al * v1, this.ap);
        }
    }

    abstract eg cg();

    final void ch(eg arg3) {
        if(this.ar.remove(arg3.al) != null) {
            if(arg3.ae != null) {
                this.an.remove(arg3.ae);
            }

            return;
        }

        throw new IllegalStateException();
    }

    final int ci(eg arg4) {
        int v0;
        for(v0 = 0; v0 < this.al * 0x7008A415; ++v0) {
            if(arg4 == this.ae[v0]) {
                return v0;
            }
        }

        return -1;
    }

    public final eg cj(int arg3) {
        if(arg3 >= 0 && arg3 < this.al * 0x7008A415) {
            return this.ae[arg3];
        }

        throw new ArrayIndexOutOfBoundsException(arg3);
    }

    final void ck(eg arg3) {
        this.ar.put(arg3.al, arg3);
        if(arg3.ae != null) {
            Object v0 = this.an.put(arg3.ae, arg3);
            if(v0 != null && arg3 != (((eg)v0))) {
                ((eg)v0).ae = null;
            }
        }
    }

    static final void cl(ie arg11, int arg12) {
        df v12;
        int v0_1;
        int v6;
        try {
            arg11.an = false;
            int v1 = -1493580901;
            int v2 = 1304812425;
            int v3 = 0xD19D0C3D;
            int v4 = 0x914F0683;
            int v5 = -1;
            if(v5 != arg11.cp * v1) {
                df v0 = fs.al(arg11.cp * v1, v2);
                if(v0 != null && v0.ap != null) {
                    arg11.cr += 431662807;
                    v6 = 0x6F0EB545;
                    if(arg11.ci * v6 < v0.ap.length && arg11.cr * 0xB2FDACE7 > v0.ad[arg11.ci * v6]) {
                        arg11.cr = 431662807;
                        arg11.ci += 0x1A1958D;
                        aw.be(v0, arg11.ci * v6, arg11.bp * v4, arg11.bw * v3, 0x78DBE057);
                    }

                    if(arg11.ci * v6 < v0.ap.length) {
                        goto label_66;
                    }

                    arg11.cr = 0;
                    arg11.ci = 0;
                    aw.be(v0, arg11.ci * v6, arg11.bp * v4, arg11.bw * v3, 0x76FB949C);
                    goto label_66;
                }

                arg11.cp = 0xCF94156D;
            }

        label_66:
            v1 = 0xA760211D;
            v6 = -2077001153;
            if(arg11.cl * v1 != v5 && client.bj * v6 >= arg11.ct * 0xD02A6FCB) {
                int v7 = 432280651;
                if(arg11.ck * v7 < 0) {
                    arg11.ck = 0;
                }

                arg12 = di.al(arg11.cl * v1, 21).aj * 0x5B7F8179;
                v0_1 = 0xAF5E56CB;
                if(arg12 != v5) {
                    v12 = fs.al(arg12, v2);
                    if(v12 != null && v12.ap != null) {
                        arg11.cm += 0x4EC85793;
                        if(arg11.ck * v7 < v12.ap.length && arg11.cm * 0x32295E9B > v12.ad[arg11.ck * v7]) {
                            arg11.cm = 0x4EC85793;
                            arg11.ck += 0xD5461563;
                            aw.be(v12, arg11.ck * v7, arg11.bp * v4, arg11.bw * v3, 2016644458);
                        }

                        if(arg11.ck * v7 < v12.ap.length) {
                            goto label_144;
                        }

                        if(arg11.ck * v7 >= 0 && arg11.ck * v7 < v12.ap.length) {
                            goto label_144;
                        }

                        arg11.cl = v0_1;
                        goto label_144;
                    }

                    arg11.cl = v0_1;
                    goto label_144;
                }

                arg11.cl = v0_1;
            }

        label_144:
            v0_1 = 2011890317;
            v1 = 0x3C37F003;
            if(arg11.ch * v0_1 != v5 && arg11.cz * v1 <= 1 && 1 == fs.al(arg11.ch * v0_1, v2).az * 0x8C0143D9 && arg11.df * 0x64526F3D > 0 && arg11.dv * 0xF925C7C7 <= client.bj * v6 && arg11.dp * 0x4E20F729 < client.bj * v6) {
                arg11.cz = 2115386027;
                return;
            }

            if(arg11.ch * v0_1 != v5 && arg11.cz * v1 == 0) {
                v12 = fs.al(arg11.ch * v0_1, v2);
                v0_1 = 0x74A26FBB;
                if(v12 != null && v12.ap != null) {
                    arg11.cs += 0x80D693CD;
                    v5 = 0x38617D1D;
                    if(arg11.ce * v5 < v12.ap.length && arg11.cs * 0x52789105 > v12.ad[arg11.ce * v5]) {
                        arg11.cs = 0x80D693CD;
                        arg11.ce += 0x32AF2D35;
                        aw.be(v12, arg11.ce * v5, arg11.bp * v4, arg11.bw * v3, 0x7492874D);
                    }

                    if(arg11.ce * v5 >= v12.ap.length) {
                        arg11.ce -= v12.ab * -765958011;
                        arg11.cn += 0xC5D17E43;
                        if(arg11.cn * 0x7FF43E6B < v12.am * 2027171405 && arg11.ce * v5 >= 0) {
                            if(arg11.ce * v5 >= v12.ap.length) {
                            }
                            else {
                                aw.be(v12, arg11.ce * v5, arg11.bp * v4, arg11.bw * v3, 2056358267);
                                goto label_266;
                            }
                        }

                        arg11.ch = v0_1;
                    }

                label_266:
                    arg11.an = v12.ai;
                    goto label_270;
                }

                arg11.ch = v0_1;
            }

        label_270:
            if(arg11.cz * v1 > 0) {
                arg11.cz -= 2115386027;
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12_1 = new StringBuilder();
            v12_1.append("er.cl(");
            v12_1.append(')');
            throw lx.al(((Throwable)v11), v12_1.toString());
        }
    }

    final void cl(eg arg4) {
        eg[] v0 = this.ae;
        int v1 = this.al - 0x47ABF4C3;
        this.al = v1;
        v0[v1 * 0x7008A415 - 1] = arg4;
    }

    final void cm(int arg6) {
        this.al -= 0xB8540B3D;
        int v1 = 0x7008A415;
        if(arg6 < this.al * v1) {
            System.arraycopy(this.ae, arg6 + 1, this.ae, arg6, this.al * v1 - arg6);
        }
    }

    final void cn(eg arg4) {
        eg[] v0 = this.ae;
        int v1 = this.al + 2020435517;
        this.al = v1;
        v0[v1 * -508695974 - 1] = arg4;
    }

    abstract eg[] co(int arg1);

    final int cp(eg arg4) {
        int v0;
        for(v0 = 0; v0 < this.al * 0x7011408C; ++v0) {
            if(arg4 == this.ae[v0]) {
                return v0;
            }
        }

        return -1;
    }

    abstract eg cq();

    final void cr(eg arg3) {
        if(this.ar.remove(arg3.al) != null) {
            if(arg3.ae != null) {
                this.an.remove(arg3.ae);
            }

            return;
        }

        throw new IllegalStateException();
    }

    final void cs(eg arg3) {
        if(this.ar.remove(arg3.al) != null) {
            if(arg3.ae != null) {
                this.an.remove(arg3.ae);
            }

            return;
        }

        throw new IllegalStateException();
    }

    final void ct(int arg6) {
        this.al -= 0xB8540B3D;
        if(arg6 < this.al * 0xED7EA7F3) {
            System.arraycopy(this.ae, arg6 + 1, this.ae, arg6, this.al * 1804959080 - arg6);
        }
    }

    abstract eg cu();

    abstract eg cv();

    final int cw(eg arg4) {
        int v0;
        for(v0 = 0; v0 < this.al * 0x7008A415; ++v0) {
            if(arg4 == this.ae[v0]) {
                return v0;
            }
        }

        return -1;
    }

    public final void cx() {
        if(this.ap == null) {
            Arrays.sort(this.ae, 0, this.al * -2109522293);
        }
        else {
            Arrays.sort(this.ae, 0, this.al * 0x7008A415, this.ap);
        }
    }

    public final void cy() {
        if(this.ap == null) {
            Arrays.sort(this.ae, 0, this.al * 0x66295F8);
        }
        else {
            Arrays.sort(this.ae, 0, this.al * 0x7008A415, this.ap);
        }
    }

    final void cz(eg arg3) {
        if(this.ar.remove(arg3.al) != null) {
            if(arg3.ae != null) {
                this.an.remove(arg3.ae);
            }

            return;
        }

        throw new IllegalStateException();
    }

    public final void db() {
        this.ap = null;
    }

    public final void de() {
        this.ap = null;
    }

    abstract eg[] dh(int arg1);

    public final void dk(Comparator arg3) {
        if(this.ap == null) {
            this.ap = arg3;
        }
        else if((this.ap instanceof eq)) {
            this.ap.ax(arg3, -736800583);
        }
    }

    public final void dm() {
        this.ap = null;
    }

    abstract eg[] dp(int arg1);

    public final void du() {
        this.ap = null;
    }

    abstract eg[] dv(int arg1);

    abstract eg[] dw(int arg1);

    static final void eh(boolean arg4, lo arg5, byte arg6) {
        int v5;
        int v0;
        int v6 = 0;
        try {
            client.js = 0;
            client.ee = 0;
            ei.ec(852707026);
            bm.ei(arg4, arg5, 0x4344F616);
            ha.ex(arg5, 0x870F3995);
            int v4_1;
            for(v4_1 = 0; v4_1 < client.js * -1832440893; ++v4_1) {
                v0 = client.jl[v4_1];
                if(client.ev[v0].dw * 0x4CECFB7D != client.bj * -2077001153) {
                    client.ev[v0].ax = null;
                    client.ev[v0] = null;
                }
            }

            v0 = 0x6E311C05;
            int v2 = 0xF24F550B;
            if(client.eh.ad * v0 != arg5.ar * v2) {
                StringBuilder v6_1 = new StringBuilder();
                v6_1.append(arg5.ar * v2);
                v6_1.append(jc.al);
                v6_1.append(client.eh.ad * v0);
                throw new RuntimeException(v6_1.toString());
            }

            while(true) {
                v5 = 359080599;
                if(v6 >= client.eg * v5) {
                    return;
                }

                if(client.ev[client.eu[v6]] == null) {
                    break;
                }

                ++v6;
            }

            StringBuilder v0_1 = new StringBuilder();
            v0_1.append(v6);
            v0_1.append(jc.al);
            v0_1.append(client.eg * v5);
            throw new RuntimeException(v0_1.toString());
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("er.eh(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }
}

