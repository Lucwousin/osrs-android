package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk public class LibraryVersion {
    private static final GmsLogger zzel;
    private static LibraryVersion zzem;
    private ConcurrentHashMap zzen;

    static {
        LibraryVersion.zzel = new GmsLogger("LibraryVersion", "");
        LibraryVersion.zzem = new LibraryVersion();
    }

    @VisibleForTesting protected LibraryVersion() {
        super();
        this.zzen = new ConcurrentHashMap();
    }

    @KeepForSdk public static LibraryVersion getInstance() {
        return LibraryVersion.zzem;
    }

    @KeepForSdk public String getVersion(@NonNull String arg9) {
        String v4_1;
        String v3;
        String v0_2;
        Preconditions.checkNotEmpty(arg9, "Please provide a valid libraryName");
        if(this.zzen.containsKey(arg9)) {
            return this.zzen.get(arg9);
        }

        Properties v0 = new Properties();
        String v1 = null;
        try {
            InputStream v2 = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", arg9));
            if(v2 == null) {
                goto label_46;
            }

            v0.load(v2);
            v0_2 = v0.getProperty("version", v1);
        }
        catch(IOException v0_1) {
            goto label_60;
        }

        try {
            GmsLogger v1_2 = LibraryVersion.zzel;
            StringBuilder v4 = new StringBuilder(String.valueOf(arg9).length() + 12 + String.valueOf(v0_2).length());
            v4.append(arg9);
            v4.append(" version is ");
            v4.append(v0_2);
            v1_2.v("LibraryVersion", v4.toString());
            v1 = v0_2;
            goto label_72;
        }
        catch(IOException v1_1) {
            IOException v7 = v1_1;
            v1 = v0_2;
            v0_1 = v7;
            goto label_60;
        }

        try {
        label_46:
            GmsLogger v0_3 = LibraryVersion.zzel;
            String v2_1 = "LibraryVersion";
            v3 = "Failed to get app version for libraryName: ";
            v4_1 = String.valueOf(arg9);
            v3 = v4_1.length() != 0 ? v3.concat(v4_1) : new String(v3);
            v0_3.e(v2_1, v3);
            goto label_72;
        }
        catch(IOException v0_1) {
        }

    label_60:
        GmsLogger v2_2 = LibraryVersion.zzel;
        v3 = "LibraryVersion";
        v4_1 = "Failed to get app version for libraryName: ";
        String v5 = String.valueOf(arg9);
        v4_1 = v5.length() != 0 ? v4_1.concat(v5) : new String(v4_1);
        v2_2.e(v3, v4_1, ((Throwable)v0_1));
    label_72:
        if(v1 == null) {
            v1 = "UNKNOWN";
            LibraryVersion.zzel.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
        }

        this.zzen.put(arg9, v1);
        return v1;
    }
}

