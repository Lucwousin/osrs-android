package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class zzjt implements zzhk {
    final class zza implements zzem {
        zzku zzasp;
        List zzasq;
        List zzasr;
        private long zzass;

        zza(zzjt arg1, zzju arg2) {
            this(arg1);
        }

        private zza(zzjt arg1) {
            this.zzasn = arg1;
            super();
        }

        private static long zza(zzkr arg4) {
            return arg4.zzavb.longValue() / 1000 / 60 / 60;
        }

        public final boolean zza(long arg7, zzkr arg9) {
            Preconditions.checkNotNull(arg9);
            if(this.zzasr == null) {
                this.zzasr = new ArrayList();
            }

            if(this.zzasq == null) {
                this.zzasq = new ArrayList();
            }

            if(this.zzasr.size() > 0 && zza.zza(this.zzasr.get(0)) != zza.zza(arg9)) {
                return 0;
            }

            long v2 = this.zzass + (((long)((zzacj)arg9).zzwb()));
            if(v2 >= (((long)Math.max(0, zzez.zzaim.get().intValue())))) {
                return 0;
            }

            this.zzass = v2;
            this.zzasr.add(arg9);
            this.zzasq.add(Long.valueOf(arg7));
            if(this.zzasr.size() >= Math.max(1, zzez.zzain.get().intValue())) {
                return 0;
            }

            return 1;
        }

        public final void zzb(zzku arg1) {
            Preconditions.checkNotNull(arg1);
            this.zzasp = arg1;
        }
    }

    private final zzgn zzacv;
    private static volatile zzjt zzarr;
    private zzgh zzars;
    private zzfm zzart;
    private zzek zzaru;
    private zzfr zzarv;
    private zzjp zzarw;
    private zzed zzarx;
    private final zzjz zzary;
    private boolean zzarz;
    @VisibleForTesting private long zzasa;
    private List zzasb;
    private int zzasc;
    private int zzasd;
    private boolean zzase;
    private boolean zzasf;
    private boolean zzasg;
    private FileLock zzash;
    private FileChannel zzasi;
    private List zzasj;
    private List zzask;
    private long zzasl;
    private boolean zzvn;

    private zzjt(zzjy arg2) {
        this(arg2, null);
    }

    private zzjt(zzjy arg3, zzgn arg4) {
        super();
        this.zzvn = false;
        Preconditions.checkNotNull(arg3);
        this.zzacv = zzgn.zza(arg3.zzqx, null, null);
        this.zzasl = -1;
        zzjz v4 = new zzjz(this);
        ((zzjs)v4).zzm();
        this.zzary = v4;
        zzfm v4_1 = new zzfm(this);
        ((zzjs)v4_1).zzm();
        this.zzart = v4_1;
        zzgh v4_2 = new zzgh(this);
        ((zzjs)v4_2).zzm();
        this.zzars = v4_2;
        this.zzacv.zzgh().zzc(new zzju(this, arg3));
    }

    public final Context getContext() {
        return this.zzacv.getContext();
    }

    @WorkerThread protected final void start() {
        this.zzacv.zzgh().zzab();
        this.zzjh().zzhx();
        if(this.zzacv.zzgj().zzalt.get() == 0) {
            this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
        }

        this.zzlg();
    }

    @WorkerThread public final byte[] zza(@NonNull zzex arg33, @Size(min=1) String arg34) {
        long v9;
        zzkt v31;
        zzea v30;
        zzku v29;
        byte[] v19;
        Bundle v18;
        zzkc v5_1;
        Object v6;
        String v5;
        zzfk v4;
        byte[] v0_2;
        zzea v13;
        zzjt v1 = this;
        zzex v0 = arg33;
        String v15 = arg34;
        this.zzlc();
        this.zzab();
        v1.zzacv.zzfu();
        Preconditions.checkNotNull(arg33);
        Preconditions.checkNotEmpty(arg34);
        zzkt v14 = new zzkt();
        this.zzjh().beginTransaction();
        try {
            v13 = this.zzjh().zzbf(v15);
            if(v13 == null) {
                v1.zzacv.zzgi().zzjb().zzg("Log and bundle not available. package_name", v15);
            }
            else if(!v13.isMeasurementEnabled()) {
                v1.zzacv.zzgi().zzjb().zzg("Log and bundle disabled. package_name", v15);
            }
            else {
                goto label_34;
            }

            v0_2 = new byte[0];
        }
        catch(Throwable v0_1) {
            goto label_491;
        }

        this.zzjh().endTransaction();
        return v0_2;
        try {
        label_34:
            if((("_iap".equals(v0.name)) || ("ecommerce_purchase".equals(v0.name))) && !v1.zza(v15, v0)) {
                v1.zzacv.zzgi().zziy().zzg("Failed to handle purchase event at single event bundle creation. appId", zzfi.zzbp(arg34));
            }

            boolean v2 = v1.zzacv.zzgk().zzaw(v15);
            long v16 = 0;
            Long v3 = Long.valueOf(v16);
            if((v2) && ("_e".equals(v0.name))) {
                if(v0.zzahg == null || v0.zzahg.size() == 0) {
                    v4 = v1.zzacv.zzgi().zziy();
                    v5 = "The engagement event does not contain any parameters. appId";
                    v6 = zzfi.zzbp(arg34);
                }
                else if(v0.zzahg.getLong("_et") == null) {
                    v4 = v1.zzacv.zzgi().zziy();
                    v5 = "The engagement event does not include duration. appId";
                    v6 = zzfi.zzbp(arg34);
                }
                else {
                    v3 = v0.zzahg.getLong("_et");
                    goto label_87;
                }

                v4.zzg(v5, v6);
            }

        label_87:
            zzku v12 = new zzku();
            v14.zzavf = new zzku[]{v12};
            v12.zzavh = Integer.valueOf(1);
            v12.zzavp = "android";
            v12.zzth = v13.zzah();
            v12.zzafh = v13.zzgv();
            v12.zztg = v13.zzag();
            long v4_1 = v13.zzgu();
            String v10 = null;
            Integer v4_2 = v4_1 == -2147483648 ? ((Integer)v10) : Integer.valueOf(((int)v4_1));
            v12.zzawb = v4_2;
            v12.zzavt = Long.valueOf(v13.zzgw());
            v12.zzafa = v13.getGmpAppId();
            v12.zzavx = Long.valueOf(v13.zzgx());
            if((v1.zzacv.isEnabled()) && (zzeh.zzht()) && (v1.zzacv.zzgk().zzau(v12.zzth))) {
                v12.zzawh = v10;
            }

            Pair v4_3 = v1.zzacv.zzgj().zzbr(v13.zzah());
            if((v13.zzhl()) && v4_3 != null && !TextUtils.isEmpty(v4_3.first)) {
                v12.zzavv = v4_3.first;
                v12.zzavw = v4_3.second;
            }

            v1.zzacv.zzge().zzch();
            v12.zzavr = Build.MODEL;
            v1.zzacv.zzge().zzch();
            v12.zzavq = Build$VERSION.RELEASE;
            v12.zzavs = Integer.valueOf(((int)v1.zzacv.zzge().zzik()));
            v12.zzahd = v1.zzacv.zzge().zzil();
            v12.zzaez = v13.getAppInstanceId();
            v12.zzafc = v13.zzgr();
            List v4_4 = this.zzjh().zzbe(v13.zzah());
            v12.zzavj = new zzkx[v4_4.size()];
            if(v2) {
                v5_1 = this.zzjh().zzh(v12.zzth, "_lte");
                if(v5_1 != null) {
                    if(v5_1.value == null) {
                    }
                    else {
                        if(v3.longValue() > v16) {
                            v5_1 = new zzkc(v12.zzth, "auto", "_lte", v1.zzacv.zzbt().currentTimeMillis(), Long.valueOf(v5_1.value.longValue() + v3.longValue()));
                        }
                        else {
                        }

                        goto label_219;
                    }
                }

                v5_1 = new zzkc(v12.zzth, "auto", "_lte", v1.zzacv.zzbt().currentTimeMillis(), v3);
            }
            else {
                v5_1 = ((zzkc)v10);
            }

        label_219:
            zzkx v7 = ((zzkx)v10);
            int v6_1;
            for(v6_1 = 0; v6_1 < v4_4.size(); ++v6_1) {
                zzkx v8 = new zzkx();
                v12.zzavj[v6_1] = v8;
                v8.name = v4_4.get(v6_1).name;
                v8.zzaws = Long.valueOf(v4_4.get(v6_1).zzast);
                this.zzjf().zza(v8, v4_4.get(v6_1).value);
                if((v2) && ("_lte".equals(v8.name))) {
                    v8.zzave = v5_1.value;
                    v8.zzaws = Long.valueOf(v1.zzacv.zzbt().currentTimeMillis());
                    v7 = v8;
                }
            }

            if(!v2 || v7 != null) {
            }
            else {
                zzkx v2_1 = new zzkx();
                v2_1.name = "_lte";
                v2_1.zzaws = Long.valueOf(v1.zzacv.zzbt().currentTimeMillis());
                v2_1.zzave = v5_1.value;
                v12.zzavj = Arrays.copyOf(v12.zzavj, v12.zzavj.length + 1);
                v12.zzavj[v12.zzavj.length - 1] = v2_1;
            }

            if(v3.longValue() > v16) {
                this.zzjh().zza(v5_1);
            }

            Bundle v10_1 = v0.zzahg.zzin();
            long v3_1 = 1;
            if("_iap".equals(v0.name)) {
                v10_1.putLong("_c", v3_1);
                v1.zzacv.zzgi().zzjb().log("Marking in-app purchase as real-time");
                v10_1.putLong("_r", v3_1);
            }

            v10_1.putString("_o", v0.origin);
            if(v1.zzacv.zzgg().zzcn(v12.zzth)) {
                v1.zzacv.zzgg().zza(v10_1, "_dbg", Long.valueOf(v3_1));
                v1.zzacv.zzgg().zza(v10_1, "_r", Long.valueOf(v3_1));
            }

            zzet v2_2 = this.zzjh().zzf(v15, v0.name);
            if(v2_2 == null) {
                v18 = v10_1;
                v19 = null;
                v29 = v12;
                v30 = v13;
                v31 = v14;
                this.zzjh().zza(new zzet(arg34, v0.name, 1, 0, v0.zzahr, 0, null, null, null));
                v9 = v16;
            }
            else {
                v18 = v10_1;
                v29 = v12;
                v30 = v13;
                v31 = v14;
                v19 = null;
                v3_1 = v2_2.zzahj;
                this.zzjh().zza(v2_2.zzah(v0.zzahr).zzim());
                v9 = v3_1;
            }

            zzes v12_1 = new zzes(v1.zzacv, v0.origin, arg34, v0.name, v0.zzahr, v9, v18);
            zzkr v0_3 = new zzkr();
            zzku v4_5 = v29;
            v4_5.zzavi = new zzkr[]{v0_3};
            v0_3.zzavb = Long.valueOf(v12_1.timestamp);
            v0_3.name = v12_1.name;
            v0_3.zzavc = Long.valueOf(v12_1.zzahf);
            v0_3.zzava = new zzks[v12_1.zzahg.size()];
            Iterator v2_3 = v12_1.zzahg.iterator();
            int v5_2;
            for(v5_2 = 0; v2_3.hasNext(); ++v5_2) {
                v6 = v2_3.next();
                zzks v7_1 = new zzks();
                v0_3.zzava[v5_2] = v7_1;
                v7_1.name = ((String)v6);
                this.zzjf().zza(v7_1, v12_1.zzahg.get(((String)v6)));
            }

            v4_5.zzawa = v1.zza(v30.zzah(), v4_5.zzavj, v4_5.zzavi);
            v4_5.zzavl = v0_3.zzavb;
            v4_5.zzavm = v0_3.zzavb;
            long v5_3 = v30.zzgt();
            Long v10_2 = v5_3 != v16 ? Long.valueOf(v5_3) : ((Long)v19);
            v4_5.zzavo = v10_2;
            long v7_2 = v30.zzgs();
            if(v7_2 == v16) {
            }
            else {
                v5_3 = v7_2;
            }

            v10_2 = v5_3 != v16 ? Long.valueOf(v5_3) : ((Long)v19);
            v4_5.zzavn = v10_2;
            v30.zzhb();
            v4_5.zzavy = Integer.valueOf(((int)v30.zzgy()));
            v4_5.zzavu = Long.valueOf(v1.zzacv.zzgk().zzgw());
            v4_5.zzavk = Long.valueOf(v1.zzacv.zzbt().currentTimeMillis());
            v4_5.zzavz = Boolean.TRUE;
            v30.zzr(v4_5.zzavl.longValue());
            v30.zzs(v4_5.zzavm.longValue());
            this.zzjh().zza(v30);
            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v0_1) {
            goto label_491;
        }

        this.zzjh().endTransaction();
        try {
            v0_2 = new byte[((zzacj)v31).zzwb()];
            zzacb v2_4 = zzacb.zzb(v0_2, 0, v0_2.length);
            v31.zza(v2_4);
            v2_4.zzvt();
            return this.zzjf().zzb(v0_2);
        }
        catch(IOException v0_4) {
            v1.zzacv.zzgi().zziv().zze("Data loss. Failed to bundle and serialize. appId", zzfi.zzbp(arg34), v0_4);
            return v19;
        }

    label_491:
        this.zzjh().endTransaction();
        throw v0_1;
    }

    static void zza(zzjt arg0, zzjy arg1) {
        arg0.zza(arg1);
    }

    static zzea zza(zzjt arg0, zzeb arg1) {
        return arg0.zzg(arg1);
    }

    @WorkerThread @VisibleForTesting private final int zza(FileChannel arg6) {
        int v6_1;
        this.zzab();
        if(arg6 != null) {
            if(!arg6.isOpen()) {
            }
            else {
                int v1 = 4;
                ByteBuffer v2 = ByteBuffer.allocate(v1);
                long v3 = 0;
                try {
                    arg6.position(v3);
                    v6_1 = arg6.read(v2);
                    if(v6_1 != v1) {
                        if(v6_1 != -1) {
                            this.zzacv.zzgi().zziy().zzg("Unexpected data length. Bytes read", Integer.valueOf(v6_1));
                        }

                        return 0;
                    }
                    else {
                        v2.flip();
                        return v2.getInt();
                    }

                    goto label_32;
                }
                catch(IOException v6) {
                    this.zzacv.zzgi().zziv().zzg("Failed to read from channel", v6);
                    v6_1 = 0;
                }

                return v6_1;
            }
        }

    label_32:
        this.zzacv.zzgi().zziv().log("Bad channel to read from");
        return 0;
    }

    private final zzeb zza(Context arg26, String arg27, String arg28, boolean arg29, boolean arg30, boolean arg31, long arg32) {
        int v3_2;
        String v1;
        zzjt v0 = this;
        String v2 = arg27;
        String v3 = "Unknown";
        String v4 = "Unknown";
        PackageManager v5 = arg26.getPackageManager();
        zzeb v6 = null;
        if(v5 == null) {
            v0.zzacv.zzgi().zziv().log("PackageManager is null, can not log app install information");
            return v6;
        }

        try {
            v1 = v5.getInstallerPackageName(v2);
        }
        catch(IllegalArgumentException ) {
            v0.zzacv.zzgi().zziv().zzg("Error retrieving installer package name. appId", zzfi.zzbp(arg27));
        }

        if(v1 == null) {
            v1 = "manual_install";
        }
        else if("com.android.vending".equals(v1)) {
            v1 = "";
        }

        String v7 = v1;
        try {
            PackageInfo v1_1 = Wrappers.packageManager(arg26).getPackageInfo(v2, 0);
            if(v1_1 != null) {
                CharSequence v3_1 = Wrappers.packageManager(arg26).getApplicationLabel(v2);
                if(!TextUtils.isEmpty(v3_1)) {
                    v4 = v3_1.toString();
                }

                v4 = v1_1.versionName;
                v3_2 = v1_1.versionCode;
            }
            else {
                goto label_47;
            }

            goto label_50;
        }
        catch(PackageManager$NameNotFoundException ) {
            v0.zzacv.zzgi().zziv().zze("Error retrieving newly installed package info. appId, appName", zzfi.zzbp(arg27), v4);
            return v6;
        }

    label_47:
        v4 = v3;
        v3_2 = 0x80000000;
    label_50:
        long v16 = 0;
        v0.zzacv.zzgl();
        long v5_1 = 0;
        long v18 = v0.zzacv.zzgk().zzbd(v2) ? arg32 : v5_1;
        return new zzeb(arg27, arg28, v4, ((long)v3_2), v7, v0.zzacv.zzgk().zzgw(), v0.zzacv.zzgg().zzd(arg26, v2), null, arg29, false, "", v16, v18, 0, arg30, arg31, false);
    }

    private static void zza(zzjs arg3) {
        if(arg3 != null) {
            if(arg3.isInitialized()) {
                return;
            }

            String v3 = String.valueOf(arg3.getClass());
            StringBuilder v2 = new StringBuilder(String.valueOf(v3).length() + 27);
            v2.append("Component not initialized: ");
            v2.append(v3);
            throw new IllegalStateException(v2.toString());
        }

        throw new IllegalStateException("Upload Component not created");
    }

    @WorkerThread private final void zza(zzjy arg4) {
        this.zzacv.zzgh().zzab();
        zzek v4 = new zzek(this);
        ((zzjs)v4).zzm();
        this.zzaru = v4;
        this.zzacv.zzgk().zza(this.zzars);
        zzed v4_1 = new zzed(this);
        ((zzjs)v4_1).zzm();
        this.zzarx = v4_1;
        zzjp v4_2 = new zzjp(this);
        ((zzjs)v4_2).zzm();
        this.zzarw = v4_2;
        this.zzarv = new zzfr(this);
        if(this.zzasc != this.zzasd) {
            this.zzacv.zzgi().zziv().zze("Not all upload components initialized", Integer.valueOf(this.zzasc), Integer.valueOf(this.zzasd));
        }

        this.zzvn = true;
    }

    @WorkerThread @VisibleForTesting private final boolean zza(int arg6, FileChannel arg7) {
        this.zzab();
        if(arg7 != null) {
            if(!arg7.isOpen()) {
            }
            else {
                ByteBuffer v1 = ByteBuffer.allocate(4);
                v1.putInt(arg6);
                v1.flip();
                long v2 = 0;
                try {
                    arg7.truncate(v2);
                    arg7.write(v1);
                    arg7.force(true);
                    if(arg7.size() != 4) {
                        this.zzacv.zzgi().zziv().zzg("Error writing to channel. Bytes written", Long.valueOf(arg7.size()));
                    }
                }
                catch(IOException v6) {
                    this.zzacv.zzgi().zziv().zzg("Failed to write to channel", v6);
                    return 0;
                }

                return 1;
            }
        }

        this.zzacv.zzgi().zziv().log("Bad channel to read from");
        return 0;
    }

    private final boolean zza(String arg14, zzex arg15) {
        long v3_1;
        String v0 = arg15.zzahg.getString("currency");
        if("ecommerce_purchase".equals(arg15.name)) {
            double v5 = 1000000;
            double v3 = arg15.zzahg.zzbk("value").doubleValue() * v5;
            if(v3 == 0) {
                v3 = (((double)arg15.zzahg.getLong("value").longValue())) * v5;
            }

            if(v3 <= 9223372036854776000 && v3 >= -9223372036854776000) {
                v3_1 = Math.round(v3);
                goto label_40;
            }

            this.zzacv.zzgi().zziy().zze("Data lost. Currency value is too big. appId", zzfi.zzbp(arg14), Double.valueOf(v3));
            return 0;
        }
        else {
            v3_1 = arg15.zzahg.getLong("value").longValue();
        }

    label_40:
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            v0 = v0.toUpperCase(Locale.US);
            if(!v0.matches("[A-Z]{3}")) {
                return 1;
            }

            String v1 = String.valueOf("_ltv_");
            v0 = String.valueOf(v0);
            v0 = v0.length() != 0 ? v1.concat(v0) : new String(v1);
            String v9 = v0;
            zzkc v0_1 = this.zzjh().zzh(arg14, v9);
            if(v0_1 != null) {
                if(!(v0_1.value instanceof Long)) {
                }
                else {
                    v0_1 = new zzkc(arg14, arg15.origin, v9, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(v0_1.value.longValue() + v3_1));
                    goto label_117;
                }
            }

            zzek v0_2 = this.zzjh();
            int v1_1 = this.zzacv.zzgk().zzb(arg14, zzez.zzaji) - 1;
            Preconditions.checkNotEmpty(arg14);
            ((zzhi)v0_2).zzab();
            ((zzjs)v0_2).zzch();
            try {
                v0_2.getWritableDatabase().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);", new String[]{arg14, arg14, String.valueOf(v1_1)});
            }
            catch(SQLiteException v1_2) {
                ((zzhi)v0_2).zzgi().zziv().zze("Error pruning currencies. appId", zzfi.zzbp(arg14), v1_2);
            }

            v0_1 = new zzkc(arg14, arg15.origin, v9, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(v3_1));
        label_117:
            if(this.zzjh().zza(v0_1)) {
                return 1;
            }

            this.zzacv.zzgi().zziv().zzd("Too many unique user properties are set. Ignoring user property. appId", zzfi.zzbp(arg14), this.zzacv.zzgf().zzbo(v0_1.name), v0_1.value);
            this.zzacv.zzgg().zza(arg14, 9, null, null, 0);
        }

        return 1;
    }

    private final zzkp[] zza(String arg2, zzkx[] arg3, zzkr[] arg4) {
        Preconditions.checkNotEmpty(arg2);
        return this.zzjg().zza(arg2, arg4, arg3);
    }

    @WorkerThread @VisibleForTesting final void zza(int arg10, Throwable arg11, byte[] arg12, String arg13) {
        zzek v12_1;
        long v5;
        int v4;
        List v2;
        List v1;
        this.zzab();
        this.zzlc();
        if(arg12 == null) {
            try {
                arg12 = new byte[0];
            label_8:
                v1 = this.zzasj;
                v2 = null;
                this.zzasj = v2;
                v4 = 1;
                if(arg10 != 200) {
                    goto label_14;
                }
                else {
                    goto label_16;
                }
            }
            catch(Throwable v10) {
                goto label_7;
            }
        }

        goto label_8;
    label_14:
        if(arg10 == 204) {
        label_16:
            if(arg11 == null) {
                try {
                    this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
                    v5 = 0;
                    this.zzacv.zzgj().zzalu.set(v5);
                    this.zzlg();
                    this.zzacv.zzgi().zzjc().zze("Successful upload. Got network response. code, size", Integer.valueOf(arg10), Integer.valueOf(arg12.length));
                    this.zzjh().beginTransaction();
                }
                catch(SQLiteException v10_1) {
                    goto label_97;
                }
                catch(Throwable v10) {
                    goto label_7;
                }

                try {
                    Iterator v10_2 = v1.iterator();
                    while(true) {
                        if(v10_2.hasNext()) {
                            Object v11 = v10_2.next();
                            try {
                                v12_1 = this.zzjh();
                                long v7 = ((Long)v11).longValue();
                                ((zzhi)v12_1).zzab();
                                ((zzjs)v12_1).zzch();
                                SQLiteDatabase v13 = v12_1.getWritableDatabase();
                                String[] v1_1 = new String[]{String.valueOf(v7)};
                            }
                            catch(SQLiteException v12) {
                                goto label_68;
                            }

                            try {
                                if(v13.delete("queue", "rowid=?", v1_1) == 1) {
                                    continue;
                                }
                                else {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }

                                goto label_114;
                            }
                            catch(SQLiteException v13_1) {
                                try {
                                    ((zzhi)v12_1).zzgi().zziv().zzg("Failed to delete a bundle in a queue table", v13_1);
                                    throw v13_1;
                                }
                                catch(Throwable v10) {
                                }
                                catch(SQLiteException v12) {
                                    try {
                                    label_68:
                                        if(this.zzask != null && (this.zzask.contains(v11))) {
                                            continue;
                                        }

                                        throw v12;
                                    label_75:
                                        this.zzjh().setTransactionSuccessful();
                                    }
                                    catch(Throwable v10) {
                                        goto label_94;
                                    }

                                    try {
                                        this.zzjh().endTransaction();
                                        this.zzask = v2;
                                        if(!this.zzkz().zzex() || !this.zzlf()) {
                                            this.zzasl = -1;
                                            this.zzlg();
                                        }
                                        else {
                                            this.zzle();
                                        }

                                        this.zzasa = v5;
                                        goto label_148;
                                    label_94:
                                        this.zzjh().endTransaction();
                                        throw v10;
                                    }
                                    catch(Throwable v10) {
                                    label_151:
                                        this.zzasf = false;
                                        this.zzlh();
                                        throw v10;
                                    }
                                    catch(SQLiteException v10_1) {
                                        try {
                                        label_97:
                                            this.zzacv.zzgi().zziv().zzg("Database error while trying to delete uploaded bundles", v10_1);
                                            this.zzasa = this.zzacv.zzbt().elapsedRealtime();
                                            this.zzacv.zzgi().zzjc().zzg("Disable upload, time", Long.valueOf(this.zzasa));
                                            goto label_148;
                                        label_114:
                                            this.zzacv.zzgi().zzjc().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(arg10), arg11);
                                            this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
                                            if(arg10 != 503) {
                                                if(arg10 == 429) {
                                                }
                                                else {
                                                    v4 = 0;
                                                }
                                            }

                                            if(v4 != 0) {
                                                this.zzacv.zzgj().zzalv.set(this.zzacv.zzbt().currentTimeMillis());
                                            }

                                            if(this.zzacv.zzgk().zzay(arg13)) {
                                                this.zzjh().zzc(v1);
                                            }

                                            this.zzlg();
                                            goto label_148;
                                        label_7:
                                            goto label_151;
                                        }
                                        catch(Throwable v10) {
                                            goto label_7;
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            goto label_75;
                        }

                        goto label_114;
                    }
                }
                catch(Throwable v10) {
                    goto label_94;
                }
            }
        }

        goto label_114;
    label_148:
        this.zzasf = false;
        this.zzlh();
    }

    @WorkerThread private final void zzab() {
        this.zzacv.zzgh().zzab();
    }

    @WorkerThread final void zzb(zzef arg11, zzeb arg12) {
        Object v0_1;
        String v1_2;
        String v12;
        zzfk v11_2;
        Object v5;
        String v4;
        String v3;
        String v2;
        zzfk v1_1;
        Preconditions.checkNotNull(arg11);
        Preconditions.checkNotEmpty(arg11.packageName);
        Preconditions.checkNotNull(arg11.origin);
        Preconditions.checkNotNull(arg11.zzage);
        Preconditions.checkNotEmpty(arg11.zzage.name);
        this.zzab();
        this.zzlc();
        if(TextUtils.isEmpty(arg12.zzafa)) {
            return;
        }

        if(!arg12.zzafk) {
            this.zzg(arg12);
            return;
        }

        zzef v0 = new zzef(arg11);
        int v11 = 0;
        v0.active = false;
        this.zzjh().beginTransaction();
        try {
            zzef v1 = this.zzjh().zzi(v0.packageName, v0.zzage.name);
            if(v1 != null && !v1.origin.equals(v0.origin)) {
                this.zzacv.zzgi().zziy().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzacv.zzgf().zzbo(v0.zzage.name), v0.origin, v1.origin);
            }

            if(v1 != null && (v1.active)) {
                v0.origin = v1.origin;
                v0.creationTimestamp = v1.creationTimestamp;
                v0.triggerTimeout = v1.triggerTimeout;
                v0.triggerEventName = v1.triggerEventName;
                v0.zzagg = v1.zzagg;
                v0.active = v1.active;
                v0.zzage = new zzka(v0.zzage.name, v1.zzage.zzast, v0.zzage.getValue(), v1.zzage.origin);
            }
            else if(TextUtils.isEmpty(v0.triggerEventName)) {
                v0.zzage = new zzka(v0.zzage.name, v0.creationTimestamp, v0.zzage.getValue(), v0.zzage.origin);
                v0.active = true;
                v11 = 1;
            }

            if(v0.active) {
                zzkc v9 = new zzkc(v0.packageName, v0.origin, v0.zzage.name, v0.zzage.zzast, v0.zzage.getValue());
                if(this.zzjh().zza(v9)) {
                    v1_1 = this.zzacv.zzgi().zzjb();
                    v2 = "User property updated immediately";
                    v3 = v0.packageName;
                    v4 = this.zzacv.zzgf().zzbo(v9.name);
                    v5 = v9.value;
                }
                else {
                    v1_1 = this.zzacv.zzgi().zziv();
                    v2 = "(2)Too many active user properties, ignoring";
                    Object v3_1 = zzfi.zzbp(v0.packageName);
                    v4 = this.zzacv.zzgf().zzbo(v9.name);
                    v5 = v9.value;
                }

                v1_1.zzd(v2, v3, v4, v5);
                if(v11 == 0) {
                    goto label_142;
                }

                if(v0.zzagg == null) {
                    goto label_142;
                }

                this.zzc(new zzex(v0.zzagg, v0.creationTimestamp), arg12);
            }

        label_142:
            if(this.zzjh().zza(v0)) {
                v11_2 = this.zzacv.zzgi().zzjb();
                v12 = "Conditional property added";
                v1_2 = v0.packageName;
                v2 = this.zzacv.zzgf().zzbo(v0.zzage.name);
                v0_1 = v0.zzage.getValue();
            }
            else {
                v11_2 = this.zzacv.zzgi().zziv();
                v12 = "Too many conditional properties, ignoring";
                Object v1_3 = zzfi.zzbp(v0.packageName);
                v2 = this.zzacv.zzgf().zzbo(v0.zzage.name);
                v0_1 = v0.zzage.getValue();
            }

            v11_2.zzd(v12, v1_2, v2, v0_1);
            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v11_1) {
            this.zzjh().endTransaction();
            throw v11_1;
        }

        this.zzjh().endTransaction();
    }

    @WorkerThread final void zzb(zzex arg18, zzeb arg19) {
        String v7_1;
        String v5_1;
        zzfk v4_4;
        List v3_1;
        Object v8_1;
        Object v6;
        String[] v8;
        List v4_1;
        zzjt v1 = this;
        zzex v0 = arg18;
        zzeb v2 = arg19;
        Preconditions.checkNotNull(arg19);
        Preconditions.checkNotEmpty(v2.packageName);
        this.zzab();
        this.zzlc();
        String v3 = v2.packageName;
        long v11 = v0.zzahr;
        if(!this.zzjf().zzd(v0, v2)) {
            return;
        }

        if(!v2.zzafk) {
            v1.zzg(v2);
            return;
        }

        this.zzjh().beginTransaction();
        try {
            zzek v4 = this.zzjh();
            Preconditions.checkNotEmpty(v3);
            ((zzhi)v4).zzab();
            ((zzjs)v4).zzch();
            int v7 = 2;
            int v5 = Long.compare(v11, 0);
            if(v5 < 0) {
                ((zzhi)v4).zzgi().zziy().zze("Invalid time querying timed out conditional properties", zzfi.zzbp(v3), Long.valueOf(v11));
                v4_1 = Collections.emptyList();
            }
            else {
                v8 = new String[v7];
                v8[0] = v3;
                v8[1] = String.valueOf(v11);
                v4_1 = v4.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", v8);
            }

            Iterator v4_2 = v4_1.iterator();
            while(v4_2.hasNext()) {
                v6 = v4_2.next();
                if(v6 == null) {
                    continue;
                }

                v1.zzacv.zzgi().zzjb().zzd("User property timed out", ((zzef)v6).packageName, v1.zzacv.zzgf().zzbo(((zzef)v6).zzage.name), ((zzef)v6).zzage.getValue());
                if(((zzef)v6).zzagf != null) {
                    v1.zzc(new zzex(((zzef)v6).zzagf, v11), v2);
                }

                this.zzjh().zzj(v3, ((zzef)v6).zzage.name);
            }

            v4 = this.zzjh();
            Preconditions.checkNotEmpty(v3);
            ((zzhi)v4).zzab();
            ((zzjs)v4).zzch();
            if(v5 < 0) {
                ((zzhi)v4).zzgi().zziy().zze("Invalid time querying expired conditional properties", zzfi.zzbp(v3), Long.valueOf(v11));
                v4_1 = Collections.emptyList();
            }
            else {
                v8 = new String[v7];
                v8[0] = v3;
                v8[1] = String.valueOf(v11);
                v4_1 = v4.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", v8);
            }

            ArrayList v6_1 = new ArrayList(v4_1.size());
            v4_2 = v4_1.iterator();
            while(v4_2.hasNext()) {
                v8_1 = v4_2.next();
                if(v8_1 == null) {
                    continue;
                }

                v1.zzacv.zzgi().zzjb().zzd("User property expired", ((zzef)v8_1).packageName, v1.zzacv.zzgf().zzbo(((zzef)v8_1).zzage.name), ((zzef)v8_1).zzage.getValue());
                this.zzjh().zzg(v3, ((zzef)v8_1).zzage.name);
                if(((zzef)v8_1).zzagh != null) {
                    ((List)v6_1).add(((zzef)v8_1).zzagh);
                }

                this.zzjh().zzj(v3, ((zzef)v8_1).zzage.name);
            }

            int v4_3 = v6_1.size();
            v7 = 0;
            while(v7 < v4_3) {
                v8_1 = v6_1.get(v7);
                ++v7;
                v1.zzc(new zzex(((zzex)v8_1), v11), v2);
            }

            v4 = this.zzjh();
            String v6_2 = v0.name;
            Preconditions.checkNotEmpty(v3);
            Preconditions.checkNotEmpty(v6_2);
            ((zzhi)v4).zzab();
            ((zzjs)v4).zzch();
            if(v5 < 0) {
                ((zzhi)v4).zzgi().zziy().zzd("Invalid time querying triggered conditional properties", zzfi.zzbp(v3), ((zzhi)v4).zzgf().zzbm(v6_2), Long.valueOf(v11));
                v3_1 = Collections.emptyList();
            }
            else {
                v3_1 = v4.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{v3, v6_2, String.valueOf(v11)});
            }

            ArrayList v14 = new ArrayList(v3_1.size());
            Iterator v3_2 = v3_1.iterator();
            while(v3_2.hasNext()) {
                Object v15 = v3_2.next();
                if(v15 == null) {
                    continue;
                }

                zzkc v13 = new zzkc(((zzef)v15).packageName, ((zzef)v15).origin, ((zzef)v15).zzage.name, v11, ((zzef)v15).zzage.getValue());
                if(this.zzjh().zza(v13)) {
                    v4_4 = v1.zzacv.zzgi().zzjb();
                    v5_1 = "User property triggered";
                    v6_2 = ((zzef)v15).packageName;
                    v7_1 = v1.zzacv.zzgf().zzbo(v13.name);
                    v8_1 = v13.value;
                }
                else {
                    v4_4 = v1.zzacv.zzgi().zziv();
                    v5_1 = "Too many active user properties, ignoring";
                    v6 = zzfi.zzbp(((zzef)v15).packageName);
                    v7_1 = v1.zzacv.zzgf().zzbo(v13.name);
                    v8_1 = v13.value;
                }

                v4_4.zzd(v5_1, v6, v7_1, v8_1);
                if(((zzef)v15).zzagg != null) {
                    ((List)v14).add(((zzef)v15).zzagg);
                }

                ((zzef)v15).zzage = new zzka(v13);
                ((zzef)v15).active = true;
                this.zzjh().zza(((zzef)v15));
            }

            this.zzc(arg18, arg19);
            int v0_2 = v14.size();
            int v3_3 = 0;
            while(v3_3 < v0_2) {
                Object v4_5 = v14.get(v3_3);
                ++v3_3;
                v1.zzc(new zzex(((zzex)v4_5), v11), v2);
            }

            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v0_1) {
            goto label_244;
        }

        this.zzjh().endTransaction();
        return;
    label_244:
        this.zzjh().endTransaction();
        throw v0_1;
    }

    @WorkerThread final void zzb(zzka arg13, zzeb arg14) {
        int v11;
        this.zzab();
        this.zzlc();
        if(TextUtils.isEmpty(arg14.zzafa)) {
            return;
        }

        if(!arg14.zzafk) {
            this.zzg(arg14);
            return;
        }

        int v4 = this.zzacv.zzgg().zzcj(arg13.name);
        int v2 = 24;
        if(v4 != 0) {
            this.zzacv.zzgg();
            String v6 = zzkd.zza(arg13.name, v2, true);
            int v7 = arg13.name != null ? arg13.name.length() : 0;
            this.zzacv.zzgg().zza(arg14.packageName, v4, "_ev", v6, v7);
            return;
        }

        int v8 = this.zzacv.zzgg().zzi(arg13.name, arg13.getValue());
        if(v8 != 0) {
            this.zzacv.zzgg();
            String v10 = zzkd.zza(arg13.name, v2, true);
            Object v13 = arg13.getValue();
            if(v13 != null) {
                if(!(v13 instanceof String) && !(v13 instanceof CharSequence)) {
                    goto label_55;
                }

                v11 = String.valueOf(v13).length();
            }
            else {
            label_55:
                v11 = 0;
            }

            this.zzacv.zzgg().zza(arg14.packageName, v8, "_ev", v10, v11);
            return;
        }

        Object v0 = this.zzacv.zzgg().zzj(arg13.name, arg13.getValue());
        if(v0 == null) {
            return;
        }

        zzkc v1 = new zzkc(arg14.packageName, arg13.origin, arg13.name, arg13.zzast, v0);
        this.zzacv.zzgi().zzjb().zze("Setting user property", this.zzacv.zzgf().zzbo(v1.name), v0);
        this.zzjh().beginTransaction();
        try {
            this.zzg(arg14);
            boolean v13_2 = this.zzjh().zza(v1);
            this.zzjh().setTransactionSuccessful();
            if(v13_2) {
                this.zzacv.zzgi().zzjb().zze("User property set", this.zzacv.zzgf().zzbo(v1.name), v1.value);
            }
            else {
                this.zzacv.zzgi().zziv().zze("Too many unique user properties are set. Ignoring user property", this.zzacv.zzgf().zzbo(v1.name), v1.value);
                this.zzacv.zzgg().zza(arg14.packageName, 9, null, null, 0);
            }
        }
        catch(Throwable v13_1) {
            this.zzjh().endTransaction();
            throw v13_1;
        }

        this.zzjh().endTransaction();
    }

    @WorkerThread private final void zzb(zzea arg11) {
        Map v6_1;
        this.zzab();
        if(TextUtils.isEmpty(arg11.getGmpAppId())) {
            this.zzb(arg11.zzah(), 204, null, null, null);
            return;
        }

        zzeh v0 = this.zzacv.zzgk();
        String v1 = arg11.getGmpAppId();
        String v2 = arg11.getAppInstanceId();
        Uri$Builder v3 = new Uri$Builder();
        Uri$Builder v4 = v3.scheme(zzez.zzaii.get()).encodedAuthority(zzez.zzaij.get());
        String v5 = "config/app/";
        v1 = String.valueOf(v1);
        v1 = v1.length() != 0 ? v5.concat(v1) : new String(v5);
        v4.path(v1).appendQueryParameter("app_instance_id", v2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(v0.zzgw()));
        String v0_1 = v3.build().toString();
        try {
            URL v4_1 = new URL(v0_1);
            this.zzacv.zzgi().zzjc().zzg("Fetching remote configuration", arg11.zzah());
            zzkn v1_1 = this.zzky().zzbx(arg11.zzah());
            Map v2_1 = null;
            String v3_1 = this.zzky().zzby(arg11.zzah());
            if(v1_1 == null || (TextUtils.isEmpty(((CharSequence)v3_1)))) {
                v6_1 = v2_1;
            }
            else {
                ArrayMap v1_2 = new ArrayMap();
                ((Map)v1_2).put("If-Modified-Since", v3_1);
                ArrayMap v6 = v1_2;
            }

            this.zzase = true;
            zzfm v2_2 = this.zzkz();
            v3_1 = arg11.zzah();
            zzjw v7 = new zzjw(this);
            ((zzhi)v2_2).zzab();
            ((zzjs)v2_2).zzch();
            Preconditions.checkNotNull(v4_1);
            Preconditions.checkNotNull(v7);
            ((zzhi)v2_2).zzgh().zzd(new zzfq(v2_2, v3_1, v4_1, null, v6_1, ((zzfo)v7)));
            return;
        }
        catch(MalformedURLException ) {
            this.zzacv.zzgi().zziv().zze("Failed to parse config URL. Not fetching. appId", zzfi.zzbp(arg11.zzah()), v0_1);
            return;
        }
    }

    @WorkerThread @VisibleForTesting final void zzb(String arg7, int arg8, Throwable arg9, byte[] arg10, Map arg11) {
        zzek v7_1;
        int v2;
        zzea v1;
        this.zzab();
        this.zzlc();
        Preconditions.checkNotEmpty(arg7);
        if(arg10 == null) {
            try {
                arg10 = new byte[0];
            label_9:
                this.zzacv.zzgi().zzjc().zzg("onConfigFetched. Response size", Integer.valueOf(arg10.length));
                this.zzjh().beginTransaction();
                goto label_18;
            }
            catch(Throwable v7) {
                goto label_8;
            }
        }

        goto label_9;
        try {
        label_18:
            v1 = this.zzjh().zzbf(arg7);
            int v3 = 1;
            int v4 = 304;
            if(arg8 != 200 && arg8 != 204 && arg8 != v4) {
                goto label_30;
            }
            else if(arg9 == null) {
                v2 = 1;
            }
            else {
            label_30:
                v2 = 0;
            }

            if(v1 == null) {
                this.zzacv.zzgi().zziy().zzg("App does not exist in onConfigFetched. appId", zzfi.zzbp(arg7));
                goto label_138;
            }
            else {
                int v5 = 404;
                if(v2 != 0 || arg8 == v5) {
                    byte[] v9 = null;
                    Object v11 = arg11 != null ? arg11.get("Last-Modified") : v9;
                    if(v11 == null || ((List)v11).size() <= 0) {
                        String v11_1 = ((String)v9);
                    }
                    else {
                        v11 = ((List)v11).get(0);
                    }

                    if(arg8 == v5) {
                        goto label_103;
                    }
                    else if(arg8 == v4) {
                        goto label_103;
                    }
                    else if(!this.zzky().zza(arg7, arg10, ((String)v11))) {
                        goto label_98;
                    }

                    goto label_111;
                }
                else {
                    v1.zzy(this.zzacv.zzbt().currentTimeMillis());
                    this.zzjh().zza(v1);
                    this.zzacv.zzgi().zzjc().zze("Fetching config failed. code, error", Integer.valueOf(arg8), arg9);
                    this.zzky().zzbz(arg7);
                    this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
                    if(arg8 != 503) {
                        if(arg8 == 429) {
                        }
                        else {
                            v3 = 0;
                        }
                    }

                    if(v3 == 0) {
                        goto label_78;
                    }

                    this.zzacv.zzgj().zzalv.set(this.zzacv.zzbt().currentTimeMillis());
                }

                goto label_78;
            }
        }
        catch(Throwable v7) {
            goto label_144;
        }

        try {
        label_98:
            v7_1 = this.zzjh();
            goto label_99;
        }
        catch(Throwable v7) {
            goto label_8;
        }

        try {
        label_103:
            if(this.zzky().zzbx(arg7) == null && !this.zzky().zza(arg7, v9, ((String)v9))) {
                goto label_109;
            }

            goto label_111;
        }
        catch(Throwable v7) {
            goto label_144;
        }

        try {
        label_109:
            v7_1 = this.zzjh();
            goto label_99;
        }
        catch(Throwable v7) {
            goto label_8;
        }

        try {
        label_111:
            v1.zzx(this.zzacv.zzbt().currentTimeMillis());
            this.zzjh().zza(v1);
            if(arg8 == v5) {
                this.zzacv.zzgi().zziz().zzg("Config not found. Using empty config. appId", arg7);
            }
            else {
                this.zzacv.zzgi().zzjc().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(arg8), Integer.valueOf(arg10.length));
            }

            if(this.zzkz().zzex()) {
                if(!this.zzlf()) {
                    goto label_78;
                }

                this.zzle();
            }
            else {
            label_78:
                this.zzlg();
            }

        label_138:
            this.zzjh().setTransactionSuccessful();
            goto label_140;
        }
        catch(Throwable v7) {
            try {
            label_144:
                this.zzjh().endTransaction();
                throw v7;
            label_140:
                v7_1 = this.zzjh();
            label_99:
                v7_1.endTransaction();
                goto label_100;
            label_8:
            }
            catch(Throwable v7) {
                goto label_8;
            }
        }

        this.zzase = false;
        this.zzlh();
        throw v7;
    label_100:
        this.zzase = false;
        this.zzlh();
    }

    final void zzb(zzjs arg1) {
        ++this.zzasc;
    }

    public final Clock zzbt() {
        return this.zzacv.zzbt();
    }

    @WorkerThread final void zzc(zzef arg10, zzeb arg11) {
        Preconditions.checkNotNull(arg10);
        Preconditions.checkNotEmpty(arg10.packageName);
        Preconditions.checkNotNull(arg10.zzage);
        Preconditions.checkNotEmpty(arg10.zzage.name);
        this.zzab();
        this.zzlc();
        if(TextUtils.isEmpty(arg11.zzafa)) {
            return;
        }

        if(!arg11.zzafk) {
            this.zzg(arg11);
            return;
        }

        this.zzjh().beginTransaction();
        try {
            this.zzg(arg11);
            zzef v0 = this.zzjh().zzi(arg10.packageName, arg10.zzage.name);
            if(v0 != null) {
                this.zzacv.zzgi().zzjb().zze("Removing conditional user property", arg10.packageName, this.zzacv.zzgf().zzbo(arg10.zzage.name));
                this.zzjh().zzj(arg10.packageName, arg10.zzage.name);
                if(v0.active) {
                    this.zzjh().zzg(arg10.packageName, arg10.zzage.name);
                }

                if(arg10.zzagh == null) {
                    goto label_91;
                }

                Bundle v1 = null;
                if(arg10.zzagh.zzahg != null) {
                    v1 = arg10.zzagh.zzahg.zzin();
                }

                this.zzc(this.zzacv.zzgg().zza(arg10.packageName, arg10.zzagh.name, v1, v0.origin, arg10.zzagh.zzahr, true, false), arg11);
            }
            else {
                this.zzacv.zzgi().zziy().zze("Conditional user property doesn\'t exist", zzfi.zzbp(arg10.packageName), this.zzacv.zzgf().zzbo(arg10.zzage.name));
            }

        label_91:
            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v10) {
            this.zzjh().endTransaction();
            throw v10;
        }

        this.zzjh().endTransaction();
    }

    @WorkerThread final void zzc(zzex arg27, String arg28) {
        zzjt v0 = this;
        zzex v1 = arg27;
        String v3 = arg28;
        zzea v15 = this.zzjh().zzbf(v3);
        if(v15 != null) {
            if(TextUtils.isEmpty(v15.zzag())) {
            }
            else {
                Boolean v2 = v0.zzc(v15);
                if(v2 == null) {
                    if(!"_ui".equals(v1.name)) {
                        v0.zzacv.zzgi().zziy().zzg("Could not find package. appId", zzfi.zzbp(arg28));
                    }
                }
                else if(!v2.booleanValue()) {
                    v0.zzacv.zzgi().zziv().zzg("App version does not match; dropping event. appId", zzfi.zzbp(arg28));
                    return;
                }

                v0.zzb(v1, new zzeb(arg28, v15.getGmpAppId(), v15.zzag(), v15.zzgu(), v15.zzgv(), v15.zzgw(), v15.zzgx(), null, v15.isMeasurementEnabled(), false, v15.zzgr(), v15.zzhk(), 0, 0, v15.zzhl(), v15.zzhm(), false));
                return;
            }
        }

        v0.zzacv.zzgi().zzjb().zzg("No app data available; dropping event", v3);
    }

    @WorkerThread final void zzc(zzka arg5, zzeb arg6) {
        this.zzab();
        this.zzlc();
        if(TextUtils.isEmpty(arg6.zzafa)) {
            return;
        }

        if(!arg6.zzafk) {
            this.zzg(arg6);
            return;
        }

        this.zzacv.zzgi().zzjb().zzg("Removing user property", this.zzacv.zzgf().zzbo(arg5.name));
        this.zzjh().beginTransaction();
        try {
            this.zzg(arg6);
            this.zzjh().zzg(arg6.packageName, arg5.name);
            this.zzjh().setTransactionSuccessful();
            this.zzacv.zzgi().zzjb().zzg("User property removed", this.zzacv.zzgf().zzbo(arg5.name));
        }
        catch(Throwable v5) {
            this.zzjh().endTransaction();
            throw v5;
        }

        this.zzjh().endTransaction();
    }

    @WorkerThread private final Boolean zzc(zzea arg9) {
        try {
            if(arg9.zzgu() == -2147483648) {
                String v0 = Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(arg9.zzah(), 0).versionName;
                if(arg9.zzag() != null && (arg9.zzag().equals(v0))) {
                    return Boolean.valueOf(true);
                }
            }
            else if(arg9.zzgu() == (((long)Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(arg9.zzah(), 0).versionCode))) {
                return Boolean.valueOf(true);
            }
        }
        catch(PackageManager$NameNotFoundException ) {
            return null;
        }

        return Boolean.valueOf(false);
    }

    @WorkerThread private final void zzc(zzex arg25, zzeb arg26) {
        zzet v0_3;
        zzes v3_1;
        boolean v4;
        long v22;
        long v8;
        long v6;
        zzel v5;
        zzea v0_1;
        zzjt v1 = this;
        zzex v0 = arg25;
        zzeb v2 = arg26;
        Preconditions.checkNotNull(arg26);
        Preconditions.checkNotEmpty(v2.packageName);
        long v3 = System.nanoTime();
        this.zzab();
        this.zzlc();
        String v15 = v2.packageName;
        if(!this.zzjf().zzd(v0, v2)) {
            return;
        }

        if(!v2.zzafk) {
            v1.zzg(v2);
            return;
        }

        if(this.zzky().zzn(v15, v0.name)) {
            v1.zzacv.zzgi().zziy().zze("Dropping blacklisted event. appId", zzfi.zzbp(v15), v1.zzacv.zzgf().zzbm(v0.name));
            int v14 = (this.zzky().zzcb(v15)) || (this.zzky().zzcc(v15)) ? 1 : 0;
            if(v14 == 0 && !"_err".equals(v0.name)) {
                v1.zzacv.zzgg().zza(v15, 11, "_ev", v0.name, 0);
            }

            if(v14 != 0) {
                v0_1 = this.zzjh().zzbf(v15);
                if(v0_1 != null && Math.abs(v1.zzacv.zzbt().currentTimeMillis() - Math.max(v0_1.zzha(), v0_1.zzgz())) > zzez.zzajd.get().longValue()) {
                    v1.zzacv.zzgi().zzjb().log("Fetching config for blacklisted app");
                    v1.zzb(v0_1);
                }
            }

            return;
        }

        if(v1.zzacv.zzgi().isLoggable(2)) {
            v1.zzacv.zzgi().zzjc().zzg("Logging event", v1.zzacv.zzgf().zzb(v0));
        }

        this.zzjh().beginTransaction();
        try {
            v1.zzg(v2);
            if((("_iap".equals(v0.name)) || ("ecommerce_purchase".equals(v0.name))) && !v1.zza(v15, v0)) {
                this.zzjh().setTransactionSuccessful();
                goto label_107;
            }

            goto label_110;
        }
        catch(Throwable v0_2) {
            goto label_598;
        }

    label_107:
        this.zzjh().endTransaction();
        return;
        try {
        label_110:
            boolean v16 = zzkd.zzcg(v0.name);
            boolean v17 = "_err".equals(v0.name);
            v5 = this.zzjh().zza(this.zzld(), v15, true, v16, false, v17, false);
            v6 = v5.zzagu - (((long)zzez.zzaio.get().intValue()));
            v8 = 1000;
            long v10 = 1;
            long v12 = 0;
            if(v6 <= v12) {
                goto label_150;
            }

            if(v6 % v8 == v10) {
                v1.zzacv.zzgi().zziv().zze("Data loss. Too many events logged. appId, count", zzfi.zzbp(v15), Long.valueOf(v5.zzagu));
            }

            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v0_2) {
            goto label_598;
        }

        this.zzjh().endTransaction();
        return;
    label_150:
        if(v16) {
            try {
                v6 = v5.zzagt - (((long)zzez.zzaiq.get().intValue()));
                if(v6 > v12) {
                    if(v6 % v8 == 1) {
                        v1.zzacv.zzgi().zziv().zze("Data loss. Too many public events logged. appId, count", zzfi.zzbp(v15), Long.valueOf(v5.zzagt));
                    }

                    v1.zzacv.zzgg().zza(v15, 16, "_ev", v0.name, 0);
                    this.zzjh().setTransactionSuccessful();
                    goto label_179;
                }

                goto label_182;
            }
            catch(Throwable v0_2) {
                goto label_598;
            }

        label_179:
            this.zzjh().endTransaction();
            return;
        }

    label_182:
        if(v17) {
            try {
                v6 = v5.zzagw - (((long)Math.max(0, Math.min(1000000, v1.zzacv.zzgk().zzb(v2.packageName, zzez.zzaip)))));
                if(v6 > v12) {
                    if(v6 == 1) {
                        v1.zzacv.zzgi().zziv().zze("Too many error events logged. appId, count", zzfi.zzbp(v15), Long.valueOf(v5.zzagw));
                    }

                    this.zzjh().setTransactionSuccessful();
                    goto label_208;
                }

                goto label_212;
            }
            catch(Throwable v0_2) {
                goto label_598;
            }

        label_208:
            this.zzjh().endTransaction();
            return;
        }

        try {
        label_212:
            Bundle v10_1 = v0.zzahg.zzin();
            v1.zzacv.zzgg().zza(v10_1, "_o", v0.origin);
            if(v1.zzacv.zzgg().zzcn(v15)) {
                v1.zzacv.zzgg().zza(v10_1, "_dbg", Long.valueOf(1));
                v1.zzacv.zzgg().zza(v10_1, "_r", Long.valueOf(1));
            }

            long v5_1 = this.zzjh().zzbg(v15);
            if(v5_1 > v12) {
                v1.zzacv.zzgi().zziy().zze("Data lost. Too many events stored on disk, deleted. appId", zzfi.zzbp(v15), Long.valueOf(v5_1));
            }

            v22 = v3;
            v4 = false;
            v3_1 = new zzes(v1.zzacv, v0.origin, v15, v0.name, v0.zzahr, 0, v10_1);
            v0_3 = this.zzjh().zzf(v15, v3_1.name);
            if(v0_3 == null) {
                if(this.zzjh().zzbj(v15) >= 500 && (v16)) {
                    v1.zzacv.zzgi().zziv().zzd("Too many event names used, ignoring event. appId, name, supported count", zzfi.zzbp(v15), v1.zzacv.zzgf().zzbm(v3_1.name), Integer.valueOf(500));
                    v1.zzacv.zzgg().zza(v15, 8, null, null, 0);
                    goto label_291;
                }

                goto label_294;
            }
            else {
                goto label_312;
            }
        }
        catch(Throwable v0_2) {
            goto label_598;
        }

    label_291:
        this.zzjh().endTransaction();
        return;
        try {
        label_294:
            v0_3 = new zzet(v15, v3_1.name, 0, 0, v3_1.timestamp, 0, null, null, null);
            goto label_318;
        label_312:
            zzes v11 = v3_1.zza(v1.zzacv, v0_3.zzahj);
            v0_3 = v0_3.zzah(v11.timestamp);
            v3_1 = v11;
        label_318:
            this.zzjh().zza(v0_3);
            this.zzab();
            this.zzlc();
            Preconditions.checkNotNull(v3_1);
            Preconditions.checkNotNull(arg26);
            Preconditions.checkNotEmpty(v3_1.zzth);
            Preconditions.checkArgument(v3_1.zzth.equals(v2.packageName));
            zzku v5_2 = new zzku();
            v5_2.zzavh = Integer.valueOf(1);
            v5_2.zzavp = "android";
            v5_2.zzth = v2.packageName;
            v5_2.zzafh = v2.zzafh;
            v5_2.zztg = v2.zztg;
            Long v0_4 = null;
            Integer v6_1 = v2.zzafg == -2147483648 ? ((Integer)v0_4) : Integer.valueOf(((int)v2.zzafg));
            v5_2.zzawb = v6_1;
            v5_2.zzavt = Long.valueOf(v2.zzafi);
            v5_2.zzafa = v2.zzafa;
            v8 = 0;
            Long v6_2 = v2.zzafj == v8 ? v0_4 : Long.valueOf(v2.zzafj);
            v5_2.zzavx = v6_2;
            Pair v6_3 = v1.zzacv.zzgj().zzbr(v2.packageName);
            if(v6_3 == null || (TextUtils.isEmpty(v6_3.first))) {
                if(!v1.zzacv.zzge().zzf(v1.zzacv.getContext()) && (v2.zzafn)) {
                    String v6_4 = Settings$Secure.getString(v1.zzacv.getContext().getContentResolver(), "android_id");
                    if(v6_4 == null) {
                        v1.zzacv.zzgi().zziy().zzg("null secure ID. appId", zzfi.zzbp(v5_2.zzth));
                        v6_4 = "null";
                    }
                    else if(v6_4.isEmpty()) {
                        v1.zzacv.zzgi().zziy().zzg("empty secure ID. appId", zzfi.zzbp(v5_2.zzth));
                    }

                    v5_2.zzawe = v6_4;
                }
            }
            else if(v2.zzafm) {
                v5_2.zzavv = v6_3.first;
                v5_2.zzavw = v6_3.second;
            }

            v1.zzacv.zzge().zzch();
            v5_2.zzavr = Build.MODEL;
            v1.zzacv.zzge().zzch();
            v5_2.zzavq = Build$VERSION.RELEASE;
            v5_2.zzavs = Integer.valueOf(((int)v1.zzacv.zzge().zzik()));
            v5_2.zzahd = v1.zzacv.zzge().zzil();
            v5_2.zzavu = v0_4;
            v5_2.zzavk = v0_4;
            v5_2.zzavl = v0_4;
            v5_2.zzavm = v0_4;
            v5_2.zzawg = Long.valueOf(v2.zzafl);
            if((v1.zzacv.isEnabled()) && (zzeh.zzht())) {
                v5_2.zzawh = ((String)v0_4);
            }

            v0_1 = this.zzjh().zzbf(v2.packageName);
            if(v0_1 == null) {
                v0_1 = new zzea(v1.zzacv, v2.packageName);
                v0_1.zzam(v1.zzacv.zzfz().zzir());
                v0_1.zzap(v2.zzafc);
                v0_1.zzan(v2.zzafa);
                v0_1.zzao(v1.zzacv.zzgj().zzbs(v2.packageName));
                v0_1.zzw(v8);
                v0_1.zzr(v8);
                v0_1.zzs(v8);
                v0_1.setAppVersion(v2.zztg);
                v0_1.zzt(v2.zzafg);
                v0_1.zzaq(v2.zzafh);
                v0_1.zzu(v2.zzafi);
                v0_1.zzv(v2.zzafj);
                v0_1.setMeasurementEnabled(v2.zzafk);
                v0_1.zzaf(v2.zzafl);
                this.zzjh().zza(v0_1);
            }

            v5_2.zzaez = v0_1.getAppInstanceId();
            v5_2.zzafc = v0_1.zzgr();
            List v0_5 = this.zzjh().zzbe(v2.packageName);
            v5_2.zzavj = new zzkx[v0_5.size()];
            int v2_1;
            for(v2_1 = 0; v2_1 < v0_5.size(); ++v2_1) {
                zzkx v6_5 = new zzkx();
                v5_2.zzavj[v2_1] = v6_5;
                v6_5.name = v0_5.get(v2_1).name;
                v6_5.zzaws = Long.valueOf(v0_5.get(v2_1).zzast);
                this.zzjf().zza(v6_5, v0_5.get(v2_1).value);
            }

            try {
                v6 = this.zzjh().zza(v5_2);
            }
            catch(IOException v0_6) {
                v1.zzacv.zzgi().zziv().zze("Data loss. Failed to insert raw event metadata. appId", zzfi.zzbp(v5_2.zzth), v0_6);
                goto label_565;
            }

            zzek v0_7 = this.zzjh();
            if(v3_1.zzahg != null) {
                Iterator v2_2 = v3_1.zzahg.iterator();
                do {
                    if(!v2_2.hasNext()) {
                        break;
                    }
                    else if(!"_r".equals(v2_2.next())) {
                        continue;
                    }

                    goto label_529;
                }
                while(true);

                boolean v2_3 = this.zzky().zzo(v3_1.zzth, v3_1.name);
                v5 = this.zzjh().zza(this.zzld(), v3_1.zzth, false, false, false, false, false);
                if(!v2_3) {
                    goto label_553;
                }
                else if(v5.zzagx < (((long)v1.zzacv.zzgk().zzas(v3_1.zzth)))) {
                }
                else {
                    goto label_553;
                }

            label_529:
                v4 = true;
            }

        label_553:
            if(v0_7.zza(v3_1, v6, v4)) {
                v1.zzasa = v8;
            }

        label_565:
            this.zzjh().setTransactionSuccessful();
            if(v1.zzacv.zzgi().isLoggable(2)) {
                v1.zzacv.zzgi().zzjc().zzg("Event recorded", v1.zzacv.zzgf().zza(v3_1));
            }
        }
        catch(Throwable v0_2) {
            goto label_598;
        }

        this.zzjh().endTransaction();
        this.zzlg();
        v1.zzacv.zzgi().zzjc().zzg("Background event processing time, ms", Long.valueOf((System.nanoTime() - v22 + 500000) / 1000000));
        return;
    label_598:
        this.zzjh().endTransaction();
        throw v0_2;
    }

    @WorkerThread private final zzeb zzce(String arg26) {
        Object v2_1;
        String v4;
        zzfk v3_1;
        zzjt v0 = this;
        String v2 = arg26;
        zzea v15 = this.zzjh().zzbf(v2);
        zzeb v1 = null;
        if(v15 == null || (TextUtils.isEmpty(v15.zzag()))) {
            v3_1 = v0.zzacv.zzgi().zzjb();
            v4 = "No app data available; dropping";
        }
        else {
            Boolean v3 = v0.zzc(v15);
            if(v3 != null && !v3.booleanValue()) {
                v3_1 = v0.zzacv.zzgi().zziv();
                v4 = "App version does not match; dropping. appId";
                v2_1 = zzfi.zzbp(arg26);
                goto label_19;
            }

            return new zzeb(arg26, v15.getGmpAppId(), v15.zzag(), v15.zzgu(), v15.zzgv(), v15.zzgw(), v15.zzgx(), null, v15.isMeasurementEnabled(), false, v15.zzgr(), v15.zzhk(), 0, 0, v15.zzhl(), v15.zzhm(), false);
        }

    label_19:
        v3_1.zzg(v4, v2_1);
        return v1;
    }

    @WorkerThread @VisibleForTesting final void zzd(zzeb arg11) {
        if(this.zzasj != null) {
            this.zzask = new ArrayList();
            this.zzask.addAll(this.zzasj);
        }

        zzek v0 = this.zzjh();
        String v1 = arg11.packageName;
        Preconditions.checkNotEmpty(v1);
        ((zzhi)v0).zzab();
        ((zzjs)v0).zzch();
        try {
            SQLiteDatabase v2_1 = v0.getWritableDatabase();
            String[] v3 = new String[]{v1};
            int v5 = v2_1.delete("apps", "app_id=?", v3) + v2_1.delete("events", "app_id=?", v3) + v2_1.delete("user_attributes", "app_id=?", v3) + v2_1.delete("conditional_properties", "app_id=?", v3) + v2_1.delete("raw_events", "app_id=?", v3) + v2_1.delete("raw_events_metadata", "app_id=?", v3) + v2_1.delete("queue", "app_id=?", v3) + v2_1.delete("audience_filter_values", "app_id=?", v3) + v2_1.delete("main_event_params", "app_id=?", v3);
            if(v5 <= 0) {
                goto label_67;
            }

            ((zzhi)v0).zzgi().zzjc().zze("Reset analytics data. app, records", v1, Integer.valueOf(v5));
        }
        catch(SQLiteException v2) {
            ((zzhi)v0).zzgi().zziv().zze("Error resetting analytics data. appId, error", zzfi.zzbp(v1), v2);
        }

    label_67:
        zzeb v0_1 = this.zza(this.zzacv.getContext(), arg11.packageName, arg11.zzafa, arg11.zzafk, arg11.zzafm, arg11.zzafn, arg11.zzaga);
        if(!this.zzacv.zzgk().zzbc(arg11.packageName) || (arg11.zzafk)) {
            this.zzf(v0_1);
        }
    }

    @WorkerThread private final boolean zzd(String arg58, long arg59) {
        SQLiteDatabase v3_8;
        zzek v1_7;
        Long v4_6;
        zzea v4_4;
        String v2_2;
        int v1_2;
        zzet v40_1;
        zzet v9_3;
        int v39;
        zzkr[] v38;
        Object v13_3;
        zzkr[] v7_4;
        SecureRandom v6_6;
        zzkr[] v5_10;
        HashMap v4_3;
        zzkc v29_1;
        zzkc v4_2;
        Object v7_3;
        zzfk v5_8;
        zzks v10_1;
        Object[] v6_5;
        zzks v15_3;
        int v10;
        int v6_3;
        int v26;
        int v11;
        int v35;
        Object v14_2;
        boolean v8_2;
        int v7_1;
        zzku v3_6;
        Throwable v1_1;
        zzkr v12_6;
        zzaca v8_1;
        long v6_2;
        Cursor v5_3;
        String v15_2;
        SQLiteDatabase v12_5;
        String v20;
        String v19;
        String v18;
        String v17;
        String[] v16;
        String v5_2;
        zzku v13_2;
        zzaca v12_4;
        Cursor v15_1;
        SQLiteDatabase v25;
        String[] v14_1;
        SQLiteException v3_5;
        Cursor v21;
        String[] v12_2;
        int v3_4;
        String v6_1;
        String v22;
        String v3_3;
        Cursor v23;
        String v13_1;
        Cursor v3_2;
        Cursor v6;
        String v12_1;
        String[] v13;
        SQLiteDatabase v15;
        int v9;
        long v7;
        long v5;
        zzek v4;
        zza v2;
        zzju v3;
        zzjt v1 = this;
        this.zzjh().beginTransaction();
        try {
            v3 = null;
            v2 = new zza(v1, v3);
            v4 = this.zzjh();
            v5 = v1.zzasl;
            Preconditions.checkNotNull(v2);
            ((zzhi)v4).zzab();
            ((zzjs)v4).zzch();
            v7 = -1;
            v9 = 2;
        }
        catch(Throwable v0) {
            goto label_1269;
        }

        try {
            v15 = v4.getWritableDatabase();
            if(TextUtils.isEmpty(((CharSequence)v3))) {
            }
            else {
                goto label_69;
            }
        }
        catch(SQLiteException v0_1) {
            goto label_275;
        }
        catch(Throwable v0) {
            goto label_271;
        }

        int v12 = Long.compare(v5, v7);
        if(v12 != 0) {
            try {
                v13 = new String[v9];
                v13[0] = String.valueOf(v5);
                v13[1] = String.valueOf(arg59);
            }
            catch(SQLiteException v0_1) {
                goto label_31;
            }
            catch(Throwable v0) {
                goto label_28;
            }
        }
        else {
            try {
                v13 = new String[]{String.valueOf(arg59)};
            }
            catch(SQLiteException v0_1) {
                goto label_275;
            }
            catch(Throwable v0) {
                goto label_271;
            }
        }

        if(v12 != 0) {
            try {
                v12_1 = "rowid <= ? and ";
                goto label_42;
            }
            catch(Throwable v0) {
            }
            catch(SQLiteException v0_1) {
            label_31:
                v6 = ((Cursor)v3);
                v12_1 = ((String)v6);
                goto label_33;
                try {
                label_41:
                    v12_1 = "";
                label_42:
                    StringBuilder v3_1 = new StringBuilder(String.valueOf(v12_1).length() + 0x94);
                    v3_1.append("select app_id, metadata_fingerprint from raw_events where ");
                    v3_1.append(v12_1);
                    v3_1.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    v3_2 = v15.rawQuery(v3_1.toString(), v13);
                }
                catch(SQLiteException v0_1) {
                    goto label_275;
                }
                catch(Throwable v0) {
                    goto label_271;
                }

                try {
                    if(v3_2.moveToFirst()) {
                        goto label_59;
                    }
                }
                catch(SQLiteException v0_1) {
                    goto label_266;
                }
                catch(Throwable v0) {
                    goto label_28;
                }

                if(v3_2 == null) {
                    goto label_285;
                }

                goto label_57;
                try {
                label_59:
                    v12_1 = v3_2.getString(0);
                }
                catch(SQLiteException v0_1) {
                    goto label_266;
                }
                catch(Throwable v0) {
                    goto label_28;
                }

                try {
                    v13_1 = v3_2.getString(1);
                    v3_2.close();
                    v23 = v3_2;
                    v3_3 = v12_1;
                    v22 = v13_1;
                    goto label_105;
                }
                catch(Throwable v0) {
                }
                catch(SQLiteException v0_1) {
                    v6_1 = v3_3;
                    goto label_33;
                label_69:
                    v3_4 = Long.compare(v5, v7);
                    if(v3_4 != 0) {
                        try {
                            v12_2 = new String[v9];
                            v12_2[0] = null;
                            v12_2[1] = String.valueOf(v5);
                            goto label_80;
                        label_77:
                            v12_2 = new String[]{null};
                        label_80:
                            v3_3 = v3_4 != 0 ? " and rowid <= ?" : "";
                            StringBuilder v14 = new StringBuilder(String.valueOf(v3_3).length() + 84);
                            v14.append("select metadata_fingerprint from raw_events where app_id = ?");
                            v14.append(v3_3);
                            v14.append(" order by rowid limit 1;");
                            v3_2 = v15.rawQuery(v14.toString(), v12_2);
                            goto label_96;
                        }
                        catch(Throwable v0) {
                        label_271:
                            v21 = null;
                            goto label_272;
                        }
                        catch(SQLiteException v0_1) {
                        label_275:
                            v3_5 = v0_1;
                            v6 = null;
                            v12_1 = null;
                            goto label_278;
                        }
                    }
                    else {
                        goto label_77;
                    }

                    goto label_80;
                    try {
                    label_96:
                        if(v3_2.moveToFirst()) {
                            goto label_100;
                        }

                        if(v3_2 == null) {
                            goto label_285;
                        }
                    }
                    catch(SQLiteException v0_1) {
                        goto label_266;
                    }
                    catch(Throwable v0) {
                        goto label_28;
                    }

                    try {
                    label_57:
                        v3_2.close();
                        goto label_285;
                    }
                    catch(Throwable v0) {
                        goto label_1269;
                    }

                    try {
                    label_100:
                        v13_1 = v3_2.getString(0);
                        v3_2.close();
                        v23 = v3_2;
                        v22 = v13_1;
                        v3_2 = null;
                        goto label_105;
                    }
                    catch(Throwable v0) {
                    label_28:
                        v21 = v3_2;
                        goto label_272;
                    }
                    catch(SQLiteException v0_1) {
                    label_266:
                        v6 = v3_2;
                        v12_1 = null;
                        goto label_33;
                    }
                }
            }
        }
        else {
            goto label_41;
        }

        goto label_42;
        try {
        label_105:
            v14_1 = new String[]{"metadata"};
            v12_2 = new String[v9];
            v12_2[0] = ((String)v3_2);
            v12_2[1] = v22;
            v25 = v15;
            v15_1 = v15.query("raw_events_metadata", v14_1, "app_id = ? and metadata_fingerprint = ?", v12_2, null, null, "rowid", "2");
        }
        catch(Throwable v0) {
            v21 = v23;
            goto label_272;
        }
        catch(SQLiteException v0_1) {
            v12_1 = ((String)v3_2);
            v6 = v23;
            goto label_33;
        }

        try {
            if(v15_1.moveToFirst()) {
                goto label_140;
            }
        }
        catch(SQLiteException v0_1) {
            goto label_254;
        }
        catch(Throwable v0) {
            goto label_249;
        }

        try {
            ((zzhi)v4).zzgi().zziv().zzg("Raw event metadata record is missing. appId", zzfi.zzbp(((String)v3_2)));
            if(v15_1 == null) {
                goto label_285;
            }
        }
        catch(SQLiteException v0_1) {
            goto label_137;
        }
        catch(Throwable v0) {
            goto label_134;
        }

        try {
            v15_1.close();
            goto label_285;
        }
        catch(Throwable v0) {
            goto label_1269;
        }

        try {
        label_140:
            byte[] v12_3 = v15_1.getBlob(0);
            v12_4 = zzaca.zza(v12_3, 0, v12_3.length);
            v13_2 = new zzku();
        }
        catch(SQLiteException v0_1) {
            goto label_254;
        }
        catch(Throwable v0) {
            goto label_249;
        }

        try {
            ((zzacj)v13_2).zzb(v12_4);
            goto label_146;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
        }
        catch(IOException v0_2) {
            IOException v5_1 = v0_2;
            v6 = v15_1;
            try {
                ((zzhi)v4).zzgi().zziv().zze("Data loss. Failed to merge raw event metadata. appId", zzfi.zzbp(((String)v3_2)), v5_1);
                if(v6 == null) {
                    goto label_285;
                }

                goto label_242;
            }
            catch(SQLiteException v0_1) {
                goto label_255;
            }
            catch(Throwable v0) {
                goto label_245;
            }

            try {
            label_146:
                if(v15_1.moveToNext()) {
                    goto label_148;
                }

                goto label_153;
            }
            catch(SQLiteException v0_1) {
                goto label_254;
            }
            catch(Throwable v0) {
                goto label_249;
            }

            try {
            label_148:
                ((zzhi)v4).zzgi().zziy().zzg("Get multiple raw event metadata records, expected one. appId", zzfi.zzbp(((String)v3_2)));
            }
            catch(SQLiteException v0_1) {
                goto label_137;
            }
            catch(Throwable v0) {
                goto label_134;
            }

            try {
            label_153:
                v15_1.close();
                ((zzem)v2).zzb(v13_2);
                v9 = 3;
                if(v5 != v7) {
                }
                else {
                    goto label_167;
                }
            }
            catch(SQLiteException v0_1) {
                goto label_254;
            }
            catch(Throwable v0) {
                goto label_249;
            }

            try {
                v13 = new String[v9];
                v13[0] = ((String)v3_2);
                v13[1] = v22;
                v13[2] = String.valueOf(v5);
                v5_2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                v16 = v13;
                goto label_173;
            }
            catch(Throwable v0) {
            label_134:
                v21 = v15_1;
                goto label_272;
            }
            catch(SQLiteException v0_1) {
            label_137:
                v12_1 = ((String)v3_2);
                v6 = v15_1;
                goto label_33;
            }

            try {
            label_167:
                v5_2 = "app_id = ? and metadata_fingerprint = ?";
                v16 = new String[]{((String)v3_2), v22};
            label_173:
                v13_1 = "raw_events";
                v14_1 = new String[]{"rowid", "name", "timestamp", "data"};
                v17 = null;
                v18 = null;
                v19 = "rowid";
                v20 = null;
                v12_5 = v25;
                v6 = v15_1;
                v15_2 = v5_2;
            }
            catch(Throwable v0) {
            label_249:
                v6 = v15_1;
                goto label_250;
            }
            catch(SQLiteException v0_1) {
            label_254:
                v6 = v15_1;
                goto label_255;
            }
        }

        try {
            v5_3 = v12_5.query(v13_1, v14_1, v15_2, v16, v17, v18, v19, v20);
            goto label_187;
        }
        catch(Throwable v0) {
        label_245:
        }
        catch(SQLiteException v0_1) {
        label_255:
            v12_1 = ((String)v3_2);
            goto label_33;
        }

    label_250:
        v21 = v6;
        goto label_272;
        try {
        label_187:
            if(!v5_3.moveToFirst()) {
                ((zzhi)v4).zzgi().zziy().zzg("Raw event data disappeared while in transaction. appId", zzfi.zzbp(((String)v3_2)));
                if(v5_3 == null) {
                    goto label_285;
                }

                goto label_195;
            }

            do {
            label_197:
                v6_2 = v5_3.getLong(0);
                byte[] v8 = v5_3.getBlob(v9);
                v8_1 = zzaca.zza(v8, 0, v8.length);
                v12_6 = new zzkr();
                break;
            }
            while(true);
        }
        catch(SQLiteException v0_1) {
            goto label_230;
        }
        catch(Throwable v0) {
            goto label_226;
        }

        try {
            ((zzacj)v12_6).zzb(v8_1);
            goto label_204;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
        label_230:
            v12_1 = ((String)v3_2);
            v6 = v5_3;
        label_33:
            v3_5 = v0_1;
            try {
            label_278:
                ((zzhi)v4).zzgi().zziv().zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(v12_1), v3_5);
                if((((String)v6)) == null) {
                    goto label_285;
                }
            }
            catch(Throwable v0) {
                v1_1 = v0;
                String v21_1 = ((String)v6);
                goto label_1261;
            }

            try {
            label_242:
                v6.close();
            label_285:
                v3_4 = v2.zzasr == null || (v2.zzasr.isEmpty()) ? 1 : 0;
                if(v3_4 != 0) {
                    goto label_1251;
                }

                v3_6 = v2.zzasp;
                v3_6.zzavi = new zzkr[v2.zzasr.size()];
                boolean v4_1 = v1.zzacv.zzgk().zzaw(v3_6.zzth);
                v7_1 = 0;
                v8_2 = false;
                v9 = 0;
                long v12_7 = 0;
                while(v7_1 < v2.zzasr.size()) {
                    v14_2 = v2.zzasr.get(v7_1);
                    if(this.zzky().zzn(v2.zzasp.zzth, ((zzkr)v14_2).name)) {
                        v1.zzacv.zzgi().zziy().zze("Dropping blacklisted raw event. appId", zzfi.zzbp(v2.zzasp.zzth), v1.zzacv.zzgf().zzbm(((zzkr)v14_2).name));
                        int v5_4 = (this.zzky().zzcb(v2.zzasp.zzth)) || (this.zzky().zzcc(v2.zzasp.zzth)) ? 1 : 0;
                        if(v5_4 == 0 && !"_err".equals(((zzkr)v14_2).name)) {
                            v1.zzacv.zzgg().zza(v2.zzasp.zzth, 11, "_ev", ((zzkr)v14_2).name, 0);
                        }

                        v35 = v7_1;
                    }
                    else {
                        boolean v5_5 = this.zzky().zzo(v2.zzasp.zzth, ((zzkr)v14_2).name);
                        if(!v5_5) {
                            this.zzjf();
                            v6_1 = ((zzkr)v14_2).name;
                            Preconditions.checkNotEmpty(v6_1);
                            v11 = v6_1.hashCode();
                            if(v11 != 94660) {
                                if(v11 != 95025) {
                                    if(v11 != 95027) {
                                        goto label_395;
                                    }
                                    else if(v6_1.equals("_ui")) {
                                        v26 = 1;
                                    }
                                    else {
                                        goto label_395;
                                    }
                                }
                                else if(v6_1.equals("_ug")) {
                                    v26 = 2;
                                }
                                else {
                                    goto label_395;
                                }
                            }
                            else if(v6_1.equals("_in")) {
                                v26 = 0;
                            }
                            else {
                            label_395:
                                v26 = -1;
                            }

                            switch(v26) {
                                case 0: 
                                case 1: 
                                case 2: {
                                    v6_3 = 1;
                                    break;
                                }
                                default: {
                                    v6_3 = 0;
                                    break;
                                }
                            }

                            if(v6_3 != 0) {
                                goto label_404;
                            }

                            v35 = v7_1;
                        }
                        else {
                        label_404:
                            if(((zzkr)v14_2).zzava == null) {
                                ((zzkr)v14_2).zzava = new zzks[0];
                            }

                            zzks[] v6_4 = ((zzkr)v14_2).zzava;
                            v10 = v6_4.length;
                            v11 = 0;
                            int v17_1 = 0;
                            int v18_1 = 0;
                            while(v11 < v10) {
                                v15_3 = v6_4[v11];
                                zzks[] v29 = v6_4;
                                int v30 = v10;
                                if("_c".equals(v15_3.name)) {
                                    v15_3.zzave = Long.valueOf(1);
                                    v17_1 = 1;
                                }
                                else if("_r".equals(v15_3.name)) {
                                    v15_3.zzave = Long.valueOf(1);
                                    v18_1 = 1;
                                }

                                ++v11;
                                v6_4 = v29;
                                v10 = v30;
                            }

                            if(v17_1 == 0 && (v5_5)) {
                                v1.zzacv.zzgi().zzjc().zzg("Marking event as conversion", v1.zzacv.zzgf().zzbm(((zzkr)v14_2).name));
                                v6_5 = Arrays.copyOf(((zzkr)v14_2).zzava, ((zzkr)v14_2).zzava.length + 1);
                                v10_1 = new zzks();
                                v10_1.name = "_c";
                                v10_1.zzave = Long.valueOf(1);
                                v6_5[v6_5.length - 1] = v10_1;
                                ((zzkr)v14_2).zzava = ((zzks[])v6_5);
                            }

                            if(v18_1 == 0) {
                                v1.zzacv.zzgi().zzjc().zzg("Marking event as real-time", v1.zzacv.zzgf().zzbm(((zzkr)v14_2).name));
                                v6_5 = Arrays.copyOf(((zzkr)v14_2).zzava, ((zzkr)v14_2).zzava.length + 1);
                                v10_1 = new zzks();
                                v10_1.name = "_r";
                                v10_1.zzave = Long.valueOf(1);
                                v6_5[v6_5.length - 1] = v10_1;
                                ((zzkr)v14_2).zzava = ((zzks[])v6_5);
                            }

                            v35 = v7_1;
                            if(this.zzjh().zza(this.zzld(), v2.zzasp.zzth, false, false, false, false, true).zzagx > (((long)v1.zzacv.zzgk().zzas(v2.zzasp.zzth)))) {
                                v6_3 = 0;
                                goto label_517;
                            }
                            else {
                                v8_2 = true;
                                goto label_547;
                            label_517:
                                while(v6_3 < ((zzkr)v14_2).zzava.length) {
                                    if("_r".equals(((zzkr)v14_2).zzava[v6_3].name)) {
                                        zzks[] v7_2 = new zzks[((zzkr)v14_2).zzava.length - 1];
                                        if(v6_3 > 0) {
                                            System.arraycopy(((zzkr)v14_2).zzava, 0, v7_2, 0, v6_3);
                                        }

                                        if(v6_3 < v7_2.length) {
                                            System.arraycopy(((zzkr)v14_2).zzava, v6_3 + 1, v7_2, v6_3, v7_2.length - v6_3);
                                        }

                                        ((zzkr)v14_2).zzava = v7_2;
                                    }
                                    else {
                                        ++v6_3;
                                        continue;
                                    }

                                    break;
                                }
                            }

                        label_547:
                            if(!zzkd.zzcg(((zzkr)v14_2).name)) {
                                goto label_628;
                            }

                            if(!v5_5) {
                                goto label_628;
                            }

                            if(this.zzjh().zza(this.zzld(), v2.zzasp.zzth, false, false, true, false, false).zzagv <= (((long)v1.zzacv.zzgk().zzb(v2.zzasp.zzth, zzez.zzair)))) {
                                goto label_628;
                            }

                            v1.zzacv.zzgi().zziy().zzg("Too many conversions. Not logging as conversion. appId", zzfi.zzbp(v2.zzasp.zzth));
                            zzks[] v5_6 = ((zzkr)v14_2).zzava;
                            v6_3 = v5_6.length;
                            v7_1 = 0;
                            v10 = 0;
                            zzks v11_1 = null;
                            while(v7_1 < v6_3) {
                                v15_3 = v5_6[v7_1];
                                zzks[] v36 = v5_6;
                                int v37 = v6_3;
                                if("_c".equals(v15_3.name)) {
                                    v11_1 = v15_3;
                                }
                                else if("_err".equals(v15_3.name)) {
                                    v10 = 1;
                                }

                                ++v7_1;
                                v5_6 = v36;
                                v6_3 = v37;
                            }

                            if(v10 != 0 && v11_1 != null) {
                                ((zzkr)v14_2).zzava = ArrayUtils.removeAll(((zzkr)v14_2).zzava, new zzks[]{v11_1});
                                goto label_628;
                            }

                            if(v11_1 != null) {
                                v11_1.name = "_err";
                                v11_1.zzave = Long.valueOf(10);
                                goto label_628;
                            }

                            v1.zzacv.zzgi().zziv().zzg("Did not find conversion parameter. appId", zzfi.zzbp(v2.zzasp.zzth));
                        }

                    label_628:
                        if((v4_1) && ("_e".equals(((zzkr)v14_2).name))) {
                            if(((zzkr)v14_2).zzava == null || ((zzkr)v14_2).zzava.length == 0) {
                                v5_8 = v1.zzacv.zzgi().zziy();
                                v6_1 = "Engagement event does not contain any parameters. appId";
                                v7_3 = zzfi.zzbp(v2.zzasp.zzth);
                            }
                            else {
                                this.zzjf();
                                Object v5_7 = zzjz.zzb(((zzkr)v14_2), "_et");
                                if(v5_7 == null) {
                                    v5_8 = v1.zzacv.zzgi().zziy();
                                    v6_1 = "Engagement event does not include duration. appId";
                                    v7_3 = zzfi.zzbp(v2.zzasp.zzth);
                                }
                                else {
                                    v12_7 += ((Long)v5_7).longValue();
                                    goto label_664;
                                }
                            }

                            v5_8.zzg(v6_1, v7_3);
                        }

                    label_664:
                        v3_6.zzavi[v9] = v14_2;
                        ++v9;
                    }

                    v7_1 = v35 + 1;
                }

                if(v9 < v2.zzasr.size()) {
                    v3_6.zzavi = Arrays.copyOf(v3_6.zzavi, v9);
                }

                if(v4_1) {
                    v4_2 = this.zzjh().zzh(v3_6.zzth, "_lte");
                    if(v4_2 == null || v4_2.value == null) {
                        v29_1 = new zzkc(v3_6.zzth, "auto", "_lte", v1.zzacv.zzbt().currentTimeMillis(), Long.valueOf(v12_7));
                        goto label_715;
                    }
                    else {
                        v4_2 = new zzkc(v3_6.zzth, "auto", "_lte", v1.zzacv.zzbt().currentTimeMillis(), Long.valueOf(v4_2.value.longValue() + v12_7));
                    }

                    goto label_716;
                }

                goto label_769;
            }
            catch(Throwable v0) {
                goto label_1269;
            }

        label_715:
            v4_2 = v29_1;
            try {
            label_716:
                zzkx v5_9 = new zzkx();
                v5_9.name = "_lte";
                v5_9.zzaws = Long.valueOf(v1.zzacv.zzbt().currentTimeMillis());
                v5_9.zzave = v4_2.value;
                v6_3 = 0;
                while(true) {
                    if(v6_3 >= v3_6.zzavj.length) {
                        break;
                    }
                    else if("_lte".equals(v3_6.zzavj[v6_3].name)) {
                        v3_6.zzavj[v6_3] = v5_9;
                        v6_3 = 1;
                    }
                    else {
                        ++v6_3;
                        continue;
                    }

                    goto label_744;
                }

                v6_3 = 0;
            label_744:
                if(v6_3 == 0) {
                    v3_6.zzavj = Arrays.copyOf(v3_6.zzavj, v3_6.zzavj.length + 1);
                    v3_6.zzavj[v2.zzasp.zzavj.length - 1] = v5_9;
                }

                if(v12_7 > 0) {
                    this.zzjh().zza(v4_2);
                    v1.zzacv.zzgi().zzjb().zzg("Updated lifetime engagement user property with value. Value", v4_2.value);
                }

            label_769:
                v3_6.zzawa = v1.zza(v3_6.zzth, v3_6.zzavj, v3_6.zzavi);
                if(v1.zzacv.zzgk().zzav(v2.zzasp.zzth)) {
                }
                else {
                    goto label_1072;
                }
            }
            catch(Throwable v0) {
                goto label_1269;
            }

            try {
                v4_3 = new HashMap();
                v5_10 = new zzkr[v3_6.zzavi.length];
                v6_6 = v1.zzacv.zzgg().zzlo();
                v7_4 = v3_6.zzavi;
                v9 = v7_4.length;
                v10 = 0;
                v11 = 0;
                goto label_792;
            }
            catch(Throwable v0) {
                goto label_1069;
            }

        label_1072:
            zza v56 = v2;
            boolean v55 = v8_2;
            goto label_1074;
            try {
                while(true) {
                label_792:
                    if(v10 < v9) {
                        v12_6 = v7_4[v10];
                        if(v12_6.name.equals("_ep")) {
                            break;
                        }
                        else {
                            goto label_851;
                        }
                    }
                    else {
                        goto label_1052;
                    }

                    goto label_1074;
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            try {
                this.zzjf();
                v13_3 = zzjz.zzb(v12_6, "_en");
                v14_2 = ((Map)v4_3).get(v13_3);
                if(v14_2 == null) {
                    zzet v14_3 = this.zzjh().zzf(v2.zzasp.zzth, ((String)v13_3));
                    ((Map)v4_3).put(v13_3, v14_3);
                }

                if(((zzet)v14_2).zzahl != null) {
                    goto label_846;
                }

                if(((zzet)v14_2).zzahm.longValue() > 1) {
                    this.zzjf();
                    v38 = v7_4;
                    v12_6.zzava = zzjz.zza(v12_6.zzava, "_sr", ((zzet)v14_2).zzahm);
                }
                else {
                    v38 = v7_4;
                }

                if(((zzet)v14_2).zzahn == null || !((zzet)v14_2).zzahn.booleanValue()) {
                    v39 = v9;
                }
                else {
                    this.zzjf();
                    v39 = v9;
                    v12_6.zzava = zzjz.zza(v12_6.zzava, "_efs", Long.valueOf(1));
                }

                v7_1 = v11 + 1;
                v5_10[v11] = v12_6;
                goto label_840;
            }
            catch(Throwable v0) {
                goto label_1269;
            }

        label_846:
            v38 = v7_4;
            v39 = v9;
            v56 = v2;
            SecureRandom v54 = v6_6;
            goto label_843;
        label_851:
            v38 = v7_4;
            v39 = v9;
            try {
                String v7_5 = "_dbg";
                Long v9_1 = Long.valueOf(1);
                if(!TextUtils.isEmpty(((CharSequence)v7_5))) {
                }
                else {
                    goto label_891;
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            if(v9_1 == null) {
                goto label_891;
            }
            else {
                try {
                    zzks[] v13_4 = v12_6.zzava;
                    int v14_4 = v13_4.length;
                    int v15_4 = 0;
                    while(true) {
                        if(v15_4 < v14_4) {
                            int v40 = v14_4;
                            zzks v14_5 = v13_4[v15_4];
                            zzks[] v41 = v13_4;
                            if(v7_5.equals(v14_5.name)) {
                                if((!(v9_1 instanceof Long) || !v9_1.equals(v14_5.zzave)) && (!(v9_1 instanceof String) || !v9_1.equals(v14_5.zzale))) {
                                    if(!(v9_1 instanceof Double)) {
                                        break;
                                    }

                                    if(!v9_1.equals(v14_5.zzasw)) {
                                        break;
                                    }
                                }

                                v7_1 = 1;
                            }
                            else {
                                ++v15_4;
                                v14_4 = v40;
                                v13_4 = v41;
                                continue;
                            }
                        }
                        else {
                            break;
                        }

                        goto label_892;
                    }

                label_891:
                    v7_1 = 0;
                label_892:
                    v7_1 = v7_1 == 0 ? this.zzky().zzp(v2.zzasp.zzth, v12_6.name) : 1;
                    if(v7_1 > 0) {
                        goto label_911;
                    }

                    v1.zzacv.zzgi().zziy().zze("Sample rate must be positive. event, rate", v12_6.name, Integer.valueOf(v7_1));
                    v7_1 = v11 + 1;
                    v5_10[v11] = v12_6;
                    goto label_840;
                }
                catch(Throwable v0) {
                    goto label_1269;
                }
            }

            goto label_892;
            try {
            label_911:
                Object v9_2 = ((Map)v4_3).get(v12_6.name);
                if(v9_2 == null) {
                    goto label_914;
                }

                goto label_945;
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            try {
            label_914:
                v9_3 = this.zzjh().zzf(v2.zzasp.zzth, v12_6.name);
                if(v9_3 == null) {
                    v1.zzacv.zzgi().zziy().zze("Event being bundled has no eventAggregate. appId, eventName", v2.zzasp.zzth, v12_6.name);
                    v40_1 = new zzet(v2.zzasp.zzth, v12_6.name, 1, 1, v12_6.zzavb.longValue(), 0, null, null, null);
                    goto label_944;
                }

                goto label_945;
            }
            catch(Throwable v0) {
                goto label_1269;
            }

        label_944:
            v9_3 = v40_1;
            try {
            label_945:
                this.zzjf();
                v13_3 = zzjz.zzb(v12_6, "_eid");
                boolean v14_6 = v13_3 != null ? true : false;
                Boolean v14_7 = Boolean.valueOf(v14_6);
                if(v7_1 != 1) {
                    goto label_970;
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            v7_1 = v11 + 1;
            try {
                v5_10[v11] = v12_6;
                if(!v14_7.booleanValue()) {
                    goto label_840;
                }

                if(v9_3.zzahl == null && v9_3.zzahm == null && v9_3.zzahn == null) {
                    goto label_840;
                }

                ((Map)v4_3).put(v12_6.name, v9_3.zza(null, null, null));
            }
            catch(Throwable v0) {
                goto label_1269;
            }

        label_840:
            v56 = v2;
            v54 = v6_6;
            v11 = v7_1;
        label_843:
            v55 = v8_2;
            goto label_1044;
            try {
            label_970:
                if(v6_6.nextInt(v7_1) != 0) {
                    goto label_996;
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            try {
                this.zzjf();
                v54 = v6_6;
                v6_2 = ((long)v7_1);
                v55 = v8_2;
                v12_6.zzava = zzjz.zza(v12_6.zzava, "_sr", Long.valueOf(v6_2));
                int v8_3 = v11 + 1;
                v5_10[v11] = v12_6;
                if(v14_7.booleanValue()) {
                    v9_3 = v9_3.zza(null, Long.valueOf(v6_2), null);
                }

                ((Map)v4_3).put(v12_6.name, v9_3.zzai(v12_6.zzavb.longValue()));
                v56 = v2;
                v11 = v8_3;
                goto label_1044;
            }
            catch(Throwable v0) {
                goto label_1269;
            }

        label_996:
            v56 = v2;
            v54 = v6_6;
            v55 = v8_2;
            try {
                if(Math.abs(v12_6.zzavb.longValue() - v9_3.zzahk) >= 86400000) {
                    this.zzjf();
                    v12_6.zzava = zzjz.zza(v12_6.zzava, "_efs", Long.valueOf(1));
                    this.zzjf();
                    v6_2 = ((long)v7_1);
                    v12_6.zzava = zzjz.zza(v12_6.zzava, "_sr", Long.valueOf(v6_2));
                    v1_2 = v11 + 1;
                    v5_10[v11] = v12_6;
                    if(v14_7.booleanValue()) {
                        v9_3 = v9_3.zza(null, Long.valueOf(v6_2), Boolean.valueOf(true));
                    }

                    ((Map)v4_3).put(v12_6.name, v9_3.zzai(v12_6.zzavb.longValue()));
                    v11 = v1_2;
                    goto label_1044;
                }

                if(v14_7.booleanValue()) {
                    ((Map)v4_3).put(v12_6.name, v9_3.zza(((Long)v13_3), null, null));
                }

            label_1044:
                ++v10;
                v7_4 = v38;
                v9 = v39;
                v6_6 = v54;
                v8_2 = v55;
                v2 = v56;
                v1 = this;
                goto label_792;
            label_1052:
                v56 = v2;
                v55 = v8_2;
                if(v11 < v3_6.zzavi.length) {
                    v3_6.zzavi = Arrays.copyOf(((Object[])v5_10), v11);
                }

                Iterator v1_3 = ((Map)v4_3).entrySet().iterator();
                while(v1_3.hasNext()) {
                    this.zzjh().zza(v1_3.next().getValue());
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

        label_1074:
            long v1_4 = 0x7FFFFFFFFFFFFFFFL;
            try {
                v3_6.zzavl = Long.valueOf(v1_4);
                v3_6.zzavm = Long.valueOf(-9223372036854775808L);
                v1_2 = 0;
            label_1081:
                while(v1_2 >= v3_6.zzavi.length) {
                    goto label_1102;
                }
            }
            catch(Throwable v0) {
                goto label_1249;
            }

            try {
                zzkr v2_1 = v3_6.zzavi[v1_2];
                if(v2_1.zzavb.longValue() < v3_6.zzavl.longValue()) {
                    v3_6.zzavl = v2_1.zzavb;
                }

                if(v2_1.zzavb.longValue() > v3_6.zzavm.longValue()) {
                    v3_6.zzavm = v2_1.zzavb;
                }
            }
            catch(Throwable v0) {
                goto label_1069;
            }

            ++v1_2;
            goto label_1081;
        label_1102:
            zza v1_5 = v56;
            try {
                v2_2 = v1_5.zzasp.zzth;
                v4_4 = this.zzjh().zzbf(v2_2);
                if(v4_4 == null) {
                }
                else {
                    goto label_1118;
                }
            }
            catch(Throwable v0) {
                goto label_1249;
            }

            zzjt v5_11 = this;
            try {
                v5_11.zzacv.zzgi().zziv().zzg("Bundling raw events w/o app info. appId", zzfi.zzbp(v1_5.zzasp.zzth));
                goto label_1154;
            label_1118:
                v5_11 = this;
                if(v3_6.zzavi.length > 0) {
                    v6_2 = v4_4.zzgt();
                    Long v8_4 = v6_2 != 0 ? Long.valueOf(v6_2) : null;
                    v3_6.zzavo = v8_4;
                    long v8_5 = v4_4.zzgs();
                    long v10_2 = 0;
                    if(v8_5 == v10_2) {
                    }
                    else {
                        v6_2 = v8_5;
                    }

                    Long v6_7 = v6_2 != v10_2 ? Long.valueOf(v6_2) : null;
                    v3_6.zzavn = v6_7;
                    v4_4.zzhb();
                    v3_6.zzavy = Integer.valueOf(((int)v4_4.zzgy()));
                    v4_4.zzr(v3_6.zzavl.longValue());
                    v4_4.zzs(v3_6.zzavm.longValue());
                    v3_6.zzafy = v4_4.zzhj();
                    this.zzjh().zza(v4_4);
                }

            label_1154:
                if(v3_6.zzavi.length > 0) {
                    v5_11.zzacv.zzgl();
                    zzkn v4_5 = this.zzky().zzbx(v1_5.zzasp.zzth);
                    if(v4_5 != null && v4_5.zzaum != null) {
                        v4_6 = v4_5.zzaum;
                        goto label_1168;
                    }
                    else if(TextUtils.isEmpty(v1_5.zzasp.zzafa)) {
                        v4_6 = Long.valueOf(-1);
                    label_1168:
                        v3_6.zzawf = v4_6;
                    }
                    else {
                        v5_11.zzacv.zzgi().zziy().zzg("Did not find measurement config or missing version info. appId", zzfi.zzbp(v1_5.zzasp.zzth));
                    }

                    this.zzjh().zza(v3_6, v55);
                }

                zzek v3_7 = this.zzjh();
                List v1_6 = v1_5.zzasq;
                Preconditions.checkNotNull(v1_6);
                ((zzhi)v3_7).zzab();
                ((zzjs)v3_7).zzch();
                StringBuilder v4_7 = new StringBuilder("rowid in (");
                for(v6_3 = 0; v6_3 < v1_6.size(); ++v6_3) {
                    if(v6_3 != 0) {
                        v4_7.append(",");
                    }

                    v4_7.append(v1_6.get(v6_3).longValue());
                }

                v4_7.append(")");
                int v4_8 = v3_7.getWritableDatabase().delete("raw_events", v4_7.toString(), null);
                if(v4_8 != v1_6.size()) {
                    ((zzhi)v3_7).zzgi().zziv().zze("Deleted fewer rows from raw events table than expected", Integer.valueOf(v4_8), Integer.valueOf(v1_6.size()));
                }

                v1_7 = this.zzjh();
                v3_8 = v1_7.getWritableDatabase();
            }
            catch(Throwable v0) {
                goto label_1265;
            }

            try {
                v3_8.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{v2_2, v2_2});
                goto label_1241;
            }
            catch(Throwable v0) {
            }
            catch(SQLiteException v0_1) {
                v3_5 = v0_1;
                try {
                    ((zzhi)v1_7).zzgi().zziv().zze("Failed to remove unused event metadata. appId", zzfi.zzbp(v2_2), v3_5);
                label_1241:
                    this.zzjh().setTransactionSuccessful();
                }
                catch(Throwable v0) {
                    goto label_1265;
                }

                this.zzjh().endTransaction();
                return 1;
            label_1249:
                goto label_1269;
            label_1069:
                v1_1 = v0;
                goto label_1270;
                try {
                label_1251:
                    this.zzjh().setTransactionSuccessful();
                }
                catch(Throwable v0) {
                    goto label_1265;
                }

                this.zzjh().endTransaction();
                return 0;
            label_226:
                v21 = v5_3;
            label_272:
                v1_1 = v0;
            label_1261:
                if(v21 != null) {
                    try {
                        v21.close();
                    label_1266:
                        throw v1_1;
                    label_1265:
                        goto label_1269;
                    }
                    catch(Throwable v0) {
                        goto label_1265;
                    }
                }

                goto label_1266;
            }
        }
        catch(IOException v0_2) {
            try {
                ((zzhi)v4).zzgi().zziv().zze("Data loss. Failed to merge raw event. appId", zzfi.zzbp(((String)v3_2)), v0_2);
                goto label_221;
            label_204:
                v12_6.name = v5_3.getString(1);
                v12_6.zzavb = Long.valueOf(v5_3.getLong(2));
                if(!((zzem)v2).zza(v6_2, v12_6)) {
                    if(v5_3 == null) {
                        goto label_285;
                    }

                    goto label_195;
                }

            label_221:
                if(v5_3.moveToNext()) {
                    goto label_197;
                }
            }
            catch(SQLiteException v0_1) {
                goto label_230;
            }
            catch(Throwable v0) {
                goto label_226;
            }

            if(v5_3 == null) {
                goto label_285;
            }

            try {
            label_195:
                v5_3.close();
                goto label_285;
            }
            catch(Throwable v0) {
            }
        }

    label_1269:
        v1_1 = v0;
    label_1270:
        this.zzjh().endTransaction();
        throw v1_1;
    }

    final void zze(zzeb arg2) {
        this.zzab();
        this.zzlc();
        Preconditions.checkNotEmpty(arg2.packageName);
        this.zzg(arg2);
    }

    @WorkerThread final void zze(zzef arg2) {
        zzeb v0 = this.zzce(arg2.packageName);
        if(v0 != null) {
            this.zzb(arg2, v0);
        }
    }

    @WorkerThread final void zzf(zzef arg2) {
        zzeb v0 = this.zzce(arg2.packageName);
        if(v0 != null) {
            this.zzc(arg2, v0);
        }
    }

    @WorkerThread final void zzf(zzeb arg19) {
        Bundle v0_11;
        ApplicationInfo v0_10;
        PackageInfo v0_9;
        zzet v0_7;
        String v7_3;
        zzek v0_6;
        zzex v7_2;
        Bundle v7_1;
        String v8;
        zzea v16;
        int v15;
        zzjt v1 = this;
        zzeb v2 = arg19;
        this.zzab();
        this.zzlc();
        Preconditions.checkNotNull(arg19);
        Preconditions.checkNotEmpty(v2.packageName);
        if(TextUtils.isEmpty(v2.zzafa)) {
            return;
        }

        zzea v0 = this.zzjh().zzbf(v2.packageName);
        long v3 = 0;
        if(v0 != null && (TextUtils.isEmpty(v0.getGmpAppId())) && !TextUtils.isEmpty(v2.zzafa)) {
            v0.zzx(v3);
            this.zzjh().zza(v0);
            this.zzky().zzca(v2.packageName);
        }

        if(!v2.zzafk) {
            this.zzg(arg19);
            return;
        }

        long v5 = v2.zzaga;
        if(v5 == v3) {
            v5 = v1.zzacv.zzbt().currentTimeMillis();
        }

        int v0_1 = v2.zzagb;
        if(v0_1 == 0 || v0_1 == 1) {
            v15 = v0_1;
        }
        else {
            v1.zzacv.zzgi().zziy().zze("Incorrect app type, assuming installed app. appId, appType", zzfi.zzbp(v2.packageName), Integer.valueOf(v0_1));
            v15 = 0;
        }

        this.zzjh().beginTransaction();
        try {
            v0 = this.zzjh().zzbf(v2.packageName);
            v16 = null;
            if(v0 == null) {
                goto label_131;
            }

            if(v0.getGmpAppId() == null) {
                goto label_131;
            }

            if(v0.getGmpAppId().equals(v2.zzafa)) {
                goto label_131;
            }

            v1.zzacv.zzgi().zziy().zzg("New GMP App Id passed in. Removing cached database data. appId", zzfi.zzbp(v0.zzah()));
            zzek v7 = this.zzjh();
            v8 = v0.zzah();
            ((zzjs)v7).zzch();
            ((zzhi)v7).zzab();
            Preconditions.checkNotEmpty(v8);
            try {
                SQLiteDatabase v0_4 = v7.getWritableDatabase();
                String[] v9 = new String[]{v8};
                int v10 = v0_4.delete("events", "app_id=?", v9) + v0_4.delete("user_attributes", "app_id=?", v9) + v0_4.delete("conditional_properties", "app_id=?", v9) + v0_4.delete("apps", "app_id=?", v9) + v0_4.delete("raw_events", "app_id=?", v9) + v0_4.delete("raw_events_metadata", "app_id=?", v9) + v0_4.delete("event_filters", "app_id=?", v9) + v0_4.delete("property_filters", "app_id=?", v9) + v0_4.delete("audience_filter_values", "app_id=?", v9);
                if(v10 <= 0) {
                    goto label_130;
                }

                ((zzhi)v7).zzgi().zzjc().zze("Deleted application data. app, records", v8, Integer.valueOf(v10));
                goto label_130;
            }
            catch(SQLiteException v0_3) {
                try {
                    ((zzhi)v7).zzgi().zziv().zze("Error deleting application data. appId, error", zzfi.zzbp(v8), v0_3);
                label_130:
                    v0 = v16;
                label_131:
                    if(v0 != null) {
                        if(v0.zzgu() == -2147483648) {
                            goto label_154;
                        }
                        else if(v0.zzgu() != v2.zzafg) {
                            v7_1 = new Bundle();
                            v7_1.putString("_pv", v0.zzag());
                            v7_2 = new zzex("_au", new zzeu(v7_1), "auto", v5);
                            goto label_151;
                        }
                        else {
                        }
                    }

                    goto label_175;
                }
                catch(Throwable v0_2) {
                    goto label_410;
                }
            }
        }
        catch(Throwable v0_2) {
            goto label_410;
        }

    label_151:
        zzex v0_5 = v7_2;
        goto label_152;
        try {
        label_154:
            if(v0.zzag() == null) {
                goto label_175;
            }
            else if(!v0.zzag().equals(v2.zztg)) {
                v7_1 = new Bundle();
                v7_1.putString("_pv", v0.zzag());
                v0_5 = new zzex("_au", new zzeu(v7_1), "auto", v5);
            }
            else {
                goto label_175;
            }

        label_152:
            v1.zzb(v0_5, v2);
        label_175:
            this.zzg(arg19);
            if(v15 == 0) {
                v0_6 = this.zzjh();
                v7_3 = v2.packageName;
                v8 = "_f";
                goto label_180;
            }
            else if(v15 == 1) {
                v0_6 = this.zzjh();
                v7_3 = v2.packageName;
                v8 = "_v";
            label_180:
                v0_7 = v0_6.zzf(v7_3, v8);
            }
            else {
                v0_7 = ((zzet)v16);
            }

            if(v0_7 != null) {
                goto label_389;
            }

            long v11 = 1;
            long v9_1 = (v5 / 3600000 + v11) * 3600000;
            if(v15 != 0) {
                goto label_335;
            }

            long v13 = v11;
            v1.zzb(new zzka("_fot", v5, Long.valueOf(v9_1), "auto"), v2);
            this.zzab();
            this.zzlc();
            Bundle v15_1 = new Bundle();
            v15_1.putLong("_c", v13);
            v15_1.putLong("_r", v13);
            v15_1.putLong("_uwa", v3);
            v15_1.putLong("_pfo", v3);
            v15_1.putLong("_sys", v3);
            v15_1.putLong("_sysu", v3);
            if((v1.zzacv.zzgk().zzbc(v2.packageName)) && (v2.zzagc)) {
                v15_1.putLong("_dac", v13);
            }

            if(v1.zzacv.getContext().getPackageManager() == null) {
                v1.zzacv.zzgi().zziv().zzg("PackageManager is null, first open report might be inaccurate. appId", zzfi.zzbp(v2.packageName));
                goto label_313;
            }

            try {
                v0_9 = Wrappers.packageManager(v1.zzacv.getContext()).getPackageInfo(v2.packageName, 0);
                goto label_260;
            }
            catch(PackageManager$NameNotFoundException v0_8) {
                try {
                    v1.zzacv.zzgi().zziv().zze("Package info is null, first open report might be inaccurate. appId", zzfi.zzbp(v2.packageName), v0_8);
                    v0_9 = ((PackageInfo)v16);
                label_260:
                    if(v0_9 != null && v0_9.firstInstallTime != v3) {
                        if(v0_9.firstInstallTime != v0_9.lastUpdateTime) {
                            v15_1.putLong("_uwa", v13);
                            v0_1 = 0;
                        }
                        else {
                            v0_1 = 1;
                        }

                        zzka v12 = null;
                        v8 = "_fi";
                        v9_1 = v0_1 != 0 ? v13 : v3;
                        super(v8, v5, Long.valueOf(v9_1), "auto");
                        v1.zzb(v12, v2);
                    }

                    try {
                        v0_10 = Wrappers.packageManager(v1.zzacv.getContext()).getApplicationInfo(v2.packageName, 0);
                        goto label_301;
                    }
                    catch(PackageManager$NameNotFoundException v0_8) {
                        try {
                            v1.zzacv.zzgi().zziv().zze("Application info is null, first open report might be inaccurate. appId", zzfi.zzbp(v2.packageName), v0_8);
                            v0_10 = ((ApplicationInfo)v16);
                        label_301:
                            if(v0_10 != null) {
                                if((v0_10.flags & 1) != 0) {
                                    v15_1.putLong("_sys", v13);
                                }

                                if((v0_10.flags & 0x80) == 0) {
                                    goto label_313;
                                }

                                v15_1.putLong("_sysu", v13);
                            }

                        label_313:
                            v0_6 = this.zzjh();
                            String v3_1 = v2.packageName;
                            Preconditions.checkNotEmpty(v3_1);
                            ((zzhi)v0_6).zzab();
                            ((zzjs)v0_6).zzch();
                            v3 = v0_6.zzm(v3_1, "first_open_count");
                            if(v3 >= 0) {
                                v15_1.putLong("_pfo", v3);
                            }

                            v1.zzb(new zzex("_f", new zzeu(v15_1), "auto", v5), v2);
                            goto label_374;
                        label_335:
                            v13 = v11;
                            if(v15 == 1) {
                                v1.zzb(new zzka("_fvt", v5, Long.valueOf(v9_1), "auto"), v2);
                                this.zzab();
                                this.zzlc();
                                v0_11 = new Bundle();
                                v0_11.putLong("_c", v13);
                                v0_11.putLong("_r", v13);
                                if((v1.zzacv.zzgk().zzbc(v2.packageName)) && (v2.zzagc)) {
                                    v0_11.putLong("_dac", v13);
                                }

                                v1.zzb(new zzex("_v", new zzeu(v0_11), "auto", v5), v2);
                            }

                        label_374:
                            v0_11 = new Bundle();
                            v0_11.putLong("_et", v13);
                            v7_2 = new zzex("_e", new zzeu(v0_11), "auto", v5);
                        }
                        catch(Throwable v0_2) {
                            goto label_410;
                        }
                    }
                }
                catch(Throwable v0_2) {
                    goto label_410;
                }
            }
        }
        catch(Throwable v0_2) {
            goto label_410;
        }

        zzex v3_2 = v7_2;
        goto label_387;
        try {
        label_389:
            if(v2.zzafz) {
                v3_2 = new zzex("_cd", new zzeu(new Bundle()), "auto", v5);
            label_387:
                v1.zzb(v3_2, v2);
            }

            this.zzjh().setTransactionSuccessful();
        }
        catch(Throwable v0_2) {
        label_410:
            this.zzjh().endTransaction();
            throw v0_2;
        }

        this.zzjh().endTransaction();
    }

    public static zzjt zzg(Context arg2) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg2.getApplicationContext());
        if(zzjt.zzarr == null) {
            Class v0 = zzjt.class;
            __monitor_enter(v0);
            try {
                if(zzjt.zzarr == null) {
                    zzjt.zzarr = new zzjt(new zzjy(arg2));
                }

                __monitor_exit(v0);
                goto label_19;
            label_17:
                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                goto label_17;
            }

            throw v2;
        }

    label_19:
        return zzjt.zzarr;
    }

    @WorkerThread final void zzg(Runnable arg2) {
        this.zzab();
        if(this.zzasb == null) {
            this.zzasb = new ArrayList();
        }

        this.zzasb.add(arg2);
    }

    @WorkerThread private final zzea zzg(zzeb arg8) {
        int v1_1;
        this.zzab();
        this.zzlc();
        Preconditions.checkNotNull(arg8);
        Preconditions.checkNotEmpty(arg8.packageName);
        zzea v0 = this.zzjh().zzbf(arg8.packageName);
        String v1 = this.zzacv.zzgj().zzbs(arg8.packageName);
        if(v0 == null) {
            v0 = new zzea(this.zzacv, arg8.packageName);
            v0.zzam(this.zzacv.zzfz().zzir());
            v0.zzao(v1);
            goto label_23;
        }
        else if(!v1.equals(v0.zzgq())) {
            v0.zzao(v1);
            v0.zzam(this.zzacv.zzfz().zzir());
        label_23:
            v1_1 = 1;
        }
        else {
            v1_1 = 0;
        }

        if(!TextUtils.isEmpty(arg8.zzafa) && !arg8.zzafa.equals(v0.getGmpAppId())) {
            v0.zzan(arg8.zzafa);
            v1_1 = 1;
        }

        if(!TextUtils.isEmpty(arg8.zzafc) && !arg8.zzafc.equals(v0.zzgr())) {
            v0.zzap(arg8.zzafc);
            v1_1 = 1;
        }

        if(arg8.zzafi != 0 && arg8.zzafi != v0.zzgw()) {
            v0.zzu(arg8.zzafi);
            v1_1 = 1;
        }

        if(!TextUtils.isEmpty(arg8.zztg) && !arg8.zztg.equals(v0.zzag())) {
            v0.setAppVersion(arg8.zztg);
            v1_1 = 1;
        }

        if(arg8.zzafg != v0.zzgu()) {
            v0.zzt(arg8.zzafg);
            v1_1 = 1;
        }

        if(arg8.zzafh != null && !arg8.zzafh.equals(v0.zzgv())) {
            v0.zzaq(arg8.zzafh);
            v1_1 = 1;
        }

        if(arg8.zzafj != v0.zzgx()) {
            v0.zzv(arg8.zzafj);
            v1_1 = 1;
        }

        if(arg8.zzafk != v0.isMeasurementEnabled()) {
            v0.setMeasurementEnabled(arg8.zzafk);
            v1_1 = 1;
        }

        if(!TextUtils.isEmpty(arg8.zzafy) && !arg8.zzafy.equals(v0.zzhi())) {
            v0.zzar(arg8.zzafy);
            v1_1 = 1;
        }

        if(arg8.zzafl != v0.zzhk()) {
            v0.zzaf(arg8.zzafl);
            v1_1 = 1;
        }

        if(arg8.zzafm != v0.zzhl()) {
            v0.zzd(arg8.zzafm);
            v1_1 = 1;
        }

        if(arg8.zzafn != v0.zzhm()) {
            v0.zze(arg8.zzafn);
            v1_1 = 1;
        }

        if(v1_1 != 0) {
            this.zzjh().zza(v0);
        }

        return v0;
    }

    public final zzfg zzgf() {
        return this.zzacv.zzgf();
    }

    public final zzkd zzgg() {
        return this.zzacv.zzgg();
    }

    public final zzgi zzgh() {
        return this.zzacv.zzgh();
    }

    public final zzfi zzgi() {
        return this.zzacv.zzgi();
    }

    public final zzeh zzgk() {
        return this.zzacv.zzgk();
    }

    public final zzee zzgl() {
        return this.zzacv.zzgl();
    }

    final String zzh(zzeb arg5) {
        Future v0 = this.zzacv.zzgh().zzb(new zzjx(this, arg5));
        long v1 = 30000;
        try {
            return v0.get(v1, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException v0_1) {
            this.zzacv.zzgi().zziv().zze("Failed to get app instance id. appId", zzfi.zzbp(arg5.packageName), v0_1);
            return null;
        }
    }

    public final zzjz zzjf() {
        zzjt.zza(this.zzary);
        return this.zzary;
    }

    public final zzed zzjg() {
        zzjt.zza(this.zzarx);
        return this.zzarx;
    }

    public final zzek zzjh() {
        zzjt.zza(this.zzaru);
        return this.zzaru;
    }

    private final zzgh zzky() {
        zzjt.zza(this.zzars);
        return this.zzars;
    }

    public final zzfm zzkz() {
        zzjt.zza(this.zzart);
        return this.zzart;
    }

    private final zzfr zzla() {
        if(this.zzarv != null) {
            return this.zzarv;
        }

        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjp zzlb() {
        zzjt.zza(this.zzarw);
        return this.zzarw;
    }

    final void zzlc() {
        if(this.zzvn) {
            return;
        }

        throw new IllegalStateException("UploadController is not initialized");
    }

    private final long zzld() {
        long v0 = this.zzacv.zzbt().currentTimeMillis();
        zzft v2 = this.zzacv.zzgj();
        ((zzhj)v2).zzch();
        ((zzhi)v2).zzab();
        long v3 = v2.zzalx.get();
        if(v3 == 0) {
            v3 = 1 + (((long)((zzhi)v2).zzgg().zzlo().nextInt(86400000)));
            v2.zzalx.set(v3);
        }

        return (v0 + v3) / 1000 / 60 / 60 / 24;
    }

    @WorkerThread final void zzle() {
        Object v8;
        String v3_1;
        zzfk v0_1;
        zzjt v1 = this;
        this.zzab();
        this.zzlc();
        v1.zzasg = true;
        try {
            v1.zzacv.zzgl();
            Boolean v3 = v1.zzacv.zzga().zzkr();
            if(v3 == null) {
                v0_1 = v1.zzacv.zzgi().zziy();
                v3_1 = "Upload data called on the client side before use of service was decided";
            }
            else if(v3.booleanValue()) {
                v0_1 = v1.zzacv.zzgi().zziv();
                v3_1 = "Upload called in the client side when service should be used";
            }
            else {
                long v5 = 0;
                if(v1.zzasa <= v5) {
                    this.zzab();
                    int v3_2 = v1.zzasj != null ? 1 : 0;
                    if(v3_2 == 0) {
                        goto label_44;
                    }

                    v0_1 = v1.zzacv.zzgi().zzjc();
                    v3_1 = "Uploading requested multiple times";
                    goto label_16;
                }

                goto label_30;
            }

        label_16:
            v0_1.log(v3_1);
            goto label_17;
        label_44:
            if(!this.zzkz().zzex()) {
                v1.zzacv.zzgi().zzjc().log("Network not connected, ignoring upload request");
            label_30:
                this.zzlg();
                goto label_17;
            }

            long v3_3 = v1.zzacv.zzbt().currentTimeMillis();
            String v9 = null;
            v1.zzd(v9, v3_3 - zzeh.zzhr());
            long v7 = v1.zzacv.zzgj().zzalt.get();
            if(v7 != v5) {
                v1.zzacv.zzgi().zzjb().zzg("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(v3_3 - v7)));
            }

            String v5_1 = this.zzjh().zzhv();
            v7 = -1;
            if(TextUtils.isEmpty(((CharSequence)v5_1))) {
                goto label_247;
            }

            if(v1.zzasl == v7) {
                v1.zzasl = this.zzjh().zzic();
            }

            List v6 = this.zzjh().zzb(v5_1, v1.zzacv.zzgk().zzb(v5_1, zzez.zzaik), Math.max(0, v1.zzacv.zzgk().zzb(v5_1, zzez.zzail)));
            if(v6.isEmpty()) {
                goto label_17;
            }

            Iterator v7_1 = v6.iterator();
            do {
                if(v7_1.hasNext()) {
                    v8 = v7_1.next().first;
                    if(TextUtils.isEmpty(((zzku)v8).zzavv)) {
                        continue;
                    }

                    break;
                }
                else {
                    goto label_108;
                }
            }
            while(true);

            String v7_2 = ((zzku)v8).zzavv;
            goto label_109;
        label_108:
            v7_2 = v9;
        label_109:
            if(v7_2 != null) {
                int v8_1;
                for(v8_1 = 0; v8_1 < v6.size(); ++v8_1) {
                    Object v10 = v6.get(v8_1).first;
                    if(!TextUtils.isEmpty(((zzku)v10).zzavv) && !((zzku)v10).zzavv.equals(v7_2)) {
                        v6 = v6.subList(0, v8_1);
                        break;
                    }
                }
            }

            zzkt v7_3 = new zzkt();
            v7_3.zzavf = new zzku[v6.size()];
            ArrayList v8_2 = new ArrayList(v6.size());
            int v10_1 = !zzeh.zzht() || !v1.zzacv.zzgk().zzau(v5_1) ? 0 : 1;
            int v11;
            for(v11 = 0; v11 < v7_3.zzavf.length; ++v11) {
                v7_3.zzavf[v11] = v6.get(v11).first;
                ((List)v8_2).add(v6.get(v11).second);
                v7_3.zzavf[v11].zzavu = Long.valueOf(v1.zzacv.zzgk().zzgw());
                v7_3.zzavf[v11].zzavk = Long.valueOf(v3_3);
                zzku v12 = v7_3.zzavf[v11];
                v1.zzacv.zzgl();
                v12.zzavz = Boolean.valueOf(false);
                if(v10_1 == 0) {
                    v7_3.zzavf[v11].zzawh = v9;
                }
            }

            if(v1.zzacv.zzgi().isLoggable(2)) {
                v9 = this.zzjf().zzb(v7_3);
            }

            byte[] v14 = this.zzjf().zza(v7_3);
            Object v6_1 = zzez.zzaiu.get();
            try {
                URL v13 = new URL(((String)v6_1));
                Preconditions.checkArgument(((List)v8_2).isEmpty() ^ 1);
                if(v1.zzasj != null) {
                    v1.zzacv.zzgi().zziv().log("Set uploading progress before finishing the previous upload");
                }
                else {
                    v1.zzasj = new ArrayList(((Collection)v8_2));
                }

                v1.zzacv.zzgj().zzalu.set(v3_3);
                v3_1 = "?";
                if(v7_3.zzavf.length > 0) {
                    v3_1 = v7_3.zzavf[0].zzth;
                }

                v1.zzacv.zzgi().zzjc().zzd("Uploading data. app, uncompressed size, data", v3_1, Integer.valueOf(v14.length), v9);
                v1.zzasf = true;
                zzfm v11_1 = this.zzkz();
                zzjv v0_2 = new zzjv(v1, v5_1);
                ((zzhi)v11_1).zzab();
                ((zzjs)v11_1).zzch();
                Preconditions.checkNotNull(v13);
                Preconditions.checkNotNull(v14);
                Preconditions.checkNotNull(v0_2);
                ((zzhi)v11_1).zzgh().zzd(new zzfq(v11_1, v5_1, v13, v14, null, v0_2));
            }
            catch(MalformedURLException ) {
                v1.zzacv.zzgi().zziv().zze("Failed to parse upload URL. Not uploading. appId", zzfi.zzbp(v5_1), v6_1);
            }

            goto label_17;
        label_247:
            v1.zzasl = v7;
            String v0_3 = this.zzjh().zzag(v3_3 - zzeh.zzhr());
            if(TextUtils.isEmpty(((CharSequence)v0_3))) {
                goto label_17;
            }

            zzea v0_4 = this.zzjh().zzbf(v0_3);
            if(v0_4 == null) {
                goto label_17;
            }

            v1.zzb(v0_4);
        }
        catch(Throwable v0) {
            v1.zzasg = false;
            this.zzlh();
            throw v0;
        }

    label_17:
        v1.zzasg = false;
        this.zzlh();
    }

    private final boolean zzlf() {
        this.zzab();
        this.zzlc();
        if(!this.zzjh().zzia()) {
            if(!TextUtils.isEmpty(this.zzjh().zzhv())) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    @WorkerThread private final void zzlg() {
        long v8;
        com.google.android.gms.internal.measurement.zzez$zza v9_1;
        long v5;
        zzjt v0 = this;
        this.zzab();
        this.zzlc();
        if(!this.zzlk()) {
            return;
        }

        long v3 = 0;
        if(v0.zzasa > v3) {
            v5 = 3600000 - Math.abs(v0.zzacv.zzbt().elapsedRealtime() - v0.zzasa);
            if(v5 > v3) {
                v0.zzacv.zzgi().zzjc().zzg("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(v5));
                this.zzla().unregister();
                this.zzlb().cancel();
                return;
            }
            else {
                v0.zzasa = v3;
            }
        }

        if(v0.zzacv.zzkg()) {
            if(!this.zzlf()) {
            }
            else {
                long v1 = v0.zzacv.zzbt().currentTimeMillis();
                v5 = Math.max(v3, zzez.zzaje.get().longValue());
                int v7 = (this.zzjh().zzib()) || (this.zzjh().zzhw()) ? 1 : 0;
                if(v7 != 0) {
                    String v9 = v0.zzacv.zzgk().zzhs();
                    if(!TextUtils.isEmpty(((CharSequence)v9)) && !".none.".equals(v9)) {
                        v9_1 = zzez.zzaiz;
                        goto label_67;
                    }

                    v9_1 = zzez.zzaiy;
                }
                else {
                    v9_1 = zzez.zzaix;
                }

            label_67:
                long v9_2 = Math.max(v3, v9_1.get().longValue());
                long v11 = v0.zzacv.zzgj().zzalt.get();
                long v13 = v0.zzacv.zzgj().zzalu.get();
                long v16 = v9_2;
                long v18 = v5;
                v5 = Math.max(this.zzjh().zzhy(), this.zzjh().zzhz());
                if(v5 != v3) {
                    v5 = v1 - Math.abs(v5 - v1);
                    v8 = v1 - Math.abs(v11 - v1);
                    v1 -= Math.abs(v13 - v1);
                    v8 = Math.max(v8, v1);
                    long v10 = v5 + v18;
                    if(v7 != 0 && v8 > v3) {
                        v10 = Math.min(v5, v8) + v16;
                    }

                    long v12 = v16;
                    if(!this.zzjf().zza(v8, v12)) {
                        v8 += v12;
                    }
                    else {
                        v8 = v10;
                    }

                    if(v1 == v3) {
                        goto label_134;
                    }

                    if(v1 < v5) {
                        goto label_134;
                    }

                    int v5_1;
                    for(v5_1 = 0; true; ++v5_1) {
                        if(v5_1 >= Math.min(20, Math.max(0, zzez.zzajg.get().intValue()))) {
                            goto label_86;
                        }

                        v8 += Math.max(v3, zzez.zzajf.get().longValue()) * (1 << v5_1);
                        if(v8 > v1) {
                            break;
                        }
                    }
                }
                else {
                label_86:
                    v8 = v3;
                }

            label_134:
                if(v8 == v3) {
                    v0.zzacv.zzgi().zzjc().log("Next upload time is 0");
                    this.zzla().unregister();
                    this.zzlb().cancel();
                    return;
                }

                if(!this.zzkz().zzex()) {
                    v0.zzacv.zzgi().zzjc().log("No network");
                    this.zzla().zzeu();
                    this.zzlb().cancel();
                    return;
                }

                v1 = v0.zzacv.zzgj().zzalv.get();
                v5 = Math.max(v3, zzez.zzaiv.get().longValue());
                if(!this.zzjf().zza(v1, v5)) {
                    v8 = Math.max(v8, v1 + v5);
                }

                this.zzla().unregister();
                v8 -= v0.zzacv.zzbt().currentTimeMillis();
                if(v8 <= v3) {
                    v8 = Math.max(v3, zzez.zzaja.get().longValue());
                    v0.zzacv.zzgj().zzalt.set(v0.zzacv.zzbt().currentTimeMillis());
                }

                v0.zzacv.zzgi().zzjc().zzg("Upload scheduled in approximately ms", Long.valueOf(v8));
                this.zzlb().zzh(v8);
                return;
            }
        }

        v0.zzacv.zzgi().zzjc().log("Nothing to upload or uploading impossible");
        this.zzla().unregister();
        this.zzlb().cancel();
    }

    @WorkerThread private final void zzlh() {
        this.zzab();
        if(!this.zzase && !this.zzasf) {
            if(this.zzasg) {
            }
            else {
                this.zzacv.zzgi().zzjc().log("Stopping uploading service(s)");
                if(this.zzasb == null) {
                    return;
                }
                else {
                    Iterator v0 = this.zzasb.iterator();
                    while(v0.hasNext()) {
                        v0.next().run();
                    }

                    this.zzasb.clear();
                    return;
                }
            }
        }

        this.zzacv.zzgi().zzjc().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzase), Boolean.valueOf(this.zzasf), Boolean.valueOf(this.zzasg));
    }

    @WorkerThread @VisibleForTesting private final boolean zzli() {
        String v2_1;
        zzfk v1;
        this.zzab();
        File v2 = new File(this.zzacv.getContext().getFilesDir(), "google_app_measurement.db");
        try {
            this.zzasi = new RandomAccessFile(v2, "rw").getChannel();
            this.zzash = this.zzasi.tryLock();
            if(this.zzash != null) {
                this.zzacv.zzgi().zzjc().log("Storage concurrent access okay");
                return 1;
            }

            this.zzacv.zzgi().zziv().log("Storage concurrent data access panic");
            return 0;
        }
        catch(IOException v0) {
            v1 = this.zzacv.zzgi().zziv();
            v2_1 = "Failed to access storage lock file";
        }
        catch(FileNotFoundException v0_1) {
            v1 = this.zzacv.zzgi().zziv();
            v2_1 = "Failed to acquire storage lock";
        }

        v1.zzg(v2_1, v0_1);
        return 0;
    }

    @WorkerThread final void zzlj() {
        String v3;
        zzfk v2;
        this.zzab();
        this.zzlc();
        if(!this.zzarz) {
            this.zzacv.zzgi().zzja().log("This instance being marked as an uploader");
            this.zzab();
            this.zzlc();
            if((this.zzlk()) && (this.zzli())) {
                int v0 = this.zza(this.zzasi);
                int v1 = this.zzacv.zzfz().zzis();
                this.zzab();
                if(v0 > v1) {
                    v2 = this.zzacv.zzgi().zziv();
                    v3 = "Panic: can\'t downgrade version. Previous, current version";
                }
                else if(v0 >= v1) {
                    goto label_44;
                }
                else if(this.zza(v1, this.zzasi)) {
                    v2 = this.zzacv.zzgi().zzjc();
                    v3 = "Storage version upgraded. Previous, current version";
                }
                else {
                    v2 = this.zzacv.zzgi().zziv();
                    v3 = "Storage version upgrade failed. Previous, current version";
                }

                v2.zze(v3, Integer.valueOf(v0), Integer.valueOf(v1));
            }

        label_44:
            this.zzarz = true;
            this.zzlg();
        }
    }

    @WorkerThread private final boolean zzlk() {
        this.zzab();
        this.zzlc();
        if(this.zzarz) {
            return 1;
        }

        return 0;
    }

    final void zzll() {
        ++this.zzasd;
    }

    final zzgn zzlm() {
        return this.zzacv;
    }

    final void zzm(boolean arg1) {
        this.zzlg();
    }
}

