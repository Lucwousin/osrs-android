import com.jagex.oldscape.osrenderer.ax;

public class jo extends fy {
    static final int ae = 5;
    int al;
    static final int ar = 0;
    static final int br = 4;

    jo() {
        try {
            super();
            this.al = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jo.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(ls arg13, int arg14, int arg15, int arg16, int arg17) {
        int[] v0 = ax.aw(-8);
        int[] v1 = arg13.ai(0x52CC7C79);
        int v3;
        for(v3 = 0; v3 < v0.length; v3 += 4) {
            int v4 = v0[v3];
            int v7 = v0[v3 + 1];
            if(v7 >= 0) {
                if(v7 >= 5) {
                }
                else {
                    int v5 = v0[v3 + 2] - v1[0];
                    int v6 = v0[v3 + 3] - v1[1];
                    long v10 = ji.ax(0x2076E2C1);
                    int v8 = v5 * arg14 / arg16;
                    int v9 = v6 * arg15 / arg17;
                    switch(v4) {
                        case 0: {
                            goto label_39;
                        }
                        case 2: {
                            goto label_33;
                        }
                        case 1: 
                        case 3: {
                            goto label_36;
                        }
                    }

                    goto label_41;
                label_33:
                    this.af(v7, v8, v9, v10);
                    goto label_41;
                label_36:
                    this.aq(v7, v8, v9, v10);
                    goto label_41;
                label_39:
                    this.ab(v7, v8, v9, v10);
                }
            }

        label_41:
        }
    }

    void ab(int arg9, int arg10, int arg11, long arg12) {
        int v0 = 0xDBC805F3;
        try {
            if(!this.ai(arg9, v0)) {
                this.ax.aq(arg9, 0, arg10, arg11, arg12);
                this.al = (1 << arg9 | this.al * 0x708B791B) * 0x38FD3913;
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("jo.ab(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    void ac(int arg8, int arg9, int arg10, long arg11) {
        if(this.ai(arg8, 0xFA3C1CC9)) {
            this.ax.af(arg8, arg9, arg10, arg11);
        }
    }

    void ad(int arg9) {
        arg9 = -1923749008;
        try {
            long v6 = this.al(arg9);
            for(arg9 = 0; arg9 < 5; ++arg9) {
                this.aq(arg9, -1, -1, v6);
            }
        }
        catch(RuntimeException v9) {
            goto label_16;
        }

        return;
    label_16:
        StringBuilder v0 = new StringBuilder();
        v0.append("jo.ad(");
        v0.append(')');
        throw lx.al(((Throwable)v9), v0.toString());
    }

    void af(int arg8, int arg9, int arg10, long arg11) {
        int v0 = 0xBBB9D06F;
        try {
            if(this.ai(arg8, v0)) {
                this.ax.af(arg8, arg9, arg10, arg11);
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("jo.af(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void ag() {
        long v7 = this.al(-2075627196);
        int v0;
        for(v0 = 0; v0 < 5; ++v0) {
            this.aq(v0, -1, -1, v7);
        }
    }

    void ah() {
        long v7 = this.al(-2095059102);
        int v0;
        for(v0 = 0; v0 < 5; ++v0) {
            this.aq(v0, -1, -1, v7);
        }
    }

    boolean ai(int arg2, int arg3) {
        boolean v0;
        try {
            v0 = true;
            if((1 << arg2 & this.al * 0x708B791B) == 0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jo.ai(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return v0;
    }

    void aj(ls arg13, int arg14, int arg15, int arg16, int arg17, byte arg18) {
        int v3;
        byte v0 = -20;
        try {
            int[] v0_2 = ax.aw(v0);
            int[] v1 = arg13.ai(0x52CC7C79);
            v3 = 0;
            while(true) {
            label_7:
                if(v3 >= v0_2.length) {
                    return;
                }

                int v4 = v0_2[v3];
                int v7 = v0_2[v3 + 1];
                if(v7 >= 0) {
                    if(v7 >= 5) {
                    }
                    else {
                        int v5 = v0_2[v3 + 2] - v1[0];
                        int v6 = v0_2[v3 + 3] - v1[1];
                        long v10 = ji.ax(0x2076E2C1);
                        int v8 = v5 * arg14 / arg16;
                        int v9 = v6 * arg15 / arg17;
                        switch(v4) {
                            case 0: {
                                goto label_39;
                            }
                            case 2: {
                                goto label_33;
                            }
                            case 1: 
                            case 3: {
                                goto label_36;
                            }
                        }

                        break;
                    label_33:
                        this.af(v7, v8, v9, v10);
                        break;
                    label_36:
                        this.aq(v7, v8, v9, v10);
                        break;
                    label_39:
                        this.ab(v7, v8, v9, v10);
                    }
                }

                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_46;
        }

        v3 += 4;
        goto label_7;
        return;
    label_46:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("jo.aj(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
    }

    void ak(int arg8, int arg9, int arg10, long arg11) {
        if(this.ai(arg8, 0xCDB003F3)) {
            this.ax.af(arg8, arg9, arg10, arg11);
        }
    }

    void am() {
        long v7 = this.al(0x8B70C495);
        int v0;
        for(v0 = 0; v0 < 5; ++v0) {
            this.aq(v0, -1, -1, v7);
        }
    }

    void ao(int arg9, int arg10, int arg11, long arg12) {
        if(!this.ai(arg9, 0xFAB4BE80)) {
            this.ax.aq(arg9, 0, arg10, arg11, arg12);
            this.al = (1 << arg9 | this.al * 0x708B791B) * 0x38FD3913;
        }
    }

    void aq(int arg9, int arg10, int arg11, long arg12) {
        int v0 = 0xA3F5086B;
        try {
            if(this.ai(arg9, v0)) {
                this.ax.ab(arg9, 0, arg10, arg11, arg12);
                this.al = (~(1 << arg9) & this.al * 0x708B791B) * 0x38FD3913;
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("jo.aq(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    void as(int arg9, int arg10, int arg11, long arg12) {
        if(!this.ai(arg9, 0x901AC0B6)) {
            this.ax.aq(arg9, 0, arg10, arg11, arg12);
            this.al = (1 << arg9 | this.al * 0x60F51902) * 0x38FD3913;
        }
    }

    void at(int arg9, int arg10, int arg11, long arg12) {
        if(this.ai(arg9, 0xDA7CA738)) {
            this.ax.ab(arg9, 0, arg10, arg11, arg12);
            this.al = (~(1 << arg9) & this.al * -249635160) * 0xAB3B0B0A;
        }
    }

    void au(ls arg13, int arg14, int arg15, int arg16, int arg17) {
        int[] v0 = ax.aw(-12);
        int[] v1 = arg13.ai(0x52CC7C79);
        int v3;
        for(v3 = 0; v3 < v0.length; v3 += 4) {
            int v4 = v0[v3];
            int v7 = v0[v3 + 1];
            if(v7 >= 0) {
                if(v7 >= 5) {
                }
                else {
                    int v5 = v0[v3 + 2] - v1[0];
                    int v6 = v0[v3 + 3] - v1[1];
                    long v10 = ji.ax(0x2076E2C1);
                    int v8 = v5 * arg14 / arg16;
                    int v9 = v6 * arg15 / arg17;
                    switch(v4) {
                        case 0: {
                            goto label_39;
                        }
                        case 2: {
                            goto label_33;
                        }
                        case 1: 
                        case 3: {
                            goto label_36;
                        }
                    }

                    goto label_41;
                label_33:
                    this.af(v7, v8, v9, v10);
                    goto label_41;
                label_36:
                    this.aq(v7, v8, v9, v10);
                    goto label_41;
                label_39:
                    this.ab(v7, v8, v9, v10);
                }
            }

        label_41:
        }
    }

    void av(ls arg13, int arg14, int arg15, int arg16, int arg17) {
        int[] v0 = ax.aw(80);
        int[] v1 = arg13.ai(0x52CC7C79);
        int v3;
        for(v3 = 0; v3 < v0.length; v3 += 4) {
            int v4 = v0[v3];
            int v7 = v0[v3 + 1];
            if(v7 >= 0) {
                if(v7 >= 5) {
                }
                else {
                    int v5 = v0[v3 + 2] - v1[0];
                    int v6 = v0[v3 + 3] - v1[1];
                    long v10 = ji.ax(0x2076E2C1);
                    int v8 = v5 * arg14 / arg16;
                    int v9 = v6 * arg15 / arg17;
                    switch(v4) {
                        case 0: {
                            goto label_39;
                        }
                        case 2: {
                            goto label_33;
                        }
                        case 1: 
                        case 3: {
                            goto label_36;
                        }
                    }

                    goto label_41;
                label_33:
                    this.af(v7, v8, v9, v10);
                    goto label_41;
                label_36:
                    this.aq(v7, v8, v9, v10);
                    goto label_41;
                label_39:
                    this.ab(v7, v8, v9, v10);
                }
            }

        label_41:
        }
    }

    void aw(int arg9, int arg10, int arg11, long arg12) {
        if(!this.ai(arg9, 0xB6904D67)) {
            this.ax.aq(arg9, 0, arg10, arg11, arg12);
            this.al = (1 << arg9 | this.al * 0x708B791B) * 0x38FD3913;
        }
    }

    void ay(int arg9, int arg10, int arg11, long arg12) {
        if(!this.ai(arg9, 0x857FF9C8)) {
            this.ax.aq(arg9, 0, arg10, arg11, arg12);
            this.al = (1 << arg9 | this.al * 0x708B791B) * 0x38FD3913;
        }
    }

    void az() {
        long v7 = this.al(0x8AD929B7);
        int v0;
        for(v0 = 0; v0 < 5; ++v0) {
            this.aq(v0, -1, -1, v7);
        }
    }

    void ba(int arg8, int arg9, int arg10, long arg11) {
        if(this.ai(arg8, 0xE1B16F9C)) {
            this.ax.af(arg8, arg9, arg10, arg11);
        }
    }

    void bd(int arg8, int arg9, int arg10, long arg11) {
        if(this.ai(arg8, 0xC2CB7DFA)) {
            this.ax.af(arg8, arg9, arg10, arg11);
        }
    }

    boolean bf(int arg3) {
        boolean v1 = true;
        if((1 << arg3 & this.al * 0x708B791B) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    boolean bn(int arg3) {
        boolean v1 = true;
        if((1 << arg3 & this.al * 0x5C655F3F) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    boolean bp(int arg3) {
        boolean v1 = true;
        if((1 << arg3 & this.al * 0x708B791B) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }
}

