package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class zzf implements ServiceConnection {
    private ComponentName mComponentName;
    private int mState;
    private IBinder zzcy;
    private final Set zzdz;
    private boolean zzea;
    private final zza zzeb;

    public zzf(zze arg1, zza arg2) {
        this.zzec = arg1;
        super();
        this.zzeb = arg2;
        this.zzdz = new HashSet();
        this.mState = 2;
    }

    public final IBinder getBinder() {
        return this.zzcy;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean isBound() {
        return this.zzea;
    }

    public final void onServiceConnected(ComponentName arg5, IBinder arg6) {
        HashMap v0 = zze.zza(this.zzec);
        __monitor_enter(v0);
        try {
            zze.zzb(this.zzec).removeMessages(1, this.zzeb);
            this.zzcy = arg6;
            this.mComponentName = arg5;
            Iterator v1 = this.zzdz.iterator();
            while(v1.hasNext()) {
                v1.next().onServiceConnected(arg5, arg6);
            }

            this.mState = 1;
            __monitor_exit(v0);
            return;
        label_21:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_21;
        }

        throw v5;
    }

    public final void onServiceDisconnected(ComponentName arg5) {
        HashMap v0 = zze.zza(this.zzec);
        __monitor_enter(v0);
        try {
            zze.zzb(this.zzec).removeMessages(1, this.zzeb);
            this.zzcy = null;
            this.mComponentName = arg5;
            Iterator v1 = this.zzdz.iterator();
            while(v1.hasNext()) {
                v1.next().onServiceDisconnected(arg5);
            }

            this.mState = 2;
            __monitor_exit(v0);
            return;
        label_23:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_23;
        }

        throw v5;
    }

    public final void zza(ServiceConnection arg2, String arg3) {
        zze.zzd(this.zzec);
        zze.zzc(this.zzec);
        this.zzeb.zzb(zze.zzc(this.zzec));
        this.zzdz.add(arg2);
    }

    public final boolean zza(ServiceConnection arg2) {
        return this.zzdz.contains(arg2);
    }

    public final void zzb(ServiceConnection arg1, String arg2) {
        zze.zzd(this.zzec);
        zze.zzc(this.zzec);
        this.zzdz.remove(arg1);
    }

    public final void zze(String arg8) {
        this.mState = 3;
        this.zzea = zze.zzd(this.zzec).zza(zze.zzc(this.zzec), arg8, this.zzeb.zzb(zze.zzc(this.zzec)), this, this.zzeb.zzq());
        if(this.zzea) {
            zze.zzb(this.zzec).sendMessageDelayed(zze.zzb(this.zzec).obtainMessage(1, this.zzeb), zze.zze(this.zzec));
            return;
        }

        this.mState = 2;
        try {
            zze.zzd(this.zzec).unbindService(zze.zzc(this.zzec), ((ServiceConnection)this));
            return;
        }
        catch(IllegalArgumentException ) {
            return;
        }
    }

    public final void zzf(String arg3) {
        zze.zzb(this.zzec).removeMessages(1, this.zzeb);
        zze.zzd(this.zzec).unbindService(zze.zzc(this.zzec), ((ServiceConnection)this));
        this.zzea = false;
        this.mState = 2;
    }

    public final boolean zzr() {
        return this.zzdz.isEmpty();
    }
}

