public class jg extends eo {
    jg(int arg3, int arg4) {
        try {
            super();
            this.ax = bd.an(0x66FDC661);
            this.ar = new eh(arg3, arg4);
            this.al = new ep(this.ar.ae, arg3, arg4);
            this.ae = new bd(this.ar);
            this.an = new bv(this.ae);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("jg.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

