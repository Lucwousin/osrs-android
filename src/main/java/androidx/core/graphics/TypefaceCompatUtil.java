package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel$MapMode;
import java.nio.channels.FileChannel;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class TypefaceCompatUtil {
    private static final String CACHE_FILE_PREFIX = ".font";
    private static final String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
        super();
    }

    public static void closeQuietly(Closeable arg0) {
        if(arg0 != null) {
            try {
                arg0.close();
                return;
            }
            catch(IOException ) {
                return;
            }
        }
    }

    @Nullable @RequiresApi(value=19) public static ByteBuffer copyToDirectBuffer(Context arg1, Resources arg2, int arg3) {
        ByteBuffer v2_1;
        File v1 = TypefaceCompatUtil.getTempFile(arg1);
        ByteBuffer v0 = null;
        if(v1 == null) {
            return v0;
        }

        try {
            if(TypefaceCompatUtil.copyToFile(v1, arg2, arg3)) {
                goto label_8;
            }
        }
        catch(Throwable v2) {
            goto label_12;
        }

        v1.delete();
        return v0;
        try {
        label_8:
            v2_1 = TypefaceCompatUtil.mmap(v1);
        }
        catch(Throwable v2) {
        label_12:
            v1.delete();
            throw v2;
        }

        v1.delete();
        return v2_1;
    }

    public static boolean copyToFile(File arg5, InputStream arg6) {
        FileOutputStream v2_2;
        int v5_2;
        FileOutputStream v3;
        StrictMode$ThreadPolicy v0 = StrictMode.allowThreadDiskWrites();
        Closeable v2 = null;
        try {
            v3 = new FileOutputStream(arg5, false);
            v5_2 = 0x400;
            goto label_6;
        }
        catch(Throwable v5) {
        }
        catch(IOException v5_1) {
            goto label_25;
            try {
            label_6:
                byte[] v5_3 = new byte[v5_2];
                while(true) {
                    int v2_1 = arg6.read(v5_3);
                    if(v2_1 == -1) {
                        break;
                    }

                    v3.write(v5_3, 0, v2_1);
                }
            }
            catch(Throwable v5) {
                goto label_17;
            }
            catch(IOException v5_1) {
                goto label_20;
            }

            TypefaceCompatUtil.closeQuietly(((Closeable)v3));
            StrictMode.setThreadPolicy(v0);
            return 1;
        label_20:
            v2_2 = v3;
            try {
            label_25:
                Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + v5_1.getMessage());
            }
            catch(Throwable v5) {
                goto label_37;
            }
        }

        TypefaceCompatUtil.closeQuietly(v2);
        StrictMode.setThreadPolicy(v0);
        return 0;
    label_17:
        v2_2 = v3;
    label_37:
        TypefaceCompatUtil.closeQuietly(v2);
        StrictMode.setThreadPolicy(v0);
        throw v5;
    }

    public static boolean copyToFile(File arg0, Resources arg1, int arg2) {
        boolean v0_1;
        Closeable v1_1;
        InputStream v1;
        try {
            v1 = arg1.openRawResource(arg2);
        }
        catch(Throwable v0) {
            v1_1 = null;
            goto label_8;
        }

        try {
            v0_1 = TypefaceCompatUtil.copyToFile(arg0, v1);
            goto label_2;
        }
        catch(Throwable v0) {
        }

    label_8:
        TypefaceCompatUtil.closeQuietly(v1_1);
        throw v0;
    label_2:
        TypefaceCompatUtil.closeQuietly(((Closeable)v1));
        return v0_1;
    }

    @Nullable public static File getTempFile(Context arg5) {
        String v0_1 = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int v1;
        for(v1 = 0; v1 < 100; ++v1) {
            File v3 = arg5.getCacheDir();
            StringBuilder v4 = new StringBuilder();
            v4.append(v0_1);
            v4.append(v1);
            File v2 = new File(v3, v4.toString());
            try {
                if(!v2.createNewFile()) {
                    goto label_27;
                }
            }
            catch(IOException ) {
                goto label_27;
            }

            return v2;
        label_27:
        }

        return null;
    }

    @Nullable @RequiresApi(value=19) private static ByteBuffer mmap(File arg9) {
        MappedByteBuffer v9_1;
        FileInputStream v1;
        ByteBuffer v0 = null;
        try {
            v1 = new FileInputStream(arg9);
        }
        catch(IOException ) {
            return v0;
        }

        try {
            FileChannel v2 = v1.getChannel();
            v9_1 = v2.map(FileChannel$MapMode.READ_ONLY, 0, v2.size());
            goto label_8;
        }
        catch(Throwable v9) {
            v2_1 = ((Throwable)v0);
        }
        catch(Throwable v9) {
            try {
                throw v9;
            }
            catch(Throwable v2_1) {
                Throwable v8 = v2_1;
                v2_1 = v9;
                v9 = v8;
            }
        }

        if(v2_1 == null) {
            goto label_25;
        }

        try {
            v1.close();
            goto label_26;
        }
        catch(IOException ) {
        }
        catch(Throwable v1_1) {
            try {
                v2_1.addSuppressed(v1_1);
                goto label_26;
            label_25:
                v1.close();
            label_26:
                throw v9;
            label_8:
                v1.close();
                return ((ByteBuffer)v9_1);
            }
            catch(IOException ) {
                return v0;
            }
        }
    }

    @Nullable @RequiresApi(value=19) public static ByteBuffer mmap(Context arg8, CancellationSignal arg9, Uri arg10) {
        Throwable v7;
        MappedByteBuffer v10_1;
        FileInputStream v9_1;
        ParcelFileDescriptor v8_1;
        ContentResolver v8 = arg8.getContentResolver();
        ByteBuffer v0 = null;
        try {
            v8_1 = v8.openFileDescriptor(arg10, "r", arg9);
            if(v8_1 != null) {
                goto label_8;
            }

            if(v8_1 != null) {
                v8_1.close();
            }
        }
        catch(IOException ) {
            return v0;
        }

        return v0;
        try {
        label_8:
            v9_1 = new FileInputStream(v8_1.getFileDescriptor());
        }
        catch(Throwable v9) {
            goto label_38;
        }
        catch(Throwable v9) {
            goto label_41;
        }

        try {
            FileChannel v1 = v9_1.getChannel();
            v10_1 = v1.map(FileChannel$MapMode.READ_ONLY, 0, v1.size());
            goto label_16;
        }
        catch(Throwable v10) {
            v1_1 = ((Throwable)v0);
        }
        catch(Throwable v10) {
            try {
                throw v10;
            }
            catch(Throwable v1_1) {
                v7 = v1_1;
                v1_1 = v10;
                v10 = v7;
            }
        }

        if(v1_1 == null) {
            goto label_35;
        }

        try {
            v9_1.close();
            goto label_36;
        }
        catch(Throwable v9) {
        }
        catch(Throwable v9) {
            try {
                v1_1.addSuppressed(v9);
                goto label_36;
            label_35:
                v9_1.close();
            label_36:
                throw v10;
            label_16:
                v9_1.close();
                if(v8_1 == null) {
                    goto label_19;
                }

                goto label_18;
            }
            catch(Throwable v9) {
            label_38:
                v10 = ((Throwable)v0);
            }
            catch(Throwable v9) {
                try {
                label_41:
                    throw v9;
                }
                catch(Throwable v10) {
                    v7 = v10;
                    v10 = v9;
                    v9 = v7;
                }
            }
        }

        if(v8_1 == null) {
            goto label_54;
        }
        else if(v10 != null) {
            try {
                v8_1.close();
                goto label_54;
            }
            catch(IOException ) {
            }
            catch(Throwable v8_2) {
                try {
                    v10.addSuppressed(v8_2);
                    goto label_54;
                label_53:
                    v8_1.close();
                label_54:
                    throw v9;
                label_18:
                    v8_1.close();
                }
                catch(IOException ) {
                    return v0;
                }
            }
        }
        else {
            goto label_53;
        }

    label_19:
        return ((ByteBuffer)v10_1);
    }
}

