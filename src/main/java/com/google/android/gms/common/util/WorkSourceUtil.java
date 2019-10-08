package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk public class WorkSourceUtil {
    private static final int zzhh;
    private static final Method zzhi;
    private static final Method zzhj;
    private static final Method zzhk;
    private static final Method zzhl;
    private static final Method zzhm;
    private static final Method zzhn;
    private static final Method zzho;

    static {
        WorkSourceUtil.zzhh = Process.myUid();
        WorkSourceUtil.zzhi = WorkSourceUtil.zzw();
        WorkSourceUtil.zzhj = WorkSourceUtil.zzx();
        WorkSourceUtil.zzhk = WorkSourceUtil.zzy();
        WorkSourceUtil.zzhl = WorkSourceUtil.zzz();
        WorkSourceUtil.zzhm = WorkSourceUtil.zzaa();
        WorkSourceUtil.zzhn = WorkSourceUtil.zzab();
        WorkSourceUtil.zzho = WorkSourceUtil.zzac();
    }

    private WorkSourceUtil() {
        super();
    }

    @Nullable @KeepForSdk public static WorkSource fromPackage(Context arg3, @Nullable String arg4) {
        String v1;
        String v3_1;
        ApplicationInfo v3;
        WorkSource v0 = null;
        if(arg3 != null && arg3.getPackageManager() != null) {
            if(arg4 == null) {
            }
            else {
                try {
                    v3 = Wrappers.packageManager(arg3).getApplicationInfo(arg4, 0);
                    if(v3 != null) {
                        goto label_21;
                    }
                }
                catch(PackageManager$NameNotFoundException ) {
                    v3_1 = "WorkSourceUtil";
                    v1 = "Could not find package: ";
                    arg4 = String.valueOf(arg4);
                    arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
                    Log.e(v3_1, arg4);
                    return v0;
                }

                v3_1 = "WorkSourceUtil";
                v1 = "Could not get applicationInfo from package: ";
                arg4 = String.valueOf(arg4);
                arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
                Log.e(v3_1, arg4);
                return v0;
            label_21:
                return WorkSourceUtil.zza(v3.uid, arg4);
            }
        }

        return v0;
    }

    @KeepForSdk public static WorkSource fromPackageAndModuleExperimentalPi(Context arg7, String arg8, String arg9) {
        WorkSource v0 = null;
        if(arg7 != null && arg7.getPackageManager() != null && arg9 != null) {
            if(arg8 == null) {
            }
            else {
                int v7 = WorkSourceUtil.zzd(arg7, arg8);
                if(v7 < 0) {
                    return v0;
                }
                else {
                    v0 = new WorkSource();
                    if(WorkSourceUtil.zzhn != null) {
                        if(WorkSourceUtil.zzho == null) {
                        }
                        else {
                            try {
                                Object v1 = WorkSourceUtil.zzhn.invoke(v0);
                                int v5 = 2;
                                if(v7 != WorkSourceUtil.zzhh) {
                                    Method v3 = WorkSourceUtil.zzho;
                                    v3.invoke(v1, Integer.valueOf(v7), arg8);
                                }

                                Method v7_2 = WorkSourceUtil.zzho;
                                v7_2.invoke(v1, Integer.valueOf(WorkSourceUtil.zzhh), arg9);
                            }
                            catch(Exception v7_1) {
                                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", ((Throwable)v7_1));
                            }

                            return v0;
                        }
                    }

                    WorkSourceUtil.zza(v0, v7, arg8);
                    return v0;
                }
            }
        }

        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return v0;
    }

    @KeepForSdk public static List getNames(@Nullable WorkSource arg5) {
        int v0 = 0;
        int v1 = arg5 == null ? 0 : WorkSourceUtil.zza(arg5);
        if(v1 == 0) {
            return Collections.emptyList();
        }

        ArrayList v2 = new ArrayList();
        while(v0 < v1) {
            String v3 = WorkSourceUtil.zza(arg5, v0);
            if(!Strings.isEmptyOrWhitespace(v3)) {
                ((List)v2).add(v3);
            }

            ++v0;
        }

        return ((List)v2);
    }

    @KeepForSdk public static boolean hasWorkSourcePermission(Context arg3) {
        if(arg3 == null) {
            return 0;
        }

        if(arg3.getPackageManager() == null) {
            return 0;
        }

        if(Wrappers.packageManager(arg3).checkPermission("android.permission.UPDATE_DEVICE_STATS", arg3.getPackageName()) == 0) {
            return 1;
        }

        return 0;
    }

    private static WorkSource zza(int arg1, String arg2) {
        WorkSource v0 = new WorkSource();
        WorkSourceUtil.zza(v0, arg1, arg2);
        return v0;
    }

    private static void zza(WorkSource arg4, int arg5, @Nullable String arg6) {
        if(WorkSourceUtil.zzhj != null) {
            if(arg6 == null) {
                arg6 = "";
            }

            try {
                WorkSourceUtil.zzhj.invoke(arg4, Integer.valueOf(arg5), arg6);
                return;
            }
            catch(Exception v4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable)v4));
                return;
            }
        }

        if(WorkSourceUtil.zzhi != null) {
            try {
                WorkSourceUtil.zzhi.invoke(arg4, Integer.valueOf(arg5));
                return;
            }
            catch(Exception v4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable)v4));
            }
        }
    }

    private static int zza(WorkSource arg3) {
        if(WorkSourceUtil.zzhk != null) {
            try {
                return WorkSourceUtil.zzhk.invoke(arg3).intValue();
            }
            catch(Exception v3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable)v3));
            }
        }

        return 0;
    }

    @Nullable private static String zza(WorkSource arg3, int arg4) {
        if(WorkSourceUtil.zzhm != null) {
            try {
                return WorkSourceUtil.zzhm.invoke(arg3, Integer.valueOf(arg4));
            }
            catch(Exception v3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable)v3));
            }
        }

        return null;
    }

    private static Method zzaa() {
        Method v0;
        if(PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                v0 = WorkSource.class.getMethod("getName", Integer.TYPE);
            }
            catch(Exception ) {
            label_11:
                v0 = null;
            }
        }
        else {
            goto label_11;
        }

        return v0;
    }

    private static final Method zzab() {
        if(PlatformVersion.isAtLeastP()) {
            try {
                Method v0_1 = WorkSource.class.getMethod("createWorkChain");
                return v0_1;
            }
            catch(Exception v0) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", ((Throwable)v0));
            }
        }

        return null;
    }

    @SuppressLint(value={"PrivateApi"}) private static final Method zzac() {
        if(PlatformVersion.isAtLeastP()) {
            try {
                Method v0_1 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
                return v0_1;
            }
            catch(Exception v0) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", ((Throwable)v0));
            }
        }

        return null;
    }

    private static int zzd(Context arg3, String arg4) {
        String v1;
        String v3_1;
        ApplicationInfo v3;
        int v0 = -1;
        try {
            v3 = Wrappers.packageManager(arg3).getApplicationInfo(arg4, 0);
            if(v3 != null) {
                goto label_16;
            }
        }
        catch(PackageManager$NameNotFoundException ) {
            v3_1 = "WorkSourceUtil";
            v1 = "Could not find package: ";
            arg4 = String.valueOf(arg4);
            arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
            Log.e(v3_1, arg4);
            return v0;
        }

        v3_1 = "WorkSourceUtil";
        v1 = "Could not get applicationInfo from package: ";
        arg4 = String.valueOf(arg4);
        arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
        Log.e(v3_1, arg4);
        return v0;
    label_16:
        return v3.uid;
    }

    private static Method zzw() {
        Method v0;
        try {
            v0 = WorkSource.class.getMethod("add", Integer.TYPE);
        }
        catch(Exception ) {
            v0 = null;
        }

        return v0;
    }

    private static Method zzx() {
        Method v0;
        if(PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                v0 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            }
            catch(Exception ) {
            label_14:
                v0 = null;
            }
        }
        else {
            goto label_14;
        }

        return v0;
    }

    private static Method zzy() {
        Method v0;
        try {
            v0 = WorkSource.class.getMethod("size");
        }
        catch(Exception ) {
            v0 = null;
        }

        return v0;
    }

    private static Method zzz() {
        Method v0;
        try {
            v0 = WorkSource.class.getMethod("get", Integer.TYPE);
        }
        catch(Exception ) {
            v0 = null;
        }

        return v0;
    }
}

