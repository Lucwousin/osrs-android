package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement$Event;
import java.io.IOException;
import java.util.Map;

public final class zzgh extends zzjs implements zzej {
    @VisibleForTesting private static int zzane = 0xFFFF;
    @VisibleForTesting private static int zzanf = 2;
    private final Map zzang;
    private final Map zzanh;
    private final Map zzani;
    private final Map zzanj;
    private final Map zzank;
    private final Map zzanl;

    static {
    }

    zzgh(zzjt arg1) {
        super(arg1);
        this.zzang = new ArrayMap();
        this.zzanh = new ArrayMap();
        this.zzani = new ArrayMap();
        this.zzanj = new ArrayMap();
        this.zzanl = new ArrayMap();
        this.zzank = new ArrayMap();
    }

    public final Context getContext() {
        return super.getContext();
    }

    @WorkerThread protected final boolean zza(String arg7, byte[] arg8, String arg9) {
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg7);
        zzkn v0 = this.zza(arg7, arg8);
        if(v0 == null) {
            return 0;
        }

        this.zza(arg7, v0);
        this.zzanj.put(arg7, v0);
        this.zzanl.put(arg7, arg9);
        this.zzang.put(arg7, zzgh.zza(v0));
        ((zzjr)this).zzjg().zza(arg7, v0.zzauq);
        zzkg[] v9 = null;
        try {
            v0.zzauq = v9;
            byte[] v9_2 = new byte[((zzacj)v0).zzwb()];
            ((zzacj)v0).zza(zzacb.zzb(v9_2, 0, v9_2.length));
            arg8 = v9_2;
        }
        catch(IOException v9_1) {
            ((zzhi)this).zzgi().zziy().zze("Unable to serialize reduced-size config. Storing full config instead. appId", zzfi.zzbp(arg7), v9_1);
        }

        zzek v9_3 = ((zzjr)this).zzjh();
        Preconditions.checkNotEmpty(arg7);
        ((zzhi)v9_3).zzab();
        ((zzjs)v9_3).zzch();
        ContentValues v0_1 = new ContentValues();
        v0_1.put("remote_config", arg8);
        try {
            if((((long)v9_3.getWritableDatabase().update("apps", v0_1, "app_id = ?", new String[]{arg7}))) != 0) {
                return 1;
            }

            ((zzhi)v9_3).zzgi().zziv().zzg("Failed to update remote config (got 0). appId", zzfi.zzbp(arg7));
        }
        catch(SQLiteException v0_2) {
            ((zzhi)v9_3).zzgi().zziv().zze("Error storing remote config. appId", zzfi.zzbp(arg7), v0_2);
        }

        return 1;
    }

    @WorkerThread private final zzkn zza(String arg5, byte[] arg6) {
        if(arg6 == null) {
            return new zzkn();
        }

        zzaca v6 = zzaca.zza(arg6, 0, arg6.length);
        zzkn v0 = new zzkn();
        try {
            ((zzacj)v0).zzb(v6);
            ((zzhi)this).zzgi().zzjc().zze("Parsed config. version, gmp_app_id", v0.zzaum, v0.zzafa);
            return v0;
        }
        catch(IOException v6_1) {
            ((zzhi)this).zzgi().zziy().zze("Unable to merge remote config. appId", zzfi.zzbp(arg5), v6_1);
            return new zzkn();
        }
    }

    private static Map zza(zzkn arg5) {
        ArrayMap v0 = new ArrayMap();
        if(arg5 != null && arg5.zzauo != null) {
            zzko[] v5 = arg5.zzauo;
            int v1 = v5.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                zzko v3 = v5[v2];
                if(v3 != null) {
                    ((Map)v0).put(v3.zzny, v3.value);
                }
            }
        }

        return ((Map)v0);
    }

    private final void zza(String arg10, zzkn arg11) {
        ArrayMap v0 = new ArrayMap();
        ArrayMap v1 = new ArrayMap();
        ArrayMap v2 = new ArrayMap();
        if(arg11 != null && arg11.zzaup != null) {
            zzkm[] v11 = arg11.zzaup;
            int v3 = v11.length;
            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                zzkm v5 = v11[v4];
                if(TextUtils.isEmpty(v5.name)) {
                    ((zzhi)this).zzgi().zziy().log("EventConfig contained null event name");
                }
                else {
                    String v6 = Event.zzal(v5.name);
                    if(!TextUtils.isEmpty(((CharSequence)v6))) {
                        v5.name = v6;
                    }

                    ((Map)v0).put(v5.name, v5.zzauj);
                    ((Map)v1).put(v5.name, v5.zzauk);
                    if(v5.zzaul == null) {
                        goto label_54;
                    }

                    if(v5.zzaul.intValue() >= zzgh.zzanf) {
                        if(v5.zzaul.intValue() > zzgh.zzane) {
                        }
                        else {
                            ((Map)v2).put(v5.name, v5.zzaul);
                            goto label_54;
                        }
                    }

                    ((zzhi)this).zzgi().zziy().zze("Invalid sampling rate. Event name, sample rate", v5.name, v5.zzaul);
                }

            label_54:
            }
        }

        this.zzanh.put(arg10, v0);
        this.zzani.put(arg10, v1);
        this.zzank.put(arg10, v2);
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    @WorkerThread private final void zzbw(String arg5) {
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg5);
        if(this.zzanj.get(arg5) == null) {
            byte[] v0 = ((zzjr)this).zzjh().zzbh(arg5);
            Object v1 = null;
            if(v0 == null) {
                this.zzang.put(arg5, v1);
                this.zzanh.put(arg5, v1);
                this.zzani.put(arg5, v1);
                this.zzanj.put(arg5, v1);
                this.zzanl.put(arg5, v1);
                this.zzank.put(arg5, v1);
                return;
            }
            else {
                zzkn v0_1 = this.zza(arg5, v0);
                this.zzang.put(arg5, zzgh.zza(v0_1));
                this.zza(arg5, v0_1);
                this.zzanj.put(arg5, v0_1);
                this.zzanl.put(arg5, v1);
            }
        }
    }

    @WorkerThread protected final zzkn zzbx(String arg2) {
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg2);
        this.zzbw(arg2);
        return this.zzanj.get(arg2);
    }

    @WorkerThread protected final String zzby(String arg2) {
        ((zzhi)this).zzab();
        return this.zzanl.get(arg2);
    }

    @WorkerThread protected final void zzbz(String arg3) {
        ((zzhi)this).zzab();
        this.zzanl.put(arg3, null);
    }

    @WorkerThread final void zzca(String arg2) {
        ((zzhi)this).zzab();
        this.zzanj.remove(arg2);
    }

    final boolean zzcb(String arg3) {
        return "1".equals(this.zze(arg3, "measurement.upload.blacklist_internal"));
    }

    final boolean zzcc(String arg3) {
        return "1".equals(this.zze(arg3, "measurement.upload.blacklist_public"));
    }

    @WorkerThread public final String zze(String arg2, String arg3) {
        ((zzhi)this).zzab();
        this.zzbw(arg2);
        Object v2 = this.zzang.get(arg2);
        if(v2 != null) {
            return ((Map)v2).get(arg3);
        }

        return null;
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        return 0;
    }

    public final zzjz zzjf() {
        return super.zzjf();
    }

    public final zzed zzjg() {
        return super.zzjg();
    }

    public final zzek zzjh() {
        return super.zzjh();
    }

    @WorkerThread final boolean zzn(String arg3, String arg4) {
        ((zzhi)this).zzab();
        this.zzbw(arg3);
        if((this.zzcb(arg3)) && (zzkd.zzcm(arg4))) {
            return 1;
        }

        if((this.zzcc(arg3)) && (zzkd.zzcg(arg4))) {
            return 1;
        }

        Object v3 = this.zzanh.get(arg3);
        if(v3 != null) {
            v3 = ((Map)v3).get(arg4);
            if(v3 == null) {
                return 0;
            }

            return ((Boolean)v3).booleanValue();
        }

        return 0;
    }

    @WorkerThread final boolean zzo(String arg2, String arg3) {
        ((zzhi)this).zzab();
        this.zzbw(arg2);
        if("ecommerce_purchase".equals(arg3)) {
            return 1;
        }

        Object v2 = this.zzani.get(arg2);
        if(v2 != null) {
            v2 = ((Map)v2).get(arg3);
            if(v2 == null) {
                return 0;
            }

            return ((Boolean)v2).booleanValue();
        }

        return 0;
    }

    @WorkerThread final int zzp(String arg2, String arg3) {
        ((zzhi)this).zzab();
        this.zzbw(arg2);
        Object v2 = this.zzank.get(arg2);
        if(v2 != null) {
            v2 = ((Map)v2).get(arg3);
            if(v2 == null) {
                return 1;
            }

            return ((Integer)v2).intValue();
        }

        return 1;
    }
}

