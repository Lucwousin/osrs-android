package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class g implements SensorEventListener {
    private final int ʼ;
    private double ʽ;
    @NonNull private final String ˊ;
    private final float[][] ˋ;
    private final long[] ˎ;
    @NonNull private final String ˏ;
    private final int ॱ;
    private long ᐝ;

    private g(int arg3, @Nullable String arg4, @Nullable String arg5) {
        super();
        this.ˋ = new float[2][];
        this.ˎ = new long[2];
        this.ॱ = arg3;
        if(arg4 == null) {
            arg4 = "";
        }

        this.ˊ = arg4;
        if(arg5 == null) {
            arg5 = "";
        }

        this.ˏ = arg5;
        this.ʼ = ((arg3 + 0x1F) * 0x1F + this.ˊ.hashCode()) * 0x1F + this.ˏ.hashCode();
    }

    public final boolean equals(Object arg3) {
        if((((g)arg3)) == this) {
            return 1;
        }

        if((arg3 instanceof g)) {
            return this.ˎ(((g)arg3).ॱ, ((g)arg3).ˊ, ((g)arg3).ˏ);
        }

        return 0;
    }

    public final int hashCode() {
        return this.ʼ;
    }

    public final void onAccuracyChanged(Sensor arg1, int arg2) {
    }

    public final void onSensorChanged(SensorEvent arg12) {
        if(arg12 != null && arg12.values != null) {
            Sensor v0 = arg12.sensor;
            int v0_1 = v0 == null || v0.getName() == null || v0.getVendor() == null ? 0 : 1;
            if(v0_1 == 0) {
                return;
            }

            v0_1 = arg12.sensor.getType();
            String v3 = arg12.sensor.getName();
            String v4 = arg12.sensor.getVendor();
            long v5 = arg12.timestamp;
            float[] v12 = arg12.values;
            if(!this.ˎ(v0_1, v3, v4)) {
                return;
            }

            long v3_1 = System.currentTimeMillis();
            float[] v0_2 = this.ˋ[0];
            if(v0_2 == null) {
                this.ˋ[0] = Arrays.copyOf(v12, v12.length);
                this.ˎ[0] = v3_1;
                return;
            }

            float[] v1 = this.ˋ[1];
            if(v1 == null) {
                v12 = Arrays.copyOf(v12, v12.length);
                this.ˋ[1] = v12;
                this.ˎ[1] = v3_1;
                this.ʽ = g.ˎ(v0_2, v12);
                return;
            }

            if(50000000 > v5 - this.ᐝ) {
                return;
            }

            this.ᐝ = v5;
            if(Arrays.equals(v1, v12)) {
                this.ˎ[1] = v3_1;
                return;
            }

            double v0_3 = g.ˎ(v0_2, v12);
            if(v0_3 <= this.ʽ) {
                return;
            }

            this.ˋ[1] = Arrays.copyOf(v12, v12.length);
            this.ˎ[1] = v3_1;
            this.ʽ = v0_3;
        }
    }

    final void ˊ(@NonNull Map arg2) {
        this.ॱ(arg2, true);
    }

    static g ˋ(Sensor arg3) {
        return new g(arg3.getType(), arg3.getName(), arg3.getVendor());
    }

    private static double ˎ(@NonNull float[] arg8, @NonNull float[] arg9) {
        int v0 = Math.min(arg8.length, arg9.length);
        double v1 = 0;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            v1 += StrictMath.pow(((double)(arg8[v3] - arg9[v3])), 2);
        }

        return Math.sqrt(v1);
    }

    @NonNull private static List ˎ(@NonNull float[] arg4) {
        ArrayList v0 = new ArrayList(arg4.length);
        int v1 = arg4.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            ((List)v0).add(Float.valueOf(arg4[v2]));
        }

        return ((List)v0);
    }

    private boolean ˎ(int arg2, @NonNull String arg3, @NonNull String arg4) {
        if(this.ॱ == arg2 && (this.ˊ.equals(arg3)) && (this.ˏ.equals(arg4))) {
            return 1;
        }

        return 0;
    }

    private void ˏ() {
        long v3;
        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = 2;
            if(v1 < v2) {
                this.ˋ[v1] = null;
                ++v1;
                continue;
            }

            break;
        }

        while(true) {
            v3 = 0;
            if(v0 >= v2) {
                break;
            }

            this.ˎ[v0] = v3;
            ++v0;
        }

        this.ʽ = 0;
        this.ᐝ = v3;
    }

    public final void ˏ(Map arg2) {
        this.ॱ(arg2, false);
    }

    @NonNull private Map ॱ() {
        HashMap v0 = new HashMap(7);
        ((Map)v0).put("sT", Integer.valueOf(this.ॱ));
        ((Map)v0).put("sN", this.ˊ);
        ((Map)v0).put("sV", this.ˏ);
        float[] v1 = this.ˋ[0];
        if(v1 != null) {
            ((Map)v0).put("sVS", g.ˎ(v1));
        }

        v1 = this.ˋ[1];
        if(v1 != null) {
            ((Map)v0).put("sVE", g.ˎ(v1));
        }

        return ((Map)v0);
    }

    private void ॱ(@NonNull Map arg3, boolean arg4) {
        int v1 = 0;
        if(this.ˋ[0] != null) {
            v1 = 1;
        }

        if(v1 != 0) {
            arg3.put(this, this.ॱ());
            if(arg4) {
                this.ˏ();
                return;
            }
        }
        else if(!arg3.containsKey(this)) {
            arg3.put(this, this.ॱ());
        }
    }
}

