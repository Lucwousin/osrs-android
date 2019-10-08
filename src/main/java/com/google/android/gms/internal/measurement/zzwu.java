package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzwu {
    private final Uri uri;
    private static final ConcurrentHashMap zzbox;
    private final ContentResolver zzboy;
    private final ContentObserver zzboz;
    private final Object zzbpa;
    private volatile Map zzbpb;
    private final Object zzbpc;
    @GuardedBy(value="listenersLock") private final List zzbpd;
    private static final String[] zzbpe;

    static {
        zzwu.zzbox = new ConcurrentHashMap();
        zzwu.zzbpe = new String[]{"key", "value"};
    }

    private zzwu(ContentResolver arg2, Uri arg3) {
        super();
        this.zzbpa = new Object();
        this.zzbpc = new Object();
        this.zzbpd = new ArrayList();
        this.zzboy = arg2;
        this.uri = arg3;
        this.zzboz = new zzwv(this, null);
    }

    public static zzwu zza(ContentResolver arg3, Uri arg4) {
        Object v0 = zzwu.zzbox.get(arg4);
        if(v0 == null) {
            zzwu v0_1 = new zzwu(arg3, arg4);
            Object v3 = zzwu.zzbox.putIfAbsent(arg4, v0_1);
            if(v3 == null) {
                v0_1.zzboy.registerContentObserver(v0_1.uri, false, v0_1.zzboz);
            }
            else {
                v0 = v3;
            }
        }

        return ((zzwu)v0);
    }

    static void zza(zzwu arg0) {
        arg0.zzsk();
    }

    public final Map zzsh() {
        Map v0 = zzwx.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? this.zzsj() : this.zzbpb;
        if(v0 == null) {
            Object v1 = this.zzbpa;
            __monitor_enter(v1);
            try {
                v0 = this.zzbpb;
                if(v0 == null) {
                    v0 = this.zzsj();
                    this.zzbpb = v0;
                }

                __monitor_exit(v1);
                goto label_19;
            label_17:
                __monitor_exit(v1);
            }
            catch(Throwable v0_1) {
                goto label_17;
            }

            throw v0_1;
        }

    label_19:
        if(v0 != null) {
            return v0;
        }

        return Collections.emptyMap();
    }

    public final void zzsi() {
        Object v0 = this.zzbpa;
        __monitor_enter(v0);
        Map v1 = null;
        try {
            this.zzbpb = v1;
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_7;
        }

        throw v1_1;
    }

    private final Map zzsj() {
        Cursor v1;
        HashMap v0;
        try {
            v0 = new HashMap();
            v1 = this.zzboy.query(this.uri, zzwu.zzbpe, null, null, null);
            if(v1 != null) {
                goto label_10;
            }

            goto label_23;
        }
        catch(SQLiteException ) {
            goto label_24;
        }

        try {
            while(true) {
            label_10:
                if(v1.moveToNext()) {
                    ((Map)v0).put(v1.getString(0), v1.getString(1));
                    continue;
                }
                else {
                    goto label_18;
                }
            }
        }
        catch(Throwable v0_1) {
            try {
                v1.close();
                throw v0_1;
            label_18:
                v1.close();
            }
            catch(SQLiteException ) {
            label_24:
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                return null;
            }
        }

    label_23:
        return ((Map)v0);
    }

    private final void zzsk() {
        Object v0 = this.zzbpc;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = this.zzbpd.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().zzsl();
            }

            __monitor_exit(v0);
            return;
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_12;
        }

        throw v1;
    }
}

