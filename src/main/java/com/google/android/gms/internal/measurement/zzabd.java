package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzabd extends AbstractMap {
    private boolean zzbnw;
    private final int zzbwe;
    private List zzbwf;
    private Map zzbwg;
    private volatile zzabk zzbwh;
    private Map zzbwi;

    private zzabd(int arg1) {
        super();
        this.zzbwe = arg1;
        this.zzbwf = Collections.emptyList();
        this.zzbwg = Collections.emptyMap();
        this.zzbwi = Collections.emptyMap();
    }

    zzabd(int arg1, zzabe arg2) {
        this(arg1);
    }

    public void clear() {
        this.zzva();
        if(!this.zzbwf.isEmpty()) {
            this.zzbwf.clear();
        }

        if(!this.zzbwg.isEmpty()) {
            this.zzbwg.clear();
        }
    }

    public boolean containsKey(Object arg2) {
        if(this.zza(((Comparable)arg2)) < 0) {
            if(this.zzbwg.containsKey(arg2)) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public Set entrySet() {
        if(this.zzbwh == null) {
            this.zzbwh = new zzabk(this, null);
        }

        return this.zzbwh;
    }

    public boolean equals(Object arg8) {
        if(this == (((zzabd)arg8))) {
            return 1;
        }

        if(!(arg8 instanceof zzabd)) {
            return super.equals(arg8);
        }

        int v1 = this.size();
        if(v1 != ((zzabd)arg8).size()) {
            return 0;
        }

        int v2 = this.zzuy();
        if(v2 != ((zzabd)arg8).zzuy()) {
            return this.entrySet().equals(((zzabd)arg8).entrySet());
        }

        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            if(!this.zzah(v4).equals(((zzabd)arg8).zzah(v4))) {
                return 0;
            }
        }

        if(v2 != v1) {
            return this.zzbwg.equals(((zzabd)arg8).zzbwg);
        }

        return 1;
    }

    public Object get(Object arg2) {
        int v0 = this.zza(((Comparable)arg2));
        if(v0 >= 0) {
            return this.zzbwf.get(v0).getValue();
        }

        return this.zzbwg.get(arg2);
    }

    public int hashCode() {
        int v0 = this.zzuy();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 += this.zzbwf.get(v1).hashCode();
            ++v1;
        }

        if(this.zzbwg.size() > 0) {
            v2 += this.zzbwg.hashCode();
        }

        return v2;
    }

    public final boolean isImmutable() {
        return this.zzbnw;
    }

    public Object put(Object arg1, Object arg2) {
        return this.zza(((Comparable)arg1), arg2);
    }

    public Object remove(Object arg2) {
        this.zzva();
        int v0 = this.zza(((Comparable)arg2));
        if(v0 >= 0) {
            return this.zzai(v0);
        }

        if(this.zzbwg.isEmpty()) {
            return null;
        }

        return this.zzbwg.remove(arg2);
    }

    public int size() {
        return this.zzbwf.size() + this.zzbwg.size();
    }

    private final int zza(Comparable arg5) {
        int v2;
        int v1;
        int v0 = this.zzbwf.size() - 1;
        if(v0 >= 0) {
            v1 = arg5.compareTo(this.zzbwf.get(v0).getKey());
            if(v1 > 0) {
                return -(v0 + 2);
            }
            else if(v1 == 0) {
                return v0;
            }
        }

        for(v1 = 0; true; v1 = v2 + 1) {
        label_15:
            if(v1 > v0) {
                goto label_29;
            }

            v2 = (v1 + v0) / 2;
            int v3 = arg5.compareTo(this.zzbwf.get(v2).getKey());
            if(v3 < 0) {
                v0 = v2 - 1;
                goto label_15;
            }

            if(v3 <= 0) {
                return v2;
            }
        }

        return v2;
    label_29:
        return -(v1 + 1);
    }

    static Object zza(zzabd arg0, int arg1) {
        return arg0.zzai(arg1);
    }

    static void zza(zzabd arg0) {
        arg0.zzva();
    }

    public final Object zza(Comparable arg5, Object arg6) {
        this.zzva();
        int v0 = this.zza(arg5);
        if(v0 >= 0) {
            return this.zzbwf.get(v0).setValue(arg6);
        }

        this.zzva();
        if((this.zzbwf.isEmpty()) && !(this.zzbwf instanceof ArrayList)) {
            this.zzbwf = new ArrayList(this.zzbwe);
        }

        v0 = -(v0 + 1);
        if(v0 >= this.zzbwe) {
            return this.zzvb().put(arg5, arg6);
        }

        if(this.zzbwf.size() == this.zzbwe) {
            Object v1 = this.zzbwf.remove(this.zzbwe - 1);
            this.zzvb().put(((zzabi)v1).getKey(), ((zzabi)v1).getValue());
        }

        this.zzbwf.add(v0, new zzabi(this, arg5, arg6));
        return null;
    }

    static zzabd zzag(int arg1) {
        return new zzabe(arg1);
    }

    public final Map$Entry zzah(int arg2) {
        return this.zzbwf.get(arg2);
    }

    private final Object zzai(int arg5) {
        this.zzva();
        Object v5 = this.zzbwf.remove(arg5).getValue();
        if(!this.zzbwg.isEmpty()) {
            Iterator v0 = this.zzvb().entrySet().iterator();
            this.zzbwf.add(new zzabi(this, v0.next()));
            v0.remove();
        }

        return v5;
    }

    static List zzb(zzabd arg0) {
        return arg0.zzbwf;
    }

    static Map zzc(zzabd arg0) {
        return arg0.zzbwg;
    }

    public void zzru() {
        if(!this.zzbnw) {
            Map v0 = this.zzbwg.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwg);
            this.zzbwg = v0;
            v0 = this.zzbwi.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwi);
            this.zzbwi = v0;
            this.zzbnw = true;
        }
    }

    public final int zzuy() {
        return this.zzbwf.size();
    }

    public final Iterable zzuz() {
        if(this.zzbwg.isEmpty()) {
            return zzabf.zzvc();
        }

        return this.zzbwg.entrySet();
    }

    private final void zzva() {
        if(!this.zzbnw) {
            return;
        }

        throw new UnsupportedOperationException();
    }

    private final SortedMap zzvb() {
        this.zzva();
        if((this.zzbwg.isEmpty()) && !(this.zzbwg instanceof TreeMap)) {
            this.zzbwg = new TreeMap();
            this.zzbwi = this.zzbwg.descendingMap();
        }

        return this.zzbwg;
    }
}

