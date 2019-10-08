package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@KeepForSdk public class ProcessUtils {
    private static String zzhd;
    private static int zzhe;

    static {
    }

    private ProcessUtils() {
        super();
    }

    @KeepForSdk @Nullable public static String getMyProcessName() {
        if(ProcessUtils.zzhd == null) {
            if(ProcessUtils.zzhe == 0) {
                ProcessUtils.zzhe = Process.myPid();
            }

            ProcessUtils.zzhd = ProcessUtils.zzd(ProcessUtils.zzhe);
        }

        return ProcessUtils.zzhd;
    }

    @Nullable private static String zzd(int arg4) {
        String v1_1;
        BufferedReader v4_1;
        String v0 = null;
        if(arg4 <= 0) {
            return v0;
        }

        int v1 = 25;
        try {
            StringBuilder v2 = new StringBuilder(v1);
            v2.append("/proc/");
            v2.append(arg4);
            v2.append("/cmdline");
            v4_1 = ProcessUtils.zzj(v2.toString());
        }
        catch(Throwable v4) {
            goto label_24;
        }
        catch(IOException ) {
            Closeable v4_2 = ((Closeable)v0);
            goto label_27;
        }

        try {
            v1_1 = v4_1.readLine().trim();
            goto label_15;
        }
        catch(Throwable v0_1) {
            Throwable v3 = v0_1;
            BufferedReader v0_2 = v4_1;
            v4 = v3;
        }
        catch(IOException ) {
        label_27:
            IOUtils.closeQuietly(((Closeable)v4_1));
            return v0;
        }

    label_24:
        IOUtils.closeQuietly(((Closeable)v0));
        throw v4;
    label_15:
        IOUtils.closeQuietly(((Closeable)v4_1));
        return v1_1;
    }

    private static BufferedReader zzj(String arg3) throws IOException {
        BufferedReader v1;
        StrictMode$ThreadPolicy v0 = StrictMode.allowThreadDiskReads();
        try {
            v1 = new BufferedReader(new FileReader(arg3));
        }
        catch(Throwable v3) {
            StrictMode.setThreadPolicy(v0);
            throw v3;
        }

        StrictMode.setThreadPolicy(v0);
        return v1;
    }
}

