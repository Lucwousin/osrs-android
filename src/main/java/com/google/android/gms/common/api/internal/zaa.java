package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    @VisibleForTesting(otherwise=2) class com.google.android.gms.common.api.internal.zaa$zaa extends LifecycleCallback {
        private List zacl;

        private com.google.android.gms.common.api.internal.zaa$zaa(LifecycleFragment arg2) {
            super(arg2);
            this.zacl = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", ((LifecycleCallback)this));
        }

        @MainThread public void onStop() {
            List v0_1;
            __monitor_enter(this);
            try {
                v0_1 = this.zacl;
                this.zacl = new ArrayList();
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                try {
                label_14:
                    __monitor_exit(this);
                }
                catch(Throwable v0) {
                    goto label_14;
                }

                throw v0;
            }

            Iterator v0_2 = v0_1.iterator();
            while(v0_2.hasNext()) {
                v0_2.next().run();
            }
        }

        static void zaa(com.google.android.gms.common.api.internal.zaa$zaa arg0, Runnable arg1) {
            arg0.zaa(arg1);
        }

        private static com.google.android.gms.common.api.internal.zaa$zaa zaa(Activity arg3) {
            com.google.android.gms.common.api.internal.zaa$zaa v1_1;
            __monitor_enter(arg3);
            try {
                LifecycleFragment v0_1 = com.google.android.gms.common.api.internal.zaa$zaa.getFragment(arg3);
                LifecycleCallback v1 = v0_1.getCallbackOrNull("LifecycleObserverOnStop", com.google.android.gms.common.api.internal.zaa$zaa.class);
                if(v1 == null) {
                    v1_1 = new com.google.android.gms.common.api.internal.zaa$zaa(v0_1);
                }

                __monitor_exit(arg3);
                return v1_1;
            label_11:
                __monitor_exit(arg3);
            }
            catch(Throwable v0) {
                goto label_11;
            }

            throw v0;
        }

        private final void zaa(Runnable arg2) {
            __monitor_enter(this);
            try {
                this.zacl.add(arg2);
            }
            catch(Throwable v2) {
                __monitor_exit(this);
                throw v2;
            }

            __monitor_exit(this);
        }

        static com.google.android.gms.common.api.internal.zaa$zaa zab(Activity arg0) {
            return com.google.android.gms.common.api.internal.zaa$zaa.zaa(arg0);
        }
    }

    private final WeakReference zack;

    public zaa(Activity arg1) {
        this(com.google.android.gms.common.api.internal.zaa$zaa.zab(arg1));
    }

    @VisibleForTesting(otherwise=2) private zaa(com.google.android.gms.common.api.internal.zaa$zaa arg2) {
        super();
        this.zack = new WeakReference(arg2);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable arg2) {
        Object v0 = this.zack.get();
        if(v0 != null) {
            com.google.android.gms.common.api.internal.zaa$zaa.zaa(((com.google.android.gms.common.api.internal.zaa$zaa)v0), arg2);
            return this;
        }

        throw new IllegalStateException("The target activity has already been GC\'d");
    }
}

