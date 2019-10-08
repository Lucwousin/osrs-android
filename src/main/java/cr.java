public class cr implements cm {
    int ae;
    int al;
    int an;
    int ap;
    int ar;
    int ax;

    cr() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cr.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[] aa(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, 0x8F6AD56B)) {
            return null;
        }

        return new int[]{this.an * 0x72295BC0 - this.ae * 1608410048 + arg6, this.ap * 0x2E6CA3C0 - this.ar * 0xA350CCC0 + arg7};
    }

    public void ab(dh arg4) {
        int v2 = -1110923921;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * 0x9051BCCB;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0x6DF95D7F;
        }

        v2 = 0x7CB9B28F;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * -1407440267;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 0x2E42DE8D;
        }
    }

    public void ad(dh arg4) {
        int v2 = -1110923921;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * 0x9051BCCB;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0x6DF95D7F;
        }

        v2 = 0x7CB9B28F;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * -1407440267;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 0x2E42DE8D;
        }
    }

    public boolean ae(int arg2, int arg3, byte arg4) {
        arg2 >>= 6;
        try {
            if(arg2 != this.an * -1110923921) {
                return false;
            }
            else if(arg3 >> 6 != this.ap * 0x7CB9B28F) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cr.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    public boolean af(int arg5, int arg6, int arg7) {
        int v1 = 0x4F59D9F1;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.al * 0xA824A555 + this.ax * v1) {
            }
            else {
                if(arg6 >> 6 == this.ae * 0x257F798F && arg7 >> 6 == this.ar * -2104671437) {
                    v2 = true;
                }

                return v2;
            }
        }

        return 0;
    }

    public af ag(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -26)) {
            return null;
        }

        return new af(this.ax * 0x4F59D9F1, this.ae * -1490842261 - this.an * 0x72295BC0 + arg4, this.ar * 0xA350CCC0 - this.ap * 0xA3823BB5 + arg5);
    }

    public void ah(lq arg3) {
        this.ax = arg3.ay(-2) * 0xDCD1F711;
        this.al = arg3.ay(-60) * 0x53B62FFD;
        this.ae = arg3.ao(-1432542805) * 0x6BBD856F;
        this.ar = arg3.ao(0x632FA05D) * 0x83346FFB;
        this.an = arg3.ao(1637301918) * 0x5718598F;
        this.ap = arg3.ao(0xB2B1EB90) * 1006972015;
        this.aj(105);
    }

    public boolean ai(int arg5, int arg6, int arg7) {
        int v1 = 0x4F59D9F1;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.al * 0xA824A555 + this.ax * v1) {
            }
            else if(arg6 >> 6 == this.ae * 0x257F798F && arg7 >> 6 == this.ar * -2104671437) {
                v2 = true;
            }
        }

        return v2;
    }

    void aj(byte arg1) {
    }

    public boolean al(int arg4, int arg5, int arg6, int arg7) {
        try {
            int v0 = 0x4F59D9F1;
            boolean v1 = false;
            if(arg4 >= this.ax * v0) {
                if(arg4 >= this.al * 0xA824A555 + this.ax * v0) {
                }
                else if(arg5 >> 6 == this.ae * 0x257F798F) {
                    if(arg6 >> 6 != this.ar * -2104671437) {
                        return v1;
                    }

                    return true;
                }
            }

            return v1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cr.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return true;
    }

    public af am(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -107)) {
            return null;
        }

        return new af(this.ax * 0xB606A8C3, this.ae * 1608410048 - this.an * 0x6365456B + arg4, this.ar * 0xA350CCC0 - this.ap * 0xF33FF201 + arg5);
    }

    public af an(int arg3, int arg4, byte arg5) {
        arg5 = -2;
        try {
            if(!this.ae(arg3, arg4, arg5)) {
                return null;
            }

            return new af(this.ax * 0x4F59D9F1, this.ae * 1608410048 - this.an * 0x72295BC0 + arg3, this.ar * 0xA350CCC0 - this.ap * 0x2E6CA3C0 + arg4);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cr.an(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void ao() {
    }

    public void ap(lq arg2, int arg3) {
        byte v3 = -81;
        try {
            this.ax = arg2.ay(v3) * 0xDCD1F711;
            this.al = arg2.ay(-69) * 0x53B62FFD;
            this.ae = arg2.ao(0xE2AE4855) * 0x6BBD856F;
            this.ar = arg2.ao(702706998) * 0x83346FFB;
            this.an = arg2.ao(0x9CABDA61) * 0x5718598F;
            this.ap = arg2.ao(0x3BDF0D8F) * 1006972015;
            this.aj(-28);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("cr.ap(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public void aq(dh arg4) {
        int v2 = -1110923921;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * 0x9051BCCB;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0x6DF95D7F;
        }

        v2 = 0x7CB9B28F;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * -1407440267;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 0x2E42DE8D;
        }
    }

    public int[] ar(int arg4, int arg5, int arg6, int arg7) {
        arg7 = 0x81C080E2;
        try {
            if(!this.al(arg4, arg5, arg6, arg7)) {
                return null;
            }

            return new int[]{this.an * 0x72295BC0 - this.ae * 1608410048 + arg5, this.ap * 0x2E6CA3C0 - this.ar * 0xA350CCC0 + arg6};
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cr.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void at() {
    }

    public int[] au(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, -1900992544)) {
            return null;
        }

        return new int[]{this.an * 0x72295BC0 - this.ae * 993575902 + arg6, this.ap * 0x2E6CA3C0 - this.ar * 0x2B4863EB + arg7};
    }

    public int[] av(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, 0x87063B30)) {
            return null;
        }

        return new int[]{this.an * 0x72295BC0 - this.ae * 0x2AF5CF6A + arg6, this.ap * 0x2E6CA3C0 - this.ar * 0x682BCF9B + arg7};
    }

    public boolean aw(int arg3, int arg4) {
        boolean v3 = arg3 >> 6 != this.an * -1110923921 || arg4 >> 6 != this.ap * 0x7CB9B28F ? false : true;
        return v3;
    }

    public void ax(dh arg3, int arg4) {
        try {
            int v1 = -1110923921;
            if(arg3.ab * -1474008723 > this.an * v1) {
                arg3.ab = this.an * 0x9051BCCB;
            }

            if(arg3.af * 0xA95E9011 < this.an * v1) {
                arg3.af = this.an * 0x6DF95D7F;
            }

            v1 = 0x7CB9B28F;
            if(arg3.ai * 0xB342073 > this.ap * v1) {
                arg3.ai = this.ap * -1407440267;
            }

            if(arg3.av * 0x9FFD4C8B < this.ap * v1) {
                arg3.av = this.ap * 0x2E42DE8D;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cr.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean ay(int arg3, int arg4) {
        boolean v3 = arg3 >> 6 != this.an * -1110923921 || arg4 >> 6 != this.ap * 0x7CB9B28F ? false : true;
        return v3;
    }

    public af az(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -40)) {
            return null;
        }

        return new af(this.ax * 0xE66C0227, this.ae * 1608410048 - this.an * 0x72295BC0 + arg4, this.ar * 0xA350CCC0 - this.ap * 1769083667 + arg5);
    }

    static void bw(int[] arg15, int[] arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28) {
        int v1 = arg27;
        int v2 = 0x100 - v1;
        int v3 = -arg23;
        int v4 = arg19;
        int v5;
        for(v5 = arg20; v3 < 0; v5 = v9 + arg21) {
            int v6 = (v4 >> 16) * arg26;
            int v8 = -arg22;
            int v9 = v5;
            v5 = arg18;
            while(v8 < 0) {
                int v10 = (v5 >> 16) + v6;
                try {
                    v10 = arg16[v10];
                    if(v10 != 0) {
                        arg15[v9] = (0xFF00FF00 & (arg15[v9] & 0xFF00FF) * v2 + (0xFF00FF & v10) * v1) + ((v10 & 0xFF00) * v1 + (arg15[v9] & 0xFF00) * v2 & 0xFF0000) >> 8;
                        ++v9;
                    }
                    else {
                        goto label_41;
                    }

                    goto label_42;
                }
                catch(RuntimeException v0) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("cr.bw(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0), v1_1.toString());
                }

            label_41:
                ++v9;
            label_42:
                v5 += arg24;
                ++v8;
            }

            v4 += arg25;
            ++v3;
        }
    }
}

