package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzabj implements Iterator {
    private int pos;
    private boolean zzbwn;
    private Iterator zzbwo;

    private zzabj(zzabd arg1) {
        this.zzbwm = arg1;
        super();
        this.pos = -1;
    }

    zzabj(zzabd arg1, zzabe arg2) {
        this(arg1);
    }

    public final boolean hasNext() {
        if(this.pos + 1 >= zzabd.zzb(this.zzbwm).size() && ((zzabd.zzc(this.zzbwm).isEmpty()) || !this.zzve().hasNext())) {
            return 0;
        }

        return 1;
    }

    public final Object next() {
        this.zzbwn = true;
        int v1 = this.pos + 1;
        this.pos = v1;
        Object v0 = v1 < zzabd.zzb(this.zzbwm).size() ? zzabd.zzb(this.zzbwm).get(this.pos) : this.zzve().next();
        return v0;
    }

    public final void remove() {
        if(this.zzbwn) {
            this.zzbwn = false;
            zzabd.zza(this.zzbwm);
            if(this.pos < zzabd.zzb(this.zzbwm).size()) {
                zzabd v0 = this.zzbwm;
                int v1 = this.pos;
                this.pos = v1 - 1;
                zzabd.zza(v0, v1);
                return;
            }

            this.zzve().remove();
            return;
        }

        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator zzve() {
        if(this.zzbwo == null) {
            this.zzbwo = zzabd.zzc(this.zzbwm).entrySet().iterator();
        }

        return this.zzbwo;
    }
}

