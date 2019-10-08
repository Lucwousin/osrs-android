package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public final class CrashUtils {
    private static final String[] zzge;
    private static DropBoxManager zzgf;
    private static boolean zzgg;
    private static int zzgh;
    @GuardedBy(value="CrashUtils.class") private static int zzgi;
    @GuardedBy(value="CrashUtils.class") private static int zzgj;

    static {
        CrashUtils.zzge = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
        CrashUtils.zzgf = null;
        CrashUtils.zzgg = false;
        CrashUtils.zzgh = -1;
        CrashUtils.zzgi = 0;
        CrashUtils.zzgj = 0;
    }

    public CrashUtils() {
        super();
    }

    @KeepForSdk public static boolean addDynamiteErrorToDropBox(Context arg1, Throwable arg2) {
        return CrashUtils.zza(arg1, arg2, 0x20000000);
    }

    private static boolean zza(Context arg1, Throwable arg2, int arg3) {
        try {
            Preconditions.checkNotNull(arg1);
            Preconditions.checkNotNull(arg2);
            return 0;
        }
        catch(Exception v1) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", ((Throwable)v1));
            return 0;
        }
    }
}

