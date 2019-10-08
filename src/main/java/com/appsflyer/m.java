package com.appsflyer;

import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@RequiresApi(api=14) final class m implements Application$ActivityLifecycleCallbacks {
    final class c extends AsyncTask {
        private WeakReference ॱ;

        public c(m arg1, WeakReference arg2) {
            this.ˋ = arg1;
            super();
            this.ॱ = arg2;
        }

        protected final Object doInBackground(Object[] arg1) {
            return this.ˋ();
        }

        private Void ˋ() {
            long v0 = 500;
            try {
                Thread.sleep(v0);
            }
            catch(InterruptedException v0_1) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", ((Throwable)v0_1));
            }

            if((m.ˊ(this.ˋ)) && (m.ˏ(this.ˋ))) {
                m.ˋ(this.ˋ);
                try {
                    m.ˎ(this.ˋ).ˊ(this.ॱ);
                }
                catch(Exception v0_2) {
                    AFLogger.afErrorLog("Listener threw exception! ", ((Throwable)v0_2));
                    ((AsyncTask)this).cancel(true);
                }
            }

            this.ॱ.clear();
            return null;
        }
    }

    interface d {
        void ˊ(Activity arg1);

        void ˊ(WeakReference arg1);
    }

    private d ˋ;
    private boolean ˎ;
    private boolean ˏ;
    private static m ॱ;

    m() {
        super();
        this.ˎ = false;
        this.ˏ = true;
        this.ˋ = null;
    }

    public final void onActivityCreated(Activity arg1, Bundle arg2) {
        AFDeepLinkManager.getInstance().collectIntentsFromActivities(arg1.getIntent());
    }

    public final void onActivityDestroyed(Activity arg1) {
    }

    public final void onActivityPaused(Activity arg3) {
        this.ˏ = true;
        c v0 = new c(this, new WeakReference(((Context)arg3).getApplicationContext()));
        Executor v3 = AFExecutor.getInstance().getThreadPoolExecutor();
        try {
            v0.executeOnExecutor(v3, new Void[0]);
            return;
        }
        catch(Throwable v3_1) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", v3_1);
            return;
        }
        catch(RejectedExecutionException v3_2) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", ((Throwable)v3_2));
            return;
        }
    }

    public final void onActivityResumed(Activity arg3) {
        this.ˏ = false;
        int v0 = this.ˎ ^ 1;
        this.ˎ = true;
        if(v0 != 0) {
            try {
                this.ˋ.ˊ(arg3);
                return;
            }
            catch(Exception v3) {
                AFLogger.afErrorLog("Listener threw exception! ", ((Throwable)v3));
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity arg1, Bundle arg2) {
    }

    public final void onActivityStarted(Activity arg1) {
    }

    public final void onActivityStopped(Activity arg1) {
    }

    static boolean ˊ(m arg0) {
        return arg0.ˎ;
    }

    public final void ˊ(Application arg2, d arg3) {
        this.ˋ = arg3;
        if(Build$VERSION.SDK_INT >= 14) {
            arg2.registerActivityLifecycleCallbacks(m.ॱ);
        }
    }

    static boolean ˋ(m arg1) {
        arg1.ˎ = false;
        return 0;
    }

    static d ˎ(m arg0) {
        return arg0.ˋ;
    }

    static m ˎ() {
        if(m.ॱ == null) {
            m.ॱ = new m();
        }

        return m.ॱ;
    }

    public static m ˏ() {
        if(m.ॱ != null) {
            return m.ॱ;
        }

        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    static boolean ˏ(m arg0) {
        return arg0.ˏ;
    }
}

