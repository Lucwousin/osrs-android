package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

public abstract class zzwx {
    private static final Object zzbpg;
    private static boolean zzbph;
    private static volatile Boolean zzbpi;
    private final zzxh zzbpj;
    final String zzbpk;
    private final String zzbpl;
    private final Object zzbpm;
    private Object zzbpn;
    private volatile zzwu zzbpo;
    private volatile SharedPreferences zzbpp;
    @SuppressLint(value={"StaticFieldLeak"}) private static Context zzqx;

    static {
        zzwx.zzbpg = new Object();
        zzwx.zzqx = null;
        zzwx.zzbph = false;
        zzwx.zzbpi = null;
    }

    private zzwx(zzxh arg4, String arg5, Object arg6) {
        super();
        this.zzbpn = null;
        this.zzbpo = null;
        this.zzbpp = null;
        if(zzxh.zza(arg4) != null) {
            this.zzbpj = arg4;
            String v0 = String.valueOf(zzxh.zzb(arg4));
            String v1 = String.valueOf(arg5);
            v0 = v1.length() != 0 ? v0.concat(v1) : new String(v0);
            this.zzbpl = v0;
            String v4 = String.valueOf(zzxh.zzc(arg4));
            arg5 = String.valueOf(arg5);
            v4 = arg5.length() != 0 ? v4.concat(arg5) : new String(v4);
            this.zzbpk = v4;
            this.zzbpm = arg6;
            return;
        }

        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    zzwx(zzxh arg1, String arg2, Object arg3, zzxb arg4) {
        this(arg1, arg2, arg3);
    }

    public final Object get() {
        if(zzwx.zzqx != null) {
            Object v0 = this.zzsm();
            if(v0 != null) {
                return v0;
            }

            v0 = this.zzsn();
            if(v0 != null) {
                return v0;
            }

            return this.zzbpm;
        }

        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public static void init(Context arg3) {
        Object v0 = zzwx.zzbpg;
        __monitor_enter(v0);
        try {
            if(Build$VERSION.SDK_INT < 24 || !arg3.isDeviceProtectedStorage()) {
                Context v1 = arg3.getApplicationContext();
                if(v1 == null) {
                }
                else {
                    arg3 = v1;
                }
            }
            else {
            }

            if(zzwx.zzqx != arg3) {
                zzwx.zzbpi = null;
            }

            zzwx.zzqx = arg3;
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_22:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_22;
            }

            throw v3;
        }

        zzwx.zzbph = false;
    }

    private static zzwx zza(zzxh arg1, String arg2, double arg3) {
        return new zzxe(arg1, arg2, Double.valueOf(arg3));
    }

    private static zzwx zza(zzxh arg1, String arg2, int arg3) {
        return new zzxc(arg1, arg2, Integer.valueOf(arg3));
    }

    private static zzwx zza(zzxh arg1, String arg2, long arg3) {
        return new zzxb(arg1, arg2, Long.valueOf(arg3));
    }

    private static zzwx zza(zzxh arg1, String arg2, String arg3) {
        return new zzxf(arg1, arg2, arg3);
    }

    private static zzwx zza(zzxh arg1, String arg2, boolean arg3) {
        return new zzxd(arg1, arg2, Boolean.valueOf(arg3));
    }

    private static Object zza(zzxg arg2) {
        Object v2;
        try {
            v2 = arg2.zzsq();
        }
        catch(SecurityException ) {
            long v0 = Binder.clearCallingIdentity();
            try {
                v2 = ((zzxg)v2).zzsq();
            }
            catch(Throwable v2_1) {
                Binder.restoreCallingIdentity(v0);
                throw v2_1;
            }

            Binder.restoreCallingIdentity(v0);
        }

        return v2;
    }

    static zzwx zzb(zzxh arg0, String arg1, double arg2) {
        return zzwx.zza(arg0, arg1, arg2);
    }

    static zzwx zzb(zzxh arg0, String arg1, int arg2) {
        return zzwx.zza(arg0, arg1, arg2);
    }

    static zzwx zzb(zzxh arg0, String arg1, long arg2) {
        return zzwx.zza(arg0, arg1, arg2);
    }

    static zzwx zzb(zzxh arg0, String arg1, String arg2) {
        return zzwx.zza(arg0, arg1, arg2);
    }

    static zzwx zzb(zzxh arg0, String arg1, boolean arg2) {
        return zzwx.zza(arg0, arg1, arg2);
    }

    static boolean zzd(String arg2, boolean arg3) {
        try {
            if(!zzwx.zzso()) {
                return 0;
            }

            return zzwx.zza(new zzxa(arg2, false)).booleanValue();
        }
        catch(SecurityException v2) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", ((Throwable)v2));
            return 0;
        }

        return 0;
    }

    static final Boolean zze(String arg1, boolean arg2) {
        return Boolean.valueOf(zzws.zza(zzwx.zzqx.getContentResolver(), arg1, arg2));
    }

    protected abstract Object zzfa(String arg1);

    @TargetApi(value=24) @Nullable private final Object zzsm() {
        if(zzwx.zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String v0_1 = "PhenotypeFlag";
            String v1 = "Bypass reading Phenotype values for flag: ";
            String v2 = String.valueOf(this.zzbpk);
            v1 = v2.length() != 0 ? v1.concat(v2) : new String(v1);
            Log.w(v0_1, v1);
        }
        else if(zzxh.zza(this.zzbpj) != null) {
            if(this.zzbpo == null) {
                this.zzbpo = zzwu.zza(zzwx.zzqx.getContentResolver(), zzxh.zza(this.zzbpj));
            }

            Object v0 = zzwx.zza(new zzwy(this, this.zzbpo));
            if(v0 == null) {
                return null;
            }

            return this.zzfa(((String)v0));
        }

        return null;
    }

    @Nullable private final Object zzsn() {
        if(zzwx.zzso()) {
            try {
                Object v0_1 = zzwx.zza(new zzwz(this));
                if(v0_1 == null) {
                    return null;
                }

                return this.zzfa(((String)v0_1));
            }
            catch(SecurityException v0) {
                String v1 = "PhenotypeFlag";
                String v2 = "Unable to read GServices for flag: ";
                String v3 = String.valueOf(this.zzbpk);
                v2 = v3.length() != 0 ? v2.concat(v3) : new String(v2);
                Log.e(v1, v2, ((Throwable)v0));
            }
        }

        return null;
    }

    private static boolean zzso() {
        if(zzwx.zzbpi == null) {
            boolean v1 = false;
            if(zzwx.zzqx != null) {
                if(PermissionChecker.checkSelfPermission(zzwx.zzqx, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    v1 = true;
                }

                zzwx.zzbpi = Boolean.valueOf(v1);
            }
            else {
                return 0;
            }
        }

        return zzwx.zzbpi.booleanValue();
    }

    final String zzsp() {
        return zzws.zza(zzwx.zzqx.getContentResolver(), this.zzbpl, null);
    }
}

