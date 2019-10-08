package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzzv extends zzyz {
    public abstract class zza extends zzzv implements zzaar {
        protected zzzr zzbui;

        public zza() {
            super();
            this.zzbui = zzzr.zztx();
        }
    }

    public final class zzb {
        private static final enum int zzbuj = 1;
        private static final enum int zzbuk = 2;
        public static final enum int zzbul = 3;
        private static final enum int zzbum = 4;
        private static final enum int zzbun = 5;
        public static final enum int zzbuo = 6;
        public static final enum int zzbup = 7;
        public static final enum int zzbur;
        private static final enum int zzbus;
        private static final enum int zzbuu;
        private static final enum int zzbuv;

        static {
            zzb.zzbuq = new int[]{1, 2, 3, 4, 5, 6, 7};
            zzb.zzbur = 1;
            zzb.zzbus = 2;
            zzb.zzbut = new int[]{1, 2};
            zzb.zzbuu = 1;
            zzb.zzbuv = 2;
            zzb.zzbuw = new int[]{1, 2};
        }
    }

    protected zzabp zzbuf;
    private int zzbug;
    private static Map zzbuh;

    static {
        zzzv.zzbuh = new ConcurrentHashMap();
    }

    public zzzv() {
        super();
        this.zzbuf = zzabp.zzvf();
        this.zzbug = -1;
    }

    public boolean equals(Object arg3) {
        if(this == (((zzzv)arg3))) {
            return 1;
        }

        if(!this.zza(6, null, null).getClass().isInstance(arg3)) {
            return 0;
        }

        return zzaay.zzus().zzt(this).equals(this, arg3);
    }

    public int hashCode() {
        if(this.zzbta != 0) {
            return this.zzbta;
        }

        this.zzbta = zzaay.zzus().zzt(this).hashCode(this);
        return this.zzbta;
    }

    public String toString() {
        return zzaas.zza(((zzaaq)this), super.toString());
    }

    static Object zza(Method arg0, Object arg1, Object[] arg2) {
        try {
            return arg0.invoke(arg1, arg2);
        }
        catch(InvocationTargetException v0) {
            Throwable v0_2 = v0.getCause();
            if(!(v0_2 instanceof RuntimeException)) {
                if((v0_2 instanceof Error)) {
                    throw v0_2;
                }

                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", v0_2);
            }

            throw v0_2;
        }
        catch(IllegalAccessException v0_1) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", ((Throwable)v0_1));
        }
    }

    protected abstract Object zza(int arg1, Object arg2, Object arg3);

    static zzzv zzf(Class arg3) {
        Object v0 = zzzv.zzbuh.get(arg3);
        if(v0 == null) {
            try {
                Class.forName(arg3.getName(), true, arg3.getClassLoader());
            }
            catch(ClassNotFoundException v3) {
                throw new IllegalStateException("Class initialization cannot fail.", ((Throwable)v3));
            }

            v0 = zzzv.zzbuh.get(arg3);
        }

        if(v0 == null) {
            String v1 = "Unable to get default instance for: ";
            String v3_1 = String.valueOf(arg3.getName());
            v3_1 = v3_1.length() != 0 ? v1.concat(v3_1) : new String(v1);
            throw new IllegalStateException(v3_1);
        }

        return ((zzzv)v0);
    }
}

