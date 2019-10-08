package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public final class DynamiteModule {
    @DynamiteApi public class DynamiteLoaderClassLoader {
        @GuardedBy(value="DynamiteLoaderClassLoader.class") public static ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
            super();
        }
    }

    @KeepForSdk public class LoadingException extends Exception {
        LoadingException(String arg1, Throwable arg2, zza arg3) {
            this(arg1, arg2);
        }

        LoadingException(String arg1, zza arg2) {
            this(arg1);
        }

        private LoadingException(String arg1) {
            super(arg1);
        }

        private LoadingException(String arg1, Throwable arg2) {
            super(arg1, arg2);
        }
    }

    public interface VersionPolicy {
        public interface com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zza {
            int getLocalVersion(Context arg1, String arg2);

            int zza(Context arg1, String arg2, boolean arg3) throws LoadingException;
        }

        public final class zzb {
            public int zziq;
            public int zzir;
            public int zzis;

            public zzb() {
                super();
                this.zziq = 0;
                this.zzir = 0;
                this.zzis = 0;
            }
        }

        zzb zza(Context arg1, String arg2, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zza arg3) throws LoadingException;
    }

    final class com.google.android.gms.dynamite.DynamiteModule$zza {
        public Cursor zzin;

        com.google.android.gms.dynamite.DynamiteModule$zza(zza arg1) {
            this();
        }

        private com.google.android.gms.dynamite.DynamiteModule$zza() {
            super();
        }
    }

    final class com.google.android.gms.dynamite.DynamiteModule$zzb implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zza {
        private final int zzio;
        private final int zzip;

        public com.google.android.gms.dynamite.DynamiteModule$zzb(int arg1, int arg2) {
            super();
            this.zzio = arg1;
            this.zzip = 0;
        }

        public final int getLocalVersion(Context arg1, String arg2) {
            return this.zzio;
        }

        public final int zza(Context arg1, String arg2, boolean arg3) {
            return 0;
        }
    }

    @KeepForSdk public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    @KeepForSdk public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    @KeepForSdk public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    @KeepForSdk public static final VersionPolicy PREFER_REMOTE = null;
    @GuardedBy(value="DynamiteModule.class") private static Boolean zzid = null;
    @GuardedBy(value="DynamiteModule.class") private static zzi zzie = null;
    @GuardedBy(value="DynamiteModule.class") private static zzk zzif = null;
    @GuardedBy(value="DynamiteModule.class") private static String zzig = null;
    @GuardedBy(value="DynamiteModule.class") private static int zzih = -1;
    private static final ThreadLocal zzii;
    private static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zza zzij;
    private static final VersionPolicy zzik;
    private static final VersionPolicy zzil;
    private final Context zzim;

    static {
        DynamiteModule.zzii = new ThreadLocal();
        DynamiteModule.zzij = new zza();
        DynamiteModule.PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
        DynamiteModule.zzik = new zzc();
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
        DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
        DynamiteModule.zzil = new zzg();
    }

    private DynamiteModule(Context arg1) {
        super();
        this.zzim = Preconditions.checkNotNull(arg1);
    }

    @KeepForSdk public static int getLocalVersion(Context arg4, String arg5) {
        String v1_1;
        StringBuilder v2;
        try {
            ClassLoader v4_1 = arg4.getApplicationContext().getClassLoader();
            v2 = new StringBuilder(String.valueOf(arg5).length() + 61);
            v2.append("com.google.android.gms.dynamite.descriptors.");
            v2.append(arg5);
            v2.append(".ModuleDescriptor");
            Class v4_2 = v4_1.loadClass(v2.toString());
            Field v1 = v4_2.getDeclaredField("MODULE_ID");
            Field v4_3 = v4_2.getDeclaredField("MODULE_VERSION");
            Object v2_1 = null;
            if(!v1.get(v2_1).equals(arg5)) {
                v1_1 = String.valueOf(v1.get(v2_1));
                StringBuilder v3 = new StringBuilder(String.valueOf(v1_1).length() + 51 + String.valueOf(arg5).length());
                v3.append("Module descriptor id \'");
                v3.append(v1_1);
                v3.append("\' didn\'t match expected id \'");
                v3.append(arg5);
                v3.append("\'");
                Log.e("DynamiteModule", v3.toString());
                return 0;
            }

            return v4_3.getInt(v2_1);
        }
        catch(Exception v4) {
            arg5 = "DynamiteModule";
            v1_1 = "Failed to load module descriptor class: ";
            String v4_4 = String.valueOf(v4.getMessage());
            v4_4 = v4_4.length() != 0 ? v1_1.concat(v4_4) : new String(v1_1);
            Log.e(arg5, v4_4);
        }
        catch(ClassNotFoundException ) {
            v2 = new StringBuilder(String.valueOf(arg5).length() + 45);
            v2.append("Local module descriptor class for ");
            v2.append(arg5);
            v2.append(" not found.");
            Log.w("DynamiteModule", v2.toString());
        }

        return 0;
    }

    @KeepForSdk public final Context getModuleContext() {
        return this.zzim;
    }

    @KeepForSdk public static int getRemoteVersion(Context arg1, String arg2) {
        return DynamiteModule.zza(arg1, arg2, false);
    }

    @KeepForSdk public final IBinder instantiate(String arg5) throws LoadingException {
        try {
            return this.zzim.getClassLoader().loadClass(arg5).newInstance();
        }
        catch(IllegalAccessException v0) {
            String v2 = "Failed to instantiate module class: ";
            arg5 = String.valueOf(arg5);
            arg5 = arg5.length() != 0 ? v2.concat(arg5) : new String(v2);
            throw new LoadingException(arg5, ((Throwable)v0), null);
        }
    }

    @KeepForSdk public static DynamiteModule load(Context arg10, VersionPolicy arg11, String arg12) throws LoadingException {
        DynamiteModule v4_1;
        DynamiteModule v10_1;
        zzb v3;
        Object v0 = DynamiteModule.zzii.get();
        zza v2 = null;
        com.google.android.gms.dynamite.DynamiteModule$zza v1 = new com.google.android.gms.dynamite.DynamiteModule$zza(v2);
        DynamiteModule.zzii.set(v1);
        try {
            v3 = arg11.zza(arg10, arg12, DynamiteModule.zzij);
            int v5 = v3.zziq;
            int v6 = v3.zzir;
            StringBuilder v8 = new StringBuilder(String.valueOf(arg12).length() + 68 + String.valueOf(arg12).length());
            v8.append("Considering local module ");
            v8.append(arg12);
            v8.append(":");
            v8.append(v5);
            v8.append(" and remote module ");
            v8.append(arg12);
            v8.append(":");
            v8.append(v6);
            Log.i("DynamiteModule", v8.toString());
            if(v3.zzis != 0) {
                v5 = -1;
                if(v3.zzis == v5 && v3.zziq == 0) {
                    goto label_112;
                }

                if(v3.zzis == 1 && v3.zzir == 0) {
                    goto label_112;
                }

                if(v3.zzis != v5) {
                    goto label_56;
                }

                v10_1 = DynamiteModule.zze(arg10, arg12);
                goto label_49;
            }

            goto label_112;
        }
        catch(Throwable v10) {
            goto label_131;
        }

    label_49:
        if(v1.zzin != null) {
            v1.zzin.close();
        }

        DynamiteModule.zzii.set(v0);
        return v10_1;
        try {
        label_56:
            if(v3.zzis != 1) {
                goto label_101;
            }

            try {
                v4_1 = DynamiteModule.zza(arg10, arg12, v3.zzir);
            }
            catch(LoadingException v4) {
                try {
                    String v6_1 = "DynamiteModule";
                    String v7 = "Failed to load remote module: ";
                    String v8_1 = String.valueOf(v4.getMessage());
                    v7 = v8_1.length() != 0 ? v7.concat(v8_1) : new String(v7);
                    Log.w(v6_1, v7);
                    if(v3.zziq != 0 && arg11.zza(arg10, arg12, new com.google.android.gms.dynamite.DynamiteModule$zzb(v3.zziq, 0)).zzis == v5) {
                        v10_1 = DynamiteModule.zze(arg10, arg12);
                        goto label_90;
                    }

                    goto label_97;
                }
                catch(Throwable v10) {
                    goto label_131;
                }

            label_90:
                if(v1.zzin != null) {
                    v1.zzin.close();
                }

                DynamiteModule.zzii.set(v0);
                return v10_1;
                try {
                label_97:
                    throw new LoadingException("Remote load failed. No local fallback found.", ((Throwable)v4), v2);
                }
                catch(Throwable v10) {
                    goto label_131;
                }
            }
        }
        catch(Throwable v10) {
            goto label_131;
        }

        if(v1.zzin != null) {
            v1.zzin.close();
        }

        DynamiteModule.zzii.set(v0);
        return v4_1;
        try {
        label_101:
            int v11 = v3.zzis;
            StringBuilder v3_1 = new StringBuilder(0x2F);
            v3_1.append("VersionPolicy returned invalid code:");
            v3_1.append(v11);
            throw new LoadingException(v3_1.toString(), v2);
        label_112:
            v11 = v3.zziq;
            int v12 = v3.zzir;
            StringBuilder v4_2 = new StringBuilder(91);
            v4_2.append("No acceptable module found. Local version is ");
            v4_2.append(v11);
            v4_2.append(" and remote version is ");
            v4_2.append(v12);
            v4_2.append(".");
            throw new LoadingException(v4_2.toString(), v2);
        }
        catch(Throwable v10) {
        label_131:
            if(v1.zzin != null) {
                v1.zzin.close();
            }

            DynamiteModule.zzii.set(v0);
            throw v10;
        }
    }

    public static int zza(Context arg8, String arg9, boolean arg10) {
        int v4_1;
        Boolean v2_2;
        Object v3;
        Field v2;
        Class v1_2;
        Boolean v1;
        Class v0;
        try {
            v0 = DynamiteModule.class;
            __monitor_enter(v0);
        }
        catch(Throwable v9) {
            goto label_101;
        }

        try {
            v1 = DynamiteModule.zzid;
            if(v1 != null) {
                goto label_76;
            }

            try {
                v1_2 = arg8.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                v2 = v1_2.getDeclaredField("sClassLoader");
                __monitor_enter(v1_2);
                v3 = null;
            }
            catch(NoSuchFieldException v1_1) {
                goto label_62;
            }
        }
        catch(Throwable v9) {
            goto label_98;
        }

        try {
            Object v4 = v2.get(v3);
            if(v4 != null) {
                if(v4 == ClassLoader.getSystemClassLoader()) {
                    v2_2 = Boolean.FALSE;
                    goto label_55;
                }

                try {
                    DynamiteModule.zza(((ClassLoader)v4));
                    goto label_20;
                }
                catch(LoadingException ) {
                label_20:
                    v2_2 = Boolean.TRUE;
                    goto label_55;
                }
            }

            if("com.google.android.gms".equals(arg8.getApplicationContext().getPackageName())) {
                v2.set(v3, ClassLoader.getSystemClassLoader());
                v2_2 = Boolean.FALSE;
                goto label_55;
            }

            try {
                v4_1 = DynamiteModule.zzc(arg8, arg9, arg10);
                if(DynamiteModule.zzig != null) {
                    if(DynamiteModule.zzig.isEmpty()) {
                    }
                    else {
                        zzh v5 = new zzh(DynamiteModule.zzig, ClassLoader.getSystemClassLoader());
                        DynamiteModule.zza(((ClassLoader)v5));
                        v2.set(v3, v5);
                        DynamiteModule.zzid = Boolean.TRUE;
                        goto label_46;
                    }
                }

                goto label_49;
            }
            catch(LoadingException ) {
                try {
                    v2.set(v3, ClassLoader.getSystemClassLoader());
                    v2_2 = Boolean.FALSE;
                label_55:
                    __monitor_exit(v1_2);
                    v1 = v2_2;
                    goto label_75;
                label_46:
                    __monitor_exit(v1_2);
                }
                catch(Throwable v2_1) {
                    goto label_59;
                }
            }
        }
        catch(Throwable v2_1) {
            goto label_59;
        }

        try {
            __monitor_exit(v0);
            return v4_1;
        }
        catch(Throwable v9) {
            goto label_98;
        }

        try {
        label_49:
            __monitor_exit(v1_2);
            goto label_50;
        label_59:
            __monitor_exit(((Class)v1));
        }
        catch(Throwable v2_1) {
            goto label_59;
        }

        try {
            throw v2_1;
        }
        catch(Throwable v9) {
        }
        catch(NoSuchFieldException v1_1) {
            try {
            label_62:
                String v1_3 = String.valueOf(v1_1);
                StringBuilder v4_2 = new StringBuilder(String.valueOf(v1_3).length() + 30);
                v4_2.append("Failed to load module via V2: ");
                v4_2.append(v1_3);
                Log.w("DynamiteModule", v4_2.toString());
                v1 = Boolean.FALSE;
            label_75:
                DynamiteModule.zzid = v1;
                goto label_76;
            label_50:
                __monitor_exit(v0);
                return v4_1;
            label_76:
                __monitor_exit(v0);
                goto label_77;
            }
            catch(Throwable v9) {
                try {
                label_98:
                    __monitor_exit(v0);
                }
                catch(Throwable v9) {
                    goto label_98;
                }

                try {
                    throw v9;
                label_77:
                    if(!v1.booleanValue()) {
                        goto label_95;
                    }

                    try {
                        return DynamiteModule.zzc(arg8, arg9, arg10);
                    }
                    catch(LoadingException v9_1) {
                        try {
                            String v10 = "DynamiteModule";
                            String v0_1 = "Failed to retrieve remote module version: ";
                            arg9 = String.valueOf(v9_1.getMessage());
                            arg9 = arg9.length() != 0 ? v0_1.concat(arg9) : new String(v0_1);
                            Log.w(v10, arg9);
                            arg8 = null;
                            return 0;
                        label_95:
                            return DynamiteModule.zzb(arg8, arg9, arg10);
                        }
                        catch(Throwable v9) {
                        label_101:
                            CrashUtils.addDynamiteErrorToDropBox(arg8, v9);
                            throw v9;
                        }
                    }
                }
                catch(Throwable v9) {
                    goto label_101;
                }
            }
        }
    }

    private static DynamiteModule zza(Context arg2, String arg3, int arg4) throws LoadingException {
        Class v0;
        try {
            v0 = DynamiteModule.class;
            __monitor_enter(v0);
        }
        catch(Throwable v3) {
            goto label_20;
        }

        try {
            Boolean v1 = DynamiteModule.zzid;
            __monitor_exit(v0);
            if(v1 == null) {
                goto label_11;
            }

            goto label_5;
        }
        catch(Throwable v3) {
            try {
            label_17:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_17;
            }

            try {
                throw v3;
            label_5:
                if(v1.booleanValue()) {
                    return DynamiteModule.zzc(arg2, arg3, arg4);
                }

                return DynamiteModule.zzb(arg2, arg3, arg4);
            label_11:
                throw new LoadingException("Failed to determine which loading route to use.", null);
            }
            catch(Throwable v3) {
            label_20:
                CrashUtils.addDynamiteErrorToDropBox(arg2, v3);
                throw v3;
            }
        }
    }

    @GuardedBy(value="DynamiteModule.class") private static void zza(ClassLoader arg3) throws LoadingException {
        zzk v3_2;
        zza v0 = null;
        try {
            Object v3_1 = arg3.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor().newInstance();
            if(v3_1 == null) {
                v3_2 = ((zzk)v0);
            }
            else {
                IInterface v1 = ((IBinder)v3_1).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if((v1 instanceof zzk)) {
                    IInterface v3_3 = v1;
                }
                else {
                    zzl v3_4 = new zzl(((IBinder)v3_1));
                }
            }

            DynamiteModule.zzif = v3_2;
            return;
        }
        catch(NoSuchMethodException v3) {
            throw new LoadingException("Failed to instantiate dynamite loader", ((Throwable)v3), v0);
        }
    }

    private static Context zza(Context arg3, String arg4, int arg5, Cursor arg6, zzk arg7) {
        IObjectWrapper v3_1;
        Object v0 = null;
        try {
            ObjectWrapper.wrap(v0);
            if(DynamiteModule.zzai().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                v3_1 = arg7.zzb(ObjectWrapper.wrap(arg3), arg4, arg5, ObjectWrapper.wrap(arg6));
            }
            else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                v3_1 = arg7.zza(ObjectWrapper.wrap(arg3), arg4, arg5, ObjectWrapper.wrap(arg6));
            }

            return ObjectWrapper.unwrap(v3_1);
        }
        catch(Exception v3) {
            arg4 = "DynamiteModule";
            String v5 = "Failed to load DynamiteLoader: ";
            String v3_2 = String.valueOf(v3.toString());
            v3_2 = v3_2.length() != 0 ? v5.concat(v3_2) : new String(v5);
            Log.e(arg4, v3_2);
            return ((Context)v0);
        }
    }

    private static Boolean zzai() {
        Class v0 = DynamiteModule.class;
        __monitor_enter(v0);
        try {
            boolean v1_1 = DynamiteModule.zzih >= 2 ? true : false;
            __monitor_exit(v0);
            return Boolean.valueOf(v1_1);
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_12;
        }

        throw v1;
    }

    private static int zzb(Context arg4, String arg5, boolean arg6) {
        zzi v0 = DynamiteModule.zzj(arg4);
        if(v0 == null) {
            return 0;
        }

        try {
            if(v0.zzaj() >= 2) {
                return v0.zzb(ObjectWrapper.wrap(arg4), arg5, arg6);
            }

            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return v0.zza(ObjectWrapper.wrap(arg4), arg5, arg6);
        }
        catch(RemoteException v4) {
            arg5 = "DynamiteModule";
            String v6 = "Failed to retrieve remote module version: ";
            String v4_1 = String.valueOf(v4.getMessage());
            v4_1 = v4_1.length() != 0 ? v6.concat(v4_1) : new String(v6);
            Log.w(arg5, v4_1);
            return 0;
        }
    }

    private static DynamiteModule zzb(Context arg4, String arg5, int arg6) throws LoadingException {
        IObjectWrapper v4_1;
        StringBuilder v2 = new StringBuilder(String.valueOf(arg5).length() + 51);
        v2.append("Selected remote version of ");
        v2.append(arg5);
        v2.append(", version >= ");
        v2.append(arg6);
        Log.i("DynamiteModule", v2.toString());
        zzi v0 = DynamiteModule.zzj(arg4);
        zza v1 = null;
        if(v0 != null) {
            try {
                if(v0.zzaj() >= 2) {
                    v4_1 = v0.zzb(ObjectWrapper.wrap(arg4), arg5, arg6);
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    v4_1 = v0.zza(ObjectWrapper.wrap(arg4), arg5, arg6);
                }
            }
            catch(RemoteException v4) {
                throw new LoadingException("Failed to load remote module.", ((Throwable)v4), v1);
            }

            if(ObjectWrapper.unwrap(v4_1) != null) {
                return new DynamiteModule(ObjectWrapper.unwrap(v4_1));
            }

            throw new LoadingException("Failed to load remote module.", v1);
        }

        throw new LoadingException("Failed to create IDynamiteLoader.", v1);
    }

    private static int zzc(Context arg8, String arg9, boolean arg10) throws LoadingException {
        Cursor v0_1;
        int v1_1;
        Class v10;
        int v9_3;
        Cursor v9;
        Cursor v8_3;
        zza v0 = null;
        try {
            ContentResolver v1 = arg8.getContentResolver();
            String v8_2 = arg10 ? "api_force_staging" : "api";
            StringBuilder v2 = new StringBuilder(String.valueOf(v8_2).length() + 42 + String.valueOf(arg9).length());
            v2.append("content://com.google.android.gms.chimera/");
            v2.append(v8_2);
            v2.append("/");
            v2.append(arg9);
            v8_3 = v1.query(Uri.parse(v2.toString()), null, null, null, null);
            if(v8_3 == null) {
                goto label_67;
            }
        }
        catch(Throwable v8) {
            goto label_87;
        }
        catch(Exception v8_1) {
            v9 = ((Cursor)v0);
            goto label_78;
        }

        try {
            if(v8_3.moveToFirst()) {
                v9_3 = v8_3.getInt(0);
                if(v9_3 > 0) {
                    v10 = DynamiteModule.class;
                    __monitor_enter(v10);
                    v1_1 = 2;
                    goto label_36;
                }

                goto label_55;
            }

            goto label_67;
        }
        catch(Throwable v9_1) {
            goto label_59;
        }
        catch(Exception v9_2) {
            goto label_63;
        }

        try {
        label_36:
            DynamiteModule.zzig = v8_3.getString(v1_1);
            v1_1 = v8_3.getColumnIndex("loaderVersion");
            if(v1_1 >= 0) {
                DynamiteModule.zzih = v8_3.getInt(v1_1);
            }

            __monitor_exit(v10);
            goto label_44;
        }
        catch(Throwable v9_1) {
            try {
            label_53:
                __monitor_exit(v10);
            }
            catch(Throwable v9_1) {
                goto label_53;
            }

            try {
                throw v9_1;
            label_44:
                Object v10_1 = DynamiteModule.zzii.get();
                if(v10_1 == null) {
                    goto label_55;
                }

                if(((com.google.android.gms.dynamite.DynamiteModule$zza)v10_1).zzin != null) {
                    goto label_55;
                }

                ((com.google.android.gms.dynamite.DynamiteModule$zza)v10_1).zzin = v8_3;
                v8_3 = ((Cursor)v0);
            }
            catch(Throwable v9_1) {
                goto label_59;
            }
            catch(Exception v9_2) {
                goto label_63;
            }
        }

    label_55:
        if(v8_3 != null) {
            v8_3.close();
        }

        return v9_3;
        try {
        label_67:
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.", v0);
        }
        catch(Throwable v9_1) {
        label_59:
            v0_1 = v8_3;
            v8 = v9_1;
        }
        catch(Exception v9_2) {
        label_63:
            Exception v7 = v9_2;
            v9 = v8_3;
            v8_1 = v7;
            try {
            label_78:
                if((v8_1 instanceof LoadingException)) {
                    throw v8_1;
                }

                throw new LoadingException("V2 version check failed", ((Throwable)v8_1), v0);
            }
            catch(Throwable v8) {
                v0_1 = v9;
            }
        }

    label_87:
        if(v0_1 != null) {
            v0_1.close();
        }

        throw v8;
    }

    private static DynamiteModule zzc(Context arg4, String arg5, int arg6) throws LoadingException {
        zza v0_1;
        zzk v1;
        StringBuilder v2 = new StringBuilder(String.valueOf(arg5).length() + 51);
        v2.append("Selected remote version of ");
        v2.append(arg5);
        v2.append(", version >= ");
        v2.append(arg6);
        Log.i("DynamiteModule", v2.toString());
        Class v0 = DynamiteModule.class;
        __monitor_enter(v0);
        try {
            v1 = DynamiteModule.zzif;
            __monitor_exit(v0);
            v0_1 = null;
            if(v1 == null) {
                goto label_40;
            }
        }
        catch(Throwable v4) {
            try {
            label_45:
                __monitor_exit(v0_1);
            }
            catch(Throwable v4) {
                goto label_45;
            }

            throw v4;
        }

        Object v2_1 = DynamiteModule.zzii.get();
        if(v2_1 != null && ((com.google.android.gms.dynamite.DynamiteModule$zza)v2_1).zzin != null) {
            arg4 = DynamiteModule.zza(arg4.getApplicationContext(), arg5, arg6, ((com.google.android.gms.dynamite.DynamiteModule$zza)v2_1).zzin, v1);
            if(arg4 != null) {
                return new DynamiteModule(arg4);
            }
            else {
                throw new LoadingException("Failed to get module context", v0_1);
            }
        }

        throw new LoadingException("No result cursor", v0_1);
    label_40:
        throw new LoadingException("DynamiteLoaderV2 was not cached.", v0_1);
    }

    private static DynamiteModule zze(Context arg3, String arg4) {
        String v0 = "DynamiteModule";
        String v1 = "Selected local version of ";
        arg4 = String.valueOf(arg4);
        arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
        Log.i(v0, arg4);
        return new DynamiteModule(arg3.getApplicationContext());
    }

    private static zzi zzj(Context arg5) {
        zzj v5_4;
        IInterface v5_3;
        Class v0 = DynamiteModule.class;
        __monitor_enter(v0);
        try {
            if(DynamiteModule.zzie != null) {
                __monitor_exit(v0);
                return DynamiteModule.zzie;
            }

            zzi v2 = null;
            if(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(arg5) != 0) {
                __monitor_exit(v0);
                return v2;
            }

            try {
                Object v5_2 = arg5.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if(v5_2 == null) {
                    v5_3 = ((IInterface)v2);
                }
                else {
                    IInterface v1 = ((IBinder)v5_2).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if((v1 instanceof zzi)) {
                        v5_3 = v1;
                    }
                    else {
                        v5_4 = new zzj(((IBinder)v5_2));
                    }
                }

                if((((IInterface)v5_4)) == null) {
                    goto label_48;
                }

                DynamiteModule.zzie = ((zzi)v5_4);
            }
            catch(Exception v5_1) {
                String v1_1 = "DynamiteModule";
                String v3 = "Failed to load IDynamiteLoader from GmsCore: ";
                String v5_5 = String.valueOf(v5_1.getMessage());
                v5_5 = v5_5.length() != 0 ? v3.concat(v5_5) : new String(v3);
                Log.e(v1_1, v5_5);
                goto label_48;
            }

            __monitor_exit(v0);
            return ((zzi)v5_4);
        label_48:
            __monitor_exit(v0);
            return v2;
        label_51:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_51;
        }

        throw v5;
    }
}

