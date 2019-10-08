package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class i {
    final class com.appsflyer.i$2 implements Runnable {
        com.appsflyer.i$2(i arg1) {
            this.ˊ = arg1;
            super();
        }

        public final void run() {
            Object v0 = this.ˊ.ˋ;
            __monitor_enter(v0);
            try {
                this.ˊ.ˏ();
                this.ˊ.ˊ.postDelayed(this.ˊ.ˎ, 1800000);
                __monitor_exit(v0);
                return;
            }
            catch(Throwable v1) {
                __monitor_exit(v0);
                throw v1;
            }
        }
    }

    final class com.appsflyer.i$3 implements Runnable {
        com.appsflyer.i$3(i arg1) {
            this.ˎ = arg1;
            super();
        }

        public final void run() {
            Object v0 = this.ˎ.ˋ;
            __monitor_enter(v0);
            try {
                this.ˎ.ॱ();
                this.ˎ.ˊ.postDelayed(this.ˎ.ॱ, 500);
                this.ˎ.ˏ = true;
                __monitor_exit(v0);
                return;
            }
            catch(Throwable v1) {
                __monitor_exit(v0);
                throw v1;
            }
        }
    }

    final class com.appsflyer.i$4 implements Runnable {
        com.appsflyer.i$4(i arg1) {
            this.ˏ = arg1;
            super();
        }

        public final void run() {
            Object v0 = this.ˏ.ˋ;
            __monitor_enter(v0);
            try {
                if(this.ˏ.ˏ) {
                    this.ˏ.ˊ.removeCallbacks(this.ˏ.ˎ);
                    this.ˏ.ˊ.removeCallbacks(this.ˏ.ॱ);
                    this.ˏ.ˏ();
                    this.ˏ.ˏ = false;
                }

                __monitor_exit(v0);
                return;
            }
            catch(Throwable v1) {
                __monitor_exit(v0);
                throw v1;
            }
        }
    }

    final Runnable ʻ;
    private final Map ʼ;
    private static final BitSet ʽ;
    final Handler ˊ;
    private final Map ˊॱ;
    final Object ˋ;
    final Runnable ˎ;
    boolean ˏ;
    private boolean ͺ;
    final Runnable ॱ;
    private final SensorManager ॱˊ;
    private static volatile i ॱॱ;
    private static final Handler ᐝ;

    static {
        i.ʽ = new BitSet(6);
        i.ᐝ = new Handler(Looper.getMainLooper());
        i.ʽ.set(1);
        i.ʽ.set(2);
        i.ʽ.set(4);
    }

    private i(@NonNull SensorManager arg3, Handler arg4) {
        super();
        this.ˋ = new Object();
        this.ʼ = new HashMap(i.ʽ.size());
        this.ˊॱ = new HashMap(i.ʽ.size());
        this.ॱ = new com.appsflyer.i$2(this);
        this.ˎ = new com.appsflyer.i$3(this);
        this.ʻ = new com.appsflyer.i$4(this);
        this.ॱˊ = arg3;
        this.ˊ = arg4;
    }

    private static i ˋ(SensorManager arg2, Handler arg3) {
        if(i.ॱॱ == null) {
            Class v0 = i.class;
            __monitor_enter(v0);
            try {
                if(i.ॱॱ == null) {
                    i.ॱॱ = new i(arg2, arg3);
                }

                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                __monitor_exit(v0);
                throw v2;
            }
        }

        return i.ॱॱ;
    }

    @NonNull final List ˋ() {
        Object v0 = this.ˋ;
        __monitor_enter(v0);
        try {
            if(!this.ʼ.isEmpty() && (this.ͺ)) {
                Iterator v1_1 = this.ʼ.values().iterator();
                while(v1_1.hasNext()) {
                    v1_1.next().ˏ(this.ˊॱ);
                }
            }

            if(this.ˊॱ.isEmpty()) {
                __monitor_exit(v0);
                return Collections.emptyList();
            }

            __monitor_exit(v0);
            return new ArrayList(this.ˊॱ.values());
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }
    }

    static i ˏ(Context arg1) {
        return i.ˋ(arg1.getApplicationContext().getSystemService("sensor"), i.ᐝ);
    }

    final void ˏ() {
        try {
            if(!this.ʼ.isEmpty()) {
                Iterator v0 = this.ʼ.values().iterator();
                while(true) {
                    if(v0.hasNext()) {
                        Object v1 = v0.next();
                        this.ॱˊ.unregisterListener(((SensorEventListener)v1));
                        ((g)v1).ˊ(this.ˊॱ);
                        continue;
                    }

                    goto label_14;
                }
            }

            goto label_14;
        }
        catch(Throwable ) {
        label_14:
            this.ͺ = false;
            return;
        }
    }

    final void ॱ() {
        try {
            Iterator v1 = this.ॱˊ.getSensorList(-1).iterator();
            while(true) {
                if(!v1.hasNext()) {
                    goto label_29;
                }

                Object v2 = v1.next();
                int v3 = ((Sensor)v2).getType();
                v3 = v3 < 0 || !i.ʽ.get(v3) ? 0 : 1;
                if(v3 == 0) {
                    continue;
                }

                g v3_1 = g.ˋ(((Sensor)v2));
                if(!this.ʼ.containsKey(v3_1)) {
                    this.ʼ.put(v3_1, v3_1);
                }

                this.ॱˊ.registerListener(this.ʼ.get(v3_1), ((Sensor)v2), 0);
            }
        }
        catch(Throwable ) {
        label_29:
            this.ͺ = true;
            return;
        }
    }
}

