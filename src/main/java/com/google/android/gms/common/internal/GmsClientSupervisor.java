package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public abstract class GmsClientSupervisor {
    public final class zza {
        private final ComponentName mComponentName;
        private final String zzdr;
        private final String zzds;
        private final int zzdt;

        public zza(String arg1, String arg2, int arg3) {
            super();
            this.zzdr = Preconditions.checkNotEmpty(arg1);
            this.zzds = Preconditions.checkNotEmpty(arg2);
            this.mComponentName = null;
            this.zzdt = arg3;
        }

        public zza(ComponentName arg1, int arg2) {
            super();
            this.zzdr = null;
            this.zzds = null;
            this.mComponentName = Preconditions.checkNotNull(arg1);
            this.zzdt = 0x81;
        }

        public zza(String arg1, int arg2) {
            super();
            this.zzdr = Preconditions.checkNotEmpty(arg1);
            this.zzds = "com.google.android.gms";
            this.mComponentName = null;
            this.zzdt = 0x81;
        }

        public final boolean equals(Object arg5) {
            if(this == (((zza)arg5))) {
                return 1;
            }

            if(!(arg5 instanceof zza)) {
                return 0;
            }

            if((Objects.equal(this.zzdr, ((zza)arg5).zzdr)) && (Objects.equal(this.zzds, ((zza)arg5).zzds)) && (Objects.equal(this.mComponentName, ((zza)arg5).mComponentName)) && this.zzdt == ((zza)arg5).zzdt) {
                return 1;
            }

            return 0;
        }

        public final ComponentName getComponentName() {
            return this.mComponentName;
        }

        public final String getPackage() {
            return this.zzds;
        }

        public final int hashCode() {
            return Objects.hashCode(new Object[]{this.zzdr, this.zzds, this.mComponentName, Integer.valueOf(this.zzdt)});
        }

        public final String toString() {
            if(this.zzdr == null) {
                return this.mComponentName.flattenToString();
            }

            return this.zzdr;
        }

        public final Intent zzb(Context arg2) {
            Intent v2 = this.zzdr != null ? new Intent(this.zzdr).setPackage(this.zzds) : new Intent().setComponent(this.mComponentName);
            return v2;
        }

        public final int zzq() {
            return this.zzdt;
        }
    }

    private static final Object zzdp;
    private static GmsClientSupervisor zzdq;

    static {
        GmsClientSupervisor.zzdp = new Object();
    }

    public GmsClientSupervisor() {
        super();
    }

    @KeepForSdk public boolean bindService(ComponentName arg3, ServiceConnection arg4, String arg5) {
        return this.zza(new zza(arg3, 0x81), arg4, arg5);
    }

    @KeepForSdk public boolean bindService(String arg3, ServiceConnection arg4, String arg5) {
        return this.zza(new zza(arg3, 0x81), arg4, arg5);
    }

    @KeepForSdk public static GmsClientSupervisor getInstance(Context arg2) {
        Object v0 = GmsClientSupervisor.zzdp;
        __monitor_enter(v0);
        try {
            if(GmsClientSupervisor.zzdq == null) {
                GmsClientSupervisor.zzdq = new zze(arg2.getApplicationContext());
            }

            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            try {
            label_12:
                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                goto label_12;
            }

            throw v2;
        }

        return GmsClientSupervisor.zzdq;
    }

    @KeepForSdk public void unbindService(ComponentName arg3, ServiceConnection arg4, String arg5) {
        this.zzb(new zza(arg3, 0x81), arg4, arg5);
    }

    @KeepForSdk public void unbindService(String arg3, ServiceConnection arg4, String arg5) {
        this.zzb(new zza(arg3, 0x81), arg4, arg5);
    }

    public final void zza(String arg2, String arg3, int arg4, ServiceConnection arg5, String arg6) {
        this.zzb(new zza(arg2, arg3, arg4), arg5, arg6);
    }

    protected abstract boolean zza(zza arg1, ServiceConnection arg2, String arg3);

    protected abstract void zzb(zza arg1, ServiceConnection arg2, String arg3);
}

