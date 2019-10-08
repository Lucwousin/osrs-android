public class gv extends hz {
    int ae;
    fi al;
    int ar;
    fi ax;

    public gv() {
        super();
        this.ax = new fi();
        this.al = new fi();
        this.ae = 0;
        this.ar = -1;
    }

    public final void aa(hz arg2) {
        __monitor_enter(this);
        try {
            this.ax.ae(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void ab(int[] arg2, int arg3, int arg4) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).gl(arg2, arg3, arg4);
        }
    }

    protected hz ac() {
        return this.ax.aj();
    }

    protected int ad() {
        return 0;
    }

    void ae() {
        if(this.ae > 0) {
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                ((hk)v0).ax -= this.ae;
            }

            this.ar -= this.ae;
            this.ae = 0;
        }
    }

    public final void af(int arg3) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg3 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg3;
                this.ai(arg3);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ai(v0);
            arg3 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg3 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_42;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ai(arg3);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        __monitor_exit(this);
        return;
        try {
        label_42:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_42;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_45:
            __monitor_exit(this);
            throw v3;
        }
    }

    void ag() {
        if(this.ae > 0) {
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                ((hk)v0).ax -= this.ae;
            }

            this.ar -= this.ae;
            this.ae = 0;
        }
    }

    void ah() {
        if(this.ae > 0) {
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                ((hk)v0).ax -= this.ae;
            }

            this.ar -= this.ae;
            this.ae = 0;
        }
    }

    void ai(int arg2) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).af(arg2);
        }
    }

    protected hz aj() {
        return this.ax.aq();
    }

    void ak(hk arg2) {
        arg2.lp();
        arg2.ax();
        mx v2 = this.al.ax.gb;
        this.ar = v2 == this.al.ax ? -1 : ((hk)v2).ax;
    }

    public final void al(hz arg1) {
        __monitor_enter(this);
        try {
            arg1.lp();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    public final void am(hz arg1) {
        __monitor_enter(this);
        try {
            arg1.lp();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    void an(hk arg2) {
        arg2.lp();
        arg2.ax();
        mx v2 = this.al.ax.gb;
        int v2_1 = v2 == this.al.ax ? -1 : ((hk)v2).ax;
        this.ar = v2_1;
    }

    void ao(mx arg3, hk arg4) {
        while(arg3 != this.al.ax) {
            if(arg3.ax > arg4.ax) {
                break;
            }

            arg3 = arg3.gb;
        }

        fi.ar(((mx)arg4), arg3);
        this.ar = this.al.ax.gb.ax;
    }

    protected hz ap() {
        return this.ax.aj();
    }

    public final void aq(int[] arg3, int arg4, int arg5) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg5 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg5;
                this.ab(arg3, arg4, arg5);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ab(arg3, arg4, v0);
            arg4 += v0;
            arg5 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg5 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_43;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ab(arg3, arg4, arg5);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_43:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_43;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_46:
            __monitor_exit(this);
            throw v3;
        }
    }

    void ar(mx arg3, hk arg4) {
        while(arg3 != this.al.ax) {
            if(arg3.ax > arg4.ax) {
                break;
            }

            arg3 = arg3.gb;
        }

        fi.ar(((mx)arg4), arg3);
        this.ar = this.al.ax.gb.ax;
    }

    void as(hk arg2) {
        arg2.lp();
        arg2.ax();
        mx v2 = this.al.ax.gb;
        this.ar = v2 == this.al.ax ? -1 : ((hk)v2).ax;
    }

    void at() {
        if(this.ae > 0) {
            mx v0;
            for(v0 = this.al.aj(); v0 != null; v0 = this.al.aq()) {
                ((hk)v0).ax -= this.ae;
            }

            this.ar -= this.ae;
            this.ae = 0;
        }
    }

    public final void au(hz arg2) {
        __monitor_enter(this);
        try {
            this.ax.ae(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void av(hz arg2) {
        __monitor_enter(this);
        try {
            this.ax.ae(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void aw(mx arg3, hk arg4) {
        while(arg3 != this.al.ax) {
            if(arg3.ax > arg4.ax) {
                break;
            }

            arg3 = arg3.gb;
        }

        fi.ar(((mx)arg4), arg3);
        this.ar = this.al.ax.gb.ax;
    }

    public final void ax(hz arg2) {
        __monitor_enter(this);
        try {
            this.ax.ae(((mx)arg2));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    void ay(mx arg3, hk arg4) {
        while(arg3 != this.al.ax) {
            if(arg3.ax > arg4.ax) {
                break;
            }

            arg3 = arg3.gb;
        }

        fi.ar(((mx)arg4), arg3);
        this.ar = this.al.ax.gb.ax;
    }

    public final void az(hz arg1) {
        __monitor_enter(this);
        try {
            arg1.lp();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    protected hz ba() {
        return this.ax.aq();
    }

    void bb(int arg2) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).af(arg2);
        }
    }

    void bc(int arg2) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).af(arg2);
        }
    }

    protected hz bd() {
        return this.ax.aj();
    }

    protected int bf() {
        return 0;
    }

    void bg(int[] arg2, int arg3, int arg4) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).gl(arg2, arg3, arg4);
        }
    }

    void bh(int arg2) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).af(arg2);
        }
    }

    protected int bn() {
        return 0;
    }

    public final void bo(int[] arg3, int arg4, int arg5) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg5 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg5;
                this.ab(arg3, arg4, arg5);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ab(arg3, arg4, v0);
            arg4 += v0;
            arg5 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg5 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_43;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ab(arg3, arg4, arg5);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_43:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_43;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_46:
            __monitor_exit(this);
            throw v3;
        }
    }

    protected int bp() {
        return 0;
    }

    void bq(int[] arg2, int arg3, int arg4) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).gl(arg2, arg3, arg4);
        }
    }

    public final void bt(int[] arg3, int arg4, int arg5) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg5 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg5;
                this.ab(arg3, arg4, arg5);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ab(arg3, arg4, v0);
            arg4 += v0;
            arg5 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg5 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_43;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ab(arg3, arg4, arg5);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_43:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_43;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_46:
            __monitor_exit(this);
            throw v3;
        }
    }

    void bv(int[] arg2, int arg3, int arg4) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).gl(arg2, arg3, arg4);
        }
    }

    public final void bw(int[] arg3, int arg4, int arg5) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg5 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg5;
                this.ab(arg3, arg4, arg5);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ab(arg3, arg4, v0);
            arg4 += v0;
            arg5 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg5 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_43;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ab(arg3, arg4, arg5);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_43:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_43;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_46:
            __monitor_exit(this);
            throw v3;
        }
    }

    void bx(int[] arg2, int arg3, int arg4) {
        mx v0;
        for(v0 = this.ax.aj(); v0 != null; v0 = this.ax.aq()) {
            ((hz)v0).gl(arg2, arg3, arg4);
        }
    }

    public final void by(int[] arg3, int arg4, int arg5) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg5 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg5;
                this.ab(arg3, arg4, arg5);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ab(arg3, arg4, v0);
            arg4 += v0;
            arg5 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg5 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_43;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ab(arg3, arg4, arg5);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        __monitor_exit(this);
        return;
        try {
        label_43:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_43;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_46:
            __monitor_exit(this);
            throw v3;
        }
    }

    public final void bz(int arg3) {
        mx v0_1;
        __monitor_enter(this);
        try {
            do {
            label_1:
                if(this.ar < 0) {
                    goto label_3;
                }

                if(this.ae + arg3 >= this.ar) {
                    goto label_16;
                }

                this.ae += arg3;
                this.ai(arg3);
                break;
            }
            while(true);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        __monitor_exit(this);
        return;
        try {
        label_16:
            int v0 = this.ar - this.ae;
            this.ai(v0);
            arg3 -= v0;
            this.ae += v0;
            this.ae();
            v0_1 = this.al.aj();
            __monitor_enter(v0_1);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        try {
            int v1 = ((hk)v0_1).al(this);
            if(v1 < 0) {
                ((hk)v0_1).ax = 0;
                this.an(((hk)v0_1));
            }
            else {
                ((hk)v0_1).ax = v1;
                this.ar(((hk)v0_1).gb, ((hk)v0_1));
            }

            __monitor_exit(v0_1);
            if(arg3 != 0) {
                goto label_1;
            }
        }
        catch(Throwable v3) {
            goto label_42;
        }

        __monitor_exit(this);
        return;
        try {
        label_3:
            this.ai(arg3);
        }
        catch(Throwable v3) {
            goto label_45;
        }

        __monitor_exit(this);
        return;
        try {
        label_42:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_42;
        }

        try {
            throw v3;
        }
        catch(Throwable v3) {
        label_45:
            __monitor_exit(this);
            throw v3;
        }
    }
}

