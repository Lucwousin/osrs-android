package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements LifecycleFragment {
    private static WeakHashMap zzbd;
    private Map zzbe;
    private int zzbf;
    private Bundle zzbg;

    static {
        zzc.zzbd = new WeakHashMap();
    }

    public zzc() {
        super();
        this.zzbe = new ArrayMap();
        this.zzbf = 0;
    }

    public final void addCallback(String arg3, @NonNull LifecycleCallback arg4) {
        if(!this.zzbe.containsKey(arg3)) {
            this.zzbe.put(arg3, arg4);
            if(this.zzbf > 0) {
                new zze(Looper.getMainLooper()).post(new zzd(this, arg4, arg3));
            }

            return;
        }

        StringBuilder v1 = new StringBuilder(String.valueOf(arg3).length() + 59);
        v1.append("LifecycleCallback with tag ");
        v1.append(arg3);
        v1.append(" already added to this fragment.");
        throw new IllegalArgumentException(v1.toString());
    }

    public final void dump(String arg3, FileDescriptor arg4, PrintWriter arg5, String[] arg6) {
        super.dump(arg3, arg4, arg5, arg6);
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().dump(arg3, arg4, arg5, arg6);
        }
    }

    public final LifecycleCallback getCallbackOrNull(String arg2, Class arg3) {
        return arg3.cast(this.zzbe.get(arg2));
    }

    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    public final boolean isCreated() {
        if(this.zzbf > 0) {
            return 1;
        }

        return 0;
    }

    public final boolean isStarted() {
        if(this.zzbf >= 2) {
            return 1;
        }

        return 0;
    }

    public final void onActivityResult(int arg3, int arg4, Intent arg5) {
        super.onActivityResult(arg3, arg4, arg5);
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().onActivityResult(arg3, arg4, arg5);
        }
    }

    public final void onCreate(Bundle arg4) {
        super.onCreate(arg4);
        this.zzbf = 1;
        this.zzbg = arg4;
        Iterator v0 = this.zzbe.entrySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            Object v2 = ((Map$Entry)v1).getValue();
            Bundle v1_1 = arg4 != null ? arg4.getBundle(((Map$Entry)v1).getKey()) : null;
            ((LifecycleCallback)v2).onCreate(v1_1);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzbf = 5;
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzbf = 3;
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().onResume();
        }
    }

    public final void onSaveInstanceState(Bundle arg5) {
        super.onSaveInstanceState(arg5);
        if(arg5 == null) {
            return;
        }

        Iterator v0 = this.zzbe.entrySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            Bundle v2 = new Bundle();
            ((Map$Entry)v1).getValue().onSaveInstanceState(v2);
            arg5.putBundle(((Map$Entry)v1).getKey(), v2);
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzbf = 2;
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzbf = 4;
        Iterator v0 = this.zzbe.values().iterator();
        while(v0.hasNext()) {
            v0.next().onStop();
        }
    }

    public static zzc zza(FragmentActivity arg3) {
        Fragment v0_1;
        Object v0 = zzc.zzbd.get(arg3);
        if(v0 != null) {
            v0 = ((WeakReference)v0).get();
            if(v0 != null) {
                return ((zzc)v0);
            }
        }

        try {
            v0_1 = arg3.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if(v0_1 == null) {
                goto label_12;
            }
        }
        catch(ClassCastException v3) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ((Throwable)v3));
        }

        if(((zzc)v0_1).isRemoving()) {
        label_12:
            zzc v0_2 = new zzc();
            arg3.getSupportFragmentManager().beginTransaction().add(((Fragment)v0_2), "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
        }

        zzc.zzbd.put(arg3, new WeakReference(v0_1));
        return ((zzc)v0_1);
    }

    static int zza(zzc arg0) {
        return arg0.zzbf;
    }

    static Bundle zzb(zzc arg0) {
        return arg0.zzbg;
    }
}

