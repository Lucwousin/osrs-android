package com.google.android.gms.internal.measurement;

public final class zzacf implements Cloneable {
    private int mSize;
    private static final zzacg zzbzh;
    private boolean zzbzi;
    private int[] zzbzj;
    private zzacg[] zzbzk;

    static {
        zzacf.zzbzh = new zzacg();
    }

    zzacf() {
        this(10);
    }

    private zzacf(int arg3) {
        super();
        this.zzbzi = false;
        arg3 = zzacf.idealIntArraySize(arg3);
        this.zzbzj = new int[arg3];
        this.zzbzk = new zzacg[arg3];
        this.mSize = 0;
    }

    public final Object clone() throws CloneNotSupportedException {
        int v0 = this.mSize;
        zzacf v1 = new zzacf(v0);
        int v4 = 0;
        System.arraycopy(this.zzbzj, 0, v1.zzbzj, 0, v0);
        while(v4 < v0) {
            if(this.zzbzk[v4] != null) {
                v1.zzbzk[v4] = this.zzbzk[v4].clone();
            }

            ++v4;
        }

        v1.mSize = v0;
        return v1;
    }

    public final boolean equals(Object arg9) {
        int v9_1;
        int v1_1;
        if((((zzacf)arg9)) == this) {
            return 1;
        }

        if(!(arg9 instanceof zzacf)) {
            return 0;
        }

        if(this.mSize != ((zzacf)arg9).mSize) {
            return 0;
        }

        int[] v1 = this.zzbzj;
        int[] v3 = ((zzacf)arg9).zzbzj;
        int v4 = this.mSize;
        int v5 = 0;
        while(true) {
            if(v5 >= v4) {
                break;
            }
            else if(v1[v5] != v3[v5]) {
                v1_1 = 0;
            }
            else {
                ++v5;
                continue;
            }

            goto label_24;
        }

        v1_1 = 1;
    label_24:
        if(v1_1 != 0) {
            zzacg[] v1_2 = this.zzbzk;
            zzacg[] v9 = ((zzacf)arg9).zzbzk;
            int v3_1 = this.mSize;
            v4 = 0;
            while(true) {
                if(v4 >= v3_1) {
                    break;
                }
                else if(!v1_2[v4].equals(v9[v4])) {
                    v9_1 = 0;
                }
                else {
                    ++v4;
                    continue;
                }

                goto label_39;
            }

            v9_1 = 1;
        label_39:
            if(v9_1 == 0) {
                return 0;
            }

            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        int v0 = 17;
        int v1;
        for(v1 = 0; v1 < this.mSize; ++v1) {
            v0 = (v0 * 0x1F + this.zzbzj[v1]) * 0x1F + this.zzbzk[v1].hashCode();
        }

        return v0;
    }

    private static int idealIntArraySize(int arg3) {
        arg3 <<= 2;
        int v0 = 4;
        int v1 = 4;
        while(v1 < 0x20) {
            int v2 = (1 << v1) - 12;
            if(arg3 <= v2) {
                arg3 = v2;
            }
            else {
                ++v1;
                continue;
            }

            break;
        }

        return arg3 / v0;
    }

    public final boolean isEmpty() {
        if(this.mSize == 0) {
            return 1;
        }

        return 0;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int arg7, zzacg arg8) {
        int v0 = this.zzav(arg7);
        if(v0 >= 0) {
            this.zzbzk[v0] = arg8;
            return;
        }

        v0 = ~v0;
        if(v0 < this.mSize && this.zzbzk[v0] == zzacf.zzbzh) {
            this.zzbzj[v0] = arg7;
            this.zzbzk[v0] = arg8;
            return;
        }

        if(this.mSize >= this.zzbzj.length) {
            int v1 = zzacf.idealIntArraySize(this.mSize + 1);
            int[] v2 = new int[v1];
            zzacg[] v1_1 = new zzacg[v1];
            System.arraycopy(this.zzbzj, 0, v2, 0, this.zzbzj.length);
            System.arraycopy(this.zzbzk, 0, v1_1, 0, this.zzbzk.length);
            this.zzbzj = v2;
            this.zzbzk = v1_1;
        }

        if(this.mSize - v0 != 0) {
            int v3 = v0 + 1;
            System.arraycopy(this.zzbzj, v0, this.zzbzj, v3, this.mSize - v0);
            System.arraycopy(this.zzbzk, v0, this.zzbzk, v3, this.mSize - v0);
        }

        this.zzbzj[v0] = arg7;
        this.zzbzk[v0] = arg8;
        ++this.mSize;
    }

    final zzacg zzat(int arg3) {
        arg3 = this.zzav(arg3);
        if(arg3 >= 0) {
            if(this.zzbzk[arg3] == zzacf.zzbzh) {
            }
            else {
                return this.zzbzk[arg3];
            }
        }

        return null;
    }

    final zzacg zzau(int arg2) {
        return this.zzbzk[arg2];
    }

    private final int zzav(int arg5) {
        int v2;
        int v0 = this.mSize - 1;
        int v1 = 0;
        while(true) {
            if(v1 > v0) {
                goto label_15;
            }

            v2 = v1 + v0 >>> 1;
            int v3 = this.zzbzj[v2];
            if(v3 < arg5) {
                v1 = v2 + 1;
                continue;
            }

            if(v3 <= arg5) {
                return v2;
            }

            v0 = v2 - 1;
        }

        return v2;
    label_15:
        return ~v1;
    }
}

