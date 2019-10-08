package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager$WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@KeepForSdk @ShowFirstParty @ThreadSafe public class WakeLock {
    public interface zza {
    }

    private final Object zza;
    private final PowerManager$WakeLock zzb;
    private WorkSource zzc;
    private final int zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final Context zzh;
    private boolean zzi;
    private final Map zzj;
    private final Set zzk;
    private int zzl;
    private AtomicInteger zzm;
    private static ScheduledExecutorService zzn;
    private static volatile zza zzo;

    static {
        WakeLock.zzo = new com.google.android.gms.stats.zza();
    }

    @KeepForSdk public WakeLock(@NonNull Context arg8, int arg9, @NonNull String arg10) {
        String v0 = arg8 == null ? null : arg8.getPackageName();
        String v6 = v0;
        this(arg8, arg9, arg10, null, v6);
    }

    private WakeLock(@NonNull Context arg8, int arg9, @NonNull String arg10, @Nullable String arg11, @NonNull String arg12) {
        this(arg8, arg9, arg10, null, arg12, null);
    }

    @SuppressLint(value={"UnwrappedWakeLock"}) private WakeLock(@NonNull Context arg2, int arg3, @NonNull String arg4, @Nullable String arg5, @NonNull String arg6, @Nullable String arg7) {
        super();
        this.zza = this;
        this.zzi = true;
        this.zzj = new HashMap();
        this.zzk = Collections.synchronizedSet(new HashSet());
        this.zzm = new AtomicInteger(0);
        Preconditions.checkNotNull(arg2, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(arg4, "WakeLock: wakeLockName must not be empty");
        this.zzd = arg3;
        this.zzf = null;
        this.zzg = null;
        this.zzh = arg2.getApplicationContext();
        if(!"com.google.android.gms".equals(arg2.getPackageName())) {
            arg5 = String.valueOf("*gcore*:");
            arg7 = String.valueOf(arg4);
            arg5 = arg7.length() != 0 ? arg5.concat(arg7) : new String(arg5);
            this.zze = arg5;
        }
        else {
            this.zze = arg4;
        }

        this.zzb = arg2.getSystemService("power").newWakeLock(arg3, arg4);
        if(WorkSourceUtil.hasWorkSourcePermission(arg2)) {
            if(Strings.isEmptyOrWhitespace(arg6)) {
                arg6 = arg2.getPackageName();
            }

            this.zzc = WorkSourceUtil.fromPackage(arg2, arg6);
            WorkSource v2 = this.zzc;
            if(v2 == null) {
                goto label_72;
            }

            if(!WorkSourceUtil.hasWorkSourcePermission(this.zzh)) {
                goto label_72;
            }

            if(this.zzc != null) {
                this.zzc.add(v2);
            }
            else {
                this.zzc = v2;
            }

            v2 = this.zzc;
            try {
                this.zzb.setWorkSource(v2);
            }
            catch(ArrayIndexOutOfBoundsException v2_1) {
                Log.wtf("WakeLock", ((RuntimeException)v2_1).toString());
            }
        }

    label_72:
        if(WakeLock.zzn == null) {
            WakeLock.zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    @KeepForSdk public void acquire(long arg14) {
        this.zzm.incrementAndGet();
        String v6 = this.zza(null);
        Object v0 = this.zza;
        __monitor_enter(v0);
        try {
            int v2 = 0;
            if((!this.zzj.isEmpty() || this.zzl > 0) && !this.zzb.isHeld()) {
                this.zzj.clear();
                this.zzl = 0;
            }

            if(this.zzi) {
                Object v1 = this.zzj.get(v6);
                if(v1 == null) {
                    this.zzj.put(v6, new Integer[]{Integer.valueOf(1)});
                    v2 = 1;
                }
                else {
                    v1[0] = Integer.valueOf(v1[0].intValue() + 1);
                }

                if(v2 != 0) {
                    goto label_41;
                }

                goto label_37;
            }
            else {
            label_37:
                if(this.zzi) {
                    goto label_55;
                }

                if(this.zzl != 0) {
                    goto label_55;
                }

            label_41:
                WakeLockTracker.getInstance().registerEvent(this.zzh, StatsUtils.getEventKey(this.zzb, v6), 7, this.zze, v6, null, this.zzd, this.zza(), arg14);
                ++this.zzl;
            }

        label_55:
            __monitor_exit(v0);
        }
        catch(Throwable v14) {
            try {
            label_67:
                __monitor_exit(v0);
            }
            catch(Throwable v14) {
                goto label_67;
            }

            throw v14;
        }

        this.zzb.acquire();
        if(arg14 > 0) {
            WakeLock.zzn.schedule(new zzb(this), arg14, TimeUnit.MILLISECONDS);
        }
    }

    @KeepForSdk public boolean isHeld() {
        return this.zzb.isHeld();
    }

    @KeepForSdk public void release() {
        int v1_2;
        if(this.zzm.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.zze).concat(" release without a matched acquire!"));
        }

        String v6 = this.zza(null);
        Object v0 = this.zza;
        __monitor_enter(v0);
        try {
            if(this.zzi) {
                Object v1_1 = this.zzj.get(v6);
                if(v1_1 == null) {
                label_20:
                    v1_2 = 0;
                }
                else if(v1_1[0].intValue() == 1) {
                    this.zzj.remove(v6);
                    v1_2 = 1;
                }
                else {
                    v1_1[0] = Integer.valueOf(v1_1[0].intValue() - 1);
                    goto label_20;
                }

                if(v1_2 != 0) {
                    goto label_40;
                }

                goto label_36;
            }
            else {
            label_36:
                if(this.zzi) {
                    goto label_53;
                }

                if(this.zzl != 1) {
                    goto label_53;
                }

            label_40:
                WakeLockTracker.getInstance().registerEvent(this.zzh, StatsUtils.getEventKey(this.zzb, v6), 8, this.zze, v6, null, this.zzd, this.zza());
                --this.zzl;
            }

        label_53:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_57:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_57;
            }

            throw v1;
        }

        this.zza(0);
    }

    @KeepForSdk public void setReferenceCounted(boolean arg2) {
        this.zzb.setReferenceCounted(arg2);
        this.zzi = arg2;
    }

    private final String zza(String arg2) {
        if(this.zzi) {
            if(!TextUtils.isEmpty(((CharSequence)arg2))) {
                return arg2;
            }

            return this.zzf;
        }

        return this.zzf;
    }

    private final List zza() {
        return WorkSourceUtil.getNames(this.zzc);
    }

    private final void zza(int arg4) {
        if(this.zzb.isHeld()) {
            try {
                this.zzb.release();
            }
            catch(RuntimeException v4) {
                if(v4.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.zze).concat(" was already released!"), ((Throwable)v4));
                    goto label_17;
                }

                throw v4;
            }

        label_17:
            this.zzb.isHeld();
        }
    }

    static void zza(WakeLock arg0, int arg1) {
        arg0.zza(0);
    }
}

