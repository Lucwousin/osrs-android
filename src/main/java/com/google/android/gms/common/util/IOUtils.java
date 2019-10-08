package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@KeepForSdk @ShowFirstParty public final class IOUtils {
    private IOUtils() {
        super();
    }

    @KeepForSdk public static void closeQuietly(@Nullable ParcelFileDescriptor arg0) {
        if(arg0 == null) {
            return;
        }

        try {
            arg0.close();
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    @KeepForSdk public static void closeQuietly(@Nullable Closeable arg0) {
        if(arg0 == null) {
            return;
        }

        try {
            arg0.close();
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    @KeepForSdk public static long copyStream(InputStream arg1, OutputStream arg2) throws IOException {
        return IOUtils.zza(arg1, arg2, false);
    }

    @KeepForSdk public static long copyStream(InputStream arg7, OutputStream arg8, boolean arg9, int arg10) throws IOException {
        byte[] v0 = new byte[arg10];
        long v1 = 0;
        try {
            while(true) {
                int v4 = arg7.read(v0, 0, arg10);
                if(v4 == -1) {
                    break;
                }

                v1 += ((long)v4);
                arg8.write(v0, 0, v4);
            }
        }
        catch(Throwable v10) {
            if(arg9) {
                IOUtils.closeQuietly(((Closeable)arg7));
                IOUtils.closeQuietly(((Closeable)arg8));
            }

            throw v10;
        }

        if(arg9) {
            IOUtils.closeQuietly(((Closeable)arg7));
            IOUtils.closeQuietly(((Closeable)arg8));
        }

        return v1;
    }

    @KeepForSdk public static boolean isGzipByteBuffer(byte[] arg3) {
        if(arg3.length > 1 && ((arg3[1] & 0xFF) << 8 | arg3[0] & 0xFF) == 0x8B1F) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static byte[] readInputStreamFully(InputStream arg1) throws IOException {
        return IOUtils.readInputStreamFully(arg1, true);
    }

    @KeepForSdk public static byte[] readInputStreamFully(InputStream arg1, boolean arg2) throws IOException {
        ByteArrayOutputStream v0 = new ByteArrayOutputStream();
        IOUtils.zza(arg1, ((OutputStream)v0), arg2);
        return v0.toByteArray();
    }

    @KeepForSdk public static byte[] toByteArray(InputStream arg4) throws IOException {
        ByteArrayOutputStream v0 = new ByteArrayOutputStream();
        Preconditions.checkNotNull(arg4);
        Preconditions.checkNotNull(v0);
        byte[] v1 = new byte[0x1000];
        while(true) {
            int v2 = arg4.read(v1);
            if(v2 == -1) {
                break;
            }

            ((OutputStream)v0).write(v1, 0, v2);
        }

        return v0.toByteArray();
    }

    private static long zza(InputStream arg1, OutputStream arg2, boolean arg3) throws IOException {
        return IOUtils.copyStream(arg1, arg2, arg3, 0x400);
    }
}

