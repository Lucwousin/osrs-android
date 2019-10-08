package com.jagex.jagex3.client.input.softkeyboard;

import fy;
import lx;

public class ax extends fy {
    ax() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/jagex3/client/input/softkeyboard/ax.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void aa() {
        long v0 = this.al(-2064395930);
        this.ax.ap(84, v0);
        this.ax.aj(84, v0);
    }

    public void ab(int arg3, byte arg4) {
        try {
            this.ax.aa(arg3, this.al(0x8CBF97F1));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("com/jagex/jagex3/client/input/softkeyboard/ax.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void ad(byte arg4) {
        int v4 = 0x8992A218;
        try {
            long v0 = this.al(v4);
            this.ax.ap(80, v0);
            this.ax.aj(80, v0);
            return;
        }
        catch(RuntimeException v4_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/jagex3/client/input/softkeyboard/ax.ad(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4_1), v0_1.toString());
        }
    }

    public void af(String arg7, String arg8) {
        int v0 = Math.min(arg7.length(), arg8.length());
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            if(arg7.charAt(v2) != arg8.charAt(v2)) {
                break;
            }

            ++v2;
            ++v1;
        }

        long v0_1 = this.al(0x8BA04EC0);
        int v3;
        for(v3 = v2; v3 < arg7.length(); ++v3) {
            this.ax.ap(-280610003, v0_1);
            this.ax.aj(0xB53FE1B1, v0_1);
        }

        while(v2 < arg8.length()) {
            this.ax.ad(arg8.charAt(v2), v0_1);
            ++v2;
        }
    }

    public void ai(String arg7, String arg8) {
        int v0 = Math.min(arg7.length(), arg8.length());
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            if(arg7.charAt(v2) != arg8.charAt(v2)) {
                break;
            }

            ++v2;
            ++v1;
        }

        long v0_1 = this.al(0x825AFCB5);
        int v3;
        for(v3 = v2; v3 < arg7.length(); ++v3) {
            this.ax.ap(85, v0_1);
            this.ax.aj(85, v0_1);
        }

        while(v2 < arg8.length()) {
            this.ax.ad(arg8.charAt(v2), v0_1);
            ++v2;
        }
    }

    public void aj(String arg6, String arg7, int arg8) {
        try {
            arg8 = Math.min(arg6.length(), arg7.length());
            int v0 = 0;
            int v1 = 0;
            while(v0 < arg8) {
                if(arg6.charAt(v1) != arg7.charAt(v1)) {
                    break;
                }

                ++v1;
                ++v0;
            }

            long v2 = this.al(0x8EB00FAB);
            for(arg8 = v1; arg8 < arg6.length(); ++arg8) {
                this.ax.ap(85, v2);
                this.ax.aj(85, v2);
            }

            while(v1 < arg7.length()) {
                this.ax.ad(arg7.charAt(v1), v2);
                ++v1;
            }
        }
        catch(RuntimeException v6) {
            goto label_34;
        }

        return;
    label_34:
        StringBuilder v7 = new StringBuilder();
        v7.append("com/jagex/jagex3/client/input/softkeyboard/ax.aj(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    public void am(int arg4) {
        this.ax.aa(arg4, this.al(-2018371128));
    }

    public void aq(byte arg4) {
        int v4 = 0x8B004441;
        try {
            long v0 = this.al(v4);
            this.ax.ap(84, v0);
            this.ax.aj(84, v0);
            return;
        }
        catch(RuntimeException v4_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/jagex3/client/input/softkeyboard/ax.aq(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4_1), v0_1.toString());
        }
    }

    public void au(int arg4) {
        this.ax.aa(arg4, this.al(-2050283601));
    }

    public void av() {
        long v0 = this.al(-1991982061);
        this.ax.ap(84, v0);
        this.ax.aj(84, v0);
    }
}

